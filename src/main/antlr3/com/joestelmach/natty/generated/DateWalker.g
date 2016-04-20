tree grammar DateWalker;

options {
  tokenVocab=DateParser;
  ASTLabelType=CommonTree;
}

@header { package com.joestelmach.natty.generated; }

@members {
  private static org.slf4j.Logger _logger =
    org.slf4j.LoggerFactory.getLogger(com.joestelmach.natty.generated.DateWalker.class);

  private com.joestelmach.natty.WalkerState _walkerState;
  private java.util.Date referenceDate;

  @Override
  protected Object recoverFromMismatchedToken(IntStream input, int ttype, BitSet follow)
      throws RecognitionException {
    throw new MismatchedTokenException(ttype, input);
  }

  @Override
  public Object recoverFromMismatchedSet(IntStream Input, RecognitionException e, BitSet follow)
      throws RecognitionException {
    throw e;
  }

  @Override
  public void emitErrorMessage(String msg) {
    _logger.error(msg);
  }

  public void setReferenceDate(java.util.Date referenceDate) {
    this.referenceDate = referenceDate;
  }

  public com.joestelmach.natty.WalkerState getState() {
    if(_walkerState==null) {
      _walkerState = new com.joestelmach.natty.WalkerState(referenceDate);
    }
    return _walkerState;
  }
}

@rulecatch {
  catch(RecognitionException e) {
    throw e;
  }
}

parse
  : date_time_alternative recurrence?
  ;
  
recurrence
  @init { 
    _walkerState.setRecurring();
  }
  : ^(RECURRENCE date_time?{ _walkerState.captureDateTime(); })
  ;
  
date_time_alternative
  : ^(DATE_TIME_ALTERNATIVE date_time+)
  ;

date_time
  @after {
    _walkerState.captureDateTime(); 
  }
  : ^(DATE_TIME date? time?)
  ;  
  
date
  : relative_date 
  | explicit_date
  ;
  
relative_date
  : ^(RELATIVE_DATE seek* explicit_seek*)
  ;
  
week_index
  : ^(WEEK_INDEX index=INT ^(DAY_OF_WEEK day=INT))
    {_walkerState.setDayOfWeekIndex($index.text, $day.text);}
  ;
  
explicit_date
  : ^(EXPLICIT_DATE ^(MONTH_OF_YEAR month=INT) ^(DAY_OF_MONTH dom=INT) 
        (^(DAY_OF_WEEK dow=INT))? (^(YEAR_OF year=INT))?)
    {_walkerState.setExplicitDate($month.text, $dom.text, $dow.text, $year.text);}
  ;
  
time
  : explicit_time
  | relative_time
  ;
  
explicit_time
  : ^(EXPLICIT_TIME ^(HOURS_OF_DAY hours=INT) (^(MINUTES_OF_HOUR minutes=INT))?
        (^(SECONDS_OF_MINUTE seconds=INT))? AM_PM? (zone=ZONE | zone=ZONE_OFFSET)?)
    {_walkerState.setExplicitTime($hours.text, $minutes.text, $seconds.text, $AM_PM.text, $zone.text);}
  ;
  
relative_time
  : ^(RELATIVE_TIME seek)
  ;
  
seek
  : ^(SEEK DIRECTION by=SEEK_BY amount=INT ^(DAY_OF_WEEK day=INT)  date?)
    {_walkerState.seekToDayOfWeek($DIRECTION.text, $by.text, $amount.text, $day.text);}
    
  | ^(SEEK DIRECTION SEEK_BY amount=INT ^(MONTH_OF_YEAR month=INT))
    {_walkerState.seekToMonth($DIRECTION.text, $amount.text, $month.text);}
  
  | ^(SEEK DIRECTION SEEK_BY (explicit_seek | relative_date)? INT SPAN)
    {_walkerState.seekBySpan($DIRECTION.text, $INT.text, $SPAN.text);}
  
  | ^(SEEK DIRECTION SEEK_BY INT date)
    {_walkerState.seekBySpan($DIRECTION.text, $INT.text, $SEEK_BY.text);}
    
  | ^(SEEK DIRECTION SEEK_BY INT HOLIDAY)
    {_walkerState.seekToHoliday($HOLIDAY.text, $DIRECTION.text, $INT.text);}
    
  | ^(SEEK DIRECTION SEEK_BY INT SEASON)
    {_walkerState.seekToSeason($SEASON.text, $DIRECTION.text, $INT.text);}
  ;
  
explicit_seek
  : ^(EXPLICIT_SEEK ^(MONTH_OF_YEAR day=INT))
    {_walkerState.seekToMonth(">", "0", $day.text);}
    
  | ^(EXPLICIT_SEEK ^(DAY_OF_MONTH month=INT))
    {_walkerState.seekToDayOfMonth($month.text);}
    
  | ^(EXPLICIT_SEEK ^(DAY_OF_WEEK day=INT))
    {_walkerState.seekToDayOfWeek(">", "by_week", "0", $day.text);}
    
  | ^(EXPLICIT_SEEK ^(DAY_OF_YEAR day=INT))
    {_walkerState.seekToDayOfYear($day.text);}
    
  | ^(EXPLICIT_SEEK ^(YEAR_OF year=INT))
    {_walkerState.seekToYear($year.text);}
    
  | ^(EXPLICIT_SEEK HOLIDAY ^(YEAR_OF year=INT))
    {_walkerState.seekToHolidayYear($HOLIDAY.text, $year.text);}
    
  | ^(EXPLICIT_SEEK SEASON ^(YEAR_OF year=INT))
    {_walkerState.seekToSeasonYear($SEASON.text, $year.text);}
    
  | ^(EXPLICIT_SEEK index=INT ^(DAY_OF_WEEK day=INT))
    {_walkerState.setDayOfWeekIndex($index.text, $day.text);}
    
  | ^(EXPLICIT_SEEK explicit_time)
  ;  