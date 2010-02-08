package com.natty.parse;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

/**
 * Represents a seek-able date and time.
 * @author Joe Stelmach
 *
 */
public class SeekableDateTime {
  private GregorianCalendar _calendar;
  
  /**
   * Creates a new SeekableDateTime representing the start of u
   * the next hour from the current time
   */
  public SeekableDateTime() {
    _calendar = new GregorianCalendar();
    _calendar.setTimeZone(TimeZone.getTimeZone("US/Eastern"));
    //_calendar.set(Calendar.HOUR, _calendar.get(Calendar.HOUR) + 1);
    //_calendar.set(Calendar.MINUTE, 0);
    _calendar.set(Calendar.SECOND, 0);
    _calendar.set(Calendar.MILLISECOND, 0);
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
    System.out.println("seeking to day: " + direction + " " + " " + seekType + " " + seekAmount + " " + dayOfWeek);
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
    System.out.println("seeking: " + direction + " " + seekAmount + " " + month);
    int seekAmountInt = Integer.parseInt(seekAmount);
    int monthInt = Integer.parseInt(month);
    assert(direction.equals("<") || direction.equals(">"));
    assert(monthInt >= 1 && monthInt <= 12);
    
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
   * @param month the month to set.  Must be guaranteed to parse as an integer
   *     between 1 and 12
   *     
   * @param day the day of month to set.  Must be guaranteed to parse as an
   *     integer between 1 and 31
   *     
   * @param year the year to set (optional).  If present, must be guaranteed to 
   *     parse as an integer between 0 and 9999
   */
  public void setExplicitDate(String month, String day, String year) {
	System.out.println("setting explicit date");
    int monthInt = Integer.parseInt(month);
    assert(monthInt > 0 && monthInt <= 12);
    
    int dayInt = Integer.parseInt(day);
    assert(dayInt > 0 && dayInt <= 31);
    
    int yearInt = -1;
    if(year != null) {
      yearInt = Integer.parseInt(year);
      assert(yearInt > 0 && yearInt < 9999);
    }
    
    _calendar.set(Calendar.MONTH, monthInt - 1);
    _calendar.set(Calendar.DAY_OF_MONTH, dayInt);
    if(yearInt > 0) _calendar.set(Calendar.YEAR, yearInt);
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
   * @param amPm the meridian indicator to use.  Must be either 'am' or 'pm'
   */
  public void setExplicitTime(String hours, String minutes, String amPm) {
    int hoursInt = Integer.parseInt(hours);
    int minutesInt = Integer.parseInt(minutes);
    assert(amPm == null || amPm.equals("am") || amPm.equals("pm"));
    assert(hoursInt >= 0 && hoursInt <= 23); 
    assert(minutesInt >= 0 && minutesInt < 60); 
    
    // hours greater than 12 are in 24-hour time
    if(hoursInt > 12) {
      _calendar.set(Calendar.HOUR_OF_DAY, hoursInt);
    }
    
    // otherwise, we specify the meridian indicator. PM is used when 
    // no indicator is given
    else {
      _calendar.set(Calendar.HOUR, hoursInt);
      _calendar.set(Calendar.AM_PM, 
          (amPm == null || amPm.equals("pm")) ? Calendar.PM : Calendar.AM);
    }
    
    _calendar.set(Calendar.MINUTE, minutesInt);
  }
  
  /**
   * Return the date currently represented
   */
  public Date getDate() {
    return _calendar.getTime();
  }
}