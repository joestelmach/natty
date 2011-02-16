package com.joestelmach.natty;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 
 * @author Joe Stelmach
 *
 */
public class DateGroup {
  private List<Date> _dates;
  private String _text;
  private int _line;
  private int _position;

  public DateGroup() {
    _dates = new ArrayList<Date>();
  }
  
  public List<Date> getDates() {
    return _dates;
  }
  public void addDate(Date date) {
    _dates.add(date);
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

  public int getPosition() {
    return _position;
  }
  public void setPosition(int position) {
    _position = position;
  }
}
