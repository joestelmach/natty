package com.natty.date;

import java.util.ArrayList;
import java.util.List;

import org.antlr.runtime.Token;

public class ParserState {
  private List<Location> _locations;
  
  public ParserState() {
    _locations = new ArrayList<Location>();
  }
  
  public List<Location> getLocations() {
    return _locations;
  }
  
  public void captureLocation(String text, Token start, Token end) {
    int startPosition = start.getCharPositionInLine();
    int endPosition = end.getCharPositionInLine() + end.getText().length();
    
    _locations.add(new Location(text, start.getLine(), startPosition, endPosition));
  }
}
