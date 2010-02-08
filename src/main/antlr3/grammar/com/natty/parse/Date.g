grammar Date;

options {
  output=AST;
}

tokens {
  INT;
  MONTH_OF_YEAR;
  DAY_OF_MONTH;
  DAY_OF_WEEK;
  YEAR_OF;
  DATE_TIME;
  EXPLICIT_DATE;
  RELATIVE_DATE;
  SEEK;
  DIRECTION;
  SEEK_BY;
  SPAN;
  EXPLICIT_TIME;
  HOURS_OF_DAY;
  MINUTES_OF_HOUR;
  AM_PM;
}

@header        { package com.natty.parse; }
@lexer::header { package com.natty.parse; }

date_time
  : (
      (date (date_time_separator time)?)=>
        date (date_time_separator time)?
      
      | time (time_date_separator date)?
    ) -> ^(DATE_TIME date? time?)
  ;
  
date_time_separator
  : WHITE_SPACE (AT WHITE_SPACE)?
  | COMMA WHITE_SPACE? (AT WHITE_SPACE)?
  ;
  
time_date_separator
  : WHITE_SPACE (ON WHITE_SPACE)?
  | COMMA WHITE_SPACE? (ON WHITE_SPACE)?
  ;

date
  : global_date_prefix formal_date
      -> ^(RELATIVE_DATE ^(SEEK global_date_prefix formal_date))
      
  | global_date_prefix relaxed_date
      -> ^(RELATIVE_DATE ^(SEEK global_date_prefix relaxed_date))
      
  | global_date_prefix relative_date
      -> ^(RELATIVE_DATE ^(SEEK global_date_prefix relative_date))
      
  | (formal_date | relaxed_date | relative_date)
  ;
  
global_date_prefix
  : (THE WHITE_SPACE)? DAY WHITE_SPACE AFTER WHITE_SPACE 
      -> DIRECTION[">"] INT["1"]
      
  | (THE WHITE_SPACE)? DAY WHITE_SPACE BEFORE WHITE_SPACE
      -> DIRECTION["<"] INT["1"]
  ;
  
// ********** relaxed date rules **********

// relaxed date with a spelled-out or abbreviated month
relaxed_date
  : (
      // this is a bit tricky since a time can be placed directly after a date, and a year
      // can look like a time (four digits, no colon i.e. 0500)  Since a year would be more
      // common in this context, we choose to swallow the year as part of the date.
      ((THE WHITE_SPACE)? relaxed_day_of_month WHITE_SPACE (OF WHITE_SPACE)? relaxed_month relaxed_year)=>
        (THE WHITE_SPACE)? relaxed_day_of_month WHITE_SPACE (OF WHITE_SPACE)? relaxed_month relaxed_year
    
      | (relaxed_month WHITE_SPACE relaxed_day_of_month relaxed_year)=>
        relaxed_month WHITE_SPACE relaxed_day_of_month relaxed_year
    
      | (THE WHITE_SPACE)? relaxed_day_of_month WHITE_SPACE (OF WHITE_SPACE)? relaxed_month
      | (THE WHITE_SPACE)? relaxed_month WHITE_SPACE relaxed_day_of_month
    ) -> ^(EXPLICIT_DATE relaxed_month relaxed_day_of_month relaxed_year?)
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
  
relaxed_year
  : relaxed_year_prefix SINGLE_QUOTE? int_00_to_99_mandatory_prefix
      -> ^(YEAR_OF int_00_to_99_mandatory_prefix)
      
  | relaxed_year_prefix int_four_digits
      -> ^(YEAR_OF int_four_digits)
  ;
  
relaxed_year_prefix
  : (COMMA WHITE_SPACE? | WHITE_SPACE) (IN WHITE_SPACE THE WHITE_SPACE YEAR WHITE_SPACE)? 
  ; 
  
// ********** formal date rules **********

formal_date
  // year first: 1979-02-28, 1980/01/02, etc.  full 4 digit year required to match
  : formal_year_four_digits formal_date_separator formal_month_of_year formal_date_separator formal_day_of_month
      -> ^(EXPLICIT_DATE formal_month_of_year formal_day_of_month formal_year_four_digits)
 
  // year last: 1/02/1980, 2/28/79.  2 or 4 digit year is acceptable 
  | formal_month_of_year formal_date_separator formal_day_of_month (formal_date_separator formal_year)?
      -> ^(EXPLICIT_DATE formal_month_of_year formal_day_of_month formal_year?)
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
  : relative_prefix WHITE_SPACE relative_target 
      -> ^(RELATIVE_DATE ^(SEEK relative_prefix) relative_target)
      
  | spelled_or_int_01_to_31_optional_prefix WHITE_SPACE relative_target WHITE_SPACE relative_suffix 
      -> ^(RELATIVE_DATE ^(SEEK relative_suffix spelled_or_int_01_to_31_optional_prefix) relative_target)
      
  | named_relative_date 
  ;
  
relative_target
  : day_of_week 
  | relative_date_span
  ;
  
relative_prefix
  : (THIS WHITE_SPACE)? LAST     -> DIRECTION["<"] SEEK_BY["by_week"] INT["1"]
  | (THIS WHITE_SPACE)? NEXT     -> DIRECTION[">"] SEEK_BY["by_week"] INT["1"]
  | (THIS WHITE_SPACE)? PAST     -> DIRECTION["<"] SEEK_BY["by_day"] INT["1"]
  | (THIS WHITE_SPACE)? COMING   -> DIRECTION[">"] SEEK_BY["by_day"] INT["1"]
  | (THIS WHITE_SPACE)? UPCOMING -> DIRECTION[">"] SEEK_BY["by_day"] INT["1"]
  | (IN WHITE_SPACE)? spelled_or_int_01_to_31_optional_prefix 
      -> DIRECTION[">"] SEEK_BY["by_day"] spelled_or_int_01_to_31_optional_prefix
  ;
  
relative_suffix
  : FROM WHITE_SPACE NOW -> DIRECTION[">"] SEEK_BY["by_day"]
  | AGO                  -> DIRECTION["<"] SEEK_BY["by_day"]
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
  : TODAY     -> ^(RELATIVE_DATE ^(SEEK DIRECTION[">"] INT["0"]))
  | TOMORROW  -> ^(RELATIVE_DATE ^(SEEK DIRECTION[">"] INT["1"]))
  | YESTERDAY -> ^(RELATIVE_DATE ^(SEEK DIRECTION["<"] INT["1"]))
  ;
  
// ********** time rules **********

// a time with an hour, optional minutes, and optional meridian indicator
time
  : hours COLON? minutes (WHITE_SPACE? (meridian_indicator | (MILITARY_HOUR_SUFFIX | HOUR)))?
      -> ^(EXPLICIT_TIME hours minutes meridian_indicator?)
      
  | hours WHITE_SPACE? meridian_indicator?
      -> ^(EXPLICIT_TIME hours ^(MINUTES_OF_HOUR INT["0"]) meridian_indicator?)
      
  | named_time
  ;
 
// hour of the day
hours
  : int_00_to_23_optional_prefix -> ^(HOURS_OF_DAY int_00_to_23_optional_prefix)
  ;
  
// minutes of the hour
minutes
  : int_00_to_59_mandatory_prefix -> ^(MINUTES_OF_HOUR int_00_to_59_mandatory_prefix)
  
  ;
  
// meridian am/pm indicator
meridian_indicator
  : AM -> AM_PM["am"]
  | PM -> AM_PM["pm"]
  ;
  
named_time
  : NOON     -> ^(EXPLICIT_TIME ^(HOURS_OF_DAY INT["12"]) ^(MINUTES_OF_HOUR INT["0"]) AM_PM["pm"])
  | MIDNIGHT -> ^(EXPLICIT_TIME ^(HOURS_OF_DAY INT["12"]) ^(MINUTES_OF_HOUR INT["0"]) AM_PM["am"])
  ;
  
// ********** numeric rules **********

// a number between 0 and 23 inclusive, with an optional 0 prefix before numbers 0-9
int_00_to_23_optional_prefix
  : (INT_0
  | INT_00
  | INT_1_TO_9
  | INT_01_TO_12
  | INT_13_TO_23) -> INT[$int_00_to_23_optional_prefix.text]
  ;
 
// a number between 00 and 59 inclusive, with a mandatory 0 prefix before numbers 0-9
int_00_to_59_mandatory_prefix
  : (INT_00
  | INT_01_TO_12
  | INT_13_TO_23
  | INT_24_TO_31
  | INT_32_TO_59) -> INT[$int_00_to_59_mandatory_prefix.text]
  ;
  
// a number between 00 and 99 inclusive, with a mandatory 0 prefix before numbers 0-9
int_00_to_99_mandatory_prefix
  : int_00_to_59_mandatory_prefix
  | INT_60_TO_99 -> INT[$INT_60_TO_99.text]
  ;
  
// a number between 1 and 12 inclusive, with an optional 0 prefix before numbers 1-9
int_01_to_12_optional_prefix
  : (INT_1_TO_9
  | INT_01_TO_12) -> INT[$int_01_to_12_optional_prefix.text]
  ;
  
// a number between 1 and 31 inclusive, with an optional 0 prefix before numbers 1-9
int_01_to_31_optional_prefix
  : (INT_1_TO_9
  | INT_01_TO_12
  | INT_13_TO_23
  | INT_24_TO_31) -> INT[$int_01_to_31_optional_prefix.text]
  ;
  
// a number with exactly four digits
int_four_digits
  : int_00_to_99_mandatory_prefix int_00_to_99_mandatory_prefix
      -> INT[$int_four_digits.text]
  ;
  
// a number between one and thirty-one either spelled-out, or as an
// integer with an optional 0 prefix for numbers betwen 1 and 9
spelled_or_int_01_to_31_optional_prefix
  : int_01_to_31_optional_prefix
  | spelled_one_to_thirty_one
  ;
  
// a spelled number between one and thirty-one (one, two, etc.)
spelled_one_to_thirty_one
  : ONE        -> INT["1"]
  | TWO        -> INT["2"]
  | THREE      -> INT["3"]
  | FOUR       -> INT["4"]
  | FIVE       -> INT["5"]
  | SIX        -> INT["6"]
  | SEVEN      -> INT["7"]
  | EIGHT      -> INT["8"]
  | NINE       -> INT["9"]
  | TEN        -> INT["10"]
  | ELEVEN     -> INT["11"]
  | TWELVE     -> INT["12"]
  | THIRTEEN   -> INT["13"]
  | FOURTEEN   -> INT["14"]
  | FIFTEEN    -> INT["15"]
  | SIXTEEN    -> INT["16"]
  | SEVENTEEN  -> INT["17"]
  | EIGHTEEN   -> INT["18"]
  | NINETEEN   -> INT["19"]
  | TWENTY     -> INT["20"]
  | TWENTY (DASH | WHITE_SPACE)? ONE   -> INT["21"]
  | TWENTY (DASH | WHITE_SPACE)? TWO   -> INT["22"]
  | TWENTY (DASH | WHITE_SPACE)? THREE -> INT["23"]
  | TWENTY (DASH | WHITE_SPACE)? FOUR  -> INT["24"]
  | TWENTY (DASH | WHITE_SPACE)? FIVE  -> INT["25"]
  | TWENTY (DASH | WHITE_SPACE)? SIX   -> INT["26"]
  | TWENTY (DASH | WHITE_SPACE)? SEVEN -> INT["27"]
  | TWENTY (DASH | WHITE_SPACE)? EIGHT -> INT["28"]
  | TWENTY (DASH | WHITE_SPACE)? NINE  -> INT["29"]
  | THIRTY                             -> INT["30"]
  | THIRTY (DASH | WHITE_SPACE)? ONE   -> INT["31"]
  ;
  
// a spelled number in sequence between first and thirty-first
spelled_first_to_thirty_first
  : FIRST       -> INT["1"]
  | SECOND      -> INT["2"]
  | THIRD       -> INT["3"]
  | FOURTH      -> INT["4"]
  | FIFTH       -> INT["5"]
  | SIXTH       -> INT["6"]
  | SEVENTH     -> INT["7"]
  | EIGHTH      -> INT["8"]
  | NINTH       -> INT["9"]
  | TENTH       -> INT["10"]
  | ELEVENTH    -> INT["11"]
  | TWELFTH     -> INT["12"]
  | THIRTEENTH  -> INT["13"]
  | FOURTEENTH  -> INT["14"]
  | FIFTEENTH   -> INT["15"]
  | SIXTEENTH   -> INT["16"]
  | SEVENTEENTH -> INT["17"]
  | EIGHTEENTH  -> INT["18"]
  | NINETEENTH  -> INT["19"]
  | TWENTIETH   -> INT["20"]
  | (TWENTY_FIRST   | (TWENTY (DASH | WHITE_SPACE)? FIRST))   -> INT["21"]
  | (TWENTY_SECOND  | (TWENTY (DASH | WHITE_SPACE)? SECOND))  -> INT["22"]
  | (TWENTY_THIRD   | (TWENTY (DASH | WHITE_SPACE)? THIRD))   -> INT["23"]
  | (TWENTY_FOURTH  | (TWENTY (DASH | WHITE_SPACE)? FOURTH))  -> INT["24"]
  | (TWENTY_FIFTH   | (TWENTY (DASH | WHITE_SPACE)? FIFTH))   -> INT["25"]
  | (TWENTY_SIXTH   | (TWENTY (DASH | WHITE_SPACE)? SIXTH))   -> INT["26"]
  | (TWENTY_SEVENTH | (TWENTY (DASH | WHITE_SPACE)? SEVENTH)) -> INT["27"]
  | (TWENTY_EIGHTH  | (TWENTY (DASH | WHITE_SPACE)? EIGHTH))  -> INT["28"]
  | (TWENTY_NINTH   | (TWENTY (DASH | WHITE_SPACE)? NINTH))   -> INT["29"]
  | THIRTIETH                                                 -> INT["30"]
  | (THIRTY_FIRST   | (THIRTY (DASH | WHITE_SPACE)? FIRST))   -> INT["31"]
  ;
  
// ********** date lexer rules ********** 

JANUARY   : 'january'   | 'jan' DOT?;
FEBRUARY  : 'february'  | 'feb' DOT?;
MARCH     : 'march'     | 'mar' DOT?;
APRIL     : 'april'     | 'apr' DOT?;
MAY       : 'may';
JUNE      : 'june'      | 'jun' DOT?;
JULY      : 'july'      | 'jul' DOT?;
AUGUST    : 'august'    | 'aug' DOT?;
SEPTEMBER : 'september' | 'sep' DOT? | 'sept' DOT?;
OCTOBER   : 'october'   | 'oct' DOT?;
NOVEMBER  : 'november'  | 'nov' DOT?;
DECEMBER  : 'december'  | 'dec' DOT?;
  
SUNDAY    : 'sunday'    | 'sundays'    | 'sun'  | 'suns';
MONDAY    : 'monday'    | 'mondays'    | 'mon'  | 'mons';
TUESDAY   : 'tuesday'   | 'tuesdays'   | 'tues' | 'tue';
WEDNESDAY : 'wednesday' | 'wednesdays' | 'wed'  | 'weds';
THURSDAY  : 'thursday'  | 'thursdays'  | 'thur' | 'thu' | 'thus' | 'thurs';
FRIDAY    : 'friday'    | 'fridays'    | 'fri'  | 'fris';
SATURDAY  : 'saturday'  | 'saturdays'  | 'sat'  | 'sats' | 'weekend';

HOUR  : 'hour'  | 'hours' ;
DAY   : 'day'   | 'days' ;
WEEK  : 'week'  | 'weeks' ;
MONTH : 'month' | 'months' ;
YEAR  : 'year'  | 'years' ;

TODAY     : 'today';
TOMORROW  : 'tomorow'   | 'tomorrow'   | 'tommorow' | 'tommorrow';
YESTERDAY : 'yesterday';

// ********** time lexer rules ********** 
  
AM : 'am' | 'a.m.' | 'a';
PM : 'pm' | 'p.m.' | 'p';

MILITARY_HOUR_SUFFIX : 'h' | 'H';

MIDNIGHT : 'midnight' | 'mid-night';
NOON     : 'noon' | 'afternoon' | 'after-noon';

// ********* numeric lexer rules **********

INT_60_TO_99
  : '6'..'9' '0'..'9'
  ;
   
INT_32_TO_59
  : '3' '2'..'9'
  | '4'..'5' '0'..'9' 
  ;
   
INT_24_TO_31
  : '2' '4'..'9'
  | '3' '0'..'1'
  ;
   
INT_13_TO_23
  : '1' '3'..'9'
  | '2' '0'..'3'
  ;
   
INT_01_TO_12
  : '0' '1'..'9'
  | '1' '0'..'2'
  ;
   
INT_00
  : '00'
  ;
  
INT_0
  : '0'
  ;
 
INT_1_TO_9
  : '0'..'9'
  ;
   
ONE       : 'one';
TWO       : 'two';
THREE     : 'three';
FOUR      : 'four';
FIVE      : 'five';
SIX       : 'six';
SEVEN     : 'seven';
EIGHT     : 'eight';
NINE      : 'nine';
TEN       : 'ten';
ELEVEN    : 'eleven';
TWELVE    : 'twelve';
THIRTEEN  : 'thirteen';
FOURTEEN  : 'fourteen';
FIFTEEN   : 'fifteen';
SIXTEEN   : 'sixteen';
SEVENTEEN : 'seventeen';
EIGHTEEN  : 'eighteen' | 'eightteen';
NINETEEN  : 'nineteen';
TWENTY    : 'twenty';
THIRTY    : 'thirty';

FIRST          : 'first'       | '1st';
SECOND         : 'second'      | '2nd';
THIRD          : 'third'       | '3rd';
FOURTH         : 'fourth'      | '4th';
FIFTH          : 'fifth'       | '5th';
SIXTH          : 'sixth'       | '6th';
SEVENTH        : 'seventh'     | '7th';
EIGHTH         : 'eigth'       | '8th';
NINTH          : 'ninth'       | '9th';
TENTH          : 'tenth'       | '10th';
ELEVENTH       : 'eleventh'    | '11th';
TWELFTH        : 'twelfth'     | '12th';
THIRTEENTH     : 'thirteenth'  | '13th';
FOURTEENTH     : 'fourteenth'  | '14th';
FIFTEENTH      : 'fifteenth'   | '15th';
SIXTEENTH      : 'sixteenth'   | '16th';
SEVENTEENTH    : 'seventeenth' | '17th';
EIGHTEENTH     : 'eighteenth'  | '18th';
NINETEENTH     : 'nineteenth'  | '19th';
TWENTIETH      : 'twentieth'   | '20th';
TWENTY_FIRST   : '21st';
TWENTY_SECOND  : '22nd';
TWENTY_THIRD   : '23rd';
TWENTY_FOURTH  : '24th';
TWENTY_FIFTH   : '25th';
TWENTY_SIXTH   : '26th';
TWENTY_SEVENTH : '27th';
TWENTY_EIGHTH  : '28th';
TWENTY_NINTH   : '29th';
THIRTIETH      : 'thirtieth' | '30th';
THIRTY_FIRST   : '31st';
   
// ********** common lexer rules **********

COLON : ':';
COMMA : ',';
DASH  : '-';
SLASH : '/';
DOT   : '.';
SINGLE_QUOTE : '\'';

IN       : 'in';
THE      : 'the';
AT       : 'at';
ON       : 'on';
OF       : 'of';
THIS     : 'this';
LAST     : 'last';
NEXT     : 'next';
PAST     : 'past';
COMING   : 'coming';
UPCOMING : 'upcoming';
FROM     : 'from';
NOW      : 'now';
AGO      : 'ago';
BEFORE   : 'before';
AFTER    : 'after';

WHITE_SPACE
  : (' ' | '\t' | '\n' | '\r')+
  ;