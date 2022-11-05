package org.natty;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

import junit.framework.Assert;
import org.junit.BeforeClass;

import org.junit.Test;

/**
 * 
 * @author Joe Stelmach
 */
public class RecurrenceTest extends AbstractTest {
  @BeforeClass
  public static void oneTime() {
    Locale.setDefault(Locale.US);
    TimeZone.setDefault(TimeZone.getTimeZone("US/Eastern"));
    initCalendarAndParser();
  }
 
  @Test
  public void testRelative() throws Exception {
    Date reference = DateFormat.getDateTimeInstance(DateFormat.SHORT, 
        DateFormat.SHORT).parse("3/3/2011, 12:00 am");
    calendarSource = new CalendarSource(reference);
    
    DateGroup group = _parser.parse("every friday until two tuesdays from now", reference).get(0);
    Assert.assertEquals(1, group.getDates().size());
    validateDate(group.getDates().get(0), 3, 4, 2011);
    Assert.assertTrue(group.isRecurring());
    validateDate(group.getRecursUntil(), 3, 15, 2011);
    
    group = _parser.parse("every saturday or sunday", reference).get(0);
    Assert.assertEquals(2, group.getDates().size());
    validateDate(group.getDates().get(0), 3, 5, 2011);
    validateDate(group.getDates().get(1), 3, 6, 2011);
    Assert.assertTrue(group.isRecurring());
    Assert.assertNull(group.getRecursUntil());
  }
}
