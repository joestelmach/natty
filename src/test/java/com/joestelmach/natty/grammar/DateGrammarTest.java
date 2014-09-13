package com.joestelmach.natty.grammar;

import org.junit.Test;

public class DateGrammarTest extends AbstractGrammarTest {
  @Test
  public void date() throws Exception {
    _ruleName = "date";
    
    assertAST("the day before yesterday", "(RELATIVE_DATE (SEEK < by_day 1 (RELATIVE_DATE (SEEK < by_day 1 day))))");
    assertAST("1st oct in the year '89", "(EXPLICIT_DATE (MONTH_OF_YEAR 10) (DAY_OF_MONTH 1) (YEAR_OF 89))");
    assertAST("2009-10-10", "(EXPLICIT_DATE (MONTH_OF_YEAR 10) (DAY_OF_MONTH 10) (YEAR_OF 2009))");
    assertAST("seven years ago", "(RELATIVE_DATE (SEEK < by_day 7 year))");
    assertAST("next monday", "(RELATIVE_DATE (SEEK > by_week 1 (DAY_OF_WEEK 2)))");
  }
  
  @Test
  public void alternative_day_of_month_list() throws Exception {
    _ruleName = "alternative_day_of_month_list";
    
    assertAST("mon may 15 or 16", 
        "(DATE_TIME (EXPLICIT_DATE (MONTH_OF_YEAR 5) (DAY_OF_MONTH 15))) (DATE_TIME (EXPLICIT_DATE (MONTH_OF_YEAR 5) (DAY_OF_MONTH 16)))");
    
    assertAST("mon may 15 to 16", 
        "(DATE_TIME (EXPLICIT_DATE (MONTH_OF_YEAR 5) (DAY_OF_MONTH 15))) (DATE_TIME (EXPLICIT_DATE (MONTH_OF_YEAR 5) (DAY_OF_MONTH 16)))");
    
    assertAST("mon may 15 and 16", 
        "(DATE_TIME (EXPLICIT_DATE (MONTH_OF_YEAR 5) (DAY_OF_MONTH 15))) (DATE_TIME (EXPLICIT_DATE (MONTH_OF_YEAR 5) (DAY_OF_MONTH 16)))");
    
    assertAST("mon may 15 through 16", 
        "(DATE_TIME (EXPLICIT_DATE (MONTH_OF_YEAR 5) (DAY_OF_MONTH 15))) (DATE_TIME (EXPLICIT_DATE (MONTH_OF_YEAR 5) (DAY_OF_MONTH 16)))");
    
    assertAST("mon may 15 or 16", 
        "(DATE_TIME (EXPLICIT_DATE (MONTH_OF_YEAR 5) (DAY_OF_MONTH 15))) (DATE_TIME (EXPLICIT_DATE (MONTH_OF_YEAR 5) (DAY_OF_MONTH 16)))");
    
    assertAST("first or last day of september", 
        "(DATE_TIME (RELATIVE_DATE (EXPLICIT_SEEK (MONTH_OF_YEAR 9)) (EXPLICIT_SEEK (DAY_OF_MONTH 1)))) (DATE_TIME (RELATIVE_DATE (EXPLICIT_SEEK (MONTH_OF_YEAR 9)) (EXPLICIT_SEEK (DAY_OF_MONTH 31))))");
    
    assertAST("first or last day of september at 5pm", 
        "(DATE_TIME (RELATIVE_DATE (EXPLICIT_SEEK (MONTH_OF_YEAR 9)) (EXPLICIT_SEEK (DAY_OF_MONTH 1))) (EXPLICIT_TIME (HOURS_OF_DAY 5) (MINUTES_OF_HOUR 0) pm)) (DATE_TIME (RELATIVE_DATE (EXPLICIT_SEEK (MONTH_OF_YEAR 9)) (EXPLICIT_SEEK (DAY_OF_MONTH 31))) (EXPLICIT_TIME (HOURS_OF_DAY 5) (MINUTES_OF_HOUR 0) pm))");
    
    
    assertAST("first or last day of next september at 6am", 
        "(DATE_TIME (RELATIVE_DATE (SEEK > by_week 1 (MONTH_OF_YEAR 9)) (EXPLICIT_SEEK (DAY_OF_MONTH 1))) (EXPLICIT_TIME (HOURS_OF_DAY 6) (MINUTES_OF_HOUR 0) am)) (DATE_TIME (RELATIVE_DATE (SEEK > by_week 1 (MONTH_OF_YEAR 9)) (EXPLICIT_SEEK (DAY_OF_MONTH 31))) (EXPLICIT_TIME (HOURS_OF_DAY 6) (MINUTES_OF_HOUR 0) am))");
    
    assertAST("first or last day of 2 septembers from now at 5pm", 
        "(DATE_TIME (RELATIVE_DATE (SEEK > by_day 2 (MONTH_OF_YEAR 9)) (EXPLICIT_SEEK (DAY_OF_MONTH 1))) (EXPLICIT_TIME (HOURS_OF_DAY 5) (MINUTES_OF_HOUR 0) pm)) (DATE_TIME (RELATIVE_DATE (SEEK > by_day 2 (MONTH_OF_YEAR 9)) (EXPLICIT_SEEK (DAY_OF_MONTH 31))) (EXPLICIT_TIME (HOURS_OF_DAY 5) (MINUTES_OF_HOUR 0) pm))");
  }
  
  @Test
  public void global_date_prefix() throws Exception {
    _ruleName = "global_date_prefix";
  
    assertAST("the day after", "> by_day 1");
    assertAST("day after", "> by_day 1");
    assertAST("2 days after", "> by_day 2");
    assertAST("three days before", "< by_day 3");
    assertAST("six months after", "> by_month 6");
    assertAST("3 weeks before", "< by_week 3");
    assertAST("10 years after", "> by_year 10");
    assertAST("the day before", "< by_day 1");
    assertAST("day before", "< by_day 1");
  }
  
  @Test
  public void relaxed_date() throws Exception {
    _ruleName = "relaxed_date";
  
    assertAST("oct 1, 1980", "(EXPLICIT_DATE (MONTH_OF_YEAR 10) (DAY_OF_MONTH 1) (YEAR_OF 1980))");
    assertAST("oct. 1, 1980", "(EXPLICIT_DATE (MONTH_OF_YEAR 10) (DAY_OF_MONTH 1) (YEAR_OF 1980))");
    assertAST("oct 1,1980", "(EXPLICIT_DATE (MONTH_OF_YEAR 10) (DAY_OF_MONTH 1) (YEAR_OF 1980))");
    assertAST("1st oct in the year '89", "(EXPLICIT_DATE (MONTH_OF_YEAR 10) (DAY_OF_MONTH 1) (YEAR_OF 89))");
    assertAST("thirty first of december '80", "(EXPLICIT_DATE (MONTH_OF_YEAR 12) (DAY_OF_MONTH 31) (YEAR_OF 80))");
    assertAST("the first of december in the year 1980", "(EXPLICIT_DATE (MONTH_OF_YEAR 12) (DAY_OF_MONTH 1) (YEAR_OF 1980))");
    assertAST("the 2 of february in the year 1980", "(EXPLICIT_DATE (MONTH_OF_YEAR 2) (DAY_OF_MONTH 2) (YEAR_OF 1980))");
    assertAST("the 2nd of february in the year 1980", "(EXPLICIT_DATE (MONTH_OF_YEAR 2) (DAY_OF_MONTH 2) (YEAR_OF 1980))");
    assertAST("the second of february in the year 1980", "(EXPLICIT_DATE (MONTH_OF_YEAR 2) (DAY_OF_MONTH 2) (YEAR_OF 1980))");
    assertAST("jan. 2nd", "(EXPLICIT_DATE (MONTH_OF_YEAR 1) (DAY_OF_MONTH 2))");
    assertAST("sun, nov 21 2010", "(EXPLICIT_DATE (MONTH_OF_YEAR 11) (DAY_OF_MONTH 21) (DAY_OF_WEEK 1) (YEAR_OF 2010))");
  }
  
  @Test
  public void formal_date() throws Exception {
    _ruleName = "formal_date";
  
    assertAST("2009-10-10", "(EXPLICIT_DATE (MONTH_OF_YEAR 10) (DAY_OF_MONTH 10) (YEAR_OF 2009))");
    assertAST("1980-1-2", "(EXPLICIT_DATE (MONTH_OF_YEAR 1) (DAY_OF_MONTH 2) (YEAR_OF 1980))");
    assertAST("12/12/12", "(EXPLICIT_DATE (MONTH_OF_YEAR 12) (DAY_OF_MONTH 12) (YEAR_OF 12))");
    assertAST("3/4", "(EXPLICIT_DATE (MONTH_OF_YEAR 3) (DAY_OF_MONTH 4))");
    assertAST("sun, 11/21/2010", "(EXPLICIT_DATE (MONTH_OF_YEAR 11) (DAY_OF_MONTH 21) (DAY_OF_WEEK 1) (YEAR_OF 2010))");
  }

  @Test
  public void formal_month_of_year() throws Exception {
    _ruleName = "formal_month_of_year";
    
    assertAST("01", "(MONTH_OF_YEAR 01)");
    assertAST("1", "(MONTH_OF_YEAR 1)");
    assertAST("02", "(MONTH_OF_YEAR 02)");
    assertAST("2", "(MONTH_OF_YEAR 2)");
    assertAST("03", "(MONTH_OF_YEAR 03)");
    assertAST("3", "(MONTH_OF_YEAR 3)");
    assertAST("04", "(MONTH_OF_YEAR 04)");
    assertAST("4", "(MONTH_OF_YEAR 4)");
    assertAST("05", "(MONTH_OF_YEAR 05)");
    assertAST("5", "(MONTH_OF_YEAR 5)");
    assertAST("06", "(MONTH_OF_YEAR 06)");
    assertAST("6", "(MONTH_OF_YEAR 6)");
    assertAST("07", "(MONTH_OF_YEAR 07)");
    assertAST("7", "(MONTH_OF_YEAR 7)");
    assertAST("08", "(MONTH_OF_YEAR 08)");
    assertAST("8", "(MONTH_OF_YEAR 8)");
    assertAST("09", "(MONTH_OF_YEAR 09)");
    assertAST("9", "(MONTH_OF_YEAR 9)");
    assertAST("10", "(MONTH_OF_YEAR 10)");
    assertAST("11", "(MONTH_OF_YEAR 11)");
    assertAST("12", "(MONTH_OF_YEAR 12)");
    //"00" FAIL
    //"0" FAIL
    //"13" FAIL
  }

  @Test
  public void formal_day_of_month() throws Exception {
    _ruleName = "formal_day_of_month";
    
    assertAST("01",  "(DAY_OF_MONTH 01)");
    assertAST("1",  "(DAY_OF_MONTH 1)");
    assertAST("02",  "(DAY_OF_MONTH 02)");
    assertAST("2",  "(DAY_OF_MONTH 2)");
    assertAST("03",  "(DAY_OF_MONTH 03)");
    assertAST("3",  "(DAY_OF_MONTH 3)");
    assertAST("04",  "(DAY_OF_MONTH 04)");
    assertAST("4",  "(DAY_OF_MONTH 4)");
    assertAST("05",  "(DAY_OF_MONTH 05)");
    assertAST("5",  "(DAY_OF_MONTH 5)");
    assertAST("06",  "(DAY_OF_MONTH 06)");
    assertAST("6",  "(DAY_OF_MONTH 6)");
    assertAST("07",  "(DAY_OF_MONTH 07)");
    assertAST("7",  "(DAY_OF_MONTH 7)");
    assertAST("08",  "(DAY_OF_MONTH 08)");
    assertAST("8",  "(DAY_OF_MONTH 8)");
    assertAST("09",  "(DAY_OF_MONTH 09)");
    assertAST("9",  "(DAY_OF_MONTH 9)");
    assertAST("10",  "(DAY_OF_MONTH 10)");
    assertAST("11",  "(DAY_OF_MONTH 11)");
    assertAST("12",  "(DAY_OF_MONTH 12)");
    assertAST("13",  "(DAY_OF_MONTH 13)");
    assertAST("14",  "(DAY_OF_MONTH 14)");
    assertAST("15",  "(DAY_OF_MONTH 15)");
    assertAST("16",  "(DAY_OF_MONTH 16)");
    assertAST("17",  "(DAY_OF_MONTH 17)");
    assertAST("18",  "(DAY_OF_MONTH 18)");
    assertAST("19",  "(DAY_OF_MONTH 19)");
    assertAST("20",  "(DAY_OF_MONTH 20)");
    assertAST("21",  "(DAY_OF_MONTH 21)");
    assertAST("22",  "(DAY_OF_MONTH 22)");
    assertAST("23",  "(DAY_OF_MONTH 23)");
    assertAST("24",  "(DAY_OF_MONTH 24)");
    assertAST("25",  "(DAY_OF_MONTH 25)");
    assertAST("26",  "(DAY_OF_MONTH 26)");
    assertAST("27",  "(DAY_OF_MONTH 27)");
    assertAST("28",  "(DAY_OF_MONTH 28)");
    assertAST("29",  "(DAY_OF_MONTH 29)");
    assertAST("30",  "(DAY_OF_MONTH 30)");
    assertAST("31",  "(DAY_OF_MONTH 31)");
    //"00" FAIL
    //"0" FAIL
    //"32" FAIL
  }

  @Test
  public void formal_year() throws Exception {
    _ruleName = "formal_year";
    
    assertAST("1999", "(YEAR_OF 1999)");
    assertAST("80", "(YEAR_OF 80)");
    assertAST("0000", "(YEAR_OF 0000)");
    assertAST("2010", "(YEAR_OF 2010)");
    assertAST("03", "(YEAR_OF 03)");
    //"037" FAIL
    //"0" FAIL
    //"03700" FAIL
  }
    
  @Test
  public void formal_year_four_digits() throws Exception {
    _ruleName = "formal_year_four_digits";
    
    assertAST("1999", "(YEAR_OF 1999)");
    assertAST("0000", "(YEAR_OF 0000)");
    assertAST("2010", "(YEAR_OF 2010)");
    //assertAST("80" FAIL
    //assertAST("03" FAIL
    //assertAST("037" FAIL
    //assertAST("0" FAIL
    //assertAST("03700" FAIL
  }

  @Test
  public void formal_date_separator() throws Exception {
    _ruleName = "formal_date_separator";
    
    assertAST("-", "-");
    assertAST("/", "/");
  }
  
  @Test
  public void relative_date() throws Exception {
    _ruleName = "relative_date";
  
    assertAST("yesterday", "(RELATIVE_DATE (SEEK < by_day 1 day))");
    assertAST("tomorrow", "(RELATIVE_DATE (SEEK > by_day 1 day))");
    assertAST("in 3 days", "(RELATIVE_DATE (SEEK > by_day 3 day))");
    assertAST("3 days ago", "(RELATIVE_DATE (SEEK < by_day 3 day))");
    assertAST("in 3 weeks", "(RELATIVE_DATE (SEEK > by_day 3 week))");
    assertAST("four weeks ago", "(RELATIVE_DATE (SEEK < by_day 4 week))");
    assertAST("in 3 months", "(RELATIVE_DATE (SEEK > by_day 3 month))");
    assertAST("three months ago", "(RELATIVE_DATE (SEEK < by_day 3 month))");
    assertAST("in 3 years", "(RELATIVE_DATE (SEEK > by_day 3 year))");
    assertAST("seven years ago", "(RELATIVE_DATE (SEEK < by_day 7 year))");
    assertAST("60 years ago", "(RELATIVE_DATE (SEEK < by_day 60 year))");
    assertAST("32 days ago", "(RELATIVE_DATE (SEEK < by_day 32 day))");
    assertAST("next monday", "(RELATIVE_DATE (SEEK > by_week 1 (DAY_OF_WEEK 2)))");
    assertAST("next mon", "(RELATIVE_DATE (SEEK > by_week 1 (DAY_OF_WEEK 2)))");
    assertAST("4 mondays from now", "(RELATIVE_DATE (SEEK > by_day 4 (DAY_OF_WEEK 2)))");
    assertAST("4 mondays from today", "(RELATIVE_DATE (SEEK > by_day 4 (DAY_OF_WEEK 2)))");
    assertAST("next weekend", "(RELATIVE_DATE (SEEK > by_week 1 (DAY_OF_WEEK 7)))");
    assertAST("six mondays ago", "(RELATIVE_DATE (SEEK < by_day 6 (DAY_OF_WEEK 2)))");
    assertAST("last monday", "(RELATIVE_DATE (SEEK < by_week 1 (DAY_OF_WEEK 2)))");
    assertAST("last mon", "(RELATIVE_DATE (SEEK < by_week 1 (DAY_OF_WEEK 2)))");
    assertAST("this past mon", "(RELATIVE_DATE (SEEK < by_day 1 (DAY_OF_WEEK 2)))");
    assertAST("this coming mon", "(RELATIVE_DATE (SEEK > by_day 1 (DAY_OF_WEEK 2)))");
    assertAST("this upcoming mon", "(RELATIVE_DATE (SEEK > by_day 1 (DAY_OF_WEEK 2)))");
    assertAST("next thurs", "(RELATIVE_DATE (SEEK > by_week 1 (DAY_OF_WEEK 5)))");
    assertAST("next month", "(RELATIVE_DATE (SEEK > by_week 1 month))");
    assertAST("last month", "(RELATIVE_DATE (SEEK < by_week 1 month))");
    assertAST("next week", "(RELATIVE_DATE (SEEK > by_week 1 week))");
    assertAST("last week", "(RELATIVE_DATE (SEEK < by_week 1 week))");
    assertAST("next year", "(RELATIVE_DATE (SEEK > by_week 1 year))");
    assertAST("last year", "(RELATIVE_DATE (SEEK < by_week 1 year))");
  }
  
  @Test
  public void explicit_relative_date() throws Exception {
    _ruleName = "explicit_relative_date";
    
    assertAST("monday of last week", 
        "(RELATIVE_DATE (SEEK < by_week 1 week) (EXPLICIT_SEEK (DAY_OF_WEEK 2)))");
    
    assertAST("tuesday of next week",
        "(RELATIVE_DATE (SEEK > by_week 1 week) (EXPLICIT_SEEK (DAY_OF_WEEK 3)))");
    
    assertAST("the monday of 2 weeks ago",
        "(RELATIVE_DATE (SEEK < by_day 2 week) (EXPLICIT_SEEK (DAY_OF_WEEK 2)))");
    
    assertAST("tuesday of 3 weeks from now",
        "(RELATIVE_DATE (SEEK > by_day 3 week) (EXPLICIT_SEEK (DAY_OF_WEEK 3)))");
    
    assertAST("monday of 3 weeks from now",
        "(RELATIVE_DATE (SEEK > by_day 3 week) (EXPLICIT_SEEK (DAY_OF_WEEK 2)))");
    
    assertAST("1st of three months ago",
        "(RELATIVE_DATE (SEEK < by_day 3 month) (EXPLICIT_SEEK (DAY_OF_MONTH 1)))");
    
    assertAST("10th of next month",
        "(RELATIVE_DATE (SEEK > by_week 1 month) (EXPLICIT_SEEK (DAY_OF_MONTH 10)))");
    
    assertAST("28th of last month",
        "(RELATIVE_DATE (SEEK < by_week 1 month) (EXPLICIT_SEEK (DAY_OF_MONTH 28)))");
    
    assertAST("10th of next october",
        "(RELATIVE_DATE (SEEK > by_week 1 (MONTH_OF_YEAR 10)) (EXPLICIT_SEEK (DAY_OF_MONTH 10)))");
    
    assertAST("the 30th of this month",
        "(RELATIVE_DATE (SEEK > by_day 0 month) (EXPLICIT_SEEK (DAY_OF_MONTH 30)))");
    
    assertAST("10th of the month after next", 
        "(RELATIVE_DATE (SEEK > by_day 2 month) (EXPLICIT_SEEK (DAY_OF_MONTH 10)))");
    
    assertAST("the last thursday in november", 
        "(RELATIVE_DATE (SEEK > by_day 0 (MONTH_OF_YEAR 11)) (EXPLICIT_SEEK 5 (DAY_OF_WEEK 5)))");
    
    assertAST("the last thursday in november 1999", 
        "(RELATIVE_DATE (SEEK > by_day 0 (MONTH_OF_YEAR 11)) (EXPLICIT_SEEK (YEAR_OF 1999)) (EXPLICIT_SEEK 5 (DAY_OF_WEEK 5)))");
    
    assertAST("3rd wed in next month",
        "(RELATIVE_DATE (SEEK > by_week 1 month) (EXPLICIT_SEEK 3 (DAY_OF_WEEK 4)))");
    
    assertAST("the last sunday in november",
        "(RELATIVE_DATE (SEEK > by_day 0 (MONTH_OF_YEAR 11)) (EXPLICIT_SEEK 5 (DAY_OF_WEEK 1)))");
    
    assertAST("the first wed. in january",
        "(RELATIVE_DATE (SEEK > by_day 0 (MONTH_OF_YEAR 1)) (EXPLICIT_SEEK 1 (DAY_OF_WEEK 4)))");
    
    assertAST("the last day of february 1999",
        "(RELATIVE_DATE (SEEK > by_day 0 (MONTH_OF_YEAR 2)) (EXPLICIT_SEEK (DAY_OF_MONTH 31)) (EXPLICIT_SEEK (YEAR_OF 1999)))");
    
    assertAST("the first wed. in january in the year 2004",
        "(RELATIVE_DATE (SEEK > by_day 0 (MONTH_OF_YEAR 1)) (EXPLICIT_SEEK (YEAR_OF 2004)) (EXPLICIT_SEEK 1 (DAY_OF_WEEK 4)))");
    
    assertAST("last monday of last month", 
        "(RELATIVE_DATE (SEEK < by_week 1 month) (EXPLICIT_SEEK 5 (DAY_OF_WEEK 2)))");
    
    assertAST("the last sunday of next nov", 
        "(RELATIVE_DATE (SEEK > by_week 1 (MONTH_OF_YEAR 11)) (EXPLICIT_SEEK 5 (DAY_OF_WEEK 1)))");
    
    assertAST("the 3rd sunday of 2 novembers from now", 
        "(RELATIVE_DATE (SEEK > by_day 2 (MONTH_OF_YEAR 11)) (EXPLICIT_SEEK 3 (DAY_OF_WEEK 1)))");
    
    assertAST("the last monday in 2 novembers ago", 
        "(RELATIVE_DATE (SEEK < by_day 2 (MONTH_OF_YEAR 11)) (EXPLICIT_SEEK 5 (DAY_OF_WEEK 2)))");
    
    assertAST("the beginning of next week", 
        "(RELATIVE_DATE (SEEK > by_week 1 week) (EXPLICIT_SEEK (DAY_OF_WEEK 2)))");
    
    assertAST("the end of next week",
        "(RELATIVE_DATE (SEEK > by_week 1 week) (EXPLICIT_SEEK (DAY_OF_WEEK 6)))");
    
    assertAST("the end of this week",
        "(RELATIVE_DATE (SEEK > by_day 0 week) (EXPLICIT_SEEK (DAY_OF_WEEK 6)))");
    
    assertAST("the start of this week",
        "(RELATIVE_DATE (SEEK > by_day 0 week) (EXPLICIT_SEEK (DAY_OF_WEEK 2)))");
    
    assertAST("start of 3 weeks from now",
        "(RELATIVE_DATE (SEEK > by_day 3 week) (EXPLICIT_SEEK (DAY_OF_WEEK 2)))");
    
    assertAST("the end of 3 weeks ago",
        "(RELATIVE_DATE (SEEK < by_day 3 week) (EXPLICIT_SEEK (DAY_OF_WEEK 6)))");
    
    assertAST("the first day of this week",
        "(RELATIVE_DATE (SEEK > by_day 0 week) (EXPLICIT_SEEK (DAY_OF_WEEK 2)))");
    
    assertAST("the last day of next week",
        "(RELATIVE_DATE (SEEK > by_week 1 week) (EXPLICIT_SEEK (DAY_OF_WEEK 6)))");
    
    assertAST("first day of next week",
        "(RELATIVE_DATE (SEEK > by_week 1 week) (EXPLICIT_SEEK (DAY_OF_WEEK 2)))");
    
    assertAST("last day of last week",
        "(RELATIVE_DATE (SEEK < by_week 1 week) (EXPLICIT_SEEK (DAY_OF_WEEK 6)))");
    
    assertAST("start of 3 months from now",
        "(RELATIVE_DATE (SEEK > by_day 3 month) (EXPLICIT_SEEK (DAY_OF_MONTH 1)))");
    
    assertAST("beginning of next month",
        "(RELATIVE_DATE (SEEK > by_week 1 month) (EXPLICIT_SEEK (DAY_OF_MONTH 1)))");
    
    assertAST("end of next month",
        "(RELATIVE_DATE (SEEK > by_week 1 month) (EXPLICIT_SEEK (DAY_OF_MONTH 31)))");
    
    assertAST("last day of next month",
        "(RELATIVE_DATE (SEEK > by_week 1 month) (EXPLICIT_SEEK (DAY_OF_MONTH 31)))");
    
    assertAST("first day of 3 months from now",
        "(RELATIVE_DATE (SEEK > by_day 3 month) (EXPLICIT_SEEK (DAY_OF_MONTH 1)))");
    
    assertAST("end of next october",
        "(RELATIVE_DATE (SEEK > by_week 1 (MONTH_OF_YEAR 10)) (EXPLICIT_SEEK (DAY_OF_MONTH 31)))");
    
    assertAST("first day of feb",
        "(RELATIVE_DATE (SEEK > by_day 0 (MONTH_OF_YEAR 2)) (EXPLICIT_SEEK (DAY_OF_MONTH 1)))");
    
    assertAST("last day of three februarys from now",
        "(RELATIVE_DATE (SEEK > by_day 3 (MONTH_OF_YEAR 2)) (EXPLICIT_SEEK (DAY_OF_MONTH 31)))");
    
    assertAST("in the end of next week",
        "(RELATIVE_DATE (SEEK > by_week 1 week) (EXPLICIT_SEEK (DAY_OF_WEEK 6)))");
    
    assertAST("at the end of last week",
        "(RELATIVE_DATE (SEEK < by_week 1 week) (EXPLICIT_SEEK (DAY_OF_WEEK 6)))");
    
    assertAST("at the end of 2 weeks",
        "(RELATIVE_DATE (SEEK > by_day 2 week) (EXPLICIT_SEEK (DAY_OF_WEEK 6)))");
    
    assertAST("in the start of june",
        "(RELATIVE_DATE (SEEK > by_day 0 (MONTH_OF_YEAR 6)) (EXPLICIT_SEEK (DAY_OF_MONTH 1)))");
    
    assertAST("at the end of next week",
        "(RELATIVE_DATE (SEEK > by_week 1 week) (EXPLICIT_SEEK (DAY_OF_WEEK 6)))");
    
    assertAST("at the end of last month",
        "(RELATIVE_DATE (SEEK < by_week 1 month) (EXPLICIT_SEEK (DAY_OF_MONTH 31)))");
    
    assertAST("the second day of april",
        "(RELATIVE_DATE (SEEK > by_day 0 (MONTH_OF_YEAR 4)) (EXPLICIT_SEEK (DAY_OF_MONTH 2)))");
    
    assertAST("the thirtieth day of next april",
        "(RELATIVE_DATE (SEEK > by_week 1 (MONTH_OF_YEAR 4)) (EXPLICIT_SEEK (DAY_OF_MONTH 30)))");
  }
  
  @Test
  public void relative_occurrence_index() throws Exception {
    _ruleName = "relative_occurrence_index";
    
    assertAST("1", "1");
    assertAST("2", "2");
    assertAST("3", "3");
    assertAST("4", "4");
    assertAST("5", "5");
    assertAST("first", "1");
    assertAST("second", "2");
    assertAST("third", "3");
    assertAST("fourth", "4");
    assertAST("fifth", "5");
    assertAST("last", "5");
    //assertAST("sixth" FAIL);
    //assertAST("6" FAIL);
  }
  
  @Test
  public void relative_target() throws Exception {
    _ruleName = "relative_target";
    
    assertAST("sunday"    , "(DAY_OF_WEEK 1)");
    assertAST("sundays"   , "(DAY_OF_WEEK 1)");
    assertAST("sun"       , "(DAY_OF_WEEK 1)");
    assertAST("monday"    , "(DAY_OF_WEEK 2)");
    assertAST("mondays"   , "(DAY_OF_WEEK 2)");
    assertAST("mon"       , "(DAY_OF_WEEK 2)");
    assertAST("tuesday"   , "(DAY_OF_WEEK 3)");
    assertAST("tuesdays"  , "(DAY_OF_WEEK 3)");
    assertAST("tues"      , "(DAY_OF_WEEK 3)");
    assertAST("tue"       , "(DAY_OF_WEEK 3)");
    assertAST("wednesday" , "(DAY_OF_WEEK 4)");
    assertAST("wednesdays", "(DAY_OF_WEEK 4)");
    assertAST("wed"       , "(DAY_OF_WEEK 4)");
    assertAST("thursday"  , "(DAY_OF_WEEK 5)");
    assertAST("thursdays" , "(DAY_OF_WEEK 5)");
    assertAST("thur"      , "(DAY_OF_WEEK 5)");
    assertAST("thu"       , "(DAY_OF_WEEK 5)");
    assertAST("friday"    , "(DAY_OF_WEEK 6)");
    assertAST("fridays"   , "(DAY_OF_WEEK 6)");
    assertAST("fri"       , "(DAY_OF_WEEK 6)");
    assertAST("saturday"  , "(DAY_OF_WEEK 7)");
    assertAST("saturdays" , "(DAY_OF_WEEK 7)");
    assertAST("sat"       , "(DAY_OF_WEEK 7)");
    assertAST("day", "day");
    assertAST("days", "day");
    assertAST("week", "week");
    assertAST("weeks", "week");
    assertAST("month", "month");
    assertAST("months", "month");
    assertAST("year", "year");
    assertAST("years", "year");
  }

  @Test
  public void relaxed_day_of_month() throws Exception {
    _ruleName = "relaxed_day_of_month";
  
    assertAST("three", "(DAY_OF_MONTH 3)");
    assertAST("third", "(DAY_OF_MONTH 3)");
    assertAST("3rd", "(DAY_OF_MONTH 3)");
    assertAST("3", "(DAY_OF_MONTH 3)");
    assertAST("03", "(DAY_OF_MONTH 03)");
    assertAST("21", "(DAY_OF_MONTH 21)");
    assertAST("thirty one", "(DAY_OF_MONTH 31)");
    assertAST("thirty-one", "(DAY_OF_MONTH 31)");
    assertAST("thirty first", "(DAY_OF_MONTH 31)");
    assertAST("thirty-first", "(DAY_OF_MONTH 31)");
    assertAST("31st", "(DAY_OF_MONTH 31)");
    //assertAST("32" FAIL
  }

  @Test
  public void relaxed_year() throws Exception {
    _ruleName = "relaxed_year";
    
    assertAST("'69", "(YEAR_OF 69)");
    assertAST("79", "(YEAR_OF 79)");
    assertAST("2079", "(YEAR_OF 2079)");
    assertAST("'80", "(YEAR_OF 80)");
    assertAST("1979", "(YEAR_OF 1979)");
    assertAST("2004", "(YEAR_OF 2004)");
    //assertAST("999" FAIL");
    //assertAST("999" FAIL");
  }

  @Test
  public void relaxed_year_prefix() throws Exception {
    _ruleName = "relaxed_year_prefix";
    
    //assertAST(", in the year ", ", in the year");
    //assertAST(" in the year ", " in the year");
    //assertAST("in the year ", "in the year");
    //assertAST("in the yesr ", "in the year");
  }

  @Test
  public void implicit_prefix() throws Exception {
    _ruleName = "implicit_prefix";
    
    assertAST("this", "> by_day 0");
  }

  @Test
  public void relative_date_prefix() throws Exception {
    _ruleName = "relative_date_prefix";
  
    assertAST("this last"    , "< by_week 1");
    assertAST("last"         , "< by_week 1");
    assertAST("this past"    , "< by_day 1");
    assertAST("past"         , "< by_day 1");
    assertAST("this next"    , "> by_week 1");
    assertAST("next"         , "> by_week 1");
    assertAST("this coming"  , "> by_day 1");
    assertAST("coming"       , "> by_day 1");
    assertAST("this upcoming", "> by_day 1");
    assertAST("upcoming"     , "> by_day 1");
    assertAST("3"            , "> by_day 3");
    assertAST("twenty-eight" , "> by_day 28");
    //assertAST("in 3"         , "> by_day 3");
    //assertAST("in twenty"    , "> by_day 20");
  }

  @Test
  public void relative_date_suffix() throws Exception {
    _ruleName = "relative_date_suffix";
    
    assertAST("from now", "> by_day");
    assertAST("ago", "< by_day");
  }
  
  @Test
  public void relative_date_span() throws Exception {
    _ruleName = "relative_date_span";
    
    assertAST("day", "day");
    assertAST("days", "day");
    assertAST("week", "week");
    assertAST("weeks", "week");
    assertAST("month", "month");
    assertAST("months", "month");
    assertAST("year", "year");
    assertAST("years", "year");
  }
  
  @Test
  public void relaxed_month() throws Exception {
    _ruleName = "relaxed_month";
    
    assertAST("january", "(MONTH_OF_YEAR 1)");
    assertAST("jan", "(MONTH_OF_YEAR 1)");
    assertAST("february", "(MONTH_OF_YEAR 2)");
    assertAST("feb", "(MONTH_OF_YEAR 2)");
    assertAST("march", "(MONTH_OF_YEAR 3)");
    assertAST("mar", "(MONTH_OF_YEAR 3)");
    assertAST("april", "(MONTH_OF_YEAR 4)");
    assertAST("apr", "(MONTH_OF_YEAR 4)");
    assertAST("may", "(MONTH_OF_YEAR 5)");
    assertAST("june", "(MONTH_OF_YEAR 6)");
    assertAST("jun", "(MONTH_OF_YEAR 6)");
    assertAST("july", "(MONTH_OF_YEAR 7)");
    assertAST("jul", "(MONTH_OF_YEAR 7)");
    assertAST("august", "(MONTH_OF_YEAR 8)");
    assertAST("aug", "(MONTH_OF_YEAR 8)");
    assertAST("september", "(MONTH_OF_YEAR 9)");
    assertAST("sep", "(MONTH_OF_YEAR 9)");
    assertAST("sept", "(MONTH_OF_YEAR 9)");
    assertAST("october", "(MONTH_OF_YEAR 10)");
    assertAST("oct", "(MONTH_OF_YEAR 10)");
    assertAST("november", "(MONTH_OF_YEAR 11)");
    assertAST("nov", "(MONTH_OF_YEAR 11)");
    assertAST("december", "(MONTH_OF_YEAR 12)");
    assertAST("dec", "(MONTH_OF_YEAR 12)");
    assertAST("jan.", "(MONTH_OF_YEAR 1)");
    assertAST("feb.", "(MONTH_OF_YEAR 2)");
    assertAST("mar.", "(MONTH_OF_YEAR 3)");
    assertAST("apr.", "(MONTH_OF_YEAR 4)");
    assertAST("jun.", "(MONTH_OF_YEAR 6)");
    assertAST("jul.", "(MONTH_OF_YEAR 7)");
    assertAST("aug.", "(MONTH_OF_YEAR 8)");
    assertAST("sep.", "(MONTH_OF_YEAR 9)");
    assertAST("sept.", "(MONTH_OF_YEAR 9)");
    assertAST("oct.", "(MONTH_OF_YEAR 10)");
    assertAST("nov.", "(MONTH_OF_YEAR 11)");
    assertAST("dec.", "(MONTH_OF_YEAR 12)");
  }
  
  @Test
  public void day_of_week() throws Exception {
    _ruleName = "day_of_week";

    assertAST("sunday"    , "(DAY_OF_WEEK 1)");
    assertAST("sundays"   , "(DAY_OF_WEEK 1)");
    assertAST("sun"       , "(DAY_OF_WEEK 1)");
    assertAST("sun."      , "(DAY_OF_WEEK 1)");
    assertAST("monday"    , "(DAY_OF_WEEK 2)");
    assertAST("mondays"   , "(DAY_OF_WEEK 2)");
    assertAST("mon"       , "(DAY_OF_WEEK 2)");
    assertAST("mon."      , "(DAY_OF_WEEK 2)");
    assertAST("tuesday"   , "(DAY_OF_WEEK 3)");
    assertAST("tuesdays"  , "(DAY_OF_WEEK 3)");
    assertAST("tues"      , "(DAY_OF_WEEK 3)");
    assertAST("tues."     , "(DAY_OF_WEEK 3)");
    assertAST("tue"       , "(DAY_OF_WEEK 3)");
    assertAST("tue."      , "(DAY_OF_WEEK 3)");
    assertAST("wednesday" , "(DAY_OF_WEEK 4)");
    assertAST("wednesdays", "(DAY_OF_WEEK 4)");
    assertAST("wed"       , "(DAY_OF_WEEK 4)");
    assertAST("wed."      , "(DAY_OF_WEEK 4)");
    assertAST("thursday"  , "(DAY_OF_WEEK 5)");
    assertAST("thursdays" , "(DAY_OF_WEEK 5)");
    assertAST("thur"      , "(DAY_OF_WEEK 5)");
    assertAST("thur."     , "(DAY_OF_WEEK 5)");
    assertAST("thu"       , "(DAY_OF_WEEK 5)");
    assertAST("thu."      , "(DAY_OF_WEEK 5)");
    assertAST("friday"    , "(DAY_OF_WEEK 6)");
    assertAST("fridays"   , "(DAY_OF_WEEK 6)");
    assertAST("fri"       , "(DAY_OF_WEEK 6)");
    assertAST("fri."      , "(DAY_OF_WEEK 6)");
    assertAST("saturday"  , "(DAY_OF_WEEK 7)");
    assertAST("saturdays" , "(DAY_OF_WEEK 7)");
    assertAST("sat"       , "(DAY_OF_WEEK 7)");
    assertAST("sat."      , "(DAY_OF_WEEK 7)");
  }	

  @Test
  public void named_relative_date() throws Exception {
    _ruleName = "named_relative_date";
    
    assertAST("today", "(RELATIVE_DATE (SEEK > by_day 0 day))");
    assertAST("now", "(RELATIVE_DATE (SEEK > by_day 0 day))");
    assertAST("tomorow"  , "(RELATIVE_DATE (SEEK > by_day 1 day))");
    assertAST("tomorrow" , "(RELATIVE_DATE (SEEK > by_day 1 day))");
    assertAST("tommorow" , "(RELATIVE_DATE (SEEK > by_day 1 day))");
    assertAST("tommorrow", "(RELATIVE_DATE (SEEK > by_day 1 day))");
    assertAST("yesterday", "(RELATIVE_DATE (SEEK < by_day 1 day))");
  }
}
