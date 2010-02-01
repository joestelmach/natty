package com.natty.utility;

import java.util.List;

import org.antlr.runtime.CommonToken;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.tree.Tree;


public class Printer {
  private String[] _tokenNames;
  
  public Printer(String[] tokenNames) {
    _tokenNames = tokenNames;
  }
  
  @SuppressWarnings("unchecked")
  public void printTokenStream(CommonTokenStream stream) {
    StringBuilder builder = new StringBuilder();
    List<CommonToken> tokens = (List<CommonToken>) stream.getTokens();
    for(CommonToken token:tokens) {
      String tokenName = _tokenNames[token.getType()];
      String tokenText = token.getText();
      builder.append(tokenName.equals(tokenText) ? tokenName : 
        tokenName + "[" + tokenText + "]");
      builder.append(" ");
    }
    System.out.println(builder);
  }
  
  public void printTree(Tree tree) {
    int childCount = tree.getChildCount();
    if(tree.getParent() != null && childCount > 0) System.out.print(" ");
    System.out.print(childCount > 0 ? "(" : " ");
    
    String tokenType = _tokenNames[tree.getType()];
    String tokenValue = tree.getText();
    
    System.out.print((tokenType.equals(tokenValue) ? tokenType : tokenType + "[" + tree.getText() + "]"));
    
    for(int i=0; i<childCount; i++) {
      printTree(tree.getChild(i));
    }
    
    if(childCount > 0) System.out.print(")");
  }
}
