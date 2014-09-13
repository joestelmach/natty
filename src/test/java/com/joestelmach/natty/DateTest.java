package com.joestelmach.natty;

import junit.framework.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.text.DateFormat;
import java.util.*;
import java.util.Map.Entry;
import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Runs the parser through the various date formats 
 * 
 * @author Joe Stelmach
 */
public class DateTest extends AbstractTest {
  @BeforeClass
  public static void oneTime() {
    Locale.setDefault(Locale.US);
    TimeZone.setDefault(TimeZone.getTimeZone("US/Eastern"));
    initCalendarAndParser();
  }
  
  @Test
  public void testFormal() {
    validateDate("1978-01-28", 1, 28, 1978);
    validateDate("2009-10-10", 10, 10, 2009);
    validateDate("1980-1-2", 1, 2, 1980);
    validateDate("12/12/12", 12, 12, 2012);
    validateDate("3/4", 3, 4, Calendar.getInstance().get(Calendar.YEAR));
    validateDate("sun, 11/21/2010", 11, 21, 2010);
    validateDate("in october 2006", 10, 1, 2006);
    validateDate("feb 1979", 2, 1, 1979);
    validateDate("jan '80", 1, 1, 1980);
    validateDate("2006-Jun-16", 6, 16, 2006);
    validateDate("28-Feb-2010", 2, 28, 2010);
    validateDate("9-Apr", 4, 9, Calendar.getInstance().get(Calendar.YEAR));
    validateDate("jan 10, '00", 1, 10, 2000);
  }
  
  @Test
  public void testRelaxed() {
    validateDate("oct 1, 1980", 10, 1, 1980);
    validateDate("oct. 1, 1980", 10, 1, 1980);
    validateDate("oct 1,1980", 10, 1, 1980);
    validateDate("1st oct in the year '89", 10, 1, 1989);
    validateDate("thirty first of december '80", 12, 31, 1980);
    validateDate("the first of december in the year 1980", 12, 1, 1980);
    validateDate("the 2 of february in the year 1980", 2, 2, 1980);
    validateDate("the 2nd of february in the year 1980", 2, 2, 1980);
    validateDate("the second of february in the year 1980", 2, 2, 1980);
    validateDate("jan. 2nd", 1, 2, Calendar.getInstance().get(Calendar.YEAR));
    validateDate("sun, nov 21 2010", 11, 21, 2010);
    validateDate("Second Monday in October 2017", 10, 9, 2017);
    validateDate("2nd thursday in sept. '02", 9, 12, 2002);
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
    validateDate("this september", 9, 1, 2011);
    validateDate("in a september", 9, 1, 2011);
    validateDate("in an october", 10, 1, 2011);
    validateDate("september", 9, 1, 2011);
    validateDate("last september", 9, 1, 2010);
    validateDate("next september", 9, 1, 2011);
    validateDate("in a year", 2, 28, 2012);
    validateDate("in a week", 3, 7, 2011);
    validateDate("the saturday after next", 3, 19, 2011);
    validateDate("the monday after next", 3, 14, 2011);
    validateDate("the monday after next monday", 3, 14, 2011);
    validateDate("tuesday before last", 2, 15, 2011);
    validateDate("a week from now", 3, 7, 2011);
    validateDate("a month from today", 3, 28, 2011);
    validateDate("a week after this friday", 3, 11, 2011);
    validateDate("a week from this friday", 3, 11, 2011);
    validateDate("two weeks from this friday", 3, 18, 2011);
    validateDate("It's gonna snow! How about skiing tomorrow", 3, 1, 2011);
    validateDate("A week on tuesday", 3, 8, 2011);
    validateDate("A month ago", 1, 28, 2011);
    validateDate("A week ago", 2, 21, 2011);
    validateDate("A year ago", 2, 28, 2010);
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
    
    dates = parseCollection("tomorrow at 10 and monday at 11");
    Assert.assertEquals(2, dates.size());
    validateDate(dates.get(0), 1, 3, 2011);
    validateDate(dates.get(1), 1, 3, 2011);
    
    dates = parseCollection("tomorrow at 10 through tues at 11");
    Assert.assertEquals(2, dates.size());
    validateDate(dates.get(0), 1, 3, 2011);
    validateDate(dates.get(1), 1, 4, 2011);
    
    dates = parseCollection("first day of 2009 to last day of 2009");
    Assert.assertEquals(2, dates.size());
    validateDate(dates.get(0), 1, 1, 2009);
    validateDate(dates.get(1), 12, 31, 2009);
    
    dates = parseCollection("first to last day of 2008");
    Assert.assertEquals(2, dates.size());
    validateDate(dates.get(0), 1, 1, 2008);
    validateDate(dates.get(1), 12, 31, 2008);
    
    dates = parseCollection("first to last day of september");
    Assert.assertEquals(2, dates.size());
    validateDate(dates.get(0), 9, 1, 2011);
    validateDate(dates.get(1), 9, 30, 2011);
    
    dates = parseCollection("first to last day of this september");
    Assert.assertEquals(2, dates.size());
    validateDate(dates.get(0), 9, 1, 2011);
    validateDate(dates.get(1), 9, 30, 2011);
    
    dates = parseCollection("first to last day of 2 septembers ago");
    Assert.assertEquals(2, dates.size());
    validateDate(dates.get(0), 9, 1, 2009);
    validateDate(dates.get(1), 9, 30, 2009);
    
    dates = parseCollection("first to last day of 2 septembers from now");
    Assert.assertEquals(2, dates.size());
    validateDate(dates.get(0), 9, 1, 2012);
    validateDate(dates.get(1), 9, 30, 2012);
    
    dates = parseCollection("for 5 days");
    Assert.assertEquals(2, dates.size());
    validateDate(dates.get(0), 1, 2, 2011);
    validateDate(dates.get(1), 1, 7, 2011);
    
    dates = parseCollection("for ten months");
    Assert.assertEquals(2, dates.size());
    validateDate(dates.get(0), 1, 2, 2011);
    validateDate(dates.get(1), 11, 2, 2011);
    
    dates = parseCollection("for twenty-five years");
    Assert.assertEquals(2, dates.size());
    validateDate(dates.get(0), 1, 2, 2011);
    validateDate(dates.get(1), 1, 2, 2036);
    
    dates = parseCollection("I want to go shopping in Knoxville, TN in the next five to six months.");
    Assert.assertEquals(2, dates.size());
    validateDate(dates.get(0), 6, 2, 2011);
    validateDate(dates.get(1), 7, 2, 2011);
    
    dates = parseCollection("I want to watch the fireworks in the next two to three months.");
    Assert.assertEquals(2, dates.size());
    validateDate(dates.get(0), 3, 2, 2011);
    validateDate(dates.get(1), 4, 2, 2011);
    
    dates = parseCollection("september 7th something");
    Assert.assertEquals(1, dates.size());
    validateDate(dates.get(0), 9, 7, 2011);
    
    dates = parseCollection("september 7th something happened here");
    Assert.assertEquals(1, dates.size());
    validateDate(dates.get(0), 9, 7, 2011);
    
    dates = parseCollection("bla bla bla 2 and 4 month");
    Assert.assertEquals(2, dates.size());
    validateDate(dates.get(0), 3, 2, 2011);
    validateDate(dates.get(1), 5, 2, 2011);
  }

  // https://github.com/joestelmach/natty/issues/38
  @Test
  public void testRelativeDateDifferentTimezone() {
    // Prepare
    TimeZone.setDefault(TimeZone.getTimeZone("US/Eastern"));
    Parser parser = new Parser(TimeZone.getTimeZone("US/Pacific"));
    // 2012, June 3, Sunday, 1 a.m. in US/Eastern GMT -4
    // Same time as
    // 2012, June 2, Saturday, 10 p.m. in US/Pacific GMT -7
    Calendar earlySunday = new GregorianCalendar(2012, 5, 3, 1, 0);
    CalendarSource.setBaseDate(earlySunday.getTime());

    // Run
    Date result = parser.parse("Sunday at 10am").get(0).getDates().get(0);

    // Validate
    // Result should be June 3, 2012
    validateDate(result, 6, 3, 2012);

    TimeZone.setDefault(TimeZone.getTimeZone("US/Eastern"));
  }
  
  public static void main(String[] args) {
    ConsoleHandler handler = new ConsoleHandler();
    handler.setLevel(Level.ALL);
    Logger logger = Logger.getLogger("com.joestelmach.natty");
    logger.setLevel(Level.FINEST);
    logger.addHandler(handler);

    String value = "Monday after next";

    Parser parser = new Parser();
    List<DateGroup> groups = parser.parse(value);
    for(DateGroup group:groups) {
      System.out.println(value);
      System.out.println(group.getSyntaxTree().toStringTree());
      System.out.println("line: " + group.getLine() + ", column: " + group.getPosition());
      System.out.println(group.getText());
      System.out.println(group.getDates());
      System.out.println("is time inferred: " + group.isTimeInferred());
      System.out.println("is recurring: " + group.isRecurring());
      System.out.println("recurs until: " + group.getRecursUntil());
      
      System.out.println("\n** Parse Locations **");
      for(Entry<String, List<ParseLocation>> entry:group.getParseLocations().entrySet()) {
        for(ParseLocation loc:entry.getValue()) {
          System.out.println(loc.getRuleName());
        }
      }
      
      List<ParseLocation> conjunctionLocations = group.getParseLocations().get("conjunction");
      if(conjunctionLocations != null) {
        System.out.print("\nconjunctions: ");
        for(ParseLocation location:conjunctionLocations) {
          System.out.print(location.getText() + " ");
        }
      }
      System.out.print("\n\n");
    }
  }
}
