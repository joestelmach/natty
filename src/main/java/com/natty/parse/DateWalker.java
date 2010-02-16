// $ANTLR 3.2 Sep 23, 2009 12:02:23 /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g 2010-02-16 17:15:45
 package com.natty.parse; 

import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.debug.*;
import java.io.IOException;
public class DateWalker extends DebugTreeParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "INT", "MONTH_OF_YEAR", "DAY_OF_MONTH", "DAY_OF_WEEK", "YEAR_OF", "DATE_TIME", "EXPLICIT_DATE", "RELATIVE_DATE", "SEEK", "DIRECTION", "SEEK_BY", "SPAN", "WEEK_INDEX", "EXPLICIT_TIME", "HOURS_OF_DAY", "MINUTES_OF_HOUR", "SECONDS_OF_MINUTE", "AM_PM", "ZONE", "ZONE_OFFSET", "UNKNOWN_TEXT", "WHITE_SPACE", "AT", "COMMA", "T", "ON", "THE", "DAY", "AFTER", "BEFORE", "OF", "JANUARY", "FEBRUARY", "MARCH", "APRIL", "MAY", "JUNE", "JULY", "AUGUST", "SEPTEMBER", "OCTOBER", "NOVEMBER", "DECEMBER", "SINGLE_QUOTE", "IN", "YEAR", "DASH", "SLASH", "FIRST", "SECOND", "THIRD", "FOURTH", "FIFTH", "LAST", "THIS", "NEXT", "PAST", "COMING", "UPCOMING", "FROM", "NOW", "AGO", "WEEK", "MONTH", "SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY", "TODAY", "TOMORROW", "YESTERDAY", "COLON", "MILITARY_HOUR_SUFFIX", "HOUR", "AM", "PM", "NOON", "MIDNIGHT", "PLUS", "UTC", "EST", "CST", "PST", "MST", "AKST", "HAST", "INT_00", "INT_0", "ONE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", "NINE", "TEN", "ELEVEN", "TWELVE", "THIRTEEN", "FOURTEEN", "FIFTEEN", "SIXTEEN", "SEVENTEEN", "EIGHTEEN", "NINETEEN", "TWENTY", "THIRTY", "INT_1", "ST", "INT_2", "ND", "INT_3", "RD", "INT_4", "TH", "INT_5", "SIXTH", "INT_6", "SEVENTH", "INT_7", "EIGHTH", "INT_8", "NINTH", "INT_9", "TENTH", "INT_10", "ELEVENTH", "INT_11", "TWELFTH", "INT_12", "THIRTEENTH", "INT_13", "FOURTEENTH", "INT_14", "FIFTEENTH", "INT_15", "SIXTEENTH", "INT_16", "SEVENTEENTH", "INT_17", "EIGHTEENTH", "INT_18", "NINETEENTH", "INT_19", "TWENTIETH", "INT_20", "INT_21", "INT_22", "INT_23", "INT_24", "INT_25", "INT_26", "INT_27", "INT_28", "INT_29", "THIRTIETH", "INT_30", "INT_31", "INT_60", "INT_61", "INT_62", "INT_63", "INT_64", "INT_65", "INT_66", "INT_67", "INT_68", "INT_69", "INT_70", "INT_71", "INT_72", "INT_73", "INT_74", "INT_75", "INT_76", "INT_77", "INT_78", "INT_79", "INT_80", "INT_81", "INT_82", "INT_83", "INT_84", "INT_85", "INT_86", "INT_87", "INT_88", "INT_89", "INT_90", "INT_91", "INT_92", "INT_93", "INT_94", "INT_95", "INT_96", "INT_97", "INT_98", "INT_99", "INT_32", "INT_33", "INT_34", "INT_35", "INT_36", "INT_37", "INT_38", "INT_39", "INT_40", "INT_41", "INT_42", "INT_43", "INT_44", "INT_45", "INT_46", "INT_47", "INT_48", "INT_49", "INT_50", "INT_51", "INT_52", "INT_53", "INT_54", "INT_55", "INT_56", "INT_57", "INT_58", "INT_59", "INT_01", "INT_02", "INT_03", "INT_04", "INT_05", "INT_06", "INT_07", "INT_08", "INT_09", "DOT", "UNKNOWN", "EXPLICIT"
    };
    public static final int DIRECTION=13;
    public static final int NINETEEN=113;
    public static final int INT_08=242;
    public static final int INT_09=243;
    public static final int TWENTY=114;
    public static final int INT_02=236;
    public static final int INT_03=237;
    public static final int INT_00=93;
    public static final int APRIL=38;
    public static final int INT_01=235;
    public static final int INT_06=240;
    public static final int COMING=61;
    public static final int INT_07=241;
    public static final int INT_04=238;
    public static final int INT_05=239;
    public static final int NOW=64;
    public static final int EOF=-1;
    public static final int MONTH=67;
    public static final int AM_PM=21;
    public static final int EIGHTEENTH=149;
    public static final int SPAN=15;
    public static final int THIS=58;
    public static final int NOON=83;
    public static final int TOMORROW=76;
    public static final int TODAY=75;
    public static final int FIFTEENTH=143;
    public static final int NOVEMBER=45;
    public static final int MONTH_OF_YEAR=5;
    public static final int SEVENTH=127;
    public static final int T=28;
    public static final int FEBRUARY=36;
    public static final int SUNDAY=68;
    public static final int DAY_OF_WEEK=7;
    public static final int SEVEN=101;
    public static final int ELEVEN=105;
    public static final int THIRTEEN=107;
    public static final int EXPLICIT_DATE=10;
    public static final int INT=4;
    public static final int UPCOMING=62;
    public static final int SIX=100;
    public static final int FIFTH=56;
    public static final int DECEMBER=46;
    public static final int AUGUST=42;
    public static final int SECONDS_OF_MINUTE=20;
    public static final int TUESDAY=70;
    public static final int THIRD=54;
    public static final int INT_47=222;
    public static final int INT_46=221;
    public static final int INT_45=220;
    public static final int INT_44=219;
    public static final int RD=121;
    public static final int INT_49=224;
    public static final int INT_48=223;
    public static final int THE=30;
    public static final int EXPLICIT=246;
    public static final int WHITE_SPACE=25;
    public static final int INT_42=217;
    public static final int INT_43=218;
    public static final int FRIDAY=73;
    public static final int INT_40=215;
    public static final int INT_41=216;
    public static final int AT=26;
    public static final int INT_34=209;
    public static final int INT_33=208;
    public static final int SINGLE_QUOTE=47;
    public static final int INT_36=211;
    public static final int INT_35=210;
    public static final int SLASH=51;
    public static final int INT_38=213;
    public static final int INT_37=212;
    public static final int INT_39=214;
    public static final int NINTH=131;
    public static final int ZONE=22;
    public static final int TWENTIETH=153;
    public static final int PLUS=85;
    public static final int UNKNOWN_TEXT=24;
    public static final int INT_30=165;
    public static final int INT_31=166;
    public static final int AM=81;
    public static final int INT_32=207;
    public static final int INT_29=163;
    public static final int INT_28=162;
    public static final int INT_27=161;
    public static final int INT_26=160;
    public static final int INT_25=159;
    public static final int INT_24=158;
    public static final int INT_23=157;
    public static final int INT_22=156;
    public static final int TH=123;
    public static final int FOURTEENTH=141;
    public static final int SIXTEEN=110;
    public static final int AGO=65;
    public static final int ELEVENTH=135;
    public static final int ST=117;
    public static final int TWO=96;
    public static final int HOUR=80;
    public static final int INT_20=154;
    public static final int INT_21=155;
    public static final int JANUARY=35;
    public static final int THIRTEENTH=139;
    public static final int COLON=78;
    public static final int INT_16=146;
    public static final int INT_15=144;
    public static final int INT_18=150;
    public static final int INT_17=148;
    public static final int INT_12=138;
    public static final int INT_11=136;
    public static final int INT_14=142;
    public static final int INT_13=140;
    public static final int DAY_OF_MONTH=6;
    public static final int INT_19=152;
    public static final int FIFTEEN=109;
    public static final int NINE=103;
    public static final int THREE=97;
    public static final int FOURTEEN=108;
    public static final int YESTERDAY=77;
    public static final int INT_10=134;
    public static final int SEVENTEENTH=147;
    public static final int FIRST=52;
    public static final int INT_81=188;
    public static final int INT_80=187;
    public static final int INT_83=190;
    public static final int WEEK=66;
    public static final int SEPTEMBER=43;
    public static final int INT_82=189;
    public static final int INT_85=192;
    public static final int INT_84=191;
    public static final int INT_87=194;
    public static final int WEDNESDAY=71;
    public static final int INT_86=193;
    public static final int JULY=41;
    public static final int NINETEENTH=151;
    public static final int OCTOBER=44;
    public static final int DAY=31;
    public static final int ONE=95;
    public static final int MIDNIGHT=84;
    public static final int INT_88=195;
    public static final int INT_89=196;
    public static final int MARCH=37;
    public static final int PAST=60;
    public static final int SEVENTEEN=111;
    public static final int DATE_TIME=9;
    public static final int INT_72=179;
    public static final int INT_71=178;
    public static final int INT_70=177;
    public static final int INT_76=183;
    public static final int INT_75=182;
    public static final int INT_74=181;
    public static final int INT_73=180;
    public static final int MINUTES_OF_HOUR=19;
    public static final int THIRTIETH=164;
    public static final int LAST=57;
    public static final int INT_79=186;
    public static final int EIGHTEEN=112;
    public static final int INT_77=184;
    public static final int INT_78=185;
    public static final int ND=119;
    public static final int RELATIVE_DATE=11;
    public static final int INT_63=170;
    public static final int INT_62=169;
    public static final int INT_65=172;
    public static final int FOURTH=55;
    public static final int INT_64=171;
    public static final int SECOND=53;
    public static final int INT_61=168;
    public static final int INT_60=167;
    public static final int SATURDAY=74;
    public static final int FOUR=98;
    public static final int TEN=104;
    public static final int ON=29;
    public static final int MONDAY=69;
    public static final int JUNE=40;
    public static final int OF=34;
    public static final int INT_66=173;
    public static final int INT_67=174;
    public static final int INT_68=175;
    public static final int INT_69=176;
    public static final int INT_54=229;
    public static final int INT_53=228;
    public static final int INT_52=227;
    public static final int INT_51=226;
    public static final int INT_50=225;
    public static final int THURSDAY=72;
    public static final int ZONE_OFFSET=23;
    public static final int SEEK_BY=14;
    public static final int PM=82;
    public static final int EXPLICIT_TIME=17;
    public static final int FROM=63;
    public static final int INT_59=234;
    public static final int INT_57=232;
    public static final int INT_58=233;
    public static final int EIGHTH=129;
    public static final int INT_55=230;
    public static final int INT_56=231;
    public static final int HOURS_OF_DAY=18;
    public static final int YEAR=49;
    public static final int TENTH=133;
    public static final int MAY=39;
    public static final int INT_9=132;
    public static final int INT_8=130;
    public static final int INT_7=128;
    public static final int INT_6=126;
    public static final int INT_5=124;
    public static final int UTC=86;
    public static final int INT_4=122;
    public static final int INT_3=120;
    public static final int AKST=91;
    public static final int INT_2=118;
    public static final int MST=90;
    public static final int INT_1=116;
    public static final int EIGHT=102;
    public static final int INT_0=94;
    public static final int CST=88;
    public static final int IN=48;
    public static final int PST=89;
    public static final int UNKNOWN=245;
    public static final int COMMA=27;
    public static final int FIVE=99;
    public static final int THIRTY=115;
    public static final int NEXT=59;
    public static final int DOT=244;
    public static final int MILITARY_HOUR_SUFFIX=79;
    public static final int EST=87;
    public static final int HAST=92;
    public static final int DASH=50;
    public static final int YEAR_OF=8;
    public static final int TWELVE=106;
    public static final int WEEK_INDEX=16;
    public static final int BEFORE=33;
    public static final int AFTER=32;
    public static final int SIXTEENTH=145;
    public static final int SEEK=12;
    public static final int INT_90=197;
    public static final int INT_97=204;
    public static final int INT_98=205;
    public static final int INT_95=202;
    public static final int INT_96=203;
    public static final int INT_93=200;
    public static final int INT_94=201;
    public static final int INT_91=198;
    public static final int INT_92=199;
    public static final int TWELFTH=137;
    public static final int SIXTH=125;
    public static final int INT_99=206;

    // delegates
    // delegators

    public static final String[] ruleNames = new String[] {
        "invalidRule", "relative_date", "search", "relaxed_date", "explicit_date", 
        "time", "date_time", "date", "seek"
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



    // $ANTLR start "search"
    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:18:1: search : ( date_time )+ ;
    public final void search() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "search");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(18, 1);

        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:19:3: ( ( date_time )+ )
            dbg.enterAlt(1);

            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:19:5: ( date_time )+
            {
            dbg.location(19,5);
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:19:5: ( date_time )+
            int cnt1=0;
            try { dbg.enterSubRule(1);

            loop1:
            do {
                int alt1=2;
                try { dbg.enterDecision(1);

                int LA1_0 = input.LA(1);

                if ( (LA1_0==DATE_TIME) ) {
                    alt1=1;
                }


                } finally {dbg.exitDecision(1);}

                switch (alt1) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:19:5: date_time
            	    {
            	    dbg.location(19,5);
            	    pushFollow(FOLLOW_date_time_in_search45);
            	    date_time();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        dbg.recognitionException(eee);

                        throw eee;
                }
                cnt1++;
            } while (true);
            } finally {dbg.exitSubRule(1);}


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
            dbg.exitRule(getGrammarFileName(), "search");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "search"


    // $ANTLR start "date_time"
    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:22:1: date_time : ^( DATE_TIME ( date )? ( time )? ) ;
    public final void date_time() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "date_time");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(22, 1);

        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:23:3: ( ^( DATE_TIME ( date )? ( time )? ) )
            dbg.enterAlt(1);

            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:23:5: ^( DATE_TIME ( date )? ( time )? )
            {
            dbg.location(23,5);
            dbg.location(23,7);
            match(input,DATE_TIME,FOLLOW_DATE_TIME_in_date_time60); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                dbg.location(23,17);
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:23:17: ( date )?
                int alt2=2;
                try { dbg.enterSubRule(2);
                try { dbg.enterDecision(2);

                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=EXPLICIT_DATE && LA2_0<=RELATIVE_DATE)) ) {
                    alt2=1;
                }
                } finally {dbg.exitDecision(2);}

                switch (alt2) {
                    case 1 :
                        dbg.enterAlt(1);

                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:23:17: date
                        {
                        dbg.location(23,17);
                        pushFollow(FOLLOW_date_in_date_time62);
                        date();

                        state._fsp--;


                        }
                        break;

                }
                } finally {dbg.exitSubRule(2);}

                dbg.location(23,23);
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:23:23: ( time )?
                int alt3=2;
                try { dbg.enterSubRule(3);
                try { dbg.enterDecision(3);

                int LA3_0 = input.LA(1);

                if ( (LA3_0==EXPLICIT_TIME) ) {
                    alt3=1;
                }
                } finally {dbg.exitDecision(3);}

                switch (alt3) {
                    case 1 :
                        dbg.enterAlt(1);

                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:23:23: time
                        {
                        dbg.location(23,23);
                        pushFollow(FOLLOW_time_in_date_time65);
                        time();

                        state._fsp--;


                        }
                        break;

                }
                } finally {dbg.exitSubRule(3);}


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
        dbg.location(24, 3);

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
    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:26:1: date : ( relative_date | explicit_date );
    public final void date() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "date");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(26, 1);

        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:27:3: ( relative_date | explicit_date )
            int alt4=2;
            try { dbg.enterDecision(4);

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

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(4);}

            switch (alt4) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:27:5: relative_date
                    {
                    dbg.location(27,5);
                    pushFollow(FOLLOW_relative_date_in_date84);
                    relative_date();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:28:5: explicit_date
                    {
                    dbg.location(28,5);
                    pushFollow(FOLLOW_explicit_date_in_date91);
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
        dbg.location(29, 3);

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
    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:31:1: relative_date : ( ^( RELATIVE_DATE seek ) | ^( RELATIVE_DATE ^( WEEK_INDEX index= INT ^( DAY_OF_WEEK day= INT ) ^( MONTH_OF_YEAR month= INT ) ) ) );
    public final void relative_date() throws RecognitionException {
        CommonTree index=null;
        CommonTree day=null;
        CommonTree month=null;

        try { dbg.enterRule(getGrammarFileName(), "relative_date");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(31, 1);

        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:32:3: ( ^( RELATIVE_DATE seek ) | ^( RELATIVE_DATE ^( WEEK_INDEX index= INT ^( DAY_OF_WEEK day= INT ) ^( MONTH_OF_YEAR month= INT ) ) ) )
            int alt5=2;
            try { dbg.enterDecision(5);

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

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(5);}

            switch (alt5) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:32:5: ^( RELATIVE_DATE seek )
                    {
                    dbg.location(32,5);
                    dbg.location(32,7);
                    match(input,RELATIVE_DATE,FOLLOW_RELATIVE_DATE_in_relative_date107); 

                    match(input, Token.DOWN, null); 
                    dbg.location(32,21);
                    pushFollow(FOLLOW_seek_in_relative_date109);
                    seek();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:34:5: ^( RELATIVE_DATE ^( WEEK_INDEX index= INT ^( DAY_OF_WEEK day= INT ) ^( MONTH_OF_YEAR month= INT ) ) )
                    {
                    dbg.location(34,5);
                    dbg.location(34,7);
                    match(input,RELATIVE_DATE,FOLLOW_RELATIVE_DATE_in_relative_date120); 

                    match(input, Token.DOWN, null); 
                    dbg.location(34,21);
                    dbg.location(34,23);
                    match(input,WEEK_INDEX,FOLLOW_WEEK_INDEX_in_relative_date123); 

                    match(input, Token.DOWN, null); 
                    dbg.location(34,39);
                    index=(CommonTree)match(input,INT,FOLLOW_INT_in_relative_date127); 
                    dbg.location(34,44);
                    dbg.location(34,46);
                    match(input,DAY_OF_WEEK,FOLLOW_DAY_OF_WEEK_in_relative_date130); 

                    match(input, Token.DOWN, null); 
                    dbg.location(34,61);
                    day=(CommonTree)match(input,INT,FOLLOW_INT_in_relative_date134); 

                    match(input, Token.UP, null); 
                    dbg.location(34,67);
                    dbg.location(34,69);
                    match(input,MONTH_OF_YEAR,FOLLOW_MONTH_OF_YEAR_in_relative_date138); 

                    match(input, Token.DOWN, null); 
                    dbg.location(34,88);
                    month=(CommonTree)match(input,INT,FOLLOW_INT_in_relative_date142); 

                    match(input, Token.UP, null); 

                    match(input, Token.UP, null); 

                    match(input, Token.UP, null); 
                    dbg.location(35,5);
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
        dbg.location(36, 3);

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
    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:38:1: relaxed_date : ^( EXPLICIT seek ) ;
    public final void relaxed_date() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "relaxed_date");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(38, 1);

        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:39:3: ( ^( EXPLICIT seek ) )
            dbg.enterAlt(1);

            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:39:5: ^( EXPLICIT seek )
            {
            dbg.location(39,5);
            dbg.location(39,7);
            match(input,EXPLICIT,FOLLOW_EXPLICIT_in_relaxed_date167); 

            match(input, Token.DOWN, null); 
            dbg.location(39,16);
            pushFollow(FOLLOW_seek_in_relaxed_date169);
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
        dbg.location(40, 3);

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
    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:42:1: explicit_date : ( ^( EXPLICIT_DATE ^( MONTH_OF_YEAR month= INT ) ^( DAY_OF_MONTH day_of_month= INT ) ^( DAY_OF_WEEK day_of_week= INT ) ^( YEAR_OF year= INT ) ) | ^( EXPLICIT_DATE ^( MONTH_OF_YEAR month= INT ) ^( DAY_OF_MONTH day_of_month= INT ) ^( DAY_OF_WEEK day_of_week= INT ) ) | ^( EXPLICIT_DATE ^( MONTH_OF_YEAR month= INT ) ^( DAY_OF_MONTH day_of_month= INT ) ^( YEAR_OF year= INT ) ) | ^( EXPLICIT_DATE ^( MONTH_OF_YEAR month= INT ) ^( DAY_OF_MONTH day_of_month= INT ) ) ) ;
    public final void explicit_date() throws RecognitionException {
        CommonTree month=null;
        CommonTree day_of_month=null;
        CommonTree day_of_week=null;
        CommonTree year=null;

        try { dbg.enterRule(getGrammarFileName(), "explicit_date");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(42, 1);

        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:43:3: ( ( ^( EXPLICIT_DATE ^( MONTH_OF_YEAR month= INT ) ^( DAY_OF_MONTH day_of_month= INT ) ^( DAY_OF_WEEK day_of_week= INT ) ^( YEAR_OF year= INT ) ) | ^( EXPLICIT_DATE ^( MONTH_OF_YEAR month= INT ) ^( DAY_OF_MONTH day_of_month= INT ) ^( DAY_OF_WEEK day_of_week= INT ) ) | ^( EXPLICIT_DATE ^( MONTH_OF_YEAR month= INT ) ^( DAY_OF_MONTH day_of_month= INT ) ^( YEAR_OF year= INT ) ) | ^( EXPLICIT_DATE ^( MONTH_OF_YEAR month= INT ) ^( DAY_OF_MONTH day_of_month= INT ) ) ) )
            dbg.enterAlt(1);

            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:43:5: ( ^( EXPLICIT_DATE ^( MONTH_OF_YEAR month= INT ) ^( DAY_OF_MONTH day_of_month= INT ) ^( DAY_OF_WEEK day_of_week= INT ) ^( YEAR_OF year= INT ) ) | ^( EXPLICIT_DATE ^( MONTH_OF_YEAR month= INT ) ^( DAY_OF_MONTH day_of_month= INT ) ^( DAY_OF_WEEK day_of_week= INT ) ) | ^( EXPLICIT_DATE ^( MONTH_OF_YEAR month= INT ) ^( DAY_OF_MONTH day_of_month= INT ) ^( YEAR_OF year= INT ) ) | ^( EXPLICIT_DATE ^( MONTH_OF_YEAR month= INT ) ^( DAY_OF_MONTH day_of_month= INT ) ) )
            {
            dbg.location(43,5);
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:43:5: ( ^( EXPLICIT_DATE ^( MONTH_OF_YEAR month= INT ) ^( DAY_OF_MONTH day_of_month= INT ) ^( DAY_OF_WEEK day_of_week= INT ) ^( YEAR_OF year= INT ) ) | ^( EXPLICIT_DATE ^( MONTH_OF_YEAR month= INT ) ^( DAY_OF_MONTH day_of_month= INT ) ^( DAY_OF_WEEK day_of_week= INT ) ) | ^( EXPLICIT_DATE ^( MONTH_OF_YEAR month= INT ) ^( DAY_OF_MONTH day_of_month= INT ) ^( YEAR_OF year= INT ) ) | ^( EXPLICIT_DATE ^( MONTH_OF_YEAR month= INT ) ^( DAY_OF_MONTH day_of_month= INT ) ) )
            int alt6=4;
            try { dbg.enterSubRule(6);
            try { dbg.enterDecision(6);

            try {
                isCyclicDecision = true;
                alt6 = dfa6.predict(input);
            }
            catch (NoViableAltException nvae) {
                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(6);}

            switch (alt6) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:43:6: ^( EXPLICIT_DATE ^( MONTH_OF_YEAR month= INT ) ^( DAY_OF_MONTH day_of_month= INT ) ^( DAY_OF_WEEK day_of_week= INT ) ^( YEAR_OF year= INT ) )
                    {
                    dbg.location(43,6);
                    dbg.location(43,8);
                    match(input,EXPLICIT_DATE,FOLLOW_EXPLICIT_DATE_in_explicit_date187); 

                    match(input, Token.DOWN, null); 
                    dbg.location(43,22);
                    dbg.location(43,24);
                    match(input,MONTH_OF_YEAR,FOLLOW_MONTH_OF_YEAR_in_explicit_date190); 

                    match(input, Token.DOWN, null); 
                    dbg.location(43,43);
                    month=(CommonTree)match(input,INT,FOLLOW_INT_in_explicit_date194); 

                    match(input, Token.UP, null); 
                    dbg.location(43,49);
                    dbg.location(43,51);
                    match(input,DAY_OF_MONTH,FOLLOW_DAY_OF_MONTH_in_explicit_date198); 

                    match(input, Token.DOWN, null); 
                    dbg.location(43,76);
                    day_of_month=(CommonTree)match(input,INT,FOLLOW_INT_in_explicit_date202); 

                    match(input, Token.UP, null); 
                    dbg.location(43,82);
                    dbg.location(43,84);
                    match(input,DAY_OF_WEEK,FOLLOW_DAY_OF_WEEK_in_explicit_date206); 

                    match(input, Token.DOWN, null); 
                    dbg.location(43,107);
                    day_of_week=(CommonTree)match(input,INT,FOLLOW_INT_in_explicit_date210); 

                    match(input, Token.UP, null); 
                    dbg.location(43,113);
                    dbg.location(43,115);
                    match(input,YEAR_OF,FOLLOW_YEAR_OF_in_explicit_date214); 

                    match(input, Token.DOWN, null); 
                    dbg.location(43,127);
                    year=(CommonTree)match(input,INT,FOLLOW_INT_in_explicit_date218); 

                    match(input, Token.UP, null); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:44:5: ^( EXPLICIT_DATE ^( MONTH_OF_YEAR month= INT ) ^( DAY_OF_MONTH day_of_month= INT ) ^( DAY_OF_WEEK day_of_week= INT ) )
                    {
                    dbg.location(44,5);
                    dbg.location(44,7);
                    match(input,EXPLICIT_DATE,FOLLOW_EXPLICIT_DATE_in_explicit_date227); 

                    match(input, Token.DOWN, null); 
                    dbg.location(44,21);
                    dbg.location(44,23);
                    match(input,MONTH_OF_YEAR,FOLLOW_MONTH_OF_YEAR_in_explicit_date230); 

                    match(input, Token.DOWN, null); 
                    dbg.location(44,42);
                    month=(CommonTree)match(input,INT,FOLLOW_INT_in_explicit_date234); 

                    match(input, Token.UP, null); 
                    dbg.location(44,48);
                    dbg.location(44,50);
                    match(input,DAY_OF_MONTH,FOLLOW_DAY_OF_MONTH_in_explicit_date238); 

                    match(input, Token.DOWN, null); 
                    dbg.location(44,75);
                    day_of_month=(CommonTree)match(input,INT,FOLLOW_INT_in_explicit_date242); 

                    match(input, Token.UP, null); 
                    dbg.location(44,81);
                    dbg.location(44,83);
                    match(input,DAY_OF_WEEK,FOLLOW_DAY_OF_WEEK_in_explicit_date246); 

                    match(input, Token.DOWN, null); 
                    dbg.location(44,106);
                    day_of_week=(CommonTree)match(input,INT,FOLLOW_INT_in_explicit_date250); 

                    match(input, Token.UP, null); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:45:5: ^( EXPLICIT_DATE ^( MONTH_OF_YEAR month= INT ) ^( DAY_OF_MONTH day_of_month= INT ) ^( YEAR_OF year= INT ) )
                    {
                    dbg.location(45,5);
                    dbg.location(45,7);
                    match(input,EXPLICIT_DATE,FOLLOW_EXPLICIT_DATE_in_explicit_date259); 

                    match(input, Token.DOWN, null); 
                    dbg.location(45,21);
                    dbg.location(45,23);
                    match(input,MONTH_OF_YEAR,FOLLOW_MONTH_OF_YEAR_in_explicit_date262); 

                    match(input, Token.DOWN, null); 
                    dbg.location(45,42);
                    month=(CommonTree)match(input,INT,FOLLOW_INT_in_explicit_date266); 

                    match(input, Token.UP, null); 
                    dbg.location(45,48);
                    dbg.location(45,50);
                    match(input,DAY_OF_MONTH,FOLLOW_DAY_OF_MONTH_in_explicit_date270); 

                    match(input, Token.DOWN, null); 
                    dbg.location(45,75);
                    day_of_month=(CommonTree)match(input,INT,FOLLOW_INT_in_explicit_date274); 

                    match(input, Token.UP, null); 
                    dbg.location(45,81);
                    dbg.location(45,83);
                    match(input,YEAR_OF,FOLLOW_YEAR_OF_in_explicit_date278); 

                    match(input, Token.DOWN, null); 
                    dbg.location(45,95);
                    year=(CommonTree)match(input,INT,FOLLOW_INT_in_explicit_date282); 

                    match(input, Token.UP, null); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:46:5: ^( EXPLICIT_DATE ^( MONTH_OF_YEAR month= INT ) ^( DAY_OF_MONTH day_of_month= INT ) )
                    {
                    dbg.location(46,5);
                    dbg.location(46,7);
                    match(input,EXPLICIT_DATE,FOLLOW_EXPLICIT_DATE_in_explicit_date291); 

                    match(input, Token.DOWN, null); 
                    dbg.location(46,21);
                    dbg.location(46,23);
                    match(input,MONTH_OF_YEAR,FOLLOW_MONTH_OF_YEAR_in_explicit_date294); 

                    match(input, Token.DOWN, null); 
                    dbg.location(46,42);
                    month=(CommonTree)match(input,INT,FOLLOW_INT_in_explicit_date298); 

                    match(input, Token.UP, null); 
                    dbg.location(46,48);
                    dbg.location(46,50);
                    match(input,DAY_OF_MONTH,FOLLOW_DAY_OF_MONTH_in_explicit_date302); 

                    match(input, Token.DOWN, null); 
                    dbg.location(46,75);
                    day_of_month=(CommonTree)match(input,INT,FOLLOW_INT_in_explicit_date306); 

                    match(input, Token.UP, null); 

                    match(input, Token.UP, null); 

                    }
                    break;

            }
            } finally {dbg.exitSubRule(6);}

            dbg.location(47,5);
            _walkerState.setExplicitDate((month!=null?month.getText():null), (day_of_month!=null?day_of_month.getText():null), (day_of_week!=null?day_of_week.getText():null), (year!=null?year.getText():null));

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(48, 3);

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
    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:50:1: time : ^( EXPLICIT_TIME ^( HOURS_OF_DAY hours= INT ) ^( MINUTES_OF_HOUR minutes= INT ) ^( SECONDS_OF_MINUTE (seconds= INT )? ) ( AM_PM )? (zone= ZONE | zone= ZONE_OFFSET )? ) ;
    public final void time() throws RecognitionException {
        CommonTree hours=null;
        CommonTree minutes=null;
        CommonTree seconds=null;
        CommonTree zone=null;
        CommonTree AM_PM1=null;

        try { dbg.enterRule(getGrammarFileName(), "time");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(50, 1);

        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:51:3: ( ^( EXPLICIT_TIME ^( HOURS_OF_DAY hours= INT ) ^( MINUTES_OF_HOUR minutes= INT ) ^( SECONDS_OF_MINUTE (seconds= INT )? ) ( AM_PM )? (zone= ZONE | zone= ZONE_OFFSET )? ) )
            dbg.enterAlt(1);

            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:51:5: ^( EXPLICIT_TIME ^( HOURS_OF_DAY hours= INT ) ^( MINUTES_OF_HOUR minutes= INT ) ^( SECONDS_OF_MINUTE (seconds= INT )? ) ( AM_PM )? (zone= ZONE | zone= ZONE_OFFSET )? )
            {
            dbg.location(51,5);
            dbg.location(51,7);
            match(input,EXPLICIT_TIME,FOLLOW_EXPLICIT_TIME_in_time331); 

            match(input, Token.DOWN, null); 
            dbg.location(51,21);
            dbg.location(51,23);
            match(input,HOURS_OF_DAY,FOLLOW_HOURS_OF_DAY_in_time334); 

            match(input, Token.DOWN, null); 
            dbg.location(51,41);
            hours=(CommonTree)match(input,INT,FOLLOW_INT_in_time338); 

            match(input, Token.UP, null); 
            dbg.location(51,47);
            dbg.location(51,49);
            match(input,MINUTES_OF_HOUR,FOLLOW_MINUTES_OF_HOUR_in_time342); 

            match(input, Token.DOWN, null); 
            dbg.location(51,72);
            minutes=(CommonTree)match(input,INT,FOLLOW_INT_in_time346); 

            match(input, Token.UP, null); 
            dbg.location(52,7);
            dbg.location(52,9);
            match(input,SECONDS_OF_MINUTE,FOLLOW_SECONDS_OF_MINUTE_in_time357); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                dbg.location(52,34);
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:52:34: (seconds= INT )?
                int alt7=2;
                try { dbg.enterSubRule(7);
                try { dbg.enterDecision(7);

                int LA7_0 = input.LA(1);

                if ( (LA7_0==INT) ) {
                    alt7=1;
                }
                } finally {dbg.exitDecision(7);}

                switch (alt7) {
                    case 1 :
                        dbg.enterAlt(1);

                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:52:34: seconds= INT
                        {
                        dbg.location(52,34);
                        seconds=(CommonTree)match(input,INT,FOLLOW_INT_in_time361); 

                        }
                        break;

                }
                } finally {dbg.exitSubRule(7);}


                match(input, Token.UP, null); 
            }
            dbg.location(52,41);
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:52:41: ( AM_PM )?
            int alt8=2;
            try { dbg.enterSubRule(8);
            try { dbg.enterDecision(8);

            int LA8_0 = input.LA(1);

            if ( (LA8_0==AM_PM) ) {
                alt8=1;
            }
            } finally {dbg.exitDecision(8);}

            switch (alt8) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:52:41: AM_PM
                    {
                    dbg.location(52,41);
                    AM_PM1=(CommonTree)match(input,AM_PM,FOLLOW_AM_PM_in_time365); 

                    }
                    break;

            }
            } finally {dbg.exitSubRule(8);}

            dbg.location(52,48);
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:52:48: (zone= ZONE | zone= ZONE_OFFSET )?
            int alt9=3;
            try { dbg.enterSubRule(9);
            try { dbg.enterDecision(9);

            int LA9_0 = input.LA(1);

            if ( (LA9_0==ZONE) ) {
                alt9=1;
            }
            else if ( (LA9_0==ZONE_OFFSET) ) {
                alt9=2;
            }
            } finally {dbg.exitDecision(9);}

            switch (alt9) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:52:49: zone= ZONE
                    {
                    dbg.location(52,53);
                    zone=(CommonTree)match(input,ZONE,FOLLOW_ZONE_in_time371); 

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:52:61: zone= ZONE_OFFSET
                    {
                    dbg.location(52,65);
                    zone=(CommonTree)match(input,ZONE_OFFSET,FOLLOW_ZONE_OFFSET_in_time377); 

                    }
                    break;

            }
            } finally {dbg.exitSubRule(9);}


            match(input, Token.UP, null); 
            dbg.location(53,5);
            _walkerState.setExplicitTime((hours!=null?hours.getText():null), (minutes!=null?minutes.getText():null), (seconds!=null?seconds.getText():null), (AM_PM1!=null?AM_PM1.getText():null), (zone!=null?zone.getText():null));

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(54, 3);

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
    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:56:1: seek : ( ^( SEEK DIRECTION by= SEEK_BY amount= INT ^( DAY_OF_WEEK day= INT ) ) | ^( SEEK DIRECTION SEEK_BY amount= INT ^( MONTH_OF_YEAR month= INT ) ) | ^( SEEK DIRECTION SEEK_BY INT SPAN ) | ^( SEEK DIRECTION SEEK_BY INT date ) );
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
        dbg.location(56, 1);

        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:57:3: ( ^( SEEK DIRECTION by= SEEK_BY amount= INT ^( DAY_OF_WEEK day= INT ) ) | ^( SEEK DIRECTION SEEK_BY amount= INT ^( MONTH_OF_YEAR month= INT ) ) | ^( SEEK DIRECTION SEEK_BY INT SPAN ) | ^( SEEK DIRECTION SEEK_BY INT date ) )
            int alt10=4;
            try { dbg.enterDecision(10);

            try {
                isCyclicDecision = true;
                alt10 = dfa10.predict(input);
            }
            catch (NoViableAltException nvae) {
                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(10);}

            switch (alt10) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:57:5: ^( SEEK DIRECTION by= SEEK_BY amount= INT ^( DAY_OF_WEEK day= INT ) )
                    {
                    dbg.location(57,5);
                    dbg.location(57,7);
                    match(input,SEEK,FOLLOW_SEEK_in_seek402); 

                    match(input, Token.DOWN, null); 
                    dbg.location(57,12);
                    DIRECTION2=(CommonTree)match(input,DIRECTION,FOLLOW_DIRECTION_in_seek404); 
                    dbg.location(57,24);
                    by=(CommonTree)match(input,SEEK_BY,FOLLOW_SEEK_BY_in_seek408); 
                    dbg.location(57,39);
                    amount=(CommonTree)match(input,INT,FOLLOW_INT_in_seek412); 
                    dbg.location(57,44);
                    dbg.location(57,46);
                    match(input,DAY_OF_WEEK,FOLLOW_DAY_OF_WEEK_in_seek415); 

                    match(input, Token.DOWN, null); 
                    dbg.location(57,61);
                    day=(CommonTree)match(input,INT,FOLLOW_INT_in_seek419); 

                    match(input, Token.UP, null); 

                    match(input, Token.UP, null); 
                    dbg.location(58,5);
                    _walkerState.seekToDayOfWeek((DIRECTION2!=null?DIRECTION2.getText():null), (by!=null?by.getText():null), (amount!=null?amount.getText():null), (day!=null?day.getText():null));

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:60:5: ^( SEEK DIRECTION SEEK_BY amount= INT ^( MONTH_OF_YEAR month= INT ) )
                    {
                    dbg.location(60,5);
                    dbg.location(60,7);
                    match(input,SEEK,FOLLOW_SEEK_in_seek439); 

                    match(input, Token.DOWN, null); 
                    dbg.location(60,12);
                    DIRECTION3=(CommonTree)match(input,DIRECTION,FOLLOW_DIRECTION_in_seek441); 
                    dbg.location(60,22);
                    match(input,SEEK_BY,FOLLOW_SEEK_BY_in_seek443); 
                    dbg.location(60,36);
                    amount=(CommonTree)match(input,INT,FOLLOW_INT_in_seek447); 
                    dbg.location(60,41);
                    dbg.location(60,43);
                    match(input,MONTH_OF_YEAR,FOLLOW_MONTH_OF_YEAR_in_seek450); 

                    match(input, Token.DOWN, null); 
                    dbg.location(60,62);
                    month=(CommonTree)match(input,INT,FOLLOW_INT_in_seek454); 

                    match(input, Token.UP, null); 

                    match(input, Token.UP, null); 
                    dbg.location(61,5);
                    _walkerState.seekToMonth((DIRECTION3!=null?DIRECTION3.getText():null), (amount!=null?amount.getText():null), (month!=null?month.getText():null));

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:63:5: ^( SEEK DIRECTION SEEK_BY INT SPAN )
                    {
                    dbg.location(63,5);
                    dbg.location(63,7);
                    match(input,SEEK,FOLLOW_SEEK_in_seek472); 

                    match(input, Token.DOWN, null); 
                    dbg.location(63,12);
                    DIRECTION4=(CommonTree)match(input,DIRECTION,FOLLOW_DIRECTION_in_seek474); 
                    dbg.location(63,22);
                    match(input,SEEK_BY,FOLLOW_SEEK_BY_in_seek476); 
                    dbg.location(63,30);
                    INT5=(CommonTree)match(input,INT,FOLLOW_INT_in_seek478); 
                    dbg.location(63,34);
                    SPAN6=(CommonTree)match(input,SPAN,FOLLOW_SPAN_in_seek480); 

                    match(input, Token.UP, null); 
                    dbg.location(64,5);
                    _walkerState.seekBySpan((DIRECTION4!=null?DIRECTION4.getText():null), (INT5!=null?INT5.getText():null), (SPAN6!=null?SPAN6.getText():null));

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:66:5: ^( SEEK DIRECTION SEEK_BY INT date )
                    {
                    dbg.location(66,5);
                    dbg.location(66,7);
                    match(input,SEEK,FOLLOW_SEEK_in_seek497); 

                    match(input, Token.DOWN, null); 
                    dbg.location(66,12);
                    DIRECTION7=(CommonTree)match(input,DIRECTION,FOLLOW_DIRECTION_in_seek499); 
                    dbg.location(66,22);
                    match(input,SEEK_BY,FOLLOW_SEEK_BY_in_seek501); 
                    dbg.location(66,30);
                    INT8=(CommonTree)match(input,INT,FOLLOW_INT_in_seek503); 
                    dbg.location(66,34);
                    pushFollow(FOLLOW_date_in_seek505);
                    date();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    dbg.location(67,5);
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
        dbg.location(68, 3);

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


    protected DFA6 dfa6 = new DFA6(this);
    protected DFA10 dfa10 = new DFA10(this);
    static final String DFA6_eotS =
        "\23\uffff";
    static final String DFA6_eofS =
        "\23\uffff";
    static final String DFA6_minS =
        "\1\12\1\2\1\5\1\2\1\4\1\3\1\6\1\2\1\4\2\3\1\2\2\uffff\1\4\2\3\2"+
        "\uffff";
    static final String DFA6_maxS =
        "\1\12\1\2\1\5\1\2\1\4\1\3\1\6\1\2\1\4\1\3\1\10\1\2\2\uffff\1\4\1"+
        "\3\1\10\2\uffff";
    static final String DFA6_acceptS =
        "\14\uffff\1\3\1\4\3\uffff\1\1\1\2";
    static final String DFA6_specialS =
        "\23\uffff}>";
    static final String[] DFA6_transitionS = {
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

    static final short[] DFA6_eot = DFA.unpackEncodedString(DFA6_eotS);
    static final short[] DFA6_eof = DFA.unpackEncodedString(DFA6_eofS);
    static final char[] DFA6_min = DFA.unpackEncodedStringToUnsignedChars(DFA6_minS);
    static final char[] DFA6_max = DFA.unpackEncodedStringToUnsignedChars(DFA6_maxS);
    static final short[] DFA6_accept = DFA.unpackEncodedString(DFA6_acceptS);
    static final short[] DFA6_special = DFA.unpackEncodedString(DFA6_specialS);
    static final short[][] DFA6_transition;

    static {
        int numStates = DFA6_transitionS.length;
        DFA6_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA6_transition[i] = DFA.unpackEncodedString(DFA6_transitionS[i]);
        }
    }

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = DFA6_eot;
            this.eof = DFA6_eof;
            this.min = DFA6_min;
            this.max = DFA6_max;
            this.accept = DFA6_accept;
            this.special = DFA6_special;
            this.transition = DFA6_transition;
        }
        public String getDescription() {
            return "43:5: ( ^( EXPLICIT_DATE ^( MONTH_OF_YEAR month= INT ) ^( DAY_OF_MONTH day_of_month= INT ) ^( DAY_OF_WEEK day_of_week= INT ) ^( YEAR_OF year= INT ) ) | ^( EXPLICIT_DATE ^( MONTH_OF_YEAR month= INT ) ^( DAY_OF_MONTH day_of_month= INT ) ^( DAY_OF_WEEK day_of_week= INT ) ) | ^( EXPLICIT_DATE ^( MONTH_OF_YEAR month= INT ) ^( DAY_OF_MONTH day_of_month= INT ) ^( YEAR_OF year= INT ) ) | ^( EXPLICIT_DATE ^( MONTH_OF_YEAR month= INT ) ^( DAY_OF_MONTH day_of_month= INT ) ) )";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
    }
    static final String DFA10_eotS =
        "\12\uffff";
    static final String DFA10_eofS =
        "\12\uffff";
    static final String DFA10_minS =
        "\1\14\1\2\1\15\1\16\1\4\1\5\4\uffff";
    static final String DFA10_maxS =
        "\1\14\1\2\1\15\1\16\1\4\1\17\4\uffff";
    static final String DFA10_acceptS =
        "\6\uffff\1\1\1\2\1\3\1\4";
    static final String DFA10_specialS =
        "\12\uffff}>";
    static final String[] DFA10_transitionS = {
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

    static final short[] DFA10_eot = DFA.unpackEncodedString(DFA10_eotS);
    static final short[] DFA10_eof = DFA.unpackEncodedString(DFA10_eofS);
    static final char[] DFA10_min = DFA.unpackEncodedStringToUnsignedChars(DFA10_minS);
    static final char[] DFA10_max = DFA.unpackEncodedStringToUnsignedChars(DFA10_maxS);
    static final short[] DFA10_accept = DFA.unpackEncodedString(DFA10_acceptS);
    static final short[] DFA10_special = DFA.unpackEncodedString(DFA10_specialS);
    static final short[][] DFA10_transition;

    static {
        int numStates = DFA10_transitionS.length;
        DFA10_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA10_transition[i] = DFA.unpackEncodedString(DFA10_transitionS[i]);
        }
    }

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = DFA10_eot;
            this.eof = DFA10_eof;
            this.min = DFA10_min;
            this.max = DFA10_max;
            this.accept = DFA10_accept;
            this.special = DFA10_special;
            this.transition = DFA10_transition;
        }
        public String getDescription() {
            return "56:1: seek : ( ^( SEEK DIRECTION by= SEEK_BY amount= INT ^( DAY_OF_WEEK day= INT ) ) | ^( SEEK DIRECTION SEEK_BY amount= INT ^( MONTH_OF_YEAR month= INT ) ) | ^( SEEK DIRECTION SEEK_BY INT SPAN ) | ^( SEEK DIRECTION SEEK_BY INT date ) );";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
    }
 

    public static final BitSet FOLLOW_date_time_in_search45 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_DATE_TIME_in_date_time60 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_date_in_date_time62 = new BitSet(new long[]{0x0000000000020008L});
    public static final BitSet FOLLOW_time_in_date_time65 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_relative_date_in_date84 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_explicit_date_in_date91 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RELATIVE_DATE_in_relative_date107 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_seek_in_relative_date109 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_RELATIVE_DATE_in_relative_date120 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_WEEK_INDEX_in_relative_date123 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INT_in_relative_date127 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_DAY_OF_WEEK_in_relative_date130 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INT_in_relative_date134 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MONTH_OF_YEAR_in_relative_date138 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INT_in_relative_date142 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EXPLICIT_in_relaxed_date167 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_seek_in_relaxed_date169 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EXPLICIT_DATE_in_explicit_date187 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_MONTH_OF_YEAR_in_explicit_date190 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INT_in_explicit_date194 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DAY_OF_MONTH_in_explicit_date198 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INT_in_explicit_date202 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DAY_OF_WEEK_in_explicit_date206 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INT_in_explicit_date210 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_YEAR_OF_in_explicit_date214 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INT_in_explicit_date218 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EXPLICIT_DATE_in_explicit_date227 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_MONTH_OF_YEAR_in_explicit_date230 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INT_in_explicit_date234 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DAY_OF_MONTH_in_explicit_date238 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INT_in_explicit_date242 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DAY_OF_WEEK_in_explicit_date246 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INT_in_explicit_date250 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EXPLICIT_DATE_in_explicit_date259 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_MONTH_OF_YEAR_in_explicit_date262 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INT_in_explicit_date266 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DAY_OF_MONTH_in_explicit_date270 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INT_in_explicit_date274 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_YEAR_OF_in_explicit_date278 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INT_in_explicit_date282 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EXPLICIT_DATE_in_explicit_date291 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_MONTH_OF_YEAR_in_explicit_date294 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INT_in_explicit_date298 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DAY_OF_MONTH_in_explicit_date302 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INT_in_explicit_date306 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EXPLICIT_TIME_in_time331 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_HOURS_OF_DAY_in_time334 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INT_in_time338 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MINUTES_OF_HOUR_in_time342 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INT_in_time346 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SECONDS_OF_MINUTE_in_time357 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INT_in_time361 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AM_PM_in_time365 = new BitSet(new long[]{0x0000000000C00008L});
    public static final BitSet FOLLOW_ZONE_in_time371 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ZONE_OFFSET_in_time377 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SEEK_in_seek402 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DIRECTION_in_seek404 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_SEEK_BY_in_seek408 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_INT_in_seek412 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_DAY_OF_WEEK_in_seek415 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INT_in_seek419 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SEEK_in_seek439 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DIRECTION_in_seek441 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_SEEK_BY_in_seek443 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_INT_in_seek447 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_MONTH_OF_YEAR_in_seek450 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INT_in_seek454 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SEEK_in_seek472 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DIRECTION_in_seek474 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_SEEK_BY_in_seek476 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_INT_in_seek478 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_SPAN_in_seek480 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SEEK_in_seek497 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DIRECTION_in_seek499 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_SEEK_BY_in_seek501 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_INT_in_seek503 = new BitSet(new long[]{0x0000000000000C00L});
    public static final BitSet FOLLOW_date_in_seek505 = new BitSet(new long[]{0x0000000000000008L});

}