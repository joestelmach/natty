package com.joestelmach.natty;

import java.util.List;

import org.antlr.runtime.Token;
import org.antlr.runtime.TokenSource;

public class NattyTokenSource implements TokenSource {
  private List<Token> _tokens;
  private int _index = 0;
  
  public NattyTokenSource(List<Token> tokens) {
    _tokens = tokens;
  }

  public Token nextToken() {
    return _tokens.size() > _index ? _tokens.get(_index++) : null;
  }

  public String getSourceName() {
    return "natty";
  }
  
  public List<Token> getTokens() {
    return _tokens;  
  }
}
