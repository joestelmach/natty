tree grammar DateWalker;

options {
  tokenVocab=Date;
  ASTLabelType=CommonTree;
}

@header { package com.natty.parse; }

@members {
  ParserState parserState = new ParserState();
  
  public ParserState getState() {
    return parserState;
  }
}

date_time
  : ^(DATE_TIME date? time?)
  ;  
  
date
  : relative_date 
  | explicit_date
  ;
  
relative_date
  : ^(RELATIVE_DATE seek)
  ;
  
relaxed_date
  : ^(RELATIVE_DATE seek)
  ;
  
explicit_date
  : ^(EXPLICIT_DATE ^(MONTH_OF_YEAR month=INT) ^(DAY_OF_MONTH day=INT))
    {parserState.setExplicitDate($month.text, $day.text, null);}
    
  | ^(EXPLICIT_DATE ^(MONTH_OF_YEAR month=INT) ^(DAY_OF_MONTH day=INT) ^(YEAR_OF year=INT))
    {parserState.setExplicitDate($month.text, $day.text, $year.text);}
  ;
  
time
  : ^(EXPLICIT_TIME ^(HOURS_OF_DAY hours=INT) ^(MINUTES_OF_HOUR minutes=INT) AM_PM?)
    {parserState.setExplicitTime($hours.text, $minutes.text, $AM_PM.text);}
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
