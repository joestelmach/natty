package com.natty.parse;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import com.joestelmach.natty.ParseResult;
import com.joestelmach.natty.Parser;

/**
 * Runs the DateParser through it's paces
 * 
 * @author Joe Stelmach
 */
public class ParserTest {
  
  public static void main(String[] args) throws Exception {
    Parser parser = new Parser();
    parser.setDebug(true);
    
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
  }
}
