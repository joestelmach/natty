package com.natty;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Date;

import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTreeNodeStream;
import org.antlr.runtime.tree.Tree;

import com.natty.parse.DateLexer;
import com.natty.parse.DateParser;
import com.natty.parse.DateWalker;

public class Parser {
  public static Date parseDate(final String inputString) {
    Date date = null;
    ANTLRInputStream input = null;
    try {
      // lex
      input = new ANTLRInputStream(new ByteArrayInputStream(inputString.getBytes()));
      DateLexer lexer = new DateLexer(input);
      CommonTokenStream tokens = new CommonTokenStream(lexer);
    
      // parse 
      input = new ANTLRInputStream(new ByteArrayInputStream(inputString.getBytes()));
      DateParser  parser = new DateParser(tokens);
      DateParser.date_time_return result = parser.date_time();
      Tree tree = (Tree) result.getTree();
      System.out.println(tree.toStringTree());
      
      // walk
      CommonTreeNodeStream nodes = new CommonTreeNodeStream(tree);
      nodes.setTokenStream(tokens);
      DateWalker walker = new DateWalker(nodes);
      walker.date_time();
      date = walker.getDate();
      
    } catch (IOException e) {
      e.printStackTrace();
      
    } catch (RecognitionException e) {
      e.printStackTrace();
    }
    
    return date;
  }
}
