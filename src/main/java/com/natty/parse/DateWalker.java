// $ANTLR 3.2 Sep 23, 2009 12:02:23 /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g 2010-02-10 19:23:43
 package com.natty.parse; 

import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.debug.*;
import java.io.IOException;
public class DateWalker extends DebugTreeParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "INT", "MONTH_OF_YEAR", "DAY_OF_MONTH", "DAY_OF_WEEK", "YEAR_OF", "DATE_TIME", "EXPLICIT_DATE", "RELATIVE_DATE", "SEEK", "DIRECTION", "SEEK_BY", "SPAN", "WEEK_INDEX", "EXPLICIT_TIME", "HOURS_OF_DAY", "MINUTES_OF_HOUR", "AM_PM", "WHITE_SPACE", "AT", "COMMA", "ON", "THE", "DAY", "AFTER", "BEFORE", "OF", "JANUARY", "FEBRUARY", "MARCH", "APRIL", "MAY", "JUNE", "JULY", "AUGUST", "SEPTEMBER", "OCTOBER", "NOVEMBER", "DECEMBER", "SINGLE_QUOTE", "IN", "YEAR", "DASH", "SLASH", "INT_1_TO_5", "FIRST", "SECOND", "THIRD", "FOURTH", "FIFTH", "LAST", "THIS", "NEXT", "PAST", "COMING", "UPCOMING", "FROM", "NOW", "AGO", "WEEK", "MONTH", "SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY", "TODAY", "TOMORROW", "YESTERDAY", "COLON", "MILITARY_HOUR_SUFFIX", "HOUR", "AM", "PM", "NOON", "MIDNIGHT", "INT_0", "INT_00", "INT_6_TO_9", "INT_01_TO_12", "INT_13_TO_23", "INT_24_TO_31", "INT_32_TO_59", "INT_60_TO_99", "ONE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", "NINE", "TEN", "ELEVEN", "TWELVE", "THIRTEEN", "FOURTEEN", "FIFTEEN", "SIXTEEN", "SEVENTEEN", "EIGHTEEN", "NINETEEN", "TWENTY", "THIRTY", "SIXTH", "SEVENTH", "EIGHTH", "NINTH", "TENTH", "ELEVENTH", "TWELFTH", "THIRTEENTH", "FOURTEENTH", "FIFTEENTH", "SIXTEENTH", "SEVENTEENTH", "EIGHTEENTH", "NINETEENTH", "TWENTIETH", "TWENTY_FIRST", "TWENTY_SECOND", "TWENTY_THIRD", "TWENTY_FOURTH", "TWENTY_FIFTH", "TWENTY_SIXTH", "TWENTY_SEVENTH", "TWENTY_EIGHTH", "TWENTY_NINTH", "THIRTIETH", "THIRTY_FIRST", "DOT", "UNKNOWN", "EXPLICIT"
    };
    public static final int DIRECTION=13;
    public static final int NINETEEN=107;
    public static final int WEEK=62;
    public static final int SEPTEMBER=38;
    public static final int WEDNESDAY=67;
    public static final int INT_24_TO_31=86;
    public static final int TWENTY_EIGHTH=132;
    public static final int TWENTY=108;
    public static final int INT_00=82;
    public static final int JULY=36;
    public static final int APRIL=33;
    public static final int COMING=57;
    public static final int NINETEENTH=123;
    public static final int OCTOBER=39;
    public static final int NOW=60;
    public static final int ONE=89;
    public static final int DAY=26;
    public static final int MIDNIGHT=80;
    public static final int MARCH=32;
    public static final int EOF=-1;
    public static final int MONTH=63;
    public static final int PAST=56;
    public static final int SEVENTEEN=105;
    public static final int DATE_TIME=9;
    public static final int AM_PM=20;
    public static final int TWENTY_SEVENTH=131;
    public static final int TWENTY_FIFTH=129;
    public static final int EIGHTEENTH=122;
    public static final int MINUTES_OF_HOUR=19;
    public static final int SPAN=15;
    public static final int THIS=54;
    public static final int NOON=79;
    public static final int THIRTIETH=134;
    public static final int INT_60_TO_99=88;
    public static final int LAST=53;
    public static final int EIGHTEEN=106;
    public static final int INT_01_TO_12=84;
    public static final int TOMORROW=72;
    public static final int RELATIVE_DATE=11;
    public static final int FOURTH=51;
    public static final int FIFTEENTH=119;
    public static final int TODAY=71;
    public static final int SECOND=49;
    public static final int NOVEMBER=40;
    public static final int SATURDAY=70;
    public static final int FOUR=92;
    public static final int MONTH_OF_YEAR=5;
    public static final int SEVENTH=111;
    public static final int TEN=98;
    public static final int FEBRUARY=31;
    public static final int ON=24;
    public static final int MONDAY=65;
    public static final int THIRTEEN=101;
    public static final int ELEVEN=99;
    public static final int SEVEN=95;
    public static final int DAY_OF_WEEK=7;
    public static final int SUNDAY=64;
    public static final int JUNE=35;
    public static final int INT=4;
    public static final int EXPLICIT_DATE=10;
    public static final int OF=29;
    public static final int SIX=94;
    public static final int UPCOMING=58;
    public static final int FIFTH=52;
    public static final int TWENTY_NINTH=133;
    public static final int THURSDAY=68;
    public static final int DECEMBER=41;
    public static final int SEEK_BY=14;
    public static final int AUGUST=37;
    public static final int PM=78;
    public static final int EXPLICIT_TIME=17;
    public static final int FROM=59;
    public static final int TUESDAY=66;
    public static final int EIGHTH=112;
    public static final int HOURS_OF_DAY=18;
    public static final int THIRD=50;
    public static final int YEAR=44;
    public static final int THE=25;
    public static final int TENTH=114;
    public static final int MAY=34;
    public static final int EXPLICIT=138;
    public static final int TWENTY_FOURTH=128;
    public static final int WHITE_SPACE=21;
    public static final int EIGHT=96;
    public static final int FRIDAY=69;
    public static final int INT_0=81;
    public static final int TWENTY_SIXTH=130;
    public static final int AT=22;
    public static final int SINGLE_QUOTE=42;
    public static final int SLASH=46;
    public static final int IN=43;
    public static final int UNKNOWN=137;
    public static final int NINTH=113;
    public static final int COMMA=23;
    public static final int FIVE=93;
    public static final int THIRTY=109;
    public static final int TWENTIETH=124;
    public static final int TWENTY_SECOND=126;
    public static final int NEXT=55;
    public static final int INT_13_TO_23=85;
    public static final int DOT=136;
    public static final int MILITARY_HOUR_SUFFIX=75;
    public static final int INT_32_TO_59=87;
    public static final int AM=77;
    public static final int DASH=45;
    public static final int FOURTEENTH=118;
    public static final int SIXTEEN=104;
    public static final int INT_6_TO_9=83;
    public static final int YEAR_OF=8;
    public static final int TWELVE=100;
    public static final int WEEK_INDEX=16;
    public static final int AGO=61;
    public static final int ELEVENTH=115;
    public static final int BEFORE=28;
    public static final int TWO=90;
    public static final int INT_1_TO_5=47;
    public static final int AFTER=27;
    public static final int HOUR=76;
    public static final int SIXTEENTH=120;
    public static final int JANUARY=30;
    public static final int THIRTEENTH=117;
    public static final int SEEK=12;
    public static final int COLON=74;
    public static final int DAY_OF_MONTH=6;
    public static final int FIFTEEN=103;
    public static final int TWELFTH=116;
    public static final int NINE=97;
    public static final int SIXTH=110;
    public static final int THREE=91;
    public static final int TWENTY_FIRST=125;
    public static final int FOURTEEN=102;
    public static final int TWENTY_THIRD=127;
    public static final int YESTERDAY=73;
    public static final int SEVENTEENTH=121;
    public static final int FIRST=48;
    public static final int THIRTY_FIRST=135;

    // delegates
    // delegators

    public static final String[] ruleNames = new String[] {
        "invalidRule", "relaxed_date", "relative_date", "date", "seek", 
        "time", "explicit_date", "date_time"
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
    public String getGrammarFileName() { return "/Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g"; }


      private WalkerState _walkerState = new WalkerState();
      
      public WalkerState getState() {
        return _walkerState;
      }



    // $ANTLR start "date_time"
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:18:1: date_time : ^( DATE_TIME ( date )? ( time )? ) ;
    public final void date_time() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "date_time");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(18, 1);

        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:19:3: ( ^( DATE_TIME ( date )? ( time )? ) )
            dbg.enterAlt(1);

            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:19:5: ^( DATE_TIME ( date )? ( time )? )
            {
            dbg.location(19,5);
            dbg.location(19,7);
            match(input,DATE_TIME,FOLLOW_DATE_TIME_in_date_time46); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                dbg.location(19,17);
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:19:17: ( date )?
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

                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:19:17: date
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
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:19:23: ( time )?
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

                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:19:23: time
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
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:22:1: date : ( relative_date | explicit_date );
    public final void date() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "date");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(22, 1);

        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:23:3: ( relative_date | explicit_date )
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

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:23:5: relative_date
                    {
                    dbg.location(23,5);
                    pushFollow(FOLLOW_relative_date_in_date70);
                    relative_date();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:24:5: explicit_date
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
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:27:1: relative_date : ( ^( RELATIVE_DATE seek ) | ^( RELATIVE_DATE ^( WEEK_INDEX index= INT ^( DAY_OF_WEEK day= INT ) ^( MONTH_OF_YEAR month= INT ) ) ) );
    public final void relative_date() throws RecognitionException {
        CommonTree index=null;
        CommonTree day=null;
        CommonTree month=null;

        try { dbg.enterRule(getGrammarFileName(), "relative_date");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(27, 1);

        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:28:3: ( ^( RELATIVE_DATE seek ) | ^( RELATIVE_DATE ^( WEEK_INDEX index= INT ^( DAY_OF_WEEK day= INT ) ^( MONTH_OF_YEAR month= INT ) ) ) )
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

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:28:5: ^( RELATIVE_DATE seek )
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

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:30:5: ^( RELATIVE_DATE ^( WEEK_INDEX index= INT ^( DAY_OF_WEEK day= INT ) ^( MONTH_OF_YEAR month= INT ) ) )
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
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:34:1: relaxed_date : ^( EXPLICIT seek ) ;
    public final void relaxed_date() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "relaxed_date");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(34, 1);

        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:35:3: ( ^( EXPLICIT seek ) )
            dbg.enterAlt(1);

            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:35:5: ^( EXPLICIT seek )
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
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:38:1: explicit_date : ( ^( EXPLICIT_DATE ^( MONTH_OF_YEAR month= INT ) ^( DAY_OF_MONTH day= INT ) ) | ^( EXPLICIT_DATE ^( MONTH_OF_YEAR month= INT ) ^( DAY_OF_MONTH day= INT ) ^( YEAR_OF year= INT ) ) );
    public final void explicit_date() throws RecognitionException {
        CommonTree month=null;
        CommonTree day=null;
        CommonTree year=null;

        try { dbg.enterRule(getGrammarFileName(), "explicit_date");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(38, 1);

        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:39:3: ( ^( EXPLICIT_DATE ^( MONTH_OF_YEAR month= INT ) ^( DAY_OF_MONTH day= INT ) ) | ^( EXPLICIT_DATE ^( MONTH_OF_YEAR month= INT ) ^( DAY_OF_MONTH day= INT ) ^( YEAR_OF year= INT ) ) )
            int alt5=2;
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

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:39:5: ^( EXPLICIT_DATE ^( MONTH_OF_YEAR month= INT ) ^( DAY_OF_MONTH day= INT ) )
                    {
                    dbg.location(39,5);
                    dbg.location(39,7);
                    match(input,EXPLICIT_DATE,FOLLOW_EXPLICIT_DATE_in_explicit_date172); 

                    match(input, Token.DOWN, null); 
                    dbg.location(39,21);
                    dbg.location(39,23);
                    match(input,MONTH_OF_YEAR,FOLLOW_MONTH_OF_YEAR_in_explicit_date175); 

                    match(input, Token.DOWN, null); 
                    dbg.location(39,42);
                    month=(CommonTree)match(input,INT,FOLLOW_INT_in_explicit_date179); 

                    match(input, Token.UP, null); 
                    dbg.location(39,48);
                    dbg.location(39,50);
                    match(input,DAY_OF_MONTH,FOLLOW_DAY_OF_MONTH_in_explicit_date183); 

                    match(input, Token.DOWN, null); 
                    dbg.location(39,66);
                    day=(CommonTree)match(input,INT,FOLLOW_INT_in_explicit_date187); 

                    match(input, Token.UP, null); 

                    match(input, Token.UP, null); 
                    dbg.location(40,5);
                    _walkerState.setExplicitDate((month!=null?month.getText():null), (day!=null?day.getText():null), null);

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:42:5: ^( EXPLICIT_DATE ^( MONTH_OF_YEAR month= INT ) ^( DAY_OF_MONTH day= INT ) ^( YEAR_OF year= INT ) )
                    {
                    dbg.location(42,5);
                    dbg.location(42,7);
                    match(input,EXPLICIT_DATE,FOLLOW_EXPLICIT_DATE_in_explicit_date207); 

                    match(input, Token.DOWN, null); 
                    dbg.location(42,21);
                    dbg.location(42,23);
                    match(input,MONTH_OF_YEAR,FOLLOW_MONTH_OF_YEAR_in_explicit_date210); 

                    match(input, Token.DOWN, null); 
                    dbg.location(42,42);
                    month=(CommonTree)match(input,INT,FOLLOW_INT_in_explicit_date214); 

                    match(input, Token.UP, null); 
                    dbg.location(42,48);
                    dbg.location(42,50);
                    match(input,DAY_OF_MONTH,FOLLOW_DAY_OF_MONTH_in_explicit_date218); 

                    match(input, Token.DOWN, null); 
                    dbg.location(42,66);
                    day=(CommonTree)match(input,INT,FOLLOW_INT_in_explicit_date222); 

                    match(input, Token.UP, null); 
                    dbg.location(42,72);
                    dbg.location(42,74);
                    match(input,YEAR_OF,FOLLOW_YEAR_OF_in_explicit_date226); 

                    match(input, Token.DOWN, null); 
                    dbg.location(42,86);
                    year=(CommonTree)match(input,INT,FOLLOW_INT_in_explicit_date230); 

                    match(input, Token.UP, null); 

                    match(input, Token.UP, null); 
                    dbg.location(43,5);
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
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:46:1: time : ^( EXPLICIT_TIME ^( HOURS_OF_DAY hours= INT ) ^( MINUTES_OF_HOUR minutes= INT ) ( AM_PM )? ) ;
    public final void time() throws RecognitionException {
        CommonTree hours=null;
        CommonTree minutes=null;
        CommonTree AM_PM1=null;

        try { dbg.enterRule(getGrammarFileName(), "time");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(46, 1);

        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:47:3: ( ^( EXPLICIT_TIME ^( HOURS_OF_DAY hours= INT ) ^( MINUTES_OF_HOUR minutes= INT ) ( AM_PM )? ) )
            dbg.enterAlt(1);

            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:47:5: ^( EXPLICIT_TIME ^( HOURS_OF_DAY hours= INT ) ^( MINUTES_OF_HOUR minutes= INT ) ( AM_PM )? )
            {
            dbg.location(47,5);
            dbg.location(47,7);
            match(input,EXPLICIT_TIME,FOLLOW_EXPLICIT_TIME_in_time254); 

            match(input, Token.DOWN, null); 
            dbg.location(47,21);
            dbg.location(47,23);
            match(input,HOURS_OF_DAY,FOLLOW_HOURS_OF_DAY_in_time257); 

            match(input, Token.DOWN, null); 
            dbg.location(47,41);
            hours=(CommonTree)match(input,INT,FOLLOW_INT_in_time261); 

            match(input, Token.UP, null); 
            dbg.location(47,47);
            dbg.location(47,49);
            match(input,MINUTES_OF_HOUR,FOLLOW_MINUTES_OF_HOUR_in_time265); 

            match(input, Token.DOWN, null); 
            dbg.location(47,72);
            minutes=(CommonTree)match(input,INT,FOLLOW_INT_in_time269); 

            match(input, Token.UP, null); 
            dbg.location(47,78);
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:47:78: ( AM_PM )?
            int alt6=2;
            try { dbg.enterSubRule(6);
            try { dbg.enterDecision(6);

            int LA6_0 = input.LA(1);

            if ( (LA6_0==AM_PM) ) {
                alt6=1;
            }
            } finally {dbg.exitDecision(6);}

            switch (alt6) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:47:78: AM_PM
                    {
                    dbg.location(47,78);
                    AM_PM1=(CommonTree)match(input,AM_PM,FOLLOW_AM_PM_in_time272); 

                    }
                    break;

            }
            } finally {dbg.exitSubRule(6);}


            match(input, Token.UP, null); 
            dbg.location(48,5);
            _walkerState.setExplicitTime((hours!=null?hours.getText():null), (minutes!=null?minutes.getText():null), (AM_PM1!=null?AM_PM1.getText():null));

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(49, 3);

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
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:51:1: seek : ( ^( SEEK DIRECTION by= SEEK_BY amount= INT ^( DAY_OF_WEEK day= INT ) ) | ^( SEEK DIRECTION SEEK_BY amount= INT ^( MONTH_OF_YEAR month= INT ) ) | ^( SEEK DIRECTION SEEK_BY INT SPAN ) | ^( SEEK DIRECTION SEEK_BY INT date ) );
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
        dbg.location(51, 1);

        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:52:3: ( ^( SEEK DIRECTION by= SEEK_BY amount= INT ^( DAY_OF_WEEK day= INT ) ) | ^( SEEK DIRECTION SEEK_BY amount= INT ^( MONTH_OF_YEAR month= INT ) ) | ^( SEEK DIRECTION SEEK_BY INT SPAN ) | ^( SEEK DIRECTION SEEK_BY INT date ) )
            int alt7=4;
            try { dbg.enterDecision(7);

            try {
                isCyclicDecision = true;
                alt7 = dfa7.predict(input);
            }
            catch (NoViableAltException nvae) {
                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(7);}

            switch (alt7) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:52:5: ^( SEEK DIRECTION by= SEEK_BY amount= INT ^( DAY_OF_WEEK day= INT ) )
                    {
                    dbg.location(52,5);
                    dbg.location(52,7);
                    match(input,SEEK,FOLLOW_SEEK_in_seek296); 

                    match(input, Token.DOWN, null); 
                    dbg.location(52,12);
                    DIRECTION2=(CommonTree)match(input,DIRECTION,FOLLOW_DIRECTION_in_seek298); 
                    dbg.location(52,24);
                    by=(CommonTree)match(input,SEEK_BY,FOLLOW_SEEK_BY_in_seek302); 
                    dbg.location(52,39);
                    amount=(CommonTree)match(input,INT,FOLLOW_INT_in_seek306); 
                    dbg.location(52,44);
                    dbg.location(52,46);
                    match(input,DAY_OF_WEEK,FOLLOW_DAY_OF_WEEK_in_seek309); 

                    match(input, Token.DOWN, null); 
                    dbg.location(52,61);
                    day=(CommonTree)match(input,INT,FOLLOW_INT_in_seek313); 

                    match(input, Token.UP, null); 

                    match(input, Token.UP, null); 
                    dbg.location(53,5);
                    _walkerState.seekToDayOfWeek((DIRECTION2!=null?DIRECTION2.getText():null), (by!=null?by.getText():null), (amount!=null?amount.getText():null), (day!=null?day.getText():null));

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:55:5: ^( SEEK DIRECTION SEEK_BY amount= INT ^( MONTH_OF_YEAR month= INT ) )
                    {
                    dbg.location(55,5);
                    dbg.location(55,7);
                    match(input,SEEK,FOLLOW_SEEK_in_seek333); 

                    match(input, Token.DOWN, null); 
                    dbg.location(55,12);
                    DIRECTION3=(CommonTree)match(input,DIRECTION,FOLLOW_DIRECTION_in_seek335); 
                    dbg.location(55,22);
                    match(input,SEEK_BY,FOLLOW_SEEK_BY_in_seek337); 
                    dbg.location(55,36);
                    amount=(CommonTree)match(input,INT,FOLLOW_INT_in_seek341); 
                    dbg.location(55,41);
                    dbg.location(55,43);
                    match(input,MONTH_OF_YEAR,FOLLOW_MONTH_OF_YEAR_in_seek344); 

                    match(input, Token.DOWN, null); 
                    dbg.location(55,62);
                    month=(CommonTree)match(input,INT,FOLLOW_INT_in_seek348); 

                    match(input, Token.UP, null); 

                    match(input, Token.UP, null); 
                    dbg.location(56,5);
                    _walkerState.seekToMonth((DIRECTION3!=null?DIRECTION3.getText():null), (amount!=null?amount.getText():null), (month!=null?month.getText():null));

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:58:5: ^( SEEK DIRECTION SEEK_BY INT SPAN )
                    {
                    dbg.location(58,5);
                    dbg.location(58,7);
                    match(input,SEEK,FOLLOW_SEEK_in_seek366); 

                    match(input, Token.DOWN, null); 
                    dbg.location(58,12);
                    DIRECTION4=(CommonTree)match(input,DIRECTION,FOLLOW_DIRECTION_in_seek368); 
                    dbg.location(58,22);
                    match(input,SEEK_BY,FOLLOW_SEEK_BY_in_seek370); 
                    dbg.location(58,30);
                    INT5=(CommonTree)match(input,INT,FOLLOW_INT_in_seek372); 
                    dbg.location(58,34);
                    SPAN6=(CommonTree)match(input,SPAN,FOLLOW_SPAN_in_seek374); 

                    match(input, Token.UP, null); 
                    dbg.location(59,5);
                    _walkerState.seekBySpan((DIRECTION4!=null?DIRECTION4.getText():null), (INT5!=null?INT5.getText():null), (SPAN6!=null?SPAN6.getText():null));

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:61:5: ^( SEEK DIRECTION SEEK_BY INT date )
                    {
                    dbg.location(61,5);
                    dbg.location(61,7);
                    match(input,SEEK,FOLLOW_SEEK_in_seek391); 

                    match(input, Token.DOWN, null); 
                    dbg.location(61,12);
                    DIRECTION7=(CommonTree)match(input,DIRECTION,FOLLOW_DIRECTION_in_seek393); 
                    dbg.location(61,22);
                    match(input,SEEK_BY,FOLLOW_SEEK_BY_in_seek395); 
                    dbg.location(61,30);
                    INT8=(CommonTree)match(input,INT,FOLLOW_INT_in_seek397); 
                    dbg.location(61,34);
                    pushFollow(FOLLOW_date_in_seek399);
                    date();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    dbg.location(62,5);
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
        dbg.location(63, 3);

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
    protected DFA7 dfa7 = new DFA7(this);
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
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
    }
    static final String DFA7_eotS =
        "\12\uffff";
    static final String DFA7_eofS =
        "\12\uffff";
    static final String DFA7_minS =
        "\1\14\1\2\1\15\1\16\1\4\1\5\4\uffff";
    static final String DFA7_maxS =
        "\1\14\1\2\1\15\1\16\1\4\1\17\4\uffff";
    static final String DFA7_acceptS =
        "\6\uffff\1\1\1\2\1\3\1\4";
    static final String DFA7_specialS =
        "\12\uffff}>";
    static final String[] DFA7_transitionS = {
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

    static final short[] DFA7_eot = DFA.unpackEncodedString(DFA7_eotS);
    static final short[] DFA7_eof = DFA.unpackEncodedString(DFA7_eofS);
    static final char[] DFA7_min = DFA.unpackEncodedStringToUnsignedChars(DFA7_minS);
    static final char[] DFA7_max = DFA.unpackEncodedStringToUnsignedChars(DFA7_maxS);
    static final short[] DFA7_accept = DFA.unpackEncodedString(DFA7_acceptS);
    static final short[] DFA7_special = DFA.unpackEncodedString(DFA7_specialS);
    static final short[][] DFA7_transition;

    static {
        int numStates = DFA7_transitionS.length;
        DFA7_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA7_transition[i] = DFA.unpackEncodedString(DFA7_transitionS[i]);
        }
    }

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = DFA7_eot;
            this.eof = DFA7_eof;
            this.min = DFA7_min;
            this.max = DFA7_max;
            this.accept = DFA7_accept;
            this.special = DFA7_special;
            this.transition = DFA7_transition;
        }
        public String getDescription() {
            return "51:1: seek : ( ^( SEEK DIRECTION by= SEEK_BY amount= INT ^( DAY_OF_WEEK day= INT ) ) | ^( SEEK DIRECTION SEEK_BY amount= INT ^( MONTH_OF_YEAR month= INT ) ) | ^( SEEK DIRECTION SEEK_BY INT SPAN ) | ^( SEEK DIRECTION SEEK_BY INT date ) );";
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
    public static final BitSet FOLLOW_AM_PM_in_time272 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SEEK_in_seek296 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DIRECTION_in_seek298 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_SEEK_BY_in_seek302 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_INT_in_seek306 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_DAY_OF_WEEK_in_seek309 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INT_in_seek313 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SEEK_in_seek333 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DIRECTION_in_seek335 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_SEEK_BY_in_seek337 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_INT_in_seek341 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_MONTH_OF_YEAR_in_seek344 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INT_in_seek348 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SEEK_in_seek366 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DIRECTION_in_seek368 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_SEEK_BY_in_seek370 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_INT_in_seek372 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_SPAN_in_seek374 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SEEK_in_seek391 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DIRECTION_in_seek393 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_SEEK_BY_in_seek395 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_INT_in_seek397 = new BitSet(new long[]{0x0000000000000C00L});
    public static final BitSet FOLLOW_date_in_seek399 = new BitSet(new long[]{0x0000000000000008L});

}