package com.joestelmach.natty;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.List;
import java.util.TimeZone;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonToken;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeNodeStream;
import org.antlr.runtime.tree.Tree;

import com.joestelmach.natty.generated.DateLexer;
import com.joestelmach.natty.generated.DateParser;
import com.joestelmach.natty.generated.DateWalker;
import com.joestelmach.natty.generated.TreeRewrite;

/**
 * 
 * @author Joe Stelmach
 */
public class Parser {
  private TimeZone _defaultTimeZone;
  
  private static final String MARKER = " ___ ";
  private static final Logger _logger = Logger.getLogger(Parser.class.getName());
  
  /**
   * Creates a new parser using the given time zone as the default
   * @param defaultTimeZone
   */
  public Parser(TimeZone defaultTimeZone) {
    _defaultTimeZone = defaultTimeZone;
  }
  
  /**
   * Creates a new parser with no explicit default time zone (default will be US/Eastern)
   */
  public Parser() {
    _defaultTimeZone = TimeZone.getDefault();
  }
  
  /**
   * Parses the input string for a list of date times, assuming no
   * extraneous text is present.
   * @param inputString
   * @return
   */
  public List<DateGroup> parse(final String inputString) {
    List<DateGroup> groups = null;
    try {
      String cleanedInput = MARKER + inputString.trim() + MARKER;
      
      // lex
      ANTLRInputStream input = new ANTLRNoCaseInputStream(
          new ByteArrayInputStream(cleanedInput.getBytes()));
      DateLexer lexer = new DateLexer(input);
      CommonTokenStream tokens = new CommonTokenStream(lexer);
      
      // parse 
      ParseListener listener = new ParseListener();
      DateParser parser = new DateParser(tokens, listener);
      
      for(Object t:tokens.getTokens()) {
        System.out.println(parser.getTokenNames()[((CommonToken)t).getType()]);
      }
      
      DateParser.parse_return parseReturn = parser.parse();
      Tree tree = (Tree) parseReturn.getTree();
      
      // rewrite the tree (temporary fix for http://www.antlr.org/jira/browse/ANTLR-427)
      CommonTreeNodeStream nodes = new CommonTreeNodeStream(tree);
      TreeRewrite s = new TreeRewrite(nodes);
      tree = (CommonTree)s.downup(tree);
      
      // and walk it
      nodes = new CommonTreeNodeStream(tree);
      nodes.setTokenStream(tokens);
      DateWalker walker = new DateWalker(nodes);
      walker.getState().setDefaultTimeZone(_defaultTimeZone);
      walker.list();
      
      // run through the results and append the parse information
      groups = walker.getState().getDateGroups();
      List<ParseLocation> groupLocations = listener.getDateGroupLocations();
      for(int i=0; i<groups.size(); i++) {
        if(groupLocations.size() > i) {
          DateGroup group = groups.get(i);
          ParseLocation location = groupLocations.get(i);
          group.setLine(location.getLine());
          group.setText(location.getText());
          group.setPosition(location.getStart());
        }
      }
      
    } catch(IOException e) {
      _logger.log(Level.SEVERE, "Could not read from input stream", e);
      
    } catch(RecognitionException e) {
      _logger.log(Level.SEVERE, "Could not parse input", e);
    }
    
    return groups;
  }
}
