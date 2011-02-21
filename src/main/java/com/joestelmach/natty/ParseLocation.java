package com.joestelmach.natty;

/**
 * Represents an invocation of a parse rule
 * 
 * @author Joe Stelmach
 */
public class ParseLocation {
  private String _ruleName;
  private String _text;
  private int _line;
  private int _start;
  private int _end;
  
  public String getRuleName() {
    return _ruleName;
  }
  public void setRuleName(String ruleName) {
    _ruleName = ruleName;
  }
  
  public String getText() {
    return _text;
  }
  public void setText(String text) {
    _text = text;
  }
  
  public int getLine() {
    return _line;
  }
  public void setLine(int line) {
    _line = line;
  }

  public int getStart() {
    return _start;
  }
  public void setStart(int start) {
    _start = start;
  }

  public int getEnd() {
    return _end;
  }
  public void setEnd(int end) {
    _end = end;
  }
  
  public String toString() {
    return _text;
  }
}
