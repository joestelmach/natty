package com.joestelmach.natty;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import net.fortuna.ical4j.data.CalendarBuilder;
import net.fortuna.ical4j.model.Calendar;
import net.fortuna.ical4j.model.Component;
import net.fortuna.ical4j.model.DateTime;
import net.fortuna.ical4j.model.Period;
import edu.emory.mathcs.backport.java.util.Collections;

public class HolidayTest {
  
  public static void main(String[] args) throws Exception {
    InputStream fin = HolidayTest.class.getResourceAsStream("/holidays.ics");
    CalendarBuilder builder = new CalendarBuilder();
    Calendar cal = builder.build(fin);
    
     // Create the date range which is desired.
    DateTime from = new DateTime("20000101T070000Z");
    DateTime to = new DateTime("20301231T070000Z");;
    Period period = new Period(from, to);

    // For each VEVENT in the ICS
    Set<String> names = new HashSet<String>();
    for (Object o : cal.getComponents("VEVENT")) {
      Component c = (Component) o;
      names.add(c.getProperty("SUMMARY").getValue());
      
      /*
      PeriodList list = c.calculateRecurrenceSet(period);
      for (Object po : list) {
        Period p = (Period) po;
        System.out.println(p.getRangeStart());
        //System.out.println((Period) po);
      }
      */
    }
    List<String> list = new ArrayList<String>(names);
    Collections.sort(list);
    
    for(String name:list) {
      System.out.println(name);
    }
  }
}
