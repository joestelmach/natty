package com.natty.utility;

import com.natty.date.Parser;

public class CommandLine {
  public static void main(String[] args) {
    
    if(args.length == 0) {
      System.out.println("Please provide an input string to parse as the first parameter");
      return;
    }
    
    Parser parser = new Parser();
    System.out.println(parser.parse(args[0]));
  }
}
