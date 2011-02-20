package com.natty.joestelmach.grammar;

import java.io.ByteArrayInputStream;
import java.lang.reflect.Method;

import junit.framework.Assert;

import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.ParserRuleReturnScope;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeNodeStream;
import org.antlr.runtime.tree.Tree;

import com.joestelmach.natty.ANTLRNoCaseInputStream;
import com.joestelmach.natty.ParseListener;
import com.joestelmach.natty.generated.DateLexer;
import com.joestelmach.natty.generated.DateParser;
import com.joestelmach.natty.generated.TreeRewrite;

public abstract class AbstractGrammarTest {
  protected String _ruleName;
  
  /**
   * 
   * @param input
   * @param ast
   */
  protected void assertAST(String input, String ast) throws Exception {
    Assert.assertEquals(ast, buildAST(input));
  }
  
  /**
   * 
   * @param value
   * @return
   * @throws Exception
   */
  protected String buildAST(String value) throws Exception {
    DateParser parser = buildParser(value);
    Class<?> klass = Class.forName("com.joestelmach.natty.generated.DateParser");
    Method meth = klass.getMethod(_ruleName, (Class<?>[]) null);
    ParserRuleReturnScope ret = (ParserRuleReturnScope) meth.invoke(parser, (Object[]) null);
    
    Tree tree = (Tree)ret.getTree();
    // rewrite the tree (temporary fix for http://www.antlr.org/jira/browse/ANTLR-427)
    CommonTreeNodeStream nodes = new CommonTreeNodeStream(tree);
    TreeRewrite s = new TreeRewrite(nodes);
    tree = (CommonTree)s.downup(tree);
      
    return tree.toStringTree();
  }
  
  /**
   * 
   * @param value
   * @return
   */
  private DateParser buildParser(String value) throws Exception {
    // lex
    ANTLRInputStream input = new ANTLRNoCaseInputStream(
        new ByteArrayInputStream(value.getBytes()));
    DateLexer lexer = new DateLexer(input);
    CommonTokenStream tokens = new CommonTokenStream(lexer);
      
    // parse 
    ParseListener listener = new ParseListener();
    return new DateParser(tokens, listener);
  }
}
