package com.natty.parse;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTreeNodeStream;
import org.antlr.runtime.tree.Tree;
import org.json.JSONObject;

import com.natty.utility.StructureBuilder;

public class CommandLine {
  public static void main(String[] args) throws Exception {
    String inputString = args[0];
    
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
    
    DateFormat formatter = new SimpleDateFormat("MMM dd, yyyy hh:mm a z");
    formatter.setTimeZone(TimeZone.getTimeZone("America/New_York"));
    json.put("iso8601", formatter.format(date));
    json.put("structure", builder.toJSON());
    System.out.println(json);
  }
}
