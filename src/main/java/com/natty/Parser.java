package com.natty;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTreeNodeStream;
import org.antlr.runtime.tree.Tree;
import org.json.JSONException;
import org.json.JSONObject;

import com.natty.parse.DateLexer;
import com.natty.parse.DateParser;
import com.natty.parse.DateWalker;
import com.natty.utility.StructureBuilder;

public class Parser {
  private static final Logger _logger = Logger.getLogger(Parser.class.getName());
  
  public static String parseDate(final String inputString) {
    ANTLRInputStream input = null;
    StructureBuilder builder = new StructureBuilder();
    Date date = new Date();
    try {
      // lex
      input = new ANTLRInputStream(new ByteArrayInputStream(inputString.getBytes()));
      DateLexer lexer = new DateLexer(input);
      CommonTokenStream tokens = new CommonTokenStream(lexer);
      
      // parse 
      DateParser parser = new DateParser(tokens, builder);
      DateParser.date_time_return result = parser.date_time();
      
      // walk
      Tree tree = (Tree) result.getTree();
      CommonTreeNodeStream nodes = new CommonTreeNodeStream(tree);
      nodes.setTokenStream(tokens);
      DateWalker walker = new DateWalker(nodes);
      walker.date_time();
      date = walker.getState().getDate();
      
    } catch (IOException e) {
      e.printStackTrace();
      
    } catch (RecognitionException e) {
      e.printStackTrace();
    }
    
    JSONObject json = new JSONObject();
    try {
      DateFormat formatter = new SimpleDateFormat("MMM dd, yyyy hh:mm a z");
      formatter.setTimeZone(TimeZone.getTimeZone("America/New_York"));
      json.put("iso8601", formatter.format(date));
      json.put("structure", builder.toJSON());
      
    } catch(JSONException e) {
      _logger.log(Level.FINE, "could not generate json", e);
      
    }
    
    return json.toString();
  }
}
