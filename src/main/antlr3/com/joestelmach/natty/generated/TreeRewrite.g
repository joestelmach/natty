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
  ;