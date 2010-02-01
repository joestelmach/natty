grammar Date;

options {
  output=AST;
}

tokens {
  INTEGER;
  HOURS;
  MINUTES;
  AM_PM;
  SPAN;
  MONTH_OF_YEAR;
  DAY_OF_WEEK;
  DAY_OF_MONTH;
  YEAR_OF;
  SEEK_DIRECTION;
  SEEK_TYPE;
  EXPLICIT_TIME;
  EXPLICIT_DATE;
  RELATIVE_DATE;
  DATE_TIME;
}

@header { package com.natty.parse; }
@lexer::header { package com.natty.parse; }

datetime 
  options{backtrack=true;}
  : date AT? time? -> ^(DATE_TIME date time?)
  | time ON? date -> ^(DATE_TIME date time)
  | time -> ^(DATE_TIME ^(RELATIVE_DATE SEEK_DIRECTION[">"] INTEGER["0"]) time)
  ;
  
date
  : date_prefix relative_date -> ^(RELATIVE_DATE date_prefix relative_date)
  | date_prefix explicit_date -> ^(RELATIVE_DATE date_prefix explicit_date)
  | relative_date
  | explicit_date
  ;
  
time 
  : explicit_time
  ;

relative_date
  : named_relative_date
  
  // a modifiable target with no prefix
  | modifiable_target 
    -> ^(RELATIVE_DATE SEEK_DIRECTION[">"] SEEK_TYPE["by_day"] INTEGER["1"] modifiable_target)
  
  // a modifiable target with a prefix
  | target_prefix modifiable_target 
    -> ^(RELATIVE_DATE target_prefix modifiable_target)
    
  // a modifiable target with a suffix 
  | spelled_or_numeric_1_to_31 modifiable_target target_suffix 
    -> ^(RELATIVE_DATE target_suffix spelled_or_numeric_1_to_31 modifiable_target)
  ;
  
named_relative_date
  : TODAY     -> ^(RELATIVE_DATE SEEK_DIRECTION[">"] INTEGER["0"])
  | TOMORROW  -> ^(RELATIVE_DATE SEEK_DIRECTION[">"] INTEGER["1"])
  | YESTERDAY -> ^(RELATIVE_DATE SEEK_DIRECTION["<"] INTEGER["1"])
  ;

// an explicit date with month, day, and year
explicit_date
  options{backtrack=true;}
  : integer_1_to_12 date_separator integer_1_to_31 (date_separator four_digits)?
    -> ^(EXPLICIT_DATE integer_1_to_31 integer_1_to_31 four_digits?)
    
  | four_digits date_separator integer_1_to_12 date_separator integer_1_to_31
    -> ^(EXPLICIT_DATE integer_1_to_12 integer_1_to_31 four_digits)
    
  | month day_of_month (','? year)? 
    -> ^(EXPLICIT_DATE month day_of_month year?) 
  
  | day_of_month 'of'? month (','? year)? 
    -> ^(EXPLICIT_DATE month day_of_month year?) 
  ;
  
// an explicit time with implicit minutes when omitted 
explicit_time 
  //  separator and minutes with optional indicator: 10:05 a, 12:10 pm, 10:00
  : hours (':' minutes? meridian_indicator?)?
    -> ^(EXPLICIT_TIME hours minutes? meridian_indicator?)
  
  | time_identifier
  ;
  
// a prefix that should be valid before any date, relative or explicit
date_prefix
  : THE? DAY AFTER                             -> SEEK_DIRECTION[">"] INTEGER["1"]
  | spelled_or_numeric_1_to_31 DAY 's'? AFTER  -> SEEK_DIRECTION[">"] spelled_or_numeric_1_to_31
  | THE? DAY BEFORE                            -> SEEK_DIRECTION["<"] INTEGER["1"]
  | spelled_or_numeric_1_to_31 DAY 's'? BEFORE -> SEEK_DIRECTION["<"] spelled_or_numeric_1_to_31
  ;
  
// a prefix that is valid before any modifiable_target
target_prefix
  : THIS           -> SEEK_DIRECTION[">"] SEEK_TYPE["by_day"] INTEGER["1"]
  | THIS? LAST     -> SEEK_DIRECTION["<"] SEEK_TYPE["by_week"] INTEGER["1"]
  | THIS? PAST     -> SEEK_DIRECTION["<"] SEEK_TYPE["by_day"] INTEGER["1"]
  | THIS? NEXT     -> SEEK_DIRECTION[">"] SEEK_TYPE["by_week"] INTEGER["1"]
  | THIS? COMING   -> SEEK_DIRECTION[">"] SEEK_TYPE["by_day"] INTEGER["1"]
  | THIS? UPCOMING -> SEEK_DIRECTION[">"] SEEK_TYPE["by_day"] INTEGER["1"]
  | IN? spelled_or_numeric_1_to_31 -> SEEK_DIRECTION[">"] SEEK_TYPE["by_day"] spelled_or_numeric_1_to_31
  ;
  
// a suffix that is valid after any modifiable_target
target_suffix
  : FROM_NOW -> SEEK_DIRECTION[">"] SEEK_TYPE["by_day"]
  | AGO      -> SEEK_DIRECTION["<"] SEEK_TYPE["by_day"]
  ;
  
// targets that are able to be prefixed or suffixed
modifiable_target
  : day_of_week 
  | date_span
  | month
  ;
  
date_span
  : DAY   -> SPAN["day"]
  | WEEK  -> SPAN["week"]
  | MONTH -> SPAN["month"]
  | YEAR  -> SPAN["year"]
  ;
  
month
  : JANUARY   -> ^(MONTH_OF_YEAR INTEGER["1"])
  | FEBRUARY  -> ^(MONTH_OF_YEAR INTEGER["2"])
  | MARCH     -> ^(MONTH_OF_YEAR INTEGER["3"])
  | APRIL     -> ^(MONTH_OF_YEAR INTEGER["4"])
  | MAY       -> ^(MONTH_OF_YEAR INTEGER["5"])
  | JUNE      -> ^(MONTH_OF_YEAR INTEGER["6"])
  | JULY      -> ^(MONTH_OF_YEAR INTEGER["7"])
  | AUGUST    -> ^(MONTH_OF_YEAR INTEGER["8"])
  | SEPTEMBER -> ^(MONTH_OF_YEAR INTEGER["9"])
  | OCTOBER   -> ^(MONTH_OF_YEAR INTEGER["10"])
  | NOVEMBER  -> ^(MONTH_OF_YEAR INTEGER["11"])
  | DECEMBER  -> ^(MONTH_OF_YEAR INTEGER["12"])
  ;
  
day_of_month
  : spelled_or_numeric_1_to_31 -> ^(DAY_OF_MONTH spelled_or_numeric_1_to_31)
  | spelled_sequence_1_to_31   -> ^(DAY_OF_MONTH spelled_sequence_1_to_31) 
  ;
  
day_of_week
  : SUNDAY    -> ^(DAY_OF_WEEK INTEGER["1"])
  | MONDAY    -> ^(DAY_OF_WEEK INTEGER["2"])
  | TUESDAY   -> ^(DAY_OF_WEEK INTEGER["3"])
  | WEDNESDAY -> ^(DAY_OF_WEEK INTEGER["4"])
  | THURSDAY  -> ^(DAY_OF_WEEK INTEGER["5"])
  | FRIDAY    -> ^(DAY_OF_WEEK INTEGER["6"])
  | SATURDAY  -> ^(DAY_OF_WEEK INTEGER["7"])
  ;
  
year
  options{backtrack=true;}
  : '\''? integer_0_to_99      -> ^(YEAR_OF INTEGER[$integer_0_to_99.text])
  | (IN THE YEAR)? four_digits -> ^(YEAR_OF INTEGER[$four_digits.text])
  ;
  
date_separator
  : DASH
  | SLASH
  ;

hours
  : integer_0_to_23 -> ^(HOURS integer_0_to_23)
  ;
  
minutes
  : integer_0_to_59 -> ^(MINUTES integer_0_to_59)
  ;
  
meridian_indicator
  : AM -> AM_PM["am"]
  | PM -> AM_PM["pm"]
  ;
  
// common time identifiers (noon, midnight, etc)
time_identifier
  : MIDNIGHT -> ^(EXPLICIT_TIME ^(HOURS INTEGER["12"]) AM_PM["am"])
  | NOON     -> ^(EXPLICIT_TIME ^(HOURS INTEGER["12"]) AM_PM["pm"])
  ;
  
// a number between 1 and 31 spelled-out (one, twenty-eight, etc.)
spelled_number_1_to_31
  : ONE        -> INTEGER["1"]
  | TWO        -> INTEGER["2"]
  | THREE      -> INTEGER["3"]
  | FOUR       -> INTEGER["4"]
  | FIVE       -> INTEGER["5"]
  | SIX        -> INTEGER["6"]
  | SEVEN      -> INTEGER["7"]
  | EIGHT      -> INTEGER["8"]
  | NINE       -> INTEGER["9"]
  | TEN        -> INTEGER["10"]
  | ELEVEN     -> INTEGER["11"]
  | TWELVE     -> INTEGER["12"]
  | THIRTEEN   -> INTEGER["13"]
  | FOURTEEN   -> INTEGER["14"]
  | FIFTEEN    -> INTEGER["15"]
  | SIXTEEN    -> INTEGER["16"]
  | SEVENTEEN  -> INTEGER["17"]
  | EIGHTEEN   -> INTEGER["18"]
  | NINETEEN   -> INTEGER["19"]
  | TWENTY     -> INTEGER["20"]
  | TWENTY DASH? ONE   -> INTEGER["21"]
  | TWENTY DASH? TWO   -> INTEGER["22"]
  | TWENTY DASH? THREE -> INTEGER["23"]
  | TWENTY DASH? FOUR  -> INTEGER["24"]
  | TWENTY DASH? FIVE  -> INTEGER["25"]
  | TWENTY DASH? SIX   -> INTEGER["26"]
  | TWENTY DASH? SEVEN -> INTEGER["27"]
  | TWENTY DASH? EIGHT -> INTEGER["28"]
  | TWENTY DASH? NINE  -> INTEGER["29"]
  | THIRTY             -> INTEGER["30"]
  | THIRTY DASH? ONE   -> INTEGER["31"]
  ;
  
spelled_or_numeric_1_to_31
  : spelled_number_1_to_31
  | integer_1_to_31
  ;
  
// a number in sequence between 1 and 31, either spelled-out
// or suffixed (first, 2nd, twenty-first, etc)
spelled_sequence_1_to_31
  : FIRST       -> INTEGER["1"]
  | SECOND      -> INTEGER["2"]
  | THIRD       -> INTEGER["3"]
  | FOURTH      -> INTEGER["4"]
  | FIFTH       -> INTEGER["5"]
  | SIXTH       -> INTEGER["6"]
  | SEVENTH     -> INTEGER["7"]
  | EIGHTH      -> INTEGER["8"]
  | NINTH       -> INTEGER["9"]
  | TENTH       -> INTEGER["10"]
  | ELEVENTH    -> INTEGER["11"]
  | TWELFTH     -> INTEGER["12"]
  | THIRTEENTH  -> INTEGER["13"]
  | FOURTEENTH  -> INTEGER["14"]
  | FIFTEENTH   -> INTEGER["15"]
  | SIXTEENTH   -> INTEGER["16"]
  | SEVENTEENTH -> INTEGER["17"]
  | EIGHTEENTH  -> INTEGER["18"]
  | NINETEENTH  -> INTEGER["19"]
  | TWENTIETH   -> INTEGER["20"]
  | (TWENTY_FIRST   | (TWENTY DASH? FIRST))   -> INTEGER["21"]
  | (TWENTY_SECOND  | (TWENTY DASH? SECOND))  -> INTEGER["22"]
  | (TWENTY_THIRD   | (TWENTY DASH? THIRD))   -> INTEGER["23"]
  | (TWENTY_FOURTH  | (TWENTY DASH? FOURTH))  -> INTEGER["24"]
  | (TWENTY_FIFTH   | (TWENTY DASH? FIFTH))   -> INTEGER["25"]
  | (TWENTY_SIXTH   | (TWENTY DASH? SIXTH))   -> INTEGER["26"]
  | (TWENTY_SEVENTH | (TWENTY DASH? SEVENTH)) -> INTEGER["27"]
  | (TWENTY_EIGHTH  | (TWENTY DASH? EIGHTH))  -> INTEGER["28"]
  | (TWENTY_NINTH   | (TWENTY DASH? NINTH))   -> INTEGER["29"]
  | THIRTIETH                                 -> INTEGER["30"]
  | (THIRTY_FIRST   | (THIRTY DASH? FIRST))   -> INTEGER["31"]
  ;
  
// any 4 subsequent digits
four_digits
  : integer_0_to_99
  | THREE_DIGIT -> INTEGER[$THREE_DIGIT.text]
  | FOUR_DIGIT  -> INTEGER[$FOUR_DIGIT.text]
  ;
  
integer_1_to_12
  : ONE_TO_TWELVE -> INTEGER[$integer_1_to_12.text]
  ;
  
// number between 0 and 23 with an optional 0 prefix for numbers 0-9
integer_0_to_23
  : UP_TO_TWO_ZEROS          -> INTEGER[$UP_TO_TWO_ZEROS.text]
  | ONE_TO_TWELVE            -> INTEGER[$ONE_TO_TWELVE.text]
  | THIRTEEN_TO_TWENTY_THREE -> INTEGER[$THIRTEEN_TO_TWENTY_THREE.text]
  ;
  
// number between 0 and 59 with an optional 0 prefix for numbers 0-9
integer_0_to_59
  : UP_TO_TWO_ZEROS           -> INTEGER["0"]
  | ONE_TO_TWELVE             -> INTEGER[$ONE_TO_TWELVE.text]
  | THIRTEEN_TO_TWENTY_THREE  -> INTEGER[$THIRTEEN_TO_TWENTY_THREE.text]
  | TWENTY_FOUR_TO_THIRTY_ONE -> INTEGER[$TWENTY_FOUR_TO_THIRTY_ONE.text]
  | THIRTY_TWO_TO_FIFTY_NINE  -> INTEGER[$THIRTY_TWO_TO_FIFTY_NINE.text]
  ;
  
// number between 0 and 99 with an optional 0 prefix for numbers 0-9
integer_0_to_99
  : UP_TO_TWO_ZEROS           -> INTEGER[$UP_TO_TWO_ZEROS.text]
  | ONE_TO_TWELVE             -> INTEGER[$ONE_TO_TWELVE.text]
  | THIRTEEN_TO_TWENTY_THREE  -> INTEGER[$THIRTEEN_TO_TWENTY_THREE.text]
  | TWENTY_FOUR_TO_THIRTY_ONE -> INTEGER[$TWENTY_FOUR_TO_THIRTY_ONE.text]
  | THIRTY_TWO_TO_FIFTY_NINE  -> INTEGER[$THIRTY_TWO_TO_FIFTY_NINE.text]
  | SIXTY_TO_NINETY_NINE      -> INTEGER[$SIXTY_TO_NINETY_NINE.text]
  ;
  
// number between 1 and 31 with an optional 0 prefix for numbers 0-9
integer_1_to_31
  : ONE_TO_TWELVE             -> INTEGER[$ONE_TO_TWELVE.text]
  | THIRTEEN_TO_TWENTY_THREE  -> INTEGER[$THIRTEEN_TO_TWENTY_THREE.text]
  | TWENTY_FOUR_TO_THIRTY_ONE -> INTEGER[$TWENTY_FOUR_TO_THIRTY_ONE.text]
  ;
  
// time identifiers
MIDNIGHT : 'midnight' | 'mid-night';
NOON     : 'noon';

IN  : 'in';
THE : 'the';
AT  : 'at';
ON  : 'on';

// seek directions
THIS     : 'this';
AFTER    : 'after';
BEFORE   : 'before';
LAST     : 'last';
PAST     : 'past';
NEXT     : 'next';
COMING   : 'coming';
UPCOMING : 'upcoming';
FROM_NOW : 'from now';
AGO      : 'ago';

// months
JANUARY   : 'january'   | 'jan';
FEBRUARY  : 'february'  | 'feb';
MARCH     : 'march'     | 'mar';
APRIL     : 'april'     | 'apr';
MAY       : 'may';
JUNE      : 'june'      | 'jun';
JULY      : 'july'      | 'jul';
AUGUST    : 'august'    | 'aug';
SEPTEMBER : 'september' | 'sep' | 'sept';
OCTOBER   : 'october'   | 'oct';
NOVEMBER  : 'november'  | 'nov';
DECEMBER  : 'december'  | 'dec';
  
// days of the week
SUNDAY    : 'sunday'    | 'sundays'    | 'sun';
MONDAY    : 'monday'    | 'mondays'    | 'mon';
TUESDAY   : 'tuesday'   | 'tuesdays'   | 'tues'     | 'tue';
WEDNESDAY : 'wednesday' | 'wednesdays' | 'wed';
THURSDAY  : 'thursday'  | 'thursdays'  | 'thur'     | 'thu';
FRIDAY    : 'friday'    | 'fridays'    | 'fri';
SATURDAY  : 'saturday'  | 'saturdays'  | 'sat';

// named days
TODAY     : 'today';
TOMORROW  : 'tomorow'   | 'tomorrow'   | 'tommorow' | 'tommorrow';
YESTERDAY : 'yesterday';
  
// meridian indicators
AM : 'am' | 'a.m.' | 'a';
PM : 'pm' | 'p.m.' | 'p';
  
//date units
DAY   : 'day'   | 'days' ;
WEEK  : 'week'  | 'weeks' ;
MONTH : 'month' | 'months' ;
YEAR  : 'year'  | 'years' ;
  
// spelled out numbers
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

// sequence numbers
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

// two subsequent zeros
UP_TO_TWO_ZEROS : '0'? '0' ;
  
// a number between 1 and 12, 0 prefix optional for numbers 1 through 9
ONE_TO_TWELVE
  : '0'? '1'..'9'
  | '1' '0'..'2'
  ;
  
// a number between 13 and 24, inclusive
THIRTEEN_TO_TWENTY_THREE
  : '1' '3'..'9'
  | '2' '0'..'3'
  ;
  
// a number between 25 and 31, inclusive
TWENTY_FOUR_TO_THIRTY_ONE
  : '2' '4'..'9'
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
  
DASH : '-' ;
SLASH : '/' ;
  
WHITE_SPACE
  : (' ' | '\t' | '\n' | '\r')+ { $channel=HIDDEN; }
  ;

fragment DIGIT
  : '0'..'9'
  ;