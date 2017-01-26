parser grammar DateParser;

options {
  tokenVocab=DateLexer;
  output=AST;
}

import NumericRules;

tokens {
  INT;
  MONTH_OF_YEAR;
  DAY_OF_MONTH;
  DAY_OF_WEEK;
  DAY_OF_YEAR;
  YEAR_OF;
  DATE_TIME;
  DATE_TIME_ALTERNATIVE;
  EXPLICIT_DATE;
  RELATIVE_DATE;
  SEEK;
  DIRECTION;
  SEEK_BY;
  EXPLICIT_SEEK;
  SPAN;
  EXPLICIT_TIME;
  RELATIVE_TIME;
  HOURS_OF_DAY;
  MINUTES_OF_HOUR;
  SECONDS_OF_MINUTE;
  AM_PM;
  ZONE;
  ZONE_OFFSET;
  RECURRENCE;
  HOLIDAY;
  SEASON;
}

@header {
  package com.joestelmach.natty.generated;
  
  import java.io.IOException;
}

@members {
  private static org.slf4j.Logger _logger =
    org.slf4j.LoggerFactory.getLogger(com.joestelmach.natty.generated.DateParser.class);

  @Override
  public void displayRecognitionError(String[] tokenNames, RecognitionException re) {
    if (_logger.isDebugEnabled()) {
      String message = getErrorHeader(re);
      try { message += getErrorMessage(re, tokenNames); } catch(Exception e) {}
      _logger.debug(message);
    }
  }

  @Override
  public void reportError(IOException e) {
    _logger.error("Unexpected IO error", e);
  }

  @Override
  public void emitErrorMessage(String msg) {
    _logger.error(msg);
  }
}

parse
  : empty ((recurrence)=>recurrence | date_time_alternative)
  ;
  
recurrence
  : EVERY WHITE_SPACE date_time_alternative (WHITE_SPACE UNTIL WHITE_SPACE date_time)?
      -> date_time_alternative ^(RECURRENCE date_time?)
  ;
  
empty
  :
  ;
  
date_time
  : (
      (date)=>date (date_time_separator explicit_time)?
      | explicit_time (time_date_separator date)?
    ) -> ^(DATE_TIME date? explicit_time?)
  | relative_time -> ^(DATE_TIME relative_time?)
  ;
  
date_time_separator
  : WHITE_SPACE (AT WHITE_SPACE)?
  | WHITE_SPACE? COMMA WHITE_SPACE? (AT WHITE_SPACE)?
  | T
  ;
  
time_date_separator
  : WHITE_SPACE ((ON | OF) WHITE_SPACE)?
  | COMMA WHITE_SPACE? ((ON | OF) WHITE_SPACE)?
  ;

date
  : formal_date
  | relaxed_date
  | relative_date
  | explicit_relative_date
  | global_date_prefix WHITE_SPACE date 
      -> ^(RELATIVE_DATE ^(SEEK global_date_prefix date))
  ;
  
date_time_alternative
  // for 3 days, for 7 months, for twenty seconds
  : (date_time_alternative_range)=> date_time_alternative_range
    -> ^(DATE_TIME_ALTERNATIVE date_time_alternative_range)

  // today or the day after that, feb 16th or 2 days after that, january fourth or the friday after
  | (date conjunction global_date_prefix)=>
      date conjunction global_date_prefix (WHITE_SPACE THAT)? (date_time_separator explicit_time)?
        -> ^(DATE_TIME_ALTERNATIVE
             ^(DATE_TIME date explicit_time?)
             ^(DATE_TIME ^(RELATIVE_DATE ^(SEEK global_date_prefix date) explicit_time?)))

  // first or last day of 2009
  | (alternative_day_of_year_list)=> alternative_day_of_year_list
      -> ^(DATE_TIME_ALTERNATIVE alternative_day_of_year_list)

  // feb 16, 17, or 18
  | (alternative_day_of_month_list)=> alternative_day_of_month_list
      -> ^(DATE_TIME_ALTERNATIVE alternative_day_of_month_list)

  // "next wed or thurs" , "next wed, thurs, or fri", "this wed or next"
  | (alternative_day_of_week_list)=> alternative_day_of_week_list
      -> ^(DATE_TIME_ALTERNATIVE alternative_day_of_week_list)

  // 1/2 or 1/4 or 1/6 at 6pm, Aug 16 at 10am or Sept 28th at 11am, Feb 28th
  | date_time (conjunction date_time)*
      -> ^(DATE_TIME_ALTERNATIVE date_time+)
  ;

date_time_alternative_range
  : (
    // in two days, in 3 or 4 days
    range_direction one=spelled_or_int_optional_prefix
      (conjunction two=spelled_or_int_optional_prefix)? WHITE_SPACE range_span

    // two to 7 days, 4 to 5 days ago
    | one=spelled_or_int_optional_prefix conjunction two=spelled_or_int_optional_prefix WHITE_SPACE
      range_span (WHITE_SPACE relative_date_suffix)?
  )
    -> {$range_direction.text != null && $range_direction.inclusive && $two.text != null}?
         ^(DATE_TIME ^(RELATIVE_DATE ^(SEEK range_direction INT["0"] range_span)))
         ^(DATE_TIME ^(RELATIVE_DATE ^(SEEK range_direction $one range_span)))
         ^(DATE_TIME ^(RELATIVE_DATE ^(SEEK range_direction $two range_span)))

    -> {$range_direction.text != null && $range_direction.inclusive}?
         ^(DATE_TIME ^(RELATIVE_DATE ^(SEEK range_direction INT["0"] range_span)))
         ^(DATE_TIME ^(RELATIVE_DATE ^(SEEK range_direction $one range_span)))

    -> {$relative_date_suffix.text != null && $two.text != null}?
         ^(DATE_TIME ^(RELATIVE_DATE ^(SEEK relative_date_suffix $one range_span)))
         ^(DATE_TIME ^(RELATIVE_DATE ^(SEEK relative_date_suffix $two range_span)))

    -> {$relative_date_suffix.text != null}?
         ^(DATE_TIME ^(RELATIVE_DATE ^(SEEK relative_date_suffix $one range_span)))

    -> {$two.text != null}?
         ^(DATE_TIME ^(RELATIVE_DATE ^(SEEK DIRECTION[">"] SEEK_BY["by_day"] $one range_span)))
         ^(DATE_TIME ^(RELATIVE_DATE ^(SEEK DIRECTION[">"] SEEK_BY["by_day"] $two range_span)))

    -> ^(DATE_TIME ^(RELATIVE_DATE ^(SEEK DIRECTION[">"] SEEK_BY["by_day"] $one range_span)))
  ;

range_direction returns [Boolean inclusive]
  : (FOR | NEXT) WHITE_SPACE  {$inclusive=true;}  -> DIRECTION[">"] SEEK_BY["by_day"]
  | (LAST | PAST) WHITE_SPACE {$inclusive=true;}  -> DIRECTION["<"] SEEK_BY["by_day"]
  | IN WHITE_SPACE            {$inclusive=false;} -> DIRECTION[">"] SEEK_BY["by_day"]
  ;

conjunction
  : COMMA? WHITE_SPACE (AND | OR | TO | THROUGH | DASH) WHITE_SPACE
  ;

range_span
  : relative_date_span
  | relative_time_span
  ;

alternative_day_of_year_list
  : first=explicit_day_of_year_part conjunction second=explicit_day_of_year_part WHITE_SPACE relaxed_year
      -> ^(DATE_TIME ^(RELATIVE_DATE ^(EXPLICIT_SEEK relaxed_year) $first))
         ^(DATE_TIME ^(RELATIVE_DATE ^(EXPLICIT_SEEK relaxed_year) $second))
  ;

alternative_day_of_month_list
  // mon may 15 or tues may 16
  : ((relaxed_day_of_week? relaxed_month WHITE_SPACE relaxed_day_of_month (conjunction relaxed_day_of_month)+) (date_time_separator explicit_time)?)
      -> ^(DATE_TIME ^(EXPLICIT_DATE relaxed_month relaxed_day_of_month) explicit_time?)+

  | first=explicit_day_of_month_part conjunction second=explicit_day_of_month_part WHITE_SPACE alternative_day_seek (date_time_separator explicit_time)?
    -> ^(DATE_TIME ^(RELATIVE_DATE alternative_day_seek $first) explicit_time?)
       ^(DATE_TIME ^(RELATIVE_DATE alternative_day_seek $second) explicit_time?)
  ;

alternative_day_seek
  //  next september
  : prefix WHITE_SPACE explicit_relative_month
    -> ^(SEEK prefix explicit_relative_month)

  //  2 septembers from now
  | spelled_or_int_optional_prefix WHITE_SPACE explicit_relative_month WHITE_SPACE relative_date_suffix
    -> ^(SEEK relative_date_suffix spelled_or_int_optional_prefix explicit_relative_month)

  //  september
  | relaxed_month
    -> ^(EXPLICIT_SEEK relaxed_month)
  ;

alternative_day_of_week_list
  : first_direction=alternative_direction WHITE_SPACE day_of_week

    // this wed or thursday or friday
    ((day_of_week_list_separator day_of_week)+ (date_time_separator explicit_time)?
      -> ^(DATE_TIME ^(RELATIVE_DATE ^(SEEK $first_direction day_of_week)) explicit_time?)+

    // this wed. or next
    | conjunction second_direction=alternative_direction (date_time_separator explicit_time)?
      ->  ^(DATE_TIME ^(RELATIVE_DATE ^(SEEK DIRECTION[">"] SEEK_BY["by_day"] INT["0"] day_of_week)) explicit_time?)
          ^(DATE_TIME ^(RELATIVE_DATE ^(SEEK $second_direction day_of_week)) explicit_time?)
    )
  ;

day_of_week_list_separator
  : COMMA (WHITE_SPACE | conjunction) | conjunction
  ;
  
alternative_direction
  : NEXT -> DIRECTION[">"] SEEK_BY["by_week"] INT["1"]
  | LAST -> DIRECTION["<"] SEEK_BY["by_week"] INT["1"]
  | THIS -> DIRECTION[">"] SEEK_BY["by_day"] INT["0"]
  | -> DIRECTION[">"] SEEK_BY["by_day"] INT["0"]
  ;
  
global_date_prefix
  // the day after
  : (THE WHITE_SPACE)? DAY WHITE_SPACE prefix_direction
      -> prefix_direction SEEK_BY["by_day"] INT["1"]

  // 2 weeks from now
  | (global_date_prefix_amount WHITE_SPACE)? global_date_prefix_seek prefix_direction
      -> {$global_date_prefix_amount.text != null}?
           prefix_direction global_date_prefix_seek global_date_prefix_amount

      ->   prefix_direction global_date_prefix_seek INT["1"]

  // 3 fridays before, the friday after, 2 fridays from now
  | (THE WHITE_SPACE)? (global_date_prefix_amount WHITE_SPACE)? day_of_week WHITE_SPACE prefix_direction
      -> {$global_date_prefix_amount.text != null}?
           prefix_direction SEEK_BY["by_day"] global_date_prefix_amount day_of_week

      -> prefix_direction SEEK_BY["by_day"] INT["1"] day_of_week
  ;

global_date_prefix_amount
  : spelled_first_to_thirty_first
  | spelled_or_int_optional_prefix
  ;

global_date_prefix_seek
  : DAY WHITE_SPACE   -> SEEK_BY["by_day"]
  | WEEK WHITE_SPACE  -> SEEK_BY["by_week"]
  | MONTH WHITE_SPACE -> SEEK_BY["by_month"]
  | YEAR WHITE_SPACE  -> SEEK_BY["by_year"]
  ;

prefix_direction
  : (AFTER | FROM | ON) -> DIRECTION[">"]
  | BEFORE -> DIRECTION["<"]
  ;
  
// ********** relaxed date rules **********

// relaxed date with a spelled-out or abbreviated month
relaxed_date
  : relaxed_date_month_first
  | relaxed_date_month_last
  ;

relaxed_date_month_first
  : relaxed_day_of_week? relaxed_month COMMA? WHITE_SPACE relaxed_day_of_month (relaxed_year_prefix relaxed_year)?
      -> ^(EXPLICIT_DATE relaxed_month relaxed_day_of_month relaxed_day_of_week? relaxed_year?)
  ;

relaxed_date_month_last
  : relaxed_day_of_week? relaxed_day_of_month_prefix? relaxed_day_of_month
      WHITE_SPACE (OF WHITE_SPACE)? relaxed_month (relaxed_year_prefix relaxed_year)?
        -> ^(EXPLICIT_DATE relaxed_month relaxed_day_of_month relaxed_day_of_week? relaxed_year?)
  ;

relaxed_day_of_week
  : (prefix WHITE_SPACE)? day_of_week COMMA? WHITE_SPACE? -> day_of_week
  ;
  
relaxed_day_of_month_prefix
  : (THE WHITE_SPACE) | (COMMA WHITE_SPACE?)
  ;

relaxed_month
  : JANUARY   -> ^(MONTH_OF_YEAR INT["1"])
  | FEBRUARY  -> ^(MONTH_OF_YEAR INT["2"])
  | MARCH     -> ^(MONTH_OF_YEAR INT["3"])
  | APRIL     -> ^(MONTH_OF_YEAR INT["4"])
  | MAY       -> ^(MONTH_OF_YEAR INT["5"])
  | JUNE      -> ^(MONTH_OF_YEAR INT["6"])
  | JULY      -> ^(MONTH_OF_YEAR INT["7"])
  | AUGUST    -> ^(MONTH_OF_YEAR INT["8"])
  | SEPTEMBER -> ^(MONTH_OF_YEAR INT["9"])
  | OCTOBER   -> ^(MONTH_OF_YEAR INT["10"])
  | NOVEMBER  -> ^(MONTH_OF_YEAR INT["11"])
  | DECEMBER  -> ^(MONTH_OF_YEAR INT["12"])
  ;
  
relaxed_day_of_month
  : spelled_or_int_01_to_31_optional_prefix
      -> ^(DAY_OF_MONTH spelled_or_int_01_to_31_optional_prefix)

  | spelled_first_to_thirty_first
      -> ^(DAY_OF_MONTH spelled_first_to_thirty_first)
  ;
  
// TODO expand these to 366
relaxed_day_of_year
  : spelled_or_int_01_to_31_optional_prefix
      -> ^(DAY_OF_YEAR spelled_or_int_01_to_31_optional_prefix)
      
  | spelled_first_to_thirty_first
      -> ^(DAY_OF_YEAR spelled_first_to_thirty_first)
  ;
  
relaxed_year
  : SINGLE_QUOTE int_00_to_99_mandatory_prefix
      -> ^(YEAR_OF int_00_to_99_mandatory_prefix)
      
  | int_four_digits
      -> ^(YEAR_OF int_four_digits)
  ;
  
relaxed_year_prefix
  : (COMMA WHITE_SPACE? | WHITE_SPACE) (IN WHITE_SPACE THE WHITE_SPACE YEAR WHITE_SPACE)?
  ; 
  
// ********** formal date rules **********

formal_date
  // march 2009
  : (relaxed_month WHITE_SPACE relaxed_year)=>
    relaxed_month WHITE_SPACE relaxed_year
      -> ^(EXPLICIT_DATE relaxed_month ^(DAY_OF_MONTH INT["1"]) relaxed_year?)

  // year first: 1979-02-28, 1980/01/02, etc.  full 4 digit year required to match
  | relaxed_day_of_week? formal_year_four_digits formal_date_separator (formal_month_of_year | relaxed_month) formal_date_separator formal_day_of_month
      -> ^(EXPLICIT_DATE formal_month_of_year? relaxed_month? formal_day_of_month relaxed_day_of_week? formal_year_four_digits)
      
  // year last: 1/02/1980, 2/28/79.  2 or 4 digit year is acceptable 
  | relaxed_day_of_week? formal_month_of_year formal_date_separator formal_day_of_month (formal_date_separator formal_year)?
      -> ^(EXPLICIT_DATE formal_month_of_year formal_day_of_month relaxed_day_of_week? formal_year?)

  // 15-Apr-2014
  | formal_day_of_month formal_date_separator relaxed_month (formal_date_separator formal_year_four_digits)?
      -> ^(EXPLICIT_DATE relaxed_month formal_day_of_month formal_year_four_digits?)
  ;
  
formal_month_of_year
  : int_01_to_12_optional_prefix -> ^(MONTH_OF_YEAR int_01_to_12_optional_prefix)
  ;
  
formal_day_of_month
  : int_01_to_31_optional_prefix -> ^(DAY_OF_MONTH int_01_to_31_optional_prefix)
  ;
  
formal_year
  : formal_year_four_digits
  | int_00_to_99_mandatory_prefix -> ^(YEAR_OF int_00_to_99_mandatory_prefix)
  ;
  
formal_year_four_digits
  : int_four_digits -> ^(YEAR_OF int_four_digits)
  ; 
  
formal_date_separator
  : DASH
  | SLASH
  ;
  
// ********** relative date rules **********
  
relative_date
  // next wed, last month
  : relative_date_prefix WHITE_SPACE relative_target (WHITE_SPACE spelled_or_int_optional_prefix WHITE_SPACE relative_date_span)*
      -> ^(RELATIVE_DATE ^(SEEK relative_date_prefix relative_target) ^(SEEK DIRECTION[">"] SEEK_BY["by_day"] spelled_or_int_optional_prefix relative_date_span)*)
      
  // this month, this week
  | implicit_prefix WHITE_SPACE relative_target 
      -> ^(RELATIVE_DATE ^(SEEK implicit_prefix relative_target))
      
  // monday, tuesday
  | day_of_week
      // relative target with no prefix has an implicit seek of 0
      -> ^(RELATIVE_DATE ^(SEEK DIRECTION[">"] SEEK_BY["by_day"] INT["0"] day_of_week))
      
  // january, february
  | relaxed_month
      -> ^(RELATIVE_DATE ^(SEEK DIRECTION[">"] SEEK_BY["by_day"] INT["0"] relaxed_month))
      
  // one month from now
  | spelled_or_int_optional_prefix WHITE_SPACE relative_target WHITE_SPACE relative_date_suffix
      -> ^(RELATIVE_DATE ^(SEEK relative_date_suffix spelled_or_int_optional_prefix relative_target))
            
  | one=spelled_or_int_optional_prefix WHITE_SPACE relative_target (WHITE_SPACE two+=spelled_or_int_optional_prefix WHITE_SPACE relative_date_span)+ WHITE_SPACE relative_date_suffix
      -> ^(RELATIVE_DATE ^(SEEK relative_date_suffix $one relative_target) ^(SEEK relative_date_suffix $two relative_date_span)*)

  // a month from now
  | relative_target WHITE_SPACE relative_date_suffix
      -> ^(RELATIVE_DATE ^(SEEK relative_date_suffix INT["1"] relative_target))

  // the week after next
  | (THE WHITE_SPACE)? relative_date_span WHITE_SPACE AFTER WHITE_SPACE NEXT
      -> ^(RELATIVE_DATE ^(SEEK DIRECTION[">"] SEEK_BY["by_day"] INT["2"] relative_date_span))
      
  // today, tomorrow
  | named_relative_date 
  
  // next christmas, 2 thanksgivings ago
  | holiday
    -> ^(RELATIVE_DATE holiday)
    
  // next fall, 2 summers from now
  | season 
    -> ^(RELATIVE_DATE season)
  ;
  
// ********** explicit relative date rules **********
// these represent explicit points within a relative range

explicit_relative_date
  // the first day of 2009
  : explicit_day_of_year_part WHITE_SPACE relaxed_year
      -> ^(RELATIVE_DATE ^(EXPLICIT_SEEK relaxed_year) explicit_day_of_year_part)

  | explicit_day_of_month_part WHITE_SPACE explicit_relative_month_seek (relaxed_year_prefix relaxed_year)?
      -> {$relaxed_year.text != null}?
           ^(RELATIVE_DATE explicit_relative_month_seek explicit_day_of_month_part ^(EXPLICIT_SEEK relaxed_year))

      ->   ^(RELATIVE_DATE explicit_relative_month_seek explicit_day_of_month_part)

  | explicit_day_of_week_part WHITE_SPACE explicit_relative_week_seek
      -> ^(RELATIVE_DATE explicit_relative_week_seek explicit_day_of_week_part)
  ;

explicit_relative_month_seek
  // 1st of three months ago, 10th of 3 octobers from now, the last monday in 2 novembers ago
  : spelled_or_int_optional_prefix WHITE_SPACE explicit_relative_month WHITE_SPACE relative_date_suffix
      -> ^(SEEK relative_date_suffix spelled_or_int_optional_prefix explicit_relative_month)

  // 10th of next month, 31st of last month, 10th of next october, 30th of this month, the last thursday of last november
  | prefix WHITE_SPACE explicit_relative_month
      -> ^(SEEK prefix explicit_relative_month)

  // 10th of the month after next
  | THE WHITE_SPACE MONTH WHITE_SPACE AFTER WHITE_SPACE NEXT
      -> ^(SEEK DIRECTION[">"] SEEK_BY["by_day"] INT["2"] SPAN["month"])

  // september
  | relaxed_month
      -> ^(SEEK DIRECTION[">"] SEEK_BY["by_day"] INT["0"] relaxed_month)
  ;

explicit_relative_week_seek
  // after next
  : AFTER WHITE_SPACE NEXT
      -> ^(SEEK DIRECTION[">"] SEEK_BY["by_day"] INT["2"] SPAN["week"])

  // before last
  | BEFORE WHITE_SPACE LAST
      -> ^(SEEK DIRECTION["<"] SEEK_BY["by_day"] INT["2"] SPAN["week"])

  // last week, tuesday of next week
  | prefix WHITE_SPACE WEEK
      -> ^(SEEK prefix SPAN["week"])

  // 2 weeks ago, tuesday of 3 weeks from now
  | spelled_or_int_optional_prefix WHITE_SPACE WEEK WHITE_SPACE relative_date_suffix
      -> ^(SEEK relative_date_suffix spelled_or_int_optional_prefix SPAN["week"])

  // the week after next
  | THE WHITE_SPACE WEEK WHITE_SPACE AFTER WHITE_SPACE NEXT
      -> ^(SEEK DIRECTION[">"] SEEK_BY["by_day"] INT["2"] SPAN["week"])
  ;

explicit_day_of_month_part
  // first of, 10th of, 31st of,
  : (THE WHITE_SPACE)? relaxed_day_of_month day_of_month_suffix?
      -> ^(EXPLICIT_SEEK relaxed_day_of_month)
      
  // the last thursday
  | (THE WHITE_SPACE)? relative_occurrence_index WHITE_SPACE day_of_week day_of_month_suffix
      -> ^(EXPLICIT_SEEK relative_occurrence_index day_of_week)
      
  // in the start of, at the beginning of, the end of, last day of, first day of
  | (((IN | AT) WHITE_SPACE)? THE WHITE_SPACE)? explicit_day_of_month_bound day_of_month_suffix?
      -> explicit_day_of_month_bound
  ;

day_of_month_suffix
  : WHITE_SPACE (IN | OF) (WHITE_SPACE MONTH)?
  ;

explicit_day_of_week_part
  // monday of, tuesday of
  : (THE WHITE_SPACE)? relaxed_day_of_week (IN | OF)?
      ->  ^(EXPLICIT_SEEK relaxed_day_of_week)
      
  // in the end of, at the beginning of
  | (((IN | AT) WHITE_SPACE)? THE WHITE_SPACE)? explicit_day_of_week_bound WHITE_SPACE (OF | IN)
      -> explicit_day_of_week_bound
  ;
  
explicit_day_of_year_part
  // last of, first of, 15th day of
  : (THE WHITE_SPACE)? relaxed_day_of_year (WHITE_SPACE (IN | OF))?
      -> ^(EXPLICIT_SEEK relaxed_day_of_year)
      
  // in the start of, at the beginning of, the end of, last day of, first day of
  | (((IN | AT) WHITE_SPACE)? THE WHITE_SPACE)? explicit_day_of_year_bound (WHITE_SPACE (OF | IN))?
      -> explicit_day_of_year_bound
  ;
  
// the lower or upper bound when talking about days in a year
explicit_day_of_year_bound
  // beginning, start
  : (BEGINNING | START)
      -> ^(EXPLICIT_SEEK ^(DAY_OF_YEAR INT["1"]))
      
  // first day, 2nd day, etc
  | (spelled_first_to_thirty_first WHITE_SPACE DAY)
      -> ^(EXPLICIT_SEEK ^(DAY_OF_YEAR spelled_first_to_thirty_first))
  
  // end, last day
  | (END | (LAST WHITE_SPACE DAY))
      -> ^(EXPLICIT_SEEK ^(DAY_OF_YEAR INT["366"]))
  ;
  
// the lower or upper bound when talking about days in a month
explicit_day_of_month_bound
  // beginning, start
  : (BEGINNING | START)
      -> ^(EXPLICIT_SEEK ^(DAY_OF_MONTH INT["1"]))
      
  // first day, 2nd day, etc
  | (spelled_first_to_thirty_first WHITE_SPACE DAY)
      -> ^(EXPLICIT_SEEK ^(DAY_OF_MONTH spelled_first_to_thirty_first))
  
  // end, last day
  | (END | (LAST WHITE_SPACE DAY))
      -> ^(EXPLICIT_SEEK ^(DAY_OF_MONTH INT["31"]))
  ;
  
// the lower or upper bound when talking about the days in a week:
explicit_day_of_week_bound
  // beginning, start, first day
  : (BEGINNING | START | (FIRST WHITE_SPACE DAY))
      -> ^(EXPLICIT_SEEK ^(DAY_OF_WEEK INT["2"]))
  
  // end, last day
  | (END | (LAST WHITE_SPACE DAY))
      -> ^(EXPLICIT_SEEK ^(DAY_OF_WEEK INT["6"]))
  ;
  
explicit_relative_month
  : relaxed_month
  | MONTH -> SPAN["month"]
  ;
  
relative_occurrence_index
  : (FIRST  | INT_1 ST?) -> INT["1"]
  | (SECOND | INT_2 ND?) -> INT["2"]
  | (THIRD  | INT_3 RD?) -> INT["3"]
  | (FOURTH | INT_4 TH?) -> INT["4"]
  | (FIFTH  | INT_5 TH?) -> INT["5"]
  | LAST                 -> INT["5"]
  ;
  
relative_target
  : day_of_week
  | relaxed_month
  | relative_date_span
  ;
  
relative_time_target
  : relative_time_span
  ;
  
relative_time_span
  : HOUR   -> SPAN["hour"]
  | MINUTE -> SPAN["minute"]
  | SECOND -> SPAN["second"]
  ;
  
implicit_prefix
  : (THIS | CURRENT) -> DIRECTION[">"] SEEK_BY["by_day"] INT["0"]
  ;
  
relative_date_prefix
  : (THIS WHITE_SPACE)? LAST     -> DIRECTION["<"] SEEK_BY["by_week"] INT["1"]
  | (THIS WHITE_SPACE)? NEXT     -> DIRECTION[">"] SEEK_BY["by_week"] INT["1"]
  | (THIS WHITE_SPACE)? PAST     -> DIRECTION["<"] SEEK_BY["by_day"] INT["1"]
  | (THIS WHITE_SPACE)? COMING   -> DIRECTION[">"] SEEK_BY["by_day"] INT["1"]
  | (THIS WHITE_SPACE)? UPCOMING -> DIRECTION[">"] SEEK_BY["by_day"] INT["1"]
  | IN WHITE_SPACE (AM | AN)     -> DIRECTION[">"] SEEK_BY["by_day"] INT["1"]
  | (IN WHITE_SPACE)? spelled_or_int_optional_prefix 
      -> DIRECTION[">"] SEEK_BY["by_day"] spelled_or_int_optional_prefix
  ;
  
prefix
  : relative_date_prefix
  | implicit_prefix
  ;
  
relative_date_suffix
  // from now, after today
  : (FROM | AFTER) WHITE_SPACE (NOW | TODAY) -> DIRECTION[">"] SEEK_BY["by_day"]
  | AGO -> DIRECTION["<"] SEEK_BY["by_day"]
  ;
  
relative_time_suffix
  // from now, after today, before noon, after 4pm
  : (FROM | AFTER) (WHITE_SPACE relative_time_suffix_anchor)?
      -> DIRECTION[">"] SEEK_BY["by_day"] relative_time_suffix_anchor?
      
  // before noon, before 3pm
  | BEFORE (WHITE_SPACE relative_time_suffix_anchor)?
      -> DIRECTION["<"] SEEK_BY["by_day"] relative_time_suffix_anchor?
      
  | AGO 
      -> DIRECTION["<"] SEEK_BY["by_day"]
  ;
  
relative_time_suffix_anchor
  : named_relative_time 
  | explicit_time
    -> ^(EXPLICIT_SEEK explicit_time)
  ;
  
relative_date_span
  : DAY   -> SPAN["day"]
  | WEEK  -> SPAN["week"]
  | MONTH -> SPAN["month"]
  | YEAR  -> SPAN["year"]
  ;
 
day_of_week
  : SUNDAY    -> ^(DAY_OF_WEEK INT["1"])
  | MONDAY    -> ^(DAY_OF_WEEK INT["2"])
  | TUESDAY   -> ^(DAY_OF_WEEK INT["3"])
  | WEDNESDAY -> ^(DAY_OF_WEEK INT["4"])
  | THURSDAY  -> ^(DAY_OF_WEEK INT["5"])
  | FRIDAY    -> ^(DAY_OF_WEEK INT["6"])
  | SATURDAY  -> ^(DAY_OF_WEEK INT["7"])
  ;
  
named_relative_date
  : (TODAY | NOW) -> ^(RELATIVE_DATE ^(SEEK DIRECTION[">"] SEEK_BY["by_day"] INT["0"] SPAN["day"]))
  | TOMORROW      -> ^(RELATIVE_DATE ^(SEEK DIRECTION[">"] SEEK_BY["by_day"] INT["1"] SPAN["day"]))
  | YESTERDAY     -> ^(RELATIVE_DATE ^(SEEK DIRECTION["<"] SEEK_BY["by_day"] INT["1"] SPAN["day"]))
  ;
  
named_relative_time
  : NOW -> ^(RELATIVE_DATE ^(SEEK DIRECTION[">"] SEEK_BY["by_day"] INT["0"] SPAN["day"]))
  ;
  
// ********** holidays **********

holiday 
  : spelled_or_int_optional_prefix WHITE_SPACE holiday_name WHITE_SPACE relative_date_suffix
    -> ^(SEEK relative_date_suffix spelled_or_int_optional_prefix holiday_name)
    
  | relative_date_prefix WHITE_SPACE holiday_name
    -> ^(SEEK relative_date_prefix holiday_name)
    
  | (holiday_name relaxed_year_prefix relaxed_year)=>
      holiday_name relaxed_year_prefix relaxed_year
        -> ^(EXPLICIT_SEEK holiday_name relaxed_year)
    
  | holiday_name
    -> ^(SEEK DIRECTION[">"] SEEK_BY["by_day"] INT["1"] holiday_name)
  ;

holiday_name
  : APRIL WHITE_SPACE FOOL (WHITE_SPACE DAY)?
    -> HOLIDAY["APRIL_FOOLS_DAY"]
    
  | BLACK WHITE_SPACE FRIDAY
    -> HOLIDAY["BLACK_FRIDAY"]
    
  | (CHRISTMAS WHITE_SPACE EVENING)=>
    CHRISTMAS WHITE_SPACE EVENING
      -> HOLIDAY["CHRISTMAS_EVE"]
    
  | CHRISTMAS (WHITE_SPACE DAY)? 
    -> HOLIDAY["CHRISTMAS"]
    
  | COLUMBUS WHITE_SPACE DAY   
    -> HOLIDAY["COLUMBUS_DAY"]
    
  | EARTH WHITE_SPACE DAY
    -> HOLIDAY["EARTH_DAY"]
    
  | EASTER (WHITE_SPACE (SUNDAY | DAY))?
    -> HOLIDAY["EASTER"]
    
  | FATHER WHITE_SPACE DAY
    -> HOLIDAY["FATHERS_DAY"]
    
  | FLAG WHITE_SPACE DAY
    -> HOLIDAY["FLAG_DAY"]
    
  | GOOD WHITE_SPACE FRIDAY
    -> HOLIDAY["GOOD_FRIDAY"]
    
  | GROUNDHOG WHITE_SPACE? DAY
    -> HOLIDAY["GROUNDHOG_DAY"]
    
  | HALLOWEEN (WHITE_SPACE DAY)?
    -> HOLIDAY["HALLOWEEN"]
    
  | INAUGURATION WHITE_SPACE DAY
    -> HOLIDAY["INAUGURATION_DAY"]
    
  | INDEPENDENCE WHITE_SPACE DAY 
    -> HOLIDAY["INDEPENDENCE_DAY"]
    
  | KWANZAA (WHITE_SPACE DAY)?
    -> HOLIDAY["KWANZAA"]
    
  | LABOR WHITE_SPACE DAY
    -> HOLIDAY["LABOR_DAY"]
    
  | MLK (WHITE_SPACE DAY)?
    -> HOLIDAY["MLK_DAY"]
    
  | MEMORIAL WHITE_SPACE DAY
    -> HOLIDAY["MEMORIAL_DAY"]
    
  | MOTHER WHITE_SPACE DAY
    -> HOLIDAY["MOTHERS_DAY"]
    
  | (NEW WHITE_SPACE YEAR WHITE_SPACE EVENING)=>
      NEW WHITE_SPACE YEAR WHITE_SPACE EVENING
        -> HOLIDAY["NEW_YEARS_EVE"]
    
  | NEW WHITE_SPACE YEAR (WHITE_SPACE DAY)?
    -> HOLIDAY["NEW_YEARS_DAY"]
    
  | PATRIOT WHITE_SPACE DAY
    -> HOLIDAY["PATRIOT_DAY"]
    
  | PRESIDENT WHITE_SPACE DAY
    -> HOLIDAY["PRESIDENTS_DAY"]
    
  | (SAINT | ST DOT?) WHITE_SPACE PATRICK WHITE_SPACE DAY
    -> HOLIDAY["ST_PATRICKS_DAY"]
    
  | TAX WHITE_SPACE DAY
    -> HOLIDAY["TAX_DAY"]
    
  | THANKSGIVING (WHITE_SPACE DAY)?
    -> HOLIDAY["THANKSGIVING"]
    
  | ELECTION WHITE_SPACE DAY
    -> HOLIDAY["ELECTION_DAY"]
    
  | VALENTINE WHITE_SPACE DAY
    -> HOLIDAY["VALENTINES_DAY"]
    
  | VETERAN WHITE_SPACE DAY
    -> HOLIDAY["VETERANS_DAY"]
  ;
  
season
  : spelled_or_int_optional_prefix WHITE_SPACE season_name WHITE_SPACE relative_date_suffix
    -> ^(SEEK relative_date_suffix spelled_or_int_optional_prefix season_name)
    
  | relative_date_prefix WHITE_SPACE season_name 
    -> ^(SEEK relative_date_prefix season_name)
    
  | (season_name relaxed_year_prefix)=>
      season_name relaxed_year_prefix relaxed_year
        -> ^(EXPLICIT_SEEK season_name relaxed_year)
    
  | season_name
    -> ^(SEEK DIRECTION[">"] SEEK_BY["by_day"] INT["1"] season_name)
  ;
  
season_name
  :WINTER
    -> SEASON["WINTER"]
  | SPRING 
    -> SEASON["SPRING"]
  | SUMMER 
    -> SEASON["SUMMER"]
  | (FALL | AUTUMN)
    -> SEASON["FALL"]
  ;
  
// ********** time rules **********

relative_time
  // 10 hours ago, 20 minutes before noon
  : spelled_or_int_optional_prefix WHITE_SPACE relative_time_target WHITE_SPACE relative_time_suffix 
    -> ^(RELATIVE_TIME ^(SEEK relative_time_suffix spelled_or_int_optional_prefix relative_time_target))

  // next hour, last minute
  | prefix WHITE_SPACE relative_time_target
    -> ^(RELATIVE_TIME ^(SEEK prefix relative_time_target))
  ;

// a time with an hour, optional minutes, and optional meridian indicator
explicit_time
  : (AT WHITE_SPACE)? explicit_time_hours_minutes (WHITE_SPACE? time_zone)?
    -> ^(EXPLICIT_TIME explicit_time_hours_minutes time_zone?)

  | named_time (WHITE_SPACE time_zone)?
    -> ^(EXPLICIT_TIME named_time time_zone?)
  ;

explicit_time_hours_minutes returns [String hours, String minutes, String ampm]
  : hours (COLON | DOT)? minutes ((COLON | DOT)? seconds)? (WHITE_SPACE? (meridian_indicator | (MILITARY_HOUR_SUFFIX | HOUR)))?
      {$hours=$hours.text; $minutes=$minutes.text; $ampm=$meridian_indicator.text;}
      -> hours minutes seconds? meridian_indicator?

  | hours (WHITE_SPACE? meridian_indicator)?
      {$hours=$hours.text; $ampm=$meridian_indicator.text;}
      -> hours ^(MINUTES_OF_HOUR INT["0"]) meridian_indicator?
  ;

// hour of the day
hours
  : int_00_to_23_optional_prefix -> ^(HOURS_OF_DAY int_00_to_23_optional_prefix)
  ;
  
// minutes of the hour
minutes
  : int_00_to_59_mandatory_prefix -> ^(MINUTES_OF_HOUR int_00_to_59_mandatory_prefix)
  ;
  
// seconds of the minute 
seconds
  : int_00_to_59_mandatory_prefix -> ^(SECONDS_OF_MINUTE int_00_to_59_mandatory_prefix)
  ;
  
// meridian am/pm indicator
meridian_indicator
  : simple_meridian_indicator
  | friendly_meridian_indicator
  ;

simple_meridian_indicator
  : AM -> AM_PM["am"]
  | PM -> AM_PM["pm"]
  ;

friendly_meridian_indicator
  : (((IN WHITE_SPACE THE) | AT) WHITE_SPACE)?
    (
      MORNING -> AM_PM["am"]
      | (NOON | EVENING | NIGHT) -> AM_PM["pm"]
    )
  ;

named_time
  : (named_time_prefix? named_hour (WHITE_SPACE AT)? WHITE_SPACE hm=explicit_time_hours_minutes)=>
      named_time_prefix? named_hour (WHITE_SPACE AT)? WHITE_SPACE hm=explicit_time_hours_minutes

    // If the named time is at night, but the hour given is before 5, we'll assume tomorrow morning
    -> {$named_hour.ampm != null && $named_hour.ampm.equals("pm") && Integer.parseInt($hm.hours) < 5}?
         ^(HOURS_OF_DAY INT[Integer.toString(Integer.parseInt($hm.hours) + 24)])
         ^(MINUTES_OF_HOUR INT[$hm.minutes])
         ^(SECONDS_OF_MINUTE INT["0"]) AM_PM[$named_hour.ampm]

    ->   ^(HOURS_OF_DAY INT[$hm.hours])
         ^(MINUTES_OF_HOUR INT[$hm.minutes])
         ^(SECONDS_OF_MINUTE INT["0"]) AM_PM[$named_hour.ampm]

  |  named_time_prefix? named_hour
    -> named_hour
  ;

named_time_prefix
  : ((IN WHITE_SPACE THE) | AT | THIS) WHITE_SPACE
  ;

named_hour returns [String ampm]
  : MORNING  {$ampm="am";} -> ^(HOURS_OF_DAY INT["8"]) ^(MINUTES_OF_HOUR INT["0"]) ^(SECONDS_OF_MINUTE INT["0"]) AM_PM["am"]
  | MIDNIGHT {$ampm="am";} -> ^(HOURS_OF_DAY INT["12"]) ^(MINUTES_OF_HOUR INT["0"]) ^(SECONDS_OF_MINUTE INT["0"]) AM_PM["am"]
  | NOON     {$ampm="pm";} -> ^(HOURS_OF_DAY INT["12"]) ^(MINUTES_OF_HOUR INT["0"]) ^(SECONDS_OF_MINUTE INT["0"]) AM_PM["pm"]
  | NIGHT    {$ampm="pm";} -> ^(HOURS_OF_DAY INT["8"]) ^(MINUTES_OF_HOUR INT["0"]) ^(SECONDS_OF_MINUTE INT["0"]) AM_PM["pm"]
  | TONIGHT  {$ampm="pm";} -> ^(HOURS_OF_DAY INT["8"]) ^(MINUTES_OF_HOUR INT["0"]) ^(SECONDS_OF_MINUTE INT["0"]) AM_PM["pm"]
  | EVENING  {$ampm="pm";} -> ^(HOURS_OF_DAY INT["7"]) ^(MINUTES_OF_HOUR INT["0"]) ^(SECONDS_OF_MINUTE INT["0"]) AM_PM["pm"]
  ;

time_zone
  : time_zone_plus_offset
  | time_zone_abbreviation
  ;
  
time_zone_plus_offset
  : UTC? time_zone_offset -> ZONE_OFFSET[$time_zone_offset.text]
  ;

time_zone_offset
  : (PLUS | DASH) hours (COLON? minutes)? 
  ;
      
time_zone_abbreviation
  : UTC  -> ZONE["UTC"]
  | EST  -> ZONE["America/New_York"]
  | CST  -> ZONE["America/Chicago"]
  | PST  -> ZONE["America/Los_Angeles"]
  | MST  -> ZONE["America/Denver"]
  | AKST -> ZONE["America/Anchorage"]
  | HAST -> ZONE["Pacific/Honolulu"]
  ;
