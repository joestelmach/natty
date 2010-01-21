tree grammar DateWalker;

options {
  tokenVocab=Date;
  ASTLabelType=CommonTree;
}

@header { package com.natty.parse; }

datetime 
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
  : ^(EXPLICIT_DATE INTEGER INTEGER INTEGER?)
  ;

relative_date
  : ^(RELATIVE_DATE FORWARD INTEGER) 
    {System.out.println("forward " + $INTEGER);}
  | ^(RELATIVE_DATE BACKWARD INTEGER)
    {System.out.println("backward " + $INTEGER);}
  ;
  
explicit_time 
  : ^(EXPLICIT_TIME INTEGER INTEGER AM_PM?)
  ;