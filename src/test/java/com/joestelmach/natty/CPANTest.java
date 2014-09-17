package com.joestelmach.natty;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

import junit.framework.Assert;

import org.junit.Test;

/**
 * 
 * @author Joe Stelmach
 */
public class CPANTest {

  @Test
  public void sanityCheck() throws Exception {
    BufferedReader reader = new BufferedReader(new InputStreamReader(
        CPANTest.class.getResourceAsStream("/cpan.txt")));
    String value = null;
    while((value = reader.readLine()) != null) {
      if(!value.trim().startsWith("#") && value.trim().length() > 0) {
        Parser parser = new Parser();
        List<DateGroup> groups = parser.parse(value);
        Assert.assertEquals(1, groups.size());
        Assert.assertTrue(groups.get(0).getDates().size() > 0);
      }
    }
    
    reader.close();
  }
}
