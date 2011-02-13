tree grammar TreeRewrite;

options {
  tokenVocab=DateParser;
  ASTLabelType=CommonTree;
  output=AST;
  filter=true;
}

@header { package com.joestelmach.natty.generated; }

topdown
  : ^(SEEK DIRECTION SEEK_BY INT ^(DAY_OF_WEEK INT) ^(DAY_OF_WEEK dow=INT))
      -> ^(SEEK DIRECTION SEEK_BY INT ^(DAY_OF_WEEK $dow))
      
  | ^(SEEK DIRECTION SEEK_BY INT ^(DAY_OF_MONTH INT) ^(DAY_OF_MONTH dow=INT))
      -> ^(SEEK DIRECTION SEEK_BY INT ^(DAY_OF_MONTH $dow))
      
  | ^(SEEK DIRECTION SEEK_BY INT ^(MONTH_OF_YEAR INT) ^(MONTH_OF_YEAR dow=INT))
      -> ^(SEEK DIRECTION SEEK_BY INT ^(MONTH_OF_YEAR $dow))
      
  | ^(SEEK DIRECTION SEEK_BY INT ^(MONTH_OF_YEAR INT) amount=INT ^(MONTH_OF_YEAR dow=INT))
      -> ^(SEEK DIRECTION SEEK_BY $amount ^(MONTH_OF_YEAR $dow))
  ;