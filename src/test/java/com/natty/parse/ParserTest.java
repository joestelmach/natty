package com.natty.parse;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import junit.framework.Assert;

import org.junit.Ignore;
import org.junit.Test;

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
        
        //"6 days ago",
        //"6 hours ago",
        //"10 hours before noon",
        //"10 hours before midnight",
        //"5 hours after noon",
        //"5 hours after midnight",
        //"in 5 seconds",
        //"in 5 minutes",
        //"in 5 hours",
        //"4 seconds from now",
        "4 min from now",
        "4 hrs from now",
        "4 sec from now",
        
        //"this second",
        //"next second",
        //"this minute",
        //"next minute",
        //"this hour",
        //"next hour",
    };
    
    for(String s:strings) {
      //System.out.println("*****");
      System.out.println(s);
      ParseResult result = parser.parse(s);
      List<Date> dateTimes = result.getDates();
      System.out.print(Arrays.toString(dateTimes.toArray()) + "\n");
      System.out.println(result.getSyntaxTree());
      //System.out.println("*****\n\n");
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
