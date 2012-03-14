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
  private static ThreadLocal<Date> _baseDate = new ThreadLocal<Date>();

  public static void setBaseDate(Date baseDate) {
    _baseDate.set(baseDate);
  }

  public static GregorianCalendar getCurrentCalendar() {
    GregorianCalendar calendar = new GregorianCalendar();
    if(_baseDate.get() != null) {
      calendar.setTime(_baseDate.get());
    }
    return calendar;
  }
}
