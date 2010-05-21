package com.natty.parse;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import junit.framework.Assert;

import org.junit.Test;

import com.joestelmach.natty.Parser;

/**
 * Runs the DateParser through it's paces
 * 
 * @author Joe Stelmach
 */
public class ParserTest {
  
  @Test
  public void todo() {
    Assert.assertTrue(true);
  }

  public static void main(String[] args) {
    String inputString = "next friday or saturday at 5pm";
    Parser parser = new Parser();
    parser.setDebug(true);
    List<Date> dateTimes = parser.parse(inputString).getDates();
    System.out.println(Arrays.toString(dateTimes.toArray()));
  }
}
