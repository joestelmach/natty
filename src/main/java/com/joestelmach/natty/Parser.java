package com.joestelmach.natty;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.TimeZone;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeNodeStream;
import org.antlr.runtime.tree.Tree;

import com.joestelmach.natty.generated.DateLexer;
import com.joestelmach.natty.generated.DateParser;
import com.joestelmach.natty.generated.DateWalker;
import com.joestelmach.natty.generated.DebugDateParser;
import com.joestelmach.natty.generated.TreeRewrite;

/**
 * 
 * @author Joe Stelmach
 */
public class Parser {
  private TimeZone _defaultTimeZone;
  
  private boolean _debug;
  private ParseListener _debugListener;
  private static final Logger _logger = Logger.getLogger(Parser.class.getName());
  
  public Parser(TimeZone zone) {
    _defaultTimeZone = zone;
  }
  
  public Parser() {
    _defaultTimeZone = TimeZone.getTimeZone("America/New_York");
  }
  
  /**
   * Enables the collection of parse information
   * @param debug
   */
  public void setDebug(final boolean debug) {
    _debug = debug;
  }
  
  /**
   * Parses the input string for a list of date times, assuming no
   * extraneous text is present.
   * @param inputString
   * @return
   */
  public ParseResult parse(final String inputString) {
    ParseResult result = new ParseResult();
    try {
      // lex
      ANTLRInputStream input = new ANTLRNoCaseInputStream(new ByteArrayInputStream(inputString.getBytes()));
      DateLexer lexer = new DateLexer(input);
      CommonTokenStream tokens = new CommonTokenStream(lexer);
      
      // parse with debug
      Tree tree = null;
      if(_debug) {
        _debugListener = new ParseListener();
        DebugDateParser parser = new DebugDateParser(tokens, _debugListener);
        DebugDateParser.parse_return parseReturn = parser.parse();
        tree = (Tree) parseReturn.getTree();
        result.setParseLocations(_debugListener.getLocations());
      }
      
      // or parse without debug
      else {
        DateParser parser = new DateParser(tokens);
        DateParser.parse_return parseReturn = parser.parse();
        tree = (Tree) parseReturn.getTree();
      }
      
      // rewrite the tree (temporary fix for http://www.antlr.org/jira/browse/ANTLR-427)
      CommonTreeNodeStream nodes = new CommonTreeNodeStream(tree);
      TreeRewrite s = new TreeRewrite(nodes);
      tree = (CommonTree)s.downup(tree);
      result.setSyntaxTree(tree.toStringTree());
      
      // and walk it
      nodes = new CommonTreeNodeStream(tree);
      nodes.setTokenStream(tokens);
      DateWalker walker = new DateWalker(nodes);
      walker.getState().setDefaultTimeZone(_defaultTimeZone);
      walker.date_time_alternative();
      result.setDateTimes(walker.getState().getDateTimes());
      
    } catch(IOException e) {
      _logger.log(Level.SEVERE, "Could not read from input stream", e);
      
    } catch(RecognitionException e) {
      _logger.log(Level.SEVERE, "Could not parse input", e);
    }
    
    return result;
  }
}
