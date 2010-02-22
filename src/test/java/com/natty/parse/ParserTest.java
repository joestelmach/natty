package com.natty.parse;

import java.io.ByteArrayInputStream;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.debug.BlankDebugEventListener;
import org.antlr.runtime.tree.CommonTreeNodeStream;
import org.antlr.runtime.tree.Tree;

import com.natty.date.ANTLRNoCaseInputStream;
import com.natty.date.Location;
import com.natty.date.ParseEventListener;
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
    String inputString = "10/10/2008 or 10/14 at 5pm pst";
    ANTLRInputStream input = null;
    Tree tree = null;
    DateParser parser = null;
    Printer printer = null;
    try {
      // lex
      input = new ANTLRNoCaseInputStream(new ByteArrayInputStream(inputString.getBytes()));
      DateLexer lexer = new DateLexer(input);
      CommonTokenStream tokens = new CommonTokenStream(lexer);
      
      // parse 
      ParseEventListener parseListener = new ParseEventListener();
      parser = new DateParser(tokens, parseListener);
      //parser = new DateParser(tokens);
      printer = new Printer(parser.getTokenNames());
      printer.printTokenStream(tokens);
      DateParser.search_return result = parser.search();
      
      // grab the tree
      tree = (Tree) result.getTree();
      StringBuilder builder = new StringBuilder();
      printer.printTree(tree, builder);
      System.out.println(builder.toString());
      
      // and walk it
      CommonTreeNodeStream nodes = new CommonTreeNodeStream(tree);
      nodes.setTokenStream(tokens);
      DateWalker walker = new DateWalker(nodes, new BlankDebugEventListener());
      //DateWalker walker = new DateWalker(nodes);
      walker.search();
      
      System.out.println(Arrays.toString(walker.getState().getDateTimes().toArray()));
      /*
      List<Location> locations = parseListener.getLocations();
      for(int i=0; i<locations.size(); i++) {
        Location loc = locations.get(i);
        Date date = walker.getState().getDateTimes().get(i);
        System.out.println(loc.getText() + ": " + loc.getStart() + " to " + loc.getEnd() + " -> " + date);
      }
      */
      
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
