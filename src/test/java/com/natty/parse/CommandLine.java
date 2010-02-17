package com.natty.parse;

import com.natty.date.Parser;

public class CommandLine {
  public static void main(String[] args) throws Exception {
    System.out.println(Parser.parseDate(args[0]));
  }
}
