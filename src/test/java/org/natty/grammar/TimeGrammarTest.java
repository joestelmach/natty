package org.natty.grammar;

import org.junit.Test;

public class TimeGrammarTest extends AbstractGrammarTest {
  
  @Test
  public void time_zone_abbreviation() throws Exception {
    _ruleName = "time_zone_abbreviation";
    
    assertAST("est", "America/New_York");
    assertAST("edt", "America/New_York");
    assertAST("et", "America/New_York");
    assertAST("pst", "America/Los_Angeles");
    assertAST("pdt", "America/Los_Angeles");
    assertAST("pt", "America/Los_Angeles");
    assertAST("cst", "America/Chicago");
    assertAST("cdt", "America/Chicago");
    assertAST("ct", "America/Chicago");
    assertAST("mst", "America/Denver");
    assertAST("mdt", "America/Denver");
    assertAST("mt", "America/Denver");
    assertAST("akst", "America/Anchorage");
    assertAST("akdt", "America/Anchorage");
    assertAST("akt", "America/Anchorage");
    assertAST("hast", "Pacific/Honolulu");
    assertAST("hadt" , "Pacific/Honolulu");
    assertAST("hat" , "Pacific/Honolulu");
    assertAST("hst", "Pacific/Honolulu");
  }

  @Test
  public void meridian_indicator() throws Exception {
    _ruleName = "meridian_indicator";
    
    assertAST("am", "am");
    assertAST("a.m.", "am");
    assertAST("a", "am");
    assertAST("pm", "pm");
    assertAST("p.m.", "pm");
    assertAST("p", "pm");
  }
  
  @Test
  public void minutes() throws Exception {
    _ruleName = "minutes";

    assertAST("00", "(MINUTES_OF_HOUR 00)");
    assertAST("01", "(MINUTES_OF_HOUR 01)");
    assertAST("02", "(MINUTES_OF_HOUR 02)");
    assertAST("03", "(MINUTES_OF_HOUR 03)");
    assertAST("04", "(MINUTES_OF_HOUR 04)");
    assertAST("05", "(MINUTES_OF_HOUR 05)");
    assertAST("06", "(MINUTES_OF_HOUR 06)");
    assertAST("07", "(MINUTES_OF_HOUR 07)");
    assertAST("08", "(MINUTES_OF_HOUR 08)");
    assertAST("09", "(MINUTES_OF_HOUR 09)");
    assertAST("10", "(MINUTES_OF_HOUR 10)");
    assertAST("11", "(MINUTES_OF_HOUR 11)");
    assertAST("12", "(MINUTES_OF_HOUR 12)");
    assertAST("13", "(MINUTES_OF_HOUR 13)");
    assertAST("14", "(MINUTES_OF_HOUR 14)");
    assertAST("15", "(MINUTES_OF_HOUR 15)");
    assertAST("16", "(MINUTES_OF_HOUR 16)");
    assertAST("17", "(MINUTES_OF_HOUR 17)");
    assertAST("18", "(MINUTES_OF_HOUR 18)");
    assertAST("19", "(MINUTES_OF_HOUR 19)");
    assertAST("20", "(MINUTES_OF_HOUR 20)");
    assertAST("21", "(MINUTES_OF_HOUR 21)");
    assertAST("22", "(MINUTES_OF_HOUR 22)");
    assertAST("23", "(MINUTES_OF_HOUR 23)");
    assertAST("24", "(MINUTES_OF_HOUR 24)");
    assertAST("25", "(MINUTES_OF_HOUR 25)");
    assertAST("26", "(MINUTES_OF_HOUR 26)");
    assertAST("27", "(MINUTES_OF_HOUR 27)");
    assertAST("28", "(MINUTES_OF_HOUR 28)");
    assertAST("29", "(MINUTES_OF_HOUR 29)");
    assertAST("30", "(MINUTES_OF_HOUR 30)");
    assertAST("31", "(MINUTES_OF_HOUR 31)");
    assertAST("32", "(MINUTES_OF_HOUR 32)");
    assertAST("33", "(MINUTES_OF_HOUR 33)");
    assertAST("34", "(MINUTES_OF_HOUR 34)");
    assertAST("35", "(MINUTES_OF_HOUR 35)");
    assertAST("36", "(MINUTES_OF_HOUR 36)");
    assertAST("37", "(MINUTES_OF_HOUR 37)");
    assertAST("38", "(MINUTES_OF_HOUR 38)");
    assertAST("39", "(MINUTES_OF_HOUR 39)");
    assertAST("40", "(MINUTES_OF_HOUR 40)");
    assertAST("41", "(MINUTES_OF_HOUR 41)");
    assertAST("42", "(MINUTES_OF_HOUR 42)");
    assertAST("43", "(MINUTES_OF_HOUR 43)");
    assertAST("44", "(MINUTES_OF_HOUR 44)");
    assertAST("45", "(MINUTES_OF_HOUR 45)");
    assertAST("46", "(MINUTES_OF_HOUR 46)");
    assertAST("47", "(MINUTES_OF_HOUR 47)");
    assertAST("48", "(MINUTES_OF_HOUR 48)");
    assertAST("49", "(MINUTES_OF_HOUR 49)");
    assertAST("50", "(MINUTES_OF_HOUR 50)");
    assertAST("51", "(MINUTES_OF_HOUR 51)");
    assertAST("52", "(MINUTES_OF_HOUR 52)");
    assertAST("53", "(MINUTES_OF_HOUR 53)");
    assertAST("54", "(MINUTES_OF_HOUR 54)");
    assertAST("55", "(MINUTES_OF_HOUR 55)");
    assertAST("56", "(MINUTES_OF_HOUR 56)");
    assertAST("57", "(MINUTES_OF_HOUR 57)");
    assertAST("58", "(MINUTES_OF_HOUR 58)");
    assertAST("59", "(MINUTES_OF_HOUR 59)");
    //assertAST("0", "FAIL ");
    //assertAST("1", "FAIL");
    //assertAST("2", "FAIL");
    //assertAST("3", "FAIL ");
    //assertAST("4", "FAIL");
    //assertAST("5", "FAIL");
    //assertAST("6", "FAIL");
    //assertAST("7", "FAIL");
    //assertAST("8", "FAIL");
    //assertAST("9", "FAIL");
    //"60" FAIL
  }
  
  @Test
  public void hours() throws Exception {
    _ruleName = "hours";
    
    assertAST("00", "(HOURS_OF_DAY 00)");
    assertAST("01", "(HOURS_OF_DAY 01)");
    assertAST("1" , "(HOURS_OF_DAY 1)");
    assertAST("02", "(HOURS_OF_DAY 02)");
    assertAST("2" , "(HOURS_OF_DAY 2)");
    assertAST("03", "(HOURS_OF_DAY 03)");
    assertAST("3" , "(HOURS_OF_DAY 3)");
    assertAST("04", "(HOURS_OF_DAY 04)");
    assertAST("4" , "(HOURS_OF_DAY 4)");
    assertAST("05", "(HOURS_OF_DAY 05)");
    assertAST("5" , "(HOURS_OF_DAY 5)");
    assertAST("06", "(HOURS_OF_DAY 06)");
    assertAST("6" , "(HOURS_OF_DAY 6)");
    assertAST("07", "(HOURS_OF_DAY 07)");
    assertAST("7" , "(HOURS_OF_DAY 7)");
    assertAST("08", "(HOURS_OF_DAY 08)");
    assertAST("8" , "(HOURS_OF_DAY 8)");
    assertAST("09", "(HOURS_OF_DAY 09)");
    assertAST("9" , "(HOURS_OF_DAY 9)");
    assertAST("10", "(HOURS_OF_DAY 10)");
    assertAST("11", "(HOURS_OF_DAY 11)");
    assertAST("12", "(HOURS_OF_DAY 12)");
    assertAST("13", "(HOURS_OF_DAY 13)");
    assertAST("14", "(HOURS_OF_DAY 14)");
    assertAST("15", "(HOURS_OF_DAY 15)");
    assertAST("16", "(HOURS_OF_DAY 16)");
    assertAST("17", "(HOURS_OF_DAY 17)");
    assertAST("18", "(HOURS_OF_DAY 18)");
    assertAST("19", "(HOURS_OF_DAY 19)");
    assertAST("20", "(HOURS_OF_DAY 20)");
    assertAST("21", "(HOURS_OF_DAY 21)");
    assertAST("22", "(HOURS_OF_DAY 22)");
    assertAST("23", "(HOURS_OF_DAY 23)");
    //"-1" FAIL
    //"24" FAIL
  }
  
  @Test
  public void explicit_time() throws Exception {
    _ruleName = "explicit_time";
  
    assertAST("0600h", "(EXPLICIT_TIME (HOURS_OF_DAY 06) (MINUTES_OF_HOUR 00))");
    assertAST("06:00h", "(EXPLICIT_TIME (HOURS_OF_DAY 06) (MINUTES_OF_HOUR 00))");
    assertAST("06:00 hours", "(EXPLICIT_TIME (HOURS_OF_DAY 06) (MINUTES_OF_HOUR 00))");
    assertAST("0000", "(EXPLICIT_TIME (HOURS_OF_DAY 00) (MINUTES_OF_HOUR 00))");
    assertAST("0700h", "(EXPLICIT_TIME (HOURS_OF_DAY 07) (MINUTES_OF_HOUR 00))");
    assertAST("6pm", "(EXPLICIT_TIME (HOURS_OF_DAY 6) (MINUTES_OF_HOUR 0) pm)");
    assertAST("5:30 a.m.", "(EXPLICIT_TIME (HOURS_OF_DAY 5) (MINUTES_OF_HOUR 30) am)");
    assertAST("5", "(EXPLICIT_TIME (HOURS_OF_DAY 5) (MINUTES_OF_HOUR 0))");
    assertAST("12:59", "(EXPLICIT_TIME (HOURS_OF_DAY 12) (MINUTES_OF_HOUR 59))");
    assertAST("23:59", "(EXPLICIT_TIME (HOURS_OF_DAY 23) (MINUTES_OF_HOUR 59))");
    assertAST("00:00", "(EXPLICIT_TIME (HOURS_OF_DAY 00) (MINUTES_OF_HOUR 00))");
    assertAST("10:00am", "(EXPLICIT_TIME (HOURS_OF_DAY 10) (MINUTES_OF_HOUR 00) am)");
    assertAST("10a", "(EXPLICIT_TIME (HOURS_OF_DAY 10) (MINUTES_OF_HOUR 0) am)");
    assertAST("10am", "(EXPLICIT_TIME (HOURS_OF_DAY 10) (MINUTES_OF_HOUR 0) am)");
    assertAST("10", "(EXPLICIT_TIME (HOURS_OF_DAY 10) (MINUTES_OF_HOUR 0))");
    assertAST("8p", "(EXPLICIT_TIME (HOURS_OF_DAY 8) (MINUTES_OF_HOUR 0) pm)");
    assertAST("8pm", "(EXPLICIT_TIME (HOURS_OF_DAY 8) (MINUTES_OF_HOUR 0) pm)");
    assertAST("8 pm", "(EXPLICIT_TIME (HOURS_OF_DAY 8) (MINUTES_OF_HOUR 0) pm)");
    assertAST("noon", "(EXPLICIT_TIME (HOURS_OF_DAY 12) (MINUTES_OF_HOUR 0) (SECONDS_OF_MINUTE 0) pm)");
    assertAST("afternoon", "(EXPLICIT_TIME (HOURS_OF_DAY 12) (MINUTES_OF_HOUR 0) (SECONDS_OF_MINUTE 0) pm)");
    assertAST("midnight", "(EXPLICIT_TIME (HOURS_OF_DAY 12) (MINUTES_OF_HOUR 0) (SECONDS_OF_MINUTE 0) am)");
    assertAST("mid-night", "(EXPLICIT_TIME (HOURS_OF_DAY 12) (MINUTES_OF_HOUR 0) (SECONDS_OF_MINUTE 0) am)");
  }
}
