package com.nattyparse.date;

import java.io.ByteArrayInputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import junit.framework.Assert;

import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonToken;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.tree.Tree;
import org.junit.Test;


/**
 * Runs the DateParser through it's paces
 * 
 * @author Joe Stelmach
 */
public class ParserTest {
  private static Map<String, String> _tests;
  
  static {
    _tests = new HashMap<String, String>();
    
    _tests.put("yesterday", "(RELATIVE_DATE BACKWARD 1)");
    _tests.put("tomorrow", "(RELATIVE_DATE FORWARD 1)");
    _tests.put("monday", "(RELATIVE_DATE FORWARD monday)");
    _tests.put("next monday", "(RELATIVE_DATE FORWARD monday)");
    _tests.put("last monday", "(RELATIVE_DATE BACKWARD monday)");
    _tests.put("last mon", "(RELATIVE_DATE BACKWARD monday)");
    _tests.put("next thurs", "(RELATIVE_DATE FORWARD thursday)");
    _tests.put("next month", "(RELATIVE_DATE FORWARD month)");
    _tests.put("last month", "(RELATIVE_DATE BACKWARD month)");
    _tests.put("next week", "(RELATIVE_DATE FORWARD week)");
    _tests.put("last week", "(RELATIVE_DATE BACKWARD week)");
    _tests.put("next year", "(RELATIVE_DATE FORWARD year)");
    _tests.put("last year", "(RELATIVE_DATE BACKWARD year)");
    _tests.put("the day after tomorrow", "(RELATIVE_DATE FORWARD 2)");
    _tests.put("the day before yesterday", "(RELATIVE_DATE BACKWARD 2)");
    _tests.put("2009-10-10", "(EXPLICIT_DATE 10 10 2009)");
    _tests.put("2009-12-31", "(EXPLICIT_DATE 12 31 2009)");
    _tests.put("09-12-31", "(EXPLICIT_DATE 09 12 31)");
    _tests.put("10/10/1970", "(EXPLICIT_DATE 10 10 1970)");
    _tests.put("10/10", "(EXPLICIT_DATE 10 10)");
    _tests.put("12/31", "(EXPLICIT_DATE 12 31)");
    _tests.put("10/2", "(EXPLICIT_DATE 10 2)");
    _tests.put("10/02", "(EXPLICIT_DATE 10 02)");
    _tests.put("28th of february, 1979", "(EXPLICIT_DATE 2 28 1979)");
    _tests.put("28th of february 1979", "(EXPLICIT_DATE 2 28 1979)");
    //_tests.put("28th of february in the year 1979", "(EXPLICIT_DATE 2 28 1979)");
    _tests.put("february 28th, 1979", "(EXPLICIT_DATE 2 28 1979)");
    _tests.put("feb 28th, 1979", "(EXPLICIT_DATE 2 28 1979)");
    _tests.put("february 28th 1979", "(EXPLICIT_DATE 2 28 1979)");
    _tests.put("feb 28th 1979", "(EXPLICIT_DATE 2 28 1979)");
    _tests.put("feb 28th", "(EXPLICIT_DATE 2 28)");
    _tests.put("feb twentieth", "(EXPLICIT_DATE 2 20)");
    _tests.put("feb twenty first", "(EXPLICIT_DATE 2 21)");
    _tests.put("feb twenty-first", "(EXPLICIT_DATE 2 21)");
    _tests.put("feb twentyfirst", "(EXPLICIT_DATE 2 21)");
  }
  
  /**
   * Runs all defined AST tests 
   * @throws Exception
   */
  @Test
  public void runAstTests() throws Exception {
    for(Entry<String, String> entry:_tests.entrySet()) {
      try {
        System.out.println(entry.getKey());
        Assert.assertEquals(entry.getValue().toLowerCase(), 
            createTreeString(entry.getKey()).toLowerCase());
      } catch(Exception e) {
        e.printStackTrace();
        throw e;
      }
    }
  }
  
  private String createTreeString(String input) throws Exception {
    ANTLRInputStream in = new ANTLRInputStream(new ByteArrayInputStream(input.getBytes()));
    DateLexer lexer = new DateLexer(in);
    CommonTokenStream tokens = new CommonTokenStream(lexer);
    DateParser  parser = new DateParser(tokens);
    DateParser.date_return result = parser.date();
    Tree tree = (Tree) result.getTree();
    return tree.toStringTree();
  }
  
  public static void main(String[] args) throws Exception {
    // lex input
    //ANTLRInputStream input = new ANTLRInputStream(new FileInputStream("src/test/resources/test_input.txt"));
    //String inputString = "twenty-second of jun, 1967 11p";
    String inputString = "tommorow";
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
    
    /*
    CommonTreeNodeStream nodes = new CommonTreeNodeStream(tree);
    nodes.setTokenStream(tokens);
    DateParserWalker walker = new DateParserWalker(nodes);
    walker.setTemplateLib(templates);
    DateParserWalker.search_return r2 = walker.search(false);
    StringTemplate output = (StringTemplate) r2.getTemplate();
    //StringTemplateTreeView viz = new StringTemplateTreeView("sample",output);
    //viz.setVisible(true);
    System.out.println(output.toString());
    */
    
  }
  
}
