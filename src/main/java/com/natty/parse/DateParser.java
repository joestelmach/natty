// $ANTLR 3.2 Sep 23, 2009 12:02:23 /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g 2010-02-09 13:53:00
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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "INT", "MONTH_OF_YEAR", "DAY_OF_MONTH", "DAY_OF_WEEK", "YEAR_OF", "DATE_TIME", "EXPLICIT_DATE", "RELATIVE_DATE", "SEEK", "DIRECTION", "SEEK_BY", "SPAN", "EXPLICIT_TIME", "HOURS_OF_DAY", "MINUTES_OF_HOUR", "AM_PM", "STRING", "WHITE_SPACE", "AT", "COMMA", "ON", "THE", "DAY", "AFTER", "BEFORE", "OF", "JANUARY", "FEBRUARY", "MARCH", "APRIL", "MAY", "JUNE", "JULY", "AUGUST", "SEPTEMBER", "OCTOBER", "NOVEMBER", "DECEMBER", "SINGLE_QUOTE", "IN", "YEAR", "DASH", "SLASH", "THIS", "LAST", "NEXT", "PAST", "COMING", "UPCOMING", "FROM", "NOW", "AGO", "WEEK", "MONTH", "SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY", "TODAY", "TOMORROW", "YESTERDAY", "COLON", "MILITARY_HOUR_SUFFIX", "HOUR", "AM", "PM", "NOON", "MIDNIGHT", "INT_0", "INT_00", "INT_1_TO_9", "INT_01_TO_12", "INT_13_TO_23", "INT_24_TO_31", "INT_32_TO_59", "INT_60_TO_99", "ONE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", "NINE", "TEN", "ELEVEN", "TWELVE", "THIRTEEN", "FOURTEEN", "FIFTEEN", "SIXTEEN", "SEVENTEEN", "EIGHTEEN", "NINETEEN", "TWENTY", "THIRTY", "FIRST", "SECOND", "THIRD", "FOURTH", "FIFTH", "SIXTH", "SEVENTH", "EIGHTH", "NINTH", "TENTH", "ELEVENTH", "TWELFTH", "THIRTEENTH", "FOURTEENTH", "FIFTEENTH", "SIXTEENTH", "SEVENTEENTH", "EIGHTEENTH", "NINETEENTH", "TWENTIETH", "TWENTY_FIRST", "TWENTY_SECOND", "TWENTY_THIRD", "TWENTY_FOURTH", "TWENTY_FIFTH", "TWENTY_SIXTH", "TWENTY_SEVENTH", "TWENTY_EIGHTH", "TWENTY_NINTH", "THIRTIETH", "THIRTY_FIRST", "DOT", "'s'"
    };
    public static final int DIRECTION=13;
    public static final int NINETEEN=101;
    public static final int SEPTEMBER=38;
    public static final int WEEK=56;
    public static final int WEDNESDAY=61;
    public static final int INT_24_TO_31=80;
    public static final int TWENTY_EIGHTH=131;
    public static final int TWENTY=102;
    public static final int INT_00=76;
    public static final int JULY=36;
    public static final int APRIL=33;
    public static final int COMING=51;
    public static final int NINETEENTH=122;
    public static final int OCTOBER=39;
    public static final int NOW=54;
    public static final int DAY=26;
    public static final int ONE=83;
    public static final int MIDNIGHT=74;
    public static final int MARCH=32;
    public static final int EOF=-1;
    public static final int MONTH=57;
    public static final int PAST=50;
    public static final int SEVENTEEN=99;
    public static final int DATE_TIME=9;
    public static final int AM_PM=19;
    public static final int TWENTY_SEVENTH=130;
    public static final int TWENTY_FIFTH=128;
    public static final int EIGHTEENTH=121;
    public static final int MINUTES_OF_HOUR=18;
    public static final int SPAN=15;
    public static final int THIS=47;
    public static final int THIRTIETH=133;
    public static final int NOON=73;
    public static final int INT_60_TO_99=82;
    public static final int LAST=48;
    public static final int EIGHTEEN=100;
    public static final int INT_01_TO_12=78;
    public static final int RELATIVE_DATE=11;
    public static final int TOMORROW=66;
    public static final int FIFTEENTH=118;
    public static final int FOURTH=107;
    public static final int T__136=136;
    public static final int TODAY=65;
    public static final int SECOND=105;
    public static final int NOVEMBER=40;
    public static final int SATURDAY=64;
    public static final int MONTH_OF_YEAR=5;
    public static final int FOUR=86;
    public static final int SEVENTH=110;
    public static final int TEN=92;
    public static final int FEBRUARY=31;
    public static final int ON=24;
    public static final int MONDAY=59;
    public static final int THIRTEEN=95;
    public static final int ELEVEN=93;
    public static final int DAY_OF_WEEK=7;
    public static final int SUNDAY=58;
    public static final int SEVEN=89;
    public static final int JUNE=35;
    public static final int INT=4;
    public static final int EXPLICIT_DATE=10;
    public static final int OF=29;
    public static final int UPCOMING=52;
    public static final int SIX=88;
    public static final int FIFTH=108;
    public static final int TWENTY_NINTH=132;
    public static final int THURSDAY=62;
    public static final int DECEMBER=41;
    public static final int SEEK_BY=14;
    public static final int AUGUST=37;
    public static final int PM=72;
    public static final int EXPLICIT_TIME=16;
    public static final int FROM=53;
    public static final int TUESDAY=60;
    public static final int EIGHTH=111;
    public static final int THIRD=106;
    public static final int HOURS_OF_DAY=17;
    public static final int YEAR=44;
    public static final int THE=25;
    public static final int TENTH=113;
    public static final int MAY=34;
    public static final int TWENTY_FOURTH=127;
    public static final int WHITE_SPACE=21;
    public static final int FRIDAY=63;
    public static final int EIGHT=90;
    public static final int INT_0=75;
    public static final int TWENTY_SIXTH=129;
    public static final int AT=22;
    public static final int SINGLE_QUOTE=42;
    public static final int SLASH=46;
    public static final int IN=43;
    public static final int NINTH=112;
    public static final int COMMA=23;
    public static final int FIVE=87;
    public static final int THIRTY=103;
    public static final int TWENTIETH=123;
    public static final int TWENTY_SECOND=125;
    public static final int NEXT=49;
    public static final int DOT=135;
    public static final int INT_13_TO_23=79;
    public static final int MILITARY_HOUR_SUFFIX=69;
    public static final int INT_32_TO_59=81;
    public static final int AM=71;
    public static final int DASH=45;
    public static final int FOURTEENTH=117;
    public static final int SIXTEEN=98;
    public static final int INT_1_TO_9=77;
    public static final int YEAR_OF=8;
    public static final int TWELVE=94;
    public static final int AGO=55;
    public static final int ELEVENTH=114;
    public static final int BEFORE=28;
    public static final int AFTER=27;
    public static final int TWO=84;
    public static final int HOUR=70;
    public static final int SIXTEENTH=119;
    public static final int JANUARY=30;
    public static final int THIRTEENTH=116;
    public static final int SEEK=12;
    public static final int COLON=68;
    public static final int DAY_OF_MONTH=6;
    public static final int FIFTEEN=97;
    public static final int TWELFTH=115;
    public static final int NINE=91;
    public static final int SIXTH=109;
    public static final int TWENTY_FIRST=124;
    public static final int THREE=85;
    public static final int FOURTEEN=96;
    public static final int TWENTY_THIRD=126;
    public static final int YESTERDAY=67;
    public static final int SEVENTEENTH=120;
    public static final int THIRTY_FIRST=134;
    public static final int FIRST=104;
    public static final int STRING=20;

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
    public String getGrammarFileName() { return "/Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g"; }


    public static class search_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "search"
    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:29:1: search : ( ( ( date_time WHITE_SPACE text )+ )=> ( date_time text )+ | ( ( text date_time ( WHITE_SPACE )? )+ )=> ( text date_time )+ | date_time ) -> ( date_time )+ ;
    public final DateParser.search_return search() throws RecognitionException {
        DateParser.search_return retval = new DateParser.search_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        DateParser.date_time_return date_time1 = null;

        DateParser.text_return text2 = null;

        DateParser.text_return text3 = null;

        DateParser.date_time_return date_time4 = null;

        DateParser.date_time_return date_time5 = null;


        RewriteRuleSubtreeStream stream_text=new RewriteRuleSubtreeStream(adaptor,"rule text");
        RewriteRuleSubtreeStream stream_date_time=new RewriteRuleSubtreeStream(adaptor,"rule date_time");
        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:30:3: ( ( ( ( date_time WHITE_SPACE text )+ )=> ( date_time text )+ | ( ( text date_time ( WHITE_SPACE )? )+ )=> ( text date_time )+ | date_time ) -> ( date_time )+ )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:30:5: ( ( ( date_time WHITE_SPACE text )+ )=> ( date_time text )+ | ( ( text date_time ( WHITE_SPACE )? )+ )=> ( text date_time )+ | date_time )
            {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:30:5: ( ( ( date_time WHITE_SPACE text )+ )=> ( date_time text )+ | ( ( text date_time ( WHITE_SPACE )? )+ )=> ( text date_time )+ | date_time )
            int alt3=3;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:31:7: ( ( date_time WHITE_SPACE text )+ )=> ( date_time text )+
                    {
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:31:42: ( date_time text )+
                    int cnt1=0;
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( ((LA1_0>=THE && LA1_0<=DAY)||(LA1_0>=JANUARY && LA1_0<=DECEMBER)||(LA1_0>=IN && LA1_0<=YEAR)||(LA1_0>=THIS && LA1_0<=UPCOMING)||(LA1_0>=WEEK && LA1_0<=YESTERDAY)||(LA1_0>=NOON && LA1_0<=THIRTY_FIRST)) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:31:43: date_time text
                    	    {
                    	    pushFollow(FOLLOW_date_time_in_search152);
                    	    date_time1=date_time();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_date_time.add(date_time1.getTree());
                    	    pushFollow(FOLLOW_text_in_search154);
                    	    text2=text();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_text.add(text2.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt1 >= 1 ) break loop1;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(1, input);
                                throw eee;
                        }
                        cnt1++;
                    } while (true);


                    }
                    break;
                case 2 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:32:9: ( ( text date_time ( WHITE_SPACE )? )+ )=> ( text date_time )+
                    {
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:32:45: ( text date_time )+
                    int cnt2=0;
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==STRING) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:32:46: text date_time
                    	    {
                    	    pushFollow(FOLLOW_text_in_search181);
                    	    text3=text();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_text.add(text3.getTree());
                    	    pushFollow(FOLLOW_date_time_in_search183);
                    	    date_time4=date_time();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_date_time.add(date_time4.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt2 >= 1 ) break loop2;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(2, input);
                                throw eee;
                        }
                        cnt2++;
                    } while (true);


                    }
                    break;
                case 3 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:33:9: date_time
                    {
                    pushFollow(FOLLOW_date_time_in_search195);
                    date_time5=date_time();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_date_time.add(date_time5.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: date_time
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 34:7: -> ( date_time )+
            {
                if ( !(stream_date_time.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_date_time.hasNext() ) {
                    adaptor.addChild(root_0, stream_date_time.nextTree());

                }
                stream_date_time.reset();

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
    // $ANTLR end "search"

    public static class text_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "text"
    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:37:1: text : ( STRING WHITE_SPACE )+ ;
    public final DateParser.text_return text() throws RecognitionException {
        DateParser.text_return retval = new DateParser.text_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token STRING6=null;
        Token WHITE_SPACE7=null;

        Object STRING6_tree=null;
        Object WHITE_SPACE7_tree=null;

        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:38:3: ( ( STRING WHITE_SPACE )+ )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:38:5: ( STRING WHITE_SPACE )+
            {
            root_0 = (Object)adaptor.nil();

            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:38:5: ( STRING WHITE_SPACE )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==STRING) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:38:6: STRING WHITE_SPACE
            	    {
            	    STRING6=(Token)match(input,STRING,FOLLOW_STRING_in_text222); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    STRING6_tree = (Object)adaptor.create(STRING6);
            	    adaptor.addChild(root_0, STRING6_tree);
            	    }
            	    WHITE_SPACE7=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_text224); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    WHITE_SPACE7_tree = (Object)adaptor.create(WHITE_SPACE7);
            	    adaptor.addChild(root_0, WHITE_SPACE7_tree);
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


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
    // $ANTLR end "text"

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

        DateParser.date_return date8 = null;

        DateParser.date_time_separator_return date_time_separator9 = null;

        DateParser.time_return time10 = null;

        DateParser.time_return time11 = null;

        DateParser.time_date_separator_return time_date_separator12 = null;

        DateParser.date_return date13 = null;


        RewriteRuleSubtreeStream stream_date_time_separator=new RewriteRuleSubtreeStream(adaptor,"rule date_time_separator");
        RewriteRuleSubtreeStream stream_time=new RewriteRuleSubtreeStream(adaptor,"rule time");
        RewriteRuleSubtreeStream stream_time_date_separator=new RewriteRuleSubtreeStream(adaptor,"rule time_date_separator");
        RewriteRuleSubtreeStream stream_date=new RewriteRuleSubtreeStream(adaptor,"rule date");
        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:47:3: ( ( ( date ( date_time_separator time )? )=> date ( date_time_separator time )? | time ( time_date_separator date )? ) -> ^( DATE_TIME ( date )? ( time )? ) )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:47:5: ( ( date ( date_time_separator time )? )=> date ( date_time_separator time )? | time ( time_date_separator date )? )
            {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:47:5: ( ( date ( date_time_separator time )? )=> date ( date_time_separator time )? | time ( time_date_separator date )? )
            int alt7=2;
            alt7 = dfa7.predict(input);
            switch (alt7) {
                case 1 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:48:7: ( date ( date_time_separator time )? )=> date ( date_time_separator time )?
                    {
                    pushFollow(FOLLOW_date_in_date_time276);
                    date8=date();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_date.add(date8.getTree());
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:49:14: ( date_time_separator time )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==WHITE_SPACE) ) {
                        int LA5_1 = input.LA(2);

                        if ( (LA5_1==AT||(LA5_1>=NOON && LA5_1<=INT_13_TO_23)) ) {
                            alt5=1;
                        }
                    }
                    else if ( (LA5_0==COMMA) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:49:15: date_time_separator time
                            {
                            pushFollow(FOLLOW_date_time_separator_in_date_time279);
                            date_time_separator9=date_time_separator();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_date_time_separator.add(date_time_separator9.getTree());
                            pushFollow(FOLLOW_time_in_date_time281);
                            time10=time();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_time.add(time10.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:51:9: time ( time_date_separator date )?
                    {
                    pushFollow(FOLLOW_time_in_date_time300);
                    time11=time();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_time.add(time11.getTree());
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:51:14: ( time_date_separator date )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==WHITE_SPACE) ) {
                        int LA6_1 = input.LA(2);

                        if ( ((LA6_1>=ON && LA6_1<=DAY)||(LA6_1>=JANUARY && LA6_1<=DECEMBER)||(LA6_1>=IN && LA6_1<=YEAR)||(LA6_1>=THIS && LA6_1<=UPCOMING)||(LA6_1>=WEEK && LA6_1<=YESTERDAY)||(LA6_1>=INT_00 && LA6_1<=THIRTY_FIRST)) ) {
                            alt6=1;
                        }
                    }
                    else if ( (LA6_0==COMMA) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:51:15: time_date_separator date
                            {
                            pushFollow(FOLLOW_time_date_separator_in_date_time303);
                            time_date_separator12=time_date_separator();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_time_date_separator.add(time_date_separator12.getTree());
                            pushFollow(FOLLOW_date_in_date_time305);
                            date13=date();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_date.add(date13.getTree());

                            }
                            break;

                    }


                    }
                    break;

            }



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
            // 52:7: -> ^( DATE_TIME ( date )? ( time )? )
            {
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:52:10: ^( DATE_TIME ( date )? ( time )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DATE_TIME, "DATE_TIME"), root_1);

                // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:52:22: ( date )?
                if ( stream_date.hasNext() ) {
                    adaptor.addChild(root_1, stream_date.nextTree());

                }
                stream_date.reset();
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:52:28: ( time )?
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
            if ( state.backtracking==0 ) {

                  int startIndex = ((Token)retval.start).getCharPositionInLine();
                  int endIndex = startIndex + input.toString(retval.start,input.LT(-1)).length();
                  System.out.println("found " + input.toString(retval.start,input.LT(-1)) + " at " + startIndex + " - " + endIndex); 
                
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

        Token WHITE_SPACE14=null;
        Token AT15=null;
        Token WHITE_SPACE16=null;
        Token COMMA17=null;
        Token WHITE_SPACE18=null;
        Token AT19=null;
        Token WHITE_SPACE20=null;

        Object WHITE_SPACE14_tree=null;
        Object AT15_tree=null;
        Object WHITE_SPACE16_tree=null;
        Object COMMA17_tree=null;
        Object WHITE_SPACE18_tree=null;
        Object AT19_tree=null;
        Object WHITE_SPACE20_tree=null;

        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:56:3: ( WHITE_SPACE ( AT WHITE_SPACE )? | COMMA ( WHITE_SPACE )? ( AT WHITE_SPACE )? )
            int alt11=2;
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

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:56:5: WHITE_SPACE ( AT WHITE_SPACE )?
                    {
                    root_0 = (Object)adaptor.nil();

                    WHITE_SPACE14=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_date_time_separator340); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    WHITE_SPACE14_tree = (Object)adaptor.create(WHITE_SPACE14);
                    adaptor.addChild(root_0, WHITE_SPACE14_tree);
                    }
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:56:17: ( AT WHITE_SPACE )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==AT) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:56:18: AT WHITE_SPACE
                            {
                            AT15=(Token)match(input,AT,FOLLOW_AT_in_date_time_separator343); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            AT15_tree = (Object)adaptor.create(AT15);
                            adaptor.addChild(root_0, AT15_tree);
                            }
                            WHITE_SPACE16=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_date_time_separator345); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            WHITE_SPACE16_tree = (Object)adaptor.create(WHITE_SPACE16);
                            adaptor.addChild(root_0, WHITE_SPACE16_tree);
                            }

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:57:5: COMMA ( WHITE_SPACE )? ( AT WHITE_SPACE )?
                    {
                    root_0 = (Object)adaptor.nil();

                    COMMA17=(Token)match(input,COMMA,FOLLOW_COMMA_in_date_time_separator353); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    COMMA17_tree = (Object)adaptor.create(COMMA17);
                    adaptor.addChild(root_0, COMMA17_tree);
                    }
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:57:11: ( WHITE_SPACE )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==WHITE_SPACE) ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:57:11: WHITE_SPACE
                            {
                            WHITE_SPACE18=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_date_time_separator355); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            WHITE_SPACE18_tree = (Object)adaptor.create(WHITE_SPACE18);
                            adaptor.addChild(root_0, WHITE_SPACE18_tree);
                            }

                            }
                            break;

                    }

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:57:24: ( AT WHITE_SPACE )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==AT) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:57:25: AT WHITE_SPACE
                            {
                            AT19=(Token)match(input,AT,FOLLOW_AT_in_date_time_separator359); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            AT19_tree = (Object)adaptor.create(AT19);
                            adaptor.addChild(root_0, AT19_tree);
                            }
                            WHITE_SPACE20=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_date_time_separator361); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            WHITE_SPACE20_tree = (Object)adaptor.create(WHITE_SPACE20);
                            adaptor.addChild(root_0, WHITE_SPACE20_tree);
                            }

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

        Token WHITE_SPACE21=null;
        Token ON22=null;
        Token WHITE_SPACE23=null;
        Token COMMA24=null;
        Token WHITE_SPACE25=null;
        Token ON26=null;
        Token WHITE_SPACE27=null;

        Object WHITE_SPACE21_tree=null;
        Object ON22_tree=null;
        Object WHITE_SPACE23_tree=null;
        Object COMMA24_tree=null;
        Object WHITE_SPACE25_tree=null;
        Object ON26_tree=null;
        Object WHITE_SPACE27_tree=null;

        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:61:3: ( WHITE_SPACE ( ON WHITE_SPACE )? | COMMA ( WHITE_SPACE )? ( ON WHITE_SPACE )? )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==WHITE_SPACE) ) {
                alt15=1;
            }
            else if ( (LA15_0==COMMA) ) {
                alt15=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:61:5: WHITE_SPACE ( ON WHITE_SPACE )?
                    {
                    root_0 = (Object)adaptor.nil();

                    WHITE_SPACE21=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_time_date_separator378); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    WHITE_SPACE21_tree = (Object)adaptor.create(WHITE_SPACE21);
                    adaptor.addChild(root_0, WHITE_SPACE21_tree);
                    }
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:61:17: ( ON WHITE_SPACE )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==ON) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:61:18: ON WHITE_SPACE
                            {
                            ON22=(Token)match(input,ON,FOLLOW_ON_in_time_date_separator381); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            ON22_tree = (Object)adaptor.create(ON22);
                            adaptor.addChild(root_0, ON22_tree);
                            }
                            WHITE_SPACE23=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_time_date_separator383); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            WHITE_SPACE23_tree = (Object)adaptor.create(WHITE_SPACE23);
                            adaptor.addChild(root_0, WHITE_SPACE23_tree);
                            }

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:62:5: COMMA ( WHITE_SPACE )? ( ON WHITE_SPACE )?
                    {
                    root_0 = (Object)adaptor.nil();

                    COMMA24=(Token)match(input,COMMA,FOLLOW_COMMA_in_time_date_separator391); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    COMMA24_tree = (Object)adaptor.create(COMMA24);
                    adaptor.addChild(root_0, COMMA24_tree);
                    }
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:62:11: ( WHITE_SPACE )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==WHITE_SPACE) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:62:11: WHITE_SPACE
                            {
                            WHITE_SPACE25=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_time_date_separator393); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            WHITE_SPACE25_tree = (Object)adaptor.create(WHITE_SPACE25);
                            adaptor.addChild(root_0, WHITE_SPACE25_tree);
                            }

                            }
                            break;

                    }

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:62:24: ( ON WHITE_SPACE )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==ON) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:62:25: ON WHITE_SPACE
                            {
                            ON26=(Token)match(input,ON,FOLLOW_ON_in_time_date_separator397); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            ON26_tree = (Object)adaptor.create(ON26);
                            adaptor.addChild(root_0, ON26_tree);
                            }
                            WHITE_SPACE27=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_time_date_separator399); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            WHITE_SPACE27_tree = (Object)adaptor.create(WHITE_SPACE27);
                            adaptor.addChild(root_0, WHITE_SPACE27_tree);
                            }

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

        DateParser.relaxed_date_return relaxed_date28 = null;

        DateParser.formal_date_return formal_date29 = null;

        DateParser.relative_date_return relative_date30 = null;

        DateParser.global_date_prefix_return global_date_prefix31 = null;

        DateParser.date_return date32 = null;


        RewriteRuleSubtreeStream stream_global_date_prefix=new RewriteRuleSubtreeStream(adaptor,"rule global_date_prefix");
        RewriteRuleSubtreeStream stream_date=new RewriteRuleSubtreeStream(adaptor,"rule date");
        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:66:3: ( ( relaxed_date )=> relaxed_date | formal_date | relative_date | global_date_prefix date -> ^( RELATIVE_DATE ^( SEEK global_date_prefix date ) ) )
            int alt16=4;
            alt16 = dfa16.predict(input);
            switch (alt16) {
                case 1 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:66:5: ( relaxed_date )=> relaxed_date
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_relaxed_date_in_date419);
                    relaxed_date28=relaxed_date();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, relaxed_date28.getTree());

                    }
                    break;
                case 2 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:67:5: formal_date
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_formal_date_in_date425);
                    formal_date29=formal_date();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, formal_date29.getTree());

                    }
                    break;
                case 3 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:68:5: relative_date
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_relative_date_in_date431);
                    relative_date30=relative_date();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, relative_date30.getTree());

                    }
                    break;
                case 4 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:69:5: global_date_prefix date
                    {
                    pushFollow(FOLLOW_global_date_prefix_in_date437);
                    global_date_prefix31=global_date_prefix();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_global_date_prefix.add(global_date_prefix31.getTree());
                    pushFollow(FOLLOW_date_in_date439);
                    date32=date();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_date.add(date32.getTree());


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
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:70:10: ^( RELATIVE_DATE ^( SEEK global_date_prefix date ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(RELATIVE_DATE, "RELATIVE_DATE"), root_1);

                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:70:26: ^( SEEK global_date_prefix date )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(SEEK, "SEEK"), root_2);

                        adaptor.addChild(root_2, stream_global_date_prefix.nextTree());
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

        Token THE33=null;
        Token WHITE_SPACE34=null;
        Token DAY35=null;
        Token WHITE_SPACE36=null;
        Token WHITE_SPACE38=null;
        Token WHITE_SPACE40=null;
        Token DAY41=null;
        Token WHITE_SPACE42=null;
        Token WHITE_SPACE44=null;
        DateParser.prefix_direction_return prefix_direction37 = null;

        DateParser.spelled_or_int_01_to_31_optional_prefix_return spelled_or_int_01_to_31_optional_prefix39 = null;

        DateParser.prefix_direction_return prefix_direction43 = null;


        Object THE33_tree=null;
        Object WHITE_SPACE34_tree=null;
        Object DAY35_tree=null;
        Object WHITE_SPACE36_tree=null;
        Object WHITE_SPACE38_tree=null;
        Object WHITE_SPACE40_tree=null;
        Object DAY41_tree=null;
        Object WHITE_SPACE42_tree=null;
        Object WHITE_SPACE44_tree=null;
        RewriteRuleTokenStream stream_DAY=new RewriteRuleTokenStream(adaptor,"token DAY");
        RewriteRuleTokenStream stream_THE=new RewriteRuleTokenStream(adaptor,"token THE");
        RewriteRuleTokenStream stream_WHITE_SPACE=new RewriteRuleTokenStream(adaptor,"token WHITE_SPACE");
        RewriteRuleSubtreeStream stream_spelled_or_int_01_to_31_optional_prefix=new RewriteRuleSubtreeStream(adaptor,"rule spelled_or_int_01_to_31_optional_prefix");
        RewriteRuleSubtreeStream stream_prefix_direction=new RewriteRuleSubtreeStream(adaptor,"rule prefix_direction");
        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:74:3: ( ( THE WHITE_SPACE )? DAY WHITE_SPACE prefix_direction WHITE_SPACE -> prefix_direction SEEK_BY[\"by_day\"] INT[\"1\"] | spelled_or_int_01_to_31_optional_prefix WHITE_SPACE DAY WHITE_SPACE prefix_direction WHITE_SPACE -> prefix_direction SEEK_BY[\"by_day\"] spelled_or_int_01_to_31_optional_prefix )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=THE && LA18_0<=DAY)) ) {
                alt18=1;
            }
            else if ( ((LA18_0>=INT_1_TO_9 && LA18_0<=INT_24_TO_31)||(LA18_0>=ONE && LA18_0<=THIRTY)) ) {
                alt18=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:74:5: ( THE WHITE_SPACE )? DAY WHITE_SPACE prefix_direction WHITE_SPACE
                    {
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:74:5: ( THE WHITE_SPACE )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==THE) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:74:6: THE WHITE_SPACE
                            {
                            THE33=(Token)match(input,THE,FOLLOW_THE_in_global_date_prefix476); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_THE.add(THE33);

                            WHITE_SPACE34=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_global_date_prefix478); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE34);


                            }
                            break;

                    }

                    DAY35=(Token)match(input,DAY,FOLLOW_DAY_in_global_date_prefix482); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DAY.add(DAY35);

                    WHITE_SPACE36=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_global_date_prefix484); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE36);

                    pushFollow(FOLLOW_prefix_direction_in_global_date_prefix486);
                    prefix_direction37=prefix_direction();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_prefix_direction.add(prefix_direction37.getTree());
                    WHITE_SPACE38=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_global_date_prefix488); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE38);



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
                        adaptor.addChild(root_0, stream_prefix_direction.nextTree());
                        adaptor.addChild(root_0, (Object)adaptor.create(SEEK_BY, "by_day"));
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "1"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:77:5: spelled_or_int_01_to_31_optional_prefix WHITE_SPACE DAY WHITE_SPACE prefix_direction WHITE_SPACE
                    {
                    pushFollow(FOLLOW_spelled_or_int_01_to_31_optional_prefix_in_global_date_prefix514);
                    spelled_or_int_01_to_31_optional_prefix39=spelled_or_int_01_to_31_optional_prefix();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_spelled_or_int_01_to_31_optional_prefix.add(spelled_or_int_01_to_31_optional_prefix39.getTree());
                    WHITE_SPACE40=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_global_date_prefix516); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE40);

                    DAY41=(Token)match(input,DAY,FOLLOW_DAY_in_global_date_prefix518); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DAY.add(DAY41);

                    WHITE_SPACE42=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_global_date_prefix520); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE42);

                    pushFollow(FOLLOW_prefix_direction_in_global_date_prefix522);
                    prefix_direction43=prefix_direction();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_prefix_direction.add(prefix_direction43.getTree());
                    WHITE_SPACE44=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_global_date_prefix524); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE44);



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
                        adaptor.addChild(root_0, stream_prefix_direction.nextTree());
                        adaptor.addChild(root_0, (Object)adaptor.create(SEEK_BY, "by_day"));
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

        Token AFTER45=null;
        Token BEFORE46=null;

        Object AFTER45_tree=null;
        Object BEFORE46_tree=null;
        RewriteRuleTokenStream stream_BEFORE=new RewriteRuleTokenStream(adaptor,"token BEFORE");
        RewriteRuleTokenStream stream_AFTER=new RewriteRuleTokenStream(adaptor,"token AFTER");

        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:82:3: ( AFTER -> DIRECTION[\">\"] | BEFORE -> DIRECTION[\"<\"] )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==AFTER) ) {
                alt19=1;
            }
            else if ( (LA19_0==BEFORE) ) {
                alt19=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:82:5: AFTER
                    {
                    AFTER45=(Token)match(input,AFTER,FOLLOW_AFTER_in_prefix_direction555); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AFTER.add(AFTER45);



                    // AST REWRITE
                    // elements: 
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
                        adaptor.addChild(root_0, (Object)adaptor.create(DIRECTION, ">"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:83:5: BEFORE
                    {
                    BEFORE46=(Token)match(input,BEFORE,FOLLOW_BEFORE_in_prefix_direction567); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_BEFORE.add(BEFORE46);



                    // AST REWRITE
                    // elements: 
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
        return retval;
    }
    // $ANTLR end "prefix_direction"

    public static class relaxed_date_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "relaxed_date"
    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:89:1: relaxed_date : ( ( ( THE WHITE_SPACE )? relaxed_day_of_month WHITE_SPACE ( OF WHITE_SPACE )? relaxed_month relaxed_year )=> ( THE WHITE_SPACE )? relaxed_day_of_month WHITE_SPACE ( OF WHITE_SPACE )? relaxed_month relaxed_year | ( relaxed_month WHITE_SPACE relaxed_day_of_month relaxed_year )=> relaxed_month WHITE_SPACE relaxed_day_of_month relaxed_year | ( THE WHITE_SPACE )? relaxed_day_of_month WHITE_SPACE ( OF WHITE_SPACE )? relaxed_month | ( THE WHITE_SPACE )? relaxed_month WHITE_SPACE relaxed_day_of_month ) -> ^( EXPLICIT_DATE relaxed_month relaxed_day_of_month ( relaxed_year )? ) ;
    public final DateParser.relaxed_date_return relaxed_date() throws RecognitionException {
        DateParser.relaxed_date_return retval = new DateParser.relaxed_date_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token THE47=null;
        Token WHITE_SPACE48=null;
        Token WHITE_SPACE50=null;
        Token OF51=null;
        Token WHITE_SPACE52=null;
        Token WHITE_SPACE56=null;
        Token THE59=null;
        Token WHITE_SPACE60=null;
        Token WHITE_SPACE62=null;
        Token OF63=null;
        Token WHITE_SPACE64=null;
        Token THE66=null;
        Token WHITE_SPACE67=null;
        Token WHITE_SPACE69=null;
        DateParser.relaxed_day_of_month_return relaxed_day_of_month49 = null;

        DateParser.relaxed_month_return relaxed_month53 = null;

        DateParser.relaxed_year_return relaxed_year54 = null;

        DateParser.relaxed_month_return relaxed_month55 = null;

        DateParser.relaxed_day_of_month_return relaxed_day_of_month57 = null;

        DateParser.relaxed_year_return relaxed_year58 = null;

        DateParser.relaxed_day_of_month_return relaxed_day_of_month61 = null;

        DateParser.relaxed_month_return relaxed_month65 = null;

        DateParser.relaxed_month_return relaxed_month68 = null;

        DateParser.relaxed_day_of_month_return relaxed_day_of_month70 = null;


        Object THE47_tree=null;
        Object WHITE_SPACE48_tree=null;
        Object WHITE_SPACE50_tree=null;
        Object OF51_tree=null;
        Object WHITE_SPACE52_tree=null;
        Object WHITE_SPACE56_tree=null;
        Object THE59_tree=null;
        Object WHITE_SPACE60_tree=null;
        Object WHITE_SPACE62_tree=null;
        Object OF63_tree=null;
        Object WHITE_SPACE64_tree=null;
        Object THE66_tree=null;
        Object WHITE_SPACE67_tree=null;
        Object WHITE_SPACE69_tree=null;
        RewriteRuleTokenStream stream_THE=new RewriteRuleTokenStream(adaptor,"token THE");
        RewriteRuleTokenStream stream_OF=new RewriteRuleTokenStream(adaptor,"token OF");
        RewriteRuleTokenStream stream_WHITE_SPACE=new RewriteRuleTokenStream(adaptor,"token WHITE_SPACE");
        RewriteRuleSubtreeStream stream_relaxed_day_of_month=new RewriteRuleSubtreeStream(adaptor,"rule relaxed_day_of_month");
        RewriteRuleSubtreeStream stream_relaxed_month=new RewriteRuleSubtreeStream(adaptor,"rule relaxed_month");
        RewriteRuleSubtreeStream stream_relaxed_year=new RewriteRuleSubtreeStream(adaptor,"rule relaxed_year");
        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:90:3: ( ( ( ( THE WHITE_SPACE )? relaxed_day_of_month WHITE_SPACE ( OF WHITE_SPACE )? relaxed_month relaxed_year )=> ( THE WHITE_SPACE )? relaxed_day_of_month WHITE_SPACE ( OF WHITE_SPACE )? relaxed_month relaxed_year | ( relaxed_month WHITE_SPACE relaxed_day_of_month relaxed_year )=> relaxed_month WHITE_SPACE relaxed_day_of_month relaxed_year | ( THE WHITE_SPACE )? relaxed_day_of_month WHITE_SPACE ( OF WHITE_SPACE )? relaxed_month | ( THE WHITE_SPACE )? relaxed_month WHITE_SPACE relaxed_day_of_month ) -> ^( EXPLICIT_DATE relaxed_month relaxed_day_of_month ( relaxed_year )? ) )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:90:5: ( ( ( THE WHITE_SPACE )? relaxed_day_of_month WHITE_SPACE ( OF WHITE_SPACE )? relaxed_month relaxed_year )=> ( THE WHITE_SPACE )? relaxed_day_of_month WHITE_SPACE ( OF WHITE_SPACE )? relaxed_month relaxed_year | ( relaxed_month WHITE_SPACE relaxed_day_of_month relaxed_year )=> relaxed_month WHITE_SPACE relaxed_day_of_month relaxed_year | ( THE WHITE_SPACE )? relaxed_day_of_month WHITE_SPACE ( OF WHITE_SPACE )? relaxed_month | ( THE WHITE_SPACE )? relaxed_month WHITE_SPACE relaxed_day_of_month )
            {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:90:5: ( ( ( THE WHITE_SPACE )? relaxed_day_of_month WHITE_SPACE ( OF WHITE_SPACE )? relaxed_month relaxed_year )=> ( THE WHITE_SPACE )? relaxed_day_of_month WHITE_SPACE ( OF WHITE_SPACE )? relaxed_month relaxed_year | ( relaxed_month WHITE_SPACE relaxed_day_of_month relaxed_year )=> relaxed_month WHITE_SPACE relaxed_day_of_month relaxed_year | ( THE WHITE_SPACE )? relaxed_day_of_month WHITE_SPACE ( OF WHITE_SPACE )? relaxed_month | ( THE WHITE_SPACE )? relaxed_month WHITE_SPACE relaxed_day_of_month )
            int alt25=4;
            alt25 = dfa25.predict(input);
            switch (alt25) {
                case 1 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:94:7: ( ( THE WHITE_SPACE )? relaxed_day_of_month WHITE_SPACE ( OF WHITE_SPACE )? relaxed_month relaxed_year )=> ( THE WHITE_SPACE )? relaxed_day_of_month WHITE_SPACE ( OF WHITE_SPACE )? relaxed_month relaxed_year
                    {
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:95:9: ( THE WHITE_SPACE )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==THE) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:95:10: THE WHITE_SPACE
                            {
                            THE47=(Token)match(input,THE,FOLLOW_THE_in_relaxed_date653); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_THE.add(THE47);

                            WHITE_SPACE48=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_relaxed_date655); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE48);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_relaxed_day_of_month_in_relaxed_date659);
                    relaxed_day_of_month49=relaxed_day_of_month();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_relaxed_day_of_month.add(relaxed_day_of_month49.getTree());
                    WHITE_SPACE50=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_relaxed_date661); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE50);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:95:61: ( OF WHITE_SPACE )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==OF) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:95:62: OF WHITE_SPACE
                            {
                            OF51=(Token)match(input,OF,FOLLOW_OF_in_relaxed_date664); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_OF.add(OF51);

                            WHITE_SPACE52=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_relaxed_date666); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE52);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_relaxed_month_in_relaxed_date670);
                    relaxed_month53=relaxed_month();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_relaxed_month.add(relaxed_month53.getTree());
                    pushFollow(FOLLOW_relaxed_year_in_relaxed_date672);
                    relaxed_year54=relaxed_year();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_relaxed_year.add(relaxed_year54.getTree());

                    }
                    break;
                case 2 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:97:9: ( relaxed_month WHITE_SPACE relaxed_day_of_month relaxed_year )=> relaxed_month WHITE_SPACE relaxed_day_of_month relaxed_year
                    {
                    pushFollow(FOLLOW_relaxed_month_in_relaxed_date706);
                    relaxed_month55=relaxed_month();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_relaxed_month.add(relaxed_month55.getTree());
                    WHITE_SPACE56=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_relaxed_date708); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE56);

                    pushFollow(FOLLOW_relaxed_day_of_month_in_relaxed_date710);
                    relaxed_day_of_month57=relaxed_day_of_month();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_relaxed_day_of_month.add(relaxed_day_of_month57.getTree());
                    pushFollow(FOLLOW_relaxed_year_in_relaxed_date712);
                    relaxed_year58=relaxed_year();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_relaxed_year.add(relaxed_year58.getTree());

                    }
                    break;
                case 3 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:100:9: ( THE WHITE_SPACE )? relaxed_day_of_month WHITE_SPACE ( OF WHITE_SPACE )? relaxed_month
                    {
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:100:9: ( THE WHITE_SPACE )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==THE) ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:100:10: THE WHITE_SPACE
                            {
                            THE59=(Token)match(input,THE,FOLLOW_THE_in_relaxed_date728); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_THE.add(THE59);

                            WHITE_SPACE60=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_relaxed_date730); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE60);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_relaxed_day_of_month_in_relaxed_date734);
                    relaxed_day_of_month61=relaxed_day_of_month();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_relaxed_day_of_month.add(relaxed_day_of_month61.getTree());
                    WHITE_SPACE62=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_relaxed_date736); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE62);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:100:61: ( OF WHITE_SPACE )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==OF) ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:100:62: OF WHITE_SPACE
                            {
                            OF63=(Token)match(input,OF,FOLLOW_OF_in_relaxed_date739); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_OF.add(OF63);

                            WHITE_SPACE64=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_relaxed_date741); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE64);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_relaxed_month_in_relaxed_date745);
                    relaxed_month65=relaxed_month();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_relaxed_month.add(relaxed_month65.getTree());

                    }
                    break;
                case 4 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:102:9: ( THE WHITE_SPACE )? relaxed_month WHITE_SPACE relaxed_day_of_month
                    {
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:102:9: ( THE WHITE_SPACE )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==THE) ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:102:10: THE WHITE_SPACE
                            {
                            THE66=(Token)match(input,THE,FOLLOW_THE_in_relaxed_date763); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_THE.add(THE66);

                            WHITE_SPACE67=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_relaxed_date765); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE67);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_relaxed_month_in_relaxed_date769);
                    relaxed_month68=relaxed_month();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_relaxed_month.add(relaxed_month68.getTree());
                    WHITE_SPACE69=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_relaxed_date771); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE69);

                    pushFollow(FOLLOW_relaxed_day_of_month_in_relaxed_date773);
                    relaxed_day_of_month70=relaxed_day_of_month();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_relaxed_day_of_month.add(relaxed_day_of_month70.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: relaxed_day_of_month, relaxed_month, relaxed_year
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
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:103:10: ^( EXPLICIT_DATE relaxed_month relaxed_day_of_month ( relaxed_year )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPLICIT_DATE, "EXPLICIT_DATE"), root_1);

                adaptor.addChild(root_1, stream_relaxed_month.nextTree());
                adaptor.addChild(root_1, stream_relaxed_day_of_month.nextTree());
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:103:61: ( relaxed_year )?
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
    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:106:1: relaxed_month : ( JANUARY -> ^( MONTH_OF_YEAR INT[\"1\"] ) | FEBRUARY -> ^( MONTH_OF_YEAR INT[\"2\"] ) | MARCH -> ^( MONTH_OF_YEAR INT[\"3\"] ) | APRIL -> ^( MONTH_OF_YEAR INT[\"4\"] ) | MAY -> ^( MONTH_OF_YEAR INT[\"5\"] ) | JUNE -> ^( MONTH_OF_YEAR INT[\"6\"] ) | JULY -> ^( MONTH_OF_YEAR INT[\"7\"] ) | AUGUST -> ^( MONTH_OF_YEAR INT[\"8\"] ) | SEPTEMBER -> ^( MONTH_OF_YEAR INT[\"9\"] ) | OCTOBER -> ^( MONTH_OF_YEAR INT[\"10\"] ) | NOVEMBER -> ^( MONTH_OF_YEAR INT[\"11\"] ) | DECEMBER -> ^( MONTH_OF_YEAR INT[\"12\"] ) );
    public final DateParser.relaxed_month_return relaxed_month() throws RecognitionException {
        DateParser.relaxed_month_return retval = new DateParser.relaxed_month_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token JANUARY71=null;
        Token FEBRUARY72=null;
        Token MARCH73=null;
        Token APRIL74=null;
        Token MAY75=null;
        Token JUNE76=null;
        Token JULY77=null;
        Token AUGUST78=null;
        Token SEPTEMBER79=null;
        Token OCTOBER80=null;
        Token NOVEMBER81=null;
        Token DECEMBER82=null;

        Object JANUARY71_tree=null;
        Object FEBRUARY72_tree=null;
        Object MARCH73_tree=null;
        Object APRIL74_tree=null;
        Object MAY75_tree=null;
        Object JUNE76_tree=null;
        Object JULY77_tree=null;
        Object AUGUST78_tree=null;
        Object SEPTEMBER79_tree=null;
        Object OCTOBER80_tree=null;
        Object NOVEMBER81_tree=null;
        Object DECEMBER82_tree=null;
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

        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:107:3: ( JANUARY -> ^( MONTH_OF_YEAR INT[\"1\"] ) | FEBRUARY -> ^( MONTH_OF_YEAR INT[\"2\"] ) | MARCH -> ^( MONTH_OF_YEAR INT[\"3\"] ) | APRIL -> ^( MONTH_OF_YEAR INT[\"4\"] ) | MAY -> ^( MONTH_OF_YEAR INT[\"5\"] ) | JUNE -> ^( MONTH_OF_YEAR INT[\"6\"] ) | JULY -> ^( MONTH_OF_YEAR INT[\"7\"] ) | AUGUST -> ^( MONTH_OF_YEAR INT[\"8\"] ) | SEPTEMBER -> ^( MONTH_OF_YEAR INT[\"9\"] ) | OCTOBER -> ^( MONTH_OF_YEAR INT[\"10\"] ) | NOVEMBER -> ^( MONTH_OF_YEAR INT[\"11\"] ) | DECEMBER -> ^( MONTH_OF_YEAR INT[\"12\"] ) )
            int alt26=12;
            switch ( input.LA(1) ) {
            case JANUARY:
                {
                alt26=1;
                }
                break;
            case FEBRUARY:
                {
                alt26=2;
                }
                break;
            case MARCH:
                {
                alt26=3;
                }
                break;
            case APRIL:
                {
                alt26=4;
                }
                break;
            case MAY:
                {
                alt26=5;
                }
                break;
            case JUNE:
                {
                alt26=6;
                }
                break;
            case JULY:
                {
                alt26=7;
                }
                break;
            case AUGUST:
                {
                alt26=8;
                }
                break;
            case SEPTEMBER:
                {
                alt26=9;
                }
                break;
            case OCTOBER:
                {
                alt26=10;
                }
                break;
            case NOVEMBER:
                {
                alt26=11;
                }
                break;
            case DECEMBER:
                {
                alt26=12;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:107:5: JANUARY
                    {
                    JANUARY71=(Token)match(input,JANUARY,FOLLOW_JANUARY_in_relaxed_month805); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_JANUARY.add(JANUARY71);



                    // AST REWRITE
                    // elements: 
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
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:107:18: ^( MONTH_OF_YEAR INT[\"1\"] )
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
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:108:5: FEBRUARY
                    {
                    FEBRUARY72=(Token)match(input,FEBRUARY,FOLLOW_FEBRUARY_in_relaxed_month822); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FEBRUARY.add(FEBRUARY72);



                    // AST REWRITE
                    // elements: 
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
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:108:18: ^( MONTH_OF_YEAR INT[\"2\"] )
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
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:109:5: MARCH
                    {
                    MARCH73=(Token)match(input,MARCH,FOLLOW_MARCH_in_relaxed_month838); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_MARCH.add(MARCH73);



                    // AST REWRITE
                    // elements: 
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
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:109:18: ^( MONTH_OF_YEAR INT[\"3\"] )
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
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:110:5: APRIL
                    {
                    APRIL74=(Token)match(input,APRIL,FOLLOW_APRIL_in_relaxed_month857); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_APRIL.add(APRIL74);



                    // AST REWRITE
                    // elements: 
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
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:110:18: ^( MONTH_OF_YEAR INT[\"4\"] )
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
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:111:5: MAY
                    {
                    MAY75=(Token)match(input,MAY,FOLLOW_MAY_in_relaxed_month876); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_MAY.add(MAY75);



                    // AST REWRITE
                    // elements: 
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
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:111:18: ^( MONTH_OF_YEAR INT[\"5\"] )
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
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:112:5: JUNE
                    {
                    JUNE76=(Token)match(input,JUNE,FOLLOW_JUNE_in_relaxed_month897); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_JUNE.add(JUNE76);



                    // AST REWRITE
                    // elements: 
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
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:112:18: ^( MONTH_OF_YEAR INT[\"6\"] )
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
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:113:5: JULY
                    {
                    JULY77=(Token)match(input,JULY,FOLLOW_JULY_in_relaxed_month917); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_JULY.add(JULY77);



                    // AST REWRITE
                    // elements: 
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
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:113:18: ^( MONTH_OF_YEAR INT[\"7\"] )
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
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:114:5: AUGUST
                    {
                    AUGUST78=(Token)match(input,AUGUST,FOLLOW_AUGUST_in_relaxed_month937); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AUGUST.add(AUGUST78);



                    // AST REWRITE
                    // elements: 
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
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:114:18: ^( MONTH_OF_YEAR INT[\"8\"] )
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
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:115:5: SEPTEMBER
                    {
                    SEPTEMBER79=(Token)match(input,SEPTEMBER,FOLLOW_SEPTEMBER_in_relaxed_month955); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEPTEMBER.add(SEPTEMBER79);



                    // AST REWRITE
                    // elements: 
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
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:115:18: ^( MONTH_OF_YEAR INT[\"9\"] )
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
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:116:5: OCTOBER
                    {
                    OCTOBER80=(Token)match(input,OCTOBER,FOLLOW_OCTOBER_in_relaxed_month970); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OCTOBER.add(OCTOBER80);



                    // AST REWRITE
                    // elements: 
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
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:116:18: ^( MONTH_OF_YEAR INT[\"10\"] )
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
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:117:5: NOVEMBER
                    {
                    NOVEMBER81=(Token)match(input,NOVEMBER,FOLLOW_NOVEMBER_in_relaxed_month987); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NOVEMBER.add(NOVEMBER81);



                    // AST REWRITE
                    // elements: 
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
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:117:18: ^( MONTH_OF_YEAR INT[\"11\"] )
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
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:118:5: DECEMBER
                    {
                    DECEMBER82=(Token)match(input,DECEMBER,FOLLOW_DECEMBER_in_relaxed_month1003); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DECEMBER.add(DECEMBER82);



                    // AST REWRITE
                    // elements: 
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
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:118:18: ^( MONTH_OF_YEAR INT[\"12\"] )
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
    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:121:1: relaxed_day_of_month : ( spelled_or_int_01_to_31_optional_prefix -> ^( DAY_OF_MONTH spelled_or_int_01_to_31_optional_prefix ) | spelled_first_to_thirty_first -> ^( DAY_OF_MONTH spelled_first_to_thirty_first ) );
    public final DateParser.relaxed_day_of_month_return relaxed_day_of_month() throws RecognitionException {
        DateParser.relaxed_day_of_month_return retval = new DateParser.relaxed_day_of_month_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        DateParser.spelled_or_int_01_to_31_optional_prefix_return spelled_or_int_01_to_31_optional_prefix83 = null;

        DateParser.spelled_first_to_thirty_first_return spelled_first_to_thirty_first84 = null;


        RewriteRuleSubtreeStream stream_spelled_first_to_thirty_first=new RewriteRuleSubtreeStream(adaptor,"rule spelled_first_to_thirty_first");
        RewriteRuleSubtreeStream stream_spelled_or_int_01_to_31_optional_prefix=new RewriteRuleSubtreeStream(adaptor,"rule spelled_or_int_01_to_31_optional_prefix");
        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:122:3: ( spelled_or_int_01_to_31_optional_prefix -> ^( DAY_OF_MONTH spelled_or_int_01_to_31_optional_prefix ) | spelled_first_to_thirty_first -> ^( DAY_OF_MONTH spelled_first_to_thirty_first ) )
            int alt27=2;
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
                alt27=1;
                }
                break;
            case TWENTY:
                {
                switch ( input.LA(2) ) {
                case WHITE_SPACE:
                    {
                    int LA27_5 = input.LA(3);

                    if ( (LA27_5==EOF||LA27_5==STRING||LA27_5==AT||(LA27_5>=OF && LA27_5<=IN)||(LA27_5>=NOON && LA27_5<=NINE)) ) {
                        alt27=1;
                    }
                    else if ( ((LA27_5>=FIRST && LA27_5<=NINTH)) ) {
                        alt27=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 27, 5, input);

                        throw nvae;
                    }
                    }
                    break;
                case EOF:
                case STRING:
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
                    alt27=1;
                    }
                    break;
                case DASH:
                    {
                    int LA27_6 = input.LA(3);

                    if ( ((LA27_6>=ONE && LA27_6<=NINE)) ) {
                        alt27=1;
                    }
                    else if ( ((LA27_6>=FIRST && LA27_6<=NINTH)) ) {
                        alt27=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 27, 6, input);

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
                    alt27=2;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 27, 2, input);

                    throw nvae;
                }

                }
                break;
            case THIRTY:
                {
                switch ( input.LA(2) ) {
                case DASH:
                    {
                    int LA27_7 = input.LA(3);

                    if ( (LA27_7==FIRST) ) {
                        alt27=2;
                    }
                    else if ( (LA27_7==ONE) ) {
                        alt27=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 27, 7, input);

                        throw nvae;
                    }
                    }
                    break;
                case WHITE_SPACE:
                    {
                    int LA27_8 = input.LA(3);

                    if ( (LA27_8==EOF||LA27_8==STRING||LA27_8==AT||(LA27_8>=OF && LA27_8<=IN)||(LA27_8>=NOON && LA27_8<=ONE)) ) {
                        alt27=1;
                    }
                    else if ( (LA27_8==FIRST) ) {
                        alt27=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 27, 8, input);

                        throw nvae;
                    }
                    }
                    break;
                case FIRST:
                    {
                    alt27=2;
                    }
                    break;
                case EOF:
                case STRING:
                case COMMA:
                case ONE:
                    {
                    alt27=1;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 27, 3, input);

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
                alt27=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:122:5: spelled_or_int_01_to_31_optional_prefix
                    {
                    pushFollow(FOLLOW_spelled_or_int_01_to_31_optional_prefix_in_relaxed_day_of_month1028);
                    spelled_or_int_01_to_31_optional_prefix83=spelled_or_int_01_to_31_optional_prefix();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_spelled_or_int_01_to_31_optional_prefix.add(spelled_or_int_01_to_31_optional_prefix83.getTree());


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
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:123:10: ^( DAY_OF_MONTH spelled_or_int_01_to_31_optional_prefix )
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
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:125:5: spelled_first_to_thirty_first
                    {
                    pushFollow(FOLLOW_spelled_first_to_thirty_first_in_relaxed_day_of_month1055);
                    spelled_first_to_thirty_first84=spelled_first_to_thirty_first();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_spelled_first_to_thirty_first.add(spelled_first_to_thirty_first84.getTree());


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
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:126:10: ^( DAY_OF_MONTH spelled_first_to_thirty_first )
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
    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:129:1: relaxed_year : ( relaxed_year_prefix ( SINGLE_QUOTE )? int_00_to_99_mandatory_prefix -> ^( YEAR_OF int_00_to_99_mandatory_prefix ) | relaxed_year_prefix int_four_digits -> ^( YEAR_OF int_four_digits ) );
    public final DateParser.relaxed_year_return relaxed_year() throws RecognitionException {
        DateParser.relaxed_year_return retval = new DateParser.relaxed_year_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SINGLE_QUOTE86=null;
        DateParser.relaxed_year_prefix_return relaxed_year_prefix85 = null;

        DateParser.int_00_to_99_mandatory_prefix_return int_00_to_99_mandatory_prefix87 = null;

        DateParser.relaxed_year_prefix_return relaxed_year_prefix88 = null;

        DateParser.int_four_digits_return int_four_digits89 = null;


        Object SINGLE_QUOTE86_tree=null;
        RewriteRuleTokenStream stream_SINGLE_QUOTE=new RewriteRuleTokenStream(adaptor,"token SINGLE_QUOTE");
        RewriteRuleSubtreeStream stream_relaxed_year_prefix=new RewriteRuleSubtreeStream(adaptor,"rule relaxed_year_prefix");
        RewriteRuleSubtreeStream stream_int_four_digits=new RewriteRuleSubtreeStream(adaptor,"rule int_four_digits");
        RewriteRuleSubtreeStream stream_int_00_to_99_mandatory_prefix=new RewriteRuleSubtreeStream(adaptor,"rule int_00_to_99_mandatory_prefix");
        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:130:3: ( relaxed_year_prefix ( SINGLE_QUOTE )? int_00_to_99_mandatory_prefix -> ^( YEAR_OF int_00_to_99_mandatory_prefix ) | relaxed_year_prefix int_four_digits -> ^( YEAR_OF int_four_digits ) )
            int alt29=2;
            alt29 = dfa29.predict(input);
            switch (alt29) {
                case 1 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:130:5: relaxed_year_prefix ( SINGLE_QUOTE )? int_00_to_99_mandatory_prefix
                    {
                    pushFollow(FOLLOW_relaxed_year_prefix_in_relaxed_year1085);
                    relaxed_year_prefix85=relaxed_year_prefix();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_relaxed_year_prefix.add(relaxed_year_prefix85.getTree());
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:130:25: ( SINGLE_QUOTE )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==SINGLE_QUOTE) ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:130:25: SINGLE_QUOTE
                            {
                            SINGLE_QUOTE86=(Token)match(input,SINGLE_QUOTE,FOLLOW_SINGLE_QUOTE_in_relaxed_year1087); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_SINGLE_QUOTE.add(SINGLE_QUOTE86);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_int_00_to_99_mandatory_prefix_in_relaxed_year1090);
                    int_00_to_99_mandatory_prefix87=int_00_to_99_mandatory_prefix();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_int_00_to_99_mandatory_prefix.add(int_00_to_99_mandatory_prefix87.getTree());


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
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:131:10: ^( YEAR_OF int_00_to_99_mandatory_prefix )
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
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:133:5: relaxed_year_prefix int_four_digits
                    {
                    pushFollow(FOLLOW_relaxed_year_prefix_in_relaxed_year1117);
                    relaxed_year_prefix88=relaxed_year_prefix();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_relaxed_year_prefix.add(relaxed_year_prefix88.getTree());
                    pushFollow(FOLLOW_int_four_digits_in_relaxed_year1119);
                    int_four_digits89=int_four_digits();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_int_four_digits.add(int_four_digits89.getTree());


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
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:134:10: ^( YEAR_OF int_four_digits )
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
    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:137:1: relaxed_year_prefix : ( COMMA ( WHITE_SPACE )? | WHITE_SPACE ) ( IN WHITE_SPACE THE WHITE_SPACE YEAR WHITE_SPACE )? ;
    public final DateParser.relaxed_year_prefix_return relaxed_year_prefix() throws RecognitionException {
        DateParser.relaxed_year_prefix_return retval = new DateParser.relaxed_year_prefix_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token COMMA90=null;
        Token WHITE_SPACE91=null;
        Token WHITE_SPACE92=null;
        Token IN93=null;
        Token WHITE_SPACE94=null;
        Token THE95=null;
        Token WHITE_SPACE96=null;
        Token YEAR97=null;
        Token WHITE_SPACE98=null;

        Object COMMA90_tree=null;
        Object WHITE_SPACE91_tree=null;
        Object WHITE_SPACE92_tree=null;
        Object IN93_tree=null;
        Object WHITE_SPACE94_tree=null;
        Object THE95_tree=null;
        Object WHITE_SPACE96_tree=null;
        Object YEAR97_tree=null;
        Object WHITE_SPACE98_tree=null;

        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:138:3: ( ( COMMA ( WHITE_SPACE )? | WHITE_SPACE ) ( IN WHITE_SPACE THE WHITE_SPACE YEAR WHITE_SPACE )? )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:138:5: ( COMMA ( WHITE_SPACE )? | WHITE_SPACE ) ( IN WHITE_SPACE THE WHITE_SPACE YEAR WHITE_SPACE )?
            {
            root_0 = (Object)adaptor.nil();

            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:138:5: ( COMMA ( WHITE_SPACE )? | WHITE_SPACE )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==COMMA) ) {
                alt31=1;
            }
            else if ( (LA31_0==WHITE_SPACE) ) {
                alt31=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:138:6: COMMA ( WHITE_SPACE )?
                    {
                    COMMA90=(Token)match(input,COMMA,FOLLOW_COMMA_in_relaxed_year_prefix1149); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    COMMA90_tree = (Object)adaptor.create(COMMA90);
                    adaptor.addChild(root_0, COMMA90_tree);
                    }
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:138:12: ( WHITE_SPACE )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==WHITE_SPACE) ) {
                        alt30=1;
                    }
                    switch (alt30) {
                        case 1 :
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:138:12: WHITE_SPACE
                            {
                            WHITE_SPACE91=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_relaxed_year_prefix1151); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            WHITE_SPACE91_tree = (Object)adaptor.create(WHITE_SPACE91);
                            adaptor.addChild(root_0, WHITE_SPACE91_tree);
                            }

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:138:27: WHITE_SPACE
                    {
                    WHITE_SPACE92=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_relaxed_year_prefix1156); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    WHITE_SPACE92_tree = (Object)adaptor.create(WHITE_SPACE92);
                    adaptor.addChild(root_0, WHITE_SPACE92_tree);
                    }

                    }
                    break;

            }

            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:138:40: ( IN WHITE_SPACE THE WHITE_SPACE YEAR WHITE_SPACE )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==IN) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:138:41: IN WHITE_SPACE THE WHITE_SPACE YEAR WHITE_SPACE
                    {
                    IN93=(Token)match(input,IN,FOLLOW_IN_in_relaxed_year_prefix1160); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IN93_tree = (Object)adaptor.create(IN93);
                    adaptor.addChild(root_0, IN93_tree);
                    }
                    WHITE_SPACE94=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_relaxed_year_prefix1162); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    WHITE_SPACE94_tree = (Object)adaptor.create(WHITE_SPACE94);
                    adaptor.addChild(root_0, WHITE_SPACE94_tree);
                    }
                    THE95=(Token)match(input,THE,FOLLOW_THE_in_relaxed_year_prefix1164); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    THE95_tree = (Object)adaptor.create(THE95);
                    adaptor.addChild(root_0, THE95_tree);
                    }
                    WHITE_SPACE96=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_relaxed_year_prefix1166); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    WHITE_SPACE96_tree = (Object)adaptor.create(WHITE_SPACE96);
                    adaptor.addChild(root_0, WHITE_SPACE96_tree);
                    }
                    YEAR97=(Token)match(input,YEAR,FOLLOW_YEAR_in_relaxed_year_prefix1168); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    YEAR97_tree = (Object)adaptor.create(YEAR97);
                    adaptor.addChild(root_0, YEAR97_tree);
                    }
                    WHITE_SPACE98=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_relaxed_year_prefix1170); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    WHITE_SPACE98_tree = (Object)adaptor.create(WHITE_SPACE98);
                    adaptor.addChild(root_0, WHITE_SPACE98_tree);
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
    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:143:1: formal_date : ( formal_year_four_digits formal_date_separator formal_month_of_year formal_date_separator formal_day_of_month -> ^( EXPLICIT_DATE formal_month_of_year formal_day_of_month formal_year_four_digits ) | formal_month_of_year formal_date_separator formal_day_of_month ( formal_date_separator formal_year )? -> ^( EXPLICIT_DATE formal_month_of_year formal_day_of_month ( formal_year )? ) );
    public final DateParser.formal_date_return formal_date() throws RecognitionException {
        DateParser.formal_date_return retval = new DateParser.formal_date_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        DateParser.formal_year_four_digits_return formal_year_four_digits99 = null;

        DateParser.formal_date_separator_return formal_date_separator100 = null;

        DateParser.formal_month_of_year_return formal_month_of_year101 = null;

        DateParser.formal_date_separator_return formal_date_separator102 = null;

        DateParser.formal_day_of_month_return formal_day_of_month103 = null;

        DateParser.formal_month_of_year_return formal_month_of_year104 = null;

        DateParser.formal_date_separator_return formal_date_separator105 = null;

        DateParser.formal_day_of_month_return formal_day_of_month106 = null;

        DateParser.formal_date_separator_return formal_date_separator107 = null;

        DateParser.formal_year_return formal_year108 = null;


        RewriteRuleSubtreeStream stream_formal_year=new RewriteRuleSubtreeStream(adaptor,"rule formal_year");
        RewriteRuleSubtreeStream stream_formal_day_of_month=new RewriteRuleSubtreeStream(adaptor,"rule formal_day_of_month");
        RewriteRuleSubtreeStream stream_formal_year_four_digits=new RewriteRuleSubtreeStream(adaptor,"rule formal_year_four_digits");
        RewriteRuleSubtreeStream stream_formal_date_separator=new RewriteRuleSubtreeStream(adaptor,"rule formal_date_separator");
        RewriteRuleSubtreeStream stream_formal_month_of_year=new RewriteRuleSubtreeStream(adaptor,"rule formal_month_of_year");
        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:145:3: ( formal_year_four_digits formal_date_separator formal_month_of_year formal_date_separator formal_day_of_month -> ^( EXPLICIT_DATE formal_month_of_year formal_day_of_month formal_year_four_digits ) | formal_month_of_year formal_date_separator formal_day_of_month ( formal_date_separator formal_year )? -> ^( EXPLICIT_DATE formal_month_of_year formal_day_of_month ( formal_year )? ) )
            int alt34=2;
            switch ( input.LA(1) ) {
            case INT_00:
            case INT_13_TO_23:
            case INT_24_TO_31:
            case INT_32_TO_59:
            case INT_60_TO_99:
                {
                alt34=1;
                }
                break;
            case INT_01_TO_12:
                {
                int LA34_2 = input.LA(2);

                if ( ((LA34_2>=DASH && LA34_2<=SLASH)) ) {
                    alt34=2;
                }
                else if ( (LA34_2==INT_00||(LA34_2>=INT_01_TO_12 && LA34_2<=INT_60_TO_99)) ) {
                    alt34=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 34, 2, input);

                    throw nvae;
                }
                }
                break;
            case INT_1_TO_9:
                {
                alt34=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }

            switch (alt34) {
                case 1 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:145:5: formal_year_four_digits formal_date_separator formal_month_of_year formal_date_separator formal_day_of_month
                    {
                    pushFollow(FOLLOW_formal_year_four_digits_in_formal_date1193);
                    formal_year_four_digits99=formal_year_four_digits();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_formal_year_four_digits.add(formal_year_four_digits99.getTree());
                    pushFollow(FOLLOW_formal_date_separator_in_formal_date1195);
                    formal_date_separator100=formal_date_separator();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_formal_date_separator.add(formal_date_separator100.getTree());
                    pushFollow(FOLLOW_formal_month_of_year_in_formal_date1197);
                    formal_month_of_year101=formal_month_of_year();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_formal_month_of_year.add(formal_month_of_year101.getTree());
                    pushFollow(FOLLOW_formal_date_separator_in_formal_date1199);
                    formal_date_separator102=formal_date_separator();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_formal_date_separator.add(formal_date_separator102.getTree());
                    pushFollow(FOLLOW_formal_day_of_month_in_formal_date1201);
                    formal_day_of_month103=formal_day_of_month();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_formal_day_of_month.add(formal_day_of_month103.getTree());


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
                    // 146:7: -> ^( EXPLICIT_DATE formal_month_of_year formal_day_of_month formal_year_four_digits )
                    {
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:146:10: ^( EXPLICIT_DATE formal_month_of_year formal_day_of_month formal_year_four_digits )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPLICIT_DATE, "EXPLICIT_DATE"), root_1);

                        adaptor.addChild(root_1, stream_formal_month_of_year.nextTree());
                        adaptor.addChild(root_1, stream_formal_day_of_month.nextTree());
                        adaptor.addChild(root_1, stream_formal_year_four_digits.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:149:5: formal_month_of_year formal_date_separator formal_day_of_month ( formal_date_separator formal_year )?
                    {
                    pushFollow(FOLLOW_formal_month_of_year_in_formal_date1230);
                    formal_month_of_year104=formal_month_of_year();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_formal_month_of_year.add(formal_month_of_year104.getTree());
                    pushFollow(FOLLOW_formal_date_separator_in_formal_date1232);
                    formal_date_separator105=formal_date_separator();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_formal_date_separator.add(formal_date_separator105.getTree());
                    pushFollow(FOLLOW_formal_day_of_month_in_formal_date1234);
                    formal_day_of_month106=formal_day_of_month();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_formal_day_of_month.add(formal_day_of_month106.getTree());
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:149:68: ( formal_date_separator formal_year )?
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( ((LA33_0>=DASH && LA33_0<=SLASH)) ) {
                        alt33=1;
                    }
                    switch (alt33) {
                        case 1 :
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:149:69: formal_date_separator formal_year
                            {
                            pushFollow(FOLLOW_formal_date_separator_in_formal_date1237);
                            formal_date_separator107=formal_date_separator();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_formal_date_separator.add(formal_date_separator107.getTree());
                            pushFollow(FOLLOW_formal_year_in_formal_date1239);
                            formal_year108=formal_year();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_formal_year.add(formal_year108.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: formal_day_of_month, formal_year, formal_month_of_year
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
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:150:10: ^( EXPLICIT_DATE formal_month_of_year formal_day_of_month ( formal_year )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPLICIT_DATE, "EXPLICIT_DATE"), root_1);

                        adaptor.addChild(root_1, stream_formal_month_of_year.nextTree());
                        adaptor.addChild(root_1, stream_formal_day_of_month.nextTree());
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:150:67: ( formal_year )?
                        if ( stream_formal_year.hasNext() ) {
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

        DateParser.int_01_to_12_optional_prefix_return int_01_to_12_optional_prefix109 = null;


        RewriteRuleSubtreeStream stream_int_01_to_12_optional_prefix=new RewriteRuleSubtreeStream(adaptor,"rule int_01_to_12_optional_prefix");
        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:154:3: ( int_01_to_12_optional_prefix -> ^( MONTH_OF_YEAR int_01_to_12_optional_prefix ) )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:154:5: int_01_to_12_optional_prefix
            {
            pushFollow(FOLLOW_int_01_to_12_optional_prefix_in_formal_month_of_year1273);
            int_01_to_12_optional_prefix109=int_01_to_12_optional_prefix();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_int_01_to_12_optional_prefix.add(int_01_to_12_optional_prefix109.getTree());


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
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:154:37: ^( MONTH_OF_YEAR int_01_to_12_optional_prefix )
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
    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:157:1: formal_day_of_month : int_01_to_31_optional_prefix -> ^( DAY_OF_MONTH int_01_to_31_optional_prefix ) ;
    public final DateParser.formal_day_of_month_return formal_day_of_month() throws RecognitionException {
        DateParser.formal_day_of_month_return retval = new DateParser.formal_day_of_month_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        DateParser.int_01_to_31_optional_prefix_return int_01_to_31_optional_prefix110 = null;


        RewriteRuleSubtreeStream stream_int_01_to_31_optional_prefix=new RewriteRuleSubtreeStream(adaptor,"rule int_01_to_31_optional_prefix");
        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:158:3: ( int_01_to_31_optional_prefix -> ^( DAY_OF_MONTH int_01_to_31_optional_prefix ) )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:158:5: int_01_to_31_optional_prefix
            {
            pushFollow(FOLLOW_int_01_to_31_optional_prefix_in_formal_day_of_month1296);
            int_01_to_31_optional_prefix110=int_01_to_31_optional_prefix();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_int_01_to_31_optional_prefix.add(int_01_to_31_optional_prefix110.getTree());


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
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:158:37: ^( DAY_OF_MONTH int_01_to_31_optional_prefix )
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
    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:161:1: formal_year : ( formal_year_four_digits | int_00_to_99_mandatory_prefix -> ^( YEAR_OF int_00_to_99_mandatory_prefix ) );
    public final DateParser.formal_year_return formal_year() throws RecognitionException {
        DateParser.formal_year_return retval = new DateParser.formal_year_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        DateParser.formal_year_four_digits_return formal_year_four_digits111 = null;

        DateParser.int_00_to_99_mandatory_prefix_return int_00_to_99_mandatory_prefix112 = null;


        RewriteRuleSubtreeStream stream_int_00_to_99_mandatory_prefix=new RewriteRuleSubtreeStream(adaptor,"rule int_00_to_99_mandatory_prefix");
        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:162:3: ( formal_year_four_digits | int_00_to_99_mandatory_prefix -> ^( YEAR_OF int_00_to_99_mandatory_prefix ) )
            int alt35=2;
            switch ( input.LA(1) ) {
            case INT_00:
                {
                int LA35_1 = input.LA(2);

                if ( (LA35_1==EOF||(LA35_1>=STRING && LA35_1<=WHITE_SPACE)||LA35_1==COMMA) ) {
                    alt35=2;
                }
                else if ( (LA35_1==INT_00||(LA35_1>=INT_01_TO_12 && LA35_1<=INT_60_TO_99)) ) {
                    alt35=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 35, 1, input);

                    throw nvae;
                }
                }
                break;
            case INT_01_TO_12:
                {
                int LA35_2 = input.LA(2);

                if ( (LA35_2==EOF||(LA35_2>=STRING && LA35_2<=WHITE_SPACE)||LA35_2==COMMA) ) {
                    alt35=2;
                }
                else if ( (LA35_2==INT_00||(LA35_2>=INT_01_TO_12 && LA35_2<=INT_60_TO_99)) ) {
                    alt35=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 35, 2, input);

                    throw nvae;
                }
                }
                break;
            case INT_13_TO_23:
                {
                int LA35_3 = input.LA(2);

                if ( (LA35_3==EOF||(LA35_3>=STRING && LA35_3<=WHITE_SPACE)||LA35_3==COMMA) ) {
                    alt35=2;
                }
                else if ( (LA35_3==INT_00||(LA35_3>=INT_01_TO_12 && LA35_3<=INT_60_TO_99)) ) {
                    alt35=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 35, 3, input);

                    throw nvae;
                }
                }
                break;
            case INT_24_TO_31:
                {
                int LA35_4 = input.LA(2);

                if ( (LA35_4==EOF||(LA35_4>=STRING && LA35_4<=WHITE_SPACE)||LA35_4==COMMA) ) {
                    alt35=2;
                }
                else if ( (LA35_4==INT_00||(LA35_4>=INT_01_TO_12 && LA35_4<=INT_60_TO_99)) ) {
                    alt35=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 35, 4, input);

                    throw nvae;
                }
                }
                break;
            case INT_32_TO_59:
                {
                int LA35_5 = input.LA(2);

                if ( (LA35_5==EOF||(LA35_5>=STRING && LA35_5<=WHITE_SPACE)||LA35_5==COMMA) ) {
                    alt35=2;
                }
                else if ( (LA35_5==INT_00||(LA35_5>=INT_01_TO_12 && LA35_5<=INT_60_TO_99)) ) {
                    alt35=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 35, 5, input);

                    throw nvae;
                }
                }
                break;
            case INT_60_TO_99:
                {
                int LA35_6 = input.LA(2);

                if ( (LA35_6==INT_00||(LA35_6>=INT_01_TO_12 && LA35_6<=INT_60_TO_99)) ) {
                    alt35=1;
                }
                else if ( (LA35_6==EOF||(LA35_6>=STRING && LA35_6<=WHITE_SPACE)||LA35_6==COMMA) ) {
                    alt35=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 35, 6, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }

            switch (alt35) {
                case 1 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:162:5: formal_year_four_digits
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_formal_year_four_digits_in_formal_year1319);
                    formal_year_four_digits111=formal_year_four_digits();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, formal_year_four_digits111.getTree());

                    }
                    break;
                case 2 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:163:5: int_00_to_99_mandatory_prefix
                    {
                    pushFollow(FOLLOW_int_00_to_99_mandatory_prefix_in_formal_year1325);
                    int_00_to_99_mandatory_prefix112=int_00_to_99_mandatory_prefix();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_int_00_to_99_mandatory_prefix.add(int_00_to_99_mandatory_prefix112.getTree());


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
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:163:38: ^( YEAR_OF int_00_to_99_mandatory_prefix )
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

        DateParser.int_four_digits_return int_four_digits113 = null;


        RewriteRuleSubtreeStream stream_int_four_digits=new RewriteRuleSubtreeStream(adaptor,"rule int_four_digits");
        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:167:3: ( int_four_digits -> ^( YEAR_OF int_four_digits ) )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:167:5: int_four_digits
            {
            pushFollow(FOLLOW_int_four_digits_in_formal_year_four_digits1348);
            int_four_digits113=int_four_digits();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_int_four_digits.add(int_four_digits113.getTree());


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
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:167:24: ^( YEAR_OF int_four_digits )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(YEAR_OF, "YEAR_OF"), root_1);

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

        Token set114=null;

        Object set114_tree=null;

        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:171:3: ( DASH | SLASH )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:
            {
            root_0 = (Object)adaptor.nil();

            set114=(Token)input.LT(1);
            if ( (input.LA(1)>=DASH && input.LA(1)<=SLASH) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set114));
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
    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:177:1: relative_date : ( relative_prefix WHITE_SPACE relative_target ( 's' )? -> ^( RELATIVE_DATE ^( SEEK relative_prefix relative_target ) ) | implicit_prefix WHITE_SPACE relative_target -> ^( RELATIVE_DATE ^( SEEK implicit_prefix relative_target ) ) | relative_target -> ^( RELATIVE_DATE ^( SEEK DIRECTION[\">\"] SEEK_BY[\"by_day\"] INT[\"0\"] relative_target ) ) | spelled_or_int_01_to_31_optional_prefix WHITE_SPACE relative_target WHITE_SPACE relative_suffix -> ^( RELATIVE_DATE ^( SEEK relative_suffix spelled_or_int_01_to_31_optional_prefix relative_target ) ) | named_relative_date );
    public final DateParser.relative_date_return relative_date() throws RecognitionException {
        DateParser.relative_date_return retval = new DateParser.relative_date_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token WHITE_SPACE116=null;
        Token char_literal118=null;
        Token WHITE_SPACE120=null;
        Token WHITE_SPACE124=null;
        Token WHITE_SPACE126=null;
        DateParser.relative_prefix_return relative_prefix115 = null;

        DateParser.relative_target_return relative_target117 = null;

        DateParser.implicit_prefix_return implicit_prefix119 = null;

        DateParser.relative_target_return relative_target121 = null;

        DateParser.relative_target_return relative_target122 = null;

        DateParser.spelled_or_int_01_to_31_optional_prefix_return spelled_or_int_01_to_31_optional_prefix123 = null;

        DateParser.relative_target_return relative_target125 = null;

        DateParser.relative_suffix_return relative_suffix127 = null;

        DateParser.named_relative_date_return named_relative_date128 = null;


        Object WHITE_SPACE116_tree=null;
        Object char_literal118_tree=null;
        Object WHITE_SPACE120_tree=null;
        Object WHITE_SPACE124_tree=null;
        Object WHITE_SPACE126_tree=null;
        RewriteRuleTokenStream stream_136=new RewriteRuleTokenStream(adaptor,"token 136");
        RewriteRuleTokenStream stream_WHITE_SPACE=new RewriteRuleTokenStream(adaptor,"token WHITE_SPACE");
        RewriteRuleSubtreeStream stream_relative_suffix=new RewriteRuleSubtreeStream(adaptor,"rule relative_suffix");
        RewriteRuleSubtreeStream stream_implicit_prefix=new RewriteRuleSubtreeStream(adaptor,"rule implicit_prefix");
        RewriteRuleSubtreeStream stream_relative_prefix=new RewriteRuleSubtreeStream(adaptor,"rule relative_prefix");
        RewriteRuleSubtreeStream stream_spelled_or_int_01_to_31_optional_prefix=new RewriteRuleSubtreeStream(adaptor,"rule spelled_or_int_01_to_31_optional_prefix");
        RewriteRuleSubtreeStream stream_relative_target=new RewriteRuleSubtreeStream(adaptor,"rule relative_target");
        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:178:3: ( relative_prefix WHITE_SPACE relative_target ( 's' )? -> ^( RELATIVE_DATE ^( SEEK relative_prefix relative_target ) ) | implicit_prefix WHITE_SPACE relative_target -> ^( RELATIVE_DATE ^( SEEK implicit_prefix relative_target ) ) | relative_target -> ^( RELATIVE_DATE ^( SEEK DIRECTION[\">\"] SEEK_BY[\"by_day\"] INT[\"0\"] relative_target ) ) | spelled_or_int_01_to_31_optional_prefix WHITE_SPACE relative_target WHITE_SPACE relative_suffix -> ^( RELATIVE_DATE ^( SEEK relative_suffix spelled_or_int_01_to_31_optional_prefix relative_target ) ) | named_relative_date )
            int alt37=5;
            alt37 = dfa37.predict(input);
            switch (alt37) {
                case 1 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:178:5: relative_prefix WHITE_SPACE relative_target ( 's' )?
                    {
                    pushFollow(FOLLOW_relative_prefix_in_relative_date1397);
                    relative_prefix115=relative_prefix();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_relative_prefix.add(relative_prefix115.getTree());
                    WHITE_SPACE116=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_relative_date1399); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE116);

                    pushFollow(FOLLOW_relative_target_in_relative_date1401);
                    relative_target117=relative_target();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_relative_target.add(relative_target117.getTree());
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:178:49: ( 's' )?
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0==136) ) {
                        alt36=1;
                    }
                    switch (alt36) {
                        case 1 :
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:178:49: 's'
                            {
                            char_literal118=(Token)match(input,136,FOLLOW_136_in_relative_date1403); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_136.add(char_literal118);


                            }
                            break;

                    }



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
                    // 179:7: -> ^( RELATIVE_DATE ^( SEEK relative_prefix relative_target ) )
                    {
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:179:10: ^( RELATIVE_DATE ^( SEEK relative_prefix relative_target ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(RELATIVE_DATE, "RELATIVE_DATE"), root_1);

                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:179:26: ^( SEEK relative_prefix relative_target )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(SEEK, "SEEK"), root_2);

                        adaptor.addChild(root_2, stream_relative_prefix.nextTree());
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
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:181:5: implicit_prefix WHITE_SPACE relative_target
                    {
                    pushFollow(FOLLOW_implicit_prefix_in_relative_date1437);
                    implicit_prefix119=implicit_prefix();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_implicit_prefix.add(implicit_prefix119.getTree());
                    WHITE_SPACE120=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_relative_date1439); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE120);

                    pushFollow(FOLLOW_relative_target_in_relative_date1441);
                    relative_target121=relative_target();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_relative_target.add(relative_target121.getTree());


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
                    // 182:7: -> ^( RELATIVE_DATE ^( SEEK implicit_prefix relative_target ) )
                    {
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:182:10: ^( RELATIVE_DATE ^( SEEK implicit_prefix relative_target ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(RELATIVE_DATE, "RELATIVE_DATE"), root_1);

                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:182:26: ^( SEEK implicit_prefix relative_target )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(SEEK, "SEEK"), root_2);

                        adaptor.addChild(root_2, stream_implicit_prefix.nextTree());
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
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:185:5: relative_target
                    {
                    pushFollow(FOLLOW_relative_target_in_relative_date1478);
                    relative_target122=relative_target();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_relative_target.add(relative_target122.getTree());


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
                    // 186:7: -> ^( RELATIVE_DATE ^( SEEK DIRECTION[\">\"] SEEK_BY[\"by_day\"] INT[\"0\"] relative_target ) )
                    {
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:186:10: ^( RELATIVE_DATE ^( SEEK DIRECTION[\">\"] SEEK_BY[\"by_day\"] INT[\"0\"] relative_target ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(RELATIVE_DATE, "RELATIVE_DATE"), root_1);

                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:186:26: ^( SEEK DIRECTION[\">\"] SEEK_BY[\"by_day\"] INT[\"0\"] relative_target )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(SEEK, "SEEK"), root_2);

                        adaptor.addChild(root_2, (Object)adaptor.create(DIRECTION, ">"));
                        adaptor.addChild(root_2, (Object)adaptor.create(SEEK_BY, "by_day"));
                        adaptor.addChild(root_2, (Object)adaptor.create(INT, "0"));
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
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:188:5: spelled_or_int_01_to_31_optional_prefix WHITE_SPACE relative_target WHITE_SPACE relative_suffix
                    {
                    pushFollow(FOLLOW_spelled_or_int_01_to_31_optional_prefix_in_relative_date1518);
                    spelled_or_int_01_to_31_optional_prefix123=spelled_or_int_01_to_31_optional_prefix();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_spelled_or_int_01_to_31_optional_prefix.add(spelled_or_int_01_to_31_optional_prefix123.getTree());
                    WHITE_SPACE124=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_relative_date1520); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE124);

                    pushFollow(FOLLOW_relative_target_in_relative_date1522);
                    relative_target125=relative_target();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_relative_target.add(relative_target125.getTree());
                    WHITE_SPACE126=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_relative_date1524); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE126);

                    pushFollow(FOLLOW_relative_suffix_in_relative_date1526);
                    relative_suffix127=relative_suffix();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_relative_suffix.add(relative_suffix127.getTree());


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
                    // 189:7: -> ^( RELATIVE_DATE ^( SEEK relative_suffix spelled_or_int_01_to_31_optional_prefix relative_target ) )
                    {
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:189:10: ^( RELATIVE_DATE ^( SEEK relative_suffix spelled_or_int_01_to_31_optional_prefix relative_target ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(RELATIVE_DATE, "RELATIVE_DATE"), root_1);

                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:189:26: ^( SEEK relative_suffix spelled_or_int_01_to_31_optional_prefix relative_target )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(SEEK, "SEEK"), root_2);

                        adaptor.addChild(root_2, stream_relative_suffix.nextTree());
                        adaptor.addChild(root_2, stream_spelled_or_int_01_to_31_optional_prefix.nextTree());
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
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:191:5: named_relative_date
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_named_relative_date_in_relative_date1562);
                    named_relative_date128=named_relative_date();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, named_relative_date128.getTree());

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

    public static class relative_target_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "relative_target"
    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:194:1: relative_target : ( day_of_week | relaxed_month | relative_date_span );
    public final DateParser.relative_target_return relative_target() throws RecognitionException {
        DateParser.relative_target_return retval = new DateParser.relative_target_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        DateParser.day_of_week_return day_of_week129 = null;

        DateParser.relaxed_month_return relaxed_month130 = null;

        DateParser.relative_date_span_return relative_date_span131 = null;



        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:195:3: ( day_of_week | relaxed_month | relative_date_span )
            int alt38=3;
            switch ( input.LA(1) ) {
            case SUNDAY:
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
            case FRIDAY:
            case SATURDAY:
                {
                alt38=1;
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
                alt38=2;
                }
                break;
            case DAY:
            case YEAR:
            case WEEK:
            case MONTH:
                {
                alt38=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }

            switch (alt38) {
                case 1 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:195:5: day_of_week
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_day_of_week_in_relative_target1578);
                    day_of_week129=day_of_week();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, day_of_week129.getTree());

                    }
                    break;
                case 2 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:196:5: relaxed_month
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_relaxed_month_in_relative_target1585);
                    relaxed_month130=relaxed_month();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, relaxed_month130.getTree());

                    }
                    break;
                case 3 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:197:5: relative_date_span
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_relative_date_span_in_relative_target1591);
                    relative_date_span131=relative_date_span();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, relative_date_span131.getTree());

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

    public static class implicit_prefix_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "implicit_prefix"
    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:200:1: implicit_prefix : THIS -> DIRECTION[\">\"] SEEK_BY[\"by_day\"] INT[\"0\"] ;
    public final DateParser.implicit_prefix_return implicit_prefix() throws RecognitionException {
        DateParser.implicit_prefix_return retval = new DateParser.implicit_prefix_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token THIS132=null;

        Object THIS132_tree=null;
        RewriteRuleTokenStream stream_THIS=new RewriteRuleTokenStream(adaptor,"token THIS");

        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:201:3: ( THIS -> DIRECTION[\">\"] SEEK_BY[\"by_day\"] INT[\"0\"] )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:201:5: THIS
            {
            THIS132=(Token)match(input,THIS,FOLLOW_THIS_in_implicit_prefix1606); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_THIS.add(THIS132);



            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 201:10: -> DIRECTION[\">\"] SEEK_BY[\"by_day\"] INT[\"0\"]
            {
                adaptor.addChild(root_0, (Object)adaptor.create(DIRECTION, ">"));
                adaptor.addChild(root_0, (Object)adaptor.create(SEEK_BY, "by_day"));
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
        return retval;
    }
    // $ANTLR end "implicit_prefix"

    public static class relative_prefix_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "relative_prefix"
    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:204:1: relative_prefix : ( ( THIS WHITE_SPACE )? LAST -> DIRECTION[\"<\"] SEEK_BY[\"by_week\"] INT[\"1\"] | ( THIS WHITE_SPACE )? NEXT -> DIRECTION[\">\"] SEEK_BY[\"by_week\"] INT[\"1\"] | ( THIS WHITE_SPACE )? PAST -> DIRECTION[\"<\"] SEEK_BY[\"by_day\"] INT[\"1\"] | ( THIS WHITE_SPACE )? COMING -> DIRECTION[\">\"] SEEK_BY[\"by_day\"] INT[\"1\"] | ( THIS WHITE_SPACE )? UPCOMING -> DIRECTION[\">\"] SEEK_BY[\"by_day\"] INT[\"1\"] | ( IN WHITE_SPACE )? spelled_or_int_01_to_31_optional_prefix -> DIRECTION[\">\"] SEEK_BY[\"by_day\"] spelled_or_int_01_to_31_optional_prefix );
    public final DateParser.relative_prefix_return relative_prefix() throws RecognitionException {
        DateParser.relative_prefix_return retval = new DateParser.relative_prefix_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token THIS133=null;
        Token WHITE_SPACE134=null;
        Token LAST135=null;
        Token THIS136=null;
        Token WHITE_SPACE137=null;
        Token NEXT138=null;
        Token THIS139=null;
        Token WHITE_SPACE140=null;
        Token PAST141=null;
        Token THIS142=null;
        Token WHITE_SPACE143=null;
        Token COMING144=null;
        Token THIS145=null;
        Token WHITE_SPACE146=null;
        Token UPCOMING147=null;
        Token IN148=null;
        Token WHITE_SPACE149=null;
        DateParser.spelled_or_int_01_to_31_optional_prefix_return spelled_or_int_01_to_31_optional_prefix150 = null;


        Object THIS133_tree=null;
        Object WHITE_SPACE134_tree=null;
        Object LAST135_tree=null;
        Object THIS136_tree=null;
        Object WHITE_SPACE137_tree=null;
        Object NEXT138_tree=null;
        Object THIS139_tree=null;
        Object WHITE_SPACE140_tree=null;
        Object PAST141_tree=null;
        Object THIS142_tree=null;
        Object WHITE_SPACE143_tree=null;
        Object COMING144_tree=null;
        Object THIS145_tree=null;
        Object WHITE_SPACE146_tree=null;
        Object UPCOMING147_tree=null;
        Object IN148_tree=null;
        Object WHITE_SPACE149_tree=null;
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
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:205:3: ( ( THIS WHITE_SPACE )? LAST -> DIRECTION[\"<\"] SEEK_BY[\"by_week\"] INT[\"1\"] | ( THIS WHITE_SPACE )? NEXT -> DIRECTION[\">\"] SEEK_BY[\"by_week\"] INT[\"1\"] | ( THIS WHITE_SPACE )? PAST -> DIRECTION[\"<\"] SEEK_BY[\"by_day\"] INT[\"1\"] | ( THIS WHITE_SPACE )? COMING -> DIRECTION[\">\"] SEEK_BY[\"by_day\"] INT[\"1\"] | ( THIS WHITE_SPACE )? UPCOMING -> DIRECTION[\">\"] SEEK_BY[\"by_day\"] INT[\"1\"] | ( IN WHITE_SPACE )? spelled_or_int_01_to_31_optional_prefix -> DIRECTION[\">\"] SEEK_BY[\"by_day\"] spelled_or_int_01_to_31_optional_prefix )
            int alt45=6;
            switch ( input.LA(1) ) {
            case THIS:
                {
                int LA45_1 = input.LA(2);

                if ( (LA45_1==WHITE_SPACE) ) {
                    switch ( input.LA(3) ) {
                    case COMING:
                        {
                        alt45=4;
                        }
                        break;
                    case PAST:
                        {
                        alt45=3;
                        }
                        break;
                    case LAST:
                        {
                        alt45=1;
                        }
                        break;
                    case UPCOMING:
                        {
                        alt45=5;
                        }
                        break;
                    case NEXT:
                        {
                        alt45=2;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 45, 8, input);

                        throw nvae;
                    }

                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 45, 1, input);

                    throw nvae;
                }
                }
                break;
            case LAST:
                {
                alt45=1;
                }
                break;
            case NEXT:
                {
                alt45=2;
                }
                break;
            case PAST:
                {
                alt45=3;
                }
                break;
            case COMING:
                {
                alt45=4;
                }
                break;
            case UPCOMING:
                {
                alt45=5;
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
                alt45=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }

            switch (alt45) {
                case 1 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:205:5: ( THIS WHITE_SPACE )? LAST
                    {
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:205:5: ( THIS WHITE_SPACE )?
                    int alt39=2;
                    int LA39_0 = input.LA(1);

                    if ( (LA39_0==THIS) ) {
                        alt39=1;
                    }
                    switch (alt39) {
                        case 1 :
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:205:6: THIS WHITE_SPACE
                            {
                            THIS133=(Token)match(input,THIS,FOLLOW_THIS_in_relative_prefix1633); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_THIS.add(THIS133);

                            WHITE_SPACE134=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_relative_prefix1635); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE134);


                            }
                            break;

                    }

                    LAST135=(Token)match(input,LAST,FOLLOW_LAST_in_relative_prefix1639); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LAST.add(LAST135);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 205:34: -> DIRECTION[\"<\"] SEEK_BY[\"by_week\"] INT[\"1\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DIRECTION, "<"));
                        adaptor.addChild(root_0, (Object)adaptor.create(SEEK_BY, "by_week"));
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "1"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:206:5: ( THIS WHITE_SPACE )? NEXT
                    {
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:206:5: ( THIS WHITE_SPACE )?
                    int alt40=2;
                    int LA40_0 = input.LA(1);

                    if ( (LA40_0==THIS) ) {
                        alt40=1;
                    }
                    switch (alt40) {
                        case 1 :
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:206:6: THIS WHITE_SPACE
                            {
                            THIS136=(Token)match(input,THIS,FOLLOW_THIS_in_relative_prefix1661); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_THIS.add(THIS136);

                            WHITE_SPACE137=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_relative_prefix1663); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE137);


                            }
                            break;

                    }

                    NEXT138=(Token)match(input,NEXT,FOLLOW_NEXT_in_relative_prefix1667); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NEXT.add(NEXT138);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 206:34: -> DIRECTION[\">\"] SEEK_BY[\"by_week\"] INT[\"1\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DIRECTION, ">"));
                        adaptor.addChild(root_0, (Object)adaptor.create(SEEK_BY, "by_week"));
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "1"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:207:5: ( THIS WHITE_SPACE )? PAST
                    {
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:207:5: ( THIS WHITE_SPACE )?
                    int alt41=2;
                    int LA41_0 = input.LA(1);

                    if ( (LA41_0==THIS) ) {
                        alt41=1;
                    }
                    switch (alt41) {
                        case 1 :
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:207:6: THIS WHITE_SPACE
                            {
                            THIS139=(Token)match(input,THIS,FOLLOW_THIS_in_relative_prefix1689); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_THIS.add(THIS139);

                            WHITE_SPACE140=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_relative_prefix1691); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE140);


                            }
                            break;

                    }

                    PAST141=(Token)match(input,PAST,FOLLOW_PAST_in_relative_prefix1695); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PAST.add(PAST141);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 207:34: -> DIRECTION[\"<\"] SEEK_BY[\"by_day\"] INT[\"1\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DIRECTION, "<"));
                        adaptor.addChild(root_0, (Object)adaptor.create(SEEK_BY, "by_day"));
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "1"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:208:5: ( THIS WHITE_SPACE )? COMING
                    {
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:208:5: ( THIS WHITE_SPACE )?
                    int alt42=2;
                    int LA42_0 = input.LA(1);

                    if ( (LA42_0==THIS) ) {
                        alt42=1;
                    }
                    switch (alt42) {
                        case 1 :
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:208:6: THIS WHITE_SPACE
                            {
                            THIS142=(Token)match(input,THIS,FOLLOW_THIS_in_relative_prefix1717); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_THIS.add(THIS142);

                            WHITE_SPACE143=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_relative_prefix1719); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE143);


                            }
                            break;

                    }

                    COMING144=(Token)match(input,COMING,FOLLOW_COMING_in_relative_prefix1723); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COMING.add(COMING144);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 208:34: -> DIRECTION[\">\"] SEEK_BY[\"by_day\"] INT[\"1\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DIRECTION, ">"));
                        adaptor.addChild(root_0, (Object)adaptor.create(SEEK_BY, "by_day"));
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "1"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:209:5: ( THIS WHITE_SPACE )? UPCOMING
                    {
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:209:5: ( THIS WHITE_SPACE )?
                    int alt43=2;
                    int LA43_0 = input.LA(1);

                    if ( (LA43_0==THIS) ) {
                        alt43=1;
                    }
                    switch (alt43) {
                        case 1 :
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:209:6: THIS WHITE_SPACE
                            {
                            THIS145=(Token)match(input,THIS,FOLLOW_THIS_in_relative_prefix1743); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_THIS.add(THIS145);

                            WHITE_SPACE146=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_relative_prefix1745); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE146);


                            }
                            break;

                    }

                    UPCOMING147=(Token)match(input,UPCOMING,FOLLOW_UPCOMING_in_relative_prefix1749); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_UPCOMING.add(UPCOMING147);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 209:34: -> DIRECTION[\">\"] SEEK_BY[\"by_day\"] INT[\"1\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DIRECTION, ">"));
                        adaptor.addChild(root_0, (Object)adaptor.create(SEEK_BY, "by_day"));
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "1"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 6 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:210:5: ( IN WHITE_SPACE )? spelled_or_int_01_to_31_optional_prefix
                    {
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:210:5: ( IN WHITE_SPACE )?
                    int alt44=2;
                    int LA44_0 = input.LA(1);

                    if ( (LA44_0==IN) ) {
                        alt44=1;
                    }
                    switch (alt44) {
                        case 1 :
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:210:6: IN WHITE_SPACE
                            {
                            IN148=(Token)match(input,IN,FOLLOW_IN_in_relative_prefix1767); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_IN.add(IN148);

                            WHITE_SPACE149=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_relative_prefix1769); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE149);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_spelled_or_int_01_to_31_optional_prefix_in_relative_prefix1773);
                    spelled_or_int_01_to_31_optional_prefix150=spelled_or_int_01_to_31_optional_prefix();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_spelled_or_int_01_to_31_optional_prefix.add(spelled_or_int_01_to_31_optional_prefix150.getTree());


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
                    // 211:7: -> DIRECTION[\">\"] SEEK_BY[\"by_day\"] spelled_or_int_01_to_31_optional_prefix
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DIRECTION, ">"));
                        adaptor.addChild(root_0, (Object)adaptor.create(SEEK_BY, "by_day"));
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
    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:214:1: relative_suffix : ( FROM WHITE_SPACE NOW -> DIRECTION[\">\"] SEEK_BY[\"by_day\"] | AGO -> DIRECTION[\"<\"] SEEK_BY[\"by_day\"] );
    public final DateParser.relative_suffix_return relative_suffix() throws RecognitionException {
        DateParser.relative_suffix_return retval = new DateParser.relative_suffix_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token FROM151=null;
        Token WHITE_SPACE152=null;
        Token NOW153=null;
        Token AGO154=null;

        Object FROM151_tree=null;
        Object WHITE_SPACE152_tree=null;
        Object NOW153_tree=null;
        Object AGO154_tree=null;
        RewriteRuleTokenStream stream_AGO=new RewriteRuleTokenStream(adaptor,"token AGO");
        RewriteRuleTokenStream stream_NOW=new RewriteRuleTokenStream(adaptor,"token NOW");
        RewriteRuleTokenStream stream_FROM=new RewriteRuleTokenStream(adaptor,"token FROM");
        RewriteRuleTokenStream stream_WHITE_SPACE=new RewriteRuleTokenStream(adaptor,"token WHITE_SPACE");

        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:215:3: ( FROM WHITE_SPACE NOW -> DIRECTION[\">\"] SEEK_BY[\"by_day\"] | AGO -> DIRECTION[\"<\"] SEEK_BY[\"by_day\"] )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==FROM) ) {
                alt46=1;
            }
            else if ( (LA46_0==AGO) ) {
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
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:215:5: FROM WHITE_SPACE NOW
                    {
                    FROM151=(Token)match(input,FROM,FOLLOW_FROM_in_relative_suffix1805); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FROM.add(FROM151);

                    WHITE_SPACE152=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_relative_suffix1807); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE152);

                    NOW153=(Token)match(input,NOW,FOLLOW_NOW_in_relative_suffix1809); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NOW.add(NOW153);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 215:26: -> DIRECTION[\">\"] SEEK_BY[\"by_day\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DIRECTION, ">"));
                        adaptor.addChild(root_0, (Object)adaptor.create(SEEK_BY, "by_day"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:216:5: AGO
                    {
                    AGO154=(Token)match(input,AGO,FOLLOW_AGO_in_relative_suffix1823); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AGO.add(AGO154);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 216:26: -> DIRECTION[\"<\"] SEEK_BY[\"by_day\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DIRECTION, "<"));
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
        return retval;
    }
    // $ANTLR end "relative_suffix"

    public static class relative_date_span_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "relative_date_span"
    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:219:1: relative_date_span : ( DAY -> SPAN[\"day\"] | WEEK -> SPAN[\"week\"] | MONTH -> SPAN[\"month\"] | YEAR -> SPAN[\"year\"] );
    public final DateParser.relative_date_span_return relative_date_span() throws RecognitionException {
        DateParser.relative_date_span_return retval = new DateParser.relative_date_span_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DAY155=null;
        Token WEEK156=null;
        Token MONTH157=null;
        Token YEAR158=null;

        Object DAY155_tree=null;
        Object WEEK156_tree=null;
        Object MONTH157_tree=null;
        Object YEAR158_tree=null;
        RewriteRuleTokenStream stream_WEEK=new RewriteRuleTokenStream(adaptor,"token WEEK");
        RewriteRuleTokenStream stream_DAY=new RewriteRuleTokenStream(adaptor,"token DAY");
        RewriteRuleTokenStream stream_YEAR=new RewriteRuleTokenStream(adaptor,"token YEAR");
        RewriteRuleTokenStream stream_MONTH=new RewriteRuleTokenStream(adaptor,"token MONTH");

        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:220:3: ( DAY -> SPAN[\"day\"] | WEEK -> SPAN[\"week\"] | MONTH -> SPAN[\"month\"] | YEAR -> SPAN[\"year\"] )
            int alt47=4;
            switch ( input.LA(1) ) {
            case DAY:
                {
                alt47=1;
                }
                break;
            case WEEK:
                {
                alt47=2;
                }
                break;
            case MONTH:
                {
                alt47=3;
                }
                break;
            case YEAR:
                {
                alt47=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }

            switch (alt47) {
                case 1 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:220:5: DAY
                    {
                    DAY155=(Token)match(input,DAY,FOLLOW_DAY_in_relative_date_span1863); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DAY.add(DAY155);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 220:11: -> SPAN[\"day\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(SPAN, "day"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:221:5: WEEK
                    {
                    WEEK156=(Token)match(input,WEEK,FOLLOW_WEEK_in_relative_date_span1876); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WEEK.add(WEEK156);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 221:11: -> SPAN[\"week\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(SPAN, "week"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:222:5: MONTH
                    {
                    MONTH157=(Token)match(input,MONTH,FOLLOW_MONTH_in_relative_date_span1888); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_MONTH.add(MONTH157);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 222:11: -> SPAN[\"month\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(SPAN, "month"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:223:5: YEAR
                    {
                    YEAR158=(Token)match(input,YEAR,FOLLOW_YEAR_in_relative_date_span1899); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_YEAR.add(YEAR158);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 223:11: -> SPAN[\"year\"]
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

    public static class day_of_week_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "day_of_week"
    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:226:1: day_of_week : ( SUNDAY -> ^( DAY_OF_WEEK INT[\"1\"] ) | MONDAY -> ^( DAY_OF_WEEK INT[\"2\"] ) | TUESDAY -> ^( DAY_OF_WEEK INT[\"3\"] ) | WEDNESDAY -> ^( DAY_OF_WEEK INT[\"4\"] ) | THURSDAY -> ^( DAY_OF_WEEK INT[\"5\"] ) | FRIDAY -> ^( DAY_OF_WEEK INT[\"6\"] ) | SATURDAY -> ^( DAY_OF_WEEK INT[\"7\"] ) );
    public final DateParser.day_of_week_return day_of_week() throws RecognitionException {
        DateParser.day_of_week_return retval = new DateParser.day_of_week_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SUNDAY159=null;
        Token MONDAY160=null;
        Token TUESDAY161=null;
        Token WEDNESDAY162=null;
        Token THURSDAY163=null;
        Token FRIDAY164=null;
        Token SATURDAY165=null;

        Object SUNDAY159_tree=null;
        Object MONDAY160_tree=null;
        Object TUESDAY161_tree=null;
        Object WEDNESDAY162_tree=null;
        Object THURSDAY163_tree=null;
        Object FRIDAY164_tree=null;
        Object SATURDAY165_tree=null;
        RewriteRuleTokenStream stream_MONDAY=new RewriteRuleTokenStream(adaptor,"token MONDAY");
        RewriteRuleTokenStream stream_SUNDAY=new RewriteRuleTokenStream(adaptor,"token SUNDAY");
        RewriteRuleTokenStream stream_WEDNESDAY=new RewriteRuleTokenStream(adaptor,"token WEDNESDAY");
        RewriteRuleTokenStream stream_THURSDAY=new RewriteRuleTokenStream(adaptor,"token THURSDAY");
        RewriteRuleTokenStream stream_SATURDAY=new RewriteRuleTokenStream(adaptor,"token SATURDAY");
        RewriteRuleTokenStream stream_TUESDAY=new RewriteRuleTokenStream(adaptor,"token TUESDAY");
        RewriteRuleTokenStream stream_FRIDAY=new RewriteRuleTokenStream(adaptor,"token FRIDAY");

        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:227:3: ( SUNDAY -> ^( DAY_OF_WEEK INT[\"1\"] ) | MONDAY -> ^( DAY_OF_WEEK INT[\"2\"] ) | TUESDAY -> ^( DAY_OF_WEEK INT[\"3\"] ) | WEDNESDAY -> ^( DAY_OF_WEEK INT[\"4\"] ) | THURSDAY -> ^( DAY_OF_WEEK INT[\"5\"] ) | FRIDAY -> ^( DAY_OF_WEEK INT[\"6\"] ) | SATURDAY -> ^( DAY_OF_WEEK INT[\"7\"] ) )
            int alt48=7;
            switch ( input.LA(1) ) {
            case SUNDAY:
                {
                alt48=1;
                }
                break;
            case MONDAY:
                {
                alt48=2;
                }
                break;
            case TUESDAY:
                {
                alt48=3;
                }
                break;
            case WEDNESDAY:
                {
                alt48=4;
                }
                break;
            case THURSDAY:
                {
                alt48=5;
                }
                break;
            case FRIDAY:
                {
                alt48=6;
                }
                break;
            case SATURDAY:
                {
                alt48=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }

            switch (alt48) {
                case 1 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:227:5: SUNDAY
                    {
                    SUNDAY159=(Token)match(input,SUNDAY,FOLLOW_SUNDAY_in_day_of_week1919); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SUNDAY.add(SUNDAY159);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 227:15: -> ^( DAY_OF_WEEK INT[\"1\"] )
                    {
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:227:18: ^( DAY_OF_WEEK INT[\"1\"] )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DAY_OF_WEEK, "DAY_OF_WEEK"), root_1);

                        adaptor.addChild(root_1, (Object)adaptor.create(INT, "1"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:228:5: MONDAY
                    {
                    MONDAY160=(Token)match(input,MONDAY,FOLLOW_MONDAY_in_day_of_week1937); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_MONDAY.add(MONDAY160);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 228:15: -> ^( DAY_OF_WEEK INT[\"2\"] )
                    {
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:228:18: ^( DAY_OF_WEEK INT[\"2\"] )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DAY_OF_WEEK, "DAY_OF_WEEK"), root_1);

                        adaptor.addChild(root_1, (Object)adaptor.create(INT, "2"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:229:5: TUESDAY
                    {
                    TUESDAY161=(Token)match(input,TUESDAY,FOLLOW_TUESDAY_in_day_of_week1955); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TUESDAY.add(TUESDAY161);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 229:15: -> ^( DAY_OF_WEEK INT[\"3\"] )
                    {
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:229:18: ^( DAY_OF_WEEK INT[\"3\"] )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DAY_OF_WEEK, "DAY_OF_WEEK"), root_1);

                        adaptor.addChild(root_1, (Object)adaptor.create(INT, "3"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:230:5: WEDNESDAY
                    {
                    WEDNESDAY162=(Token)match(input,WEDNESDAY,FOLLOW_WEDNESDAY_in_day_of_week1972); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WEDNESDAY.add(WEDNESDAY162);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 230:15: -> ^( DAY_OF_WEEK INT[\"4\"] )
                    {
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:230:18: ^( DAY_OF_WEEK INT[\"4\"] )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DAY_OF_WEEK, "DAY_OF_WEEK"), root_1);

                        adaptor.addChild(root_1, (Object)adaptor.create(INT, "4"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:231:5: THURSDAY
                    {
                    THURSDAY163=(Token)match(input,THURSDAY,FOLLOW_THURSDAY_in_day_of_week1987); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THURSDAY.add(THURSDAY163);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 231:15: -> ^( DAY_OF_WEEK INT[\"5\"] )
                    {
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:231:18: ^( DAY_OF_WEEK INT[\"5\"] )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DAY_OF_WEEK, "DAY_OF_WEEK"), root_1);

                        adaptor.addChild(root_1, (Object)adaptor.create(INT, "5"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 6 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:232:5: FRIDAY
                    {
                    FRIDAY164=(Token)match(input,FRIDAY,FOLLOW_FRIDAY_in_day_of_week2003); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FRIDAY.add(FRIDAY164);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 232:15: -> ^( DAY_OF_WEEK INT[\"6\"] )
                    {
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:232:18: ^( DAY_OF_WEEK INT[\"6\"] )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DAY_OF_WEEK, "DAY_OF_WEEK"), root_1);

                        adaptor.addChild(root_1, (Object)adaptor.create(INT, "6"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 7 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:233:5: SATURDAY
                    {
                    SATURDAY165=(Token)match(input,SATURDAY,FOLLOW_SATURDAY_in_day_of_week2021); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SATURDAY.add(SATURDAY165);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 233:15: -> ^( DAY_OF_WEEK INT[\"7\"] )
                    {
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:233:18: ^( DAY_OF_WEEK INT[\"7\"] )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DAY_OF_WEEK, "DAY_OF_WEEK"), root_1);

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
        return retval;
    }
    // $ANTLR end "day_of_week"

    public static class named_relative_date_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "named_relative_date"
    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:236:1: named_relative_date : ( TODAY -> ^( RELATIVE_DATE ^( SEEK DIRECTION[\">\"] SEEK_BY[\"by_day\"] INT[\"0\"] SPAN[\"day\"] ) ) | TOMORROW -> ^( RELATIVE_DATE ^( SEEK DIRECTION[\">\"] SEEK_BY[\"by_day\"] INT[\"1\"] SPAN[\"day\"] ) ) | YESTERDAY -> ^( RELATIVE_DATE ^( SEEK DIRECTION[\"<\"] SEEK_BY[\"by_day\"] INT[\"1\"] SPAN[\"day\"] ) ) );
    public final DateParser.named_relative_date_return named_relative_date() throws RecognitionException {
        DateParser.named_relative_date_return retval = new DateParser.named_relative_date_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TODAY166=null;
        Token TOMORROW167=null;
        Token YESTERDAY168=null;

        Object TODAY166_tree=null;
        Object TOMORROW167_tree=null;
        Object YESTERDAY168_tree=null;
        RewriteRuleTokenStream stream_TODAY=new RewriteRuleTokenStream(adaptor,"token TODAY");
        RewriteRuleTokenStream stream_YESTERDAY=new RewriteRuleTokenStream(adaptor,"token YESTERDAY");
        RewriteRuleTokenStream stream_TOMORROW=new RewriteRuleTokenStream(adaptor,"token TOMORROW");

        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:237:3: ( TODAY -> ^( RELATIVE_DATE ^( SEEK DIRECTION[\">\"] SEEK_BY[\"by_day\"] INT[\"0\"] SPAN[\"day\"] ) ) | TOMORROW -> ^( RELATIVE_DATE ^( SEEK DIRECTION[\">\"] SEEK_BY[\"by_day\"] INT[\"1\"] SPAN[\"day\"] ) ) | YESTERDAY -> ^( RELATIVE_DATE ^( SEEK DIRECTION[\"<\"] SEEK_BY[\"by_day\"] INT[\"1\"] SPAN[\"day\"] ) ) )
            int alt49=3;
            switch ( input.LA(1) ) {
            case TODAY:
                {
                alt49=1;
                }
                break;
            case TOMORROW:
                {
                alt49=2;
                }
                break;
            case YESTERDAY:
                {
                alt49=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }

            switch (alt49) {
                case 1 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:237:5: TODAY
                    {
                    TODAY166=(Token)match(input,TODAY,FOLLOW_TODAY_in_named_relative_date2046); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TODAY.add(TODAY166);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 237:15: -> ^( RELATIVE_DATE ^( SEEK DIRECTION[\">\"] SEEK_BY[\"by_day\"] INT[\"0\"] SPAN[\"day\"] ) )
                    {
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:237:18: ^( RELATIVE_DATE ^( SEEK DIRECTION[\">\"] SEEK_BY[\"by_day\"] INT[\"0\"] SPAN[\"day\"] ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(RELATIVE_DATE, "RELATIVE_DATE"), root_1);

                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:237:34: ^( SEEK DIRECTION[\">\"] SEEK_BY[\"by_day\"] INT[\"0\"] SPAN[\"day\"] )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(SEEK, "SEEK"), root_2);

                        adaptor.addChild(root_2, (Object)adaptor.create(DIRECTION, ">"));
                        adaptor.addChild(root_2, (Object)adaptor.create(SEEK_BY, "by_day"));
                        adaptor.addChild(root_2, (Object)adaptor.create(INT, "0"));
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
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:238:5: TOMORROW
                    {
                    TOMORROW167=(Token)match(input,TOMORROW,FOLLOW_TOMORROW_in_named_relative_date2078); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TOMORROW.add(TOMORROW167);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 238:15: -> ^( RELATIVE_DATE ^( SEEK DIRECTION[\">\"] SEEK_BY[\"by_day\"] INT[\"1\"] SPAN[\"day\"] ) )
                    {
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:238:18: ^( RELATIVE_DATE ^( SEEK DIRECTION[\">\"] SEEK_BY[\"by_day\"] INT[\"1\"] SPAN[\"day\"] ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(RELATIVE_DATE, "RELATIVE_DATE"), root_1);

                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:238:34: ^( SEEK DIRECTION[\">\"] SEEK_BY[\"by_day\"] INT[\"1\"] SPAN[\"day\"] )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(SEEK, "SEEK"), root_2);

                        adaptor.addChild(root_2, (Object)adaptor.create(DIRECTION, ">"));
                        adaptor.addChild(root_2, (Object)adaptor.create(SEEK_BY, "by_day"));
                        adaptor.addChild(root_2, (Object)adaptor.create(INT, "1"));
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
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:239:5: YESTERDAY
                    {
                    YESTERDAY168=(Token)match(input,YESTERDAY,FOLLOW_YESTERDAY_in_named_relative_date2107); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_YESTERDAY.add(YESTERDAY168);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 239:15: -> ^( RELATIVE_DATE ^( SEEK DIRECTION[\"<\"] SEEK_BY[\"by_day\"] INT[\"1\"] SPAN[\"day\"] ) )
                    {
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:239:18: ^( RELATIVE_DATE ^( SEEK DIRECTION[\"<\"] SEEK_BY[\"by_day\"] INT[\"1\"] SPAN[\"day\"] ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(RELATIVE_DATE, "RELATIVE_DATE"), root_1);

                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:239:34: ^( SEEK DIRECTION[\"<\"] SEEK_BY[\"by_day\"] INT[\"1\"] SPAN[\"day\"] )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(SEEK, "SEEK"), root_2);

                        adaptor.addChild(root_2, (Object)adaptor.create(DIRECTION, "<"));
                        adaptor.addChild(root_2, (Object)adaptor.create(SEEK_BY, "by_day"));
                        adaptor.addChild(root_2, (Object)adaptor.create(INT, "1"));
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
        return retval;
    }
    // $ANTLR end "named_relative_date"

    public static class time_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "time"
    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:245:1: time : ( hours ( COLON )? minutes ( ( WHITE_SPACE )? ( meridian_indicator | ( MILITARY_HOUR_SUFFIX | HOUR ) ) )? -> ^( EXPLICIT_TIME hours minutes ( meridian_indicator )? ) | hours ( ( WHITE_SPACE )? meridian_indicator )? -> ^( EXPLICIT_TIME hours ^( MINUTES_OF_HOUR INT[\"0\"] ) ( meridian_indicator )? ) | named_time );
    public final DateParser.time_return time() throws RecognitionException {
        DateParser.time_return retval = new DateParser.time_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token COLON170=null;
        Token WHITE_SPACE172=null;
        Token MILITARY_HOUR_SUFFIX174=null;
        Token HOUR175=null;
        Token WHITE_SPACE177=null;
        DateParser.hours_return hours169 = null;

        DateParser.minutes_return minutes171 = null;

        DateParser.meridian_indicator_return meridian_indicator173 = null;

        DateParser.hours_return hours176 = null;

        DateParser.meridian_indicator_return meridian_indicator178 = null;

        DateParser.named_time_return named_time179 = null;


        Object COLON170_tree=null;
        Object WHITE_SPACE172_tree=null;
        Object MILITARY_HOUR_SUFFIX174_tree=null;
        Object HOUR175_tree=null;
        Object WHITE_SPACE177_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_HOUR=new RewriteRuleTokenStream(adaptor,"token HOUR");
        RewriteRuleTokenStream stream_MILITARY_HOUR_SUFFIX=new RewriteRuleTokenStream(adaptor,"token MILITARY_HOUR_SUFFIX");
        RewriteRuleTokenStream stream_WHITE_SPACE=new RewriteRuleTokenStream(adaptor,"token WHITE_SPACE");
        RewriteRuleSubtreeStream stream_meridian_indicator=new RewriteRuleSubtreeStream(adaptor,"rule meridian_indicator");
        RewriteRuleSubtreeStream stream_minutes=new RewriteRuleSubtreeStream(adaptor,"rule minutes");
        RewriteRuleSubtreeStream stream_hours=new RewriteRuleSubtreeStream(adaptor,"rule hours");
        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:246:3: ( hours ( COLON )? minutes ( ( WHITE_SPACE )? ( meridian_indicator | ( MILITARY_HOUR_SUFFIX | HOUR ) ) )? -> ^( EXPLICIT_TIME hours minutes ( meridian_indicator )? ) | hours ( ( WHITE_SPACE )? meridian_indicator )? -> ^( EXPLICIT_TIME hours ^( MINUTES_OF_HOUR INT[\"0\"] ) ( meridian_indicator )? ) | named_time )
            int alt57=3;
            switch ( input.LA(1) ) {
            case INT_0:
                {
                int LA57_1 = input.LA(2);

                if ( (LA57_1==EOF||(LA57_1>=STRING && LA57_1<=WHITE_SPACE)||LA57_1==COMMA||(LA57_1>=AM && LA57_1<=PM)) ) {
                    alt57=2;
                }
                else if ( (LA57_1==COLON||LA57_1==INT_00||(LA57_1>=INT_01_TO_12 && LA57_1<=INT_32_TO_59)) ) {
                    alt57=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 57, 1, input);

                    throw nvae;
                }
                }
                break;
            case INT_00:
                {
                int LA57_2 = input.LA(2);

                if ( (LA57_2==EOF||(LA57_2>=STRING && LA57_2<=WHITE_SPACE)||LA57_2==COMMA||(LA57_2>=AM && LA57_2<=PM)) ) {
                    alt57=2;
                }
                else if ( (LA57_2==COLON||LA57_2==INT_00||(LA57_2>=INT_01_TO_12 && LA57_2<=INT_32_TO_59)) ) {
                    alt57=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 57, 2, input);

                    throw nvae;
                }
                }
                break;
            case INT_1_TO_9:
                {
                int LA57_3 = input.LA(2);

                if ( (LA57_3==EOF||(LA57_3>=STRING && LA57_3<=WHITE_SPACE)||LA57_3==COMMA||(LA57_3>=AM && LA57_3<=PM)) ) {
                    alt57=2;
                }
                else if ( (LA57_3==COLON||LA57_3==INT_00||(LA57_3>=INT_01_TO_12 && LA57_3<=INT_32_TO_59)) ) {
                    alt57=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 57, 3, input);

                    throw nvae;
                }
                }
                break;
            case INT_01_TO_12:
                {
                int LA57_4 = input.LA(2);

                if ( (LA57_4==COLON||LA57_4==INT_00||(LA57_4>=INT_01_TO_12 && LA57_4<=INT_32_TO_59)) ) {
                    alt57=1;
                }
                else if ( (LA57_4==EOF||(LA57_4>=STRING && LA57_4<=WHITE_SPACE)||LA57_4==COMMA||(LA57_4>=AM && LA57_4<=PM)) ) {
                    alt57=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 57, 4, input);

                    throw nvae;
                }
                }
                break;
            case INT_13_TO_23:
                {
                int LA57_5 = input.LA(2);

                if ( (LA57_5==EOF||(LA57_5>=STRING && LA57_5<=WHITE_SPACE)||LA57_5==COMMA||(LA57_5>=AM && LA57_5<=PM)) ) {
                    alt57=2;
                }
                else if ( (LA57_5==COLON||LA57_5==INT_00||(LA57_5>=INT_01_TO_12 && LA57_5<=INT_32_TO_59)) ) {
                    alt57=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 57, 5, input);

                    throw nvae;
                }
                }
                break;
            case NOON:
            case MIDNIGHT:
                {
                alt57=3;
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
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:246:5: hours ( COLON )? minutes ( ( WHITE_SPACE )? ( meridian_indicator | ( MILITARY_HOUR_SUFFIX | HOUR ) ) )?
                    {
                    pushFollow(FOLLOW_hours_in_time2147);
                    hours169=hours();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_hours.add(hours169.getTree());
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:246:11: ( COLON )?
                    int alt50=2;
                    int LA50_0 = input.LA(1);

                    if ( (LA50_0==COLON) ) {
                        alt50=1;
                    }
                    switch (alt50) {
                        case 1 :
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:246:11: COLON
                            {
                            COLON170=(Token)match(input,COLON,FOLLOW_COLON_in_time2149); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_COLON.add(COLON170);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_minutes_in_time2152);
                    minutes171=minutes();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_minutes.add(minutes171.getTree());
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:246:26: ( ( WHITE_SPACE )? ( meridian_indicator | ( MILITARY_HOUR_SUFFIX | HOUR ) ) )?
                    int alt54=2;
                    int LA54_0 = input.LA(1);

                    if ( (LA54_0==WHITE_SPACE) ) {
                        int LA54_1 = input.LA(2);

                        if ( ((LA54_1>=MILITARY_HOUR_SUFFIX && LA54_1<=PM)) ) {
                            alt54=1;
                        }
                    }
                    else if ( ((LA54_0>=MILITARY_HOUR_SUFFIX && LA54_0<=PM)) ) {
                        alt54=1;
                    }
                    switch (alt54) {
                        case 1 :
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:246:27: ( WHITE_SPACE )? ( meridian_indicator | ( MILITARY_HOUR_SUFFIX | HOUR ) )
                            {
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:246:27: ( WHITE_SPACE )?
                            int alt51=2;
                            int LA51_0 = input.LA(1);

                            if ( (LA51_0==WHITE_SPACE) ) {
                                alt51=1;
                            }
                            switch (alt51) {
                                case 1 :
                                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:246:27: WHITE_SPACE
                                    {
                                    WHITE_SPACE172=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_time2155); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE172);


                                    }
                                    break;

                            }

                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:246:40: ( meridian_indicator | ( MILITARY_HOUR_SUFFIX | HOUR ) )
                            int alt53=2;
                            int LA53_0 = input.LA(1);

                            if ( ((LA53_0>=AM && LA53_0<=PM)) ) {
                                alt53=1;
                            }
                            else if ( ((LA53_0>=MILITARY_HOUR_SUFFIX && LA53_0<=HOUR)) ) {
                                alt53=2;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 53, 0, input);

                                throw nvae;
                            }
                            switch (alt53) {
                                case 1 :
                                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:246:41: meridian_indicator
                                    {
                                    pushFollow(FOLLOW_meridian_indicator_in_time2159);
                                    meridian_indicator173=meridian_indicator();

                                    state._fsp--;
                                    if (state.failed) return retval;
                                    if ( state.backtracking==0 ) stream_meridian_indicator.add(meridian_indicator173.getTree());

                                    }
                                    break;
                                case 2 :
                                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:246:62: ( MILITARY_HOUR_SUFFIX | HOUR )
                                    {
                                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:246:62: ( MILITARY_HOUR_SUFFIX | HOUR )
                                    int alt52=2;
                                    int LA52_0 = input.LA(1);

                                    if ( (LA52_0==MILITARY_HOUR_SUFFIX) ) {
                                        alt52=1;
                                    }
                                    else if ( (LA52_0==HOUR) ) {
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
                                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:246:63: MILITARY_HOUR_SUFFIX
                                            {
                                            MILITARY_HOUR_SUFFIX174=(Token)match(input,MILITARY_HOUR_SUFFIX,FOLLOW_MILITARY_HOUR_SUFFIX_in_time2164); if (state.failed) return retval; 
                                            if ( state.backtracking==0 ) stream_MILITARY_HOUR_SUFFIX.add(MILITARY_HOUR_SUFFIX174);


                                            }
                                            break;
                                        case 2 :
                                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:246:86: HOUR
                                            {
                                            HOUR175=(Token)match(input,HOUR,FOLLOW_HOUR_in_time2168); if (state.failed) return retval; 
                                            if ( state.backtracking==0 ) stream_HOUR.add(HOUR175);


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
                    // elements: meridian_indicator, hours, minutes
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 247:7: -> ^( EXPLICIT_TIME hours minutes ( meridian_indicator )? )
                    {
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:247:10: ^( EXPLICIT_TIME hours minutes ( meridian_indicator )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPLICIT_TIME, "EXPLICIT_TIME"), root_1);

                        adaptor.addChild(root_1, stream_hours.nextTree());
                        adaptor.addChild(root_1, stream_minutes.nextTree());
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:247:40: ( meridian_indicator )?
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
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:249:5: hours ( ( WHITE_SPACE )? meridian_indicator )?
                    {
                    pushFollow(FOLLOW_hours_in_time2204);
                    hours176=hours();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_hours.add(hours176.getTree());
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:249:11: ( ( WHITE_SPACE )? meridian_indicator )?
                    int alt56=2;
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
                    switch (alt56) {
                        case 1 :
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:249:12: ( WHITE_SPACE )? meridian_indicator
                            {
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:249:12: ( WHITE_SPACE )?
                            int alt55=2;
                            int LA55_0 = input.LA(1);

                            if ( (LA55_0==WHITE_SPACE) ) {
                                alt55=1;
                            }
                            switch (alt55) {
                                case 1 :
                                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:249:12: WHITE_SPACE
                                    {
                                    WHITE_SPACE177=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_time2207); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE177);


                                    }
                                    break;

                            }

                            pushFollow(FOLLOW_meridian_indicator_in_time2210);
                            meridian_indicator178=meridian_indicator();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_meridian_indicator.add(meridian_indicator178.getTree());

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
                    // 250:7: -> ^( EXPLICIT_TIME hours ^( MINUTES_OF_HOUR INT[\"0\"] ) ( meridian_indicator )? )
                    {
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:250:10: ^( EXPLICIT_TIME hours ^( MINUTES_OF_HOUR INT[\"0\"] ) ( meridian_indicator )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPLICIT_TIME, "EXPLICIT_TIME"), root_1);

                        adaptor.addChild(root_1, stream_hours.nextTree());
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:250:32: ^( MINUTES_OF_HOUR INT[\"0\"] )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(MINUTES_OF_HOUR, "MINUTES_OF_HOUR"), root_2);

                        adaptor.addChild(root_2, (Object)adaptor.create(INT, "0"));

                        adaptor.addChild(root_1, root_2);
                        }
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:250:60: ( meridian_indicator )?
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
                case 3 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:252:5: named_time
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_named_time_in_time2249);
                    named_time179=named_time();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, named_time179.getTree());

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
    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:256:1: hours : int_00_to_23_optional_prefix -> ^( HOURS_OF_DAY int_00_to_23_optional_prefix ) ;
    public final DateParser.hours_return hours() throws RecognitionException {
        DateParser.hours_return retval = new DateParser.hours_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        DateParser.int_00_to_23_optional_prefix_return int_00_to_23_optional_prefix180 = null;


        RewriteRuleSubtreeStream stream_int_00_to_23_optional_prefix=new RewriteRuleSubtreeStream(adaptor,"rule int_00_to_23_optional_prefix");
        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:257:3: ( int_00_to_23_optional_prefix -> ^( HOURS_OF_DAY int_00_to_23_optional_prefix ) )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:257:5: int_00_to_23_optional_prefix
            {
            pushFollow(FOLLOW_int_00_to_23_optional_prefix_in_hours2264);
            int_00_to_23_optional_prefix180=int_00_to_23_optional_prefix();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_int_00_to_23_optional_prefix.add(int_00_to_23_optional_prefix180.getTree());


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
            // 257:34: -> ^( HOURS_OF_DAY int_00_to_23_optional_prefix )
            {
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:257:37: ^( HOURS_OF_DAY int_00_to_23_optional_prefix )
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
    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:261:1: minutes : int_00_to_59_mandatory_prefix -> ^( MINUTES_OF_HOUR int_00_to_59_mandatory_prefix ) ;
    public final DateParser.minutes_return minutes() throws RecognitionException {
        DateParser.minutes_return retval = new DateParser.minutes_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        DateParser.int_00_to_59_mandatory_prefix_return int_00_to_59_mandatory_prefix181 = null;


        RewriteRuleSubtreeStream stream_int_00_to_59_mandatory_prefix=new RewriteRuleSubtreeStream(adaptor,"rule int_00_to_59_mandatory_prefix");
        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:262:3: ( int_00_to_59_mandatory_prefix -> ^( MINUTES_OF_HOUR int_00_to_59_mandatory_prefix ) )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:262:5: int_00_to_59_mandatory_prefix
            {
            pushFollow(FOLLOW_int_00_to_59_mandatory_prefix_in_minutes2288);
            int_00_to_59_mandatory_prefix181=int_00_to_59_mandatory_prefix();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_int_00_to_59_mandatory_prefix.add(int_00_to_59_mandatory_prefix181.getTree());


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
            // 262:35: -> ^( MINUTES_OF_HOUR int_00_to_59_mandatory_prefix )
            {
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:262:38: ^( MINUTES_OF_HOUR int_00_to_59_mandatory_prefix )
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
    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:267:1: meridian_indicator : ( AM -> AM_PM[\"am\"] | PM -> AM_PM[\"pm\"] );
    public final DateParser.meridian_indicator_return meridian_indicator() throws RecognitionException {
        DateParser.meridian_indicator_return retval = new DateParser.meridian_indicator_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token AM182=null;
        Token PM183=null;

        Object AM182_tree=null;
        Object PM183_tree=null;
        RewriteRuleTokenStream stream_PM=new RewriteRuleTokenStream(adaptor,"token PM");
        RewriteRuleTokenStream stream_AM=new RewriteRuleTokenStream(adaptor,"token AM");

        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:268:3: ( AM -> AM_PM[\"am\"] | PM -> AM_PM[\"pm\"] )
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==AM) ) {
                alt58=1;
            }
            else if ( (LA58_0==PM) ) {
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
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:268:5: AM
                    {
                    AM182=(Token)match(input,AM,FOLLOW_AM_in_meridian_indicator2315); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AM.add(AM182);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 268:8: -> AM_PM[\"am\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(AM_PM, "am"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:269:5: PM
                    {
                    PM183=(Token)match(input,PM,FOLLOW_PM_in_meridian_indicator2326); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PM.add(PM183);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 269:8: -> AM_PM[\"pm\"]
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

    public static class named_time_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "named_time"
    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:272:1: named_time : ( NOON -> ^( EXPLICIT_TIME ^( HOURS_OF_DAY INT[\"12\"] ) ^( MINUTES_OF_HOUR INT[\"0\"] ) AM_PM[\"pm\"] ) | MIDNIGHT -> ^( EXPLICIT_TIME ^( HOURS_OF_DAY INT[\"12\"] ) ^( MINUTES_OF_HOUR INT[\"0\"] ) AM_PM[\"am\"] ) );
    public final DateParser.named_time_return named_time() throws RecognitionException {
        DateParser.named_time_return retval = new DateParser.named_time_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token NOON184=null;
        Token MIDNIGHT185=null;

        Object NOON184_tree=null;
        Object MIDNIGHT185_tree=null;
        RewriteRuleTokenStream stream_NOON=new RewriteRuleTokenStream(adaptor,"token NOON");
        RewriteRuleTokenStream stream_MIDNIGHT=new RewriteRuleTokenStream(adaptor,"token MIDNIGHT");

        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:273:3: ( NOON -> ^( EXPLICIT_TIME ^( HOURS_OF_DAY INT[\"12\"] ) ^( MINUTES_OF_HOUR INT[\"0\"] ) AM_PM[\"pm\"] ) | MIDNIGHT -> ^( EXPLICIT_TIME ^( HOURS_OF_DAY INT[\"12\"] ) ^( MINUTES_OF_HOUR INT[\"0\"] ) AM_PM[\"am\"] ) )
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==NOON) ) {
                alt59=1;
            }
            else if ( (LA59_0==MIDNIGHT) ) {
                alt59=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;
            }
            switch (alt59) {
                case 1 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:273:5: NOON
                    {
                    NOON184=(Token)match(input,NOON,FOLLOW_NOON_in_named_time2346); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NOON.add(NOON184);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 273:14: -> ^( EXPLICIT_TIME ^( HOURS_OF_DAY INT[\"12\"] ) ^( MINUTES_OF_HOUR INT[\"0\"] ) AM_PM[\"pm\"] )
                    {
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:273:17: ^( EXPLICIT_TIME ^( HOURS_OF_DAY INT[\"12\"] ) ^( MINUTES_OF_HOUR INT[\"0\"] ) AM_PM[\"pm\"] )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPLICIT_TIME, "EXPLICIT_TIME"), root_1);

                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:273:33: ^( HOURS_OF_DAY INT[\"12\"] )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(HOURS_OF_DAY, "HOURS_OF_DAY"), root_2);

                        adaptor.addChild(root_2, (Object)adaptor.create(INT, "12"));

                        adaptor.addChild(root_1, root_2);
                        }
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:273:59: ^( MINUTES_OF_HOUR INT[\"0\"] )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(MINUTES_OF_HOUR, "MINUTES_OF_HOUR"), root_2);

                        adaptor.addChild(root_2, (Object)adaptor.create(INT, "0"));

                        adaptor.addChild(root_1, root_2);
                        }
                        adaptor.addChild(root_1, (Object)adaptor.create(AM_PM, "pm"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:274:5: MIDNIGHT
                    {
                    MIDNIGHT185=(Token)match(input,MIDNIGHT,FOLLOW_MIDNIGHT_in_named_time2379); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_MIDNIGHT.add(MIDNIGHT185);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 274:14: -> ^( EXPLICIT_TIME ^( HOURS_OF_DAY INT[\"12\"] ) ^( MINUTES_OF_HOUR INT[\"0\"] ) AM_PM[\"am\"] )
                    {
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:274:17: ^( EXPLICIT_TIME ^( HOURS_OF_DAY INT[\"12\"] ) ^( MINUTES_OF_HOUR INT[\"0\"] ) AM_PM[\"am\"] )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPLICIT_TIME, "EXPLICIT_TIME"), root_1);

                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:274:33: ^( HOURS_OF_DAY INT[\"12\"] )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(HOURS_OF_DAY, "HOURS_OF_DAY"), root_2);

                        adaptor.addChild(root_2, (Object)adaptor.create(INT, "12"));

                        adaptor.addChild(root_1, root_2);
                        }
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:274:59: ^( MINUTES_OF_HOUR INT[\"0\"] )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(MINUTES_OF_HOUR, "MINUTES_OF_HOUR"), root_2);

                        adaptor.addChild(root_2, (Object)adaptor.create(INT, "0"));

                        adaptor.addChild(root_1, root_2);
                        }
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
        return retval;
    }
    // $ANTLR end "named_time"

    public static class int_00_to_23_optional_prefix_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "int_00_to_23_optional_prefix"
    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:280:1: int_00_to_23_optional_prefix : ( INT_0 | INT_00 | INT_1_TO_9 | INT_01_TO_12 | INT_13_TO_23 ) -> INT[$int_00_to_23_optional_prefix.text] ;
    public final DateParser.int_00_to_23_optional_prefix_return int_00_to_23_optional_prefix() throws RecognitionException {
        DateParser.int_00_to_23_optional_prefix_return retval = new DateParser.int_00_to_23_optional_prefix_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token INT_0186=null;
        Token INT_00187=null;
        Token INT_1_TO_9188=null;
        Token INT_01_TO_12189=null;
        Token INT_13_TO_23190=null;

        Object INT_0186_tree=null;
        Object INT_00187_tree=null;
        Object INT_1_TO_9188_tree=null;
        Object INT_01_TO_12189_tree=null;
        Object INT_13_TO_23190_tree=null;
        RewriteRuleTokenStream stream_INT_13_TO_23=new RewriteRuleTokenStream(adaptor,"token INT_13_TO_23");
        RewriteRuleTokenStream stream_INT_00=new RewriteRuleTokenStream(adaptor,"token INT_00");
        RewriteRuleTokenStream stream_INT_1_TO_9=new RewriteRuleTokenStream(adaptor,"token INT_1_TO_9");
        RewriteRuleTokenStream stream_INT_01_TO_12=new RewriteRuleTokenStream(adaptor,"token INT_01_TO_12");
        RewriteRuleTokenStream stream_INT_0=new RewriteRuleTokenStream(adaptor,"token INT_0");

        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:281:3: ( ( INT_0 | INT_00 | INT_1_TO_9 | INT_01_TO_12 | INT_13_TO_23 ) -> INT[$int_00_to_23_optional_prefix.text] )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:281:5: ( INT_0 | INT_00 | INT_1_TO_9 | INT_01_TO_12 | INT_13_TO_23 )
            {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:281:5: ( INT_0 | INT_00 | INT_1_TO_9 | INT_01_TO_12 | INT_13_TO_23 )
            int alt60=5;
            switch ( input.LA(1) ) {
            case INT_0:
                {
                alt60=1;
                }
                break;
            case INT_00:
                {
                alt60=2;
                }
                break;
            case INT_1_TO_9:
                {
                alt60=3;
                }
                break;
            case INT_01_TO_12:
                {
                alt60=4;
                }
                break;
            case INT_13_TO_23:
                {
                alt60=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;
            }

            switch (alt60) {
                case 1 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:281:6: INT_0
                    {
                    INT_0186=(Token)match(input,INT_0,FOLLOW_INT_0_in_int_00_to_23_optional_prefix2421); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INT_0.add(INT_0186);


                    }
                    break;
                case 2 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:282:5: INT_00
                    {
                    INT_00187=(Token)match(input,INT_00,FOLLOW_INT_00_in_int_00_to_23_optional_prefix2427); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INT_00.add(INT_00187);


                    }
                    break;
                case 3 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:283:5: INT_1_TO_9
                    {
                    INT_1_TO_9188=(Token)match(input,INT_1_TO_9,FOLLOW_INT_1_TO_9_in_int_00_to_23_optional_prefix2433); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INT_1_TO_9.add(INT_1_TO_9188);


                    }
                    break;
                case 4 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:284:5: INT_01_TO_12
                    {
                    INT_01_TO_12189=(Token)match(input,INT_01_TO_12,FOLLOW_INT_01_TO_12_in_int_00_to_23_optional_prefix2439); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INT_01_TO_12.add(INT_01_TO_12189);


                    }
                    break;
                case 5 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:285:5: INT_13_TO_23
                    {
                    INT_13_TO_23190=(Token)match(input,INT_13_TO_23,FOLLOW_INT_13_TO_23_in_int_00_to_23_optional_prefix2445); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INT_13_TO_23.add(INT_13_TO_23190);


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
            // 285:19: -> INT[$int_00_to_23_optional_prefix.text]
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
    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:289:1: int_00_to_59_mandatory_prefix : ( INT_00 | INT_01_TO_12 | INT_13_TO_23 | INT_24_TO_31 | INT_32_TO_59 ) -> INT[$int_00_to_59_mandatory_prefix.text] ;
    public final DateParser.int_00_to_59_mandatory_prefix_return int_00_to_59_mandatory_prefix() throws RecognitionException {
        DateParser.int_00_to_59_mandatory_prefix_return retval = new DateParser.int_00_to_59_mandatory_prefix_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token INT_00191=null;
        Token INT_01_TO_12192=null;
        Token INT_13_TO_23193=null;
        Token INT_24_TO_31194=null;
        Token INT_32_TO_59195=null;

        Object INT_00191_tree=null;
        Object INT_01_TO_12192_tree=null;
        Object INT_13_TO_23193_tree=null;
        Object INT_24_TO_31194_tree=null;
        Object INT_32_TO_59195_tree=null;
        RewriteRuleTokenStream stream_INT_24_TO_31=new RewriteRuleTokenStream(adaptor,"token INT_24_TO_31");
        RewriteRuleTokenStream stream_INT_13_TO_23=new RewriteRuleTokenStream(adaptor,"token INT_13_TO_23");
        RewriteRuleTokenStream stream_INT_00=new RewriteRuleTokenStream(adaptor,"token INT_00");
        RewriteRuleTokenStream stream_INT_32_TO_59=new RewriteRuleTokenStream(adaptor,"token INT_32_TO_59");
        RewriteRuleTokenStream stream_INT_01_TO_12=new RewriteRuleTokenStream(adaptor,"token INT_01_TO_12");

        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:290:3: ( ( INT_00 | INT_01_TO_12 | INT_13_TO_23 | INT_24_TO_31 | INT_32_TO_59 ) -> INT[$int_00_to_59_mandatory_prefix.text] )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:290:5: ( INT_00 | INT_01_TO_12 | INT_13_TO_23 | INT_24_TO_31 | INT_32_TO_59 )
            {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:290:5: ( INT_00 | INT_01_TO_12 | INT_13_TO_23 | INT_24_TO_31 | INT_32_TO_59 )
            int alt61=5;
            switch ( input.LA(1) ) {
            case INT_00:
                {
                alt61=1;
                }
                break;
            case INT_01_TO_12:
                {
                alt61=2;
                }
                break;
            case INT_13_TO_23:
                {
                alt61=3;
                }
                break;
            case INT_24_TO_31:
                {
                alt61=4;
                }
                break;
            case INT_32_TO_59:
                {
                alt61=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;
            }

            switch (alt61) {
                case 1 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:290:6: INT_00
                    {
                    INT_00191=(Token)match(input,INT_00,FOLLOW_INT_00_in_int_00_to_59_mandatory_prefix2467); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INT_00.add(INT_00191);


                    }
                    break;
                case 2 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:291:5: INT_01_TO_12
                    {
                    INT_01_TO_12192=(Token)match(input,INT_01_TO_12,FOLLOW_INT_01_TO_12_in_int_00_to_59_mandatory_prefix2473); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INT_01_TO_12.add(INT_01_TO_12192);


                    }
                    break;
                case 3 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:292:5: INT_13_TO_23
                    {
                    INT_13_TO_23193=(Token)match(input,INT_13_TO_23,FOLLOW_INT_13_TO_23_in_int_00_to_59_mandatory_prefix2479); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INT_13_TO_23.add(INT_13_TO_23193);


                    }
                    break;
                case 4 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:293:5: INT_24_TO_31
                    {
                    INT_24_TO_31194=(Token)match(input,INT_24_TO_31,FOLLOW_INT_24_TO_31_in_int_00_to_59_mandatory_prefix2485); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INT_24_TO_31.add(INT_24_TO_31194);


                    }
                    break;
                case 5 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:294:5: INT_32_TO_59
                    {
                    INT_32_TO_59195=(Token)match(input,INT_32_TO_59,FOLLOW_INT_32_TO_59_in_int_00_to_59_mandatory_prefix2491); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INT_32_TO_59.add(INT_32_TO_59195);


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
            // 294:19: -> INT[$int_00_to_59_mandatory_prefix.text]
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
    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:298:1: int_00_to_99_mandatory_prefix : ( int_00_to_59_mandatory_prefix | INT_60_TO_99 -> INT[$INT_60_TO_99.text] );
    public final DateParser.int_00_to_99_mandatory_prefix_return int_00_to_99_mandatory_prefix() throws RecognitionException {
        DateParser.int_00_to_99_mandatory_prefix_return retval = new DateParser.int_00_to_99_mandatory_prefix_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token INT_60_TO_99197=null;
        DateParser.int_00_to_59_mandatory_prefix_return int_00_to_59_mandatory_prefix196 = null;


        Object INT_60_TO_99197_tree=null;
        RewriteRuleTokenStream stream_INT_60_TO_99=new RewriteRuleTokenStream(adaptor,"token INT_60_TO_99");

        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:299:3: ( int_00_to_59_mandatory_prefix | INT_60_TO_99 -> INT[$INT_60_TO_99.text] )
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==INT_00||(LA62_0>=INT_01_TO_12 && LA62_0<=INT_32_TO_59)) ) {
                alt62=1;
            }
            else if ( (LA62_0==INT_60_TO_99) ) {
                alt62=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 62, 0, input);

                throw nvae;
            }
            switch (alt62) {
                case 1 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:299:5: int_00_to_59_mandatory_prefix
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_int_00_to_59_mandatory_prefix_in_int_00_to_99_mandatory_prefix2513);
                    int_00_to_59_mandatory_prefix196=int_00_to_59_mandatory_prefix();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, int_00_to_59_mandatory_prefix196.getTree());

                    }
                    break;
                case 2 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:300:5: INT_60_TO_99
                    {
                    INT_60_TO_99197=(Token)match(input,INT_60_TO_99,FOLLOW_INT_60_TO_99_in_int_00_to_99_mandatory_prefix2519); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INT_60_TO_99.add(INT_60_TO_99197);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 300:18: -> INT[$INT_60_TO_99.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, (INT_60_TO_99197!=null?INT_60_TO_99197.getText():null)));

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
    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:304:1: int_01_to_12_optional_prefix : ( INT_1_TO_9 | INT_01_TO_12 ) -> INT[$int_01_to_12_optional_prefix.text] ;
    public final DateParser.int_01_to_12_optional_prefix_return int_01_to_12_optional_prefix() throws RecognitionException {
        DateParser.int_01_to_12_optional_prefix_return retval = new DateParser.int_01_to_12_optional_prefix_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token INT_1_TO_9198=null;
        Token INT_01_TO_12199=null;

        Object INT_1_TO_9198_tree=null;
        Object INT_01_TO_12199_tree=null;
        RewriteRuleTokenStream stream_INT_1_TO_9=new RewriteRuleTokenStream(adaptor,"token INT_1_TO_9");
        RewriteRuleTokenStream stream_INT_01_TO_12=new RewriteRuleTokenStream(adaptor,"token INT_01_TO_12");

        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:305:3: ( ( INT_1_TO_9 | INT_01_TO_12 ) -> INT[$int_01_to_12_optional_prefix.text] )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:305:5: ( INT_1_TO_9 | INT_01_TO_12 )
            {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:305:5: ( INT_1_TO_9 | INT_01_TO_12 )
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==INT_1_TO_9) ) {
                alt63=1;
            }
            else if ( (LA63_0==INT_01_TO_12) ) {
                alt63=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 63, 0, input);

                throw nvae;
            }
            switch (alt63) {
                case 1 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:305:6: INT_1_TO_9
                    {
                    INT_1_TO_9198=(Token)match(input,INT_1_TO_9,FOLLOW_INT_1_TO_9_in_int_01_to_12_optional_prefix2541); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INT_1_TO_9.add(INT_1_TO_9198);


                    }
                    break;
                case 2 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:306:5: INT_01_TO_12
                    {
                    INT_01_TO_12199=(Token)match(input,INT_01_TO_12,FOLLOW_INT_01_TO_12_in_int_01_to_12_optional_prefix2547); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INT_01_TO_12.add(INT_01_TO_12199);


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
            // 306:19: -> INT[$int_01_to_12_optional_prefix.text]
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
    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:310:1: int_01_to_31_optional_prefix : ( INT_1_TO_9 | INT_01_TO_12 | INT_13_TO_23 | INT_24_TO_31 ) -> INT[$int_01_to_31_optional_prefix.text] ;
    public final DateParser.int_01_to_31_optional_prefix_return int_01_to_31_optional_prefix() throws RecognitionException {
        DateParser.int_01_to_31_optional_prefix_return retval = new DateParser.int_01_to_31_optional_prefix_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token INT_1_TO_9200=null;
        Token INT_01_TO_12201=null;
        Token INT_13_TO_23202=null;
        Token INT_24_TO_31203=null;

        Object INT_1_TO_9200_tree=null;
        Object INT_01_TO_12201_tree=null;
        Object INT_13_TO_23202_tree=null;
        Object INT_24_TO_31203_tree=null;
        RewriteRuleTokenStream stream_INT_24_TO_31=new RewriteRuleTokenStream(adaptor,"token INT_24_TO_31");
        RewriteRuleTokenStream stream_INT_13_TO_23=new RewriteRuleTokenStream(adaptor,"token INT_13_TO_23");
        RewriteRuleTokenStream stream_INT_1_TO_9=new RewriteRuleTokenStream(adaptor,"token INT_1_TO_9");
        RewriteRuleTokenStream stream_INT_01_TO_12=new RewriteRuleTokenStream(adaptor,"token INT_01_TO_12");

        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:311:3: ( ( INT_1_TO_9 | INT_01_TO_12 | INT_13_TO_23 | INT_24_TO_31 ) -> INT[$int_01_to_31_optional_prefix.text] )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:311:5: ( INT_1_TO_9 | INT_01_TO_12 | INT_13_TO_23 | INT_24_TO_31 )
            {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:311:5: ( INT_1_TO_9 | INT_01_TO_12 | INT_13_TO_23 | INT_24_TO_31 )
            int alt64=4;
            switch ( input.LA(1) ) {
            case INT_1_TO_9:
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
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 64, 0, input);

                throw nvae;
            }

            switch (alt64) {
                case 1 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:311:6: INT_1_TO_9
                    {
                    INT_1_TO_9200=(Token)match(input,INT_1_TO_9,FOLLOW_INT_1_TO_9_in_int_01_to_31_optional_prefix2570); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INT_1_TO_9.add(INT_1_TO_9200);


                    }
                    break;
                case 2 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:312:5: INT_01_TO_12
                    {
                    INT_01_TO_12201=(Token)match(input,INT_01_TO_12,FOLLOW_INT_01_TO_12_in_int_01_to_31_optional_prefix2576); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INT_01_TO_12.add(INT_01_TO_12201);


                    }
                    break;
                case 3 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:313:5: INT_13_TO_23
                    {
                    INT_13_TO_23202=(Token)match(input,INT_13_TO_23,FOLLOW_INT_13_TO_23_in_int_01_to_31_optional_prefix2582); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INT_13_TO_23.add(INT_13_TO_23202);


                    }
                    break;
                case 4 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:314:5: INT_24_TO_31
                    {
                    INT_24_TO_31203=(Token)match(input,INT_24_TO_31,FOLLOW_INT_24_TO_31_in_int_01_to_31_optional_prefix2588); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INT_24_TO_31.add(INT_24_TO_31203);


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
            // 314:19: -> INT[$int_01_to_31_optional_prefix.text]
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
    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:318:1: int_four_digits : int_00_to_99_mandatory_prefix int_00_to_99_mandatory_prefix -> INT[$int_four_digits.text] ;
    public final DateParser.int_four_digits_return int_four_digits() throws RecognitionException {
        DateParser.int_four_digits_return retval = new DateParser.int_four_digits_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        DateParser.int_00_to_99_mandatory_prefix_return int_00_to_99_mandatory_prefix204 = null;

        DateParser.int_00_to_99_mandatory_prefix_return int_00_to_99_mandatory_prefix205 = null;


        RewriteRuleSubtreeStream stream_int_00_to_99_mandatory_prefix=new RewriteRuleSubtreeStream(adaptor,"rule int_00_to_99_mandatory_prefix");
        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:319:3: ( int_00_to_99_mandatory_prefix int_00_to_99_mandatory_prefix -> INT[$int_four_digits.text] )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:319:5: int_00_to_99_mandatory_prefix int_00_to_99_mandatory_prefix
            {
            pushFollow(FOLLOW_int_00_to_99_mandatory_prefix_in_int_four_digits2610);
            int_00_to_99_mandatory_prefix204=int_00_to_99_mandatory_prefix();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_int_00_to_99_mandatory_prefix.add(int_00_to_99_mandatory_prefix204.getTree());
            pushFollow(FOLLOW_int_00_to_99_mandatory_prefix_in_int_four_digits2612);
            int_00_to_99_mandatory_prefix205=int_00_to_99_mandatory_prefix();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_int_00_to_99_mandatory_prefix.add(int_00_to_99_mandatory_prefix205.getTree());


            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 320:7: -> INT[$int_four_digits.text]
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
    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:325:1: spelled_or_int_01_to_31_optional_prefix : ( int_01_to_31_optional_prefix | spelled_one_to_thirty_one );
    public final DateParser.spelled_or_int_01_to_31_optional_prefix_return spelled_or_int_01_to_31_optional_prefix() throws RecognitionException {
        DateParser.spelled_or_int_01_to_31_optional_prefix_return retval = new DateParser.spelled_or_int_01_to_31_optional_prefix_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        DateParser.int_01_to_31_optional_prefix_return int_01_to_31_optional_prefix206 = null;

        DateParser.spelled_one_to_thirty_one_return spelled_one_to_thirty_one207 = null;



        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:326:3: ( int_01_to_31_optional_prefix | spelled_one_to_thirty_one )
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( ((LA65_0>=INT_1_TO_9 && LA65_0<=INT_24_TO_31)) ) {
                alt65=1;
            }
            else if ( ((LA65_0>=ONE && LA65_0<=THIRTY)) ) {
                alt65=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 65, 0, input);

                throw nvae;
            }
            switch (alt65) {
                case 1 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:326:5: int_01_to_31_optional_prefix
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_int_01_to_31_optional_prefix_in_spelled_or_int_01_to_31_optional_prefix2640);
                    int_01_to_31_optional_prefix206=int_01_to_31_optional_prefix();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, int_01_to_31_optional_prefix206.getTree());

                    }
                    break;
                case 2 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:327:5: spelled_one_to_thirty_one
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_spelled_one_to_thirty_one_in_spelled_or_int_01_to_31_optional_prefix2646);
                    spelled_one_to_thirty_one207=spelled_one_to_thirty_one();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, spelled_one_to_thirty_one207.getTree());

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
    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:331:1: spelled_one_to_thirty_one : ( ONE -> INT[\"1\"] | TWO -> INT[\"2\"] | THREE -> INT[\"3\"] | FOUR -> INT[\"4\"] | FIVE -> INT[\"5\"] | SIX -> INT[\"6\"] | SEVEN -> INT[\"7\"] | EIGHT -> INT[\"8\"] | NINE -> INT[\"9\"] | TEN -> INT[\"10\"] | ELEVEN -> INT[\"11\"] | TWELVE -> INT[\"12\"] | THIRTEEN -> INT[\"13\"] | FOURTEEN -> INT[\"14\"] | FIFTEEN -> INT[\"15\"] | SIXTEEN -> INT[\"16\"] | SEVENTEEN -> INT[\"17\"] | EIGHTEEN -> INT[\"18\"] | NINETEEN -> INT[\"19\"] | TWENTY -> INT[\"20\"] | TWENTY ( DASH | WHITE_SPACE )? ONE -> INT[\"21\"] | TWENTY ( DASH | WHITE_SPACE )? TWO -> INT[\"22\"] | TWENTY ( DASH | WHITE_SPACE )? THREE -> INT[\"23\"] | TWENTY ( DASH | WHITE_SPACE )? FOUR -> INT[\"24\"] | TWENTY ( DASH | WHITE_SPACE )? FIVE -> INT[\"25\"] | TWENTY ( DASH | WHITE_SPACE )? SIX -> INT[\"26\"] | TWENTY ( DASH | WHITE_SPACE )? SEVEN -> INT[\"27\"] | TWENTY ( DASH | WHITE_SPACE )? EIGHT -> INT[\"28\"] | TWENTY ( DASH | WHITE_SPACE )? NINE -> INT[\"29\"] | THIRTY -> INT[\"30\"] | THIRTY ( DASH | WHITE_SPACE )? ONE -> INT[\"31\"] );
    public final DateParser.spelled_one_to_thirty_one_return spelled_one_to_thirty_one() throws RecognitionException {
        DateParser.spelled_one_to_thirty_one_return retval = new DateParser.spelled_one_to_thirty_one_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ONE208=null;
        Token TWO209=null;
        Token THREE210=null;
        Token FOUR211=null;
        Token FIVE212=null;
        Token SIX213=null;
        Token SEVEN214=null;
        Token EIGHT215=null;
        Token NINE216=null;
        Token TEN217=null;
        Token ELEVEN218=null;
        Token TWELVE219=null;
        Token THIRTEEN220=null;
        Token FOURTEEN221=null;
        Token FIFTEEN222=null;
        Token SIXTEEN223=null;
        Token SEVENTEEN224=null;
        Token EIGHTEEN225=null;
        Token NINETEEN226=null;
        Token TWENTY227=null;
        Token TWENTY228=null;
        Token DASH229=null;
        Token WHITE_SPACE230=null;
        Token ONE231=null;
        Token TWENTY232=null;
        Token DASH233=null;
        Token WHITE_SPACE234=null;
        Token TWO235=null;
        Token TWENTY236=null;
        Token DASH237=null;
        Token WHITE_SPACE238=null;
        Token THREE239=null;
        Token TWENTY240=null;
        Token DASH241=null;
        Token WHITE_SPACE242=null;
        Token FOUR243=null;
        Token TWENTY244=null;
        Token DASH245=null;
        Token WHITE_SPACE246=null;
        Token FIVE247=null;
        Token TWENTY248=null;
        Token DASH249=null;
        Token WHITE_SPACE250=null;
        Token SIX251=null;
        Token TWENTY252=null;
        Token DASH253=null;
        Token WHITE_SPACE254=null;
        Token SEVEN255=null;
        Token TWENTY256=null;
        Token DASH257=null;
        Token WHITE_SPACE258=null;
        Token EIGHT259=null;
        Token TWENTY260=null;
        Token DASH261=null;
        Token WHITE_SPACE262=null;
        Token NINE263=null;
        Token THIRTY264=null;
        Token THIRTY265=null;
        Token DASH266=null;
        Token WHITE_SPACE267=null;
        Token ONE268=null;

        Object ONE208_tree=null;
        Object TWO209_tree=null;
        Object THREE210_tree=null;
        Object FOUR211_tree=null;
        Object FIVE212_tree=null;
        Object SIX213_tree=null;
        Object SEVEN214_tree=null;
        Object EIGHT215_tree=null;
        Object NINE216_tree=null;
        Object TEN217_tree=null;
        Object ELEVEN218_tree=null;
        Object TWELVE219_tree=null;
        Object THIRTEEN220_tree=null;
        Object FOURTEEN221_tree=null;
        Object FIFTEEN222_tree=null;
        Object SIXTEEN223_tree=null;
        Object SEVENTEEN224_tree=null;
        Object EIGHTEEN225_tree=null;
        Object NINETEEN226_tree=null;
        Object TWENTY227_tree=null;
        Object TWENTY228_tree=null;
        Object DASH229_tree=null;
        Object WHITE_SPACE230_tree=null;
        Object ONE231_tree=null;
        Object TWENTY232_tree=null;
        Object DASH233_tree=null;
        Object WHITE_SPACE234_tree=null;
        Object TWO235_tree=null;
        Object TWENTY236_tree=null;
        Object DASH237_tree=null;
        Object WHITE_SPACE238_tree=null;
        Object THREE239_tree=null;
        Object TWENTY240_tree=null;
        Object DASH241_tree=null;
        Object WHITE_SPACE242_tree=null;
        Object FOUR243_tree=null;
        Object TWENTY244_tree=null;
        Object DASH245_tree=null;
        Object WHITE_SPACE246_tree=null;
        Object FIVE247_tree=null;
        Object TWENTY248_tree=null;
        Object DASH249_tree=null;
        Object WHITE_SPACE250_tree=null;
        Object SIX251_tree=null;
        Object TWENTY252_tree=null;
        Object DASH253_tree=null;
        Object WHITE_SPACE254_tree=null;
        Object SEVEN255_tree=null;
        Object TWENTY256_tree=null;
        Object DASH257_tree=null;
        Object WHITE_SPACE258_tree=null;
        Object EIGHT259_tree=null;
        Object TWENTY260_tree=null;
        Object DASH261_tree=null;
        Object WHITE_SPACE262_tree=null;
        Object NINE263_tree=null;
        Object THIRTY264_tree=null;
        Object THIRTY265_tree=null;
        Object DASH266_tree=null;
        Object WHITE_SPACE267_tree=null;
        Object ONE268_tree=null;
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
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:332:3: ( ONE -> INT[\"1\"] | TWO -> INT[\"2\"] | THREE -> INT[\"3\"] | FOUR -> INT[\"4\"] | FIVE -> INT[\"5\"] | SIX -> INT[\"6\"] | SEVEN -> INT[\"7\"] | EIGHT -> INT[\"8\"] | NINE -> INT[\"9\"] | TEN -> INT[\"10\"] | ELEVEN -> INT[\"11\"] | TWELVE -> INT[\"12\"] | THIRTEEN -> INT[\"13\"] | FOURTEEN -> INT[\"14\"] | FIFTEEN -> INT[\"15\"] | SIXTEEN -> INT[\"16\"] | SEVENTEEN -> INT[\"17\"] | EIGHTEEN -> INT[\"18\"] | NINETEEN -> INT[\"19\"] | TWENTY -> INT[\"20\"] | TWENTY ( DASH | WHITE_SPACE )? ONE -> INT[\"21\"] | TWENTY ( DASH | WHITE_SPACE )? TWO -> INT[\"22\"] | TWENTY ( DASH | WHITE_SPACE )? THREE -> INT[\"23\"] | TWENTY ( DASH | WHITE_SPACE )? FOUR -> INT[\"24\"] | TWENTY ( DASH | WHITE_SPACE )? FIVE -> INT[\"25\"] | TWENTY ( DASH | WHITE_SPACE )? SIX -> INT[\"26\"] | TWENTY ( DASH | WHITE_SPACE )? SEVEN -> INT[\"27\"] | TWENTY ( DASH | WHITE_SPACE )? EIGHT -> INT[\"28\"] | TWENTY ( DASH | WHITE_SPACE )? NINE -> INT[\"29\"] | THIRTY -> INT[\"30\"] | THIRTY ( DASH | WHITE_SPACE )? ONE -> INT[\"31\"] )
            int alt76=31;
            alt76 = dfa76.predict(input);
            switch (alt76) {
                case 1 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:332:5: ONE
                    {
                    ONE208=(Token)match(input,ONE,FOLLOW_ONE_in_spelled_one_to_thirty_one2662); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ONE.add(ONE208);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 332:16: -> INT[\"1\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "1"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:333:5: TWO
                    {
                    TWO209=(Token)match(input,TWO,FOLLOW_TWO_in_spelled_one_to_thirty_one2680); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWO.add(TWO209);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 333:16: -> INT[\"2\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "2"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:334:5: THREE
                    {
                    THREE210=(Token)match(input,THREE,FOLLOW_THREE_in_spelled_one_to_thirty_one2698); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THREE.add(THREE210);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 334:16: -> INT[\"3\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "3"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:335:5: FOUR
                    {
                    FOUR211=(Token)match(input,FOUR,FOLLOW_FOUR_in_spelled_one_to_thirty_one2714); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FOUR.add(FOUR211);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 335:16: -> INT[\"4\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "4"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:336:5: FIVE
                    {
                    FIVE212=(Token)match(input,FIVE,FOLLOW_FIVE_in_spelled_one_to_thirty_one2731); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FIVE.add(FIVE212);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 336:16: -> INT[\"5\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "5"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 6 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:337:5: SIX
                    {
                    SIX213=(Token)match(input,SIX,FOLLOW_SIX_in_spelled_one_to_thirty_one2748); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SIX.add(SIX213);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 337:16: -> INT[\"6\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "6"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 7 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:338:5: SEVEN
                    {
                    SEVEN214=(Token)match(input,SEVEN,FOLLOW_SEVEN_in_spelled_one_to_thirty_one2766); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEVEN.add(SEVEN214);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 338:16: -> INT[\"7\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "7"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 8 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:339:5: EIGHT
                    {
                    EIGHT215=(Token)match(input,EIGHT,FOLLOW_EIGHT_in_spelled_one_to_thirty_one2782); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EIGHT.add(EIGHT215);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 339:16: -> INT[\"8\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "8"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 9 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:340:5: NINE
                    {
                    NINE216=(Token)match(input,NINE,FOLLOW_NINE_in_spelled_one_to_thirty_one2798); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NINE.add(NINE216);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 340:16: -> INT[\"9\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "9"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 10 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:341:5: TEN
                    {
                    TEN217=(Token)match(input,TEN,FOLLOW_TEN_in_spelled_one_to_thirty_one2815); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TEN.add(TEN217);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 341:16: -> INT[\"10\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "10"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 11 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:342:5: ELEVEN
                    {
                    ELEVEN218=(Token)match(input,ELEVEN,FOLLOW_ELEVEN_in_spelled_one_to_thirty_one2833); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ELEVEN.add(ELEVEN218);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 342:16: -> INT[\"11\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "11"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 12 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:343:5: TWELVE
                    {
                    TWELVE219=(Token)match(input,TWELVE,FOLLOW_TWELVE_in_spelled_one_to_thirty_one2848); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWELVE.add(TWELVE219);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 343:16: -> INT[\"12\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "12"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 13 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:344:5: THIRTEEN
                    {
                    THIRTEEN220=(Token)match(input,THIRTEEN,FOLLOW_THIRTEEN_in_spelled_one_to_thirty_one2863); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THIRTEEN.add(THIRTEEN220);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 344:16: -> INT[\"13\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "13"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 14 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:345:5: FOURTEEN
                    {
                    FOURTEEN221=(Token)match(input,FOURTEEN,FOLLOW_FOURTEEN_in_spelled_one_to_thirty_one2876); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FOURTEEN.add(FOURTEEN221);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 345:16: -> INT[\"14\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "14"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 15 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:346:5: FIFTEEN
                    {
                    FIFTEEN222=(Token)match(input,FIFTEEN,FOLLOW_FIFTEEN_in_spelled_one_to_thirty_one2889); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FIFTEEN.add(FIFTEEN222);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 346:16: -> INT[\"15\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "15"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 16 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:347:5: SIXTEEN
                    {
                    SIXTEEN223=(Token)match(input,SIXTEEN,FOLLOW_SIXTEEN_in_spelled_one_to_thirty_one2903); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SIXTEEN.add(SIXTEEN223);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 347:16: -> INT[\"16\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "16"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 17 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:348:5: SEVENTEEN
                    {
                    SEVENTEEN224=(Token)match(input,SEVENTEEN,FOLLOW_SEVENTEEN_in_spelled_one_to_thirty_one2917); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEVENTEEN.add(SEVENTEEN224);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 348:16: -> INT[\"17\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "17"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 18 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:349:5: EIGHTEEN
                    {
                    EIGHTEEN225=(Token)match(input,EIGHTEEN,FOLLOW_EIGHTEEN_in_spelled_one_to_thirty_one2929); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EIGHTEEN.add(EIGHTEEN225);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 349:16: -> INT[\"18\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "18"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 19 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:350:5: NINETEEN
                    {
                    NINETEEN226=(Token)match(input,NINETEEN,FOLLOW_NINETEEN_in_spelled_one_to_thirty_one2942); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NINETEEN.add(NINETEEN226);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 350:16: -> INT[\"19\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "19"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 20 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:351:5: TWENTY
                    {
                    TWENTY227=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_one_to_thirty_one2955); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY227);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 351:16: -> INT[\"20\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "20"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 21 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:352:5: TWENTY ( DASH | WHITE_SPACE )? ONE
                    {
                    TWENTY228=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_one_to_thirty_one2970); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY228);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:352:12: ( DASH | WHITE_SPACE )?
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
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:352:13: DASH
                            {
                            DASH229=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_one_to_thirty_one2973); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_DASH.add(DASH229);


                            }
                            break;
                        case 2 :
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:352:20: WHITE_SPACE
                            {
                            WHITE_SPACE230=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_spelled_one_to_thirty_one2977); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE230);


                            }
                            break;

                    }

                    ONE231=(Token)match(input,ONE,FOLLOW_ONE_in_spelled_one_to_thirty_one2981); if (state.failed) return retval; 
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
                    // 352:40: -> INT[\"21\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "21"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 22 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:353:5: TWENTY ( DASH | WHITE_SPACE )? TWO
                    {
                    TWENTY232=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_one_to_thirty_one2994); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY232);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:353:12: ( DASH | WHITE_SPACE )?
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
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:353:13: DASH
                            {
                            DASH233=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_one_to_thirty_one2997); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_DASH.add(DASH233);


                            }
                            break;
                        case 2 :
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:353:20: WHITE_SPACE
                            {
                            WHITE_SPACE234=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_spelled_one_to_thirty_one3001); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE234);


                            }
                            break;

                    }

                    TWO235=(Token)match(input,TWO,FOLLOW_TWO_in_spelled_one_to_thirty_one3005); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWO.add(TWO235);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 353:40: -> INT[\"22\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "22"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 23 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:354:5: TWENTY ( DASH | WHITE_SPACE )? THREE
                    {
                    TWENTY236=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_one_to_thirty_one3018); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY236);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:354:12: ( DASH | WHITE_SPACE )?
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
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:354:13: DASH
                            {
                            DASH237=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_one_to_thirty_one3021); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_DASH.add(DASH237);


                            }
                            break;
                        case 2 :
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:354:20: WHITE_SPACE
                            {
                            WHITE_SPACE238=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_spelled_one_to_thirty_one3025); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE238);


                            }
                            break;

                    }

                    THREE239=(Token)match(input,THREE,FOLLOW_THREE_in_spelled_one_to_thirty_one3029); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THREE.add(THREE239);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 354:40: -> INT[\"23\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "23"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 24 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:355:5: TWENTY ( DASH | WHITE_SPACE )? FOUR
                    {
                    TWENTY240=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_one_to_thirty_one3040); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY240);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:355:12: ( DASH | WHITE_SPACE )?
                    int alt69=3;
                    int LA69_0 = input.LA(1);

                    if ( (LA69_0==DASH) ) {
                        alt69=1;
                    }
                    else if ( (LA69_0==WHITE_SPACE) ) {
                        alt69=2;
                    }
                    switch (alt69) {
                        case 1 :
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:355:13: DASH
                            {
                            DASH241=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_one_to_thirty_one3043); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_DASH.add(DASH241);


                            }
                            break;
                        case 2 :
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:355:20: WHITE_SPACE
                            {
                            WHITE_SPACE242=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_spelled_one_to_thirty_one3047); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE242);


                            }
                            break;

                    }

                    FOUR243=(Token)match(input,FOUR,FOLLOW_FOUR_in_spelled_one_to_thirty_one3051); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FOUR.add(FOUR243);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 355:40: -> INT[\"24\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "24"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 25 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:356:5: TWENTY ( DASH | WHITE_SPACE )? FIVE
                    {
                    TWENTY244=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_one_to_thirty_one3063); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY244);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:356:12: ( DASH | WHITE_SPACE )?
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
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:356:13: DASH
                            {
                            DASH245=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_one_to_thirty_one3066); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_DASH.add(DASH245);


                            }
                            break;
                        case 2 :
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:356:20: WHITE_SPACE
                            {
                            WHITE_SPACE246=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_spelled_one_to_thirty_one3070); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE246);


                            }
                            break;

                    }

                    FIVE247=(Token)match(input,FIVE,FOLLOW_FIVE_in_spelled_one_to_thirty_one3074); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FIVE.add(FIVE247);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 356:40: -> INT[\"25\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "25"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 26 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:357:5: TWENTY ( DASH | WHITE_SPACE )? SIX
                    {
                    TWENTY248=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_one_to_thirty_one3086); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY248);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:357:12: ( DASH | WHITE_SPACE )?
                    int alt71=3;
                    int LA71_0 = input.LA(1);

                    if ( (LA71_0==DASH) ) {
                        alt71=1;
                    }
                    else if ( (LA71_0==WHITE_SPACE) ) {
                        alt71=2;
                    }
                    switch (alt71) {
                        case 1 :
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:357:13: DASH
                            {
                            DASH249=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_one_to_thirty_one3089); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_DASH.add(DASH249);


                            }
                            break;
                        case 2 :
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:357:20: WHITE_SPACE
                            {
                            WHITE_SPACE250=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_spelled_one_to_thirty_one3093); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE250);


                            }
                            break;

                    }

                    SIX251=(Token)match(input,SIX,FOLLOW_SIX_in_spelled_one_to_thirty_one3097); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SIX.add(SIX251);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 357:40: -> INT[\"26\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "26"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 27 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:358:5: TWENTY ( DASH | WHITE_SPACE )? SEVEN
                    {
                    TWENTY252=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_one_to_thirty_one3110); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY252);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:358:12: ( DASH | WHITE_SPACE )?
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
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:358:13: DASH
                            {
                            DASH253=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_one_to_thirty_one3113); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_DASH.add(DASH253);


                            }
                            break;
                        case 2 :
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:358:20: WHITE_SPACE
                            {
                            WHITE_SPACE254=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_spelled_one_to_thirty_one3117); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE254);


                            }
                            break;

                    }

                    SEVEN255=(Token)match(input,SEVEN,FOLLOW_SEVEN_in_spelled_one_to_thirty_one3121); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEVEN.add(SEVEN255);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 358:40: -> INT[\"27\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "27"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 28 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:359:5: TWENTY ( DASH | WHITE_SPACE )? EIGHT
                    {
                    TWENTY256=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_one_to_thirty_one3132); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY256);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:359:12: ( DASH | WHITE_SPACE )?
                    int alt73=3;
                    int LA73_0 = input.LA(1);

                    if ( (LA73_0==DASH) ) {
                        alt73=1;
                    }
                    else if ( (LA73_0==WHITE_SPACE) ) {
                        alt73=2;
                    }
                    switch (alt73) {
                        case 1 :
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:359:13: DASH
                            {
                            DASH257=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_one_to_thirty_one3135); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_DASH.add(DASH257);


                            }
                            break;
                        case 2 :
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:359:20: WHITE_SPACE
                            {
                            WHITE_SPACE258=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_spelled_one_to_thirty_one3139); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE258);


                            }
                            break;

                    }

                    EIGHT259=(Token)match(input,EIGHT,FOLLOW_EIGHT_in_spelled_one_to_thirty_one3143); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EIGHT.add(EIGHT259);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 359:40: -> INT[\"28\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "28"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 29 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:360:5: TWENTY ( DASH | WHITE_SPACE )? NINE
                    {
                    TWENTY260=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_one_to_thirty_one3154); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY260);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:360:12: ( DASH | WHITE_SPACE )?
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
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:360:13: DASH
                            {
                            DASH261=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_one_to_thirty_one3157); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_DASH.add(DASH261);


                            }
                            break;
                        case 2 :
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:360:20: WHITE_SPACE
                            {
                            WHITE_SPACE262=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_spelled_one_to_thirty_one3161); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE262);


                            }
                            break;

                    }

                    NINE263=(Token)match(input,NINE,FOLLOW_NINE_in_spelled_one_to_thirty_one3165); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NINE.add(NINE263);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 360:40: -> INT[\"29\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "29"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 30 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:361:5: THIRTY
                    {
                    THIRTY264=(Token)match(input,THIRTY,FOLLOW_THIRTY_in_spelled_one_to_thirty_one3177); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THIRTY.add(THIRTY264);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 361:40: -> INT[\"30\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "30"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 31 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:362:5: THIRTY ( DASH | WHITE_SPACE )? ONE
                    {
                    THIRTY265=(Token)match(input,THIRTY,FOLLOW_THIRTY_in_spelled_one_to_thirty_one3216); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THIRTY.add(THIRTY265);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:362:12: ( DASH | WHITE_SPACE )?
                    int alt75=3;
                    int LA75_0 = input.LA(1);

                    if ( (LA75_0==DASH) ) {
                        alt75=1;
                    }
                    else if ( (LA75_0==WHITE_SPACE) ) {
                        alt75=2;
                    }
                    switch (alt75) {
                        case 1 :
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:362:13: DASH
                            {
                            DASH266=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_one_to_thirty_one3219); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_DASH.add(DASH266);


                            }
                            break;
                        case 2 :
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:362:20: WHITE_SPACE
                            {
                            WHITE_SPACE267=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_spelled_one_to_thirty_one3223); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE267);


                            }
                            break;

                    }

                    ONE268=(Token)match(input,ONE,FOLLOW_ONE_in_spelled_one_to_thirty_one3227); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ONE.add(ONE268);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 362:40: -> INT[\"31\"]
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
    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:366:1: spelled_first_to_thirty_first : ( FIRST -> INT[\"1\"] | SECOND -> INT[\"2\"] | THIRD -> INT[\"3\"] | FOURTH -> INT[\"4\"] | FIFTH -> INT[\"5\"] | SIXTH -> INT[\"6\"] | SEVENTH -> INT[\"7\"] | EIGHTH -> INT[\"8\"] | NINTH -> INT[\"9\"] | TENTH -> INT[\"10\"] | ELEVENTH -> INT[\"11\"] | TWELFTH -> INT[\"12\"] | THIRTEENTH -> INT[\"13\"] | FOURTEENTH -> INT[\"14\"] | FIFTEENTH -> INT[\"15\"] | SIXTEENTH -> INT[\"16\"] | SEVENTEENTH -> INT[\"17\"] | EIGHTEENTH -> INT[\"18\"] | NINETEENTH -> INT[\"19\"] | TWENTIETH -> INT[\"20\"] | ( TWENTY_FIRST | ( TWENTY ( DASH | WHITE_SPACE )? FIRST ) ) -> INT[\"21\"] | ( TWENTY_SECOND | ( TWENTY ( DASH | WHITE_SPACE )? SECOND ) ) -> INT[\"22\"] | ( TWENTY_THIRD | ( TWENTY ( DASH | WHITE_SPACE )? THIRD ) ) -> INT[\"23\"] | ( TWENTY_FOURTH | ( TWENTY ( DASH | WHITE_SPACE )? FOURTH ) ) -> INT[\"24\"] | ( TWENTY_FIFTH | ( TWENTY ( DASH | WHITE_SPACE )? FIFTH ) ) -> INT[\"25\"] | ( TWENTY_SIXTH | ( TWENTY ( DASH | WHITE_SPACE )? SIXTH ) ) -> INT[\"26\"] | ( TWENTY_SEVENTH | ( TWENTY ( DASH | WHITE_SPACE )? SEVENTH ) ) -> INT[\"27\"] | ( TWENTY_EIGHTH | ( TWENTY ( DASH | WHITE_SPACE )? EIGHTH ) ) -> INT[\"28\"] | ( TWENTY_NINTH | ( TWENTY ( DASH | WHITE_SPACE )? NINTH ) ) -> INT[\"29\"] | THIRTIETH -> INT[\"30\"] | ( THIRTY_FIRST | ( THIRTY ( DASH | WHITE_SPACE )? FIRST ) ) -> INT[\"31\"] );
    public final DateParser.spelled_first_to_thirty_first_return spelled_first_to_thirty_first() throws RecognitionException {
        DateParser.spelled_first_to_thirty_first_return retval = new DateParser.spelled_first_to_thirty_first_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token FIRST269=null;
        Token SECOND270=null;
        Token THIRD271=null;
        Token FOURTH272=null;
        Token FIFTH273=null;
        Token SIXTH274=null;
        Token SEVENTH275=null;
        Token EIGHTH276=null;
        Token NINTH277=null;
        Token TENTH278=null;
        Token ELEVENTH279=null;
        Token TWELFTH280=null;
        Token THIRTEENTH281=null;
        Token FOURTEENTH282=null;
        Token FIFTEENTH283=null;
        Token SIXTEENTH284=null;
        Token SEVENTEENTH285=null;
        Token EIGHTEENTH286=null;
        Token NINETEENTH287=null;
        Token TWENTIETH288=null;
        Token TWENTY_FIRST289=null;
        Token TWENTY290=null;
        Token DASH291=null;
        Token WHITE_SPACE292=null;
        Token FIRST293=null;
        Token TWENTY_SECOND294=null;
        Token TWENTY295=null;
        Token DASH296=null;
        Token WHITE_SPACE297=null;
        Token SECOND298=null;
        Token TWENTY_THIRD299=null;
        Token TWENTY300=null;
        Token DASH301=null;
        Token WHITE_SPACE302=null;
        Token THIRD303=null;
        Token TWENTY_FOURTH304=null;
        Token TWENTY305=null;
        Token DASH306=null;
        Token WHITE_SPACE307=null;
        Token FOURTH308=null;
        Token TWENTY_FIFTH309=null;
        Token TWENTY310=null;
        Token DASH311=null;
        Token WHITE_SPACE312=null;
        Token FIFTH313=null;
        Token TWENTY_SIXTH314=null;
        Token TWENTY315=null;
        Token DASH316=null;
        Token WHITE_SPACE317=null;
        Token SIXTH318=null;
        Token TWENTY_SEVENTH319=null;
        Token TWENTY320=null;
        Token DASH321=null;
        Token WHITE_SPACE322=null;
        Token SEVENTH323=null;
        Token TWENTY_EIGHTH324=null;
        Token TWENTY325=null;
        Token DASH326=null;
        Token WHITE_SPACE327=null;
        Token EIGHTH328=null;
        Token TWENTY_NINTH329=null;
        Token TWENTY330=null;
        Token DASH331=null;
        Token WHITE_SPACE332=null;
        Token NINTH333=null;
        Token THIRTIETH334=null;
        Token THIRTY_FIRST335=null;
        Token THIRTY336=null;
        Token DASH337=null;
        Token WHITE_SPACE338=null;
        Token FIRST339=null;

        Object FIRST269_tree=null;
        Object SECOND270_tree=null;
        Object THIRD271_tree=null;
        Object FOURTH272_tree=null;
        Object FIFTH273_tree=null;
        Object SIXTH274_tree=null;
        Object SEVENTH275_tree=null;
        Object EIGHTH276_tree=null;
        Object NINTH277_tree=null;
        Object TENTH278_tree=null;
        Object ELEVENTH279_tree=null;
        Object TWELFTH280_tree=null;
        Object THIRTEENTH281_tree=null;
        Object FOURTEENTH282_tree=null;
        Object FIFTEENTH283_tree=null;
        Object SIXTEENTH284_tree=null;
        Object SEVENTEENTH285_tree=null;
        Object EIGHTEENTH286_tree=null;
        Object NINETEENTH287_tree=null;
        Object TWENTIETH288_tree=null;
        Object TWENTY_FIRST289_tree=null;
        Object TWENTY290_tree=null;
        Object DASH291_tree=null;
        Object WHITE_SPACE292_tree=null;
        Object FIRST293_tree=null;
        Object TWENTY_SECOND294_tree=null;
        Object TWENTY295_tree=null;
        Object DASH296_tree=null;
        Object WHITE_SPACE297_tree=null;
        Object SECOND298_tree=null;
        Object TWENTY_THIRD299_tree=null;
        Object TWENTY300_tree=null;
        Object DASH301_tree=null;
        Object WHITE_SPACE302_tree=null;
        Object THIRD303_tree=null;
        Object TWENTY_FOURTH304_tree=null;
        Object TWENTY305_tree=null;
        Object DASH306_tree=null;
        Object WHITE_SPACE307_tree=null;
        Object FOURTH308_tree=null;
        Object TWENTY_FIFTH309_tree=null;
        Object TWENTY310_tree=null;
        Object DASH311_tree=null;
        Object WHITE_SPACE312_tree=null;
        Object FIFTH313_tree=null;
        Object TWENTY_SIXTH314_tree=null;
        Object TWENTY315_tree=null;
        Object DASH316_tree=null;
        Object WHITE_SPACE317_tree=null;
        Object SIXTH318_tree=null;
        Object TWENTY_SEVENTH319_tree=null;
        Object TWENTY320_tree=null;
        Object DASH321_tree=null;
        Object WHITE_SPACE322_tree=null;
        Object SEVENTH323_tree=null;
        Object TWENTY_EIGHTH324_tree=null;
        Object TWENTY325_tree=null;
        Object DASH326_tree=null;
        Object WHITE_SPACE327_tree=null;
        Object EIGHTH328_tree=null;
        Object TWENTY_NINTH329_tree=null;
        Object TWENTY330_tree=null;
        Object DASH331_tree=null;
        Object WHITE_SPACE332_tree=null;
        Object NINTH333_tree=null;
        Object THIRTIETH334_tree=null;
        Object THIRTY_FIRST335_tree=null;
        Object THIRTY336_tree=null;
        Object DASH337_tree=null;
        Object WHITE_SPACE338_tree=null;
        Object FIRST339_tree=null;
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
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:367:3: ( FIRST -> INT[\"1\"] | SECOND -> INT[\"2\"] | THIRD -> INT[\"3\"] | FOURTH -> INT[\"4\"] | FIFTH -> INT[\"5\"] | SIXTH -> INT[\"6\"] | SEVENTH -> INT[\"7\"] | EIGHTH -> INT[\"8\"] | NINTH -> INT[\"9\"] | TENTH -> INT[\"10\"] | ELEVENTH -> INT[\"11\"] | TWELFTH -> INT[\"12\"] | THIRTEENTH -> INT[\"13\"] | FOURTEENTH -> INT[\"14\"] | FIFTEENTH -> INT[\"15\"] | SIXTEENTH -> INT[\"16\"] | SEVENTEENTH -> INT[\"17\"] | EIGHTEENTH -> INT[\"18\"] | NINETEENTH -> INT[\"19\"] | TWENTIETH -> INT[\"20\"] | ( TWENTY_FIRST | ( TWENTY ( DASH | WHITE_SPACE )? FIRST ) ) -> INT[\"21\"] | ( TWENTY_SECOND | ( TWENTY ( DASH | WHITE_SPACE )? SECOND ) ) -> INT[\"22\"] | ( TWENTY_THIRD | ( TWENTY ( DASH | WHITE_SPACE )? THIRD ) ) -> INT[\"23\"] | ( TWENTY_FOURTH | ( TWENTY ( DASH | WHITE_SPACE )? FOURTH ) ) -> INT[\"24\"] | ( TWENTY_FIFTH | ( TWENTY ( DASH | WHITE_SPACE )? FIFTH ) ) -> INT[\"25\"] | ( TWENTY_SIXTH | ( TWENTY ( DASH | WHITE_SPACE )? SIXTH ) ) -> INT[\"26\"] | ( TWENTY_SEVENTH | ( TWENTY ( DASH | WHITE_SPACE )? SEVENTH ) ) -> INT[\"27\"] | ( TWENTY_EIGHTH | ( TWENTY ( DASH | WHITE_SPACE )? EIGHTH ) ) -> INT[\"28\"] | ( TWENTY_NINTH | ( TWENTY ( DASH | WHITE_SPACE )? NINTH ) ) -> INT[\"29\"] | THIRTIETH -> INT[\"30\"] | ( THIRTY_FIRST | ( THIRTY ( DASH | WHITE_SPACE )? FIRST ) ) -> INT[\"31\"] )
            int alt97=31;
            alt97 = dfa97.predict(input);
            switch (alt97) {
                case 1 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:367:5: FIRST
                    {
                    FIRST269=(Token)match(input,FIRST,FOLLOW_FIRST_in_spelled_first_to_thirty_first3250); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FIRST.add(FIRST269);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 367:17: -> INT[\"1\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "1"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:368:5: SECOND
                    {
                    SECOND270=(Token)match(input,SECOND,FOLLOW_SECOND_in_spelled_first_to_thirty_first3267); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SECOND.add(SECOND270);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 368:17: -> INT[\"2\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "2"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:369:5: THIRD
                    {
                    THIRD271=(Token)match(input,THIRD,FOLLOW_THIRD_in_spelled_first_to_thirty_first3283); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THIRD.add(THIRD271);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 369:17: -> INT[\"3\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "3"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:370:5: FOURTH
                    {
                    FOURTH272=(Token)match(input,FOURTH,FOLLOW_FOURTH_in_spelled_first_to_thirty_first3300); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FOURTH.add(FOURTH272);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 370:17: -> INT[\"4\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "4"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:371:5: FIFTH
                    {
                    FIFTH273=(Token)match(input,FIFTH,FOLLOW_FIFTH_in_spelled_first_to_thirty_first3316); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FIFTH.add(FIFTH273);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 371:17: -> INT[\"5\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "5"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 6 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:372:5: SIXTH
                    {
                    SIXTH274=(Token)match(input,SIXTH,FOLLOW_SIXTH_in_spelled_first_to_thirty_first3333); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SIXTH.add(SIXTH274);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 372:17: -> INT[\"6\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "6"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 7 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:373:5: SEVENTH
                    {
                    SEVENTH275=(Token)match(input,SEVENTH,FOLLOW_SEVENTH_in_spelled_first_to_thirty_first3350); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEVENTH.add(SEVENTH275);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 373:17: -> INT[\"7\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "7"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 8 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:374:5: EIGHTH
                    {
                    EIGHTH276=(Token)match(input,EIGHTH,FOLLOW_EIGHTH_in_spelled_first_to_thirty_first3365); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EIGHTH.add(EIGHTH276);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 374:17: -> INT[\"8\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "8"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 9 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:375:5: NINTH
                    {
                    NINTH277=(Token)match(input,NINTH,FOLLOW_NINTH_in_spelled_first_to_thirty_first3381); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NINTH.add(NINTH277);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 375:17: -> INT[\"9\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "9"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 10 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:376:5: TENTH
                    {
                    TENTH278=(Token)match(input,TENTH,FOLLOW_TENTH_in_spelled_first_to_thirty_first3398); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TENTH.add(TENTH278);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 376:17: -> INT[\"10\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "10"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 11 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:377:5: ELEVENTH
                    {
                    ELEVENTH279=(Token)match(input,ELEVENTH,FOLLOW_ELEVENTH_in_spelled_first_to_thirty_first3415); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ELEVENTH.add(ELEVENTH279);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 377:17: -> INT[\"11\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "11"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 12 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:378:5: TWELFTH
                    {
                    TWELFTH280=(Token)match(input,TWELFTH,FOLLOW_TWELFTH_in_spelled_first_to_thirty_first3429); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWELFTH.add(TWELFTH280);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 378:17: -> INT[\"12\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "12"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 13 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:379:5: THIRTEENTH
                    {
                    THIRTEENTH281=(Token)match(input,THIRTEENTH,FOLLOW_THIRTEENTH_in_spelled_first_to_thirty_first3444); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THIRTEENTH.add(THIRTEENTH281);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 379:17: -> INT[\"13\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "13"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 14 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:380:5: FOURTEENTH
                    {
                    FOURTEENTH282=(Token)match(input,FOURTEENTH,FOLLOW_FOURTEENTH_in_spelled_first_to_thirty_first3456); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FOURTEENTH.add(FOURTEENTH282);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 380:17: -> INT[\"14\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "14"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 15 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:381:5: FIFTEENTH
                    {
                    FIFTEENTH283=(Token)match(input,FIFTEENTH,FOLLOW_FIFTEENTH_in_spelled_first_to_thirty_first3468); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FIFTEENTH.add(FIFTEENTH283);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 381:17: -> INT[\"15\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "15"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 16 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:382:5: SIXTEENTH
                    {
                    SIXTEENTH284=(Token)match(input,SIXTEENTH,FOLLOW_SIXTEENTH_in_spelled_first_to_thirty_first3481); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SIXTEENTH.add(SIXTEENTH284);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 382:17: -> INT[\"16\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "16"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 17 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:383:5: SEVENTEENTH
                    {
                    SEVENTEENTH285=(Token)match(input,SEVENTEENTH,FOLLOW_SEVENTEENTH_in_spelled_first_to_thirty_first3494); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEVENTEENTH.add(SEVENTEENTH285);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 383:17: -> INT[\"17\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "17"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 18 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:384:5: EIGHTEENTH
                    {
                    EIGHTEENTH286=(Token)match(input,EIGHTEENTH,FOLLOW_EIGHTEENTH_in_spelled_first_to_thirty_first3505); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EIGHTEENTH.add(EIGHTEENTH286);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 384:17: -> INT[\"18\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "18"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 19 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:385:5: NINETEENTH
                    {
                    NINETEENTH287=(Token)match(input,NINETEENTH,FOLLOW_NINETEENTH_in_spelled_first_to_thirty_first3517); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NINETEENTH.add(NINETEENTH287);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 385:17: -> INT[\"19\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "19"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 20 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:386:5: TWENTIETH
                    {
                    TWENTIETH288=(Token)match(input,TWENTIETH,FOLLOW_TWENTIETH_in_spelled_first_to_thirty_first3529); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWENTIETH.add(TWENTIETH288);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 386:17: -> INT[\"20\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "20"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 21 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:387:5: ( TWENTY_FIRST | ( TWENTY ( DASH | WHITE_SPACE )? FIRST ) )
                    {
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:387:5: ( TWENTY_FIRST | ( TWENTY ( DASH | WHITE_SPACE )? FIRST ) )
                    int alt78=2;
                    int LA78_0 = input.LA(1);

                    if ( (LA78_0==TWENTY_FIRST) ) {
                        alt78=1;
                    }
                    else if ( (LA78_0==TWENTY) ) {
                        alt78=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 78, 0, input);

                        throw nvae;
                    }
                    switch (alt78) {
                        case 1 :
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:387:6: TWENTY_FIRST
                            {
                            TWENTY_FIRST289=(Token)match(input,TWENTY_FIRST,FOLLOW_TWENTY_FIRST_in_spelled_first_to_thirty_first3543); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY_FIRST.add(TWENTY_FIRST289);


                            }
                            break;
                        case 2 :
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:387:23: ( TWENTY ( DASH | WHITE_SPACE )? FIRST )
                            {
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:387:23: ( TWENTY ( DASH | WHITE_SPACE )? FIRST )
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:387:24: TWENTY ( DASH | WHITE_SPACE )? FIRST
                            {
                            TWENTY290=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_first_to_thirty_first3550); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY290);

                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:387:31: ( DASH | WHITE_SPACE )?
                            int alt77=3;
                            int LA77_0 = input.LA(1);

                            if ( (LA77_0==DASH) ) {
                                alt77=1;
                            }
                            else if ( (LA77_0==WHITE_SPACE) ) {
                                alt77=2;
                            }
                            switch (alt77) {
                                case 1 :
                                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:387:32: DASH
                                    {
                                    DASH291=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_first_to_thirty_first3553); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_DASH.add(DASH291);


                                    }
                                    break;
                                case 2 :
                                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:387:39: WHITE_SPACE
                                    {
                                    WHITE_SPACE292=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_spelled_first_to_thirty_first3557); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE292);


                                    }
                                    break;

                            }

                            FIRST293=(Token)match(input,FIRST,FOLLOW_FIRST_in_spelled_first_to_thirty_first3561); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_FIRST.add(FIRST293);


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
                    // 387:63: -> INT[\"21\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "21"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 22 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:388:5: ( TWENTY_SECOND | ( TWENTY ( DASH | WHITE_SPACE )? SECOND ) )
                    {
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:388:5: ( TWENTY_SECOND | ( TWENTY ( DASH | WHITE_SPACE )? SECOND ) )
                    int alt80=2;
                    int LA80_0 = input.LA(1);

                    if ( (LA80_0==TWENTY_SECOND) ) {
                        alt80=1;
                    }
                    else if ( (LA80_0==TWENTY) ) {
                        alt80=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 80, 0, input);

                        throw nvae;
                    }
                    switch (alt80) {
                        case 1 :
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:388:6: TWENTY_SECOND
                            {
                            TWENTY_SECOND294=(Token)match(input,TWENTY_SECOND,FOLLOW_TWENTY_SECOND_in_spelled_first_to_thirty_first3577); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY_SECOND.add(TWENTY_SECOND294);


                            }
                            break;
                        case 2 :
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:388:23: ( TWENTY ( DASH | WHITE_SPACE )? SECOND )
                            {
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:388:23: ( TWENTY ( DASH | WHITE_SPACE )? SECOND )
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:388:24: TWENTY ( DASH | WHITE_SPACE )? SECOND
                            {
                            TWENTY295=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_first_to_thirty_first3583); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY295);

                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:388:31: ( DASH | WHITE_SPACE )?
                            int alt79=3;
                            int LA79_0 = input.LA(1);

                            if ( (LA79_0==DASH) ) {
                                alt79=1;
                            }
                            else if ( (LA79_0==WHITE_SPACE) ) {
                                alt79=2;
                            }
                            switch (alt79) {
                                case 1 :
                                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:388:32: DASH
                                    {
                                    DASH296=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_first_to_thirty_first3586); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_DASH.add(DASH296);


                                    }
                                    break;
                                case 2 :
                                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:388:39: WHITE_SPACE
                                    {
                                    WHITE_SPACE297=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_spelled_first_to_thirty_first3590); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE297);


                                    }
                                    break;

                            }

                            SECOND298=(Token)match(input,SECOND,FOLLOW_SECOND_in_spelled_first_to_thirty_first3594); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_SECOND.add(SECOND298);


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
                    // 388:63: -> INT[\"22\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "22"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 23 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:389:5: ( TWENTY_THIRD | ( TWENTY ( DASH | WHITE_SPACE )? THIRD ) )
                    {
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:389:5: ( TWENTY_THIRD | ( TWENTY ( DASH | WHITE_SPACE )? THIRD ) )
                    int alt82=2;
                    int LA82_0 = input.LA(1);

                    if ( (LA82_0==TWENTY_THIRD) ) {
                        alt82=1;
                    }
                    else if ( (LA82_0==TWENTY) ) {
                        alt82=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 82, 0, input);

                        throw nvae;
                    }
                    switch (alt82) {
                        case 1 :
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:389:6: TWENTY_THIRD
                            {
                            TWENTY_THIRD299=(Token)match(input,TWENTY_THIRD,FOLLOW_TWENTY_THIRD_in_spelled_first_to_thirty_first3609); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY_THIRD.add(TWENTY_THIRD299);


                            }
                            break;
                        case 2 :
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:389:23: ( TWENTY ( DASH | WHITE_SPACE )? THIRD )
                            {
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:389:23: ( TWENTY ( DASH | WHITE_SPACE )? THIRD )
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:389:24: TWENTY ( DASH | WHITE_SPACE )? THIRD
                            {
                            TWENTY300=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_first_to_thirty_first3616); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY300);

                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:389:31: ( DASH | WHITE_SPACE )?
                            int alt81=3;
                            int LA81_0 = input.LA(1);

                            if ( (LA81_0==DASH) ) {
                                alt81=1;
                            }
                            else if ( (LA81_0==WHITE_SPACE) ) {
                                alt81=2;
                            }
                            switch (alt81) {
                                case 1 :
                                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:389:32: DASH
                                    {
                                    DASH301=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_first_to_thirty_first3619); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_DASH.add(DASH301);


                                    }
                                    break;
                                case 2 :
                                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:389:39: WHITE_SPACE
                                    {
                                    WHITE_SPACE302=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_spelled_first_to_thirty_first3623); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE302);


                                    }
                                    break;

                            }

                            THIRD303=(Token)match(input,THIRD,FOLLOW_THIRD_in_spelled_first_to_thirty_first3627); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_THIRD.add(THIRD303);


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
                    // 389:63: -> INT[\"23\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "23"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 24 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:390:5: ( TWENTY_FOURTH | ( TWENTY ( DASH | WHITE_SPACE )? FOURTH ) )
                    {
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:390:5: ( TWENTY_FOURTH | ( TWENTY ( DASH | WHITE_SPACE )? FOURTH ) )
                    int alt84=2;
                    int LA84_0 = input.LA(1);

                    if ( (LA84_0==TWENTY_FOURTH) ) {
                        alt84=1;
                    }
                    else if ( (LA84_0==TWENTY) ) {
                        alt84=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 84, 0, input);

                        throw nvae;
                    }
                    switch (alt84) {
                        case 1 :
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:390:6: TWENTY_FOURTH
                            {
                            TWENTY_FOURTH304=(Token)match(input,TWENTY_FOURTH,FOLLOW_TWENTY_FOURTH_in_spelled_first_to_thirty_first3643); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY_FOURTH.add(TWENTY_FOURTH304);


                            }
                            break;
                        case 2 :
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:390:23: ( TWENTY ( DASH | WHITE_SPACE )? FOURTH )
                            {
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:390:23: ( TWENTY ( DASH | WHITE_SPACE )? FOURTH )
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:390:24: TWENTY ( DASH | WHITE_SPACE )? FOURTH
                            {
                            TWENTY305=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_first_to_thirty_first3649); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY305);

                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:390:31: ( DASH | WHITE_SPACE )?
                            int alt83=3;
                            int LA83_0 = input.LA(1);

                            if ( (LA83_0==DASH) ) {
                                alt83=1;
                            }
                            else if ( (LA83_0==WHITE_SPACE) ) {
                                alt83=2;
                            }
                            switch (alt83) {
                                case 1 :
                                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:390:32: DASH
                                    {
                                    DASH306=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_first_to_thirty_first3652); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_DASH.add(DASH306);


                                    }
                                    break;
                                case 2 :
                                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:390:39: WHITE_SPACE
                                    {
                                    WHITE_SPACE307=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_spelled_first_to_thirty_first3656); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE307);


                                    }
                                    break;

                            }

                            FOURTH308=(Token)match(input,FOURTH,FOLLOW_FOURTH_in_spelled_first_to_thirty_first3660); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_FOURTH.add(FOURTH308);


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
                    // 390:63: -> INT[\"24\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "24"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 25 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:391:5: ( TWENTY_FIFTH | ( TWENTY ( DASH | WHITE_SPACE )? FIFTH ) )
                    {
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:391:5: ( TWENTY_FIFTH | ( TWENTY ( DASH | WHITE_SPACE )? FIFTH ) )
                    int alt86=2;
                    int LA86_0 = input.LA(1);

                    if ( (LA86_0==TWENTY_FIFTH) ) {
                        alt86=1;
                    }
                    else if ( (LA86_0==TWENTY) ) {
                        alt86=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 86, 0, input);

                        throw nvae;
                    }
                    switch (alt86) {
                        case 1 :
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:391:6: TWENTY_FIFTH
                            {
                            TWENTY_FIFTH309=(Token)match(input,TWENTY_FIFTH,FOLLOW_TWENTY_FIFTH_in_spelled_first_to_thirty_first3675); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY_FIFTH.add(TWENTY_FIFTH309);


                            }
                            break;
                        case 2 :
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:391:23: ( TWENTY ( DASH | WHITE_SPACE )? FIFTH )
                            {
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:391:23: ( TWENTY ( DASH | WHITE_SPACE )? FIFTH )
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:391:24: TWENTY ( DASH | WHITE_SPACE )? FIFTH
                            {
                            TWENTY310=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_first_to_thirty_first3682); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY310);

                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:391:31: ( DASH | WHITE_SPACE )?
                            int alt85=3;
                            int LA85_0 = input.LA(1);

                            if ( (LA85_0==DASH) ) {
                                alt85=1;
                            }
                            else if ( (LA85_0==WHITE_SPACE) ) {
                                alt85=2;
                            }
                            switch (alt85) {
                                case 1 :
                                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:391:32: DASH
                                    {
                                    DASH311=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_first_to_thirty_first3685); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_DASH.add(DASH311);


                                    }
                                    break;
                                case 2 :
                                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:391:39: WHITE_SPACE
                                    {
                                    WHITE_SPACE312=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_spelled_first_to_thirty_first3689); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE312);


                                    }
                                    break;

                            }

                            FIFTH313=(Token)match(input,FIFTH,FOLLOW_FIFTH_in_spelled_first_to_thirty_first3693); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_FIFTH.add(FIFTH313);


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
                    // 391:63: -> INT[\"25\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "25"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 26 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:392:5: ( TWENTY_SIXTH | ( TWENTY ( DASH | WHITE_SPACE )? SIXTH ) )
                    {
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:392:5: ( TWENTY_SIXTH | ( TWENTY ( DASH | WHITE_SPACE )? SIXTH ) )
                    int alt88=2;
                    int LA88_0 = input.LA(1);

                    if ( (LA88_0==TWENTY_SIXTH) ) {
                        alt88=1;
                    }
                    else if ( (LA88_0==TWENTY) ) {
                        alt88=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 88, 0, input);

                        throw nvae;
                    }
                    switch (alt88) {
                        case 1 :
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:392:6: TWENTY_SIXTH
                            {
                            TWENTY_SIXTH314=(Token)match(input,TWENTY_SIXTH,FOLLOW_TWENTY_SIXTH_in_spelled_first_to_thirty_first3709); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY_SIXTH.add(TWENTY_SIXTH314);


                            }
                            break;
                        case 2 :
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:392:23: ( TWENTY ( DASH | WHITE_SPACE )? SIXTH )
                            {
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:392:23: ( TWENTY ( DASH | WHITE_SPACE )? SIXTH )
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:392:24: TWENTY ( DASH | WHITE_SPACE )? SIXTH
                            {
                            TWENTY315=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_first_to_thirty_first3716); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY315);

                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:392:31: ( DASH | WHITE_SPACE )?
                            int alt87=3;
                            int LA87_0 = input.LA(1);

                            if ( (LA87_0==DASH) ) {
                                alt87=1;
                            }
                            else if ( (LA87_0==WHITE_SPACE) ) {
                                alt87=2;
                            }
                            switch (alt87) {
                                case 1 :
                                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:392:32: DASH
                                    {
                                    DASH316=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_first_to_thirty_first3719); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_DASH.add(DASH316);


                                    }
                                    break;
                                case 2 :
                                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:392:39: WHITE_SPACE
                                    {
                                    WHITE_SPACE317=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_spelled_first_to_thirty_first3723); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE317);


                                    }
                                    break;

                            }

                            SIXTH318=(Token)match(input,SIXTH,FOLLOW_SIXTH_in_spelled_first_to_thirty_first3727); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_SIXTH.add(SIXTH318);


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
                    // 392:63: -> INT[\"26\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "26"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 27 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:393:5: ( TWENTY_SEVENTH | ( TWENTY ( DASH | WHITE_SPACE )? SEVENTH ) )
                    {
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:393:5: ( TWENTY_SEVENTH | ( TWENTY ( DASH | WHITE_SPACE )? SEVENTH ) )
                    int alt90=2;
                    int LA90_0 = input.LA(1);

                    if ( (LA90_0==TWENTY_SEVENTH) ) {
                        alt90=1;
                    }
                    else if ( (LA90_0==TWENTY) ) {
                        alt90=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 90, 0, input);

                        throw nvae;
                    }
                    switch (alt90) {
                        case 1 :
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:393:6: TWENTY_SEVENTH
                            {
                            TWENTY_SEVENTH319=(Token)match(input,TWENTY_SEVENTH,FOLLOW_TWENTY_SEVENTH_in_spelled_first_to_thirty_first3743); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY_SEVENTH.add(TWENTY_SEVENTH319);


                            }
                            break;
                        case 2 :
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:393:23: ( TWENTY ( DASH | WHITE_SPACE )? SEVENTH )
                            {
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:393:23: ( TWENTY ( DASH | WHITE_SPACE )? SEVENTH )
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:393:24: TWENTY ( DASH | WHITE_SPACE )? SEVENTH
                            {
                            TWENTY320=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_first_to_thirty_first3748); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY320);

                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:393:31: ( DASH | WHITE_SPACE )?
                            int alt89=3;
                            int LA89_0 = input.LA(1);

                            if ( (LA89_0==DASH) ) {
                                alt89=1;
                            }
                            else if ( (LA89_0==WHITE_SPACE) ) {
                                alt89=2;
                            }
                            switch (alt89) {
                                case 1 :
                                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:393:32: DASH
                                    {
                                    DASH321=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_first_to_thirty_first3751); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_DASH.add(DASH321);


                                    }
                                    break;
                                case 2 :
                                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:393:39: WHITE_SPACE
                                    {
                                    WHITE_SPACE322=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_spelled_first_to_thirty_first3755); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE322);


                                    }
                                    break;

                            }

                            SEVENTH323=(Token)match(input,SEVENTH,FOLLOW_SEVENTH_in_spelled_first_to_thirty_first3759); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_SEVENTH.add(SEVENTH323);


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
                    // 393:63: -> INT[\"27\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "27"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 28 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:394:5: ( TWENTY_EIGHTH | ( TWENTY ( DASH | WHITE_SPACE )? EIGHTH ) )
                    {
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:394:5: ( TWENTY_EIGHTH | ( TWENTY ( DASH | WHITE_SPACE )? EIGHTH ) )
                    int alt92=2;
                    int LA92_0 = input.LA(1);

                    if ( (LA92_0==TWENTY_EIGHTH) ) {
                        alt92=1;
                    }
                    else if ( (LA92_0==TWENTY) ) {
                        alt92=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 92, 0, input);

                        throw nvae;
                    }
                    switch (alt92) {
                        case 1 :
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:394:6: TWENTY_EIGHTH
                            {
                            TWENTY_EIGHTH324=(Token)match(input,TWENTY_EIGHTH,FOLLOW_TWENTY_EIGHTH_in_spelled_first_to_thirty_first3773); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY_EIGHTH.add(TWENTY_EIGHTH324);


                            }
                            break;
                        case 2 :
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:394:23: ( TWENTY ( DASH | WHITE_SPACE )? EIGHTH )
                            {
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:394:23: ( TWENTY ( DASH | WHITE_SPACE )? EIGHTH )
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:394:24: TWENTY ( DASH | WHITE_SPACE )? EIGHTH
                            {
                            TWENTY325=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_first_to_thirty_first3779); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY325);

                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:394:31: ( DASH | WHITE_SPACE )?
                            int alt91=3;
                            int LA91_0 = input.LA(1);

                            if ( (LA91_0==DASH) ) {
                                alt91=1;
                            }
                            else if ( (LA91_0==WHITE_SPACE) ) {
                                alt91=2;
                            }
                            switch (alt91) {
                                case 1 :
                                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:394:32: DASH
                                    {
                                    DASH326=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_first_to_thirty_first3782); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_DASH.add(DASH326);


                                    }
                                    break;
                                case 2 :
                                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:394:39: WHITE_SPACE
                                    {
                                    WHITE_SPACE327=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_spelled_first_to_thirty_first3786); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE327);


                                    }
                                    break;

                            }

                            EIGHTH328=(Token)match(input,EIGHTH,FOLLOW_EIGHTH_in_spelled_first_to_thirty_first3790); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_EIGHTH.add(EIGHTH328);


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
                    // 394:63: -> INT[\"28\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "28"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 29 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:395:5: ( TWENTY_NINTH | ( TWENTY ( DASH | WHITE_SPACE )? NINTH ) )
                    {
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:395:5: ( TWENTY_NINTH | ( TWENTY ( DASH | WHITE_SPACE )? NINTH ) )
                    int alt94=2;
                    int LA94_0 = input.LA(1);

                    if ( (LA94_0==TWENTY_NINTH) ) {
                        alt94=1;
                    }
                    else if ( (LA94_0==TWENTY) ) {
                        alt94=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 94, 0, input);

                        throw nvae;
                    }
                    switch (alt94) {
                        case 1 :
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:395:6: TWENTY_NINTH
                            {
                            TWENTY_NINTH329=(Token)match(input,TWENTY_NINTH,FOLLOW_TWENTY_NINTH_in_spelled_first_to_thirty_first3805); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY_NINTH.add(TWENTY_NINTH329);


                            }
                            break;
                        case 2 :
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:395:23: ( TWENTY ( DASH | WHITE_SPACE )? NINTH )
                            {
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:395:23: ( TWENTY ( DASH | WHITE_SPACE )? NINTH )
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:395:24: TWENTY ( DASH | WHITE_SPACE )? NINTH
                            {
                            TWENTY330=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_first_to_thirty_first3812); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY330);

                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:395:31: ( DASH | WHITE_SPACE )?
                            int alt93=3;
                            int LA93_0 = input.LA(1);

                            if ( (LA93_0==DASH) ) {
                                alt93=1;
                            }
                            else if ( (LA93_0==WHITE_SPACE) ) {
                                alt93=2;
                            }
                            switch (alt93) {
                                case 1 :
                                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:395:32: DASH
                                    {
                                    DASH331=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_first_to_thirty_first3815); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_DASH.add(DASH331);


                                    }
                                    break;
                                case 2 :
                                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:395:39: WHITE_SPACE
                                    {
                                    WHITE_SPACE332=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_spelled_first_to_thirty_first3819); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE332);


                                    }
                                    break;

                            }

                            NINTH333=(Token)match(input,NINTH,FOLLOW_NINTH_in_spelled_first_to_thirty_first3823); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NINTH.add(NINTH333);


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
                    // 395:63: -> INT[\"29\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "29"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 30 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:396:5: THIRTIETH
                    {
                    THIRTIETH334=(Token)match(input,THIRTIETH,FOLLOW_THIRTIETH_in_spelled_first_to_thirty_first3838); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THIRTIETH.add(THIRTIETH334);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 396:63: -> INT[\"30\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "30"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 31 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:397:5: ( THIRTY_FIRST | ( THIRTY ( DASH | WHITE_SPACE )? FIRST ) )
                    {
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:397:5: ( THIRTY_FIRST | ( THIRTY ( DASH | WHITE_SPACE )? FIRST ) )
                    int alt96=2;
                    int LA96_0 = input.LA(1);

                    if ( (LA96_0==THIRTY_FIRST) ) {
                        alt96=1;
                    }
                    else if ( (LA96_0==THIRTY) ) {
                        alt96=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 96, 0, input);

                        throw nvae;
                    }
                    switch (alt96) {
                        case 1 :
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:397:6: THIRTY_FIRST
                            {
                            THIRTY_FIRST335=(Token)match(input,THIRTY_FIRST,FOLLOW_THIRTY_FIRST_in_spelled_first_to_thirty_first3898); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_THIRTY_FIRST.add(THIRTY_FIRST335);


                            }
                            break;
                        case 2 :
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:397:23: ( THIRTY ( DASH | WHITE_SPACE )? FIRST )
                            {
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:397:23: ( THIRTY ( DASH | WHITE_SPACE )? FIRST )
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:397:24: THIRTY ( DASH | WHITE_SPACE )? FIRST
                            {
                            THIRTY336=(Token)match(input,THIRTY,FOLLOW_THIRTY_in_spelled_first_to_thirty_first3905); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_THIRTY.add(THIRTY336);

                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:397:31: ( DASH | WHITE_SPACE )?
                            int alt95=3;
                            int LA95_0 = input.LA(1);

                            if ( (LA95_0==DASH) ) {
                                alt95=1;
                            }
                            else if ( (LA95_0==WHITE_SPACE) ) {
                                alt95=2;
                            }
                            switch (alt95) {
                                case 1 :
                                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:397:32: DASH
                                    {
                                    DASH337=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_first_to_thirty_first3908); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_DASH.add(DASH337);


                                    }
                                    break;
                                case 2 :
                                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:397:39: WHITE_SPACE
                                    {
                                    WHITE_SPACE338=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_spelled_first_to_thirty_first3912); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE338);


                                    }
                                    break;

                            }

                            FIRST339=(Token)match(input,FIRST,FOLLOW_FIRST_in_spelled_first_to_thirty_first3916); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_FIRST.add(FIRST339);


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
                    // 397:63: -> INT[\"31\"]
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
        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:31:7: ( ( date_time WHITE_SPACE text )+ )
        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:31:8: ( date_time WHITE_SPACE text )+
        {
        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:31:8: ( date_time WHITE_SPACE text )+
        int cnt98=0;
        loop98:
        do {
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( ((LA98_0>=THE && LA98_0<=DAY)||(LA98_0>=JANUARY && LA98_0<=DECEMBER)||(LA98_0>=IN && LA98_0<=YEAR)||(LA98_0>=THIS && LA98_0<=UPCOMING)||(LA98_0>=WEEK && LA98_0<=YESTERDAY)||(LA98_0>=NOON && LA98_0<=THIRTY_FIRST)) ) {
                alt98=1;
            }


            switch (alt98) {
        	case 1 :
        	    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:31:9: date_time WHITE_SPACE text
        	    {
        	    pushFollow(FOLLOW_date_time_in_synpred1_Date140);
        	    date_time();

        	    state._fsp--;
        	    if (state.failed) return ;
        	    match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_synpred1_Date142); if (state.failed) return ;
        	    pushFollow(FOLLOW_text_in_synpred1_Date144);
        	    text();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    if ( cnt98 >= 1 ) break loop98;
        	    if (state.backtracking>0) {state.failed=true; return ;}
                    EarlyExitException eee =
                        new EarlyExitException(98, input);
                    throw eee;
            }
            cnt98++;
        } while (true);


        }
    }
    // $ANTLR end synpred1_Date

    // $ANTLR start synpred2_Date
    public final void synpred2_Date_fragment() throws RecognitionException {   
        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:32:9: ( ( text date_time ( WHITE_SPACE )? )+ )
        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:32:10: ( text date_time ( WHITE_SPACE )? )+
        {
        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:32:10: ( text date_time ( WHITE_SPACE )? )+
        int cnt100=0;
        loop100:
        do {
            int alt100=2;
            int LA100_0 = input.LA(1);

            if ( (LA100_0==STRING) ) {
                alt100=1;
            }


            switch (alt100) {
        	case 1 :
        	    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:32:11: text date_time ( WHITE_SPACE )?
        	    {
        	    pushFollow(FOLLOW_text_in_synpred2_Date168);
        	    text();

        	    state._fsp--;
        	    if (state.failed) return ;
        	    pushFollow(FOLLOW_date_time_in_synpred2_Date170);
        	    date_time();

        	    state._fsp--;
        	    if (state.failed) return ;
        	    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:32:26: ( WHITE_SPACE )?
        	    int alt99=2;
        	    int LA99_0 = input.LA(1);

        	    if ( (LA99_0==WHITE_SPACE) ) {
        	        alt99=1;
        	    }
        	    switch (alt99) {
        	        case 1 :
        	            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:32:26: WHITE_SPACE
        	            {
        	            match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_synpred2_Date172); if (state.failed) return ;

        	            }
        	            break;

        	    }


        	    }
        	    break;

        	default :
        	    if ( cnt100 >= 1 ) break loop100;
        	    if (state.backtracking>0) {state.failed=true; return ;}
                    EarlyExitException eee =
                        new EarlyExitException(100, input);
                    throw eee;
            }
            cnt100++;
        } while (true);


        }
    }
    // $ANTLR end synpred2_Date

    // $ANTLR start synpred3_Date
    public final void synpred3_Date_fragment() throws RecognitionException {   
        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:48:7: ( date ( date_time_separator time )? )
        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:48:8: date ( date_time_separator time )?
        {
        pushFollow(FOLLOW_date_in_synpred3_Date257);
        date();

        state._fsp--;
        if (state.failed) return ;
        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:48:13: ( date_time_separator time )?
        int alt101=2;
        int LA101_0 = input.LA(1);

        if ( (LA101_0==WHITE_SPACE||LA101_0==COMMA) ) {
            alt101=1;
        }
        switch (alt101) {
            case 1 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:48:14: date_time_separator time
                {
                pushFollow(FOLLOW_date_time_separator_in_synpred3_Date260);
                date_time_separator();

                state._fsp--;
                if (state.failed) return ;
                pushFollow(FOLLOW_time_in_synpred3_Date262);
                time();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        }
    }
    // $ANTLR end synpred3_Date

    // $ANTLR start synpred4_Date
    public final void synpred4_Date_fragment() throws RecognitionException {   
        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:66:5: ( relaxed_date )
        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:66:6: relaxed_date
        {
        pushFollow(FOLLOW_relaxed_date_in_synpred4_Date415);
        relaxed_date();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred4_Date

    // $ANTLR start synpred5_Date
    public final void synpred5_Date_fragment() throws RecognitionException {   
        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:94:7: ( ( THE WHITE_SPACE )? relaxed_day_of_month WHITE_SPACE ( OF WHITE_SPACE )? relaxed_month relaxed_year )
        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:94:8: ( THE WHITE_SPACE )? relaxed_day_of_month WHITE_SPACE ( OF WHITE_SPACE )? relaxed_month relaxed_year
        {
        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:94:8: ( THE WHITE_SPACE )?
        int alt102=2;
        int LA102_0 = input.LA(1);

        if ( (LA102_0==THE) ) {
            alt102=1;
        }
        switch (alt102) {
            case 1 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:94:9: THE WHITE_SPACE
                {
                match(input,THE,FOLLOW_THE_in_synpred5_Date621); if (state.failed) return ;
                match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_synpred5_Date623); if (state.failed) return ;

                }
                break;

        }

        pushFollow(FOLLOW_relaxed_day_of_month_in_synpred5_Date627);
        relaxed_day_of_month();

        state._fsp--;
        if (state.failed) return ;
        match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_synpred5_Date629); if (state.failed) return ;
        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:94:60: ( OF WHITE_SPACE )?
        int alt103=2;
        int LA103_0 = input.LA(1);

        if ( (LA103_0==OF) ) {
            alt103=1;
        }
        switch (alt103) {
            case 1 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:94:61: OF WHITE_SPACE
                {
                match(input,OF,FOLLOW_OF_in_synpred5_Date632); if (state.failed) return ;
                match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_synpred5_Date634); if (state.failed) return ;

                }
                break;

        }

        pushFollow(FOLLOW_relaxed_month_in_synpred5_Date638);
        relaxed_month();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_relaxed_year_in_synpred5_Date640);
        relaxed_year();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred5_Date

    // $ANTLR start synpred6_Date
    public final void synpred6_Date_fragment() throws RecognitionException {   
        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:97:9: ( relaxed_month WHITE_SPACE relaxed_day_of_month relaxed_year )
        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:97:10: relaxed_month WHITE_SPACE relaxed_day_of_month relaxed_year
        {
        pushFollow(FOLLOW_relaxed_month_in_synpred6_Date688);
        relaxed_month();

        state._fsp--;
        if (state.failed) return ;
        match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_synpred6_Date690); if (state.failed) return ;
        pushFollow(FOLLOW_relaxed_day_of_month_in_synpred6_Date692);
        relaxed_day_of_month();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_relaxed_year_in_synpred6_Date694);
        relaxed_year();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred6_Date

    // Delegated rules

    public final boolean synpred6_Date() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred6_Date_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
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
    public final boolean synpred5_Date() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_Date_fragment(); // can never throw exception
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
    public final boolean synpred4_Date() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_Date_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA3 dfa3 = new DFA3(this);
    protected DFA7 dfa7 = new DFA7(this);
    protected DFA16 dfa16 = new DFA16(this);
    protected DFA25 dfa25 = new DFA25(this);
    protected DFA29 dfa29 = new DFA29(this);
    protected DFA37 dfa37 = new DFA37(this);
    protected DFA76 dfa76 = new DFA76(this);
    protected DFA97 dfa97 = new DFA97(this);
    static final String DFA3_eotS =
        "\144\uffff";
    static final String DFA3_eofS =
        "\144\uffff";
    static final String DFA3_minS =
        "\1\24\140\0\3\uffff";
    static final String DFA3_maxS =
        "\1\u0086\140\0\3\uffff";
    static final String DFA3_acceptS =
        "\141\uffff\1\2\1\1\1\3";
    static final String DFA3_specialS =
        "\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1"+
        "\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32"+
        "\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\46\1\47"+
        "\1\50\1\51\1\52\1\53\1\54\1\55\1\56\1\57\1\60\1\61\1\62\1\63\1\64"+
        "\1\65\1\66\1\67\1\70\1\71\1\72\1\73\1\74\1\75\1\76\1\77\1\100\1"+
        "\101\1\102\1\103\1\104\1\105\1\106\1\107\1\110\1\111\1\112\1\113"+
        "\1\114\1\115\1\116\1\117\1\120\1\121\1\122\1\123\1\124\1\125\1\126"+
        "\1\127\1\130\1\131\1\132\1\133\1\134\1\135\1\136\1\137\1\140\3\uffff}>";
    static final String[] DFA3_transitionS = {
            "\1\141\4\uffff\1\1\1\127\3\uffff\1\72\1\73\1\74\1\75\1\76\1"+
            "\77\1\100\1\101\1\102\1\103\1\104\1\105\1\uffff\1\117\1\132"+
            "\2\uffff\1\111\1\112\1\113\1\114\1\115\1\116\3\uffff\1\130\1"+
            "\131\1\120\1\121\1\122\1\123\1\124\1\125\1\126\1\133\1\134\1"+
            "\135\5\uffff\1\137\1\140\1\136\1\106\1\2\1\3\1\4\1\5\1\107\1"+
            "\110\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1"+
            "\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1"+
            "\35\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\46\1\47\1\50\1"+
            "\51\1\52\1\53\1\54\1\55\1\56\1\57\1\60\1\61\1\62\1\63\1\64\1"+
            "\65\1\66\1\67\1\70\1\71",
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
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
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
            return "30:5: ( ( ( date_time WHITE_SPACE text )+ )=> ( date_time text )+ | ( ( text date_time ( WHITE_SPACE )? )+ )=> ( text date_time )+ | date_time )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA3_0 = input.LA(1);

                         
                        int index3_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA3_0==THE) ) {s = 1;}

                        else if ( (LA3_0==INT_1_TO_9) ) {s = 2;}

                        else if ( (LA3_0==INT_01_TO_12) ) {s = 3;}

                        else if ( (LA3_0==INT_13_TO_23) ) {s = 4;}

                        else if ( (LA3_0==INT_24_TO_31) ) {s = 5;}

                        else if ( (LA3_0==ONE) ) {s = 6;}

                        else if ( (LA3_0==TWO) ) {s = 7;}

                        else if ( (LA3_0==THREE) ) {s = 8;}

                        else if ( (LA3_0==FOUR) ) {s = 9;}

                        else if ( (LA3_0==FIVE) ) {s = 10;}

                        else if ( (LA3_0==SIX) ) {s = 11;}

                        else if ( (LA3_0==SEVEN) ) {s = 12;}

                        else if ( (LA3_0==EIGHT) ) {s = 13;}

                        else if ( (LA3_0==NINE) ) {s = 14;}

                        else if ( (LA3_0==TEN) ) {s = 15;}

                        else if ( (LA3_0==ELEVEN) ) {s = 16;}

                        else if ( (LA3_0==TWELVE) ) {s = 17;}

                        else if ( (LA3_0==THIRTEEN) ) {s = 18;}

                        else if ( (LA3_0==FOURTEEN) ) {s = 19;}

                        else if ( (LA3_0==FIFTEEN) ) {s = 20;}

                        else if ( (LA3_0==SIXTEEN) ) {s = 21;}

                        else if ( (LA3_0==SEVENTEEN) ) {s = 22;}

                        else if ( (LA3_0==EIGHTEEN) ) {s = 23;}

                        else if ( (LA3_0==NINETEEN) ) {s = 24;}

                        else if ( (LA3_0==TWENTY) ) {s = 25;}

                        else if ( (LA3_0==THIRTY) ) {s = 26;}

                        else if ( (LA3_0==FIRST) ) {s = 27;}

                        else if ( (LA3_0==SECOND) ) {s = 28;}

                        else if ( (LA3_0==THIRD) ) {s = 29;}

                        else if ( (LA3_0==FOURTH) ) {s = 30;}

                        else if ( (LA3_0==FIFTH) ) {s = 31;}

                        else if ( (LA3_0==SIXTH) ) {s = 32;}

                        else if ( (LA3_0==SEVENTH) ) {s = 33;}

                        else if ( (LA3_0==EIGHTH) ) {s = 34;}

                        else if ( (LA3_0==NINTH) ) {s = 35;}

                        else if ( (LA3_0==TENTH) ) {s = 36;}

                        else if ( (LA3_0==ELEVENTH) ) {s = 37;}

                        else if ( (LA3_0==TWELFTH) ) {s = 38;}

                        else if ( (LA3_0==THIRTEENTH) ) {s = 39;}

                        else if ( (LA3_0==FOURTEENTH) ) {s = 40;}

                        else if ( (LA3_0==FIFTEENTH) ) {s = 41;}

                        else if ( (LA3_0==SIXTEENTH) ) {s = 42;}

                        else if ( (LA3_0==SEVENTEENTH) ) {s = 43;}

                        else if ( (LA3_0==EIGHTEENTH) ) {s = 44;}

                        else if ( (LA3_0==NINETEENTH) ) {s = 45;}

                        else if ( (LA3_0==TWENTIETH) ) {s = 46;}

                        else if ( (LA3_0==TWENTY_FIRST) ) {s = 47;}

                        else if ( (LA3_0==TWENTY_SECOND) ) {s = 48;}

                        else if ( (LA3_0==TWENTY_THIRD) ) {s = 49;}

                        else if ( (LA3_0==TWENTY_FOURTH) ) {s = 50;}

                        else if ( (LA3_0==TWENTY_FIFTH) ) {s = 51;}

                        else if ( (LA3_0==TWENTY_SIXTH) ) {s = 52;}

                        else if ( (LA3_0==TWENTY_SEVENTH) ) {s = 53;}

                        else if ( (LA3_0==TWENTY_EIGHTH) ) {s = 54;}

                        else if ( (LA3_0==TWENTY_NINTH) ) {s = 55;}

                        else if ( (LA3_0==THIRTIETH) ) {s = 56;}

                        else if ( (LA3_0==THIRTY_FIRST) ) {s = 57;}

                        else if ( (LA3_0==JANUARY) ) {s = 58;}

                        else if ( (LA3_0==FEBRUARY) ) {s = 59;}

                        else if ( (LA3_0==MARCH) ) {s = 60;}

                        else if ( (LA3_0==APRIL) ) {s = 61;}

                        else if ( (LA3_0==MAY) ) {s = 62;}

                        else if ( (LA3_0==JUNE) ) {s = 63;}

                        else if ( (LA3_0==JULY) ) {s = 64;}

                        else if ( (LA3_0==AUGUST) ) {s = 65;}

                        else if ( (LA3_0==SEPTEMBER) ) {s = 66;}

                        else if ( (LA3_0==OCTOBER) ) {s = 67;}

                        else if ( (LA3_0==NOVEMBER) ) {s = 68;}

                        else if ( (LA3_0==DECEMBER) ) {s = 69;}

                        else if ( (LA3_0==INT_00) ) {s = 70;}

                        else if ( (LA3_0==INT_32_TO_59) ) {s = 71;}

                        else if ( (LA3_0==INT_60_TO_99) ) {s = 72;}

                        else if ( (LA3_0==THIS) ) {s = 73;}

                        else if ( (LA3_0==LAST) ) {s = 74;}

                        else if ( (LA3_0==NEXT) ) {s = 75;}

                        else if ( (LA3_0==PAST) ) {s = 76;}

                        else if ( (LA3_0==COMING) ) {s = 77;}

                        else if ( (LA3_0==UPCOMING) ) {s = 78;}

                        else if ( (LA3_0==IN) ) {s = 79;}

                        else if ( (LA3_0==SUNDAY) ) {s = 80;}

                        else if ( (LA3_0==MONDAY) ) {s = 81;}

                        else if ( (LA3_0==TUESDAY) ) {s = 82;}

                        else if ( (LA3_0==WEDNESDAY) ) {s = 83;}

                        else if ( (LA3_0==THURSDAY) ) {s = 84;}

                        else if ( (LA3_0==FRIDAY) ) {s = 85;}

                        else if ( (LA3_0==SATURDAY) ) {s = 86;}

                        else if ( (LA3_0==DAY) ) {s = 87;}

                        else if ( (LA3_0==WEEK) ) {s = 88;}

                        else if ( (LA3_0==MONTH) ) {s = 89;}

                        else if ( (LA3_0==YEAR) ) {s = 90;}

                        else if ( (LA3_0==TODAY) ) {s = 91;}

                        else if ( (LA3_0==TOMORROW) ) {s = 92;}

                        else if ( (LA3_0==YESTERDAY) ) {s = 93;}

                        else if ( (LA3_0==INT_0) ) {s = 94;}

                        else if ( (LA3_0==NOON) ) {s = 95;}

                        else if ( (LA3_0==MIDNIGHT) ) {s = 96;}

                        else if ( (LA3_0==STRING) && (synpred2_Date())) {s = 97;}

                         
                        input.seek(index3_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA3_1 = input.LA(1);

                         
                        int index3_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 98;}

                        else if ( (true) ) {s = 99;}

                         
                        input.seek(index3_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA3_2 = input.LA(1);

                         
                        int index3_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 98;}

                        else if ( (true) ) {s = 99;}

                         
                        input.seek(index3_2);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA3_3 = input.LA(1);

                         
                        int index3_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 98;}

                        else if ( (true) ) {s = 99;}

                         
                        input.seek(index3_3);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA3_4 = input.LA(1);

                         
                        int index3_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 98;}

                        else if ( (true) ) {s = 99;}

                         
                        input.seek(index3_4);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA3_5 = input.LA(1);

                         
                        int index3_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 98;}

                        else if ( (true) ) {s = 99;}

                         
                        input.seek(index3_5);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA3_6 = input.LA(1);

                         
                        int index3_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 98;}

                        else if ( (true) ) {s = 99;}

                         
                        input.seek(index3_6);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA3_7 = input.LA(1);

                         
                        int index3_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 98;}

                        else if ( (true) ) {s = 99;}

                         
                        input.seek(index3_7);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA3_8 = input.LA(1);

                         
                        int index3_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 98;}

                        else if ( (true) ) {s = 99;}

                         
                        input.seek(index3_8);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA3_9 = input.LA(1);

                         
                        int index3_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 98;}

                        else if ( (true) ) {s = 99;}

                         
                        input.seek(index3_9);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA3_10 = input.LA(1);

                         
                        int index3_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 98;}

                        else if ( (true) ) {s = 99;}

                         
                        input.seek(index3_10);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA3_11 = input.LA(1);

                         
                        int index3_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 98;}

                        else if ( (true) ) {s = 99;}

                         
                        input.seek(index3_11);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA3_12 = input.LA(1);

                         
                        int index3_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 98;}

                        else if ( (true) ) {s = 99;}

                         
                        input.seek(index3_12);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA3_13 = input.LA(1);

                         
                        int index3_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 98;}

                        else if ( (true) ) {s = 99;}

                         
                        input.seek(index3_13);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA3_14 = input.LA(1);

                         
                        int index3_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 98;}

                        else if ( (true) ) {s = 99;}

                         
                        input.seek(index3_14);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA3_15 = input.LA(1);

                         
                        int index3_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 98;}

                        else if ( (true) ) {s = 99;}

                         
                        input.seek(index3_15);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA3_16 = input.LA(1);

                         
                        int index3_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 98;}

                        else if ( (true) ) {s = 99;}

                         
                        input.seek(index3_16);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA3_17 = input.LA(1);

                         
                        int index3_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 98;}

                        else if ( (true) ) {s = 99;}

                         
                        input.seek(index3_17);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA3_18 = input.LA(1);

                         
                        int index3_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 98;}

                        else if ( (true) ) {s = 99;}

                         
                        input.seek(index3_18);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA3_19 = input.LA(1);

                         
                        int index3_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 98;}

                        else if ( (true) ) {s = 99;}

                         
                        input.seek(index3_19);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA3_20 = input.LA(1);

                         
                        int index3_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 98;}

                        else if ( (true) ) {s = 99;}

                         
                        input.seek(index3_20);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA3_21 = input.LA(1);

                         
                        int index3_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 98;}

                        else if ( (true) ) {s = 99;}

                         
                        input.seek(index3_21);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA3_22 = input.LA(1);

                         
                        int index3_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 98;}

                        else if ( (true) ) {s = 99;}

                         
                        input.seek(index3_22);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA3_23 = input.LA(1);

                         
                        int index3_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 98;}

                        else if ( (true) ) {s = 99;}

                         
                        input.seek(index3_23);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA3_24 = input.LA(1);

                         
                        int index3_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 98;}

                        else if ( (true) ) {s = 99;}

                         
                        input.seek(index3_24);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA3_25 = input.LA(1);

                         
                        int index3_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 98;}

                        else if ( (true) ) {s = 99;}

                         
                        input.seek(index3_25);
                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA3_26 = input.LA(1);

                         
                        int index3_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 98;}

                        else if ( (true) ) {s = 99;}

                         
                        input.seek(index3_26);
                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA3_27 = input.LA(1);

                         
                        int index3_27 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 98;}

                        else if ( (true) ) {s = 99;}

                         
                        input.seek(index3_27);
                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA3_28 = input.LA(1);

                         
                        int index3_28 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 98;}

                        else if ( (true) ) {s = 99;}

                         
                        input.seek(index3_28);
                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA3_29 = input.LA(1);

                         
                        int index3_29 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 98;}

                        else if ( (true) ) {s = 99;}

                         
                        input.seek(index3_29);
                        if ( s>=0 ) return s;
                        break;
                    case 30 : 
                        int LA3_30 = input.LA(1);

                         
                        int index3_30 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 98;}

                        else if ( (true) ) {s = 99;}

                         
                        input.seek(index3_30);
                        if ( s>=0 ) return s;
                        break;
                    case 31 : 
                        int LA3_31 = input.LA(1);

                         
                        int index3_31 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 98;}

                        else if ( (true) ) {s = 99;}

                         
                        input.seek(index3_31);
                        if ( s>=0 ) return s;
                        break;
                    case 32 : 
                        int LA3_32 = input.LA(1);

                         
                        int index3_32 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 98;}

                        else if ( (true) ) {s = 99;}

                         
                        input.seek(index3_32);
                        if ( s>=0 ) return s;
                        break;
                    case 33 : 
                        int LA3_33 = input.LA(1);

                         
                        int index3_33 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 98;}

                        else if ( (true) ) {s = 99;}

                         
                        input.seek(index3_33);
                        if ( s>=0 ) return s;
                        break;
                    case 34 : 
                        int LA3_34 = input.LA(1);

                         
                        int index3_34 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 98;}

                        else if ( (true) ) {s = 99;}

                         
                        input.seek(index3_34);
                        if ( s>=0 ) return s;
                        break;
                    case 35 : 
                        int LA3_35 = input.LA(1);

                         
                        int index3_35 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 98;}

                        else if ( (true) ) {s = 99;}

                         
                        input.seek(index3_35);
                        if ( s>=0 ) return s;
                        break;
                    case 36 : 
                        int LA3_36 = input.LA(1);

                         
                        int index3_36 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 98;}

                        else if ( (true) ) {s = 99;}

                         
                        input.seek(index3_36);
                        if ( s>=0 ) return s;
                        break;
                    case 37 : 
                        int LA3_37 = input.LA(1);

                         
                        int index3_37 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 98;}

                        else if ( (true) ) {s = 99;}

                         
                        input.seek(index3_37);
                        if ( s>=0 ) return s;
                        break;
                    case 38 : 
                        int LA3_38 = input.LA(1);

                         
                        int index3_38 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 98;}

                        else if ( (true) ) {s = 99;}

                         
                        input.seek(index3_38);
                        if ( s>=0 ) return s;
                        break;
                    case 39 : 
                        int LA3_39 = input.LA(1);

                         
                        int index3_39 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 98;}

                        else if ( (true) ) {s = 99;}

                         
                        input.seek(index3_39);
                        if ( s>=0 ) return s;
                        break;
                    case 40 : 
                        int LA3_40 = input.LA(1);

                         
                        int index3_40 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 98;}

                        else if ( (true) ) {s = 99;}

                         
                        input.seek(index3_40);
                        if ( s>=0 ) return s;
                        break;
                    case 41 : 
                        int LA3_41 = input.LA(1);

                         
                        int index3_41 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 98;}

                        else if ( (true) ) {s = 99;}

                         
                        input.seek(index3_41);
                        if ( s>=0 ) return s;
                        break;
                    case 42 : 
                        int LA3_42 = input.LA(1);

                         
                        int index3_42 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 98;}

                        else if ( (true) ) {s = 99;}

                         
                        input.seek(index3_42);
                        if ( s>=0 ) return s;
                        break;
                    case 43 : 
                        int LA3_43 = input.LA(1);

                         
                        int index3_43 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 98;}

                        else if ( (true) ) {s = 99;}

                         
                        input.seek(index3_43);
                        if ( s>=0 ) return s;
                        break;
                    case 44 : 
                        int LA3_44 = input.LA(1);

                         
                        int index3_44 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 98;}

                        else if ( (true) ) {s = 99;}

                         
                        input.seek(index3_44);
                        if ( s>=0 ) return s;
                        break;
                    case 45 : 
                        int LA3_45 = input.LA(1);

                         
                        int index3_45 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 98;}

                        else if ( (true) ) {s = 99;}

                         
                        input.seek(index3_45);
                        if ( s>=0 ) return s;
                        break;
                    case 46 : 
                        int LA3_46 = input.LA(1);

                         
                        int index3_46 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 98;}

                        else if ( (true) ) {s = 99;}

                         
                        input.seek(index3_46);
                        if ( s>=0 ) return s;
                        break;
                    case 47 : 
                        int LA3_47 = input.LA(1);

                         
                        int index3_47 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 98;}

                        else if ( (true) ) {s = 99;}

                         
                        input.seek(index3_47);
                        if ( s>=0 ) return s;
                        break;
                    case 48 : 
                        int LA3_48 = input.LA(1);

                         
                        int index3_48 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 98;}

                        else if ( (true) ) {s = 99;}

                         
                        input.seek(index3_48);
                        if ( s>=0 ) return s;
                        break;
                    case 49 : 
                        int LA3_49 = input.LA(1);

                         
                        int index3_49 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 98;}

                        else if ( (true) ) {s = 99;}

                         
                        input.seek(index3_49);
                        if ( s>=0 ) return s;
                        break;
                    case 50 : 
                        int LA3_50 = input.LA(1);

                         
                        int index3_50 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 98;}

                        else if ( (true) ) {s = 99;}

                         
                        input.seek(index3_50);
                        if ( s>=0 ) return s;
                        break;
                    case 51 : 
                        int LA3_51 = input.LA(1);

                         
                        int index3_51 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 98;}

                        else if ( (true) ) {s = 99;}

                         
                        input.seek(index3_51);
                        if ( s>=0 ) return s;
                        break;
                    case 52 : 
                        int LA3_52 = input.LA(1);

                         
                        int index3_52 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 98;}

                        else if ( (true) ) {s = 99;}

                         
                        input.seek(index3_52);
                        if ( s>=0 ) return s;
                        break;
                    case 53 : 
                        int LA3_53 = input.LA(1);

                         
                        int index3_53 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 98;}

                        else if ( (true) ) {s = 99;}

                         
                        input.seek(index3_53);
                        if ( s>=0 ) return s;
                        break;
                    case 54 : 
                        int LA3_54 = input.LA(1);

                         
                        int index3_54 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 98;}

                        else if ( (true) ) {s = 99;}

                         
                        input.seek(index3_54);
                        if ( s>=0 ) return s;
                        break;
                    case 55 : 
                        int LA3_55 = input.LA(1);

                         
                        int index3_55 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 98;}

                        else if ( (true) ) {s = 99;}

                         
                        input.seek(index3_55);
                        if ( s>=0 ) return s;
                        break;
                    case 56 : 
                        int LA3_56 = input.LA(1);

                         
                        int index3_56 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 98;}

                        else if ( (true) ) {s = 99;}

                         
                        input.seek(index3_56);
                        if ( s>=0 ) return s;
                        break;
                    case 57 : 
                        int LA3_57 = input.LA(1);

                         
                        int index3_57 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 98;}

                        else if ( (true) ) {s = 99;}

                         
                        input.seek(index3_57);
                        if ( s>=0 ) return s;
                        break;
                    case 58 : 
                        int LA3_58 = input.LA(1);

                         
                        int index3_58 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 98;}

                        else if ( (true) ) {s = 99;}

                         
                        input.seek(index3_58);
                        if ( s>=0 ) return s;
                        break;
                    case 59 : 
                        int LA3_59 = input.LA(1);

                         
                        int index3_59 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 98;}

                        else if ( (true) ) {s = 99;}

                         
                        input.seek(index3_59);
                        if ( s>=0 ) return s;
                        break;
                    case 60 : 
                        int LA3_60 = input.LA(1);

                         
                        int index3_60 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 98;}

                        else if ( (true) ) {s = 99;}

                         
                        input.seek(index3_60);
                        if ( s>=0 ) return s;
                        break;
                    case 61 : 
                        int LA3_61 = input.LA(1);

                         
                        int index3_61 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 98;}

                        else if ( (true) ) {s = 99;}

                         
                        input.seek(index3_61);
                        if ( s>=0 ) return s;
                        break;
                    case 62 : 
                        int LA3_62 = input.LA(1);

                         
                        int index3_62 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 98;}

                        else if ( (true) ) {s = 99;}

                         
                        input.seek(index3_62);
                        if ( s>=0 ) return s;
                        break;
                    case 63 : 
                        int LA3_63 = input.LA(1);

                         
                        int index3_63 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 98;}

                        else if ( (true) ) {s = 99;}

                         
                        input.seek(index3_63);
                        if ( s>=0 ) return s;
                        break;
                    case 64 : 
                        int LA3_64 = input.LA(1);

                         
                        int index3_64 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 98;}

                        else if ( (true) ) {s = 99;}

                         
                        input.seek(index3_64);
                        if ( s>=0 ) return s;
                        break;
                    case 65 : 
                        int LA3_65 = input.LA(1);

                         
                        int index3_65 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 98;}

                        else if ( (true) ) {s = 99;}

                         
                        input.seek(index3_65);
                        if ( s>=0 ) return s;
                        break;
                    case 66 : 
                        int LA3_66 = input.LA(1);

                         
                        int index3_66 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 98;}

                        else if ( (true) ) {s = 99;}

                         
                        input.seek(index3_66);
                        if ( s>=0 ) return s;
                        break;
                    case 67 : 
                        int LA3_67 = input.LA(1);

                         
                        int index3_67 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 98;}

                        else if ( (true) ) {s = 99;}

                         
                        input.seek(index3_67);
                        if ( s>=0 ) return s;
                        break;
                    case 68 : 
                        int LA3_68 = input.LA(1);

                         
                        int index3_68 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 98;}

                        else if ( (true) ) {s = 99;}

                         
                        input.seek(index3_68);
                        if ( s>=0 ) return s;
                        break;
                    case 69 : 
                        int LA3_69 = input.LA(1);

                         
                        int index3_69 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 98;}

                        else if ( (true) ) {s = 99;}

                         
                        input.seek(index3_69);
                        if ( s>=0 ) return s;
                        break;
                    case 70 : 
                        int LA3_70 = input.LA(1);

                         
                        int index3_70 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 98;}

                        else if ( (true) ) {s = 99;}

                         
                        input.seek(index3_70);
                        if ( s>=0 ) return s;
                        break;
                    case 71 : 
                        int LA3_71 = input.LA(1);

                         
                        int index3_71 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 98;}

                        else if ( (true) ) {s = 99;}

                         
                        input.seek(index3_71);
                        if ( s>=0 ) return s;
                        break;
                    case 72 : 
                        int LA3_72 = input.LA(1);

                         
                        int index3_72 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 98;}

                        else if ( (true) ) {s = 99;}

                         
                        input.seek(index3_72);
                        if ( s>=0 ) return s;
                        break;
                    case 73 : 
                        int LA3_73 = input.LA(1);

                         
                        int index3_73 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 98;}

                        else if ( (true) ) {s = 99;}

                         
                        input.seek(index3_73);
                        if ( s>=0 ) return s;
                        break;
                    case 74 : 
                        int LA3_74 = input.LA(1);

                         
                        int index3_74 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 98;}

                        else if ( (true) ) {s = 99;}

                         
                        input.seek(index3_74);
                        if ( s>=0 ) return s;
                        break;
                    case 75 : 
                        int LA3_75 = input.LA(1);

                         
                        int index3_75 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 98;}

                        else if ( (true) ) {s = 99;}

                         
                        input.seek(index3_75);
                        if ( s>=0 ) return s;
                        break;
                    case 76 : 
                        int LA3_76 = input.LA(1);

                         
                        int index3_76 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 98;}

                        else if ( (true) ) {s = 99;}

                         
                        input.seek(index3_76);
                        if ( s>=0 ) return s;
                        break;
                    case 77 : 
                        int LA3_77 = input.LA(1);

                         
                        int index3_77 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 98;}

                        else if ( (true) ) {s = 99;}

                         
                        input.seek(index3_77);
                        if ( s>=0 ) return s;
                        break;
                    case 78 : 
                        int LA3_78 = input.LA(1);

                         
                        int index3_78 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 98;}

                        else if ( (true) ) {s = 99;}

                         
                        input.seek(index3_78);
                        if ( s>=0 ) return s;
                        break;
                    case 79 : 
                        int LA3_79 = input.LA(1);

                         
                        int index3_79 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 98;}

                        else if ( (true) ) {s = 99;}

                         
                        input.seek(index3_79);
                        if ( s>=0 ) return s;
                        break;
                    case 80 : 
                        int LA3_80 = input.LA(1);

                         
                        int index3_80 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 98;}

                        else if ( (true) ) {s = 99;}

                         
                        input.seek(index3_80);
                        if ( s>=0 ) return s;
                        break;
                    case 81 : 
                        int LA3_81 = input.LA(1);

                         
                        int index3_81 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 98;}

                        else if ( (true) ) {s = 99;}

                         
                        input.seek(index3_81);
                        if ( s>=0 ) return s;
                        break;
                    case 82 : 
                        int LA3_82 = input.LA(1);

                         
                        int index3_82 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 98;}

                        else if ( (true) ) {s = 99;}

                         
                        input.seek(index3_82);
                        if ( s>=0 ) return s;
                        break;
                    case 83 : 
                        int LA3_83 = input.LA(1);

                         
                        int index3_83 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 98;}

                        else if ( (true) ) {s = 99;}

                         
                        input.seek(index3_83);
                        if ( s>=0 ) return s;
                        break;
                    case 84 : 
                        int LA3_84 = input.LA(1);

                         
                        int index3_84 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 98;}

                        else if ( (true) ) {s = 99;}

                         
                        input.seek(index3_84);
                        if ( s>=0 ) return s;
                        break;
                    case 85 : 
                        int LA3_85 = input.LA(1);

                         
                        int index3_85 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 98;}

                        else if ( (true) ) {s = 99;}

                         
                        input.seek(index3_85);
                        if ( s>=0 ) return s;
                        break;
                    case 86 : 
                        int LA3_86 = input.LA(1);

                         
                        int index3_86 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 98;}

                        else if ( (true) ) {s = 99;}

                         
                        input.seek(index3_86);
                        if ( s>=0 ) return s;
                        break;
                    case 87 : 
                        int LA3_87 = input.LA(1);

                         
                        int index3_87 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 98;}

                        else if ( (true) ) {s = 99;}

                         
                        input.seek(index3_87);
                        if ( s>=0 ) return s;
                        break;
                    case 88 : 
                        int LA3_88 = input.LA(1);

                         
                        int index3_88 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 98;}

                        else if ( (true) ) {s = 99;}

                         
                        input.seek(index3_88);
                        if ( s>=0 ) return s;
                        break;
                    case 89 : 
                        int LA3_89 = input.LA(1);

                         
                        int index3_89 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 98;}

                        else if ( (true) ) {s = 99;}

                         
                        input.seek(index3_89);
                        if ( s>=0 ) return s;
                        break;
                    case 90 : 
                        int LA3_90 = input.LA(1);

                         
                        int index3_90 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 98;}

                        else if ( (true) ) {s = 99;}

                         
                        input.seek(index3_90);
                        if ( s>=0 ) return s;
                        break;
                    case 91 : 
                        int LA3_91 = input.LA(1);

                         
                        int index3_91 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 98;}

                        else if ( (true) ) {s = 99;}

                         
                        input.seek(index3_91);
                        if ( s>=0 ) return s;
                        break;
                    case 92 : 
                        int LA3_92 = input.LA(1);

                         
                        int index3_92 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 98;}

                        else if ( (true) ) {s = 99;}

                         
                        input.seek(index3_92);
                        if ( s>=0 ) return s;
                        break;
                    case 93 : 
                        int LA3_93 = input.LA(1);

                         
                        int index3_93 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 98;}

                        else if ( (true) ) {s = 99;}

                         
                        input.seek(index3_93);
                        if ( s>=0 ) return s;
                        break;
                    case 94 : 
                        int LA3_94 = input.LA(1);

                         
                        int index3_94 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 98;}

                        else if ( (true) ) {s = 99;}

                         
                        input.seek(index3_94);
                        if ( s>=0 ) return s;
                        break;
                    case 95 : 
                        int LA3_95 = input.LA(1);

                         
                        int index3_95 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 98;}

                        else if ( (true) ) {s = 99;}

                         
                        input.seek(index3_95);
                        if ( s>=0 ) return s;
                        break;
                    case 96 : 
                        int LA3_96 = input.LA(1);

                         
                        int index3_96 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 98;}

                        else if ( (true) ) {s = 99;}

                         
                        input.seek(index3_96);
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
    static final String DFA7_eotS =
        "\u0080\uffff";
    static final String DFA7_eofS =
        "\2\uffff\3\136\101\uffff\1\136\30\uffff\1\136\1\uffff\5\136\32\uffff";
    static final String DFA7_minS =
        "\1\31\1\uffff\3\24\101\uffff\1\24\30\uffff\1\24\1\uffff\5\24\1\uffff"+
        "\1\0\1\uffff\26\0\1\uffff";
    static final String DFA7_maxS =
        "\1\u0086\1\uffff\1\121\2\122\101\uffff\1\122\30\uffff\1\u0086\1"+
        "\uffff\5\110\1\uffff\1\0\1\uffff\26\0\1\uffff";
    static final String DFA7_acceptS =
        "\1\uffff\1\1\3\uffff\101\1\1\uffff\27\1\1\2\1\uffff\1\1\5\uffff"+
        "\1\1\1\uffff\1\1\26\uffff\1\1";
    static final String DFA7_specialS =
        "\1\2\1\uffff\1\25\1\12\1\6\101\uffff\1\15\30\uffff\1\13\1\uffff"+
        "\1\20\1\22\1\23\1\24\1\16\1\uffff\1\11\1\uffff\1\30\1\31\1\40\1"+
        "\35\1\17\1\14\1\26\1\21\1\4\1\3\1\5\1\7\1\34\1\36\1\37\1\41\1\27"+
        "\1\32\1\33\1\10\1\0\1\1\1\uffff}>";
    static final String[] DFA7_transitionS = {
            "\1\1\1\127\3\uffff\1\72\1\73\1\74\1\75\1\76\1\77\1\100\1\101"+
            "\1\102\1\103\1\104\1\105\1\uffff\1\117\1\132\2\uffff\1\111\1"+
            "\112\1\113\1\114\1\115\1\116\3\uffff\1\130\1\131\1\120\1\121"+
            "\1\122\1\123\1\124\1\125\1\126\1\133\1\134\1\135\5\uffff\3\136"+
            "\1\106\1\2\1\3\1\4\1\5\1\107\1\110\1\6\1\7\1\10\1\11\1\12\1"+
            "\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1"+
            "\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1"+
            "\43\1\44\1\45\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56\1"+
            "\57\1\60\1\61\1\62\1\63\1\64\1\65\1\66\1\67\1\70\1\71",
            "",
            "\1\136\1\137\1\uffff\1\136\25\uffff\2\140\25\uffff\1\136\2"+
            "\uffff\2\136\3\uffff\1\136\1\uffff\4\136",
            "\1\136\1\137\1\uffff\1\136\25\uffff\2\140\25\uffff\1\136\2"+
            "\uffff\2\136\3\uffff\1\141\1\uffff\1\142\1\143\1\144\1\145\1"+
            "\146",
            "\1\136\1\137\1\uffff\1\136\54\uffff\1\136\2\uffff\2\136\3\uffff"+
            "\1\141\1\uffff\1\142\1\143\1\144\1\145\1\146",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\2\136\1\uffff\1\136\54\uffff\1\136\2\uffff\2\136\3\uffff\1"+
            "\141\1\uffff\1\142\1\143\1\144\1\145\1\146",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\136\3\uffff\2\136\1\147\2\uffff\1\150\1\151\1\152\1\153"+
            "\1\154\1\155\1\156\1\157\1\160\1\161\1\162\1\163\1\164\1\uffff"+
            "\1\136\1\176\2\uffff\6\136\3\uffff\1\174\1\175\1\165\1\166\1"+
            "\167\1\170\1\171\1\172\1\173\3\136\3\uffff\2\136\3\uffff\73"+
            "\136",
            "",
            "\2\136\1\uffff\1\136\25\uffff\2\177\26\uffff\4\136",
            "\2\136\1\uffff\1\136\25\uffff\2\177\26\uffff\4\136",
            "\2\136\1\uffff\1\136\25\uffff\2\177\26\uffff\4\136",
            "\2\136\1\uffff\1\136\25\uffff\2\177\26\uffff\4\136",
            "\2\136\1\uffff\1\136\25\uffff\2\177\26\uffff\4\136",
            "",
            "\1\uffff",
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
            return "47:5: ( ( date ( date_time_separator time )? )=> date ( date_time_separator time )? | time ( time_date_separator date )? )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA7_125 = input.LA(1);

                         
                        int index7_125 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Date()) ) {s = 127;}

                        else if ( (true) ) {s = 94;}

                         
                        input.seek(index7_125);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA7_126 = input.LA(1);

                         
                        int index7_126 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Date()) ) {s = 127;}

                        else if ( (true) ) {s = 94;}

                         
                        input.seek(index7_126);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA7_0 = input.LA(1);

                         
                        int index7_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA7_0==THE) && (synpred3_Date())) {s = 1;}

                        else if ( (LA7_0==INT_1_TO_9) ) {s = 2;}

                        else if ( (LA7_0==INT_01_TO_12) ) {s = 3;}

                        else if ( (LA7_0==INT_13_TO_23) ) {s = 4;}

                        else if ( (LA7_0==INT_24_TO_31) && (synpred3_Date())) {s = 5;}

                        else if ( (LA7_0==ONE) && (synpred3_Date())) {s = 6;}

                        else if ( (LA7_0==TWO) && (synpred3_Date())) {s = 7;}

                        else if ( (LA7_0==THREE) && (synpred3_Date())) {s = 8;}

                        else if ( (LA7_0==FOUR) && (synpred3_Date())) {s = 9;}

                        else if ( (LA7_0==FIVE) && (synpred3_Date())) {s = 10;}

                        else if ( (LA7_0==SIX) && (synpred3_Date())) {s = 11;}

                        else if ( (LA7_0==SEVEN) && (synpred3_Date())) {s = 12;}

                        else if ( (LA7_0==EIGHT) && (synpred3_Date())) {s = 13;}

                        else if ( (LA7_0==NINE) && (synpred3_Date())) {s = 14;}

                        else if ( (LA7_0==TEN) && (synpred3_Date())) {s = 15;}

                        else if ( (LA7_0==ELEVEN) && (synpred3_Date())) {s = 16;}

                        else if ( (LA7_0==TWELVE) && (synpred3_Date())) {s = 17;}

                        else if ( (LA7_0==THIRTEEN) && (synpred3_Date())) {s = 18;}

                        else if ( (LA7_0==FOURTEEN) && (synpred3_Date())) {s = 19;}

                        else if ( (LA7_0==FIFTEEN) && (synpred3_Date())) {s = 20;}

                        else if ( (LA7_0==SIXTEEN) && (synpred3_Date())) {s = 21;}

                        else if ( (LA7_0==SEVENTEEN) && (synpred3_Date())) {s = 22;}

                        else if ( (LA7_0==EIGHTEEN) && (synpred3_Date())) {s = 23;}

                        else if ( (LA7_0==NINETEEN) && (synpred3_Date())) {s = 24;}

                        else if ( (LA7_0==TWENTY) && (synpred3_Date())) {s = 25;}

                        else if ( (LA7_0==THIRTY) && (synpred3_Date())) {s = 26;}

                        else if ( (LA7_0==FIRST) && (synpred3_Date())) {s = 27;}

                        else if ( (LA7_0==SECOND) && (synpred3_Date())) {s = 28;}

                        else if ( (LA7_0==THIRD) && (synpred3_Date())) {s = 29;}

                        else if ( (LA7_0==FOURTH) && (synpred3_Date())) {s = 30;}

                        else if ( (LA7_0==FIFTH) && (synpred3_Date())) {s = 31;}

                        else if ( (LA7_0==SIXTH) && (synpred3_Date())) {s = 32;}

                        else if ( (LA7_0==SEVENTH) && (synpred3_Date())) {s = 33;}

                        else if ( (LA7_0==EIGHTH) && (synpred3_Date())) {s = 34;}

                        else if ( (LA7_0==NINTH) && (synpred3_Date())) {s = 35;}

                        else if ( (LA7_0==TENTH) && (synpred3_Date())) {s = 36;}

                        else if ( (LA7_0==ELEVENTH) && (synpred3_Date())) {s = 37;}

                        else if ( (LA7_0==TWELFTH) && (synpred3_Date())) {s = 38;}

                        else if ( (LA7_0==THIRTEENTH) && (synpred3_Date())) {s = 39;}

                        else if ( (LA7_0==FOURTEENTH) && (synpred3_Date())) {s = 40;}

                        else if ( (LA7_0==FIFTEENTH) && (synpred3_Date())) {s = 41;}

                        else if ( (LA7_0==SIXTEENTH) && (synpred3_Date())) {s = 42;}

                        else if ( (LA7_0==SEVENTEENTH) && (synpred3_Date())) {s = 43;}

                        else if ( (LA7_0==EIGHTEENTH) && (synpred3_Date())) {s = 44;}

                        else if ( (LA7_0==NINETEENTH) && (synpred3_Date())) {s = 45;}

                        else if ( (LA7_0==TWENTIETH) && (synpred3_Date())) {s = 46;}

                        else if ( (LA7_0==TWENTY_FIRST) && (synpred3_Date())) {s = 47;}

                        else if ( (LA7_0==TWENTY_SECOND) && (synpred3_Date())) {s = 48;}

                        else if ( (LA7_0==TWENTY_THIRD) && (synpred3_Date())) {s = 49;}

                        else if ( (LA7_0==TWENTY_FOURTH) && (synpred3_Date())) {s = 50;}

                        else if ( (LA7_0==TWENTY_FIFTH) && (synpred3_Date())) {s = 51;}

                        else if ( (LA7_0==TWENTY_SIXTH) && (synpred3_Date())) {s = 52;}

                        else if ( (LA7_0==TWENTY_SEVENTH) && (synpred3_Date())) {s = 53;}

                        else if ( (LA7_0==TWENTY_EIGHTH) && (synpred3_Date())) {s = 54;}

                        else if ( (LA7_0==TWENTY_NINTH) && (synpred3_Date())) {s = 55;}

                        else if ( (LA7_0==THIRTIETH) && (synpred3_Date())) {s = 56;}

                        else if ( (LA7_0==THIRTY_FIRST) && (synpred3_Date())) {s = 57;}

                        else if ( (LA7_0==JANUARY) && (synpred3_Date())) {s = 58;}

                        else if ( (LA7_0==FEBRUARY) && (synpred3_Date())) {s = 59;}

                        else if ( (LA7_0==MARCH) && (synpred3_Date())) {s = 60;}

                        else if ( (LA7_0==APRIL) && (synpred3_Date())) {s = 61;}

                        else if ( (LA7_0==MAY) && (synpred3_Date())) {s = 62;}

                        else if ( (LA7_0==JUNE) && (synpred3_Date())) {s = 63;}

                        else if ( (LA7_0==JULY) && (synpred3_Date())) {s = 64;}

                        else if ( (LA7_0==AUGUST) && (synpred3_Date())) {s = 65;}

                        else if ( (LA7_0==SEPTEMBER) && (synpred3_Date())) {s = 66;}

                        else if ( (LA7_0==OCTOBER) && (synpred3_Date())) {s = 67;}

                        else if ( (LA7_0==NOVEMBER) && (synpred3_Date())) {s = 68;}

                        else if ( (LA7_0==DECEMBER) && (synpred3_Date())) {s = 69;}

                        else if ( (LA7_0==INT_00) ) {s = 70;}

                        else if ( (LA7_0==INT_32_TO_59) && (synpred3_Date())) {s = 71;}

                        else if ( (LA7_0==INT_60_TO_99) && (synpred3_Date())) {s = 72;}

                        else if ( (LA7_0==THIS) && (synpred3_Date())) {s = 73;}

                        else if ( (LA7_0==LAST) && (synpred3_Date())) {s = 74;}

                        else if ( (LA7_0==NEXT) && (synpred3_Date())) {s = 75;}

                        else if ( (LA7_0==PAST) && (synpred3_Date())) {s = 76;}

                        else if ( (LA7_0==COMING) && (synpred3_Date())) {s = 77;}

                        else if ( (LA7_0==UPCOMING) && (synpred3_Date())) {s = 78;}

                        else if ( (LA7_0==IN) && (synpred3_Date())) {s = 79;}

                        else if ( (LA7_0==SUNDAY) && (synpred3_Date())) {s = 80;}

                        else if ( (LA7_0==MONDAY) && (synpred3_Date())) {s = 81;}

                        else if ( (LA7_0==TUESDAY) && (synpred3_Date())) {s = 82;}

                        else if ( (LA7_0==WEDNESDAY) && (synpred3_Date())) {s = 83;}

                        else if ( (LA7_0==THURSDAY) && (synpred3_Date())) {s = 84;}

                        else if ( (LA7_0==FRIDAY) && (synpred3_Date())) {s = 85;}

                        else if ( (LA7_0==SATURDAY) && (synpred3_Date())) {s = 86;}

                        else if ( (LA7_0==DAY) && (synpred3_Date())) {s = 87;}

                        else if ( (LA7_0==WEEK) && (synpred3_Date())) {s = 88;}

                        else if ( (LA7_0==MONTH) && (synpred3_Date())) {s = 89;}

                        else if ( (LA7_0==YEAR) && (synpred3_Date())) {s = 90;}

                        else if ( (LA7_0==TODAY) && (synpred3_Date())) {s = 91;}

                        else if ( (LA7_0==TOMORROW) && (synpred3_Date())) {s = 92;}

                        else if ( (LA7_0==YESTERDAY) && (synpred3_Date())) {s = 93;}

                        else if ( ((LA7_0>=NOON && LA7_0<=INT_0)) ) {s = 94;}

                         
                        input.seek(index7_0);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA7_114 = input.LA(1);

                         
                        int index7_114 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Date()) ) {s = 127;}

                        else if ( (true) ) {s = 94;}

                         
                        input.seek(index7_114);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA7_113 = input.LA(1);

                         
                        int index7_113 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Date()) ) {s = 127;}

                        else if ( (true) ) {s = 94;}

                         
                        input.seek(index7_113);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA7_115 = input.LA(1);

                         
                        int index7_115 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Date()) ) {s = 127;}

                        else if ( (true) ) {s = 94;}

                         
                        input.seek(index7_115);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA7_4 = input.LA(1);

                         
                        int index7_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA7_4==WHITE_SPACE) ) {s = 95;}

                        else if ( (LA7_4==EOF||LA7_4==STRING||LA7_4==COMMA||LA7_4==COLON||(LA7_4>=AM && LA7_4<=PM)) ) {s = 94;}

                        else if ( (LA7_4==INT_00) ) {s = 97;}

                        else if ( (LA7_4==INT_01_TO_12) ) {s = 98;}

                        else if ( (LA7_4==INT_13_TO_23) ) {s = 99;}

                        else if ( (LA7_4==INT_24_TO_31) ) {s = 100;}

                        else if ( (LA7_4==INT_32_TO_59) ) {s = 101;}

                        else if ( (LA7_4==INT_60_TO_99) && (synpred3_Date())) {s = 102;}

                         
                        input.seek(index7_4);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA7_116 = input.LA(1);

                         
                        int index7_116 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Date()) ) {s = 127;}

                        else if ( (true) ) {s = 94;}

                         
                        input.seek(index7_116);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA7_124 = input.LA(1);

                         
                        int index7_124 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Date()) ) {s = 127;}

                        else if ( (true) ) {s = 94;}

                         
                        input.seek(index7_124);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA7_103 = input.LA(1);

                         
                        int index7_103 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Date()) ) {s = 127;}

                        else if ( (true) ) {s = 94;}

                         
                        input.seek(index7_103);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA7_3 = input.LA(1);

                         
                        int index7_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA7_3==WHITE_SPACE) ) {s = 95;}

                        else if ( (LA7_3==EOF||LA7_3==STRING||LA7_3==COMMA||LA7_3==COLON||(LA7_3>=AM && LA7_3<=PM)) ) {s = 94;}

                        else if ( (LA7_3==INT_00) ) {s = 97;}

                        else if ( (LA7_3==INT_01_TO_12) ) {s = 98;}

                        else if ( (LA7_3==INT_13_TO_23) ) {s = 99;}

                        else if ( (LA7_3==INT_24_TO_31) ) {s = 100;}

                        else if ( (LA7_3==INT_32_TO_59) ) {s = 101;}

                        else if ( ((LA7_3>=DASH && LA7_3<=SLASH)) && (synpred3_Date())) {s = 96;}

                        else if ( (LA7_3==INT_60_TO_99) && (synpred3_Date())) {s = 102;}

                         
                        input.seek(index7_3);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA7_95 = input.LA(1);

                         
                        int index7_95 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA7_95==DAY) ) {s = 103;}

                        else if ( (LA7_95==OF) && (synpred3_Date())) {s = 104;}

                        else if ( (LA7_95==JANUARY) ) {s = 105;}

                        else if ( (LA7_95==FEBRUARY) ) {s = 106;}

                        else if ( (LA7_95==MARCH) ) {s = 107;}

                        else if ( (LA7_95==APRIL) ) {s = 108;}

                        else if ( (LA7_95==MAY) ) {s = 109;}

                        else if ( (LA7_95==JUNE) ) {s = 110;}

                        else if ( (LA7_95==JULY) ) {s = 111;}

                        else if ( (LA7_95==AUGUST) ) {s = 112;}

                        else if ( (LA7_95==SEPTEMBER) ) {s = 113;}

                        else if ( (LA7_95==OCTOBER) ) {s = 114;}

                        else if ( (LA7_95==NOVEMBER) ) {s = 115;}

                        else if ( (LA7_95==DECEMBER) ) {s = 116;}

                        else if ( (LA7_95==EOF||LA7_95==STRING||(LA7_95>=ON && LA7_95<=THE)||LA7_95==IN||(LA7_95>=THIS && LA7_95<=UPCOMING)||(LA7_95>=TODAY && LA7_95<=YESTERDAY)||(LA7_95>=AM && LA7_95<=PM)||(LA7_95>=INT_00 && LA7_95<=THIRTY_FIRST)) ) {s = 94;}

                        else if ( (LA7_95==SUNDAY) ) {s = 117;}

                        else if ( (LA7_95==MONDAY) ) {s = 118;}

                        else if ( (LA7_95==TUESDAY) ) {s = 119;}

                        else if ( (LA7_95==WEDNESDAY) ) {s = 120;}

                        else if ( (LA7_95==THURSDAY) ) {s = 121;}

                        else if ( (LA7_95==FRIDAY) ) {s = 122;}

                        else if ( (LA7_95==SATURDAY) ) {s = 123;}

                        else if ( (LA7_95==WEEK) ) {s = 124;}

                        else if ( (LA7_95==MONTH) ) {s = 125;}

                        else if ( (LA7_95==YEAR) ) {s = 126;}

                         
                        input.seek(index7_95);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA7_110 = input.LA(1);

                         
                        int index7_110 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Date()) ) {s = 127;}

                        else if ( (true) ) {s = 94;}

                         
                        input.seek(index7_110);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA7_70 = input.LA(1);

                         
                        int index7_70 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA7_70==EOF||(LA7_70>=STRING && LA7_70<=WHITE_SPACE)||LA7_70==COMMA||LA7_70==COLON||(LA7_70>=AM && LA7_70<=PM)) ) {s = 94;}

                        else if ( (LA7_70==INT_00) ) {s = 97;}

                        else if ( (LA7_70==INT_01_TO_12) ) {s = 98;}

                        else if ( (LA7_70==INT_13_TO_23) ) {s = 99;}

                        else if ( (LA7_70==INT_24_TO_31) ) {s = 100;}

                        else if ( (LA7_70==INT_32_TO_59) ) {s = 101;}

                        else if ( (LA7_70==INT_60_TO_99) && (synpred3_Date())) {s = 102;}

                         
                        input.seek(index7_70);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA7_101 = input.LA(1);

                         
                        int index7_101 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA7_101>=DASH && LA7_101<=SLASH)) && (synpred3_Date())) {s = 127;}

                        else if ( (LA7_101==EOF||(LA7_101>=STRING && LA7_101<=WHITE_SPACE)||LA7_101==COMMA||(LA7_101>=MILITARY_HOUR_SUFFIX && LA7_101<=PM)) ) {s = 94;}

                         
                        input.seek(index7_101);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA7_109 = input.LA(1);

                         
                        int index7_109 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Date()) ) {s = 127;}

                        else if ( (true) ) {s = 94;}

                         
                        input.seek(index7_109);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA7_97 = input.LA(1);

                         
                        int index7_97 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA7_97==EOF||(LA7_97>=STRING && LA7_97<=WHITE_SPACE)||LA7_97==COMMA||(LA7_97>=MILITARY_HOUR_SUFFIX && LA7_97<=PM)) ) {s = 94;}

                        else if ( ((LA7_97>=DASH && LA7_97<=SLASH)) && (synpred3_Date())) {s = 127;}

                         
                        input.seek(index7_97);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA7_112 = input.LA(1);

                         
                        int index7_112 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Date()) ) {s = 127;}

                        else if ( (true) ) {s = 94;}

                         
                        input.seek(index7_112);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA7_98 = input.LA(1);

                         
                        int index7_98 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA7_98==EOF||(LA7_98>=STRING && LA7_98<=WHITE_SPACE)||LA7_98==COMMA||(LA7_98>=MILITARY_HOUR_SUFFIX && LA7_98<=PM)) ) {s = 94;}

                        else if ( ((LA7_98>=DASH && LA7_98<=SLASH)) && (synpred3_Date())) {s = 127;}

                         
                        input.seek(index7_98);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA7_99 = input.LA(1);

                         
                        int index7_99 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA7_99>=DASH && LA7_99<=SLASH)) && (synpred3_Date())) {s = 127;}

                        else if ( (LA7_99==EOF||(LA7_99>=STRING && LA7_99<=WHITE_SPACE)||LA7_99==COMMA||(LA7_99>=MILITARY_HOUR_SUFFIX && LA7_99<=PM)) ) {s = 94;}

                         
                        input.seek(index7_99);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA7_100 = input.LA(1);

                         
                        int index7_100 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA7_100>=DASH && LA7_100<=SLASH)) && (synpred3_Date())) {s = 127;}

                        else if ( (LA7_100==EOF||(LA7_100>=STRING && LA7_100<=WHITE_SPACE)||LA7_100==COMMA||(LA7_100>=MILITARY_HOUR_SUFFIX && LA7_100<=PM)) ) {s = 94;}

                         
                        input.seek(index7_100);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA7_2 = input.LA(1);

                         
                        int index7_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA7_2==WHITE_SPACE) ) {s = 95;}

                        else if ( (LA7_2==EOF||LA7_2==STRING||LA7_2==COMMA||LA7_2==COLON||(LA7_2>=AM && LA7_2<=PM)||LA7_2==INT_00||(LA7_2>=INT_01_TO_12 && LA7_2<=INT_32_TO_59)) ) {s = 94;}

                        else if ( ((LA7_2>=DASH && LA7_2<=SLASH)) && (synpred3_Date())) {s = 96;}

                         
                        input.seek(index7_2);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA7_111 = input.LA(1);

                         
                        int index7_111 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Date()) ) {s = 127;}

                        else if ( (true) ) {s = 94;}

                         
                        input.seek(index7_111);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA7_121 = input.LA(1);

                         
                        int index7_121 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Date()) ) {s = 127;}

                        else if ( (true) ) {s = 94;}

                         
                        input.seek(index7_121);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA7_105 = input.LA(1);

                         
                        int index7_105 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Date()) ) {s = 127;}

                        else if ( (true) ) {s = 94;}

                         
                        input.seek(index7_105);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA7_106 = input.LA(1);

                         
                        int index7_106 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Date()) ) {s = 127;}

                        else if ( (true) ) {s = 94;}

                         
                        input.seek(index7_106);
                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA7_122 = input.LA(1);

                         
                        int index7_122 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Date()) ) {s = 127;}

                        else if ( (true) ) {s = 94;}

                         
                        input.seek(index7_122);
                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA7_123 = input.LA(1);

                         
                        int index7_123 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Date()) ) {s = 127;}

                        else if ( (true) ) {s = 94;}

                         
                        input.seek(index7_123);
                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA7_117 = input.LA(1);

                         
                        int index7_117 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Date()) ) {s = 127;}

                        else if ( (true) ) {s = 94;}

                         
                        input.seek(index7_117);
                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA7_108 = input.LA(1);

                         
                        int index7_108 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Date()) ) {s = 127;}

                        else if ( (true) ) {s = 94;}

                         
                        input.seek(index7_108);
                        if ( s>=0 ) return s;
                        break;
                    case 30 : 
                        int LA7_118 = input.LA(1);

                         
                        int index7_118 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Date()) ) {s = 127;}

                        else if ( (true) ) {s = 94;}

                         
                        input.seek(index7_118);
                        if ( s>=0 ) return s;
                        break;
                    case 31 : 
                        int LA7_119 = input.LA(1);

                         
                        int index7_119 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Date()) ) {s = 127;}

                        else if ( (true) ) {s = 94;}

                         
                        input.seek(index7_119);
                        if ( s>=0 ) return s;
                        break;
                    case 32 : 
                        int LA7_107 = input.LA(1);

                         
                        int index7_107 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Date()) ) {s = 127;}

                        else if ( (true) ) {s = 94;}

                         
                        input.seek(index7_107);
                        if ( s>=0 ) return s;
                        break;
                    case 33 : 
                        int LA7_120 = input.LA(1);

                         
                        int index7_120 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Date()) ) {s = 127;}

                        else if ( (true) ) {s = 94;}

                         
                        input.seek(index7_120);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 7, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA16_eotS =
        "\u00d2\uffff";
    static final String DFA16_eofS =
        "\72\uffff\14\107\2\uffff\1\107\32\uffff\2\107\46\uffff\1\107\105"+
        "\uffff\1\107";
    static final String DFA16_minS =
        "\1\31\32\25\37\uffff\14\24\2\uffff\1\24\2\32\1\123\1\32\1\25\1\uffff"+
        "\1\25\1\uffff\3\25\1\uffff\1\25\4\uffff\3\25\2\uffff\1\32\1\123"+
        "\1\25\1\uffff\2\24\46\uffff\1\24\14\0\1\uffff\3\0\65\uffff\1\24";
    static final String DFA16_maxS =
        "\1\u0086\1\25\1\56\3\122\23\25\1\160\1\150\37\uffff\14\27\2\uffff"+
        "\1\27\1\u0086\1\100\2\160\1\25\1\uffff\1\25\1\uffff\3\25\1\uffff"+
        "\1\25\4\uffff\3\25\2\uffff\2\150\1\25\1\uffff\1\u0086\1\117\46\uffff"+
        "\1\u0088\14\0\1\uffff\3\0\65\uffff\1\117";
    static final String DFA16_acceptS =
        "\33\uffff\37\1\14\uffff\1\2\1\3\6\uffff\1\1\1\uffff\1\1\3\uffff"+
        "\1\1\1\uffff\4\1\3\uffff\2\1\3\uffff\1\1\2\uffff\45\1\1\4\15\uffff"+
        "\1\1\3\uffff\65\1\1\uffff";
    static final String DFA16_specialS =
        "\1\26\30\uffff\1\5\1\24\56\uffff\1\13\1\3\1\23\1\27\22\uffff\1\30"+
        "\1\25\2\uffff\1\6\50\uffff\1\2\1\0\1\1\1\22\1\21\1\20\1\17\1\16"+
        "\1\15\1\14\1\12\1\10\1\uffff\1\11\1\7\1\4\66\uffff}>";
    static final String[] DFA16_transitionS = {
            "\1\1\1\110\3\uffff\1\72\1\73\1\74\1\75\1\76\1\77\1\100\1\101"+
            "\1\102\1\103\1\104\1\105\1\uffff\2\107\2\uffff\6\107\3\uffff"+
            "\14\107\10\uffff\1\106\1\2\1\3\1\4\1\5\2\106\1\6\1\7\1\10\1"+
            "\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1"+
            "\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1"+
            "\41\1\42\1\43\1\44\1\45\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1"+
            "\55\1\56\1\57\1\60\1\61\1\62\1\63\1\64\1\65\1\66\1\67\1\70\1"+
            "\71",
            "\1\111",
            "\1\112\27\uffff\2\106",
            "\1\112\27\uffff\2\106\35\uffff\1\106\1\uffff\5\106",
            "\1\112\66\uffff\1\106\1\uffff\5\106",
            "\1\112\66\uffff\1\106\1\uffff\5\106",
            "\1\112",
            "\1\112",
            "\1\112",
            "\1\112",
            "\1\112",
            "\1\112",
            "\1\112",
            "\1\112",
            "\1\112",
            "\1\112",
            "\1\112",
            "\1\112",
            "\1\112",
            "\1\112",
            "\1\112",
            "\1\112",
            "\1\112",
            "\1\112",
            "\1\112",
            "\1\114\27\uffff\1\113\45\uffff\1\132\1\134\1\133\1\117\1\125"+
            "\1\121\1\122\1\123\1\115\14\uffff\1\124\1\136\1\135\1\131\1"+
            "\127\1\116\1\126\1\120\1\130",
            "\1\137\27\uffff\1\140\45\uffff\1\141\24\uffff\1\142",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\107\1\143\1\uffff\1\107",
            "\1\107\1\143\1\uffff\1\107",
            "\1\107\1\143\1\uffff\1\107",
            "\1\107\1\143\1\uffff\1\107",
            "\1\107\1\143\1\uffff\1\107",
            "\1\107\1\143\1\uffff\1\107",
            "\1\107\1\143\1\uffff\1\107",
            "\1\107\1\143\1\uffff\1\107",
            "\1\107\1\143\1\uffff\1\107",
            "\1\107\1\143\1\uffff\1\107",
            "\1\107\1\143\1\uffff\1\107",
            "\1\107\1\143\1\uffff\1\107",
            "",
            "",
            "\1\107\1\144\1\uffff\1\107",
            "\1\u008a\3\uffff\1\176\1\177\1\u0080\1\u0081\1\u0082\1\u0083"+
            "\1\u0084\1\u0085\1\u0086\1\u0087\1\u0088\1\u0089\43\uffff\1"+
            "\145\1\146\1\147\1\150\2\uffff\1\151\1\152\1\153\1\154\1\155"+
            "\1\156\1\157\1\160\1\161\1\162\1\163\1\164\1\165\1\166\1\167"+
            "\1\170\1\171\1\172\1\173\1\174\1\175\1\33\1\34\1\35\1\36\1\37"+
            "\1\40\1\41\1\42\1\43\1\44\1\45\1\46\1\47\1\50\1\51\1\52\1\53"+
            "\1\54\1\55\1\56\1\57\1\60\1\61\1\62\1\63\1\64\1\65\1\66\1\67"+
            "\1\70\1\71",
            "\1\u008b\2\uffff\1\u0098\1\u008c\1\u008d\1\u008e\1\u008f\1"+
            "\u0090\1\u0091\1\u0092\1\u0093\1\u0094\1\u0095\1\u0096\1\u0097"+
            "\2\uffff\1\107\13\uffff\11\107",
            "\1\132\1\134\1\133\1\117\1\125\1\121\1\122\1\123\1\115\14\uffff"+
            "\1\124\1\136\1\135\1\131\1\127\1\116\1\126\1\120\1\130",
            "\1\u008b\2\uffff\1\u0098\1\u008c\1\u008d\1\u008e\1\u008f\1"+
            "\u0090\1\u0091\1\u0092\1\u0093\1\u0094\1\u0095\1\u0096\1\u0097"+
            "\2\uffff\1\107\13\uffff\11\107\22\uffff\1\132\1\134\1\133\1"+
            "\117\1\125\1\121\1\122\1\123\1\115\14\uffff\1\124\1\136\1\135"+
            "\1\131\1\127\1\116\1\126\1\120\1\130",
            "\1\112",
            "",
            "\1\112",
            "",
            "\1\112",
            "\1\112",
            "\1\112",
            "",
            "\1\112",
            "",
            "",
            "",
            "",
            "\1\112",
            "\1\112",
            "\1\112",
            "",
            "",
            "\1\u008b\2\uffff\1\u0098\1\u008c\1\u008d\1\u008e\1\u008f\1"+
            "\u0090\1\u0091\1\u0092\1\u0093\1\u0094\1\u0095\1\u0096\1\u0097"+
            "\2\uffff\1\107\13\uffff\11\107\22\uffff\1\141\24\uffff\1\142",
            "\1\141\24\uffff\1\142",
            "\1\112",
            "",
            "\1\107\1\uffff\1\107\62\uffff\4\107\1\u0099\1\u009a\1\u009b"+
            "\1\u009c\2\uffff\1\u009d\1\u009e\1\u009f\1\u00a0\1\u00a1\1\u00a2"+
            "\1\u00a3\1\u00a4\1\u00a5\1\u00a6\1\u00a7\1\u00a8\1\u00a9\1\u00aa"+
            "\1\u00ab\1\u00ac\1\u00ad\1\u00ae\1\u00af\1\u00b0\1\u00b1\1\u00b2"+
            "\1\u00b3\1\u00b4\1\u00b5\1\u00b6\1\u00b7\1\u00b8\1\u00b9\1\u00ba"+
            "\1\u00bb\1\u00bc\1\u00bd\1\u00be\1\u00bf\1\u00c0\1\u00c1\1\u00c2"+
            "\1\u00c3\1\u00c4\1\u00c5\1\u00c6\1\u00c7\1\u00c8\1\u00c9\1\u00ca"+
            "\1\u00cb\1\u00cc\1\u00cd\1\u00ce\1\u00cf\1\u00d0",
            "\1\107\1\uffff\1\107\4\uffff\2\u008a\54\uffff\7\107",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\107\1\u00d1\1\uffff\1\107\160\uffff\1\107",
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
            "\1\107\1\uffff\1\107\4\uffff\2\u008a\30\uffff\1\107\1\uffff"+
            "\1\107\21\uffff\7\107"
    };

    static final short[] DFA16_eot = DFA.unpackEncodedString(DFA16_eotS);
    static final short[] DFA16_eof = DFA.unpackEncodedString(DFA16_eofS);
    static final char[] DFA16_min = DFA.unpackEncodedStringToUnsignedChars(DFA16_minS);
    static final char[] DFA16_max = DFA.unpackEncodedStringToUnsignedChars(DFA16_maxS);
    static final short[] DFA16_accept = DFA.unpackEncodedString(DFA16_acceptS);
    static final short[] DFA16_special = DFA.unpackEncodedString(DFA16_specialS);
    static final short[][] DFA16_transition;

    static {
        int numStates = DFA16_transitionS.length;
        DFA16_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA16_transition[i] = DFA.unpackEncodedString(DFA16_transitionS[i]);
        }
    }

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = DFA16_eot;
            this.eof = DFA16_eof;
            this.min = DFA16_min;
            this.max = DFA16_max;
            this.accept = DFA16_accept;
            this.special = DFA16_special;
            this.transition = DFA16_transition;
        }
        public String getDescription() {
            return "65:1: date : ( ( relaxed_date )=> relaxed_date | formal_date | relative_date | global_date_prefix date -> ^( RELATIVE_DATE ^( SEEK global_date_prefix date ) ) );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA16_141 = input.LA(1);

                         
                        int index16_141 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_Date()) ) {s = 208;}

                        else if ( (true) ) {s = 71;}

                         
                        input.seek(index16_141);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA16_142 = input.LA(1);

                         
                        int index16_142 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_Date()) ) {s = 208;}

                        else if ( (true) ) {s = 71;}

                         
                        input.seek(index16_142);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA16_140 = input.LA(1);

                         
                        int index16_140 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_Date()) ) {s = 208;}

                        else if ( (true) ) {s = 71;}

                         
                        input.seek(index16_140);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA16_74 = input.LA(1);

                         
                        int index16_74 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA16_74==DAY) ) {s = 139;}

                        else if ( (LA16_74==YEAR||(LA16_74>=WEEK && LA16_74<=SATURDAY)) ) {s = 71;}

                        else if ( (LA16_74==JANUARY) ) {s = 140;}

                        else if ( (LA16_74==FEBRUARY) ) {s = 141;}

                        else if ( (LA16_74==MARCH) ) {s = 142;}

                        else if ( (LA16_74==APRIL) ) {s = 143;}

                        else if ( (LA16_74==MAY) ) {s = 144;}

                        else if ( (LA16_74==JUNE) ) {s = 145;}

                        else if ( (LA16_74==JULY) ) {s = 146;}

                        else if ( (LA16_74==AUGUST) ) {s = 147;}

                        else if ( (LA16_74==SEPTEMBER) ) {s = 148;}

                        else if ( (LA16_74==OCTOBER) ) {s = 149;}

                        else if ( (LA16_74==NOVEMBER) ) {s = 150;}

                        else if ( (LA16_74==DECEMBER) ) {s = 151;}

                        else if ( (LA16_74==OF) && (synpred4_Date())) {s = 152;}

                         
                        input.seek(index16_74);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA16_155 = input.LA(1);

                         
                        int index16_155 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_Date()) ) {s = 208;}

                        else if ( (true) ) {s = 71;}

                         
                        input.seek(index16_155);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA16_25 = input.LA(1);

                         
                        int index16_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA16_25==DASH) ) {s = 75;}

                        else if ( (LA16_25==WHITE_SPACE) ) {s = 76;}

                        else if ( (LA16_25==NINE) ) {s = 77;}

                        else if ( (LA16_25==SIXTH) && (synpred4_Date())) {s = 78;}

                        else if ( (LA16_25==FOUR) ) {s = 79;}

                        else if ( (LA16_25==EIGHTH) && (synpred4_Date())) {s = 80;}

                        else if ( (LA16_25==SIX) ) {s = 81;}

                        else if ( (LA16_25==SEVEN) ) {s = 82;}

                        else if ( (LA16_25==EIGHT) ) {s = 83;}

                        else if ( (LA16_25==FIRST) && (synpred4_Date())) {s = 84;}

                        else if ( (LA16_25==FIVE) ) {s = 85;}

                        else if ( (LA16_25==SEVENTH) && (synpred4_Date())) {s = 86;}

                        else if ( (LA16_25==FIFTH) && (synpred4_Date())) {s = 87;}

                        else if ( (LA16_25==NINTH) && (synpred4_Date())) {s = 88;}

                        else if ( (LA16_25==FOURTH) && (synpred4_Date())) {s = 89;}

                        else if ( (LA16_25==ONE) ) {s = 90;}

                        else if ( (LA16_25==THREE) ) {s = 91;}

                        else if ( (LA16_25==TWO) ) {s = 92;}

                        else if ( (LA16_25==THIRD) && (synpred4_Date())) {s = 93;}

                        else if ( (LA16_25==SECOND) && (synpred4_Date())) {s = 94;}

                         
                        input.seek(index16_25);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA16_99 = input.LA(1);

                         
                        int index16_99 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA16_99==INT_1_TO_9) ) {s = 153;}

                        else if ( (LA16_99==INT_01_TO_12) ) {s = 154;}

                        else if ( (LA16_99==INT_13_TO_23) ) {s = 155;}

                        else if ( (LA16_99==INT_24_TO_31) && (synpred4_Date())) {s = 156;}

                        else if ( (LA16_99==ONE) && (synpred4_Date())) {s = 157;}

                        else if ( (LA16_99==TWO) && (synpred4_Date())) {s = 158;}

                        else if ( (LA16_99==THREE) && (synpred4_Date())) {s = 159;}

                        else if ( (LA16_99==FOUR) && (synpred4_Date())) {s = 160;}

                        else if ( (LA16_99==FIVE) && (synpred4_Date())) {s = 161;}

                        else if ( (LA16_99==SIX) && (synpred4_Date())) {s = 162;}

                        else if ( (LA16_99==SEVEN) && (synpred4_Date())) {s = 163;}

                        else if ( (LA16_99==EIGHT) && (synpred4_Date())) {s = 164;}

                        else if ( (LA16_99==NINE) && (synpred4_Date())) {s = 165;}

                        else if ( (LA16_99==TEN) && (synpred4_Date())) {s = 166;}

                        else if ( (LA16_99==ELEVEN) && (synpred4_Date())) {s = 167;}

                        else if ( (LA16_99==TWELVE) && (synpred4_Date())) {s = 168;}

                        else if ( (LA16_99==THIRTEEN) && (synpred4_Date())) {s = 169;}

                        else if ( (LA16_99==FOURTEEN) && (synpred4_Date())) {s = 170;}

                        else if ( (LA16_99==FIFTEEN) && (synpred4_Date())) {s = 171;}

                        else if ( (LA16_99==SIXTEEN) && (synpred4_Date())) {s = 172;}

                        else if ( (LA16_99==SEVENTEEN) && (synpred4_Date())) {s = 173;}

                        else if ( (LA16_99==EIGHTEEN) && (synpred4_Date())) {s = 174;}

                        else if ( (LA16_99==NINETEEN) && (synpred4_Date())) {s = 175;}

                        else if ( (LA16_99==TWENTY) && (synpred4_Date())) {s = 176;}

                        else if ( (LA16_99==THIRTY) && (synpred4_Date())) {s = 177;}

                        else if ( (LA16_99==FIRST) && (synpred4_Date())) {s = 178;}

                        else if ( (LA16_99==SECOND) && (synpred4_Date())) {s = 179;}

                        else if ( (LA16_99==THIRD) && (synpred4_Date())) {s = 180;}

                        else if ( (LA16_99==FOURTH) && (synpred4_Date())) {s = 181;}

                        else if ( (LA16_99==FIFTH) && (synpred4_Date())) {s = 182;}

                        else if ( (LA16_99==SIXTH) && (synpred4_Date())) {s = 183;}

                        else if ( (LA16_99==SEVENTH) && (synpred4_Date())) {s = 184;}

                        else if ( (LA16_99==EIGHTH) && (synpred4_Date())) {s = 185;}

                        else if ( (LA16_99==NINTH) && (synpred4_Date())) {s = 186;}

                        else if ( (LA16_99==TENTH) && (synpred4_Date())) {s = 187;}

                        else if ( (LA16_99==ELEVENTH) && (synpred4_Date())) {s = 188;}

                        else if ( (LA16_99==TWELFTH) && (synpred4_Date())) {s = 189;}

                        else if ( (LA16_99==THIRTEENTH) && (synpred4_Date())) {s = 190;}

                        else if ( (LA16_99==FOURTEENTH) && (synpred4_Date())) {s = 191;}

                        else if ( (LA16_99==FIFTEENTH) && (synpred4_Date())) {s = 192;}

                        else if ( (LA16_99==SIXTEENTH) && (synpred4_Date())) {s = 193;}

                        else if ( (LA16_99==SEVENTEENTH) && (synpred4_Date())) {s = 194;}

                        else if ( (LA16_99==EIGHTEENTH) && (synpred4_Date())) {s = 195;}

                        else if ( (LA16_99==NINETEENTH) && (synpred4_Date())) {s = 196;}

                        else if ( (LA16_99==TWENTIETH) && (synpred4_Date())) {s = 197;}

                        else if ( (LA16_99==TWENTY_FIRST) && (synpred4_Date())) {s = 198;}

                        else if ( (LA16_99==TWENTY_SECOND) && (synpred4_Date())) {s = 199;}

                        else if ( (LA16_99==TWENTY_THIRD) && (synpred4_Date())) {s = 200;}

                        else if ( (LA16_99==TWENTY_FOURTH) && (synpred4_Date())) {s = 201;}

                        else if ( (LA16_99==TWENTY_FIFTH) && (synpred4_Date())) {s = 202;}

                        else if ( (LA16_99==TWENTY_SIXTH) && (synpred4_Date())) {s = 203;}

                        else if ( (LA16_99==TWENTY_SEVENTH) && (synpred4_Date())) {s = 204;}

                        else if ( (LA16_99==TWENTY_EIGHTH) && (synpred4_Date())) {s = 205;}

                        else if ( (LA16_99==TWENTY_NINTH) && (synpred4_Date())) {s = 206;}

                        else if ( (LA16_99==THIRTIETH) && (synpred4_Date())) {s = 207;}

                        else if ( (LA16_99==THIRTY_FIRST) && (synpred4_Date())) {s = 208;}

                        else if ( (LA16_99==EOF||LA16_99==STRING||LA16_99==AT||(LA16_99>=NOON && LA16_99<=INT_00)) ) {s = 71;}

                         
                        input.seek(index16_99);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA16_154 = input.LA(1);

                         
                        int index16_154 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_Date()) ) {s = 208;}

                        else if ( (true) ) {s = 71;}

                         
                        input.seek(index16_154);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA16_151 = input.LA(1);

                         
                        int index16_151 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_Date()) ) {s = 208;}

                        else if ( (true) ) {s = 71;}

                         
                        input.seek(index16_151);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA16_153 = input.LA(1);

                         
                        int index16_153 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_Date()) ) {s = 208;}

                        else if ( (true) ) {s = 71;}

                         
                        input.seek(index16_153);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA16_150 = input.LA(1);

                         
                        int index16_150 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_Date()) ) {s = 208;}

                        else if ( (true) ) {s = 71;}

                         
                        input.seek(index16_150);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA16_73 = input.LA(1);

                         
                        int index16_73 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA16_73==INT_1_TO_9) && (synpred4_Date())) {s = 101;}

                        else if ( (LA16_73==INT_01_TO_12) && (synpred4_Date())) {s = 102;}

                        else if ( (LA16_73==INT_13_TO_23) && (synpred4_Date())) {s = 103;}

                        else if ( (LA16_73==INT_24_TO_31) && (synpred4_Date())) {s = 104;}

                        else if ( (LA16_73==ONE) && (synpred4_Date())) {s = 105;}

                        else if ( (LA16_73==TWO) && (synpred4_Date())) {s = 106;}

                        else if ( (LA16_73==THREE) && (synpred4_Date())) {s = 107;}

                        else if ( (LA16_73==FOUR) && (synpred4_Date())) {s = 108;}

                        else if ( (LA16_73==FIVE) && (synpred4_Date())) {s = 109;}

                        else if ( (LA16_73==SIX) && (synpred4_Date())) {s = 110;}

                        else if ( (LA16_73==SEVEN) && (synpred4_Date())) {s = 111;}

                        else if ( (LA16_73==EIGHT) && (synpred4_Date())) {s = 112;}

                        else if ( (LA16_73==NINE) && (synpred4_Date())) {s = 113;}

                        else if ( (LA16_73==TEN) && (synpred4_Date())) {s = 114;}

                        else if ( (LA16_73==ELEVEN) && (synpred4_Date())) {s = 115;}

                        else if ( (LA16_73==TWELVE) && (synpred4_Date())) {s = 116;}

                        else if ( (LA16_73==THIRTEEN) && (synpred4_Date())) {s = 117;}

                        else if ( (LA16_73==FOURTEEN) && (synpred4_Date())) {s = 118;}

                        else if ( (LA16_73==FIFTEEN) && (synpred4_Date())) {s = 119;}

                        else if ( (LA16_73==SIXTEEN) && (synpred4_Date())) {s = 120;}

                        else if ( (LA16_73==SEVENTEEN) && (synpred4_Date())) {s = 121;}

                        else if ( (LA16_73==EIGHTEEN) && (synpred4_Date())) {s = 122;}

                        else if ( (LA16_73==NINETEEN) && (synpred4_Date())) {s = 123;}

                        else if ( (LA16_73==TWENTY) && (synpred4_Date())) {s = 124;}

                        else if ( (LA16_73==THIRTY) && (synpred4_Date())) {s = 125;}

                        else if ( (LA16_73==FIRST) && (synpred4_Date())) {s = 27;}

                        else if ( (LA16_73==SECOND) && (synpred4_Date())) {s = 28;}

                        else if ( (LA16_73==THIRD) && (synpred4_Date())) {s = 29;}

                        else if ( (LA16_73==FOURTH) && (synpred4_Date())) {s = 30;}

                        else if ( (LA16_73==FIFTH) && (synpred4_Date())) {s = 31;}

                        else if ( (LA16_73==SIXTH) && (synpred4_Date())) {s = 32;}

                        else if ( (LA16_73==SEVENTH) && (synpred4_Date())) {s = 33;}

                        else if ( (LA16_73==EIGHTH) && (synpred4_Date())) {s = 34;}

                        else if ( (LA16_73==NINTH) && (synpred4_Date())) {s = 35;}

                        else if ( (LA16_73==TENTH) && (synpred4_Date())) {s = 36;}

                        else if ( (LA16_73==ELEVENTH) && (synpred4_Date())) {s = 37;}

                        else if ( (LA16_73==TWELFTH) && (synpred4_Date())) {s = 38;}

                        else if ( (LA16_73==THIRTEENTH) && (synpred4_Date())) {s = 39;}

                        else if ( (LA16_73==FOURTEENTH) && (synpred4_Date())) {s = 40;}

                        else if ( (LA16_73==FIFTEENTH) && (synpred4_Date())) {s = 41;}

                        else if ( (LA16_73==SIXTEENTH) && (synpred4_Date())) {s = 42;}

                        else if ( (LA16_73==SEVENTEENTH) && (synpred4_Date())) {s = 43;}

                        else if ( (LA16_73==EIGHTEENTH) && (synpred4_Date())) {s = 44;}

                        else if ( (LA16_73==NINETEENTH) && (synpred4_Date())) {s = 45;}

                        else if ( (LA16_73==TWENTIETH) && (synpred4_Date())) {s = 46;}

                        else if ( (LA16_73==TWENTY_FIRST) && (synpred4_Date())) {s = 47;}

                        else if ( (LA16_73==TWENTY_SECOND) && (synpred4_Date())) {s = 48;}

                        else if ( (LA16_73==TWENTY_THIRD) && (synpred4_Date())) {s = 49;}

                        else if ( (LA16_73==TWENTY_FOURTH) && (synpred4_Date())) {s = 50;}

                        else if ( (LA16_73==TWENTY_FIFTH) && (synpred4_Date())) {s = 51;}

                        else if ( (LA16_73==TWENTY_SIXTH) && (synpred4_Date())) {s = 52;}

                        else if ( (LA16_73==TWENTY_SEVENTH) && (synpred4_Date())) {s = 53;}

                        else if ( (LA16_73==TWENTY_EIGHTH) && (synpred4_Date())) {s = 54;}

                        else if ( (LA16_73==TWENTY_NINTH) && (synpred4_Date())) {s = 55;}

                        else if ( (LA16_73==THIRTIETH) && (synpred4_Date())) {s = 56;}

                        else if ( (LA16_73==THIRTY_FIRST) && (synpred4_Date())) {s = 57;}

                        else if ( (LA16_73==JANUARY) && (synpred4_Date())) {s = 126;}

                        else if ( (LA16_73==FEBRUARY) && (synpred4_Date())) {s = 127;}

                        else if ( (LA16_73==MARCH) && (synpred4_Date())) {s = 128;}

                        else if ( (LA16_73==APRIL) && (synpred4_Date())) {s = 129;}

                        else if ( (LA16_73==MAY) && (synpred4_Date())) {s = 130;}

                        else if ( (LA16_73==JUNE) && (synpred4_Date())) {s = 131;}

                        else if ( (LA16_73==JULY) && (synpred4_Date())) {s = 132;}

                        else if ( (LA16_73==AUGUST) && (synpred4_Date())) {s = 133;}

                        else if ( (LA16_73==SEPTEMBER) && (synpred4_Date())) {s = 134;}

                        else if ( (LA16_73==OCTOBER) && (synpred4_Date())) {s = 135;}

                        else if ( (LA16_73==NOVEMBER) && (synpred4_Date())) {s = 136;}

                        else if ( (LA16_73==DECEMBER) && (synpred4_Date())) {s = 137;}

                        else if ( (LA16_73==DAY) ) {s = 138;}

                         
                        input.seek(index16_73);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA16_149 = input.LA(1);

                         
                        int index16_149 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_Date()) ) {s = 208;}

                        else if ( (true) ) {s = 71;}

                         
                        input.seek(index16_149);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA16_148 = input.LA(1);

                         
                        int index16_148 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_Date()) ) {s = 208;}

                        else if ( (true) ) {s = 71;}

                         
                        input.seek(index16_148);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA16_147 = input.LA(1);

                         
                        int index16_147 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_Date()) ) {s = 208;}

                        else if ( (true) ) {s = 71;}

                         
                        input.seek(index16_147);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA16_146 = input.LA(1);

                         
                        int index16_146 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_Date()) ) {s = 208;}

                        else if ( (true) ) {s = 71;}

                         
                        input.seek(index16_146);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA16_145 = input.LA(1);

                         
                        int index16_145 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_Date()) ) {s = 208;}

                        else if ( (true) ) {s = 71;}

                         
                        input.seek(index16_145);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA16_144 = input.LA(1);

                         
                        int index16_144 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_Date()) ) {s = 208;}

                        else if ( (true) ) {s = 71;}

                         
                        input.seek(index16_144);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA16_143 = input.LA(1);

                         
                        int index16_143 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_Date()) ) {s = 208;}

                        else if ( (true) ) {s = 71;}

                         
                        input.seek(index16_143);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA16_75 = input.LA(1);

                         
                        int index16_75 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA16_75==FIRST) && (synpred4_Date())) {s = 84;}

                        else if ( (LA16_75==NINE) ) {s = 77;}

                        else if ( (LA16_75==SIX) ) {s = 81;}

                        else if ( (LA16_75==SIXTH) && (synpred4_Date())) {s = 78;}

                        else if ( (LA16_75==FOUR) ) {s = 79;}

                        else if ( (LA16_75==EIGHTH) && (synpred4_Date())) {s = 80;}

                        else if ( (LA16_75==EIGHT) ) {s = 83;}

                        else if ( (LA16_75==SEVEN) ) {s = 82;}

                        else if ( (LA16_75==SEVENTH) && (synpred4_Date())) {s = 86;}

                        else if ( (LA16_75==FIFTH) && (synpred4_Date())) {s = 87;}

                        else if ( (LA16_75==NINTH) && (synpred4_Date())) {s = 88;}

                        else if ( (LA16_75==FIVE) ) {s = 85;}

                        else if ( (LA16_75==FOURTH) && (synpred4_Date())) {s = 89;}

                        else if ( (LA16_75==THREE) ) {s = 91;}

                        else if ( (LA16_75==ONE) ) {s = 90;}

                        else if ( (LA16_75==TWO) ) {s = 92;}

                        else if ( (LA16_75==THIRD) && (synpred4_Date())) {s = 93;}

                        else if ( (LA16_75==SECOND) && (synpred4_Date())) {s = 94;}

                         
                        input.seek(index16_75);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA16_26 = input.LA(1);

                         
                        int index16_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA16_26==WHITE_SPACE) ) {s = 95;}

                        else if ( (LA16_26==DASH) ) {s = 96;}

                        else if ( (LA16_26==ONE) ) {s = 97;}

                        else if ( (LA16_26==FIRST) && (synpred4_Date())) {s = 98;}

                         
                        input.seek(index16_26);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA16_96 = input.LA(1);

                         
                        int index16_96 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA16_96==ONE) ) {s = 97;}

                        else if ( (LA16_96==FIRST) && (synpred4_Date())) {s = 98;}

                         
                        input.seek(index16_96);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA16_0 = input.LA(1);

                         
                        int index16_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA16_0==THE) ) {s = 1;}

                        else if ( (LA16_0==INT_1_TO_9) ) {s = 2;}

                        else if ( (LA16_0==INT_01_TO_12) ) {s = 3;}

                        else if ( (LA16_0==INT_13_TO_23) ) {s = 4;}

                        else if ( (LA16_0==INT_24_TO_31) ) {s = 5;}

                        else if ( (LA16_0==ONE) ) {s = 6;}

                        else if ( (LA16_0==TWO) ) {s = 7;}

                        else if ( (LA16_0==THREE) ) {s = 8;}

                        else if ( (LA16_0==FOUR) ) {s = 9;}

                        else if ( (LA16_0==FIVE) ) {s = 10;}

                        else if ( (LA16_0==SIX) ) {s = 11;}

                        else if ( (LA16_0==SEVEN) ) {s = 12;}

                        else if ( (LA16_0==EIGHT) ) {s = 13;}

                        else if ( (LA16_0==NINE) ) {s = 14;}

                        else if ( (LA16_0==TEN) ) {s = 15;}

                        else if ( (LA16_0==ELEVEN) ) {s = 16;}

                        else if ( (LA16_0==TWELVE) ) {s = 17;}

                        else if ( (LA16_0==THIRTEEN) ) {s = 18;}

                        else if ( (LA16_0==FOURTEEN) ) {s = 19;}

                        else if ( (LA16_0==FIFTEEN) ) {s = 20;}

                        else if ( (LA16_0==SIXTEEN) ) {s = 21;}

                        else if ( (LA16_0==SEVENTEEN) ) {s = 22;}

                        else if ( (LA16_0==EIGHTEEN) ) {s = 23;}

                        else if ( (LA16_0==NINETEEN) ) {s = 24;}

                        else if ( (LA16_0==TWENTY) ) {s = 25;}

                        else if ( (LA16_0==THIRTY) ) {s = 26;}

                        else if ( (LA16_0==FIRST) && (synpred4_Date())) {s = 27;}

                        else if ( (LA16_0==SECOND) && (synpred4_Date())) {s = 28;}

                        else if ( (LA16_0==THIRD) && (synpred4_Date())) {s = 29;}

                        else if ( (LA16_0==FOURTH) && (synpred4_Date())) {s = 30;}

                        else if ( (LA16_0==FIFTH) && (synpred4_Date())) {s = 31;}

                        else if ( (LA16_0==SIXTH) && (synpred4_Date())) {s = 32;}

                        else if ( (LA16_0==SEVENTH) && (synpred4_Date())) {s = 33;}

                        else if ( (LA16_0==EIGHTH) && (synpred4_Date())) {s = 34;}

                        else if ( (LA16_0==NINTH) && (synpred4_Date())) {s = 35;}

                        else if ( (LA16_0==TENTH) && (synpred4_Date())) {s = 36;}

                        else if ( (LA16_0==ELEVENTH) && (synpred4_Date())) {s = 37;}

                        else if ( (LA16_0==TWELFTH) && (synpred4_Date())) {s = 38;}

                        else if ( (LA16_0==THIRTEENTH) && (synpred4_Date())) {s = 39;}

                        else if ( (LA16_0==FOURTEENTH) && (synpred4_Date())) {s = 40;}

                        else if ( (LA16_0==FIFTEENTH) && (synpred4_Date())) {s = 41;}

                        else if ( (LA16_0==SIXTEENTH) && (synpred4_Date())) {s = 42;}

                        else if ( (LA16_0==SEVENTEENTH) && (synpred4_Date())) {s = 43;}

                        else if ( (LA16_0==EIGHTEENTH) && (synpred4_Date())) {s = 44;}

                        else if ( (LA16_0==NINETEENTH) && (synpred4_Date())) {s = 45;}

                        else if ( (LA16_0==TWENTIETH) && (synpred4_Date())) {s = 46;}

                        else if ( (LA16_0==TWENTY_FIRST) && (synpred4_Date())) {s = 47;}

                        else if ( (LA16_0==TWENTY_SECOND) && (synpred4_Date())) {s = 48;}

                        else if ( (LA16_0==TWENTY_THIRD) && (synpred4_Date())) {s = 49;}

                        else if ( (LA16_0==TWENTY_FOURTH) && (synpred4_Date())) {s = 50;}

                        else if ( (LA16_0==TWENTY_FIFTH) && (synpred4_Date())) {s = 51;}

                        else if ( (LA16_0==TWENTY_SIXTH) && (synpred4_Date())) {s = 52;}

                        else if ( (LA16_0==TWENTY_SEVENTH) && (synpred4_Date())) {s = 53;}

                        else if ( (LA16_0==TWENTY_EIGHTH) && (synpred4_Date())) {s = 54;}

                        else if ( (LA16_0==TWENTY_NINTH) && (synpred4_Date())) {s = 55;}

                        else if ( (LA16_0==THIRTIETH) && (synpred4_Date())) {s = 56;}

                        else if ( (LA16_0==THIRTY_FIRST) && (synpred4_Date())) {s = 57;}

                        else if ( (LA16_0==JANUARY) ) {s = 58;}

                        else if ( (LA16_0==FEBRUARY) ) {s = 59;}

                        else if ( (LA16_0==MARCH) ) {s = 60;}

                        else if ( (LA16_0==APRIL) ) {s = 61;}

                        else if ( (LA16_0==MAY) ) {s = 62;}

                        else if ( (LA16_0==JUNE) ) {s = 63;}

                        else if ( (LA16_0==JULY) ) {s = 64;}

                        else if ( (LA16_0==AUGUST) ) {s = 65;}

                        else if ( (LA16_0==SEPTEMBER) ) {s = 66;}

                        else if ( (LA16_0==OCTOBER) ) {s = 67;}

                        else if ( (LA16_0==NOVEMBER) ) {s = 68;}

                        else if ( (LA16_0==DECEMBER) ) {s = 69;}

                        else if ( (LA16_0==INT_00||(LA16_0>=INT_32_TO_59 && LA16_0<=INT_60_TO_99)) ) {s = 70;}

                        else if ( ((LA16_0>=IN && LA16_0<=YEAR)||(LA16_0>=THIS && LA16_0<=UPCOMING)||(LA16_0>=WEEK && LA16_0<=YESTERDAY)) ) {s = 71;}

                        else if ( (LA16_0==DAY) ) {s = 72;}

                         
                        input.seek(index16_0);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA16_76 = input.LA(1);

                         
                        int index16_76 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA16_76==DAY) ) {s = 139;}

                        else if ( (LA16_76==NINE) ) {s = 77;}

                        else if ( (LA16_76==FOUR) ) {s = 79;}

                        else if ( (LA16_76==SIX) ) {s = 81;}

                        else if ( (LA16_76==EIGHT) ) {s = 83;}

                        else if ( (LA16_76==FIRST) && (synpred4_Date())) {s = 84;}

                        else if ( (LA16_76==SIXTH) && (synpred4_Date())) {s = 78;}

                        else if ( (LA16_76==EIGHTH) && (synpred4_Date())) {s = 80;}

                        else if ( (LA16_76==THREE) ) {s = 91;}

                        else if ( (LA16_76==SEVEN) ) {s = 82;}

                        else if ( (LA16_76==FIVE) ) {s = 85;}

                        else if ( (LA16_76==SEVENTH) && (synpred4_Date())) {s = 86;}

                        else if ( (LA16_76==FIFTH) && (synpred4_Date())) {s = 87;}

                        else if ( (LA16_76==NINTH) && (synpred4_Date())) {s = 88;}

                        else if ( (LA16_76==ONE) ) {s = 90;}

                        else if ( (LA16_76==FOURTH) && (synpred4_Date())) {s = 89;}

                        else if ( (LA16_76==OF) && (synpred4_Date())) {s = 152;}

                        else if ( (LA16_76==JANUARY) ) {s = 140;}

                        else if ( (LA16_76==FEBRUARY) ) {s = 141;}

                        else if ( (LA16_76==MARCH) ) {s = 142;}

                        else if ( (LA16_76==APRIL) ) {s = 143;}

                        else if ( (LA16_76==MAY) ) {s = 144;}

                        else if ( (LA16_76==JUNE) ) {s = 145;}

                        else if ( (LA16_76==JULY) ) {s = 146;}

                        else if ( (LA16_76==AUGUST) ) {s = 147;}

                        else if ( (LA16_76==SEPTEMBER) ) {s = 148;}

                        else if ( (LA16_76==OCTOBER) ) {s = 149;}

                        else if ( (LA16_76==NOVEMBER) ) {s = 150;}

                        else if ( (LA16_76==DECEMBER) ) {s = 151;}

                        else if ( (LA16_76==THIRD) && (synpred4_Date())) {s = 93;}

                        else if ( (LA16_76==TWO) ) {s = 92;}

                        else if ( (LA16_76==SECOND) && (synpred4_Date())) {s = 94;}

                        else if ( (LA16_76==YEAR||(LA16_76>=WEEK && LA16_76<=SATURDAY)) ) {s = 71;}

                         
                        input.seek(index16_76);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA16_95 = input.LA(1);

                         
                        int index16_95 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA16_95==DAY) ) {s = 139;}

                        else if ( (LA16_95==YEAR||(LA16_95>=WEEK && LA16_95<=SATURDAY)) ) {s = 71;}

                        else if ( (LA16_95==JANUARY) ) {s = 140;}

                        else if ( (LA16_95==FEBRUARY) ) {s = 141;}

                        else if ( (LA16_95==MARCH) ) {s = 142;}

                        else if ( (LA16_95==APRIL) ) {s = 143;}

                        else if ( (LA16_95==MAY) ) {s = 144;}

                        else if ( (LA16_95==JUNE) ) {s = 145;}

                        else if ( (LA16_95==JULY) ) {s = 146;}

                        else if ( (LA16_95==AUGUST) ) {s = 147;}

                        else if ( (LA16_95==SEPTEMBER) ) {s = 148;}

                        else if ( (LA16_95==OCTOBER) ) {s = 149;}

                        else if ( (LA16_95==NOVEMBER) ) {s = 150;}

                        else if ( (LA16_95==DECEMBER) ) {s = 151;}

                        else if ( (LA16_95==ONE) ) {s = 97;}

                        else if ( (LA16_95==FIRST) && (synpred4_Date())) {s = 98;}

                        else if ( (LA16_95==OF) && (synpred4_Date())) {s = 152;}

                         
                        input.seek(index16_95);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 16, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA25_eotS =
        "\u00d7\uffff";
    static final String DFA25_eofS =
        "\143\uffff\14\u00aa\70\141\2\uffff\1\u00aa\1\uffff\1\141\2\uffff"+
        "\24\141\1\uffff\2\141\22\uffff";
    static final String DFA25_minS =
        "\1\31\105\25\1\36\1\35\1\123\1\35\22\25\1\123\1\35\2\25\1\115\1"+
        "\uffff\1\25\104\24\1\36\1\25\1\24\1\uffff\1\24\1\25\1\123\24\24"+
        "\1\123\2\24\1\26\3\0\7\uffff\3\0\3\uffff\1\26";
    static final String DFA25_maxS =
        "\1\u0086\30\25\1\160\1\150\53\25\1\u0086\1\51\2\160\22\25\2\150"+
        "\2\25\1\u0086\1\uffff\1\25\43\27\1\160\1\150\37\27\1\51\2\122\1"+
        "\uffff\2\122\2\160\22\27\2\150\2\27\1\122\3\0\7\uffff\3\0\3\uffff"+
        "\1\122";
    static final String DFA25_acceptS =
        "\141\uffff\1\4\110\uffff\1\3\36\uffff\5\1\2\2\3\uffff\3\2\1\uffff";
    static final String DFA25_specialS =
        "\u00a8\uffff\1\0\1\14\1\uffff\1\5\1\7\1\uffff\1\13\22\uffff\1\6"+
        "\3\uffff\1\2\1\3\1\1\1\4\7\uffff\1\10\1\11\1\12\3\uffff\1\15}>";
    static final String[] DFA25_transitionS = {
            "\1\1\4\uffff\1\72\1\73\1\74\1\75\1\76\1\77\1\100\1\101\1\102"+
            "\1\103\1\104\1\105\43\uffff\1\2\1\3\1\4\1\5\2\uffff\1\6\1\7"+
            "\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23"+
            "\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37"+
            "\1\40\1\41\1\42\1\43\1\44\1\45\1\46\1\47\1\50\1\51\1\52\1\53"+
            "\1\54\1\55\1\56\1\57\1\60\1\61\1\62\1\63\1\64\1\65\1\66\1\67"+
            "\1\70\1\71",
            "\1\106",
            "\1\107",
            "\1\107",
            "\1\107",
            "\1\107",
            "\1\107",
            "\1\107",
            "\1\107",
            "\1\107",
            "\1\107",
            "\1\107",
            "\1\107",
            "\1\107",
            "\1\107",
            "\1\107",
            "\1\107",
            "\1\107",
            "\1\107",
            "\1\107",
            "\1\107",
            "\1\107",
            "\1\107",
            "\1\107",
            "\1\107",
            "\1\111\27\uffff\1\110\45\uffff\1\112\1\121\1\130\1\123\1\124"+
            "\1\132\1\120\1\125\1\117\14\uffff\1\113\1\131\1\116\1\133\1"+
            "\122\1\127\1\114\1\126\1\115",
            "\1\135\27\uffff\1\134\45\uffff\1\137\24\uffff\1\136",
            "\1\107",
            "\1\107",
            "\1\107",
            "\1\107",
            "\1\107",
            "\1\107",
            "\1\107",
            "\1\107",
            "\1\107",
            "\1\107",
            "\1\107",
            "\1\107",
            "\1\107",
            "\1\107",
            "\1\107",
            "\1\107",
            "\1\107",
            "\1\107",
            "\1\107",
            "\1\107",
            "\1\107",
            "\1\107",
            "\1\107",
            "\1\107",
            "\1\107",
            "\1\107",
            "\1\107",
            "\1\107",
            "\1\107",
            "\1\107",
            "\1\107",
            "\1\140",
            "\1\140",
            "\1\140",
            "\1\140",
            "\1\140",
            "\1\140",
            "\1\140",
            "\1\140",
            "\1\140",
            "\1\140",
            "\1\140",
            "\1\140",
            "\14\141\43\uffff\1\2\1\3\1\4\1\5\2\uffff\1\6\1\7\1\10\1\11"+
            "\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25"+
            "\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\41"+
            "\1\42\1\43\1\44\1\45\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55"+
            "\1\56\1\57\1\60\1\61\1\62\1\63\1\64\1\65\1\66\1\67\1\70\1\71",
            "\1\142\1\143\1\144\1\145\1\146\1\147\1\150\1\151\1\152\1\153"+
            "\1\154\1\155\1\156",
            "\1\112\1\121\1\130\1\123\1\124\1\132\1\120\1\125\1\117\14\uffff"+
            "\1\113\1\131\1\116\1\133\1\122\1\127\1\114\1\126\1\115",
            "\1\142\1\143\1\144\1\145\1\146\1\147\1\150\1\151\1\152\1\153"+
            "\1\154\1\155\1\156\51\uffff\1\112\1\121\1\130\1\123\1\124\1"+
            "\132\1\120\1\125\1\117\14\uffff\1\113\1\131\1\116\1\133\1\122"+
            "\1\127\1\114\1\126\1\115",
            "\1\107",
            "\1\107",
            "\1\107",
            "\1\107",
            "\1\107",
            "\1\107",
            "\1\107",
            "\1\107",
            "\1\107",
            "\1\107",
            "\1\107",
            "\1\107",
            "\1\107",
            "\1\107",
            "\1\107",
            "\1\107",
            "\1\107",
            "\1\107",
            "\1\137\24\uffff\1\136",
            "\1\142\1\143\1\144\1\145\1\146\1\147\1\150\1\151\1\152\1\153"+
            "\1\154\1\155\1\156\51\uffff\1\137\24\uffff\1\136",
            "\1\107",
            "\1\107",
            "\1\157\1\160\1\161\1\162\2\uffff\1\163\1\164\1\165\1\166\1"+
            "\167\1\170\1\171\1\172\1\173\1\174\1\175\1\176\1\177\1\u0080"+
            "\1\u0081\1\u0082\1\u0083\1\u0084\1\u0085\1\u0086\1\u0087\1\u0088"+
            "\1\u0089\1\u008a\1\u008b\1\u008c\1\u008d\1\u008e\1\u008f\1\u0090"+
            "\1\u0091\1\u0092\1\u0093\1\u0094\1\u0095\1\u0096\1\u0097\1\u0098"+
            "\1\u0099\1\u009a\1\u009b\1\u009c\1\u009d\1\u009e\1\u009f\1\u00a0"+
            "\1\u00a1\1\u00a2\1\u00a3\1\u00a4\1\u00a5\1\u00a6",
            "",
            "\1\u00a7",
            "\1\u00aa\1\u00a9\1\uffff\1\u00a8",
            "\1\u00aa\1\u00a9\1\uffff\1\u00a8",
            "\1\u00aa\1\u00a9\1\uffff\1\u00a8",
            "\1\u00aa\1\u00a9\1\uffff\1\u00a8",
            "\1\u00aa\1\u00a9\1\uffff\1\u00a8",
            "\1\u00aa\1\u00a9\1\uffff\1\u00a8",
            "\1\u00aa\1\u00a9\1\uffff\1\u00a8",
            "\1\u00aa\1\u00a9\1\uffff\1\u00a8",
            "\1\u00aa\1\u00a9\1\uffff\1\u00a8",
            "\1\u00aa\1\u00a9\1\uffff\1\u00a8",
            "\1\u00aa\1\u00a9\1\uffff\1\u00a8",
            "\1\u00aa\1\u00a9\1\uffff\1\u00a8",
            "\1\141\1\u00ab\1\uffff\1\u00ac",
            "\1\141\1\u00ab\1\uffff\1\u00ac",
            "\1\141\1\u00ab\1\uffff\1\u00ac",
            "\1\141\1\u00ab\1\uffff\1\u00ac",
            "\1\141\1\u00ab\1\uffff\1\u00ac",
            "\1\141\1\u00ab\1\uffff\1\u00ac",
            "\1\141\1\u00ab\1\uffff\1\u00ac",
            "\1\141\1\u00ab\1\uffff\1\u00ac",
            "\1\141\1\u00ab\1\uffff\1\u00ac",
            "\1\141\1\u00ab\1\uffff\1\u00ac",
            "\1\141\1\u00ab\1\uffff\1\u00ac",
            "\1\141\1\u00ab\1\uffff\1\u00ac",
            "\1\141\1\u00ab\1\uffff\1\u00ac",
            "\1\141\1\u00ab\1\uffff\1\u00ac",
            "\1\141\1\u00ab\1\uffff\1\u00ac",
            "\1\141\1\u00ab\1\uffff\1\u00ac",
            "\1\141\1\u00ab\1\uffff\1\u00ac",
            "\1\141\1\u00ab\1\uffff\1\u00ac",
            "\1\141\1\u00ab\1\uffff\1\u00ac",
            "\1\141\1\u00ab\1\uffff\1\u00ac",
            "\1\141\1\u00ab\1\uffff\1\u00ac",
            "\1\141\1\u00ab\1\uffff\1\u00ac",
            "\1\141\1\u00ab\1\uffff\1\u00ac",
            "\1\141\1\u00ae\1\uffff\1\u00ac\25\uffff\1\u00ad\45\uffff\1"+
            "\u00b2\1\u00b4\1\u00bc\1\u00be\1\u00b6\1\u00b8\1\u00af\1\u00bd"+
            "\1\u00c0\14\uffff\1\u00b1\1\u00bb\1\u00b0\1\u00b7\1\u00b9\1"+
            "\u00bf\1\u00ba\1\u00b3\1\u00b5",
            "\1\141\1\u00c1\1\uffff\1\u00ac\25\uffff\1\u00c2\45\uffff\1"+
            "\u00c4\24\uffff\1\u00c3",
            "\1\141\1\u00ab\1\uffff\1\u00ac",
            "\1\141\1\u00ab\1\uffff\1\u00ac",
            "\1\141\1\u00ab\1\uffff\1\u00ac",
            "\1\141\1\u00ab\1\uffff\1\u00ac",
            "\1\141\1\u00ab\1\uffff\1\u00ac",
            "\1\141\1\u00ab\1\uffff\1\u00ac",
            "\1\141\1\u00ab\1\uffff\1\u00ac",
            "\1\141\1\u00ab\1\uffff\1\u00ac",
            "\1\141\1\u00ab\1\uffff\1\u00ac",
            "\1\141\1\u00ab\1\uffff\1\u00ac",
            "\1\141\1\u00ab\1\uffff\1\u00ac",
            "\1\141\1\u00ab\1\uffff\1\u00ac",
            "\1\141\1\u00ab\1\uffff\1\u00ac",
            "\1\141\1\u00ab\1\uffff\1\u00ac",
            "\1\141\1\u00ab\1\uffff\1\u00ac",
            "\1\141\1\u00ab\1\uffff\1\u00ac",
            "\1\141\1\u00ab\1\uffff\1\u00ac",
            "\1\141\1\u00ab\1\uffff\1\u00ac",
            "\1\141\1\u00ab\1\uffff\1\u00ac",
            "\1\141\1\u00ab\1\uffff\1\u00ac",
            "\1\141\1\u00ab\1\uffff\1\u00ac",
            "\1\141\1\u00ab\1\uffff\1\u00ac",
            "\1\141\1\u00ab\1\uffff\1\u00ac",
            "\1\141\1\u00ab\1\uffff\1\u00ac",
            "\1\141\1\u00ab\1\uffff\1\u00ac",
            "\1\141\1\u00ab\1\uffff\1\u00ac",
            "\1\141\1\u00ab\1\uffff\1\u00ac",
            "\1\141\1\u00ab\1\uffff\1\u00ac",
            "\1\141\1\u00ab\1\uffff\1\u00ac",
            "\1\141\1\u00ab\1\uffff\1\u00ac",
            "\1\141\1\u00ab\1\uffff\1\u00ac",
            "\1\143\1\144\1\145\1\146\1\147\1\150\1\151\1\152\1\153\1\154"+
            "\1\155\1\156",
            "\1\u00c5\1\u00aa\23\uffff\1\u00ca\1\u00c9\35\uffff\3\u00aa"+
            "\1\u00c6\1\u00aa\1\u00c7\1\u00c8\1\u00cb\1\u00cc\1\u00cd",
            "\1\u00aa\1\uffff\1\u00aa\23\uffff\1\u00ca\1\u00c9\35\uffff"+
            "\3\u00aa\1\u00c6\1\u00aa\1\u00c7\1\u00c8\1\u00cb\1\u00cc\1\u00cd",
            "",
            "\1\141\1\uffff\1\141\23\uffff\1\u00cf\1\u00ce\35\uffff\3\141"+
            "\1\u00d0\1\141\1\u00d1\1\u00d2\1\u00d3\1\u00d4\1\u00d5",
            "\1\u00d6\1\141\23\uffff\1\u00cf\1\u00ce\35\uffff\3\141\1\u00d0"+
            "\1\141\1\u00d1\1\u00d2\1\u00d3\1\u00d4\1\u00d5",
            "\1\u00b2\1\u00b4\1\u00bc\1\u00be\1\u00b6\1\u00b8\1\u00af\1"+
            "\u00bd\1\u00c0\14\uffff\1\u00b1\1\u00bb\1\u00b0\1\u00b7\1\u00b9"+
            "\1\u00bf\1\u00ba\1\u00b3\1\u00b5",
            "\1\141\1\uffff\1\141\23\uffff\1\u00cf\1\u00ce\35\uffff\3\141"+
            "\1\u00d0\1\141\1\u00d1\1\u00d2\1\u00d3\1\u00d4\1\u00d5\1\u00b2"+
            "\1\u00b4\1\u00bc\1\u00be\1\u00b6\1\u00b8\1\u00af\1\u00bd\1\u00c0"+
            "\14\uffff\1\u00b1\1\u00bb\1\u00b0\1\u00b7\1\u00b9\1\u00bf\1"+
            "\u00ba\1\u00b3\1\u00b5",
            "\1\141\1\u00ab\1\uffff\1\u00ac",
            "\1\141\1\u00ab\1\uffff\1\u00ac",
            "\1\141\1\u00ab\1\uffff\1\u00ac",
            "\1\141\1\u00ab\1\uffff\1\u00ac",
            "\1\141\1\u00ab\1\uffff\1\u00ac",
            "\1\141\1\u00ab\1\uffff\1\u00ac",
            "\1\141\1\u00ab\1\uffff\1\u00ac",
            "\1\141\1\u00ab\1\uffff\1\u00ac",
            "\1\141\1\u00ab\1\uffff\1\u00ac",
            "\1\141\1\u00ab\1\uffff\1\u00ac",
            "\1\141\1\u00ab\1\uffff\1\u00ac",
            "\1\141\1\u00ab\1\uffff\1\u00ac",
            "\1\141\1\u00ab\1\uffff\1\u00ac",
            "\1\141\1\u00ab\1\uffff\1\u00ac",
            "\1\141\1\u00ab\1\uffff\1\u00ac",
            "\1\141\1\u00ab\1\uffff\1\u00ac",
            "\1\141\1\u00ab\1\uffff\1\u00ac",
            "\1\141\1\u00ab\1\uffff\1\u00ac",
            "\1\141\1\uffff\1\141\23\uffff\1\u00cf\1\u00ce\35\uffff\3\141"+
            "\1\u00d0\1\141\1\u00d1\1\u00d2\1\u00d3\1\u00d4\1\u00d5\1\u00c4"+
            "\24\uffff\1\u00c3",
            "\1\u00c4\24\uffff\1\u00c3",
            "\1\141\1\u00ab\1\uffff\1\u00ac",
            "\1\141\1\u00ab\1\uffff\1\u00ac",
            "\1\u00aa\23\uffff\1\u00ca\1\u00c9\35\uffff\3\u00aa\1\u00c6"+
            "\1\u00aa\1\u00c7\1\u00c8\1\u00cb\1\u00cc\1\u00cd",
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
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "\1\141\23\uffff\1\u00cf\1\u00ce\35\uffff\3\141\1\u00d0\1\141"+
            "\1\u00d1\1\u00d2\1\u00d3\1\u00d4\1\u00d5"
    };

    static final short[] DFA25_eot = DFA.unpackEncodedString(DFA25_eotS);
    static final short[] DFA25_eof = DFA.unpackEncodedString(DFA25_eofS);
    static final char[] DFA25_min = DFA.unpackEncodedStringToUnsignedChars(DFA25_minS);
    static final char[] DFA25_max = DFA.unpackEncodedStringToUnsignedChars(DFA25_maxS);
    static final short[] DFA25_accept = DFA.unpackEncodedString(DFA25_acceptS);
    static final short[] DFA25_special = DFA.unpackEncodedString(DFA25_specialS);
    static final short[][] DFA25_transition;

    static {
        int numStates = DFA25_transitionS.length;
        DFA25_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA25_transition[i] = DFA.unpackEncodedString(DFA25_transitionS[i]);
        }
    }

    class DFA25 extends DFA {

        public DFA25(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 25;
            this.eot = DFA25_eot;
            this.eof = DFA25_eof;
            this.min = DFA25_min;
            this.max = DFA25_max;
            this.accept = DFA25_accept;
            this.special = DFA25_special;
            this.transition = DFA25_transition;
        }
        public String getDescription() {
            return "90:5: ( ( ( THE WHITE_SPACE )? relaxed_day_of_month WHITE_SPACE ( OF WHITE_SPACE )? relaxed_month relaxed_year )=> ( THE WHITE_SPACE )? relaxed_day_of_month WHITE_SPACE ( OF WHITE_SPACE )? relaxed_month relaxed_year | ( relaxed_month WHITE_SPACE relaxed_day_of_month relaxed_year )=> relaxed_month WHITE_SPACE relaxed_day_of_month relaxed_year | ( THE WHITE_SPACE )? relaxed_day_of_month WHITE_SPACE ( OF WHITE_SPACE )? relaxed_month | ( THE WHITE_SPACE )? relaxed_month WHITE_SPACE relaxed_day_of_month )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA25_168 = input.LA(1);

                         
                        int index25_168 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA25_168==WHITE_SPACE) ) {s = 197;}

                        else if ( (LA25_168==AT||(LA25_168>=NOON && LA25_168<=INT_0)||LA25_168==INT_1_TO_9) ) {s = 170;}

                        else if ( (LA25_168==INT_00) ) {s = 198;}

                        else if ( (LA25_168==INT_01_TO_12) ) {s = 199;}

                        else if ( (LA25_168==INT_13_TO_23) ) {s = 200;}

                        else if ( (LA25_168==IN) && (synpred5_Date())) {s = 201;}

                        else if ( (LA25_168==SINGLE_QUOTE) && (synpred5_Date())) {s = 202;}

                        else if ( (LA25_168==INT_24_TO_31) && (synpred5_Date())) {s = 203;}

                        else if ( (LA25_168==INT_32_TO_59) && (synpred5_Date())) {s = 204;}

                        else if ( (LA25_168==INT_60_TO_99) && (synpred5_Date())) {s = 205;}

                         
                        input.seek(index25_168);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA25_199 = input.LA(1);

                         
                        int index25_199 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_Date()) ) {s = 205;}

                        else if ( (true) ) {s = 170;}

                         
                        input.seek(index25_199);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA25_197 = input.LA(1);

                         
                        int index25_197 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA25_197==AT||(LA25_197>=NOON && LA25_197<=INT_0)||LA25_197==INT_1_TO_9) ) {s = 170;}

                        else if ( (LA25_197==INT_00) ) {s = 198;}

                        else if ( (LA25_197==INT_01_TO_12) ) {s = 199;}

                        else if ( (LA25_197==INT_13_TO_23) ) {s = 200;}

                        else if ( (LA25_197==IN) && (synpred5_Date())) {s = 201;}

                        else if ( (LA25_197==SINGLE_QUOTE) && (synpred5_Date())) {s = 202;}

                        else if ( (LA25_197==INT_24_TO_31) && (synpred5_Date())) {s = 203;}

                        else if ( (LA25_197==INT_32_TO_59) && (synpred5_Date())) {s = 204;}

                        else if ( (LA25_197==INT_60_TO_99) && (synpred5_Date())) {s = 205;}

                         
                        input.seek(index25_197);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA25_198 = input.LA(1);

                         
                        int index25_198 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_Date()) ) {s = 205;}

                        else if ( (true) ) {s = 170;}

                         
                        input.seek(index25_198);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA25_200 = input.LA(1);

                         
                        int index25_200 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_Date()) ) {s = 205;}

                        else if ( (true) ) {s = 170;}

                         
                        input.seek(index25_200);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA25_171 = input.LA(1);

                         
                        int index25_171 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA25_171==IN) && (synpred6_Date())) {s = 206;}

                        else if ( (LA25_171==SINGLE_QUOTE) && (synpred6_Date())) {s = 207;}

                        else if ( (LA25_171==INT_00) ) {s = 208;}

                        else if ( (LA25_171==INT_01_TO_12) ) {s = 209;}

                        else if ( (LA25_171==INT_13_TO_23) ) {s = 210;}

                        else if ( (LA25_171==INT_24_TO_31) && (synpred6_Date())) {s = 211;}

                        else if ( (LA25_171==INT_32_TO_59) && (synpred6_Date())) {s = 212;}

                        else if ( (LA25_171==INT_60_TO_99) && (synpred6_Date())) {s = 213;}

                        else if ( (LA25_171==EOF||LA25_171==STRING||LA25_171==AT||(LA25_171>=NOON && LA25_171<=INT_0)||LA25_171==INT_1_TO_9) ) {s = 97;}

                         
                        input.seek(index25_171);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA25_193 = input.LA(1);

                         
                        int index25_193 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA25_193==ONE) ) {s = 196;}

                        else if ( (LA25_193==IN) && (synpred6_Date())) {s = 206;}

                        else if ( (LA25_193==SINGLE_QUOTE) && (synpred6_Date())) {s = 207;}

                        else if ( (LA25_193==INT_00) ) {s = 208;}

                        else if ( (LA25_193==INT_01_TO_12) ) {s = 209;}

                        else if ( (LA25_193==INT_13_TO_23) ) {s = 210;}

                        else if ( (LA25_193==INT_24_TO_31) && (synpred6_Date())) {s = 211;}

                        else if ( (LA25_193==INT_32_TO_59) && (synpred6_Date())) {s = 212;}

                        else if ( (LA25_193==INT_60_TO_99) && (synpred6_Date())) {s = 213;}

                        else if ( (LA25_193==EOF||LA25_193==STRING||LA25_193==AT||(LA25_193>=NOON && LA25_193<=INT_0)||LA25_193==INT_1_TO_9) ) {s = 97;}

                        else if ( (LA25_193==FIRST) ) {s = 195;}

                         
                        input.seek(index25_193);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA25_172 = input.LA(1);

                         
                        int index25_172 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA25_172==WHITE_SPACE) ) {s = 214;}

                        else if ( (LA25_172==AT||(LA25_172>=NOON && LA25_172<=INT_0)||LA25_172==INT_1_TO_9) ) {s = 97;}

                        else if ( (LA25_172==INT_00) ) {s = 208;}

                        else if ( (LA25_172==INT_01_TO_12) ) {s = 209;}

                        else if ( (LA25_172==INT_13_TO_23) ) {s = 210;}

                        else if ( (LA25_172==IN) && (synpred6_Date())) {s = 206;}

                        else if ( (LA25_172==INT_24_TO_31) && (synpred6_Date())) {s = 211;}

                        else if ( (LA25_172==INT_32_TO_59) && (synpred6_Date())) {s = 212;}

                        else if ( (LA25_172==INT_60_TO_99) && (synpred6_Date())) {s = 213;}

                        else if ( (LA25_172==SINGLE_QUOTE) && (synpred6_Date())) {s = 207;}

                         
                        input.seek(index25_172);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA25_208 = input.LA(1);

                         
                        int index25_208 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_Date()) ) {s = 213;}

                        else if ( (true) ) {s = 97;}

                         
                        input.seek(index25_208);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA25_209 = input.LA(1);

                         
                        int index25_209 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_Date()) ) {s = 213;}

                        else if ( (true) ) {s = 97;}

                         
                        input.seek(index25_209);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA25_210 = input.LA(1);

                         
                        int index25_210 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_Date()) ) {s = 213;}

                        else if ( (true) ) {s = 97;}

                         
                        input.seek(index25_210);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA25_174 = input.LA(1);

                         
                        int index25_174 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA25_174==ONE) ) {s = 178;}

                        else if ( (LA25_174==IN) && (synpred6_Date())) {s = 206;}

                        else if ( (LA25_174==SINGLE_QUOTE) && (synpred6_Date())) {s = 207;}

                        else if ( (LA25_174==INT_00) ) {s = 208;}

                        else if ( (LA25_174==INT_01_TO_12) ) {s = 209;}

                        else if ( (LA25_174==INT_13_TO_23) ) {s = 210;}

                        else if ( (LA25_174==INT_24_TO_31) && (synpred6_Date())) {s = 211;}

                        else if ( (LA25_174==INT_32_TO_59) && (synpred6_Date())) {s = 212;}

                        else if ( (LA25_174==INT_60_TO_99) && (synpred6_Date())) {s = 213;}

                        else if ( (LA25_174==NINTH) ) {s = 181;}

                        else if ( (LA25_174==EIGHTH) ) {s = 179;}

                        else if ( (LA25_174==SEVEN) ) {s = 175;}

                        else if ( (LA25_174==THIRD) ) {s = 176;}

                        else if ( (LA25_174==FOUR) ) {s = 190;}

                        else if ( (LA25_174==SIX) ) {s = 184;}

                        else if ( (LA25_174==FIRST) ) {s = 177;}

                        else if ( (LA25_174==FIVE) ) {s = 182;}

                        else if ( (LA25_174==FIFTH) ) {s = 185;}

                        else if ( (LA25_174==SEVENTH) ) {s = 186;}

                        else if ( (LA25_174==EIGHT) ) {s = 189;}

                        else if ( (LA25_174==TWO) ) {s = 180;}

                        else if ( (LA25_174==FOURTH) ) {s = 183;}

                        else if ( (LA25_174==THREE) ) {s = 188;}

                        else if ( (LA25_174==SECOND) ) {s = 187;}

                        else if ( (LA25_174==SIXTH) ) {s = 191;}

                        else if ( (LA25_174==NINE) ) {s = 192;}

                        else if ( (LA25_174==EOF||LA25_174==STRING||LA25_174==AT||(LA25_174>=NOON && LA25_174<=INT_0)||LA25_174==INT_1_TO_9) ) {s = 97;}

                         
                        input.seek(index25_174);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA25_169 = input.LA(1);

                         
                        int index25_169 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA25_169==EOF||LA25_169==STRING||LA25_169==AT||(LA25_169>=NOON && LA25_169<=INT_0)||LA25_169==INT_1_TO_9) ) {s = 170;}

                        else if ( (LA25_169==INT_00) ) {s = 198;}

                        else if ( (LA25_169==INT_01_TO_12) ) {s = 199;}

                        else if ( (LA25_169==INT_13_TO_23) ) {s = 200;}

                        else if ( (LA25_169==IN) && (synpred5_Date())) {s = 201;}

                        else if ( (LA25_169==INT_24_TO_31) && (synpred5_Date())) {s = 203;}

                        else if ( (LA25_169==INT_32_TO_59) && (synpred5_Date())) {s = 204;}

                        else if ( (LA25_169==INT_60_TO_99) && (synpred5_Date())) {s = 205;}

                        else if ( (LA25_169==SINGLE_QUOTE) && (synpred5_Date())) {s = 202;}

                         
                        input.seek(index25_169);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA25_214 = input.LA(1);

                         
                        int index25_214 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA25_214==AT||(LA25_214>=NOON && LA25_214<=INT_0)||LA25_214==INT_1_TO_9) ) {s = 97;}

                        else if ( (LA25_214==INT_00) ) {s = 208;}

                        else if ( (LA25_214==INT_01_TO_12) ) {s = 209;}

                        else if ( (LA25_214==INT_13_TO_23) ) {s = 210;}

                        else if ( (LA25_214==IN) && (synpred6_Date())) {s = 206;}

                        else if ( (LA25_214==SINGLE_QUOTE) && (synpred6_Date())) {s = 207;}

                        else if ( (LA25_214==INT_24_TO_31) && (synpred6_Date())) {s = 211;}

                        else if ( (LA25_214==INT_32_TO_59) && (synpred6_Date())) {s = 212;}

                        else if ( (LA25_214==INT_60_TO_99) && (synpred6_Date())) {s = 213;}

                         
                        input.seek(index25_214);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 25, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA29_eotS =
        "\22\uffff";
    static final String DFA29_eofS =
        "\5\uffff\6\13\7\uffff";
    static final String DFA29_minS =
        "\2\25\2\52\1\25\6\24\1\uffff\1\31\1\uffff\1\25\1\54\1\25\1\52";
    static final String DFA29_maxS =
        "\1\27\3\122\1\25\6\122\1\uffff\1\31\1\uffff\1\25\1\54\1\25\1\122";
    static final String DFA29_acceptS =
        "\13\uffff\1\1\1\uffff\1\2\4\uffff";
    static final String DFA29_specialS =
        "\22\uffff}>";
    static final String[] DFA29_transitionS = {
            "\1\2\1\uffff\1\1",
            "\1\3\24\uffff\1\13\1\4\40\uffff\1\5\1\uffff\1\6\1\7\1\10\1"+
            "\11\1\12",
            "\1\13\1\4\40\uffff\1\5\1\uffff\1\6\1\7\1\10\1\11\1\12",
            "\1\13\1\4\40\uffff\1\5\1\uffff\1\6\1\7\1\10\1\11\1\12",
            "\1\14",
            "\2\13\1\uffff\1\13\64\uffff\1\15\1\uffff\5\15",
            "\2\13\1\uffff\1\13\64\uffff\1\15\1\uffff\5\15",
            "\2\13\1\uffff\1\13\64\uffff\1\15\1\uffff\5\15",
            "\2\13\1\uffff\1\13\64\uffff\1\15\1\uffff\5\15",
            "\2\13\1\uffff\1\13\64\uffff\1\15\1\uffff\5\15",
            "\2\13\1\uffff\1\13\64\uffff\1\15\1\uffff\5\15",
            "",
            "\1\16",
            "",
            "\1\17",
            "\1\20",
            "\1\21",
            "\1\13\41\uffff\1\5\1\uffff\1\6\1\7\1\10\1\11\1\12"
    };

    static final short[] DFA29_eot = DFA.unpackEncodedString(DFA29_eotS);
    static final short[] DFA29_eof = DFA.unpackEncodedString(DFA29_eofS);
    static final char[] DFA29_min = DFA.unpackEncodedStringToUnsignedChars(DFA29_minS);
    static final char[] DFA29_max = DFA.unpackEncodedStringToUnsignedChars(DFA29_maxS);
    static final short[] DFA29_accept = DFA.unpackEncodedString(DFA29_acceptS);
    static final short[] DFA29_special = DFA.unpackEncodedString(DFA29_specialS);
    static final short[][] DFA29_transition;

    static {
        int numStates = DFA29_transitionS.length;
        DFA29_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA29_transition[i] = DFA.unpackEncodedString(DFA29_transitionS[i]);
        }
    }

    class DFA29 extends DFA {

        public DFA29(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 29;
            this.eot = DFA29_eot;
            this.eof = DFA29_eof;
            this.min = DFA29_min;
            this.max = DFA29_max;
            this.accept = DFA29_accept;
            this.special = DFA29_special;
            this.transition = DFA29_transition;
        }
        public String getDescription() {
            return "129:1: relaxed_year : ( relaxed_year_prefix ( SINGLE_QUOTE )? int_00_to_99_mandatory_prefix -> ^( YEAR_OF int_00_to_99_mandatory_prefix ) | relaxed_year_prefix int_four_digits -> ^( YEAR_OF int_four_digits ) );";
        }
    }
    static final String DFA37_eotS =
        "\110\uffff";
    static final String DFA37_eofS =
        "\57\uffff\30\2\1\uffff";
    static final String DFA37_minS =
        "\1\32\1\25\1\uffff\31\25\2\uffff\2\32\1\123\1\32\11\25\1\123\1\32"+
        "\1\25\1\uffff\30\24\1\uffff";
    static final String DFA37_maxS =
        "\1\147\1\25\1\uffff\27\25\1\133\1\123\2\uffff\2\100\2\133\11\25"+
        "\2\123\1\25\1\uffff\27\u0088\1\117\1\uffff";
    static final String DFA37_acceptS =
        "\2\uffff\1\1\31\uffff\1\3\1\5\20\uffff\1\2\30\uffff\1\4";
    static final String DFA37_specialS =
        "\110\uffff}>";
    static final String[] DFA37_transitionS = {
            "\1\34\3\uffff\14\34\1\uffff\1\2\1\34\2\uffff\1\1\5\2\3\uffff"+
            "\11\34\3\35\11\uffff\1\3\1\4\1\5\1\6\2\uffff\1\7\1\10\1\11\1"+
            "\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1"+
            "\26\1\27\1\30\1\31\1\32\1\33",
            "\1\36",
            "",
            "\1\37",
            "\1\37",
            "\1\37",
            "\1\37",
            "\1\37",
            "\1\37",
            "\1\37",
            "\1\37",
            "\1\37",
            "\1\37",
            "\1\37",
            "\1\37",
            "\1\37",
            "\1\37",
            "\1\37",
            "\1\37",
            "\1\37",
            "\1\37",
            "\1\37",
            "\1\37",
            "\1\37",
            "\1\37",
            "\1\37",
            "\1\41\27\uffff\1\40\45\uffff\1\43\1\46\1\52\1\42\1\44\1\51"+
            "\1\45\1\47\1\50",
            "\1\54\27\uffff\1\53\45\uffff\1\55",
            "",
            "",
            "\1\56\3\uffff\14\56\2\uffff\1\56\3\uffff\5\2\3\uffff\11\56",
            "\1\102\3\uffff\1\66\1\67\1\70\1\71\1\72\1\73\1\74\1\75\1\76"+
            "\1\77\1\100\1\101\2\uffff\1\105\13\uffff\1\103\1\104\1\57\1"+
            "\60\1\61\1\62\1\63\1\64\1\65",
            "\1\43\1\46\1\52\1\42\1\44\1\51\1\45\1\47\1\50",
            "\1\102\3\uffff\1\66\1\67\1\70\1\71\1\72\1\73\1\74\1\75\1\76"+
            "\1\77\1\100\1\101\2\uffff\1\105\13\uffff\1\103\1\104\1\57\1"+
            "\60\1\61\1\62\1\63\1\64\1\65\22\uffff\1\43\1\46\1\52\1\42\1"+
            "\44\1\51\1\45\1\47\1\50",
            "\1\37",
            "\1\37",
            "\1\37",
            "\1\37",
            "\1\37",
            "\1\37",
            "\1\37",
            "\1\37",
            "\1\37",
            "\1\55",
            "\1\102\3\uffff\1\66\1\67\1\70\1\71\1\72\1\73\1\74\1\75\1\76"+
            "\1\77\1\100\1\101\2\uffff\1\105\13\uffff\1\103\1\104\1\57\1"+
            "\60\1\61\1\62\1\63\1\64\1\65\22\uffff\1\55",
            "\1\37",
            "",
            "\1\2\1\106\1\uffff\1\2\160\uffff\1\2",
            "\1\2\1\106\1\uffff\1\2\160\uffff\1\2",
            "\1\2\1\106\1\uffff\1\2\160\uffff\1\2",
            "\1\2\1\106\1\uffff\1\2\160\uffff\1\2",
            "\1\2\1\106\1\uffff\1\2\160\uffff\1\2",
            "\1\2\1\106\1\uffff\1\2\160\uffff\1\2",
            "\1\2\1\106\1\uffff\1\2\160\uffff\1\2",
            "\1\2\1\106\1\uffff\1\2\160\uffff\1\2",
            "\1\2\1\106\1\uffff\1\2\160\uffff\1\2",
            "\1\2\1\106\1\uffff\1\2\160\uffff\1\2",
            "\1\2\1\106\1\uffff\1\2\160\uffff\1\2",
            "\1\2\1\106\1\uffff\1\2\160\uffff\1\2",
            "\1\2\1\106\1\uffff\1\2\160\uffff\1\2",
            "\1\2\1\106\1\uffff\1\2\160\uffff\1\2",
            "\1\2\1\106\1\uffff\1\2\160\uffff\1\2",
            "\1\2\1\106\1\uffff\1\2\160\uffff\1\2",
            "\1\2\1\106\1\uffff\1\2\160\uffff\1\2",
            "\1\2\1\106\1\uffff\1\2\160\uffff\1\2",
            "\1\2\1\106\1\uffff\1\2\160\uffff\1\2",
            "\1\2\1\106\1\uffff\1\2\160\uffff\1\2",
            "\1\2\1\106\1\uffff\1\2\160\uffff\1\2",
            "\1\2\1\106\1\uffff\1\2\160\uffff\1\2",
            "\1\2\1\106\1\uffff\1\2\160\uffff\1\2",
            "\1\2\1\uffff\1\2\36\uffff\1\107\1\uffff\1\107\21\uffff\7\2",
            ""
    };

    static final short[] DFA37_eot = DFA.unpackEncodedString(DFA37_eotS);
    static final short[] DFA37_eof = DFA.unpackEncodedString(DFA37_eofS);
    static final char[] DFA37_min = DFA.unpackEncodedStringToUnsignedChars(DFA37_minS);
    static final char[] DFA37_max = DFA.unpackEncodedStringToUnsignedChars(DFA37_maxS);
    static final short[] DFA37_accept = DFA.unpackEncodedString(DFA37_acceptS);
    static final short[] DFA37_special = DFA.unpackEncodedString(DFA37_specialS);
    static final short[][] DFA37_transition;

    static {
        int numStates = DFA37_transitionS.length;
        DFA37_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA37_transition[i] = DFA.unpackEncodedString(DFA37_transitionS[i]);
        }
    }

    class DFA37 extends DFA {

        public DFA37(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 37;
            this.eot = DFA37_eot;
            this.eof = DFA37_eof;
            this.min = DFA37_min;
            this.max = DFA37_max;
            this.accept = DFA37_accept;
            this.special = DFA37_special;
            this.transition = DFA37_transition;
        }
        public String getDescription() {
            return "177:1: relative_date : ( relative_prefix WHITE_SPACE relative_target ( 's' )? -> ^( RELATIVE_DATE ^( SEEK relative_prefix relative_target ) ) | implicit_prefix WHITE_SPACE relative_target -> ^( RELATIVE_DATE ^( SEEK implicit_prefix relative_target ) ) | relative_target -> ^( RELATIVE_DATE ^( SEEK DIRECTION[\">\"] SEEK_BY[\"by_day\"] INT[\"0\"] relative_target ) ) | spelled_or_int_01_to_31_optional_prefix WHITE_SPACE relative_target WHITE_SPACE relative_suffix -> ^( RELATIVE_DATE ^( SEEK relative_suffix spelled_or_int_01_to_31_optional_prefix relative_target ) ) | named_relative_date );";
        }
    }
    static final String DFA76_eotS =
        "\45\uffff";
    static final String DFA76_eofS =
        "\24\uffff\1\32\1\43\1\uffff\1\32\12\uffff\1\43\2\uffff";
    static final String DFA76_minS =
        "\1\123\23\uffff\2\24\1\123\1\24\12\uffff\1\24\2\uffff";
    static final String DFA76_maxS =
        "\1\147\23\uffff\1\133\1\123\2\133\12\uffff\1\123\2\uffff";
    static final String DFA76_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1"+
        "\15\1\16\1\17\1\20\1\21\1\22\1\23\4\uffff\1\30\1\26\1\24\1\31\1"+
        "\35\1\25\1\33\1\34\1\32\1\27\1\uffff\1\36\1\37";
    static final String DFA76_specialS =
        "\45\uffff}>";
    static final String[] DFA76_transitionS = {
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
            "\1\32\1\27\1\uffff\1\32\25\uffff\1\26\45\uffff\1\35\1\31\1"+
            "\41\1\30\1\33\1\40\1\36\1\37\1\34",
            "\1\43\1\42\1\uffff\1\43\25\uffff\1\44\45\uffff\1\44",
            "\1\35\1\31\1\41\1\30\1\33\1\40\1\36\1\37\1\34",
            "\1\32\1\uffff\1\32\3\uffff\1\32\2\uffff\20\32\13\uffff\11\32"+
            "\10\uffff\12\32\1\35\1\31\1\41\1\30\1\33\1\40\1\36\1\37\1\34",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\43\1\uffff\1\43\3\uffff\1\43\2\uffff\20\43\13\uffff\11\43"+
            "\10\uffff\12\43\1\44",
            "",
            ""
    };

    static final short[] DFA76_eot = DFA.unpackEncodedString(DFA76_eotS);
    static final short[] DFA76_eof = DFA.unpackEncodedString(DFA76_eofS);
    static final char[] DFA76_min = DFA.unpackEncodedStringToUnsignedChars(DFA76_minS);
    static final char[] DFA76_max = DFA.unpackEncodedStringToUnsignedChars(DFA76_maxS);
    static final short[] DFA76_accept = DFA.unpackEncodedString(DFA76_acceptS);
    static final short[] DFA76_special = DFA.unpackEncodedString(DFA76_specialS);
    static final short[][] DFA76_transition;

    static {
        int numStates = DFA76_transitionS.length;
        DFA76_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA76_transition[i] = DFA.unpackEncodedString(DFA76_transitionS[i]);
        }
    }

    class DFA76 extends DFA {

        public DFA76(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 76;
            this.eot = DFA76_eot;
            this.eof = DFA76_eof;
            this.min = DFA76_min;
            this.max = DFA76_max;
            this.accept = DFA76_accept;
            this.special = DFA76_special;
            this.transition = DFA76_transition;
        }
        public String getDescription() {
            return "331:1: spelled_one_to_thirty_one : ( ONE -> INT[\"1\"] | TWO -> INT[\"2\"] | THREE -> INT[\"3\"] | FOUR -> INT[\"4\"] | FIVE -> INT[\"5\"] | SIX -> INT[\"6\"] | SEVEN -> INT[\"7\"] | EIGHT -> INT[\"8\"] | NINE -> INT[\"9\"] | TEN -> INT[\"10\"] | ELEVEN -> INT[\"11\"] | TWELVE -> INT[\"12\"] | THIRTEEN -> INT[\"13\"] | FOURTEEN -> INT[\"14\"] | FIFTEEN -> INT[\"15\"] | SIXTEEN -> INT[\"16\"] | SEVENTEEN -> INT[\"17\"] | EIGHTEEN -> INT[\"18\"] | NINETEEN -> INT[\"19\"] | TWENTY -> INT[\"20\"] | TWENTY ( DASH | WHITE_SPACE )? ONE -> INT[\"21\"] | TWENTY ( DASH | WHITE_SPACE )? TWO -> INT[\"22\"] | TWENTY ( DASH | WHITE_SPACE )? THREE -> INT[\"23\"] | TWENTY ( DASH | WHITE_SPACE )? FOUR -> INT[\"24\"] | TWENTY ( DASH | WHITE_SPACE )? FIVE -> INT[\"25\"] | TWENTY ( DASH | WHITE_SPACE )? SIX -> INT[\"26\"] | TWENTY ( DASH | WHITE_SPACE )? SEVEN -> INT[\"27\"] | TWENTY ( DASH | WHITE_SPACE )? EIGHT -> INT[\"28\"] | TWENTY ( DASH | WHITE_SPACE )? NINE -> INT[\"29\"] | THIRTY -> INT[\"30\"] | THIRTY ( DASH | WHITE_SPACE )? ONE -> INT[\"31\"] );";
        }
    }
    static final String DFA97_eotS =
        "\43\uffff";
    static final String DFA97_eofS =
        "\43\uffff";
    static final String DFA97_minS =
        "\1\146\25\uffff\1\25\12\uffff\2\150";
    static final String DFA97_maxS =
        "\1\u0086\25\uffff\1\160\12\uffff\2\160";
    static final String DFA97_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1"+
        "\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\uffff\1\26\1\27\1"+
        "\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37\2\uffff";
    static final String DFA97_specialS =
        "\43\uffff}>";
    static final String[] DFA97_transitionS = {
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
            "\1\42\27\uffff\1\41\72\uffff\1\25\1\27\1\30\1\31\1\32\1\33"+
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

    static final short[] DFA97_eot = DFA.unpackEncodedString(DFA97_eotS);
    static final short[] DFA97_eof = DFA.unpackEncodedString(DFA97_eofS);
    static final char[] DFA97_min = DFA.unpackEncodedStringToUnsignedChars(DFA97_minS);
    static final char[] DFA97_max = DFA.unpackEncodedStringToUnsignedChars(DFA97_maxS);
    static final short[] DFA97_accept = DFA.unpackEncodedString(DFA97_acceptS);
    static final short[] DFA97_special = DFA.unpackEncodedString(DFA97_specialS);
    static final short[][] DFA97_transition;

    static {
        int numStates = DFA97_transitionS.length;
        DFA97_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA97_transition[i] = DFA.unpackEncodedString(DFA97_transitionS[i]);
        }
    }

    class DFA97 extends DFA {

        public DFA97(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 97;
            this.eot = DFA97_eot;
            this.eof = DFA97_eof;
            this.min = DFA97_min;
            this.max = DFA97_max;
            this.accept = DFA97_accept;
            this.special = DFA97_special;
            this.transition = DFA97_transition;
        }
        public String getDescription() {
            return "366:1: spelled_first_to_thirty_first : ( FIRST -> INT[\"1\"] | SECOND -> INT[\"2\"] | THIRD -> INT[\"3\"] | FOURTH -> INT[\"4\"] | FIFTH -> INT[\"5\"] | SIXTH -> INT[\"6\"] | SEVENTH -> INT[\"7\"] | EIGHTH -> INT[\"8\"] | NINTH -> INT[\"9\"] | TENTH -> INT[\"10\"] | ELEVENTH -> INT[\"11\"] | TWELFTH -> INT[\"12\"] | THIRTEENTH -> INT[\"13\"] | FOURTEENTH -> INT[\"14\"] | FIFTEENTH -> INT[\"15\"] | SIXTEENTH -> INT[\"16\"] | SEVENTEENTH -> INT[\"17\"] | EIGHTEENTH -> INT[\"18\"] | NINETEENTH -> INT[\"19\"] | TWENTIETH -> INT[\"20\"] | ( TWENTY_FIRST | ( TWENTY ( DASH | WHITE_SPACE )? FIRST ) ) -> INT[\"21\"] | ( TWENTY_SECOND | ( TWENTY ( DASH | WHITE_SPACE )? SECOND ) ) -> INT[\"22\"] | ( TWENTY_THIRD | ( TWENTY ( DASH | WHITE_SPACE )? THIRD ) ) -> INT[\"23\"] | ( TWENTY_FOURTH | ( TWENTY ( DASH | WHITE_SPACE )? FOURTH ) ) -> INT[\"24\"] | ( TWENTY_FIFTH | ( TWENTY ( DASH | WHITE_SPACE )? FIFTH ) ) -> INT[\"25\"] | ( TWENTY_SIXTH | ( TWENTY ( DASH | WHITE_SPACE )? SIXTH ) ) -> INT[\"26\"] | ( TWENTY_SEVENTH | ( TWENTY ( DASH | WHITE_SPACE )? SEVENTH ) ) -> INT[\"27\"] | ( TWENTY_EIGHTH | ( TWENTY ( DASH | WHITE_SPACE )? EIGHTH ) ) -> INT[\"28\"] | ( TWENTY_NINTH | ( TWENTY ( DASH | WHITE_SPACE )? NINTH ) ) -> INT[\"29\"] | THIRTIETH -> INT[\"30\"] | ( THIRTY_FIRST | ( THIRTY ( DASH | WHITE_SPACE )? FIRST ) ) -> INT[\"31\"] );";
        }
    }
 

    public static final BitSet FOLLOW_date_time_in_search152 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_text_in_search154 = new BitSet(new long[]{0xFF1F9BFFC6000002L,0xFFFFFFFFFFFFFE0FL,0x000000000000007FL});
    public static final BitSet FOLLOW_text_in_search181 = new BitSet(new long[]{0xFF1F9BFFC6100000L,0xFFFFFFFFFFFFFE0FL,0x000000000000007FL});
    public static final BitSet FOLLOW_date_time_in_search183 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_date_time_in_search195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_text222 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_text224 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_date_in_date_time276 = new BitSet(new long[]{0x0000000000A00002L});
    public static final BitSet FOLLOW_date_time_separator_in_date_time279 = new BitSet(new long[]{0xFF1F9BFFC6000000L,0xFFFFFFFFFFFFFE0FL,0x000000000000007FL});
    public static final BitSet FOLLOW_time_in_date_time281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_time_in_date_time300 = new BitSet(new long[]{0x0000000000A00002L});
    public static final BitSet FOLLOW_time_date_separator_in_date_time303 = new BitSet(new long[]{0xFF1F9BFFC6000000L,0xFFFFFFFFFFFFF00FL,0x000000000000007FL});
    public static final BitSet FOLLOW_date_in_date_time305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_date_time_separator340 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_AT_in_date_time_separator343 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_date_time_separator345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMMA_in_date_time_separator353 = new BitSet(new long[]{0x0000000000600002L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_date_time_separator355 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_AT_in_date_time_separator359 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_date_time_separator361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_time_date_separator378 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_ON_in_time_date_separator381 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_time_date_separator383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMMA_in_time_date_separator391 = new BitSet(new long[]{0x0000000001200002L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_time_date_separator393 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_ON_in_time_date_separator397 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_time_date_separator399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relaxed_date_in_date419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_formal_date_in_date425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relative_date_in_date431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_global_date_prefix_in_date437 = new BitSet(new long[]{0xFF1F9BFFC6000000L,0xFFFFFFFFFFFFF00FL,0x000000000000007FL});
    public static final BitSet FOLLOW_date_in_date439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THE_in_global_date_prefix476 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_global_date_prefix478 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_DAY_in_global_date_prefix482 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_global_date_prefix484 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_prefix_direction_in_global_date_prefix486 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_global_date_prefix488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spelled_or_int_01_to_31_optional_prefix_in_global_date_prefix514 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_global_date_prefix516 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_DAY_in_global_date_prefix518 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_global_date_prefix520 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_prefix_direction_in_global_date_prefix522 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_global_date_prefix524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AFTER_in_prefix_direction555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BEFORE_in_prefix_direction567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THE_in_relaxed_date653 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_relaxed_date655 = new BitSet(new long[]{0x0000000002000000L,0xFFFFFFFFFFF9E000L,0x000000000000007FL});
    public static final BitSet FOLLOW_relaxed_day_of_month_in_relaxed_date659 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_relaxed_date661 = new BitSet(new long[]{0x000003FFE0000000L});
    public static final BitSet FOLLOW_OF_in_relaxed_date664 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_relaxed_date666 = new BitSet(new long[]{0x000003FFC0000000L});
    public static final BitSet FOLLOW_relaxed_month_in_relaxed_date670 = new BitSet(new long[]{0x0000000000A00000L});
    public static final BitSet FOLLOW_relaxed_year_in_relaxed_date672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relaxed_month_in_relaxed_date706 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_relaxed_date708 = new BitSet(new long[]{0x0000000002000000L,0xFFFFFFFFFFF9E000L,0x000000000000007FL});
    public static final BitSet FOLLOW_relaxed_day_of_month_in_relaxed_date710 = new BitSet(new long[]{0x0000000000A00000L});
    public static final BitSet FOLLOW_relaxed_year_in_relaxed_date712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THE_in_relaxed_date728 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_relaxed_date730 = new BitSet(new long[]{0x0000000002000000L,0xFFFFFFFFFFF9E000L,0x000000000000007FL});
    public static final BitSet FOLLOW_relaxed_day_of_month_in_relaxed_date734 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_relaxed_date736 = new BitSet(new long[]{0x000003FFE0000000L});
    public static final BitSet FOLLOW_OF_in_relaxed_date739 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_relaxed_date741 = new BitSet(new long[]{0x000003FFC0000000L});
    public static final BitSet FOLLOW_relaxed_month_in_relaxed_date745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THE_in_relaxed_date763 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_relaxed_date765 = new BitSet(new long[]{0x000003FFC0000000L});
    public static final BitSet FOLLOW_relaxed_month_in_relaxed_date769 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_relaxed_date771 = new BitSet(new long[]{0x0000000002000000L,0xFFFFFFFFFFF9E000L,0x000000000000007FL});
    public static final BitSet FOLLOW_relaxed_day_of_month_in_relaxed_date773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_JANUARY_in_relaxed_month805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FEBRUARY_in_relaxed_month822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MARCH_in_relaxed_month838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_APRIL_in_relaxed_month857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MAY_in_relaxed_month876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_JUNE_in_relaxed_month897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_JULY_in_relaxed_month917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AUGUST_in_relaxed_month937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEPTEMBER_in_relaxed_month955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OCTOBER_in_relaxed_month970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOVEMBER_in_relaxed_month987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DECEMBER_in_relaxed_month1003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spelled_or_int_01_to_31_optional_prefix_in_relaxed_day_of_month1028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spelled_first_to_thirty_first_in_relaxed_day_of_month1055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relaxed_year_prefix_in_relaxed_year1085 = new BitSet(new long[]{0x0000040000000000L,0x000000000007D000L});
    public static final BitSet FOLLOW_SINGLE_QUOTE_in_relaxed_year1087 = new BitSet(new long[]{0x0000000000000000L,0x000000000007D000L});
    public static final BitSet FOLLOW_int_00_to_99_mandatory_prefix_in_relaxed_year1090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relaxed_year_prefix_in_relaxed_year1117 = new BitSet(new long[]{0x0000000000000000L,0x000000000007D000L});
    public static final BitSet FOLLOW_int_four_digits_in_relaxed_year1119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMMA_in_relaxed_year_prefix1149 = new BitSet(new long[]{0x0000080000200002L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_relaxed_year_prefix1151 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_relaxed_year_prefix1156 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_IN_in_relaxed_year_prefix1160 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_relaxed_year_prefix1162 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_THE_in_relaxed_year_prefix1164 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_relaxed_year_prefix1166 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_YEAR_in_relaxed_year_prefix1168 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_relaxed_year_prefix1170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_formal_year_four_digits_in_formal_date1193 = new BitSet(new long[]{0x0000600000000000L});
    public static final BitSet FOLLOW_formal_date_separator_in_formal_date1195 = new BitSet(new long[]{0x0000000000000000L,0x000000000007F000L});
    public static final BitSet FOLLOW_formal_month_of_year_in_formal_date1197 = new BitSet(new long[]{0x0000600000000000L});
    public static final BitSet FOLLOW_formal_date_separator_in_formal_date1199 = new BitSet(new long[]{0x0000000000000000L,0x000000000001E000L});
    public static final BitSet FOLLOW_formal_day_of_month_in_formal_date1201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_formal_month_of_year_in_formal_date1230 = new BitSet(new long[]{0x0000600000000000L});
    public static final BitSet FOLLOW_formal_date_separator_in_formal_date1232 = new BitSet(new long[]{0x0000000000000000L,0x000000000001E000L});
    public static final BitSet FOLLOW_formal_day_of_month_in_formal_date1234 = new BitSet(new long[]{0x0000600000000002L});
    public static final BitSet FOLLOW_formal_date_separator_in_formal_date1237 = new BitSet(new long[]{0x0000000000000000L,0x000000000007D000L});
    public static final BitSet FOLLOW_formal_year_in_formal_date1239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_int_01_to_12_optional_prefix_in_formal_month_of_year1273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_int_01_to_31_optional_prefix_in_formal_day_of_month1296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_formal_year_four_digits_in_formal_year1319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_int_00_to_99_mandatory_prefix_in_formal_year1325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_int_four_digits_in_formal_year_four_digits1348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_formal_date_separator0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relative_prefix_in_relative_date1397 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_relative_date1399 = new BitSet(new long[]{0xFF0013FFC4000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_relative_target_in_relative_date1401 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_136_in_relative_date1403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_implicit_prefix_in_relative_date1437 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_relative_date1439 = new BitSet(new long[]{0xFF0013FFC4000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_relative_target_in_relative_date1441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relative_target_in_relative_date1478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spelled_or_int_01_to_31_optional_prefix_in_relative_date1518 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_relative_date1520 = new BitSet(new long[]{0xFF0013FFC4000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_relative_target_in_relative_date1522 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_relative_date1524 = new BitSet(new long[]{0x00A0000000000000L});
    public static final BitSet FOLLOW_relative_suffix_in_relative_date1526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_named_relative_date_in_relative_date1562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_day_of_week_in_relative_target1578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relaxed_month_in_relative_target1585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relative_date_span_in_relative_target1591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIS_in_implicit_prefix1606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIS_in_relative_prefix1633 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_relative_prefix1635 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_LAST_in_relative_prefix1639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIS_in_relative_prefix1661 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_relative_prefix1663 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_NEXT_in_relative_prefix1667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIS_in_relative_prefix1689 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_relative_prefix1691 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_PAST_in_relative_prefix1695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIS_in_relative_prefix1717 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_relative_prefix1719 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_COMING_in_relative_prefix1723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIS_in_relative_prefix1743 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_relative_prefix1745 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_UPCOMING_in_relative_prefix1749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IN_in_relative_prefix1767 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_relative_prefix1769 = new BitSet(new long[]{0x0000000000000000L,0x000000FFFFF9E000L});
    public static final BitSet FOLLOW_spelled_or_int_01_to_31_optional_prefix_in_relative_prefix1773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FROM_in_relative_suffix1805 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_relative_suffix1807 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_NOW_in_relative_suffix1809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AGO_in_relative_suffix1823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DAY_in_relative_date_span1863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WEEK_in_relative_date_span1876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MONTH_in_relative_date_span1888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_YEAR_in_relative_date_span1899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SUNDAY_in_day_of_week1919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MONDAY_in_day_of_week1937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TUESDAY_in_day_of_week1955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WEDNESDAY_in_day_of_week1972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THURSDAY_in_day_of_week1987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FRIDAY_in_day_of_week2003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SATURDAY_in_day_of_week2021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TODAY_in_named_relative_date2046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOMORROW_in_named_relative_date2078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_YESTERDAY_in_named_relative_date2107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_hours_in_time2147 = new BitSet(new long[]{0x0000000000000000L,0x000000000003D010L});
    public static final BitSet FOLLOW_COLON_in_time2149 = new BitSet(new long[]{0x0000000000000000L,0x000000000003D010L});
    public static final BitSet FOLLOW_minutes_in_time2152 = new BitSet(new long[]{0x0000000000200002L,0x00000000000001E0L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_time2155 = new BitSet(new long[]{0x0000000000000000L,0x00000000000001E0L});
    public static final BitSet FOLLOW_meridian_indicator_in_time2159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MILITARY_HOUR_SUFFIX_in_time2164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HOUR_in_time2168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_hours_in_time2204 = new BitSet(new long[]{0x0000000000200002L,0x0000000000000180L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_time2207 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000180L});
    public static final BitSet FOLLOW_meridian_indicator_in_time2210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_named_time_in_time2249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_int_00_to_23_optional_prefix_in_hours2264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_int_00_to_59_mandatory_prefix_in_minutes2288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AM_in_meridian_indicator2315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PM_in_meridian_indicator2326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOON_in_named_time2346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MIDNIGHT_in_named_time2379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_0_in_int_00_to_23_optional_prefix2421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_00_in_int_00_to_23_optional_prefix2427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_1_TO_9_in_int_00_to_23_optional_prefix2433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_01_TO_12_in_int_00_to_23_optional_prefix2439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_13_TO_23_in_int_00_to_23_optional_prefix2445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_00_in_int_00_to_59_mandatory_prefix2467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_01_TO_12_in_int_00_to_59_mandatory_prefix2473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_13_TO_23_in_int_00_to_59_mandatory_prefix2479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_24_TO_31_in_int_00_to_59_mandatory_prefix2485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_32_TO_59_in_int_00_to_59_mandatory_prefix2491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_int_00_to_59_mandatory_prefix_in_int_00_to_99_mandatory_prefix2513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_60_TO_99_in_int_00_to_99_mandatory_prefix2519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_1_TO_9_in_int_01_to_12_optional_prefix2541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_01_TO_12_in_int_01_to_12_optional_prefix2547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_1_TO_9_in_int_01_to_31_optional_prefix2570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_01_TO_12_in_int_01_to_31_optional_prefix2576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_13_TO_23_in_int_01_to_31_optional_prefix2582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_24_TO_31_in_int_01_to_31_optional_prefix2588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_int_00_to_99_mandatory_prefix_in_int_four_digits2610 = new BitSet(new long[]{0x0000000000000000L,0x000000000007D000L});
    public static final BitSet FOLLOW_int_00_to_99_mandatory_prefix_in_int_four_digits2612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_int_01_to_31_optional_prefix_in_spelled_or_int_01_to_31_optional_prefix2640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spelled_one_to_thirty_one_in_spelled_or_int_01_to_31_optional_prefix2646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ONE_in_spelled_one_to_thirty_one2662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWO_in_spelled_one_to_thirty_one2680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THREE_in_spelled_one_to_thirty_one2698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOUR_in_spelled_one_to_thirty_one2714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FIVE_in_spelled_one_to_thirty_one2731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SIX_in_spelled_one_to_thirty_one2748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEVEN_in_spelled_one_to_thirty_one2766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EIGHT_in_spelled_one_to_thirty_one2782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NINE_in_spelled_one_to_thirty_one2798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEN_in_spelled_one_to_thirty_one2815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELEVEN_in_spelled_one_to_thirty_one2833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWELVE_in_spelled_one_to_thirty_one2848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIRTEEN_in_spelled_one_to_thirty_one2863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOURTEEN_in_spelled_one_to_thirty_one2876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FIFTEEN_in_spelled_one_to_thirty_one2889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SIXTEEN_in_spelled_one_to_thirty_one2903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEVENTEEN_in_spelled_one_to_thirty_one2917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EIGHTEEN_in_spelled_one_to_thirty_one2929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NINETEEN_in_spelled_one_to_thirty_one2942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_one_to_thirty_one2955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_one_to_thirty_one2970 = new BitSet(new long[]{0x0000200000200000L,0x0000000000080000L});
    public static final BitSet FOLLOW_DASH_in_spelled_one_to_thirty_one2973 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_spelled_one_to_thirty_one2977 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_ONE_in_spelled_one_to_thirty_one2981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_one_to_thirty_one2994 = new BitSet(new long[]{0x0000200000200000L,0x0000000000100000L});
    public static final BitSet FOLLOW_DASH_in_spelled_one_to_thirty_one2997 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_spelled_one_to_thirty_one3001 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_TWO_in_spelled_one_to_thirty_one3005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_one_to_thirty_one3018 = new BitSet(new long[]{0x0000200000200000L,0x0000000000200000L});
    public static final BitSet FOLLOW_DASH_in_spelled_one_to_thirty_one3021 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_spelled_one_to_thirty_one3025 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_THREE_in_spelled_one_to_thirty_one3029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_one_to_thirty_one3040 = new BitSet(new long[]{0x0000200000200000L,0x0000000000400000L});
    public static final BitSet FOLLOW_DASH_in_spelled_one_to_thirty_one3043 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_spelled_one_to_thirty_one3047 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_FOUR_in_spelled_one_to_thirty_one3051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_one_to_thirty_one3063 = new BitSet(new long[]{0x0000200000200000L,0x0000000000800000L});
    public static final BitSet FOLLOW_DASH_in_spelled_one_to_thirty_one3066 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_spelled_one_to_thirty_one3070 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_FIVE_in_spelled_one_to_thirty_one3074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_one_to_thirty_one3086 = new BitSet(new long[]{0x0000200000200000L,0x0000000001000000L});
    public static final BitSet FOLLOW_DASH_in_spelled_one_to_thirty_one3089 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_spelled_one_to_thirty_one3093 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_SIX_in_spelled_one_to_thirty_one3097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_one_to_thirty_one3110 = new BitSet(new long[]{0x0000200000200000L,0x0000000002000000L});
    public static final BitSet FOLLOW_DASH_in_spelled_one_to_thirty_one3113 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_spelled_one_to_thirty_one3117 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_SEVEN_in_spelled_one_to_thirty_one3121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_one_to_thirty_one3132 = new BitSet(new long[]{0x0000200000200000L,0x0000000004000000L});
    public static final BitSet FOLLOW_DASH_in_spelled_one_to_thirty_one3135 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_spelled_one_to_thirty_one3139 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_EIGHT_in_spelled_one_to_thirty_one3143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_one_to_thirty_one3154 = new BitSet(new long[]{0x0000200000200000L,0x0000000008000000L});
    public static final BitSet FOLLOW_DASH_in_spelled_one_to_thirty_one3157 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_spelled_one_to_thirty_one3161 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_NINE_in_spelled_one_to_thirty_one3165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIRTY_in_spelled_one_to_thirty_one3177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIRTY_in_spelled_one_to_thirty_one3216 = new BitSet(new long[]{0x0000200000200000L,0x0000000000080000L});
    public static final BitSet FOLLOW_DASH_in_spelled_one_to_thirty_one3219 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_spelled_one_to_thirty_one3223 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_ONE_in_spelled_one_to_thirty_one3227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FIRST_in_spelled_first_to_thirty_first3250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SECOND_in_spelled_first_to_thirty_first3267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIRD_in_spelled_first_to_thirty_first3283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOURTH_in_spelled_first_to_thirty_first3300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FIFTH_in_spelled_first_to_thirty_first3316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SIXTH_in_spelled_first_to_thirty_first3333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEVENTH_in_spelled_first_to_thirty_first3350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EIGHTH_in_spelled_first_to_thirty_first3365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NINTH_in_spelled_first_to_thirty_first3381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TENTH_in_spelled_first_to_thirty_first3398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELEVENTH_in_spelled_first_to_thirty_first3415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWELFTH_in_spelled_first_to_thirty_first3429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIRTEENTH_in_spelled_first_to_thirty_first3444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOURTEENTH_in_spelled_first_to_thirty_first3456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FIFTEENTH_in_spelled_first_to_thirty_first3468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SIXTEENTH_in_spelled_first_to_thirty_first3481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEVENTEENTH_in_spelled_first_to_thirty_first3494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EIGHTEENTH_in_spelled_first_to_thirty_first3505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NINETEENTH_in_spelled_first_to_thirty_first3517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTIETH_in_spelled_first_to_thirty_first3529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_FIRST_in_spelled_first_to_thirty_first3543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_first_to_thirty_first3550 = new BitSet(new long[]{0x0000200000200000L,0x0000010000000000L});
    public static final BitSet FOLLOW_DASH_in_spelled_first_to_thirty_first3553 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_spelled_first_to_thirty_first3557 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_FIRST_in_spelled_first_to_thirty_first3561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_SECOND_in_spelled_first_to_thirty_first3577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_first_to_thirty_first3583 = new BitSet(new long[]{0x0000200000200000L,0x0000020000000000L});
    public static final BitSet FOLLOW_DASH_in_spelled_first_to_thirty_first3586 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_spelled_first_to_thirty_first3590 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_SECOND_in_spelled_first_to_thirty_first3594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_THIRD_in_spelled_first_to_thirty_first3609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_first_to_thirty_first3616 = new BitSet(new long[]{0x0000200000200000L,0x0000040000000000L});
    public static final BitSet FOLLOW_DASH_in_spelled_first_to_thirty_first3619 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_spelled_first_to_thirty_first3623 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_THIRD_in_spelled_first_to_thirty_first3627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_FOURTH_in_spelled_first_to_thirty_first3643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_first_to_thirty_first3649 = new BitSet(new long[]{0x0000200000200000L,0x0000080000000000L});
    public static final BitSet FOLLOW_DASH_in_spelled_first_to_thirty_first3652 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_spelled_first_to_thirty_first3656 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_FOURTH_in_spelled_first_to_thirty_first3660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_FIFTH_in_spelled_first_to_thirty_first3675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_first_to_thirty_first3682 = new BitSet(new long[]{0x0000200000200000L,0x0000100000000000L});
    public static final BitSet FOLLOW_DASH_in_spelled_first_to_thirty_first3685 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_spelled_first_to_thirty_first3689 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_FIFTH_in_spelled_first_to_thirty_first3693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_SIXTH_in_spelled_first_to_thirty_first3709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_first_to_thirty_first3716 = new BitSet(new long[]{0x0000200000200000L,0x0000200000000000L});
    public static final BitSet FOLLOW_DASH_in_spelled_first_to_thirty_first3719 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_spelled_first_to_thirty_first3723 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_SIXTH_in_spelled_first_to_thirty_first3727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_SEVENTH_in_spelled_first_to_thirty_first3743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_first_to_thirty_first3748 = new BitSet(new long[]{0x0000200000200000L,0x0000400000000000L});
    public static final BitSet FOLLOW_DASH_in_spelled_first_to_thirty_first3751 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_spelled_first_to_thirty_first3755 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_SEVENTH_in_spelled_first_to_thirty_first3759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_EIGHTH_in_spelled_first_to_thirty_first3773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_first_to_thirty_first3779 = new BitSet(new long[]{0x0000200000200000L,0x0000800000000000L});
    public static final BitSet FOLLOW_DASH_in_spelled_first_to_thirty_first3782 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_spelled_first_to_thirty_first3786 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_EIGHTH_in_spelled_first_to_thirty_first3790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_NINTH_in_spelled_first_to_thirty_first3805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_first_to_thirty_first3812 = new BitSet(new long[]{0x0000200000200000L,0x0001000000000000L});
    public static final BitSet FOLLOW_DASH_in_spelled_first_to_thirty_first3815 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_spelled_first_to_thirty_first3819 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_NINTH_in_spelled_first_to_thirty_first3823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIRTIETH_in_spelled_first_to_thirty_first3838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIRTY_FIRST_in_spelled_first_to_thirty_first3898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIRTY_in_spelled_first_to_thirty_first3905 = new BitSet(new long[]{0x0000200000200000L,0x0000010000000000L});
    public static final BitSet FOLLOW_DASH_in_spelled_first_to_thirty_first3908 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_spelled_first_to_thirty_first3912 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_FIRST_in_spelled_first_to_thirty_first3916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_date_time_in_synpred1_Date140 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_synpred1_Date142 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_text_in_synpred1_Date144 = new BitSet(new long[]{0xFF1F9BFFC6200002L,0xFFFFFFFFFFFFFE0FL,0x000000000000007FL});
    public static final BitSet FOLLOW_text_in_synpred2_Date168 = new BitSet(new long[]{0xFF1F9BFFC6300000L,0xFFFFFFFFFFFFFE0FL,0x000000000000007FL});
    public static final BitSet FOLLOW_date_time_in_synpred2_Date170 = new BitSet(new long[]{0x0000000000300002L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_synpred2_Date172 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_date_in_synpred3_Date257 = new BitSet(new long[]{0x0000000000A00002L});
    public static final BitSet FOLLOW_date_time_separator_in_synpred3_Date260 = new BitSet(new long[]{0xFF1F9BFFC6000000L,0xFFFFFFFFFFFFFE0FL,0x000000000000007FL});
    public static final BitSet FOLLOW_time_in_synpred3_Date262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relaxed_date_in_synpred4_Date415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THE_in_synpred5_Date621 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_synpred5_Date623 = new BitSet(new long[]{0x0000000002000000L,0xFFFFFFFFFFF9E000L,0x000000000000007FL});
    public static final BitSet FOLLOW_relaxed_day_of_month_in_synpred5_Date627 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_synpred5_Date629 = new BitSet(new long[]{0x000003FFE0000000L});
    public static final BitSet FOLLOW_OF_in_synpred5_Date632 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_synpred5_Date634 = new BitSet(new long[]{0x000003FFC0000000L});
    public static final BitSet FOLLOW_relaxed_month_in_synpred5_Date638 = new BitSet(new long[]{0x0000000000A00000L});
    public static final BitSet FOLLOW_relaxed_year_in_synpred5_Date640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relaxed_month_in_synpred6_Date688 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_synpred6_Date690 = new BitSet(new long[]{0x0000000002000000L,0xFFFFFFFFFFF9E000L,0x000000000000007FL});
    public static final BitSet FOLLOW_relaxed_day_of_month_in_synpred6_Date692 = new BitSet(new long[]{0x0000000000A00000L});
    public static final BitSet FOLLOW_relaxed_year_in_synpred6_Date694 = new BitSet(new long[]{0x0000000000000002L});

}