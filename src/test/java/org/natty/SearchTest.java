package org.natty;

import junit.framework.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;

/**
 * 
 * @author Joe Stelmach
 */
public class SearchTest extends AbstractTest {
  @BeforeClass
  public static void oneTime() {
    Locale.setDefault(Locale.US);
    TimeZone.setDefault(TimeZone.getTimeZone("US/Eastern"));
    initCalendarAndParser();
  }
  
  @Test
  public void test() throws Exception {
    Date reference = DateFormat.getDateInstance(DateFormat.SHORT).parse("2/20/2011");
    calendarSource = new CalendarSource(reference);

    Parser parser = new Parser();
    List<DateGroup> groups = parser.parse("golf tomorrow at 9 AM at pebble beach", reference);
    Assert.assertEquals(1, groups.size());
    DateGroup group = groups.get(0);
    Assert.assertEquals(1, group.getLine());
    Assert.assertEquals(6, group.getPosition());
    Assert.assertEquals(1, group.getDates().size());
    validateDate(group.getDates().get(0), 2, 21, 2011);
    validateTime(group.getDates().get(0), 9, 0, 0);
    
    groups = parser.parse("golf with friends tomorrow at 10 ", reference);
    Assert.assertEquals(1, groups.size());
    group = groups.get(0);
    Assert.assertEquals(1, group.getLine());
    Assert.assertEquals(19, group.getPosition());
    Assert.assertEquals(1, group.getDates().size());
    validateDate(group.getDates().get(0), 2, 21, 2011);
    validateTime(group.getDates().get(0), 10, 0, 0);
    
    parser = new Parser();
    groups = parser.parse("golf with freinds tomorrow at 9 or Thursday at 10 am", reference);
    Assert.assertEquals(1, groups.size());
    List<Date> dates = groups.get(0).getDates();
    Assert.assertEquals(2, dates.size());
    validateDate(dates.get(0), 2, 21, 2011); 
    validateTime(dates.get(0), 9, 0, 0); 
    validateDate(dates.get(1), 2, 24, 2011); 
    validateTime(dates.get(1), 10, 0, 0); 
    
    groups = parser.parse("golf with friends tomorrow at 9 or Thursday at 10", reference);
    Assert.assertEquals(1, groups.size());
    dates = groups.get(0).getDates();
    Assert.assertEquals(2, dates.size());
    validateDate(dates.get(0), 2, 21, 2011); 
    validateTime(dates.get(0), 9, 0, 0); 
    validateDate(dates.get(1), 2, 24, 2011); 
    validateTime(dates.get(1), 10, 0, 0); 
    
    groups = parser.parse("I want to go to park tomorrow and then email john@aol.com", reference);
    Assert.assertEquals(1, groups.size());
    dates = groups.get(0).getDates();
    Assert.assertEquals(1, dates.size());
    validateDate(dates.get(0), 2, 21, 2011); 
    
    groups = parser.parse("I want to pay off all my debt in the next two years.", reference);
    Assert.assertEquals(1, groups.size());
    dates = groups.get(0).getDates();
    Assert.assertEquals(2, dates.size());
    validateDate(dates.get(0), 2, 20, 2011); 
    validateDate(dates.get(1), 2, 20, 2013); 
    
    groups = parser.parse("I want to purchase a car in the next month.", reference);
    Assert.assertEquals(1, groups.size());
    dates = groups.get(0).getDates();
    Assert.assertEquals(1, dates.size());
    validateDate(dates.get(0), 3, 20, 2011); 
    
    groups = parser.parse("I want to plan a get-together with my friends for this Friday.", reference);
    Assert.assertEquals(1, groups.size());
    dates = groups.get(0).getDates();
    Assert.assertEquals(1, dates.size());
    validateDate(dates.get(0), 2, 25, 2011); 
    
    groups = parser.parse("I want to lose five pounds in the next two months.", reference);
    Assert.assertEquals(1, groups.size());
    dates = groups.get(0).getDates();
    Assert.assertEquals(2, dates.size());
    validateDate(dates.get(0), 2, 20, 2011); 
    validateDate(dates.get(1), 4, 20, 2011); 
    
    groups = parser.parse("I want to finalize my college schedule by next week.", reference);
    Assert.assertEquals(1, groups.size());
    dates = groups.get(0).getDates();
    Assert.assertEquals(1, dates.size());
    validateDate(dates.get(0), 2, 27, 2011); 
    
    groups = parser.parse("I want to read this weekend.", reference);
    Assert.assertEquals(1, groups.size());
    dates = groups.get(0).getDates();
    Assert.assertEquals(1, dates.size());
    validateDate(dates.get(0), 2, 26, 2011); 
    
    groups = parser.parse("I want to travel a big chunk of world next year.", reference);
    Assert.assertEquals(1, groups.size());
    dates = groups.get(0).getDates();
    Assert.assertEquals(1, dates.size());
    validateDate(dates.get(0), 2, 20, 2012); 
    
    groups = parser.parse("last 2 weeks", reference);
    Assert.assertEquals(1, groups.size());
    dates = groups.get(0).getDates();
    Assert.assertEquals(2, dates.size());
    validateDate(dates.get(0), 2, 20, 2011); 
    validateDate(dates.get(1), 2, 6, 2011); 
    
    groups = parser.parse("last 5 years", reference);
    Assert.assertEquals(1, groups.size());
    dates = groups.get(0).getDates();
    Assert.assertEquals(2, dates.size());
    validateDate(dates.get(0), 2, 20, 2011); 
    validateDate(dates.get(1), 2, 20, 2006); 
    
    groups = parser.parse("next 5 years", reference);
    Assert.assertEquals(1, groups.size());
    dates = groups.get(0).getDates();
    Assert.assertEquals(2, dates.size());
    validateDate(dates.get(0), 2, 20, 2011); 
    validateDate(dates.get(1), 2, 20, 2016); 
    
    groups = parser.parse("I want to go to my doctors appointment on May 15, 2011.", reference);
    Assert.assertEquals(1, groups.size());
    dates = groups.get(0).getDates();
    Assert.assertEquals(1, dates.size());
    validateDate(dates.get(0), 5, 15, 2011); 
    
    groups = parser.parse("I intend to become a zombie on December, 21st 2012.", reference);
    Assert.assertEquals(1, groups.size());
    dates = groups.get(0).getDates();
    Assert.assertEquals(1, dates.size());
    validateDate(dates.get(0), 12, 21, 2012); 
    
    groups = parser.parse("I want to hire a virtual assistant to do research for me on March 15, 2011", reference);
    Assert.assertEquals(1, groups.size());
    dates = groups.get(0).getDates();
    Assert.assertEquals(1, dates.size());
    validateDate(dates.get(0), 3, 15, 2011); 
    
    groups = parser.parse("I want to see my mother on sunday.", reference);
    Assert.assertEquals(1, groups.size());
    dates = groups.get(0).getDates();
    Assert.assertEquals(1, dates.size());
    validateDate(dates.get(0), 2, 27, 2011); 
    
    groups = parser.parse("I want to be able to jog 3 miles non-stop by September.", reference);
    Assert.assertEquals(1, groups.size());
    dates = groups.get(0).getDates();
    Assert.assertEquals(1, dates.size());
    validateDate(dates.get(0), 9, 1, 2011);
    
    groups = parser.parse("I want to lose 10 lbs in 10 days", reference);
    Assert.assertEquals(1, groups.size());
    dates = groups.get(0).getDates();
    Assert.assertEquals(1, dates.size());
    validateDate(dates.get(0), 3, 2, 2011); 
    
    groups = parser.parse("I want to visit my grandfathers grave on December 30 2011", reference);
    Assert.assertEquals(1, groups.size());
    dates = groups.get(0).getDates();
    Assert.assertEquals(1, dates.size());
    validateDate(dates.get(0), 12, 30, 2011); 
    
    groups = parser.parse("i want to have 1 kid this year", reference);
    Assert.assertEquals(1, groups.size());
    dates = groups.get(0).getDates();
    Assert.assertEquals(1, dates.size());
    validateDate(dates.get(0), 2, 20, 2011); 

    groups = parser.parse("save $1000 by September", reference);
    Assert.assertEquals(1, groups.size());
    dates = groups.get(0).getDates();
    Assert.assertEquals(1, dates.size());
    validateDate(dates.get(0), 9, 1, 2011);

    groups = parser.parse("have my son play at muse music in provo UT at the 3 band cause they always have fog on the third band at 7:30", reference);
    Assert.assertEquals(1, groups.size());
    dates = groups.get(0).getDates();
    Assert.assertEquals(1, dates.size());
    validateDateTime(dates.get(0), 2, 20, 2011, 7, 30, 0); 
    
    groups = parser.parse("i want to eat chinese tonight", reference);
    Assert.assertEquals(1, groups.size());
    dates = groups.get(0).getDates();
    Assert.assertEquals(1, dates.size());
    validateDateTime(dates.get(0), 2, 20, 2011, 20, 0, 0); 
    
    groups = parser.parse("Watch School Spirits on June 20 on syfy channel", reference);
    Assert.assertEquals(1, groups.size());
    dates = groups.get(0).getDates();
    Assert.assertEquals(1, dates.size());
    validateDate(dates.get(0), 6, 20, 2011);
    
    groups = parser.parse("Watch School Spirits on June 20 on", reference);
    Assert.assertEquals(1, groups.size());
    dates = groups.get(0).getDates();
    Assert.assertEquals(1, dates.size());
    validateDate(dates.get(0), 6, 20, 2011);
    
    groups = parser.parse("Watch School Spirits on June 20", reference);
    Assert.assertEquals(1, groups.size());
    dates = groups.get(0).getDates();
    Assert.assertEquals(1, dates.size());
    validateDate(dates.get(0), 6, 20, 2011);
    
    groups = parser.parse("hillary clinton sep 13, 2013", reference);
    Assert.assertEquals(1, groups.size());
    dates = groups.get(0).getDates();
    Assert.assertEquals(1, dates.size());
    validateDate(dates.get(0), 9, 13, 2013);
    Assert.assertEquals(17, groups.get(0).getPosition());
    Assert.assertEquals("sep 13, 2013", groups.get(0).getText());
    
    groups = parser.parse("hillary clinton 9/13/2013", reference);
    Assert.assertEquals(1, groups.size());
    dates = groups.get(0).getDates();
    Assert.assertEquals(1, dates.size());
    validateDate(dates.get(0), 9, 13, 2013);
    Assert.assertEquals(17, groups.get(0).getPosition());
    Assert.assertEquals("9/13/2013", groups.get(0).getText());
    
    groups = parser.parse("hillary clintoo sep 13, 2013", reference);
    Assert.assertEquals(1, groups.size());
    dates = groups.get(0).getDates();
    Assert.assertEquals(1, dates.size());
    validateDate(dates.get(0), 9, 13, 2013);
    Assert.assertEquals(17, groups.get(0).getPosition());
    Assert.assertEquals("sep 13, 2013", groups.get(0).getText());
    
    groups = parser.parse("clinton sep 13 2013", reference);
    Assert.assertEquals(1, groups.size());
    dates = groups.get(0).getDates();
    Assert.assertEquals(1, dates.size());
    validateDate(dates.get(0), 9, 13, 2013);
    Assert.assertEquals(9, groups.get(0).getPosition());
    Assert.assertEquals("sep 13 2013", groups.get(0).getText());
    
    groups = parser.parse("wedding dinner with Pam", reference);
    Assert.assertEquals(0, groups.size());
    
    groups = parser.parse("yummy fried chicken", reference);
    Assert.assertEquals(0, groups.size());
    
    groups = parser.parse("I am friend with Pam", reference);
    Assert.assertEquals(0, groups.size());
    
    groups = parser.parse("bfriday blah blah", reference);
    Assert.assertEquals(0, groups.size());
    
    groups = parser.parse("dinner bmong friends", reference);
    Assert.assertEquals(0, groups.size());

    groups = parser.parse("I know we should meet tomorrow", reference);
    Assert.assertEquals(1, groups.size());
    dates = groups.get(0).getDates();
    Assert.assertEquals(1, dates.size());
    validateDate(dates.get(0), 2, 21, 2011);

    groups = parser.parse("**SHOT 01/31/15**", reference);
    Assert.assertEquals(1, groups.size());
    dates = groups.get(0).getDates();
    Assert.assertEquals(1, dates.size());
    validateDate(dates.get(0), 1, 31, 2015);

    groups = parser.parse("KOSTROMA REGION, RUSSIA. SEPTEMBER 24, 2014. A woman cleaning up fallen leaves on the grounds of the Shchelykovo museum reserve of Russian playwright Alexander Ostrovsky.", reference);
    Assert.assertEquals(1, groups.size());
    dates = groups.get(0).getDates();
    Assert.assertEquals(1, dates.size());
    validateDate(dates.get(0), 9, 24, 2014);

    groups = parser.parse("21 November 2014-NYC-USA **** STRICTLY NOT AVAILABLE FOR USA ***", reference);
    Assert.assertEquals(1, groups.size());
    dates = groups.get(0).getDates();
    Assert.assertEquals(1, dates.size());
    validateDate(dates.get(0), 11, 21, 2014);

    groups = parser.parse("...all the backstory I needed in the first two minutes. From there, I....", reference);
    Assert.assertEquals(1, groups.size());
    dates = groups.get(0).getDates();
    Assert.assertEquals(1, dates.size());
    validateDateTime(dates.get(0), 2, 20, 2011, 0, 2, 0);

    groups = parser.parse("earthquake occured 5km NNW of Vincent, California at 07:34 UTC! #earthquake #Vincent http://t.co/6e4fAC6hTU", reference);
    Assert.assertEquals(1, groups.size());
    dates = groups.get(0).getDates();
    Assert.assertEquals(1, dates.size());
    validateDateTime(dates.get(0), 2, 20, 2011, 2, 34, 0);

    groups = parser.parse("Caricature: Person with anti-German foreign press. From: Le Rire, Paris, Spring 1933.", reference);
    Assert.assertEquals(1, groups.size());
    dates = groups.get(0).getDates();
    Assert.assertEquals(1, dates.size());
    validateDate(dates.get(0), 3, 20, 1933);

    groups = parser.parse("Person with Generaloberst von Seeckt in Bad Nauheim. Photograph. Autumn 1936", reference);
    Assert.assertEquals(1, groups.size());
    dates = groups.get(0).getDates();
    Assert.assertEquals(1, dates.size());
    validateDate(dates.get(0), 9, 23, 1936);
  }

  @Test
  public void testLocations() throws Exception {
    Date reference = DateFormat.getDateInstance(DateFormat.SHORT).parse("2/20/2011");
    calendarSource = new CalendarSource(reference);

    Parser parser = new Parser();
    List<DateGroup> groups = parser.parse("I want to go to the movies on september 1st.  Or maybe we should go on October 3rd.", reference);
    Assert.assertEquals(2, groups.size());
    DateGroup group = groups.get(0);
    Assert.assertEquals(1, group.getLine());
    Assert.assertEquals(31, group.getPosition());
    group = groups.get(1);
    Assert.assertEquals(1, group.getLine());
    Assert.assertEquals(72, group.getPosition());

    groups = parser.parse("I want to go to \nthe movies on september 1st to see The Alan Turing Movie.", reference);
    Assert.assertEquals(1, groups.size());
    group = groups.get(0);
    Assert.assertEquals(2, group.getLine());
    Assert.assertEquals(15, group.getPosition());
  }

  @Test
  public void testPrefixSuffix() throws Exception {

    Date reference = DateFormat.getDateInstance(DateFormat.SHORT).parse("2/20/2011");
    calendarSource = new CalendarSource(reference);

    // no prefix or suffix
    Parser parser = new Parser();
    List<DateGroup> groups = parser.parse("Sept. 1st");
    Assert.assertEquals(1, groups.size());
    DateGroup group = groups.get(0);
    Assert.assertEquals(0, group.getPrefix(3).length());
    Assert.assertEquals(0, group.getSuffix(3).length());

    // no prefix
    groups = parser.parse("Sept. 1st is the date");
    Assert.assertEquals(1, groups.size());
    group = groups.get(0);
    Assert.assertEquals(0, group.getPrefix(3).length());
    String suffix = group.getSuffix(3);
    Assert.assertEquals(3, suffix.length());
    Assert.assertEquals(" is",suffix);

    // no suffix
    groups = parser.parse("The date is Sept. 1st");
    Assert.assertEquals(1, groups.size());
    group = groups.get(0);
    String prefix = group.getPrefix(3);
    Assert.assertEquals(3, prefix.length());
    Assert.assertEquals("is ", prefix);
    Assert.assertEquals(0, group.getSuffix(3).length());

    // ask for a larger prefix than available
    groups = parser.parse("a Sept. 1st");
    Assert.assertEquals(1, groups.size());
    group = groups.get(0);
    prefix = group.getPrefix(5);
    Assert.assertEquals(2, prefix.length());
    Assert.assertEquals("a ", prefix);
    Assert.assertEquals(0, group.getSuffix(3).length());

    // ask for a larger suffix than available
    groups = parser.parse("Sept. 1st a");
    Assert.assertEquals(1, groups.size());
    group = groups.get(0);
    suffix = group.getSuffix(5);
    Assert.assertEquals(2,suffix.length());
    Assert.assertEquals(" a", suffix);
    Assert.assertEquals(0, group.getPrefix(3).length());

    // ask for a larger prefix and suffix than available
    groups = parser.parse("a Sept. 1st a");
    Assert.assertEquals(1, groups.size());
    group = groups.get(0);
    prefix = group.getPrefix(5);
    suffix = group.getSuffix(5);
    Assert.assertEquals(2,prefix.length());
    Assert.assertEquals("a ", prefix);
    Assert.assertEquals(2,suffix.length());
    Assert.assertEquals(" a", suffix);
  }

  @Test
  public void testNoDates() {
    List<Date> dates = parseCollection(new Date(), "Fried Chicken, Wedding Dinner");
    Assert.assertEquals(0, dates.size());

    parseCollection(new Date(), "Cleveland");
    Assert.assertEquals(0, dates.size());
  }

}
