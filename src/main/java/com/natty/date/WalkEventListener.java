package com.natty.date;

import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.debug.BlankDebugEventListener;

public class WalkEventListener extends BlankDebugEventListener {
  private int _backtracking;
  
  @Override
  public void enterDecision(int d) {
    _backtracking++;
  }

  @Override
  public void exitDecision(int i) {
    _backtracking--;
  }
  public void beginResync() {
    System.out.println("beginning resync") ;
  }
  
  public void endResync() {
    System.out.println("ending resync") ;
  }
  public void recognitionException(RecognitionException e) {
    e.printStackTrace();
  }
  @Override
  public void enterRule(String grammarFileName, String ruleName) {
    if (_backtracking > 0) return;
    
    System.out.println("entering " + ruleName);
  }
  
  @Override
  public void exitRule(String filename, String ruleName) {
    if (_backtracking > 0) return;
    
    if(ruleName.equals("date_time")) {
    }
  }

  @Override
  public void consumeNode(Object t) {
    if (_backtracking > 0) return;
    
    System.out.println("consuming " + t);
    
  }
}
