package com.natty.date;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.debug.BlankDebugEventListener;
import org.antlr.runtime.tree.CommonTreeNodeStream;
import org.antlr.runtime.tree.Tree;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.natty.date.generated.DateLexer;
import com.natty.date.generated.DateParser;
import com.natty.date.generated.DateWalker;


public class DateTimeSearcher {
  private static final Logger _logger = Logger.getLogger(DateTimeSearcher.class.getName());
  
  public static String search(String inputString) {
    inputString = inputString.trim() + " foo";
    ANTLRInputStream input = null;
    ParseEventListener parseListener = new ParseEventListener();
    DateWalker walker = null;
    try {
      // lex
      input = new ANTLRNoCaseInputStream(new ByteArrayInputStream(inputString.getBytes()));
      DateLexer lexer = new DateLexer(input);
      CommonTokenStream tokens = new CommonTokenStream(lexer);
      
      // parse 
      DateParser parser = new DateParser(tokens, parseListener);
      DateParser.search_return result = parser.search();
      
      // walk
      Tree tree = (Tree) result.getTree();
      System.out.println(tree.toStringTree());
      CommonTreeNodeStream nodes = new CommonTreeNodeStream(tree);
      nodes.setTokenStream(tokens);
      walker = new DateWalker(nodes, new BlankDebugEventListener());
      walker.search();
      
    } catch (IOException e) {
      e.printStackTrace();
      
    } catch (RecognitionException e) {
      e.printStackTrace();
    }
    
    List<Location> locations = parseListener.getLocations();
    List<Date> dateTimes = walker.getState().getDateTimes();
    
    DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ");
    JSONArray jsonArray = new JSONArray();
    for(int i=0; i<locations.size(); i++) {
      Location location = locations.get(i);
      Date date = dateTimes.get(i);
      try {
        JSONObject json = new JSONObject();
        json.put("text", location.getText());
        json.put("start", location.getStart());
        json.put("end", location.getEnd());
        formatter.setTimeZone(TimeZone.getTimeZone("America/New_York"));
        json.put("localtime", formatter.format(date));
        formatter.setTimeZone(TimeZone.getTimeZone("UTC"));
        json.put("utctime", formatter.format(date));
        jsonArray.put(json);
      
      } catch(JSONException e) {
        _logger.log(Level.FINE, "could not generate json", e);
      
      }
    }
    
    return jsonArray.toString();
  }
}
