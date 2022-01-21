package org.natty;

import java.io.IOException;
import java.io.InputStream;

import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CharStream;

/**
 * Extends an ordinary ANTLRInputStream to convert all characters to lower case
 * @author Joe Stelmach 
 *
 */
public class ANTLRNoCaseInputStream extends ANTLRInputStream {
  public ANTLRNoCaseInputStream(InputStream inputStream) throws IOException {
    super(inputStream, null);
  }

  @Override
  public int LA(int i) {
    if (i == 0) return 0;
    if (i < 0) i++;
    if ((p + i - 1) >= n) return CharStream.EOF;
    return Character.toLowerCase(data[p + i - 1]);
  }
}