package com.joestelmach.natty;

import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.Token;
import org.antlr.runtime.debug.BlankDebugEventListener;

import java.util.*;

/**
 * Responsible for collecting parse information from the debug parser
 * 
 * @author Joe Stelmach 
 */
public class ParseListener extends BlankDebugEventListener {
  
  private int backtracking = 0;
  private Map<String, Stack<List<Token>>> _ruleMap;
  private Map<String, List<ParseLocation>> _locations;
  private ParseLocation _dateGroupLocation;
  
  public ParseListener() {
    _ruleMap = new HashMap<String, Stack<List<Token>>>();
    _locations = new HashMap<String, List<ParseLocation>>();
  }
  
  public Map<String, List<ParseLocation>> getLocations() {
    return _locations;
  }
  
  public ParseLocation getDateGroupLocation() {
    return _dateGroupLocation;
  }
  
  // don't add backtracking or cyclic DFA nodes 
  public void enterDecision(int d, boolean couldBacktrack) {
    backtracking++;
  }

  public void exitDecision(int i) {
    backtracking--;
  }
  
  public void enterRule(String filename, String ruleName) {
    if (backtracking > 0) return;
    
    Stack<List<Token>> tokenListStack = _ruleMap.get(ruleName);
    if(tokenListStack == null) {
      tokenListStack = new Stack<List<Token>>();
      _ruleMap.put(ruleName, tokenListStack);
    }
    
    tokenListStack.push(new ArrayList<Token>());
  }

  public void exitRule(String filename, String ruleName) {
    if (backtracking > 0) return;
    
    List<Token> tokenList = _ruleMap.get(ruleName).pop();
    
    if(tokenList.size() > 0) {
      boolean isAlternative = ruleName.equals("date_time_alternative");
      StringBuilder builder = new StringBuilder();
      for(Token token:tokenList) {
        builder.append(token.getText());
      }
      String text = builder.toString();
      int line = tokenList.get(0).getLine();
      int start = tokenList.get(0).getCharPositionInLine() + 1;
      int end = start + text.length();
        
      ParseLocation location = new ParseLocation();
      location.setRuleName(ruleName);
      location.setText(text);
      location.setLine(line);
      location.setStart(start);
      location.setEnd(end);
      
      if(isAlternative) {
        _dateGroupLocation = location;
      }
        
      List<ParseLocation> list = _locations.get(location.getRuleName());
      if(list == null) {
        list = new ArrayList<ParseLocation>(); 
        _locations.put(location.getRuleName(), list);
      }
      
      list.add(location);
    }
  }

  public void consumeToken(Token token) {
    if (backtracking > 0) return;
    for(Stack<List<Token>> stack:_ruleMap.values()) {
      for(List<Token> tokenList:stack) {
        tokenList.add(token);
      }
    }
  }

  public void consumeHiddenToken(Token token) {
    if (backtracking > 0) return;
  }

  public void recognitionException(RecognitionException e) {
    if (backtracking > 0) return;
  }
  
}
