package com.joestelmach.natty;

import org.junit.BeforeClass;
import org.junit.Test;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;


public class IcsTest extends AbstractTest {
   
  @BeforeClass
  public static void oneTime() {
    Locale.setDefault(Locale.US);
    TimeZone.setDefault(TimeZone.getTimeZone("US/Eastern"));
    initCalendarAndParser();
  }
  
  @Test
  public void testUpcomingSeason() throws Exception {
    Date reference = DateFormat.getDateInstance(DateFormat.SHORT).parse("5/05/2011");
    calendarSource = new CalendarSource(reference);
    
    validateDate(reference, "spring", 3, 20, 2012);
    ensureNoDate(reference, "springs");
    validateDate(reference, "summer", 6, 21, 2011);
    validateDate(reference, "fall", 9, 23, 2011);
    ensureNoDate(reference, "falls");
    validateDate(reference, "autumn", 9, 23, 2011);
    validateDate(reference, "winter", 12, 22, 2011);
  }
  
  @Test
  public void testUpcomingHoliday() throws Exception {
    Date reference = DateFormat.getDateInstance(DateFormat.SHORT).parse("11/05/2011");
    calendarSource = new CalendarSource(reference);

    validateDate(reference, "april fool's day", 4, 1, 2012);
    validateDate(reference, "black friday", 11, 25, 2011);
    validateDate(reference, "christmas", 12, 25, 2011);
    validateDate(reference, "christmas eve", 12, 24, 2011);
    validateDate(reference, "columbus day", 10, 8, 2012);
    validateDate(reference, "earth day", 4, 22, 2012);
    validateDate(reference, "easter", 4, 8, 2012);
    validateDate(reference, "father's day", 6, 17, 2012);
    validateDate(reference, "flag day", 6, 14, 2012);
    validateDate(reference, "good friday", 4, 6, 2012);
    validateDate(reference, "groundhog day", 2, 2, 2012);
    validateDate(reference, "halloween", 10, 31, 2012);
    validateDate(reference, "independence day", 7, 4, 2012);
    validateDate(reference, "kwanzaa", 12, 26, 2011);
    validateDate(reference, "labor day", 9, 3, 2012);
    validateDate(reference, "mlk day", 1, 16, 2012);
    validateDate(reference, "memorial day", 5, 28, 2012);
    validateDate(reference, "mother's day", 5, 13, 2012);
    validateDate(reference, "new year's day", 1, 1, 2012);
    validateDate(reference, "new year's eve", 12, 31, 2011);
    validateDate(reference, "patriot day", 9, 11, 2012);
    validateDate(reference, "president's day", 2, 20, 2012);
    validateDate(reference, "st patty's day", 3, 17, 2012);
    validateDate(reference, "tax day", 4, 15, 2012);
    validateDate(reference, "thanksgiving", 11, 24, 2011);
    validateDate(reference, "election day", 11, 8, 2011);
    validateDate(reference, "valentine day", 2, 14, 2012);
    validateDate(reference, "veterans day", 11, 11, 2011);
  }
  
  @Test
  public void testRelativeHolidays() throws Exception {
    Date reference = DateFormat.getDateInstance(DateFormat.SHORT).parse("11/05/2011");
    calendarSource = new CalendarSource(reference);

    validateDate(reference, "2 black fridays from now", 11, 23, 2012);
    validateDate(reference, "three memorial days ago", 5, 25, 2009);
  }
  
  @Test
  public void testSeasonsByYear() throws Exception {
    Date reference = DateFormat.getDateInstance(DateFormat.SHORT).parse("11/05/2011");
    calendarSource = new CalendarSource(reference);

    validateDate(reference, "spring 2010", 3, 20, 2010);
    validateDate(reference, "spring 2018", 3, 20, 2018);
    validateDate(reference, "spring 1928", 3, 20, 1928);

    validateDate(reference, "summer 2012", 6, 20, 2012);
    validateDate(reference, "summer 2015", 6, 21, 2015);
    validateDate(reference, "summer 1960", 6, 21, 1960);

    validateDate(reference, "fall 2011", 9, 23, 2011);
    validateDate(reference, "fall 2012", 9, 22, 2012);
    validateDate(reference, "autumn 2016", 9, 22, 2016);
    validateDate(reference, "autumn 1800", 9, 23, 1800);

    validateDate(reference, "winter 2016", 12, 21, 2016);
    validateDate(reference, "winter 2011", 12, 22, 2011);
    validateDate(reference, "winter 1900", 12, 22, 1900);
  }
  
  @Test
  public void testHolidaysByYear() throws Exception {
    Date reference = DateFormat.getDateInstance(DateFormat.SHORT).parse("11/05/2011");
    calendarSource = new CalendarSource(reference);

    validateDate(reference, "april fool's day 2000", 4, 1, 2000);
    validateDate(reference, "black friday 2001", 11, 23, 2001);
    validateDate(reference, "christmas 2002", 12, 25, 2002);
    validateDate(reference, "christmas eve 2003", 12, 24, 2003);
    validateDate(reference, "columbus day 2010", 10, 11, 2010);
    validateDate(reference, "earth day 2005", 4, 22, 2005);
    validateDate(reference, "easter '06", 4, 16, 2006);
    validateDate(reference, "father's day '07", 6, 17, 2007);
    validateDate(reference, "flag day '08", 6, 14, 2008);
    validateDate(reference, "good friday '09", 4, 10, 2009);
    validateDate(reference, "groundhog day '10", 2, 2, 2010);
    validateDate(reference, "halloween '11", 10, 31, 2011);
    validateDate(reference, "independence day '12", 7, 4, 2012);
    validateDate(reference, "kwanzaa '13", 12, 26, 2013);
    validateDate(reference, "labor day '14", 9, 1, 2014);
    validateDate(reference, "mlk day '15", 1, 19, 2015);
    validateDate(reference, "memorial day '16", 5, 30, 2016);
    validateDate(reference, "mother's day 2017", 5, 14, 2017);
    validateDate(reference, "new year's day 2018", 1, 1, 2018);
    validateDate(reference, "new year's eve 2019", 12, 31, 2018);
    validateDate(reference, "patriot day 2020", 9, 11, 2020);
    validateDate(reference, "president's day 2019", 2, 18, 2019);
    validateDate(reference, "st patty's day 2018", 3, 17, 2018);
    validateDate(reference, "tax day 2017", 4, 15, 2017);
    validateDate(reference, "thanksgiving 2016", 11, 24, 2016);
    validateDate(reference, "election day 2015", 11, 3, 2015);
    validateDate(reference, "valentine day 2014", 2, 14, 2014);
    validateDate(reference, "veterans day 2013", 11, 11, 2013);
  }
  
  @Test
  public void testHolidaysWithModifiers() throws Exception {
    Date reference = DateFormat.getDateInstance(DateFormat.SHORT).parse("11/05/2011");
    calendarSource = new CalendarSource(reference);

    validateDate(reference, "four days before veterans day 2013", 11, 7, 2013);
    validateDate(reference, "two days after two thanksgivings from now", 11, 24, 2012);
  }
  
  @Test
  public void testSeasonsWithModifiers() throws Exception {
    Date reference = DateFormat.getDateInstance(DateFormat.SHORT).parse("11/05/2011");
    calendarSource = new CalendarSource(reference);

    validateDate(reference, "four days before fall 2013", 9, 18, 2013);
    validateDate(reference, "two days after two summers from now", 6, 23, 2013);
    validateDate(reference, "three summers ago", 6, 21, 2009);
  }
}
