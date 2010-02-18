package com.natty.date;

/**
 * Represents a parse location
 */
public class Location {
  private String _text;
  private int _start;
  private int _end;
  
  public Location(final String text, final int start, final int end) {
    _text = text;
    _start = start;
    _end = end;
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
  
  public String getText() {
    return _text;
  }
  
  public void setText(String text) {
    _text = text;
  }
}
