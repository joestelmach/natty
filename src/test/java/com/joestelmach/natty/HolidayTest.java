package com.joestelmach.natty;

import java.text.DateFormat;
import java.util.Date;
import java.util.TimeZone;

import org.junit.BeforeClass;
import org.junit.Test;


public class HolidayTest extends AbstractTest {
   
  @BeforeClass
  public static void oneTime() {
    TimeZone.setDefault(TimeZone.getTimeZone("US/Eastern"));
  }
  
  @Test
  public void testUpcomingHoliday() throws Exception {
    Date reference = DateFormat.getDateInstance(DateFormat.SHORT).parse("11/05/2011");
    CalendarSource.setBaseDate(reference);
    
    validateDate("april fool's day", 4, 1, 2012);
    validateDate("black friday", 11, 25, 2011);
    validateDate("christmas", 12, 25, 2011);
    validateDate("christmas eve", 12, 24, 2011);
    validateDate("columbus day", 10, 8, 2012);
    validateDate("earth day", 4, 22, 2012);
    validateDate("easter", 4, 8, 2012);
    validateDate("father's day", 6, 17, 2012);
    validateDate("flag day", 6, 14, 2012);
    validateDate("good friday", 4, 6, 2012);
    validateDate("groundhog day", 2, 2, 2012);
    validateDate("halloween", 10, 31, 2012);
    validateDate("independence day", 7, 4, 2012);
    validateDate("kwanzaa", 12, 26, 2011);
    validateDate("labor day", 9, 3, 2012);
    validateDate("mlk day", 1, 16, 2012);
    validateDate("memorial day", 5, 28, 2012);
    validateDate("mother's day", 5, 13, 2012);
    validateDate("new year's day", 1, 1, 2012);
    validateDate("new year's eve", 12, 31, 2011);
    validateDate("patriot day", 9, 11, 2012);
    validateDate("president's day", 2, 20, 2012);
    validateDate("st patty's day", 3, 17, 2012);
    validateDate("tax day", 4, 15, 2012);
    validateDate("thanksgiving", 11, 24, 2011);
    validateDate("election day", 11, 8, 2011);
    validateDate("valentine day", 2, 14, 2012);
    validateDate("veterans day", 11, 11, 2011);
  }
  
  @Test
  public void testRelativeHolidays() throws Exception {
    Date reference = DateFormat.getDateInstance(DateFormat.SHORT).parse("11/05/2011");
    CalendarSource.setBaseDate(reference);
    
    validateDate("2 black fridays from now", 11, 23, 2012);
    validateDate("three memorial days ago", 5, 25, 2009);
  }
  
  @Test
  public void testHolidaysByYear() throws Exception {
    Date reference = DateFormat.getDateInstance(DateFormat.SHORT).parse("11/05/2011");
    CalendarSource.setBaseDate(reference);
    
    validateDate("april fool's day 2000", 4, 1, 2000);
    validateDate("black friday 2001", 11, 23, 2001);
    validateDate("christmas 2002", 12, 25, 2002);
    validateDate("christmas eve 2003", 12, 24, 2003);
    validateDate("columbus day 2010", 10, 11, 2010);
    validateDate("earth day 2005", 4, 22, 2005);
    validateDate("easter '06", 4, 16, 2006);
    validateDate("father's day '07", 6, 17, 2007);
    validateDate("flag day '08", 6, 14, 2008);
    validateDate("good friday '09", 4, 10, 2009);
    validateDate("groundhog day '10", 2, 2, 2010);
    validateDate("halloween '11", 10, 31, 2011);
    validateDate("independence day '12", 7, 4, 2012);
    validateDate("kwanzaa '13", 12, 26, 2013);
    validateDate("labor day '14", 9, 1, 2014);
    validateDate("mlk day '15", 1, 19, 2015);
    validateDate("memorial day '16", 5, 30, 2016);
    validateDate("mother's day 2017", 5, 14, 2017);
    validateDate("new year's day 2018", 1, 1, 2018);
    validateDate("new year's eve 2019", 12, 31, 2018);
    validateDate("patriot day 2020", 9, 11, 2020);
    validateDate("president's day 2019", 2, 18, 2019);
    validateDate("st patty's day 2018", 3, 17, 2018);
    validateDate("tax day 2017", 4, 15, 2017);
    validateDate("thanksgiving 2016", 11, 24, 2016);
    validateDate("election day 2015", 11, 3, 2015);
    validateDate("valentine day 2014", 2, 14, 2014);
    validateDate("veterans day 2013", 11, 11, 2013);
  }
  
  @Test
  public void testHolidaysWithModifiers() throws Exception {
    Date reference = DateFormat.getDateInstance(DateFormat.SHORT).parse("11/05/2011");
    CalendarSource.setBaseDate(reference);
    
    validateDate("four days before veterans day 2013", 11, 7, 2013);
    validateDate("two days after two thanksgivings from now", 11, 24, 2012);
  }
}
