package com.natty.parse;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Date;

import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTreeNodeStream;
import org.antlr.runtime.tree.Tree;

import com.natty.utility.Printer;

/**
 * Runs the DateParser through it's paces
 * 
 * @author Joe Stelmach
 */
public class SearchTest {
  private static DateParser _parser;
  public static void main(String[] args) throws Exception {
    //Date date = Parser.parseDate("oct 1");
    //System.out.println(date);
    
    String inputString = "will foo bar 10/10/2009 asdf";
    ANTLRInputStream input = null;
    try {
      // lex
      input = new ANTLRInputStream(new ByteArrayInputStream(inputString.getBytes()));
      DateLexer lexer = new DateLexer(input);
      CommonTokenStream tokens = new CommonTokenStream(lexer);
    
      // parse 
      input = new ANTLRInputStream(new ByteArrayInputStream(inputString.getBytes()));
      _parser = new DateParser(tokens);
      DateParser.search_return result = _parser.search();
      Tree tree = (Tree) result.getTree();
      //System.out.println(tree.toStringTree());
      
      // walk
      CommonTreeNodeStream nodes = new CommonTreeNodeStream(tree);
      nodes.setTokenStream(tokens);
      DateWalker walker = new DateWalker(nodes);
      walker.date_time();
      
      Printer printer = new Printer(_parser.getTokenNames());
      printer.printTokenStream(tokens);
      printer.printTree(tree);
      
      Date date = walker.getState().getDate();
      System.out.println("");
      System.out.println(date);
    } catch (IOException e) {
      e.printStackTrace();
      
    } catch (RecognitionException e) {
      e.printStackTrace();
    }
  }
}
