grammar Date;

options {
  output=AST;
}

tokens {
  INTEGER;
  HOURS;
  MINUTES;
  AM_PM;
  DAY_OF_MONTH;
  DAY_OF_WEEK;
  SPAN;
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
    
  | spelled_or_numeric_1_to_31 modifiable_target relative_suffix 
    -> ^(RELATIVE_DATE relative_suffix spelled_or_numeric_1_to_31 modifiable_target)
  ;

// an explicit date with month, day, and year
explicit_date
  options{backtrack=true;}
  : numeric_1_to_12 date_separator numeric_1_to_31 (date_separator four_digits)?
    -> ^(EXPLICIT_DATE numeric_1_to_31 numeric_1_to_31 four_digits?)
    
  | four_digits date_separator numeric_1_to_12 date_separator numeric_1_to_31
    -> ^(EXPLICIT_DATE numeric_1_to_12 numeric_1_to_31 four_digits)
    
  | month day_of_month (','? year)? 
    -> ^(EXPLICIT_DATE month day_of_month year?) 
  
  | day_of_month 'of'? month (','? year)? 
    -> ^(EXPLICIT_DATE month day_of_month year?) 
  ;
  
// an explicit time with implicit minutes when omitted 
explicit_time 
  // no minutes with optional indicator: 10 a, 12pm, 10
  : numeric_0_to_23 meridian_indicator? 
    -> ^(EXPLICIT_TIME numeric_0_to_23 MINUTES["0"] meridian_indicator?)
  
  //  separator and minutes with optional indicator: 10:05 a, 12:10 pm, 10:00
  | numeric_0_to_23 ':' numeric_0_to_59 meridian_indicator? 
    -> ^(EXPLICIT_TIME numeric_0_to_23 numeric_0_to_59 meridian_indicator?)
  
  | time_identifier
  ;
  
month
  : JANUARY   -> MONTH["1"]
  | FEBRUARY  -> MONTH["2"]
  | MARCH     -> MONTH["3"]
  | APRIL     -> MONTH["4"]
  | MAY       -> MONTH["5"]
  | JUNE      -> MONTH["6"]
  | JULY      -> MONTH["7"]
  | AUGUST    -> MONTH["8"]
  | SEPTEMBER -> MONTH["9"]
  | OCTOBER   -> MONTH["10"]
  | NOVEMBER  -> MONTH["11"]
  | DECEMBER  -> MONTH["12"]
  ;
  
day_of_month
  : spelled_number_1_to_31    -> DAY_OF_MONTH[$spelled_number_1_to_31.text]
  | spelled_sequence_1_to_31   -> DAY_OF_MONTH[$spelled_sequence_1_to_31.text]
  | numeric_1_to_31 -> DAY_OF_MONTH[$numeric_1_to_31.text]
  ;
  
day_of_week
  : SUNDAY    -> DAY_OF_WEEK["1"]
  | MONDAY    -> DAY_OF_WEEK["2"]
  | TUESDAY   -> DAY_OF_WEEK["3"]
  | WEDNESDAY -> DAY_OF_WEEK["4"]
  | THURSDAY  -> DAY_OF_WEEK["5"]
  | FRIDAY    -> DAY_OF_WEEK["6"]
  | SATURDAY  -> DAY_OF_WEEK["7"]
  ;
  
today_or_tomorrow
  : TODAY -> ^(RELATIVE_DATE SEEK_DIRECTION[">"] INTEGER["0"])
  | TOMORROW -> ^(RELATIVE_DATE SEEK_DIRECTION[">"] INTEGER["1"])
  | YESTERDAY -> ^(RELATIVE_DATE SEEK_DIRECTION["<"] INTEGER["1"])
  
  // to humor the end of the world theorists
  | 'the'? 'day after ' TOMORROW -> ^(RELATIVE_DATE SEEK_DIRECTION[">"] INTEGER["2"])
  | 'the'? 'day before ' YESTERDAY -> ^(RELATIVE_DATE SEEK_DIRECTION["<"] INTEGER["2"])
  ;
  
date_span
  : DAY   -> SPAN["day"]
  | WEEK  -> SPAN["week"]
  | MONTH -> SPAN["month"]
  | YEAR  -> SPAN["year"]
  ;
  
// common time identifiers (noon, midnight, etc)
time_identifier
  : MIDNIGHT -> ^(EXPLICIT_TIME INTEGER["12"] INTEGER["0"] AM_PM["am"])
  | NOON     -> ^(EXPLICIT_TIME INTEGER["12"] INTEGER["0"] AM_PM["pm"])
  ;
  
// targets that are able to be prefixed or suffixed
modifiable_target
  : day_of_week 
  | date_span
  | month
  ;
  
relative_prefix
  : 'this'? 'last'     -> SEEK_DIRECTION["<"] SEEK_TYPE["by_week"] INTEGER["1"]
  | 'this'? 'next'     -> SEEK_DIRECTION[">"] SEEK_TYPE["by_week"] INTEGER["1"]
  | 'this'? 'past'     -> SEEK_DIRECTION["<"] SEEK_TYPE["by_day"] INTEGER["1"]
  | 'this'? 'coming'   -> SEEK_DIRECTION[">"] SEEK_TYPE["by_day"] INTEGER["1"]
  | 'this'? 'upcoming' -> SEEK_DIRECTION[">"] SEEK_TYPE["by_day"] INTEGER["1"]
  //| 'in'? numeric_or_natural_integer -> SEEK_DIRECTION[">"] SEEK_TYPE["by_day"] numeric_or_natural_integer
  ;
  
relative_suffix
  : 'from now' -> SEEK_DIRECTION[">"] SEEK_TYPE["by_day"]
  | 'ago'      -> SEEK_DIRECTION["<"] SEEK_TYPE["by_day"]
  ;
  
year
  options{backtrack=true;}
  : '\''? numeric_0_to_99 -> YEAR[$numeric_0_to_99.text]
  | ('in the' YEAR)? four_digits -> YEAR[$four_digits.text]
  ;
  
date_separator
  : DASH
  | SLASH
  ;

hours
  : numeric_0_to_23 -> HOURS[$numeric_0_to_23.text]
  ;
  
minutes
  : numeric_0_to_59 -> MINUTES[$numeric_0_to_59.text]
  ;
  
meridian_indicator
  : AM -> AM_PM["am"]
  | PM -> AM_PM["pm"]
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
  | numeric_1_to_31
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
  | TWENTY_FIRST   | (TWENTY DASH? FIRST)   -> INTEGER["21"]
  | TWENTY_SECOND  | (TWENTY DASH? SECOND)  -> INTEGER["22"]
  | TWENTY_THIRD   | (TWENTY DASH? THIRD)   -> INTEGER["23"]
  | TWENTY_FOURTH  | (TWENTY DASH? FOURTH)  -> INTEGER["24"]
  | TWENTY_FIFTH   | (TWENTY DASH? FIFTH)   -> INTEGER["25"]
  | TWENTY_SIXTH   | (TWENTY DASH? SIXTH)   -> INTEGER["26"]
  | TWENTY_SEVENTH | (TWENTY DASH? SEVENTH) -> INTEGER["27"]
  | TWENTY_EIGHTH  | (TWENTY DASH? EIGHTH)  -> INTEGER["28"]
  | TWENTY_NINTH   | (TWENTY DASH? NINTH)   -> INTEGER["29"]
  | THIRTIETH                               -> INTEGER["30"]
  | THIRTY_FIRST   | (THIRTY DASH? FIRST)   -> INTEGER["31"]
  ;
  
// any 4 subsequent digits
four_digits
  : numeric_0_to_99
  | THREE_DIGIT -> INTEGER[$THREE_DIGIT.text]
  | FOUR_DIGIT  -> INTEGER[$FOUR_DIGIT.text]
  ;
  
numeric_1_to_12
  : ONE_TO_TWELVE -> INTEGER[$numeric_1_to_12.text]
  ;
  
// number between 0 and 23 with an optional 0 prefix for numbers 0-9
numeric_0_to_23
  : TWO_ZEROS                -> INTEGER[$TWO_ZEROS.text]
  | ONE_TO_TWELVE            -> INTEGER[$ONE_TO_TWELVE.text]
  | THIRTEEN_TO_TWENTY_THREE -> INTEGER[$THIRTEEN_TO_TWENTY_THREE.text]
  ;
  
// number between 0 and 59 with an optional 0 prefix for numbers 0-9
numeric_0_to_59
  : TWO_ZEROS                 -> INTEGER["0"]
  | ONE_TO_TWELVE             -> INTEGER[$ONE_TO_TWELVE.text]
  | THIRTEEN_TO_TWENTY_THREE  -> INTEGER[$THIRTEEN_TO_TWENTY_THREE.text]
  | TWENTY_FOUR_TO_THIRTY_ONE -> INTEGER[$TWENTY_FOUR_TO_THIRTY_ONE.text]
  | THIRTY_TWO_TO_FIFTY_NINE  -> INTEGER[$THIRTY_TWO_TO_FIFTY_NINE.text]
  ;
  
// number between 0 and 99 with an optional 0 prefix for numbers 0-9
numeric_0_to_99
  : TWO_ZEROS                 -> INTEGER[$TWO_ZEROS.text]
  | ONE_TO_TWELVE             -> INTEGER[$ONE_TO_TWELVE.text]
  | THIRTEEN_TO_TWENTY_THREE  -> INTEGER[$THIRTEEN_TO_TWENTY_THREE.text]
  | TWENTY_FOUR_TO_THIRTY_ONE -> INTEGER[$TWENTY_FOUR_TO_THIRTY_ONE.text]
  | THIRTY_TWO_TO_FIFTY_NINE  -> INTEGER[$THIRTY_TWO_TO_FIFTY_NINE.text]
  | SIXTY_TO_NINETY_NINE      -> INTEGER[$SIXTY_TO_NINETY_NINE.text]
  ;
  
// number between 1 and 31 with an optional 0 prefix for numbers 0-9
numeric_1_to_31
  : ONE_TO_TWELVE             -> INTEGER[$ONE_TO_TWELVE.text]
  | THIRTEEN_TO_TWENTY_THREE  -> INTEGER[$THIRTEEN_TO_TWENTY_THREE.text]
  | TWENTY_FOUR_TO_THIRTY_ONE -> INTEGER[$TWENTY_FOUR_TO_THIRTY_ONE.text]
  ;
  
// time identifiers
MIDNIGHT : 'midnight' | 'mid-night';
NOON     : 'noon';
  
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
TODAY : 'today';
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
TWENTIETH      : 'twentienh'   | '20th';
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
TWO_ZEROS : '0' '0' ;
  
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