package com.joestelmach.natty;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.TimeZone;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.Token;
import org.antlr.runtime.TokenStream;
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
   * Parses the given input value for one or more groups of
   * date alternatives
   * 
   * @param value
   * @return
   */
  public List<DateGroup> parse(String value) {
    
    // lex the input value to obtain our global token stream
    ANTLRInputStream input = null;
    try {
      input = new ANTLRNoCaseInputStream(new ByteArrayInputStream(value.trim().getBytes()));
      
    } catch (IOException e) {
      _logger.log(Level.SEVERE, "could not lex input", e);
    }
    DateLexer lexer = new DateLexer(input);
    
    // collect all sub-token streams that may include date information
    List<TokenStream> streams = collectTokenStreams(new CommonTokenStream(lexer));
    
    // and parse each of them
    List<DateGroup> groups = new ArrayList<DateGroup>();
    for(TokenStream stream:streams) {
      DateGroup group = singleParse(stream);
      if(group != null && group.getDates().size() > 0) {
        groups.add(group);
      }
    }
    return groups;
  }
  
  /**
   * Parses the token stream for a SINGLE date time alternative.  This
   * method assumes that the entire token stream represents date and or
   * time information (no extraneous tokens)
   * 
   * @param stream
   * @return
   */
  private DateGroup singleParse(TokenStream stream) {
    DateGroup group = null;
    try {
      // parse 
      ParseListener listener = new ParseListener();
      DateParser parser = new DateParser(stream, listener);
      DateParser.parse_return parseReturn = parser.parse();
      Tree tree = (Tree) parseReturn.getTree();
      
      // we only coninue if a meaningful syntax tree has been built
      if(tree.getChildCount() > 0) {
      
        // rewrite the tree (temporary fix for http://www.antlr.org/jira/browse/ANTLR-427)
        CommonTreeNodeStream nodes = new CommonTreeNodeStream(tree);
        TreeRewrite s = new TreeRewrite(nodes);
        tree = (CommonTree)s.downup(tree);
        
        // and walk it
        nodes = new CommonTreeNodeStream(tree);
        nodes.setTokenStream(stream);
        DateWalker walker = new DateWalker(nodes);
        walker.getState().setDefaultTimeZone(_defaultTimeZone);
        walker.date_time_alternative();
        
        // run through the results and append the parse information
        group = walker.getState().getDateGroup();
        ParseLocation location = listener.getDateGroupLocation();
        group.setLine(location.getLine());
        group.setText(location.getText());
        group.setPosition(location.getStart());
        group.setSyntaxTree(tree);
        group.setParseLocations(listener.getLocations());
      }
      
    } catch(RecognitionException e) {
      _logger.log(Level.SEVERE, "Could not parse input", e);
    }
    
    return group;
  }
  
  /**
   * Scans the given token global token stream for a list of sub-token 
   * streams representing those portions of the global stream that 
   * may contain date time information
   * 
   * @param stream
   * @return
   */
  private List<TokenStream> collectTokenStreams(TokenStream stream) {
    // now we'll walk through the token stream and build a collection 
    // of sub token streams that represent possible date locations
    List<Token> currentGroup = null;
    List<TokenStream> groups = new ArrayList<TokenStream>();
    Token currentToken;
    while((currentToken = stream.getTokenSource().nextToken()).getType() != DateLexer.EOF) {
      // we're currently NOT collecting for a possible date group
      if(currentGroup == null) {
        // ignore white space in-between possible rules
        if(currentToken.getType() != DateLexer.WHITE_SPACE) {
          // if the token is a possible date start token, we start a new collection
          currentGroup = new ArrayList<Token>();
          currentGroup.add(currentToken);
        }
      }
      // we're currently collecting
      else {
        // preserve white space
        if(currentToken.getType() == DateLexer.WHITE_SPACE) {
          currentGroup.add(currentToken);
        }
        else {
          // if this is an unknown token, we need to end the current group
          if(currentToken.getType() == DateLexer.UNKNOWN) {
            if(currentGroup.size() > 0) {
              groups.add(new CommonTokenStream(new NattyTokenSource(currentGroup)));
            }
            currentGroup = null;
          }
          // otherwise, the token is known and we're currently collecting for
          // a group, so we add it
          else {
            currentGroup.add(currentToken);
          }
        }
      }
    }
    if(currentGroup != null) {
      groups.add(new CommonTokenStream(new NattyTokenSource(currentGroup)));
    }
    
    return groups;
  }
}
