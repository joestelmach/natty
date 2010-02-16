package com.natty.parse;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Date;

import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenSource;
import org.antlr.runtime.debug.BlankDebugEventListener;
import org.antlr.runtime.tree.CommonTreeNodeStream;
import org.antlr.runtime.tree.Tree;

import com.natty.utility.Printer;
import com.natty.utility.StructureBuilder;

/**
 * Runs the DateParser through it's paces
 * 
 * @author Joe Stelmach
 */
public class ParserTest {
  public static void main(String[] args) throws Exception {
    String inputString = "oct 1st bbbbbbb bbbbbbbb nov 2nd xxxxx oct 2";
    ANTLRInputStream input = null;
    StructureBuilder builder = new StructureBuilder();
    Date date = new Date();
    try {
      // lex
      input = new ANTLRNoCaseInputStream(new ByteArrayInputStream(inputString.getBytes()));
      DateLexer lexer = new DateLexer(input);
      TokenSource tokenSource = new ScrubbedTokenSource(new CommonTokenStream(lexer));
      CommonTokenStream tokens = new CommonTokenStream(tokenSource);
      
      // parse 
      DateParser parser = new DateParser(tokens, builder);
      //DateParser parser = new DateParser(tokens);
      DateParser.search_return result = parser.search();
      Printer printer = new Printer(parser.getTokenNames());
      printer.printTokenStream(tokens);
      
      // walk
      Tree tree = (Tree) result.getTree();
      printer.printTree(tree);
      System.out.print("\n");
      CommonTreeNodeStream nodes = new CommonTreeNodeStream(tree);
      nodes.setTokenStream(tokens);
      DateWalker walker = new DateWalker(nodes, new BlankDebugEventListener());
      //DateWalker walker = new DateWalker(nodes);
      walker.date_time();
      date = walker.getState().getDate();
      
    } catch (IOException e) {
      e.printStackTrace();
      
    } catch (RecognitionException e) {
      e.printStackTrace();
    }
    
    System.out.println(date);
    System.out.println(builder.toJSON());
  }
}
