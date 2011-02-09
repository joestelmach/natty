package com.joestelmach.natty;

import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Responsible for generating new Calendars that represent
 * the current point in time.  This is neccessary so we can
 * manipulate what the software thinks is the 'current' 
 * time, which may be different than the system time
 * 
 * @author Joe Stelmach
 */
public class CalendarSource {
  private static Date _baseDate;
  
  public static void setBaseDate(Date baseDate) {
    _baseDate = baseDate;
  }

  public static GregorianCalendar getCurrentCalendar() {
    GregorianCalendar calendar = new GregorianCalendar();
    if(_baseDate != null) {
      calendar.setTime(_baseDate);
    }
    return calendar;
  }
}
