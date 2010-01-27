grammar Date;

options {
  output=AST;
}

tokens {
  DATE_TIME;
  RELATIVE_DATE;
  EXPLICIT_DATE;
  
  EXPLICIT_TIME;
  
  // a meridian indicator (am or pm)
  AM_PM;
  
  // represents a month (1 - 12)
  MONTH;
  
  // represents a day of the week (1-7)
  DAY_OF_WEEK;
  
  // represents a day of the month (1-31)
  DAY_OF_MONTH;
  
  // represents a span of time (day, week, month, or year)
  SPAN;
  
  // represents a year (0 - 9999)
  YEAR;
  
  // represents a year's era (ad or bc)
  ERA;
  
  INTEGER;
  
  // the direction to seek (< or >)
  SEEK_DIRECTION;
  
  // the seek type (by_day, by_week)
  SEEK_TYPE;
}

@header { package com.natty.parse; }

@lexer::header { package com.natty.parse; }

datetime 
  // time first: 10 am next wednesday
  : time? 'on'? date -> ^(DATE_TIME date time?)
  
  // date first: tomorrow at noon
  | date 'at'? time -> ^(DATE_TIME date time)
  
  // time only, we use today for the date
  | time -> ^(DATE_TIME ^(RELATIVE_DATE SEEK_DIRECTION[">"] INTEGER["0"]) time)
  ;

date
  : relative_date 
  | explicit_date
  ;
  
time
  : explicit_time
  ;

//an explicit date with a relative year when omitted.
explicit_date
  // January 2, 1980
  : month day ','? numeric_year? -> ^(EXPLICIT_DATE month day numeric_year?)
  
  // 28th of February 1979
  | day 'of' month ','? numeric_year? -> ^(EXPLICIT_DATE month day numeric_year?)
  
  // year last 
  // 10/10/2009, 10-10-09, etc.
  | numeric_month date_separator numeric_day date_separator numeric_year -> 
    ^(EXPLICIT_DATE numeric_month numeric_day numeric_year)
  
  // year first
  // 1979-2-28, 02/28, etc.
  | (numeric_year date_separator)? numeric_month date_separator numeric_day -> 
    ^(EXPLICIT_DATE numeric_month numeric_day numeric_year?)
  ;
  
//a date relative to the current date
relative_date
  // today, tomorrow, yesterday, day after tomorrow
  : today_or_tomorrow
  
  // next monday, this upcoming thursday, next week, last tuesday, past wed
  | relative_prefix prefixable_target -> ^(RELATIVE_DATE relative_prefix prefixable_target)
  
  // 6 days from now, seven days ago
  | number prefixable_target relative_suffix -> ^(RELATIVE_DATE relative_suffix number prefixable_target)
  ;
  
// an explicit time with implicit minutes when omitted 
explicit_time 
  // no minutes with optional indicator: 10 a, 12pm, 10
  : hours meridian_indicator? -> ^(EXPLICIT_TIME hours INTEGER["0"] meridian_indicator?)
  
  //  separator and minutes with optional indicator: 10:05 a, 12:10 pm, 10:00
  | hours ':' minutes meridian_indicator? -> ^(EXPLICIT_TIME hours minutes meridian_indicator?)
  
  | time_identifier -> time_identifier
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

date_separator
  : '-'
  | '/'
  ;
  
relative_prefix
  : 'this'? 'last'     -> SEEK_DIRECTION["<"] SEEK_TYPE["by_week"] INTEGER["1"]
  | 'this'? 'next'     -> SEEK_DIRECTION[">"] SEEK_TYPE["by_week"] INTEGER["1"]
  | 'this'? 'past'     -> SEEK_DIRECTION["<"] SEEK_TYPE["by_day"] INTEGER["1"]
  | 'this'? 'coming'   -> SEEK_DIRECTION[">"] SEEK_TYPE["by_day"] INTEGER["1"]
  | 'this'? 'upcoming' -> SEEK_DIRECTION[">"] SEEK_TYPE["by_day"] INTEGER["1"]
  | 'in' number        -> SEEK_DIRECTION[">"] SEEK_TYPE["by_day"] number
  ;
  
relative_suffix
  : 'from now' -> SEEK_DIRECTION[">"] SEEK_TYPE["by_day"]
  | 'ago'      -> SEEK_DIRECTION["<"] SEEK_TYPE["by_day"]
  ;
  
prefixable_target
  : day_of_week 
  | date_span
  ;
  
date_span
  : 'day' 's'?           -> SPAN["day"]
  | 'week' 's'?          -> SPAN["week"]
  | 'month' 's'?         -> SPAN["month"]
  | YEAR_DATE_SPAN 's'?  -> SPAN["year"]
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
  
// a regular language day of the month
day
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
  | 'twenty' '-'? 'first'   -> DAY_OF_MONTH["21"]
  | '21st'                  -> DAY_OF_MONTH["21"]
  | 'twenty' '-'? 'second'  -> DAY_OF_MONTH["22"]
  | '22nd'                  -> DAY_OF_MONTH["22"]
  | 'twenty' '-'? 'third'   -> DAY_OF_MONTH["23"]
  | '23rd'                  -> DAY_OF_MONTH["23"]
  | 'twenty' '-'? 'fourth'  -> DAY_OF_MONTH["24"]
  | '24th'                  -> DAY_OF_MONTH["24"]
  | 'twenty' '-'? 'fifth'   -> DAY_OF_MONTH["25"]
  | '25th'                  -> DAY_OF_MONTH["25"]
  | 'twenty' '-'? 'sixth'   -> DAY_OF_MONTH["26"]
  | '26th'                  -> DAY_OF_MONTH["26"]
  | 'twenty' '-'? 'seventh' -> DAY_OF_MONTH["27"]
  | '27th'                  -> DAY_OF_MONTH["27"]
  | 'twenty' '-'? 'eighth'  -> DAY_OF_MONTH["28"]
  | '28th'                  -> DAY_OF_MONTH["28"]
  | 'twenty' '-'? 'ninth'   -> DAY_OF_MONTH["29"]
  | '29th'                  -> DAY_OF_MONTH["29"]
  | 'thirtieth'             -> DAY_OF_MONTH["30"]
  | '30th'                  -> DAY_OF_MONTH["30"]
  | 'thirty' '-'? 'first'   -> DAY_OF_MONTH["31"]
  | '31st'                  -> DAY_OF_MONTH["31"]
  | numeric_day
  ;

// a regular language, possibly shortened month name
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
  
// common day identifiers (today, tomorrow, etc)
today_or_tomorrow
  : 'today' -> ^(RELATIVE_DATE SEEK_DIRECTION[">"] INTEGER["0"])
  | tomorrow
  
  // yesterday
  | 'yesterday' -> ^(RELATIVE_DATE SEEK_DIRECTION["<"] INTEGER["1"])
  
  // to humor the end of the world theorists
  | 'the'? 'day after ' tomorrow -> ^(RELATIVE_DATE SEEK_DIRECTION[">"] INTEGER["2"])
  | 'the'? 'day before yesterday' -> ^(RELATIVE_DATE SEEK_DIRECTION["<"] INTEGER["2"])
  ;
  
tomorrow
  : ('tomorow' | 'tomorrow' | 'tommorow' | 'tommorrow') 
    -> ^(RELATIVE_DATE SEEK_DIRECTION[">"] INTEGER["1"])
  ;

// common time identifiers (noon, midnight, etc)
time_identifier
  : 'midnight' -> ^(EXPLICIT_TIME INTEGER["12"] INTEGER["0"] AM_PM["am"])
  | 'noon' -> ^(EXPLICIT_TIME INTEGER["12"] INTEGER["0"] AM_PM["pm"])
  ;

// a number between 1 and 31, 0 prefix optional for numbers 1 through 9
numeric_day
  : ONE_TO_TWELVE             -> DAY_OF_MONTH[$ONE_TO_TWELVE.text]
  | THIRTEEN_TO_TWENTY_FOUR   -> DAY_OF_MONTH[$THIRTEEN_TO_TWENTY_FOUR.text]
  | TWENTY_FIVE_TO_THIRTY_ONE -> DAY_OF_MONTH[$TWENTY_FIVE_TO_THIRTY_ONE.text]
  ;

// a number between 1 and 12, 0 prefix optional for numbers 1 through 9
numeric_month
  : ONE_TO_TWELVE -> MONTH[$ONE_TO_TWELVE.text]
  ;
  
// a number between 1 and 9999, 0 prefix(es) optional for numbers 1 through 999.
// additionally, two digit years may have an optional ' prefix, and four digit 
// years may have an optional ad/bc suffux
numeric_year
  : '\''? up_to_two_digits                              -> YEAR[$up_to_two_digits.text]
  | ('in' 'the' YEAR_DATE_SPAN)? up_to_four_digits era? -> YEAR[$up_to_four_digits.text] era?
  ;

era
  : 'ad' -> ERA["ad"]
  | 'a.d.' -> ERA["ad"]
  | 'bc' -> ERA["bc"]
  | 'b.c.' -> ERA["bc"]
  ;
  
hours
  : TWO_ZEROS -> INTEGER[$TWO_ZEROS.text]
  | ONE_TO_TWELVE -> INTEGER[$ONE_TO_TWELVE.text]
  | THIRTEEN_TO_TWENTY_FOUR -> INTEGER[$THIRTEEN_TO_TWENTY_FOUR.text]
  ;
  
minutes
  : TWO_ZEROS                 -> INTEGER["0"]
  | ONE_TO_TWELVE             -> INTEGER[$ONE_TO_TWELVE.text]
  | THIRTEEN_TO_TWENTY_FOUR   -> INTEGER[$THIRTEEN_TO_TWENTY_FOUR.text]
  | TWENTY_FIVE_TO_THIRTY_ONE -> INTEGER[$TWENTY_FIVE_TO_THIRTY_ONE.text]
  | THIRTY_TWO_TO_FIFTY_NINE  -> INTEGER[$THIRTY_TWO_TO_FIFTY_NINE.text]
  ;
  
// any two subsequnt digits
up_to_two_digits
  : TWO_ZEROS                 -> INTEGER[$TWO_ZEROS.text]
  | ONE_TO_TWELVE             -> INTEGER[$ONE_TO_TWELVE.text]
  | THIRTEEN_TO_TWENTY_FOUR   -> INTEGER[$THIRTEEN_TO_TWENTY_FOUR.text]
  | TWENTY_FIVE_TO_THIRTY_ONE -> INTEGER[$TWENTY_FIVE_TO_THIRTY_ONE.text]
  | THIRTY_TWO_TO_FIFTY_NINE  -> INTEGER[$THIRTY_TWO_TO_FIFTY_NINE.text]
  | SIXTY_TO_NINETY_NINE      -> INTEGER[$SIXTY_TO_NINETY_NINE.text]
  ;
  
up_to_four_digits
  : up_to_two_digits
  | THREE_DIGITS -> INTEGER[$THREE_DIGITS.text]
  | FOUR_DIGITS  -> INTEGER[$FOUR_DIGITS.text]
  ;
  
number
  : up_to_four_digits                 -> INTEGER[$up_to_four_digits.text]
  | digits=(DIGIT DIGIT DIGIT DIGIT+) -> INTEGER[$digits.text]
  | number_string 
  ;
  
number_string
  : 'one'       -> INTEGER["1"]
  | 'two'       -> INTEGER["2"]
  | 'three'     -> INTEGER["3"]
  | 'four'      -> INTEGER["4"]
  | 'five'      -> INTEGER["5"]
  | 'six'       -> INTEGER["6"]
  | 'seven'     -> INTEGER["7"]
  | 'eight'     -> INTEGER["8"]
  | 'nine'      -> INTEGER["9"]
  | 'ten'       -> INTEGER["10"]
  | 'eleven'    -> INTEGER["11"]
  | 'twelve'    -> INTEGER["12"]
  | 'thirteen'  -> INTEGER["13"]
  | 'fourteen'  -> INTEGER["14"]
  | 'fifteen'   -> INTEGER["15"]
  | 'sixteen'   -> INTEGER["16"]
  | 'seventeen' -> INTEGER["17"]
  | 'eighteen'  -> INTEGER["18"]
  | 'nineteen'  -> INTEGER["19"]
  | 'twenty'    -> INTEGER["20"]
  ;
  
YEAR_DATE_SPAN
  : 'year'  
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
  
// any four subsequent digits
FOUR_DIGITS
  : DIGIT DIGIT DIGIT DIGIT
  ;
  
// any three subsequent digits
THREE_DIGITS
  : DIGIT DIGIT DIGIT
  ;
  
WHITE_SPACE
  : (' ' | '\t' | '\n' | '\r')+ { $channel=HIDDEN; }
  ;
  
fragment DIGIT
  : '0'..'9'
  ;