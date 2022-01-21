package org.natty;

import junit.framework.Assert;
import org.apache.log4j.Level;
import org.junit.BeforeClass;
import org.junit.Test;

import java.text.DateFormat;
import java.util.*;
import java.util.Map.Entry;

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
    calendarSource = new CalendarSource(reference);

    validateDate(reference, "final thursday in april", 4, 28, 2011);
    validateDate(reference, "final thurs in sep", 9, 29, 2011);
    validateDate(reference, "4th february ", 2, 4, 2011);
  }
  
  @Test
  public void testRelative() throws Exception {
    Date reference = DateFormat.getDateInstance(DateFormat.SHORT).parse("2/28/2011");
    calendarSource = new CalendarSource(reference);

    validateDate(reference, "yesterday", 2, 27, 2011);
    validateDate(reference, "tomorrow", 3, 1, 2011);
    validateDate(reference, "tmr", 3, 1, 2011);
    validateDate(reference, "in 3 days", 3, 3, 2011);
    validateDate(reference, "3 days ago", 2, 25, 2011);
    validateDate(reference, "in 3 weeks", 3, 21, 2011);
    validateDate(reference, "four weeks ago", 1, 31, 2011);
    validateDate(reference, "in 3 months", 5, 28, 2011);
    validateDate(reference, "three months ago", 11, 28, 2010);
    validateDate(reference, "in 3 years", 2, 28, 2014);
    validateDate(reference, "seven years ago", 2, 28, 2004);
    validateDate(reference, "60 years ago", 2, 28, 1951);
    validateDate(reference, "32 days ago", 1, 27, 2011);
    validateDate(reference, "320 days ago", 4, 14, 2010);
    validateDate(reference, "1200 days ago", 11, 16, 2007);
    validateDate(reference, "365 days from now", 2, 28, 2012);
    validateDate(reference, "100 months now", 6, 28, 2019);
    validateDate(reference, "100 years from now", 2, 28, 2111);
    validateDate(reference, "next monday", 3, 7, 2011);
    validateDate(reference, "next mon", 3, 7, 2011);
    validateDate(reference, "4 mondays from now", 3, 28, 2011);
    validateDate(reference, "4 mondays from today", 3, 28, 2011);
    validateDate(reference, "next weekend", 3, 12, 2011);
    validateDate(reference, "six mondays ago", 1, 17, 2011);
    validateDate(reference, "last monday", 2, 21, 2011);
    validateDate(reference, "last mon", 2, 21, 2011);
    validateDate(reference, "this past mon", 2, 21, 2011);
    validateDate(reference, "this coming mon", 3, 7, 2011);
    validateDate(reference, "this upcoming mon", 3, 7, 2011);
    validateDate(reference, "next thurs", 3, 10, 2011);
    validateDate(reference, "next month", 3, 28, 2011);
    validateDate(reference, "last month", 1, 28, 2011);
    validateDate(reference, "next week", 3, 7, 2011);
    validateDate(reference, "last week", 2, 21, 2011);
    validateDate(reference, "next year", 2, 28, 2012);
    validateDate(reference, "last year", 2, 28, 2010);
    validateDate(reference, "tues this week", 3, 1, 2011);
    validateDate(reference, "tuesday this week", 3, 1, 2011);
    validateDate(reference, "tuesday next week", 3, 8, 2011);
    validateDate(reference, "this september", 9, 1, 2011);
    validateDate(reference, "in a september", 9, 1, 2011);
    validateDate(reference, "in an october", 10, 1, 2011);
    validateDate(reference, "september", 9, 1, 2011);
    validateDate(reference, "last september", 9, 1, 2010);
    validateDate(reference, "next september", 9, 1, 2011);
    validateDate(reference, "january", 1, 1, 2011);
    validateDate(reference, "last january", 1, 1, 2011);
    validateDate(reference, "next january", 1, 1, 2012);
    validateDate(reference, "next february", 2, 1, 2012);
    validateDate(reference, "last february", 2, 1, 2010);
    validateDate(reference, "february ", 2, 1, 2011);
    validateDate(reference, "in a year", 2, 28, 2012);
    validateDate(reference, "in a week", 3, 7, 2011);
    validateDate(reference, "the saturday after next", 3, 19, 2011);
    validateDate(reference, "the monday after next", 3, 14, 2011);
    validateDate(reference, "the monday after next monday", 3, 14, 2011);
    validateDate(reference, "the monday before May 25", 5, 23, 2011);
    validateDate(reference, "the 2nd monday before May 25", 5, 16, 2011);
    validateDate(reference, "3 mondays after May 25", 6, 13, 2011);
    validateDate(reference, "tuesday before last", 2, 15, 2011);
    validateDate(reference, "a week from now", 3, 7, 2011);
    validateDate(reference, "a month from today", 3, 28, 2011);
    validateDate(reference, "a week after this friday", 3, 11, 2011);
    validateDate(reference, "a week from this friday", 3, 11, 2011);
    validateDate(reference, "two weeks from this friday", 3, 18, 2011);
    validateDate(reference, "the second week after this friday", 3, 18, 2011);
    validateDate(reference, "It's gonna snow! How about skiing tomorrow", 3, 1, 2011);
    validateDate(reference, "A week on tuesday", 3, 8, 2011);
    validateDate(reference, "A month ago", 1, 28, 2011);
    validateDate(reference, "A week ago", 2, 21, 2011);
    validateDate(reference, "A year ago", 2, 28, 2010);
    validateDate(reference, "this month", 2, 28, 2011);
    validateDate(reference, "current month", 2, 28, 2011);
    validateDate(reference, "current year", 2, 28, 2011);
    validateDate(reference, "first monday in 1 month", 3, 7, 2011);
    validateDate(reference, "first monday of month in 1 month", 3, 7, 2011);
    validateDate(reference, "first monday of 1 month", 3, 7, 2011);
    validateDate(reference, "first monday in 2 months", 4, 4, 2011);
    validateDate(reference, "first monday of 2 months", 4, 4, 2011);
    validateDate(reference, "first monday of month 2 months", 4, 4, 2011);
    validateDate(reference, "first monday of month in 2 months", 4, 4, 2011);
    validateDate(reference, "first monday in 3 months", 5, 2, 2011);
    validateDate(reference, "first monday of 3 months", 5, 2, 2011);
    validateDate(reference, "first monday of month in 3 months", 5, 2, 2011);
    validateDate(reference, "1 year 9 months from now", 11, 28, 2012);
    validateDate(reference, "1 year 9 months 1 day from now", 11, 29, 2012);
    validateDate(reference, "2 years 4 months ago", 10, 28, 2008);
    validateDate(reference, "2 years 4 months 5 days ago", 10, 23, 2008);
  }
  
  @Test
  public void testRange() throws Exception {
    Date reference = DateFormat.getDateInstance(DateFormat.SHORT).parse("1/02/2011");
    calendarSource = new CalendarSource(reference);

    List<Date> dates = parseCollection(reference, "monday to friday");
    Assert.assertEquals(2, dates.size());
    validateDate(dates.get(0), 1, 3, 2011);
    validateDate(dates.get(1), 1, 7, 2011);
    
    dates = parseCollection(reference, "1999-12-31 to tomorrow");
    Assert.assertEquals(2, dates.size());
    validateDate(dates.get(0), 12, 31, 1999);
    validateDate(dates.get(1), 1, 3, 2011);
    
    dates = parseCollection(reference, "now to 2010-01-01");
    Assert.assertEquals(2, dates.size());
    validateDate(dates.get(0), 1, 2, 2011);
    validateDate(dates.get(1), 1, 1, 2010);
    
    dates = parseCollection(reference, "jan 1 to 2");
    Assert.assertEquals(2, dates.size());
    validateDate(dates.get(0), 1, 1, 2011);
    validateDate(dates.get(1), 1, 2, 2011);
    
    dates = parseCollection(reference, "may 2nd to 5th");
    Assert.assertEquals(2, dates.size());
    validateDate(dates.get(0), 5, 2, 2011);
    validateDate(dates.get(1), 5, 5, 2011);
    
    dates = parseCollection(reference, "1/3 to 2/3");
    Assert.assertEquals(2, dates.size());
    validateDate(dates.get(0), 1, 3, 2011);
    validateDate(dates.get(1), 2, 3, 2011);
    
    dates = parseCollection(reference, "2/3 to in one week");
    Assert.assertEquals(2, dates.size());
    validateDate(dates.get(0), 2, 3, 2011);
    validateDate(dates.get(1), 1, 9, 2011);
    
    dates = parseCollection(reference, "first day of may to last day of may");
    Assert.assertEquals(2, dates.size());
    validateDate(dates.get(0), 5, 1, 2011);
    validateDate(dates.get(1), 5, 31, 2011);
    
    dates = parseCollection(reference, "feb 28th or 2 days after");
    Assert.assertEquals(2, dates.size());
    validateDate(dates.get(0), 2, 28, 2011);
    validateDate(dates.get(1), 3, 2, 2011);
    
    dates = parseCollection(reference, "tomorrow at 10 and monday at 11");
    Assert.assertEquals(2, dates.size());
    validateDate(dates.get(0), 1, 3, 2011);
    validateDate(dates.get(1), 1, 3, 2011);
    
    dates = parseCollection(reference, "tomorrow at 10 through tues at 11");
    Assert.assertEquals(2, dates.size());
    validateDate(dates.get(0), 1, 3, 2011);
    validateDate(dates.get(1), 1, 4, 2011);
    
    dates = parseCollection(reference, "first day of 2009 to last day of 2009");
    Assert.assertEquals(2, dates.size());
    validateDate(dates.get(0), 1, 1, 2009);
    validateDate(dates.get(1), 12, 31, 2009);
    
    dates = parseCollection(reference, "first to last day of 2008");
    Assert.assertEquals(2, dates.size());
    validateDate(dates.get(0), 1, 1, 2008);
    validateDate(dates.get(1), 12, 31, 2008);
    
    dates = parseCollection(reference, "first to last day of september");
    Assert.assertEquals(2, dates.size());
    validateDate(dates.get(0), 9, 1, 2011);
    validateDate(dates.get(1), 9, 30, 2011);
    
    dates = parseCollection(reference, "first to last day of this september");
    Assert.assertEquals(2, dates.size());
    validateDate(dates.get(0), 9, 1, 2011);
    validateDate(dates.get(1), 9, 30, 2011);
    
    dates = parseCollection(reference, "first to last day of 2 septembers ago");
    Assert.assertEquals(2, dates.size());
    validateDate(dates.get(0), 9, 1, 2009);
    validateDate(dates.get(1), 9, 30, 2009);
    
    dates = parseCollection(reference, "first to last day of 2 septembers from now");
    Assert.assertEquals(2, dates.size());
    validateDate(dates.get(0), 9, 1, 2012);
    validateDate(dates.get(1), 9, 30, 2012);
    
    dates = parseCollection(reference, "for 5 days");
    Assert.assertEquals(2, dates.size());
    validateDate(dates.get(0), 1, 2, 2011);
    validateDate(dates.get(1), 1, 7, 2011);
    
    dates = parseCollection(reference, "for ten months");
    Assert.assertEquals(2, dates.size());
    validateDate(dates.get(0), 1, 2, 2011);
    validateDate(dates.get(1), 11, 2, 2011);
    
    dates = parseCollection(reference, "for twenty-five years");
    Assert.assertEquals(2, dates.size());
    validateDate(dates.get(0), 1, 2, 2011);
    validateDate(dates.get(1), 1, 2, 2036);

    dates = parseCollection(reference, "2 and 4 months");
    Assert.assertEquals(2, dates.size());
    validateDate(dates.get(0), 3, 2, 2011);
    validateDate(dates.get(1), 5, 2, 2011);

    dates = parseCollection(reference, "in 2 to 4 months");
    Assert.assertEquals(2, dates.size());
    validateDate(dates.get(0), 3, 2, 2011);
    validateDate(dates.get(1), 5, 2, 2011);

    dates = parseCollection(reference, "for 2 to 4 months");
    Assert.assertEquals(3, dates.size());
    validateDate(dates.get(0), 1, 2, 2011);
    validateDate(dates.get(1), 3, 2, 2011);
    validateDate(dates.get(2), 5, 2, 2011);

    dates = parseCollection(reference, "next 2 to 4 months");
    Assert.assertEquals(3, dates.size());
    validateDate(dates.get(0), 1, 2, 2011);
    validateDate(dates.get(1), 3, 2, 2011);
    validateDate(dates.get(2), 5, 2, 2011);

    dates = parseCollection(reference, "2 to 4 months from now");
    Assert.assertEquals(2, dates.size());
    validateDate(dates.get(0), 3, 2, 2011);
    validateDate(dates.get(1), 5, 2, 2011);

    dates = parseCollection(reference, "last 2 to 4 months");
    Assert.assertEquals(3, dates.size());
    validateDate(dates.get(0), 1, 2, 2011);
    validateDate(dates.get(1), 11, 2, 2010);
    validateDate(dates.get(2), 9, 2, 2010);

    dates = parseCollection(reference, "past 2 to 4 months");
    Assert.assertEquals(3, dates.size());
    validateDate(dates.get(0), 1, 2, 2011);
    validateDate(dates.get(1), 11, 2, 2010);
    validateDate(dates.get(2), 9, 2, 2010);

    dates = parseCollection(reference, "2 to 4 months ago");
    Assert.assertEquals(2, dates.size());
    validateDate(dates.get(0), 11, 2, 2010);
    validateDate(dates.get(1), 9, 2, 2010);

    dates = parseCollection(reference, "2 or 3 days ago");
    Assert.assertEquals(2, dates.size());
    validateDate(dates.get(0), 12, 31, 2010);
    validateDate(dates.get(1), 12, 30, 2010);

    dates = parseCollection(reference, "1 to 2 days");
    Assert.assertEquals(2, dates.size());
    validateDate(dates.get(0), 1, 3, 2011);
    validateDate(dates.get(1), 1, 4, 2011);

    dates = parseCollection(reference, "I want to go shopping in Knoxville, TN in the next five to six months.");
    Assert.assertEquals(3, dates.size());
    validateDate(dates.get(0), 1, 2, 2011);
    validateDate(dates.get(1), 6, 2, 2011);
    validateDate(dates.get(2), 7, 2, 2011);

    dates = parseCollection(reference, "I want to watch the fireworks in the next two to three months.");
    Assert.assertEquals(3, dates.size());
    validateDate(dates.get(0), 1, 2, 2011);
    validateDate(dates.get(1), 3, 2, 2011);
    validateDate(dates.get(2), 4, 2, 2011);

    dates = parseCollection(reference, "september 7th something");
    Assert.assertEquals(1, dates.size());
    validateDate(dates.get(0), 9, 7, 2011);
    
    dates = parseCollection(reference, "september 7th something happened here");
    Assert.assertEquals(1, dates.size());
    validateDate(dates.get(0), 9, 7, 2011);
    
    dates = parseCollection(reference, "bla bla bla 2 and 4 month");
    Assert.assertEquals(2, dates.size());
    validateDate(dates.get(0), 3, 2, 2011);
    validateDate(dates.get(1), 5, 2, 2011);
  }

  // https://github.org/natty/issues/38
  @Test
  public void testRelativeDateDifferentTimezone() {
    // Prepare
    TimeZone.setDefault(TimeZone.getTimeZone("US/Eastern"));
    Parser parser = new Parser(TimeZone.getTimeZone("US/Pacific"));
    // 2012, June 3, Sunday, 1 a.m. in US/Eastern GMT -4
    // Same time as
    // 2012, June 2, Saturday, 10 p.m. in US/Pacific GMT -7
    Calendar earlySunday = new GregorianCalendar(2012, 5, 3, 1, 0);
    calendarSource = new CalendarSource(earlySunday.getTime());

    // Run
    Date result = parser.parse("Sunday at 10am", earlySunday.getTime()).get(0).getDates().get(0);

    // Validate
    // Result should be June 3, 2012
    validateDate(result, 6, 3, 2012);

    TimeZone.setDefault(TimeZone.getTimeZone("US/Eastern"));
  }

  public static void main(String[] args) {

    String value="easter '06";

    org.apache.log4j.Logger.getRootLogger().setLevel(Level.INFO);

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
          System.out.println(loc.getRuleName() + ": " + loc.getText());
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
