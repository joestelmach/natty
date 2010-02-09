package com.natty.parse;

import java.util.Scanner;

import com.natty.Parser;

public class CommandLine {
  public static void main(String[] args) throws Exception {
    System.out.println("throw me a date");
    String sentence;
    Scanner scan = new Scanner(System.in); 
    while((sentence = scan.nextLine()) != null) {
      ParserState state = Parser.parseDate(sentence);
      System.out.println(state.getDate());
    }
  }
}
