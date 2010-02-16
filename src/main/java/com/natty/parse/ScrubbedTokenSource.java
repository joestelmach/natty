package com.natty.parse;

import org.antlr.runtime.CommonToken;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.Token;
import org.antlr.runtime.TokenSource;

public class ScrubbedTokenSource implements TokenSource {
  private CommonTokenStream _input;
  private Token _previousToken = null;
  
  public ScrubbedTokenSource(CommonTokenStream input) {
    _input = input;
    
    // skip over leading white space
    while(_input.LA(1) == DateParser.WHITE_SPACE) {
      input.consume();
    }
  }

  @Override
  public String getSourceName() {
    return "scrubbed source";
  }

  @Override
  public Token nextToken() {
    Token token;
    int type = _input.LA(1);
    // if the next token is unknown, we eat up all concurrent unknown and white space tokens
    if(type == DateParser.UNKNOWN) {
      while(type == DateParser.WHITE_SPACE || type == DateParser.UNKNOWN) {
        _input.consume();
        type = _input.LA(1);
      }
      token = new CommonToken(DateParser.UNKNOWN_TEXT);
    }
    
    // the next token is not unknown
    else {
      if(type == Token.EOF) {
        _input.consume();
        if(_previousToken != null && _previousToken.getType() != DateParser.UNKNOWN_TEXT) {
          token = new CommonToken(DateParser.UNKNOWN_TEXT);
          _input.seek(_input.index());
        }
        else {
          token = Token.EOF_TOKEN;
        }
      }
      
      else {
        token = _input.get(_input.index());
        _input.consume();
        int nextToken = _input.LA(1);
        int nextNextToken = _input.LA(2);
        if(nextToken > 0 && nextNextToken > 0) {
          if(nextToken == DateParser.WHITE_SPACE && nextNextToken == DateParser.UNKNOWN) {
            _input.consume();
          }
        }
      }
    }
    
    _previousToken = token;
    return token;
  }
}
