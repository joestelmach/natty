package com.joestelmach.natty;

import org.junit.Assert;
import org.junit.Before;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * 
 * @author Joe Stelmach
 */
public abstract class AbstractTest {
  private static Calendar _calendar;
  protected static CalendarSource calendarSource;
  protected static Parser _parser;


  public static void initCalendarAndParser() {
    _calendar = Calendar.getInstance();
    _parser = new Parser();
  }

  /**
   * Resets the calendar source time before each test
   */
  @Before
  public void before() {
    calendarSource = new CalendarSource();
  }
  
  /**
   * Parses the given value into a collection of dates
   * 
   * @param value
   * @return
   */
  protected List<Date> parseCollection(Date referenceDate, String value) {
    List<DateGroup> dateGroup = _parser.parse(value, referenceDate);
    return dateGroup.isEmpty() ? new ArrayList<Date>() : dateGroup.get(0).getDates();
  }
  
  /**
   * Parses the given value, asserting that one and only one date is produced.
   * 
   * @param value
   * @return
   */
  protected Date parseSingleDate(String value, Date referenceDate) {
    List<Date> dates = parseCollection(referenceDate, value);
    Assert.assertEquals(1, dates.size());
    return dates.get(0);
  }

  /**
   * Parses the given value, asserting that no date is produced.
   * 
   * @param value
   */
  protected void ensureNoDate(Date referenceDate, String value) {
    List<DateGroup> dateGroup = _parser.parse(value, referenceDate);
    Assert.assertTrue(dateGroup.isEmpty());
  }
  
  /**
   * Asserts that the given string value parses down to the given 
   * month, day, and year values.
   * 
   * @param value
   * @param month
   * @param day
   * @param year
   */
  protected void validateDate(Date referenceDate, String value, int month, int day, int year) {
    Date date = parseSingleDate(value, referenceDate);
    validateDate(date, month, day, year);
  }

  protected void validateDate(String value, int month, int day, int year) {
    validateDate(new Date(), value, month, day, year);
  }
  
  /**
   * Asserts that the given date contains the given attributes
   * 
   * @param date
   * @param month
   * @param day
   * @param year
   */
  protected void validateDate(Date date, int month, int day, int year) {
    _calendar.setTime(date);
    Assert.assertEquals(month -1, _calendar.get(Calendar.MONTH));
    Assert.assertEquals(day, _calendar.get(Calendar.DAY_OF_MONTH));
    Assert.assertEquals(year, _calendar.get(Calendar.YEAR));
  }
  
  /**
   * 
   * Asserts that the given string value parses down to the given 
   * hours, minutes, and seconds
   * 
   * @param value
   * @param hours
   * @param minutes
   * @param seconds
   */
  protected void validateTime(Date referenceDate, String value, int hours, int minutes, int seconds) {
    Date date = parseSingleDate(value, referenceDate);
    validateTime(date, hours, minutes, seconds);
  }
  
  /**
   * 
   * Asserts that the given date contains the given time attributes
   * 
   * @param date 
   * @param hours
   * @param minutes
   * @param seconds
   */
  protected void validateTime(Date date, int hours, int minutes, int seconds) {
    _calendar.setTime(date);
    Assert.assertEquals(hours, _calendar.get(Calendar.HOUR_OF_DAY));
    Assert.assertEquals(minutes, _calendar.get(Calendar.MINUTE));
    Assert.assertEquals(seconds, _calendar.get(Calendar.SECOND));
  }
  
  /**
   * 
   * Asserts that the given string value parses down to the given 
   * month, day, year, hours, minutes, and seconds
   * 
   * @param value
   * @param month
   * @param day
   * @param year
   * @param hours
   * @param minutes
   * @param seconds
   */
  protected void validateDateTime(Date referenceDate, String value, int month, int day, int year,
      int hours, int minutes, int seconds) {
    
    Date date = parseSingleDate(value, referenceDate);
    validateDateTime(date, month, day, year, hours, minutes, seconds);
  }
  
  /**
   * Asserts that the given date contains the given attributes
   * 
   * @param date
   * @param month
   * @param day
   * @param year
   * @param hours
   * @param minutes
   * @param seconds
   */
  protected void validateDateTime(Date date, int month, int day, int year, 
      int hours, int minutes, int seconds) {

    _calendar.setTime(date);
    Assert.assertEquals(month -1, _calendar.get(Calendar.MONTH));
    Assert.assertEquals(day, _calendar.get(Calendar.DAY_OF_MONTH));
    Assert.assertEquals(year, _calendar.get(Calendar.YEAR));
    Assert.assertEquals(hours, _calendar.get(Calendar.HOUR_OF_DAY));
    Assert.assertEquals(minutes, _calendar.get(Calendar.MINUTE));
    Assert.assertEquals(seconds, _calendar.get(Calendar.SECOND));
  }
}
