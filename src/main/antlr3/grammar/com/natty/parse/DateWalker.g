tree grammar DateWalker;

options {
  tokenVocab=Date;
  ASTLabelType=CommonTree;
}

@header { package com.natty.parse; }

@members {
  private WalkerState _walkerState = new WalkerState();
  
  public WalkerState getState() {
    return _walkerState;
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
  
  | ^(RELATIVE_DATE ^(WEEK_INDEX index=INT ^(DAY_OF_WEEK day=INT) ^(MONTH_OF_YEAR month=INT)))
    {_walkerState.setDayOfWeekIndex($index.text, $day.text, $month.text);}
  ;
  
relaxed_date
  : ^(EXPLICIT seek)
  ;
  
explicit_date
  : ^(EXPLICIT_DATE ^(MONTH_OF_YEAR month=INT) ^(DAY_OF_MONTH day=INT))
    {_walkerState.setExplicitDate($month.text, $day.text, null);}
    
  | ^(EXPLICIT_DATE ^(MONTH_OF_YEAR month=INT) ^(DAY_OF_MONTH day=INT) ^(YEAR_OF year=INT))
    {_walkerState.setExplicitDate($month.text, $day.text, $year.text);}
  ;
  
time
  : ^(EXPLICIT_TIME ^(HOURS_OF_DAY hours=INT) ^(MINUTES_OF_HOUR minutes=INT) AM_PM?)
    {_walkerState.setExplicitTime($hours.text, $minutes.text, $AM_PM.text);}
  ;
  
seek
  : ^(SEEK DIRECTION by=SEEK_BY amount=INT ^(DAY_OF_WEEK day=INT))
    {_walkerState.seekToDayOfWeek($DIRECTION.text, $by.text, $amount.text, $day.text);}
    
  | ^(SEEK DIRECTION SEEK_BY amount=INT ^(MONTH_OF_YEAR month=INT))
    {_walkerState.seekToMonth($DIRECTION.text, $amount.text, $month.text);}
  
  | ^(SEEK DIRECTION SEEK_BY INT SPAN)
    {_walkerState.seekBySpan($DIRECTION.text, $INT.text, $SPAN.text);}
  
  | ^(SEEK DIRECTION SEEK_BY INT date)
    {_walkerState.seekBySpan($DIRECTION.text, $INT.text, "day");}
  ;
