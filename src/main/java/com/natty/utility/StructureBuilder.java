package com.natty.utility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.Token;
import org.antlr.runtime.debug.BlankDebugEventListener;
import org.json.JSONException;
import org.json.JSONObject;

public class StructureBuilder extends BlankDebugEventListener {
  
  private static final List<String> PRINTABLE_NODES = new ArrayList<String>(Arrays.asList(new String[]{
      "date_time", "date", "relaxed_day_of_month", "relaxed_month", "relaxed_year", "formal_month_of_year", 
      "formal_day_of_month", "formal_year", "day_of_week", "time", "hours", "minutes"})); 

  private int backtracking = 0;
  private Map<String, List<Token>> _workingTokenMap;
  private Map<String, List<Token>> _finalTokenMap;

  public StructureBuilder() {
    _workingTokenMap = new HashMap<String, List<Token>>();
    _finalTokenMap = new HashMap<String, List<Token>>();
  }
  
  public JSONObject toJSON() {
    JSONObject structureJson = new JSONObject();
    try {
      for(Entry<String,List<Token>> entry:_finalTokenMap.entrySet()) {
        StringBuilder builder = new StringBuilder();
        for(Token token:entry.getValue()) {
          builder.append(token.getText());
        }
        String text = builder.toString();
        int start = entry.getValue().get(0).getCharPositionInLine();
        int end = start + text.length();
        
        JSONObject json = new JSONObject();
        json.put("text", text);
        json.put("start", start);
        json.put("end", end);
        
        structureJson.put(entry.getKey(), json);
      }
      
    } catch(JSONException e) {
      e.printStackTrace();
    }
    
    return structureJson;
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
    
    _workingTokenMap.put(ruleName, new ArrayList<Token>());
  }

  public void exitRule(String filename, String ruleName) {
    if (backtracking > 0) return;
    
    List<Token> tokenList = _workingTokenMap.remove(ruleName);
    if(PRINTABLE_NODES.contains(ruleName)) { 
      _finalTokenMap.put(ruleName, tokenList);
    }
  }

  public void consumeToken(Token token) {
    if (backtracking > 0) return;
    
    for(List<Token> tokenList:_workingTokenMap.values()) {
      tokenList.add(token);
    }
  }

  public void consumeHiddenToken(Token token) {
    if (backtracking > 0) return;
  }

  public void recognitionException(RecognitionException e) {
    if (backtracking > 0) return;
  }
}
