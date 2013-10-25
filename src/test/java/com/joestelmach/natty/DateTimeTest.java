package com.joestelmach.natty;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;

/**
 * Runs the parser through the various datetime formats
 *
 * @author Joe Stelmach
 */
public class DateTimeTest extends AbstractTest {
  @BeforeClass
  public static void oneTime() {
    Locale.setDefault(Locale.US);
    TimeZone.setDefault(TimeZone.getTimeZone("US/Eastern"));
    initCalendarAndParser();
  }

  @Test
  public void testSpecific() throws Exception {
    Date reference = DateFormat.getDateTimeInstance(DateFormat.SHORT,
        DateFormat.SHORT).parse("5/19/2012 12:00 am");
    CalendarSource.setBaseDate(reference);

    validateDateTime("1st oct in the year '89 1300 hours", 10, 1, 1989, 13, 0, 0);
    validateDateTime("1st oct in the year '89 at 1300 hours", 10, 1, 1989, 13, 0, 0);
    validateDateTime("1st oct in the year '89, 13:00", 10, 1, 1989, 13, 0, 0);
    validateDateTime("1st oct in the year '89,13:00", 10, 1, 1989, 13, 0, 0);
    validateDateTime("1st oct in the year '89, at 13:00", 10, 1, 1989, 13, 0, 0);
    validateDateTime("3am on oct 1st 2010", 10, 1, 2010, 3, 0, 0);
    validateDateTime("3am, october first 2010", 10, 1, 2010, 3, 0, 0);
    validateDateTime("3am,october first 2010", 10, 1, 2010, 3, 0, 0);
    validateDateTime("3am, on october first 2010", 10, 1, 2010, 3, 0, 0);
    validateDateTime("3am october first 2010", 10, 1, 2010, 3, 0, 0);
    validateDateTime("2011-06-17T07:00:00Z", 6, 17, 2011, 3, 0, 0);
    validateDateTime("April 20, 10am", 4, 20, 2012, 10, 0, 0);
    validateDateTime("April 20 10", 4, 20, 2012, 10, 0, 0);
    validateDateTime("April 20 at 10 am", 4, 20, 2012, 10, 0, 0);
    validateDateTime("05-Aug-2013 14:10:56 UTC", 8, 5, 2013, 10, 10, 56);
    validateDateTime("5/1/13 01:00:00-8", 5, 1, 2013, 5, 0, 0);
    validateDateTime("5/1/13 01:00:00 UTC", 4, 30, 2013, 21, 0, 0);
    validateDateTime("5/1/13 01:00:00 UTC+8", 4, 30, 2013, 13, 0, 0);
    validateDateTime("5/1/13 01:00:00 GMT-1", 4, 30, 2013, 22, 0, 0);
  }

  @Test
  public void testRelative() throws Exception {
    Date reference = DateFormat.getDateTimeInstance(DateFormat.SHORT,
        DateFormat.SHORT).parse("2/24/2011 12:00 am");
    CalendarSource.setBaseDate(reference);

    validateDateTime("seven years ago at 3pm", 2, 24, 2004, 15, 0, 0);
    validateDateTime("next wed. at 5pm", 3, 2, 2011, 17, 0, 0);
    validateDateTime("3 days after next wed at 6a", 3, 5, 2011, 6, 0, 0);
    validateDateTime("8pm on the sunday after next wed", 3, 6, 2011, 20, 0, 0);
    validateDateTime("two days after today @ 6p", 2, 26, 2011, 18, 0, 0);
    validateDateTime("two days from today @ 6p", 2, 26, 2011, 18, 0, 0);
    validateDateTime("11:59 on 3 sundays after next wed", 3, 20, 2011, 11, 59, 0);
    validateDateTime("the day after next 6pm", 2, 26, 2011, 18, 0, 0);
    validateDateTime("the week after next 2a", 3, 10, 2011, 2, 0, 0);
    validateDateTime("the month after next 0700", 4, 24, 2011, 7, 0, 0);
    validateDateTime("the year after next @ midnight", 2, 24, 2013, 0, 0, 0);
    validateDateTime("wed of the week after next in the evening", 3, 9, 2011, 19, 0, 0);
    validateDateTime("the 28th of the month after next in the morning", 4, 28, 2011, 8, 0, 0);
    validateDateTime("this morning", 2, 24, 2011, 8, 0, 0);
    validateDateTime("this afternoon", 2, 24, 2011, 12, 0, 0);
    validateDateTime("this evening", 2, 24, 2011, 19, 0, 0);
    validateDateTime("today evening", 2, 24, 2011, 19, 0, 0);
    validateDateTime("tomorrow evening", 2, 25, 2011, 19, 0, 0);
    validateDateTime("friday evening", 2, 25, 2011, 19, 0, 0);
    validateDateTime("monday 6 in the morning", 2, 28, 2011, 6, 0, 0);
    validateDateTime("monday 4 in the afternoon", 2, 28, 2011, 16, 0, 0);
    validateDateTime("monday 9 in the evening", 2, 28, 2011, 21, 0, 0);
    validateDateTime("tomorrow @ noon", 2, 25, 2011, 12, 0, 0);
    validateDateTime("Acknowledged. Let's meet at 9pm.", 2, 24, 2011, 21, 0, 0);
    validateDateTime("tuesday,\u00A012:50 PM", 3, 1, 2011, 12, 50, 0);
  }

  @Test
  public void testRange() throws Exception {
    Date reference = DateFormat.getDateInstance(DateFormat.SHORT).parse("6/12/2010");
    CalendarSource.setBaseDate(reference);

    List<Date> dates = parseCollection("2009-03-10 9:00 to 11:00");
    Assert.assertEquals(2, dates.size());
    validateDateTime(dates.get(0), 3, 10, 2009, 9, 0, 0);
    validateDateTime(dates.get(1), 3, 10, 2009, 11, 0, 0);

    dates = parseCollection("26 oct 10:00 am to 11:00 am");
    Assert.assertEquals(2, dates.size());
    validateDateTime(dates.get(0), 10, 26, 2010, 10, 0, 0);
    validateDateTime(dates.get(1), 10, 26, 2010, 11, 0, 0);

    dates = parseCollection("16:00 nov 6 to 17:00");
    Assert.assertEquals(2, dates.size());
    validateDateTime(dates.get(0), 11, 6, 2010, 16, 0, 0);
    validateDateTime(dates.get(1), 11, 6, 2010, 17, 0, 0);

    dates = parseCollection("6am dec 5 to 7am");
    Assert.assertEquals(2, dates.size());
    validateDateTime(dates.get(0), 12, 5, 2010, 6, 0, 0);
    validateDateTime(dates.get(1), 12, 5, 2010, 7, 0, 0);

    dates = parseCollection("3/3 21:00 to in 5 days");
    Assert.assertEquals(2, dates.size());
    validateDateTime(dates.get(0), 3, 3, 2010, 21, 0, 0);
    validateDateTime(dates.get(1), 6, 17, 2010, 21, 0, 0);

    dates = parseCollection("November 20 2 p.m. to 3 p.m");
    Assert.assertEquals(2, dates.size());
    validateDateTime(dates.get(0), 11, 20, 2010, 14, 0, 0);
    validateDateTime(dates.get(1), 11, 20, 2010, 15, 0, 0);

    dates = parseCollection("November 20 2 p.m. - 3 p.m.");
    Assert.assertEquals(2, dates.size());
    validateDateTime(dates.get(0), 11, 20, 2010, 14, 0, 0);
    validateDateTime(dates.get(1), 11, 20, 2010, 15, 0, 0);
  }

  @Test
  public void testList() throws Exception {
    Date reference = DateFormat.getDateInstance(DateFormat.SHORT).parse("05/19/2012");
    CalendarSource.setBaseDate(reference);

    List<Date> dates =
        parseCollection("June 25th at 9am and July 2nd at 10am and August 16th at 11am");
    Assert.assertEquals(3, dates.size());
    validateDateTime(dates.get(0), 6, 25, 2012, 9, 0, 0);
    validateDateTime(dates.get(1), 7, 2, 2012, 10, 0, 0);
    validateDateTime(dates.get(2), 8, 16, 2012, 11, 0, 0);

    dates = parseCollection("June 25th at 10am and July 2nd and August 16th");
    Assert.assertEquals(3, dates.size());
    validateDateTime(dates.get(0), 6, 25, 2012, 10, 0, 0);
    validateDateTime(dates.get(1), 7, 2, 2012, 10, 0, 0);
    validateDateTime(dates.get(2), 8, 16, 2012, 10, 0, 0);

    dates = parseCollection("June 25th and July 2nd at 10am and August 16th");
    Assert.assertEquals(3, dates.size());
    validateDateTime(dates.get(0), 6, 25, 2012, 0, 0, 0);
    validateDateTime(dates.get(1), 7, 2, 2012, 10, 0, 0);
    validateDateTime(dates.get(2), 8, 16, 2012, 10, 0, 0);

    dates = parseCollection("June 25th and July 2nd and August 16th at 10am");
    Assert.assertEquals(3, dates.size());
    validateDateTime(dates.get(0), 6, 25, 2012, 0, 0, 0);
    validateDateTime(dates.get(1), 7, 2, 2012, 0, 0, 0);
    validateDateTime(dates.get(2), 8, 16, 2012, 10, 0, 0);

    dates = parseCollection("slept from 3:30 a.m. To 9:41 a.m. On April 10th");
    Assert.assertEquals(2, dates.size());
    validateDateTime(dates.get(0), 4, 10, 2012, 3, 30, 0);
    validateDateTime(dates.get(1), 4, 10, 2012, 9, 41, 0);
  }
}
