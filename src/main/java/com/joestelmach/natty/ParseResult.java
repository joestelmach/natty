package com.joestelmach.natty;

import java.util.List;

/**
 * Represents the result of a parse
 * 
 * @author Joe Stelmach 
 */
public class ParseResult {
  
  private List<DateGroup> _dateGroups;
  private List<ParseLocation> _parseLocations;
  private String _syntaxTree;
  
  public List<DateGroup> getDateGroups() {
    return _dateGroups;
  }

  public void setDateGroups(List<DateGroup> dateGroups) {
    _dateGroups = dateGroups;
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
