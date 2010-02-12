// $ANTLR 3.2 Sep 23, 2009 12:02:23 /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g 2010-02-12 10:43:21
 package com.natty.parse; 

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import org.antlr.runtime.debug.*;
import java.io.IOException;

import org.antlr.runtime.tree.*;

public class DateParser extends DebugParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "INT", "MONTH_OF_YEAR", "DAY_OF_MONTH", "DAY_OF_WEEK", "YEAR_OF", "DATE_TIME", "EXPLICIT_DATE", "RELATIVE_DATE", "SEEK", "DIRECTION", "SEEK_BY", "SPAN", "WEEK_INDEX", "EXPLICIT_TIME", "HOURS_OF_DAY", "MINUTES_OF_HOUR", "AM_PM", "WHITE_SPACE", "AT", "COMMA", "ON", "THE", "DAY", "AFTER", "BEFORE", "OF", "JANUARY", "FEBRUARY", "MARCH", "APRIL", "MAY", "JUNE", "JULY", "AUGUST", "SEPTEMBER", "OCTOBER", "NOVEMBER", "DECEMBER", "SINGLE_QUOTE", "IN", "YEAR", "DASH", "SLASH", "INT_1_TO_5", "FIRST", "SECOND", "THIRD", "FOURTH", "FIFTH", "LAST", "THIS", "NEXT", "PAST", "COMING", "UPCOMING", "FROM", "NOW", "AGO", "WEEK", "MONTH", "SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY", "TODAY", "TOMORROW", "YESTERDAY", "COLON", "MILITARY_HOUR_SUFFIX", "HOUR", "AM", "PM", "NOON", "MIDNIGHT", "INT_0", "INT_00", "INT_6_TO_9", "INT_01_TO_12", "INT_13_TO_23", "INT_24_TO_31", "INT_32_TO_59", "INT_60_TO_99", "ONE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", "NINE", "TEN", "ELEVEN", "TWELVE", "THIRTEEN", "FOURTEEN", "FIFTEEN", "SIXTEEN", "SEVENTEEN", "EIGHTEEN", "NINETEEN", "TWENTY", "THIRTY", "SIXTH", "SEVENTH", "EIGHTH", "NINTH", "TENTH", "ELEVENTH", "TWELFTH", "THIRTEENTH", "FOURTEENTH", "FIFTEENTH", "SIXTEENTH", "SEVENTEENTH", "EIGHTEENTH", "NINETEENTH", "TWENTIETH", "TWENTY_FIRST", "TWENTY_SECOND", "TWENTY_THIRD", "TWENTY_FOURTH", "TWENTY_FIFTH", "TWENTY_SIXTH", "TWENTY_SEVENTH", "TWENTY_EIGHTH", "TWENTY_NINTH", "THIRTIETH", "THIRTY_FIRST", "DOT", "UNKNOWN"
    };
    public static final int DIRECTION=13;
    public static final int NINETEEN=107;
    public static final int SEPTEMBER=38;
    public static final int WEEK=62;
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
    public static final int DAY=26;
    public static final int ONE=89;
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
    public static final int THIRTIETH=134;
    public static final int NOON=79;
    public static final int INT_60_TO_99=88;
    public static final int LAST=53;
    public static final int EIGHTEEN=106;
    public static final int INT_01_TO_12=84;
    public static final int RELATIVE_DATE=11;
    public static final int TOMORROW=72;
    public static final int FIFTEENTH=119;
    public static final int FOURTH=51;
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
    public static final int DOT=136;
    public static final int INT_13_TO_23=85;
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
    public static final int AFTER=27;
    public static final int INT_1_TO_5=47;
    public static final int TWO=90;
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
    public static final int TWENTY_FIRST=125;
    public static final int THREE=91;
    public static final int FOURTEEN=102;
    public static final int TWENTY_THIRD=127;
    public static final int YESTERDAY=73;
    public static final int SEVENTEENTH=121;
    public static final int THIRTY_FIRST=135;
    public static final int FIRST=48;

    // delegates
    // delegators

    public static final String[] ruleNames = new String[] {
        "invalidRule", "minutes", "relaxed_year_prefix", "int_00_to_99_mandatory_prefix", 
        "relaxed_year", "synpred1_Date", "day_of_week", "formal_month_of_year", 
        "search", "relaxed_day_of_month", "global_date_prefix", "formal_day_of_month", 
        "relative_occurrence_index", "implicit_prefix", "hours", "prefix_direction", 
        "spelled_first_to_thirty_first", "date", "int_four_digits", "synpred4_Date", 
        "named_time", "int_00_to_59_mandatory_prefix", "time_date_separator", 
        "relative_suffix", "relative_target", "date_time_separator", "spelled_or_int_01_to_31_optional_prefix", 
        "int_01_to_31_optional_prefix", "formal_date", "synpred3_Date", 
        "formal_date_separator", "int_00_to_23_optional_prefix", "relaxed_date", 
        "meridian_indicator", "relative_prefix", "spelled_one_to_thirty_one", 
        "relative_date", "date_time", "formal_year", "time", "int_01_to_12_optional_prefix", 
        "relaxed_month", "formal_year_four_digits", "named_relative_date", 
        "synpred2_Date", "relative_date_span"
    };
     
        public int ruleLevel = 0;
        public int getRuleLevel() { return ruleLevel; }
        public void incRuleLevel() { ruleLevel++; }
        public void decRuleLevel() { ruleLevel--; }
        public DateParser(TokenStream input) {
            this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
        }
        public DateParser(TokenStream input, int port, RecognizerSharedState state) {
            super(input, state);
            DebugEventSocketProxy proxy =
                new DebugEventSocketProxy(this,port,adaptor);
            setDebugListener(proxy);
            setTokenStream(new DebugTokenStream(input,proxy));
            try {
                proxy.handshake();
            }
            catch (IOException ioe) {
                reportError(ioe);
            }
            TreeAdaptor adap = new CommonTreeAdaptor();
            setTreeAdaptor(adap);
            proxy.setTreeAdaptor(adap);
        }
    public DateParser(TokenStream input, DebugEventListener dbg) {
        super(input, dbg);

         
        TreeAdaptor adap = new CommonTreeAdaptor();
        setTreeAdaptor(adap);

    }
    protected boolean evalPredicate(boolean result, String predicate) {
        dbg.semanticPredicate(result, predicate);
        return result;
    }

    protected DebugTreeAdaptor adaptor;
    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = new DebugTreeAdaptor(dbg,adaptor);

    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }


    public String[] getTokenNames() { return DateParser.tokenNames; }
    public String getGrammarFileName() { return "/Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g"; }




    public static class search_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "search"
    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:33:1: search : date_time ;
    public final DateParser.search_return search() throws RecognitionException {
        DateParser.search_return retval = new DateParser.search_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        DateParser.date_time_return date_time1 = null;



        try { dbg.enterRule(getGrammarFileName(), "search");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(33, 1);

        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:34:3: ( date_time )
            dbg.enterAlt(1);

            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:34:5: date_time
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(34,5);
            pushFollow(FOLLOW_date_time_in_search142);
            date_time1=date_time();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, date_time1.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {

                reportError(re);
                input.consume(); // eat the ';'
              
        }
        finally {
        }
        dbg.location(35, 3);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "search");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "search"

    public static class date_time_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "date_time"
    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:41:1: date_time : ( ( date ( date_time_separator time )? )=> date ( date_time_separator time )? | time ( time_date_separator date )? ) -> ^( DATE_TIME ( date )? ( time )? ) ;
    public final DateParser.date_time_return date_time() throws RecognitionException {
        DateParser.date_time_return retval = new DateParser.date_time_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        DateParser.date_return date2 = null;

        DateParser.date_time_separator_return date_time_separator3 = null;

        DateParser.time_return time4 = null;

        DateParser.time_return time5 = null;

        DateParser.time_date_separator_return time_date_separator6 = null;

        DateParser.date_return date7 = null;


        RewriteRuleSubtreeStream stream_date_time_separator=new RewriteRuleSubtreeStream(adaptor,"rule date_time_separator");
        RewriteRuleSubtreeStream stream_time=new RewriteRuleSubtreeStream(adaptor,"rule time");
        RewriteRuleSubtreeStream stream_time_date_separator=new RewriteRuleSubtreeStream(adaptor,"rule time_date_separator");
        RewriteRuleSubtreeStream stream_date=new RewriteRuleSubtreeStream(adaptor,"rule date");
        try { dbg.enterRule(getGrammarFileName(), "date_time");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(41, 1);

        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:42:3: ( ( ( date ( date_time_separator time )? )=> date ( date_time_separator time )? | time ( time_date_separator date )? ) -> ^( DATE_TIME ( date )? ( time )? ) )
            dbg.enterAlt(1);

            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:42:5: ( ( date ( date_time_separator time )? )=> date ( date_time_separator time )? | time ( time_date_separator date )? )
            {
            dbg.location(42,5);
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:42:5: ( ( date ( date_time_separator time )? )=> date ( date_time_separator time )? | time ( time_date_separator date )? )
            int alt3=2;
            try { dbg.enterSubRule(3);
            try { dbg.enterDecision(3);

            try {
                isCyclicDecision = true;
                alt3 = dfa3.predict(input);
            }
            catch (NoViableAltException nvae) {
                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(3);}

            switch (alt3) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:43:7: ( date ( date_time_separator time )? )=> date ( date_time_separator time )?
                    {
                    dbg.location(44,9);
                    pushFollow(FOLLOW_date_in_date_time191);
                    date2=date();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_date.add(date2.getTree());
                    dbg.location(44,14);
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:44:14: ( date_time_separator time )?
                    int alt1=2;
                    try { dbg.enterSubRule(1);
                    try { dbg.enterDecision(1);

                    int LA1_0 = input.LA(1);

                    if ( (LA1_0==WHITE_SPACE||LA1_0==COMMA) ) {
                        alt1=1;
                    }
                    } finally {dbg.exitDecision(1);}

                    switch (alt1) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:44:15: date_time_separator time
                            {
                            dbg.location(44,15);
                            pushFollow(FOLLOW_date_time_separator_in_date_time194);
                            date_time_separator3=date_time_separator();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_date_time_separator.add(date_time_separator3.getTree());
                            dbg.location(44,35);
                            pushFollow(FOLLOW_time_in_date_time196);
                            time4=time();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_time.add(time4.getTree());

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(1);}


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:46:9: time ( time_date_separator date )?
                    {
                    dbg.location(46,9);
                    pushFollow(FOLLOW_time_in_date_time215);
                    time5=time();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_time.add(time5.getTree());
                    dbg.location(46,14);
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:46:14: ( time_date_separator date )?
                    int alt2=2;
                    try { dbg.enterSubRule(2);
                    try { dbg.enterDecision(2);

                    int LA2_0 = input.LA(1);

                    if ( (LA2_0==WHITE_SPACE||LA2_0==COMMA) ) {
                        alt2=1;
                    }
                    } finally {dbg.exitDecision(2);}

                    switch (alt2) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:46:15: time_date_separator date
                            {
                            dbg.location(46,15);
                            pushFollow(FOLLOW_time_date_separator_in_date_time218);
                            time_date_separator6=time_date_separator();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_time_date_separator.add(time_date_separator6.getTree());
                            dbg.location(46,35);
                            pushFollow(FOLLOW_date_in_date_time220);
                            date7=date();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_date.add(date7.getTree());

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(2);}


                    }
                    break;

            }
            } finally {dbg.exitSubRule(3);}



            // AST REWRITE
            // elements: time, date
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 47:7: -> ^( DATE_TIME ( date )? ( time )? )
            {
                dbg.location(47,10);
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:47:10: ^( DATE_TIME ( date )? ( time )? )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(47,12);
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DATE_TIME, "DATE_TIME"), root_1);

                dbg.location(47,22);
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:47:22: ( date )?
                if ( stream_date.hasNext() ) {
                    dbg.location(47,22);
                    adaptor.addChild(root_1, stream_date.nextTree());

                }
                stream_date.reset();
                dbg.location(47,28);
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:47:28: ( time )?
                if ( stream_time.hasNext() ) {
                    dbg.location(47,28);
                    adaptor.addChild(root_1, stream_time.nextTree());

                }
                stream_time.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {

                //reportError(re);
                //input.consume(); // eat the ';'
                System.out.println("could not parse input");
              
        }
        finally {
        }
        dbg.location(48, 3);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "date_time");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "date_time"

    public static class date_time_separator_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "date_time_separator"
    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:55:1: date_time_separator : ( WHITE_SPACE ( AT WHITE_SPACE )? | COMMA ( WHITE_SPACE )? ( AT WHITE_SPACE )? );
    public final DateParser.date_time_separator_return date_time_separator() throws RecognitionException {
        DateParser.date_time_separator_return retval = new DateParser.date_time_separator_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token WHITE_SPACE8=null;
        Token AT9=null;
        Token WHITE_SPACE10=null;
        Token COMMA11=null;
        Token WHITE_SPACE12=null;
        Token AT13=null;
        Token WHITE_SPACE14=null;

        Object WHITE_SPACE8_tree=null;
        Object AT9_tree=null;
        Object WHITE_SPACE10_tree=null;
        Object COMMA11_tree=null;
        Object WHITE_SPACE12_tree=null;
        Object AT13_tree=null;
        Object WHITE_SPACE14_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "date_time_separator");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(55, 1);

        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:56:3: ( WHITE_SPACE ( AT WHITE_SPACE )? | COMMA ( WHITE_SPACE )? ( AT WHITE_SPACE )? )
            int alt7=2;
            try { dbg.enterDecision(7);

            int LA7_0 = input.LA(1);

            if ( (LA7_0==WHITE_SPACE) ) {
                alt7=1;
            }
            else if ( (LA7_0==COMMA) ) {
                alt7=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(7);}

            switch (alt7) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:56:5: WHITE_SPACE ( AT WHITE_SPACE )?
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(56,5);
                    WHITE_SPACE8=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_date_time_separator263); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    WHITE_SPACE8_tree = (Object)adaptor.create(WHITE_SPACE8);
                    adaptor.addChild(root_0, WHITE_SPACE8_tree);
                    }
                    dbg.location(56,17);
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:56:17: ( AT WHITE_SPACE )?
                    int alt4=2;
                    try { dbg.enterSubRule(4);
                    try { dbg.enterDecision(4);

                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==AT) ) {
                        alt4=1;
                    }
                    } finally {dbg.exitDecision(4);}

                    switch (alt4) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:56:18: AT WHITE_SPACE
                            {
                            dbg.location(56,18);
                            AT9=(Token)match(input,AT,FOLLOW_AT_in_date_time_separator266); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            AT9_tree = (Object)adaptor.create(AT9);
                            adaptor.addChild(root_0, AT9_tree);
                            }
                            dbg.location(56,21);
                            WHITE_SPACE10=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_date_time_separator268); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            WHITE_SPACE10_tree = (Object)adaptor.create(WHITE_SPACE10);
                            adaptor.addChild(root_0, WHITE_SPACE10_tree);
                            }

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(4);}


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:57:5: COMMA ( WHITE_SPACE )? ( AT WHITE_SPACE )?
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(57,5);
                    COMMA11=(Token)match(input,COMMA,FOLLOW_COMMA_in_date_time_separator276); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    COMMA11_tree = (Object)adaptor.create(COMMA11);
                    adaptor.addChild(root_0, COMMA11_tree);
                    }
                    dbg.location(57,11);
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:57:11: ( WHITE_SPACE )?
                    int alt5=2;
                    try { dbg.enterSubRule(5);
                    try { dbg.enterDecision(5);

                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==WHITE_SPACE) ) {
                        alt5=1;
                    }
                    } finally {dbg.exitDecision(5);}

                    switch (alt5) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:57:11: WHITE_SPACE
                            {
                            dbg.location(57,11);
                            WHITE_SPACE12=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_date_time_separator278); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            WHITE_SPACE12_tree = (Object)adaptor.create(WHITE_SPACE12);
                            adaptor.addChild(root_0, WHITE_SPACE12_tree);
                            }

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(5);}

                    dbg.location(57,24);
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:57:24: ( AT WHITE_SPACE )?
                    int alt6=2;
                    try { dbg.enterSubRule(6);
                    try { dbg.enterDecision(6);

                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==AT) ) {
                        alt6=1;
                    }
                    } finally {dbg.exitDecision(6);}

                    switch (alt6) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:57:25: AT WHITE_SPACE
                            {
                            dbg.location(57,25);
                            AT13=(Token)match(input,AT,FOLLOW_AT_in_date_time_separator282); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            AT13_tree = (Object)adaptor.create(AT13);
                            adaptor.addChild(root_0, AT13_tree);
                            }
                            dbg.location(57,28);
                            WHITE_SPACE14=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_date_time_separator284); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            WHITE_SPACE14_tree = (Object)adaptor.create(WHITE_SPACE14);
                            adaptor.addChild(root_0, WHITE_SPACE14_tree);
                            }

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(6);}


                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(58, 3);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "date_time_separator");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "date_time_separator"

    public static class time_date_separator_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "time_date_separator"
    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:60:1: time_date_separator : ( WHITE_SPACE ( ON WHITE_SPACE )? | COMMA ( WHITE_SPACE )? ( ON WHITE_SPACE )? );
    public final DateParser.time_date_separator_return time_date_separator() throws RecognitionException {
        DateParser.time_date_separator_return retval = new DateParser.time_date_separator_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token WHITE_SPACE15=null;
        Token ON16=null;
        Token WHITE_SPACE17=null;
        Token COMMA18=null;
        Token WHITE_SPACE19=null;
        Token ON20=null;
        Token WHITE_SPACE21=null;

        Object WHITE_SPACE15_tree=null;
        Object ON16_tree=null;
        Object WHITE_SPACE17_tree=null;
        Object COMMA18_tree=null;
        Object WHITE_SPACE19_tree=null;
        Object ON20_tree=null;
        Object WHITE_SPACE21_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "time_date_separator");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(60, 1);

        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:61:3: ( WHITE_SPACE ( ON WHITE_SPACE )? | COMMA ( WHITE_SPACE )? ( ON WHITE_SPACE )? )
            int alt11=2;
            try { dbg.enterDecision(11);

            int LA11_0 = input.LA(1);

            if ( (LA11_0==WHITE_SPACE) ) {
                alt11=1;
            }
            else if ( (LA11_0==COMMA) ) {
                alt11=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(11);}

            switch (alt11) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:61:5: WHITE_SPACE ( ON WHITE_SPACE )?
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(61,5);
                    WHITE_SPACE15=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_time_date_separator301); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    WHITE_SPACE15_tree = (Object)adaptor.create(WHITE_SPACE15);
                    adaptor.addChild(root_0, WHITE_SPACE15_tree);
                    }
                    dbg.location(61,17);
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:61:17: ( ON WHITE_SPACE )?
                    int alt8=2;
                    try { dbg.enterSubRule(8);
                    try { dbg.enterDecision(8);

                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==ON) ) {
                        alt8=1;
                    }
                    } finally {dbg.exitDecision(8);}

                    switch (alt8) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:61:18: ON WHITE_SPACE
                            {
                            dbg.location(61,18);
                            ON16=(Token)match(input,ON,FOLLOW_ON_in_time_date_separator304); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            ON16_tree = (Object)adaptor.create(ON16);
                            adaptor.addChild(root_0, ON16_tree);
                            }
                            dbg.location(61,21);
                            WHITE_SPACE17=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_time_date_separator306); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            WHITE_SPACE17_tree = (Object)adaptor.create(WHITE_SPACE17);
                            adaptor.addChild(root_0, WHITE_SPACE17_tree);
                            }

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(8);}


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:62:5: COMMA ( WHITE_SPACE )? ( ON WHITE_SPACE )?
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(62,5);
                    COMMA18=(Token)match(input,COMMA,FOLLOW_COMMA_in_time_date_separator314); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    COMMA18_tree = (Object)adaptor.create(COMMA18);
                    adaptor.addChild(root_0, COMMA18_tree);
                    }
                    dbg.location(62,11);
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:62:11: ( WHITE_SPACE )?
                    int alt9=2;
                    try { dbg.enterSubRule(9);
                    try { dbg.enterDecision(9);

                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==WHITE_SPACE) ) {
                        alt9=1;
                    }
                    } finally {dbg.exitDecision(9);}

                    switch (alt9) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:62:11: WHITE_SPACE
                            {
                            dbg.location(62,11);
                            WHITE_SPACE19=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_time_date_separator316); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            WHITE_SPACE19_tree = (Object)adaptor.create(WHITE_SPACE19);
                            adaptor.addChild(root_0, WHITE_SPACE19_tree);
                            }

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(9);}

                    dbg.location(62,24);
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:62:24: ( ON WHITE_SPACE )?
                    int alt10=2;
                    try { dbg.enterSubRule(10);
                    try { dbg.enterDecision(10);

                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==ON) ) {
                        alt10=1;
                    }
                    } finally {dbg.exitDecision(10);}

                    switch (alt10) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:62:25: ON WHITE_SPACE
                            {
                            dbg.location(62,25);
                            ON20=(Token)match(input,ON,FOLLOW_ON_in_time_date_separator320); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            ON20_tree = (Object)adaptor.create(ON20);
                            adaptor.addChild(root_0, ON20_tree);
                            }
                            dbg.location(62,28);
                            WHITE_SPACE21=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_time_date_separator322); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            WHITE_SPACE21_tree = (Object)adaptor.create(WHITE_SPACE21);
                            adaptor.addChild(root_0, WHITE_SPACE21_tree);
                            }

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(10);}


                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(63, 3);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "time_date_separator");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "time_date_separator"

    public static class date_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "date"
    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:65:1: date : ( ( relaxed_date )=> relaxed_date | formal_date | relative_date | global_date_prefix date -> ^( RELATIVE_DATE ^( SEEK global_date_prefix date ) ) );
    public final DateParser.date_return date() throws RecognitionException {
        DateParser.date_return retval = new DateParser.date_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        DateParser.relaxed_date_return relaxed_date22 = null;

        DateParser.formal_date_return formal_date23 = null;

        DateParser.relative_date_return relative_date24 = null;

        DateParser.global_date_prefix_return global_date_prefix25 = null;

        DateParser.date_return date26 = null;


        RewriteRuleSubtreeStream stream_global_date_prefix=new RewriteRuleSubtreeStream(adaptor,"rule global_date_prefix");
        RewriteRuleSubtreeStream stream_date=new RewriteRuleSubtreeStream(adaptor,"rule date");
        try { dbg.enterRule(getGrammarFileName(), "date");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(65, 1);

        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:66:3: ( ( relaxed_date )=> relaxed_date | formal_date | relative_date | global_date_prefix date -> ^( RELATIVE_DATE ^( SEEK global_date_prefix date ) ) )
            int alt12=4;
            try { dbg.enterDecision(12);

            try {
                isCyclicDecision = true;
                alt12 = dfa12.predict(input);
            }
            catch (NoViableAltException nvae) {
                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(12);}

            switch (alt12) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:66:5: ( relaxed_date )=> relaxed_date
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(66,22);
                    pushFollow(FOLLOW_relaxed_date_in_date342);
                    relaxed_date22=relaxed_date();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, relaxed_date22.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:67:5: formal_date
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(67,5);
                    pushFollow(FOLLOW_formal_date_in_date348);
                    formal_date23=formal_date();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, formal_date23.getTree());

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:68:5: relative_date
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(68,5);
                    pushFollow(FOLLOW_relative_date_in_date354);
                    relative_date24=relative_date();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, relative_date24.getTree());

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:69:5: global_date_prefix date
                    {
                    dbg.location(69,5);
                    pushFollow(FOLLOW_global_date_prefix_in_date360);
                    global_date_prefix25=global_date_prefix();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_global_date_prefix.add(global_date_prefix25.getTree());
                    dbg.location(69,24);
                    pushFollow(FOLLOW_date_in_date362);
                    date26=date();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_date.add(date26.getTree());


                    // AST REWRITE
                    // elements: global_date_prefix, date
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 70:7: -> ^( RELATIVE_DATE ^( SEEK global_date_prefix date ) )
                    {
                        dbg.location(70,10);
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:70:10: ^( RELATIVE_DATE ^( SEEK global_date_prefix date ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(70,12);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(RELATIVE_DATE, "RELATIVE_DATE"), root_1);

                        dbg.location(70,26);
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:70:26: ^( SEEK global_date_prefix date )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        dbg.location(70,28);
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(SEEK, "SEEK"), root_2);

                        dbg.location(70,33);
                        adaptor.addChild(root_2, stream_global_date_prefix.nextTree());
                        dbg.location(70,52);
                        adaptor.addChild(root_2, stream_date.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(71, 3);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "date");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "date"

    public static class global_date_prefix_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "global_date_prefix"
    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:73:1: global_date_prefix : ( ( THE WHITE_SPACE )? DAY WHITE_SPACE prefix_direction WHITE_SPACE -> prefix_direction SEEK_BY[\"by_day\"] INT[\"1\"] | spelled_or_int_01_to_31_optional_prefix WHITE_SPACE DAY WHITE_SPACE prefix_direction WHITE_SPACE -> prefix_direction SEEK_BY[\"by_day\"] spelled_or_int_01_to_31_optional_prefix );
    public final DateParser.global_date_prefix_return global_date_prefix() throws RecognitionException {
        DateParser.global_date_prefix_return retval = new DateParser.global_date_prefix_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token THE27=null;
        Token WHITE_SPACE28=null;
        Token DAY29=null;
        Token WHITE_SPACE30=null;
        Token WHITE_SPACE32=null;
        Token WHITE_SPACE34=null;
        Token DAY35=null;
        Token WHITE_SPACE36=null;
        Token WHITE_SPACE38=null;
        DateParser.prefix_direction_return prefix_direction31 = null;

        DateParser.spelled_or_int_01_to_31_optional_prefix_return spelled_or_int_01_to_31_optional_prefix33 = null;

        DateParser.prefix_direction_return prefix_direction37 = null;


        Object THE27_tree=null;
        Object WHITE_SPACE28_tree=null;
        Object DAY29_tree=null;
        Object WHITE_SPACE30_tree=null;
        Object WHITE_SPACE32_tree=null;
        Object WHITE_SPACE34_tree=null;
        Object DAY35_tree=null;
        Object WHITE_SPACE36_tree=null;
        Object WHITE_SPACE38_tree=null;
        RewriteRuleTokenStream stream_DAY=new RewriteRuleTokenStream(adaptor,"token DAY");
        RewriteRuleTokenStream stream_THE=new RewriteRuleTokenStream(adaptor,"token THE");
        RewriteRuleTokenStream stream_WHITE_SPACE=new RewriteRuleTokenStream(adaptor,"token WHITE_SPACE");
        RewriteRuleSubtreeStream stream_spelled_or_int_01_to_31_optional_prefix=new RewriteRuleSubtreeStream(adaptor,"rule spelled_or_int_01_to_31_optional_prefix");
        RewriteRuleSubtreeStream stream_prefix_direction=new RewriteRuleSubtreeStream(adaptor,"rule prefix_direction");
        try { dbg.enterRule(getGrammarFileName(), "global_date_prefix");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(73, 1);

        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:74:3: ( ( THE WHITE_SPACE )? DAY WHITE_SPACE prefix_direction WHITE_SPACE -> prefix_direction SEEK_BY[\"by_day\"] INT[\"1\"] | spelled_or_int_01_to_31_optional_prefix WHITE_SPACE DAY WHITE_SPACE prefix_direction WHITE_SPACE -> prefix_direction SEEK_BY[\"by_day\"] spelled_or_int_01_to_31_optional_prefix )
            int alt14=2;
            try { dbg.enterDecision(14);

            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=THE && LA14_0<=DAY)) ) {
                alt14=1;
            }
            else if ( (LA14_0==INT_1_TO_5||(LA14_0>=INT_6_TO_9 && LA14_0<=INT_24_TO_31)||(LA14_0>=ONE && LA14_0<=THIRTY)) ) {
                alt14=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(14);}

            switch (alt14) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:74:5: ( THE WHITE_SPACE )? DAY WHITE_SPACE prefix_direction WHITE_SPACE
                    {
                    dbg.location(74,5);
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:74:5: ( THE WHITE_SPACE )?
                    int alt13=2;
                    try { dbg.enterSubRule(13);
                    try { dbg.enterDecision(13);

                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==THE) ) {
                        alt13=1;
                    }
                    } finally {dbg.exitDecision(13);}

                    switch (alt13) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:74:6: THE WHITE_SPACE
                            {
                            dbg.location(74,6);
                            THE27=(Token)match(input,THE,FOLLOW_THE_in_global_date_prefix399); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_THE.add(THE27);

                            dbg.location(74,10);
                            WHITE_SPACE28=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_global_date_prefix401); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE28);


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(13);}

                    dbg.location(74,24);
                    DAY29=(Token)match(input,DAY,FOLLOW_DAY_in_global_date_prefix405); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DAY.add(DAY29);

                    dbg.location(74,28);
                    WHITE_SPACE30=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_global_date_prefix407); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE30);

                    dbg.location(74,40);
                    pushFollow(FOLLOW_prefix_direction_in_global_date_prefix409);
                    prefix_direction31=prefix_direction();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_prefix_direction.add(prefix_direction31.getTree());
                    dbg.location(74,57);
                    WHITE_SPACE32=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_global_date_prefix411); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE32);



                    // AST REWRITE
                    // elements: prefix_direction
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 75:7: -> prefix_direction SEEK_BY[\"by_day\"] INT[\"1\"]
                    {
                        dbg.location(75,10);
                        adaptor.addChild(root_0, stream_prefix_direction.nextTree());
                        dbg.location(75,27);
                        adaptor.addChild(root_0, (Object)adaptor.create(SEEK_BY, "by_day"));
                        dbg.location(75,45);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "1"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:77:5: spelled_or_int_01_to_31_optional_prefix WHITE_SPACE DAY WHITE_SPACE prefix_direction WHITE_SPACE
                    {
                    dbg.location(77,5);
                    pushFollow(FOLLOW_spelled_or_int_01_to_31_optional_prefix_in_global_date_prefix437);
                    spelled_or_int_01_to_31_optional_prefix33=spelled_or_int_01_to_31_optional_prefix();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_spelled_or_int_01_to_31_optional_prefix.add(spelled_or_int_01_to_31_optional_prefix33.getTree());
                    dbg.location(77,45);
                    WHITE_SPACE34=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_global_date_prefix439); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE34);

                    dbg.location(77,57);
                    DAY35=(Token)match(input,DAY,FOLLOW_DAY_in_global_date_prefix441); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DAY.add(DAY35);

                    dbg.location(77,61);
                    WHITE_SPACE36=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_global_date_prefix443); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE36);

                    dbg.location(77,73);
                    pushFollow(FOLLOW_prefix_direction_in_global_date_prefix445);
                    prefix_direction37=prefix_direction();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_prefix_direction.add(prefix_direction37.getTree());
                    dbg.location(77,90);
                    WHITE_SPACE38=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_global_date_prefix447); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE38);



                    // AST REWRITE
                    // elements: spelled_or_int_01_to_31_optional_prefix, prefix_direction
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 78:7: -> prefix_direction SEEK_BY[\"by_day\"] spelled_or_int_01_to_31_optional_prefix
                    {
                        dbg.location(78,10);
                        adaptor.addChild(root_0, stream_prefix_direction.nextTree());
                        dbg.location(78,27);
                        adaptor.addChild(root_0, (Object)adaptor.create(SEEK_BY, "by_day"));
                        dbg.location(78,45);
                        adaptor.addChild(root_0, stream_spelled_or_int_01_to_31_optional_prefix.nextTree());

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(79, 3);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "global_date_prefix");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "global_date_prefix"

    public static class prefix_direction_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "prefix_direction"
    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:81:1: prefix_direction : ( AFTER -> DIRECTION[\">\"] | BEFORE -> DIRECTION[\"<\"] );
    public final DateParser.prefix_direction_return prefix_direction() throws RecognitionException {
        DateParser.prefix_direction_return retval = new DateParser.prefix_direction_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token AFTER39=null;
        Token BEFORE40=null;

        Object AFTER39_tree=null;
        Object BEFORE40_tree=null;
        RewriteRuleTokenStream stream_BEFORE=new RewriteRuleTokenStream(adaptor,"token BEFORE");
        RewriteRuleTokenStream stream_AFTER=new RewriteRuleTokenStream(adaptor,"token AFTER");

        try { dbg.enterRule(getGrammarFileName(), "prefix_direction");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(81, 1);

        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:82:3: ( AFTER -> DIRECTION[\">\"] | BEFORE -> DIRECTION[\"<\"] )
            int alt15=2;
            try { dbg.enterDecision(15);

            int LA15_0 = input.LA(1);

            if ( (LA15_0==AFTER) ) {
                alt15=1;
            }
            else if ( (LA15_0==BEFORE) ) {
                alt15=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(15);}

            switch (alt15) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:82:5: AFTER
                    {
                    dbg.location(82,5);
                    AFTER39=(Token)match(input,AFTER,FOLLOW_AFTER_in_prefix_direction478); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AFTER.add(AFTER39);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 82:12: -> DIRECTION[\">\"]
                    {
                        dbg.location(82,15);
                        adaptor.addChild(root_0, (Object)adaptor.create(DIRECTION, ">"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:83:5: BEFORE
                    {
                    dbg.location(83,5);
                    BEFORE40=(Token)match(input,BEFORE,FOLLOW_BEFORE_in_prefix_direction490); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_BEFORE.add(BEFORE40);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 83:12: -> DIRECTION[\"<\"]
                    {
                        dbg.location(83,15);
                        adaptor.addChild(root_0, (Object)adaptor.create(DIRECTION, "<"));

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(84, 3);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "prefix_direction");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "prefix_direction"

    public static class relaxed_date_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "relaxed_date"
    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:89:1: relaxed_date : ( ( ( THE WHITE_SPACE )? relaxed_day_of_month WHITE_SPACE ( OF WHITE_SPACE )? relaxed_month relaxed_year_prefix relaxed_year )=> ( THE WHITE_SPACE )? relaxed_day_of_month WHITE_SPACE ( OF WHITE_SPACE )? relaxed_month relaxed_year_prefix relaxed_year | ( relaxed_month WHITE_SPACE relaxed_day_of_month relaxed_year_prefix relaxed_year )=> relaxed_month WHITE_SPACE relaxed_day_of_month relaxed_year_prefix relaxed_year | ( THE WHITE_SPACE )? relaxed_day_of_month WHITE_SPACE ( OF WHITE_SPACE )? relaxed_month | ( THE WHITE_SPACE )? relaxed_month WHITE_SPACE relaxed_day_of_month ) -> ^( EXPLICIT_DATE relaxed_month relaxed_day_of_month ( relaxed_year )? ) ;
    public final DateParser.relaxed_date_return relaxed_date() throws RecognitionException {
        DateParser.relaxed_date_return retval = new DateParser.relaxed_date_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token THE41=null;
        Token WHITE_SPACE42=null;
        Token WHITE_SPACE44=null;
        Token OF45=null;
        Token WHITE_SPACE46=null;
        Token WHITE_SPACE51=null;
        Token THE55=null;
        Token WHITE_SPACE56=null;
        Token WHITE_SPACE58=null;
        Token OF59=null;
        Token WHITE_SPACE60=null;
        Token THE62=null;
        Token WHITE_SPACE63=null;
        Token WHITE_SPACE65=null;
        DateParser.relaxed_day_of_month_return relaxed_day_of_month43 = null;

        DateParser.relaxed_month_return relaxed_month47 = null;

        DateParser.relaxed_year_prefix_return relaxed_year_prefix48 = null;

        DateParser.relaxed_year_return relaxed_year49 = null;

        DateParser.relaxed_month_return relaxed_month50 = null;

        DateParser.relaxed_day_of_month_return relaxed_day_of_month52 = null;

        DateParser.relaxed_year_prefix_return relaxed_year_prefix53 = null;

        DateParser.relaxed_year_return relaxed_year54 = null;

        DateParser.relaxed_day_of_month_return relaxed_day_of_month57 = null;

        DateParser.relaxed_month_return relaxed_month61 = null;

        DateParser.relaxed_month_return relaxed_month64 = null;

        DateParser.relaxed_day_of_month_return relaxed_day_of_month66 = null;


        Object THE41_tree=null;
        Object WHITE_SPACE42_tree=null;
        Object WHITE_SPACE44_tree=null;
        Object OF45_tree=null;
        Object WHITE_SPACE46_tree=null;
        Object WHITE_SPACE51_tree=null;
        Object THE55_tree=null;
        Object WHITE_SPACE56_tree=null;
        Object WHITE_SPACE58_tree=null;
        Object OF59_tree=null;
        Object WHITE_SPACE60_tree=null;
        Object THE62_tree=null;
        Object WHITE_SPACE63_tree=null;
        Object WHITE_SPACE65_tree=null;
        RewriteRuleTokenStream stream_THE=new RewriteRuleTokenStream(adaptor,"token THE");
        RewriteRuleTokenStream stream_OF=new RewriteRuleTokenStream(adaptor,"token OF");
        RewriteRuleTokenStream stream_WHITE_SPACE=new RewriteRuleTokenStream(adaptor,"token WHITE_SPACE");
        RewriteRuleSubtreeStream stream_relaxed_day_of_month=new RewriteRuleSubtreeStream(adaptor,"rule relaxed_day_of_month");
        RewriteRuleSubtreeStream stream_relaxed_month=new RewriteRuleSubtreeStream(adaptor,"rule relaxed_month");
        RewriteRuleSubtreeStream stream_relaxed_year=new RewriteRuleSubtreeStream(adaptor,"rule relaxed_year");
        RewriteRuleSubtreeStream stream_relaxed_year_prefix=new RewriteRuleSubtreeStream(adaptor,"rule relaxed_year_prefix");
        try { dbg.enterRule(getGrammarFileName(), "relaxed_date");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(89, 1);

        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:90:3: ( ( ( ( THE WHITE_SPACE )? relaxed_day_of_month WHITE_SPACE ( OF WHITE_SPACE )? relaxed_month relaxed_year_prefix relaxed_year )=> ( THE WHITE_SPACE )? relaxed_day_of_month WHITE_SPACE ( OF WHITE_SPACE )? relaxed_month relaxed_year_prefix relaxed_year | ( relaxed_month WHITE_SPACE relaxed_day_of_month relaxed_year_prefix relaxed_year )=> relaxed_month WHITE_SPACE relaxed_day_of_month relaxed_year_prefix relaxed_year | ( THE WHITE_SPACE )? relaxed_day_of_month WHITE_SPACE ( OF WHITE_SPACE )? relaxed_month | ( THE WHITE_SPACE )? relaxed_month WHITE_SPACE relaxed_day_of_month ) -> ^( EXPLICIT_DATE relaxed_month relaxed_day_of_month ( relaxed_year )? ) )
            dbg.enterAlt(1);

            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:90:5: ( ( ( THE WHITE_SPACE )? relaxed_day_of_month WHITE_SPACE ( OF WHITE_SPACE )? relaxed_month relaxed_year_prefix relaxed_year )=> ( THE WHITE_SPACE )? relaxed_day_of_month WHITE_SPACE ( OF WHITE_SPACE )? relaxed_month relaxed_year_prefix relaxed_year | ( relaxed_month WHITE_SPACE relaxed_day_of_month relaxed_year_prefix relaxed_year )=> relaxed_month WHITE_SPACE relaxed_day_of_month relaxed_year_prefix relaxed_year | ( THE WHITE_SPACE )? relaxed_day_of_month WHITE_SPACE ( OF WHITE_SPACE )? relaxed_month | ( THE WHITE_SPACE )? relaxed_month WHITE_SPACE relaxed_day_of_month )
            {
            dbg.location(90,5);
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:90:5: ( ( ( THE WHITE_SPACE )? relaxed_day_of_month WHITE_SPACE ( OF WHITE_SPACE )? relaxed_month relaxed_year_prefix relaxed_year )=> ( THE WHITE_SPACE )? relaxed_day_of_month WHITE_SPACE ( OF WHITE_SPACE )? relaxed_month relaxed_year_prefix relaxed_year | ( relaxed_month WHITE_SPACE relaxed_day_of_month relaxed_year_prefix relaxed_year )=> relaxed_month WHITE_SPACE relaxed_day_of_month relaxed_year_prefix relaxed_year | ( THE WHITE_SPACE )? relaxed_day_of_month WHITE_SPACE ( OF WHITE_SPACE )? relaxed_month | ( THE WHITE_SPACE )? relaxed_month WHITE_SPACE relaxed_day_of_month )
            int alt21=4;
            try { dbg.enterSubRule(21);
            try { dbg.enterDecision(21);

            try {
                isCyclicDecision = true;
                alt21 = dfa21.predict(input);
            }
            catch (NoViableAltException nvae) {
                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(21);}

            switch (alt21) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:94:7: ( ( THE WHITE_SPACE )? relaxed_day_of_month WHITE_SPACE ( OF WHITE_SPACE )? relaxed_month relaxed_year_prefix relaxed_year )=> ( THE WHITE_SPACE )? relaxed_day_of_month WHITE_SPACE ( OF WHITE_SPACE )? relaxed_month relaxed_year_prefix relaxed_year
                    {
                    dbg.location(95,9);
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:95:9: ( THE WHITE_SPACE )?
                    int alt16=2;
                    try { dbg.enterSubRule(16);
                    try { dbg.enterDecision(16);

                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==THE) ) {
                        alt16=1;
                    }
                    } finally {dbg.exitDecision(16);}

                    switch (alt16) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:95:10: THE WHITE_SPACE
                            {
                            dbg.location(95,10);
                            THE41=(Token)match(input,THE,FOLLOW_THE_in_relaxed_date578); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_THE.add(THE41);

                            dbg.location(95,14);
                            WHITE_SPACE42=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_relaxed_date580); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE42);


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(16);}

                    dbg.location(95,28);
                    pushFollow(FOLLOW_relaxed_day_of_month_in_relaxed_date584);
                    relaxed_day_of_month43=relaxed_day_of_month();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_relaxed_day_of_month.add(relaxed_day_of_month43.getTree());
                    dbg.location(95,49);
                    WHITE_SPACE44=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_relaxed_date586); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE44);

                    dbg.location(95,61);
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:95:61: ( OF WHITE_SPACE )?
                    int alt17=2;
                    try { dbg.enterSubRule(17);
                    try { dbg.enterDecision(17);

                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==OF) ) {
                        alt17=1;
                    }
                    } finally {dbg.exitDecision(17);}

                    switch (alt17) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:95:62: OF WHITE_SPACE
                            {
                            dbg.location(95,62);
                            OF45=(Token)match(input,OF,FOLLOW_OF_in_relaxed_date589); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_OF.add(OF45);

                            dbg.location(95,65);
                            WHITE_SPACE46=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_relaxed_date591); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE46);


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(17);}

                    dbg.location(95,79);
                    pushFollow(FOLLOW_relaxed_month_in_relaxed_date595);
                    relaxed_month47=relaxed_month();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_relaxed_month.add(relaxed_month47.getTree());
                    dbg.location(95,93);
                    pushFollow(FOLLOW_relaxed_year_prefix_in_relaxed_date597);
                    relaxed_year_prefix48=relaxed_year_prefix();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_relaxed_year_prefix.add(relaxed_year_prefix48.getTree());
                    dbg.location(95,113);
                    pushFollow(FOLLOW_relaxed_year_in_relaxed_date599);
                    relaxed_year49=relaxed_year();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_relaxed_year.add(relaxed_year49.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:97:9: ( relaxed_month WHITE_SPACE relaxed_day_of_month relaxed_year_prefix relaxed_year )=> relaxed_month WHITE_SPACE relaxed_day_of_month relaxed_year_prefix relaxed_year
                    {
                    dbg.location(98,9);
                    pushFollow(FOLLOW_relaxed_month_in_relaxed_date635);
                    relaxed_month50=relaxed_month();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_relaxed_month.add(relaxed_month50.getTree());
                    dbg.location(98,23);
                    WHITE_SPACE51=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_relaxed_date637); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE51);

                    dbg.location(98,35);
                    pushFollow(FOLLOW_relaxed_day_of_month_in_relaxed_date639);
                    relaxed_day_of_month52=relaxed_day_of_month();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_relaxed_day_of_month.add(relaxed_day_of_month52.getTree());
                    dbg.location(98,56);
                    pushFollow(FOLLOW_relaxed_year_prefix_in_relaxed_date641);
                    relaxed_year_prefix53=relaxed_year_prefix();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_relaxed_year_prefix.add(relaxed_year_prefix53.getTree());
                    dbg.location(98,76);
                    pushFollow(FOLLOW_relaxed_year_in_relaxed_date643);
                    relaxed_year54=relaxed_year();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_relaxed_year.add(relaxed_year54.getTree());

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:100:9: ( THE WHITE_SPACE )? relaxed_day_of_month WHITE_SPACE ( OF WHITE_SPACE )? relaxed_month
                    {
                    dbg.location(100,9);
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:100:9: ( THE WHITE_SPACE )?
                    int alt18=2;
                    try { dbg.enterSubRule(18);
                    try { dbg.enterDecision(18);

                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==THE) ) {
                        alt18=1;
                    }
                    } finally {dbg.exitDecision(18);}

                    switch (alt18) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:100:10: THE WHITE_SPACE
                            {
                            dbg.location(100,10);
                            THE55=(Token)match(input,THE,FOLLOW_THE_in_relaxed_date659); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_THE.add(THE55);

                            dbg.location(100,14);
                            WHITE_SPACE56=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_relaxed_date661); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE56);


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(18);}

                    dbg.location(100,28);
                    pushFollow(FOLLOW_relaxed_day_of_month_in_relaxed_date665);
                    relaxed_day_of_month57=relaxed_day_of_month();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_relaxed_day_of_month.add(relaxed_day_of_month57.getTree());
                    dbg.location(100,49);
                    WHITE_SPACE58=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_relaxed_date667); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE58);

                    dbg.location(100,61);
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:100:61: ( OF WHITE_SPACE )?
                    int alt19=2;
                    try { dbg.enterSubRule(19);
                    try { dbg.enterDecision(19);

                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==OF) ) {
                        alt19=1;
                    }
                    } finally {dbg.exitDecision(19);}

                    switch (alt19) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:100:62: OF WHITE_SPACE
                            {
                            dbg.location(100,62);
                            OF59=(Token)match(input,OF,FOLLOW_OF_in_relaxed_date670); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_OF.add(OF59);

                            dbg.location(100,65);
                            WHITE_SPACE60=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_relaxed_date672); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE60);


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(19);}

                    dbg.location(100,79);
                    pushFollow(FOLLOW_relaxed_month_in_relaxed_date676);
                    relaxed_month61=relaxed_month();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_relaxed_month.add(relaxed_month61.getTree());

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:102:9: ( THE WHITE_SPACE )? relaxed_month WHITE_SPACE relaxed_day_of_month
                    {
                    dbg.location(102,9);
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:102:9: ( THE WHITE_SPACE )?
                    int alt20=2;
                    try { dbg.enterSubRule(20);
                    try { dbg.enterDecision(20);

                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==THE) ) {
                        alt20=1;
                    }
                    } finally {dbg.exitDecision(20);}

                    switch (alt20) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:102:10: THE WHITE_SPACE
                            {
                            dbg.location(102,10);
                            THE62=(Token)match(input,THE,FOLLOW_THE_in_relaxed_date694); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_THE.add(THE62);

                            dbg.location(102,14);
                            WHITE_SPACE63=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_relaxed_date696); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE63);


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(20);}

                    dbg.location(102,28);
                    pushFollow(FOLLOW_relaxed_month_in_relaxed_date700);
                    relaxed_month64=relaxed_month();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_relaxed_month.add(relaxed_month64.getTree());
                    dbg.location(102,42);
                    WHITE_SPACE65=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_relaxed_date702); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE65);

                    dbg.location(102,54);
                    pushFollow(FOLLOW_relaxed_day_of_month_in_relaxed_date704);
                    relaxed_day_of_month66=relaxed_day_of_month();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_relaxed_day_of_month.add(relaxed_day_of_month66.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(21);}



            // AST REWRITE
            // elements: relaxed_year, relaxed_month, relaxed_day_of_month
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 103:7: -> ^( EXPLICIT_DATE relaxed_month relaxed_day_of_month ( relaxed_year )? )
            {
                dbg.location(103,10);
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:103:10: ^( EXPLICIT_DATE relaxed_month relaxed_day_of_month ( relaxed_year )? )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(103,12);
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPLICIT_DATE, "EXPLICIT_DATE"), root_1);

                dbg.location(103,26);
                adaptor.addChild(root_1, stream_relaxed_month.nextTree());
                dbg.location(103,40);
                adaptor.addChild(root_1, stream_relaxed_day_of_month.nextTree());
                dbg.location(103,61);
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:103:61: ( relaxed_year )?
                if ( stream_relaxed_year.hasNext() ) {
                    dbg.location(103,61);
                    adaptor.addChild(root_1, stream_relaxed_year.nextTree());

                }
                stream_relaxed_year.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(104, 3);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "relaxed_date");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "relaxed_date"

    public static class relaxed_month_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "relaxed_month"
    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:106:1: relaxed_month : ( JANUARY -> ^( MONTH_OF_YEAR INT[\"1\"] ) | FEBRUARY -> ^( MONTH_OF_YEAR INT[\"2\"] ) | MARCH -> ^( MONTH_OF_YEAR INT[\"3\"] ) | APRIL -> ^( MONTH_OF_YEAR INT[\"4\"] ) | MAY -> ^( MONTH_OF_YEAR INT[\"5\"] ) | JUNE -> ^( MONTH_OF_YEAR INT[\"6\"] ) | JULY -> ^( MONTH_OF_YEAR INT[\"7\"] ) | AUGUST -> ^( MONTH_OF_YEAR INT[\"8\"] ) | SEPTEMBER -> ^( MONTH_OF_YEAR INT[\"9\"] ) | OCTOBER -> ^( MONTH_OF_YEAR INT[\"10\"] ) | NOVEMBER -> ^( MONTH_OF_YEAR INT[\"11\"] ) | DECEMBER -> ^( MONTH_OF_YEAR INT[\"12\"] ) );
    public final DateParser.relaxed_month_return relaxed_month() throws RecognitionException {
        DateParser.relaxed_month_return retval = new DateParser.relaxed_month_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token JANUARY67=null;
        Token FEBRUARY68=null;
        Token MARCH69=null;
        Token APRIL70=null;
        Token MAY71=null;
        Token JUNE72=null;
        Token JULY73=null;
        Token AUGUST74=null;
        Token SEPTEMBER75=null;
        Token OCTOBER76=null;
        Token NOVEMBER77=null;
        Token DECEMBER78=null;

        Object JANUARY67_tree=null;
        Object FEBRUARY68_tree=null;
        Object MARCH69_tree=null;
        Object APRIL70_tree=null;
        Object MAY71_tree=null;
        Object JUNE72_tree=null;
        Object JULY73_tree=null;
        Object AUGUST74_tree=null;
        Object SEPTEMBER75_tree=null;
        Object OCTOBER76_tree=null;
        Object NOVEMBER77_tree=null;
        Object DECEMBER78_tree=null;
        RewriteRuleTokenStream stream_OCTOBER=new RewriteRuleTokenStream(adaptor,"token OCTOBER");
        RewriteRuleTokenStream stream_MAY=new RewriteRuleTokenStream(adaptor,"token MAY");
        RewriteRuleTokenStream stream_AUGUST=new RewriteRuleTokenStream(adaptor,"token AUGUST");
        RewriteRuleTokenStream stream_FEBRUARY=new RewriteRuleTokenStream(adaptor,"token FEBRUARY");
        RewriteRuleTokenStream stream_SEPTEMBER=new RewriteRuleTokenStream(adaptor,"token SEPTEMBER");
        RewriteRuleTokenStream stream_JUNE=new RewriteRuleTokenStream(adaptor,"token JUNE");
        RewriteRuleTokenStream stream_NOVEMBER=new RewriteRuleTokenStream(adaptor,"token NOVEMBER");
        RewriteRuleTokenStream stream_MARCH=new RewriteRuleTokenStream(adaptor,"token MARCH");
        RewriteRuleTokenStream stream_JULY=new RewriteRuleTokenStream(adaptor,"token JULY");
        RewriteRuleTokenStream stream_APRIL=new RewriteRuleTokenStream(adaptor,"token APRIL");
        RewriteRuleTokenStream stream_JANUARY=new RewriteRuleTokenStream(adaptor,"token JANUARY");
        RewriteRuleTokenStream stream_DECEMBER=new RewriteRuleTokenStream(adaptor,"token DECEMBER");

        try { dbg.enterRule(getGrammarFileName(), "relaxed_month");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(106, 1);

        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:107:3: ( JANUARY -> ^( MONTH_OF_YEAR INT[\"1\"] ) | FEBRUARY -> ^( MONTH_OF_YEAR INT[\"2\"] ) | MARCH -> ^( MONTH_OF_YEAR INT[\"3\"] ) | APRIL -> ^( MONTH_OF_YEAR INT[\"4\"] ) | MAY -> ^( MONTH_OF_YEAR INT[\"5\"] ) | JUNE -> ^( MONTH_OF_YEAR INT[\"6\"] ) | JULY -> ^( MONTH_OF_YEAR INT[\"7\"] ) | AUGUST -> ^( MONTH_OF_YEAR INT[\"8\"] ) | SEPTEMBER -> ^( MONTH_OF_YEAR INT[\"9\"] ) | OCTOBER -> ^( MONTH_OF_YEAR INT[\"10\"] ) | NOVEMBER -> ^( MONTH_OF_YEAR INT[\"11\"] ) | DECEMBER -> ^( MONTH_OF_YEAR INT[\"12\"] ) )
            int alt22=12;
            try { dbg.enterDecision(22);

            switch ( input.LA(1) ) {
            case JANUARY:
                {
                alt22=1;
                }
                break;
            case FEBRUARY:
                {
                alt22=2;
                }
                break;
            case MARCH:
                {
                alt22=3;
                }
                break;
            case APRIL:
                {
                alt22=4;
                }
                break;
            case MAY:
                {
                alt22=5;
                }
                break;
            case JUNE:
                {
                alt22=6;
                }
                break;
            case JULY:
                {
                alt22=7;
                }
                break;
            case AUGUST:
                {
                alt22=8;
                }
                break;
            case SEPTEMBER:
                {
                alt22=9;
                }
                break;
            case OCTOBER:
                {
                alt22=10;
                }
                break;
            case NOVEMBER:
                {
                alt22=11;
                }
                break;
            case DECEMBER:
                {
                alt22=12;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(22);}

            switch (alt22) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:107:5: JANUARY
                    {
                    dbg.location(107,5);
                    JANUARY67=(Token)match(input,JANUARY,FOLLOW_JANUARY_in_relaxed_month736); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_JANUARY.add(JANUARY67);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 107:15: -> ^( MONTH_OF_YEAR INT[\"1\"] )
                    {
                        dbg.location(107,18);
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:107:18: ^( MONTH_OF_YEAR INT[\"1\"] )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(107,20);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(MONTH_OF_YEAR, "MONTH_OF_YEAR"), root_1);

                        dbg.location(107,34);
                        adaptor.addChild(root_1, (Object)adaptor.create(INT, "1"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:108:5: FEBRUARY
                    {
                    dbg.location(108,5);
                    FEBRUARY68=(Token)match(input,FEBRUARY,FOLLOW_FEBRUARY_in_relaxed_month753); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FEBRUARY.add(FEBRUARY68);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 108:15: -> ^( MONTH_OF_YEAR INT[\"2\"] )
                    {
                        dbg.location(108,18);
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:108:18: ^( MONTH_OF_YEAR INT[\"2\"] )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(108,20);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(MONTH_OF_YEAR, "MONTH_OF_YEAR"), root_1);

                        dbg.location(108,34);
                        adaptor.addChild(root_1, (Object)adaptor.create(INT, "2"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:109:5: MARCH
                    {
                    dbg.location(109,5);
                    MARCH69=(Token)match(input,MARCH,FOLLOW_MARCH_in_relaxed_month769); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_MARCH.add(MARCH69);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 109:15: -> ^( MONTH_OF_YEAR INT[\"3\"] )
                    {
                        dbg.location(109,18);
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:109:18: ^( MONTH_OF_YEAR INT[\"3\"] )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(109,20);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(MONTH_OF_YEAR, "MONTH_OF_YEAR"), root_1);

                        dbg.location(109,34);
                        adaptor.addChild(root_1, (Object)adaptor.create(INT, "3"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:110:5: APRIL
                    {
                    dbg.location(110,5);
                    APRIL70=(Token)match(input,APRIL,FOLLOW_APRIL_in_relaxed_month788); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_APRIL.add(APRIL70);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 110:15: -> ^( MONTH_OF_YEAR INT[\"4\"] )
                    {
                        dbg.location(110,18);
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:110:18: ^( MONTH_OF_YEAR INT[\"4\"] )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(110,20);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(MONTH_OF_YEAR, "MONTH_OF_YEAR"), root_1);

                        dbg.location(110,34);
                        adaptor.addChild(root_1, (Object)adaptor.create(INT, "4"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:111:5: MAY
                    {
                    dbg.location(111,5);
                    MAY71=(Token)match(input,MAY,FOLLOW_MAY_in_relaxed_month807); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_MAY.add(MAY71);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 111:15: -> ^( MONTH_OF_YEAR INT[\"5\"] )
                    {
                        dbg.location(111,18);
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:111:18: ^( MONTH_OF_YEAR INT[\"5\"] )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(111,20);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(MONTH_OF_YEAR, "MONTH_OF_YEAR"), root_1);

                        dbg.location(111,34);
                        adaptor.addChild(root_1, (Object)adaptor.create(INT, "5"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 6 :
                    dbg.enterAlt(6);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:112:5: JUNE
                    {
                    dbg.location(112,5);
                    JUNE72=(Token)match(input,JUNE,FOLLOW_JUNE_in_relaxed_month828); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_JUNE.add(JUNE72);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 112:15: -> ^( MONTH_OF_YEAR INT[\"6\"] )
                    {
                        dbg.location(112,18);
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:112:18: ^( MONTH_OF_YEAR INT[\"6\"] )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(112,20);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(MONTH_OF_YEAR, "MONTH_OF_YEAR"), root_1);

                        dbg.location(112,34);
                        adaptor.addChild(root_1, (Object)adaptor.create(INT, "6"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 7 :
                    dbg.enterAlt(7);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:113:5: JULY
                    {
                    dbg.location(113,5);
                    JULY73=(Token)match(input,JULY,FOLLOW_JULY_in_relaxed_month848); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_JULY.add(JULY73);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 113:15: -> ^( MONTH_OF_YEAR INT[\"7\"] )
                    {
                        dbg.location(113,18);
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:113:18: ^( MONTH_OF_YEAR INT[\"7\"] )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(113,20);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(MONTH_OF_YEAR, "MONTH_OF_YEAR"), root_1);

                        dbg.location(113,34);
                        adaptor.addChild(root_1, (Object)adaptor.create(INT, "7"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 8 :
                    dbg.enterAlt(8);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:114:5: AUGUST
                    {
                    dbg.location(114,5);
                    AUGUST74=(Token)match(input,AUGUST,FOLLOW_AUGUST_in_relaxed_month868); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AUGUST.add(AUGUST74);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 114:15: -> ^( MONTH_OF_YEAR INT[\"8\"] )
                    {
                        dbg.location(114,18);
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:114:18: ^( MONTH_OF_YEAR INT[\"8\"] )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(114,20);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(MONTH_OF_YEAR, "MONTH_OF_YEAR"), root_1);

                        dbg.location(114,34);
                        adaptor.addChild(root_1, (Object)adaptor.create(INT, "8"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 9 :
                    dbg.enterAlt(9);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:115:5: SEPTEMBER
                    {
                    dbg.location(115,5);
                    SEPTEMBER75=(Token)match(input,SEPTEMBER,FOLLOW_SEPTEMBER_in_relaxed_month886); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEPTEMBER.add(SEPTEMBER75);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 115:15: -> ^( MONTH_OF_YEAR INT[\"9\"] )
                    {
                        dbg.location(115,18);
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:115:18: ^( MONTH_OF_YEAR INT[\"9\"] )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(115,20);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(MONTH_OF_YEAR, "MONTH_OF_YEAR"), root_1);

                        dbg.location(115,34);
                        adaptor.addChild(root_1, (Object)adaptor.create(INT, "9"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 10 :
                    dbg.enterAlt(10);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:116:5: OCTOBER
                    {
                    dbg.location(116,5);
                    OCTOBER76=(Token)match(input,OCTOBER,FOLLOW_OCTOBER_in_relaxed_month901); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OCTOBER.add(OCTOBER76);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 116:15: -> ^( MONTH_OF_YEAR INT[\"10\"] )
                    {
                        dbg.location(116,18);
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:116:18: ^( MONTH_OF_YEAR INT[\"10\"] )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(116,20);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(MONTH_OF_YEAR, "MONTH_OF_YEAR"), root_1);

                        dbg.location(116,34);
                        adaptor.addChild(root_1, (Object)adaptor.create(INT, "10"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 11 :
                    dbg.enterAlt(11);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:117:5: NOVEMBER
                    {
                    dbg.location(117,5);
                    NOVEMBER77=(Token)match(input,NOVEMBER,FOLLOW_NOVEMBER_in_relaxed_month918); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NOVEMBER.add(NOVEMBER77);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 117:15: -> ^( MONTH_OF_YEAR INT[\"11\"] )
                    {
                        dbg.location(117,18);
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:117:18: ^( MONTH_OF_YEAR INT[\"11\"] )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(117,20);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(MONTH_OF_YEAR, "MONTH_OF_YEAR"), root_1);

                        dbg.location(117,34);
                        adaptor.addChild(root_1, (Object)adaptor.create(INT, "11"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 12 :
                    dbg.enterAlt(12);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:118:5: DECEMBER
                    {
                    dbg.location(118,5);
                    DECEMBER78=(Token)match(input,DECEMBER,FOLLOW_DECEMBER_in_relaxed_month934); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DECEMBER.add(DECEMBER78);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 118:15: -> ^( MONTH_OF_YEAR INT[\"12\"] )
                    {
                        dbg.location(118,18);
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:118:18: ^( MONTH_OF_YEAR INT[\"12\"] )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(118,20);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(MONTH_OF_YEAR, "MONTH_OF_YEAR"), root_1);

                        dbg.location(118,34);
                        adaptor.addChild(root_1, (Object)adaptor.create(INT, "12"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(119, 3);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "relaxed_month");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "relaxed_month"

    public static class relaxed_day_of_month_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "relaxed_day_of_month"
    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:121:1: relaxed_day_of_month : ( spelled_or_int_01_to_31_optional_prefix -> ^( DAY_OF_MONTH spelled_or_int_01_to_31_optional_prefix ) | spelled_first_to_thirty_first -> ^( DAY_OF_MONTH spelled_first_to_thirty_first ) );
    public final DateParser.relaxed_day_of_month_return relaxed_day_of_month() throws RecognitionException {
        DateParser.relaxed_day_of_month_return retval = new DateParser.relaxed_day_of_month_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        DateParser.spelled_or_int_01_to_31_optional_prefix_return spelled_or_int_01_to_31_optional_prefix79 = null;

        DateParser.spelled_first_to_thirty_first_return spelled_first_to_thirty_first80 = null;


        RewriteRuleSubtreeStream stream_spelled_first_to_thirty_first=new RewriteRuleSubtreeStream(adaptor,"rule spelled_first_to_thirty_first");
        RewriteRuleSubtreeStream stream_spelled_or_int_01_to_31_optional_prefix=new RewriteRuleSubtreeStream(adaptor,"rule spelled_or_int_01_to_31_optional_prefix");
        try { dbg.enterRule(getGrammarFileName(), "relaxed_day_of_month");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(121, 1);

        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:122:3: ( spelled_or_int_01_to_31_optional_prefix -> ^( DAY_OF_MONTH spelled_or_int_01_to_31_optional_prefix ) | spelled_first_to_thirty_first -> ^( DAY_OF_MONTH spelled_first_to_thirty_first ) )
            int alt23=2;
            try { dbg.enterDecision(23);

            switch ( input.LA(1) ) {
            case INT_1_TO_5:
            case INT_6_TO_9:
            case INT_01_TO_12:
            case INT_13_TO_23:
            case INT_24_TO_31:
            case ONE:
            case TWO:
            case THREE:
            case FOUR:
            case FIVE:
            case SIX:
            case SEVEN:
            case EIGHT:
            case NINE:
            case TEN:
            case ELEVEN:
            case TWELVE:
            case THIRTEEN:
            case FOURTEEN:
            case FIFTEEN:
            case SIXTEEN:
            case SEVENTEEN:
            case EIGHTEEN:
            case NINETEEN:
                {
                alt23=1;
                }
                break;
            case TWENTY:
                {
                switch ( input.LA(2) ) {
                case WHITE_SPACE:
                    {
                    int LA23_5 = input.LA(3);

                    if ( (LA23_5==AT||(LA23_5>=OF && LA23_5<=IN)||LA23_5==INT_1_TO_5||(LA23_5>=NOON && LA23_5<=NINE)) ) {
                        alt23=1;
                    }
                    else if ( ((LA23_5>=FIRST && LA23_5<=FIFTH)||(LA23_5>=SIXTH && LA23_5<=NINTH)) ) {
                        alt23=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 23, 5, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }
                    }
                    break;
                case EOF:
                case COMMA:
                case ONE:
                case TWO:
                case THREE:
                case FOUR:
                case FIVE:
                case SIX:
                case SEVEN:
                case EIGHT:
                case NINE:
                    {
                    alt23=1;
                    }
                    break;
                case DASH:
                    {
                    int LA23_6 = input.LA(3);

                    if ( ((LA23_6>=FIRST && LA23_6<=FIFTH)||(LA23_6>=SIXTH && LA23_6<=NINTH)) ) {
                        alt23=2;
                    }
                    else if ( ((LA23_6>=ONE && LA23_6<=NINE)) ) {
                        alt23=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 23, 6, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }
                    }
                    break;
                case FIRST:
                case SECOND:
                case THIRD:
                case FOURTH:
                case FIFTH:
                case SIXTH:
                case SEVENTH:
                case EIGHTH:
                case NINTH:
                    {
                    alt23=2;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 23, 2, input);

                    dbg.recognitionException(nvae);
                    throw nvae;
                }

                }
                break;
            case THIRTY:
                {
                switch ( input.LA(2) ) {
                case DASH:
                    {
                    int LA23_7 = input.LA(3);

                    if ( (LA23_7==FIRST) ) {
                        alt23=2;
                    }
                    else if ( (LA23_7==ONE) ) {
                        alt23=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 23, 7, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }
                    }
                    break;
                case WHITE_SPACE:
                    {
                    int LA23_8 = input.LA(3);

                    if ( (LA23_8==AT||(LA23_8>=OF && LA23_8<=IN)||LA23_8==INT_1_TO_5||(LA23_8>=NOON && LA23_8<=ONE)) ) {
                        alt23=1;
                    }
                    else if ( (LA23_8==FIRST) ) {
                        alt23=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 23, 8, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }
                    }
                    break;
                case FIRST:
                    {
                    alt23=2;
                    }
                    break;
                case EOF:
                case COMMA:
                case ONE:
                    {
                    alt23=1;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 23, 3, input);

                    dbg.recognitionException(nvae);
                    throw nvae;
                }

                }
                break;
            case FIRST:
            case SECOND:
            case THIRD:
            case FOURTH:
            case FIFTH:
            case SIXTH:
            case SEVENTH:
            case EIGHTH:
            case NINTH:
            case TENTH:
            case ELEVENTH:
            case TWELFTH:
            case THIRTEENTH:
            case FOURTEENTH:
            case FIFTEENTH:
            case SIXTEENTH:
            case SEVENTEENTH:
            case EIGHTEENTH:
            case NINETEENTH:
            case TWENTIETH:
            case TWENTY_FIRST:
            case TWENTY_SECOND:
            case TWENTY_THIRD:
            case TWENTY_FOURTH:
            case TWENTY_FIFTH:
            case TWENTY_SIXTH:
            case TWENTY_SEVENTH:
            case TWENTY_EIGHTH:
            case TWENTY_NINTH:
            case THIRTIETH:
            case THIRTY_FIRST:
                {
                alt23=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(23);}

            switch (alt23) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:122:5: spelled_or_int_01_to_31_optional_prefix
                    {
                    dbg.location(122,5);
                    pushFollow(FOLLOW_spelled_or_int_01_to_31_optional_prefix_in_relaxed_day_of_month959);
                    spelled_or_int_01_to_31_optional_prefix79=spelled_or_int_01_to_31_optional_prefix();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_spelled_or_int_01_to_31_optional_prefix.add(spelled_or_int_01_to_31_optional_prefix79.getTree());


                    // AST REWRITE
                    // elements: spelled_or_int_01_to_31_optional_prefix
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 123:7: -> ^( DAY_OF_MONTH spelled_or_int_01_to_31_optional_prefix )
                    {
                        dbg.location(123,10);
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:123:10: ^( DAY_OF_MONTH spelled_or_int_01_to_31_optional_prefix )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(123,12);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DAY_OF_MONTH, "DAY_OF_MONTH"), root_1);

                        dbg.location(123,25);
                        adaptor.addChild(root_1, stream_spelled_or_int_01_to_31_optional_prefix.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:125:5: spelled_first_to_thirty_first
                    {
                    dbg.location(125,5);
                    pushFollow(FOLLOW_spelled_first_to_thirty_first_in_relaxed_day_of_month986);
                    spelled_first_to_thirty_first80=spelled_first_to_thirty_first();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_spelled_first_to_thirty_first.add(spelled_first_to_thirty_first80.getTree());


                    // AST REWRITE
                    // elements: spelled_first_to_thirty_first
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 126:7: -> ^( DAY_OF_MONTH spelled_first_to_thirty_first )
                    {
                        dbg.location(126,10);
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:126:10: ^( DAY_OF_MONTH spelled_first_to_thirty_first )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(126,12);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DAY_OF_MONTH, "DAY_OF_MONTH"), root_1);

                        dbg.location(126,25);
                        adaptor.addChild(root_1, stream_spelled_first_to_thirty_first.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(127, 3);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "relaxed_day_of_month");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "relaxed_day_of_month"

    public static class relaxed_year_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "relaxed_year"
    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:129:1: relaxed_year : ( ( SINGLE_QUOTE )? int_00_to_99_mandatory_prefix -> ^( YEAR_OF int_00_to_99_mandatory_prefix ) | int_four_digits -> ^( YEAR_OF int_four_digits ) );
    public final DateParser.relaxed_year_return relaxed_year() throws RecognitionException {
        DateParser.relaxed_year_return retval = new DateParser.relaxed_year_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SINGLE_QUOTE81=null;
        DateParser.int_00_to_99_mandatory_prefix_return int_00_to_99_mandatory_prefix82 = null;

        DateParser.int_four_digits_return int_four_digits83 = null;


        Object SINGLE_QUOTE81_tree=null;
        RewriteRuleTokenStream stream_SINGLE_QUOTE=new RewriteRuleTokenStream(adaptor,"token SINGLE_QUOTE");
        RewriteRuleSubtreeStream stream_int_four_digits=new RewriteRuleSubtreeStream(adaptor,"rule int_four_digits");
        RewriteRuleSubtreeStream stream_int_00_to_99_mandatory_prefix=new RewriteRuleSubtreeStream(adaptor,"rule int_00_to_99_mandatory_prefix");
        try { dbg.enterRule(getGrammarFileName(), "relaxed_year");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(129, 1);

        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:130:3: ( ( SINGLE_QUOTE )? int_00_to_99_mandatory_prefix -> ^( YEAR_OF int_00_to_99_mandatory_prefix ) | int_four_digits -> ^( YEAR_OF int_four_digits ) )
            int alt25=2;
            try { dbg.enterDecision(25);

            switch ( input.LA(1) ) {
            case SINGLE_QUOTE:
                {
                alt25=1;
                }
                break;
            case INT_00:
                {
                int LA25_2 = input.LA(2);

                if ( (LA25_2==EOF||LA25_2==WHITE_SPACE||LA25_2==COMMA) ) {
                    alt25=1;
                }
                else if ( (LA25_2==INT_00||(LA25_2>=INT_01_TO_12 && LA25_2<=INT_60_TO_99)) ) {
                    alt25=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 25, 2, input);

                    dbg.recognitionException(nvae);
                    throw nvae;
                }
                }
                break;
            case INT_01_TO_12:
                {
                int LA25_3 = input.LA(2);

                if ( (LA25_3==EOF||LA25_3==WHITE_SPACE||LA25_3==COMMA) ) {
                    alt25=1;
                }
                else if ( (LA25_3==INT_00||(LA25_3>=INT_01_TO_12 && LA25_3<=INT_60_TO_99)) ) {
                    alt25=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 25, 3, input);

                    dbg.recognitionException(nvae);
                    throw nvae;
                }
                }
                break;
            case INT_13_TO_23:
                {
                int LA25_4 = input.LA(2);

                if ( (LA25_4==EOF||LA25_4==WHITE_SPACE||LA25_4==COMMA) ) {
                    alt25=1;
                }
                else if ( (LA25_4==INT_00||(LA25_4>=INT_01_TO_12 && LA25_4<=INT_60_TO_99)) ) {
                    alt25=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 25, 4, input);

                    dbg.recognitionException(nvae);
                    throw nvae;
                }
                }
                break;
            case INT_24_TO_31:
                {
                int LA25_5 = input.LA(2);

                if ( (LA25_5==EOF||LA25_5==WHITE_SPACE||LA25_5==COMMA) ) {
                    alt25=1;
                }
                else if ( (LA25_5==INT_00||(LA25_5>=INT_01_TO_12 && LA25_5<=INT_60_TO_99)) ) {
                    alt25=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 25, 5, input);

                    dbg.recognitionException(nvae);
                    throw nvae;
                }
                }
                break;
            case INT_32_TO_59:
                {
                int LA25_6 = input.LA(2);

                if ( (LA25_6==EOF||LA25_6==WHITE_SPACE||LA25_6==COMMA) ) {
                    alt25=1;
                }
                else if ( (LA25_6==INT_00||(LA25_6>=INT_01_TO_12 && LA25_6<=INT_60_TO_99)) ) {
                    alt25=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 25, 6, input);

                    dbg.recognitionException(nvae);
                    throw nvae;
                }
                }
                break;
            case INT_60_TO_99:
                {
                int LA25_7 = input.LA(2);

                if ( (LA25_7==INT_00||(LA25_7>=INT_01_TO_12 && LA25_7<=INT_60_TO_99)) ) {
                    alt25=2;
                }
                else if ( (LA25_7==EOF||LA25_7==WHITE_SPACE||LA25_7==COMMA) ) {
                    alt25=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 25, 7, input);

                    dbg.recognitionException(nvae);
                    throw nvae;
                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(25);}

            switch (alt25) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:130:5: ( SINGLE_QUOTE )? int_00_to_99_mandatory_prefix
                    {
                    dbg.location(130,5);
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:130:5: ( SINGLE_QUOTE )?
                    int alt24=2;
                    try { dbg.enterSubRule(24);
                    try { dbg.enterDecision(24);

                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==SINGLE_QUOTE) ) {
                        alt24=1;
                    }
                    } finally {dbg.exitDecision(24);}

                    switch (alt24) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:130:5: SINGLE_QUOTE
                            {
                            dbg.location(130,5);
                            SINGLE_QUOTE81=(Token)match(input,SINGLE_QUOTE,FOLLOW_SINGLE_QUOTE_in_relaxed_year1016); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_SINGLE_QUOTE.add(SINGLE_QUOTE81);


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(24);}

                    dbg.location(130,19);
                    pushFollow(FOLLOW_int_00_to_99_mandatory_prefix_in_relaxed_year1019);
                    int_00_to_99_mandatory_prefix82=int_00_to_99_mandatory_prefix();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_int_00_to_99_mandatory_prefix.add(int_00_to_99_mandatory_prefix82.getTree());


                    // AST REWRITE
                    // elements: int_00_to_99_mandatory_prefix
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 131:7: -> ^( YEAR_OF int_00_to_99_mandatory_prefix )
                    {
                        dbg.location(131,10);
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:131:10: ^( YEAR_OF int_00_to_99_mandatory_prefix )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(131,12);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(YEAR_OF, "YEAR_OF"), root_1);

                        dbg.location(131,20);
                        adaptor.addChild(root_1, stream_int_00_to_99_mandatory_prefix.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:133:5: int_four_digits
                    {
                    dbg.location(133,5);
                    pushFollow(FOLLOW_int_four_digits_in_relaxed_year1046);
                    int_four_digits83=int_four_digits();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_int_four_digits.add(int_four_digits83.getTree());


                    // AST REWRITE
                    // elements: int_four_digits
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 134:7: -> ^( YEAR_OF int_four_digits )
                    {
                        dbg.location(134,10);
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:134:10: ^( YEAR_OF int_four_digits )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(134,12);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(YEAR_OF, "YEAR_OF"), root_1);

                        dbg.location(134,20);
                        adaptor.addChild(root_1, stream_int_four_digits.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(135, 3);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "relaxed_year");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "relaxed_year"

    public static class relaxed_year_prefix_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "relaxed_year_prefix"
    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:137:1: relaxed_year_prefix : ( COMMA ( WHITE_SPACE )? | WHITE_SPACE ) ( IN WHITE_SPACE THE WHITE_SPACE YEAR WHITE_SPACE )? ;
    public final DateParser.relaxed_year_prefix_return relaxed_year_prefix() throws RecognitionException {
        DateParser.relaxed_year_prefix_return retval = new DateParser.relaxed_year_prefix_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token COMMA84=null;
        Token WHITE_SPACE85=null;
        Token WHITE_SPACE86=null;
        Token IN87=null;
        Token WHITE_SPACE88=null;
        Token THE89=null;
        Token WHITE_SPACE90=null;
        Token YEAR91=null;
        Token WHITE_SPACE92=null;

        Object COMMA84_tree=null;
        Object WHITE_SPACE85_tree=null;
        Object WHITE_SPACE86_tree=null;
        Object IN87_tree=null;
        Object WHITE_SPACE88_tree=null;
        Object THE89_tree=null;
        Object WHITE_SPACE90_tree=null;
        Object YEAR91_tree=null;
        Object WHITE_SPACE92_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "relaxed_year_prefix");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(137, 1);

        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:138:3: ( ( COMMA ( WHITE_SPACE )? | WHITE_SPACE ) ( IN WHITE_SPACE THE WHITE_SPACE YEAR WHITE_SPACE )? )
            dbg.enterAlt(1);

            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:138:5: ( COMMA ( WHITE_SPACE )? | WHITE_SPACE ) ( IN WHITE_SPACE THE WHITE_SPACE YEAR WHITE_SPACE )?
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(138,5);
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:138:5: ( COMMA ( WHITE_SPACE )? | WHITE_SPACE )
            int alt27=2;
            try { dbg.enterSubRule(27);
            try { dbg.enterDecision(27);

            int LA27_0 = input.LA(1);

            if ( (LA27_0==COMMA) ) {
                alt27=1;
            }
            else if ( (LA27_0==WHITE_SPACE) ) {
                alt27=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(27);}

            switch (alt27) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:138:6: COMMA ( WHITE_SPACE )?
                    {
                    dbg.location(138,6);
                    COMMA84=(Token)match(input,COMMA,FOLLOW_COMMA_in_relaxed_year_prefix1076); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    COMMA84_tree = (Object)adaptor.create(COMMA84);
                    adaptor.addChild(root_0, COMMA84_tree);
                    }
                    dbg.location(138,12);
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:138:12: ( WHITE_SPACE )?
                    int alt26=2;
                    try { dbg.enterSubRule(26);
                    try { dbg.enterDecision(26);

                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==WHITE_SPACE) ) {
                        alt26=1;
                    }
                    } finally {dbg.exitDecision(26);}

                    switch (alt26) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:138:12: WHITE_SPACE
                            {
                            dbg.location(138,12);
                            WHITE_SPACE85=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_relaxed_year_prefix1078); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            WHITE_SPACE85_tree = (Object)adaptor.create(WHITE_SPACE85);
                            adaptor.addChild(root_0, WHITE_SPACE85_tree);
                            }

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(26);}


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:138:27: WHITE_SPACE
                    {
                    dbg.location(138,27);
                    WHITE_SPACE86=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_relaxed_year_prefix1083); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    WHITE_SPACE86_tree = (Object)adaptor.create(WHITE_SPACE86);
                    adaptor.addChild(root_0, WHITE_SPACE86_tree);
                    }

                    }
                    break;

            }
            } finally {dbg.exitSubRule(27);}

            dbg.location(138,40);
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:138:40: ( IN WHITE_SPACE THE WHITE_SPACE YEAR WHITE_SPACE )?
            int alt28=2;
            try { dbg.enterSubRule(28);
            try { dbg.enterDecision(28);

            int LA28_0 = input.LA(1);

            if ( (LA28_0==IN) ) {
                alt28=1;
            }
            } finally {dbg.exitDecision(28);}

            switch (alt28) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:138:41: IN WHITE_SPACE THE WHITE_SPACE YEAR WHITE_SPACE
                    {
                    dbg.location(138,41);
                    IN87=(Token)match(input,IN,FOLLOW_IN_in_relaxed_year_prefix1087); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IN87_tree = (Object)adaptor.create(IN87);
                    adaptor.addChild(root_0, IN87_tree);
                    }
                    dbg.location(138,44);
                    WHITE_SPACE88=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_relaxed_year_prefix1089); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    WHITE_SPACE88_tree = (Object)adaptor.create(WHITE_SPACE88);
                    adaptor.addChild(root_0, WHITE_SPACE88_tree);
                    }
                    dbg.location(138,56);
                    THE89=(Token)match(input,THE,FOLLOW_THE_in_relaxed_year_prefix1091); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    THE89_tree = (Object)adaptor.create(THE89);
                    adaptor.addChild(root_0, THE89_tree);
                    }
                    dbg.location(138,60);
                    WHITE_SPACE90=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_relaxed_year_prefix1093); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    WHITE_SPACE90_tree = (Object)adaptor.create(WHITE_SPACE90);
                    adaptor.addChild(root_0, WHITE_SPACE90_tree);
                    }
                    dbg.location(138,72);
                    YEAR91=(Token)match(input,YEAR,FOLLOW_YEAR_in_relaxed_year_prefix1095); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    YEAR91_tree = (Object)adaptor.create(YEAR91);
                    adaptor.addChild(root_0, YEAR91_tree);
                    }
                    dbg.location(138,77);
                    WHITE_SPACE92=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_relaxed_year_prefix1097); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    WHITE_SPACE92_tree = (Object)adaptor.create(WHITE_SPACE92);
                    adaptor.addChild(root_0, WHITE_SPACE92_tree);
                    }

                    }
                    break;

            }
            } finally {dbg.exitSubRule(28);}


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(139, 3);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "relaxed_year_prefix");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "relaxed_year_prefix"

    public static class formal_date_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "formal_date"
    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:143:1: formal_date : ( formal_year_four_digits formal_date_separator formal_month_of_year formal_date_separator formal_day_of_month -> ^( EXPLICIT_DATE formal_month_of_year formal_day_of_month formal_year_four_digits ) | formal_month_of_year formal_date_separator formal_day_of_month ( formal_date_separator formal_year )? -> ^( EXPLICIT_DATE formal_month_of_year formal_day_of_month ( formal_year )? ) );
    public final DateParser.formal_date_return formal_date() throws RecognitionException {
        DateParser.formal_date_return retval = new DateParser.formal_date_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        DateParser.formal_year_four_digits_return formal_year_four_digits93 = null;

        DateParser.formal_date_separator_return formal_date_separator94 = null;

        DateParser.formal_month_of_year_return formal_month_of_year95 = null;

        DateParser.formal_date_separator_return formal_date_separator96 = null;

        DateParser.formal_day_of_month_return formal_day_of_month97 = null;

        DateParser.formal_month_of_year_return formal_month_of_year98 = null;

        DateParser.formal_date_separator_return formal_date_separator99 = null;

        DateParser.formal_day_of_month_return formal_day_of_month100 = null;

        DateParser.formal_date_separator_return formal_date_separator101 = null;

        DateParser.formal_year_return formal_year102 = null;


        RewriteRuleSubtreeStream stream_formal_year=new RewriteRuleSubtreeStream(adaptor,"rule formal_year");
        RewriteRuleSubtreeStream stream_formal_day_of_month=new RewriteRuleSubtreeStream(adaptor,"rule formal_day_of_month");
        RewriteRuleSubtreeStream stream_formal_year_four_digits=new RewriteRuleSubtreeStream(adaptor,"rule formal_year_four_digits");
        RewriteRuleSubtreeStream stream_formal_date_separator=new RewriteRuleSubtreeStream(adaptor,"rule formal_date_separator");
        RewriteRuleSubtreeStream stream_formal_month_of_year=new RewriteRuleSubtreeStream(adaptor,"rule formal_month_of_year");
        try { dbg.enterRule(getGrammarFileName(), "formal_date");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(143, 1);

        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:145:3: ( formal_year_four_digits formal_date_separator formal_month_of_year formal_date_separator formal_day_of_month -> ^( EXPLICIT_DATE formal_month_of_year formal_day_of_month formal_year_four_digits ) | formal_month_of_year formal_date_separator formal_day_of_month ( formal_date_separator formal_year )? -> ^( EXPLICIT_DATE formal_month_of_year formal_day_of_month ( formal_year )? ) )
            int alt30=2;
            try { dbg.enterDecision(30);

            switch ( input.LA(1) ) {
            case INT_00:
            case INT_13_TO_23:
            case INT_24_TO_31:
            case INT_32_TO_59:
            case INT_60_TO_99:
                {
                alt30=1;
                }
                break;
            case INT_01_TO_12:
                {
                int LA30_2 = input.LA(2);

                if ( (LA30_2==INT_00||(LA30_2>=INT_01_TO_12 && LA30_2<=INT_60_TO_99)) ) {
                    alt30=1;
                }
                else if ( ((LA30_2>=DASH && LA30_2<=SLASH)) ) {
                    alt30=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 30, 2, input);

                    dbg.recognitionException(nvae);
                    throw nvae;
                }
                }
                break;
            case INT_1_TO_5:
            case INT_6_TO_9:
                {
                alt30=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(30);}

            switch (alt30) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:145:5: formal_year_four_digits formal_date_separator formal_month_of_year formal_date_separator formal_day_of_month
                    {
                    dbg.location(145,5);
                    pushFollow(FOLLOW_formal_year_four_digits_in_formal_date1120);
                    formal_year_four_digits93=formal_year_four_digits();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_formal_year_four_digits.add(formal_year_four_digits93.getTree());
                    dbg.location(145,29);
                    pushFollow(FOLLOW_formal_date_separator_in_formal_date1122);
                    formal_date_separator94=formal_date_separator();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_formal_date_separator.add(formal_date_separator94.getTree());
                    dbg.location(145,51);
                    pushFollow(FOLLOW_formal_month_of_year_in_formal_date1124);
                    formal_month_of_year95=formal_month_of_year();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_formal_month_of_year.add(formal_month_of_year95.getTree());
                    dbg.location(145,72);
                    pushFollow(FOLLOW_formal_date_separator_in_formal_date1126);
                    formal_date_separator96=formal_date_separator();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_formal_date_separator.add(formal_date_separator96.getTree());
                    dbg.location(145,94);
                    pushFollow(FOLLOW_formal_day_of_month_in_formal_date1128);
                    formal_day_of_month97=formal_day_of_month();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_formal_day_of_month.add(formal_day_of_month97.getTree());


                    // AST REWRITE
                    // elements: formal_month_of_year, formal_day_of_month, formal_year_four_digits
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 146:7: -> ^( EXPLICIT_DATE formal_month_of_year formal_day_of_month formal_year_four_digits )
                    {
                        dbg.location(146,10);
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:146:10: ^( EXPLICIT_DATE formal_month_of_year formal_day_of_month formal_year_four_digits )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(146,12);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPLICIT_DATE, "EXPLICIT_DATE"), root_1);

                        dbg.location(146,26);
                        adaptor.addChild(root_1, stream_formal_month_of_year.nextTree());
                        dbg.location(146,47);
                        adaptor.addChild(root_1, stream_formal_day_of_month.nextTree());
                        dbg.location(146,67);
                        adaptor.addChild(root_1, stream_formal_year_four_digits.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:149:5: formal_month_of_year formal_date_separator formal_day_of_month ( formal_date_separator formal_year )?
                    {
                    dbg.location(149,5);
                    pushFollow(FOLLOW_formal_month_of_year_in_formal_date1157);
                    formal_month_of_year98=formal_month_of_year();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_formal_month_of_year.add(formal_month_of_year98.getTree());
                    dbg.location(149,26);
                    pushFollow(FOLLOW_formal_date_separator_in_formal_date1159);
                    formal_date_separator99=formal_date_separator();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_formal_date_separator.add(formal_date_separator99.getTree());
                    dbg.location(149,48);
                    pushFollow(FOLLOW_formal_day_of_month_in_formal_date1161);
                    formal_day_of_month100=formal_day_of_month();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_formal_day_of_month.add(formal_day_of_month100.getTree());
                    dbg.location(149,68);
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:149:68: ( formal_date_separator formal_year )?
                    int alt29=2;
                    try { dbg.enterSubRule(29);
                    try { dbg.enterDecision(29);

                    int LA29_0 = input.LA(1);

                    if ( ((LA29_0>=DASH && LA29_0<=SLASH)) ) {
                        alt29=1;
                    }
                    } finally {dbg.exitDecision(29);}

                    switch (alt29) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:149:69: formal_date_separator formal_year
                            {
                            dbg.location(149,69);
                            pushFollow(FOLLOW_formal_date_separator_in_formal_date1164);
                            formal_date_separator101=formal_date_separator();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_formal_date_separator.add(formal_date_separator101.getTree());
                            dbg.location(149,91);
                            pushFollow(FOLLOW_formal_year_in_formal_date1166);
                            formal_year102=formal_year();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_formal_year.add(formal_year102.getTree());

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(29);}



                    // AST REWRITE
                    // elements: formal_day_of_month, formal_month_of_year, formal_year
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 150:7: -> ^( EXPLICIT_DATE formal_month_of_year formal_day_of_month ( formal_year )? )
                    {
                        dbg.location(150,10);
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:150:10: ^( EXPLICIT_DATE formal_month_of_year formal_day_of_month ( formal_year )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(150,12);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPLICIT_DATE, "EXPLICIT_DATE"), root_1);

                        dbg.location(150,26);
                        adaptor.addChild(root_1, stream_formal_month_of_year.nextTree());
                        dbg.location(150,47);
                        adaptor.addChild(root_1, stream_formal_day_of_month.nextTree());
                        dbg.location(150,67);
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:150:67: ( formal_year )?
                        if ( stream_formal_year.hasNext() ) {
                            dbg.location(150,67);
                            adaptor.addChild(root_1, stream_formal_year.nextTree());

                        }
                        stream_formal_year.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(151, 3);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "formal_date");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "formal_date"

    public static class formal_month_of_year_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "formal_month_of_year"
    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:153:1: formal_month_of_year : int_01_to_12_optional_prefix -> ^( MONTH_OF_YEAR int_01_to_12_optional_prefix ) ;
    public final DateParser.formal_month_of_year_return formal_month_of_year() throws RecognitionException {
        DateParser.formal_month_of_year_return retval = new DateParser.formal_month_of_year_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        DateParser.int_01_to_12_optional_prefix_return int_01_to_12_optional_prefix103 = null;


        RewriteRuleSubtreeStream stream_int_01_to_12_optional_prefix=new RewriteRuleSubtreeStream(adaptor,"rule int_01_to_12_optional_prefix");
        try { dbg.enterRule(getGrammarFileName(), "formal_month_of_year");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(153, 1);

        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:154:3: ( int_01_to_12_optional_prefix -> ^( MONTH_OF_YEAR int_01_to_12_optional_prefix ) )
            dbg.enterAlt(1);

            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:154:5: int_01_to_12_optional_prefix
            {
            dbg.location(154,5);
            pushFollow(FOLLOW_int_01_to_12_optional_prefix_in_formal_month_of_year1200);
            int_01_to_12_optional_prefix103=int_01_to_12_optional_prefix();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_int_01_to_12_optional_prefix.add(int_01_to_12_optional_prefix103.getTree());


            // AST REWRITE
            // elements: int_01_to_12_optional_prefix
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 154:34: -> ^( MONTH_OF_YEAR int_01_to_12_optional_prefix )
            {
                dbg.location(154,37);
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:154:37: ^( MONTH_OF_YEAR int_01_to_12_optional_prefix )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(154,39);
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(MONTH_OF_YEAR, "MONTH_OF_YEAR"), root_1);

                dbg.location(154,53);
                adaptor.addChild(root_1, stream_int_01_to_12_optional_prefix.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(155, 3);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "formal_month_of_year");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "formal_month_of_year"

    public static class formal_day_of_month_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "formal_day_of_month"
    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:157:1: formal_day_of_month : int_01_to_31_optional_prefix -> ^( DAY_OF_MONTH int_01_to_31_optional_prefix ) ;
    public final DateParser.formal_day_of_month_return formal_day_of_month() throws RecognitionException {
        DateParser.formal_day_of_month_return retval = new DateParser.formal_day_of_month_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        DateParser.int_01_to_31_optional_prefix_return int_01_to_31_optional_prefix104 = null;


        RewriteRuleSubtreeStream stream_int_01_to_31_optional_prefix=new RewriteRuleSubtreeStream(adaptor,"rule int_01_to_31_optional_prefix");
        try { dbg.enterRule(getGrammarFileName(), "formal_day_of_month");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(157, 1);

        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:158:3: ( int_01_to_31_optional_prefix -> ^( DAY_OF_MONTH int_01_to_31_optional_prefix ) )
            dbg.enterAlt(1);

            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:158:5: int_01_to_31_optional_prefix
            {
            dbg.location(158,5);
            pushFollow(FOLLOW_int_01_to_31_optional_prefix_in_formal_day_of_month1223);
            int_01_to_31_optional_prefix104=int_01_to_31_optional_prefix();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_int_01_to_31_optional_prefix.add(int_01_to_31_optional_prefix104.getTree());


            // AST REWRITE
            // elements: int_01_to_31_optional_prefix
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 158:34: -> ^( DAY_OF_MONTH int_01_to_31_optional_prefix )
            {
                dbg.location(158,37);
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:158:37: ^( DAY_OF_MONTH int_01_to_31_optional_prefix )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(158,39);
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DAY_OF_MONTH, "DAY_OF_MONTH"), root_1);

                dbg.location(158,52);
                adaptor.addChild(root_1, stream_int_01_to_31_optional_prefix.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(159, 3);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "formal_day_of_month");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "formal_day_of_month"

    public static class formal_year_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "formal_year"
    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:161:1: formal_year : ( formal_year_four_digits | int_00_to_99_mandatory_prefix -> ^( YEAR_OF int_00_to_99_mandatory_prefix ) );
    public final DateParser.formal_year_return formal_year() throws RecognitionException {
        DateParser.formal_year_return retval = new DateParser.formal_year_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        DateParser.formal_year_four_digits_return formal_year_four_digits105 = null;

        DateParser.int_00_to_99_mandatory_prefix_return int_00_to_99_mandatory_prefix106 = null;


        RewriteRuleSubtreeStream stream_int_00_to_99_mandatory_prefix=new RewriteRuleSubtreeStream(adaptor,"rule int_00_to_99_mandatory_prefix");
        try { dbg.enterRule(getGrammarFileName(), "formal_year");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(161, 1);

        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:162:3: ( formal_year_four_digits | int_00_to_99_mandatory_prefix -> ^( YEAR_OF int_00_to_99_mandatory_prefix ) )
            int alt31=2;
            try { dbg.enterDecision(31);

            switch ( input.LA(1) ) {
            case INT_00:
                {
                int LA31_1 = input.LA(2);

                if ( (LA31_1==INT_00||(LA31_1>=INT_01_TO_12 && LA31_1<=INT_60_TO_99)) ) {
                    alt31=1;
                }
                else if ( (LA31_1==EOF||LA31_1==WHITE_SPACE||LA31_1==COMMA) ) {
                    alt31=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 31, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;
                }
                }
                break;
            case INT_01_TO_12:
                {
                int LA31_2 = input.LA(2);

                if ( (LA31_2==INT_00||(LA31_2>=INT_01_TO_12 && LA31_2<=INT_60_TO_99)) ) {
                    alt31=1;
                }
                else if ( (LA31_2==EOF||LA31_2==WHITE_SPACE||LA31_2==COMMA) ) {
                    alt31=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 31, 2, input);

                    dbg.recognitionException(nvae);
                    throw nvae;
                }
                }
                break;
            case INT_13_TO_23:
                {
                int LA31_3 = input.LA(2);

                if ( (LA31_3==EOF||LA31_3==WHITE_SPACE||LA31_3==COMMA) ) {
                    alt31=2;
                }
                else if ( (LA31_3==INT_00||(LA31_3>=INT_01_TO_12 && LA31_3<=INT_60_TO_99)) ) {
                    alt31=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 31, 3, input);

                    dbg.recognitionException(nvae);
                    throw nvae;
                }
                }
                break;
            case INT_24_TO_31:
                {
                int LA31_4 = input.LA(2);

                if ( (LA31_4==EOF||LA31_4==WHITE_SPACE||LA31_4==COMMA) ) {
                    alt31=2;
                }
                else if ( (LA31_4==INT_00||(LA31_4>=INT_01_TO_12 && LA31_4<=INT_60_TO_99)) ) {
                    alt31=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 31, 4, input);

                    dbg.recognitionException(nvae);
                    throw nvae;
                }
                }
                break;
            case INT_32_TO_59:
                {
                int LA31_5 = input.LA(2);

                if ( (LA31_5==INT_00||(LA31_5>=INT_01_TO_12 && LA31_5<=INT_60_TO_99)) ) {
                    alt31=1;
                }
                else if ( (LA31_5==EOF||LA31_5==WHITE_SPACE||LA31_5==COMMA) ) {
                    alt31=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 31, 5, input);

                    dbg.recognitionException(nvae);
                    throw nvae;
                }
                }
                break;
            case INT_60_TO_99:
                {
                int LA31_6 = input.LA(2);

                if ( (LA31_6==EOF||LA31_6==WHITE_SPACE||LA31_6==COMMA) ) {
                    alt31=2;
                }
                else if ( (LA31_6==INT_00||(LA31_6>=INT_01_TO_12 && LA31_6<=INT_60_TO_99)) ) {
                    alt31=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 31, 6, input);

                    dbg.recognitionException(nvae);
                    throw nvae;
                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(31);}

            switch (alt31) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:162:5: formal_year_four_digits
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(162,5);
                    pushFollow(FOLLOW_formal_year_four_digits_in_formal_year1246);
                    formal_year_four_digits105=formal_year_four_digits();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, formal_year_four_digits105.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:163:5: int_00_to_99_mandatory_prefix
                    {
                    dbg.location(163,5);
                    pushFollow(FOLLOW_int_00_to_99_mandatory_prefix_in_formal_year1252);
                    int_00_to_99_mandatory_prefix106=int_00_to_99_mandatory_prefix();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_int_00_to_99_mandatory_prefix.add(int_00_to_99_mandatory_prefix106.getTree());


                    // AST REWRITE
                    // elements: int_00_to_99_mandatory_prefix
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 163:35: -> ^( YEAR_OF int_00_to_99_mandatory_prefix )
                    {
                        dbg.location(163,38);
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:163:38: ^( YEAR_OF int_00_to_99_mandatory_prefix )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(163,40);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(YEAR_OF, "YEAR_OF"), root_1);

                        dbg.location(163,48);
                        adaptor.addChild(root_1, stream_int_00_to_99_mandatory_prefix.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(164, 3);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "formal_year");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "formal_year"

    public static class formal_year_four_digits_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "formal_year_four_digits"
    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:166:1: formal_year_four_digits : int_four_digits -> ^( YEAR_OF int_four_digits ) ;
    public final DateParser.formal_year_four_digits_return formal_year_four_digits() throws RecognitionException {
        DateParser.formal_year_four_digits_return retval = new DateParser.formal_year_four_digits_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        DateParser.int_four_digits_return int_four_digits107 = null;


        RewriteRuleSubtreeStream stream_int_four_digits=new RewriteRuleSubtreeStream(adaptor,"rule int_four_digits");
        try { dbg.enterRule(getGrammarFileName(), "formal_year_four_digits");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(166, 1);

        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:167:3: ( int_four_digits -> ^( YEAR_OF int_four_digits ) )
            dbg.enterAlt(1);

            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:167:5: int_four_digits
            {
            dbg.location(167,5);
            pushFollow(FOLLOW_int_four_digits_in_formal_year_four_digits1275);
            int_four_digits107=int_four_digits();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_int_four_digits.add(int_four_digits107.getTree());


            // AST REWRITE
            // elements: int_four_digits
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 167:21: -> ^( YEAR_OF int_four_digits )
            {
                dbg.location(167,24);
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:167:24: ^( YEAR_OF int_four_digits )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(167,26);
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(YEAR_OF, "YEAR_OF"), root_1);

                dbg.location(167,34);
                adaptor.addChild(root_1, stream_int_four_digits.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(168, 3);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "formal_year_four_digits");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "formal_year_four_digits"

    public static class formal_date_separator_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "formal_date_separator"
    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:170:1: formal_date_separator : ( DASH | SLASH );
    public final DateParser.formal_date_separator_return formal_date_separator() throws RecognitionException {
        DateParser.formal_date_separator_return retval = new DateParser.formal_date_separator_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set108=null;

        Object set108_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "formal_date_separator");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(170, 1);

        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:171:3: ( DASH | SLASH )
            dbg.enterAlt(1);

            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(171,3);
            set108=(Token)input.LT(1);
            if ( (input.LA(1)>=DASH && input.LA(1)<=SLASH) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set108));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(173, 3);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "formal_date_separator");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "formal_date_separator"

    public static class relative_date_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "relative_date"
    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:177:1: relative_date : ( relative_prefix WHITE_SPACE ( relative_target )? -> ^( RELATIVE_DATE ^( SEEK relative_prefix relative_target ) ) | implicit_prefix WHITE_SPACE relative_target -> ^( RELATIVE_DATE ^( SEEK implicit_prefix relative_target ) ) | relative_target -> ^( RELATIVE_DATE ^( SEEK DIRECTION[\">\"] SEEK_BY[\"by_day\"] INT[\"0\"] relative_target ) ) | spelled_or_int_01_to_31_optional_prefix WHITE_SPACE relative_target WHITE_SPACE relative_suffix -> ^( RELATIVE_DATE ^( SEEK relative_suffix spelled_or_int_01_to_31_optional_prefix relative_target ) ) | ( THE WHITE_SPACE )? relative_occurrence_index WHITE_SPACE day_of_week WHITE_SPACE IN WHITE_SPACE relaxed_month -> ^( RELATIVE_DATE ^( WEEK_INDEX relative_occurrence_index day_of_week relaxed_month ) ) | named_relative_date );
    public final DateParser.relative_date_return relative_date() throws RecognitionException {
        DateParser.relative_date_return retval = new DateParser.relative_date_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token WHITE_SPACE110=null;
        Token WHITE_SPACE113=null;
        Token WHITE_SPACE117=null;
        Token WHITE_SPACE119=null;
        Token THE121=null;
        Token WHITE_SPACE122=null;
        Token WHITE_SPACE124=null;
        Token WHITE_SPACE126=null;
        Token IN127=null;
        Token WHITE_SPACE128=null;
        DateParser.relative_prefix_return relative_prefix109 = null;

        DateParser.relative_target_return relative_target111 = null;

        DateParser.implicit_prefix_return implicit_prefix112 = null;

        DateParser.relative_target_return relative_target114 = null;

        DateParser.relative_target_return relative_target115 = null;

        DateParser.spelled_or_int_01_to_31_optional_prefix_return spelled_or_int_01_to_31_optional_prefix116 = null;

        DateParser.relative_target_return relative_target118 = null;

        DateParser.relative_suffix_return relative_suffix120 = null;

        DateParser.relative_occurrence_index_return relative_occurrence_index123 = null;

        DateParser.day_of_week_return day_of_week125 = null;

        DateParser.relaxed_month_return relaxed_month129 = null;

        DateParser.named_relative_date_return named_relative_date130 = null;


        Object WHITE_SPACE110_tree=null;
        Object WHITE_SPACE113_tree=null;
        Object WHITE_SPACE117_tree=null;
        Object WHITE_SPACE119_tree=null;
        Object THE121_tree=null;
        Object WHITE_SPACE122_tree=null;
        Object WHITE_SPACE124_tree=null;
        Object WHITE_SPACE126_tree=null;
        Object IN127_tree=null;
        Object WHITE_SPACE128_tree=null;
        RewriteRuleTokenStream stream_IN=new RewriteRuleTokenStream(adaptor,"token IN");
        RewriteRuleTokenStream stream_THE=new RewriteRuleTokenStream(adaptor,"token THE");
        RewriteRuleTokenStream stream_WHITE_SPACE=new RewriteRuleTokenStream(adaptor,"token WHITE_SPACE");
        RewriteRuleSubtreeStream stream_relative_suffix=new RewriteRuleSubtreeStream(adaptor,"rule relative_suffix");
        RewriteRuleSubtreeStream stream_implicit_prefix=new RewriteRuleSubtreeStream(adaptor,"rule implicit_prefix");
        RewriteRuleSubtreeStream stream_relative_prefix=new RewriteRuleSubtreeStream(adaptor,"rule relative_prefix");
        RewriteRuleSubtreeStream stream_day_of_week=new RewriteRuleSubtreeStream(adaptor,"rule day_of_week");
        RewriteRuleSubtreeStream stream_relaxed_month=new RewriteRuleSubtreeStream(adaptor,"rule relaxed_month");
        RewriteRuleSubtreeStream stream_spelled_or_int_01_to_31_optional_prefix=new RewriteRuleSubtreeStream(adaptor,"rule spelled_or_int_01_to_31_optional_prefix");
        RewriteRuleSubtreeStream stream_relative_occurrence_index=new RewriteRuleSubtreeStream(adaptor,"rule relative_occurrence_index");
        RewriteRuleSubtreeStream stream_relative_target=new RewriteRuleSubtreeStream(adaptor,"rule relative_target");
        try { dbg.enterRule(getGrammarFileName(), "relative_date");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(177, 1);

        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:178:3: ( relative_prefix WHITE_SPACE ( relative_target )? -> ^( RELATIVE_DATE ^( SEEK relative_prefix relative_target ) ) | implicit_prefix WHITE_SPACE relative_target -> ^( RELATIVE_DATE ^( SEEK implicit_prefix relative_target ) ) | relative_target -> ^( RELATIVE_DATE ^( SEEK DIRECTION[\">\"] SEEK_BY[\"by_day\"] INT[\"0\"] relative_target ) ) | spelled_or_int_01_to_31_optional_prefix WHITE_SPACE relative_target WHITE_SPACE relative_suffix -> ^( RELATIVE_DATE ^( SEEK relative_suffix spelled_or_int_01_to_31_optional_prefix relative_target ) ) | ( THE WHITE_SPACE )? relative_occurrence_index WHITE_SPACE day_of_week WHITE_SPACE IN WHITE_SPACE relaxed_month -> ^( RELATIVE_DATE ^( WEEK_INDEX relative_occurrence_index day_of_week relaxed_month ) ) | named_relative_date )
            int alt34=6;
            try { dbg.enterDecision(34);

            try {
                isCyclicDecision = true;
                alt34 = dfa34.predict(input);
            }
            catch (NoViableAltException nvae) {
                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(34);}

            switch (alt34) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:178:5: relative_prefix WHITE_SPACE ( relative_target )?
                    {
                    dbg.location(178,5);
                    pushFollow(FOLLOW_relative_prefix_in_relative_date1324);
                    relative_prefix109=relative_prefix();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_relative_prefix.add(relative_prefix109.getTree());
                    dbg.location(178,21);
                    WHITE_SPACE110=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_relative_date1326); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE110);

                    dbg.location(178,33);
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:178:33: ( relative_target )?
                    int alt32=2;
                    try { dbg.enterSubRule(32);
                    try { dbg.enterDecision(32);

                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==DAY||(LA32_0>=JANUARY && LA32_0<=DECEMBER)||LA32_0==YEAR||(LA32_0>=WEEK && LA32_0<=SATURDAY)) ) {
                        alt32=1;
                    }
                    } finally {dbg.exitDecision(32);}

                    switch (alt32) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:178:33: relative_target
                            {
                            dbg.location(178,33);
                            pushFollow(FOLLOW_relative_target_in_relative_date1328);
                            relative_target111=relative_target();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_relative_target.add(relative_target111.getTree());

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(32);}



                    // AST REWRITE
                    // elements: relative_target, relative_prefix
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 179:7: -> ^( RELATIVE_DATE ^( SEEK relative_prefix relative_target ) )
                    {
                        dbg.location(179,10);
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:179:10: ^( RELATIVE_DATE ^( SEEK relative_prefix relative_target ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(179,12);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(RELATIVE_DATE, "RELATIVE_DATE"), root_1);

                        dbg.location(179,26);
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:179:26: ^( SEEK relative_prefix relative_target )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        dbg.location(179,28);
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(SEEK, "SEEK"), root_2);

                        dbg.location(179,33);
                        adaptor.addChild(root_2, stream_relative_prefix.nextTree());
                        dbg.location(179,49);
                        adaptor.addChild(root_2, stream_relative_target.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:181:5: implicit_prefix WHITE_SPACE relative_target
                    {
                    dbg.location(181,5);
                    pushFollow(FOLLOW_implicit_prefix_in_relative_date1362);
                    implicit_prefix112=implicit_prefix();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_implicit_prefix.add(implicit_prefix112.getTree());
                    dbg.location(181,21);
                    WHITE_SPACE113=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_relative_date1364); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE113);

                    dbg.location(181,33);
                    pushFollow(FOLLOW_relative_target_in_relative_date1366);
                    relative_target114=relative_target();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_relative_target.add(relative_target114.getTree());


                    // AST REWRITE
                    // elements: relative_target, implicit_prefix
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 182:7: -> ^( RELATIVE_DATE ^( SEEK implicit_prefix relative_target ) )
                    {
                        dbg.location(182,10);
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:182:10: ^( RELATIVE_DATE ^( SEEK implicit_prefix relative_target ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(182,12);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(RELATIVE_DATE, "RELATIVE_DATE"), root_1);

                        dbg.location(182,26);
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:182:26: ^( SEEK implicit_prefix relative_target )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        dbg.location(182,28);
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(SEEK, "SEEK"), root_2);

                        dbg.location(182,33);
                        adaptor.addChild(root_2, stream_implicit_prefix.nextTree());
                        dbg.location(182,49);
                        adaptor.addChild(root_2, stream_relative_target.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:186:5: relative_target
                    {
                    dbg.location(186,5);
                    pushFollow(FOLLOW_relative_target_in_relative_date1406);
                    relative_target115=relative_target();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_relative_target.add(relative_target115.getTree());


                    // AST REWRITE
                    // elements: relative_target
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 187:7: -> ^( RELATIVE_DATE ^( SEEK DIRECTION[\">\"] SEEK_BY[\"by_day\"] INT[\"0\"] relative_target ) )
                    {
                        dbg.location(187,10);
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:187:10: ^( RELATIVE_DATE ^( SEEK DIRECTION[\">\"] SEEK_BY[\"by_day\"] INT[\"0\"] relative_target ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(187,12);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(RELATIVE_DATE, "RELATIVE_DATE"), root_1);

                        dbg.location(187,26);
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:187:26: ^( SEEK DIRECTION[\">\"] SEEK_BY[\"by_day\"] INT[\"0\"] relative_target )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        dbg.location(187,28);
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(SEEK, "SEEK"), root_2);

                        dbg.location(187,33);
                        adaptor.addChild(root_2, (Object)adaptor.create(DIRECTION, ">"));
                        dbg.location(187,48);
                        adaptor.addChild(root_2, (Object)adaptor.create(SEEK_BY, "by_day"));
                        dbg.location(187,66);
                        adaptor.addChild(root_2, (Object)adaptor.create(INT, "0"));
                        dbg.location(187,75);
                        adaptor.addChild(root_2, stream_relative_target.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:189:5: spelled_or_int_01_to_31_optional_prefix WHITE_SPACE relative_target WHITE_SPACE relative_suffix
                    {
                    dbg.location(189,5);
                    pushFollow(FOLLOW_spelled_or_int_01_to_31_optional_prefix_in_relative_date1446);
                    spelled_or_int_01_to_31_optional_prefix116=spelled_or_int_01_to_31_optional_prefix();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_spelled_or_int_01_to_31_optional_prefix.add(spelled_or_int_01_to_31_optional_prefix116.getTree());
                    dbg.location(189,45);
                    WHITE_SPACE117=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_relative_date1448); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE117);

                    dbg.location(189,57);
                    pushFollow(FOLLOW_relative_target_in_relative_date1450);
                    relative_target118=relative_target();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_relative_target.add(relative_target118.getTree());
                    dbg.location(189,73);
                    WHITE_SPACE119=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_relative_date1452); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE119);

                    dbg.location(189,85);
                    pushFollow(FOLLOW_relative_suffix_in_relative_date1454);
                    relative_suffix120=relative_suffix();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_relative_suffix.add(relative_suffix120.getTree());


                    // AST REWRITE
                    // elements: relative_target, spelled_or_int_01_to_31_optional_prefix, relative_suffix
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 190:7: -> ^( RELATIVE_DATE ^( SEEK relative_suffix spelled_or_int_01_to_31_optional_prefix relative_target ) )
                    {
                        dbg.location(190,10);
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:190:10: ^( RELATIVE_DATE ^( SEEK relative_suffix spelled_or_int_01_to_31_optional_prefix relative_target ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(190,12);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(RELATIVE_DATE, "RELATIVE_DATE"), root_1);

                        dbg.location(190,26);
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:190:26: ^( SEEK relative_suffix spelled_or_int_01_to_31_optional_prefix relative_target )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        dbg.location(190,28);
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(SEEK, "SEEK"), root_2);

                        dbg.location(190,33);
                        adaptor.addChild(root_2, stream_relative_suffix.nextTree());
                        dbg.location(190,49);
                        adaptor.addChild(root_2, stream_spelled_or_int_01_to_31_optional_prefix.nextTree());
                        dbg.location(190,89);
                        adaptor.addChild(root_2, stream_relative_target.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:193:5: ( THE WHITE_SPACE )? relative_occurrence_index WHITE_SPACE day_of_week WHITE_SPACE IN WHITE_SPACE relaxed_month
                    {
                    dbg.location(193,5);
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:193:5: ( THE WHITE_SPACE )?
                    int alt33=2;
                    try { dbg.enterSubRule(33);
                    try { dbg.enterDecision(33);

                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==THE) ) {
                        alt33=1;
                    }
                    } finally {dbg.exitDecision(33);}

                    switch (alt33) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:193:6: THE WHITE_SPACE
                            {
                            dbg.location(193,6);
                            THE121=(Token)match(input,THE,FOLLOW_THE_in_relative_date1494); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_THE.add(THE121);

                            dbg.location(193,10);
                            WHITE_SPACE122=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_relative_date1496); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE122);


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(33);}

                    dbg.location(193,24);
                    pushFollow(FOLLOW_relative_occurrence_index_in_relative_date1500);
                    relative_occurrence_index123=relative_occurrence_index();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_relative_occurrence_index.add(relative_occurrence_index123.getTree());
                    dbg.location(193,50);
                    WHITE_SPACE124=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_relative_date1502); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE124);

                    dbg.location(193,62);
                    pushFollow(FOLLOW_day_of_week_in_relative_date1504);
                    day_of_week125=day_of_week();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_day_of_week.add(day_of_week125.getTree());
                    dbg.location(193,74);
                    WHITE_SPACE126=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_relative_date1506); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE126);

                    dbg.location(193,86);
                    IN127=(Token)match(input,IN,FOLLOW_IN_in_relative_date1508); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IN.add(IN127);

                    dbg.location(193,89);
                    WHITE_SPACE128=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_relative_date1510); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE128);

                    dbg.location(193,101);
                    pushFollow(FOLLOW_relaxed_month_in_relative_date1512);
                    relaxed_month129=relaxed_month();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_relaxed_month.add(relaxed_month129.getTree());


                    // AST REWRITE
                    // elements: relative_occurrence_index, relaxed_month, day_of_week
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 194:7: -> ^( RELATIVE_DATE ^( WEEK_INDEX relative_occurrence_index day_of_week relaxed_month ) )
                    {
                        dbg.location(194,10);
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:194:10: ^( RELATIVE_DATE ^( WEEK_INDEX relative_occurrence_index day_of_week relaxed_month ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(194,12);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(RELATIVE_DATE, "RELATIVE_DATE"), root_1);

                        dbg.location(194,26);
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:194:26: ^( WEEK_INDEX relative_occurrence_index day_of_week relaxed_month )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        dbg.location(194,28);
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(WEEK_INDEX, "WEEK_INDEX"), root_2);

                        dbg.location(194,39);
                        adaptor.addChild(root_2, stream_relative_occurrence_index.nextTree());
                        dbg.location(194,65);
                        adaptor.addChild(root_2, stream_day_of_week.nextTree());
                        dbg.location(194,77);
                        adaptor.addChild(root_2, stream_relaxed_month.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 6 :
                    dbg.enterAlt(6);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:196:5: named_relative_date
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(196,5);
                    pushFollow(FOLLOW_named_relative_date_in_relative_date1547);
                    named_relative_date130=named_relative_date();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, named_relative_date130.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(197, 3);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "relative_date");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "relative_date"

    public static class relative_occurrence_index_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "relative_occurrence_index"
    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:199:1: relative_occurrence_index : ( INT_1_TO_5 -> INT[$INT_1_TO_5.text] | FIRST -> INT[\"1\"] | SECOND -> INT[\"2\"] | THIRD -> INT[\"3\"] | FOURTH -> INT[\"4\"] | FIFTH -> INT[\"5\"] | LAST -> INT[\"5\"] );
    public final DateParser.relative_occurrence_index_return relative_occurrence_index() throws RecognitionException {
        DateParser.relative_occurrence_index_return retval = new DateParser.relative_occurrence_index_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token INT_1_TO_5131=null;
        Token FIRST132=null;
        Token SECOND133=null;
        Token THIRD134=null;
        Token FOURTH135=null;
        Token FIFTH136=null;
        Token LAST137=null;

        Object INT_1_TO_5131_tree=null;
        Object FIRST132_tree=null;
        Object SECOND133_tree=null;
        Object THIRD134_tree=null;
        Object FOURTH135_tree=null;
        Object FIFTH136_tree=null;
        Object LAST137_tree=null;
        RewriteRuleTokenStream stream_FIFTH=new RewriteRuleTokenStream(adaptor,"token FIFTH");
        RewriteRuleTokenStream stream_THIRD=new RewriteRuleTokenStream(adaptor,"token THIRD");
        RewriteRuleTokenStream stream_FOURTH=new RewriteRuleTokenStream(adaptor,"token FOURTH");
        RewriteRuleTokenStream stream_SECOND=new RewriteRuleTokenStream(adaptor,"token SECOND");
        RewriteRuleTokenStream stream_LAST=new RewriteRuleTokenStream(adaptor,"token LAST");
        RewriteRuleTokenStream stream_INT_1_TO_5=new RewriteRuleTokenStream(adaptor,"token INT_1_TO_5");
        RewriteRuleTokenStream stream_FIRST=new RewriteRuleTokenStream(adaptor,"token FIRST");

        try { dbg.enterRule(getGrammarFileName(), "relative_occurrence_index");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(199, 1);

        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:200:3: ( INT_1_TO_5 -> INT[$INT_1_TO_5.text] | FIRST -> INT[\"1\"] | SECOND -> INT[\"2\"] | THIRD -> INT[\"3\"] | FOURTH -> INT[\"4\"] | FIFTH -> INT[\"5\"] | LAST -> INT[\"5\"] )
            int alt35=7;
            try { dbg.enterDecision(35);

            switch ( input.LA(1) ) {
            case INT_1_TO_5:
                {
                alt35=1;
                }
                break;
            case FIRST:
                {
                alt35=2;
                }
                break;
            case SECOND:
                {
                alt35=3;
                }
                break;
            case THIRD:
                {
                alt35=4;
                }
                break;
            case FOURTH:
                {
                alt35=5;
                }
                break;
            case FIFTH:
                {
                alt35=6;
                }
                break;
            case LAST:
                {
                alt35=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(35);}

            switch (alt35) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:200:5: INT_1_TO_5
                    {
                    dbg.location(200,5);
                    INT_1_TO_5131=(Token)match(input,INT_1_TO_5,FOLLOW_INT_1_TO_5_in_relative_occurrence_index1563); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INT_1_TO_5.add(INT_1_TO_5131);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 200:16: -> INT[$INT_1_TO_5.text]
                    {
                        dbg.location(200,19);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, (INT_1_TO_5131!=null?INT_1_TO_5131.getText():null)));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:201:5: FIRST
                    {
                    dbg.location(201,5);
                    FIRST132=(Token)match(input,FIRST,FOLLOW_FIRST_in_relative_occurrence_index1574); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FIRST.add(FIRST132);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 201:16: -> INT[\"1\"]
                    {
                        dbg.location(201,19);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "1"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:202:5: SECOND
                    {
                    dbg.location(202,5);
                    SECOND133=(Token)match(input,SECOND,FOLLOW_SECOND_in_relative_occurrence_index1590); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SECOND.add(SECOND133);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 202:16: -> INT[\"2\"]
                    {
                        dbg.location(202,19);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "2"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:203:5: THIRD
                    {
                    dbg.location(203,5);
                    THIRD134=(Token)match(input,THIRD,FOLLOW_THIRD_in_relative_occurrence_index1605); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THIRD.add(THIRD134);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 203:16: -> INT[\"3\"]
                    {
                        dbg.location(203,19);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "3"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:204:5: FOURTH
                    {
                    dbg.location(204,5);
                    FOURTH135=(Token)match(input,FOURTH,FOLLOW_FOURTH_in_relative_occurrence_index1621); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FOURTH.add(FOURTH135);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 204:16: -> INT[\"4\"]
                    {
                        dbg.location(204,19);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "4"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 6 :
                    dbg.enterAlt(6);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:205:5: FIFTH
                    {
                    dbg.location(205,5);
                    FIFTH136=(Token)match(input,FIFTH,FOLLOW_FIFTH_in_relative_occurrence_index1636); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FIFTH.add(FIFTH136);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 205:16: -> INT[\"5\"]
                    {
                        dbg.location(205,19);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "5"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 7 :
                    dbg.enterAlt(7);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:206:5: LAST
                    {
                    dbg.location(206,5);
                    LAST137=(Token)match(input,LAST,FOLLOW_LAST_in_relative_occurrence_index1652); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LAST.add(LAST137);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 206:16: -> INT[\"5\"]
                    {
                        dbg.location(206,19);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "5"));

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(207, 3);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "relative_occurrence_index");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "relative_occurrence_index"

    public static class relative_target_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "relative_target"
    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:209:1: relative_target : ( day_of_week | relaxed_month | relative_date_span );
    public final DateParser.relative_target_return relative_target() throws RecognitionException {
        DateParser.relative_target_return retval = new DateParser.relative_target_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        DateParser.day_of_week_return day_of_week138 = null;

        DateParser.relaxed_month_return relaxed_month139 = null;

        DateParser.relative_date_span_return relative_date_span140 = null;



        try { dbg.enterRule(getGrammarFileName(), "relative_target");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(209, 1);

        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:210:3: ( day_of_week | relaxed_month | relative_date_span )
            int alt36=3;
            try { dbg.enterDecision(36);

            switch ( input.LA(1) ) {
            case SUNDAY:
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
            case FRIDAY:
            case SATURDAY:
                {
                alt36=1;
                }
                break;
            case JANUARY:
            case FEBRUARY:
            case MARCH:
            case APRIL:
            case MAY:
            case JUNE:
            case JULY:
            case AUGUST:
            case SEPTEMBER:
            case OCTOBER:
            case NOVEMBER:
            case DECEMBER:
                {
                alt36=2;
                }
                break;
            case DAY:
            case YEAR:
            case WEEK:
            case MONTH:
                {
                alt36=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(36);}

            switch (alt36) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:210:5: day_of_week
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(210,5);
                    pushFollow(FOLLOW_day_of_week_in_relative_target1678);
                    day_of_week138=day_of_week();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, day_of_week138.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:211:5: relaxed_month
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(211,5);
                    pushFollow(FOLLOW_relaxed_month_in_relative_target1685);
                    relaxed_month139=relaxed_month();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, relaxed_month139.getTree());

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:212:5: relative_date_span
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(212,5);
                    pushFollow(FOLLOW_relative_date_span_in_relative_target1691);
                    relative_date_span140=relative_date_span();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, relative_date_span140.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(213, 3);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "relative_target");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "relative_target"

    public static class implicit_prefix_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "implicit_prefix"
    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:215:1: implicit_prefix : THIS -> DIRECTION[\">\"] SEEK_BY[\"by_day\"] INT[\"0\"] ;
    public final DateParser.implicit_prefix_return implicit_prefix() throws RecognitionException {
        DateParser.implicit_prefix_return retval = new DateParser.implicit_prefix_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token THIS141=null;

        Object THIS141_tree=null;
        RewriteRuleTokenStream stream_THIS=new RewriteRuleTokenStream(adaptor,"token THIS");

        try { dbg.enterRule(getGrammarFileName(), "implicit_prefix");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(215, 1);

        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:216:3: ( THIS -> DIRECTION[\">\"] SEEK_BY[\"by_day\"] INT[\"0\"] )
            dbg.enterAlt(1);

            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:216:5: THIS
            {
            dbg.location(216,5);
            THIS141=(Token)match(input,THIS,FOLLOW_THIS_in_implicit_prefix1706); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_THIS.add(THIS141);



            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 216:10: -> DIRECTION[\">\"] SEEK_BY[\"by_day\"] INT[\"0\"]
            {
                dbg.location(216,13);
                adaptor.addChild(root_0, (Object)adaptor.create(DIRECTION, ">"));
                dbg.location(216,28);
                adaptor.addChild(root_0, (Object)adaptor.create(SEEK_BY, "by_day"));
                dbg.location(216,46);
                adaptor.addChild(root_0, (Object)adaptor.create(INT, "0"));

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(217, 3);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "implicit_prefix");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "implicit_prefix"

    public static class relative_prefix_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "relative_prefix"
    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:219:1: relative_prefix : ( ( THIS WHITE_SPACE )? LAST -> DIRECTION[\"<\"] SEEK_BY[\"by_week\"] INT[\"1\"] | ( THIS WHITE_SPACE )? NEXT -> DIRECTION[\">\"] SEEK_BY[\"by_week\"] INT[\"1\"] | ( THIS WHITE_SPACE )? PAST -> DIRECTION[\"<\"] SEEK_BY[\"by_day\"] INT[\"1\"] | ( THIS WHITE_SPACE )? COMING -> DIRECTION[\">\"] SEEK_BY[\"by_day\"] INT[\"1\"] | ( THIS WHITE_SPACE )? UPCOMING -> DIRECTION[\">\"] SEEK_BY[\"by_day\"] INT[\"1\"] | ( IN WHITE_SPACE )? spelled_or_int_01_to_31_optional_prefix -> DIRECTION[\">\"] SEEK_BY[\"by_day\"] spelled_or_int_01_to_31_optional_prefix );
    public final DateParser.relative_prefix_return relative_prefix() throws RecognitionException {
        DateParser.relative_prefix_return retval = new DateParser.relative_prefix_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token THIS142=null;
        Token WHITE_SPACE143=null;
        Token LAST144=null;
        Token THIS145=null;
        Token WHITE_SPACE146=null;
        Token NEXT147=null;
        Token THIS148=null;
        Token WHITE_SPACE149=null;
        Token PAST150=null;
        Token THIS151=null;
        Token WHITE_SPACE152=null;
        Token COMING153=null;
        Token THIS154=null;
        Token WHITE_SPACE155=null;
        Token UPCOMING156=null;
        Token IN157=null;
        Token WHITE_SPACE158=null;
        DateParser.spelled_or_int_01_to_31_optional_prefix_return spelled_or_int_01_to_31_optional_prefix159 = null;


        Object THIS142_tree=null;
        Object WHITE_SPACE143_tree=null;
        Object LAST144_tree=null;
        Object THIS145_tree=null;
        Object WHITE_SPACE146_tree=null;
        Object NEXT147_tree=null;
        Object THIS148_tree=null;
        Object WHITE_SPACE149_tree=null;
        Object PAST150_tree=null;
        Object THIS151_tree=null;
        Object WHITE_SPACE152_tree=null;
        Object COMING153_tree=null;
        Object THIS154_tree=null;
        Object WHITE_SPACE155_tree=null;
        Object UPCOMING156_tree=null;
        Object IN157_tree=null;
        Object WHITE_SPACE158_tree=null;
        RewriteRuleTokenStream stream_NEXT=new RewriteRuleTokenStream(adaptor,"token NEXT");
        RewriteRuleTokenStream stream_IN=new RewriteRuleTokenStream(adaptor,"token IN");
        RewriteRuleTokenStream stream_LAST=new RewriteRuleTokenStream(adaptor,"token LAST");
        RewriteRuleTokenStream stream_UPCOMING=new RewriteRuleTokenStream(adaptor,"token UPCOMING");
        RewriteRuleTokenStream stream_WHITE_SPACE=new RewriteRuleTokenStream(adaptor,"token WHITE_SPACE");
        RewriteRuleTokenStream stream_COMING=new RewriteRuleTokenStream(adaptor,"token COMING");
        RewriteRuleTokenStream stream_PAST=new RewriteRuleTokenStream(adaptor,"token PAST");
        RewriteRuleTokenStream stream_THIS=new RewriteRuleTokenStream(adaptor,"token THIS");
        RewriteRuleSubtreeStream stream_spelled_or_int_01_to_31_optional_prefix=new RewriteRuleSubtreeStream(adaptor,"rule spelled_or_int_01_to_31_optional_prefix");
        try { dbg.enterRule(getGrammarFileName(), "relative_prefix");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(219, 1);

        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:220:3: ( ( THIS WHITE_SPACE )? LAST -> DIRECTION[\"<\"] SEEK_BY[\"by_week\"] INT[\"1\"] | ( THIS WHITE_SPACE )? NEXT -> DIRECTION[\">\"] SEEK_BY[\"by_week\"] INT[\"1\"] | ( THIS WHITE_SPACE )? PAST -> DIRECTION[\"<\"] SEEK_BY[\"by_day\"] INT[\"1\"] | ( THIS WHITE_SPACE )? COMING -> DIRECTION[\">\"] SEEK_BY[\"by_day\"] INT[\"1\"] | ( THIS WHITE_SPACE )? UPCOMING -> DIRECTION[\">\"] SEEK_BY[\"by_day\"] INT[\"1\"] | ( IN WHITE_SPACE )? spelled_or_int_01_to_31_optional_prefix -> DIRECTION[\">\"] SEEK_BY[\"by_day\"] spelled_or_int_01_to_31_optional_prefix )
            int alt43=6;
            try { dbg.enterDecision(43);

            switch ( input.LA(1) ) {
            case THIS:
                {
                int LA43_1 = input.LA(2);

                if ( (LA43_1==WHITE_SPACE) ) {
                    switch ( input.LA(3) ) {
                    case UPCOMING:
                        {
                        alt43=5;
                        }
                        break;
                    case NEXT:
                        {
                        alt43=2;
                        }
                        break;
                    case COMING:
                        {
                        alt43=4;
                        }
                        break;
                    case PAST:
                        {
                        alt43=3;
                        }
                        break;
                    case LAST:
                        {
                        alt43=1;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 43, 8, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }

                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 43, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;
                }
                }
                break;
            case LAST:
                {
                alt43=1;
                }
                break;
            case NEXT:
                {
                alt43=2;
                }
                break;
            case PAST:
                {
                alt43=3;
                }
                break;
            case COMING:
                {
                alt43=4;
                }
                break;
            case UPCOMING:
                {
                alt43=5;
                }
                break;
            case IN:
            case INT_1_TO_5:
            case INT_6_TO_9:
            case INT_01_TO_12:
            case INT_13_TO_23:
            case INT_24_TO_31:
            case ONE:
            case TWO:
            case THREE:
            case FOUR:
            case FIVE:
            case SIX:
            case SEVEN:
            case EIGHT:
            case NINE:
            case TEN:
            case ELEVEN:
            case TWELVE:
            case THIRTEEN:
            case FOURTEEN:
            case FIFTEEN:
            case SIXTEEN:
            case SEVENTEEN:
            case EIGHTEEN:
            case NINETEEN:
            case TWENTY:
            case THIRTY:
                {
                alt43=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(43);}

            switch (alt43) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:220:5: ( THIS WHITE_SPACE )? LAST
                    {
                    dbg.location(220,5);
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:220:5: ( THIS WHITE_SPACE )?
                    int alt37=2;
                    try { dbg.enterSubRule(37);
                    try { dbg.enterDecision(37);

                    int LA37_0 = input.LA(1);

                    if ( (LA37_0==THIS) ) {
                        alt37=1;
                    }
                    } finally {dbg.exitDecision(37);}

                    switch (alt37) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:220:6: THIS WHITE_SPACE
                            {
                            dbg.location(220,6);
                            THIS142=(Token)match(input,THIS,FOLLOW_THIS_in_relative_prefix1733); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_THIS.add(THIS142);

                            dbg.location(220,11);
                            WHITE_SPACE143=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_relative_prefix1735); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE143);


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(37);}

                    dbg.location(220,25);
                    LAST144=(Token)match(input,LAST,FOLLOW_LAST_in_relative_prefix1739); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LAST.add(LAST144);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 220:34: -> DIRECTION[\"<\"] SEEK_BY[\"by_week\"] INT[\"1\"]
                    {
                        dbg.location(220,37);
                        adaptor.addChild(root_0, (Object)adaptor.create(DIRECTION, "<"));
                        dbg.location(220,52);
                        adaptor.addChild(root_0, (Object)adaptor.create(SEEK_BY, "by_week"));
                        dbg.location(220,71);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "1"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:221:5: ( THIS WHITE_SPACE )? NEXT
                    {
                    dbg.location(221,5);
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:221:5: ( THIS WHITE_SPACE )?
                    int alt38=2;
                    try { dbg.enterSubRule(38);
                    try { dbg.enterDecision(38);

                    int LA38_0 = input.LA(1);

                    if ( (LA38_0==THIS) ) {
                        alt38=1;
                    }
                    } finally {dbg.exitDecision(38);}

                    switch (alt38) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:221:6: THIS WHITE_SPACE
                            {
                            dbg.location(221,6);
                            THIS145=(Token)match(input,THIS,FOLLOW_THIS_in_relative_prefix1761); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_THIS.add(THIS145);

                            dbg.location(221,11);
                            WHITE_SPACE146=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_relative_prefix1763); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE146);


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(38);}

                    dbg.location(221,25);
                    NEXT147=(Token)match(input,NEXT,FOLLOW_NEXT_in_relative_prefix1767); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NEXT.add(NEXT147);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 221:34: -> DIRECTION[\">\"] SEEK_BY[\"by_week\"] INT[\"1\"]
                    {
                        dbg.location(221,37);
                        adaptor.addChild(root_0, (Object)adaptor.create(DIRECTION, ">"));
                        dbg.location(221,52);
                        adaptor.addChild(root_0, (Object)adaptor.create(SEEK_BY, "by_week"));
                        dbg.location(221,71);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "1"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:222:5: ( THIS WHITE_SPACE )? PAST
                    {
                    dbg.location(222,5);
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:222:5: ( THIS WHITE_SPACE )?
                    int alt39=2;
                    try { dbg.enterSubRule(39);
                    try { dbg.enterDecision(39);

                    int LA39_0 = input.LA(1);

                    if ( (LA39_0==THIS) ) {
                        alt39=1;
                    }
                    } finally {dbg.exitDecision(39);}

                    switch (alt39) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:222:6: THIS WHITE_SPACE
                            {
                            dbg.location(222,6);
                            THIS148=(Token)match(input,THIS,FOLLOW_THIS_in_relative_prefix1789); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_THIS.add(THIS148);

                            dbg.location(222,11);
                            WHITE_SPACE149=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_relative_prefix1791); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE149);


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(39);}

                    dbg.location(222,25);
                    PAST150=(Token)match(input,PAST,FOLLOW_PAST_in_relative_prefix1795); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PAST.add(PAST150);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 222:34: -> DIRECTION[\"<\"] SEEK_BY[\"by_day\"] INT[\"1\"]
                    {
                        dbg.location(222,37);
                        adaptor.addChild(root_0, (Object)adaptor.create(DIRECTION, "<"));
                        dbg.location(222,52);
                        adaptor.addChild(root_0, (Object)adaptor.create(SEEK_BY, "by_day"));
                        dbg.location(222,70);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "1"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:223:5: ( THIS WHITE_SPACE )? COMING
                    {
                    dbg.location(223,5);
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:223:5: ( THIS WHITE_SPACE )?
                    int alt40=2;
                    try { dbg.enterSubRule(40);
                    try { dbg.enterDecision(40);

                    int LA40_0 = input.LA(1);

                    if ( (LA40_0==THIS) ) {
                        alt40=1;
                    }
                    } finally {dbg.exitDecision(40);}

                    switch (alt40) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:223:6: THIS WHITE_SPACE
                            {
                            dbg.location(223,6);
                            THIS151=(Token)match(input,THIS,FOLLOW_THIS_in_relative_prefix1817); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_THIS.add(THIS151);

                            dbg.location(223,11);
                            WHITE_SPACE152=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_relative_prefix1819); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE152);


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(40);}

                    dbg.location(223,25);
                    COMING153=(Token)match(input,COMING,FOLLOW_COMING_in_relative_prefix1823); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COMING.add(COMING153);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 223:34: -> DIRECTION[\">\"] SEEK_BY[\"by_day\"] INT[\"1\"]
                    {
                        dbg.location(223,37);
                        adaptor.addChild(root_0, (Object)adaptor.create(DIRECTION, ">"));
                        dbg.location(223,52);
                        adaptor.addChild(root_0, (Object)adaptor.create(SEEK_BY, "by_day"));
                        dbg.location(223,70);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "1"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:224:5: ( THIS WHITE_SPACE )? UPCOMING
                    {
                    dbg.location(224,5);
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:224:5: ( THIS WHITE_SPACE )?
                    int alt41=2;
                    try { dbg.enterSubRule(41);
                    try { dbg.enterDecision(41);

                    int LA41_0 = input.LA(1);

                    if ( (LA41_0==THIS) ) {
                        alt41=1;
                    }
                    } finally {dbg.exitDecision(41);}

                    switch (alt41) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:224:6: THIS WHITE_SPACE
                            {
                            dbg.location(224,6);
                            THIS154=(Token)match(input,THIS,FOLLOW_THIS_in_relative_prefix1843); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_THIS.add(THIS154);

                            dbg.location(224,11);
                            WHITE_SPACE155=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_relative_prefix1845); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE155);


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(41);}

                    dbg.location(224,25);
                    UPCOMING156=(Token)match(input,UPCOMING,FOLLOW_UPCOMING_in_relative_prefix1849); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_UPCOMING.add(UPCOMING156);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 224:34: -> DIRECTION[\">\"] SEEK_BY[\"by_day\"] INT[\"1\"]
                    {
                        dbg.location(224,37);
                        adaptor.addChild(root_0, (Object)adaptor.create(DIRECTION, ">"));
                        dbg.location(224,52);
                        adaptor.addChild(root_0, (Object)adaptor.create(SEEK_BY, "by_day"));
                        dbg.location(224,70);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "1"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 6 :
                    dbg.enterAlt(6);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:225:5: ( IN WHITE_SPACE )? spelled_or_int_01_to_31_optional_prefix
                    {
                    dbg.location(225,5);
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:225:5: ( IN WHITE_SPACE )?
                    int alt42=2;
                    try { dbg.enterSubRule(42);
                    try { dbg.enterDecision(42);

                    int LA42_0 = input.LA(1);

                    if ( (LA42_0==IN) ) {
                        alt42=1;
                    }
                    } finally {dbg.exitDecision(42);}

                    switch (alt42) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:225:6: IN WHITE_SPACE
                            {
                            dbg.location(225,6);
                            IN157=(Token)match(input,IN,FOLLOW_IN_in_relative_prefix1867); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_IN.add(IN157);

                            dbg.location(225,9);
                            WHITE_SPACE158=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_relative_prefix1869); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE158);


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(42);}

                    dbg.location(225,23);
                    pushFollow(FOLLOW_spelled_or_int_01_to_31_optional_prefix_in_relative_prefix1873);
                    spelled_or_int_01_to_31_optional_prefix159=spelled_or_int_01_to_31_optional_prefix();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_spelled_or_int_01_to_31_optional_prefix.add(spelled_or_int_01_to_31_optional_prefix159.getTree());


                    // AST REWRITE
                    // elements: spelled_or_int_01_to_31_optional_prefix
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 226:7: -> DIRECTION[\">\"] SEEK_BY[\"by_day\"] spelled_or_int_01_to_31_optional_prefix
                    {
                        dbg.location(226,10);
                        adaptor.addChild(root_0, (Object)adaptor.create(DIRECTION, ">"));
                        dbg.location(226,25);
                        adaptor.addChild(root_0, (Object)adaptor.create(SEEK_BY, "by_day"));
                        dbg.location(226,43);
                        adaptor.addChild(root_0, stream_spelled_or_int_01_to_31_optional_prefix.nextTree());

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(227, 3);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "relative_prefix");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "relative_prefix"

    public static class relative_suffix_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "relative_suffix"
    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:229:1: relative_suffix : ( FROM WHITE_SPACE NOW -> DIRECTION[\">\"] SEEK_BY[\"by_day\"] | AGO -> DIRECTION[\"<\"] SEEK_BY[\"by_day\"] );
    public final DateParser.relative_suffix_return relative_suffix() throws RecognitionException {
        DateParser.relative_suffix_return retval = new DateParser.relative_suffix_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token FROM160=null;
        Token WHITE_SPACE161=null;
        Token NOW162=null;
        Token AGO163=null;

        Object FROM160_tree=null;
        Object WHITE_SPACE161_tree=null;
        Object NOW162_tree=null;
        Object AGO163_tree=null;
        RewriteRuleTokenStream stream_AGO=new RewriteRuleTokenStream(adaptor,"token AGO");
        RewriteRuleTokenStream stream_NOW=new RewriteRuleTokenStream(adaptor,"token NOW");
        RewriteRuleTokenStream stream_FROM=new RewriteRuleTokenStream(adaptor,"token FROM");
        RewriteRuleTokenStream stream_WHITE_SPACE=new RewriteRuleTokenStream(adaptor,"token WHITE_SPACE");

        try { dbg.enterRule(getGrammarFileName(), "relative_suffix");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(229, 1);

        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:230:3: ( FROM WHITE_SPACE NOW -> DIRECTION[\">\"] SEEK_BY[\"by_day\"] | AGO -> DIRECTION[\"<\"] SEEK_BY[\"by_day\"] )
            int alt44=2;
            try { dbg.enterDecision(44);

            int LA44_0 = input.LA(1);

            if ( (LA44_0==FROM) ) {
                alt44=1;
            }
            else if ( (LA44_0==AGO) ) {
                alt44=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(44);}

            switch (alt44) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:230:5: FROM WHITE_SPACE NOW
                    {
                    dbg.location(230,5);
                    FROM160=(Token)match(input,FROM,FOLLOW_FROM_in_relative_suffix1905); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FROM.add(FROM160);

                    dbg.location(230,10);
                    WHITE_SPACE161=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_relative_suffix1907); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE161);

                    dbg.location(230,22);
                    NOW162=(Token)match(input,NOW,FOLLOW_NOW_in_relative_suffix1909); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NOW.add(NOW162);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 230:26: -> DIRECTION[\">\"] SEEK_BY[\"by_day\"]
                    {
                        dbg.location(230,29);
                        adaptor.addChild(root_0, (Object)adaptor.create(DIRECTION, ">"));
                        dbg.location(230,44);
                        adaptor.addChild(root_0, (Object)adaptor.create(SEEK_BY, "by_day"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:231:5: AGO
                    {
                    dbg.location(231,5);
                    AGO163=(Token)match(input,AGO,FOLLOW_AGO_in_relative_suffix1923); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AGO.add(AGO163);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 231:26: -> DIRECTION[\"<\"] SEEK_BY[\"by_day\"]
                    {
                        dbg.location(231,29);
                        adaptor.addChild(root_0, (Object)adaptor.create(DIRECTION, "<"));
                        dbg.location(231,44);
                        adaptor.addChild(root_0, (Object)adaptor.create(SEEK_BY, "by_day"));

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(232, 3);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "relative_suffix");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "relative_suffix"

    public static class relative_date_span_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "relative_date_span"
    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:234:1: relative_date_span : ( DAY -> SPAN[\"day\"] | WEEK -> SPAN[\"week\"] | MONTH -> SPAN[\"month\"] | YEAR -> SPAN[\"year\"] );
    public final DateParser.relative_date_span_return relative_date_span() throws RecognitionException {
        DateParser.relative_date_span_return retval = new DateParser.relative_date_span_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DAY164=null;
        Token WEEK165=null;
        Token MONTH166=null;
        Token YEAR167=null;

        Object DAY164_tree=null;
        Object WEEK165_tree=null;
        Object MONTH166_tree=null;
        Object YEAR167_tree=null;
        RewriteRuleTokenStream stream_WEEK=new RewriteRuleTokenStream(adaptor,"token WEEK");
        RewriteRuleTokenStream stream_DAY=new RewriteRuleTokenStream(adaptor,"token DAY");
        RewriteRuleTokenStream stream_YEAR=new RewriteRuleTokenStream(adaptor,"token YEAR");
        RewriteRuleTokenStream stream_MONTH=new RewriteRuleTokenStream(adaptor,"token MONTH");

        try { dbg.enterRule(getGrammarFileName(), "relative_date_span");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(234, 1);

        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:235:3: ( DAY -> SPAN[\"day\"] | WEEK -> SPAN[\"week\"] | MONTH -> SPAN[\"month\"] | YEAR -> SPAN[\"year\"] )
            int alt45=4;
            try { dbg.enterDecision(45);

            switch ( input.LA(1) ) {
            case DAY:
                {
                alt45=1;
                }
                break;
            case WEEK:
                {
                alt45=2;
                }
                break;
            case MONTH:
                {
                alt45=3;
                }
                break;
            case YEAR:
                {
                alt45=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(45);}

            switch (alt45) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:235:5: DAY
                    {
                    dbg.location(235,5);
                    DAY164=(Token)match(input,DAY,FOLLOW_DAY_in_relative_date_span1963); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DAY.add(DAY164);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 235:11: -> SPAN[\"day\"]
                    {
                        dbg.location(235,14);
                        adaptor.addChild(root_0, (Object)adaptor.create(SPAN, "day"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:236:5: WEEK
                    {
                    dbg.location(236,5);
                    WEEK165=(Token)match(input,WEEK,FOLLOW_WEEK_in_relative_date_span1976); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WEEK.add(WEEK165);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 236:11: -> SPAN[\"week\"]
                    {
                        dbg.location(236,14);
                        adaptor.addChild(root_0, (Object)adaptor.create(SPAN, "week"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:237:5: MONTH
                    {
                    dbg.location(237,5);
                    MONTH166=(Token)match(input,MONTH,FOLLOW_MONTH_in_relative_date_span1988); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_MONTH.add(MONTH166);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 237:11: -> SPAN[\"month\"]
                    {
                        dbg.location(237,14);
                        adaptor.addChild(root_0, (Object)adaptor.create(SPAN, "month"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:238:5: YEAR
                    {
                    dbg.location(238,5);
                    YEAR167=(Token)match(input,YEAR,FOLLOW_YEAR_in_relative_date_span1999); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_YEAR.add(YEAR167);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 238:11: -> SPAN[\"year\"]
                    {
                        dbg.location(238,14);
                        adaptor.addChild(root_0, (Object)adaptor.create(SPAN, "year"));

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(239, 3);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "relative_date_span");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "relative_date_span"

    public static class day_of_week_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "day_of_week"
    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:241:1: day_of_week : ( SUNDAY -> ^( DAY_OF_WEEK INT[\"1\"] ) | MONDAY -> ^( DAY_OF_WEEK INT[\"2\"] ) | TUESDAY -> ^( DAY_OF_WEEK INT[\"3\"] ) | WEDNESDAY -> ^( DAY_OF_WEEK INT[\"4\"] ) | THURSDAY -> ^( DAY_OF_WEEK INT[\"5\"] ) | FRIDAY -> ^( DAY_OF_WEEK INT[\"6\"] ) | SATURDAY -> ^( DAY_OF_WEEK INT[\"7\"] ) );
    public final DateParser.day_of_week_return day_of_week() throws RecognitionException {
        DateParser.day_of_week_return retval = new DateParser.day_of_week_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SUNDAY168=null;
        Token MONDAY169=null;
        Token TUESDAY170=null;
        Token WEDNESDAY171=null;
        Token THURSDAY172=null;
        Token FRIDAY173=null;
        Token SATURDAY174=null;

        Object SUNDAY168_tree=null;
        Object MONDAY169_tree=null;
        Object TUESDAY170_tree=null;
        Object WEDNESDAY171_tree=null;
        Object THURSDAY172_tree=null;
        Object FRIDAY173_tree=null;
        Object SATURDAY174_tree=null;
        RewriteRuleTokenStream stream_MONDAY=new RewriteRuleTokenStream(adaptor,"token MONDAY");
        RewriteRuleTokenStream stream_SUNDAY=new RewriteRuleTokenStream(adaptor,"token SUNDAY");
        RewriteRuleTokenStream stream_WEDNESDAY=new RewriteRuleTokenStream(adaptor,"token WEDNESDAY");
        RewriteRuleTokenStream stream_THURSDAY=new RewriteRuleTokenStream(adaptor,"token THURSDAY");
        RewriteRuleTokenStream stream_SATURDAY=new RewriteRuleTokenStream(adaptor,"token SATURDAY");
        RewriteRuleTokenStream stream_TUESDAY=new RewriteRuleTokenStream(adaptor,"token TUESDAY");
        RewriteRuleTokenStream stream_FRIDAY=new RewriteRuleTokenStream(adaptor,"token FRIDAY");

        try { dbg.enterRule(getGrammarFileName(), "day_of_week");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(241, 1);

        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:242:3: ( SUNDAY -> ^( DAY_OF_WEEK INT[\"1\"] ) | MONDAY -> ^( DAY_OF_WEEK INT[\"2\"] ) | TUESDAY -> ^( DAY_OF_WEEK INT[\"3\"] ) | WEDNESDAY -> ^( DAY_OF_WEEK INT[\"4\"] ) | THURSDAY -> ^( DAY_OF_WEEK INT[\"5\"] ) | FRIDAY -> ^( DAY_OF_WEEK INT[\"6\"] ) | SATURDAY -> ^( DAY_OF_WEEK INT[\"7\"] ) )
            int alt46=7;
            try { dbg.enterDecision(46);

            switch ( input.LA(1) ) {
            case SUNDAY:
                {
                alt46=1;
                }
                break;
            case MONDAY:
                {
                alt46=2;
                }
                break;
            case TUESDAY:
                {
                alt46=3;
                }
                break;
            case WEDNESDAY:
                {
                alt46=4;
                }
                break;
            case THURSDAY:
                {
                alt46=5;
                }
                break;
            case FRIDAY:
                {
                alt46=6;
                }
                break;
            case SATURDAY:
                {
                alt46=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(46);}

            switch (alt46) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:242:5: SUNDAY
                    {
                    dbg.location(242,5);
                    SUNDAY168=(Token)match(input,SUNDAY,FOLLOW_SUNDAY_in_day_of_week2019); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SUNDAY.add(SUNDAY168);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 242:15: -> ^( DAY_OF_WEEK INT[\"1\"] )
                    {
                        dbg.location(242,18);
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:242:18: ^( DAY_OF_WEEK INT[\"1\"] )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(242,20);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DAY_OF_WEEK, "DAY_OF_WEEK"), root_1);

                        dbg.location(242,32);
                        adaptor.addChild(root_1, (Object)adaptor.create(INT, "1"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:243:5: MONDAY
                    {
                    dbg.location(243,5);
                    MONDAY169=(Token)match(input,MONDAY,FOLLOW_MONDAY_in_day_of_week2037); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_MONDAY.add(MONDAY169);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 243:15: -> ^( DAY_OF_WEEK INT[\"2\"] )
                    {
                        dbg.location(243,18);
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:243:18: ^( DAY_OF_WEEK INT[\"2\"] )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(243,20);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DAY_OF_WEEK, "DAY_OF_WEEK"), root_1);

                        dbg.location(243,32);
                        adaptor.addChild(root_1, (Object)adaptor.create(INT, "2"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:244:5: TUESDAY
                    {
                    dbg.location(244,5);
                    TUESDAY170=(Token)match(input,TUESDAY,FOLLOW_TUESDAY_in_day_of_week2055); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TUESDAY.add(TUESDAY170);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 244:15: -> ^( DAY_OF_WEEK INT[\"3\"] )
                    {
                        dbg.location(244,18);
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:244:18: ^( DAY_OF_WEEK INT[\"3\"] )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(244,20);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DAY_OF_WEEK, "DAY_OF_WEEK"), root_1);

                        dbg.location(244,32);
                        adaptor.addChild(root_1, (Object)adaptor.create(INT, "3"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:245:5: WEDNESDAY
                    {
                    dbg.location(245,5);
                    WEDNESDAY171=(Token)match(input,WEDNESDAY,FOLLOW_WEDNESDAY_in_day_of_week2072); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WEDNESDAY.add(WEDNESDAY171);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 245:15: -> ^( DAY_OF_WEEK INT[\"4\"] )
                    {
                        dbg.location(245,18);
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:245:18: ^( DAY_OF_WEEK INT[\"4\"] )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(245,20);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DAY_OF_WEEK, "DAY_OF_WEEK"), root_1);

                        dbg.location(245,32);
                        adaptor.addChild(root_1, (Object)adaptor.create(INT, "4"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:246:5: THURSDAY
                    {
                    dbg.location(246,5);
                    THURSDAY172=(Token)match(input,THURSDAY,FOLLOW_THURSDAY_in_day_of_week2087); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THURSDAY.add(THURSDAY172);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 246:15: -> ^( DAY_OF_WEEK INT[\"5\"] )
                    {
                        dbg.location(246,18);
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:246:18: ^( DAY_OF_WEEK INT[\"5\"] )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(246,20);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DAY_OF_WEEK, "DAY_OF_WEEK"), root_1);

                        dbg.location(246,32);
                        adaptor.addChild(root_1, (Object)adaptor.create(INT, "5"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 6 :
                    dbg.enterAlt(6);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:247:5: FRIDAY
                    {
                    dbg.location(247,5);
                    FRIDAY173=(Token)match(input,FRIDAY,FOLLOW_FRIDAY_in_day_of_week2103); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FRIDAY.add(FRIDAY173);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 247:15: -> ^( DAY_OF_WEEK INT[\"6\"] )
                    {
                        dbg.location(247,18);
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:247:18: ^( DAY_OF_WEEK INT[\"6\"] )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(247,20);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DAY_OF_WEEK, "DAY_OF_WEEK"), root_1);

                        dbg.location(247,32);
                        adaptor.addChild(root_1, (Object)adaptor.create(INT, "6"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 7 :
                    dbg.enterAlt(7);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:248:5: SATURDAY
                    {
                    dbg.location(248,5);
                    SATURDAY174=(Token)match(input,SATURDAY,FOLLOW_SATURDAY_in_day_of_week2121); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SATURDAY.add(SATURDAY174);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 248:15: -> ^( DAY_OF_WEEK INT[\"7\"] )
                    {
                        dbg.location(248,18);
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:248:18: ^( DAY_OF_WEEK INT[\"7\"] )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(248,20);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DAY_OF_WEEK, "DAY_OF_WEEK"), root_1);

                        dbg.location(248,32);
                        adaptor.addChild(root_1, (Object)adaptor.create(INT, "7"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(249, 3);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "day_of_week");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "day_of_week"

    public static class named_relative_date_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "named_relative_date"
    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:251:1: named_relative_date : ( TODAY -> ^( RELATIVE_DATE ^( SEEK DIRECTION[\">\"] SEEK_BY[\"by_day\"] INT[\"0\"] SPAN[\"day\"] ) ) | TOMORROW -> ^( RELATIVE_DATE ^( SEEK DIRECTION[\">\"] SEEK_BY[\"by_day\"] INT[\"1\"] SPAN[\"day\"] ) ) | YESTERDAY -> ^( RELATIVE_DATE ^( SEEK DIRECTION[\"<\"] SEEK_BY[\"by_day\"] INT[\"1\"] SPAN[\"day\"] ) ) );
    public final DateParser.named_relative_date_return named_relative_date() throws RecognitionException {
        DateParser.named_relative_date_return retval = new DateParser.named_relative_date_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TODAY175=null;
        Token TOMORROW176=null;
        Token YESTERDAY177=null;

        Object TODAY175_tree=null;
        Object TOMORROW176_tree=null;
        Object YESTERDAY177_tree=null;
        RewriteRuleTokenStream stream_TODAY=new RewriteRuleTokenStream(adaptor,"token TODAY");
        RewriteRuleTokenStream stream_YESTERDAY=new RewriteRuleTokenStream(adaptor,"token YESTERDAY");
        RewriteRuleTokenStream stream_TOMORROW=new RewriteRuleTokenStream(adaptor,"token TOMORROW");

        try { dbg.enterRule(getGrammarFileName(), "named_relative_date");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(251, 1);

        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:252:3: ( TODAY -> ^( RELATIVE_DATE ^( SEEK DIRECTION[\">\"] SEEK_BY[\"by_day\"] INT[\"0\"] SPAN[\"day\"] ) ) | TOMORROW -> ^( RELATIVE_DATE ^( SEEK DIRECTION[\">\"] SEEK_BY[\"by_day\"] INT[\"1\"] SPAN[\"day\"] ) ) | YESTERDAY -> ^( RELATIVE_DATE ^( SEEK DIRECTION[\"<\"] SEEK_BY[\"by_day\"] INT[\"1\"] SPAN[\"day\"] ) ) )
            int alt47=3;
            try { dbg.enterDecision(47);

            switch ( input.LA(1) ) {
            case TODAY:
                {
                alt47=1;
                }
                break;
            case TOMORROW:
                {
                alt47=2;
                }
                break;
            case YESTERDAY:
                {
                alt47=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(47);}

            switch (alt47) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:252:5: TODAY
                    {
                    dbg.location(252,5);
                    TODAY175=(Token)match(input,TODAY,FOLLOW_TODAY_in_named_relative_date2146); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TODAY.add(TODAY175);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 252:15: -> ^( RELATIVE_DATE ^( SEEK DIRECTION[\">\"] SEEK_BY[\"by_day\"] INT[\"0\"] SPAN[\"day\"] ) )
                    {
                        dbg.location(252,18);
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:252:18: ^( RELATIVE_DATE ^( SEEK DIRECTION[\">\"] SEEK_BY[\"by_day\"] INT[\"0\"] SPAN[\"day\"] ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(252,20);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(RELATIVE_DATE, "RELATIVE_DATE"), root_1);

                        dbg.location(252,34);
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:252:34: ^( SEEK DIRECTION[\">\"] SEEK_BY[\"by_day\"] INT[\"0\"] SPAN[\"day\"] )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        dbg.location(252,36);
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(SEEK, "SEEK"), root_2);

                        dbg.location(252,41);
                        adaptor.addChild(root_2, (Object)adaptor.create(DIRECTION, ">"));
                        dbg.location(252,56);
                        adaptor.addChild(root_2, (Object)adaptor.create(SEEK_BY, "by_day"));
                        dbg.location(252,74);
                        adaptor.addChild(root_2, (Object)adaptor.create(INT, "0"));
                        dbg.location(252,83);
                        adaptor.addChild(root_2, (Object)adaptor.create(SPAN, "day"));

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:253:5: TOMORROW
                    {
                    dbg.location(253,5);
                    TOMORROW176=(Token)match(input,TOMORROW,FOLLOW_TOMORROW_in_named_relative_date2178); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TOMORROW.add(TOMORROW176);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 253:15: -> ^( RELATIVE_DATE ^( SEEK DIRECTION[\">\"] SEEK_BY[\"by_day\"] INT[\"1\"] SPAN[\"day\"] ) )
                    {
                        dbg.location(253,18);
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:253:18: ^( RELATIVE_DATE ^( SEEK DIRECTION[\">\"] SEEK_BY[\"by_day\"] INT[\"1\"] SPAN[\"day\"] ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(253,20);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(RELATIVE_DATE, "RELATIVE_DATE"), root_1);

                        dbg.location(253,34);
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:253:34: ^( SEEK DIRECTION[\">\"] SEEK_BY[\"by_day\"] INT[\"1\"] SPAN[\"day\"] )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        dbg.location(253,36);
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(SEEK, "SEEK"), root_2);

                        dbg.location(253,41);
                        adaptor.addChild(root_2, (Object)adaptor.create(DIRECTION, ">"));
                        dbg.location(253,56);
                        adaptor.addChild(root_2, (Object)adaptor.create(SEEK_BY, "by_day"));
                        dbg.location(253,74);
                        adaptor.addChild(root_2, (Object)adaptor.create(INT, "1"));
                        dbg.location(253,83);
                        adaptor.addChild(root_2, (Object)adaptor.create(SPAN, "day"));

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:254:5: YESTERDAY
                    {
                    dbg.location(254,5);
                    YESTERDAY177=(Token)match(input,YESTERDAY,FOLLOW_YESTERDAY_in_named_relative_date2207); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_YESTERDAY.add(YESTERDAY177);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 254:15: -> ^( RELATIVE_DATE ^( SEEK DIRECTION[\"<\"] SEEK_BY[\"by_day\"] INT[\"1\"] SPAN[\"day\"] ) )
                    {
                        dbg.location(254,18);
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:254:18: ^( RELATIVE_DATE ^( SEEK DIRECTION[\"<\"] SEEK_BY[\"by_day\"] INT[\"1\"] SPAN[\"day\"] ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(254,20);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(RELATIVE_DATE, "RELATIVE_DATE"), root_1);

                        dbg.location(254,34);
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:254:34: ^( SEEK DIRECTION[\"<\"] SEEK_BY[\"by_day\"] INT[\"1\"] SPAN[\"day\"] )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        dbg.location(254,36);
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(SEEK, "SEEK"), root_2);

                        dbg.location(254,41);
                        adaptor.addChild(root_2, (Object)adaptor.create(DIRECTION, "<"));
                        dbg.location(254,56);
                        adaptor.addChild(root_2, (Object)adaptor.create(SEEK_BY, "by_day"));
                        dbg.location(254,74);
                        adaptor.addChild(root_2, (Object)adaptor.create(INT, "1"));
                        dbg.location(254,83);
                        adaptor.addChild(root_2, (Object)adaptor.create(SPAN, "day"));

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(255, 3);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "named_relative_date");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "named_relative_date"

    public static class time_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "time"
    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:260:1: time : ( hours ( COLON )? minutes ( ( WHITE_SPACE )? ( meridian_indicator | ( MILITARY_HOUR_SUFFIX | HOUR ) ) )? -> ^( EXPLICIT_TIME hours minutes ( meridian_indicator )? ) | hours ( ( WHITE_SPACE )? meridian_indicator )? -> ^( EXPLICIT_TIME hours ^( MINUTES_OF_HOUR INT[\"0\"] ) ( meridian_indicator )? ) | named_time );
    public final DateParser.time_return time() throws RecognitionException {
        DateParser.time_return retval = new DateParser.time_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token COLON179=null;
        Token WHITE_SPACE181=null;
        Token MILITARY_HOUR_SUFFIX183=null;
        Token HOUR184=null;
        Token WHITE_SPACE186=null;
        DateParser.hours_return hours178 = null;

        DateParser.minutes_return minutes180 = null;

        DateParser.meridian_indicator_return meridian_indicator182 = null;

        DateParser.hours_return hours185 = null;

        DateParser.meridian_indicator_return meridian_indicator187 = null;

        DateParser.named_time_return named_time188 = null;


        Object COLON179_tree=null;
        Object WHITE_SPACE181_tree=null;
        Object MILITARY_HOUR_SUFFIX183_tree=null;
        Object HOUR184_tree=null;
        Object WHITE_SPACE186_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_HOUR=new RewriteRuleTokenStream(adaptor,"token HOUR");
        RewriteRuleTokenStream stream_MILITARY_HOUR_SUFFIX=new RewriteRuleTokenStream(adaptor,"token MILITARY_HOUR_SUFFIX");
        RewriteRuleTokenStream stream_WHITE_SPACE=new RewriteRuleTokenStream(adaptor,"token WHITE_SPACE");
        RewriteRuleSubtreeStream stream_meridian_indicator=new RewriteRuleSubtreeStream(adaptor,"rule meridian_indicator");
        RewriteRuleSubtreeStream stream_minutes=new RewriteRuleSubtreeStream(adaptor,"rule minutes");
        RewriteRuleSubtreeStream stream_hours=new RewriteRuleSubtreeStream(adaptor,"rule hours");
        try { dbg.enterRule(getGrammarFileName(), "time");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(260, 1);

        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:261:3: ( hours ( COLON )? minutes ( ( WHITE_SPACE )? ( meridian_indicator | ( MILITARY_HOUR_SUFFIX | HOUR ) ) )? -> ^( EXPLICIT_TIME hours minutes ( meridian_indicator )? ) | hours ( ( WHITE_SPACE )? meridian_indicator )? -> ^( EXPLICIT_TIME hours ^( MINUTES_OF_HOUR INT[\"0\"] ) ( meridian_indicator )? ) | named_time )
            int alt55=3;
            try { dbg.enterDecision(55);

            try {
                isCyclicDecision = true;
                alt55 = dfa55.predict(input);
            }
            catch (NoViableAltException nvae) {
                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(55);}

            switch (alt55) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:261:5: hours ( COLON )? minutes ( ( WHITE_SPACE )? ( meridian_indicator | ( MILITARY_HOUR_SUFFIX | HOUR ) ) )?
                    {
                    dbg.location(261,5);
                    pushFollow(FOLLOW_hours_in_time2247);
                    hours178=hours();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_hours.add(hours178.getTree());
                    dbg.location(261,11);
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:261:11: ( COLON )?
                    int alt48=2;
                    try { dbg.enterSubRule(48);
                    try { dbg.enterDecision(48);

                    int LA48_0 = input.LA(1);

                    if ( (LA48_0==COLON) ) {
                        alt48=1;
                    }
                    } finally {dbg.exitDecision(48);}

                    switch (alt48) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:261:11: COLON
                            {
                            dbg.location(261,11);
                            COLON179=(Token)match(input,COLON,FOLLOW_COLON_in_time2249); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_COLON.add(COLON179);


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(48);}

                    dbg.location(261,18);
                    pushFollow(FOLLOW_minutes_in_time2252);
                    minutes180=minutes();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_minutes.add(minutes180.getTree());
                    dbg.location(261,26);
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:261:26: ( ( WHITE_SPACE )? ( meridian_indicator | ( MILITARY_HOUR_SUFFIX | HOUR ) ) )?
                    int alt52=2;
                    try { dbg.enterSubRule(52);
                    try { dbg.enterDecision(52);

                    int LA52_0 = input.LA(1);

                    if ( (LA52_0==WHITE_SPACE) ) {
                        int LA52_1 = input.LA(2);

                        if ( ((LA52_1>=MILITARY_HOUR_SUFFIX && LA52_1<=PM)) ) {
                            alt52=1;
                        }
                    }
                    else if ( ((LA52_0>=MILITARY_HOUR_SUFFIX && LA52_0<=PM)) ) {
                        alt52=1;
                    }
                    } finally {dbg.exitDecision(52);}

                    switch (alt52) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:261:27: ( WHITE_SPACE )? ( meridian_indicator | ( MILITARY_HOUR_SUFFIX | HOUR ) )
                            {
                            dbg.location(261,27);
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:261:27: ( WHITE_SPACE )?
                            int alt49=2;
                            try { dbg.enterSubRule(49);
                            try { dbg.enterDecision(49);

                            int LA49_0 = input.LA(1);

                            if ( (LA49_0==WHITE_SPACE) ) {
                                alt49=1;
                            }
                            } finally {dbg.exitDecision(49);}

                            switch (alt49) {
                                case 1 :
                                    dbg.enterAlt(1);

                                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:261:27: WHITE_SPACE
                                    {
                                    dbg.location(261,27);
                                    WHITE_SPACE181=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_time2255); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE181);


                                    }
                                    break;

                            }
                            } finally {dbg.exitSubRule(49);}

                            dbg.location(261,40);
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:261:40: ( meridian_indicator | ( MILITARY_HOUR_SUFFIX | HOUR ) )
                            int alt51=2;
                            try { dbg.enterSubRule(51);
                            try { dbg.enterDecision(51);

                            int LA51_0 = input.LA(1);

                            if ( ((LA51_0>=AM && LA51_0<=PM)) ) {
                                alt51=1;
                            }
                            else if ( ((LA51_0>=MILITARY_HOUR_SUFFIX && LA51_0<=HOUR)) ) {
                                alt51=2;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 51, 0, input);

                                dbg.recognitionException(nvae);
                                throw nvae;
                            }
                            } finally {dbg.exitDecision(51);}

                            switch (alt51) {
                                case 1 :
                                    dbg.enterAlt(1);

                                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:261:41: meridian_indicator
                                    {
                                    dbg.location(261,41);
                                    pushFollow(FOLLOW_meridian_indicator_in_time2259);
                                    meridian_indicator182=meridian_indicator();

                                    state._fsp--;
                                    if (state.failed) return retval;
                                    if ( state.backtracking==0 ) stream_meridian_indicator.add(meridian_indicator182.getTree());

                                    }
                                    break;
                                case 2 :
                                    dbg.enterAlt(2);

                                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:261:62: ( MILITARY_HOUR_SUFFIX | HOUR )
                                    {
                                    dbg.location(261,62);
                                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:261:62: ( MILITARY_HOUR_SUFFIX | HOUR )
                                    int alt50=2;
                                    try { dbg.enterSubRule(50);
                                    try { dbg.enterDecision(50);

                                    int LA50_0 = input.LA(1);

                                    if ( (LA50_0==MILITARY_HOUR_SUFFIX) ) {
                                        alt50=1;
                                    }
                                    else if ( (LA50_0==HOUR) ) {
                                        alt50=2;
                                    }
                                    else {
                                        if (state.backtracking>0) {state.failed=true; return retval;}
                                        NoViableAltException nvae =
                                            new NoViableAltException("", 50, 0, input);

                                        dbg.recognitionException(nvae);
                                        throw nvae;
                                    }
                                    } finally {dbg.exitDecision(50);}

                                    switch (alt50) {
                                        case 1 :
                                            dbg.enterAlt(1);

                                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:261:63: MILITARY_HOUR_SUFFIX
                                            {
                                            dbg.location(261,63);
                                            MILITARY_HOUR_SUFFIX183=(Token)match(input,MILITARY_HOUR_SUFFIX,FOLLOW_MILITARY_HOUR_SUFFIX_in_time2264); if (state.failed) return retval; 
                                            if ( state.backtracking==0 ) stream_MILITARY_HOUR_SUFFIX.add(MILITARY_HOUR_SUFFIX183);


                                            }
                                            break;
                                        case 2 :
                                            dbg.enterAlt(2);

                                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:261:86: HOUR
                                            {
                                            dbg.location(261,86);
                                            HOUR184=(Token)match(input,HOUR,FOLLOW_HOUR_in_time2268); if (state.failed) return retval; 
                                            if ( state.backtracking==0 ) stream_HOUR.add(HOUR184);


                                            }
                                            break;

                                    }
                                    } finally {dbg.exitSubRule(50);}


                                    }
                                    break;

                            }
                            } finally {dbg.exitSubRule(51);}


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(52);}



                    // AST REWRITE
                    // elements: minutes, hours, meridian_indicator
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 262:7: -> ^( EXPLICIT_TIME hours minutes ( meridian_indicator )? )
                    {
                        dbg.location(262,10);
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:262:10: ^( EXPLICIT_TIME hours minutes ( meridian_indicator )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(262,12);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPLICIT_TIME, "EXPLICIT_TIME"), root_1);

                        dbg.location(262,26);
                        adaptor.addChild(root_1, stream_hours.nextTree());
                        dbg.location(262,32);
                        adaptor.addChild(root_1, stream_minutes.nextTree());
                        dbg.location(262,40);
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:262:40: ( meridian_indicator )?
                        if ( stream_meridian_indicator.hasNext() ) {
                            dbg.location(262,40);
                            adaptor.addChild(root_1, stream_meridian_indicator.nextTree());

                        }
                        stream_meridian_indicator.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:264:5: hours ( ( WHITE_SPACE )? meridian_indicator )?
                    {
                    dbg.location(264,5);
                    pushFollow(FOLLOW_hours_in_time2304);
                    hours185=hours();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_hours.add(hours185.getTree());
                    dbg.location(264,11);
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:264:11: ( ( WHITE_SPACE )? meridian_indicator )?
                    int alt54=2;
                    try { dbg.enterSubRule(54);
                    try { dbg.enterDecision(54);

                    int LA54_0 = input.LA(1);

                    if ( (LA54_0==WHITE_SPACE) ) {
                        int LA54_1 = input.LA(2);

                        if ( ((LA54_1>=AM && LA54_1<=PM)) ) {
                            alt54=1;
                        }
                    }
                    else if ( ((LA54_0>=AM && LA54_0<=PM)) ) {
                        alt54=1;
                    }
                    } finally {dbg.exitDecision(54);}

                    switch (alt54) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:264:12: ( WHITE_SPACE )? meridian_indicator
                            {
                            dbg.location(264,12);
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:264:12: ( WHITE_SPACE )?
                            int alt53=2;
                            try { dbg.enterSubRule(53);
                            try { dbg.enterDecision(53);

                            int LA53_0 = input.LA(1);

                            if ( (LA53_0==WHITE_SPACE) ) {
                                alt53=1;
                            }
                            } finally {dbg.exitDecision(53);}

                            switch (alt53) {
                                case 1 :
                                    dbg.enterAlt(1);

                                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:264:12: WHITE_SPACE
                                    {
                                    dbg.location(264,12);
                                    WHITE_SPACE186=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_time2307); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE186);


                                    }
                                    break;

                            }
                            } finally {dbg.exitSubRule(53);}

                            dbg.location(264,25);
                            pushFollow(FOLLOW_meridian_indicator_in_time2310);
                            meridian_indicator187=meridian_indicator();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_meridian_indicator.add(meridian_indicator187.getTree());

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(54);}



                    // AST REWRITE
                    // elements: hours, meridian_indicator
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 265:7: -> ^( EXPLICIT_TIME hours ^( MINUTES_OF_HOUR INT[\"0\"] ) ( meridian_indicator )? )
                    {
                        dbg.location(265,10);
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:265:10: ^( EXPLICIT_TIME hours ^( MINUTES_OF_HOUR INT[\"0\"] ) ( meridian_indicator )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(265,12);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPLICIT_TIME, "EXPLICIT_TIME"), root_1);

                        dbg.location(265,26);
                        adaptor.addChild(root_1, stream_hours.nextTree());
                        dbg.location(265,32);
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:265:32: ^( MINUTES_OF_HOUR INT[\"0\"] )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        dbg.location(265,34);
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(MINUTES_OF_HOUR, "MINUTES_OF_HOUR"), root_2);

                        dbg.location(265,50);
                        adaptor.addChild(root_2, (Object)adaptor.create(INT, "0"));

                        adaptor.addChild(root_1, root_2);
                        }
                        dbg.location(265,60);
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:265:60: ( meridian_indicator )?
                        if ( stream_meridian_indicator.hasNext() ) {
                            dbg.location(265,60);
                            adaptor.addChild(root_1, stream_meridian_indicator.nextTree());

                        }
                        stream_meridian_indicator.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:267:5: named_time
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(267,5);
                    pushFollow(FOLLOW_named_time_in_time2349);
                    named_time188=named_time();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, named_time188.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(268, 3);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "time");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "time"

    public static class hours_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "hours"
    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:271:1: hours : int_00_to_23_optional_prefix -> ^( HOURS_OF_DAY int_00_to_23_optional_prefix ) ;
    public final DateParser.hours_return hours() throws RecognitionException {
        DateParser.hours_return retval = new DateParser.hours_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        DateParser.int_00_to_23_optional_prefix_return int_00_to_23_optional_prefix189 = null;


        RewriteRuleSubtreeStream stream_int_00_to_23_optional_prefix=new RewriteRuleSubtreeStream(adaptor,"rule int_00_to_23_optional_prefix");
        try { dbg.enterRule(getGrammarFileName(), "hours");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(271, 1);

        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:272:3: ( int_00_to_23_optional_prefix -> ^( HOURS_OF_DAY int_00_to_23_optional_prefix ) )
            dbg.enterAlt(1);

            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:272:5: int_00_to_23_optional_prefix
            {
            dbg.location(272,5);
            pushFollow(FOLLOW_int_00_to_23_optional_prefix_in_hours2364);
            int_00_to_23_optional_prefix189=int_00_to_23_optional_prefix();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_int_00_to_23_optional_prefix.add(int_00_to_23_optional_prefix189.getTree());


            // AST REWRITE
            // elements: int_00_to_23_optional_prefix
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 272:34: -> ^( HOURS_OF_DAY int_00_to_23_optional_prefix )
            {
                dbg.location(272,37);
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:272:37: ^( HOURS_OF_DAY int_00_to_23_optional_prefix )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(272,39);
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(HOURS_OF_DAY, "HOURS_OF_DAY"), root_1);

                dbg.location(272,52);
                adaptor.addChild(root_1, stream_int_00_to_23_optional_prefix.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(273, 3);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "hours");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "hours"

    public static class minutes_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "minutes"
    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:276:1: minutes : int_00_to_59_mandatory_prefix -> ^( MINUTES_OF_HOUR int_00_to_59_mandatory_prefix ) ;
    public final DateParser.minutes_return minutes() throws RecognitionException {
        DateParser.minutes_return retval = new DateParser.minutes_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        DateParser.int_00_to_59_mandatory_prefix_return int_00_to_59_mandatory_prefix190 = null;


        RewriteRuleSubtreeStream stream_int_00_to_59_mandatory_prefix=new RewriteRuleSubtreeStream(adaptor,"rule int_00_to_59_mandatory_prefix");
        try { dbg.enterRule(getGrammarFileName(), "minutes");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(276, 1);

        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:277:3: ( int_00_to_59_mandatory_prefix -> ^( MINUTES_OF_HOUR int_00_to_59_mandatory_prefix ) )
            dbg.enterAlt(1);

            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:277:5: int_00_to_59_mandatory_prefix
            {
            dbg.location(277,5);
            pushFollow(FOLLOW_int_00_to_59_mandatory_prefix_in_minutes2388);
            int_00_to_59_mandatory_prefix190=int_00_to_59_mandatory_prefix();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_int_00_to_59_mandatory_prefix.add(int_00_to_59_mandatory_prefix190.getTree());


            // AST REWRITE
            // elements: int_00_to_59_mandatory_prefix
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 277:35: -> ^( MINUTES_OF_HOUR int_00_to_59_mandatory_prefix )
            {
                dbg.location(277,38);
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:277:38: ^( MINUTES_OF_HOUR int_00_to_59_mandatory_prefix )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(277,40);
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(MINUTES_OF_HOUR, "MINUTES_OF_HOUR"), root_1);

                dbg.location(277,56);
                adaptor.addChild(root_1, stream_int_00_to_59_mandatory_prefix.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(278, 3);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "minutes");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "minutes"

    public static class meridian_indicator_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "meridian_indicator"
    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:281:1: meridian_indicator : ( AM -> AM_PM[\"am\"] | PM -> AM_PM[\"pm\"] );
    public final DateParser.meridian_indicator_return meridian_indicator() throws RecognitionException {
        DateParser.meridian_indicator_return retval = new DateParser.meridian_indicator_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token AM191=null;
        Token PM192=null;

        Object AM191_tree=null;
        Object PM192_tree=null;
        RewriteRuleTokenStream stream_PM=new RewriteRuleTokenStream(adaptor,"token PM");
        RewriteRuleTokenStream stream_AM=new RewriteRuleTokenStream(adaptor,"token AM");

        try { dbg.enterRule(getGrammarFileName(), "meridian_indicator");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(281, 1);

        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:282:3: ( AM -> AM_PM[\"am\"] | PM -> AM_PM[\"pm\"] )
            int alt56=2;
            try { dbg.enterDecision(56);

            int LA56_0 = input.LA(1);

            if ( (LA56_0==AM) ) {
                alt56=1;
            }
            else if ( (LA56_0==PM) ) {
                alt56=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(56);}

            switch (alt56) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:282:5: AM
                    {
                    dbg.location(282,5);
                    AM191=(Token)match(input,AM,FOLLOW_AM_in_meridian_indicator2412); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AM.add(AM191);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 282:8: -> AM_PM[\"am\"]
                    {
                        dbg.location(282,11);
                        adaptor.addChild(root_0, (Object)adaptor.create(AM_PM, "am"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:283:5: PM
                    {
                    dbg.location(283,5);
                    PM192=(Token)match(input,PM,FOLLOW_PM_in_meridian_indicator2423); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PM.add(PM192);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 283:8: -> AM_PM[\"pm\"]
                    {
                        dbg.location(283,11);
                        adaptor.addChild(root_0, (Object)adaptor.create(AM_PM, "pm"));

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(284, 3);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "meridian_indicator");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "meridian_indicator"

    public static class named_time_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "named_time"
    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:286:1: named_time : ( NOON -> ^( EXPLICIT_TIME ^( HOURS_OF_DAY INT[\"12\"] ) ^( MINUTES_OF_HOUR INT[\"0\"] ) AM_PM[\"pm\"] ) | MIDNIGHT -> ^( EXPLICIT_TIME ^( HOURS_OF_DAY INT[\"12\"] ) ^( MINUTES_OF_HOUR INT[\"0\"] ) AM_PM[\"am\"] ) );
    public final DateParser.named_time_return named_time() throws RecognitionException {
        DateParser.named_time_return retval = new DateParser.named_time_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token NOON193=null;
        Token MIDNIGHT194=null;

        Object NOON193_tree=null;
        Object MIDNIGHT194_tree=null;
        RewriteRuleTokenStream stream_NOON=new RewriteRuleTokenStream(adaptor,"token NOON");
        RewriteRuleTokenStream stream_MIDNIGHT=new RewriteRuleTokenStream(adaptor,"token MIDNIGHT");

        try { dbg.enterRule(getGrammarFileName(), "named_time");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(286, 1);

        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:287:3: ( NOON -> ^( EXPLICIT_TIME ^( HOURS_OF_DAY INT[\"12\"] ) ^( MINUTES_OF_HOUR INT[\"0\"] ) AM_PM[\"pm\"] ) | MIDNIGHT -> ^( EXPLICIT_TIME ^( HOURS_OF_DAY INT[\"12\"] ) ^( MINUTES_OF_HOUR INT[\"0\"] ) AM_PM[\"am\"] ) )
            int alt57=2;
            try { dbg.enterDecision(57);

            int LA57_0 = input.LA(1);

            if ( (LA57_0==NOON) ) {
                alt57=1;
            }
            else if ( (LA57_0==MIDNIGHT) ) {
                alt57=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(57);}

            switch (alt57) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:287:5: NOON
                    {
                    dbg.location(287,5);
                    NOON193=(Token)match(input,NOON,FOLLOW_NOON_in_named_time2443); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NOON.add(NOON193);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 287:14: -> ^( EXPLICIT_TIME ^( HOURS_OF_DAY INT[\"12\"] ) ^( MINUTES_OF_HOUR INT[\"0\"] ) AM_PM[\"pm\"] )
                    {
                        dbg.location(287,17);
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:287:17: ^( EXPLICIT_TIME ^( HOURS_OF_DAY INT[\"12\"] ) ^( MINUTES_OF_HOUR INT[\"0\"] ) AM_PM[\"pm\"] )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(287,19);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPLICIT_TIME, "EXPLICIT_TIME"), root_1);

                        dbg.location(287,33);
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:287:33: ^( HOURS_OF_DAY INT[\"12\"] )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        dbg.location(287,35);
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(HOURS_OF_DAY, "HOURS_OF_DAY"), root_2);

                        dbg.location(287,48);
                        adaptor.addChild(root_2, (Object)adaptor.create(INT, "12"));

                        adaptor.addChild(root_1, root_2);
                        }
                        dbg.location(287,59);
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:287:59: ^( MINUTES_OF_HOUR INT[\"0\"] )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        dbg.location(287,61);
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(MINUTES_OF_HOUR, "MINUTES_OF_HOUR"), root_2);

                        dbg.location(287,77);
                        adaptor.addChild(root_2, (Object)adaptor.create(INT, "0"));

                        adaptor.addChild(root_1, root_2);
                        }
                        dbg.location(287,87);
                        adaptor.addChild(root_1, (Object)adaptor.create(AM_PM, "pm"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:288:5: MIDNIGHT
                    {
                    dbg.location(288,5);
                    MIDNIGHT194=(Token)match(input,MIDNIGHT,FOLLOW_MIDNIGHT_in_named_time2476); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_MIDNIGHT.add(MIDNIGHT194);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 288:14: -> ^( EXPLICIT_TIME ^( HOURS_OF_DAY INT[\"12\"] ) ^( MINUTES_OF_HOUR INT[\"0\"] ) AM_PM[\"am\"] )
                    {
                        dbg.location(288,17);
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:288:17: ^( EXPLICIT_TIME ^( HOURS_OF_DAY INT[\"12\"] ) ^( MINUTES_OF_HOUR INT[\"0\"] ) AM_PM[\"am\"] )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(288,19);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPLICIT_TIME, "EXPLICIT_TIME"), root_1);

                        dbg.location(288,33);
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:288:33: ^( HOURS_OF_DAY INT[\"12\"] )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        dbg.location(288,35);
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(HOURS_OF_DAY, "HOURS_OF_DAY"), root_2);

                        dbg.location(288,48);
                        adaptor.addChild(root_2, (Object)adaptor.create(INT, "12"));

                        adaptor.addChild(root_1, root_2);
                        }
                        dbg.location(288,59);
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:288:59: ^( MINUTES_OF_HOUR INT[\"0\"] )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        dbg.location(288,61);
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(MINUTES_OF_HOUR, "MINUTES_OF_HOUR"), root_2);

                        dbg.location(288,77);
                        adaptor.addChild(root_2, (Object)adaptor.create(INT, "0"));

                        adaptor.addChild(root_1, root_2);
                        }
                        dbg.location(288,87);
                        adaptor.addChild(root_1, (Object)adaptor.create(AM_PM, "am"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(289, 3);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "named_time");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "named_time"

    public static class int_00_to_23_optional_prefix_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "int_00_to_23_optional_prefix"
    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:294:1: int_00_to_23_optional_prefix : ( INT_0 | INT_00 | INT_1_TO_5 | INT_6_TO_9 | INT_01_TO_12 | INT_13_TO_23 ) -> INT[$int_00_to_23_optional_prefix.text] ;
    public final DateParser.int_00_to_23_optional_prefix_return int_00_to_23_optional_prefix() throws RecognitionException {
        DateParser.int_00_to_23_optional_prefix_return retval = new DateParser.int_00_to_23_optional_prefix_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token INT_0195=null;
        Token INT_00196=null;
        Token INT_1_TO_5197=null;
        Token INT_6_TO_9198=null;
        Token INT_01_TO_12199=null;
        Token INT_13_TO_23200=null;

        Object INT_0195_tree=null;
        Object INT_00196_tree=null;
        Object INT_1_TO_5197_tree=null;
        Object INT_6_TO_9198_tree=null;
        Object INT_01_TO_12199_tree=null;
        Object INT_13_TO_23200_tree=null;
        RewriteRuleTokenStream stream_INT_1_TO_5=new RewriteRuleTokenStream(adaptor,"token INT_1_TO_5");
        RewriteRuleTokenStream stream_INT_13_TO_23=new RewriteRuleTokenStream(adaptor,"token INT_13_TO_23");
        RewriteRuleTokenStream stream_INT_00=new RewriteRuleTokenStream(adaptor,"token INT_00");
        RewriteRuleTokenStream stream_INT_6_TO_9=new RewriteRuleTokenStream(adaptor,"token INT_6_TO_9");
        RewriteRuleTokenStream stream_INT_01_TO_12=new RewriteRuleTokenStream(adaptor,"token INT_01_TO_12");
        RewriteRuleTokenStream stream_INT_0=new RewriteRuleTokenStream(adaptor,"token INT_0");

        try { dbg.enterRule(getGrammarFileName(), "int_00_to_23_optional_prefix");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(294, 1);

        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:295:3: ( ( INT_0 | INT_00 | INT_1_TO_5 | INT_6_TO_9 | INT_01_TO_12 | INT_13_TO_23 ) -> INT[$int_00_to_23_optional_prefix.text] )
            dbg.enterAlt(1);

            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:295:5: ( INT_0 | INT_00 | INT_1_TO_5 | INT_6_TO_9 | INT_01_TO_12 | INT_13_TO_23 )
            {
            dbg.location(295,5);
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:295:5: ( INT_0 | INT_00 | INT_1_TO_5 | INT_6_TO_9 | INT_01_TO_12 | INT_13_TO_23 )
            int alt58=6;
            try { dbg.enterSubRule(58);
            try { dbg.enterDecision(58);

            switch ( input.LA(1) ) {
            case INT_0:
                {
                alt58=1;
                }
                break;
            case INT_00:
                {
                alt58=2;
                }
                break;
            case INT_1_TO_5:
                {
                alt58=3;
                }
                break;
            case INT_6_TO_9:
                {
                alt58=4;
                }
                break;
            case INT_01_TO_12:
                {
                alt58=5;
                }
                break;
            case INT_13_TO_23:
                {
                alt58=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(58);}

            switch (alt58) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:295:6: INT_0
                    {
                    dbg.location(295,6);
                    INT_0195=(Token)match(input,INT_0,FOLLOW_INT_0_in_int_00_to_23_optional_prefix2518); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INT_0.add(INT_0195);


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:296:5: INT_00
                    {
                    dbg.location(296,5);
                    INT_00196=(Token)match(input,INT_00,FOLLOW_INT_00_in_int_00_to_23_optional_prefix2524); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INT_00.add(INT_00196);


                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:297:5: INT_1_TO_5
                    {
                    dbg.location(297,5);
                    INT_1_TO_5197=(Token)match(input,INT_1_TO_5,FOLLOW_INT_1_TO_5_in_int_00_to_23_optional_prefix2530); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INT_1_TO_5.add(INT_1_TO_5197);


                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:298:5: INT_6_TO_9
                    {
                    dbg.location(298,5);
                    INT_6_TO_9198=(Token)match(input,INT_6_TO_9,FOLLOW_INT_6_TO_9_in_int_00_to_23_optional_prefix2536); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INT_6_TO_9.add(INT_6_TO_9198);


                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:299:5: INT_01_TO_12
                    {
                    dbg.location(299,5);
                    INT_01_TO_12199=(Token)match(input,INT_01_TO_12,FOLLOW_INT_01_TO_12_in_int_00_to_23_optional_prefix2542); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INT_01_TO_12.add(INT_01_TO_12199);


                    }
                    break;
                case 6 :
                    dbg.enterAlt(6);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:300:5: INT_13_TO_23
                    {
                    dbg.location(300,5);
                    INT_13_TO_23200=(Token)match(input,INT_13_TO_23,FOLLOW_INT_13_TO_23_in_int_00_to_23_optional_prefix2548); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INT_13_TO_23.add(INT_13_TO_23200);


                    }
                    break;

            }
            } finally {dbg.exitSubRule(58);}



            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 300:19: -> INT[$int_00_to_23_optional_prefix.text]
            {
                dbg.location(300,22);
                adaptor.addChild(root_0, (Object)adaptor.create(INT, input.toString(retval.start,input.LT(-1))));

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(301, 3);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "int_00_to_23_optional_prefix");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "int_00_to_23_optional_prefix"

    public static class int_00_to_59_mandatory_prefix_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "int_00_to_59_mandatory_prefix"
    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:304:1: int_00_to_59_mandatory_prefix : ( INT_00 | INT_01_TO_12 | INT_13_TO_23 | INT_24_TO_31 | INT_32_TO_59 ) -> INT[$int_00_to_59_mandatory_prefix.text] ;
    public final DateParser.int_00_to_59_mandatory_prefix_return int_00_to_59_mandatory_prefix() throws RecognitionException {
        DateParser.int_00_to_59_mandatory_prefix_return retval = new DateParser.int_00_to_59_mandatory_prefix_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token INT_00201=null;
        Token INT_01_TO_12202=null;
        Token INT_13_TO_23203=null;
        Token INT_24_TO_31204=null;
        Token INT_32_TO_59205=null;

        Object INT_00201_tree=null;
        Object INT_01_TO_12202_tree=null;
        Object INT_13_TO_23203_tree=null;
        Object INT_24_TO_31204_tree=null;
        Object INT_32_TO_59205_tree=null;
        RewriteRuleTokenStream stream_INT_24_TO_31=new RewriteRuleTokenStream(adaptor,"token INT_24_TO_31");
        RewriteRuleTokenStream stream_INT_13_TO_23=new RewriteRuleTokenStream(adaptor,"token INT_13_TO_23");
        RewriteRuleTokenStream stream_INT_00=new RewriteRuleTokenStream(adaptor,"token INT_00");
        RewriteRuleTokenStream stream_INT_32_TO_59=new RewriteRuleTokenStream(adaptor,"token INT_32_TO_59");
        RewriteRuleTokenStream stream_INT_01_TO_12=new RewriteRuleTokenStream(adaptor,"token INT_01_TO_12");

        try { dbg.enterRule(getGrammarFileName(), "int_00_to_59_mandatory_prefix");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(304, 1);

        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:305:3: ( ( INT_00 | INT_01_TO_12 | INT_13_TO_23 | INT_24_TO_31 | INT_32_TO_59 ) -> INT[$int_00_to_59_mandatory_prefix.text] )
            dbg.enterAlt(1);

            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:305:5: ( INT_00 | INT_01_TO_12 | INT_13_TO_23 | INT_24_TO_31 | INT_32_TO_59 )
            {
            dbg.location(305,5);
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:305:5: ( INT_00 | INT_01_TO_12 | INT_13_TO_23 | INT_24_TO_31 | INT_32_TO_59 )
            int alt59=5;
            try { dbg.enterSubRule(59);
            try { dbg.enterDecision(59);

            switch ( input.LA(1) ) {
            case INT_00:
                {
                alt59=1;
                }
                break;
            case INT_01_TO_12:
                {
                alt59=2;
                }
                break;
            case INT_13_TO_23:
                {
                alt59=3;
                }
                break;
            case INT_24_TO_31:
                {
                alt59=4;
                }
                break;
            case INT_32_TO_59:
                {
                alt59=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(59);}

            switch (alt59) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:305:6: INT_00
                    {
                    dbg.location(305,6);
                    INT_00201=(Token)match(input,INT_00,FOLLOW_INT_00_in_int_00_to_59_mandatory_prefix2570); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INT_00.add(INT_00201);


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:306:5: INT_01_TO_12
                    {
                    dbg.location(306,5);
                    INT_01_TO_12202=(Token)match(input,INT_01_TO_12,FOLLOW_INT_01_TO_12_in_int_00_to_59_mandatory_prefix2576); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INT_01_TO_12.add(INT_01_TO_12202);


                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:307:5: INT_13_TO_23
                    {
                    dbg.location(307,5);
                    INT_13_TO_23203=(Token)match(input,INT_13_TO_23,FOLLOW_INT_13_TO_23_in_int_00_to_59_mandatory_prefix2582); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INT_13_TO_23.add(INT_13_TO_23203);


                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:308:5: INT_24_TO_31
                    {
                    dbg.location(308,5);
                    INT_24_TO_31204=(Token)match(input,INT_24_TO_31,FOLLOW_INT_24_TO_31_in_int_00_to_59_mandatory_prefix2588); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INT_24_TO_31.add(INT_24_TO_31204);


                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:309:5: INT_32_TO_59
                    {
                    dbg.location(309,5);
                    INT_32_TO_59205=(Token)match(input,INT_32_TO_59,FOLLOW_INT_32_TO_59_in_int_00_to_59_mandatory_prefix2594); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INT_32_TO_59.add(INT_32_TO_59205);


                    }
                    break;

            }
            } finally {dbg.exitSubRule(59);}



            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 309:19: -> INT[$int_00_to_59_mandatory_prefix.text]
            {
                dbg.location(309,22);
                adaptor.addChild(root_0, (Object)adaptor.create(INT, input.toString(retval.start,input.LT(-1))));

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(310, 3);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "int_00_to_59_mandatory_prefix");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "int_00_to_59_mandatory_prefix"

    public static class int_00_to_99_mandatory_prefix_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "int_00_to_99_mandatory_prefix"
    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:313:1: int_00_to_99_mandatory_prefix : ( int_00_to_59_mandatory_prefix | INT_60_TO_99 -> INT[$INT_60_TO_99.text] );
    public final DateParser.int_00_to_99_mandatory_prefix_return int_00_to_99_mandatory_prefix() throws RecognitionException {
        DateParser.int_00_to_99_mandatory_prefix_return retval = new DateParser.int_00_to_99_mandatory_prefix_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token INT_60_TO_99207=null;
        DateParser.int_00_to_59_mandatory_prefix_return int_00_to_59_mandatory_prefix206 = null;


        Object INT_60_TO_99207_tree=null;
        RewriteRuleTokenStream stream_INT_60_TO_99=new RewriteRuleTokenStream(adaptor,"token INT_60_TO_99");

        try { dbg.enterRule(getGrammarFileName(), "int_00_to_99_mandatory_prefix");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(313, 1);

        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:314:3: ( int_00_to_59_mandatory_prefix | INT_60_TO_99 -> INT[$INT_60_TO_99.text] )
            int alt60=2;
            try { dbg.enterDecision(60);

            int LA60_0 = input.LA(1);

            if ( (LA60_0==INT_00||(LA60_0>=INT_01_TO_12 && LA60_0<=INT_32_TO_59)) ) {
                alt60=1;
            }
            else if ( (LA60_0==INT_60_TO_99) ) {
                alt60=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(60);}

            switch (alt60) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:314:5: int_00_to_59_mandatory_prefix
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(314,5);
                    pushFollow(FOLLOW_int_00_to_59_mandatory_prefix_in_int_00_to_99_mandatory_prefix2616);
                    int_00_to_59_mandatory_prefix206=int_00_to_59_mandatory_prefix();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, int_00_to_59_mandatory_prefix206.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:315:5: INT_60_TO_99
                    {
                    dbg.location(315,5);
                    INT_60_TO_99207=(Token)match(input,INT_60_TO_99,FOLLOW_INT_60_TO_99_in_int_00_to_99_mandatory_prefix2622); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INT_60_TO_99.add(INT_60_TO_99207);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 315:18: -> INT[$INT_60_TO_99.text]
                    {
                        dbg.location(315,21);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, (INT_60_TO_99207!=null?INT_60_TO_99207.getText():null)));

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(316, 3);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "int_00_to_99_mandatory_prefix");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "int_00_to_99_mandatory_prefix"

    public static class int_01_to_12_optional_prefix_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "int_01_to_12_optional_prefix"
    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:319:1: int_01_to_12_optional_prefix : ( INT_1_TO_5 | INT_6_TO_9 | INT_01_TO_12 ) -> INT[$int_01_to_12_optional_prefix.text] ;
    public final DateParser.int_01_to_12_optional_prefix_return int_01_to_12_optional_prefix() throws RecognitionException {
        DateParser.int_01_to_12_optional_prefix_return retval = new DateParser.int_01_to_12_optional_prefix_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token INT_1_TO_5208=null;
        Token INT_6_TO_9209=null;
        Token INT_01_TO_12210=null;

        Object INT_1_TO_5208_tree=null;
        Object INT_6_TO_9209_tree=null;
        Object INT_01_TO_12210_tree=null;
        RewriteRuleTokenStream stream_INT_1_TO_5=new RewriteRuleTokenStream(adaptor,"token INT_1_TO_5");
        RewriteRuleTokenStream stream_INT_6_TO_9=new RewriteRuleTokenStream(adaptor,"token INT_6_TO_9");
        RewriteRuleTokenStream stream_INT_01_TO_12=new RewriteRuleTokenStream(adaptor,"token INT_01_TO_12");

        try { dbg.enterRule(getGrammarFileName(), "int_01_to_12_optional_prefix");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(319, 1);

        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:320:3: ( ( INT_1_TO_5 | INT_6_TO_9 | INT_01_TO_12 ) -> INT[$int_01_to_12_optional_prefix.text] )
            dbg.enterAlt(1);

            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:320:5: ( INT_1_TO_5 | INT_6_TO_9 | INT_01_TO_12 )
            {
            dbg.location(320,5);
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:320:5: ( INT_1_TO_5 | INT_6_TO_9 | INT_01_TO_12 )
            int alt61=3;
            try { dbg.enterSubRule(61);
            try { dbg.enterDecision(61);

            switch ( input.LA(1) ) {
            case INT_1_TO_5:
                {
                alt61=1;
                }
                break;
            case INT_6_TO_9:
                {
                alt61=2;
                }
                break;
            case INT_01_TO_12:
                {
                alt61=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(61);}

            switch (alt61) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:320:6: INT_1_TO_5
                    {
                    dbg.location(320,6);
                    INT_1_TO_5208=(Token)match(input,INT_1_TO_5,FOLLOW_INT_1_TO_5_in_int_01_to_12_optional_prefix2644); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INT_1_TO_5.add(INT_1_TO_5208);


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:320:19: INT_6_TO_9
                    {
                    dbg.location(320,19);
                    INT_6_TO_9209=(Token)match(input,INT_6_TO_9,FOLLOW_INT_6_TO_9_in_int_01_to_12_optional_prefix2648); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INT_6_TO_9.add(INT_6_TO_9209);


                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:320:32: INT_01_TO_12
                    {
                    dbg.location(320,32);
                    INT_01_TO_12210=(Token)match(input,INT_01_TO_12,FOLLOW_INT_01_TO_12_in_int_01_to_12_optional_prefix2652); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INT_01_TO_12.add(INT_01_TO_12210);


                    }
                    break;

            }
            } finally {dbg.exitSubRule(61);}



            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 320:46: -> INT[$int_01_to_12_optional_prefix.text]
            {
                dbg.location(320,49);
                adaptor.addChild(root_0, (Object)adaptor.create(INT, input.toString(retval.start,input.LT(-1))));

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(321, 3);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "int_01_to_12_optional_prefix");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "int_01_to_12_optional_prefix"

    public static class int_01_to_31_optional_prefix_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "int_01_to_31_optional_prefix"
    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:324:1: int_01_to_31_optional_prefix : ( INT_1_TO_5 | INT_6_TO_9 | INT_01_TO_12 | INT_13_TO_23 | INT_24_TO_31 ) -> INT[$int_01_to_31_optional_prefix.text] ;
    public final DateParser.int_01_to_31_optional_prefix_return int_01_to_31_optional_prefix() throws RecognitionException {
        DateParser.int_01_to_31_optional_prefix_return retval = new DateParser.int_01_to_31_optional_prefix_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token INT_1_TO_5211=null;
        Token INT_6_TO_9212=null;
        Token INT_01_TO_12213=null;
        Token INT_13_TO_23214=null;
        Token INT_24_TO_31215=null;

        Object INT_1_TO_5211_tree=null;
        Object INT_6_TO_9212_tree=null;
        Object INT_01_TO_12213_tree=null;
        Object INT_13_TO_23214_tree=null;
        Object INT_24_TO_31215_tree=null;
        RewriteRuleTokenStream stream_INT_24_TO_31=new RewriteRuleTokenStream(adaptor,"token INT_24_TO_31");
        RewriteRuleTokenStream stream_INT_1_TO_5=new RewriteRuleTokenStream(adaptor,"token INT_1_TO_5");
        RewriteRuleTokenStream stream_INT_13_TO_23=new RewriteRuleTokenStream(adaptor,"token INT_13_TO_23");
        RewriteRuleTokenStream stream_INT_6_TO_9=new RewriteRuleTokenStream(adaptor,"token INT_6_TO_9");
        RewriteRuleTokenStream stream_INT_01_TO_12=new RewriteRuleTokenStream(adaptor,"token INT_01_TO_12");

        try { dbg.enterRule(getGrammarFileName(), "int_01_to_31_optional_prefix");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(324, 1);

        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:325:3: ( ( INT_1_TO_5 | INT_6_TO_9 | INT_01_TO_12 | INT_13_TO_23 | INT_24_TO_31 ) -> INT[$int_01_to_31_optional_prefix.text] )
            dbg.enterAlt(1);

            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:325:5: ( INT_1_TO_5 | INT_6_TO_9 | INT_01_TO_12 | INT_13_TO_23 | INT_24_TO_31 )
            {
            dbg.location(325,5);
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:325:5: ( INT_1_TO_5 | INT_6_TO_9 | INT_01_TO_12 | INT_13_TO_23 | INT_24_TO_31 )
            int alt62=5;
            try { dbg.enterSubRule(62);
            try { dbg.enterDecision(62);

            switch ( input.LA(1) ) {
            case INT_1_TO_5:
                {
                alt62=1;
                }
                break;
            case INT_6_TO_9:
                {
                alt62=2;
                }
                break;
            case INT_01_TO_12:
                {
                alt62=3;
                }
                break;
            case INT_13_TO_23:
                {
                alt62=4;
                }
                break;
            case INT_24_TO_31:
                {
                alt62=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 62, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(62);}

            switch (alt62) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:325:6: INT_1_TO_5
                    {
                    dbg.location(325,6);
                    INT_1_TO_5211=(Token)match(input,INT_1_TO_5,FOLLOW_INT_1_TO_5_in_int_01_to_31_optional_prefix2675); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INT_1_TO_5.add(INT_1_TO_5211);


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:326:5: INT_6_TO_9
                    {
                    dbg.location(326,5);
                    INT_6_TO_9212=(Token)match(input,INT_6_TO_9,FOLLOW_INT_6_TO_9_in_int_01_to_31_optional_prefix2681); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INT_6_TO_9.add(INT_6_TO_9212);


                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:327:5: INT_01_TO_12
                    {
                    dbg.location(327,5);
                    INT_01_TO_12213=(Token)match(input,INT_01_TO_12,FOLLOW_INT_01_TO_12_in_int_01_to_31_optional_prefix2687); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INT_01_TO_12.add(INT_01_TO_12213);


                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:328:5: INT_13_TO_23
                    {
                    dbg.location(328,5);
                    INT_13_TO_23214=(Token)match(input,INT_13_TO_23,FOLLOW_INT_13_TO_23_in_int_01_to_31_optional_prefix2693); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INT_13_TO_23.add(INT_13_TO_23214);


                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:329:5: INT_24_TO_31
                    {
                    dbg.location(329,5);
                    INT_24_TO_31215=(Token)match(input,INT_24_TO_31,FOLLOW_INT_24_TO_31_in_int_01_to_31_optional_prefix2699); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INT_24_TO_31.add(INT_24_TO_31215);


                    }
                    break;

            }
            } finally {dbg.exitSubRule(62);}



            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 329:19: -> INT[$int_01_to_31_optional_prefix.text]
            {
                dbg.location(329,22);
                adaptor.addChild(root_0, (Object)adaptor.create(INT, input.toString(retval.start,input.LT(-1))));

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(330, 3);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "int_01_to_31_optional_prefix");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "int_01_to_31_optional_prefix"

    public static class int_four_digits_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "int_four_digits"
    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:333:1: int_four_digits : int_00_to_99_mandatory_prefix int_00_to_99_mandatory_prefix -> INT[$int_four_digits.text] ;
    public final DateParser.int_four_digits_return int_four_digits() throws RecognitionException {
        DateParser.int_four_digits_return retval = new DateParser.int_four_digits_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        DateParser.int_00_to_99_mandatory_prefix_return int_00_to_99_mandatory_prefix216 = null;

        DateParser.int_00_to_99_mandatory_prefix_return int_00_to_99_mandatory_prefix217 = null;


        RewriteRuleSubtreeStream stream_int_00_to_99_mandatory_prefix=new RewriteRuleSubtreeStream(adaptor,"rule int_00_to_99_mandatory_prefix");
        try { dbg.enterRule(getGrammarFileName(), "int_four_digits");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(333, 1);

        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:334:3: ( int_00_to_99_mandatory_prefix int_00_to_99_mandatory_prefix -> INT[$int_four_digits.text] )
            dbg.enterAlt(1);

            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:334:5: int_00_to_99_mandatory_prefix int_00_to_99_mandatory_prefix
            {
            dbg.location(334,5);
            pushFollow(FOLLOW_int_00_to_99_mandatory_prefix_in_int_four_digits2721);
            int_00_to_99_mandatory_prefix216=int_00_to_99_mandatory_prefix();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_int_00_to_99_mandatory_prefix.add(int_00_to_99_mandatory_prefix216.getTree());
            dbg.location(334,35);
            pushFollow(FOLLOW_int_00_to_99_mandatory_prefix_in_int_four_digits2723);
            int_00_to_99_mandatory_prefix217=int_00_to_99_mandatory_prefix();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_int_00_to_99_mandatory_prefix.add(int_00_to_99_mandatory_prefix217.getTree());


            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 335:7: -> INT[$int_four_digits.text]
            {
                dbg.location(335,10);
                adaptor.addChild(root_0, (Object)adaptor.create(INT, input.toString(retval.start,input.LT(-1))));

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(336, 3);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "int_four_digits");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "int_four_digits"

    public static class spelled_or_int_01_to_31_optional_prefix_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "spelled_or_int_01_to_31_optional_prefix"
    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:340:1: spelled_or_int_01_to_31_optional_prefix : ( int_01_to_31_optional_prefix | spelled_one_to_thirty_one );
    public final DateParser.spelled_or_int_01_to_31_optional_prefix_return spelled_or_int_01_to_31_optional_prefix() throws RecognitionException {
        DateParser.spelled_or_int_01_to_31_optional_prefix_return retval = new DateParser.spelled_or_int_01_to_31_optional_prefix_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        DateParser.int_01_to_31_optional_prefix_return int_01_to_31_optional_prefix218 = null;

        DateParser.spelled_one_to_thirty_one_return spelled_one_to_thirty_one219 = null;



        try { dbg.enterRule(getGrammarFileName(), "spelled_or_int_01_to_31_optional_prefix");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(340, 1);

        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:341:3: ( int_01_to_31_optional_prefix | spelled_one_to_thirty_one )
            int alt63=2;
            try { dbg.enterDecision(63);

            int LA63_0 = input.LA(1);

            if ( (LA63_0==INT_1_TO_5||(LA63_0>=INT_6_TO_9 && LA63_0<=INT_24_TO_31)) ) {
                alt63=1;
            }
            else if ( ((LA63_0>=ONE && LA63_0<=THIRTY)) ) {
                alt63=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 63, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(63);}

            switch (alt63) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:341:5: int_01_to_31_optional_prefix
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(341,5);
                    pushFollow(FOLLOW_int_01_to_31_optional_prefix_in_spelled_or_int_01_to_31_optional_prefix2751);
                    int_01_to_31_optional_prefix218=int_01_to_31_optional_prefix();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, int_01_to_31_optional_prefix218.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:342:5: spelled_one_to_thirty_one
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(342,5);
                    pushFollow(FOLLOW_spelled_one_to_thirty_one_in_spelled_or_int_01_to_31_optional_prefix2757);
                    spelled_one_to_thirty_one219=spelled_one_to_thirty_one();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, spelled_one_to_thirty_one219.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(343, 3);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "spelled_or_int_01_to_31_optional_prefix");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "spelled_or_int_01_to_31_optional_prefix"

    public static class spelled_one_to_thirty_one_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "spelled_one_to_thirty_one"
    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:346:1: spelled_one_to_thirty_one : ( ONE -> INT[\"1\"] | TWO -> INT[\"2\"] | THREE -> INT[\"3\"] | FOUR -> INT[\"4\"] | FIVE -> INT[\"5\"] | SIX -> INT[\"6\"] | SEVEN -> INT[\"7\"] | EIGHT -> INT[\"8\"] | NINE -> INT[\"9\"] | TEN -> INT[\"10\"] | ELEVEN -> INT[\"11\"] | TWELVE -> INT[\"12\"] | THIRTEEN -> INT[\"13\"] | FOURTEEN -> INT[\"14\"] | FIFTEEN -> INT[\"15\"] | SIXTEEN -> INT[\"16\"] | SEVENTEEN -> INT[\"17\"] | EIGHTEEN -> INT[\"18\"] | NINETEEN -> INT[\"19\"] | TWENTY -> INT[\"20\"] | TWENTY ( DASH | WHITE_SPACE )? ONE -> INT[\"21\"] | TWENTY ( DASH | WHITE_SPACE )? TWO -> INT[\"22\"] | TWENTY ( DASH | WHITE_SPACE )? THREE -> INT[\"23\"] | TWENTY ( DASH | WHITE_SPACE )? FOUR -> INT[\"24\"] | TWENTY ( DASH | WHITE_SPACE )? FIVE -> INT[\"25\"] | TWENTY ( DASH | WHITE_SPACE )? SIX -> INT[\"26\"] | TWENTY ( DASH | WHITE_SPACE )? SEVEN -> INT[\"27\"] | TWENTY ( DASH | WHITE_SPACE )? EIGHT -> INT[\"28\"] | TWENTY ( DASH | WHITE_SPACE )? NINE -> INT[\"29\"] | THIRTY -> INT[\"30\"] | THIRTY ( DASH | WHITE_SPACE )? ONE -> INT[\"31\"] );
    public final DateParser.spelled_one_to_thirty_one_return spelled_one_to_thirty_one() throws RecognitionException {
        DateParser.spelled_one_to_thirty_one_return retval = new DateParser.spelled_one_to_thirty_one_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ONE220=null;
        Token TWO221=null;
        Token THREE222=null;
        Token FOUR223=null;
        Token FIVE224=null;
        Token SIX225=null;
        Token SEVEN226=null;
        Token EIGHT227=null;
        Token NINE228=null;
        Token TEN229=null;
        Token ELEVEN230=null;
        Token TWELVE231=null;
        Token THIRTEEN232=null;
        Token FOURTEEN233=null;
        Token FIFTEEN234=null;
        Token SIXTEEN235=null;
        Token SEVENTEEN236=null;
        Token EIGHTEEN237=null;
        Token NINETEEN238=null;
        Token TWENTY239=null;
        Token TWENTY240=null;
        Token DASH241=null;
        Token WHITE_SPACE242=null;
        Token ONE243=null;
        Token TWENTY244=null;
        Token DASH245=null;
        Token WHITE_SPACE246=null;
        Token TWO247=null;
        Token TWENTY248=null;
        Token DASH249=null;
        Token WHITE_SPACE250=null;
        Token THREE251=null;
        Token TWENTY252=null;
        Token DASH253=null;
        Token WHITE_SPACE254=null;
        Token FOUR255=null;
        Token TWENTY256=null;
        Token DASH257=null;
        Token WHITE_SPACE258=null;
        Token FIVE259=null;
        Token TWENTY260=null;
        Token DASH261=null;
        Token WHITE_SPACE262=null;
        Token SIX263=null;
        Token TWENTY264=null;
        Token DASH265=null;
        Token WHITE_SPACE266=null;
        Token SEVEN267=null;
        Token TWENTY268=null;
        Token DASH269=null;
        Token WHITE_SPACE270=null;
        Token EIGHT271=null;
        Token TWENTY272=null;
        Token DASH273=null;
        Token WHITE_SPACE274=null;
        Token NINE275=null;
        Token THIRTY276=null;
        Token THIRTY277=null;
        Token DASH278=null;
        Token WHITE_SPACE279=null;
        Token ONE280=null;

        Object ONE220_tree=null;
        Object TWO221_tree=null;
        Object THREE222_tree=null;
        Object FOUR223_tree=null;
        Object FIVE224_tree=null;
        Object SIX225_tree=null;
        Object SEVEN226_tree=null;
        Object EIGHT227_tree=null;
        Object NINE228_tree=null;
        Object TEN229_tree=null;
        Object ELEVEN230_tree=null;
        Object TWELVE231_tree=null;
        Object THIRTEEN232_tree=null;
        Object FOURTEEN233_tree=null;
        Object FIFTEEN234_tree=null;
        Object SIXTEEN235_tree=null;
        Object SEVENTEEN236_tree=null;
        Object EIGHTEEN237_tree=null;
        Object NINETEEN238_tree=null;
        Object TWENTY239_tree=null;
        Object TWENTY240_tree=null;
        Object DASH241_tree=null;
        Object WHITE_SPACE242_tree=null;
        Object ONE243_tree=null;
        Object TWENTY244_tree=null;
        Object DASH245_tree=null;
        Object WHITE_SPACE246_tree=null;
        Object TWO247_tree=null;
        Object TWENTY248_tree=null;
        Object DASH249_tree=null;
        Object WHITE_SPACE250_tree=null;
        Object THREE251_tree=null;
        Object TWENTY252_tree=null;
        Object DASH253_tree=null;
        Object WHITE_SPACE254_tree=null;
        Object FOUR255_tree=null;
        Object TWENTY256_tree=null;
        Object DASH257_tree=null;
        Object WHITE_SPACE258_tree=null;
        Object FIVE259_tree=null;
        Object TWENTY260_tree=null;
        Object DASH261_tree=null;
        Object WHITE_SPACE262_tree=null;
        Object SIX263_tree=null;
        Object TWENTY264_tree=null;
        Object DASH265_tree=null;
        Object WHITE_SPACE266_tree=null;
        Object SEVEN267_tree=null;
        Object TWENTY268_tree=null;
        Object DASH269_tree=null;
        Object WHITE_SPACE270_tree=null;
        Object EIGHT271_tree=null;
        Object TWENTY272_tree=null;
        Object DASH273_tree=null;
        Object WHITE_SPACE274_tree=null;
        Object NINE275_tree=null;
        Object THIRTY276_tree=null;
        Object THIRTY277_tree=null;
        Object DASH278_tree=null;
        Object WHITE_SPACE279_tree=null;
        Object ONE280_tree=null;
        RewriteRuleTokenStream stream_NINETEEN=new RewriteRuleTokenStream(adaptor,"token NINETEEN");
        RewriteRuleTokenStream stream_DASH=new RewriteRuleTokenStream(adaptor,"token DASH");
        RewriteRuleTokenStream stream_TWENTY=new RewriteRuleTokenStream(adaptor,"token TWENTY");
        RewriteRuleTokenStream stream_FOUR=new RewriteRuleTokenStream(adaptor,"token FOUR");
        RewriteRuleTokenStream stream_SIXTEEN=new RewriteRuleTokenStream(adaptor,"token SIXTEEN");
        RewriteRuleTokenStream stream_FIVE=new RewriteRuleTokenStream(adaptor,"token FIVE");
        RewriteRuleTokenStream stream_THIRTY=new RewriteRuleTokenStream(adaptor,"token THIRTY");
        RewriteRuleTokenStream stream_TWELVE=new RewriteRuleTokenStream(adaptor,"token TWELVE");
        RewriteRuleTokenStream stream_FIFTEEN=new RewriteRuleTokenStream(adaptor,"token FIFTEEN");
        RewriteRuleTokenStream stream_TEN=new RewriteRuleTokenStream(adaptor,"token TEN");
        RewriteRuleTokenStream stream_SEVEN=new RewriteRuleTokenStream(adaptor,"token SEVEN");
        RewriteRuleTokenStream stream_NINE=new RewriteRuleTokenStream(adaptor,"token NINE");
        RewriteRuleTokenStream stream_ELEVEN=new RewriteRuleTokenStream(adaptor,"token ELEVEN");
        RewriteRuleTokenStream stream_THIRTEEN=new RewriteRuleTokenStream(adaptor,"token THIRTEEN");
        RewriteRuleTokenStream stream_ONE=new RewriteRuleTokenStream(adaptor,"token ONE");
        RewriteRuleTokenStream stream_TWO=new RewriteRuleTokenStream(adaptor,"token TWO");
        RewriteRuleTokenStream stream_THREE=new RewriteRuleTokenStream(adaptor,"token THREE");
        RewriteRuleTokenStream stream_FOURTEEN=new RewriteRuleTokenStream(adaptor,"token FOURTEEN");
        RewriteRuleTokenStream stream_EIGHTEEN=new RewriteRuleTokenStream(adaptor,"token EIGHTEEN");
        RewriteRuleTokenStream stream_SIX=new RewriteRuleTokenStream(adaptor,"token SIX");
        RewriteRuleTokenStream stream_WHITE_SPACE=new RewriteRuleTokenStream(adaptor,"token WHITE_SPACE");
        RewriteRuleTokenStream stream_SEVENTEEN=new RewriteRuleTokenStream(adaptor,"token SEVENTEEN");
        RewriteRuleTokenStream stream_EIGHT=new RewriteRuleTokenStream(adaptor,"token EIGHT");

        try { dbg.enterRule(getGrammarFileName(), "spelled_one_to_thirty_one");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(346, 1);

        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:347:3: ( ONE -> INT[\"1\"] | TWO -> INT[\"2\"] | THREE -> INT[\"3\"] | FOUR -> INT[\"4\"] | FIVE -> INT[\"5\"] | SIX -> INT[\"6\"] | SEVEN -> INT[\"7\"] | EIGHT -> INT[\"8\"] | NINE -> INT[\"9\"] | TEN -> INT[\"10\"] | ELEVEN -> INT[\"11\"] | TWELVE -> INT[\"12\"] | THIRTEEN -> INT[\"13\"] | FOURTEEN -> INT[\"14\"] | FIFTEEN -> INT[\"15\"] | SIXTEEN -> INT[\"16\"] | SEVENTEEN -> INT[\"17\"] | EIGHTEEN -> INT[\"18\"] | NINETEEN -> INT[\"19\"] | TWENTY -> INT[\"20\"] | TWENTY ( DASH | WHITE_SPACE )? ONE -> INT[\"21\"] | TWENTY ( DASH | WHITE_SPACE )? TWO -> INT[\"22\"] | TWENTY ( DASH | WHITE_SPACE )? THREE -> INT[\"23\"] | TWENTY ( DASH | WHITE_SPACE )? FOUR -> INT[\"24\"] | TWENTY ( DASH | WHITE_SPACE )? FIVE -> INT[\"25\"] | TWENTY ( DASH | WHITE_SPACE )? SIX -> INT[\"26\"] | TWENTY ( DASH | WHITE_SPACE )? SEVEN -> INT[\"27\"] | TWENTY ( DASH | WHITE_SPACE )? EIGHT -> INT[\"28\"] | TWENTY ( DASH | WHITE_SPACE )? NINE -> INT[\"29\"] | THIRTY -> INT[\"30\"] | THIRTY ( DASH | WHITE_SPACE )? ONE -> INT[\"31\"] )
            int alt74=31;
            try { dbg.enterDecision(74);

            try {
                isCyclicDecision = true;
                alt74 = dfa74.predict(input);
            }
            catch (NoViableAltException nvae) {
                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(74);}

            switch (alt74) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:347:5: ONE
                    {
                    dbg.location(347,5);
                    ONE220=(Token)match(input,ONE,FOLLOW_ONE_in_spelled_one_to_thirty_one2773); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ONE.add(ONE220);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 347:16: -> INT[\"1\"]
                    {
                        dbg.location(347,19);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "1"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:348:5: TWO
                    {
                    dbg.location(348,5);
                    TWO221=(Token)match(input,TWO,FOLLOW_TWO_in_spelled_one_to_thirty_one2791); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWO.add(TWO221);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 348:16: -> INT[\"2\"]
                    {
                        dbg.location(348,19);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "2"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:349:5: THREE
                    {
                    dbg.location(349,5);
                    THREE222=(Token)match(input,THREE,FOLLOW_THREE_in_spelled_one_to_thirty_one2809); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THREE.add(THREE222);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 349:16: -> INT[\"3\"]
                    {
                        dbg.location(349,19);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "3"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:350:5: FOUR
                    {
                    dbg.location(350,5);
                    FOUR223=(Token)match(input,FOUR,FOLLOW_FOUR_in_spelled_one_to_thirty_one2825); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FOUR.add(FOUR223);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 350:16: -> INT[\"4\"]
                    {
                        dbg.location(350,19);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "4"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:351:5: FIVE
                    {
                    dbg.location(351,5);
                    FIVE224=(Token)match(input,FIVE,FOLLOW_FIVE_in_spelled_one_to_thirty_one2842); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FIVE.add(FIVE224);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 351:16: -> INT[\"5\"]
                    {
                        dbg.location(351,19);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "5"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 6 :
                    dbg.enterAlt(6);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:352:5: SIX
                    {
                    dbg.location(352,5);
                    SIX225=(Token)match(input,SIX,FOLLOW_SIX_in_spelled_one_to_thirty_one2859); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SIX.add(SIX225);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 352:16: -> INT[\"6\"]
                    {
                        dbg.location(352,19);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "6"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 7 :
                    dbg.enterAlt(7);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:353:5: SEVEN
                    {
                    dbg.location(353,5);
                    SEVEN226=(Token)match(input,SEVEN,FOLLOW_SEVEN_in_spelled_one_to_thirty_one2877); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEVEN.add(SEVEN226);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 353:16: -> INT[\"7\"]
                    {
                        dbg.location(353,19);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "7"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 8 :
                    dbg.enterAlt(8);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:354:5: EIGHT
                    {
                    dbg.location(354,5);
                    EIGHT227=(Token)match(input,EIGHT,FOLLOW_EIGHT_in_spelled_one_to_thirty_one2893); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EIGHT.add(EIGHT227);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 354:16: -> INT[\"8\"]
                    {
                        dbg.location(354,19);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "8"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 9 :
                    dbg.enterAlt(9);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:355:5: NINE
                    {
                    dbg.location(355,5);
                    NINE228=(Token)match(input,NINE,FOLLOW_NINE_in_spelled_one_to_thirty_one2909); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NINE.add(NINE228);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 355:16: -> INT[\"9\"]
                    {
                        dbg.location(355,19);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "9"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 10 :
                    dbg.enterAlt(10);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:356:5: TEN
                    {
                    dbg.location(356,5);
                    TEN229=(Token)match(input,TEN,FOLLOW_TEN_in_spelled_one_to_thirty_one2926); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TEN.add(TEN229);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 356:16: -> INT[\"10\"]
                    {
                        dbg.location(356,19);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "10"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 11 :
                    dbg.enterAlt(11);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:357:5: ELEVEN
                    {
                    dbg.location(357,5);
                    ELEVEN230=(Token)match(input,ELEVEN,FOLLOW_ELEVEN_in_spelled_one_to_thirty_one2944); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ELEVEN.add(ELEVEN230);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 357:16: -> INT[\"11\"]
                    {
                        dbg.location(357,19);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "11"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 12 :
                    dbg.enterAlt(12);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:358:5: TWELVE
                    {
                    dbg.location(358,5);
                    TWELVE231=(Token)match(input,TWELVE,FOLLOW_TWELVE_in_spelled_one_to_thirty_one2959); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWELVE.add(TWELVE231);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 358:16: -> INT[\"12\"]
                    {
                        dbg.location(358,19);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "12"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 13 :
                    dbg.enterAlt(13);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:359:5: THIRTEEN
                    {
                    dbg.location(359,5);
                    THIRTEEN232=(Token)match(input,THIRTEEN,FOLLOW_THIRTEEN_in_spelled_one_to_thirty_one2974); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THIRTEEN.add(THIRTEEN232);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 359:16: -> INT[\"13\"]
                    {
                        dbg.location(359,19);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "13"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 14 :
                    dbg.enterAlt(14);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:360:5: FOURTEEN
                    {
                    dbg.location(360,5);
                    FOURTEEN233=(Token)match(input,FOURTEEN,FOLLOW_FOURTEEN_in_spelled_one_to_thirty_one2987); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FOURTEEN.add(FOURTEEN233);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 360:16: -> INT[\"14\"]
                    {
                        dbg.location(360,19);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "14"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 15 :
                    dbg.enterAlt(15);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:361:5: FIFTEEN
                    {
                    dbg.location(361,5);
                    FIFTEEN234=(Token)match(input,FIFTEEN,FOLLOW_FIFTEEN_in_spelled_one_to_thirty_one3000); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FIFTEEN.add(FIFTEEN234);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 361:16: -> INT[\"15\"]
                    {
                        dbg.location(361,19);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "15"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 16 :
                    dbg.enterAlt(16);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:362:5: SIXTEEN
                    {
                    dbg.location(362,5);
                    SIXTEEN235=(Token)match(input,SIXTEEN,FOLLOW_SIXTEEN_in_spelled_one_to_thirty_one3014); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SIXTEEN.add(SIXTEEN235);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 362:16: -> INT[\"16\"]
                    {
                        dbg.location(362,19);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "16"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 17 :
                    dbg.enterAlt(17);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:363:5: SEVENTEEN
                    {
                    dbg.location(363,5);
                    SEVENTEEN236=(Token)match(input,SEVENTEEN,FOLLOW_SEVENTEEN_in_spelled_one_to_thirty_one3028); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEVENTEEN.add(SEVENTEEN236);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 363:16: -> INT[\"17\"]
                    {
                        dbg.location(363,19);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "17"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 18 :
                    dbg.enterAlt(18);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:364:5: EIGHTEEN
                    {
                    dbg.location(364,5);
                    EIGHTEEN237=(Token)match(input,EIGHTEEN,FOLLOW_EIGHTEEN_in_spelled_one_to_thirty_one3040); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EIGHTEEN.add(EIGHTEEN237);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 364:16: -> INT[\"18\"]
                    {
                        dbg.location(364,19);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "18"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 19 :
                    dbg.enterAlt(19);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:365:5: NINETEEN
                    {
                    dbg.location(365,5);
                    NINETEEN238=(Token)match(input,NINETEEN,FOLLOW_NINETEEN_in_spelled_one_to_thirty_one3053); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NINETEEN.add(NINETEEN238);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 365:16: -> INT[\"19\"]
                    {
                        dbg.location(365,19);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "19"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 20 :
                    dbg.enterAlt(20);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:366:5: TWENTY
                    {
                    dbg.location(366,5);
                    TWENTY239=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_one_to_thirty_one3066); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY239);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 366:16: -> INT[\"20\"]
                    {
                        dbg.location(366,19);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "20"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 21 :
                    dbg.enterAlt(21);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:367:5: TWENTY ( DASH | WHITE_SPACE )? ONE
                    {
                    dbg.location(367,5);
                    TWENTY240=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_one_to_thirty_one3081); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY240);

                    dbg.location(367,12);
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:367:12: ( DASH | WHITE_SPACE )?
                    int alt64=3;
                    try { dbg.enterSubRule(64);
                    try { dbg.enterDecision(64);

                    int LA64_0 = input.LA(1);

                    if ( (LA64_0==DASH) ) {
                        alt64=1;
                    }
                    else if ( (LA64_0==WHITE_SPACE) ) {
                        alt64=2;
                    }
                    } finally {dbg.exitDecision(64);}

                    switch (alt64) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:367:13: DASH
                            {
                            dbg.location(367,13);
                            DASH241=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_one_to_thirty_one3084); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_DASH.add(DASH241);


                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:367:20: WHITE_SPACE
                            {
                            dbg.location(367,20);
                            WHITE_SPACE242=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_spelled_one_to_thirty_one3088); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE242);


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(64);}

                    dbg.location(367,34);
                    ONE243=(Token)match(input,ONE,FOLLOW_ONE_in_spelled_one_to_thirty_one3092); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ONE.add(ONE243);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 367:40: -> INT[\"21\"]
                    {
                        dbg.location(367,43);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "21"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 22 :
                    dbg.enterAlt(22);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:368:5: TWENTY ( DASH | WHITE_SPACE )? TWO
                    {
                    dbg.location(368,5);
                    TWENTY244=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_one_to_thirty_one3105); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY244);

                    dbg.location(368,12);
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:368:12: ( DASH | WHITE_SPACE )?
                    int alt65=3;
                    try { dbg.enterSubRule(65);
                    try { dbg.enterDecision(65);

                    int LA65_0 = input.LA(1);

                    if ( (LA65_0==DASH) ) {
                        alt65=1;
                    }
                    else if ( (LA65_0==WHITE_SPACE) ) {
                        alt65=2;
                    }
                    } finally {dbg.exitDecision(65);}

                    switch (alt65) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:368:13: DASH
                            {
                            dbg.location(368,13);
                            DASH245=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_one_to_thirty_one3108); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_DASH.add(DASH245);


                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:368:20: WHITE_SPACE
                            {
                            dbg.location(368,20);
                            WHITE_SPACE246=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_spelled_one_to_thirty_one3112); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE246);


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(65);}

                    dbg.location(368,34);
                    TWO247=(Token)match(input,TWO,FOLLOW_TWO_in_spelled_one_to_thirty_one3116); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWO.add(TWO247);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 368:40: -> INT[\"22\"]
                    {
                        dbg.location(368,43);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "22"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 23 :
                    dbg.enterAlt(23);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:369:5: TWENTY ( DASH | WHITE_SPACE )? THREE
                    {
                    dbg.location(369,5);
                    TWENTY248=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_one_to_thirty_one3129); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY248);

                    dbg.location(369,12);
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:369:12: ( DASH | WHITE_SPACE )?
                    int alt66=3;
                    try { dbg.enterSubRule(66);
                    try { dbg.enterDecision(66);

                    int LA66_0 = input.LA(1);

                    if ( (LA66_0==DASH) ) {
                        alt66=1;
                    }
                    else if ( (LA66_0==WHITE_SPACE) ) {
                        alt66=2;
                    }
                    } finally {dbg.exitDecision(66);}

                    switch (alt66) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:369:13: DASH
                            {
                            dbg.location(369,13);
                            DASH249=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_one_to_thirty_one3132); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_DASH.add(DASH249);


                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:369:20: WHITE_SPACE
                            {
                            dbg.location(369,20);
                            WHITE_SPACE250=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_spelled_one_to_thirty_one3136); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE250);


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(66);}

                    dbg.location(369,34);
                    THREE251=(Token)match(input,THREE,FOLLOW_THREE_in_spelled_one_to_thirty_one3140); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THREE.add(THREE251);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 369:40: -> INT[\"23\"]
                    {
                        dbg.location(369,43);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "23"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 24 :
                    dbg.enterAlt(24);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:370:5: TWENTY ( DASH | WHITE_SPACE )? FOUR
                    {
                    dbg.location(370,5);
                    TWENTY252=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_one_to_thirty_one3151); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY252);

                    dbg.location(370,12);
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:370:12: ( DASH | WHITE_SPACE )?
                    int alt67=3;
                    try { dbg.enterSubRule(67);
                    try { dbg.enterDecision(67);

                    int LA67_0 = input.LA(1);

                    if ( (LA67_0==DASH) ) {
                        alt67=1;
                    }
                    else if ( (LA67_0==WHITE_SPACE) ) {
                        alt67=2;
                    }
                    } finally {dbg.exitDecision(67);}

                    switch (alt67) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:370:13: DASH
                            {
                            dbg.location(370,13);
                            DASH253=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_one_to_thirty_one3154); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_DASH.add(DASH253);


                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:370:20: WHITE_SPACE
                            {
                            dbg.location(370,20);
                            WHITE_SPACE254=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_spelled_one_to_thirty_one3158); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE254);


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(67);}

                    dbg.location(370,34);
                    FOUR255=(Token)match(input,FOUR,FOLLOW_FOUR_in_spelled_one_to_thirty_one3162); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FOUR.add(FOUR255);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 370:40: -> INT[\"24\"]
                    {
                        dbg.location(370,43);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "24"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 25 :
                    dbg.enterAlt(25);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:371:5: TWENTY ( DASH | WHITE_SPACE )? FIVE
                    {
                    dbg.location(371,5);
                    TWENTY256=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_one_to_thirty_one3174); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY256);

                    dbg.location(371,12);
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:371:12: ( DASH | WHITE_SPACE )?
                    int alt68=3;
                    try { dbg.enterSubRule(68);
                    try { dbg.enterDecision(68);

                    int LA68_0 = input.LA(1);

                    if ( (LA68_0==DASH) ) {
                        alt68=1;
                    }
                    else if ( (LA68_0==WHITE_SPACE) ) {
                        alt68=2;
                    }
                    } finally {dbg.exitDecision(68);}

                    switch (alt68) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:371:13: DASH
                            {
                            dbg.location(371,13);
                            DASH257=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_one_to_thirty_one3177); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_DASH.add(DASH257);


                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:371:20: WHITE_SPACE
                            {
                            dbg.location(371,20);
                            WHITE_SPACE258=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_spelled_one_to_thirty_one3181); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE258);


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(68);}

                    dbg.location(371,34);
                    FIVE259=(Token)match(input,FIVE,FOLLOW_FIVE_in_spelled_one_to_thirty_one3185); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FIVE.add(FIVE259);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 371:40: -> INT[\"25\"]
                    {
                        dbg.location(371,43);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "25"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 26 :
                    dbg.enterAlt(26);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:372:5: TWENTY ( DASH | WHITE_SPACE )? SIX
                    {
                    dbg.location(372,5);
                    TWENTY260=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_one_to_thirty_one3197); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY260);

                    dbg.location(372,12);
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:372:12: ( DASH | WHITE_SPACE )?
                    int alt69=3;
                    try { dbg.enterSubRule(69);
                    try { dbg.enterDecision(69);

                    int LA69_0 = input.LA(1);

                    if ( (LA69_0==DASH) ) {
                        alt69=1;
                    }
                    else if ( (LA69_0==WHITE_SPACE) ) {
                        alt69=2;
                    }
                    } finally {dbg.exitDecision(69);}

                    switch (alt69) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:372:13: DASH
                            {
                            dbg.location(372,13);
                            DASH261=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_one_to_thirty_one3200); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_DASH.add(DASH261);


                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:372:20: WHITE_SPACE
                            {
                            dbg.location(372,20);
                            WHITE_SPACE262=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_spelled_one_to_thirty_one3204); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE262);


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(69);}

                    dbg.location(372,34);
                    SIX263=(Token)match(input,SIX,FOLLOW_SIX_in_spelled_one_to_thirty_one3208); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SIX.add(SIX263);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 372:40: -> INT[\"26\"]
                    {
                        dbg.location(372,43);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "26"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 27 :
                    dbg.enterAlt(27);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:373:5: TWENTY ( DASH | WHITE_SPACE )? SEVEN
                    {
                    dbg.location(373,5);
                    TWENTY264=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_one_to_thirty_one3221); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY264);

                    dbg.location(373,12);
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:373:12: ( DASH | WHITE_SPACE )?
                    int alt70=3;
                    try { dbg.enterSubRule(70);
                    try { dbg.enterDecision(70);

                    int LA70_0 = input.LA(1);

                    if ( (LA70_0==DASH) ) {
                        alt70=1;
                    }
                    else if ( (LA70_0==WHITE_SPACE) ) {
                        alt70=2;
                    }
                    } finally {dbg.exitDecision(70);}

                    switch (alt70) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:373:13: DASH
                            {
                            dbg.location(373,13);
                            DASH265=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_one_to_thirty_one3224); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_DASH.add(DASH265);


                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:373:20: WHITE_SPACE
                            {
                            dbg.location(373,20);
                            WHITE_SPACE266=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_spelled_one_to_thirty_one3228); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE266);


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(70);}

                    dbg.location(373,34);
                    SEVEN267=(Token)match(input,SEVEN,FOLLOW_SEVEN_in_spelled_one_to_thirty_one3232); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEVEN.add(SEVEN267);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 373:40: -> INT[\"27\"]
                    {
                        dbg.location(373,43);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "27"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 28 :
                    dbg.enterAlt(28);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:374:5: TWENTY ( DASH | WHITE_SPACE )? EIGHT
                    {
                    dbg.location(374,5);
                    TWENTY268=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_one_to_thirty_one3243); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY268);

                    dbg.location(374,12);
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:374:12: ( DASH | WHITE_SPACE )?
                    int alt71=3;
                    try { dbg.enterSubRule(71);
                    try { dbg.enterDecision(71);

                    int LA71_0 = input.LA(1);

                    if ( (LA71_0==DASH) ) {
                        alt71=1;
                    }
                    else if ( (LA71_0==WHITE_SPACE) ) {
                        alt71=2;
                    }
                    } finally {dbg.exitDecision(71);}

                    switch (alt71) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:374:13: DASH
                            {
                            dbg.location(374,13);
                            DASH269=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_one_to_thirty_one3246); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_DASH.add(DASH269);


                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:374:20: WHITE_SPACE
                            {
                            dbg.location(374,20);
                            WHITE_SPACE270=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_spelled_one_to_thirty_one3250); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE270);


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(71);}

                    dbg.location(374,34);
                    EIGHT271=(Token)match(input,EIGHT,FOLLOW_EIGHT_in_spelled_one_to_thirty_one3254); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EIGHT.add(EIGHT271);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 374:40: -> INT[\"28\"]
                    {
                        dbg.location(374,43);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "28"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 29 :
                    dbg.enterAlt(29);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:375:5: TWENTY ( DASH | WHITE_SPACE )? NINE
                    {
                    dbg.location(375,5);
                    TWENTY272=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_one_to_thirty_one3265); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY272);

                    dbg.location(375,12);
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:375:12: ( DASH | WHITE_SPACE )?
                    int alt72=3;
                    try { dbg.enterSubRule(72);
                    try { dbg.enterDecision(72);

                    int LA72_0 = input.LA(1);

                    if ( (LA72_0==DASH) ) {
                        alt72=1;
                    }
                    else if ( (LA72_0==WHITE_SPACE) ) {
                        alt72=2;
                    }
                    } finally {dbg.exitDecision(72);}

                    switch (alt72) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:375:13: DASH
                            {
                            dbg.location(375,13);
                            DASH273=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_one_to_thirty_one3268); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_DASH.add(DASH273);


                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:375:20: WHITE_SPACE
                            {
                            dbg.location(375,20);
                            WHITE_SPACE274=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_spelled_one_to_thirty_one3272); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE274);


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(72);}

                    dbg.location(375,34);
                    NINE275=(Token)match(input,NINE,FOLLOW_NINE_in_spelled_one_to_thirty_one3276); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NINE.add(NINE275);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 375:40: -> INT[\"29\"]
                    {
                        dbg.location(375,43);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "29"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 30 :
                    dbg.enterAlt(30);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:376:5: THIRTY
                    {
                    dbg.location(376,5);
                    THIRTY276=(Token)match(input,THIRTY,FOLLOW_THIRTY_in_spelled_one_to_thirty_one3288); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THIRTY.add(THIRTY276);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 376:40: -> INT[\"30\"]
                    {
                        dbg.location(376,43);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "30"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 31 :
                    dbg.enterAlt(31);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:377:5: THIRTY ( DASH | WHITE_SPACE )? ONE
                    {
                    dbg.location(377,5);
                    THIRTY277=(Token)match(input,THIRTY,FOLLOW_THIRTY_in_spelled_one_to_thirty_one3327); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THIRTY.add(THIRTY277);

                    dbg.location(377,12);
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:377:12: ( DASH | WHITE_SPACE )?
                    int alt73=3;
                    try { dbg.enterSubRule(73);
                    try { dbg.enterDecision(73);

                    int LA73_0 = input.LA(1);

                    if ( (LA73_0==DASH) ) {
                        alt73=1;
                    }
                    else if ( (LA73_0==WHITE_SPACE) ) {
                        alt73=2;
                    }
                    } finally {dbg.exitDecision(73);}

                    switch (alt73) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:377:13: DASH
                            {
                            dbg.location(377,13);
                            DASH278=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_one_to_thirty_one3330); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_DASH.add(DASH278);


                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:377:20: WHITE_SPACE
                            {
                            dbg.location(377,20);
                            WHITE_SPACE279=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_spelled_one_to_thirty_one3334); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE279);


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(73);}

                    dbg.location(377,34);
                    ONE280=(Token)match(input,ONE,FOLLOW_ONE_in_spelled_one_to_thirty_one3338); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ONE.add(ONE280);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 377:40: -> INT[\"31\"]
                    {
                        dbg.location(377,43);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "31"));

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(378, 3);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "spelled_one_to_thirty_one");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "spelled_one_to_thirty_one"

    public static class spelled_first_to_thirty_first_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "spelled_first_to_thirty_first"
    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:381:1: spelled_first_to_thirty_first : ( FIRST -> INT[\"1\"] | SECOND -> INT[\"2\"] | THIRD -> INT[\"3\"] | FOURTH -> INT[\"4\"] | FIFTH -> INT[\"5\"] | SIXTH -> INT[\"6\"] | SEVENTH -> INT[\"7\"] | EIGHTH -> INT[\"8\"] | NINTH -> INT[\"9\"] | TENTH -> INT[\"10\"] | ELEVENTH -> INT[\"11\"] | TWELFTH -> INT[\"12\"] | THIRTEENTH -> INT[\"13\"] | FOURTEENTH -> INT[\"14\"] | FIFTEENTH -> INT[\"15\"] | SIXTEENTH -> INT[\"16\"] | SEVENTEENTH -> INT[\"17\"] | EIGHTEENTH -> INT[\"18\"] | NINETEENTH -> INT[\"19\"] | TWENTIETH -> INT[\"20\"] | ( TWENTY_FIRST | ( TWENTY ( DASH | WHITE_SPACE )? FIRST ) ) -> INT[\"21\"] | ( TWENTY_SECOND | ( TWENTY ( DASH | WHITE_SPACE )? SECOND ) ) -> INT[\"22\"] | ( TWENTY_THIRD | ( TWENTY ( DASH | WHITE_SPACE )? THIRD ) ) -> INT[\"23\"] | ( TWENTY_FOURTH | ( TWENTY ( DASH | WHITE_SPACE )? FOURTH ) ) -> INT[\"24\"] | ( TWENTY_FIFTH | ( TWENTY ( DASH | WHITE_SPACE )? FIFTH ) ) -> INT[\"25\"] | ( TWENTY_SIXTH | ( TWENTY ( DASH | WHITE_SPACE )? SIXTH ) ) -> INT[\"26\"] | ( TWENTY_SEVENTH | ( TWENTY ( DASH | WHITE_SPACE )? SEVENTH ) ) -> INT[\"27\"] | ( TWENTY_EIGHTH | ( TWENTY ( DASH | WHITE_SPACE )? EIGHTH ) ) -> INT[\"28\"] | ( TWENTY_NINTH | ( TWENTY ( DASH | WHITE_SPACE )? NINTH ) ) -> INT[\"29\"] | THIRTIETH -> INT[\"30\"] | ( THIRTY_FIRST | ( THIRTY ( DASH | WHITE_SPACE )? FIRST ) ) -> INT[\"31\"] );
    public final DateParser.spelled_first_to_thirty_first_return spelled_first_to_thirty_first() throws RecognitionException {
        DateParser.spelled_first_to_thirty_first_return retval = new DateParser.spelled_first_to_thirty_first_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token FIRST281=null;
        Token SECOND282=null;
        Token THIRD283=null;
        Token FOURTH284=null;
        Token FIFTH285=null;
        Token SIXTH286=null;
        Token SEVENTH287=null;
        Token EIGHTH288=null;
        Token NINTH289=null;
        Token TENTH290=null;
        Token ELEVENTH291=null;
        Token TWELFTH292=null;
        Token THIRTEENTH293=null;
        Token FOURTEENTH294=null;
        Token FIFTEENTH295=null;
        Token SIXTEENTH296=null;
        Token SEVENTEENTH297=null;
        Token EIGHTEENTH298=null;
        Token NINETEENTH299=null;
        Token TWENTIETH300=null;
        Token TWENTY_FIRST301=null;
        Token TWENTY302=null;
        Token DASH303=null;
        Token WHITE_SPACE304=null;
        Token FIRST305=null;
        Token TWENTY_SECOND306=null;
        Token TWENTY307=null;
        Token DASH308=null;
        Token WHITE_SPACE309=null;
        Token SECOND310=null;
        Token TWENTY_THIRD311=null;
        Token TWENTY312=null;
        Token DASH313=null;
        Token WHITE_SPACE314=null;
        Token THIRD315=null;
        Token TWENTY_FOURTH316=null;
        Token TWENTY317=null;
        Token DASH318=null;
        Token WHITE_SPACE319=null;
        Token FOURTH320=null;
        Token TWENTY_FIFTH321=null;
        Token TWENTY322=null;
        Token DASH323=null;
        Token WHITE_SPACE324=null;
        Token FIFTH325=null;
        Token TWENTY_SIXTH326=null;
        Token TWENTY327=null;
        Token DASH328=null;
        Token WHITE_SPACE329=null;
        Token SIXTH330=null;
        Token TWENTY_SEVENTH331=null;
        Token TWENTY332=null;
        Token DASH333=null;
        Token WHITE_SPACE334=null;
        Token SEVENTH335=null;
        Token TWENTY_EIGHTH336=null;
        Token TWENTY337=null;
        Token DASH338=null;
        Token WHITE_SPACE339=null;
        Token EIGHTH340=null;
        Token TWENTY_NINTH341=null;
        Token TWENTY342=null;
        Token DASH343=null;
        Token WHITE_SPACE344=null;
        Token NINTH345=null;
        Token THIRTIETH346=null;
        Token THIRTY_FIRST347=null;
        Token THIRTY348=null;
        Token DASH349=null;
        Token WHITE_SPACE350=null;
        Token FIRST351=null;

        Object FIRST281_tree=null;
        Object SECOND282_tree=null;
        Object THIRD283_tree=null;
        Object FOURTH284_tree=null;
        Object FIFTH285_tree=null;
        Object SIXTH286_tree=null;
        Object SEVENTH287_tree=null;
        Object EIGHTH288_tree=null;
        Object NINTH289_tree=null;
        Object TENTH290_tree=null;
        Object ELEVENTH291_tree=null;
        Object TWELFTH292_tree=null;
        Object THIRTEENTH293_tree=null;
        Object FOURTEENTH294_tree=null;
        Object FIFTEENTH295_tree=null;
        Object SIXTEENTH296_tree=null;
        Object SEVENTEENTH297_tree=null;
        Object EIGHTEENTH298_tree=null;
        Object NINETEENTH299_tree=null;
        Object TWENTIETH300_tree=null;
        Object TWENTY_FIRST301_tree=null;
        Object TWENTY302_tree=null;
        Object DASH303_tree=null;
        Object WHITE_SPACE304_tree=null;
        Object FIRST305_tree=null;
        Object TWENTY_SECOND306_tree=null;
        Object TWENTY307_tree=null;
        Object DASH308_tree=null;
        Object WHITE_SPACE309_tree=null;
        Object SECOND310_tree=null;
        Object TWENTY_THIRD311_tree=null;
        Object TWENTY312_tree=null;
        Object DASH313_tree=null;
        Object WHITE_SPACE314_tree=null;
        Object THIRD315_tree=null;
        Object TWENTY_FOURTH316_tree=null;
        Object TWENTY317_tree=null;
        Object DASH318_tree=null;
        Object WHITE_SPACE319_tree=null;
        Object FOURTH320_tree=null;
        Object TWENTY_FIFTH321_tree=null;
        Object TWENTY322_tree=null;
        Object DASH323_tree=null;
        Object WHITE_SPACE324_tree=null;
        Object FIFTH325_tree=null;
        Object TWENTY_SIXTH326_tree=null;
        Object TWENTY327_tree=null;
        Object DASH328_tree=null;
        Object WHITE_SPACE329_tree=null;
        Object SIXTH330_tree=null;
        Object TWENTY_SEVENTH331_tree=null;
        Object TWENTY332_tree=null;
        Object DASH333_tree=null;
        Object WHITE_SPACE334_tree=null;
        Object SEVENTH335_tree=null;
        Object TWENTY_EIGHTH336_tree=null;
        Object TWENTY337_tree=null;
        Object DASH338_tree=null;
        Object WHITE_SPACE339_tree=null;
        Object EIGHTH340_tree=null;
        Object TWENTY_NINTH341_tree=null;
        Object TWENTY342_tree=null;
        Object DASH343_tree=null;
        Object WHITE_SPACE344_tree=null;
        Object NINTH345_tree=null;
        Object THIRTIETH346_tree=null;
        Object THIRTY_FIRST347_tree=null;
        Object THIRTY348_tree=null;
        Object DASH349_tree=null;
        Object WHITE_SPACE350_tree=null;
        Object FIRST351_tree=null;
        RewriteRuleTokenStream stream_THIRD=new RewriteRuleTokenStream(adaptor,"token THIRD");
        RewriteRuleTokenStream stream_FOURTH=new RewriteRuleTokenStream(adaptor,"token FOURTH");
        RewriteRuleTokenStream stream_FIFTEENTH=new RewriteRuleTokenStream(adaptor,"token FIFTEENTH");
        RewriteRuleTokenStream stream_SECOND=new RewriteRuleTokenStream(adaptor,"token SECOND");
        RewriteRuleTokenStream stream_TWENTY_EIGHTH=new RewriteRuleTokenStream(adaptor,"token TWENTY_EIGHTH");
        RewriteRuleTokenStream stream_DASH=new RewriteRuleTokenStream(adaptor,"token DASH");
        RewriteRuleTokenStream stream_TWENTY=new RewriteRuleTokenStream(adaptor,"token TWENTY");
        RewriteRuleTokenStream stream_FOURTEENTH=new RewriteRuleTokenStream(adaptor,"token FOURTEENTH");
        RewriteRuleTokenStream stream_SEVENTH=new RewriteRuleTokenStream(adaptor,"token SEVENTH");
        RewriteRuleTokenStream stream_NINETEENTH=new RewriteRuleTokenStream(adaptor,"token NINETEENTH");
        RewriteRuleTokenStream stream_TENTH=new RewriteRuleTokenStream(adaptor,"token TENTH");
        RewriteRuleTokenStream stream_ELEVENTH=new RewriteRuleTokenStream(adaptor,"token ELEVENTH");
        RewriteRuleTokenStream stream_TWENTY_FOURTH=new RewriteRuleTokenStream(adaptor,"token TWENTY_FOURTH");
        RewriteRuleTokenStream stream_SIXTEENTH=new RewriteRuleTokenStream(adaptor,"token SIXTEENTH");
        RewriteRuleTokenStream stream_WHITE_SPACE=new RewriteRuleTokenStream(adaptor,"token WHITE_SPACE");
        RewriteRuleTokenStream stream_THIRTEENTH=new RewriteRuleTokenStream(adaptor,"token THIRTEENTH");
        RewriteRuleTokenStream stream_TWENTY_SIXTH=new RewriteRuleTokenStream(adaptor,"token TWENTY_SIXTH");
        RewriteRuleTokenStream stream_FIFTH=new RewriteRuleTokenStream(adaptor,"token FIFTH");
        RewriteRuleTokenStream stream_TWENTY_NINTH=new RewriteRuleTokenStream(adaptor,"token TWENTY_NINTH");
        RewriteRuleTokenStream stream_TWENTY_SEVENTH=new RewriteRuleTokenStream(adaptor,"token TWENTY_SEVENTH");
        RewriteRuleTokenStream stream_TWENTY_FIFTH=new RewriteRuleTokenStream(adaptor,"token TWENTY_FIFTH");
        RewriteRuleTokenStream stream_NINTH=new RewriteRuleTokenStream(adaptor,"token NINTH");
        RewriteRuleTokenStream stream_EIGHTEENTH=new RewriteRuleTokenStream(adaptor,"token EIGHTEENTH");
        RewriteRuleTokenStream stream_THIRTY=new RewriteRuleTokenStream(adaptor,"token THIRTY");
        RewriteRuleTokenStream stream_TWENTIETH=new RewriteRuleTokenStream(adaptor,"token TWENTIETH");
        RewriteRuleTokenStream stream_THIRTIETH=new RewriteRuleTokenStream(adaptor,"token THIRTIETH");
        RewriteRuleTokenStream stream_TWENTY_SECOND=new RewriteRuleTokenStream(adaptor,"token TWENTY_SECOND");
        RewriteRuleTokenStream stream_TWELFTH=new RewriteRuleTokenStream(adaptor,"token TWELFTH");
        RewriteRuleTokenStream stream_SIXTH=new RewriteRuleTokenStream(adaptor,"token SIXTH");
        RewriteRuleTokenStream stream_TWENTY_FIRST=new RewriteRuleTokenStream(adaptor,"token TWENTY_FIRST");
        RewriteRuleTokenStream stream_TWENTY_THIRD=new RewriteRuleTokenStream(adaptor,"token TWENTY_THIRD");
        RewriteRuleTokenStream stream_SEVENTEENTH=new RewriteRuleTokenStream(adaptor,"token SEVENTEENTH");
        RewriteRuleTokenStream stream_THIRTY_FIRST=new RewriteRuleTokenStream(adaptor,"token THIRTY_FIRST");
        RewriteRuleTokenStream stream_EIGHTH=new RewriteRuleTokenStream(adaptor,"token EIGHTH");
        RewriteRuleTokenStream stream_FIRST=new RewriteRuleTokenStream(adaptor,"token FIRST");

        try { dbg.enterRule(getGrammarFileName(), "spelled_first_to_thirty_first");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(381, 1);

        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:382:3: ( FIRST -> INT[\"1\"] | SECOND -> INT[\"2\"] | THIRD -> INT[\"3\"] | FOURTH -> INT[\"4\"] | FIFTH -> INT[\"5\"] | SIXTH -> INT[\"6\"] | SEVENTH -> INT[\"7\"] | EIGHTH -> INT[\"8\"] | NINTH -> INT[\"9\"] | TENTH -> INT[\"10\"] | ELEVENTH -> INT[\"11\"] | TWELFTH -> INT[\"12\"] | THIRTEENTH -> INT[\"13\"] | FOURTEENTH -> INT[\"14\"] | FIFTEENTH -> INT[\"15\"] | SIXTEENTH -> INT[\"16\"] | SEVENTEENTH -> INT[\"17\"] | EIGHTEENTH -> INT[\"18\"] | NINETEENTH -> INT[\"19\"] | TWENTIETH -> INT[\"20\"] | ( TWENTY_FIRST | ( TWENTY ( DASH | WHITE_SPACE )? FIRST ) ) -> INT[\"21\"] | ( TWENTY_SECOND | ( TWENTY ( DASH | WHITE_SPACE )? SECOND ) ) -> INT[\"22\"] | ( TWENTY_THIRD | ( TWENTY ( DASH | WHITE_SPACE )? THIRD ) ) -> INT[\"23\"] | ( TWENTY_FOURTH | ( TWENTY ( DASH | WHITE_SPACE )? FOURTH ) ) -> INT[\"24\"] | ( TWENTY_FIFTH | ( TWENTY ( DASH | WHITE_SPACE )? FIFTH ) ) -> INT[\"25\"] | ( TWENTY_SIXTH | ( TWENTY ( DASH | WHITE_SPACE )? SIXTH ) ) -> INT[\"26\"] | ( TWENTY_SEVENTH | ( TWENTY ( DASH | WHITE_SPACE )? SEVENTH ) ) -> INT[\"27\"] | ( TWENTY_EIGHTH | ( TWENTY ( DASH | WHITE_SPACE )? EIGHTH ) ) -> INT[\"28\"] | ( TWENTY_NINTH | ( TWENTY ( DASH | WHITE_SPACE )? NINTH ) ) -> INT[\"29\"] | THIRTIETH -> INT[\"30\"] | ( THIRTY_FIRST | ( THIRTY ( DASH | WHITE_SPACE )? FIRST ) ) -> INT[\"31\"] )
            int alt95=31;
            try { dbg.enterDecision(95);

            try {
                isCyclicDecision = true;
                alt95 = dfa95.predict(input);
            }
            catch (NoViableAltException nvae) {
                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(95);}

            switch (alt95) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:382:5: FIRST
                    {
                    dbg.location(382,5);
                    FIRST281=(Token)match(input,FIRST,FOLLOW_FIRST_in_spelled_first_to_thirty_first3361); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FIRST.add(FIRST281);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 382:17: -> INT[\"1\"]
                    {
                        dbg.location(382,20);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "1"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:383:5: SECOND
                    {
                    dbg.location(383,5);
                    SECOND282=(Token)match(input,SECOND,FOLLOW_SECOND_in_spelled_first_to_thirty_first3378); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SECOND.add(SECOND282);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 383:17: -> INT[\"2\"]
                    {
                        dbg.location(383,20);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "2"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:384:5: THIRD
                    {
                    dbg.location(384,5);
                    THIRD283=(Token)match(input,THIRD,FOLLOW_THIRD_in_spelled_first_to_thirty_first3394); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THIRD.add(THIRD283);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 384:17: -> INT[\"3\"]
                    {
                        dbg.location(384,20);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "3"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:385:5: FOURTH
                    {
                    dbg.location(385,5);
                    FOURTH284=(Token)match(input,FOURTH,FOLLOW_FOURTH_in_spelled_first_to_thirty_first3411); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FOURTH.add(FOURTH284);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 385:17: -> INT[\"4\"]
                    {
                        dbg.location(385,20);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "4"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:386:5: FIFTH
                    {
                    dbg.location(386,5);
                    FIFTH285=(Token)match(input,FIFTH,FOLLOW_FIFTH_in_spelled_first_to_thirty_first3427); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FIFTH.add(FIFTH285);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 386:17: -> INT[\"5\"]
                    {
                        dbg.location(386,20);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "5"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 6 :
                    dbg.enterAlt(6);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:387:5: SIXTH
                    {
                    dbg.location(387,5);
                    SIXTH286=(Token)match(input,SIXTH,FOLLOW_SIXTH_in_spelled_first_to_thirty_first3444); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SIXTH.add(SIXTH286);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 387:17: -> INT[\"6\"]
                    {
                        dbg.location(387,20);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "6"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 7 :
                    dbg.enterAlt(7);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:388:5: SEVENTH
                    {
                    dbg.location(388,5);
                    SEVENTH287=(Token)match(input,SEVENTH,FOLLOW_SEVENTH_in_spelled_first_to_thirty_first3461); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEVENTH.add(SEVENTH287);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 388:17: -> INT[\"7\"]
                    {
                        dbg.location(388,20);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "7"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 8 :
                    dbg.enterAlt(8);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:389:5: EIGHTH
                    {
                    dbg.location(389,5);
                    EIGHTH288=(Token)match(input,EIGHTH,FOLLOW_EIGHTH_in_spelled_first_to_thirty_first3476); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EIGHTH.add(EIGHTH288);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 389:17: -> INT[\"8\"]
                    {
                        dbg.location(389,20);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "8"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 9 :
                    dbg.enterAlt(9);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:390:5: NINTH
                    {
                    dbg.location(390,5);
                    NINTH289=(Token)match(input,NINTH,FOLLOW_NINTH_in_spelled_first_to_thirty_first3492); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NINTH.add(NINTH289);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 390:17: -> INT[\"9\"]
                    {
                        dbg.location(390,20);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "9"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 10 :
                    dbg.enterAlt(10);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:391:5: TENTH
                    {
                    dbg.location(391,5);
                    TENTH290=(Token)match(input,TENTH,FOLLOW_TENTH_in_spelled_first_to_thirty_first3509); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TENTH.add(TENTH290);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 391:17: -> INT[\"10\"]
                    {
                        dbg.location(391,20);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "10"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 11 :
                    dbg.enterAlt(11);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:392:5: ELEVENTH
                    {
                    dbg.location(392,5);
                    ELEVENTH291=(Token)match(input,ELEVENTH,FOLLOW_ELEVENTH_in_spelled_first_to_thirty_first3526); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ELEVENTH.add(ELEVENTH291);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 392:17: -> INT[\"11\"]
                    {
                        dbg.location(392,20);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "11"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 12 :
                    dbg.enterAlt(12);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:393:5: TWELFTH
                    {
                    dbg.location(393,5);
                    TWELFTH292=(Token)match(input,TWELFTH,FOLLOW_TWELFTH_in_spelled_first_to_thirty_first3540); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWELFTH.add(TWELFTH292);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 393:17: -> INT[\"12\"]
                    {
                        dbg.location(393,20);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "12"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 13 :
                    dbg.enterAlt(13);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:394:5: THIRTEENTH
                    {
                    dbg.location(394,5);
                    THIRTEENTH293=(Token)match(input,THIRTEENTH,FOLLOW_THIRTEENTH_in_spelled_first_to_thirty_first3555); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THIRTEENTH.add(THIRTEENTH293);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 394:17: -> INT[\"13\"]
                    {
                        dbg.location(394,20);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "13"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 14 :
                    dbg.enterAlt(14);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:395:5: FOURTEENTH
                    {
                    dbg.location(395,5);
                    FOURTEENTH294=(Token)match(input,FOURTEENTH,FOLLOW_FOURTEENTH_in_spelled_first_to_thirty_first3567); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FOURTEENTH.add(FOURTEENTH294);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 395:17: -> INT[\"14\"]
                    {
                        dbg.location(395,20);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "14"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 15 :
                    dbg.enterAlt(15);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:396:5: FIFTEENTH
                    {
                    dbg.location(396,5);
                    FIFTEENTH295=(Token)match(input,FIFTEENTH,FOLLOW_FIFTEENTH_in_spelled_first_to_thirty_first3579); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FIFTEENTH.add(FIFTEENTH295);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 396:17: -> INT[\"15\"]
                    {
                        dbg.location(396,20);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "15"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 16 :
                    dbg.enterAlt(16);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:397:5: SIXTEENTH
                    {
                    dbg.location(397,5);
                    SIXTEENTH296=(Token)match(input,SIXTEENTH,FOLLOW_SIXTEENTH_in_spelled_first_to_thirty_first3592); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SIXTEENTH.add(SIXTEENTH296);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 397:17: -> INT[\"16\"]
                    {
                        dbg.location(397,20);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "16"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 17 :
                    dbg.enterAlt(17);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:398:5: SEVENTEENTH
                    {
                    dbg.location(398,5);
                    SEVENTEENTH297=(Token)match(input,SEVENTEENTH,FOLLOW_SEVENTEENTH_in_spelled_first_to_thirty_first3605); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEVENTEENTH.add(SEVENTEENTH297);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 398:17: -> INT[\"17\"]
                    {
                        dbg.location(398,20);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "17"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 18 :
                    dbg.enterAlt(18);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:399:5: EIGHTEENTH
                    {
                    dbg.location(399,5);
                    EIGHTEENTH298=(Token)match(input,EIGHTEENTH,FOLLOW_EIGHTEENTH_in_spelled_first_to_thirty_first3616); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EIGHTEENTH.add(EIGHTEENTH298);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 399:17: -> INT[\"18\"]
                    {
                        dbg.location(399,20);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "18"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 19 :
                    dbg.enterAlt(19);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:400:5: NINETEENTH
                    {
                    dbg.location(400,5);
                    NINETEENTH299=(Token)match(input,NINETEENTH,FOLLOW_NINETEENTH_in_spelled_first_to_thirty_first3628); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NINETEENTH.add(NINETEENTH299);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 400:17: -> INT[\"19\"]
                    {
                        dbg.location(400,20);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "19"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 20 :
                    dbg.enterAlt(20);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:401:5: TWENTIETH
                    {
                    dbg.location(401,5);
                    TWENTIETH300=(Token)match(input,TWENTIETH,FOLLOW_TWENTIETH_in_spelled_first_to_thirty_first3640); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWENTIETH.add(TWENTIETH300);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 401:17: -> INT[\"20\"]
                    {
                        dbg.location(401,20);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "20"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 21 :
                    dbg.enterAlt(21);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:402:5: ( TWENTY_FIRST | ( TWENTY ( DASH | WHITE_SPACE )? FIRST ) )
                    {
                    dbg.location(402,5);
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:402:5: ( TWENTY_FIRST | ( TWENTY ( DASH | WHITE_SPACE )? FIRST ) )
                    int alt76=2;
                    try { dbg.enterSubRule(76);
                    try { dbg.enterDecision(76);

                    int LA76_0 = input.LA(1);

                    if ( (LA76_0==TWENTY_FIRST) ) {
                        alt76=1;
                    }
                    else if ( (LA76_0==TWENTY) ) {
                        alt76=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 76, 0, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }
                    } finally {dbg.exitDecision(76);}

                    switch (alt76) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:402:6: TWENTY_FIRST
                            {
                            dbg.location(402,6);
                            TWENTY_FIRST301=(Token)match(input,TWENTY_FIRST,FOLLOW_TWENTY_FIRST_in_spelled_first_to_thirty_first3654); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY_FIRST.add(TWENTY_FIRST301);


                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:402:23: ( TWENTY ( DASH | WHITE_SPACE )? FIRST )
                            {
                            dbg.location(402,23);
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:402:23: ( TWENTY ( DASH | WHITE_SPACE )? FIRST )
                            dbg.enterAlt(1);

                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:402:24: TWENTY ( DASH | WHITE_SPACE )? FIRST
                            {
                            dbg.location(402,24);
                            TWENTY302=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_first_to_thirty_first3661); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY302);

                            dbg.location(402,31);
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:402:31: ( DASH | WHITE_SPACE )?
                            int alt75=3;
                            try { dbg.enterSubRule(75);
                            try { dbg.enterDecision(75);

                            int LA75_0 = input.LA(1);

                            if ( (LA75_0==DASH) ) {
                                alt75=1;
                            }
                            else if ( (LA75_0==WHITE_SPACE) ) {
                                alt75=2;
                            }
                            } finally {dbg.exitDecision(75);}

                            switch (alt75) {
                                case 1 :
                                    dbg.enterAlt(1);

                                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:402:32: DASH
                                    {
                                    dbg.location(402,32);
                                    DASH303=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_first_to_thirty_first3664); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_DASH.add(DASH303);


                                    }
                                    break;
                                case 2 :
                                    dbg.enterAlt(2);

                                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:402:39: WHITE_SPACE
                                    {
                                    dbg.location(402,39);
                                    WHITE_SPACE304=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_spelled_first_to_thirty_first3668); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE304);


                                    }
                                    break;

                            }
                            } finally {dbg.exitSubRule(75);}

                            dbg.location(402,53);
                            FIRST305=(Token)match(input,FIRST,FOLLOW_FIRST_in_spelled_first_to_thirty_first3672); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_FIRST.add(FIRST305);


                            }


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(76);}



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 402:63: -> INT[\"21\"]
                    {
                        dbg.location(402,66);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "21"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 22 :
                    dbg.enterAlt(22);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:403:5: ( TWENTY_SECOND | ( TWENTY ( DASH | WHITE_SPACE )? SECOND ) )
                    {
                    dbg.location(403,5);
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:403:5: ( TWENTY_SECOND | ( TWENTY ( DASH | WHITE_SPACE )? SECOND ) )
                    int alt78=2;
                    try { dbg.enterSubRule(78);
                    try { dbg.enterDecision(78);

                    int LA78_0 = input.LA(1);

                    if ( (LA78_0==TWENTY_SECOND) ) {
                        alt78=1;
                    }
                    else if ( (LA78_0==TWENTY) ) {
                        alt78=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 78, 0, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }
                    } finally {dbg.exitDecision(78);}

                    switch (alt78) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:403:6: TWENTY_SECOND
                            {
                            dbg.location(403,6);
                            TWENTY_SECOND306=(Token)match(input,TWENTY_SECOND,FOLLOW_TWENTY_SECOND_in_spelled_first_to_thirty_first3688); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY_SECOND.add(TWENTY_SECOND306);


                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:403:23: ( TWENTY ( DASH | WHITE_SPACE )? SECOND )
                            {
                            dbg.location(403,23);
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:403:23: ( TWENTY ( DASH | WHITE_SPACE )? SECOND )
                            dbg.enterAlt(1);

                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:403:24: TWENTY ( DASH | WHITE_SPACE )? SECOND
                            {
                            dbg.location(403,24);
                            TWENTY307=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_first_to_thirty_first3694); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY307);

                            dbg.location(403,31);
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:403:31: ( DASH | WHITE_SPACE )?
                            int alt77=3;
                            try { dbg.enterSubRule(77);
                            try { dbg.enterDecision(77);

                            int LA77_0 = input.LA(1);

                            if ( (LA77_0==DASH) ) {
                                alt77=1;
                            }
                            else if ( (LA77_0==WHITE_SPACE) ) {
                                alt77=2;
                            }
                            } finally {dbg.exitDecision(77);}

                            switch (alt77) {
                                case 1 :
                                    dbg.enterAlt(1);

                                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:403:32: DASH
                                    {
                                    dbg.location(403,32);
                                    DASH308=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_first_to_thirty_first3697); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_DASH.add(DASH308);


                                    }
                                    break;
                                case 2 :
                                    dbg.enterAlt(2);

                                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:403:39: WHITE_SPACE
                                    {
                                    dbg.location(403,39);
                                    WHITE_SPACE309=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_spelled_first_to_thirty_first3701); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE309);


                                    }
                                    break;

                            }
                            } finally {dbg.exitSubRule(77);}

                            dbg.location(403,53);
                            SECOND310=(Token)match(input,SECOND,FOLLOW_SECOND_in_spelled_first_to_thirty_first3705); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_SECOND.add(SECOND310);


                            }


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(78);}



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 403:63: -> INT[\"22\"]
                    {
                        dbg.location(403,66);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "22"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 23 :
                    dbg.enterAlt(23);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:404:5: ( TWENTY_THIRD | ( TWENTY ( DASH | WHITE_SPACE )? THIRD ) )
                    {
                    dbg.location(404,5);
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:404:5: ( TWENTY_THIRD | ( TWENTY ( DASH | WHITE_SPACE )? THIRD ) )
                    int alt80=2;
                    try { dbg.enterSubRule(80);
                    try { dbg.enterDecision(80);

                    int LA80_0 = input.LA(1);

                    if ( (LA80_0==TWENTY_THIRD) ) {
                        alt80=1;
                    }
                    else if ( (LA80_0==TWENTY) ) {
                        alt80=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 80, 0, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }
                    } finally {dbg.exitDecision(80);}

                    switch (alt80) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:404:6: TWENTY_THIRD
                            {
                            dbg.location(404,6);
                            TWENTY_THIRD311=(Token)match(input,TWENTY_THIRD,FOLLOW_TWENTY_THIRD_in_spelled_first_to_thirty_first3720); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY_THIRD.add(TWENTY_THIRD311);


                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:404:23: ( TWENTY ( DASH | WHITE_SPACE )? THIRD )
                            {
                            dbg.location(404,23);
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:404:23: ( TWENTY ( DASH | WHITE_SPACE )? THIRD )
                            dbg.enterAlt(1);

                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:404:24: TWENTY ( DASH | WHITE_SPACE )? THIRD
                            {
                            dbg.location(404,24);
                            TWENTY312=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_first_to_thirty_first3727); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY312);

                            dbg.location(404,31);
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:404:31: ( DASH | WHITE_SPACE )?
                            int alt79=3;
                            try { dbg.enterSubRule(79);
                            try { dbg.enterDecision(79);

                            int LA79_0 = input.LA(1);

                            if ( (LA79_0==DASH) ) {
                                alt79=1;
                            }
                            else if ( (LA79_0==WHITE_SPACE) ) {
                                alt79=2;
                            }
                            } finally {dbg.exitDecision(79);}

                            switch (alt79) {
                                case 1 :
                                    dbg.enterAlt(1);

                                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:404:32: DASH
                                    {
                                    dbg.location(404,32);
                                    DASH313=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_first_to_thirty_first3730); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_DASH.add(DASH313);


                                    }
                                    break;
                                case 2 :
                                    dbg.enterAlt(2);

                                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:404:39: WHITE_SPACE
                                    {
                                    dbg.location(404,39);
                                    WHITE_SPACE314=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_spelled_first_to_thirty_first3734); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE314);


                                    }
                                    break;

                            }
                            } finally {dbg.exitSubRule(79);}

                            dbg.location(404,53);
                            THIRD315=(Token)match(input,THIRD,FOLLOW_THIRD_in_spelled_first_to_thirty_first3738); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_THIRD.add(THIRD315);


                            }


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(80);}



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 404:63: -> INT[\"23\"]
                    {
                        dbg.location(404,66);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "23"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 24 :
                    dbg.enterAlt(24);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:405:5: ( TWENTY_FOURTH | ( TWENTY ( DASH | WHITE_SPACE )? FOURTH ) )
                    {
                    dbg.location(405,5);
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:405:5: ( TWENTY_FOURTH | ( TWENTY ( DASH | WHITE_SPACE )? FOURTH ) )
                    int alt82=2;
                    try { dbg.enterSubRule(82);
                    try { dbg.enterDecision(82);

                    int LA82_0 = input.LA(1);

                    if ( (LA82_0==TWENTY_FOURTH) ) {
                        alt82=1;
                    }
                    else if ( (LA82_0==TWENTY) ) {
                        alt82=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 82, 0, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }
                    } finally {dbg.exitDecision(82);}

                    switch (alt82) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:405:6: TWENTY_FOURTH
                            {
                            dbg.location(405,6);
                            TWENTY_FOURTH316=(Token)match(input,TWENTY_FOURTH,FOLLOW_TWENTY_FOURTH_in_spelled_first_to_thirty_first3754); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY_FOURTH.add(TWENTY_FOURTH316);


                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:405:23: ( TWENTY ( DASH | WHITE_SPACE )? FOURTH )
                            {
                            dbg.location(405,23);
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:405:23: ( TWENTY ( DASH | WHITE_SPACE )? FOURTH )
                            dbg.enterAlt(1);

                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:405:24: TWENTY ( DASH | WHITE_SPACE )? FOURTH
                            {
                            dbg.location(405,24);
                            TWENTY317=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_first_to_thirty_first3760); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY317);

                            dbg.location(405,31);
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:405:31: ( DASH | WHITE_SPACE )?
                            int alt81=3;
                            try { dbg.enterSubRule(81);
                            try { dbg.enterDecision(81);

                            int LA81_0 = input.LA(1);

                            if ( (LA81_0==DASH) ) {
                                alt81=1;
                            }
                            else if ( (LA81_0==WHITE_SPACE) ) {
                                alt81=2;
                            }
                            } finally {dbg.exitDecision(81);}

                            switch (alt81) {
                                case 1 :
                                    dbg.enterAlt(1);

                                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:405:32: DASH
                                    {
                                    dbg.location(405,32);
                                    DASH318=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_first_to_thirty_first3763); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_DASH.add(DASH318);


                                    }
                                    break;
                                case 2 :
                                    dbg.enterAlt(2);

                                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:405:39: WHITE_SPACE
                                    {
                                    dbg.location(405,39);
                                    WHITE_SPACE319=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_spelled_first_to_thirty_first3767); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE319);


                                    }
                                    break;

                            }
                            } finally {dbg.exitSubRule(81);}

                            dbg.location(405,53);
                            FOURTH320=(Token)match(input,FOURTH,FOLLOW_FOURTH_in_spelled_first_to_thirty_first3771); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_FOURTH.add(FOURTH320);


                            }


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(82);}



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 405:63: -> INT[\"24\"]
                    {
                        dbg.location(405,66);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "24"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 25 :
                    dbg.enterAlt(25);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:406:5: ( TWENTY_FIFTH | ( TWENTY ( DASH | WHITE_SPACE )? FIFTH ) )
                    {
                    dbg.location(406,5);
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:406:5: ( TWENTY_FIFTH | ( TWENTY ( DASH | WHITE_SPACE )? FIFTH ) )
                    int alt84=2;
                    try { dbg.enterSubRule(84);
                    try { dbg.enterDecision(84);

                    int LA84_0 = input.LA(1);

                    if ( (LA84_0==TWENTY_FIFTH) ) {
                        alt84=1;
                    }
                    else if ( (LA84_0==TWENTY) ) {
                        alt84=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 84, 0, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }
                    } finally {dbg.exitDecision(84);}

                    switch (alt84) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:406:6: TWENTY_FIFTH
                            {
                            dbg.location(406,6);
                            TWENTY_FIFTH321=(Token)match(input,TWENTY_FIFTH,FOLLOW_TWENTY_FIFTH_in_spelled_first_to_thirty_first3786); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY_FIFTH.add(TWENTY_FIFTH321);


                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:406:23: ( TWENTY ( DASH | WHITE_SPACE )? FIFTH )
                            {
                            dbg.location(406,23);
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:406:23: ( TWENTY ( DASH | WHITE_SPACE )? FIFTH )
                            dbg.enterAlt(1);

                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:406:24: TWENTY ( DASH | WHITE_SPACE )? FIFTH
                            {
                            dbg.location(406,24);
                            TWENTY322=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_first_to_thirty_first3793); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY322);

                            dbg.location(406,31);
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:406:31: ( DASH | WHITE_SPACE )?
                            int alt83=3;
                            try { dbg.enterSubRule(83);
                            try { dbg.enterDecision(83);

                            int LA83_0 = input.LA(1);

                            if ( (LA83_0==DASH) ) {
                                alt83=1;
                            }
                            else if ( (LA83_0==WHITE_SPACE) ) {
                                alt83=2;
                            }
                            } finally {dbg.exitDecision(83);}

                            switch (alt83) {
                                case 1 :
                                    dbg.enterAlt(1);

                                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:406:32: DASH
                                    {
                                    dbg.location(406,32);
                                    DASH323=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_first_to_thirty_first3796); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_DASH.add(DASH323);


                                    }
                                    break;
                                case 2 :
                                    dbg.enterAlt(2);

                                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:406:39: WHITE_SPACE
                                    {
                                    dbg.location(406,39);
                                    WHITE_SPACE324=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_spelled_first_to_thirty_first3800); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE324);


                                    }
                                    break;

                            }
                            } finally {dbg.exitSubRule(83);}

                            dbg.location(406,53);
                            FIFTH325=(Token)match(input,FIFTH,FOLLOW_FIFTH_in_spelled_first_to_thirty_first3804); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_FIFTH.add(FIFTH325);


                            }


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(84);}



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 406:63: -> INT[\"25\"]
                    {
                        dbg.location(406,66);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "25"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 26 :
                    dbg.enterAlt(26);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:407:5: ( TWENTY_SIXTH | ( TWENTY ( DASH | WHITE_SPACE )? SIXTH ) )
                    {
                    dbg.location(407,5);
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:407:5: ( TWENTY_SIXTH | ( TWENTY ( DASH | WHITE_SPACE )? SIXTH ) )
                    int alt86=2;
                    try { dbg.enterSubRule(86);
                    try { dbg.enterDecision(86);

                    int LA86_0 = input.LA(1);

                    if ( (LA86_0==TWENTY_SIXTH) ) {
                        alt86=1;
                    }
                    else if ( (LA86_0==TWENTY) ) {
                        alt86=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 86, 0, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }
                    } finally {dbg.exitDecision(86);}

                    switch (alt86) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:407:6: TWENTY_SIXTH
                            {
                            dbg.location(407,6);
                            TWENTY_SIXTH326=(Token)match(input,TWENTY_SIXTH,FOLLOW_TWENTY_SIXTH_in_spelled_first_to_thirty_first3820); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY_SIXTH.add(TWENTY_SIXTH326);


                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:407:23: ( TWENTY ( DASH | WHITE_SPACE )? SIXTH )
                            {
                            dbg.location(407,23);
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:407:23: ( TWENTY ( DASH | WHITE_SPACE )? SIXTH )
                            dbg.enterAlt(1);

                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:407:24: TWENTY ( DASH | WHITE_SPACE )? SIXTH
                            {
                            dbg.location(407,24);
                            TWENTY327=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_first_to_thirty_first3827); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY327);

                            dbg.location(407,31);
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:407:31: ( DASH | WHITE_SPACE )?
                            int alt85=3;
                            try { dbg.enterSubRule(85);
                            try { dbg.enterDecision(85);

                            int LA85_0 = input.LA(1);

                            if ( (LA85_0==DASH) ) {
                                alt85=1;
                            }
                            else if ( (LA85_0==WHITE_SPACE) ) {
                                alt85=2;
                            }
                            } finally {dbg.exitDecision(85);}

                            switch (alt85) {
                                case 1 :
                                    dbg.enterAlt(1);

                                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:407:32: DASH
                                    {
                                    dbg.location(407,32);
                                    DASH328=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_first_to_thirty_first3830); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_DASH.add(DASH328);


                                    }
                                    break;
                                case 2 :
                                    dbg.enterAlt(2);

                                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:407:39: WHITE_SPACE
                                    {
                                    dbg.location(407,39);
                                    WHITE_SPACE329=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_spelled_first_to_thirty_first3834); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE329);


                                    }
                                    break;

                            }
                            } finally {dbg.exitSubRule(85);}

                            dbg.location(407,53);
                            SIXTH330=(Token)match(input,SIXTH,FOLLOW_SIXTH_in_spelled_first_to_thirty_first3838); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_SIXTH.add(SIXTH330);


                            }


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(86);}



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 407:63: -> INT[\"26\"]
                    {
                        dbg.location(407,66);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "26"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 27 :
                    dbg.enterAlt(27);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:408:5: ( TWENTY_SEVENTH | ( TWENTY ( DASH | WHITE_SPACE )? SEVENTH ) )
                    {
                    dbg.location(408,5);
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:408:5: ( TWENTY_SEVENTH | ( TWENTY ( DASH | WHITE_SPACE )? SEVENTH ) )
                    int alt88=2;
                    try { dbg.enterSubRule(88);
                    try { dbg.enterDecision(88);

                    int LA88_0 = input.LA(1);

                    if ( (LA88_0==TWENTY_SEVENTH) ) {
                        alt88=1;
                    }
                    else if ( (LA88_0==TWENTY) ) {
                        alt88=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 88, 0, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }
                    } finally {dbg.exitDecision(88);}

                    switch (alt88) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:408:6: TWENTY_SEVENTH
                            {
                            dbg.location(408,6);
                            TWENTY_SEVENTH331=(Token)match(input,TWENTY_SEVENTH,FOLLOW_TWENTY_SEVENTH_in_spelled_first_to_thirty_first3854); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY_SEVENTH.add(TWENTY_SEVENTH331);


                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:408:23: ( TWENTY ( DASH | WHITE_SPACE )? SEVENTH )
                            {
                            dbg.location(408,23);
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:408:23: ( TWENTY ( DASH | WHITE_SPACE )? SEVENTH )
                            dbg.enterAlt(1);

                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:408:24: TWENTY ( DASH | WHITE_SPACE )? SEVENTH
                            {
                            dbg.location(408,24);
                            TWENTY332=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_first_to_thirty_first3859); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY332);

                            dbg.location(408,31);
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:408:31: ( DASH | WHITE_SPACE )?
                            int alt87=3;
                            try { dbg.enterSubRule(87);
                            try { dbg.enterDecision(87);

                            int LA87_0 = input.LA(1);

                            if ( (LA87_0==DASH) ) {
                                alt87=1;
                            }
                            else if ( (LA87_0==WHITE_SPACE) ) {
                                alt87=2;
                            }
                            } finally {dbg.exitDecision(87);}

                            switch (alt87) {
                                case 1 :
                                    dbg.enterAlt(1);

                                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:408:32: DASH
                                    {
                                    dbg.location(408,32);
                                    DASH333=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_first_to_thirty_first3862); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_DASH.add(DASH333);


                                    }
                                    break;
                                case 2 :
                                    dbg.enterAlt(2);

                                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:408:39: WHITE_SPACE
                                    {
                                    dbg.location(408,39);
                                    WHITE_SPACE334=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_spelled_first_to_thirty_first3866); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE334);


                                    }
                                    break;

                            }
                            } finally {dbg.exitSubRule(87);}

                            dbg.location(408,53);
                            SEVENTH335=(Token)match(input,SEVENTH,FOLLOW_SEVENTH_in_spelled_first_to_thirty_first3870); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_SEVENTH.add(SEVENTH335);


                            }


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(88);}



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 408:63: -> INT[\"27\"]
                    {
                        dbg.location(408,66);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "27"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 28 :
                    dbg.enterAlt(28);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:409:5: ( TWENTY_EIGHTH | ( TWENTY ( DASH | WHITE_SPACE )? EIGHTH ) )
                    {
                    dbg.location(409,5);
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:409:5: ( TWENTY_EIGHTH | ( TWENTY ( DASH | WHITE_SPACE )? EIGHTH ) )
                    int alt90=2;
                    try { dbg.enterSubRule(90);
                    try { dbg.enterDecision(90);

                    int LA90_0 = input.LA(1);

                    if ( (LA90_0==TWENTY_EIGHTH) ) {
                        alt90=1;
                    }
                    else if ( (LA90_0==TWENTY) ) {
                        alt90=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 90, 0, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }
                    } finally {dbg.exitDecision(90);}

                    switch (alt90) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:409:6: TWENTY_EIGHTH
                            {
                            dbg.location(409,6);
                            TWENTY_EIGHTH336=(Token)match(input,TWENTY_EIGHTH,FOLLOW_TWENTY_EIGHTH_in_spelled_first_to_thirty_first3884); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY_EIGHTH.add(TWENTY_EIGHTH336);


                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:409:23: ( TWENTY ( DASH | WHITE_SPACE )? EIGHTH )
                            {
                            dbg.location(409,23);
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:409:23: ( TWENTY ( DASH | WHITE_SPACE )? EIGHTH )
                            dbg.enterAlt(1);

                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:409:24: TWENTY ( DASH | WHITE_SPACE )? EIGHTH
                            {
                            dbg.location(409,24);
                            TWENTY337=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_first_to_thirty_first3890); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY337);

                            dbg.location(409,31);
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:409:31: ( DASH | WHITE_SPACE )?
                            int alt89=3;
                            try { dbg.enterSubRule(89);
                            try { dbg.enterDecision(89);

                            int LA89_0 = input.LA(1);

                            if ( (LA89_0==DASH) ) {
                                alt89=1;
                            }
                            else if ( (LA89_0==WHITE_SPACE) ) {
                                alt89=2;
                            }
                            } finally {dbg.exitDecision(89);}

                            switch (alt89) {
                                case 1 :
                                    dbg.enterAlt(1);

                                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:409:32: DASH
                                    {
                                    dbg.location(409,32);
                                    DASH338=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_first_to_thirty_first3893); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_DASH.add(DASH338);


                                    }
                                    break;
                                case 2 :
                                    dbg.enterAlt(2);

                                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:409:39: WHITE_SPACE
                                    {
                                    dbg.location(409,39);
                                    WHITE_SPACE339=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_spelled_first_to_thirty_first3897); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE339);


                                    }
                                    break;

                            }
                            } finally {dbg.exitSubRule(89);}

                            dbg.location(409,53);
                            EIGHTH340=(Token)match(input,EIGHTH,FOLLOW_EIGHTH_in_spelled_first_to_thirty_first3901); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_EIGHTH.add(EIGHTH340);


                            }


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(90);}



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 409:63: -> INT[\"28\"]
                    {
                        dbg.location(409,66);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "28"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 29 :
                    dbg.enterAlt(29);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:410:5: ( TWENTY_NINTH | ( TWENTY ( DASH | WHITE_SPACE )? NINTH ) )
                    {
                    dbg.location(410,5);
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:410:5: ( TWENTY_NINTH | ( TWENTY ( DASH | WHITE_SPACE )? NINTH ) )
                    int alt92=2;
                    try { dbg.enterSubRule(92);
                    try { dbg.enterDecision(92);

                    int LA92_0 = input.LA(1);

                    if ( (LA92_0==TWENTY_NINTH) ) {
                        alt92=1;
                    }
                    else if ( (LA92_0==TWENTY) ) {
                        alt92=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 92, 0, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }
                    } finally {dbg.exitDecision(92);}

                    switch (alt92) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:410:6: TWENTY_NINTH
                            {
                            dbg.location(410,6);
                            TWENTY_NINTH341=(Token)match(input,TWENTY_NINTH,FOLLOW_TWENTY_NINTH_in_spelled_first_to_thirty_first3916); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY_NINTH.add(TWENTY_NINTH341);


                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:410:23: ( TWENTY ( DASH | WHITE_SPACE )? NINTH )
                            {
                            dbg.location(410,23);
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:410:23: ( TWENTY ( DASH | WHITE_SPACE )? NINTH )
                            dbg.enterAlt(1);

                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:410:24: TWENTY ( DASH | WHITE_SPACE )? NINTH
                            {
                            dbg.location(410,24);
                            TWENTY342=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_first_to_thirty_first3923); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY342);

                            dbg.location(410,31);
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:410:31: ( DASH | WHITE_SPACE )?
                            int alt91=3;
                            try { dbg.enterSubRule(91);
                            try { dbg.enterDecision(91);

                            int LA91_0 = input.LA(1);

                            if ( (LA91_0==DASH) ) {
                                alt91=1;
                            }
                            else if ( (LA91_0==WHITE_SPACE) ) {
                                alt91=2;
                            }
                            } finally {dbg.exitDecision(91);}

                            switch (alt91) {
                                case 1 :
                                    dbg.enterAlt(1);

                                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:410:32: DASH
                                    {
                                    dbg.location(410,32);
                                    DASH343=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_first_to_thirty_first3926); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_DASH.add(DASH343);


                                    }
                                    break;
                                case 2 :
                                    dbg.enterAlt(2);

                                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:410:39: WHITE_SPACE
                                    {
                                    dbg.location(410,39);
                                    WHITE_SPACE344=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_spelled_first_to_thirty_first3930); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE344);


                                    }
                                    break;

                            }
                            } finally {dbg.exitSubRule(91);}

                            dbg.location(410,53);
                            NINTH345=(Token)match(input,NINTH,FOLLOW_NINTH_in_spelled_first_to_thirty_first3934); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NINTH.add(NINTH345);


                            }


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(92);}



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 410:63: -> INT[\"29\"]
                    {
                        dbg.location(410,66);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "29"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 30 :
                    dbg.enterAlt(30);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:411:5: THIRTIETH
                    {
                    dbg.location(411,5);
                    THIRTIETH346=(Token)match(input,THIRTIETH,FOLLOW_THIRTIETH_in_spelled_first_to_thirty_first3949); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THIRTIETH.add(THIRTIETH346);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 411:63: -> INT[\"30\"]
                    {
                        dbg.location(411,66);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "30"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 31 :
                    dbg.enterAlt(31);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:412:5: ( THIRTY_FIRST | ( THIRTY ( DASH | WHITE_SPACE )? FIRST ) )
                    {
                    dbg.location(412,5);
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:412:5: ( THIRTY_FIRST | ( THIRTY ( DASH | WHITE_SPACE )? FIRST ) )
                    int alt94=2;
                    try { dbg.enterSubRule(94);
                    try { dbg.enterDecision(94);

                    int LA94_0 = input.LA(1);

                    if ( (LA94_0==THIRTY_FIRST) ) {
                        alt94=1;
                    }
                    else if ( (LA94_0==THIRTY) ) {
                        alt94=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 94, 0, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }
                    } finally {dbg.exitDecision(94);}

                    switch (alt94) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:412:6: THIRTY_FIRST
                            {
                            dbg.location(412,6);
                            THIRTY_FIRST347=(Token)match(input,THIRTY_FIRST,FOLLOW_THIRTY_FIRST_in_spelled_first_to_thirty_first4009); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_THIRTY_FIRST.add(THIRTY_FIRST347);


                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:412:23: ( THIRTY ( DASH | WHITE_SPACE )? FIRST )
                            {
                            dbg.location(412,23);
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:412:23: ( THIRTY ( DASH | WHITE_SPACE )? FIRST )
                            dbg.enterAlt(1);

                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:412:24: THIRTY ( DASH | WHITE_SPACE )? FIRST
                            {
                            dbg.location(412,24);
                            THIRTY348=(Token)match(input,THIRTY,FOLLOW_THIRTY_in_spelled_first_to_thirty_first4016); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_THIRTY.add(THIRTY348);

                            dbg.location(412,31);
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:412:31: ( DASH | WHITE_SPACE )?
                            int alt93=3;
                            try { dbg.enterSubRule(93);
                            try { dbg.enterDecision(93);

                            int LA93_0 = input.LA(1);

                            if ( (LA93_0==DASH) ) {
                                alt93=1;
                            }
                            else if ( (LA93_0==WHITE_SPACE) ) {
                                alt93=2;
                            }
                            } finally {dbg.exitDecision(93);}

                            switch (alt93) {
                                case 1 :
                                    dbg.enterAlt(1);

                                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:412:32: DASH
                                    {
                                    dbg.location(412,32);
                                    DASH349=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_first_to_thirty_first4019); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_DASH.add(DASH349);


                                    }
                                    break;
                                case 2 :
                                    dbg.enterAlt(2);

                                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:412:39: WHITE_SPACE
                                    {
                                    dbg.location(412,39);
                                    WHITE_SPACE350=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_spelled_first_to_thirty_first4023); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE350);


                                    }
                                    break;

                            }
                            } finally {dbg.exitSubRule(93);}

                            dbg.location(412,53);
                            FIRST351=(Token)match(input,FIRST,FOLLOW_FIRST_in_spelled_first_to_thirty_first4027); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_FIRST.add(FIRST351);


                            }


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(94);}



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 412:63: -> INT[\"31\"]
                    {
                        dbg.location(412,66);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "31"));

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(413, 3);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "spelled_first_to_thirty_first");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "spelled_first_to_thirty_first"

    // $ANTLR start synpred1_Date
    public final void synpred1_Date_fragment() throws RecognitionException {   
        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:43:7: ( date ( date_time_separator time )? )
        dbg.enterAlt(1);

        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:43:8: date ( date_time_separator time )?
        {
        dbg.location(43,8);
        pushFollow(FOLLOW_date_in_synpred1_Date172);
        date();

        state._fsp--;
        if (state.failed) return ;
        dbg.location(43,13);
        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:43:13: ( date_time_separator time )?
        int alt96=2;
        try { dbg.enterSubRule(96);
        try { dbg.enterDecision(96);

        int LA96_0 = input.LA(1);

        if ( (LA96_0==WHITE_SPACE||LA96_0==COMMA) ) {
            alt96=1;
        }
        } finally {dbg.exitDecision(96);}

        switch (alt96) {
            case 1 :
                dbg.enterAlt(1);

                // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:43:14: date_time_separator time
                {
                dbg.location(43,14);
                pushFollow(FOLLOW_date_time_separator_in_synpred1_Date175);
                date_time_separator();

                state._fsp--;
                if (state.failed) return ;
                dbg.location(43,34);
                pushFollow(FOLLOW_time_in_synpred1_Date177);
                time();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }
        } finally {dbg.exitSubRule(96);}


        }
    }
    // $ANTLR end synpred1_Date

    // $ANTLR start synpred2_Date
    public final void synpred2_Date_fragment() throws RecognitionException {   
        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:66:5: ( relaxed_date )
        dbg.enterAlt(1);

        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:66:6: relaxed_date
        {
        dbg.location(66,6);
        pushFollow(FOLLOW_relaxed_date_in_synpred2_Date338);
        relaxed_date();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_Date

    // $ANTLR start synpred3_Date
    public final void synpred3_Date_fragment() throws RecognitionException {   
        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:94:7: ( ( THE WHITE_SPACE )? relaxed_day_of_month WHITE_SPACE ( OF WHITE_SPACE )? relaxed_month relaxed_year_prefix relaxed_year )
        dbg.enterAlt(1);

        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:94:8: ( THE WHITE_SPACE )? relaxed_day_of_month WHITE_SPACE ( OF WHITE_SPACE )? relaxed_month relaxed_year_prefix relaxed_year
        {
        dbg.location(94,8);
        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:94:8: ( THE WHITE_SPACE )?
        int alt97=2;
        try { dbg.enterSubRule(97);
        try { dbg.enterDecision(97);

        int LA97_0 = input.LA(1);

        if ( (LA97_0==THE) ) {
            alt97=1;
        }
        } finally {dbg.exitDecision(97);}

        switch (alt97) {
            case 1 :
                dbg.enterAlt(1);

                // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:94:9: THE WHITE_SPACE
                {
                dbg.location(94,9);
                match(input,THE,FOLLOW_THE_in_synpred3_Date544); if (state.failed) return ;
                dbg.location(94,13);
                match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_synpred3_Date546); if (state.failed) return ;

                }
                break;

        }
        } finally {dbg.exitSubRule(97);}

        dbg.location(94,27);
        pushFollow(FOLLOW_relaxed_day_of_month_in_synpred3_Date550);
        relaxed_day_of_month();

        state._fsp--;
        if (state.failed) return ;
        dbg.location(94,48);
        match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_synpred3_Date552); if (state.failed) return ;
        dbg.location(94,60);
        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:94:60: ( OF WHITE_SPACE )?
        int alt98=2;
        try { dbg.enterSubRule(98);
        try { dbg.enterDecision(98);

        int LA98_0 = input.LA(1);

        if ( (LA98_0==OF) ) {
            alt98=1;
        }
        } finally {dbg.exitDecision(98);}

        switch (alt98) {
            case 1 :
                dbg.enterAlt(1);

                // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:94:61: OF WHITE_SPACE
                {
                dbg.location(94,61);
                match(input,OF,FOLLOW_OF_in_synpred3_Date555); if (state.failed) return ;
                dbg.location(94,64);
                match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_synpred3_Date557); if (state.failed) return ;

                }
                break;

        }
        } finally {dbg.exitSubRule(98);}

        dbg.location(94,78);
        pushFollow(FOLLOW_relaxed_month_in_synpred3_Date561);
        relaxed_month();

        state._fsp--;
        if (state.failed) return ;
        dbg.location(94,92);
        pushFollow(FOLLOW_relaxed_year_prefix_in_synpred3_Date563);
        relaxed_year_prefix();

        state._fsp--;
        if (state.failed) return ;
        dbg.location(94,112);
        pushFollow(FOLLOW_relaxed_year_in_synpred3_Date565);
        relaxed_year();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred3_Date

    // $ANTLR start synpred4_Date
    public final void synpred4_Date_fragment() throws RecognitionException {   
        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:97:9: ( relaxed_month WHITE_SPACE relaxed_day_of_month relaxed_year_prefix relaxed_year )
        dbg.enterAlt(1);

        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:97:10: relaxed_month WHITE_SPACE relaxed_day_of_month relaxed_year_prefix relaxed_year
        {
        dbg.location(97,10);
        pushFollow(FOLLOW_relaxed_month_in_synpred4_Date615);
        relaxed_month();

        state._fsp--;
        if (state.failed) return ;
        dbg.location(97,24);
        match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_synpred4_Date617); if (state.failed) return ;
        dbg.location(97,36);
        pushFollow(FOLLOW_relaxed_day_of_month_in_synpred4_Date619);
        relaxed_day_of_month();

        state._fsp--;
        if (state.failed) return ;
        dbg.location(97,57);
        pushFollow(FOLLOW_relaxed_year_prefix_in_synpred4_Date621);
        relaxed_year_prefix();

        state._fsp--;
        if (state.failed) return ;
        dbg.location(97,77);
        pushFollow(FOLLOW_relaxed_year_in_synpred4_Date623);
        relaxed_year();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred4_Date

    // Delegated rules

    public final boolean synpred1_Date() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred1_Date_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_Date() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred3_Date_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_Date() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred2_Date_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_Date() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred4_Date_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA3 dfa3 = new DFA3(this);
    protected DFA12 dfa12 = new DFA12(this);
    protected DFA21 dfa21 = new DFA21(this);
    protected DFA34 dfa34 = new DFA34(this);
    protected DFA55 dfa55 = new DFA55(this);
    protected DFA74 dfa74 = new DFA74(this);
    protected DFA95 dfa95 = new DFA95(this);
    static final String DFA3_eotS =
        "\u008c\uffff";
    static final String DFA3_eofS =
        "\2\uffff\4\137\101\uffff\1\137\30\uffff\1\u0083\1\uffff\1\u0083"+
        "\5\137\44\uffff";
    static final String DFA3_minS =
        "\1\31\1\uffff\4\25\101\uffff\1\25\30\uffff\1\25\1\uffff\6\25\1\uffff"+
        "\27\0\4\uffff\7\0\1\uffff";
    static final String DFA3_maxS =
        "\1\u0087\1\uffff\2\127\2\130\101\uffff\1\130\30\uffff\1\u0087\1"+
        "\uffff\1\u0087\5\116\1\uffff\27\0\4\uffff\7\0\1\uffff";
    static final String DFA3_acceptS =
        "\1\uffff\1\1\4\uffff\101\1\1\uffff\27\1\1\2\1\uffff\1\1\6\uffff"+
        "\1\1\27\uffff\4\1\7\uffff\1\1";
    static final String DFA3_specialS =
        "\1\3\1\uffff\1\14\1\46\1\0\1\24\101\uffff\1\33\30\uffff\1\4\1\uffff"+
        "\1\42\1\30\1\31\1\32\1\25\1\27\1\uffff\1\22\1\41\1\50\1\5\1\7\1"+
        "\6\1\1\1\2\1\21\1\23\1\12\1\17\1\36\1\40\1\44\1\47\1\52\1\34\1\35"+
        "\1\37\1\51\1\45\1\43\4\uffff\1\26\1\11\1\10\1\13\1\15\1\20\1\16"+
        "\1\uffff}>";
    static final String[] DFA3_transitionS = {
            "\1\1\1\130\3\uffff\1\73\1\74\1\75\1\76\1\77\1\100\1\101\1\102"+
            "\1\103\1\104\1\105\1\106\1\uffff\1\120\1\133\2\uffff\1\2\1\34"+
            "\1\35\1\36\1\37\1\40\1\113\1\112\1\114\1\115\1\116\1\117\3\uffff"+
            "\1\131\1\132\1\121\1\122\1\123\1\124\1\125\1\126\1\127\1\134"+
            "\1\135\1\136\5\uffff\3\137\1\107\1\3\1\4\1\5\1\6\1\110\1\111"+
            "\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22"+
            "\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\41\1\42\1\43"+
            "\1\44\1\45\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56\1\57"+
            "\1\60\1\61\1\62\1\63\1\64\1\65\1\66\1\67\1\70\1\71\1\72",
            "",
            "\1\140\1\uffff\1\137\25\uffff\2\141\33\uffff\1\137\2\uffff"+
            "\2\137\3\uffff\1\137\1\uffff\4\137",
            "\1\142\1\uffff\1\137\25\uffff\2\141\33\uffff\1\137\2\uffff"+
            "\2\137\3\uffff\1\137\1\uffff\4\137",
            "\1\142\1\uffff\1\137\25\uffff\2\141\33\uffff\1\137\2\uffff"+
            "\2\137\3\uffff\1\143\1\uffff\1\144\1\145\1\146\1\147\1\150",
            "\1\142\1\uffff\1\137\62\uffff\1\137\2\uffff\2\137\3\uffff\1"+
            "\143\1\uffff\1\144\1\145\1\146\1\147\1\150",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\137\1\uffff\1\137\62\uffff\1\137\2\uffff\2\137\3\uffff\1"+
            "\143\1\uffff\1\144\1\145\1\146\1\147\1\150",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u0081\1\uffff\1\u0082\2\137\1\151\2\uffff\1\u0080\1\152"+
            "\1\153\1\154\1\155\1\156\1\157\1\160\1\161\1\162\1\163\1\164"+
            "\1\165\1\uffff\1\137\1\177\2\uffff\14\137\3\uffff\1\175\1\176"+
            "\1\166\1\167\1\170\1\171\1\172\1\173\1\174\3\137\3\uffff\2\137"+
            "\3\uffff\66\137",
            "",
            "\1\u0081\1\uffff\1\u0082\2\137\1\151\2\uffff\1\u0080\1\152"+
            "\1\153\1\154\1\155\1\156\1\157\1\160\1\161\1\162\1\163\1\164"+
            "\1\165\1\uffff\1\137\1\177\2\uffff\14\137\3\uffff\1\175\1\176"+
            "\1\u0084\1\u0085\1\u0086\1\u0087\1\u0088\1\u0089\1\u008a\3\137"+
            "\3\uffff\2\137\3\uffff\66\137",
            "\1\137\1\uffff\1\137\25\uffff\2\u008b\34\uffff\4\137",
            "\1\137\1\uffff\1\137\25\uffff\2\u008b\34\uffff\4\137",
            "\1\137\1\uffff\1\137\25\uffff\2\u008b\34\uffff\4\137",
            "\1\137\1\uffff\1\137\25\uffff\2\u008b\34\uffff\4\137",
            "\1\137\1\uffff\1\137\25\uffff\2\u008b\34\uffff\4\137",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            ""
    };

    static final short[] DFA3_eot = DFA.unpackEncodedString(DFA3_eotS);
    static final short[] DFA3_eof = DFA.unpackEncodedString(DFA3_eofS);
    static final char[] DFA3_min = DFA.unpackEncodedStringToUnsignedChars(DFA3_minS);
    static final char[] DFA3_max = DFA.unpackEncodedStringToUnsignedChars(DFA3_maxS);
    static final short[] DFA3_accept = DFA.unpackEncodedString(DFA3_acceptS);
    static final short[] DFA3_special = DFA.unpackEncodedString(DFA3_specialS);
    static final short[][] DFA3_transition;

    static {
        int numStates = DFA3_transitionS.length;
        DFA3_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA3_transition[i] = DFA.unpackEncodedString(DFA3_transitionS[i]);
        }
    }

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = DFA3_eot;
            this.eof = DFA3_eof;
            this.min = DFA3_min;
            this.max = DFA3_max;
            this.accept = DFA3_accept;
            this.special = DFA3_special;
            this.transition = DFA3_transition;
        }
        public String getDescription() {
            return "42:5: ( ( date ( date_time_separator time )? )=> date ( date_time_separator time )? | time ( time_date_separator date )? )";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA3_4 = input.LA(1);

                         
                        int index3_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA3_4==EOF||LA3_4==COMMA||LA3_4==COLON||(LA3_4>=AM && LA3_4<=PM)) ) {s = 95;}

                        else if ( (LA3_4==INT_00) ) {s = 99;}

                        else if ( (LA3_4==INT_01_TO_12) ) {s = 100;}

                        else if ( (LA3_4==INT_13_TO_23) ) {s = 101;}

                        else if ( (LA3_4==INT_24_TO_31) ) {s = 102;}

                        else if ( (LA3_4==INT_32_TO_59) ) {s = 103;}

                        else if ( (LA3_4==WHITE_SPACE) ) {s = 98;}

                        else if ( (LA3_4==INT_60_TO_99) && (synpred1_Date())) {s = 104;}

                        else if ( ((LA3_4>=DASH && LA3_4<=SLASH)) && (synpred1_Date())) {s = 97;}

                         
                        input.seek(index3_4);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA3_111 = input.LA(1);

                         
                        int index3_111 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 139;}

                        else if ( (true) ) {s = 95;}

                         
                        input.seek(index3_111);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA3_112 = input.LA(1);

                         
                        int index3_112 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 139;}

                        else if ( (true) ) {s = 95;}

                         
                        input.seek(index3_112);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA3_0 = input.LA(1);

                         
                        int index3_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA3_0==THE) && (synpred1_Date())) {s = 1;}

                        else if ( (LA3_0==INT_1_TO_5) ) {s = 2;}

                        else if ( (LA3_0==INT_6_TO_9) ) {s = 3;}

                        else if ( (LA3_0==INT_01_TO_12) ) {s = 4;}

                        else if ( (LA3_0==INT_13_TO_23) ) {s = 5;}

                        else if ( (LA3_0==INT_24_TO_31) && (synpred1_Date())) {s = 6;}

                        else if ( (LA3_0==ONE) && (synpred1_Date())) {s = 7;}

                        else if ( (LA3_0==TWO) && (synpred1_Date())) {s = 8;}

                        else if ( (LA3_0==THREE) && (synpred1_Date())) {s = 9;}

                        else if ( (LA3_0==FOUR) && (synpred1_Date())) {s = 10;}

                        else if ( (LA3_0==FIVE) && (synpred1_Date())) {s = 11;}

                        else if ( (LA3_0==SIX) && (synpred1_Date())) {s = 12;}

                        else if ( (LA3_0==SEVEN) && (synpred1_Date())) {s = 13;}

                        else if ( (LA3_0==EIGHT) && (synpred1_Date())) {s = 14;}

                        else if ( (LA3_0==NINE) && (synpred1_Date())) {s = 15;}

                        else if ( (LA3_0==TEN) && (synpred1_Date())) {s = 16;}

                        else if ( (LA3_0==ELEVEN) && (synpred1_Date())) {s = 17;}

                        else if ( (LA3_0==TWELVE) && (synpred1_Date())) {s = 18;}

                        else if ( (LA3_0==THIRTEEN) && (synpred1_Date())) {s = 19;}

                        else if ( (LA3_0==FOURTEEN) && (synpred1_Date())) {s = 20;}

                        else if ( (LA3_0==FIFTEEN) && (synpred1_Date())) {s = 21;}

                        else if ( (LA3_0==SIXTEEN) && (synpred1_Date())) {s = 22;}

                        else if ( (LA3_0==SEVENTEEN) && (synpred1_Date())) {s = 23;}

                        else if ( (LA3_0==EIGHTEEN) && (synpred1_Date())) {s = 24;}

                        else if ( (LA3_0==NINETEEN) && (synpred1_Date())) {s = 25;}

                        else if ( (LA3_0==TWENTY) && (synpred1_Date())) {s = 26;}

                        else if ( (LA3_0==THIRTY) && (synpred1_Date())) {s = 27;}

                        else if ( (LA3_0==FIRST) && (synpred1_Date())) {s = 28;}

                        else if ( (LA3_0==SECOND) && (synpred1_Date())) {s = 29;}

                        else if ( (LA3_0==THIRD) && (synpred1_Date())) {s = 30;}

                        else if ( (LA3_0==FOURTH) && (synpred1_Date())) {s = 31;}

                        else if ( (LA3_0==FIFTH) && (synpred1_Date())) {s = 32;}

                        else if ( (LA3_0==SIXTH) && (synpred1_Date())) {s = 33;}

                        else if ( (LA3_0==SEVENTH) && (synpred1_Date())) {s = 34;}

                        else if ( (LA3_0==EIGHTH) && (synpred1_Date())) {s = 35;}

                        else if ( (LA3_0==NINTH) && (synpred1_Date())) {s = 36;}

                        else if ( (LA3_0==TENTH) && (synpred1_Date())) {s = 37;}

                        else if ( (LA3_0==ELEVENTH) && (synpred1_Date())) {s = 38;}

                        else if ( (LA3_0==TWELFTH) && (synpred1_Date())) {s = 39;}

                        else if ( (LA3_0==THIRTEENTH) && (synpred1_Date())) {s = 40;}

                        else if ( (LA3_0==FOURTEENTH) && (synpred1_Date())) {s = 41;}

                        else if ( (LA3_0==FIFTEENTH) && (synpred1_Date())) {s = 42;}

                        else if ( (LA3_0==SIXTEENTH) && (synpred1_Date())) {s = 43;}

                        else if ( (LA3_0==SEVENTEENTH) && (synpred1_Date())) {s = 44;}

                        else if ( (LA3_0==EIGHTEENTH) && (synpred1_Date())) {s = 45;}

                        else if ( (LA3_0==NINETEENTH) && (synpred1_Date())) {s = 46;}

                        else if ( (LA3_0==TWENTIETH) && (synpred1_Date())) {s = 47;}

                        else if ( (LA3_0==TWENTY_FIRST) && (synpred1_Date())) {s = 48;}

                        else if ( (LA3_0==TWENTY_SECOND) && (synpred1_Date())) {s = 49;}

                        else if ( (LA3_0==TWENTY_THIRD) && (synpred1_Date())) {s = 50;}

                        else if ( (LA3_0==TWENTY_FOURTH) && (synpred1_Date())) {s = 51;}

                        else if ( (LA3_0==TWENTY_FIFTH) && (synpred1_Date())) {s = 52;}

                        else if ( (LA3_0==TWENTY_SIXTH) && (synpred1_Date())) {s = 53;}

                        else if ( (LA3_0==TWENTY_SEVENTH) && (synpred1_Date())) {s = 54;}

                        else if ( (LA3_0==TWENTY_EIGHTH) && (synpred1_Date())) {s = 55;}

                        else if ( (LA3_0==TWENTY_NINTH) && (synpred1_Date())) {s = 56;}

                        else if ( (LA3_0==THIRTIETH) && (synpred1_Date())) {s = 57;}

                        else if ( (LA3_0==THIRTY_FIRST) && (synpred1_Date())) {s = 58;}

                        else if ( (LA3_0==JANUARY) && (synpred1_Date())) {s = 59;}

                        else if ( (LA3_0==FEBRUARY) && (synpred1_Date())) {s = 60;}

                        else if ( (LA3_0==MARCH) && (synpred1_Date())) {s = 61;}

                        else if ( (LA3_0==APRIL) && (synpred1_Date())) {s = 62;}

                        else if ( (LA3_0==MAY) && (synpred1_Date())) {s = 63;}

                        else if ( (LA3_0==JUNE) && (synpred1_Date())) {s = 64;}

                        else if ( (LA3_0==JULY) && (synpred1_Date())) {s = 65;}

                        else if ( (LA3_0==AUGUST) && (synpred1_Date())) {s = 66;}

                        else if ( (LA3_0==SEPTEMBER) && (synpred1_Date())) {s = 67;}

                        else if ( (LA3_0==OCTOBER) && (synpred1_Date())) {s = 68;}

                        else if ( (LA3_0==NOVEMBER) && (synpred1_Date())) {s = 69;}

                        else if ( (LA3_0==DECEMBER) && (synpred1_Date())) {s = 70;}

                        else if ( (LA3_0==INT_00) ) {s = 71;}

                        else if ( (LA3_0==INT_32_TO_59) && (synpred1_Date())) {s = 72;}

                        else if ( (LA3_0==INT_60_TO_99) && (synpred1_Date())) {s = 73;}

                        else if ( (LA3_0==THIS) && (synpred1_Date())) {s = 74;}

                        else if ( (LA3_0==LAST) && (synpred1_Date())) {s = 75;}

                        else if ( (LA3_0==NEXT) && (synpred1_Date())) {s = 76;}

                        else if ( (LA3_0==PAST) && (synpred1_Date())) {s = 77;}

                        else if ( (LA3_0==COMING) && (synpred1_Date())) {s = 78;}

                        else if ( (LA3_0==UPCOMING) && (synpred1_Date())) {s = 79;}

                        else if ( (LA3_0==IN) && (synpred1_Date())) {s = 80;}

                        else if ( (LA3_0==SUNDAY) && (synpred1_Date())) {s = 81;}

                        else if ( (LA3_0==MONDAY) && (synpred1_Date())) {s = 82;}

                        else if ( (LA3_0==TUESDAY) && (synpred1_Date())) {s = 83;}

                        else if ( (LA3_0==WEDNESDAY) && (synpred1_Date())) {s = 84;}

                        else if ( (LA3_0==THURSDAY) && (synpred1_Date())) {s = 85;}

                        else if ( (LA3_0==FRIDAY) && (synpred1_Date())) {s = 86;}

                        else if ( (LA3_0==SATURDAY) && (synpred1_Date())) {s = 87;}

                        else if ( (LA3_0==DAY) && (synpred1_Date())) {s = 88;}

                        else if ( (LA3_0==WEEK) && (synpred1_Date())) {s = 89;}

                        else if ( (LA3_0==MONTH) && (synpred1_Date())) {s = 90;}

                        else if ( (LA3_0==YEAR) && (synpred1_Date())) {s = 91;}

                        else if ( (LA3_0==TODAY) && (synpred1_Date())) {s = 92;}

                        else if ( (LA3_0==TOMORROW) && (synpred1_Date())) {s = 93;}

                        else if ( (LA3_0==YESTERDAY) && (synpred1_Date())) {s = 94;}

                        else if ( ((LA3_0>=NOON && LA3_0<=INT_0)) ) {s = 95;}

                         
                        input.seek(index3_0);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA3_96 = input.LA(1);

                         
                        int index3_96 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA3_96==DAY) ) {s = 105;}

                        else if ( ((LA3_96>=ON && LA3_96<=THE)||LA3_96==IN||(LA3_96>=INT_1_TO_5 && LA3_96<=UPCOMING)||(LA3_96>=TODAY && LA3_96<=YESTERDAY)||(LA3_96>=AM && LA3_96<=PM)||(LA3_96>=INT_00 && LA3_96<=THIRTY_FIRST)) ) {s = 95;}

                        else if ( (LA3_96==JANUARY) ) {s = 106;}

                        else if ( (LA3_96==FEBRUARY) ) {s = 107;}

                        else if ( (LA3_96==MARCH) ) {s = 108;}

                        else if ( (LA3_96==APRIL) ) {s = 109;}

                        else if ( (LA3_96==MAY) ) {s = 110;}

                        else if ( (LA3_96==JUNE) ) {s = 111;}

                        else if ( (LA3_96==JULY) ) {s = 112;}

                        else if ( (LA3_96==AUGUST) ) {s = 113;}

                        else if ( (LA3_96==SEPTEMBER) ) {s = 114;}

                        else if ( (LA3_96==OCTOBER) ) {s = 115;}

                        else if ( (LA3_96==NOVEMBER) ) {s = 116;}

                        else if ( (LA3_96==DECEMBER) ) {s = 117;}

                        else if ( (LA3_96==SUNDAY) ) {s = 118;}

                        else if ( (LA3_96==MONDAY) ) {s = 119;}

                        else if ( (LA3_96==TUESDAY) ) {s = 120;}

                        else if ( (LA3_96==WEDNESDAY) ) {s = 121;}

                        else if ( (LA3_96==THURSDAY) ) {s = 122;}

                        else if ( (LA3_96==FRIDAY) ) {s = 123;}

                        else if ( (LA3_96==SATURDAY) ) {s = 124;}

                        else if ( (LA3_96==WEEK) ) {s = 125;}

                        else if ( (LA3_96==MONTH) ) {s = 126;}

                        else if ( (LA3_96==YEAR) ) {s = 127;}

                        else if ( (LA3_96==OF) && (synpred1_Date())) {s = 128;}

                        else if ( (LA3_96==WHITE_SPACE) && (synpred1_Date())) {s = 129;}

                        else if ( (LA3_96==COMMA) && (synpred1_Date())) {s = 130;}

                        else if ( (LA3_96==EOF) && (synpred1_Date())) {s = 131;}

                         
                        input.seek(index3_96);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA3_108 = input.LA(1);

                         
                        int index3_108 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 139;}

                        else if ( (true) ) {s = 95;}

                         
                        input.seek(index3_108);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA3_110 = input.LA(1);

                         
                        int index3_110 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 139;}

                        else if ( (true) ) {s = 95;}

                         
                        input.seek(index3_110);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA3_109 = input.LA(1);

                         
                        int index3_109 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 139;}

                        else if ( (true) ) {s = 95;}

                         
                        input.seek(index3_109);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA3_134 = input.LA(1);

                         
                        int index3_134 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 139;}

                        else if ( (true) ) {s = 95;}

                         
                        input.seek(index3_134);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA3_133 = input.LA(1);

                         
                        int index3_133 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 139;}

                        else if ( (true) ) {s = 95;}

                         
                        input.seek(index3_133);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA3_115 = input.LA(1);

                         
                        int index3_115 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 139;}

                        else if ( (true) ) {s = 95;}

                         
                        input.seek(index3_115);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA3_135 = input.LA(1);

                         
                        int index3_135 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 139;}

                        else if ( (true) ) {s = 95;}

                         
                        input.seek(index3_135);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA3_2 = input.LA(1);

                         
                        int index3_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA3_2==WHITE_SPACE) ) {s = 96;}

                        else if ( ((LA3_2>=DASH && LA3_2<=SLASH)) && (synpred1_Date())) {s = 97;}

                        else if ( (LA3_2==EOF||LA3_2==COMMA||LA3_2==COLON||(LA3_2>=AM && LA3_2<=PM)||LA3_2==INT_00||(LA3_2>=INT_01_TO_12 && LA3_2<=INT_32_TO_59)) ) {s = 95;}

                         
                        input.seek(index3_2);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA3_136 = input.LA(1);

                         
                        int index3_136 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 139;}

                        else if ( (true) ) {s = 95;}

                         
                        input.seek(index3_136);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA3_138 = input.LA(1);

                         
                        int index3_138 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 139;}

                        else if ( (true) ) {s = 95;}

                         
                        input.seek(index3_138);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA3_116 = input.LA(1);

                         
                        int index3_116 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 139;}

                        else if ( (true) ) {s = 95;}

                         
                        input.seek(index3_116);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA3_137 = input.LA(1);

                         
                        int index3_137 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 139;}

                        else if ( (true) ) {s = 95;}

                         
                        input.seek(index3_137);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA3_113 = input.LA(1);

                         
                        int index3_113 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 139;}

                        else if ( (true) ) {s = 95;}

                         
                        input.seek(index3_113);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA3_105 = input.LA(1);

                         
                        int index3_105 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 139;}

                        else if ( (true) ) {s = 95;}

                         
                        input.seek(index3_105);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA3_114 = input.LA(1);

                         
                        int index3_114 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 139;}

                        else if ( (true) ) {s = 95;}

                         
                        input.seek(index3_114);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA3_5 = input.LA(1);

                         
                        int index3_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA3_5==INT_00) ) {s = 99;}

                        else if ( (LA3_5==INT_01_TO_12) ) {s = 100;}

                        else if ( (LA3_5==INT_13_TO_23) ) {s = 101;}

                        else if ( (LA3_5==INT_24_TO_31) ) {s = 102;}

                        else if ( (LA3_5==INT_32_TO_59) ) {s = 103;}

                        else if ( (LA3_5==INT_60_TO_99) && (synpred1_Date())) {s = 104;}

                        else if ( (LA3_5==WHITE_SPACE) ) {s = 98;}

                        else if ( (LA3_5==EOF||LA3_5==COMMA||LA3_5==COLON||(LA3_5>=AM && LA3_5<=PM)) ) {s = 95;}

                         
                        input.seek(index3_5);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA3_102 = input.LA(1);

                         
                        int index3_102 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA3_102>=DASH && LA3_102<=SLASH)) && (synpred1_Date())) {s = 139;}

                        else if ( (LA3_102==EOF||LA3_102==WHITE_SPACE||LA3_102==COMMA||(LA3_102>=MILITARY_HOUR_SUFFIX && LA3_102<=PM)) ) {s = 95;}

                         
                        input.seek(index3_102);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA3_132 = input.LA(1);

                         
                        int index3_132 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 139;}

                        else if ( (true) ) {s = 95;}

                         
                        input.seek(index3_132);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA3_103 = input.LA(1);

                         
                        int index3_103 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA3_103>=DASH && LA3_103<=SLASH)) && (synpred1_Date())) {s = 139;}

                        else if ( (LA3_103==EOF||LA3_103==WHITE_SPACE||LA3_103==COMMA||(LA3_103>=MILITARY_HOUR_SUFFIX && LA3_103<=PM)) ) {s = 95;}

                         
                        input.seek(index3_103);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA3_99 = input.LA(1);

                         
                        int index3_99 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA3_99==EOF||LA3_99==WHITE_SPACE||LA3_99==COMMA||(LA3_99>=MILITARY_HOUR_SUFFIX && LA3_99<=PM)) ) {s = 95;}

                        else if ( ((LA3_99>=DASH && LA3_99<=SLASH)) && (synpred1_Date())) {s = 139;}

                         
                        input.seek(index3_99);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA3_100 = input.LA(1);

                         
                        int index3_100 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA3_100>=DASH && LA3_100<=SLASH)) && (synpred1_Date())) {s = 139;}

                        else if ( (LA3_100==EOF||LA3_100==WHITE_SPACE||LA3_100==COMMA||(LA3_100>=MILITARY_HOUR_SUFFIX && LA3_100<=PM)) ) {s = 95;}

                         
                        input.seek(index3_100);
                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA3_101 = input.LA(1);

                         
                        int index3_101 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA3_101>=DASH && LA3_101<=SLASH)) && (synpred1_Date())) {s = 139;}

                        else if ( (LA3_101==EOF||LA3_101==WHITE_SPACE||LA3_101==COMMA||(LA3_101>=MILITARY_HOUR_SUFFIX && LA3_101<=PM)) ) {s = 95;}

                         
                        input.seek(index3_101);
                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA3_71 = input.LA(1);

                         
                        int index3_71 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA3_71==INT_00) ) {s = 99;}

                        else if ( (LA3_71==INT_01_TO_12) ) {s = 100;}

                        else if ( (LA3_71==INT_13_TO_23) ) {s = 101;}

                        else if ( (LA3_71==INT_24_TO_31) ) {s = 102;}

                        else if ( (LA3_71==INT_32_TO_59) ) {s = 103;}

                        else if ( (LA3_71==INT_60_TO_99) && (synpred1_Date())) {s = 104;}

                        else if ( (LA3_71==EOF||LA3_71==WHITE_SPACE||LA3_71==COMMA||LA3_71==COLON||(LA3_71>=AM && LA3_71<=PM)) ) {s = 95;}

                         
                        input.seek(index3_71);
                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA3_122 = input.LA(1);

                         
                        int index3_122 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 139;}

                        else if ( (true) ) {s = 95;}

                         
                        input.seek(index3_122);
                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA3_123 = input.LA(1);

                         
                        int index3_123 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 139;}

                        else if ( (true) ) {s = 95;}

                         
                        input.seek(index3_123);
                        if ( s>=0 ) return s;
                        break;
                    case 30 : 
                        int LA3_117 = input.LA(1);

                         
                        int index3_117 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 139;}

                        else if ( (true) ) {s = 95;}

                         
                        input.seek(index3_117);
                        if ( s>=0 ) return s;
                        break;
                    case 31 : 
                        int LA3_124 = input.LA(1);

                         
                        int index3_124 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 139;}

                        else if ( (true) ) {s = 95;}

                         
                        input.seek(index3_124);
                        if ( s>=0 ) return s;
                        break;
                    case 32 : 
                        int LA3_118 = input.LA(1);

                         
                        int index3_118 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 139;}

                        else if ( (true) ) {s = 95;}

                         
                        input.seek(index3_118);
                        if ( s>=0 ) return s;
                        break;
                    case 33 : 
                        int LA3_106 = input.LA(1);

                         
                        int index3_106 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 139;}

                        else if ( (true) ) {s = 95;}

                         
                        input.seek(index3_106);
                        if ( s>=0 ) return s;
                        break;
                    case 34 : 
                        int LA3_98 = input.LA(1);

                         
                        int index3_98 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA3_98==DAY) ) {s = 105;}

                        else if ( ((LA3_98>=ON && LA3_98<=THE)||LA3_98==IN||(LA3_98>=INT_1_TO_5 && LA3_98<=UPCOMING)||(LA3_98>=TODAY && LA3_98<=YESTERDAY)||(LA3_98>=AM && LA3_98<=PM)||(LA3_98>=INT_00 && LA3_98<=THIRTY_FIRST)) ) {s = 95;}

                        else if ( (LA3_98==JANUARY) ) {s = 106;}

                        else if ( (LA3_98==FEBRUARY) ) {s = 107;}

                        else if ( (LA3_98==MARCH) ) {s = 108;}

                        else if ( (LA3_98==APRIL) ) {s = 109;}

                        else if ( (LA3_98==MAY) ) {s = 110;}

                        else if ( (LA3_98==JUNE) ) {s = 111;}

                        else if ( (LA3_98==JULY) ) {s = 112;}

                        else if ( (LA3_98==AUGUST) ) {s = 113;}

                        else if ( (LA3_98==SEPTEMBER) ) {s = 114;}

                        else if ( (LA3_98==OCTOBER) ) {s = 115;}

                        else if ( (LA3_98==NOVEMBER) ) {s = 116;}

                        else if ( (LA3_98==DECEMBER) ) {s = 117;}

                        else if ( (LA3_98==SUNDAY) ) {s = 132;}

                        else if ( (LA3_98==MONDAY) ) {s = 133;}

                        else if ( (LA3_98==TUESDAY) ) {s = 134;}

                        else if ( (LA3_98==WEDNESDAY) ) {s = 135;}

                        else if ( (LA3_98==THURSDAY) ) {s = 136;}

                        else if ( (LA3_98==FRIDAY) ) {s = 137;}

                        else if ( (LA3_98==SATURDAY) ) {s = 138;}

                        else if ( (LA3_98==WEEK) ) {s = 125;}

                        else if ( (LA3_98==MONTH) ) {s = 126;}

                        else if ( (LA3_98==YEAR) ) {s = 127;}

                        else if ( (LA3_98==OF) && (synpred1_Date())) {s = 128;}

                        else if ( (LA3_98==WHITE_SPACE) && (synpred1_Date())) {s = 129;}

                        else if ( (LA3_98==COMMA) && (synpred1_Date())) {s = 130;}

                        else if ( (LA3_98==EOF) && (synpred1_Date())) {s = 131;}

                         
                        input.seek(index3_98);
                        if ( s>=0 ) return s;
                        break;
                    case 35 : 
                        int LA3_127 = input.LA(1);

                         
                        int index3_127 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 139;}

                        else if ( (true) ) {s = 95;}

                         
                        input.seek(index3_127);
                        if ( s>=0 ) return s;
                        break;
                    case 36 : 
                        int LA3_119 = input.LA(1);

                         
                        int index3_119 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 139;}

                        else if ( (true) ) {s = 95;}

                         
                        input.seek(index3_119);
                        if ( s>=0 ) return s;
                        break;
                    case 37 : 
                        int LA3_126 = input.LA(1);

                         
                        int index3_126 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 139;}

                        else if ( (true) ) {s = 95;}

                         
                        input.seek(index3_126);
                        if ( s>=0 ) return s;
                        break;
                    case 38 : 
                        int LA3_3 = input.LA(1);

                         
                        int index3_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA3_3==WHITE_SPACE) ) {s = 98;}

                        else if ( (LA3_3==EOF||LA3_3==COMMA||LA3_3==COLON||(LA3_3>=AM && LA3_3<=PM)||LA3_3==INT_00||(LA3_3>=INT_01_TO_12 && LA3_3<=INT_32_TO_59)) ) {s = 95;}

                        else if ( ((LA3_3>=DASH && LA3_3<=SLASH)) && (synpred1_Date())) {s = 97;}

                         
                        input.seek(index3_3);
                        if ( s>=0 ) return s;
                        break;
                    case 39 : 
                        int LA3_120 = input.LA(1);

                         
                        int index3_120 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 139;}

                        else if ( (true) ) {s = 95;}

                         
                        input.seek(index3_120);
                        if ( s>=0 ) return s;
                        break;
                    case 40 : 
                        int LA3_107 = input.LA(1);

                         
                        int index3_107 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 139;}

                        else if ( (true) ) {s = 95;}

                         
                        input.seek(index3_107);
                        if ( s>=0 ) return s;
                        break;
                    case 41 : 
                        int LA3_125 = input.LA(1);

                         
                        int index3_125 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 139;}

                        else if ( (true) ) {s = 95;}

                         
                        input.seek(index3_125);
                        if ( s>=0 ) return s;
                        break;
                    case 42 : 
                        int LA3_121 = input.LA(1);

                         
                        int index3_121 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 139;}

                        else if ( (true) ) {s = 95;}

                         
                        input.seek(index3_121);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 3, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA12_eotS =
        "\u00e3\uffff";
    static final String DFA12_eofS =
        "\73\uffff\14\110\2\uffff\1\110\1\uffff\2\110\1\uffff\1\110\23\uffff"+
        "\1\110\54\uffff\1\110\123\uffff";
    static final String DFA12_minS =
        "\1\31\40\25\32\uffff\14\25\2\uffff\1\25\1\32\2\25\1\60\2\25\1\uffff"+
        "\1\25\2\uffff\1\25\1\uffff\3\25\1\uffff\1\25\2\uffff\2\25\2\uffff"+
        "\1\60\2\25\1\uffff\1\35\2\26\1\uffff\1\25\45\uffff\1\25\14\0\15"+
        "\uffff\4\0\65\uffff\1\26";
    static final String DFA12_maxS =
        "\1\u0087\1\25\2\56\3\130\23\25\1\161\1\131\5\25\32\uffff\14\27\2"+
        "\uffff\1\27\1\u0087\2\106\2\161\1\25\1\uffff\1\25\2\uffff\1\25\1"+
        "\uffff\3\25\1\uffff\1\25\2\uffff\2\25\2\uffff\2\131\1\25\1\uffff"+
        "\1\106\1\u0087\1\125\1\uffff\1\25\45\uffff\1\27\14\0\15\uffff\4"+
        "\0\65\uffff\1\125";
    static final String DFA12_acceptS =
        "\41\uffff\32\1\14\uffff\1\2\1\3\7\uffff\1\1\1\uffff\2\1\1\uffff"+
        "\1\1\3\uffff\1\1\1\uffff\2\1\2\uffff\2\1\3\uffff\1\1\3\uffff\1\4"+
        "\1\uffff\45\1\15\uffff\15\1\4\uffff\65\1\1\uffff";
    static final String DFA12_specialS =
        "\1\1\31\uffff\1\25\1\10\56\uffff\1\12\1\21\1\32\1\31\1\26\22\uffff"+
        "\1\16\1\33\2\uffff\1\22\1\13\51\uffff\1\14\1\15\1\5\1\6\1\7\1\11"+
        "\1\0\1\2\1\3\1\4\1\30\1\27\15\uffff\1\20\1\17\1\23\1\24\66\uffff}>";
    static final String[] DFA12_transitionS = {
            "\1\1\1\111\3\uffff\1\73\1\74\1\75\1\76\1\77\1\100\1\101\1\102"+
            "\1\103\1\104\1\105\1\106\1\uffff\2\110\2\uffff\1\2\1\34\1\35"+
            "\1\36\1\37\1\40\6\110\3\uffff\14\110\10\uffff\1\107\1\3\1\4"+
            "\1\5\1\6\2\107\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1"+
            "\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1"+
            "\41\1\42\1\43\1\44\1\45\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1"+
            "\55\1\56\1\57\1\60\1\61\1\62\1\63\1\64\1\65\1\66\1\67\1\70\1"+
            "\71\1\72",
            "\1\112",
            "\1\113\27\uffff\2\107",
            "\1\114\27\uffff\2\107",
            "\1\114\27\uffff\2\107\43\uffff\1\107\1\uffff\5\107",
            "\1\114\74\uffff\1\107\1\uffff\5\107",
            "\1\114\74\uffff\1\107\1\uffff\5\107",
            "\1\114",
            "\1\114",
            "\1\114",
            "\1\114",
            "\1\114",
            "\1\114",
            "\1\114",
            "\1\114",
            "\1\114",
            "\1\114",
            "\1\114",
            "\1\114",
            "\1\114",
            "\1\114",
            "\1\114",
            "\1\114",
            "\1\114",
            "\1\114",
            "\1\114",
            "\1\116\27\uffff\1\115\2\uffff\1\137\1\133\1\123\1\120\1\125"+
            "\44\uffff\1\117\1\126\1\132\1\127\1\136\1\135\1\121\1\124\1"+
            "\130\14\uffff\1\122\1\140\1\134\1\131",
            "\1\142\27\uffff\1\141\2\uffff\1\144\50\uffff\1\143",
            "\1\145",
            "\1\145",
            "\1\145",
            "\1\145",
            "\1\145",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\146\1\uffff\1\110",
            "\1\146\1\uffff\1\110",
            "\1\146\1\uffff\1\110",
            "\1\146\1\uffff\1\110",
            "\1\146\1\uffff\1\110",
            "\1\146\1\uffff\1\110",
            "\1\146\1\uffff\1\110",
            "\1\146\1\uffff\1\110",
            "\1\146\1\uffff\1\110",
            "\1\146\1\uffff\1\110",
            "\1\146\1\uffff\1\110",
            "\1\146\1\uffff\1\110",
            "",
            "",
            "\1\147\1\uffff\1\110",
            "\1\150\3\uffff\1\u0083\1\u0084\1\u0085\1\u0086\1\u0087\1\u0088"+
            "\1\u0089\1\u008a\1\u008b\1\u008c\1\u008d\1\u008e\5\uffff\1\151"+
            "\1\34\1\35\1\36\1\37\1\40\1\110\35\uffff\1\152\1\153\1\154\1"+
            "\155\2\uffff\1\156\1\157\1\160\1\161\1\162\1\163\1\164\1\165"+
            "\1\166\1\167\1\170\1\171\1\172\1\173\1\174\1\175\1\176\1\177"+
            "\1\u0080\1\u0081\1\u0082\1\41\1\42\1\43\1\44\1\45\1\46\1\47"+
            "\1\50\1\51\1\52\1\53\1\54\1\55\1\56\1\57\1\60\1\61\1\62\1\63"+
            "\1\64\1\65\1\66\1\67\1\70\1\71\1\72",
            "\1\110\1\uffff\1\110\2\uffff\1\u008f\2\uffff\1\u009c\1\u0090"+
            "\1\u0091\1\u0092\1\u0093\1\u0094\1\u0095\1\u0096\1\u0097\1\u0098"+
            "\1\u0099\1\u009a\1\u009b\2\uffff\1\110\21\uffff\11\110",
            "\1\110\1\uffff\1\110\2\uffff\1\u008f\2\uffff\1\u009c\1\u0090"+
            "\1\u0091\1\u0092\1\u0093\1\u0094\1\u0095\1\u0096\1\u0097\1\u0098"+
            "\1\u0099\1\u009a\1\u009b\2\uffff\1\110\21\uffff\11\110",
            "\1\137\1\133\1\123\1\120\1\125\44\uffff\1\117\1\126\1\132\1"+
            "\127\1\136\1\135\1\121\1\124\1\130\14\uffff\1\122\1\140\1\134"+
            "\1\131",
            "\1\110\1\uffff\1\110\2\uffff\1\u008f\2\uffff\1\u009c\1\u0090"+
            "\1\u0091\1\u0092\1\u0093\1\u0094\1\u0095\1\u0096\1\u0097\1\u0098"+
            "\1\u0099\1\u009a\1\u009b\2\uffff\1\110\3\uffff\1\137\1\133\1"+
            "\123\1\120\1\125\11\uffff\11\110\22\uffff\1\117\1\126\1\132"+
            "\1\127\1\136\1\135\1\121\1\124\1\130\14\uffff\1\122\1\140\1"+
            "\134\1\131",
            "\1\114",
            "",
            "\1\114",
            "",
            "",
            "\1\114",
            "",
            "\1\114",
            "\1\114",
            "\1\114",
            "",
            "\1\114",
            "",
            "",
            "\1\114",
            "\1\114",
            "",
            "",
            "\1\144\50\uffff\1\143",
            "\1\110\1\uffff\1\110\2\uffff\1\u008f\2\uffff\1\u009c\1\u0090"+
            "\1\u0091\1\u0092\1\u0093\1\u0094\1\u0095\1\u0096\1\u0097\1\u0098"+
            "\1\u0099\1\u009a\1\u009b\2\uffff\1\110\3\uffff\1\144\15\uffff"+
            "\11\110\22\uffff\1\143",
            "\1\114",
            "",
            "\1\u009c\1\u009d\1\u009e\1\u009f\1\u00a0\1\u00a1\1\u00a2\1"+
            "\u00a3\1\u00a4\1\u00a5\1\u00a6\1\u00a7\1\u00a8\26\uffff\7\110",
            "\1\110\30\uffff\1\u00a9\1\u00c3\1\u00c4\1\u00c5\1\u00c6\1\u00c7"+
            "\32\uffff\4\110\1\u00aa\1\u00ab\1\u00ac\1\u00ad\2\uffff\1\u00ae"+
            "\1\u00af\1\u00b0\1\u00b1\1\u00b2\1\u00b3\1\u00b4\1\u00b5\1\u00b6"+
            "\1\u00b7\1\u00b8\1\u00b9\1\u00ba\1\u00bb\1\u00bc\1\u00bd\1\u00be"+
            "\1\u00bf\1\u00c0\1\u00c1\1\u00c2\1\u00c8\1\u00c9\1\u00ca\1\u00cb"+
            "\1\u00cc\1\u00cd\1\u00ce\1\u00cf\1\u00d0\1\u00d1\1\u00d2\1\u00d3"+
            "\1\u00d4\1\u00d5\1\u00d6\1\u00d7\1\u00d8\1\u00d9\1\u00da\1\u00db"+
            "\1\u00dc\1\u00dd\1\u00de\1\u00df\1\u00e0\1\u00e1",
            "\1\110\4\uffff\2\150\22\uffff\1\110\37\uffff\7\110",
            "",
            "\1\145",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00e2\1\uffff\1\110",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\110\4\uffff\2\150\22\uffff\1\110\13\uffff\1\110\1\uffff"+
            "\1\110\21\uffff\7\110"
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
            return "65:1: date : ( ( relaxed_date )=> relaxed_date | formal_date | relative_date | global_date_prefix date -> ^( RELATIVE_DATE ^( SEEK global_date_prefix date ) ) );";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_150 = input.LA(1);

                         
                        int index12_150 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_Date()) ) {s = 225;}

                        else if ( (true) ) {s = 72;}

                         
                        input.seek(index12_150);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_0 = input.LA(1);

                         
                        int index12_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA12_0==THE) ) {s = 1;}

                        else if ( (LA12_0==INT_1_TO_5) ) {s = 2;}

                        else if ( (LA12_0==INT_6_TO_9) ) {s = 3;}

                        else if ( (LA12_0==INT_01_TO_12) ) {s = 4;}

                        else if ( (LA12_0==INT_13_TO_23) ) {s = 5;}

                        else if ( (LA12_0==INT_24_TO_31) ) {s = 6;}

                        else if ( (LA12_0==ONE) ) {s = 7;}

                        else if ( (LA12_0==TWO) ) {s = 8;}

                        else if ( (LA12_0==THREE) ) {s = 9;}

                        else if ( (LA12_0==FOUR) ) {s = 10;}

                        else if ( (LA12_0==FIVE) ) {s = 11;}

                        else if ( (LA12_0==SIX) ) {s = 12;}

                        else if ( (LA12_0==SEVEN) ) {s = 13;}

                        else if ( (LA12_0==EIGHT) ) {s = 14;}

                        else if ( (LA12_0==NINE) ) {s = 15;}

                        else if ( (LA12_0==TEN) ) {s = 16;}

                        else if ( (LA12_0==ELEVEN) ) {s = 17;}

                        else if ( (LA12_0==TWELVE) ) {s = 18;}

                        else if ( (LA12_0==THIRTEEN) ) {s = 19;}

                        else if ( (LA12_0==FOURTEEN) ) {s = 20;}

                        else if ( (LA12_0==FIFTEEN) ) {s = 21;}

                        else if ( (LA12_0==SIXTEEN) ) {s = 22;}

                        else if ( (LA12_0==SEVENTEEN) ) {s = 23;}

                        else if ( (LA12_0==EIGHTEEN) ) {s = 24;}

                        else if ( (LA12_0==NINETEEN) ) {s = 25;}

                        else if ( (LA12_0==TWENTY) ) {s = 26;}

                        else if ( (LA12_0==THIRTY) ) {s = 27;}

                        else if ( (LA12_0==FIRST) ) {s = 28;}

                        else if ( (LA12_0==SECOND) ) {s = 29;}

                        else if ( (LA12_0==THIRD) ) {s = 30;}

                        else if ( (LA12_0==FOURTH) ) {s = 31;}

                        else if ( (LA12_0==FIFTH) ) {s = 32;}

                        else if ( (LA12_0==SIXTH) && (synpred2_Date())) {s = 33;}

                        else if ( (LA12_0==SEVENTH) && (synpred2_Date())) {s = 34;}

                        else if ( (LA12_0==EIGHTH) && (synpred2_Date())) {s = 35;}

                        else if ( (LA12_0==NINTH) && (synpred2_Date())) {s = 36;}

                        else if ( (LA12_0==TENTH) && (synpred2_Date())) {s = 37;}

                        else if ( (LA12_0==ELEVENTH) && (synpred2_Date())) {s = 38;}

                        else if ( (LA12_0==TWELFTH) && (synpred2_Date())) {s = 39;}

                        else if ( (LA12_0==THIRTEENTH) && (synpred2_Date())) {s = 40;}

                        else if ( (LA12_0==FOURTEENTH) && (synpred2_Date())) {s = 41;}

                        else if ( (LA12_0==FIFTEENTH) && (synpred2_Date())) {s = 42;}

                        else if ( (LA12_0==SIXTEENTH) && (synpred2_Date())) {s = 43;}

                        else if ( (LA12_0==SEVENTEENTH) && (synpred2_Date())) {s = 44;}

                        else if ( (LA12_0==EIGHTEENTH) && (synpred2_Date())) {s = 45;}

                        else if ( (LA12_0==NINETEENTH) && (synpred2_Date())) {s = 46;}

                        else if ( (LA12_0==TWENTIETH) && (synpred2_Date())) {s = 47;}

                        else if ( (LA12_0==TWENTY_FIRST) && (synpred2_Date())) {s = 48;}

                        else if ( (LA12_0==TWENTY_SECOND) && (synpred2_Date())) {s = 49;}

                        else if ( (LA12_0==TWENTY_THIRD) && (synpred2_Date())) {s = 50;}

                        else if ( (LA12_0==TWENTY_FOURTH) && (synpred2_Date())) {s = 51;}

                        else if ( (LA12_0==TWENTY_FIFTH) && (synpred2_Date())) {s = 52;}

                        else if ( (LA12_0==TWENTY_SIXTH) && (synpred2_Date())) {s = 53;}

                        else if ( (LA12_0==TWENTY_SEVENTH) && (synpred2_Date())) {s = 54;}

                        else if ( (LA12_0==TWENTY_EIGHTH) && (synpred2_Date())) {s = 55;}

                        else if ( (LA12_0==TWENTY_NINTH) && (synpred2_Date())) {s = 56;}

                        else if ( (LA12_0==THIRTIETH) && (synpred2_Date())) {s = 57;}

                        else if ( (LA12_0==THIRTY_FIRST) && (synpred2_Date())) {s = 58;}

                        else if ( (LA12_0==JANUARY) ) {s = 59;}

                        else if ( (LA12_0==FEBRUARY) ) {s = 60;}

                        else if ( (LA12_0==MARCH) ) {s = 61;}

                        else if ( (LA12_0==APRIL) ) {s = 62;}

                        else if ( (LA12_0==MAY) ) {s = 63;}

                        else if ( (LA12_0==JUNE) ) {s = 64;}

                        else if ( (LA12_0==JULY) ) {s = 65;}

                        else if ( (LA12_0==AUGUST) ) {s = 66;}

                        else if ( (LA12_0==SEPTEMBER) ) {s = 67;}

                        else if ( (LA12_0==OCTOBER) ) {s = 68;}

                        else if ( (LA12_0==NOVEMBER) ) {s = 69;}

                        else if ( (LA12_0==DECEMBER) ) {s = 70;}

                        else if ( (LA12_0==INT_00||(LA12_0>=INT_32_TO_59 && LA12_0<=INT_60_TO_99)) ) {s = 71;}

                        else if ( ((LA12_0>=IN && LA12_0<=YEAR)||(LA12_0>=LAST && LA12_0<=UPCOMING)||(LA12_0>=WEEK && LA12_0<=YESTERDAY)) ) {s = 72;}

                        else if ( (LA12_0==DAY) ) {s = 73;}

                         
                        input.seek(index12_0);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA12_151 = input.LA(1);

                         
                        int index12_151 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_Date()) ) {s = 225;}

                        else if ( (true) ) {s = 72;}

                         
                        input.seek(index12_151);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA12_152 = input.LA(1);

                         
                        int index12_152 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_Date()) ) {s = 225;}

                        else if ( (true) ) {s = 72;}

                         
                        input.seek(index12_152);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA12_153 = input.LA(1);

                         
                        int index12_153 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_Date()) ) {s = 225;}

                        else if ( (true) ) {s = 72;}

                         
                        input.seek(index12_153);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA12_146 = input.LA(1);

                         
                        int index12_146 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_Date()) ) {s = 225;}

                        else if ( (true) ) {s = 72;}

                         
                        input.seek(index12_146);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA12_147 = input.LA(1);

                         
                        int index12_147 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_Date()) ) {s = 225;}

                        else if ( (true) ) {s = 72;}

                         
                        input.seek(index12_147);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA12_148 = input.LA(1);

                         
                        int index12_148 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_Date()) ) {s = 225;}

                        else if ( (true) ) {s = 72;}

                         
                        input.seek(index12_148);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA12_27 = input.LA(1);

                         
                        int index12_27 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA12_27==DASH) ) {s = 97;}

                        else if ( (LA12_27==WHITE_SPACE) ) {s = 98;}

                        else if ( (LA12_27==ONE) ) {s = 99;}

                        else if ( (LA12_27==FIRST) && (synpred2_Date())) {s = 100;}

                         
                        input.seek(index12_27);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA12_149 = input.LA(1);

                         
                        int index12_149 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_Date()) ) {s = 225;}

                        else if ( (true) ) {s = 72;}

                         
                        input.seek(index12_149);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA12_74 = input.LA(1);

                         
                        int index12_74 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA12_74==DAY) ) {s = 104;}

                        else if ( (LA12_74==INT_1_TO_5) ) {s = 105;}

                        else if ( (LA12_74==FIRST) ) {s = 28;}

                        else if ( (LA12_74==SECOND) ) {s = 29;}

                        else if ( (LA12_74==THIRD) ) {s = 30;}

                        else if ( (LA12_74==FOURTH) ) {s = 31;}

                        else if ( (LA12_74==FIFTH) ) {s = 32;}

                        else if ( (LA12_74==LAST) ) {s = 72;}

                        else if ( (LA12_74==INT_6_TO_9) && (synpred2_Date())) {s = 106;}

                        else if ( (LA12_74==INT_01_TO_12) && (synpred2_Date())) {s = 107;}

                        else if ( (LA12_74==INT_13_TO_23) && (synpred2_Date())) {s = 108;}

                        else if ( (LA12_74==INT_24_TO_31) && (synpred2_Date())) {s = 109;}

                        else if ( (LA12_74==ONE) && (synpred2_Date())) {s = 110;}

                        else if ( (LA12_74==TWO) && (synpred2_Date())) {s = 111;}

                        else if ( (LA12_74==THREE) && (synpred2_Date())) {s = 112;}

                        else if ( (LA12_74==FOUR) && (synpred2_Date())) {s = 113;}

                        else if ( (LA12_74==FIVE) && (synpred2_Date())) {s = 114;}

                        else if ( (LA12_74==SIX) && (synpred2_Date())) {s = 115;}

                        else if ( (LA12_74==SEVEN) && (synpred2_Date())) {s = 116;}

                        else if ( (LA12_74==EIGHT) && (synpred2_Date())) {s = 117;}

                        else if ( (LA12_74==NINE) && (synpred2_Date())) {s = 118;}

                        else if ( (LA12_74==TEN) && (synpred2_Date())) {s = 119;}

                        else if ( (LA12_74==ELEVEN) && (synpred2_Date())) {s = 120;}

                        else if ( (LA12_74==TWELVE) && (synpred2_Date())) {s = 121;}

                        else if ( (LA12_74==THIRTEEN) && (synpred2_Date())) {s = 122;}

                        else if ( (LA12_74==FOURTEEN) && (synpred2_Date())) {s = 123;}

                        else if ( (LA12_74==FIFTEEN) && (synpred2_Date())) {s = 124;}

                        else if ( (LA12_74==SIXTEEN) && (synpred2_Date())) {s = 125;}

                        else if ( (LA12_74==SEVENTEEN) && (synpred2_Date())) {s = 126;}

                        else if ( (LA12_74==EIGHTEEN) && (synpred2_Date())) {s = 127;}

                        else if ( (LA12_74==NINETEEN) && (synpred2_Date())) {s = 128;}

                        else if ( (LA12_74==TWENTY) && (synpred2_Date())) {s = 129;}

                        else if ( (LA12_74==THIRTY) && (synpred2_Date())) {s = 130;}

                        else if ( (LA12_74==SIXTH) && (synpred2_Date())) {s = 33;}

                        else if ( (LA12_74==SEVENTH) && (synpred2_Date())) {s = 34;}

                        else if ( (LA12_74==EIGHTH) && (synpred2_Date())) {s = 35;}

                        else if ( (LA12_74==NINTH) && (synpred2_Date())) {s = 36;}

                        else if ( (LA12_74==TENTH) && (synpred2_Date())) {s = 37;}

                        else if ( (LA12_74==ELEVENTH) && (synpred2_Date())) {s = 38;}

                        else if ( (LA12_74==TWELFTH) && (synpred2_Date())) {s = 39;}

                        else if ( (LA12_74==THIRTEENTH) && (synpred2_Date())) {s = 40;}

                        else if ( (LA12_74==FOURTEENTH) && (synpred2_Date())) {s = 41;}

                        else if ( (LA12_74==FIFTEENTH) && (synpred2_Date())) {s = 42;}

                        else if ( (LA12_74==SIXTEENTH) && (synpred2_Date())) {s = 43;}

                        else if ( (LA12_74==SEVENTEENTH) && (synpred2_Date())) {s = 44;}

                        else if ( (LA12_74==EIGHTEENTH) && (synpred2_Date())) {s = 45;}

                        else if ( (LA12_74==NINETEENTH) && (synpred2_Date())) {s = 46;}

                        else if ( (LA12_74==TWENTIETH) && (synpred2_Date())) {s = 47;}

                        else if ( (LA12_74==TWENTY_FIRST) && (synpred2_Date())) {s = 48;}

                        else if ( (LA12_74==TWENTY_SECOND) && (synpred2_Date())) {s = 49;}

                        else if ( (LA12_74==TWENTY_THIRD) && (synpred2_Date())) {s = 50;}

                        else if ( (LA12_74==TWENTY_FOURTH) && (synpred2_Date())) {s = 51;}

                        else if ( (LA12_74==TWENTY_FIFTH) && (synpred2_Date())) {s = 52;}

                        else if ( (LA12_74==TWENTY_SIXTH) && (synpred2_Date())) {s = 53;}

                        else if ( (LA12_74==TWENTY_SEVENTH) && (synpred2_Date())) {s = 54;}

                        else if ( (LA12_74==TWENTY_EIGHTH) && (synpred2_Date())) {s = 55;}

                        else if ( (LA12_74==TWENTY_NINTH) && (synpred2_Date())) {s = 56;}

                        else if ( (LA12_74==THIRTIETH) && (synpred2_Date())) {s = 57;}

                        else if ( (LA12_74==THIRTY_FIRST) && (synpred2_Date())) {s = 58;}

                        else if ( (LA12_74==JANUARY) && (synpred2_Date())) {s = 131;}

                        else if ( (LA12_74==FEBRUARY) && (synpred2_Date())) {s = 132;}

                        else if ( (LA12_74==MARCH) && (synpred2_Date())) {s = 133;}

                        else if ( (LA12_74==APRIL) && (synpred2_Date())) {s = 134;}

                        else if ( (LA12_74==MAY) && (synpred2_Date())) {s = 135;}

                        else if ( (LA12_74==JUNE) && (synpred2_Date())) {s = 136;}

                        else if ( (LA12_74==JULY) && (synpred2_Date())) {s = 137;}

                        else if ( (LA12_74==AUGUST) && (synpred2_Date())) {s = 138;}

                        else if ( (LA12_74==SEPTEMBER) && (synpred2_Date())) {s = 139;}

                        else if ( (LA12_74==OCTOBER) && (synpred2_Date())) {s = 140;}

                        else if ( (LA12_74==NOVEMBER) && (synpred2_Date())) {s = 141;}

                        else if ( (LA12_74==DECEMBER) && (synpred2_Date())) {s = 142;}

                         
                        input.seek(index12_74);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA12_102 = input.LA(1);

                         
                        int index12_102 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA12_102==AT||(LA12_102>=NOON && LA12_102<=INT_00)) ) {s = 72;}

                        else if ( (LA12_102==INT_1_TO_5) ) {s = 169;}

                        else if ( (LA12_102==INT_6_TO_9) ) {s = 170;}

                        else if ( (LA12_102==INT_01_TO_12) ) {s = 171;}

                        else if ( (LA12_102==INT_13_TO_23) ) {s = 172;}

                        else if ( (LA12_102==INT_24_TO_31) && (synpred2_Date())) {s = 173;}

                        else if ( (LA12_102==ONE) && (synpred2_Date())) {s = 174;}

                        else if ( (LA12_102==TWO) && (synpred2_Date())) {s = 175;}

                        else if ( (LA12_102==THREE) && (synpred2_Date())) {s = 176;}

                        else if ( (LA12_102==FOUR) && (synpred2_Date())) {s = 177;}

                        else if ( (LA12_102==FIVE) && (synpred2_Date())) {s = 178;}

                        else if ( (LA12_102==SIX) && (synpred2_Date())) {s = 179;}

                        else if ( (LA12_102==SEVEN) && (synpred2_Date())) {s = 180;}

                        else if ( (LA12_102==EIGHT) && (synpred2_Date())) {s = 181;}

                        else if ( (LA12_102==NINE) && (synpred2_Date())) {s = 182;}

                        else if ( (LA12_102==TEN) && (synpred2_Date())) {s = 183;}

                        else if ( (LA12_102==ELEVEN) && (synpred2_Date())) {s = 184;}

                        else if ( (LA12_102==TWELVE) && (synpred2_Date())) {s = 185;}

                        else if ( (LA12_102==THIRTEEN) && (synpred2_Date())) {s = 186;}

                        else if ( (LA12_102==FOURTEEN) && (synpred2_Date())) {s = 187;}

                        else if ( (LA12_102==FIFTEEN) && (synpred2_Date())) {s = 188;}

                        else if ( (LA12_102==SIXTEEN) && (synpred2_Date())) {s = 189;}

                        else if ( (LA12_102==SEVENTEEN) && (synpred2_Date())) {s = 190;}

                        else if ( (LA12_102==EIGHTEEN) && (synpred2_Date())) {s = 191;}

                        else if ( (LA12_102==NINETEEN) && (synpred2_Date())) {s = 192;}

                        else if ( (LA12_102==TWENTY) && (synpred2_Date())) {s = 193;}

                        else if ( (LA12_102==THIRTY) && (synpred2_Date())) {s = 194;}

                        else if ( (LA12_102==FIRST) && (synpred2_Date())) {s = 195;}

                        else if ( (LA12_102==SECOND) && (synpred2_Date())) {s = 196;}

                        else if ( (LA12_102==THIRD) && (synpred2_Date())) {s = 197;}

                        else if ( (LA12_102==FOURTH) && (synpred2_Date())) {s = 198;}

                        else if ( (LA12_102==FIFTH) && (synpred2_Date())) {s = 199;}

                        else if ( (LA12_102==SIXTH) && (synpred2_Date())) {s = 200;}

                        else if ( (LA12_102==SEVENTH) && (synpred2_Date())) {s = 201;}

                        else if ( (LA12_102==EIGHTH) && (synpred2_Date())) {s = 202;}

                        else if ( (LA12_102==NINTH) && (synpred2_Date())) {s = 203;}

                        else if ( (LA12_102==TENTH) && (synpred2_Date())) {s = 204;}

                        else if ( (LA12_102==ELEVENTH) && (synpred2_Date())) {s = 205;}

                        else if ( (LA12_102==TWELFTH) && (synpred2_Date())) {s = 206;}

                        else if ( (LA12_102==THIRTEENTH) && (synpred2_Date())) {s = 207;}

                        else if ( (LA12_102==FOURTEENTH) && (synpred2_Date())) {s = 208;}

                        else if ( (LA12_102==FIFTEENTH) && (synpred2_Date())) {s = 209;}

                        else if ( (LA12_102==SIXTEENTH) && (synpred2_Date())) {s = 210;}

                        else if ( (LA12_102==SEVENTEENTH) && (synpred2_Date())) {s = 211;}

                        else if ( (LA12_102==EIGHTEENTH) && (synpred2_Date())) {s = 212;}

                        else if ( (LA12_102==NINETEENTH) && (synpred2_Date())) {s = 213;}

                        else if ( (LA12_102==TWENTIETH) && (synpred2_Date())) {s = 214;}

                        else if ( (LA12_102==TWENTY_FIRST) && (synpred2_Date())) {s = 215;}

                        else if ( (LA12_102==TWENTY_SECOND) && (synpred2_Date())) {s = 216;}

                        else if ( (LA12_102==TWENTY_THIRD) && (synpred2_Date())) {s = 217;}

                        else if ( (LA12_102==TWENTY_FOURTH) && (synpred2_Date())) {s = 218;}

                        else if ( (LA12_102==TWENTY_FIFTH) && (synpred2_Date())) {s = 219;}

                        else if ( (LA12_102==TWENTY_SIXTH) && (synpred2_Date())) {s = 220;}

                        else if ( (LA12_102==TWENTY_SEVENTH) && (synpred2_Date())) {s = 221;}

                        else if ( (LA12_102==TWENTY_EIGHTH) && (synpred2_Date())) {s = 222;}

                        else if ( (LA12_102==TWENTY_NINTH) && (synpred2_Date())) {s = 223;}

                        else if ( (LA12_102==THIRTIETH) && (synpred2_Date())) {s = 224;}

                        else if ( (LA12_102==THIRTY_FIRST) && (synpred2_Date())) {s = 225;}

                         
                        input.seek(index12_102);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA12_144 = input.LA(1);

                         
                        int index12_144 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_Date()) ) {s = 225;}

                        else if ( (true) ) {s = 72;}

                         
                        input.seek(index12_144);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA12_145 = input.LA(1);

                         
                        int index12_145 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_Date()) ) {s = 225;}

                        else if ( (true) ) {s = 72;}

                         
                        input.seek(index12_145);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA12_97 = input.LA(1);

                         
                        int index12_97 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA12_97==FIRST) && (synpred2_Date())) {s = 100;}

                        else if ( (LA12_97==ONE) ) {s = 99;}

                         
                        input.seek(index12_97);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA12_170 = input.LA(1);

                         
                        int index12_170 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_Date()) ) {s = 225;}

                        else if ( (true) ) {s = 72;}

                         
                        input.seek(index12_170);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA12_169 = input.LA(1);

                         
                        int index12_169 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_Date()) ) {s = 225;}

                        else if ( (true) ) {s = 72;}

                         
                        input.seek(index12_169);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA12_75 = input.LA(1);

                         
                        int index12_75 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA12_75==DAY) ) {s = 143;}

                        else if ( (LA12_75==EOF||LA12_75==WHITE_SPACE||LA12_75==COMMA||LA12_75==YEAR||(LA12_75>=WEEK && LA12_75<=SATURDAY)) ) {s = 72;}

                        else if ( (LA12_75==JANUARY) ) {s = 144;}

                        else if ( (LA12_75==FEBRUARY) ) {s = 145;}

                        else if ( (LA12_75==MARCH) ) {s = 146;}

                        else if ( (LA12_75==APRIL) ) {s = 147;}

                        else if ( (LA12_75==MAY) ) {s = 148;}

                        else if ( (LA12_75==JUNE) ) {s = 149;}

                        else if ( (LA12_75==JULY) ) {s = 150;}

                        else if ( (LA12_75==AUGUST) ) {s = 151;}

                        else if ( (LA12_75==SEPTEMBER) ) {s = 152;}

                        else if ( (LA12_75==OCTOBER) ) {s = 153;}

                        else if ( (LA12_75==NOVEMBER) ) {s = 154;}

                        else if ( (LA12_75==DECEMBER) ) {s = 155;}

                        else if ( (LA12_75==OF) && (synpred2_Date())) {s = 156;}

                         
                        input.seek(index12_75);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA12_101 = input.LA(1);

                         
                        int index12_101 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA12_101>=SUNDAY && LA12_101<=SATURDAY)) ) {s = 72;}

                        else if ( (LA12_101==OF) && (synpred2_Date())) {s = 156;}

                        else if ( (LA12_101==JANUARY) && (synpred2_Date())) {s = 157;}

                        else if ( (LA12_101==FEBRUARY) && (synpred2_Date())) {s = 158;}

                        else if ( (LA12_101==MARCH) && (synpred2_Date())) {s = 159;}

                        else if ( (LA12_101==APRIL) && (synpred2_Date())) {s = 160;}

                        else if ( (LA12_101==MAY) && (synpred2_Date())) {s = 161;}

                        else if ( (LA12_101==JUNE) && (synpred2_Date())) {s = 162;}

                        else if ( (LA12_101==JULY) && (synpred2_Date())) {s = 163;}

                        else if ( (LA12_101==AUGUST) && (synpred2_Date())) {s = 164;}

                        else if ( (LA12_101==SEPTEMBER) && (synpred2_Date())) {s = 165;}

                        else if ( (LA12_101==OCTOBER) && (synpred2_Date())) {s = 166;}

                        else if ( (LA12_101==NOVEMBER) && (synpred2_Date())) {s = 167;}

                        else if ( (LA12_101==DECEMBER) && (synpred2_Date())) {s = 168;}

                         
                        input.seek(index12_101);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA12_171 = input.LA(1);

                         
                        int index12_171 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_Date()) ) {s = 225;}

                        else if ( (true) ) {s = 72;}

                         
                        input.seek(index12_171);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA12_172 = input.LA(1);

                         
                        int index12_172 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_Date()) ) {s = 225;}

                        else if ( (true) ) {s = 72;}

                         
                        input.seek(index12_172);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA12_26 = input.LA(1);

                         
                        int index12_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA12_26==DASH) ) {s = 77;}

                        else if ( (LA12_26==WHITE_SPACE) ) {s = 78;}

                        else if ( (LA12_26==ONE) ) {s = 79;}

                        else if ( (LA12_26==FOURTH) && (synpred2_Date())) {s = 80;}

                        else if ( (LA12_26==SEVEN) ) {s = 81;}

                        else if ( (LA12_26==SIXTH) && (synpred2_Date())) {s = 82;}

                        else if ( (LA12_26==THIRD) && (synpred2_Date())) {s = 83;}

                        else if ( (LA12_26==EIGHT) ) {s = 84;}

                        else if ( (LA12_26==FIFTH) && (synpred2_Date())) {s = 85;}

                        else if ( (LA12_26==TWO) ) {s = 86;}

                        else if ( (LA12_26==FOUR) ) {s = 87;}

                        else if ( (LA12_26==NINE) ) {s = 88;}

                        else if ( (LA12_26==NINTH) && (synpred2_Date())) {s = 89;}

                        else if ( (LA12_26==THREE) ) {s = 90;}

                        else if ( (LA12_26==SECOND) && (synpred2_Date())) {s = 91;}

                        else if ( (LA12_26==EIGHTH) && (synpred2_Date())) {s = 92;}

                        else if ( (LA12_26==SIX) ) {s = 93;}

                        else if ( (LA12_26==FIVE) ) {s = 94;}

                        else if ( (LA12_26==FIRST) && (synpred2_Date())) {s = 95;}

                        else if ( (LA12_26==SEVENTH) && (synpred2_Date())) {s = 96;}

                         
                        input.seek(index12_26);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA12_78 = input.LA(1);

                         
                        int index12_78 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA12_78==DAY) ) {s = 143;}

                        else if ( (LA12_78==SIXTH) && (synpred2_Date())) {s = 82;}

                        else if ( (LA12_78==SEVEN) ) {s = 81;}

                        else if ( (LA12_78==ONE) ) {s = 79;}

                        else if ( (LA12_78==FOURTH) && (synpred2_Date())) {s = 80;}

                        else if ( (LA12_78==OF) && (synpred2_Date())) {s = 156;}

                        else if ( (LA12_78==JANUARY) ) {s = 144;}

                        else if ( (LA12_78==FEBRUARY) ) {s = 145;}

                        else if ( (LA12_78==MARCH) ) {s = 146;}

                        else if ( (LA12_78==APRIL) ) {s = 147;}

                        else if ( (LA12_78==MAY) ) {s = 148;}

                        else if ( (LA12_78==JUNE) ) {s = 149;}

                        else if ( (LA12_78==JULY) ) {s = 150;}

                        else if ( (LA12_78==AUGUST) ) {s = 151;}

                        else if ( (LA12_78==SEPTEMBER) ) {s = 152;}

                        else if ( (LA12_78==OCTOBER) ) {s = 153;}

                        else if ( (LA12_78==NOVEMBER) ) {s = 154;}

                        else if ( (LA12_78==DECEMBER) ) {s = 155;}

                        else if ( (LA12_78==NINE) ) {s = 88;}

                        else if ( (LA12_78==SIX) ) {s = 93;}

                        else if ( (LA12_78==FIFTH) && (synpred2_Date())) {s = 85;}

                        else if ( (LA12_78==TWO) ) {s = 86;}

                        else if ( (LA12_78==THIRD) && (synpred2_Date())) {s = 83;}

                        else if ( (LA12_78==EIGHT) ) {s = 84;}

                        else if ( (LA12_78==SECOND) && (synpred2_Date())) {s = 91;}

                        else if ( (LA12_78==EOF||LA12_78==WHITE_SPACE||LA12_78==COMMA||LA12_78==YEAR||(LA12_78>=WEEK && LA12_78<=SATURDAY)) ) {s = 72;}

                        else if ( (LA12_78==THREE) ) {s = 90;}

                        else if ( (LA12_78==FOUR) ) {s = 87;}

                        else if ( (LA12_78==NINTH) && (synpred2_Date())) {s = 89;}

                        else if ( (LA12_78==FIRST) && (synpred2_Date())) {s = 95;}

                        else if ( (LA12_78==EIGHTH) && (synpred2_Date())) {s = 92;}

                        else if ( (LA12_78==FIVE) ) {s = 94;}

                        else if ( (LA12_78==SEVENTH) && (synpred2_Date())) {s = 96;}

                         
                        input.seek(index12_78);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA12_155 = input.LA(1);

                         
                        int index12_155 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_Date()) ) {s = 225;}

                        else if ( (true) ) {s = 72;}

                         
                        input.seek(index12_155);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA12_154 = input.LA(1);

                         
                        int index12_154 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_Date()) ) {s = 225;}

                        else if ( (true) ) {s = 72;}

                         
                        input.seek(index12_154);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA12_77 = input.LA(1);

                         
                        int index12_77 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA12_77==ONE) ) {s = 79;}

                        else if ( (LA12_77==SIXTH) && (synpred2_Date())) {s = 82;}

                        else if ( (LA12_77==SEVEN) ) {s = 81;}

                        else if ( (LA12_77==FOURTH) && (synpred2_Date())) {s = 80;}

                        else if ( (LA12_77==SIX) ) {s = 93;}

                        else if ( (LA12_77==THIRD) && (synpred2_Date())) {s = 83;}

                        else if ( (LA12_77==EIGHT) ) {s = 84;}

                        else if ( (LA12_77==TWO) ) {s = 86;}

                        else if ( (LA12_77==FIFTH) && (synpred2_Date())) {s = 85;}

                        else if ( (LA12_77==SECOND) && (synpred2_Date())) {s = 91;}

                        else if ( (LA12_77==THREE) ) {s = 90;}

                        else if ( (LA12_77==NINTH) && (synpred2_Date())) {s = 89;}

                        else if ( (LA12_77==FOUR) ) {s = 87;}

                        else if ( (LA12_77==NINE) ) {s = 88;}

                        else if ( (LA12_77==FIVE) ) {s = 94;}

                        else if ( (LA12_77==EIGHTH) && (synpred2_Date())) {s = 92;}

                        else if ( (LA12_77==FIRST) && (synpred2_Date())) {s = 95;}

                        else if ( (LA12_77==SEVENTH) && (synpred2_Date())) {s = 96;}

                         
                        input.seek(index12_77);
                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA12_76 = input.LA(1);

                         
                        int index12_76 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA12_76==DAY) ) {s = 143;}

                        else if ( (LA12_76==EOF||LA12_76==WHITE_SPACE||LA12_76==COMMA||LA12_76==YEAR||(LA12_76>=WEEK && LA12_76<=SATURDAY)) ) {s = 72;}

                        else if ( (LA12_76==JANUARY) ) {s = 144;}

                        else if ( (LA12_76==FEBRUARY) ) {s = 145;}

                        else if ( (LA12_76==MARCH) ) {s = 146;}

                        else if ( (LA12_76==APRIL) ) {s = 147;}

                        else if ( (LA12_76==MAY) ) {s = 148;}

                        else if ( (LA12_76==JUNE) ) {s = 149;}

                        else if ( (LA12_76==JULY) ) {s = 150;}

                        else if ( (LA12_76==AUGUST) ) {s = 151;}

                        else if ( (LA12_76==SEPTEMBER) ) {s = 152;}

                        else if ( (LA12_76==OCTOBER) ) {s = 153;}

                        else if ( (LA12_76==NOVEMBER) ) {s = 154;}

                        else if ( (LA12_76==DECEMBER) ) {s = 155;}

                        else if ( (LA12_76==OF) && (synpred2_Date())) {s = 156;}

                         
                        input.seek(index12_76);
                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA12_98 = input.LA(1);

                         
                        int index12_98 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA12_98==DAY) ) {s = 143;}

                        else if ( (LA12_98==ONE) ) {s = 99;}

                        else if ( (LA12_98==EOF||LA12_98==WHITE_SPACE||LA12_98==COMMA||LA12_98==YEAR||(LA12_98>=WEEK && LA12_98<=SATURDAY)) ) {s = 72;}

                        else if ( (LA12_98==JANUARY) ) {s = 144;}

                        else if ( (LA12_98==FEBRUARY) ) {s = 145;}

                        else if ( (LA12_98==MARCH) ) {s = 146;}

                        else if ( (LA12_98==APRIL) ) {s = 147;}

                        else if ( (LA12_98==MAY) ) {s = 148;}

                        else if ( (LA12_98==JUNE) ) {s = 149;}

                        else if ( (LA12_98==JULY) ) {s = 150;}

                        else if ( (LA12_98==AUGUST) ) {s = 151;}

                        else if ( (LA12_98==SEPTEMBER) ) {s = 152;}

                        else if ( (LA12_98==OCTOBER) ) {s = 153;}

                        else if ( (LA12_98==NOVEMBER) ) {s = 154;}

                        else if ( (LA12_98==DECEMBER) ) {s = 155;}

                        else if ( (LA12_98==OF) && (synpred2_Date())) {s = 156;}

                        else if ( (LA12_98==FIRST) && (synpred2_Date())) {s = 100;}

                         
                        input.seek(index12_98);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 12, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA21_eotS =
        "\u00d9\uffff";
    static final String DFA21_eofS =
        "\144\uffff\14\u00ac\71\142\10\uffff\22\142\2\uffff\2\142\22\uffff";
    static final String DFA21_minS =
        "\1\31\106\25\1\36\1\35\1\60\1\35\22\25\1\60\1\35\2\25\1\57\1\uffff"+
        "\106\25\1\36\1\25\1\26\1\uffff\1\25\1\26\1\60\1\26\22\25\1\60\1"+
        "\26\2\25\1\26\3\0\5\uffff\1\26\3\0\5\uffff";
    static final String DFA21_maxS =
        "\1\u0087\31\25\1\161\1\131\53\25\1\u0087\1\51\2\161\22\25\2\131"+
        "\2\25\1\u0087\1\uffff\1\25\44\27\1\161\1\131\37\27\1\51\2\130\1"+
        "\uffff\2\130\2\161\22\27\2\131\2\27\1\130\3\0\5\uffff\1\130\3\0"+
        "\5\uffff";
    static final String DFA21_acceptS =
        "\142\uffff\1\4\111\uffff\1\3\36\uffff\5\1\4\uffff\5\2";
    static final String DFA21_specialS =
        "\u00aa\uffff\1\5\1\10\1\uffff\1\11\1\0\1\uffff\1\1\23\uffff\1\13"+
        "\2\uffff\1\4\1\12\1\14\1\15\5\uffff\1\7\1\6\1\3\1\2\5\uffff}>";
    static final String[] DFA21_transitionS = {
            "\1\1\4\uffff\1\73\1\74\1\75\1\76\1\77\1\100\1\101\1\102\1\103"+
            "\1\104\1\105\1\106\5\uffff\1\2\1\34\1\35\1\36\1\37\1\40\36\uffff"+
            "\1\3\1\4\1\5\1\6\2\uffff\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1"+
            "\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1"+
            "\32\1\33\1\41\1\42\1\43\1\44\1\45\1\46\1\47\1\50\1\51\1\52\1"+
            "\53\1\54\1\55\1\56\1\57\1\60\1\61\1\62\1\63\1\64\1\65\1\66\1"+
            "\67\1\70\1\71\1\72",
            "\1\107",
            "\1\110",
            "\1\110",
            "\1\110",
            "\1\110",
            "\1\110",
            "\1\110",
            "\1\110",
            "\1\110",
            "\1\110",
            "\1\110",
            "\1\110",
            "\1\110",
            "\1\110",
            "\1\110",
            "\1\110",
            "\1\110",
            "\1\110",
            "\1\110",
            "\1\110",
            "\1\110",
            "\1\110",
            "\1\110",
            "\1\110",
            "\1\110",
            "\1\112\27\uffff\1\111\2\uffff\1\130\1\121\1\127\1\114\1\113"+
            "\44\uffff\1\115\1\124\1\132\1\116\1\123\1\117\1\120\1\131\1"+
            "\133\14\uffff\1\126\1\134\1\122\1\125",
            "\1\136\27\uffff\1\135\2\uffff\1\140\50\uffff\1\137",
            "\1\110",
            "\1\110",
            "\1\110",
            "\1\110",
            "\1\110",
            "\1\110",
            "\1\110",
            "\1\110",
            "\1\110",
            "\1\110",
            "\1\110",
            "\1\110",
            "\1\110",
            "\1\110",
            "\1\110",
            "\1\110",
            "\1\110",
            "\1\110",
            "\1\110",
            "\1\110",
            "\1\110",
            "\1\110",
            "\1\110",
            "\1\110",
            "\1\110",
            "\1\110",
            "\1\110",
            "\1\110",
            "\1\110",
            "\1\110",
            "\1\110",
            "\1\141",
            "\1\141",
            "\1\141",
            "\1\141",
            "\1\141",
            "\1\141",
            "\1\141",
            "\1\141",
            "\1\141",
            "\1\141",
            "\1\141",
            "\1\141",
            "\14\142\5\uffff\1\2\1\34\1\35\1\36\1\37\1\40\36\uffff\1\3\1"+
            "\4\1\5\1\6\2\uffff\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1"+
            "\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1"+
            "\33\1\41\1\42\1\43\1\44\1\45\1\46\1\47\1\50\1\51\1\52\1\53\1"+
            "\54\1\55\1\56\1\57\1\60\1\61\1\62\1\63\1\64\1\65\1\66\1\67\1"+
            "\70\1\71\1\72",
            "\1\143\1\144\1\145\1\146\1\147\1\150\1\151\1\152\1\153\1\154"+
            "\1\155\1\156\1\157",
            "\1\130\1\121\1\127\1\114\1\113\44\uffff\1\115\1\124\1\132\1"+
            "\116\1\123\1\117\1\120\1\131\1\133\14\uffff\1\126\1\134\1\122"+
            "\1\125",
            "\1\143\1\144\1\145\1\146\1\147\1\150\1\151\1\152\1\153\1\154"+
            "\1\155\1\156\1\157\6\uffff\1\130\1\121\1\127\1\114\1\113\44"+
            "\uffff\1\115\1\124\1\132\1\116\1\123\1\117\1\120\1\131\1\133"+
            "\14\uffff\1\126\1\134\1\122\1\125",
            "\1\110",
            "\1\110",
            "\1\110",
            "\1\110",
            "\1\110",
            "\1\110",
            "\1\110",
            "\1\110",
            "\1\110",
            "\1\110",
            "\1\110",
            "\1\110",
            "\1\110",
            "\1\110",
            "\1\110",
            "\1\110",
            "\1\110",
            "\1\110",
            "\1\140\50\uffff\1\137",
            "\1\143\1\144\1\145\1\146\1\147\1\150\1\151\1\152\1\153\1\154"+
            "\1\155\1\156\1\157\6\uffff\1\140\50\uffff\1\137",
            "\1\110",
            "\1\110",
            "\1\160\1\u008a\1\u008b\1\u008c\1\u008d\1\u008e\36\uffff\1\161"+
            "\1\162\1\163\1\164\2\uffff\1\165\1\166\1\167\1\170\1\171\1\172"+
            "\1\173\1\174\1\175\1\176\1\177\1\u0080\1\u0081\1\u0082\1\u0083"+
            "\1\u0084\1\u0085\1\u0086\1\u0087\1\u0088\1\u0089\1\u008f\1\u0090"+
            "\1\u0091\1\u0092\1\u0093\1\u0094\1\u0095\1\u0096\1\u0097\1\u0098"+
            "\1\u0099\1\u009a\1\u009b\1\u009c\1\u009d\1\u009e\1\u009f\1\u00a0"+
            "\1\u00a1\1\u00a2\1\u00a3\1\u00a4\1\u00a5\1\u00a6\1\u00a7\1\u00a8",
            "",
            "\1\u00a9",
            "\1\u00ab\1\uffff\1\u00aa",
            "\1\u00ab\1\uffff\1\u00aa",
            "\1\u00ab\1\uffff\1\u00aa",
            "\1\u00ab\1\uffff\1\u00aa",
            "\1\u00ab\1\uffff\1\u00aa",
            "\1\u00ab\1\uffff\1\u00aa",
            "\1\u00ab\1\uffff\1\u00aa",
            "\1\u00ab\1\uffff\1\u00aa",
            "\1\u00ab\1\uffff\1\u00aa",
            "\1\u00ab\1\uffff\1\u00aa",
            "\1\u00ab\1\uffff\1\u00aa",
            "\1\u00ab\1\uffff\1\u00aa",
            "\1\u00ae\1\uffff\1\u00ad",
            "\1\u00ae\1\uffff\1\u00ad",
            "\1\u00ae\1\uffff\1\u00ad",
            "\1\u00ae\1\uffff\1\u00ad",
            "\1\u00ae\1\uffff\1\u00ad",
            "\1\u00ae\1\uffff\1\u00ad",
            "\1\u00ae\1\uffff\1\u00ad",
            "\1\u00ae\1\uffff\1\u00ad",
            "\1\u00ae\1\uffff\1\u00ad",
            "\1\u00ae\1\uffff\1\u00ad",
            "\1\u00ae\1\uffff\1\u00ad",
            "\1\u00ae\1\uffff\1\u00ad",
            "\1\u00ae\1\uffff\1\u00ad",
            "\1\u00ae\1\uffff\1\u00ad",
            "\1\u00ae\1\uffff\1\u00ad",
            "\1\u00ae\1\uffff\1\u00ad",
            "\1\u00ae\1\uffff\1\u00ad",
            "\1\u00ae\1\uffff\1\u00ad",
            "\1\u00ae\1\uffff\1\u00ad",
            "\1\u00ae\1\uffff\1\u00ad",
            "\1\u00ae\1\uffff\1\u00ad",
            "\1\u00ae\1\uffff\1\u00ad",
            "\1\u00ae\1\uffff\1\u00ad",
            "\1\u00ae\1\uffff\1\u00ad",
            "\1\u00b0\1\uffff\1\u00ad\25\uffff\1\u00af\2\uffff\1\u00ba\1"+
            "\u00c1\1\u00b6\1\u00b9\1\u00be\44\uffff\1\u00bf\1\u00b1\1\u00b8"+
            "\1\u00b2\1\u00bc\1\u00bd\1\u00c2\1\u00b7\1\u00b4\14\uffff\1"+
            "\u00b3\1\u00bb\1\u00b5\1\u00c0",
            "\1\u00c4\1\uffff\1\u00ad\25\uffff\1\u00c3\2\uffff\1\u00c6\50"+
            "\uffff\1\u00c5",
            "\1\u00ae\1\uffff\1\u00ad",
            "\1\u00ae\1\uffff\1\u00ad",
            "\1\u00ae\1\uffff\1\u00ad",
            "\1\u00ae\1\uffff\1\u00ad",
            "\1\u00ae\1\uffff\1\u00ad",
            "\1\u00ae\1\uffff\1\u00ad",
            "\1\u00ae\1\uffff\1\u00ad",
            "\1\u00ae\1\uffff\1\u00ad",
            "\1\u00ae\1\uffff\1\u00ad",
            "\1\u00ae\1\uffff\1\u00ad",
            "\1\u00ae\1\uffff\1\u00ad",
            "\1\u00ae\1\uffff\1\u00ad",
            "\1\u00ae\1\uffff\1\u00ad",
            "\1\u00ae\1\uffff\1\u00ad",
            "\1\u00ae\1\uffff\1\u00ad",
            "\1\u00ae\1\uffff\1\u00ad",
            "\1\u00ae\1\uffff\1\u00ad",
            "\1\u00ae\1\uffff\1\u00ad",
            "\1\u00ae\1\uffff\1\u00ad",
            "\1\u00ae\1\uffff\1\u00ad",
            "\1\u00ae\1\uffff\1\u00ad",
            "\1\u00ae\1\uffff\1\u00ad",
            "\1\u00ae\1\uffff\1\u00ad",
            "\1\u00ae\1\uffff\1\u00ad",
            "\1\u00ae\1\uffff\1\u00ad",
            "\1\u00ae\1\uffff\1\u00ad",
            "\1\u00ae\1\uffff\1\u00ad",
            "\1\u00ae\1\uffff\1\u00ad",
            "\1\u00ae\1\uffff\1\u00ad",
            "\1\u00ae\1\uffff\1\u00ad",
            "\1\u00ae\1\uffff\1\u00ad",
            "\1\144\1\145\1\146\1\147\1\150\1\151\1\152\1\153\1\154\1\155"+
            "\1\156\1\157",
            "\1\u00c7\1\u00ac\23\uffff\1\u00cc\1\u00cb\3\uffff\1\u00ac\37"+
            "\uffff\3\u00ac\1\u00c8\1\u00ac\1\u00c9\1\u00ca\1\u00cd\1\u00ce"+
            "\1\u00cf",
            "\1\u00ac\23\uffff\1\u00cc\1\u00cb\3\uffff\1\u00ac\37\uffff"+
            "\3\u00ac\1\u00c8\1\u00ac\1\u00c9\1\u00ca\1\u00cd\1\u00ce\1\u00cf",
            "",
            "\1\u00d0\1\142\23\uffff\1\u00d5\1\u00d4\3\uffff\1\142\37\uffff"+
            "\3\142\1\u00d1\1\142\1\u00d2\1\u00d3\1\u00d6\1\u00d7\1\u00d8",
            "\1\142\23\uffff\1\u00d5\1\u00d4\3\uffff\1\142\37\uffff\3\142"+
            "\1\u00d1\1\142\1\u00d2\1\u00d3\1\u00d6\1\u00d7\1\u00d8",
            "\1\u00ba\1\u00c1\1\u00b6\1\u00b9\1\u00be\44\uffff\1\u00bf\1"+
            "\u00b1\1\u00b8\1\u00b2\1\u00bc\1\u00bd\1\u00c2\1\u00b7\1\u00b4"+
            "\14\uffff\1\u00b3\1\u00bb\1\u00b5\1\u00c0",
            "\1\142\23\uffff\1\u00d5\1\u00d4\3\uffff\1\142\1\u00ba\1\u00c1"+
            "\1\u00b6\1\u00b9\1\u00be\32\uffff\3\142\1\u00d1\1\142\1\u00d2"+
            "\1\u00d3\1\u00d6\1\u00d7\1\u00d8\1\u00bf\1\u00b1\1\u00b8\1\u00b2"+
            "\1\u00bc\1\u00bd\1\u00c2\1\u00b7\1\u00b4\14\uffff\1\u00b3\1"+
            "\u00bb\1\u00b5\1\u00c0",
            "\1\u00ae\1\uffff\1\u00ad",
            "\1\u00ae\1\uffff\1\u00ad",
            "\1\u00ae\1\uffff\1\u00ad",
            "\1\u00ae\1\uffff\1\u00ad",
            "\1\u00ae\1\uffff\1\u00ad",
            "\1\u00ae\1\uffff\1\u00ad",
            "\1\u00ae\1\uffff\1\u00ad",
            "\1\u00ae\1\uffff\1\u00ad",
            "\1\u00ae\1\uffff\1\u00ad",
            "\1\u00ae\1\uffff\1\u00ad",
            "\1\u00ae\1\uffff\1\u00ad",
            "\1\u00ae\1\uffff\1\u00ad",
            "\1\u00ae\1\uffff\1\u00ad",
            "\1\u00ae\1\uffff\1\u00ad",
            "\1\u00ae\1\uffff\1\u00ad",
            "\1\u00ae\1\uffff\1\u00ad",
            "\1\u00ae\1\uffff\1\u00ad",
            "\1\u00ae\1\uffff\1\u00ad",
            "\1\u00c6\50\uffff\1\u00c5",
            "\1\142\23\uffff\1\u00d5\1\u00d4\3\uffff\1\142\1\u00c6\36\uffff"+
            "\3\142\1\u00d1\1\142\1\u00d2\1\u00d3\1\u00d6\1\u00d7\1\u00d8"+
            "\1\u00c5",
            "\1\u00ae\1\uffff\1\u00ad",
            "\1\u00ae\1\uffff\1\u00ad",
            "\1\u00ac\23\uffff\1\u00cc\1\u00cb\3\uffff\1\u00ac\37\uffff"+
            "\3\u00ac\1\u00c8\1\u00ac\1\u00c9\1\u00ca\1\u00cd\1\u00ce\1\u00cf",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "\1\142\23\uffff\1\u00d5\1\u00d4\3\uffff\1\142\37\uffff\3\142"+
            "\1\u00d1\1\142\1\u00d2\1\u00d3\1\u00d6\1\u00d7\1\u00d8",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA21_eot = DFA.unpackEncodedString(DFA21_eotS);
    static final short[] DFA21_eof = DFA.unpackEncodedString(DFA21_eofS);
    static final char[] DFA21_min = DFA.unpackEncodedStringToUnsignedChars(DFA21_minS);
    static final char[] DFA21_max = DFA.unpackEncodedStringToUnsignedChars(DFA21_maxS);
    static final short[] DFA21_accept = DFA.unpackEncodedString(DFA21_acceptS);
    static final short[] DFA21_special = DFA.unpackEncodedString(DFA21_specialS);
    static final short[][] DFA21_transition;

    static {
        int numStates = DFA21_transitionS.length;
        DFA21_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA21_transition[i] = DFA.unpackEncodedString(DFA21_transitionS[i]);
        }
    }

    class DFA21 extends DFA {

        public DFA21(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 21;
            this.eot = DFA21_eot;
            this.eof = DFA21_eof;
            this.min = DFA21_min;
            this.max = DFA21_max;
            this.accept = DFA21_accept;
            this.special = DFA21_special;
            this.transition = DFA21_transition;
        }
        public String getDescription() {
            return "90:5: ( ( ( THE WHITE_SPACE )? relaxed_day_of_month WHITE_SPACE ( OF WHITE_SPACE )? relaxed_month relaxed_year_prefix relaxed_year )=> ( THE WHITE_SPACE )? relaxed_day_of_month WHITE_SPACE ( OF WHITE_SPACE )? relaxed_month relaxed_year_prefix relaxed_year | ( relaxed_month WHITE_SPACE relaxed_day_of_month relaxed_year_prefix relaxed_year )=> relaxed_month WHITE_SPACE relaxed_day_of_month relaxed_year_prefix relaxed_year | ( THE WHITE_SPACE )? relaxed_day_of_month WHITE_SPACE ( OF WHITE_SPACE )? relaxed_month | ( THE WHITE_SPACE )? relaxed_month WHITE_SPACE relaxed_day_of_month )";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA21_174 = input.LA(1);

                         
                        int index21_174 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA21_174==AT||LA21_174==INT_1_TO_5||(LA21_174>=NOON && LA21_174<=INT_0)||LA21_174==INT_6_TO_9) ) {s = 98;}

                        else if ( (LA21_174==INT_00) ) {s = 209;}

                        else if ( (LA21_174==INT_01_TO_12) ) {s = 210;}

                        else if ( (LA21_174==INT_13_TO_23) ) {s = 211;}

                        else if ( (LA21_174==IN) && (synpred4_Date())) {s = 212;}

                        else if ( (LA21_174==SINGLE_QUOTE) && (synpred4_Date())) {s = 213;}

                        else if ( (LA21_174==INT_24_TO_31) && (synpred4_Date())) {s = 214;}

                        else if ( (LA21_174==INT_32_TO_59) && (synpred4_Date())) {s = 215;}

                        else if ( (LA21_174==INT_60_TO_99) && (synpred4_Date())) {s = 216;}

                         
                        input.seek(index21_174);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA21_176 = input.LA(1);

                         
                        int index21_176 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA21_176==SEVEN) ) {s = 194;}

                        else if ( (LA21_176==EIGHTH) ) {s = 181;}

                        else if ( (LA21_176==TWO) ) {s = 177;}

                        else if ( (LA21_176==SECOND) ) {s = 193;}

                        else if ( (LA21_176==EIGHT) ) {s = 183;}

                        else if ( (LA21_176==SIXTH) ) {s = 179;}

                        else if ( (LA21_176==NINE) ) {s = 180;}

                        else if ( (LA21_176==FOUR) ) {s = 178;}

                        else if ( (LA21_176==FIVE) ) {s = 188;}

                        else if ( (LA21_176==THREE) ) {s = 184;}

                        else if ( (LA21_176==AT||LA21_176==INT_1_TO_5||(LA21_176>=NOON && LA21_176<=INT_0)||LA21_176==INT_6_TO_9) ) {s = 98;}

                        else if ( (LA21_176==INT_00) ) {s = 209;}

                        else if ( (LA21_176==INT_01_TO_12) ) {s = 210;}

                        else if ( (LA21_176==INT_13_TO_23) ) {s = 211;}

                        else if ( (LA21_176==FOURTH) ) {s = 185;}

                        else if ( (LA21_176==THIRD) ) {s = 182;}

                        else if ( (LA21_176==SEVENTH) ) {s = 187;}

                        else if ( (LA21_176==FIRST) ) {s = 186;}

                        else if ( (LA21_176==NINTH) ) {s = 192;}

                        else if ( (LA21_176==ONE) ) {s = 191;}

                        else if ( (LA21_176==SIX) ) {s = 189;}

                        else if ( (LA21_176==IN) && (synpred4_Date())) {s = 212;}

                        else if ( (LA21_176==SINGLE_QUOTE) && (synpred4_Date())) {s = 213;}

                        else if ( (LA21_176==INT_24_TO_31) && (synpred4_Date())) {s = 214;}

                        else if ( (LA21_176==INT_32_TO_59) && (synpred4_Date())) {s = 215;}

                        else if ( (LA21_176==INT_60_TO_99) && (synpred4_Date())) {s = 216;}

                        else if ( (LA21_176==FIFTH) ) {s = 190;}

                         
                        input.seek(index21_176);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA21_211 = input.LA(1);

                         
                        int index21_211 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_Date()) ) {s = 216;}

                        else if ( (true) ) {s = 98;}

                         
                        input.seek(index21_211);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA21_210 = input.LA(1);

                         
                        int index21_210 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_Date()) ) {s = 216;}

                        else if ( (true) ) {s = 98;}

                         
                        input.seek(index21_210);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA21_199 = input.LA(1);

                         
                        int index21_199 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA21_199==AT||LA21_199==INT_1_TO_5||(LA21_199>=NOON && LA21_199<=INT_0)||LA21_199==INT_6_TO_9) ) {s = 172;}

                        else if ( (LA21_199==INT_00) ) {s = 200;}

                        else if ( (LA21_199==INT_01_TO_12) ) {s = 201;}

                        else if ( (LA21_199==INT_13_TO_23) ) {s = 202;}

                        else if ( (LA21_199==IN) && (synpred3_Date())) {s = 203;}

                        else if ( (LA21_199==SINGLE_QUOTE) && (synpred3_Date())) {s = 204;}

                        else if ( (LA21_199==INT_24_TO_31) && (synpred3_Date())) {s = 205;}

                        else if ( (LA21_199==INT_32_TO_59) && (synpred3_Date())) {s = 206;}

                        else if ( (LA21_199==INT_60_TO_99) && (synpred3_Date())) {s = 207;}

                         
                        input.seek(index21_199);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA21_170 = input.LA(1);

                         
                        int index21_170 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA21_170==WHITE_SPACE) ) {s = 199;}

                        else if ( (LA21_170==AT||LA21_170==INT_1_TO_5||(LA21_170>=NOON && LA21_170<=INT_0)||LA21_170==INT_6_TO_9) ) {s = 172;}

                        else if ( (LA21_170==INT_00) ) {s = 200;}

                        else if ( (LA21_170==INT_01_TO_12) ) {s = 201;}

                        else if ( (LA21_170==INT_13_TO_23) ) {s = 202;}

                        else if ( (LA21_170==IN) && (synpred3_Date())) {s = 203;}

                        else if ( (LA21_170==SINGLE_QUOTE) && (synpred3_Date())) {s = 204;}

                        else if ( (LA21_170==INT_24_TO_31) && (synpred3_Date())) {s = 205;}

                        else if ( (LA21_170==INT_32_TO_59) && (synpred3_Date())) {s = 206;}

                        else if ( (LA21_170==INT_60_TO_99) && (synpred3_Date())) {s = 207;}

                         
                        input.seek(index21_170);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA21_209 = input.LA(1);

                         
                        int index21_209 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_Date()) ) {s = 216;}

                        else if ( (true) ) {s = 98;}

                         
                        input.seek(index21_209);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA21_208 = input.LA(1);

                         
                        int index21_208 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA21_208==AT||LA21_208==INT_1_TO_5||(LA21_208>=NOON && LA21_208<=INT_0)||LA21_208==INT_6_TO_9) ) {s = 98;}

                        else if ( (LA21_208==INT_00) ) {s = 209;}

                        else if ( (LA21_208==INT_01_TO_12) ) {s = 210;}

                        else if ( (LA21_208==INT_13_TO_23) ) {s = 211;}

                        else if ( (LA21_208==IN) && (synpred4_Date())) {s = 212;}

                        else if ( (LA21_208==SINGLE_QUOTE) && (synpred4_Date())) {s = 213;}

                        else if ( (LA21_208==INT_24_TO_31) && (synpred4_Date())) {s = 214;}

                        else if ( (LA21_208==INT_32_TO_59) && (synpred4_Date())) {s = 215;}

                        else if ( (LA21_208==INT_60_TO_99) && (synpred4_Date())) {s = 216;}

                         
                        input.seek(index21_208);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA21_171 = input.LA(1);

                         
                        int index21_171 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA21_171==AT||LA21_171==INT_1_TO_5||(LA21_171>=NOON && LA21_171<=INT_0)||LA21_171==INT_6_TO_9) ) {s = 172;}

                        else if ( (LA21_171==INT_00) ) {s = 200;}

                        else if ( (LA21_171==INT_01_TO_12) ) {s = 201;}

                        else if ( (LA21_171==INT_13_TO_23) ) {s = 202;}

                        else if ( (LA21_171==IN) && (synpred3_Date())) {s = 203;}

                        else if ( (LA21_171==SINGLE_QUOTE) && (synpred3_Date())) {s = 204;}

                        else if ( (LA21_171==INT_24_TO_31) && (synpred3_Date())) {s = 205;}

                        else if ( (LA21_171==INT_32_TO_59) && (synpred3_Date())) {s = 206;}

                        else if ( (LA21_171==INT_60_TO_99) && (synpred3_Date())) {s = 207;}

                         
                        input.seek(index21_171);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA21_173 = input.LA(1);

                         
                        int index21_173 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA21_173==WHITE_SPACE) ) {s = 208;}

                        else if ( (LA21_173==AT||LA21_173==INT_1_TO_5||(LA21_173>=NOON && LA21_173<=INT_0)||LA21_173==INT_6_TO_9) ) {s = 98;}

                        else if ( (LA21_173==INT_00) ) {s = 209;}

                        else if ( (LA21_173==INT_01_TO_12) ) {s = 210;}

                        else if ( (LA21_173==INT_13_TO_23) ) {s = 211;}

                        else if ( (LA21_173==IN) && (synpred4_Date())) {s = 212;}

                        else if ( (LA21_173==SINGLE_QUOTE) && (synpred4_Date())) {s = 213;}

                        else if ( (LA21_173==INT_24_TO_31) && (synpred4_Date())) {s = 214;}

                        else if ( (LA21_173==INT_32_TO_59) && (synpred4_Date())) {s = 215;}

                        else if ( (LA21_173==INT_60_TO_99) && (synpred4_Date())) {s = 216;}

                         
                        input.seek(index21_173);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA21_200 = input.LA(1);

                         
                        int index21_200 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Date()) ) {s = 207;}

                        else if ( (true) ) {s = 172;}

                         
                        input.seek(index21_200);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA21_196 = input.LA(1);

                         
                        int index21_196 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA21_196==AT||LA21_196==INT_1_TO_5||(LA21_196>=NOON && LA21_196<=INT_0)||LA21_196==INT_6_TO_9) ) {s = 98;}

                        else if ( (LA21_196==INT_00) ) {s = 209;}

                        else if ( (LA21_196==INT_01_TO_12) ) {s = 210;}

                        else if ( (LA21_196==INT_13_TO_23) ) {s = 211;}

                        else if ( (LA21_196==FIRST) ) {s = 198;}

                        else if ( (LA21_196==ONE) ) {s = 197;}

                        else if ( (LA21_196==IN) && (synpred4_Date())) {s = 212;}

                        else if ( (LA21_196==SINGLE_QUOTE) && (synpred4_Date())) {s = 213;}

                        else if ( (LA21_196==INT_24_TO_31) && (synpred4_Date())) {s = 214;}

                        else if ( (LA21_196==INT_32_TO_59) && (synpred4_Date())) {s = 215;}

                        else if ( (LA21_196==INT_60_TO_99) && (synpred4_Date())) {s = 216;}

                         
                        input.seek(index21_196);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA21_201 = input.LA(1);

                         
                        int index21_201 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Date()) ) {s = 207;}

                        else if ( (true) ) {s = 172;}

                         
                        input.seek(index21_201);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA21_202 = input.LA(1);

                         
                        int index21_202 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Date()) ) {s = 207;}

                        else if ( (true) ) {s = 172;}

                         
                        input.seek(index21_202);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 21, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA34_eotS =
        "\135\uffff";
    static final String DFA34_eofS =
        "\42\uffff\3\3\1\uffff\1\3\11\uffff\1\3\3\uffff\45\3\4\uffff";
    static final String DFA34_minS =
        "\1\31\2\25\1\uffff\32\25\3\uffff\1\32\3\25\1\131\13\25\1\131\1\25"+
        "\1\uffff\45\25\3\26\1\uffff";
    static final String DFA34_maxS =
        "\1\155\2\25\1\uffff\30\25\1\141\1\131\3\uffff\4\106\2\141\11\25"+
        "\2\131\1\25\1\uffff\45\27\3\125\1\uffff";
    static final String DFA34_acceptS =
        "\3\uffff\1\1\32\uffff\1\3\1\5\1\6\22\uffff\1\2\50\uffff\1\4";
    static final String DFA34_specialS =
        "\135\uffff}>";
    static final String[] DFA34_transitionS = {
            "\1\37\1\36\3\uffff\14\36\1\uffff\1\3\1\36\2\uffff\1\4\5\37\1"+
            "\2\1\1\4\3\3\uffff\11\36\3\40\11\uffff\1\5\1\6\1\7\1\10\2\uffff"+
            "\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24"+
            "\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35",
            "\1\41",
            "\1\42",
            "",
            "\1\43",
            "\1\44",
            "\1\44",
            "\1\44",
            "\1\44",
            "\1\44",
            "\1\44",
            "\1\44",
            "\1\44",
            "\1\44",
            "\1\44",
            "\1\44",
            "\1\44",
            "\1\44",
            "\1\44",
            "\1\44",
            "\1\44",
            "\1\44",
            "\1\44",
            "\1\44",
            "\1\44",
            "\1\44",
            "\1\44",
            "\1\44",
            "\1\46\27\uffff\1\45\53\uffff\1\55\1\50\1\57\1\52\1\47\1\56"+
            "\1\54\1\51\1\53",
            "\1\60\27\uffff\1\61\53\uffff\1\62",
            "",
            "",
            "",
            "\1\63\3\uffff\14\63\2\uffff\1\63\10\uffff\1\3\1\uffff\4\3\3"+
            "\uffff\11\63",
            "\1\3\1\uffff\1\3\2\uffff\1\3\3\uffff\14\3\2\uffff\1\3\21\uffff"+
            "\2\3\1\64\1\65\1\66\1\67\1\70\1\71\1\72",
            "\1\3\1\uffff\1\3\2\uffff\1\116\3\uffff\1\102\1\103\1\104\1"+
            "\105\1\106\1\107\1\110\1\111\1\112\1\113\1\114\1\115\2\uffff"+
            "\1\121\21\uffff\1\117\1\120\1\73\1\74\1\75\1\76\1\77\1\100\1"+
            "\101",
            "\1\3\1\uffff\1\3\2\uffff\1\116\3\uffff\1\102\1\103\1\104\1"+
            "\105\1\106\1\107\1\110\1\111\1\112\1\113\1\114\1\115\2\uffff"+
            "\1\121\21\uffff\1\117\1\120\1\122\1\123\1\124\1\125\1\126\1"+
            "\127\1\130",
            "\1\55\1\50\1\57\1\52\1\47\1\56\1\54\1\51\1\53",
            "\1\3\1\uffff\1\3\2\uffff\1\116\3\uffff\1\102\1\103\1\104\1"+
            "\105\1\106\1\107\1\110\1\111\1\112\1\113\1\114\1\115\2\uffff"+
            "\1\121\21\uffff\1\117\1\120\1\122\1\123\1\124\1\125\1\126\1"+
            "\127\1\130\22\uffff\1\55\1\50\1\57\1\52\1\47\1\56\1\54\1\51"+
            "\1\53",
            "\1\44",
            "\1\44",
            "\1\44",
            "\1\44",
            "\1\44",
            "\1\44",
            "\1\44",
            "\1\44",
            "\1\44",
            "\1\3\1\uffff\1\3\2\uffff\1\116\3\uffff\1\102\1\103\1\104\1"+
            "\105\1\106\1\107\1\110\1\111\1\112\1\113\1\114\1\115\2\uffff"+
            "\1\121\21\uffff\1\117\1\120\1\122\1\123\1\124\1\125\1\126\1"+
            "\127\1\130\22\uffff\1\62",
            "\1\62",
            "\1\44",
            "",
            "\1\131\1\uffff\1\3",
            "\1\131\1\uffff\1\3",
            "\1\131\1\uffff\1\3",
            "\1\131\1\uffff\1\3",
            "\1\131\1\uffff\1\3",
            "\1\131\1\uffff\1\3",
            "\1\131\1\uffff\1\3",
            "\1\132\1\uffff\1\3",
            "\1\132\1\uffff\1\3",
            "\1\132\1\uffff\1\3",
            "\1\132\1\uffff\1\3",
            "\1\132\1\uffff\1\3",
            "\1\132\1\uffff\1\3",
            "\1\132\1\uffff\1\3",
            "\1\133\1\uffff\1\3",
            "\1\133\1\uffff\1\3",
            "\1\133\1\uffff\1\3",
            "\1\133\1\uffff\1\3",
            "\1\133\1\uffff\1\3",
            "\1\133\1\uffff\1\3",
            "\1\133\1\uffff\1\3",
            "\1\133\1\uffff\1\3",
            "\1\133\1\uffff\1\3",
            "\1\133\1\uffff\1\3",
            "\1\133\1\uffff\1\3",
            "\1\133\1\uffff\1\3",
            "\1\133\1\uffff\1\3",
            "\1\133\1\uffff\1\3",
            "\1\133\1\uffff\1\3",
            "\1\133\1\uffff\1\3",
            "\1\133\1\uffff\1\3",
            "\1\133\1\uffff\1\3",
            "\1\133\1\uffff\1\3",
            "\1\133\1\uffff\1\3",
            "\1\133\1\uffff\1\3",
            "\1\133\1\uffff\1\3",
            "\1\133\1\uffff\1\3",
            "\1\3\24\uffff\1\37\3\uffff\1\3\37\uffff\7\3",
            "\1\3\24\uffff\1\37\3\uffff\1\3\13\uffff\1\134\1\uffff\1\134"+
            "\21\uffff\7\3",
            "\1\3\30\uffff\1\3\13\uffff\1\134\1\uffff\1\134\21\uffff\7\3",
            ""
    };

    static final short[] DFA34_eot = DFA.unpackEncodedString(DFA34_eotS);
    static final short[] DFA34_eof = DFA.unpackEncodedString(DFA34_eofS);
    static final char[] DFA34_min = DFA.unpackEncodedStringToUnsignedChars(DFA34_minS);
    static final char[] DFA34_max = DFA.unpackEncodedStringToUnsignedChars(DFA34_maxS);
    static final short[] DFA34_accept = DFA.unpackEncodedString(DFA34_acceptS);
    static final short[] DFA34_special = DFA.unpackEncodedString(DFA34_specialS);
    static final short[][] DFA34_transition;

    static {
        int numStates = DFA34_transitionS.length;
        DFA34_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA34_transition[i] = DFA.unpackEncodedString(DFA34_transitionS[i]);
        }
    }

    class DFA34 extends DFA {

        public DFA34(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 34;
            this.eot = DFA34_eot;
            this.eof = DFA34_eof;
            this.min = DFA34_min;
            this.max = DFA34_max;
            this.accept = DFA34_accept;
            this.special = DFA34_special;
            this.transition = DFA34_transition;
        }
        public String getDescription() {
            return "177:1: relative_date : ( relative_prefix WHITE_SPACE ( relative_target )? -> ^( RELATIVE_DATE ^( SEEK relative_prefix relative_target ) ) | implicit_prefix WHITE_SPACE relative_target -> ^( RELATIVE_DATE ^( SEEK implicit_prefix relative_target ) ) | relative_target -> ^( RELATIVE_DATE ^( SEEK DIRECTION[\">\"] SEEK_BY[\"by_day\"] INT[\"0\"] relative_target ) ) | spelled_or_int_01_to_31_optional_prefix WHITE_SPACE relative_target WHITE_SPACE relative_suffix -> ^( RELATIVE_DATE ^( SEEK relative_suffix spelled_or_int_01_to_31_optional_prefix relative_target ) ) | ( THE WHITE_SPACE )? relative_occurrence_index WHITE_SPACE day_of_week WHITE_SPACE IN WHITE_SPACE relaxed_month -> ^( RELATIVE_DATE ^( WEEK_INDEX relative_occurrence_index day_of_week relaxed_month ) ) | named_relative_date );";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
    }
    static final String DFA55_eotS =
        "\12\uffff";
    static final String DFA55_eofS =
        "\1\uffff\6\10\3\uffff";
    static final String DFA55_minS =
        "\1\57\6\25\3\uffff";
    static final String DFA55_maxS =
        "\1\125\6\127\3\uffff";
    static final String DFA55_acceptS =
        "\7\uffff\1\3\1\2\1\1";
    static final String DFA55_specialS =
        "\12\uffff}>";
    static final String[] DFA55_transitionS = {
            "\1\3\37\uffff\2\7\1\1\1\2\1\4\1\5\1\6",
            "\1\10\1\uffff\1\10\62\uffff\1\11\2\uffff\2\10\3\uffff\1\11"+
            "\1\uffff\4\11",
            "\1\10\1\uffff\1\10\62\uffff\1\11\2\uffff\2\10\3\uffff\1\11"+
            "\1\uffff\4\11",
            "\1\10\1\uffff\1\10\62\uffff\1\11\2\uffff\2\10\3\uffff\1\11"+
            "\1\uffff\4\11",
            "\1\10\1\uffff\1\10\62\uffff\1\11\2\uffff\2\10\3\uffff\1\11"+
            "\1\uffff\4\11",
            "\1\10\1\uffff\1\10\62\uffff\1\11\2\uffff\2\10\3\uffff\1\11"+
            "\1\uffff\4\11",
            "\1\10\1\uffff\1\10\62\uffff\1\11\2\uffff\2\10\3\uffff\1\11"+
            "\1\uffff\4\11",
            "",
            "",
            ""
    };

    static final short[] DFA55_eot = DFA.unpackEncodedString(DFA55_eotS);
    static final short[] DFA55_eof = DFA.unpackEncodedString(DFA55_eofS);
    static final char[] DFA55_min = DFA.unpackEncodedStringToUnsignedChars(DFA55_minS);
    static final char[] DFA55_max = DFA.unpackEncodedStringToUnsignedChars(DFA55_maxS);
    static final short[] DFA55_accept = DFA.unpackEncodedString(DFA55_acceptS);
    static final short[] DFA55_special = DFA.unpackEncodedString(DFA55_specialS);
    static final short[][] DFA55_transition;

    static {
        int numStates = DFA55_transitionS.length;
        DFA55_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA55_transition[i] = DFA.unpackEncodedString(DFA55_transitionS[i]);
        }
    }

    class DFA55 extends DFA {

        public DFA55(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 55;
            this.eot = DFA55_eot;
            this.eof = DFA55_eof;
            this.min = DFA55_min;
            this.max = DFA55_max;
            this.accept = DFA55_accept;
            this.special = DFA55_special;
            this.transition = DFA55_transition;
        }
        public String getDescription() {
            return "260:1: time : ( hours ( COLON )? minutes ( ( WHITE_SPACE )? ( meridian_indicator | ( MILITARY_HOUR_SUFFIX | HOUR ) ) )? -> ^( EXPLICIT_TIME hours minutes ( meridian_indicator )? ) | hours ( ( WHITE_SPACE )? meridian_indicator )? -> ^( EXPLICIT_TIME hours ^( MINUTES_OF_HOUR INT[\"0\"] ) ( meridian_indicator )? ) | named_time );";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
    }
    static final String DFA74_eotS =
        "\45\uffff";
    static final String DFA74_eofS =
        "\24\uffff\1\27\1\43\1\27\13\uffff\1\43\2\uffff";
    static final String DFA74_minS =
        "\1\131\23\uffff\3\25\1\uffff\1\131\11\uffff\1\25\2\uffff";
    static final String DFA74_maxS =
        "\1\155\23\uffff\1\141\1\131\1\141\1\uffff\1\141\11\uffff\1\131\2"+
        "\uffff";
    static final String DFA74_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1"+
        "\15\1\16\1\17\1\20\1\21\1\22\1\23\3\uffff\1\24\1\uffff\1\30\1\35"+
        "\1\31\1\25\1\34\1\32\1\26\1\27\1\33\1\uffff\1\36\1\37";
    static final String DFA74_specialS =
        "\45\uffff}>";
    static final String[] DFA74_transitionS = {
            "\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1"+
            "\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\26\1\uffff\1\27\25\uffff\1\30\53\uffff\1\34\1\37\1\40\1"+
            "\31\1\33\1\36\1\41\1\35\1\32",
            "\1\42\1\uffff\1\43\25\uffff\1\44\53\uffff\1\44",
            "\3\27\2\uffff\1\27\2\uffff\20\27\2\uffff\1\27\16\uffff\11\27"+
            "\10\uffff\12\27\1\34\1\37\1\40\1\31\1\33\1\36\1\41\1\35\1\32",
            "",
            "\1\34\1\37\1\40\1\31\1\33\1\36\1\41\1\35\1\32",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\3\43\2\uffff\1\43\2\uffff\20\43\2\uffff\1\43\16\uffff\11\43"+
            "\10\uffff\12\43\1\44",
            "",
            ""
    };

    static final short[] DFA74_eot = DFA.unpackEncodedString(DFA74_eotS);
    static final short[] DFA74_eof = DFA.unpackEncodedString(DFA74_eofS);
    static final char[] DFA74_min = DFA.unpackEncodedStringToUnsignedChars(DFA74_minS);
    static final char[] DFA74_max = DFA.unpackEncodedStringToUnsignedChars(DFA74_maxS);
    static final short[] DFA74_accept = DFA.unpackEncodedString(DFA74_acceptS);
    static final short[] DFA74_special = DFA.unpackEncodedString(DFA74_specialS);
    static final short[][] DFA74_transition;

    static {
        int numStates = DFA74_transitionS.length;
        DFA74_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA74_transition[i] = DFA.unpackEncodedString(DFA74_transitionS[i]);
        }
    }

    class DFA74 extends DFA {

        public DFA74(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 74;
            this.eot = DFA74_eot;
            this.eof = DFA74_eof;
            this.min = DFA74_min;
            this.max = DFA74_max;
            this.accept = DFA74_accept;
            this.special = DFA74_special;
            this.transition = DFA74_transition;
        }
        public String getDescription() {
            return "346:1: spelled_one_to_thirty_one : ( ONE -> INT[\"1\"] | TWO -> INT[\"2\"] | THREE -> INT[\"3\"] | FOUR -> INT[\"4\"] | FIVE -> INT[\"5\"] | SIX -> INT[\"6\"] | SEVEN -> INT[\"7\"] | EIGHT -> INT[\"8\"] | NINE -> INT[\"9\"] | TEN -> INT[\"10\"] | ELEVEN -> INT[\"11\"] | TWELVE -> INT[\"12\"] | THIRTEEN -> INT[\"13\"] | FOURTEEN -> INT[\"14\"] | FIFTEEN -> INT[\"15\"] | SIXTEEN -> INT[\"16\"] | SEVENTEEN -> INT[\"17\"] | EIGHTEEN -> INT[\"18\"] | NINETEEN -> INT[\"19\"] | TWENTY -> INT[\"20\"] | TWENTY ( DASH | WHITE_SPACE )? ONE -> INT[\"21\"] | TWENTY ( DASH | WHITE_SPACE )? TWO -> INT[\"22\"] | TWENTY ( DASH | WHITE_SPACE )? THREE -> INT[\"23\"] | TWENTY ( DASH | WHITE_SPACE )? FOUR -> INT[\"24\"] | TWENTY ( DASH | WHITE_SPACE )? FIVE -> INT[\"25\"] | TWENTY ( DASH | WHITE_SPACE )? SIX -> INT[\"26\"] | TWENTY ( DASH | WHITE_SPACE )? SEVEN -> INT[\"27\"] | TWENTY ( DASH | WHITE_SPACE )? EIGHT -> INT[\"28\"] | TWENTY ( DASH | WHITE_SPACE )? NINE -> INT[\"29\"] | THIRTY -> INT[\"30\"] | THIRTY ( DASH | WHITE_SPACE )? ONE -> INT[\"31\"] );";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
    }
    static final String DFA95_eotS =
        "\43\uffff";
    static final String DFA95_eofS =
        "\43\uffff";
    static final String DFA95_minS =
        "\1\60\25\uffff\1\25\12\uffff\2\60";
    static final String DFA95_maxS =
        "\1\u0087\25\uffff\1\161\12\uffff\2\161";
    static final String DFA95_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1"+
        "\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\uffff\1\26\1\27\1"+
        "\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37\2\uffff";
    static final String DFA95_specialS =
        "\43\uffff}>";
    static final String[] DFA95_transitionS = {
            "\1\1\1\2\1\3\1\4\1\5\67\uffff\1\26\1\40\1\6\1\7\1\10\1\11\1"+
            "\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1"+
            "\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\40",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\42\27\uffff\1\41\2\uffff\1\25\1\27\1\30\1\31\1\32\71\uffff"+
            "\1\33\1\34\1\35\1\36",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\25\1\27\1\30\1\31\1\32\71\uffff\1\33\1\34\1\35\1\36",
            "\1\25\1\27\1\30\1\31\1\32\71\uffff\1\33\1\34\1\35\1\36"
    };

    static final short[] DFA95_eot = DFA.unpackEncodedString(DFA95_eotS);
    static final short[] DFA95_eof = DFA.unpackEncodedString(DFA95_eofS);
    static final char[] DFA95_min = DFA.unpackEncodedStringToUnsignedChars(DFA95_minS);
    static final char[] DFA95_max = DFA.unpackEncodedStringToUnsignedChars(DFA95_maxS);
    static final short[] DFA95_accept = DFA.unpackEncodedString(DFA95_acceptS);
    static final short[] DFA95_special = DFA.unpackEncodedString(DFA95_specialS);
    static final short[][] DFA95_transition;

    static {
        int numStates = DFA95_transitionS.length;
        DFA95_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA95_transition[i] = DFA.unpackEncodedString(DFA95_transitionS[i]);
        }
    }

    class DFA95 extends DFA {

        public DFA95(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 95;
            this.eot = DFA95_eot;
            this.eof = DFA95_eof;
            this.min = DFA95_min;
            this.max = DFA95_max;
            this.accept = DFA95_accept;
            this.special = DFA95_special;
            this.transition = DFA95_transition;
        }
        public String getDescription() {
            return "381:1: spelled_first_to_thirty_first : ( FIRST -> INT[\"1\"] | SECOND -> INT[\"2\"] | THIRD -> INT[\"3\"] | FOURTH -> INT[\"4\"] | FIFTH -> INT[\"5\"] | SIXTH -> INT[\"6\"] | SEVENTH -> INT[\"7\"] | EIGHTH -> INT[\"8\"] | NINTH -> INT[\"9\"] | TENTH -> INT[\"10\"] | ELEVENTH -> INT[\"11\"] | TWELFTH -> INT[\"12\"] | THIRTEENTH -> INT[\"13\"] | FOURTEENTH -> INT[\"14\"] | FIFTEENTH -> INT[\"15\"] | SIXTEENTH -> INT[\"16\"] | SEVENTEENTH -> INT[\"17\"] | EIGHTEENTH -> INT[\"18\"] | NINETEENTH -> INT[\"19\"] | TWENTIETH -> INT[\"20\"] | ( TWENTY_FIRST | ( TWENTY ( DASH | WHITE_SPACE )? FIRST ) ) -> INT[\"21\"] | ( TWENTY_SECOND | ( TWENTY ( DASH | WHITE_SPACE )? SECOND ) ) -> INT[\"22\"] | ( TWENTY_THIRD | ( TWENTY ( DASH | WHITE_SPACE )? THIRD ) ) -> INT[\"23\"] | ( TWENTY_FOURTH | ( TWENTY ( DASH | WHITE_SPACE )? FOURTH ) ) -> INT[\"24\"] | ( TWENTY_FIFTH | ( TWENTY ( DASH | WHITE_SPACE )? FIFTH ) ) -> INT[\"25\"] | ( TWENTY_SIXTH | ( TWENTY ( DASH | WHITE_SPACE )? SIXTH ) ) -> INT[\"26\"] | ( TWENTY_SEVENTH | ( TWENTY ( DASH | WHITE_SPACE )? SEVENTH ) ) -> INT[\"27\"] | ( TWENTY_EIGHTH | ( TWENTY ( DASH | WHITE_SPACE )? EIGHTH ) ) -> INT[\"28\"] | ( TWENTY_NINTH | ( TWENTY ( DASH | WHITE_SPACE )? NINTH ) ) -> INT[\"29\"] | THIRTIETH -> INT[\"30\"] | ( THIRTY_FIRST | ( THIRTY ( DASH | WHITE_SPACE )? FIRST ) ) -> INT[\"31\"] );";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
    }
 

    public static final BitSet FOLLOW_date_time_in_search142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_date_in_date_time191 = new BitSet(new long[]{0x0000000000A00002L});
    public static final BitSet FOLLOW_date_time_separator_in_date_time194 = new BitSet(new long[]{0x0000800000000000L,0x00000000003F8000L});
    public static final BitSet FOLLOW_time_in_date_time196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_time_in_date_time215 = new BitSet(new long[]{0x0000000000A00002L});
    public static final BitSet FOLLOW_time_date_separator_in_date_time218 = new BitSet(new long[]{0xC7FF9BFFC6000000L,0xFFFFFFFFFFFC03FFL,0x00000000000000FFL});
    public static final BitSet FOLLOW_date_in_date_time220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_date_time_separator263 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_AT_in_date_time_separator266 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_date_time_separator268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMMA_in_date_time_separator276 = new BitSet(new long[]{0x0000000000600002L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_date_time_separator278 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_AT_in_date_time_separator282 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_date_time_separator284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_time_date_separator301 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_ON_in_time_date_separator304 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_time_date_separator306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMMA_in_time_date_separator314 = new BitSet(new long[]{0x0000000001200002L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_time_date_separator316 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_ON_in_time_date_separator320 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_time_date_separator322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relaxed_date_in_date342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_formal_date_in_date348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relative_date_in_date354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_global_date_prefix_in_date360 = new BitSet(new long[]{0xC7FF9BFFC6000000L,0xFFFFFFFFFFFC03FFL,0x00000000000000FFL});
    public static final BitSet FOLLOW_date_in_date362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THE_in_global_date_prefix399 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_global_date_prefix401 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_DAY_in_global_date_prefix405 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_global_date_prefix407 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_prefix_direction_in_global_date_prefix409 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_global_date_prefix411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spelled_or_int_01_to_31_optional_prefix_in_global_date_prefix437 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_global_date_prefix439 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_DAY_in_global_date_prefix441 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_global_date_prefix443 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_prefix_direction_in_global_date_prefix445 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_global_date_prefix447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AFTER_in_prefix_direction478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BEFORE_in_prefix_direction490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THE_in_relaxed_date578 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_relaxed_date580 = new BitSet(new long[]{0x001F800002000000L,0xFFFFFFFFFE780000L,0x00000000000000FFL});
    public static final BitSet FOLLOW_relaxed_day_of_month_in_relaxed_date584 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_relaxed_date586 = new BitSet(new long[]{0x000003FFE0000000L});
    public static final BitSet FOLLOW_OF_in_relaxed_date589 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_relaxed_date591 = new BitSet(new long[]{0x000003FFC0000000L});
    public static final BitSet FOLLOW_relaxed_month_in_relaxed_date595 = new BitSet(new long[]{0x0000000000A00000L});
    public static final BitSet FOLLOW_relaxed_year_prefix_in_relaxed_date597 = new BitSet(new long[]{0x0000040000000000L,0x0000000001F40000L});
    public static final BitSet FOLLOW_relaxed_year_in_relaxed_date599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relaxed_month_in_relaxed_date635 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_relaxed_date637 = new BitSet(new long[]{0x001F800002000000L,0xFFFFFFFFFE780000L,0x00000000000000FFL});
    public static final BitSet FOLLOW_relaxed_day_of_month_in_relaxed_date639 = new BitSet(new long[]{0x0000000000A00000L});
    public static final BitSet FOLLOW_relaxed_year_prefix_in_relaxed_date641 = new BitSet(new long[]{0x0000040000000000L,0x0000000001F40000L});
    public static final BitSet FOLLOW_relaxed_year_in_relaxed_date643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THE_in_relaxed_date659 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_relaxed_date661 = new BitSet(new long[]{0x001F800002000000L,0xFFFFFFFFFE780000L,0x00000000000000FFL});
    public static final BitSet FOLLOW_relaxed_day_of_month_in_relaxed_date665 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_relaxed_date667 = new BitSet(new long[]{0x000003FFE0000000L});
    public static final BitSet FOLLOW_OF_in_relaxed_date670 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_relaxed_date672 = new BitSet(new long[]{0x000003FFC0000000L});
    public static final BitSet FOLLOW_relaxed_month_in_relaxed_date676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THE_in_relaxed_date694 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_relaxed_date696 = new BitSet(new long[]{0x000003FFC0000000L});
    public static final BitSet FOLLOW_relaxed_month_in_relaxed_date700 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_relaxed_date702 = new BitSet(new long[]{0x001F800002000000L,0xFFFFFFFFFE780000L,0x00000000000000FFL});
    public static final BitSet FOLLOW_relaxed_day_of_month_in_relaxed_date704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_JANUARY_in_relaxed_month736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FEBRUARY_in_relaxed_month753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MARCH_in_relaxed_month769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_APRIL_in_relaxed_month788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MAY_in_relaxed_month807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_JUNE_in_relaxed_month828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_JULY_in_relaxed_month848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AUGUST_in_relaxed_month868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEPTEMBER_in_relaxed_month886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OCTOBER_in_relaxed_month901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOVEMBER_in_relaxed_month918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DECEMBER_in_relaxed_month934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spelled_or_int_01_to_31_optional_prefix_in_relaxed_day_of_month959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spelled_first_to_thirty_first_in_relaxed_day_of_month986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SINGLE_QUOTE_in_relaxed_year1016 = new BitSet(new long[]{0x0000000000000000L,0x0000000001F40000L});
    public static final BitSet FOLLOW_int_00_to_99_mandatory_prefix_in_relaxed_year1019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_int_four_digits_in_relaxed_year1046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMMA_in_relaxed_year_prefix1076 = new BitSet(new long[]{0x0000080000200002L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_relaxed_year_prefix1078 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_relaxed_year_prefix1083 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_IN_in_relaxed_year_prefix1087 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_relaxed_year_prefix1089 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_THE_in_relaxed_year_prefix1091 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_relaxed_year_prefix1093 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_YEAR_in_relaxed_year_prefix1095 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_relaxed_year_prefix1097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_formal_year_four_digits_in_formal_date1120 = new BitSet(new long[]{0x0000600000000000L});
    public static final BitSet FOLLOW_formal_date_separator_in_formal_date1122 = new BitSet(new long[]{0x0000800000000000L,0x0000000001FC0000L});
    public static final BitSet FOLLOW_formal_month_of_year_in_formal_date1124 = new BitSet(new long[]{0x0000600000000000L});
    public static final BitSet FOLLOW_formal_date_separator_in_formal_date1126 = new BitSet(new long[]{0x0000800000000000L,0x0000000000780000L});
    public static final BitSet FOLLOW_formal_day_of_month_in_formal_date1128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_formal_month_of_year_in_formal_date1157 = new BitSet(new long[]{0x0000600000000000L});
    public static final BitSet FOLLOW_formal_date_separator_in_formal_date1159 = new BitSet(new long[]{0x0000800000000000L,0x0000000000780000L});
    public static final BitSet FOLLOW_formal_day_of_month_in_formal_date1161 = new BitSet(new long[]{0x0000600000000002L});
    public static final BitSet FOLLOW_formal_date_separator_in_formal_date1164 = new BitSet(new long[]{0x0000000000000000L,0x0000000001F40000L});
    public static final BitSet FOLLOW_formal_year_in_formal_date1166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_int_01_to_12_optional_prefix_in_formal_month_of_year1200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_int_01_to_31_optional_prefix_in_formal_day_of_month1223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_formal_year_four_digits_in_formal_year1246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_int_00_to_99_mandatory_prefix_in_formal_year1252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_int_four_digits_in_formal_year_four_digits1275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_formal_date_separator0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relative_prefix_in_relative_date1324 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_relative_date1326 = new BitSet(new long[]{0xC00013FFC4000002L,0x000000000000007FL});
    public static final BitSet FOLLOW_relative_target_in_relative_date1328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_implicit_prefix_in_relative_date1362 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_relative_date1364 = new BitSet(new long[]{0xC00013FFC4000000L,0x000000000000007FL});
    public static final BitSet FOLLOW_relative_target_in_relative_date1366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relative_target_in_relative_date1406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spelled_or_int_01_to_31_optional_prefix_in_relative_date1446 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_relative_date1448 = new BitSet(new long[]{0xC00013FFC4000000L,0x000000000000007FL});
    public static final BitSet FOLLOW_relative_target_in_relative_date1450 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_relative_date1452 = new BitSet(new long[]{0x2800000000000000L});
    public static final BitSet FOLLOW_relative_suffix_in_relative_date1454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THE_in_relative_date1494 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_relative_date1496 = new BitSet(new long[]{0x003F800002000000L});
    public static final BitSet FOLLOW_relative_occurrence_index_in_relative_date1500 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_relative_date1502 = new BitSet(new long[]{0x0000000000000000L,0x000000000000007FL});
    public static final BitSet FOLLOW_day_of_week_in_relative_date1504 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_relative_date1506 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_IN_in_relative_date1508 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_relative_date1510 = new BitSet(new long[]{0x000003FFC0000000L});
    public static final BitSet FOLLOW_relaxed_month_in_relative_date1512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_named_relative_date_in_relative_date1547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_1_TO_5_in_relative_occurrence_index1563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FIRST_in_relative_occurrence_index1574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SECOND_in_relative_occurrence_index1590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIRD_in_relative_occurrence_index1605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOURTH_in_relative_occurrence_index1621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FIFTH_in_relative_occurrence_index1636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LAST_in_relative_occurrence_index1652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_day_of_week_in_relative_target1678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relaxed_month_in_relative_target1685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relative_date_span_in_relative_target1691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIS_in_implicit_prefix1706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIS_in_relative_prefix1733 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_relative_prefix1735 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_LAST_in_relative_prefix1739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIS_in_relative_prefix1761 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_relative_prefix1763 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_NEXT_in_relative_prefix1767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIS_in_relative_prefix1789 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_relative_prefix1791 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_PAST_in_relative_prefix1795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIS_in_relative_prefix1817 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_relative_prefix1819 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_COMING_in_relative_prefix1823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIS_in_relative_prefix1843 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_relative_prefix1845 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_UPCOMING_in_relative_prefix1849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IN_in_relative_prefix1867 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_relative_prefix1869 = new BitSet(new long[]{0x0000800000000000L,0x00003FFFFE780000L});
    public static final BitSet FOLLOW_spelled_or_int_01_to_31_optional_prefix_in_relative_prefix1873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FROM_in_relative_suffix1905 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_relative_suffix1907 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_NOW_in_relative_suffix1909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AGO_in_relative_suffix1923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DAY_in_relative_date_span1963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WEEK_in_relative_date_span1976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MONTH_in_relative_date_span1988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_YEAR_in_relative_date_span1999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SUNDAY_in_day_of_week2019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MONDAY_in_day_of_week2037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TUESDAY_in_day_of_week2055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WEDNESDAY_in_day_of_week2072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THURSDAY_in_day_of_week2087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FRIDAY_in_day_of_week2103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SATURDAY_in_day_of_week2121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TODAY_in_named_relative_date2146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOMORROW_in_named_relative_date2178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_YESTERDAY_in_named_relative_date2207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_hours_in_time2247 = new BitSet(new long[]{0x0000000000000000L,0x0000000000F40400L});
    public static final BitSet FOLLOW_COLON_in_time2249 = new BitSet(new long[]{0x0000000000000000L,0x0000000000F40400L});
    public static final BitSet FOLLOW_minutes_in_time2252 = new BitSet(new long[]{0x0000000000200002L,0x0000000000007800L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_time2255 = new BitSet(new long[]{0x0000000000000000L,0x0000000000007800L});
    public static final BitSet FOLLOW_meridian_indicator_in_time2259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MILITARY_HOUR_SUFFIX_in_time2264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HOUR_in_time2268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_hours_in_time2304 = new BitSet(new long[]{0x0000000000200002L,0x0000000000006000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_time2307 = new BitSet(new long[]{0x0000000000000000L,0x0000000000006000L});
    public static final BitSet FOLLOW_meridian_indicator_in_time2310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_named_time_in_time2349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_int_00_to_23_optional_prefix_in_hours2364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_int_00_to_59_mandatory_prefix_in_minutes2388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AM_in_meridian_indicator2412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PM_in_meridian_indicator2423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOON_in_named_time2443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MIDNIGHT_in_named_time2476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_0_in_int_00_to_23_optional_prefix2518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_00_in_int_00_to_23_optional_prefix2524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_1_TO_5_in_int_00_to_23_optional_prefix2530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_6_TO_9_in_int_00_to_23_optional_prefix2536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_01_TO_12_in_int_00_to_23_optional_prefix2542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_13_TO_23_in_int_00_to_23_optional_prefix2548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_00_in_int_00_to_59_mandatory_prefix2570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_01_TO_12_in_int_00_to_59_mandatory_prefix2576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_13_TO_23_in_int_00_to_59_mandatory_prefix2582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_24_TO_31_in_int_00_to_59_mandatory_prefix2588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_32_TO_59_in_int_00_to_59_mandatory_prefix2594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_int_00_to_59_mandatory_prefix_in_int_00_to_99_mandatory_prefix2616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_60_TO_99_in_int_00_to_99_mandatory_prefix2622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_1_TO_5_in_int_01_to_12_optional_prefix2644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_6_TO_9_in_int_01_to_12_optional_prefix2648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_01_TO_12_in_int_01_to_12_optional_prefix2652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_1_TO_5_in_int_01_to_31_optional_prefix2675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_6_TO_9_in_int_01_to_31_optional_prefix2681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_01_TO_12_in_int_01_to_31_optional_prefix2687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_13_TO_23_in_int_01_to_31_optional_prefix2693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_24_TO_31_in_int_01_to_31_optional_prefix2699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_int_00_to_99_mandatory_prefix_in_int_four_digits2721 = new BitSet(new long[]{0x0000000000000000L,0x0000000001F40000L});
    public static final BitSet FOLLOW_int_00_to_99_mandatory_prefix_in_int_four_digits2723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_int_01_to_31_optional_prefix_in_spelled_or_int_01_to_31_optional_prefix2751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spelled_one_to_thirty_one_in_spelled_or_int_01_to_31_optional_prefix2757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ONE_in_spelled_one_to_thirty_one2773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWO_in_spelled_one_to_thirty_one2791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THREE_in_spelled_one_to_thirty_one2809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOUR_in_spelled_one_to_thirty_one2825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FIVE_in_spelled_one_to_thirty_one2842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SIX_in_spelled_one_to_thirty_one2859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEVEN_in_spelled_one_to_thirty_one2877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EIGHT_in_spelled_one_to_thirty_one2893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NINE_in_spelled_one_to_thirty_one2909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEN_in_spelled_one_to_thirty_one2926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELEVEN_in_spelled_one_to_thirty_one2944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWELVE_in_spelled_one_to_thirty_one2959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIRTEEN_in_spelled_one_to_thirty_one2974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOURTEEN_in_spelled_one_to_thirty_one2987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FIFTEEN_in_spelled_one_to_thirty_one3000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SIXTEEN_in_spelled_one_to_thirty_one3014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEVENTEEN_in_spelled_one_to_thirty_one3028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EIGHTEEN_in_spelled_one_to_thirty_one3040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NINETEEN_in_spelled_one_to_thirty_one3053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_one_to_thirty_one3066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_one_to_thirty_one3081 = new BitSet(new long[]{0x0000200000200000L,0x0000000002000000L});
    public static final BitSet FOLLOW_DASH_in_spelled_one_to_thirty_one3084 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_spelled_one_to_thirty_one3088 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_ONE_in_spelled_one_to_thirty_one3092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_one_to_thirty_one3105 = new BitSet(new long[]{0x0000200000200000L,0x0000000004000000L});
    public static final BitSet FOLLOW_DASH_in_spelled_one_to_thirty_one3108 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_spelled_one_to_thirty_one3112 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_TWO_in_spelled_one_to_thirty_one3116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_one_to_thirty_one3129 = new BitSet(new long[]{0x0000200000200000L,0x0000000008000000L});
    public static final BitSet FOLLOW_DASH_in_spelled_one_to_thirty_one3132 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_spelled_one_to_thirty_one3136 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_THREE_in_spelled_one_to_thirty_one3140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_one_to_thirty_one3151 = new BitSet(new long[]{0x0000200000200000L,0x0000000010000000L});
    public static final BitSet FOLLOW_DASH_in_spelled_one_to_thirty_one3154 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_spelled_one_to_thirty_one3158 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_FOUR_in_spelled_one_to_thirty_one3162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_one_to_thirty_one3174 = new BitSet(new long[]{0x0000200000200000L,0x0000000020000000L});
    public static final BitSet FOLLOW_DASH_in_spelled_one_to_thirty_one3177 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_spelled_one_to_thirty_one3181 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_FIVE_in_spelled_one_to_thirty_one3185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_one_to_thirty_one3197 = new BitSet(new long[]{0x0000200000200000L,0x0000000040000000L});
    public static final BitSet FOLLOW_DASH_in_spelled_one_to_thirty_one3200 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_spelled_one_to_thirty_one3204 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_SIX_in_spelled_one_to_thirty_one3208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_one_to_thirty_one3221 = new BitSet(new long[]{0x0000200000200000L,0x0000000080000000L});
    public static final BitSet FOLLOW_DASH_in_spelled_one_to_thirty_one3224 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_spelled_one_to_thirty_one3228 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_SEVEN_in_spelled_one_to_thirty_one3232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_one_to_thirty_one3243 = new BitSet(new long[]{0x0000200000200000L,0x0000000100000000L});
    public static final BitSet FOLLOW_DASH_in_spelled_one_to_thirty_one3246 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_spelled_one_to_thirty_one3250 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_EIGHT_in_spelled_one_to_thirty_one3254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_one_to_thirty_one3265 = new BitSet(new long[]{0x0000200000200000L,0x0000000200000000L});
    public static final BitSet FOLLOW_DASH_in_spelled_one_to_thirty_one3268 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_spelled_one_to_thirty_one3272 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_NINE_in_spelled_one_to_thirty_one3276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIRTY_in_spelled_one_to_thirty_one3288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIRTY_in_spelled_one_to_thirty_one3327 = new BitSet(new long[]{0x0000200000200000L,0x0000000002000000L});
    public static final BitSet FOLLOW_DASH_in_spelled_one_to_thirty_one3330 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_spelled_one_to_thirty_one3334 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_ONE_in_spelled_one_to_thirty_one3338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FIRST_in_spelled_first_to_thirty_first3361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SECOND_in_spelled_first_to_thirty_first3378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIRD_in_spelled_first_to_thirty_first3394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOURTH_in_spelled_first_to_thirty_first3411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FIFTH_in_spelled_first_to_thirty_first3427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SIXTH_in_spelled_first_to_thirty_first3444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEVENTH_in_spelled_first_to_thirty_first3461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EIGHTH_in_spelled_first_to_thirty_first3476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NINTH_in_spelled_first_to_thirty_first3492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TENTH_in_spelled_first_to_thirty_first3509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELEVENTH_in_spelled_first_to_thirty_first3526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWELFTH_in_spelled_first_to_thirty_first3540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIRTEENTH_in_spelled_first_to_thirty_first3555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOURTEENTH_in_spelled_first_to_thirty_first3567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FIFTEENTH_in_spelled_first_to_thirty_first3579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SIXTEENTH_in_spelled_first_to_thirty_first3592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEVENTEENTH_in_spelled_first_to_thirty_first3605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EIGHTEENTH_in_spelled_first_to_thirty_first3616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NINETEENTH_in_spelled_first_to_thirty_first3628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTIETH_in_spelled_first_to_thirty_first3640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_FIRST_in_spelled_first_to_thirty_first3654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_first_to_thirty_first3661 = new BitSet(new long[]{0x0001200000200000L});
    public static final BitSet FOLLOW_DASH_in_spelled_first_to_thirty_first3664 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_spelled_first_to_thirty_first3668 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_FIRST_in_spelled_first_to_thirty_first3672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_SECOND_in_spelled_first_to_thirty_first3688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_first_to_thirty_first3694 = new BitSet(new long[]{0x0002200000200000L});
    public static final BitSet FOLLOW_DASH_in_spelled_first_to_thirty_first3697 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_spelled_first_to_thirty_first3701 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_SECOND_in_spelled_first_to_thirty_first3705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_THIRD_in_spelled_first_to_thirty_first3720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_first_to_thirty_first3727 = new BitSet(new long[]{0x0004200000200000L});
    public static final BitSet FOLLOW_DASH_in_spelled_first_to_thirty_first3730 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_spelled_first_to_thirty_first3734 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_THIRD_in_spelled_first_to_thirty_first3738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_FOURTH_in_spelled_first_to_thirty_first3754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_first_to_thirty_first3760 = new BitSet(new long[]{0x0008200000200000L});
    public static final BitSet FOLLOW_DASH_in_spelled_first_to_thirty_first3763 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_spelled_first_to_thirty_first3767 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_FOURTH_in_spelled_first_to_thirty_first3771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_FIFTH_in_spelled_first_to_thirty_first3786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_first_to_thirty_first3793 = new BitSet(new long[]{0x0010200000200000L});
    public static final BitSet FOLLOW_DASH_in_spelled_first_to_thirty_first3796 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_spelled_first_to_thirty_first3800 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_FIFTH_in_spelled_first_to_thirty_first3804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_SIXTH_in_spelled_first_to_thirty_first3820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_first_to_thirty_first3827 = new BitSet(new long[]{0x0000200000200000L,0x0000400000000000L});
    public static final BitSet FOLLOW_DASH_in_spelled_first_to_thirty_first3830 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_spelled_first_to_thirty_first3834 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_SIXTH_in_spelled_first_to_thirty_first3838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_SEVENTH_in_spelled_first_to_thirty_first3854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_first_to_thirty_first3859 = new BitSet(new long[]{0x0000200000200000L,0x0000800000000000L});
    public static final BitSet FOLLOW_DASH_in_spelled_first_to_thirty_first3862 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_spelled_first_to_thirty_first3866 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_SEVENTH_in_spelled_first_to_thirty_first3870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_EIGHTH_in_spelled_first_to_thirty_first3884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_first_to_thirty_first3890 = new BitSet(new long[]{0x0000200000200000L,0x0001000000000000L});
    public static final BitSet FOLLOW_DASH_in_spelled_first_to_thirty_first3893 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_spelled_first_to_thirty_first3897 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_EIGHTH_in_spelled_first_to_thirty_first3901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_NINTH_in_spelled_first_to_thirty_first3916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_first_to_thirty_first3923 = new BitSet(new long[]{0x0000200000200000L,0x0002000000000000L});
    public static final BitSet FOLLOW_DASH_in_spelled_first_to_thirty_first3926 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_spelled_first_to_thirty_first3930 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_NINTH_in_spelled_first_to_thirty_first3934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIRTIETH_in_spelled_first_to_thirty_first3949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIRTY_FIRST_in_spelled_first_to_thirty_first4009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIRTY_in_spelled_first_to_thirty_first4016 = new BitSet(new long[]{0x0001200000200000L});
    public static final BitSet FOLLOW_DASH_in_spelled_first_to_thirty_first4019 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_spelled_first_to_thirty_first4023 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_FIRST_in_spelled_first_to_thirty_first4027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_date_in_synpred1_Date172 = new BitSet(new long[]{0x0000000000A00002L});
    public static final BitSet FOLLOW_date_time_separator_in_synpred1_Date175 = new BitSet(new long[]{0x0000800000000000L,0x00000000003F8000L});
    public static final BitSet FOLLOW_time_in_synpred1_Date177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relaxed_date_in_synpred2_Date338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THE_in_synpred3_Date544 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_synpred3_Date546 = new BitSet(new long[]{0x001F800002000000L,0xFFFFFFFFFE780000L,0x00000000000000FFL});
    public static final BitSet FOLLOW_relaxed_day_of_month_in_synpred3_Date550 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_synpred3_Date552 = new BitSet(new long[]{0x000003FFE0000000L});
    public static final BitSet FOLLOW_OF_in_synpred3_Date555 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_synpred3_Date557 = new BitSet(new long[]{0x000003FFC0000000L});
    public static final BitSet FOLLOW_relaxed_month_in_synpred3_Date561 = new BitSet(new long[]{0x0000000000A00000L});
    public static final BitSet FOLLOW_relaxed_year_prefix_in_synpred3_Date563 = new BitSet(new long[]{0x0000040000000000L,0x0000000001F40000L});
    public static final BitSet FOLLOW_relaxed_year_in_synpred3_Date565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relaxed_month_in_synpred4_Date615 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_synpred4_Date617 = new BitSet(new long[]{0x001F800002000000L,0xFFFFFFFFFE780000L,0x00000000000000FFL});
    public static final BitSet FOLLOW_relaxed_day_of_month_in_synpred4_Date619 = new BitSet(new long[]{0x0000000000A00000L});
    public static final BitSet FOLLOW_relaxed_year_prefix_in_synpred4_Date621 = new BitSet(new long[]{0x0000040000000000L,0x0000000001F40000L});
    public static final BitSet FOLLOW_relaxed_year_in_synpred4_Date623 = new BitSet(new long[]{0x0000000000000002L});

}