// $ANTLR 3.2 Sep 23, 2009 12:02:23 /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g 2010-02-16 09:59:24
 package com.natty.parse; 

import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.debug.*;
import java.io.IOException;
public class DateWalker extends DebugTreeParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "INT", "MONTH_OF_YEAR", "DAY_OF_MONTH", "DAY_OF_WEEK", "YEAR_OF", "DATE_TIME", "EXPLICIT_DATE", "RELATIVE_DATE", "SEEK", "DIRECTION", "SEEK_BY", "SPAN", "WEEK_INDEX", "EXPLICIT_TIME", "HOURS_OF_DAY", "MINUTES_OF_HOUR", "SECONDS_OF_MINUTE", "AM_PM", "ZONE", "ZONE_OFFSET", "WHITE_SPACE", "AT", "COMMA", "T", "ON", "THE", "DAY", "AFTER", "BEFORE", "OF", "JANUARY", "FEBRUARY", "MARCH", "APRIL", "MAY", "JUNE", "JULY", "AUGUST", "SEPTEMBER", "OCTOBER", "NOVEMBER", "DECEMBER", "SINGLE_QUOTE", "IN", "YEAR", "DASH", "SLASH", "FIRST", "SECOND", "THIRD", "FOURTH", "FIFTH", "LAST", "THIS", "NEXT", "PAST", "COMING", "UPCOMING", "FROM", "NOW", "AGO", "WEEK", "MONTH", "SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY", "TODAY", "TOMORROW", "YESTERDAY", "COLON", "MILITARY_HOUR_SUFFIX", "HOUR", "AM", "PM", "NOON", "MIDNIGHT", "PLUS", "UTC", "EST", "CST", "PST", "MST", "AKST", "HAST", "INT_00", "INT_0", "ONE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", "NINE", "TEN", "ELEVEN", "TWELVE", "THIRTEEN", "FOURTEEN", "FIFTEEN", "SIXTEEN", "SEVENTEEN", "EIGHTEEN", "NINETEEN", "TWENTY", "THIRTY", "INT_1", "ST", "INT_2", "ND", "INT_3", "RD", "INT_4", "TH", "INT_5", "SIXTH", "INT_6", "SEVENTH", "INT_7", "EIGHTH", "INT_8", "NINTH", "INT_9", "TENTH", "INT_10", "ELEVENTH", "INT_11", "TWELFTH", "INT_12", "THIRTEENTH", "INT_13", "FOURTEENTH", "INT_14", "FIFTEENTH", "INT_15", "SIXTEENTH", "INT_16", "SEVENTEENTH", "INT_17", "EIGHTEENTH", "INT_18", "NINETEENTH", "INT_19", "TWENTIETH", "INT_20", "INT_21", "INT_22", "INT_23", "INT_24", "INT_25", "INT_26", "INT_27", "INT_28", "INT_29", "THIRTIETH", "INT_30", "INT_31", "INT_60", "INT_61", "INT_62", "INT_63", "INT_64", "INT_65", "INT_66", "INT_67", "INT_68", "INT_69", "INT_70", "INT_71", "INT_72", "INT_73", "INT_74", "INT_75", "INT_76", "INT_77", "INT_78", "INT_79", "INT_80", "INT_81", "INT_82", "INT_83", "INT_84", "INT_85", "INT_86", "INT_87", "INT_88", "INT_89", "INT_90", "INT_91", "INT_92", "INT_93", "INT_94", "INT_95", "INT_96", "INT_97", "INT_98", "INT_99", "INT_32", "INT_33", "INT_34", "INT_35", "INT_36", "INT_37", "INT_38", "INT_39", "INT_40", "INT_41", "INT_42", "INT_43", "INT_44", "INT_45", "INT_46", "INT_47", "INT_48", "INT_49", "INT_50", "INT_51", "INT_52", "INT_53", "INT_54", "INT_55", "INT_56", "INT_57", "INT_58", "INT_59", "INT_01", "INT_02", "INT_03", "INT_04", "INT_05", "INT_06", "INT_07", "INT_08", "INT_09", "DOT", "EXPLICIT"
    };
    public static final int DIRECTION=13;
    public static final int NINETEEN=112;
    public static final int INT_08=241;
    public static final int INT_09=242;
    public static final int TWENTY=113;
    public static final int INT_02=235;
    public static final int INT_03=236;
    public static final int INT_00=92;
    public static final int APRIL=37;
    public static final int INT_01=234;
    public static final int INT_06=239;
    public static final int COMING=60;
    public static final int INT_07=240;
    public static final int INT_04=237;
    public static final int INT_05=238;
    public static final int NOW=63;
    public static final int EOF=-1;
    public static final int MONTH=66;
    public static final int AM_PM=21;
    public static final int EIGHTEENTH=148;
    public static final int SPAN=15;
    public static final int THIS=57;
    public static final int NOON=82;
    public static final int TOMORROW=75;
    public static final int TODAY=74;
    public static final int FIFTEENTH=142;
    public static final int NOVEMBER=44;
    public static final int MONTH_OF_YEAR=5;
    public static final int SEVENTH=126;
    public static final int T=27;
    public static final int FEBRUARY=35;
    public static final int SUNDAY=67;
    public static final int DAY_OF_WEEK=7;
    public static final int SEVEN=100;
    public static final int ELEVEN=104;
    public static final int THIRTEEN=106;
    public static final int EXPLICIT_DATE=10;
    public static final int INT=4;
    public static final int UPCOMING=61;
    public static final int SIX=99;
    public static final int FIFTH=55;
    public static final int DECEMBER=45;
    public static final int AUGUST=41;
    public static final int SECONDS_OF_MINUTE=20;
    public static final int TUESDAY=69;
    public static final int THIRD=53;
    public static final int INT_47=221;
    public static final int INT_46=220;
    public static final int INT_45=219;
    public static final int INT_44=218;
    public static final int RD=120;
    public static final int INT_49=223;
    public static final int INT_48=222;
    public static final int THE=29;
    public static final int EXPLICIT=244;
    public static final int WHITE_SPACE=24;
    public static final int INT_42=216;
    public static final int INT_43=217;
    public static final int FRIDAY=72;
    public static final int INT_40=214;
    public static final int INT_41=215;
    public static final int AT=25;
    public static final int INT_34=208;
    public static final int INT_33=207;
    public static final int SINGLE_QUOTE=46;
    public static final int INT_36=210;
    public static final int INT_35=209;
    public static final int SLASH=50;
    public static final int INT_38=212;
    public static final int INT_37=211;
    public static final int INT_39=213;
    public static final int NINTH=130;
    public static final int ZONE=22;
    public static final int TWENTIETH=152;
    public static final int PLUS=84;
    public static final int INT_30=164;
    public static final int INT_31=165;
    public static final int AM=80;
    public static final int INT_32=206;
    public static final int INT_29=162;
    public static final int INT_28=161;
    public static final int INT_27=160;
    public static final int INT_26=159;
    public static final int INT_25=158;
    public static final int INT_24=157;
    public static final int INT_23=156;
    public static final int INT_22=155;
    public static final int TH=122;
    public static final int FOURTEENTH=140;
    public static final int SIXTEEN=109;
    public static final int AGO=64;
    public static final int ELEVENTH=134;
    public static final int ST=116;
    public static final int TWO=95;
    public static final int HOUR=79;
    public static final int INT_20=153;
    public static final int INT_21=154;
    public static final int JANUARY=34;
    public static final int THIRTEENTH=138;
    public static final int COLON=77;
    public static final int INT_16=145;
    public static final int INT_15=143;
    public static final int INT_18=149;
    public static final int INT_17=147;
    public static final int INT_12=137;
    public static final int INT_11=135;
    public static final int INT_14=141;
    public static final int INT_13=139;
    public static final int DAY_OF_MONTH=6;
    public static final int INT_19=151;
    public static final int FIFTEEN=108;
    public static final int NINE=102;
    public static final int THREE=96;
    public static final int FOURTEEN=107;
    public static final int YESTERDAY=76;
    public static final int INT_10=133;
    public static final int SEVENTEENTH=146;
    public static final int FIRST=51;
    public static final int INT_81=187;
    public static final int INT_80=186;
    public static final int INT_83=189;
    public static final int WEEK=65;
    public static final int SEPTEMBER=42;
    public static final int INT_82=188;
    public static final int INT_85=191;
    public static final int INT_84=190;
    public static final int INT_87=193;
    public static final int WEDNESDAY=70;
    public static final int INT_86=192;
    public static final int JULY=40;
    public static final int NINETEENTH=150;
    public static final int OCTOBER=43;
    public static final int DAY=30;
    public static final int ONE=94;
    public static final int MIDNIGHT=83;
    public static final int INT_88=194;
    public static final int INT_89=195;
    public static final int MARCH=36;
    public static final int PAST=59;
    public static final int SEVENTEEN=110;
    public static final int DATE_TIME=9;
    public static final int INT_72=178;
    public static final int INT_71=177;
    public static final int INT_70=176;
    public static final int INT_76=182;
    public static final int INT_75=181;
    public static final int INT_74=180;
    public static final int INT_73=179;
    public static final int MINUTES_OF_HOUR=19;
    public static final int THIRTIETH=163;
    public static final int LAST=56;
    public static final int INT_79=185;
    public static final int EIGHTEEN=111;
    public static final int INT_77=183;
    public static final int INT_78=184;
    public static final int ND=118;
    public static final int RELATIVE_DATE=11;
    public static final int INT_63=169;
    public static final int INT_62=168;
    public static final int INT_65=171;
    public static final int FOURTH=54;
    public static final int INT_64=170;
    public static final int SECOND=52;
    public static final int INT_61=167;
    public static final int INT_60=166;
    public static final int SATURDAY=73;
    public static final int FOUR=97;
    public static final int TEN=103;
    public static final int ON=28;
    public static final int MONDAY=68;
    public static final int JUNE=39;
    public static final int OF=33;
    public static final int INT_66=172;
    public static final int INT_67=173;
    public static final int INT_68=174;
    public static final int INT_69=175;
    public static final int INT_54=228;
    public static final int INT_53=227;
    public static final int INT_52=226;
    public static final int INT_51=225;
    public static final int INT_50=224;
    public static final int THURSDAY=71;
    public static final int ZONE_OFFSET=23;
    public static final int SEEK_BY=14;
    public static final int PM=81;
    public static final int EXPLICIT_TIME=17;
    public static final int FROM=62;
    public static final int INT_59=233;
    public static final int INT_57=231;
    public static final int INT_58=232;
    public static final int EIGHTH=128;
    public static final int INT_55=229;
    public static final int INT_56=230;
    public static final int HOURS_OF_DAY=18;
    public static final int YEAR=48;
    public static final int TENTH=132;
    public static final int MAY=38;
    public static final int INT_9=131;
    public static final int INT_8=129;
    public static final int INT_7=127;
    public static final int INT_6=125;
    public static final int INT_5=123;
    public static final int UTC=85;
    public static final int INT_4=121;
    public static final int INT_3=119;
    public static final int AKST=90;
    public static final int INT_2=117;
    public static final int MST=89;
    public static final int INT_1=115;
    public static final int EIGHT=101;
    public static final int INT_0=93;
    public static final int CST=87;
    public static final int IN=47;
    public static final int PST=88;
    public static final int COMMA=26;
    public static final int FIVE=98;
    public static final int THIRTY=114;
    public static final int NEXT=58;
    public static final int DOT=243;
    public static final int MILITARY_HOUR_SUFFIX=78;
    public static final int EST=86;
    public static final int HAST=91;
    public static final int DASH=49;
    public static final int YEAR_OF=8;
    public static final int TWELVE=105;
    public static final int WEEK_INDEX=16;
    public static final int BEFORE=32;
    public static final int AFTER=31;
    public static final int SIXTEENTH=144;
    public static final int SEEK=12;
    public static final int INT_90=196;
    public static final int INT_97=203;
    public static final int INT_98=204;
    public static final int INT_95=201;
    public static final int INT_96=202;
    public static final int INT_93=199;
    public static final int INT_94=200;
    public static final int INT_91=197;
    public static final int INT_92=198;
    public static final int TWELFTH=136;
    public static final int SIXTH=124;
    public static final int INT_99=205;

    // delegates
    // delegators

    public static final String[] ruleNames = new String[] {
        "invalidRule", "time", "relaxed_date", "seek", "date_time", "date", 
        "explicit_date", "relative_date"
    };
     
        public int ruleLevel = 0;
        public int getRuleLevel() { return ruleLevel; }
        public void incRuleLevel() { ruleLevel++; }
        public void decRuleLevel() { ruleLevel--; }
        public DateWalker(TreeNodeStream input) {
            this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
        }
        public DateWalker(TreeNodeStream input, int port, RecognizerSharedState state) {
            super(input, state);
            DebugEventSocketProxy proxy =
                new DebugEventSocketProxy(this, port, input.getTreeAdaptor());
            setDebugListener(proxy);
            try {
                proxy.handshake();
            }
            catch (IOException ioe) {
                reportError(ioe);
            }
        }
    public DateWalker(TreeNodeStream input, DebugEventListener dbg) {
        super(input, dbg, new RecognizerSharedState());

    }
    protected boolean evalPredicate(boolean result, String predicate) {
        dbg.semanticPredicate(result, predicate);
        return result;
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
        try { dbg.enterRule(getGrammarFileName(), "date_time");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(18, 1);

        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:19:3: ( ^( DATE_TIME ( date )? ( time )? ) )
            dbg.enterAlt(1);

            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:19:5: ^( DATE_TIME ( date )? ( time )? )
            {
            dbg.location(19,5);
            dbg.location(19,7);
            match(input,DATE_TIME,FOLLOW_DATE_TIME_in_date_time46); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                dbg.location(19,17);
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:19:17: ( date )?
                int alt1=2;
                try { dbg.enterSubRule(1);
                try { dbg.enterDecision(1);

                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=EXPLICIT_DATE && LA1_0<=RELATIVE_DATE)) ) {
                    alt1=1;
                }
                } finally {dbg.exitDecision(1);}

                switch (alt1) {
                    case 1 :
                        dbg.enterAlt(1);

                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:19:17: date
                        {
                        dbg.location(19,17);
                        pushFollow(FOLLOW_date_in_date_time48);
                        date();

                        state._fsp--;


                        }
                        break;

                }
                } finally {dbg.exitSubRule(1);}

                dbg.location(19,23);
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:19:23: ( time )?
                int alt2=2;
                try { dbg.enterSubRule(2);
                try { dbg.enterDecision(2);

                int LA2_0 = input.LA(1);

                if ( (LA2_0==EXPLICIT_TIME) ) {
                    alt2=1;
                }
                } finally {dbg.exitDecision(2);}

                switch (alt2) {
                    case 1 :
                        dbg.enterAlt(1);

                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:19:23: time
                        {
                        dbg.location(19,23);
                        pushFollow(FOLLOW_time_in_date_time51);
                        time();

                        state._fsp--;


                        }
                        break;

                }
                } finally {dbg.exitSubRule(2);}


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
        dbg.location(20, 3);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "date_time");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "date_time"


    // $ANTLR start "date"
    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:22:1: date : ( relative_date | explicit_date );
    public final void date() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "date");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(22, 1);

        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:23:3: ( relative_date | explicit_date )
            int alt3=2;
            try { dbg.enterDecision(3);

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

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(3);}

            switch (alt3) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:23:5: relative_date
                    {
                    dbg.location(23,5);
                    pushFollow(FOLLOW_relative_date_in_date70);
                    relative_date();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:24:5: explicit_date
                    {
                    dbg.location(24,5);
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
        dbg.location(25, 3);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "date");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
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

        try { dbg.enterRule(getGrammarFileName(), "relative_date");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(27, 1);

        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:28:3: ( ^( RELATIVE_DATE seek ) | ^( RELATIVE_DATE ^( WEEK_INDEX index= INT ^( DAY_OF_WEEK day= INT ) ^( MONTH_OF_YEAR month= INT ) ) ) )
            int alt4=2;
            try { dbg.enterDecision(4);

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

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(4);}

            switch (alt4) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:28:5: ^( RELATIVE_DATE seek )
                    {
                    dbg.location(28,5);
                    dbg.location(28,7);
                    match(input,RELATIVE_DATE,FOLLOW_RELATIVE_DATE_in_relative_date93); 

                    match(input, Token.DOWN, null); 
                    dbg.location(28,21);
                    pushFollow(FOLLOW_seek_in_relative_date95);
                    seek();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:30:5: ^( RELATIVE_DATE ^( WEEK_INDEX index= INT ^( DAY_OF_WEEK day= INT ) ^( MONTH_OF_YEAR month= INT ) ) )
                    {
                    dbg.location(30,5);
                    dbg.location(30,7);
                    match(input,RELATIVE_DATE,FOLLOW_RELATIVE_DATE_in_relative_date106); 

                    match(input, Token.DOWN, null); 
                    dbg.location(30,21);
                    dbg.location(30,23);
                    match(input,WEEK_INDEX,FOLLOW_WEEK_INDEX_in_relative_date109); 

                    match(input, Token.DOWN, null); 
                    dbg.location(30,39);
                    index=(CommonTree)match(input,INT,FOLLOW_INT_in_relative_date113); 
                    dbg.location(30,44);
                    dbg.location(30,46);
                    match(input,DAY_OF_WEEK,FOLLOW_DAY_OF_WEEK_in_relative_date116); 

                    match(input, Token.DOWN, null); 
                    dbg.location(30,61);
                    day=(CommonTree)match(input,INT,FOLLOW_INT_in_relative_date120); 

                    match(input, Token.UP, null); 
                    dbg.location(30,67);
                    dbg.location(30,69);
                    match(input,MONTH_OF_YEAR,FOLLOW_MONTH_OF_YEAR_in_relative_date124); 

                    match(input, Token.DOWN, null); 
                    dbg.location(30,88);
                    month=(CommonTree)match(input,INT,FOLLOW_INT_in_relative_date128); 

                    match(input, Token.UP, null); 

                    match(input, Token.UP, null); 

                    match(input, Token.UP, null); 
                    dbg.location(31,5);
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
        dbg.location(32, 3);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "relative_date");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "relative_date"


    // $ANTLR start "relaxed_date"
    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:34:1: relaxed_date : ^( EXPLICIT seek ) ;
    public final void relaxed_date() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "relaxed_date");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(34, 1);

        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:35:3: ( ^( EXPLICIT seek ) )
            dbg.enterAlt(1);

            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:35:5: ^( EXPLICIT seek )
            {
            dbg.location(35,5);
            dbg.location(35,7);
            match(input,EXPLICIT,FOLLOW_EXPLICIT_in_relaxed_date153); 

            match(input, Token.DOWN, null); 
            dbg.location(35,16);
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
        dbg.location(36, 3);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "relaxed_date");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "relaxed_date"


    // $ANTLR start "explicit_date"
    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:38:1: explicit_date : ( ^( EXPLICIT_DATE ^( MONTH_OF_YEAR month= INT ) ^( DAY_OF_MONTH day_of_month= INT ) ^( DAY_OF_WEEK day_of_week= INT ) ^( YEAR_OF year= INT ) ) | ^( EXPLICIT_DATE ^( MONTH_OF_YEAR month= INT ) ^( DAY_OF_MONTH day_of_month= INT ) ^( DAY_OF_WEEK day_of_week= INT ) ) | ^( EXPLICIT_DATE ^( MONTH_OF_YEAR month= INT ) ^( DAY_OF_MONTH day_of_month= INT ) ^( YEAR_OF year= INT ) ) | ^( EXPLICIT_DATE ^( MONTH_OF_YEAR month= INT ) ^( DAY_OF_MONTH day_of_month= INT ) ) ) ;
    public final void explicit_date() throws RecognitionException {
        CommonTree month=null;
        CommonTree day_of_month=null;
        CommonTree day_of_week=null;
        CommonTree year=null;

        try { dbg.enterRule(getGrammarFileName(), "explicit_date");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(38, 1);

        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:39:3: ( ( ^( EXPLICIT_DATE ^( MONTH_OF_YEAR month= INT ) ^( DAY_OF_MONTH day_of_month= INT ) ^( DAY_OF_WEEK day_of_week= INT ) ^( YEAR_OF year= INT ) ) | ^( EXPLICIT_DATE ^( MONTH_OF_YEAR month= INT ) ^( DAY_OF_MONTH day_of_month= INT ) ^( DAY_OF_WEEK day_of_week= INT ) ) | ^( EXPLICIT_DATE ^( MONTH_OF_YEAR month= INT ) ^( DAY_OF_MONTH day_of_month= INT ) ^( YEAR_OF year= INT ) ) | ^( EXPLICIT_DATE ^( MONTH_OF_YEAR month= INT ) ^( DAY_OF_MONTH day_of_month= INT ) ) ) )
            dbg.enterAlt(1);

            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:39:5: ( ^( EXPLICIT_DATE ^( MONTH_OF_YEAR month= INT ) ^( DAY_OF_MONTH day_of_month= INT ) ^( DAY_OF_WEEK day_of_week= INT ) ^( YEAR_OF year= INT ) ) | ^( EXPLICIT_DATE ^( MONTH_OF_YEAR month= INT ) ^( DAY_OF_MONTH day_of_month= INT ) ^( DAY_OF_WEEK day_of_week= INT ) ) | ^( EXPLICIT_DATE ^( MONTH_OF_YEAR month= INT ) ^( DAY_OF_MONTH day_of_month= INT ) ^( YEAR_OF year= INT ) ) | ^( EXPLICIT_DATE ^( MONTH_OF_YEAR month= INT ) ^( DAY_OF_MONTH day_of_month= INT ) ) )
            {
            dbg.location(39,5);
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:39:5: ( ^( EXPLICIT_DATE ^( MONTH_OF_YEAR month= INT ) ^( DAY_OF_MONTH day_of_month= INT ) ^( DAY_OF_WEEK day_of_week= INT ) ^( YEAR_OF year= INT ) ) | ^( EXPLICIT_DATE ^( MONTH_OF_YEAR month= INT ) ^( DAY_OF_MONTH day_of_month= INT ) ^( DAY_OF_WEEK day_of_week= INT ) ) | ^( EXPLICIT_DATE ^( MONTH_OF_YEAR month= INT ) ^( DAY_OF_MONTH day_of_month= INT ) ^( YEAR_OF year= INT ) ) | ^( EXPLICIT_DATE ^( MONTH_OF_YEAR month= INT ) ^( DAY_OF_MONTH day_of_month= INT ) ) )
            int alt5=4;
            try { dbg.enterSubRule(5);
            try { dbg.enterDecision(5);

            try {
                isCyclicDecision = true;
                alt5 = dfa5.predict(input);
            }
            catch (NoViableAltException nvae) {
                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(5);}

            switch (alt5) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:39:6: ^( EXPLICIT_DATE ^( MONTH_OF_YEAR month= INT ) ^( DAY_OF_MONTH day_of_month= INT ) ^( DAY_OF_WEEK day_of_week= INT ) ^( YEAR_OF year= INT ) )
                    {
                    dbg.location(39,6);
                    dbg.location(39,8);
                    match(input,EXPLICIT_DATE,FOLLOW_EXPLICIT_DATE_in_explicit_date173); 

                    match(input, Token.DOWN, null); 
                    dbg.location(39,22);
                    dbg.location(39,24);
                    match(input,MONTH_OF_YEAR,FOLLOW_MONTH_OF_YEAR_in_explicit_date176); 

                    match(input, Token.DOWN, null); 
                    dbg.location(39,43);
                    month=(CommonTree)match(input,INT,FOLLOW_INT_in_explicit_date180); 

                    match(input, Token.UP, null); 
                    dbg.location(39,49);
                    dbg.location(39,51);
                    match(input,DAY_OF_MONTH,FOLLOW_DAY_OF_MONTH_in_explicit_date184); 

                    match(input, Token.DOWN, null); 
                    dbg.location(39,76);
                    day_of_month=(CommonTree)match(input,INT,FOLLOW_INT_in_explicit_date188); 

                    match(input, Token.UP, null); 
                    dbg.location(39,82);
                    dbg.location(39,84);
                    match(input,DAY_OF_WEEK,FOLLOW_DAY_OF_WEEK_in_explicit_date192); 

                    match(input, Token.DOWN, null); 
                    dbg.location(39,107);
                    day_of_week=(CommonTree)match(input,INT,FOLLOW_INT_in_explicit_date196); 

                    match(input, Token.UP, null); 
                    dbg.location(39,113);
                    dbg.location(39,115);
                    match(input,YEAR_OF,FOLLOW_YEAR_OF_in_explicit_date200); 

                    match(input, Token.DOWN, null); 
                    dbg.location(39,127);
                    year=(CommonTree)match(input,INT,FOLLOW_INT_in_explicit_date204); 

                    match(input, Token.UP, null); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:40:5: ^( EXPLICIT_DATE ^( MONTH_OF_YEAR month= INT ) ^( DAY_OF_MONTH day_of_month= INT ) ^( DAY_OF_WEEK day_of_week= INT ) )
                    {
                    dbg.location(40,5);
                    dbg.location(40,7);
                    match(input,EXPLICIT_DATE,FOLLOW_EXPLICIT_DATE_in_explicit_date213); 

                    match(input, Token.DOWN, null); 
                    dbg.location(40,21);
                    dbg.location(40,23);
                    match(input,MONTH_OF_YEAR,FOLLOW_MONTH_OF_YEAR_in_explicit_date216); 

                    match(input, Token.DOWN, null); 
                    dbg.location(40,42);
                    month=(CommonTree)match(input,INT,FOLLOW_INT_in_explicit_date220); 

                    match(input, Token.UP, null); 
                    dbg.location(40,48);
                    dbg.location(40,50);
                    match(input,DAY_OF_MONTH,FOLLOW_DAY_OF_MONTH_in_explicit_date224); 

                    match(input, Token.DOWN, null); 
                    dbg.location(40,75);
                    day_of_month=(CommonTree)match(input,INT,FOLLOW_INT_in_explicit_date228); 

                    match(input, Token.UP, null); 
                    dbg.location(40,81);
                    dbg.location(40,83);
                    match(input,DAY_OF_WEEK,FOLLOW_DAY_OF_WEEK_in_explicit_date232); 

                    match(input, Token.DOWN, null); 
                    dbg.location(40,106);
                    day_of_week=(CommonTree)match(input,INT,FOLLOW_INT_in_explicit_date236); 

                    match(input, Token.UP, null); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:41:5: ^( EXPLICIT_DATE ^( MONTH_OF_YEAR month= INT ) ^( DAY_OF_MONTH day_of_month= INT ) ^( YEAR_OF year= INT ) )
                    {
                    dbg.location(41,5);
                    dbg.location(41,7);
                    match(input,EXPLICIT_DATE,FOLLOW_EXPLICIT_DATE_in_explicit_date245); 

                    match(input, Token.DOWN, null); 
                    dbg.location(41,21);
                    dbg.location(41,23);
                    match(input,MONTH_OF_YEAR,FOLLOW_MONTH_OF_YEAR_in_explicit_date248); 

                    match(input, Token.DOWN, null); 
                    dbg.location(41,42);
                    month=(CommonTree)match(input,INT,FOLLOW_INT_in_explicit_date252); 

                    match(input, Token.UP, null); 
                    dbg.location(41,48);
                    dbg.location(41,50);
                    match(input,DAY_OF_MONTH,FOLLOW_DAY_OF_MONTH_in_explicit_date256); 

                    match(input, Token.DOWN, null); 
                    dbg.location(41,75);
                    day_of_month=(CommonTree)match(input,INT,FOLLOW_INT_in_explicit_date260); 

                    match(input, Token.UP, null); 
                    dbg.location(41,81);
                    dbg.location(41,83);
                    match(input,YEAR_OF,FOLLOW_YEAR_OF_in_explicit_date264); 

                    match(input, Token.DOWN, null); 
                    dbg.location(41,95);
                    year=(CommonTree)match(input,INT,FOLLOW_INT_in_explicit_date268); 

                    match(input, Token.UP, null); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:42:5: ^( EXPLICIT_DATE ^( MONTH_OF_YEAR month= INT ) ^( DAY_OF_MONTH day_of_month= INT ) )
                    {
                    dbg.location(42,5);
                    dbg.location(42,7);
                    match(input,EXPLICIT_DATE,FOLLOW_EXPLICIT_DATE_in_explicit_date277); 

                    match(input, Token.DOWN, null); 
                    dbg.location(42,21);
                    dbg.location(42,23);
                    match(input,MONTH_OF_YEAR,FOLLOW_MONTH_OF_YEAR_in_explicit_date280); 

                    match(input, Token.DOWN, null); 
                    dbg.location(42,42);
                    month=(CommonTree)match(input,INT,FOLLOW_INT_in_explicit_date284); 

                    match(input, Token.UP, null); 
                    dbg.location(42,48);
                    dbg.location(42,50);
                    match(input,DAY_OF_MONTH,FOLLOW_DAY_OF_MONTH_in_explicit_date288); 

                    match(input, Token.DOWN, null); 
                    dbg.location(42,75);
                    day_of_month=(CommonTree)match(input,INT,FOLLOW_INT_in_explicit_date292); 

                    match(input, Token.UP, null); 

                    match(input, Token.UP, null); 

                    }
                    break;

            }
            } finally {dbg.exitSubRule(5);}

            dbg.location(43,5);
            _walkerState.setExplicitDate((month!=null?month.getText():null), (day_of_month!=null?day_of_month.getText():null), (day_of_week!=null?day_of_week.getText():null), (year!=null?year.getText():null));

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(44, 3);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "explicit_date");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "explicit_date"


    // $ANTLR start "time"
    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:46:1: time : ^( EXPLICIT_TIME ^( HOURS_OF_DAY hours= INT ) ^( MINUTES_OF_HOUR minutes= INT ) ^( SECONDS_OF_MINUTE (seconds= INT )? ) ( AM_PM )? (zone= ZONE | zone= ZONE_OFFSET )? ) ;
    public final void time() throws RecognitionException {
        CommonTree hours=null;
        CommonTree minutes=null;
        CommonTree seconds=null;
        CommonTree zone=null;
        CommonTree AM_PM1=null;

        try { dbg.enterRule(getGrammarFileName(), "time");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(46, 1);

        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:47:3: ( ^( EXPLICIT_TIME ^( HOURS_OF_DAY hours= INT ) ^( MINUTES_OF_HOUR minutes= INT ) ^( SECONDS_OF_MINUTE (seconds= INT )? ) ( AM_PM )? (zone= ZONE | zone= ZONE_OFFSET )? ) )
            dbg.enterAlt(1);

            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:47:5: ^( EXPLICIT_TIME ^( HOURS_OF_DAY hours= INT ) ^( MINUTES_OF_HOUR minutes= INT ) ^( SECONDS_OF_MINUTE (seconds= INT )? ) ( AM_PM )? (zone= ZONE | zone= ZONE_OFFSET )? )
            {
            dbg.location(47,5);
            dbg.location(47,7);
            match(input,EXPLICIT_TIME,FOLLOW_EXPLICIT_TIME_in_time317); 

            match(input, Token.DOWN, null); 
            dbg.location(47,21);
            dbg.location(47,23);
            match(input,HOURS_OF_DAY,FOLLOW_HOURS_OF_DAY_in_time320); 

            match(input, Token.DOWN, null); 
            dbg.location(47,41);
            hours=(CommonTree)match(input,INT,FOLLOW_INT_in_time324); 

            match(input, Token.UP, null); 
            dbg.location(47,47);
            dbg.location(47,49);
            match(input,MINUTES_OF_HOUR,FOLLOW_MINUTES_OF_HOUR_in_time328); 

            match(input, Token.DOWN, null); 
            dbg.location(47,72);
            minutes=(CommonTree)match(input,INT,FOLLOW_INT_in_time332); 

            match(input, Token.UP, null); 
            dbg.location(48,7);
            dbg.location(48,9);
            match(input,SECONDS_OF_MINUTE,FOLLOW_SECONDS_OF_MINUTE_in_time343); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                dbg.location(48,34);
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:48:34: (seconds= INT )?
                int alt6=2;
                try { dbg.enterSubRule(6);
                try { dbg.enterDecision(6);

                int LA6_0 = input.LA(1);

                if ( (LA6_0==INT) ) {
                    alt6=1;
                }
                } finally {dbg.exitDecision(6);}

                switch (alt6) {
                    case 1 :
                        dbg.enterAlt(1);

                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:48:34: seconds= INT
                        {
                        dbg.location(48,34);
                        seconds=(CommonTree)match(input,INT,FOLLOW_INT_in_time347); 

                        }
                        break;

                }
                } finally {dbg.exitSubRule(6);}


                match(input, Token.UP, null); 
            }
            dbg.location(48,41);
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:48:41: ( AM_PM )?
            int alt7=2;
            try { dbg.enterSubRule(7);
            try { dbg.enterDecision(7);

            int LA7_0 = input.LA(1);

            if ( (LA7_0==AM_PM) ) {
                alt7=1;
            }
            } finally {dbg.exitDecision(7);}

            switch (alt7) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:48:41: AM_PM
                    {
                    dbg.location(48,41);
                    AM_PM1=(CommonTree)match(input,AM_PM,FOLLOW_AM_PM_in_time351); 

                    }
                    break;

            }
            } finally {dbg.exitSubRule(7);}

            dbg.location(48,48);
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:48:48: (zone= ZONE | zone= ZONE_OFFSET )?
            int alt8=3;
            try { dbg.enterSubRule(8);
            try { dbg.enterDecision(8);

            int LA8_0 = input.LA(1);

            if ( (LA8_0==ZONE) ) {
                alt8=1;
            }
            else if ( (LA8_0==ZONE_OFFSET) ) {
                alt8=2;
            }
            } finally {dbg.exitDecision(8);}

            switch (alt8) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:48:49: zone= ZONE
                    {
                    dbg.location(48,53);
                    zone=(CommonTree)match(input,ZONE,FOLLOW_ZONE_in_time357); 

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:48:61: zone= ZONE_OFFSET
                    {
                    dbg.location(48,65);
                    zone=(CommonTree)match(input,ZONE_OFFSET,FOLLOW_ZONE_OFFSET_in_time363); 

                    }
                    break;

            }
            } finally {dbg.exitSubRule(8);}


            match(input, Token.UP, null); 
            dbg.location(49,5);
            _walkerState.setExplicitTime((hours!=null?hours.getText():null), (minutes!=null?minutes.getText():null), (seconds!=null?seconds.getText():null), (AM_PM1!=null?AM_PM1.getText():null), (zone!=null?zone.getText():null));

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(50, 3);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "time");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "time"


    // $ANTLR start "seek"
    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:52:1: seek : ( ^( SEEK DIRECTION by= SEEK_BY amount= INT ^( DAY_OF_WEEK day= INT ) ) | ^( SEEK DIRECTION SEEK_BY amount= INT ^( MONTH_OF_YEAR month= INT ) ) | ^( SEEK DIRECTION SEEK_BY INT SPAN ) | ^( SEEK DIRECTION SEEK_BY INT date ) );
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

        try { dbg.enterRule(getGrammarFileName(), "seek");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(52, 1);

        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:53:3: ( ^( SEEK DIRECTION by= SEEK_BY amount= INT ^( DAY_OF_WEEK day= INT ) ) | ^( SEEK DIRECTION SEEK_BY amount= INT ^( MONTH_OF_YEAR month= INT ) ) | ^( SEEK DIRECTION SEEK_BY INT SPAN ) | ^( SEEK DIRECTION SEEK_BY INT date ) )
            int alt9=4;
            try { dbg.enterDecision(9);

            try {
                isCyclicDecision = true;
                alt9 = dfa9.predict(input);
            }
            catch (NoViableAltException nvae) {
                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(9);}

            switch (alt9) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:53:5: ^( SEEK DIRECTION by= SEEK_BY amount= INT ^( DAY_OF_WEEK day= INT ) )
                    {
                    dbg.location(53,5);
                    dbg.location(53,7);
                    match(input,SEEK,FOLLOW_SEEK_in_seek388); 

                    match(input, Token.DOWN, null); 
                    dbg.location(53,12);
                    DIRECTION2=(CommonTree)match(input,DIRECTION,FOLLOW_DIRECTION_in_seek390); 
                    dbg.location(53,24);
                    by=(CommonTree)match(input,SEEK_BY,FOLLOW_SEEK_BY_in_seek394); 
                    dbg.location(53,39);
                    amount=(CommonTree)match(input,INT,FOLLOW_INT_in_seek398); 
                    dbg.location(53,44);
                    dbg.location(53,46);
                    match(input,DAY_OF_WEEK,FOLLOW_DAY_OF_WEEK_in_seek401); 

                    match(input, Token.DOWN, null); 
                    dbg.location(53,61);
                    day=(CommonTree)match(input,INT,FOLLOW_INT_in_seek405); 

                    match(input, Token.UP, null); 

                    match(input, Token.UP, null); 
                    dbg.location(54,5);
                    _walkerState.seekToDayOfWeek((DIRECTION2!=null?DIRECTION2.getText():null), (by!=null?by.getText():null), (amount!=null?amount.getText():null), (day!=null?day.getText():null));

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:56:5: ^( SEEK DIRECTION SEEK_BY amount= INT ^( MONTH_OF_YEAR month= INT ) )
                    {
                    dbg.location(56,5);
                    dbg.location(56,7);
                    match(input,SEEK,FOLLOW_SEEK_in_seek425); 

                    match(input, Token.DOWN, null); 
                    dbg.location(56,12);
                    DIRECTION3=(CommonTree)match(input,DIRECTION,FOLLOW_DIRECTION_in_seek427); 
                    dbg.location(56,22);
                    match(input,SEEK_BY,FOLLOW_SEEK_BY_in_seek429); 
                    dbg.location(56,36);
                    amount=(CommonTree)match(input,INT,FOLLOW_INT_in_seek433); 
                    dbg.location(56,41);
                    dbg.location(56,43);
                    match(input,MONTH_OF_YEAR,FOLLOW_MONTH_OF_YEAR_in_seek436); 

                    match(input, Token.DOWN, null); 
                    dbg.location(56,62);
                    month=(CommonTree)match(input,INT,FOLLOW_INT_in_seek440); 

                    match(input, Token.UP, null); 

                    match(input, Token.UP, null); 
                    dbg.location(57,5);
                    _walkerState.seekToMonth((DIRECTION3!=null?DIRECTION3.getText():null), (amount!=null?amount.getText():null), (month!=null?month.getText():null));

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:59:5: ^( SEEK DIRECTION SEEK_BY INT SPAN )
                    {
                    dbg.location(59,5);
                    dbg.location(59,7);
                    match(input,SEEK,FOLLOW_SEEK_in_seek458); 

                    match(input, Token.DOWN, null); 
                    dbg.location(59,12);
                    DIRECTION4=(CommonTree)match(input,DIRECTION,FOLLOW_DIRECTION_in_seek460); 
                    dbg.location(59,22);
                    match(input,SEEK_BY,FOLLOW_SEEK_BY_in_seek462); 
                    dbg.location(59,30);
                    INT5=(CommonTree)match(input,INT,FOLLOW_INT_in_seek464); 
                    dbg.location(59,34);
                    SPAN6=(CommonTree)match(input,SPAN,FOLLOW_SPAN_in_seek466); 

                    match(input, Token.UP, null); 
                    dbg.location(60,5);
                    _walkerState.seekBySpan((DIRECTION4!=null?DIRECTION4.getText():null), (INT5!=null?INT5.getText():null), (SPAN6!=null?SPAN6.getText():null));

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:62:5: ^( SEEK DIRECTION SEEK_BY INT date )
                    {
                    dbg.location(62,5);
                    dbg.location(62,7);
                    match(input,SEEK,FOLLOW_SEEK_in_seek483); 

                    match(input, Token.DOWN, null); 
                    dbg.location(62,12);
                    DIRECTION7=(CommonTree)match(input,DIRECTION,FOLLOW_DIRECTION_in_seek485); 
                    dbg.location(62,22);
                    match(input,SEEK_BY,FOLLOW_SEEK_BY_in_seek487); 
                    dbg.location(62,30);
                    INT8=(CommonTree)match(input,INT,FOLLOW_INT_in_seek489); 
                    dbg.location(62,34);
                    pushFollow(FOLLOW_date_in_seek491);
                    date();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    dbg.location(63,5);
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
        dbg.location(64, 3);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "seek");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "seek"

    // Delegated rules


    protected DFA5 dfa5 = new DFA5(this);
    protected DFA9 dfa9 = new DFA9(this);
    static final String DFA5_eotS =
        "\23\uffff";
    static final String DFA5_eofS =
        "\23\uffff";
    static final String DFA5_minS =
        "\1\12\1\2\1\5\1\2\1\4\1\3\1\6\1\2\1\4\2\3\1\2\2\uffff\1\4\2\3\2"+
        "\uffff";
    static final String DFA5_maxS =
        "\1\12\1\2\1\5\1\2\1\4\1\3\1\6\1\2\1\4\1\3\1\10\1\2\2\uffff\1\4\1"+
        "\3\1\10\2\uffff";
    static final String DFA5_acceptS =
        "\14\uffff\1\3\1\4\3\uffff\1\1\1\2";
    static final String DFA5_specialS =
        "\23\uffff}>";
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
            "\1\15\3\uffff\1\13\1\14",
            "\1\16",
            "",
            "",
            "\1\17",
            "\1\20",
            "\1\22\4\uffff\1\21",
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
            return "39:5: ( ^( EXPLICIT_DATE ^( MONTH_OF_YEAR month= INT ) ^( DAY_OF_MONTH day_of_month= INT ) ^( DAY_OF_WEEK day_of_week= INT ) ^( YEAR_OF year= INT ) ) | ^( EXPLICIT_DATE ^( MONTH_OF_YEAR month= INT ) ^( DAY_OF_MONTH day_of_month= INT ) ^( DAY_OF_WEEK day_of_week= INT ) ) | ^( EXPLICIT_DATE ^( MONTH_OF_YEAR month= INT ) ^( DAY_OF_MONTH day_of_month= INT ) ^( YEAR_OF year= INT ) ) | ^( EXPLICIT_DATE ^( MONTH_OF_YEAR month= INT ) ^( DAY_OF_MONTH day_of_month= INT ) ) )";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
    }
    static final String DFA9_eotS =
        "\12\uffff";
    static final String DFA9_eofS =
        "\12\uffff";
    static final String DFA9_minS =
        "\1\14\1\2\1\15\1\16\1\4\1\5\4\uffff";
    static final String DFA9_maxS =
        "\1\14\1\2\1\15\1\16\1\4\1\17\4\uffff";
    static final String DFA9_acceptS =
        "\6\uffff\1\1\1\2\1\3\1\4";
    static final String DFA9_specialS =
        "\12\uffff}>";
    static final String[] DFA9_transitionS = {
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

    static final short[] DFA9_eot = DFA.unpackEncodedString(DFA9_eotS);
    static final short[] DFA9_eof = DFA.unpackEncodedString(DFA9_eofS);
    static final char[] DFA9_min = DFA.unpackEncodedStringToUnsignedChars(DFA9_minS);
    static final char[] DFA9_max = DFA.unpackEncodedStringToUnsignedChars(DFA9_maxS);
    static final short[] DFA9_accept = DFA.unpackEncodedString(DFA9_acceptS);
    static final short[] DFA9_special = DFA.unpackEncodedString(DFA9_specialS);
    static final short[][] DFA9_transition;

    static {
        int numStates = DFA9_transitionS.length;
        DFA9_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA9_transition[i] = DFA.unpackEncodedString(DFA9_transitionS[i]);
        }
    }

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = DFA9_eot;
            this.eof = DFA9_eof;
            this.min = DFA9_min;
            this.max = DFA9_max;
            this.accept = DFA9_accept;
            this.special = DFA9_special;
            this.transition = DFA9_transition;
        }
        public String getDescription() {
            return "52:1: seek : ( ^( SEEK DIRECTION by= SEEK_BY amount= INT ^( DAY_OF_WEEK day= INT ) ) | ^( SEEK DIRECTION SEEK_BY amount= INT ^( MONTH_OF_YEAR month= INT ) ) | ^( SEEK DIRECTION SEEK_BY INT SPAN ) | ^( SEEK DIRECTION SEEK_BY INT date ) );";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
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
    public static final BitSet FOLLOW_EXPLICIT_DATE_in_explicit_date173 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_MONTH_OF_YEAR_in_explicit_date176 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INT_in_explicit_date180 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DAY_OF_MONTH_in_explicit_date184 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INT_in_explicit_date188 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DAY_OF_WEEK_in_explicit_date192 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INT_in_explicit_date196 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_YEAR_OF_in_explicit_date200 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INT_in_explicit_date204 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EXPLICIT_DATE_in_explicit_date213 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_MONTH_OF_YEAR_in_explicit_date216 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INT_in_explicit_date220 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DAY_OF_MONTH_in_explicit_date224 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INT_in_explicit_date228 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DAY_OF_WEEK_in_explicit_date232 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INT_in_explicit_date236 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EXPLICIT_DATE_in_explicit_date245 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_MONTH_OF_YEAR_in_explicit_date248 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INT_in_explicit_date252 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DAY_OF_MONTH_in_explicit_date256 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INT_in_explicit_date260 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_YEAR_OF_in_explicit_date264 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INT_in_explicit_date268 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EXPLICIT_DATE_in_explicit_date277 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_MONTH_OF_YEAR_in_explicit_date280 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INT_in_explicit_date284 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DAY_OF_MONTH_in_explicit_date288 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INT_in_explicit_date292 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EXPLICIT_TIME_in_time317 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_HOURS_OF_DAY_in_time320 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INT_in_time324 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MINUTES_OF_HOUR_in_time328 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INT_in_time332 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SECONDS_OF_MINUTE_in_time343 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INT_in_time347 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AM_PM_in_time351 = new BitSet(new long[]{0x0000000000C00008L});
    public static final BitSet FOLLOW_ZONE_in_time357 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ZONE_OFFSET_in_time363 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SEEK_in_seek388 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DIRECTION_in_seek390 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_SEEK_BY_in_seek394 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_INT_in_seek398 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_DAY_OF_WEEK_in_seek401 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INT_in_seek405 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SEEK_in_seek425 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DIRECTION_in_seek427 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_SEEK_BY_in_seek429 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_INT_in_seek433 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_MONTH_OF_YEAR_in_seek436 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INT_in_seek440 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SEEK_in_seek458 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DIRECTION_in_seek460 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_SEEK_BY_in_seek462 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_INT_in_seek464 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_SPAN_in_seek466 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SEEK_in_seek483 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DIRECTION_in_seek485 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_SEEK_BY_in_seek487 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_INT_in_seek489 = new BitSet(new long[]{0x0000000000000C00L});
    public static final BitSet FOLLOW_date_in_seek491 = new BitSet(new long[]{0x0000000000000008L});

}