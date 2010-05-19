tree grammar DateWalker;

options {
  tokenVocab=DateParser;
  ASTLabelType=CommonTree;
}

@header { package com.natty.date.generated; }

@members {
  private com.natty.date.WalkerState _walkerState = new com.natty.date.WalkerState();
  
  public com.natty.date.WalkerState getState() {
    return _walkerState;
  }
}

date_time_alternative
  : ^(DATE_TIME_ALTERNATIVE date_time+)
  ;

date_time
  @after {
    _walkerState.captureDateTime(); 
  }
  : ^(DATE_TIME date time?)
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
  
explicit_date
  : ^(EXPLICIT_DATE ^(MONTH_OF_YEAR month=INT) ^(DAY_OF_MONTH dom=INT) 
        (^(DAY_OF_WEEK dow=INT))? (^(YEAR_OF year=INT))?)
    {_walkerState.setExplicitDate($month.text, $dom.text, $dow.text, $year.text);}
  ;
  
time
  : ^(EXPLICIT_TIME ^(HOURS_OF_DAY hours=INT) ^(MINUTES_OF_HOUR minutes=INT) 
        (^(SECONDS_OF_MINUTE seconds=INT))? AM_PM? (zone=ZONE | zone=ZONE_OFFSET)?)
    {_walkerState.setExplicitTime($hours.text, $minutes.text, $seconds.text, $AM_PM.text, $zone.text);}
  ;
  
seek
  : ^(SEEK DIRECTION by=SEEK_BY amount=INT ^(DAY_OF_WEEK day=INT) date?)
    {_walkerState.seekToDayOfWeek($DIRECTION.text, $by.text, $amount.text, $day.text);}
    
  | ^(SEEK DIRECTION SEEK_BY amount=INT ^(MONTH_OF_YEAR month=INT))
    {_walkerState.seekToMonth($DIRECTION.text, $amount.text, $month.text);}
  
  | ^(SEEK DIRECTION SEEK_BY INT SPAN)
    {_walkerState.seekBySpan($DIRECTION.text, $INT.text, $SPAN.text);}
  
  | ^(SEEK DIRECTION SEEK_BY INT date)
    {_walkerState.seekBySpan($DIRECTION.text, $INT.text, "day");}
  ;
