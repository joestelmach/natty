tree grammar TreeRewrite;

options {
  tokenVocab=DateParser;
  ASTLabelType=CommonTree;
  output=AST;
  filter=true;
}

@header { package com.joestelmach.natty.generated; }

@members {
  private static org.slf4j.Logger _logger =
    org.slf4j.LoggerFactory.getLogger(com.joestelmach.natty.generated.TreeRewrite.class);

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
}

@rulecatch {
  catch(RecognitionException e) {
    throw e;
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

  | ^(SEEK DIRECTION SEEK_BY INT SPAN amt=INT span=SPAN)
      -> ^(SEEK DIRECTION SEEK_BY $amt $span)

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