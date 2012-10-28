package com.joestelmach.natty;

import java.io.IOException;
import java.io.InputStream;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.TimeZone;
import java.util.logging.Level;
import java.util.logging.Logger;

import net.fortuna.ical4j.data.CalendarBuilder;
import net.fortuna.ical4j.data.ParserException;
import net.fortuna.ical4j.model.Component;
import net.fortuna.ical4j.model.DateTime;
import net.fortuna.ical4j.model.Period;
import net.fortuna.ical4j.model.PeriodList;

public class IcsSearcher {
  private static final String GMT = "GMT";
  private static final String VEVENT = "VEVENT";
  private static final String SUMMARY = "SUMMARY";
  private static final Logger _logger = Logger.getLogger("com.joestelmach.natty");
  private net.fortuna.ical4j.model.Calendar _holidayCalendar;
  private String _calendarFileName;
  private TimeZone _timeZone;
  
  public IcsSearcher(String calendarFileName, TimeZone timeZone) {
    _calendarFileName = calendarFileName;
    _timeZone = timeZone;
  }

  public Map<Integer, Date> findDates(int startYear, int endYear, String eventSummary) {
    Map<Integer, Date> holidays = new HashMap<Integer, Date>(); 
    
    if(_holidayCalendar == null) {
      InputStream fin = WalkerState.class.getResourceAsStream(_calendarFileName);
      try {
        _holidayCalendar = new CalendarBuilder().build(fin);
        
      } catch (IOException e) {
        _logger.severe("Couln't open " + _calendarFileName);
        return holidays;
        
      } catch (ParserException e) {
        _logger.severe("Couln't parse " + _calendarFileName);
        return holidays;
      }
    }
    
    Period period = null;
    try {
      DateTime from = new DateTime(startYear + "0101T000000Z");
      DateTime to = new DateTime(endYear + "1231T000000Z");;
      period = new Period(from, to);
      
    } catch (ParseException e) {
      _logger.log(Level.SEVERE, "Invalid start or end year: " + startYear + ", " + endYear, e);
      return holidays;
    }
    
    for (Object  component : _holidayCalendar.getComponents(VEVENT)) {
      Component vevent = (Component) component;
      String summary = vevent.getProperty(SUMMARY).getValue();
      if(summary.equals(eventSummary)) {
        PeriodList list = vevent.calculateRecurrenceSet(period);
        for(Object p : list) {
          DateTime date = ((Period) p).getStart();
          
          // this date is at the date of the holiday at 12 AM UTC
          Calendar utcCal = CalendarSource.getCurrentCalendar();
          utcCal.setTimeZone(TimeZone.getTimeZone(GMT));
          utcCal.setTime(date);
          
          // use the year, month and day components of our UTC date to form a new local date
          Calendar localCal = CalendarSource.getCurrentCalendar();
          localCal.setTimeZone(_timeZone);
          localCal.set(Calendar.YEAR, utcCal.get(Calendar.YEAR));
          localCal.set(Calendar.MONTH, utcCal.get(Calendar.MONTH));
          localCal.set(Calendar.DAY_OF_MONTH, utcCal.get(Calendar.DAY_OF_MONTH));
          
          holidays.put(localCal.get(Calendar.YEAR), localCal.getTime());
        }
      }
    }
  
    return holidays;
  }

}
