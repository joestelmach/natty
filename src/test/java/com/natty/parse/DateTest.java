package com.natty.parse;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import junit.framework.Assert;

import org.junit.Test;

import com.joestelmach.natty.CalendarSource;
import com.joestelmach.natty.ParseResult;
import com.joestelmach.natty.Parser;

/**
 * Runs the parser through the various date formats 
 * 
 * @author Joe Stelmach
 */
public class DateTest extends AbstractTest {
  
  @Test
  public void testFormal() {
    validateDate("1978-01-28", 1, 28, 1978);
    validateDate("2009-10-10", 10, 10, 2009);
    validateDate("1980-1-2", 1, 2, 1980);
    validateDate("12/12/12", 12, 12, 2012);
    validateDate("3/4", 3, 4, Calendar.getInstance().get(Calendar.YEAR));
    validateDate("sun, 11/21/2010", 11, 21, 2010);
  }
  
  @Test
  public void testRelaxed() {
    validateDate("oct 1, 1980", 10, 1, 1980);
    validateDate("oct. 1, 1980", 10, 1, 1980);
    validateDate("oct 1,1980", 10, 1, 1980);
    validateDate("1st oct in the year '89", 10, 1, 1989);
    validateDate("thirty first of december 80", 12, 31, 1980);
    validateDate("the first of december in the year 1980", 12, 1, 1980);
    validateDate("the 2 of february in the year 1980", 2, 2, 1980);
    validateDate("the 2nd of february in the year 1980", 2, 2, 1980);
    validateDate("the second of february in the year 1980", 2, 2, 1980);
    validateDate("jan. 2nd", 1, 2, Calendar.getInstance().get(Calendar.YEAR));
    validateDate("sun, nov 21 2010", 11, 21, 2010);
  }
  
  @Test
  public void testExplicitRelative() throws Exception {
    Date reference = DateFormat.getDateInstance(DateFormat.SHORT).parse("2/28/2011");
    CalendarSource.setBaseDate(reference);
    
    validateDate("final thursday in april", 4, 28, 2011);
    validateDate("final thurs in sep", 9, 29, 2011);
    validateDate("4th february ", 2, 4, 2011);
  }
  
  @Test
  public void testRelative() throws Exception {
    Date reference = DateFormat.getDateInstance(DateFormat.SHORT).parse("2/28/2011");
    CalendarSource.setBaseDate(reference);
    
    validateDate("yesterday", 2, 27, 2011);
    validateDate("tomorrow", 3, 1, 2011);
    validateDate("in 3 days", 3, 3, 2011);
    validateDate("3 days ago", 2, 25, 2011);
    validateDate("in 3 weeks", 3, 21, 2011);
    validateDate("four weeks ago", 1, 31, 2011);
    validateDate("in 3 months", 5, 28, 2011);
    validateDate("three months ago", 11, 28, 2010);
    validateDate("in 3 years", 2, 28, 2014);
    validateDate("seven years ago", 2, 28, 2004);
    validateDate("60 years ago", 2, 28, 1951);
    validateDate("32 days ago", 1, 27, 2011);
    validateDate("next monday", 3, 7, 2011);
    validateDate("next mon", 3, 7, 2011);
    validateDate("4 mondays from now", 3, 28, 2011);
    validateDate("4 mondays from today", 3, 28, 2011);
    validateDate("next weekend", 3, 12, 2011);
    validateDate("six mondays ago", 1, 17, 2011);
    validateDate("last monday", 2, 21, 2011);
    validateDate("last mon", 2, 21, 2011);
    validateDate("this past mon", 2, 21, 2011);
    validateDate("this coming mon", 3, 7, 2011);
    validateDate("this upcoming mon", 3, 7, 2011);
    validateDate("next thurs", 3, 10, 2011);
    validateDate("next month", 3, 28, 2011);
    validateDate("last month", 1, 28, 2011);
    validateDate("next week", 3, 7, 2011);
    validateDate("last week", 2, 21, 2011);
    validateDate("next year", 2, 28, 2012);
    validateDate("last year", 2, 28, 2010);
    validateDate("tues this week", 3, 1, 2011);
    validateDate("tuesday this week", 3, 1, 2011);
    validateDate("tuesday next week", 3, 8, 2011);
  }
  
  @Test
  public void testRange() throws Exception {
    Date reference = DateFormat.getDateInstance(DateFormat.SHORT).parse("1/02/2011");
    CalendarSource.setBaseDate(reference);
    
    List<Date> dates = parseCollection("monday to friday");
    Assert.assertEquals(2, dates.size());
    validateDate(dates.get(0), 1, 3, 2011);
    validateDate(dates.get(1), 1, 7, 2011);
    
    dates = parseCollection("1999-12-31 to tomorrow");
    Assert.assertEquals(2, dates.size());
    validateDate(dates.get(0), 12, 31, 1999);
    validateDate(dates.get(1), 1, 3, 2011);
    
    dates = parseCollection("now to 2010-01-01");
    Assert.assertEquals(2, dates.size());
    validateDate(dates.get(0), 1, 2, 2011);
    validateDate(dates.get(1), 1, 1, 2010);
    
    dates = parseCollection("jan 1 to 2");
    Assert.assertEquals(2, dates.size());
    validateDate(dates.get(0), 1, 1, 2011);
    validateDate(dates.get(1), 1, 2, 2011);
    
    dates = parseCollection("may 2nd to 5th");
    Assert.assertEquals(2, dates.size());
    validateDate(dates.get(0), 5, 2, 2011);
    validateDate(dates.get(1), 5, 5, 2011);
    
    dates = parseCollection("1/3 to 2/3");
    Assert.assertEquals(2, dates.size());
    validateDate(dates.get(0), 1, 3, 2011);
    validateDate(dates.get(1), 2, 3, 2011);
    
    dates = parseCollection("2/3 to in one week");
    Assert.assertEquals(2, dates.size());
    validateDate(dates.get(0), 2, 3, 2011);
    validateDate(dates.get(1), 1, 9, 2011);
    
    dates = parseCollection("first day of may to last day of may");
    Assert.assertEquals(2, dates.size());
    validateDate(dates.get(0), 5, 1, 2011);
    validateDate(dates.get(1), 5, 31, 2011);
    
    dates = parseCollection("feb 28th or 2 days after");
    Assert.assertEquals(2, dates.size());
    validateDate(dates.get(0), 2, 28, 2011);
    validateDate(dates.get(1), 3, 2, 2011);
  }
  
  public static void main(String[] args) throws Exception{
    String inputString = "3/3 21:00 to in 5 days";
    Parser parser = new Parser();
    ParseResult result = parser.parse(inputString);
    System.out.println(result.getSyntaxTree());
    System.out.println(result.getDates());
  }
}
