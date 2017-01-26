parser grammar NumericRules;

options {
  output=AST;
}

tokens {
  INT;
}

@members {
  private static org.slf4j.Logger _logger =
    org.slf4j.LoggerFactory.getLogger(com.joestelmach.natty.generated.DateParser_NumericRules.class);

  @Override
  public void reportError(IOException e) {
    _logger.error("Unexpected IO error", e);
  }

  @Override
  public void emitErrorMessage(String msg) {
    _logger.error(msg);
  }
}


// ********** numeric rules **********

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
  
// a number between 0 and 23 inclusive, with an optional 0 prefix before numbers 0-9
int_00_to_23_optional_prefix
  : (INT_00 
  | INT_0
  | int_1_to_9
  | int_01_to_12
  | int_13_to_23) -> INT[$int_00_to_23_optional_prefix.text]
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
  
// a number between 1 and 9999 either spelled-out, or as an
// integer with an optional 0 prefix for numbers betwen 1 and 9
spelled_or_int_optional_prefix
  : spelled_one_to_thirty_one // TODO expand this spelled range to at least ninety-nine
  | ((int_01_to_31_optional_prefix | int_32_to_59 | int_60_to_99)
     ( INT_0 | INT_00 | int_01_to_31_optional_prefix | int_32_to_59 | int_60_to_99)?
     
       -> INT[$spelled_or_int_optional_prefix.text])
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
  | (TWENTY WHITE_SPACE ONE)=>   TWENTY WHITE_SPACE ONE   -> INT["21"]
  | TWENTY DASH? ONE                                      -> INT["21"]
  | (TWENTY WHITE_SPACE TWO)=>   TWENTY WHITE_SPACE TWO   -> INT["22"]
  | TWENTY DASH? TWO                                      -> INT["22"]
  | (TWENTY WHITE_SPACE THREE)=> TWENTY WHITE_SPACE THREE -> INT["23"]
  | TWENTY DASH? THREE                                    -> INT["23"]
  | (TWENTY WHITE_SPACE FOUR)=>  TWENTY WHITE_SPACE FOUR  -> INT["24"]
  | TWENTY DASH? FOUR                                     -> INT["24"]
  | (TWENTY WHITE_SPACE FIVE)=>  TWENTY WHITE_SPACE FIVE  -> INT["25"]
  | TWENTY DASH? FIVE                                     -> INT["25"]
  | (TWENTY WHITE_SPACE SIX)=>   TWENTY WHITE_SPACE SIX   -> INT["26"]
  | TWENTY DASH? SIX                                      -> INT["26"]
  | (TWENTY WHITE_SPACE SEVEN)=> TWENTY WHITE_SPACE SEVEN -> INT["27"]
  | TWENTY DASH? SEVEN                                    -> INT["27"]
  | (TWENTY WHITE_SPACE EIGHT)=> TWENTY WHITE_SPACE EIGHT -> INT["28"]
  | TWENTY DASH? EIGHT                                    -> INT["28"]
  | (TWENTY WHITE_SPACE NINE)=>  TWENTY WHITE_SPACE NINE  -> INT["29"]
  | TWENTY DASH? NINE                                     -> INT["29"]
  | TWENTY                                                -> INT["20"]
  | (THIRTY WHITE_SPACE ONE)=>   THIRTY WHITE_SPACE ONE   -> INT["31"]
  | THIRTY DASH? ONE                                      -> INT["31"]
  | THIRTY                                                -> INT["30"]
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
  