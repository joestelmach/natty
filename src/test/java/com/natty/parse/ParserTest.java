package com.natty.parse;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Date;

import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTreeNodeStream;
import org.antlr.runtime.tree.Tree;

import com.natty.utility.StructureBuilder;

/**
 * Runs the DateParser through it's paces
 * 
 * @author Joe Stelmach
 */
public class ParserTest {
  public static void main(String[] args) throws Exception {
    
    String inputString = "next oct at 10am";
    ANTLRInputStream input = null;
    try {
      // lex
      input = new ANTLRInputStream(new ByteArrayInputStream(inputString.getBytes()));
      DateLexer lexer = new DateLexer(input);
      CommonTokenStream tokens = new CommonTokenStream(lexer);
      
      // parse 
      StructureBuilder builder = new StructureBuilder();
      DateParser parser = new DateParser(tokens, builder);
      DateParser.date_time_return result = parser.date_time();
      System.out.println(builder.toJSON());
      
      // walk
      Tree tree = (Tree) result.getTree();
      CommonTreeNodeStream nodes = new CommonTreeNodeStream(tree);
      nodes.setTokenStream(tokens);
      DateWalker walker = new DateWalker(nodes);
      walker.date_time();
      
      Date date = walker.getState().getDate();
      
    } catch (IOException e) {
      e.printStackTrace();
      
    } catch (RecognitionException e) {
      e.printStackTrace();
    }
  }
}
