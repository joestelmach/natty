package com.natty.parse;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class DateTime {
  private GregorianCalendar _calendar;
  
  public DateTime() {
    _calendar = new GregorianCalendar();
  }
  
  /**
   * moves to the last or next day of the week specified.  We first move to the 
   * day in the current week, then add or subtract a week based on the direction
   * 
   * @param direction the direction to move: three possibilities 
       '<' go backward 
       '>' go forward
       '-' stay in the current week
   * @param dayOfWeek should be guaranteed to parse as an Integer 
   */
  public void moveToDayOfWeek(String direction, String dayOfWeek) {
    int requestedDay = Integer.parseInt(dayOfWeek);
    int amount = direction.equals("-") ? 0 : direction.equals("<") ? -1 : 1;
    _calendar.set(Calendar.DAY_OF_WEEK, requestedDay);
    _calendar.add(Calendar.WEEK_OF_YEAR, amount);
  }
  
  public void moveByDays(char direction, String numDays) {
    if(direction == '<') {
      
    }
  }
  
  public void useExplicitDate(int month, int day, int year, String era) {
    
  }
  
  public void getDate() {
    System.out.println(_calendar.getTime());
  }
}