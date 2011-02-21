package com.joestelmach.natty;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;

import junit.framework.Assert;

import org.junit.Test;

public class SearchTest extends AbstractTest {
  
  @Test
  public void test() throws Exception {
    Date reference = DateFormat.getDateInstance(DateFormat.SHORT).parse("2/20/2011");
    CalendarSource.setBaseDate(reference);
    
    Parser parser = new Parser();
    List<DateGroup> groups = parser.parse("golf tomorrow at 9 AM at pebble beach");
    Assert.assertEquals(1, groups.size());
    DateGroup group = groups.get(0);
    Assert.assertEquals(1, group.getLine());
    Assert.assertEquals(5, group.getPosition());
    Assert.assertEquals(1, group.getDates().size());
    validateDate(group.getDates().get(0), 2, 21, 2011);
    validateTime(group.getDates().get(0), 9, 0, 0);
    
    groups = parser.parse("golf with friends tomorrow at 10 ");
    Assert.assertEquals(1, groups.size());
    group = groups.get(0);
    Assert.assertEquals(1, group.getLine());
    Assert.assertEquals(18, group.getPosition());
    Assert.assertEquals(1, group.getDates().size());
    validateDate(group.getDates().get(0), 2, 21, 2011);
    validateTime(group.getDates().get(0), 10, 0, 0);
  }
}
