package com.natty.parse;

import com.natty.date.DateTimeSearcher;

public class CommandLine {
  public static void main(String[] args) {
    if(args.length > 1 && args[0].equals("--search")) {
      String input = args[1];
      System.out.println(DateTimeSearcher.search(input));
    }
    else {
      System.out.println(DateTimeSearcher.parseDate(args[0]));
    }
  }
}
