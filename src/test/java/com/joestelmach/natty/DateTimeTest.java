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
    calendarSource = new CalendarSource(reference);

    validateDateTime(reference, "1st oct in the year '89 1300 hours", 10, 1, 1989, 13, 0, 0);
    validateDateTime(reference, "1st oct in the year '89 at 1300 hours", 10, 1, 1989, 13, 0, 0);
    validateDateTime(reference, "1st oct in the year '89, 13:00", 10, 1, 1989, 13, 0, 0);
    validateDateTime(reference, "1st oct in the year '89,13:00", 10, 1, 1989, 13, 0, 0);
    validateDateTime(reference, "1st oct in the year '89, at 13:00", 10, 1, 1989, 13, 0, 0);
    validateDateTime(reference, "3am on oct 1st 2010", 10, 1, 2010, 3, 0, 0);
    validateDateTime(reference, "3am, october first 2010", 10, 1, 2010, 3, 0, 0);
    validateDateTime(reference, "3am,october first 2010", 10, 1, 2010, 3, 0, 0);
    validateDateTime(reference, "3am, on october first 2010", 10, 1, 2010, 3, 0, 0);
    validateDateTime(reference, "3am october first 2010", 10, 1, 2010, 3, 0, 0);
    validateDateTime(reference, "April 20, 10am", 4, 20, 2012, 10, 0, 0);
    validateDateTime(reference, "April 20 10", 4, 20, 2012, 10, 0, 0);
    validateDateTime(reference, "April 20 at 10 am", 4, 20, 2012, 10, 0, 0);
    validateDateTime(reference, "Mar 16, 2015 3:33:39 PM", 3, 16, 2015, 15, 33, 39);
  }

  @Test
  public void testRelative() throws Exception {
    Date reference = DateFormat.getDateTimeInstance(DateFormat.SHORT,
        DateFormat.SHORT).parse("2/24/2011 12:00 am");
    calendarSource = new CalendarSource(reference);

    validateDateTime(reference, "seven years ago at 3pm", 2, 24, 2004, 15, 0, 0);
    validateDateTime(reference, "next wed. at 5pm", 3, 2, 2011, 17, 0, 0);
    validateDateTime(reference, "3 days after next wed at 6a", 3, 5, 2011, 6, 0, 0);
    validateDateTime(reference, "8pm on the sunday after next wed", 3, 6, 2011, 20, 0, 0);
    validateDateTime(reference, "two days after today @ 6p", 2, 26, 2011, 18, 0, 0);
    validateDateTime(reference, "two days from today @ 6p", 2, 26, 2011, 18, 0, 0);
    validateDateTime(reference, "11:59 on 3 sundays after next wed", 3, 20, 2011, 11, 59, 0);
    validateDateTime(reference, "the day after next 6pm", 2, 26, 2011, 18, 0, 0);
    validateDateTime(reference, "the week after next 2a", 3, 10, 2011, 2, 0, 0);
    validateDateTime(reference, "the month after next 0700", 4, 24, 2011, 7, 0, 0);
    validateDateTime(reference, "the year after next @ midnight", 2, 24, 2013, 0, 0, 0);
    validateDateTime(reference, "wed of the week after next in the evening", 3, 9, 2011, 19, 0, 0);
    validateDateTime(reference, "the 28th of the month after next in the morning", 4, 28, 2011, 8, 0, 0);
    validateDateTime(reference, "this morning", 2, 24, 2011, 8, 0, 0);
    validateDateTime(reference, "this afternoon", 2, 24, 2011, 12, 0, 0);
    validateDateTime(reference, "this evening", 2, 24, 2011, 19, 0, 0);
    validateDateTime(reference, "today evening", 2, 24, 2011, 19, 0, 0);
    validateDateTime(reference, "tomorrow evening", 2, 25, 2011, 19, 0, 0);
    validateDateTime(reference, "friday evening", 2, 25, 2011, 19, 0, 0);
    validateDateTime(reference, "monday 6 in the morning", 2, 28, 2011, 6, 0, 0);
    validateDateTime(reference, "monday 4 in the afternoon", 2, 28, 2011, 16, 0, 0);
    validateDateTime(reference, "monday 9 in the evening", 2, 28, 2011, 21, 0, 0);
    validateDateTime(reference, "tomorrow @ noon", 2, 25, 2011, 12, 0, 0);
    validateDateTime(reference, "Acknowledged. Let's meet at 9pm.", 2, 24, 2011, 21, 0, 0);
    validateDateTime(reference, "tuesday,\u00A012:50 PM", 3, 1, 2011, 12, 50, 0);
    validateDateTime(reference, "tonight at 6:30", 2, 24, 2011, 18, 30, 0);
    validateDateTime(reference, "tonight at 6", 2, 24, 2011, 18, 0, 0);
    validateDateTime(reference, "tonight at 2", 2, 25, 2011, 2, 0, 0);
    validateDateTime(reference, "tonight at 4:59", 2, 25, 2011, 4, 59, 0);
    validateDateTime(reference, "tonight at 5", 2, 24, 2011, 17, 0, 0);
    validateDateTime(reference, "this evening at 5", 2, 24, 2011, 17, 0, 0);
    validateDateTime(reference, "this evening at 2", 2, 25, 2011, 2, 0, 0);
    validateDateTime(reference, "tomorrow evening at 5", 2, 25, 2011, 17, 0, 0);
    validateDateTime(reference, "wed evening at 8:30", 3, 2, 2011, 20, 30, 0);
    validateDateTime(reference, "750 minutes from now", 2, 24, 2011, 12, 30, 0);
    validateDateTime(reference, "1500 minutes from now", 2, 25, 2011, 1, 0, 0);
    validateDateTime(reference, "50 seconds ago", 2, 23, 2011, 23, 59, 10);
    validateDateTime(reference, "110 seconds ago", 2, 23, 2011, 23, 58, 10);
    validateDateTime(reference, "6110 seconds ago", 2, 23, 2011, 22, 18, 10);
    validateDateTime(reference, "86400 seconds ago", 2, 23, 2011, 0, 0, 0);
    validateDateTime(reference, "86401 seconds ago", 2, 22, 2011, 23, 59, 59);
    validateDateTime(reference, "86401 seconds ago", 2, 22, 2011, 23, 59, 59);
    validateDateTime(reference, "2678400 seconds ago", 1, 24, 2011, 0, 0, 0);
    validateDateTime(reference, "2678401 seconds ago", 1, 23, 2011, 23, 59, 59);
  }

  @Test
  public void testRange() throws Exception {
    Date reference = DateFormat.getDateInstance(DateFormat.SHORT).parse("6/12/2010");
    calendarSource = new CalendarSource(reference);

    List<Date> dates = parseCollection(reference, "2009-03-10 9:00 to 11:00");
    Assert.assertEquals(2, dates.size());
    validateDateTime(dates.get(0), 3, 10, 2009, 9, 0, 0);
    validateDateTime(dates.get(1), 3, 10, 2009, 11, 0, 0);

    dates = parseCollection(reference, "26 oct 10:00 am to 11:00 am");
    Assert.assertEquals(2, dates.size());
    validateDateTime(dates.get(0), 10, 26, 2010, 10, 0, 0);
    validateDateTime(dates.get(1), 10, 26, 2010, 11, 0, 0);

    dates = parseCollection(reference, "16:00 nov 6 to 17:00");
    Assert.assertEquals(2, dates.size());
    validateDateTime(dates.get(0), 11, 6, 2010, 16, 0, 0);
    validateDateTime(dates.get(1), 11, 6, 2010, 17, 0, 0);

    dates = parseCollection(reference, "6am dec 5 to 7am");
    Assert.assertEquals(2, dates.size());
    validateDateTime(dates.get(0), 12, 5, 2010, 6, 0, 0);
    validateDateTime(dates.get(1), 12, 5, 2010, 7, 0, 0);

    dates = parseCollection(reference, "3/3 21:00 to in 5 days");
    Assert.assertEquals(2, dates.size());
    validateDateTime(dates.get(0), 3, 3, 2010, 21, 0, 0);
    validateDateTime(dates.get(1), 6, 17, 2010, 21, 0, 0);

    dates = parseCollection(reference, "November 20 2 p.m. to 3 p.m");
    Assert.assertEquals(2, dates.size());
    validateDateTime(dates.get(0), 11, 20, 2010, 14, 0, 0);
    validateDateTime(dates.get(1), 11, 20, 2010, 15, 0, 0);

    dates = parseCollection(reference, "November 20 2 p.m. - 3 p.m.");
    Assert.assertEquals(2, dates.size());
    validateDateTime(dates.get(0), 11, 20, 2010, 14, 0, 0);
    validateDateTime(dates.get(1), 11, 20, 2010, 15, 0, 0);
  }

  @Test
  public void testList() throws Exception {
    Date reference = DateFormat.getDateInstance(DateFormat.SHORT).parse("05/19/2012");
    calendarSource = new CalendarSource(reference);

    List<Date> dates =
        parseCollection(reference, "June 25th at 9am and July 2nd at 10am and August 16th at 11am");
    Assert.assertEquals(3, dates.size());
    validateDateTime(dates.get(0), 6, 25, 2012, 9, 0, 0);
    validateDateTime(dates.get(1), 7, 2, 2012, 10, 0, 0);
    validateDateTime(dates.get(2), 8, 16, 2012, 11, 0, 0);

    dates = parseCollection(reference, "June 25th at 10am and July 2nd and August 16th");
    Assert.assertEquals(3, dates.size());
    validateDateTime(dates.get(0), 6, 25, 2012, 10, 0, 0);
    validateDateTime(dates.get(1), 7, 2, 2012, 10, 0, 0);
    validateDateTime(dates.get(2), 8, 16, 2012, 10, 0, 0);

    dates = parseCollection(reference, "June 25th and July 2nd at 10am and August 16th");
    Assert.assertEquals(3, dates.size());
    validateDateTime(dates.get(0), 6, 25, 2012, 10, 0, 0);
    validateDateTime(dates.get(1), 7, 2, 2012, 10, 0, 0);
    validateDateTime(dates.get(2), 8, 16, 2012, 10, 0, 0);

    dates = parseCollection(reference, "June 25th and July 2nd and August 16th at 10am");
    Assert.assertEquals(3, dates.size());
    validateDateTime(dates.get(0), 6, 25, 2012, 10, 0, 0);
    validateDateTime(dates.get(1), 7, 2, 2012, 10, 0, 0);
    validateDateTime(dates.get(2), 8, 16, 2012, 10, 0, 0);

    dates = parseCollection(reference, "slept from 3:30 a.m. To 9:41 a.m. On April 10th");
    Assert.assertEquals(2, dates.size());
    validateDateTime(dates.get(0), 4, 10, 2012, 3, 30, 0);
    validateDateTime(dates.get(1), 4, 10, 2012, 9, 41, 0);
  }
}
