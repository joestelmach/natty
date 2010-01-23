package com.natty.parse;

import java.io.ByteArrayInputStream;
import java.util.List;

import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonToken;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.tree.CommonTreeNodeStream;
import org.antlr.runtime.tree.Tree;


/**
 * Runs the DateParser through it's paces
 * 
 * @author Joe Stelmach
 */
public class ParserTest {
  public static void main(String[] args) throws Exception {
    // lex input
    //ANTLRInputStream input = new ANTLRInputStream(new FileInputStream("src/test/resources/test_input.txt"));
    //String inputString = "twenty-second of jun, 1967 11p";
    String inputString = "this past mon";
    ANTLRInputStream input = new ANTLRInputStream(new ByteArrayInputStream(inputString.getBytes()));
    DateLexer lexer = new DateLexer(input);
    CommonTokenStream tokens = new CommonTokenStream(lexer);
    List<CommonToken> tokenList = (List<CommonToken>) tokens.getTokens();
    for(CommonToken t:tokenList) {
      System.out.println(t.getType() + ": " + t.getText());
    }
    DateParser  parser = new DateParser(tokens);
    DateParser.datetime_return result = parser.datetime();
    Tree tree = (Tree) result.getTree();
    System.out.println(tree.toStringTree());
    
    CommonTreeNodeStream nodes = new CommonTreeNodeStream(tree);
    nodes.setTokenStream(tokens);
    DateWalker walker = new DateWalker(nodes);
    walker.datetime();
  }
}
