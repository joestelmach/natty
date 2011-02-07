package com.natty.parse;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import junit.framework.Assert;

import org.junit.Ignore;
import org.junit.Test;

import com.joestelmach.natty.ParseLocation;
import com.joestelmach.natty.ParseResult;
import com.joestelmach.natty.Parser;

/**
 * Runs the DateParser through it's paces
 * 
 * @author Joe Stelmach
 */
public class ParserTest {
  @Ignore
  @Test
  public void testRelativeTimes() {
    //Date currentDate = new Date();
    Assert.assertNotNull(parseSingleDate("6 days ago"));
  }
  
  private Date parseSingleDate(String value) {
    Parser parser = new Parser();
    ParseResult result = parser.parse(value);
    List<Date> dateTimes = result.getDates();
    return dateTimes.get(0);
  }
  
  public static void main(String[] args) throws Exception {
    Parser parser = new Parser();
    parser.setDebug(true);
    String[] strings = new String[]{
        "6 in the morning",
        "4 in the afternoon",
        "monday 6 in the morning",
        "monday 4 in the afternoon",
        "monday 9 in the evening",
        "evening",
        "this morning",
        "this afternoon",
        "this evening",
        "today evening",
        "tomorrow evening",
        "thursday evening",
        "final thursday in april",
        "final thurs in sep",
        "tomorrow @ noon",
        "4th february ",
        "10 hours before noon",
        "10 hours before midnight",
        "5 hours after noon",
        "5 hours after midnight",
        "in 5 seconds",
        "in 5 minutes",
        "in 5 hours",
        "4 seconds from now",
        "4 minutes from now",
        "4 hours from now",
        "monday to friday",
        "1 April to 31 August",
        "1999-12-31 to tomorrow",
        "now to 2010-01-01",
        "2009-03-10 9:00 to 11:00",
        "26 oct 10:00 am to 11:00 am",
        "jan 1 to 2",
        "16:00 nov 6 to 17:00",
        "may 2nd to 5th",
        "6am dec 5 to 7am",
        "1/3 to 2/3",
        "2/3 to in 1 week",
        "3/3 21:00 to in 5 days",
        "first day of may to last day of may",
    };
    
    for(String s:strings) {
      System.out.println("*****");
      System.out.println(s);
      ParseResult result = parser.parse(s);
      List<Date> dateTimes = result.getDates();
      System.out.print(Arrays.toString(dateTimes.toArray()) + "\n");
      System.out.println(result.getSyntaxTree());
      System.out.println("*****\n\n");
    }
    
    
    /*
    BufferedReader in = new BufferedReader(new InputStreamReader(ParserTest.class.getResourceAsStream("/cpan.txt")));
    String line = null;
    while((line = in.readLine()) != null) {
      if(line.startsWith("!")) continue;
      if(line.startsWith("#")) line = line.substring(1);
      
      System.out.print(line + " -> ");
      try {
        ParseResult result = parser.parse(line.trim());
        //System.out.println(result.getSyntaxTree());
        List<Date> dateTimes = result.getDates();
        System.out.print(Arrays.toString(dateTimes.toArray()) + "\n");
      } catch(Exception e) {
        System.out.print("no good");
      }
    }
    */
  }
}
