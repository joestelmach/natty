package com.natty.date;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.TimeZone;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.debug.DebugEventListener;
import org.antlr.runtime.debug.DebugParser;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeNodeStream;
import org.antlr.runtime.tree.Tree;

import com.natty.date.generated.DateLexer;
import com.natty.date.generated.DateParser;
import com.natty.date.generated.DateWalker;
import com.natty.date.generated.TreeRewrite;

public class Parser {
  private TimeZone _defaultTimeZone;
  
  private static Constructor<?> _debugConstructor;
  private static boolean _isDebug;
  private StructureBuilder _debugListener;
  
  private static final Logger _logger = Logger.getLogger(Parser.class.getName());
  
  // we need to check if the parser was built with debug support or not
  static {
    _isDebug = false;
    System.out.println(DateParser.class.getSuperclass().getName());
    if(DateParser.class.getSuperclass().equals(DebugParser.class)) {
      @SuppressWarnings("unchecked")
      Constructor<DateParser>[] constructors = (Constructor<DateParser>[]) DateParser.class.getDeclaredConstructors();
      for(Constructor<?> constructor:constructors) {
        Class<?>[] parameterTypes = constructor.getParameterTypes();
        if(parameterTypes.length == 2 && parameterTypes[1] == DebugEventListener.class) {
          _isDebug = true;
          _debugConstructor = constructor;
          break;
        }
      }
    }
  }
  
  public Parser(TimeZone zone) {
    _defaultTimeZone = zone;
  }
  
  public Parser() {
    _defaultTimeZone = TimeZone.getTimeZone("America/New_York");
  }
  
  /**
   * Parses the input string for a single date time, assuming no
   * extraneous text is present.
   * @param inputString
   * @return
   */
  public ParseResult parse(final String inputString) {
    ParseResult result = new ParseResult();
    try {
      // lex
      ANTLRInputStream input = new ANTLRNoCaseInputStream(new ByteArrayInputStream(inputString.getBytes()));
      DateLexer lexer = new DateLexer(input);
      CommonTokenStream tokens = new CommonTokenStream(lexer);
      
      // parse 
      DateParser parser = getParser(tokens);
      DateParser.parse_return parseReturn = parser.parse();
      
      // grab the tree
      Tree tree = (Tree) parseReturn.getTree();
      System.out.println(tree.toStringTree());
      
      // rewrite it (temporary fix for http://www.antlr.org/jira/browse/ANTLR-427)
      CommonTreeNodeStream nodes = new CommonTreeNodeStream(tree);
      TreeRewrite s = new TreeRewrite(nodes);
      tree = (CommonTree)s.downup(tree);
      
      // and walk it
      nodes = new CommonTreeNodeStream(tree);
      nodes.setTokenStream(tokens);
      DateWalker walker = new DateWalker(nodes);
      walker.getState().setDefaultTimeZone(_defaultTimeZone);
      walker.date_time_alternative();
      
      result.setDateTimes(walker.getState().getDateTimes());
      if(_debugListener != null) {
        System.out.println(_debugListener.toJSON());
      }
      
    } catch(IOException e) {
      _logger.log(Level.SEVERE, "Could not read from input stream", e);
      
    } catch(RecognitionException e) {
      _logger.log(Level.SEVERE, "Could not parse input", e);
    }
    
    return result;
  }
  
  /**
   * 
   * @param tokens
   * @return
   */
  private DateParser getParser(CommonTokenStream tokens) {
    
    DateParser dateParser = null;
    _debugListener = null;
    
    if(!_isDebug) {
      dateParser = new DateParser(tokens);
    }
    else {
      try {
        _debugListener = new StructureBuilder();
        dateParser = (DateParser) _debugConstructor.newInstance(tokens, _debugListener);
        
      } catch (Exception e) {
        _logger.log(Level.WARNING, "Could not reflect debug parser", e);
        dateParser = new DateParser(tokens);
      }
    }
    
    return dateParser;
  }
}
