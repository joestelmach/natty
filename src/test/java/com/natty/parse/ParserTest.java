package com.natty.parse;

import java.io.ByteArrayInputStream;
import java.util.Date;

import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.debug.BlankDebugEventListener;
import org.antlr.runtime.tree.CommonTreeNodeStream;
import org.antlr.runtime.tree.Tree;

import com.natty.date.ANTLRNoCaseInputStream;
import com.natty.date.generated.DateLexer;
import com.natty.date.generated.DateParser;
import com.natty.date.generated.DateWalker;
import com.natty.utility.Printer;

/**
 * Runs the DateParser through it's paces
 * 
 * @author Joe Stelmach
 */
public class ParserTest {
  public static void main(String[] args) {
    String inputString = "February 23rd!";
    ANTLRInputStream input = null;
    Date date = new Date();
    Tree tree = null;
    DateParser parser = null;
    Printer printer = null;
    try {
      // lex
      input = new ANTLRNoCaseInputStream(new ByteArrayInputStream(inputString.getBytes()));
      DateLexer lexer = new DateLexer(input);
      CommonTokenStream tokens = new CommonTokenStream(lexer);
      
      // parse 
      parser = new DateParser(tokens, new BlankDebugEventListener());
      printer = new Printer(parser.getTokenNames());
      printer.printTokenStream(tokens);
      DateParser.date_time_return result = parser.date_time();
      
      // grab the tree
      tree = (Tree) result.getTree();
      StringBuilder builder = new StringBuilder();
      printer.printTree(tree, builder);
      System.out.println(builder.toString());
      
      // and walk it
      CommonTreeNodeStream nodes = new CommonTreeNodeStream(tree);
      nodes.setTokenStream(tokens);
      DateWalker walker = new DateWalker(nodes, new BlankDebugEventListener());
      walker.date_time();
      date = walker.getState().getDateTimes().get(0);
      System.out.println(date);
      
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
