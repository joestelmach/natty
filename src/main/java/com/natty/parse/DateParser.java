// $ANTLR 3.2 Sep 23, 2009 12:02:23 /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g 2010-02-06 13:46:03
 package com.natty.parse; 

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;

public class DateParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "INT", "MONTH_OF_YEAR", "DAY_OF_MONTH", "DAY_OF_WEEK", "YEAR_OF", "DATE_TIME", "EXPLICIT_DATE", "RELATIVE_DATE", "SEEK_DIRECTION", "SEEK_TYPE", "SPAN", "EXPLICIT_TIME", "HOURS_OF_DAY", "MINUTES_OF_HOUR", "AM_PM", "WHITE_SPACE", "AT", "ON", "OF", "JANUARY", "DOT", "FEBRUARY", "MARCH", "APRIL", "MAY", "JUNE", "JULY", "AUGUST", "SEPTEMBER", "OCTOBER", "NOVEMBER", "DECEMBER", "SINGLE_QUOTE", "COMMA", "IN", "THE", "YEAR", "DASH", "SLASH", "DAY", "WEEK", "MONTH", "THIS", "LAST", "NEXT", "PAST", "COMING", "UPCOMING", "SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY", "TODAY", "TOMORROW", "YESTERDAY", "COLON", "MILITARY_HOUR_SUFFIX", "HOUR", "AM", "PM", "INT_0", "INT_00", "INT_1_TO_9", "INT_01_TO_12", "INT_13_TO_23", "INT_24_TO_31", "INT_32_TO_59", "INT_60_TO_99", "ONE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", "NINE", "TEN", "ELEVEN", "TWELVE", "THIRTEEN", "FOURTEEN", "FIFTEEN", "SIXTEEN", "SEVENTEEN", "EIGHTEEN", "NINETEEN", "TWENTY", "THIRTY", "FIRST", "SECOND", "THIRD", "FOURTH", "FIFTH", "SIXTH", "SEVENTH", "EIGHTH", "NINTH", "TENTH", "ELEVENTH", "TWELFTH", "THIRTEENTH", "FOURTEENTH", "FIFTEENTH", "SIXTEENTH", "SEVENTEENTH", "EIGHTEENTH", "NINETEENTH", "TWENTIETH", "TWENTY_FIRST", "TWENTY_SECOND", "TWENTY_THIRD", "TWENTY_FOURTH", "TWENTY_FIFTH", "TWENTY_SIXTH", "TWENTY_SEVENTH", "TWENTY_EIGHTH", "TWENTY_NINTH", "THIRTIETH", "THIRTY_FIRST", "'from now'", "'ago'"
    };
    public static final int NINETEEN=93;
    public static final int SEPTEMBER=32;
    public static final int WEEK=44;
    public static final int WEDNESDAY=55;
    public static final int INT_24_TO_31=72;
    public static final int TWENTY_EIGHTH=123;
    public static final int TWENTY=94;
    public static final int INT_00=68;
    public static final int JULY=30;
    public static final int APRIL=27;
    public static final int COMING=50;
    public static final int NINETEENTH=114;
    public static final int OCTOBER=33;
    public static final int DAY=43;
    public static final int ONE=75;
    public static final int MARCH=26;
    public static final int EOF=-1;
    public static final int MONTH=45;
    public static final int PAST=49;
    public static final int SEVENTEEN=91;
    public static final int DATE_TIME=9;
    public static final int AM_PM=18;
    public static final int TWENTY_SEVENTH=122;
    public static final int TWENTY_FIFTH=120;
    public static final int EIGHTEENTH=113;
    public static final int MINUTES_OF_HOUR=17;
    public static final int SPAN=14;
    public static final int THIS=46;
    public static final int THIRTIETH=125;
    public static final int INT_60_TO_99=74;
    public static final int LAST=47;
    public static final int EIGHTEEN=92;
    public static final int INT_01_TO_12=70;
    public static final int RELATIVE_DATE=11;
    public static final int TOMORROW=60;
    public static final int FIFTEENTH=110;
    public static final int FOURTH=99;
    public static final int TODAY=59;
    public static final int SECOND=97;
    public static final int NOVEMBER=34;
    public static final int SATURDAY=58;
    public static final int MONTH_OF_YEAR=5;
    public static final int FOUR=78;
    public static final int SEVENTH=102;
    public static final int TEN=84;
    public static final int FEBRUARY=25;
    public static final int ON=21;
    public static final int MONDAY=53;
    public static final int DAY_OF_WEEK=7;
    public static final int SUNDAY=52;
    public static final int SEVEN=81;
    public static final int ELEVEN=85;
    public static final int THIRTEEN=87;
    public static final int JUNE=29;
    public static final int INT=4;
    public static final int EXPLICIT_DATE=10;
    public static final int OF=22;
    public static final int UPCOMING=51;
    public static final int SIX=80;
    public static final int FIFTH=100;
    public static final int T__128=128;
    public static final int TWENTY_NINTH=124;
    public static final int T__127=127;
    public static final int THURSDAY=56;
    public static final int DECEMBER=35;
    public static final int AUGUST=31;
    public static final int PM=66;
    public static final int EXPLICIT_TIME=15;
    public static final int TUESDAY=54;
    public static final int EIGHTH=103;
    public static final int THIRD=98;
    public static final int HOURS_OF_DAY=16;
    public static final int YEAR=40;
    public static final int THE=39;
    public static final int TENTH=105;
    public static final int MAY=28;
    public static final int TWENTY_FOURTH=119;
    public static final int WHITE_SPACE=19;
    public static final int SEEK_TYPE=13;
    public static final int FRIDAY=57;
    public static final int EIGHT=82;
    public static final int INT_0=67;
    public static final int TWENTY_SIXTH=121;
    public static final int AT=20;
    public static final int SINGLE_QUOTE=36;
    public static final int SLASH=42;
    public static final int IN=38;
    public static final int NINTH=104;
    public static final int COMMA=37;
    public static final int FIVE=79;
    public static final int THIRTY=95;
    public static final int TWENTIETH=115;
    public static final int TWENTY_SECOND=117;
    public static final int NEXT=48;
    public static final int DOT=24;
    public static final int INT_13_TO_23=71;
    public static final int MILITARY_HOUR_SUFFIX=63;
    public static final int INT_32_TO_59=73;
    public static final int AM=65;
    public static final int DASH=41;
    public static final int FOURTEENTH=109;
    public static final int SIXTEEN=90;
    public static final int INT_1_TO_9=69;
    public static final int YEAR_OF=8;
    public static final int SEEK_DIRECTION=12;
    public static final int TWELVE=86;
    public static final int ELEVENTH=106;
    public static final int TWO=76;
    public static final int HOUR=64;
    public static final int SIXTEENTH=111;
    public static final int JANUARY=23;
    public static final int THIRTEENTH=108;
    public static final int COLON=62;
    public static final int DAY_OF_MONTH=6;
    public static final int FIFTEEN=89;
    public static final int TWELFTH=107;
    public static final int NINE=83;
    public static final int SIXTH=101;
    public static final int TWENTY_FIRST=116;
    public static final int THREE=77;
    public static final int FOURTEEN=88;
    public static final int TWENTY_THIRD=118;
    public static final int YESTERDAY=61;
    public static final int SEVENTEENTH=112;
    public static final int THIRTY_FIRST=126;
    public static final int FIRST=96;

    // delegates
    // delegators


        public DateParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public DateParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return DateParser.tokenNames; }
    public String getGrammarFileName() { return "/Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g"; }


    public static class date_time_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "date_time"
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:28:1: date_time : ( ( date ( WHITE_SPACE ( AT WHITE_SPACE )? time )? )=> date ( WHITE_SPACE ( AT WHITE_SPACE )? time )? | time ( WHITE_SPACE ( ON WHITE_SPACE )? date )? ) -> ^( DATE_TIME ( date )? ( time )? ) ;
    public final DateParser.date_time_return date_time() throws RecognitionException {
        DateParser.date_time_return retval = new DateParser.date_time_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token WHITE_SPACE2=null;
        Token AT3=null;
        Token WHITE_SPACE4=null;
        Token WHITE_SPACE7=null;
        Token ON8=null;
        Token WHITE_SPACE9=null;
        DateParser.date_return date1 = null;

        DateParser.time_return time5 = null;

        DateParser.time_return time6 = null;

        DateParser.date_return date10 = null;


        Object WHITE_SPACE2_tree=null;
        Object AT3_tree=null;
        Object WHITE_SPACE4_tree=null;
        Object WHITE_SPACE7_tree=null;
        Object ON8_tree=null;
        Object WHITE_SPACE9_tree=null;
        RewriteRuleTokenStream stream_AT=new RewriteRuleTokenStream(adaptor,"token AT");
        RewriteRuleTokenStream stream_ON=new RewriteRuleTokenStream(adaptor,"token ON");
        RewriteRuleTokenStream stream_WHITE_SPACE=new RewriteRuleTokenStream(adaptor,"token WHITE_SPACE");
        RewriteRuleSubtreeStream stream_time=new RewriteRuleSubtreeStream(adaptor,"rule time");
        RewriteRuleSubtreeStream stream_date=new RewriteRuleSubtreeStream(adaptor,"rule date");
        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:29:3: ( ( ( date ( WHITE_SPACE ( AT WHITE_SPACE )? time )? )=> date ( WHITE_SPACE ( AT WHITE_SPACE )? time )? | time ( WHITE_SPACE ( ON WHITE_SPACE )? date )? ) -> ^( DATE_TIME ( date )? ( time )? ) )
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:29:5: ( ( date ( WHITE_SPACE ( AT WHITE_SPACE )? time )? )=> date ( WHITE_SPACE ( AT WHITE_SPACE )? time )? | time ( WHITE_SPACE ( ON WHITE_SPACE )? date )? )
            {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:29:5: ( ( date ( WHITE_SPACE ( AT WHITE_SPACE )? time )? )=> date ( WHITE_SPACE ( AT WHITE_SPACE )? time )? | time ( WHITE_SPACE ( ON WHITE_SPACE )? date )? )
            int alt5=2;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:30:7: ( date ( WHITE_SPACE ( AT WHITE_SPACE )? time )? )=> date ( WHITE_SPACE ( AT WHITE_SPACE )? time )?
                    {
                    pushFollow(FOLLOW_date_in_date_time160);
                    date1=date();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_date.add(date1.getTree());
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:31:14: ( WHITE_SPACE ( AT WHITE_SPACE )? time )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0==WHITE_SPACE) ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:31:15: WHITE_SPACE ( AT WHITE_SPACE )? time
                            {
                            WHITE_SPACE2=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_date_time163); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE2);

                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:31:27: ( AT WHITE_SPACE )?
                            int alt1=2;
                            int LA1_0 = input.LA(1);

                            if ( (LA1_0==AT) ) {
                                alt1=1;
                            }
                            switch (alt1) {
                                case 1 :
                                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:31:28: AT WHITE_SPACE
                                    {
                                    AT3=(Token)match(input,AT,FOLLOW_AT_in_date_time166); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_AT.add(AT3);

                                    WHITE_SPACE4=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_date_time168); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE4);


                                    }
                                    break;

                            }

                            pushFollow(FOLLOW_time_in_date_time172);
                            time5=time();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_time.add(time5.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:33:9: time ( WHITE_SPACE ( ON WHITE_SPACE )? date )?
                    {
                    pushFollow(FOLLOW_time_in_date_time191);
                    time6=time();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_time.add(time6.getTree());
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:33:14: ( WHITE_SPACE ( ON WHITE_SPACE )? date )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==WHITE_SPACE) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:33:15: WHITE_SPACE ( ON WHITE_SPACE )? date
                            {
                            WHITE_SPACE7=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_date_time194); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE7);

                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:33:27: ( ON WHITE_SPACE )?
                            int alt3=2;
                            int LA3_0 = input.LA(1);

                            if ( (LA3_0==ON) ) {
                                alt3=1;
                            }
                            switch (alt3) {
                                case 1 :
                                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:33:28: ON WHITE_SPACE
                                    {
                                    ON8=(Token)match(input,ON,FOLLOW_ON_in_date_time197); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_ON.add(ON8);

                                    WHITE_SPACE9=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_date_time199); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE9);


                                    }
                                    break;

                            }

                            pushFollow(FOLLOW_date_in_date_time203);
                            date10=date();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_date.add(date10.getTree());

                            }
                            break;

                    }


                    }
                    break;

            }



            // AST REWRITE
            // elements: date, time
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 34:7: -> ^( DATE_TIME ( date )? ( time )? )
            {
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:34:10: ^( DATE_TIME ( date )? ( time )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DATE_TIME, "DATE_TIME"), root_1);

                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:34:22: ( date )?
                if ( stream_date.hasNext() ) {
                    adaptor.addChild(root_1, stream_date.nextTree());

                }
                stream_date.reset();
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:34:28: ( time )?
                if ( stream_time.hasNext() ) {
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
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "date_time"

    public static class date_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "date"
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:37:1: date : ( formal_date | relaxed_date | relative_date );
    public final DateParser.date_return date() throws RecognitionException {
        DateParser.date_return retval = new DateParser.date_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        DateParser.formal_date_return formal_date11 = null;

        DateParser.relaxed_date_return relaxed_date12 = null;

        DateParser.relative_date_return relative_date13 = null;



        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:38:3: ( formal_date | relaxed_date | relative_date )
            int alt6=3;
            alt6 = dfa6.predict(input);
            switch (alt6) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:38:5: formal_date
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_formal_date_in_date236);
                    formal_date11=formal_date();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, formal_date11.getTree());

                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:39:5: relaxed_date
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_relaxed_date_in_date242);
                    relaxed_date12=relaxed_date();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, relaxed_date12.getTree());

                    }
                    break;
                case 3 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:40:5: relative_date
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_relative_date_in_date248);
                    relative_date13=relative_date();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, relative_date13.getTree());

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
        return retval;
    }
    // $ANTLR end "date"

    public static class relaxed_date_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "relaxed_date"
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:46:1: relaxed_date : ( ( relaxed_day_of_month WHITE_SPACE ( OF WHITE_SPACE )? relaxed_month relaxed_year )=> relaxed_day_of_month WHITE_SPACE ( OF WHITE_SPACE )? relaxed_month relaxed_year | ( relaxed_month WHITE_SPACE relaxed_day_of_month relaxed_year )=> relaxed_month WHITE_SPACE relaxed_day_of_month relaxed_year | relaxed_day_of_month WHITE_SPACE ( OF WHITE_SPACE )? relaxed_month | relaxed_month WHITE_SPACE relaxed_day_of_month ) -> ^( EXPLICIT_DATE relaxed_month relaxed_day_of_month ( relaxed_year )? ) ;
    public final DateParser.relaxed_date_return relaxed_date() throws RecognitionException {
        DateParser.relaxed_date_return retval = new DateParser.relaxed_date_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token WHITE_SPACE15=null;
        Token OF16=null;
        Token WHITE_SPACE17=null;
        Token WHITE_SPACE21=null;
        Token WHITE_SPACE25=null;
        Token OF26=null;
        Token WHITE_SPACE27=null;
        Token WHITE_SPACE30=null;
        DateParser.relaxed_day_of_month_return relaxed_day_of_month14 = null;

        DateParser.relaxed_month_return relaxed_month18 = null;

        DateParser.relaxed_year_return relaxed_year19 = null;

        DateParser.relaxed_month_return relaxed_month20 = null;

        DateParser.relaxed_day_of_month_return relaxed_day_of_month22 = null;

        DateParser.relaxed_year_return relaxed_year23 = null;

        DateParser.relaxed_day_of_month_return relaxed_day_of_month24 = null;

        DateParser.relaxed_month_return relaxed_month28 = null;

        DateParser.relaxed_month_return relaxed_month29 = null;

        DateParser.relaxed_day_of_month_return relaxed_day_of_month31 = null;


        Object WHITE_SPACE15_tree=null;
        Object OF16_tree=null;
        Object WHITE_SPACE17_tree=null;
        Object WHITE_SPACE21_tree=null;
        Object WHITE_SPACE25_tree=null;
        Object OF26_tree=null;
        Object WHITE_SPACE27_tree=null;
        Object WHITE_SPACE30_tree=null;
        RewriteRuleTokenStream stream_OF=new RewriteRuleTokenStream(adaptor,"token OF");
        RewriteRuleTokenStream stream_WHITE_SPACE=new RewriteRuleTokenStream(adaptor,"token WHITE_SPACE");
        RewriteRuleSubtreeStream stream_relaxed_day_of_month=new RewriteRuleSubtreeStream(adaptor,"rule relaxed_day_of_month");
        RewriteRuleSubtreeStream stream_relaxed_month=new RewriteRuleSubtreeStream(adaptor,"rule relaxed_month");
        RewriteRuleSubtreeStream stream_relaxed_year=new RewriteRuleSubtreeStream(adaptor,"rule relaxed_year");
        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:47:3: ( ( ( relaxed_day_of_month WHITE_SPACE ( OF WHITE_SPACE )? relaxed_month relaxed_year )=> relaxed_day_of_month WHITE_SPACE ( OF WHITE_SPACE )? relaxed_month relaxed_year | ( relaxed_month WHITE_SPACE relaxed_day_of_month relaxed_year )=> relaxed_month WHITE_SPACE relaxed_day_of_month relaxed_year | relaxed_day_of_month WHITE_SPACE ( OF WHITE_SPACE )? relaxed_month | relaxed_month WHITE_SPACE relaxed_day_of_month ) -> ^( EXPLICIT_DATE relaxed_month relaxed_day_of_month ( relaxed_year )? ) )
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:47:5: ( ( relaxed_day_of_month WHITE_SPACE ( OF WHITE_SPACE )? relaxed_month relaxed_year )=> relaxed_day_of_month WHITE_SPACE ( OF WHITE_SPACE )? relaxed_month relaxed_year | ( relaxed_month WHITE_SPACE relaxed_day_of_month relaxed_year )=> relaxed_month WHITE_SPACE relaxed_day_of_month relaxed_year | relaxed_day_of_month WHITE_SPACE ( OF WHITE_SPACE )? relaxed_month | relaxed_month WHITE_SPACE relaxed_day_of_month )
            {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:47:5: ( ( relaxed_day_of_month WHITE_SPACE ( OF WHITE_SPACE )? relaxed_month relaxed_year )=> relaxed_day_of_month WHITE_SPACE ( OF WHITE_SPACE )? relaxed_month relaxed_year | ( relaxed_month WHITE_SPACE relaxed_day_of_month relaxed_year )=> relaxed_month WHITE_SPACE relaxed_day_of_month relaxed_year | relaxed_day_of_month WHITE_SPACE ( OF WHITE_SPACE )? relaxed_month | relaxed_month WHITE_SPACE relaxed_day_of_month )
            int alt9=4;
            alt9 = dfa9.predict(input);
            switch (alt9) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:51:7: ( relaxed_day_of_month WHITE_SPACE ( OF WHITE_SPACE )? relaxed_month relaxed_year )=> relaxed_day_of_month WHITE_SPACE ( OF WHITE_SPACE )? relaxed_month relaxed_year
                    {
                    pushFollow(FOLLOW_relaxed_day_of_month_in_relaxed_date321);
                    relaxed_day_of_month14=relaxed_day_of_month();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_relaxed_day_of_month.add(relaxed_day_of_month14.getTree());
                    WHITE_SPACE15=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_relaxed_date323); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE15);

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:52:42: ( OF WHITE_SPACE )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==OF) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:52:43: OF WHITE_SPACE
                            {
                            OF16=(Token)match(input,OF,FOLLOW_OF_in_relaxed_date326); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_OF.add(OF16);

                            WHITE_SPACE17=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_relaxed_date328); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE17);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_relaxed_month_in_relaxed_date332);
                    relaxed_month18=relaxed_month();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_relaxed_month.add(relaxed_month18.getTree());
                    pushFollow(FOLLOW_relaxed_year_in_relaxed_date334);
                    relaxed_year19=relaxed_year();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_relaxed_year.add(relaxed_year19.getTree());

                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:54:9: ( relaxed_month WHITE_SPACE relaxed_day_of_month relaxed_year )=> relaxed_month WHITE_SPACE relaxed_day_of_month relaxed_year
                    {
                    pushFollow(FOLLOW_relaxed_month_in_relaxed_date368);
                    relaxed_month20=relaxed_month();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_relaxed_month.add(relaxed_month20.getTree());
                    WHITE_SPACE21=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_relaxed_date370); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE21);

                    pushFollow(FOLLOW_relaxed_day_of_month_in_relaxed_date372);
                    relaxed_day_of_month22=relaxed_day_of_month();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_relaxed_day_of_month.add(relaxed_day_of_month22.getTree());
                    pushFollow(FOLLOW_relaxed_year_in_relaxed_date374);
                    relaxed_year23=relaxed_year();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_relaxed_year.add(relaxed_year23.getTree());

                    }
                    break;
                case 3 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:57:9: relaxed_day_of_month WHITE_SPACE ( OF WHITE_SPACE )? relaxed_month
                    {
                    pushFollow(FOLLOW_relaxed_day_of_month_in_relaxed_date389);
                    relaxed_day_of_month24=relaxed_day_of_month();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_relaxed_day_of_month.add(relaxed_day_of_month24.getTree());
                    WHITE_SPACE25=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_relaxed_date391); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE25);

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:57:42: ( OF WHITE_SPACE )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==OF) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:57:43: OF WHITE_SPACE
                            {
                            OF26=(Token)match(input,OF,FOLLOW_OF_in_relaxed_date394); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_OF.add(OF26);

                            WHITE_SPACE27=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_relaxed_date396); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE27);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_relaxed_month_in_relaxed_date400);
                    relaxed_month28=relaxed_month();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_relaxed_month.add(relaxed_month28.getTree());

                    }
                    break;
                case 4 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:58:9: relaxed_month WHITE_SPACE relaxed_day_of_month
                    {
                    pushFollow(FOLLOW_relaxed_month_in_relaxed_date410);
                    relaxed_month29=relaxed_month();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_relaxed_month.add(relaxed_month29.getTree());
                    WHITE_SPACE30=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_relaxed_date412); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE30);

                    pushFollow(FOLLOW_relaxed_day_of_month_in_relaxed_date414);
                    relaxed_day_of_month31=relaxed_day_of_month();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_relaxed_day_of_month.add(relaxed_day_of_month31.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: relaxed_month, relaxed_year, relaxed_day_of_month
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 59:7: -> ^( EXPLICIT_DATE relaxed_month relaxed_day_of_month ( relaxed_year )? )
            {
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:59:10: ^( EXPLICIT_DATE relaxed_month relaxed_day_of_month ( relaxed_year )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPLICIT_DATE, "EXPLICIT_DATE"), root_1);

                adaptor.addChild(root_1, stream_relaxed_month.nextTree());
                adaptor.addChild(root_1, stream_relaxed_day_of_month.nextTree());
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:59:61: ( relaxed_year )?
                if ( stream_relaxed_year.hasNext() ) {
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
        return retval;
    }
    // $ANTLR end "relaxed_date"

    public static class relaxed_month_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "relaxed_month"
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:62:1: relaxed_month : ( JANUARY ( DOT )? -> ^( MONTH_OF_YEAR INT[\"1\"] ) | FEBRUARY ( DOT )? -> ^( MONTH_OF_YEAR INT[\"2\"] ) | MARCH ( DOT )? -> ^( MONTH_OF_YEAR INT[\"3\"] ) | APRIL ( DOT )? -> ^( MONTH_OF_YEAR INT[\"4\"] ) | MAY ( DOT )? -> ^( MONTH_OF_YEAR INT[\"5\"] ) | JUNE ( DOT )? -> ^( MONTH_OF_YEAR INT[\"6\"] ) | JULY ( DOT )? -> ^( MONTH_OF_YEAR INT[\"7\"] ) | AUGUST ( DOT )? -> ^( MONTH_OF_YEAR INT[\"8\"] ) | SEPTEMBER ( DOT )? -> ^( MONTH_OF_YEAR INT[\"9\"] ) | OCTOBER ( DOT )? -> ^( MONTH_OF_YEAR INT[\"10\"] ) | NOVEMBER ( DOT )? -> ^( MONTH_OF_YEAR INT[\"11\"] ) | DECEMBER ( DOT )? -> ^( MONTH_OF_YEAR INT[\"12\"] ) );
    public final DateParser.relaxed_month_return relaxed_month() throws RecognitionException {
        DateParser.relaxed_month_return retval = new DateParser.relaxed_month_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token JANUARY32=null;
        Token DOT33=null;
        Token FEBRUARY34=null;
        Token DOT35=null;
        Token MARCH36=null;
        Token DOT37=null;
        Token APRIL38=null;
        Token DOT39=null;
        Token MAY40=null;
        Token DOT41=null;
        Token JUNE42=null;
        Token DOT43=null;
        Token JULY44=null;
        Token DOT45=null;
        Token AUGUST46=null;
        Token DOT47=null;
        Token SEPTEMBER48=null;
        Token DOT49=null;
        Token OCTOBER50=null;
        Token DOT51=null;
        Token NOVEMBER52=null;
        Token DOT53=null;
        Token DECEMBER54=null;
        Token DOT55=null;

        Object JANUARY32_tree=null;
        Object DOT33_tree=null;
        Object FEBRUARY34_tree=null;
        Object DOT35_tree=null;
        Object MARCH36_tree=null;
        Object DOT37_tree=null;
        Object APRIL38_tree=null;
        Object DOT39_tree=null;
        Object MAY40_tree=null;
        Object DOT41_tree=null;
        Object JUNE42_tree=null;
        Object DOT43_tree=null;
        Object JULY44_tree=null;
        Object DOT45_tree=null;
        Object AUGUST46_tree=null;
        Object DOT47_tree=null;
        Object SEPTEMBER48_tree=null;
        Object DOT49_tree=null;
        Object OCTOBER50_tree=null;
        Object DOT51_tree=null;
        Object NOVEMBER52_tree=null;
        Object DOT53_tree=null;
        Object DECEMBER54_tree=null;
        Object DOT55_tree=null;
        RewriteRuleTokenStream stream_SEPTEMBER=new RewriteRuleTokenStream(adaptor,"token SEPTEMBER");
        RewriteRuleTokenStream stream_NOVEMBER=new RewriteRuleTokenStream(adaptor,"token NOVEMBER");
        RewriteRuleTokenStream stream_APRIL=new RewriteRuleTokenStream(adaptor,"token APRIL");
        RewriteRuleTokenStream stream_JULY=new RewriteRuleTokenStream(adaptor,"token JULY");
        RewriteRuleTokenStream stream_DECEMBER=new RewriteRuleTokenStream(adaptor,"token DECEMBER");
        RewriteRuleTokenStream stream_MAY=new RewriteRuleTokenStream(adaptor,"token MAY");
        RewriteRuleTokenStream stream_OCTOBER=new RewriteRuleTokenStream(adaptor,"token OCTOBER");
        RewriteRuleTokenStream stream_FEBRUARY=new RewriteRuleTokenStream(adaptor,"token FEBRUARY");
        RewriteRuleTokenStream stream_AUGUST=new RewriteRuleTokenStream(adaptor,"token AUGUST");
        RewriteRuleTokenStream stream_JUNE=new RewriteRuleTokenStream(adaptor,"token JUNE");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleTokenStream stream_MARCH=new RewriteRuleTokenStream(adaptor,"token MARCH");
        RewriteRuleTokenStream stream_JANUARY=new RewriteRuleTokenStream(adaptor,"token JANUARY");

        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:63:3: ( JANUARY ( DOT )? -> ^( MONTH_OF_YEAR INT[\"1\"] ) | FEBRUARY ( DOT )? -> ^( MONTH_OF_YEAR INT[\"2\"] ) | MARCH ( DOT )? -> ^( MONTH_OF_YEAR INT[\"3\"] ) | APRIL ( DOT )? -> ^( MONTH_OF_YEAR INT[\"4\"] ) | MAY ( DOT )? -> ^( MONTH_OF_YEAR INT[\"5\"] ) | JUNE ( DOT )? -> ^( MONTH_OF_YEAR INT[\"6\"] ) | JULY ( DOT )? -> ^( MONTH_OF_YEAR INT[\"7\"] ) | AUGUST ( DOT )? -> ^( MONTH_OF_YEAR INT[\"8\"] ) | SEPTEMBER ( DOT )? -> ^( MONTH_OF_YEAR INT[\"9\"] ) | OCTOBER ( DOT )? -> ^( MONTH_OF_YEAR INT[\"10\"] ) | NOVEMBER ( DOT )? -> ^( MONTH_OF_YEAR INT[\"11\"] ) | DECEMBER ( DOT )? -> ^( MONTH_OF_YEAR INT[\"12\"] ) )
            int alt22=12;
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

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:63:5: JANUARY ( DOT )?
                    {
                    JANUARY32=(Token)match(input,JANUARY,FOLLOW_JANUARY_in_relaxed_month446); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_JANUARY.add(JANUARY32);

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:63:13: ( DOT )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==DOT) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:63:13: DOT
                            {
                            DOT33=(Token)match(input,DOT,FOLLOW_DOT_in_relaxed_month448); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_DOT.add(DOT33);


                            }
                            break;

                    }



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
                    // 63:20: -> ^( MONTH_OF_YEAR INT[\"1\"] )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:63:23: ^( MONTH_OF_YEAR INT[\"1\"] )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(MONTH_OF_YEAR, "MONTH_OF_YEAR"), root_1);

                        adaptor.addChild(root_1, (Object)adaptor.create(INT, "1"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:64:5: FEBRUARY ( DOT )?
                    {
                    FEBRUARY34=(Token)match(input,FEBRUARY,FOLLOW_FEBRUARY_in_relaxed_month466); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FEBRUARY.add(FEBRUARY34);

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:64:14: ( DOT )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==DOT) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:64:14: DOT
                            {
                            DOT35=(Token)match(input,DOT,FOLLOW_DOT_in_relaxed_month468); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_DOT.add(DOT35);


                            }
                            break;

                    }



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
                    // 64:20: -> ^( MONTH_OF_YEAR INT[\"2\"] )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:64:23: ^( MONTH_OF_YEAR INT[\"2\"] )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(MONTH_OF_YEAR, "MONTH_OF_YEAR"), root_1);

                        adaptor.addChild(root_1, (Object)adaptor.create(INT, "2"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:65:5: MARCH ( DOT )?
                    {
                    MARCH36=(Token)match(input,MARCH,FOLLOW_MARCH_in_relaxed_month485); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_MARCH.add(MARCH36);

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:65:11: ( DOT )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==DOT) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:65:11: DOT
                            {
                            DOT37=(Token)match(input,DOT,FOLLOW_DOT_in_relaxed_month487); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_DOT.add(DOT37);


                            }
                            break;

                    }



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
                    // 65:20: -> ^( MONTH_OF_YEAR INT[\"3\"] )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:65:23: ^( MONTH_OF_YEAR INT[\"3\"] )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(MONTH_OF_YEAR, "MONTH_OF_YEAR"), root_1);

                        adaptor.addChild(root_1, (Object)adaptor.create(INT, "3"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:66:5: APRIL ( DOT )?
                    {
                    APRIL38=(Token)match(input,APRIL,FOLLOW_APRIL_in_relaxed_month507); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_APRIL.add(APRIL38);

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:66:11: ( DOT )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==DOT) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:66:11: DOT
                            {
                            DOT39=(Token)match(input,DOT,FOLLOW_DOT_in_relaxed_month509); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_DOT.add(DOT39);


                            }
                            break;

                    }



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
                    // 66:20: -> ^( MONTH_OF_YEAR INT[\"4\"] )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:66:23: ^( MONTH_OF_YEAR INT[\"4\"] )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(MONTH_OF_YEAR, "MONTH_OF_YEAR"), root_1);

                        adaptor.addChild(root_1, (Object)adaptor.create(INT, "4"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:67:5: MAY ( DOT )?
                    {
                    MAY40=(Token)match(input,MAY,FOLLOW_MAY_in_relaxed_month529); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_MAY.add(MAY40);

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:67:9: ( DOT )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==DOT) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:67:9: DOT
                            {
                            DOT41=(Token)match(input,DOT,FOLLOW_DOT_in_relaxed_month531); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_DOT.add(DOT41);


                            }
                            break;

                    }



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
                    // 67:20: -> ^( MONTH_OF_YEAR INT[\"5\"] )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:67:23: ^( MONTH_OF_YEAR INT[\"5\"] )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(MONTH_OF_YEAR, "MONTH_OF_YEAR"), root_1);

                        adaptor.addChild(root_1, (Object)adaptor.create(INT, "5"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 6 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:68:5: JUNE ( DOT )?
                    {
                    JUNE42=(Token)match(input,JUNE,FOLLOW_JUNE_in_relaxed_month553); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_JUNE.add(JUNE42);

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:68:10: ( DOT )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==DOT) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:68:10: DOT
                            {
                            DOT43=(Token)match(input,DOT,FOLLOW_DOT_in_relaxed_month555); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_DOT.add(DOT43);


                            }
                            break;

                    }



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
                    // 68:20: -> ^( MONTH_OF_YEAR INT[\"6\"] )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:68:23: ^( MONTH_OF_YEAR INT[\"6\"] )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(MONTH_OF_YEAR, "MONTH_OF_YEAR"), root_1);

                        adaptor.addChild(root_1, (Object)adaptor.create(INT, "6"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 7 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:69:5: JULY ( DOT )?
                    {
                    JULY44=(Token)match(input,JULY,FOLLOW_JULY_in_relaxed_month576); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_JULY.add(JULY44);

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:69:10: ( DOT )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==DOT) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:69:10: DOT
                            {
                            DOT45=(Token)match(input,DOT,FOLLOW_DOT_in_relaxed_month578); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_DOT.add(DOT45);


                            }
                            break;

                    }



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
                    // 69:20: -> ^( MONTH_OF_YEAR INT[\"7\"] )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:69:23: ^( MONTH_OF_YEAR INT[\"7\"] )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(MONTH_OF_YEAR, "MONTH_OF_YEAR"), root_1);

                        adaptor.addChild(root_1, (Object)adaptor.create(INT, "7"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 8 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:70:5: AUGUST ( DOT )?
                    {
                    AUGUST46=(Token)match(input,AUGUST,FOLLOW_AUGUST_in_relaxed_month599); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AUGUST.add(AUGUST46);

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:70:12: ( DOT )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==DOT) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:70:12: DOT
                            {
                            DOT47=(Token)match(input,DOT,FOLLOW_DOT_in_relaxed_month601); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_DOT.add(DOT47);


                            }
                            break;

                    }



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
                    // 70:20: -> ^( MONTH_OF_YEAR INT[\"8\"] )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:70:23: ^( MONTH_OF_YEAR INT[\"8\"] )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(MONTH_OF_YEAR, "MONTH_OF_YEAR"), root_1);

                        adaptor.addChild(root_1, (Object)adaptor.create(INT, "8"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 9 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:71:5: SEPTEMBER ( DOT )?
                    {
                    SEPTEMBER48=(Token)match(input,SEPTEMBER,FOLLOW_SEPTEMBER_in_relaxed_month620); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEPTEMBER.add(SEPTEMBER48);

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:71:15: ( DOT )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==DOT) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:71:15: DOT
                            {
                            DOT49=(Token)match(input,DOT,FOLLOW_DOT_in_relaxed_month622); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_DOT.add(DOT49);


                            }
                            break;

                    }



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
                    // 71:20: -> ^( MONTH_OF_YEAR INT[\"9\"] )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:71:23: ^( MONTH_OF_YEAR INT[\"9\"] )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(MONTH_OF_YEAR, "MONTH_OF_YEAR"), root_1);

                        adaptor.addChild(root_1, (Object)adaptor.create(INT, "9"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 10 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:72:5: OCTOBER ( DOT )?
                    {
                    OCTOBER50=(Token)match(input,OCTOBER,FOLLOW_OCTOBER_in_relaxed_month638); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OCTOBER.add(OCTOBER50);

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:72:13: ( DOT )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==DOT) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:72:13: DOT
                            {
                            DOT51=(Token)match(input,DOT,FOLLOW_DOT_in_relaxed_month640); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_DOT.add(DOT51);


                            }
                            break;

                    }



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
                    // 72:20: -> ^( MONTH_OF_YEAR INT[\"10\"] )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:72:23: ^( MONTH_OF_YEAR INT[\"10\"] )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(MONTH_OF_YEAR, "MONTH_OF_YEAR"), root_1);

                        adaptor.addChild(root_1, (Object)adaptor.create(INT, "10"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 11 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:73:5: NOVEMBER ( DOT )?
                    {
                    NOVEMBER52=(Token)match(input,NOVEMBER,FOLLOW_NOVEMBER_in_relaxed_month658); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NOVEMBER.add(NOVEMBER52);

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:73:14: ( DOT )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==DOT) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:73:14: DOT
                            {
                            DOT53=(Token)match(input,DOT,FOLLOW_DOT_in_relaxed_month660); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_DOT.add(DOT53);


                            }
                            break;

                    }



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
                    // 73:20: -> ^( MONTH_OF_YEAR INT[\"11\"] )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:73:23: ^( MONTH_OF_YEAR INT[\"11\"] )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(MONTH_OF_YEAR, "MONTH_OF_YEAR"), root_1);

                        adaptor.addChild(root_1, (Object)adaptor.create(INT, "11"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 12 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:74:5: DECEMBER ( DOT )?
                    {
                    DECEMBER54=(Token)match(input,DECEMBER,FOLLOW_DECEMBER_in_relaxed_month677); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DECEMBER.add(DECEMBER54);

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:74:14: ( DOT )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==DOT) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:74:14: DOT
                            {
                            DOT55=(Token)match(input,DOT,FOLLOW_DOT_in_relaxed_month679); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_DOT.add(DOT55);


                            }
                            break;

                    }



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
                    // 74:20: -> ^( MONTH_OF_YEAR INT[\"12\"] )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:74:23: ^( MONTH_OF_YEAR INT[\"12\"] )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(MONTH_OF_YEAR, "MONTH_OF_YEAR"), root_1);

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
        return retval;
    }
    // $ANTLR end "relaxed_month"

    public static class relaxed_day_of_month_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "relaxed_day_of_month"
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:77:1: relaxed_day_of_month : ( spelled_or_int_01_to_31_optional_prefix -> ^( DAY_OF_MONTH spelled_or_int_01_to_31_optional_prefix ) | spelled_first_to_thirty_first -> ^( DAY_OF_MONTH spelled_first_to_thirty_first ) );
    public final DateParser.relaxed_day_of_month_return relaxed_day_of_month() throws RecognitionException {
        DateParser.relaxed_day_of_month_return retval = new DateParser.relaxed_day_of_month_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        DateParser.spelled_or_int_01_to_31_optional_prefix_return spelled_or_int_01_to_31_optional_prefix56 = null;

        DateParser.spelled_first_to_thirty_first_return spelled_first_to_thirty_first57 = null;


        RewriteRuleSubtreeStream stream_spelled_first_to_thirty_first=new RewriteRuleSubtreeStream(adaptor,"rule spelled_first_to_thirty_first");
        RewriteRuleSubtreeStream stream_spelled_or_int_01_to_31_optional_prefix=new RewriteRuleSubtreeStream(adaptor,"rule spelled_or_int_01_to_31_optional_prefix");
        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:78:3: ( spelled_or_int_01_to_31_optional_prefix -> ^( DAY_OF_MONTH spelled_or_int_01_to_31_optional_prefix ) | spelled_first_to_thirty_first -> ^( DAY_OF_MONTH spelled_first_to_thirty_first ) )
            int alt23=2;
            switch ( input.LA(1) ) {
            case INT_1_TO_9:
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

                    if ( ((LA23_5>=ONE && LA23_5<=NINE)) ) {
                        alt23=1;
                    }
                    else if ( ((LA23_5>=FIRST && LA23_5<=NINTH)) ) {
                        alt23=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 23, 5, input);

                        throw nvae;
                    }
                    }
                    break;
                case WHITE_SPACE:
                    {
                    int LA23_6 = input.LA(3);

                    if ( ((LA23_6>=FIRST && LA23_6<=NINTH)) ) {
                        alt23=2;
                    }
                    else if ( (LA23_6==AT||(LA23_6>=OF && LA23_6<=JANUARY)||(LA23_6>=FEBRUARY && LA23_6<=SINGLE_QUOTE)||LA23_6==IN||(LA23_6>=INT_0 && LA23_6<=NINE)) ) {
                        alt23=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 23, 6, input);

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

                        throw nvae;
                    }
                    }
                    break;
                case WHITE_SPACE:
                    {
                    int LA23_8 = input.LA(3);

                    if ( (LA23_8==AT||(LA23_8>=OF && LA23_8<=JANUARY)||(LA23_8>=FEBRUARY && LA23_8<=SINGLE_QUOTE)||LA23_8==IN||(LA23_8>=INT_0 && LA23_8<=ONE)) ) {
                        alt23=1;
                    }
                    else if ( (LA23_8==FIRST) ) {
                        alt23=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 23, 8, input);

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

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:78:5: spelled_or_int_01_to_31_optional_prefix
                    {
                    pushFollow(FOLLOW_spelled_or_int_01_to_31_optional_prefix_in_relaxed_day_of_month705);
                    spelled_or_int_01_to_31_optional_prefix56=spelled_or_int_01_to_31_optional_prefix();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_spelled_or_int_01_to_31_optional_prefix.add(spelled_or_int_01_to_31_optional_prefix56.getTree());


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
                    // 78:45: -> ^( DAY_OF_MONTH spelled_or_int_01_to_31_optional_prefix )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:78:48: ^( DAY_OF_MONTH spelled_or_int_01_to_31_optional_prefix )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DAY_OF_MONTH, "DAY_OF_MONTH"), root_1);

                        adaptor.addChild(root_1, stream_spelled_or_int_01_to_31_optional_prefix.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:79:5: spelled_first_to_thirty_first
                    {
                    pushFollow(FOLLOW_spelled_first_to_thirty_first_in_relaxed_day_of_month719);
                    spelled_first_to_thirty_first57=spelled_first_to_thirty_first();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_spelled_first_to_thirty_first.add(spelled_first_to_thirty_first57.getTree());


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
                    // 79:45: -> ^( DAY_OF_MONTH spelled_first_to_thirty_first )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:79:48: ^( DAY_OF_MONTH spelled_first_to_thirty_first )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DAY_OF_MONTH, "DAY_OF_MONTH"), root_1);

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
        return retval;
    }
    // $ANTLR end "relaxed_day_of_month"

    public static class relaxed_year_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "relaxed_year"
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:82:1: relaxed_year : ( relaxed_year_prefix SINGLE_QUOTE int_00_to_99_mandatory_prefix -> ^( YEAR_OF int_00_to_99_mandatory_prefix ) | relaxed_year_prefix int_four_digits -> ^( YEAR_OF int_four_digits ) );
    public final DateParser.relaxed_year_return relaxed_year() throws RecognitionException {
        DateParser.relaxed_year_return retval = new DateParser.relaxed_year_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SINGLE_QUOTE59=null;
        DateParser.relaxed_year_prefix_return relaxed_year_prefix58 = null;

        DateParser.int_00_to_99_mandatory_prefix_return int_00_to_99_mandatory_prefix60 = null;

        DateParser.relaxed_year_prefix_return relaxed_year_prefix61 = null;

        DateParser.int_four_digits_return int_four_digits62 = null;


        Object SINGLE_QUOTE59_tree=null;
        RewriteRuleTokenStream stream_SINGLE_QUOTE=new RewriteRuleTokenStream(adaptor,"token SINGLE_QUOTE");
        RewriteRuleSubtreeStream stream_relaxed_year_prefix=new RewriteRuleSubtreeStream(adaptor,"rule relaxed_year_prefix");
        RewriteRuleSubtreeStream stream_int_four_digits=new RewriteRuleSubtreeStream(adaptor,"rule int_four_digits");
        RewriteRuleSubtreeStream stream_int_00_to_99_mandatory_prefix=new RewriteRuleSubtreeStream(adaptor,"rule int_00_to_99_mandatory_prefix");
        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:83:3: ( relaxed_year_prefix SINGLE_QUOTE int_00_to_99_mandatory_prefix -> ^( YEAR_OF int_00_to_99_mandatory_prefix ) | relaxed_year_prefix int_four_digits -> ^( YEAR_OF int_four_digits ) )
            int alt24=2;
            alt24 = dfa24.predict(input);
            switch (alt24) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:83:5: relaxed_year_prefix SINGLE_QUOTE int_00_to_99_mandatory_prefix
                    {
                    pushFollow(FOLLOW_relaxed_year_prefix_in_relaxed_year753);
                    relaxed_year_prefix58=relaxed_year_prefix();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_relaxed_year_prefix.add(relaxed_year_prefix58.getTree());
                    SINGLE_QUOTE59=(Token)match(input,SINGLE_QUOTE,FOLLOW_SINGLE_QUOTE_in_relaxed_year755); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SINGLE_QUOTE.add(SINGLE_QUOTE59);

                    pushFollow(FOLLOW_int_00_to_99_mandatory_prefix_in_relaxed_year757);
                    int_00_to_99_mandatory_prefix60=int_00_to_99_mandatory_prefix();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_int_00_to_99_mandatory_prefix.add(int_00_to_99_mandatory_prefix60.getTree());


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
                    // 83:68: -> ^( YEAR_OF int_00_to_99_mandatory_prefix )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:83:71: ^( YEAR_OF int_00_to_99_mandatory_prefix )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(YEAR_OF, "YEAR_OF"), root_1);

                        adaptor.addChild(root_1, stream_int_00_to_99_mandatory_prefix.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:84:5: relaxed_year_prefix int_four_digits
                    {
                    pushFollow(FOLLOW_relaxed_year_prefix_in_relaxed_year771);
                    relaxed_year_prefix61=relaxed_year_prefix();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_relaxed_year_prefix.add(relaxed_year_prefix61.getTree());
                    pushFollow(FOLLOW_int_four_digits_in_relaxed_year773);
                    int_four_digits62=int_four_digits();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_int_four_digits.add(int_four_digits62.getTree());


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
                    // 84:68: -> ^( YEAR_OF int_four_digits )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:84:71: ^( YEAR_OF int_four_digits )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(YEAR_OF, "YEAR_OF"), root_1);

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
        return retval;
    }
    // $ANTLR end "relaxed_year"

    public static class relaxed_year_prefix_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "relaxed_year_prefix"
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:87:1: relaxed_year_prefix : ( COMMA ( WHITE_SPACE )? | WHITE_SPACE ) ( IN WHITE_SPACE THE WHITE_SPACE YEAR WHITE_SPACE )? ;
    public final DateParser.relaxed_year_prefix_return relaxed_year_prefix() throws RecognitionException {
        DateParser.relaxed_year_prefix_return retval = new DateParser.relaxed_year_prefix_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token COMMA63=null;
        Token WHITE_SPACE64=null;
        Token WHITE_SPACE65=null;
        Token IN66=null;
        Token WHITE_SPACE67=null;
        Token THE68=null;
        Token WHITE_SPACE69=null;
        Token YEAR70=null;
        Token WHITE_SPACE71=null;

        Object COMMA63_tree=null;
        Object WHITE_SPACE64_tree=null;
        Object WHITE_SPACE65_tree=null;
        Object IN66_tree=null;
        Object WHITE_SPACE67_tree=null;
        Object THE68_tree=null;
        Object WHITE_SPACE69_tree=null;
        Object YEAR70_tree=null;
        Object WHITE_SPACE71_tree=null;

        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:88:3: ( ( COMMA ( WHITE_SPACE )? | WHITE_SPACE ) ( IN WHITE_SPACE THE WHITE_SPACE YEAR WHITE_SPACE )? )
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:88:5: ( COMMA ( WHITE_SPACE )? | WHITE_SPACE ) ( IN WHITE_SPACE THE WHITE_SPACE YEAR WHITE_SPACE )?
            {
            root_0 = (Object)adaptor.nil();

            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:88:5: ( COMMA ( WHITE_SPACE )? | WHITE_SPACE )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==COMMA) ) {
                alt26=1;
            }
            else if ( (LA26_0==WHITE_SPACE) ) {
                alt26=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:88:6: COMMA ( WHITE_SPACE )?
                    {
                    COMMA63=(Token)match(input,COMMA,FOLLOW_COMMA_in_relaxed_year_prefix824); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    COMMA63_tree = (Object)adaptor.create(COMMA63);
                    adaptor.addChild(root_0, COMMA63_tree);
                    }
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:88:12: ( WHITE_SPACE )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==WHITE_SPACE) ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:88:12: WHITE_SPACE
                            {
                            WHITE_SPACE64=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_relaxed_year_prefix826); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            WHITE_SPACE64_tree = (Object)adaptor.create(WHITE_SPACE64);
                            adaptor.addChild(root_0, WHITE_SPACE64_tree);
                            }

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:88:27: WHITE_SPACE
                    {
                    WHITE_SPACE65=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_relaxed_year_prefix831); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    WHITE_SPACE65_tree = (Object)adaptor.create(WHITE_SPACE65);
                    adaptor.addChild(root_0, WHITE_SPACE65_tree);
                    }

                    }
                    break;

            }

            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:88:40: ( IN WHITE_SPACE THE WHITE_SPACE YEAR WHITE_SPACE )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==IN) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:88:41: IN WHITE_SPACE THE WHITE_SPACE YEAR WHITE_SPACE
                    {
                    IN66=(Token)match(input,IN,FOLLOW_IN_in_relaxed_year_prefix835); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IN66_tree = (Object)adaptor.create(IN66);
                    adaptor.addChild(root_0, IN66_tree);
                    }
                    WHITE_SPACE67=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_relaxed_year_prefix837); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    WHITE_SPACE67_tree = (Object)adaptor.create(WHITE_SPACE67);
                    adaptor.addChild(root_0, WHITE_SPACE67_tree);
                    }
                    THE68=(Token)match(input,THE,FOLLOW_THE_in_relaxed_year_prefix839); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    THE68_tree = (Object)adaptor.create(THE68);
                    adaptor.addChild(root_0, THE68_tree);
                    }
                    WHITE_SPACE69=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_relaxed_year_prefix841); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    WHITE_SPACE69_tree = (Object)adaptor.create(WHITE_SPACE69);
                    adaptor.addChild(root_0, WHITE_SPACE69_tree);
                    }
                    YEAR70=(Token)match(input,YEAR,FOLLOW_YEAR_in_relaxed_year_prefix843); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    YEAR70_tree = (Object)adaptor.create(YEAR70);
                    adaptor.addChild(root_0, YEAR70_tree);
                    }
                    WHITE_SPACE71=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_relaxed_year_prefix845); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    WHITE_SPACE71_tree = (Object)adaptor.create(WHITE_SPACE71);
                    adaptor.addChild(root_0, WHITE_SPACE71_tree);
                    }

                    }
                    break;

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
        return retval;
    }
    // $ANTLR end "relaxed_year_prefix"

    public static class formal_date_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "formal_date"
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:93:1: formal_date : ( int_four_digits formal_date_separator formal_month_of_year formal_date_separator formal_day_of_month | formal_month_of_year formal_date_separator formal_day_of_month ( formal_date_separator formal_year )? );
    public final DateParser.formal_date_return formal_date() throws RecognitionException {
        DateParser.formal_date_return retval = new DateParser.formal_date_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        DateParser.int_four_digits_return int_four_digits72 = null;

        DateParser.formal_date_separator_return formal_date_separator73 = null;

        DateParser.formal_month_of_year_return formal_month_of_year74 = null;

        DateParser.formal_date_separator_return formal_date_separator75 = null;

        DateParser.formal_day_of_month_return formal_day_of_month76 = null;

        DateParser.formal_month_of_year_return formal_month_of_year77 = null;

        DateParser.formal_date_separator_return formal_date_separator78 = null;

        DateParser.formal_day_of_month_return formal_day_of_month79 = null;

        DateParser.formal_date_separator_return formal_date_separator80 = null;

        DateParser.formal_year_return formal_year81 = null;



        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:95:3: ( int_four_digits formal_date_separator formal_month_of_year formal_date_separator formal_day_of_month | formal_month_of_year formal_date_separator formal_day_of_month ( formal_date_separator formal_year )? )
            int alt29=2;
            switch ( input.LA(1) ) {
            case INT_00:
            case INT_13_TO_23:
            case INT_24_TO_31:
            case INT_32_TO_59:
            case INT_60_TO_99:
                {
                alt29=1;
                }
                break;
            case INT_01_TO_12:
                {
                int LA29_2 = input.LA(2);

                if ( ((LA29_2>=DASH && LA29_2<=SLASH)) ) {
                    alt29=2;
                }
                else if ( (LA29_2==INT_00||(LA29_2>=INT_01_TO_12 && LA29_2<=INT_60_TO_99)) ) {
                    alt29=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 29, 2, input);

                    throw nvae;
                }
                }
                break;
            case INT_1_TO_9:
                {
                alt29=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:95:5: int_four_digits formal_date_separator formal_month_of_year formal_date_separator formal_day_of_month
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_int_four_digits_in_formal_date869);
                    int_four_digits72=int_four_digits();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, int_four_digits72.getTree());
                    pushFollow(FOLLOW_formal_date_separator_in_formal_date871);
                    formal_date_separator73=formal_date_separator();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, formal_date_separator73.getTree());
                    pushFollow(FOLLOW_formal_month_of_year_in_formal_date873);
                    formal_month_of_year74=formal_month_of_year();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, formal_month_of_year74.getTree());
                    pushFollow(FOLLOW_formal_date_separator_in_formal_date875);
                    formal_date_separator75=formal_date_separator();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, formal_date_separator75.getTree());
                    pushFollow(FOLLOW_formal_day_of_month_in_formal_date877);
                    formal_day_of_month76=formal_day_of_month();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, formal_day_of_month76.getTree());

                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:98:5: formal_month_of_year formal_date_separator formal_day_of_month ( formal_date_separator formal_year )?
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_formal_month_of_year_in_formal_date888);
                    formal_month_of_year77=formal_month_of_year();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, formal_month_of_year77.getTree());
                    pushFollow(FOLLOW_formal_date_separator_in_formal_date890);
                    formal_date_separator78=formal_date_separator();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, formal_date_separator78.getTree());
                    pushFollow(FOLLOW_formal_day_of_month_in_formal_date892);
                    formal_day_of_month79=formal_day_of_month();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, formal_day_of_month79.getTree());
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:98:68: ( formal_date_separator formal_year )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( ((LA28_0>=DASH && LA28_0<=SLASH)) ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:98:69: formal_date_separator formal_year
                            {
                            pushFollow(FOLLOW_formal_date_separator_in_formal_date895);
                            formal_date_separator80=formal_date_separator();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, formal_date_separator80.getTree());
                            pushFollow(FOLLOW_formal_year_in_formal_date897);
                            formal_year81=formal_year();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, formal_year81.getTree());

                            }
                            break;

                    }


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
        return retval;
    }
    // $ANTLR end "formal_date"

    public static class formal_month_of_year_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "formal_month_of_year"
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:101:1: formal_month_of_year : int_01_to_12_optional_prefix -> ^( MONTH_OF_YEAR int_01_to_12_optional_prefix ) ;
    public final DateParser.formal_month_of_year_return formal_month_of_year() throws RecognitionException {
        DateParser.formal_month_of_year_return retval = new DateParser.formal_month_of_year_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        DateParser.int_01_to_12_optional_prefix_return int_01_to_12_optional_prefix82 = null;


        RewriteRuleSubtreeStream stream_int_01_to_12_optional_prefix=new RewriteRuleSubtreeStream(adaptor,"rule int_01_to_12_optional_prefix");
        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:102:3: ( int_01_to_12_optional_prefix -> ^( MONTH_OF_YEAR int_01_to_12_optional_prefix ) )
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:102:5: int_01_to_12_optional_prefix
            {
            pushFollow(FOLLOW_int_01_to_12_optional_prefix_in_formal_month_of_year912);
            int_01_to_12_optional_prefix82=int_01_to_12_optional_prefix();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_int_01_to_12_optional_prefix.add(int_01_to_12_optional_prefix82.getTree());


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
            // 102:34: -> ^( MONTH_OF_YEAR int_01_to_12_optional_prefix )
            {
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:102:37: ^( MONTH_OF_YEAR int_01_to_12_optional_prefix )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(MONTH_OF_YEAR, "MONTH_OF_YEAR"), root_1);

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
        return retval;
    }
    // $ANTLR end "formal_month_of_year"

    public static class formal_day_of_month_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "formal_day_of_month"
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:105:1: formal_day_of_month : int_01_to_31_optional_prefix -> ^( DAY_OF_MONTH int_01_to_31_optional_prefix ) ;
    public final DateParser.formal_day_of_month_return formal_day_of_month() throws RecognitionException {
        DateParser.formal_day_of_month_return retval = new DateParser.formal_day_of_month_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        DateParser.int_01_to_31_optional_prefix_return int_01_to_31_optional_prefix83 = null;


        RewriteRuleSubtreeStream stream_int_01_to_31_optional_prefix=new RewriteRuleSubtreeStream(adaptor,"rule int_01_to_31_optional_prefix");
        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:106:3: ( int_01_to_31_optional_prefix -> ^( DAY_OF_MONTH int_01_to_31_optional_prefix ) )
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:106:5: int_01_to_31_optional_prefix
            {
            pushFollow(FOLLOW_int_01_to_31_optional_prefix_in_formal_day_of_month935);
            int_01_to_31_optional_prefix83=int_01_to_31_optional_prefix();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_int_01_to_31_optional_prefix.add(int_01_to_31_optional_prefix83.getTree());


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
            // 106:34: -> ^( DAY_OF_MONTH int_01_to_31_optional_prefix )
            {
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:106:37: ^( DAY_OF_MONTH int_01_to_31_optional_prefix )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DAY_OF_MONTH, "DAY_OF_MONTH"), root_1);

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
        return retval;
    }
    // $ANTLR end "formal_day_of_month"

    public static class formal_year_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "formal_year"
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:109:1: formal_year : ( int_four_digits -> ^( YEAR_OF int_four_digits ) | int_00_to_99_mandatory_prefix -> ^( YEAR_OF int_00_to_99_mandatory_prefix ) );
    public final DateParser.formal_year_return formal_year() throws RecognitionException {
        DateParser.formal_year_return retval = new DateParser.formal_year_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        DateParser.int_four_digits_return int_four_digits84 = null;

        DateParser.int_00_to_99_mandatory_prefix_return int_00_to_99_mandatory_prefix85 = null;


        RewriteRuleSubtreeStream stream_int_four_digits=new RewriteRuleSubtreeStream(adaptor,"rule int_four_digits");
        RewriteRuleSubtreeStream stream_int_00_to_99_mandatory_prefix=new RewriteRuleSubtreeStream(adaptor,"rule int_00_to_99_mandatory_prefix");
        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:110:3: ( int_four_digits -> ^( YEAR_OF int_four_digits ) | int_00_to_99_mandatory_prefix -> ^( YEAR_OF int_00_to_99_mandatory_prefix ) )
            int alt30=2;
            switch ( input.LA(1) ) {
            case INT_00:
                {
                int LA30_1 = input.LA(2);

                if ( (LA30_1==INT_00||(LA30_1>=INT_01_TO_12 && LA30_1<=INT_60_TO_99)) ) {
                    alt30=1;
                }
                else if ( (LA30_1==EOF||LA30_1==WHITE_SPACE) ) {
                    alt30=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 30, 1, input);

                    throw nvae;
                }
                }
                break;
            case INT_01_TO_12:
                {
                int LA30_2 = input.LA(2);

                if ( (LA30_2==INT_00||(LA30_2>=INT_01_TO_12 && LA30_2<=INT_60_TO_99)) ) {
                    alt30=1;
                }
                else if ( (LA30_2==EOF||LA30_2==WHITE_SPACE) ) {
                    alt30=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 30, 2, input);

                    throw nvae;
                }
                }
                break;
            case INT_13_TO_23:
                {
                int LA30_3 = input.LA(2);

                if ( (LA30_3==EOF||LA30_3==WHITE_SPACE) ) {
                    alt30=2;
                }
                else if ( (LA30_3==INT_00||(LA30_3>=INT_01_TO_12 && LA30_3<=INT_60_TO_99)) ) {
                    alt30=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 30, 3, input);

                    throw nvae;
                }
                }
                break;
            case INT_24_TO_31:
                {
                int LA30_4 = input.LA(2);

                if ( (LA30_4==INT_00||(LA30_4>=INT_01_TO_12 && LA30_4<=INT_60_TO_99)) ) {
                    alt30=1;
                }
                else if ( (LA30_4==EOF||LA30_4==WHITE_SPACE) ) {
                    alt30=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 30, 4, input);

                    throw nvae;
                }
                }
                break;
            case INT_32_TO_59:
                {
                int LA30_5 = input.LA(2);

                if ( (LA30_5==INT_00||(LA30_5>=INT_01_TO_12 && LA30_5<=INT_60_TO_99)) ) {
                    alt30=1;
                }
                else if ( (LA30_5==EOF||LA30_5==WHITE_SPACE) ) {
                    alt30=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 30, 5, input);

                    throw nvae;
                }
                }
                break;
            case INT_60_TO_99:
                {
                int LA30_6 = input.LA(2);

                if ( (LA30_6==INT_00||(LA30_6>=INT_01_TO_12 && LA30_6<=INT_60_TO_99)) ) {
                    alt30=1;
                }
                else if ( (LA30_6==EOF||LA30_6==WHITE_SPACE) ) {
                    alt30=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 30, 6, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:110:5: int_four_digits
                    {
                    pushFollow(FOLLOW_int_four_digits_in_formal_year958);
                    int_four_digits84=int_four_digits();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_int_four_digits.add(int_four_digits84.getTree());


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
                    // 110:35: -> ^( YEAR_OF int_four_digits )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:110:38: ^( YEAR_OF int_four_digits )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(YEAR_OF, "YEAR_OF"), root_1);

                        adaptor.addChild(root_1, stream_int_four_digits.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:111:5: int_00_to_99_mandatory_prefix
                    {
                    pushFollow(FOLLOW_int_00_to_99_mandatory_prefix_in_formal_year986);
                    int_00_to_99_mandatory_prefix85=int_00_to_99_mandatory_prefix();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_int_00_to_99_mandatory_prefix.add(int_00_to_99_mandatory_prefix85.getTree());


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
                    // 111:35: -> ^( YEAR_OF int_00_to_99_mandatory_prefix )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:111:38: ^( YEAR_OF int_00_to_99_mandatory_prefix )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(YEAR_OF, "YEAR_OF"), root_1);

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
        return retval;
    }
    // $ANTLR end "formal_year"

    public static class formal_date_separator_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "formal_date_separator"
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:114:1: formal_date_separator : ( DASH | SLASH );
    public final DateParser.formal_date_separator_return formal_date_separator() throws RecognitionException {
        DateParser.formal_date_separator_return retval = new DateParser.formal_date_separator_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set86=null;

        Object set86_tree=null;

        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:115:3: ( DASH | SLASH )
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:
            {
            root_0 = (Object)adaptor.nil();

            set86=(Token)input.LT(1);
            if ( (input.LA(1)>=DASH && input.LA(1)<=SLASH) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set86));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
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
        return retval;
    }
    // $ANTLR end "formal_date_separator"

    public static class relative_date_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "relative_date"
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:121:1: relative_date : ( named_relative_date | relative_prefix WHITE_SPACE relative_target -> ^( RELATIVE_DATE relative_prefix relative_target ) | spelled_or_int_01_to_31_optional_prefix WHITE_SPACE relative_target WHITE_SPACE relative_suffix -> ^( RELATIVE_DATE relative_suffix spelled_or_int_01_to_31_optional_prefix relative_target ) );
    public final DateParser.relative_date_return relative_date() throws RecognitionException {
        DateParser.relative_date_return retval = new DateParser.relative_date_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token WHITE_SPACE89=null;
        Token WHITE_SPACE92=null;
        Token WHITE_SPACE94=null;
        DateParser.named_relative_date_return named_relative_date87 = null;

        DateParser.relative_prefix_return relative_prefix88 = null;

        DateParser.relative_target_return relative_target90 = null;

        DateParser.spelled_or_int_01_to_31_optional_prefix_return spelled_or_int_01_to_31_optional_prefix91 = null;

        DateParser.relative_target_return relative_target93 = null;

        DateParser.relative_suffix_return relative_suffix95 = null;


        Object WHITE_SPACE89_tree=null;
        Object WHITE_SPACE92_tree=null;
        Object WHITE_SPACE94_tree=null;
        RewriteRuleTokenStream stream_WHITE_SPACE=new RewriteRuleTokenStream(adaptor,"token WHITE_SPACE");
        RewriteRuleSubtreeStream stream_relative_suffix=new RewriteRuleSubtreeStream(adaptor,"rule relative_suffix");
        RewriteRuleSubtreeStream stream_relative_prefix=new RewriteRuleSubtreeStream(adaptor,"rule relative_prefix");
        RewriteRuleSubtreeStream stream_spelled_or_int_01_to_31_optional_prefix=new RewriteRuleSubtreeStream(adaptor,"rule spelled_or_int_01_to_31_optional_prefix");
        RewriteRuleSubtreeStream stream_relative_target=new RewriteRuleSubtreeStream(adaptor,"rule relative_target");
        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:122:3: ( named_relative_date | relative_prefix WHITE_SPACE relative_target -> ^( RELATIVE_DATE relative_prefix relative_target ) | spelled_or_int_01_to_31_optional_prefix WHITE_SPACE relative_target WHITE_SPACE relative_suffix -> ^( RELATIVE_DATE relative_suffix spelled_or_int_01_to_31_optional_prefix relative_target ) )
            int alt31=3;
            alt31 = dfa31.predict(input);
            switch (alt31) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:122:5: named_relative_date
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_named_relative_date_in_relative_date1034);
                    named_relative_date87=named_relative_date();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, named_relative_date87.getTree());

                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:123:5: relative_prefix WHITE_SPACE relative_target
                    {
                    pushFollow(FOLLOW_relative_prefix_in_relative_date1041);
                    relative_prefix88=relative_prefix();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_relative_prefix.add(relative_prefix88.getTree());
                    WHITE_SPACE89=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_relative_date1043); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE89);

                    pushFollow(FOLLOW_relative_target_in_relative_date1045);
                    relative_target90=relative_target();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_relative_target.add(relative_target90.getTree());


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
                    // 124:7: -> ^( RELATIVE_DATE relative_prefix relative_target )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:124:10: ^( RELATIVE_DATE relative_prefix relative_target )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(RELATIVE_DATE, "RELATIVE_DATE"), root_1);

                        adaptor.addChild(root_1, stream_relative_prefix.nextTree());
                        adaptor.addChild(root_1, stream_relative_target.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:125:5: spelled_or_int_01_to_31_optional_prefix WHITE_SPACE relative_target WHITE_SPACE relative_suffix
                    {
                    pushFollow(FOLLOW_spelled_or_int_01_to_31_optional_prefix_in_relative_date1068);
                    spelled_or_int_01_to_31_optional_prefix91=spelled_or_int_01_to_31_optional_prefix();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_spelled_or_int_01_to_31_optional_prefix.add(spelled_or_int_01_to_31_optional_prefix91.getTree());
                    WHITE_SPACE92=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_relative_date1070); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE92);

                    pushFollow(FOLLOW_relative_target_in_relative_date1072);
                    relative_target93=relative_target();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_relative_target.add(relative_target93.getTree());
                    WHITE_SPACE94=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_relative_date1074); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE94);

                    pushFollow(FOLLOW_relative_suffix_in_relative_date1076);
                    relative_suffix95=relative_suffix();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_relative_suffix.add(relative_suffix95.getTree());


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
                    // 126:7: -> ^( RELATIVE_DATE relative_suffix spelled_or_int_01_to_31_optional_prefix relative_target )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:126:10: ^( RELATIVE_DATE relative_suffix spelled_or_int_01_to_31_optional_prefix relative_target )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(RELATIVE_DATE, "RELATIVE_DATE"), root_1);

                        adaptor.addChild(root_1, stream_relative_suffix.nextTree());
                        adaptor.addChild(root_1, stream_spelled_or_int_01_to_31_optional_prefix.nextTree());
                        adaptor.addChild(root_1, stream_relative_target.nextTree());

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
        return retval;
    }
    // $ANTLR end "relative_date"

    public static class relative_date_span_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "relative_date_span"
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:129:1: relative_date_span : ( DAY -> SPAN[\"day\"] | WEEK -> SPAN[\"week\"] | MONTH -> SPAN[\"month\"] | YEAR -> SPAN[\"year\"] );
    public final DateParser.relative_date_span_return relative_date_span() throws RecognitionException {
        DateParser.relative_date_span_return retval = new DateParser.relative_date_span_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DAY96=null;
        Token WEEK97=null;
        Token MONTH98=null;
        Token YEAR99=null;

        Object DAY96_tree=null;
        Object WEEK97_tree=null;
        Object MONTH98_tree=null;
        Object YEAR99_tree=null;
        RewriteRuleTokenStream stream_WEEK=new RewriteRuleTokenStream(adaptor,"token WEEK");
        RewriteRuleTokenStream stream_DAY=new RewriteRuleTokenStream(adaptor,"token DAY");
        RewriteRuleTokenStream stream_YEAR=new RewriteRuleTokenStream(adaptor,"token YEAR");
        RewriteRuleTokenStream stream_MONTH=new RewriteRuleTokenStream(adaptor,"token MONTH");

        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:130:3: ( DAY -> SPAN[\"day\"] | WEEK -> SPAN[\"week\"] | MONTH -> SPAN[\"month\"] | YEAR -> SPAN[\"year\"] )
            int alt32=4;
            switch ( input.LA(1) ) {
            case DAY:
                {
                alt32=1;
                }
                break;
            case WEEK:
                {
                alt32=2;
                }
                break;
            case MONTH:
                {
                alt32=3;
                }
                break;
            case YEAR:
                {
                alt32=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }

            switch (alt32) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:130:5: DAY
                    {
                    DAY96=(Token)match(input,DAY,FOLLOW_DAY_in_relative_date_span1110); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DAY.add(DAY96);



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
                    // 130:11: -> SPAN[\"day\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(SPAN, "day"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:131:5: WEEK
                    {
                    WEEK97=(Token)match(input,WEEK,FOLLOW_WEEK_in_relative_date_span1123); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WEEK.add(WEEK97);



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
                    // 131:11: -> SPAN[\"week\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(SPAN, "week"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:132:5: MONTH
                    {
                    MONTH98=(Token)match(input,MONTH,FOLLOW_MONTH_in_relative_date_span1135); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_MONTH.add(MONTH98);



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
                    // 132:11: -> SPAN[\"month\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(SPAN, "month"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:133:5: YEAR
                    {
                    YEAR99=(Token)match(input,YEAR,FOLLOW_YEAR_in_relative_date_span1146); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_YEAR.add(YEAR99);



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
                    // 133:11: -> SPAN[\"year\"]
                    {
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
        return retval;
    }
    // $ANTLR end "relative_date_span"

    public static class relative_target_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "relative_target"
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:136:1: relative_target : ( day_of_week | relative_date_span );
    public final DateParser.relative_target_return relative_target() throws RecognitionException {
        DateParser.relative_target_return retval = new DateParser.relative_target_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        DateParser.day_of_week_return day_of_week100 = null;

        DateParser.relative_date_span_return relative_date_span101 = null;



        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:137:3: ( day_of_week | relative_date_span )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( ((LA33_0>=SUNDAY && LA33_0<=SATURDAY)) ) {
                alt33=1;
            }
            else if ( (LA33_0==YEAR||(LA33_0>=DAY && LA33_0<=MONTH)) ) {
                alt33=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:137:5: day_of_week
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_day_of_week_in_relative_target1167);
                    day_of_week100=day_of_week();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, day_of_week100.getTree());

                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:138:5: relative_date_span
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_relative_date_span_in_relative_target1174);
                    relative_date_span101=relative_date_span();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, relative_date_span101.getTree());

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
        return retval;
    }
    // $ANTLR end "relative_target"

    public static class relative_prefix_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "relative_prefix"
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:141:1: relative_prefix : ( ( THIS WHITE_SPACE )? LAST -> SEEK_DIRECTION[\"<\"] SEEK_TYPE[\"by_week\"] INT[\"1\"] | ( THIS WHITE_SPACE )? NEXT -> SEEK_DIRECTION[\">\"] SEEK_TYPE[\"by_week\"] INT[\"1\"] | ( THIS WHITE_SPACE )? PAST -> SEEK_DIRECTION[\"<\"] SEEK_TYPE[\"by_day\"] INT[\"1\"] | ( THIS WHITE_SPACE )? COMING -> SEEK_DIRECTION[\">\"] SEEK_TYPE[\"by_day\"] INT[\"1\"] | ( THIS WHITE_SPACE )? UPCOMING -> SEEK_DIRECTION[\">\"] SEEK_TYPE[\"by_day\"] INT[\"1\"] | ( IN WHITE_SPACE )? spelled_or_int_01_to_31_optional_prefix -> SEEK_DIRECTION[\">\"] SEEK_TYPE[\"by_day\"] spelled_or_int_01_to_31_optional_prefix );
    public final DateParser.relative_prefix_return relative_prefix() throws RecognitionException {
        DateParser.relative_prefix_return retval = new DateParser.relative_prefix_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token THIS102=null;
        Token WHITE_SPACE103=null;
        Token LAST104=null;
        Token THIS105=null;
        Token WHITE_SPACE106=null;
        Token NEXT107=null;
        Token THIS108=null;
        Token WHITE_SPACE109=null;
        Token PAST110=null;
        Token THIS111=null;
        Token WHITE_SPACE112=null;
        Token COMING113=null;
        Token THIS114=null;
        Token WHITE_SPACE115=null;
        Token UPCOMING116=null;
        Token IN117=null;
        Token WHITE_SPACE118=null;
        DateParser.spelled_or_int_01_to_31_optional_prefix_return spelled_or_int_01_to_31_optional_prefix119 = null;


        Object THIS102_tree=null;
        Object WHITE_SPACE103_tree=null;
        Object LAST104_tree=null;
        Object THIS105_tree=null;
        Object WHITE_SPACE106_tree=null;
        Object NEXT107_tree=null;
        Object THIS108_tree=null;
        Object WHITE_SPACE109_tree=null;
        Object PAST110_tree=null;
        Object THIS111_tree=null;
        Object WHITE_SPACE112_tree=null;
        Object COMING113_tree=null;
        Object THIS114_tree=null;
        Object WHITE_SPACE115_tree=null;
        Object UPCOMING116_tree=null;
        Object IN117_tree=null;
        Object WHITE_SPACE118_tree=null;
        RewriteRuleTokenStream stream_NEXT=new RewriteRuleTokenStream(adaptor,"token NEXT");
        RewriteRuleTokenStream stream_IN=new RewriteRuleTokenStream(adaptor,"token IN");
        RewriteRuleTokenStream stream_LAST=new RewriteRuleTokenStream(adaptor,"token LAST");
        RewriteRuleTokenStream stream_UPCOMING=new RewriteRuleTokenStream(adaptor,"token UPCOMING");
        RewriteRuleTokenStream stream_WHITE_SPACE=new RewriteRuleTokenStream(adaptor,"token WHITE_SPACE");
        RewriteRuleTokenStream stream_COMING=new RewriteRuleTokenStream(adaptor,"token COMING");
        RewriteRuleTokenStream stream_PAST=new RewriteRuleTokenStream(adaptor,"token PAST");
        RewriteRuleTokenStream stream_THIS=new RewriteRuleTokenStream(adaptor,"token THIS");
        RewriteRuleSubtreeStream stream_spelled_or_int_01_to_31_optional_prefix=new RewriteRuleSubtreeStream(adaptor,"rule spelled_or_int_01_to_31_optional_prefix");
        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:142:3: ( ( THIS WHITE_SPACE )? LAST -> SEEK_DIRECTION[\"<\"] SEEK_TYPE[\"by_week\"] INT[\"1\"] | ( THIS WHITE_SPACE )? NEXT -> SEEK_DIRECTION[\">\"] SEEK_TYPE[\"by_week\"] INT[\"1\"] | ( THIS WHITE_SPACE )? PAST -> SEEK_DIRECTION[\"<\"] SEEK_TYPE[\"by_day\"] INT[\"1\"] | ( THIS WHITE_SPACE )? COMING -> SEEK_DIRECTION[\">\"] SEEK_TYPE[\"by_day\"] INT[\"1\"] | ( THIS WHITE_SPACE )? UPCOMING -> SEEK_DIRECTION[\">\"] SEEK_TYPE[\"by_day\"] INT[\"1\"] | ( IN WHITE_SPACE )? spelled_or_int_01_to_31_optional_prefix -> SEEK_DIRECTION[\">\"] SEEK_TYPE[\"by_day\"] spelled_or_int_01_to_31_optional_prefix )
            int alt40=6;
            switch ( input.LA(1) ) {
            case THIS:
                {
                int LA40_1 = input.LA(2);

                if ( (LA40_1==WHITE_SPACE) ) {
                    switch ( input.LA(3) ) {
                    case UPCOMING:
                        {
                        alt40=5;
                        }
                        break;
                    case PAST:
                        {
                        alt40=3;
                        }
                        break;
                    case NEXT:
                        {
                        alt40=2;
                        }
                        break;
                    case COMING:
                        {
                        alt40=4;
                        }
                        break;
                    case LAST:
                        {
                        alt40=1;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 40, 8, input);

                        throw nvae;
                    }

                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 40, 1, input);

                    throw nvae;
                }
                }
                break;
            case LAST:
                {
                alt40=1;
                }
                break;
            case NEXT:
                {
                alt40=2;
                }
                break;
            case PAST:
                {
                alt40=3;
                }
                break;
            case COMING:
                {
                alt40=4;
                }
                break;
            case UPCOMING:
                {
                alt40=5;
                }
                break;
            case IN:
            case INT_1_TO_9:
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
                alt40=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }

            switch (alt40) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:142:5: ( THIS WHITE_SPACE )? LAST
                    {
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:142:5: ( THIS WHITE_SPACE )?
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( (LA34_0==THIS) ) {
                        alt34=1;
                    }
                    switch (alt34) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:142:6: THIS WHITE_SPACE
                            {
                            THIS102=(Token)match(input,THIS,FOLLOW_THIS_in_relative_prefix1190); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_THIS.add(THIS102);

                            WHITE_SPACE103=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_relative_prefix1192); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE103);


                            }
                            break;

                    }

                    LAST104=(Token)match(input,LAST,FOLLOW_LAST_in_relative_prefix1196); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LAST.add(LAST104);



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
                    // 142:30: -> SEEK_DIRECTION[\"<\"] SEEK_TYPE[\"by_week\"] INT[\"1\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(SEEK_DIRECTION, "<"));
                        adaptor.addChild(root_0, (Object)adaptor.create(SEEK_TYPE, "by_week"));
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "1"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:143:5: ( THIS WHITE_SPACE )? NEXT
                    {
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:143:5: ( THIS WHITE_SPACE )?
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==THIS) ) {
                        alt35=1;
                    }
                    switch (alt35) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:143:6: THIS WHITE_SPACE
                            {
                            THIS105=(Token)match(input,THIS,FOLLOW_THIS_in_relative_prefix1214); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_THIS.add(THIS105);

                            WHITE_SPACE106=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_relative_prefix1216); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE106);


                            }
                            break;

                    }

                    NEXT107=(Token)match(input,NEXT,FOLLOW_NEXT_in_relative_prefix1220); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NEXT.add(NEXT107);



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
                    // 143:34: -> SEEK_DIRECTION[\">\"] SEEK_TYPE[\"by_week\"] INT[\"1\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(SEEK_DIRECTION, ">"));
                        adaptor.addChild(root_0, (Object)adaptor.create(SEEK_TYPE, "by_week"));
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "1"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:144:5: ( THIS WHITE_SPACE )? PAST
                    {
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:144:5: ( THIS WHITE_SPACE )?
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0==THIS) ) {
                        alt36=1;
                    }
                    switch (alt36) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:144:6: THIS WHITE_SPACE
                            {
                            THIS108=(Token)match(input,THIS,FOLLOW_THIS_in_relative_prefix1242); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_THIS.add(THIS108);

                            WHITE_SPACE109=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_relative_prefix1244); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE109);


                            }
                            break;

                    }

                    PAST110=(Token)match(input,PAST,FOLLOW_PAST_in_relative_prefix1248); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PAST.add(PAST110);



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
                    // 144:34: -> SEEK_DIRECTION[\"<\"] SEEK_TYPE[\"by_day\"] INT[\"1\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(SEEK_DIRECTION, "<"));
                        adaptor.addChild(root_0, (Object)adaptor.create(SEEK_TYPE, "by_day"));
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "1"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:145:5: ( THIS WHITE_SPACE )? COMING
                    {
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:145:5: ( THIS WHITE_SPACE )?
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( (LA37_0==THIS) ) {
                        alt37=1;
                    }
                    switch (alt37) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:145:6: THIS WHITE_SPACE
                            {
                            THIS111=(Token)match(input,THIS,FOLLOW_THIS_in_relative_prefix1270); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_THIS.add(THIS111);

                            WHITE_SPACE112=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_relative_prefix1272); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE112);


                            }
                            break;

                    }

                    COMING113=(Token)match(input,COMING,FOLLOW_COMING_in_relative_prefix1276); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COMING.add(COMING113);



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
                    // 145:34: -> SEEK_DIRECTION[\">\"] SEEK_TYPE[\"by_day\"] INT[\"1\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(SEEK_DIRECTION, ">"));
                        adaptor.addChild(root_0, (Object)adaptor.create(SEEK_TYPE, "by_day"));
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "1"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:146:5: ( THIS WHITE_SPACE )? UPCOMING
                    {
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:146:5: ( THIS WHITE_SPACE )?
                    int alt38=2;
                    int LA38_0 = input.LA(1);

                    if ( (LA38_0==THIS) ) {
                        alt38=1;
                    }
                    switch (alt38) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:146:6: THIS WHITE_SPACE
                            {
                            THIS114=(Token)match(input,THIS,FOLLOW_THIS_in_relative_prefix1296); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_THIS.add(THIS114);

                            WHITE_SPACE115=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_relative_prefix1298); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE115);


                            }
                            break;

                    }

                    UPCOMING116=(Token)match(input,UPCOMING,FOLLOW_UPCOMING_in_relative_prefix1302); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_UPCOMING.add(UPCOMING116);



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
                    // 146:34: -> SEEK_DIRECTION[\">\"] SEEK_TYPE[\"by_day\"] INT[\"1\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(SEEK_DIRECTION, ">"));
                        adaptor.addChild(root_0, (Object)adaptor.create(SEEK_TYPE, "by_day"));
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "1"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 6 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:147:5: ( IN WHITE_SPACE )? spelled_or_int_01_to_31_optional_prefix
                    {
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:147:5: ( IN WHITE_SPACE )?
                    int alt39=2;
                    int LA39_0 = input.LA(1);

                    if ( (LA39_0==IN) ) {
                        alt39=1;
                    }
                    switch (alt39) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:147:6: IN WHITE_SPACE
                            {
                            IN117=(Token)match(input,IN,FOLLOW_IN_in_relative_prefix1320); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_IN.add(IN117);

                            WHITE_SPACE118=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_relative_prefix1322); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE118);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_spelled_or_int_01_to_31_optional_prefix_in_relative_prefix1326);
                    spelled_or_int_01_to_31_optional_prefix119=spelled_or_int_01_to_31_optional_prefix();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_spelled_or_int_01_to_31_optional_prefix.add(spelled_or_int_01_to_31_optional_prefix119.getTree());


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
                    // 147:63: -> SEEK_DIRECTION[\">\"] SEEK_TYPE[\"by_day\"] spelled_or_int_01_to_31_optional_prefix
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(SEEK_DIRECTION, ">"));
                        adaptor.addChild(root_0, (Object)adaptor.create(SEEK_TYPE, "by_day"));
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
        return retval;
    }
    // $ANTLR end "relative_prefix"

    public static class relative_suffix_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "relative_suffix"
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:150:1: relative_suffix : ( 'from now' -> SEEK_DIRECTION[\">\"] SEEK_TYPE[\"by_day\"] | 'ago' -> SEEK_DIRECTION[\"<\"] SEEK_TYPE[\"by_day\"] );
    public final DateParser.relative_suffix_return relative_suffix() throws RecognitionException {
        DateParser.relative_suffix_return retval = new DateParser.relative_suffix_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal120=null;
        Token string_literal121=null;

        Object string_literal120_tree=null;
        Object string_literal121_tree=null;
        RewriteRuleTokenStream stream_127=new RewriteRuleTokenStream(adaptor,"token 127");
        RewriteRuleTokenStream stream_128=new RewriteRuleTokenStream(adaptor,"token 128");

        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:151:3: ( 'from now' -> SEEK_DIRECTION[\">\"] SEEK_TYPE[\"by_day\"] | 'ago' -> SEEK_DIRECTION[\"<\"] SEEK_TYPE[\"by_day\"] )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==127) ) {
                alt41=1;
            }
            else if ( (LA41_0==128) ) {
                alt41=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }
            switch (alt41) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:151:5: 'from now'
                    {
                    string_literal120=(Token)match(input,127,FOLLOW_127_in_relative_suffix1351); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_127.add(string_literal120);



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
                    // 151:16: -> SEEK_DIRECTION[\">\"] SEEK_TYPE[\"by_day\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(SEEK_DIRECTION, ">"));
                        adaptor.addChild(root_0, (Object)adaptor.create(SEEK_TYPE, "by_day"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:152:5: 'ago'
                    {
                    string_literal121=(Token)match(input,128,FOLLOW_128_in_relative_suffix1365); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_128.add(string_literal121);



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
                    // 152:16: -> SEEK_DIRECTION[\"<\"] SEEK_TYPE[\"by_day\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(SEEK_DIRECTION, "<"));
                        adaptor.addChild(root_0, (Object)adaptor.create(SEEK_TYPE, "by_day"));

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
        return retval;
    }
    // $ANTLR end "relative_suffix"

    public static class day_of_week_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "day_of_week"
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:155:1: day_of_week : ( SUNDAY -> DAY_OF_WEEK[\"1\"] | MONDAY -> DAY_OF_WEEK[\"2\"] | TUESDAY -> DAY_OF_WEEK[\"3\"] | WEDNESDAY -> DAY_OF_WEEK[\"4\"] | THURSDAY -> DAY_OF_WEEK[\"5\"] | FRIDAY -> DAY_OF_WEEK[\"6\"] | SATURDAY -> DAY_OF_WEEK[\"7\"] );
    public final DateParser.day_of_week_return day_of_week() throws RecognitionException {
        DateParser.day_of_week_return retval = new DateParser.day_of_week_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SUNDAY122=null;
        Token MONDAY123=null;
        Token TUESDAY124=null;
        Token WEDNESDAY125=null;
        Token THURSDAY126=null;
        Token FRIDAY127=null;
        Token SATURDAY128=null;

        Object SUNDAY122_tree=null;
        Object MONDAY123_tree=null;
        Object TUESDAY124_tree=null;
        Object WEDNESDAY125_tree=null;
        Object THURSDAY126_tree=null;
        Object FRIDAY127_tree=null;
        Object SATURDAY128_tree=null;
        RewriteRuleTokenStream stream_MONDAY=new RewriteRuleTokenStream(adaptor,"token MONDAY");
        RewriteRuleTokenStream stream_SUNDAY=new RewriteRuleTokenStream(adaptor,"token SUNDAY");
        RewriteRuleTokenStream stream_WEDNESDAY=new RewriteRuleTokenStream(adaptor,"token WEDNESDAY");
        RewriteRuleTokenStream stream_THURSDAY=new RewriteRuleTokenStream(adaptor,"token THURSDAY");
        RewriteRuleTokenStream stream_SATURDAY=new RewriteRuleTokenStream(adaptor,"token SATURDAY");
        RewriteRuleTokenStream stream_TUESDAY=new RewriteRuleTokenStream(adaptor,"token TUESDAY");
        RewriteRuleTokenStream stream_FRIDAY=new RewriteRuleTokenStream(adaptor,"token FRIDAY");

        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:156:3: ( SUNDAY -> DAY_OF_WEEK[\"1\"] | MONDAY -> DAY_OF_WEEK[\"2\"] | TUESDAY -> DAY_OF_WEEK[\"3\"] | WEDNESDAY -> DAY_OF_WEEK[\"4\"] | THURSDAY -> DAY_OF_WEEK[\"5\"] | FRIDAY -> DAY_OF_WEEK[\"6\"] | SATURDAY -> DAY_OF_WEEK[\"7\"] )
            int alt42=7;
            switch ( input.LA(1) ) {
            case SUNDAY:
                {
                alt42=1;
                }
                break;
            case MONDAY:
                {
                alt42=2;
                }
                break;
            case TUESDAY:
                {
                alt42=3;
                }
                break;
            case WEDNESDAY:
                {
                alt42=4;
                }
                break;
            case THURSDAY:
                {
                alt42=5;
                }
                break;
            case FRIDAY:
                {
                alt42=6;
                }
                break;
            case SATURDAY:
                {
                alt42=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }

            switch (alt42) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:156:5: SUNDAY
                    {
                    SUNDAY122=(Token)match(input,SUNDAY,FOLLOW_SUNDAY_in_day_of_week1392); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SUNDAY.add(SUNDAY122);



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
                    // 156:15: -> DAY_OF_WEEK[\"1\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY_OF_WEEK, "1"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:157:5: MONDAY
                    {
                    MONDAY123=(Token)match(input,MONDAY,FOLLOW_MONDAY_in_day_of_week1406); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_MONDAY.add(MONDAY123);



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
                    // 157:15: -> DAY_OF_WEEK[\"2\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY_OF_WEEK, "2"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:158:5: TUESDAY
                    {
                    TUESDAY124=(Token)match(input,TUESDAY,FOLLOW_TUESDAY_in_day_of_week1420); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TUESDAY.add(TUESDAY124);



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
                    // 158:15: -> DAY_OF_WEEK[\"3\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY_OF_WEEK, "3"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:159:5: WEDNESDAY
                    {
                    WEDNESDAY125=(Token)match(input,WEDNESDAY,FOLLOW_WEDNESDAY_in_day_of_week1433); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WEDNESDAY.add(WEDNESDAY125);



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
                    // 159:15: -> DAY_OF_WEEK[\"4\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY_OF_WEEK, "4"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:160:5: THURSDAY
                    {
                    THURSDAY126=(Token)match(input,THURSDAY,FOLLOW_THURSDAY_in_day_of_week1444); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THURSDAY.add(THURSDAY126);



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
                    // 160:15: -> DAY_OF_WEEK[\"5\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY_OF_WEEK, "5"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 6 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:161:5: FRIDAY
                    {
                    FRIDAY127=(Token)match(input,FRIDAY,FOLLOW_FRIDAY_in_day_of_week1456); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FRIDAY.add(FRIDAY127);



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
                    // 161:15: -> DAY_OF_WEEK[\"6\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY_OF_WEEK, "6"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 7 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:162:5: SATURDAY
                    {
                    SATURDAY128=(Token)match(input,SATURDAY,FOLLOW_SATURDAY_in_day_of_week1470); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SATURDAY.add(SATURDAY128);



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
                    // 162:15: -> DAY_OF_WEEK[\"7\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DAY_OF_WEEK, "7"));

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
        return retval;
    }
    // $ANTLR end "day_of_week"

    public static class named_relative_date_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "named_relative_date"
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:165:1: named_relative_date : ( TODAY -> ^( RELATIVE_DATE SEEK_DIRECTION[\">\"] INT[\"0\"] ) | TOMORROW -> ^( RELATIVE_DATE SEEK_DIRECTION[\">\"] INT[\"1\"] ) | YESTERDAY -> ^( RELATIVE_DATE SEEK_DIRECTION[\"<\"] INT[\"1\"] ) );
    public final DateParser.named_relative_date_return named_relative_date() throws RecognitionException {
        DateParser.named_relative_date_return retval = new DateParser.named_relative_date_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TODAY129=null;
        Token TOMORROW130=null;
        Token YESTERDAY131=null;

        Object TODAY129_tree=null;
        Object TOMORROW130_tree=null;
        Object YESTERDAY131_tree=null;
        RewriteRuleTokenStream stream_TODAY=new RewriteRuleTokenStream(adaptor,"token TODAY");
        RewriteRuleTokenStream stream_YESTERDAY=new RewriteRuleTokenStream(adaptor,"token YESTERDAY");
        RewriteRuleTokenStream stream_TOMORROW=new RewriteRuleTokenStream(adaptor,"token TOMORROW");

        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:166:3: ( TODAY -> ^( RELATIVE_DATE SEEK_DIRECTION[\">\"] INT[\"0\"] ) | TOMORROW -> ^( RELATIVE_DATE SEEK_DIRECTION[\">\"] INT[\"1\"] ) | YESTERDAY -> ^( RELATIVE_DATE SEEK_DIRECTION[\"<\"] INT[\"1\"] ) )
            int alt43=3;
            switch ( input.LA(1) ) {
            case TODAY:
                {
                alt43=1;
                }
                break;
            case TOMORROW:
                {
                alt43=2;
                }
                break;
            case YESTERDAY:
                {
                alt43=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }

            switch (alt43) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:166:5: TODAY
                    {
                    TODAY129=(Token)match(input,TODAY,FOLLOW_TODAY_in_named_relative_date1491); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TODAY.add(TODAY129);



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
                    // 166:15: -> ^( RELATIVE_DATE SEEK_DIRECTION[\">\"] INT[\"0\"] )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:166:18: ^( RELATIVE_DATE SEEK_DIRECTION[\">\"] INT[\"0\"] )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(RELATIVE_DATE, "RELATIVE_DATE"), root_1);

                        adaptor.addChild(root_1, (Object)adaptor.create(SEEK_DIRECTION, ">"));
                        adaptor.addChild(root_1, (Object)adaptor.create(INT, "0"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:167:5: TOMORROW
                    {
                    TOMORROW130=(Token)match(input,TOMORROW,FOLLOW_TOMORROW_in_named_relative_date1513); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TOMORROW.add(TOMORROW130);



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
                    // 167:15: -> ^( RELATIVE_DATE SEEK_DIRECTION[\">\"] INT[\"1\"] )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:167:18: ^( RELATIVE_DATE SEEK_DIRECTION[\">\"] INT[\"1\"] )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(RELATIVE_DATE, "RELATIVE_DATE"), root_1);

                        adaptor.addChild(root_1, (Object)adaptor.create(SEEK_DIRECTION, ">"));
                        adaptor.addChild(root_1, (Object)adaptor.create(INT, "1"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:168:5: YESTERDAY
                    {
                    YESTERDAY131=(Token)match(input,YESTERDAY,FOLLOW_YESTERDAY_in_named_relative_date1532); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_YESTERDAY.add(YESTERDAY131);



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
                    // 168:15: -> ^( RELATIVE_DATE SEEK_DIRECTION[\"<\"] INT[\"1\"] )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:168:18: ^( RELATIVE_DATE SEEK_DIRECTION[\"<\"] INT[\"1\"] )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(RELATIVE_DATE, "RELATIVE_DATE"), root_1);

                        adaptor.addChild(root_1, (Object)adaptor.create(SEEK_DIRECTION, "<"));
                        adaptor.addChild(root_1, (Object)adaptor.create(INT, "1"));

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
        return retval;
    }
    // $ANTLR end "named_relative_date"

    public static class time_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "time"
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:174:1: time : ( hours ( COLON )? minutes ( ( WHITE_SPACE )? ( meridian_indicator | ( MILITARY_HOUR_SUFFIX | HOUR ) ) )? -> ^( EXPLICIT_TIME hours minutes ( meridian_indicator )? ) | hours ( WHITE_SPACE )? ( meridian_indicator )? -> ^( EXPLICIT_TIME hours ^( MINUTES_OF_HOUR INT[\"0\"] ) ( meridian_indicator )? ) );
    public final DateParser.time_return time() throws RecognitionException {
        DateParser.time_return retval = new DateParser.time_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token COLON133=null;
        Token WHITE_SPACE135=null;
        Token MILITARY_HOUR_SUFFIX137=null;
        Token HOUR138=null;
        Token WHITE_SPACE140=null;
        DateParser.hours_return hours132 = null;

        DateParser.minutes_return minutes134 = null;

        DateParser.meridian_indicator_return meridian_indicator136 = null;

        DateParser.hours_return hours139 = null;

        DateParser.meridian_indicator_return meridian_indicator141 = null;


        Object COLON133_tree=null;
        Object WHITE_SPACE135_tree=null;
        Object MILITARY_HOUR_SUFFIX137_tree=null;
        Object HOUR138_tree=null;
        Object WHITE_SPACE140_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_HOUR=new RewriteRuleTokenStream(adaptor,"token HOUR");
        RewriteRuleTokenStream stream_MILITARY_HOUR_SUFFIX=new RewriteRuleTokenStream(adaptor,"token MILITARY_HOUR_SUFFIX");
        RewriteRuleTokenStream stream_WHITE_SPACE=new RewriteRuleTokenStream(adaptor,"token WHITE_SPACE");
        RewriteRuleSubtreeStream stream_meridian_indicator=new RewriteRuleSubtreeStream(adaptor,"rule meridian_indicator");
        RewriteRuleSubtreeStream stream_minutes=new RewriteRuleSubtreeStream(adaptor,"rule minutes");
        RewriteRuleSubtreeStream stream_hours=new RewriteRuleSubtreeStream(adaptor,"rule hours");
        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:175:3: ( hours ( COLON )? minutes ( ( WHITE_SPACE )? ( meridian_indicator | ( MILITARY_HOUR_SUFFIX | HOUR ) ) )? -> ^( EXPLICIT_TIME hours minutes ( meridian_indicator )? ) | hours ( WHITE_SPACE )? ( meridian_indicator )? -> ^( EXPLICIT_TIME hours ^( MINUTES_OF_HOUR INT[\"0\"] ) ( meridian_indicator )? ) )
            int alt51=2;
            switch ( input.LA(1) ) {
            case INT_0:
                {
                int LA51_1 = input.LA(2);

                if ( (LA51_1==EOF||LA51_1==WHITE_SPACE||(LA51_1>=AM && LA51_1<=PM)) ) {
                    alt51=2;
                }
                else if ( (LA51_1==COLON||LA51_1==INT_00||(LA51_1>=INT_01_TO_12 && LA51_1<=INT_32_TO_59)) ) {
                    alt51=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 51, 1, input);

                    throw nvae;
                }
                }
                break;
            case INT_00:
                {
                int LA51_2 = input.LA(2);

                if ( (LA51_2==COLON||LA51_2==INT_00||(LA51_2>=INT_01_TO_12 && LA51_2<=INT_32_TO_59)) ) {
                    alt51=1;
                }
                else if ( (LA51_2==EOF||LA51_2==WHITE_SPACE||(LA51_2>=AM && LA51_2<=PM)) ) {
                    alt51=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 51, 2, input);

                    throw nvae;
                }
                }
                break;
            case INT_1_TO_9:
                {
                int LA51_3 = input.LA(2);

                if ( (LA51_3==EOF||LA51_3==WHITE_SPACE||(LA51_3>=AM && LA51_3<=PM)) ) {
                    alt51=2;
                }
                else if ( (LA51_3==COLON||LA51_3==INT_00||(LA51_3>=INT_01_TO_12 && LA51_3<=INT_32_TO_59)) ) {
                    alt51=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 51, 3, input);

                    throw nvae;
                }
                }
                break;
            case INT_01_TO_12:
                {
                int LA51_4 = input.LA(2);

                if ( (LA51_4==EOF||LA51_4==WHITE_SPACE||(LA51_4>=AM && LA51_4<=PM)) ) {
                    alt51=2;
                }
                else if ( (LA51_4==COLON||LA51_4==INT_00||(LA51_4>=INT_01_TO_12 && LA51_4<=INT_32_TO_59)) ) {
                    alt51=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 51, 4, input);

                    throw nvae;
                }
                }
                break;
            case INT_13_TO_23:
                {
                int LA51_5 = input.LA(2);

                if ( (LA51_5==EOF||LA51_5==WHITE_SPACE||(LA51_5>=AM && LA51_5<=PM)) ) {
                    alt51=2;
                }
                else if ( (LA51_5==COLON||LA51_5==INT_00||(LA51_5>=INT_01_TO_12 && LA51_5<=INT_32_TO_59)) ) {
                    alt51=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 51, 5, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }

            switch (alt51) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:175:5: hours ( COLON )? minutes ( ( WHITE_SPACE )? ( meridian_indicator | ( MILITARY_HOUR_SUFFIX | HOUR ) ) )?
                    {
                    pushFollow(FOLLOW_hours_in_time1562);
                    hours132=hours();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_hours.add(hours132.getTree());
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:175:11: ( COLON )?
                    int alt44=2;
                    int LA44_0 = input.LA(1);

                    if ( (LA44_0==COLON) ) {
                        alt44=1;
                    }
                    switch (alt44) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:175:11: COLON
                            {
                            COLON133=(Token)match(input,COLON,FOLLOW_COLON_in_time1564); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_COLON.add(COLON133);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_minutes_in_time1567);
                    minutes134=minutes();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_minutes.add(minutes134.getTree());
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:175:26: ( ( WHITE_SPACE )? ( meridian_indicator | ( MILITARY_HOUR_SUFFIX | HOUR ) ) )?
                    int alt48=2;
                    int LA48_0 = input.LA(1);

                    if ( (LA48_0==WHITE_SPACE) ) {
                        int LA48_1 = input.LA(2);

                        if ( ((LA48_1>=MILITARY_HOUR_SUFFIX && LA48_1<=PM)) ) {
                            alt48=1;
                        }
                    }
                    else if ( ((LA48_0>=MILITARY_HOUR_SUFFIX && LA48_0<=PM)) ) {
                        alt48=1;
                    }
                    switch (alt48) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:175:27: ( WHITE_SPACE )? ( meridian_indicator | ( MILITARY_HOUR_SUFFIX | HOUR ) )
                            {
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:175:27: ( WHITE_SPACE )?
                            int alt45=2;
                            int LA45_0 = input.LA(1);

                            if ( (LA45_0==WHITE_SPACE) ) {
                                alt45=1;
                            }
                            switch (alt45) {
                                case 1 :
                                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:175:27: WHITE_SPACE
                                    {
                                    WHITE_SPACE135=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_time1570); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE135);


                                    }
                                    break;

                            }

                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:175:40: ( meridian_indicator | ( MILITARY_HOUR_SUFFIX | HOUR ) )
                            int alt47=2;
                            int LA47_0 = input.LA(1);

                            if ( ((LA47_0>=AM && LA47_0<=PM)) ) {
                                alt47=1;
                            }
                            else if ( ((LA47_0>=MILITARY_HOUR_SUFFIX && LA47_0<=HOUR)) ) {
                                alt47=2;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 47, 0, input);

                                throw nvae;
                            }
                            switch (alt47) {
                                case 1 :
                                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:175:41: meridian_indicator
                                    {
                                    pushFollow(FOLLOW_meridian_indicator_in_time1574);
                                    meridian_indicator136=meridian_indicator();

                                    state._fsp--;
                                    if (state.failed) return retval;
                                    if ( state.backtracking==0 ) stream_meridian_indicator.add(meridian_indicator136.getTree());

                                    }
                                    break;
                                case 2 :
                                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:175:62: ( MILITARY_HOUR_SUFFIX | HOUR )
                                    {
                                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:175:62: ( MILITARY_HOUR_SUFFIX | HOUR )
                                    int alt46=2;
                                    int LA46_0 = input.LA(1);

                                    if ( (LA46_0==MILITARY_HOUR_SUFFIX) ) {
                                        alt46=1;
                                    }
                                    else if ( (LA46_0==HOUR) ) {
                                        alt46=2;
                                    }
                                    else {
                                        if (state.backtracking>0) {state.failed=true; return retval;}
                                        NoViableAltException nvae =
                                            new NoViableAltException("", 46, 0, input);

                                        throw nvae;
                                    }
                                    switch (alt46) {
                                        case 1 :
                                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:175:63: MILITARY_HOUR_SUFFIX
                                            {
                                            MILITARY_HOUR_SUFFIX137=(Token)match(input,MILITARY_HOUR_SUFFIX,FOLLOW_MILITARY_HOUR_SUFFIX_in_time1579); if (state.failed) return retval; 
                                            if ( state.backtracking==0 ) stream_MILITARY_HOUR_SUFFIX.add(MILITARY_HOUR_SUFFIX137);


                                            }
                                            break;
                                        case 2 :
                                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:175:86: HOUR
                                            {
                                            HOUR138=(Token)match(input,HOUR,FOLLOW_HOUR_in_time1583); if (state.failed) return retval; 
                                            if ( state.backtracking==0 ) stream_HOUR.add(HOUR138);


                                            }
                                            break;

                                    }


                                    }
                                    break;

                            }


                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: meridian_indicator, minutes, hours
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 176:7: -> ^( EXPLICIT_TIME hours minutes ( meridian_indicator )? )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:176:10: ^( EXPLICIT_TIME hours minutes ( meridian_indicator )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPLICIT_TIME, "EXPLICIT_TIME"), root_1);

                        adaptor.addChild(root_1, stream_hours.nextTree());
                        adaptor.addChild(root_1, stream_minutes.nextTree());
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:176:40: ( meridian_indicator )?
                        if ( stream_meridian_indicator.hasNext() ) {
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:178:5: hours ( WHITE_SPACE )? ( meridian_indicator )?
                    {
                    pushFollow(FOLLOW_hours_in_time1619);
                    hours139=hours();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_hours.add(hours139.getTree());
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:178:11: ( WHITE_SPACE )?
                    int alt49=2;
                    int LA49_0 = input.LA(1);

                    if ( (LA49_0==WHITE_SPACE) ) {
                        int LA49_1 = input.LA(2);

                        if ( (LA49_1==EOF||LA49_1==WHITE_SPACE||(LA49_1>=AM && LA49_1<=PM)) ) {
                            alt49=1;
                        }
                    }
                    switch (alt49) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:178:11: WHITE_SPACE
                            {
                            WHITE_SPACE140=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_time1621); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE140);


                            }
                            break;

                    }

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:178:24: ( meridian_indicator )?
                    int alt50=2;
                    int LA50_0 = input.LA(1);

                    if ( ((LA50_0>=AM && LA50_0<=PM)) ) {
                        alt50=1;
                    }
                    switch (alt50) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:178:24: meridian_indicator
                            {
                            pushFollow(FOLLOW_meridian_indicator_in_time1624);
                            meridian_indicator141=meridian_indicator();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_meridian_indicator.add(meridian_indicator141.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: meridian_indicator, hours
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 179:7: -> ^( EXPLICIT_TIME hours ^( MINUTES_OF_HOUR INT[\"0\"] ) ( meridian_indicator )? )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:179:10: ^( EXPLICIT_TIME hours ^( MINUTES_OF_HOUR INT[\"0\"] ) ( meridian_indicator )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPLICIT_TIME, "EXPLICIT_TIME"), root_1);

                        adaptor.addChild(root_1, stream_hours.nextTree());
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:179:32: ^( MINUTES_OF_HOUR INT[\"0\"] )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(MINUTES_OF_HOUR, "MINUTES_OF_HOUR"), root_2);

                        adaptor.addChild(root_2, (Object)adaptor.create(INT, "0"));

                        adaptor.addChild(root_1, root_2);
                        }
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:179:60: ( meridian_indicator )?
                        if ( stream_meridian_indicator.hasNext() ) {
                            adaptor.addChild(root_1, stream_meridian_indicator.nextTree());

                        }
                        stream_meridian_indicator.reset();

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
        return retval;
    }
    // $ANTLR end "time"

    public static class hours_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "hours"
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:183:1: hours : int_00_to_23_optional_prefix -> ^( HOURS_OF_DAY int_00_to_23_optional_prefix ) ;
    public final DateParser.hours_return hours() throws RecognitionException {
        DateParser.hours_return retval = new DateParser.hours_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        DateParser.int_00_to_23_optional_prefix_return int_00_to_23_optional_prefix142 = null;


        RewriteRuleSubtreeStream stream_int_00_to_23_optional_prefix=new RewriteRuleSubtreeStream(adaptor,"rule int_00_to_23_optional_prefix");
        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:184:3: ( int_00_to_23_optional_prefix -> ^( HOURS_OF_DAY int_00_to_23_optional_prefix ) )
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:184:5: int_00_to_23_optional_prefix
            {
            pushFollow(FOLLOW_int_00_to_23_optional_prefix_in_hours1664);
            int_00_to_23_optional_prefix142=int_00_to_23_optional_prefix();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_int_00_to_23_optional_prefix.add(int_00_to_23_optional_prefix142.getTree());


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
            // 184:34: -> ^( HOURS_OF_DAY int_00_to_23_optional_prefix )
            {
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:184:37: ^( HOURS_OF_DAY int_00_to_23_optional_prefix )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(HOURS_OF_DAY, "HOURS_OF_DAY"), root_1);

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
        return retval;
    }
    // $ANTLR end "hours"

    public static class minutes_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "minutes"
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:188:1: minutes : int_00_to_59_mandatory_prefix -> ^( MINUTES_OF_HOUR int_00_to_59_mandatory_prefix ) ;
    public final DateParser.minutes_return minutes() throws RecognitionException {
        DateParser.minutes_return retval = new DateParser.minutes_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        DateParser.int_00_to_59_mandatory_prefix_return int_00_to_59_mandatory_prefix143 = null;


        RewriteRuleSubtreeStream stream_int_00_to_59_mandatory_prefix=new RewriteRuleSubtreeStream(adaptor,"rule int_00_to_59_mandatory_prefix");
        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:189:3: ( int_00_to_59_mandatory_prefix -> ^( MINUTES_OF_HOUR int_00_to_59_mandatory_prefix ) )
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:189:5: int_00_to_59_mandatory_prefix
            {
            pushFollow(FOLLOW_int_00_to_59_mandatory_prefix_in_minutes1688);
            int_00_to_59_mandatory_prefix143=int_00_to_59_mandatory_prefix();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_int_00_to_59_mandatory_prefix.add(int_00_to_59_mandatory_prefix143.getTree());


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
            // 189:35: -> ^( MINUTES_OF_HOUR int_00_to_59_mandatory_prefix )
            {
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:189:38: ^( MINUTES_OF_HOUR int_00_to_59_mandatory_prefix )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(MINUTES_OF_HOUR, "MINUTES_OF_HOUR"), root_1);

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
        return retval;
    }
    // $ANTLR end "minutes"

    public static class meridian_indicator_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "meridian_indicator"
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:194:1: meridian_indicator : ( AM -> AM_PM[\"am\"] | PM -> AM_PM[\"pm\"] );
    public final DateParser.meridian_indicator_return meridian_indicator() throws RecognitionException {
        DateParser.meridian_indicator_return retval = new DateParser.meridian_indicator_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token AM144=null;
        Token PM145=null;

        Object AM144_tree=null;
        Object PM145_tree=null;
        RewriteRuleTokenStream stream_PM=new RewriteRuleTokenStream(adaptor,"token PM");
        RewriteRuleTokenStream stream_AM=new RewriteRuleTokenStream(adaptor,"token AM");

        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:195:3: ( AM -> AM_PM[\"am\"] | PM -> AM_PM[\"pm\"] )
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==AM) ) {
                alt52=1;
            }
            else if ( (LA52_0==PM) ) {
                alt52=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }
            switch (alt52) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:195:5: AM
                    {
                    AM144=(Token)match(input,AM,FOLLOW_AM_in_meridian_indicator1715); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AM.add(AM144);



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
                    // 195:8: -> AM_PM[\"am\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(AM_PM, "am"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:196:5: PM
                    {
                    PM145=(Token)match(input,PM,FOLLOW_PM_in_meridian_indicator1726); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PM.add(PM145);



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
                    // 196:8: -> AM_PM[\"pm\"]
                    {
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
        return retval;
    }
    // $ANTLR end "meridian_indicator"

    public static class int_00_to_23_optional_prefix_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "int_00_to_23_optional_prefix"
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:202:1: int_00_to_23_optional_prefix : ( INT_0 | INT_00 | INT_1_TO_9 | INT_01_TO_12 | INT_13_TO_23 ) -> INT[$int_00_to_23_optional_prefix.text] ;
    public final DateParser.int_00_to_23_optional_prefix_return int_00_to_23_optional_prefix() throws RecognitionException {
        DateParser.int_00_to_23_optional_prefix_return retval = new DateParser.int_00_to_23_optional_prefix_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token INT_0146=null;
        Token INT_00147=null;
        Token INT_1_TO_9148=null;
        Token INT_01_TO_12149=null;
        Token INT_13_TO_23150=null;

        Object INT_0146_tree=null;
        Object INT_00147_tree=null;
        Object INT_1_TO_9148_tree=null;
        Object INT_01_TO_12149_tree=null;
        Object INT_13_TO_23150_tree=null;
        RewriteRuleTokenStream stream_INT_13_TO_23=new RewriteRuleTokenStream(adaptor,"token INT_13_TO_23");
        RewriteRuleTokenStream stream_INT_00=new RewriteRuleTokenStream(adaptor,"token INT_00");
        RewriteRuleTokenStream stream_INT_1_TO_9=new RewriteRuleTokenStream(adaptor,"token INT_1_TO_9");
        RewriteRuleTokenStream stream_INT_01_TO_12=new RewriteRuleTokenStream(adaptor,"token INT_01_TO_12");
        RewriteRuleTokenStream stream_INT_0=new RewriteRuleTokenStream(adaptor,"token INT_0");

        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:203:3: ( ( INT_0 | INT_00 | INT_1_TO_9 | INT_01_TO_12 | INT_13_TO_23 ) -> INT[$int_00_to_23_optional_prefix.text] )
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:203:5: ( INT_0 | INT_00 | INT_1_TO_9 | INT_01_TO_12 | INT_13_TO_23 )
            {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:203:5: ( INT_0 | INT_00 | INT_1_TO_9 | INT_01_TO_12 | INT_13_TO_23 )
            int alt53=5;
            switch ( input.LA(1) ) {
            case INT_0:
                {
                alt53=1;
                }
                break;
            case INT_00:
                {
                alt53=2;
                }
                break;
            case INT_1_TO_9:
                {
                alt53=3;
                }
                break;
            case INT_01_TO_12:
                {
                alt53=4;
                }
                break;
            case INT_13_TO_23:
                {
                alt53=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }

            switch (alt53) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:203:6: INT_0
                    {
                    INT_0146=(Token)match(input,INT_0,FOLLOW_INT_0_in_int_00_to_23_optional_prefix1750); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INT_0.add(INT_0146);


                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:204:5: INT_00
                    {
                    INT_00147=(Token)match(input,INT_00,FOLLOW_INT_00_in_int_00_to_23_optional_prefix1756); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INT_00.add(INT_00147);


                    }
                    break;
                case 3 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:205:5: INT_1_TO_9
                    {
                    INT_1_TO_9148=(Token)match(input,INT_1_TO_9,FOLLOW_INT_1_TO_9_in_int_00_to_23_optional_prefix1762); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INT_1_TO_9.add(INT_1_TO_9148);


                    }
                    break;
                case 4 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:206:5: INT_01_TO_12
                    {
                    INT_01_TO_12149=(Token)match(input,INT_01_TO_12,FOLLOW_INT_01_TO_12_in_int_00_to_23_optional_prefix1768); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INT_01_TO_12.add(INT_01_TO_12149);


                    }
                    break;
                case 5 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:207:5: INT_13_TO_23
                    {
                    INT_13_TO_23150=(Token)match(input,INT_13_TO_23,FOLLOW_INT_13_TO_23_in_int_00_to_23_optional_prefix1774); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INT_13_TO_23.add(INT_13_TO_23150);


                    }
                    break;

            }



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
            // 207:19: -> INT[$int_00_to_23_optional_prefix.text]
            {
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
        return retval;
    }
    // $ANTLR end "int_00_to_23_optional_prefix"

    public static class int_00_to_59_mandatory_prefix_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "int_00_to_59_mandatory_prefix"
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:211:1: int_00_to_59_mandatory_prefix : ( INT_00 | INT_01_TO_12 | INT_13_TO_23 | INT_24_TO_31 | INT_32_TO_59 ) -> INT[$int_00_to_59_mandatory_prefix.text] ;
    public final DateParser.int_00_to_59_mandatory_prefix_return int_00_to_59_mandatory_prefix() throws RecognitionException {
        DateParser.int_00_to_59_mandatory_prefix_return retval = new DateParser.int_00_to_59_mandatory_prefix_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token INT_00151=null;
        Token INT_01_TO_12152=null;
        Token INT_13_TO_23153=null;
        Token INT_24_TO_31154=null;
        Token INT_32_TO_59155=null;

        Object INT_00151_tree=null;
        Object INT_01_TO_12152_tree=null;
        Object INT_13_TO_23153_tree=null;
        Object INT_24_TO_31154_tree=null;
        Object INT_32_TO_59155_tree=null;
        RewriteRuleTokenStream stream_INT_24_TO_31=new RewriteRuleTokenStream(adaptor,"token INT_24_TO_31");
        RewriteRuleTokenStream stream_INT_13_TO_23=new RewriteRuleTokenStream(adaptor,"token INT_13_TO_23");
        RewriteRuleTokenStream stream_INT_00=new RewriteRuleTokenStream(adaptor,"token INT_00");
        RewriteRuleTokenStream stream_INT_32_TO_59=new RewriteRuleTokenStream(adaptor,"token INT_32_TO_59");
        RewriteRuleTokenStream stream_INT_01_TO_12=new RewriteRuleTokenStream(adaptor,"token INT_01_TO_12");

        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:212:3: ( ( INT_00 | INT_01_TO_12 | INT_13_TO_23 | INT_24_TO_31 | INT_32_TO_59 ) -> INT[$int_00_to_59_mandatory_prefix.text] )
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:212:5: ( INT_00 | INT_01_TO_12 | INT_13_TO_23 | INT_24_TO_31 | INT_32_TO_59 )
            {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:212:5: ( INT_00 | INT_01_TO_12 | INT_13_TO_23 | INT_24_TO_31 | INT_32_TO_59 )
            int alt54=5;
            switch ( input.LA(1) ) {
            case INT_00:
                {
                alt54=1;
                }
                break;
            case INT_01_TO_12:
                {
                alt54=2;
                }
                break;
            case INT_13_TO_23:
                {
                alt54=3;
                }
                break;
            case INT_24_TO_31:
                {
                alt54=4;
                }
                break;
            case INT_32_TO_59:
                {
                alt54=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;
            }

            switch (alt54) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:212:6: INT_00
                    {
                    INT_00151=(Token)match(input,INT_00,FOLLOW_INT_00_in_int_00_to_59_mandatory_prefix1796); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INT_00.add(INT_00151);


                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:213:5: INT_01_TO_12
                    {
                    INT_01_TO_12152=(Token)match(input,INT_01_TO_12,FOLLOW_INT_01_TO_12_in_int_00_to_59_mandatory_prefix1802); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INT_01_TO_12.add(INT_01_TO_12152);


                    }
                    break;
                case 3 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:214:5: INT_13_TO_23
                    {
                    INT_13_TO_23153=(Token)match(input,INT_13_TO_23,FOLLOW_INT_13_TO_23_in_int_00_to_59_mandatory_prefix1808); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INT_13_TO_23.add(INT_13_TO_23153);


                    }
                    break;
                case 4 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:215:5: INT_24_TO_31
                    {
                    INT_24_TO_31154=(Token)match(input,INT_24_TO_31,FOLLOW_INT_24_TO_31_in_int_00_to_59_mandatory_prefix1814); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INT_24_TO_31.add(INT_24_TO_31154);


                    }
                    break;
                case 5 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:216:5: INT_32_TO_59
                    {
                    INT_32_TO_59155=(Token)match(input,INT_32_TO_59,FOLLOW_INT_32_TO_59_in_int_00_to_59_mandatory_prefix1820); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INT_32_TO_59.add(INT_32_TO_59155);


                    }
                    break;

            }



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
            // 216:19: -> INT[$int_00_to_59_mandatory_prefix.text]
            {
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
        return retval;
    }
    // $ANTLR end "int_00_to_59_mandatory_prefix"

    public static class int_00_to_99_mandatory_prefix_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "int_00_to_99_mandatory_prefix"
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:220:1: int_00_to_99_mandatory_prefix : ( int_00_to_59_mandatory_prefix | INT_60_TO_99 -> INT[$INT_60_TO_99.text] );
    public final DateParser.int_00_to_99_mandatory_prefix_return int_00_to_99_mandatory_prefix() throws RecognitionException {
        DateParser.int_00_to_99_mandatory_prefix_return retval = new DateParser.int_00_to_99_mandatory_prefix_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token INT_60_TO_99157=null;
        DateParser.int_00_to_59_mandatory_prefix_return int_00_to_59_mandatory_prefix156 = null;


        Object INT_60_TO_99157_tree=null;
        RewriteRuleTokenStream stream_INT_60_TO_99=new RewriteRuleTokenStream(adaptor,"token INT_60_TO_99");

        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:221:3: ( int_00_to_59_mandatory_prefix | INT_60_TO_99 -> INT[$INT_60_TO_99.text] )
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==INT_00||(LA55_0>=INT_01_TO_12 && LA55_0<=INT_32_TO_59)) ) {
                alt55=1;
            }
            else if ( (LA55_0==INT_60_TO_99) ) {
                alt55=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;
            }
            switch (alt55) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:221:5: int_00_to_59_mandatory_prefix
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_int_00_to_59_mandatory_prefix_in_int_00_to_99_mandatory_prefix1842);
                    int_00_to_59_mandatory_prefix156=int_00_to_59_mandatory_prefix();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, int_00_to_59_mandatory_prefix156.getTree());

                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:222:5: INT_60_TO_99
                    {
                    INT_60_TO_99157=(Token)match(input,INT_60_TO_99,FOLLOW_INT_60_TO_99_in_int_00_to_99_mandatory_prefix1848); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INT_60_TO_99.add(INT_60_TO_99157);



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
                    // 222:18: -> INT[$INT_60_TO_99.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, (INT_60_TO_99157!=null?INT_60_TO_99157.getText():null)));

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
        return retval;
    }
    // $ANTLR end "int_00_to_99_mandatory_prefix"

    public static class int_01_to_12_optional_prefix_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "int_01_to_12_optional_prefix"
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:226:1: int_01_to_12_optional_prefix : ( INT_1_TO_9 | INT_01_TO_12 ) -> INT[$int_01_to_12_optional_prefix.text] ;
    public final DateParser.int_01_to_12_optional_prefix_return int_01_to_12_optional_prefix() throws RecognitionException {
        DateParser.int_01_to_12_optional_prefix_return retval = new DateParser.int_01_to_12_optional_prefix_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token INT_1_TO_9158=null;
        Token INT_01_TO_12159=null;

        Object INT_1_TO_9158_tree=null;
        Object INT_01_TO_12159_tree=null;
        RewriteRuleTokenStream stream_INT_1_TO_9=new RewriteRuleTokenStream(adaptor,"token INT_1_TO_9");
        RewriteRuleTokenStream stream_INT_01_TO_12=new RewriteRuleTokenStream(adaptor,"token INT_01_TO_12");

        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:227:3: ( ( INT_1_TO_9 | INT_01_TO_12 ) -> INT[$int_01_to_12_optional_prefix.text] )
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:227:5: ( INT_1_TO_9 | INT_01_TO_12 )
            {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:227:5: ( INT_1_TO_9 | INT_01_TO_12 )
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==INT_1_TO_9) ) {
                alt56=1;
            }
            else if ( (LA56_0==INT_01_TO_12) ) {
                alt56=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }
            switch (alt56) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:227:6: INT_1_TO_9
                    {
                    INT_1_TO_9158=(Token)match(input,INT_1_TO_9,FOLLOW_INT_1_TO_9_in_int_01_to_12_optional_prefix1870); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INT_1_TO_9.add(INT_1_TO_9158);


                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:228:5: INT_01_TO_12
                    {
                    INT_01_TO_12159=(Token)match(input,INT_01_TO_12,FOLLOW_INT_01_TO_12_in_int_01_to_12_optional_prefix1876); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INT_01_TO_12.add(INT_01_TO_12159);


                    }
                    break;

            }



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
            // 228:19: -> INT[$int_01_to_12_optional_prefix.text]
            {
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
        return retval;
    }
    // $ANTLR end "int_01_to_12_optional_prefix"

    public static class int_01_to_31_optional_prefix_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "int_01_to_31_optional_prefix"
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:232:1: int_01_to_31_optional_prefix : ( INT_1_TO_9 | INT_01_TO_12 | INT_13_TO_23 | INT_24_TO_31 ) -> INT[$int_01_to_31_optional_prefix.text] ;
    public final DateParser.int_01_to_31_optional_prefix_return int_01_to_31_optional_prefix() throws RecognitionException {
        DateParser.int_01_to_31_optional_prefix_return retval = new DateParser.int_01_to_31_optional_prefix_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token INT_1_TO_9160=null;
        Token INT_01_TO_12161=null;
        Token INT_13_TO_23162=null;
        Token INT_24_TO_31163=null;

        Object INT_1_TO_9160_tree=null;
        Object INT_01_TO_12161_tree=null;
        Object INT_13_TO_23162_tree=null;
        Object INT_24_TO_31163_tree=null;
        RewriteRuleTokenStream stream_INT_24_TO_31=new RewriteRuleTokenStream(adaptor,"token INT_24_TO_31");
        RewriteRuleTokenStream stream_INT_13_TO_23=new RewriteRuleTokenStream(adaptor,"token INT_13_TO_23");
        RewriteRuleTokenStream stream_INT_1_TO_9=new RewriteRuleTokenStream(adaptor,"token INT_1_TO_9");
        RewriteRuleTokenStream stream_INT_01_TO_12=new RewriteRuleTokenStream(adaptor,"token INT_01_TO_12");

        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:233:3: ( ( INT_1_TO_9 | INT_01_TO_12 | INT_13_TO_23 | INT_24_TO_31 ) -> INT[$int_01_to_31_optional_prefix.text] )
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:233:5: ( INT_1_TO_9 | INT_01_TO_12 | INT_13_TO_23 | INT_24_TO_31 )
            {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:233:5: ( INT_1_TO_9 | INT_01_TO_12 | INT_13_TO_23 | INT_24_TO_31 )
            int alt57=4;
            switch ( input.LA(1) ) {
            case INT_1_TO_9:
                {
                alt57=1;
                }
                break;
            case INT_01_TO_12:
                {
                alt57=2;
                }
                break;
            case INT_13_TO_23:
                {
                alt57=3;
                }
                break;
            case INT_24_TO_31:
                {
                alt57=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }

            switch (alt57) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:233:6: INT_1_TO_9
                    {
                    INT_1_TO_9160=(Token)match(input,INT_1_TO_9,FOLLOW_INT_1_TO_9_in_int_01_to_31_optional_prefix1899); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INT_1_TO_9.add(INT_1_TO_9160);


                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:234:5: INT_01_TO_12
                    {
                    INT_01_TO_12161=(Token)match(input,INT_01_TO_12,FOLLOW_INT_01_TO_12_in_int_01_to_31_optional_prefix1905); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INT_01_TO_12.add(INT_01_TO_12161);


                    }
                    break;
                case 3 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:235:5: INT_13_TO_23
                    {
                    INT_13_TO_23162=(Token)match(input,INT_13_TO_23,FOLLOW_INT_13_TO_23_in_int_01_to_31_optional_prefix1911); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INT_13_TO_23.add(INT_13_TO_23162);


                    }
                    break;
                case 4 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:236:5: INT_24_TO_31
                    {
                    INT_24_TO_31163=(Token)match(input,INT_24_TO_31,FOLLOW_INT_24_TO_31_in_int_01_to_31_optional_prefix1917); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INT_24_TO_31.add(INT_24_TO_31163);


                    }
                    break;

            }



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
            // 236:19: -> INT[$int_01_to_31_optional_prefix.text]
            {
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
        return retval;
    }
    // $ANTLR end "int_01_to_31_optional_prefix"

    public static class int_four_digits_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "int_four_digits"
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:240:1: int_four_digits : int_00_to_99_mandatory_prefix int_00_to_99_mandatory_prefix -> INT[$int_four_digits.text] ;
    public final DateParser.int_four_digits_return int_four_digits() throws RecognitionException {
        DateParser.int_four_digits_return retval = new DateParser.int_four_digits_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        DateParser.int_00_to_99_mandatory_prefix_return int_00_to_99_mandatory_prefix164 = null;

        DateParser.int_00_to_99_mandatory_prefix_return int_00_to_99_mandatory_prefix165 = null;


        RewriteRuleSubtreeStream stream_int_00_to_99_mandatory_prefix=new RewriteRuleSubtreeStream(adaptor,"rule int_00_to_99_mandatory_prefix");
        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:241:3: ( int_00_to_99_mandatory_prefix int_00_to_99_mandatory_prefix -> INT[$int_four_digits.text] )
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:241:5: int_00_to_99_mandatory_prefix int_00_to_99_mandatory_prefix
            {
            pushFollow(FOLLOW_int_00_to_99_mandatory_prefix_in_int_four_digits1939);
            int_00_to_99_mandatory_prefix164=int_00_to_99_mandatory_prefix();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_int_00_to_99_mandatory_prefix.add(int_00_to_99_mandatory_prefix164.getTree());
            pushFollow(FOLLOW_int_00_to_99_mandatory_prefix_in_int_four_digits1941);
            int_00_to_99_mandatory_prefix165=int_00_to_99_mandatory_prefix();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_int_00_to_99_mandatory_prefix.add(int_00_to_99_mandatory_prefix165.getTree());


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
            // 242:7: -> INT[$int_four_digits.text]
            {
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
        return retval;
    }
    // $ANTLR end "int_four_digits"

    public static class spelled_or_int_01_to_31_optional_prefix_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "spelled_or_int_01_to_31_optional_prefix"
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:247:1: spelled_or_int_01_to_31_optional_prefix : ( int_01_to_31_optional_prefix | spelled_one_to_thirty_one );
    public final DateParser.spelled_or_int_01_to_31_optional_prefix_return spelled_or_int_01_to_31_optional_prefix() throws RecognitionException {
        DateParser.spelled_or_int_01_to_31_optional_prefix_return retval = new DateParser.spelled_or_int_01_to_31_optional_prefix_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        DateParser.int_01_to_31_optional_prefix_return int_01_to_31_optional_prefix166 = null;

        DateParser.spelled_one_to_thirty_one_return spelled_one_to_thirty_one167 = null;



        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:248:3: ( int_01_to_31_optional_prefix | spelled_one_to_thirty_one )
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( ((LA58_0>=INT_1_TO_9 && LA58_0<=INT_24_TO_31)) ) {
                alt58=1;
            }
            else if ( ((LA58_0>=ONE && LA58_0<=THIRTY)) ) {
                alt58=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;
            }
            switch (alt58) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:248:5: int_01_to_31_optional_prefix
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_int_01_to_31_optional_prefix_in_spelled_or_int_01_to_31_optional_prefix1969);
                    int_01_to_31_optional_prefix166=int_01_to_31_optional_prefix();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, int_01_to_31_optional_prefix166.getTree());

                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:249:5: spelled_one_to_thirty_one
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_spelled_one_to_thirty_one_in_spelled_or_int_01_to_31_optional_prefix1975);
                    spelled_one_to_thirty_one167=spelled_one_to_thirty_one();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, spelled_one_to_thirty_one167.getTree());

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
        return retval;
    }
    // $ANTLR end "spelled_or_int_01_to_31_optional_prefix"

    public static class spelled_one_to_thirty_one_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "spelled_one_to_thirty_one"
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:253:1: spelled_one_to_thirty_one : ( ONE -> INT[\"1\"] | TWO -> INT[\"2\"] | THREE -> INT[\"3\"] | FOUR -> INT[\"4\"] | FIVE -> INT[\"5\"] | SIX -> INT[\"6\"] | SEVEN -> INT[\"7\"] | EIGHT -> INT[\"8\"] | NINE -> INT[\"9\"] | TEN -> INT[\"10\"] | ELEVEN -> INT[\"11\"] | TWELVE -> INT[\"12\"] | THIRTEEN -> INT[\"13\"] | FOURTEEN -> INT[\"14\"] | FIFTEEN -> INT[\"15\"] | SIXTEEN -> INT[\"16\"] | SEVENTEEN -> INT[\"17\"] | EIGHTEEN -> INT[\"18\"] | NINETEEN -> INT[\"19\"] | TWENTY -> INT[\"20\"] | TWENTY ( DASH | WHITE_SPACE )? ONE -> INT[\"21\"] | TWENTY ( DASH | WHITE_SPACE )? TWO -> INT[\"22\"] | TWENTY ( DASH | WHITE_SPACE )? THREE -> INT[\"23\"] | TWENTY ( DASH | WHITE_SPACE )? FOUR -> INT[\"24\"] | TWENTY ( DASH | WHITE_SPACE )? FIVE -> INT[\"25\"] | TWENTY ( DASH | WHITE_SPACE )? SIX -> INT[\"26\"] | TWENTY ( DASH | WHITE_SPACE )? SEVEN -> INT[\"27\"] | TWENTY ( DASH | WHITE_SPACE )? EIGHT -> INT[\"28\"] | TWENTY ( DASH | WHITE_SPACE )? NINE -> INT[\"29\"] | THIRTY -> INT[\"30\"] | THIRTY ( DASH | WHITE_SPACE )? ONE -> INT[\"31\"] );
    public final DateParser.spelled_one_to_thirty_one_return spelled_one_to_thirty_one() throws RecognitionException {
        DateParser.spelled_one_to_thirty_one_return retval = new DateParser.spelled_one_to_thirty_one_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ONE168=null;
        Token TWO169=null;
        Token THREE170=null;
        Token FOUR171=null;
        Token FIVE172=null;
        Token SIX173=null;
        Token SEVEN174=null;
        Token EIGHT175=null;
        Token NINE176=null;
        Token TEN177=null;
        Token ELEVEN178=null;
        Token TWELVE179=null;
        Token THIRTEEN180=null;
        Token FOURTEEN181=null;
        Token FIFTEEN182=null;
        Token SIXTEEN183=null;
        Token SEVENTEEN184=null;
        Token EIGHTEEN185=null;
        Token NINETEEN186=null;
        Token TWENTY187=null;
        Token TWENTY188=null;
        Token DASH189=null;
        Token WHITE_SPACE190=null;
        Token ONE191=null;
        Token TWENTY192=null;
        Token DASH193=null;
        Token WHITE_SPACE194=null;
        Token TWO195=null;
        Token TWENTY196=null;
        Token DASH197=null;
        Token WHITE_SPACE198=null;
        Token THREE199=null;
        Token TWENTY200=null;
        Token DASH201=null;
        Token WHITE_SPACE202=null;
        Token FOUR203=null;
        Token TWENTY204=null;
        Token DASH205=null;
        Token WHITE_SPACE206=null;
        Token FIVE207=null;
        Token TWENTY208=null;
        Token DASH209=null;
        Token WHITE_SPACE210=null;
        Token SIX211=null;
        Token TWENTY212=null;
        Token DASH213=null;
        Token WHITE_SPACE214=null;
        Token SEVEN215=null;
        Token TWENTY216=null;
        Token DASH217=null;
        Token WHITE_SPACE218=null;
        Token EIGHT219=null;
        Token TWENTY220=null;
        Token DASH221=null;
        Token WHITE_SPACE222=null;
        Token NINE223=null;
        Token THIRTY224=null;
        Token THIRTY225=null;
        Token DASH226=null;
        Token WHITE_SPACE227=null;
        Token ONE228=null;

        Object ONE168_tree=null;
        Object TWO169_tree=null;
        Object THREE170_tree=null;
        Object FOUR171_tree=null;
        Object FIVE172_tree=null;
        Object SIX173_tree=null;
        Object SEVEN174_tree=null;
        Object EIGHT175_tree=null;
        Object NINE176_tree=null;
        Object TEN177_tree=null;
        Object ELEVEN178_tree=null;
        Object TWELVE179_tree=null;
        Object THIRTEEN180_tree=null;
        Object FOURTEEN181_tree=null;
        Object FIFTEEN182_tree=null;
        Object SIXTEEN183_tree=null;
        Object SEVENTEEN184_tree=null;
        Object EIGHTEEN185_tree=null;
        Object NINETEEN186_tree=null;
        Object TWENTY187_tree=null;
        Object TWENTY188_tree=null;
        Object DASH189_tree=null;
        Object WHITE_SPACE190_tree=null;
        Object ONE191_tree=null;
        Object TWENTY192_tree=null;
        Object DASH193_tree=null;
        Object WHITE_SPACE194_tree=null;
        Object TWO195_tree=null;
        Object TWENTY196_tree=null;
        Object DASH197_tree=null;
        Object WHITE_SPACE198_tree=null;
        Object THREE199_tree=null;
        Object TWENTY200_tree=null;
        Object DASH201_tree=null;
        Object WHITE_SPACE202_tree=null;
        Object FOUR203_tree=null;
        Object TWENTY204_tree=null;
        Object DASH205_tree=null;
        Object WHITE_SPACE206_tree=null;
        Object FIVE207_tree=null;
        Object TWENTY208_tree=null;
        Object DASH209_tree=null;
        Object WHITE_SPACE210_tree=null;
        Object SIX211_tree=null;
        Object TWENTY212_tree=null;
        Object DASH213_tree=null;
        Object WHITE_SPACE214_tree=null;
        Object SEVEN215_tree=null;
        Object TWENTY216_tree=null;
        Object DASH217_tree=null;
        Object WHITE_SPACE218_tree=null;
        Object EIGHT219_tree=null;
        Object TWENTY220_tree=null;
        Object DASH221_tree=null;
        Object WHITE_SPACE222_tree=null;
        Object NINE223_tree=null;
        Object THIRTY224_tree=null;
        Object THIRTY225_tree=null;
        Object DASH226_tree=null;
        Object WHITE_SPACE227_tree=null;
        Object ONE228_tree=null;
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

        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:254:3: ( ONE -> INT[\"1\"] | TWO -> INT[\"2\"] | THREE -> INT[\"3\"] | FOUR -> INT[\"4\"] | FIVE -> INT[\"5\"] | SIX -> INT[\"6\"] | SEVEN -> INT[\"7\"] | EIGHT -> INT[\"8\"] | NINE -> INT[\"9\"] | TEN -> INT[\"10\"] | ELEVEN -> INT[\"11\"] | TWELVE -> INT[\"12\"] | THIRTEEN -> INT[\"13\"] | FOURTEEN -> INT[\"14\"] | FIFTEEN -> INT[\"15\"] | SIXTEEN -> INT[\"16\"] | SEVENTEEN -> INT[\"17\"] | EIGHTEEN -> INT[\"18\"] | NINETEEN -> INT[\"19\"] | TWENTY -> INT[\"20\"] | TWENTY ( DASH | WHITE_SPACE )? ONE -> INT[\"21\"] | TWENTY ( DASH | WHITE_SPACE )? TWO -> INT[\"22\"] | TWENTY ( DASH | WHITE_SPACE )? THREE -> INT[\"23\"] | TWENTY ( DASH | WHITE_SPACE )? FOUR -> INT[\"24\"] | TWENTY ( DASH | WHITE_SPACE )? FIVE -> INT[\"25\"] | TWENTY ( DASH | WHITE_SPACE )? SIX -> INT[\"26\"] | TWENTY ( DASH | WHITE_SPACE )? SEVEN -> INT[\"27\"] | TWENTY ( DASH | WHITE_SPACE )? EIGHT -> INT[\"28\"] | TWENTY ( DASH | WHITE_SPACE )? NINE -> INT[\"29\"] | THIRTY -> INT[\"30\"] | THIRTY ( DASH | WHITE_SPACE )? ONE -> INT[\"31\"] )
            int alt69=31;
            alt69 = dfa69.predict(input);
            switch (alt69) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:254:5: ONE
                    {
                    ONE168=(Token)match(input,ONE,FOLLOW_ONE_in_spelled_one_to_thirty_one1991); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ONE.add(ONE168);



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
                    // 254:16: -> INT[\"1\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "1"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:255:5: TWO
                    {
                    TWO169=(Token)match(input,TWO,FOLLOW_TWO_in_spelled_one_to_thirty_one2009); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWO.add(TWO169);



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
                    // 255:16: -> INT[\"2\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "2"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:256:5: THREE
                    {
                    THREE170=(Token)match(input,THREE,FOLLOW_THREE_in_spelled_one_to_thirty_one2027); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THREE.add(THREE170);



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
                    // 256:16: -> INT[\"3\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "3"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:257:5: FOUR
                    {
                    FOUR171=(Token)match(input,FOUR,FOLLOW_FOUR_in_spelled_one_to_thirty_one2043); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FOUR.add(FOUR171);



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
                    // 257:16: -> INT[\"4\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "4"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:258:5: FIVE
                    {
                    FIVE172=(Token)match(input,FIVE,FOLLOW_FIVE_in_spelled_one_to_thirty_one2060); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FIVE.add(FIVE172);



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
                    // 258:16: -> INT[\"5\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "5"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 6 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:259:5: SIX
                    {
                    SIX173=(Token)match(input,SIX,FOLLOW_SIX_in_spelled_one_to_thirty_one2077); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SIX.add(SIX173);



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
                    // 259:16: -> INT[\"6\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "6"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 7 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:260:5: SEVEN
                    {
                    SEVEN174=(Token)match(input,SEVEN,FOLLOW_SEVEN_in_spelled_one_to_thirty_one2095); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEVEN.add(SEVEN174);



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
                    // 260:16: -> INT[\"7\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "7"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 8 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:261:5: EIGHT
                    {
                    EIGHT175=(Token)match(input,EIGHT,FOLLOW_EIGHT_in_spelled_one_to_thirty_one2111); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EIGHT.add(EIGHT175);



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
                    // 261:16: -> INT[\"8\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "8"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 9 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:262:5: NINE
                    {
                    NINE176=(Token)match(input,NINE,FOLLOW_NINE_in_spelled_one_to_thirty_one2127); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NINE.add(NINE176);



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
                    // 262:16: -> INT[\"9\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "9"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 10 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:263:5: TEN
                    {
                    TEN177=(Token)match(input,TEN,FOLLOW_TEN_in_spelled_one_to_thirty_one2144); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TEN.add(TEN177);



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
                    // 263:16: -> INT[\"10\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "10"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 11 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:264:5: ELEVEN
                    {
                    ELEVEN178=(Token)match(input,ELEVEN,FOLLOW_ELEVEN_in_spelled_one_to_thirty_one2162); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ELEVEN.add(ELEVEN178);



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
                    // 264:16: -> INT[\"11\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "11"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 12 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:265:5: TWELVE
                    {
                    TWELVE179=(Token)match(input,TWELVE,FOLLOW_TWELVE_in_spelled_one_to_thirty_one2177); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWELVE.add(TWELVE179);



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
                    // 265:16: -> INT[\"12\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "12"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 13 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:266:5: THIRTEEN
                    {
                    THIRTEEN180=(Token)match(input,THIRTEEN,FOLLOW_THIRTEEN_in_spelled_one_to_thirty_one2192); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THIRTEEN.add(THIRTEEN180);



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
                    // 266:16: -> INT[\"13\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "13"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 14 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:267:5: FOURTEEN
                    {
                    FOURTEEN181=(Token)match(input,FOURTEEN,FOLLOW_FOURTEEN_in_spelled_one_to_thirty_one2205); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FOURTEEN.add(FOURTEEN181);



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
                    // 267:16: -> INT[\"14\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "14"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 15 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:268:5: FIFTEEN
                    {
                    FIFTEEN182=(Token)match(input,FIFTEEN,FOLLOW_FIFTEEN_in_spelled_one_to_thirty_one2218); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FIFTEEN.add(FIFTEEN182);



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
                    // 268:16: -> INT[\"15\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "15"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 16 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:269:5: SIXTEEN
                    {
                    SIXTEEN183=(Token)match(input,SIXTEEN,FOLLOW_SIXTEEN_in_spelled_one_to_thirty_one2232); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SIXTEEN.add(SIXTEEN183);



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
                    // 269:16: -> INT[\"16\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "16"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 17 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:270:5: SEVENTEEN
                    {
                    SEVENTEEN184=(Token)match(input,SEVENTEEN,FOLLOW_SEVENTEEN_in_spelled_one_to_thirty_one2246); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEVENTEEN.add(SEVENTEEN184);



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
                    // 270:16: -> INT[\"17\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "17"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 18 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:271:5: EIGHTEEN
                    {
                    EIGHTEEN185=(Token)match(input,EIGHTEEN,FOLLOW_EIGHTEEN_in_spelled_one_to_thirty_one2258); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EIGHTEEN.add(EIGHTEEN185);



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
                    // 271:16: -> INT[\"18\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "18"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 19 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:272:5: NINETEEN
                    {
                    NINETEEN186=(Token)match(input,NINETEEN,FOLLOW_NINETEEN_in_spelled_one_to_thirty_one2271); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NINETEEN.add(NINETEEN186);



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
                    // 272:16: -> INT[\"19\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "19"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 20 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:273:5: TWENTY
                    {
                    TWENTY187=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_one_to_thirty_one2284); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY187);



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
                    // 273:16: -> INT[\"20\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "20"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 21 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:274:5: TWENTY ( DASH | WHITE_SPACE )? ONE
                    {
                    TWENTY188=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_one_to_thirty_one2299); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY188);

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:274:12: ( DASH | WHITE_SPACE )?
                    int alt59=3;
                    int LA59_0 = input.LA(1);

                    if ( (LA59_0==DASH) ) {
                        alt59=1;
                    }
                    else if ( (LA59_0==WHITE_SPACE) ) {
                        alt59=2;
                    }
                    switch (alt59) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:274:13: DASH
                            {
                            DASH189=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_one_to_thirty_one2302); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_DASH.add(DASH189);


                            }
                            break;
                        case 2 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:274:20: WHITE_SPACE
                            {
                            WHITE_SPACE190=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_spelled_one_to_thirty_one2306); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE190);


                            }
                            break;

                    }

                    ONE191=(Token)match(input,ONE,FOLLOW_ONE_in_spelled_one_to_thirty_one2310); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ONE.add(ONE191);



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
                    // 274:40: -> INT[\"21\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "21"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 22 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:275:5: TWENTY ( DASH | WHITE_SPACE )? TWO
                    {
                    TWENTY192=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_one_to_thirty_one2323); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY192);

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:275:12: ( DASH | WHITE_SPACE )?
                    int alt60=3;
                    int LA60_0 = input.LA(1);

                    if ( (LA60_0==DASH) ) {
                        alt60=1;
                    }
                    else if ( (LA60_0==WHITE_SPACE) ) {
                        alt60=2;
                    }
                    switch (alt60) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:275:13: DASH
                            {
                            DASH193=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_one_to_thirty_one2326); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_DASH.add(DASH193);


                            }
                            break;
                        case 2 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:275:20: WHITE_SPACE
                            {
                            WHITE_SPACE194=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_spelled_one_to_thirty_one2330); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE194);


                            }
                            break;

                    }

                    TWO195=(Token)match(input,TWO,FOLLOW_TWO_in_spelled_one_to_thirty_one2334); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWO.add(TWO195);



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
                    // 275:40: -> INT[\"22\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "22"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 23 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:276:5: TWENTY ( DASH | WHITE_SPACE )? THREE
                    {
                    TWENTY196=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_one_to_thirty_one2347); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY196);

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:276:12: ( DASH | WHITE_SPACE )?
                    int alt61=3;
                    int LA61_0 = input.LA(1);

                    if ( (LA61_0==DASH) ) {
                        alt61=1;
                    }
                    else if ( (LA61_0==WHITE_SPACE) ) {
                        alt61=2;
                    }
                    switch (alt61) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:276:13: DASH
                            {
                            DASH197=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_one_to_thirty_one2350); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_DASH.add(DASH197);


                            }
                            break;
                        case 2 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:276:20: WHITE_SPACE
                            {
                            WHITE_SPACE198=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_spelled_one_to_thirty_one2354); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE198);


                            }
                            break;

                    }

                    THREE199=(Token)match(input,THREE,FOLLOW_THREE_in_spelled_one_to_thirty_one2358); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THREE.add(THREE199);



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
                    // 276:40: -> INT[\"23\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "23"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 24 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:277:5: TWENTY ( DASH | WHITE_SPACE )? FOUR
                    {
                    TWENTY200=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_one_to_thirty_one2369); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY200);

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:277:12: ( DASH | WHITE_SPACE )?
                    int alt62=3;
                    int LA62_0 = input.LA(1);

                    if ( (LA62_0==DASH) ) {
                        alt62=1;
                    }
                    else if ( (LA62_0==WHITE_SPACE) ) {
                        alt62=2;
                    }
                    switch (alt62) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:277:13: DASH
                            {
                            DASH201=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_one_to_thirty_one2372); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_DASH.add(DASH201);


                            }
                            break;
                        case 2 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:277:20: WHITE_SPACE
                            {
                            WHITE_SPACE202=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_spelled_one_to_thirty_one2376); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE202);


                            }
                            break;

                    }

                    FOUR203=(Token)match(input,FOUR,FOLLOW_FOUR_in_spelled_one_to_thirty_one2380); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FOUR.add(FOUR203);



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
                    // 277:40: -> INT[\"24\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "24"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 25 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:278:5: TWENTY ( DASH | WHITE_SPACE )? FIVE
                    {
                    TWENTY204=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_one_to_thirty_one2392); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY204);

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:278:12: ( DASH | WHITE_SPACE )?
                    int alt63=3;
                    int LA63_0 = input.LA(1);

                    if ( (LA63_0==DASH) ) {
                        alt63=1;
                    }
                    else if ( (LA63_0==WHITE_SPACE) ) {
                        alt63=2;
                    }
                    switch (alt63) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:278:13: DASH
                            {
                            DASH205=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_one_to_thirty_one2395); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_DASH.add(DASH205);


                            }
                            break;
                        case 2 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:278:20: WHITE_SPACE
                            {
                            WHITE_SPACE206=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_spelled_one_to_thirty_one2399); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE206);


                            }
                            break;

                    }

                    FIVE207=(Token)match(input,FIVE,FOLLOW_FIVE_in_spelled_one_to_thirty_one2403); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FIVE.add(FIVE207);



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
                    // 278:40: -> INT[\"25\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "25"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 26 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:279:5: TWENTY ( DASH | WHITE_SPACE )? SIX
                    {
                    TWENTY208=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_one_to_thirty_one2415); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY208);

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:279:12: ( DASH | WHITE_SPACE )?
                    int alt64=3;
                    int LA64_0 = input.LA(1);

                    if ( (LA64_0==DASH) ) {
                        alt64=1;
                    }
                    else if ( (LA64_0==WHITE_SPACE) ) {
                        alt64=2;
                    }
                    switch (alt64) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:279:13: DASH
                            {
                            DASH209=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_one_to_thirty_one2418); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_DASH.add(DASH209);


                            }
                            break;
                        case 2 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:279:20: WHITE_SPACE
                            {
                            WHITE_SPACE210=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_spelled_one_to_thirty_one2422); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE210);


                            }
                            break;

                    }

                    SIX211=(Token)match(input,SIX,FOLLOW_SIX_in_spelled_one_to_thirty_one2426); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SIX.add(SIX211);



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
                    // 279:40: -> INT[\"26\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "26"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 27 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:280:5: TWENTY ( DASH | WHITE_SPACE )? SEVEN
                    {
                    TWENTY212=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_one_to_thirty_one2439); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY212);

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:280:12: ( DASH | WHITE_SPACE )?
                    int alt65=3;
                    int LA65_0 = input.LA(1);

                    if ( (LA65_0==DASH) ) {
                        alt65=1;
                    }
                    else if ( (LA65_0==WHITE_SPACE) ) {
                        alt65=2;
                    }
                    switch (alt65) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:280:13: DASH
                            {
                            DASH213=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_one_to_thirty_one2442); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_DASH.add(DASH213);


                            }
                            break;
                        case 2 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:280:20: WHITE_SPACE
                            {
                            WHITE_SPACE214=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_spelled_one_to_thirty_one2446); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE214);


                            }
                            break;

                    }

                    SEVEN215=(Token)match(input,SEVEN,FOLLOW_SEVEN_in_spelled_one_to_thirty_one2450); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEVEN.add(SEVEN215);



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
                    // 280:40: -> INT[\"27\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "27"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 28 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:281:5: TWENTY ( DASH | WHITE_SPACE )? EIGHT
                    {
                    TWENTY216=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_one_to_thirty_one2461); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY216);

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:281:12: ( DASH | WHITE_SPACE )?
                    int alt66=3;
                    int LA66_0 = input.LA(1);

                    if ( (LA66_0==DASH) ) {
                        alt66=1;
                    }
                    else if ( (LA66_0==WHITE_SPACE) ) {
                        alt66=2;
                    }
                    switch (alt66) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:281:13: DASH
                            {
                            DASH217=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_one_to_thirty_one2464); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_DASH.add(DASH217);


                            }
                            break;
                        case 2 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:281:20: WHITE_SPACE
                            {
                            WHITE_SPACE218=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_spelled_one_to_thirty_one2468); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE218);


                            }
                            break;

                    }

                    EIGHT219=(Token)match(input,EIGHT,FOLLOW_EIGHT_in_spelled_one_to_thirty_one2472); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EIGHT.add(EIGHT219);



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
                    // 281:40: -> INT[\"28\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "28"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 29 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:282:5: TWENTY ( DASH | WHITE_SPACE )? NINE
                    {
                    TWENTY220=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_one_to_thirty_one2483); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY220);

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:282:12: ( DASH | WHITE_SPACE )?
                    int alt67=3;
                    int LA67_0 = input.LA(1);

                    if ( (LA67_0==DASH) ) {
                        alt67=1;
                    }
                    else if ( (LA67_0==WHITE_SPACE) ) {
                        alt67=2;
                    }
                    switch (alt67) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:282:13: DASH
                            {
                            DASH221=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_one_to_thirty_one2486); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_DASH.add(DASH221);


                            }
                            break;
                        case 2 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:282:20: WHITE_SPACE
                            {
                            WHITE_SPACE222=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_spelled_one_to_thirty_one2490); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE222);


                            }
                            break;

                    }

                    NINE223=(Token)match(input,NINE,FOLLOW_NINE_in_spelled_one_to_thirty_one2494); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NINE.add(NINE223);



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
                    // 282:40: -> INT[\"29\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "29"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 30 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:283:5: THIRTY
                    {
                    THIRTY224=(Token)match(input,THIRTY,FOLLOW_THIRTY_in_spelled_one_to_thirty_one2506); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THIRTY.add(THIRTY224);



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
                    // 283:40: -> INT[\"30\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "30"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 31 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:284:5: THIRTY ( DASH | WHITE_SPACE )? ONE
                    {
                    THIRTY225=(Token)match(input,THIRTY,FOLLOW_THIRTY_in_spelled_one_to_thirty_one2545); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THIRTY.add(THIRTY225);

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:284:12: ( DASH | WHITE_SPACE )?
                    int alt68=3;
                    int LA68_0 = input.LA(1);

                    if ( (LA68_0==DASH) ) {
                        alt68=1;
                    }
                    else if ( (LA68_0==WHITE_SPACE) ) {
                        alt68=2;
                    }
                    switch (alt68) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:284:13: DASH
                            {
                            DASH226=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_one_to_thirty_one2548); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_DASH.add(DASH226);


                            }
                            break;
                        case 2 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:284:20: WHITE_SPACE
                            {
                            WHITE_SPACE227=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_spelled_one_to_thirty_one2552); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE227);


                            }
                            break;

                    }

                    ONE228=(Token)match(input,ONE,FOLLOW_ONE_in_spelled_one_to_thirty_one2556); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ONE.add(ONE228);



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
                    // 284:40: -> INT[\"31\"]
                    {
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
        return retval;
    }
    // $ANTLR end "spelled_one_to_thirty_one"

    public static class spelled_first_to_thirty_first_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "spelled_first_to_thirty_first"
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:288:1: spelled_first_to_thirty_first : ( FIRST -> INT[\"1\"] | SECOND -> INT[\"2\"] | THIRD -> INT[\"3\"] | FOURTH -> INT[\"4\"] | FIFTH -> INT[\"5\"] | SIXTH -> INT[\"6\"] | SEVENTH -> INT[\"7\"] | EIGHTH -> INT[\"8\"] | NINTH -> INT[\"9\"] | TENTH -> INT[\"10\"] | ELEVENTH -> INT[\"11\"] | TWELFTH -> INT[\"12\"] | THIRTEENTH -> INT[\"13\"] | FOURTEENTH -> INT[\"14\"] | FIFTEENTH -> INT[\"15\"] | SIXTEENTH -> INT[\"16\"] | SEVENTEENTH -> INT[\"17\"] | EIGHTEENTH -> INT[\"18\"] | NINETEENTH -> INT[\"19\"] | TWENTIETH -> INT[\"20\"] | ( TWENTY_FIRST | ( TWENTY ( DASH | WHITE_SPACE )? FIRST ) ) -> INT[\"21\"] | ( TWENTY_SECOND | ( TWENTY ( DASH | WHITE_SPACE )? SECOND ) ) -> INT[\"22\"] | ( TWENTY_THIRD | ( TWENTY ( DASH | WHITE_SPACE )? THIRD ) ) -> INT[\"23\"] | ( TWENTY_FOURTH | ( TWENTY ( DASH | WHITE_SPACE )? FOURTH ) ) -> INT[\"24\"] | ( TWENTY_FIFTH | ( TWENTY ( DASH | WHITE_SPACE )? FIFTH ) ) -> INT[\"25\"] | ( TWENTY_SIXTH | ( TWENTY ( DASH | WHITE_SPACE )? SIXTH ) ) -> INT[\"26\"] | ( TWENTY_SEVENTH | ( TWENTY ( DASH | WHITE_SPACE )? SEVENTH ) ) -> INT[\"27\"] | ( TWENTY_EIGHTH | ( TWENTY ( DASH | WHITE_SPACE )? EIGHTH ) ) -> INT[\"28\"] | ( TWENTY_NINTH | ( TWENTY ( DASH | WHITE_SPACE )? NINTH ) ) -> INT[\"29\"] | THIRTIETH -> INT[\"30\"] | ( THIRTY_FIRST | ( THIRTY ( DASH | WHITE_SPACE )? FIRST ) ) -> INT[\"31\"] );
    public final DateParser.spelled_first_to_thirty_first_return spelled_first_to_thirty_first() throws RecognitionException {
        DateParser.spelled_first_to_thirty_first_return retval = new DateParser.spelled_first_to_thirty_first_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token FIRST229=null;
        Token SECOND230=null;
        Token THIRD231=null;
        Token FOURTH232=null;
        Token FIFTH233=null;
        Token SIXTH234=null;
        Token SEVENTH235=null;
        Token EIGHTH236=null;
        Token NINTH237=null;
        Token TENTH238=null;
        Token ELEVENTH239=null;
        Token TWELFTH240=null;
        Token THIRTEENTH241=null;
        Token FOURTEENTH242=null;
        Token FIFTEENTH243=null;
        Token SIXTEENTH244=null;
        Token SEVENTEENTH245=null;
        Token EIGHTEENTH246=null;
        Token NINETEENTH247=null;
        Token TWENTIETH248=null;
        Token TWENTY_FIRST249=null;
        Token TWENTY250=null;
        Token DASH251=null;
        Token WHITE_SPACE252=null;
        Token FIRST253=null;
        Token TWENTY_SECOND254=null;
        Token TWENTY255=null;
        Token DASH256=null;
        Token WHITE_SPACE257=null;
        Token SECOND258=null;
        Token TWENTY_THIRD259=null;
        Token TWENTY260=null;
        Token DASH261=null;
        Token WHITE_SPACE262=null;
        Token THIRD263=null;
        Token TWENTY_FOURTH264=null;
        Token TWENTY265=null;
        Token DASH266=null;
        Token WHITE_SPACE267=null;
        Token FOURTH268=null;
        Token TWENTY_FIFTH269=null;
        Token TWENTY270=null;
        Token DASH271=null;
        Token WHITE_SPACE272=null;
        Token FIFTH273=null;
        Token TWENTY_SIXTH274=null;
        Token TWENTY275=null;
        Token DASH276=null;
        Token WHITE_SPACE277=null;
        Token SIXTH278=null;
        Token TWENTY_SEVENTH279=null;
        Token TWENTY280=null;
        Token DASH281=null;
        Token WHITE_SPACE282=null;
        Token SEVENTH283=null;
        Token TWENTY_EIGHTH284=null;
        Token TWENTY285=null;
        Token DASH286=null;
        Token WHITE_SPACE287=null;
        Token EIGHTH288=null;
        Token TWENTY_NINTH289=null;
        Token TWENTY290=null;
        Token DASH291=null;
        Token WHITE_SPACE292=null;
        Token NINTH293=null;
        Token THIRTIETH294=null;
        Token THIRTY_FIRST295=null;
        Token THIRTY296=null;
        Token DASH297=null;
        Token WHITE_SPACE298=null;
        Token FIRST299=null;

        Object FIRST229_tree=null;
        Object SECOND230_tree=null;
        Object THIRD231_tree=null;
        Object FOURTH232_tree=null;
        Object FIFTH233_tree=null;
        Object SIXTH234_tree=null;
        Object SEVENTH235_tree=null;
        Object EIGHTH236_tree=null;
        Object NINTH237_tree=null;
        Object TENTH238_tree=null;
        Object ELEVENTH239_tree=null;
        Object TWELFTH240_tree=null;
        Object THIRTEENTH241_tree=null;
        Object FOURTEENTH242_tree=null;
        Object FIFTEENTH243_tree=null;
        Object SIXTEENTH244_tree=null;
        Object SEVENTEENTH245_tree=null;
        Object EIGHTEENTH246_tree=null;
        Object NINETEENTH247_tree=null;
        Object TWENTIETH248_tree=null;
        Object TWENTY_FIRST249_tree=null;
        Object TWENTY250_tree=null;
        Object DASH251_tree=null;
        Object WHITE_SPACE252_tree=null;
        Object FIRST253_tree=null;
        Object TWENTY_SECOND254_tree=null;
        Object TWENTY255_tree=null;
        Object DASH256_tree=null;
        Object WHITE_SPACE257_tree=null;
        Object SECOND258_tree=null;
        Object TWENTY_THIRD259_tree=null;
        Object TWENTY260_tree=null;
        Object DASH261_tree=null;
        Object WHITE_SPACE262_tree=null;
        Object THIRD263_tree=null;
        Object TWENTY_FOURTH264_tree=null;
        Object TWENTY265_tree=null;
        Object DASH266_tree=null;
        Object WHITE_SPACE267_tree=null;
        Object FOURTH268_tree=null;
        Object TWENTY_FIFTH269_tree=null;
        Object TWENTY270_tree=null;
        Object DASH271_tree=null;
        Object WHITE_SPACE272_tree=null;
        Object FIFTH273_tree=null;
        Object TWENTY_SIXTH274_tree=null;
        Object TWENTY275_tree=null;
        Object DASH276_tree=null;
        Object WHITE_SPACE277_tree=null;
        Object SIXTH278_tree=null;
        Object TWENTY_SEVENTH279_tree=null;
        Object TWENTY280_tree=null;
        Object DASH281_tree=null;
        Object WHITE_SPACE282_tree=null;
        Object SEVENTH283_tree=null;
        Object TWENTY_EIGHTH284_tree=null;
        Object TWENTY285_tree=null;
        Object DASH286_tree=null;
        Object WHITE_SPACE287_tree=null;
        Object EIGHTH288_tree=null;
        Object TWENTY_NINTH289_tree=null;
        Object TWENTY290_tree=null;
        Object DASH291_tree=null;
        Object WHITE_SPACE292_tree=null;
        Object NINTH293_tree=null;
        Object THIRTIETH294_tree=null;
        Object THIRTY_FIRST295_tree=null;
        Object THIRTY296_tree=null;
        Object DASH297_tree=null;
        Object WHITE_SPACE298_tree=null;
        Object FIRST299_tree=null;
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

        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:289:3: ( FIRST -> INT[\"1\"] | SECOND -> INT[\"2\"] | THIRD -> INT[\"3\"] | FOURTH -> INT[\"4\"] | FIFTH -> INT[\"5\"] | SIXTH -> INT[\"6\"] | SEVENTH -> INT[\"7\"] | EIGHTH -> INT[\"8\"] | NINTH -> INT[\"9\"] | TENTH -> INT[\"10\"] | ELEVENTH -> INT[\"11\"] | TWELFTH -> INT[\"12\"] | THIRTEENTH -> INT[\"13\"] | FOURTEENTH -> INT[\"14\"] | FIFTEENTH -> INT[\"15\"] | SIXTEENTH -> INT[\"16\"] | SEVENTEENTH -> INT[\"17\"] | EIGHTEENTH -> INT[\"18\"] | NINETEENTH -> INT[\"19\"] | TWENTIETH -> INT[\"20\"] | ( TWENTY_FIRST | ( TWENTY ( DASH | WHITE_SPACE )? FIRST ) ) -> INT[\"21\"] | ( TWENTY_SECOND | ( TWENTY ( DASH | WHITE_SPACE )? SECOND ) ) -> INT[\"22\"] | ( TWENTY_THIRD | ( TWENTY ( DASH | WHITE_SPACE )? THIRD ) ) -> INT[\"23\"] | ( TWENTY_FOURTH | ( TWENTY ( DASH | WHITE_SPACE )? FOURTH ) ) -> INT[\"24\"] | ( TWENTY_FIFTH | ( TWENTY ( DASH | WHITE_SPACE )? FIFTH ) ) -> INT[\"25\"] | ( TWENTY_SIXTH | ( TWENTY ( DASH | WHITE_SPACE )? SIXTH ) ) -> INT[\"26\"] | ( TWENTY_SEVENTH | ( TWENTY ( DASH | WHITE_SPACE )? SEVENTH ) ) -> INT[\"27\"] | ( TWENTY_EIGHTH | ( TWENTY ( DASH | WHITE_SPACE )? EIGHTH ) ) -> INT[\"28\"] | ( TWENTY_NINTH | ( TWENTY ( DASH | WHITE_SPACE )? NINTH ) ) -> INT[\"29\"] | THIRTIETH -> INT[\"30\"] | ( THIRTY_FIRST | ( THIRTY ( DASH | WHITE_SPACE )? FIRST ) ) -> INT[\"31\"] )
            int alt90=31;
            alt90 = dfa90.predict(input);
            switch (alt90) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:289:5: FIRST
                    {
                    FIRST229=(Token)match(input,FIRST,FOLLOW_FIRST_in_spelled_first_to_thirty_first2579); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FIRST.add(FIRST229);



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
                    // 289:17: -> INT[\"1\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "1"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:290:5: SECOND
                    {
                    SECOND230=(Token)match(input,SECOND,FOLLOW_SECOND_in_spelled_first_to_thirty_first2596); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SECOND.add(SECOND230);



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
                    // 290:17: -> INT[\"2\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "2"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:291:5: THIRD
                    {
                    THIRD231=(Token)match(input,THIRD,FOLLOW_THIRD_in_spelled_first_to_thirty_first2612); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THIRD.add(THIRD231);



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
                    // 291:17: -> INT[\"3\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "3"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:292:5: FOURTH
                    {
                    FOURTH232=(Token)match(input,FOURTH,FOLLOW_FOURTH_in_spelled_first_to_thirty_first2629); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FOURTH.add(FOURTH232);



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
                    // 292:17: -> INT[\"4\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "4"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:293:5: FIFTH
                    {
                    FIFTH233=(Token)match(input,FIFTH,FOLLOW_FIFTH_in_spelled_first_to_thirty_first2645); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FIFTH.add(FIFTH233);



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
                    // 293:17: -> INT[\"5\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "5"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 6 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:294:5: SIXTH
                    {
                    SIXTH234=(Token)match(input,SIXTH,FOLLOW_SIXTH_in_spelled_first_to_thirty_first2662); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SIXTH.add(SIXTH234);



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
                    // 294:17: -> INT[\"6\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "6"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 7 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:295:5: SEVENTH
                    {
                    SEVENTH235=(Token)match(input,SEVENTH,FOLLOW_SEVENTH_in_spelled_first_to_thirty_first2679); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEVENTH.add(SEVENTH235);



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
                    // 295:17: -> INT[\"7\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "7"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 8 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:296:5: EIGHTH
                    {
                    EIGHTH236=(Token)match(input,EIGHTH,FOLLOW_EIGHTH_in_spelled_first_to_thirty_first2694); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EIGHTH.add(EIGHTH236);



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
                    // 296:17: -> INT[\"8\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "8"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 9 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:297:5: NINTH
                    {
                    NINTH237=(Token)match(input,NINTH,FOLLOW_NINTH_in_spelled_first_to_thirty_first2710); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NINTH.add(NINTH237);



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
                    // 297:17: -> INT[\"9\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "9"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 10 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:298:5: TENTH
                    {
                    TENTH238=(Token)match(input,TENTH,FOLLOW_TENTH_in_spelled_first_to_thirty_first2727); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TENTH.add(TENTH238);



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
                    // 298:17: -> INT[\"10\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "10"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 11 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:299:5: ELEVENTH
                    {
                    ELEVENTH239=(Token)match(input,ELEVENTH,FOLLOW_ELEVENTH_in_spelled_first_to_thirty_first2744); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ELEVENTH.add(ELEVENTH239);



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
                    // 299:17: -> INT[\"11\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "11"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 12 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:300:5: TWELFTH
                    {
                    TWELFTH240=(Token)match(input,TWELFTH,FOLLOW_TWELFTH_in_spelled_first_to_thirty_first2758); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWELFTH.add(TWELFTH240);



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
                    // 300:17: -> INT[\"12\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "12"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 13 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:301:5: THIRTEENTH
                    {
                    THIRTEENTH241=(Token)match(input,THIRTEENTH,FOLLOW_THIRTEENTH_in_spelled_first_to_thirty_first2773); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THIRTEENTH.add(THIRTEENTH241);



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
                    // 301:17: -> INT[\"13\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "13"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 14 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:302:5: FOURTEENTH
                    {
                    FOURTEENTH242=(Token)match(input,FOURTEENTH,FOLLOW_FOURTEENTH_in_spelled_first_to_thirty_first2785); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FOURTEENTH.add(FOURTEENTH242);



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
                    // 302:17: -> INT[\"14\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "14"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 15 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:303:5: FIFTEENTH
                    {
                    FIFTEENTH243=(Token)match(input,FIFTEENTH,FOLLOW_FIFTEENTH_in_spelled_first_to_thirty_first2797); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FIFTEENTH.add(FIFTEENTH243);



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
                    // 303:17: -> INT[\"15\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "15"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 16 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:304:5: SIXTEENTH
                    {
                    SIXTEENTH244=(Token)match(input,SIXTEENTH,FOLLOW_SIXTEENTH_in_spelled_first_to_thirty_first2810); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SIXTEENTH.add(SIXTEENTH244);



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
                    // 304:17: -> INT[\"16\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "16"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 17 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:305:5: SEVENTEENTH
                    {
                    SEVENTEENTH245=(Token)match(input,SEVENTEENTH,FOLLOW_SEVENTEENTH_in_spelled_first_to_thirty_first2823); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEVENTEENTH.add(SEVENTEENTH245);



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
                    // 305:17: -> INT[\"17\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "17"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 18 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:306:5: EIGHTEENTH
                    {
                    EIGHTEENTH246=(Token)match(input,EIGHTEENTH,FOLLOW_EIGHTEENTH_in_spelled_first_to_thirty_first2834); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EIGHTEENTH.add(EIGHTEENTH246);



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
                    // 306:17: -> INT[\"18\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "18"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 19 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:307:5: NINETEENTH
                    {
                    NINETEENTH247=(Token)match(input,NINETEENTH,FOLLOW_NINETEENTH_in_spelled_first_to_thirty_first2846); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NINETEENTH.add(NINETEENTH247);



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
                    // 307:17: -> INT[\"19\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "19"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 20 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:308:5: TWENTIETH
                    {
                    TWENTIETH248=(Token)match(input,TWENTIETH,FOLLOW_TWENTIETH_in_spelled_first_to_thirty_first2858); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWENTIETH.add(TWENTIETH248);



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
                    // 308:17: -> INT[\"20\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "20"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 21 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:309:5: ( TWENTY_FIRST | ( TWENTY ( DASH | WHITE_SPACE )? FIRST ) )
                    {
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:309:5: ( TWENTY_FIRST | ( TWENTY ( DASH | WHITE_SPACE )? FIRST ) )
                    int alt71=2;
                    int LA71_0 = input.LA(1);

                    if ( (LA71_0==TWENTY_FIRST) ) {
                        alt71=1;
                    }
                    else if ( (LA71_0==TWENTY) ) {
                        alt71=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 71, 0, input);

                        throw nvae;
                    }
                    switch (alt71) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:309:6: TWENTY_FIRST
                            {
                            TWENTY_FIRST249=(Token)match(input,TWENTY_FIRST,FOLLOW_TWENTY_FIRST_in_spelled_first_to_thirty_first2872); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY_FIRST.add(TWENTY_FIRST249);


                            }
                            break;
                        case 2 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:309:23: ( TWENTY ( DASH | WHITE_SPACE )? FIRST )
                            {
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:309:23: ( TWENTY ( DASH | WHITE_SPACE )? FIRST )
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:309:24: TWENTY ( DASH | WHITE_SPACE )? FIRST
                            {
                            TWENTY250=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_first_to_thirty_first2879); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY250);

                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:309:31: ( DASH | WHITE_SPACE )?
                            int alt70=3;
                            int LA70_0 = input.LA(1);

                            if ( (LA70_0==DASH) ) {
                                alt70=1;
                            }
                            else if ( (LA70_0==WHITE_SPACE) ) {
                                alt70=2;
                            }
                            switch (alt70) {
                                case 1 :
                                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:309:32: DASH
                                    {
                                    DASH251=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_first_to_thirty_first2882); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_DASH.add(DASH251);


                                    }
                                    break;
                                case 2 :
                                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:309:39: WHITE_SPACE
                                    {
                                    WHITE_SPACE252=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_spelled_first_to_thirty_first2886); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE252);


                                    }
                                    break;

                            }

                            FIRST253=(Token)match(input,FIRST,FOLLOW_FIRST_in_spelled_first_to_thirty_first2890); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_FIRST.add(FIRST253);


                            }


                            }
                            break;

                    }



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
                    // 309:63: -> INT[\"21\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "21"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 22 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:310:5: ( TWENTY_SECOND | ( TWENTY ( DASH | WHITE_SPACE )? SECOND ) )
                    {
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:310:5: ( TWENTY_SECOND | ( TWENTY ( DASH | WHITE_SPACE )? SECOND ) )
                    int alt73=2;
                    int LA73_0 = input.LA(1);

                    if ( (LA73_0==TWENTY_SECOND) ) {
                        alt73=1;
                    }
                    else if ( (LA73_0==TWENTY) ) {
                        alt73=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 73, 0, input);

                        throw nvae;
                    }
                    switch (alt73) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:310:6: TWENTY_SECOND
                            {
                            TWENTY_SECOND254=(Token)match(input,TWENTY_SECOND,FOLLOW_TWENTY_SECOND_in_spelled_first_to_thirty_first2906); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY_SECOND.add(TWENTY_SECOND254);


                            }
                            break;
                        case 2 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:310:23: ( TWENTY ( DASH | WHITE_SPACE )? SECOND )
                            {
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:310:23: ( TWENTY ( DASH | WHITE_SPACE )? SECOND )
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:310:24: TWENTY ( DASH | WHITE_SPACE )? SECOND
                            {
                            TWENTY255=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_first_to_thirty_first2912); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY255);

                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:310:31: ( DASH | WHITE_SPACE )?
                            int alt72=3;
                            int LA72_0 = input.LA(1);

                            if ( (LA72_0==DASH) ) {
                                alt72=1;
                            }
                            else if ( (LA72_0==WHITE_SPACE) ) {
                                alt72=2;
                            }
                            switch (alt72) {
                                case 1 :
                                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:310:32: DASH
                                    {
                                    DASH256=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_first_to_thirty_first2915); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_DASH.add(DASH256);


                                    }
                                    break;
                                case 2 :
                                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:310:39: WHITE_SPACE
                                    {
                                    WHITE_SPACE257=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_spelled_first_to_thirty_first2919); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE257);


                                    }
                                    break;

                            }

                            SECOND258=(Token)match(input,SECOND,FOLLOW_SECOND_in_spelled_first_to_thirty_first2923); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_SECOND.add(SECOND258);


                            }


                            }
                            break;

                    }



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
                    // 310:63: -> INT[\"22\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "22"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 23 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:311:5: ( TWENTY_THIRD | ( TWENTY ( DASH | WHITE_SPACE )? THIRD ) )
                    {
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:311:5: ( TWENTY_THIRD | ( TWENTY ( DASH | WHITE_SPACE )? THIRD ) )
                    int alt75=2;
                    int LA75_0 = input.LA(1);

                    if ( (LA75_0==TWENTY_THIRD) ) {
                        alt75=1;
                    }
                    else if ( (LA75_0==TWENTY) ) {
                        alt75=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 75, 0, input);

                        throw nvae;
                    }
                    switch (alt75) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:311:6: TWENTY_THIRD
                            {
                            TWENTY_THIRD259=(Token)match(input,TWENTY_THIRD,FOLLOW_TWENTY_THIRD_in_spelled_first_to_thirty_first2938); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY_THIRD.add(TWENTY_THIRD259);


                            }
                            break;
                        case 2 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:311:23: ( TWENTY ( DASH | WHITE_SPACE )? THIRD )
                            {
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:311:23: ( TWENTY ( DASH | WHITE_SPACE )? THIRD )
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:311:24: TWENTY ( DASH | WHITE_SPACE )? THIRD
                            {
                            TWENTY260=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_first_to_thirty_first2945); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY260);

                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:311:31: ( DASH | WHITE_SPACE )?
                            int alt74=3;
                            int LA74_0 = input.LA(1);

                            if ( (LA74_0==DASH) ) {
                                alt74=1;
                            }
                            else if ( (LA74_0==WHITE_SPACE) ) {
                                alt74=2;
                            }
                            switch (alt74) {
                                case 1 :
                                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:311:32: DASH
                                    {
                                    DASH261=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_first_to_thirty_first2948); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_DASH.add(DASH261);


                                    }
                                    break;
                                case 2 :
                                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:311:39: WHITE_SPACE
                                    {
                                    WHITE_SPACE262=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_spelled_first_to_thirty_first2952); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE262);


                                    }
                                    break;

                            }

                            THIRD263=(Token)match(input,THIRD,FOLLOW_THIRD_in_spelled_first_to_thirty_first2956); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_THIRD.add(THIRD263);


                            }


                            }
                            break;

                    }



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
                    // 311:63: -> INT[\"23\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "23"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 24 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:312:5: ( TWENTY_FOURTH | ( TWENTY ( DASH | WHITE_SPACE )? FOURTH ) )
                    {
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:312:5: ( TWENTY_FOURTH | ( TWENTY ( DASH | WHITE_SPACE )? FOURTH ) )
                    int alt77=2;
                    int LA77_0 = input.LA(1);

                    if ( (LA77_0==TWENTY_FOURTH) ) {
                        alt77=1;
                    }
                    else if ( (LA77_0==TWENTY) ) {
                        alt77=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 77, 0, input);

                        throw nvae;
                    }
                    switch (alt77) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:312:6: TWENTY_FOURTH
                            {
                            TWENTY_FOURTH264=(Token)match(input,TWENTY_FOURTH,FOLLOW_TWENTY_FOURTH_in_spelled_first_to_thirty_first2972); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY_FOURTH.add(TWENTY_FOURTH264);


                            }
                            break;
                        case 2 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:312:23: ( TWENTY ( DASH | WHITE_SPACE )? FOURTH )
                            {
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:312:23: ( TWENTY ( DASH | WHITE_SPACE )? FOURTH )
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:312:24: TWENTY ( DASH | WHITE_SPACE )? FOURTH
                            {
                            TWENTY265=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_first_to_thirty_first2978); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY265);

                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:312:31: ( DASH | WHITE_SPACE )?
                            int alt76=3;
                            int LA76_0 = input.LA(1);

                            if ( (LA76_0==DASH) ) {
                                alt76=1;
                            }
                            else if ( (LA76_0==WHITE_SPACE) ) {
                                alt76=2;
                            }
                            switch (alt76) {
                                case 1 :
                                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:312:32: DASH
                                    {
                                    DASH266=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_first_to_thirty_first2981); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_DASH.add(DASH266);


                                    }
                                    break;
                                case 2 :
                                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:312:39: WHITE_SPACE
                                    {
                                    WHITE_SPACE267=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_spelled_first_to_thirty_first2985); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE267);


                                    }
                                    break;

                            }

                            FOURTH268=(Token)match(input,FOURTH,FOLLOW_FOURTH_in_spelled_first_to_thirty_first2989); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_FOURTH.add(FOURTH268);


                            }


                            }
                            break;

                    }



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
                    // 312:63: -> INT[\"24\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "24"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 25 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:313:5: ( TWENTY_FIFTH | ( TWENTY ( DASH | WHITE_SPACE )? FIFTH ) )
                    {
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:313:5: ( TWENTY_FIFTH | ( TWENTY ( DASH | WHITE_SPACE )? FIFTH ) )
                    int alt79=2;
                    int LA79_0 = input.LA(1);

                    if ( (LA79_0==TWENTY_FIFTH) ) {
                        alt79=1;
                    }
                    else if ( (LA79_0==TWENTY) ) {
                        alt79=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 79, 0, input);

                        throw nvae;
                    }
                    switch (alt79) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:313:6: TWENTY_FIFTH
                            {
                            TWENTY_FIFTH269=(Token)match(input,TWENTY_FIFTH,FOLLOW_TWENTY_FIFTH_in_spelled_first_to_thirty_first3004); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY_FIFTH.add(TWENTY_FIFTH269);


                            }
                            break;
                        case 2 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:313:23: ( TWENTY ( DASH | WHITE_SPACE )? FIFTH )
                            {
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:313:23: ( TWENTY ( DASH | WHITE_SPACE )? FIFTH )
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:313:24: TWENTY ( DASH | WHITE_SPACE )? FIFTH
                            {
                            TWENTY270=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_first_to_thirty_first3011); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY270);

                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:313:31: ( DASH | WHITE_SPACE )?
                            int alt78=3;
                            int LA78_0 = input.LA(1);

                            if ( (LA78_0==DASH) ) {
                                alt78=1;
                            }
                            else if ( (LA78_0==WHITE_SPACE) ) {
                                alt78=2;
                            }
                            switch (alt78) {
                                case 1 :
                                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:313:32: DASH
                                    {
                                    DASH271=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_first_to_thirty_first3014); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_DASH.add(DASH271);


                                    }
                                    break;
                                case 2 :
                                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:313:39: WHITE_SPACE
                                    {
                                    WHITE_SPACE272=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_spelled_first_to_thirty_first3018); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE272);


                                    }
                                    break;

                            }

                            FIFTH273=(Token)match(input,FIFTH,FOLLOW_FIFTH_in_spelled_first_to_thirty_first3022); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_FIFTH.add(FIFTH273);


                            }


                            }
                            break;

                    }



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
                    // 313:63: -> INT[\"25\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "25"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 26 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:314:5: ( TWENTY_SIXTH | ( TWENTY ( DASH | WHITE_SPACE )? SIXTH ) )
                    {
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:314:5: ( TWENTY_SIXTH | ( TWENTY ( DASH | WHITE_SPACE )? SIXTH ) )
                    int alt81=2;
                    int LA81_0 = input.LA(1);

                    if ( (LA81_0==TWENTY_SIXTH) ) {
                        alt81=1;
                    }
                    else if ( (LA81_0==TWENTY) ) {
                        alt81=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 81, 0, input);

                        throw nvae;
                    }
                    switch (alt81) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:314:6: TWENTY_SIXTH
                            {
                            TWENTY_SIXTH274=(Token)match(input,TWENTY_SIXTH,FOLLOW_TWENTY_SIXTH_in_spelled_first_to_thirty_first3038); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY_SIXTH.add(TWENTY_SIXTH274);


                            }
                            break;
                        case 2 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:314:23: ( TWENTY ( DASH | WHITE_SPACE )? SIXTH )
                            {
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:314:23: ( TWENTY ( DASH | WHITE_SPACE )? SIXTH )
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:314:24: TWENTY ( DASH | WHITE_SPACE )? SIXTH
                            {
                            TWENTY275=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_first_to_thirty_first3045); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY275);

                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:314:31: ( DASH | WHITE_SPACE )?
                            int alt80=3;
                            int LA80_0 = input.LA(1);

                            if ( (LA80_0==DASH) ) {
                                alt80=1;
                            }
                            else if ( (LA80_0==WHITE_SPACE) ) {
                                alt80=2;
                            }
                            switch (alt80) {
                                case 1 :
                                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:314:32: DASH
                                    {
                                    DASH276=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_first_to_thirty_first3048); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_DASH.add(DASH276);


                                    }
                                    break;
                                case 2 :
                                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:314:39: WHITE_SPACE
                                    {
                                    WHITE_SPACE277=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_spelled_first_to_thirty_first3052); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE277);


                                    }
                                    break;

                            }

                            SIXTH278=(Token)match(input,SIXTH,FOLLOW_SIXTH_in_spelled_first_to_thirty_first3056); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_SIXTH.add(SIXTH278);


                            }


                            }
                            break;

                    }



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
                    // 314:63: -> INT[\"26\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "26"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 27 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:315:5: ( TWENTY_SEVENTH | ( TWENTY ( DASH | WHITE_SPACE )? SEVENTH ) )
                    {
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:315:5: ( TWENTY_SEVENTH | ( TWENTY ( DASH | WHITE_SPACE )? SEVENTH ) )
                    int alt83=2;
                    int LA83_0 = input.LA(1);

                    if ( (LA83_0==TWENTY_SEVENTH) ) {
                        alt83=1;
                    }
                    else if ( (LA83_0==TWENTY) ) {
                        alt83=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 83, 0, input);

                        throw nvae;
                    }
                    switch (alt83) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:315:6: TWENTY_SEVENTH
                            {
                            TWENTY_SEVENTH279=(Token)match(input,TWENTY_SEVENTH,FOLLOW_TWENTY_SEVENTH_in_spelled_first_to_thirty_first3072); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY_SEVENTH.add(TWENTY_SEVENTH279);


                            }
                            break;
                        case 2 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:315:23: ( TWENTY ( DASH | WHITE_SPACE )? SEVENTH )
                            {
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:315:23: ( TWENTY ( DASH | WHITE_SPACE )? SEVENTH )
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:315:24: TWENTY ( DASH | WHITE_SPACE )? SEVENTH
                            {
                            TWENTY280=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_first_to_thirty_first3077); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY280);

                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:315:31: ( DASH | WHITE_SPACE )?
                            int alt82=3;
                            int LA82_0 = input.LA(1);

                            if ( (LA82_0==DASH) ) {
                                alt82=1;
                            }
                            else if ( (LA82_0==WHITE_SPACE) ) {
                                alt82=2;
                            }
                            switch (alt82) {
                                case 1 :
                                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:315:32: DASH
                                    {
                                    DASH281=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_first_to_thirty_first3080); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_DASH.add(DASH281);


                                    }
                                    break;
                                case 2 :
                                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:315:39: WHITE_SPACE
                                    {
                                    WHITE_SPACE282=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_spelled_first_to_thirty_first3084); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE282);


                                    }
                                    break;

                            }

                            SEVENTH283=(Token)match(input,SEVENTH,FOLLOW_SEVENTH_in_spelled_first_to_thirty_first3088); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_SEVENTH.add(SEVENTH283);


                            }


                            }
                            break;

                    }



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
                    // 315:63: -> INT[\"27\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "27"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 28 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:316:5: ( TWENTY_EIGHTH | ( TWENTY ( DASH | WHITE_SPACE )? EIGHTH ) )
                    {
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:316:5: ( TWENTY_EIGHTH | ( TWENTY ( DASH | WHITE_SPACE )? EIGHTH ) )
                    int alt85=2;
                    int LA85_0 = input.LA(1);

                    if ( (LA85_0==TWENTY_EIGHTH) ) {
                        alt85=1;
                    }
                    else if ( (LA85_0==TWENTY) ) {
                        alt85=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 85, 0, input);

                        throw nvae;
                    }
                    switch (alt85) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:316:6: TWENTY_EIGHTH
                            {
                            TWENTY_EIGHTH284=(Token)match(input,TWENTY_EIGHTH,FOLLOW_TWENTY_EIGHTH_in_spelled_first_to_thirty_first3102); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY_EIGHTH.add(TWENTY_EIGHTH284);


                            }
                            break;
                        case 2 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:316:23: ( TWENTY ( DASH | WHITE_SPACE )? EIGHTH )
                            {
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:316:23: ( TWENTY ( DASH | WHITE_SPACE )? EIGHTH )
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:316:24: TWENTY ( DASH | WHITE_SPACE )? EIGHTH
                            {
                            TWENTY285=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_first_to_thirty_first3108); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY285);

                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:316:31: ( DASH | WHITE_SPACE )?
                            int alt84=3;
                            int LA84_0 = input.LA(1);

                            if ( (LA84_0==DASH) ) {
                                alt84=1;
                            }
                            else if ( (LA84_0==WHITE_SPACE) ) {
                                alt84=2;
                            }
                            switch (alt84) {
                                case 1 :
                                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:316:32: DASH
                                    {
                                    DASH286=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_first_to_thirty_first3111); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_DASH.add(DASH286);


                                    }
                                    break;
                                case 2 :
                                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:316:39: WHITE_SPACE
                                    {
                                    WHITE_SPACE287=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_spelled_first_to_thirty_first3115); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE287);


                                    }
                                    break;

                            }

                            EIGHTH288=(Token)match(input,EIGHTH,FOLLOW_EIGHTH_in_spelled_first_to_thirty_first3119); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_EIGHTH.add(EIGHTH288);


                            }


                            }
                            break;

                    }



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
                    // 316:63: -> INT[\"28\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "28"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 29 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:317:5: ( TWENTY_NINTH | ( TWENTY ( DASH | WHITE_SPACE )? NINTH ) )
                    {
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:317:5: ( TWENTY_NINTH | ( TWENTY ( DASH | WHITE_SPACE )? NINTH ) )
                    int alt87=2;
                    int LA87_0 = input.LA(1);

                    if ( (LA87_0==TWENTY_NINTH) ) {
                        alt87=1;
                    }
                    else if ( (LA87_0==TWENTY) ) {
                        alt87=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 87, 0, input);

                        throw nvae;
                    }
                    switch (alt87) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:317:6: TWENTY_NINTH
                            {
                            TWENTY_NINTH289=(Token)match(input,TWENTY_NINTH,FOLLOW_TWENTY_NINTH_in_spelled_first_to_thirty_first3134); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY_NINTH.add(TWENTY_NINTH289);


                            }
                            break;
                        case 2 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:317:23: ( TWENTY ( DASH | WHITE_SPACE )? NINTH )
                            {
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:317:23: ( TWENTY ( DASH | WHITE_SPACE )? NINTH )
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:317:24: TWENTY ( DASH | WHITE_SPACE )? NINTH
                            {
                            TWENTY290=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_first_to_thirty_first3141); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY290);

                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:317:31: ( DASH | WHITE_SPACE )?
                            int alt86=3;
                            int LA86_0 = input.LA(1);

                            if ( (LA86_0==DASH) ) {
                                alt86=1;
                            }
                            else if ( (LA86_0==WHITE_SPACE) ) {
                                alt86=2;
                            }
                            switch (alt86) {
                                case 1 :
                                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:317:32: DASH
                                    {
                                    DASH291=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_first_to_thirty_first3144); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_DASH.add(DASH291);


                                    }
                                    break;
                                case 2 :
                                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:317:39: WHITE_SPACE
                                    {
                                    WHITE_SPACE292=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_spelled_first_to_thirty_first3148); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE292);


                                    }
                                    break;

                            }

                            NINTH293=(Token)match(input,NINTH,FOLLOW_NINTH_in_spelled_first_to_thirty_first3152); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NINTH.add(NINTH293);


                            }


                            }
                            break;

                    }



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
                    // 317:63: -> INT[\"29\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "29"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 30 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:318:5: THIRTIETH
                    {
                    THIRTIETH294=(Token)match(input,THIRTIETH,FOLLOW_THIRTIETH_in_spelled_first_to_thirty_first3167); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THIRTIETH.add(THIRTIETH294);



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
                    // 318:63: -> INT[\"30\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "30"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 31 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:319:5: ( THIRTY_FIRST | ( THIRTY ( DASH | WHITE_SPACE )? FIRST ) )
                    {
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:319:5: ( THIRTY_FIRST | ( THIRTY ( DASH | WHITE_SPACE )? FIRST ) )
                    int alt89=2;
                    int LA89_0 = input.LA(1);

                    if ( (LA89_0==THIRTY_FIRST) ) {
                        alt89=1;
                    }
                    else if ( (LA89_0==THIRTY) ) {
                        alt89=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 89, 0, input);

                        throw nvae;
                    }
                    switch (alt89) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:319:6: THIRTY_FIRST
                            {
                            THIRTY_FIRST295=(Token)match(input,THIRTY_FIRST,FOLLOW_THIRTY_FIRST_in_spelled_first_to_thirty_first3227); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_THIRTY_FIRST.add(THIRTY_FIRST295);


                            }
                            break;
                        case 2 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:319:23: ( THIRTY ( DASH | WHITE_SPACE )? FIRST )
                            {
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:319:23: ( THIRTY ( DASH | WHITE_SPACE )? FIRST )
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:319:24: THIRTY ( DASH | WHITE_SPACE )? FIRST
                            {
                            THIRTY296=(Token)match(input,THIRTY,FOLLOW_THIRTY_in_spelled_first_to_thirty_first3234); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_THIRTY.add(THIRTY296);

                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:319:31: ( DASH | WHITE_SPACE )?
                            int alt88=3;
                            int LA88_0 = input.LA(1);

                            if ( (LA88_0==DASH) ) {
                                alt88=1;
                            }
                            else if ( (LA88_0==WHITE_SPACE) ) {
                                alt88=2;
                            }
                            switch (alt88) {
                                case 1 :
                                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:319:32: DASH
                                    {
                                    DASH297=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_first_to_thirty_first3237); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_DASH.add(DASH297);


                                    }
                                    break;
                                case 2 :
                                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:319:39: WHITE_SPACE
                                    {
                                    WHITE_SPACE298=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_spelled_first_to_thirty_first3241); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE298);


                                    }
                                    break;

                            }

                            FIRST299=(Token)match(input,FIRST,FOLLOW_FIRST_in_spelled_first_to_thirty_first3245); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_FIRST.add(FIRST299);


                            }


                            }
                            break;

                    }



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
                    // 319:63: -> INT[\"31\"]
                    {
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
        return retval;
    }
    // $ANTLR end "spelled_first_to_thirty_first"

    // $ANTLR start synpred1_Date
    public final void synpred1_Date_fragment() throws RecognitionException {   
        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:30:7: ( date ( WHITE_SPACE ( AT WHITE_SPACE )? time )? )
        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:30:8: date ( WHITE_SPACE ( AT WHITE_SPACE )? time )?
        {
        pushFollow(FOLLOW_date_in_synpred1_Date134);
        date();

        state._fsp--;
        if (state.failed) return ;
        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:30:13: ( WHITE_SPACE ( AT WHITE_SPACE )? time )?
        int alt92=2;
        int LA92_0 = input.LA(1);

        if ( (LA92_0==WHITE_SPACE) ) {
            alt92=1;
        }
        switch (alt92) {
            case 1 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:30:14: WHITE_SPACE ( AT WHITE_SPACE )? time
                {
                match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_synpred1_Date137); if (state.failed) return ;
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:30:26: ( AT WHITE_SPACE )?
                int alt91=2;
                int LA91_0 = input.LA(1);

                if ( (LA91_0==AT) ) {
                    alt91=1;
                }
                switch (alt91) {
                    case 1 :
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:30:27: AT WHITE_SPACE
                        {
                        match(input,AT,FOLLOW_AT_in_synpred1_Date140); if (state.failed) return ;
                        match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_synpred1_Date142); if (state.failed) return ;

                        }
                        break;

                }

                pushFollow(FOLLOW_time_in_synpred1_Date146);
                time();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        }
    }
    // $ANTLR end synpred1_Date

    // $ANTLR start synpred2_Date
    public final void synpred2_Date_fragment() throws RecognitionException {   
        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:51:7: ( relaxed_day_of_month WHITE_SPACE ( OF WHITE_SPACE )? relaxed_month relaxed_year )
        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:51:8: relaxed_day_of_month WHITE_SPACE ( OF WHITE_SPACE )? relaxed_month relaxed_year
        {
        pushFollow(FOLLOW_relaxed_day_of_month_in_synpred2_Date296);
        relaxed_day_of_month();

        state._fsp--;
        if (state.failed) return ;
        match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_synpred2_Date298); if (state.failed) return ;
        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:51:41: ( OF WHITE_SPACE )?
        int alt93=2;
        int LA93_0 = input.LA(1);

        if ( (LA93_0==OF) ) {
            alt93=1;
        }
        switch (alt93) {
            case 1 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:51:42: OF WHITE_SPACE
                {
                match(input,OF,FOLLOW_OF_in_synpred2_Date301); if (state.failed) return ;
                match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_synpred2_Date303); if (state.failed) return ;

                }
                break;

        }

        pushFollow(FOLLOW_relaxed_month_in_synpred2_Date307);
        relaxed_month();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_relaxed_year_in_synpred2_Date309);
        relaxed_year();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_Date

    // $ANTLR start synpred3_Date
    public final void synpred3_Date_fragment() throws RecognitionException {   
        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:54:9: ( relaxed_month WHITE_SPACE relaxed_day_of_month relaxed_year )
        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:54:10: relaxed_month WHITE_SPACE relaxed_day_of_month relaxed_year
        {
        pushFollow(FOLLOW_relaxed_month_in_synpred3_Date350);
        relaxed_month();

        state._fsp--;
        if (state.failed) return ;
        match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_synpred3_Date352); if (state.failed) return ;
        pushFollow(FOLLOW_relaxed_day_of_month_in_synpred3_Date354);
        relaxed_day_of_month();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_relaxed_year_in_synpred3_Date356);
        relaxed_year();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred3_Date

    // Delegated rules

    public final boolean synpred1_Date() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_Date_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_Date() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_Date_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_Date() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_Date_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA5 dfa5 = new DFA5(this);
    protected DFA6 dfa6 = new DFA6(this);
    protected DFA9 dfa9 = new DFA9(this);
    protected DFA24 dfa24 = new DFA24(this);
    protected DFA31 dfa31 = new DFA31(this);
    protected DFA69 dfa69 = new DFA69(this);
    protected DFA90 dfa90 = new DFA90(this);
    static final String DFA5_eotS =
        "\u0094\uffff";
    static final String DFA5_eofS =
        "\1\uffff\3\122\3\uffff\1\122\113\uffff\5\122\1\uffff\1\122\16\uffff"+
        "\15\166\3\uffff\13\166\3\uffff\1\122\15\uffff";
    static final String DFA5_minS =
        "\1\27\3\23\3\uffff\1\23\113\uffff\5\23\1\uffff\1\23\16\uffff\15"+
        "\23\1\24\2\uffff\13\23\3\0\1\23\15\uffff";
    static final String DFA5_maxS =
        "\1\176\3\112\3\uffff\1\111\113\uffff\5\102\1\uffff\1\176\16\uffff"+
        "\15\45\1\176\2\uffff\13\45\3\0\1\112\15\uffff";
    static final String DFA5_acceptS =
        "\4\uffff\3\1\1\uffff\112\1\1\2\5\uffff\1\1\1\uffff\16\1\16\uffff"+
        "\2\1\17\uffff\15\1";
    static final String DFA5_specialS =
        "\1\1\1\10\1\4\1\35\3\uffff\1\45\113\uffff\1\13\1\14\1\3\1\5\1\6"+
        "\1\uffff\1\27\16\uffff\1\32\1\12\1\25\1\46\1\16\1\33\1\7\1\37\1"+
        "\21\1\44\1\22\1\42\1\30\1\23\2\uffff\1\15\1\2\1\41\1\43\1\31\1\17"+
        "\1\0\1\47\1\34\1\26\1\11\1\20\1\36\1\40\1\24\15\uffff}>";
    static final String[] DFA5_transitionS = {
            "\1\74\1\uffff\1\75\1\76\1\77\1\100\1\101\1\102\1\103\1\104\1"+
            "\105\1\106\1\107\2\uffff\1\121\7\uffff\1\113\1\114\1\115\1\116"+
            "\1\117\1\120\7\uffff\1\110\1\111\1\112\5\uffff\1\122\1\1\1\7"+
            "\1\2\1\3\1\4\1\5\1\6\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17"+
            "\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33"+
            "\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\46\1\47"+
            "\1\50\1\51\1\52\1\53\1\54\1\55\1\56\1\57\1\60\1\61\1\62\1\63"+
            "\1\64\1\65\1\66\1\67\1\70\1\71\1\72\1\73",
            "\1\122\52\uffff\1\122\2\uffff\2\122\1\uffff\1\123\1\uffff\1"+
            "\124\1\125\1\126\1\127\1\130",
            "\1\131\25\uffff\2\132\23\uffff\1\122\2\uffff\2\122\1\uffff"+
            "\1\123\1\uffff\1\124\1\125\1\126\1\127\1\130",
            "\1\131\52\uffff\1\122\2\uffff\2\122\1\uffff\1\123\1\uffff\1"+
            "\124\1\125\1\126\1\127\1\130",
            "",
            "",
            "",
            "\1\131\25\uffff\2\132\23\uffff\1\122\2\uffff\2\122\1\uffff"+
            "\1\122\1\uffff\4\122",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\122\25\uffff\2\133\24\uffff\4\122",
            "\1\122\25\uffff\2\133\24\uffff\4\122",
            "\1\122\25\uffff\2\133\24\uffff\4\122",
            "\1\122\25\uffff\2\133\24\uffff\4\122",
            "\1\122\25\uffff\2\133\24\uffff\4\122",
            "",
            "\1\122\1\uffff\1\122\1\147\1\150\1\uffff\1\151\1\152\1\153"+
            "\1\154\1\155\1\156\1\157\1\160\1\161\1\162\1\163\2\uffff\1\122"+
            "\1\uffff\1\146\2\uffff\1\143\1\144\1\145\6\122\1\134\1\135\1"+
            "\136\1\137\1\140\1\141\1\142\3\122\3\uffff\2\122\1\uffff\73"+
            "\122",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\165\4\uffff\1\164\14\uffff\1\167",
            "\1\165\4\uffff\1\170\14\uffff\1\167",
            "\1\165\4\uffff\1\171\14\uffff\1\167",
            "\1\165\4\uffff\1\172\14\uffff\1\167",
            "\1\165\4\uffff\1\173\14\uffff\1\167",
            "\1\165\4\uffff\1\174\14\uffff\1\167",
            "\1\165\4\uffff\1\175\14\uffff\1\167",
            "\1\165\4\uffff\1\176\14\uffff\1\167",
            "\1\165\4\uffff\1\177\14\uffff\1\167",
            "\1\165\4\uffff\1\u0080\14\uffff\1\167",
            "\1\165\4\uffff\1\u0081\14\uffff\1\167",
            "\1\165\4\uffff\1\u0082\14\uffff\1\167",
            "\1\165\21\uffff\1\167",
            "\1\u0089\17\uffff\1\u0088\1\uffff\1\u0087\34\uffff\1\u008a"+
            "\1\u008b\1\u0083\1\u0084\1\u0085\1\u0086\1\u008c\1\u008d\64"+
            "\122",
            "",
            "",
            "\1\165\21\uffff\1\167",
            "\1\165\21\uffff\1\167",
            "\1\165\21\uffff\1\167",
            "\1\165\21\uffff\1\167",
            "\1\165\21\uffff\1\167",
            "\1\165\21\uffff\1\167",
            "\1\165\21\uffff\1\167",
            "\1\165\21\uffff\1\167",
            "\1\165\21\uffff\1\167",
            "\1\165\21\uffff\1\167",
            "\1\165\21\uffff\1\167",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\122\21\uffff\1\122\36\uffff\1\u008e\1\uffff\1\u008f\1\u0090"+
            "\1\u0091\1\u0092\1\u0093",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "29:5: ( ( date ( WHITE_SPACE ( AT WHITE_SPACE )? time )? )=> date ( WHITE_SPACE ( AT WHITE_SPACE )? time )? | time ( WHITE_SPACE ( ON WHITE_SPACE )? date )? )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA5_126 = input.LA(1);

                         
                        int index5_126 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA5_126==WHITE_SPACE) ) {s = 117;}

                        else if ( (LA5_126==EOF) && (synpred1_Date())) {s = 118;}

                        else if ( (LA5_126==COMMA) && (synpred1_Date())) {s = 119;}

                         
                        input.seek(index5_126);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA5_0 = input.LA(1);

                         
                        int index5_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA5_0==INT_00) ) {s = 1;}

                        else if ( (LA5_0==INT_01_TO_12) ) {s = 2;}

                        else if ( (LA5_0==INT_13_TO_23) ) {s = 3;}

                        else if ( (LA5_0==INT_24_TO_31) && (synpred1_Date())) {s = 4;}

                        else if ( (LA5_0==INT_32_TO_59) && (synpred1_Date())) {s = 5;}

                        else if ( (LA5_0==INT_60_TO_99) && (synpred1_Date())) {s = 6;}

                        else if ( (LA5_0==INT_1_TO_9) ) {s = 7;}

                        else if ( (LA5_0==ONE) && (synpred1_Date())) {s = 8;}

                        else if ( (LA5_0==TWO) && (synpred1_Date())) {s = 9;}

                        else if ( (LA5_0==THREE) && (synpred1_Date())) {s = 10;}

                        else if ( (LA5_0==FOUR) && (synpred1_Date())) {s = 11;}

                        else if ( (LA5_0==FIVE) && (synpred1_Date())) {s = 12;}

                        else if ( (LA5_0==SIX) && (synpred1_Date())) {s = 13;}

                        else if ( (LA5_0==SEVEN) && (synpred1_Date())) {s = 14;}

                        else if ( (LA5_0==EIGHT) && (synpred1_Date())) {s = 15;}

                        else if ( (LA5_0==NINE) && (synpred1_Date())) {s = 16;}

                        else if ( (LA5_0==TEN) && (synpred1_Date())) {s = 17;}

                        else if ( (LA5_0==ELEVEN) && (synpred1_Date())) {s = 18;}

                        else if ( (LA5_0==TWELVE) && (synpred1_Date())) {s = 19;}

                        else if ( (LA5_0==THIRTEEN) && (synpred1_Date())) {s = 20;}

                        else if ( (LA5_0==FOURTEEN) && (synpred1_Date())) {s = 21;}

                        else if ( (LA5_0==FIFTEEN) && (synpred1_Date())) {s = 22;}

                        else if ( (LA5_0==SIXTEEN) && (synpred1_Date())) {s = 23;}

                        else if ( (LA5_0==SEVENTEEN) && (synpred1_Date())) {s = 24;}

                        else if ( (LA5_0==EIGHTEEN) && (synpred1_Date())) {s = 25;}

                        else if ( (LA5_0==NINETEEN) && (synpred1_Date())) {s = 26;}

                        else if ( (LA5_0==TWENTY) && (synpred1_Date())) {s = 27;}

                        else if ( (LA5_0==THIRTY) && (synpred1_Date())) {s = 28;}

                        else if ( (LA5_0==FIRST) && (synpred1_Date())) {s = 29;}

                        else if ( (LA5_0==SECOND) && (synpred1_Date())) {s = 30;}

                        else if ( (LA5_0==THIRD) && (synpred1_Date())) {s = 31;}

                        else if ( (LA5_0==FOURTH) && (synpred1_Date())) {s = 32;}

                        else if ( (LA5_0==FIFTH) && (synpred1_Date())) {s = 33;}

                        else if ( (LA5_0==SIXTH) && (synpred1_Date())) {s = 34;}

                        else if ( (LA5_0==SEVENTH) && (synpred1_Date())) {s = 35;}

                        else if ( (LA5_0==EIGHTH) && (synpred1_Date())) {s = 36;}

                        else if ( (LA5_0==NINTH) && (synpred1_Date())) {s = 37;}

                        else if ( (LA5_0==TENTH) && (synpred1_Date())) {s = 38;}

                        else if ( (LA5_0==ELEVENTH) && (synpred1_Date())) {s = 39;}

                        else if ( (LA5_0==TWELFTH) && (synpred1_Date())) {s = 40;}

                        else if ( (LA5_0==THIRTEENTH) && (synpred1_Date())) {s = 41;}

                        else if ( (LA5_0==FOURTEENTH) && (synpred1_Date())) {s = 42;}

                        else if ( (LA5_0==FIFTEENTH) && (synpred1_Date())) {s = 43;}

                        else if ( (LA5_0==SIXTEENTH) && (synpred1_Date())) {s = 44;}

                        else if ( (LA5_0==SEVENTEENTH) && (synpred1_Date())) {s = 45;}

                        else if ( (LA5_0==EIGHTEENTH) && (synpred1_Date())) {s = 46;}

                        else if ( (LA5_0==NINETEENTH) && (synpred1_Date())) {s = 47;}

                        else if ( (LA5_0==TWENTIETH) && (synpred1_Date())) {s = 48;}

                        else if ( (LA5_0==TWENTY_FIRST) && (synpred1_Date())) {s = 49;}

                        else if ( (LA5_0==TWENTY_SECOND) && (synpred1_Date())) {s = 50;}

                        else if ( (LA5_0==TWENTY_THIRD) && (synpred1_Date())) {s = 51;}

                        else if ( (LA5_0==TWENTY_FOURTH) && (synpred1_Date())) {s = 52;}

                        else if ( (LA5_0==TWENTY_FIFTH) && (synpred1_Date())) {s = 53;}

                        else if ( (LA5_0==TWENTY_SIXTH) && (synpred1_Date())) {s = 54;}

                        else if ( (LA5_0==TWENTY_SEVENTH) && (synpred1_Date())) {s = 55;}

                        else if ( (LA5_0==TWENTY_EIGHTH) && (synpred1_Date())) {s = 56;}

                        else if ( (LA5_0==TWENTY_NINTH) && (synpred1_Date())) {s = 57;}

                        else if ( (LA5_0==THIRTIETH) && (synpred1_Date())) {s = 58;}

                        else if ( (LA5_0==THIRTY_FIRST) && (synpred1_Date())) {s = 59;}

                        else if ( (LA5_0==JANUARY) && (synpred1_Date())) {s = 60;}

                        else if ( (LA5_0==FEBRUARY) && (synpred1_Date())) {s = 61;}

                        else if ( (LA5_0==MARCH) && (synpred1_Date())) {s = 62;}

                        else if ( (LA5_0==APRIL) && (synpred1_Date())) {s = 63;}

                        else if ( (LA5_0==MAY) && (synpred1_Date())) {s = 64;}

                        else if ( (LA5_0==JUNE) && (synpred1_Date())) {s = 65;}

                        else if ( (LA5_0==JULY) && (synpred1_Date())) {s = 66;}

                        else if ( (LA5_0==AUGUST) && (synpred1_Date())) {s = 67;}

                        else if ( (LA5_0==SEPTEMBER) && (synpred1_Date())) {s = 68;}

                        else if ( (LA5_0==OCTOBER) && (synpred1_Date())) {s = 69;}

                        else if ( (LA5_0==NOVEMBER) && (synpred1_Date())) {s = 70;}

                        else if ( (LA5_0==DECEMBER) && (synpred1_Date())) {s = 71;}

                        else if ( (LA5_0==TODAY) && (synpred1_Date())) {s = 72;}

                        else if ( (LA5_0==TOMORROW) && (synpred1_Date())) {s = 73;}

                        else if ( (LA5_0==YESTERDAY) && (synpred1_Date())) {s = 74;}

                        else if ( (LA5_0==THIS) && (synpred1_Date())) {s = 75;}

                        else if ( (LA5_0==LAST) && (synpred1_Date())) {s = 76;}

                        else if ( (LA5_0==NEXT) && (synpred1_Date())) {s = 77;}

                        else if ( (LA5_0==PAST) && (synpred1_Date())) {s = 78;}

                        else if ( (LA5_0==COMING) && (synpred1_Date())) {s = 79;}

                        else if ( (LA5_0==UPCOMING) && (synpred1_Date())) {s = 80;}

                        else if ( (LA5_0==IN) && (synpred1_Date())) {s = 81;}

                        else if ( (LA5_0==INT_0) ) {s = 82;}

                         
                        input.seek(index5_0);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA5_121 = input.LA(1);

                         
                        int index5_121 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA5_121==COMMA) && (synpred1_Date())) {s = 119;}

                        else if ( (LA5_121==WHITE_SPACE) ) {s = 117;}

                        else if ( (LA5_121==EOF) && (synpred1_Date())) {s = 118;}

                         
                        input.seek(index5_121);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA5_85 = input.LA(1);

                         
                        int index5_85 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA5_85==EOF||LA5_85==WHITE_SPACE||(LA5_85>=MILITARY_HOUR_SUFFIX && LA5_85<=PM)) ) {s = 82;}

                        else if ( ((LA5_85>=DASH && LA5_85<=SLASH)) && (synpred1_Date())) {s = 91;}

                         
                        input.seek(index5_85);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA5_2 = input.LA(1);

                         
                        int index5_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA5_2==EOF||LA5_2==COLON||(LA5_2>=AM && LA5_2<=PM)) ) {s = 82;}

                        else if ( (LA5_2==INT_00) ) {s = 83;}

                        else if ( (LA5_2==INT_01_TO_12) ) {s = 84;}

                        else if ( (LA5_2==INT_13_TO_23) ) {s = 85;}

                        else if ( (LA5_2==INT_24_TO_31) ) {s = 86;}

                        else if ( (LA5_2==INT_32_TO_59) ) {s = 87;}

                        else if ( (LA5_2==WHITE_SPACE) ) {s = 89;}

                        else if ( ((LA5_2>=DASH && LA5_2<=SLASH)) && (synpred1_Date())) {s = 90;}

                        else if ( (LA5_2==INT_60_TO_99) && (synpred1_Date())) {s = 88;}

                         
                        input.seek(index5_2);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA5_86 = input.LA(1);

                         
                        int index5_86 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA5_86==EOF||LA5_86==WHITE_SPACE||(LA5_86>=MILITARY_HOUR_SUFFIX && LA5_86<=PM)) ) {s = 82;}

                        else if ( ((LA5_86>=DASH && LA5_86<=SLASH)) && (synpred1_Date())) {s = 91;}

                         
                        input.seek(index5_86);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA5_87 = input.LA(1);

                         
                        int index5_87 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA5_87>=DASH && LA5_87<=SLASH)) && (synpred1_Date())) {s = 91;}

                        else if ( (LA5_87==EOF||LA5_87==WHITE_SPACE||(LA5_87>=MILITARY_HOUR_SUFFIX && LA5_87<=PM)) ) {s = 82;}

                         
                        input.seek(index5_87);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA5_110 = input.LA(1);

                         
                        int index5_110 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA5_110==DOT) ) {s = 125;}

                        else if ( (LA5_110==WHITE_SPACE) ) {s = 117;}

                        else if ( (LA5_110==EOF) && (synpred1_Date())) {s = 118;}

                        else if ( (LA5_110==COMMA) && (synpred1_Date())) {s = 119;}

                         
                        input.seek(index5_110);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA5_1 = input.LA(1);

                         
                        int index5_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA5_1==EOF||LA5_1==WHITE_SPACE||LA5_1==COLON||(LA5_1>=AM && LA5_1<=PM)) ) {s = 82;}

                        else if ( (LA5_1==INT_00) ) {s = 83;}

                        else if ( (LA5_1==INT_01_TO_12) ) {s = 84;}

                        else if ( (LA5_1==INT_13_TO_23) ) {s = 85;}

                        else if ( (LA5_1==INT_24_TO_31) ) {s = 86;}

                        else if ( (LA5_1==INT_32_TO_59) ) {s = 87;}

                        else if ( (LA5_1==INT_60_TO_99) && (synpred1_Date())) {s = 88;}

                         
                        input.seek(index5_1);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA5_130 = input.LA(1);

                         
                        int index5_130 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA5_130==WHITE_SPACE) ) {s = 117;}

                        else if ( (LA5_130==COMMA) && (synpred1_Date())) {s = 119;}

                        else if ( (LA5_130==EOF) && (synpred1_Date())) {s = 118;}

                         
                        input.seek(index5_130);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA5_105 = input.LA(1);

                         
                        int index5_105 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA5_105==DOT) ) {s = 120;}

                        else if ( (LA5_105==WHITE_SPACE) ) {s = 117;}

                        else if ( (LA5_105==EOF) && (synpred1_Date())) {s = 118;}

                        else if ( (LA5_105==COMMA) && (synpred1_Date())) {s = 119;}

                         
                        input.seek(index5_105);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA5_83 = input.LA(1);

                         
                        int index5_83 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA5_83==EOF||LA5_83==WHITE_SPACE||(LA5_83>=MILITARY_HOUR_SUFFIX && LA5_83<=PM)) ) {s = 82;}

                        else if ( ((LA5_83>=DASH && LA5_83<=SLASH)) && (synpred1_Date())) {s = 91;}

                         
                        input.seek(index5_83);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA5_84 = input.LA(1);

                         
                        int index5_84 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA5_84==EOF||LA5_84==WHITE_SPACE||(LA5_84>=MILITARY_HOUR_SUFFIX && LA5_84<=PM)) ) {s = 82;}

                        else if ( ((LA5_84>=DASH && LA5_84<=SLASH)) && (synpred1_Date())) {s = 91;}

                         
                        input.seek(index5_84);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA5_120 = input.LA(1);

                         
                        int index5_120 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA5_120==WHITE_SPACE) ) {s = 117;}

                        else if ( (LA5_120==EOF) && (synpred1_Date())) {s = 118;}

                        else if ( (LA5_120==COMMA) && (synpred1_Date())) {s = 119;}

                         
                        input.seek(index5_120);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA5_108 = input.LA(1);

                         
                        int index5_108 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA5_108==DOT) ) {s = 123;}

                        else if ( (LA5_108==COMMA) && (synpred1_Date())) {s = 119;}

                        else if ( (LA5_108==WHITE_SPACE) ) {s = 117;}

                        else if ( (LA5_108==EOF) && (synpred1_Date())) {s = 118;}

                         
                        input.seek(index5_108);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA5_125 = input.LA(1);

                         
                        int index5_125 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA5_125==WHITE_SPACE) ) {s = 117;}

                        else if ( (LA5_125==COMMA) && (synpred1_Date())) {s = 119;}

                        else if ( (LA5_125==EOF) && (synpred1_Date())) {s = 118;}

                         
                        input.seek(index5_125);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA5_131 = input.LA(1);

                         
                        int index5_131 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 141;}

                        else if ( (true) ) {s = 82;}

                         
                        input.seek(index5_131);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA5_112 = input.LA(1);

                         
                        int index5_112 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA5_112==DOT) ) {s = 127;}

                        else if ( (LA5_112==WHITE_SPACE) ) {s = 117;}

                        else if ( (LA5_112==EOF) && (synpred1_Date())) {s = 118;}

                        else if ( (LA5_112==COMMA) && (synpred1_Date())) {s = 119;}

                         
                        input.seek(index5_112);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA5_114 = input.LA(1);

                         
                        int index5_114 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA5_114==DOT) ) {s = 129;}

                        else if ( (LA5_114==COMMA) && (synpred1_Date())) {s = 119;}

                        else if ( (LA5_114==WHITE_SPACE) ) {s = 117;}

                        else if ( (LA5_114==EOF) && (synpred1_Date())) {s = 118;}

                         
                        input.seek(index5_114);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA5_117 = input.LA(1);

                         
                        int index5_117 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA5_117==INT_1_TO_9) ) {s = 131;}

                        else if ( (LA5_117==INT_01_TO_12) ) {s = 132;}

                        else if ( (LA5_117==INT_13_TO_23) ) {s = 133;}

                        else if ( (LA5_117==INT_24_TO_31) ) {s = 134;}

                        else if ( ((LA5_117>=ONE && LA5_117<=THIRTY_FIRST)) ) {s = 82;}

                        else if ( (LA5_117==IN) && (synpred1_Date())) {s = 135;}

                        else if ( (LA5_117==SINGLE_QUOTE) && (synpred1_Date())) {s = 136;}

                        else if ( (LA5_117==AT) && (synpred1_Date())) {s = 137;}

                        else if ( (LA5_117==INT_0) && (synpred1_Date())) {s = 138;}

                        else if ( (LA5_117==INT_00) && (synpred1_Date())) {s = 139;}

                        else if ( (LA5_117==INT_32_TO_59) && (synpred1_Date())) {s = 140;}

                        else if ( (LA5_117==INT_60_TO_99) && (synpred1_Date())) {s = 141;}

                         
                        input.seek(index5_117);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA5_134 = input.LA(1);

                         
                        int index5_134 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA5_134==EOF||LA5_134==WHITE_SPACE||LA5_134==COMMA) ) {s = 82;}

                        else if ( (LA5_134==INT_00) && (synpred1_Date())) {s = 142;}

                        else if ( (LA5_134==INT_01_TO_12) && (synpred1_Date())) {s = 143;}

                        else if ( (LA5_134==INT_13_TO_23) && (synpred1_Date())) {s = 144;}

                        else if ( (LA5_134==INT_24_TO_31) && (synpred1_Date())) {s = 145;}

                        else if ( (LA5_134==INT_32_TO_59) && (synpred1_Date())) {s = 146;}

                        else if ( (LA5_134==INT_60_TO_99) && (synpred1_Date())) {s = 147;}

                         
                        input.seek(index5_134);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA5_106 = input.LA(1);

                         
                        int index5_106 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA5_106==DOT) ) {s = 121;}

                        else if ( (LA5_106==COMMA) && (synpred1_Date())) {s = 119;}

                        else if ( (LA5_106==WHITE_SPACE) ) {s = 117;}

                        else if ( (LA5_106==EOF) && (synpred1_Date())) {s = 118;}

                         
                        input.seek(index5_106);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA5_129 = input.LA(1);

                         
                        int index5_129 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA5_129==WHITE_SPACE) ) {s = 117;}

                        else if ( (LA5_129==EOF) && (synpred1_Date())) {s = 118;}

                        else if ( (LA5_129==COMMA) && (synpred1_Date())) {s = 119;}

                         
                        input.seek(index5_129);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA5_89 = input.LA(1);

                         
                        int index5_89 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA5_89==SUNDAY) && (synpred1_Date())) {s = 92;}

                        else if ( (LA5_89==MONDAY) && (synpred1_Date())) {s = 93;}

                        else if ( (LA5_89==TUESDAY) && (synpred1_Date())) {s = 94;}

                        else if ( (LA5_89==WEDNESDAY) && (synpred1_Date())) {s = 95;}

                        else if ( (LA5_89==THURSDAY) && (synpred1_Date())) {s = 96;}

                        else if ( (LA5_89==FRIDAY) && (synpred1_Date())) {s = 97;}

                        else if ( (LA5_89==SATURDAY) && (synpred1_Date())) {s = 98;}

                        else if ( (LA5_89==DAY) && (synpred1_Date())) {s = 99;}

                        else if ( (LA5_89==WEEK) && (synpred1_Date())) {s = 100;}

                        else if ( (LA5_89==MONTH) && (synpred1_Date())) {s = 101;}

                        else if ( (LA5_89==YEAR) && (synpred1_Date())) {s = 102;}

                        else if ( (LA5_89==OF) && (synpred1_Date())) {s = 103;}

                        else if ( (LA5_89==JANUARY) ) {s = 104;}

                        else if ( (LA5_89==FEBRUARY) ) {s = 105;}

                        else if ( (LA5_89==MARCH) ) {s = 106;}

                        else if ( (LA5_89==APRIL) ) {s = 107;}

                        else if ( (LA5_89==MAY) ) {s = 108;}

                        else if ( (LA5_89==JUNE) ) {s = 109;}

                        else if ( (LA5_89==JULY) ) {s = 110;}

                        else if ( (LA5_89==AUGUST) ) {s = 111;}

                        else if ( (LA5_89==SEPTEMBER) ) {s = 112;}

                        else if ( (LA5_89==OCTOBER) ) {s = 113;}

                        else if ( (LA5_89==NOVEMBER) ) {s = 114;}

                        else if ( (LA5_89==DECEMBER) ) {s = 115;}

                        else if ( (LA5_89==EOF||LA5_89==WHITE_SPACE||LA5_89==ON||LA5_89==IN||(LA5_89>=THIS && LA5_89<=UPCOMING)||(LA5_89>=TODAY && LA5_89<=YESTERDAY)||(LA5_89>=AM && LA5_89<=PM)||(LA5_89>=INT_00 && LA5_89<=THIRTY_FIRST)) ) {s = 82;}

                         
                        input.seek(index5_89);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA5_116 = input.LA(1);

                         
                        int index5_116 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA5_116==WHITE_SPACE) ) {s = 117;}

                        else if ( (LA5_116==EOF) && (synpred1_Date())) {s = 118;}

                        else if ( (LA5_116==COMMA) && (synpred1_Date())) {s = 119;}

                         
                        input.seek(index5_116);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA5_124 = input.LA(1);

                         
                        int index5_124 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA5_124==COMMA) && (synpred1_Date())) {s = 119;}

                        else if ( (LA5_124==WHITE_SPACE) ) {s = 117;}

                        else if ( (LA5_124==EOF) && (synpred1_Date())) {s = 118;}

                         
                        input.seek(index5_124);
                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA5_104 = input.LA(1);

                         
                        int index5_104 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA5_104==DOT) ) {s = 116;}

                        else if ( (LA5_104==WHITE_SPACE) ) {s = 117;}

                        else if ( (LA5_104==EOF) && (synpred1_Date())) {s = 118;}

                        else if ( (LA5_104==COMMA) && (synpred1_Date())) {s = 119;}

                         
                        input.seek(index5_104);
                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA5_109 = input.LA(1);

                         
                        int index5_109 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA5_109==DOT) ) {s = 124;}

                        else if ( (LA5_109==WHITE_SPACE) ) {s = 117;}

                        else if ( (LA5_109==COMMA) && (synpred1_Date())) {s = 119;}

                        else if ( (LA5_109==EOF) && (synpred1_Date())) {s = 118;}

                         
                        input.seek(index5_109);
                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA5_128 = input.LA(1);

                         
                        int index5_128 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA5_128==WHITE_SPACE) ) {s = 117;}

                        else if ( (LA5_128==COMMA) && (synpred1_Date())) {s = 119;}

                        else if ( (LA5_128==EOF) && (synpred1_Date())) {s = 118;}

                         
                        input.seek(index5_128);
                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA5_3 = input.LA(1);

                         
                        int index5_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA5_3==WHITE_SPACE) ) {s = 89;}

                        else if ( (LA5_3==EOF||LA5_3==COLON||(LA5_3>=AM && LA5_3<=PM)) ) {s = 82;}

                        else if ( (LA5_3==INT_00) ) {s = 83;}

                        else if ( (LA5_3==INT_01_TO_12) ) {s = 84;}

                        else if ( (LA5_3==INT_13_TO_23) ) {s = 85;}

                        else if ( (LA5_3==INT_24_TO_31) ) {s = 86;}

                        else if ( (LA5_3==INT_32_TO_59) ) {s = 87;}

                        else if ( (LA5_3==INT_60_TO_99) && (synpred1_Date())) {s = 88;}

                         
                        input.seek(index5_3);
                        if ( s>=0 ) return s;
                        break;
                    case 30 : 
                        int LA5_132 = input.LA(1);

                         
                        int index5_132 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 141;}

                        else if ( (true) ) {s = 82;}

                         
                        input.seek(index5_132);
                        if ( s>=0 ) return s;
                        break;
                    case 31 : 
                        int LA5_111 = input.LA(1);

                         
                        int index5_111 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA5_111==DOT) ) {s = 126;}

                        else if ( (LA5_111==WHITE_SPACE) ) {s = 117;}

                        else if ( (LA5_111==COMMA) && (synpred1_Date())) {s = 119;}

                        else if ( (LA5_111==EOF) && (synpred1_Date())) {s = 118;}

                         
                        input.seek(index5_111);
                        if ( s>=0 ) return s;
                        break;
                    case 32 : 
                        int LA5_133 = input.LA(1);

                         
                        int index5_133 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 141;}

                        else if ( (true) ) {s = 82;}

                         
                        input.seek(index5_133);
                        if ( s>=0 ) return s;
                        break;
                    case 33 : 
                        int LA5_122 = input.LA(1);

                         
                        int index5_122 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA5_122==WHITE_SPACE) ) {s = 117;}

                        else if ( (LA5_122==EOF) && (synpred1_Date())) {s = 118;}

                        else if ( (LA5_122==COMMA) && (synpred1_Date())) {s = 119;}

                         
                        input.seek(index5_122);
                        if ( s>=0 ) return s;
                        break;
                    case 34 : 
                        int LA5_115 = input.LA(1);

                         
                        int index5_115 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA5_115==DOT) ) {s = 130;}

                        else if ( (LA5_115==WHITE_SPACE) ) {s = 117;}

                        else if ( (LA5_115==COMMA) && (synpred1_Date())) {s = 119;}

                        else if ( (LA5_115==EOF) && (synpred1_Date())) {s = 118;}

                         
                        input.seek(index5_115);
                        if ( s>=0 ) return s;
                        break;
                    case 35 : 
                        int LA5_123 = input.LA(1);

                         
                        int index5_123 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA5_123==WHITE_SPACE) ) {s = 117;}

                        else if ( (LA5_123==COMMA) && (synpred1_Date())) {s = 119;}

                        else if ( (LA5_123==EOF) && (synpred1_Date())) {s = 118;}

                         
                        input.seek(index5_123);
                        if ( s>=0 ) return s;
                        break;
                    case 36 : 
                        int LA5_113 = input.LA(1);

                         
                        int index5_113 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA5_113==DOT) ) {s = 128;}

                        else if ( (LA5_113==WHITE_SPACE) ) {s = 117;}

                        else if ( (LA5_113==COMMA) && (synpred1_Date())) {s = 119;}

                        else if ( (LA5_113==EOF) && (synpred1_Date())) {s = 118;}

                         
                        input.seek(index5_113);
                        if ( s>=0 ) return s;
                        break;
                    case 37 : 
                        int LA5_7 = input.LA(1);

                         
                        int index5_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA5_7==EOF||LA5_7==COLON||(LA5_7>=AM && LA5_7<=PM)||LA5_7==INT_00||(LA5_7>=INT_01_TO_12 && LA5_7<=INT_32_TO_59)) ) {s = 82;}

                        else if ( (LA5_7==WHITE_SPACE) ) {s = 89;}

                        else if ( ((LA5_7>=DASH && LA5_7<=SLASH)) && (synpred1_Date())) {s = 90;}

                         
                        input.seek(index5_7);
                        if ( s>=0 ) return s;
                        break;
                    case 38 : 
                        int LA5_107 = input.LA(1);

                         
                        int index5_107 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA5_107==DOT) ) {s = 122;}

                        else if ( (LA5_107==COMMA) && (synpred1_Date())) {s = 119;}

                        else if ( (LA5_107==WHITE_SPACE) ) {s = 117;}

                        else if ( (LA5_107==EOF) && (synpred1_Date())) {s = 118;}

                         
                        input.seek(index5_107);
                        if ( s>=0 ) return s;
                        break;
                    case 39 : 
                        int LA5_127 = input.LA(1);

                         
                        int index5_127 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA5_127==WHITE_SPACE) ) {s = 117;}

                        else if ( (LA5_127==EOF) && (synpred1_Date())) {s = 118;}

                        else if ( (LA5_127==COMMA) && (synpred1_Date())) {s = 119;}

                         
                        input.seek(index5_127);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 5, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA6_eotS =
        "\54\uffff";
    static final String DFA6_eofS =
        "\54\uffff";
    static final String DFA6_minS =
        "\1\27\1\uffff\31\23\2\uffff\1\26\1\113\1\26\11\23\1\113\1\26\1\23";
    static final String DFA6_maxS =
        "\1\176\1\uffff\3\112\1\52\23\23\1\150\1\140\2\uffff\1\72\2\150\11"+
        "\23\2\140\1\23";
    static final String DFA6_acceptS =
        "\1\uffff\1\1\31\uffff\1\2\1\3\17\uffff";
    static final String DFA6_specialS =
        "\54\uffff}>";
    static final String[] DFA6_transitionS = {
            "\1\33\1\uffff\13\33\2\uffff\1\34\7\uffff\6\34\7\uffff\3\34\6"+
            "\uffff\1\1\1\5\1\2\1\3\1\4\2\1\1\6\1\7\1\10\1\11\1\12\1\13\1"+
            "\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1"+
            "\30\1\31\1\32\37\33",
            "",
            "\1\35\25\uffff\2\1\31\uffff\1\1\1\uffff\5\1",
            "\1\35\60\uffff\1\1\1\uffff\5\1",
            "\1\35\60\uffff\1\1\1\uffff\5\1",
            "\1\35\25\uffff\2\1",
            "\1\35",
            "\1\35",
            "\1\35",
            "\1\35",
            "\1\35",
            "\1\35",
            "\1\35",
            "\1\35",
            "\1\35",
            "\1\35",
            "\1\35",
            "\1\35",
            "\1\35",
            "\1\35",
            "\1\35",
            "\1\35",
            "\1\35",
            "\1\35",
            "\1\35",
            "\1\37\25\uffff\1\36\41\uffff\1\44\1\42\1\41\1\45\1\43\1\40"+
            "\1\50\1\47\1\46\14\uffff\11\33",
            "\1\52\25\uffff\1\51\41\uffff\1\53\24\uffff\1\33",
            "",
            "",
            "\2\33\1\uffff\13\33\4\uffff\1\34\2\uffff\3\34\6\uffff\7\34",
            "\1\44\1\42\1\41\1\45\1\43\1\40\1\50\1\47\1\46\14\uffff\11\33",
            "\2\33\1\uffff\13\33\4\uffff\1\34\2\uffff\3\34\6\uffff\7\34"+
            "\20\uffff\1\44\1\42\1\41\1\45\1\43\1\40\1\50\1\47\1\46\14\uffff"+
            "\11\33",
            "\1\35",
            "\1\35",
            "\1\35",
            "\1\35",
            "\1\35",
            "\1\35",
            "\1\35",
            "\1\35",
            "\1\35",
            "\1\53\24\uffff\1\33",
            "\2\33\1\uffff\13\33\4\uffff\1\34\2\uffff\3\34\6\uffff\7\34"+
            "\20\uffff\1\53\24\uffff\1\33",
            "\1\35"
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
            return "37:1: date : ( formal_date | relaxed_date | relative_date );";
        }
    }
    static final String DFA9_eotS =
        "\u00f7\uffff";
    static final String DFA9_eofS =
        "\154\uffff\14\u00b4\70\u00c1\1\uffff\1\u00b4\3\uffff\13\u00b4\5"+
        "\uffff\22\u00c1\2\uffff\2\u00c1\1\uffff\3\u00b4\6\uffff\3\u00c1"+
        "\17\uffff";
    static final String DFA9_minS =
        "\1\27\104\23\1\26\1\113\1\26\22\23\1\113\1\26\3\23\1\105\120\23"+
        "\1\27\1\23\1\uffff\1\24\1\uffff\13\23\1\24\2\uffff\1\113\1\24\22"+
        "\23\1\113\1\24\2\23\1\uffff\3\23\6\uffff\3\23\3\uffff\5\0\1\uffff"+
        "\5\0\1\uffff";
    static final String DFA9_maxS =
        "\1\176\27\23\1\150\1\140\37\23\14\30\1\43\2\150\22\23\2\140\3\23"+
        "\1\176\14\23\43\45\1\150\1\140\37\45\1\43\1\45\1\uffff\1\112\1\uffff"+
        "\13\45\1\112\2\uffff\2\150\22\45\2\140\2\45\1\uffff\3\112\6\uffff"+
        "\3\112\3\uffff\5\0\1\uffff\5\0\1\uffff";
    static final String DFA9_acceptS =
        "\u00b2\uffff\1\1\1\uffff\1\3\14\uffff\1\4\1\2\30\uffff\1\1\3\uffff"+
        "\4\1\2\2\3\uffff\3\2\5\uffff\1\1\5\uffff\1\2";
    static final String DFA9_specialS =
        "\154\uffff\1\71\1\46\1\34\1\17\1\3\1\146\1\157\1\72\1\111\1\35\1"+
        "\47\1\22\1\126\1\123\1\133\1\130\1\41\1\114\1\113\1\112\1\110\1"+
        "\122\1\121\1\120\1\116\1\134\1\131\1\127\1\124\1\141\1\140\1\136"+
        "\1\135\1\62\1\65\1\132\1\77\1\66\1\67\1\70\1\73\1\56\1\60\1\61\1"+
        "\64\1\103\1\104\1\105\1\106\1\74\1\75\1\100\1\101\1\54\1\55\1\51"+
        "\1\52\1\125\1\107\1\166\1\27\1\11\1\53\1\37\1\115\1\57\1\147\1\161"+
        "\1\uffff\1\137\1\uffff\1\10\1\uffff\1\143\1\150\1\153\1\162\1\167"+
        "\1\0\1\7\1\13\1\26\1\36\1\42\1\40\3\uffff\1\33\1\30\1\23\1\142\1"+
        "\163\1\152\1\154\1\50\1\76\1\16\1\164\1\144\1\145\1\117\1\5\1\102"+
        "\1\63\1\156\1\25\1\uffff\1\21\1\12\1\151\1\uffff\1\160\1\155\1\165"+
        "\6\uffff\1\14\1\15\1\24\3\uffff\1\31\1\32\1\43\1\44\1\45\1\uffff"+
        "\1\20\1\6\1\4\1\1\1\2\1\uffff}>";
    static final String[] DFA9_transitionS = {
            "\1\71\1\uffff\1\72\1\73\1\74\1\75\1\76\1\77\1\100\1\101\1\102"+
            "\1\103\1\104\41\uffff\1\1\1\2\1\3\1\4\2\uffff\1\5\1\6\1\7\1"+
            "\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1"+
            "\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1"+
            "\40\1\41\1\42\1\43\1\44\1\45\1\46\1\47\1\50\1\51\1\52\1\53\1"+
            "\54\1\55\1\56\1\57\1\60\1\61\1\62\1\63\1\64\1\65\1\66\1\67\1"+
            "\70",
            "\1\105",
            "\1\105",
            "\1\105",
            "\1\105",
            "\1\105",
            "\1\105",
            "\1\105",
            "\1\105",
            "\1\105",
            "\1\105",
            "\1\105",
            "\1\105",
            "\1\105",
            "\1\105",
            "\1\105",
            "\1\105",
            "\1\105",
            "\1\105",
            "\1\105",
            "\1\105",
            "\1\105",
            "\1\105",
            "\1\105",
            "\1\107\25\uffff\1\106\41\uffff\1\123\1\111\1\117\1\124\1\125"+
            "\1\115\1\110\1\122\1\114\14\uffff\1\121\1\130\1\116\1\127\1"+
            "\113\1\126\1\112\1\131\1\120",
            "\1\133\25\uffff\1\132\41\uffff\1\135\24\uffff\1\134",
            "\1\105",
            "\1\105",
            "\1\105",
            "\1\105",
            "\1\105",
            "\1\105",
            "\1\105",
            "\1\105",
            "\1\105",
            "\1\105",
            "\1\105",
            "\1\105",
            "\1\105",
            "\1\105",
            "\1\105",
            "\1\105",
            "\1\105",
            "\1\105",
            "\1\105",
            "\1\105",
            "\1\105",
            "\1\105",
            "\1\105",
            "\1\105",
            "\1\105",
            "\1\105",
            "\1\105",
            "\1\105",
            "\1\105",
            "\1\105",
            "\1\105",
            "\1\137\4\uffff\1\136",
            "\1\137\4\uffff\1\140",
            "\1\137\4\uffff\1\141",
            "\1\137\4\uffff\1\142",
            "\1\137\4\uffff\1\143",
            "\1\137\4\uffff\1\144",
            "\1\137\4\uffff\1\145",
            "\1\137\4\uffff\1\146",
            "\1\137\4\uffff\1\147",
            "\1\137\4\uffff\1\150",
            "\1\137\4\uffff\1\151",
            "\1\137\4\uffff\1\152",
            "\1\153\1\154\1\uffff\1\155\1\156\1\157\1\160\1\161\1\162\1"+
            "\163\1\164\1\165\1\166\1\167",
            "\1\123\1\111\1\117\1\124\1\125\1\115\1\110\1\122\1\114\14\uffff"+
            "\1\121\1\130\1\116\1\127\1\113\1\126\1\112\1\131\1\120",
            "\1\153\1\154\1\uffff\1\155\1\156\1\157\1\160\1\161\1\162\1"+
            "\163\1\164\1\165\1\166\1\167\47\uffff\1\123\1\111\1\117\1\124"+
            "\1\125\1\115\1\110\1\122\1\114\14\uffff\1\121\1\130\1\116\1"+
            "\127\1\113\1\126\1\112\1\131\1\120",
            "\1\105",
            "\1\105",
            "\1\105",
            "\1\105",
            "\1\105",
            "\1\105",
            "\1\105",
            "\1\105",
            "\1\105",
            "\1\105",
            "\1\105",
            "\1\105",
            "\1\105",
            "\1\105",
            "\1\105",
            "\1\105",
            "\1\105",
            "\1\105",
            "\1\135\24\uffff\1\134",
            "\1\153\1\154\1\uffff\1\155\1\156\1\157\1\160\1\161\1\162\1"+
            "\163\1\164\1\165\1\166\1\167\47\uffff\1\135\24\uffff\1\134",
            "\1\105",
            "\1\105",
            "\1\137",
            "\1\170\1\171\1\172\1\173\2\uffff\1\174\1\175\1\176\1\177\1"+
            "\u0080\1\u0081\1\u0082\1\u0083\1\u0084\1\u0085\1\u0086\1\u0087"+
            "\1\u0088\1\u0089\1\u008a\1\u008b\1\u008c\1\u008d\1\u008e\1\u008f"+
            "\1\u0090\1\u0091\1\u0092\1\u0093\1\u0094\1\u0095\1\u0096\1\u0097"+
            "\1\u0098\1\u0099\1\u009a\1\u009b\1\u009c\1\u009d\1\u009e\1\u009f"+
            "\1\u00a0\1\u00a1\1\u00a2\1\u00a3\1\u00a4\1\u00a5\1\u00a6\1\u00a7"+
            "\1\u00a8\1\u00a9\1\u00aa\1\u00ab\1\u00ac\1\u00ad\1\u00ae\1\u00af",
            "\1\137",
            "\1\137",
            "\1\137",
            "\1\137",
            "\1\137",
            "\1\137",
            "\1\137",
            "\1\137",
            "\1\137",
            "\1\137",
            "\1\137",
            "\1\u00b0",
            "\1\u00b3\4\uffff\1\u00b1\14\uffff\1\u00b2",
            "\1\u00b3\4\uffff\1\u00b5\14\uffff\1\u00b2",
            "\1\u00b3\4\uffff\1\u00b6\14\uffff\1\u00b2",
            "\1\u00b3\4\uffff\1\u00b7\14\uffff\1\u00b2",
            "\1\u00b3\4\uffff\1\u00b8\14\uffff\1\u00b2",
            "\1\u00b3\4\uffff\1\u00b9\14\uffff\1\u00b2",
            "\1\u00b3\4\uffff\1\u00ba\14\uffff\1\u00b2",
            "\1\u00b3\4\uffff\1\u00bb\14\uffff\1\u00b2",
            "\1\u00b3\4\uffff\1\u00bc\14\uffff\1\u00b2",
            "\1\u00b3\4\uffff\1\u00bd\14\uffff\1\u00b2",
            "\1\u00b3\4\uffff\1\u00be\14\uffff\1\u00b2",
            "\1\u00b3\4\uffff\1\u00bf\14\uffff\1\u00b2",
            "\1\u00c0\21\uffff\1\u00c2",
            "\1\u00c0\21\uffff\1\u00c2",
            "\1\u00c0\21\uffff\1\u00c2",
            "\1\u00c0\21\uffff\1\u00c2",
            "\1\u00c0\21\uffff\1\u00c2",
            "\1\u00c0\21\uffff\1\u00c2",
            "\1\u00c0\21\uffff\1\u00c2",
            "\1\u00c0\21\uffff\1\u00c2",
            "\1\u00c0\21\uffff\1\u00c2",
            "\1\u00c0\21\uffff\1\u00c2",
            "\1\u00c0\21\uffff\1\u00c2",
            "\1\u00c0\21\uffff\1\u00c2",
            "\1\u00c0\21\uffff\1\u00c2",
            "\1\u00c0\21\uffff\1\u00c2",
            "\1\u00c0\21\uffff\1\u00c2",
            "\1\u00c0\21\uffff\1\u00c2",
            "\1\u00c0\21\uffff\1\u00c2",
            "\1\u00c0\21\uffff\1\u00c2",
            "\1\u00c0\21\uffff\1\u00c2",
            "\1\u00c0\21\uffff\1\u00c2",
            "\1\u00c0\21\uffff\1\u00c2",
            "\1\u00c0\21\uffff\1\u00c2",
            "\1\u00c0\21\uffff\1\u00c2",
            "\1\u00c4\21\uffff\1\u00c2\3\uffff\1\u00c3\41\uffff\1\u00cc"+
            "\1\u00d3\1\u00d5\1\u00ce\1\u00c7\1\u00d0\1\u00c9\1\u00d6\1\u00cd"+
            "\14\uffff\1\u00d4\1\u00ca\1\u00cf\1\u00c6\1\u00d2\1\u00cb\1"+
            "\u00c5\1\u00d1\1\u00c8",
            "\1\u00d8\21\uffff\1\u00c2\3\uffff\1\u00d7\41\uffff\1\u00d9"+
            "\24\uffff\1\u00da",
            "\1\u00c0\21\uffff\1\u00c2",
            "\1\u00c0\21\uffff\1\u00c2",
            "\1\u00c0\21\uffff\1\u00c2",
            "\1\u00c0\21\uffff\1\u00c2",
            "\1\u00c0\21\uffff\1\u00c2",
            "\1\u00c0\21\uffff\1\u00c2",
            "\1\u00c0\21\uffff\1\u00c2",
            "\1\u00c0\21\uffff\1\u00c2",
            "\1\u00c0\21\uffff\1\u00c2",
            "\1\u00c0\21\uffff\1\u00c2",
            "\1\u00c0\21\uffff\1\u00c2",
            "\1\u00c0\21\uffff\1\u00c2",
            "\1\u00c0\21\uffff\1\u00c2",
            "\1\u00c0\21\uffff\1\u00c2",
            "\1\u00c0\21\uffff\1\u00c2",
            "\1\u00c0\21\uffff\1\u00c2",
            "\1\u00c0\21\uffff\1\u00c2",
            "\1\u00c0\21\uffff\1\u00c2",
            "\1\u00c0\21\uffff\1\u00c2",
            "\1\u00c0\21\uffff\1\u00c2",
            "\1\u00c0\21\uffff\1\u00c2",
            "\1\u00c0\21\uffff\1\u00c2",
            "\1\u00c0\21\uffff\1\u00c2",
            "\1\u00c0\21\uffff\1\u00c2",
            "\1\u00c0\21\uffff\1\u00c2",
            "\1\u00c0\21\uffff\1\u00c2",
            "\1\u00c0\21\uffff\1\u00c2",
            "\1\u00c0\21\uffff\1\u00c2",
            "\1\u00c0\21\uffff\1\u00c2",
            "\1\u00c0\21\uffff\1\u00c2",
            "\1\u00c0\21\uffff\1\u00c2",
            "\1\154\1\uffff\1\155\1\156\1\157\1\160\1\161\1\162\1\163\1"+
            "\164\1\165\1\166\1\167",
            "\1\u00b3\21\uffff\1\u00b2",
            "",
            "\1\u00b4\17\uffff\1\u00e2\1\uffff\1\u00db\34\uffff\1\u00b4"+
            "\1\u00dc\1\u00b4\1\u00dd\1\u00de\1\u00df\1\u00e0\1\u00e1",
            "",
            "\1\u00b3\21\uffff\1\u00b2",
            "\1\u00b3\21\uffff\1\u00b2",
            "\1\u00b3\21\uffff\1\u00b2",
            "\1\u00b3\21\uffff\1\u00b2",
            "\1\u00b3\21\uffff\1\u00b2",
            "\1\u00b3\21\uffff\1\u00b2",
            "\1\u00b3\21\uffff\1\u00b2",
            "\1\u00b3\21\uffff\1\u00b2",
            "\1\u00b3\21\uffff\1\u00b2",
            "\1\u00b3\21\uffff\1\u00b2",
            "\1\u00b3\21\uffff\1\u00b2",
            "\1\u00c1\17\uffff\1\u00e4\1\uffff\1\u00e3\34\uffff\1\u00c1"+
            "\1\u00e5\1\u00c1\1\u00e6\1\u00e7\1\u00e8\1\u00e9\1\u00ea",
            "",
            "",
            "\1\u00cc\1\u00d3\1\u00d5\1\u00ce\1\u00c7\1\u00d0\1\u00c9\1"+
            "\u00d6\1\u00cd\14\uffff\1\u00d4\1\u00ca\1\u00cf\1\u00c6\1\u00d2"+
            "\1\u00cb\1\u00c5\1\u00d1\1\u00c8",
            "\1\u00c1\17\uffff\1\u00e4\1\uffff\1\u00e3\34\uffff\1\u00c1"+
            "\1\u00e5\1\u00c1\1\u00e6\1\u00e7\1\u00e8\1\u00e9\1\u00ea\1\u00cc"+
            "\1\u00d3\1\u00d5\1\u00ce\1\u00c7\1\u00d0\1\u00c9\1\u00d6\1\u00cd"+
            "\14\uffff\1\u00d4\1\u00ca\1\u00cf\1\u00c6\1\u00d2\1\u00cb\1"+
            "\u00c5\1\u00d1\1\u00c8",
            "\1\u00c0\21\uffff\1\u00c2",
            "\1\u00c0\21\uffff\1\u00c2",
            "\1\u00c0\21\uffff\1\u00c2",
            "\1\u00c0\21\uffff\1\u00c2",
            "\1\u00c0\21\uffff\1\u00c2",
            "\1\u00c0\21\uffff\1\u00c2",
            "\1\u00c0\21\uffff\1\u00c2",
            "\1\u00c0\21\uffff\1\u00c2",
            "\1\u00c0\21\uffff\1\u00c2",
            "\1\u00c0\21\uffff\1\u00c2",
            "\1\u00c0\21\uffff\1\u00c2",
            "\1\u00c0\21\uffff\1\u00c2",
            "\1\u00c0\21\uffff\1\u00c2",
            "\1\u00c0\21\uffff\1\u00c2",
            "\1\u00c0\21\uffff\1\u00c2",
            "\1\u00c0\21\uffff\1\u00c2",
            "\1\u00c0\21\uffff\1\u00c2",
            "\1\u00c0\21\uffff\1\u00c2",
            "\1\u00d9\24\uffff\1\u00da",
            "\1\u00c1\17\uffff\1\u00e4\1\uffff\1\u00e3\34\uffff\1\u00c1"+
            "\1\u00e5\1\u00c1\1\u00e6\1\u00e7\1\u00e8\1\u00e9\1\u00ea\1\u00d9"+
            "\24\uffff\1\u00da",
            "\1\u00c0\21\uffff\1\u00c2",
            "\1\u00c0\21\uffff\1\u00c2",
            "",
            "\1\u00b4\52\uffff\1\u00b4\2\uffff\2\u00b4\1\uffff\1\u00eb\1"+
            "\uffff\1\u00ec\1\u00ed\1\u00ee\1\u00ef\1\u00f0",
            "\1\u00b4\52\uffff\1\u00b4\2\uffff\2\u00b4\1\uffff\1\u00eb\1"+
            "\uffff\1\u00ec\1\u00ed\1\u00ee\1\u00ef\1\u00f0",
            "\1\u00b4\52\uffff\1\u00b4\2\uffff\2\u00b4\1\uffff\1\u00eb\1"+
            "\uffff\1\u00ec\1\u00ed\1\u00ee\1\u00ef\1\u00f0",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00c1\52\uffff\1\u00c1\2\uffff\2\u00c1\1\uffff\1\u00f1\1"+
            "\uffff\1\u00f2\1\u00f3\1\u00f4\1\u00f5\1\u00f6",
            "\1\u00c1\52\uffff\1\u00c1\2\uffff\2\u00c1\1\uffff\1\u00f1\1"+
            "\uffff\1\u00f2\1\u00f3\1\u00f4\1\u00f5\1\u00f6",
            "\1\u00c1\52\uffff\1\u00c1\2\uffff\2\u00c1\1\uffff\1\u00f1\1"+
            "\uffff\1\u00f2\1\u00f3\1\u00f4\1\u00f5\1\u00f6",
            "",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
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
            return "47:5: ( ( relaxed_day_of_month WHITE_SPACE ( OF WHITE_SPACE )? relaxed_month relaxed_year )=> relaxed_day_of_month WHITE_SPACE ( OF WHITE_SPACE )? relaxed_month relaxed_year | ( relaxed_month WHITE_SPACE relaxed_day_of_month relaxed_year )=> relaxed_month WHITE_SPACE relaxed_day_of_month relaxed_year | relaxed_day_of_month WHITE_SPACE ( OF WHITE_SPACE )? relaxed_month | relaxed_month WHITE_SPACE relaxed_day_of_month )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA9_186 = input.LA(1);

                         
                        int index9_186 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA9_186==COMMA) && (synpred2_Date())) {s = 178;}

                        else if ( (LA9_186==WHITE_SPACE) ) {s = 179;}

                        else if ( (LA9_186==EOF) ) {s = 180;}

                         
                        input.seek(index9_186);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA9_244 = input.LA(1);

                         
                        int index9_244 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Date()) ) {s = 246;}

                        else if ( (true) ) {s = 193;}

                         
                        input.seek(index9_244);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA9_245 = input.LA(1);

                         
                        int index9_245 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Date()) ) {s = 246;}

                        else if ( (true) ) {s = 193;}

                         
                        input.seek(index9_245);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA9_112 = input.LA(1);

                         
                        int index9_112 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA9_112==DOT) ) {s = 184;}

                        else if ( (LA9_112==WHITE_SPACE) ) {s = 179;}

                        else if ( (LA9_112==EOF) ) {s = 180;}

                        else if ( (LA9_112==COMMA) && (synpred2_Date())) {s = 178;}

                         
                        input.seek(index9_112);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA9_243 = input.LA(1);

                         
                        int index9_243 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Date()) ) {s = 246;}

                        else if ( (true) ) {s = 193;}

                         
                        input.seek(index9_243);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA9_210 = input.LA(1);

                         
                        int index9_210 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA9_210==COMMA) && (synpred3_Date())) {s = 194;}

                        else if ( (LA9_210==WHITE_SPACE) ) {s = 192;}

                        else if ( (LA9_210==EOF) ) {s = 193;}

                         
                        input.seek(index9_210);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA9_242 = input.LA(1);

                         
                        int index9_242 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Date()) ) {s = 246;}

                        else if ( (true) ) {s = 193;}

                         
                        input.seek(index9_242);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA9_187 = input.LA(1);

                         
                        int index9_187 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA9_187==WHITE_SPACE) ) {s = 179;}

                        else if ( (LA9_187==EOF) ) {s = 180;}

                        else if ( (LA9_187==COMMA) && (synpred2_Date())) {s = 178;}

                         
                        input.seek(index9_187);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA9_179 = input.LA(1);

                         
                        int index9_179 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA9_179==IN) && (synpred2_Date())) {s = 219;}

                        else if ( (LA9_179==INT_00) ) {s = 220;}

                        else if ( (LA9_179==INT_01_TO_12) ) {s = 221;}

                        else if ( (LA9_179==INT_13_TO_23) ) {s = 222;}

                        else if ( (LA9_179==INT_24_TO_31) && (synpred2_Date())) {s = 223;}

                        else if ( (LA9_179==INT_32_TO_59) && (synpred2_Date())) {s = 224;}

                        else if ( (LA9_179==INT_60_TO_99) && (synpred2_Date())) {s = 225;}

                        else if ( (LA9_179==AT||LA9_179==INT_0||LA9_179==INT_1_TO_9) ) {s = 180;}

                        else if ( (LA9_179==SINGLE_QUOTE) && (synpred2_Date())) {s = 226;}

                         
                        input.seek(index9_179);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA9_169 = input.LA(1);

                         
                        int index9_169 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA9_169==COMMA) && (synpred3_Date())) {s = 194;}

                        else if ( (LA9_169==WHITE_SPACE) ) {s = 192;}

                        else if ( (LA9_169==EOF) ) {s = 193;}

                         
                        input.seek(index9_169);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA9_217 = input.LA(1);

                         
                        int index9_217 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA9_217==WHITE_SPACE) ) {s = 192;}

                        else if ( (LA9_217==EOF) ) {s = 193;}

                        else if ( (LA9_217==COMMA) && (synpred3_Date())) {s = 194;}

                         
                        input.seek(index9_217);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA9_188 = input.LA(1);

                         
                        int index9_188 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA9_188==COMMA) && (synpred2_Date())) {s = 178;}

                        else if ( (LA9_188==WHITE_SPACE) ) {s = 179;}

                        else if ( (LA9_188==EOF) ) {s = 180;}

                         
                        input.seek(index9_188);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA9_229 = input.LA(1);

                         
                        int index9_229 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA9_229==EOF||LA9_229==WHITE_SPACE||LA9_229==COLON||(LA9_229>=AM && LA9_229<=PM)) ) {s = 193;}

                        else if ( (LA9_229==INT_00) ) {s = 241;}

                        else if ( (LA9_229==INT_01_TO_12) ) {s = 242;}

                        else if ( (LA9_229==INT_13_TO_23) ) {s = 243;}

                        else if ( (LA9_229==INT_24_TO_31) ) {s = 244;}

                        else if ( (LA9_229==INT_32_TO_59) ) {s = 245;}

                        else if ( (LA9_229==INT_60_TO_99) && (synpred3_Date())) {s = 246;}

                         
                        input.seek(index9_229);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA9_230 = input.LA(1);

                         
                        int index9_230 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA9_230==EOF||LA9_230==WHITE_SPACE||LA9_230==COLON||(LA9_230>=AM && LA9_230<=PM)) ) {s = 193;}

                        else if ( (LA9_230==INT_00) ) {s = 241;}

                        else if ( (LA9_230==INT_01_TO_12) ) {s = 242;}

                        else if ( (LA9_230==INT_13_TO_23) ) {s = 243;}

                        else if ( (LA9_230==INT_24_TO_31) ) {s = 244;}

                        else if ( (LA9_230==INT_32_TO_59) ) {s = 245;}

                        else if ( (LA9_230==INT_60_TO_99) && (synpred3_Date())) {s = 246;}

                         
                        input.seek(index9_230);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA9_205 = input.LA(1);

                         
                        int index9_205 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA9_205==WHITE_SPACE) ) {s = 192;}

                        else if ( (LA9_205==EOF) ) {s = 193;}

                        else if ( (LA9_205==COMMA) && (synpred3_Date())) {s = 194;}

                         
                        input.seek(index9_205);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA9_111 = input.LA(1);

                         
                        int index9_111 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA9_111==DOT) ) {s = 183;}

                        else if ( (LA9_111==COMMA) && (synpred2_Date())) {s = 178;}

                        else if ( (LA9_111==WHITE_SPACE) ) {s = 179;}

                        else if ( (LA9_111==EOF) ) {s = 180;}

                         
                        input.seek(index9_111);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA9_241 = input.LA(1);

                         
                        int index9_241 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Date()) ) {s = 246;}

                        else if ( (true) ) {s = 193;}

                         
                        input.seek(index9_241);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA9_216 = input.LA(1);

                         
                        int index9_216 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA9_216==ONE) ) {s = 217;}

                        else if ( (LA9_216==AT||LA9_216==INT_0||LA9_216==INT_1_TO_9) ) {s = 193;}

                        else if ( (LA9_216==INT_00) ) {s = 229;}

                        else if ( (LA9_216==INT_01_TO_12) ) {s = 230;}

                        else if ( (LA9_216==INT_13_TO_23) ) {s = 231;}

                        else if ( (LA9_216==IN) && (synpred3_Date())) {s = 227;}

                        else if ( (LA9_216==SINGLE_QUOTE) && (synpred3_Date())) {s = 228;}

                        else if ( (LA9_216==FIRST) ) {s = 218;}

                        else if ( (LA9_216==INT_24_TO_31) && (synpred3_Date())) {s = 232;}

                        else if ( (LA9_216==INT_32_TO_59) && (synpred3_Date())) {s = 233;}

                        else if ( (LA9_216==INT_60_TO_99) && (synpred3_Date())) {s = 234;}

                         
                        input.seek(index9_216);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA9_119 = input.LA(1);

                         
                        int index9_119 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA9_119==DOT) ) {s = 191;}

                        else if ( (LA9_119==WHITE_SPACE) ) {s = 179;}

                        else if ( (LA9_119==EOF) ) {s = 180;}

                        else if ( (LA9_119==COMMA) && (synpred2_Date())) {s = 178;}

                         
                        input.seek(index9_119);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA9_198 = input.LA(1);

                         
                        int index9_198 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA9_198==WHITE_SPACE) ) {s = 192;}

                        else if ( (LA9_198==EOF) ) {s = 193;}

                        else if ( (LA9_198==COMMA) && (synpred3_Date())) {s = 194;}

                         
                        input.seek(index9_198);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA9_231 = input.LA(1);

                         
                        int index9_231 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA9_231==EOF||LA9_231==WHITE_SPACE||LA9_231==COLON||(LA9_231>=AM && LA9_231<=PM)) ) {s = 193;}

                        else if ( (LA9_231==INT_00) ) {s = 241;}

                        else if ( (LA9_231==INT_01_TO_12) ) {s = 242;}

                        else if ( (LA9_231==INT_13_TO_23) ) {s = 243;}

                        else if ( (LA9_231==INT_24_TO_31) ) {s = 244;}

                        else if ( (LA9_231==INT_32_TO_59) ) {s = 245;}

                        else if ( (LA9_231==INT_60_TO_99) && (synpred3_Date())) {s = 246;}

                         
                        input.seek(index9_231);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA9_214 = input.LA(1);

                         
                        int index9_214 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA9_214==COMMA) && (synpred3_Date())) {s = 194;}

                        else if ( (LA9_214==WHITE_SPACE) ) {s = 192;}

                        else if ( (LA9_214==EOF) ) {s = 193;}

                         
                        input.seek(index9_214);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA9_189 = input.LA(1);

                         
                        int index9_189 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA9_189==WHITE_SPACE) ) {s = 179;}

                        else if ( (LA9_189==EOF) ) {s = 180;}

                        else if ( (LA9_189==COMMA) && (synpred2_Date())) {s = 178;}

                         
                        input.seek(index9_189);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA9_168 = input.LA(1);

                         
                        int index9_168 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA9_168==COMMA) && (synpred3_Date())) {s = 194;}

                        else if ( (LA9_168==WHITE_SPACE) ) {s = 192;}

                        else if ( (LA9_168==EOF) ) {s = 193;}

                         
                        input.seek(index9_168);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA9_197 = input.LA(1);

                         
                        int index9_197 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA9_197==WHITE_SPACE) ) {s = 192;}

                        else if ( (LA9_197==EOF) ) {s = 193;}

                        else if ( (LA9_197==COMMA) && (synpred3_Date())) {s = 194;}

                         
                        input.seek(index9_197);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA9_235 = input.LA(1);

                         
                        int index9_235 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_Date()) ) {s = 240;}

                        else if ( (true) ) {s = 180;}

                         
                        input.seek(index9_235);
                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA9_236 = input.LA(1);

                         
                        int index9_236 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_Date()) ) {s = 240;}

                        else if ( (true) ) {s = 180;}

                         
                        input.seek(index9_236);
                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA9_196 = input.LA(1);

                         
                        int index9_196 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA9_196==NINTH) ) {s = 200;}

                        else if ( (LA9_196==FIVE) ) {s = 199;}

                        else if ( (LA9_196==SEVEN) ) {s = 201;}

                        else if ( (LA9_196==SEVENTH) ) {s = 197;}

                        else if ( (LA9_196==SECOND) ) {s = 202;}

                        else if ( (LA9_196==AT||LA9_196==INT_0||LA9_196==INT_1_TO_9) ) {s = 193;}

                        else if ( (LA9_196==INT_00) ) {s = 229;}

                        else if ( (LA9_196==INT_01_TO_12) ) {s = 230;}

                        else if ( (LA9_196==INT_13_TO_23) ) {s = 231;}

                        else if ( (LA9_196==FOUR) ) {s = 206;}

                        else if ( (LA9_196==IN) && (synpred3_Date())) {s = 227;}

                        else if ( (LA9_196==INT_24_TO_31) && (synpred3_Date())) {s = 232;}

                        else if ( (LA9_196==INT_32_TO_59) && (synpred3_Date())) {s = 233;}

                        else if ( (LA9_196==INT_60_TO_99) && (synpred3_Date())) {s = 234;}

                        else if ( (LA9_196==THIRD) ) {s = 207;}

                        else if ( (LA9_196==SIX) ) {s = 208;}

                        else if ( (LA9_196==ONE) ) {s = 204;}

                        else if ( (LA9_196==EIGHTH) ) {s = 209;}

                        else if ( (LA9_196==NINE) ) {s = 205;}

                        else if ( (LA9_196==SIXTH) ) {s = 203;}

                        else if ( (LA9_196==FIRST) ) {s = 212;}

                        else if ( (LA9_196==THREE) ) {s = 213;}

                        else if ( (LA9_196==EIGHT) ) {s = 214;}

                        else if ( (LA9_196==FIFTH) ) {s = 210;}

                        else if ( (LA9_196==TWO) ) {s = 211;}

                        else if ( (LA9_196==FOURTH) ) {s = 198;}

                        else if ( (LA9_196==SINGLE_QUOTE) && (synpred3_Date())) {s = 228;}

                         
                        input.seek(index9_196);
                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA9_110 = input.LA(1);

                         
                        int index9_110 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA9_110==DOT) ) {s = 182;}

                        else if ( (LA9_110==COMMA) && (synpred2_Date())) {s = 178;}

                        else if ( (LA9_110==WHITE_SPACE) ) {s = 179;}

                        else if ( (LA9_110==EOF) ) {s = 180;}

                         
                        input.seek(index9_110);
                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA9_117 = input.LA(1);

                         
                        int index9_117 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA9_117==DOT) ) {s = 189;}

                        else if ( (LA9_117==COMMA) && (synpred2_Date())) {s = 178;}

                        else if ( (LA9_117==WHITE_SPACE) ) {s = 179;}

                        else if ( (LA9_117==EOF) ) {s = 180;}

                         
                        input.seek(index9_117);
                        if ( s>=0 ) return s;
                        break;
                    case 30 : 
                        int LA9_190 = input.LA(1);

                         
                        int index9_190 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA9_190==WHITE_SPACE) ) {s = 179;}

                        else if ( (LA9_190==EOF) ) {s = 180;}

                        else if ( (LA9_190==COMMA) && (synpred2_Date())) {s = 178;}

                         
                        input.seek(index9_190);
                        if ( s>=0 ) return s;
                        break;
                    case 31 : 
                        int LA9_171 = input.LA(1);

                         
                        int index9_171 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA9_171==COMMA) && (synpred3_Date())) {s = 194;}

                        else if ( (LA9_171==WHITE_SPACE) ) {s = 192;}

                        else if ( (LA9_171==EOF) ) {s = 193;}

                         
                        input.seek(index9_171);
                        if ( s>=0 ) return s;
                        break;
                    case 32 : 
                        int LA9_192 = input.LA(1);

                         
                        int index9_192 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA9_192==IN) && (synpred3_Date())) {s = 227;}

                        else if ( (LA9_192==SINGLE_QUOTE) && (synpred3_Date())) {s = 228;}

                        else if ( (LA9_192==AT||LA9_192==INT_0||LA9_192==INT_1_TO_9) ) {s = 193;}

                        else if ( (LA9_192==INT_00) ) {s = 229;}

                        else if ( (LA9_192==INT_01_TO_12) ) {s = 230;}

                        else if ( (LA9_192==INT_13_TO_23) ) {s = 231;}

                        else if ( (LA9_192==INT_24_TO_31) && (synpred3_Date())) {s = 232;}

                        else if ( (LA9_192==INT_32_TO_59) && (synpred3_Date())) {s = 233;}

                        else if ( (LA9_192==INT_60_TO_99) && (synpred3_Date())) {s = 234;}

                         
                        input.seek(index9_192);
                        if ( s>=0 ) return s;
                        break;
                    case 33 : 
                        int LA9_124 = input.LA(1);

                         
                        int index9_124 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA9_124==WHITE_SPACE) ) {s = 192;}

                        else if ( (LA9_124==EOF) ) {s = 193;}

                        else if ( (LA9_124==COMMA) && (synpred3_Date())) {s = 194;}

                         
                        input.seek(index9_124);
                        if ( s>=0 ) return s;
                        break;
                    case 34 : 
                        int LA9_191 = input.LA(1);

                         
                        int index9_191 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA9_191==COMMA) && (synpred2_Date())) {s = 178;}

                        else if ( (LA9_191==WHITE_SPACE) ) {s = 179;}

                        else if ( (LA9_191==EOF) ) {s = 180;}

                         
                        input.seek(index9_191);
                        if ( s>=0 ) return s;
                        break;
                    case 35 : 
                        int LA9_237 = input.LA(1);

                         
                        int index9_237 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_Date()) ) {s = 240;}

                        else if ( (true) ) {s = 180;}

                         
                        input.seek(index9_237);
                        if ( s>=0 ) return s;
                        break;
                    case 36 : 
                        int LA9_238 = input.LA(1);

                         
                        int index9_238 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_Date()) ) {s = 240;}

                        else if ( (true) ) {s = 180;}

                         
                        input.seek(index9_238);
                        if ( s>=0 ) return s;
                        break;
                    case 37 : 
                        int LA9_239 = input.LA(1);

                         
                        int index9_239 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_Date()) ) {s = 240;}

                        else if ( (true) ) {s = 180;}

                         
                        input.seek(index9_239);
                        if ( s>=0 ) return s;
                        break;
                    case 38 : 
                        int LA9_109 = input.LA(1);

                         
                        int index9_109 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA9_109==DOT) ) {s = 181;}

                        else if ( (LA9_109==COMMA) && (synpred2_Date())) {s = 178;}

                        else if ( (LA9_109==WHITE_SPACE) ) {s = 179;}

                        else if ( (LA9_109==EOF) ) {s = 180;}

                         
                        input.seek(index9_109);
                        if ( s>=0 ) return s;
                        break;
                    case 39 : 
                        int LA9_118 = input.LA(1);

                         
                        int index9_118 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA9_118==DOT) ) {s = 190;}

                        else if ( (LA9_118==WHITE_SPACE) ) {s = 179;}

                        else if ( (LA9_118==EOF) ) {s = 180;}

                        else if ( (LA9_118==COMMA) && (synpred2_Date())) {s = 178;}

                         
                        input.seek(index9_118);
                        if ( s>=0 ) return s;
                        break;
                    case 40 : 
                        int LA9_203 = input.LA(1);

                         
                        int index9_203 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA9_203==WHITE_SPACE) ) {s = 192;}

                        else if ( (LA9_203==EOF) ) {s = 193;}

                        else if ( (LA9_203==COMMA) && (synpred3_Date())) {s = 194;}

                         
                        input.seek(index9_203);
                        if ( s>=0 ) return s;
                        break;
                    case 41 : 
                        int LA9_163 = input.LA(1);

                         
                        int index9_163 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA9_163==WHITE_SPACE) ) {s = 192;}

                        else if ( (LA9_163==EOF) ) {s = 193;}

                        else if ( (LA9_163==COMMA) && (synpred3_Date())) {s = 194;}

                         
                        input.seek(index9_163);
                        if ( s>=0 ) return s;
                        break;
                    case 42 : 
                        int LA9_164 = input.LA(1);

                         
                        int index9_164 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA9_164==WHITE_SPACE) ) {s = 192;}

                        else if ( (LA9_164==EOF) ) {s = 193;}

                        else if ( (LA9_164==COMMA) && (synpred3_Date())) {s = 194;}

                         
                        input.seek(index9_164);
                        if ( s>=0 ) return s;
                        break;
                    case 43 : 
                        int LA9_170 = input.LA(1);

                         
                        int index9_170 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA9_170==COMMA) && (synpred3_Date())) {s = 194;}

                        else if ( (LA9_170==WHITE_SPACE) ) {s = 192;}

                        else if ( (LA9_170==EOF) ) {s = 193;}

                         
                        input.seek(index9_170);
                        if ( s>=0 ) return s;
                        break;
                    case 44 : 
                        int LA9_161 = input.LA(1);

                         
                        int index9_161 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA9_161==WHITE_SPACE) ) {s = 192;}

                        else if ( (LA9_161==EOF) ) {s = 193;}

                        else if ( (LA9_161==COMMA) && (synpred3_Date())) {s = 194;}

                         
                        input.seek(index9_161);
                        if ( s>=0 ) return s;
                        break;
                    case 45 : 
                        int LA9_162 = input.LA(1);

                         
                        int index9_162 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA9_162==WHITE_SPACE) ) {s = 192;}

                        else if ( (LA9_162==EOF) ) {s = 193;}

                        else if ( (LA9_162==COMMA) && (synpred3_Date())) {s = 194;}

                         
                        input.seek(index9_162);
                        if ( s>=0 ) return s;
                        break;
                    case 46 : 
                        int LA9_149 = input.LA(1);

                         
                        int index9_149 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA9_149==WHITE_SPACE) ) {s = 192;}

                        else if ( (LA9_149==EOF) ) {s = 193;}

                        else if ( (LA9_149==COMMA) && (synpred3_Date())) {s = 194;}

                         
                        input.seek(index9_149);
                        if ( s>=0 ) return s;
                        break;
                    case 47 : 
                        int LA9_173 = input.LA(1);

                         
                        int index9_173 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA9_173==COMMA) && (synpred3_Date())) {s = 194;}

                        else if ( (LA9_173==WHITE_SPACE) ) {s = 192;}

                        else if ( (LA9_173==EOF) ) {s = 193;}

                         
                        input.seek(index9_173);
                        if ( s>=0 ) return s;
                        break;
                    case 48 : 
                        int LA9_150 = input.LA(1);

                         
                        int index9_150 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA9_150==WHITE_SPACE) ) {s = 192;}

                        else if ( (LA9_150==EOF) ) {s = 193;}

                        else if ( (LA9_150==COMMA) && (synpred3_Date())) {s = 194;}

                         
                        input.seek(index9_150);
                        if ( s>=0 ) return s;
                        break;
                    case 49 : 
                        int LA9_151 = input.LA(1);

                         
                        int index9_151 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA9_151==COMMA) && (synpred3_Date())) {s = 194;}

                        else if ( (LA9_151==WHITE_SPACE) ) {s = 192;}

                        else if ( (LA9_151==EOF) ) {s = 193;}

                         
                        input.seek(index9_151);
                        if ( s>=0 ) return s;
                        break;
                    case 50 : 
                        int LA9_141 = input.LA(1);

                         
                        int index9_141 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA9_141==COMMA) && (synpred3_Date())) {s = 194;}

                        else if ( (LA9_141==WHITE_SPACE) ) {s = 192;}

                        else if ( (LA9_141==EOF) ) {s = 193;}

                         
                        input.seek(index9_141);
                        if ( s>=0 ) return s;
                        break;
                    case 51 : 
                        int LA9_212 = input.LA(1);

                         
                        int index9_212 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA9_212==WHITE_SPACE) ) {s = 192;}

                        else if ( (LA9_212==EOF) ) {s = 193;}

                        else if ( (LA9_212==COMMA) && (synpred3_Date())) {s = 194;}

                         
                        input.seek(index9_212);
                        if ( s>=0 ) return s;
                        break;
                    case 52 : 
                        int LA9_152 = input.LA(1);

                         
                        int index9_152 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA9_152==COMMA) && (synpred3_Date())) {s = 194;}

                        else if ( (LA9_152==WHITE_SPACE) ) {s = 192;}

                        else if ( (LA9_152==EOF) ) {s = 193;}

                         
                        input.seek(index9_152);
                        if ( s>=0 ) return s;
                        break;
                    case 53 : 
                        int LA9_142 = input.LA(1);

                         
                        int index9_142 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA9_142==COMMA) && (synpred3_Date())) {s = 194;}

                        else if ( (LA9_142==WHITE_SPACE) ) {s = 192;}

                        else if ( (LA9_142==EOF) ) {s = 193;}

                         
                        input.seek(index9_142);
                        if ( s>=0 ) return s;
                        break;
                    case 54 : 
                        int LA9_145 = input.LA(1);

                         
                        int index9_145 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA9_145==WHITE_SPACE) ) {s = 192;}

                        else if ( (LA9_145==EOF) ) {s = 193;}

                        else if ( (LA9_145==COMMA) && (synpred3_Date())) {s = 194;}

                         
                        input.seek(index9_145);
                        if ( s>=0 ) return s;
                        break;
                    case 55 : 
                        int LA9_146 = input.LA(1);

                         
                        int index9_146 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA9_146==WHITE_SPACE) ) {s = 192;}

                        else if ( (LA9_146==EOF) ) {s = 193;}

                        else if ( (LA9_146==COMMA) && (synpred3_Date())) {s = 194;}

                         
                        input.seek(index9_146);
                        if ( s>=0 ) return s;
                        break;
                    case 56 : 
                        int LA9_147 = input.LA(1);

                         
                        int index9_147 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA9_147==WHITE_SPACE) ) {s = 192;}

                        else if ( (LA9_147==EOF) ) {s = 193;}

                        else if ( (LA9_147==COMMA) && (synpred3_Date())) {s = 194;}

                         
                        input.seek(index9_147);
                        if ( s>=0 ) return s;
                        break;
                    case 57 : 
                        int LA9_108 = input.LA(1);

                         
                        int index9_108 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA9_108==DOT) ) {s = 177;}

                        else if ( (LA9_108==COMMA) && (synpred2_Date())) {s = 178;}

                        else if ( (LA9_108==WHITE_SPACE) ) {s = 179;}

                        else if ( (LA9_108==EOF) ) {s = 180;}

                         
                        input.seek(index9_108);
                        if ( s>=0 ) return s;
                        break;
                    case 58 : 
                        int LA9_115 = input.LA(1);

                         
                        int index9_115 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA9_115==DOT) ) {s = 187;}

                        else if ( (LA9_115==WHITE_SPACE) ) {s = 179;}

                        else if ( (LA9_115==EOF) ) {s = 180;}

                        else if ( (LA9_115==COMMA) && (synpred2_Date())) {s = 178;}

                         
                        input.seek(index9_115);
                        if ( s>=0 ) return s;
                        break;
                    case 59 : 
                        int LA9_148 = input.LA(1);

                         
                        int index9_148 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA9_148==WHITE_SPACE) ) {s = 192;}

                        else if ( (LA9_148==EOF) ) {s = 193;}

                        else if ( (LA9_148==COMMA) && (synpred3_Date())) {s = 194;}

                         
                        input.seek(index9_148);
                        if ( s>=0 ) return s;
                        break;
                    case 60 : 
                        int LA9_157 = input.LA(1);

                         
                        int index9_157 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA9_157==WHITE_SPACE) ) {s = 192;}

                        else if ( (LA9_157==EOF) ) {s = 193;}

                        else if ( (LA9_157==COMMA) && (synpred3_Date())) {s = 194;}

                         
                        input.seek(index9_157);
                        if ( s>=0 ) return s;
                        break;
                    case 61 : 
                        int LA9_158 = input.LA(1);

                         
                        int index9_158 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA9_158==WHITE_SPACE) ) {s = 192;}

                        else if ( (LA9_158==EOF) ) {s = 193;}

                        else if ( (LA9_158==COMMA) && (synpred3_Date())) {s = 194;}

                         
                        input.seek(index9_158);
                        if ( s>=0 ) return s;
                        break;
                    case 62 : 
                        int LA9_204 = input.LA(1);

                         
                        int index9_204 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA9_204==COMMA) && (synpred3_Date())) {s = 194;}

                        else if ( (LA9_204==WHITE_SPACE) ) {s = 192;}

                        else if ( (LA9_204==EOF) ) {s = 193;}

                         
                        input.seek(index9_204);
                        if ( s>=0 ) return s;
                        break;
                    case 63 : 
                        int LA9_144 = input.LA(1);

                         
                        int index9_144 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA9_144==DASH) ) {s = 215;}

                        else if ( (LA9_144==WHITE_SPACE) ) {s = 216;}

                        else if ( (LA9_144==ONE) ) {s = 217;}

                        else if ( (LA9_144==COMMA) && (synpred3_Date())) {s = 194;}

                        else if ( (LA9_144==FIRST) ) {s = 218;}

                        else if ( (LA9_144==EOF) ) {s = 193;}

                         
                        input.seek(index9_144);
                        if ( s>=0 ) return s;
                        break;
                    case 64 : 
                        int LA9_159 = input.LA(1);

                         
                        int index9_159 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA9_159==COMMA) && (synpred3_Date())) {s = 194;}

                        else if ( (LA9_159==WHITE_SPACE) ) {s = 192;}

                        else if ( (LA9_159==EOF) ) {s = 193;}

                         
                        input.seek(index9_159);
                        if ( s>=0 ) return s;
                        break;
                    case 65 : 
                        int LA9_160 = input.LA(1);

                         
                        int index9_160 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA9_160==COMMA) && (synpred3_Date())) {s = 194;}

                        else if ( (LA9_160==WHITE_SPACE) ) {s = 192;}

                        else if ( (LA9_160==EOF) ) {s = 193;}

                         
                        input.seek(index9_160);
                        if ( s>=0 ) return s;
                        break;
                    case 66 : 
                        int LA9_211 = input.LA(1);

                         
                        int index9_211 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA9_211==WHITE_SPACE) ) {s = 192;}

                        else if ( (LA9_211==EOF) ) {s = 193;}

                        else if ( (LA9_211==COMMA) && (synpred3_Date())) {s = 194;}

                         
                        input.seek(index9_211);
                        if ( s>=0 ) return s;
                        break;
                    case 67 : 
                        int LA9_153 = input.LA(1);

                         
                        int index9_153 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA9_153==WHITE_SPACE) ) {s = 192;}

                        else if ( (LA9_153==EOF) ) {s = 193;}

                        else if ( (LA9_153==COMMA) && (synpred3_Date())) {s = 194;}

                         
                        input.seek(index9_153);
                        if ( s>=0 ) return s;
                        break;
                    case 68 : 
                        int LA9_154 = input.LA(1);

                         
                        int index9_154 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA9_154==WHITE_SPACE) ) {s = 192;}

                        else if ( (LA9_154==EOF) ) {s = 193;}

                        else if ( (LA9_154==COMMA) && (synpred3_Date())) {s = 194;}

                         
                        input.seek(index9_154);
                        if ( s>=0 ) return s;
                        break;
                    case 69 : 
                        int LA9_155 = input.LA(1);

                         
                        int index9_155 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA9_155==WHITE_SPACE) ) {s = 192;}

                        else if ( (LA9_155==EOF) ) {s = 193;}

                        else if ( (LA9_155==COMMA) && (synpred3_Date())) {s = 194;}

                         
                        input.seek(index9_155);
                        if ( s>=0 ) return s;
                        break;
                    case 70 : 
                        int LA9_156 = input.LA(1);

                         
                        int index9_156 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA9_156==WHITE_SPACE) ) {s = 192;}

                        else if ( (LA9_156==EOF) ) {s = 193;}

                        else if ( (LA9_156==COMMA) && (synpred3_Date())) {s = 194;}

                         
                        input.seek(index9_156);
                        if ( s>=0 ) return s;
                        break;
                    case 71 : 
                        int LA9_166 = input.LA(1);

                         
                        int index9_166 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA9_166==WHITE_SPACE) ) {s = 192;}

                        else if ( (LA9_166==EOF) ) {s = 193;}

                        else if ( (LA9_166==COMMA) && (synpred3_Date())) {s = 194;}

                         
                        input.seek(index9_166);
                        if ( s>=0 ) return s;
                        break;
                    case 72 : 
                        int LA9_128 = input.LA(1);

                         
                        int index9_128 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA9_128==WHITE_SPACE) ) {s = 192;}

                        else if ( (LA9_128==EOF) ) {s = 193;}

                        else if ( (LA9_128==COMMA) && (synpred3_Date())) {s = 194;}

                         
                        input.seek(index9_128);
                        if ( s>=0 ) return s;
                        break;
                    case 73 : 
                        int LA9_116 = input.LA(1);

                         
                        int index9_116 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA9_116==DOT) ) {s = 188;}

                        else if ( (LA9_116==COMMA) && (synpred2_Date())) {s = 178;}

                        else if ( (LA9_116==WHITE_SPACE) ) {s = 179;}

                        else if ( (LA9_116==EOF) ) {s = 180;}

                         
                        input.seek(index9_116);
                        if ( s>=0 ) return s;
                        break;
                    case 74 : 
                        int LA9_127 = input.LA(1);

                         
                        int index9_127 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA9_127==WHITE_SPACE) ) {s = 192;}

                        else if ( (LA9_127==EOF) ) {s = 193;}

                        else if ( (LA9_127==COMMA) && (synpred3_Date())) {s = 194;}

                         
                        input.seek(index9_127);
                        if ( s>=0 ) return s;
                        break;
                    case 75 : 
                        int LA9_126 = input.LA(1);

                         
                        int index9_126 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA9_126==WHITE_SPACE) ) {s = 192;}

                        else if ( (LA9_126==EOF) ) {s = 193;}

                        else if ( (LA9_126==COMMA) && (synpred3_Date())) {s = 194;}

                         
                        input.seek(index9_126);
                        if ( s>=0 ) return s;
                        break;
                    case 76 : 
                        int LA9_125 = input.LA(1);

                         
                        int index9_125 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA9_125==WHITE_SPACE) ) {s = 192;}

                        else if ( (LA9_125==EOF) ) {s = 193;}

                        else if ( (LA9_125==COMMA) && (synpred3_Date())) {s = 194;}

                         
                        input.seek(index9_125);
                        if ( s>=0 ) return s;
                        break;
                    case 77 : 
                        int LA9_172 = input.LA(1);

                         
                        int index9_172 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA9_172==COMMA) && (synpred3_Date())) {s = 194;}

                        else if ( (LA9_172==WHITE_SPACE) ) {s = 192;}

                        else if ( (LA9_172==EOF) ) {s = 193;}

                         
                        input.seek(index9_172);
                        if ( s>=0 ) return s;
                        break;
                    case 78 : 
                        int LA9_132 = input.LA(1);

                         
                        int index9_132 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA9_132==WHITE_SPACE) ) {s = 192;}

                        else if ( (LA9_132==EOF) ) {s = 193;}

                        else if ( (LA9_132==COMMA) && (synpred3_Date())) {s = 194;}

                         
                        input.seek(index9_132);
                        if ( s>=0 ) return s;
                        break;
                    case 79 : 
                        int LA9_209 = input.LA(1);

                         
                        int index9_209 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA9_209==WHITE_SPACE) ) {s = 192;}

                        else if ( (LA9_209==EOF) ) {s = 193;}

                        else if ( (LA9_209==COMMA) && (synpred3_Date())) {s = 194;}

                         
                        input.seek(index9_209);
                        if ( s>=0 ) return s;
                        break;
                    case 80 : 
                        int LA9_131 = input.LA(1);

                         
                        int index9_131 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA9_131==COMMA) && (synpred3_Date())) {s = 194;}

                        else if ( (LA9_131==WHITE_SPACE) ) {s = 192;}

                        else if ( (LA9_131==EOF) ) {s = 193;}

                         
                        input.seek(index9_131);
                        if ( s>=0 ) return s;
                        break;
                    case 81 : 
                        int LA9_130 = input.LA(1);

                         
                        int index9_130 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA9_130==COMMA) && (synpred3_Date())) {s = 194;}

                        else if ( (LA9_130==WHITE_SPACE) ) {s = 192;}

                        else if ( (LA9_130==EOF) ) {s = 193;}

                         
                        input.seek(index9_130);
                        if ( s>=0 ) return s;
                        break;
                    case 82 : 
                        int LA9_129 = input.LA(1);

                         
                        int index9_129 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA9_129==WHITE_SPACE) ) {s = 192;}

                        else if ( (LA9_129==EOF) ) {s = 193;}

                        else if ( (LA9_129==COMMA) && (synpred3_Date())) {s = 194;}

                         
                        input.seek(index9_129);
                        if ( s>=0 ) return s;
                        break;
                    case 83 : 
                        int LA9_121 = input.LA(1);

                         
                        int index9_121 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA9_121==COMMA) && (synpred3_Date())) {s = 194;}

                        else if ( (LA9_121==WHITE_SPACE) ) {s = 192;}

                        else if ( (LA9_121==EOF) ) {s = 193;}

                         
                        input.seek(index9_121);
                        if ( s>=0 ) return s;
                        break;
                    case 84 : 
                        int LA9_136 = input.LA(1);

                         
                        int index9_136 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA9_136==WHITE_SPACE) ) {s = 192;}

                        else if ( (LA9_136==EOF) ) {s = 193;}

                        else if ( (LA9_136==COMMA) && (synpred3_Date())) {s = 194;}

                         
                        input.seek(index9_136);
                        if ( s>=0 ) return s;
                        break;
                    case 85 : 
                        int LA9_165 = input.LA(1);

                         
                        int index9_165 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA9_165==COMMA) && (synpred3_Date())) {s = 194;}

                        else if ( (LA9_165==WHITE_SPACE) ) {s = 192;}

                        else if ( (LA9_165==EOF) ) {s = 193;}

                         
                        input.seek(index9_165);
                        if ( s>=0 ) return s;
                        break;
                    case 86 : 
                        int LA9_120 = input.LA(1);

                         
                        int index9_120 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA9_120==WHITE_SPACE) ) {s = 192;}

                        else if ( (LA9_120==EOF) ) {s = 193;}

                        else if ( (LA9_120==COMMA) && (synpred3_Date())) {s = 194;}

                         
                        input.seek(index9_120);
                        if ( s>=0 ) return s;
                        break;
                    case 87 : 
                        int LA9_135 = input.LA(1);

                         
                        int index9_135 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA9_135==WHITE_SPACE) ) {s = 192;}

                        else if ( (LA9_135==EOF) ) {s = 193;}

                        else if ( (LA9_135==COMMA) && (synpred3_Date())) {s = 194;}

                         
                        input.seek(index9_135);
                        if ( s>=0 ) return s;
                        break;
                    case 88 : 
                        int LA9_123 = input.LA(1);

                         
                        int index9_123 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA9_123==WHITE_SPACE) ) {s = 192;}

                        else if ( (LA9_123==EOF) ) {s = 193;}

                        else if ( (LA9_123==COMMA) && (synpred3_Date())) {s = 194;}

                         
                        input.seek(index9_123);
                        if ( s>=0 ) return s;
                        break;
                    case 89 : 
                        int LA9_134 = input.LA(1);

                         
                        int index9_134 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA9_134==WHITE_SPACE) ) {s = 192;}

                        else if ( (LA9_134==EOF) ) {s = 193;}

                        else if ( (LA9_134==COMMA) && (synpred3_Date())) {s = 194;}

                         
                        input.seek(index9_134);
                        if ( s>=0 ) return s;
                        break;
                    case 90 : 
                        int LA9_143 = input.LA(1);

                         
                        int index9_143 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA9_143==DASH) ) {s = 195;}

                        else if ( (LA9_143==WHITE_SPACE) ) {s = 196;}

                        else if ( (LA9_143==SEVENTH) ) {s = 197;}

                        else if ( (LA9_143==FOURTH) ) {s = 198;}

                        else if ( (LA9_143==FIVE) ) {s = 199;}

                        else if ( (LA9_143==NINTH) ) {s = 200;}

                        else if ( (LA9_143==SEVEN) ) {s = 201;}

                        else if ( (LA9_143==COMMA) && (synpred3_Date())) {s = 194;}

                        else if ( (LA9_143==SECOND) ) {s = 202;}

                        else if ( (LA9_143==SIXTH) ) {s = 203;}

                        else if ( (LA9_143==ONE) ) {s = 204;}

                        else if ( (LA9_143==NINE) ) {s = 205;}

                        else if ( (LA9_143==FOUR) ) {s = 206;}

                        else if ( (LA9_143==THIRD) ) {s = 207;}

                        else if ( (LA9_143==SIX) ) {s = 208;}

                        else if ( (LA9_143==EIGHTH) ) {s = 209;}

                        else if ( (LA9_143==FIFTH) ) {s = 210;}

                        else if ( (LA9_143==TWO) ) {s = 211;}

                        else if ( (LA9_143==FIRST) ) {s = 212;}

                        else if ( (LA9_143==THREE) ) {s = 213;}

                        else if ( (LA9_143==EIGHT) ) {s = 214;}

                        else if ( (LA9_143==EOF) ) {s = 193;}

                         
                        input.seek(index9_143);
                        if ( s>=0 ) return s;
                        break;
                    case 91 : 
                        int LA9_122 = input.LA(1);

                         
                        int index9_122 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA9_122==WHITE_SPACE) ) {s = 192;}

                        else if ( (LA9_122==EOF) ) {s = 193;}

                        else if ( (LA9_122==COMMA) && (synpred3_Date())) {s = 194;}

                         
                        input.seek(index9_122);
                        if ( s>=0 ) return s;
                        break;
                    case 92 : 
                        int LA9_133 = input.LA(1);

                         
                        int index9_133 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA9_133==WHITE_SPACE) ) {s = 192;}

                        else if ( (LA9_133==EOF) ) {s = 193;}

                        else if ( (LA9_133==COMMA) && (synpred3_Date())) {s = 194;}

                         
                        input.seek(index9_133);
                        if ( s>=0 ) return s;
                        break;
                    case 93 : 
                        int LA9_140 = input.LA(1);

                         
                        int index9_140 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA9_140==COMMA) && (synpred3_Date())) {s = 194;}

                        else if ( (LA9_140==WHITE_SPACE) ) {s = 192;}

                        else if ( (LA9_140==EOF) ) {s = 193;}

                         
                        input.seek(index9_140);
                        if ( s>=0 ) return s;
                        break;
                    case 94 : 
                        int LA9_139 = input.LA(1);

                         
                        int index9_139 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA9_139==COMMA) && (synpred3_Date())) {s = 194;}

                        else if ( (LA9_139==WHITE_SPACE) ) {s = 192;}

                        else if ( (LA9_139==EOF) ) {s = 193;}

                         
                        input.seek(index9_139);
                        if ( s>=0 ) return s;
                        break;
                    case 95 : 
                        int LA9_177 = input.LA(1);

                         
                        int index9_177 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA9_177==COMMA) && (synpred2_Date())) {s = 178;}

                        else if ( (LA9_177==WHITE_SPACE) ) {s = 179;}

                        else if ( (LA9_177==EOF) ) {s = 180;}

                         
                        input.seek(index9_177);
                        if ( s>=0 ) return s;
                        break;
                    case 96 : 
                        int LA9_138 = input.LA(1);

                         
                        int index9_138 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA9_138==COMMA) && (synpred3_Date())) {s = 194;}

                        else if ( (LA9_138==WHITE_SPACE) ) {s = 192;}

                        else if ( (LA9_138==EOF) ) {s = 193;}

                         
                        input.seek(index9_138);
                        if ( s>=0 ) return s;
                        break;
                    case 97 : 
                        int LA9_137 = input.LA(1);

                         
                        int index9_137 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA9_137==WHITE_SPACE) ) {s = 192;}

                        else if ( (LA9_137==EOF) ) {s = 193;}

                        else if ( (LA9_137==COMMA) && (synpred3_Date())) {s = 194;}

                         
                        input.seek(index9_137);
                        if ( s>=0 ) return s;
                        break;
                    case 98 : 
                        int LA9_199 = input.LA(1);

                         
                        int index9_199 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA9_199==WHITE_SPACE) ) {s = 192;}

                        else if ( (LA9_199==EOF) ) {s = 193;}

                        else if ( (LA9_199==COMMA) && (synpred3_Date())) {s = 194;}

                         
                        input.seek(index9_199);
                        if ( s>=0 ) return s;
                        break;
                    case 99 : 
                        int LA9_181 = input.LA(1);

                         
                        int index9_181 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA9_181==COMMA) && (synpred2_Date())) {s = 178;}

                        else if ( (LA9_181==WHITE_SPACE) ) {s = 179;}

                        else if ( (LA9_181==EOF) ) {s = 180;}

                         
                        input.seek(index9_181);
                        if ( s>=0 ) return s;
                        break;
                    case 100 : 
                        int LA9_207 = input.LA(1);

                         
                        int index9_207 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA9_207==COMMA) && (synpred3_Date())) {s = 194;}

                        else if ( (LA9_207==WHITE_SPACE) ) {s = 192;}

                        else if ( (LA9_207==EOF) ) {s = 193;}

                         
                        input.seek(index9_207);
                        if ( s>=0 ) return s;
                        break;
                    case 101 : 
                        int LA9_208 = input.LA(1);

                         
                        int index9_208 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA9_208==WHITE_SPACE) ) {s = 192;}

                        else if ( (LA9_208==EOF) ) {s = 193;}

                        else if ( (LA9_208==COMMA) && (synpred3_Date())) {s = 194;}

                         
                        input.seek(index9_208);
                        if ( s>=0 ) return s;
                        break;
                    case 102 : 
                        int LA9_113 = input.LA(1);

                         
                        int index9_113 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA9_113==DOT) ) {s = 185;}

                        else if ( (LA9_113==COMMA) && (synpred2_Date())) {s = 178;}

                        else if ( (LA9_113==WHITE_SPACE) ) {s = 179;}

                        else if ( (LA9_113==EOF) ) {s = 180;}

                         
                        input.seek(index9_113);
                        if ( s>=0 ) return s;
                        break;
                    case 103 : 
                        int LA9_174 = input.LA(1);

                         
                        int index9_174 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA9_174==COMMA) && (synpred3_Date())) {s = 194;}

                        else if ( (LA9_174==WHITE_SPACE) ) {s = 192;}

                        else if ( (LA9_174==EOF) ) {s = 193;}

                         
                        input.seek(index9_174);
                        if ( s>=0 ) return s;
                        break;
                    case 104 : 
                        int LA9_182 = input.LA(1);

                         
                        int index9_182 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA9_182==WHITE_SPACE) ) {s = 179;}

                        else if ( (LA9_182==EOF) ) {s = 180;}

                        else if ( (LA9_182==COMMA) && (synpred2_Date())) {s = 178;}

                         
                        input.seek(index9_182);
                        if ( s>=0 ) return s;
                        break;
                    case 105 : 
                        int LA9_218 = input.LA(1);

                         
                        int index9_218 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA9_218==COMMA) && (synpred3_Date())) {s = 194;}

                        else if ( (LA9_218==WHITE_SPACE) ) {s = 192;}

                        else if ( (LA9_218==EOF) ) {s = 193;}

                         
                        input.seek(index9_218);
                        if ( s>=0 ) return s;
                        break;
                    case 106 : 
                        int LA9_201 = input.LA(1);

                         
                        int index9_201 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA9_201==WHITE_SPACE) ) {s = 192;}

                        else if ( (LA9_201==EOF) ) {s = 193;}

                        else if ( (LA9_201==COMMA) && (synpred3_Date())) {s = 194;}

                         
                        input.seek(index9_201);
                        if ( s>=0 ) return s;
                        break;
                    case 107 : 
                        int LA9_183 = input.LA(1);

                         
                        int index9_183 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA9_183==COMMA) && (synpred2_Date())) {s = 178;}

                        else if ( (LA9_183==WHITE_SPACE) ) {s = 179;}

                        else if ( (LA9_183==EOF) ) {s = 180;}

                         
                        input.seek(index9_183);
                        if ( s>=0 ) return s;
                        break;
                    case 108 : 
                        int LA9_202 = input.LA(1);

                         
                        int index9_202 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA9_202==WHITE_SPACE) ) {s = 192;}

                        else if ( (LA9_202==EOF) ) {s = 193;}

                        else if ( (LA9_202==COMMA) && (synpred3_Date())) {s = 194;}

                         
                        input.seek(index9_202);
                        if ( s>=0 ) return s;
                        break;
                    case 109 : 
                        int LA9_221 = input.LA(1);

                         
                        int index9_221 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA9_221==EOF||LA9_221==WHITE_SPACE||LA9_221==COLON||(LA9_221>=AM && LA9_221<=PM)) ) {s = 180;}

                        else if ( (LA9_221==INT_00) ) {s = 235;}

                        else if ( (LA9_221==INT_01_TO_12) ) {s = 236;}

                        else if ( (LA9_221==INT_13_TO_23) ) {s = 237;}

                        else if ( (LA9_221==INT_24_TO_31) ) {s = 238;}

                        else if ( (LA9_221==INT_32_TO_59) ) {s = 239;}

                        else if ( (LA9_221==INT_60_TO_99) && (synpred2_Date())) {s = 240;}

                         
                        input.seek(index9_221);
                        if ( s>=0 ) return s;
                        break;
                    case 110 : 
                        int LA9_213 = input.LA(1);

                         
                        int index9_213 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA9_213==COMMA) && (synpred3_Date())) {s = 194;}

                        else if ( (LA9_213==WHITE_SPACE) ) {s = 192;}

                        else if ( (LA9_213==EOF) ) {s = 193;}

                         
                        input.seek(index9_213);
                        if ( s>=0 ) return s;
                        break;
                    case 111 : 
                        int LA9_114 = input.LA(1);

                         
                        int index9_114 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA9_114==DOT) ) {s = 186;}

                        else if ( (LA9_114==COMMA) && (synpred2_Date())) {s = 178;}

                        else if ( (LA9_114==WHITE_SPACE) ) {s = 179;}

                        else if ( (LA9_114==EOF) ) {s = 180;}

                         
                        input.seek(index9_114);
                        if ( s>=0 ) return s;
                        break;
                    case 112 : 
                        int LA9_220 = input.LA(1);

                         
                        int index9_220 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA9_220==EOF||LA9_220==WHITE_SPACE||LA9_220==COLON||(LA9_220>=AM && LA9_220<=PM)) ) {s = 180;}

                        else if ( (LA9_220==INT_00) ) {s = 235;}

                        else if ( (LA9_220==INT_01_TO_12) ) {s = 236;}

                        else if ( (LA9_220==INT_13_TO_23) ) {s = 237;}

                        else if ( (LA9_220==INT_24_TO_31) ) {s = 238;}

                        else if ( (LA9_220==INT_32_TO_59) ) {s = 239;}

                        else if ( (LA9_220==INT_60_TO_99) && (synpred2_Date())) {s = 240;}

                         
                        input.seek(index9_220);
                        if ( s>=0 ) return s;
                        break;
                    case 113 : 
                        int LA9_175 = input.LA(1);

                         
                        int index9_175 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA9_175==WHITE_SPACE) ) {s = 192;}

                        else if ( (LA9_175==EOF) ) {s = 193;}

                        else if ( (LA9_175==COMMA) && (synpred3_Date())) {s = 194;}

                         
                        input.seek(index9_175);
                        if ( s>=0 ) return s;
                        break;
                    case 114 : 
                        int LA9_184 = input.LA(1);

                         
                        int index9_184 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA9_184==COMMA) && (synpred2_Date())) {s = 178;}

                        else if ( (LA9_184==WHITE_SPACE) ) {s = 179;}

                        else if ( (LA9_184==EOF) ) {s = 180;}

                         
                        input.seek(index9_184);
                        if ( s>=0 ) return s;
                        break;
                    case 115 : 
                        int LA9_200 = input.LA(1);

                         
                        int index9_200 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA9_200==COMMA) && (synpred3_Date())) {s = 194;}

                        else if ( (LA9_200==WHITE_SPACE) ) {s = 192;}

                        else if ( (LA9_200==EOF) ) {s = 193;}

                         
                        input.seek(index9_200);
                        if ( s>=0 ) return s;
                        break;
                    case 116 : 
                        int LA9_206 = input.LA(1);

                         
                        int index9_206 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA9_206==COMMA) && (synpred3_Date())) {s = 194;}

                        else if ( (LA9_206==WHITE_SPACE) ) {s = 192;}

                        else if ( (LA9_206==EOF) ) {s = 193;}

                         
                        input.seek(index9_206);
                        if ( s>=0 ) return s;
                        break;
                    case 117 : 
                        int LA9_222 = input.LA(1);

                         
                        int index9_222 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA9_222==EOF||LA9_222==WHITE_SPACE||LA9_222==COLON||(LA9_222>=AM && LA9_222<=PM)) ) {s = 180;}

                        else if ( (LA9_222==INT_00) ) {s = 235;}

                        else if ( (LA9_222==INT_01_TO_12) ) {s = 236;}

                        else if ( (LA9_222==INT_13_TO_23) ) {s = 237;}

                        else if ( (LA9_222==INT_24_TO_31) ) {s = 238;}

                        else if ( (LA9_222==INT_32_TO_59) ) {s = 239;}

                        else if ( (LA9_222==INT_60_TO_99) && (synpred2_Date())) {s = 240;}

                         
                        input.seek(index9_222);
                        if ( s>=0 ) return s;
                        break;
                    case 118 : 
                        int LA9_167 = input.LA(1);

                         
                        int index9_167 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA9_167==COMMA) && (synpred3_Date())) {s = 194;}

                        else if ( (LA9_167==WHITE_SPACE) ) {s = 192;}

                        else if ( (LA9_167==EOF) ) {s = 193;}

                         
                        input.seek(index9_167);
                        if ( s>=0 ) return s;
                        break;
                    case 119 : 
                        int LA9_185 = input.LA(1);

                         
                        int index9_185 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA9_185==WHITE_SPACE) ) {s = 179;}

                        else if ( (LA9_185==EOF) ) {s = 180;}

                        else if ( (LA9_185==COMMA) && (synpred2_Date())) {s = 178;}

                         
                        input.seek(index9_185);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 9, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA24_eotS =
        "\14\uffff";
    static final String DFA24_eofS =
        "\14\uffff";
    static final String DFA24_minS =
        "\2\23\2\44\1\23\2\uffff\1\47\1\23\1\50\1\23\1\44";
    static final String DFA24_maxS =
        "\1\45\3\112\1\23\2\uffff\1\47\1\23\1\50\1\23\1\112";
    static final String DFA24_acceptS =
        "\5\uffff\1\1\1\2\5\uffff";
    static final String DFA24_specialS =
        "\14\uffff}>";
    static final String[] DFA24_transitionS = {
            "\1\2\21\uffff\1\1",
            "\1\3\20\uffff\1\5\1\uffff\1\4\35\uffff\1\6\1\uffff\5\6",
            "\1\5\1\uffff\1\4\35\uffff\1\6\1\uffff\5\6",
            "\1\5\1\uffff\1\4\35\uffff\1\6\1\uffff\5\6",
            "\1\7",
            "",
            "",
            "\1\10",
            "\1\11",
            "\1\12",
            "\1\13",
            "\1\5\37\uffff\1\6\1\uffff\5\6"
    };

    static final short[] DFA24_eot = DFA.unpackEncodedString(DFA24_eotS);
    static final short[] DFA24_eof = DFA.unpackEncodedString(DFA24_eofS);
    static final char[] DFA24_min = DFA.unpackEncodedStringToUnsignedChars(DFA24_minS);
    static final char[] DFA24_max = DFA.unpackEncodedStringToUnsignedChars(DFA24_maxS);
    static final short[] DFA24_accept = DFA.unpackEncodedString(DFA24_acceptS);
    static final short[] DFA24_special = DFA.unpackEncodedString(DFA24_specialS);
    static final short[][] DFA24_transition;

    static {
        int numStates = DFA24_transitionS.length;
        DFA24_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA24_transition[i] = DFA.unpackEncodedString(DFA24_transitionS[i]);
        }
    }

    class DFA24 extends DFA {

        public DFA24(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 24;
            this.eot = DFA24_eot;
            this.eof = DFA24_eof;
            this.min = DFA24_min;
            this.max = DFA24_max;
            this.accept = DFA24_accept;
            this.special = DFA24_special;
            this.transition = DFA24_transition;
        }
        public String getDescription() {
            return "82:1: relaxed_year : ( relaxed_year_prefix SINGLE_QUOTE int_00_to_99_mandatory_prefix -> ^( YEAR_OF int_00_to_99_mandatory_prefix ) | relaxed_year_prefix int_four_digits -> ^( YEAR_OF int_four_digits ) );";
        }
    }
    static final String DFA31_eotS =
        "\70\uffff";
    static final String DFA31_eofS =
        "\53\uffff\13\2\2\uffff";
    static final String DFA31_minS =
        "\1\46\2\uffff\31\23\1\50\1\113\1\50\11\23\1\113\1\50\14\23\1\24"+
        "\1\uffff";
    static final String DFA31_maxS =
        "\1\137\2\uffff\27\23\1\123\1\113\1\72\2\123\11\23\2\113\14\23\1"+
        "\u0080\1\uffff";
    static final String DFA31_acceptS =
        "\1\uffff\1\1\1\2\64\uffff\1\3";
    static final String DFA31_specialS =
        "\70\uffff}>";
    static final String[] DFA31_transitionS = {
            "\1\2\7\uffff\6\2\7\uffff\3\1\7\uffff\1\3\1\4\1\5\1\6\2\uffff"+
            "\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22"+
            "\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33",
            "",
            "",
            "\1\34",
            "\1\34",
            "\1\34",
            "\1\34",
            "\1\34",
            "\1\34",
            "\1\34",
            "\1\34",
            "\1\34",
            "\1\34",
            "\1\34",
            "\1\34",
            "\1\34",
            "\1\34",
            "\1\34",
            "\1\34",
            "\1\34",
            "\1\34",
            "\1\34",
            "\1\34",
            "\1\34",
            "\1\34",
            "\1\34",
            "\1\36\25\uffff\1\35\41\uffff\1\41\1\47\1\40\1\42\1\46\1\44"+
            "\1\45\1\37\1\43",
            "\1\51\25\uffff\1\50\41\uffff\1\52",
            "\1\65\2\uffff\1\62\1\63\1\64\6\uffff\1\53\1\54\1\55\1\56\1"+
            "\57\1\60\1\61",
            "\1\41\1\47\1\40\1\42\1\46\1\44\1\45\1\37\1\43",
            "\1\65\2\uffff\1\62\1\63\1\64\6\uffff\1\53\1\54\1\55\1\56\1"+
            "\57\1\60\1\61\20\uffff\1\41\1\47\1\40\1\42\1\46\1\44\1\45\1"+
            "\37\1\43",
            "\1\34",
            "\1\34",
            "\1\34",
            "\1\34",
            "\1\34",
            "\1\34",
            "\1\34",
            "\1\34",
            "\1\34",
            "\1\52",
            "\1\65\2\uffff\1\62\1\63\1\64\6\uffff\1\53\1\54\1\55\1\56\1"+
            "\57\1\60\1\61\20\uffff\1\52",
            "\1\34",
            "\1\66",
            "\1\66",
            "\1\66",
            "\1\66",
            "\1\66",
            "\1\66",
            "\1\66",
            "\1\66",
            "\1\66",
            "\1\66",
            "\1\66",
            "\1\2\56\uffff\5\2\67\uffff\2\67",
            ""
    };

    static final short[] DFA31_eot = DFA.unpackEncodedString(DFA31_eotS);
    static final short[] DFA31_eof = DFA.unpackEncodedString(DFA31_eofS);
    static final char[] DFA31_min = DFA.unpackEncodedStringToUnsignedChars(DFA31_minS);
    static final char[] DFA31_max = DFA.unpackEncodedStringToUnsignedChars(DFA31_maxS);
    static final short[] DFA31_accept = DFA.unpackEncodedString(DFA31_acceptS);
    static final short[] DFA31_special = DFA.unpackEncodedString(DFA31_specialS);
    static final short[][] DFA31_transition;

    static {
        int numStates = DFA31_transitionS.length;
        DFA31_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA31_transition[i] = DFA.unpackEncodedString(DFA31_transitionS[i]);
        }
    }

    class DFA31 extends DFA {

        public DFA31(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 31;
            this.eot = DFA31_eot;
            this.eof = DFA31_eof;
            this.min = DFA31_min;
            this.max = DFA31_max;
            this.accept = DFA31_accept;
            this.special = DFA31_special;
            this.transition = DFA31_transition;
        }
        public String getDescription() {
            return "121:1: relative_date : ( named_relative_date | relative_prefix WHITE_SPACE relative_target -> ^( RELATIVE_DATE relative_prefix relative_target ) | spelled_or_int_01_to_31_optional_prefix WHITE_SPACE relative_target WHITE_SPACE relative_suffix -> ^( RELATIVE_DATE relative_suffix spelled_or_int_01_to_31_optional_prefix relative_target ) );";
        }
    }
    static final String DFA69_eotS =
        "\45\uffff";
    static final String DFA69_eofS =
        "\24\uffff\1\32\1\43\17\uffff";
    static final String DFA69_minS =
        "\1\113\23\uffff\2\23\1\113\1\24\12\uffff\1\24\2\uffff";
    static final String DFA69_maxS =
        "\1\137\23\uffff\1\123\1\113\2\123\12\uffff\1\113\2\uffff";
    static final String DFA69_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1"+
        "\15\1\16\1\17\1\20\1\21\1\22\1\23\4\uffff\1\27\1\31\1\24\1\26\1"+
        "\32\1\25\1\33\1\35\1\30\1\34\1\uffff\1\36\1\37";
    static final String DFA69_specialS =
        "\45\uffff}>";
    static final String[] DFA69_transitionS = {
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
            "\1\27\21\uffff\1\32\3\uffff\1\26\41\uffff\1\35\1\33\1\30\1"+
            "\40\1\31\1\34\1\36\1\41\1\37",
            "\1\42\21\uffff\1\43\3\uffff\1\44\41\uffff\1\44",
            "\1\35\1\33\1\30\1\40\1\31\1\34\1\36\1\41\1\37",
            "\1\32\1\uffff\2\32\1\uffff\14\32\1\uffff\1\32\1\uffff\1\32"+
            "\2\uffff\3\32\6\uffff\7\32\10\uffff\10\32\1\35\1\33\1\30\1\40"+
            "\1\31\1\34\1\36\1\41\1\37",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\43\1\uffff\2\43\1\uffff\14\43\1\uffff\1\43\1\uffff\1\43"+
            "\2\uffff\3\43\6\uffff\7\43\10\uffff\10\43\1\44",
            "",
            ""
    };

    static final short[] DFA69_eot = DFA.unpackEncodedString(DFA69_eotS);
    static final short[] DFA69_eof = DFA.unpackEncodedString(DFA69_eofS);
    static final char[] DFA69_min = DFA.unpackEncodedStringToUnsignedChars(DFA69_minS);
    static final char[] DFA69_max = DFA.unpackEncodedStringToUnsignedChars(DFA69_maxS);
    static final short[] DFA69_accept = DFA.unpackEncodedString(DFA69_acceptS);
    static final short[] DFA69_special = DFA.unpackEncodedString(DFA69_specialS);
    static final short[][] DFA69_transition;

    static {
        int numStates = DFA69_transitionS.length;
        DFA69_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA69_transition[i] = DFA.unpackEncodedString(DFA69_transitionS[i]);
        }
    }

    class DFA69 extends DFA {

        public DFA69(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 69;
            this.eot = DFA69_eot;
            this.eof = DFA69_eof;
            this.min = DFA69_min;
            this.max = DFA69_max;
            this.accept = DFA69_accept;
            this.special = DFA69_special;
            this.transition = DFA69_transition;
        }
        public String getDescription() {
            return "253:1: spelled_one_to_thirty_one : ( ONE -> INT[\"1\"] | TWO -> INT[\"2\"] | THREE -> INT[\"3\"] | FOUR -> INT[\"4\"] | FIVE -> INT[\"5\"] | SIX -> INT[\"6\"] | SEVEN -> INT[\"7\"] | EIGHT -> INT[\"8\"] | NINE -> INT[\"9\"] | TEN -> INT[\"10\"] | ELEVEN -> INT[\"11\"] | TWELVE -> INT[\"12\"] | THIRTEEN -> INT[\"13\"] | FOURTEEN -> INT[\"14\"] | FIFTEEN -> INT[\"15\"] | SIXTEEN -> INT[\"16\"] | SEVENTEEN -> INT[\"17\"] | EIGHTEEN -> INT[\"18\"] | NINETEEN -> INT[\"19\"] | TWENTY -> INT[\"20\"] | TWENTY ( DASH | WHITE_SPACE )? ONE -> INT[\"21\"] | TWENTY ( DASH | WHITE_SPACE )? TWO -> INT[\"22\"] | TWENTY ( DASH | WHITE_SPACE )? THREE -> INT[\"23\"] | TWENTY ( DASH | WHITE_SPACE )? FOUR -> INT[\"24\"] | TWENTY ( DASH | WHITE_SPACE )? FIVE -> INT[\"25\"] | TWENTY ( DASH | WHITE_SPACE )? SIX -> INT[\"26\"] | TWENTY ( DASH | WHITE_SPACE )? SEVEN -> INT[\"27\"] | TWENTY ( DASH | WHITE_SPACE )? EIGHT -> INT[\"28\"] | TWENTY ( DASH | WHITE_SPACE )? NINE -> INT[\"29\"] | THIRTY -> INT[\"30\"] | THIRTY ( DASH | WHITE_SPACE )? ONE -> INT[\"31\"] );";
        }
    }
    static final String DFA90_eotS =
        "\43\uffff";
    static final String DFA90_eofS =
        "\43\uffff";
    static final String DFA90_minS =
        "\1\136\25\uffff\1\23\12\uffff\2\140";
    static final String DFA90_maxS =
        "\1\176\25\uffff\1\150\12\uffff\2\150";
    static final String DFA90_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1"+
        "\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\uffff\1\26\1\27\1"+
        "\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37\2\uffff";
    static final String DFA90_specialS =
        "\43\uffff}>";
    static final String[] DFA90_transitionS = {
            "\1\26\1\40\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1"+
            "\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\27\1\30\1"+
            "\31\1\32\1\33\1\34\1\35\1\36\1\37\1\40",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\42\25\uffff\1\41\66\uffff\1\25\1\27\1\30\1\31\1\32\1\33"+
            "\1\34\1\35\1\36",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\25\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36",
            "\1\25\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36"
    };

    static final short[] DFA90_eot = DFA.unpackEncodedString(DFA90_eotS);
    static final short[] DFA90_eof = DFA.unpackEncodedString(DFA90_eofS);
    static final char[] DFA90_min = DFA.unpackEncodedStringToUnsignedChars(DFA90_minS);
    static final char[] DFA90_max = DFA.unpackEncodedStringToUnsignedChars(DFA90_maxS);
    static final short[] DFA90_accept = DFA.unpackEncodedString(DFA90_acceptS);
    static final short[] DFA90_special = DFA.unpackEncodedString(DFA90_specialS);
    static final short[][] DFA90_transition;

    static {
        int numStates = DFA90_transitionS.length;
        DFA90_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA90_transition[i] = DFA.unpackEncodedString(DFA90_transitionS[i]);
        }
    }

    class DFA90 extends DFA {

        public DFA90(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 90;
            this.eot = DFA90_eot;
            this.eof = DFA90_eof;
            this.min = DFA90_min;
            this.max = DFA90_max;
            this.accept = DFA90_accept;
            this.special = DFA90_special;
            this.transition = DFA90_transition;
        }
        public String getDescription() {
            return "288:1: spelled_first_to_thirty_first : ( FIRST -> INT[\"1\"] | SECOND -> INT[\"2\"] | THIRD -> INT[\"3\"] | FOURTH -> INT[\"4\"] | FIFTH -> INT[\"5\"] | SIXTH -> INT[\"6\"] | SEVENTH -> INT[\"7\"] | EIGHTH -> INT[\"8\"] | NINTH -> INT[\"9\"] | TENTH -> INT[\"10\"] | ELEVENTH -> INT[\"11\"] | TWELFTH -> INT[\"12\"] | THIRTEENTH -> INT[\"13\"] | FOURTEENTH -> INT[\"14\"] | FIFTEENTH -> INT[\"15\"] | SIXTEENTH -> INT[\"16\"] | SEVENTEENTH -> INT[\"17\"] | EIGHTEENTH -> INT[\"18\"] | NINETEENTH -> INT[\"19\"] | TWENTIETH -> INT[\"20\"] | ( TWENTY_FIRST | ( TWENTY ( DASH | WHITE_SPACE )? FIRST ) ) -> INT[\"21\"] | ( TWENTY_SECOND | ( TWENTY ( DASH | WHITE_SPACE )? SECOND ) ) -> INT[\"22\"] | ( TWENTY_THIRD | ( TWENTY ( DASH | WHITE_SPACE )? THIRD ) ) -> INT[\"23\"] | ( TWENTY_FOURTH | ( TWENTY ( DASH | WHITE_SPACE )? FOURTH ) ) -> INT[\"24\"] | ( TWENTY_FIFTH | ( TWENTY ( DASH | WHITE_SPACE )? FIFTH ) ) -> INT[\"25\"] | ( TWENTY_SIXTH | ( TWENTY ( DASH | WHITE_SPACE )? SIXTH ) ) -> INT[\"26\"] | ( TWENTY_SEVENTH | ( TWENTY ( DASH | WHITE_SPACE )? SEVENTH ) ) -> INT[\"27\"] | ( TWENTY_EIGHTH | ( TWENTY ( DASH | WHITE_SPACE )? EIGHTH ) ) -> INT[\"28\"] | ( TWENTY_NINTH | ( TWENTY ( DASH | WHITE_SPACE )? NINTH ) ) -> INT[\"29\"] | THIRTIETH -> INT[\"30\"] | ( THIRTY_FIRST | ( THIRTY ( DASH | WHITE_SPACE )? FIRST ) ) -> INT[\"31\"] );";
        }
    }
 

    public static final BitSet FOLLOW_date_in_date_time160 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_date_time163 = new BitSet(new long[]{0x0000000000100000L,0x00000000000000F8L});
    public static final BitSet FOLLOW_AT_in_date_time166 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_date_time168 = new BitSet(new long[]{0x0000000000100000L,0x00000000000000F8L});
    public static final BitSet FOLLOW_time_in_date_time172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_time_in_date_time191 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_date_time194 = new BitSet(new long[]{0x380FC04FFEA00000L,0x7FFFFFFFFFFFFFF0L});
    public static final BitSet FOLLOW_ON_in_date_time197 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_date_time199 = new BitSet(new long[]{0x380FC04FFEA00000L,0x7FFFFFFFFFFFFFF0L});
    public static final BitSet FOLLOW_date_in_date_time203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_formal_date_in_date236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relaxed_date_in_date242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relative_date_in_date248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relaxed_day_of_month_in_relaxed_date321 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_relaxed_date323 = new BitSet(new long[]{0x0000000FFEC00000L});
    public static final BitSet FOLLOW_OF_in_relaxed_date326 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_relaxed_date328 = new BitSet(new long[]{0x0000000FFE800000L});
    public static final BitSet FOLLOW_relaxed_month_in_relaxed_date332 = new BitSet(new long[]{0x0000002000080000L});
    public static final BitSet FOLLOW_relaxed_year_in_relaxed_date334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relaxed_month_in_relaxed_date368 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_relaxed_date370 = new BitSet(new long[]{0x0000000000000000L,0x7FFFFFFFFFFFF9E0L});
    public static final BitSet FOLLOW_relaxed_day_of_month_in_relaxed_date372 = new BitSet(new long[]{0x0000002000080000L});
    public static final BitSet FOLLOW_relaxed_year_in_relaxed_date374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relaxed_day_of_month_in_relaxed_date389 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_relaxed_date391 = new BitSet(new long[]{0x0000000FFEC00000L});
    public static final BitSet FOLLOW_OF_in_relaxed_date394 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_relaxed_date396 = new BitSet(new long[]{0x0000000FFE800000L});
    public static final BitSet FOLLOW_relaxed_month_in_relaxed_date400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relaxed_month_in_relaxed_date410 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_relaxed_date412 = new BitSet(new long[]{0x0000000000000000L,0x7FFFFFFFFFFFF9E0L});
    public static final BitSet FOLLOW_relaxed_day_of_month_in_relaxed_date414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_JANUARY_in_relaxed_month446 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_DOT_in_relaxed_month448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FEBRUARY_in_relaxed_month466 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_DOT_in_relaxed_month468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MARCH_in_relaxed_month485 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_DOT_in_relaxed_month487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_APRIL_in_relaxed_month507 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_DOT_in_relaxed_month509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MAY_in_relaxed_month529 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_DOT_in_relaxed_month531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_JUNE_in_relaxed_month553 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_DOT_in_relaxed_month555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_JULY_in_relaxed_month576 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_DOT_in_relaxed_month578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AUGUST_in_relaxed_month599 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_DOT_in_relaxed_month601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEPTEMBER_in_relaxed_month620 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_DOT_in_relaxed_month622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OCTOBER_in_relaxed_month638 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_DOT_in_relaxed_month640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOVEMBER_in_relaxed_month658 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_DOT_in_relaxed_month660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DECEMBER_in_relaxed_month677 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_DOT_in_relaxed_month679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spelled_or_int_01_to_31_optional_prefix_in_relaxed_day_of_month705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spelled_first_to_thirty_first_in_relaxed_day_of_month719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relaxed_year_prefix_in_relaxed_year753 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_SINGLE_QUOTE_in_relaxed_year755 = new BitSet(new long[]{0x0000000000000000L,0x00000000000007D0L});
    public static final BitSet FOLLOW_int_00_to_99_mandatory_prefix_in_relaxed_year757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relaxed_year_prefix_in_relaxed_year771 = new BitSet(new long[]{0x0000000000000000L,0x00000000000007D0L});
    public static final BitSet FOLLOW_int_four_digits_in_relaxed_year773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMMA_in_relaxed_year_prefix824 = new BitSet(new long[]{0x0000004000080002L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_relaxed_year_prefix826 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_relaxed_year_prefix831 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_IN_in_relaxed_year_prefix835 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_relaxed_year_prefix837 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_THE_in_relaxed_year_prefix839 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_relaxed_year_prefix841 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_YEAR_in_relaxed_year_prefix843 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_relaxed_year_prefix845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_int_four_digits_in_formal_date869 = new BitSet(new long[]{0x0000060000000000L});
    public static final BitSet FOLLOW_formal_date_separator_in_formal_date871 = new BitSet(new long[]{0x0000000000000000L,0x00000000000007F0L});
    public static final BitSet FOLLOW_formal_month_of_year_in_formal_date873 = new BitSet(new long[]{0x0000060000000000L});
    public static final BitSet FOLLOW_formal_date_separator_in_formal_date875 = new BitSet(new long[]{0x0000000000000000L,0x00000000000001E0L});
    public static final BitSet FOLLOW_formal_day_of_month_in_formal_date877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_formal_month_of_year_in_formal_date888 = new BitSet(new long[]{0x0000060000000000L});
    public static final BitSet FOLLOW_formal_date_separator_in_formal_date890 = new BitSet(new long[]{0x0000000000000000L,0x00000000000001E0L});
    public static final BitSet FOLLOW_formal_day_of_month_in_formal_date892 = new BitSet(new long[]{0x0000060000000002L});
    public static final BitSet FOLLOW_formal_date_separator_in_formal_date895 = new BitSet(new long[]{0x0000000000000000L,0x00000000000007D0L});
    public static final BitSet FOLLOW_formal_year_in_formal_date897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_int_01_to_12_optional_prefix_in_formal_month_of_year912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_int_01_to_31_optional_prefix_in_formal_day_of_month935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_int_four_digits_in_formal_year958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_int_00_to_99_mandatory_prefix_in_formal_year986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_formal_date_separator0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_named_relative_date_in_relative_date1034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relative_prefix_in_relative_date1041 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_relative_date1043 = new BitSet(new long[]{0x07F0390000000000L});
    public static final BitSet FOLLOW_relative_target_in_relative_date1045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spelled_or_int_01_to_31_optional_prefix_in_relative_date1068 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_relative_date1070 = new BitSet(new long[]{0x07F0390000000000L});
    public static final BitSet FOLLOW_relative_target_in_relative_date1072 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_relative_date1074 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_relative_suffix_in_relative_date1076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DAY_in_relative_date_span1110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WEEK_in_relative_date_span1123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MONTH_in_relative_date_span1135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_YEAR_in_relative_date_span1146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_day_of_week_in_relative_target1167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relative_date_span_in_relative_target1174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIS_in_relative_prefix1190 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_relative_prefix1192 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_LAST_in_relative_prefix1196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIS_in_relative_prefix1214 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_relative_prefix1216 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_NEXT_in_relative_prefix1220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIS_in_relative_prefix1242 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_relative_prefix1244 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_PAST_in_relative_prefix1248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIS_in_relative_prefix1270 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_relative_prefix1272 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_COMING_in_relative_prefix1276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIS_in_relative_prefix1296 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_relative_prefix1298 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_UPCOMING_in_relative_prefix1302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IN_in_relative_prefix1320 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_relative_prefix1322 = new BitSet(new long[]{0x0000000000000000L,0x00000000FFFFF9E0L});
    public static final BitSet FOLLOW_spelled_or_int_01_to_31_optional_prefix_in_relative_prefix1326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_127_in_relative_suffix1351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_128_in_relative_suffix1365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SUNDAY_in_day_of_week1392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MONDAY_in_day_of_week1406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TUESDAY_in_day_of_week1420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WEDNESDAY_in_day_of_week1433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THURSDAY_in_day_of_week1444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FRIDAY_in_day_of_week1456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SATURDAY_in_day_of_week1470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TODAY_in_named_relative_date1491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOMORROW_in_named_relative_date1513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_YESTERDAY_in_named_relative_date1532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_hours_in_time1562 = new BitSet(new long[]{0x4000000000000000L,0x00000000000003D0L});
    public static final BitSet FOLLOW_COLON_in_time1564 = new BitSet(new long[]{0x4000000000000000L,0x00000000000003D0L});
    public static final BitSet FOLLOW_minutes_in_time1567 = new BitSet(new long[]{0x8000000000080002L,0x0000000000000007L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_time1570 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000007L});
    public static final BitSet FOLLOW_meridian_indicator_in_time1574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MILITARY_HOUR_SUFFIX_in_time1579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HOUR_in_time1583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_hours_in_time1619 = new BitSet(new long[]{0x0000000000080002L,0x0000000000000006L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_time1621 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000006L});
    public static final BitSet FOLLOW_meridian_indicator_in_time1624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_int_00_to_23_optional_prefix_in_hours1664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_int_00_to_59_mandatory_prefix_in_minutes1688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AM_in_meridian_indicator1715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PM_in_meridian_indicator1726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_0_in_int_00_to_23_optional_prefix1750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_00_in_int_00_to_23_optional_prefix1756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_1_TO_9_in_int_00_to_23_optional_prefix1762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_01_TO_12_in_int_00_to_23_optional_prefix1768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_13_TO_23_in_int_00_to_23_optional_prefix1774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_00_in_int_00_to_59_mandatory_prefix1796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_01_TO_12_in_int_00_to_59_mandatory_prefix1802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_13_TO_23_in_int_00_to_59_mandatory_prefix1808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_24_TO_31_in_int_00_to_59_mandatory_prefix1814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_32_TO_59_in_int_00_to_59_mandatory_prefix1820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_int_00_to_59_mandatory_prefix_in_int_00_to_99_mandatory_prefix1842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_60_TO_99_in_int_00_to_99_mandatory_prefix1848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_1_TO_9_in_int_01_to_12_optional_prefix1870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_01_TO_12_in_int_01_to_12_optional_prefix1876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_1_TO_9_in_int_01_to_31_optional_prefix1899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_01_TO_12_in_int_01_to_31_optional_prefix1905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_13_TO_23_in_int_01_to_31_optional_prefix1911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_24_TO_31_in_int_01_to_31_optional_prefix1917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_int_00_to_99_mandatory_prefix_in_int_four_digits1939 = new BitSet(new long[]{0x0000000000000000L,0x00000000000007D0L});
    public static final BitSet FOLLOW_int_00_to_99_mandatory_prefix_in_int_four_digits1941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_int_01_to_31_optional_prefix_in_spelled_or_int_01_to_31_optional_prefix1969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spelled_one_to_thirty_one_in_spelled_or_int_01_to_31_optional_prefix1975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ONE_in_spelled_one_to_thirty_one1991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWO_in_spelled_one_to_thirty_one2009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THREE_in_spelled_one_to_thirty_one2027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOUR_in_spelled_one_to_thirty_one2043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FIVE_in_spelled_one_to_thirty_one2060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SIX_in_spelled_one_to_thirty_one2077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEVEN_in_spelled_one_to_thirty_one2095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EIGHT_in_spelled_one_to_thirty_one2111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NINE_in_spelled_one_to_thirty_one2127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEN_in_spelled_one_to_thirty_one2144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELEVEN_in_spelled_one_to_thirty_one2162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWELVE_in_spelled_one_to_thirty_one2177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIRTEEN_in_spelled_one_to_thirty_one2192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOURTEEN_in_spelled_one_to_thirty_one2205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FIFTEEN_in_spelled_one_to_thirty_one2218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SIXTEEN_in_spelled_one_to_thirty_one2232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEVENTEEN_in_spelled_one_to_thirty_one2246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EIGHTEEN_in_spelled_one_to_thirty_one2258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NINETEEN_in_spelled_one_to_thirty_one2271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_one_to_thirty_one2284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_one_to_thirty_one2299 = new BitSet(new long[]{0x0000020000080000L,0x0000000000000800L});
    public static final BitSet FOLLOW_DASH_in_spelled_one_to_thirty_one2302 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_spelled_one_to_thirty_one2306 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_ONE_in_spelled_one_to_thirty_one2310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_one_to_thirty_one2323 = new BitSet(new long[]{0x0000020000080000L,0x0000000000001000L});
    public static final BitSet FOLLOW_DASH_in_spelled_one_to_thirty_one2326 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_spelled_one_to_thirty_one2330 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_TWO_in_spelled_one_to_thirty_one2334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_one_to_thirty_one2347 = new BitSet(new long[]{0x0000020000080000L,0x0000000000002000L});
    public static final BitSet FOLLOW_DASH_in_spelled_one_to_thirty_one2350 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_spelled_one_to_thirty_one2354 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_THREE_in_spelled_one_to_thirty_one2358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_one_to_thirty_one2369 = new BitSet(new long[]{0x0000020000080000L,0x0000000000004000L});
    public static final BitSet FOLLOW_DASH_in_spelled_one_to_thirty_one2372 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_spelled_one_to_thirty_one2376 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_FOUR_in_spelled_one_to_thirty_one2380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_one_to_thirty_one2392 = new BitSet(new long[]{0x0000020000080000L,0x0000000000008000L});
    public static final BitSet FOLLOW_DASH_in_spelled_one_to_thirty_one2395 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_spelled_one_to_thirty_one2399 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_FIVE_in_spelled_one_to_thirty_one2403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_one_to_thirty_one2415 = new BitSet(new long[]{0x0000020000080000L,0x0000000000010000L});
    public static final BitSet FOLLOW_DASH_in_spelled_one_to_thirty_one2418 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_spelled_one_to_thirty_one2422 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_SIX_in_spelled_one_to_thirty_one2426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_one_to_thirty_one2439 = new BitSet(new long[]{0x0000020000080000L,0x0000000000020000L});
    public static final BitSet FOLLOW_DASH_in_spelled_one_to_thirty_one2442 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_spelled_one_to_thirty_one2446 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_SEVEN_in_spelled_one_to_thirty_one2450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_one_to_thirty_one2461 = new BitSet(new long[]{0x0000020000080000L,0x0000000000040000L});
    public static final BitSet FOLLOW_DASH_in_spelled_one_to_thirty_one2464 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_spelled_one_to_thirty_one2468 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_EIGHT_in_spelled_one_to_thirty_one2472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_one_to_thirty_one2483 = new BitSet(new long[]{0x0000020000080000L,0x0000000000080000L});
    public static final BitSet FOLLOW_DASH_in_spelled_one_to_thirty_one2486 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_spelled_one_to_thirty_one2490 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_NINE_in_spelled_one_to_thirty_one2494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIRTY_in_spelled_one_to_thirty_one2506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIRTY_in_spelled_one_to_thirty_one2545 = new BitSet(new long[]{0x0000020000080000L,0x0000000000000800L});
    public static final BitSet FOLLOW_DASH_in_spelled_one_to_thirty_one2548 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_spelled_one_to_thirty_one2552 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_ONE_in_spelled_one_to_thirty_one2556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FIRST_in_spelled_first_to_thirty_first2579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SECOND_in_spelled_first_to_thirty_first2596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIRD_in_spelled_first_to_thirty_first2612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOURTH_in_spelled_first_to_thirty_first2629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FIFTH_in_spelled_first_to_thirty_first2645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SIXTH_in_spelled_first_to_thirty_first2662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEVENTH_in_spelled_first_to_thirty_first2679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EIGHTH_in_spelled_first_to_thirty_first2694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NINTH_in_spelled_first_to_thirty_first2710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TENTH_in_spelled_first_to_thirty_first2727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELEVENTH_in_spelled_first_to_thirty_first2744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWELFTH_in_spelled_first_to_thirty_first2758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIRTEENTH_in_spelled_first_to_thirty_first2773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOURTEENTH_in_spelled_first_to_thirty_first2785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FIFTEENTH_in_spelled_first_to_thirty_first2797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SIXTEENTH_in_spelled_first_to_thirty_first2810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEVENTEENTH_in_spelled_first_to_thirty_first2823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EIGHTEENTH_in_spelled_first_to_thirty_first2834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NINETEENTH_in_spelled_first_to_thirty_first2846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTIETH_in_spelled_first_to_thirty_first2858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_FIRST_in_spelled_first_to_thirty_first2872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_first_to_thirty_first2879 = new BitSet(new long[]{0x0000020000080000L,0x0000000100000000L});
    public static final BitSet FOLLOW_DASH_in_spelled_first_to_thirty_first2882 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_spelled_first_to_thirty_first2886 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_FIRST_in_spelled_first_to_thirty_first2890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_SECOND_in_spelled_first_to_thirty_first2906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_first_to_thirty_first2912 = new BitSet(new long[]{0x0000020000080000L,0x0000000200000000L});
    public static final BitSet FOLLOW_DASH_in_spelled_first_to_thirty_first2915 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_spelled_first_to_thirty_first2919 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_SECOND_in_spelled_first_to_thirty_first2923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_THIRD_in_spelled_first_to_thirty_first2938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_first_to_thirty_first2945 = new BitSet(new long[]{0x0000020000080000L,0x0000000400000000L});
    public static final BitSet FOLLOW_DASH_in_spelled_first_to_thirty_first2948 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_spelled_first_to_thirty_first2952 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_THIRD_in_spelled_first_to_thirty_first2956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_FOURTH_in_spelled_first_to_thirty_first2972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_first_to_thirty_first2978 = new BitSet(new long[]{0x0000020000080000L,0x0000000800000000L});
    public static final BitSet FOLLOW_DASH_in_spelled_first_to_thirty_first2981 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_spelled_first_to_thirty_first2985 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_FOURTH_in_spelled_first_to_thirty_first2989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_FIFTH_in_spelled_first_to_thirty_first3004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_first_to_thirty_first3011 = new BitSet(new long[]{0x0000020000080000L,0x0000001000000000L});
    public static final BitSet FOLLOW_DASH_in_spelled_first_to_thirty_first3014 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_spelled_first_to_thirty_first3018 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_FIFTH_in_spelled_first_to_thirty_first3022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_SIXTH_in_spelled_first_to_thirty_first3038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_first_to_thirty_first3045 = new BitSet(new long[]{0x0000020000080000L,0x0000002000000000L});
    public static final BitSet FOLLOW_DASH_in_spelled_first_to_thirty_first3048 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_spelled_first_to_thirty_first3052 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_SIXTH_in_spelled_first_to_thirty_first3056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_SEVENTH_in_spelled_first_to_thirty_first3072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_first_to_thirty_first3077 = new BitSet(new long[]{0x0000020000080000L,0x0000004000000000L});
    public static final BitSet FOLLOW_DASH_in_spelled_first_to_thirty_first3080 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_spelled_first_to_thirty_first3084 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_SEVENTH_in_spelled_first_to_thirty_first3088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_EIGHTH_in_spelled_first_to_thirty_first3102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_first_to_thirty_first3108 = new BitSet(new long[]{0x0000020000080000L,0x0000008000000000L});
    public static final BitSet FOLLOW_DASH_in_spelled_first_to_thirty_first3111 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_spelled_first_to_thirty_first3115 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_EIGHTH_in_spelled_first_to_thirty_first3119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_NINTH_in_spelled_first_to_thirty_first3134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_first_to_thirty_first3141 = new BitSet(new long[]{0x0000020000080000L,0x0000010000000000L});
    public static final BitSet FOLLOW_DASH_in_spelled_first_to_thirty_first3144 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_spelled_first_to_thirty_first3148 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_NINTH_in_spelled_first_to_thirty_first3152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIRTIETH_in_spelled_first_to_thirty_first3167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIRTY_FIRST_in_spelled_first_to_thirty_first3227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIRTY_in_spelled_first_to_thirty_first3234 = new BitSet(new long[]{0x0000020000080000L,0x0000000100000000L});
    public static final BitSet FOLLOW_DASH_in_spelled_first_to_thirty_first3237 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_spelled_first_to_thirty_first3241 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_FIRST_in_spelled_first_to_thirty_first3245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_date_in_synpred1_Date134 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_synpred1_Date137 = new BitSet(new long[]{0x0000000000100000L,0x00000000000000F8L});
    public static final BitSet FOLLOW_AT_in_synpred1_Date140 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_synpred1_Date142 = new BitSet(new long[]{0x0000000000100000L,0x00000000000000F8L});
    public static final BitSet FOLLOW_time_in_synpred1_Date146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relaxed_day_of_month_in_synpred2_Date296 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_synpred2_Date298 = new BitSet(new long[]{0x0000000FFEC00000L});
    public static final BitSet FOLLOW_OF_in_synpred2_Date301 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_synpred2_Date303 = new BitSet(new long[]{0x0000000FFE800000L});
    public static final BitSet FOLLOW_relaxed_month_in_synpred2_Date307 = new BitSet(new long[]{0x0000002000080000L});
    public static final BitSet FOLLOW_relaxed_year_in_synpred2_Date309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relaxed_month_in_synpred3_Date350 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_synpred3_Date352 = new BitSet(new long[]{0x0000000000000000L,0x7FFFFFFFFFFFF9E0L});
    public static final BitSet FOLLOW_relaxed_day_of_month_in_synpred3_Date354 = new BitSet(new long[]{0x0000002000080000L});
    public static final BitSet FOLLOW_relaxed_year_in_synpred3_Date356 = new BitSet(new long[]{0x0000000000000002L});

}