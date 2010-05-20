package com.natty.date;

import java.util.Date;
import java.util.List;

public class ParseResult {
  
  private List<Date> _dateTimes;
  private List<ParseLocation> _parseLocations;
  
  public List<Date> getDateTimes() {
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
}
