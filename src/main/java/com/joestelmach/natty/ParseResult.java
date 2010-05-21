package com.joestelmach.natty;

import java.util.Date;
import java.util.List;

/**
 * Represents the result of a parse
 * 
 * @author Joe Stelmach 
 */
public class ParseResult {
  
  private List<Date> _dateTimes;
  private List<ParseLocation> _parseLocations;
  private String _syntaxTree;
  
  public List<Date> getDates() {
    return _dateTimes;
  }

  public void setDateTimes(List<Date> dateTimes) {
    _dateTimes = dateTimes;
  }

  public List<ParseLocation> getParseLocations() {
    return _parseLocations;
  }

  public void setParseLocations(List<ParseLocation> parseLocations) {
    _parseLocations = parseLocations;
  }

  public String getSyntaxTree() {
    return _syntaxTree;
  }

  public void setSyntaxTree(String syntaxTree) {
    _syntaxTree = syntaxTree;
  }
}
