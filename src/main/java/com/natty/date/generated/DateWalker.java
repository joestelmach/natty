// $ANTLR 3.2 Sep 23, 2009 12:02:23 /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateWalker.g 2010-02-22 09:58:17
 package com.natty.date.generated; 

import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class DateWalker extends TreeParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "DOT", "JANUARY", "FEBRUARY", "MARCH", "APRIL", "MAY", "JUNE", "JULY", "AUGUST", "SEPTEMBER", "OCTOBER", "NOVEMBER", "DECEMBER", "SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY", "HOUR", "DAY", "WEEK", "MONTH", "YEAR", "TODAY", "TOMORROW", "YESTERDAY", "AM", "PM", "T", "MILITARY_HOUR_SUFFIX", "MIDNIGHT", "NOON", "MORNING", "NIGHT", "UTC", "EST", "PST", "CST", "MST", "AKST", "HAST", "INT_00", "INT_01", "INT_02", "INT_03", "INT_04", "INT_05", "INT_06", "INT_07", "INT_08", "INT_09", "INT_0", "INT_1", "INT_2", "INT_3", "INT_4", "INT_5", "INT_6", "INT_7", "INT_8", "INT_9", "INT_10", "INT_11", "INT_12", "INT_13", "INT_14", "INT_15", "INT_16", "INT_17", "INT_18", "INT_19", "INT_20", "INT_21", "INT_22", "INT_23", "INT_24", "INT_25", "INT_26", "INT_27", "INT_28", "INT_29", "INT_30", "INT_31", "INT_32", "INT_33", "INT_34", "INT_35", "INT_36", "INT_37", "INT_38", "INT_39", "INT_40", "INT_41", "INT_42", "INT_43", "INT_44", "INT_45", "INT_46", "INT_47", "INT_48", "INT_49", "INT_50", "INT_51", "INT_52", "INT_53", "INT_54", "INT_55", "INT_56", "INT_57", "INT_58", "INT_59", "INT_60", "INT_61", "INT_62", "INT_63", "INT_64", "INT_65", "INT_66", "INT_67", "INT_68", "INT_69", "INT_70", "INT_71", "INT_72", "INT_73", "INT_74", "INT_75", "INT_76", "INT_77", "INT_78", "INT_79", "INT_80", "INT_81", "INT_82", "INT_83", "INT_84", "INT_85", "INT_86", "INT_87", "INT_88", "INT_89", "INT_90", "INT_91", "INT_92", "INT_93", "INT_94", "INT_95", "INT_96", "INT_97", "INT_98", "INT_99", "ST", "ND", "RD", "TH", "ONE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", "NINE", "TEN", "ELEVEN", "TWELVE", "THIRTEEN", "FOURTEEN", "FIFTEEN", "SIXTEEN", "SEVENTEEN", "EIGHTEEN", "NINETEEN", "TWENTY", "THIRTY", "FIRST", "SECOND", "THIRD", "FOURTH", "FIFTH", "SIXTH", "SEVENTH", "EIGHTH", "NINTH", "TENTH", "ELEVENTH", "TWELFTH", "THIRTEENTH", "FOURTEENTH", "FIFTEENTH", "SIXTEENTH", "SEVENTEENTH", "EIGHTEENTH", "NINETEENTH", "TWENTIETH", "THIRTIETH", "COLON", "COMMA", "DASH", "SLASH", "PLUS", "SINGLE_QUOTE", "IN", "THE", "AT", "ON", "OF", "THIS", "LAST", "NEXT", "PAST", "COMING", "UPCOMING", "FROM", "NOW", "AGO", "BEFORE", "AFTER", "SPACE", "WHITE_SPACE", "UNKNOWN_WORD", "UNKNOWN_CHAR", "DIGIT", "INT", "MONTH_OF_YEAR", "DAY_OF_MONTH", "DAY_OF_WEEK", "YEAR_OF", "DATE_TIME", "EXPLICIT_DATE", "RELATIVE_DATE", "SEEK", "DIRECTION", "SEEK_BY", "SPAN", "WEEK_INDEX", "EXPLICIT_TIME", "HOURS_OF_DAY", "MINUTES_OF_HOUR", "SECONDS_OF_MINUTE", "AM_PM", "ZONE", "ZONE_OFFSET"
    };
    public static final int DIRECTION=239;
    public static final int NINETEEN=179;
    public static final int UNKNOWN_CHAR=228;
    public static final int INT_08=55;
    public static final int INT_09=56;
    public static final int TWENTY=180;
    public static final int INT_02=49;
    public static final int INT_03=50;
    public static final int INT_00=47;
    public static final int INT_01=48;
    public static final int APRIL=8;
    public static final int INT_06=53;
    public static final int COMING=218;
    public static final int INT_07=54;
    public static final int INT_04=51;
    public static final int INT_05=52;
    public static final int NOW=221;
    public static final int EOF=-1;
    public static final int MONTH=27;
    public static final int AM_PM=247;
    public static final int EIGHTEENTH=199;
    public static final int SPAN=241;
    public static final int THIS=214;
    public static final int NOON=37;
    public static final int TOMORROW=30;
    public static final int FIFTEENTH=196;
    public static final int TODAY=29;
    public static final int NOVEMBER=15;
    public static final int MONTH_OF_YEAR=231;
    public static final int SEVENTH=188;
    public static final int FEBRUARY=6;
    public static final int T=34;
    public static final int DAY_OF_WEEK=233;
    public static final int SUNDAY=17;
    public static final int SEVEN=167;
    public static final int ELEVEN=171;
    public static final int THIRTEEN=173;
    public static final int EXPLICIT_DATE=236;
    public static final int INT=230;
    public static final int UPCOMING=219;
    public static final int SIX=166;
    public static final int FIFTH=186;
    public static final int MORNING=38;
    public static final int DECEMBER=16;
    public static final int AUGUST=12;
    public static final int SECONDS_OF_MINUTE=246;
    public static final int TUESDAY=19;
    public static final int THIRD=184;
    public static final int INT_47=104;
    public static final int INT_46=103;
    public static final int INT_45=102;
    public static final int INT_44=101;
    public static final int RD=159;
    public static final int INT_49=106;
    public static final int INT_48=105;
    public static final int THE=210;
    public static final int WHITE_SPACE=226;
    public static final int INT_42=99;
    public static final int INT_43=100;
    public static final int FRIDAY=22;
    public static final int INT_40=97;
    public static final int INT_41=98;
    public static final int AT=211;
    public static final int INT_34=91;
    public static final int INT_33=90;
    public static final int SINGLE_QUOTE=208;
    public static final int INT_36=93;
    public static final int INT_35=92;
    public static final int SLASH=206;
    public static final int INT_38=95;
    public static final int INT_37=94;
    public static final int INT_39=96;
    public static final int NINTH=190;
    public static final int ZONE=248;
    public static final int TWENTIETH=201;
    public static final int PLUS=207;
    public static final int INT_30=87;
    public static final int INT_31=88;
    public static final int AM=32;
    public static final int INT_32=89;
    public static final int INT_29=86;
    public static final int INT_28=85;
    public static final int INT_27=84;
    public static final int INT_26=83;
    public static final int INT_25=82;
    public static final int INT_24=81;
    public static final int INT_23=80;
    public static final int INT_22=79;
    public static final int TH=160;
    public static final int FOURTEENTH=195;
    public static final int SIXTEEN=176;
    public static final int AGO=222;
    public static final int ELEVENTH=192;
    public static final int ST=157;
    public static final int TWO=162;
    public static final int HOUR=24;
    public static final int INT_20=77;
    public static final int INT_21=78;
    public static final int JANUARY=5;
    public static final int THIRTEENTH=194;
    public static final int COLON=203;
    public static final int INT_16=73;
    public static final int INT_15=72;
    public static final int INT_18=75;
    public static final int INT_17=74;
    public static final int INT_12=69;
    public static final int INT_11=68;
    public static final int INT_14=71;
    public static final int INT_13=70;
    public static final int DAY_OF_MONTH=232;
    public static final int INT_19=76;
    public static final int FIFTEEN=175;
    public static final int NINE=169;
    public static final int THREE=163;
    public static final int FOURTEEN=174;
    public static final int INT_10=67;
    public static final int YESTERDAY=31;
    public static final int SEVENTEENTH=198;
    public static final int FIRST=182;
    public static final int INT_81=138;
    public static final int INT_80=137;
    public static final int SEPTEMBER=13;
    public static final int WEEK=26;
    public static final int INT_83=140;
    public static final int INT_82=139;
    public static final int INT_85=142;
    public static final int INT_84=141;
    public static final int WEDNESDAY=20;
    public static final int INT_87=144;
    public static final int INT_86=143;
    public static final int JULY=11;
    public static final int NINETEENTH=200;
    public static final int OCTOBER=14;
    public static final int DAY=25;
    public static final int ONE=161;
    public static final int MIDNIGHT=36;
    public static final int INT_88=145;
    public static final int MARCH=7;
    public static final int INT_89=146;
    public static final int PAST=217;
    public static final int SEVENTEEN=177;
    public static final int DATE_TIME=235;
    public static final int INT_72=129;
    public static final int INT_71=128;
    public static final int INT_70=127;
    public static final int INT_76=133;
    public static final int INT_75=132;
    public static final int INT_74=131;
    public static final int INT_73=130;
    public static final int MINUTES_OF_HOUR=245;
    public static final int THIRTIETH=202;
    public static final int LAST=215;
    public static final int INT_79=136;
    public static final int INT_77=134;
    public static final int EIGHTEEN=178;
    public static final int INT_78=135;
    public static final int ND=158;
    public static final int RELATIVE_DATE=237;
    public static final int INT_63=120;
    public static final int INT_62=119;
    public static final int INT_65=122;
    public static final int INT_64=121;
    public static final int FOURTH=185;
    public static final int SECOND=183;
    public static final int INT_61=118;
    public static final int INT_60=117;
    public static final int SATURDAY=23;
    public static final int FOUR=164;
    public static final int TEN=170;
    public static final int ON=212;
    public static final int MONDAY=18;
    public static final int JUNE=10;
    public static final int OF=213;
    public static final int INT_66=123;
    public static final int INT_67=124;
    public static final int INT_68=125;
    public static final int INT_69=126;
    public static final int INT_54=111;
    public static final int INT_53=110;
    public static final int INT_52=109;
    public static final int INT_51=108;
    public static final int INT_50=107;
    public static final int THURSDAY=21;
    public static final int ZONE_OFFSET=249;
    public static final int SEEK_BY=240;
    public static final int PM=33;
    public static final int EXPLICIT_TIME=243;
    public static final int FROM=220;
    public static final int INT_59=116;
    public static final int INT_57=114;
    public static final int INT_58=115;
    public static final int INT_55=112;
    public static final int EIGHTH=189;
    public static final int INT_56=113;
    public static final int HOURS_OF_DAY=244;
    public static final int YEAR=28;
    public static final int MAY=9;
    public static final int TENTH=191;
    public static final int INT_9=66;
    public static final int INT_8=65;
    public static final int INT_7=64;
    public static final int SPACE=225;
    public static final int INT_6=63;
    public static final int INT_5=62;
    public static final int UTC=40;
    public static final int INT_4=61;
    public static final int INT_3=60;
    public static final int AKST=45;
    public static final int INT_2=59;
    public static final int MST=44;
    public static final int INT_1=58;
    public static final int EIGHT=168;
    public static final int INT_0=57;
    public static final int CST=43;
    public static final int IN=209;
    public static final int PST=42;
    public static final int COMMA=204;
    public static final int FIVE=165;
    public static final int THIRTY=181;
    public static final int NEXT=216;
    public static final int DIGIT=229;
    public static final int DOT=4;
    public static final int MILITARY_HOUR_SUFFIX=35;
    public static final int EST=41;
    public static final int HAST=46;
    public static final int DASH=205;
    public static final int YEAR_OF=234;
    public static final int TWELVE=172;
    public static final int WEEK_INDEX=242;
    public static final int BEFORE=223;
    public static final int AFTER=224;
    public static final int SIXTEENTH=197;
    public static final int SEEK=238;
    public static final int INT_90=147;
    public static final int NIGHT=39;
    public static final int INT_97=154;
    public static final int INT_98=155;
    public static final int INT_95=152;
    public static final int INT_96=153;
    public static final int INT_93=150;
    public static final int INT_94=151;
    public static final int INT_91=148;
    public static final int INT_92=149;
    public static final int TWELFTH=193;
    public static final int INT_99=156;
    public static final int SIXTH=187;
    public static final int UNKNOWN_WORD=227;

    // delegates
    // delegators


        public DateWalker(TreeNodeStream input) {
            this(input, new RecognizerSharedState());
        }
        public DateWalker(TreeNodeStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return DateWalker.tokenNames; }
    public String getGrammarFileName() { return "/Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateWalker.g"; }


      private com.natty.date.WalkerState _walkerState = new com.natty.date.WalkerState();
      
      public com.natty.date.WalkerState getState() {
        return _walkerState;
      }



    // $ANTLR start "search"
    // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateWalker.g:18:1: search : ( date_time )+ ;
    public final void search() throws RecognitionException {
        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateWalker.g:19:3: ( ( date_time )+ )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateWalker.g:19:5: ( date_time )+
            {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateWalker.g:19:5: ( date_time )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==DATE_TIME) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateWalker.g:19:5: date_time
            	    {
            	    pushFollow(FOLLOW_date_time_in_search45);
            	    date_time();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "search"


    // $ANTLR start "date_time"
    // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateWalker.g:22:1: date_time : ^( DATE_TIME ( date )? ( time )? ) ;
    public final void date_time() throws RecognitionException {
        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateWalker.g:26:3: ( ^( DATE_TIME ( date )? ( time )? ) )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateWalker.g:26:5: ^( DATE_TIME ( date )? ( time )? )
            {
            match(input,DATE_TIME,FOLLOW_DATE_TIME_in_date_time67); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateWalker.g:26:17: ( date )?
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=EXPLICIT_DATE && LA2_0<=RELATIVE_DATE)) ) {
                    alt2=1;
                }
                switch (alt2) {
                    case 1 :
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateWalker.g:26:17: date
                        {
                        pushFollow(FOLLOW_date_in_date_time69);
                        date();

                        state._fsp--;


                        }
                        break;

                }

                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateWalker.g:26:23: ( time )?
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==EXPLICIT_TIME) ) {
                    alt3=1;
                }
                switch (alt3) {
                    case 1 :
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateWalker.g:26:23: time
                        {
                        pushFollow(FOLLOW_time_in_date_time72);
                        time();

                        state._fsp--;


                        }
                        break;

                }


                match(input, Token.UP, null); 
            }

            }


                _walkerState.captureDateTime(); 
              
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "date_time"


    // $ANTLR start "date"
    // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateWalker.g:29:1: date : ( relative_date | explicit_date );
    public final void date() throws RecognitionException {
        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateWalker.g:30:3: ( relative_date | explicit_date )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RELATIVE_DATE) ) {
                alt4=1;
            }
            else if ( (LA4_0==EXPLICIT_DATE) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateWalker.g:30:5: relative_date
                    {
                    pushFollow(FOLLOW_relative_date_in_date91);
                    relative_date();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateWalker.g:31:5: explicit_date
                    {
                    pushFollow(FOLLOW_explicit_date_in_date98);
                    explicit_date();

                    state._fsp--;


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "date"


    // $ANTLR start "relative_date"
    // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateWalker.g:34:1: relative_date : ( ^( RELATIVE_DATE seek ) | ^( RELATIVE_DATE ^( WEEK_INDEX index= INT ^( DAY_OF_WEEK day= INT ) ^( MONTH_OF_YEAR month= INT ) ) ) );
    public final void relative_date() throws RecognitionException {
        CommonTree index=null;
        CommonTree day=null;
        CommonTree month=null;

        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateWalker.g:35:3: ( ^( RELATIVE_DATE seek ) | ^( RELATIVE_DATE ^( WEEK_INDEX index= INT ^( DAY_OF_WEEK day= INT ) ^( MONTH_OF_YEAR month= INT ) ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RELATIVE_DATE) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==DOWN) ) {
                    int LA5_2 = input.LA(3);

                    if ( (LA5_2==WEEK_INDEX) ) {
                        alt5=2;
                    }
                    else if ( (LA5_2==SEEK) ) {
                        alt5=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateWalker.g:35:5: ^( RELATIVE_DATE seek )
                    {
                    match(input,RELATIVE_DATE,FOLLOW_RELATIVE_DATE_in_relative_date114); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_seek_in_relative_date116);
                    seek();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 2 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateWalker.g:37:5: ^( RELATIVE_DATE ^( WEEK_INDEX index= INT ^( DAY_OF_WEEK day= INT ) ^( MONTH_OF_YEAR month= INT ) ) )
                    {
                    match(input,RELATIVE_DATE,FOLLOW_RELATIVE_DATE_in_relative_date127); 

                    match(input, Token.DOWN, null); 
                    match(input,WEEK_INDEX,FOLLOW_WEEK_INDEX_in_relative_date130); 

                    match(input, Token.DOWN, null); 
                    index=(CommonTree)match(input,INT,FOLLOW_INT_in_relative_date134); 
                    match(input,DAY_OF_WEEK,FOLLOW_DAY_OF_WEEK_in_relative_date137); 

                    match(input, Token.DOWN, null); 
                    day=(CommonTree)match(input,INT,FOLLOW_INT_in_relative_date141); 

                    match(input, Token.UP, null); 
                    match(input,MONTH_OF_YEAR,FOLLOW_MONTH_OF_YEAR_in_relative_date145); 

                    match(input, Token.DOWN, null); 
                    month=(CommonTree)match(input,INT,FOLLOW_INT_in_relative_date149); 

                    match(input, Token.UP, null); 

                    match(input, Token.UP, null); 

                    match(input, Token.UP, null); 
                    _walkerState.setDayOfWeekIndex((index!=null?index.getText():null), (day!=null?day.getText():null), (month!=null?month.getText():null));

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "relative_date"


    // $ANTLR start "explicit_date"
    // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateWalker.g:41:1: explicit_date : ^( EXPLICIT_DATE ^( MONTH_OF_YEAR month= INT ) ^( DAY_OF_MONTH dom= INT ) ( ^( DAY_OF_WEEK dow= INT ) )? ( ^( YEAR_OF year= INT ) )? ) ;
    public final void explicit_date() throws RecognitionException {
        CommonTree month=null;
        CommonTree dom=null;
        CommonTree dow=null;
        CommonTree year=null;

        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateWalker.g:42:3: ( ^( EXPLICIT_DATE ^( MONTH_OF_YEAR month= INT ) ^( DAY_OF_MONTH dom= INT ) ( ^( DAY_OF_WEEK dow= INT ) )? ( ^( YEAR_OF year= INT ) )? ) )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateWalker.g:42:5: ^( EXPLICIT_DATE ^( MONTH_OF_YEAR month= INT ) ^( DAY_OF_MONTH dom= INT ) ( ^( DAY_OF_WEEK dow= INT ) )? ( ^( YEAR_OF year= INT ) )? )
            {
            match(input,EXPLICIT_DATE,FOLLOW_EXPLICIT_DATE_in_explicit_date174); 

            match(input, Token.DOWN, null); 
            match(input,MONTH_OF_YEAR,FOLLOW_MONTH_OF_YEAR_in_explicit_date177); 

            match(input, Token.DOWN, null); 
            month=(CommonTree)match(input,INT,FOLLOW_INT_in_explicit_date181); 

            match(input, Token.UP, null); 
            match(input,DAY_OF_MONTH,FOLLOW_DAY_OF_MONTH_in_explicit_date185); 

            match(input, Token.DOWN, null); 
            dom=(CommonTree)match(input,INT,FOLLOW_INT_in_explicit_date189); 

            match(input, Token.UP, null); 
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateWalker.g:43:9: ( ^( DAY_OF_WEEK dow= INT ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==DAY_OF_WEEK) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateWalker.g:43:10: ^( DAY_OF_WEEK dow= INT )
                    {
                    match(input,DAY_OF_WEEK,FOLLOW_DAY_OF_WEEK_in_explicit_date203); 

                    match(input, Token.DOWN, null); 
                    dow=(CommonTree)match(input,INT,FOLLOW_INT_in_explicit_date207); 

                    match(input, Token.UP, null); 

                    }
                    break;

            }

            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateWalker.g:43:35: ( ^( YEAR_OF year= INT ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==YEAR_OF) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateWalker.g:43:36: ^( YEAR_OF year= INT )
                    {
                    match(input,YEAR_OF,FOLLOW_YEAR_OF_in_explicit_date214); 

                    match(input, Token.DOWN, null); 
                    year=(CommonTree)match(input,INT,FOLLOW_INT_in_explicit_date218); 

                    match(input, Token.UP, null); 

                    }
                    break;

            }


            match(input, Token.UP, null); 
            _walkerState.setExplicitDate((month!=null?month.getText():null), (dom!=null?dom.getText():null), (dow!=null?dow.getText():null), (year!=null?year.getText():null));

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "explicit_date"


    // $ANTLR start "time"
    // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateWalker.g:47:1: time : ^( EXPLICIT_TIME ^( HOURS_OF_DAY hours= INT ) ^( MINUTES_OF_HOUR minutes= INT ) ( ^( SECONDS_OF_MINUTE seconds= INT ) )? ( AM_PM )? (zone= ZONE | zone= ZONE_OFFSET )? ) ;
    public final void time() throws RecognitionException {
        CommonTree hours=null;
        CommonTree minutes=null;
        CommonTree seconds=null;
        CommonTree zone=null;
        CommonTree AM_PM1=null;

        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateWalker.g:48:3: ( ^( EXPLICIT_TIME ^( HOURS_OF_DAY hours= INT ) ^( MINUTES_OF_HOUR minutes= INT ) ( ^( SECONDS_OF_MINUTE seconds= INT ) )? ( AM_PM )? (zone= ZONE | zone= ZONE_OFFSET )? ) )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateWalker.g:48:5: ^( EXPLICIT_TIME ^( HOURS_OF_DAY hours= INT ) ^( MINUTES_OF_HOUR minutes= INT ) ( ^( SECONDS_OF_MINUTE seconds= INT ) )? ( AM_PM )? (zone= ZONE | zone= ZONE_OFFSET )? )
            {
            match(input,EXPLICIT_TIME,FOLLOW_EXPLICIT_TIME_in_time244); 

            match(input, Token.DOWN, null); 
            match(input,HOURS_OF_DAY,FOLLOW_HOURS_OF_DAY_in_time247); 

            match(input, Token.DOWN, null); 
            hours=(CommonTree)match(input,INT,FOLLOW_INT_in_time251); 

            match(input, Token.UP, null); 
            match(input,MINUTES_OF_HOUR,FOLLOW_MINUTES_OF_HOUR_in_time255); 

            match(input, Token.DOWN, null); 
            minutes=(CommonTree)match(input,INT,FOLLOW_INT_in_time259); 

            match(input, Token.UP, null); 
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateWalker.g:49:9: ( ^( SECONDS_OF_MINUTE seconds= INT ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==SECONDS_OF_MINUTE) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateWalker.g:49:10: ^( SECONDS_OF_MINUTE seconds= INT )
                    {
                    match(input,SECONDS_OF_MINUTE,FOLLOW_SECONDS_OF_MINUTE_in_time273); 

                    match(input, Token.DOWN, null); 
                    seconds=(CommonTree)match(input,INT,FOLLOW_INT_in_time277); 

                    match(input, Token.UP, null); 

                    }
                    break;

            }

            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateWalker.g:49:45: ( AM_PM )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==AM_PM) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateWalker.g:49:45: AM_PM
                    {
                    AM_PM1=(CommonTree)match(input,AM_PM,FOLLOW_AM_PM_in_time282); 

                    }
                    break;

            }

            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateWalker.g:49:52: (zone= ZONE | zone= ZONE_OFFSET )?
            int alt10=3;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==ZONE) ) {
                alt10=1;
            }
            else if ( (LA10_0==ZONE_OFFSET) ) {
                alt10=2;
            }
            switch (alt10) {
                case 1 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateWalker.g:49:53: zone= ZONE
                    {
                    zone=(CommonTree)match(input,ZONE,FOLLOW_ZONE_in_time288); 

                    }
                    break;
                case 2 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateWalker.g:49:65: zone= ZONE_OFFSET
                    {
                    zone=(CommonTree)match(input,ZONE_OFFSET,FOLLOW_ZONE_OFFSET_in_time294); 

                    }
                    break;

            }


            match(input, Token.UP, null); 
            _walkerState.setExplicitTime((hours!=null?hours.getText():null), (minutes!=null?minutes.getText():null), (seconds!=null?seconds.getText():null), (AM_PM1!=null?AM_PM1.getText():null), (zone!=null?zone.getText():null));

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "time"


    // $ANTLR start "seek"
    // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateWalker.g:53:1: seek : ( ^( SEEK DIRECTION by= SEEK_BY amount= INT ^( DAY_OF_WEEK day= INT ) ( date )? ) | ^( SEEK DIRECTION SEEK_BY amount= INT ^( MONTH_OF_YEAR month= INT ) ) | ^( SEEK DIRECTION SEEK_BY INT SPAN ) | ^( SEEK DIRECTION SEEK_BY INT date ) );
    public final void seek() throws RecognitionException {
        CommonTree by=null;
        CommonTree amount=null;
        CommonTree day=null;
        CommonTree month=null;
        CommonTree DIRECTION2=null;
        CommonTree DIRECTION3=null;
        CommonTree DIRECTION4=null;
        CommonTree INT5=null;
        CommonTree SPAN6=null;
        CommonTree DIRECTION7=null;
        CommonTree INT8=null;

        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateWalker.g:54:3: ( ^( SEEK DIRECTION by= SEEK_BY amount= INT ^( DAY_OF_WEEK day= INT ) ( date )? ) | ^( SEEK DIRECTION SEEK_BY amount= INT ^( MONTH_OF_YEAR month= INT ) ) | ^( SEEK DIRECTION SEEK_BY INT SPAN ) | ^( SEEK DIRECTION SEEK_BY INT date ) )
            int alt12=4;
            alt12 = dfa12.predict(input);
            switch (alt12) {
                case 1 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateWalker.g:54:5: ^( SEEK DIRECTION by= SEEK_BY amount= INT ^( DAY_OF_WEEK day= INT ) ( date )? )
                    {
                    match(input,SEEK,FOLLOW_SEEK_in_seek319); 

                    match(input, Token.DOWN, null); 
                    DIRECTION2=(CommonTree)match(input,DIRECTION,FOLLOW_DIRECTION_in_seek321); 
                    by=(CommonTree)match(input,SEEK_BY,FOLLOW_SEEK_BY_in_seek325); 
                    amount=(CommonTree)match(input,INT,FOLLOW_INT_in_seek329); 
                    match(input,DAY_OF_WEEK,FOLLOW_DAY_OF_WEEK_in_seek332); 

                    match(input, Token.DOWN, null); 
                    day=(CommonTree)match(input,INT,FOLLOW_INT_in_seek336); 

                    match(input, Token.UP, null); 
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateWalker.g:54:67: ( date )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( ((LA11_0>=EXPLICIT_DATE && LA11_0<=RELATIVE_DATE)) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateWalker.g:54:67: date
                            {
                            pushFollow(FOLLOW_date_in_seek339);
                            date();

                            state._fsp--;


                            }
                            break;

                    }


                    match(input, Token.UP, null); 
                    _walkerState.seekToDayOfWeek((DIRECTION2!=null?DIRECTION2.getText():null), (by!=null?by.getText():null), (amount!=null?amount.getText():null), (day!=null?day.getText():null));

                    }
                    break;
                case 2 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateWalker.g:57:5: ^( SEEK DIRECTION SEEK_BY amount= INT ^( MONTH_OF_YEAR month= INT ) )
                    {
                    match(input,SEEK,FOLLOW_SEEK_in_seek359); 

                    match(input, Token.DOWN, null); 
                    DIRECTION3=(CommonTree)match(input,DIRECTION,FOLLOW_DIRECTION_in_seek361); 
                    match(input,SEEK_BY,FOLLOW_SEEK_BY_in_seek363); 
                    amount=(CommonTree)match(input,INT,FOLLOW_INT_in_seek367); 
                    match(input,MONTH_OF_YEAR,FOLLOW_MONTH_OF_YEAR_in_seek370); 

                    match(input, Token.DOWN, null); 
                    month=(CommonTree)match(input,INT,FOLLOW_INT_in_seek374); 

                    match(input, Token.UP, null); 

                    match(input, Token.UP, null); 
                    _walkerState.seekToMonth((DIRECTION3!=null?DIRECTION3.getText():null), (amount!=null?amount.getText():null), (month!=null?month.getText():null));

                    }
                    break;
                case 3 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateWalker.g:60:5: ^( SEEK DIRECTION SEEK_BY INT SPAN )
                    {
                    match(input,SEEK,FOLLOW_SEEK_in_seek392); 

                    match(input, Token.DOWN, null); 
                    DIRECTION4=(CommonTree)match(input,DIRECTION,FOLLOW_DIRECTION_in_seek394); 
                    match(input,SEEK_BY,FOLLOW_SEEK_BY_in_seek396); 
                    INT5=(CommonTree)match(input,INT,FOLLOW_INT_in_seek398); 
                    SPAN6=(CommonTree)match(input,SPAN,FOLLOW_SPAN_in_seek400); 

                    match(input, Token.UP, null); 
                    _walkerState.seekBySpan((DIRECTION4!=null?DIRECTION4.getText():null), (INT5!=null?INT5.getText():null), (SPAN6!=null?SPAN6.getText():null));

                    }
                    break;
                case 4 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateWalker.g:63:5: ^( SEEK DIRECTION SEEK_BY INT date )
                    {
                    match(input,SEEK,FOLLOW_SEEK_in_seek417); 

                    match(input, Token.DOWN, null); 
                    DIRECTION7=(CommonTree)match(input,DIRECTION,FOLLOW_DIRECTION_in_seek419); 
                    match(input,SEEK_BY,FOLLOW_SEEK_BY_in_seek421); 
                    INT8=(CommonTree)match(input,INT,FOLLOW_INT_in_seek423); 
                    pushFollow(FOLLOW_date_in_seek425);
                    date();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    _walkerState.seekBySpan((DIRECTION7!=null?DIRECTION7.getText():null), (INT8!=null?INT8.getText():null), "day");

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "seek"

    // Delegated rules


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\12\uffff";
    static final String DFA12_eofS =
        "\12\uffff";
    static final String DFA12_minS =
        "\1\u00ee\1\2\1\u00ef\1\u00f0\1\u00e6\1\u00e7\4\uffff";
    static final String DFA12_maxS =
        "\1\u00ee\1\2\1\u00ef\1\u00f0\1\u00e6\1\u00f1\4\uffff";
    static final String DFA12_acceptS =
        "\6\uffff\1\1\1\2\1\3\1\4";
    static final String DFA12_specialS =
        "\12\uffff}>";
    static final String[] DFA12_transitionS = {
            "\1\1",
            "\1\2",
            "\1\3",
            "\1\4",
            "\1\5",
            "\1\7\1\uffff\1\6\2\uffff\2\11\3\uffff\1\10",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "53:1: seek : ( ^( SEEK DIRECTION by= SEEK_BY amount= INT ^( DAY_OF_WEEK day= INT ) ( date )? ) | ^( SEEK DIRECTION SEEK_BY amount= INT ^( MONTH_OF_YEAR month= INT ) ) | ^( SEEK DIRECTION SEEK_BY INT SPAN ) | ^( SEEK DIRECTION SEEK_BY INT date ) );";
        }
    }
 

    public static final BitSet FOLLOW_date_time_in_search45 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_DATE_TIME_in_date_time67 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_date_in_date_time69 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_time_in_date_time72 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_relative_date_in_date91 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_explicit_date_in_date98 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RELATIVE_DATE_in_relative_date114 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_seek_in_relative_date116 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_RELATIVE_DATE_in_relative_date127 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_WEEK_INDEX_in_relative_date130 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INT_in_relative_date134 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_DAY_OF_WEEK_in_relative_date137 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INT_in_relative_date141 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MONTH_OF_YEAR_in_relative_date145 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INT_in_relative_date149 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EXPLICIT_DATE_in_explicit_date174 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_MONTH_OF_YEAR_in_explicit_date177 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INT_in_explicit_date181 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DAY_OF_MONTH_in_explicit_date185 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INT_in_explicit_date189 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DAY_OF_WEEK_in_explicit_date203 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INT_in_explicit_date207 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_YEAR_OF_in_explicit_date214 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INT_in_explicit_date218 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EXPLICIT_TIME_in_time244 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_HOURS_OF_DAY_in_time247 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INT_in_time251 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MINUTES_OF_HOUR_in_time255 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INT_in_time259 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SECONDS_OF_MINUTE_in_time273 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INT_in_time277 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AM_PM_in_time282 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0300000000000000L});
    public static final BitSet FOLLOW_ZONE_in_time288 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ZONE_OFFSET_in_time294 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SEEK_in_seek319 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DIRECTION_in_seek321 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_SEEK_BY_in_seek325 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_INT_in_seek329 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_DAY_OF_WEEK_in_seek332 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INT_in_seek336 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_date_in_seek339 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SEEK_in_seek359 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DIRECTION_in_seek361 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_SEEK_BY_in_seek363 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_INT_in_seek367 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_MONTH_OF_YEAR_in_seek370 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INT_in_seek374 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SEEK_in_seek392 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DIRECTION_in_seek394 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_SEEK_BY_in_seek396 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_INT_in_seek398 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_SPAN_in_seek400 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SEEK_in_seek417 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DIRECTION_in_seek419 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_SEEK_BY_in_seek421 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_INT_in_seek423 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000300000000000L});
    public static final BitSet FOLLOW_date_in_seek425 = new BitSet(new long[]{0x0000000000000008L});

}