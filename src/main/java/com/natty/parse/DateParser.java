// $ANTLR 3.2 Sep 23, 2009 12:02:23 /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g 2010-02-09 17:12:00
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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "INT", "MONTH_OF_YEAR", "DAY_OF_MONTH", "DAY_OF_WEEK", "YEAR_OF", "DATE_TIME", "EXPLICIT_DATE", "RELATIVE_DATE", "SEEK", "DIRECTION", "SEEK_BY", "SPAN", "EXPLICIT_TIME", "HOURS_OF_DAY", "MINUTES_OF_HOUR", "AM_PM", "WHITE_SPACE", "AT", "COMMA", "ON", "THE", "DAY", "AFTER", "BEFORE", "OF", "JANUARY", "FEBRUARY", "MARCH", "APRIL", "MAY", "JUNE", "JULY", "AUGUST", "SEPTEMBER", "OCTOBER", "NOVEMBER", "DECEMBER", "SINGLE_QUOTE", "IN", "YEAR", "DASH", "SLASH", "LAST", "THIS", "NEXT", "PAST", "COMING", "UPCOMING", "FROM", "NOW", "AGO", "WEEK", "MONTH", "SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY", "TODAY", "TOMORROW", "YESTERDAY", "COLON", "MILITARY_HOUR_SUFFIX", "HOUR", "AM", "PM", "NOON", "MIDNIGHT", "INT_0", "INT_00", "INT_1_TO_9", "INT_01_TO_12", "INT_13_TO_23", "INT_24_TO_31", "INT_32_TO_59", "INT_60_TO_99", "ONE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", "NINE", "TEN", "ELEVEN", "TWELVE", "THIRTEEN", "FOURTEEN", "FIFTEEN", "SIXTEEN", "SEVENTEEN", "EIGHTEEN", "NINETEEN", "TWENTY", "THIRTY", "FIRST", "SECOND", "THIRD", "FOURTH", "FIFTH", "SIXTH", "SEVENTH", "EIGHTH", "NINTH", "TENTH", "ELEVENTH", "TWELFTH", "THIRTEENTH", "FOURTEENTH", "FIFTEENTH", "SIXTEENTH", "SEVENTEENTH", "EIGHTEENTH", "NINETEENTH", "TWENTIETH", "TWENTY_FIRST", "TWENTY_SECOND", "TWENTY_THIRD", "TWENTY_FOURTH", "TWENTY_FIFTH", "TWENTY_SIXTH", "TWENTY_SEVENTH", "TWENTY_EIGHTH", "TWENTY_NINTH", "THIRTIETH", "THIRTY_FIRST", "DOT", "UNKNOWN", "'s'"
    };
    public static final int DIRECTION=13;
    public static final int NINETEEN=100;
    public static final int SEPTEMBER=37;
    public static final int WEEK=55;
    public static final int WEDNESDAY=60;
    public static final int INT_24_TO_31=79;
    public static final int TWENTY_EIGHTH=130;
    public static final int TWENTY=101;
    public static final int INT_00=75;
    public static final int JULY=35;
    public static final int APRIL=32;
    public static final int COMING=50;
    public static final int NINETEENTH=121;
    public static final int OCTOBER=38;
    public static final int NOW=53;
    public static final int DAY=25;
    public static final int ONE=82;
    public static final int MIDNIGHT=73;
    public static final int MARCH=31;
    public static final int EOF=-1;
    public static final int MONTH=56;
    public static final int PAST=49;
    public static final int SEVENTEEN=98;
    public static final int DATE_TIME=9;
    public static final int AM_PM=19;
    public static final int TWENTY_SEVENTH=129;
    public static final int TWENTY_FIFTH=127;
    public static final int EIGHTEENTH=120;
    public static final int MINUTES_OF_HOUR=18;
    public static final int SPAN=15;
    public static final int THIS=47;
    public static final int THIRTIETH=132;
    public static final int NOON=72;
    public static final int INT_60_TO_99=81;
    public static final int LAST=46;
    public static final int EIGHTEEN=99;
    public static final int INT_01_TO_12=77;
    public static final int RELATIVE_DATE=11;
    public static final int TOMORROW=65;
    public static final int FIFTEENTH=117;
    public static final int FOURTH=106;
    public static final int T__136=136;
    public static final int TODAY=64;
    public static final int SECOND=104;
    public static final int NOVEMBER=39;
    public static final int SATURDAY=63;
    public static final int MONTH_OF_YEAR=5;
    public static final int FOUR=85;
    public static final int SEVENTH=109;
    public static final int TEN=91;
    public static final int FEBRUARY=30;
    public static final int ON=23;
    public static final int MONDAY=58;
    public static final int THIRTEEN=94;
    public static final int ELEVEN=92;
    public static final int DAY_OF_WEEK=7;
    public static final int SUNDAY=57;
    public static final int SEVEN=88;
    public static final int JUNE=34;
    public static final int INT=4;
    public static final int EXPLICIT_DATE=10;
    public static final int OF=28;
    public static final int UPCOMING=51;
    public static final int SIX=87;
    public static final int FIFTH=107;
    public static final int TWENTY_NINTH=131;
    public static final int THURSDAY=61;
    public static final int DECEMBER=40;
    public static final int SEEK_BY=14;
    public static final int AUGUST=36;
    public static final int PM=71;
    public static final int EXPLICIT_TIME=16;
    public static final int FROM=52;
    public static final int TUESDAY=59;
    public static final int EIGHTH=110;
    public static final int THIRD=105;
    public static final int HOURS_OF_DAY=17;
    public static final int YEAR=43;
    public static final int THE=24;
    public static final int TENTH=112;
    public static final int MAY=33;
    public static final int TWENTY_FOURTH=126;
    public static final int WHITE_SPACE=20;
    public static final int FRIDAY=62;
    public static final int EIGHT=89;
    public static final int INT_0=74;
    public static final int TWENTY_SIXTH=128;
    public static final int AT=21;
    public static final int SINGLE_QUOTE=41;
    public static final int SLASH=45;
    public static final int IN=42;
    public static final int UNKNOWN=135;
    public static final int NINTH=111;
    public static final int COMMA=22;
    public static final int FIVE=86;
    public static final int THIRTY=102;
    public static final int TWENTIETH=122;
    public static final int TWENTY_SECOND=124;
    public static final int NEXT=48;
    public static final int DOT=134;
    public static final int INT_13_TO_23=78;
    public static final int MILITARY_HOUR_SUFFIX=68;
    public static final int INT_32_TO_59=80;
    public static final int AM=70;
    public static final int DASH=44;
    public static final int FOURTEENTH=116;
    public static final int SIXTEEN=97;
    public static final int INT_1_TO_9=76;
    public static final int YEAR_OF=8;
    public static final int TWELVE=93;
    public static final int AGO=54;
    public static final int ELEVENTH=113;
    public static final int BEFORE=27;
    public static final int AFTER=26;
    public static final int TWO=83;
    public static final int HOUR=69;
    public static final int SIXTEENTH=118;
    public static final int JANUARY=29;
    public static final int THIRTEENTH=115;
    public static final int SEEK=12;
    public static final int COLON=67;
    public static final int DAY_OF_MONTH=6;
    public static final int FIFTEEN=96;
    public static final int TWELFTH=114;
    public static final int NINE=90;
    public static final int SIXTH=108;
    public static final int TWENTY_FIRST=123;
    public static final int THREE=84;
    public static final int FOURTEEN=95;
    public static final int TWENTY_THIRD=125;
    public static final int YESTERDAY=66;
    public static final int SEVENTEENTH=119;
    public static final int THIRTY_FIRST=133;
    public static final int FIRST=103;

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
    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:28:1: search : date_time ;
    public final DateParser.search_return search() throws RecognitionException {
        DateParser.search_return retval = new DateParser.search_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        DateParser.date_time_return date_time1 = null;



        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:29:3: ( date_time )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:29:5: date_time
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_date_time_in_search130);
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
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "search"

    public static class date_time_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "date_time"
    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:37:1: date_time : ( ( date ( date_time_separator time )? )=> date ( date_time_separator time )? | time ( time_date_separator date )? ) -> ^( DATE_TIME ( date )? ( time )? ) ;
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
        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:43:3: ( ( ( date ( date_time_separator time )? )=> date ( date_time_separator time )? | time ( time_date_separator date )? ) -> ^( DATE_TIME ( date )? ( time )? ) )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:43:5: ( ( date ( date_time_separator time )? )=> date ( date_time_separator time )? | time ( time_date_separator date )? )
            {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:43:5: ( ( date ( date_time_separator time )? )=> date ( date_time_separator time )? | time ( time_date_separator date )? )
            int alt3=2;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:44:7: ( date ( date_time_separator time )? )=> date ( date_time_separator time )?
                    {
                    pushFollow(FOLLOW_date_in_date_time197);
                    date2=date();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_date.add(date2.getTree());
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:45:14: ( date_time_separator time )?
                    int alt1=2;
                    int LA1_0 = input.LA(1);

                    if ( (LA1_0==WHITE_SPACE||LA1_0==COMMA) ) {
                        alt1=1;
                    }
                    switch (alt1) {
                        case 1 :
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:45:15: date_time_separator time
                            {
                            pushFollow(FOLLOW_date_time_separator_in_date_time200);
                            date_time_separator3=date_time_separator();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_date_time_separator.add(date_time_separator3.getTree());
                            pushFollow(FOLLOW_time_in_date_time202);
                            time4=time();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_time.add(time4.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:47:9: time ( time_date_separator date )?
                    {
                    pushFollow(FOLLOW_time_in_date_time221);
                    time5=time();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_time.add(time5.getTree());
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:47:14: ( time_date_separator date )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0==WHITE_SPACE||LA2_0==COMMA) ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:47:15: time_date_separator date
                            {
                            pushFollow(FOLLOW_time_date_separator_in_date_time224);
                            time_date_separator6=time_date_separator();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_time_date_separator.add(time_date_separator6.getTree());
                            pushFollow(FOLLOW_date_in_date_time226);
                            date7=date();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_date.add(date7.getTree());

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
            // 48:7: -> ^( DATE_TIME ( date )? ( time )? )
            {
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:48:10: ^( DATE_TIME ( date )? ( time )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DATE_TIME, "DATE_TIME"), root_1);

                // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:48:22: ( date )?
                if ( stream_date.hasNext() ) {
                    adaptor.addChild(root_1, stream_date.nextTree());

                }
                stream_date.reset();
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:48:28: ( time )?
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
                  //System.out.println("found " + input.toString(retval.start,input.LT(-1)) + " at " + startIndex + " - " + endIndex); 
                
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
    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:51:1: date_time_separator : ( WHITE_SPACE ( AT WHITE_SPACE )? | COMMA ( WHITE_SPACE )? ( AT WHITE_SPACE )? );
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

        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:52:3: ( WHITE_SPACE ( AT WHITE_SPACE )? | COMMA ( WHITE_SPACE )? ( AT WHITE_SPACE )? )
            int alt7=2;
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

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:52:5: WHITE_SPACE ( AT WHITE_SPACE )?
                    {
                    root_0 = (Object)adaptor.nil();

                    WHITE_SPACE8=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_date_time_separator261); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    WHITE_SPACE8_tree = (Object)adaptor.create(WHITE_SPACE8);
                    adaptor.addChild(root_0, WHITE_SPACE8_tree);
                    }
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:52:17: ( AT WHITE_SPACE )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==AT) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:52:18: AT WHITE_SPACE
                            {
                            AT9=(Token)match(input,AT,FOLLOW_AT_in_date_time_separator264); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            AT9_tree = (Object)adaptor.create(AT9);
                            adaptor.addChild(root_0, AT9_tree);
                            }
                            WHITE_SPACE10=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_date_time_separator266); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            WHITE_SPACE10_tree = (Object)adaptor.create(WHITE_SPACE10);
                            adaptor.addChild(root_0, WHITE_SPACE10_tree);
                            }

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:53:5: COMMA ( WHITE_SPACE )? ( AT WHITE_SPACE )?
                    {
                    root_0 = (Object)adaptor.nil();

                    COMMA11=(Token)match(input,COMMA,FOLLOW_COMMA_in_date_time_separator274); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    COMMA11_tree = (Object)adaptor.create(COMMA11);
                    adaptor.addChild(root_0, COMMA11_tree);
                    }
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:53:11: ( WHITE_SPACE )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==WHITE_SPACE) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:53:11: WHITE_SPACE
                            {
                            WHITE_SPACE12=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_date_time_separator276); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            WHITE_SPACE12_tree = (Object)adaptor.create(WHITE_SPACE12);
                            adaptor.addChild(root_0, WHITE_SPACE12_tree);
                            }

                            }
                            break;

                    }

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:53:24: ( AT WHITE_SPACE )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==AT) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:53:25: AT WHITE_SPACE
                            {
                            AT13=(Token)match(input,AT,FOLLOW_AT_in_date_time_separator280); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            AT13_tree = (Object)adaptor.create(AT13);
                            adaptor.addChild(root_0, AT13_tree);
                            }
                            WHITE_SPACE14=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_date_time_separator282); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            WHITE_SPACE14_tree = (Object)adaptor.create(WHITE_SPACE14);
                            adaptor.addChild(root_0, WHITE_SPACE14_tree);
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
    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:56:1: time_date_separator : ( WHITE_SPACE ( ON WHITE_SPACE )? | COMMA ( WHITE_SPACE )? ( ON WHITE_SPACE )? );
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

        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:57:3: ( WHITE_SPACE ( ON WHITE_SPACE )? | COMMA ( WHITE_SPACE )? ( ON WHITE_SPACE )? )
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
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:57:5: WHITE_SPACE ( ON WHITE_SPACE )?
                    {
                    root_0 = (Object)adaptor.nil();

                    WHITE_SPACE15=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_time_date_separator299); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    WHITE_SPACE15_tree = (Object)adaptor.create(WHITE_SPACE15);
                    adaptor.addChild(root_0, WHITE_SPACE15_tree);
                    }
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:57:17: ( ON WHITE_SPACE )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==ON) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:57:18: ON WHITE_SPACE
                            {
                            ON16=(Token)match(input,ON,FOLLOW_ON_in_time_date_separator302); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            ON16_tree = (Object)adaptor.create(ON16);
                            adaptor.addChild(root_0, ON16_tree);
                            }
                            WHITE_SPACE17=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_time_date_separator304); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            WHITE_SPACE17_tree = (Object)adaptor.create(WHITE_SPACE17);
                            adaptor.addChild(root_0, WHITE_SPACE17_tree);
                            }

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:58:5: COMMA ( WHITE_SPACE )? ( ON WHITE_SPACE )?
                    {
                    root_0 = (Object)adaptor.nil();

                    COMMA18=(Token)match(input,COMMA,FOLLOW_COMMA_in_time_date_separator312); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    COMMA18_tree = (Object)adaptor.create(COMMA18);
                    adaptor.addChild(root_0, COMMA18_tree);
                    }
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:58:11: ( WHITE_SPACE )?
                    int alt9=2;
                    alt9 = dfa9.predict(input);
                    switch (alt9) {
                        case 1 :
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:58:11: WHITE_SPACE
                            {
                            WHITE_SPACE19=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_time_date_separator314); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            WHITE_SPACE19_tree = (Object)adaptor.create(WHITE_SPACE19);
                            adaptor.addChild(root_0, WHITE_SPACE19_tree);
                            }

                            }
                            break;

                    }

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:58:24: ( ON WHITE_SPACE )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==ON) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:58:25: ON WHITE_SPACE
                            {
                            ON20=(Token)match(input,ON,FOLLOW_ON_in_time_date_separator318); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            ON20_tree = (Object)adaptor.create(ON20);
                            adaptor.addChild(root_0, ON20_tree);
                            }
                            WHITE_SPACE21=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_time_date_separator320); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            WHITE_SPACE21_tree = (Object)adaptor.create(WHITE_SPACE21);
                            adaptor.addChild(root_0, WHITE_SPACE21_tree);
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
    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:61:1: date : ( ( relaxed_date )=> relaxed_date | formal_date | relative_date | global_date_prefix date -> ^( RELATIVE_DATE ^( SEEK global_date_prefix date ) ) );
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
        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:62:3: ( ( relaxed_date )=> relaxed_date | formal_date | relative_date | global_date_prefix date -> ^( RELATIVE_DATE ^( SEEK global_date_prefix date ) ) )
            int alt12=4;
            alt12 = dfa12.predict(input);
            switch (alt12) {
                case 1 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:62:5: ( relaxed_date )=> relaxed_date
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_relaxed_date_in_date340);
                    relaxed_date22=relaxed_date();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, relaxed_date22.getTree());

                    }
                    break;
                case 2 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:63:5: formal_date
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_formal_date_in_date346);
                    formal_date23=formal_date();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, formal_date23.getTree());

                    }
                    break;
                case 3 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:64:5: relative_date
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_relative_date_in_date352);
                    relative_date24=relative_date();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, relative_date24.getTree());

                    }
                    break;
                case 4 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:65:5: global_date_prefix date
                    {
                    pushFollow(FOLLOW_global_date_prefix_in_date358);
                    global_date_prefix25=global_date_prefix();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_global_date_prefix.add(global_date_prefix25.getTree());
                    pushFollow(FOLLOW_date_in_date360);
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
                    // 66:7: -> ^( RELATIVE_DATE ^( SEEK global_date_prefix date ) )
                    {
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:66:10: ^( RELATIVE_DATE ^( SEEK global_date_prefix date ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(RELATIVE_DATE, "RELATIVE_DATE"), root_1);

                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:66:26: ^( SEEK global_date_prefix date )
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
    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:69:1: global_date_prefix : ( ( THE WHITE_SPACE )? DAY WHITE_SPACE prefix_direction WHITE_SPACE -> prefix_direction SEEK_BY[\"by_day\"] INT[\"1\"] | spelled_or_int_01_to_31_optional_prefix WHITE_SPACE DAY WHITE_SPACE prefix_direction WHITE_SPACE -> prefix_direction SEEK_BY[\"by_day\"] spelled_or_int_01_to_31_optional_prefix );
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
        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:70:3: ( ( THE WHITE_SPACE )? DAY WHITE_SPACE prefix_direction WHITE_SPACE -> prefix_direction SEEK_BY[\"by_day\"] INT[\"1\"] | spelled_or_int_01_to_31_optional_prefix WHITE_SPACE DAY WHITE_SPACE prefix_direction WHITE_SPACE -> prefix_direction SEEK_BY[\"by_day\"] spelled_or_int_01_to_31_optional_prefix )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=THE && LA14_0<=DAY)) ) {
                alt14=1;
            }
            else if ( ((LA14_0>=INT_1_TO_9 && LA14_0<=INT_24_TO_31)||(LA14_0>=ONE && LA14_0<=THIRTY)) ) {
                alt14=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:70:5: ( THE WHITE_SPACE )? DAY WHITE_SPACE prefix_direction WHITE_SPACE
                    {
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:70:5: ( THE WHITE_SPACE )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==THE) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:70:6: THE WHITE_SPACE
                            {
                            THE27=(Token)match(input,THE,FOLLOW_THE_in_global_date_prefix397); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_THE.add(THE27);

                            WHITE_SPACE28=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_global_date_prefix399); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE28);


                            }
                            break;

                    }

                    DAY29=(Token)match(input,DAY,FOLLOW_DAY_in_global_date_prefix403); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DAY.add(DAY29);

                    WHITE_SPACE30=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_global_date_prefix405); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE30);

                    pushFollow(FOLLOW_prefix_direction_in_global_date_prefix407);
                    prefix_direction31=prefix_direction();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_prefix_direction.add(prefix_direction31.getTree());
                    WHITE_SPACE32=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_global_date_prefix409); if (state.failed) return retval; 
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
                    // 71:7: -> prefix_direction SEEK_BY[\"by_day\"] INT[\"1\"]
                    {
                        adaptor.addChild(root_0, stream_prefix_direction.nextTree());
                        adaptor.addChild(root_0, (Object)adaptor.create(SEEK_BY, "by_day"));
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "1"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:73:5: spelled_or_int_01_to_31_optional_prefix WHITE_SPACE DAY WHITE_SPACE prefix_direction WHITE_SPACE
                    {
                    pushFollow(FOLLOW_spelled_or_int_01_to_31_optional_prefix_in_global_date_prefix435);
                    spelled_or_int_01_to_31_optional_prefix33=spelled_or_int_01_to_31_optional_prefix();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_spelled_or_int_01_to_31_optional_prefix.add(spelled_or_int_01_to_31_optional_prefix33.getTree());
                    WHITE_SPACE34=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_global_date_prefix437); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE34);

                    DAY35=(Token)match(input,DAY,FOLLOW_DAY_in_global_date_prefix439); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DAY.add(DAY35);

                    WHITE_SPACE36=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_global_date_prefix441); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE36);

                    pushFollow(FOLLOW_prefix_direction_in_global_date_prefix443);
                    prefix_direction37=prefix_direction();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_prefix_direction.add(prefix_direction37.getTree());
                    WHITE_SPACE38=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_global_date_prefix445); if (state.failed) return retval; 
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
                    // 74:7: -> prefix_direction SEEK_BY[\"by_day\"] spelled_or_int_01_to_31_optional_prefix
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
    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:77:1: prefix_direction : ( AFTER -> DIRECTION[\">\"] | BEFORE -> DIRECTION[\"<\"] );
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

        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:78:3: ( AFTER -> DIRECTION[\">\"] | BEFORE -> DIRECTION[\"<\"] )
            int alt15=2;
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

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:78:5: AFTER
                    {
                    AFTER39=(Token)match(input,AFTER,FOLLOW_AFTER_in_prefix_direction476); if (state.failed) return retval; 
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
                    // 78:12: -> DIRECTION[\">\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(DIRECTION, ">"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:79:5: BEFORE
                    {
                    BEFORE40=(Token)match(input,BEFORE,FOLLOW_BEFORE_in_prefix_direction488); if (state.failed) return retval; 
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
                    // 79:12: -> DIRECTION[\"<\"]
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
    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:85:1: relaxed_date : ( ( ( THE WHITE_SPACE )? relaxed_day_of_month WHITE_SPACE ( OF WHITE_SPACE )? relaxed_month relaxed_year )=> ( THE WHITE_SPACE )? relaxed_day_of_month WHITE_SPACE ( OF WHITE_SPACE )? relaxed_month relaxed_year | ( relaxed_month WHITE_SPACE relaxed_day_of_month relaxed_year )=> relaxed_month WHITE_SPACE relaxed_day_of_month relaxed_year | ( THE WHITE_SPACE )? relaxed_day_of_month WHITE_SPACE ( OF WHITE_SPACE )? relaxed_month | ( THE WHITE_SPACE )? relaxed_month WHITE_SPACE relaxed_day_of_month ) -> ^( EXPLICIT_DATE relaxed_month relaxed_day_of_month ( relaxed_year )? ) ;
    public final DateParser.relaxed_date_return relaxed_date() throws RecognitionException {
        DateParser.relaxed_date_return retval = new DateParser.relaxed_date_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token THE41=null;
        Token WHITE_SPACE42=null;
        Token WHITE_SPACE44=null;
        Token OF45=null;
        Token WHITE_SPACE46=null;
        Token WHITE_SPACE50=null;
        Token THE53=null;
        Token WHITE_SPACE54=null;
        Token WHITE_SPACE56=null;
        Token OF57=null;
        Token WHITE_SPACE58=null;
        Token THE60=null;
        Token WHITE_SPACE61=null;
        Token WHITE_SPACE63=null;
        DateParser.relaxed_day_of_month_return relaxed_day_of_month43 = null;

        DateParser.relaxed_month_return relaxed_month47 = null;

        DateParser.relaxed_year_return relaxed_year48 = null;

        DateParser.relaxed_month_return relaxed_month49 = null;

        DateParser.relaxed_day_of_month_return relaxed_day_of_month51 = null;

        DateParser.relaxed_year_return relaxed_year52 = null;

        DateParser.relaxed_day_of_month_return relaxed_day_of_month55 = null;

        DateParser.relaxed_month_return relaxed_month59 = null;

        DateParser.relaxed_month_return relaxed_month62 = null;

        DateParser.relaxed_day_of_month_return relaxed_day_of_month64 = null;


        Object THE41_tree=null;
        Object WHITE_SPACE42_tree=null;
        Object WHITE_SPACE44_tree=null;
        Object OF45_tree=null;
        Object WHITE_SPACE46_tree=null;
        Object WHITE_SPACE50_tree=null;
        Object THE53_tree=null;
        Object WHITE_SPACE54_tree=null;
        Object WHITE_SPACE56_tree=null;
        Object OF57_tree=null;
        Object WHITE_SPACE58_tree=null;
        Object THE60_tree=null;
        Object WHITE_SPACE61_tree=null;
        Object WHITE_SPACE63_tree=null;
        RewriteRuleTokenStream stream_THE=new RewriteRuleTokenStream(adaptor,"token THE");
        RewriteRuleTokenStream stream_OF=new RewriteRuleTokenStream(adaptor,"token OF");
        RewriteRuleTokenStream stream_WHITE_SPACE=new RewriteRuleTokenStream(adaptor,"token WHITE_SPACE");
        RewriteRuleSubtreeStream stream_relaxed_day_of_month=new RewriteRuleSubtreeStream(adaptor,"rule relaxed_day_of_month");
        RewriteRuleSubtreeStream stream_relaxed_month=new RewriteRuleSubtreeStream(adaptor,"rule relaxed_month");
        RewriteRuleSubtreeStream stream_relaxed_year=new RewriteRuleSubtreeStream(adaptor,"rule relaxed_year");
        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:86:3: ( ( ( ( THE WHITE_SPACE )? relaxed_day_of_month WHITE_SPACE ( OF WHITE_SPACE )? relaxed_month relaxed_year )=> ( THE WHITE_SPACE )? relaxed_day_of_month WHITE_SPACE ( OF WHITE_SPACE )? relaxed_month relaxed_year | ( relaxed_month WHITE_SPACE relaxed_day_of_month relaxed_year )=> relaxed_month WHITE_SPACE relaxed_day_of_month relaxed_year | ( THE WHITE_SPACE )? relaxed_day_of_month WHITE_SPACE ( OF WHITE_SPACE )? relaxed_month | ( THE WHITE_SPACE )? relaxed_month WHITE_SPACE relaxed_day_of_month ) -> ^( EXPLICIT_DATE relaxed_month relaxed_day_of_month ( relaxed_year )? ) )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:86:5: ( ( ( THE WHITE_SPACE )? relaxed_day_of_month WHITE_SPACE ( OF WHITE_SPACE )? relaxed_month relaxed_year )=> ( THE WHITE_SPACE )? relaxed_day_of_month WHITE_SPACE ( OF WHITE_SPACE )? relaxed_month relaxed_year | ( relaxed_month WHITE_SPACE relaxed_day_of_month relaxed_year )=> relaxed_month WHITE_SPACE relaxed_day_of_month relaxed_year | ( THE WHITE_SPACE )? relaxed_day_of_month WHITE_SPACE ( OF WHITE_SPACE )? relaxed_month | ( THE WHITE_SPACE )? relaxed_month WHITE_SPACE relaxed_day_of_month )
            {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:86:5: ( ( ( THE WHITE_SPACE )? relaxed_day_of_month WHITE_SPACE ( OF WHITE_SPACE )? relaxed_month relaxed_year )=> ( THE WHITE_SPACE )? relaxed_day_of_month WHITE_SPACE ( OF WHITE_SPACE )? relaxed_month relaxed_year | ( relaxed_month WHITE_SPACE relaxed_day_of_month relaxed_year )=> relaxed_month WHITE_SPACE relaxed_day_of_month relaxed_year | ( THE WHITE_SPACE )? relaxed_day_of_month WHITE_SPACE ( OF WHITE_SPACE )? relaxed_month | ( THE WHITE_SPACE )? relaxed_month WHITE_SPACE relaxed_day_of_month )
            int alt21=4;
            alt21 = dfa21.predict(input);
            switch (alt21) {
                case 1 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:90:7: ( ( THE WHITE_SPACE )? relaxed_day_of_month WHITE_SPACE ( OF WHITE_SPACE )? relaxed_month relaxed_year )=> ( THE WHITE_SPACE )? relaxed_day_of_month WHITE_SPACE ( OF WHITE_SPACE )? relaxed_month relaxed_year
                    {
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:91:9: ( THE WHITE_SPACE )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==THE) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:91:10: THE WHITE_SPACE
                            {
                            THE41=(Token)match(input,THE,FOLLOW_THE_in_relaxed_date574); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_THE.add(THE41);

                            WHITE_SPACE42=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_relaxed_date576); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE42);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_relaxed_day_of_month_in_relaxed_date580);
                    relaxed_day_of_month43=relaxed_day_of_month();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_relaxed_day_of_month.add(relaxed_day_of_month43.getTree());
                    WHITE_SPACE44=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_relaxed_date582); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE44);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:91:61: ( OF WHITE_SPACE )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==OF) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:91:62: OF WHITE_SPACE
                            {
                            OF45=(Token)match(input,OF,FOLLOW_OF_in_relaxed_date585); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_OF.add(OF45);

                            WHITE_SPACE46=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_relaxed_date587); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE46);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_relaxed_month_in_relaxed_date591);
                    relaxed_month47=relaxed_month();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_relaxed_month.add(relaxed_month47.getTree());
                    pushFollow(FOLLOW_relaxed_year_in_relaxed_date593);
                    relaxed_year48=relaxed_year();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_relaxed_year.add(relaxed_year48.getTree());

                    }
                    break;
                case 2 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:93:9: ( relaxed_month WHITE_SPACE relaxed_day_of_month relaxed_year )=> relaxed_month WHITE_SPACE relaxed_day_of_month relaxed_year
                    {
                    pushFollow(FOLLOW_relaxed_month_in_relaxed_date627);
                    relaxed_month49=relaxed_month();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_relaxed_month.add(relaxed_month49.getTree());
                    WHITE_SPACE50=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_relaxed_date629); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE50);

                    pushFollow(FOLLOW_relaxed_day_of_month_in_relaxed_date631);
                    relaxed_day_of_month51=relaxed_day_of_month();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_relaxed_day_of_month.add(relaxed_day_of_month51.getTree());
                    pushFollow(FOLLOW_relaxed_year_in_relaxed_date633);
                    relaxed_year52=relaxed_year();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_relaxed_year.add(relaxed_year52.getTree());

                    }
                    break;
                case 3 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:96:9: ( THE WHITE_SPACE )? relaxed_day_of_month WHITE_SPACE ( OF WHITE_SPACE )? relaxed_month
                    {
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:96:9: ( THE WHITE_SPACE )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==THE) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:96:10: THE WHITE_SPACE
                            {
                            THE53=(Token)match(input,THE,FOLLOW_THE_in_relaxed_date649); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_THE.add(THE53);

                            WHITE_SPACE54=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_relaxed_date651); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE54);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_relaxed_day_of_month_in_relaxed_date655);
                    relaxed_day_of_month55=relaxed_day_of_month();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_relaxed_day_of_month.add(relaxed_day_of_month55.getTree());
                    WHITE_SPACE56=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_relaxed_date657); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE56);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:96:61: ( OF WHITE_SPACE )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==OF) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:96:62: OF WHITE_SPACE
                            {
                            OF57=(Token)match(input,OF,FOLLOW_OF_in_relaxed_date660); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_OF.add(OF57);

                            WHITE_SPACE58=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_relaxed_date662); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE58);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_relaxed_month_in_relaxed_date666);
                    relaxed_month59=relaxed_month();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_relaxed_month.add(relaxed_month59.getTree());

                    }
                    break;
                case 4 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:98:9: ( THE WHITE_SPACE )? relaxed_month WHITE_SPACE relaxed_day_of_month
                    {
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:98:9: ( THE WHITE_SPACE )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==THE) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:98:10: THE WHITE_SPACE
                            {
                            THE60=(Token)match(input,THE,FOLLOW_THE_in_relaxed_date684); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_THE.add(THE60);

                            WHITE_SPACE61=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_relaxed_date686); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE61);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_relaxed_month_in_relaxed_date690);
                    relaxed_month62=relaxed_month();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_relaxed_month.add(relaxed_month62.getTree());
                    WHITE_SPACE63=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_relaxed_date692); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE63);

                    pushFollow(FOLLOW_relaxed_day_of_month_in_relaxed_date694);
                    relaxed_day_of_month64=relaxed_day_of_month();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_relaxed_day_of_month.add(relaxed_day_of_month64.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: relaxed_day_of_month, relaxed_year, relaxed_month
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 99:7: -> ^( EXPLICIT_DATE relaxed_month relaxed_day_of_month ( relaxed_year )? )
            {
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:99:10: ^( EXPLICIT_DATE relaxed_month relaxed_day_of_month ( relaxed_year )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPLICIT_DATE, "EXPLICIT_DATE"), root_1);

                adaptor.addChild(root_1, stream_relaxed_month.nextTree());
                adaptor.addChild(root_1, stream_relaxed_day_of_month.nextTree());
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:99:61: ( relaxed_year )?
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
    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:102:1: relaxed_month : ( JANUARY -> ^( MONTH_OF_YEAR INT[\"1\"] ) | FEBRUARY -> ^( MONTH_OF_YEAR INT[\"2\"] ) | MARCH -> ^( MONTH_OF_YEAR INT[\"3\"] ) | APRIL -> ^( MONTH_OF_YEAR INT[\"4\"] ) | MAY -> ^( MONTH_OF_YEAR INT[\"5\"] ) | JUNE -> ^( MONTH_OF_YEAR INT[\"6\"] ) | JULY -> ^( MONTH_OF_YEAR INT[\"7\"] ) | AUGUST -> ^( MONTH_OF_YEAR INT[\"8\"] ) | SEPTEMBER -> ^( MONTH_OF_YEAR INT[\"9\"] ) | OCTOBER -> ^( MONTH_OF_YEAR INT[\"10\"] ) | NOVEMBER -> ^( MONTH_OF_YEAR INT[\"11\"] ) | DECEMBER -> ^( MONTH_OF_YEAR INT[\"12\"] ) );
    public final DateParser.relaxed_month_return relaxed_month() throws RecognitionException {
        DateParser.relaxed_month_return retval = new DateParser.relaxed_month_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token JANUARY65=null;
        Token FEBRUARY66=null;
        Token MARCH67=null;
        Token APRIL68=null;
        Token MAY69=null;
        Token JUNE70=null;
        Token JULY71=null;
        Token AUGUST72=null;
        Token SEPTEMBER73=null;
        Token OCTOBER74=null;
        Token NOVEMBER75=null;
        Token DECEMBER76=null;

        Object JANUARY65_tree=null;
        Object FEBRUARY66_tree=null;
        Object MARCH67_tree=null;
        Object APRIL68_tree=null;
        Object MAY69_tree=null;
        Object JUNE70_tree=null;
        Object JULY71_tree=null;
        Object AUGUST72_tree=null;
        Object SEPTEMBER73_tree=null;
        Object OCTOBER74_tree=null;
        Object NOVEMBER75_tree=null;
        Object DECEMBER76_tree=null;
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
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:103:3: ( JANUARY -> ^( MONTH_OF_YEAR INT[\"1\"] ) | FEBRUARY -> ^( MONTH_OF_YEAR INT[\"2\"] ) | MARCH -> ^( MONTH_OF_YEAR INT[\"3\"] ) | APRIL -> ^( MONTH_OF_YEAR INT[\"4\"] ) | MAY -> ^( MONTH_OF_YEAR INT[\"5\"] ) | JUNE -> ^( MONTH_OF_YEAR INT[\"6\"] ) | JULY -> ^( MONTH_OF_YEAR INT[\"7\"] ) | AUGUST -> ^( MONTH_OF_YEAR INT[\"8\"] ) | SEPTEMBER -> ^( MONTH_OF_YEAR INT[\"9\"] ) | OCTOBER -> ^( MONTH_OF_YEAR INT[\"10\"] ) | NOVEMBER -> ^( MONTH_OF_YEAR INT[\"11\"] ) | DECEMBER -> ^( MONTH_OF_YEAR INT[\"12\"] ) )
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
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:103:5: JANUARY
                    {
                    JANUARY65=(Token)match(input,JANUARY,FOLLOW_JANUARY_in_relaxed_month726); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_JANUARY.add(JANUARY65);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 103:15: -> ^( MONTH_OF_YEAR INT[\"1\"] )
                    {
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:103:18: ^( MONTH_OF_YEAR INT[\"1\"] )
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
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:104:5: FEBRUARY
                    {
                    FEBRUARY66=(Token)match(input,FEBRUARY,FOLLOW_FEBRUARY_in_relaxed_month743); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FEBRUARY.add(FEBRUARY66);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 104:15: -> ^( MONTH_OF_YEAR INT[\"2\"] )
                    {
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:104:18: ^( MONTH_OF_YEAR INT[\"2\"] )
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
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:105:5: MARCH
                    {
                    MARCH67=(Token)match(input,MARCH,FOLLOW_MARCH_in_relaxed_month759); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_MARCH.add(MARCH67);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 105:15: -> ^( MONTH_OF_YEAR INT[\"3\"] )
                    {
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:105:18: ^( MONTH_OF_YEAR INT[\"3\"] )
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
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:106:5: APRIL
                    {
                    APRIL68=(Token)match(input,APRIL,FOLLOW_APRIL_in_relaxed_month778); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_APRIL.add(APRIL68);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 106:15: -> ^( MONTH_OF_YEAR INT[\"4\"] )
                    {
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:106:18: ^( MONTH_OF_YEAR INT[\"4\"] )
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
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:107:5: MAY
                    {
                    MAY69=(Token)match(input,MAY,FOLLOW_MAY_in_relaxed_month797); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_MAY.add(MAY69);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 107:15: -> ^( MONTH_OF_YEAR INT[\"5\"] )
                    {
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:107:18: ^( MONTH_OF_YEAR INT[\"5\"] )
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
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:108:5: JUNE
                    {
                    JUNE70=(Token)match(input,JUNE,FOLLOW_JUNE_in_relaxed_month818); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_JUNE.add(JUNE70);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 108:15: -> ^( MONTH_OF_YEAR INT[\"6\"] )
                    {
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:108:18: ^( MONTH_OF_YEAR INT[\"6\"] )
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
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:109:5: JULY
                    {
                    JULY71=(Token)match(input,JULY,FOLLOW_JULY_in_relaxed_month838); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_JULY.add(JULY71);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 109:15: -> ^( MONTH_OF_YEAR INT[\"7\"] )
                    {
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:109:18: ^( MONTH_OF_YEAR INT[\"7\"] )
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
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:110:5: AUGUST
                    {
                    AUGUST72=(Token)match(input,AUGUST,FOLLOW_AUGUST_in_relaxed_month858); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AUGUST.add(AUGUST72);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 110:15: -> ^( MONTH_OF_YEAR INT[\"8\"] )
                    {
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:110:18: ^( MONTH_OF_YEAR INT[\"8\"] )
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
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:111:5: SEPTEMBER
                    {
                    SEPTEMBER73=(Token)match(input,SEPTEMBER,FOLLOW_SEPTEMBER_in_relaxed_month876); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEPTEMBER.add(SEPTEMBER73);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 111:15: -> ^( MONTH_OF_YEAR INT[\"9\"] )
                    {
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:111:18: ^( MONTH_OF_YEAR INT[\"9\"] )
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
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:112:5: OCTOBER
                    {
                    OCTOBER74=(Token)match(input,OCTOBER,FOLLOW_OCTOBER_in_relaxed_month891); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OCTOBER.add(OCTOBER74);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 112:15: -> ^( MONTH_OF_YEAR INT[\"10\"] )
                    {
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:112:18: ^( MONTH_OF_YEAR INT[\"10\"] )
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
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:113:5: NOVEMBER
                    {
                    NOVEMBER75=(Token)match(input,NOVEMBER,FOLLOW_NOVEMBER_in_relaxed_month908); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NOVEMBER.add(NOVEMBER75);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 113:15: -> ^( MONTH_OF_YEAR INT[\"11\"] )
                    {
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:113:18: ^( MONTH_OF_YEAR INT[\"11\"] )
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
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:114:5: DECEMBER
                    {
                    DECEMBER76=(Token)match(input,DECEMBER,FOLLOW_DECEMBER_in_relaxed_month924); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DECEMBER.add(DECEMBER76);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 114:15: -> ^( MONTH_OF_YEAR INT[\"12\"] )
                    {
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:114:18: ^( MONTH_OF_YEAR INT[\"12\"] )
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
    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:117:1: relaxed_day_of_month : ( spelled_or_int_01_to_31_optional_prefix -> ^( DAY_OF_MONTH spelled_or_int_01_to_31_optional_prefix ) | spelled_first_to_thirty_first -> ^( DAY_OF_MONTH spelled_first_to_thirty_first ) );
    public final DateParser.relaxed_day_of_month_return relaxed_day_of_month() throws RecognitionException {
        DateParser.relaxed_day_of_month_return retval = new DateParser.relaxed_day_of_month_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        DateParser.spelled_or_int_01_to_31_optional_prefix_return spelled_or_int_01_to_31_optional_prefix77 = null;

        DateParser.spelled_first_to_thirty_first_return spelled_first_to_thirty_first78 = null;


        RewriteRuleSubtreeStream stream_spelled_first_to_thirty_first=new RewriteRuleSubtreeStream(adaptor,"rule spelled_first_to_thirty_first");
        RewriteRuleSubtreeStream stream_spelled_or_int_01_to_31_optional_prefix=new RewriteRuleSubtreeStream(adaptor,"rule spelled_or_int_01_to_31_optional_prefix");
        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:118:3: ( spelled_or_int_01_to_31_optional_prefix -> ^( DAY_OF_MONTH spelled_or_int_01_to_31_optional_prefix ) | spelled_first_to_thirty_first -> ^( DAY_OF_MONTH spelled_first_to_thirty_first ) )
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

                    if ( (LA23_6==AT||(LA23_6>=OF && LA23_6<=IN)||(LA23_6>=NOON && LA23_6<=NINE)) ) {
                        alt23=1;
                    }
                    else if ( ((LA23_6>=FIRST && LA23_6<=NINTH)) ) {
                        alt23=2;
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
                case WHITE_SPACE:
                    {
                    int LA23_7 = input.LA(3);

                    if ( (LA23_7==AT||(LA23_7>=OF && LA23_7<=IN)||(LA23_7>=NOON && LA23_7<=ONE)) ) {
                        alt23=1;
                    }
                    else if ( (LA23_7==FIRST) ) {
                        alt23=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 23, 7, input);

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

                    if ( (LA23_8==FIRST) ) {
                        alt23=2;
                    }
                    else if ( (LA23_8==ONE) ) {
                        alt23=1;
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
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:118:5: spelled_or_int_01_to_31_optional_prefix
                    {
                    pushFollow(FOLLOW_spelled_or_int_01_to_31_optional_prefix_in_relaxed_day_of_month949);
                    spelled_or_int_01_to_31_optional_prefix77=spelled_or_int_01_to_31_optional_prefix();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_spelled_or_int_01_to_31_optional_prefix.add(spelled_or_int_01_to_31_optional_prefix77.getTree());


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
                    // 119:7: -> ^( DAY_OF_MONTH spelled_or_int_01_to_31_optional_prefix )
                    {
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:119:10: ^( DAY_OF_MONTH spelled_or_int_01_to_31_optional_prefix )
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
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:121:5: spelled_first_to_thirty_first
                    {
                    pushFollow(FOLLOW_spelled_first_to_thirty_first_in_relaxed_day_of_month976);
                    spelled_first_to_thirty_first78=spelled_first_to_thirty_first();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_spelled_first_to_thirty_first.add(spelled_first_to_thirty_first78.getTree());


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
                    // 122:7: -> ^( DAY_OF_MONTH spelled_first_to_thirty_first )
                    {
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:122:10: ^( DAY_OF_MONTH spelled_first_to_thirty_first )
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
    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:125:1: relaxed_year : ( relaxed_year_prefix ( SINGLE_QUOTE )? int_00_to_99_mandatory_prefix -> ^( YEAR_OF int_00_to_99_mandatory_prefix ) | relaxed_year_prefix int_four_digits -> ^( YEAR_OF int_four_digits ) );
    public final DateParser.relaxed_year_return relaxed_year() throws RecognitionException {
        DateParser.relaxed_year_return retval = new DateParser.relaxed_year_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SINGLE_QUOTE80=null;
        DateParser.relaxed_year_prefix_return relaxed_year_prefix79 = null;

        DateParser.int_00_to_99_mandatory_prefix_return int_00_to_99_mandatory_prefix81 = null;

        DateParser.relaxed_year_prefix_return relaxed_year_prefix82 = null;

        DateParser.int_four_digits_return int_four_digits83 = null;


        Object SINGLE_QUOTE80_tree=null;
        RewriteRuleTokenStream stream_SINGLE_QUOTE=new RewriteRuleTokenStream(adaptor,"token SINGLE_QUOTE");
        RewriteRuleSubtreeStream stream_relaxed_year_prefix=new RewriteRuleSubtreeStream(adaptor,"rule relaxed_year_prefix");
        RewriteRuleSubtreeStream stream_int_four_digits=new RewriteRuleSubtreeStream(adaptor,"rule int_four_digits");
        RewriteRuleSubtreeStream stream_int_00_to_99_mandatory_prefix=new RewriteRuleSubtreeStream(adaptor,"rule int_00_to_99_mandatory_prefix");
        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:126:3: ( relaxed_year_prefix ( SINGLE_QUOTE )? int_00_to_99_mandatory_prefix -> ^( YEAR_OF int_00_to_99_mandatory_prefix ) | relaxed_year_prefix int_four_digits -> ^( YEAR_OF int_four_digits ) )
            int alt25=2;
            alt25 = dfa25.predict(input);
            switch (alt25) {
                case 1 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:126:5: relaxed_year_prefix ( SINGLE_QUOTE )? int_00_to_99_mandatory_prefix
                    {
                    pushFollow(FOLLOW_relaxed_year_prefix_in_relaxed_year1006);
                    relaxed_year_prefix79=relaxed_year_prefix();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_relaxed_year_prefix.add(relaxed_year_prefix79.getTree());
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:126:25: ( SINGLE_QUOTE )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==SINGLE_QUOTE) ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:126:25: SINGLE_QUOTE
                            {
                            SINGLE_QUOTE80=(Token)match(input,SINGLE_QUOTE,FOLLOW_SINGLE_QUOTE_in_relaxed_year1008); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_SINGLE_QUOTE.add(SINGLE_QUOTE80);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_int_00_to_99_mandatory_prefix_in_relaxed_year1011);
                    int_00_to_99_mandatory_prefix81=int_00_to_99_mandatory_prefix();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_int_00_to_99_mandatory_prefix.add(int_00_to_99_mandatory_prefix81.getTree());


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
                    // 127:7: -> ^( YEAR_OF int_00_to_99_mandatory_prefix )
                    {
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:127:10: ^( YEAR_OF int_00_to_99_mandatory_prefix )
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
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:129:5: relaxed_year_prefix int_four_digits
                    {
                    pushFollow(FOLLOW_relaxed_year_prefix_in_relaxed_year1038);
                    relaxed_year_prefix82=relaxed_year_prefix();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_relaxed_year_prefix.add(relaxed_year_prefix82.getTree());
                    pushFollow(FOLLOW_int_four_digits_in_relaxed_year1040);
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
                    // 130:7: -> ^( YEAR_OF int_four_digits )
                    {
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:130:10: ^( YEAR_OF int_four_digits )
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
    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:133:1: relaxed_year_prefix : ( COMMA ( WHITE_SPACE )? | WHITE_SPACE ) ( IN WHITE_SPACE THE WHITE_SPACE YEAR WHITE_SPACE )? ;
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

        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:134:3: ( ( COMMA ( WHITE_SPACE )? | WHITE_SPACE ) ( IN WHITE_SPACE THE WHITE_SPACE YEAR WHITE_SPACE )? )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:134:5: ( COMMA ( WHITE_SPACE )? | WHITE_SPACE ) ( IN WHITE_SPACE THE WHITE_SPACE YEAR WHITE_SPACE )?
            {
            root_0 = (Object)adaptor.nil();

            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:134:5: ( COMMA ( WHITE_SPACE )? | WHITE_SPACE )
            int alt27=2;
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

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:134:6: COMMA ( WHITE_SPACE )?
                    {
                    COMMA84=(Token)match(input,COMMA,FOLLOW_COMMA_in_relaxed_year_prefix1070); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    COMMA84_tree = (Object)adaptor.create(COMMA84);
                    adaptor.addChild(root_0, COMMA84_tree);
                    }
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:134:12: ( WHITE_SPACE )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==WHITE_SPACE) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:134:12: WHITE_SPACE
                            {
                            WHITE_SPACE85=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_relaxed_year_prefix1072); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            WHITE_SPACE85_tree = (Object)adaptor.create(WHITE_SPACE85);
                            adaptor.addChild(root_0, WHITE_SPACE85_tree);
                            }

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:134:27: WHITE_SPACE
                    {
                    WHITE_SPACE86=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_relaxed_year_prefix1077); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    WHITE_SPACE86_tree = (Object)adaptor.create(WHITE_SPACE86);
                    adaptor.addChild(root_0, WHITE_SPACE86_tree);
                    }

                    }
                    break;

            }

            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:134:40: ( IN WHITE_SPACE THE WHITE_SPACE YEAR WHITE_SPACE )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==IN) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:134:41: IN WHITE_SPACE THE WHITE_SPACE YEAR WHITE_SPACE
                    {
                    IN87=(Token)match(input,IN,FOLLOW_IN_in_relaxed_year_prefix1081); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IN87_tree = (Object)adaptor.create(IN87);
                    adaptor.addChild(root_0, IN87_tree);
                    }
                    WHITE_SPACE88=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_relaxed_year_prefix1083); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    WHITE_SPACE88_tree = (Object)adaptor.create(WHITE_SPACE88);
                    adaptor.addChild(root_0, WHITE_SPACE88_tree);
                    }
                    THE89=(Token)match(input,THE,FOLLOW_THE_in_relaxed_year_prefix1085); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    THE89_tree = (Object)adaptor.create(THE89);
                    adaptor.addChild(root_0, THE89_tree);
                    }
                    WHITE_SPACE90=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_relaxed_year_prefix1087); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    WHITE_SPACE90_tree = (Object)adaptor.create(WHITE_SPACE90);
                    adaptor.addChild(root_0, WHITE_SPACE90_tree);
                    }
                    YEAR91=(Token)match(input,YEAR,FOLLOW_YEAR_in_relaxed_year_prefix1089); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    YEAR91_tree = (Object)adaptor.create(YEAR91);
                    adaptor.addChild(root_0, YEAR91_tree);
                    }
                    WHITE_SPACE92=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_relaxed_year_prefix1091); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    WHITE_SPACE92_tree = (Object)adaptor.create(WHITE_SPACE92);
                    adaptor.addChild(root_0, WHITE_SPACE92_tree);
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
    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:139:1: formal_date : ( formal_year_four_digits formal_date_separator formal_month_of_year formal_date_separator formal_day_of_month -> ^( EXPLICIT_DATE formal_month_of_year formal_day_of_month formal_year_four_digits ) | formal_month_of_year formal_date_separator formal_day_of_month ( formal_date_separator formal_year )? -> ^( EXPLICIT_DATE formal_month_of_year formal_day_of_month ( formal_year )? ) );
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
        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:141:3: ( formal_year_four_digits formal_date_separator formal_month_of_year formal_date_separator formal_day_of_month -> ^( EXPLICIT_DATE formal_month_of_year formal_day_of_month formal_year_four_digits ) | formal_month_of_year formal_date_separator formal_day_of_month ( formal_date_separator formal_year )? -> ^( EXPLICIT_DATE formal_month_of_year formal_day_of_month ( formal_year )? ) )
            int alt30=2;
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

                    throw nvae;
                }
                }
                break;
            case INT_1_TO_9:
                {
                alt30=2;
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
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:141:5: formal_year_four_digits formal_date_separator formal_month_of_year formal_date_separator formal_day_of_month
                    {
                    pushFollow(FOLLOW_formal_year_four_digits_in_formal_date1114);
                    formal_year_four_digits93=formal_year_four_digits();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_formal_year_four_digits.add(formal_year_four_digits93.getTree());
                    pushFollow(FOLLOW_formal_date_separator_in_formal_date1116);
                    formal_date_separator94=formal_date_separator();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_formal_date_separator.add(formal_date_separator94.getTree());
                    pushFollow(FOLLOW_formal_month_of_year_in_formal_date1118);
                    formal_month_of_year95=formal_month_of_year();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_formal_month_of_year.add(formal_month_of_year95.getTree());
                    pushFollow(FOLLOW_formal_date_separator_in_formal_date1120);
                    formal_date_separator96=formal_date_separator();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_formal_date_separator.add(formal_date_separator96.getTree());
                    pushFollow(FOLLOW_formal_day_of_month_in_formal_date1122);
                    formal_day_of_month97=formal_day_of_month();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_formal_day_of_month.add(formal_day_of_month97.getTree());


                    // AST REWRITE
                    // elements: formal_month_of_year, formal_year_four_digits, formal_day_of_month
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 142:7: -> ^( EXPLICIT_DATE formal_month_of_year formal_day_of_month formal_year_four_digits )
                    {
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:142:10: ^( EXPLICIT_DATE formal_month_of_year formal_day_of_month formal_year_four_digits )
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
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:145:5: formal_month_of_year formal_date_separator formal_day_of_month ( formal_date_separator formal_year )?
                    {
                    pushFollow(FOLLOW_formal_month_of_year_in_formal_date1151);
                    formal_month_of_year98=formal_month_of_year();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_formal_month_of_year.add(formal_month_of_year98.getTree());
                    pushFollow(FOLLOW_formal_date_separator_in_formal_date1153);
                    formal_date_separator99=formal_date_separator();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_formal_date_separator.add(formal_date_separator99.getTree());
                    pushFollow(FOLLOW_formal_day_of_month_in_formal_date1155);
                    formal_day_of_month100=formal_day_of_month();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_formal_day_of_month.add(formal_day_of_month100.getTree());
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:145:68: ( formal_date_separator formal_year )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( ((LA29_0>=DASH && LA29_0<=SLASH)) ) {
                        alt29=1;
                    }
                    switch (alt29) {
                        case 1 :
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:145:69: formal_date_separator formal_year
                            {
                            pushFollow(FOLLOW_formal_date_separator_in_formal_date1158);
                            formal_date_separator101=formal_date_separator();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_formal_date_separator.add(formal_date_separator101.getTree());
                            pushFollow(FOLLOW_formal_year_in_formal_date1160);
                            formal_year102=formal_year();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_formal_year.add(formal_year102.getTree());

                            }
                            break;

                    }



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
                    // 146:7: -> ^( EXPLICIT_DATE formal_month_of_year formal_day_of_month ( formal_year )? )
                    {
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:146:10: ^( EXPLICIT_DATE formal_month_of_year formal_day_of_month ( formal_year )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPLICIT_DATE, "EXPLICIT_DATE"), root_1);

                        adaptor.addChild(root_1, stream_formal_month_of_year.nextTree());
                        adaptor.addChild(root_1, stream_formal_day_of_month.nextTree());
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:146:67: ( formal_year )?
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
    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:149:1: formal_month_of_year : int_01_to_12_optional_prefix -> ^( MONTH_OF_YEAR int_01_to_12_optional_prefix ) ;
    public final DateParser.formal_month_of_year_return formal_month_of_year() throws RecognitionException {
        DateParser.formal_month_of_year_return retval = new DateParser.formal_month_of_year_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        DateParser.int_01_to_12_optional_prefix_return int_01_to_12_optional_prefix103 = null;


        RewriteRuleSubtreeStream stream_int_01_to_12_optional_prefix=new RewriteRuleSubtreeStream(adaptor,"rule int_01_to_12_optional_prefix");
        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:150:3: ( int_01_to_12_optional_prefix -> ^( MONTH_OF_YEAR int_01_to_12_optional_prefix ) )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:150:5: int_01_to_12_optional_prefix
            {
            pushFollow(FOLLOW_int_01_to_12_optional_prefix_in_formal_month_of_year1194);
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
            // 150:34: -> ^( MONTH_OF_YEAR int_01_to_12_optional_prefix )
            {
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:150:37: ^( MONTH_OF_YEAR int_01_to_12_optional_prefix )
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
    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:153:1: formal_day_of_month : int_01_to_31_optional_prefix -> ^( DAY_OF_MONTH int_01_to_31_optional_prefix ) ;
    public final DateParser.formal_day_of_month_return formal_day_of_month() throws RecognitionException {
        DateParser.formal_day_of_month_return retval = new DateParser.formal_day_of_month_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        DateParser.int_01_to_31_optional_prefix_return int_01_to_31_optional_prefix104 = null;


        RewriteRuleSubtreeStream stream_int_01_to_31_optional_prefix=new RewriteRuleSubtreeStream(adaptor,"rule int_01_to_31_optional_prefix");
        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:154:3: ( int_01_to_31_optional_prefix -> ^( DAY_OF_MONTH int_01_to_31_optional_prefix ) )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:154:5: int_01_to_31_optional_prefix
            {
            pushFollow(FOLLOW_int_01_to_31_optional_prefix_in_formal_day_of_month1217);
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
            // 154:34: -> ^( DAY_OF_MONTH int_01_to_31_optional_prefix )
            {
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:154:37: ^( DAY_OF_MONTH int_01_to_31_optional_prefix )
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
    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:157:1: formal_year : ( formal_year_four_digits | int_00_to_99_mandatory_prefix -> ^( YEAR_OF int_00_to_99_mandatory_prefix ) );
    public final DateParser.formal_year_return formal_year() throws RecognitionException {
        DateParser.formal_year_return retval = new DateParser.formal_year_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        DateParser.formal_year_four_digits_return formal_year_four_digits105 = null;

        DateParser.int_00_to_99_mandatory_prefix_return int_00_to_99_mandatory_prefix106 = null;


        RewriteRuleSubtreeStream stream_int_00_to_99_mandatory_prefix=new RewriteRuleSubtreeStream(adaptor,"rule int_00_to_99_mandatory_prefix");
        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:158:3: ( formal_year_four_digits | int_00_to_99_mandatory_prefix -> ^( YEAR_OF int_00_to_99_mandatory_prefix ) )
            int alt31=2;
            switch ( input.LA(1) ) {
            case INT_00:
                {
                int LA31_1 = input.LA(2);

                if ( (LA31_1==EOF||LA31_1==WHITE_SPACE||LA31_1==COMMA) ) {
                    alt31=2;
                }
                else if ( (LA31_1==INT_00||(LA31_1>=INT_01_TO_12 && LA31_1<=INT_60_TO_99)) ) {
                    alt31=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 31, 1, input);

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

                    throw nvae;
                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }

            switch (alt31) {
                case 1 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:158:5: formal_year_four_digits
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_formal_year_four_digits_in_formal_year1240);
                    formal_year_four_digits105=formal_year_four_digits();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, formal_year_four_digits105.getTree());

                    }
                    break;
                case 2 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:159:5: int_00_to_99_mandatory_prefix
                    {
                    pushFollow(FOLLOW_int_00_to_99_mandatory_prefix_in_formal_year1246);
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
                    // 159:35: -> ^( YEAR_OF int_00_to_99_mandatory_prefix )
                    {
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:159:38: ^( YEAR_OF int_00_to_99_mandatory_prefix )
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
    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:162:1: formal_year_four_digits : int_four_digits -> ^( YEAR_OF int_four_digits ) ;
    public final DateParser.formal_year_four_digits_return formal_year_four_digits() throws RecognitionException {
        DateParser.formal_year_four_digits_return retval = new DateParser.formal_year_four_digits_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        DateParser.int_four_digits_return int_four_digits107 = null;


        RewriteRuleSubtreeStream stream_int_four_digits=new RewriteRuleSubtreeStream(adaptor,"rule int_four_digits");
        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:163:3: ( int_four_digits -> ^( YEAR_OF int_four_digits ) )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:163:5: int_four_digits
            {
            pushFollow(FOLLOW_int_four_digits_in_formal_year_four_digits1269);
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
            // 163:21: -> ^( YEAR_OF int_four_digits )
            {
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:163:24: ^( YEAR_OF int_four_digits )
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
    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:166:1: formal_date_separator : ( DASH | SLASH );
    public final DateParser.formal_date_separator_return formal_date_separator() throws RecognitionException {
        DateParser.formal_date_separator_return retval = new DateParser.formal_date_separator_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set108=null;

        Object set108_tree=null;

        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:167:3: ( DASH | SLASH )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:
            {
            root_0 = (Object)adaptor.nil();

            set108=(Token)input.LT(1);
            if ( (input.LA(1)>=DASH && input.LA(1)<=SLASH) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set108));
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
    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:173:1: relative_date : ( relative_prefix WHITE_SPACE relative_target ( 's' )? -> ^( RELATIVE_DATE ^( SEEK relative_prefix relative_target ) ) | implicit_prefix WHITE_SPACE relative_target -> ^( RELATIVE_DATE ^( SEEK implicit_prefix relative_target ) ) | relative_target -> ^( RELATIVE_DATE ^( SEEK DIRECTION[\">\"] SEEK_BY[\"by_day\"] INT[\"0\"] relative_target ) ) | spelled_or_int_01_to_31_optional_prefix WHITE_SPACE relative_target WHITE_SPACE relative_suffix -> ^( RELATIVE_DATE ^( SEEK relative_suffix spelled_or_int_01_to_31_optional_prefix relative_target ) ) | ( THE )? WHITE_SPACE LAST WHITE_SPACE day_of_week WHITE_SPACE IN WHITE_SPACE relaxed_month | named_relative_date );
    public final DateParser.relative_date_return relative_date() throws RecognitionException {
        DateParser.relative_date_return retval = new DateParser.relative_date_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token WHITE_SPACE110=null;
        Token char_literal112=null;
        Token WHITE_SPACE114=null;
        Token WHITE_SPACE118=null;
        Token WHITE_SPACE120=null;
        Token THE122=null;
        Token WHITE_SPACE123=null;
        Token LAST124=null;
        Token WHITE_SPACE125=null;
        Token WHITE_SPACE127=null;
        Token IN128=null;
        Token WHITE_SPACE129=null;
        DateParser.relative_prefix_return relative_prefix109 = null;

        DateParser.relative_target_return relative_target111 = null;

        DateParser.implicit_prefix_return implicit_prefix113 = null;

        DateParser.relative_target_return relative_target115 = null;

        DateParser.relative_target_return relative_target116 = null;

        DateParser.spelled_or_int_01_to_31_optional_prefix_return spelled_or_int_01_to_31_optional_prefix117 = null;

        DateParser.relative_target_return relative_target119 = null;

        DateParser.relative_suffix_return relative_suffix121 = null;

        DateParser.day_of_week_return day_of_week126 = null;

        DateParser.relaxed_month_return relaxed_month130 = null;

        DateParser.named_relative_date_return named_relative_date131 = null;


        Object WHITE_SPACE110_tree=null;
        Object char_literal112_tree=null;
        Object WHITE_SPACE114_tree=null;
        Object WHITE_SPACE118_tree=null;
        Object WHITE_SPACE120_tree=null;
        Object THE122_tree=null;
        Object WHITE_SPACE123_tree=null;
        Object LAST124_tree=null;
        Object WHITE_SPACE125_tree=null;
        Object WHITE_SPACE127_tree=null;
        Object IN128_tree=null;
        Object WHITE_SPACE129_tree=null;
        RewriteRuleTokenStream stream_136=new RewriteRuleTokenStream(adaptor,"token 136");
        RewriteRuleTokenStream stream_WHITE_SPACE=new RewriteRuleTokenStream(adaptor,"token WHITE_SPACE");
        RewriteRuleSubtreeStream stream_relative_suffix=new RewriteRuleSubtreeStream(adaptor,"rule relative_suffix");
        RewriteRuleSubtreeStream stream_implicit_prefix=new RewriteRuleSubtreeStream(adaptor,"rule implicit_prefix");
        RewriteRuleSubtreeStream stream_relative_prefix=new RewriteRuleSubtreeStream(adaptor,"rule relative_prefix");
        RewriteRuleSubtreeStream stream_spelled_or_int_01_to_31_optional_prefix=new RewriteRuleSubtreeStream(adaptor,"rule spelled_or_int_01_to_31_optional_prefix");
        RewriteRuleSubtreeStream stream_relative_target=new RewriteRuleSubtreeStream(adaptor,"rule relative_target");
        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:174:3: ( relative_prefix WHITE_SPACE relative_target ( 's' )? -> ^( RELATIVE_DATE ^( SEEK relative_prefix relative_target ) ) | implicit_prefix WHITE_SPACE relative_target -> ^( RELATIVE_DATE ^( SEEK implicit_prefix relative_target ) ) | relative_target -> ^( RELATIVE_DATE ^( SEEK DIRECTION[\">\"] SEEK_BY[\"by_day\"] INT[\"0\"] relative_target ) ) | spelled_or_int_01_to_31_optional_prefix WHITE_SPACE relative_target WHITE_SPACE relative_suffix -> ^( RELATIVE_DATE ^( SEEK relative_suffix spelled_or_int_01_to_31_optional_prefix relative_target ) ) | ( THE )? WHITE_SPACE LAST WHITE_SPACE day_of_week WHITE_SPACE IN WHITE_SPACE relaxed_month | named_relative_date )
            int alt34=6;
            alt34 = dfa34.predict(input);
            switch (alt34) {
                case 1 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:174:5: relative_prefix WHITE_SPACE relative_target ( 's' )?
                    {
                    pushFollow(FOLLOW_relative_prefix_in_relative_date1318);
                    relative_prefix109=relative_prefix();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_relative_prefix.add(relative_prefix109.getTree());
                    WHITE_SPACE110=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_relative_date1320); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE110);

                    pushFollow(FOLLOW_relative_target_in_relative_date1322);
                    relative_target111=relative_target();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_relative_target.add(relative_target111.getTree());
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:174:49: ( 's' )?
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==136) ) {
                        alt32=1;
                    }
                    switch (alt32) {
                        case 1 :
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:174:49: 's'
                            {
                            char_literal112=(Token)match(input,136,FOLLOW_136_in_relative_date1324); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_136.add(char_literal112);


                            }
                            break;

                    }



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
                    // 175:7: -> ^( RELATIVE_DATE ^( SEEK relative_prefix relative_target ) )
                    {
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:175:10: ^( RELATIVE_DATE ^( SEEK relative_prefix relative_target ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(RELATIVE_DATE, "RELATIVE_DATE"), root_1);

                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:175:26: ^( SEEK relative_prefix relative_target )
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
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:177:5: implicit_prefix WHITE_SPACE relative_target
                    {
                    pushFollow(FOLLOW_implicit_prefix_in_relative_date1358);
                    implicit_prefix113=implicit_prefix();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_implicit_prefix.add(implicit_prefix113.getTree());
                    WHITE_SPACE114=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_relative_date1360); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE114);

                    pushFollow(FOLLOW_relative_target_in_relative_date1362);
                    relative_target115=relative_target();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_relative_target.add(relative_target115.getTree());


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
                    // 178:7: -> ^( RELATIVE_DATE ^( SEEK implicit_prefix relative_target ) )
                    {
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:178:10: ^( RELATIVE_DATE ^( SEEK implicit_prefix relative_target ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(RELATIVE_DATE, "RELATIVE_DATE"), root_1);

                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:178:26: ^( SEEK implicit_prefix relative_target )
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
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:181:5: relative_target
                    {
                    pushFollow(FOLLOW_relative_target_in_relative_date1399);
                    relative_target116=relative_target();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_relative_target.add(relative_target116.getTree());


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
                    // 182:7: -> ^( RELATIVE_DATE ^( SEEK DIRECTION[\">\"] SEEK_BY[\"by_day\"] INT[\"0\"] relative_target ) )
                    {
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:182:10: ^( RELATIVE_DATE ^( SEEK DIRECTION[\">\"] SEEK_BY[\"by_day\"] INT[\"0\"] relative_target ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(RELATIVE_DATE, "RELATIVE_DATE"), root_1);

                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:182:26: ^( SEEK DIRECTION[\">\"] SEEK_BY[\"by_day\"] INT[\"0\"] relative_target )
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
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:184:5: spelled_or_int_01_to_31_optional_prefix WHITE_SPACE relative_target WHITE_SPACE relative_suffix
                    {
                    pushFollow(FOLLOW_spelled_or_int_01_to_31_optional_prefix_in_relative_date1439);
                    spelled_or_int_01_to_31_optional_prefix117=spelled_or_int_01_to_31_optional_prefix();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_spelled_or_int_01_to_31_optional_prefix.add(spelled_or_int_01_to_31_optional_prefix117.getTree());
                    WHITE_SPACE118=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_relative_date1441); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE118);

                    pushFollow(FOLLOW_relative_target_in_relative_date1443);
                    relative_target119=relative_target();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_relative_target.add(relative_target119.getTree());
                    WHITE_SPACE120=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_relative_date1445); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE120);

                    pushFollow(FOLLOW_relative_suffix_in_relative_date1447);
                    relative_suffix121=relative_suffix();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_relative_suffix.add(relative_suffix121.getTree());


                    // AST REWRITE
                    // elements: relative_target, relative_suffix, spelled_or_int_01_to_31_optional_prefix
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 185:7: -> ^( RELATIVE_DATE ^( SEEK relative_suffix spelled_or_int_01_to_31_optional_prefix relative_target ) )
                    {
                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:185:10: ^( RELATIVE_DATE ^( SEEK relative_suffix spelled_or_int_01_to_31_optional_prefix relative_target ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(RELATIVE_DATE, "RELATIVE_DATE"), root_1);

                        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:185:26: ^( SEEK relative_suffix spelled_or_int_01_to_31_optional_prefix relative_target )
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
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:189:5: ( THE )? WHITE_SPACE LAST WHITE_SPACE day_of_week WHITE_SPACE IN WHITE_SPACE relaxed_month
                    {
                    root_0 = (Object)adaptor.nil();

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:189:5: ( THE )?
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==THE) ) {
                        alt33=1;
                    }
                    switch (alt33) {
                        case 1 :
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:189:5: THE
                            {
                            THE122=(Token)match(input,THE,FOLLOW_THE_in_relative_date1493); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            THE122_tree = (Object)adaptor.create(THE122);
                            adaptor.addChild(root_0, THE122_tree);
                            }

                            }
                            break;

                    }

                    WHITE_SPACE123=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_relative_date1496); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    WHITE_SPACE123_tree = (Object)adaptor.create(WHITE_SPACE123);
                    adaptor.addChild(root_0, WHITE_SPACE123_tree);
                    }
                    LAST124=(Token)match(input,LAST,FOLLOW_LAST_in_relative_date1498); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LAST124_tree = (Object)adaptor.create(LAST124);
                    adaptor.addChild(root_0, LAST124_tree);
                    }
                    WHITE_SPACE125=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_relative_date1500); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    WHITE_SPACE125_tree = (Object)adaptor.create(WHITE_SPACE125);
                    adaptor.addChild(root_0, WHITE_SPACE125_tree);
                    }
                    pushFollow(FOLLOW_day_of_week_in_relative_date1502);
                    day_of_week126=day_of_week();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, day_of_week126.getTree());
                    WHITE_SPACE127=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_relative_date1504); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    WHITE_SPACE127_tree = (Object)adaptor.create(WHITE_SPACE127);
                    adaptor.addChild(root_0, WHITE_SPACE127_tree);
                    }
                    IN128=(Token)match(input,IN,FOLLOW_IN_in_relative_date1506); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IN128_tree = (Object)adaptor.create(IN128);
                    adaptor.addChild(root_0, IN128_tree);
                    }
                    WHITE_SPACE129=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_relative_date1508); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    WHITE_SPACE129_tree = (Object)adaptor.create(WHITE_SPACE129);
                    adaptor.addChild(root_0, WHITE_SPACE129_tree);
                    }
                    pushFollow(FOLLOW_relaxed_month_in_relative_date1510);
                    relaxed_month130=relaxed_month();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, relaxed_month130.getTree());

                    }
                    break;
                case 6 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:191:5: named_relative_date
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_named_relative_date_in_relative_date1523);
                    named_relative_date131=named_relative_date();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, named_relative_date131.getTree());

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

        DateParser.day_of_week_return day_of_week132 = null;

        DateParser.relaxed_month_return relaxed_month133 = null;

        DateParser.relative_date_span_return relative_date_span134 = null;



        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:195:3: ( day_of_week | relaxed_month | relative_date_span )
            int alt35=3;
            switch ( input.LA(1) ) {
            case SUNDAY:
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
            case FRIDAY:
            case SATURDAY:
                {
                alt35=1;
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
                alt35=2;
                }
                break;
            case DAY:
            case YEAR:
            case WEEK:
            case MONTH:
                {
                alt35=3;
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
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:195:5: day_of_week
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_day_of_week_in_relative_target1539);
                    day_of_week132=day_of_week();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, day_of_week132.getTree());

                    }
                    break;
                case 2 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:196:5: relaxed_month
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_relaxed_month_in_relative_target1546);
                    relaxed_month133=relaxed_month();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, relaxed_month133.getTree());

                    }
                    break;
                case 3 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:197:5: relative_date_span
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_relative_date_span_in_relative_target1552);
                    relative_date_span134=relative_date_span();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, relative_date_span134.getTree());

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

        Token THIS135=null;

        Object THIS135_tree=null;
        RewriteRuleTokenStream stream_THIS=new RewriteRuleTokenStream(adaptor,"token THIS");

        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:201:3: ( THIS -> DIRECTION[\">\"] SEEK_BY[\"by_day\"] INT[\"0\"] )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:201:5: THIS
            {
            THIS135=(Token)match(input,THIS,FOLLOW_THIS_in_implicit_prefix1567); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_THIS.add(THIS135);



            // AST REWRITE
            // elements: 
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

        Token THIS136=null;
        Token WHITE_SPACE137=null;
        Token LAST138=null;
        Token THIS139=null;
        Token WHITE_SPACE140=null;
        Token NEXT141=null;
        Token THIS142=null;
        Token WHITE_SPACE143=null;
        Token PAST144=null;
        Token THIS145=null;
        Token WHITE_SPACE146=null;
        Token COMING147=null;
        Token THIS148=null;
        Token WHITE_SPACE149=null;
        Token UPCOMING150=null;
        Token IN151=null;
        Token WHITE_SPACE152=null;
        DateParser.spelled_or_int_01_to_31_optional_prefix_return spelled_or_int_01_to_31_optional_prefix153 = null;


        Object THIS136_tree=null;
        Object WHITE_SPACE137_tree=null;
        Object LAST138_tree=null;
        Object THIS139_tree=null;
        Object WHITE_SPACE140_tree=null;
        Object NEXT141_tree=null;
        Object THIS142_tree=null;
        Object WHITE_SPACE143_tree=null;
        Object PAST144_tree=null;
        Object THIS145_tree=null;
        Object WHITE_SPACE146_tree=null;
        Object COMING147_tree=null;
        Object THIS148_tree=null;
        Object WHITE_SPACE149_tree=null;
        Object UPCOMING150_tree=null;
        Object IN151_tree=null;
        Object WHITE_SPACE152_tree=null;
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
            int alt42=6;
            switch ( input.LA(1) ) {
            case THIS:
                {
                int LA42_1 = input.LA(2);

                if ( (LA42_1==WHITE_SPACE) ) {
                    switch ( input.LA(3) ) {
                    case PAST:
                        {
                        alt42=3;
                        }
                        break;
                    case COMING:
                        {
                        alt42=4;
                        }
                        break;
                    case LAST:
                        {
                        alt42=1;
                        }
                        break;
                    case NEXT:
                        {
                        alt42=2;
                        }
                        break;
                    case UPCOMING:
                        {
                        alt42=5;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 42, 8, input);

                        throw nvae;
                    }

                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 42, 1, input);

                    throw nvae;
                }
                }
                break;
            case LAST:
                {
                alt42=1;
                }
                break;
            case NEXT:
                {
                alt42=2;
                }
                break;
            case PAST:
                {
                alt42=3;
                }
                break;
            case COMING:
                {
                alt42=4;
                }
                break;
            case UPCOMING:
                {
                alt42=5;
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
                alt42=6;
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
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:205:5: ( THIS WHITE_SPACE )? LAST
                    {
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:205:5: ( THIS WHITE_SPACE )?
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0==THIS) ) {
                        alt36=1;
                    }
                    switch (alt36) {
                        case 1 :
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:205:6: THIS WHITE_SPACE
                            {
                            THIS136=(Token)match(input,THIS,FOLLOW_THIS_in_relative_prefix1594); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_THIS.add(THIS136);

                            WHITE_SPACE137=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_relative_prefix1596); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE137);


                            }
                            break;

                    }

                    LAST138=(Token)match(input,LAST,FOLLOW_LAST_in_relative_prefix1600); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LAST.add(LAST138);



                    // AST REWRITE
                    // elements: 
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
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( (LA37_0==THIS) ) {
                        alt37=1;
                    }
                    switch (alt37) {
                        case 1 :
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:206:6: THIS WHITE_SPACE
                            {
                            THIS139=(Token)match(input,THIS,FOLLOW_THIS_in_relative_prefix1622); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_THIS.add(THIS139);

                            WHITE_SPACE140=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_relative_prefix1624); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE140);


                            }
                            break;

                    }

                    NEXT141=(Token)match(input,NEXT,FOLLOW_NEXT_in_relative_prefix1628); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NEXT.add(NEXT141);



                    // AST REWRITE
                    // elements: 
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
                    int alt38=2;
                    int LA38_0 = input.LA(1);

                    if ( (LA38_0==THIS) ) {
                        alt38=1;
                    }
                    switch (alt38) {
                        case 1 :
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:207:6: THIS WHITE_SPACE
                            {
                            THIS142=(Token)match(input,THIS,FOLLOW_THIS_in_relative_prefix1650); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_THIS.add(THIS142);

                            WHITE_SPACE143=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_relative_prefix1652); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE143);


                            }
                            break;

                    }

                    PAST144=(Token)match(input,PAST,FOLLOW_PAST_in_relative_prefix1656); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PAST.add(PAST144);



                    // AST REWRITE
                    // elements: 
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
                    int alt39=2;
                    int LA39_0 = input.LA(1);

                    if ( (LA39_0==THIS) ) {
                        alt39=1;
                    }
                    switch (alt39) {
                        case 1 :
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:208:6: THIS WHITE_SPACE
                            {
                            THIS145=(Token)match(input,THIS,FOLLOW_THIS_in_relative_prefix1678); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_THIS.add(THIS145);

                            WHITE_SPACE146=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_relative_prefix1680); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE146);


                            }
                            break;

                    }

                    COMING147=(Token)match(input,COMING,FOLLOW_COMING_in_relative_prefix1684); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COMING.add(COMING147);



                    // AST REWRITE
                    // elements: 
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
                    int alt40=2;
                    int LA40_0 = input.LA(1);

                    if ( (LA40_0==THIS) ) {
                        alt40=1;
                    }
                    switch (alt40) {
                        case 1 :
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:209:6: THIS WHITE_SPACE
                            {
                            THIS148=(Token)match(input,THIS,FOLLOW_THIS_in_relative_prefix1704); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_THIS.add(THIS148);

                            WHITE_SPACE149=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_relative_prefix1706); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE149);


                            }
                            break;

                    }

                    UPCOMING150=(Token)match(input,UPCOMING,FOLLOW_UPCOMING_in_relative_prefix1710); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_UPCOMING.add(UPCOMING150);



                    // AST REWRITE
                    // elements: 
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
                    int alt41=2;
                    int LA41_0 = input.LA(1);

                    if ( (LA41_0==IN) ) {
                        alt41=1;
                    }
                    switch (alt41) {
                        case 1 :
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:210:6: IN WHITE_SPACE
                            {
                            IN151=(Token)match(input,IN,FOLLOW_IN_in_relative_prefix1728); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_IN.add(IN151);

                            WHITE_SPACE152=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_relative_prefix1730); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE152);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_spelled_or_int_01_to_31_optional_prefix_in_relative_prefix1734);
                    spelled_or_int_01_to_31_optional_prefix153=spelled_or_int_01_to_31_optional_prefix();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_spelled_or_int_01_to_31_optional_prefix.add(spelled_or_int_01_to_31_optional_prefix153.getTree());


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

        Token FROM154=null;
        Token WHITE_SPACE155=null;
        Token NOW156=null;
        Token AGO157=null;

        Object FROM154_tree=null;
        Object WHITE_SPACE155_tree=null;
        Object NOW156_tree=null;
        Object AGO157_tree=null;
        RewriteRuleTokenStream stream_AGO=new RewriteRuleTokenStream(adaptor,"token AGO");
        RewriteRuleTokenStream stream_NOW=new RewriteRuleTokenStream(adaptor,"token NOW");
        RewriteRuleTokenStream stream_FROM=new RewriteRuleTokenStream(adaptor,"token FROM");
        RewriteRuleTokenStream stream_WHITE_SPACE=new RewriteRuleTokenStream(adaptor,"token WHITE_SPACE");

        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:215:3: ( FROM WHITE_SPACE NOW -> DIRECTION[\">\"] SEEK_BY[\"by_day\"] | AGO -> DIRECTION[\"<\"] SEEK_BY[\"by_day\"] )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==FROM) ) {
                alt43=1;
            }
            else if ( (LA43_0==AGO) ) {
                alt43=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }
            switch (alt43) {
                case 1 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:215:5: FROM WHITE_SPACE NOW
                    {
                    FROM154=(Token)match(input,FROM,FOLLOW_FROM_in_relative_suffix1766); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FROM.add(FROM154);

                    WHITE_SPACE155=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_relative_suffix1768); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE155);

                    NOW156=(Token)match(input,NOW,FOLLOW_NOW_in_relative_suffix1770); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NOW.add(NOW156);



                    // AST REWRITE
                    // elements: 
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
                    AGO157=(Token)match(input,AGO,FOLLOW_AGO_in_relative_suffix1784); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AGO.add(AGO157);



                    // AST REWRITE
                    // elements: 
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

        Token DAY158=null;
        Token WEEK159=null;
        Token MONTH160=null;
        Token YEAR161=null;

        Object DAY158_tree=null;
        Object WEEK159_tree=null;
        Object MONTH160_tree=null;
        Object YEAR161_tree=null;
        RewriteRuleTokenStream stream_WEEK=new RewriteRuleTokenStream(adaptor,"token WEEK");
        RewriteRuleTokenStream stream_DAY=new RewriteRuleTokenStream(adaptor,"token DAY");
        RewriteRuleTokenStream stream_YEAR=new RewriteRuleTokenStream(adaptor,"token YEAR");
        RewriteRuleTokenStream stream_MONTH=new RewriteRuleTokenStream(adaptor,"token MONTH");

        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:220:3: ( DAY -> SPAN[\"day\"] | WEEK -> SPAN[\"week\"] | MONTH -> SPAN[\"month\"] | YEAR -> SPAN[\"year\"] )
            int alt44=4;
            switch ( input.LA(1) ) {
            case DAY:
                {
                alt44=1;
                }
                break;
            case WEEK:
                {
                alt44=2;
                }
                break;
            case MONTH:
                {
                alt44=3;
                }
                break;
            case YEAR:
                {
                alt44=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }

            switch (alt44) {
                case 1 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:220:5: DAY
                    {
                    DAY158=(Token)match(input,DAY,FOLLOW_DAY_in_relative_date_span1824); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DAY.add(DAY158);



                    // AST REWRITE
                    // elements: 
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
                    WEEK159=(Token)match(input,WEEK,FOLLOW_WEEK_in_relative_date_span1837); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WEEK.add(WEEK159);



                    // AST REWRITE
                    // elements: 
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
                    MONTH160=(Token)match(input,MONTH,FOLLOW_MONTH_in_relative_date_span1849); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_MONTH.add(MONTH160);



                    // AST REWRITE
                    // elements: 
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
                    YEAR161=(Token)match(input,YEAR,FOLLOW_YEAR_in_relative_date_span1860); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_YEAR.add(YEAR161);



                    // AST REWRITE
                    // elements: 
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

        Token SUNDAY162=null;
        Token MONDAY163=null;
        Token TUESDAY164=null;
        Token WEDNESDAY165=null;
        Token THURSDAY166=null;
        Token FRIDAY167=null;
        Token SATURDAY168=null;

        Object SUNDAY162_tree=null;
        Object MONDAY163_tree=null;
        Object TUESDAY164_tree=null;
        Object WEDNESDAY165_tree=null;
        Object THURSDAY166_tree=null;
        Object FRIDAY167_tree=null;
        Object SATURDAY168_tree=null;
        RewriteRuleTokenStream stream_MONDAY=new RewriteRuleTokenStream(adaptor,"token MONDAY");
        RewriteRuleTokenStream stream_SUNDAY=new RewriteRuleTokenStream(adaptor,"token SUNDAY");
        RewriteRuleTokenStream stream_WEDNESDAY=new RewriteRuleTokenStream(adaptor,"token WEDNESDAY");
        RewriteRuleTokenStream stream_THURSDAY=new RewriteRuleTokenStream(adaptor,"token THURSDAY");
        RewriteRuleTokenStream stream_SATURDAY=new RewriteRuleTokenStream(adaptor,"token SATURDAY");
        RewriteRuleTokenStream stream_TUESDAY=new RewriteRuleTokenStream(adaptor,"token TUESDAY");
        RewriteRuleTokenStream stream_FRIDAY=new RewriteRuleTokenStream(adaptor,"token FRIDAY");

        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:227:3: ( SUNDAY -> ^( DAY_OF_WEEK INT[\"1\"] ) | MONDAY -> ^( DAY_OF_WEEK INT[\"2\"] ) | TUESDAY -> ^( DAY_OF_WEEK INT[\"3\"] ) | WEDNESDAY -> ^( DAY_OF_WEEK INT[\"4\"] ) | THURSDAY -> ^( DAY_OF_WEEK INT[\"5\"] ) | FRIDAY -> ^( DAY_OF_WEEK INT[\"6\"] ) | SATURDAY -> ^( DAY_OF_WEEK INT[\"7\"] ) )
            int alt45=7;
            switch ( input.LA(1) ) {
            case SUNDAY:
                {
                alt45=1;
                }
                break;
            case MONDAY:
                {
                alt45=2;
                }
                break;
            case TUESDAY:
                {
                alt45=3;
                }
                break;
            case WEDNESDAY:
                {
                alt45=4;
                }
                break;
            case THURSDAY:
                {
                alt45=5;
                }
                break;
            case FRIDAY:
                {
                alt45=6;
                }
                break;
            case SATURDAY:
                {
                alt45=7;
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
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:227:5: SUNDAY
                    {
                    SUNDAY162=(Token)match(input,SUNDAY,FOLLOW_SUNDAY_in_day_of_week1880); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SUNDAY.add(SUNDAY162);



                    // AST REWRITE
                    // elements: 
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
                    MONDAY163=(Token)match(input,MONDAY,FOLLOW_MONDAY_in_day_of_week1898); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_MONDAY.add(MONDAY163);



                    // AST REWRITE
                    // elements: 
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
                    TUESDAY164=(Token)match(input,TUESDAY,FOLLOW_TUESDAY_in_day_of_week1916); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TUESDAY.add(TUESDAY164);



                    // AST REWRITE
                    // elements: 
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
                    WEDNESDAY165=(Token)match(input,WEDNESDAY,FOLLOW_WEDNESDAY_in_day_of_week1933); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WEDNESDAY.add(WEDNESDAY165);



                    // AST REWRITE
                    // elements: 
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
                    THURSDAY166=(Token)match(input,THURSDAY,FOLLOW_THURSDAY_in_day_of_week1948); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THURSDAY.add(THURSDAY166);



                    // AST REWRITE
                    // elements: 
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
                    FRIDAY167=(Token)match(input,FRIDAY,FOLLOW_FRIDAY_in_day_of_week1964); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FRIDAY.add(FRIDAY167);



                    // AST REWRITE
                    // elements: 
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
                    SATURDAY168=(Token)match(input,SATURDAY,FOLLOW_SATURDAY_in_day_of_week1982); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SATURDAY.add(SATURDAY168);



                    // AST REWRITE
                    // elements: 
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

        Token TODAY169=null;
        Token TOMORROW170=null;
        Token YESTERDAY171=null;

        Object TODAY169_tree=null;
        Object TOMORROW170_tree=null;
        Object YESTERDAY171_tree=null;
        RewriteRuleTokenStream stream_TODAY=new RewriteRuleTokenStream(adaptor,"token TODAY");
        RewriteRuleTokenStream stream_YESTERDAY=new RewriteRuleTokenStream(adaptor,"token YESTERDAY");
        RewriteRuleTokenStream stream_TOMORROW=new RewriteRuleTokenStream(adaptor,"token TOMORROW");

        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:237:3: ( TODAY -> ^( RELATIVE_DATE ^( SEEK DIRECTION[\">\"] SEEK_BY[\"by_day\"] INT[\"0\"] SPAN[\"day\"] ) ) | TOMORROW -> ^( RELATIVE_DATE ^( SEEK DIRECTION[\">\"] SEEK_BY[\"by_day\"] INT[\"1\"] SPAN[\"day\"] ) ) | YESTERDAY -> ^( RELATIVE_DATE ^( SEEK DIRECTION[\"<\"] SEEK_BY[\"by_day\"] INT[\"1\"] SPAN[\"day\"] ) ) )
            int alt46=3;
            switch ( input.LA(1) ) {
            case TODAY:
                {
                alt46=1;
                }
                break;
            case TOMORROW:
                {
                alt46=2;
                }
                break;
            case YESTERDAY:
                {
                alt46=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }

            switch (alt46) {
                case 1 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:237:5: TODAY
                    {
                    TODAY169=(Token)match(input,TODAY,FOLLOW_TODAY_in_named_relative_date2007); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TODAY.add(TODAY169);



                    // AST REWRITE
                    // elements: 
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
                    TOMORROW170=(Token)match(input,TOMORROW,FOLLOW_TOMORROW_in_named_relative_date2039); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TOMORROW.add(TOMORROW170);



                    // AST REWRITE
                    // elements: 
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
                    YESTERDAY171=(Token)match(input,YESTERDAY,FOLLOW_YESTERDAY_in_named_relative_date2068); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_YESTERDAY.add(YESTERDAY171);



                    // AST REWRITE
                    // elements: 
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

        Token COLON173=null;
        Token WHITE_SPACE175=null;
        Token MILITARY_HOUR_SUFFIX177=null;
        Token HOUR178=null;
        Token WHITE_SPACE180=null;
        DateParser.hours_return hours172 = null;

        DateParser.minutes_return minutes174 = null;

        DateParser.meridian_indicator_return meridian_indicator176 = null;

        DateParser.hours_return hours179 = null;

        DateParser.meridian_indicator_return meridian_indicator181 = null;

        DateParser.named_time_return named_time182 = null;


        Object COLON173_tree=null;
        Object WHITE_SPACE175_tree=null;
        Object MILITARY_HOUR_SUFFIX177_tree=null;
        Object HOUR178_tree=null;
        Object WHITE_SPACE180_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_HOUR=new RewriteRuleTokenStream(adaptor,"token HOUR");
        RewriteRuleTokenStream stream_MILITARY_HOUR_SUFFIX=new RewriteRuleTokenStream(adaptor,"token MILITARY_HOUR_SUFFIX");
        RewriteRuleTokenStream stream_WHITE_SPACE=new RewriteRuleTokenStream(adaptor,"token WHITE_SPACE");
        RewriteRuleSubtreeStream stream_meridian_indicator=new RewriteRuleSubtreeStream(adaptor,"rule meridian_indicator");
        RewriteRuleSubtreeStream stream_minutes=new RewriteRuleSubtreeStream(adaptor,"rule minutes");
        RewriteRuleSubtreeStream stream_hours=new RewriteRuleSubtreeStream(adaptor,"rule hours");
        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:246:3: ( hours ( COLON )? minutes ( ( WHITE_SPACE )? ( meridian_indicator | ( MILITARY_HOUR_SUFFIX | HOUR ) ) )? -> ^( EXPLICIT_TIME hours minutes ( meridian_indicator )? ) | hours ( ( WHITE_SPACE )? meridian_indicator )? -> ^( EXPLICIT_TIME hours ^( MINUTES_OF_HOUR INT[\"0\"] ) ( meridian_indicator )? ) | named_time )
            int alt54=3;
            switch ( input.LA(1) ) {
            case INT_0:
                {
                int LA54_1 = input.LA(2);

                if ( (LA54_1==EOF||LA54_1==WHITE_SPACE||LA54_1==COMMA||(LA54_1>=AM && LA54_1<=PM)) ) {
                    alt54=2;
                }
                else if ( (LA54_1==COLON||LA54_1==INT_00||(LA54_1>=INT_01_TO_12 && LA54_1<=INT_32_TO_59)) ) {
                    alt54=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 54, 1, input);

                    throw nvae;
                }
                }
                break;
            case INT_00:
                {
                int LA54_2 = input.LA(2);

                if ( (LA54_2==EOF||LA54_2==WHITE_SPACE||LA54_2==COMMA||(LA54_2>=AM && LA54_2<=PM)) ) {
                    alt54=2;
                }
                else if ( (LA54_2==COLON||LA54_2==INT_00||(LA54_2>=INT_01_TO_12 && LA54_2<=INT_32_TO_59)) ) {
                    alt54=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 54, 2, input);

                    throw nvae;
                }
                }
                break;
            case INT_1_TO_9:
                {
                int LA54_3 = input.LA(2);

                if ( (LA54_3==EOF||LA54_3==WHITE_SPACE||LA54_3==COMMA||(LA54_3>=AM && LA54_3<=PM)) ) {
                    alt54=2;
                }
                else if ( (LA54_3==COLON||LA54_3==INT_00||(LA54_3>=INT_01_TO_12 && LA54_3<=INT_32_TO_59)) ) {
                    alt54=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 54, 3, input);

                    throw nvae;
                }
                }
                break;
            case INT_01_TO_12:
                {
                int LA54_4 = input.LA(2);

                if ( (LA54_4==EOF||LA54_4==WHITE_SPACE||LA54_4==COMMA||(LA54_4>=AM && LA54_4<=PM)) ) {
                    alt54=2;
                }
                else if ( (LA54_4==COLON||LA54_4==INT_00||(LA54_4>=INT_01_TO_12 && LA54_4<=INT_32_TO_59)) ) {
                    alt54=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 54, 4, input);

                    throw nvae;
                }
                }
                break;
            case INT_13_TO_23:
                {
                int LA54_5 = input.LA(2);

                if ( (LA54_5==EOF||LA54_5==WHITE_SPACE||LA54_5==COMMA||(LA54_5>=AM && LA54_5<=PM)) ) {
                    alt54=2;
                }
                else if ( (LA54_5==COLON||LA54_5==INT_00||(LA54_5>=INT_01_TO_12 && LA54_5<=INT_32_TO_59)) ) {
                    alt54=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 54, 5, input);

                    throw nvae;
                }
                }
                break;
            case NOON:
            case MIDNIGHT:
                {
                alt54=3;
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
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:246:5: hours ( COLON )? minutes ( ( WHITE_SPACE )? ( meridian_indicator | ( MILITARY_HOUR_SUFFIX | HOUR ) ) )?
                    {
                    pushFollow(FOLLOW_hours_in_time2108);
                    hours172=hours();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_hours.add(hours172.getTree());
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:246:11: ( COLON )?
                    int alt47=2;
                    int LA47_0 = input.LA(1);

                    if ( (LA47_0==COLON) ) {
                        alt47=1;
                    }
                    switch (alt47) {
                        case 1 :
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:246:11: COLON
                            {
                            COLON173=(Token)match(input,COLON,FOLLOW_COLON_in_time2110); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_COLON.add(COLON173);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_minutes_in_time2113);
                    minutes174=minutes();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_minutes.add(minutes174.getTree());
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:246:26: ( ( WHITE_SPACE )? ( meridian_indicator | ( MILITARY_HOUR_SUFFIX | HOUR ) ) )?
                    int alt51=2;
                    int LA51_0 = input.LA(1);

                    if ( (LA51_0==WHITE_SPACE) ) {
                        int LA51_1 = input.LA(2);

                        if ( ((LA51_1>=MILITARY_HOUR_SUFFIX && LA51_1<=PM)) ) {
                            alt51=1;
                        }
                    }
                    else if ( ((LA51_0>=MILITARY_HOUR_SUFFIX && LA51_0<=PM)) ) {
                        alt51=1;
                    }
                    switch (alt51) {
                        case 1 :
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:246:27: ( WHITE_SPACE )? ( meridian_indicator | ( MILITARY_HOUR_SUFFIX | HOUR ) )
                            {
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:246:27: ( WHITE_SPACE )?
                            int alt48=2;
                            int LA48_0 = input.LA(1);

                            if ( (LA48_0==WHITE_SPACE) ) {
                                alt48=1;
                            }
                            switch (alt48) {
                                case 1 :
                                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:246:27: WHITE_SPACE
                                    {
                                    WHITE_SPACE175=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_time2116); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE175);


                                    }
                                    break;

                            }

                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:246:40: ( meridian_indicator | ( MILITARY_HOUR_SUFFIX | HOUR ) )
                            int alt50=2;
                            int LA50_0 = input.LA(1);

                            if ( ((LA50_0>=AM && LA50_0<=PM)) ) {
                                alt50=1;
                            }
                            else if ( ((LA50_0>=MILITARY_HOUR_SUFFIX && LA50_0<=HOUR)) ) {
                                alt50=2;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 50, 0, input);

                                throw nvae;
                            }
                            switch (alt50) {
                                case 1 :
                                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:246:41: meridian_indicator
                                    {
                                    pushFollow(FOLLOW_meridian_indicator_in_time2120);
                                    meridian_indicator176=meridian_indicator();

                                    state._fsp--;
                                    if (state.failed) return retval;
                                    if ( state.backtracking==0 ) stream_meridian_indicator.add(meridian_indicator176.getTree());

                                    }
                                    break;
                                case 2 :
                                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:246:62: ( MILITARY_HOUR_SUFFIX | HOUR )
                                    {
                                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:246:62: ( MILITARY_HOUR_SUFFIX | HOUR )
                                    int alt49=2;
                                    int LA49_0 = input.LA(1);

                                    if ( (LA49_0==MILITARY_HOUR_SUFFIX) ) {
                                        alt49=1;
                                    }
                                    else if ( (LA49_0==HOUR) ) {
                                        alt49=2;
                                    }
                                    else {
                                        if (state.backtracking>0) {state.failed=true; return retval;}
                                        NoViableAltException nvae =
                                            new NoViableAltException("", 49, 0, input);

                                        throw nvae;
                                    }
                                    switch (alt49) {
                                        case 1 :
                                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:246:63: MILITARY_HOUR_SUFFIX
                                            {
                                            MILITARY_HOUR_SUFFIX177=(Token)match(input,MILITARY_HOUR_SUFFIX,FOLLOW_MILITARY_HOUR_SUFFIX_in_time2125); if (state.failed) return retval; 
                                            if ( state.backtracking==0 ) stream_MILITARY_HOUR_SUFFIX.add(MILITARY_HOUR_SUFFIX177);


                                            }
                                            break;
                                        case 2 :
                                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:246:86: HOUR
                                            {
                                            HOUR178=(Token)match(input,HOUR,FOLLOW_HOUR_in_time2129); if (state.failed) return retval; 
                                            if ( state.backtracking==0 ) stream_HOUR.add(HOUR178);


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
                    pushFollow(FOLLOW_hours_in_time2165);
                    hours179=hours();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_hours.add(hours179.getTree());
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:249:11: ( ( WHITE_SPACE )? meridian_indicator )?
                    int alt53=2;
                    int LA53_0 = input.LA(1);

                    if ( (LA53_0==WHITE_SPACE) ) {
                        int LA53_1 = input.LA(2);

                        if ( ((LA53_1>=AM && LA53_1<=PM)) ) {
                            alt53=1;
                        }
                    }
                    else if ( ((LA53_0>=AM && LA53_0<=PM)) ) {
                        alt53=1;
                    }
                    switch (alt53) {
                        case 1 :
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:249:12: ( WHITE_SPACE )? meridian_indicator
                            {
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:249:12: ( WHITE_SPACE )?
                            int alt52=2;
                            int LA52_0 = input.LA(1);

                            if ( (LA52_0==WHITE_SPACE) ) {
                                alt52=1;
                            }
                            switch (alt52) {
                                case 1 :
                                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:249:12: WHITE_SPACE
                                    {
                                    WHITE_SPACE180=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_time2168); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE180);


                                    }
                                    break;

                            }

                            pushFollow(FOLLOW_meridian_indicator_in_time2171);
                            meridian_indicator181=meridian_indicator();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_meridian_indicator.add(meridian_indicator181.getTree());

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

                    pushFollow(FOLLOW_named_time_in_time2210);
                    named_time182=named_time();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, named_time182.getTree());

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

        DateParser.int_00_to_23_optional_prefix_return int_00_to_23_optional_prefix183 = null;


        RewriteRuleSubtreeStream stream_int_00_to_23_optional_prefix=new RewriteRuleSubtreeStream(adaptor,"rule int_00_to_23_optional_prefix");
        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:257:3: ( int_00_to_23_optional_prefix -> ^( HOURS_OF_DAY int_00_to_23_optional_prefix ) )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:257:5: int_00_to_23_optional_prefix
            {
            pushFollow(FOLLOW_int_00_to_23_optional_prefix_in_hours2225);
            int_00_to_23_optional_prefix183=int_00_to_23_optional_prefix();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_int_00_to_23_optional_prefix.add(int_00_to_23_optional_prefix183.getTree());


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

        DateParser.int_00_to_59_mandatory_prefix_return int_00_to_59_mandatory_prefix184 = null;


        RewriteRuleSubtreeStream stream_int_00_to_59_mandatory_prefix=new RewriteRuleSubtreeStream(adaptor,"rule int_00_to_59_mandatory_prefix");
        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:262:3: ( int_00_to_59_mandatory_prefix -> ^( MINUTES_OF_HOUR int_00_to_59_mandatory_prefix ) )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:262:5: int_00_to_59_mandatory_prefix
            {
            pushFollow(FOLLOW_int_00_to_59_mandatory_prefix_in_minutes2249);
            int_00_to_59_mandatory_prefix184=int_00_to_59_mandatory_prefix();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_int_00_to_59_mandatory_prefix.add(int_00_to_59_mandatory_prefix184.getTree());


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

        Token AM185=null;
        Token PM186=null;

        Object AM185_tree=null;
        Object PM186_tree=null;
        RewriteRuleTokenStream stream_PM=new RewriteRuleTokenStream(adaptor,"token PM");
        RewriteRuleTokenStream stream_AM=new RewriteRuleTokenStream(adaptor,"token AM");

        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:268:3: ( AM -> AM_PM[\"am\"] | PM -> AM_PM[\"pm\"] )
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==AM) ) {
                alt55=1;
            }
            else if ( (LA55_0==PM) ) {
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
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:268:5: AM
                    {
                    AM185=(Token)match(input,AM,FOLLOW_AM_in_meridian_indicator2276); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AM.add(AM185);



                    // AST REWRITE
                    // elements: 
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
                    PM186=(Token)match(input,PM,FOLLOW_PM_in_meridian_indicator2287); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PM.add(PM186);



                    // AST REWRITE
                    // elements: 
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

        Token NOON187=null;
        Token MIDNIGHT188=null;

        Object NOON187_tree=null;
        Object MIDNIGHT188_tree=null;
        RewriteRuleTokenStream stream_NOON=new RewriteRuleTokenStream(adaptor,"token NOON");
        RewriteRuleTokenStream stream_MIDNIGHT=new RewriteRuleTokenStream(adaptor,"token MIDNIGHT");

        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:273:3: ( NOON -> ^( EXPLICIT_TIME ^( HOURS_OF_DAY INT[\"12\"] ) ^( MINUTES_OF_HOUR INT[\"0\"] ) AM_PM[\"pm\"] ) | MIDNIGHT -> ^( EXPLICIT_TIME ^( HOURS_OF_DAY INT[\"12\"] ) ^( MINUTES_OF_HOUR INT[\"0\"] ) AM_PM[\"am\"] ) )
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==NOON) ) {
                alt56=1;
            }
            else if ( (LA56_0==MIDNIGHT) ) {
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
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:273:5: NOON
                    {
                    NOON187=(Token)match(input,NOON,FOLLOW_NOON_in_named_time2307); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NOON.add(NOON187);



                    // AST REWRITE
                    // elements: 
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
                    MIDNIGHT188=(Token)match(input,MIDNIGHT,FOLLOW_MIDNIGHT_in_named_time2340); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_MIDNIGHT.add(MIDNIGHT188);



                    // AST REWRITE
                    // elements: 
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

        Token INT_0189=null;
        Token INT_00190=null;
        Token INT_1_TO_9191=null;
        Token INT_01_TO_12192=null;
        Token INT_13_TO_23193=null;

        Object INT_0189_tree=null;
        Object INT_00190_tree=null;
        Object INT_1_TO_9191_tree=null;
        Object INT_01_TO_12192_tree=null;
        Object INT_13_TO_23193_tree=null;
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
            int alt57=5;
            switch ( input.LA(1) ) {
            case INT_0:
                {
                alt57=1;
                }
                break;
            case INT_00:
                {
                alt57=2;
                }
                break;
            case INT_1_TO_9:
                {
                alt57=3;
                }
                break;
            case INT_01_TO_12:
                {
                alt57=4;
                }
                break;
            case INT_13_TO_23:
                {
                alt57=5;
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
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:281:6: INT_0
                    {
                    INT_0189=(Token)match(input,INT_0,FOLLOW_INT_0_in_int_00_to_23_optional_prefix2382); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INT_0.add(INT_0189);


                    }
                    break;
                case 2 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:282:5: INT_00
                    {
                    INT_00190=(Token)match(input,INT_00,FOLLOW_INT_00_in_int_00_to_23_optional_prefix2388); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INT_00.add(INT_00190);


                    }
                    break;
                case 3 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:283:5: INT_1_TO_9
                    {
                    INT_1_TO_9191=(Token)match(input,INT_1_TO_9,FOLLOW_INT_1_TO_9_in_int_00_to_23_optional_prefix2394); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INT_1_TO_9.add(INT_1_TO_9191);


                    }
                    break;
                case 4 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:284:5: INT_01_TO_12
                    {
                    INT_01_TO_12192=(Token)match(input,INT_01_TO_12,FOLLOW_INT_01_TO_12_in_int_00_to_23_optional_prefix2400); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INT_01_TO_12.add(INT_01_TO_12192);


                    }
                    break;
                case 5 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:285:5: INT_13_TO_23
                    {
                    INT_13_TO_23193=(Token)match(input,INT_13_TO_23,FOLLOW_INT_13_TO_23_in_int_00_to_23_optional_prefix2406); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INT_13_TO_23.add(INT_13_TO_23193);


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

        Token INT_00194=null;
        Token INT_01_TO_12195=null;
        Token INT_13_TO_23196=null;
        Token INT_24_TO_31197=null;
        Token INT_32_TO_59198=null;

        Object INT_00194_tree=null;
        Object INT_01_TO_12195_tree=null;
        Object INT_13_TO_23196_tree=null;
        Object INT_24_TO_31197_tree=null;
        Object INT_32_TO_59198_tree=null;
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
            int alt58=5;
            switch ( input.LA(1) ) {
            case INT_00:
                {
                alt58=1;
                }
                break;
            case INT_01_TO_12:
                {
                alt58=2;
                }
                break;
            case INT_13_TO_23:
                {
                alt58=3;
                }
                break;
            case INT_24_TO_31:
                {
                alt58=4;
                }
                break;
            case INT_32_TO_59:
                {
                alt58=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;
            }

            switch (alt58) {
                case 1 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:290:6: INT_00
                    {
                    INT_00194=(Token)match(input,INT_00,FOLLOW_INT_00_in_int_00_to_59_mandatory_prefix2428); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INT_00.add(INT_00194);


                    }
                    break;
                case 2 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:291:5: INT_01_TO_12
                    {
                    INT_01_TO_12195=(Token)match(input,INT_01_TO_12,FOLLOW_INT_01_TO_12_in_int_00_to_59_mandatory_prefix2434); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INT_01_TO_12.add(INT_01_TO_12195);


                    }
                    break;
                case 3 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:292:5: INT_13_TO_23
                    {
                    INT_13_TO_23196=(Token)match(input,INT_13_TO_23,FOLLOW_INT_13_TO_23_in_int_00_to_59_mandatory_prefix2440); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INT_13_TO_23.add(INT_13_TO_23196);


                    }
                    break;
                case 4 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:293:5: INT_24_TO_31
                    {
                    INT_24_TO_31197=(Token)match(input,INT_24_TO_31,FOLLOW_INT_24_TO_31_in_int_00_to_59_mandatory_prefix2446); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INT_24_TO_31.add(INT_24_TO_31197);


                    }
                    break;
                case 5 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:294:5: INT_32_TO_59
                    {
                    INT_32_TO_59198=(Token)match(input,INT_32_TO_59,FOLLOW_INT_32_TO_59_in_int_00_to_59_mandatory_prefix2452); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INT_32_TO_59.add(INT_32_TO_59198);


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

        Token INT_60_TO_99200=null;
        DateParser.int_00_to_59_mandatory_prefix_return int_00_to_59_mandatory_prefix199 = null;


        Object INT_60_TO_99200_tree=null;
        RewriteRuleTokenStream stream_INT_60_TO_99=new RewriteRuleTokenStream(adaptor,"token INT_60_TO_99");

        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:299:3: ( int_00_to_59_mandatory_prefix | INT_60_TO_99 -> INT[$INT_60_TO_99.text] )
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==INT_00||(LA59_0>=INT_01_TO_12 && LA59_0<=INT_32_TO_59)) ) {
                alt59=1;
            }
            else if ( (LA59_0==INT_60_TO_99) ) {
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
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:299:5: int_00_to_59_mandatory_prefix
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_int_00_to_59_mandatory_prefix_in_int_00_to_99_mandatory_prefix2474);
                    int_00_to_59_mandatory_prefix199=int_00_to_59_mandatory_prefix();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, int_00_to_59_mandatory_prefix199.getTree());

                    }
                    break;
                case 2 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:300:5: INT_60_TO_99
                    {
                    INT_60_TO_99200=(Token)match(input,INT_60_TO_99,FOLLOW_INT_60_TO_99_in_int_00_to_99_mandatory_prefix2480); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INT_60_TO_99.add(INT_60_TO_99200);



                    // AST REWRITE
                    // elements: 
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
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, (INT_60_TO_99200!=null?INT_60_TO_99200.getText():null)));

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

        Token INT_1_TO_9201=null;
        Token INT_01_TO_12202=null;

        Object INT_1_TO_9201_tree=null;
        Object INT_01_TO_12202_tree=null;
        RewriteRuleTokenStream stream_INT_1_TO_9=new RewriteRuleTokenStream(adaptor,"token INT_1_TO_9");
        RewriteRuleTokenStream stream_INT_01_TO_12=new RewriteRuleTokenStream(adaptor,"token INT_01_TO_12");

        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:305:3: ( ( INT_1_TO_9 | INT_01_TO_12 ) -> INT[$int_01_to_12_optional_prefix.text] )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:305:5: ( INT_1_TO_9 | INT_01_TO_12 )
            {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:305:5: ( INT_1_TO_9 | INT_01_TO_12 )
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==INT_1_TO_9) ) {
                alt60=1;
            }
            else if ( (LA60_0==INT_01_TO_12) ) {
                alt60=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;
            }
            switch (alt60) {
                case 1 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:305:6: INT_1_TO_9
                    {
                    INT_1_TO_9201=(Token)match(input,INT_1_TO_9,FOLLOW_INT_1_TO_9_in_int_01_to_12_optional_prefix2502); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INT_1_TO_9.add(INT_1_TO_9201);


                    }
                    break;
                case 2 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:306:5: INT_01_TO_12
                    {
                    INT_01_TO_12202=(Token)match(input,INT_01_TO_12,FOLLOW_INT_01_TO_12_in_int_01_to_12_optional_prefix2508); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INT_01_TO_12.add(INT_01_TO_12202);


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

        Token INT_1_TO_9203=null;
        Token INT_01_TO_12204=null;
        Token INT_13_TO_23205=null;
        Token INT_24_TO_31206=null;

        Object INT_1_TO_9203_tree=null;
        Object INT_01_TO_12204_tree=null;
        Object INT_13_TO_23205_tree=null;
        Object INT_24_TO_31206_tree=null;
        RewriteRuleTokenStream stream_INT_24_TO_31=new RewriteRuleTokenStream(adaptor,"token INT_24_TO_31");
        RewriteRuleTokenStream stream_INT_13_TO_23=new RewriteRuleTokenStream(adaptor,"token INT_13_TO_23");
        RewriteRuleTokenStream stream_INT_1_TO_9=new RewriteRuleTokenStream(adaptor,"token INT_1_TO_9");
        RewriteRuleTokenStream stream_INT_01_TO_12=new RewriteRuleTokenStream(adaptor,"token INT_01_TO_12");

        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:311:3: ( ( INT_1_TO_9 | INT_01_TO_12 | INT_13_TO_23 | INT_24_TO_31 ) -> INT[$int_01_to_31_optional_prefix.text] )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:311:5: ( INT_1_TO_9 | INT_01_TO_12 | INT_13_TO_23 | INT_24_TO_31 )
            {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:311:5: ( INT_1_TO_9 | INT_01_TO_12 | INT_13_TO_23 | INT_24_TO_31 )
            int alt61=4;
            switch ( input.LA(1) ) {
            case INT_1_TO_9:
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
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;
            }

            switch (alt61) {
                case 1 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:311:6: INT_1_TO_9
                    {
                    INT_1_TO_9203=(Token)match(input,INT_1_TO_9,FOLLOW_INT_1_TO_9_in_int_01_to_31_optional_prefix2531); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INT_1_TO_9.add(INT_1_TO_9203);


                    }
                    break;
                case 2 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:312:5: INT_01_TO_12
                    {
                    INT_01_TO_12204=(Token)match(input,INT_01_TO_12,FOLLOW_INT_01_TO_12_in_int_01_to_31_optional_prefix2537); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INT_01_TO_12.add(INT_01_TO_12204);


                    }
                    break;
                case 3 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:313:5: INT_13_TO_23
                    {
                    INT_13_TO_23205=(Token)match(input,INT_13_TO_23,FOLLOW_INT_13_TO_23_in_int_01_to_31_optional_prefix2543); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INT_13_TO_23.add(INT_13_TO_23205);


                    }
                    break;
                case 4 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:314:5: INT_24_TO_31
                    {
                    INT_24_TO_31206=(Token)match(input,INT_24_TO_31,FOLLOW_INT_24_TO_31_in_int_01_to_31_optional_prefix2549); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INT_24_TO_31.add(INT_24_TO_31206);


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

        DateParser.int_00_to_99_mandatory_prefix_return int_00_to_99_mandatory_prefix207 = null;

        DateParser.int_00_to_99_mandatory_prefix_return int_00_to_99_mandatory_prefix208 = null;


        RewriteRuleSubtreeStream stream_int_00_to_99_mandatory_prefix=new RewriteRuleSubtreeStream(adaptor,"rule int_00_to_99_mandatory_prefix");
        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:319:3: ( int_00_to_99_mandatory_prefix int_00_to_99_mandatory_prefix -> INT[$int_four_digits.text] )
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:319:5: int_00_to_99_mandatory_prefix int_00_to_99_mandatory_prefix
            {
            pushFollow(FOLLOW_int_00_to_99_mandatory_prefix_in_int_four_digits2571);
            int_00_to_99_mandatory_prefix207=int_00_to_99_mandatory_prefix();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_int_00_to_99_mandatory_prefix.add(int_00_to_99_mandatory_prefix207.getTree());
            pushFollow(FOLLOW_int_00_to_99_mandatory_prefix_in_int_four_digits2573);
            int_00_to_99_mandatory_prefix208=int_00_to_99_mandatory_prefix();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_int_00_to_99_mandatory_prefix.add(int_00_to_99_mandatory_prefix208.getTree());


            // AST REWRITE
            // elements: 
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

        DateParser.int_01_to_31_optional_prefix_return int_01_to_31_optional_prefix209 = null;

        DateParser.spelled_one_to_thirty_one_return spelled_one_to_thirty_one210 = null;



        try {
            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:326:3: ( int_01_to_31_optional_prefix | spelled_one_to_thirty_one )
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( ((LA62_0>=INT_1_TO_9 && LA62_0<=INT_24_TO_31)) ) {
                alt62=1;
            }
            else if ( ((LA62_0>=ONE && LA62_0<=THIRTY)) ) {
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
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:326:5: int_01_to_31_optional_prefix
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_int_01_to_31_optional_prefix_in_spelled_or_int_01_to_31_optional_prefix2601);
                    int_01_to_31_optional_prefix209=int_01_to_31_optional_prefix();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, int_01_to_31_optional_prefix209.getTree());

                    }
                    break;
                case 2 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:327:5: spelled_one_to_thirty_one
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_spelled_one_to_thirty_one_in_spelled_or_int_01_to_31_optional_prefix2607);
                    spelled_one_to_thirty_one210=spelled_one_to_thirty_one();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, spelled_one_to_thirty_one210.getTree());

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

        Token ONE211=null;
        Token TWO212=null;
        Token THREE213=null;
        Token FOUR214=null;
        Token FIVE215=null;
        Token SIX216=null;
        Token SEVEN217=null;
        Token EIGHT218=null;
        Token NINE219=null;
        Token TEN220=null;
        Token ELEVEN221=null;
        Token TWELVE222=null;
        Token THIRTEEN223=null;
        Token FOURTEEN224=null;
        Token FIFTEEN225=null;
        Token SIXTEEN226=null;
        Token SEVENTEEN227=null;
        Token EIGHTEEN228=null;
        Token NINETEEN229=null;
        Token TWENTY230=null;
        Token TWENTY231=null;
        Token DASH232=null;
        Token WHITE_SPACE233=null;
        Token ONE234=null;
        Token TWENTY235=null;
        Token DASH236=null;
        Token WHITE_SPACE237=null;
        Token TWO238=null;
        Token TWENTY239=null;
        Token DASH240=null;
        Token WHITE_SPACE241=null;
        Token THREE242=null;
        Token TWENTY243=null;
        Token DASH244=null;
        Token WHITE_SPACE245=null;
        Token FOUR246=null;
        Token TWENTY247=null;
        Token DASH248=null;
        Token WHITE_SPACE249=null;
        Token FIVE250=null;
        Token TWENTY251=null;
        Token DASH252=null;
        Token WHITE_SPACE253=null;
        Token SIX254=null;
        Token TWENTY255=null;
        Token DASH256=null;
        Token WHITE_SPACE257=null;
        Token SEVEN258=null;
        Token TWENTY259=null;
        Token DASH260=null;
        Token WHITE_SPACE261=null;
        Token EIGHT262=null;
        Token TWENTY263=null;
        Token DASH264=null;
        Token WHITE_SPACE265=null;
        Token NINE266=null;
        Token THIRTY267=null;
        Token THIRTY268=null;
        Token DASH269=null;
        Token WHITE_SPACE270=null;
        Token ONE271=null;

        Object ONE211_tree=null;
        Object TWO212_tree=null;
        Object THREE213_tree=null;
        Object FOUR214_tree=null;
        Object FIVE215_tree=null;
        Object SIX216_tree=null;
        Object SEVEN217_tree=null;
        Object EIGHT218_tree=null;
        Object NINE219_tree=null;
        Object TEN220_tree=null;
        Object ELEVEN221_tree=null;
        Object TWELVE222_tree=null;
        Object THIRTEEN223_tree=null;
        Object FOURTEEN224_tree=null;
        Object FIFTEEN225_tree=null;
        Object SIXTEEN226_tree=null;
        Object SEVENTEEN227_tree=null;
        Object EIGHTEEN228_tree=null;
        Object NINETEEN229_tree=null;
        Object TWENTY230_tree=null;
        Object TWENTY231_tree=null;
        Object DASH232_tree=null;
        Object WHITE_SPACE233_tree=null;
        Object ONE234_tree=null;
        Object TWENTY235_tree=null;
        Object DASH236_tree=null;
        Object WHITE_SPACE237_tree=null;
        Object TWO238_tree=null;
        Object TWENTY239_tree=null;
        Object DASH240_tree=null;
        Object WHITE_SPACE241_tree=null;
        Object THREE242_tree=null;
        Object TWENTY243_tree=null;
        Object DASH244_tree=null;
        Object WHITE_SPACE245_tree=null;
        Object FOUR246_tree=null;
        Object TWENTY247_tree=null;
        Object DASH248_tree=null;
        Object WHITE_SPACE249_tree=null;
        Object FIVE250_tree=null;
        Object TWENTY251_tree=null;
        Object DASH252_tree=null;
        Object WHITE_SPACE253_tree=null;
        Object SIX254_tree=null;
        Object TWENTY255_tree=null;
        Object DASH256_tree=null;
        Object WHITE_SPACE257_tree=null;
        Object SEVEN258_tree=null;
        Object TWENTY259_tree=null;
        Object DASH260_tree=null;
        Object WHITE_SPACE261_tree=null;
        Object EIGHT262_tree=null;
        Object TWENTY263_tree=null;
        Object DASH264_tree=null;
        Object WHITE_SPACE265_tree=null;
        Object NINE266_tree=null;
        Object THIRTY267_tree=null;
        Object THIRTY268_tree=null;
        Object DASH269_tree=null;
        Object WHITE_SPACE270_tree=null;
        Object ONE271_tree=null;
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
            int alt73=31;
            alt73 = dfa73.predict(input);
            switch (alt73) {
                case 1 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:332:5: ONE
                    {
                    ONE211=(Token)match(input,ONE,FOLLOW_ONE_in_spelled_one_to_thirty_one2623); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ONE.add(ONE211);



                    // AST REWRITE
                    // elements: 
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
                    TWO212=(Token)match(input,TWO,FOLLOW_TWO_in_spelled_one_to_thirty_one2641); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWO.add(TWO212);



                    // AST REWRITE
                    // elements: 
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
                    THREE213=(Token)match(input,THREE,FOLLOW_THREE_in_spelled_one_to_thirty_one2659); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THREE.add(THREE213);



                    // AST REWRITE
                    // elements: 
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
                    FOUR214=(Token)match(input,FOUR,FOLLOW_FOUR_in_spelled_one_to_thirty_one2675); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FOUR.add(FOUR214);



                    // AST REWRITE
                    // elements: 
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
                    FIVE215=(Token)match(input,FIVE,FOLLOW_FIVE_in_spelled_one_to_thirty_one2692); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FIVE.add(FIVE215);



                    // AST REWRITE
                    // elements: 
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
                    SIX216=(Token)match(input,SIX,FOLLOW_SIX_in_spelled_one_to_thirty_one2709); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SIX.add(SIX216);



                    // AST REWRITE
                    // elements: 
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
                    SEVEN217=(Token)match(input,SEVEN,FOLLOW_SEVEN_in_spelled_one_to_thirty_one2727); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEVEN.add(SEVEN217);



                    // AST REWRITE
                    // elements: 
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
                    EIGHT218=(Token)match(input,EIGHT,FOLLOW_EIGHT_in_spelled_one_to_thirty_one2743); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EIGHT.add(EIGHT218);



                    // AST REWRITE
                    // elements: 
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
                    NINE219=(Token)match(input,NINE,FOLLOW_NINE_in_spelled_one_to_thirty_one2759); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NINE.add(NINE219);



                    // AST REWRITE
                    // elements: 
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
                    TEN220=(Token)match(input,TEN,FOLLOW_TEN_in_spelled_one_to_thirty_one2776); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TEN.add(TEN220);



                    // AST REWRITE
                    // elements: 
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
                    ELEVEN221=(Token)match(input,ELEVEN,FOLLOW_ELEVEN_in_spelled_one_to_thirty_one2794); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ELEVEN.add(ELEVEN221);



                    // AST REWRITE
                    // elements: 
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
                    TWELVE222=(Token)match(input,TWELVE,FOLLOW_TWELVE_in_spelled_one_to_thirty_one2809); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWELVE.add(TWELVE222);



                    // AST REWRITE
                    // elements: 
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
                    THIRTEEN223=(Token)match(input,THIRTEEN,FOLLOW_THIRTEEN_in_spelled_one_to_thirty_one2824); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THIRTEEN.add(THIRTEEN223);



                    // AST REWRITE
                    // elements: 
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
                    FOURTEEN224=(Token)match(input,FOURTEEN,FOLLOW_FOURTEEN_in_spelled_one_to_thirty_one2837); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FOURTEEN.add(FOURTEEN224);



                    // AST REWRITE
                    // elements: 
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
                    FIFTEEN225=(Token)match(input,FIFTEEN,FOLLOW_FIFTEEN_in_spelled_one_to_thirty_one2850); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FIFTEEN.add(FIFTEEN225);



                    // AST REWRITE
                    // elements: 
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
                    SIXTEEN226=(Token)match(input,SIXTEEN,FOLLOW_SIXTEEN_in_spelled_one_to_thirty_one2864); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SIXTEEN.add(SIXTEEN226);



                    // AST REWRITE
                    // elements: 
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
                    SEVENTEEN227=(Token)match(input,SEVENTEEN,FOLLOW_SEVENTEEN_in_spelled_one_to_thirty_one2878); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEVENTEEN.add(SEVENTEEN227);



                    // AST REWRITE
                    // elements: 
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
                    EIGHTEEN228=(Token)match(input,EIGHTEEN,FOLLOW_EIGHTEEN_in_spelled_one_to_thirty_one2890); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EIGHTEEN.add(EIGHTEEN228);



                    // AST REWRITE
                    // elements: 
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
                    NINETEEN229=(Token)match(input,NINETEEN,FOLLOW_NINETEEN_in_spelled_one_to_thirty_one2903); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NINETEEN.add(NINETEEN229);



                    // AST REWRITE
                    // elements: 
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
                    TWENTY230=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_one_to_thirty_one2916); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY230);



                    // AST REWRITE
                    // elements: 
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
                    TWENTY231=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_one_to_thirty_one2931); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY231);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:352:12: ( DASH | WHITE_SPACE )?
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
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:352:13: DASH
                            {
                            DASH232=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_one_to_thirty_one2934); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_DASH.add(DASH232);


                            }
                            break;
                        case 2 :
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:352:20: WHITE_SPACE
                            {
                            WHITE_SPACE233=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_spelled_one_to_thirty_one2938); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE233);


                            }
                            break;

                    }

                    ONE234=(Token)match(input,ONE,FOLLOW_ONE_in_spelled_one_to_thirty_one2942); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ONE.add(ONE234);



                    // AST REWRITE
                    // elements: 
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
                    TWENTY235=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_one_to_thirty_one2955); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY235);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:353:12: ( DASH | WHITE_SPACE )?
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
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:353:13: DASH
                            {
                            DASH236=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_one_to_thirty_one2958); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_DASH.add(DASH236);


                            }
                            break;
                        case 2 :
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:353:20: WHITE_SPACE
                            {
                            WHITE_SPACE237=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_spelled_one_to_thirty_one2962); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE237);


                            }
                            break;

                    }

                    TWO238=(Token)match(input,TWO,FOLLOW_TWO_in_spelled_one_to_thirty_one2966); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWO.add(TWO238);



                    // AST REWRITE
                    // elements: 
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
                    TWENTY239=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_one_to_thirty_one2979); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY239);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:354:12: ( DASH | WHITE_SPACE )?
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
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:354:13: DASH
                            {
                            DASH240=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_one_to_thirty_one2982); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_DASH.add(DASH240);


                            }
                            break;
                        case 2 :
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:354:20: WHITE_SPACE
                            {
                            WHITE_SPACE241=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_spelled_one_to_thirty_one2986); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE241);


                            }
                            break;

                    }

                    THREE242=(Token)match(input,THREE,FOLLOW_THREE_in_spelled_one_to_thirty_one2990); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THREE.add(THREE242);



                    // AST REWRITE
                    // elements: 
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
                    TWENTY243=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_one_to_thirty_one3001); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY243);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:355:12: ( DASH | WHITE_SPACE )?
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
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:355:13: DASH
                            {
                            DASH244=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_one_to_thirty_one3004); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_DASH.add(DASH244);


                            }
                            break;
                        case 2 :
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:355:20: WHITE_SPACE
                            {
                            WHITE_SPACE245=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_spelled_one_to_thirty_one3008); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE245);


                            }
                            break;

                    }

                    FOUR246=(Token)match(input,FOUR,FOLLOW_FOUR_in_spelled_one_to_thirty_one3012); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FOUR.add(FOUR246);



                    // AST REWRITE
                    // elements: 
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
                    TWENTY247=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_one_to_thirty_one3024); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY247);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:356:12: ( DASH | WHITE_SPACE )?
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
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:356:13: DASH
                            {
                            DASH248=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_one_to_thirty_one3027); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_DASH.add(DASH248);


                            }
                            break;
                        case 2 :
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:356:20: WHITE_SPACE
                            {
                            WHITE_SPACE249=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_spelled_one_to_thirty_one3031); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE249);


                            }
                            break;

                    }

                    FIVE250=(Token)match(input,FIVE,FOLLOW_FIVE_in_spelled_one_to_thirty_one3035); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FIVE.add(FIVE250);



                    // AST REWRITE
                    // elements: 
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
                    TWENTY251=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_one_to_thirty_one3047); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY251);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:357:12: ( DASH | WHITE_SPACE )?
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
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:357:13: DASH
                            {
                            DASH252=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_one_to_thirty_one3050); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_DASH.add(DASH252);


                            }
                            break;
                        case 2 :
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:357:20: WHITE_SPACE
                            {
                            WHITE_SPACE253=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_spelled_one_to_thirty_one3054); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE253);


                            }
                            break;

                    }

                    SIX254=(Token)match(input,SIX,FOLLOW_SIX_in_spelled_one_to_thirty_one3058); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SIX.add(SIX254);



                    // AST REWRITE
                    // elements: 
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
                    TWENTY255=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_one_to_thirty_one3071); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY255);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:358:12: ( DASH | WHITE_SPACE )?
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
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:358:13: DASH
                            {
                            DASH256=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_one_to_thirty_one3074); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_DASH.add(DASH256);


                            }
                            break;
                        case 2 :
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:358:20: WHITE_SPACE
                            {
                            WHITE_SPACE257=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_spelled_one_to_thirty_one3078); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE257);


                            }
                            break;

                    }

                    SEVEN258=(Token)match(input,SEVEN,FOLLOW_SEVEN_in_spelled_one_to_thirty_one3082); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEVEN.add(SEVEN258);



                    // AST REWRITE
                    // elements: 
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
                    TWENTY259=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_one_to_thirty_one3093); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY259);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:359:12: ( DASH | WHITE_SPACE )?
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
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:359:13: DASH
                            {
                            DASH260=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_one_to_thirty_one3096); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_DASH.add(DASH260);


                            }
                            break;
                        case 2 :
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:359:20: WHITE_SPACE
                            {
                            WHITE_SPACE261=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_spelled_one_to_thirty_one3100); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE261);


                            }
                            break;

                    }

                    EIGHT262=(Token)match(input,EIGHT,FOLLOW_EIGHT_in_spelled_one_to_thirty_one3104); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EIGHT.add(EIGHT262);



                    // AST REWRITE
                    // elements: 
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
                    TWENTY263=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_one_to_thirty_one3115); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY263);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:360:12: ( DASH | WHITE_SPACE )?
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
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:360:13: DASH
                            {
                            DASH264=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_one_to_thirty_one3118); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_DASH.add(DASH264);


                            }
                            break;
                        case 2 :
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:360:20: WHITE_SPACE
                            {
                            WHITE_SPACE265=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_spelled_one_to_thirty_one3122); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE265);


                            }
                            break;

                    }

                    NINE266=(Token)match(input,NINE,FOLLOW_NINE_in_spelled_one_to_thirty_one3126); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NINE.add(NINE266);



                    // AST REWRITE
                    // elements: 
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
                    THIRTY267=(Token)match(input,THIRTY,FOLLOW_THIRTY_in_spelled_one_to_thirty_one3138); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THIRTY.add(THIRTY267);



                    // AST REWRITE
                    // elements: 
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
                    THIRTY268=(Token)match(input,THIRTY,FOLLOW_THIRTY_in_spelled_one_to_thirty_one3177); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THIRTY.add(THIRTY268);

                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:362:12: ( DASH | WHITE_SPACE )?
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
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:362:13: DASH
                            {
                            DASH269=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_one_to_thirty_one3180); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_DASH.add(DASH269);


                            }
                            break;
                        case 2 :
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:362:20: WHITE_SPACE
                            {
                            WHITE_SPACE270=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_spelled_one_to_thirty_one3184); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE270);


                            }
                            break;

                    }

                    ONE271=(Token)match(input,ONE,FOLLOW_ONE_in_spelled_one_to_thirty_one3188); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ONE.add(ONE271);



                    // AST REWRITE
                    // elements: 
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

        Token FIRST272=null;
        Token SECOND273=null;
        Token THIRD274=null;
        Token FOURTH275=null;
        Token FIFTH276=null;
        Token SIXTH277=null;
        Token SEVENTH278=null;
        Token EIGHTH279=null;
        Token NINTH280=null;
        Token TENTH281=null;
        Token ELEVENTH282=null;
        Token TWELFTH283=null;
        Token THIRTEENTH284=null;
        Token FOURTEENTH285=null;
        Token FIFTEENTH286=null;
        Token SIXTEENTH287=null;
        Token SEVENTEENTH288=null;
        Token EIGHTEENTH289=null;
        Token NINETEENTH290=null;
        Token TWENTIETH291=null;
        Token TWENTY_FIRST292=null;
        Token TWENTY293=null;
        Token DASH294=null;
        Token WHITE_SPACE295=null;
        Token FIRST296=null;
        Token TWENTY_SECOND297=null;
        Token TWENTY298=null;
        Token DASH299=null;
        Token WHITE_SPACE300=null;
        Token SECOND301=null;
        Token TWENTY_THIRD302=null;
        Token TWENTY303=null;
        Token DASH304=null;
        Token WHITE_SPACE305=null;
        Token THIRD306=null;
        Token TWENTY_FOURTH307=null;
        Token TWENTY308=null;
        Token DASH309=null;
        Token WHITE_SPACE310=null;
        Token FOURTH311=null;
        Token TWENTY_FIFTH312=null;
        Token TWENTY313=null;
        Token DASH314=null;
        Token WHITE_SPACE315=null;
        Token FIFTH316=null;
        Token TWENTY_SIXTH317=null;
        Token TWENTY318=null;
        Token DASH319=null;
        Token WHITE_SPACE320=null;
        Token SIXTH321=null;
        Token TWENTY_SEVENTH322=null;
        Token TWENTY323=null;
        Token DASH324=null;
        Token WHITE_SPACE325=null;
        Token SEVENTH326=null;
        Token TWENTY_EIGHTH327=null;
        Token TWENTY328=null;
        Token DASH329=null;
        Token WHITE_SPACE330=null;
        Token EIGHTH331=null;
        Token TWENTY_NINTH332=null;
        Token TWENTY333=null;
        Token DASH334=null;
        Token WHITE_SPACE335=null;
        Token NINTH336=null;
        Token THIRTIETH337=null;
        Token THIRTY_FIRST338=null;
        Token THIRTY339=null;
        Token DASH340=null;
        Token WHITE_SPACE341=null;
        Token FIRST342=null;

        Object FIRST272_tree=null;
        Object SECOND273_tree=null;
        Object THIRD274_tree=null;
        Object FOURTH275_tree=null;
        Object FIFTH276_tree=null;
        Object SIXTH277_tree=null;
        Object SEVENTH278_tree=null;
        Object EIGHTH279_tree=null;
        Object NINTH280_tree=null;
        Object TENTH281_tree=null;
        Object ELEVENTH282_tree=null;
        Object TWELFTH283_tree=null;
        Object THIRTEENTH284_tree=null;
        Object FOURTEENTH285_tree=null;
        Object FIFTEENTH286_tree=null;
        Object SIXTEENTH287_tree=null;
        Object SEVENTEENTH288_tree=null;
        Object EIGHTEENTH289_tree=null;
        Object NINETEENTH290_tree=null;
        Object TWENTIETH291_tree=null;
        Object TWENTY_FIRST292_tree=null;
        Object TWENTY293_tree=null;
        Object DASH294_tree=null;
        Object WHITE_SPACE295_tree=null;
        Object FIRST296_tree=null;
        Object TWENTY_SECOND297_tree=null;
        Object TWENTY298_tree=null;
        Object DASH299_tree=null;
        Object WHITE_SPACE300_tree=null;
        Object SECOND301_tree=null;
        Object TWENTY_THIRD302_tree=null;
        Object TWENTY303_tree=null;
        Object DASH304_tree=null;
        Object WHITE_SPACE305_tree=null;
        Object THIRD306_tree=null;
        Object TWENTY_FOURTH307_tree=null;
        Object TWENTY308_tree=null;
        Object DASH309_tree=null;
        Object WHITE_SPACE310_tree=null;
        Object FOURTH311_tree=null;
        Object TWENTY_FIFTH312_tree=null;
        Object TWENTY313_tree=null;
        Object DASH314_tree=null;
        Object WHITE_SPACE315_tree=null;
        Object FIFTH316_tree=null;
        Object TWENTY_SIXTH317_tree=null;
        Object TWENTY318_tree=null;
        Object DASH319_tree=null;
        Object WHITE_SPACE320_tree=null;
        Object SIXTH321_tree=null;
        Object TWENTY_SEVENTH322_tree=null;
        Object TWENTY323_tree=null;
        Object DASH324_tree=null;
        Object WHITE_SPACE325_tree=null;
        Object SEVENTH326_tree=null;
        Object TWENTY_EIGHTH327_tree=null;
        Object TWENTY328_tree=null;
        Object DASH329_tree=null;
        Object WHITE_SPACE330_tree=null;
        Object EIGHTH331_tree=null;
        Object TWENTY_NINTH332_tree=null;
        Object TWENTY333_tree=null;
        Object DASH334_tree=null;
        Object WHITE_SPACE335_tree=null;
        Object NINTH336_tree=null;
        Object THIRTIETH337_tree=null;
        Object THIRTY_FIRST338_tree=null;
        Object THIRTY339_tree=null;
        Object DASH340_tree=null;
        Object WHITE_SPACE341_tree=null;
        Object FIRST342_tree=null;
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
            int alt94=31;
            alt94 = dfa94.predict(input);
            switch (alt94) {
                case 1 :
                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:367:5: FIRST
                    {
                    FIRST272=(Token)match(input,FIRST,FOLLOW_FIRST_in_spelled_first_to_thirty_first3211); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FIRST.add(FIRST272);



                    // AST REWRITE
                    // elements: 
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
                    SECOND273=(Token)match(input,SECOND,FOLLOW_SECOND_in_spelled_first_to_thirty_first3228); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SECOND.add(SECOND273);



                    // AST REWRITE
                    // elements: 
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
                    THIRD274=(Token)match(input,THIRD,FOLLOW_THIRD_in_spelled_first_to_thirty_first3244); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THIRD.add(THIRD274);



                    // AST REWRITE
                    // elements: 
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
                    FOURTH275=(Token)match(input,FOURTH,FOLLOW_FOURTH_in_spelled_first_to_thirty_first3261); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FOURTH.add(FOURTH275);



                    // AST REWRITE
                    // elements: 
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
                    FIFTH276=(Token)match(input,FIFTH,FOLLOW_FIFTH_in_spelled_first_to_thirty_first3277); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FIFTH.add(FIFTH276);



                    // AST REWRITE
                    // elements: 
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
                    SIXTH277=(Token)match(input,SIXTH,FOLLOW_SIXTH_in_spelled_first_to_thirty_first3294); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SIXTH.add(SIXTH277);



                    // AST REWRITE
                    // elements: 
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
                    SEVENTH278=(Token)match(input,SEVENTH,FOLLOW_SEVENTH_in_spelled_first_to_thirty_first3311); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEVENTH.add(SEVENTH278);



                    // AST REWRITE
                    // elements: 
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
                    EIGHTH279=(Token)match(input,EIGHTH,FOLLOW_EIGHTH_in_spelled_first_to_thirty_first3326); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EIGHTH.add(EIGHTH279);



                    // AST REWRITE
                    // elements: 
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
                    NINTH280=(Token)match(input,NINTH,FOLLOW_NINTH_in_spelled_first_to_thirty_first3342); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NINTH.add(NINTH280);



                    // AST REWRITE
                    // elements: 
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
                    TENTH281=(Token)match(input,TENTH,FOLLOW_TENTH_in_spelled_first_to_thirty_first3359); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TENTH.add(TENTH281);



                    // AST REWRITE
                    // elements: 
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
                    ELEVENTH282=(Token)match(input,ELEVENTH,FOLLOW_ELEVENTH_in_spelled_first_to_thirty_first3376); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ELEVENTH.add(ELEVENTH282);



                    // AST REWRITE
                    // elements: 
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
                    TWELFTH283=(Token)match(input,TWELFTH,FOLLOW_TWELFTH_in_spelled_first_to_thirty_first3390); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWELFTH.add(TWELFTH283);



                    // AST REWRITE
                    // elements: 
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
                    THIRTEENTH284=(Token)match(input,THIRTEENTH,FOLLOW_THIRTEENTH_in_spelled_first_to_thirty_first3405); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THIRTEENTH.add(THIRTEENTH284);



                    // AST REWRITE
                    // elements: 
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
                    FOURTEENTH285=(Token)match(input,FOURTEENTH,FOLLOW_FOURTEENTH_in_spelled_first_to_thirty_first3417); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FOURTEENTH.add(FOURTEENTH285);



                    // AST REWRITE
                    // elements: 
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
                    FIFTEENTH286=(Token)match(input,FIFTEENTH,FOLLOW_FIFTEENTH_in_spelled_first_to_thirty_first3429); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FIFTEENTH.add(FIFTEENTH286);



                    // AST REWRITE
                    // elements: 
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
                    SIXTEENTH287=(Token)match(input,SIXTEENTH,FOLLOW_SIXTEENTH_in_spelled_first_to_thirty_first3442); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SIXTEENTH.add(SIXTEENTH287);



                    // AST REWRITE
                    // elements: 
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
                    SEVENTEENTH288=(Token)match(input,SEVENTEENTH,FOLLOW_SEVENTEENTH_in_spelled_first_to_thirty_first3455); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEVENTEENTH.add(SEVENTEENTH288);



                    // AST REWRITE
                    // elements: 
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
                    EIGHTEENTH289=(Token)match(input,EIGHTEENTH,FOLLOW_EIGHTEENTH_in_spelled_first_to_thirty_first3466); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EIGHTEENTH.add(EIGHTEENTH289);



                    // AST REWRITE
                    // elements: 
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
                    NINETEENTH290=(Token)match(input,NINETEENTH,FOLLOW_NINETEENTH_in_spelled_first_to_thirty_first3478); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NINETEENTH.add(NINETEENTH290);



                    // AST REWRITE
                    // elements: 
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
                    TWENTIETH291=(Token)match(input,TWENTIETH,FOLLOW_TWENTIETH_in_spelled_first_to_thirty_first3490); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWENTIETH.add(TWENTIETH291);



                    // AST REWRITE
                    // elements: 
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
                    int alt75=2;
                    int LA75_0 = input.LA(1);

                    if ( (LA75_0==TWENTY_FIRST) ) {
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
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:387:6: TWENTY_FIRST
                            {
                            TWENTY_FIRST292=(Token)match(input,TWENTY_FIRST,FOLLOW_TWENTY_FIRST_in_spelled_first_to_thirty_first3504); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY_FIRST.add(TWENTY_FIRST292);


                            }
                            break;
                        case 2 :
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:387:23: ( TWENTY ( DASH | WHITE_SPACE )? FIRST )
                            {
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:387:23: ( TWENTY ( DASH | WHITE_SPACE )? FIRST )
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:387:24: TWENTY ( DASH | WHITE_SPACE )? FIRST
                            {
                            TWENTY293=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_first_to_thirty_first3511); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY293);

                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:387:31: ( DASH | WHITE_SPACE )?
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
                                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:387:32: DASH
                                    {
                                    DASH294=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_first_to_thirty_first3514); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_DASH.add(DASH294);


                                    }
                                    break;
                                case 2 :
                                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:387:39: WHITE_SPACE
                                    {
                                    WHITE_SPACE295=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_spelled_first_to_thirty_first3518); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE295);


                                    }
                                    break;

                            }

                            FIRST296=(Token)match(input,FIRST,FOLLOW_FIRST_in_spelled_first_to_thirty_first3522); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_FIRST.add(FIRST296);


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
                    int alt77=2;
                    int LA77_0 = input.LA(1);

                    if ( (LA77_0==TWENTY_SECOND) ) {
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
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:388:6: TWENTY_SECOND
                            {
                            TWENTY_SECOND297=(Token)match(input,TWENTY_SECOND,FOLLOW_TWENTY_SECOND_in_spelled_first_to_thirty_first3538); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY_SECOND.add(TWENTY_SECOND297);


                            }
                            break;
                        case 2 :
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:388:23: ( TWENTY ( DASH | WHITE_SPACE )? SECOND )
                            {
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:388:23: ( TWENTY ( DASH | WHITE_SPACE )? SECOND )
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:388:24: TWENTY ( DASH | WHITE_SPACE )? SECOND
                            {
                            TWENTY298=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_first_to_thirty_first3544); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY298);

                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:388:31: ( DASH | WHITE_SPACE )?
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
                                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:388:32: DASH
                                    {
                                    DASH299=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_first_to_thirty_first3547); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_DASH.add(DASH299);


                                    }
                                    break;
                                case 2 :
                                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:388:39: WHITE_SPACE
                                    {
                                    WHITE_SPACE300=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_spelled_first_to_thirty_first3551); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE300);


                                    }
                                    break;

                            }

                            SECOND301=(Token)match(input,SECOND,FOLLOW_SECOND_in_spelled_first_to_thirty_first3555); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_SECOND.add(SECOND301);


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
                    int alt79=2;
                    int LA79_0 = input.LA(1);

                    if ( (LA79_0==TWENTY_THIRD) ) {
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
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:389:6: TWENTY_THIRD
                            {
                            TWENTY_THIRD302=(Token)match(input,TWENTY_THIRD,FOLLOW_TWENTY_THIRD_in_spelled_first_to_thirty_first3570); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY_THIRD.add(TWENTY_THIRD302);


                            }
                            break;
                        case 2 :
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:389:23: ( TWENTY ( DASH | WHITE_SPACE )? THIRD )
                            {
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:389:23: ( TWENTY ( DASH | WHITE_SPACE )? THIRD )
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:389:24: TWENTY ( DASH | WHITE_SPACE )? THIRD
                            {
                            TWENTY303=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_first_to_thirty_first3577); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY303);

                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:389:31: ( DASH | WHITE_SPACE )?
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
                                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:389:32: DASH
                                    {
                                    DASH304=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_first_to_thirty_first3580); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_DASH.add(DASH304);


                                    }
                                    break;
                                case 2 :
                                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:389:39: WHITE_SPACE
                                    {
                                    WHITE_SPACE305=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_spelled_first_to_thirty_first3584); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE305);


                                    }
                                    break;

                            }

                            THIRD306=(Token)match(input,THIRD,FOLLOW_THIRD_in_spelled_first_to_thirty_first3588); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_THIRD.add(THIRD306);


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
                    int alt81=2;
                    int LA81_0 = input.LA(1);

                    if ( (LA81_0==TWENTY_FOURTH) ) {
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
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:390:6: TWENTY_FOURTH
                            {
                            TWENTY_FOURTH307=(Token)match(input,TWENTY_FOURTH,FOLLOW_TWENTY_FOURTH_in_spelled_first_to_thirty_first3604); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY_FOURTH.add(TWENTY_FOURTH307);


                            }
                            break;
                        case 2 :
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:390:23: ( TWENTY ( DASH | WHITE_SPACE )? FOURTH )
                            {
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:390:23: ( TWENTY ( DASH | WHITE_SPACE )? FOURTH )
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:390:24: TWENTY ( DASH | WHITE_SPACE )? FOURTH
                            {
                            TWENTY308=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_first_to_thirty_first3610); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY308);

                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:390:31: ( DASH | WHITE_SPACE )?
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
                                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:390:32: DASH
                                    {
                                    DASH309=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_first_to_thirty_first3613); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_DASH.add(DASH309);


                                    }
                                    break;
                                case 2 :
                                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:390:39: WHITE_SPACE
                                    {
                                    WHITE_SPACE310=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_spelled_first_to_thirty_first3617); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE310);


                                    }
                                    break;

                            }

                            FOURTH311=(Token)match(input,FOURTH,FOLLOW_FOURTH_in_spelled_first_to_thirty_first3621); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_FOURTH.add(FOURTH311);


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
                    int alt83=2;
                    int LA83_0 = input.LA(1);

                    if ( (LA83_0==TWENTY_FIFTH) ) {
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
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:391:6: TWENTY_FIFTH
                            {
                            TWENTY_FIFTH312=(Token)match(input,TWENTY_FIFTH,FOLLOW_TWENTY_FIFTH_in_spelled_first_to_thirty_first3636); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY_FIFTH.add(TWENTY_FIFTH312);


                            }
                            break;
                        case 2 :
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:391:23: ( TWENTY ( DASH | WHITE_SPACE )? FIFTH )
                            {
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:391:23: ( TWENTY ( DASH | WHITE_SPACE )? FIFTH )
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:391:24: TWENTY ( DASH | WHITE_SPACE )? FIFTH
                            {
                            TWENTY313=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_first_to_thirty_first3643); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY313);

                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:391:31: ( DASH | WHITE_SPACE )?
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
                                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:391:32: DASH
                                    {
                                    DASH314=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_first_to_thirty_first3646); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_DASH.add(DASH314);


                                    }
                                    break;
                                case 2 :
                                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:391:39: WHITE_SPACE
                                    {
                                    WHITE_SPACE315=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_spelled_first_to_thirty_first3650); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE315);


                                    }
                                    break;

                            }

                            FIFTH316=(Token)match(input,FIFTH,FOLLOW_FIFTH_in_spelled_first_to_thirty_first3654); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_FIFTH.add(FIFTH316);


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
                    int alt85=2;
                    int LA85_0 = input.LA(1);

                    if ( (LA85_0==TWENTY_SIXTH) ) {
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
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:392:6: TWENTY_SIXTH
                            {
                            TWENTY_SIXTH317=(Token)match(input,TWENTY_SIXTH,FOLLOW_TWENTY_SIXTH_in_spelled_first_to_thirty_first3670); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY_SIXTH.add(TWENTY_SIXTH317);


                            }
                            break;
                        case 2 :
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:392:23: ( TWENTY ( DASH | WHITE_SPACE )? SIXTH )
                            {
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:392:23: ( TWENTY ( DASH | WHITE_SPACE )? SIXTH )
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:392:24: TWENTY ( DASH | WHITE_SPACE )? SIXTH
                            {
                            TWENTY318=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_first_to_thirty_first3677); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY318);

                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:392:31: ( DASH | WHITE_SPACE )?
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
                                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:392:32: DASH
                                    {
                                    DASH319=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_first_to_thirty_first3680); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_DASH.add(DASH319);


                                    }
                                    break;
                                case 2 :
                                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:392:39: WHITE_SPACE
                                    {
                                    WHITE_SPACE320=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_spelled_first_to_thirty_first3684); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE320);


                                    }
                                    break;

                            }

                            SIXTH321=(Token)match(input,SIXTH,FOLLOW_SIXTH_in_spelled_first_to_thirty_first3688); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_SIXTH.add(SIXTH321);


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
                    int alt87=2;
                    int LA87_0 = input.LA(1);

                    if ( (LA87_0==TWENTY_SEVENTH) ) {
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
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:393:6: TWENTY_SEVENTH
                            {
                            TWENTY_SEVENTH322=(Token)match(input,TWENTY_SEVENTH,FOLLOW_TWENTY_SEVENTH_in_spelled_first_to_thirty_first3704); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY_SEVENTH.add(TWENTY_SEVENTH322);


                            }
                            break;
                        case 2 :
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:393:23: ( TWENTY ( DASH | WHITE_SPACE )? SEVENTH )
                            {
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:393:23: ( TWENTY ( DASH | WHITE_SPACE )? SEVENTH )
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:393:24: TWENTY ( DASH | WHITE_SPACE )? SEVENTH
                            {
                            TWENTY323=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_first_to_thirty_first3709); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY323);

                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:393:31: ( DASH | WHITE_SPACE )?
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
                                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:393:32: DASH
                                    {
                                    DASH324=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_first_to_thirty_first3712); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_DASH.add(DASH324);


                                    }
                                    break;
                                case 2 :
                                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:393:39: WHITE_SPACE
                                    {
                                    WHITE_SPACE325=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_spelled_first_to_thirty_first3716); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE325);


                                    }
                                    break;

                            }

                            SEVENTH326=(Token)match(input,SEVENTH,FOLLOW_SEVENTH_in_spelled_first_to_thirty_first3720); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_SEVENTH.add(SEVENTH326);


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
                    int alt89=2;
                    int LA89_0 = input.LA(1);

                    if ( (LA89_0==TWENTY_EIGHTH) ) {
                        alt89=1;
                    }
                    else if ( (LA89_0==TWENTY) ) {
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
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:394:6: TWENTY_EIGHTH
                            {
                            TWENTY_EIGHTH327=(Token)match(input,TWENTY_EIGHTH,FOLLOW_TWENTY_EIGHTH_in_spelled_first_to_thirty_first3734); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY_EIGHTH.add(TWENTY_EIGHTH327);


                            }
                            break;
                        case 2 :
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:394:23: ( TWENTY ( DASH | WHITE_SPACE )? EIGHTH )
                            {
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:394:23: ( TWENTY ( DASH | WHITE_SPACE )? EIGHTH )
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:394:24: TWENTY ( DASH | WHITE_SPACE )? EIGHTH
                            {
                            TWENTY328=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_first_to_thirty_first3740); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY328);

                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:394:31: ( DASH | WHITE_SPACE )?
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
                                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:394:32: DASH
                                    {
                                    DASH329=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_first_to_thirty_first3743); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_DASH.add(DASH329);


                                    }
                                    break;
                                case 2 :
                                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:394:39: WHITE_SPACE
                                    {
                                    WHITE_SPACE330=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_spelled_first_to_thirty_first3747); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE330);


                                    }
                                    break;

                            }

                            EIGHTH331=(Token)match(input,EIGHTH,FOLLOW_EIGHTH_in_spelled_first_to_thirty_first3751); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_EIGHTH.add(EIGHTH331);


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
                    int alt91=2;
                    int LA91_0 = input.LA(1);

                    if ( (LA91_0==TWENTY_NINTH) ) {
                        alt91=1;
                    }
                    else if ( (LA91_0==TWENTY) ) {
                        alt91=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 91, 0, input);

                        throw nvae;
                    }
                    switch (alt91) {
                        case 1 :
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:395:6: TWENTY_NINTH
                            {
                            TWENTY_NINTH332=(Token)match(input,TWENTY_NINTH,FOLLOW_TWENTY_NINTH_in_spelled_first_to_thirty_first3766); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY_NINTH.add(TWENTY_NINTH332);


                            }
                            break;
                        case 2 :
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:395:23: ( TWENTY ( DASH | WHITE_SPACE )? NINTH )
                            {
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:395:23: ( TWENTY ( DASH | WHITE_SPACE )? NINTH )
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:395:24: TWENTY ( DASH | WHITE_SPACE )? NINTH
                            {
                            TWENTY333=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_first_to_thirty_first3773); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY333);

                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:395:31: ( DASH | WHITE_SPACE )?
                            int alt90=3;
                            int LA90_0 = input.LA(1);

                            if ( (LA90_0==DASH) ) {
                                alt90=1;
                            }
                            else if ( (LA90_0==WHITE_SPACE) ) {
                                alt90=2;
                            }
                            switch (alt90) {
                                case 1 :
                                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:395:32: DASH
                                    {
                                    DASH334=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_first_to_thirty_first3776); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_DASH.add(DASH334);


                                    }
                                    break;
                                case 2 :
                                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:395:39: WHITE_SPACE
                                    {
                                    WHITE_SPACE335=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_spelled_first_to_thirty_first3780); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE335);


                                    }
                                    break;

                            }

                            NINTH336=(Token)match(input,NINTH,FOLLOW_NINTH_in_spelled_first_to_thirty_first3784); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NINTH.add(NINTH336);


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
                    THIRTIETH337=(Token)match(input,THIRTIETH,FOLLOW_THIRTIETH_in_spelled_first_to_thirty_first3799); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THIRTIETH.add(THIRTIETH337);



                    // AST REWRITE
                    // elements: 
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
                    int alt93=2;
                    int LA93_0 = input.LA(1);

                    if ( (LA93_0==THIRTY_FIRST) ) {
                        alt93=1;
                    }
                    else if ( (LA93_0==THIRTY) ) {
                        alt93=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 93, 0, input);

                        throw nvae;
                    }
                    switch (alt93) {
                        case 1 :
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:397:6: THIRTY_FIRST
                            {
                            THIRTY_FIRST338=(Token)match(input,THIRTY_FIRST,FOLLOW_THIRTY_FIRST_in_spelled_first_to_thirty_first3859); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_THIRTY_FIRST.add(THIRTY_FIRST338);


                            }
                            break;
                        case 2 :
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:397:23: ( THIRTY ( DASH | WHITE_SPACE )? FIRST )
                            {
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:397:23: ( THIRTY ( DASH | WHITE_SPACE )? FIRST )
                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:397:24: THIRTY ( DASH | WHITE_SPACE )? FIRST
                            {
                            THIRTY339=(Token)match(input,THIRTY,FOLLOW_THIRTY_in_spelled_first_to_thirty_first3866); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_THIRTY.add(THIRTY339);

                            // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:397:31: ( DASH | WHITE_SPACE )?
                            int alt92=3;
                            int LA92_0 = input.LA(1);

                            if ( (LA92_0==DASH) ) {
                                alt92=1;
                            }
                            else if ( (LA92_0==WHITE_SPACE) ) {
                                alt92=2;
                            }
                            switch (alt92) {
                                case 1 :
                                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:397:32: DASH
                                    {
                                    DASH340=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_first_to_thirty_first3869); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_DASH.add(DASH340);


                                    }
                                    break;
                                case 2 :
                                    // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:397:39: WHITE_SPACE
                                    {
                                    WHITE_SPACE341=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_spelled_first_to_thirty_first3873); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE341);


                                    }
                                    break;

                            }

                            FIRST342=(Token)match(input,FIRST,FOLLOW_FIRST_in_spelled_first_to_thirty_first3877); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_FIRST.add(FIRST342);


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
        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:44:7: ( date ( date_time_separator time )? )
        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:44:8: date ( date_time_separator time )?
        {
        pushFollow(FOLLOW_date_in_synpred1_Date178);
        date();

        state._fsp--;
        if (state.failed) return ;
        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:44:13: ( date_time_separator time )?
        int alt95=2;
        int LA95_0 = input.LA(1);

        if ( (LA95_0==WHITE_SPACE||LA95_0==COMMA) ) {
            alt95=1;
        }
        switch (alt95) {
            case 1 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:44:14: date_time_separator time
                {
                pushFollow(FOLLOW_date_time_separator_in_synpred1_Date181);
                date_time_separator();

                state._fsp--;
                if (state.failed) return ;
                pushFollow(FOLLOW_time_in_synpred1_Date183);
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
        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:62:5: ( relaxed_date )
        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:62:6: relaxed_date
        {
        pushFollow(FOLLOW_relaxed_date_in_synpred2_Date336);
        relaxed_date();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_Date

    // $ANTLR start synpred3_Date
    public final void synpred3_Date_fragment() throws RecognitionException {   
        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:90:7: ( ( THE WHITE_SPACE )? relaxed_day_of_month WHITE_SPACE ( OF WHITE_SPACE )? relaxed_month relaxed_year )
        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:90:8: ( THE WHITE_SPACE )? relaxed_day_of_month WHITE_SPACE ( OF WHITE_SPACE )? relaxed_month relaxed_year
        {
        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:90:8: ( THE WHITE_SPACE )?
        int alt96=2;
        int LA96_0 = input.LA(1);

        if ( (LA96_0==THE) ) {
            alt96=1;
        }
        switch (alt96) {
            case 1 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:90:9: THE WHITE_SPACE
                {
                match(input,THE,FOLLOW_THE_in_synpred3_Date542); if (state.failed) return ;
                match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_synpred3_Date544); if (state.failed) return ;

                }
                break;

        }

        pushFollow(FOLLOW_relaxed_day_of_month_in_synpred3_Date548);
        relaxed_day_of_month();

        state._fsp--;
        if (state.failed) return ;
        match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_synpred3_Date550); if (state.failed) return ;
        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:90:60: ( OF WHITE_SPACE )?
        int alt97=2;
        int LA97_0 = input.LA(1);

        if ( (LA97_0==OF) ) {
            alt97=1;
        }
        switch (alt97) {
            case 1 :
                // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:90:61: OF WHITE_SPACE
                {
                match(input,OF,FOLLOW_OF_in_synpred3_Date553); if (state.failed) return ;
                match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_synpred3_Date555); if (state.failed) return ;

                }
                break;

        }

        pushFollow(FOLLOW_relaxed_month_in_synpred3_Date559);
        relaxed_month();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_relaxed_year_in_synpred3_Date561);
        relaxed_year();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred3_Date

    // $ANTLR start synpred4_Date
    public final void synpred4_Date_fragment() throws RecognitionException {   
        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:93:9: ( relaxed_month WHITE_SPACE relaxed_day_of_month relaxed_year )
        // /Users/joe/antlr_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:93:10: relaxed_month WHITE_SPACE relaxed_day_of_month relaxed_year
        {
        pushFollow(FOLLOW_relaxed_month_in_synpred4_Date609);
        relaxed_month();

        state._fsp--;
        if (state.failed) return ;
        match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_synpred4_Date611); if (state.failed) return ;
        pushFollow(FOLLOW_relaxed_day_of_month_in_synpred4_Date613);
        relaxed_day_of_month();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_relaxed_year_in_synpred4_Date615);
        relaxed_year();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred4_Date

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
    protected DFA9 dfa9 = new DFA9(this);
    protected DFA12 dfa12 = new DFA12(this);
    protected DFA21 dfa21 = new DFA21(this);
    protected DFA25 dfa25 = new DFA25(this);
    protected DFA34 dfa34 = new DFA34(this);
    protected DFA73 dfa73 = new DFA73(this);
    protected DFA94 dfa94 = new DFA94(this);
    static final String DFA3_eotS =
        "\u0081\uffff";
    static final String DFA3_eofS =
        "\2\uffff\3\137\101\uffff\1\137\33\uffff\5\137\32\uffff";
    static final String DFA3_minS =
        "\1\24\1\uffff\3\24\101\uffff\1\24\31\uffff\1\24\1\uffff\5\24\1\uffff"+
        "\27\0\2\uffff";
    static final String DFA3_maxS =
        "\1\u0085\1\uffff\1\120\2\121\101\uffff\1\121\31\uffff\1\u0085\1"+
        "\uffff\5\107\1\uffff\27\0\2\uffff";
    static final String DFA3_acceptS =
        "\1\uffff\1\1\3\uffff\101\1\1\uffff\30\1\1\2\1\uffff\1\1\5\uffff"+
        "\1\1\27\uffff\2\1";
    static final String DFA3_specialS =
        "\1\35\1\uffff\1\32\1\10\1\15\101\uffff\1\17\31\uffff\1\30\1\uffff"+
        "\1\3\1\5\1\7\1\22\1\20\1\uffff\1\14\1\2\1\21\1\16\1\24\1\23\1\36"+
        "\1\40\1\37\1\27\1\31\1\25\1\26\1\1\1\0\1\6\1\4\1\13\1\12\1\11\1"+
        "\41\1\34\1\33\2\uffff}>";
    static final String[] DFA3_transitionS = {
            "\1\133\3\uffff\1\1\1\127\3\uffff\1\72\1\73\1\74\1\75\1\76\1"+
            "\77\1\100\1\101\1\102\1\103\1\104\1\105\1\uffff\1\117\1\132"+
            "\2\uffff\1\112\1\111\1\113\1\114\1\115\1\116\3\uffff\1\130\1"+
            "\131\1\120\1\121\1\122\1\123\1\124\1\125\1\126\1\134\1\135\1"+
            "\136\5\uffff\3\137\1\106\1\2\1\3\1\4\1\5\1\107\1\110\1\6\1\7"+
            "\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23"+
            "\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37"+
            "\1\40\1\41\1\42\1\43\1\44\1\45\1\46\1\47\1\50\1\51\1\52\1\53"+
            "\1\54\1\55\1\56\1\57\1\60\1\61\1\62\1\63\1\64\1\65\1\66\1\67"+
            "\1\70\1\71",
            "",
            "\1\140\1\uffff\1\137\25\uffff\2\141\25\uffff\1\137\2\uffff"+
            "\2\137\3\uffff\1\137\1\uffff\4\137",
            "\1\140\1\uffff\1\137\25\uffff\2\141\25\uffff\1\137\2\uffff"+
            "\2\137\3\uffff\1\142\1\uffff\1\143\1\144\1\145\1\146\1\147",
            "\1\140\1\uffff\1\137\54\uffff\1\137\2\uffff\2\137\3\uffff\1"+
            "\142\1\uffff\1\143\1\144\1\145\1\146\1\147",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\137\1\uffff\1\137\54\uffff\1\137\2\uffff\2\137\3\uffff\1"+
            "\142\1\uffff\1\143\1\144\1\145\1\146\1\147",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\137\2\uffff\2\137\1\150\2\uffff\1\177\1\151\1\152\1\153"+
            "\1\154\1\155\1\156\1\157\1\160\1\161\1\162\1\163\1\164\1\uffff"+
            "\1\137\1\176\2\uffff\6\137\3\uffff\1\174\1\175\1\165\1\166\1"+
            "\167\1\170\1\171\1\172\1\173\3\137\3\uffff\2\137\3\uffff\73"+
            "\137",
            "",
            "\1\137\1\uffff\1\137\25\uffff\2\u0080\26\uffff\4\137",
            "\1\137\1\uffff\1\137\25\uffff\2\u0080\26\uffff\4\137",
            "\1\137\1\uffff\1\137\25\uffff\2\u0080\26\uffff\4\137",
            "\1\137\1\uffff\1\137\25\uffff\2\u0080\26\uffff\4\137",
            "\1\137\1\uffff\1\137\25\uffff\2\u0080\26\uffff\4\137",
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
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA3_118 = input.LA(1);

                         
                        int index3_118 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 128;}

                        else if ( (true) ) {s = 95;}

                         
                        input.seek(index3_118);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA3_117 = input.LA(1);

                         
                        int index3_117 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 128;}

                        else if ( (true) ) {s = 95;}

                         
                        input.seek(index3_117);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA3_105 = input.LA(1);

                         
                        int index3_105 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 128;}

                        else if ( (true) ) {s = 95;}

                         
                        input.seek(index3_105);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA3_98 = input.LA(1);

                         
                        int index3_98 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA3_98==EOF||LA3_98==WHITE_SPACE||LA3_98==COMMA||(LA3_98>=MILITARY_HOUR_SUFFIX && LA3_98<=PM)) ) {s = 95;}

                        else if ( ((LA3_98>=DASH && LA3_98<=SLASH)) && (synpred1_Date())) {s = 128;}

                         
                        input.seek(index3_98);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA3_120 = input.LA(1);

                         
                        int index3_120 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 128;}

                        else if ( (true) ) {s = 95;}

                         
                        input.seek(index3_120);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA3_99 = input.LA(1);

                         
                        int index3_99 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA3_99==EOF||LA3_99==WHITE_SPACE||LA3_99==COMMA||(LA3_99>=MILITARY_HOUR_SUFFIX && LA3_99<=PM)) ) {s = 95;}

                        else if ( ((LA3_99>=DASH && LA3_99<=SLASH)) && (synpred1_Date())) {s = 128;}

                         
                        input.seek(index3_99);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA3_119 = input.LA(1);

                         
                        int index3_119 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 128;}

                        else if ( (true) ) {s = 95;}

                         
                        input.seek(index3_119);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA3_100 = input.LA(1);

                         
                        int index3_100 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA3_100==EOF||LA3_100==WHITE_SPACE||LA3_100==COMMA||(LA3_100>=MILITARY_HOUR_SUFFIX && LA3_100<=PM)) ) {s = 95;}

                        else if ( ((LA3_100>=DASH && LA3_100<=SLASH)) && (synpred1_Date())) {s = 128;}

                         
                        input.seek(index3_100);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA3_3 = input.LA(1);

                         
                        int index3_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA3_3==WHITE_SPACE) ) {s = 96;}

                        else if ( (LA3_3==EOF||LA3_3==COMMA||LA3_3==COLON||(LA3_3>=AM && LA3_3<=PM)) ) {s = 95;}

                        else if ( (LA3_3==INT_00) ) {s = 98;}

                        else if ( (LA3_3==INT_01_TO_12) ) {s = 99;}

                        else if ( (LA3_3==INT_13_TO_23) ) {s = 100;}

                        else if ( (LA3_3==INT_24_TO_31) ) {s = 101;}

                        else if ( (LA3_3==INT_32_TO_59) ) {s = 102;}

                        else if ( (LA3_3==INT_60_TO_99) && (synpred1_Date())) {s = 103;}

                        else if ( ((LA3_3>=DASH && LA3_3<=SLASH)) && (synpred1_Date())) {s = 97;}

                         
                        input.seek(index3_3);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA3_123 = input.LA(1);

                         
                        int index3_123 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 128;}

                        else if ( (true) ) {s = 95;}

                         
                        input.seek(index3_123);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA3_122 = input.LA(1);

                         
                        int index3_122 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 128;}

                        else if ( (true) ) {s = 95;}

                         
                        input.seek(index3_122);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA3_121 = input.LA(1);

                         
                        int index3_121 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 128;}

                        else if ( (true) ) {s = 95;}

                         
                        input.seek(index3_121);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA3_104 = input.LA(1);

                         
                        int index3_104 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 128;}

                        else if ( (true) ) {s = 95;}

                         
                        input.seek(index3_104);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA3_4 = input.LA(1);

                         
                        int index3_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA3_4==EOF||LA3_4==COMMA||LA3_4==COLON||(LA3_4>=AM && LA3_4<=PM)) ) {s = 95;}

                        else if ( (LA3_4==INT_00) ) {s = 98;}

                        else if ( (LA3_4==INT_01_TO_12) ) {s = 99;}

                        else if ( (LA3_4==INT_13_TO_23) ) {s = 100;}

                        else if ( (LA3_4==INT_24_TO_31) ) {s = 101;}

                        else if ( (LA3_4==INT_32_TO_59) ) {s = 102;}

                        else if ( (LA3_4==WHITE_SPACE) ) {s = 96;}

                        else if ( (LA3_4==INT_60_TO_99) && (synpred1_Date())) {s = 103;}

                         
                        input.seek(index3_4);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA3_107 = input.LA(1);

                         
                        int index3_107 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 128;}

                        else if ( (true) ) {s = 95;}

                         
                        input.seek(index3_107);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA3_70 = input.LA(1);

                         
                        int index3_70 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA3_70==EOF||LA3_70==WHITE_SPACE||LA3_70==COMMA||LA3_70==COLON||(LA3_70>=AM && LA3_70<=PM)) ) {s = 95;}

                        else if ( (LA3_70==INT_00) ) {s = 98;}

                        else if ( (LA3_70==INT_01_TO_12) ) {s = 99;}

                        else if ( (LA3_70==INT_13_TO_23) ) {s = 100;}

                        else if ( (LA3_70==INT_24_TO_31) ) {s = 101;}

                        else if ( (LA3_70==INT_32_TO_59) ) {s = 102;}

                        else if ( (LA3_70==INT_60_TO_99) && (synpred1_Date())) {s = 103;}

                         
                        input.seek(index3_70);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA3_102 = input.LA(1);

                         
                        int index3_102 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA3_102>=DASH && LA3_102<=SLASH)) && (synpred1_Date())) {s = 128;}

                        else if ( (LA3_102==EOF||LA3_102==WHITE_SPACE||LA3_102==COMMA||(LA3_102>=MILITARY_HOUR_SUFFIX && LA3_102<=PM)) ) {s = 95;}

                         
                        input.seek(index3_102);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA3_106 = input.LA(1);

                         
                        int index3_106 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 128;}

                        else if ( (true) ) {s = 95;}

                         
                        input.seek(index3_106);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA3_101 = input.LA(1);

                         
                        int index3_101 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA3_101==EOF||LA3_101==WHITE_SPACE||LA3_101==COMMA||(LA3_101>=MILITARY_HOUR_SUFFIX && LA3_101<=PM)) ) {s = 95;}

                        else if ( ((LA3_101>=DASH && LA3_101<=SLASH)) && (synpred1_Date())) {s = 128;}

                         
                        input.seek(index3_101);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA3_109 = input.LA(1);

                         
                        int index3_109 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 128;}

                        else if ( (true) ) {s = 95;}

                         
                        input.seek(index3_109);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA3_108 = input.LA(1);

                         
                        int index3_108 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 128;}

                        else if ( (true) ) {s = 95;}

                         
                        input.seek(index3_108);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA3_115 = input.LA(1);

                         
                        int index3_115 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 128;}

                        else if ( (true) ) {s = 95;}

                         
                        input.seek(index3_115);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA3_116 = input.LA(1);

                         
                        int index3_116 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 128;}

                        else if ( (true) ) {s = 95;}

                         
                        input.seek(index3_116);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA3_113 = input.LA(1);

                         
                        int index3_113 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 128;}

                        else if ( (true) ) {s = 95;}

                         
                        input.seek(index3_113);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA3_96 = input.LA(1);

                         
                        int index3_96 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA3_96==DAY) ) {s = 104;}

                        else if ( (LA3_96==WHITE_SPACE||(LA3_96>=ON && LA3_96<=THE)||LA3_96==IN||(LA3_96>=LAST && LA3_96<=UPCOMING)||(LA3_96>=TODAY && LA3_96<=YESTERDAY)||(LA3_96>=AM && LA3_96<=PM)||(LA3_96>=INT_00 && LA3_96<=THIRTY_FIRST)) ) {s = 95;}

                        else if ( (LA3_96==JANUARY) ) {s = 105;}

                        else if ( (LA3_96==FEBRUARY) ) {s = 106;}

                        else if ( (LA3_96==MARCH) ) {s = 107;}

                        else if ( (LA3_96==APRIL) ) {s = 108;}

                        else if ( (LA3_96==MAY) ) {s = 109;}

                        else if ( (LA3_96==JUNE) ) {s = 110;}

                        else if ( (LA3_96==JULY) ) {s = 111;}

                        else if ( (LA3_96==AUGUST) ) {s = 112;}

                        else if ( (LA3_96==SEPTEMBER) ) {s = 113;}

                        else if ( (LA3_96==OCTOBER) ) {s = 114;}

                        else if ( (LA3_96==NOVEMBER) ) {s = 115;}

                        else if ( (LA3_96==DECEMBER) ) {s = 116;}

                        else if ( (LA3_96==SUNDAY) ) {s = 117;}

                        else if ( (LA3_96==MONDAY) ) {s = 118;}

                        else if ( (LA3_96==TUESDAY) ) {s = 119;}

                        else if ( (LA3_96==WEDNESDAY) ) {s = 120;}

                        else if ( (LA3_96==THURSDAY) ) {s = 121;}

                        else if ( (LA3_96==FRIDAY) ) {s = 122;}

                        else if ( (LA3_96==SATURDAY) ) {s = 123;}

                        else if ( (LA3_96==WEEK) ) {s = 124;}

                        else if ( (LA3_96==MONTH) ) {s = 125;}

                        else if ( (LA3_96==YEAR) ) {s = 126;}

                        else if ( (LA3_96==OF) && (synpred1_Date())) {s = 127;}

                         
                        input.seek(index3_96);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA3_114 = input.LA(1);

                         
                        int index3_114 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 128;}

                        else if ( (true) ) {s = 95;}

                         
                        input.seek(index3_114);
                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
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
                    case 27 : 
                        int LA3_126 = input.LA(1);

                         
                        int index3_126 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 128;}

                        else if ( (true) ) {s = 95;}

                         
                        input.seek(index3_126);
                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA3_125 = input.LA(1);

                         
                        int index3_125 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 128;}

                        else if ( (true) ) {s = 95;}

                         
                        input.seek(index3_125);
                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA3_0 = input.LA(1);

                         
                        int index3_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA3_0==THE) && (synpred1_Date())) {s = 1;}

                        else if ( (LA3_0==INT_1_TO_9) ) {s = 2;}

                        else if ( (LA3_0==INT_01_TO_12) ) {s = 3;}

                        else if ( (LA3_0==INT_13_TO_23) ) {s = 4;}

                        else if ( (LA3_0==INT_24_TO_31) && (synpred1_Date())) {s = 5;}

                        else if ( (LA3_0==ONE) && (synpred1_Date())) {s = 6;}

                        else if ( (LA3_0==TWO) && (synpred1_Date())) {s = 7;}

                        else if ( (LA3_0==THREE) && (synpred1_Date())) {s = 8;}

                        else if ( (LA3_0==FOUR) && (synpred1_Date())) {s = 9;}

                        else if ( (LA3_0==FIVE) && (synpred1_Date())) {s = 10;}

                        else if ( (LA3_0==SIX) && (synpred1_Date())) {s = 11;}

                        else if ( (LA3_0==SEVEN) && (synpred1_Date())) {s = 12;}

                        else if ( (LA3_0==EIGHT) && (synpred1_Date())) {s = 13;}

                        else if ( (LA3_0==NINE) && (synpred1_Date())) {s = 14;}

                        else if ( (LA3_0==TEN) && (synpred1_Date())) {s = 15;}

                        else if ( (LA3_0==ELEVEN) && (synpred1_Date())) {s = 16;}

                        else if ( (LA3_0==TWELVE) && (synpred1_Date())) {s = 17;}

                        else if ( (LA3_0==THIRTEEN) && (synpred1_Date())) {s = 18;}

                        else if ( (LA3_0==FOURTEEN) && (synpred1_Date())) {s = 19;}

                        else if ( (LA3_0==FIFTEEN) && (synpred1_Date())) {s = 20;}

                        else if ( (LA3_0==SIXTEEN) && (synpred1_Date())) {s = 21;}

                        else if ( (LA3_0==SEVENTEEN) && (synpred1_Date())) {s = 22;}

                        else if ( (LA3_0==EIGHTEEN) && (synpred1_Date())) {s = 23;}

                        else if ( (LA3_0==NINETEEN) && (synpred1_Date())) {s = 24;}

                        else if ( (LA3_0==TWENTY) && (synpred1_Date())) {s = 25;}

                        else if ( (LA3_0==THIRTY) && (synpred1_Date())) {s = 26;}

                        else if ( (LA3_0==FIRST) && (synpred1_Date())) {s = 27;}

                        else if ( (LA3_0==SECOND) && (synpred1_Date())) {s = 28;}

                        else if ( (LA3_0==THIRD) && (synpred1_Date())) {s = 29;}

                        else if ( (LA3_0==FOURTH) && (synpred1_Date())) {s = 30;}

                        else if ( (LA3_0==FIFTH) && (synpred1_Date())) {s = 31;}

                        else if ( (LA3_0==SIXTH) && (synpred1_Date())) {s = 32;}

                        else if ( (LA3_0==SEVENTH) && (synpred1_Date())) {s = 33;}

                        else if ( (LA3_0==EIGHTH) && (synpred1_Date())) {s = 34;}

                        else if ( (LA3_0==NINTH) && (synpred1_Date())) {s = 35;}

                        else if ( (LA3_0==TENTH) && (synpred1_Date())) {s = 36;}

                        else if ( (LA3_0==ELEVENTH) && (synpred1_Date())) {s = 37;}

                        else if ( (LA3_0==TWELFTH) && (synpred1_Date())) {s = 38;}

                        else if ( (LA3_0==THIRTEENTH) && (synpred1_Date())) {s = 39;}

                        else if ( (LA3_0==FOURTEENTH) && (synpred1_Date())) {s = 40;}

                        else if ( (LA3_0==FIFTEENTH) && (synpred1_Date())) {s = 41;}

                        else if ( (LA3_0==SIXTEENTH) && (synpred1_Date())) {s = 42;}

                        else if ( (LA3_0==SEVENTEENTH) && (synpred1_Date())) {s = 43;}

                        else if ( (LA3_0==EIGHTEENTH) && (synpred1_Date())) {s = 44;}

                        else if ( (LA3_0==NINETEENTH) && (synpred1_Date())) {s = 45;}

                        else if ( (LA3_0==TWENTIETH) && (synpred1_Date())) {s = 46;}

                        else if ( (LA3_0==TWENTY_FIRST) && (synpred1_Date())) {s = 47;}

                        else if ( (LA3_0==TWENTY_SECOND) && (synpred1_Date())) {s = 48;}

                        else if ( (LA3_0==TWENTY_THIRD) && (synpred1_Date())) {s = 49;}

                        else if ( (LA3_0==TWENTY_FOURTH) && (synpred1_Date())) {s = 50;}

                        else if ( (LA3_0==TWENTY_FIFTH) && (synpred1_Date())) {s = 51;}

                        else if ( (LA3_0==TWENTY_SIXTH) && (synpred1_Date())) {s = 52;}

                        else if ( (LA3_0==TWENTY_SEVENTH) && (synpred1_Date())) {s = 53;}

                        else if ( (LA3_0==TWENTY_EIGHTH) && (synpred1_Date())) {s = 54;}

                        else if ( (LA3_0==TWENTY_NINTH) && (synpred1_Date())) {s = 55;}

                        else if ( (LA3_0==THIRTIETH) && (synpred1_Date())) {s = 56;}

                        else if ( (LA3_0==THIRTY_FIRST) && (synpred1_Date())) {s = 57;}

                        else if ( (LA3_0==JANUARY) && (synpred1_Date())) {s = 58;}

                        else if ( (LA3_0==FEBRUARY) && (synpred1_Date())) {s = 59;}

                        else if ( (LA3_0==MARCH) && (synpred1_Date())) {s = 60;}

                        else if ( (LA3_0==APRIL) && (synpred1_Date())) {s = 61;}

                        else if ( (LA3_0==MAY) && (synpred1_Date())) {s = 62;}

                        else if ( (LA3_0==JUNE) && (synpred1_Date())) {s = 63;}

                        else if ( (LA3_0==JULY) && (synpred1_Date())) {s = 64;}

                        else if ( (LA3_0==AUGUST) && (synpred1_Date())) {s = 65;}

                        else if ( (LA3_0==SEPTEMBER) && (synpred1_Date())) {s = 66;}

                        else if ( (LA3_0==OCTOBER) && (synpred1_Date())) {s = 67;}

                        else if ( (LA3_0==NOVEMBER) && (synpred1_Date())) {s = 68;}

                        else if ( (LA3_0==DECEMBER) && (synpred1_Date())) {s = 69;}

                        else if ( (LA3_0==INT_00) ) {s = 70;}

                        else if ( (LA3_0==INT_32_TO_59) && (synpred1_Date())) {s = 71;}

                        else if ( (LA3_0==INT_60_TO_99) && (synpred1_Date())) {s = 72;}

                        else if ( (LA3_0==THIS) && (synpred1_Date())) {s = 73;}

                        else if ( (LA3_0==LAST) && (synpred1_Date())) {s = 74;}

                        else if ( (LA3_0==NEXT) && (synpred1_Date())) {s = 75;}

                        else if ( (LA3_0==PAST) && (synpred1_Date())) {s = 76;}

                        else if ( (LA3_0==COMING) && (synpred1_Date())) {s = 77;}

                        else if ( (LA3_0==UPCOMING) && (synpred1_Date())) {s = 78;}

                        else if ( (LA3_0==IN) && (synpred1_Date())) {s = 79;}

                        else if ( (LA3_0==SUNDAY) && (synpred1_Date())) {s = 80;}

                        else if ( (LA3_0==MONDAY) && (synpred1_Date())) {s = 81;}

                        else if ( (LA3_0==TUESDAY) && (synpred1_Date())) {s = 82;}

                        else if ( (LA3_0==WEDNESDAY) && (synpred1_Date())) {s = 83;}

                        else if ( (LA3_0==THURSDAY) && (synpred1_Date())) {s = 84;}

                        else if ( (LA3_0==FRIDAY) && (synpred1_Date())) {s = 85;}

                        else if ( (LA3_0==SATURDAY) && (synpred1_Date())) {s = 86;}

                        else if ( (LA3_0==DAY) && (synpred1_Date())) {s = 87;}

                        else if ( (LA3_0==WEEK) && (synpred1_Date())) {s = 88;}

                        else if ( (LA3_0==MONTH) && (synpred1_Date())) {s = 89;}

                        else if ( (LA3_0==YEAR) && (synpred1_Date())) {s = 90;}

                        else if ( (LA3_0==WHITE_SPACE) && (synpred1_Date())) {s = 91;}

                        else if ( (LA3_0==TODAY) && (synpred1_Date())) {s = 92;}

                        else if ( (LA3_0==TOMORROW) && (synpred1_Date())) {s = 93;}

                        else if ( (LA3_0==YESTERDAY) && (synpred1_Date())) {s = 94;}

                        else if ( ((LA3_0>=NOON && LA3_0<=INT_0)) ) {s = 95;}

                         
                        input.seek(index3_0);
                        if ( s>=0 ) return s;
                        break;
                    case 30 : 
                        int LA3_110 = input.LA(1);

                         
                        int index3_110 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 128;}

                        else if ( (true) ) {s = 95;}

                         
                        input.seek(index3_110);
                        if ( s>=0 ) return s;
                        break;
                    case 31 : 
                        int LA3_112 = input.LA(1);

                         
                        int index3_112 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 128;}

                        else if ( (true) ) {s = 95;}

                         
                        input.seek(index3_112);
                        if ( s>=0 ) return s;
                        break;
                    case 32 : 
                        int LA3_111 = input.LA(1);

                         
                        int index3_111 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 128;}

                        else if ( (true) ) {s = 95;}

                         
                        input.seek(index3_111);
                        if ( s>=0 ) return s;
                        break;
                    case 33 : 
                        int LA3_124 = input.LA(1);

                         
                        int index3_124 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 128;}

                        else if ( (true) ) {s = 95;}

                         
                        input.seek(index3_124);
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
    static final String DFA9_eotS =
        "\15\uffff";
    static final String DFA9_eofS =
        "\6\uffff\7\4";
    static final String DFA9_minS =
        "\2\24\1\uffff\1\24\1\uffff\1\31\7\24";
    static final String DFA9_maxS =
        "\2\u0085\1\uffff\1\24\1\uffff\1\77\7\u0088";
    static final String DFA9_acceptS =
        "\2\uffff\1\2\1\uffff\1\1\10\uffff";
    static final String DFA9_specialS =
        "\15\uffff}>";
    static final String[] DFA9_transitionS = {
            "\1\1\2\uffff\3\2\3\uffff\14\2\1\uffff\2\2\2\uffff\6\2\3\uffff"+
            "\14\2\10\uffff\73\2",
            "\1\4\2\uffff\3\4\3\uffff\14\4\1\uffff\2\4\2\uffff\1\3\5\4\3"+
            "\uffff\14\4\10\uffff\73\4",
            "",
            "\1\5",
            "",
            "\1\4\3\uffff\14\4\2\uffff\1\4\13\uffff\2\4\1\6\1\7\1\10\1\11"+
            "\1\12\1\13\1\14",
            "\1\2\163\uffff\1\4",
            "\1\2\163\uffff\1\4",
            "\1\2\163\uffff\1\4",
            "\1\2\163\uffff\1\4",
            "\1\2\163\uffff\1\4",
            "\1\2\163\uffff\1\4",
            "\1\2\163\uffff\1\4"
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
            return "58:11: ( WHITE_SPACE )?";
        }
    }
    static final String DFA12_eotS =
        "\u00d2\uffff";
    static final String DFA12_eofS =
        "\72\uffff\14\107\2\uffff\1\107\102\uffff\1\107\106\uffff";
    static final String DFA12_minS =
        "\33\24\37\uffff\14\24\2\uffff\1\24\2\31\1\122\1\31\4\24\2\uffff"+
        "\2\24\1\uffff\1\24\2\uffff\2\24\4\uffff\1\31\1\122\1\uffff\1\24"+
        "\2\25\46\uffff\1\24\1\uffff\17\0\65\uffff\1\25";
    static final String DFA12_maxS =
        "\1\u0085\1\24\1\55\3\121\23\24\1\157\1\147\37\uffff\14\26\2\uffff"+
        "\1\26\1\u0085\1\77\2\157\4\24\2\uffff\2\24\1\uffff\1\24\2\uffff"+
        "\2\24\4\uffff\2\147\1\uffff\1\24\1\u0085\1\116\46\uffff\1\u0088"+
        "\1\uffff\17\0\65\uffff\1\116";
    static final String DFA12_acceptS =
        "\33\uffff\37\1\14\uffff\1\2\1\3\11\uffff\2\1\2\uffff\1\1\1\uffff"+
        "\2\1\2\uffff\4\1\2\uffff\1\1\3\uffff\14\1\1\4\31\1\1\uffff\1\1\17"+
        "\uffff\65\1\1\uffff";
    static final String DFA12_specialS =
        "\1\24\30\uffff\1\16\1\21\56\uffff\1\30\1\12\1\25\1\27\22\uffff\1"+
        "\23\1\11\2\uffff\1\26\51\uffff\1\10\1\14\1\13\1\17\1\15\1\22\1\20"+
        "\1\0\1\1\1\2\1\3\1\4\1\7\1\6\1\5\66\uffff}>";
    static final String[] DFA12_transitionS = {
            "\1\107\3\uffff\1\1\1\110\3\uffff\1\72\1\73\1\74\1\75\1\76\1"+
            "\77\1\100\1\101\1\102\1\103\1\104\1\105\1\uffff\2\107\2\uffff"+
            "\6\107\3\uffff\14\107\10\uffff\1\106\1\2\1\3\1\4\1\5\2\106\1"+
            "\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22"+
            "\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36"+
            "\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\46\1\47\1\50\1\51\1\52"+
            "\1\53\1\54\1\55\1\56\1\57\1\60\1\61\1\62\1\63\1\64\1\65\1\66"+
            "\1\67\1\70\1\71",
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
            "\1\114\27\uffff\1\113\45\uffff\1\132\1\124\1\120\1\116\1\123"+
            "\1\115\1\117\1\126\1\131\14\uffff\1\125\1\136\1\134\1\133\1"+
            "\130\1\122\1\127\1\121\1\135",
            "\1\137\27\uffff\1\140\45\uffff\1\142\24\uffff\1\141",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\143\1\uffff\1\107",
            "\1\143\1\uffff\1\107",
            "\1\143\1\uffff\1\107",
            "\1\143\1\uffff\1\107",
            "\1\143\1\uffff\1\107",
            "\1\143\1\uffff\1\107",
            "\1\143\1\uffff\1\107",
            "\1\143\1\uffff\1\107",
            "\1\143\1\uffff\1\107",
            "\1\143\1\uffff\1\107",
            "\1\143\1\uffff\1\107",
            "\1\143\1\uffff\1\107",
            "",
            "",
            "\1\144\1\uffff\1\107",
            "\1\161\3\uffff\1\145\1\146\1\147\1\150\1\151\1\152\1\153\1"+
            "\154\1\155\1\156\1\157\1\160\5\uffff\1\107\35\uffff\1\162\1"+
            "\163\1\164\1\165\2\uffff\1\166\1\167\1\170\1\171\1\172\1\173"+
            "\1\174\1\175\1\176\1\177\1\u0080\1\u0081\1\u0082\1\u0083\1\u0084"+
            "\1\u0085\1\u0086\1\u0087\1\u0088\1\u0089\1\u008a\1\33\1\34\1"+
            "\35\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\46\1\47\1\50\1"+
            "\51\1\52\1\53\1\54\1\55\1\56\1\57\1\60\1\61\1\62\1\63\1\64\1"+
            "\65\1\66\1\67\1\70\1\71",
            "\1\u008b\2\uffff\1\u008c\1\u008d\1\u008e\1\u008f\1\u0090\1"+
            "\u0091\1\u0092\1\u0093\1\u0094\1\u0095\1\u0096\1\u0097\1\u0098"+
            "\2\uffff\1\107\13\uffff\11\107",
            "\1\132\1\124\1\120\1\116\1\123\1\115\1\117\1\126\1\131\14\uffff"+
            "\1\125\1\136\1\134\1\133\1\130\1\122\1\127\1\121\1\135",
            "\1\u008b\2\uffff\1\u008c\1\u008d\1\u008e\1\u008f\1\u0090\1"+
            "\u0091\1\u0092\1\u0093\1\u0094\1\u0095\1\u0096\1\u0097\1\u0098"+
            "\2\uffff\1\107\13\uffff\11\107\22\uffff\1\132\1\124\1\120\1"+
            "\116\1\123\1\115\1\117\1\126\1\131\14\uffff\1\125\1\136\1\134"+
            "\1\133\1\130\1\122\1\127\1\121\1\135",
            "\1\112",
            "\1\112",
            "\1\112",
            "\1\112",
            "",
            "",
            "\1\112",
            "\1\112",
            "",
            "\1\112",
            "",
            "",
            "\1\112",
            "\1\112",
            "",
            "",
            "",
            "",
            "\1\u008b\2\uffff\1\u008c\1\u008d\1\u008e\1\u008f\1\u0090\1"+
            "\u0091\1\u0092\1\u0093\1\u0094\1\u0095\1\u0096\1\u0097\1\u0098"+
            "\2\uffff\1\107\13\uffff\11\107\22\uffff\1\142\24\uffff\1\141",
            "\1\142\24\uffff\1\141",
            "",
            "\1\112",
            "\1\107\62\uffff\4\107\1\u0099\1\u009a\1\u009b\1\u009c\2\uffff"+
            "\1\u009d\1\u009e\1\u009f\1\u00a0\1\u00a1\1\u00a2\1\u00a3\1\u00a4"+
            "\1\u00a5\1\u00a6\1\u00a7\1\u00a8\1\u00a9\1\u00aa\1\u00ab\1\u00ac"+
            "\1\u00ad\1\u00ae\1\u00af\1\u00b0\1\u00b1\1\u00b2\1\u00b3\1\u00b4"+
            "\1\u00b5\1\u00b6\1\u00b7\1\u00b8\1\u00b9\1\u00ba\1\u00bb\1\u00bc"+
            "\1\u00bd\1\u00be\1\u00bf\1\u00c0\1\u00c1\1\u00c2\1\u00c3\1\u00c4"+
            "\1\u00c5\1\u00c6\1\u00c7\1\u00c8\1\u00c9\1\u00ca\1\u00cb\1\u00cc"+
            "\1\u00cd\1\u00ce\1\u00cf\1\u00d0",
            "\1\107\4\uffff\2\161\54\uffff\7\107",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00d1\1\uffff\1\107\161\uffff\1\107",
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
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\107\4\uffff\2\161\30\uffff\1\107\1\uffff\1\107\21\uffff"+
            "\7\107"
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
            return "61:1: date : ( ( relaxed_date )=> relaxed_date | formal_date | relative_date | global_date_prefix date -> ^( RELATIVE_DATE ^( SEEK global_date_prefix date ) ) );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_148 = input.LA(1);

                         
                        int index12_148 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_Date()) ) {s = 208;}

                        else if ( (true) ) {s = 71;}

                         
                        input.seek(index12_148);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_149 = input.LA(1);

                         
                        int index12_149 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_Date()) ) {s = 208;}

                        else if ( (true) ) {s = 71;}

                         
                        input.seek(index12_149);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA12_150 = input.LA(1);

                         
                        int index12_150 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_Date()) ) {s = 208;}

                        else if ( (true) ) {s = 71;}

                         
                        input.seek(index12_150);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA12_151 = input.LA(1);

                         
                        int index12_151 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_Date()) ) {s = 208;}

                        else if ( (true) ) {s = 71;}

                         
                        input.seek(index12_151);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA12_152 = input.LA(1);

                         
                        int index12_152 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_Date()) ) {s = 208;}

                        else if ( (true) ) {s = 71;}

                         
                        input.seek(index12_152);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA12_155 = input.LA(1);

                         
                        int index12_155 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_Date()) ) {s = 208;}

                        else if ( (true) ) {s = 71;}

                         
                        input.seek(index12_155);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA12_154 = input.LA(1);

                         
                        int index12_154 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_Date()) ) {s = 208;}

                        else if ( (true) ) {s = 71;}

                         
                        input.seek(index12_154);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA12_153 = input.LA(1);

                         
                        int index12_153 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_Date()) ) {s = 208;}

                        else if ( (true) ) {s = 71;}

                         
                        input.seek(index12_153);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA12_141 = input.LA(1);

                         
                        int index12_141 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_Date()) ) {s = 208;}

                        else if ( (true) ) {s = 71;}

                         
                        input.seek(index12_141);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA12_96 = input.LA(1);

                         
                        int index12_96 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA12_96==ONE) ) {s = 98;}

                        else if ( (LA12_96==FIRST) && (synpred2_Date())) {s = 97;}

                         
                        input.seek(index12_96);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA12_74 = input.LA(1);

                         
                        int index12_74 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA12_74==DAY) ) {s = 139;}

                        else if ( (LA12_74==OF) && (synpred2_Date())) {s = 140;}

                        else if ( (LA12_74==JANUARY) ) {s = 141;}

                        else if ( (LA12_74==FEBRUARY) ) {s = 142;}

                        else if ( (LA12_74==MARCH) ) {s = 143;}

                        else if ( (LA12_74==APRIL) ) {s = 144;}

                        else if ( (LA12_74==MAY) ) {s = 145;}

                        else if ( (LA12_74==JUNE) ) {s = 146;}

                        else if ( (LA12_74==JULY) ) {s = 147;}

                        else if ( (LA12_74==AUGUST) ) {s = 148;}

                        else if ( (LA12_74==SEPTEMBER) ) {s = 149;}

                        else if ( (LA12_74==OCTOBER) ) {s = 150;}

                        else if ( (LA12_74==NOVEMBER) ) {s = 151;}

                        else if ( (LA12_74==DECEMBER) ) {s = 152;}

                        else if ( (LA12_74==YEAR||(LA12_74>=WEEK && LA12_74<=SATURDAY)) ) {s = 71;}

                         
                        input.seek(index12_74);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA12_143 = input.LA(1);

                         
                        int index12_143 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_Date()) ) {s = 208;}

                        else if ( (true) ) {s = 71;}

                         
                        input.seek(index12_143);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA12_142 = input.LA(1);

                         
                        int index12_142 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_Date()) ) {s = 208;}

                        else if ( (true) ) {s = 71;}

                         
                        input.seek(index12_142);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA12_145 = input.LA(1);

                         
                        int index12_145 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_Date()) ) {s = 208;}

                        else if ( (true) ) {s = 71;}

                         
                        input.seek(index12_145);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA12_25 = input.LA(1);

                         
                        int index12_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA12_25==DASH) ) {s = 75;}

                        else if ( (LA12_25==WHITE_SPACE) ) {s = 76;}

                        else if ( (LA12_25==SIX) ) {s = 77;}

                        else if ( (LA12_25==FOUR) ) {s = 78;}

                        else if ( (LA12_25==SEVEN) ) {s = 79;}

                        else if ( (LA12_25==THREE) ) {s = 80;}

                        else if ( (LA12_25==EIGHTH) && (synpred2_Date())) {s = 81;}

                        else if ( (LA12_25==SIXTH) && (synpred2_Date())) {s = 82;}

                        else if ( (LA12_25==FIVE) ) {s = 83;}

                        else if ( (LA12_25==TWO) ) {s = 84;}

                        else if ( (LA12_25==FIRST) && (synpred2_Date())) {s = 85;}

                        else if ( (LA12_25==EIGHT) ) {s = 86;}

                        else if ( (LA12_25==SEVENTH) && (synpred2_Date())) {s = 87;}

                        else if ( (LA12_25==FIFTH) && (synpred2_Date())) {s = 88;}

                        else if ( (LA12_25==NINE) ) {s = 89;}

                        else if ( (LA12_25==ONE) ) {s = 90;}

                        else if ( (LA12_25==FOURTH) && (synpred2_Date())) {s = 91;}

                        else if ( (LA12_25==THIRD) && (synpred2_Date())) {s = 92;}

                        else if ( (LA12_25==NINTH) && (synpred2_Date())) {s = 93;}

                        else if ( (LA12_25==SECOND) && (synpred2_Date())) {s = 94;}

                         
                        input.seek(index12_25);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA12_144 = input.LA(1);

                         
                        int index12_144 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_Date()) ) {s = 208;}

                        else if ( (true) ) {s = 71;}

                         
                        input.seek(index12_144);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA12_147 = input.LA(1);

                         
                        int index12_147 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_Date()) ) {s = 208;}

                        else if ( (true) ) {s = 71;}

                         
                        input.seek(index12_147);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA12_26 = input.LA(1);

                         
                        int index12_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA12_26==WHITE_SPACE) ) {s = 95;}

                        else if ( (LA12_26==DASH) ) {s = 96;}

                        else if ( (LA12_26==FIRST) && (synpred2_Date())) {s = 97;}

                        else if ( (LA12_26==ONE) ) {s = 98;}

                         
                        input.seek(index12_26);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA12_146 = input.LA(1);

                         
                        int index12_146 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_Date()) ) {s = 208;}

                        else if ( (true) ) {s = 71;}

                         
                        input.seek(index12_146);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA12_95 = input.LA(1);

                         
                        int index12_95 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA12_95==DAY) ) {s = 139;}

                        else if ( (LA12_95==OF) && (synpred2_Date())) {s = 140;}

                        else if ( (LA12_95==JANUARY) ) {s = 141;}

                        else if ( (LA12_95==FEBRUARY) ) {s = 142;}

                        else if ( (LA12_95==MARCH) ) {s = 143;}

                        else if ( (LA12_95==APRIL) ) {s = 144;}

                        else if ( (LA12_95==MAY) ) {s = 145;}

                        else if ( (LA12_95==JUNE) ) {s = 146;}

                        else if ( (LA12_95==JULY) ) {s = 147;}

                        else if ( (LA12_95==AUGUST) ) {s = 148;}

                        else if ( (LA12_95==SEPTEMBER) ) {s = 149;}

                        else if ( (LA12_95==OCTOBER) ) {s = 150;}

                        else if ( (LA12_95==NOVEMBER) ) {s = 151;}

                        else if ( (LA12_95==DECEMBER) ) {s = 152;}

                        else if ( (LA12_95==ONE) ) {s = 98;}

                        else if ( (LA12_95==YEAR||(LA12_95>=WEEK && LA12_95<=SATURDAY)) ) {s = 71;}

                        else if ( (LA12_95==FIRST) && (synpred2_Date())) {s = 97;}

                         
                        input.seek(index12_95);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA12_0 = input.LA(1);

                         
                        int index12_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA12_0==THE) ) {s = 1;}

                        else if ( (LA12_0==INT_1_TO_9) ) {s = 2;}

                        else if ( (LA12_0==INT_01_TO_12) ) {s = 3;}

                        else if ( (LA12_0==INT_13_TO_23) ) {s = 4;}

                        else if ( (LA12_0==INT_24_TO_31) ) {s = 5;}

                        else if ( (LA12_0==ONE) ) {s = 6;}

                        else if ( (LA12_0==TWO) ) {s = 7;}

                        else if ( (LA12_0==THREE) ) {s = 8;}

                        else if ( (LA12_0==FOUR) ) {s = 9;}

                        else if ( (LA12_0==FIVE) ) {s = 10;}

                        else if ( (LA12_0==SIX) ) {s = 11;}

                        else if ( (LA12_0==SEVEN) ) {s = 12;}

                        else if ( (LA12_0==EIGHT) ) {s = 13;}

                        else if ( (LA12_0==NINE) ) {s = 14;}

                        else if ( (LA12_0==TEN) ) {s = 15;}

                        else if ( (LA12_0==ELEVEN) ) {s = 16;}

                        else if ( (LA12_0==TWELVE) ) {s = 17;}

                        else if ( (LA12_0==THIRTEEN) ) {s = 18;}

                        else if ( (LA12_0==FOURTEEN) ) {s = 19;}

                        else if ( (LA12_0==FIFTEEN) ) {s = 20;}

                        else if ( (LA12_0==SIXTEEN) ) {s = 21;}

                        else if ( (LA12_0==SEVENTEEN) ) {s = 22;}

                        else if ( (LA12_0==EIGHTEEN) ) {s = 23;}

                        else if ( (LA12_0==NINETEEN) ) {s = 24;}

                        else if ( (LA12_0==TWENTY) ) {s = 25;}

                        else if ( (LA12_0==THIRTY) ) {s = 26;}

                        else if ( (LA12_0==FIRST) && (synpred2_Date())) {s = 27;}

                        else if ( (LA12_0==SECOND) && (synpred2_Date())) {s = 28;}

                        else if ( (LA12_0==THIRD) && (synpred2_Date())) {s = 29;}

                        else if ( (LA12_0==FOURTH) && (synpred2_Date())) {s = 30;}

                        else if ( (LA12_0==FIFTH) && (synpred2_Date())) {s = 31;}

                        else if ( (LA12_0==SIXTH) && (synpred2_Date())) {s = 32;}

                        else if ( (LA12_0==SEVENTH) && (synpred2_Date())) {s = 33;}

                        else if ( (LA12_0==EIGHTH) && (synpred2_Date())) {s = 34;}

                        else if ( (LA12_0==NINTH) && (synpred2_Date())) {s = 35;}

                        else if ( (LA12_0==TENTH) && (synpred2_Date())) {s = 36;}

                        else if ( (LA12_0==ELEVENTH) && (synpred2_Date())) {s = 37;}

                        else if ( (LA12_0==TWELFTH) && (synpred2_Date())) {s = 38;}

                        else if ( (LA12_0==THIRTEENTH) && (synpred2_Date())) {s = 39;}

                        else if ( (LA12_0==FOURTEENTH) && (synpred2_Date())) {s = 40;}

                        else if ( (LA12_0==FIFTEENTH) && (synpred2_Date())) {s = 41;}

                        else if ( (LA12_0==SIXTEENTH) && (synpred2_Date())) {s = 42;}

                        else if ( (LA12_0==SEVENTEENTH) && (synpred2_Date())) {s = 43;}

                        else if ( (LA12_0==EIGHTEENTH) && (synpred2_Date())) {s = 44;}

                        else if ( (LA12_0==NINETEENTH) && (synpred2_Date())) {s = 45;}

                        else if ( (LA12_0==TWENTIETH) && (synpred2_Date())) {s = 46;}

                        else if ( (LA12_0==TWENTY_FIRST) && (synpred2_Date())) {s = 47;}

                        else if ( (LA12_0==TWENTY_SECOND) && (synpred2_Date())) {s = 48;}

                        else if ( (LA12_0==TWENTY_THIRD) && (synpred2_Date())) {s = 49;}

                        else if ( (LA12_0==TWENTY_FOURTH) && (synpred2_Date())) {s = 50;}

                        else if ( (LA12_0==TWENTY_FIFTH) && (synpred2_Date())) {s = 51;}

                        else if ( (LA12_0==TWENTY_SIXTH) && (synpred2_Date())) {s = 52;}

                        else if ( (LA12_0==TWENTY_SEVENTH) && (synpred2_Date())) {s = 53;}

                        else if ( (LA12_0==TWENTY_EIGHTH) && (synpred2_Date())) {s = 54;}

                        else if ( (LA12_0==TWENTY_NINTH) && (synpred2_Date())) {s = 55;}

                        else if ( (LA12_0==THIRTIETH) && (synpred2_Date())) {s = 56;}

                        else if ( (LA12_0==THIRTY_FIRST) && (synpred2_Date())) {s = 57;}

                        else if ( (LA12_0==JANUARY) ) {s = 58;}

                        else if ( (LA12_0==FEBRUARY) ) {s = 59;}

                        else if ( (LA12_0==MARCH) ) {s = 60;}

                        else if ( (LA12_0==APRIL) ) {s = 61;}

                        else if ( (LA12_0==MAY) ) {s = 62;}

                        else if ( (LA12_0==JUNE) ) {s = 63;}

                        else if ( (LA12_0==JULY) ) {s = 64;}

                        else if ( (LA12_0==AUGUST) ) {s = 65;}

                        else if ( (LA12_0==SEPTEMBER) ) {s = 66;}

                        else if ( (LA12_0==OCTOBER) ) {s = 67;}

                        else if ( (LA12_0==NOVEMBER) ) {s = 68;}

                        else if ( (LA12_0==DECEMBER) ) {s = 69;}

                        else if ( (LA12_0==INT_00||(LA12_0>=INT_32_TO_59 && LA12_0<=INT_60_TO_99)) ) {s = 70;}

                        else if ( (LA12_0==WHITE_SPACE||(LA12_0>=IN && LA12_0<=YEAR)||(LA12_0>=LAST && LA12_0<=UPCOMING)||(LA12_0>=WEEK && LA12_0<=YESTERDAY)) ) {s = 71;}

                        else if ( (LA12_0==DAY) ) {s = 72;}

                         
                        input.seek(index12_0);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA12_75 = input.LA(1);

                         
                        int index12_75 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA12_75==THREE) ) {s = 80;}

                        else if ( (LA12_75==FOUR) ) {s = 78;}

                        else if ( (LA12_75==SEVEN) ) {s = 79;}

                        else if ( (LA12_75==SIX) ) {s = 77;}

                        else if ( (LA12_75==EIGHTH) && (synpred2_Date())) {s = 81;}

                        else if ( (LA12_75==SIXTH) && (synpred2_Date())) {s = 82;}

                        else if ( (LA12_75==FIVE) ) {s = 83;}

                        else if ( (LA12_75==TWO) ) {s = 84;}

                        else if ( (LA12_75==FIRST) && (synpred2_Date())) {s = 85;}

                        else if ( (LA12_75==FIFTH) && (synpred2_Date())) {s = 88;}

                        else if ( (LA12_75==SEVENTH) && (synpred2_Date())) {s = 87;}

                        else if ( (LA12_75==EIGHT) ) {s = 86;}

                        else if ( (LA12_75==NINE) ) {s = 89;}

                        else if ( (LA12_75==ONE) ) {s = 90;}

                        else if ( (LA12_75==FOURTH) && (synpred2_Date())) {s = 91;}

                        else if ( (LA12_75==THIRD) && (synpred2_Date())) {s = 92;}

                        else if ( (LA12_75==SECOND) && (synpred2_Date())) {s = 94;}

                        else if ( (LA12_75==NINTH) && (synpred2_Date())) {s = 93;}

                         
                        input.seek(index12_75);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA12_99 = input.LA(1);

                         
                        int index12_99 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA12_99==INT_1_TO_9) ) {s = 153;}

                        else if ( (LA12_99==INT_01_TO_12) ) {s = 154;}

                        else if ( (LA12_99==INT_13_TO_23) ) {s = 155;}

                        else if ( (LA12_99==INT_24_TO_31) && (synpred2_Date())) {s = 156;}

                        else if ( (LA12_99==ONE) && (synpred2_Date())) {s = 157;}

                        else if ( (LA12_99==TWO) && (synpred2_Date())) {s = 158;}

                        else if ( (LA12_99==THREE) && (synpred2_Date())) {s = 159;}

                        else if ( (LA12_99==FOUR) && (synpred2_Date())) {s = 160;}

                        else if ( (LA12_99==FIVE) && (synpred2_Date())) {s = 161;}

                        else if ( (LA12_99==SIX) && (synpred2_Date())) {s = 162;}

                        else if ( (LA12_99==SEVEN) && (synpred2_Date())) {s = 163;}

                        else if ( (LA12_99==EIGHT) && (synpred2_Date())) {s = 164;}

                        else if ( (LA12_99==NINE) && (synpred2_Date())) {s = 165;}

                        else if ( (LA12_99==TEN) && (synpred2_Date())) {s = 166;}

                        else if ( (LA12_99==ELEVEN) && (synpred2_Date())) {s = 167;}

                        else if ( (LA12_99==TWELVE) && (synpred2_Date())) {s = 168;}

                        else if ( (LA12_99==THIRTEEN) && (synpred2_Date())) {s = 169;}

                        else if ( (LA12_99==FOURTEEN) && (synpred2_Date())) {s = 170;}

                        else if ( (LA12_99==FIFTEEN) && (synpred2_Date())) {s = 171;}

                        else if ( (LA12_99==SIXTEEN) && (synpred2_Date())) {s = 172;}

                        else if ( (LA12_99==SEVENTEEN) && (synpred2_Date())) {s = 173;}

                        else if ( (LA12_99==EIGHTEEN) && (synpred2_Date())) {s = 174;}

                        else if ( (LA12_99==NINETEEN) && (synpred2_Date())) {s = 175;}

                        else if ( (LA12_99==TWENTY) && (synpred2_Date())) {s = 176;}

                        else if ( (LA12_99==THIRTY) && (synpred2_Date())) {s = 177;}

                        else if ( (LA12_99==FIRST) && (synpred2_Date())) {s = 178;}

                        else if ( (LA12_99==SECOND) && (synpred2_Date())) {s = 179;}

                        else if ( (LA12_99==THIRD) && (synpred2_Date())) {s = 180;}

                        else if ( (LA12_99==FOURTH) && (synpred2_Date())) {s = 181;}

                        else if ( (LA12_99==FIFTH) && (synpred2_Date())) {s = 182;}

                        else if ( (LA12_99==SIXTH) && (synpred2_Date())) {s = 183;}

                        else if ( (LA12_99==SEVENTH) && (synpred2_Date())) {s = 184;}

                        else if ( (LA12_99==EIGHTH) && (synpred2_Date())) {s = 185;}

                        else if ( (LA12_99==NINTH) && (synpred2_Date())) {s = 186;}

                        else if ( (LA12_99==TENTH) && (synpred2_Date())) {s = 187;}

                        else if ( (LA12_99==ELEVENTH) && (synpred2_Date())) {s = 188;}

                        else if ( (LA12_99==TWELFTH) && (synpred2_Date())) {s = 189;}

                        else if ( (LA12_99==THIRTEENTH) && (synpred2_Date())) {s = 190;}

                        else if ( (LA12_99==FOURTEENTH) && (synpred2_Date())) {s = 191;}

                        else if ( (LA12_99==FIFTEENTH) && (synpred2_Date())) {s = 192;}

                        else if ( (LA12_99==SIXTEENTH) && (synpred2_Date())) {s = 193;}

                        else if ( (LA12_99==SEVENTEENTH) && (synpred2_Date())) {s = 194;}

                        else if ( (LA12_99==EIGHTEENTH) && (synpred2_Date())) {s = 195;}

                        else if ( (LA12_99==NINETEENTH) && (synpred2_Date())) {s = 196;}

                        else if ( (LA12_99==TWENTIETH) && (synpred2_Date())) {s = 197;}

                        else if ( (LA12_99==TWENTY_FIRST) && (synpred2_Date())) {s = 198;}

                        else if ( (LA12_99==TWENTY_SECOND) && (synpred2_Date())) {s = 199;}

                        else if ( (LA12_99==TWENTY_THIRD) && (synpred2_Date())) {s = 200;}

                        else if ( (LA12_99==TWENTY_FOURTH) && (synpred2_Date())) {s = 201;}

                        else if ( (LA12_99==TWENTY_FIFTH) && (synpred2_Date())) {s = 202;}

                        else if ( (LA12_99==TWENTY_SIXTH) && (synpred2_Date())) {s = 203;}

                        else if ( (LA12_99==TWENTY_SEVENTH) && (synpred2_Date())) {s = 204;}

                        else if ( (LA12_99==TWENTY_EIGHTH) && (synpred2_Date())) {s = 205;}

                        else if ( (LA12_99==TWENTY_NINTH) && (synpred2_Date())) {s = 206;}

                        else if ( (LA12_99==THIRTIETH) && (synpred2_Date())) {s = 207;}

                        else if ( (LA12_99==THIRTY_FIRST) && (synpred2_Date())) {s = 208;}

                        else if ( (LA12_99==AT||(LA12_99>=NOON && LA12_99<=INT_00)) ) {s = 71;}

                         
                        input.seek(index12_99);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA12_76 = input.LA(1);

                         
                        int index12_76 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA12_76==DAY) ) {s = 139;}

                        else if ( (LA12_76==FOUR) ) {s = 78;}

                        else if ( (LA12_76==THREE) ) {s = 80;}

                        else if ( (LA12_76==OF) && (synpred2_Date())) {s = 140;}

                        else if ( (LA12_76==JANUARY) ) {s = 141;}

                        else if ( (LA12_76==FEBRUARY) ) {s = 142;}

                        else if ( (LA12_76==MARCH) ) {s = 143;}

                        else if ( (LA12_76==APRIL) ) {s = 144;}

                        else if ( (LA12_76==MAY) ) {s = 145;}

                        else if ( (LA12_76==JUNE) ) {s = 146;}

                        else if ( (LA12_76==JULY) ) {s = 147;}

                        else if ( (LA12_76==AUGUST) ) {s = 148;}

                        else if ( (LA12_76==SEPTEMBER) ) {s = 149;}

                        else if ( (LA12_76==OCTOBER) ) {s = 150;}

                        else if ( (LA12_76==NOVEMBER) ) {s = 151;}

                        else if ( (LA12_76==DECEMBER) ) {s = 152;}

                        else if ( (LA12_76==SIX) ) {s = 77;}

                        else if ( (LA12_76==SEVEN) ) {s = 79;}

                        else if ( (LA12_76==EIGHTH) && (synpred2_Date())) {s = 81;}

                        else if ( (LA12_76==SIXTH) && (synpred2_Date())) {s = 82;}

                        else if ( (LA12_76==EIGHT) ) {s = 86;}

                        else if ( (LA12_76==FIVE) ) {s = 83;}

                        else if ( (LA12_76==TWO) ) {s = 84;}

                        else if ( (LA12_76==FIRST) && (synpred2_Date())) {s = 85;}

                        else if ( (LA12_76==FIFTH) && (synpred2_Date())) {s = 88;}

                        else if ( (LA12_76==SEVENTH) && (synpred2_Date())) {s = 87;}

                        else if ( (LA12_76==YEAR||(LA12_76>=WEEK && LA12_76<=SATURDAY)) ) {s = 71;}

                        else if ( (LA12_76==ONE) ) {s = 90;}

                        else if ( (LA12_76==NINE) ) {s = 89;}

                        else if ( (LA12_76==FOURTH) && (synpred2_Date())) {s = 91;}

                        else if ( (LA12_76==THIRD) && (synpred2_Date())) {s = 92;}

                        else if ( (LA12_76==SECOND) && (synpred2_Date())) {s = 94;}

                        else if ( (LA12_76==NINTH) && (synpred2_Date())) {s = 93;}

                         
                        input.seek(index12_76);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA12_73 = input.LA(1);

                         
                        int index12_73 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA12_73==LAST) ) {s = 71;}

                        else if ( (LA12_73==JANUARY) && (synpred2_Date())) {s = 101;}

                        else if ( (LA12_73==FEBRUARY) && (synpred2_Date())) {s = 102;}

                        else if ( (LA12_73==MARCH) && (synpred2_Date())) {s = 103;}

                        else if ( (LA12_73==APRIL) && (synpred2_Date())) {s = 104;}

                        else if ( (LA12_73==MAY) && (synpred2_Date())) {s = 105;}

                        else if ( (LA12_73==JUNE) && (synpred2_Date())) {s = 106;}

                        else if ( (LA12_73==JULY) && (synpred2_Date())) {s = 107;}

                        else if ( (LA12_73==AUGUST) && (synpred2_Date())) {s = 108;}

                        else if ( (LA12_73==SEPTEMBER) && (synpred2_Date())) {s = 109;}

                        else if ( (LA12_73==OCTOBER) && (synpred2_Date())) {s = 110;}

                        else if ( (LA12_73==NOVEMBER) && (synpred2_Date())) {s = 111;}

                        else if ( (LA12_73==DECEMBER) && (synpred2_Date())) {s = 112;}

                        else if ( (LA12_73==DAY) ) {s = 113;}

                        else if ( (LA12_73==INT_1_TO_9) && (synpred2_Date())) {s = 114;}

                        else if ( (LA12_73==INT_01_TO_12) && (synpred2_Date())) {s = 115;}

                        else if ( (LA12_73==INT_13_TO_23) && (synpred2_Date())) {s = 116;}

                        else if ( (LA12_73==INT_24_TO_31) && (synpred2_Date())) {s = 117;}

                        else if ( (LA12_73==ONE) && (synpred2_Date())) {s = 118;}

                        else if ( (LA12_73==TWO) && (synpred2_Date())) {s = 119;}

                        else if ( (LA12_73==THREE) && (synpred2_Date())) {s = 120;}

                        else if ( (LA12_73==FOUR) && (synpred2_Date())) {s = 121;}

                        else if ( (LA12_73==FIVE) && (synpred2_Date())) {s = 122;}

                        else if ( (LA12_73==SIX) && (synpred2_Date())) {s = 123;}

                        else if ( (LA12_73==SEVEN) && (synpred2_Date())) {s = 124;}

                        else if ( (LA12_73==EIGHT) && (synpred2_Date())) {s = 125;}

                        else if ( (LA12_73==NINE) && (synpred2_Date())) {s = 126;}

                        else if ( (LA12_73==TEN) && (synpred2_Date())) {s = 127;}

                        else if ( (LA12_73==ELEVEN) && (synpred2_Date())) {s = 128;}

                        else if ( (LA12_73==TWELVE) && (synpred2_Date())) {s = 129;}

                        else if ( (LA12_73==THIRTEEN) && (synpred2_Date())) {s = 130;}

                        else if ( (LA12_73==FOURTEEN) && (synpred2_Date())) {s = 131;}

                        else if ( (LA12_73==FIFTEEN) && (synpred2_Date())) {s = 132;}

                        else if ( (LA12_73==SIXTEEN) && (synpred2_Date())) {s = 133;}

                        else if ( (LA12_73==SEVENTEEN) && (synpred2_Date())) {s = 134;}

                        else if ( (LA12_73==EIGHTEEN) && (synpred2_Date())) {s = 135;}

                        else if ( (LA12_73==NINETEEN) && (synpred2_Date())) {s = 136;}

                        else if ( (LA12_73==TWENTY) && (synpred2_Date())) {s = 137;}

                        else if ( (LA12_73==THIRTY) && (synpred2_Date())) {s = 138;}

                        else if ( (LA12_73==FIRST) && (synpred2_Date())) {s = 27;}

                        else if ( (LA12_73==SECOND) && (synpred2_Date())) {s = 28;}

                        else if ( (LA12_73==THIRD) && (synpred2_Date())) {s = 29;}

                        else if ( (LA12_73==FOURTH) && (synpred2_Date())) {s = 30;}

                        else if ( (LA12_73==FIFTH) && (synpred2_Date())) {s = 31;}

                        else if ( (LA12_73==SIXTH) && (synpred2_Date())) {s = 32;}

                        else if ( (LA12_73==SEVENTH) && (synpred2_Date())) {s = 33;}

                        else if ( (LA12_73==EIGHTH) && (synpred2_Date())) {s = 34;}

                        else if ( (LA12_73==NINTH) && (synpred2_Date())) {s = 35;}

                        else if ( (LA12_73==TENTH) && (synpred2_Date())) {s = 36;}

                        else if ( (LA12_73==ELEVENTH) && (synpred2_Date())) {s = 37;}

                        else if ( (LA12_73==TWELFTH) && (synpred2_Date())) {s = 38;}

                        else if ( (LA12_73==THIRTEENTH) && (synpred2_Date())) {s = 39;}

                        else if ( (LA12_73==FOURTEENTH) && (synpred2_Date())) {s = 40;}

                        else if ( (LA12_73==FIFTEENTH) && (synpred2_Date())) {s = 41;}

                        else if ( (LA12_73==SIXTEENTH) && (synpred2_Date())) {s = 42;}

                        else if ( (LA12_73==SEVENTEENTH) && (synpred2_Date())) {s = 43;}

                        else if ( (LA12_73==EIGHTEENTH) && (synpred2_Date())) {s = 44;}

                        else if ( (LA12_73==NINETEENTH) && (synpred2_Date())) {s = 45;}

                        else if ( (LA12_73==TWENTIETH) && (synpred2_Date())) {s = 46;}

                        else if ( (LA12_73==TWENTY_FIRST) && (synpred2_Date())) {s = 47;}

                        else if ( (LA12_73==TWENTY_SECOND) && (synpred2_Date())) {s = 48;}

                        else if ( (LA12_73==TWENTY_THIRD) && (synpred2_Date())) {s = 49;}

                        else if ( (LA12_73==TWENTY_FOURTH) && (synpred2_Date())) {s = 50;}

                        else if ( (LA12_73==TWENTY_FIFTH) && (synpred2_Date())) {s = 51;}

                        else if ( (LA12_73==TWENTY_SIXTH) && (synpred2_Date())) {s = 52;}

                        else if ( (LA12_73==TWENTY_SEVENTH) && (synpred2_Date())) {s = 53;}

                        else if ( (LA12_73==TWENTY_EIGHTH) && (synpred2_Date())) {s = 54;}

                        else if ( (LA12_73==TWENTY_NINTH) && (synpred2_Date())) {s = 55;}

                        else if ( (LA12_73==THIRTIETH) && (synpred2_Date())) {s = 56;}

                        else if ( (LA12_73==THIRTY_FIRST) && (synpred2_Date())) {s = 57;}

                         
                        input.seek(index12_73);
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
        "\u00d7\uffff";
    static final String DFA21_eofS =
        "\143\uffff\14\u00aa\70\141\10\uffff\22\141\2\uffff\2\141\22\uffff";
    static final String DFA21_minS =
        "\1\30\105\24\1\35\1\34\1\122\1\34\22\24\1\34\1\122\2\24\1\114\1"+
        "\uffff\105\24\1\35\1\24\1\25\1\uffff\1\24\1\25\1\122\1\25\22\24"+
        "\1\122\1\25\2\24\1\25\3\0\5\uffff\1\25\3\0\5\uffff";
    static final String DFA21_maxS =
        "\1\u0085\30\24\1\157\1\147\53\24\1\u0085\1\50\2\157\22\24\2\147"+
        "\2\24\1\u0085\1\uffff\1\24\43\26\1\157\1\147\37\26\1\50\2\121\1"+
        "\uffff\2\121\2\157\22\26\2\147\2\26\1\121\3\0\5\uffff\1\121\3\0"+
        "\5\uffff";
    static final String DFA21_acceptS =
        "\141\uffff\1\4\110\uffff\1\3\36\uffff\5\1\4\uffff\5\2";
    static final String DFA21_specialS =
        "\u00a8\uffff\1\3\1\15\1\uffff\1\14\1\12\1\uffff\1\4\23\uffff\1\13"+
        "\2\uffff\1\11\1\0\1\1\1\2\5\uffff\1\5\1\7\1\6\1\10\5\uffff}>";
    static final String[] DFA21_transitionS = {
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
            "\1\111\27\uffff\1\110\45\uffff\1\122\1\130\1\124\1\114\1\131"+
            "\1\121\1\112\1\120\1\127\14\uffff\1\115\1\133\1\117\1\113\1"+
            "\125\1\116\1\126\1\123\1\132",
            "\1\134\27\uffff\1\135\45\uffff\1\136\24\uffff\1\137",
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
            "\1\122\1\130\1\124\1\114\1\131\1\121\1\112\1\120\1\127\14\uffff"+
            "\1\115\1\133\1\117\1\113\1\125\1\116\1\126\1\123\1\132",
            "\1\142\1\143\1\144\1\145\1\146\1\147\1\150\1\151\1\152\1\153"+
            "\1\154\1\155\1\156\51\uffff\1\122\1\130\1\124\1\114\1\131\1"+
            "\121\1\112\1\120\1\127\14\uffff\1\115\1\133\1\117\1\113\1\125"+
            "\1\116\1\126\1\123\1\132",
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
            "\1\142\1\143\1\144\1\145\1\146\1\147\1\150\1\151\1\152\1\153"+
            "\1\154\1\155\1\156\51\uffff\1\136\24\uffff\1\137",
            "\1\136\24\uffff\1\137",
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
            "\1\u00a9\1\uffff\1\u00a8",
            "\1\u00a9\1\uffff\1\u00a8",
            "\1\u00a9\1\uffff\1\u00a8",
            "\1\u00a9\1\uffff\1\u00a8",
            "\1\u00a9\1\uffff\1\u00a8",
            "\1\u00a9\1\uffff\1\u00a8",
            "\1\u00a9\1\uffff\1\u00a8",
            "\1\u00a9\1\uffff\1\u00a8",
            "\1\u00a9\1\uffff\1\u00a8",
            "\1\u00a9\1\uffff\1\u00a8",
            "\1\u00a9\1\uffff\1\u00a8",
            "\1\u00a9\1\uffff\1\u00a8",
            "\1\u00ac\1\uffff\1\u00ab",
            "\1\u00ac\1\uffff\1\u00ab",
            "\1\u00ac\1\uffff\1\u00ab",
            "\1\u00ac\1\uffff\1\u00ab",
            "\1\u00ac\1\uffff\1\u00ab",
            "\1\u00ac\1\uffff\1\u00ab",
            "\1\u00ac\1\uffff\1\u00ab",
            "\1\u00ac\1\uffff\1\u00ab",
            "\1\u00ac\1\uffff\1\u00ab",
            "\1\u00ac\1\uffff\1\u00ab",
            "\1\u00ac\1\uffff\1\u00ab",
            "\1\u00ac\1\uffff\1\u00ab",
            "\1\u00ac\1\uffff\1\u00ab",
            "\1\u00ac\1\uffff\1\u00ab",
            "\1\u00ac\1\uffff\1\u00ab",
            "\1\u00ac\1\uffff\1\u00ab",
            "\1\u00ac\1\uffff\1\u00ab",
            "\1\u00ac\1\uffff\1\u00ab",
            "\1\u00ac\1\uffff\1\u00ab",
            "\1\u00ac\1\uffff\1\u00ab",
            "\1\u00ac\1\uffff\1\u00ab",
            "\1\u00ac\1\uffff\1\u00ab",
            "\1\u00ac\1\uffff\1\u00ab",
            "\1\u00ae\1\uffff\1\u00ab\25\uffff\1\u00ad\45\uffff\1\u00b4"+
            "\1\u00bf\1\u00bb\1\u00b5\1\u00af\1\u00b8\1\u00bd\1\u00b0\1\u00b6"+
            "\14\uffff\1\u00b3\1\u00bc\1\u00b2\1\u00be\1\u00b7\1\u00b1\1"+
            "\u00ba\1\u00c0\1\u00b9",
            "\1\u00c2\1\uffff\1\u00ab\25\uffff\1\u00c1\45\uffff\1\u00c4"+
            "\24\uffff\1\u00c3",
            "\1\u00ac\1\uffff\1\u00ab",
            "\1\u00ac\1\uffff\1\u00ab",
            "\1\u00ac\1\uffff\1\u00ab",
            "\1\u00ac\1\uffff\1\u00ab",
            "\1\u00ac\1\uffff\1\u00ab",
            "\1\u00ac\1\uffff\1\u00ab",
            "\1\u00ac\1\uffff\1\u00ab",
            "\1\u00ac\1\uffff\1\u00ab",
            "\1\u00ac\1\uffff\1\u00ab",
            "\1\u00ac\1\uffff\1\u00ab",
            "\1\u00ac\1\uffff\1\u00ab",
            "\1\u00ac\1\uffff\1\u00ab",
            "\1\u00ac\1\uffff\1\u00ab",
            "\1\u00ac\1\uffff\1\u00ab",
            "\1\u00ac\1\uffff\1\u00ab",
            "\1\u00ac\1\uffff\1\u00ab",
            "\1\u00ac\1\uffff\1\u00ab",
            "\1\u00ac\1\uffff\1\u00ab",
            "\1\u00ac\1\uffff\1\u00ab",
            "\1\u00ac\1\uffff\1\u00ab",
            "\1\u00ac\1\uffff\1\u00ab",
            "\1\u00ac\1\uffff\1\u00ab",
            "\1\u00ac\1\uffff\1\u00ab",
            "\1\u00ac\1\uffff\1\u00ab",
            "\1\u00ac\1\uffff\1\u00ab",
            "\1\u00ac\1\uffff\1\u00ab",
            "\1\u00ac\1\uffff\1\u00ab",
            "\1\u00ac\1\uffff\1\u00ab",
            "\1\u00ac\1\uffff\1\u00ab",
            "\1\u00ac\1\uffff\1\u00ab",
            "\1\u00ac\1\uffff\1\u00ab",
            "\1\143\1\144\1\145\1\146\1\147\1\150\1\151\1\152\1\153\1\154"+
            "\1\155\1\156",
            "\1\u00c5\1\u00aa\23\uffff\1\u00cd\1\u00c9\35\uffff\3\u00aa"+
            "\1\u00c6\1\u00aa\1\u00c7\1\u00c8\1\u00ca\1\u00cb\1\u00cc",
            "\1\u00aa\23\uffff\1\u00cd\1\u00c9\35\uffff\3\u00aa\1\u00c6"+
            "\1\u00aa\1\u00c7\1\u00c8\1\u00ca\1\u00cb\1\u00cc",
            "",
            "\1\u00ce\1\141\23\uffff\1\u00d6\1\u00d2\35\uffff\3\141\1\u00cf"+
            "\1\141\1\u00d0\1\u00d1\1\u00d3\1\u00d4\1\u00d5",
            "\1\141\23\uffff\1\u00d6\1\u00d2\35\uffff\3\141\1\u00cf\1\141"+
            "\1\u00d0\1\u00d1\1\u00d3\1\u00d4\1\u00d5",
            "\1\u00b4\1\u00bf\1\u00bb\1\u00b5\1\u00af\1\u00b8\1\u00bd\1"+
            "\u00b0\1\u00b6\14\uffff\1\u00b3\1\u00bc\1\u00b2\1\u00be\1\u00b7"+
            "\1\u00b1\1\u00ba\1\u00c0\1\u00b9",
            "\1\141\23\uffff\1\u00d6\1\u00d2\35\uffff\3\141\1\u00cf\1\141"+
            "\1\u00d0\1\u00d1\1\u00d3\1\u00d4\1\u00d5\1\u00b4\1\u00bf\1\u00bb"+
            "\1\u00b5\1\u00af\1\u00b8\1\u00bd\1\u00b0\1\u00b6\14\uffff\1"+
            "\u00b3\1\u00bc\1\u00b2\1\u00be\1\u00b7\1\u00b1\1\u00ba\1\u00c0"+
            "\1\u00b9",
            "\1\u00ac\1\uffff\1\u00ab",
            "\1\u00ac\1\uffff\1\u00ab",
            "\1\u00ac\1\uffff\1\u00ab",
            "\1\u00ac\1\uffff\1\u00ab",
            "\1\u00ac\1\uffff\1\u00ab",
            "\1\u00ac\1\uffff\1\u00ab",
            "\1\u00ac\1\uffff\1\u00ab",
            "\1\u00ac\1\uffff\1\u00ab",
            "\1\u00ac\1\uffff\1\u00ab",
            "\1\u00ac\1\uffff\1\u00ab",
            "\1\u00ac\1\uffff\1\u00ab",
            "\1\u00ac\1\uffff\1\u00ab",
            "\1\u00ac\1\uffff\1\u00ab",
            "\1\u00ac\1\uffff\1\u00ab",
            "\1\u00ac\1\uffff\1\u00ab",
            "\1\u00ac\1\uffff\1\u00ab",
            "\1\u00ac\1\uffff\1\u00ab",
            "\1\u00ac\1\uffff\1\u00ab",
            "\1\u00c4\24\uffff\1\u00c3",
            "\1\141\23\uffff\1\u00d6\1\u00d2\35\uffff\3\141\1\u00cf\1\141"+
            "\1\u00d0\1\u00d1\1\u00d3\1\u00d4\1\u00d5\1\u00c4\24\uffff\1"+
            "\u00c3",
            "\1\u00ac\1\uffff\1\u00ab",
            "\1\u00ac\1\uffff\1\u00ab",
            "\1\u00aa\23\uffff\1\u00cd\1\u00c9\35\uffff\3\u00aa\1\u00c6"+
            "\1\u00aa\1\u00c7\1\u00c8\1\u00ca\1\u00cb\1\u00cc",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "\1\141\23\uffff\1\u00d6\1\u00d2\35\uffff\3\141\1\u00cf\1\141"+
            "\1\u00d0\1\u00d1\1\u00d3\1\u00d4\1\u00d5",
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
            return "86:5: ( ( ( THE WHITE_SPACE )? relaxed_day_of_month WHITE_SPACE ( OF WHITE_SPACE )? relaxed_month relaxed_year )=> ( THE WHITE_SPACE )? relaxed_day_of_month WHITE_SPACE ( OF WHITE_SPACE )? relaxed_month relaxed_year | ( relaxed_month WHITE_SPACE relaxed_day_of_month relaxed_year )=> relaxed_month WHITE_SPACE relaxed_day_of_month relaxed_year | ( THE WHITE_SPACE )? relaxed_day_of_month WHITE_SPACE ( OF WHITE_SPACE )? relaxed_month | ( THE WHITE_SPACE )? relaxed_month WHITE_SPACE relaxed_day_of_month )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA21_198 = input.LA(1);

                         
                        int index21_198 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Date()) ) {s = 205;}

                        else if ( (true) ) {s = 170;}

                         
                        input.seek(index21_198);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA21_199 = input.LA(1);

                         
                        int index21_199 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Date()) ) {s = 205;}

                        else if ( (true) ) {s = 170;}

                         
                        input.seek(index21_199);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA21_200 = input.LA(1);

                         
                        int index21_200 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Date()) ) {s = 205;}

                        else if ( (true) ) {s = 170;}

                         
                        input.seek(index21_200);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA21_168 = input.LA(1);

                         
                        int index21_168 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA21_168==WHITE_SPACE) ) {s = 197;}

                        else if ( (LA21_168==AT||(LA21_168>=NOON && LA21_168<=INT_0)||LA21_168==INT_1_TO_9) ) {s = 170;}

                        else if ( (LA21_168==INT_00) ) {s = 198;}

                        else if ( (LA21_168==INT_01_TO_12) ) {s = 199;}

                        else if ( (LA21_168==INT_13_TO_23) ) {s = 200;}

                        else if ( (LA21_168==IN) && (synpred3_Date())) {s = 201;}

                        else if ( (LA21_168==INT_24_TO_31) && (synpred3_Date())) {s = 202;}

                        else if ( (LA21_168==INT_32_TO_59) && (synpred3_Date())) {s = 203;}

                        else if ( (LA21_168==INT_60_TO_99) && (synpred3_Date())) {s = 204;}

                        else if ( (LA21_168==SINGLE_QUOTE) && (synpred3_Date())) {s = 205;}

                         
                        input.seek(index21_168);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA21_174 = input.LA(1);

                         
                        int index21_174 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA21_174==EIGHTH) ) {s = 192;}

                        else if ( (LA21_174==SECOND) ) {s = 188;}

                        else if ( (LA21_174==ONE) ) {s = 180;}

                        else if ( (LA21_174==EIGHT) ) {s = 176;}

                        else if ( (LA21_174==FOUR) ) {s = 181;}

                        else if ( (LA21_174==AT||(LA21_174>=NOON && LA21_174<=INT_0)||LA21_174==INT_1_TO_9) ) {s = 97;}

                        else if ( (LA21_174==INT_00) ) {s = 207;}

                        else if ( (LA21_174==INT_01_TO_12) ) {s = 208;}

                        else if ( (LA21_174==INT_13_TO_23) ) {s = 209;}

                        else if ( (LA21_174==FIVE) ) {s = 175;}

                        else if ( (LA21_174==FIFTH) ) {s = 183;}

                        else if ( (LA21_174==SIXTH) ) {s = 177;}

                        else if ( (LA21_174==FIRST) ) {s = 179;}

                        else if ( (LA21_174==NINE) ) {s = 182;}

                        else if ( (LA21_174==SIX) ) {s = 184;}

                        else if ( (LA21_174==THIRD) ) {s = 178;}

                        else if ( (LA21_174==THREE) ) {s = 187;}

                        else if ( (LA21_174==NINTH) ) {s = 185;}

                        else if ( (LA21_174==IN) && (synpred4_Date())) {s = 210;}

                        else if ( (LA21_174==INT_24_TO_31) && (synpred4_Date())) {s = 211;}

                        else if ( (LA21_174==INT_32_TO_59) && (synpred4_Date())) {s = 212;}

                        else if ( (LA21_174==INT_60_TO_99) && (synpred4_Date())) {s = 213;}

                        else if ( (LA21_174==SEVENTH) ) {s = 186;}

                        else if ( (LA21_174==SINGLE_QUOTE) && (synpred4_Date())) {s = 214;}

                        else if ( (LA21_174==SEVEN) ) {s = 189;}

                        else if ( (LA21_174==FOURTH) ) {s = 190;}

                        else if ( (LA21_174==TWO) ) {s = 191;}

                         
                        input.seek(index21_174);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA21_206 = input.LA(1);

                         
                        int index21_206 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA21_206==IN) && (synpred4_Date())) {s = 210;}

                        else if ( (LA21_206==INT_00) ) {s = 207;}

                        else if ( (LA21_206==INT_01_TO_12) ) {s = 208;}

                        else if ( (LA21_206==INT_13_TO_23) ) {s = 209;}

                        else if ( (LA21_206==INT_24_TO_31) && (synpred4_Date())) {s = 211;}

                        else if ( (LA21_206==INT_32_TO_59) && (synpred4_Date())) {s = 212;}

                        else if ( (LA21_206==INT_60_TO_99) && (synpred4_Date())) {s = 213;}

                        else if ( (LA21_206==SINGLE_QUOTE) && (synpred4_Date())) {s = 214;}

                        else if ( (LA21_206==AT||(LA21_206>=NOON && LA21_206<=INT_0)||LA21_206==INT_1_TO_9) ) {s = 97;}

                         
                        input.seek(index21_206);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA21_208 = input.LA(1);

                         
                        int index21_208 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_Date()) ) {s = 214;}

                        else if ( (true) ) {s = 97;}

                         
                        input.seek(index21_208);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA21_207 = input.LA(1);

                         
                        int index21_207 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_Date()) ) {s = 214;}

                        else if ( (true) ) {s = 97;}

                         
                        input.seek(index21_207);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA21_209 = input.LA(1);

                         
                        int index21_209 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_Date()) ) {s = 214;}

                        else if ( (true) ) {s = 97;}

                         
                        input.seek(index21_209);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA21_197 = input.LA(1);

                         
                        int index21_197 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA21_197==IN) && (synpred3_Date())) {s = 201;}

                        else if ( (LA21_197==INT_00) ) {s = 198;}

                        else if ( (LA21_197==INT_01_TO_12) ) {s = 199;}

                        else if ( (LA21_197==INT_13_TO_23) ) {s = 200;}

                        else if ( (LA21_197==INT_24_TO_31) && (synpred3_Date())) {s = 202;}

                        else if ( (LA21_197==INT_32_TO_59) && (synpred3_Date())) {s = 203;}

                        else if ( (LA21_197==INT_60_TO_99) && (synpred3_Date())) {s = 204;}

                        else if ( (LA21_197==SINGLE_QUOTE) && (synpred3_Date())) {s = 205;}

                        else if ( (LA21_197==AT||(LA21_197>=NOON && LA21_197<=INT_0)||LA21_197==INT_1_TO_9) ) {s = 170;}

                         
                        input.seek(index21_197);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA21_172 = input.LA(1);

                         
                        int index21_172 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA21_172==IN) && (synpred4_Date())) {s = 210;}

                        else if ( (LA21_172==SINGLE_QUOTE) && (synpred4_Date())) {s = 214;}

                        else if ( (LA21_172==INT_00) ) {s = 207;}

                        else if ( (LA21_172==INT_01_TO_12) ) {s = 208;}

                        else if ( (LA21_172==INT_13_TO_23) ) {s = 209;}

                        else if ( (LA21_172==INT_24_TO_31) && (synpred4_Date())) {s = 211;}

                        else if ( (LA21_172==INT_32_TO_59) && (synpred4_Date())) {s = 212;}

                        else if ( (LA21_172==INT_60_TO_99) && (synpred4_Date())) {s = 213;}

                        else if ( (LA21_172==AT||(LA21_172>=NOON && LA21_172<=INT_0)||LA21_172==INT_1_TO_9) ) {s = 97;}

                         
                        input.seek(index21_172);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA21_194 = input.LA(1);

                         
                        int index21_194 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA21_194==IN) && (synpred4_Date())) {s = 210;}

                        else if ( (LA21_194==SINGLE_QUOTE) && (synpred4_Date())) {s = 214;}

                        else if ( (LA21_194==INT_00) ) {s = 207;}

                        else if ( (LA21_194==INT_01_TO_12) ) {s = 208;}

                        else if ( (LA21_194==INT_13_TO_23) ) {s = 209;}

                        else if ( (LA21_194==INT_24_TO_31) && (synpred4_Date())) {s = 211;}

                        else if ( (LA21_194==INT_32_TO_59) && (synpred4_Date())) {s = 212;}

                        else if ( (LA21_194==INT_60_TO_99) && (synpred4_Date())) {s = 213;}

                        else if ( (LA21_194==AT||(LA21_194>=NOON && LA21_194<=INT_0)||LA21_194==INT_1_TO_9) ) {s = 97;}

                        else if ( (LA21_194==FIRST) ) {s = 195;}

                        else if ( (LA21_194==ONE) ) {s = 196;}

                         
                        input.seek(index21_194);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA21_171 = input.LA(1);

                         
                        int index21_171 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA21_171==WHITE_SPACE) ) {s = 206;}

                        else if ( (LA21_171==AT||(LA21_171>=NOON && LA21_171<=INT_0)||LA21_171==INT_1_TO_9) ) {s = 97;}

                        else if ( (LA21_171==INT_00) ) {s = 207;}

                        else if ( (LA21_171==INT_01_TO_12) ) {s = 208;}

                        else if ( (LA21_171==INT_13_TO_23) ) {s = 209;}

                        else if ( (LA21_171==IN) && (synpred4_Date())) {s = 210;}

                        else if ( (LA21_171==INT_24_TO_31) && (synpred4_Date())) {s = 211;}

                        else if ( (LA21_171==INT_32_TO_59) && (synpred4_Date())) {s = 212;}

                        else if ( (LA21_171==INT_60_TO_99) && (synpred4_Date())) {s = 213;}

                        else if ( (LA21_171==SINGLE_QUOTE) && (synpred4_Date())) {s = 214;}

                         
                        input.seek(index21_171);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA21_169 = input.LA(1);

                         
                        int index21_169 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA21_169==AT||(LA21_169>=NOON && LA21_169<=INT_0)||LA21_169==INT_1_TO_9) ) {s = 170;}

                        else if ( (LA21_169==INT_00) ) {s = 198;}

                        else if ( (LA21_169==INT_01_TO_12) ) {s = 199;}

                        else if ( (LA21_169==INT_13_TO_23) ) {s = 200;}

                        else if ( (LA21_169==IN) && (synpred3_Date())) {s = 201;}

                        else if ( (LA21_169==SINGLE_QUOTE) && (synpred3_Date())) {s = 205;}

                        else if ( (LA21_169==INT_24_TO_31) && (synpred3_Date())) {s = 202;}

                        else if ( (LA21_169==INT_32_TO_59) && (synpred3_Date())) {s = 203;}

                        else if ( (LA21_169==INT_60_TO_99) && (synpred3_Date())) {s = 204;}

                         
                        input.seek(index21_169);
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
    static final String DFA25_eotS =
        "\22\uffff";
    static final String DFA25_eofS =
        "\5\uffff\6\13\7\uffff";
    static final String DFA25_minS =
        "\2\24\2\51\7\24\1\uffff\1\30\1\uffff\1\24\1\53\1\24\1\51";
    static final String DFA25_maxS =
        "\1\26\3\121\1\24\6\121\1\uffff\1\30\1\uffff\1\24\1\53\1\24\1\121";
    static final String DFA25_acceptS =
        "\13\uffff\1\1\1\uffff\1\2\4\uffff";
    static final String DFA25_specialS =
        "\22\uffff}>";
    static final String[] DFA25_transitionS = {
            "\1\2\1\uffff\1\1",
            "\1\3\24\uffff\1\13\1\4\40\uffff\1\5\1\uffff\1\6\1\7\1\10\1"+
            "\11\1\12",
            "\1\13\1\4\40\uffff\1\5\1\uffff\1\6\1\7\1\10\1\11\1\12",
            "\1\13\1\4\40\uffff\1\5\1\uffff\1\6\1\7\1\10\1\11\1\12",
            "\1\14",
            "\1\13\1\uffff\1\13\64\uffff\1\15\1\uffff\5\15",
            "\1\13\1\uffff\1\13\64\uffff\1\15\1\uffff\5\15",
            "\1\13\1\uffff\1\13\64\uffff\1\15\1\uffff\5\15",
            "\1\13\1\uffff\1\13\64\uffff\1\15\1\uffff\5\15",
            "\1\13\1\uffff\1\13\64\uffff\1\15\1\uffff\5\15",
            "\1\13\1\uffff\1\13\64\uffff\1\15\1\uffff\5\15",
            "",
            "\1\16",
            "",
            "\1\17",
            "\1\20",
            "\1\21",
            "\1\13\41\uffff\1\5\1\uffff\1\6\1\7\1\10\1\11\1\12"
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
            return "125:1: relaxed_year : ( relaxed_year_prefix ( SINGLE_QUOTE )? int_00_to_99_mandatory_prefix -> ^( YEAR_OF int_00_to_99_mandatory_prefix ) | relaxed_year_prefix int_four_digits -> ^( YEAR_OF int_four_digits ) );";
        }
    }
    static final String DFA34_eotS =
        "\111\uffff";
    static final String DFA34_eofS =
        "\60\uffff\27\2\2\uffff";
    static final String DFA34_minS =
        "\2\24\1\uffff\31\24\3\uffff\2\31\1\122\1\31\11\24\1\31\1\122\1\24"+
        "\1\uffff\27\24\1\25\1\uffff";
    static final String DFA34_maxS =
        "\1\146\1\24\1\uffff\27\24\1\132\1\122\3\uffff\2\77\2\132\11\24\2"+
        "\122\1\24\1\uffff\27\u0088\1\116\1\uffff";
    static final String DFA34_acceptS =
        "\2\uffff\1\1\31\uffff\1\3\1\5\1\6\20\uffff\1\2\30\uffff\1\4";
    static final String DFA34_specialS =
        "\111\uffff}>";
    static final String[] DFA34_transitionS = {
            "\1\35\3\uffff\1\35\1\34\3\uffff\14\34\1\uffff\1\2\1\34\2\uffff"+
            "\1\2\1\1\4\2\3\uffff\11\34\3\36\11\uffff\1\3\1\4\1\5\1\6\2\uffff"+
            "\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22"+
            "\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33",
            "\1\37",
            "",
            "\1\40",
            "\1\40",
            "\1\40",
            "\1\40",
            "\1\40",
            "\1\40",
            "\1\40",
            "\1\40",
            "\1\40",
            "\1\40",
            "\1\40",
            "\1\40",
            "\1\40",
            "\1\40",
            "\1\40",
            "\1\40",
            "\1\40",
            "\1\40",
            "\1\40",
            "\1\40",
            "\1\40",
            "\1\40",
            "\1\40",
            "\1\42\27\uffff\1\41\45\uffff\1\47\1\50\1\44\1\45\1\52\1\51"+
            "\1\43\1\53\1\46",
            "\1\54\27\uffff\1\55\45\uffff\1\56",
            "",
            "",
            "",
            "\1\57\3\uffff\14\57\2\uffff\1\57\2\uffff\1\2\1\uffff\4\2\3"+
            "\uffff\11\57",
            "\1\103\3\uffff\1\67\1\70\1\71\1\72\1\73\1\74\1\75\1\76\1\77"+
            "\1\100\1\101\1\102\2\uffff\1\106\13\uffff\1\104\1\105\1\60\1"+
            "\61\1\62\1\63\1\64\1\65\1\66",
            "\1\47\1\50\1\44\1\45\1\52\1\51\1\43\1\53\1\46",
            "\1\103\3\uffff\1\67\1\70\1\71\1\72\1\73\1\74\1\75\1\76\1\77"+
            "\1\100\1\101\1\102\2\uffff\1\106\13\uffff\1\104\1\105\1\60\1"+
            "\61\1\62\1\63\1\64\1\65\1\66\22\uffff\1\47\1\50\1\44\1\45\1"+
            "\52\1\51\1\43\1\53\1\46",
            "\1\40",
            "\1\40",
            "\1\40",
            "\1\40",
            "\1\40",
            "\1\40",
            "\1\40",
            "\1\40",
            "\1\40",
            "\1\103\3\uffff\1\67\1\70\1\71\1\72\1\73\1\74\1\75\1\76\1\77"+
            "\1\100\1\101\1\102\2\uffff\1\106\13\uffff\1\104\1\105\1\60\1"+
            "\61\1\62\1\63\1\64\1\65\1\66\22\uffff\1\56",
            "\1\56",
            "\1\40",
            "",
            "\1\107\1\uffff\1\2\161\uffff\1\2",
            "\1\107\1\uffff\1\2\161\uffff\1\2",
            "\1\107\1\uffff\1\2\161\uffff\1\2",
            "\1\107\1\uffff\1\2\161\uffff\1\2",
            "\1\107\1\uffff\1\2\161\uffff\1\2",
            "\1\107\1\uffff\1\2\161\uffff\1\2",
            "\1\107\1\uffff\1\2\161\uffff\1\2",
            "\1\107\1\uffff\1\2\161\uffff\1\2",
            "\1\107\1\uffff\1\2\161\uffff\1\2",
            "\1\107\1\uffff\1\2\161\uffff\1\2",
            "\1\107\1\uffff\1\2\161\uffff\1\2",
            "\1\107\1\uffff\1\2\161\uffff\1\2",
            "\1\107\1\uffff\1\2\161\uffff\1\2",
            "\1\107\1\uffff\1\2\161\uffff\1\2",
            "\1\107\1\uffff\1\2\161\uffff\1\2",
            "\1\107\1\uffff\1\2\161\uffff\1\2",
            "\1\107\1\uffff\1\2\161\uffff\1\2",
            "\1\107\1\uffff\1\2\161\uffff\1\2",
            "\1\107\1\uffff\1\2\161\uffff\1\2",
            "\1\107\1\uffff\1\2\161\uffff\1\2",
            "\1\107\1\uffff\1\2\161\uffff\1\2",
            "\1\107\1\uffff\1\2\161\uffff\1\2",
            "\1\107\1\uffff\1\2\161\uffff\1\2",
            "\1\2\36\uffff\1\110\1\uffff\1\110\21\uffff\7\2",
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
            return "173:1: relative_date : ( relative_prefix WHITE_SPACE relative_target ( 's' )? -> ^( RELATIVE_DATE ^( SEEK relative_prefix relative_target ) ) | implicit_prefix WHITE_SPACE relative_target -> ^( RELATIVE_DATE ^( SEEK implicit_prefix relative_target ) ) | relative_target -> ^( RELATIVE_DATE ^( SEEK DIRECTION[\">\"] SEEK_BY[\"by_day\"] INT[\"0\"] relative_target ) ) | spelled_or_int_01_to_31_optional_prefix WHITE_SPACE relative_target WHITE_SPACE relative_suffix -> ^( RELATIVE_DATE ^( SEEK relative_suffix spelled_or_int_01_to_31_optional_prefix relative_target ) ) | ( THE )? WHITE_SPACE LAST WHITE_SPACE day_of_week WHITE_SPACE IN WHITE_SPACE relaxed_month | named_relative_date );";
        }
    }
    static final String DFA73_eotS =
        "\45\uffff";
    static final String DFA73_eofS =
        "\24\uffff\1\36\1\44\17\uffff";
    static final String DFA73_minS =
        "\1\122\23\uffff\2\24\1\122\1\25\13\uffff\1\25\1\uffff";
    static final String DFA73_maxS =
        "\1\146\23\uffff\1\132\1\122\2\132\13\uffff\1\122\1\uffff";
    static final String DFA73_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1"+
        "\15\1\16\1\17\1\20\1\21\1\22\1\23\4\uffff\1\27\1\35\1\31\1\26\1"+
        "\25\1\32\1\24\1\33\1\34\1\30\1\37\1\uffff\1\36";
    static final String DFA73_specialS =
        "\45\uffff}>";
    static final String[] DFA73_transitionS = {
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
            "\1\27\1\uffff\1\36\25\uffff\1\26\45\uffff\1\34\1\33\1\30\1"+
            "\41\1\32\1\35\1\37\1\40\1\31",
            "\1\43\1\uffff\1\44\25\uffff\1\42\45\uffff\1\42",
            "\1\34\1\33\1\30\1\41\1\32\1\35\1\37\1\40\1\31",
            "\1\36\3\uffff\1\36\2\uffff\20\36\13\uffff\11\36\10\uffff\12"+
            "\36\1\34\1\33\1\30\1\41\1\32\1\35\1\37\1\40\1\31",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\44\3\uffff\1\44\2\uffff\20\44\13\uffff\11\44\10\uffff\12"+
            "\44\1\42",
            ""
    };

    static final short[] DFA73_eot = DFA.unpackEncodedString(DFA73_eotS);
    static final short[] DFA73_eof = DFA.unpackEncodedString(DFA73_eofS);
    static final char[] DFA73_min = DFA.unpackEncodedStringToUnsignedChars(DFA73_minS);
    static final char[] DFA73_max = DFA.unpackEncodedStringToUnsignedChars(DFA73_maxS);
    static final short[] DFA73_accept = DFA.unpackEncodedString(DFA73_acceptS);
    static final short[] DFA73_special = DFA.unpackEncodedString(DFA73_specialS);
    static final short[][] DFA73_transition;

    static {
        int numStates = DFA73_transitionS.length;
        DFA73_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA73_transition[i] = DFA.unpackEncodedString(DFA73_transitionS[i]);
        }
    }

    class DFA73 extends DFA {

        public DFA73(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 73;
            this.eot = DFA73_eot;
            this.eof = DFA73_eof;
            this.min = DFA73_min;
            this.max = DFA73_max;
            this.accept = DFA73_accept;
            this.special = DFA73_special;
            this.transition = DFA73_transition;
        }
        public String getDescription() {
            return "331:1: spelled_one_to_thirty_one : ( ONE -> INT[\"1\"] | TWO -> INT[\"2\"] | THREE -> INT[\"3\"] | FOUR -> INT[\"4\"] | FIVE -> INT[\"5\"] | SIX -> INT[\"6\"] | SEVEN -> INT[\"7\"] | EIGHT -> INT[\"8\"] | NINE -> INT[\"9\"] | TEN -> INT[\"10\"] | ELEVEN -> INT[\"11\"] | TWELVE -> INT[\"12\"] | THIRTEEN -> INT[\"13\"] | FOURTEEN -> INT[\"14\"] | FIFTEEN -> INT[\"15\"] | SIXTEEN -> INT[\"16\"] | SEVENTEEN -> INT[\"17\"] | EIGHTEEN -> INT[\"18\"] | NINETEEN -> INT[\"19\"] | TWENTY -> INT[\"20\"] | TWENTY ( DASH | WHITE_SPACE )? ONE -> INT[\"21\"] | TWENTY ( DASH | WHITE_SPACE )? TWO -> INT[\"22\"] | TWENTY ( DASH | WHITE_SPACE )? THREE -> INT[\"23\"] | TWENTY ( DASH | WHITE_SPACE )? FOUR -> INT[\"24\"] | TWENTY ( DASH | WHITE_SPACE )? FIVE -> INT[\"25\"] | TWENTY ( DASH | WHITE_SPACE )? SIX -> INT[\"26\"] | TWENTY ( DASH | WHITE_SPACE )? SEVEN -> INT[\"27\"] | TWENTY ( DASH | WHITE_SPACE )? EIGHT -> INT[\"28\"] | TWENTY ( DASH | WHITE_SPACE )? NINE -> INT[\"29\"] | THIRTY -> INT[\"30\"] | THIRTY ( DASH | WHITE_SPACE )? ONE -> INT[\"31\"] );";
        }
    }
    static final String DFA94_eotS =
        "\43\uffff";
    static final String DFA94_eofS =
        "\43\uffff";
    static final String DFA94_minS =
        "\1\145\25\uffff\1\24\12\uffff\2\147";
    static final String DFA94_maxS =
        "\1\u0085\25\uffff\1\157\12\uffff\2\157";
    static final String DFA94_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1"+
        "\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\uffff\1\26\1\27\1"+
        "\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37\2\uffff";
    static final String DFA94_specialS =
        "\43\uffff}>";
    static final String[] DFA94_transitionS = {
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

    static final short[] DFA94_eot = DFA.unpackEncodedString(DFA94_eotS);
    static final short[] DFA94_eof = DFA.unpackEncodedString(DFA94_eofS);
    static final char[] DFA94_min = DFA.unpackEncodedStringToUnsignedChars(DFA94_minS);
    static final char[] DFA94_max = DFA.unpackEncodedStringToUnsignedChars(DFA94_maxS);
    static final short[] DFA94_accept = DFA.unpackEncodedString(DFA94_acceptS);
    static final short[] DFA94_special = DFA.unpackEncodedString(DFA94_specialS);
    static final short[][] DFA94_transition;

    static {
        int numStates = DFA94_transitionS.length;
        DFA94_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA94_transition[i] = DFA.unpackEncodedString(DFA94_transitionS[i]);
        }
    }

    class DFA94 extends DFA {

        public DFA94(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 94;
            this.eot = DFA94_eot;
            this.eof = DFA94_eof;
            this.min = DFA94_min;
            this.max = DFA94_max;
            this.accept = DFA94_accept;
            this.special = DFA94_special;
            this.transition = DFA94_transition;
        }
        public String getDescription() {
            return "366:1: spelled_first_to_thirty_first : ( FIRST -> INT[\"1\"] | SECOND -> INT[\"2\"] | THIRD -> INT[\"3\"] | FOURTH -> INT[\"4\"] | FIFTH -> INT[\"5\"] | SIXTH -> INT[\"6\"] | SEVENTH -> INT[\"7\"] | EIGHTH -> INT[\"8\"] | NINTH -> INT[\"9\"] | TENTH -> INT[\"10\"] | ELEVENTH -> INT[\"11\"] | TWELFTH -> INT[\"12\"] | THIRTEENTH -> INT[\"13\"] | FOURTEENTH -> INT[\"14\"] | FIFTEENTH -> INT[\"15\"] | SIXTEENTH -> INT[\"16\"] | SEVENTEENTH -> INT[\"17\"] | EIGHTEENTH -> INT[\"18\"] | NINETEENTH -> INT[\"19\"] | TWENTIETH -> INT[\"20\"] | ( TWENTY_FIRST | ( TWENTY ( DASH | WHITE_SPACE )? FIRST ) ) -> INT[\"21\"] | ( TWENTY_SECOND | ( TWENTY ( DASH | WHITE_SPACE )? SECOND ) ) -> INT[\"22\"] | ( TWENTY_THIRD | ( TWENTY ( DASH | WHITE_SPACE )? THIRD ) ) -> INT[\"23\"] | ( TWENTY_FOURTH | ( TWENTY ( DASH | WHITE_SPACE )? FOURTH ) ) -> INT[\"24\"] | ( TWENTY_FIFTH | ( TWENTY ( DASH | WHITE_SPACE )? FIFTH ) ) -> INT[\"25\"] | ( TWENTY_SIXTH | ( TWENTY ( DASH | WHITE_SPACE )? SIXTH ) ) -> INT[\"26\"] | ( TWENTY_SEVENTH | ( TWENTY ( DASH | WHITE_SPACE )? SEVENTH ) ) -> INT[\"27\"] | ( TWENTY_EIGHTH | ( TWENTY ( DASH | WHITE_SPACE )? EIGHTH ) ) -> INT[\"28\"] | ( TWENTY_NINTH | ( TWENTY ( DASH | WHITE_SPACE )? NINTH ) ) -> INT[\"29\"] | THIRTIETH -> INT[\"30\"] | ( THIRTY_FIRST | ( THIRTY ( DASH | WHITE_SPACE )? FIRST ) ) -> INT[\"31\"] );";
        }
    }
 

    public static final BitSet FOLLOW_date_time_in_search130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_date_in_date_time197 = new BitSet(new long[]{0x0000000000500002L});
    public static final BitSet FOLLOW_date_time_separator_in_date_time200 = new BitSet(new long[]{0x0000000000000000L,0x0000000000007F00L});
    public static final BitSet FOLLOW_time_in_date_time202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_time_in_date_time221 = new BitSet(new long[]{0x0000000000500002L});
    public static final BitSet FOLLOW_time_date_separator_in_date_time224 = new BitSet(new long[]{0xFF8FCDFFE3100000L,0xFFFFFFFFFFFFF807L,0x000000000000003FL});
    public static final BitSet FOLLOW_date_in_date_time226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_date_time_separator261 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_AT_in_date_time_separator264 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_date_time_separator266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMMA_in_date_time_separator274 = new BitSet(new long[]{0x0000000000300002L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_date_time_separator276 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_AT_in_date_time_separator280 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_date_time_separator282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_time_date_separator299 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_ON_in_time_date_separator302 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_time_date_separator304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMMA_in_time_date_separator312 = new BitSet(new long[]{0x0000000000900002L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_time_date_separator314 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_ON_in_time_date_separator318 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_time_date_separator320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relaxed_date_in_date340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_formal_date_in_date346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relative_date_in_date352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_global_date_prefix_in_date358 = new BitSet(new long[]{0xFF8FCDFFE3100000L,0xFFFFFFFFFFFFF807L,0x000000000000003FL});
    public static final BitSet FOLLOW_date_in_date360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THE_in_global_date_prefix397 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_global_date_prefix399 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_DAY_in_global_date_prefix403 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_global_date_prefix405 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_prefix_direction_in_global_date_prefix407 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_global_date_prefix409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spelled_or_int_01_to_31_optional_prefix_in_global_date_prefix435 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_global_date_prefix437 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_DAY_in_global_date_prefix439 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_global_date_prefix441 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_prefix_direction_in_global_date_prefix443 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_global_date_prefix445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AFTER_in_prefix_direction476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BEFORE_in_prefix_direction488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THE_in_relaxed_date574 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_relaxed_date576 = new BitSet(new long[]{0x0000000001000000L,0xFFFFFFFFFFFCF000L,0x000000000000003FL});
    public static final BitSet FOLLOW_relaxed_day_of_month_in_relaxed_date580 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_relaxed_date582 = new BitSet(new long[]{0x000001FFF0000000L});
    public static final BitSet FOLLOW_OF_in_relaxed_date585 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_relaxed_date587 = new BitSet(new long[]{0x000001FFE0000000L});
    public static final BitSet FOLLOW_relaxed_month_in_relaxed_date591 = new BitSet(new long[]{0x0000000000500000L});
    public static final BitSet FOLLOW_relaxed_year_in_relaxed_date593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relaxed_month_in_relaxed_date627 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_relaxed_date629 = new BitSet(new long[]{0x0000000001000000L,0xFFFFFFFFFFFCF000L,0x000000000000003FL});
    public static final BitSet FOLLOW_relaxed_day_of_month_in_relaxed_date631 = new BitSet(new long[]{0x0000000000500000L});
    public static final BitSet FOLLOW_relaxed_year_in_relaxed_date633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THE_in_relaxed_date649 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_relaxed_date651 = new BitSet(new long[]{0x0000000001000000L,0xFFFFFFFFFFFCF000L,0x000000000000003FL});
    public static final BitSet FOLLOW_relaxed_day_of_month_in_relaxed_date655 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_relaxed_date657 = new BitSet(new long[]{0x000001FFF0000000L});
    public static final BitSet FOLLOW_OF_in_relaxed_date660 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_relaxed_date662 = new BitSet(new long[]{0x000001FFE0000000L});
    public static final BitSet FOLLOW_relaxed_month_in_relaxed_date666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THE_in_relaxed_date684 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_relaxed_date686 = new BitSet(new long[]{0x000001FFE0000000L});
    public static final BitSet FOLLOW_relaxed_month_in_relaxed_date690 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_relaxed_date692 = new BitSet(new long[]{0x0000000001000000L,0xFFFFFFFFFFFCF000L,0x000000000000003FL});
    public static final BitSet FOLLOW_relaxed_day_of_month_in_relaxed_date694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_JANUARY_in_relaxed_month726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FEBRUARY_in_relaxed_month743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MARCH_in_relaxed_month759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_APRIL_in_relaxed_month778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MAY_in_relaxed_month797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_JUNE_in_relaxed_month818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_JULY_in_relaxed_month838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AUGUST_in_relaxed_month858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEPTEMBER_in_relaxed_month876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OCTOBER_in_relaxed_month891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOVEMBER_in_relaxed_month908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DECEMBER_in_relaxed_month924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spelled_or_int_01_to_31_optional_prefix_in_relaxed_day_of_month949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spelled_first_to_thirty_first_in_relaxed_day_of_month976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relaxed_year_prefix_in_relaxed_year1006 = new BitSet(new long[]{0x0000020000000000L,0x000000000003E800L});
    public static final BitSet FOLLOW_SINGLE_QUOTE_in_relaxed_year1008 = new BitSet(new long[]{0x0000000000000000L,0x000000000003E800L});
    public static final BitSet FOLLOW_int_00_to_99_mandatory_prefix_in_relaxed_year1011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relaxed_year_prefix_in_relaxed_year1038 = new BitSet(new long[]{0x0000000000000000L,0x000000000003E800L});
    public static final BitSet FOLLOW_int_four_digits_in_relaxed_year1040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMMA_in_relaxed_year_prefix1070 = new BitSet(new long[]{0x0000040000100002L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_relaxed_year_prefix1072 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_relaxed_year_prefix1077 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_IN_in_relaxed_year_prefix1081 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_relaxed_year_prefix1083 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_THE_in_relaxed_year_prefix1085 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_relaxed_year_prefix1087 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_YEAR_in_relaxed_year_prefix1089 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_relaxed_year_prefix1091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_formal_year_four_digits_in_formal_date1114 = new BitSet(new long[]{0x0000300000000000L});
    public static final BitSet FOLLOW_formal_date_separator_in_formal_date1116 = new BitSet(new long[]{0x0000000000000000L,0x000000000003F800L});
    public static final BitSet FOLLOW_formal_month_of_year_in_formal_date1118 = new BitSet(new long[]{0x0000300000000000L});
    public static final BitSet FOLLOW_formal_date_separator_in_formal_date1120 = new BitSet(new long[]{0x0000000000000000L,0x000000000000F000L});
    public static final BitSet FOLLOW_formal_day_of_month_in_formal_date1122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_formal_month_of_year_in_formal_date1151 = new BitSet(new long[]{0x0000300000000000L});
    public static final BitSet FOLLOW_formal_date_separator_in_formal_date1153 = new BitSet(new long[]{0x0000000000000000L,0x000000000000F000L});
    public static final BitSet FOLLOW_formal_day_of_month_in_formal_date1155 = new BitSet(new long[]{0x0000300000000002L});
    public static final BitSet FOLLOW_formal_date_separator_in_formal_date1158 = new BitSet(new long[]{0x0000000000000000L,0x000000000003E800L});
    public static final BitSet FOLLOW_formal_year_in_formal_date1160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_int_01_to_12_optional_prefix_in_formal_month_of_year1194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_int_01_to_31_optional_prefix_in_formal_day_of_month1217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_formal_year_four_digits_in_formal_year1240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_int_00_to_99_mandatory_prefix_in_formal_year1246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_int_four_digits_in_formal_year_four_digits1269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_formal_date_separator0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relative_prefix_in_relative_date1318 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_relative_date1320 = new BitSet(new long[]{0xFF8009FFE2000000L});
    public static final BitSet FOLLOW_relative_target_in_relative_date1322 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_136_in_relative_date1324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_implicit_prefix_in_relative_date1358 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_relative_date1360 = new BitSet(new long[]{0xFF8009FFE2000000L});
    public static final BitSet FOLLOW_relative_target_in_relative_date1362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relative_target_in_relative_date1399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spelled_or_int_01_to_31_optional_prefix_in_relative_date1439 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_relative_date1441 = new BitSet(new long[]{0xFF8009FFE2000000L});
    public static final BitSet FOLLOW_relative_target_in_relative_date1443 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_relative_date1445 = new BitSet(new long[]{0x0050000000000000L});
    public static final BitSet FOLLOW_relative_suffix_in_relative_date1447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THE_in_relative_date1493 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_relative_date1496 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_LAST_in_relative_date1498 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_relative_date1500 = new BitSet(new long[]{0xFE00000000000000L});
    public static final BitSet FOLLOW_day_of_week_in_relative_date1502 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_relative_date1504 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_IN_in_relative_date1506 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_relative_date1508 = new BitSet(new long[]{0x000001FFE0000000L});
    public static final BitSet FOLLOW_relaxed_month_in_relative_date1510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_named_relative_date_in_relative_date1523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_day_of_week_in_relative_target1539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relaxed_month_in_relative_target1546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relative_date_span_in_relative_target1552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIS_in_implicit_prefix1567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIS_in_relative_prefix1594 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_relative_prefix1596 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_LAST_in_relative_prefix1600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIS_in_relative_prefix1622 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_relative_prefix1624 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_NEXT_in_relative_prefix1628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIS_in_relative_prefix1650 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_relative_prefix1652 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_PAST_in_relative_prefix1656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIS_in_relative_prefix1678 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_relative_prefix1680 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_COMING_in_relative_prefix1684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIS_in_relative_prefix1704 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_relative_prefix1706 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_UPCOMING_in_relative_prefix1710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IN_in_relative_prefix1728 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_relative_prefix1730 = new BitSet(new long[]{0x0000000000000000L,0x0000007FFFFCF000L});
    public static final BitSet FOLLOW_spelled_or_int_01_to_31_optional_prefix_in_relative_prefix1734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FROM_in_relative_suffix1766 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_relative_suffix1768 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_NOW_in_relative_suffix1770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AGO_in_relative_suffix1784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DAY_in_relative_date_span1824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WEEK_in_relative_date_span1837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MONTH_in_relative_date_span1849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_YEAR_in_relative_date_span1860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SUNDAY_in_day_of_week1880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MONDAY_in_day_of_week1898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TUESDAY_in_day_of_week1916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WEDNESDAY_in_day_of_week1933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THURSDAY_in_day_of_week1948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FRIDAY_in_day_of_week1964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SATURDAY_in_day_of_week1982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TODAY_in_named_relative_date2007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOMORROW_in_named_relative_date2039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_YESTERDAY_in_named_relative_date2068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_hours_in_time2108 = new BitSet(new long[]{0x0000000000000000L,0x000000000001E808L});
    public static final BitSet FOLLOW_COLON_in_time2110 = new BitSet(new long[]{0x0000000000000000L,0x000000000001E808L});
    public static final BitSet FOLLOW_minutes_in_time2113 = new BitSet(new long[]{0x0000000000100002L,0x00000000000000F0L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_time2116 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000F0L});
    public static final BitSet FOLLOW_meridian_indicator_in_time2120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MILITARY_HOUR_SUFFIX_in_time2125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HOUR_in_time2129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_hours_in_time2165 = new BitSet(new long[]{0x0000000000100002L,0x00000000000000C0L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_time2168 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_meridian_indicator_in_time2171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_named_time_in_time2210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_int_00_to_23_optional_prefix_in_hours2225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_int_00_to_59_mandatory_prefix_in_minutes2249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AM_in_meridian_indicator2276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PM_in_meridian_indicator2287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOON_in_named_time2307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MIDNIGHT_in_named_time2340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_0_in_int_00_to_23_optional_prefix2382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_00_in_int_00_to_23_optional_prefix2388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_1_TO_9_in_int_00_to_23_optional_prefix2394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_01_TO_12_in_int_00_to_23_optional_prefix2400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_13_TO_23_in_int_00_to_23_optional_prefix2406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_00_in_int_00_to_59_mandatory_prefix2428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_01_TO_12_in_int_00_to_59_mandatory_prefix2434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_13_TO_23_in_int_00_to_59_mandatory_prefix2440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_24_TO_31_in_int_00_to_59_mandatory_prefix2446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_32_TO_59_in_int_00_to_59_mandatory_prefix2452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_int_00_to_59_mandatory_prefix_in_int_00_to_99_mandatory_prefix2474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_60_TO_99_in_int_00_to_99_mandatory_prefix2480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_1_TO_9_in_int_01_to_12_optional_prefix2502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_01_TO_12_in_int_01_to_12_optional_prefix2508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_1_TO_9_in_int_01_to_31_optional_prefix2531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_01_TO_12_in_int_01_to_31_optional_prefix2537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_13_TO_23_in_int_01_to_31_optional_prefix2543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_24_TO_31_in_int_01_to_31_optional_prefix2549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_int_00_to_99_mandatory_prefix_in_int_four_digits2571 = new BitSet(new long[]{0x0000000000000000L,0x000000000003E800L});
    public static final BitSet FOLLOW_int_00_to_99_mandatory_prefix_in_int_four_digits2573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_int_01_to_31_optional_prefix_in_spelled_or_int_01_to_31_optional_prefix2601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spelled_one_to_thirty_one_in_spelled_or_int_01_to_31_optional_prefix2607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ONE_in_spelled_one_to_thirty_one2623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWO_in_spelled_one_to_thirty_one2641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THREE_in_spelled_one_to_thirty_one2659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOUR_in_spelled_one_to_thirty_one2675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FIVE_in_spelled_one_to_thirty_one2692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SIX_in_spelled_one_to_thirty_one2709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEVEN_in_spelled_one_to_thirty_one2727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EIGHT_in_spelled_one_to_thirty_one2743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NINE_in_spelled_one_to_thirty_one2759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEN_in_spelled_one_to_thirty_one2776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELEVEN_in_spelled_one_to_thirty_one2794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWELVE_in_spelled_one_to_thirty_one2809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIRTEEN_in_spelled_one_to_thirty_one2824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOURTEEN_in_spelled_one_to_thirty_one2837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FIFTEEN_in_spelled_one_to_thirty_one2850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SIXTEEN_in_spelled_one_to_thirty_one2864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEVENTEEN_in_spelled_one_to_thirty_one2878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EIGHTEEN_in_spelled_one_to_thirty_one2890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NINETEEN_in_spelled_one_to_thirty_one2903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_one_to_thirty_one2916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_one_to_thirty_one2931 = new BitSet(new long[]{0x0000100000100000L,0x0000000000040000L});
    public static final BitSet FOLLOW_DASH_in_spelled_one_to_thirty_one2934 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_spelled_one_to_thirty_one2938 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_ONE_in_spelled_one_to_thirty_one2942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_one_to_thirty_one2955 = new BitSet(new long[]{0x0000100000100000L,0x0000000000080000L});
    public static final BitSet FOLLOW_DASH_in_spelled_one_to_thirty_one2958 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_spelled_one_to_thirty_one2962 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_TWO_in_spelled_one_to_thirty_one2966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_one_to_thirty_one2979 = new BitSet(new long[]{0x0000100000100000L,0x0000000000100000L});
    public static final BitSet FOLLOW_DASH_in_spelled_one_to_thirty_one2982 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_spelled_one_to_thirty_one2986 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_THREE_in_spelled_one_to_thirty_one2990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_one_to_thirty_one3001 = new BitSet(new long[]{0x0000100000100000L,0x0000000000200000L});
    public static final BitSet FOLLOW_DASH_in_spelled_one_to_thirty_one3004 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_spelled_one_to_thirty_one3008 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_FOUR_in_spelled_one_to_thirty_one3012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_one_to_thirty_one3024 = new BitSet(new long[]{0x0000100000100000L,0x0000000000400000L});
    public static final BitSet FOLLOW_DASH_in_spelled_one_to_thirty_one3027 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_spelled_one_to_thirty_one3031 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_FIVE_in_spelled_one_to_thirty_one3035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_one_to_thirty_one3047 = new BitSet(new long[]{0x0000100000100000L,0x0000000000800000L});
    public static final BitSet FOLLOW_DASH_in_spelled_one_to_thirty_one3050 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_spelled_one_to_thirty_one3054 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_SIX_in_spelled_one_to_thirty_one3058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_one_to_thirty_one3071 = new BitSet(new long[]{0x0000100000100000L,0x0000000001000000L});
    public static final BitSet FOLLOW_DASH_in_spelled_one_to_thirty_one3074 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_spelled_one_to_thirty_one3078 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_SEVEN_in_spelled_one_to_thirty_one3082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_one_to_thirty_one3093 = new BitSet(new long[]{0x0000100000100000L,0x0000000002000000L});
    public static final BitSet FOLLOW_DASH_in_spelled_one_to_thirty_one3096 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_spelled_one_to_thirty_one3100 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_EIGHT_in_spelled_one_to_thirty_one3104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_one_to_thirty_one3115 = new BitSet(new long[]{0x0000100000100000L,0x0000000004000000L});
    public static final BitSet FOLLOW_DASH_in_spelled_one_to_thirty_one3118 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_spelled_one_to_thirty_one3122 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_NINE_in_spelled_one_to_thirty_one3126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIRTY_in_spelled_one_to_thirty_one3138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIRTY_in_spelled_one_to_thirty_one3177 = new BitSet(new long[]{0x0000100000100000L,0x0000000000040000L});
    public static final BitSet FOLLOW_DASH_in_spelled_one_to_thirty_one3180 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_spelled_one_to_thirty_one3184 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_ONE_in_spelled_one_to_thirty_one3188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FIRST_in_spelled_first_to_thirty_first3211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SECOND_in_spelled_first_to_thirty_first3228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIRD_in_spelled_first_to_thirty_first3244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOURTH_in_spelled_first_to_thirty_first3261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FIFTH_in_spelled_first_to_thirty_first3277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SIXTH_in_spelled_first_to_thirty_first3294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEVENTH_in_spelled_first_to_thirty_first3311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EIGHTH_in_spelled_first_to_thirty_first3326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NINTH_in_spelled_first_to_thirty_first3342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TENTH_in_spelled_first_to_thirty_first3359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELEVENTH_in_spelled_first_to_thirty_first3376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWELFTH_in_spelled_first_to_thirty_first3390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIRTEENTH_in_spelled_first_to_thirty_first3405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOURTEENTH_in_spelled_first_to_thirty_first3417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FIFTEENTH_in_spelled_first_to_thirty_first3429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SIXTEENTH_in_spelled_first_to_thirty_first3442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEVENTEENTH_in_spelled_first_to_thirty_first3455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EIGHTEENTH_in_spelled_first_to_thirty_first3466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NINETEENTH_in_spelled_first_to_thirty_first3478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTIETH_in_spelled_first_to_thirty_first3490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_FIRST_in_spelled_first_to_thirty_first3504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_first_to_thirty_first3511 = new BitSet(new long[]{0x0000100000100000L,0x0000008000000000L});
    public static final BitSet FOLLOW_DASH_in_spelled_first_to_thirty_first3514 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_spelled_first_to_thirty_first3518 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_FIRST_in_spelled_first_to_thirty_first3522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_SECOND_in_spelled_first_to_thirty_first3538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_first_to_thirty_first3544 = new BitSet(new long[]{0x0000100000100000L,0x0000010000000000L});
    public static final BitSet FOLLOW_DASH_in_spelled_first_to_thirty_first3547 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_spelled_first_to_thirty_first3551 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_SECOND_in_spelled_first_to_thirty_first3555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_THIRD_in_spelled_first_to_thirty_first3570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_first_to_thirty_first3577 = new BitSet(new long[]{0x0000100000100000L,0x0000020000000000L});
    public static final BitSet FOLLOW_DASH_in_spelled_first_to_thirty_first3580 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_spelled_first_to_thirty_first3584 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_THIRD_in_spelled_first_to_thirty_first3588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_FOURTH_in_spelled_first_to_thirty_first3604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_first_to_thirty_first3610 = new BitSet(new long[]{0x0000100000100000L,0x0000040000000000L});
    public static final BitSet FOLLOW_DASH_in_spelled_first_to_thirty_first3613 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_spelled_first_to_thirty_first3617 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_FOURTH_in_spelled_first_to_thirty_first3621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_FIFTH_in_spelled_first_to_thirty_first3636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_first_to_thirty_first3643 = new BitSet(new long[]{0x0000100000100000L,0x0000080000000000L});
    public static final BitSet FOLLOW_DASH_in_spelled_first_to_thirty_first3646 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_spelled_first_to_thirty_first3650 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_FIFTH_in_spelled_first_to_thirty_first3654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_SIXTH_in_spelled_first_to_thirty_first3670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_first_to_thirty_first3677 = new BitSet(new long[]{0x0000100000100000L,0x0000100000000000L});
    public static final BitSet FOLLOW_DASH_in_spelled_first_to_thirty_first3680 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_spelled_first_to_thirty_first3684 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_SIXTH_in_spelled_first_to_thirty_first3688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_SEVENTH_in_spelled_first_to_thirty_first3704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_first_to_thirty_first3709 = new BitSet(new long[]{0x0000100000100000L,0x0000200000000000L});
    public static final BitSet FOLLOW_DASH_in_spelled_first_to_thirty_first3712 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_spelled_first_to_thirty_first3716 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_SEVENTH_in_spelled_first_to_thirty_first3720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_EIGHTH_in_spelled_first_to_thirty_first3734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_first_to_thirty_first3740 = new BitSet(new long[]{0x0000100000100000L,0x0000400000000000L});
    public static final BitSet FOLLOW_DASH_in_spelled_first_to_thirty_first3743 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_spelled_first_to_thirty_first3747 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_EIGHTH_in_spelled_first_to_thirty_first3751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_NINTH_in_spelled_first_to_thirty_first3766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_first_to_thirty_first3773 = new BitSet(new long[]{0x0000100000100000L,0x0000800000000000L});
    public static final BitSet FOLLOW_DASH_in_spelled_first_to_thirty_first3776 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_spelled_first_to_thirty_first3780 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_NINTH_in_spelled_first_to_thirty_first3784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIRTIETH_in_spelled_first_to_thirty_first3799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIRTY_FIRST_in_spelled_first_to_thirty_first3859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIRTY_in_spelled_first_to_thirty_first3866 = new BitSet(new long[]{0x0000100000100000L,0x0000008000000000L});
    public static final BitSet FOLLOW_DASH_in_spelled_first_to_thirty_first3869 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_spelled_first_to_thirty_first3873 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_FIRST_in_spelled_first_to_thirty_first3877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_date_in_synpred1_Date178 = new BitSet(new long[]{0x0000000000500002L});
    public static final BitSet FOLLOW_date_time_separator_in_synpred1_Date181 = new BitSet(new long[]{0x0000000000000000L,0x0000000000007F00L});
    public static final BitSet FOLLOW_time_in_synpred1_Date183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relaxed_date_in_synpred2_Date336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THE_in_synpred3_Date542 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_synpred3_Date544 = new BitSet(new long[]{0x0000000001000000L,0xFFFFFFFFFFFCF000L,0x000000000000003FL});
    public static final BitSet FOLLOW_relaxed_day_of_month_in_synpred3_Date548 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_synpred3_Date550 = new BitSet(new long[]{0x000001FFF0000000L});
    public static final BitSet FOLLOW_OF_in_synpred3_Date553 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_synpred3_Date555 = new BitSet(new long[]{0x000001FFE0000000L});
    public static final BitSet FOLLOW_relaxed_month_in_synpred3_Date559 = new BitSet(new long[]{0x0000000000500000L});
    public static final BitSet FOLLOW_relaxed_year_in_synpred3_Date561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relaxed_month_in_synpred4_Date609 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_WHITE_SPACE_in_synpred4_Date611 = new BitSet(new long[]{0x0000000001000000L,0xFFFFFFFFFFFCF000L,0x000000000000003FL});
    public static final BitSet FOLLOW_relaxed_day_of_month_in_synpred4_Date613 = new BitSet(new long[]{0x0000000000500000L});
    public static final BitSet FOLLOW_relaxed_year_in_synpred4_Date615 = new BitSet(new long[]{0x0000000000000002L});

}