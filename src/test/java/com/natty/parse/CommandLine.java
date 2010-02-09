package com.natty.parse;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.TimeZone;

import com.natty.Parser;

public class CommandLine {
  public static void main(String[] args) throws Exception {
    System.out.println("throw me a date");
    String sentence;
    Scanner scan = new Scanner(System.in); 
    while((sentence = scan.nextLine()) != null) {
      ParserState state = Parser.parseDate(sentence);
      DateFormat formatter = new SimpleDateFormat("MMM dd, yyyy hh:mm a z");
      formatter.setTimeZone(TimeZone.getTimeZone("America/New_York"));
      System.out.println(formatter.format(state.getDate()));
    }
  }
}
