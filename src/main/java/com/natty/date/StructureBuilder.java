package com.natty.date;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.Token;
import org.antlr.runtime.debug.BlankDebugEventListener;
import org.json.JSONException;
import org.json.JSONObject;

public class StructureBuilder extends BlankDebugEventListener {
  
  private static final Map<String, String> INTERESTING_RULES;
  
  static {
    INTERESTING_RULES = new HashMap<String, String>();
    INTERESTING_RULES.put("date_time", "date and time");
    //INTERESTING_RULES.put("date", "date");
    INTERESTING_RULES.put("global_date_prefix", "date prefix");
    INTERESTING_RULES.put("relative_date", "relative date");
    INTERESTING_RULES.put("relaxed_date", "relaxed date");
    INTERESTING_RULES.put("formal_date", "formal date");
    INTERESTING_RULES.put("relaxed_day_of_month", "day");
    INTERESTING_RULES.put("relaxed_month", "month");
    INTERESTING_RULES.put("relaxed_year", "year");
    INTERESTING_RULES.put("formal_month_of_year", "month");
    INTERESTING_RULES.put("formal_day_of_month", "day");
    INTERESTING_RULES.put("formal_year", "year");
    INTERESTING_RULES.put("relative_prefix", "relative prefix");
    INTERESTING_RULES.put("implicit_prefix", "implicit prefix");
    INTERESTING_RULES.put("relative_suffix", "relative suffix");
    INTERESTING_RULES.put("relative_target", "relative target");
    INTERESTING_RULES.put("relative_date_span", "span");
    INTERESTING_RULES.put("relative_occurrence_index", "relative occurrence index");
    INTERESTING_RULES.put("named_relative_date", "named relative date");
    INTERESTING_RULES.put("day_of_week", "weekday");
    INTERESTING_RULES.put("time", "time");
    INTERESTING_RULES.put("hours", "hours");
    INTERESTING_RULES.put("minutes", "minutes");
    INTERESTING_RULES.put("meridian_indicator", "am/pm");
    INTERESTING_RULES.put("time_zone", "zone");
  }

  private int backtracking = 0;
  private Map<String, Stack<List<Token>>> _ruleMap;
  private JSONObject _json;
  private static final Logger _logger = Logger.getLogger(StructureBuilder.class.getName());

  public StructureBuilder() {
    _ruleMap = new HashMap<String, Stack<List<Token>>>();
    _json = new JSONObject();
  }
  
  public JSONObject toJSON() {
    return _json;
  }

  /** Backtracking or cyclic DFA, don't want to add nodes to tree */
  public void enterDecision(int d) {
    backtracking++;
  }

  public void exitDecision(int i) {
    backtracking--;
  }
  
  public void enterRule(String filename, String ruleName) {
    if (backtracking > 0) return;
    
    Stack<List<Token>> tokenListStack = _ruleMap.get(ruleName);
    if(tokenListStack == null) {
      tokenListStack = new Stack<List<Token>>();
      _ruleMap.put(ruleName, tokenListStack);
    }
    
    tokenListStack.push(new ArrayList<Token>());
  }

  public void exitRule(String filename, String ruleName) {
    if (backtracking > 0) return;
    
    List<Token> tokenList = _ruleMap.get(ruleName).pop();
    if(tokenList.size() > 0 && INTERESTING_RULES.keySet().contains(ruleName)) { 
        
      StringBuilder builder = new StringBuilder();
      for(Token token:tokenList) {
        builder.append(token.getText());
      }
      String text = builder.toString();
      int start = tokenList.get(0).getCharPositionInLine();
      int end = start + text.length();
            
      JSONObject json = new JSONObject();
      try {
        json.put("text", text);
        json.put("start", start);
        json.put("end", end);
        _json.put(INTERESTING_RULES.get(ruleName), json);
        
      } catch(JSONException e) {
        _logger.log(Level.FINE, "could not add json", e);
        
      }
    }
  }

  public void consumeToken(Token token) {
    if (backtracking > 0) return;
    for(Stack<List<Token>> stack:_ruleMap.values()) {
      for(List<Token> tokenList:stack) {
        tokenList.add(token);
      }
    }
  }

  public void consumeHiddenToken(Token token) {
    if (backtracking > 0) return;
  }

  public void recognitionException(RecognitionException e) {
    if (backtracking > 0) return;
  }
}
