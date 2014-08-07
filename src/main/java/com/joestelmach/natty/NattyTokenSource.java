package com.joestelmach.natty;

import java.util.List;

import org.antlr.runtime.CommonToken;
import org.antlr.runtime.Token;
import org.antlr.runtime.TokenSource;

public class NattyTokenSource implements TokenSource {
  private static final Token EOF_TOKEN = new CommonToken(Token.EOF);

  private List<Token> _tokens;
  private int _index = 0;
  
  public NattyTokenSource(List<Token> tokens) {
    _tokens = tokens;
  }

  public Token nextToken() {
    return _tokens.size() > _index ? _tokens.get(_index++) : EOF_TOKEN;
  }

  public String getSourceName() {
    return "natty";
  }
  
  public List<Token> getTokens() {
    return _tokens;  
  }
}
