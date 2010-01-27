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
    Date date = Parser.parseDate("next oct at 1");
    System.out.println(date);
  }
}
