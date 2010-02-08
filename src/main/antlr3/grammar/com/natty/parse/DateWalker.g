tree grammar DateWalker;

options {
  tokenVocab=Date;
  ASTLabelType=CommonTree;
}

@header { package com.natty.parse; }

@members {
  SeekableDateTime parserState = new SeekableDateTime();
  
  public java.util.Date getDate() {
    return parserState.getDate(); 
  }
}

  
date_time
  : ^(DATE_TIME date? time?)
  ;  
  
date
  : relative_date
  ;
  
relative_date
  : ^(RELATIVE_DATE seek)
  ;
  
time
  : ^(EXPLICIT_TIME ^(HOURS_OF_DAY INT) ^(MINUTES_OF_HOUR INT) AM_PM?)
  ;
  
seek
  : ^(SEEK DIRECTION by=SEEK_BY amount=INT ^(DAY_OF_WEEK day=INT))
    {parserState.seekToDayOfWeek($DIRECTION.text, $by.text, $amount.text, $day.text);}
    
  | ^(SEEK DIRECTION SEEK_BY amount=INT ^(MONTH_OF_YEAR month=INT))
    {parserState.seekToMonth($DIRECTION.text, $amount.text, $month.text);}
  
  | ^(SEEK DIRECTION SEEK_BY INT SPAN)
    {parserState.seekBySpan($DIRECTION.text, $INT.text, $SPAN.text);}
  
  | ^(SEEK DIRECTION SEEK_BY INT date)
    {parserState.seekBySpan($DIRECTION.text, $INT.text, "day");}
  ;
