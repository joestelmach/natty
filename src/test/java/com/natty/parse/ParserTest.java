package com.natty.parse;

import java.io.ByteArrayInputStream;
import java.io.IOException;

import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.Tree;

import com.natty.utility.Printer;

/**
 * Runs the DateParser through it's paces
 * 
 * @author Joe Stelmach
 */
public class ParserTest {
  private static DateParser _parser;
  public static void main(String[] args) throws Exception {
    //Date date = Parser.parseDate("oct 1");
    //System.out.println(date);
    
    String inputString = "oct 10, 10pm";
    ANTLRInputStream input = null;
    try {
      // lex
      input = new ANTLRInputStream(new ByteArrayInputStream(inputString.getBytes()));
      DateLexer lexer = new DateLexer(input);
      CommonTokenStream tokens = new CommonTokenStream(lexer);
    
      // parse 
      input = new ANTLRInputStream(new ByteArrayInputStream(inputString.getBytes()));
      _parser = new DateParser(tokens);
      DateParser.datetime_return result = _parser.datetime();
      Tree tree = (Tree) result.getTree();
      //printTree(tree, 0);
      
      // walk
      /*
      CommonTreeNodeStream nodes = new CommonTreeNodeStream(tree);
      nodes.setTokenStream(tokens);
      DateWalker walker = new DateWalker(nodes);
      walker.datetime();
      //date = walker.getDate();
      */
      Printer printer = new Printer(_parser.getTokenNames());
      printer.printTokenStream(tokens);
      printer.printTree(tree);
      
      
    } catch (IOException e) {
      e.printStackTrace();
      
    } catch (RecognitionException e) {
      e.printStackTrace();
    }
  }
  
  public static void printTree(Tree tree, int level) {
    for(int i=0; i<level; i++) System.out.print(" ");
    
    int childCount = tree.getChildCount();
    if(childCount > 0) System.out.print("(");
    
    String tokenType = _parser.getTokenNames()[tree.getType()];
    String tokenValue = tree.getText();
    
    System.out.print((tokenType.equals(tokenValue) ? tokenType : tokenType + "[" + tree.getText() + "]"));
    
    for(int i=0; i<childCount; i++) {
      printTree(tree.getChild(i), level + 1);
    }
    
    if(childCount > 0) System.out.print(")");
  }
}
