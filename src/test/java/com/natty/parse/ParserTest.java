package com.natty.parse;

import java.util.Date;

import com.natty.Parser;

/**
 * Runs the DateParser through it's paces
 * 
 * @author Joe Stelmach
 */
public class ParserTest {
  public static void main(String[] args) throws Exception {
    Date date = Parser.parseDate("oct 1st at 8am");
    System.out.println(date);
  }
}
