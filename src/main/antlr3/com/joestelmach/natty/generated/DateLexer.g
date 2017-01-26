lexer grammar DateLexer;

@header { package com.joestelmach.natty.generated; }

@members {
  private static org.slf4j.Logger _logger =
    org.slf4j.LoggerFactory.getLogger(com.joestelmach.natty.generated.DateLexer.class);

  @Override
  public void displayRecognitionError(String[] tokenNames, RecognitionException re) {
    if (_logger.isDebugEnabled()) {
      String message = getErrorHeader(re);
      try { message += getErrorMessage(re, tokenNames); } catch(Exception e) {}
      _logger.debug(message);
    }
  }

  @Override
  public void emitErrorMessage(String msg) {
    _logger.error(msg);
  }
}

// ********** date rules ********** 

JANUARY   : 'january'   's'?  | 'jan' DOT?;
FEBRUARY  : 'february'  's'?  | 'feb' DOT?;
MARCH     : 'march'     'es'? | 'mar' DOT?;
APRIL     : 'april'     's'?  | 'apr' DOT?;
MAY       : 'may'       's'?;
JUNE      : 'june'      's'?  | 'jun' DOT?;
JULY      : 'july'      's'?  | 'jul' DOT?;
AUGUST    : 'august'    's'?  | 'aug' DOT?;
SEPTEMBER : 'september' 's'?  | 'sep' DOT? | 'sept' DOT?;
OCTOBER   : 'october'   's'?  | 'oct' DOT?;
NOVEMBER  : 'november'  's'?  | 'nov' DOT?;
DECEMBER  : 'december'  's'?  | 'dec' DOT?;
  
SUNDAY    : 'sunday'    's'?  | 'sun' DOT?  | 'suns' DOT?;
MONDAY    : 'monday'    's'?  | 'mon' DOT?  | 'mons' DOT?;
TUESDAY   : 'tuesday'   's'?  | 'tues' DOT? | 'tue' DOT?;
WEDNESDAY : 'wednesday' 's'?  | 'wed' DOT?  | 'weds' DOT?;
THURSDAY  : 'thursday'  's'?  | 'thur' DOT? | 'thu' DOT?   | 'thus' DOT? | 'thurs' DOT?;
FRIDAY    : 'friday'    's'?  | 'fri' DOT?  | 'fris' DOT?;
SATURDAY  : 'saturday'  's'?  | 'sat' DOT?  | 'sats' DOT?  | 'weekend';

HOUR   : 'hour'   | 'hours'   | 'hr' DOT?  | 'hrs' DOT?;
MINUTE : 'minute' | 'minutes' | 'min' DOT? | 'mins' DOT?;
DAY    : 'day'    | 'days' ;
WEEK   : 'week'   | 'weeks'   | 'wks' DOT?;
MONTH  : 'month'  | 'months';
YEAR   : 'year'   | 'year' SINGLE_QUOTE? 's' | 'yrs' DOT?;

TODAY     : 'today';
TOMORROW  : 'tomorow' | 'tomorrow' | 'tommorow' | 'tommorrow' | 'tmr';
TONIGHT   : 'tonight'; 
YESTERDAY : 'yesterday';

// ********** recurrence rules **********

EVERY : 'every';
UNTIL : 'until';

// ********** time rules ********** 

AT        : 'at' | '@';
AFTER     : 'after';
PAST      : 'past';
AM : 'am' | 'a.m' DOT? | 'a_m' | 'a';
PM : 'pm' | 'p.m' DOT? | 'p_m' | 'p';
T  : 't';

MILITARY_HOUR_SUFFIX : 'h';

MIDNIGHT  : 'midnight' | 'mid-night';
NOON      : 'noon'     | 'afternoon' | 'after-noon';
MORNING   : 'morning';
EVENING   : 'evening' | 'eve';
NIGHT     : 'night'; 

UTC  : 'utc'  | 'gmt'  | 'z';
EST  : 'est'  | 'edt'  | 'et'  | 'eastern';
PST  : 'pst'  | 'pdt'  | 'pt'  | 'pacific';
CST  : 'cst'  | 'cdt'  | 'ct'  | 'central';
MST  : 'mst'  | 'mdt'  | 'mt'  | 'mountain';
AKST : 'akst' | 'akdt' | 'akt' | 'alaska';
HAST : 'hast' | 'hadt' | 'hat' | 'hst' | 'hawaii';

// ********* numeric rules **********

INT_00 : '00';
INT_01 : '01';
INT_02 : '02';
INT_03 : '03';
INT_04 : '04';
INT_05 : '05';
INT_06 : '06';
INT_07 : '07';
INT_08 : '08';
INT_09 : '09';
INT_0  : '0';
INT_1  : '1';
INT_2  : '2';
INT_3  : '3';
INT_4  : '4';
INT_5  : '5';
INT_6  : '6';
INT_7  : '7';
INT_8  : '8';
INT_9  : '9';
INT_10 : '10';
INT_11 : '11';
INT_12 : '12';
INT_13 : '13';
INT_14 : '14';
INT_15 : '15';
INT_16 : '16';
INT_17 : '17';
INT_18 : '18';
INT_19 : '19';
INT_20 : '20';
INT_21 : '21';
INT_22 : '22';
INT_23 : '23';
INT_24 : '24';
INT_25 : '25';
INT_26 : '26';
INT_27 : '27';
INT_28 : '28';
INT_29 : '29';
INT_30 : '30';
INT_31 : '31';
INT_32 : '32';
INT_33 : '33';
INT_34 : '34';
INT_35 : '35';
INT_36 : '36';
INT_37 : '37';
INT_38 : '38';
INT_39 : '39';
INT_40 : '40';
INT_41 : '41';
INT_42 : '42';
INT_43 : '43';
INT_44 : '44';
INT_45 : '45';
INT_46 : '46';
INT_47 : '47';
INT_48 : '48';
INT_49 : '49';
INT_50 : '50';
INT_51 : '51';
INT_52 : '52';
INT_53 : '53';
INT_54 : '54';
INT_55 : '55';
INT_56 : '56';
INT_57 : '57';
INT_58 : '58';
INT_59 : '59';
INT_60 : '60';
INT_61 : '61';
INT_62 : '62';
INT_63 : '63';
INT_64 : '64';
INT_65 : '65';
INT_66 : '66';
INT_67 : '67';
INT_68 : '68';
INT_69 : '69';
INT_70 : '70';
INT_71 : '71';
INT_72 : '72';
INT_73 : '73';
INT_74 : '74';
INT_75 : '75';
INT_76 : '76';
INT_77 : '77';
INT_78 : '78';
INT_79 : '79';
INT_80 : '80';
INT_81 : '81';
INT_82 : '82';
INT_83 : '83';
INT_84 : '84';
INT_85 : '85';
INT_86 : '86';
INT_87 : '87';
INT_88 : '88';
INT_89 : '89';
INT_90 : '90';
INT_91 : '91';
INT_92 : '92';
INT_93 : '93';
INT_94 : '94';
INT_95 : '95';
INT_96 : '96';
INT_97 : '97';
INT_98 : '98';
INT_99 : '99';

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

FIRST          : 'first';
SECOND         : 'second' | 'seconds' | 'sec' | 'secs';
THIRD          : 'third';
FOURTH         : 'fourth';
FIFTH          : 'fifth';
SIXTH          : 'sixth';
SEVENTH        : 'seventh';
EIGHTH         : 'eighth';
NINTH          : 'ninth';
TENTH          : 'tenth';
ELEVENTH       : 'eleventh';
TWELFTH        : 'twelfth';
THIRTEENTH     : 'thirteenth';
FOURTEENTH     : 'fourteenth';
FIFTEENTH      : 'fifteenth';
SIXTEENTH      : 'sixteenth';
SEVENTEENTH    : 'seventeenth';
EIGHTEENTH     : 'eighteenth';
NINETEENTH     : 'nineteenth';
TWENTIETH      : 'twentieth';
THIRTIETH      : 'thirtieth';

// ********** suffixes **********
ST : 'st';
ND : 'nd';
RD : 'rd';
TH : 'th';
   
// ********** common rules **********

COLON : ':';
COMMA : ',';
DASH  : '-';
SLASH : '/';
DOT   : '.';
PLUS  : '+';
SINGLE_QUOTE : '\'';

CURRENT   : 'current';
FOR       : 'for';
IN        : 'in';
AN        : 'an';
THE       : 'the';
OR        : 'or';
AND       : 'and';
TO        : 'to';
THROUGH   : 'through';
ON        : 'on';
OF        : 'of';
THIS      : 'this';
THAT      : 'that';
LAST      : 'last' | 'final';
NEXT      : 'next';
COMING    : 'coming';
UPCOMING  : 'upcoming';
FROM      : 'from';
NOW       : 'now';
AGO       : 'ago';
BEFORE    : 'before';
BEGINNING : 'beginning' | 'begining';
START     : 'start';
END       : 'end';

WHITE_SPACE
  : (DOT | SPACE)+
  ;
  
// ********** holiday specific **********

FOOL         : 'fool' | 'fools' | 'fool' SINGLE_QUOTE 's';
BLACK        : 'black';
CHRISTMAS    : ('christmas' | 'xmas' | 'x-mas') 'es'?;
COLUMBUS     : 'columbus';
EARTH        : 'earth';
EASTER       : 'easter';
FATHER       : 'father' | 'fathers' | 'father' SINGLE_QUOTE 's';
FLAG         : 'flag';
GOOD         : 'good';
GROUNDHOG    : GROUND WHITE_SPACE? HOG SINGLE_QUOTE? 's'?;
HALLOWEEN    : ('halloween' | 'haloween') 's'?;
INAUGURATION : 'inauguration' | 'inaugaration';
INDEPENDENCE : 'independence' | 'independance';
KWANZAA      : ('kwanza' 'a'?) 's'?;
LABOR        : 'labor';
MLK          : 'mlk' | 'martin' WHITE_SPACE 'luther' WHITE_SPACE 'king' (COMMA SPACE 'jr' DOT)?;
MEMORIAL     : 'memorial';
MOTHER       : 'mother' SINGLE_QUOTE? 's'?;
NEW          : 'new';
PALM         : 'palm';
PATRIOT      : 'patriot' SINGLE_QUOTE? 's'?;
PRESIDENT    : 'president' SINGLE_QUOTE? 's'?;
PATRICK      : ('patrick' | 'patty' | 'paddy') SINGLE_QUOTE? 's'?;
SAINT        : 'saint';
TAX          : 'tax';
THANKSGIVING : 'thanksgiving' 's'?;
ELECTION     : 'election';
VALENTINE    : 'valentine' SINGLE_QUOTE? 's'?;
VETERAN      : 'veteran' SINGLE_QUOTE? 's'?;
fragment GROUND : 'ground';
fragment HOG    : 'hog';

// ********** season specific **********

WINTER : 'winter' 's'?;
FALL   : 'fall'   's'?;
AUTUMN : 'autumn' 's'?;
SPRING : 'spring' 's'?;
SUMMER : 'summer' 's'?;
  
UNKNOWN
  : UNKNOWN_CHAR
  ;
  
fragment UNKNOWN_CHAR
  : ~(SPACE | DOT)
  ;
  
fragment DIGIT : '0'..'9';
  
fragment SPACE : ' ' | '\t' | '\n' | '\r' | '\u00A0';