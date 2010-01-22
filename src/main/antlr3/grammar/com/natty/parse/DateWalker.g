tree grammar DateWalker;

options {
  tokenVocab=Date;
  ASTLabelType=CommonTree;
}

@header { package com.natty.parse; }

@members {
  DateTime dateTime = new DateTime();
}

datetime 
  @after {
    dateTime.getDate();  
  }
  : ^(DATE_TIME date time?) 
  ;

date
  : relative_date 
  | explicit_date
  ;
  
time
  : explicit_time
  ;

explicit_date
  : ^(EXPLICIT_DATE MONTH DAY YEAR? ERA?)
    {System.out.println($MONTH.text);}
  ;

relative_date
  // a direction and number of days to move from the current day
  : ^(RELATIVE_DATE DIRECTION INTEGER) 
    {System.out.println($DIRECTION + " " + $INTEGER + " days");}
    
  // a direction and a day of week integer, starting with a 1 for Sunday
  | ^(RELATIVE_DATE DIRECTION DAY_OF_WEEK)
    {dateTime.moveToDayOfWeek($DIRECTION.text, $DAY_OF_WEEK.text);}
  
  // a direction and a date frame (week, month, year)
  | ^(RELATIVE_DATE DIRECTION date_frame)
    {System.out.println($DIRECTION + " one " + $date_frame.text);}
  ;
  
date_frame
  : DATE_FRAME
  | YEAR_DATE_FRAME
  ;
  
explicit_time 
  : ^(EXPLICIT_TIME INTEGER INTEGER AM_PM?)
  ;
  
prefixable_target
  : DAY_OF_WEEK
  | DATE_FRAME
  ;