package com.natty.parse;

import java.io.IOException;
import java.io.InputStream;

import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CharStream;

public class ANTLRNoCaseInputStream extends ANTLRInputStream {
  public ANTLRNoCaseInputStream(InputStream inputStream) throws IOException {
    super(inputStream, null);
  }

  public int LA(int i) {
    if (i == 0) {
      return 0; // undefined
    }
    if (i < 0) {
      i++; // e.g., translate LA(-1) to use offset 0
    }

    if ((p + i - 1) >= n) {

      return CharStream.EOF;
    }
    return Character.toLowerCase(data[p + i - 1]);
  }
}