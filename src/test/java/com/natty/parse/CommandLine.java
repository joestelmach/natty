package com.natty.parse;

import com.natty.date.DateTimeSearcher;

public class CommandLine {
  public static void main(String[] args) throws Exception {
    System.out.println(DateTimeSearcher.parseDate(args[0]));
  }
}
