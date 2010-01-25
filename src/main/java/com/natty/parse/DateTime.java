package com.natty.parse;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class DateTime {
  private GregorianCalendar _calendar;
  
  public DateTime() {
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
  public void seek(String direction, String amount) {
    assert(direction.equals("<") || direction.equals(">"));
    
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
    assert(direction.equals("<") || direction.equals(">"));
    assert(seekType.equals("by_day") || seekType.equals("by_week"));
    
    int requestedDay = Integer.parseInt(dayOfWeek);
    assert(requestedDay >= 1 && requestedDay <= 7);
    
    boolean isForward = direction.equals(">");
    
    int seekMultiplier = Integer.parseInt(seekAmount) * (isForward ? 1 : -1);
    if(seekType.equals("by_week")) {
      _calendar.set(Calendar.DAY_OF_WEEK, requestedDay);
      _calendar.add(Calendar.WEEK_OF_YEAR, seekMultiplier * 7);
    }
    
    else if(seekType.equals("by_day")) {
      do {
        _calendar.roll(Calendar.DAY_OF_YEAR, seekMultiplier);
      } while(_calendar.get(Calendar.DAY_OF_WEEK) != requestedDay - 1);
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
    assert(direction.equals("<") || direction.equals(">"));
    assert(span.equals("day") || span.equals("week") || span.equals("month") || span.equals("year"));
    
  }
  
  public void getDate() {
    System.out.println(_calendar.getTime());
  }
}