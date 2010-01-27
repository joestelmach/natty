
grammar Date;

options {
  output=AST;
}

tokens {
  DATE_TIME;
  EXPLICIT_DATE;
  RELATIVE_DATE;
  EXPLICIT_TIME;
  
  // a meridian indicator (am or pm)
  AM_PM;
  
  // represents a month 
  MONTH;
  
  // represents a day of the week 
  DAY_OF_WEEK;
  
  // represents a day of the month
  DAY_OF_MONTH;
  
  // represents a year
  YEAR;
  
  // represents a span of time (day, week, month, or year)
  SPAN;
  
  // represents a year's era (ad or bc)
  ERA;
  
  HOURS;
  MINUTES;
  
  INTEGER;
  
  // the direction to seek (< or >)
  SEEK_DIRECTION;
  
  // the seek type (by_day, by_week)
  SEEK_TYPE;
}

@header { package com.natty.parse; }

@lexer::header { package com.natty.parse; }

datetime 
  : date 'at'? time? -> ^(DATE_TIME date time?)
  | time 'on'? date -> ^(DATE_TIME date time)
  | time -> ^(DATE_TIME ^(RELATIVE_DATE SEEK_DIRECTION[">"] INTEGER["0"]) time)
  ;

date
  : relative_date 
  | explicit_date
  ;
  
time 
  : explicit_time
  ;

relative_date
  : today_or_tomorrow
  
  | relative_prefix modifiable_target 
    -> ^(RELATIVE_DATE relative_prefix modifiable_target)
    
  | numeric_or_natural_integer modifiable_target relative_suffix 
    -> ^(RELATIVE_DATE relative_suffix numeric_or_natural_integer modifiable_target)
  ;
  
// an explicit date with month, day, and year
explicit_date
  : numeric_month separator numeric_day_of_month (separator numeric_year)?
    -> ^(EXPLICIT_DATE numeric_month numeric_day_of_month numeric_year?)
    
  | numeric_four_digit_year separator numeric_month separator numeric_day_of_month
    -> ^(EXPLICIT_DATE numeric_month numeric_day_of_month numeric_four_digit_year)
    
  | month day_of_month (','? year)? 
    -> ^(EXPLICIT_DATE month day_of_month year?) 
  
  | day_of_month 'of'? month (','? year)? 
    -> ^(EXPLICIT_DATE month day_of_month year?) 
  ;
  
// an explicit time with implicit minutes when omitted 
explicit_time 
  // no minutes with optional indicator: 10 a, 12pm, 10
  : numeric_hours meridian_indicator? 
    -> ^(EXPLICIT_TIME numeric_hours MINUTES["0"] meridian_indicator?)
  
  //  separator and minutes with optional indicator: 10:05 a, 12:10 pm, 10:00
  | numeric_hours ':' numeric_minutes meridian_indicator? 
    -> ^(EXPLICIT_TIME numeric_hours numeric_minutes meridian_indicator?)
  
  | time_identifier
  ;
  
// common time identifiers (noon, midnight, etc)
time_identifier
  : 'midnight' -> ^(EXPLICIT_TIME INTEGER["12"] INTEGER["0"] AM_PM["am"])
  | 'noon'     -> ^(EXPLICIT_TIME INTEGER["12"] INTEGER["0"] AM_PM["pm"])
  ;
  
// targets that are able to be prefixed or suffixed
modifiable_target
  : day_of_week 
  | date_span
  | month 's'? -> month
  ;
  
relative_prefix
  : 'this'? 'last'     -> SEEK_DIRECTION["<"] SEEK_TYPE["by_week"] INTEGER["1"]
  | 'this'? 'next'     -> SEEK_DIRECTION[">"] SEEK_TYPE["by_week"] INTEGER["1"]
  | 'this'? 'past'     -> SEEK_DIRECTION["<"] SEEK_TYPE["by_day"] INTEGER["1"]
  | 'this'? 'coming'   -> SEEK_DIRECTION[">"] SEEK_TYPE["by_day"] INTEGER["1"]
  | 'this'? 'upcoming' -> SEEK_DIRECTION[">"] SEEK_TYPE["by_day"] INTEGER["1"]
  | 'in' numeric_or_natural_integer -> SEEK_DIRECTION[">"] SEEK_TYPE["by_day"] numeric_or_natural_integer
  ;
  
relative_suffix
  : 'from now' -> SEEK_DIRECTION[">"] SEEK_TYPE["by_day"]
  | 'ago'      -> SEEK_DIRECTION["<"] SEEK_TYPE["by_day"]
  ;
  
date_span
  : 'day' 's'?   -> SPAN["day"]
  | 'week' 's'?  -> SPAN["week"]
  | 'month' 's'? -> SPAN["month"]
  | year_date_span
  ;
  
year_date_span
  : 'year' 's'? -> SPAN["year"]
  ;
  
month
  : 'january'  -> MONTH["1"]
  | 'jan'      -> MONTH["1"]
  | 'february' -> MONTH["2"]
  | 'feb'      -> MONTH["2"]
  | 'march'    -> MONTH["3"]
  | 'mar'      -> MONTH["3"]
  | 'april'    -> MONTH["4"]
  | 'apr'      -> MONTH["4"]
  | 'may'      -> MONTH["5"]
  | 'june'     -> MONTH["6"]
  | 'jun'      -> MONTH["6"]
  | 'july'     -> MONTH["7"]
  | 'jul'      -> MONTH["7"]
  | 'august'   -> MONTH["8"]
  | 'aug'      -> MONTH["8"]
  | 'september'-> MONTH["9"]
  | 'sep'      -> MONTH["9"]
  | 'october'  -> MONTH["10"]
  | 'oct'      -> MONTH["10"]
  | 'november' -> MONTH["11"]
  | 'nov'      -> MONTH["11"]
  | 'december' -> MONTH["12"]
  | 'dec'      -> MONTH["12"]
  ;
  
numeric_month
  : ONE_TO_TWELVE -> MONTH[$ONE_TO_TWELVE.text]
  ;
  
// a regular language, possibly shortened day of the week
day_of_week
  : 'monday' 's'?    -> DAY_OF_WEEK["2"]
  | 'mon'            -> DAY_OF_WEEK["2"]
  | 'tuesday' 's'?   -> DAY_OF_WEEK["3"]
  | 'tue' 's'?       -> DAY_OF_WEEK["3"]
  | 'tues'           -> DAY_OF_WEEK["3"]
  | 'wednesday' 's'? -> DAY_OF_WEEK["4"]
  | 'wed'            -> DAY_OF_WEEK["4"]
  | 'thursday' 's'?  -> DAY_OF_WEEK["5"]
  | 'thur'           -> DAY_OF_WEEK["5"]
  | 'thurs'          -> DAY_OF_WEEK["5"]
  | 'friday' 's'?    -> DAY_OF_WEEK["6"]
  | 'fri'            -> DAY_OF_WEEK["6"]
  | 'saturday' 's'?  -> DAY_OF_WEEK["7"]
  | 'sat'            -> DAY_OF_WEEK["7"]
  | 'weekend' 's'?   -> DAY_OF_WEEK["7"]
  | 'sunday' 's'?    -> DAY_OF_WEEK["1"]
  | 'sun'            -> DAY_OF_WEEK["1"]
  ;
  
day_of_month
  : 'first'                 -> DAY_OF_MONTH["1"]
  | '1st'                   -> DAY_OF_MONTH["1"]
  | 'second'                -> DAY_OF_MONTH["2"]
  | '2nd'                   -> DAY_OF_MONTH["2"]
  | 'third'                 -> DAY_OF_MONTH["3"]
  | '3rd'                   -> DAY_OF_MONTH["3"]
  | 'fourth'                -> DAY_OF_MONTH["4"]
  | '4th'                   -> DAY_OF_MONTH["4"]
  | 'fifth'                 -> DAY_OF_MONTH["5"]
  | '5th'                   -> DAY_OF_MONTH["5"]
  | 'sixth'                 -> DAY_OF_MONTH["6"]
  | '6th'                   -> DAY_OF_MONTH["6"]
  | 'seventh'               -> DAY_OF_MONTH["7"]
  | '7th'                   -> DAY_OF_MONTH["7"]
  | 'eighth'                -> DAY_OF_MONTH["8"]
  | '8th'                   -> DAY_OF_MONTH["8"]
  | 'ninth'                 -> DAY_OF_MONTH["9"]
  | '9th'                   -> DAY_OF_MONTH["9"]
  | 'tenth'                 -> DAY_OF_MONTH["10"]
  | '10th'                  -> DAY_OF_MONTH["10"]
  | 'eleventh'              -> DAY_OF_MONTH["11"]
  | '11th'                  -> DAY_OF_MONTH["11"]
  | 'twelfth'               -> DAY_OF_MONTH["12"]
  | '12th'                  -> DAY_OF_MONTH["12"]
  | 'thirteenth'            -> DAY_OF_MONTH["13"]
  | '13th'                  -> DAY_OF_MONTH["13"]
  | 'fourteenth'            -> DAY_OF_MONTH["14"]
  | '14th'                  -> DAY_OF_MONTH["14"]
  | 'fifteenth'             -> DAY_OF_MONTH["15"]
  | '15th'                  -> DAY_OF_MONTH["15"]
  | 'sixteenth'             -> DAY_OF_MONTH["16"]
  | '16th'                  -> DAY_OF_MONTH["16"]
  | 'seventeenth'           -> DAY_OF_MONTH["17"]
  | '17th'                  -> DAY_OF_MONTH["17"]
  | 'eighteenth'            -> DAY_OF_MONTH["18"]
  | '18th'                  -> DAY_OF_MONTH["18"]
  | 'nineteenth'            -> DAY_OF_MONTH["19"]
  | '19th'                  -> DAY_OF_MONTH["19"]
  | 'twentieth'             -> DAY_OF_MONTH["20"]
  | '20th'                  -> DAY_OF_MONTH["20"]
  | 'twenty' DASH? 'first'   -> DAY_OF_MONTH["21"]
  | '21st'                  -> DAY_OF_MONTH["21"]
  | 'twenty' DASH? 'second'  -> DAY_OF_MONTH["22"]
  | '22nd'                  -> DAY_OF_MONTH["22"]
  | 'twenty' DASH? 'third'   -> DAY_OF_MONTH["23"]
  | '23rd'                  -> DAY_OF_MONTH["23"]
  | 'twenty' DASH? 'fourth'  -> DAY_OF_MONTH["24"]
  | '24th'                  -> DAY_OF_MONTH["24"]
  | 'twenty' DASH? 'fifth'   -> DAY_OF_MONTH["25"]
  | '25th'                  -> DAY_OF_MONTH["25"]
  | 'twenty' DASH? 'sixth'   -> DAY_OF_MONTH["26"]
  | '26th'                  -> DAY_OF_MONTH["26"]
  | 'twenty' DASH? 'seventh' -> DAY_OF_MONTH["27"]
  | '27th'                  -> DAY_OF_MONTH["27"]
  | 'twenty' DASH? 'eighth'  -> DAY_OF_MONTH["28"]
  | '28th'                  -> DAY_OF_MONTH["28"]
  | 'twenty' DASH? 'ninth'   -> DAY_OF_MONTH["29"]
  | '29th'                  -> DAY_OF_MONTH["29"]
  | 'thirtieth'             -> DAY_OF_MONTH["30"]
  | '30th'                  -> DAY_OF_MONTH["30"]
  | 'thirty' DASH? 'first'   -> DAY_OF_MONTH["31"]
  | '31st'                  -> DAY_OF_MONTH["31"]
  | numeric_day_of_month
  ;

numeric_day_of_month
  : ONE_TO_TWELVE             -> DAY_OF_MONTH[$ONE_TO_TWELVE.text]
  | THIRTEEN_TO_TWENTY_FOUR   -> DAY_OF_MONTH[$THIRTEEN_TO_TWENTY_FOUR.text]
  | TWENTY_FIVE_TO_THIRTY_ONE -> DAY_OF_MONTH[$TWENTY_FIVE_TO_THIRTY_ONE.text]
  ;
  
year 
  : '\'' numeric_two_digit_year -> numeric_two_digit_year
  | ('in' 'the' year_date_span)? numeric_four_digit_year -> numeric_four_digit_year
  ;
  
// any two subsequent digits
numeric_year
  : numeric_four_digit_year
  | numeric_two_digit_year
  ;
  
numeric_two_digit_year
  : TWO_ZEROS                 -> YEAR[$TWO_ZEROS.text]
  | ONE_TO_TWELVE             -> YEAR[$ONE_TO_TWELVE.text]
  | THIRTEEN_TO_TWENTY_FOUR   -> YEAR[$THIRTEEN_TO_TWENTY_FOUR.text]
  | TWENTY_FIVE_TO_THIRTY_ONE -> YEAR[$TWENTY_FIVE_TO_THIRTY_ONE.text]
  | THIRTY_TWO_TO_FIFTY_NINE  -> YEAR[$THIRTY_TWO_TO_FIFTY_NINE.text]
  | SIXTY_TO_NINETY_NINE      -> YEAR[$SIXTY_TO_NINETY_NINE.text]
  ;
  
numeric_four_digit_year
  : THREE_DIGIT -> YEAR[$THREE_DIGIT.text]
  | FOUR_DIGIT  -> YEAR[$FOUR_DIGIT.text]
  ;
  
numeric_hours
  : TWO_ZEROS               -> HOURS[$TWO_ZEROS.text]
  | ONE_TO_TWELVE           -> HOURS[$ONE_TO_TWELVE.text]
  | THIRTEEN_TO_TWENTY_FOUR -> HOURS[$THIRTEEN_TO_TWENTY_FOUR.text]
  ;
  
numeric_minutes
  : TWO_ZEROS                 -> MINUTES["0"]
  | ONE_TO_TWELVE             -> MINUTES[$ONE_TO_TWELVE.text]
  | THIRTEEN_TO_TWENTY_FOUR   -> MINUTES[$THIRTEEN_TO_TWENTY_FOUR.text]
  | TWENTY_FIVE_TO_THIRTY_ONE -> MINUTES[$TWENTY_FIVE_TO_THIRTY_ONE.text]
  | THIRTY_TWO_TO_FIFTY_NINE  -> MINUTES[$THIRTY_TWO_TO_FIFTY_NINE.text]
  ;
  
// relaxed am or pm meridian indicator
meridian_indicator
  : 'am'   -> AM_PM["am"]
  | 'a.m.' -> AM_PM["am"]
  | 'a'    -> AM_PM["am"]
  | 'pm'   -> AM_PM["pm"]
  | 'p.m.' -> AM_PM["pm"]
  | 'p'    -> AM_PM["pm"]
  ;
  
today_or_tomorrow
  : 'today' -> ^(RELATIVE_DATE SEEK_DIRECTION[">"] INTEGER["0"])
  | tomorrow
  | 'yesterday' -> ^(RELATIVE_DATE SEEK_DIRECTION["<"] INTEGER["1"])
  
  // to humor the end of the world theorists
  | 'the'? 'day after ' tomorrow -> ^(RELATIVE_DATE SEEK_DIRECTION[">"] INTEGER["2"])
  | 'the'? 'day before yesterday' -> ^(RELATIVE_DATE SEEK_DIRECTION["<"] INTEGER["2"])
  ;
  
tomorrow
  : ('tomorow' | 'tomorrow' | 'tommorow' | 'tommorrow') 
    -> ^(RELATIVE_DATE SEEK_DIRECTION[">"] INTEGER["1"])
  ;
  
numeric_or_natural_integer
  : numeric_year -> INTEGER[$numeric_year.text]
  | 'one'        -> INTEGER["1"]
  | 'two'        -> INTEGER["2"]
  | 'three'      -> INTEGER["3"]
  | 'four'       -> INTEGER["4"]
  | 'five'       -> INTEGER["5"]
  | 'six'        -> INTEGER["6"]
  | 'seven'      -> INTEGER["7"]
  | 'eight'      -> INTEGER["8"]
  | 'nine'       -> INTEGER["9"]
  | 'ten'        -> INTEGER["10"]
  | 'eleven'     -> INTEGER["11"]
  | 'twelve'     -> INTEGER["12"]
  | 'thirteen'   -> INTEGER["13"]
  | 'fourteen'   -> INTEGER["14"]
  | 'fifteen'    -> INTEGER["15"]
  | 'sixteen'    -> INTEGER["16"]
  | 'seventeen'  -> INTEGER["17"]
  | 'eighteen'   -> INTEGER["18"]
  | 'nineteen'   -> INTEGER["19"]
  | 'twenty'     -> INTEGER["20"]
  ;
  
// two subsequent zeros
TWO_ZEROS
  : '0' '0'
  ;
  
// a number between 1 and 12, 0 prefix optional for numbers 1 through 9
ONE_TO_TWELVE
  : '0'? '1'..'9'
  | '1' '0'..'2'
  ;
  
// a number between 13 and 24, inclusive
THIRTEEN_TO_TWENTY_FOUR
  : '1' '3'..'9'
  | '2' '0'..'4'
  ;
  
// a number between 25 and 31, inclusive
TWENTY_FIVE_TO_THIRTY_ONE
  : '2' '5'..'9'
  | '3' '0'..'1'
  ;
  
// a number between 32 and 59, inclusive
THIRTY_TWO_TO_FIFTY_NINE
  : '3' '2'..'9'
  | '4'..'5' DIGIT 
  ;
  
// a number between 60 and 99, inclusive
SIXTY_TO_NINETY_NINE
  : '6'..'9' DIGIT
  ;
  
THREE_DIGIT
  : DIGIT DIGIT DIGIT
  ;
  
FOUR_DIGIT
  : DIGIT DIGIT DIGIT DIGIT
  ;
  
separator
  : DASH
  | SLASH
  ;
  
DASH
  : '-'
  ;
  
SLASH
  : '/'
  ;
  
WHITE_SPACE
  : (' ' | '\t' | '\n' | '\r')+ { $channel=HIDDEN; }
  ;

fragment DIGIT
  : '0'..'9'
  ;