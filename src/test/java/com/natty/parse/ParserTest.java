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
    String inputString = "next friday or saturday at 5pm";
    Parser parser = new Parser();
    parser.setDebug(true);
    List<Date> dateTimes = parser.parse(inputString).getDates();
    System.out.println(Arrays.toString(dateTimes.toArray()));
  }
}
