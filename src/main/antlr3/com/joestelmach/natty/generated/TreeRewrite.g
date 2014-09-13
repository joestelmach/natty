tree grammar TreeRewrite;

options {
  tokenVocab=DateParser;
  ASTLabelType=CommonTree;
  output=AST;
  filter=true;
}

@header { package com.joestelmach.natty.generated; }

@members {
  private java.util.logging.Logger _logger = java.util.logging.Logger.getLogger("com.joestelmach.natty");
  
  public void displayRecognitionError(String[] tokenNames, RecognitionException re) {
    String message = getErrorHeader(re);
    try { message += getErrorMessage(re, tokenNames); } catch(Exception e) {}
    _logger.fine(message);
  }
}

topdown
  : ^(SEEK DIRECTION SEEK_BY INT ^(DAY_OF_WEEK INT) ^(DAY_OF_WEEK dow=INT))
      -> ^(SEEK DIRECTION SEEK_BY INT ^(DAY_OF_WEEK $dow))
      
  | ^(SEEK DIRECTION SEEK_BY INT ^(DAY_OF_MONTH INT) ^(DAY_OF_MONTH dow=INT))
      -> ^(SEEK DIRECTION SEEK_BY INT ^(DAY_OF_MONTH $dow))
      
  | ^(SEEK DIRECTION SEEK_BY INT ^(MONTH_OF_YEAR INT) ^(MONTH_OF_YEAR dow=INT))
      -> ^(SEEK DIRECTION SEEK_BY INT ^(MONTH_OF_YEAR $dow))
      
  | ^(SEEK DIRECTION SEEK_BY INT ^(MONTH_OF_YEAR INT) amount=INT ^(MONTH_OF_YEAR dow=INT))
      -> ^(SEEK DIRECTION SEEK_BY $amount ^(MONTH_OF_YEAR $dow))

  // ensure year seek happens before day of week seek

  | ^(RELATIVE_DATE ^(SEEK dir=DIRECTION seekby=SEEK_BY day=INT ^(MONTH_OF_YEAR month=INT))
      ^(EXPLICIT_SEEK amount=INT ^(DAY_OF_WEEK dow=INT))
      ^(EXPLICIT_SEEK ^(YEAR_OF year=INT))
    )

    -> ^(RELATIVE_DATE ^(SEEK $dir $seekby $day ^(MONTH_OF_YEAR $month))
       ^(EXPLICIT_SEEK ^(YEAR_OF $year))
       ^(EXPLICIT_SEEK $amount ^(DAY_OF_WEEK $dow))
    )
  ;