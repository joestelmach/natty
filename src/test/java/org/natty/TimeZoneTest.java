package org.natty;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class TimeZoneTest extends AbstractTest {

  @BeforeClass
  public static void oneTime() {
    Locale.setDefault(Locale.US);
    TimeZone.setDefault(TimeZone.getTimeZone("US/Eastern"));
    initCalendarAndParser();
  }

  @Test
  @Ignore("https://github.com/natty-parser/natty/issues/1")
  public void testSpecific() throws Exception {
    Date reference = DateFormat.getDateTimeInstance(DateFormat.SHORT,
        DateFormat.SHORT).parse("5/19/2012 12:00 am");
    calendarSource = new CalendarSource(reference);

    validateDateTime(reference, "2011-06-17T07:00:00Z", 6, 17, 2011, 3, 0, 0);
    validateDateTime(reference, "05-Aug-2013 14:10:56 UTC", 8, 5, 2013, 10, 10, 56);
    validateDateTime(reference, "5/1/13 01:00:00-8", 5, 1, 2013, 5, 0, 0);
    validateDateTime(reference, "5/1/13 01:00:00 UTC", 4, 30, 2013, 21, 0, 0);
    validateDateTime(reference, "5/1/13 01:00:00 UTC+8", 4, 30, 2013, 13, 0, 0);
    validateDateTime(reference, "5/1/13 01:00:00 GMT-1", 4, 30, 2013, 22, 0, 0);
    validateDateTime(reference, "tomorrow, 10 eastern time", 5, 20, 2012, 10, 0, 0);
    validateDateTime(reference, "tomorrow, 10 central time", 5, 20, 2012, 11, 0, 0);
    validateDateTime(reference, "tomorrow, 10 central", 5, 20, 2012, 11, 0, 0);
    validateDateTime(reference, "tomorrow, 10 mountain time", 5, 20, 2012, 12, 0, 0);
    validateDateTime(reference, "tomorrow, 10 pacific time", 5, 20, 2012, 13, 0, 0);
    validateDateTime(reference, "tomorrow, 10pm pacific", 5, 21, 2012, 1, 0, 0);
    validateDateTime(reference, "tomorrow, 10 alaska time", 5, 20, 2012, 14, 0, 0);
    validateDateTime(reference, "tomorrow, 10 hawaii time", 5, 20, 2012, 16, 0, 0);
  }
}
