package com.joestelmach.natty;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonTokenStream;
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
  
  private static final Logger _logger = Logger.getLogger("com.joestelmach.natty");
  
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
    List<Token> tokens = ((NattyTokenSource) stream.getTokenSource()).getTokens();
      DateGroup group = singleParse(stream);
      while((group == null || group.getDates().size() == 0) && tokens.size() > 0) {
        if(group == null || group.getDates().size() == 0) {
          // if we're down to only two tokens in our token stream, we can't continue
          if(tokens.size() <= 2) {
            tokens.clear();
          }
        
          // otherwise, we look at the token stream for anotherpossible starting point, 
          // and attempt to reparse with that sub-sequence of tokens
          else {
            tokens = tokens.subList(2, tokens.size());
            Iterator<Token> iter = tokens.iterator();
            while(iter.hasNext()) {
              Token token = iter.next();
              if(!DateParser.FOLLOW_empty_in_parse176.member(token.getType())) {
                iter.remove();
              }
              else {
                break;
              }
            }
            TokenStream newStream = new CommonTokenStream(new NattyTokenSource(tokens));
            group = singleParse(newStream);
          }
        }
      }
      // if a group with some date(s) was found, we add it
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
    StringBuilder tokenString = new StringBuilder();
    for(Token token:((NattyTokenSource) stream.getTokenSource()).getTokens()) {
      tokenString.append(DateParser.tokenNames[token.getType()]);
      tokenString.append(" ");
    }
    _logger.fine("sub-token stream: " + tokenString.toString());
    
    DateGroup group = null;
    try {
      // parse 
      ParseListener listener = new ParseListener();
      DateParser parser = new DateParser(stream, listener);
      DateParser.parse_return parseReturn = parser.parse();
      
      Tree tree = (Tree) parseReturn.getTree();
      _logger.fine("AST: " + tree.toStringTree());
      
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
        walker.parse();
        
        // run through the results and append the parse information
        group = walker.getState().getDateGroup();
        ParseLocation location = listener.getDateGroupLocation();
        group.setLine(location.getLine());
        group.setText(location.getText());
        group.setPosition(location.getStart());
        group.setSyntaxTree(tree);
        group.setParseLocations(listener.getLocations());
      }
      
    } catch(Exception e) {
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
    
    // walk through the token stream and build a collection 
    // of sub token streams that represent possible date locations
    List<Token> currentGroup = null;
    List<TokenStream> groups = new ArrayList<TokenStream>();
    Token currentToken;
    StringBuilder tokenString = new StringBuilder();
    while((currentToken = stream.getTokenSource().nextToken()).getType() != DateLexer.EOF) {
      if(_logger.getLevel() != null && _logger.getLevel().intValue() <= Level.FINE.intValue()) {
        tokenString.append(DateParser.tokenNames[currentToken.getType()]);
        tokenString.append(" ");
      }
      
      // we're currently NOT collecting for a possible date group
      if(currentGroup == null) {
        // ignore white space in-between possible rules
        if(currentToken.getType() != DateLexer.WHITE_SPACE) {
          // if the token is a possible date start token, we start a new collection
          if(DateParser.FOLLOW_empty_in_parse176.member(currentToken.getType())) {
            currentGroup = new ArrayList<Token>();
            currentGroup.add(currentToken);
          }
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
              cleanupGroup(currentGroup);
              groups.add(new CommonTokenStream(new NattyTokenSource(currentGroup)));
            }
            currentGroup = null;
          }
          // otherwise, the token is known and we're currently collecting for
          // a group, we add it if it's not a dot
          else if(currentToken.getType() != DateLexer.DOT) {
            currentGroup.add(currentToken);
          }
        }
      }
    }
    if(currentGroup != null) {
      cleanupGroup(currentGroup);
      groups.add(new CommonTokenStream(new NattyTokenSource(currentGroup)));
    }
    
    _logger.fine("global token stream: " + tokenString.toString());
    
    return groups;
  }
  
  /**
   * Removes unwanted tokens from the given token group
   * @param group
   */
  private void cleanupGroup(List<Token> group) {
    // remove trailing white space
    Token lastToken = group.get(group.size() - 1);
    if(lastToken.getType() == DateParser.WHITE_SPACE) {
      group.remove(lastToken);
    }
  }
}
