// $ANTLR 3.2 Sep 23, 2009 12:02:23 /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g 2010-02-12 13:42:30
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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "INT", "MONTH_OF_YEAR", "DAY_OF_MONTH", "DAY_OF_WEEK", "YEAR_OF", "DATE_TIME", "EXPLICIT_DATE", "RELATIVE_DATE", "SEEK", "DIRECTION", "SEEK_BY", "SPAN", "WEEK_INDEX", "EXPLICIT_TIME", "HOURS_OF_DAY", "MINUTES_OF_HOUR", "AM_PM", "ZONE", "WHITE_SPACE", "AT", "COMMA", "ON", "THE", "DAY", "AFTER", "BEFORE", "OF", "JANUARY", "FEBRUARY", "MARCH", "APRIL", "MAY", "JUNE", "JULY", "AUGUST", "SEPTEMBER", "OCTOBER", "NOVEMBER", "DECEMBER", "SINGLE_QUOTE", "IN", "YEAR", "DASH", "SLASH", "INT_1_TO_5", "FIRST", "SECOND", "THIRD", "FOURTH", "FIFTH", "LAST", "THIS", "NEXT", "PAST", "COMING", "UPCOMING", "FROM", "NOW", "AGO", "WEEK", "MONTH", "SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY", "TODAY", "TOMORROW", "YESTERDAY", "COLON", "MILITARY_HOUR_SUFFIX", "HOUR", "AM", "PM", "NOON", "MIDNIGHT", "UTC", "EST", "CST", "PST", "MST", "AKST", "HAST", "INT_0", "INT_00", "INT_6_TO_9", "INT_01_TO_12", "INT_13_TO_23", "INT_24_TO_31", "INT_32_TO_59", "INT_60_TO_99", "ONE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", "NINE", "TEN", "ELEVEN", "TWELVE", "THIRTEEN", "FOURTEEN", "FIFTEEN", "SIXTEEN", "SEVENTEEN", "EIGHTEEN", "NINETEEN", "TWENTY", "THIRTY", "SIXTH", "SEVENTH", "EIGHTH", "NINTH", "TENTH", "ELEVENTH", "TWELFTH", "THIRTEENTH", "FOURTEENTH", "FIFTEENTH", "SIXTEENTH", "SEVENTEENTH", "EIGHTEENTH", "NINETEENTH", "TWENTIETH", "TWENTY_FIRST", "TWENTY_SECOND", "TWENTY_THIRD", "TWENTY_FOURTH", "TWENTY_FIFTH", "TWENTY_SIXTH", "TWENTY_SEVENTH", "TWENTY_EIGHTH", "TWENTY_NINTH", "THIRTIETH", "THIRTY_FIRST", "DOT", "UNKNOWN"
    };
    public static final int DIRECTION=13;
    public static final int NINETEEN=115;
    public static final int SEPTEMBER=39;
    public static final int WEEK=63;
    public static final int INT_24_TO_31=94;
    public static final int WEDNESDAY=68;
    public static final int TWENTY_EIGHTH=140;
    public static final int TWENTY=116;
    public static final int INT_00=90;
    public static final int JULY=37;
    public static final int APRIL=34;
    public static final int COMING=58;
    public static final int NINETEENTH=131;
    public static final int OCTOBER=40;
    public static final int NOW=61;
    public static final int ONE=97;
    public static final int DAY=27;
    public static final int MIDNIGHT=81;
    public static final int MARCH=33;
    public static final int EOF=-1;
    public static final int MONTH=64;
    public static final int PAST=57;
    public static final int SEVENTEEN=113;
    public static final int DATE_TIME=9;
    public static final int AM_PM=20;
    public static final int TWENTY_SEVENTH=139;
    public static final int TWENTY_FIFTH=137;
    public static final int EIGHTEENTH=130;
    public static final int MINUTES_OF_HOUR=19;
    public static final int SPAN=15;
    public static final int THIS=55;
    public static final int THIRTIETH=142;
    public static final int NOON=80;
    public static final int INT_60_TO_99=96;
    public static final int LAST=54;
    public static final int EIGHTEEN=114;
    public static final int INT_01_TO_12=92;
    public static final int RELATIVE_DATE=11;
    public static final int TOMORROW=73;
    public static final int FIFTEENTH=127;
    public static final int FOURTH=52;
    public static final int TODAY=72;
    public static final int SECOND=50;
    public static final int NOVEMBER=41;
    public static final int SATURDAY=71;
    public static final int FOUR=100;
    public static final int MONTH_OF_YEAR=5;
    public static final int SEVENTH=119;
    public static final int TEN=106;
    public static final int FEBRUARY=32;
    public static final int ON=25;
    public static final int MONDAY=66;
    public static final int THIRTEEN=109;
    public static final int ELEVEN=107;
    public static final int SEVEN=103;
    public static final int DAY_OF_WEEK=7;
    public static final int SUNDAY=65;
    public static final int JUNE=36;
    public static final int INT=4;
    public static final int EXPLICIT_DATE=10;
    public static final int OF=30;
    public static final int SIX=102;
    public static final int UPCOMING=59;
    public static final int FIFTH=53;
    public static final int TWENTY_NINTH=141;
    public static final int THURSDAY=69;
    public static final int DECEMBER=42;
    public static final int SEEK_BY=14;
    public static final int AUGUST=38;
    public static final int PM=79;
    public static final int EXPLICIT_TIME=17;
    public static final int FROM=60;
    public static final int TUESDAY=67;
    public static final int EIGHTH=120;
    public static final int HOURS_OF_DAY=18;
    public static final int THIRD=51;
    public static final int YEAR=45;
    public static final int THE=26;
    public static final int TENTH=122;
    public static final int MAY=35;
    public static final int TWENTY_FOURTH=136;
    public static final int UTC=82;
    public static final int WHITE_SPACE=22;
    public static final int AKST=87;
    public static final int MST=86;
    public static final int EIGHT=104;
    public static final int FRIDAY=70;
    public static final int INT_0=89;
    public static final int TWENTY_SIXTH=138;
    public static final int AT=23;
    public static final int CST=84;
    public static final int SINGLE_QUOTE=43;
    public static final int SLASH=47;
    public static final int IN=44;
    public static final int PST=85;
    public static final int UNKNOWN=145;
    public static final int NINTH=121;
    public static final int COMMA=24;
    public static final int FIVE=101;
    public static final int ZONE=21;
    public static final int THIRTY=117;
    public static final int TWENTIETH=132;
    public static final int TWENTY_SECOND=134;
    public static final int NEXT=56;
    public static final int DOT=144;
    public static final int INT_13_TO_23=93;
    public static final int MILITARY_HOUR_SUFFIX=76;
    public static final int INT_32_TO_59=95;
    public static final int EST=83;
    public static final int AM=78;
    public static final int HAST=88;
    public static final int DASH=46;
    public static final int FOURTEENTH=126;
    public static final int SIXTEEN=112;
    public static final int INT_6_TO_9=91;
    public static final int YEAR_OF=8;
    public static final int TWELVE=108;
    public static final int WEEK_INDEX=16;
    public static final int AGO=62;
    public static final int ELEVENTH=123;
    public static final int BEFORE=29;
    public static final int TWO=98;
    public static final int AFTER=28;
    public static final int INT_1_TO_5=48;
    public static final int HOUR=77;
    public static final int SIXTEENTH=128;
    public static final int JANUARY=31;
    public static final int THIRTEENTH=125;
    public static final int SEEK=12;
    public static final int COLON=75;
    public static final int DAY_OF_MONTH=6;
    public static final int FIFTEEN=111;
    public static final int TWELFTH=124;
    public static final int NINE=105;
    public static final int SIXTH=118;
    public static final int TWENTY_FIRST=133;
    public static final int THREE=99;
    public static final int FOURTEEN=110;
    public static final int TWENTY_THIRD=135;
    public static final int YESTERDAY=74;
    public static final int SEVENTEENTH=129;
    public static final int THIRTY_FIRST=143;
    public static final int FIRST=49;

    // delegates
    // delegators

    public static final String[] ruleNames = new String[] {
        "invalidRule", "synpred1_Date", "int_four_digits", "relaxed_date", 
        "synpred4_Date", "spelled_or_int_01_to_31_optional_prefix", "search", 
        "formal_day_of_month", "formal_year_four_digits", "relaxed_year_prefix", 
        "formal_month_of_year", "formal_date_separator", "formal_year", 
        "relative_date", "named_time", "date", "time", "named_relative_date", 
        "synpred3_Date", "relative_prefix", "minutes", "spelled_one_to_thirty_one", 
        "implicit_prefix", "int_00_to_23_optional_prefix", "spelled_first_to_thirty_first", 
        "date_time", "relative_date_span", "prefix_direction", "global_date_prefix", 
        "relaxed_year", "formal_date", "time_date_separator", "day_of_week", 
        "hours", "relaxed_month", "int_00_to_59_mandatory_prefix", "time_zone_abbreviation", 
        "meridian_indicator", "relative_occurrence_index", "synpred2_Date", 
        "date_time_separator", "relative_suffix", "relaxed_day_of_month", 
        "int_01_to_12_optional_prefix", "int_00_to_99_mandatory_prefix", 
        "int_01_to_31_optional_prefix", "relative_target"
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
    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:34:1: search : date_time ;
    public final DateParser.search_return search() throws RecognitionException {
        DateParser.search_return retval = new DateParser.search_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        DateParser.date_time_return date_time1 = null;



        try { dbg.enterRule(getGrammarFileName(), "search");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(34, 1);

        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:35:3: ( date_time )
            dbg.enterAlt(1);

            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:35:5: date_time
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(35,5);
            pushFollow(FOLLOW_date_time_in_search147);
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
        dbg.location(36, 3);

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
    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:42:1: date_time : ( ( date ( date_time_separator time )? )=> date ( date_time_separator time )? | time ( time_date_separator date )? ) -> ^( DATE_TIME ( date )? ( time )? ) ;
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
        dbg.location(42, 1);

        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:43:3: ( ( ( date ( date_time_separator time )? )=> date ( date_time_separator time )? | time ( time_date_separator date )? ) -> ^( DATE_TIME ( date )? ( time )? ) )
            dbg.enterAlt(1);

            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:43:5: ( ( date ( date_time_separator time )? )=> date ( date_time_separator time )? | time ( time_date_separator date )? )
            {
            dbg.location(43,5);
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:43:5: ( ( date ( date_time_separator time )? )=> date ( date_time_separator time )? | time ( time_date_separator date )? )
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

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:44:7: ( date ( date_time_separator time )? )=> date ( date_time_separator time )?
                    {
                    dbg.location(45,9);
                    pushFollow(FOLLOW_date_in_date_time196);
                    date2=date();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_date.add(date2.getTree());
                    dbg.location(45,14);
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:45:14: ( date_time_separator time )?
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

                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:45:15: date_time_separator time
                            {
                            dbg.location(45,15);
                            pushFollow(FOLLOW_date_time_separator_in_date_time199);
                            date_time_separator3=date_time_separator();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_date_time_separator.add(date_time_separator3.getTree());
                            dbg.location(45,35);
                            pushFollow(FOLLOW_time_in_date_time201);
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

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:47:9: time ( time_date_separator date )?
                    {
                    dbg.location(47,9);
                    pushFollow(FOLLOW_time_in_date_time220);
                    time5=time();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_time.add(time5.getTree());
                    dbg.location(47,14);
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:47:14: ( time_date_separator date )?
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

                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:47:15: time_date_separator date
                            {
                            dbg.location(47,15);
                            pushFollow(FOLLOW_time_date_separator_in_date_time223);
                            time_date_separator6=time_date_separator();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_time_date_separator.add(time_date_separator6.getTree());
                            dbg.location(47,35);
                            pushFollow(FOLLOW_date_in_date_time225);
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
            // 48:7: -> ^( DATE_TIME ( date )? ( time )? )
            {
                dbg.location(48,10);
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:48:10: ^( DATE_TIME ( date )? ( time )? )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(48,12);
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DATE_TIME, "DATE_TIME"), root_1);

                dbg.location(48,22);
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:48:22: ( date )?
                if ( stream_date.hasNext() ) {
                    dbg.location(48,22);
                    adaptor.addChild(root_1, stream_date.nextTree());

                }
                stream_date.reset();
                dbg.location(48,28);
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:48:28: ( time )?
                if ( stream_time.hasNext() ) {
                    dbg.location(48,28);
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
        dbg.location(49, 3);

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
    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:56:1: date_time_separator : ( WHITE_SPACE ( AT WHITE_SPACE )? | COMMA ( WHITE_SPACE )? ( AT WHITE_SPACE )? );
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
        dbg.location(56, 1);

        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:57:3: ( WHITE_SPACE ( AT WHITE_SPACE )? | COMMA ( WHITE_SPACE )? ( AT WHITE_SPACE )? )
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

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:57:5: WHITE_SPACE ( AT WHITE_SPACE )?
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(57,5);
                    WHITE_SPACE8=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_date_time_separator268); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    WHITE_SPACE8_tree = (Object)adaptor.create(WHITE_SPACE8);
                    adaptor.addChild(root_0, WHITE_SPACE8_tree);
                    }
                    dbg.location(57,17);
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:57:17: ( AT WHITE_SPACE )?
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

                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:57:18: AT WHITE_SPACE
                            {
                            dbg.location(57,18);
                            AT9=(Token)match(input,AT,FOLLOW_AT_in_date_time_separator271); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            AT9_tree = (Object)adaptor.create(AT9);
                            adaptor.addChild(root_0, AT9_tree);
                            }
                            dbg.location(57,21);
                            WHITE_SPACE10=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_date_time_separator273); if (state.failed) return retval;
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

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:58:5: COMMA ( WHITE_SPACE )? ( AT WHITE_SPACE )?
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(58,5);
                    COMMA11=(Token)match(input,COMMA,FOLLOW_COMMA_in_date_time_separator281); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    COMMA11_tree = (Object)adaptor.create(COMMA11);
                    adaptor.addChild(root_0, COMMA11_tree);
                    }
                    dbg.location(58,11);
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:58:11: ( WHITE_SPACE )?
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

                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:58:11: WHITE_SPACE
                            {
                            dbg.location(58,11);
                            WHITE_SPACE12=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_date_time_separator283); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            WHITE_SPACE12_tree = (Object)adaptor.create(WHITE_SPACE12);
                            adaptor.addChild(root_0, WHITE_SPACE12_tree);
                            }

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(5);}

                    dbg.location(58,24);
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:58:24: ( AT WHITE_SPACE )?
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

                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:58:25: AT WHITE_SPACE
                            {
                            dbg.location(58,25);
                            AT13=(Token)match(input,AT,FOLLOW_AT_in_date_time_separator287); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            AT13_tree = (Object)adaptor.create(AT13);
                            adaptor.addChild(root_0, AT13_tree);
                            }
                            dbg.location(58,28);
                            WHITE_SPACE14=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_date_time_separator289); if (state.failed) return retval;
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
        dbg.location(59, 3);

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
    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:61:1: time_date_separator : ( WHITE_SPACE ( ON WHITE_SPACE )? | COMMA ( WHITE_SPACE )? ( ON WHITE_SPACE )? );
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
        dbg.location(61, 1);

        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:62:3: ( WHITE_SPACE ( ON WHITE_SPACE )? | COMMA ( WHITE_SPACE )? ( ON WHITE_SPACE )? )
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

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:62:5: WHITE_SPACE ( ON WHITE_SPACE )?
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(62,5);
                    WHITE_SPACE15=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_time_date_separator306); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    WHITE_SPACE15_tree = (Object)adaptor.create(WHITE_SPACE15);
                    adaptor.addChild(root_0, WHITE_SPACE15_tree);
                    }
                    dbg.location(62,17);
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:62:17: ( ON WHITE_SPACE )?
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

                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:62:18: ON WHITE_SPACE
                            {
                            dbg.location(62,18);
                            ON16=(Token)match(input,ON,FOLLOW_ON_in_time_date_separator309); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            ON16_tree = (Object)adaptor.create(ON16);
                            adaptor.addChild(root_0, ON16_tree);
                            }
                            dbg.location(62,21);
                            WHITE_SPACE17=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_time_date_separator311); if (state.failed) return retval;
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

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:63:5: COMMA ( WHITE_SPACE )? ( ON WHITE_SPACE )?
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(63,5);
                    COMMA18=(Token)match(input,COMMA,FOLLOW_COMMA_in_time_date_separator319); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    COMMA18_tree = (Object)adaptor.create(COMMA18);
                    adaptor.addChild(root_0, COMMA18_tree);
                    }
                    dbg.location(63,11);
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:63:11: ( WHITE_SPACE )?
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

                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:63:11: WHITE_SPACE
                            {
                            dbg.location(63,11);
                            WHITE_SPACE19=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_time_date_separator321); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            WHITE_SPACE19_tree = (Object)adaptor.create(WHITE_SPACE19);
                            adaptor.addChild(root_0, WHITE_SPACE19_tree);
                            }

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(9);}

                    dbg.location(63,24);
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:63:24: ( ON WHITE_SPACE )?
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

                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:63:25: ON WHITE_SPACE
                            {
                            dbg.location(63,25);
                            ON20=(Token)match(input,ON,FOLLOW_ON_in_time_date_separator325); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            ON20_tree = (Object)adaptor.create(ON20);
                            adaptor.addChild(root_0, ON20_tree);
                            }
                            dbg.location(63,28);
                            WHITE_SPACE21=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_time_date_separator327); if (state.failed) return retval;
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
        dbg.location(64, 3);

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
    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:66:1: date : ( ( relaxed_date )=> relaxed_date | formal_date | relative_date | global_date_prefix date -> ^( RELATIVE_DATE ^( SEEK global_date_prefix date ) ) );
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
        dbg.location(66, 1);

        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:67:3: ( ( relaxed_date )=> relaxed_date | formal_date | relative_date | global_date_prefix date -> ^( RELATIVE_DATE ^( SEEK global_date_prefix date ) ) )
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

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:67:5: ( relaxed_date )=> relaxed_date
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(67,22);
                    pushFollow(FOLLOW_relaxed_date_in_date347);
                    relaxed_date22=relaxed_date();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, relaxed_date22.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:68:5: formal_date
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(68,5);
                    pushFollow(FOLLOW_formal_date_in_date353);
                    formal_date23=formal_date();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, formal_date23.getTree());

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:69:5: relative_date
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(69,5);
                    pushFollow(FOLLOW_relative_date_in_date359);
                    relative_date24=relative_date();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, relative_date24.getTree());

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:70:5: global_date_prefix date
                    {
                    dbg.location(70,5);
                    pushFollow(FOLLOW_global_date_prefix_in_date365);
                    global_date_prefix25=global_date_prefix();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_global_date_prefix.add(global_date_prefix25.getTree());
                    dbg.location(70,24);
                    pushFollow(FOLLOW_date_in_date367);
                    date26=date();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_date.add(date26.getTree());


                    // AST REWRITE
                    // elements: date, global_date_prefix
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 71:7: -> ^( RELATIVE_DATE ^( SEEK global_date_prefix date ) )
                    {
                        dbg.location(71,10);
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:71:10: ^( RELATIVE_DATE ^( SEEK global_date_prefix date ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(71,12);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(RELATIVE_DATE, "RELATIVE_DATE"), root_1);

                        dbg.location(71,26);
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:71:26: ^( SEEK global_date_prefix date )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        dbg.location(71,28);
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(SEEK, "SEEK"), root_2);

                        dbg.location(71,33);
                        adaptor.addChild(root_2, stream_global_date_prefix.nextTree());
                        dbg.location(71,52);
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
        dbg.location(72, 3);

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
    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:74:1: global_date_prefix : ( ( THE WHITE_SPACE )? DAY WHITE_SPACE prefix_direction WHITE_SPACE -> prefix_direction SEEK_BY[\"by_day\"] INT[\"1\"] | spelled_or_int_01_to_31_optional_prefix WHITE_SPACE DAY WHITE_SPACE prefix_direction WHITE_SPACE -> prefix_direction SEEK_BY[\"by_day\"] spelled_or_int_01_to_31_optional_prefix );
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
        dbg.location(74, 1);

        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:75:3: ( ( THE WHITE_SPACE )? DAY WHITE_SPACE prefix_direction WHITE_SPACE -> prefix_direction SEEK_BY[\"by_day\"] INT[\"1\"] | spelled_or_int_01_to_31_optional_prefix WHITE_SPACE DAY WHITE_SPACE prefix_direction WHITE_SPACE -> prefix_direction SEEK_BY[\"by_day\"] spelled_or_int_01_to_31_optional_prefix )
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

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:75:5: ( THE WHITE_SPACE )? DAY WHITE_SPACE prefix_direction WHITE_SPACE
                    {
                    dbg.location(75,5);
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:75:5: ( THE WHITE_SPACE )?
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

                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:75:6: THE WHITE_SPACE
                            {
                            dbg.location(75,6);
                            THE27=(Token)match(input,THE,FOLLOW_THE_in_global_date_prefix404); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_THE.add(THE27);

                            dbg.location(75,10);
                            WHITE_SPACE28=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_global_date_prefix406); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE28);


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(13);}

                    dbg.location(75,24);
                    DAY29=(Token)match(input,DAY,FOLLOW_DAY_in_global_date_prefix410); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DAY.add(DAY29);

                    dbg.location(75,28);
                    WHITE_SPACE30=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_global_date_prefix412); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE30);

                    dbg.location(75,40);
                    pushFollow(FOLLOW_prefix_direction_in_global_date_prefix414);
                    prefix_direction31=prefix_direction();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_prefix_direction.add(prefix_direction31.getTree());
                    dbg.location(75,57);
                    WHITE_SPACE32=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_global_date_prefix416); if (state.failed) return retval; 
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
                    // 76:7: -> prefix_direction SEEK_BY[\"by_day\"] INT[\"1\"]
                    {
                        dbg.location(76,10);
                        adaptor.addChild(root_0, stream_prefix_direction.nextTree());
                        dbg.location(76,27);
                        adaptor.addChild(root_0, (Object)adaptor.create(SEEK_BY, "by_day"));
                        dbg.location(76,45);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "1"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:78:5: spelled_or_int_01_to_31_optional_prefix WHITE_SPACE DAY WHITE_SPACE prefix_direction WHITE_SPACE
                    {
                    dbg.location(78,5);
                    pushFollow(FOLLOW_spelled_or_int_01_to_31_optional_prefix_in_global_date_prefix442);
                    spelled_or_int_01_to_31_optional_prefix33=spelled_or_int_01_to_31_optional_prefix();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_spelled_or_int_01_to_31_optional_prefix.add(spelled_or_int_01_to_31_optional_prefix33.getTree());
                    dbg.location(78,45);
                    WHITE_SPACE34=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_global_date_prefix444); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE34);

                    dbg.location(78,57);
                    DAY35=(Token)match(input,DAY,FOLLOW_DAY_in_global_date_prefix446); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DAY.add(DAY35);

                    dbg.location(78,61);
                    WHITE_SPACE36=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_global_date_prefix448); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE36);

                    dbg.location(78,73);
                    pushFollow(FOLLOW_prefix_direction_in_global_date_prefix450);
                    prefix_direction37=prefix_direction();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_prefix_direction.add(prefix_direction37.getTree());
                    dbg.location(78,90);
                    WHITE_SPACE38=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_global_date_prefix452); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE38);



                    // AST REWRITE
                    // elements: prefix_direction, spelled_or_int_01_to_31_optional_prefix
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 79:7: -> prefix_direction SEEK_BY[\"by_day\"] spelled_or_int_01_to_31_optional_prefix
                    {
                        dbg.location(79,10);
                        adaptor.addChild(root_0, stream_prefix_direction.nextTree());
                        dbg.location(79,27);
                        adaptor.addChild(root_0, (Object)adaptor.create(SEEK_BY, "by_day"));
                        dbg.location(79,45);
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
        dbg.location(80, 3);

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
    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:82:1: prefix_direction : ( AFTER -> DIRECTION[\">\"] | BEFORE -> DIRECTION[\"<\"] );
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
        dbg.location(82, 1);

        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:83:3: ( AFTER -> DIRECTION[\">\"] | BEFORE -> DIRECTION[\"<\"] )
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

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:83:5: AFTER
                    {
                    dbg.location(83,5);
                    AFTER39=(Token)match(input,AFTER,FOLLOW_AFTER_in_prefix_direction483); if (state.failed) return retval; 
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
                    // 83:12: -> DIRECTION[\">\"]
                    {
                        dbg.location(83,15);
                        adaptor.addChild(root_0, (Object)adaptor.create(DIRECTION, ">"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:84:5: BEFORE
                    {
                    dbg.location(84,5);
                    BEFORE40=(Token)match(input,BEFORE,FOLLOW_BEFORE_in_prefix_direction495); if (state.failed) return retval; 
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
                    // 84:12: -> DIRECTION[\"<\"]
                    {
                        dbg.location(84,15);
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
        dbg.location(85, 3);

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
    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:90:1: relaxed_date : ( ( ( THE WHITE_SPACE )? relaxed_day_of_month WHITE_SPACE ( OF WHITE_SPACE )? relaxed_month relaxed_year_prefix relaxed_year )=> ( THE WHITE_SPACE )? relaxed_day_of_month WHITE_SPACE ( OF WHITE_SPACE )? relaxed_month relaxed_year_prefix relaxed_year | ( relaxed_month WHITE_SPACE relaxed_day_of_month relaxed_year_prefix relaxed_year )=> relaxed_month WHITE_SPACE relaxed_day_of_month relaxed_year_prefix relaxed_year | ( THE WHITE_SPACE )? relaxed_day_of_month WHITE_SPACE ( OF WHITE_SPACE )? relaxed_month | ( THE WHITE_SPACE )? relaxed_month WHITE_SPACE relaxed_day_of_month ) -> ^( EXPLICIT_DATE relaxed_month relaxed_day_of_month ( relaxed_year )? ) ;
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
        dbg.location(90, 1);

        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:91:3: ( ( ( ( THE WHITE_SPACE )? relaxed_day_of_month WHITE_SPACE ( OF WHITE_SPACE )? relaxed_month relaxed_year_prefix relaxed_year )=> ( THE WHITE_SPACE )? relaxed_day_of_month WHITE_SPACE ( OF WHITE_SPACE )? relaxed_month relaxed_year_prefix relaxed_year | ( relaxed_month WHITE_SPACE relaxed_day_of_month relaxed_year_prefix relaxed_year )=> relaxed_month WHITE_SPACE relaxed_day_of_month relaxed_year_prefix relaxed_year | ( THE WHITE_SPACE )? relaxed_day_of_month WHITE_SPACE ( OF WHITE_SPACE )? relaxed_month | ( THE WHITE_SPACE )? relaxed_month WHITE_SPACE relaxed_day_of_month ) -> ^( EXPLICIT_DATE relaxed_month relaxed_day_of_month ( relaxed_year )? ) )
            dbg.enterAlt(1);

            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:91:5: ( ( ( THE WHITE_SPACE )? relaxed_day_of_month WHITE_SPACE ( OF WHITE_SPACE )? relaxed_month relaxed_year_prefix relaxed_year )=> ( THE WHITE_SPACE )? relaxed_day_of_month WHITE_SPACE ( OF WHITE_SPACE )? relaxed_month relaxed_year_prefix relaxed_year | ( relaxed_month WHITE_SPACE relaxed_day_of_month relaxed_year_prefix relaxed_year )=> relaxed_month WHITE_SPACE relaxed_day_of_month relaxed_year_prefix relaxed_year | ( THE WHITE_SPACE )? relaxed_day_of_month WHITE_SPACE ( OF WHITE_SPACE )? relaxed_month | ( THE WHITE_SPACE )? relaxed_month WHITE_SPACE relaxed_day_of_month )
            {
            dbg.location(91,5);
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:91:5: ( ( ( THE WHITE_SPACE )? relaxed_day_of_month WHITE_SPACE ( OF WHITE_SPACE )? relaxed_month relaxed_year_prefix relaxed_year )=> ( THE WHITE_SPACE )? relaxed_day_of_month WHITE_SPACE ( OF WHITE_SPACE )? relaxed_month relaxed_year_prefix relaxed_year | ( relaxed_month WHITE_SPACE relaxed_day_of_month relaxed_year_prefix relaxed_year )=> relaxed_month WHITE_SPACE relaxed_day_of_month relaxed_year_prefix relaxed_year | ( THE WHITE_SPACE )? relaxed_day_of_month WHITE_SPACE ( OF WHITE_SPACE )? relaxed_month | ( THE WHITE_SPACE )? relaxed_month WHITE_SPACE relaxed_day_of_month )
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

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:95:7: ( ( THE WHITE_SPACE )? relaxed_day_of_month WHITE_SPACE ( OF WHITE_SPACE )? relaxed_month relaxed_year_prefix relaxed_year )=> ( THE WHITE_SPACE )? relaxed_day_of_month WHITE_SPACE ( OF WHITE_SPACE )? relaxed_month relaxed_year_prefix relaxed_year
                    {
                    dbg.location(96,9);
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:96:9: ( THE WHITE_SPACE )?
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

                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:96:10: THE WHITE_SPACE
                            {
                            dbg.location(96,10);
                            THE41=(Token)match(input,THE,FOLLOW_THE_in_relaxed_date583); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_THE.add(THE41);

                            dbg.location(96,14);
                            WHITE_SPACE42=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_relaxed_date585); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE42);


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(16);}

                    dbg.location(96,28);
                    pushFollow(FOLLOW_relaxed_day_of_month_in_relaxed_date589);
                    relaxed_day_of_month43=relaxed_day_of_month();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_relaxed_day_of_month.add(relaxed_day_of_month43.getTree());
                    dbg.location(96,49);
                    WHITE_SPACE44=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_relaxed_date591); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE44);

                    dbg.location(96,61);
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:96:61: ( OF WHITE_SPACE )?
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

                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:96:62: OF WHITE_SPACE
                            {
                            dbg.location(96,62);
                            OF45=(Token)match(input,OF,FOLLOW_OF_in_relaxed_date594); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_OF.add(OF45);

                            dbg.location(96,65);
                            WHITE_SPACE46=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_relaxed_date596); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE46);


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(17);}

                    dbg.location(96,79);
                    pushFollow(FOLLOW_relaxed_month_in_relaxed_date600);
                    relaxed_month47=relaxed_month();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_relaxed_month.add(relaxed_month47.getTree());
                    dbg.location(96,93);
                    pushFollow(FOLLOW_relaxed_year_prefix_in_relaxed_date602);
                    relaxed_year_prefix48=relaxed_year_prefix();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_relaxed_year_prefix.add(relaxed_year_prefix48.getTree());
                    dbg.location(96,113);
                    pushFollow(FOLLOW_relaxed_year_in_relaxed_date604);
                    relaxed_year49=relaxed_year();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_relaxed_year.add(relaxed_year49.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:98:9: ( relaxed_month WHITE_SPACE relaxed_day_of_month relaxed_year_prefix relaxed_year )=> relaxed_month WHITE_SPACE relaxed_day_of_month relaxed_year_prefix relaxed_year
                    {
                    dbg.location(99,9);
                    pushFollow(FOLLOW_relaxed_month_in_relaxed_date640);
                    relaxed_month50=relaxed_month();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_relaxed_month.add(relaxed_month50.getTree());
                    dbg.location(99,23);
                    WHITE_SPACE51=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_relaxed_date642); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE51);

                    dbg.location(99,35);
                    pushFollow(FOLLOW_relaxed_day_of_month_in_relaxed_date644);
                    relaxed_day_of_month52=relaxed_day_of_month();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_relaxed_day_of_month.add(relaxed_day_of_month52.getTree());
                    dbg.location(99,56);
                    pushFollow(FOLLOW_relaxed_year_prefix_in_relaxed_date646);
                    relaxed_year_prefix53=relaxed_year_prefix();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_relaxed_year_prefix.add(relaxed_year_prefix53.getTree());
                    dbg.location(99,76);
                    pushFollow(FOLLOW_relaxed_year_in_relaxed_date648);
                    relaxed_year54=relaxed_year();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_relaxed_year.add(relaxed_year54.getTree());

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:101:9: ( THE WHITE_SPACE )? relaxed_day_of_month WHITE_SPACE ( OF WHITE_SPACE )? relaxed_month
                    {
                    dbg.location(101,9);
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:101:9: ( THE WHITE_SPACE )?
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

                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:101:10: THE WHITE_SPACE
                            {
                            dbg.location(101,10);
                            THE55=(Token)match(input,THE,FOLLOW_THE_in_relaxed_date664); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_THE.add(THE55);

                            dbg.location(101,14);
                            WHITE_SPACE56=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_relaxed_date666); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE56);


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(18);}

                    dbg.location(101,28);
                    pushFollow(FOLLOW_relaxed_day_of_month_in_relaxed_date670);
                    relaxed_day_of_month57=relaxed_day_of_month();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_relaxed_day_of_month.add(relaxed_day_of_month57.getTree());
                    dbg.location(101,49);
                    WHITE_SPACE58=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_relaxed_date672); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE58);

                    dbg.location(101,61);
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:101:61: ( OF WHITE_SPACE )?
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

                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:101:62: OF WHITE_SPACE
                            {
                            dbg.location(101,62);
                            OF59=(Token)match(input,OF,FOLLOW_OF_in_relaxed_date675); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_OF.add(OF59);

                            dbg.location(101,65);
                            WHITE_SPACE60=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_relaxed_date677); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE60);


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(19);}

                    dbg.location(101,79);
                    pushFollow(FOLLOW_relaxed_month_in_relaxed_date681);
                    relaxed_month61=relaxed_month();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_relaxed_month.add(relaxed_month61.getTree());

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:103:9: ( THE WHITE_SPACE )? relaxed_month WHITE_SPACE relaxed_day_of_month
                    {
                    dbg.location(103,9);
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:103:9: ( THE WHITE_SPACE )?
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

                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:103:10: THE WHITE_SPACE
                            {
                            dbg.location(103,10);
                            THE62=(Token)match(input,THE,FOLLOW_THE_in_relaxed_date699); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_THE.add(THE62);

                            dbg.location(103,14);
                            WHITE_SPACE63=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_relaxed_date701); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE63);


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(20);}

                    dbg.location(103,28);
                    pushFollow(FOLLOW_relaxed_month_in_relaxed_date705);
                    relaxed_month64=relaxed_month();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_relaxed_month.add(relaxed_month64.getTree());
                    dbg.location(103,42);
                    WHITE_SPACE65=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_relaxed_date707); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE65);

                    dbg.location(103,54);
                    pushFollow(FOLLOW_relaxed_day_of_month_in_relaxed_date709);
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
            // 104:7: -> ^( EXPLICIT_DATE relaxed_month relaxed_day_of_month ( relaxed_year )? )
            {
                dbg.location(104,10);
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:104:10: ^( EXPLICIT_DATE relaxed_month relaxed_day_of_month ( relaxed_year )? )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(104,12);
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPLICIT_DATE, "EXPLICIT_DATE"), root_1);

                dbg.location(104,26);
                adaptor.addChild(root_1, stream_relaxed_month.nextTree());
                dbg.location(104,40);
                adaptor.addChild(root_1, stream_relaxed_day_of_month.nextTree());
                dbg.location(104,61);
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:104:61: ( relaxed_year )?
                if ( stream_relaxed_year.hasNext() ) {
                    dbg.location(104,61);
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
        dbg.location(105, 3);

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
    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:107:1: relaxed_month : ( JANUARY -> ^( MONTH_OF_YEAR INT[\"1\"] ) | FEBRUARY -> ^( MONTH_OF_YEAR INT[\"2\"] ) | MARCH -> ^( MONTH_OF_YEAR INT[\"3\"] ) | APRIL -> ^( MONTH_OF_YEAR INT[\"4\"] ) | MAY -> ^( MONTH_OF_YEAR INT[\"5\"] ) | JUNE -> ^( MONTH_OF_YEAR INT[\"6\"] ) | JULY -> ^( MONTH_OF_YEAR INT[\"7\"] ) | AUGUST -> ^( MONTH_OF_YEAR INT[\"8\"] ) | SEPTEMBER -> ^( MONTH_OF_YEAR INT[\"9\"] ) | OCTOBER -> ^( MONTH_OF_YEAR INT[\"10\"] ) | NOVEMBER -> ^( MONTH_OF_YEAR INT[\"11\"] ) | DECEMBER -> ^( MONTH_OF_YEAR INT[\"12\"] ) );
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
        dbg.location(107, 1);

        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:108:3: ( JANUARY -> ^( MONTH_OF_YEAR INT[\"1\"] ) | FEBRUARY -> ^( MONTH_OF_YEAR INT[\"2\"] ) | MARCH -> ^( MONTH_OF_YEAR INT[\"3\"] ) | APRIL -> ^( MONTH_OF_YEAR INT[\"4\"] ) | MAY -> ^( MONTH_OF_YEAR INT[\"5\"] ) | JUNE -> ^( MONTH_OF_YEAR INT[\"6\"] ) | JULY -> ^( MONTH_OF_YEAR INT[\"7\"] ) | AUGUST -> ^( MONTH_OF_YEAR INT[\"8\"] ) | SEPTEMBER -> ^( MONTH_OF_YEAR INT[\"9\"] ) | OCTOBER -> ^( MONTH_OF_YEAR INT[\"10\"] ) | NOVEMBER -> ^( MONTH_OF_YEAR INT[\"11\"] ) | DECEMBER -> ^( MONTH_OF_YEAR INT[\"12\"] ) )
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

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:108:5: JANUARY
                    {
                    dbg.location(108,5);
                    JANUARY67=(Token)match(input,JANUARY,FOLLOW_JANUARY_in_relaxed_month741); if (state.failed) return retval; 
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
                    // 108:15: -> ^( MONTH_OF_YEAR INT[\"1\"] )
                    {
                        dbg.location(108,18);
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:108:18: ^( MONTH_OF_YEAR INT[\"1\"] )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(108,20);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(MONTH_OF_YEAR, "MONTH_OF_YEAR"), root_1);

                        dbg.location(108,34);
                        adaptor.addChild(root_1, (Object)adaptor.create(INT, "1"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:109:5: FEBRUARY
                    {
                    dbg.location(109,5);
                    FEBRUARY68=(Token)match(input,FEBRUARY,FOLLOW_FEBRUARY_in_relaxed_month758); if (state.failed) return retval; 
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
                    // 109:15: -> ^( MONTH_OF_YEAR INT[\"2\"] )
                    {
                        dbg.location(109,18);
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:109:18: ^( MONTH_OF_YEAR INT[\"2\"] )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(109,20);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(MONTH_OF_YEAR, "MONTH_OF_YEAR"), root_1);

                        dbg.location(109,34);
                        adaptor.addChild(root_1, (Object)adaptor.create(INT, "2"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:110:5: MARCH
                    {
                    dbg.location(110,5);
                    MARCH69=(Token)match(input,MARCH,FOLLOW_MARCH_in_relaxed_month774); if (state.failed) return retval; 
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
                    // 110:15: -> ^( MONTH_OF_YEAR INT[\"3\"] )
                    {
                        dbg.location(110,18);
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:110:18: ^( MONTH_OF_YEAR INT[\"3\"] )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(110,20);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(MONTH_OF_YEAR, "MONTH_OF_YEAR"), root_1);

                        dbg.location(110,34);
                        adaptor.addChild(root_1, (Object)adaptor.create(INT, "3"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:111:5: APRIL
                    {
                    dbg.location(111,5);
                    APRIL70=(Token)match(input,APRIL,FOLLOW_APRIL_in_relaxed_month793); if (state.failed) return retval; 
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
                    // 111:15: -> ^( MONTH_OF_YEAR INT[\"4\"] )
                    {
                        dbg.location(111,18);
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:111:18: ^( MONTH_OF_YEAR INT[\"4\"] )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(111,20);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(MONTH_OF_YEAR, "MONTH_OF_YEAR"), root_1);

                        dbg.location(111,34);
                        adaptor.addChild(root_1, (Object)adaptor.create(INT, "4"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:112:5: MAY
                    {
                    dbg.location(112,5);
                    MAY71=(Token)match(input,MAY,FOLLOW_MAY_in_relaxed_month812); if (state.failed) return retval; 
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
                    // 112:15: -> ^( MONTH_OF_YEAR INT[\"5\"] )
                    {
                        dbg.location(112,18);
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:112:18: ^( MONTH_OF_YEAR INT[\"5\"] )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(112,20);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(MONTH_OF_YEAR, "MONTH_OF_YEAR"), root_1);

                        dbg.location(112,34);
                        adaptor.addChild(root_1, (Object)adaptor.create(INT, "5"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 6 :
                    dbg.enterAlt(6);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:113:5: JUNE
                    {
                    dbg.location(113,5);
                    JUNE72=(Token)match(input,JUNE,FOLLOW_JUNE_in_relaxed_month833); if (state.failed) return retval; 
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
                    // 113:15: -> ^( MONTH_OF_YEAR INT[\"6\"] )
                    {
                        dbg.location(113,18);
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:113:18: ^( MONTH_OF_YEAR INT[\"6\"] )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(113,20);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(MONTH_OF_YEAR, "MONTH_OF_YEAR"), root_1);

                        dbg.location(113,34);
                        adaptor.addChild(root_1, (Object)adaptor.create(INT, "6"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 7 :
                    dbg.enterAlt(7);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:114:5: JULY
                    {
                    dbg.location(114,5);
                    JULY73=(Token)match(input,JULY,FOLLOW_JULY_in_relaxed_month853); if (state.failed) return retval; 
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
                    // 114:15: -> ^( MONTH_OF_YEAR INT[\"7\"] )
                    {
                        dbg.location(114,18);
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:114:18: ^( MONTH_OF_YEAR INT[\"7\"] )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(114,20);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(MONTH_OF_YEAR, "MONTH_OF_YEAR"), root_1);

                        dbg.location(114,34);
                        adaptor.addChild(root_1, (Object)adaptor.create(INT, "7"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 8 :
                    dbg.enterAlt(8);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:115:5: AUGUST
                    {
                    dbg.location(115,5);
                    AUGUST74=(Token)match(input,AUGUST,FOLLOW_AUGUST_in_relaxed_month873); if (state.failed) return retval; 
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
                    // 115:15: -> ^( MONTH_OF_YEAR INT[\"8\"] )
                    {
                        dbg.location(115,18);
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:115:18: ^( MONTH_OF_YEAR INT[\"8\"] )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(115,20);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(MONTH_OF_YEAR, "MONTH_OF_YEAR"), root_1);

                        dbg.location(115,34);
                        adaptor.addChild(root_1, (Object)adaptor.create(INT, "8"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 9 :
                    dbg.enterAlt(9);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:116:5: SEPTEMBER
                    {
                    dbg.location(116,5);
                    SEPTEMBER75=(Token)match(input,SEPTEMBER,FOLLOW_SEPTEMBER_in_relaxed_month891); if (state.failed) return retval; 
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
                    // 116:15: -> ^( MONTH_OF_YEAR INT[\"9\"] )
                    {
                        dbg.location(116,18);
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:116:18: ^( MONTH_OF_YEAR INT[\"9\"] )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(116,20);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(MONTH_OF_YEAR, "MONTH_OF_YEAR"), root_1);

                        dbg.location(116,34);
                        adaptor.addChild(root_1, (Object)adaptor.create(INT, "9"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 10 :
                    dbg.enterAlt(10);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:117:5: OCTOBER
                    {
                    dbg.location(117,5);
                    OCTOBER76=(Token)match(input,OCTOBER,FOLLOW_OCTOBER_in_relaxed_month906); if (state.failed) return retval; 
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
                    // 117:15: -> ^( MONTH_OF_YEAR INT[\"10\"] )
                    {
                        dbg.location(117,18);
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:117:18: ^( MONTH_OF_YEAR INT[\"10\"] )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(117,20);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(MONTH_OF_YEAR, "MONTH_OF_YEAR"), root_1);

                        dbg.location(117,34);
                        adaptor.addChild(root_1, (Object)adaptor.create(INT, "10"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 11 :
                    dbg.enterAlt(11);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:118:5: NOVEMBER
                    {
                    dbg.location(118,5);
                    NOVEMBER77=(Token)match(input,NOVEMBER,FOLLOW_NOVEMBER_in_relaxed_month923); if (state.failed) return retval; 
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
                    // 118:15: -> ^( MONTH_OF_YEAR INT[\"11\"] )
                    {
                        dbg.location(118,18);
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:118:18: ^( MONTH_OF_YEAR INT[\"11\"] )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(118,20);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(MONTH_OF_YEAR, "MONTH_OF_YEAR"), root_1);

                        dbg.location(118,34);
                        adaptor.addChild(root_1, (Object)adaptor.create(INT, "11"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 12 :
                    dbg.enterAlt(12);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:119:5: DECEMBER
                    {
                    dbg.location(119,5);
                    DECEMBER78=(Token)match(input,DECEMBER,FOLLOW_DECEMBER_in_relaxed_month939); if (state.failed) return retval; 
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
                    // 119:15: -> ^( MONTH_OF_YEAR INT[\"12\"] )
                    {
                        dbg.location(119,18);
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:119:18: ^( MONTH_OF_YEAR INT[\"12\"] )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(119,20);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(MONTH_OF_YEAR, "MONTH_OF_YEAR"), root_1);

                        dbg.location(119,34);
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
        dbg.location(120, 3);

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
    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:122:1: relaxed_day_of_month : ( spelled_or_int_01_to_31_optional_prefix -> ^( DAY_OF_MONTH spelled_or_int_01_to_31_optional_prefix ) | spelled_first_to_thirty_first -> ^( DAY_OF_MONTH spelled_first_to_thirty_first ) );
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
        dbg.location(122, 1);

        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:123:3: ( spelled_or_int_01_to_31_optional_prefix -> ^( DAY_OF_MONTH spelled_or_int_01_to_31_optional_prefix ) | spelled_first_to_thirty_first -> ^( DAY_OF_MONTH spelled_first_to_thirty_first ) )
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
                case DASH:
                    {
                    int LA23_5 = input.LA(3);

                    if ( ((LA23_5>=FIRST && LA23_5<=FIFTH)||(LA23_5>=SIXTH && LA23_5<=NINTH)) ) {
                        alt23=2;
                    }
                    else if ( ((LA23_5>=ONE && LA23_5<=NINE)) ) {
                        alt23=1;
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
                case WHITE_SPACE:
                    {
                    int LA23_6 = input.LA(3);

                    if ( (LA23_6==AT||(LA23_6>=OF && LA23_6<=IN)||LA23_6==INT_1_TO_5||(LA23_6>=NOON && LA23_6<=MIDNIGHT)||(LA23_6>=INT_0 && LA23_6<=NINE)) ) {
                        alt23=1;
                    }
                    else if ( ((LA23_6>=FIRST && LA23_6<=FIFTH)||(LA23_6>=SIXTH && LA23_6<=NINTH)) ) {
                        alt23=2;
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
                case WHITE_SPACE:
                    {
                    int LA23_7 = input.LA(3);

                    if ( (LA23_7==AT||(LA23_7>=OF && LA23_7<=IN)||LA23_7==INT_1_TO_5||(LA23_7>=NOON && LA23_7<=MIDNIGHT)||(LA23_7>=INT_0 && LA23_7<=ONE)) ) {
                        alt23=1;
                    }
                    else if ( (LA23_7==FIRST) ) {
                        alt23=2;
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
                case EOF:
                case COMMA:
                case ONE:
                    {
                    alt23=1;
                    }
                    break;
                case DASH:
                    {
                    int LA23_8 = input.LA(3);

                    if ( (LA23_8==ONE) ) {
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

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:123:5: spelled_or_int_01_to_31_optional_prefix
                    {
                    dbg.location(123,5);
                    pushFollow(FOLLOW_spelled_or_int_01_to_31_optional_prefix_in_relaxed_day_of_month964);
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
                    // 124:7: -> ^( DAY_OF_MONTH spelled_or_int_01_to_31_optional_prefix )
                    {
                        dbg.location(124,10);
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:124:10: ^( DAY_OF_MONTH spelled_or_int_01_to_31_optional_prefix )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(124,12);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DAY_OF_MONTH, "DAY_OF_MONTH"), root_1);

                        dbg.location(124,25);
                        adaptor.addChild(root_1, stream_spelled_or_int_01_to_31_optional_prefix.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:126:5: spelled_first_to_thirty_first
                    {
                    dbg.location(126,5);
                    pushFollow(FOLLOW_spelled_first_to_thirty_first_in_relaxed_day_of_month991);
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
                    // 127:7: -> ^( DAY_OF_MONTH spelled_first_to_thirty_first )
                    {
                        dbg.location(127,10);
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:127:10: ^( DAY_OF_MONTH spelled_first_to_thirty_first )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(127,12);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DAY_OF_MONTH, "DAY_OF_MONTH"), root_1);

                        dbg.location(127,25);
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
        dbg.location(128, 3);

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
    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:130:1: relaxed_year : ( ( SINGLE_QUOTE )? int_00_to_99_mandatory_prefix -> ^( YEAR_OF int_00_to_99_mandatory_prefix ) | int_four_digits -> ^( YEAR_OF int_four_digits ) );
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
        dbg.location(130, 1);

        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:131:3: ( ( SINGLE_QUOTE )? int_00_to_99_mandatory_prefix -> ^( YEAR_OF int_00_to_99_mandatory_prefix ) | int_four_digits -> ^( YEAR_OF int_four_digits ) )
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

                if ( (LA25_5==INT_00||(LA25_5>=INT_01_TO_12 && LA25_5<=INT_60_TO_99)) ) {
                    alt25=2;
                }
                else if ( (LA25_5==EOF||LA25_5==WHITE_SPACE||LA25_5==COMMA) ) {
                    alt25=1;
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

                if ( (LA25_6==INT_00||(LA25_6>=INT_01_TO_12 && LA25_6<=INT_60_TO_99)) ) {
                    alt25=2;
                }
                else if ( (LA25_6==EOF||LA25_6==WHITE_SPACE||LA25_6==COMMA) ) {
                    alt25=1;
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

                if ( (LA25_7==EOF||LA25_7==WHITE_SPACE||LA25_7==COMMA) ) {
                    alt25=1;
                }
                else if ( (LA25_7==INT_00||(LA25_7>=INT_01_TO_12 && LA25_7<=INT_60_TO_99)) ) {
                    alt25=2;
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

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:131:5: ( SINGLE_QUOTE )? int_00_to_99_mandatory_prefix
                    {
                    dbg.location(131,5);
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:131:5: ( SINGLE_QUOTE )?
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

                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:131:5: SINGLE_QUOTE
                            {
                            dbg.location(131,5);
                            SINGLE_QUOTE81=(Token)match(input,SINGLE_QUOTE,FOLLOW_SINGLE_QUOTE_in_relaxed_year1021); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_SINGLE_QUOTE.add(SINGLE_QUOTE81);


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(24);}

                    dbg.location(131,19);
                    pushFollow(FOLLOW_int_00_to_99_mandatory_prefix_in_relaxed_year1024);
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
                    // 132:7: -> ^( YEAR_OF int_00_to_99_mandatory_prefix )
                    {
                        dbg.location(132,10);
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:132:10: ^( YEAR_OF int_00_to_99_mandatory_prefix )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(132,12);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(YEAR_OF, "YEAR_OF"), root_1);

                        dbg.location(132,20);
                        adaptor.addChild(root_1, stream_int_00_to_99_mandatory_prefix.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:134:5: int_four_digits
                    {
                    dbg.location(134,5);
                    pushFollow(FOLLOW_int_four_digits_in_relaxed_year1051);
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
                    // 135:7: -> ^( YEAR_OF int_four_digits )
                    {
                        dbg.location(135,10);
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:135:10: ^( YEAR_OF int_four_digits )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(135,12);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(YEAR_OF, "YEAR_OF"), root_1);

                        dbg.location(135,20);
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
        dbg.location(136, 3);

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
    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:138:1: relaxed_year_prefix : ( COMMA ( WHITE_SPACE )? | WHITE_SPACE ) ( IN WHITE_SPACE THE WHITE_SPACE YEAR WHITE_SPACE )? ;
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
        dbg.location(138, 1);

        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:139:3: ( ( COMMA ( WHITE_SPACE )? | WHITE_SPACE ) ( IN WHITE_SPACE THE WHITE_SPACE YEAR WHITE_SPACE )? )
            dbg.enterAlt(1);

            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:139:5: ( COMMA ( WHITE_SPACE )? | WHITE_SPACE ) ( IN WHITE_SPACE THE WHITE_SPACE YEAR WHITE_SPACE )?
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(139,5);
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:139:5: ( COMMA ( WHITE_SPACE )? | WHITE_SPACE )
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

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:139:6: COMMA ( WHITE_SPACE )?
                    {
                    dbg.location(139,6);
                    COMMA84=(Token)match(input,COMMA,FOLLOW_COMMA_in_relaxed_year_prefix1081); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    COMMA84_tree = (Object)adaptor.create(COMMA84);
                    adaptor.addChild(root_0, COMMA84_tree);
                    }
                    dbg.location(139,12);
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:139:12: ( WHITE_SPACE )?
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

                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:139:12: WHITE_SPACE
                            {
                            dbg.location(139,12);
                            WHITE_SPACE85=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_relaxed_year_prefix1083); if (state.failed) return retval;
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

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:139:27: WHITE_SPACE
                    {
                    dbg.location(139,27);
                    WHITE_SPACE86=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_relaxed_year_prefix1088); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    WHITE_SPACE86_tree = (Object)adaptor.create(WHITE_SPACE86);
                    adaptor.addChild(root_0, WHITE_SPACE86_tree);
                    }

                    }
                    break;

            }
            } finally {dbg.exitSubRule(27);}

            dbg.location(139,40);
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:139:40: ( IN WHITE_SPACE THE WHITE_SPACE YEAR WHITE_SPACE )?
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

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:139:41: IN WHITE_SPACE THE WHITE_SPACE YEAR WHITE_SPACE
                    {
                    dbg.location(139,41);
                    IN87=(Token)match(input,IN,FOLLOW_IN_in_relaxed_year_prefix1092); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IN87_tree = (Object)adaptor.create(IN87);
                    adaptor.addChild(root_0, IN87_tree);
                    }
                    dbg.location(139,44);
                    WHITE_SPACE88=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_relaxed_year_prefix1094); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    WHITE_SPACE88_tree = (Object)adaptor.create(WHITE_SPACE88);
                    adaptor.addChild(root_0, WHITE_SPACE88_tree);
                    }
                    dbg.location(139,56);
                    THE89=(Token)match(input,THE,FOLLOW_THE_in_relaxed_year_prefix1096); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    THE89_tree = (Object)adaptor.create(THE89);
                    adaptor.addChild(root_0, THE89_tree);
                    }
                    dbg.location(139,60);
                    WHITE_SPACE90=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_relaxed_year_prefix1098); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    WHITE_SPACE90_tree = (Object)adaptor.create(WHITE_SPACE90);
                    adaptor.addChild(root_0, WHITE_SPACE90_tree);
                    }
                    dbg.location(139,72);
                    YEAR91=(Token)match(input,YEAR,FOLLOW_YEAR_in_relaxed_year_prefix1100); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    YEAR91_tree = (Object)adaptor.create(YEAR91);
                    adaptor.addChild(root_0, YEAR91_tree);
                    }
                    dbg.location(139,77);
                    WHITE_SPACE92=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_relaxed_year_prefix1102); if (state.failed) return retval;
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
        dbg.location(140, 3);

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
    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:144:1: formal_date : ( formal_year_four_digits formal_date_separator formal_month_of_year formal_date_separator formal_day_of_month -> ^( EXPLICIT_DATE formal_month_of_year formal_day_of_month formal_year_four_digits ) | formal_month_of_year formal_date_separator formal_day_of_month ( formal_date_separator formal_year )? -> ^( EXPLICIT_DATE formal_month_of_year formal_day_of_month ( formal_year )? ) );
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
        dbg.location(144, 1);

        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:146:3: ( formal_year_four_digits formal_date_separator formal_month_of_year formal_date_separator formal_day_of_month -> ^( EXPLICIT_DATE formal_month_of_year formal_day_of_month formal_year_four_digits ) | formal_month_of_year formal_date_separator formal_day_of_month ( formal_date_separator formal_year )? -> ^( EXPLICIT_DATE formal_month_of_year formal_day_of_month ( formal_year )? ) )
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

                if ( ((LA30_2>=DASH && LA30_2<=SLASH)) ) {
                    alt30=2;
                }
                else if ( (LA30_2==INT_00||(LA30_2>=INT_01_TO_12 && LA30_2<=INT_60_TO_99)) ) {
                    alt30=1;
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

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:146:5: formal_year_four_digits formal_date_separator formal_month_of_year formal_date_separator formal_day_of_month
                    {
                    dbg.location(146,5);
                    pushFollow(FOLLOW_formal_year_four_digits_in_formal_date1125);
                    formal_year_four_digits93=formal_year_four_digits();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_formal_year_four_digits.add(formal_year_four_digits93.getTree());
                    dbg.location(146,29);
                    pushFollow(FOLLOW_formal_date_separator_in_formal_date1127);
                    formal_date_separator94=formal_date_separator();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_formal_date_separator.add(formal_date_separator94.getTree());
                    dbg.location(146,51);
                    pushFollow(FOLLOW_formal_month_of_year_in_formal_date1129);
                    formal_month_of_year95=formal_month_of_year();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_formal_month_of_year.add(formal_month_of_year95.getTree());
                    dbg.location(146,72);
                    pushFollow(FOLLOW_formal_date_separator_in_formal_date1131);
                    formal_date_separator96=formal_date_separator();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_formal_date_separator.add(formal_date_separator96.getTree());
                    dbg.location(146,94);
                    pushFollow(FOLLOW_formal_day_of_month_in_formal_date1133);
                    formal_day_of_month97=formal_day_of_month();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_formal_day_of_month.add(formal_day_of_month97.getTree());


                    // AST REWRITE
                    // elements: formal_day_of_month, formal_month_of_year, formal_year_four_digits
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 147:7: -> ^( EXPLICIT_DATE formal_month_of_year formal_day_of_month formal_year_four_digits )
                    {
                        dbg.location(147,10);
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:147:10: ^( EXPLICIT_DATE formal_month_of_year formal_day_of_month formal_year_four_digits )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(147,12);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPLICIT_DATE, "EXPLICIT_DATE"), root_1);

                        dbg.location(147,26);
                        adaptor.addChild(root_1, stream_formal_month_of_year.nextTree());
                        dbg.location(147,47);
                        adaptor.addChild(root_1, stream_formal_day_of_month.nextTree());
                        dbg.location(147,67);
                        adaptor.addChild(root_1, stream_formal_year_four_digits.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:150:5: formal_month_of_year formal_date_separator formal_day_of_month ( formal_date_separator formal_year )?
                    {
                    dbg.location(150,5);
                    pushFollow(FOLLOW_formal_month_of_year_in_formal_date1162);
                    formal_month_of_year98=formal_month_of_year();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_formal_month_of_year.add(formal_month_of_year98.getTree());
                    dbg.location(150,26);
                    pushFollow(FOLLOW_formal_date_separator_in_formal_date1164);
                    formal_date_separator99=formal_date_separator();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_formal_date_separator.add(formal_date_separator99.getTree());
                    dbg.location(150,48);
                    pushFollow(FOLLOW_formal_day_of_month_in_formal_date1166);
                    formal_day_of_month100=formal_day_of_month();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_formal_day_of_month.add(formal_day_of_month100.getTree());
                    dbg.location(150,68);
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:150:68: ( formal_date_separator formal_year )?
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

                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:150:69: formal_date_separator formal_year
                            {
                            dbg.location(150,69);
                            pushFollow(FOLLOW_formal_date_separator_in_formal_date1169);
                            formal_date_separator101=formal_date_separator();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_formal_date_separator.add(formal_date_separator101.getTree());
                            dbg.location(150,91);
                            pushFollow(FOLLOW_formal_year_in_formal_date1171);
                            formal_year102=formal_year();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_formal_year.add(formal_year102.getTree());

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(29);}



                    // AST REWRITE
                    // elements: formal_year, formal_day_of_month, formal_month_of_year
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 151:7: -> ^( EXPLICIT_DATE formal_month_of_year formal_day_of_month ( formal_year )? )
                    {
                        dbg.location(151,10);
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:151:10: ^( EXPLICIT_DATE formal_month_of_year formal_day_of_month ( formal_year )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(151,12);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPLICIT_DATE, "EXPLICIT_DATE"), root_1);

                        dbg.location(151,26);
                        adaptor.addChild(root_1, stream_formal_month_of_year.nextTree());
                        dbg.location(151,47);
                        adaptor.addChild(root_1, stream_formal_day_of_month.nextTree());
                        dbg.location(151,67);
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:151:67: ( formal_year )?
                        if ( stream_formal_year.hasNext() ) {
                            dbg.location(151,67);
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
        dbg.location(152, 3);

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
    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:154:1: formal_month_of_year : int_01_to_12_optional_prefix -> ^( MONTH_OF_YEAR int_01_to_12_optional_prefix ) ;
    public final DateParser.formal_month_of_year_return formal_month_of_year() throws RecognitionException {
        DateParser.formal_month_of_year_return retval = new DateParser.formal_month_of_year_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        DateParser.int_01_to_12_optional_prefix_return int_01_to_12_optional_prefix103 = null;


        RewriteRuleSubtreeStream stream_int_01_to_12_optional_prefix=new RewriteRuleSubtreeStream(adaptor,"rule int_01_to_12_optional_prefix");
        try { dbg.enterRule(getGrammarFileName(), "formal_month_of_year");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(154, 1);

        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:155:3: ( int_01_to_12_optional_prefix -> ^( MONTH_OF_YEAR int_01_to_12_optional_prefix ) )
            dbg.enterAlt(1);

            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:155:5: int_01_to_12_optional_prefix
            {
            dbg.location(155,5);
            pushFollow(FOLLOW_int_01_to_12_optional_prefix_in_formal_month_of_year1205);
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
            // 155:34: -> ^( MONTH_OF_YEAR int_01_to_12_optional_prefix )
            {
                dbg.location(155,37);
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:155:37: ^( MONTH_OF_YEAR int_01_to_12_optional_prefix )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(155,39);
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(MONTH_OF_YEAR, "MONTH_OF_YEAR"), root_1);

                dbg.location(155,53);
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
        dbg.location(156, 3);

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
    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:158:1: formal_day_of_month : int_01_to_31_optional_prefix -> ^( DAY_OF_MONTH int_01_to_31_optional_prefix ) ;
    public final DateParser.formal_day_of_month_return formal_day_of_month() throws RecognitionException {
        DateParser.formal_day_of_month_return retval = new DateParser.formal_day_of_month_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        DateParser.int_01_to_31_optional_prefix_return int_01_to_31_optional_prefix104 = null;


        RewriteRuleSubtreeStream stream_int_01_to_31_optional_prefix=new RewriteRuleSubtreeStream(adaptor,"rule int_01_to_31_optional_prefix");
        try { dbg.enterRule(getGrammarFileName(), "formal_day_of_month");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(158, 1);

        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:159:3: ( int_01_to_31_optional_prefix -> ^( DAY_OF_MONTH int_01_to_31_optional_prefix ) )
            dbg.enterAlt(1);

            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:159:5: int_01_to_31_optional_prefix
            {
            dbg.location(159,5);
            pushFollow(FOLLOW_int_01_to_31_optional_prefix_in_formal_day_of_month1228);
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
            // 159:34: -> ^( DAY_OF_MONTH int_01_to_31_optional_prefix )
            {
                dbg.location(159,37);
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:159:37: ^( DAY_OF_MONTH int_01_to_31_optional_prefix )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(159,39);
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DAY_OF_MONTH, "DAY_OF_MONTH"), root_1);

                dbg.location(159,52);
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
        dbg.location(160, 3);

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
    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:162:1: formal_year : ( formal_year_four_digits | int_00_to_99_mandatory_prefix -> ^( YEAR_OF int_00_to_99_mandatory_prefix ) );
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
        dbg.location(162, 1);

        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:163:3: ( formal_year_four_digits | int_00_to_99_mandatory_prefix -> ^( YEAR_OF int_00_to_99_mandatory_prefix ) )
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

                if ( (LA31_5==EOF||LA31_5==WHITE_SPACE||LA31_5==COMMA) ) {
                    alt31=2;
                }
                else if ( (LA31_5==INT_00||(LA31_5>=INT_01_TO_12 && LA31_5<=INT_60_TO_99)) ) {
                    alt31=1;
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

                if ( (LA31_6==INT_00||(LA31_6>=INT_01_TO_12 && LA31_6<=INT_60_TO_99)) ) {
                    alt31=1;
                }
                else if ( (LA31_6==EOF||LA31_6==WHITE_SPACE||LA31_6==COMMA) ) {
                    alt31=2;
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

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:163:5: formal_year_four_digits
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(163,5);
                    pushFollow(FOLLOW_formal_year_four_digits_in_formal_year1251);
                    formal_year_four_digits105=formal_year_four_digits();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, formal_year_four_digits105.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:164:5: int_00_to_99_mandatory_prefix
                    {
                    dbg.location(164,5);
                    pushFollow(FOLLOW_int_00_to_99_mandatory_prefix_in_formal_year1257);
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
                    // 164:35: -> ^( YEAR_OF int_00_to_99_mandatory_prefix )
                    {
                        dbg.location(164,38);
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:164:38: ^( YEAR_OF int_00_to_99_mandatory_prefix )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(164,40);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(YEAR_OF, "YEAR_OF"), root_1);

                        dbg.location(164,48);
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
        dbg.location(165, 3);

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
    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:167:1: formal_year_four_digits : int_four_digits -> ^( YEAR_OF int_four_digits ) ;
    public final DateParser.formal_year_four_digits_return formal_year_four_digits() throws RecognitionException {
        DateParser.formal_year_four_digits_return retval = new DateParser.formal_year_four_digits_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        DateParser.int_four_digits_return int_four_digits107 = null;


        RewriteRuleSubtreeStream stream_int_four_digits=new RewriteRuleSubtreeStream(adaptor,"rule int_four_digits");
        try { dbg.enterRule(getGrammarFileName(), "formal_year_four_digits");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(167, 1);

        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:168:3: ( int_four_digits -> ^( YEAR_OF int_four_digits ) )
            dbg.enterAlt(1);

            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:168:5: int_four_digits
            {
            dbg.location(168,5);
            pushFollow(FOLLOW_int_four_digits_in_formal_year_four_digits1280);
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
            // 168:21: -> ^( YEAR_OF int_four_digits )
            {
                dbg.location(168,24);
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:168:24: ^( YEAR_OF int_four_digits )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(168,26);
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(YEAR_OF, "YEAR_OF"), root_1);

                dbg.location(168,34);
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
        dbg.location(169, 3);

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
    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:171:1: formal_date_separator : ( DASH | SLASH );
    public final DateParser.formal_date_separator_return formal_date_separator() throws RecognitionException {
        DateParser.formal_date_separator_return retval = new DateParser.formal_date_separator_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set108=null;

        Object set108_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "formal_date_separator");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(171, 1);

        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:172:3: ( DASH | SLASH )
            dbg.enterAlt(1);

            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(172,3);
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
        dbg.location(174, 3);

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
    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:178:1: relative_date : ( relative_prefix WHITE_SPACE ( relative_target )? -> ^( RELATIVE_DATE ^( SEEK relative_prefix relative_target ) ) | implicit_prefix WHITE_SPACE relative_target -> ^( RELATIVE_DATE ^( SEEK implicit_prefix relative_target ) ) | relative_target -> ^( RELATIVE_DATE ^( SEEK DIRECTION[\">\"] SEEK_BY[\"by_day\"] INT[\"0\"] relative_target ) ) | spelled_or_int_01_to_31_optional_prefix WHITE_SPACE relative_target WHITE_SPACE relative_suffix -> ^( RELATIVE_DATE ^( SEEK relative_suffix spelled_or_int_01_to_31_optional_prefix relative_target ) ) | ( THE WHITE_SPACE )? relative_occurrence_index WHITE_SPACE day_of_week WHITE_SPACE IN WHITE_SPACE relaxed_month -> ^( RELATIVE_DATE ^( WEEK_INDEX relative_occurrence_index day_of_week relaxed_month ) ) | named_relative_date );
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
        dbg.location(178, 1);

        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:179:3: ( relative_prefix WHITE_SPACE ( relative_target )? -> ^( RELATIVE_DATE ^( SEEK relative_prefix relative_target ) ) | implicit_prefix WHITE_SPACE relative_target -> ^( RELATIVE_DATE ^( SEEK implicit_prefix relative_target ) ) | relative_target -> ^( RELATIVE_DATE ^( SEEK DIRECTION[\">\"] SEEK_BY[\"by_day\"] INT[\"0\"] relative_target ) ) | spelled_or_int_01_to_31_optional_prefix WHITE_SPACE relative_target WHITE_SPACE relative_suffix -> ^( RELATIVE_DATE ^( SEEK relative_suffix spelled_or_int_01_to_31_optional_prefix relative_target ) ) | ( THE WHITE_SPACE )? relative_occurrence_index WHITE_SPACE day_of_week WHITE_SPACE IN WHITE_SPACE relaxed_month -> ^( RELATIVE_DATE ^( WEEK_INDEX relative_occurrence_index day_of_week relaxed_month ) ) | named_relative_date )
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

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:179:5: relative_prefix WHITE_SPACE ( relative_target )?
                    {
                    dbg.location(179,5);
                    pushFollow(FOLLOW_relative_prefix_in_relative_date1329);
                    relative_prefix109=relative_prefix();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_relative_prefix.add(relative_prefix109.getTree());
                    dbg.location(179,21);
                    WHITE_SPACE110=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_relative_date1331); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE110);

                    dbg.location(179,33);
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:179:33: ( relative_target )?
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

                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:179:33: relative_target
                            {
                            dbg.location(179,33);
                            pushFollow(FOLLOW_relative_target_in_relative_date1333);
                            relative_target111=relative_target();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_relative_target.add(relative_target111.getTree());

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(32);}



                    // AST REWRITE
                    // elements: relative_prefix, relative_target
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 180:7: -> ^( RELATIVE_DATE ^( SEEK relative_prefix relative_target ) )
                    {
                        dbg.location(180,10);
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:180:10: ^( RELATIVE_DATE ^( SEEK relative_prefix relative_target ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(180,12);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(RELATIVE_DATE, "RELATIVE_DATE"), root_1);

                        dbg.location(180,26);
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:180:26: ^( SEEK relative_prefix relative_target )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        dbg.location(180,28);
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(SEEK, "SEEK"), root_2);

                        dbg.location(180,33);
                        adaptor.addChild(root_2, stream_relative_prefix.nextTree());
                        dbg.location(180,49);
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

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:182:5: implicit_prefix WHITE_SPACE relative_target
                    {
                    dbg.location(182,5);
                    pushFollow(FOLLOW_implicit_prefix_in_relative_date1367);
                    implicit_prefix112=implicit_prefix();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_implicit_prefix.add(implicit_prefix112.getTree());
                    dbg.location(182,21);
                    WHITE_SPACE113=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_relative_date1369); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE113);

                    dbg.location(182,33);
                    pushFollow(FOLLOW_relative_target_in_relative_date1371);
                    relative_target114=relative_target();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_relative_target.add(relative_target114.getTree());


                    // AST REWRITE
                    // elements: implicit_prefix, relative_target
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 183:7: -> ^( RELATIVE_DATE ^( SEEK implicit_prefix relative_target ) )
                    {
                        dbg.location(183,10);
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:183:10: ^( RELATIVE_DATE ^( SEEK implicit_prefix relative_target ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(183,12);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(RELATIVE_DATE, "RELATIVE_DATE"), root_1);

                        dbg.location(183,26);
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:183:26: ^( SEEK implicit_prefix relative_target )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        dbg.location(183,28);
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(SEEK, "SEEK"), root_2);

                        dbg.location(183,33);
                        adaptor.addChild(root_2, stream_implicit_prefix.nextTree());
                        dbg.location(183,49);
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

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:187:5: relative_target
                    {
                    dbg.location(187,5);
                    pushFollow(FOLLOW_relative_target_in_relative_date1411);
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
                    // 188:7: -> ^( RELATIVE_DATE ^( SEEK DIRECTION[\">\"] SEEK_BY[\"by_day\"] INT[\"0\"] relative_target ) )
                    {
                        dbg.location(188,10);
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:188:10: ^( RELATIVE_DATE ^( SEEK DIRECTION[\">\"] SEEK_BY[\"by_day\"] INT[\"0\"] relative_target ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(188,12);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(RELATIVE_DATE, "RELATIVE_DATE"), root_1);

                        dbg.location(188,26);
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:188:26: ^( SEEK DIRECTION[\">\"] SEEK_BY[\"by_day\"] INT[\"0\"] relative_target )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        dbg.location(188,28);
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(SEEK, "SEEK"), root_2);

                        dbg.location(188,33);
                        adaptor.addChild(root_2, (Object)adaptor.create(DIRECTION, ">"));
                        dbg.location(188,48);
                        adaptor.addChild(root_2, (Object)adaptor.create(SEEK_BY, "by_day"));
                        dbg.location(188,66);
                        adaptor.addChild(root_2, (Object)adaptor.create(INT, "0"));
                        dbg.location(188,75);
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

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:190:5: spelled_or_int_01_to_31_optional_prefix WHITE_SPACE relative_target WHITE_SPACE relative_suffix
                    {
                    dbg.location(190,5);
                    pushFollow(FOLLOW_spelled_or_int_01_to_31_optional_prefix_in_relative_date1451);
                    spelled_or_int_01_to_31_optional_prefix116=spelled_or_int_01_to_31_optional_prefix();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_spelled_or_int_01_to_31_optional_prefix.add(spelled_or_int_01_to_31_optional_prefix116.getTree());
                    dbg.location(190,45);
                    WHITE_SPACE117=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_relative_date1453); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE117);

                    dbg.location(190,57);
                    pushFollow(FOLLOW_relative_target_in_relative_date1455);
                    relative_target118=relative_target();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_relative_target.add(relative_target118.getTree());
                    dbg.location(190,73);
                    WHITE_SPACE119=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_relative_date1457); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE119);

                    dbg.location(190,85);
                    pushFollow(FOLLOW_relative_suffix_in_relative_date1459);
                    relative_suffix120=relative_suffix();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_relative_suffix.add(relative_suffix120.getTree());


                    // AST REWRITE
                    // elements: spelled_or_int_01_to_31_optional_prefix, relative_suffix, relative_target
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 191:7: -> ^( RELATIVE_DATE ^( SEEK relative_suffix spelled_or_int_01_to_31_optional_prefix relative_target ) )
                    {
                        dbg.location(191,10);
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:191:10: ^( RELATIVE_DATE ^( SEEK relative_suffix spelled_or_int_01_to_31_optional_prefix relative_target ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(191,12);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(RELATIVE_DATE, "RELATIVE_DATE"), root_1);

                        dbg.location(191,26);
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:191:26: ^( SEEK relative_suffix spelled_or_int_01_to_31_optional_prefix relative_target )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        dbg.location(191,28);
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(SEEK, "SEEK"), root_2);

                        dbg.location(191,33);
                        adaptor.addChild(root_2, stream_relative_suffix.nextTree());
                        dbg.location(191,49);
                        adaptor.addChild(root_2, stream_spelled_or_int_01_to_31_optional_prefix.nextTree());
                        dbg.location(191,89);
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

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:194:5: ( THE WHITE_SPACE )? relative_occurrence_index WHITE_SPACE day_of_week WHITE_SPACE IN WHITE_SPACE relaxed_month
                    {
                    dbg.location(194,5);
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:194:5: ( THE WHITE_SPACE )?
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

                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:194:6: THE WHITE_SPACE
                            {
                            dbg.location(194,6);
                            THE121=(Token)match(input,THE,FOLLOW_THE_in_relative_date1499); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_THE.add(THE121);

                            dbg.location(194,10);
                            WHITE_SPACE122=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_relative_date1501); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE122);


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(33);}

                    dbg.location(194,24);
                    pushFollow(FOLLOW_relative_occurrence_index_in_relative_date1505);
                    relative_occurrence_index123=relative_occurrence_index();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_relative_occurrence_index.add(relative_occurrence_index123.getTree());
                    dbg.location(194,50);
                    WHITE_SPACE124=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_relative_date1507); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE124);

                    dbg.location(194,62);
                    pushFollow(FOLLOW_day_of_week_in_relative_date1509);
                    day_of_week125=day_of_week();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_day_of_week.add(day_of_week125.getTree());
                    dbg.location(194,74);
                    WHITE_SPACE126=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_relative_date1511); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE126);

                    dbg.location(194,86);
                    IN127=(Token)match(input,IN,FOLLOW_IN_in_relative_date1513); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IN.add(IN127);

                    dbg.location(194,89);
                    WHITE_SPACE128=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_relative_date1515); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE128);

                    dbg.location(194,101);
                    pushFollow(FOLLOW_relaxed_month_in_relative_date1517);
                    relaxed_month129=relaxed_month();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_relaxed_month.add(relaxed_month129.getTree());


                    // AST REWRITE
                    // elements: day_of_week, relative_occurrence_index, relaxed_month
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 195:7: -> ^( RELATIVE_DATE ^( WEEK_INDEX relative_occurrence_index day_of_week relaxed_month ) )
                    {
                        dbg.location(195,10);
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:195:10: ^( RELATIVE_DATE ^( WEEK_INDEX relative_occurrence_index day_of_week relaxed_month ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(195,12);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(RELATIVE_DATE, "RELATIVE_DATE"), root_1);

                        dbg.location(195,26);
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:195:26: ^( WEEK_INDEX relative_occurrence_index day_of_week relaxed_month )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        dbg.location(195,28);
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(WEEK_INDEX, "WEEK_INDEX"), root_2);

                        dbg.location(195,39);
                        adaptor.addChild(root_2, stream_relative_occurrence_index.nextTree());
                        dbg.location(195,65);
                        adaptor.addChild(root_2, stream_day_of_week.nextTree());
                        dbg.location(195,77);
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

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:197:5: named_relative_date
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(197,5);
                    pushFollow(FOLLOW_named_relative_date_in_relative_date1552);
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
        dbg.location(198, 3);

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
    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:200:1: relative_occurrence_index : ( INT_1_TO_5 -> INT[$INT_1_TO_5.text] | FIRST -> INT[\"1\"] | SECOND -> INT[\"2\"] | THIRD -> INT[\"3\"] | FOURTH -> INT[\"4\"] | FIFTH -> INT[\"5\"] | LAST -> INT[\"5\"] );
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
        dbg.location(200, 1);

        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:201:3: ( INT_1_TO_5 -> INT[$INT_1_TO_5.text] | FIRST -> INT[\"1\"] | SECOND -> INT[\"2\"] | THIRD -> INT[\"3\"] | FOURTH -> INT[\"4\"] | FIFTH -> INT[\"5\"] | LAST -> INT[\"5\"] )
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

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:201:5: INT_1_TO_5
                    {
                    dbg.location(201,5);
                    INT_1_TO_5131=(Token)match(input,INT_1_TO_5,FOLLOW_INT_1_TO_5_in_relative_occurrence_index1568); if (state.failed) return retval; 
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
                    // 201:16: -> INT[$INT_1_TO_5.text]
                    {
                        dbg.location(201,19);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, (INT_1_TO_5131!=null?INT_1_TO_5131.getText():null)));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:202:5: FIRST
                    {
                    dbg.location(202,5);
                    FIRST132=(Token)match(input,FIRST,FOLLOW_FIRST_in_relative_occurrence_index1579); if (state.failed) return retval; 
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
                    // 202:16: -> INT[\"1\"]
                    {
                        dbg.location(202,19);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "1"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:203:5: SECOND
                    {
                    dbg.location(203,5);
                    SECOND133=(Token)match(input,SECOND,FOLLOW_SECOND_in_relative_occurrence_index1595); if (state.failed) return retval; 
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
                    // 203:16: -> INT[\"2\"]
                    {
                        dbg.location(203,19);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "2"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:204:5: THIRD
                    {
                    dbg.location(204,5);
                    THIRD134=(Token)match(input,THIRD,FOLLOW_THIRD_in_relative_occurrence_index1610); if (state.failed) return retval; 
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
                    // 204:16: -> INT[\"3\"]
                    {
                        dbg.location(204,19);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "3"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:205:5: FOURTH
                    {
                    dbg.location(205,5);
                    FOURTH135=(Token)match(input,FOURTH,FOLLOW_FOURTH_in_relative_occurrence_index1626); if (state.failed) return retval; 
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
                    // 205:16: -> INT[\"4\"]
                    {
                        dbg.location(205,19);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "4"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 6 :
                    dbg.enterAlt(6);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:206:5: FIFTH
                    {
                    dbg.location(206,5);
                    FIFTH136=(Token)match(input,FIFTH,FOLLOW_FIFTH_in_relative_occurrence_index1641); if (state.failed) return retval; 
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
                    // 206:16: -> INT[\"5\"]
                    {
                        dbg.location(206,19);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "5"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 7 :
                    dbg.enterAlt(7);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:207:5: LAST
                    {
                    dbg.location(207,5);
                    LAST137=(Token)match(input,LAST,FOLLOW_LAST_in_relative_occurrence_index1657); if (state.failed) return retval; 
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
                    // 207:16: -> INT[\"5\"]
                    {
                        dbg.location(207,19);
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
        dbg.location(208, 3);

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
    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:210:1: relative_target : ( day_of_week | relaxed_month | relative_date_span );
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
        dbg.location(210, 1);

        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:211:3: ( day_of_week | relaxed_month | relative_date_span )
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

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:211:5: day_of_week
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(211,5);
                    pushFollow(FOLLOW_day_of_week_in_relative_target1683);
                    day_of_week138=day_of_week();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, day_of_week138.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:212:5: relaxed_month
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(212,5);
                    pushFollow(FOLLOW_relaxed_month_in_relative_target1690);
                    relaxed_month139=relaxed_month();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, relaxed_month139.getTree());

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:213:5: relative_date_span
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(213,5);
                    pushFollow(FOLLOW_relative_date_span_in_relative_target1696);
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
        dbg.location(214, 3);

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
    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:216:1: implicit_prefix : THIS -> DIRECTION[\">\"] SEEK_BY[\"by_day\"] INT[\"0\"] ;
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
        dbg.location(216, 1);

        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:217:3: ( THIS -> DIRECTION[\">\"] SEEK_BY[\"by_day\"] INT[\"0\"] )
            dbg.enterAlt(1);

            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:217:5: THIS
            {
            dbg.location(217,5);
            THIS141=(Token)match(input,THIS,FOLLOW_THIS_in_implicit_prefix1711); if (state.failed) return retval; 
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
            // 217:10: -> DIRECTION[\">\"] SEEK_BY[\"by_day\"] INT[\"0\"]
            {
                dbg.location(217,13);
                adaptor.addChild(root_0, (Object)adaptor.create(DIRECTION, ">"));
                dbg.location(217,28);
                adaptor.addChild(root_0, (Object)adaptor.create(SEEK_BY, "by_day"));
                dbg.location(217,46);
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
        dbg.location(218, 3);

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
    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:220:1: relative_prefix : ( ( THIS WHITE_SPACE )? LAST -> DIRECTION[\"<\"] SEEK_BY[\"by_week\"] INT[\"1\"] | ( THIS WHITE_SPACE )? NEXT -> DIRECTION[\">\"] SEEK_BY[\"by_week\"] INT[\"1\"] | ( THIS WHITE_SPACE )? PAST -> DIRECTION[\"<\"] SEEK_BY[\"by_day\"] INT[\"1\"] | ( THIS WHITE_SPACE )? COMING -> DIRECTION[\">\"] SEEK_BY[\"by_day\"] INT[\"1\"] | ( THIS WHITE_SPACE )? UPCOMING -> DIRECTION[\">\"] SEEK_BY[\"by_day\"] INT[\"1\"] | ( IN WHITE_SPACE )? spelled_or_int_01_to_31_optional_prefix -> DIRECTION[\">\"] SEEK_BY[\"by_day\"] spelled_or_int_01_to_31_optional_prefix );
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
        dbg.location(220, 1);

        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:221:3: ( ( THIS WHITE_SPACE )? LAST -> DIRECTION[\"<\"] SEEK_BY[\"by_week\"] INT[\"1\"] | ( THIS WHITE_SPACE )? NEXT -> DIRECTION[\">\"] SEEK_BY[\"by_week\"] INT[\"1\"] | ( THIS WHITE_SPACE )? PAST -> DIRECTION[\"<\"] SEEK_BY[\"by_day\"] INT[\"1\"] | ( THIS WHITE_SPACE )? COMING -> DIRECTION[\">\"] SEEK_BY[\"by_day\"] INT[\"1\"] | ( THIS WHITE_SPACE )? UPCOMING -> DIRECTION[\">\"] SEEK_BY[\"by_day\"] INT[\"1\"] | ( IN WHITE_SPACE )? spelled_or_int_01_to_31_optional_prefix -> DIRECTION[\">\"] SEEK_BY[\"by_day\"] spelled_or_int_01_to_31_optional_prefix )
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

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:221:5: ( THIS WHITE_SPACE )? LAST
                    {
                    dbg.location(221,5);
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:221:5: ( THIS WHITE_SPACE )?
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

                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:221:6: THIS WHITE_SPACE
                            {
                            dbg.location(221,6);
                            THIS142=(Token)match(input,THIS,FOLLOW_THIS_in_relative_prefix1738); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_THIS.add(THIS142);

                            dbg.location(221,11);
                            WHITE_SPACE143=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_relative_prefix1740); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE143);


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(37);}

                    dbg.location(221,25);
                    LAST144=(Token)match(input,LAST,FOLLOW_LAST_in_relative_prefix1744); if (state.failed) return retval; 
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
                    // 221:34: -> DIRECTION[\"<\"] SEEK_BY[\"by_week\"] INT[\"1\"]
                    {
                        dbg.location(221,37);
                        adaptor.addChild(root_0, (Object)adaptor.create(DIRECTION, "<"));
                        dbg.location(221,52);
                        adaptor.addChild(root_0, (Object)adaptor.create(SEEK_BY, "by_week"));
                        dbg.location(221,71);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "1"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:222:5: ( THIS WHITE_SPACE )? NEXT
                    {
                    dbg.location(222,5);
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:222:5: ( THIS WHITE_SPACE )?
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

                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:222:6: THIS WHITE_SPACE
                            {
                            dbg.location(222,6);
                            THIS145=(Token)match(input,THIS,FOLLOW_THIS_in_relative_prefix1766); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_THIS.add(THIS145);

                            dbg.location(222,11);
                            WHITE_SPACE146=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_relative_prefix1768); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE146);


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(38);}

                    dbg.location(222,25);
                    NEXT147=(Token)match(input,NEXT,FOLLOW_NEXT_in_relative_prefix1772); if (state.failed) return retval; 
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
                    // 222:34: -> DIRECTION[\">\"] SEEK_BY[\"by_week\"] INT[\"1\"]
                    {
                        dbg.location(222,37);
                        adaptor.addChild(root_0, (Object)adaptor.create(DIRECTION, ">"));
                        dbg.location(222,52);
                        adaptor.addChild(root_0, (Object)adaptor.create(SEEK_BY, "by_week"));
                        dbg.location(222,71);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "1"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:223:5: ( THIS WHITE_SPACE )? PAST
                    {
                    dbg.location(223,5);
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:223:5: ( THIS WHITE_SPACE )?
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

                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:223:6: THIS WHITE_SPACE
                            {
                            dbg.location(223,6);
                            THIS148=(Token)match(input,THIS,FOLLOW_THIS_in_relative_prefix1794); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_THIS.add(THIS148);

                            dbg.location(223,11);
                            WHITE_SPACE149=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_relative_prefix1796); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE149);


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(39);}

                    dbg.location(223,25);
                    PAST150=(Token)match(input,PAST,FOLLOW_PAST_in_relative_prefix1800); if (state.failed) return retval; 
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
                    // 223:34: -> DIRECTION[\"<\"] SEEK_BY[\"by_day\"] INT[\"1\"]
                    {
                        dbg.location(223,37);
                        adaptor.addChild(root_0, (Object)adaptor.create(DIRECTION, "<"));
                        dbg.location(223,52);
                        adaptor.addChild(root_0, (Object)adaptor.create(SEEK_BY, "by_day"));
                        dbg.location(223,70);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "1"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:224:5: ( THIS WHITE_SPACE )? COMING
                    {
                    dbg.location(224,5);
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:224:5: ( THIS WHITE_SPACE )?
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

                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:224:6: THIS WHITE_SPACE
                            {
                            dbg.location(224,6);
                            THIS151=(Token)match(input,THIS,FOLLOW_THIS_in_relative_prefix1822); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_THIS.add(THIS151);

                            dbg.location(224,11);
                            WHITE_SPACE152=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_relative_prefix1824); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE152);


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(40);}

                    dbg.location(224,25);
                    COMING153=(Token)match(input,COMING,FOLLOW_COMING_in_relative_prefix1828); if (state.failed) return retval; 
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
                case 5 :
                    dbg.enterAlt(5);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:225:5: ( THIS WHITE_SPACE )? UPCOMING
                    {
                    dbg.location(225,5);
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:225:5: ( THIS WHITE_SPACE )?
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

                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:225:6: THIS WHITE_SPACE
                            {
                            dbg.location(225,6);
                            THIS154=(Token)match(input,THIS,FOLLOW_THIS_in_relative_prefix1848); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_THIS.add(THIS154);

                            dbg.location(225,11);
                            WHITE_SPACE155=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_relative_prefix1850); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE155);


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(41);}

                    dbg.location(225,25);
                    UPCOMING156=(Token)match(input,UPCOMING,FOLLOW_UPCOMING_in_relative_prefix1854); if (state.failed) return retval; 
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
                    // 225:34: -> DIRECTION[\">\"] SEEK_BY[\"by_day\"] INT[\"1\"]
                    {
                        dbg.location(225,37);
                        adaptor.addChild(root_0, (Object)adaptor.create(DIRECTION, ">"));
                        dbg.location(225,52);
                        adaptor.addChild(root_0, (Object)adaptor.create(SEEK_BY, "by_day"));
                        dbg.location(225,70);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "1"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 6 :
                    dbg.enterAlt(6);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:226:5: ( IN WHITE_SPACE )? spelled_or_int_01_to_31_optional_prefix
                    {
                    dbg.location(226,5);
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:226:5: ( IN WHITE_SPACE )?
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

                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:226:6: IN WHITE_SPACE
                            {
                            dbg.location(226,6);
                            IN157=(Token)match(input,IN,FOLLOW_IN_in_relative_prefix1872); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_IN.add(IN157);

                            dbg.location(226,9);
                            WHITE_SPACE158=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_relative_prefix1874); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE158);


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(42);}

                    dbg.location(226,23);
                    pushFollow(FOLLOW_spelled_or_int_01_to_31_optional_prefix_in_relative_prefix1878);
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
                    // 227:7: -> DIRECTION[\">\"] SEEK_BY[\"by_day\"] spelled_or_int_01_to_31_optional_prefix
                    {
                        dbg.location(227,10);
                        adaptor.addChild(root_0, (Object)adaptor.create(DIRECTION, ">"));
                        dbg.location(227,25);
                        adaptor.addChild(root_0, (Object)adaptor.create(SEEK_BY, "by_day"));
                        dbg.location(227,43);
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
        dbg.location(228, 3);

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
    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:230:1: relative_suffix : ( FROM WHITE_SPACE NOW -> DIRECTION[\">\"] SEEK_BY[\"by_day\"] | AGO -> DIRECTION[\"<\"] SEEK_BY[\"by_day\"] );
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
        dbg.location(230, 1);

        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:231:3: ( FROM WHITE_SPACE NOW -> DIRECTION[\">\"] SEEK_BY[\"by_day\"] | AGO -> DIRECTION[\"<\"] SEEK_BY[\"by_day\"] )
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

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:231:5: FROM WHITE_SPACE NOW
                    {
                    dbg.location(231,5);
                    FROM160=(Token)match(input,FROM,FOLLOW_FROM_in_relative_suffix1910); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FROM.add(FROM160);

                    dbg.location(231,10);
                    WHITE_SPACE161=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_relative_suffix1912); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE161);

                    dbg.location(231,22);
                    NOW162=(Token)match(input,NOW,FOLLOW_NOW_in_relative_suffix1914); if (state.failed) return retval; 
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
                    // 231:26: -> DIRECTION[\">\"] SEEK_BY[\"by_day\"]
                    {
                        dbg.location(231,29);
                        adaptor.addChild(root_0, (Object)adaptor.create(DIRECTION, ">"));
                        dbg.location(231,44);
                        adaptor.addChild(root_0, (Object)adaptor.create(SEEK_BY, "by_day"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:232:5: AGO
                    {
                    dbg.location(232,5);
                    AGO163=(Token)match(input,AGO,FOLLOW_AGO_in_relative_suffix1928); if (state.failed) return retval; 
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
                    // 232:26: -> DIRECTION[\"<\"] SEEK_BY[\"by_day\"]
                    {
                        dbg.location(232,29);
                        adaptor.addChild(root_0, (Object)adaptor.create(DIRECTION, "<"));
                        dbg.location(232,44);
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
        dbg.location(233, 3);

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
    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:235:1: relative_date_span : ( DAY -> SPAN[\"day\"] | WEEK -> SPAN[\"week\"] | MONTH -> SPAN[\"month\"] | YEAR -> SPAN[\"year\"] );
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
        dbg.location(235, 1);

        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:236:3: ( DAY -> SPAN[\"day\"] | WEEK -> SPAN[\"week\"] | MONTH -> SPAN[\"month\"] | YEAR -> SPAN[\"year\"] )
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

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:236:5: DAY
                    {
                    dbg.location(236,5);
                    DAY164=(Token)match(input,DAY,FOLLOW_DAY_in_relative_date_span1968); if (state.failed) return retval; 
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
                    // 236:11: -> SPAN[\"day\"]
                    {
                        dbg.location(236,14);
                        adaptor.addChild(root_0, (Object)adaptor.create(SPAN, "day"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:237:5: WEEK
                    {
                    dbg.location(237,5);
                    WEEK165=(Token)match(input,WEEK,FOLLOW_WEEK_in_relative_date_span1981); if (state.failed) return retval; 
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
                    // 237:11: -> SPAN[\"week\"]
                    {
                        dbg.location(237,14);
                        adaptor.addChild(root_0, (Object)adaptor.create(SPAN, "week"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:238:5: MONTH
                    {
                    dbg.location(238,5);
                    MONTH166=(Token)match(input,MONTH,FOLLOW_MONTH_in_relative_date_span1993); if (state.failed) return retval; 
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
                    // 238:11: -> SPAN[\"month\"]
                    {
                        dbg.location(238,14);
                        adaptor.addChild(root_0, (Object)adaptor.create(SPAN, "month"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:239:5: YEAR
                    {
                    dbg.location(239,5);
                    YEAR167=(Token)match(input,YEAR,FOLLOW_YEAR_in_relative_date_span2004); if (state.failed) return retval; 
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
                    // 239:11: -> SPAN[\"year\"]
                    {
                        dbg.location(239,14);
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
        dbg.location(240, 3);

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
    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:242:1: day_of_week : ( SUNDAY -> ^( DAY_OF_WEEK INT[\"1\"] ) | MONDAY -> ^( DAY_OF_WEEK INT[\"2\"] ) | TUESDAY -> ^( DAY_OF_WEEK INT[\"3\"] ) | WEDNESDAY -> ^( DAY_OF_WEEK INT[\"4\"] ) | THURSDAY -> ^( DAY_OF_WEEK INT[\"5\"] ) | FRIDAY -> ^( DAY_OF_WEEK INT[\"6\"] ) | SATURDAY -> ^( DAY_OF_WEEK INT[\"7\"] ) );
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
        dbg.location(242, 1);

        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:243:3: ( SUNDAY -> ^( DAY_OF_WEEK INT[\"1\"] ) | MONDAY -> ^( DAY_OF_WEEK INT[\"2\"] ) | TUESDAY -> ^( DAY_OF_WEEK INT[\"3\"] ) | WEDNESDAY -> ^( DAY_OF_WEEK INT[\"4\"] ) | THURSDAY -> ^( DAY_OF_WEEK INT[\"5\"] ) | FRIDAY -> ^( DAY_OF_WEEK INT[\"6\"] ) | SATURDAY -> ^( DAY_OF_WEEK INT[\"7\"] ) )
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

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:243:5: SUNDAY
                    {
                    dbg.location(243,5);
                    SUNDAY168=(Token)match(input,SUNDAY,FOLLOW_SUNDAY_in_day_of_week2024); if (state.failed) return retval; 
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
                    // 243:15: -> ^( DAY_OF_WEEK INT[\"1\"] )
                    {
                        dbg.location(243,18);
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:243:18: ^( DAY_OF_WEEK INT[\"1\"] )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(243,20);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DAY_OF_WEEK, "DAY_OF_WEEK"), root_1);

                        dbg.location(243,32);
                        adaptor.addChild(root_1, (Object)adaptor.create(INT, "1"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:244:5: MONDAY
                    {
                    dbg.location(244,5);
                    MONDAY169=(Token)match(input,MONDAY,FOLLOW_MONDAY_in_day_of_week2042); if (state.failed) return retval; 
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
                    // 244:15: -> ^( DAY_OF_WEEK INT[\"2\"] )
                    {
                        dbg.location(244,18);
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:244:18: ^( DAY_OF_WEEK INT[\"2\"] )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(244,20);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DAY_OF_WEEK, "DAY_OF_WEEK"), root_1);

                        dbg.location(244,32);
                        adaptor.addChild(root_1, (Object)adaptor.create(INT, "2"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:245:5: TUESDAY
                    {
                    dbg.location(245,5);
                    TUESDAY170=(Token)match(input,TUESDAY,FOLLOW_TUESDAY_in_day_of_week2060); if (state.failed) return retval; 
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
                    // 245:15: -> ^( DAY_OF_WEEK INT[\"3\"] )
                    {
                        dbg.location(245,18);
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:245:18: ^( DAY_OF_WEEK INT[\"3\"] )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(245,20);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DAY_OF_WEEK, "DAY_OF_WEEK"), root_1);

                        dbg.location(245,32);
                        adaptor.addChild(root_1, (Object)adaptor.create(INT, "3"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:246:5: WEDNESDAY
                    {
                    dbg.location(246,5);
                    WEDNESDAY171=(Token)match(input,WEDNESDAY,FOLLOW_WEDNESDAY_in_day_of_week2077); if (state.failed) return retval; 
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
                    // 246:15: -> ^( DAY_OF_WEEK INT[\"4\"] )
                    {
                        dbg.location(246,18);
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:246:18: ^( DAY_OF_WEEK INT[\"4\"] )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(246,20);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DAY_OF_WEEK, "DAY_OF_WEEK"), root_1);

                        dbg.location(246,32);
                        adaptor.addChild(root_1, (Object)adaptor.create(INT, "4"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:247:5: THURSDAY
                    {
                    dbg.location(247,5);
                    THURSDAY172=(Token)match(input,THURSDAY,FOLLOW_THURSDAY_in_day_of_week2092); if (state.failed) return retval; 
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
                    // 247:15: -> ^( DAY_OF_WEEK INT[\"5\"] )
                    {
                        dbg.location(247,18);
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:247:18: ^( DAY_OF_WEEK INT[\"5\"] )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(247,20);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DAY_OF_WEEK, "DAY_OF_WEEK"), root_1);

                        dbg.location(247,32);
                        adaptor.addChild(root_1, (Object)adaptor.create(INT, "5"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 6 :
                    dbg.enterAlt(6);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:248:5: FRIDAY
                    {
                    dbg.location(248,5);
                    FRIDAY173=(Token)match(input,FRIDAY,FOLLOW_FRIDAY_in_day_of_week2108); if (state.failed) return retval; 
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
                    // 248:15: -> ^( DAY_OF_WEEK INT[\"6\"] )
                    {
                        dbg.location(248,18);
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:248:18: ^( DAY_OF_WEEK INT[\"6\"] )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(248,20);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DAY_OF_WEEK, "DAY_OF_WEEK"), root_1);

                        dbg.location(248,32);
                        adaptor.addChild(root_1, (Object)adaptor.create(INT, "6"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 7 :
                    dbg.enterAlt(7);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:249:5: SATURDAY
                    {
                    dbg.location(249,5);
                    SATURDAY174=(Token)match(input,SATURDAY,FOLLOW_SATURDAY_in_day_of_week2126); if (state.failed) return retval; 
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
                    // 249:15: -> ^( DAY_OF_WEEK INT[\"7\"] )
                    {
                        dbg.location(249,18);
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:249:18: ^( DAY_OF_WEEK INT[\"7\"] )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(249,20);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DAY_OF_WEEK, "DAY_OF_WEEK"), root_1);

                        dbg.location(249,32);
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
        dbg.location(250, 3);

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
    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:252:1: named_relative_date : ( TODAY -> ^( RELATIVE_DATE ^( SEEK DIRECTION[\">\"] SEEK_BY[\"by_day\"] INT[\"0\"] SPAN[\"day\"] ) ) | TOMORROW -> ^( RELATIVE_DATE ^( SEEK DIRECTION[\">\"] SEEK_BY[\"by_day\"] INT[\"1\"] SPAN[\"day\"] ) ) | YESTERDAY -> ^( RELATIVE_DATE ^( SEEK DIRECTION[\"<\"] SEEK_BY[\"by_day\"] INT[\"1\"] SPAN[\"day\"] ) ) );
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
        dbg.location(252, 1);

        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:253:3: ( TODAY -> ^( RELATIVE_DATE ^( SEEK DIRECTION[\">\"] SEEK_BY[\"by_day\"] INT[\"0\"] SPAN[\"day\"] ) ) | TOMORROW -> ^( RELATIVE_DATE ^( SEEK DIRECTION[\">\"] SEEK_BY[\"by_day\"] INT[\"1\"] SPAN[\"day\"] ) ) | YESTERDAY -> ^( RELATIVE_DATE ^( SEEK DIRECTION[\"<\"] SEEK_BY[\"by_day\"] INT[\"1\"] SPAN[\"day\"] ) ) )
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

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:253:5: TODAY
                    {
                    dbg.location(253,5);
                    TODAY175=(Token)match(input,TODAY,FOLLOW_TODAY_in_named_relative_date2151); if (state.failed) return retval; 
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
                    // 253:15: -> ^( RELATIVE_DATE ^( SEEK DIRECTION[\">\"] SEEK_BY[\"by_day\"] INT[\"0\"] SPAN[\"day\"] ) )
                    {
                        dbg.location(253,18);
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:253:18: ^( RELATIVE_DATE ^( SEEK DIRECTION[\">\"] SEEK_BY[\"by_day\"] INT[\"0\"] SPAN[\"day\"] ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(253,20);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(RELATIVE_DATE, "RELATIVE_DATE"), root_1);

                        dbg.location(253,34);
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:253:34: ^( SEEK DIRECTION[\">\"] SEEK_BY[\"by_day\"] INT[\"0\"] SPAN[\"day\"] )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        dbg.location(253,36);
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(SEEK, "SEEK"), root_2);

                        dbg.location(253,41);
                        adaptor.addChild(root_2, (Object)adaptor.create(DIRECTION, ">"));
                        dbg.location(253,56);
                        adaptor.addChild(root_2, (Object)adaptor.create(SEEK_BY, "by_day"));
                        dbg.location(253,74);
                        adaptor.addChild(root_2, (Object)adaptor.create(INT, "0"));
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
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:254:5: TOMORROW
                    {
                    dbg.location(254,5);
                    TOMORROW176=(Token)match(input,TOMORROW,FOLLOW_TOMORROW_in_named_relative_date2183); if (state.failed) return retval; 
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
                    // 254:15: -> ^( RELATIVE_DATE ^( SEEK DIRECTION[\">\"] SEEK_BY[\"by_day\"] INT[\"1\"] SPAN[\"day\"] ) )
                    {
                        dbg.location(254,18);
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:254:18: ^( RELATIVE_DATE ^( SEEK DIRECTION[\">\"] SEEK_BY[\"by_day\"] INT[\"1\"] SPAN[\"day\"] ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(254,20);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(RELATIVE_DATE, "RELATIVE_DATE"), root_1);

                        dbg.location(254,34);
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:254:34: ^( SEEK DIRECTION[\">\"] SEEK_BY[\"by_day\"] INT[\"1\"] SPAN[\"day\"] )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        dbg.location(254,36);
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(SEEK, "SEEK"), root_2);

                        dbg.location(254,41);
                        adaptor.addChild(root_2, (Object)adaptor.create(DIRECTION, ">"));
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
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:255:5: YESTERDAY
                    {
                    dbg.location(255,5);
                    YESTERDAY177=(Token)match(input,YESTERDAY,FOLLOW_YESTERDAY_in_named_relative_date2212); if (state.failed) return retval; 
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
                    // 255:15: -> ^( RELATIVE_DATE ^( SEEK DIRECTION[\"<\"] SEEK_BY[\"by_day\"] INT[\"1\"] SPAN[\"day\"] ) )
                    {
                        dbg.location(255,18);
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:255:18: ^( RELATIVE_DATE ^( SEEK DIRECTION[\"<\"] SEEK_BY[\"by_day\"] INT[\"1\"] SPAN[\"day\"] ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(255,20);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(RELATIVE_DATE, "RELATIVE_DATE"), root_1);

                        dbg.location(255,34);
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:255:34: ^( SEEK DIRECTION[\"<\"] SEEK_BY[\"by_day\"] INT[\"1\"] SPAN[\"day\"] )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        dbg.location(255,36);
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(SEEK, "SEEK"), root_2);

                        dbg.location(255,41);
                        adaptor.addChild(root_2, (Object)adaptor.create(DIRECTION, "<"));
                        dbg.location(255,56);
                        adaptor.addChild(root_2, (Object)adaptor.create(SEEK_BY, "by_day"));
                        dbg.location(255,74);
                        adaptor.addChild(root_2, (Object)adaptor.create(INT, "1"));
                        dbg.location(255,83);
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
        dbg.location(256, 3);

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
    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:261:1: time : ( hours ( COLON )? minutes ( ( WHITE_SPACE )? ( meridian_indicator | ( MILITARY_HOUR_SUFFIX | HOUR ) ) )? ( ( WHITE_SPACE )? time_zone_abbreviation )? -> ^( EXPLICIT_TIME hours minutes ( meridian_indicator )? ( time_zone_abbreviation )? ) | hours ( ( WHITE_SPACE )? meridian_indicator )? ( ( WHITE_SPACE )? time_zone_abbreviation )? -> ^( EXPLICIT_TIME hours ^( MINUTES_OF_HOUR INT[\"0\"] ) ( meridian_indicator )? ( time_zone_abbreviation )? ) | named_time );
    public final DateParser.time_return time() throws RecognitionException {
        DateParser.time_return retval = new DateParser.time_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token COLON179=null;
        Token WHITE_SPACE181=null;
        Token MILITARY_HOUR_SUFFIX183=null;
        Token HOUR184=null;
        Token WHITE_SPACE185=null;
        Token WHITE_SPACE188=null;
        Token WHITE_SPACE190=null;
        DateParser.hours_return hours178 = null;

        DateParser.minutes_return minutes180 = null;

        DateParser.meridian_indicator_return meridian_indicator182 = null;

        DateParser.time_zone_abbreviation_return time_zone_abbreviation186 = null;

        DateParser.hours_return hours187 = null;

        DateParser.meridian_indicator_return meridian_indicator189 = null;

        DateParser.time_zone_abbreviation_return time_zone_abbreviation191 = null;

        DateParser.named_time_return named_time192 = null;


        Object COLON179_tree=null;
        Object WHITE_SPACE181_tree=null;
        Object MILITARY_HOUR_SUFFIX183_tree=null;
        Object HOUR184_tree=null;
        Object WHITE_SPACE185_tree=null;
        Object WHITE_SPACE188_tree=null;
        Object WHITE_SPACE190_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_HOUR=new RewriteRuleTokenStream(adaptor,"token HOUR");
        RewriteRuleTokenStream stream_MILITARY_HOUR_SUFFIX=new RewriteRuleTokenStream(adaptor,"token MILITARY_HOUR_SUFFIX");
        RewriteRuleTokenStream stream_WHITE_SPACE=new RewriteRuleTokenStream(adaptor,"token WHITE_SPACE");
        RewriteRuleSubtreeStream stream_meridian_indicator=new RewriteRuleSubtreeStream(adaptor,"rule meridian_indicator");
        RewriteRuleSubtreeStream stream_minutes=new RewriteRuleSubtreeStream(adaptor,"rule minutes");
        RewriteRuleSubtreeStream stream_hours=new RewriteRuleSubtreeStream(adaptor,"rule hours");
        RewriteRuleSubtreeStream stream_time_zone_abbreviation=new RewriteRuleSubtreeStream(adaptor,"rule time_zone_abbreviation");
        try { dbg.enterRule(getGrammarFileName(), "time");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(261, 1);

        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:262:3: ( hours ( COLON )? minutes ( ( WHITE_SPACE )? ( meridian_indicator | ( MILITARY_HOUR_SUFFIX | HOUR ) ) )? ( ( WHITE_SPACE )? time_zone_abbreviation )? -> ^( EXPLICIT_TIME hours minutes ( meridian_indicator )? ( time_zone_abbreviation )? ) | hours ( ( WHITE_SPACE )? meridian_indicator )? ( ( WHITE_SPACE )? time_zone_abbreviation )? -> ^( EXPLICIT_TIME hours ^( MINUTES_OF_HOUR INT[\"0\"] ) ( meridian_indicator )? ( time_zone_abbreviation )? ) | named_time )
            int alt59=3;
            try { dbg.enterDecision(59);

            try {
                isCyclicDecision = true;
                alt59 = dfa59.predict(input);
            }
            catch (NoViableAltException nvae) {
                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(59);}

            switch (alt59) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:262:5: hours ( COLON )? minutes ( ( WHITE_SPACE )? ( meridian_indicator | ( MILITARY_HOUR_SUFFIX | HOUR ) ) )? ( ( WHITE_SPACE )? time_zone_abbreviation )?
                    {
                    dbg.location(262,5);
                    pushFollow(FOLLOW_hours_in_time2252);
                    hours178=hours();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_hours.add(hours178.getTree());
                    dbg.location(262,11);
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:262:11: ( COLON )?
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

                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:262:11: COLON
                            {
                            dbg.location(262,11);
                            COLON179=(Token)match(input,COLON,FOLLOW_COLON_in_time2254); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_COLON.add(COLON179);


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(48);}

                    dbg.location(262,18);
                    pushFollow(FOLLOW_minutes_in_time2257);
                    minutes180=minutes();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_minutes.add(minutes180.getTree());
                    dbg.location(262,26);
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:262:26: ( ( WHITE_SPACE )? ( meridian_indicator | ( MILITARY_HOUR_SUFFIX | HOUR ) ) )?
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

                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:262:27: ( WHITE_SPACE )? ( meridian_indicator | ( MILITARY_HOUR_SUFFIX | HOUR ) )
                            {
                            dbg.location(262,27);
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:262:27: ( WHITE_SPACE )?
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

                                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:262:27: WHITE_SPACE
                                    {
                                    dbg.location(262,27);
                                    WHITE_SPACE181=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_time2260); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE181);


                                    }
                                    break;

                            }
                            } finally {dbg.exitSubRule(49);}

                            dbg.location(262,40);
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:262:40: ( meridian_indicator | ( MILITARY_HOUR_SUFFIX | HOUR ) )
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

                                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:262:41: meridian_indicator
                                    {
                                    dbg.location(262,41);
                                    pushFollow(FOLLOW_meridian_indicator_in_time2264);
                                    meridian_indicator182=meridian_indicator();

                                    state._fsp--;
                                    if (state.failed) return retval;
                                    if ( state.backtracking==0 ) stream_meridian_indicator.add(meridian_indicator182.getTree());

                                    }
                                    break;
                                case 2 :
                                    dbg.enterAlt(2);

                                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:262:62: ( MILITARY_HOUR_SUFFIX | HOUR )
                                    {
                                    dbg.location(262,62);
                                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:262:62: ( MILITARY_HOUR_SUFFIX | HOUR )
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

                                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:262:63: MILITARY_HOUR_SUFFIX
                                            {
                                            dbg.location(262,63);
                                            MILITARY_HOUR_SUFFIX183=(Token)match(input,MILITARY_HOUR_SUFFIX,FOLLOW_MILITARY_HOUR_SUFFIX_in_time2269); if (state.failed) return retval; 
                                            if ( state.backtracking==0 ) stream_MILITARY_HOUR_SUFFIX.add(MILITARY_HOUR_SUFFIX183);


                                            }
                                            break;
                                        case 2 :
                                            dbg.enterAlt(2);

                                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:262:86: HOUR
                                            {
                                            dbg.location(262,86);
                                            HOUR184=(Token)match(input,HOUR,FOLLOW_HOUR_in_time2273); if (state.failed) return retval; 
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

                    dbg.location(262,95);
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:262:95: ( ( WHITE_SPACE )? time_zone_abbreviation )?
                    int alt54=2;
                    try { dbg.enterSubRule(54);
                    try { dbg.enterDecision(54);

                    int LA54_0 = input.LA(1);

                    if ( (LA54_0==WHITE_SPACE) ) {
                        int LA54_1 = input.LA(2);

                        if ( ((LA54_1>=UTC && LA54_1<=HAST)) ) {
                            alt54=1;
                        }
                    }
                    else if ( ((LA54_0>=UTC && LA54_0<=HAST)) ) {
                        alt54=1;
                    }
                    } finally {dbg.exitDecision(54);}

                    switch (alt54) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:262:96: ( WHITE_SPACE )? time_zone_abbreviation
                            {
                            dbg.location(262,96);
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:262:96: ( WHITE_SPACE )?
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

                                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:262:96: WHITE_SPACE
                                    {
                                    dbg.location(262,96);
                                    WHITE_SPACE185=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_time2280); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE185);


                                    }
                                    break;

                            }
                            } finally {dbg.exitSubRule(53);}

                            dbg.location(262,109);
                            pushFollow(FOLLOW_time_zone_abbreviation_in_time2283);
                            time_zone_abbreviation186=time_zone_abbreviation();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_time_zone_abbreviation.add(time_zone_abbreviation186.getTree());

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(54);}



                    // AST REWRITE
                    // elements: hours, time_zone_abbreviation, minutes, meridian_indicator
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 263:7: -> ^( EXPLICIT_TIME hours minutes ( meridian_indicator )? ( time_zone_abbreviation )? )
                    {
                        dbg.location(263,10);
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:263:10: ^( EXPLICIT_TIME hours minutes ( meridian_indicator )? ( time_zone_abbreviation )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(263,12);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPLICIT_TIME, "EXPLICIT_TIME"), root_1);

                        dbg.location(263,26);
                        adaptor.addChild(root_1, stream_hours.nextTree());
                        dbg.location(263,32);
                        adaptor.addChild(root_1, stream_minutes.nextTree());
                        dbg.location(263,40);
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:263:40: ( meridian_indicator )?
                        if ( stream_meridian_indicator.hasNext() ) {
                            dbg.location(263,40);
                            adaptor.addChild(root_1, stream_meridian_indicator.nextTree());

                        }
                        stream_meridian_indicator.reset();
                        dbg.location(263,60);
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:263:60: ( time_zone_abbreviation )?
                        if ( stream_time_zone_abbreviation.hasNext() ) {
                            dbg.location(263,60);
                            adaptor.addChild(root_1, stream_time_zone_abbreviation.nextTree());

                        }
                        stream_time_zone_abbreviation.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:265:5: hours ( ( WHITE_SPACE )? meridian_indicator )? ( ( WHITE_SPACE )? time_zone_abbreviation )?
                    {
                    dbg.location(265,5);
                    pushFollow(FOLLOW_hours_in_time2320);
                    hours187=hours();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_hours.add(hours187.getTree());
                    dbg.location(265,11);
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:265:11: ( ( WHITE_SPACE )? meridian_indicator )?
                    int alt56=2;
                    try { dbg.enterSubRule(56);
                    try { dbg.enterDecision(56);

                    int LA56_0 = input.LA(1);

                    if ( (LA56_0==WHITE_SPACE) ) {
                        int LA56_1 = input.LA(2);

                        if ( ((LA56_1>=AM && LA56_1<=PM)) ) {
                            alt56=1;
                        }
                    }
                    else if ( ((LA56_0>=AM && LA56_0<=PM)) ) {
                        alt56=1;
                    }
                    } finally {dbg.exitDecision(56);}

                    switch (alt56) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:265:12: ( WHITE_SPACE )? meridian_indicator
                            {
                            dbg.location(265,12);
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:265:12: ( WHITE_SPACE )?
                            int alt55=2;
                            try { dbg.enterSubRule(55);
                            try { dbg.enterDecision(55);

                            int LA55_0 = input.LA(1);

                            if ( (LA55_0==WHITE_SPACE) ) {
                                alt55=1;
                            }
                            } finally {dbg.exitDecision(55);}

                            switch (alt55) {
                                case 1 :
                                    dbg.enterAlt(1);

                                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:265:12: WHITE_SPACE
                                    {
                                    dbg.location(265,12);
                                    WHITE_SPACE188=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_time2323); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE188);


                                    }
                                    break;

                            }
                            } finally {dbg.exitSubRule(55);}

                            dbg.location(265,25);
                            pushFollow(FOLLOW_meridian_indicator_in_time2326);
                            meridian_indicator189=meridian_indicator();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_meridian_indicator.add(meridian_indicator189.getTree());

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(56);}

                    dbg.location(265,46);
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:265:46: ( ( WHITE_SPACE )? time_zone_abbreviation )?
                    int alt58=2;
                    try { dbg.enterSubRule(58);
                    try { dbg.enterDecision(58);

                    int LA58_0 = input.LA(1);

                    if ( (LA58_0==WHITE_SPACE) ) {
                        int LA58_1 = input.LA(2);

                        if ( ((LA58_1>=UTC && LA58_1<=HAST)) ) {
                            alt58=1;
                        }
                    }
                    else if ( ((LA58_0>=UTC && LA58_0<=HAST)) ) {
                        alt58=1;
                    }
                    } finally {dbg.exitDecision(58);}

                    switch (alt58) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:265:47: ( WHITE_SPACE )? time_zone_abbreviation
                            {
                            dbg.location(265,47);
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:265:47: ( WHITE_SPACE )?
                            int alt57=2;
                            try { dbg.enterSubRule(57);
                            try { dbg.enterDecision(57);

                            int LA57_0 = input.LA(1);

                            if ( (LA57_0==WHITE_SPACE) ) {
                                alt57=1;
                            }
                            } finally {dbg.exitDecision(57);}

                            switch (alt57) {
                                case 1 :
                                    dbg.enterAlt(1);

                                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:265:47: WHITE_SPACE
                                    {
                                    dbg.location(265,47);
                                    WHITE_SPACE190=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_time2331); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE190);


                                    }
                                    break;

                            }
                            } finally {dbg.exitSubRule(57);}

                            dbg.location(265,60);
                            pushFollow(FOLLOW_time_zone_abbreviation_in_time2334);
                            time_zone_abbreviation191=time_zone_abbreviation();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_time_zone_abbreviation.add(time_zone_abbreviation191.getTree());

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(58);}



                    // AST REWRITE
                    // elements: time_zone_abbreviation, meridian_indicator, hours
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 266:7: -> ^( EXPLICIT_TIME hours ^( MINUTES_OF_HOUR INT[\"0\"] ) ( meridian_indicator )? ( time_zone_abbreviation )? )
                    {
                        dbg.location(266,10);
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:266:10: ^( EXPLICIT_TIME hours ^( MINUTES_OF_HOUR INT[\"0\"] ) ( meridian_indicator )? ( time_zone_abbreviation )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(266,12);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPLICIT_TIME, "EXPLICIT_TIME"), root_1);

                        dbg.location(266,26);
                        adaptor.addChild(root_1, stream_hours.nextTree());
                        dbg.location(266,32);
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:266:32: ^( MINUTES_OF_HOUR INT[\"0\"] )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        dbg.location(266,34);
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(MINUTES_OF_HOUR, "MINUTES_OF_HOUR"), root_2);

                        dbg.location(266,50);
                        adaptor.addChild(root_2, (Object)adaptor.create(INT, "0"));

                        adaptor.addChild(root_1, root_2);
                        }
                        dbg.location(266,60);
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:266:60: ( meridian_indicator )?
                        if ( stream_meridian_indicator.hasNext() ) {
                            dbg.location(266,60);
                            adaptor.addChild(root_1, stream_meridian_indicator.nextTree());

                        }
                        stream_meridian_indicator.reset();
                        dbg.location(266,80);
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:266:80: ( time_zone_abbreviation )?
                        if ( stream_time_zone_abbreviation.hasNext() ) {
                            dbg.location(266,80);
                            adaptor.addChild(root_1, stream_time_zone_abbreviation.nextTree());

                        }
                        stream_time_zone_abbreviation.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:268:5: named_time
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(268,5);
                    pushFollow(FOLLOW_named_time_in_time2376);
                    named_time192=named_time();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, named_time192.getTree());

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
        dbg.location(269, 3);

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
    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:272:1: hours : int_00_to_23_optional_prefix -> ^( HOURS_OF_DAY int_00_to_23_optional_prefix ) ;
    public final DateParser.hours_return hours() throws RecognitionException {
        DateParser.hours_return retval = new DateParser.hours_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        DateParser.int_00_to_23_optional_prefix_return int_00_to_23_optional_prefix193 = null;


        RewriteRuleSubtreeStream stream_int_00_to_23_optional_prefix=new RewriteRuleSubtreeStream(adaptor,"rule int_00_to_23_optional_prefix");
        try { dbg.enterRule(getGrammarFileName(), "hours");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(272, 1);

        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:273:3: ( int_00_to_23_optional_prefix -> ^( HOURS_OF_DAY int_00_to_23_optional_prefix ) )
            dbg.enterAlt(1);

            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:273:5: int_00_to_23_optional_prefix
            {
            dbg.location(273,5);
            pushFollow(FOLLOW_int_00_to_23_optional_prefix_in_hours2391);
            int_00_to_23_optional_prefix193=int_00_to_23_optional_prefix();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_int_00_to_23_optional_prefix.add(int_00_to_23_optional_prefix193.getTree());


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
            // 273:34: -> ^( HOURS_OF_DAY int_00_to_23_optional_prefix )
            {
                dbg.location(273,37);
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:273:37: ^( HOURS_OF_DAY int_00_to_23_optional_prefix )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(273,39);
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(HOURS_OF_DAY, "HOURS_OF_DAY"), root_1);

                dbg.location(273,52);
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
        dbg.location(274, 3);

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
    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:277:1: minutes : int_00_to_59_mandatory_prefix -> ^( MINUTES_OF_HOUR int_00_to_59_mandatory_prefix ) ;
    public final DateParser.minutes_return minutes() throws RecognitionException {
        DateParser.minutes_return retval = new DateParser.minutes_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        DateParser.int_00_to_59_mandatory_prefix_return int_00_to_59_mandatory_prefix194 = null;


        RewriteRuleSubtreeStream stream_int_00_to_59_mandatory_prefix=new RewriteRuleSubtreeStream(adaptor,"rule int_00_to_59_mandatory_prefix");
        try { dbg.enterRule(getGrammarFileName(), "minutes");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(277, 1);

        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:278:3: ( int_00_to_59_mandatory_prefix -> ^( MINUTES_OF_HOUR int_00_to_59_mandatory_prefix ) )
            dbg.enterAlt(1);

            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:278:5: int_00_to_59_mandatory_prefix
            {
            dbg.location(278,5);
            pushFollow(FOLLOW_int_00_to_59_mandatory_prefix_in_minutes2415);
            int_00_to_59_mandatory_prefix194=int_00_to_59_mandatory_prefix();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_int_00_to_59_mandatory_prefix.add(int_00_to_59_mandatory_prefix194.getTree());


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
            // 278:35: -> ^( MINUTES_OF_HOUR int_00_to_59_mandatory_prefix )
            {
                dbg.location(278,38);
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:278:38: ^( MINUTES_OF_HOUR int_00_to_59_mandatory_prefix )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(278,40);
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(MINUTES_OF_HOUR, "MINUTES_OF_HOUR"), root_1);

                dbg.location(278,56);
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
        dbg.location(279, 3);

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
    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:282:1: meridian_indicator : ( AM -> AM_PM[\"am\"] | PM -> AM_PM[\"pm\"] );
    public final DateParser.meridian_indicator_return meridian_indicator() throws RecognitionException {
        DateParser.meridian_indicator_return retval = new DateParser.meridian_indicator_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token AM195=null;
        Token PM196=null;

        Object AM195_tree=null;
        Object PM196_tree=null;
        RewriteRuleTokenStream stream_PM=new RewriteRuleTokenStream(adaptor,"token PM");
        RewriteRuleTokenStream stream_AM=new RewriteRuleTokenStream(adaptor,"token AM");

        try { dbg.enterRule(getGrammarFileName(), "meridian_indicator");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(282, 1);

        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:283:3: ( AM -> AM_PM[\"am\"] | PM -> AM_PM[\"pm\"] )
            int alt60=2;
            try { dbg.enterDecision(60);

            int LA60_0 = input.LA(1);

            if ( (LA60_0==AM) ) {
                alt60=1;
            }
            else if ( (LA60_0==PM) ) {
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

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:283:5: AM
                    {
                    dbg.location(283,5);
                    AM195=(Token)match(input,AM,FOLLOW_AM_in_meridian_indicator2439); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AM.add(AM195);



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
                    // 283:8: -> AM_PM[\"am\"]
                    {
                        dbg.location(283,11);
                        adaptor.addChild(root_0, (Object)adaptor.create(AM_PM, "am"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:284:5: PM
                    {
                    dbg.location(284,5);
                    PM196=(Token)match(input,PM,FOLLOW_PM_in_meridian_indicator2450); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PM.add(PM196);



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
                    // 284:8: -> AM_PM[\"pm\"]
                    {
                        dbg.location(284,11);
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
        dbg.location(285, 3);

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
    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:287:1: named_time : ( NOON -> ^( EXPLICIT_TIME ^( HOURS_OF_DAY INT[\"12\"] ) ^( MINUTES_OF_HOUR INT[\"0\"] ) AM_PM[\"pm\"] ) | MIDNIGHT -> ^( EXPLICIT_TIME ^( HOURS_OF_DAY INT[\"12\"] ) ^( MINUTES_OF_HOUR INT[\"0\"] ) AM_PM[\"am\"] ) );
    public final DateParser.named_time_return named_time() throws RecognitionException {
        DateParser.named_time_return retval = new DateParser.named_time_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token NOON197=null;
        Token MIDNIGHT198=null;

        Object NOON197_tree=null;
        Object MIDNIGHT198_tree=null;
        RewriteRuleTokenStream stream_NOON=new RewriteRuleTokenStream(adaptor,"token NOON");
        RewriteRuleTokenStream stream_MIDNIGHT=new RewriteRuleTokenStream(adaptor,"token MIDNIGHT");

        try { dbg.enterRule(getGrammarFileName(), "named_time");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(287, 1);

        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:288:3: ( NOON -> ^( EXPLICIT_TIME ^( HOURS_OF_DAY INT[\"12\"] ) ^( MINUTES_OF_HOUR INT[\"0\"] ) AM_PM[\"pm\"] ) | MIDNIGHT -> ^( EXPLICIT_TIME ^( HOURS_OF_DAY INT[\"12\"] ) ^( MINUTES_OF_HOUR INT[\"0\"] ) AM_PM[\"am\"] ) )
            int alt61=2;
            try { dbg.enterDecision(61);

            int LA61_0 = input.LA(1);

            if ( (LA61_0==NOON) ) {
                alt61=1;
            }
            else if ( (LA61_0==MIDNIGHT) ) {
                alt61=2;
            }
            else {
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

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:288:5: NOON
                    {
                    dbg.location(288,5);
                    NOON197=(Token)match(input,NOON,FOLLOW_NOON_in_named_time2470); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NOON.add(NOON197);



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
                    // 288:14: -> ^( EXPLICIT_TIME ^( HOURS_OF_DAY INT[\"12\"] ) ^( MINUTES_OF_HOUR INT[\"0\"] ) AM_PM[\"pm\"] )
                    {
                        dbg.location(288,17);
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:288:17: ^( EXPLICIT_TIME ^( HOURS_OF_DAY INT[\"12\"] ) ^( MINUTES_OF_HOUR INT[\"0\"] ) AM_PM[\"pm\"] )
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
                        adaptor.addChild(root_1, (Object)adaptor.create(AM_PM, "pm"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:289:5: MIDNIGHT
                    {
                    dbg.location(289,5);
                    MIDNIGHT198=(Token)match(input,MIDNIGHT,FOLLOW_MIDNIGHT_in_named_time2503); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_MIDNIGHT.add(MIDNIGHT198);



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
                    // 289:14: -> ^( EXPLICIT_TIME ^( HOURS_OF_DAY INT[\"12\"] ) ^( MINUTES_OF_HOUR INT[\"0\"] ) AM_PM[\"am\"] )
                    {
                        dbg.location(289,17);
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:289:17: ^( EXPLICIT_TIME ^( HOURS_OF_DAY INT[\"12\"] ) ^( MINUTES_OF_HOUR INT[\"0\"] ) AM_PM[\"am\"] )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(289,19);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPLICIT_TIME, "EXPLICIT_TIME"), root_1);

                        dbg.location(289,33);
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:289:33: ^( HOURS_OF_DAY INT[\"12\"] )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        dbg.location(289,35);
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(HOURS_OF_DAY, "HOURS_OF_DAY"), root_2);

                        dbg.location(289,48);
                        adaptor.addChild(root_2, (Object)adaptor.create(INT, "12"));

                        adaptor.addChild(root_1, root_2);
                        }
                        dbg.location(289,59);
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:289:59: ^( MINUTES_OF_HOUR INT[\"0\"] )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        dbg.location(289,61);
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(MINUTES_OF_HOUR, "MINUTES_OF_HOUR"), root_2);

                        dbg.location(289,77);
                        adaptor.addChild(root_2, (Object)adaptor.create(INT, "0"));

                        adaptor.addChild(root_1, root_2);
                        }
                        dbg.location(289,87);
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
        dbg.location(290, 3);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "named_time");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "named_time"

    public static class time_zone_abbreviation_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "time_zone_abbreviation"
    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:292:1: time_zone_abbreviation : ( UTC -> ZONE[\"UTC\"] | EST -> ZONE[\"America/New_York\"] | CST -> ZONE[\"America/Chicago\"] | PST -> ZONE[\"America/Los_Angeles\"] | MST -> ZONE[\"America/Denver\"] | AKST -> ZONE[\"America/Anchorage\"] | HAST -> ZONE[\"Pacific/Honolulu\"] );
    public final DateParser.time_zone_abbreviation_return time_zone_abbreviation() throws RecognitionException {
        DateParser.time_zone_abbreviation_return retval = new DateParser.time_zone_abbreviation_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token UTC199=null;
        Token EST200=null;
        Token CST201=null;
        Token PST202=null;
        Token MST203=null;
        Token AKST204=null;
        Token HAST205=null;

        Object UTC199_tree=null;
        Object EST200_tree=null;
        Object CST201_tree=null;
        Object PST202_tree=null;
        Object MST203_tree=null;
        Object AKST204_tree=null;
        Object HAST205_tree=null;
        RewriteRuleTokenStream stream_CST=new RewriteRuleTokenStream(adaptor,"token CST");
        RewriteRuleTokenStream stream_HAST=new RewriteRuleTokenStream(adaptor,"token HAST");
        RewriteRuleTokenStream stream_PST=new RewriteRuleTokenStream(adaptor,"token PST");
        RewriteRuleTokenStream stream_UTC=new RewriteRuleTokenStream(adaptor,"token UTC");
        RewriteRuleTokenStream stream_EST=new RewriteRuleTokenStream(adaptor,"token EST");
        RewriteRuleTokenStream stream_AKST=new RewriteRuleTokenStream(adaptor,"token AKST");
        RewriteRuleTokenStream stream_MST=new RewriteRuleTokenStream(adaptor,"token MST");

        try { dbg.enterRule(getGrammarFileName(), "time_zone_abbreviation");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(292, 1);

        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:293:3: ( UTC -> ZONE[\"UTC\"] | EST -> ZONE[\"America/New_York\"] | CST -> ZONE[\"America/Chicago\"] | PST -> ZONE[\"America/Los_Angeles\"] | MST -> ZONE[\"America/Denver\"] | AKST -> ZONE[\"America/Anchorage\"] | HAST -> ZONE[\"Pacific/Honolulu\"] )
            int alt62=7;
            try { dbg.enterDecision(62);

            switch ( input.LA(1) ) {
            case UTC:
                {
                alt62=1;
                }
                break;
            case EST:
                {
                alt62=2;
                }
                break;
            case CST:
                {
                alt62=3;
                }
                break;
            case PST:
                {
                alt62=4;
                }
                break;
            case MST:
                {
                alt62=5;
                }
                break;
            case AKST:
                {
                alt62=6;
                }
                break;
            case HAST:
                {
                alt62=7;
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

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:293:5: UTC
                    {
                    dbg.location(293,5);
                    UTC199=(Token)match(input,UTC,FOLLOW_UTC_in_time_zone_abbreviation2541); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_UTC.add(UTC199);



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
                    // 293:10: -> ZONE[\"UTC\"]
                    {
                        dbg.location(293,13);
                        adaptor.addChild(root_0, (Object)adaptor.create(ZONE, "UTC"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:294:5: EST
                    {
                    dbg.location(294,5);
                    EST200=(Token)match(input,EST,FOLLOW_EST_in_time_zone_abbreviation2553); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EST.add(EST200);



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
                    // 294:10: -> ZONE[\"America/New_York\"]
                    {
                        dbg.location(294,13);
                        adaptor.addChild(root_0, (Object)adaptor.create(ZONE, "America/New_York"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:295:5: CST
                    {
                    dbg.location(295,5);
                    CST201=(Token)match(input,CST,FOLLOW_CST_in_time_zone_abbreviation2565); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CST.add(CST201);



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
                    // 295:10: -> ZONE[\"America/Chicago\"]
                    {
                        dbg.location(295,13);
                        adaptor.addChild(root_0, (Object)adaptor.create(ZONE, "America/Chicago"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:296:5: PST
                    {
                    dbg.location(296,5);
                    PST202=(Token)match(input,PST,FOLLOW_PST_in_time_zone_abbreviation2577); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PST.add(PST202);



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
                    // 296:10: -> ZONE[\"America/Los_Angeles\"]
                    {
                        dbg.location(296,13);
                        adaptor.addChild(root_0, (Object)adaptor.create(ZONE, "America/Los_Angeles"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:297:5: MST
                    {
                    dbg.location(297,5);
                    MST203=(Token)match(input,MST,FOLLOW_MST_in_time_zone_abbreviation2589); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_MST.add(MST203);



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
                    // 297:10: -> ZONE[\"America/Denver\"]
                    {
                        dbg.location(297,13);
                        adaptor.addChild(root_0, (Object)adaptor.create(ZONE, "America/Denver"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 6 :
                    dbg.enterAlt(6);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:298:5: AKST
                    {
                    dbg.location(298,5);
                    AKST204=(Token)match(input,AKST,FOLLOW_AKST_in_time_zone_abbreviation2601); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AKST.add(AKST204);



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
                    // 298:10: -> ZONE[\"America/Anchorage\"]
                    {
                        dbg.location(298,13);
                        adaptor.addChild(root_0, (Object)adaptor.create(ZONE, "America/Anchorage"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 7 :
                    dbg.enterAlt(7);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:299:5: HAST
                    {
                    dbg.location(299,5);
                    HAST205=(Token)match(input,HAST,FOLLOW_HAST_in_time_zone_abbreviation2612); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_HAST.add(HAST205);



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
                    // 299:10: -> ZONE[\"Pacific/Honolulu\"]
                    {
                        dbg.location(299,13);
                        adaptor.addChild(root_0, (Object)adaptor.create(ZONE, "Pacific/Honolulu"));

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
        dbg.location(300, 3);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "time_zone_abbreviation");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "time_zone_abbreviation"

    public static class int_00_to_23_optional_prefix_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "int_00_to_23_optional_prefix"
    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:305:1: int_00_to_23_optional_prefix : ( INT_0 | INT_00 | INT_1_TO_5 | INT_6_TO_9 | INT_01_TO_12 | INT_13_TO_23 ) -> INT[$int_00_to_23_optional_prefix.text] ;
    public final DateParser.int_00_to_23_optional_prefix_return int_00_to_23_optional_prefix() throws RecognitionException {
        DateParser.int_00_to_23_optional_prefix_return retval = new DateParser.int_00_to_23_optional_prefix_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token INT_0206=null;
        Token INT_00207=null;
        Token INT_1_TO_5208=null;
        Token INT_6_TO_9209=null;
        Token INT_01_TO_12210=null;
        Token INT_13_TO_23211=null;

        Object INT_0206_tree=null;
        Object INT_00207_tree=null;
        Object INT_1_TO_5208_tree=null;
        Object INT_6_TO_9209_tree=null;
        Object INT_01_TO_12210_tree=null;
        Object INT_13_TO_23211_tree=null;
        RewriteRuleTokenStream stream_INT_1_TO_5=new RewriteRuleTokenStream(adaptor,"token INT_1_TO_5");
        RewriteRuleTokenStream stream_INT_13_TO_23=new RewriteRuleTokenStream(adaptor,"token INT_13_TO_23");
        RewriteRuleTokenStream stream_INT_00=new RewriteRuleTokenStream(adaptor,"token INT_00");
        RewriteRuleTokenStream stream_INT_6_TO_9=new RewriteRuleTokenStream(adaptor,"token INT_6_TO_9");
        RewriteRuleTokenStream stream_INT_01_TO_12=new RewriteRuleTokenStream(adaptor,"token INT_01_TO_12");
        RewriteRuleTokenStream stream_INT_0=new RewriteRuleTokenStream(adaptor,"token INT_0");

        try { dbg.enterRule(getGrammarFileName(), "int_00_to_23_optional_prefix");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(305, 1);

        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:306:3: ( ( INT_0 | INT_00 | INT_1_TO_5 | INT_6_TO_9 | INT_01_TO_12 | INT_13_TO_23 ) -> INT[$int_00_to_23_optional_prefix.text] )
            dbg.enterAlt(1);

            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:306:5: ( INT_0 | INT_00 | INT_1_TO_5 | INT_6_TO_9 | INT_01_TO_12 | INT_13_TO_23 )
            {
            dbg.location(306,5);
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:306:5: ( INT_0 | INT_00 | INT_1_TO_5 | INT_6_TO_9 | INT_01_TO_12 | INT_13_TO_23 )
            int alt63=6;
            try { dbg.enterSubRule(63);
            try { dbg.enterDecision(63);

            switch ( input.LA(1) ) {
            case INT_0:
                {
                alt63=1;
                }
                break;
            case INT_00:
                {
                alt63=2;
                }
                break;
            case INT_1_TO_5:
                {
                alt63=3;
                }
                break;
            case INT_6_TO_9:
                {
                alt63=4;
                }
                break;
            case INT_01_TO_12:
                {
                alt63=5;
                }
                break;
            case INT_13_TO_23:
                {
                alt63=6;
                }
                break;
            default:
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

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:306:6: INT_0
                    {
                    dbg.location(306,6);
                    INT_0206=(Token)match(input,INT_0,FOLLOW_INT_0_in_int_00_to_23_optional_prefix2636); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INT_0.add(INT_0206);


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:307:5: INT_00
                    {
                    dbg.location(307,5);
                    INT_00207=(Token)match(input,INT_00,FOLLOW_INT_00_in_int_00_to_23_optional_prefix2642); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INT_00.add(INT_00207);


                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:308:5: INT_1_TO_5
                    {
                    dbg.location(308,5);
                    INT_1_TO_5208=(Token)match(input,INT_1_TO_5,FOLLOW_INT_1_TO_5_in_int_00_to_23_optional_prefix2648); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INT_1_TO_5.add(INT_1_TO_5208);


                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:309:5: INT_6_TO_9
                    {
                    dbg.location(309,5);
                    INT_6_TO_9209=(Token)match(input,INT_6_TO_9,FOLLOW_INT_6_TO_9_in_int_00_to_23_optional_prefix2654); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INT_6_TO_9.add(INT_6_TO_9209);


                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:310:5: INT_01_TO_12
                    {
                    dbg.location(310,5);
                    INT_01_TO_12210=(Token)match(input,INT_01_TO_12,FOLLOW_INT_01_TO_12_in_int_00_to_23_optional_prefix2660); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INT_01_TO_12.add(INT_01_TO_12210);


                    }
                    break;
                case 6 :
                    dbg.enterAlt(6);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:311:5: INT_13_TO_23
                    {
                    dbg.location(311,5);
                    INT_13_TO_23211=(Token)match(input,INT_13_TO_23,FOLLOW_INT_13_TO_23_in_int_00_to_23_optional_prefix2666); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INT_13_TO_23.add(INT_13_TO_23211);


                    }
                    break;

            }
            } finally {dbg.exitSubRule(63);}



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
            // 311:19: -> INT[$int_00_to_23_optional_prefix.text]
            {
                dbg.location(311,22);
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
        dbg.location(312, 3);

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
    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:315:1: int_00_to_59_mandatory_prefix : ( INT_00 | INT_01_TO_12 | INT_13_TO_23 | INT_24_TO_31 | INT_32_TO_59 ) -> INT[$int_00_to_59_mandatory_prefix.text] ;
    public final DateParser.int_00_to_59_mandatory_prefix_return int_00_to_59_mandatory_prefix() throws RecognitionException {
        DateParser.int_00_to_59_mandatory_prefix_return retval = new DateParser.int_00_to_59_mandatory_prefix_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token INT_00212=null;
        Token INT_01_TO_12213=null;
        Token INT_13_TO_23214=null;
        Token INT_24_TO_31215=null;
        Token INT_32_TO_59216=null;

        Object INT_00212_tree=null;
        Object INT_01_TO_12213_tree=null;
        Object INT_13_TO_23214_tree=null;
        Object INT_24_TO_31215_tree=null;
        Object INT_32_TO_59216_tree=null;
        RewriteRuleTokenStream stream_INT_24_TO_31=new RewriteRuleTokenStream(adaptor,"token INT_24_TO_31");
        RewriteRuleTokenStream stream_INT_13_TO_23=new RewriteRuleTokenStream(adaptor,"token INT_13_TO_23");
        RewriteRuleTokenStream stream_INT_00=new RewriteRuleTokenStream(adaptor,"token INT_00");
        RewriteRuleTokenStream stream_INT_32_TO_59=new RewriteRuleTokenStream(adaptor,"token INT_32_TO_59");
        RewriteRuleTokenStream stream_INT_01_TO_12=new RewriteRuleTokenStream(adaptor,"token INT_01_TO_12");

        try { dbg.enterRule(getGrammarFileName(), "int_00_to_59_mandatory_prefix");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(315, 1);

        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:316:3: ( ( INT_00 | INT_01_TO_12 | INT_13_TO_23 | INT_24_TO_31 | INT_32_TO_59 ) -> INT[$int_00_to_59_mandatory_prefix.text] )
            dbg.enterAlt(1);

            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:316:5: ( INT_00 | INT_01_TO_12 | INT_13_TO_23 | INT_24_TO_31 | INT_32_TO_59 )
            {
            dbg.location(316,5);
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:316:5: ( INT_00 | INT_01_TO_12 | INT_13_TO_23 | INT_24_TO_31 | INT_32_TO_59 )
            int alt64=5;
            try { dbg.enterSubRule(64);
            try { dbg.enterDecision(64);

            switch ( input.LA(1) ) {
            case INT_00:
                {
                alt64=1;
                }
                break;
            case INT_01_TO_12:
                {
                alt64=2;
                }
                break;
            case INT_13_TO_23:
                {
                alt64=3;
                }
                break;
            case INT_24_TO_31:
                {
                alt64=4;
                }
                break;
            case INT_32_TO_59:
                {
                alt64=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 64, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(64);}

            switch (alt64) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:316:6: INT_00
                    {
                    dbg.location(316,6);
                    INT_00212=(Token)match(input,INT_00,FOLLOW_INT_00_in_int_00_to_59_mandatory_prefix2688); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INT_00.add(INT_00212);


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:317:5: INT_01_TO_12
                    {
                    dbg.location(317,5);
                    INT_01_TO_12213=(Token)match(input,INT_01_TO_12,FOLLOW_INT_01_TO_12_in_int_00_to_59_mandatory_prefix2694); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INT_01_TO_12.add(INT_01_TO_12213);


                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:318:5: INT_13_TO_23
                    {
                    dbg.location(318,5);
                    INT_13_TO_23214=(Token)match(input,INT_13_TO_23,FOLLOW_INT_13_TO_23_in_int_00_to_59_mandatory_prefix2700); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INT_13_TO_23.add(INT_13_TO_23214);


                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:319:5: INT_24_TO_31
                    {
                    dbg.location(319,5);
                    INT_24_TO_31215=(Token)match(input,INT_24_TO_31,FOLLOW_INT_24_TO_31_in_int_00_to_59_mandatory_prefix2706); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INT_24_TO_31.add(INT_24_TO_31215);


                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:320:5: INT_32_TO_59
                    {
                    dbg.location(320,5);
                    INT_32_TO_59216=(Token)match(input,INT_32_TO_59,FOLLOW_INT_32_TO_59_in_int_00_to_59_mandatory_prefix2712); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INT_32_TO_59.add(INT_32_TO_59216);


                    }
                    break;

            }
            } finally {dbg.exitSubRule(64);}



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
            // 320:19: -> INT[$int_00_to_59_mandatory_prefix.text]
            {
                dbg.location(320,22);
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
    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:324:1: int_00_to_99_mandatory_prefix : ( int_00_to_59_mandatory_prefix | INT_60_TO_99 -> INT[$INT_60_TO_99.text] );
    public final DateParser.int_00_to_99_mandatory_prefix_return int_00_to_99_mandatory_prefix() throws RecognitionException {
        DateParser.int_00_to_99_mandatory_prefix_return retval = new DateParser.int_00_to_99_mandatory_prefix_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token INT_60_TO_99218=null;
        DateParser.int_00_to_59_mandatory_prefix_return int_00_to_59_mandatory_prefix217 = null;


        Object INT_60_TO_99218_tree=null;
        RewriteRuleTokenStream stream_INT_60_TO_99=new RewriteRuleTokenStream(adaptor,"token INT_60_TO_99");

        try { dbg.enterRule(getGrammarFileName(), "int_00_to_99_mandatory_prefix");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(324, 1);

        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:325:3: ( int_00_to_59_mandatory_prefix | INT_60_TO_99 -> INT[$INT_60_TO_99.text] )
            int alt65=2;
            try { dbg.enterDecision(65);

            int LA65_0 = input.LA(1);

            if ( (LA65_0==INT_00||(LA65_0>=INT_01_TO_12 && LA65_0<=INT_32_TO_59)) ) {
                alt65=1;
            }
            else if ( (LA65_0==INT_60_TO_99) ) {
                alt65=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 65, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(65);}

            switch (alt65) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:325:5: int_00_to_59_mandatory_prefix
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(325,5);
                    pushFollow(FOLLOW_int_00_to_59_mandatory_prefix_in_int_00_to_99_mandatory_prefix2734);
                    int_00_to_59_mandatory_prefix217=int_00_to_59_mandatory_prefix();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, int_00_to_59_mandatory_prefix217.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:326:5: INT_60_TO_99
                    {
                    dbg.location(326,5);
                    INT_60_TO_99218=(Token)match(input,INT_60_TO_99,FOLLOW_INT_60_TO_99_in_int_00_to_99_mandatory_prefix2740); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INT_60_TO_99.add(INT_60_TO_99218);



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
                    // 326:18: -> INT[$INT_60_TO_99.text]
                    {
                        dbg.location(326,21);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, (INT_60_TO_99218!=null?INT_60_TO_99218.getText():null)));

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
        dbg.location(327, 3);

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
    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:330:1: int_01_to_12_optional_prefix : ( INT_1_TO_5 | INT_6_TO_9 | INT_01_TO_12 ) -> INT[$int_01_to_12_optional_prefix.text] ;
    public final DateParser.int_01_to_12_optional_prefix_return int_01_to_12_optional_prefix() throws RecognitionException {
        DateParser.int_01_to_12_optional_prefix_return retval = new DateParser.int_01_to_12_optional_prefix_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token INT_1_TO_5219=null;
        Token INT_6_TO_9220=null;
        Token INT_01_TO_12221=null;

        Object INT_1_TO_5219_tree=null;
        Object INT_6_TO_9220_tree=null;
        Object INT_01_TO_12221_tree=null;
        RewriteRuleTokenStream stream_INT_1_TO_5=new RewriteRuleTokenStream(adaptor,"token INT_1_TO_5");
        RewriteRuleTokenStream stream_INT_6_TO_9=new RewriteRuleTokenStream(adaptor,"token INT_6_TO_9");
        RewriteRuleTokenStream stream_INT_01_TO_12=new RewriteRuleTokenStream(adaptor,"token INT_01_TO_12");

        try { dbg.enterRule(getGrammarFileName(), "int_01_to_12_optional_prefix");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(330, 1);

        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:331:3: ( ( INT_1_TO_5 | INT_6_TO_9 | INT_01_TO_12 ) -> INT[$int_01_to_12_optional_prefix.text] )
            dbg.enterAlt(1);

            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:331:5: ( INT_1_TO_5 | INT_6_TO_9 | INT_01_TO_12 )
            {
            dbg.location(331,5);
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:331:5: ( INT_1_TO_5 | INT_6_TO_9 | INT_01_TO_12 )
            int alt66=3;
            try { dbg.enterSubRule(66);
            try { dbg.enterDecision(66);

            switch ( input.LA(1) ) {
            case INT_1_TO_5:
                {
                alt66=1;
                }
                break;
            case INT_6_TO_9:
                {
                alt66=2;
                }
                break;
            case INT_01_TO_12:
                {
                alt66=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 66, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(66);}

            switch (alt66) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:331:6: INT_1_TO_5
                    {
                    dbg.location(331,6);
                    INT_1_TO_5219=(Token)match(input,INT_1_TO_5,FOLLOW_INT_1_TO_5_in_int_01_to_12_optional_prefix2762); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INT_1_TO_5.add(INT_1_TO_5219);


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:331:19: INT_6_TO_9
                    {
                    dbg.location(331,19);
                    INT_6_TO_9220=(Token)match(input,INT_6_TO_9,FOLLOW_INT_6_TO_9_in_int_01_to_12_optional_prefix2766); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INT_6_TO_9.add(INT_6_TO_9220);


                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:331:32: INT_01_TO_12
                    {
                    dbg.location(331,32);
                    INT_01_TO_12221=(Token)match(input,INT_01_TO_12,FOLLOW_INT_01_TO_12_in_int_01_to_12_optional_prefix2770); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INT_01_TO_12.add(INT_01_TO_12221);


                    }
                    break;

            }
            } finally {dbg.exitSubRule(66);}



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
            // 331:46: -> INT[$int_01_to_12_optional_prefix.text]
            {
                dbg.location(331,49);
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
        dbg.location(332, 3);

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
    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:335:1: int_01_to_31_optional_prefix : ( INT_1_TO_5 | INT_6_TO_9 | INT_01_TO_12 | INT_13_TO_23 | INT_24_TO_31 ) -> INT[$int_01_to_31_optional_prefix.text] ;
    public final DateParser.int_01_to_31_optional_prefix_return int_01_to_31_optional_prefix() throws RecognitionException {
        DateParser.int_01_to_31_optional_prefix_return retval = new DateParser.int_01_to_31_optional_prefix_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token INT_1_TO_5222=null;
        Token INT_6_TO_9223=null;
        Token INT_01_TO_12224=null;
        Token INT_13_TO_23225=null;
        Token INT_24_TO_31226=null;

        Object INT_1_TO_5222_tree=null;
        Object INT_6_TO_9223_tree=null;
        Object INT_01_TO_12224_tree=null;
        Object INT_13_TO_23225_tree=null;
        Object INT_24_TO_31226_tree=null;
        RewriteRuleTokenStream stream_INT_24_TO_31=new RewriteRuleTokenStream(adaptor,"token INT_24_TO_31");
        RewriteRuleTokenStream stream_INT_1_TO_5=new RewriteRuleTokenStream(adaptor,"token INT_1_TO_5");
        RewriteRuleTokenStream stream_INT_13_TO_23=new RewriteRuleTokenStream(adaptor,"token INT_13_TO_23");
        RewriteRuleTokenStream stream_INT_6_TO_9=new RewriteRuleTokenStream(adaptor,"token INT_6_TO_9");
        RewriteRuleTokenStream stream_INT_01_TO_12=new RewriteRuleTokenStream(adaptor,"token INT_01_TO_12");

        try { dbg.enterRule(getGrammarFileName(), "int_01_to_31_optional_prefix");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(335, 1);

        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:336:3: ( ( INT_1_TO_5 | INT_6_TO_9 | INT_01_TO_12 | INT_13_TO_23 | INT_24_TO_31 ) -> INT[$int_01_to_31_optional_prefix.text] )
            dbg.enterAlt(1);

            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:336:5: ( INT_1_TO_5 | INT_6_TO_9 | INT_01_TO_12 | INT_13_TO_23 | INT_24_TO_31 )
            {
            dbg.location(336,5);
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:336:5: ( INT_1_TO_5 | INT_6_TO_9 | INT_01_TO_12 | INT_13_TO_23 | INT_24_TO_31 )
            int alt67=5;
            try { dbg.enterSubRule(67);
            try { dbg.enterDecision(67);

            switch ( input.LA(1) ) {
            case INT_1_TO_5:
                {
                alt67=1;
                }
                break;
            case INT_6_TO_9:
                {
                alt67=2;
                }
                break;
            case INT_01_TO_12:
                {
                alt67=3;
                }
                break;
            case INT_13_TO_23:
                {
                alt67=4;
                }
                break;
            case INT_24_TO_31:
                {
                alt67=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 67, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(67);}

            switch (alt67) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:336:6: INT_1_TO_5
                    {
                    dbg.location(336,6);
                    INT_1_TO_5222=(Token)match(input,INT_1_TO_5,FOLLOW_INT_1_TO_5_in_int_01_to_31_optional_prefix2793); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INT_1_TO_5.add(INT_1_TO_5222);


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:337:5: INT_6_TO_9
                    {
                    dbg.location(337,5);
                    INT_6_TO_9223=(Token)match(input,INT_6_TO_9,FOLLOW_INT_6_TO_9_in_int_01_to_31_optional_prefix2799); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INT_6_TO_9.add(INT_6_TO_9223);


                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:338:5: INT_01_TO_12
                    {
                    dbg.location(338,5);
                    INT_01_TO_12224=(Token)match(input,INT_01_TO_12,FOLLOW_INT_01_TO_12_in_int_01_to_31_optional_prefix2805); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INT_01_TO_12.add(INT_01_TO_12224);


                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:339:5: INT_13_TO_23
                    {
                    dbg.location(339,5);
                    INT_13_TO_23225=(Token)match(input,INT_13_TO_23,FOLLOW_INT_13_TO_23_in_int_01_to_31_optional_prefix2811); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INT_13_TO_23.add(INT_13_TO_23225);


                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:340:5: INT_24_TO_31
                    {
                    dbg.location(340,5);
                    INT_24_TO_31226=(Token)match(input,INT_24_TO_31,FOLLOW_INT_24_TO_31_in_int_01_to_31_optional_prefix2817); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INT_24_TO_31.add(INT_24_TO_31226);


                    }
                    break;

            }
            } finally {dbg.exitSubRule(67);}



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
            // 340:19: -> INT[$int_01_to_31_optional_prefix.text]
            {
                dbg.location(340,22);
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
        dbg.location(341, 3);

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
    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:344:1: int_four_digits : int_00_to_99_mandatory_prefix int_00_to_99_mandatory_prefix -> INT[$int_four_digits.text] ;
    public final DateParser.int_four_digits_return int_four_digits() throws RecognitionException {
        DateParser.int_four_digits_return retval = new DateParser.int_four_digits_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        DateParser.int_00_to_99_mandatory_prefix_return int_00_to_99_mandatory_prefix227 = null;

        DateParser.int_00_to_99_mandatory_prefix_return int_00_to_99_mandatory_prefix228 = null;


        RewriteRuleSubtreeStream stream_int_00_to_99_mandatory_prefix=new RewriteRuleSubtreeStream(adaptor,"rule int_00_to_99_mandatory_prefix");
        try { dbg.enterRule(getGrammarFileName(), "int_four_digits");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(344, 1);

        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:345:3: ( int_00_to_99_mandatory_prefix int_00_to_99_mandatory_prefix -> INT[$int_four_digits.text] )
            dbg.enterAlt(1);

            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:345:5: int_00_to_99_mandatory_prefix int_00_to_99_mandatory_prefix
            {
            dbg.location(345,5);
            pushFollow(FOLLOW_int_00_to_99_mandatory_prefix_in_int_four_digits2839);
            int_00_to_99_mandatory_prefix227=int_00_to_99_mandatory_prefix();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_int_00_to_99_mandatory_prefix.add(int_00_to_99_mandatory_prefix227.getTree());
            dbg.location(345,35);
            pushFollow(FOLLOW_int_00_to_99_mandatory_prefix_in_int_four_digits2841);
            int_00_to_99_mandatory_prefix228=int_00_to_99_mandatory_prefix();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_int_00_to_99_mandatory_prefix.add(int_00_to_99_mandatory_prefix228.getTree());


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
            // 346:7: -> INT[$int_four_digits.text]
            {
                dbg.location(346,10);
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
        dbg.location(347, 3);

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
    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:351:1: spelled_or_int_01_to_31_optional_prefix : ( int_01_to_31_optional_prefix | spelled_one_to_thirty_one );
    public final DateParser.spelled_or_int_01_to_31_optional_prefix_return spelled_or_int_01_to_31_optional_prefix() throws RecognitionException {
        DateParser.spelled_or_int_01_to_31_optional_prefix_return retval = new DateParser.spelled_or_int_01_to_31_optional_prefix_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        DateParser.int_01_to_31_optional_prefix_return int_01_to_31_optional_prefix229 = null;

        DateParser.spelled_one_to_thirty_one_return spelled_one_to_thirty_one230 = null;



        try { dbg.enterRule(getGrammarFileName(), "spelled_or_int_01_to_31_optional_prefix");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(351, 1);

        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:352:3: ( int_01_to_31_optional_prefix | spelled_one_to_thirty_one )
            int alt68=2;
            try { dbg.enterDecision(68);

            int LA68_0 = input.LA(1);

            if ( (LA68_0==INT_1_TO_5||(LA68_0>=INT_6_TO_9 && LA68_0<=INT_24_TO_31)) ) {
                alt68=1;
            }
            else if ( ((LA68_0>=ONE && LA68_0<=THIRTY)) ) {
                alt68=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 68, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(68);}

            switch (alt68) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:352:5: int_01_to_31_optional_prefix
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(352,5);
                    pushFollow(FOLLOW_int_01_to_31_optional_prefix_in_spelled_or_int_01_to_31_optional_prefix2869);
                    int_01_to_31_optional_prefix229=int_01_to_31_optional_prefix();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, int_01_to_31_optional_prefix229.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:353:5: spelled_one_to_thirty_one
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(353,5);
                    pushFollow(FOLLOW_spelled_one_to_thirty_one_in_spelled_or_int_01_to_31_optional_prefix2875);
                    spelled_one_to_thirty_one230=spelled_one_to_thirty_one();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, spelled_one_to_thirty_one230.getTree());

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
        dbg.location(354, 3);

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
    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:357:1: spelled_one_to_thirty_one : ( ONE -> INT[\"1\"] | TWO -> INT[\"2\"] | THREE -> INT[\"3\"] | FOUR -> INT[\"4\"] | FIVE -> INT[\"5\"] | SIX -> INT[\"6\"] | SEVEN -> INT[\"7\"] | EIGHT -> INT[\"8\"] | NINE -> INT[\"9\"] | TEN -> INT[\"10\"] | ELEVEN -> INT[\"11\"] | TWELVE -> INT[\"12\"] | THIRTEEN -> INT[\"13\"] | FOURTEEN -> INT[\"14\"] | FIFTEEN -> INT[\"15\"] | SIXTEEN -> INT[\"16\"] | SEVENTEEN -> INT[\"17\"] | EIGHTEEN -> INT[\"18\"] | NINETEEN -> INT[\"19\"] | TWENTY -> INT[\"20\"] | TWENTY ( DASH | WHITE_SPACE )? ONE -> INT[\"21\"] | TWENTY ( DASH | WHITE_SPACE )? TWO -> INT[\"22\"] | TWENTY ( DASH | WHITE_SPACE )? THREE -> INT[\"23\"] | TWENTY ( DASH | WHITE_SPACE )? FOUR -> INT[\"24\"] | TWENTY ( DASH | WHITE_SPACE )? FIVE -> INT[\"25\"] | TWENTY ( DASH | WHITE_SPACE )? SIX -> INT[\"26\"] | TWENTY ( DASH | WHITE_SPACE )? SEVEN -> INT[\"27\"] | TWENTY ( DASH | WHITE_SPACE )? EIGHT -> INT[\"28\"] | TWENTY ( DASH | WHITE_SPACE )? NINE -> INT[\"29\"] | THIRTY -> INT[\"30\"] | THIRTY ( DASH | WHITE_SPACE )? ONE -> INT[\"31\"] );
    public final DateParser.spelled_one_to_thirty_one_return spelled_one_to_thirty_one() throws RecognitionException {
        DateParser.spelled_one_to_thirty_one_return retval = new DateParser.spelled_one_to_thirty_one_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ONE231=null;
        Token TWO232=null;
        Token THREE233=null;
        Token FOUR234=null;
        Token FIVE235=null;
        Token SIX236=null;
        Token SEVEN237=null;
        Token EIGHT238=null;
        Token NINE239=null;
        Token TEN240=null;
        Token ELEVEN241=null;
        Token TWELVE242=null;
        Token THIRTEEN243=null;
        Token FOURTEEN244=null;
        Token FIFTEEN245=null;
        Token SIXTEEN246=null;
        Token SEVENTEEN247=null;
        Token EIGHTEEN248=null;
        Token NINETEEN249=null;
        Token TWENTY250=null;
        Token TWENTY251=null;
        Token DASH252=null;
        Token WHITE_SPACE253=null;
        Token ONE254=null;
        Token TWENTY255=null;
        Token DASH256=null;
        Token WHITE_SPACE257=null;
        Token TWO258=null;
        Token TWENTY259=null;
        Token DASH260=null;
        Token WHITE_SPACE261=null;
        Token THREE262=null;
        Token TWENTY263=null;
        Token DASH264=null;
        Token WHITE_SPACE265=null;
        Token FOUR266=null;
        Token TWENTY267=null;
        Token DASH268=null;
        Token WHITE_SPACE269=null;
        Token FIVE270=null;
        Token TWENTY271=null;
        Token DASH272=null;
        Token WHITE_SPACE273=null;
        Token SIX274=null;
        Token TWENTY275=null;
        Token DASH276=null;
        Token WHITE_SPACE277=null;
        Token SEVEN278=null;
        Token TWENTY279=null;
        Token DASH280=null;
        Token WHITE_SPACE281=null;
        Token EIGHT282=null;
        Token TWENTY283=null;
        Token DASH284=null;
        Token WHITE_SPACE285=null;
        Token NINE286=null;
        Token THIRTY287=null;
        Token THIRTY288=null;
        Token DASH289=null;
        Token WHITE_SPACE290=null;
        Token ONE291=null;

        Object ONE231_tree=null;
        Object TWO232_tree=null;
        Object THREE233_tree=null;
        Object FOUR234_tree=null;
        Object FIVE235_tree=null;
        Object SIX236_tree=null;
        Object SEVEN237_tree=null;
        Object EIGHT238_tree=null;
        Object NINE239_tree=null;
        Object TEN240_tree=null;
        Object ELEVEN241_tree=null;
        Object TWELVE242_tree=null;
        Object THIRTEEN243_tree=null;
        Object FOURTEEN244_tree=null;
        Object FIFTEEN245_tree=null;
        Object SIXTEEN246_tree=null;
        Object SEVENTEEN247_tree=null;
        Object EIGHTEEN248_tree=null;
        Object NINETEEN249_tree=null;
        Object TWENTY250_tree=null;
        Object TWENTY251_tree=null;
        Object DASH252_tree=null;
        Object WHITE_SPACE253_tree=null;
        Object ONE254_tree=null;
        Object TWENTY255_tree=null;
        Object DASH256_tree=null;
        Object WHITE_SPACE257_tree=null;
        Object TWO258_tree=null;
        Object TWENTY259_tree=null;
        Object DASH260_tree=null;
        Object WHITE_SPACE261_tree=null;
        Object THREE262_tree=null;
        Object TWENTY263_tree=null;
        Object DASH264_tree=null;
        Object WHITE_SPACE265_tree=null;
        Object FOUR266_tree=null;
        Object TWENTY267_tree=null;
        Object DASH268_tree=null;
        Object WHITE_SPACE269_tree=null;
        Object FIVE270_tree=null;
        Object TWENTY271_tree=null;
        Object DASH272_tree=null;
        Object WHITE_SPACE273_tree=null;
        Object SIX274_tree=null;
        Object TWENTY275_tree=null;
        Object DASH276_tree=null;
        Object WHITE_SPACE277_tree=null;
        Object SEVEN278_tree=null;
        Object TWENTY279_tree=null;
        Object DASH280_tree=null;
        Object WHITE_SPACE281_tree=null;
        Object EIGHT282_tree=null;
        Object TWENTY283_tree=null;
        Object DASH284_tree=null;
        Object WHITE_SPACE285_tree=null;
        Object NINE286_tree=null;
        Object THIRTY287_tree=null;
        Object THIRTY288_tree=null;
        Object DASH289_tree=null;
        Object WHITE_SPACE290_tree=null;
        Object ONE291_tree=null;
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
        dbg.location(357, 1);

        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:358:3: ( ONE -> INT[\"1\"] | TWO -> INT[\"2\"] | THREE -> INT[\"3\"] | FOUR -> INT[\"4\"] | FIVE -> INT[\"5\"] | SIX -> INT[\"6\"] | SEVEN -> INT[\"7\"] | EIGHT -> INT[\"8\"] | NINE -> INT[\"9\"] | TEN -> INT[\"10\"] | ELEVEN -> INT[\"11\"] | TWELVE -> INT[\"12\"] | THIRTEEN -> INT[\"13\"] | FOURTEEN -> INT[\"14\"] | FIFTEEN -> INT[\"15\"] | SIXTEEN -> INT[\"16\"] | SEVENTEEN -> INT[\"17\"] | EIGHTEEN -> INT[\"18\"] | NINETEEN -> INT[\"19\"] | TWENTY -> INT[\"20\"] | TWENTY ( DASH | WHITE_SPACE )? ONE -> INT[\"21\"] | TWENTY ( DASH | WHITE_SPACE )? TWO -> INT[\"22\"] | TWENTY ( DASH | WHITE_SPACE )? THREE -> INT[\"23\"] | TWENTY ( DASH | WHITE_SPACE )? FOUR -> INT[\"24\"] | TWENTY ( DASH | WHITE_SPACE )? FIVE -> INT[\"25\"] | TWENTY ( DASH | WHITE_SPACE )? SIX -> INT[\"26\"] | TWENTY ( DASH | WHITE_SPACE )? SEVEN -> INT[\"27\"] | TWENTY ( DASH | WHITE_SPACE )? EIGHT -> INT[\"28\"] | TWENTY ( DASH | WHITE_SPACE )? NINE -> INT[\"29\"] | THIRTY -> INT[\"30\"] | THIRTY ( DASH | WHITE_SPACE )? ONE -> INT[\"31\"] )
            int alt79=31;
            try { dbg.enterDecision(79);

            try {
                isCyclicDecision = true;
                alt79 = dfa79.predict(input);
            }
            catch (NoViableAltException nvae) {
                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(79);}

            switch (alt79) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:358:5: ONE
                    {
                    dbg.location(358,5);
                    ONE231=(Token)match(input,ONE,FOLLOW_ONE_in_spelled_one_to_thirty_one2891); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ONE.add(ONE231);



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
                    // 358:16: -> INT[\"1\"]
                    {
                        dbg.location(358,19);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "1"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:359:5: TWO
                    {
                    dbg.location(359,5);
                    TWO232=(Token)match(input,TWO,FOLLOW_TWO_in_spelled_one_to_thirty_one2909); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWO.add(TWO232);



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
                    // 359:16: -> INT[\"2\"]
                    {
                        dbg.location(359,19);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "2"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:360:5: THREE
                    {
                    dbg.location(360,5);
                    THREE233=(Token)match(input,THREE,FOLLOW_THREE_in_spelled_one_to_thirty_one2927); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THREE.add(THREE233);



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
                    // 360:16: -> INT[\"3\"]
                    {
                        dbg.location(360,19);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "3"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:361:5: FOUR
                    {
                    dbg.location(361,5);
                    FOUR234=(Token)match(input,FOUR,FOLLOW_FOUR_in_spelled_one_to_thirty_one2943); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FOUR.add(FOUR234);



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
                    // 361:16: -> INT[\"4\"]
                    {
                        dbg.location(361,19);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "4"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:362:5: FIVE
                    {
                    dbg.location(362,5);
                    FIVE235=(Token)match(input,FIVE,FOLLOW_FIVE_in_spelled_one_to_thirty_one2960); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FIVE.add(FIVE235);



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
                    // 362:16: -> INT[\"5\"]
                    {
                        dbg.location(362,19);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "5"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 6 :
                    dbg.enterAlt(6);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:363:5: SIX
                    {
                    dbg.location(363,5);
                    SIX236=(Token)match(input,SIX,FOLLOW_SIX_in_spelled_one_to_thirty_one2977); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SIX.add(SIX236);



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
                    // 363:16: -> INT[\"6\"]
                    {
                        dbg.location(363,19);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "6"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 7 :
                    dbg.enterAlt(7);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:364:5: SEVEN
                    {
                    dbg.location(364,5);
                    SEVEN237=(Token)match(input,SEVEN,FOLLOW_SEVEN_in_spelled_one_to_thirty_one2995); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEVEN.add(SEVEN237);



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
                    // 364:16: -> INT[\"7\"]
                    {
                        dbg.location(364,19);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "7"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 8 :
                    dbg.enterAlt(8);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:365:5: EIGHT
                    {
                    dbg.location(365,5);
                    EIGHT238=(Token)match(input,EIGHT,FOLLOW_EIGHT_in_spelled_one_to_thirty_one3011); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EIGHT.add(EIGHT238);



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
                    // 365:16: -> INT[\"8\"]
                    {
                        dbg.location(365,19);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "8"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 9 :
                    dbg.enterAlt(9);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:366:5: NINE
                    {
                    dbg.location(366,5);
                    NINE239=(Token)match(input,NINE,FOLLOW_NINE_in_spelled_one_to_thirty_one3027); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NINE.add(NINE239);



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
                    // 366:16: -> INT[\"9\"]
                    {
                        dbg.location(366,19);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "9"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 10 :
                    dbg.enterAlt(10);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:367:5: TEN
                    {
                    dbg.location(367,5);
                    TEN240=(Token)match(input,TEN,FOLLOW_TEN_in_spelled_one_to_thirty_one3044); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TEN.add(TEN240);



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
                    // 367:16: -> INT[\"10\"]
                    {
                        dbg.location(367,19);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "10"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 11 :
                    dbg.enterAlt(11);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:368:5: ELEVEN
                    {
                    dbg.location(368,5);
                    ELEVEN241=(Token)match(input,ELEVEN,FOLLOW_ELEVEN_in_spelled_one_to_thirty_one3062); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ELEVEN.add(ELEVEN241);



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
                    // 368:16: -> INT[\"11\"]
                    {
                        dbg.location(368,19);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "11"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 12 :
                    dbg.enterAlt(12);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:369:5: TWELVE
                    {
                    dbg.location(369,5);
                    TWELVE242=(Token)match(input,TWELVE,FOLLOW_TWELVE_in_spelled_one_to_thirty_one3077); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWELVE.add(TWELVE242);



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
                    // 369:16: -> INT[\"12\"]
                    {
                        dbg.location(369,19);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "12"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 13 :
                    dbg.enterAlt(13);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:370:5: THIRTEEN
                    {
                    dbg.location(370,5);
                    THIRTEEN243=(Token)match(input,THIRTEEN,FOLLOW_THIRTEEN_in_spelled_one_to_thirty_one3092); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THIRTEEN.add(THIRTEEN243);



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
                    // 370:16: -> INT[\"13\"]
                    {
                        dbg.location(370,19);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "13"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 14 :
                    dbg.enterAlt(14);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:371:5: FOURTEEN
                    {
                    dbg.location(371,5);
                    FOURTEEN244=(Token)match(input,FOURTEEN,FOLLOW_FOURTEEN_in_spelled_one_to_thirty_one3105); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FOURTEEN.add(FOURTEEN244);



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
                    // 371:16: -> INT[\"14\"]
                    {
                        dbg.location(371,19);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "14"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 15 :
                    dbg.enterAlt(15);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:372:5: FIFTEEN
                    {
                    dbg.location(372,5);
                    FIFTEEN245=(Token)match(input,FIFTEEN,FOLLOW_FIFTEEN_in_spelled_one_to_thirty_one3118); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FIFTEEN.add(FIFTEEN245);



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
                    // 372:16: -> INT[\"15\"]
                    {
                        dbg.location(372,19);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "15"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 16 :
                    dbg.enterAlt(16);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:373:5: SIXTEEN
                    {
                    dbg.location(373,5);
                    SIXTEEN246=(Token)match(input,SIXTEEN,FOLLOW_SIXTEEN_in_spelled_one_to_thirty_one3132); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SIXTEEN.add(SIXTEEN246);



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
                    // 373:16: -> INT[\"16\"]
                    {
                        dbg.location(373,19);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "16"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 17 :
                    dbg.enterAlt(17);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:374:5: SEVENTEEN
                    {
                    dbg.location(374,5);
                    SEVENTEEN247=(Token)match(input,SEVENTEEN,FOLLOW_SEVENTEEN_in_spelled_one_to_thirty_one3146); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEVENTEEN.add(SEVENTEEN247);



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
                    // 374:16: -> INT[\"17\"]
                    {
                        dbg.location(374,19);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "17"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 18 :
                    dbg.enterAlt(18);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:375:5: EIGHTEEN
                    {
                    dbg.location(375,5);
                    EIGHTEEN248=(Token)match(input,EIGHTEEN,FOLLOW_EIGHTEEN_in_spelled_one_to_thirty_one3158); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EIGHTEEN.add(EIGHTEEN248);



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
                    // 375:16: -> INT[\"18\"]
                    {
                        dbg.location(375,19);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "18"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 19 :
                    dbg.enterAlt(19);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:376:5: NINETEEN
                    {
                    dbg.location(376,5);
                    NINETEEN249=(Token)match(input,NINETEEN,FOLLOW_NINETEEN_in_spelled_one_to_thirty_one3171); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NINETEEN.add(NINETEEN249);



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
                    // 376:16: -> INT[\"19\"]
                    {
                        dbg.location(376,19);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "19"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 20 :
                    dbg.enterAlt(20);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:377:5: TWENTY
                    {
                    dbg.location(377,5);
                    TWENTY250=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_one_to_thirty_one3184); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY250);



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
                    // 377:16: -> INT[\"20\"]
                    {
                        dbg.location(377,19);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "20"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 21 :
                    dbg.enterAlt(21);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:378:5: TWENTY ( DASH | WHITE_SPACE )? ONE
                    {
                    dbg.location(378,5);
                    TWENTY251=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_one_to_thirty_one3199); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY251);

                    dbg.location(378,12);
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:378:12: ( DASH | WHITE_SPACE )?
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

                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:378:13: DASH
                            {
                            dbg.location(378,13);
                            DASH252=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_one_to_thirty_one3202); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_DASH.add(DASH252);


                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:378:20: WHITE_SPACE
                            {
                            dbg.location(378,20);
                            WHITE_SPACE253=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_spelled_one_to_thirty_one3206); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE253);


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(69);}

                    dbg.location(378,34);
                    ONE254=(Token)match(input,ONE,FOLLOW_ONE_in_spelled_one_to_thirty_one3210); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ONE.add(ONE254);



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
                    // 378:40: -> INT[\"21\"]
                    {
                        dbg.location(378,43);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "21"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 22 :
                    dbg.enterAlt(22);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:379:5: TWENTY ( DASH | WHITE_SPACE )? TWO
                    {
                    dbg.location(379,5);
                    TWENTY255=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_one_to_thirty_one3223); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY255);

                    dbg.location(379,12);
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:379:12: ( DASH | WHITE_SPACE )?
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

                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:379:13: DASH
                            {
                            dbg.location(379,13);
                            DASH256=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_one_to_thirty_one3226); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_DASH.add(DASH256);


                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:379:20: WHITE_SPACE
                            {
                            dbg.location(379,20);
                            WHITE_SPACE257=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_spelled_one_to_thirty_one3230); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE257);


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(70);}

                    dbg.location(379,34);
                    TWO258=(Token)match(input,TWO,FOLLOW_TWO_in_spelled_one_to_thirty_one3234); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWO.add(TWO258);



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
                    // 379:40: -> INT[\"22\"]
                    {
                        dbg.location(379,43);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "22"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 23 :
                    dbg.enterAlt(23);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:380:5: TWENTY ( DASH | WHITE_SPACE )? THREE
                    {
                    dbg.location(380,5);
                    TWENTY259=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_one_to_thirty_one3247); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY259);

                    dbg.location(380,12);
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:380:12: ( DASH | WHITE_SPACE )?
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

                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:380:13: DASH
                            {
                            dbg.location(380,13);
                            DASH260=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_one_to_thirty_one3250); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_DASH.add(DASH260);


                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:380:20: WHITE_SPACE
                            {
                            dbg.location(380,20);
                            WHITE_SPACE261=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_spelled_one_to_thirty_one3254); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE261);


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(71);}

                    dbg.location(380,34);
                    THREE262=(Token)match(input,THREE,FOLLOW_THREE_in_spelled_one_to_thirty_one3258); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THREE.add(THREE262);



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
                    // 380:40: -> INT[\"23\"]
                    {
                        dbg.location(380,43);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "23"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 24 :
                    dbg.enterAlt(24);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:381:5: TWENTY ( DASH | WHITE_SPACE )? FOUR
                    {
                    dbg.location(381,5);
                    TWENTY263=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_one_to_thirty_one3269); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY263);

                    dbg.location(381,12);
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:381:12: ( DASH | WHITE_SPACE )?
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

                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:381:13: DASH
                            {
                            dbg.location(381,13);
                            DASH264=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_one_to_thirty_one3272); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_DASH.add(DASH264);


                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:381:20: WHITE_SPACE
                            {
                            dbg.location(381,20);
                            WHITE_SPACE265=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_spelled_one_to_thirty_one3276); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE265);


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(72);}

                    dbg.location(381,34);
                    FOUR266=(Token)match(input,FOUR,FOLLOW_FOUR_in_spelled_one_to_thirty_one3280); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FOUR.add(FOUR266);



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
                    // 381:40: -> INT[\"24\"]
                    {
                        dbg.location(381,43);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "24"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 25 :
                    dbg.enterAlt(25);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:382:5: TWENTY ( DASH | WHITE_SPACE )? FIVE
                    {
                    dbg.location(382,5);
                    TWENTY267=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_one_to_thirty_one3292); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY267);

                    dbg.location(382,12);
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:382:12: ( DASH | WHITE_SPACE )?
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

                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:382:13: DASH
                            {
                            dbg.location(382,13);
                            DASH268=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_one_to_thirty_one3295); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_DASH.add(DASH268);


                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:382:20: WHITE_SPACE
                            {
                            dbg.location(382,20);
                            WHITE_SPACE269=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_spelled_one_to_thirty_one3299); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE269);


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(73);}

                    dbg.location(382,34);
                    FIVE270=(Token)match(input,FIVE,FOLLOW_FIVE_in_spelled_one_to_thirty_one3303); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FIVE.add(FIVE270);



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
                    // 382:40: -> INT[\"25\"]
                    {
                        dbg.location(382,43);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "25"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 26 :
                    dbg.enterAlt(26);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:383:5: TWENTY ( DASH | WHITE_SPACE )? SIX
                    {
                    dbg.location(383,5);
                    TWENTY271=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_one_to_thirty_one3315); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY271);

                    dbg.location(383,12);
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:383:12: ( DASH | WHITE_SPACE )?
                    int alt74=3;
                    try { dbg.enterSubRule(74);
                    try { dbg.enterDecision(74);

                    int LA74_0 = input.LA(1);

                    if ( (LA74_0==DASH) ) {
                        alt74=1;
                    }
                    else if ( (LA74_0==WHITE_SPACE) ) {
                        alt74=2;
                    }
                    } finally {dbg.exitDecision(74);}

                    switch (alt74) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:383:13: DASH
                            {
                            dbg.location(383,13);
                            DASH272=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_one_to_thirty_one3318); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_DASH.add(DASH272);


                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:383:20: WHITE_SPACE
                            {
                            dbg.location(383,20);
                            WHITE_SPACE273=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_spelled_one_to_thirty_one3322); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE273);


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(74);}

                    dbg.location(383,34);
                    SIX274=(Token)match(input,SIX,FOLLOW_SIX_in_spelled_one_to_thirty_one3326); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SIX.add(SIX274);



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
                    // 383:40: -> INT[\"26\"]
                    {
                        dbg.location(383,43);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "26"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 27 :
                    dbg.enterAlt(27);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:384:5: TWENTY ( DASH | WHITE_SPACE )? SEVEN
                    {
                    dbg.location(384,5);
                    TWENTY275=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_one_to_thirty_one3339); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY275);

                    dbg.location(384,12);
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:384:12: ( DASH | WHITE_SPACE )?
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

                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:384:13: DASH
                            {
                            dbg.location(384,13);
                            DASH276=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_one_to_thirty_one3342); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_DASH.add(DASH276);


                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:384:20: WHITE_SPACE
                            {
                            dbg.location(384,20);
                            WHITE_SPACE277=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_spelled_one_to_thirty_one3346); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE277);


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(75);}

                    dbg.location(384,34);
                    SEVEN278=(Token)match(input,SEVEN,FOLLOW_SEVEN_in_spelled_one_to_thirty_one3350); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEVEN.add(SEVEN278);



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
                    // 384:40: -> INT[\"27\"]
                    {
                        dbg.location(384,43);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "27"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 28 :
                    dbg.enterAlt(28);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:385:5: TWENTY ( DASH | WHITE_SPACE )? EIGHT
                    {
                    dbg.location(385,5);
                    TWENTY279=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_one_to_thirty_one3361); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY279);

                    dbg.location(385,12);
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:385:12: ( DASH | WHITE_SPACE )?
                    int alt76=3;
                    try { dbg.enterSubRule(76);
                    try { dbg.enterDecision(76);

                    int LA76_0 = input.LA(1);

                    if ( (LA76_0==DASH) ) {
                        alt76=1;
                    }
                    else if ( (LA76_0==WHITE_SPACE) ) {
                        alt76=2;
                    }
                    } finally {dbg.exitDecision(76);}

                    switch (alt76) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:385:13: DASH
                            {
                            dbg.location(385,13);
                            DASH280=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_one_to_thirty_one3364); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_DASH.add(DASH280);


                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:385:20: WHITE_SPACE
                            {
                            dbg.location(385,20);
                            WHITE_SPACE281=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_spelled_one_to_thirty_one3368); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE281);


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(76);}

                    dbg.location(385,34);
                    EIGHT282=(Token)match(input,EIGHT,FOLLOW_EIGHT_in_spelled_one_to_thirty_one3372); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EIGHT.add(EIGHT282);



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
                    // 385:40: -> INT[\"28\"]
                    {
                        dbg.location(385,43);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "28"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 29 :
                    dbg.enterAlt(29);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:386:5: TWENTY ( DASH | WHITE_SPACE )? NINE
                    {
                    dbg.location(386,5);
                    TWENTY283=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_one_to_thirty_one3383); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY283);

                    dbg.location(386,12);
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:386:12: ( DASH | WHITE_SPACE )?
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

                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:386:13: DASH
                            {
                            dbg.location(386,13);
                            DASH284=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_one_to_thirty_one3386); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_DASH.add(DASH284);


                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:386:20: WHITE_SPACE
                            {
                            dbg.location(386,20);
                            WHITE_SPACE285=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_spelled_one_to_thirty_one3390); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE285);


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(77);}

                    dbg.location(386,34);
                    NINE286=(Token)match(input,NINE,FOLLOW_NINE_in_spelled_one_to_thirty_one3394); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NINE.add(NINE286);



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
                    // 386:40: -> INT[\"29\"]
                    {
                        dbg.location(386,43);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "29"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 30 :
                    dbg.enterAlt(30);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:387:5: THIRTY
                    {
                    dbg.location(387,5);
                    THIRTY287=(Token)match(input,THIRTY,FOLLOW_THIRTY_in_spelled_one_to_thirty_one3406); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THIRTY.add(THIRTY287);



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
                    // 387:40: -> INT[\"30\"]
                    {
                        dbg.location(387,43);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "30"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 31 :
                    dbg.enterAlt(31);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:388:5: THIRTY ( DASH | WHITE_SPACE )? ONE
                    {
                    dbg.location(388,5);
                    THIRTY288=(Token)match(input,THIRTY,FOLLOW_THIRTY_in_spelled_one_to_thirty_one3445); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THIRTY.add(THIRTY288);

                    dbg.location(388,12);
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:388:12: ( DASH | WHITE_SPACE )?
                    int alt78=3;
                    try { dbg.enterSubRule(78);
                    try { dbg.enterDecision(78);

                    int LA78_0 = input.LA(1);

                    if ( (LA78_0==DASH) ) {
                        alt78=1;
                    }
                    else if ( (LA78_0==WHITE_SPACE) ) {
                        alt78=2;
                    }
                    } finally {dbg.exitDecision(78);}

                    switch (alt78) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:388:13: DASH
                            {
                            dbg.location(388,13);
                            DASH289=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_one_to_thirty_one3448); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_DASH.add(DASH289);


                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:388:20: WHITE_SPACE
                            {
                            dbg.location(388,20);
                            WHITE_SPACE290=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_spelled_one_to_thirty_one3452); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE290);


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(78);}

                    dbg.location(388,34);
                    ONE291=(Token)match(input,ONE,FOLLOW_ONE_in_spelled_one_to_thirty_one3456); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ONE.add(ONE291);



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
                    // 388:40: -> INT[\"31\"]
                    {
                        dbg.location(388,43);
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
        dbg.location(389, 3);

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
    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:392:1: spelled_first_to_thirty_first : ( FIRST -> INT[\"1\"] | SECOND -> INT[\"2\"] | THIRD -> INT[\"3\"] | FOURTH -> INT[\"4\"] | FIFTH -> INT[\"5\"] | SIXTH -> INT[\"6\"] | SEVENTH -> INT[\"7\"] | EIGHTH -> INT[\"8\"] | NINTH -> INT[\"9\"] | TENTH -> INT[\"10\"] | ELEVENTH -> INT[\"11\"] | TWELFTH -> INT[\"12\"] | THIRTEENTH -> INT[\"13\"] | FOURTEENTH -> INT[\"14\"] | FIFTEENTH -> INT[\"15\"] | SIXTEENTH -> INT[\"16\"] | SEVENTEENTH -> INT[\"17\"] | EIGHTEENTH -> INT[\"18\"] | NINETEENTH -> INT[\"19\"] | TWENTIETH -> INT[\"20\"] | ( TWENTY_FIRST | ( TWENTY ( DASH | WHITE_SPACE )? FIRST ) ) -> INT[\"21\"] | ( TWENTY_SECOND | ( TWENTY ( DASH | WHITE_SPACE )? SECOND ) ) -> INT[\"22\"] | ( TWENTY_THIRD | ( TWENTY ( DASH | WHITE_SPACE )? THIRD ) ) -> INT[\"23\"] | ( TWENTY_FOURTH | ( TWENTY ( DASH | WHITE_SPACE )? FOURTH ) ) -> INT[\"24\"] | ( TWENTY_FIFTH | ( TWENTY ( DASH | WHITE_SPACE )? FIFTH ) ) -> INT[\"25\"] | ( TWENTY_SIXTH | ( TWENTY ( DASH | WHITE_SPACE )? SIXTH ) ) -> INT[\"26\"] | ( TWENTY_SEVENTH | ( TWENTY ( DASH | WHITE_SPACE )? SEVENTH ) ) -> INT[\"27\"] | ( TWENTY_EIGHTH | ( TWENTY ( DASH | WHITE_SPACE )? EIGHTH ) ) -> INT[\"28\"] | ( TWENTY_NINTH | ( TWENTY ( DASH | WHITE_SPACE )? NINTH ) ) -> INT[\"29\"] | THIRTIETH -> INT[\"30\"] | ( THIRTY_FIRST | ( THIRTY ( DASH | WHITE_SPACE )? FIRST ) ) -> INT[\"31\"] );
    public final DateParser.spelled_first_to_thirty_first_return spelled_first_to_thirty_first() throws RecognitionException {
        DateParser.spelled_first_to_thirty_first_return retval = new DateParser.spelled_first_to_thirty_first_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token FIRST292=null;
        Token SECOND293=null;
        Token THIRD294=null;
        Token FOURTH295=null;
        Token FIFTH296=null;
        Token SIXTH297=null;
        Token SEVENTH298=null;
        Token EIGHTH299=null;
        Token NINTH300=null;
        Token TENTH301=null;
        Token ELEVENTH302=null;
        Token TWELFTH303=null;
        Token THIRTEENTH304=null;
        Token FOURTEENTH305=null;
        Token FIFTEENTH306=null;
        Token SIXTEENTH307=null;
        Token SEVENTEENTH308=null;
        Token EIGHTEENTH309=null;
        Token NINETEENTH310=null;
        Token TWENTIETH311=null;
        Token TWENTY_FIRST312=null;
        Token TWENTY313=null;
        Token DASH314=null;
        Token WHITE_SPACE315=null;
        Token FIRST316=null;
        Token TWENTY_SECOND317=null;
        Token TWENTY318=null;
        Token DASH319=null;
        Token WHITE_SPACE320=null;
        Token SECOND321=null;
        Token TWENTY_THIRD322=null;
        Token TWENTY323=null;
        Token DASH324=null;
        Token WHITE_SPACE325=null;
        Token THIRD326=null;
        Token TWENTY_FOURTH327=null;
        Token TWENTY328=null;
        Token DASH329=null;
        Token WHITE_SPACE330=null;
        Token FOURTH331=null;
        Token TWENTY_FIFTH332=null;
        Token TWENTY333=null;
        Token DASH334=null;
        Token WHITE_SPACE335=null;
        Token FIFTH336=null;
        Token TWENTY_SIXTH337=null;
        Token TWENTY338=null;
        Token DASH339=null;
        Token WHITE_SPACE340=null;
        Token SIXTH341=null;
        Token TWENTY_SEVENTH342=null;
        Token TWENTY343=null;
        Token DASH344=null;
        Token WHITE_SPACE345=null;
        Token SEVENTH346=null;
        Token TWENTY_EIGHTH347=null;
        Token TWENTY348=null;
        Token DASH349=null;
        Token WHITE_SPACE350=null;
        Token EIGHTH351=null;
        Token TWENTY_NINTH352=null;
        Token TWENTY353=null;
        Token DASH354=null;
        Token WHITE_SPACE355=null;
        Token NINTH356=null;
        Token THIRTIETH357=null;
        Token THIRTY_FIRST358=null;
        Token THIRTY359=null;
        Token DASH360=null;
        Token WHITE_SPACE361=null;
        Token FIRST362=null;

        Object FIRST292_tree=null;
        Object SECOND293_tree=null;
        Object THIRD294_tree=null;
        Object FOURTH295_tree=null;
        Object FIFTH296_tree=null;
        Object SIXTH297_tree=null;
        Object SEVENTH298_tree=null;
        Object EIGHTH299_tree=null;
        Object NINTH300_tree=null;
        Object TENTH301_tree=null;
        Object ELEVENTH302_tree=null;
        Object TWELFTH303_tree=null;
        Object THIRTEENTH304_tree=null;
        Object FOURTEENTH305_tree=null;
        Object FIFTEENTH306_tree=null;
        Object SIXTEENTH307_tree=null;
        Object SEVENTEENTH308_tree=null;
        Object EIGHTEENTH309_tree=null;
        Object NINETEENTH310_tree=null;
        Object TWENTIETH311_tree=null;
        Object TWENTY_FIRST312_tree=null;
        Object TWENTY313_tree=null;
        Object DASH314_tree=null;
        Object WHITE_SPACE315_tree=null;
        Object FIRST316_tree=null;
        Object TWENTY_SECOND317_tree=null;
        Object TWENTY318_tree=null;
        Object DASH319_tree=null;
        Object WHITE_SPACE320_tree=null;
        Object SECOND321_tree=null;
        Object TWENTY_THIRD322_tree=null;
        Object TWENTY323_tree=null;
        Object DASH324_tree=null;
        Object WHITE_SPACE325_tree=null;
        Object THIRD326_tree=null;
        Object TWENTY_FOURTH327_tree=null;
        Object TWENTY328_tree=null;
        Object DASH329_tree=null;
        Object WHITE_SPACE330_tree=null;
        Object FOURTH331_tree=null;
        Object TWENTY_FIFTH332_tree=null;
        Object TWENTY333_tree=null;
        Object DASH334_tree=null;
        Object WHITE_SPACE335_tree=null;
        Object FIFTH336_tree=null;
        Object TWENTY_SIXTH337_tree=null;
        Object TWENTY338_tree=null;
        Object DASH339_tree=null;
        Object WHITE_SPACE340_tree=null;
        Object SIXTH341_tree=null;
        Object TWENTY_SEVENTH342_tree=null;
        Object TWENTY343_tree=null;
        Object DASH344_tree=null;
        Object WHITE_SPACE345_tree=null;
        Object SEVENTH346_tree=null;
        Object TWENTY_EIGHTH347_tree=null;
        Object TWENTY348_tree=null;
        Object DASH349_tree=null;
        Object WHITE_SPACE350_tree=null;
        Object EIGHTH351_tree=null;
        Object TWENTY_NINTH352_tree=null;
        Object TWENTY353_tree=null;
        Object DASH354_tree=null;
        Object WHITE_SPACE355_tree=null;
        Object NINTH356_tree=null;
        Object THIRTIETH357_tree=null;
        Object THIRTY_FIRST358_tree=null;
        Object THIRTY359_tree=null;
        Object DASH360_tree=null;
        Object WHITE_SPACE361_tree=null;
        Object FIRST362_tree=null;
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
        dbg.location(392, 1);

        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:393:3: ( FIRST -> INT[\"1\"] | SECOND -> INT[\"2\"] | THIRD -> INT[\"3\"] | FOURTH -> INT[\"4\"] | FIFTH -> INT[\"5\"] | SIXTH -> INT[\"6\"] | SEVENTH -> INT[\"7\"] | EIGHTH -> INT[\"8\"] | NINTH -> INT[\"9\"] | TENTH -> INT[\"10\"] | ELEVENTH -> INT[\"11\"] | TWELFTH -> INT[\"12\"] | THIRTEENTH -> INT[\"13\"] | FOURTEENTH -> INT[\"14\"] | FIFTEENTH -> INT[\"15\"] | SIXTEENTH -> INT[\"16\"] | SEVENTEENTH -> INT[\"17\"] | EIGHTEENTH -> INT[\"18\"] | NINETEENTH -> INT[\"19\"] | TWENTIETH -> INT[\"20\"] | ( TWENTY_FIRST | ( TWENTY ( DASH | WHITE_SPACE )? FIRST ) ) -> INT[\"21\"] | ( TWENTY_SECOND | ( TWENTY ( DASH | WHITE_SPACE )? SECOND ) ) -> INT[\"22\"] | ( TWENTY_THIRD | ( TWENTY ( DASH | WHITE_SPACE )? THIRD ) ) -> INT[\"23\"] | ( TWENTY_FOURTH | ( TWENTY ( DASH | WHITE_SPACE )? FOURTH ) ) -> INT[\"24\"] | ( TWENTY_FIFTH | ( TWENTY ( DASH | WHITE_SPACE )? FIFTH ) ) -> INT[\"25\"] | ( TWENTY_SIXTH | ( TWENTY ( DASH | WHITE_SPACE )? SIXTH ) ) -> INT[\"26\"] | ( TWENTY_SEVENTH | ( TWENTY ( DASH | WHITE_SPACE )? SEVENTH ) ) -> INT[\"27\"] | ( TWENTY_EIGHTH | ( TWENTY ( DASH | WHITE_SPACE )? EIGHTH ) ) -> INT[\"28\"] | ( TWENTY_NINTH | ( TWENTY ( DASH | WHITE_SPACE )? NINTH ) ) -> INT[\"29\"] | THIRTIETH -> INT[\"30\"] | ( THIRTY_FIRST | ( THIRTY ( DASH | WHITE_SPACE )? FIRST ) ) -> INT[\"31\"] )
            int alt100=31;
            try { dbg.enterDecision(100);

            try {
                isCyclicDecision = true;
                alt100 = dfa100.predict(input);
            }
            catch (NoViableAltException nvae) {
                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(100);}

            switch (alt100) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:393:5: FIRST
                    {
                    dbg.location(393,5);
                    FIRST292=(Token)match(input,FIRST,FOLLOW_FIRST_in_spelled_first_to_thirty_first3479); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FIRST.add(FIRST292);



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
                    // 393:17: -> INT[\"1\"]
                    {
                        dbg.location(393,20);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "1"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:394:5: SECOND
                    {
                    dbg.location(394,5);
                    SECOND293=(Token)match(input,SECOND,FOLLOW_SECOND_in_spelled_first_to_thirty_first3496); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SECOND.add(SECOND293);



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
                    // 394:17: -> INT[\"2\"]
                    {
                        dbg.location(394,20);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "2"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:395:5: THIRD
                    {
                    dbg.location(395,5);
                    THIRD294=(Token)match(input,THIRD,FOLLOW_THIRD_in_spelled_first_to_thirty_first3512); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THIRD.add(THIRD294);



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
                    // 395:17: -> INT[\"3\"]
                    {
                        dbg.location(395,20);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "3"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:396:5: FOURTH
                    {
                    dbg.location(396,5);
                    FOURTH295=(Token)match(input,FOURTH,FOLLOW_FOURTH_in_spelled_first_to_thirty_first3529); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FOURTH.add(FOURTH295);



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
                    // 396:17: -> INT[\"4\"]
                    {
                        dbg.location(396,20);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "4"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:397:5: FIFTH
                    {
                    dbg.location(397,5);
                    FIFTH296=(Token)match(input,FIFTH,FOLLOW_FIFTH_in_spelled_first_to_thirty_first3545); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FIFTH.add(FIFTH296);



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
                    // 397:17: -> INT[\"5\"]
                    {
                        dbg.location(397,20);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "5"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 6 :
                    dbg.enterAlt(6);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:398:5: SIXTH
                    {
                    dbg.location(398,5);
                    SIXTH297=(Token)match(input,SIXTH,FOLLOW_SIXTH_in_spelled_first_to_thirty_first3562); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SIXTH.add(SIXTH297);



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
                    // 398:17: -> INT[\"6\"]
                    {
                        dbg.location(398,20);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "6"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 7 :
                    dbg.enterAlt(7);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:399:5: SEVENTH
                    {
                    dbg.location(399,5);
                    SEVENTH298=(Token)match(input,SEVENTH,FOLLOW_SEVENTH_in_spelled_first_to_thirty_first3579); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEVENTH.add(SEVENTH298);



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
                    // 399:17: -> INT[\"7\"]
                    {
                        dbg.location(399,20);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "7"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 8 :
                    dbg.enterAlt(8);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:400:5: EIGHTH
                    {
                    dbg.location(400,5);
                    EIGHTH299=(Token)match(input,EIGHTH,FOLLOW_EIGHTH_in_spelled_first_to_thirty_first3594); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EIGHTH.add(EIGHTH299);



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
                    // 400:17: -> INT[\"8\"]
                    {
                        dbg.location(400,20);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "8"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 9 :
                    dbg.enterAlt(9);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:401:5: NINTH
                    {
                    dbg.location(401,5);
                    NINTH300=(Token)match(input,NINTH,FOLLOW_NINTH_in_spelled_first_to_thirty_first3610); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NINTH.add(NINTH300);



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
                    // 401:17: -> INT[\"9\"]
                    {
                        dbg.location(401,20);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "9"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 10 :
                    dbg.enterAlt(10);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:402:5: TENTH
                    {
                    dbg.location(402,5);
                    TENTH301=(Token)match(input,TENTH,FOLLOW_TENTH_in_spelled_first_to_thirty_first3627); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TENTH.add(TENTH301);



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
                    // 402:17: -> INT[\"10\"]
                    {
                        dbg.location(402,20);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "10"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 11 :
                    dbg.enterAlt(11);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:403:5: ELEVENTH
                    {
                    dbg.location(403,5);
                    ELEVENTH302=(Token)match(input,ELEVENTH,FOLLOW_ELEVENTH_in_spelled_first_to_thirty_first3644); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ELEVENTH.add(ELEVENTH302);



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
                    // 403:17: -> INT[\"11\"]
                    {
                        dbg.location(403,20);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "11"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 12 :
                    dbg.enterAlt(12);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:404:5: TWELFTH
                    {
                    dbg.location(404,5);
                    TWELFTH303=(Token)match(input,TWELFTH,FOLLOW_TWELFTH_in_spelled_first_to_thirty_first3658); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWELFTH.add(TWELFTH303);



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
                    // 404:17: -> INT[\"12\"]
                    {
                        dbg.location(404,20);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "12"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 13 :
                    dbg.enterAlt(13);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:405:5: THIRTEENTH
                    {
                    dbg.location(405,5);
                    THIRTEENTH304=(Token)match(input,THIRTEENTH,FOLLOW_THIRTEENTH_in_spelled_first_to_thirty_first3673); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THIRTEENTH.add(THIRTEENTH304);



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
                    // 405:17: -> INT[\"13\"]
                    {
                        dbg.location(405,20);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "13"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 14 :
                    dbg.enterAlt(14);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:406:5: FOURTEENTH
                    {
                    dbg.location(406,5);
                    FOURTEENTH305=(Token)match(input,FOURTEENTH,FOLLOW_FOURTEENTH_in_spelled_first_to_thirty_first3685); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FOURTEENTH.add(FOURTEENTH305);



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
                    // 406:17: -> INT[\"14\"]
                    {
                        dbg.location(406,20);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "14"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 15 :
                    dbg.enterAlt(15);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:407:5: FIFTEENTH
                    {
                    dbg.location(407,5);
                    FIFTEENTH306=(Token)match(input,FIFTEENTH,FOLLOW_FIFTEENTH_in_spelled_first_to_thirty_first3697); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FIFTEENTH.add(FIFTEENTH306);



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
                    // 407:17: -> INT[\"15\"]
                    {
                        dbg.location(407,20);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "15"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 16 :
                    dbg.enterAlt(16);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:408:5: SIXTEENTH
                    {
                    dbg.location(408,5);
                    SIXTEENTH307=(Token)match(input,SIXTEENTH,FOLLOW_SIXTEENTH_in_spelled_first_to_thirty_first3710); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SIXTEENTH.add(SIXTEENTH307);



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
                    // 408:17: -> INT[\"16\"]
                    {
                        dbg.location(408,20);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "16"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 17 :
                    dbg.enterAlt(17);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:409:5: SEVENTEENTH
                    {
                    dbg.location(409,5);
                    SEVENTEENTH308=(Token)match(input,SEVENTEENTH,FOLLOW_SEVENTEENTH_in_spelled_first_to_thirty_first3723); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEVENTEENTH.add(SEVENTEENTH308);



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
                    // 409:17: -> INT[\"17\"]
                    {
                        dbg.location(409,20);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "17"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 18 :
                    dbg.enterAlt(18);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:410:5: EIGHTEENTH
                    {
                    dbg.location(410,5);
                    EIGHTEENTH309=(Token)match(input,EIGHTEENTH,FOLLOW_EIGHTEENTH_in_spelled_first_to_thirty_first3734); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EIGHTEENTH.add(EIGHTEENTH309);



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
                    // 410:17: -> INT[\"18\"]
                    {
                        dbg.location(410,20);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "18"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 19 :
                    dbg.enterAlt(19);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:411:5: NINETEENTH
                    {
                    dbg.location(411,5);
                    NINETEENTH310=(Token)match(input,NINETEENTH,FOLLOW_NINETEENTH_in_spelled_first_to_thirty_first3746); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NINETEENTH.add(NINETEENTH310);



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
                    // 411:17: -> INT[\"19\"]
                    {
                        dbg.location(411,20);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "19"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 20 :
                    dbg.enterAlt(20);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:412:5: TWENTIETH
                    {
                    dbg.location(412,5);
                    TWENTIETH311=(Token)match(input,TWENTIETH,FOLLOW_TWENTIETH_in_spelled_first_to_thirty_first3758); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWENTIETH.add(TWENTIETH311);



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
                    // 412:17: -> INT[\"20\"]
                    {
                        dbg.location(412,20);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "20"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 21 :
                    dbg.enterAlt(21);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:413:5: ( TWENTY_FIRST | ( TWENTY ( DASH | WHITE_SPACE )? FIRST ) )
                    {
                    dbg.location(413,5);
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:413:5: ( TWENTY_FIRST | ( TWENTY ( DASH | WHITE_SPACE )? FIRST ) )
                    int alt81=2;
                    try { dbg.enterSubRule(81);
                    try { dbg.enterDecision(81);

                    int LA81_0 = input.LA(1);

                    if ( (LA81_0==TWENTY_FIRST) ) {
                        alt81=1;
                    }
                    else if ( (LA81_0==TWENTY) ) {
                        alt81=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 81, 0, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }
                    } finally {dbg.exitDecision(81);}

                    switch (alt81) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:413:6: TWENTY_FIRST
                            {
                            dbg.location(413,6);
                            TWENTY_FIRST312=(Token)match(input,TWENTY_FIRST,FOLLOW_TWENTY_FIRST_in_spelled_first_to_thirty_first3772); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY_FIRST.add(TWENTY_FIRST312);


                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:413:23: ( TWENTY ( DASH | WHITE_SPACE )? FIRST )
                            {
                            dbg.location(413,23);
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:413:23: ( TWENTY ( DASH | WHITE_SPACE )? FIRST )
                            dbg.enterAlt(1);

                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:413:24: TWENTY ( DASH | WHITE_SPACE )? FIRST
                            {
                            dbg.location(413,24);
                            TWENTY313=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_first_to_thirty_first3779); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY313);

                            dbg.location(413,31);
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:413:31: ( DASH | WHITE_SPACE )?
                            int alt80=3;
                            try { dbg.enterSubRule(80);
                            try { dbg.enterDecision(80);

                            int LA80_0 = input.LA(1);

                            if ( (LA80_0==DASH) ) {
                                alt80=1;
                            }
                            else if ( (LA80_0==WHITE_SPACE) ) {
                                alt80=2;
                            }
                            } finally {dbg.exitDecision(80);}

                            switch (alt80) {
                                case 1 :
                                    dbg.enterAlt(1);

                                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:413:32: DASH
                                    {
                                    dbg.location(413,32);
                                    DASH314=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_first_to_thirty_first3782); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_DASH.add(DASH314);


                                    }
                                    break;
                                case 2 :
                                    dbg.enterAlt(2);

                                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:413:39: WHITE_SPACE
                                    {
                                    dbg.location(413,39);
                                    WHITE_SPACE315=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_spelled_first_to_thirty_first3786); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE315);


                                    }
                                    break;

                            }
                            } finally {dbg.exitSubRule(80);}

                            dbg.location(413,53);
                            FIRST316=(Token)match(input,FIRST,FOLLOW_FIRST_in_spelled_first_to_thirty_first3790); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_FIRST.add(FIRST316);


                            }


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(81);}



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
                    // 413:63: -> INT[\"21\"]
                    {
                        dbg.location(413,66);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "21"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 22 :
                    dbg.enterAlt(22);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:414:5: ( TWENTY_SECOND | ( TWENTY ( DASH | WHITE_SPACE )? SECOND ) )
                    {
                    dbg.location(414,5);
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:414:5: ( TWENTY_SECOND | ( TWENTY ( DASH | WHITE_SPACE )? SECOND ) )
                    int alt83=2;
                    try { dbg.enterSubRule(83);
                    try { dbg.enterDecision(83);

                    int LA83_0 = input.LA(1);

                    if ( (LA83_0==TWENTY_SECOND) ) {
                        alt83=1;
                    }
                    else if ( (LA83_0==TWENTY) ) {
                        alt83=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 83, 0, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }
                    } finally {dbg.exitDecision(83);}

                    switch (alt83) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:414:6: TWENTY_SECOND
                            {
                            dbg.location(414,6);
                            TWENTY_SECOND317=(Token)match(input,TWENTY_SECOND,FOLLOW_TWENTY_SECOND_in_spelled_first_to_thirty_first3806); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY_SECOND.add(TWENTY_SECOND317);


                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:414:23: ( TWENTY ( DASH | WHITE_SPACE )? SECOND )
                            {
                            dbg.location(414,23);
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:414:23: ( TWENTY ( DASH | WHITE_SPACE )? SECOND )
                            dbg.enterAlt(1);

                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:414:24: TWENTY ( DASH | WHITE_SPACE )? SECOND
                            {
                            dbg.location(414,24);
                            TWENTY318=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_first_to_thirty_first3812); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY318);

                            dbg.location(414,31);
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:414:31: ( DASH | WHITE_SPACE )?
                            int alt82=3;
                            try { dbg.enterSubRule(82);
                            try { dbg.enterDecision(82);

                            int LA82_0 = input.LA(1);

                            if ( (LA82_0==DASH) ) {
                                alt82=1;
                            }
                            else if ( (LA82_0==WHITE_SPACE) ) {
                                alt82=2;
                            }
                            } finally {dbg.exitDecision(82);}

                            switch (alt82) {
                                case 1 :
                                    dbg.enterAlt(1);

                                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:414:32: DASH
                                    {
                                    dbg.location(414,32);
                                    DASH319=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_first_to_thirty_first3815); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_DASH.add(DASH319);


                                    }
                                    break;
                                case 2 :
                                    dbg.enterAlt(2);

                                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:414:39: WHITE_SPACE
                                    {
                                    dbg.location(414,39);
                                    WHITE_SPACE320=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_spelled_first_to_thirty_first3819); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE320);


                                    }
                                    break;

                            }
                            } finally {dbg.exitSubRule(82);}

                            dbg.location(414,53);
                            SECOND321=(Token)match(input,SECOND,FOLLOW_SECOND_in_spelled_first_to_thirty_first3823); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_SECOND.add(SECOND321);


                            }


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(83);}



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
                    // 414:63: -> INT[\"22\"]
                    {
                        dbg.location(414,66);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "22"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 23 :
                    dbg.enterAlt(23);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:415:5: ( TWENTY_THIRD | ( TWENTY ( DASH | WHITE_SPACE )? THIRD ) )
                    {
                    dbg.location(415,5);
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:415:5: ( TWENTY_THIRD | ( TWENTY ( DASH | WHITE_SPACE )? THIRD ) )
                    int alt85=2;
                    try { dbg.enterSubRule(85);
                    try { dbg.enterDecision(85);

                    int LA85_0 = input.LA(1);

                    if ( (LA85_0==TWENTY_THIRD) ) {
                        alt85=1;
                    }
                    else if ( (LA85_0==TWENTY) ) {
                        alt85=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 85, 0, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }
                    } finally {dbg.exitDecision(85);}

                    switch (alt85) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:415:6: TWENTY_THIRD
                            {
                            dbg.location(415,6);
                            TWENTY_THIRD322=(Token)match(input,TWENTY_THIRD,FOLLOW_TWENTY_THIRD_in_spelled_first_to_thirty_first3838); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY_THIRD.add(TWENTY_THIRD322);


                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:415:23: ( TWENTY ( DASH | WHITE_SPACE )? THIRD )
                            {
                            dbg.location(415,23);
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:415:23: ( TWENTY ( DASH | WHITE_SPACE )? THIRD )
                            dbg.enterAlt(1);

                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:415:24: TWENTY ( DASH | WHITE_SPACE )? THIRD
                            {
                            dbg.location(415,24);
                            TWENTY323=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_first_to_thirty_first3845); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY323);

                            dbg.location(415,31);
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:415:31: ( DASH | WHITE_SPACE )?
                            int alt84=3;
                            try { dbg.enterSubRule(84);
                            try { dbg.enterDecision(84);

                            int LA84_0 = input.LA(1);

                            if ( (LA84_0==DASH) ) {
                                alt84=1;
                            }
                            else if ( (LA84_0==WHITE_SPACE) ) {
                                alt84=2;
                            }
                            } finally {dbg.exitDecision(84);}

                            switch (alt84) {
                                case 1 :
                                    dbg.enterAlt(1);

                                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:415:32: DASH
                                    {
                                    dbg.location(415,32);
                                    DASH324=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_first_to_thirty_first3848); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_DASH.add(DASH324);


                                    }
                                    break;
                                case 2 :
                                    dbg.enterAlt(2);

                                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:415:39: WHITE_SPACE
                                    {
                                    dbg.location(415,39);
                                    WHITE_SPACE325=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_spelled_first_to_thirty_first3852); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE325);


                                    }
                                    break;

                            }
                            } finally {dbg.exitSubRule(84);}

                            dbg.location(415,53);
                            THIRD326=(Token)match(input,THIRD,FOLLOW_THIRD_in_spelled_first_to_thirty_first3856); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_THIRD.add(THIRD326);


                            }


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(85);}



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
                    // 415:63: -> INT[\"23\"]
                    {
                        dbg.location(415,66);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "23"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 24 :
                    dbg.enterAlt(24);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:416:5: ( TWENTY_FOURTH | ( TWENTY ( DASH | WHITE_SPACE )? FOURTH ) )
                    {
                    dbg.location(416,5);
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:416:5: ( TWENTY_FOURTH | ( TWENTY ( DASH | WHITE_SPACE )? FOURTH ) )
                    int alt87=2;
                    try { dbg.enterSubRule(87);
                    try { dbg.enterDecision(87);

                    int LA87_0 = input.LA(1);

                    if ( (LA87_0==TWENTY_FOURTH) ) {
                        alt87=1;
                    }
                    else if ( (LA87_0==TWENTY) ) {
                        alt87=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 87, 0, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }
                    } finally {dbg.exitDecision(87);}

                    switch (alt87) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:416:6: TWENTY_FOURTH
                            {
                            dbg.location(416,6);
                            TWENTY_FOURTH327=(Token)match(input,TWENTY_FOURTH,FOLLOW_TWENTY_FOURTH_in_spelled_first_to_thirty_first3872); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY_FOURTH.add(TWENTY_FOURTH327);


                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:416:23: ( TWENTY ( DASH | WHITE_SPACE )? FOURTH )
                            {
                            dbg.location(416,23);
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:416:23: ( TWENTY ( DASH | WHITE_SPACE )? FOURTH )
                            dbg.enterAlt(1);

                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:416:24: TWENTY ( DASH | WHITE_SPACE )? FOURTH
                            {
                            dbg.location(416,24);
                            TWENTY328=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_first_to_thirty_first3878); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY328);

                            dbg.location(416,31);
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:416:31: ( DASH | WHITE_SPACE )?
                            int alt86=3;
                            try { dbg.enterSubRule(86);
                            try { dbg.enterDecision(86);

                            int LA86_0 = input.LA(1);

                            if ( (LA86_0==DASH) ) {
                                alt86=1;
                            }
                            else if ( (LA86_0==WHITE_SPACE) ) {
                                alt86=2;
                            }
                            } finally {dbg.exitDecision(86);}

                            switch (alt86) {
                                case 1 :
                                    dbg.enterAlt(1);

                                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:416:32: DASH
                                    {
                                    dbg.location(416,32);
                                    DASH329=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_first_to_thirty_first3881); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_DASH.add(DASH329);


                                    }
                                    break;
                                case 2 :
                                    dbg.enterAlt(2);

                                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:416:39: WHITE_SPACE
                                    {
                                    dbg.location(416,39);
                                    WHITE_SPACE330=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_spelled_first_to_thirty_first3885); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE330);


                                    }
                                    break;

                            }
                            } finally {dbg.exitSubRule(86);}

                            dbg.location(416,53);
                            FOURTH331=(Token)match(input,FOURTH,FOLLOW_FOURTH_in_spelled_first_to_thirty_first3889); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_FOURTH.add(FOURTH331);


                            }


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(87);}



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
                    // 416:63: -> INT[\"24\"]
                    {
                        dbg.location(416,66);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "24"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 25 :
                    dbg.enterAlt(25);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:417:5: ( TWENTY_FIFTH | ( TWENTY ( DASH | WHITE_SPACE )? FIFTH ) )
                    {
                    dbg.location(417,5);
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:417:5: ( TWENTY_FIFTH | ( TWENTY ( DASH | WHITE_SPACE )? FIFTH ) )
                    int alt89=2;
                    try { dbg.enterSubRule(89);
                    try { dbg.enterDecision(89);

                    int LA89_0 = input.LA(1);

                    if ( (LA89_0==TWENTY_FIFTH) ) {
                        alt89=1;
                    }
                    else if ( (LA89_0==TWENTY) ) {
                        alt89=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 89, 0, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }
                    } finally {dbg.exitDecision(89);}

                    switch (alt89) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:417:6: TWENTY_FIFTH
                            {
                            dbg.location(417,6);
                            TWENTY_FIFTH332=(Token)match(input,TWENTY_FIFTH,FOLLOW_TWENTY_FIFTH_in_spelled_first_to_thirty_first3904); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY_FIFTH.add(TWENTY_FIFTH332);


                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:417:23: ( TWENTY ( DASH | WHITE_SPACE )? FIFTH )
                            {
                            dbg.location(417,23);
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:417:23: ( TWENTY ( DASH | WHITE_SPACE )? FIFTH )
                            dbg.enterAlt(1);

                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:417:24: TWENTY ( DASH | WHITE_SPACE )? FIFTH
                            {
                            dbg.location(417,24);
                            TWENTY333=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_first_to_thirty_first3911); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY333);

                            dbg.location(417,31);
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:417:31: ( DASH | WHITE_SPACE )?
                            int alt88=3;
                            try { dbg.enterSubRule(88);
                            try { dbg.enterDecision(88);

                            int LA88_0 = input.LA(1);

                            if ( (LA88_0==DASH) ) {
                                alt88=1;
                            }
                            else if ( (LA88_0==WHITE_SPACE) ) {
                                alt88=2;
                            }
                            } finally {dbg.exitDecision(88);}

                            switch (alt88) {
                                case 1 :
                                    dbg.enterAlt(1);

                                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:417:32: DASH
                                    {
                                    dbg.location(417,32);
                                    DASH334=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_first_to_thirty_first3914); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_DASH.add(DASH334);


                                    }
                                    break;
                                case 2 :
                                    dbg.enterAlt(2);

                                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:417:39: WHITE_SPACE
                                    {
                                    dbg.location(417,39);
                                    WHITE_SPACE335=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_spelled_first_to_thirty_first3918); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE335);


                                    }
                                    break;

                            }
                            } finally {dbg.exitSubRule(88);}

                            dbg.location(417,53);
                            FIFTH336=(Token)match(input,FIFTH,FOLLOW_FIFTH_in_spelled_first_to_thirty_first3922); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_FIFTH.add(FIFTH336);


                            }


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(89);}



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
                    // 417:63: -> INT[\"25\"]
                    {
                        dbg.location(417,66);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "25"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 26 :
                    dbg.enterAlt(26);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:418:5: ( TWENTY_SIXTH | ( TWENTY ( DASH | WHITE_SPACE )? SIXTH ) )
                    {
                    dbg.location(418,5);
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:418:5: ( TWENTY_SIXTH | ( TWENTY ( DASH | WHITE_SPACE )? SIXTH ) )
                    int alt91=2;
                    try { dbg.enterSubRule(91);
                    try { dbg.enterDecision(91);

                    int LA91_0 = input.LA(1);

                    if ( (LA91_0==TWENTY_SIXTH) ) {
                        alt91=1;
                    }
                    else if ( (LA91_0==TWENTY) ) {
                        alt91=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 91, 0, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }
                    } finally {dbg.exitDecision(91);}

                    switch (alt91) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:418:6: TWENTY_SIXTH
                            {
                            dbg.location(418,6);
                            TWENTY_SIXTH337=(Token)match(input,TWENTY_SIXTH,FOLLOW_TWENTY_SIXTH_in_spelled_first_to_thirty_first3938); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY_SIXTH.add(TWENTY_SIXTH337);


                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:418:23: ( TWENTY ( DASH | WHITE_SPACE )? SIXTH )
                            {
                            dbg.location(418,23);
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:418:23: ( TWENTY ( DASH | WHITE_SPACE )? SIXTH )
                            dbg.enterAlt(1);

                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:418:24: TWENTY ( DASH | WHITE_SPACE )? SIXTH
                            {
                            dbg.location(418,24);
                            TWENTY338=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_first_to_thirty_first3945); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY338);

                            dbg.location(418,31);
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:418:31: ( DASH | WHITE_SPACE )?
                            int alt90=3;
                            try { dbg.enterSubRule(90);
                            try { dbg.enterDecision(90);

                            int LA90_0 = input.LA(1);

                            if ( (LA90_0==DASH) ) {
                                alt90=1;
                            }
                            else if ( (LA90_0==WHITE_SPACE) ) {
                                alt90=2;
                            }
                            } finally {dbg.exitDecision(90);}

                            switch (alt90) {
                                case 1 :
                                    dbg.enterAlt(1);

                                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:418:32: DASH
                                    {
                                    dbg.location(418,32);
                                    DASH339=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_first_to_thirty_first3948); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_DASH.add(DASH339);


                                    }
                                    break;
                                case 2 :
                                    dbg.enterAlt(2);

                                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:418:39: WHITE_SPACE
                                    {
                                    dbg.location(418,39);
                                    WHITE_SPACE340=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_spelled_first_to_thirty_first3952); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE340);


                                    }
                                    break;

                            }
                            } finally {dbg.exitSubRule(90);}

                            dbg.location(418,53);
                            SIXTH341=(Token)match(input,SIXTH,FOLLOW_SIXTH_in_spelled_first_to_thirty_first3956); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_SIXTH.add(SIXTH341);


                            }


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(91);}



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
                    // 418:63: -> INT[\"26\"]
                    {
                        dbg.location(418,66);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "26"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 27 :
                    dbg.enterAlt(27);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:419:5: ( TWENTY_SEVENTH | ( TWENTY ( DASH | WHITE_SPACE )? SEVENTH ) )
                    {
                    dbg.location(419,5);
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:419:5: ( TWENTY_SEVENTH | ( TWENTY ( DASH | WHITE_SPACE )? SEVENTH ) )
                    int alt93=2;
                    try { dbg.enterSubRule(93);
                    try { dbg.enterDecision(93);

                    int LA93_0 = input.LA(1);

                    if ( (LA93_0==TWENTY_SEVENTH) ) {
                        alt93=1;
                    }
                    else if ( (LA93_0==TWENTY) ) {
                        alt93=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 93, 0, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }
                    } finally {dbg.exitDecision(93);}

                    switch (alt93) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:419:6: TWENTY_SEVENTH
                            {
                            dbg.location(419,6);
                            TWENTY_SEVENTH342=(Token)match(input,TWENTY_SEVENTH,FOLLOW_TWENTY_SEVENTH_in_spelled_first_to_thirty_first3972); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY_SEVENTH.add(TWENTY_SEVENTH342);


                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:419:23: ( TWENTY ( DASH | WHITE_SPACE )? SEVENTH )
                            {
                            dbg.location(419,23);
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:419:23: ( TWENTY ( DASH | WHITE_SPACE )? SEVENTH )
                            dbg.enterAlt(1);

                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:419:24: TWENTY ( DASH | WHITE_SPACE )? SEVENTH
                            {
                            dbg.location(419,24);
                            TWENTY343=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_first_to_thirty_first3977); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY343);

                            dbg.location(419,31);
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:419:31: ( DASH | WHITE_SPACE )?
                            int alt92=3;
                            try { dbg.enterSubRule(92);
                            try { dbg.enterDecision(92);

                            int LA92_0 = input.LA(1);

                            if ( (LA92_0==DASH) ) {
                                alt92=1;
                            }
                            else if ( (LA92_0==WHITE_SPACE) ) {
                                alt92=2;
                            }
                            } finally {dbg.exitDecision(92);}

                            switch (alt92) {
                                case 1 :
                                    dbg.enterAlt(1);

                                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:419:32: DASH
                                    {
                                    dbg.location(419,32);
                                    DASH344=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_first_to_thirty_first3980); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_DASH.add(DASH344);


                                    }
                                    break;
                                case 2 :
                                    dbg.enterAlt(2);

                                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:419:39: WHITE_SPACE
                                    {
                                    dbg.location(419,39);
                                    WHITE_SPACE345=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_spelled_first_to_thirty_first3984); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE345);


                                    }
                                    break;

                            }
                            } finally {dbg.exitSubRule(92);}

                            dbg.location(419,53);
                            SEVENTH346=(Token)match(input,SEVENTH,FOLLOW_SEVENTH_in_spelled_first_to_thirty_first3988); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_SEVENTH.add(SEVENTH346);


                            }


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(93);}



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
                    // 419:63: -> INT[\"27\"]
                    {
                        dbg.location(419,66);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "27"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 28 :
                    dbg.enterAlt(28);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:420:5: ( TWENTY_EIGHTH | ( TWENTY ( DASH | WHITE_SPACE )? EIGHTH ) )
                    {
                    dbg.location(420,5);
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:420:5: ( TWENTY_EIGHTH | ( TWENTY ( DASH | WHITE_SPACE )? EIGHTH ) )
                    int alt95=2;
                    try { dbg.enterSubRule(95);
                    try { dbg.enterDecision(95);

                    int LA95_0 = input.LA(1);

                    if ( (LA95_0==TWENTY_EIGHTH) ) {
                        alt95=1;
                    }
                    else if ( (LA95_0==TWENTY) ) {
                        alt95=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 95, 0, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }
                    } finally {dbg.exitDecision(95);}

                    switch (alt95) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:420:6: TWENTY_EIGHTH
                            {
                            dbg.location(420,6);
                            TWENTY_EIGHTH347=(Token)match(input,TWENTY_EIGHTH,FOLLOW_TWENTY_EIGHTH_in_spelled_first_to_thirty_first4002); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY_EIGHTH.add(TWENTY_EIGHTH347);


                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:420:23: ( TWENTY ( DASH | WHITE_SPACE )? EIGHTH )
                            {
                            dbg.location(420,23);
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:420:23: ( TWENTY ( DASH | WHITE_SPACE )? EIGHTH )
                            dbg.enterAlt(1);

                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:420:24: TWENTY ( DASH | WHITE_SPACE )? EIGHTH
                            {
                            dbg.location(420,24);
                            TWENTY348=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_first_to_thirty_first4008); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY348);

                            dbg.location(420,31);
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:420:31: ( DASH | WHITE_SPACE )?
                            int alt94=3;
                            try { dbg.enterSubRule(94);
                            try { dbg.enterDecision(94);

                            int LA94_0 = input.LA(1);

                            if ( (LA94_0==DASH) ) {
                                alt94=1;
                            }
                            else if ( (LA94_0==WHITE_SPACE) ) {
                                alt94=2;
                            }
                            } finally {dbg.exitDecision(94);}

                            switch (alt94) {
                                case 1 :
                                    dbg.enterAlt(1);

                                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:420:32: DASH
                                    {
                                    dbg.location(420,32);
                                    DASH349=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_first_to_thirty_first4011); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_DASH.add(DASH349);


                                    }
                                    break;
                                case 2 :
                                    dbg.enterAlt(2);

                                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:420:39: WHITE_SPACE
                                    {
                                    dbg.location(420,39);
                                    WHITE_SPACE350=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_spelled_first_to_thirty_first4015); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE350);


                                    }
                                    break;

                            }
                            } finally {dbg.exitSubRule(94);}

                            dbg.location(420,53);
                            EIGHTH351=(Token)match(input,EIGHTH,FOLLOW_EIGHTH_in_spelled_first_to_thirty_first4019); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_EIGHTH.add(EIGHTH351);


                            }


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(95);}



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
                    // 420:63: -> INT[\"28\"]
                    {
                        dbg.location(420,66);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "28"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 29 :
                    dbg.enterAlt(29);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:421:5: ( TWENTY_NINTH | ( TWENTY ( DASH | WHITE_SPACE )? NINTH ) )
                    {
                    dbg.location(421,5);
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:421:5: ( TWENTY_NINTH | ( TWENTY ( DASH | WHITE_SPACE )? NINTH ) )
                    int alt97=2;
                    try { dbg.enterSubRule(97);
                    try { dbg.enterDecision(97);

                    int LA97_0 = input.LA(1);

                    if ( (LA97_0==TWENTY_NINTH) ) {
                        alt97=1;
                    }
                    else if ( (LA97_0==TWENTY) ) {
                        alt97=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 97, 0, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }
                    } finally {dbg.exitDecision(97);}

                    switch (alt97) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:421:6: TWENTY_NINTH
                            {
                            dbg.location(421,6);
                            TWENTY_NINTH352=(Token)match(input,TWENTY_NINTH,FOLLOW_TWENTY_NINTH_in_spelled_first_to_thirty_first4034); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY_NINTH.add(TWENTY_NINTH352);


                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:421:23: ( TWENTY ( DASH | WHITE_SPACE )? NINTH )
                            {
                            dbg.location(421,23);
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:421:23: ( TWENTY ( DASH | WHITE_SPACE )? NINTH )
                            dbg.enterAlt(1);

                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:421:24: TWENTY ( DASH | WHITE_SPACE )? NINTH
                            {
                            dbg.location(421,24);
                            TWENTY353=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_first_to_thirty_first4041); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY353);

                            dbg.location(421,31);
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:421:31: ( DASH | WHITE_SPACE )?
                            int alt96=3;
                            try { dbg.enterSubRule(96);
                            try { dbg.enterDecision(96);

                            int LA96_0 = input.LA(1);

                            if ( (LA96_0==DASH) ) {
                                alt96=1;
                            }
                            else if ( (LA96_0==WHITE_SPACE) ) {
                                alt96=2;
                            }
                            } finally {dbg.exitDecision(96);}

                            switch (alt96) {
                                case 1 :
                                    dbg.enterAlt(1);

                                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:421:32: DASH
                                    {
                                    dbg.location(421,32);
                                    DASH354=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_first_to_thirty_first4044); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_DASH.add(DASH354);


                                    }
                                    break;
                                case 2 :
                                    dbg.enterAlt(2);

                                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:421:39: WHITE_SPACE
                                    {
                                    dbg.location(421,39);
                                    WHITE_SPACE355=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_spelled_first_to_thirty_first4048); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE355);


                                    }
                                    break;

                            }
                            } finally {dbg.exitSubRule(96);}

                            dbg.location(421,53);
                            NINTH356=(Token)match(input,NINTH,FOLLOW_NINTH_in_spelled_first_to_thirty_first4052); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NINTH.add(NINTH356);


                            }


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(97);}



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
                    // 421:63: -> INT[\"29\"]
                    {
                        dbg.location(421,66);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "29"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 30 :
                    dbg.enterAlt(30);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:422:5: THIRTIETH
                    {
                    dbg.location(422,5);
                    THIRTIETH357=(Token)match(input,THIRTIETH,FOLLOW_THIRTIETH_in_spelled_first_to_thirty_first4067); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THIRTIETH.add(THIRTIETH357);



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
                    // 422:63: -> INT[\"30\"]
                    {
                        dbg.location(422,66);
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "30"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 31 :
                    dbg.enterAlt(31);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:423:5: ( THIRTY_FIRST | ( THIRTY ( DASH | WHITE_SPACE )? FIRST ) )
                    {
                    dbg.location(423,5);
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:423:5: ( THIRTY_FIRST | ( THIRTY ( DASH | WHITE_SPACE )? FIRST ) )
                    int alt99=2;
                    try { dbg.enterSubRule(99);
                    try { dbg.enterDecision(99);

                    int LA99_0 = input.LA(1);

                    if ( (LA99_0==THIRTY_FIRST) ) {
                        alt99=1;
                    }
                    else if ( (LA99_0==THIRTY) ) {
                        alt99=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 99, 0, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }
                    } finally {dbg.exitDecision(99);}

                    switch (alt99) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:423:6: THIRTY_FIRST
                            {
                            dbg.location(423,6);
                            THIRTY_FIRST358=(Token)match(input,THIRTY_FIRST,FOLLOW_THIRTY_FIRST_in_spelled_first_to_thirty_first4127); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_THIRTY_FIRST.add(THIRTY_FIRST358);


                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:423:23: ( THIRTY ( DASH | WHITE_SPACE )? FIRST )
                            {
                            dbg.location(423,23);
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:423:23: ( THIRTY ( DASH | WHITE_SPACE )? FIRST )
                            dbg.enterAlt(1);

                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:423:24: THIRTY ( DASH | WHITE_SPACE )? FIRST
                            {
                            dbg.location(423,24);
                            THIRTY359=(Token)match(input,THIRTY,FOLLOW_THIRTY_in_spelled_first_to_thirty_first4134); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_THIRTY.add(THIRTY359);

                            dbg.location(423,31);
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:423:31: ( DASH | WHITE_SPACE )?
                            int alt98=3;
                            try { dbg.enterSubRule(98);
                            try { dbg.enterDecision(98);

                            int LA98_0 = input.LA(1);

                            if ( (LA98_0==DASH) ) {
                                alt98=1;
                            }
                            else if ( (LA98_0==WHITE_SPACE) ) {
                                alt98=2;
                            }
                            } finally {dbg.exitDecision(98);}

                            switch (alt98) {
                                case 1 :
                                    dbg.enterAlt(1);

                                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:423:32: DASH
                                    {
                                    dbg.location(423,32);
                                    DASH360=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_first_to_thirty_first4137); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_DASH.add(DASH360);


                                    }
                                    break;
                                case 2 :
                                    dbg.enterAlt(2);

                                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:423:39: WHITE_SPACE
                                    {
                                    dbg.location(423,39);
                                    WHITE_SPACE361=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_spelled_first_to_thirty_first4141); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE361);


                                    }
                                    break;

                            }
                            } finally {dbg.exitSubRule(98);}

                            dbg.location(423,53);
                            FIRST362=(Token)match(input,FIRST,FOLLOW_FIRST_in_spelled_first_to_thirty_first4145); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_FIRST.add(FIRST362);


                            }


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(99);}



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
                    // 423:63: -> INT[\"31\"]
                    {
                        dbg.location(423,66);
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
        dbg.location(424, 3);

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
        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:44:7: ( date ( date_time_separator time )? )
        dbg.enterAlt(1);

        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:44:8: date ( date_time_separator time )?
        {
        dbg.location(44,8);
        pushFollow(FOLLOW_date_in_synpred1_Date177);
        date();

        state._fsp--;
        if (state.failed) return ;
        dbg.location(44,13);
        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:44:13: ( date_time_separator time )?
        int alt101=2;
        try { dbg.enterSubRule(101);
        try { dbg.enterDecision(101);

        int LA101_0 = input.LA(1);

        if ( (LA101_0==WHITE_SPACE||LA101_0==COMMA) ) {
            alt101=1;
        }
        } finally {dbg.exitDecision(101);}

        switch (alt101) {
            case 1 :
                dbg.enterAlt(1);

                // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:44:14: date_time_separator time
                {
                dbg.location(44,14);
                pushFollow(FOLLOW_date_time_separator_in_synpred1_Date180);
                date_time_separator();

                state._fsp--;
                if (state.failed) return ;
                dbg.location(44,34);
                pushFollow(FOLLOW_time_in_synpred1_Date182);
                time();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }
        } finally {dbg.exitSubRule(101);}


        }
    }
    // $ANTLR end synpred1_Date

    // $ANTLR start synpred2_Date
    public final void synpred2_Date_fragment() throws RecognitionException {   
        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:67:5: ( relaxed_date )
        dbg.enterAlt(1);

        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:67:6: relaxed_date
        {
        dbg.location(67,6);
        pushFollow(FOLLOW_relaxed_date_in_synpred2_Date343);
        relaxed_date();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_Date

    // $ANTLR start synpred3_Date
    public final void synpred3_Date_fragment() throws RecognitionException {   
        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:95:7: ( ( THE WHITE_SPACE )? relaxed_day_of_month WHITE_SPACE ( OF WHITE_SPACE )? relaxed_month relaxed_year_prefix relaxed_year )
        dbg.enterAlt(1);

        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:95:8: ( THE WHITE_SPACE )? relaxed_day_of_month WHITE_SPACE ( OF WHITE_SPACE )? relaxed_month relaxed_year_prefix relaxed_year
        {
        dbg.location(95,8);
        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:95:8: ( THE WHITE_SPACE )?
        int alt102=2;
        try { dbg.enterSubRule(102);
        try { dbg.enterDecision(102);

        int LA102_0 = input.LA(1);

        if ( (LA102_0==THE) ) {
            alt102=1;
        }
        } finally {dbg.exitDecision(102);}

        switch (alt102) {
            case 1 :
                dbg.enterAlt(1);

                // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:95:9: THE WHITE_SPACE
                {
                dbg.location(95,9);
                match(input,THE,FOLLOW_THE_in_synpred3_Date549); if (state.failed) return ;
                dbg.location(95,13);
                match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_synpred3_Date551); if (state.failed) return ;

                }
                break;

        }
        } finally {dbg.exitSubRule(102);}

        dbg.location(95,27);
        pushFollow(FOLLOW_relaxed_day_of_month_in_synpred3_Date555);
        relaxed_day_of_month();

        state._fsp--;
        if (state.failed) return ;
        dbg.location(95,48);
        match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_synpred3_Date557); if (state.failed) return ;
        dbg.location(95,60);
        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:95:60: ( OF WHITE_SPACE )?
        int alt103=2;
        try { dbg.enterSubRule(103);
        try { dbg.enterDecision(103);

        int LA103_0 = input.LA(1);

        if ( (LA103_0==OF) ) {
            alt103=1;
        }
        } finally {dbg.exitDecision(103);}

        switch (alt103) {
            case 1 :
                dbg.enterAlt(1);

                // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:95:61: OF WHITE_SPACE
                {
                dbg.location(95,61);
                match(input,OF,FOLLOW_OF_in_synpred3_Date560); if (state.failed) return ;
                dbg.location(95,64);
                match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_synpred3_Date562); if (state.failed) return ;

                }
                break;

        }
        } finally {dbg.exitSubRule(103);}

        dbg.location(95,78);
        pushFollow(FOLLOW_relaxed_month_in_synpred3_Date566);
        relaxed_month();

        state._fsp--;
        if (state.failed) return ;
        dbg.location(95,92);
        pushFollow(FOLLOW_relaxed_year_prefix_in_synpred3_Date568);
        relaxed_year_prefix();

        state._fsp--;
        if (state.failed) return ;
        dbg.location(95,112);
        pushFollow(FOLLOW_relaxed_year_in_synpred3_Date570);
        relaxed_year();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred3_Date

    // $ANTLR start synpred4_Date
    public final void synpred4_Date_fragment() throws RecognitionException {   
        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:98:9: ( relaxed_month WHITE_SPACE relaxed_day_of_month relaxed_year_prefix relaxed_year )
        dbg.enterAlt(1);

        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:98:10: relaxed_month WHITE_SPACE relaxed_day_of_month relaxed_year_prefix relaxed_year
        {
        dbg.location(98,10);
        pushFollow(FOLLOW_relaxed_month_in_synpred4_Date620);
        relaxed_month();

        state._fsp--;
        if (state.failed) return ;
        dbg.location(98,24);
        match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_synpred4_Date622); if (state.failed) return ;
        dbg.location(98,36);
        pushFollow(FOLLOW_relaxed_day_of_month_in_synpred4_Date624);
        relaxed_day_of_month();

        state._fsp--;
        if (state.failed) return ;
        dbg.location(98,57);
        pushFollow(FOLLOW_relaxed_year_prefix_in_synpred4_Date626);
        relaxed_year_prefix();

        state._fsp--;
        if (state.failed) return ;
        dbg.location(98,77);
        pushFollow(FOLLOW_relaxed_year_in_synpred4_Date628);
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
    protected DFA59 dfa59 = new DFA59(this);
    protected DFA79 dfa79 = new DFA79(this);
    protected DFA100 dfa100 = new DFA100(this);
    static final String DFA3_eotS =
        "\u008c\uffff";
    static final String DFA3_eofS =
        "\2\uffff\4\137\101\uffff\1\137\30\uffff\1\u0082\1\uffff\1\u0082"+
        "\5\137\44\uffff";
    static final String DFA3_minS =
        "\1\32\1\uffff\4\26\101\uffff\1\26\30\uffff\1\26\1\uffff\6\26\1\uffff"+
        "\27\0\4\uffff\7\0\1\uffff";
    static final String DFA3_maxS =
        "\1\u008f\1\uffff\2\137\2\140\101\uffff\1\140\30\uffff\1\u008f\1"+
        "\uffff\1\u008f\5\130\1\uffff\27\0\4\uffff\7\0\1\uffff";
    static final String DFA3_acceptS =
        "\1\uffff\1\1\4\uffff\101\1\1\uffff\27\1\1\2\1\uffff\1\1\6\uffff"+
        "\1\1\27\uffff\4\1\7\uffff\1\1";
    static final String DFA3_specialS =
        "\1\14\1\uffff\1\46\1\40\1\43\1\3\101\uffff\1\37\30\uffff\1\50\1"+
        "\uffff\1\52\1\13\1\15\1\12\1\11\1\10\1\uffff\1\44\1\26\1\20\1\21"+
        "\1\36\1\41\1\35\1\33\1\30\1\51\1\47\1\45\1\42\1\32\1\34\1\23\1\22"+
        "\1\25\1\24\1\17\1\31\1\27\1\16\4\uffff\1\0\1\1\1\2\1\4\1\5\1\6\1"+
        "\7\1\uffff}>";
    static final String[] DFA3_transitionS = {
            "\1\1\1\130\3\uffff\1\73\1\74\1\75\1\76\1\77\1\100\1\101\1\102"+
            "\1\103\1\104\1\105\1\106\1\uffff\1\120\1\133\2\uffff\1\2\1\34"+
            "\1\35\1\36\1\37\1\40\1\113\1\112\1\114\1\115\1\116\1\117\3\uffff"+
            "\1\131\1\132\1\121\1\122\1\123\1\124\1\125\1\126\1\127\1\134"+
            "\1\135\1\136\5\uffff\2\137\7\uffff\1\137\1\107\1\3\1\4\1\5\1"+
            "\6\1\110\1\111\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1"+
            "\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1"+
            "\41\1\42\1\43\1\44\1\45\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1"+
            "\55\1\56\1\57\1\60\1\61\1\62\1\63\1\64\1\65\1\66\1\67\1\70\1"+
            "\71\1\72",
            "",
            "\1\140\1\uffff\1\137\25\uffff\2\141\33\uffff\1\137\2\uffff"+
            "\2\137\2\uffff\7\137\1\uffff\1\137\1\uffff\4\137",
            "\1\142\1\uffff\1\137\25\uffff\2\141\33\uffff\1\137\2\uffff"+
            "\2\137\2\uffff\7\137\1\uffff\1\137\1\uffff\4\137",
            "\1\142\1\uffff\1\137\25\uffff\2\141\33\uffff\1\137\2\uffff"+
            "\2\137\2\uffff\7\137\1\uffff\1\143\1\uffff\1\144\1\145\1\146"+
            "\1\147\1\150",
            "\1\142\1\uffff\1\137\62\uffff\1\137\2\uffff\2\137\2\uffff\7"+
            "\137\1\uffff\1\143\1\uffff\1\144\1\145\1\146\1\147\1\150",
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
            "\1\137\1\uffff\1\137\62\uffff\1\137\2\uffff\2\137\2\uffff\7"+
            "\137\1\uffff\1\143\1\uffff\1\144\1\145\1\146\1\147\1\150",
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
            "\1\u0080\1\uffff\1\u0081\2\137\1\151\2\uffff\1\u0083\1\152"+
            "\1\153\1\154\1\155\1\156\1\157\1\160\1\161\1\162\1\163\1\164"+
            "\1\165\1\uffff\1\137\1\177\2\uffff\14\137\3\uffff\1\175\1\176"+
            "\1\166\1\167\1\170\1\171\1\172\1\173\1\174\3\137\3\uffff\2\137"+
            "\2\uffff\7\137\1\uffff\66\137",
            "",
            "\1\u0080\1\uffff\1\u0081\2\137\1\151\2\uffff\1\u0083\1\152"+
            "\1\153\1\154\1\155\1\156\1\157\1\160\1\161\1\162\1\163\1\164"+
            "\1\165\1\uffff\1\137\1\177\2\uffff\14\137\3\uffff\1\175\1\176"+
            "\1\u0084\1\u0085\1\u0086\1\u0087\1\u0088\1\u0089\1\u008a\3\137"+
            "\3\uffff\2\137\2\uffff\7\137\1\uffff\66\137",
            "\1\137\1\uffff\1\137\25\uffff\2\u008b\34\uffff\4\137\2\uffff"+
            "\7\137",
            "\1\137\1\uffff\1\137\25\uffff\2\u008b\34\uffff\4\137\2\uffff"+
            "\7\137",
            "\1\137\1\uffff\1\137\25\uffff\2\u008b\34\uffff\4\137\2\uffff"+
            "\7\137",
            "\1\137\1\uffff\1\137\25\uffff\2\u008b\34\uffff\4\137\2\uffff"+
            "\7\137",
            "\1\137\1\uffff\1\137\25\uffff\2\u008b\34\uffff\4\137\2\uffff"+
            "\7\137",
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
            return "43:5: ( ( date ( date_time_separator time )? )=> date ( date_time_separator time )? | time ( time_date_separator date )? )";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA3_132 = input.LA(1);

                         
                        int index3_132 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 139;}

                        else if ( (true) ) {s = 95;}

                         
                        input.seek(index3_132);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA3_133 = input.LA(1);

                         
                        int index3_133 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 139;}

                        else if ( (true) ) {s = 95;}

                         
                        input.seek(index3_133);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA3_134 = input.LA(1);

                         
                        int index3_134 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 139;}

                        else if ( (true) ) {s = 95;}

                         
                        input.seek(index3_134);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
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

                        else if ( (LA3_5==EOF||LA3_5==COMMA||LA3_5==COLON||(LA3_5>=AM && LA3_5<=PM)||(LA3_5>=UTC && LA3_5<=HAST)) ) {s = 95;}

                         
                        input.seek(index3_5);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA3_135 = input.LA(1);

                         
                        int index3_135 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 139;}

                        else if ( (true) ) {s = 95;}

                         
                        input.seek(index3_135);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA3_136 = input.LA(1);

                         
                        int index3_136 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 139;}

                        else if ( (true) ) {s = 95;}

                         
                        input.seek(index3_136);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA3_137 = input.LA(1);

                         
                        int index3_137 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 139;}

                        else if ( (true) ) {s = 95;}

                         
                        input.seek(index3_137);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA3_138 = input.LA(1);

                         
                        int index3_138 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 139;}

                        else if ( (true) ) {s = 95;}

                         
                        input.seek(index3_138);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA3_103 = input.LA(1);

                         
                        int index3_103 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA3_103>=DASH && LA3_103<=SLASH)) && (synpred1_Date())) {s = 139;}

                        else if ( (LA3_103==EOF||LA3_103==WHITE_SPACE||LA3_103==COMMA||(LA3_103>=MILITARY_HOUR_SUFFIX && LA3_103<=PM)||(LA3_103>=UTC && LA3_103<=HAST)) ) {s = 95;}

                         
                        input.seek(index3_103);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA3_102 = input.LA(1);

                         
                        int index3_102 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA3_102>=DASH && LA3_102<=SLASH)) && (synpred1_Date())) {s = 139;}

                        else if ( (LA3_102==EOF||LA3_102==WHITE_SPACE||LA3_102==COMMA||(LA3_102>=MILITARY_HOUR_SUFFIX && LA3_102<=PM)||(LA3_102>=UTC && LA3_102<=HAST)) ) {s = 95;}

                         
                        input.seek(index3_102);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA3_101 = input.LA(1);

                         
                        int index3_101 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA3_101>=DASH && LA3_101<=SLASH)) && (synpred1_Date())) {s = 139;}

                        else if ( (LA3_101==EOF||LA3_101==WHITE_SPACE||LA3_101==COMMA||(LA3_101>=MILITARY_HOUR_SUFFIX && LA3_101<=PM)||(LA3_101>=UTC && LA3_101<=HAST)) ) {s = 95;}

                         
                        input.seek(index3_101);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA3_99 = input.LA(1);

                         
                        int index3_99 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA3_99==EOF||LA3_99==WHITE_SPACE||LA3_99==COMMA||(LA3_99>=MILITARY_HOUR_SUFFIX && LA3_99<=PM)||(LA3_99>=UTC && LA3_99<=HAST)) ) {s = 95;}

                        else if ( ((LA3_99>=DASH && LA3_99<=SLASH)) && (synpred1_Date())) {s = 139;}

                         
                        input.seek(index3_99);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
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

                        else if ( ((LA3_0>=NOON && LA3_0<=MIDNIGHT)||LA3_0==INT_0) ) {s = 95;}

                         
                        input.seek(index3_0);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA3_100 = input.LA(1);

                         
                        int index3_100 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA3_100>=DASH && LA3_100<=SLASH)) && (synpred1_Date())) {s = 139;}

                        else if ( (LA3_100==EOF||LA3_100==WHITE_SPACE||LA3_100==COMMA||(LA3_100>=MILITARY_HOUR_SUFFIX && LA3_100<=PM)||(LA3_100>=UTC && LA3_100<=HAST)) ) {s = 95;}

                         
                        input.seek(index3_100);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA3_127 = input.LA(1);

                         
                        int index3_127 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 139;}

                        else if ( (true) ) {s = 95;}

                         
                        input.seek(index3_127);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA3_124 = input.LA(1);

                         
                        int index3_124 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 139;}

                        else if ( (true) ) {s = 95;}

                         
                        input.seek(index3_124);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA3_107 = input.LA(1);

                         
                        int index3_107 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 139;}

                        else if ( (true) ) {s = 95;}

                         
                        input.seek(index3_107);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA3_108 = input.LA(1);

                         
                        int index3_108 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 139;}

                        else if ( (true) ) {s = 95;}

                         
                        input.seek(index3_108);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA3_121 = input.LA(1);

                         
                        int index3_121 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 139;}

                        else if ( (true) ) {s = 95;}

                         
                        input.seek(index3_121);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA3_120 = input.LA(1);

                         
                        int index3_120 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 139;}

                        else if ( (true) ) {s = 95;}

                         
                        input.seek(index3_120);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA3_123 = input.LA(1);

                         
                        int index3_123 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 139;}

                        else if ( (true) ) {s = 95;}

                         
                        input.seek(index3_123);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA3_122 = input.LA(1);

                         
                        int index3_122 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 139;}

                        else if ( (true) ) {s = 95;}

                         
                        input.seek(index3_122);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA3_106 = input.LA(1);

                         
                        int index3_106 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 139;}

                        else if ( (true) ) {s = 95;}

                         
                        input.seek(index3_106);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA3_126 = input.LA(1);

                         
                        int index3_126 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 139;}

                        else if ( (true) ) {s = 95;}

                         
                        input.seek(index3_126);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA3_113 = input.LA(1);

                         
                        int index3_113 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 139;}

                        else if ( (true) ) {s = 95;}

                         
                        input.seek(index3_113);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA3_125 = input.LA(1);

                         
                        int index3_125 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 139;}

                        else if ( (true) ) {s = 95;}

                         
                        input.seek(index3_125);
                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA3_118 = input.LA(1);

                         
                        int index3_118 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 139;}

                        else if ( (true) ) {s = 95;}

                         
                        input.seek(index3_118);
                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA3_112 = input.LA(1);

                         
                        int index3_112 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 139;}

                        else if ( (true) ) {s = 95;}

                         
                        input.seek(index3_112);
                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA3_119 = input.LA(1);

                         
                        int index3_119 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 139;}

                        else if ( (true) ) {s = 95;}

                         
                        input.seek(index3_119);
                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA3_111 = input.LA(1);

                         
                        int index3_111 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 139;}

                        else if ( (true) ) {s = 95;}

                         
                        input.seek(index3_111);
                        if ( s>=0 ) return s;
                        break;
                    case 30 : 
                        int LA3_109 = input.LA(1);

                         
                        int index3_109 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 139;}

                        else if ( (true) ) {s = 95;}

                         
                        input.seek(index3_109);
                        if ( s>=0 ) return s;
                        break;
                    case 31 : 
                        int LA3_71 = input.LA(1);

                         
                        int index3_71 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA3_71==EOF||LA3_71==WHITE_SPACE||LA3_71==COMMA||LA3_71==COLON||(LA3_71>=AM && LA3_71<=PM)||(LA3_71>=UTC && LA3_71<=HAST)) ) {s = 95;}

                        else if ( (LA3_71==INT_00) ) {s = 99;}

                        else if ( (LA3_71==INT_01_TO_12) ) {s = 100;}

                        else if ( (LA3_71==INT_13_TO_23) ) {s = 101;}

                        else if ( (LA3_71==INT_24_TO_31) ) {s = 102;}

                        else if ( (LA3_71==INT_32_TO_59) ) {s = 103;}

                        else if ( (LA3_71==INT_60_TO_99) && (synpred1_Date())) {s = 104;}

                         
                        input.seek(index3_71);
                        if ( s>=0 ) return s;
                        break;
                    case 32 : 
                        int LA3_3 = input.LA(1);

                         
                        int index3_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA3_3==WHITE_SPACE) ) {s = 98;}

                        else if ( ((LA3_3>=DASH && LA3_3<=SLASH)) && (synpred1_Date())) {s = 97;}

                        else if ( (LA3_3==EOF||LA3_3==COMMA||LA3_3==COLON||(LA3_3>=AM && LA3_3<=PM)||(LA3_3>=UTC && LA3_3<=HAST)||LA3_3==INT_00||(LA3_3>=INT_01_TO_12 && LA3_3<=INT_32_TO_59)) ) {s = 95;}

                         
                        input.seek(index3_3);
                        if ( s>=0 ) return s;
                        break;
                    case 33 : 
                        int LA3_110 = input.LA(1);

                         
                        int index3_110 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 139;}

                        else if ( (true) ) {s = 95;}

                         
                        input.seek(index3_110);
                        if ( s>=0 ) return s;
                        break;
                    case 34 : 
                        int LA3_117 = input.LA(1);

                         
                        int index3_117 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 139;}

                        else if ( (true) ) {s = 95;}

                         
                        input.seek(index3_117);
                        if ( s>=0 ) return s;
                        break;
                    case 35 : 
                        int LA3_4 = input.LA(1);

                         
                        int index3_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA3_4==EOF||LA3_4==COMMA||LA3_4==COLON||(LA3_4>=AM && LA3_4<=PM)||(LA3_4>=UTC && LA3_4<=HAST)) ) {s = 95;}

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
                    case 36 : 
                        int LA3_105 = input.LA(1);

                         
                        int index3_105 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 139;}

                        else if ( (true) ) {s = 95;}

                         
                        input.seek(index3_105);
                        if ( s>=0 ) return s;
                        break;
                    case 37 : 
                        int LA3_116 = input.LA(1);

                         
                        int index3_116 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 139;}

                        else if ( (true) ) {s = 95;}

                         
                        input.seek(index3_116);
                        if ( s>=0 ) return s;
                        break;
                    case 38 : 
                        int LA3_2 = input.LA(1);

                         
                        int index3_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA3_2==EOF||LA3_2==COMMA||LA3_2==COLON||(LA3_2>=AM && LA3_2<=PM)||(LA3_2>=UTC && LA3_2<=HAST)||LA3_2==INT_00||(LA3_2>=INT_01_TO_12 && LA3_2<=INT_32_TO_59)) ) {s = 95;}

                        else if ( (LA3_2==WHITE_SPACE) ) {s = 96;}

                        else if ( ((LA3_2>=DASH && LA3_2<=SLASH)) && (synpred1_Date())) {s = 97;}

                         
                        input.seek(index3_2);
                        if ( s>=0 ) return s;
                        break;
                    case 39 : 
                        int LA3_115 = input.LA(1);

                         
                        int index3_115 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 139;}

                        else if ( (true) ) {s = 95;}

                         
                        input.seek(index3_115);
                        if ( s>=0 ) return s;
                        break;
                    case 40 : 
                        int LA3_96 = input.LA(1);

                         
                        int index3_96 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA3_96==DAY) ) {s = 105;}

                        else if ( ((LA3_96>=ON && LA3_96<=THE)||LA3_96==IN||(LA3_96>=INT_1_TO_5 && LA3_96<=UPCOMING)||(LA3_96>=TODAY && LA3_96<=YESTERDAY)||(LA3_96>=AM && LA3_96<=PM)||(LA3_96>=UTC && LA3_96<=HAST)||(LA3_96>=INT_00 && LA3_96<=THIRTY_FIRST)) ) {s = 95;}

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

                        else if ( (LA3_96==WHITE_SPACE) && (synpred1_Date())) {s = 128;}

                        else if ( (LA3_96==COMMA) && (synpred1_Date())) {s = 129;}

                        else if ( (LA3_96==EOF) && (synpred1_Date())) {s = 130;}

                        else if ( (LA3_96==OF) && (synpred1_Date())) {s = 131;}

                         
                        input.seek(index3_96);
                        if ( s>=0 ) return s;
                        break;
                    case 41 : 
                        int LA3_114 = input.LA(1);

                         
                        int index3_114 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 139;}

                        else if ( (true) ) {s = 95;}

                         
                        input.seek(index3_114);
                        if ( s>=0 ) return s;
                        break;
                    case 42 : 
                        int LA3_98 = input.LA(1);

                         
                        int index3_98 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA3_98==DAY) ) {s = 105;}

                        else if ( ((LA3_98>=ON && LA3_98<=THE)||LA3_98==IN||(LA3_98>=INT_1_TO_5 && LA3_98<=UPCOMING)||(LA3_98>=TODAY && LA3_98<=YESTERDAY)||(LA3_98>=AM && LA3_98<=PM)||(LA3_98>=UTC && LA3_98<=HAST)||(LA3_98>=INT_00 && LA3_98<=THIRTY_FIRST)) ) {s = 95;}

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

                        else if ( (LA3_98==WHITE_SPACE) && (synpred1_Date())) {s = 128;}

                        else if ( (LA3_98==COMMA) && (synpred1_Date())) {s = 129;}

                        else if ( (LA3_98==EOF) && (synpred1_Date())) {s = 130;}

                        else if ( (LA3_98==OF) && (synpred1_Date())) {s = 131;}

                         
                        input.seek(index3_98);
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
        "\1\32\40\26\32\uffff\14\26\2\uffff\1\26\1\33\2\26\1\61\2\26\1\uffff"+
        "\1\26\1\uffff\2\26\2\uffff\2\26\3\uffff\2\26\1\uffff\1\26\1\uffff"+
        "\1\61\2\26\1\uffff\1\36\2\27\1\26\46\uffff\1\26\1\uffff\14\0\14"+
        "\uffff\4\0\65\uffff\1\27";
    static final String DFA12_maxS =
        "\1\u008f\1\26\2\57\3\140\23\26\1\171\1\141\5\26\32\uffff\14\30\2"+
        "\uffff\1\30\1\u008f\2\107\2\171\1\26\1\uffff\1\26\1\uffff\2\26\2"+
        "\uffff\2\26\3\uffff\2\26\1\uffff\1\26\1\uffff\2\141\1\26\1\uffff"+
        "\1\107\1\u008f\1\135\1\26\46\uffff\1\30\1\uffff\14\0\14\uffff\4"+
        "\0\65\uffff\1\135";
    static final String DFA12_acceptS =
        "\41\uffff\32\1\14\uffff\1\2\1\3\7\uffff\1\1\1\uffff\1\1\2\uffff"+
        "\2\1\2\uffff\3\1\2\uffff\1\1\1\uffff\1\1\3\uffff\1\1\4\uffff\45"+
        "\1\1\4\1\uffff\1\1\14\uffff\14\1\4\uffff\65\1\1\uffff";
    static final String DFA12_specialS =
        "\1\1\31\uffff\1\12\1\16\56\uffff\1\2\1\6\1\31\1\27\1\32\22\uffff"+
        "\1\0\1\11\2\uffff\1\30\1\24\52\uffff\1\3\1\5\1\4\1\10\1\7\1\26\1"+
        "\25\1\23\1\22\1\20\1\17\1\14\14\uffff\1\33\1\21\1\15\1\13\66\uffff}>";
    static final String[] DFA12_transitionS = {
            "\1\1\1\111\3\uffff\1\73\1\74\1\75\1\76\1\77\1\100\1\101\1\102"+
            "\1\103\1\104\1\105\1\106\1\uffff\2\110\2\uffff\1\2\1\34\1\35"+
            "\1\36\1\37\1\40\6\110\3\uffff\14\110\17\uffff\1\107\1\3\1\4"+
            "\1\5\1\6\2\107\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1"+
            "\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1"+
            "\41\1\42\1\43\1\44\1\45\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1"+
            "\55\1\56\1\57\1\60\1\61\1\62\1\63\1\64\1\65\1\66\1\67\1\70\1"+
            "\71\1\72",
            "\1\112",
            "\1\113\27\uffff\2\107",
            "\1\114\27\uffff\2\107",
            "\1\114\27\uffff\2\107\52\uffff\1\107\1\uffff\5\107",
            "\1\114\103\uffff\1\107\1\uffff\5\107",
            "\1\114\103\uffff\1\107\1\uffff\5\107",
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
            "\1\116\27\uffff\1\115\2\uffff\1\120\1\132\1\125\1\140\1\136"+
            "\53\uffff\1\135\1\124\1\130\1\117\1\134\1\127\1\121\1\123\1"+
            "\137\14\uffff\1\133\1\131\1\122\1\126",
            "\1\142\27\uffff\1\141\2\uffff\1\144\57\uffff\1\143",
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
            "\1\u008e\3\uffff\1\u0082\1\u0083\1\u0084\1\u0085\1\u0086\1"+
            "\u0087\1\u0088\1\u0089\1\u008a\1\u008b\1\u008c\1\u008d\5\uffff"+
            "\1\150\1\34\1\35\1\36\1\37\1\40\1\110\44\uffff\1\151\1\152\1"+
            "\153\1\154\2\uffff\1\155\1\156\1\157\1\160\1\161\1\162\1\163"+
            "\1\164\1\165\1\166\1\167\1\170\1\171\1\172\1\173\1\174\1\175"+
            "\1\176\1\177\1\u0080\1\u0081\1\41\1\42\1\43\1\44\1\45\1\46\1"+
            "\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56\1\57\1\60\1\61\1\62\1"+
            "\63\1\64\1\65\1\66\1\67\1\70\1\71\1\72",
            "\1\110\1\uffff\1\110\2\uffff\1\u008f\2\uffff\1\u0090\1\u0091"+
            "\1\u0092\1\u0093\1\u0094\1\u0095\1\u0096\1\u0097\1\u0098\1\u0099"+
            "\1\u009a\1\u009b\1\u009c\2\uffff\1\110\21\uffff\11\110",
            "\1\110\1\uffff\1\110\2\uffff\1\u008f\2\uffff\1\u0090\1\u0091"+
            "\1\u0092\1\u0093\1\u0094\1\u0095\1\u0096\1\u0097\1\u0098\1\u0099"+
            "\1\u009a\1\u009b\1\u009c\2\uffff\1\110\21\uffff\11\110",
            "\1\120\1\132\1\125\1\140\1\136\53\uffff\1\135\1\124\1\130\1"+
            "\117\1\134\1\127\1\121\1\123\1\137\14\uffff\1\133\1\131\1\122"+
            "\1\126",
            "\1\110\1\uffff\1\110\2\uffff\1\u008f\2\uffff\1\u0090\1\u0091"+
            "\1\u0092\1\u0093\1\u0094\1\u0095\1\u0096\1\u0097\1\u0098\1\u0099"+
            "\1\u009a\1\u009b\1\u009c\2\uffff\1\110\3\uffff\1\120\1\132\1"+
            "\125\1\140\1\136\11\uffff\11\110\31\uffff\1\135\1\124\1\130"+
            "\1\117\1\134\1\127\1\121\1\123\1\137\14\uffff\1\133\1\131\1"+
            "\122\1\126",
            "\1\114",
            "",
            "\1\114",
            "",
            "\1\114",
            "\1\114",
            "",
            "",
            "\1\114",
            "\1\114",
            "",
            "",
            "",
            "\1\114",
            "\1\114",
            "",
            "\1\114",
            "",
            "\1\144\57\uffff\1\143",
            "\1\110\1\uffff\1\110\2\uffff\1\u008f\2\uffff\1\u0090\1\u0091"+
            "\1\u0092\1\u0093\1\u0094\1\u0095\1\u0096\1\u0097\1\u0098\1\u0099"+
            "\1\u009a\1\u009b\1\u009c\2\uffff\1\110\3\uffff\1\144\15\uffff"+
            "\11\110\31\uffff\1\143",
            "\1\114",
            "",
            "\1\u0090\1\u009d\1\u009e\1\u009f\1\u00a0\1\u00a1\1\u00a2\1"+
            "\u00a3\1\u00a4\1\u00a5\1\u00a6\1\u00a7\1\u00a8\26\uffff\7\110",
            "\1\110\30\uffff\1\u00a9\1\u00c3\1\u00c4\1\u00c5\1\u00c6\1\u00c7"+
            "\32\uffff\2\110\7\uffff\2\110\1\u00aa\1\u00ab\1\u00ac\1\u00ad"+
            "\2\uffff\1\u00ae\1\u00af\1\u00b0\1\u00b1\1\u00b2\1\u00b3\1\u00b4"+
            "\1\u00b5\1\u00b6\1\u00b7\1\u00b8\1\u00b9\1\u00ba\1\u00bb\1\u00bc"+
            "\1\u00bd\1\u00be\1\u00bf\1\u00c0\1\u00c1\1\u00c2\1\u00c8\1\u00c9"+
            "\1\u00ca\1\u00cb\1\u00cc\1\u00cd\1\u00ce\1\u00cf\1\u00d0\1\u00d1"+
            "\1\u00d2\1\u00d3\1\u00d4\1\u00d5\1\u00d6\1\u00d7\1\u00d8\1\u00d9"+
            "\1\u00da\1\u00db\1\u00dc\1\u00dd\1\u00de\1\u00df\1\u00e0\1\u00e1",
            "\1\110\4\uffff\2\u008e\22\uffff\1\110\37\uffff\2\110\7\uffff"+
            "\5\110",
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
            "",
            "\1\u00e2\1\uffff\1\110",
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
            "\1\110\4\uffff\2\u008e\22\uffff\1\110\13\uffff\1\110\1\uffff"+
            "\1\110\21\uffff\2\110\7\uffff\5\110"
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
            return "66:1: date : ( ( relaxed_date )=> relaxed_date | formal_date | relative_date | global_date_prefix date -> ^( RELATIVE_DATE ^( SEEK global_date_prefix date ) ) );";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_97 = input.LA(1);

                         
                        int index12_97 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA12_97==FIRST) && (synpred2_Date())) {s = 100;}

                        else if ( (LA12_97==ONE) ) {s = 99;}

                         
                        input.seek(index12_97);
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
                        int LA12_74 = input.LA(1);

                         
                        int index12_74 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA12_74==INT_1_TO_5) ) {s = 104;}

                        else if ( (LA12_74==FIRST) ) {s = 28;}

                        else if ( (LA12_74==SECOND) ) {s = 29;}

                        else if ( (LA12_74==THIRD) ) {s = 30;}

                        else if ( (LA12_74==FOURTH) ) {s = 31;}

                        else if ( (LA12_74==FIFTH) ) {s = 32;}

                        else if ( (LA12_74==LAST) ) {s = 72;}

                        else if ( (LA12_74==INT_6_TO_9) && (synpred2_Date())) {s = 105;}

                        else if ( (LA12_74==INT_01_TO_12) && (synpred2_Date())) {s = 106;}

                        else if ( (LA12_74==INT_13_TO_23) && (synpred2_Date())) {s = 107;}

                        else if ( (LA12_74==INT_24_TO_31) && (synpred2_Date())) {s = 108;}

                        else if ( (LA12_74==ONE) && (synpred2_Date())) {s = 109;}

                        else if ( (LA12_74==TWO) && (synpred2_Date())) {s = 110;}

                        else if ( (LA12_74==THREE) && (synpred2_Date())) {s = 111;}

                        else if ( (LA12_74==FOUR) && (synpred2_Date())) {s = 112;}

                        else if ( (LA12_74==FIVE) && (synpred2_Date())) {s = 113;}

                        else if ( (LA12_74==SIX) && (synpred2_Date())) {s = 114;}

                        else if ( (LA12_74==SEVEN) && (synpred2_Date())) {s = 115;}

                        else if ( (LA12_74==EIGHT) && (synpred2_Date())) {s = 116;}

                        else if ( (LA12_74==NINE) && (synpred2_Date())) {s = 117;}

                        else if ( (LA12_74==TEN) && (synpred2_Date())) {s = 118;}

                        else if ( (LA12_74==ELEVEN) && (synpred2_Date())) {s = 119;}

                        else if ( (LA12_74==TWELVE) && (synpred2_Date())) {s = 120;}

                        else if ( (LA12_74==THIRTEEN) && (synpred2_Date())) {s = 121;}

                        else if ( (LA12_74==FOURTEEN) && (synpred2_Date())) {s = 122;}

                        else if ( (LA12_74==FIFTEEN) && (synpred2_Date())) {s = 123;}

                        else if ( (LA12_74==SIXTEEN) && (synpred2_Date())) {s = 124;}

                        else if ( (LA12_74==SEVENTEEN) && (synpred2_Date())) {s = 125;}

                        else if ( (LA12_74==EIGHTEEN) && (synpred2_Date())) {s = 126;}

                        else if ( (LA12_74==NINETEEN) && (synpred2_Date())) {s = 127;}

                        else if ( (LA12_74==TWENTY) && (synpred2_Date())) {s = 128;}

                        else if ( (LA12_74==THIRTY) && (synpred2_Date())) {s = 129;}

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

                        else if ( (LA12_74==JANUARY) && (synpred2_Date())) {s = 130;}

                        else if ( (LA12_74==FEBRUARY) && (synpred2_Date())) {s = 131;}

                        else if ( (LA12_74==MARCH) && (synpred2_Date())) {s = 132;}

                        else if ( (LA12_74==APRIL) && (synpred2_Date())) {s = 133;}

                        else if ( (LA12_74==MAY) && (synpred2_Date())) {s = 134;}

                        else if ( (LA12_74==JUNE) && (synpred2_Date())) {s = 135;}

                        else if ( (LA12_74==JULY) && (synpred2_Date())) {s = 136;}

                        else if ( (LA12_74==AUGUST) && (synpred2_Date())) {s = 137;}

                        else if ( (LA12_74==SEPTEMBER) && (synpred2_Date())) {s = 138;}

                        else if ( (LA12_74==OCTOBER) && (synpred2_Date())) {s = 139;}

                        else if ( (LA12_74==NOVEMBER) && (synpred2_Date())) {s = 140;}

                        else if ( (LA12_74==DECEMBER) && (synpred2_Date())) {s = 141;}

                        else if ( (LA12_74==DAY) ) {s = 142;}

                         
                        input.seek(index12_74);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA12_145 = input.LA(1);

                         
                        int index12_145 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_Date()) ) {s = 225;}

                        else if ( (true) ) {s = 72;}

                         
                        input.seek(index12_145);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA12_147 = input.LA(1);

                         
                        int index12_147 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_Date()) ) {s = 225;}

                        else if ( (true) ) {s = 72;}

                         
                        input.seek(index12_147);
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
                        int LA12_75 = input.LA(1);

                         
                        int index12_75 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA12_75==DAY) ) {s = 143;}

                        else if ( (LA12_75==OF) && (synpred2_Date())) {s = 144;}

                        else if ( (LA12_75==JANUARY) ) {s = 145;}

                        else if ( (LA12_75==FEBRUARY) ) {s = 146;}

                        else if ( (LA12_75==MARCH) ) {s = 147;}

                        else if ( (LA12_75==APRIL) ) {s = 148;}

                        else if ( (LA12_75==MAY) ) {s = 149;}

                        else if ( (LA12_75==JUNE) ) {s = 150;}

                        else if ( (LA12_75==JULY) ) {s = 151;}

                        else if ( (LA12_75==AUGUST) ) {s = 152;}

                        else if ( (LA12_75==SEPTEMBER) ) {s = 153;}

                        else if ( (LA12_75==OCTOBER) ) {s = 154;}

                        else if ( (LA12_75==NOVEMBER) ) {s = 155;}

                        else if ( (LA12_75==DECEMBER) ) {s = 156;}

                        else if ( (LA12_75==EOF||LA12_75==WHITE_SPACE||LA12_75==COMMA||LA12_75==YEAR||(LA12_75>=WEEK && LA12_75<=SATURDAY)) ) {s = 72;}

                         
                        input.seek(index12_75);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA12_149 = input.LA(1);

                         
                        int index12_149 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_Date()) ) {s = 225;}

                        else if ( (true) ) {s = 72;}

                         
                        input.seek(index12_149);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA12_148 = input.LA(1);

                         
                        int index12_148 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_Date()) ) {s = 225;}

                        else if ( (true) ) {s = 72;}

                         
                        input.seek(index12_148);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA12_98 = input.LA(1);

                         
                        int index12_98 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA12_98==DAY) ) {s = 143;}

                        else if ( (LA12_98==ONE) ) {s = 99;}

                        else if ( (LA12_98==FIRST) && (synpred2_Date())) {s = 100;}

                        else if ( (LA12_98==OF) && (synpred2_Date())) {s = 144;}

                        else if ( (LA12_98==JANUARY) ) {s = 145;}

                        else if ( (LA12_98==FEBRUARY) ) {s = 146;}

                        else if ( (LA12_98==MARCH) ) {s = 147;}

                        else if ( (LA12_98==APRIL) ) {s = 148;}

                        else if ( (LA12_98==MAY) ) {s = 149;}

                        else if ( (LA12_98==JUNE) ) {s = 150;}

                        else if ( (LA12_98==JULY) ) {s = 151;}

                        else if ( (LA12_98==AUGUST) ) {s = 152;}

                        else if ( (LA12_98==SEPTEMBER) ) {s = 153;}

                        else if ( (LA12_98==OCTOBER) ) {s = 154;}

                        else if ( (LA12_98==NOVEMBER) ) {s = 155;}

                        else if ( (LA12_98==DECEMBER) ) {s = 156;}

                        else if ( (LA12_98==EOF||LA12_98==WHITE_SPACE||LA12_98==COMMA||LA12_98==YEAR||(LA12_98>=WEEK && LA12_98<=SATURDAY)) ) {s = 72;}

                         
                        input.seek(index12_98);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA12_26 = input.LA(1);

                         
                        int index12_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA12_26==DASH) ) {s = 77;}

                        else if ( (LA12_26==WHITE_SPACE) ) {s = 78;}

                        else if ( (LA12_26==FOUR) ) {s = 79;}

                        else if ( (LA12_26==FIRST) && (synpred2_Date())) {s = 80;}

                        else if ( (LA12_26==SEVEN) ) {s = 81;}

                        else if ( (LA12_26==EIGHTH) && (synpred2_Date())) {s = 82;}

                        else if ( (LA12_26==EIGHT) ) {s = 83;}

                        else if ( (LA12_26==TWO) ) {s = 84;}

                        else if ( (LA12_26==THIRD) && (synpred2_Date())) {s = 85;}

                        else if ( (LA12_26==NINTH) && (synpred2_Date())) {s = 86;}

                        else if ( (LA12_26==SIX) ) {s = 87;}

                        else if ( (LA12_26==THREE) ) {s = 88;}

                        else if ( (LA12_26==SEVENTH) && (synpred2_Date())) {s = 89;}

                        else if ( (LA12_26==SECOND) && (synpred2_Date())) {s = 90;}

                        else if ( (LA12_26==SIXTH) && (synpred2_Date())) {s = 91;}

                        else if ( (LA12_26==FIVE) ) {s = 92;}

                        else if ( (LA12_26==ONE) ) {s = 93;}

                        else if ( (LA12_26==FIFTH) && (synpred2_Date())) {s = 94;}

                        else if ( (LA12_26==NINE) ) {s = 95;}

                        else if ( (LA12_26==FOURTH) && (synpred2_Date())) {s = 96;}

                         
                        input.seek(index12_26);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA12_172 = input.LA(1);

                         
                        int index12_172 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_Date()) ) {s = 225;}

                        else if ( (true) ) {s = 72;}

                         
                        input.seek(index12_172);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA12_156 = input.LA(1);

                         
                        int index12_156 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_Date()) ) {s = 225;}

                        else if ( (true) ) {s = 72;}

                         
                        input.seek(index12_156);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA12_171 = input.LA(1);

                         
                        int index12_171 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_Date()) ) {s = 225;}

                        else if ( (true) ) {s = 72;}

                         
                        input.seek(index12_171);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
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
                    case 15 : 
                        int LA12_155 = input.LA(1);

                         
                        int index12_155 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_Date()) ) {s = 225;}

                        else if ( (true) ) {s = 72;}

                         
                        input.seek(index12_155);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA12_154 = input.LA(1);

                         
                        int index12_154 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_Date()) ) {s = 225;}

                        else if ( (true) ) {s = 72;}

                         
                        input.seek(index12_154);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA12_170 = input.LA(1);

                         
                        int index12_170 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_Date()) ) {s = 225;}

                        else if ( (true) ) {s = 72;}

                         
                        input.seek(index12_170);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA12_153 = input.LA(1);

                         
                        int index12_153 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_Date()) ) {s = 225;}

                        else if ( (true) ) {s = 72;}

                         
                        input.seek(index12_153);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA12_152 = input.LA(1);

                         
                        int index12_152 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_Date()) ) {s = 225;}

                        else if ( (true) ) {s = 72;}

                         
                        input.seek(index12_152);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA12_102 = input.LA(1);

                         
                        int index12_102 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA12_102==INT_1_TO_5) ) {s = 169;}

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

                        else if ( (LA12_102==AT||(LA12_102>=NOON && LA12_102<=MIDNIGHT)||(LA12_102>=INT_0 && LA12_102<=INT_00)) ) {s = 72;}

                         
                        input.seek(index12_102);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA12_151 = input.LA(1);

                         
                        int index12_151 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_Date()) ) {s = 225;}

                        else if ( (true) ) {s = 72;}

                         
                        input.seek(index12_151);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA12_150 = input.LA(1);

                         
                        int index12_150 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_Date()) ) {s = 225;}

                        else if ( (true) ) {s = 72;}

                         
                        input.seek(index12_150);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA12_77 = input.LA(1);

                         
                        int index12_77 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA12_77==FOUR) ) {s = 79;}

                        else if ( (LA12_77==TWO) ) {s = 84;}

                        else if ( (LA12_77==FIRST) && (synpred2_Date())) {s = 80;}

                        else if ( (LA12_77==SEVEN) ) {s = 81;}

                        else if ( (LA12_77==EIGHTH) && (synpred2_Date())) {s = 82;}

                        else if ( (LA12_77==EIGHT) ) {s = 83;}

                        else if ( (LA12_77==THIRD) && (synpred2_Date())) {s = 85;}

                        else if ( (LA12_77==SIX) ) {s = 87;}

                        else if ( (LA12_77==NINTH) && (synpred2_Date())) {s = 86;}

                        else if ( (LA12_77==THREE) ) {s = 88;}

                        else if ( (LA12_77==SEVENTH) && (synpred2_Date())) {s = 89;}

                        else if ( (LA12_77==SECOND) && (synpred2_Date())) {s = 90;}

                        else if ( (LA12_77==FIVE) ) {s = 92;}

                        else if ( (LA12_77==ONE) ) {s = 93;}

                        else if ( (LA12_77==SIXTH) && (synpred2_Date())) {s = 91;}

                        else if ( (LA12_77==FIFTH) && (synpred2_Date())) {s = 94;}

                        else if ( (LA12_77==NINE) ) {s = 95;}

                        else if ( (LA12_77==FOURTH) && (synpred2_Date())) {s = 96;}

                         
                        input.seek(index12_77);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA12_101 = input.LA(1);

                         
                        int index12_101 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA12_101==OF) && (synpred2_Date())) {s = 144;}

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

                        else if ( ((LA12_101>=SUNDAY && LA12_101<=SATURDAY)) ) {s = 72;}

                         
                        input.seek(index12_101);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA12_76 = input.LA(1);

                         
                        int index12_76 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA12_76==DAY) ) {s = 143;}

                        else if ( (LA12_76==OF) && (synpred2_Date())) {s = 144;}

                        else if ( (LA12_76==JANUARY) ) {s = 145;}

                        else if ( (LA12_76==FEBRUARY) ) {s = 146;}

                        else if ( (LA12_76==MARCH) ) {s = 147;}

                        else if ( (LA12_76==APRIL) ) {s = 148;}

                        else if ( (LA12_76==MAY) ) {s = 149;}

                        else if ( (LA12_76==JUNE) ) {s = 150;}

                        else if ( (LA12_76==JULY) ) {s = 151;}

                        else if ( (LA12_76==AUGUST) ) {s = 152;}

                        else if ( (LA12_76==SEPTEMBER) ) {s = 153;}

                        else if ( (LA12_76==OCTOBER) ) {s = 154;}

                        else if ( (LA12_76==NOVEMBER) ) {s = 155;}

                        else if ( (LA12_76==DECEMBER) ) {s = 156;}

                        else if ( (LA12_76==EOF||LA12_76==WHITE_SPACE||LA12_76==COMMA||LA12_76==YEAR||(LA12_76>=WEEK && LA12_76<=SATURDAY)) ) {s = 72;}

                         
                        input.seek(index12_76);
                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA12_78 = input.LA(1);

                         
                        int index12_78 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA12_78==DAY) ) {s = 143;}

                        else if ( (LA12_78==TWO) ) {s = 84;}

                        else if ( (LA12_78==THIRD) && (synpred2_Date())) {s = 85;}

                        else if ( (LA12_78==SEVEN) ) {s = 81;}

                        else if ( (LA12_78==FOUR) ) {s = 79;}

                        else if ( (LA12_78==FIRST) && (synpred2_Date())) {s = 80;}

                        else if ( (LA12_78==THREE) ) {s = 88;}

                        else if ( (LA12_78==EIGHTH) && (synpred2_Date())) {s = 82;}

                        else if ( (LA12_78==NINTH) && (synpred2_Date())) {s = 86;}

                        else if ( (LA12_78==SEVENTH) && (synpred2_Date())) {s = 89;}

                        else if ( (LA12_78==SECOND) && (synpred2_Date())) {s = 90;}

                        else if ( (LA12_78==SIX) ) {s = 87;}

                        else if ( (LA12_78==ONE) ) {s = 93;}

                        else if ( (LA12_78==SIXTH) && (synpred2_Date())) {s = 91;}

                        else if ( (LA12_78==FIVE) ) {s = 92;}

                        else if ( (LA12_78==FIFTH) && (synpred2_Date())) {s = 94;}

                        else if ( (LA12_78==OF) && (synpred2_Date())) {s = 144;}

                        else if ( (LA12_78==JANUARY) ) {s = 145;}

                        else if ( (LA12_78==FEBRUARY) ) {s = 146;}

                        else if ( (LA12_78==MARCH) ) {s = 147;}

                        else if ( (LA12_78==APRIL) ) {s = 148;}

                        else if ( (LA12_78==MAY) ) {s = 149;}

                        else if ( (LA12_78==JUNE) ) {s = 150;}

                        else if ( (LA12_78==JULY) ) {s = 151;}

                        else if ( (LA12_78==AUGUST) ) {s = 152;}

                        else if ( (LA12_78==SEPTEMBER) ) {s = 153;}

                        else if ( (LA12_78==OCTOBER) ) {s = 154;}

                        else if ( (LA12_78==NOVEMBER) ) {s = 155;}

                        else if ( (LA12_78==DECEMBER) ) {s = 156;}

                        else if ( (LA12_78==EOF||LA12_78==WHITE_SPACE||LA12_78==COMMA||LA12_78==YEAR||(LA12_78>=WEEK && LA12_78<=SATURDAY)) ) {s = 72;}

                        else if ( (LA12_78==EIGHT) ) {s = 83;}

                        else if ( (LA12_78==NINE) ) {s = 95;}

                        else if ( (LA12_78==FOURTH) && (synpred2_Date())) {s = 96;}

                         
                        input.seek(index12_78);
                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA12_169 = input.LA(1);

                         
                        int index12_169 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_Date()) ) {s = 225;}

                        else if ( (true) ) {s = 72;}

                         
                        input.seek(index12_169);
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
        "\1\32\106\26\1\37\1\36\1\61\1\36\22\26\1\61\1\36\2\26\1\60\1\uffff"+
        "\106\26\1\37\1\26\1\27\1\uffff\1\27\1\26\1\61\1\27\22\26\1\27\1"+
        "\61\2\26\1\27\3\0\5\uffff\3\0\5\uffff\1\27";
    static final String DFA21_maxS =
        "\1\u008f\31\26\1\171\1\141\53\26\1\u008f\1\52\2\171\22\26\2\141"+
        "\2\26\1\u008f\1\uffff\1\26\44\30\1\171\1\141\37\30\1\52\2\140\1"+
        "\uffff\2\140\2\171\22\30\2\141\2\30\1\140\3\0\5\uffff\3\0\5\uffff"+
        "\1\140";
    static final String DFA21_acceptS =
        "\142\uffff\1\4\111\uffff\1\3\36\uffff\5\1\3\uffff\5\2\1\uffff";
    static final String DFA21_specialS =
        "\u00aa\uffff\1\3\1\15\1\uffff\1\1\1\11\1\uffff\1\12\22\uffff\1\2"+
        "\3\uffff\1\4\1\0\1\14\1\13\5\uffff\1\7\1\5\1\6\5\uffff\1\10}>";
    static final String[] DFA21_transitionS = {
            "\1\1\4\uffff\1\73\1\74\1\75\1\76\1\77\1\100\1\101\1\102\1\103"+
            "\1\104\1\105\1\106\5\uffff\1\2\1\34\1\35\1\36\1\37\1\40\45\uffff"+
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
            "\1\112\27\uffff\1\111\2\uffff\1\117\1\125\1\124\1\134\1\121"+
            "\53\uffff\1\132\1\113\1\126\1\114\1\131\1\133\1\120\1\115\1"+
            "\122\14\uffff\1\127\1\116\1\130\1\123",
            "\1\136\27\uffff\1\135\2\uffff\1\140\57\uffff\1\137",
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
            "\14\142\5\uffff\1\2\1\34\1\35\1\36\1\37\1\40\45\uffff\1\3\1"+
            "\4\1\5\1\6\2\uffff\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1"+
            "\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1"+
            "\33\1\41\1\42\1\43\1\44\1\45\1\46\1\47\1\50\1\51\1\52\1\53\1"+
            "\54\1\55\1\56\1\57\1\60\1\61\1\62\1\63\1\64\1\65\1\66\1\67\1"+
            "\70\1\71\1\72",
            "\1\143\1\144\1\145\1\146\1\147\1\150\1\151\1\152\1\153\1\154"+
            "\1\155\1\156\1\157",
            "\1\117\1\125\1\124\1\134\1\121\53\uffff\1\132\1\113\1\126\1"+
            "\114\1\131\1\133\1\120\1\115\1\122\14\uffff\1\127\1\116\1\130"+
            "\1\123",
            "\1\143\1\144\1\145\1\146\1\147\1\150\1\151\1\152\1\153\1\154"+
            "\1\155\1\156\1\157\6\uffff\1\117\1\125\1\124\1\134\1\121\53"+
            "\uffff\1\132\1\113\1\126\1\114\1\131\1\133\1\120\1\115\1\122"+
            "\14\uffff\1\127\1\116\1\130\1\123",
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
            "\1\140\57\uffff\1\137",
            "\1\143\1\144\1\145\1\146\1\147\1\150\1\151\1\152\1\153\1\154"+
            "\1\155\1\156\1\157\6\uffff\1\140\57\uffff\1\137",
            "\1\110",
            "\1\110",
            "\1\160\1\u008a\1\u008b\1\u008c\1\u008d\1\u008e\45\uffff\1\161"+
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
            "\1\u00ad\1\uffff\1\u00ae",
            "\1\u00ad\1\uffff\1\u00ae",
            "\1\u00ad\1\uffff\1\u00ae",
            "\1\u00ad\1\uffff\1\u00ae",
            "\1\u00ad\1\uffff\1\u00ae",
            "\1\u00ad\1\uffff\1\u00ae",
            "\1\u00ad\1\uffff\1\u00ae",
            "\1\u00ad\1\uffff\1\u00ae",
            "\1\u00ad\1\uffff\1\u00ae",
            "\1\u00ad\1\uffff\1\u00ae",
            "\1\u00ad\1\uffff\1\u00ae",
            "\1\u00ad\1\uffff\1\u00ae",
            "\1\u00ad\1\uffff\1\u00ae",
            "\1\u00ad\1\uffff\1\u00ae",
            "\1\u00ad\1\uffff\1\u00ae",
            "\1\u00ad\1\uffff\1\u00ae",
            "\1\u00ad\1\uffff\1\u00ae",
            "\1\u00ad\1\uffff\1\u00ae",
            "\1\u00ad\1\uffff\1\u00ae",
            "\1\u00ad\1\uffff\1\u00ae",
            "\1\u00ad\1\uffff\1\u00ae",
            "\1\u00ad\1\uffff\1\u00ae",
            "\1\u00ad\1\uffff\1\u00ae",
            "\1\u00ad\1\uffff\1\u00ae",
            "\1\u00b0\1\uffff\1\u00ae\25\uffff\1\u00af\2\uffff\1\u00b6\1"+
            "\u00bb\1\u00c2\1\u00b9\1\u00b7\53\uffff\1\u00b5\1\u00b4\1\u00ba"+
            "\1\u00c1\1\u00b8\1\u00bc\1\u00b3\1\u00bd\1\u00c0\14\uffff\1"+
            "\u00bf\1\u00be\1\u00b2\1\u00b1",
            "\1\u00c3\1\uffff\1\u00ae\25\uffff\1\u00c4\2\uffff\1\u00c6\57"+
            "\uffff\1\u00c5",
            "\1\u00ad\1\uffff\1\u00ae",
            "\1\u00ad\1\uffff\1\u00ae",
            "\1\u00ad\1\uffff\1\u00ae",
            "\1\u00ad\1\uffff\1\u00ae",
            "\1\u00ad\1\uffff\1\u00ae",
            "\1\u00ad\1\uffff\1\u00ae",
            "\1\u00ad\1\uffff\1\u00ae",
            "\1\u00ad\1\uffff\1\u00ae",
            "\1\u00ad\1\uffff\1\u00ae",
            "\1\u00ad\1\uffff\1\u00ae",
            "\1\u00ad\1\uffff\1\u00ae",
            "\1\u00ad\1\uffff\1\u00ae",
            "\1\u00ad\1\uffff\1\u00ae",
            "\1\u00ad\1\uffff\1\u00ae",
            "\1\u00ad\1\uffff\1\u00ae",
            "\1\u00ad\1\uffff\1\u00ae",
            "\1\u00ad\1\uffff\1\u00ae",
            "\1\u00ad\1\uffff\1\u00ae",
            "\1\u00ad\1\uffff\1\u00ae",
            "\1\u00ad\1\uffff\1\u00ae",
            "\1\u00ad\1\uffff\1\u00ae",
            "\1\u00ad\1\uffff\1\u00ae",
            "\1\u00ad\1\uffff\1\u00ae",
            "\1\u00ad\1\uffff\1\u00ae",
            "\1\u00ad\1\uffff\1\u00ae",
            "\1\u00ad\1\uffff\1\u00ae",
            "\1\u00ad\1\uffff\1\u00ae",
            "\1\u00ad\1\uffff\1\u00ae",
            "\1\u00ad\1\uffff\1\u00ae",
            "\1\u00ad\1\uffff\1\u00ae",
            "\1\u00ad\1\uffff\1\u00ae",
            "\1\144\1\145\1\146\1\147\1\150\1\151\1\152\1\153\1\154\1\155"+
            "\1\156\1\157",
            "\1\u00c7\1\u00ac\23\uffff\1\u00cc\1\u00cb\3\uffff\1\u00ac\37"+
            "\uffff\2\u00ac\7\uffff\1\u00ac\1\u00c8\1\u00ac\1\u00c9\1\u00ca"+
            "\1\u00cd\1\u00ce\1\u00cf",
            "\1\u00ac\23\uffff\1\u00cc\1\u00cb\3\uffff\1\u00ac\37\uffff"+
            "\2\u00ac\7\uffff\1\u00ac\1\u00c8\1\u00ac\1\u00c9\1\u00ca\1\u00cd"+
            "\1\u00ce\1\u00cf",
            "",
            "\1\142\23\uffff\1\u00d4\1\u00d3\3\uffff\1\142\37\uffff\2\142"+
            "\7\uffff\1\142\1\u00d0\1\142\1\u00d1\1\u00d2\1\u00d5\1\u00d6"+
            "\1\u00d7",
            "\1\u00d8\1\142\23\uffff\1\u00d4\1\u00d3\3\uffff\1\142\37\uffff"+
            "\2\142\7\uffff\1\142\1\u00d0\1\142\1\u00d1\1\u00d2\1\u00d5\1"+
            "\u00d6\1\u00d7",
            "\1\u00b6\1\u00bb\1\u00c2\1\u00b9\1\u00b7\53\uffff\1\u00b5\1"+
            "\u00b4\1\u00ba\1\u00c1\1\u00b8\1\u00bc\1\u00b3\1\u00bd\1\u00c0"+
            "\14\uffff\1\u00bf\1\u00be\1\u00b2\1\u00b1",
            "\1\142\23\uffff\1\u00d4\1\u00d3\3\uffff\1\142\1\u00b6\1\u00bb"+
            "\1\u00c2\1\u00b9\1\u00b7\32\uffff\2\142\7\uffff\1\142\1\u00d0"+
            "\1\142\1\u00d1\1\u00d2\1\u00d5\1\u00d6\1\u00d7\1\u00b5\1\u00b4"+
            "\1\u00ba\1\u00c1\1\u00b8\1\u00bc\1\u00b3\1\u00bd\1\u00c0\14"+
            "\uffff\1\u00bf\1\u00be\1\u00b2\1\u00b1",
            "\1\u00ad\1\uffff\1\u00ae",
            "\1\u00ad\1\uffff\1\u00ae",
            "\1\u00ad\1\uffff\1\u00ae",
            "\1\u00ad\1\uffff\1\u00ae",
            "\1\u00ad\1\uffff\1\u00ae",
            "\1\u00ad\1\uffff\1\u00ae",
            "\1\u00ad\1\uffff\1\u00ae",
            "\1\u00ad\1\uffff\1\u00ae",
            "\1\u00ad\1\uffff\1\u00ae",
            "\1\u00ad\1\uffff\1\u00ae",
            "\1\u00ad\1\uffff\1\u00ae",
            "\1\u00ad\1\uffff\1\u00ae",
            "\1\u00ad\1\uffff\1\u00ae",
            "\1\u00ad\1\uffff\1\u00ae",
            "\1\u00ad\1\uffff\1\u00ae",
            "\1\u00ad\1\uffff\1\u00ae",
            "\1\u00ad\1\uffff\1\u00ae",
            "\1\u00ad\1\uffff\1\u00ae",
            "\1\142\23\uffff\1\u00d4\1\u00d3\3\uffff\1\142\1\u00c6\36\uffff"+
            "\2\142\7\uffff\1\142\1\u00d0\1\142\1\u00d1\1\u00d2\1\u00d5\1"+
            "\u00d6\1\u00d7\1\u00c5",
            "\1\u00c6\57\uffff\1\u00c5",
            "\1\u00ad\1\uffff\1\u00ae",
            "\1\u00ad\1\uffff\1\u00ae",
            "\1\u00ac\23\uffff\1\u00cc\1\u00cb\3\uffff\1\u00ac\37\uffff"+
            "\2\u00ac\7\uffff\1\u00ac\1\u00c8\1\u00ac\1\u00c9\1\u00ca\1\u00cd"+
            "\1\u00ce\1\u00cf",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "\1\142\23\uffff\1\u00d4\1\u00d3\3\uffff\1\142\37\uffff\2\142"+
            "\7\uffff\1\142\1\u00d0\1\142\1\u00d1\1\u00d2\1\u00d5\1\u00d6"+
            "\1\u00d7"
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
            return "91:5: ( ( ( THE WHITE_SPACE )? relaxed_day_of_month WHITE_SPACE ( OF WHITE_SPACE )? relaxed_month relaxed_year_prefix relaxed_year )=> ( THE WHITE_SPACE )? relaxed_day_of_month WHITE_SPACE ( OF WHITE_SPACE )? relaxed_month relaxed_year_prefix relaxed_year | ( relaxed_month WHITE_SPACE relaxed_day_of_month relaxed_year_prefix relaxed_year )=> relaxed_month WHITE_SPACE relaxed_day_of_month relaxed_year_prefix relaxed_year | ( THE WHITE_SPACE )? relaxed_day_of_month WHITE_SPACE ( OF WHITE_SPACE )? relaxed_month | ( THE WHITE_SPACE )? relaxed_month WHITE_SPACE relaxed_day_of_month )";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA21_200 = input.LA(1);

                         
                        int index21_200 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Date()) ) {s = 207;}

                        else if ( (true) ) {s = 172;}

                         
                        input.seek(index21_200);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA21_173 = input.LA(1);

                         
                        int index21_173 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA21_173==AT||LA21_173==INT_1_TO_5||(LA21_173>=NOON && LA21_173<=MIDNIGHT)||LA21_173==INT_0||LA21_173==INT_6_TO_9) ) {s = 98;}

                        else if ( (LA21_173==INT_00) ) {s = 208;}

                        else if ( (LA21_173==INT_01_TO_12) ) {s = 209;}

                        else if ( (LA21_173==INT_13_TO_23) ) {s = 210;}

                        else if ( (LA21_173==IN) && (synpred4_Date())) {s = 211;}

                        else if ( (LA21_173==SINGLE_QUOTE) && (synpred4_Date())) {s = 212;}

                        else if ( (LA21_173==INT_24_TO_31) && (synpred4_Date())) {s = 213;}

                        else if ( (LA21_173==INT_32_TO_59) && (synpred4_Date())) {s = 214;}

                        else if ( (LA21_173==INT_60_TO_99) && (synpred4_Date())) {s = 215;}

                         
                        input.seek(index21_173);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA21_195 = input.LA(1);

                         
                        int index21_195 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA21_195==FIRST) ) {s = 198;}

                        else if ( (LA21_195==AT||LA21_195==INT_1_TO_5||(LA21_195>=NOON && LA21_195<=MIDNIGHT)||LA21_195==INT_0||LA21_195==INT_6_TO_9) ) {s = 98;}

                        else if ( (LA21_195==INT_00) ) {s = 208;}

                        else if ( (LA21_195==INT_01_TO_12) ) {s = 209;}

                        else if ( (LA21_195==INT_13_TO_23) ) {s = 210;}

                        else if ( (LA21_195==IN) && (synpred4_Date())) {s = 211;}

                        else if ( (LA21_195==SINGLE_QUOTE) && (synpred4_Date())) {s = 212;}

                        else if ( (LA21_195==INT_24_TO_31) && (synpred4_Date())) {s = 213;}

                        else if ( (LA21_195==INT_32_TO_59) && (synpred4_Date())) {s = 214;}

                        else if ( (LA21_195==INT_60_TO_99) && (synpred4_Date())) {s = 215;}

                        else if ( (LA21_195==ONE) ) {s = 197;}

                         
                        input.seek(index21_195);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA21_170 = input.LA(1);

                         
                        int index21_170 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA21_170==WHITE_SPACE) ) {s = 199;}

                        else if ( (LA21_170==AT||LA21_170==INT_1_TO_5||(LA21_170>=NOON && LA21_170<=MIDNIGHT)||LA21_170==INT_0||LA21_170==INT_6_TO_9) ) {s = 172;}

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
                    case 4 : 
                        int LA21_199 = input.LA(1);

                         
                        int index21_199 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA21_199==AT||LA21_199==INT_1_TO_5||(LA21_199>=NOON && LA21_199<=MIDNIGHT)||LA21_199==INT_0||LA21_199==INT_6_TO_9) ) {s = 172;}

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
                        int LA21_209 = input.LA(1);

                         
                        int index21_209 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_Date()) ) {s = 215;}

                        else if ( (true) ) {s = 98;}

                         
                        input.seek(index21_209);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA21_210 = input.LA(1);

                         
                        int index21_210 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_Date()) ) {s = 215;}

                        else if ( (true) ) {s = 98;}

                         
                        input.seek(index21_210);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA21_208 = input.LA(1);

                         
                        int index21_208 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_Date()) ) {s = 215;}

                        else if ( (true) ) {s = 98;}

                         
                        input.seek(index21_208);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA21_216 = input.LA(1);

                         
                        int index21_216 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA21_216==AT||LA21_216==INT_1_TO_5||(LA21_216>=NOON && LA21_216<=MIDNIGHT)||LA21_216==INT_0||LA21_216==INT_6_TO_9) ) {s = 98;}

                        else if ( (LA21_216==INT_00) ) {s = 208;}

                        else if ( (LA21_216==INT_01_TO_12) ) {s = 209;}

                        else if ( (LA21_216==INT_13_TO_23) ) {s = 210;}

                        else if ( (LA21_216==IN) && (synpred4_Date())) {s = 211;}

                        else if ( (LA21_216==SINGLE_QUOTE) && (synpred4_Date())) {s = 212;}

                        else if ( (LA21_216==INT_24_TO_31) && (synpred4_Date())) {s = 213;}

                        else if ( (LA21_216==INT_32_TO_59) && (synpred4_Date())) {s = 214;}

                        else if ( (LA21_216==INT_60_TO_99) && (synpred4_Date())) {s = 215;}

                         
                        input.seek(index21_216);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA21_174 = input.LA(1);

                         
                        int index21_174 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA21_174==WHITE_SPACE) ) {s = 216;}

                        else if ( (LA21_174==AT||LA21_174==INT_1_TO_5||(LA21_174>=NOON && LA21_174<=MIDNIGHT)||LA21_174==INT_0||LA21_174==INT_6_TO_9) ) {s = 98;}

                        else if ( (LA21_174==INT_00) ) {s = 208;}

                        else if ( (LA21_174==INT_01_TO_12) ) {s = 209;}

                        else if ( (LA21_174==INT_13_TO_23) ) {s = 210;}

                        else if ( (LA21_174==IN) && (synpred4_Date())) {s = 211;}

                        else if ( (LA21_174==SINGLE_QUOTE) && (synpred4_Date())) {s = 212;}

                        else if ( (LA21_174==INT_24_TO_31) && (synpred4_Date())) {s = 213;}

                        else if ( (LA21_174==INT_32_TO_59) && (synpred4_Date())) {s = 214;}

                        else if ( (LA21_174==INT_60_TO_99) && (synpred4_Date())) {s = 215;}

                         
                        input.seek(index21_174);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA21_176 = input.LA(1);

                         
                        int index21_176 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA21_176==THIRD) ) {s = 194;}

                        else if ( (LA21_176==EIGHTH) ) {s = 178;}

                        else if ( (LA21_176==SEVEN) ) {s = 179;}

                        else if ( (LA21_176==FIVE) ) {s = 184;}

                        else if ( (LA21_176==NINTH) ) {s = 177;}

                        else if ( (LA21_176==FIFTH) ) {s = 183;}

                        else if ( (LA21_176==SIX) ) {s = 188;}

                        else if ( (LA21_176==ONE) ) {s = 181;}

                        else if ( (LA21_176==FIRST) ) {s = 182;}

                        else if ( (LA21_176==THREE) ) {s = 186;}

                        else if ( (LA21_176==FOURTH) ) {s = 185;}

                        else if ( (LA21_176==EIGHT) ) {s = 189;}

                        else if ( (LA21_176==SEVENTH) ) {s = 190;}

                        else if ( (LA21_176==TWO) ) {s = 180;}

                        else if ( (LA21_176==SECOND) ) {s = 187;}

                        else if ( (LA21_176==FOUR) ) {s = 193;}

                        else if ( (LA21_176==SIXTH) ) {s = 191;}

                        else if ( (LA21_176==NINE) ) {s = 192;}

                        else if ( (LA21_176==IN) && (synpred4_Date())) {s = 211;}

                        else if ( (LA21_176==SINGLE_QUOTE) && (synpred4_Date())) {s = 212;}

                        else if ( (LA21_176==INT_00) ) {s = 208;}

                        else if ( (LA21_176==INT_01_TO_12) ) {s = 209;}

                        else if ( (LA21_176==INT_13_TO_23) ) {s = 210;}

                        else if ( (LA21_176==INT_24_TO_31) && (synpred4_Date())) {s = 213;}

                        else if ( (LA21_176==INT_32_TO_59) && (synpred4_Date())) {s = 214;}

                        else if ( (LA21_176==INT_60_TO_99) && (synpred4_Date())) {s = 215;}

                        else if ( (LA21_176==AT||LA21_176==INT_1_TO_5||(LA21_176>=NOON && LA21_176<=MIDNIGHT)||LA21_176==INT_0||LA21_176==INT_6_TO_9) ) {s = 98;}

                         
                        input.seek(index21_176);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA21_202 = input.LA(1);

                         
                        int index21_202 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Date()) ) {s = 207;}

                        else if ( (true) ) {s = 172;}

                         
                        input.seek(index21_202);
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
                        int LA21_171 = input.LA(1);

                         
                        int index21_171 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA21_171==AT||LA21_171==INT_1_TO_5||(LA21_171>=NOON && LA21_171<=MIDNIGHT)||LA21_171==INT_0||LA21_171==INT_6_TO_9) ) {s = 172;}

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
        "\1\32\2\26\1\uffff\32\26\3\uffff\1\33\3\26\1\141\13\26\1\141\1\26"+
        "\1\uffff\45\26\3\27\1\uffff";
    static final String DFA34_maxS =
        "\1\165\2\26\1\uffff\30\26\1\151\1\141\3\uffff\4\107\2\151\11\26"+
        "\2\141\1\26\1\uffff\45\30\3\135\1\uffff";
    static final String DFA34_acceptS =
        "\3\uffff\1\1\32\uffff\1\3\1\5\1\6\22\uffff\1\2\50\uffff\1\4";
    static final String DFA34_specialS =
        "\135\uffff}>";
    static final String[] DFA34_transitionS = {
            "\1\37\1\36\3\uffff\14\36\1\uffff\1\3\1\36\2\uffff\1\4\5\37\1"+
            "\2\1\1\4\3\3\uffff\11\36\3\40\20\uffff\1\5\1\6\1\7\1\10\2\uffff"+
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
            "\1\46\27\uffff\1\45\62\uffff\1\55\1\54\1\47\1\57\1\52\1\51"+
            "\1\56\1\50\1\53",
            "\1\60\27\uffff\1\61\62\uffff\1\62",
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
            "\1\55\1\54\1\47\1\57\1\52\1\51\1\56\1\50\1\53",
            "\1\3\1\uffff\1\3\2\uffff\1\116\3\uffff\1\102\1\103\1\104\1"+
            "\105\1\106\1\107\1\110\1\111\1\112\1\113\1\114\1\115\2\uffff"+
            "\1\121\21\uffff\1\117\1\120\1\122\1\123\1\124\1\125\1\126\1"+
            "\127\1\130\31\uffff\1\55\1\54\1\47\1\57\1\52\1\51\1\56\1\50"+
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
            "\127\1\130\31\uffff\1\62",
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
            "\1\3\24\uffff\1\37\3\uffff\1\3\37\uffff\2\3\7\uffff\5\3",
            "\1\3\24\uffff\1\37\3\uffff\1\3\13\uffff\1\134\1\uffff\1\134"+
            "\21\uffff\2\3\7\uffff\5\3",
            "\1\3\30\uffff\1\3\13\uffff\1\134\1\uffff\1\134\21\uffff\2\3"+
            "\7\uffff\5\3",
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
            return "178:1: relative_date : ( relative_prefix WHITE_SPACE ( relative_target )? -> ^( RELATIVE_DATE ^( SEEK relative_prefix relative_target ) ) | implicit_prefix WHITE_SPACE relative_target -> ^( RELATIVE_DATE ^( SEEK implicit_prefix relative_target ) ) | relative_target -> ^( RELATIVE_DATE ^( SEEK DIRECTION[\">\"] SEEK_BY[\"by_day\"] INT[\"0\"] relative_target ) ) | spelled_or_int_01_to_31_optional_prefix WHITE_SPACE relative_target WHITE_SPACE relative_suffix -> ^( RELATIVE_DATE ^( SEEK relative_suffix spelled_or_int_01_to_31_optional_prefix relative_target ) ) | ( THE WHITE_SPACE )? relative_occurrence_index WHITE_SPACE day_of_week WHITE_SPACE IN WHITE_SPACE relaxed_month -> ^( RELATIVE_DATE ^( WEEK_INDEX relative_occurrence_index day_of_week relaxed_month ) ) | named_relative_date );";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
    }
    static final String DFA59_eotS =
        "\12\uffff";
    static final String DFA59_eofS =
        "\1\uffff\6\11\3\uffff";
    static final String DFA59_minS =
        "\1\60\6\26\3\uffff";
    static final String DFA59_maxS =
        "\1\135\6\137\3\uffff";
    static final String DFA59_acceptS =
        "\7\uffff\1\3\1\1\1\2";
    static final String DFA59_specialS =
        "\12\uffff}>";
    static final String[] DFA59_transitionS = {
            "\1\3\37\uffff\2\7\7\uffff\1\1\1\2\1\4\1\5\1\6",
            "\1\11\1\uffff\1\11\62\uffff\1\10\2\uffff\2\11\2\uffff\7\11"+
            "\1\uffff\1\10\1\uffff\4\10",
            "\1\11\1\uffff\1\11\62\uffff\1\10\2\uffff\2\11\2\uffff\7\11"+
            "\1\uffff\1\10\1\uffff\4\10",
            "\1\11\1\uffff\1\11\62\uffff\1\10\2\uffff\2\11\2\uffff\7\11"+
            "\1\uffff\1\10\1\uffff\4\10",
            "\1\11\1\uffff\1\11\62\uffff\1\10\2\uffff\2\11\2\uffff\7\11"+
            "\1\uffff\1\10\1\uffff\4\10",
            "\1\11\1\uffff\1\11\62\uffff\1\10\2\uffff\2\11\2\uffff\7\11"+
            "\1\uffff\1\10\1\uffff\4\10",
            "\1\11\1\uffff\1\11\62\uffff\1\10\2\uffff\2\11\2\uffff\7\11"+
            "\1\uffff\1\10\1\uffff\4\10",
            "",
            "",
            ""
    };

    static final short[] DFA59_eot = DFA.unpackEncodedString(DFA59_eotS);
    static final short[] DFA59_eof = DFA.unpackEncodedString(DFA59_eofS);
    static final char[] DFA59_min = DFA.unpackEncodedStringToUnsignedChars(DFA59_minS);
    static final char[] DFA59_max = DFA.unpackEncodedStringToUnsignedChars(DFA59_maxS);
    static final short[] DFA59_accept = DFA.unpackEncodedString(DFA59_acceptS);
    static final short[] DFA59_special = DFA.unpackEncodedString(DFA59_specialS);
    static final short[][] DFA59_transition;

    static {
        int numStates = DFA59_transitionS.length;
        DFA59_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA59_transition[i] = DFA.unpackEncodedString(DFA59_transitionS[i]);
        }
    }

    class DFA59 extends DFA {

        public DFA59(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 59;
            this.eot = DFA59_eot;
            this.eof = DFA59_eof;
            this.min = DFA59_min;
            this.max = DFA59_max;
            this.accept = DFA59_accept;
            this.special = DFA59_special;
            this.transition = DFA59_transition;
        }
        public String getDescription() {
            return "261:1: time : ( hours ( COLON )? minutes ( ( WHITE_SPACE )? ( meridian_indicator | ( MILITARY_HOUR_SUFFIX | HOUR ) ) )? ( ( WHITE_SPACE )? time_zone_abbreviation )? -> ^( EXPLICIT_TIME hours minutes ( meridian_indicator )? ( time_zone_abbreviation )? ) | hours ( ( WHITE_SPACE )? meridian_indicator )? ( ( WHITE_SPACE )? time_zone_abbreviation )? -> ^( EXPLICIT_TIME hours ^( MINUTES_OF_HOUR INT[\"0\"] ) ( meridian_indicator )? ( time_zone_abbreviation )? ) | named_time );";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
    }
    static final String DFA79_eotS =
        "\45\uffff";
    static final String DFA79_eofS =
        "\24\uffff\1\40\1\43\1\uffff\1\40\12\uffff\1\43\2\uffff";
    static final String DFA79_minS =
        "\1\141\23\uffff\2\26\1\141\1\26\12\uffff\1\26\2\uffff";
    static final String DFA79_maxS =
        "\1\165\23\uffff\1\151\1\141\2\151\12\uffff\1\141\2\uffff";
    static final String DFA79_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1"+
        "\15\1\16\1\17\1\20\1\21\1\22\1\23\4\uffff\1\30\1\27\1\35\1\34\1"+
        "\33\1\26\1\32\1\31\1\24\1\25\1\uffff\1\36\1\37";
    static final String DFA79_specialS =
        "\45\uffff}>";
    static final String[] DFA79_transitionS = {
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
            "\1\27\1\uffff\1\40\25\uffff\1\26\62\uffff\1\41\1\35\1\31\1"+
            "\30\1\37\1\36\1\34\1\33\1\32",
            "\1\42\1\uffff\1\43\25\uffff\1\44\62\uffff\1\44",
            "\1\41\1\35\1\31\1\30\1\37\1\36\1\34\1\33\1\32",
            "\3\40\2\uffff\1\40\2\uffff\20\40\2\uffff\1\40\16\uffff\11\40"+
            "\10\uffff\2\40\7\uffff\10\40\1\41\1\35\1\31\1\30\1\37\1\36\1"+
            "\34\1\33\1\32",
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
            "\3\43\2\uffff\1\43\2\uffff\20\43\2\uffff\1\43\16\uffff\11\43"+
            "\10\uffff\2\43\7\uffff\10\43\1\44",
            "",
            ""
    };

    static final short[] DFA79_eot = DFA.unpackEncodedString(DFA79_eotS);
    static final short[] DFA79_eof = DFA.unpackEncodedString(DFA79_eofS);
    static final char[] DFA79_min = DFA.unpackEncodedStringToUnsignedChars(DFA79_minS);
    static final char[] DFA79_max = DFA.unpackEncodedStringToUnsignedChars(DFA79_maxS);
    static final short[] DFA79_accept = DFA.unpackEncodedString(DFA79_acceptS);
    static final short[] DFA79_special = DFA.unpackEncodedString(DFA79_specialS);
    static final short[][] DFA79_transition;

    static {
        int numStates = DFA79_transitionS.length;
        DFA79_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA79_transition[i] = DFA.unpackEncodedString(DFA79_transitionS[i]);
        }
    }

    class DFA79 extends DFA {

        public DFA79(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 79;
            this.eot = DFA79_eot;
            this.eof = DFA79_eof;
            this.min = DFA79_min;
            this.max = DFA79_max;
            this.accept = DFA79_accept;
            this.special = DFA79_special;
            this.transition = DFA79_transition;
        }
        public String getDescription() {
            return "357:1: spelled_one_to_thirty_one : ( ONE -> INT[\"1\"] | TWO -> INT[\"2\"] | THREE -> INT[\"3\"] | FOUR -> INT[\"4\"] | FIVE -> INT[\"5\"] | SIX -> INT[\"6\"] | SEVEN -> INT[\"7\"] | EIGHT -> INT[\"8\"] | NINE -> INT[\"9\"] | TEN -> INT[\"10\"] | ELEVEN -> INT[\"11\"] | TWELVE -> INT[\"12\"] | THIRTEEN -> INT[\"13\"] | FOURTEEN -> INT[\"14\"] | FIFTEEN -> INT[\"15\"] | SIXTEEN -> INT[\"16\"] | SEVENTEEN -> INT[\"17\"] | EIGHTEEN -> INT[\"18\"] | NINETEEN -> INT[\"19\"] | TWENTY -> INT[\"20\"] | TWENTY ( DASH | WHITE_SPACE )? ONE -> INT[\"21\"] | TWENTY ( DASH | WHITE_SPACE )? TWO -> INT[\"22\"] | TWENTY ( DASH | WHITE_SPACE )? THREE -> INT[\"23\"] | TWENTY ( DASH | WHITE_SPACE )? FOUR -> INT[\"24\"] | TWENTY ( DASH | WHITE_SPACE )? FIVE -> INT[\"25\"] | TWENTY ( DASH | WHITE_SPACE )? SIX -> INT[\"26\"] | TWENTY ( DASH | WHITE_SPACE )? SEVEN -> INT[\"27\"] | TWENTY ( DASH | WHITE_SPACE )? EIGHT -> INT[\"28\"] | TWENTY ( DASH | WHITE_SPACE )? NINE -> INT[\"29\"] | THIRTY -> INT[\"30\"] | THIRTY ( DASH | WHITE_SPACE )? ONE -> INT[\"31\"] );";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
    }
    static final String DFA100_eotS =
        "\43\uffff";
    static final String DFA100_eofS =
        "\43\uffff";
    static final String DFA100_minS =
        "\1\61\25\uffff\1\26\12\uffff\2\61";
    static final String DFA100_maxS =
        "\1\u008f\25\uffff\1\171\12\uffff\2\171";
    static final String DFA100_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1"+
        "\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\uffff\1\26\1\27\1"+
        "\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37\2\uffff";
    static final String DFA100_specialS =
        "\43\uffff}>";
    static final String[] DFA100_transitionS = {
            "\1\1\1\2\1\3\1\4\1\5\76\uffff\1\26\1\40\1\6\1\7\1\10\1\11\1"+
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
            "\1\42\27\uffff\1\41\2\uffff\1\25\1\27\1\30\1\31\1\32\100\uffff"+
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
            "\1\25\1\27\1\30\1\31\1\32\100\uffff\1\33\1\34\1\35\1\36",
            "\1\25\1\27\1\30\1\31\1\32\100\uffff\1\33\1\34\1\35\1\36"
    };

    static final short[] DFA100_eot = DFA.unpackEncodedString(DFA100_eotS);
    static final short[] DFA100_eof = DFA.unpackEncodedString(DFA100_eofS);
    static final char[] DFA100_min = DFA.unpackEncodedStringToUnsignedChars(DFA100_minS);
    static final char[] DFA100_max = DFA.unpackEncodedStringToUnsignedChars(DFA100_maxS);
    static final short[] DFA100_accept = DFA.unpackEncodedString(DFA100_acceptS);
    static final short[] DFA100_special = DFA.unpackEncodedString(DFA100_specialS);
    static final short[][] DFA100_transition;

    static {
        int numStates = DFA100_transitionS.length;
        DFA100_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA100_transition[i] = DFA.unpackEncodedString(DFA100_transitionS[i]);
        }
    }

    class DFA100 extends DFA {

        public DFA100(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 100;
            this.eot = DFA100_eot;
            this.eof = DFA100_eof;
            this.min = DFA100_min;
            this.max = DFA100_max;
            this.accept = DFA100_accept;
            this.special = DFA100_special;
            this.transition = DFA100_transition;
        }
        public String getDescription() {
            return "392:1: spelled_first_to_thirty_first : ( FIRST -> INT[\"1\"] | SECOND -> INT[\"2\"] | THIRD -> INT[\"3\"] | FOURTH -> INT[\"4\"] | FIFTH -> INT[\"5\"] | SIXTH -> INT[\"6\"] | SEVENTH -> INT[\"7\"] | EIGHTH -> INT[\"8\"] | NINTH -> INT[\"9\"] | TENTH -> INT[\"10\"] | ELEVENTH -> INT[\"11\"] | TWELFTH -> INT[\"12\"] | THIRTEENTH -> INT[\"13\"] | FOURTEENTH -> INT[\"14\"] | FIFTEENTH -> INT[\"15\"] | SIXTEENTH -> INT[\"16\"] | SEVENTEENTH -> INT[\"17\"] | EIGHTEENTH -> INT[\"18\"] | NINETEENTH -> INT[\"19\"] | TWENTIETH -> INT[\"20\"] | ( TWENTY_FIRST | ( TWENTY ( DASH | WHITE_SPACE )? FIRST ) ) -> INT[\"21\"] | ( TWENTY_SECOND | ( TWENTY ( DASH | WHITE_SPACE )? SECOND ) ) -> INT[\"22\"] | ( TWENTY_THIRD | ( TWENTY ( DASH | WHITE_SPACE )? THIRD ) ) -> INT[\"23\"] | ( TWENTY_FOURTH | ( TWENTY ( DASH | WHITE_SPACE )? FOURTH ) ) -> INT[\"24\"] | ( TWENTY_FIFTH | ( TWENTY ( DASH | WHITE_SPACE )? FIFTH ) ) -> INT[\"25\"] | ( TWENTY_SIXTH | ( TWENTY ( DASH | WHITE_SPACE )? SIXTH ) ) -> INT[\"26\"] | ( TWENTY_SEVENTH | ( TWENTY ( DASH | WHITE_SPACE )? SEVENTH ) ) -> INT[\"27\"] | ( TWENTY_EIGHTH | ( TWENTY ( DASH | WHITE_SPACE )? EIGHTH ) ) -> INT[\"28\"] | ( TWENTY_NINTH | ( TWENTY ( DASH | WHITE_SPACE )? NINTH ) ) -> INT[\"29\"] | THIRTIETH -> INT[\"30\"] | ( THIRTY_FIRST | ( THIRTY ( DASH | WHITE_SPACE )? FIRST ) ) -> INT[\"31\"] );";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
    }
 

    public static final BitSet FOLLOW_date_time_in_search147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_date_in_date_time196 = new BitSet(new long[]{0x0000000001400002L});
    public static final BitSet FOLLOW_date_time_separator_in_date_time199 = new BitSet(new long[]{0x0001000000000000L,0x000000003E030000L});
    public static final BitSet FOLLOW_time_in_date_time201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_time_in_date_time220 = new BitSet(new long[]{0x0000000001400002L});
    public static final BitSet FOLLOW_time_date_separator_in_date_time223 = new BitSet(new long[]{0x8FFF37FF8C000000L,0xFFFFFFFFFC0007FFL,0x000000000000FFFFL});
    public static final BitSet FOLLOW_date_in_date_time225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_date_time_separator268 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_AT_in_date_time_separator271 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_date_time_separator273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMMA_in_date_time_separator281 = new BitSet(new long[]{0x0000000000C00002L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_date_time_separator283 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_AT_in_date_time_separator287 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_date_time_separator289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_time_date_separator306 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_ON_in_time_date_separator309 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_time_date_separator311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMMA_in_time_date_separator319 = new BitSet(new long[]{0x0000000002400002L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_time_date_separator321 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_ON_in_time_date_separator325 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_time_date_separator327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relaxed_date_in_date347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_formal_date_in_date353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relative_date_in_date359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_global_date_prefix_in_date365 = new BitSet(new long[]{0x8FFF37FF8C000000L,0xFFFFFFFFFC0007FFL,0x000000000000FFFFL});
    public static final BitSet FOLLOW_date_in_date367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THE_in_global_date_prefix404 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_global_date_prefix406 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_DAY_in_global_date_prefix410 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_global_date_prefix412 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_prefix_direction_in_global_date_prefix414 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_global_date_prefix416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spelled_or_int_01_to_31_optional_prefix_in_global_date_prefix442 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_global_date_prefix444 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_DAY_in_global_date_prefix446 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_global_date_prefix448 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_prefix_direction_in_global_date_prefix450 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_global_date_prefix452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AFTER_in_prefix_direction483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BEFORE_in_prefix_direction495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THE_in_relaxed_date583 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_relaxed_date585 = new BitSet(new long[]{0x003F000004000000L,0xFFFFFFFE78000000L,0x000000000000FFFFL});
    public static final BitSet FOLLOW_relaxed_day_of_month_in_relaxed_date589 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_relaxed_date591 = new BitSet(new long[]{0x000007FFC0000000L});
    public static final BitSet FOLLOW_OF_in_relaxed_date594 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_relaxed_date596 = new BitSet(new long[]{0x000007FF80000000L});
    public static final BitSet FOLLOW_relaxed_month_in_relaxed_date600 = new BitSet(new long[]{0x0000000001400000L});
    public static final BitSet FOLLOW_relaxed_year_prefix_in_relaxed_date602 = new BitSet(new long[]{0x0000080000000000L,0x00000001F4000000L});
    public static final BitSet FOLLOW_relaxed_year_in_relaxed_date604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relaxed_month_in_relaxed_date640 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_relaxed_date642 = new BitSet(new long[]{0x003F000004000000L,0xFFFFFFFE78000000L,0x000000000000FFFFL});
    public static final BitSet FOLLOW_relaxed_day_of_month_in_relaxed_date644 = new BitSet(new long[]{0x0000000001400000L});
    public static final BitSet FOLLOW_relaxed_year_prefix_in_relaxed_date646 = new BitSet(new long[]{0x0000080000000000L,0x00000001F4000000L});
    public static final BitSet FOLLOW_relaxed_year_in_relaxed_date648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THE_in_relaxed_date664 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_relaxed_date666 = new BitSet(new long[]{0x003F000004000000L,0xFFFFFFFE78000000L,0x000000000000FFFFL});
    public static final BitSet FOLLOW_relaxed_day_of_month_in_relaxed_date670 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_relaxed_date672 = new BitSet(new long[]{0x000007FFC0000000L});
    public static final BitSet FOLLOW_OF_in_relaxed_date675 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_relaxed_date677 = new BitSet(new long[]{0x000007FF80000000L});
    public static final BitSet FOLLOW_relaxed_month_in_relaxed_date681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THE_in_relaxed_date699 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_relaxed_date701 = new BitSet(new long[]{0x000007FF80000000L});
    public static final BitSet FOLLOW_relaxed_month_in_relaxed_date705 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_relaxed_date707 = new BitSet(new long[]{0x003F000004000000L,0xFFFFFFFE78000000L,0x000000000000FFFFL});
    public static final BitSet FOLLOW_relaxed_day_of_month_in_relaxed_date709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_JANUARY_in_relaxed_month741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FEBRUARY_in_relaxed_month758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MARCH_in_relaxed_month774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_APRIL_in_relaxed_month793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MAY_in_relaxed_month812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_JUNE_in_relaxed_month833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_JULY_in_relaxed_month853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AUGUST_in_relaxed_month873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEPTEMBER_in_relaxed_month891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OCTOBER_in_relaxed_month906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOVEMBER_in_relaxed_month923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DECEMBER_in_relaxed_month939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spelled_or_int_01_to_31_optional_prefix_in_relaxed_day_of_month964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spelled_first_to_thirty_first_in_relaxed_day_of_month991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SINGLE_QUOTE_in_relaxed_year1021 = new BitSet(new long[]{0x0000000000000000L,0x00000001F4000000L});
    public static final BitSet FOLLOW_int_00_to_99_mandatory_prefix_in_relaxed_year1024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_int_four_digits_in_relaxed_year1051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMMA_in_relaxed_year_prefix1081 = new BitSet(new long[]{0x0000100000400002L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_relaxed_year_prefix1083 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_relaxed_year_prefix1088 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_IN_in_relaxed_year_prefix1092 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_relaxed_year_prefix1094 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_THE_in_relaxed_year_prefix1096 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_relaxed_year_prefix1098 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_YEAR_in_relaxed_year_prefix1100 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_relaxed_year_prefix1102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_formal_year_four_digits_in_formal_date1125 = new BitSet(new long[]{0x0000C00000000000L});
    public static final BitSet FOLLOW_formal_date_separator_in_formal_date1127 = new BitSet(new long[]{0x0001000000000000L,0x00000001FC000000L});
    public static final BitSet FOLLOW_formal_month_of_year_in_formal_date1129 = new BitSet(new long[]{0x0000C00000000000L});
    public static final BitSet FOLLOW_formal_date_separator_in_formal_date1131 = new BitSet(new long[]{0x0001000000000000L,0x0000000078000000L});
    public static final BitSet FOLLOW_formal_day_of_month_in_formal_date1133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_formal_month_of_year_in_formal_date1162 = new BitSet(new long[]{0x0000C00000000000L});
    public static final BitSet FOLLOW_formal_date_separator_in_formal_date1164 = new BitSet(new long[]{0x0001000000000000L,0x0000000078000000L});
    public static final BitSet FOLLOW_formal_day_of_month_in_formal_date1166 = new BitSet(new long[]{0x0000C00000000002L});
    public static final BitSet FOLLOW_formal_date_separator_in_formal_date1169 = new BitSet(new long[]{0x0000000000000000L,0x00000001F4000000L});
    public static final BitSet FOLLOW_formal_year_in_formal_date1171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_int_01_to_12_optional_prefix_in_formal_month_of_year1205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_int_01_to_31_optional_prefix_in_formal_day_of_month1228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_formal_year_four_digits_in_formal_year1251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_int_00_to_99_mandatory_prefix_in_formal_year1257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_int_four_digits_in_formal_year_four_digits1280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_formal_date_separator0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relative_prefix_in_relative_date1329 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_relative_date1331 = new BitSet(new long[]{0x800027FF88000002L,0x00000000000000FFL});
    public static final BitSet FOLLOW_relative_target_in_relative_date1333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_implicit_prefix_in_relative_date1367 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_relative_date1369 = new BitSet(new long[]{0x800027FF88000000L,0x00000000000000FFL});
    public static final BitSet FOLLOW_relative_target_in_relative_date1371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relative_target_in_relative_date1411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spelled_or_int_01_to_31_optional_prefix_in_relative_date1451 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_relative_date1453 = new BitSet(new long[]{0x800027FF88000000L,0x00000000000000FFL});
    public static final BitSet FOLLOW_relative_target_in_relative_date1455 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_relative_date1457 = new BitSet(new long[]{0x5000000000000000L});
    public static final BitSet FOLLOW_relative_suffix_in_relative_date1459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THE_in_relative_date1499 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_relative_date1501 = new BitSet(new long[]{0x007F000004000000L});
    public static final BitSet FOLLOW_relative_occurrence_index_in_relative_date1505 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_relative_date1507 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000FEL});
    public static final BitSet FOLLOW_day_of_week_in_relative_date1509 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_relative_date1511 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_IN_in_relative_date1513 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_relative_date1515 = new BitSet(new long[]{0x000007FF80000000L});
    public static final BitSet FOLLOW_relaxed_month_in_relative_date1517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_named_relative_date_in_relative_date1552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_1_TO_5_in_relative_occurrence_index1568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FIRST_in_relative_occurrence_index1579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SECOND_in_relative_occurrence_index1595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIRD_in_relative_occurrence_index1610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOURTH_in_relative_occurrence_index1626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FIFTH_in_relative_occurrence_index1641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LAST_in_relative_occurrence_index1657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_day_of_week_in_relative_target1683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relaxed_month_in_relative_target1690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relative_date_span_in_relative_target1696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIS_in_implicit_prefix1711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIS_in_relative_prefix1738 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_relative_prefix1740 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_LAST_in_relative_prefix1744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIS_in_relative_prefix1766 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_relative_prefix1768 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_NEXT_in_relative_prefix1772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIS_in_relative_prefix1794 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_relative_prefix1796 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_PAST_in_relative_prefix1800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIS_in_relative_prefix1822 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_relative_prefix1824 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_COMING_in_relative_prefix1828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIS_in_relative_prefix1848 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_relative_prefix1850 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_UPCOMING_in_relative_prefix1854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IN_in_relative_prefix1872 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_relative_prefix1874 = new BitSet(new long[]{0x0001000000000000L,0x003FFFFE78000000L});
    public static final BitSet FOLLOW_spelled_or_int_01_to_31_optional_prefix_in_relative_prefix1878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FROM_in_relative_suffix1910 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_relative_suffix1912 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_NOW_in_relative_suffix1914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AGO_in_relative_suffix1928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DAY_in_relative_date_span1968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WEEK_in_relative_date_span1981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MONTH_in_relative_date_span1993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_YEAR_in_relative_date_span2004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SUNDAY_in_day_of_week2024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MONDAY_in_day_of_week2042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TUESDAY_in_day_of_week2060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WEDNESDAY_in_day_of_week2077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THURSDAY_in_day_of_week2092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FRIDAY_in_day_of_week2108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SATURDAY_in_day_of_week2126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TODAY_in_named_relative_date2151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOMORROW_in_named_relative_date2183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_YESTERDAY_in_named_relative_date2212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_hours_in_time2252 = new BitSet(new long[]{0x0000000000000000L,0x00000000F4000800L});
    public static final BitSet FOLLOW_COLON_in_time2254 = new BitSet(new long[]{0x0000000000000000L,0x00000000F4000800L});
    public static final BitSet FOLLOW_minutes_in_time2257 = new BitSet(new long[]{0x0000000000400002L,0x0000000001FCF000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_time2260 = new BitSet(new long[]{0x0000000000000000L,0x000000000000F000L});
    public static final BitSet FOLLOW_meridian_indicator_in_time2264 = new BitSet(new long[]{0x0000000000400002L,0x0000000001FC0000L});
    public static final BitSet FOLLOW_MILITARY_HOUR_SUFFIX_in_time2269 = new BitSet(new long[]{0x0000000000400002L,0x0000000001FC0000L});
    public static final BitSet FOLLOW_HOUR_in_time2273 = new BitSet(new long[]{0x0000000000400002L,0x0000000001FC0000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_time2280 = new BitSet(new long[]{0x0000000000400000L,0x0000000001FC0000L});
    public static final BitSet FOLLOW_time_zone_abbreviation_in_time2283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_hours_in_time2320 = new BitSet(new long[]{0x0000000000400002L,0x0000000001FCC000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_time2323 = new BitSet(new long[]{0x0000000000000000L,0x000000000000C000L});
    public static final BitSet FOLLOW_meridian_indicator_in_time2326 = new BitSet(new long[]{0x0000000000400002L,0x0000000001FC0000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_time2331 = new BitSet(new long[]{0x0000000000400000L,0x0000000001FC0000L});
    public static final BitSet FOLLOW_time_zone_abbreviation_in_time2334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_named_time_in_time2376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_int_00_to_23_optional_prefix_in_hours2391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_int_00_to_59_mandatory_prefix_in_minutes2415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AM_in_meridian_indicator2439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PM_in_meridian_indicator2450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOON_in_named_time2470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MIDNIGHT_in_named_time2503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UTC_in_time_zone_abbreviation2541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EST_in_time_zone_abbreviation2553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CST_in_time_zone_abbreviation2565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PST_in_time_zone_abbreviation2577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MST_in_time_zone_abbreviation2589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AKST_in_time_zone_abbreviation2601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HAST_in_time_zone_abbreviation2612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_0_in_int_00_to_23_optional_prefix2636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_00_in_int_00_to_23_optional_prefix2642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_1_TO_5_in_int_00_to_23_optional_prefix2648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_6_TO_9_in_int_00_to_23_optional_prefix2654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_01_TO_12_in_int_00_to_23_optional_prefix2660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_13_TO_23_in_int_00_to_23_optional_prefix2666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_00_in_int_00_to_59_mandatory_prefix2688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_01_TO_12_in_int_00_to_59_mandatory_prefix2694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_13_TO_23_in_int_00_to_59_mandatory_prefix2700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_24_TO_31_in_int_00_to_59_mandatory_prefix2706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_32_TO_59_in_int_00_to_59_mandatory_prefix2712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_int_00_to_59_mandatory_prefix_in_int_00_to_99_mandatory_prefix2734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_60_TO_99_in_int_00_to_99_mandatory_prefix2740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_1_TO_5_in_int_01_to_12_optional_prefix2762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_6_TO_9_in_int_01_to_12_optional_prefix2766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_01_TO_12_in_int_01_to_12_optional_prefix2770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_1_TO_5_in_int_01_to_31_optional_prefix2793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_6_TO_9_in_int_01_to_31_optional_prefix2799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_01_TO_12_in_int_01_to_31_optional_prefix2805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_13_TO_23_in_int_01_to_31_optional_prefix2811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_24_TO_31_in_int_01_to_31_optional_prefix2817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_int_00_to_99_mandatory_prefix_in_int_four_digits2839 = new BitSet(new long[]{0x0000000000000000L,0x00000001F4000000L});
    public static final BitSet FOLLOW_int_00_to_99_mandatory_prefix_in_int_four_digits2841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_int_01_to_31_optional_prefix_in_spelled_or_int_01_to_31_optional_prefix2869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spelled_one_to_thirty_one_in_spelled_or_int_01_to_31_optional_prefix2875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ONE_in_spelled_one_to_thirty_one2891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWO_in_spelled_one_to_thirty_one2909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THREE_in_spelled_one_to_thirty_one2927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOUR_in_spelled_one_to_thirty_one2943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FIVE_in_spelled_one_to_thirty_one2960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SIX_in_spelled_one_to_thirty_one2977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEVEN_in_spelled_one_to_thirty_one2995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EIGHT_in_spelled_one_to_thirty_one3011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NINE_in_spelled_one_to_thirty_one3027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEN_in_spelled_one_to_thirty_one3044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELEVEN_in_spelled_one_to_thirty_one3062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWELVE_in_spelled_one_to_thirty_one3077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIRTEEN_in_spelled_one_to_thirty_one3092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOURTEEN_in_spelled_one_to_thirty_one3105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FIFTEEN_in_spelled_one_to_thirty_one3118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SIXTEEN_in_spelled_one_to_thirty_one3132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEVENTEEN_in_spelled_one_to_thirty_one3146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EIGHTEEN_in_spelled_one_to_thirty_one3158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NINETEEN_in_spelled_one_to_thirty_one3171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_one_to_thirty_one3184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_one_to_thirty_one3199 = new BitSet(new long[]{0x0000400000400000L,0x0000000200000000L});
    public static final BitSet FOLLOW_DASH_in_spelled_one_to_thirty_one3202 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_spelled_one_to_thirty_one3206 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_ONE_in_spelled_one_to_thirty_one3210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_one_to_thirty_one3223 = new BitSet(new long[]{0x0000400000400000L,0x0000000400000000L});
    public static final BitSet FOLLOW_DASH_in_spelled_one_to_thirty_one3226 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_spelled_one_to_thirty_one3230 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_TWO_in_spelled_one_to_thirty_one3234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_one_to_thirty_one3247 = new BitSet(new long[]{0x0000400000400000L,0x0000000800000000L});
    public static final BitSet FOLLOW_DASH_in_spelled_one_to_thirty_one3250 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_spelled_one_to_thirty_one3254 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_THREE_in_spelled_one_to_thirty_one3258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_one_to_thirty_one3269 = new BitSet(new long[]{0x0000400000400000L,0x0000001000000000L});
    public static final BitSet FOLLOW_DASH_in_spelled_one_to_thirty_one3272 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_spelled_one_to_thirty_one3276 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_FOUR_in_spelled_one_to_thirty_one3280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_one_to_thirty_one3292 = new BitSet(new long[]{0x0000400000400000L,0x0000002000000000L});
    public static final BitSet FOLLOW_DASH_in_spelled_one_to_thirty_one3295 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_spelled_one_to_thirty_one3299 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_FIVE_in_spelled_one_to_thirty_one3303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_one_to_thirty_one3315 = new BitSet(new long[]{0x0000400000400000L,0x0000004000000000L});
    public static final BitSet FOLLOW_DASH_in_spelled_one_to_thirty_one3318 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_spelled_one_to_thirty_one3322 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_SIX_in_spelled_one_to_thirty_one3326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_one_to_thirty_one3339 = new BitSet(new long[]{0x0000400000400000L,0x0000008000000000L});
    public static final BitSet FOLLOW_DASH_in_spelled_one_to_thirty_one3342 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_spelled_one_to_thirty_one3346 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_SEVEN_in_spelled_one_to_thirty_one3350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_one_to_thirty_one3361 = new BitSet(new long[]{0x0000400000400000L,0x0000010000000000L});
    public static final BitSet FOLLOW_DASH_in_spelled_one_to_thirty_one3364 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_spelled_one_to_thirty_one3368 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_EIGHT_in_spelled_one_to_thirty_one3372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_one_to_thirty_one3383 = new BitSet(new long[]{0x0000400000400000L,0x0000020000000000L});
    public static final BitSet FOLLOW_DASH_in_spelled_one_to_thirty_one3386 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_spelled_one_to_thirty_one3390 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_NINE_in_spelled_one_to_thirty_one3394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIRTY_in_spelled_one_to_thirty_one3406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIRTY_in_spelled_one_to_thirty_one3445 = new BitSet(new long[]{0x0000400000400000L,0x0000000200000000L});
    public static final BitSet FOLLOW_DASH_in_spelled_one_to_thirty_one3448 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_spelled_one_to_thirty_one3452 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_ONE_in_spelled_one_to_thirty_one3456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FIRST_in_spelled_first_to_thirty_first3479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SECOND_in_spelled_first_to_thirty_first3496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIRD_in_spelled_first_to_thirty_first3512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOURTH_in_spelled_first_to_thirty_first3529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FIFTH_in_spelled_first_to_thirty_first3545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SIXTH_in_spelled_first_to_thirty_first3562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEVENTH_in_spelled_first_to_thirty_first3579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EIGHTH_in_spelled_first_to_thirty_first3594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NINTH_in_spelled_first_to_thirty_first3610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TENTH_in_spelled_first_to_thirty_first3627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELEVENTH_in_spelled_first_to_thirty_first3644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWELFTH_in_spelled_first_to_thirty_first3658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIRTEENTH_in_spelled_first_to_thirty_first3673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOURTEENTH_in_spelled_first_to_thirty_first3685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FIFTEENTH_in_spelled_first_to_thirty_first3697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SIXTEENTH_in_spelled_first_to_thirty_first3710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEVENTEENTH_in_spelled_first_to_thirty_first3723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EIGHTEENTH_in_spelled_first_to_thirty_first3734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NINETEENTH_in_spelled_first_to_thirty_first3746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTIETH_in_spelled_first_to_thirty_first3758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_FIRST_in_spelled_first_to_thirty_first3772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_first_to_thirty_first3779 = new BitSet(new long[]{0x0002400000400000L});
    public static final BitSet FOLLOW_DASH_in_spelled_first_to_thirty_first3782 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_spelled_first_to_thirty_first3786 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_FIRST_in_spelled_first_to_thirty_first3790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_SECOND_in_spelled_first_to_thirty_first3806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_first_to_thirty_first3812 = new BitSet(new long[]{0x0004400000400000L});
    public static final BitSet FOLLOW_DASH_in_spelled_first_to_thirty_first3815 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_spelled_first_to_thirty_first3819 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_SECOND_in_spelled_first_to_thirty_first3823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_THIRD_in_spelled_first_to_thirty_first3838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_first_to_thirty_first3845 = new BitSet(new long[]{0x0008400000400000L});
    public static final BitSet FOLLOW_DASH_in_spelled_first_to_thirty_first3848 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_spelled_first_to_thirty_first3852 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_THIRD_in_spelled_first_to_thirty_first3856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_FOURTH_in_spelled_first_to_thirty_first3872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_first_to_thirty_first3878 = new BitSet(new long[]{0x0010400000400000L});
    public static final BitSet FOLLOW_DASH_in_spelled_first_to_thirty_first3881 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_spelled_first_to_thirty_first3885 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_FOURTH_in_spelled_first_to_thirty_first3889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_FIFTH_in_spelled_first_to_thirty_first3904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_first_to_thirty_first3911 = new BitSet(new long[]{0x0020400000400000L});
    public static final BitSet FOLLOW_DASH_in_spelled_first_to_thirty_first3914 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_spelled_first_to_thirty_first3918 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_FIFTH_in_spelled_first_to_thirty_first3922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_SIXTH_in_spelled_first_to_thirty_first3938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_first_to_thirty_first3945 = new BitSet(new long[]{0x0000400000400000L,0x0040000000000000L});
    public static final BitSet FOLLOW_DASH_in_spelled_first_to_thirty_first3948 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_spelled_first_to_thirty_first3952 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_SIXTH_in_spelled_first_to_thirty_first3956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_SEVENTH_in_spelled_first_to_thirty_first3972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_first_to_thirty_first3977 = new BitSet(new long[]{0x0000400000400000L,0x0080000000000000L});
    public static final BitSet FOLLOW_DASH_in_spelled_first_to_thirty_first3980 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_spelled_first_to_thirty_first3984 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_SEVENTH_in_spelled_first_to_thirty_first3988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_EIGHTH_in_spelled_first_to_thirty_first4002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_first_to_thirty_first4008 = new BitSet(new long[]{0x0000400000400000L,0x0100000000000000L});
    public static final BitSet FOLLOW_DASH_in_spelled_first_to_thirty_first4011 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_spelled_first_to_thirty_first4015 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_EIGHTH_in_spelled_first_to_thirty_first4019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_NINTH_in_spelled_first_to_thirty_first4034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_first_to_thirty_first4041 = new BitSet(new long[]{0x0000400000400000L,0x0200000000000000L});
    public static final BitSet FOLLOW_DASH_in_spelled_first_to_thirty_first4044 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_spelled_first_to_thirty_first4048 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_NINTH_in_spelled_first_to_thirty_first4052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIRTIETH_in_spelled_first_to_thirty_first4067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIRTY_FIRST_in_spelled_first_to_thirty_first4127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIRTY_in_spelled_first_to_thirty_first4134 = new BitSet(new long[]{0x0002400000400000L});
    public static final BitSet FOLLOW_DASH_in_spelled_first_to_thirty_first4137 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_spelled_first_to_thirty_first4141 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_FIRST_in_spelled_first_to_thirty_first4145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_date_in_synpred1_Date177 = new BitSet(new long[]{0x0000000001400002L});
    public static final BitSet FOLLOW_date_time_separator_in_synpred1_Date180 = new BitSet(new long[]{0x0001000000000000L,0x000000003E030000L});
    public static final BitSet FOLLOW_time_in_synpred1_Date182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relaxed_date_in_synpred2_Date343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THE_in_synpred3_Date549 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_synpred3_Date551 = new BitSet(new long[]{0x003F000004000000L,0xFFFFFFFE78000000L,0x000000000000FFFFL});
    public static final BitSet FOLLOW_relaxed_day_of_month_in_synpred3_Date555 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_synpred3_Date557 = new BitSet(new long[]{0x000007FFC0000000L});
    public static final BitSet FOLLOW_OF_in_synpred3_Date560 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_synpred3_Date562 = new BitSet(new long[]{0x000007FF80000000L});
    public static final BitSet FOLLOW_relaxed_month_in_synpred3_Date566 = new BitSet(new long[]{0x0000000001400000L});
    public static final BitSet FOLLOW_relaxed_year_prefix_in_synpred3_Date568 = new BitSet(new long[]{0x0000080000000000L,0x00000001F4000000L});
    public static final BitSet FOLLOW_relaxed_year_in_synpred3_Date570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relaxed_month_in_synpred4_Date620 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_synpred4_Date622 = new BitSet(new long[]{0x003F000004000000L,0xFFFFFFFE78000000L,0x000000000000FFFFL});
    public static final BitSet FOLLOW_relaxed_day_of_month_in_synpred4_Date624 = new BitSet(new long[]{0x0000000001400000L});
    public static final BitSet FOLLOW_relaxed_year_prefix_in_synpred4_Date626 = new BitSet(new long[]{0x0000080000000000L,0x00000001F4000000L});
    public static final BitSet FOLLOW_relaxed_year_in_synpred4_Date628 = new BitSet(new long[]{0x0000000000000002L});

}