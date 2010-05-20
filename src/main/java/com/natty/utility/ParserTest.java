package com.natty.utility;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import com.natty.date.Parser;

/**
 * Runs the DateParser through it's paces
 * 
 * @author Joe Stelmach
 */
public class ParserTest {
  public static void main(String[] args) {
    String inputString = "10/10 or 12/30 or 10/15 at 5pm";
    Parser parser = new Parser();
    parser.setDebug(true);
    List<Date> dateTimes = parser.parse(inputString).getDateTimes();
    System.out.println(Arrays.toString(dateTimes.toArray()));
  }
}
