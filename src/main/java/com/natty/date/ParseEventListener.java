package com.natty.date;

import java.util.ArrayList;
import java.util.List;

import org.antlr.runtime.Token;
import org.antlr.runtime.debug.BlankDebugEventListener;

/**
 * A custom parse event listener to detect the location of date time strings
 */
public class ParseEventListener extends BlankDebugEventListener {
  private int _backtracking = 0;
  private List<Token> _tokens;
  private List<Location> _locations;
  private boolean _inDateTime = false;
  
  public ParseEventListener() {
    _tokens = new ArrayList<Token>();
    _locations = new ArrayList<Location>();
  }
  
  public List<Location> getLocations() {
    return _locations;
  }
  
  @Override
  public void enterDecision(int d) {
    _backtracking++;
  }

  @Override
  public void exitDecision(int i) {
    _backtracking--;
  }
  
  @Override
  public void enterRule(String filename, String ruleName) {
    if (_backtracking > 0) return;
    
    if(ruleName.equals("date_time")) _inDateTime = true;
  }
  
  @Override
  public void exitRule(String filename, String ruleName) {
    if (_backtracking > 0) return;
    
    if(ruleName.equals("date_time")) consumeDateTime();
  }

  @Override
  public void consumeToken(Token token) {
    if (_backtracking > 0) return;
    
    if(_inDateTime) _tokens.add(token);
  }
  
  /**
   * Consumes the current token list as a date_time
   */
  private void consumeDateTime() {
    _inDateTime = false;
    System.out.println("consuming");
    if(_tokens.size() == 0) return;
    StringBuilder builder = new StringBuilder();
    for (Token token : _tokens) {
      builder.append(token.getText());
    }
    String text = builder.toString();
    Token startToken = _tokens.get(0);
    int line = startToken.getLine();
    int start = startToken.getCharPositionInLine();
    int end = start + text.length();
    _locations.add(new Location(text, line, start, end));
    _tokens.clear();
  }
}
