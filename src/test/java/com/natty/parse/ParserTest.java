package com.natty.parse;

import com.natty.date.DateTimeSearcher;

/**
 * Runs the DateParser through it's paces
 * 
 * @author Joe Stelmach
 */
public class ParserTest {
  public static void main(String[] args) {
    long start = System.currentTimeMillis();
    String inputString = "nov 21 please attend my party at 6pm";
    System.out.println(DateTimeSearcher.search(inputString));
    System.out.println("completed in " + (System.currentTimeMillis() - start) + " millis");
  }
}
