parser grammar DateParser;

options {
  output=AST;
  tokenVocab=DateLexer;
}

tokens {
  INT;
  MONTH_OF_YEAR;
  DAY_OF_MONTH;
  DAY_OF_WEEK;
  YEAR_OF;
  DATE_TIME;
  DATE_TIME_ALTERNATIVE;
  EXPLICIT_DATE;
  RELATIVE_DATE;
  SEEK;
  DIRECTION;
  SEEK_BY;
  SPAN;
  WEEK_INDEX;
  EXPLICIT_TIME;
  HOURS_OF_DAY;
  MINUTES_OF_HOUR;
  SECONDS_OF_MINUTE;
  AM_PM;
  ZONE;
  ZONE_OFFSET;
  LIST;
}

@header { package com.natty.date.generated; }

search 
  : (((date_time_entry)=> date_time_entry | .*) text)+ 
      -> ^(LIST date_time_entry+)
  ;
  
date_time_entry
  : (date_time_alternative)=> date_time_alternative
  | date_time
  ;
  
text
  : WHITE_SPACE? ((UNKNOWN_WORD | UNKNOWN_CHAR) WHITE_SPACE?)+
  ;
  
date_time
  : (
      | (date (date_time_separator time)?)=>
          date (date_time_separator time)?
          
      | (date) => date
      
      | time (time_date_separator date)?
    ) -> ^(DATE_TIME date? time?)
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
  : (formal_date)=> formal_date
  | (relaxed_date)=> relaxed_date
  | relative_date
  | global_date_prefix WHITE_SPACE date 
      -> ^(RELATIVE_DATE ^(SEEK global_date_prefix date))
  ;
  
date_time_alternative
  // next wed or thurs, next wed, thurs, or fri
  : (alternative_day_of_week_list)=> alternative_day_of_week_list
      -> ^(DATE_TIME_ALTERNATIVE alternative_day_of_week_list)
  
  // this wed. or next
  | ((THIS WHITE_SPACE)? day_of_week WHITE_SPACE OR WHITE_SPACE alternative_direction)=> 
      (THIS WHITE_SPACE)? day_of_week WHITE_SPACE OR WHITE_SPACE alternative_direction (date_time_separator time)?
      {System.out.println("match 2");}
      -> ^(DATE_TIME_ALTERNATIVE 
            ^(DATE_TIME ^(RELATIVE_DATE ^(SEEK DIRECTION[">"] SEEK_BY["by_day"] INT["0"] day_of_week)) time?) 
            ^(DATE_TIME ^(RELATIVE_DATE ^(SEEK alternative_direction day_of_week)) time?)
          )
          
  // today or the day after that, feb 16th or 2 days after that, january fourth or the friday after
  | (date WHITE_SPACE OR WHITE_SPACE global_date_prefix (WHITE_SPACE THAT)? (date_time_separator time)?)=>
      date WHITE_SPACE OR WHITE_SPACE global_date_prefix (WHITE_SPACE THAT)? (date_time_separator time)?
      {System.out.println("match 3");}
      -> ^(DATE_TIME_ALTERNATIVE ^(DATE_TIME date time?) ^(DATE_TIME ^(RELATIVE_DATE ^(SEEK global_date_prefix date) time?)))
      
  // date or date, in any format
  | alternative_date_list
      -> ^(DATE_TIME_ALTERNATIVE alternative_date_list)
  ;
  
alternative_day_of_week_list
  : alternative_direction WHITE_SPACE day_of_week (day_of_week_list_separator day_of_week)* (date_time_separator time)?
      -> (^(DATE_TIME ^(RELATIVE_DATE ^(SEEK alternative_direction day_of_week)) time?))+
  ;
  
alternative_date_list
  : date (date_list_separator date)* (date_time_separator time)?
      -> (^(DATE_TIME date time?))+
  ;
  
day_of_week_list_separator
  : (COMMA WHITE_SPACE? | WHITE_SPACE) (OR WHITE_SPACE)?
  ;
  
date_list_separator
  : COMMA? WHITE_SPACE OR WHITE_SPACE
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
  | spelled_or_int_01_to_31_optional_prefix WHITE_SPACE DAY WHITE_SPACE prefix_direction
      -> prefix_direction SEEK_BY["by_day"] spelled_or_int_01_to_31_optional_prefix
      
  // the friday after
  | (THE WHITE_SPACE)? day_of_week WHITE_SPACE prefix_direction
      -> prefix_direction SEEK_BY["by_day"] INT["1"] day_of_week
      
  // 3 fridays before
  | spelled_or_int_01_to_31_optional_prefix WHITE_SPACE day_of_week WHITE_SPACE prefix_direction
      -> prefix_direction SEEK_BY["by_day"] spelled_or_int_01_to_31_optional_prefix day_of_week
      
  | (THE WHITE_SPACE)? spelled_first_to_thirty_first WHITE_SPACE day_of_week WHITE_SPACE prefix_direction
      -> prefix_direction SEEK_BY["by_day"] spelled_first_to_thirty_first day_of_week
  ; 
  
prefix_direction
  : AFTER  -> DIRECTION[">"]
  | BEFORE -> DIRECTION["<"]
  ;
  
// ********** relaxed date rules **********

// relaxed date with a spelled-out or abbreviated month
relaxed_date
  : (
      // this is a bit tricky since a time can be placed directly after a date, and a year
      // can look like a time (four digits, no colon i.e. 0500)  Since a year would be more
      // common in this context, we choose to swallow the year as part of the date.
      
      // The 31st of April in the year 2008
      // RFC822 style: Fri, 21 Nov 1997
      (relaxed_day_of_week? relaxed_day_of_month_prefix? relaxed_day_of_month 
          WHITE_SPACE (OF WHITE_SPACE)? relaxed_month relaxed_year_prefix relaxed_year)=>
        relaxed_day_of_week? relaxed_day_of_month_prefix? relaxed_day_of_month 
            WHITE_SPACE (OF WHITE_SPACE)? relaxed_month relaxed_year_prefix relaxed_year
        
      // above without the year restriction
      | relaxed_day_of_week? relaxed_day_of_month_prefix? relaxed_day_of_month WHITE_SPACE (OF WHITE_SPACE)? relaxed_month
    
      // Jan 21, 1997
      // Sun, Nov 21
      | (relaxed_day_of_week? relaxed_month WHITE_SPACE relaxed_day_of_month relaxed_year_prefix relaxed_year)=>
        relaxed_day_of_week? relaxed_month WHITE_SPACE relaxed_day_of_month relaxed_year_prefix relaxed_year
      
      // jan 1st, february 28th
      | relaxed_day_of_week? relaxed_month WHITE_SPACE relaxed_day_of_month
    ) -> ^(EXPLICIT_DATE relaxed_month relaxed_day_of_month relaxed_day_of_week? relaxed_year?)
  ;
  
relaxed_day_of_week
  : ((relative_prefix | implicit_prefix) WHITE_SPACE)? day_of_week ((COMMA WHITE_SPACE?) | WHITE_SPACE) -> day_of_week
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
  
relaxed_year
  : SINGLE_QUOTE? int_00_to_99_mandatory_prefix
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
  : relaxed_day_of_week? formal_year_four_digits formal_date_separator formal_month_of_year formal_date_separator formal_day_of_month
      -> ^(EXPLICIT_DATE formal_month_of_year formal_day_of_month relaxed_day_of_week? formal_year_four_digits)
      
  // year last: 1/02/1980, 2/28/79.  2 or 4 digit year is acceptable 
  | relaxed_day_of_week? formal_month_of_year formal_date_separator formal_day_of_month (formal_date_separator formal_year)?
      -> ^(EXPLICIT_DATE formal_month_of_year formal_day_of_month relaxed_day_of_week? formal_year?)
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
      -> ^(RELATIVE_DATE ^(SEEK relative_prefix relative_target))
      
  | implicit_prefix WHITE_SPACE relative_target 
      -> ^(RELATIVE_DATE ^(SEEK implicit_prefix relative_target))
      
  // a day of week relative target with no prefix has an implicit seek of 0
  // monday
  | day_of_week
      -> ^(RELATIVE_DATE ^(SEEK DIRECTION[">"] SEEK_BY["by_day"] INT["0"] day_of_week))
      
  | spelled_or_int_01_to_31_optional_prefix WHITE_SPACE relative_target WHITE_SPACE relative_suffix 
      -> ^(RELATIVE_DATE ^(SEEK relative_suffix spelled_or_int_01_to_31_optional_prefix relative_target))
      
  // the last thursday in november
  | (THE WHITE_SPACE)? relative_occurrence_index WHITE_SPACE day_of_week WHITE_SPACE IN WHITE_SPACE relaxed_month
      -> ^(RELATIVE_DATE ^(WEEK_INDEX relative_occurrence_index day_of_week relaxed_month))
      
  | named_relative_date 
  ;
  
relative_occurrence_index
  : int_1_to_5 -> INT[$int_1_to_5.text]
  | FIRST      -> INT["1"]
  | SECOND     -> INT["2"]
  | THIRD      -> INT["3"]
  | FOURTH     -> INT["4"]
  | FIFTH      -> INT["5"]
  | LAST       -> INT["5"]
  ;
  
relative_target
  : day_of_week 
  | relaxed_month
  | relative_date_span
  ;
  
implicit_prefix
  : THIS -> DIRECTION[">"] SEEK_BY["by_day"] INT["0"]
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
  : TODAY     -> ^(RELATIVE_DATE ^(SEEK DIRECTION[">"] SEEK_BY["by_day"] INT["0"] SPAN["day"]))
  | TOMORROW  -> ^(RELATIVE_DATE ^(SEEK DIRECTION[">"] SEEK_BY["by_day"] INT["1"] SPAN["day"]))
  | YESTERDAY -> ^(RELATIVE_DATE ^(SEEK DIRECTION["<"] SEEK_BY["by_day"] INT["1"] SPAN["day"]))
  ;
  
// ********** time rules **********

// a time with an hour, optional minutes, and optional meridian indicator
time
  : hours COLON? minutes (COLON? seconds)? (WHITE_SPACE? (meridian_indicator | (MILITARY_HOUR_SUFFIX | HOUR)))? (WHITE_SPACE? time_zone)?
      -> ^(EXPLICIT_TIME hours minutes seconds? meridian_indicator? time_zone?)
      
  | hours (WHITE_SPACE? meridian_indicator)? (WHITE_SPACE? time_zone)?
      -> ^(EXPLICIT_TIME hours ^(MINUTES_OF_HOUR INT["0"]) meridian_indicator? time_zone?)
      
  | named_time (WHITE_SPACE time_zone)?
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
  ;
  
named_time
  : (IN WHITE_SPACE THE WHITE_SPACE)? NOON    -> ^(HOURS_OF_DAY INT["12"]) ^(MINUTES_OF_HOUR INT["0"]) AM_PM["pm"]
  | (IN WHITE_SPACE THE WHITE_SPACE)? MORNING -> ^(HOURS_OF_DAY INT["8"]) ^(MINUTES_OF_HOUR INT["0"]) AM_PM["am"]
  | (IN WHITE_SPACE THE WHITE_SPACE)? NIGHT   -> ^(HOURS_OF_DAY INT["8"]) ^(MINUTES_OF_HOUR INT["0"]) AM_PM["pm"]
  | MIDNIGHT                                  -> ^(HOURS_OF_DAY INT["12"]) ^(MINUTES_OF_HOUR INT["0"]) AM_PM["am"]
  ;
  
time_zone
  : time_zone_abbreviation
  | time_zone_offset
  ;
  
time_zone_offset
  : (PLUS | DASH) hours (COLON? minutes)? 
      -> ZONE_OFFSET[$time_zone_offset.text]
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
  
// ********** numeric rules **********

// a number between 0 and 23 inclusive, with an optional 0 prefix before numbers 0-9
int_00_to_23_optional_prefix
  : (INT_00 
  | INT_0
  | int_1_to_9
  | int_01_to_12
  | int_13_to_23) -> INT[$int_00_to_23_optional_prefix.text]
  ;
 
// a number between 00 and 59 inclusive, with a mandatory 0 prefix before numbers 0-9
int_00_to_59_mandatory_prefix
  : (INT_00
  | int_01_to_12
  | int_13_to_23
  | int_24_to_31
  | int_32_to_59) -> INT[$int_00_to_59_mandatory_prefix.text]
  ;
  
// a number between 00 and 99 inclusive, with a mandatory 0 prefix before numbers 0-9
int_00_to_99_mandatory_prefix
  : (int_00_to_59_mandatory_prefix | int_60_to_99)
    -> INT[$int_00_to_99_mandatory_prefix.text]
  ;
  
// a number between 1 and 12 inclusive, with an optional 0 prefix before numbers 1-9
int_01_to_12_optional_prefix
  : (int_1_to_9 | int_01_to_12) -> INT[$int_01_to_12_optional_prefix.text]
  ;
  
// a number between 1 and 31 inclusive, with an optional 0 prefix before numbers 1-9
int_01_to_31_optional_prefix
  : (int_01_to_12
  | int_1_to_9
  | int_13_to_23
  | int_24_to_31) -> INT[$int_01_to_31_optional_prefix.text]
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
  : (FIRST       | INT_1 ST)  -> INT["1"]
  | (SECOND      | INT_2 ND)  -> INT["2"]
  | (THIRD       | INT_3 RD)  -> INT["3"]
  | (FOURTH      | INT_4 TH)  -> INT["4"]
  | (FIFTH       | INT_5 TH)  -> INT["5"]
  | (SIXTH       | INT_6 TH)  -> INT["6"]
  | (SEVENTH     | INT_7 TH)  -> INT["7"]
  | (EIGHTH      | INT_8 TH)  -> INT["8"]
  | (NINTH       | INT_9 TH)  -> INT["9"]
  | (TENTH       | INT_10 TH) -> INT["10"]
  | (ELEVENTH    | INT_11 TH) -> INT["11"]
  | (TWELFTH     | INT_12 TH) -> INT["12"]
  | (THIRTEENTH  | INT_13 TH) -> INT["13"]
  | (FOURTEENTH  | INT_14 TH) -> INT["14"]
  | (FIFTEENTH   | INT_15 TH) -> INT["15"]
  | (SIXTEENTH   | INT_16 TH) -> INT["16"]
  | (SEVENTEENTH | INT_17 TH) -> INT["17"]
  | (EIGHTEENTH  | INT_18 TH) -> INT["18"]
  | (NINETEENTH  | INT_19 TH) -> INT["19"]
  | (TWENTIETH   | INT_20 TH) -> INT["20"]
  | ((TWENTY (DASH | WHITE_SPACE)? FIRST)   | INT_21 ST) -> INT["21"]
  | ((TWENTY (DASH | WHITE_SPACE)? SECOND)  | INT_22 ND) -> INT["22"]
  | ((TWENTY (DASH | WHITE_SPACE)? THIRD)   | INT_23 RD) -> INT["23"]
  | ((TWENTY (DASH | WHITE_SPACE)? FOURTH)  | INT_24 TH) -> INT["24"]
  | ((TWENTY (DASH | WHITE_SPACE)? FIFTH)   | INT_25 TH) -> INT["25"]
  | ((TWENTY (DASH | WHITE_SPACE)? SIXTH)   | INT_26 TH) -> INT["26"]
  | ((TWENTY (DASH | WHITE_SPACE)? SEVENTH) | INT_27 TH) -> INT["27"]
  | ((TWENTY (DASH | WHITE_SPACE)? EIGHTH)  | INT_28 TH) -> INT["28"]
  | ((TWENTY (DASH | WHITE_SPACE)? NINTH)   | INT_29 TH) -> INT["29"]
  | (THIRTIETH | INT_30 TH)                              -> INT["30"]
  | ((THIRTY (DASH | WHITE_SPACE)? FIRST)   | INT_31 ST) -> INT["31"]
  ;
  
int_60_to_99
  : INT_60 | INT_61 | INT_62 | INT_63 | INT_64 | INT_65 | INT_66 | INT_67 | INT_68
  | INT_69 | INT_70 | INT_71 | INT_72 | INT_73 | INT_74 | INT_75 | INT_76 | INT_77
  | INT_78 | INT_79 | INT_80 | INT_81 | INT_82 | INT_83 | INT_84 | INT_85 | INT_86
  | INT_87 | INT_88 | INT_89 | INT_90 | INT_91 | INT_92 | INT_93 | INT_94 | INT_95
  | INT_96 | INT_97 | INT_98 | INT_99
  ;
  
int_32_to_59
  : INT_32 | INT_33 | INT_34 | INT_35 | INT_36 | INT_37 | INT_38 | INT_39 | INT_40 
  | INT_41 | INT_42 | INT_43 | INT_44 | INT_45 | INT_46 | INT_47 | INT_48 | INT_49 
  | INT_50 | INT_51 | INT_52 | INT_53 | INT_54 | INT_55 | INT_56 | INT_57 | INT_58 
  | INT_59
  ;
   
int_24_to_31
  : INT_24 | INT_25 | INT_26 | INT_27 | INT_28 | INT_29  | INT_30 | INT_31
  ;
   
int_13_to_23
  : INT_13 | INT_14 | INT_15 | INT_16 | INT_17 | INT_18 | INT_19  | INT_20 | INT_21
  | INT_22 | INT_23
  ;
   
int_01_to_12
  : INT_01 | INT_02 | INT_03 | INT_04 | INT_05 | INT_06 | INT_07 | INT_08 | INT_09
  | INT_10 | INT_11 | INT_12
  ;
  
int_1_to_9
  : INT_1  | INT_2  | INT_3  | INT_4  | INT_5  | INT_6  | INT_7  | INT_8  | INT_9
  ;
  
int_1_to_5
  : INT_1  | INT_2  | INT_3  | INT_4  | INT_5 
  ;
  