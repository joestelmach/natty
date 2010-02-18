package com.natty.parse;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Date;

import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.debug.BlankDebugEventListener;
import org.antlr.runtime.tree.CommonTreeNodeStream;
import org.antlr.runtime.tree.Tree;

import com.natty.date.ANTLRNoCaseInputStream;
import com.natty.date.StructureBuilder;
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
  public static void main(String[] args) throws Exception {
    long start = System.currentTimeMillis();
    String inputString = "21 Nov 1998 afasdf a  aasdf foo oct 1st at 3pm";
    ANTLRInputStream input = null;
    StructureBuilder builder = new StructureBuilder();
    Date date = new Date();
    try {
      // lex
      input = new ANTLRNoCaseInputStream(new ByteArrayInputStream(inputString.getBytes()));
      DateLexer lexer = new DateLexer(input);
      CommonTokenStream tokens = new CommonTokenStream(lexer);
      
      // parse 
      DateParser parser = new DateParser(tokens, builder);
      //DateParser parser = new DateParser(tokens);
      Printer printer = new Printer(parser.getTokenNames());
      printer.printTokenStream(tokens);
      
      DateParser.search_return result = parser.search();
      
      // walk
      Tree tree = (Tree) result.getTree();
      System.out.println(tree.toStringTree());
      //printer.printTree(tree);
      //System.out.print("\n");
      CommonTreeNodeStream nodes = new CommonTreeNodeStream(tree);
      nodes.setTokenStream(tokens);
      DateWalker walker = new DateWalker(nodes, new BlankDebugEventListener());
      //DateWalker walker = new DateWalker(nodes);
      walker.search();
      //date = walker.getState().getDate();
      
    } catch (IOException e) {
      e.printStackTrace();
      
    } catch (RecognitionException e) {
      e.printStackTrace();
    }
    
    System.out.println(date);
    System.out.println(builder.toJSON());
    System.out.println("completed in " + (System.currentTimeMillis() - start) + " millis");
  }
}
