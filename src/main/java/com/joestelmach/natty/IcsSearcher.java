package com.joestelmach.natty;

import net.fortuna.ical4j.data.CalendarBuilder;
import net.fortuna.ical4j.data.ParserException;
import net.fortuna.ical4j.model.Component;
import net.fortuna.ical4j.model.DateTime;
import net.fortuna.ical4j.model.Period;
import net.fortuna.ical4j.model.PeriodList;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStream;
import java.text.ParseException;
import java.util.*;

public class IcsSearcher {
  private static final String GMT = "GMT";
  private static final String VEVENT = "VEVENT";
  private static final String SUMMARY = "SUMMARY";
  private static final Logger _logger = LoggerFactory.getLogger(IcsSearcher.class);
  private net.fortuna.ical4j.model.Calendar _holidayCalendar;
  private String _calendarFileName;
  private TimeZone _timeZone;
  private CalendarSource calendarSource;

  public IcsSearcher(String calendarFileName, TimeZone timeZone, Date referenceDate) {
    calendarSource = new CalendarSource(referenceDate);
    _calendarFileName = calendarFileName;
    _timeZone = timeZone;
  }

  public IcsSearcher(String calendarFileName, TimeZone timeZone) {
    this(calendarFileName, timeZone, new Date());
  }

  public Map<Integer, Date> findDates(int startYear, int endYear, String eventSummary) {
    Map<Integer, Date> holidays = new HashMap<Integer, Date>(); 
    
    if(_holidayCalendar == null) {
      InputStream fin = WalkerState.class.getResourceAsStream(_calendarFileName);
      try {
        _holidayCalendar = new CalendarBuilder().build(fin);
        
      } catch (IOException e) {
        _logger.error("Couln't open {}", _calendarFileName);
        return holidays;
        
      } catch (ParserException e) {
        _logger.error("Couln't parse {}", _calendarFileName);
        return holidays;
      }
    }
    
    Period period = null;
    try {
      DateTime from = new DateTime(startYear + "0101T000000Z");
      DateTime to = new DateTime(endYear + "1231T000000Z");;
      period = new Period(from, to);
      
    } catch (ParseException e) {
      _logger.error("Invalid start or end year: {}, {}", startYear, endYear, e);
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
          Calendar utcCal = calendarSource.getCurrentCalendar();
          utcCal.setTimeZone(TimeZone.getTimeZone(GMT));
          utcCal.setTime(date);
          
          // use the year, month and day components of our UTC date to form a new local date
          Calendar localCal = calendarSource.getCurrentCalendar();
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
