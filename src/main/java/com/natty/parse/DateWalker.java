// $ANTLR 3.2 Sep 23, 2009 12:02:23 /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g 2010-02-12 17:11:33
 package com.natty.parse; 

import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class DateWalker extends TreeParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "INT", "MONTH_OF_YEAR", "DAY_OF_MONTH", "DAY_OF_WEEK", "YEAR_OF", "DATE_TIME", "EXPLICIT_DATE", "RELATIVE_DATE", "SEEK", "DIRECTION", "SEEK_BY", "SPAN", "WEEK_INDEX", "EXPLICIT_TIME", "HOURS_OF_DAY", "MINUTES_OF_HOUR", "AM_PM", "ZONE", "WHITE_SPACE", "AT", "COMMA", "ON", "THE", "DAY", "AFTER", "BEFORE", "OF", "JANUARY", "FEBRUARY", "MARCH", "APRIL", "MAY", "JUNE", "JULY", "AUGUST", "SEPTEMBER", "OCTOBER", "NOVEMBER", "DECEMBER", "SINGLE_QUOTE", "IN", "YEAR", "DASH", "SLASH", "FIRST", "SECOND", "THIRD", "FOURTH", "FIFTH", "LAST", "THIS", "NEXT", "PAST", "COMING", "UPCOMING", "FROM", "NOW", "AGO", "WEEK", "MONTH", "SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY", "TODAY", "TOMORROW", "YESTERDAY", "COLON", "MILITARY_HOUR_SUFFIX", "HOUR", "AM", "PM", "NOON", "MIDNIGHT", "UTC", "EST", "CST", "PST", "MST", "AKST", "HAST", "INT_00", "INT_0", "ONE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", "NINE", "TEN", "ELEVEN", "TWELVE", "THIRTEEN", "FOURTEEN", "FIFTEEN", "SIXTEEN", "SEVENTEEN", "EIGHTEEN", "NINETEEN", "TWENTY", "THIRTY", "SIXTH", "SEVENTH", "EIGHTH", "NINTH", "TENTH", "ELEVENTH", "TWELFTH", "THIRTEENTH", "FOURTEENTH", "FIFTEENTH", "SIXTEENTH", "SEVENTEENTH", "EIGHTEENTH", "NINETEENTH", "TWENTIETH", "TWENTY_FIRST", "TWENTY_SECOND", "TWENTY_THIRD", "TWENTY_FOURTH", "TWENTY_FIFTH", "TWENTY_SIXTH", "TWENTY_SEVENTH", "TWENTY_EIGHTH", "TWENTY_NINTH", "THIRTIETH", "THIRTY_FIRST", "DOT", "INT_60", "INT_61", "INT_62", "INT_63", "INT_64", "INT_65", "INT_66", "INT_67", "INT_68", "INT_69", "INT_70", "INT_71", "INT_72", "INT_73", "INT_74", "INT_75", "INT_76", "INT_77", "INT_78", "INT_79", "INT_80", "INT_81", "INT_82", "INT_83", "INT_84", "INT_85", "INT_86", "INT_87", "INT_88", "INT_89", "INT_90", "INT_91", "INT_92", "INT_93", "INT_94", "INT_95", "INT_96", "INT_97", "INT_98", "INT_99", "INT_32", "INT_33", "INT_34", "INT_35", "INT_36", "INT_37", "INT_38", "INT_39", "INT_40", "INT_41", "INT_42", "INT_43", "INT_44", "INT_45", "INT_46", "INT_47", "INT_48", "INT_49", "INT_50", "INT_51", "INT_52", "INT_53", "INT_54", "INT_55", "INT_56", "INT_57", "INT_58", "INT_59", "INT_24", "INT_25", "INT_26", "INT_27", "INT_28", "INT_29", "INT_30", "INT_31", "INT_13", "INT_14", "INT_15", "INT_16", "INT_17", "INT_18", "INT_19", "INT_20", "INT_21", "INT_22", "INT_23", "INT_01", "INT_02", "INT_03", "INT_04", "INT_05", "INT_06", "INT_07", "INT_08", "INT_09", "INT_10", "INT_11", "INT_12", "INT_1", "INT_2", "INT_3", "INT_4", "INT_5", "INT_6", "INT_7", "INT_8", "INT_9", "UNKNOWN", "EXPLICIT"
    };
    public static final int DIRECTION=13;
    public static final int NINETEEN=108;
    public static final int INT_08=232;
    public static final int INT_09=233;
    public static final int TWENTY=109;
    public static final int INT_02=226;
    public static final int INT_03=227;
    public static final int INT_00=88;
    public static final int APRIL=34;
    public static final int INT_01=225;
    public static final int INT_06=230;
    public static final int COMING=57;
    public static final int INT_07=231;
    public static final int INT_04=228;
    public static final int INT_05=229;
    public static final int NOW=60;
    public static final int EOF=-1;
    public static final int MONTH=63;
    public static final int AM_PM=20;
    public static final int EIGHTEENTH=123;
    public static final int SPAN=15;
    public static final int THIS=54;
    public static final int NOON=79;
    public static final int TOMORROW=72;
    public static final int TODAY=71;
    public static final int FIFTEENTH=120;
    public static final int NOVEMBER=41;
    public static final int MONTH_OF_YEAR=5;
    public static final int SEVENTH=112;
    public static final int FEBRUARY=32;
    public static final int SUNDAY=64;
    public static final int DAY_OF_WEEK=7;
    public static final int SEVEN=96;
    public static final int ELEVEN=100;
    public static final int THIRTEEN=102;
    public static final int EXPLICIT_DATE=10;
    public static final int INT=4;
    public static final int UPCOMING=58;
    public static final int SIX=95;
    public static final int FIFTH=52;
    public static final int TWENTY_NINTH=134;
    public static final int DECEMBER=42;
    public static final int AUGUST=38;
    public static final int TUESDAY=66;
    public static final int THIRD=50;
    public static final int INT_47=193;
    public static final int INT_46=192;
    public static final int INT_45=191;
    public static final int INT_44=190;
    public static final int INT_49=195;
    public static final int INT_48=194;
    public static final int THE=26;
    public static final int EXPLICIT=247;
    public static final int WHITE_SPACE=22;
    public static final int INT_42=188;
    public static final int INT_43=189;
    public static final int INT_40=186;
    public static final int FRIDAY=69;
    public static final int INT_41=187;
    public static final int INT_34=180;
    public static final int AT=23;
    public static final int INT_33=179;
    public static final int INT_36=182;
    public static final int SINGLE_QUOTE=43;
    public static final int INT_35=181;
    public static final int INT_38=184;
    public static final int SLASH=47;
    public static final int INT_37=183;
    public static final int INT_39=185;
    public static final int NINTH=114;
    public static final int ZONE=21;
    public static final int TWENTIETH=125;
    public static final int INT_30=212;
    public static final int AM=77;
    public static final int INT_31=213;
    public static final int INT_32=178;
    public static final int INT_29=211;
    public static final int INT_28=210;
    public static final int INT_27=209;
    public static final int INT_26=208;
    public static final int INT_25=207;
    public static final int INT_24=206;
    public static final int INT_23=224;
    public static final int INT_22=223;
    public static final int FOURTEENTH=119;
    public static final int SIXTEEN=105;
    public static final int AGO=61;
    public static final int ELEVENTH=116;
    public static final int TWO=91;
    public static final int INT_20=221;
    public static final int HOUR=76;
    public static final int INT_21=222;
    public static final int JANUARY=31;
    public static final int THIRTEENTH=118;
    public static final int INT_16=217;
    public static final int COLON=74;
    public static final int INT_15=216;
    public static final int INT_18=219;
    public static final int INT_17=218;
    public static final int INT_12=236;
    public static final int INT_11=235;
    public static final int INT_14=215;
    public static final int INT_13=214;
    public static final int INT_19=220;
    public static final int DAY_OF_MONTH=6;
    public static final int FIFTEEN=104;
    public static final int NINE=98;
    public static final int THREE=92;
    public static final int FOURTEEN=103;
    public static final int INT_10=234;
    public static final int YESTERDAY=73;
    public static final int SEVENTEENTH=122;
    public static final int FIRST=48;
    public static final int INT_81=159;
    public static final int INT_80=158;
    public static final int WEEK=62;
    public static final int SEPTEMBER=39;
    public static final int INT_83=161;
    public static final int INT_82=160;
    public static final int INT_85=163;
    public static final int INT_84=162;
    public static final int WEDNESDAY=67;
    public static final int INT_87=165;
    public static final int TWENTY_EIGHTH=133;
    public static final int INT_86=164;
    public static final int JULY=37;
    public static final int NINETEENTH=124;
    public static final int OCTOBER=40;
    public static final int ONE=90;
    public static final int DAY=27;
    public static final int MIDNIGHT=80;
    public static final int INT_88=166;
    public static final int MARCH=33;
    public static final int INT_89=167;
    public static final int PAST=56;
    public static final int SEVENTEEN=106;
    public static final int DATE_TIME=9;
    public static final int INT_72=150;
    public static final int INT_71=149;
    public static final int INT_70=148;
    public static final int INT_76=154;
    public static final int INT_75=153;
    public static final int TWENTY_SEVENTH=132;
    public static final int INT_74=152;
    public static final int INT_73=151;
    public static final int TWENTY_FIFTH=130;
    public static final int MINUTES_OF_HOUR=19;
    public static final int THIRTIETH=135;
    public static final int LAST=53;
    public static final int INT_79=157;
    public static final int EIGHTEEN=107;
    public static final int INT_77=155;
    public static final int INT_78=156;
    public static final int RELATIVE_DATE=11;
    public static final int INT_63=141;
    public static final int INT_62=140;
    public static final int INT_65=143;
    public static final int FOURTH=51;
    public static final int INT_64=142;
    public static final int SECOND=49;
    public static final int INT_61=139;
    public static final int INT_60=138;
    public static final int SATURDAY=70;
    public static final int FOUR=93;
    public static final int TEN=99;
    public static final int ON=25;
    public static final int MONDAY=65;
    public static final int JUNE=36;
    public static final int OF=30;
    public static final int INT_66=144;
    public static final int INT_67=145;
    public static final int INT_68=146;
    public static final int INT_69=147;
    public static final int INT_54=200;
    public static final int INT_53=199;
    public static final int INT_52=198;
    public static final int INT_51=197;
    public static final int INT_50=196;
    public static final int THURSDAY=68;
    public static final int SEEK_BY=14;
    public static final int PM=78;
    public static final int EXPLICIT_TIME=17;
    public static final int FROM=59;
    public static final int INT_59=205;
    public static final int INT_57=203;
    public static final int INT_58=204;
    public static final int EIGHTH=113;
    public static final int INT_55=201;
    public static final int INT_56=202;
    public static final int HOURS_OF_DAY=18;
    public static final int YEAR=45;
    public static final int TENTH=115;
    public static final int MAY=35;
    public static final int INT_9=245;
    public static final int TWENTY_FOURTH=129;
    public static final int INT_8=244;
    public static final int INT_7=243;
    public static final int INT_6=242;
    public static final int UTC=81;
    public static final int INT_5=241;
    public static final int INT_4=240;
    public static final int AKST=86;
    public static final int INT_3=239;
    public static final int MST=85;
    public static final int INT_2=238;
    public static final int EIGHT=97;
    public static final int INT_1=237;
    public static final int INT_0=89;
    public static final int TWENTY_SIXTH=131;
    public static final int CST=83;
    public static final int IN=44;
    public static final int PST=84;
    public static final int UNKNOWN=246;
    public static final int COMMA=24;
    public static final int FIVE=94;
    public static final int THIRTY=110;
    public static final int TWENTY_SECOND=127;
    public static final int NEXT=55;
    public static final int DOT=137;
    public static final int MILITARY_HOUR_SUFFIX=75;
    public static final int EST=82;
    public static final int HAST=87;
    public static final int DASH=46;
    public static final int YEAR_OF=8;
    public static final int TWELVE=101;
    public static final int WEEK_INDEX=16;
    public static final int BEFORE=29;
    public static final int AFTER=28;
    public static final int SIXTEENTH=121;
    public static final int SEEK=12;
    public static final int INT_90=168;
    public static final int INT_97=175;
    public static final int INT_98=176;
    public static final int INT_95=173;
    public static final int INT_96=174;
    public static final int INT_93=171;
    public static final int INT_94=172;
    public static final int INT_91=169;
    public static final int INT_92=170;
    public static final int TWELFTH=117;
    public static final int INT_99=177;
    public static final int SIXTH=111;
    public static final int TWENTY_FIRST=126;
    public static final int TWENTY_THIRD=128;
    public static final int THIRTY_FIRST=136;

    // delegates
    // delegators


        public DateWalker(TreeNodeStream input) {
            this(input, new RecognizerSharedState());
        }
        public DateWalker(TreeNodeStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return DateWalker.tokenNames; }
    public String getGrammarFileName() { return "/Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g"; }


      private WalkerState _walkerState = new WalkerState();
      
      public WalkerState getState() {
        return _walkerState;
      }



    // $ANTLR start "date_time"
    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:18:1: date_time : ^( DATE_TIME ( date )? ( time )? ) ;
    public final void date_time() throws RecognitionException {
        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:19:3: ( ^( DATE_TIME ( date )? ( time )? ) )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:19:5: ^( DATE_TIME ( date )? ( time )? )
            {
            match(input,DATE_TIME,FOLLOW_DATE_TIME_in_date_time46); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:19:17: ( date )?
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=EXPLICIT_DATE && LA1_0<=RELATIVE_DATE)) ) {
                    alt1=1;
                }
                switch (alt1) {
                    case 1 :
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:19:17: date
                        {
                        pushFollow(FOLLOW_date_in_date_time48);
                        date();

                        state._fsp--;


                        }
                        break;

                }

                // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:19:23: ( time )?
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==EXPLICIT_TIME) ) {
                    alt2=1;
                }
                switch (alt2) {
                    case 1 :
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:19:23: time
                        {
                        pushFollow(FOLLOW_time_in_date_time51);
                        time();

                        state._fsp--;


                        }
                        break;

                }


                match(input, Token.UP, null); 
            }

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
    // $ANTLR end "date_time"


    // $ANTLR start "date"
    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:22:1: date : ( relative_date | explicit_date );
    public final void date() throws RecognitionException {
        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:23:3: ( relative_date | explicit_date )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RELATIVE_DATE) ) {
                alt3=1;
            }
            else if ( (LA3_0==EXPLICIT_DATE) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:23:5: relative_date
                    {
                    pushFollow(FOLLOW_relative_date_in_date70);
                    relative_date();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:24:5: explicit_date
                    {
                    pushFollow(FOLLOW_explicit_date_in_date77);
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
    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:27:1: relative_date : ( ^( RELATIVE_DATE seek ) | ^( RELATIVE_DATE ^( WEEK_INDEX index= INT ^( DAY_OF_WEEK day= INT ) ^( MONTH_OF_YEAR month= INT ) ) ) );
    public final void relative_date() throws RecognitionException {
        CommonTree index=null;
        CommonTree day=null;
        CommonTree month=null;

        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:28:3: ( ^( RELATIVE_DATE seek ) | ^( RELATIVE_DATE ^( WEEK_INDEX index= INT ^( DAY_OF_WEEK day= INT ) ^( MONTH_OF_YEAR month= INT ) ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RELATIVE_DATE) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==DOWN) ) {
                    int LA4_2 = input.LA(3);

                    if ( (LA4_2==WEEK_INDEX) ) {
                        alt4=2;
                    }
                    else if ( (LA4_2==SEEK) ) {
                        alt4=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:28:5: ^( RELATIVE_DATE seek )
                    {
                    match(input,RELATIVE_DATE,FOLLOW_RELATIVE_DATE_in_relative_date93); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_seek_in_relative_date95);
                    seek();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 2 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:30:5: ^( RELATIVE_DATE ^( WEEK_INDEX index= INT ^( DAY_OF_WEEK day= INT ) ^( MONTH_OF_YEAR month= INT ) ) )
                    {
                    match(input,RELATIVE_DATE,FOLLOW_RELATIVE_DATE_in_relative_date106); 

                    match(input, Token.DOWN, null); 
                    match(input,WEEK_INDEX,FOLLOW_WEEK_INDEX_in_relative_date109); 

                    match(input, Token.DOWN, null); 
                    index=(CommonTree)match(input,INT,FOLLOW_INT_in_relative_date113); 
                    match(input,DAY_OF_WEEK,FOLLOW_DAY_OF_WEEK_in_relative_date116); 

                    match(input, Token.DOWN, null); 
                    day=(CommonTree)match(input,INT,FOLLOW_INT_in_relative_date120); 

                    match(input, Token.UP, null); 
                    match(input,MONTH_OF_YEAR,FOLLOW_MONTH_OF_YEAR_in_relative_date124); 

                    match(input, Token.DOWN, null); 
                    month=(CommonTree)match(input,INT,FOLLOW_INT_in_relative_date128); 

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


    // $ANTLR start "relaxed_date"
    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:34:1: relaxed_date : ^( EXPLICIT seek ) ;
    public final void relaxed_date() throws RecognitionException {
        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:35:3: ( ^( EXPLICIT seek ) )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:35:5: ^( EXPLICIT seek )
            {
            match(input,EXPLICIT,FOLLOW_EXPLICIT_in_relaxed_date153); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_seek_in_relaxed_date155);
            seek();

            state._fsp--;


            match(input, Token.UP, null); 

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
    // $ANTLR end "relaxed_date"


    // $ANTLR start "explicit_date"
    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:38:1: explicit_date : ( ^( EXPLICIT_DATE ^( MONTH_OF_YEAR month= INT ) ^( DAY_OF_MONTH day= INT ) ) | ^( EXPLICIT_DATE ^( MONTH_OF_YEAR month= INT ) ^( DAY_OF_MONTH day= INT ) ^( YEAR_OF year= INT ) ) );
    public final void explicit_date() throws RecognitionException {
        CommonTree month=null;
        CommonTree day=null;
        CommonTree year=null;

        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:39:3: ( ^( EXPLICIT_DATE ^( MONTH_OF_YEAR month= INT ) ^( DAY_OF_MONTH day= INT ) ) | ^( EXPLICIT_DATE ^( MONTH_OF_YEAR month= INT ) ^( DAY_OF_MONTH day= INT ) ^( YEAR_OF year= INT ) ) )
            int alt5=2;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:39:5: ^( EXPLICIT_DATE ^( MONTH_OF_YEAR month= INT ) ^( DAY_OF_MONTH day= INT ) )
                    {
                    match(input,EXPLICIT_DATE,FOLLOW_EXPLICIT_DATE_in_explicit_date172); 

                    match(input, Token.DOWN, null); 
                    match(input,MONTH_OF_YEAR,FOLLOW_MONTH_OF_YEAR_in_explicit_date175); 

                    match(input, Token.DOWN, null); 
                    month=(CommonTree)match(input,INT,FOLLOW_INT_in_explicit_date179); 

                    match(input, Token.UP, null); 
                    match(input,DAY_OF_MONTH,FOLLOW_DAY_OF_MONTH_in_explicit_date183); 

                    match(input, Token.DOWN, null); 
                    day=(CommonTree)match(input,INT,FOLLOW_INT_in_explicit_date187); 

                    match(input, Token.UP, null); 

                    match(input, Token.UP, null); 
                    _walkerState.setExplicitDate((month!=null?month.getText():null), (day!=null?day.getText():null), null);

                    }
                    break;
                case 2 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:42:5: ^( EXPLICIT_DATE ^( MONTH_OF_YEAR month= INT ) ^( DAY_OF_MONTH day= INT ) ^( YEAR_OF year= INT ) )
                    {
                    match(input,EXPLICIT_DATE,FOLLOW_EXPLICIT_DATE_in_explicit_date207); 

                    match(input, Token.DOWN, null); 
                    match(input,MONTH_OF_YEAR,FOLLOW_MONTH_OF_YEAR_in_explicit_date210); 

                    match(input, Token.DOWN, null); 
                    month=(CommonTree)match(input,INT,FOLLOW_INT_in_explicit_date214); 

                    match(input, Token.UP, null); 
                    match(input,DAY_OF_MONTH,FOLLOW_DAY_OF_MONTH_in_explicit_date218); 

                    match(input, Token.DOWN, null); 
                    day=(CommonTree)match(input,INT,FOLLOW_INT_in_explicit_date222); 

                    match(input, Token.UP, null); 
                    match(input,YEAR_OF,FOLLOW_YEAR_OF_in_explicit_date226); 

                    match(input, Token.DOWN, null); 
                    year=(CommonTree)match(input,INT,FOLLOW_INT_in_explicit_date230); 

                    match(input, Token.UP, null); 

                    match(input, Token.UP, null); 
                    _walkerState.setExplicitDate((month!=null?month.getText():null), (day!=null?day.getText():null), (year!=null?year.getText():null));

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
    // $ANTLR end "explicit_date"


    // $ANTLR start "time"
    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:46:1: time : ^( EXPLICIT_TIME ^( HOURS_OF_DAY hours= INT ) ^( MINUTES_OF_HOUR minutes= INT ) ( AM_PM )? ( ZONE )? ) ;
    public final void time() throws RecognitionException {
        CommonTree hours=null;
        CommonTree minutes=null;
        CommonTree AM_PM1=null;
        CommonTree ZONE2=null;

        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:47:3: ( ^( EXPLICIT_TIME ^( HOURS_OF_DAY hours= INT ) ^( MINUTES_OF_HOUR minutes= INT ) ( AM_PM )? ( ZONE )? ) )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:47:5: ^( EXPLICIT_TIME ^( HOURS_OF_DAY hours= INT ) ^( MINUTES_OF_HOUR minutes= INT ) ( AM_PM )? ( ZONE )? )
            {
            match(input,EXPLICIT_TIME,FOLLOW_EXPLICIT_TIME_in_time254); 

            match(input, Token.DOWN, null); 
            match(input,HOURS_OF_DAY,FOLLOW_HOURS_OF_DAY_in_time257); 

            match(input, Token.DOWN, null); 
            hours=(CommonTree)match(input,INT,FOLLOW_INT_in_time261); 

            match(input, Token.UP, null); 
            match(input,MINUTES_OF_HOUR,FOLLOW_MINUTES_OF_HOUR_in_time265); 

            match(input, Token.DOWN, null); 
            minutes=(CommonTree)match(input,INT,FOLLOW_INT_in_time269); 

            match(input, Token.UP, null); 
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:47:78: ( AM_PM )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==AM_PM) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:47:78: AM_PM
                    {
                    AM_PM1=(CommonTree)match(input,AM_PM,FOLLOW_AM_PM_in_time272); 

                    }
                    break;

            }

            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:47:85: ( ZONE )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==ZONE) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:47:85: ZONE
                    {
                    ZONE2=(CommonTree)match(input,ZONE,FOLLOW_ZONE_in_time275); 

                    }
                    break;

            }


            match(input, Token.UP, null); 
            _walkerState.setExplicitTime((hours!=null?hours.getText():null), (minutes!=null?minutes.getText():null), (AM_PM1!=null?AM_PM1.getText():null), (ZONE2!=null?ZONE2.getText():null));

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
    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:51:1: seek : ( ^( SEEK DIRECTION by= SEEK_BY amount= INT ^( DAY_OF_WEEK day= INT ) ) | ^( SEEK DIRECTION SEEK_BY amount= INT ^( MONTH_OF_YEAR month= INT ) ) | ^( SEEK DIRECTION SEEK_BY INT SPAN ) | ^( SEEK DIRECTION SEEK_BY INT date ) );
    public final void seek() throws RecognitionException {
        CommonTree by=null;
        CommonTree amount=null;
        CommonTree day=null;
        CommonTree month=null;
        CommonTree DIRECTION3=null;
        CommonTree DIRECTION4=null;
        CommonTree DIRECTION5=null;
        CommonTree INT6=null;
        CommonTree SPAN7=null;
        CommonTree DIRECTION8=null;
        CommonTree INT9=null;

        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:52:3: ( ^( SEEK DIRECTION by= SEEK_BY amount= INT ^( DAY_OF_WEEK day= INT ) ) | ^( SEEK DIRECTION SEEK_BY amount= INT ^( MONTH_OF_YEAR month= INT ) ) | ^( SEEK DIRECTION SEEK_BY INT SPAN ) | ^( SEEK DIRECTION SEEK_BY INT date ) )
            int alt8=4;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:52:5: ^( SEEK DIRECTION by= SEEK_BY amount= INT ^( DAY_OF_WEEK day= INT ) )
                    {
                    match(input,SEEK,FOLLOW_SEEK_in_seek299); 

                    match(input, Token.DOWN, null); 
                    DIRECTION3=(CommonTree)match(input,DIRECTION,FOLLOW_DIRECTION_in_seek301); 
                    by=(CommonTree)match(input,SEEK_BY,FOLLOW_SEEK_BY_in_seek305); 
                    amount=(CommonTree)match(input,INT,FOLLOW_INT_in_seek309); 
                    match(input,DAY_OF_WEEK,FOLLOW_DAY_OF_WEEK_in_seek312); 

                    match(input, Token.DOWN, null); 
                    day=(CommonTree)match(input,INT,FOLLOW_INT_in_seek316); 

                    match(input, Token.UP, null); 

                    match(input, Token.UP, null); 
                    _walkerState.seekToDayOfWeek((DIRECTION3!=null?DIRECTION3.getText():null), (by!=null?by.getText():null), (amount!=null?amount.getText():null), (day!=null?day.getText():null));

                    }
                    break;
                case 2 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:55:5: ^( SEEK DIRECTION SEEK_BY amount= INT ^( MONTH_OF_YEAR month= INT ) )
                    {
                    match(input,SEEK,FOLLOW_SEEK_in_seek336); 

                    match(input, Token.DOWN, null); 
                    DIRECTION4=(CommonTree)match(input,DIRECTION,FOLLOW_DIRECTION_in_seek338); 
                    match(input,SEEK_BY,FOLLOW_SEEK_BY_in_seek340); 
                    amount=(CommonTree)match(input,INT,FOLLOW_INT_in_seek344); 
                    match(input,MONTH_OF_YEAR,FOLLOW_MONTH_OF_YEAR_in_seek347); 

                    match(input, Token.DOWN, null); 
                    month=(CommonTree)match(input,INT,FOLLOW_INT_in_seek351); 

                    match(input, Token.UP, null); 

                    match(input, Token.UP, null); 
                    _walkerState.seekToMonth((DIRECTION4!=null?DIRECTION4.getText():null), (amount!=null?amount.getText():null), (month!=null?month.getText():null));

                    }
                    break;
                case 3 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:58:5: ^( SEEK DIRECTION SEEK_BY INT SPAN )
                    {
                    match(input,SEEK,FOLLOW_SEEK_in_seek369); 

                    match(input, Token.DOWN, null); 
                    DIRECTION5=(CommonTree)match(input,DIRECTION,FOLLOW_DIRECTION_in_seek371); 
                    match(input,SEEK_BY,FOLLOW_SEEK_BY_in_seek373); 
                    INT6=(CommonTree)match(input,INT,FOLLOW_INT_in_seek375); 
                    SPAN7=(CommonTree)match(input,SPAN,FOLLOW_SPAN_in_seek377); 

                    match(input, Token.UP, null); 
                    _walkerState.seekBySpan((DIRECTION5!=null?DIRECTION5.getText():null), (INT6!=null?INT6.getText():null), (SPAN7!=null?SPAN7.getText():null));

                    }
                    break;
                case 4 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:61:5: ^( SEEK DIRECTION SEEK_BY INT date )
                    {
                    match(input,SEEK,FOLLOW_SEEK_in_seek394); 

                    match(input, Token.DOWN, null); 
                    DIRECTION8=(CommonTree)match(input,DIRECTION,FOLLOW_DIRECTION_in_seek396); 
                    match(input,SEEK_BY,FOLLOW_SEEK_BY_in_seek398); 
                    INT9=(CommonTree)match(input,INT,FOLLOW_INT_in_seek400); 
                    pushFollow(FOLLOW_date_in_seek402);
                    date();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    _walkerState.seekBySpan((DIRECTION8!=null?DIRECTION8.getText():null), (INT9!=null?INT9.getText():null), "day");

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


    protected DFA5 dfa5 = new DFA5(this);
    protected DFA8 dfa8 = new DFA8(this);
    static final String DFA5_eotS =
        "\15\uffff";
    static final String DFA5_eofS =
        "\15\uffff";
    static final String DFA5_minS =
        "\1\12\1\2\1\5\1\2\1\4\1\3\1\6\1\2\1\4\2\3\2\uffff";
    static final String DFA5_maxS =
        "\1\12\1\2\1\5\1\2\1\4\1\3\1\6\1\2\1\4\1\3\1\10\2\uffff";
    static final String DFA5_acceptS =
        "\13\uffff\1\1\1\2";
    static final String DFA5_specialS =
        "\15\uffff}>";
    static final String[] DFA5_transitionS = {
            "\1\1",
            "\1\2",
            "\1\3",
            "\1\4",
            "\1\5",
            "\1\6",
            "\1\7",
            "\1\10",
            "\1\11",
            "\1\12",
            "\1\13\4\uffff\1\14",
            "",
            ""
    };

    static final short[] DFA5_eot = DFA.unpackEncodedString(DFA5_eotS);
    static final short[] DFA5_eof = DFA.unpackEncodedString(DFA5_eofS);
    static final char[] DFA5_min = DFA.unpackEncodedStringToUnsignedChars(DFA5_minS);
    static final char[] DFA5_max = DFA.unpackEncodedStringToUnsignedChars(DFA5_maxS);
    static final short[] DFA5_accept = DFA.unpackEncodedString(DFA5_acceptS);
    static final short[] DFA5_special = DFA.unpackEncodedString(DFA5_specialS);
    static final short[][] DFA5_transition;

    static {
        int numStates = DFA5_transitionS.length;
        DFA5_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA5_transition[i] = DFA.unpackEncodedString(DFA5_transitionS[i]);
        }
    }

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = DFA5_eot;
            this.eof = DFA5_eof;
            this.min = DFA5_min;
            this.max = DFA5_max;
            this.accept = DFA5_accept;
            this.special = DFA5_special;
            this.transition = DFA5_transition;
        }
        public String getDescription() {
            return "38:1: explicit_date : ( ^( EXPLICIT_DATE ^( MONTH_OF_YEAR month= INT ) ^( DAY_OF_MONTH day= INT ) ) | ^( EXPLICIT_DATE ^( MONTH_OF_YEAR month= INT ) ^( DAY_OF_MONTH day= INT ) ^( YEAR_OF year= INT ) ) );";
        }
    }
    static final String DFA8_eotS =
        "\12\uffff";
    static final String DFA8_eofS =
        "\12\uffff";
    static final String DFA8_minS =
        "\1\14\1\2\1\15\1\16\1\4\1\5\4\uffff";
    static final String DFA8_maxS =
        "\1\14\1\2\1\15\1\16\1\4\1\17\4\uffff";
    static final String DFA8_acceptS =
        "\6\uffff\1\1\1\2\1\3\1\4";
    static final String DFA8_specialS =
        "\12\uffff}>";
    static final String[] DFA8_transitionS = {
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

    static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
    static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
    static final char[] DFA8_min = DFA.unpackEncodedStringToUnsignedChars(DFA8_minS);
    static final char[] DFA8_max = DFA.unpackEncodedStringToUnsignedChars(DFA8_maxS);
    static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
    static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
    static final short[][] DFA8_transition;

    static {
        int numStates = DFA8_transitionS.length;
        DFA8_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA8_transition[i] = DFA.unpackEncodedString(DFA8_transitionS[i]);
        }
    }

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = DFA8_eot;
            this.eof = DFA8_eof;
            this.min = DFA8_min;
            this.max = DFA8_max;
            this.accept = DFA8_accept;
            this.special = DFA8_special;
            this.transition = DFA8_transition;
        }
        public String getDescription() {
            return "51:1: seek : ( ^( SEEK DIRECTION by= SEEK_BY amount= INT ^( DAY_OF_WEEK day= INT ) ) | ^( SEEK DIRECTION SEEK_BY amount= INT ^( MONTH_OF_YEAR month= INT ) ) | ^( SEEK DIRECTION SEEK_BY INT SPAN ) | ^( SEEK DIRECTION SEEK_BY INT date ) );";
        }
    }
 

    public static final BitSet FOLLOW_DATE_TIME_in_date_time46 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_date_in_date_time48 = new BitSet(new long[]{0x0000000000020008L});
    public static final BitSet FOLLOW_time_in_date_time51 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_relative_date_in_date70 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_explicit_date_in_date77 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RELATIVE_DATE_in_relative_date93 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_seek_in_relative_date95 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_RELATIVE_DATE_in_relative_date106 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_WEEK_INDEX_in_relative_date109 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INT_in_relative_date113 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_DAY_OF_WEEK_in_relative_date116 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INT_in_relative_date120 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MONTH_OF_YEAR_in_relative_date124 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INT_in_relative_date128 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EXPLICIT_in_relaxed_date153 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_seek_in_relaxed_date155 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EXPLICIT_DATE_in_explicit_date172 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_MONTH_OF_YEAR_in_explicit_date175 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INT_in_explicit_date179 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DAY_OF_MONTH_in_explicit_date183 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INT_in_explicit_date187 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EXPLICIT_DATE_in_explicit_date207 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_MONTH_OF_YEAR_in_explicit_date210 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INT_in_explicit_date214 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DAY_OF_MONTH_in_explicit_date218 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INT_in_explicit_date222 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_YEAR_OF_in_explicit_date226 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INT_in_explicit_date230 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EXPLICIT_TIME_in_time254 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_HOURS_OF_DAY_in_time257 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INT_in_time261 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MINUTES_OF_HOUR_in_time265 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INT_in_time269 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AM_PM_in_time272 = new BitSet(new long[]{0x0000000000200008L});
    public static final BitSet FOLLOW_ZONE_in_time275 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SEEK_in_seek299 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DIRECTION_in_seek301 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_SEEK_BY_in_seek305 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_INT_in_seek309 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_DAY_OF_WEEK_in_seek312 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INT_in_seek316 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SEEK_in_seek336 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DIRECTION_in_seek338 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_SEEK_BY_in_seek340 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_INT_in_seek344 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_MONTH_OF_YEAR_in_seek347 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INT_in_seek351 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SEEK_in_seek369 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DIRECTION_in_seek371 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_SEEK_BY_in_seek373 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_INT_in_seek375 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_SPAN_in_seek377 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SEEK_in_seek394 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DIRECTION_in_seek396 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_SEEK_BY_in_seek398 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_INT_in_seek400 = new BitSet(new long[]{0x0000000000000C00L});
    public static final BitSet FOLLOW_date_in_seek402 = new BitSet(new long[]{0x0000000000000008L});

}