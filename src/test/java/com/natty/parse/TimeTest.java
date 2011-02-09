package com.natty.parse;

import java.text.DateFormat;

import org.junit.Test;

import com.joestelmach.natty.CalendarSource;

/**
 * Runs the parser through the various time formats 
 * 
 * @author Joe Stelmach
 */
public class TimeTest extends AbstractTest {
  
  /**
   * Runs the parser through the various time formats 
   * @throws Exception
   */
  @Test
  public void testFormal() throws Exception {
    validateTime("0600h", 6, 0, 0);
    validateTime("06:00h", 6, 0, 0);
    validateTime("06:00 hours", 6, 0, 0);
    validateTime("0000", 0, 0, 0);
    validateTime("0700h", 7, 0, 0);
    validateTime("6pm", 18, 0, 0);
    validateTime("5:30 a.m.", 5, 30, 0);
    validateTime("5", 5, 0, 0);
    validateTime("12:59", 12, 59, 0);
    validateTime("23:59:28", 23, 59, 28);
    validateTime("00:00", 0, 0, 0);
    validateTime("10:00am", 10, 0, 0);
    validateTime("10a", 10, 0, 0);
    validateTime("10am", 10, 0, 0);
    validateTime("10", 10, 0, 0);
    validateTime("8p", 20, 0, 0);
    validateTime("8pm", 20, 0, 0);
    validateTime("8 pm", 20, 0, 0);
  }
  
  @Test
  public void testRelaxed() throws Exception {
    validateTime("noon", 12, 0, 0);
    validateTime("afternoon", 12, 0, 0);
    validateTime("midnight", 0, 0, 0);
    validateTime("mid-night", 0, 0, 0);
    validateTime("6 in the morning", 6, 0, 0);
    validateTime("4 in the afternoon", 16, 0, 0);
    validateTime("evening", 19, 0, 0);
    validateTime("10 hours before noon", 2, 0, 0);
    validateTime("10 hours before midnight", 14, 0, 0);
    validateTime("5 hours after noon", 17, 0, 0);
    validateTime("5 hours after midnight", 5, 0, 0);
  }
  
  @Test
  public void testRelative() throws Exception {
    CalendarSource.setBaseDate(DateFormat.getTimeInstance(DateFormat.SHORT).parse("12:00 pm"));
    validateTime("in 5 seconds", 12, 0, 5);
    validateTime("in 5 minutes", 12, 5, 0);
    validateTime("in 5 hours", 17, 0, 0);
    validateTime("4 seconds from now", 12, 0, 4);
    validateTime("4 minutes from now", 12, 4, 0);
    validateTime("4 hours from now", 16, 0, 0);
  }
}
