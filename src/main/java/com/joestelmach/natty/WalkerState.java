package com.joestelmach.natty;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.TimeZone;

/**
 * @author Joe Stelmach
 */
public class WalkerState {
  private GregorianCalendar _calendar;
  private TimeZone _defaultTimeZone;
  private int _currentYear;
  private static final int TWO_DIGIT_YEAR_CENTURY_THRESHOLD = 20;
  private List<Date> _currentDateTimes;
  
  /**
   * Creates a new WalkerState representing the start of
   * the next hour from the current time
   */
  public WalkerState() {
    resetCalender();
    _currentDateTimes = new ArrayList<Date>();
  }
  
  public void setDefaultTimeZone(final TimeZone zone) {
    _defaultTimeZone = zone;
  }
  
  /**
   * seeks to a specified day of the week in the past or future.
   * 
   * @param direction the direction to seek: two possibilities 
   *    '<' go backward 
   *    '>' go forward
   *    
   * @param seekType the type of seek to perform (by_day or by_week)
   *     by_day means we seek to the very next occurrence of the given day
   *     by_week means we seek to the first occurrence of the given day week in the
   *     next (or previous,) week (or multiple of next or previous week depending
   *     on the seek amount.)
   *     
   * @param amount the amount to seek.  Must be guaranteed to parse as an integer
   *     
   * @param dayOfWeek the day of the week to seek to, represented as an integer from 
   *     1 to 7 (1 being Sunday, 7 being Saturday.) Must be guaranteed to parse as an Integer
   */
  public void seekToDayOfWeek(String direction, String seekType, String seekAmount, String dayOfWeek) {
    int dayOfWeekInt = Integer.parseInt(dayOfWeek);
    int seekAmountInt = Integer.parseInt(seekAmount);
    assert(direction.equals("<") || direction.equals(">"));
    assert(seekType.equals("by_day") || seekType.equals("by_week"));
    assert(dayOfWeekInt >= 1 && dayOfWeekInt <= 7);
    
    int sign = direction.equals(">") ? 1 : -1;
    if(seekType.equals("by_week")) {
      // set our calendar to this weeks requested day of the week,
      // then add or subtract the week(s)
      _calendar.set(Calendar.DAY_OF_WEEK, dayOfWeekInt);
      _calendar.add(Calendar.DAY_OF_YEAR, seekAmountInt * 7 * sign);
    }
    
    else if(seekType.equals("by_day")) {
      // find the closest day
      do {
        _calendar.roll(Calendar.DAY_OF_YEAR, sign);
      } while(_calendar.get(Calendar.DAY_OF_WEEK) != dayOfWeekInt);
      
      // now add/subtract any additional days
      if(seekAmountInt > 0) {
        _calendar.add(Calendar.WEEK_OF_YEAR, (seekAmountInt - 1) * sign);
      }
    }
  }
  
  /**
   * Seeks to the given day within the current month 
   * @param dayOfMonth the day of the month to seek to, represented as an integer
   *     from 1 to 31. Must be guaranteed to parse as an Integer.  If this day is
   *     beyond the last day of the current month, the actual last day of the month
   *     will be used.
   */
  public void seekToDayOfMonth(String dayOfMonth) {
    int dayOfMonthInt = Integer.parseInt(dayOfMonth);
    assert(dayOfMonthInt >= 1 && dayOfMonthInt <= 31);
    dayOfMonthInt = Math.min(dayOfMonthInt, _calendar.getActualMaximum(Calendar.DAY_OF_MONTH));
    _calendar.set(Calendar.DAY_OF_MONTH, dayOfMonthInt);
  }
  
  /**
   * 
   * @param year
   */
  public void seekToYear(String year) {
    int yearInt = Integer.parseInt(year);
    assert(yearInt > 0 && yearInt < 9999);
    
    // two digit years require us to choose a reasonable century.
    if(year.length() == 2) {
      int century = (yearInt > ((_currentYear - 2000) + TWO_DIGIT_YEAR_CENTURY_THRESHOLD)) ? 1900 : 2000;
      yearInt = yearInt + century;
    }
    
    _calendar.set(Calendar.YEAR, yearInt);
  }
  
  /**
   * seeks to a particular month
   * 
   * @param direction the direction to seek: two possibilities 
   *    '<' go backward 
   *    '>' go forward
   *    
   * @param amount the amount to seek.  Must be guaranteed to parse as an integer
   *     
   * @param month the month to seek to.  Must be guaranteed to parse as an integer
   *     between 1 and 12 
   */
  public void seekToMonth(String direction, String seekAmount, String month) {
    int seekAmountInt = Integer.parseInt(seekAmount);
    int monthInt = Integer.parseInt(month);
    assert(direction.equals("<") || direction.equals(">"));
    assert(monthInt >= 1 && monthInt <= 12);
    
    // set the day to the first of month. This step is necessary because if we seek to the 
    // current day of a month whose number of days is less than the current day, we will 
    // pushed into the next month.
    _calendar.set(Calendar.DAY_OF_MONTH, 1);
    
    // seek to the appropriate year
    int currentMonth = _calendar.get(Calendar.MONTH) + 1;
    int sign = direction.equals(">") ? 1 : -1;
    int numYearsToShift = seekAmountInt + 
      (currentMonth <= monthInt ? sign > 0 ? -1 : 0 : sign > 0 ? 0 : -1);
    _calendar.add(Calendar.YEAR, (numYearsToShift * sign));
    
    // now set the month
    _calendar.set(Calendar.MONTH, monthInt -1);
  }
  
  /**
   * seeks by a span of time (weeks, months, etc)
   * 
   * @param direction the direction to seek: two possibilities 
   *    '<' go backward 
   *    '>' go forward
   *    
   * @param amount the amount to seek.  Must be guaranteed to parse as an integer
   *     
   * @param span
   */
  public void seekBySpan(String direction, String seekAmount, String span) {
    if(span.startsWith("by_")) span = span.substring(3);
    int seekAmountInt = Integer.parseInt(seekAmount);
    assert(direction.equals("<") || direction.equals(">"));
    assert(span.equals("day") || span.equals("week") || span.equals("month") || span.equals("year"));
    
    int sign = direction.equals(">") ? 1 : -1;
    int field = 
      span.equals("day") ? Calendar.DAY_OF_YEAR : 
      span.equals("week") ? Calendar.WEEK_OF_YEAR :
      span.equals("month") ? Calendar.MONTH :
      span.equals("year") ? Calendar.YEAR : 
      null;
    if(field > 0) _calendar.add(field, seekAmountInt * sign);
  }
  
  /**
   * 
   * @param index
   * @param dayOfWeek
   * @param month
   */
  public void setDayOfWeekIndex(String index, String dayOfWeek) {
    int indexInt = Integer.parseInt(index);
    assert(indexInt > 0 && indexInt < 6);
    
    int dayOfWeekInt = Integer.parseInt(dayOfWeek);
    assert(dayOfWeekInt >= 1 && dayOfWeekInt <= 7);
    
    // seek to the first day of the current month
    _calendar.set(Calendar.DAY_OF_MONTH, 1);
    
    // if we already passed the day we're looking for, we add a week
    if(_calendar.get(Calendar.DAY_OF_WEEK) > dayOfWeekInt) {
      _calendar.add(Calendar.WEEK_OF_MONTH, 1);
    }
    
    // now move to the requested day within the week
    _calendar.set(Calendar.DAY_OF_WEEK, dayOfWeekInt);
    int currentMonth = _calendar.get(Calendar.MONTH);
    
    // add weeks for our requested index
    _calendar.add(Calendar.WEEK_OF_MONTH, indexInt - 1);
    
    // if we bled into the next month, push back a week
    if(currentMonth != _calendar.get(Calendar.MONTH)) {
      _calendar.add(Calendar.WEEK_OF_MONTH, -1);
    }
  }
  
  /**
   * 
   * @param month the month to set.  Must be guaranteed to parse as an integer
   *     between 1 and 12
   *     
   * @param dayOfMonth the day of month to set.  Must be guaranteed to parse as an
   *     integer between 1 and 31
   *     
   * @param dayOfWeek the day of the week.  This is optional and will only be used
   *     when no year is given.  If the current year's month and day does not fall on the
   *     given day of week, we walk backwards in 1 year iterations until we find the first
   *     such date.  If given, must be guaranteed to parse as an integer between 1 and 7.
   *     
   * @param year the year to set (optional).  If present, must be guaranteed to 
   *     parse as an integer between 0 and 9999
   */
  public void setExplicitDate(String month, String dayOfMonth, String dayOfWeek, String year) {
    int monthInt = Integer.parseInt(month);
    assert(monthInt > 0 && monthInt <= 12);
    
    int dayOfMonthInt = Integer.parseInt(dayOfMonth);
    assert(dayOfMonthInt > 0 && dayOfMonthInt <= 31);
    
    _calendar.set(Calendar.MONTH, monthInt - 1);
    _calendar.set(Calendar.DAY_OF_MONTH, dayOfMonthInt);
    
    if(year != null) {
      seekToYear(year);
    }
    
    // if no year is given, but a day of week is, we ensure that the resulting
    // date falls on the given day of week.
    else if(dayOfWeek != null) {
      int dayOfWeekInt = Integer.parseInt(dayOfWeek);
      assert(dayOfWeekInt >= 1 && dayOfWeekInt <= 7);
      while(_calendar.get(Calendar.DAY_OF_WEEK) != dayOfWeekInt) {
        _calendar.roll(Calendar.YEAR, false);
      }
    }
  }
  
  /**
   * Sets the the time of day
   * 
   * @param hours the hours to set.  Must be guaranteed to parse as an 
   *     integer between 0 and 23
   *     
   * @param minutes the minutes to set.  Must be guaranteed to parse as
   *     an integer between 0 and 59
   *     
   * @param seconds the optional seconds to set.  Must be guaranteed to parse as
   *     an integer between 0 and 59
   *     
   * @param amPm the meridian indicator to use.  Must be either 'am' or 'pm'
   * 
   * @param zone the time zone to use in one of two formats:
   *     - zoneinfo format (America/New_York, America/Los_Angeles, etc)
   *     - GMT offset (+05:00, -0500, +5, etc)
   */
  public void setExplicitTime(String hours, String minutes, String seconds, String amPm, String zoneString) {
    int hoursInt = Integer.parseInt(hours);
    int minutesInt = Integer.parseInt(minutes);
    assert(amPm == null || amPm.equals("am") || amPm.equals("pm"));
    assert(hoursInt >= 0 && hoursInt <= 23); 
    assert(minutesInt >= 0 && minutesInt < 60); 
    
    // reset milliseconds to 0
    _calendar.set(Calendar.MILLISECOND, 0);
    
    // if no explicit zone is given, we use our own
    TimeZone zone = null;
    if(zoneString != null) {
      if(zoneString.startsWith("+") || zoneString.startsWith("-")) {
        zoneString = "GMT" + zoneString;
      }
      zone = TimeZone.getTimeZone(zoneString);
    }
    
    _calendar.setTimeZone(zone != null ? zone : _defaultTimeZone);
    
    _calendar.set(Calendar.HOUR_OF_DAY, hoursInt);
    // hours greater than 12 are in 24-hour time
    if(hoursInt <= 12) {
      int amPmInt = amPm == null ? 
        (hoursInt > 12 ? Calendar.PM : Calendar.AM) :
        amPm.equals("pm") ? Calendar.PM : Calendar.AM;
      _calendar.set(Calendar.AM_PM, amPmInt);
      
      // calendar is whacky at 12 o'clock (must use 0)
      if(hoursInt == 12) hoursInt = 0;
      _calendar.set(Calendar.HOUR, hoursInt);
    }
    
    if(seconds != null) {
      int secondsInt = Integer.parseInt(seconds);
      assert(secondsInt >= 0 && secondsInt < 60); 
      _calendar.set(Calendar.SECOND, secondsInt);
    }
    
    _calendar.set(Calendar.MINUTE, minutesInt);
  }
  
  /**
   * 
   */
  public void captureDateTime() {
    Date date = _calendar.getTime();
    _currentDateTimes.add(date);
    resetCalender();
  }
  
  /**
   * @return the list of date times found 
   */
  public List<Date> getDateTimes() {
    return _currentDateTimes;
  }
  
  /**
   *  Resets the calendar
   */
  private void resetCalender() {
    _calendar = new GregorianCalendar();
    _currentYear = _calendar.get(Calendar.YEAR);
  }
}