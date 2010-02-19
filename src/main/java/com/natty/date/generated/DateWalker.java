// $ANTLR 3.2 Sep 23, 2009 12:02:23 /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateWalker.g 2010-02-19 14:07:11
 package com.natty.date.generated; 

import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.debug.*;
import java.io.IOException;
public class DateWalker extends DebugTreeParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "DOT", "JANUARY", "FEBRUARY", "MARCH", "APRIL", "MAY", "JUNE", "JULY", "AUGUST", "SEPTEMBER", "OCTOBER", "NOVEMBER", "DECEMBER", "SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY", "HOUR", "DAY", "WEEK", "MONTH", "YEAR", "TODAY", "TOMORROW", "YESTERDAY", "AM", "PM", "T", "MILITARY_HOUR_SUFFIX", "MIDNIGHT", "NOON", "MORNING", "UTC", "EST", "PST", "CST", "MST", "AKST", "HAST", "INT_00", "INT_01", "INT_02", "INT_03", "INT_04", "INT_05", "INT_06", "INT_07", "INT_08", "INT_09", "INT_0", "INT_1", "INT_2", "INT_3", "INT_4", "INT_5", "INT_6", "INT_7", "INT_8", "INT_9", "INT_10", "INT_11", "INT_12", "INT_13", "INT_14", "INT_15", "INT_16", "INT_17", "INT_18", "INT_19", "INT_20", "INT_21", "INT_22", "INT_23", "INT_24", "INT_25", "INT_26", "INT_27", "INT_28", "INT_29", "INT_30", "INT_31", "INT_32", "INT_33", "INT_34", "INT_35", "INT_36", "INT_37", "INT_38", "INT_39", "INT_40", "INT_41", "INT_42", "INT_43", "INT_44", "INT_45", "INT_46", "INT_47", "INT_48", "INT_49", "INT_50", "INT_51", "INT_52", "INT_53", "INT_54", "INT_55", "INT_56", "INT_57", "INT_58", "INT_59", "INT_60", "INT_61", "INT_62", "INT_63", "INT_64", "INT_65", "INT_66", "INT_67", "INT_68", "INT_69", "INT_70", "INT_71", "INT_72", "INT_73", "INT_74", "INT_75", "INT_76", "INT_77", "INT_78", "INT_79", "INT_80", "INT_81", "INT_82", "INT_83", "INT_84", "INT_85", "INT_86", "INT_87", "INT_88", "INT_89", "INT_90", "INT_91", "INT_92", "INT_93", "INT_94", "INT_95", "INT_96", "INT_97", "INT_98", "INT_99", "ST", "ND", "RD", "TH", "ONE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", "NINE", "TEN", "ELEVEN", "TWELVE", "THIRTEEN", "FOURTEEN", "FIFTEEN", "SIXTEEN", "SEVENTEEN", "EIGHTEEN", "NINETEEN", "TWENTY", "THIRTY", "FIRST", "SECOND", "THIRD", "FOURTH", "FIFTH", "SIXTH", "SEVENTH", "EIGHTH", "NINTH", "TENTH", "ELEVENTH", "TWELFTH", "THIRTEENTH", "FOURTEENTH", "FIFTEENTH", "SIXTEENTH", "SEVENTEENTH", "EIGHTEENTH", "NINETEENTH", "TWENTIETH", "THIRTIETH", "COLON", "COMMA", "DASH", "SLASH", "PLUS", "SINGLE_QUOTE", "IN", "THE", "AT", "ON", "OF", "THIS", "LAST", "NEXT", "PAST", "COMING", "UPCOMING", "FROM", "NOW", "AGO", "BEFORE", "AFTER", "SPACE", "WHITE_SPACE", "UNKNOWN", "DIGIT", "INT", "MONTH_OF_YEAR", "DAY_OF_MONTH", "DAY_OF_WEEK", "YEAR_OF", "DATE_TIME", "EXPLICIT_DATE", "RELATIVE_DATE", "SEEK", "DIRECTION", "SEEK_BY", "SPAN", "WEEK_INDEX", "EXPLICIT_TIME", "HOURS_OF_DAY", "MINUTES_OF_HOUR", "SECONDS_OF_MINUTE", "AM_PM", "ZONE", "ZONE_OFFSET"
    };
    public static final int DIRECTION=237;
    public static final int NINETEEN=178;
    public static final int INT_08=54;
    public static final int INT_09=55;
    public static final int TWENTY=179;
    public static final int INT_02=48;
    public static final int INT_03=49;
    public static final int INT_00=46;
    public static final int INT_01=47;
    public static final int APRIL=8;
    public static final int INT_06=52;
    public static final int COMING=217;
    public static final int INT_07=53;
    public static final int INT_04=50;
    public static final int INT_05=51;
    public static final int NOW=220;
    public static final int EOF=-1;
    public static final int MONTH=27;
    public static final int AM_PM=245;
    public static final int EIGHTEENTH=198;
    public static final int SPAN=239;
    public static final int THIS=213;
    public static final int NOON=37;
    public static final int TOMORROW=30;
    public static final int FIFTEENTH=195;
    public static final int TODAY=29;
    public static final int NOVEMBER=15;
    public static final int MONTH_OF_YEAR=229;
    public static final int SEVENTH=187;
    public static final int FEBRUARY=6;
    public static final int T=34;
    public static final int DAY_OF_WEEK=231;
    public static final int SUNDAY=17;
    public static final int SEVEN=166;
    public static final int ELEVEN=170;
    public static final int THIRTEEN=172;
    public static final int EXPLICIT_DATE=234;
    public static final int INT=228;
    public static final int UPCOMING=218;
    public static final int SIX=165;
    public static final int FIFTH=185;
    public static final int MORNING=38;
    public static final int DECEMBER=16;
    public static final int AUGUST=12;
    public static final int SECONDS_OF_MINUTE=244;
    public static final int TUESDAY=19;
    public static final int THIRD=183;
    public static final int INT_47=103;
    public static final int INT_46=102;
    public static final int INT_45=101;
    public static final int INT_44=100;
    public static final int RD=158;
    public static final int INT_49=105;
    public static final int INT_48=104;
    public static final int THE=209;
    public static final int WHITE_SPACE=225;
    public static final int INT_42=98;
    public static final int INT_43=99;
    public static final int FRIDAY=22;
    public static final int INT_40=96;
    public static final int INT_41=97;
    public static final int AT=210;
    public static final int INT_34=90;
    public static final int INT_33=89;
    public static final int SINGLE_QUOTE=207;
    public static final int INT_36=92;
    public static final int INT_35=91;
    public static final int SLASH=205;
    public static final int INT_38=94;
    public static final int INT_37=93;
    public static final int INT_39=95;
    public static final int NINTH=189;
    public static final int ZONE=246;
    public static final int TWENTIETH=200;
    public static final int PLUS=206;
    public static final int INT_30=86;
    public static final int INT_31=87;
    public static final int AM=32;
    public static final int INT_32=88;
    public static final int INT_29=85;
    public static final int INT_28=84;
    public static final int INT_27=83;
    public static final int INT_26=82;
    public static final int INT_25=81;
    public static final int INT_24=80;
    public static final int INT_23=79;
    public static final int INT_22=78;
    public static final int TH=159;
    public static final int FOURTEENTH=194;
    public static final int SIXTEEN=175;
    public static final int AGO=221;
    public static final int ELEVENTH=191;
    public static final int ST=156;
    public static final int TWO=161;
    public static final int HOUR=24;
    public static final int INT_20=76;
    public static final int INT_21=77;
    public static final int JANUARY=5;
    public static final int THIRTEENTH=193;
    public static final int COLON=202;
    public static final int INT_16=72;
    public static final int INT_15=71;
    public static final int INT_18=74;
    public static final int INT_17=73;
    public static final int INT_12=68;
    public static final int INT_11=67;
    public static final int INT_14=70;
    public static final int INT_13=69;
    public static final int DAY_OF_MONTH=230;
    public static final int INT_19=75;
    public static final int FIFTEEN=174;
    public static final int NINE=168;
    public static final int THREE=162;
    public static final int FOURTEEN=173;
    public static final int INT_10=66;
    public static final int YESTERDAY=31;
    public static final int SEVENTEENTH=197;
    public static final int FIRST=181;
    public static final int INT_81=137;
    public static final int INT_80=136;
    public static final int SEPTEMBER=13;
    public static final int WEEK=26;
    public static final int INT_83=139;
    public static final int INT_82=138;
    public static final int INT_85=141;
    public static final int INT_84=140;
    public static final int WEDNESDAY=20;
    public static final int INT_87=143;
    public static final int INT_86=142;
    public static final int JULY=11;
    public static final int NINETEENTH=199;
    public static final int OCTOBER=14;
    public static final int DAY=25;
    public static final int ONE=160;
    public static final int MIDNIGHT=36;
    public static final int INT_88=144;
    public static final int MARCH=7;
    public static final int INT_89=145;
    public static final int PAST=216;
    public static final int SEVENTEEN=176;
    public static final int DATE_TIME=233;
    public static final int INT_72=128;
    public static final int INT_71=127;
    public static final int INT_70=126;
    public static final int INT_76=132;
    public static final int INT_75=131;
    public static final int INT_74=130;
    public static final int INT_73=129;
    public static final int MINUTES_OF_HOUR=243;
    public static final int THIRTIETH=201;
    public static final int LAST=214;
    public static final int INT_79=135;
    public static final int INT_77=133;
    public static final int EIGHTEEN=177;
    public static final int INT_78=134;
    public static final int ND=157;
    public static final int RELATIVE_DATE=235;
    public static final int INT_63=119;
    public static final int INT_62=118;
    public static final int INT_65=121;
    public static final int INT_64=120;
    public static final int FOURTH=184;
    public static final int SECOND=182;
    public static final int INT_61=117;
    public static final int INT_60=116;
    public static final int SATURDAY=23;
    public static final int FOUR=163;
    public static final int TEN=169;
    public static final int ON=211;
    public static final int MONDAY=18;
    public static final int JUNE=10;
    public static final int OF=212;
    public static final int INT_66=122;
    public static final int INT_67=123;
    public static final int INT_68=124;
    public static final int INT_69=125;
    public static final int INT_54=110;
    public static final int INT_53=109;
    public static final int INT_52=108;
    public static final int INT_51=107;
    public static final int INT_50=106;
    public static final int THURSDAY=21;
    public static final int ZONE_OFFSET=247;
    public static final int SEEK_BY=238;
    public static final int PM=33;
    public static final int EXPLICIT_TIME=241;
    public static final int FROM=219;
    public static final int INT_59=115;
    public static final int INT_57=113;
    public static final int INT_58=114;
    public static final int INT_55=111;
    public static final int EIGHTH=188;
    public static final int INT_56=112;
    public static final int HOURS_OF_DAY=242;
    public static final int YEAR=28;
    public static final int MAY=9;
    public static final int TENTH=190;
    public static final int INT_9=65;
    public static final int INT_8=64;
    public static final int INT_7=63;
    public static final int INT_6=62;
    public static final int SPACE=224;
    public static final int INT_5=61;
    public static final int UTC=39;
    public static final int INT_4=60;
    public static final int INT_3=59;
    public static final int AKST=44;
    public static final int INT_2=58;
    public static final int MST=43;
    public static final int INT_1=57;
    public static final int EIGHT=167;
    public static final int INT_0=56;
    public static final int CST=42;
    public static final int IN=208;
    public static final int PST=41;
    public static final int UNKNOWN=226;
    public static final int COMMA=203;
    public static final int FIVE=164;
    public static final int THIRTY=180;
    public static final int NEXT=215;
    public static final int DIGIT=227;
    public static final int DOT=4;
    public static final int MILITARY_HOUR_SUFFIX=35;
    public static final int EST=40;
    public static final int HAST=45;
    public static final int DASH=204;
    public static final int YEAR_OF=232;
    public static final int TWELVE=171;
    public static final int WEEK_INDEX=240;
    public static final int BEFORE=222;
    public static final int AFTER=223;
    public static final int SIXTEENTH=196;
    public static final int SEEK=236;
    public static final int INT_90=146;
    public static final int INT_97=153;
    public static final int INT_98=154;
    public static final int INT_95=151;
    public static final int INT_96=152;
    public static final int INT_93=149;
    public static final int INT_94=150;
    public static final int INT_91=147;
    public static final int INT_92=148;
    public static final int TWELFTH=192;
    public static final int INT_99=155;
    public static final int SIXTH=186;

    // delegates
    // delegators

    public static final String[] ruleNames = new String[] {
        "invalidRule", "seek", "date_time", "date", "search", "explicit_date", 
        "relative_date", "time"
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
    public String getGrammarFileName() { return "/Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateWalker.g"; }


      private com.natty.date.WalkerState _walkerState = new com.natty.date.WalkerState();
      
      public com.natty.date.WalkerState getState() {
        return _walkerState;
      }



    // $ANTLR start "search"
    // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateWalker.g:18:1: search : ( date_time )+ ;
    public final void search() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "search");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(18, 1);

        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateWalker.g:19:3: ( ( date_time )+ )
            dbg.enterAlt(1);

            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateWalker.g:19:5: ( date_time )+
            {
            dbg.location(19,5);
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateWalker.g:19:5: ( date_time )+
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

            	    // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateWalker.g:19:5: date_time
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
    // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateWalker.g:22:1: date_time : ^( DATE_TIME ( date )? ( time )? ) ;
    public final void date_time() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "date_time");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(22, 1);

        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateWalker.g:26:3: ( ^( DATE_TIME ( date )? ( time )? ) )
            dbg.enterAlt(1);

            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateWalker.g:26:5: ^( DATE_TIME ( date )? ( time )? )
            {
            dbg.location(26,5);
            dbg.location(26,7);
            match(input,DATE_TIME,FOLLOW_DATE_TIME_in_date_time67); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                dbg.location(26,17);
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateWalker.g:26:17: ( date )?
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

                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateWalker.g:26:17: date
                        {
                        dbg.location(26,17);
                        pushFollow(FOLLOW_date_in_date_time69);
                        date();

                        state._fsp--;


                        }
                        break;

                }
                } finally {dbg.exitSubRule(2);}

                dbg.location(26,23);
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateWalker.g:26:23: ( time )?
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

                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateWalker.g:26:23: time
                        {
                        dbg.location(26,23);
                        pushFollow(FOLLOW_time_in_date_time72);
                        time();

                        state._fsp--;


                        }
                        break;

                }
                } finally {dbg.exitSubRule(3);}


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
        dbg.location(27, 3);

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
    // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateWalker.g:29:1: date : ( relative_date | explicit_date );
    public final void date() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "date");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(29, 1);

        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateWalker.g:30:3: ( relative_date | explicit_date )
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

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateWalker.g:30:5: relative_date
                    {
                    dbg.location(30,5);
                    pushFollow(FOLLOW_relative_date_in_date91);
                    relative_date();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateWalker.g:31:5: explicit_date
                    {
                    dbg.location(31,5);
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
        dbg.location(32, 3);

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
    // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateWalker.g:34:1: relative_date : ( ^( RELATIVE_DATE seek ) | ^( RELATIVE_DATE ^( WEEK_INDEX index= INT ^( DAY_OF_WEEK day= INT ) ^( MONTH_OF_YEAR month= INT ) ) ) );
    public final void relative_date() throws RecognitionException {
        CommonTree index=null;
        CommonTree day=null;
        CommonTree month=null;

        try { dbg.enterRule(getGrammarFileName(), "relative_date");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(34, 1);

        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateWalker.g:35:3: ( ^( RELATIVE_DATE seek ) | ^( RELATIVE_DATE ^( WEEK_INDEX index= INT ^( DAY_OF_WEEK day= INT ) ^( MONTH_OF_YEAR month= INT ) ) ) )
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

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateWalker.g:35:5: ^( RELATIVE_DATE seek )
                    {
                    dbg.location(35,5);
                    dbg.location(35,7);
                    match(input,RELATIVE_DATE,FOLLOW_RELATIVE_DATE_in_relative_date114); 

                    match(input, Token.DOWN, null); 
                    dbg.location(35,21);
                    pushFollow(FOLLOW_seek_in_relative_date116);
                    seek();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateWalker.g:37:5: ^( RELATIVE_DATE ^( WEEK_INDEX index= INT ^( DAY_OF_WEEK day= INT ) ^( MONTH_OF_YEAR month= INT ) ) )
                    {
                    dbg.location(37,5);
                    dbg.location(37,7);
                    match(input,RELATIVE_DATE,FOLLOW_RELATIVE_DATE_in_relative_date127); 

                    match(input, Token.DOWN, null); 
                    dbg.location(37,21);
                    dbg.location(37,23);
                    match(input,WEEK_INDEX,FOLLOW_WEEK_INDEX_in_relative_date130); 

                    match(input, Token.DOWN, null); 
                    dbg.location(37,39);
                    index=(CommonTree)match(input,INT,FOLLOW_INT_in_relative_date134); 
                    dbg.location(37,44);
                    dbg.location(37,46);
                    match(input,DAY_OF_WEEK,FOLLOW_DAY_OF_WEEK_in_relative_date137); 

                    match(input, Token.DOWN, null); 
                    dbg.location(37,61);
                    day=(CommonTree)match(input,INT,FOLLOW_INT_in_relative_date141); 

                    match(input, Token.UP, null); 
                    dbg.location(37,67);
                    dbg.location(37,69);
                    match(input,MONTH_OF_YEAR,FOLLOW_MONTH_OF_YEAR_in_relative_date145); 

                    match(input, Token.DOWN, null); 
                    dbg.location(37,88);
                    month=(CommonTree)match(input,INT,FOLLOW_INT_in_relative_date149); 

                    match(input, Token.UP, null); 

                    match(input, Token.UP, null); 

                    match(input, Token.UP, null); 
                    dbg.location(38,5);
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
        dbg.location(39, 3);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "relative_date");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
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

        try { dbg.enterRule(getGrammarFileName(), "explicit_date");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(41, 1);

        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateWalker.g:42:3: ( ^( EXPLICIT_DATE ^( MONTH_OF_YEAR month= INT ) ^( DAY_OF_MONTH dom= INT ) ( ^( DAY_OF_WEEK dow= INT ) )? ( ^( YEAR_OF year= INT ) )? ) )
            dbg.enterAlt(1);

            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateWalker.g:42:5: ^( EXPLICIT_DATE ^( MONTH_OF_YEAR month= INT ) ^( DAY_OF_MONTH dom= INT ) ( ^( DAY_OF_WEEK dow= INT ) )? ( ^( YEAR_OF year= INT ) )? )
            {
            dbg.location(42,5);
            dbg.location(42,7);
            match(input,EXPLICIT_DATE,FOLLOW_EXPLICIT_DATE_in_explicit_date174); 

            match(input, Token.DOWN, null); 
            dbg.location(42,21);
            dbg.location(42,23);
            match(input,MONTH_OF_YEAR,FOLLOW_MONTH_OF_YEAR_in_explicit_date177); 

            match(input, Token.DOWN, null); 
            dbg.location(42,42);
            month=(CommonTree)match(input,INT,FOLLOW_INT_in_explicit_date181); 

            match(input, Token.UP, null); 
            dbg.location(42,48);
            dbg.location(42,50);
            match(input,DAY_OF_MONTH,FOLLOW_DAY_OF_MONTH_in_explicit_date185); 

            match(input, Token.DOWN, null); 
            dbg.location(42,66);
            dom=(CommonTree)match(input,INT,FOLLOW_INT_in_explicit_date189); 

            match(input, Token.UP, null); 
            dbg.location(43,9);
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateWalker.g:43:9: ( ^( DAY_OF_WEEK dow= INT ) )?
            int alt6=2;
            try { dbg.enterSubRule(6);
            try { dbg.enterDecision(6);

            int LA6_0 = input.LA(1);

            if ( (LA6_0==DAY_OF_WEEK) ) {
                alt6=1;
            }
            } finally {dbg.exitDecision(6);}

            switch (alt6) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateWalker.g:43:10: ^( DAY_OF_WEEK dow= INT )
                    {
                    dbg.location(43,10);
                    dbg.location(43,12);
                    match(input,DAY_OF_WEEK,FOLLOW_DAY_OF_WEEK_in_explicit_date203); 

                    match(input, Token.DOWN, null); 
                    dbg.location(43,27);
                    dow=(CommonTree)match(input,INT,FOLLOW_INT_in_explicit_date207); 

                    match(input, Token.UP, null); 

                    }
                    break;

            }
            } finally {dbg.exitSubRule(6);}

            dbg.location(43,35);
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateWalker.g:43:35: ( ^( YEAR_OF year= INT ) )?
            int alt7=2;
            try { dbg.enterSubRule(7);
            try { dbg.enterDecision(7);

            int LA7_0 = input.LA(1);

            if ( (LA7_0==YEAR_OF) ) {
                alt7=1;
            }
            } finally {dbg.exitDecision(7);}

            switch (alt7) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateWalker.g:43:36: ^( YEAR_OF year= INT )
                    {
                    dbg.location(43,36);
                    dbg.location(43,38);
                    match(input,YEAR_OF,FOLLOW_YEAR_OF_in_explicit_date214); 

                    match(input, Token.DOWN, null); 
                    dbg.location(43,50);
                    year=(CommonTree)match(input,INT,FOLLOW_INT_in_explicit_date218); 

                    match(input, Token.UP, null); 

                    }
                    break;

            }
            } finally {dbg.exitSubRule(7);}


            match(input, Token.UP, null); 
            dbg.location(44,5);
            _walkerState.setExplicitDate((month!=null?month.getText():null), (dom!=null?dom.getText():null), (dow!=null?dow.getText():null), (year!=null?year.getText():null));

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(45, 3);

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
    // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateWalker.g:47:1: time : ^( EXPLICIT_TIME ^( HOURS_OF_DAY hours= INT ) ^( MINUTES_OF_HOUR minutes= INT ) ( ^( SECONDS_OF_MINUTE seconds= INT ) )? ( AM_PM )? (zone= ZONE | zone= ZONE_OFFSET )? ) ;
    public final void time() throws RecognitionException {
        CommonTree hours=null;
        CommonTree minutes=null;
        CommonTree seconds=null;
        CommonTree zone=null;
        CommonTree AM_PM1=null;

        try { dbg.enterRule(getGrammarFileName(), "time");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(47, 1);

        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateWalker.g:48:3: ( ^( EXPLICIT_TIME ^( HOURS_OF_DAY hours= INT ) ^( MINUTES_OF_HOUR minutes= INT ) ( ^( SECONDS_OF_MINUTE seconds= INT ) )? ( AM_PM )? (zone= ZONE | zone= ZONE_OFFSET )? ) )
            dbg.enterAlt(1);

            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateWalker.g:48:5: ^( EXPLICIT_TIME ^( HOURS_OF_DAY hours= INT ) ^( MINUTES_OF_HOUR minutes= INT ) ( ^( SECONDS_OF_MINUTE seconds= INT ) )? ( AM_PM )? (zone= ZONE | zone= ZONE_OFFSET )? )
            {
            dbg.location(48,5);
            dbg.location(48,7);
            match(input,EXPLICIT_TIME,FOLLOW_EXPLICIT_TIME_in_time244); 

            match(input, Token.DOWN, null); 
            dbg.location(48,21);
            dbg.location(48,23);
            match(input,HOURS_OF_DAY,FOLLOW_HOURS_OF_DAY_in_time247); 

            match(input, Token.DOWN, null); 
            dbg.location(48,41);
            hours=(CommonTree)match(input,INT,FOLLOW_INT_in_time251); 

            match(input, Token.UP, null); 
            dbg.location(48,47);
            dbg.location(48,49);
            match(input,MINUTES_OF_HOUR,FOLLOW_MINUTES_OF_HOUR_in_time255); 

            match(input, Token.DOWN, null); 
            dbg.location(48,72);
            minutes=(CommonTree)match(input,INT,FOLLOW_INT_in_time259); 

            match(input, Token.UP, null); 
            dbg.location(49,9);
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateWalker.g:49:9: ( ^( SECONDS_OF_MINUTE seconds= INT ) )?
            int alt8=2;
            try { dbg.enterSubRule(8);
            try { dbg.enterDecision(8);

            int LA8_0 = input.LA(1);

            if ( (LA8_0==SECONDS_OF_MINUTE) ) {
                alt8=1;
            }
            } finally {dbg.exitDecision(8);}

            switch (alt8) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateWalker.g:49:10: ^( SECONDS_OF_MINUTE seconds= INT )
                    {
                    dbg.location(49,10);
                    dbg.location(49,12);
                    match(input,SECONDS_OF_MINUTE,FOLLOW_SECONDS_OF_MINUTE_in_time273); 

                    match(input, Token.DOWN, null); 
                    dbg.location(49,37);
                    seconds=(CommonTree)match(input,INT,FOLLOW_INT_in_time277); 

                    match(input, Token.UP, null); 

                    }
                    break;

            }
            } finally {dbg.exitSubRule(8);}

            dbg.location(49,45);
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateWalker.g:49:45: ( AM_PM )?
            int alt9=2;
            try { dbg.enterSubRule(9);
            try { dbg.enterDecision(9);

            int LA9_0 = input.LA(1);

            if ( (LA9_0==AM_PM) ) {
                alt9=1;
            }
            } finally {dbg.exitDecision(9);}

            switch (alt9) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateWalker.g:49:45: AM_PM
                    {
                    dbg.location(49,45);
                    AM_PM1=(CommonTree)match(input,AM_PM,FOLLOW_AM_PM_in_time282); 

                    }
                    break;

            }
            } finally {dbg.exitSubRule(9);}

            dbg.location(49,52);
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateWalker.g:49:52: (zone= ZONE | zone= ZONE_OFFSET )?
            int alt10=3;
            try { dbg.enterSubRule(10);
            try { dbg.enterDecision(10);

            int LA10_0 = input.LA(1);

            if ( (LA10_0==ZONE) ) {
                alt10=1;
            }
            else if ( (LA10_0==ZONE_OFFSET) ) {
                alt10=2;
            }
            } finally {dbg.exitDecision(10);}

            switch (alt10) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateWalker.g:49:53: zone= ZONE
                    {
                    dbg.location(49,57);
                    zone=(CommonTree)match(input,ZONE,FOLLOW_ZONE_in_time288); 

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateWalker.g:49:65: zone= ZONE_OFFSET
                    {
                    dbg.location(49,69);
                    zone=(CommonTree)match(input,ZONE_OFFSET,FOLLOW_ZONE_OFFSET_in_time294); 

                    }
                    break;

            }
            } finally {dbg.exitSubRule(10);}


            match(input, Token.UP, null); 
            dbg.location(50,5);
            _walkerState.setExplicitTime((hours!=null?hours.getText():null), (minutes!=null?minutes.getText():null), (seconds!=null?seconds.getText():null), (AM_PM1!=null?AM_PM1.getText():null), (zone!=null?zone.getText():null));

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(51, 3);

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
    // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateWalker.g:53:1: seek : ( ^( SEEK DIRECTION by= SEEK_BY amount= INT ^( DAY_OF_WEEK day= INT ) ) | ^( SEEK DIRECTION SEEK_BY amount= INT ^( MONTH_OF_YEAR month= INT ) ) | ^( SEEK DIRECTION SEEK_BY INT SPAN ) | ^( SEEK DIRECTION SEEK_BY INT date ) );
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
        dbg.location(53, 1);

        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateWalker.g:54:3: ( ^( SEEK DIRECTION by= SEEK_BY amount= INT ^( DAY_OF_WEEK day= INT ) ) | ^( SEEK DIRECTION SEEK_BY amount= INT ^( MONTH_OF_YEAR month= INT ) ) | ^( SEEK DIRECTION SEEK_BY INT SPAN ) | ^( SEEK DIRECTION SEEK_BY INT date ) )
            int alt11=4;
            try { dbg.enterDecision(11);

            try {
                isCyclicDecision = true;
                alt11 = dfa11.predict(input);
            }
            catch (NoViableAltException nvae) {
                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(11);}

            switch (alt11) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateWalker.g:54:5: ^( SEEK DIRECTION by= SEEK_BY amount= INT ^( DAY_OF_WEEK day= INT ) )
                    {
                    dbg.location(54,5);
                    dbg.location(54,7);
                    match(input,SEEK,FOLLOW_SEEK_in_seek319); 

                    match(input, Token.DOWN, null); 
                    dbg.location(54,12);
                    DIRECTION2=(CommonTree)match(input,DIRECTION,FOLLOW_DIRECTION_in_seek321); 
                    dbg.location(54,24);
                    by=(CommonTree)match(input,SEEK_BY,FOLLOW_SEEK_BY_in_seek325); 
                    dbg.location(54,39);
                    amount=(CommonTree)match(input,INT,FOLLOW_INT_in_seek329); 
                    dbg.location(54,44);
                    dbg.location(54,46);
                    match(input,DAY_OF_WEEK,FOLLOW_DAY_OF_WEEK_in_seek332); 

                    match(input, Token.DOWN, null); 
                    dbg.location(54,61);
                    day=(CommonTree)match(input,INT,FOLLOW_INT_in_seek336); 

                    match(input, Token.UP, null); 

                    match(input, Token.UP, null); 
                    dbg.location(55,5);
                    _walkerState.seekToDayOfWeek((DIRECTION2!=null?DIRECTION2.getText():null), (by!=null?by.getText():null), (amount!=null?amount.getText():null), (day!=null?day.getText():null));

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateWalker.g:57:5: ^( SEEK DIRECTION SEEK_BY amount= INT ^( MONTH_OF_YEAR month= INT ) )
                    {
                    dbg.location(57,5);
                    dbg.location(57,7);
                    match(input,SEEK,FOLLOW_SEEK_in_seek356); 

                    match(input, Token.DOWN, null); 
                    dbg.location(57,12);
                    DIRECTION3=(CommonTree)match(input,DIRECTION,FOLLOW_DIRECTION_in_seek358); 
                    dbg.location(57,22);
                    match(input,SEEK_BY,FOLLOW_SEEK_BY_in_seek360); 
                    dbg.location(57,36);
                    amount=(CommonTree)match(input,INT,FOLLOW_INT_in_seek364); 
                    dbg.location(57,41);
                    dbg.location(57,43);
                    match(input,MONTH_OF_YEAR,FOLLOW_MONTH_OF_YEAR_in_seek367); 

                    match(input, Token.DOWN, null); 
                    dbg.location(57,62);
                    month=(CommonTree)match(input,INT,FOLLOW_INT_in_seek371); 

                    match(input, Token.UP, null); 

                    match(input, Token.UP, null); 
                    dbg.location(58,5);
                    _walkerState.seekToMonth((DIRECTION3!=null?DIRECTION3.getText():null), (amount!=null?amount.getText():null), (month!=null?month.getText():null));

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateWalker.g:60:5: ^( SEEK DIRECTION SEEK_BY INT SPAN )
                    {
                    dbg.location(60,5);
                    dbg.location(60,7);
                    match(input,SEEK,FOLLOW_SEEK_in_seek389); 

                    match(input, Token.DOWN, null); 
                    dbg.location(60,12);
                    DIRECTION4=(CommonTree)match(input,DIRECTION,FOLLOW_DIRECTION_in_seek391); 
                    dbg.location(60,22);
                    match(input,SEEK_BY,FOLLOW_SEEK_BY_in_seek393); 
                    dbg.location(60,30);
                    INT5=(CommonTree)match(input,INT,FOLLOW_INT_in_seek395); 
                    dbg.location(60,34);
                    SPAN6=(CommonTree)match(input,SPAN,FOLLOW_SPAN_in_seek397); 

                    match(input, Token.UP, null); 
                    dbg.location(61,5);
                    _walkerState.seekBySpan((DIRECTION4!=null?DIRECTION4.getText():null), (INT5!=null?INT5.getText():null), (SPAN6!=null?SPAN6.getText():null));

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/com/natty/date/generated/DateWalker.g:63:5: ^( SEEK DIRECTION SEEK_BY INT date )
                    {
                    dbg.location(63,5);
                    dbg.location(63,7);
                    match(input,SEEK,FOLLOW_SEEK_in_seek414); 

                    match(input, Token.DOWN, null); 
                    dbg.location(63,12);
                    DIRECTION7=(CommonTree)match(input,DIRECTION,FOLLOW_DIRECTION_in_seek416); 
                    dbg.location(63,22);
                    match(input,SEEK_BY,FOLLOW_SEEK_BY_in_seek418); 
                    dbg.location(63,30);
                    INT8=(CommonTree)match(input,INT,FOLLOW_INT_in_seek420); 
                    dbg.location(63,34);
                    pushFollow(FOLLOW_date_in_seek422);
                    date();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    dbg.location(64,5);
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
        dbg.location(65, 3);

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


    protected DFA11 dfa11 = new DFA11(this);
    static final String DFA11_eotS =
        "\12\uffff";
    static final String DFA11_eofS =
        "\12\uffff";
    static final String DFA11_minS =
        "\1\u00ec\1\2\1\u00ed\1\u00ee\1\u00e4\1\u00e5\4\uffff";
    static final String DFA11_maxS =
        "\1\u00ec\1\2\1\u00ed\1\u00ee\1\u00e4\1\u00ef\4\uffff";
    static final String DFA11_acceptS =
        "\6\uffff\1\1\1\2\1\3\1\4";
    static final String DFA11_specialS =
        "\12\uffff}>";
    static final String[] DFA11_transitionS = {
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

    static final short[] DFA11_eot = DFA.unpackEncodedString(DFA11_eotS);
    static final short[] DFA11_eof = DFA.unpackEncodedString(DFA11_eofS);
    static final char[] DFA11_min = DFA.unpackEncodedStringToUnsignedChars(DFA11_minS);
    static final char[] DFA11_max = DFA.unpackEncodedStringToUnsignedChars(DFA11_maxS);
    static final short[] DFA11_accept = DFA.unpackEncodedString(DFA11_acceptS);
    static final short[] DFA11_special = DFA.unpackEncodedString(DFA11_specialS);
    static final short[][] DFA11_transition;

    static {
        int numStates = DFA11_transitionS.length;
        DFA11_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA11_transition[i] = DFA.unpackEncodedString(DFA11_transitionS[i]);
        }
    }

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = DFA11_eot;
            this.eof = DFA11_eof;
            this.min = DFA11_min;
            this.max = DFA11_max;
            this.accept = DFA11_accept;
            this.special = DFA11_special;
            this.transition = DFA11_transition;
        }
        public String getDescription() {
            return "53:1: seek : ( ^( SEEK DIRECTION by= SEEK_BY amount= INT ^( DAY_OF_WEEK day= INT ) ) | ^( SEEK DIRECTION SEEK_BY amount= INT ^( MONTH_OF_YEAR month= INT ) ) | ^( SEEK DIRECTION SEEK_BY INT SPAN ) | ^( SEEK DIRECTION SEEK_BY INT date ) );";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
    }
 

    public static final BitSet FOLLOW_date_time_in_search45 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_DATE_TIME_in_date_time67 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_date_in_date_time69 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_time_in_date_time72 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_relative_date_in_date91 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_explicit_date_in_date98 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RELATIVE_DATE_in_relative_date114 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_seek_in_relative_date116 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_RELATIVE_DATE_in_relative_date127 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_WEEK_INDEX_in_relative_date130 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INT_in_relative_date134 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000008000000000L});
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
    public static final BitSet FOLLOW_AM_PM_in_time282 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x00C0000000000000L});
    public static final BitSet FOLLOW_ZONE_in_time288 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ZONE_OFFSET_in_time294 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SEEK_in_seek319 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DIRECTION_in_seek321 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_SEEK_BY_in_seek325 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_INT_in_seek329 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_DAY_OF_WEEK_in_seek332 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INT_in_seek336 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SEEK_in_seek356 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DIRECTION_in_seek358 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_SEEK_BY_in_seek360 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_INT_in_seek364 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_MONTH_OF_YEAR_in_seek367 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INT_in_seek371 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SEEK_in_seek389 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DIRECTION_in_seek391 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_SEEK_BY_in_seek393 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_INT_in_seek395 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_SPAN_in_seek397 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SEEK_in_seek414 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DIRECTION_in_seek416 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_SEEK_BY_in_seek418 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_INT_in_seek420 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x00000C0000000000L});
    public static final BitSet FOLLOW_date_in_seek422 = new BitSet(new long[]{0x0000000000000008L});

}