package com.natty.parse;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Represents a seek-able date and time.
 * @author Joe Stelmach
 *
 */
public class SeekableDateTime {
  private GregorianCalendar _calendar;
  
  /**
   * Creates a new SeekableDateTime from the current date and time
   */
  public SeekableDateTime() {
    _calendar = new GregorianCalendar();
  }
  
  /**
   * seeks the specified amount of days, in the specified direction
   * @param direction the direction to seek: two possibilities 
   *    '<' go backward 
   *    '>' go forward
   *    
   * @param amount the amount to seek.  should be guaranteed to parse as an integer
   */
  public void seek(String direction, String seekAmount) {
    int seekAmountInt = Integer.parseInt(seekAmount);
    assert(direction.equals("<") || direction.equals(">"));
    
    int sign = direction.equals(">") ? 1 : -1;
    _calendar.add(Calendar.DAY_OF_YEAR, seekAmountInt * sign);
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
      _calendar.add(Calendar.WEEK_OF_YEAR, (seekAmountInt - 1) * sign);
    }
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
   */
  public void getDate() {
    System.out.println(_calendar.getTime());
  }
}