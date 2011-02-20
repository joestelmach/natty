package com.natty.joestelmach.grammar;

import org.junit.Test;

public class DateTimeGrammar extends AbstractGrammarTest {
  
  @Test
  public void date_time_alternative() throws Exception {
    _ruleName = "date_time_alternative";
    
    assertAST("this wed. or next at 5pm", "(DATE_TIME_ALTERNATIVE (DATE_TIME (RELATIVE_DATE (SEEK > by_day 0 (DAY_OF_WEEK 4))) (EXPLICIT_TIME (HOURS_OF_DAY 5) (MINUTES_OF_HOUR 0) pm)) (DATE_TIME (RELATIVE_DATE (SEEK > by_week 1 (DAY_OF_WEEK 4))) (EXPLICIT_TIME (HOURS_OF_DAY 5) (MINUTES_OF_HOUR 0) pm)))");
    assertAST("feb 28th or 2 days after", "(DATE_TIME_ALTERNATIVE (DATE_TIME (EXPLICIT_DATE (MONTH_OF_YEAR 2) (DAY_OF_MONTH 28))) (DATE_TIME (RELATIVE_DATE (SEEK > by_day 2 (EXPLICIT_DATE (MONTH_OF_YEAR 2) (DAY_OF_MONTH 28))))))");
    assertAST("january fourth or the friday after", "(DATE_TIME_ALTERNATIVE (DATE_TIME (EXPLICIT_DATE (MONTH_OF_YEAR 1) (DAY_OF_MONTH 4))) (DATE_TIME (RELATIVE_DATE (SEEK > by_day 1 (DAY_OF_WEEK 6) (EXPLICIT_DATE (MONTH_OF_YEAR 1) (DAY_OF_MONTH 4))))))");
    assertAST("10/10/2008 or 10/12/2008", "(DATE_TIME_ALTERNATIVE (DATE_TIME (EXPLICIT_DATE (MONTH_OF_YEAR 10) (DAY_OF_MONTH 10) (YEAR_OF 2008))) (DATE_TIME (EXPLICIT_DATE (MONTH_OF_YEAR 10) (DAY_OF_MONTH 12) (YEAR_OF 2008))))");
    assertAST("next wed or thursday", "(DATE_TIME_ALTERNATIVE (DATE_TIME (RELATIVE_DATE (SEEK > by_week 1 (DAY_OF_WEEK 4)))) (DATE_TIME (RELATIVE_DATE (SEEK > by_week 1 (DAY_OF_WEEK 5)))))");
    assertAST("next wed, thurs, fri", "(DATE_TIME_ALTERNATIVE (DATE_TIME (RELATIVE_DATE (SEEK > by_week 1 (DAY_OF_WEEK 4)))) (DATE_TIME (RELATIVE_DATE (SEEK > by_week 1 (DAY_OF_WEEK 5)))) (DATE_TIME (RELATIVE_DATE (SEEK > by_week 1 (DAY_OF_WEEK 6)))))");
    assertAST("next wed, thurs, or fri at 6pm", "(DATE_TIME_ALTERNATIVE (DATE_TIME (RELATIVE_DATE (SEEK > by_week 1 (DAY_OF_WEEK 4))) (EXPLICIT_TIME (HOURS_OF_DAY 6) (MINUTES_OF_HOUR 0) pm)) (DATE_TIME (RELATIVE_DATE (SEEK > by_week 1 (DAY_OF_WEEK 5))) (EXPLICIT_TIME (HOURS_OF_DAY 6) (MINUTES_OF_HOUR 0) pm)) (DATE_TIME (RELATIVE_DATE (SEEK > by_week 1 (DAY_OF_WEEK 6))) (EXPLICIT_TIME (HOURS_OF_DAY 6) (MINUTES_OF_HOUR 0) pm)))");
    assertAST("10/10 or 12/30 or 10/15 at 5pm", "(DATE_TIME_ALTERNATIVE (DATE_TIME (EXPLICIT_DATE (MONTH_OF_YEAR 10) (DAY_OF_MONTH 10)) (EXPLICIT_TIME (HOURS_OF_DAY 5) (MINUTES_OF_HOUR 0) pm)) (DATE_TIME (EXPLICIT_DATE (MONTH_OF_YEAR 12) (DAY_OF_MONTH 30)) (EXPLICIT_TIME (HOURS_OF_DAY 5) (MINUTES_OF_HOUR 0) pm)) (DATE_TIME (EXPLICIT_DATE (MONTH_OF_YEAR 10) (DAY_OF_MONTH 15)) (EXPLICIT_TIME (HOURS_OF_DAY 5) (MINUTES_OF_HOUR 0) pm)))");
    assertAST("monday to friday", "(DATE_TIME_ALTERNATIVE (DATE_TIME (RELATIVE_DATE (SEEK > by_day 0 (DAY_OF_WEEK 2)))) (DATE_TIME (RELATIVE_DATE (SEEK > by_day 0 (DAY_OF_WEEK 6)))))");
    assertAST("1999-12-31 to tomorrow", "(DATE_TIME_ALTERNATIVE (DATE_TIME (EXPLICIT_DATE (MONTH_OF_YEAR 12) (DAY_OF_MONTH 31) (YEAR_OF 1999))) (DATE_TIME (RELATIVE_DATE (SEEK > by_day 1 day))))");
    assertAST("now to 2010-01-01", "(DATE_TIME_ALTERNATIVE (DATE_TIME (RELATIVE_DATE (SEEK > by_day 0 day))) (DATE_TIME (EXPLICIT_DATE (MONTH_OF_YEAR 01) (DAY_OF_MONTH 01) (YEAR_OF 2010))))");
    assertAST("2009-03-10 9:00 to 11:00", "(DATE_TIME_ALTERNATIVE (DATE_TIME (EXPLICIT_DATE (MONTH_OF_YEAR 03) (DAY_OF_MONTH 10) (YEAR_OF 2009)) (EXPLICIT_TIME (HOURS_OF_DAY 9) (MINUTES_OF_HOUR 00))) (DATE_TIME (EXPLICIT_TIME (HOURS_OF_DAY 11) (MINUTES_OF_HOUR 00))))");
    assertAST("26 oct 10:00 am to 11:00 am", "(DATE_TIME_ALTERNATIVE (DATE_TIME (EXPLICIT_DATE (MONTH_OF_YEAR 10) (DAY_OF_MONTH 26)) (EXPLICIT_TIME (HOURS_OF_DAY 10) (MINUTES_OF_HOUR 00) am)) (DATE_TIME (EXPLICIT_TIME (HOURS_OF_DAY 11) (MINUTES_OF_HOUR 00) am)))");
    assertAST("jan 1 to 2", "(DATE_TIME_ALTERNATIVE (DATE_TIME (EXPLICIT_DATE (MONTH_OF_YEAR 1) (DAY_OF_MONTH 1))) (DATE_TIME (EXPLICIT_DATE (MONTH_OF_YEAR 1) (DAY_OF_MONTH 2))))");
    assertAST("16:00 nov 6 to 17:00", "(DATE_TIME_ALTERNATIVE (DATE_TIME (EXPLICIT_DATE (MONTH_OF_YEAR 11) (DAY_OF_MONTH 6)) (EXPLICIT_TIME (HOURS_OF_DAY 16) (MINUTES_OF_HOUR 00))) (DATE_TIME (EXPLICIT_TIME (HOURS_OF_DAY 17) (MINUTES_OF_HOUR 00))))");
    assertAST("may 2nd to 5th", "(DATE_TIME_ALTERNATIVE (DATE_TIME (EXPLICIT_DATE (MONTH_OF_YEAR 5) (DAY_OF_MONTH 2))) (DATE_TIME (EXPLICIT_DATE (MONTH_OF_YEAR 5) (DAY_OF_MONTH 5))))");
    assertAST("6am dec 5 to 7am", "(DATE_TIME_ALTERNATIVE (DATE_TIME (EXPLICIT_DATE (MONTH_OF_YEAR 12) (DAY_OF_MONTH 5)) (EXPLICIT_TIME (HOURS_OF_DAY 6) (MINUTES_OF_HOUR 0) am)) (DATE_TIME (EXPLICIT_TIME (HOURS_OF_DAY 7) (MINUTES_OF_HOUR 0) am)))");
    assertAST("1/3 to 2/3", "(DATE_TIME_ALTERNATIVE (DATE_TIME (EXPLICIT_DATE (MONTH_OF_YEAR 1) (DAY_OF_MONTH 3))) (DATE_TIME (EXPLICIT_DATE (MONTH_OF_YEAR 2) (DAY_OF_MONTH 3))))");
    assertAST("2/3 to in 1 week", "(DATE_TIME_ALTERNATIVE (DATE_TIME (EXPLICIT_DATE (MONTH_OF_YEAR 2) (DAY_OF_MONTH 3))) (DATE_TIME (RELATIVE_DATE (SEEK > by_day 1 week))))");
    assertAST("first day of may to last day of may", "(DATE_TIME_ALTERNATIVE (DATE_TIME (RELATIVE_DATE (SEEK > by_day 0 (MONTH_OF_YEAR 5)) (EXPLICIT_SEEK (DAY_OF_MONTH 1)))) (DATE_TIME (RELATIVE_DATE (SEEK > by_day 0 (MONTH_OF_YEAR 5)) (EXPLICIT_SEEK (DAY_OF_MONTH 31)))))");
  }

  
  @Test
  public void date_time() throws Exception {
    _ruleName = "date_time";
    
    assertAST("seven years ago at 3pm", "(DATE_TIME (RELATIVE_DATE (SEEK < by_day 7 year)) (EXPLICIT_TIME (HOURS_OF_DAY 3) (MINUTES_OF_HOUR 0) pm))");
    assertAST("1st oct in the year '89 1300 hours", "(DATE_TIME (EXPLICIT_DATE (MONTH_OF_YEAR 10) (DAY_OF_MONTH 1) (YEAR_OF 89)) (EXPLICIT_TIME (HOURS_OF_DAY 13) (MINUTES_OF_HOUR 00)))");
    assertAST("1st oct in the year '89 at 1300 hours", "(DATE_TIME (EXPLICIT_DATE (MONTH_OF_YEAR 10) (DAY_OF_MONTH 1) (YEAR_OF 89)) (EXPLICIT_TIME (HOURS_OF_DAY 13) (MINUTES_OF_HOUR 00)))");
    assertAST("1st oct in the year '89, 13:00", "(DATE_TIME (EXPLICIT_DATE (MONTH_OF_YEAR 10) (DAY_OF_MONTH 1) (YEAR_OF 89)) (EXPLICIT_TIME (HOURS_OF_DAY 13) (MINUTES_OF_HOUR 00)))");
    assertAST("1st oct in the year '89,13:00", "(DATE_TIME (EXPLICIT_DATE (MONTH_OF_YEAR 10) (DAY_OF_MONTH 1) (YEAR_OF 89)) (EXPLICIT_TIME (HOURS_OF_DAY 13) (MINUTES_OF_HOUR 00)))");
    assertAST("1st oct in the year '89, at 13:00", "(DATE_TIME (EXPLICIT_DATE (MONTH_OF_YEAR 10) (DAY_OF_MONTH 1) (YEAR_OF 89)) (EXPLICIT_TIME (HOURS_OF_DAY 13) (MINUTES_OF_HOUR 00)))");
    assertAST("3am on oct 1st 2010", "(DATE_TIME (EXPLICIT_DATE (MONTH_OF_YEAR 10) (DAY_OF_MONTH 1) (YEAR_OF 2010)) (EXPLICIT_TIME (HOURS_OF_DAY 3) (MINUTES_OF_HOUR 0) am))");
    assertAST("3am, october first 2010", "(DATE_TIME (EXPLICIT_DATE (MONTH_OF_YEAR 10) (DAY_OF_MONTH 1) (YEAR_OF 2010)) (EXPLICIT_TIME (HOURS_OF_DAY 3) (MINUTES_OF_HOUR 0) am))");
    assertAST("3am,october first 2010", "(DATE_TIME (EXPLICIT_DATE (MONTH_OF_YEAR 10) (DAY_OF_MONTH 1) (YEAR_OF 2010)) (EXPLICIT_TIME (HOURS_OF_DAY 3) (MINUTES_OF_HOUR 0) am))");
    assertAST("3am, on october first 2010", "(DATE_TIME (EXPLICIT_DATE (MONTH_OF_YEAR 10) (DAY_OF_MONTH 1) (YEAR_OF 2010)) (EXPLICIT_TIME (HOURS_OF_DAY 3) (MINUTES_OF_HOUR 0) am))");
    assertAST("3am october first 2010", "(DATE_TIME (EXPLICIT_DATE (MONTH_OF_YEAR 10) (DAY_OF_MONTH 1) (YEAR_OF 2010)) (EXPLICIT_TIME (HOURS_OF_DAY 3) (MINUTES_OF_HOUR 0) am))");
    assertAST("next wed. at 5pm", "(DATE_TIME (RELATIVE_DATE (SEEK > by_week 1 (DAY_OF_WEEK 4))) (EXPLICIT_TIME (HOURS_OF_DAY 5) (MINUTES_OF_HOUR 0) pm))");
    assertAST("3 days after next wed", "(DATE_TIME (RELATIVE_DATE (SEEK > by_day 3 (RELATIVE_DATE (SEEK > by_week 1 (DAY_OF_WEEK 4))))))");
    assertAST("the sunday after next wed", "(DATE_TIME (RELATIVE_DATE (SEEK > by_day 1 (DAY_OF_WEEK 1) (RELATIVE_DATE (SEEK > by_week 1 (DAY_OF_WEEK 4))))))");
    assertAST("two days after today", "(DATE_TIME (RELATIVE_DATE (SEEK > by_day 2 day)))");
    assertAST("two days from today", "(DATE_TIME (RELATIVE_DATE (SEEK > by_day 2 day)))");
    assertAST("3 sundays after next wed", "(DATE_TIME (RELATIVE_DATE (SEEK > by_day 3 (DAY_OF_WEEK 1) (RELATIVE_DATE (SEEK > by_week 1 (DAY_OF_WEEK 4))))))");
    assertAST("the day after next", "(DATE_TIME (RELATIVE_DATE (SEEK > by_day 2 day)))");
    assertAST("the week after next", "(DATE_TIME (RELATIVE_DATE (SEEK > by_day 2 week)))");
    assertAST("the month after next", "(DATE_TIME (RELATIVE_DATE (SEEK > by_day 2 month)))");
    assertAST("the year after next", "(DATE_TIME (RELATIVE_DATE (SEEK > by_day 2 year)))");
    assertAST("wed of the week after next", "(DATE_TIME (RELATIVE_DATE (SEEK > by_day 2 week) (EXPLICIT_SEEK (DAY_OF_WEEK 4))))");
    assertAST("the 28th of the month after next", "(DATE_TIME (RELATIVE_DATE (SEEK > by_day 2 month) (EXPLICIT_SEEK (DAY_OF_MONTH 28))))");
    assertAST("6 in the morning", "(DATE_TIME (EXPLICIT_TIME (HOURS_OF_DAY 6) (MINUTES_OF_HOUR 0) am))");
    assertAST("4 in the afternoon", "(DATE_TIME (EXPLICIT_TIME (HOURS_OF_DAY 4) (MINUTES_OF_HOUR 0) pm))");
    assertAST("monday 6 in the morning", "(DATE_TIME (RELATIVE_DATE (SEEK > by_day 0 (DAY_OF_WEEK 2))) (EXPLICIT_TIME (HOURS_OF_DAY 6) (MINUTES_OF_HOUR 0) am))");
    assertAST("monday 4 in the afternoon", "(DATE_TIME (RELATIVE_DATE (SEEK > by_day 0 (DAY_OF_WEEK 2))) (EXPLICIT_TIME (HOURS_OF_DAY 4) (MINUTES_OF_HOUR 0) pm))");
    assertAST("monday 9 in the evening", "(DATE_TIME (RELATIVE_DATE (SEEK > by_day 0 (DAY_OF_WEEK 2))) (EXPLICIT_TIME (HOURS_OF_DAY 9) (MINUTES_OF_HOUR 0) pm))");
    assertAST("this morning", "(DATE_TIME (EXPLICIT_TIME (HOURS_OF_DAY 8) (MINUTES_OF_HOUR 0) (SECONDS_OF_MINUTE 0) am))");
    assertAST("this afternoon", "(DATE_TIME (EXPLICIT_TIME (HOURS_OF_DAY 12) (MINUTES_OF_HOUR 0) (SECONDS_OF_MINUTE 0) pm))");
    assertAST("final thursday in april", "(DATE_TIME (RELATIVE_DATE (SEEK > by_day 0 (MONTH_OF_YEAR 4)) (EXPLICIT_SEEK 5 (DAY_OF_WEEK 5))))");
    assertAST("final thurs in sep", "(DATE_TIME (RELATIVE_DATE (SEEK > by_day 0 (MONTH_OF_YEAR 9)) (EXPLICIT_SEEK 5 (DAY_OF_WEEK 5))))");
    assertAST("tomorrow @ noon", "(DATE_TIME (RELATIVE_DATE (SEEK > by_day 1 day)) (EXPLICIT_TIME (HOURS_OF_DAY 12) (MINUTES_OF_HOUR 0) (SECONDS_OF_MINUTE 0) pm))");
    assertAST("6 hours ago", "(DATE_TIME (RELATIVE_TIME (SEEK < by_day 6 hour)))");
    assertAST("10 hrs before noon", "(DATE_TIME (RELATIVE_TIME (SEEK < by_day (EXPLICIT_SEEK (EXPLICIT_TIME (HOURS_OF_DAY 12) (MINUTES_OF_HOUR 0) (SECONDS_OF_MINUTE 0) pm)) 10 hour)))");
    assertAST("10 hr before midnight", "(DATE_TIME (RELATIVE_TIME (SEEK < by_day (EXPLICIT_SEEK (EXPLICIT_TIME (HOURS_OF_DAY 12) (MINUTES_OF_HOUR 0) (SECONDS_OF_MINUTE 0) am)) 10 hour)))");
    assertAST("5 hours after noon", "(DATE_TIME (RELATIVE_TIME (SEEK > by_day (EXPLICIT_SEEK (EXPLICIT_TIME (HOURS_OF_DAY 12) (MINUTES_OF_HOUR 0) (SECONDS_OF_MINUTE 0) pm)) 5 hour)))");
    assertAST("5 hours after midnight", "(DATE_TIME (RELATIVE_TIME (SEEK > by_day (EXPLICIT_SEEK (EXPLICIT_TIME (HOURS_OF_DAY 12) (MINUTES_OF_HOUR 0) (SECONDS_OF_MINUTE 0) am)) 5 hour)))");
    assertAST("in 5 seconds", "(DATE_TIME (RELATIVE_TIME (SEEK > by_day 5 second)))");
    assertAST("in 5 minutes", "(DATE_TIME (RELATIVE_TIME (SEEK > by_day 5 minute)))");
    assertAST("in 5 hours", "(DATE_TIME (RELATIVE_TIME (SEEK > by_day 5 hour)))");
    assertAST("4 secs from now", "(DATE_TIME (RELATIVE_TIME (SEEK > by_day (RELATIVE_DATE (SEEK > by_day 0 day)) 4 second)))");
    assertAST("4 sec from now", "(DATE_TIME (RELATIVE_TIME (SEEK > by_day (RELATIVE_DATE (SEEK > by_day 0 day)) 4 second)))");
    assertAST("4 minutes from now", "(DATE_TIME (RELATIVE_TIME (SEEK > by_day (RELATIVE_DATE (SEEK > by_day 0 day)) 4 minute)))");
    assertAST("4 mins from now", "(DATE_TIME (RELATIVE_TIME (SEEK > by_day (RELATIVE_DATE (SEEK > by_day 0 day)) 4 minute)))");
    assertAST("4 min from now", "(DATE_TIME (RELATIVE_TIME (SEEK > by_day (RELATIVE_DATE (SEEK > by_day 0 day)) 4 minute)))");
    assertAST("4 hours from now", "(DATE_TIME (RELATIVE_TIME (SEEK > by_day (RELATIVE_DATE (SEEK > by_day 0 day)) 4 hour)))");
  }
}
