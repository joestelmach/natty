package com.natty.parse;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import junit.framework.Assert;

import org.junit.Test;

import com.joestelmach.natty.ParseResult;
import com.joestelmach.natty.Parser;

/**
 * Runs the DateParser through it's paces
 * 
 * @author Joe Stelmach
 */
public class ParserTest {
  
  @Test
  public void leadingSpace() {
    Parser parser = new Parser();
    ParseResult result = parser.parse("  02/18/1985 ");
    Assert.assertEquals(1, result.getDates().size());
  }

  public static void main(String[] args) {
  String inputString = "";
  //inputString = "10th of 3 octobers from now";
  //inputString = "10th of next month";
  //inputString = "28th of last month";
  //inputString = "10th of next october";
  //inputString = "the 30th of this month";
  //inputString = "monday of last week";
  //inputString = "tuesday of next week";
  //inputString = "the monday of 2 weeks ago";
  inputString = "tuesday of 3 weeks from now";
    //String inputString = "monday of 3 weeks from now";
    Parser parser = new Parser();
    parser.setDebug(true);
    ParseResult result = parser.parse(inputString);
    System.out.println(result.getSyntaxTree());
    List<Date> dateTimes = result.getDates();
    System.out.println(Arrays.toString(dateTimes.toArray()));
  }
}
