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
}

@members {
  private java.util.logging.Logger _logger = java.util.logging.Logger.getLogger("com.joestelmach.natty");
  
  public void displayRecognitionError(String[] tokenNames, RecognitionException re) {
    String message = getErrorHeader(re);
    try { message += getErrorMessage(re, tokenNames); } catch(Exception e) {}
    _logger.fine(message);
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
  | COMMA WHITE_SPACE? (AT WHITE_SPACE)?
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
      
  // in 2 to 3 months, 4 and 7 months
  : (((IN | FOR | NEXT) WHITE_SPACE)? spelled_or_int_optional_prefix conjunction)=>
      ((IN | FOR | NEXT) WHITE_SPACE)? one=spelled_or_int_optional_prefix conjunction two=spelled_or_int_optional_prefix WHITE_SPACE relative_date_span
        -> ^(DATE_TIME_ALTERNATIVE
          ^(DATE_TIME ^(RELATIVE_DATE ^(SEEK DIRECTION[">"] SEEK_BY["by_day"] $one relative_date_span)))
          ^(DATE_TIME ^(RELATIVE_DATE ^(SEEK DIRECTION[">"] SEEK_BY["by_day"] $two relative_date_span))))
      
  // today or the day after that, feb 16th or 2 days after that, january fourth or the friday after
  | (date conjunction global_date_prefix)=>
      date conjunction global_date_prefix (WHITE_SPACE THAT)? (date_time_separator explicit_time)?
        -> ^(DATE_TIME_ALTERNATIVE ^(DATE_TIME date explicit_time?) ^(DATE_TIME ^(RELATIVE_DATE ^(SEEK global_date_prefix date) explicit_time?)))
        
  // "next wed or thurs" , "next wed, thurs, or fri"
  | (alternative_day_of_week_list)=> alternative_day_of_week_list
      -> ^(DATE_TIME_ALTERNATIVE alternative_day_of_week_list)
      
  // feb 16, 17, or 18
  | (alternative_day_of_month_list)=> alternative_day_of_month_list
      -> ^(DATE_TIME_ALTERNATIVE alternative_day_of_month_list)
        
  // this wed. or next
  | ((THIS WHITE_SPACE)? day_of_week conjunction alternative_direction)=>
    (THIS WHITE_SPACE)? day_of_week conjunction alternative_direction (date_time_separator explicit_time)?
      -> ^(DATE_TIME_ALTERNATIVE 
            ^(DATE_TIME ^(RELATIVE_DATE ^(SEEK DIRECTION[">"] SEEK_BY["by_day"] INT["0"] day_of_week)) explicit_time?) 
            ^(DATE_TIME ^(RELATIVE_DATE ^(SEEK alternative_direction day_of_week)) explicit_time?)
          )
        
  // 1/2 or 1/4 or 1/6 at 6pm
  // Aug 16 at 10am or Sept 28th at 11am
  | (date_time conjunction date_time)=>
    date_time (conjunction date_time)+
      -> ^(DATE_TIME_ALTERNATIVE date_time+)
        
  // first or last day of 2009
  | (explicit_day_of_year_part conjunction explicit_day_of_year_part WHITE_SPACE relaxed_year)=>
      first=explicit_day_of_year_part conjunction second=explicit_day_of_year_part WHITE_SPACE relaxed_year
        -> ^(DATE_TIME_ALTERNATIVE
             ^(DATE_TIME ^(RELATIVE_DATE ^(EXPLICIT_SEEK relaxed_year) $first))
             ^(DATE_TIME ^(RELATIVE_DATE ^(EXPLICIT_SEEK relaxed_year) $second)))
             
  // for 3 days, for 7 months, for twenty seconds
  | ((FOR | NEXT) WHITE_SPACE spelled_or_int_optional_prefix WHITE_SPACE)=>
    (FOR | NEXT) WHITE_SPACE spelled_or_int_optional_prefix WHITE_SPACE
      (relative_date_span -> 
        ^(DATE_TIME_ALTERNATIVE
          ^(DATE_TIME ^(RELATIVE_DATE ^(SEEK DIRECTION[">"] SEEK_BY["by_day"] INT["0"] SPAN["day"])))
          ^(DATE_TIME ^(RELATIVE_DATE ^(SEEK DIRECTION[">"] SEEK_BY["by_day"] spelled_or_int_optional_prefix relative_date_span))))
      | relative_time_span ->
        ^(DATE_TIME_ALTERNATIVE
          ^(DATE_TIME ^(RELATIVE_TIME ^(SEEK DIRECTION[">"] SEEK_BY["by_day"] INT["0"] SPAN["day"])))
          ^(DATE_TIME ^(RELATIVE_TIME ^(SEEK DIRECTION[">"] SEEK_BY["by_day"] spelled_or_int_optional_prefix relative_time_span))))
      )
      
  // last 3 days, last 7 months, past twenty seconds
  | ((LAST | PAST) WHITE_SPACE spelled_or_int_optional_prefix WHITE_SPACE)=>
    (LAST | PAST) WHITE_SPACE spelled_or_int_optional_prefix WHITE_SPACE
      (relative_date_span -> 
        ^(DATE_TIME_ALTERNATIVE
          ^(DATE_TIME ^(RELATIVE_DATE ^(SEEK DIRECTION["<"] SEEK_BY["by_day"] INT["0"] SPAN["day"])))
          ^(DATE_TIME ^(RELATIVE_DATE ^(SEEK DIRECTION["<"] SEEK_BY["by_day"] spelled_or_int_optional_prefix relative_date_span))))
      | relative_time_span ->
        ^(DATE_TIME_ALTERNATIVE
          ^(DATE_TIME ^(RELATIVE_TIME ^(SEEK DIRECTION["<"] SEEK_BY["by_day"] INT["0"] SPAN["day"])))
          ^(DATE_TIME ^(RELATIVE_TIME ^(SEEK DIRECTION["<"] SEEK_BY["by_day"] spelled_or_int_optional_prefix relative_time_span))))
      )
  
  // single date_time
  | date_time -> ^(DATE_TIME_ALTERNATIVE date_time)
  ;
  
conjunction
  : COMMA? WHITE_SPACE (AND | OR | TO | THROUGH | DASH) WHITE_SPACE
  ;
  
alternative_day_of_month_list
  // mon may 15 or tues may 16
  : ((relaxed_day_of_week? relaxed_month WHITE_SPACE relaxed_day_of_month (conjunction relaxed_day_of_month)+) (date_time_separator explicit_time)?)
      -> ^(DATE_TIME ^(EXPLICIT_DATE relaxed_month relaxed_day_of_month) explicit_time?)+
      
  // first or last day of september
  | (explicit_day_of_month_part conjunction explicit_day_of_month_part WHITE_SPACE relaxed_month)=>
      first=explicit_day_of_month_part conjunction second=explicit_day_of_month_part WHITE_SPACE relaxed_month (date_time_separator explicit_time)?
        -> ^(DATE_TIME ^(RELATIVE_DATE ^(EXPLICIT_SEEK relaxed_month) $first) explicit_time?)
           ^(DATE_TIME ^(RELATIVE_DATE ^(EXPLICIT_SEEK relaxed_month) $second) explicit_time?)
           
  // first or last day of next september
  | (explicit_day_of_month_part conjunction explicit_day_of_month_part WHITE_SPACE prefix WHITE_SPACE explicit_relative_month)=>
      first=explicit_day_of_month_part conjunction second=explicit_day_of_month_part WHITE_SPACE prefix WHITE_SPACE explicit_relative_month (date_time_separator explicit_time)?
        -> ^(DATE_TIME ^(RELATIVE_DATE ^(SEEK prefix explicit_relative_month) $first) explicit_time?)
           ^(DATE_TIME ^(RELATIVE_DATE ^(SEEK prefix explicit_relative_month) $second) explicit_time?)
           
  // first or last day of 2 septembers from now
  | (explicit_day_of_month_part conjunction explicit_day_of_month_part WHITE_SPACE spelled_or_int_optional_prefix WHITE_SPACE explicit_relative_month WHITE_SPACE relative_date_suffix)=>
      first=explicit_day_of_month_part conjunction second=explicit_day_of_month_part WHITE_SPACE 
        spelled_or_int_optional_prefix WHITE_SPACE explicit_relative_month WHITE_SPACE relative_date_suffix (date_time_separator explicit_time)?
          -> ^(DATE_TIME ^(RELATIVE_DATE ^(SEEK relative_date_suffix spelled_or_int_optional_prefix explicit_relative_month) $first) explicit_time?)
             ^(DATE_TIME ^(RELATIVE_DATE ^(SEEK relative_date_suffix spelled_or_int_optional_prefix explicit_relative_month) $second) explicit_time?)
  ;
  
alternative_day_of_week_list
  : alternative_direction WHITE_SPACE day_of_week (day_of_week_list_separator day_of_week)+ (date_time_separator explicit_time)?
      -> ^(DATE_TIME ^(RELATIVE_DATE ^(SEEK alternative_direction day_of_week)) explicit_time?)+
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
  
  // 3 days before
  | spelled_or_int_optional_prefix WHITE_SPACE DAY WHITE_SPACE prefix_direction
      -> prefix_direction SEEK_BY["by_day"] spelled_or_int_optional_prefix
      
  // 2 weeks before
  | spelled_or_int_optional_prefix WHITE_SPACE WEEK WHITE_SPACE prefix_direction
      -> prefix_direction SEEK_BY["by_week"] spelled_or_int_optional_prefix

  | WEEK WHITE_SPACE prefix_direction
      -> prefix_direction SEEK_BY["by_week"] INT["1"]

  // 6 months before
  | spelled_or_int_optional_prefix WHITE_SPACE MONTH WHITE_SPACE prefix_direction
      -> prefix_direction SEEK_BY["by_month"] spelled_or_int_optional_prefix
      
  // 6 years before
  | spelled_or_int_optional_prefix WHITE_SPACE YEAR WHITE_SPACE prefix_direction
      -> prefix_direction SEEK_BY["by_year"] spelled_or_int_optional_prefix
      
  // the friday after
  | (THE WHITE_SPACE)? day_of_week WHITE_SPACE prefix_direction
      -> prefix_direction SEEK_BY["by_day"] INT["1"] day_of_week
      
  // 3 fridays before
  | spelled_or_int_optional_prefix WHITE_SPACE day_of_week WHITE_SPACE prefix_direction
      -> prefix_direction SEEK_BY["by_day"] spelled_or_int_optional_prefix day_of_week
      
  | (THE WHITE_SPACE)? spelled_first_to_thirty_first WHITE_SPACE day_of_week WHITE_SPACE prefix_direction
      -> prefix_direction SEEK_BY["by_day"] spelled_first_to_thirty_first day_of_week
  ; 
  
prefix_direction
  : (AFTER | FROM | ON) -> DIRECTION[">"]
  | BEFORE -> DIRECTION["<"]
  ;
  
// ********** relaxed date rules **********

// relaxed date with a spelled-out or abbreviated month
relaxed_date
  : (
      // The 31st of April in the year 2008
      // RFC822 style: Fri, 21 Nov 1997
      relaxed_day_of_week? relaxed_day_of_month_prefix? relaxed_day_of_month
        WHITE_SPACE (OF WHITE_SPACE)? relaxed_month (relaxed_year_prefix relaxed_year)?

      // Jan 21, 1997   Sun, Nov 21
      | relaxed_day_of_week? relaxed_month COMMA? WHITE_SPACE relaxed_day_of_month (relaxed_year_prefix relaxed_year)?
    ) -> ^(EXPLICIT_DATE relaxed_month relaxed_day_of_month relaxed_day_of_week? relaxed_year?)
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
  // year first: 1979-02-28, 1980/01/02, etc.  full 4 digit year required to match
  : relaxed_day_of_week? formal_year_four_digits formal_date_separator (formal_month_of_year | relaxed_month) formal_date_separator formal_day_of_month
      -> ^(EXPLICIT_DATE formal_month_of_year? relaxed_month? formal_day_of_month relaxed_day_of_week? formal_year_four_digits)
      
  // year last: 1/02/1980, 2/28/79.  2 or 4 digit year is acceptable 
  | relaxed_day_of_week? formal_month_of_year formal_date_separator formal_day_of_month (formal_date_separator formal_year)?
      -> ^(EXPLICIT_DATE formal_month_of_year formal_day_of_month relaxed_day_of_week? formal_year?)

  // 15-Apr-2014
  | formal_day_of_month formal_date_separator relaxed_month (formal_date_separator formal_year_four_digits)?
      -> ^(EXPLICIT_DATE relaxed_month formal_day_of_month formal_year_four_digits?)

  | relaxed_month WHITE_SPACE relaxed_year
      -> ^(EXPLICIT_DATE relaxed_month ^(DAY_OF_MONTH INT["1"]) relaxed_year?)
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
  : relative_date_prefix WHITE_SPACE relative_target 
      -> ^(RELATIVE_DATE ^(SEEK relative_date_prefix relative_target))
      
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
  // 1st of three months ago, 10th of 3 octobers from now, the last monday in 2 novembers ago
  : (explicit_day_of_month_part WHITE_SPACE spelled_or_int_optional_prefix)=>
    explicit_day_of_month_part WHITE_SPACE spelled_or_int_optional_prefix 
        WHITE_SPACE explicit_relative_month WHITE_SPACE relative_date_suffix
      -> ^(RELATIVE_DATE ^(SEEK relative_date_suffix spelled_or_int_optional_prefix explicit_relative_month) explicit_day_of_month_part)
          
  // 10th of next month, 31st of last month, 10th of next october, 30th of this month, the last thursday of last november
  | (explicit_day_of_month_part WHITE_SPACE prefix)=>
    explicit_day_of_month_part WHITE_SPACE prefix WHITE_SPACE explicit_relative_month
      -> ^(RELATIVE_DATE 
          ^(SEEK prefix explicit_relative_month)
          explicit_day_of_month_part)
          
  // 10th of the month after next
  | (explicit_day_of_month_part WHITE_SPACE THE WHITE_SPACE MONTH WHITE_SPACE AFTER WHITE_SPACE NEXT)=>
    explicit_day_of_month_part WHITE_SPACE THE WHITE_SPACE MONTH WHITE_SPACE AFTER WHITE_SPACE NEXT
      -> ^(RELATIVE_DATE 
          ^(SEEK DIRECTION[">"] SEEK_BY["by_day"] INT["2"] SPAN["month"])
          explicit_day_of_month_part)

  // monday after next
  | (explicit_day_of_week_part WHITE_SPACE AFTER WHITE_SPACE NEXT)
      -> ^(RELATIVE_DATE
          ^(SEEK DIRECTION[">"] SEEK_BY["by_day"] INT["2"] SPAN["week"])
          explicit_day_of_week_part)

  // saturday before last
  | (explicit_day_of_week_part WHITE_SPACE BEFORE WHITE_SPACE LAST)
      -> ^(RELATIVE_DATE
          ^(SEEK DIRECTION["<"] SEEK_BY["by_day"] INT["2"] SPAN["week"])
          explicit_day_of_week_part)

  // monday of last week, tuesday of next week
  | (explicit_day_of_week_part WHITE_SPACE prefix WHITE_SPACE WEEK)=>
      explicit_day_of_week_part WHITE_SPACE prefix WHITE_SPACE WEEK
      -> ^(RELATIVE_DATE 
          ^(SEEK prefix SPAN["week"])
          explicit_day_of_week_part)
          
  // monday of 2 weeks ago, tuesday of 3 weeks from now
  | (explicit_day_of_week_part WHITE_SPACE spelled_or_int_optional_prefix)=>
    explicit_day_of_week_part WHITE_SPACE spelled_or_int_optional_prefix 
        WHITE_SPACE WEEK WHITE_SPACE relative_date_suffix
      -> ^(RELATIVE_DATE 
          ^(SEEK relative_date_suffix spelled_or_int_optional_prefix SPAN["week"])
          explicit_day_of_week_part)
          
  // monday of the week after next
  | explicit_day_of_week_part WHITE_SPACE THE WHITE_SPACE WEEK WHITE_SPACE AFTER WHITE_SPACE NEXT
      -> ^(RELATIVE_DATE 
          ^(SEEK DIRECTION[">"] SEEK_BY["by_day"] INT["2"] SPAN["week"])
          explicit_day_of_week_part)
          
  // the last thursday in november 1999
  | (explicit_day_of_month_part WHITE_SPACE relaxed_month relaxed_year_prefix relaxed_year)=>
      explicit_day_of_month_part WHITE_SPACE relaxed_month relaxed_year_prefix relaxed_year
      -> ^(RELATIVE_DATE 
          ^(SEEK DIRECTION[">"] SEEK_BY["by_day"] INT["0"] relaxed_month)
          explicit_day_of_month_part
          ^(EXPLICIT_SEEK relaxed_year))
          
  // above without the year restriction
  | explicit_day_of_month_part WHITE_SPACE relaxed_month
      -> ^(RELATIVE_DATE 
          ^(SEEK DIRECTION[">"] SEEK_BY["by_day"] INT["0"] relaxed_month)
          explicit_day_of_month_part)
          
  // the first day of 2009
  | explicit_day_of_year_part WHITE_SPACE relaxed_year
      -> ^(RELATIVE_DATE ^(EXPLICIT_SEEK relaxed_year) explicit_day_of_year_part)
  ;
  
explicit_day_of_month_part
  // first of, 10th of, 31st of,
  : (THE WHITE_SPACE)? relaxed_day_of_month (WHITE_SPACE (IN | OF))?
      -> ^(EXPLICIT_SEEK relaxed_day_of_month)
      
  // the last thursday
  | (THE WHITE_SPACE)? relative_occurrence_index WHITE_SPACE day_of_week (WHITE_SPACE (IN | OF))?
      -> ^(EXPLICIT_SEEK relative_occurrence_index day_of_week)
      
  // in the start of, at the beginning of, the end of, last day of, first day of
  | (((IN | AT) WHITE_SPACE)? THE WHITE_SPACE)? explicit_day_of_month_bound (WHITE_SPACE (OF | IN))?
      -> explicit_day_of_month_bound
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
  : THIS -> DIRECTION[">"] SEEK_BY["by_day"] INT["0"]
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
      -> DIRECTION[">"] SEEK_BY["by_day"] relative_time_suffix_anchor
      
  // before noon, before 3pm
  | BEFORE (WHITE_SPACE relative_time_suffix_anchor)?
      -> DIRECTION["<"] SEEK_BY["by_day"] relative_time_suffix_anchor
      
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
    
  | holiday_name relaxed_year_prefix relaxed_year
    -> ^(EXPLICIT_SEEK holiday_name relaxed_year)
    
  | holiday_name
    -> ^(SEEK DIRECTION[">"] SEEK_BY["by_day"] INT["1"] holiday_name)
  ;

holiday_name
  : APRIL WHITE_SPACE FOOL (WHITE_SPACE DAY)?
    -> HOLIDAY["APRIL_FOOLS_DAY"]
    
  | BLACK WHITE_SPACE FRIDAY
    -> HOLIDAY["BLACK_FRIDAY"]
    
  | CHRISTMAS WHITE_SPACE EVENING 
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
    
  | MLK WHITE_SPACE DAY
    -> HOLIDAY["MLK_DAY"]
    
  | MEMORIAL WHITE_SPACE DAY
    -> HOLIDAY["MEMORIAL_DAY"]
    
  | MOTHER WHITE_SPACE DAY
    -> HOLIDAY["MOTHERS_DAY"]
    
  | NEW WHITE_SPACE YEAR WHITE_SPACE EVENING
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
    
  | season_name relaxed_year_prefix relaxed_year
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
    
  // in 3 minutes
  | IN WHITE_SPACE spelled_or_int_optional_prefix WHITE_SPACE relative_time_target
    -> ^(RELATIVE_TIME ^(SEEK DIRECTION[">"] SEEK_BY["by_day"] spelled_or_int_optional_prefix relative_time_target))
    
  // next hour, last minute
  | prefix WHITE_SPACE relative_time_target
    -> ^(RELATIVE_TIME ^(SEEK prefix relative_time_target))
  ;

// a time with an hour, optional minutes, and optional meridian indicator
explicit_time
  : hours COLON? minutes (COLON? seconds)? (WHITE_SPACE? (meridian_indicator | (MILITARY_HOUR_SUFFIX | HOUR)))? (WHITE_SPACE? time_zone)?
      -> ^(EXPLICIT_TIME hours minutes seconds? meridian_indicator? time_zone?)
      
  | hours (WHITE_SPACE? meridian_indicator)? (WHITE_SPACE? time_zone)?
      -> ^(EXPLICIT_TIME hours ^(MINUTES_OF_HOUR INT["0"]) meridian_indicator? time_zone?)
      
  | (THIS WHITE_SPACE)? named_time (WHITE_SPACE time_zone)?
    -> ^(EXPLICIT_TIME named_time time_zone?)
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
  : AM -> AM_PM["am"]
  | PM -> AM_PM["pm"]
  | (IN WHITE_SPACE THE WHITE_SPACE)? MORNING -> AM_PM["am"]
  | (IN WHITE_SPACE THE WHITE_SPACE)? NOON -> AM_PM["pm"]
  | (IN WHITE_SPACE THE WHITE_SPACE)? EVENING -> AM_PM["pm"]
  | (AT WHITE_SPACE)? NIGHT -> AM_PM["pm"]
  
  ;
  
named_time
  : (IN WHITE_SPACE THE WHITE_SPACE)? NOON    -> ^(HOURS_OF_DAY INT["12"]) ^(MINUTES_OF_HOUR INT["0"]) ^(SECONDS_OF_MINUTE INT["0"]) AM_PM["pm"]
  | (IN WHITE_SPACE THE WHITE_SPACE)? MORNING -> ^(HOURS_OF_DAY INT["8"]) ^(MINUTES_OF_HOUR INT["0"]) ^(SECONDS_OF_MINUTE INT["0"]) AM_PM["am"]
  | (IN WHITE_SPACE THE WHITE_SPACE)? NIGHT   -> ^(HOURS_OF_DAY INT["8"]) ^(MINUTES_OF_HOUR INT["0"]) ^(SECONDS_OF_MINUTE INT["0"]) AM_PM["pm"]
  | TONIGHT                                   -> ^(HOURS_OF_DAY INT["8"]) ^(MINUTES_OF_HOUR INT["0"]) ^(SECONDS_OF_MINUTE INT["0"]) AM_PM["pm"]
  | (AT WHITE_SPACE)? MIDNIGHT                -> ^(HOURS_OF_DAY INT["12"]) ^(MINUTES_OF_HOUR INT["0"]) ^(SECONDS_OF_MINUTE INT["0"]) AM_PM["am"]
  | (IN WHITE_SPACE THE WHITE_SPACE)? EVENING -> ^(HOURS_OF_DAY INT["7"]) ^(MINUTES_OF_HOUR INT["0"]) ^(SECONDS_OF_MINUTE INT["0"]) AM_PM["pm"]
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
