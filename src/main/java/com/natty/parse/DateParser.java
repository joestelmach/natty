// $ANTLR 3.1.3 Mar 17, 2009 19:23:44 /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g 2010-02-03 14:35:55
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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "INT", "HOURS", "MINUTES", "AM_PM", "SPAN", "MONTH_OF", "DAY_OF_WEEK", "DAY_OF_MONTH", "YEAR_OF", "SEEK_DIR", "SEEK_TYPE", "EXPLICIT_TIME", "EXPLICIT_DATE", "RELATIVE_DATE", "DATE_TIME", "AT", "COMMA", "ON", "TODAY", "TOMORROW", "YESTERDAY", "THE", "DAY", "AFTER", "BEFORE", "COLON", "MIDNIGHT", "NOON", "THIS", "LAST", "PAST", "NEXT", "COMING", "UPCOMING", "IN", "FROM_NOW", "AGO", "WEEK", "MONTH", "YEAR", "JANUARY", "FEBRUARY", "MARCH", "APRIL", "MAY", "JUNE", "JULY", "AUGUST", "SEPTEMBER", "OCTOBER", "NOVEMBER", "DECEMBER", "SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY", "DASH", "SLASH", "AM", "PM", "ONE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", "NINE", "TEN", "ELEVEN", "TWELVE", "THIRTEEN", "FOURTEEN", "FIFTEEN", "SIXTEEN", "SEVENTEEN", "EIGHTEEN", "NINETEEN", "TWENTY", "THIRTY", "FIRST", "SECOND", "THIRD", "FOURTH", "FIFTH", "SIXTH", "SEVENTH", "EIGHTH", "NINTH", "TENTH", "ELEVENTH", "TWELFTH", "THIRTEENTH", "FOURTEENTH", "FIFTEENTH", "SIXTEENTH", "SEVENTEENTH", "EIGHTEENTH", "NINETEENTH", "TWENTIETH", "TWENTY_FIRST", "TWENTY_SECOND", "TWENTY_THIRD", "TWENTY_FOURTH", "TWENTY_FIFTH", "TWENTY_SIXTH", "TWENTY_SEVENTH", "TWENTY_EIGHTH", "TWENTY_NINTH", "THIRTIETH", "THIRTY_FIRST", "THREE_DIGIT", "FOUR_DIGIT", "TWO_ZEROS", "PREFIXED_ONE_TO_NINE", "ONE_TO_NINE", "TEN_TO_TWELVE", "ONE_ZERO", "THIRTEEN_TO_TWENTY_THREE", "TWENTY_FOUR_TO_THIRTY_ONE", "THIRTY_TWO_TO_FIFTY_NINE", "SIXTY_TO_NINETY_NINE", "DIGIT", "WHITE_SPACE", "'\\''"
    };
    public static final int NINETEEN=85;
    public static final int WEEK=41;
    public static final int SEPTEMBER=52;
    public static final int THIRTEEN_TO_TWENTY_THREE=126;
    public static final int WEDNESDAY=59;
    public static final int TWENTY_EIGHTH=115;
    public static final int TWENTY=86;
    public static final int FROM_NOW=39;
    public static final int APRIL=47;
    public static final int JULY=50;
    public static final int COMING=36;
    public static final int NINETEENTH=106;
    public static final int OCTOBER=53;
    public static final int DAY=26;
    public static final int ONE=67;
    public static final int MIDNIGHT=30;
    public static final int EOF=-1;
    public static final int MARCH=46;
    public static final int MONTH=42;
    public static final int PAST=34;
    public static final int SEVENTEEN=83;
    public static final int DATE_TIME=18;
    public static final int AM_PM=7;
    public static final int SIXTY_TO_NINETY_NINE=129;
    public static final int TWENTY_SEVENTH=114;
    public static final int TWENTY_FIFTH=112;
    public static final int EIGHTEENTH=105;
    public static final int SPAN=8;
    public static final int SEEK_DIR=13;
    public static final int THIS=32;
    public static final int THIRTIETH=117;
    public static final int NOON=31;
    public static final int LAST=33;
    public static final int EIGHTEEN=84;
    public static final int TWENTY_FOUR_TO_THIRTY_ONE=127;
    public static final int TOMORROW=23;
    public static final int RELATIVE_DATE=17;
    public static final int ONE_TO_NINE=123;
    public static final int FOUR_DIGIT=120;
    public static final int FIFTEENTH=102;
    public static final int FOURTH=91;
    public static final int TODAY=22;
    public static final int SECOND=89;
    public static final int NOVEMBER=54;
    public static final int SATURDAY=62;
    public static final int FOUR=70;
    public static final int SEVENTH=94;
    public static final int TEN=76;
    public static final int ON=21;
    public static final int FEBRUARY=45;
    public static final int MONDAY=57;
    public static final int DAY_OF_WEEK=10;
    public static final int SUNDAY=56;
    public static final int SEVEN=73;
    public static final int ELEVEN=77;
    public static final int THIRTEEN=79;
    public static final int INT=4;
    public static final int EXPLICIT_DATE=16;
    public static final int JUNE=49;
    public static final int UPCOMING=37;
    public static final int SIX=72;
    public static final int FIFTH=92;
    public static final int TWENTY_NINTH=116;
    public static final int THURSDAY=60;
    public static final int DECEMBER=55;
    public static final int AUGUST=51;
    public static final int PM=66;
    public static final int EXPLICIT_TIME=15;
    public static final int TUESDAY=58;
    public static final int T__132=132;
    public static final int THIRTY_TWO_TO_FIFTY_NINE=128;
    public static final int EIGHTH=95;
    public static final int THIRD=90;
    public static final int YEAR=43;
    public static final int THE=25;
    public static final int TENTH=97;
    public static final int MAY=48;
    public static final int TWENTY_FOURTH=111;
    public static final int THREE_DIGIT=119;
    public static final int MONTH_OF=9;
    public static final int WHITE_SPACE=131;
    public static final int SEEK_TYPE=14;
    public static final int PREFIXED_ONE_TO_NINE=122;
    public static final int FRIDAY=61;
    public static final int EIGHT=74;
    public static final int TWENTY_SIXTH=113;
    public static final int AT=19;
    public static final int SLASH=64;
    public static final int IN=38;
    public static final int NINTH=96;
    public static final int COMMA=20;
    public static final int FIVE=71;
    public static final int THIRTY=87;
    public static final int TWENTIETH=107;
    public static final int TWENTY_SECOND=109;
    public static final int NEXT=35;
    public static final int TWO_ZEROS=121;
    public static final int DIGIT=130;
    public static final int AM=65;
    public static final int DASH=63;
    public static final int FOURTEENTH=101;
    public static final int SIXTEEN=82;
    public static final int YEAR_OF=12;
    public static final int ONE_ZERO=125;
    public static final int TEN_TO_TWELVE=124;
    public static final int TWELVE=78;
    public static final int AGO=40;
    public static final int ELEVENTH=98;
    public static final int BEFORE=28;
    public static final int AFTER=27;
    public static final int TWO=68;
    public static final int SIXTEENTH=103;
    public static final int JANUARY=44;
    public static final int THIRTEENTH=100;
    public static final int COLON=29;
    public static final int MINUTES=6;
    public static final int DAY_OF_MONTH=11;
    public static final int FIFTEEN=81;
    public static final int TWELFTH=99;
    public static final int NINE=75;
    public static final int SIXTH=93;
    public static final int TWENTY_FIRST=108;
    public static final int THREE=69;
    public static final int FOURTEEN=80;
    public static final int TWENTY_THIRD=110;
    public static final int YESTERDAY=24;
    public static final int SEVENTEENTH=104;
    public static final int HOURS=5;
    public static final int THIRTY_FIRST=118;
    public static final int FIRST=88;

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


    public static class datetime_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "datetime"
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:28:1: datetime : ( explicit_datetime )=> explicit_datetime ;
    public final DateParser.datetime_return datetime() throws RecognitionException {
        DateParser.datetime_return retval = new DateParser.datetime_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        DateParser.explicit_datetime_return explicit_datetime1 = null;



        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:29:3: ( ( explicit_datetime )=> explicit_datetime )
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:29:5: ( explicit_datetime )=> explicit_datetime
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_explicit_datetime_in_datetime131);
            explicit_datetime1=explicit_datetime();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, explicit_datetime1.getTree());

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
    // $ANTLR end "datetime"

    public static class relative_datetime_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "relative_datetime"
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:33:1: relative_datetime : ( ( date_prefix )? relative_date ( date_time_sep )? time | time time_date_sep ( date_prefix )? relative_date | ( date_prefix )? relative_date );
    public final DateParser.relative_datetime_return relative_datetime() throws RecognitionException {
        DateParser.relative_datetime_return retval = new DateParser.relative_datetime_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        DateParser.date_prefix_return date_prefix2 = null;

        DateParser.relative_date_return relative_date3 = null;

        DateParser.date_time_sep_return date_time_sep4 = null;

        DateParser.time_return time5 = null;

        DateParser.time_return time6 = null;

        DateParser.time_date_sep_return time_date_sep7 = null;

        DateParser.date_prefix_return date_prefix8 = null;

        DateParser.relative_date_return relative_date9 = null;

        DateParser.date_prefix_return date_prefix10 = null;

        DateParser.relative_date_return relative_date11 = null;



        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:34:3: ( ( date_prefix )? relative_date ( date_time_sep )? time | time time_date_sep ( date_prefix )? relative_date | ( date_prefix )? relative_date )
            int alt5=3;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:34:5: ( date_prefix )? relative_date ( date_time_sep )? time
                    {
                    root_0 = (Object)adaptor.nil();

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:34:5: ( date_prefix )?
                    int alt1=2;
                    alt1 = dfa1.predict(input);
                    switch (alt1) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:34:5: date_prefix
                            {
                            pushFollow(FOLLOW_date_prefix_in_relative_datetime148);
                            date_prefix2=date_prefix();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, date_prefix2.getTree());

                            }
                            break;

                    }

                    pushFollow(FOLLOW_relative_date_in_relative_datetime151);
                    relative_date3=relative_date();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, relative_date3.getTree());
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:34:32: ( date_time_sep )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( ((LA2_0>=AT && LA2_0<=COMMA)) ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:34:32: date_time_sep
                            {
                            pushFollow(FOLLOW_date_time_sep_in_relative_datetime153);
                            date_time_sep4=date_time_sep();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, date_time_sep4.getTree());

                            }
                            break;

                    }

                    pushFollow(FOLLOW_time_in_relative_datetime156);
                    time5=time();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, time5.getTree());

                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:35:5: time time_date_sep ( date_prefix )? relative_date
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_time_in_relative_datetime162);
                    time6=time();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, time6.getTree());
                    pushFollow(FOLLOW_time_date_sep_in_relative_datetime164);
                    time_date_sep7=time_date_sep();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, time_date_sep7.getTree());
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:35:24: ( date_prefix )?
                    int alt3=2;
                    alt3 = dfa3.predict(input);
                    switch (alt3) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:35:24: date_prefix
                            {
                            pushFollow(FOLLOW_date_prefix_in_relative_datetime166);
                            date_prefix8=date_prefix();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, date_prefix8.getTree());

                            }
                            break;

                    }

                    pushFollow(FOLLOW_relative_date_in_relative_datetime169);
                    relative_date9=relative_date();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, relative_date9.getTree());

                    }
                    break;
                case 3 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:36:5: ( date_prefix )? relative_date
                    {
                    root_0 = (Object)adaptor.nil();

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:36:5: ( date_prefix )?
                    int alt4=2;
                    alt4 = dfa4.predict(input);
                    switch (alt4) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:36:5: date_prefix
                            {
                            pushFollow(FOLLOW_date_prefix_in_relative_datetime175);
                            date_prefix10=date_prefix();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, date_prefix10.getTree());

                            }
                            break;

                    }

                    pushFollow(FOLLOW_relative_date_in_relative_datetime178);
                    relative_date11=relative_date();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, relative_date11.getTree());

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
    // $ANTLR end "relative_datetime"

    public static class explicit_datetime_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "explicit_datetime"
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:39:1: explicit_datetime : day_of_month time ;
    public final DateParser.explicit_datetime_return explicit_datetime() throws RecognitionException {
        DateParser.explicit_datetime_return retval = new DateParser.explicit_datetime_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        DateParser.day_of_month_return day_of_month12 = null;

        DateParser.time_return time13 = null;



        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:40:3: ( day_of_month time )
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:40:5: day_of_month time
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_day_of_month_in_explicit_datetime194);
            day_of_month12=day_of_month();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, day_of_month12.getTree());
            pushFollow(FOLLOW_time_in_explicit_datetime196);
            time13=time();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, time13.getTree());

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
    // $ANTLR end "explicit_datetime"

    public static class date_time_sep_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "date_time_sep"
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:47:1: date_time_sep : ( AT | COMMA );
    public final DateParser.date_time_sep_return date_time_sep() throws RecognitionException {
        DateParser.date_time_sep_return retval = new DateParser.date_time_sep_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set14=null;

        Object set14_tree=null;

        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:48:3: ( AT | COMMA )
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:
            {
            root_0 = (Object)adaptor.nil();

            set14=(Token)input.LT(1);
            if ( (input.LA(1)>=AT && input.LA(1)<=COMMA) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set14));
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
    // $ANTLR end "date_time_sep"

    public static class time_date_sep_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "time_date_sep"
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:52:1: time_date_sep : ON ;
    public final DateParser.time_date_sep_return time_date_sep() throws RecognitionException {
        DateParser.time_date_sep_return retval = new DateParser.time_date_sep_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ON15=null;

        Object ON15_tree=null;

        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:53:3: ( ON )
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:53:5: ON
            {
            root_0 = (Object)adaptor.nil();

            ON15=(Token)match(input,ON,FOLLOW_ON_in_time_date_sep242); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ON15_tree = (Object)adaptor.create(ON15);
            adaptor.addChild(root_0, ON15_tree);
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
    // $ANTLR end "time_date_sep"

    public static class relative_date_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "relative_date"
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:56:1: relative_date : ( named_relative_date | modifiable_target -> ^( RELATIVE_DATE SEEK_DIR[\">\"] SEEK_TYPE[\"by_day\"] INT[\"1\"] modifiable_target ) | target_prefix modifiable_target -> ^( RELATIVE_DATE target_prefix modifiable_target ) | spelled_or_int_1_to_31 modifiable_target target_suffix -> ^( RELATIVE_DATE target_suffix spelled_or_int_1_to_31 modifiable_target ) );
    public final DateParser.relative_date_return relative_date() throws RecognitionException {
        DateParser.relative_date_return retval = new DateParser.relative_date_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        DateParser.named_relative_date_return named_relative_date16 = null;

        DateParser.modifiable_target_return modifiable_target17 = null;

        DateParser.target_prefix_return target_prefix18 = null;

        DateParser.modifiable_target_return modifiable_target19 = null;

        DateParser.spelled_or_int_1_to_31_return spelled_or_int_1_to_3120 = null;

        DateParser.modifiable_target_return modifiable_target21 = null;

        DateParser.target_suffix_return target_suffix22 = null;


        RewriteRuleSubtreeStream stream_spelled_or_int_1_to_31=new RewriteRuleSubtreeStream(adaptor,"rule spelled_or_int_1_to_31");
        RewriteRuleSubtreeStream stream_target_suffix=new RewriteRuleSubtreeStream(adaptor,"rule target_suffix");
        RewriteRuleSubtreeStream stream_modifiable_target=new RewriteRuleSubtreeStream(adaptor,"rule modifiable_target");
        RewriteRuleSubtreeStream stream_target_prefix=new RewriteRuleSubtreeStream(adaptor,"rule target_prefix");
        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:58:3: ( named_relative_date | modifiable_target -> ^( RELATIVE_DATE SEEK_DIR[\">\"] SEEK_TYPE[\"by_day\"] INT[\"1\"] modifiable_target ) | target_prefix modifiable_target -> ^( RELATIVE_DATE target_prefix modifiable_target ) | spelled_or_int_1_to_31 modifiable_target target_suffix -> ^( RELATIVE_DATE target_suffix spelled_or_int_1_to_31 modifiable_target ) )
            int alt6=4;
            alt6 = dfa6.predict(input);
            switch (alt6) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:58:5: named_relative_date
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_named_relative_date_in_relative_date258);
                    named_relative_date16=named_relative_date();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, named_relative_date16.getTree());

                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:61:5: modifiable_target
                    {
                    pushFollow(FOLLOW_modifiable_target_in_relative_date270);
                    modifiable_target17=modifiable_target();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_modifiable_target.add(modifiable_target17.getTree());


                    // AST REWRITE
                    // elements: modifiable_target
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 62:5: -> ^( RELATIVE_DATE SEEK_DIR[\">\"] SEEK_TYPE[\"by_day\"] INT[\"1\"] modifiable_target )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:62:8: ^( RELATIVE_DATE SEEK_DIR[\">\"] SEEK_TYPE[\"by_day\"] INT[\"1\"] modifiable_target )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(RELATIVE_DATE, "RELATIVE_DATE"), root_1);

                        adaptor.addChild(root_1, (Object)adaptor.create(SEEK_DIR, ">"));
                        adaptor.addChild(root_1, (Object)adaptor.create(SEEK_TYPE, "by_day"));
                        adaptor.addChild(root_1, (Object)adaptor.create(INT, "1"));
                        adaptor.addChild(root_1, stream_modifiable_target.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:65:5: target_prefix modifiable_target
                    {
                    pushFollow(FOLLOW_target_prefix_in_relative_date304);
                    target_prefix18=target_prefix();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_target_prefix.add(target_prefix18.getTree());
                    pushFollow(FOLLOW_modifiable_target_in_relative_date306);
                    modifiable_target19=modifiable_target();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_modifiable_target.add(modifiable_target19.getTree());


                    // AST REWRITE
                    // elements: target_prefix, modifiable_target
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 66:5: -> ^( RELATIVE_DATE target_prefix modifiable_target )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:66:8: ^( RELATIVE_DATE target_prefix modifiable_target )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(RELATIVE_DATE, "RELATIVE_DATE"), root_1);

                        adaptor.addChild(root_1, stream_target_prefix.nextTree());
                        adaptor.addChild(root_1, stream_modifiable_target.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:69:5: spelled_or_int_1_to_31 modifiable_target target_suffix
                    {
                    pushFollow(FOLLOW_spelled_or_int_1_to_31_in_relative_date335);
                    spelled_or_int_1_to_3120=spelled_or_int_1_to_31();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_spelled_or_int_1_to_31.add(spelled_or_int_1_to_3120.getTree());
                    pushFollow(FOLLOW_modifiable_target_in_relative_date337);
                    modifiable_target21=modifiable_target();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_modifiable_target.add(modifiable_target21.getTree());
                    pushFollow(FOLLOW_target_suffix_in_relative_date339);
                    target_suffix22=target_suffix();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_target_suffix.add(target_suffix22.getTree());


                    // AST REWRITE
                    // elements: modifiable_target, spelled_or_int_1_to_31, target_suffix
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 70:5: -> ^( RELATIVE_DATE target_suffix spelled_or_int_1_to_31 modifiable_target )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:70:8: ^( RELATIVE_DATE target_suffix spelled_or_int_1_to_31 modifiable_target )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(RELATIVE_DATE, "RELATIVE_DATE"), root_1);

                        adaptor.addChild(root_1, stream_target_suffix.nextTree());
                        adaptor.addChild(root_1, stream_spelled_or_int_1_to_31.nextTree());
                        adaptor.addChild(root_1, stream_modifiable_target.nextTree());

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

    public static class named_relative_date_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "named_relative_date"
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:73:1: named_relative_date : ( TODAY -> ^( RELATIVE_DATE SEEK_DIR[\">\"] INT[\"0\"] ) | TOMORROW -> ^( RELATIVE_DATE SEEK_DIR[\">\"] INT[\"1\"] ) | YESTERDAY -> ^( RELATIVE_DATE SEEK_DIR[\"<\"] INT[\"1\"] ) );
    public final DateParser.named_relative_date_return named_relative_date() throws RecognitionException {
        DateParser.named_relative_date_return retval = new DateParser.named_relative_date_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TODAY23=null;
        Token TOMORROW24=null;
        Token YESTERDAY25=null;

        Object TODAY23_tree=null;
        Object TOMORROW24_tree=null;
        Object YESTERDAY25_tree=null;
        RewriteRuleTokenStream stream_TODAY=new RewriteRuleTokenStream(adaptor,"token TODAY");
        RewriteRuleTokenStream stream_YESTERDAY=new RewriteRuleTokenStream(adaptor,"token YESTERDAY");
        RewriteRuleTokenStream stream_TOMORROW=new RewriteRuleTokenStream(adaptor,"token TOMORROW");

        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:74:3: ( TODAY -> ^( RELATIVE_DATE SEEK_DIR[\">\"] INT[\"0\"] ) | TOMORROW -> ^( RELATIVE_DATE SEEK_DIR[\">\"] INT[\"1\"] ) | YESTERDAY -> ^( RELATIVE_DATE SEEK_DIR[\"<\"] INT[\"1\"] ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case TODAY:
                {
                alt7=1;
                }
                break;
            case TOMORROW:
                {
                alt7=2;
                }
                break;
            case YESTERDAY:
                {
                alt7=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:74:5: TODAY
                    {
                    TODAY23=(Token)match(input,TODAY,FOLLOW_TODAY_in_named_relative_date371); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TODAY.add(TODAY23);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 74:15: -> ^( RELATIVE_DATE SEEK_DIR[\">\"] INT[\"0\"] )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:74:18: ^( RELATIVE_DATE SEEK_DIR[\">\"] INT[\"0\"] )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(RELATIVE_DATE, "RELATIVE_DATE"), root_1);

                        adaptor.addChild(root_1, (Object)adaptor.create(SEEK_DIR, ">"));
                        adaptor.addChild(root_1, (Object)adaptor.create(INT, "0"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:75:5: TOMORROW
                    {
                    TOMORROW24=(Token)match(input,TOMORROW,FOLLOW_TOMORROW_in_named_relative_date393); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TOMORROW.add(TOMORROW24);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 75:15: -> ^( RELATIVE_DATE SEEK_DIR[\">\"] INT[\"1\"] )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:75:18: ^( RELATIVE_DATE SEEK_DIR[\">\"] INT[\"1\"] )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(RELATIVE_DATE, "RELATIVE_DATE"), root_1);

                        adaptor.addChild(root_1, (Object)adaptor.create(SEEK_DIR, ">"));
                        adaptor.addChild(root_1, (Object)adaptor.create(INT, "1"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:76:5: YESTERDAY
                    {
                    YESTERDAY25=(Token)match(input,YESTERDAY,FOLLOW_YESTERDAY_in_named_relative_date412); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_YESTERDAY.add(YESTERDAY25);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 76:15: -> ^( RELATIVE_DATE SEEK_DIR[\"<\"] INT[\"1\"] )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:76:18: ^( RELATIVE_DATE SEEK_DIR[\"<\"] INT[\"1\"] )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(RELATIVE_DATE, "RELATIVE_DATE"), root_1);

                        adaptor.addChild(root_1, (Object)adaptor.create(SEEK_DIR, "<"));
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

    public static class formal_explicit_date_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "formal_explicit_date"
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:79:1: formal_explicit_date : ( int_4_digits date_separator int_1_to_12 date_separator int_1_to_31 -> ^( EXPLICIT_DATE ^( MONTH_OF int_1_to_12 ) ^( DAY_OF_MONTH int_1_to_31 ) ^( YEAR_OF int_4_digits ) ) | int_1_to_12 date_separator int_1_to_31 ( date_separator int_up_to_4_digits )? -> ^( EXPLICIT_DATE ^( MONTH_OF int_1_to_31 ) ^( DAY_OF_MONTH int_1_to_31 ) ^( YEAR_OF ( int_up_to_4_digits )? ) ) );
    public final DateParser.formal_explicit_date_return formal_explicit_date() throws RecognitionException {
        DateParser.formal_explicit_date_return retval = new DateParser.formal_explicit_date_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        DateParser.int_4_digits_return int_4_digits26 = null;

        DateParser.date_separator_return date_separator27 = null;

        DateParser.int_1_to_12_return int_1_to_1228 = null;

        DateParser.date_separator_return date_separator29 = null;

        DateParser.int_1_to_31_return int_1_to_3130 = null;

        DateParser.int_1_to_12_return int_1_to_1231 = null;

        DateParser.date_separator_return date_separator32 = null;

        DateParser.int_1_to_31_return int_1_to_3133 = null;

        DateParser.date_separator_return date_separator34 = null;

        DateParser.int_up_to_4_digits_return int_up_to_4_digits35 = null;


        RewriteRuleSubtreeStream stream_int_1_to_31=new RewriteRuleSubtreeStream(adaptor,"rule int_1_to_31");
        RewriteRuleSubtreeStream stream_int_up_to_4_digits=new RewriteRuleSubtreeStream(adaptor,"rule int_up_to_4_digits");
        RewriteRuleSubtreeStream stream_int_4_digits=new RewriteRuleSubtreeStream(adaptor,"rule int_4_digits");
        RewriteRuleSubtreeStream stream_date_separator=new RewriteRuleSubtreeStream(adaptor,"rule date_separator");
        RewriteRuleSubtreeStream stream_int_1_to_12=new RewriteRuleSubtreeStream(adaptor,"rule int_1_to_12");
        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:81:3: ( int_4_digits date_separator int_1_to_12 date_separator int_1_to_31 -> ^( EXPLICIT_DATE ^( MONTH_OF int_1_to_12 ) ^( DAY_OF_MONTH int_1_to_31 ) ^( YEAR_OF int_4_digits ) ) | int_1_to_12 date_separator int_1_to_31 ( date_separator int_up_to_4_digits )? -> ^( EXPLICIT_DATE ^( MONTH_OF int_1_to_31 ) ^( DAY_OF_MONTH int_1_to_31 ) ^( YEAR_OF ( int_up_to_4_digits )? ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==FOUR_DIGIT) ) {
                alt9=1;
            }
            else if ( ((LA9_0>=TWO_ZEROS && LA9_0<=TEN_TO_TWELVE)) ) {
                alt9=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:81:5: int_4_digits date_separator int_1_to_12 date_separator int_1_to_31
                    {
                    pushFollow(FOLLOW_int_4_digits_in_formal_explicit_date442);
                    int_4_digits26=int_4_digits();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_int_4_digits.add(int_4_digits26.getTree());
                    pushFollow(FOLLOW_date_separator_in_formal_explicit_date444);
                    date_separator27=date_separator();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_date_separator.add(date_separator27.getTree());
                    pushFollow(FOLLOW_int_1_to_12_in_formal_explicit_date446);
                    int_1_to_1228=int_1_to_12();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_int_1_to_12.add(int_1_to_1228.getTree());
                    pushFollow(FOLLOW_date_separator_in_formal_explicit_date448);
                    date_separator29=date_separator();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_date_separator.add(date_separator29.getTree());
                    pushFollow(FOLLOW_int_1_to_31_in_formal_explicit_date450);
                    int_1_to_3130=int_1_to_31();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_int_1_to_31.add(int_1_to_3130.getTree());


                    // AST REWRITE
                    // elements: int_4_digits, int_1_to_31, int_1_to_12
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 82:5: -> ^( EXPLICIT_DATE ^( MONTH_OF int_1_to_12 ) ^( DAY_OF_MONTH int_1_to_31 ) ^( YEAR_OF int_4_digits ) )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:82:8: ^( EXPLICIT_DATE ^( MONTH_OF int_1_to_12 ) ^( DAY_OF_MONTH int_1_to_31 ) ^( YEAR_OF int_4_digits ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPLICIT_DATE, "EXPLICIT_DATE"), root_1);

                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:82:24: ^( MONTH_OF int_1_to_12 )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(MONTH_OF, "MONTH_OF"), root_2);

                        adaptor.addChild(root_2, stream_int_1_to_12.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:82:48: ^( DAY_OF_MONTH int_1_to_31 )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(DAY_OF_MONTH, "DAY_OF_MONTH"), root_2);

                        adaptor.addChild(root_2, stream_int_1_to_31.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:82:76: ^( YEAR_OF int_4_digits )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(YEAR_OF, "YEAR_OF"), root_2);

                        adaptor.addChild(root_2, stream_int_4_digits.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:85:5: int_1_to_12 date_separator int_1_to_31 ( date_separator int_up_to_4_digits )?
                    {
                    pushFollow(FOLLOW_int_1_to_12_in_formal_explicit_date489);
                    int_1_to_1231=int_1_to_12();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_int_1_to_12.add(int_1_to_1231.getTree());
                    pushFollow(FOLLOW_date_separator_in_formal_explicit_date491);
                    date_separator32=date_separator();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_date_separator.add(date_separator32.getTree());
                    pushFollow(FOLLOW_int_1_to_31_in_formal_explicit_date493);
                    int_1_to_3133=int_1_to_31();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_int_1_to_31.add(int_1_to_3133.getTree());
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:85:44: ( date_separator int_up_to_4_digits )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( ((LA8_0>=DASH && LA8_0<=SLASH)) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:85:45: date_separator int_up_to_4_digits
                            {
                            pushFollow(FOLLOW_date_separator_in_formal_explicit_date496);
                            date_separator34=date_separator();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_date_separator.add(date_separator34.getTree());
                            pushFollow(FOLLOW_int_up_to_4_digits_in_formal_explicit_date498);
                            int_up_to_4_digits35=int_up_to_4_digits();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_int_up_to_4_digits.add(int_up_to_4_digits35.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: int_up_to_4_digits, int_1_to_31, int_1_to_31
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 86:5: -> ^( EXPLICIT_DATE ^( MONTH_OF int_1_to_31 ) ^( DAY_OF_MONTH int_1_to_31 ) ^( YEAR_OF ( int_up_to_4_digits )? ) )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:86:8: ^( EXPLICIT_DATE ^( MONTH_OF int_1_to_31 ) ^( DAY_OF_MONTH int_1_to_31 ) ^( YEAR_OF ( int_up_to_4_digits )? ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPLICIT_DATE, "EXPLICIT_DATE"), root_1);

                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:86:24: ^( MONTH_OF int_1_to_31 )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(MONTH_OF, "MONTH_OF"), root_2);

                        adaptor.addChild(root_2, stream_int_1_to_31.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:86:48: ^( DAY_OF_MONTH int_1_to_31 )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(DAY_OF_MONTH, "DAY_OF_MONTH"), root_2);

                        adaptor.addChild(root_2, stream_int_1_to_31.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:86:76: ^( YEAR_OF ( int_up_to_4_digits )? )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(YEAR_OF, "YEAR_OF"), root_2);

                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:86:86: ( int_up_to_4_digits )?
                        if ( stream_int_up_to_4_digits.hasNext() ) {
                            adaptor.addChild(root_2, stream_int_up_to_4_digits.nextTree());

                        }
                        stream_int_up_to_4_digits.reset();

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
    // $ANTLR end "formal_explicit_date"

    public static class date_prefix_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "date_prefix"
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:90:1: date_prefix : ( ( THE )? DAY AFTER -> SEEK_DIR[\">\"] INT[\"1\"] | spelled_or_int_1_to_31 DAY AFTER -> SEEK_DIR[\">\"] spelled_or_int_1_to_31 | ( THE )? DAY BEFORE -> SEEK_DIR[\"<\"] INT[\"1\"] | spelled_or_int_1_to_31 DAY BEFORE -> SEEK_DIR[\"<\"] spelled_or_int_1_to_31 );
    public final DateParser.date_prefix_return date_prefix() throws RecognitionException {
        DateParser.date_prefix_return retval = new DateParser.date_prefix_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token THE36=null;
        Token DAY37=null;
        Token AFTER38=null;
        Token DAY40=null;
        Token AFTER41=null;
        Token THE42=null;
        Token DAY43=null;
        Token BEFORE44=null;
        Token DAY46=null;
        Token BEFORE47=null;
        DateParser.spelled_or_int_1_to_31_return spelled_or_int_1_to_3139 = null;

        DateParser.spelled_or_int_1_to_31_return spelled_or_int_1_to_3145 = null;


        Object THE36_tree=null;
        Object DAY37_tree=null;
        Object AFTER38_tree=null;
        Object DAY40_tree=null;
        Object AFTER41_tree=null;
        Object THE42_tree=null;
        Object DAY43_tree=null;
        Object BEFORE44_tree=null;
        Object DAY46_tree=null;
        Object BEFORE47_tree=null;
        RewriteRuleTokenStream stream_BEFORE=new RewriteRuleTokenStream(adaptor,"token BEFORE");
        RewriteRuleTokenStream stream_DAY=new RewriteRuleTokenStream(adaptor,"token DAY");
        RewriteRuleTokenStream stream_AFTER=new RewriteRuleTokenStream(adaptor,"token AFTER");
        RewriteRuleTokenStream stream_THE=new RewriteRuleTokenStream(adaptor,"token THE");
        RewriteRuleSubtreeStream stream_spelled_or_int_1_to_31=new RewriteRuleSubtreeStream(adaptor,"rule spelled_or_int_1_to_31");
        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:91:3: ( ( THE )? DAY AFTER -> SEEK_DIR[\">\"] INT[\"1\"] | spelled_or_int_1_to_31 DAY AFTER -> SEEK_DIR[\">\"] spelled_or_int_1_to_31 | ( THE )? DAY BEFORE -> SEEK_DIR[\"<\"] INT[\"1\"] | spelled_or_int_1_to_31 DAY BEFORE -> SEEK_DIR[\"<\"] spelled_or_int_1_to_31 )
            int alt12=4;
            alt12 = dfa12.predict(input);
            switch (alt12) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:91:5: ( THE )? DAY AFTER
                    {
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:91:5: ( THE )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==THE) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:91:5: THE
                            {
                            THE36=(Token)match(input,THE,FOLLOW_THE_in_date_prefix547); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_THE.add(THE36);


                            }
                            break;

                    }

                    DAY37=(Token)match(input,DAY,FOLLOW_DAY_in_date_prefix550); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DAY.add(DAY37);

                    AFTER38=(Token)match(input,AFTER,FOLLOW_AFTER_in_date_prefix552); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AFTER.add(AFTER38);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 91:39: -> SEEK_DIR[\">\"] INT[\"1\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(SEEK_DIR, ">"));
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "1"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:92:5: spelled_or_int_1_to_31 DAY AFTER
                    {
                    pushFollow(FOLLOW_spelled_or_int_1_to_31_in_date_prefix585);
                    spelled_or_int_1_to_3139=spelled_or_int_1_to_31();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_spelled_or_int_1_to_31.add(spelled_or_int_1_to_3139.getTree());
                    DAY40=(Token)match(input,DAY,FOLLOW_DAY_in_date_prefix587); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DAY.add(DAY40);

                    AFTER41=(Token)match(input,AFTER,FOLLOW_AFTER_in_date_prefix589); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AFTER.add(AFTER41);



                    // AST REWRITE
                    // elements: spelled_or_int_1_to_31
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 92:39: -> SEEK_DIR[\">\"] spelled_or_int_1_to_31
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(SEEK_DIR, ">"));
                        adaptor.addChild(root_0, stream_spelled_or_int_1_to_31.nextTree());

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:93:5: ( THE )? DAY BEFORE
                    {
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:93:5: ( THE )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==THE) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:93:5: THE
                            {
                            THE42=(Token)match(input,THE,FOLLOW_THE_in_date_prefix603); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_THE.add(THE42);


                            }
                            break;

                    }

                    DAY43=(Token)match(input,DAY,FOLLOW_DAY_in_date_prefix606); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DAY.add(DAY43);

                    BEFORE44=(Token)match(input,BEFORE,FOLLOW_BEFORE_in_date_prefix608); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_BEFORE.add(BEFORE44);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 93:39: -> SEEK_DIR[\"<\"] INT[\"1\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(SEEK_DIR, "<"));
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "1"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:94:5: spelled_or_int_1_to_31 DAY BEFORE
                    {
                    pushFollow(FOLLOW_spelled_or_int_1_to_31_in_date_prefix640);
                    spelled_or_int_1_to_3145=spelled_or_int_1_to_31();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_spelled_or_int_1_to_31.add(spelled_or_int_1_to_3145.getTree());
                    DAY46=(Token)match(input,DAY,FOLLOW_DAY_in_date_prefix642); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DAY.add(DAY46);

                    BEFORE47=(Token)match(input,BEFORE,FOLLOW_BEFORE_in_date_prefix644); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_BEFORE.add(BEFORE47);



                    // AST REWRITE
                    // elements: spelled_or_int_1_to_31
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 94:39: -> SEEK_DIR[\"<\"] spelled_or_int_1_to_31
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(SEEK_DIR, "<"));
                        adaptor.addChild(root_0, stream_spelled_or_int_1_to_31.nextTree());

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
    // $ANTLR end "date_prefix"

    public static class time_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "time"
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:97:1: time : COLON ;
    public final DateParser.time_return time() throws RecognitionException {
        DateParser.time_return retval = new DateParser.time_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token COLON48=null;

        Object COLON48_tree=null;

        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:98:3: ( COLON )
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:98:5: COLON
            {
            root_0 = (Object)adaptor.nil();

            COLON48=(Token)match(input,COLON,FOLLOW_COLON_in_time667); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            COLON48_tree = (Object)adaptor.create(COLON48);
            adaptor.addChild(root_0, COLON48_tree);
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
    // $ANTLR end "time"

    public static class time_identifier_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "time_identifier"
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:106:1: time_identifier : ( MIDNIGHT -> ^( EXPLICIT_TIME ^( HOURS INT[\"12\"] ) AM_PM[\"am\"] ) | NOON -> ^( EXPLICIT_TIME ^( HOURS INT[\"12\"] ) AM_PM[\"pm\"] ) );
    public final DateParser.time_identifier_return time_identifier() throws RecognitionException {
        DateParser.time_identifier_return retval = new DateParser.time_identifier_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token MIDNIGHT49=null;
        Token NOON50=null;

        Object MIDNIGHT49_tree=null;
        Object NOON50_tree=null;
        RewriteRuleTokenStream stream_NOON=new RewriteRuleTokenStream(adaptor,"token NOON");
        RewriteRuleTokenStream stream_MIDNIGHT=new RewriteRuleTokenStream(adaptor,"token MIDNIGHT");

        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:107:3: ( MIDNIGHT -> ^( EXPLICIT_TIME ^( HOURS INT[\"12\"] ) AM_PM[\"am\"] ) | NOON -> ^( EXPLICIT_TIME ^( HOURS INT[\"12\"] ) AM_PM[\"pm\"] ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==MIDNIGHT) ) {
                alt13=1;
            }
            else if ( (LA13_0==NOON) ) {
                alt13=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:107:5: MIDNIGHT
                    {
                    MIDNIGHT49=(Token)match(input,MIDNIGHT,FOLLOW_MIDNIGHT_in_time_identifier698); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_MIDNIGHT.add(MIDNIGHT49);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 107:14: -> ^( EXPLICIT_TIME ^( HOURS INT[\"12\"] ) AM_PM[\"am\"] )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:107:17: ^( EXPLICIT_TIME ^( HOURS INT[\"12\"] ) AM_PM[\"am\"] )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPLICIT_TIME, "EXPLICIT_TIME"), root_1);

                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:107:33: ^( HOURS INT[\"12\"] )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(HOURS, "HOURS"), root_2);

                        adaptor.addChild(root_2, (Object)adaptor.create(INT, "12"));

                        adaptor.addChild(root_1, root_2);
                        }
                        adaptor.addChild(root_1, (Object)adaptor.create(AM_PM, "am"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:108:5: NOON
                    {
                    NOON50=(Token)match(input,NOON,FOLLOW_NOON_in_time_identifier720); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NOON.add(NOON50);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 108:14: -> ^( EXPLICIT_TIME ^( HOURS INT[\"12\"] ) AM_PM[\"pm\"] )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:108:17: ^( EXPLICIT_TIME ^( HOURS INT[\"12\"] ) AM_PM[\"pm\"] )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPLICIT_TIME, "EXPLICIT_TIME"), root_1);

                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:108:33: ^( HOURS INT[\"12\"] )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(HOURS, "HOURS"), root_2);

                        adaptor.addChild(root_2, (Object)adaptor.create(INT, "12"));

                        adaptor.addChild(root_1, root_2);
                        }
                        adaptor.addChild(root_1, (Object)adaptor.create(AM_PM, "pm"));

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
    // $ANTLR end "time_identifier"

    public static class target_prefix_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "target_prefix"
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:112:1: target_prefix : ( THIS -> SEEK_DIR[\">\"] SEEK_TYPE[\"by_day\"] INT[\"1\"] | ( THIS )? LAST -> SEEK_DIR[\"<\"] SEEK_TYPE[\"by_week\"] INT[\"1\"] | ( THIS )? PAST -> SEEK_DIR[\"<\"] SEEK_TYPE[\"by_day\"] INT[\"1\"] | ( THIS )? NEXT -> SEEK_DIR[\">\"] SEEK_TYPE[\"by_week\"] INT[\"1\"] | ( THIS )? COMING -> SEEK_DIR[\">\"] SEEK_TYPE[\"by_day\"] INT[\"1\"] | ( THIS )? UPCOMING -> SEEK_DIR[\">\"] SEEK_TYPE[\"by_day\"] INT[\"1\"] | ( IN )? spelled_or_int_1_to_31 -> SEEK_DIR[\">\"] SEEK_TYPE[\"by_day\"] spelled_or_int_1_to_31 );
    public final DateParser.target_prefix_return target_prefix() throws RecognitionException {
        DateParser.target_prefix_return retval = new DateParser.target_prefix_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token THIS51=null;
        Token THIS52=null;
        Token LAST53=null;
        Token THIS54=null;
        Token PAST55=null;
        Token THIS56=null;
        Token NEXT57=null;
        Token THIS58=null;
        Token COMING59=null;
        Token THIS60=null;
        Token UPCOMING61=null;
        Token IN62=null;
        DateParser.spelled_or_int_1_to_31_return spelled_or_int_1_to_3163 = null;


        Object THIS51_tree=null;
        Object THIS52_tree=null;
        Object LAST53_tree=null;
        Object THIS54_tree=null;
        Object PAST55_tree=null;
        Object THIS56_tree=null;
        Object NEXT57_tree=null;
        Object THIS58_tree=null;
        Object COMING59_tree=null;
        Object THIS60_tree=null;
        Object UPCOMING61_tree=null;
        Object IN62_tree=null;
        RewriteRuleTokenStream stream_NEXT=new RewriteRuleTokenStream(adaptor,"token NEXT");
        RewriteRuleTokenStream stream_IN=new RewriteRuleTokenStream(adaptor,"token IN");
        RewriteRuleTokenStream stream_LAST=new RewriteRuleTokenStream(adaptor,"token LAST");
        RewriteRuleTokenStream stream_UPCOMING=new RewriteRuleTokenStream(adaptor,"token UPCOMING");
        RewriteRuleTokenStream stream_COMING=new RewriteRuleTokenStream(adaptor,"token COMING");
        RewriteRuleTokenStream stream_PAST=new RewriteRuleTokenStream(adaptor,"token PAST");
        RewriteRuleTokenStream stream_THIS=new RewriteRuleTokenStream(adaptor,"token THIS");
        RewriteRuleSubtreeStream stream_spelled_or_int_1_to_31=new RewriteRuleSubtreeStream(adaptor,"rule spelled_or_int_1_to_31");
        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:113:3: ( THIS -> SEEK_DIR[\">\"] SEEK_TYPE[\"by_day\"] INT[\"1\"] | ( THIS )? LAST -> SEEK_DIR[\"<\"] SEEK_TYPE[\"by_week\"] INT[\"1\"] | ( THIS )? PAST -> SEEK_DIR[\"<\"] SEEK_TYPE[\"by_day\"] INT[\"1\"] | ( THIS )? NEXT -> SEEK_DIR[\">\"] SEEK_TYPE[\"by_week\"] INT[\"1\"] | ( THIS )? COMING -> SEEK_DIR[\">\"] SEEK_TYPE[\"by_day\"] INT[\"1\"] | ( THIS )? UPCOMING -> SEEK_DIR[\">\"] SEEK_TYPE[\"by_day\"] INT[\"1\"] | ( IN )? spelled_or_int_1_to_31 -> SEEK_DIR[\">\"] SEEK_TYPE[\"by_day\"] spelled_or_int_1_to_31 )
            int alt20=7;
            switch ( input.LA(1) ) {
            case THIS:
                {
                switch ( input.LA(2) ) {
                case PAST:
                    {
                    alt20=3;
                    }
                    break;
                case COMING:
                    {
                    alt20=5;
                    }
                    break;
                case LAST:
                    {
                    alt20=2;
                    }
                    break;
                case NEXT:
                    {
                    alt20=4;
                    }
                    break;
                case UPCOMING:
                    {
                    alt20=6;
                    }
                    break;
                case DAY:
                case WEEK:
                case MONTH:
                case YEAR:
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
                case SUNDAY:
                case MONDAY:
                case TUESDAY:
                case WEDNESDAY:
                case THURSDAY:
                case FRIDAY:
                case SATURDAY:
                    {
                    alt20=1;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 20, 1, input);

                    throw nvae;
                }

                }
                break;
            case LAST:
                {
                alt20=2;
                }
                break;
            case PAST:
                {
                alt20=3;
                }
                break;
            case NEXT:
                {
                alt20=4;
                }
                break;
            case COMING:
                {
                alt20=5;
                }
                break;
            case UPCOMING:
                {
                alt20=6;
                }
                break;
            case IN:
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
            case PREFIXED_ONE_TO_NINE:
            case ONE_TO_NINE:
            case TEN_TO_TWELVE:
            case THIRTEEN_TO_TWENTY_THREE:
            case TWENTY_FOUR_TO_THIRTY_ONE:
                {
                alt20=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:113:5: THIS
                    {
                    THIS51=(Token)match(input,THIS,FOLLOW_THIS_in_target_prefix756); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THIS.add(THIS51);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 113:20: -> SEEK_DIR[\">\"] SEEK_TYPE[\"by_day\"] INT[\"1\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(SEEK_DIR, ">"));
                        adaptor.addChild(root_0, (Object)adaptor.create(SEEK_TYPE, "by_day"));
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "1"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:114:5: ( THIS )? LAST
                    {
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:114:5: ( THIS )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==THIS) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:114:5: THIS
                            {
                            THIS52=(Token)match(input,THIS,FOLLOW_THIS_in_target_prefix783); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_THIS.add(THIS52);


                            }
                            break;

                    }

                    LAST53=(Token)match(input,LAST,FOLLOW_LAST_in_target_prefix786); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LAST.add(LAST53);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 114:20: -> SEEK_DIR[\"<\"] SEEK_TYPE[\"by_week\"] INT[\"1\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(SEEK_DIR, "<"));
                        adaptor.addChild(root_0, (Object)adaptor.create(SEEK_TYPE, "by_week"));
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "1"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:115:5: ( THIS )? PAST
                    {
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:115:5: ( THIS )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==THIS) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:115:5: THIS
                            {
                            THIS54=(Token)match(input,THIS,FOLLOW_THIS_in_target_prefix807); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_THIS.add(THIS54);


                            }
                            break;

                    }

                    PAST55=(Token)match(input,PAST,FOLLOW_PAST_in_target_prefix810); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PAST.add(PAST55);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 115:20: -> SEEK_DIR[\"<\"] SEEK_TYPE[\"by_day\"] INT[\"1\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(SEEK_DIR, "<"));
                        adaptor.addChild(root_0, (Object)adaptor.create(SEEK_TYPE, "by_day"));
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "1"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:116:5: ( THIS )? NEXT
                    {
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:116:5: ( THIS )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==THIS) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:116:5: THIS
                            {
                            THIS56=(Token)match(input,THIS,FOLLOW_THIS_in_target_prefix831); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_THIS.add(THIS56);


                            }
                            break;

                    }

                    NEXT57=(Token)match(input,NEXT,FOLLOW_NEXT_in_target_prefix834); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NEXT.add(NEXT57);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 116:20: -> SEEK_DIR[\">\"] SEEK_TYPE[\"by_week\"] INT[\"1\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(SEEK_DIR, ">"));
                        adaptor.addChild(root_0, (Object)adaptor.create(SEEK_TYPE, "by_week"));
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "1"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:117:5: ( THIS )? COMING
                    {
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:117:5: ( THIS )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==THIS) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:117:5: THIS
                            {
                            THIS58=(Token)match(input,THIS,FOLLOW_THIS_in_target_prefix855); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_THIS.add(THIS58);


                            }
                            break;

                    }

                    COMING59=(Token)match(input,COMING,FOLLOW_COMING_in_target_prefix858); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COMING.add(COMING59);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 117:20: -> SEEK_DIR[\">\"] SEEK_TYPE[\"by_day\"] INT[\"1\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(SEEK_DIR, ">"));
                        adaptor.addChild(root_0, (Object)adaptor.create(SEEK_TYPE, "by_day"));
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "1"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 6 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:118:5: ( THIS )? UPCOMING
                    {
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:118:5: ( THIS )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==THIS) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:118:5: THIS
                            {
                            THIS60=(Token)match(input,THIS,FOLLOW_THIS_in_target_prefix877); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_THIS.add(THIS60);


                            }
                            break;

                    }

                    UPCOMING61=(Token)match(input,UPCOMING,FOLLOW_UPCOMING_in_target_prefix880); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_UPCOMING.add(UPCOMING61);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 118:20: -> SEEK_DIR[\">\"] SEEK_TYPE[\"by_day\"] INT[\"1\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(SEEK_DIR, ">"));
                        adaptor.addChild(root_0, (Object)adaptor.create(SEEK_TYPE, "by_day"));
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "1"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 7 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:119:5: ( IN )? spelled_or_int_1_to_31
                    {
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:119:5: ( IN )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==IN) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:119:5: IN
                            {
                            IN62=(Token)match(input,IN,FOLLOW_IN_in_target_prefix897); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_IN.add(IN62);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_spelled_or_int_1_to_31_in_target_prefix900);
                    spelled_or_int_1_to_3163=spelled_or_int_1_to_31();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_spelled_or_int_1_to_31.add(spelled_or_int_1_to_3163.getTree());


                    // AST REWRITE
                    // elements: spelled_or_int_1_to_31
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 120:20: -> SEEK_DIR[\">\"] SEEK_TYPE[\"by_day\"] spelled_or_int_1_to_31
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(SEEK_DIR, ">"));
                        adaptor.addChild(root_0, (Object)adaptor.create(SEEK_TYPE, "by_day"));
                        adaptor.addChild(root_0, stream_spelled_or_int_1_to_31.nextTree());

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
    // $ANTLR end "target_prefix"

    public static class target_suffix_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "target_suffix"
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:124:1: target_suffix : ( FROM_NOW -> SEEK_DIR[\">\"] SEEK_TYPE[\"by_day\"] | AGO -> SEEK_DIR[\"<\"] SEEK_TYPE[\"by_day\"] );
    public final DateParser.target_suffix_return target_suffix() throws RecognitionException {
        DateParser.target_suffix_return retval = new DateParser.target_suffix_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token FROM_NOW64=null;
        Token AGO65=null;

        Object FROM_NOW64_tree=null;
        Object AGO65_tree=null;
        RewriteRuleTokenStream stream_AGO=new RewriteRuleTokenStream(adaptor,"token AGO");
        RewriteRuleTokenStream stream_FROM_NOW=new RewriteRuleTokenStream(adaptor,"token FROM_NOW");

        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:125:3: ( FROM_NOW -> SEEK_DIR[\">\"] SEEK_TYPE[\"by_day\"] | AGO -> SEEK_DIR[\"<\"] SEEK_TYPE[\"by_day\"] )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==FROM_NOW) ) {
                alt21=1;
            }
            else if ( (LA21_0==AGO) ) {
                alt21=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:125:5: FROM_NOW
                    {
                    FROM_NOW64=(Token)match(input,FROM_NOW,FOLLOW_FROM_NOW_in_target_suffix946); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FROM_NOW.add(FROM_NOW64);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 125:14: -> SEEK_DIR[\">\"] SEEK_TYPE[\"by_day\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(SEEK_DIR, ">"));
                        adaptor.addChild(root_0, (Object)adaptor.create(SEEK_TYPE, "by_day"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:126:5: AGO
                    {
                    AGO65=(Token)match(input,AGO,FOLLOW_AGO_in_target_suffix960); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AGO.add(AGO65);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 126:14: -> SEEK_DIR[\"<\"] SEEK_TYPE[\"by_day\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(SEEK_DIR, "<"));
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
    // $ANTLR end "target_suffix"

    public static class modifiable_target_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "modifiable_target"
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:130:1: modifiable_target : ( day_of_week | date_span | month );
    public final DateParser.modifiable_target_return modifiable_target() throws RecognitionException {
        DateParser.modifiable_target_return retval = new DateParser.modifiable_target_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        DateParser.day_of_week_return day_of_week66 = null;

        DateParser.date_span_return date_span67 = null;

        DateParser.month_return month68 = null;



        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:131:3: ( day_of_week | date_span | month )
            int alt22=3;
            switch ( input.LA(1) ) {
            case SUNDAY:
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
            case FRIDAY:
            case SATURDAY:
                {
                alt22=1;
                }
                break;
            case DAY:
            case WEEK:
            case MONTH:
            case YEAR:
                {
                alt22=2;
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
                alt22=3;
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:131:5: day_of_week
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_day_of_week_in_modifiable_target989);
                    day_of_week66=day_of_week();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, day_of_week66.getTree());

                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:132:5: date_span
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_date_span_in_modifiable_target996);
                    date_span67=date_span();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, date_span67.getTree());

                    }
                    break;
                case 3 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:133:5: month
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_month_in_modifiable_target1002);
                    month68=month();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, month68.getTree());

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
    // $ANTLR end "modifiable_target"

    public static class date_span_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "date_span"
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:136:1: date_span : ( DAY -> SPAN[\"day\"] | WEEK -> SPAN[\"week\"] | MONTH -> SPAN[\"month\"] | YEAR -> SPAN[\"year\"] );
    public final DateParser.date_span_return date_span() throws RecognitionException {
        DateParser.date_span_return retval = new DateParser.date_span_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DAY69=null;
        Token WEEK70=null;
        Token MONTH71=null;
        Token YEAR72=null;

        Object DAY69_tree=null;
        Object WEEK70_tree=null;
        Object MONTH71_tree=null;
        Object YEAR72_tree=null;
        RewriteRuleTokenStream stream_WEEK=new RewriteRuleTokenStream(adaptor,"token WEEK");
        RewriteRuleTokenStream stream_DAY=new RewriteRuleTokenStream(adaptor,"token DAY");
        RewriteRuleTokenStream stream_YEAR=new RewriteRuleTokenStream(adaptor,"token YEAR");
        RewriteRuleTokenStream stream_MONTH=new RewriteRuleTokenStream(adaptor,"token MONTH");

        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:137:3: ( DAY -> SPAN[\"day\"] | WEEK -> SPAN[\"week\"] | MONTH -> SPAN[\"month\"] | YEAR -> SPAN[\"year\"] )
            int alt23=4;
            switch ( input.LA(1) ) {
            case DAY:
                {
                alt23=1;
                }
                break;
            case WEEK:
                {
                alt23=2;
                }
                break;
            case MONTH:
                {
                alt23=3;
                }
                break;
            case YEAR:
                {
                alt23=4;
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:137:5: DAY
                    {
                    DAY69=(Token)match(input,DAY,FOLLOW_DAY_in_date_span1017); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DAY.add(DAY69);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 137:11: -> SPAN[\"day\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(SPAN, "day"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:138:5: WEEK
                    {
                    WEEK70=(Token)match(input,WEEK,FOLLOW_WEEK_in_date_span1030); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WEEK.add(WEEK70);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 138:11: -> SPAN[\"week\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(SPAN, "week"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:139:5: MONTH
                    {
                    MONTH71=(Token)match(input,MONTH,FOLLOW_MONTH_in_date_span1042); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_MONTH.add(MONTH71);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 139:11: -> SPAN[\"month\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(SPAN, "month"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:140:5: YEAR
                    {
                    YEAR72=(Token)match(input,YEAR,FOLLOW_YEAR_in_date_span1053); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_YEAR.add(YEAR72);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 140:11: -> SPAN[\"year\"]
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
    // $ANTLR end "date_span"

    public static class month_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "month"
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:143:1: month : ( JANUARY -> ^( MONTH_OF INT[\"1\"] ) | FEBRUARY -> ^( MONTH_OF INT[\"2\"] ) | MARCH -> ^( MONTH_OF INT[\"3\"] ) | APRIL -> ^( MONTH_OF INT[\"4\"] ) | MAY -> ^( MONTH_OF INT[\"5\"] ) | JUNE -> ^( MONTH_OF INT[\"6\"] ) | JULY -> ^( MONTH_OF INT[\"7\"] ) | AUGUST -> ^( MONTH_OF INT[\"8\"] ) | SEPTEMBER -> ^( MONTH_OF INT[\"9\"] ) | OCTOBER -> ^( MONTH_OF INT[\"10\"] ) | NOVEMBER -> ^( MONTH_OF INT[\"11\"] ) | DECEMBER -> ^( MONTH_OF INT[\"12\"] ) );
    public final DateParser.month_return month() throws RecognitionException {
        DateParser.month_return retval = new DateParser.month_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token JANUARY73=null;
        Token FEBRUARY74=null;
        Token MARCH75=null;
        Token APRIL76=null;
        Token MAY77=null;
        Token JUNE78=null;
        Token JULY79=null;
        Token AUGUST80=null;
        Token SEPTEMBER81=null;
        Token OCTOBER82=null;
        Token NOVEMBER83=null;
        Token DECEMBER84=null;

        Object JANUARY73_tree=null;
        Object FEBRUARY74_tree=null;
        Object MARCH75_tree=null;
        Object APRIL76_tree=null;
        Object MAY77_tree=null;
        Object JUNE78_tree=null;
        Object JULY79_tree=null;
        Object AUGUST80_tree=null;
        Object SEPTEMBER81_tree=null;
        Object OCTOBER82_tree=null;
        Object NOVEMBER83_tree=null;
        Object DECEMBER84_tree=null;
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
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:144:3: ( JANUARY -> ^( MONTH_OF INT[\"1\"] ) | FEBRUARY -> ^( MONTH_OF INT[\"2\"] ) | MARCH -> ^( MONTH_OF INT[\"3\"] ) | APRIL -> ^( MONTH_OF INT[\"4\"] ) | MAY -> ^( MONTH_OF INT[\"5\"] ) | JUNE -> ^( MONTH_OF INT[\"6\"] ) | JULY -> ^( MONTH_OF INT[\"7\"] ) | AUGUST -> ^( MONTH_OF INT[\"8\"] ) | SEPTEMBER -> ^( MONTH_OF INT[\"9\"] ) | OCTOBER -> ^( MONTH_OF INT[\"10\"] ) | NOVEMBER -> ^( MONTH_OF INT[\"11\"] ) | DECEMBER -> ^( MONTH_OF INT[\"12\"] ) )
            int alt24=12;
            switch ( input.LA(1) ) {
            case JANUARY:
                {
                alt24=1;
                }
                break;
            case FEBRUARY:
                {
                alt24=2;
                }
                break;
            case MARCH:
                {
                alt24=3;
                }
                break;
            case APRIL:
                {
                alt24=4;
                }
                break;
            case MAY:
                {
                alt24=5;
                }
                break;
            case JUNE:
                {
                alt24=6;
                }
                break;
            case JULY:
                {
                alt24=7;
                }
                break;
            case AUGUST:
                {
                alt24=8;
                }
                break;
            case SEPTEMBER:
                {
                alt24=9;
                }
                break;
            case OCTOBER:
                {
                alt24=10;
                }
                break;
            case NOVEMBER:
                {
                alt24=11;
                }
                break;
            case DECEMBER:
                {
                alt24=12;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:144:5: JANUARY
                    {
                    JANUARY73=(Token)match(input,JANUARY,FOLLOW_JANUARY_in_month1074); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_JANUARY.add(JANUARY73);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 144:15: -> ^( MONTH_OF INT[\"1\"] )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:144:18: ^( MONTH_OF INT[\"1\"] )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(MONTH_OF, "MONTH_OF"), root_1);

                        adaptor.addChild(root_1, (Object)adaptor.create(INT, "1"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:145:5: FEBRUARY
                    {
                    FEBRUARY74=(Token)match(input,FEBRUARY,FOLLOW_FEBRUARY_in_month1091); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FEBRUARY.add(FEBRUARY74);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 145:15: -> ^( MONTH_OF INT[\"2\"] )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:145:18: ^( MONTH_OF INT[\"2\"] )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(MONTH_OF, "MONTH_OF"), root_1);

                        adaptor.addChild(root_1, (Object)adaptor.create(INT, "2"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:146:5: MARCH
                    {
                    MARCH75=(Token)match(input,MARCH,FOLLOW_MARCH_in_month1107); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_MARCH.add(MARCH75);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 146:15: -> ^( MONTH_OF INT[\"3\"] )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:146:18: ^( MONTH_OF INT[\"3\"] )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(MONTH_OF, "MONTH_OF"), root_1);

                        adaptor.addChild(root_1, (Object)adaptor.create(INT, "3"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:147:5: APRIL
                    {
                    APRIL76=(Token)match(input,APRIL,FOLLOW_APRIL_in_month1126); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_APRIL.add(APRIL76);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 147:15: -> ^( MONTH_OF INT[\"4\"] )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:147:18: ^( MONTH_OF INT[\"4\"] )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(MONTH_OF, "MONTH_OF"), root_1);

                        adaptor.addChild(root_1, (Object)adaptor.create(INT, "4"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:148:5: MAY
                    {
                    MAY77=(Token)match(input,MAY,FOLLOW_MAY_in_month1145); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_MAY.add(MAY77);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 148:15: -> ^( MONTH_OF INT[\"5\"] )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:148:18: ^( MONTH_OF INT[\"5\"] )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(MONTH_OF, "MONTH_OF"), root_1);

                        adaptor.addChild(root_1, (Object)adaptor.create(INT, "5"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 6 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:149:5: JUNE
                    {
                    JUNE78=(Token)match(input,JUNE,FOLLOW_JUNE_in_month1166); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_JUNE.add(JUNE78);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 149:15: -> ^( MONTH_OF INT[\"6\"] )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:149:18: ^( MONTH_OF INT[\"6\"] )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(MONTH_OF, "MONTH_OF"), root_1);

                        adaptor.addChild(root_1, (Object)adaptor.create(INT, "6"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 7 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:150:5: JULY
                    {
                    JULY79=(Token)match(input,JULY,FOLLOW_JULY_in_month1186); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_JULY.add(JULY79);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 150:15: -> ^( MONTH_OF INT[\"7\"] )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:150:18: ^( MONTH_OF INT[\"7\"] )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(MONTH_OF, "MONTH_OF"), root_1);

                        adaptor.addChild(root_1, (Object)adaptor.create(INT, "7"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 8 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:151:5: AUGUST
                    {
                    AUGUST80=(Token)match(input,AUGUST,FOLLOW_AUGUST_in_month1206); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AUGUST.add(AUGUST80);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 151:15: -> ^( MONTH_OF INT[\"8\"] )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:151:18: ^( MONTH_OF INT[\"8\"] )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(MONTH_OF, "MONTH_OF"), root_1);

                        adaptor.addChild(root_1, (Object)adaptor.create(INT, "8"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 9 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:152:5: SEPTEMBER
                    {
                    SEPTEMBER81=(Token)match(input,SEPTEMBER,FOLLOW_SEPTEMBER_in_month1224); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEPTEMBER.add(SEPTEMBER81);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 152:15: -> ^( MONTH_OF INT[\"9\"] )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:152:18: ^( MONTH_OF INT[\"9\"] )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(MONTH_OF, "MONTH_OF"), root_1);

                        adaptor.addChild(root_1, (Object)adaptor.create(INT, "9"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 10 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:153:5: OCTOBER
                    {
                    OCTOBER82=(Token)match(input,OCTOBER,FOLLOW_OCTOBER_in_month1239); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OCTOBER.add(OCTOBER82);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 153:15: -> ^( MONTH_OF INT[\"10\"] )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:153:18: ^( MONTH_OF INT[\"10\"] )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(MONTH_OF, "MONTH_OF"), root_1);

                        adaptor.addChild(root_1, (Object)adaptor.create(INT, "10"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 11 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:154:5: NOVEMBER
                    {
                    NOVEMBER83=(Token)match(input,NOVEMBER,FOLLOW_NOVEMBER_in_month1256); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NOVEMBER.add(NOVEMBER83);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 154:15: -> ^( MONTH_OF INT[\"11\"] )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:154:18: ^( MONTH_OF INT[\"11\"] )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(MONTH_OF, "MONTH_OF"), root_1);

                        adaptor.addChild(root_1, (Object)adaptor.create(INT, "11"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 12 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:155:5: DECEMBER
                    {
                    DECEMBER84=(Token)match(input,DECEMBER,FOLLOW_DECEMBER_in_month1272); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DECEMBER.add(DECEMBER84);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 155:15: -> ^( MONTH_OF INT[\"12\"] )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:155:18: ^( MONTH_OF INT[\"12\"] )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(MONTH_OF, "MONTH_OF"), root_1);

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
    // $ANTLR end "month"

    public static class day_of_month_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "day_of_month"
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:158:1: day_of_month : ( int_1_to_31 -> ^( DAY_OF_MONTH int_1_to_31 ) | spelled_sequence_1_to_31 -> ^( DAY_OF_MONTH spelled_sequence_1_to_31 ) );
    public final DateParser.day_of_month_return day_of_month() throws RecognitionException {
        DateParser.day_of_month_return retval = new DateParser.day_of_month_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        DateParser.int_1_to_31_return int_1_to_3185 = null;

        DateParser.spelled_sequence_1_to_31_return spelled_sequence_1_to_3186 = null;


        RewriteRuleSubtreeStream stream_int_1_to_31=new RewriteRuleSubtreeStream(adaptor,"rule int_1_to_31");
        RewriteRuleSubtreeStream stream_spelled_sequence_1_to_31=new RewriteRuleSubtreeStream(adaptor,"rule spelled_sequence_1_to_31");
        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:159:3: ( int_1_to_31 -> ^( DAY_OF_MONTH int_1_to_31 ) | spelled_sequence_1_to_31 -> ^( DAY_OF_MONTH spelled_sequence_1_to_31 ) )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0>=PREFIXED_ONE_TO_NINE && LA25_0<=TEN_TO_TWELVE)||(LA25_0>=THIRTEEN_TO_TWENTY_THREE && LA25_0<=TWENTY_FOUR_TO_THIRTY_ONE)) ) {
                alt25=1;
            }
            else if ( ((LA25_0>=TWENTY && LA25_0<=THIRTY_FIRST)) ) {
                alt25=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:159:5: int_1_to_31
                    {
                    pushFollow(FOLLOW_int_1_to_31_in_day_of_month1297);
                    int_1_to_3185=int_1_to_31();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_int_1_to_31.add(int_1_to_3185.getTree());


                    // AST REWRITE
                    // elements: int_1_to_31
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 159:30: -> ^( DAY_OF_MONTH int_1_to_31 )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:159:33: ^( DAY_OF_MONTH int_1_to_31 )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DAY_OF_MONTH, "DAY_OF_MONTH"), root_1);

                        adaptor.addChild(root_1, stream_int_1_to_31.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:160:5: spelled_sequence_1_to_31
                    {
                    pushFollow(FOLLOW_spelled_sequence_1_to_31_in_day_of_month1324);
                    spelled_sequence_1_to_3186=spelled_sequence_1_to_31();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_spelled_sequence_1_to_31.add(spelled_sequence_1_to_3186.getTree());


                    // AST REWRITE
                    // elements: spelled_sequence_1_to_31
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 160:30: -> ^( DAY_OF_MONTH spelled_sequence_1_to_31 )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:160:33: ^( DAY_OF_MONTH spelled_sequence_1_to_31 )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DAY_OF_MONTH, "DAY_OF_MONTH"), root_1);

                        adaptor.addChild(root_1, stream_spelled_sequence_1_to_31.nextTree());

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
    // $ANTLR end "day_of_month"

    public static class day_of_week_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "day_of_week"
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:163:1: day_of_week : ( SUNDAY -> ^( DAY_OF_WEEK INT[\"1\"] ) | MONDAY -> ^( DAY_OF_WEEK INT[\"2\"] ) | TUESDAY -> ^( DAY_OF_WEEK INT[\"3\"] ) | WEDNESDAY -> ^( DAY_OF_WEEK INT[\"4\"] ) | THURSDAY -> ^( DAY_OF_WEEK INT[\"5\"] ) | FRIDAY -> ^( DAY_OF_WEEK INT[\"6\"] ) | SATURDAY -> ^( DAY_OF_WEEK INT[\"7\"] ) );
    public final DateParser.day_of_week_return day_of_week() throws RecognitionException {
        DateParser.day_of_week_return retval = new DateParser.day_of_week_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SUNDAY87=null;
        Token MONDAY88=null;
        Token TUESDAY89=null;
        Token WEDNESDAY90=null;
        Token THURSDAY91=null;
        Token FRIDAY92=null;
        Token SATURDAY93=null;

        Object SUNDAY87_tree=null;
        Object MONDAY88_tree=null;
        Object TUESDAY89_tree=null;
        Object WEDNESDAY90_tree=null;
        Object THURSDAY91_tree=null;
        Object FRIDAY92_tree=null;
        Object SATURDAY93_tree=null;
        RewriteRuleTokenStream stream_MONDAY=new RewriteRuleTokenStream(adaptor,"token MONDAY");
        RewriteRuleTokenStream stream_SUNDAY=new RewriteRuleTokenStream(adaptor,"token SUNDAY");
        RewriteRuleTokenStream stream_WEDNESDAY=new RewriteRuleTokenStream(adaptor,"token WEDNESDAY");
        RewriteRuleTokenStream stream_THURSDAY=new RewriteRuleTokenStream(adaptor,"token THURSDAY");
        RewriteRuleTokenStream stream_SATURDAY=new RewriteRuleTokenStream(adaptor,"token SATURDAY");
        RewriteRuleTokenStream stream_TUESDAY=new RewriteRuleTokenStream(adaptor,"token TUESDAY");
        RewriteRuleTokenStream stream_FRIDAY=new RewriteRuleTokenStream(adaptor,"token FRIDAY");

        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:164:3: ( SUNDAY -> ^( DAY_OF_WEEK INT[\"1\"] ) | MONDAY -> ^( DAY_OF_WEEK INT[\"2\"] ) | TUESDAY -> ^( DAY_OF_WEEK INT[\"3\"] ) | WEDNESDAY -> ^( DAY_OF_WEEK INT[\"4\"] ) | THURSDAY -> ^( DAY_OF_WEEK INT[\"5\"] ) | FRIDAY -> ^( DAY_OF_WEEK INT[\"6\"] ) | SATURDAY -> ^( DAY_OF_WEEK INT[\"7\"] ) )
            int alt26=7;
            switch ( input.LA(1) ) {
            case SUNDAY:
                {
                alt26=1;
                }
                break;
            case MONDAY:
                {
                alt26=2;
                }
                break;
            case TUESDAY:
                {
                alt26=3;
                }
                break;
            case WEDNESDAY:
                {
                alt26=4;
                }
                break;
            case THURSDAY:
                {
                alt26=5;
                }
                break;
            case FRIDAY:
                {
                alt26=6;
                }
                break;
            case SATURDAY:
                {
                alt26=7;
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:164:5: SUNDAY
                    {
                    SUNDAY87=(Token)match(input,SUNDAY,FOLLOW_SUNDAY_in_day_of_week1348); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SUNDAY.add(SUNDAY87);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 164:15: -> ^( DAY_OF_WEEK INT[\"1\"] )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:164:18: ^( DAY_OF_WEEK INT[\"1\"] )
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:165:5: MONDAY
                    {
                    MONDAY88=(Token)match(input,MONDAY,FOLLOW_MONDAY_in_day_of_week1366); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_MONDAY.add(MONDAY88);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 165:15: -> ^( DAY_OF_WEEK INT[\"2\"] )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:165:18: ^( DAY_OF_WEEK INT[\"2\"] )
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:166:5: TUESDAY
                    {
                    TUESDAY89=(Token)match(input,TUESDAY,FOLLOW_TUESDAY_in_day_of_week1384); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TUESDAY.add(TUESDAY89);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 166:15: -> ^( DAY_OF_WEEK INT[\"3\"] )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:166:18: ^( DAY_OF_WEEK INT[\"3\"] )
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:167:5: WEDNESDAY
                    {
                    WEDNESDAY90=(Token)match(input,WEDNESDAY,FOLLOW_WEDNESDAY_in_day_of_week1401); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WEDNESDAY.add(WEDNESDAY90);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 167:15: -> ^( DAY_OF_WEEK INT[\"4\"] )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:167:18: ^( DAY_OF_WEEK INT[\"4\"] )
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:168:5: THURSDAY
                    {
                    THURSDAY91=(Token)match(input,THURSDAY,FOLLOW_THURSDAY_in_day_of_week1416); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THURSDAY.add(THURSDAY91);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 168:15: -> ^( DAY_OF_WEEK INT[\"5\"] )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:168:18: ^( DAY_OF_WEEK INT[\"5\"] )
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:169:5: FRIDAY
                    {
                    FRIDAY92=(Token)match(input,FRIDAY,FOLLOW_FRIDAY_in_day_of_week1432); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FRIDAY.add(FRIDAY92);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 169:15: -> ^( DAY_OF_WEEK INT[\"6\"] )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:169:18: ^( DAY_OF_WEEK INT[\"6\"] )
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:170:5: SATURDAY
                    {
                    SATURDAY93=(Token)match(input,SATURDAY,FOLLOW_SATURDAY_in_day_of_week1450); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SATURDAY.add(SATURDAY93);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 170:15: -> ^( DAY_OF_WEEK INT[\"7\"] )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:170:18: ^( DAY_OF_WEEK INT[\"7\"] )
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

    public static class year_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "year"
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:173:1: year : ( ( COMMA )? ( IN THE YEAR )? ( '\\'' )? int_0_to_99_with_prefix -> ^( YEAR_OF int_0_to_99_with_prefix ) | ( COMMA )? ( IN THE YEAR )? int_3_or_4_digits -> ^( YEAR_OF int_3_or_4_digits ) );
    public final DateParser.year_return year() throws RecognitionException {
        DateParser.year_return retval = new DateParser.year_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token COMMA94=null;
        Token IN95=null;
        Token THE96=null;
        Token YEAR97=null;
        Token char_literal98=null;
        Token COMMA100=null;
        Token IN101=null;
        Token THE102=null;
        Token YEAR103=null;
        DateParser.int_0_to_99_with_prefix_return int_0_to_99_with_prefix99 = null;

        DateParser.int_3_or_4_digits_return int_3_or_4_digits104 = null;


        Object COMMA94_tree=null;
        Object IN95_tree=null;
        Object THE96_tree=null;
        Object YEAR97_tree=null;
        Object char_literal98_tree=null;
        Object COMMA100_tree=null;
        Object IN101_tree=null;
        Object THE102_tree=null;
        Object YEAR103_tree=null;
        RewriteRuleTokenStream stream_132=new RewriteRuleTokenStream(adaptor,"token 132");
        RewriteRuleTokenStream stream_IN=new RewriteRuleTokenStream(adaptor,"token IN");
        RewriteRuleTokenStream stream_YEAR=new RewriteRuleTokenStream(adaptor,"token YEAR");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_THE=new RewriteRuleTokenStream(adaptor,"token THE");
        RewriteRuleSubtreeStream stream_int_0_to_99_with_prefix=new RewriteRuleSubtreeStream(adaptor,"rule int_0_to_99_with_prefix");
        RewriteRuleSubtreeStream stream_int_3_or_4_digits=new RewriteRuleSubtreeStream(adaptor,"rule int_3_or_4_digits");
        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:174:3: ( ( COMMA )? ( IN THE YEAR )? ( '\\'' )? int_0_to_99_with_prefix -> ^( YEAR_OF int_0_to_99_with_prefix ) | ( COMMA )? ( IN THE YEAR )? int_3_or_4_digits -> ^( YEAR_OF int_3_or_4_digits ) )
            int alt32=2;
            switch ( input.LA(1) ) {
            case COMMA:
                {
                switch ( input.LA(2) ) {
                case IN:
                    {
                    int LA32_2 = input.LA(3);

                    if ( (LA32_2==THE) ) {
                        int LA32_5 = input.LA(4);

                        if ( (LA32_5==YEAR) ) {
                            int LA32_6 = input.LA(5);

                            if ( ((LA32_6>=THREE_DIGIT && LA32_6<=FOUR_DIGIT)) ) {
                                alt32=2;
                            }
                            else if ( ((LA32_6>=TWO_ZEROS && LA32_6<=PREFIXED_ONE_TO_NINE)||LA32_6==TEN_TO_TWELVE||(LA32_6>=THIRTEEN_TO_TWENTY_THREE && LA32_6<=SIXTY_TO_NINETY_NINE)||LA32_6==132) ) {
                                alt32=1;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 32, 6, input);

                                throw nvae;
                            }
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 32, 5, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 32, 2, input);

                        throw nvae;
                    }
                    }
                    break;
                case TWO_ZEROS:
                case PREFIXED_ONE_TO_NINE:
                case TEN_TO_TWELVE:
                case THIRTEEN_TO_TWENTY_THREE:
                case TWENTY_FOUR_TO_THIRTY_ONE:
                case THIRTY_TWO_TO_FIFTY_NINE:
                case SIXTY_TO_NINETY_NINE:
                case 132:
                    {
                    alt32=1;
                    }
                    break;
                case THREE_DIGIT:
                case FOUR_DIGIT:
                    {
                    alt32=2;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 32, 1, input);

                    throw nvae;
                }

                }
                break;
            case IN:
                {
                int LA32_2 = input.LA(2);

                if ( (LA32_2==THE) ) {
                    int LA32_5 = input.LA(3);

                    if ( (LA32_5==YEAR) ) {
                        int LA32_6 = input.LA(4);

                        if ( ((LA32_6>=THREE_DIGIT && LA32_6<=FOUR_DIGIT)) ) {
                            alt32=2;
                        }
                        else if ( ((LA32_6>=TWO_ZEROS && LA32_6<=PREFIXED_ONE_TO_NINE)||LA32_6==TEN_TO_TWELVE||(LA32_6>=THIRTEEN_TO_TWENTY_THREE && LA32_6<=SIXTY_TO_NINETY_NINE)||LA32_6==132) ) {
                            alt32=1;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 32, 6, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 32, 5, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 32, 2, input);

                    throw nvae;
                }
                }
                break;
            case TWO_ZEROS:
            case PREFIXED_ONE_TO_NINE:
            case TEN_TO_TWELVE:
            case THIRTEEN_TO_TWENTY_THREE:
            case TWENTY_FOUR_TO_THIRTY_ONE:
            case THIRTY_TWO_TO_FIFTY_NINE:
            case SIXTY_TO_NINETY_NINE:
            case 132:
                {
                alt32=1;
                }
                break;
            case THREE_DIGIT:
            case FOUR_DIGIT:
                {
                alt32=2;
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:174:5: ( COMMA )? ( IN THE YEAR )? ( '\\'' )? int_0_to_99_with_prefix
                    {
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:174:5: ( COMMA )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==COMMA) ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:174:5: COMMA
                            {
                            COMMA94=(Token)match(input,COMMA,FOLLOW_COMMA_in_year1475); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_COMMA.add(COMMA94);


                            }
                            break;

                    }

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:174:12: ( IN THE YEAR )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==IN) ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:174:13: IN THE YEAR
                            {
                            IN95=(Token)match(input,IN,FOLLOW_IN_in_year1479); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_IN.add(IN95);

                            THE96=(Token)match(input,THE,FOLLOW_THE_in_year1481); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_THE.add(THE96);

                            YEAR97=(Token)match(input,YEAR,FOLLOW_YEAR_in_year1483); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_YEAR.add(YEAR97);


                            }
                            break;

                    }

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:174:27: ( '\\'' )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==132) ) {
                        alt29=1;
                    }
                    switch (alt29) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:174:27: '\\''
                            {
                            char_literal98=(Token)match(input,132,FOLLOW_132_in_year1487); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_132.add(char_literal98);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_int_0_to_99_with_prefix_in_year1490);
                    int_0_to_99_with_prefix99=int_0_to_99_with_prefix();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_int_0_to_99_with_prefix.add(int_0_to_99_with_prefix99.getTree());


                    // AST REWRITE
                    // elements: int_0_to_99_with_prefix
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 174:57: -> ^( YEAR_OF int_0_to_99_with_prefix )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:174:60: ^( YEAR_OF int_0_to_99_with_prefix )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(YEAR_OF, "YEAR_OF"), root_1);

                        adaptor.addChild(root_1, stream_int_0_to_99_with_prefix.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:175:5: ( COMMA )? ( IN THE YEAR )? int_3_or_4_digits
                    {
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:175:5: ( COMMA )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==COMMA) ) {
                        alt30=1;
                    }
                    switch (alt30) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:175:5: COMMA
                            {
                            COMMA100=(Token)match(input,COMMA,FOLLOW_COMMA_in_year1504); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_COMMA.add(COMMA100);


                            }
                            break;

                    }

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:175:12: ( IN THE YEAR )?
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==IN) ) {
                        alt31=1;
                    }
                    switch (alt31) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:175:13: IN THE YEAR
                            {
                            IN101=(Token)match(input,IN,FOLLOW_IN_in_year1508); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_IN.add(IN101);

                            THE102=(Token)match(input,THE,FOLLOW_THE_in_year1510); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_THE.add(THE102);

                            YEAR103=(Token)match(input,YEAR,FOLLOW_YEAR_in_year1512); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_YEAR.add(YEAR103);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_int_3_or_4_digits_in_year1516);
                    int_3_or_4_digits104=int_3_or_4_digits();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_int_3_or_4_digits.add(int_3_or_4_digits104.getTree());


                    // AST REWRITE
                    // elements: int_3_or_4_digits
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 175:57: -> ^( YEAR_OF int_3_or_4_digits )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:175:60: ^( YEAR_OF int_3_or_4_digits )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(YEAR_OF, "YEAR_OF"), root_1);

                        adaptor.addChild(root_1, stream_int_3_or_4_digits.nextTree());

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
    // $ANTLR end "year"

    public static class date_separator_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "date_separator"
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:178:1: date_separator : ( DASH | SLASH );
    public final DateParser.date_separator_return date_separator() throws RecognitionException {
        DateParser.date_separator_return retval = new DateParser.date_separator_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set105=null;

        Object set105_tree=null;

        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:179:3: ( DASH | SLASH )
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:
            {
            root_0 = (Object)adaptor.nil();

            set105=(Token)input.LT(1);
            if ( (input.LA(1)>=DASH && input.LA(1)<=SLASH) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set105));
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
    // $ANTLR end "date_separator"

    public static class hours_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "hours"
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:183:1: hours : int_0_to_23 -> ^( HOURS int_0_to_23 ) ;
    public final DateParser.hours_return hours() throws RecognitionException {
        DateParser.hours_return retval = new DateParser.hours_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        DateParser.int_0_to_23_return int_0_to_23106 = null;


        RewriteRuleSubtreeStream stream_int_0_to_23=new RewriteRuleSubtreeStream(adaptor,"rule int_0_to_23");
        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:184:3: ( int_0_to_23 -> ^( HOURS int_0_to_23 ) )
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:184:5: int_0_to_23
            {
            pushFollow(FOLLOW_int_0_to_23_in_hours1570);
            int_0_to_23106=int_0_to_23();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_int_0_to_23.add(int_0_to_23106.getTree());


            // AST REWRITE
            // elements: int_0_to_23
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 184:17: -> ^( HOURS int_0_to_23 )
            {
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:184:20: ^( HOURS int_0_to_23 )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(HOURS, "HOURS"), root_1);

                adaptor.addChild(root_1, stream_int_0_to_23.nextTree());

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
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:187:1: minutes : int_0_to_59 -> ^( MINUTES int_0_to_59 ) ;
    public final DateParser.minutes_return minutes() throws RecognitionException {
        DateParser.minutes_return retval = new DateParser.minutes_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        DateParser.int_0_to_59_return int_0_to_59107 = null;


        RewriteRuleSubtreeStream stream_int_0_to_59=new RewriteRuleSubtreeStream(adaptor,"rule int_0_to_59");
        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:188:3: ( int_0_to_59 -> ^( MINUTES int_0_to_59 ) )
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:188:5: int_0_to_59
            {
            pushFollow(FOLLOW_int_0_to_59_in_minutes1593);
            int_0_to_59107=int_0_to_59();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_int_0_to_59.add(int_0_to_59107.getTree());


            // AST REWRITE
            // elements: int_0_to_59
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 188:17: -> ^( MINUTES int_0_to_59 )
            {
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:188:20: ^( MINUTES int_0_to_59 )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(MINUTES, "MINUTES"), root_1);

                adaptor.addChild(root_1, stream_int_0_to_59.nextTree());

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
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:191:1: meridian_indicator : ( AM -> AM_PM[\"am\"] | PM -> AM_PM[\"pm\"] );
    public final DateParser.meridian_indicator_return meridian_indicator() throws RecognitionException {
        DateParser.meridian_indicator_return retval = new DateParser.meridian_indicator_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token AM108=null;
        Token PM109=null;

        Object AM108_tree=null;
        Object PM109_tree=null;
        RewriteRuleTokenStream stream_PM=new RewriteRuleTokenStream(adaptor,"token PM");
        RewriteRuleTokenStream stream_AM=new RewriteRuleTokenStream(adaptor,"token AM");

        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:192:3: ( AM -> AM_PM[\"am\"] | PM -> AM_PM[\"pm\"] )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==AM) ) {
                alt33=1;
            }
            else if ( (LA33_0==PM) ) {
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:192:5: AM
                    {
                    AM108=(Token)match(input,AM,FOLLOW_AM_in_meridian_indicator1616); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AM.add(AM108);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 192:8: -> AM_PM[\"am\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(AM_PM, "am"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:193:5: PM
                    {
                    PM109=(Token)match(input,PM,FOLLOW_PM_in_meridian_indicator1627); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PM.add(PM109);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 193:8: -> AM_PM[\"pm\"]
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

    public static class spelled_or_int_1_to_31_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "spelled_or_int_1_to_31"
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:197:1: spelled_or_int_1_to_31 : ( int_1_to_31 | ONE -> INT[\"1\"] | TWO -> INT[\"2\"] | THREE -> INT[\"3\"] | FOUR -> INT[\"4\"] | FIVE -> INT[\"5\"] | SIX -> INT[\"6\"] | SEVEN -> INT[\"7\"] | EIGHT -> INT[\"8\"] | NINE -> INT[\"9\"] | TEN -> INT[\"10\"] | ELEVEN -> INT[\"11\"] | TWELVE -> INT[\"12\"] | THIRTEEN -> INT[\"13\"] | FOURTEEN -> INT[\"14\"] | FIFTEEN -> INT[\"15\"] | SIXTEEN -> INT[\"16\"] | SEVENTEEN -> INT[\"17\"] | EIGHTEEN -> INT[\"18\"] | NINETEEN -> INT[\"19\"] | TWENTY -> INT[\"20\"] | TWENTY ( DASH )? ONE -> INT[\"21\"] | TWENTY ( DASH )? TWO -> INT[\"22\"] | TWENTY ( DASH )? THREE -> INT[\"23\"] | TWENTY ( DASH )? FOUR -> INT[\"24\"] | TWENTY ( DASH )? FIVE -> INT[\"25\"] | TWENTY ( DASH )? SIX -> INT[\"26\"] | TWENTY ( DASH )? SEVEN -> INT[\"27\"] | TWENTY ( DASH )? EIGHT -> INT[\"28\"] | TWENTY ( DASH )? NINE -> INT[\"29\"] | THIRTY -> INT[\"30\"] | THIRTY ( DASH )? ONE -> INT[\"31\"] );
    public final DateParser.spelled_or_int_1_to_31_return spelled_or_int_1_to_31() throws RecognitionException {
        DateParser.spelled_or_int_1_to_31_return retval = new DateParser.spelled_or_int_1_to_31_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ONE111=null;
        Token TWO112=null;
        Token THREE113=null;
        Token FOUR114=null;
        Token FIVE115=null;
        Token SIX116=null;
        Token SEVEN117=null;
        Token EIGHT118=null;
        Token NINE119=null;
        Token TEN120=null;
        Token ELEVEN121=null;
        Token TWELVE122=null;
        Token THIRTEEN123=null;
        Token FOURTEEN124=null;
        Token FIFTEEN125=null;
        Token SIXTEEN126=null;
        Token SEVENTEEN127=null;
        Token EIGHTEEN128=null;
        Token NINETEEN129=null;
        Token TWENTY130=null;
        Token TWENTY131=null;
        Token DASH132=null;
        Token ONE133=null;
        Token TWENTY134=null;
        Token DASH135=null;
        Token TWO136=null;
        Token TWENTY137=null;
        Token DASH138=null;
        Token THREE139=null;
        Token TWENTY140=null;
        Token DASH141=null;
        Token FOUR142=null;
        Token TWENTY143=null;
        Token DASH144=null;
        Token FIVE145=null;
        Token TWENTY146=null;
        Token DASH147=null;
        Token SIX148=null;
        Token TWENTY149=null;
        Token DASH150=null;
        Token SEVEN151=null;
        Token TWENTY152=null;
        Token DASH153=null;
        Token EIGHT154=null;
        Token TWENTY155=null;
        Token DASH156=null;
        Token NINE157=null;
        Token THIRTY158=null;
        Token THIRTY159=null;
        Token DASH160=null;
        Token ONE161=null;
        DateParser.int_1_to_31_return int_1_to_31110 = null;


        Object ONE111_tree=null;
        Object TWO112_tree=null;
        Object THREE113_tree=null;
        Object FOUR114_tree=null;
        Object FIVE115_tree=null;
        Object SIX116_tree=null;
        Object SEVEN117_tree=null;
        Object EIGHT118_tree=null;
        Object NINE119_tree=null;
        Object TEN120_tree=null;
        Object ELEVEN121_tree=null;
        Object TWELVE122_tree=null;
        Object THIRTEEN123_tree=null;
        Object FOURTEEN124_tree=null;
        Object FIFTEEN125_tree=null;
        Object SIXTEEN126_tree=null;
        Object SEVENTEEN127_tree=null;
        Object EIGHTEEN128_tree=null;
        Object NINETEEN129_tree=null;
        Object TWENTY130_tree=null;
        Object TWENTY131_tree=null;
        Object DASH132_tree=null;
        Object ONE133_tree=null;
        Object TWENTY134_tree=null;
        Object DASH135_tree=null;
        Object TWO136_tree=null;
        Object TWENTY137_tree=null;
        Object DASH138_tree=null;
        Object THREE139_tree=null;
        Object TWENTY140_tree=null;
        Object DASH141_tree=null;
        Object FOUR142_tree=null;
        Object TWENTY143_tree=null;
        Object DASH144_tree=null;
        Object FIVE145_tree=null;
        Object TWENTY146_tree=null;
        Object DASH147_tree=null;
        Object SIX148_tree=null;
        Object TWENTY149_tree=null;
        Object DASH150_tree=null;
        Object SEVEN151_tree=null;
        Object TWENTY152_tree=null;
        Object DASH153_tree=null;
        Object EIGHT154_tree=null;
        Object TWENTY155_tree=null;
        Object DASH156_tree=null;
        Object NINE157_tree=null;
        Object THIRTY158_tree=null;
        Object THIRTY159_tree=null;
        Object DASH160_tree=null;
        Object ONE161_tree=null;
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
        RewriteRuleTokenStream stream_SEVENTEEN=new RewriteRuleTokenStream(adaptor,"token SEVENTEEN");
        RewriteRuleTokenStream stream_EIGHT=new RewriteRuleTokenStream(adaptor,"token EIGHT");

        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:198:3: ( int_1_to_31 | ONE -> INT[\"1\"] | TWO -> INT[\"2\"] | THREE -> INT[\"3\"] | FOUR -> INT[\"4\"] | FIVE -> INT[\"5\"] | SIX -> INT[\"6\"] | SEVEN -> INT[\"7\"] | EIGHT -> INT[\"8\"] | NINE -> INT[\"9\"] | TEN -> INT[\"10\"] | ELEVEN -> INT[\"11\"] | TWELVE -> INT[\"12\"] | THIRTEEN -> INT[\"13\"] | FOURTEEN -> INT[\"14\"] | FIFTEEN -> INT[\"15\"] | SIXTEEN -> INT[\"16\"] | SEVENTEEN -> INT[\"17\"] | EIGHTEEN -> INT[\"18\"] | NINETEEN -> INT[\"19\"] | TWENTY -> INT[\"20\"] | TWENTY ( DASH )? ONE -> INT[\"21\"] | TWENTY ( DASH )? TWO -> INT[\"22\"] | TWENTY ( DASH )? THREE -> INT[\"23\"] | TWENTY ( DASH )? FOUR -> INT[\"24\"] | TWENTY ( DASH )? FIVE -> INT[\"25\"] | TWENTY ( DASH )? SIX -> INT[\"26\"] | TWENTY ( DASH )? SEVEN -> INT[\"27\"] | TWENTY ( DASH )? EIGHT -> INT[\"28\"] | TWENTY ( DASH )? NINE -> INT[\"29\"] | THIRTY -> INT[\"30\"] | THIRTY ( DASH )? ONE -> INT[\"31\"] )
            int alt44=32;
            alt44 = dfa44.predict(input);
            switch (alt44) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:198:5: int_1_to_31
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_int_1_to_31_in_spelled_or_int_1_to_311648);
                    int_1_to_31110=int_1_to_31();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, int_1_to_31110.getTree());

                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:199:5: ONE
                    {
                    ONE111=(Token)match(input,ONE,FOLLOW_ONE_in_spelled_or_int_1_to_311654); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ONE.add(ONE111);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 199:16: -> INT[\"1\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "1"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:200:5: TWO
                    {
                    TWO112=(Token)match(input,TWO,FOLLOW_TWO_in_spelled_or_int_1_to_311672); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWO.add(TWO112);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 200:16: -> INT[\"2\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "2"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:201:5: THREE
                    {
                    THREE113=(Token)match(input,THREE,FOLLOW_THREE_in_spelled_or_int_1_to_311690); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THREE.add(THREE113);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 201:16: -> INT[\"3\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "3"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:202:5: FOUR
                    {
                    FOUR114=(Token)match(input,FOUR,FOLLOW_FOUR_in_spelled_or_int_1_to_311706); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FOUR.add(FOUR114);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 202:16: -> INT[\"4\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "4"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 6 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:203:5: FIVE
                    {
                    FIVE115=(Token)match(input,FIVE,FOLLOW_FIVE_in_spelled_or_int_1_to_311723); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FIVE.add(FIVE115);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 203:16: -> INT[\"5\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "5"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 7 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:204:5: SIX
                    {
                    SIX116=(Token)match(input,SIX,FOLLOW_SIX_in_spelled_or_int_1_to_311740); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SIX.add(SIX116);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 204:16: -> INT[\"6\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "6"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 8 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:205:5: SEVEN
                    {
                    SEVEN117=(Token)match(input,SEVEN,FOLLOW_SEVEN_in_spelled_or_int_1_to_311758); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEVEN.add(SEVEN117);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 205:16: -> INT[\"7\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "7"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 9 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:206:5: EIGHT
                    {
                    EIGHT118=(Token)match(input,EIGHT,FOLLOW_EIGHT_in_spelled_or_int_1_to_311774); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EIGHT.add(EIGHT118);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 206:16: -> INT[\"8\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "8"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 10 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:207:5: NINE
                    {
                    NINE119=(Token)match(input,NINE,FOLLOW_NINE_in_spelled_or_int_1_to_311790); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NINE.add(NINE119);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 207:16: -> INT[\"9\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "9"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 11 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:208:5: TEN
                    {
                    TEN120=(Token)match(input,TEN,FOLLOW_TEN_in_spelled_or_int_1_to_311807); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TEN.add(TEN120);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 208:16: -> INT[\"10\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "10"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 12 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:209:5: ELEVEN
                    {
                    ELEVEN121=(Token)match(input,ELEVEN,FOLLOW_ELEVEN_in_spelled_or_int_1_to_311825); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ELEVEN.add(ELEVEN121);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 209:16: -> INT[\"11\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "11"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 13 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:210:5: TWELVE
                    {
                    TWELVE122=(Token)match(input,TWELVE,FOLLOW_TWELVE_in_spelled_or_int_1_to_311840); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWELVE.add(TWELVE122);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 210:16: -> INT[\"12\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "12"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 14 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:211:5: THIRTEEN
                    {
                    THIRTEEN123=(Token)match(input,THIRTEEN,FOLLOW_THIRTEEN_in_spelled_or_int_1_to_311855); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THIRTEEN.add(THIRTEEN123);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 211:16: -> INT[\"13\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "13"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 15 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:212:5: FOURTEEN
                    {
                    FOURTEEN124=(Token)match(input,FOURTEEN,FOLLOW_FOURTEEN_in_spelled_or_int_1_to_311868); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FOURTEEN.add(FOURTEEN124);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 212:16: -> INT[\"14\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "14"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 16 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:213:5: FIFTEEN
                    {
                    FIFTEEN125=(Token)match(input,FIFTEEN,FOLLOW_FIFTEEN_in_spelled_or_int_1_to_311881); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FIFTEEN.add(FIFTEEN125);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 213:16: -> INT[\"15\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "15"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 17 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:214:5: SIXTEEN
                    {
                    SIXTEEN126=(Token)match(input,SIXTEEN,FOLLOW_SIXTEEN_in_spelled_or_int_1_to_311895); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SIXTEEN.add(SIXTEEN126);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 214:16: -> INT[\"16\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "16"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 18 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:215:5: SEVENTEEN
                    {
                    SEVENTEEN127=(Token)match(input,SEVENTEEN,FOLLOW_SEVENTEEN_in_spelled_or_int_1_to_311909); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEVENTEEN.add(SEVENTEEN127);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 215:16: -> INT[\"17\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "17"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 19 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:216:5: EIGHTEEN
                    {
                    EIGHTEEN128=(Token)match(input,EIGHTEEN,FOLLOW_EIGHTEEN_in_spelled_or_int_1_to_311921); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EIGHTEEN.add(EIGHTEEN128);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 216:16: -> INT[\"18\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "18"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 20 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:217:5: NINETEEN
                    {
                    NINETEEN129=(Token)match(input,NINETEEN,FOLLOW_NINETEEN_in_spelled_or_int_1_to_311934); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NINETEEN.add(NINETEEN129);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 217:16: -> INT[\"19\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "19"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 21 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:218:5: TWENTY
                    {
                    TWENTY130=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_or_int_1_to_311947); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY130);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 218:16: -> INT[\"20\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "20"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 22 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:219:5: TWENTY ( DASH )? ONE
                    {
                    TWENTY131=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_or_int_1_to_311962); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY131);

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:219:12: ( DASH )?
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( (LA34_0==DASH) ) {
                        alt34=1;
                    }
                    switch (alt34) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:219:12: DASH
                            {
                            DASH132=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_or_int_1_to_311964); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_DASH.add(DASH132);


                            }
                            break;

                    }

                    ONE133=(Token)match(input,ONE,FOLLOW_ONE_in_spelled_or_int_1_to_311967); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ONE.add(ONE133);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 219:24: -> INT[\"21\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "21"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 23 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:220:5: TWENTY ( DASH )? TWO
                    {
                    TWENTY134=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_or_int_1_to_311980); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY134);

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:220:12: ( DASH )?
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==DASH) ) {
                        alt35=1;
                    }
                    switch (alt35) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:220:12: DASH
                            {
                            DASH135=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_or_int_1_to_311982); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_DASH.add(DASH135);


                            }
                            break;

                    }

                    TWO136=(Token)match(input,TWO,FOLLOW_TWO_in_spelled_or_int_1_to_311985); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWO.add(TWO136);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 220:24: -> INT[\"22\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "22"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 24 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:221:5: TWENTY ( DASH )? THREE
                    {
                    TWENTY137=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_or_int_1_to_311998); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY137);

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:221:12: ( DASH )?
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0==DASH) ) {
                        alt36=1;
                    }
                    switch (alt36) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:221:12: DASH
                            {
                            DASH138=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_or_int_1_to_312000); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_DASH.add(DASH138);


                            }
                            break;

                    }

                    THREE139=(Token)match(input,THREE,FOLLOW_THREE_in_spelled_or_int_1_to_312003); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THREE.add(THREE139);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 221:24: -> INT[\"23\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "23"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 25 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:222:5: TWENTY ( DASH )? FOUR
                    {
                    TWENTY140=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_or_int_1_to_312014); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY140);

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:222:12: ( DASH )?
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( (LA37_0==DASH) ) {
                        alt37=1;
                    }
                    switch (alt37) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:222:12: DASH
                            {
                            DASH141=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_or_int_1_to_312016); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_DASH.add(DASH141);


                            }
                            break;

                    }

                    FOUR142=(Token)match(input,FOUR,FOLLOW_FOUR_in_spelled_or_int_1_to_312019); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FOUR.add(FOUR142);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 222:24: -> INT[\"24\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "24"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 26 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:223:5: TWENTY ( DASH )? FIVE
                    {
                    TWENTY143=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_or_int_1_to_312031); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY143);

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:223:12: ( DASH )?
                    int alt38=2;
                    int LA38_0 = input.LA(1);

                    if ( (LA38_0==DASH) ) {
                        alt38=1;
                    }
                    switch (alt38) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:223:12: DASH
                            {
                            DASH144=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_or_int_1_to_312033); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_DASH.add(DASH144);


                            }
                            break;

                    }

                    FIVE145=(Token)match(input,FIVE,FOLLOW_FIVE_in_spelled_or_int_1_to_312036); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FIVE.add(FIVE145);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 223:24: -> INT[\"25\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "25"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 27 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:224:5: TWENTY ( DASH )? SIX
                    {
                    TWENTY146=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_or_int_1_to_312048); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY146);

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:224:12: ( DASH )?
                    int alt39=2;
                    int LA39_0 = input.LA(1);

                    if ( (LA39_0==DASH) ) {
                        alt39=1;
                    }
                    switch (alt39) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:224:12: DASH
                            {
                            DASH147=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_or_int_1_to_312050); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_DASH.add(DASH147);


                            }
                            break;

                    }

                    SIX148=(Token)match(input,SIX,FOLLOW_SIX_in_spelled_or_int_1_to_312053); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SIX.add(SIX148);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 224:24: -> INT[\"26\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "26"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 28 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:225:5: TWENTY ( DASH )? SEVEN
                    {
                    TWENTY149=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_or_int_1_to_312066); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY149);

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:225:12: ( DASH )?
                    int alt40=2;
                    int LA40_0 = input.LA(1);

                    if ( (LA40_0==DASH) ) {
                        alt40=1;
                    }
                    switch (alt40) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:225:12: DASH
                            {
                            DASH150=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_or_int_1_to_312068); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_DASH.add(DASH150);


                            }
                            break;

                    }

                    SEVEN151=(Token)match(input,SEVEN,FOLLOW_SEVEN_in_spelled_or_int_1_to_312071); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEVEN.add(SEVEN151);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 225:24: -> INT[\"27\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "27"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 29 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:226:5: TWENTY ( DASH )? EIGHT
                    {
                    TWENTY152=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_or_int_1_to_312082); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY152);

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:226:12: ( DASH )?
                    int alt41=2;
                    int LA41_0 = input.LA(1);

                    if ( (LA41_0==DASH) ) {
                        alt41=1;
                    }
                    switch (alt41) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:226:12: DASH
                            {
                            DASH153=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_or_int_1_to_312084); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_DASH.add(DASH153);


                            }
                            break;

                    }

                    EIGHT154=(Token)match(input,EIGHT,FOLLOW_EIGHT_in_spelled_or_int_1_to_312087); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EIGHT.add(EIGHT154);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 226:24: -> INT[\"28\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "28"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 30 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:227:5: TWENTY ( DASH )? NINE
                    {
                    TWENTY155=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_or_int_1_to_312098); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY155);

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:227:12: ( DASH )?
                    int alt42=2;
                    int LA42_0 = input.LA(1);

                    if ( (LA42_0==DASH) ) {
                        alt42=1;
                    }
                    switch (alt42) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:227:12: DASH
                            {
                            DASH156=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_or_int_1_to_312100); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_DASH.add(DASH156);


                            }
                            break;

                    }

                    NINE157=(Token)match(input,NINE,FOLLOW_NINE_in_spelled_or_int_1_to_312103); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NINE.add(NINE157);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 227:24: -> INT[\"29\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "29"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 31 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:228:5: THIRTY
                    {
                    THIRTY158=(Token)match(input,THIRTY,FOLLOW_THIRTY_in_spelled_or_int_1_to_312115); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THIRTY.add(THIRTY158);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 228:24: -> INT[\"30\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "30"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 32 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:229:5: THIRTY ( DASH )? ONE
                    {
                    THIRTY159=(Token)match(input,THIRTY,FOLLOW_THIRTY_in_spelled_or_int_1_to_312138); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THIRTY.add(THIRTY159);

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:229:12: ( DASH )?
                    int alt43=2;
                    int LA43_0 = input.LA(1);

                    if ( (LA43_0==DASH) ) {
                        alt43=1;
                    }
                    switch (alt43) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:229:12: DASH
                            {
                            DASH160=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_or_int_1_to_312140); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_DASH.add(DASH160);


                            }
                            break;

                    }

                    ONE161=(Token)match(input,ONE,FOLLOW_ONE_in_spelled_or_int_1_to_312143); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ONE.add(ONE161);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 229:24: -> INT[\"31\"]
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
    // $ANTLR end "spelled_or_int_1_to_31"

    public static class spelled_sequence_1_to_31_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "spelled_sequence_1_to_31"
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:234:1: spelled_sequence_1_to_31 : ( FIRST -> INT[\"1\"] | SECOND -> INT[\"2\"] | THIRD -> INT[\"3\"] | FOURTH -> INT[\"4\"] | FIFTH -> INT[\"5\"] | SIXTH -> INT[\"6\"] | SEVENTH -> INT[\"7\"] | EIGHTH -> INT[\"8\"] | NINTH -> INT[\"9\"] | TENTH -> INT[\"10\"] | ELEVENTH -> INT[\"11\"] | TWELFTH -> INT[\"12\"] | THIRTEENTH -> INT[\"13\"] | FOURTEENTH -> INT[\"14\"] | FIFTEENTH -> INT[\"15\"] | SIXTEENTH -> INT[\"16\"] | SEVENTEENTH -> INT[\"17\"] | EIGHTEENTH -> INT[\"18\"] | NINETEENTH -> INT[\"19\"] | TWENTIETH -> INT[\"20\"] | ( TWENTY_FIRST | ( TWENTY ( DASH )? FIRST ) ) -> INT[\"21\"] | ( TWENTY_SECOND | ( TWENTY ( DASH )? SECOND ) ) -> INT[\"22\"] | ( TWENTY_THIRD | ( TWENTY ( DASH )? THIRD ) ) -> INT[\"23\"] | ( TWENTY_FOURTH | ( TWENTY ( DASH )? FOURTH ) ) -> INT[\"24\"] | ( TWENTY_FIFTH | ( TWENTY ( DASH )? FIFTH ) ) -> INT[\"25\"] | ( TWENTY_SIXTH | ( TWENTY ( DASH )? SIXTH ) ) -> INT[\"26\"] | ( TWENTY_SEVENTH | ( TWENTY ( DASH )? SEVENTH ) ) -> INT[\"27\"] | ( TWENTY_EIGHTH | ( TWENTY ( DASH )? EIGHTH ) ) -> INT[\"28\"] | ( TWENTY_NINTH | ( TWENTY ( DASH )? NINTH ) ) -> INT[\"29\"] | THIRTIETH -> INT[\"30\"] | ( THIRTY_FIRST | ( THIRTY ( DASH )? FIRST ) ) -> INT[\"31\"] );
    public final DateParser.spelled_sequence_1_to_31_return spelled_sequence_1_to_31() throws RecognitionException {
        DateParser.spelled_sequence_1_to_31_return retval = new DateParser.spelled_sequence_1_to_31_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token FIRST162=null;
        Token SECOND163=null;
        Token THIRD164=null;
        Token FOURTH165=null;
        Token FIFTH166=null;
        Token SIXTH167=null;
        Token SEVENTH168=null;
        Token EIGHTH169=null;
        Token NINTH170=null;
        Token TENTH171=null;
        Token ELEVENTH172=null;
        Token TWELFTH173=null;
        Token THIRTEENTH174=null;
        Token FOURTEENTH175=null;
        Token FIFTEENTH176=null;
        Token SIXTEENTH177=null;
        Token SEVENTEENTH178=null;
        Token EIGHTEENTH179=null;
        Token NINETEENTH180=null;
        Token TWENTIETH181=null;
        Token TWENTY_FIRST182=null;
        Token TWENTY183=null;
        Token DASH184=null;
        Token FIRST185=null;
        Token TWENTY_SECOND186=null;
        Token TWENTY187=null;
        Token DASH188=null;
        Token SECOND189=null;
        Token TWENTY_THIRD190=null;
        Token TWENTY191=null;
        Token DASH192=null;
        Token THIRD193=null;
        Token TWENTY_FOURTH194=null;
        Token TWENTY195=null;
        Token DASH196=null;
        Token FOURTH197=null;
        Token TWENTY_FIFTH198=null;
        Token TWENTY199=null;
        Token DASH200=null;
        Token FIFTH201=null;
        Token TWENTY_SIXTH202=null;
        Token TWENTY203=null;
        Token DASH204=null;
        Token SIXTH205=null;
        Token TWENTY_SEVENTH206=null;
        Token TWENTY207=null;
        Token DASH208=null;
        Token SEVENTH209=null;
        Token TWENTY_EIGHTH210=null;
        Token TWENTY211=null;
        Token DASH212=null;
        Token EIGHTH213=null;
        Token TWENTY_NINTH214=null;
        Token TWENTY215=null;
        Token DASH216=null;
        Token NINTH217=null;
        Token THIRTIETH218=null;
        Token THIRTY_FIRST219=null;
        Token THIRTY220=null;
        Token DASH221=null;
        Token FIRST222=null;

        Object FIRST162_tree=null;
        Object SECOND163_tree=null;
        Object THIRD164_tree=null;
        Object FOURTH165_tree=null;
        Object FIFTH166_tree=null;
        Object SIXTH167_tree=null;
        Object SEVENTH168_tree=null;
        Object EIGHTH169_tree=null;
        Object NINTH170_tree=null;
        Object TENTH171_tree=null;
        Object ELEVENTH172_tree=null;
        Object TWELFTH173_tree=null;
        Object THIRTEENTH174_tree=null;
        Object FOURTEENTH175_tree=null;
        Object FIFTEENTH176_tree=null;
        Object SIXTEENTH177_tree=null;
        Object SEVENTEENTH178_tree=null;
        Object EIGHTEENTH179_tree=null;
        Object NINETEENTH180_tree=null;
        Object TWENTIETH181_tree=null;
        Object TWENTY_FIRST182_tree=null;
        Object TWENTY183_tree=null;
        Object DASH184_tree=null;
        Object FIRST185_tree=null;
        Object TWENTY_SECOND186_tree=null;
        Object TWENTY187_tree=null;
        Object DASH188_tree=null;
        Object SECOND189_tree=null;
        Object TWENTY_THIRD190_tree=null;
        Object TWENTY191_tree=null;
        Object DASH192_tree=null;
        Object THIRD193_tree=null;
        Object TWENTY_FOURTH194_tree=null;
        Object TWENTY195_tree=null;
        Object DASH196_tree=null;
        Object FOURTH197_tree=null;
        Object TWENTY_FIFTH198_tree=null;
        Object TWENTY199_tree=null;
        Object DASH200_tree=null;
        Object FIFTH201_tree=null;
        Object TWENTY_SIXTH202_tree=null;
        Object TWENTY203_tree=null;
        Object DASH204_tree=null;
        Object SIXTH205_tree=null;
        Object TWENTY_SEVENTH206_tree=null;
        Object TWENTY207_tree=null;
        Object DASH208_tree=null;
        Object SEVENTH209_tree=null;
        Object TWENTY_EIGHTH210_tree=null;
        Object TWENTY211_tree=null;
        Object DASH212_tree=null;
        Object EIGHTH213_tree=null;
        Object TWENTY_NINTH214_tree=null;
        Object TWENTY215_tree=null;
        Object DASH216_tree=null;
        Object NINTH217_tree=null;
        Object THIRTIETH218_tree=null;
        Object THIRTY_FIRST219_tree=null;
        Object THIRTY220_tree=null;
        Object DASH221_tree=null;
        Object FIRST222_tree=null;
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
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:235:3: ( FIRST -> INT[\"1\"] | SECOND -> INT[\"2\"] | THIRD -> INT[\"3\"] | FOURTH -> INT[\"4\"] | FIFTH -> INT[\"5\"] | SIXTH -> INT[\"6\"] | SEVENTH -> INT[\"7\"] | EIGHTH -> INT[\"8\"] | NINTH -> INT[\"9\"] | TENTH -> INT[\"10\"] | ELEVENTH -> INT[\"11\"] | TWELFTH -> INT[\"12\"] | THIRTEENTH -> INT[\"13\"] | FOURTEENTH -> INT[\"14\"] | FIFTEENTH -> INT[\"15\"] | SIXTEENTH -> INT[\"16\"] | SEVENTEENTH -> INT[\"17\"] | EIGHTEENTH -> INT[\"18\"] | NINETEENTH -> INT[\"19\"] | TWENTIETH -> INT[\"20\"] | ( TWENTY_FIRST | ( TWENTY ( DASH )? FIRST ) ) -> INT[\"21\"] | ( TWENTY_SECOND | ( TWENTY ( DASH )? SECOND ) ) -> INT[\"22\"] | ( TWENTY_THIRD | ( TWENTY ( DASH )? THIRD ) ) -> INT[\"23\"] | ( TWENTY_FOURTH | ( TWENTY ( DASH )? FOURTH ) ) -> INT[\"24\"] | ( TWENTY_FIFTH | ( TWENTY ( DASH )? FIFTH ) ) -> INT[\"25\"] | ( TWENTY_SIXTH | ( TWENTY ( DASH )? SIXTH ) ) -> INT[\"26\"] | ( TWENTY_SEVENTH | ( TWENTY ( DASH )? SEVENTH ) ) -> INT[\"27\"] | ( TWENTY_EIGHTH | ( TWENTY ( DASH )? EIGHTH ) ) -> INT[\"28\"] | ( TWENTY_NINTH | ( TWENTY ( DASH )? NINTH ) ) -> INT[\"29\"] | THIRTIETH -> INT[\"30\"] | ( THIRTY_FIRST | ( THIRTY ( DASH )? FIRST ) ) -> INT[\"31\"] )
            int alt65=31;
            alt65 = dfa65.predict(input);
            switch (alt65) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:235:5: FIRST
                    {
                    FIRST162=(Token)match(input,FIRST,FOLLOW_FIRST_in_spelled_sequence_1_to_312167); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FIRST.add(FIRST162);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 235:17: -> INT[\"1\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "1"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:236:5: SECOND
                    {
                    SECOND163=(Token)match(input,SECOND,FOLLOW_SECOND_in_spelled_sequence_1_to_312184); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SECOND.add(SECOND163);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 236:17: -> INT[\"2\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "2"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:237:5: THIRD
                    {
                    THIRD164=(Token)match(input,THIRD,FOLLOW_THIRD_in_spelled_sequence_1_to_312200); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THIRD.add(THIRD164);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 237:17: -> INT[\"3\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "3"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:238:5: FOURTH
                    {
                    FOURTH165=(Token)match(input,FOURTH,FOLLOW_FOURTH_in_spelled_sequence_1_to_312217); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FOURTH.add(FOURTH165);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 238:17: -> INT[\"4\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "4"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:239:5: FIFTH
                    {
                    FIFTH166=(Token)match(input,FIFTH,FOLLOW_FIFTH_in_spelled_sequence_1_to_312233); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FIFTH.add(FIFTH166);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 239:17: -> INT[\"5\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "5"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 6 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:240:5: SIXTH
                    {
                    SIXTH167=(Token)match(input,SIXTH,FOLLOW_SIXTH_in_spelled_sequence_1_to_312250); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SIXTH.add(SIXTH167);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 240:17: -> INT[\"6\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "6"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 7 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:241:5: SEVENTH
                    {
                    SEVENTH168=(Token)match(input,SEVENTH,FOLLOW_SEVENTH_in_spelled_sequence_1_to_312267); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEVENTH.add(SEVENTH168);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 241:17: -> INT[\"7\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "7"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 8 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:242:5: EIGHTH
                    {
                    EIGHTH169=(Token)match(input,EIGHTH,FOLLOW_EIGHTH_in_spelled_sequence_1_to_312282); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EIGHTH.add(EIGHTH169);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 242:17: -> INT[\"8\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "8"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 9 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:243:5: NINTH
                    {
                    NINTH170=(Token)match(input,NINTH,FOLLOW_NINTH_in_spelled_sequence_1_to_312298); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NINTH.add(NINTH170);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 243:17: -> INT[\"9\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "9"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 10 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:244:5: TENTH
                    {
                    TENTH171=(Token)match(input,TENTH,FOLLOW_TENTH_in_spelled_sequence_1_to_312315); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TENTH.add(TENTH171);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 244:17: -> INT[\"10\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "10"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 11 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:245:5: ELEVENTH
                    {
                    ELEVENTH172=(Token)match(input,ELEVENTH,FOLLOW_ELEVENTH_in_spelled_sequence_1_to_312332); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ELEVENTH.add(ELEVENTH172);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 245:17: -> INT[\"11\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "11"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 12 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:246:5: TWELFTH
                    {
                    TWELFTH173=(Token)match(input,TWELFTH,FOLLOW_TWELFTH_in_spelled_sequence_1_to_312346); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWELFTH.add(TWELFTH173);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 246:17: -> INT[\"12\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "12"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 13 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:247:5: THIRTEENTH
                    {
                    THIRTEENTH174=(Token)match(input,THIRTEENTH,FOLLOW_THIRTEENTH_in_spelled_sequence_1_to_312361); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THIRTEENTH.add(THIRTEENTH174);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 247:17: -> INT[\"13\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "13"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 14 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:248:5: FOURTEENTH
                    {
                    FOURTEENTH175=(Token)match(input,FOURTEENTH,FOLLOW_FOURTEENTH_in_spelled_sequence_1_to_312373); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FOURTEENTH.add(FOURTEENTH175);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 248:17: -> INT[\"14\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "14"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 15 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:249:5: FIFTEENTH
                    {
                    FIFTEENTH176=(Token)match(input,FIFTEENTH,FOLLOW_FIFTEENTH_in_spelled_sequence_1_to_312385); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FIFTEENTH.add(FIFTEENTH176);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 249:17: -> INT[\"15\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "15"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 16 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:250:5: SIXTEENTH
                    {
                    SIXTEENTH177=(Token)match(input,SIXTEENTH,FOLLOW_SIXTEENTH_in_spelled_sequence_1_to_312398); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SIXTEENTH.add(SIXTEENTH177);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 250:17: -> INT[\"16\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "16"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 17 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:251:5: SEVENTEENTH
                    {
                    SEVENTEENTH178=(Token)match(input,SEVENTEENTH,FOLLOW_SEVENTEENTH_in_spelled_sequence_1_to_312411); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEVENTEENTH.add(SEVENTEENTH178);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 251:17: -> INT[\"17\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "17"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 18 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:252:5: EIGHTEENTH
                    {
                    EIGHTEENTH179=(Token)match(input,EIGHTEENTH,FOLLOW_EIGHTEENTH_in_spelled_sequence_1_to_312422); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EIGHTEENTH.add(EIGHTEENTH179);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 252:17: -> INT[\"18\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "18"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 19 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:253:5: NINETEENTH
                    {
                    NINETEENTH180=(Token)match(input,NINETEENTH,FOLLOW_NINETEENTH_in_spelled_sequence_1_to_312434); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NINETEENTH.add(NINETEENTH180);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 253:17: -> INT[\"19\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "19"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 20 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:254:5: TWENTIETH
                    {
                    TWENTIETH181=(Token)match(input,TWENTIETH,FOLLOW_TWENTIETH_in_spelled_sequence_1_to_312446); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWENTIETH.add(TWENTIETH181);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 254:17: -> INT[\"20\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "20"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 21 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:255:5: ( TWENTY_FIRST | ( TWENTY ( DASH )? FIRST ) )
                    {
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:255:5: ( TWENTY_FIRST | ( TWENTY ( DASH )? FIRST ) )
                    int alt46=2;
                    int LA46_0 = input.LA(1);

                    if ( (LA46_0==TWENTY_FIRST) ) {
                        alt46=1;
                    }
                    else if ( (LA46_0==TWENTY) ) {
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
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:255:6: TWENTY_FIRST
                            {
                            TWENTY_FIRST182=(Token)match(input,TWENTY_FIRST,FOLLOW_TWENTY_FIRST_in_spelled_sequence_1_to_312460); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY_FIRST.add(TWENTY_FIRST182);


                            }
                            break;
                        case 2 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:255:23: ( TWENTY ( DASH )? FIRST )
                            {
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:255:23: ( TWENTY ( DASH )? FIRST )
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:255:24: TWENTY ( DASH )? FIRST
                            {
                            TWENTY183=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_sequence_1_to_312467); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY183);

                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:255:31: ( DASH )?
                            int alt45=2;
                            int LA45_0 = input.LA(1);

                            if ( (LA45_0==DASH) ) {
                                alt45=1;
                            }
                            switch (alt45) {
                                case 1 :
                                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:255:31: DASH
                                    {
                                    DASH184=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_sequence_1_to_312469); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_DASH.add(DASH184);


                                    }
                                    break;

                            }

                            FIRST185=(Token)match(input,FIRST,FOLLOW_FIRST_in_spelled_sequence_1_to_312472); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_FIRST.add(FIRST185);


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
                    // 255:47: -> INT[\"21\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "21"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 22 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:256:5: ( TWENTY_SECOND | ( TWENTY ( DASH )? SECOND ) )
                    {
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:256:5: ( TWENTY_SECOND | ( TWENTY ( DASH )? SECOND ) )
                    int alt48=2;
                    int LA48_0 = input.LA(1);

                    if ( (LA48_0==TWENTY_SECOND) ) {
                        alt48=1;
                    }
                    else if ( (LA48_0==TWENTY) ) {
                        alt48=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 48, 0, input);

                        throw nvae;
                    }
                    switch (alt48) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:256:6: TWENTY_SECOND
                            {
                            TWENTY_SECOND186=(Token)match(input,TWENTY_SECOND,FOLLOW_TWENTY_SECOND_in_spelled_sequence_1_to_312488); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY_SECOND.add(TWENTY_SECOND186);


                            }
                            break;
                        case 2 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:256:23: ( TWENTY ( DASH )? SECOND )
                            {
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:256:23: ( TWENTY ( DASH )? SECOND )
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:256:24: TWENTY ( DASH )? SECOND
                            {
                            TWENTY187=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_sequence_1_to_312494); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY187);

                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:256:31: ( DASH )?
                            int alt47=2;
                            int LA47_0 = input.LA(1);

                            if ( (LA47_0==DASH) ) {
                                alt47=1;
                            }
                            switch (alt47) {
                                case 1 :
                                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:256:31: DASH
                                    {
                                    DASH188=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_sequence_1_to_312496); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_DASH.add(DASH188);


                                    }
                                    break;

                            }

                            SECOND189=(Token)match(input,SECOND,FOLLOW_SECOND_in_spelled_sequence_1_to_312499); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_SECOND.add(SECOND189);


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
                    // 256:47: -> INT[\"22\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "22"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 23 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:257:5: ( TWENTY_THIRD | ( TWENTY ( DASH )? THIRD ) )
                    {
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:257:5: ( TWENTY_THIRD | ( TWENTY ( DASH )? THIRD ) )
                    int alt50=2;
                    int LA50_0 = input.LA(1);

                    if ( (LA50_0==TWENTY_THIRD) ) {
                        alt50=1;
                    }
                    else if ( (LA50_0==TWENTY) ) {
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
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:257:6: TWENTY_THIRD
                            {
                            TWENTY_THIRD190=(Token)match(input,TWENTY_THIRD,FOLLOW_TWENTY_THIRD_in_spelled_sequence_1_to_312514); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY_THIRD.add(TWENTY_THIRD190);


                            }
                            break;
                        case 2 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:257:23: ( TWENTY ( DASH )? THIRD )
                            {
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:257:23: ( TWENTY ( DASH )? THIRD )
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:257:24: TWENTY ( DASH )? THIRD
                            {
                            TWENTY191=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_sequence_1_to_312521); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY191);

                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:257:31: ( DASH )?
                            int alt49=2;
                            int LA49_0 = input.LA(1);

                            if ( (LA49_0==DASH) ) {
                                alt49=1;
                            }
                            switch (alt49) {
                                case 1 :
                                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:257:31: DASH
                                    {
                                    DASH192=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_sequence_1_to_312523); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_DASH.add(DASH192);


                                    }
                                    break;

                            }

                            THIRD193=(Token)match(input,THIRD,FOLLOW_THIRD_in_spelled_sequence_1_to_312526); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_THIRD.add(THIRD193);


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
                    // 257:47: -> INT[\"23\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "23"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 24 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:258:5: ( TWENTY_FOURTH | ( TWENTY ( DASH )? FOURTH ) )
                    {
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:258:5: ( TWENTY_FOURTH | ( TWENTY ( DASH )? FOURTH ) )
                    int alt52=2;
                    int LA52_0 = input.LA(1);

                    if ( (LA52_0==TWENTY_FOURTH) ) {
                        alt52=1;
                    }
                    else if ( (LA52_0==TWENTY) ) {
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
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:258:6: TWENTY_FOURTH
                            {
                            TWENTY_FOURTH194=(Token)match(input,TWENTY_FOURTH,FOLLOW_TWENTY_FOURTH_in_spelled_sequence_1_to_312542); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY_FOURTH.add(TWENTY_FOURTH194);


                            }
                            break;
                        case 2 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:258:23: ( TWENTY ( DASH )? FOURTH )
                            {
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:258:23: ( TWENTY ( DASH )? FOURTH )
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:258:24: TWENTY ( DASH )? FOURTH
                            {
                            TWENTY195=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_sequence_1_to_312548); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY195);

                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:258:31: ( DASH )?
                            int alt51=2;
                            int LA51_0 = input.LA(1);

                            if ( (LA51_0==DASH) ) {
                                alt51=1;
                            }
                            switch (alt51) {
                                case 1 :
                                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:258:31: DASH
                                    {
                                    DASH196=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_sequence_1_to_312550); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_DASH.add(DASH196);


                                    }
                                    break;

                            }

                            FOURTH197=(Token)match(input,FOURTH,FOLLOW_FOURTH_in_spelled_sequence_1_to_312553); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_FOURTH.add(FOURTH197);


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
                    // 258:47: -> INT[\"24\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "24"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 25 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:259:5: ( TWENTY_FIFTH | ( TWENTY ( DASH )? FIFTH ) )
                    {
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:259:5: ( TWENTY_FIFTH | ( TWENTY ( DASH )? FIFTH ) )
                    int alt54=2;
                    int LA54_0 = input.LA(1);

                    if ( (LA54_0==TWENTY_FIFTH) ) {
                        alt54=1;
                    }
                    else if ( (LA54_0==TWENTY) ) {
                        alt54=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 54, 0, input);

                        throw nvae;
                    }
                    switch (alt54) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:259:6: TWENTY_FIFTH
                            {
                            TWENTY_FIFTH198=(Token)match(input,TWENTY_FIFTH,FOLLOW_TWENTY_FIFTH_in_spelled_sequence_1_to_312568); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY_FIFTH.add(TWENTY_FIFTH198);


                            }
                            break;
                        case 2 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:259:23: ( TWENTY ( DASH )? FIFTH )
                            {
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:259:23: ( TWENTY ( DASH )? FIFTH )
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:259:24: TWENTY ( DASH )? FIFTH
                            {
                            TWENTY199=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_sequence_1_to_312575); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY199);

                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:259:31: ( DASH )?
                            int alt53=2;
                            int LA53_0 = input.LA(1);

                            if ( (LA53_0==DASH) ) {
                                alt53=1;
                            }
                            switch (alt53) {
                                case 1 :
                                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:259:31: DASH
                                    {
                                    DASH200=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_sequence_1_to_312577); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_DASH.add(DASH200);


                                    }
                                    break;

                            }

                            FIFTH201=(Token)match(input,FIFTH,FOLLOW_FIFTH_in_spelled_sequence_1_to_312580); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_FIFTH.add(FIFTH201);


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
                    // 259:47: -> INT[\"25\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "25"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 26 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:260:5: ( TWENTY_SIXTH | ( TWENTY ( DASH )? SIXTH ) )
                    {
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:260:5: ( TWENTY_SIXTH | ( TWENTY ( DASH )? SIXTH ) )
                    int alt56=2;
                    int LA56_0 = input.LA(1);

                    if ( (LA56_0==TWENTY_SIXTH) ) {
                        alt56=1;
                    }
                    else if ( (LA56_0==TWENTY) ) {
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
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:260:6: TWENTY_SIXTH
                            {
                            TWENTY_SIXTH202=(Token)match(input,TWENTY_SIXTH,FOLLOW_TWENTY_SIXTH_in_spelled_sequence_1_to_312596); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY_SIXTH.add(TWENTY_SIXTH202);


                            }
                            break;
                        case 2 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:260:23: ( TWENTY ( DASH )? SIXTH )
                            {
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:260:23: ( TWENTY ( DASH )? SIXTH )
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:260:24: TWENTY ( DASH )? SIXTH
                            {
                            TWENTY203=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_sequence_1_to_312603); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY203);

                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:260:31: ( DASH )?
                            int alt55=2;
                            int LA55_0 = input.LA(1);

                            if ( (LA55_0==DASH) ) {
                                alt55=1;
                            }
                            switch (alt55) {
                                case 1 :
                                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:260:31: DASH
                                    {
                                    DASH204=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_sequence_1_to_312605); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_DASH.add(DASH204);


                                    }
                                    break;

                            }

                            SIXTH205=(Token)match(input,SIXTH,FOLLOW_SIXTH_in_spelled_sequence_1_to_312608); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_SIXTH.add(SIXTH205);


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
                    // 260:47: -> INT[\"26\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "26"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 27 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:261:5: ( TWENTY_SEVENTH | ( TWENTY ( DASH )? SEVENTH ) )
                    {
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:261:5: ( TWENTY_SEVENTH | ( TWENTY ( DASH )? SEVENTH ) )
                    int alt58=2;
                    int LA58_0 = input.LA(1);

                    if ( (LA58_0==TWENTY_SEVENTH) ) {
                        alt58=1;
                    }
                    else if ( (LA58_0==TWENTY) ) {
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
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:261:6: TWENTY_SEVENTH
                            {
                            TWENTY_SEVENTH206=(Token)match(input,TWENTY_SEVENTH,FOLLOW_TWENTY_SEVENTH_in_spelled_sequence_1_to_312624); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY_SEVENTH.add(TWENTY_SEVENTH206);


                            }
                            break;
                        case 2 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:261:23: ( TWENTY ( DASH )? SEVENTH )
                            {
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:261:23: ( TWENTY ( DASH )? SEVENTH )
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:261:24: TWENTY ( DASH )? SEVENTH
                            {
                            TWENTY207=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_sequence_1_to_312629); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY207);

                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:261:31: ( DASH )?
                            int alt57=2;
                            int LA57_0 = input.LA(1);

                            if ( (LA57_0==DASH) ) {
                                alt57=1;
                            }
                            switch (alt57) {
                                case 1 :
                                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:261:31: DASH
                                    {
                                    DASH208=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_sequence_1_to_312631); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_DASH.add(DASH208);


                                    }
                                    break;

                            }

                            SEVENTH209=(Token)match(input,SEVENTH,FOLLOW_SEVENTH_in_spelled_sequence_1_to_312634); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_SEVENTH.add(SEVENTH209);


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
                    // 261:47: -> INT[\"27\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "27"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 28 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:262:5: ( TWENTY_EIGHTH | ( TWENTY ( DASH )? EIGHTH ) )
                    {
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:262:5: ( TWENTY_EIGHTH | ( TWENTY ( DASH )? EIGHTH ) )
                    int alt60=2;
                    int LA60_0 = input.LA(1);

                    if ( (LA60_0==TWENTY_EIGHTH) ) {
                        alt60=1;
                    }
                    else if ( (LA60_0==TWENTY) ) {
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
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:262:6: TWENTY_EIGHTH
                            {
                            TWENTY_EIGHTH210=(Token)match(input,TWENTY_EIGHTH,FOLLOW_TWENTY_EIGHTH_in_spelled_sequence_1_to_312648); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY_EIGHTH.add(TWENTY_EIGHTH210);


                            }
                            break;
                        case 2 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:262:23: ( TWENTY ( DASH )? EIGHTH )
                            {
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:262:23: ( TWENTY ( DASH )? EIGHTH )
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:262:24: TWENTY ( DASH )? EIGHTH
                            {
                            TWENTY211=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_sequence_1_to_312654); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY211);

                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:262:31: ( DASH )?
                            int alt59=2;
                            int LA59_0 = input.LA(1);

                            if ( (LA59_0==DASH) ) {
                                alt59=1;
                            }
                            switch (alt59) {
                                case 1 :
                                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:262:31: DASH
                                    {
                                    DASH212=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_sequence_1_to_312656); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_DASH.add(DASH212);


                                    }
                                    break;

                            }

                            EIGHTH213=(Token)match(input,EIGHTH,FOLLOW_EIGHTH_in_spelled_sequence_1_to_312659); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_EIGHTH.add(EIGHTH213);


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
                    // 262:47: -> INT[\"28\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "28"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 29 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:263:5: ( TWENTY_NINTH | ( TWENTY ( DASH )? NINTH ) )
                    {
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:263:5: ( TWENTY_NINTH | ( TWENTY ( DASH )? NINTH ) )
                    int alt62=2;
                    int LA62_0 = input.LA(1);

                    if ( (LA62_0==TWENTY_NINTH) ) {
                        alt62=1;
                    }
                    else if ( (LA62_0==TWENTY) ) {
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
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:263:6: TWENTY_NINTH
                            {
                            TWENTY_NINTH214=(Token)match(input,TWENTY_NINTH,FOLLOW_TWENTY_NINTH_in_spelled_sequence_1_to_312674); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY_NINTH.add(TWENTY_NINTH214);


                            }
                            break;
                        case 2 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:263:23: ( TWENTY ( DASH )? NINTH )
                            {
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:263:23: ( TWENTY ( DASH )? NINTH )
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:263:24: TWENTY ( DASH )? NINTH
                            {
                            TWENTY215=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_sequence_1_to_312681); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY215);

                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:263:31: ( DASH )?
                            int alt61=2;
                            int LA61_0 = input.LA(1);

                            if ( (LA61_0==DASH) ) {
                                alt61=1;
                            }
                            switch (alt61) {
                                case 1 :
                                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:263:31: DASH
                                    {
                                    DASH216=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_sequence_1_to_312683); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_DASH.add(DASH216);


                                    }
                                    break;

                            }

                            NINTH217=(Token)match(input,NINTH,FOLLOW_NINTH_in_spelled_sequence_1_to_312686); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NINTH.add(NINTH217);


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
                    // 263:47: -> INT[\"29\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "29"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 30 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:264:5: THIRTIETH
                    {
                    THIRTIETH218=(Token)match(input,THIRTIETH,FOLLOW_THIRTIETH_in_spelled_sequence_1_to_312701); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THIRTIETH.add(THIRTIETH218);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 264:47: -> INT[\"30\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "30"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 31 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:265:5: ( THIRTY_FIRST | ( THIRTY ( DASH )? FIRST ) )
                    {
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:265:5: ( THIRTY_FIRST | ( THIRTY ( DASH )? FIRST ) )
                    int alt64=2;
                    int LA64_0 = input.LA(1);

                    if ( (LA64_0==THIRTY_FIRST) ) {
                        alt64=1;
                    }
                    else if ( (LA64_0==THIRTY) ) {
                        alt64=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 64, 0, input);

                        throw nvae;
                    }
                    switch (alt64) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:265:6: THIRTY_FIRST
                            {
                            THIRTY_FIRST219=(Token)match(input,THIRTY_FIRST,FOLLOW_THIRTY_FIRST_in_spelled_sequence_1_to_312745); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_THIRTY_FIRST.add(THIRTY_FIRST219);


                            }
                            break;
                        case 2 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:265:23: ( THIRTY ( DASH )? FIRST )
                            {
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:265:23: ( THIRTY ( DASH )? FIRST )
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:265:24: THIRTY ( DASH )? FIRST
                            {
                            THIRTY220=(Token)match(input,THIRTY,FOLLOW_THIRTY_in_spelled_sequence_1_to_312752); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_THIRTY.add(THIRTY220);

                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:265:31: ( DASH )?
                            int alt63=2;
                            int LA63_0 = input.LA(1);

                            if ( (LA63_0==DASH) ) {
                                alt63=1;
                            }
                            switch (alt63) {
                                case 1 :
                                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:265:31: DASH
                                    {
                                    DASH221=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_sequence_1_to_312754); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_DASH.add(DASH221);


                                    }
                                    break;

                            }

                            FIRST222=(Token)match(input,FIRST,FOLLOW_FIRST_in_spelled_sequence_1_to_312757); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_FIRST.add(FIRST222);


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
                    // 265:47: -> INT[\"31\"]
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
    // $ANTLR end "spelled_sequence_1_to_31"

    public static class int_up_to_4_digits_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "int_up_to_4_digits"
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:269:1: int_up_to_4_digits : ( int_0_to_99_optional_prefix | THREE_DIGIT -> INT[$THREE_DIGIT.text] | FOUR_DIGIT -> INT[$FOUR_DIGIT.text] );
    public final DateParser.int_up_to_4_digits_return int_up_to_4_digits() throws RecognitionException {
        DateParser.int_up_to_4_digits_return retval = new DateParser.int_up_to_4_digits_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token THREE_DIGIT224=null;
        Token FOUR_DIGIT225=null;
        DateParser.int_0_to_99_optional_prefix_return int_0_to_99_optional_prefix223 = null;


        Object THREE_DIGIT224_tree=null;
        Object FOUR_DIGIT225_tree=null;
        RewriteRuleTokenStream stream_FOUR_DIGIT=new RewriteRuleTokenStream(adaptor,"token FOUR_DIGIT");
        RewriteRuleTokenStream stream_THREE_DIGIT=new RewriteRuleTokenStream(adaptor,"token THREE_DIGIT");

        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:270:3: ( int_0_to_99_optional_prefix | THREE_DIGIT -> INT[$THREE_DIGIT.text] | FOUR_DIGIT -> INT[$FOUR_DIGIT.text] )
            int alt66=3;
            switch ( input.LA(1) ) {
            case TWO_ZEROS:
            case PREFIXED_ONE_TO_NINE:
            case ONE_TO_NINE:
            case TEN_TO_TWELVE:
            case ONE_ZERO:
            case THIRTEEN_TO_TWENTY_THREE:
            case TWENTY_FOUR_TO_THIRTY_ONE:
            case THIRTY_TWO_TO_FIFTY_NINE:
            case SIXTY_TO_NINETY_NINE:
                {
                alt66=1;
                }
                break;
            case THREE_DIGIT:
                {
                alt66=2;
                }
                break;
            case FOUR_DIGIT:
                {
                alt66=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 66, 0, input);

                throw nvae;
            }

            switch (alt66) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:270:5: int_0_to_99_optional_prefix
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_int_0_to_99_optional_prefix_in_int_up_to_4_digits2782);
                    int_0_to_99_optional_prefix223=int_0_to_99_optional_prefix();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, int_0_to_99_optional_prefix223.getTree());

                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:271:5: THREE_DIGIT
                    {
                    THREE_DIGIT224=(Token)match(input,THREE_DIGIT,FOLLOW_THREE_DIGIT_in_int_up_to_4_digits2788); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THREE_DIGIT.add(THREE_DIGIT224);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 271:17: -> INT[$THREE_DIGIT.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, (THREE_DIGIT224!=null?THREE_DIGIT224.getText():null)));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:272:5: FOUR_DIGIT
                    {
                    FOUR_DIGIT225=(Token)match(input,FOUR_DIGIT,FOLLOW_FOUR_DIGIT_in_int_up_to_4_digits2799); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FOUR_DIGIT.add(FOUR_DIGIT225);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 272:17: -> INT[$FOUR_DIGIT.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, (FOUR_DIGIT225!=null?FOUR_DIGIT225.getText():null)));

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
    // $ANTLR end "int_up_to_4_digits"

    public static class int_3_or_4_digits_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "int_3_or_4_digits"
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:276:1: int_3_or_4_digits : ( THREE_DIGIT -> INT[$THREE_DIGIT.text] | FOUR_DIGIT -> INT[$FOUR_DIGIT.text] );
    public final DateParser.int_3_or_4_digits_return int_3_or_4_digits() throws RecognitionException {
        DateParser.int_3_or_4_digits_return retval = new DateParser.int_3_or_4_digits_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token THREE_DIGIT226=null;
        Token FOUR_DIGIT227=null;

        Object THREE_DIGIT226_tree=null;
        Object FOUR_DIGIT227_tree=null;
        RewriteRuleTokenStream stream_FOUR_DIGIT=new RewriteRuleTokenStream(adaptor,"token FOUR_DIGIT");
        RewriteRuleTokenStream stream_THREE_DIGIT=new RewriteRuleTokenStream(adaptor,"token THREE_DIGIT");

        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:277:3: ( THREE_DIGIT -> INT[$THREE_DIGIT.text] | FOUR_DIGIT -> INT[$FOUR_DIGIT.text] )
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==THREE_DIGIT) ) {
                alt67=1;
            }
            else if ( (LA67_0==FOUR_DIGIT) ) {
                alt67=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 67, 0, input);

                throw nvae;
            }
            switch (alt67) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:277:5: THREE_DIGIT
                    {
                    THREE_DIGIT226=(Token)match(input,THREE_DIGIT,FOLLOW_THREE_DIGIT_in_int_3_or_4_digits2821); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THREE_DIGIT.add(THREE_DIGIT226);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 277:17: -> INT[$THREE_DIGIT.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, (THREE_DIGIT226!=null?THREE_DIGIT226.getText():null)));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:278:5: FOUR_DIGIT
                    {
                    FOUR_DIGIT227=(Token)match(input,FOUR_DIGIT,FOLLOW_FOUR_DIGIT_in_int_3_or_4_digits2832); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FOUR_DIGIT.add(FOUR_DIGIT227);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 278:17: -> INT[$FOUR_DIGIT.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, (FOUR_DIGIT227!=null?FOUR_DIGIT227.getText():null)));

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
    // $ANTLR end "int_3_or_4_digits"

    public static class int_4_digits_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "int_4_digits"
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:282:1: int_4_digits : FOUR_DIGIT -> INT[$FOUR_DIGIT.text] ;
    public final DateParser.int_4_digits_return int_4_digits() throws RecognitionException {
        DateParser.int_4_digits_return retval = new DateParser.int_4_digits_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token FOUR_DIGIT228=null;

        Object FOUR_DIGIT228_tree=null;
        RewriteRuleTokenStream stream_FOUR_DIGIT=new RewriteRuleTokenStream(adaptor,"token FOUR_DIGIT");

        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:283:3: ( FOUR_DIGIT -> INT[$FOUR_DIGIT.text] )
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:283:5: FOUR_DIGIT
            {
            FOUR_DIGIT228=(Token)match(input,FOUR_DIGIT,FOLLOW_FOUR_DIGIT_in_int_4_digits2854); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_FOUR_DIGIT.add(FOUR_DIGIT228);



            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 283:16: -> INT[$FOUR_DIGIT.text]
            {
                adaptor.addChild(root_0, (Object)adaptor.create(INT, (FOUR_DIGIT228!=null?FOUR_DIGIT228.getText():null)));

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
    // $ANTLR end "int_4_digits"

    public static class int_1_to_12_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "int_1_to_12"
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:286:1: int_1_to_12 : ( TWO_ZEROS -> INT[$TWO_ZEROS.text] | PREFIXED_ONE_TO_NINE -> INT[$PREFIXED_ONE_TO_NINE.text] | ONE_TO_NINE -> INT[$ONE_TO_NINE.text] | TEN_TO_TWELVE -> INT[$TEN_TO_TWELVE.text] );
    public final DateParser.int_1_to_12_return int_1_to_12() throws RecognitionException {
        DateParser.int_1_to_12_return retval = new DateParser.int_1_to_12_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TWO_ZEROS229=null;
        Token PREFIXED_ONE_TO_NINE230=null;
        Token ONE_TO_NINE231=null;
        Token TEN_TO_TWELVE232=null;

        Object TWO_ZEROS229_tree=null;
        Object PREFIXED_ONE_TO_NINE230_tree=null;
        Object ONE_TO_NINE231_tree=null;
        Object TEN_TO_TWELVE232_tree=null;
        RewriteRuleTokenStream stream_ONE_TO_NINE=new RewriteRuleTokenStream(adaptor,"token ONE_TO_NINE");
        RewriteRuleTokenStream stream_TWO_ZEROS=new RewriteRuleTokenStream(adaptor,"token TWO_ZEROS");
        RewriteRuleTokenStream stream_TEN_TO_TWELVE=new RewriteRuleTokenStream(adaptor,"token TEN_TO_TWELVE");
        RewriteRuleTokenStream stream_PREFIXED_ONE_TO_NINE=new RewriteRuleTokenStream(adaptor,"token PREFIXED_ONE_TO_NINE");

        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:287:3: ( TWO_ZEROS -> INT[$TWO_ZEROS.text] | PREFIXED_ONE_TO_NINE -> INT[$PREFIXED_ONE_TO_NINE.text] | ONE_TO_NINE -> INT[$ONE_TO_NINE.text] | TEN_TO_TWELVE -> INT[$TEN_TO_TWELVE.text] )
            int alt68=4;
            switch ( input.LA(1) ) {
            case TWO_ZEROS:
                {
                alt68=1;
                }
                break;
            case PREFIXED_ONE_TO_NINE:
                {
                alt68=2;
                }
                break;
            case ONE_TO_NINE:
                {
                alt68=3;
                }
                break;
            case TEN_TO_TWELVE:
                {
                alt68=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 68, 0, input);

                throw nvae;
            }

            switch (alt68) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:287:5: TWO_ZEROS
                    {
                    TWO_ZEROS229=(Token)match(input,TWO_ZEROS,FOLLOW_TWO_ZEROS_in_int_1_to_122874); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWO_ZEROS.add(TWO_ZEROS229);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 287:26: -> INT[$TWO_ZEROS.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, (TWO_ZEROS229!=null?TWO_ZEROS229.getText():null)));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:288:5: PREFIXED_ONE_TO_NINE
                    {
                    PREFIXED_ONE_TO_NINE230=(Token)match(input,PREFIXED_ONE_TO_NINE,FOLLOW_PREFIXED_ONE_TO_NINE_in_int_1_to_122896); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PREFIXED_ONE_TO_NINE.add(PREFIXED_ONE_TO_NINE230);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 288:26: -> INT[$PREFIXED_ONE_TO_NINE.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, (PREFIXED_ONE_TO_NINE230!=null?PREFIXED_ONE_TO_NINE230.getText():null)));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:289:5: ONE_TO_NINE
                    {
                    ONE_TO_NINE231=(Token)match(input,ONE_TO_NINE,FOLLOW_ONE_TO_NINE_in_int_1_to_122907); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ONE_TO_NINE.add(ONE_TO_NINE231);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 289:26: -> INT[$ONE_TO_NINE.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, (ONE_TO_NINE231!=null?ONE_TO_NINE231.getText():null)));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:290:5: TEN_TO_TWELVE
                    {
                    TEN_TO_TWELVE232=(Token)match(input,TEN_TO_TWELVE,FOLLOW_TEN_TO_TWELVE_in_int_1_to_122927); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TEN_TO_TWELVE.add(TEN_TO_TWELVE232);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 290:26: -> INT[$TEN_TO_TWELVE.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, (TEN_TO_TWELVE232!=null?TEN_TO_TWELVE232.getText():null)));

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
    // $ANTLR end "int_1_to_12"

    public static class int_0_to_23_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "int_0_to_23"
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:294:1: int_0_to_23 : ( TWO_ZEROS -> INT[$TWO_ZEROS.text] | ONE_ZERO -> INT[$ONE_ZERO.text] | PREFIXED_ONE_TO_NINE -> INT[$PREFIXED_ONE_TO_NINE.text] | ONE_TO_NINE -> INT[$ONE_TO_NINE.text] | TEN_TO_TWELVE -> INT[$TEN_TO_TWELVE.text] | THIRTEEN_TO_TWENTY_THREE -> INT[$THIRTEEN_TO_TWENTY_THREE.text] );
    public final DateParser.int_0_to_23_return int_0_to_23() throws RecognitionException {
        DateParser.int_0_to_23_return retval = new DateParser.int_0_to_23_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TWO_ZEROS233=null;
        Token ONE_ZERO234=null;
        Token PREFIXED_ONE_TO_NINE235=null;
        Token ONE_TO_NINE236=null;
        Token TEN_TO_TWELVE237=null;
        Token THIRTEEN_TO_TWENTY_THREE238=null;

        Object TWO_ZEROS233_tree=null;
        Object ONE_ZERO234_tree=null;
        Object PREFIXED_ONE_TO_NINE235_tree=null;
        Object ONE_TO_NINE236_tree=null;
        Object TEN_TO_TWELVE237_tree=null;
        Object THIRTEEN_TO_TWENTY_THREE238_tree=null;
        RewriteRuleTokenStream stream_ONE_TO_NINE=new RewriteRuleTokenStream(adaptor,"token ONE_TO_NINE");
        RewriteRuleTokenStream stream_TWO_ZEROS=new RewriteRuleTokenStream(adaptor,"token TWO_ZEROS");
        RewriteRuleTokenStream stream_THIRTEEN_TO_TWENTY_THREE=new RewriteRuleTokenStream(adaptor,"token THIRTEEN_TO_TWENTY_THREE");
        RewriteRuleTokenStream stream_TEN_TO_TWELVE=new RewriteRuleTokenStream(adaptor,"token TEN_TO_TWELVE");
        RewriteRuleTokenStream stream_PREFIXED_ONE_TO_NINE=new RewriteRuleTokenStream(adaptor,"token PREFIXED_ONE_TO_NINE");
        RewriteRuleTokenStream stream_ONE_ZERO=new RewriteRuleTokenStream(adaptor,"token ONE_ZERO");

        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:295:3: ( TWO_ZEROS -> INT[$TWO_ZEROS.text] | ONE_ZERO -> INT[$ONE_ZERO.text] | PREFIXED_ONE_TO_NINE -> INT[$PREFIXED_ONE_TO_NINE.text] | ONE_TO_NINE -> INT[$ONE_TO_NINE.text] | TEN_TO_TWELVE -> INT[$TEN_TO_TWELVE.text] | THIRTEEN_TO_TWENTY_THREE -> INT[$THIRTEEN_TO_TWENTY_THREE.text] )
            int alt69=6;
            switch ( input.LA(1) ) {
            case TWO_ZEROS:
                {
                alt69=1;
                }
                break;
            case ONE_ZERO:
                {
                alt69=2;
                }
                break;
            case PREFIXED_ONE_TO_NINE:
                {
                alt69=3;
                }
                break;
            case ONE_TO_NINE:
                {
                alt69=4;
                }
                break;
            case TEN_TO_TWELVE:
                {
                alt69=5;
                }
                break;
            case THIRTEEN_TO_TWENTY_THREE:
                {
                alt69=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 69, 0, input);

                throw nvae;
            }

            switch (alt69) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:295:5: TWO_ZEROS
                    {
                    TWO_ZEROS233=(Token)match(input,TWO_ZEROS,FOLLOW_TWO_ZEROS_in_int_0_to_232955); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWO_ZEROS.add(TWO_ZEROS233);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 295:30: -> INT[$TWO_ZEROS.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, (TWO_ZEROS233!=null?TWO_ZEROS233.getText():null)));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:296:5: ONE_ZERO
                    {
                    ONE_ZERO234=(Token)match(input,ONE_ZERO,FOLLOW_ONE_ZERO_in_int_0_to_232981); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ONE_ZERO.add(ONE_ZERO234);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 296:30: -> INT[$ONE_ZERO.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, (ONE_ZERO234!=null?ONE_ZERO234.getText():null)));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:297:5: PREFIXED_ONE_TO_NINE
                    {
                    PREFIXED_ONE_TO_NINE235=(Token)match(input,PREFIXED_ONE_TO_NINE,FOLLOW_PREFIXED_ONE_TO_NINE_in_int_0_to_233008); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PREFIXED_ONE_TO_NINE.add(PREFIXED_ONE_TO_NINE235);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 297:30: -> INT[$PREFIXED_ONE_TO_NINE.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, (PREFIXED_ONE_TO_NINE235!=null?PREFIXED_ONE_TO_NINE235.getText():null)));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:298:5: ONE_TO_NINE
                    {
                    ONE_TO_NINE236=(Token)match(input,ONE_TO_NINE,FOLLOW_ONE_TO_NINE_in_int_0_to_233023); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ONE_TO_NINE.add(ONE_TO_NINE236);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 298:30: -> INT[$ONE_TO_NINE.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, (ONE_TO_NINE236!=null?ONE_TO_NINE236.getText():null)));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:299:5: TEN_TO_TWELVE
                    {
                    TEN_TO_TWELVE237=(Token)match(input,TEN_TO_TWELVE,FOLLOW_TEN_TO_TWELVE_in_int_0_to_233047); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TEN_TO_TWELVE.add(TEN_TO_TWELVE237);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 299:30: -> INT[$TEN_TO_TWELVE.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, (TEN_TO_TWELVE237!=null?TEN_TO_TWELVE237.getText():null)));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 6 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:300:5: THIRTEEN_TO_TWENTY_THREE
                    {
                    THIRTEEN_TO_TWENTY_THREE238=(Token)match(input,THIRTEEN_TO_TWENTY_THREE,FOLLOW_THIRTEEN_TO_TWENTY_THREE_in_int_0_to_233069); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THIRTEEN_TO_TWENTY_THREE.add(THIRTEEN_TO_TWENTY_THREE238);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 300:30: -> INT[$THIRTEEN_TO_TWENTY_THREE.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, (THIRTEEN_TO_TWENTY_THREE238!=null?THIRTEEN_TO_TWENTY_THREE238.getText():null)));

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
    // $ANTLR end "int_0_to_23"

    public static class int_0_to_59_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "int_0_to_59"
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:304:1: int_0_to_59 : ( TWO_ZEROS -> INT[$TWO_ZEROS.text] | ONE_ZERO -> INT[$ONE_ZERO.text] | PREFIXED_ONE_TO_NINE -> INT[$PREFIXED_ONE_TO_NINE.text] | ONE_TO_NINE -> INT[$ONE_TO_NINE.text] | TEN_TO_TWELVE -> INT[$TEN_TO_TWELVE.text] | THIRTEEN_TO_TWENTY_THREE -> INT[$THIRTEEN_TO_TWENTY_THREE.text] | TWENTY_FOUR_TO_THIRTY_ONE -> INT[$TWENTY_FOUR_TO_THIRTY_ONE.text] | THIRTY_TWO_TO_FIFTY_NINE -> INT[$THIRTY_TWO_TO_FIFTY_NINE.text] );
    public final DateParser.int_0_to_59_return int_0_to_59() throws RecognitionException {
        DateParser.int_0_to_59_return retval = new DateParser.int_0_to_59_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TWO_ZEROS239=null;
        Token ONE_ZERO240=null;
        Token PREFIXED_ONE_TO_NINE241=null;
        Token ONE_TO_NINE242=null;
        Token TEN_TO_TWELVE243=null;
        Token THIRTEEN_TO_TWENTY_THREE244=null;
        Token TWENTY_FOUR_TO_THIRTY_ONE245=null;
        Token THIRTY_TWO_TO_FIFTY_NINE246=null;

        Object TWO_ZEROS239_tree=null;
        Object ONE_ZERO240_tree=null;
        Object PREFIXED_ONE_TO_NINE241_tree=null;
        Object ONE_TO_NINE242_tree=null;
        Object TEN_TO_TWELVE243_tree=null;
        Object THIRTEEN_TO_TWENTY_THREE244_tree=null;
        Object TWENTY_FOUR_TO_THIRTY_ONE245_tree=null;
        Object THIRTY_TWO_TO_FIFTY_NINE246_tree=null;
        RewriteRuleTokenStream stream_ONE_TO_NINE=new RewriteRuleTokenStream(adaptor,"token ONE_TO_NINE");
        RewriteRuleTokenStream stream_TWO_ZEROS=new RewriteRuleTokenStream(adaptor,"token TWO_ZEROS");
        RewriteRuleTokenStream stream_THIRTEEN_TO_TWENTY_THREE=new RewriteRuleTokenStream(adaptor,"token THIRTEEN_TO_TWENTY_THREE");
        RewriteRuleTokenStream stream_THIRTY_TWO_TO_FIFTY_NINE=new RewriteRuleTokenStream(adaptor,"token THIRTY_TWO_TO_FIFTY_NINE");
        RewriteRuleTokenStream stream_TEN_TO_TWELVE=new RewriteRuleTokenStream(adaptor,"token TEN_TO_TWELVE");
        RewriteRuleTokenStream stream_PREFIXED_ONE_TO_NINE=new RewriteRuleTokenStream(adaptor,"token PREFIXED_ONE_TO_NINE");
        RewriteRuleTokenStream stream_ONE_ZERO=new RewriteRuleTokenStream(adaptor,"token ONE_ZERO");
        RewriteRuleTokenStream stream_TWENTY_FOUR_TO_THIRTY_ONE=new RewriteRuleTokenStream(adaptor,"token TWENTY_FOUR_TO_THIRTY_ONE");

        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:305:3: ( TWO_ZEROS -> INT[$TWO_ZEROS.text] | ONE_ZERO -> INT[$ONE_ZERO.text] | PREFIXED_ONE_TO_NINE -> INT[$PREFIXED_ONE_TO_NINE.text] | ONE_TO_NINE -> INT[$ONE_TO_NINE.text] | TEN_TO_TWELVE -> INT[$TEN_TO_TWELVE.text] | THIRTEEN_TO_TWENTY_THREE -> INT[$THIRTEEN_TO_TWENTY_THREE.text] | TWENTY_FOUR_TO_THIRTY_ONE -> INT[$TWENTY_FOUR_TO_THIRTY_ONE.text] | THIRTY_TWO_TO_FIFTY_NINE -> INT[$THIRTY_TWO_TO_FIFTY_NINE.text] )
            int alt70=8;
            switch ( input.LA(1) ) {
            case TWO_ZEROS:
                {
                alt70=1;
                }
                break;
            case ONE_ZERO:
                {
                alt70=2;
                }
                break;
            case PREFIXED_ONE_TO_NINE:
                {
                alt70=3;
                }
                break;
            case ONE_TO_NINE:
                {
                alt70=4;
                }
                break;
            case TEN_TO_TWELVE:
                {
                alt70=5;
                }
                break;
            case THIRTEEN_TO_TWENTY_THREE:
                {
                alt70=6;
                }
                break;
            case TWENTY_FOUR_TO_THIRTY_ONE:
                {
                alt70=7;
                }
                break;
            case THIRTY_TWO_TO_FIFTY_NINE:
                {
                alt70=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 70, 0, input);

                throw nvae;
            }

            switch (alt70) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:305:5: TWO_ZEROS
                    {
                    TWO_ZEROS239=(Token)match(input,TWO_ZEROS,FOLLOW_TWO_ZEROS_in_int_0_to_593090); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWO_ZEROS.add(TWO_ZEROS239);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 305:31: -> INT[$TWO_ZEROS.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, (TWO_ZEROS239!=null?TWO_ZEROS239.getText():null)));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:306:5: ONE_ZERO
                    {
                    ONE_ZERO240=(Token)match(input,ONE_ZERO,FOLLOW_ONE_ZERO_in_int_0_to_593117); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ONE_ZERO.add(ONE_ZERO240);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 306:31: -> INT[$ONE_ZERO.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, (ONE_ZERO240!=null?ONE_ZERO240.getText():null)));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:307:5: PREFIXED_ONE_TO_NINE
                    {
                    PREFIXED_ONE_TO_NINE241=(Token)match(input,PREFIXED_ONE_TO_NINE,FOLLOW_PREFIXED_ONE_TO_NINE_in_int_0_to_593145); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PREFIXED_ONE_TO_NINE.add(PREFIXED_ONE_TO_NINE241);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 307:31: -> INT[$PREFIXED_ONE_TO_NINE.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, (PREFIXED_ONE_TO_NINE241!=null?PREFIXED_ONE_TO_NINE241.getText():null)));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:308:5: ONE_TO_NINE
                    {
                    ONE_TO_NINE242=(Token)match(input,ONE_TO_NINE,FOLLOW_ONE_TO_NINE_in_int_0_to_593161); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ONE_TO_NINE.add(ONE_TO_NINE242);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 308:31: -> INT[$ONE_TO_NINE.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, (ONE_TO_NINE242!=null?ONE_TO_NINE242.getText():null)));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:309:5: TEN_TO_TWELVE
                    {
                    TEN_TO_TWELVE243=(Token)match(input,TEN_TO_TWELVE,FOLLOW_TEN_TO_TWELVE_in_int_0_to_593186); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TEN_TO_TWELVE.add(TEN_TO_TWELVE243);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 309:31: -> INT[$TEN_TO_TWELVE.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, (TEN_TO_TWELVE243!=null?TEN_TO_TWELVE243.getText():null)));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 6 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:310:5: THIRTEEN_TO_TWENTY_THREE
                    {
                    THIRTEEN_TO_TWENTY_THREE244=(Token)match(input,THIRTEEN_TO_TWENTY_THREE,FOLLOW_THIRTEEN_TO_TWENTY_THREE_in_int_0_to_593209); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THIRTEEN_TO_TWENTY_THREE.add(THIRTEEN_TO_TWENTY_THREE244);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 310:31: -> INT[$THIRTEEN_TO_TWENTY_THREE.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, (THIRTEEN_TO_TWENTY_THREE244!=null?THIRTEEN_TO_TWENTY_THREE244.getText():null)));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 7 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:311:5: TWENTY_FOUR_TO_THIRTY_ONE
                    {
                    TWENTY_FOUR_TO_THIRTY_ONE245=(Token)match(input,TWENTY_FOUR_TO_THIRTY_ONE,FOLLOW_TWENTY_FOUR_TO_THIRTY_ONE_in_int_0_to_593221); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWENTY_FOUR_TO_THIRTY_ONE.add(TWENTY_FOUR_TO_THIRTY_ONE245);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 311:31: -> INT[$TWENTY_FOUR_TO_THIRTY_ONE.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, (TWENTY_FOUR_TO_THIRTY_ONE245!=null?TWENTY_FOUR_TO_THIRTY_ONE245.getText():null)));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 8 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:312:5: THIRTY_TWO_TO_FIFTY_NINE
                    {
                    THIRTY_TWO_TO_FIFTY_NINE246=(Token)match(input,THIRTY_TWO_TO_FIFTY_NINE,FOLLOW_THIRTY_TWO_TO_FIFTY_NINE_in_int_0_to_593232); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THIRTY_TWO_TO_FIFTY_NINE.add(THIRTY_TWO_TO_FIFTY_NINE246);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 312:31: -> INT[$THIRTY_TWO_TO_FIFTY_NINE.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, (THIRTY_TWO_TO_FIFTY_NINE246!=null?THIRTY_TWO_TO_FIFTY_NINE246.getText():null)));

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
    // $ANTLR end "int_0_to_59"

    public static class int_0_to_99_no_prefix_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "int_0_to_99_no_prefix"
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:316:1: int_0_to_99_no_prefix : ( ONE_ZERO -> INT[$ONE_ZERO.text] | ONE_TO_NINE -> INT[$ONE_TO_NINE.text] | TEN_TO_TWELVE -> INT[$TEN_TO_TWELVE.text] | THIRTEEN_TO_TWENTY_THREE -> INT[$THIRTEEN_TO_TWENTY_THREE.text] | TWENTY_FOUR_TO_THIRTY_ONE -> INT[$TWENTY_FOUR_TO_THIRTY_ONE.text] | THIRTY_TWO_TO_FIFTY_NINE -> INT[$THIRTY_TWO_TO_FIFTY_NINE.text] | SIXTY_TO_NINETY_NINE -> INT[$SIXTY_TO_NINETY_NINE.text] );
    public final DateParser.int_0_to_99_no_prefix_return int_0_to_99_no_prefix() throws RecognitionException {
        DateParser.int_0_to_99_no_prefix_return retval = new DateParser.int_0_to_99_no_prefix_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ONE_ZERO247=null;
        Token ONE_TO_NINE248=null;
        Token TEN_TO_TWELVE249=null;
        Token THIRTEEN_TO_TWENTY_THREE250=null;
        Token TWENTY_FOUR_TO_THIRTY_ONE251=null;
        Token THIRTY_TWO_TO_FIFTY_NINE252=null;
        Token SIXTY_TO_NINETY_NINE253=null;

        Object ONE_ZERO247_tree=null;
        Object ONE_TO_NINE248_tree=null;
        Object TEN_TO_TWELVE249_tree=null;
        Object THIRTEEN_TO_TWENTY_THREE250_tree=null;
        Object TWENTY_FOUR_TO_THIRTY_ONE251_tree=null;
        Object THIRTY_TWO_TO_FIFTY_NINE252_tree=null;
        Object SIXTY_TO_NINETY_NINE253_tree=null;
        RewriteRuleTokenStream stream_ONE_TO_NINE=new RewriteRuleTokenStream(adaptor,"token ONE_TO_NINE");
        RewriteRuleTokenStream stream_SIXTY_TO_NINETY_NINE=new RewriteRuleTokenStream(adaptor,"token SIXTY_TO_NINETY_NINE");
        RewriteRuleTokenStream stream_THIRTEEN_TO_TWENTY_THREE=new RewriteRuleTokenStream(adaptor,"token THIRTEEN_TO_TWENTY_THREE");
        RewriteRuleTokenStream stream_THIRTY_TWO_TO_FIFTY_NINE=new RewriteRuleTokenStream(adaptor,"token THIRTY_TWO_TO_FIFTY_NINE");
        RewriteRuleTokenStream stream_TEN_TO_TWELVE=new RewriteRuleTokenStream(adaptor,"token TEN_TO_TWELVE");
        RewriteRuleTokenStream stream_ONE_ZERO=new RewriteRuleTokenStream(adaptor,"token ONE_ZERO");
        RewriteRuleTokenStream stream_TWENTY_FOUR_TO_THIRTY_ONE=new RewriteRuleTokenStream(adaptor,"token TWENTY_FOUR_TO_THIRTY_ONE");

        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:317:3: ( ONE_ZERO -> INT[$ONE_ZERO.text] | ONE_TO_NINE -> INT[$ONE_TO_NINE.text] | TEN_TO_TWELVE -> INT[$TEN_TO_TWELVE.text] | THIRTEEN_TO_TWENTY_THREE -> INT[$THIRTEEN_TO_TWENTY_THREE.text] | TWENTY_FOUR_TO_THIRTY_ONE -> INT[$TWENTY_FOUR_TO_THIRTY_ONE.text] | THIRTY_TWO_TO_FIFTY_NINE -> INT[$THIRTY_TWO_TO_FIFTY_NINE.text] | SIXTY_TO_NINETY_NINE -> INT[$SIXTY_TO_NINETY_NINE.text] )
            int alt71=7;
            switch ( input.LA(1) ) {
            case ONE_ZERO:
                {
                alt71=1;
                }
                break;
            case ONE_TO_NINE:
                {
                alt71=2;
                }
                break;
            case TEN_TO_TWELVE:
                {
                alt71=3;
                }
                break;
            case THIRTEEN_TO_TWENTY_THREE:
                {
                alt71=4;
                }
                break;
            case TWENTY_FOUR_TO_THIRTY_ONE:
                {
                alt71=5;
                }
                break;
            case THIRTY_TWO_TO_FIFTY_NINE:
                {
                alt71=6;
                }
                break;
            case SIXTY_TO_NINETY_NINE:
                {
                alt71=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 71, 0, input);

                throw nvae;
            }

            switch (alt71) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:317:5: ONE_ZERO
                    {
                    ONE_ZERO247=(Token)match(input,ONE_ZERO,FOLLOW_ONE_ZERO_in_int_0_to_99_no_prefix3254); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ONE_ZERO.add(ONE_ZERO247);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 317:31: -> INT[$ONE_ZERO.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, (ONE_ZERO247!=null?ONE_ZERO247.getText():null)));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:318:5: ONE_TO_NINE
                    {
                    ONE_TO_NINE248=(Token)match(input,ONE_TO_NINE,FOLLOW_ONE_TO_NINE_in_int_0_to_99_no_prefix3282); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ONE_TO_NINE.add(ONE_TO_NINE248);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 318:31: -> INT[$ONE_TO_NINE.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, (ONE_TO_NINE248!=null?ONE_TO_NINE248.getText():null)));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:319:5: TEN_TO_TWELVE
                    {
                    TEN_TO_TWELVE249=(Token)match(input,TEN_TO_TWELVE,FOLLOW_TEN_TO_TWELVE_in_int_0_to_99_no_prefix3307); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TEN_TO_TWELVE.add(TEN_TO_TWELVE249);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 319:31: -> INT[$TEN_TO_TWELVE.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, (TEN_TO_TWELVE249!=null?TEN_TO_TWELVE249.getText():null)));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:320:5: THIRTEEN_TO_TWENTY_THREE
                    {
                    THIRTEEN_TO_TWENTY_THREE250=(Token)match(input,THIRTEEN_TO_TWENTY_THREE,FOLLOW_THIRTEEN_TO_TWENTY_THREE_in_int_0_to_99_no_prefix3330); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THIRTEEN_TO_TWENTY_THREE.add(THIRTEEN_TO_TWENTY_THREE250);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 320:31: -> INT[$THIRTEEN_TO_TWENTY_THREE.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, (THIRTEEN_TO_TWENTY_THREE250!=null?THIRTEEN_TO_TWENTY_THREE250.getText():null)));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:321:5: TWENTY_FOUR_TO_THIRTY_ONE
                    {
                    TWENTY_FOUR_TO_THIRTY_ONE251=(Token)match(input,TWENTY_FOUR_TO_THIRTY_ONE,FOLLOW_TWENTY_FOUR_TO_THIRTY_ONE_in_int_0_to_99_no_prefix3342); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWENTY_FOUR_TO_THIRTY_ONE.add(TWENTY_FOUR_TO_THIRTY_ONE251);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 321:31: -> INT[$TWENTY_FOUR_TO_THIRTY_ONE.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, (TWENTY_FOUR_TO_THIRTY_ONE251!=null?TWENTY_FOUR_TO_THIRTY_ONE251.getText():null)));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 6 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:322:5: THIRTY_TWO_TO_FIFTY_NINE
                    {
                    THIRTY_TWO_TO_FIFTY_NINE252=(Token)match(input,THIRTY_TWO_TO_FIFTY_NINE,FOLLOW_THIRTY_TWO_TO_FIFTY_NINE_in_int_0_to_99_no_prefix3353); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THIRTY_TWO_TO_FIFTY_NINE.add(THIRTY_TWO_TO_FIFTY_NINE252);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 322:31: -> INT[$THIRTY_TWO_TO_FIFTY_NINE.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, (THIRTY_TWO_TO_FIFTY_NINE252!=null?THIRTY_TWO_TO_FIFTY_NINE252.getText():null)));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 7 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:323:5: SIXTY_TO_NINETY_NINE
                    {
                    SIXTY_TO_NINETY_NINE253=(Token)match(input,SIXTY_TO_NINETY_NINE,FOLLOW_SIXTY_TO_NINETY_NINE_in_int_0_to_99_no_prefix3365); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SIXTY_TO_NINETY_NINE.add(SIXTY_TO_NINETY_NINE253);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 323:31: -> INT[$SIXTY_TO_NINETY_NINE.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, (SIXTY_TO_NINETY_NINE253!=null?SIXTY_TO_NINETY_NINE253.getText():null)));

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
    // $ANTLR end "int_0_to_99_no_prefix"

    public static class int_0_to_99_with_prefix_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "int_0_to_99_with_prefix"
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:326:1: int_0_to_99_with_prefix : ( TWO_ZEROS -> INT[$TWO_ZEROS.text] | PREFIXED_ONE_TO_NINE -> INT[$PREFIXED_ONE_TO_NINE.text] | TEN_TO_TWELVE -> INT[$TEN_TO_TWELVE.text] | THIRTEEN_TO_TWENTY_THREE -> INT[$THIRTEEN_TO_TWENTY_THREE.text] | TWENTY_FOUR_TO_THIRTY_ONE -> INT[$TWENTY_FOUR_TO_THIRTY_ONE.text] | THIRTY_TWO_TO_FIFTY_NINE -> INT[$THIRTY_TWO_TO_FIFTY_NINE.text] | SIXTY_TO_NINETY_NINE -> INT[$SIXTY_TO_NINETY_NINE.text] );
    public final DateParser.int_0_to_99_with_prefix_return int_0_to_99_with_prefix() throws RecognitionException {
        DateParser.int_0_to_99_with_prefix_return retval = new DateParser.int_0_to_99_with_prefix_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TWO_ZEROS254=null;
        Token PREFIXED_ONE_TO_NINE255=null;
        Token TEN_TO_TWELVE256=null;
        Token THIRTEEN_TO_TWENTY_THREE257=null;
        Token TWENTY_FOUR_TO_THIRTY_ONE258=null;
        Token THIRTY_TWO_TO_FIFTY_NINE259=null;
        Token SIXTY_TO_NINETY_NINE260=null;

        Object TWO_ZEROS254_tree=null;
        Object PREFIXED_ONE_TO_NINE255_tree=null;
        Object TEN_TO_TWELVE256_tree=null;
        Object THIRTEEN_TO_TWENTY_THREE257_tree=null;
        Object TWENTY_FOUR_TO_THIRTY_ONE258_tree=null;
        Object THIRTY_TWO_TO_FIFTY_NINE259_tree=null;
        Object SIXTY_TO_NINETY_NINE260_tree=null;
        RewriteRuleTokenStream stream_SIXTY_TO_NINETY_NINE=new RewriteRuleTokenStream(adaptor,"token SIXTY_TO_NINETY_NINE");
        RewriteRuleTokenStream stream_TWO_ZEROS=new RewriteRuleTokenStream(adaptor,"token TWO_ZEROS");
        RewriteRuleTokenStream stream_THIRTEEN_TO_TWENTY_THREE=new RewriteRuleTokenStream(adaptor,"token THIRTEEN_TO_TWENTY_THREE");
        RewriteRuleTokenStream stream_THIRTY_TWO_TO_FIFTY_NINE=new RewriteRuleTokenStream(adaptor,"token THIRTY_TWO_TO_FIFTY_NINE");
        RewriteRuleTokenStream stream_TEN_TO_TWELVE=new RewriteRuleTokenStream(adaptor,"token TEN_TO_TWELVE");
        RewriteRuleTokenStream stream_PREFIXED_ONE_TO_NINE=new RewriteRuleTokenStream(adaptor,"token PREFIXED_ONE_TO_NINE");
        RewriteRuleTokenStream stream_TWENTY_FOUR_TO_THIRTY_ONE=new RewriteRuleTokenStream(adaptor,"token TWENTY_FOUR_TO_THIRTY_ONE");

        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:327:3: ( TWO_ZEROS -> INT[$TWO_ZEROS.text] | PREFIXED_ONE_TO_NINE -> INT[$PREFIXED_ONE_TO_NINE.text] | TEN_TO_TWELVE -> INT[$TEN_TO_TWELVE.text] | THIRTEEN_TO_TWENTY_THREE -> INT[$THIRTEEN_TO_TWENTY_THREE.text] | TWENTY_FOUR_TO_THIRTY_ONE -> INT[$TWENTY_FOUR_TO_THIRTY_ONE.text] | THIRTY_TWO_TO_FIFTY_NINE -> INT[$THIRTY_TWO_TO_FIFTY_NINE.text] | SIXTY_TO_NINETY_NINE -> INT[$SIXTY_TO_NINETY_NINE.text] )
            int alt72=7;
            switch ( input.LA(1) ) {
            case TWO_ZEROS:
                {
                alt72=1;
                }
                break;
            case PREFIXED_ONE_TO_NINE:
                {
                alt72=2;
                }
                break;
            case TEN_TO_TWELVE:
                {
                alt72=3;
                }
                break;
            case THIRTEEN_TO_TWENTY_THREE:
                {
                alt72=4;
                }
                break;
            case TWENTY_FOUR_TO_THIRTY_ONE:
                {
                alt72=5;
                }
                break;
            case THIRTY_TWO_TO_FIFTY_NINE:
                {
                alt72=6;
                }
                break;
            case SIXTY_TO_NINETY_NINE:
                {
                alt72=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 72, 0, input);

                throw nvae;
            }

            switch (alt72) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:327:5: TWO_ZEROS
                    {
                    TWO_ZEROS254=(Token)match(input,TWO_ZEROS,FOLLOW_TWO_ZEROS_in_int_0_to_99_with_prefix3390); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWO_ZEROS.add(TWO_ZEROS254);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 327:31: -> INT[$TWO_ZEROS.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, (TWO_ZEROS254!=null?TWO_ZEROS254.getText():null)));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:328:5: PREFIXED_ONE_TO_NINE
                    {
                    PREFIXED_ONE_TO_NINE255=(Token)match(input,PREFIXED_ONE_TO_NINE,FOLLOW_PREFIXED_ONE_TO_NINE_in_int_0_to_99_with_prefix3417); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PREFIXED_ONE_TO_NINE.add(PREFIXED_ONE_TO_NINE255);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 328:31: -> INT[$PREFIXED_ONE_TO_NINE.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, (PREFIXED_ONE_TO_NINE255!=null?PREFIXED_ONE_TO_NINE255.getText():null)));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:329:5: TEN_TO_TWELVE
                    {
                    TEN_TO_TWELVE256=(Token)match(input,TEN_TO_TWELVE,FOLLOW_TEN_TO_TWELVE_in_int_0_to_99_with_prefix3433); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TEN_TO_TWELVE.add(TEN_TO_TWELVE256);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 329:31: -> INT[$TEN_TO_TWELVE.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, (TEN_TO_TWELVE256!=null?TEN_TO_TWELVE256.getText():null)));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:330:5: THIRTEEN_TO_TWENTY_THREE
                    {
                    THIRTEEN_TO_TWENTY_THREE257=(Token)match(input,THIRTEEN_TO_TWENTY_THREE,FOLLOW_THIRTEEN_TO_TWENTY_THREE_in_int_0_to_99_with_prefix3456); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THIRTEEN_TO_TWENTY_THREE.add(THIRTEEN_TO_TWENTY_THREE257);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 330:31: -> INT[$THIRTEEN_TO_TWENTY_THREE.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, (THIRTEEN_TO_TWENTY_THREE257!=null?THIRTEEN_TO_TWENTY_THREE257.getText():null)));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:331:5: TWENTY_FOUR_TO_THIRTY_ONE
                    {
                    TWENTY_FOUR_TO_THIRTY_ONE258=(Token)match(input,TWENTY_FOUR_TO_THIRTY_ONE,FOLLOW_TWENTY_FOUR_TO_THIRTY_ONE_in_int_0_to_99_with_prefix3468); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWENTY_FOUR_TO_THIRTY_ONE.add(TWENTY_FOUR_TO_THIRTY_ONE258);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 331:31: -> INT[$TWENTY_FOUR_TO_THIRTY_ONE.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, (TWENTY_FOUR_TO_THIRTY_ONE258!=null?TWENTY_FOUR_TO_THIRTY_ONE258.getText():null)));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 6 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:332:5: THIRTY_TWO_TO_FIFTY_NINE
                    {
                    THIRTY_TWO_TO_FIFTY_NINE259=(Token)match(input,THIRTY_TWO_TO_FIFTY_NINE,FOLLOW_THIRTY_TWO_TO_FIFTY_NINE_in_int_0_to_99_with_prefix3479); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THIRTY_TWO_TO_FIFTY_NINE.add(THIRTY_TWO_TO_FIFTY_NINE259);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 332:31: -> INT[$THIRTY_TWO_TO_FIFTY_NINE.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, (THIRTY_TWO_TO_FIFTY_NINE259!=null?THIRTY_TWO_TO_FIFTY_NINE259.getText():null)));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 7 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:333:5: SIXTY_TO_NINETY_NINE
                    {
                    SIXTY_TO_NINETY_NINE260=(Token)match(input,SIXTY_TO_NINETY_NINE,FOLLOW_SIXTY_TO_NINETY_NINE_in_int_0_to_99_with_prefix3491); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SIXTY_TO_NINETY_NINE.add(SIXTY_TO_NINETY_NINE260);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 333:31: -> INT[$SIXTY_TO_NINETY_NINE.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, (SIXTY_TO_NINETY_NINE260!=null?SIXTY_TO_NINETY_NINE260.getText():null)));

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
    // $ANTLR end "int_0_to_99_with_prefix"

    public static class int_0_to_99_optional_prefix_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "int_0_to_99_optional_prefix"
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:336:1: int_0_to_99_optional_prefix : ( int_0_to_99_with_prefix | ONE_TO_NINE -> INT[$ONE_TO_NINE.text] | ONE_ZERO -> INT[$ONE_ZERO.text] );
    public final DateParser.int_0_to_99_optional_prefix_return int_0_to_99_optional_prefix() throws RecognitionException {
        DateParser.int_0_to_99_optional_prefix_return retval = new DateParser.int_0_to_99_optional_prefix_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ONE_TO_NINE262=null;
        Token ONE_ZERO263=null;
        DateParser.int_0_to_99_with_prefix_return int_0_to_99_with_prefix261 = null;


        Object ONE_TO_NINE262_tree=null;
        Object ONE_ZERO263_tree=null;
        RewriteRuleTokenStream stream_ONE_TO_NINE=new RewriteRuleTokenStream(adaptor,"token ONE_TO_NINE");
        RewriteRuleTokenStream stream_ONE_ZERO=new RewriteRuleTokenStream(adaptor,"token ONE_ZERO");

        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:337:3: ( int_0_to_99_with_prefix | ONE_TO_NINE -> INT[$ONE_TO_NINE.text] | ONE_ZERO -> INT[$ONE_ZERO.text] )
            int alt73=3;
            switch ( input.LA(1) ) {
            case TWO_ZEROS:
            case PREFIXED_ONE_TO_NINE:
            case TEN_TO_TWELVE:
            case THIRTEEN_TO_TWENTY_THREE:
            case TWENTY_FOUR_TO_THIRTY_ONE:
            case THIRTY_TWO_TO_FIFTY_NINE:
            case SIXTY_TO_NINETY_NINE:
                {
                alt73=1;
                }
                break;
            case ONE_TO_NINE:
                {
                alt73=2;
                }
                break;
            case ONE_ZERO:
                {
                alt73=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 73, 0, input);

                throw nvae;
            }

            switch (alt73) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:337:5: int_0_to_99_with_prefix
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_int_0_to_99_with_prefix_in_int_0_to_99_optional_prefix3516);
                    int_0_to_99_with_prefix261=int_0_to_99_with_prefix();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, int_0_to_99_with_prefix261.getTree());

                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:338:5: ONE_TO_NINE
                    {
                    ONE_TO_NINE262=(Token)match(input,ONE_TO_NINE,FOLLOW_ONE_TO_NINE_in_int_0_to_99_optional_prefix3522); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ONE_TO_NINE.add(ONE_TO_NINE262);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 338:17: -> INT[$ONE_TO_NINE.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, (ONE_TO_NINE262!=null?ONE_TO_NINE262.getText():null)));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:339:5: ONE_ZERO
                    {
                    ONE_ZERO263=(Token)match(input,ONE_ZERO,FOLLOW_ONE_ZERO_in_int_0_to_99_optional_prefix3533); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ONE_ZERO.add(ONE_ZERO263);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 339:17: -> INT[$ONE_ZERO.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, (ONE_ZERO263!=null?ONE_ZERO263.getText():null)));

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
    // $ANTLR end "int_0_to_99_optional_prefix"

    public static class int_1_to_31_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "int_1_to_31"
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:343:1: int_1_to_31 : ( PREFIXED_ONE_TO_NINE -> INT[$PREFIXED_ONE_TO_NINE.text] | ONE_TO_NINE -> INT[$ONE_TO_NINE.text] | int_10_to_31 );
    public final DateParser.int_1_to_31_return int_1_to_31() throws RecognitionException {
        DateParser.int_1_to_31_return retval = new DateParser.int_1_to_31_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token PREFIXED_ONE_TO_NINE264=null;
        Token ONE_TO_NINE265=null;
        DateParser.int_10_to_31_return int_10_to_31266 = null;


        Object PREFIXED_ONE_TO_NINE264_tree=null;
        Object ONE_TO_NINE265_tree=null;
        RewriteRuleTokenStream stream_ONE_TO_NINE=new RewriteRuleTokenStream(adaptor,"token ONE_TO_NINE");
        RewriteRuleTokenStream stream_PREFIXED_ONE_TO_NINE=new RewriteRuleTokenStream(adaptor,"token PREFIXED_ONE_TO_NINE");

        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:344:3: ( PREFIXED_ONE_TO_NINE -> INT[$PREFIXED_ONE_TO_NINE.text] | ONE_TO_NINE -> INT[$ONE_TO_NINE.text] | int_10_to_31 )
            int alt74=3;
            switch ( input.LA(1) ) {
            case PREFIXED_ONE_TO_NINE:
                {
                alt74=1;
                }
                break;
            case ONE_TO_NINE:
                {
                alt74=2;
                }
                break;
            case TEN_TO_TWELVE:
            case THIRTEEN_TO_TWENTY_THREE:
            case TWENTY_FOUR_TO_THIRTY_ONE:
                {
                alt74=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 74, 0, input);

                throw nvae;
            }

            switch (alt74) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:344:5: PREFIXED_ONE_TO_NINE
                    {
                    PREFIXED_ONE_TO_NINE264=(Token)match(input,PREFIXED_ONE_TO_NINE,FOLLOW_PREFIXED_ONE_TO_NINE_in_int_1_to_313555); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PREFIXED_ONE_TO_NINE.add(PREFIXED_ONE_TO_NINE264);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 344:31: -> INT[$PREFIXED_ONE_TO_NINE.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, (PREFIXED_ONE_TO_NINE264!=null?PREFIXED_ONE_TO_NINE264.getText():null)));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:345:5: ONE_TO_NINE
                    {
                    ONE_TO_NINE265=(Token)match(input,ONE_TO_NINE,FOLLOW_ONE_TO_NINE_in_int_1_to_313571); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ONE_TO_NINE.add(ONE_TO_NINE265);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 345:31: -> INT[$ONE_TO_NINE.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, (ONE_TO_NINE265!=null?ONE_TO_NINE265.getText():null)));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:346:5: int_10_to_31
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_int_10_to_31_in_int_1_to_313596);
                    int_10_to_31266=int_10_to_31();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, int_10_to_31266.getTree());

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
    // $ANTLR end "int_1_to_31"

    public static class int_1_to_31_no_prefix_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "int_1_to_31_no_prefix"
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:349:1: int_1_to_31_no_prefix : ( ONE_TO_NINE -> INT[$ONE_TO_NINE.text] | int_10_to_31 );
    public final DateParser.int_1_to_31_no_prefix_return int_1_to_31_no_prefix() throws RecognitionException {
        DateParser.int_1_to_31_no_prefix_return retval = new DateParser.int_1_to_31_no_prefix_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ONE_TO_NINE267=null;
        DateParser.int_10_to_31_return int_10_to_31268 = null;


        Object ONE_TO_NINE267_tree=null;
        RewriteRuleTokenStream stream_ONE_TO_NINE=new RewriteRuleTokenStream(adaptor,"token ONE_TO_NINE");

        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:350:3: ( ONE_TO_NINE -> INT[$ONE_TO_NINE.text] | int_10_to_31 )
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==ONE_TO_NINE) ) {
                alt75=1;
            }
            else if ( (LA75_0==TEN_TO_TWELVE||(LA75_0>=THIRTEEN_TO_TWENTY_THREE && LA75_0<=TWENTY_FOUR_TO_THIRTY_ONE)) ) {
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:350:5: ONE_TO_NINE
                    {
                    ONE_TO_NINE267=(Token)match(input,ONE_TO_NINE,FOLLOW_ONE_TO_NINE_in_int_1_to_31_no_prefix3611); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ONE_TO_NINE.add(ONE_TO_NINE267);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 350:17: -> INT[$ONE_TO_NINE.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, (ONE_TO_NINE267!=null?ONE_TO_NINE267.getText():null)));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:351:5: int_10_to_31
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_int_10_to_31_in_int_1_to_31_no_prefix3622);
                    int_10_to_31268=int_10_to_31();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, int_10_to_31268.getTree());

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
    // $ANTLR end "int_1_to_31_no_prefix"

    public static class int_10_to_31_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "int_10_to_31"
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:354:1: int_10_to_31 : ( TEN_TO_TWELVE -> INT[$TEN_TO_TWELVE.text] | THIRTEEN_TO_TWENTY_THREE -> INT[$THIRTEEN_TO_TWENTY_THREE.text] | TWENTY_FOUR_TO_THIRTY_ONE -> INT[$TWENTY_FOUR_TO_THIRTY_ONE.text] );
    public final DateParser.int_10_to_31_return int_10_to_31() throws RecognitionException {
        DateParser.int_10_to_31_return retval = new DateParser.int_10_to_31_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TEN_TO_TWELVE269=null;
        Token THIRTEEN_TO_TWENTY_THREE270=null;
        Token TWENTY_FOUR_TO_THIRTY_ONE271=null;

        Object TEN_TO_TWELVE269_tree=null;
        Object THIRTEEN_TO_TWENTY_THREE270_tree=null;
        Object TWENTY_FOUR_TO_THIRTY_ONE271_tree=null;
        RewriteRuleTokenStream stream_THIRTEEN_TO_TWENTY_THREE=new RewriteRuleTokenStream(adaptor,"token THIRTEEN_TO_TWENTY_THREE");
        RewriteRuleTokenStream stream_TEN_TO_TWELVE=new RewriteRuleTokenStream(adaptor,"token TEN_TO_TWELVE");
        RewriteRuleTokenStream stream_TWENTY_FOUR_TO_THIRTY_ONE=new RewriteRuleTokenStream(adaptor,"token TWENTY_FOUR_TO_THIRTY_ONE");

        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:355:3: ( TEN_TO_TWELVE -> INT[$TEN_TO_TWELVE.text] | THIRTEEN_TO_TWENTY_THREE -> INT[$THIRTEEN_TO_TWENTY_THREE.text] | TWENTY_FOUR_TO_THIRTY_ONE -> INT[$TWENTY_FOUR_TO_THIRTY_ONE.text] )
            int alt76=3;
            switch ( input.LA(1) ) {
            case TEN_TO_TWELVE:
                {
                alt76=1;
                }
                break;
            case THIRTEEN_TO_TWENTY_THREE:
                {
                alt76=2;
                }
                break;
            case TWENTY_FOUR_TO_THIRTY_ONE:
                {
                alt76=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 76, 0, input);

                throw nvae;
            }

            switch (alt76) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:355:5: TEN_TO_TWELVE
                    {
                    TEN_TO_TWELVE269=(Token)match(input,TEN_TO_TWELVE,FOLLOW_TEN_TO_TWELVE_in_int_10_to_313637); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TEN_TO_TWELVE.add(TEN_TO_TWELVE269);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 355:31: -> INT[$TEN_TO_TWELVE.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, (TEN_TO_TWELVE269!=null?TEN_TO_TWELVE269.getText():null)));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:356:5: THIRTEEN_TO_TWENTY_THREE
                    {
                    THIRTEEN_TO_TWENTY_THREE270=(Token)match(input,THIRTEEN_TO_TWENTY_THREE,FOLLOW_THIRTEEN_TO_TWENTY_THREE_in_int_10_to_313660); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THIRTEEN_TO_TWENTY_THREE.add(THIRTEEN_TO_TWENTY_THREE270);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 356:31: -> INT[$THIRTEEN_TO_TWENTY_THREE.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, (THIRTEEN_TO_TWENTY_THREE270!=null?THIRTEEN_TO_TWENTY_THREE270.getText():null)));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:357:5: TWENTY_FOUR_TO_THIRTY_ONE
                    {
                    TWENTY_FOUR_TO_THIRTY_ONE271=(Token)match(input,TWENTY_FOUR_TO_THIRTY_ONE,FOLLOW_TWENTY_FOUR_TO_THIRTY_ONE_in_int_10_to_313672); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWENTY_FOUR_TO_THIRTY_ONE.add(TWENTY_FOUR_TO_THIRTY_ONE271);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 357:31: -> INT[$TWENTY_FOUR_TO_THIRTY_ONE.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, (TWENTY_FOUR_TO_THIRTY_ONE271!=null?TWENTY_FOUR_TO_THIRTY_ONE271.getText():null)));

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
    // $ANTLR end "int_10_to_31"

    // Delegated rules


    protected DFA5 dfa5 = new DFA5(this);
    protected DFA1 dfa1 = new DFA1(this);
    protected DFA3 dfa3 = new DFA3(this);
    protected DFA4 dfa4 = new DFA4(this);
    protected DFA6 dfa6 = new DFA6(this);
    protected DFA12 dfa12 = new DFA12(this);
    protected DFA44 dfa44 = new DFA44(this);
    protected DFA65 dfa65 = new DFA65(this);
    static final String DFA5_eotS =
        "\u00cf\uffff";
    static final String DFA5_eofS =
        "\2\uffff\1\101\32\uffff\31\101\15\uffff\27\101\14\uffff\27\101\32"+
        "\uffff\1\101\32\uffff\2\101\16\uffff\1\101\14\uffff";
    static final String DFA5_minS =
        "\1\26\1\32\1\23\32\32\31\23\6\32\1\103\1\uffff\1\33\2\26\2\uffff"+
        "\27\23\1\103\11\32\1\103\1\32\27\23\32\32\1\23\32\32\2\23\2\26\1"+
        "\103\11\32\1\103\1\32\1\23\1\103\11\32\1\103\1\32";
    static final String DFA5_maxS =
        "\1\177\1\32\1\35\30\76\1\113\1\103\31\35\6\76\1\177\1\uffff\1\34"+
        "\2\177\2\uffff\27\50\1\113\11\76\1\103\1\76\27\35\30\76\1\113\1"+
        "\103\1\35\30\76\1\113\1\103\2\35\2\177\1\113\11\76\1\103\1\76\1"+
        "\50\1\113\11\76\1\103\1\76";
    static final String DFA5_acceptS =
        "\75\uffff\1\2\3\uffff\1\3\1\1\u008c\uffff";
    static final String DFA5_specialS =
        "\u00cf\uffff}>";
    static final String[] DFA5_transitionS = {
            "\1\35\1\36\1\37\1\1\1\2\2\uffff\1\75\2\uffff\1\66\1\67\1\70"+
            "\1\71\1\72\1\73\1\74\2\uffff\1\47\1\50\1\51\1\52\1\53\1\54\1"+
            "\55\1\56\1\57\1\60\1\61\1\62\1\63\1\64\1\65\1\40\1\41\1\42\1"+
            "\43\1\44\1\45\1\46\4\uffff\1\10\1\11\1\12\1\13\1\14\1\15\1\16"+
            "\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32"+
            "\1\33\1\34\42\uffff\1\3\1\4\1\5\1\uffff\1\6\1\7",
            "\1\76",
            "\2\102\6\uffff\1\77\1\100\1\102",
            "\1\112\16\uffff\1\113\1\114\1\115\1\116\1\117\1\120\1\121\1"+
            "\122\1\123\1\124\1\125\1\126\1\127\1\130\1\131\1\103\1\104\1"+
            "\105\1\106\1\107\1\110\1\111",
            "\1\112\16\uffff\1\113\1\114\1\115\1\116\1\117\1\120\1\121\1"+
            "\122\1\123\1\124\1\125\1\126\1\127\1\130\1\131\1\103\1\104\1"+
            "\105\1\106\1\107\1\110\1\111",
            "\1\112\16\uffff\1\113\1\114\1\115\1\116\1\117\1\120\1\121\1"+
            "\122\1\123\1\124\1\125\1\126\1\127\1\130\1\131\1\103\1\104\1"+
            "\105\1\106\1\107\1\110\1\111",
            "\1\112\16\uffff\1\113\1\114\1\115\1\116\1\117\1\120\1\121\1"+
            "\122\1\123\1\124\1\125\1\126\1\127\1\130\1\131\1\103\1\104\1"+
            "\105\1\106\1\107\1\110\1\111",
            "\1\112\16\uffff\1\113\1\114\1\115\1\116\1\117\1\120\1\121\1"+
            "\122\1\123\1\124\1\125\1\126\1\127\1\130\1\131\1\103\1\104\1"+
            "\105\1\106\1\107\1\110\1\111",
            "\1\112\16\uffff\1\113\1\114\1\115\1\116\1\117\1\120\1\121\1"+
            "\122\1\123\1\124\1\125\1\126\1\127\1\130\1\131\1\103\1\104\1"+
            "\105\1\106\1\107\1\110\1\111",
            "\1\112\16\uffff\1\113\1\114\1\115\1\116\1\117\1\120\1\121\1"+
            "\122\1\123\1\124\1\125\1\126\1\127\1\130\1\131\1\103\1\104\1"+
            "\105\1\106\1\107\1\110\1\111",
            "\1\112\16\uffff\1\113\1\114\1\115\1\116\1\117\1\120\1\121\1"+
            "\122\1\123\1\124\1\125\1\126\1\127\1\130\1\131\1\103\1\104\1"+
            "\105\1\106\1\107\1\110\1\111",
            "\1\112\16\uffff\1\113\1\114\1\115\1\116\1\117\1\120\1\121\1"+
            "\122\1\123\1\124\1\125\1\126\1\127\1\130\1\131\1\103\1\104\1"+
            "\105\1\106\1\107\1\110\1\111",
            "\1\112\16\uffff\1\113\1\114\1\115\1\116\1\117\1\120\1\121\1"+
            "\122\1\123\1\124\1\125\1\126\1\127\1\130\1\131\1\103\1\104\1"+
            "\105\1\106\1\107\1\110\1\111",
            "\1\112\16\uffff\1\113\1\114\1\115\1\116\1\117\1\120\1\121\1"+
            "\122\1\123\1\124\1\125\1\126\1\127\1\130\1\131\1\103\1\104\1"+
            "\105\1\106\1\107\1\110\1\111",
            "\1\112\16\uffff\1\113\1\114\1\115\1\116\1\117\1\120\1\121\1"+
            "\122\1\123\1\124\1\125\1\126\1\127\1\130\1\131\1\103\1\104\1"+
            "\105\1\106\1\107\1\110\1\111",
            "\1\112\16\uffff\1\113\1\114\1\115\1\116\1\117\1\120\1\121\1"+
            "\122\1\123\1\124\1\125\1\126\1\127\1\130\1\131\1\103\1\104\1"+
            "\105\1\106\1\107\1\110\1\111",
            "\1\112\16\uffff\1\113\1\114\1\115\1\116\1\117\1\120\1\121\1"+
            "\122\1\123\1\124\1\125\1\126\1\127\1\130\1\131\1\103\1\104\1"+
            "\105\1\106\1\107\1\110\1\111",
            "\1\112\16\uffff\1\113\1\114\1\115\1\116\1\117\1\120\1\121\1"+
            "\122\1\123\1\124\1\125\1\126\1\127\1\130\1\131\1\103\1\104\1"+
            "\105\1\106\1\107\1\110\1\111",
            "\1\112\16\uffff\1\113\1\114\1\115\1\116\1\117\1\120\1\121\1"+
            "\122\1\123\1\124\1\125\1\126\1\127\1\130\1\131\1\103\1\104\1"+
            "\105\1\106\1\107\1\110\1\111",
            "\1\112\16\uffff\1\113\1\114\1\115\1\116\1\117\1\120\1\121\1"+
            "\122\1\123\1\124\1\125\1\126\1\127\1\130\1\131\1\103\1\104\1"+
            "\105\1\106\1\107\1\110\1\111",
            "\1\112\16\uffff\1\113\1\114\1\115\1\116\1\117\1\120\1\121\1"+
            "\122\1\123\1\124\1\125\1\126\1\127\1\130\1\131\1\103\1\104\1"+
            "\105\1\106\1\107\1\110\1\111",
            "\1\112\16\uffff\1\113\1\114\1\115\1\116\1\117\1\120\1\121\1"+
            "\122\1\123\1\124\1\125\1\126\1\127\1\130\1\131\1\103\1\104\1"+
            "\105\1\106\1\107\1\110\1\111",
            "\1\112\16\uffff\1\113\1\114\1\115\1\116\1\117\1\120\1\121\1"+
            "\122\1\123\1\124\1\125\1\126\1\127\1\130\1\131\1\103\1\104\1"+
            "\105\1\106\1\107\1\110\1\111",
            "\1\112\16\uffff\1\113\1\114\1\115\1\116\1\117\1\120\1\121\1"+
            "\122\1\123\1\124\1\125\1\126\1\127\1\130\1\131\1\103\1\104\1"+
            "\105\1\106\1\107\1\110\1\111",
            "\1\112\16\uffff\1\113\1\114\1\115\1\116\1\117\1\120\1\121\1"+
            "\122\1\123\1\124\1\125\1\126\1\127\1\130\1\131\1\103\1\104\1"+
            "\105\1\106\1\107\1\110\1\111",
            "\1\112\16\uffff\1\113\1\114\1\115\1\116\1\117\1\120\1\121\1"+
            "\122\1\123\1\124\1\125\1\126\1\127\1\130\1\131\1\103\1\104\1"+
            "\105\1\106\1\107\1\110\1\111",
            "\1\112\16\uffff\1\113\1\114\1\115\1\116\1\117\1\120\1\121\1"+
            "\122\1\123\1\124\1\125\1\126\1\127\1\130\1\131\1\103\1\104\1"+
            "\105\1\106\1\107\1\110\1\111",
            "\1\112\16\uffff\1\113\1\114\1\115\1\116\1\117\1\120\1\121\1"+
            "\122\1\123\1\124\1\125\1\126\1\127\1\130\1\131\1\103\1\104\1"+
            "\105\1\106\1\107\1\110\1\111\1\132\3\uffff\1\142\1\136\1\137"+
            "\1\133\1\135\1\141\1\143\1\134\1\140",
            "\1\112\16\uffff\1\113\1\114\1\115\1\116\1\117\1\120\1\121\1"+
            "\122\1\123\1\124\1\125\1\126\1\127\1\130\1\131\1\103\1\104\1"+
            "\105\1\106\1\107\1\110\1\111\1\144\3\uffff\1\145",
            "\2\102\10\uffff\1\102",
            "\2\102\10\uffff\1\102",
            "\2\102\10\uffff\1\102",
            "\2\102\10\uffff\1\102",
            "\2\102\10\uffff\1\102",
            "\2\102\10\uffff\1\102",
            "\2\102\10\uffff\1\102",
            "\2\102\10\uffff\1\102",
            "\2\102\10\uffff\1\102",
            "\2\102\10\uffff\1\102",
            "\2\102\10\uffff\1\102",
            "\2\102\10\uffff\1\102",
            "\2\102\10\uffff\1\102",
            "\2\102\10\uffff\1\102",
            "\2\102\10\uffff\1\102",
            "\2\102\10\uffff\1\102",
            "\2\102\10\uffff\1\102",
            "\2\102\10\uffff\1\102",
            "\2\102\10\uffff\1\102",
            "\2\102\10\uffff\1\102",
            "\2\102\10\uffff\1\102",
            "\2\102\10\uffff\1\102",
            "\2\102\10\uffff\1\102",
            "\2\102\10\uffff\1\102",
            "\2\102\10\uffff\1\102",
            "\1\155\6\uffff\1\67\1\70\1\71\1\72\1\73\3\uffff\1\156\1\157"+
            "\1\160\1\161\1\162\1\163\1\164\1\165\1\166\1\167\1\170\1\171"+
            "\1\172\1\173\1\174\1\146\1\147\1\150\1\151\1\152\1\153\1\154",
            "\1\155\16\uffff\1\156\1\157\1\160\1\161\1\162\1\163\1\164\1"+
            "\165\1\166\1\167\1\170\1\171\1\172\1\173\1\174\1\146\1\147\1"+
            "\150\1\151\1\152\1\153\1\154",
            "\1\155\16\uffff\1\156\1\157\1\160\1\161\1\162\1\163\1\164\1"+
            "\165\1\166\1\167\1\170\1\171\1\172\1\173\1\174\1\146\1\147\1"+
            "\150\1\151\1\152\1\153\1\154",
            "\1\155\16\uffff\1\156\1\157\1\160\1\161\1\162\1\163\1\164\1"+
            "\165\1\166\1\167\1\170\1\171\1\172\1\173\1\174\1\146\1\147\1"+
            "\150\1\151\1\152\1\153\1\154",
            "\1\155\16\uffff\1\156\1\157\1\160\1\161\1\162\1\163\1\164\1"+
            "\165\1\166\1\167\1\170\1\171\1\172\1\173\1\174\1\146\1\147\1"+
            "\150\1\151\1\152\1\153\1\154",
            "\1\155\16\uffff\1\156\1\157\1\160\1\161\1\162\1\163\1\164\1"+
            "\165\1\166\1\167\1\170\1\171\1\172\1\173\1\174\1\146\1\147\1"+
            "\150\1\151\1\152\1\153\1\154",
            "\1\u0082\1\u0083\1\u0084\1\u0085\1\u0086\1\u0087\1\u0088\1"+
            "\u0089\1\u008a\1\u008b\1\u008c\1\u008d\1\u008e\1\u008f\1\u0090"+
            "\1\u0091\1\u0092\1\u0093\1\u0094\1\u0095\1\u0096\42\uffff\1"+
            "\175\1\176\1\177\1\uffff\1\u0080\1\u0081",
            "",
            "\1\77\1\100",
            "\1\35\1\36\1\37\1\uffff\1\u0097\5\uffff\1\66\1\67\1\70\1\71"+
            "\1\72\1\73\1\74\2\uffff\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1"+
            "\56\1\57\1\60\1\61\1\62\1\63\1\64\1\65\1\40\1\41\1\42\1\43\1"+
            "\44\1\45\1\46\4\uffff\1\u009d\1\u009e\1\u009f\1\u00a0\1\u00a1"+
            "\1\u00a2\1\u00a3\1\u00a4\1\u00a5\1\u00a6\1\u00a7\1\u00a8\1\u00a9"+
            "\1\u00aa\1\u00ab\1\u00ac\1\u00ad\1\u00ae\1\u00af\1\u00b0\1\u00b1"+
            "\42\uffff\1\u0098\1\u0099\1\u009a\1\uffff\1\u009b\1\u009c",
            "\1\35\1\36\1\37\1\uffff\1\u0097\5\uffff\1\66\1\67\1\70\1\71"+
            "\1\72\1\73\1\74\2\uffff\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1"+
            "\56\1\57\1\60\1\61\1\62\1\63\1\64\1\65\1\40\1\41\1\42\1\43\1"+
            "\44\1\45\1\46\4\uffff\1\u009d\1\u009e\1\u009f\1\u00a0\1\u00a1"+
            "\1\u00a2\1\u00a3\1\u00a4\1\u00a5\1\u00a6\1\u00a7\1\u00a8\1\u00a9"+
            "\1\u00aa\1\u00ab\1\u00ac\1\u00ad\1\u00ae\1\u00af\1\u00b0\1\u00b1"+
            "\42\uffff\1\u0098\1\u0099\1\u009a\1\uffff\1\u009b\1\u009c",
            "",
            "",
            "\2\102\10\uffff\1\102\11\uffff\1\u00b2\1\u00b3",
            "\2\102\10\uffff\1\102\11\uffff\1\u00b2\1\u00b3",
            "\2\102\10\uffff\1\102\11\uffff\1\u00b2\1\u00b3",
            "\2\102\10\uffff\1\102\11\uffff\1\u00b2\1\u00b3",
            "\2\102\10\uffff\1\102\11\uffff\1\u00b2\1\u00b3",
            "\2\102\10\uffff\1\102\11\uffff\1\u00b2\1\u00b3",
            "\2\102\10\uffff\1\102\11\uffff\1\u00b2\1\u00b3",
            "\2\102\6\uffff\1\u00b5\1\u00b4\1\102\11\uffff\1\u00b2\1\u00b3",
            "\2\102\10\uffff\1\102\11\uffff\1\u00b2\1\u00b3",
            "\2\102\10\uffff\1\102\11\uffff\1\u00b2\1\u00b3",
            "\2\102\10\uffff\1\102\11\uffff\1\u00b2\1\u00b3",
            "\2\102\10\uffff\1\102\11\uffff\1\u00b2\1\u00b3",
            "\2\102\10\uffff\1\102\11\uffff\1\u00b2\1\u00b3",
            "\2\102\10\uffff\1\102\11\uffff\1\u00b2\1\u00b3",
            "\2\102\10\uffff\1\102\11\uffff\1\u00b2\1\u00b3",
            "\2\102\10\uffff\1\102\11\uffff\1\u00b2\1\u00b3",
            "\2\102\10\uffff\1\102\11\uffff\1\u00b2\1\u00b3",
            "\2\102\10\uffff\1\102\11\uffff\1\u00b2\1\u00b3",
            "\2\102\10\uffff\1\102\11\uffff\1\u00b2\1\u00b3",
            "\2\102\10\uffff\1\102\11\uffff\1\u00b2\1\u00b3",
            "\2\102\10\uffff\1\102\11\uffff\1\u00b2\1\u00b3",
            "\2\102\10\uffff\1\102\11\uffff\1\u00b2\1\u00b3",
            "\2\102\10\uffff\1\102\11\uffff\1\u00b2\1\u00b3",
            "\1\142\1\136\1\137\1\133\1\135\1\141\1\143\1\134\1\140",
            "\1\112\16\uffff\1\113\1\114\1\115\1\116\1\117\1\120\1\121\1"+
            "\122\1\123\1\124\1\125\1\126\1\127\1\130\1\131\1\103\1\104\1"+
            "\105\1\106\1\107\1\110\1\111",
            "\1\112\16\uffff\1\113\1\114\1\115\1\116\1\117\1\120\1\121\1"+
            "\122\1\123\1\124\1\125\1\126\1\127\1\130\1\131\1\103\1\104\1"+
            "\105\1\106\1\107\1\110\1\111",
            "\1\112\16\uffff\1\113\1\114\1\115\1\116\1\117\1\120\1\121\1"+
            "\122\1\123\1\124\1\125\1\126\1\127\1\130\1\131\1\103\1\104\1"+
            "\105\1\106\1\107\1\110\1\111",
            "\1\112\16\uffff\1\113\1\114\1\115\1\116\1\117\1\120\1\121\1"+
            "\122\1\123\1\124\1\125\1\126\1\127\1\130\1\131\1\103\1\104\1"+
            "\105\1\106\1\107\1\110\1\111",
            "\1\112\16\uffff\1\113\1\114\1\115\1\116\1\117\1\120\1\121\1"+
            "\122\1\123\1\124\1\125\1\126\1\127\1\130\1\131\1\103\1\104\1"+
            "\105\1\106\1\107\1\110\1\111",
            "\1\112\16\uffff\1\113\1\114\1\115\1\116\1\117\1\120\1\121\1"+
            "\122\1\123\1\124\1\125\1\126\1\127\1\130\1\131\1\103\1\104\1"+
            "\105\1\106\1\107\1\110\1\111",
            "\1\112\16\uffff\1\113\1\114\1\115\1\116\1\117\1\120\1\121\1"+
            "\122\1\123\1\124\1\125\1\126\1\127\1\130\1\131\1\103\1\104\1"+
            "\105\1\106\1\107\1\110\1\111",
            "\1\112\16\uffff\1\113\1\114\1\115\1\116\1\117\1\120\1\121\1"+
            "\122\1\123\1\124\1\125\1\126\1\127\1\130\1\131\1\103\1\104\1"+
            "\105\1\106\1\107\1\110\1\111",
            "\1\112\16\uffff\1\113\1\114\1\115\1\116\1\117\1\120\1\121\1"+
            "\122\1\123\1\124\1\125\1\126\1\127\1\130\1\131\1\103\1\104\1"+
            "\105\1\106\1\107\1\110\1\111",
            "\1\145",
            "\1\112\16\uffff\1\113\1\114\1\115\1\116\1\117\1\120\1\121\1"+
            "\122\1\123\1\124\1\125\1\126\1\127\1\130\1\131\1\103\1\104\1"+
            "\105\1\106\1\107\1\110\1\111",
            "\2\102\10\uffff\1\102",
            "\2\102\10\uffff\1\102",
            "\2\102\10\uffff\1\102",
            "\2\102\10\uffff\1\102",
            "\2\102\10\uffff\1\102",
            "\2\102\10\uffff\1\102",
            "\2\102\10\uffff\1\102",
            "\2\102\10\uffff\1\102",
            "\2\102\10\uffff\1\102",
            "\2\102\10\uffff\1\102",
            "\2\102\10\uffff\1\102",
            "\2\102\10\uffff\1\102",
            "\2\102\10\uffff\1\102",
            "\2\102\10\uffff\1\102",
            "\2\102\10\uffff\1\102",
            "\2\102\10\uffff\1\102",
            "\2\102\10\uffff\1\102",
            "\2\102\10\uffff\1\102",
            "\2\102\10\uffff\1\102",
            "\2\102\10\uffff\1\102",
            "\2\102\10\uffff\1\102",
            "\2\102\10\uffff\1\102",
            "\2\102\10\uffff\1\102",
            "\1\155\16\uffff\1\156\1\157\1\160\1\161\1\162\1\163\1\164\1"+
            "\165\1\166\1\167\1\170\1\171\1\172\1\173\1\174\1\146\1\147\1"+
            "\150\1\151\1\152\1\153\1\154",
            "\1\155\16\uffff\1\156\1\157\1\160\1\161\1\162\1\163\1\164\1"+
            "\165\1\166\1\167\1\170\1\171\1\172\1\173\1\174\1\146\1\147\1"+
            "\150\1\151\1\152\1\153\1\154",
            "\1\155\16\uffff\1\156\1\157\1\160\1\161\1\162\1\163\1\164\1"+
            "\165\1\166\1\167\1\170\1\171\1\172\1\173\1\174\1\146\1\147\1"+
            "\150\1\151\1\152\1\153\1\154",
            "\1\155\16\uffff\1\156\1\157\1\160\1\161\1\162\1\163\1\164\1"+
            "\165\1\166\1\167\1\170\1\171\1\172\1\173\1\174\1\146\1\147\1"+
            "\150\1\151\1\152\1\153\1\154",
            "\1\155\16\uffff\1\156\1\157\1\160\1\161\1\162\1\163\1\164\1"+
            "\165\1\166\1\167\1\170\1\171\1\172\1\173\1\174\1\146\1\147\1"+
            "\150\1\151\1\152\1\153\1\154",
            "\1\155\16\uffff\1\156\1\157\1\160\1\161\1\162\1\163\1\164\1"+
            "\165\1\166\1\167\1\170\1\171\1\172\1\173\1\174\1\146\1\147\1"+
            "\150\1\151\1\152\1\153\1\154",
            "\1\155\16\uffff\1\156\1\157\1\160\1\161\1\162\1\163\1\164\1"+
            "\165\1\166\1\167\1\170\1\171\1\172\1\173\1\174\1\146\1\147\1"+
            "\150\1\151\1\152\1\153\1\154",
            "\1\155\16\uffff\1\156\1\157\1\160\1\161\1\162\1\163\1\164\1"+
            "\165\1\166\1\167\1\170\1\171\1\172\1\173\1\174\1\146\1\147\1"+
            "\150\1\151\1\152\1\153\1\154",
            "\1\155\16\uffff\1\156\1\157\1\160\1\161\1\162\1\163\1\164\1"+
            "\165\1\166\1\167\1\170\1\171\1\172\1\173\1\174\1\146\1\147\1"+
            "\150\1\151\1\152\1\153\1\154",
            "\1\155\16\uffff\1\156\1\157\1\160\1\161\1\162\1\163\1\164\1"+
            "\165\1\166\1\167\1\170\1\171\1\172\1\173\1\174\1\146\1\147\1"+
            "\150\1\151\1\152\1\153\1\154",
            "\1\155\16\uffff\1\156\1\157\1\160\1\161\1\162\1\163\1\164\1"+
            "\165\1\166\1\167\1\170\1\171\1\172\1\173\1\174\1\146\1\147\1"+
            "\150\1\151\1\152\1\153\1\154",
            "\1\155\16\uffff\1\156\1\157\1\160\1\161\1\162\1\163\1\164\1"+
            "\165\1\166\1\167\1\170\1\171\1\172\1\173\1\174\1\146\1\147\1"+
            "\150\1\151\1\152\1\153\1\154",
            "\1\155\16\uffff\1\156\1\157\1\160\1\161\1\162\1\163\1\164\1"+
            "\165\1\166\1\167\1\170\1\171\1\172\1\173\1\174\1\146\1\147\1"+
            "\150\1\151\1\152\1\153\1\154",
            "\1\155\16\uffff\1\156\1\157\1\160\1\161\1\162\1\163\1\164\1"+
            "\165\1\166\1\167\1\170\1\171\1\172\1\173\1\174\1\146\1\147\1"+
            "\150\1\151\1\152\1\153\1\154",
            "\1\155\16\uffff\1\156\1\157\1\160\1\161\1\162\1\163\1\164\1"+
            "\165\1\166\1\167\1\170\1\171\1\172\1\173\1\174\1\146\1\147\1"+
            "\150\1\151\1\152\1\153\1\154",
            "\1\155\16\uffff\1\156\1\157\1\160\1\161\1\162\1\163\1\164\1"+
            "\165\1\166\1\167\1\170\1\171\1\172\1\173\1\174\1\146\1\147\1"+
            "\150\1\151\1\152\1\153\1\154",
            "\1\155\16\uffff\1\156\1\157\1\160\1\161\1\162\1\163\1\164\1"+
            "\165\1\166\1\167\1\170\1\171\1\172\1\173\1\174\1\146\1\147\1"+
            "\150\1\151\1\152\1\153\1\154",
            "\1\155\16\uffff\1\156\1\157\1\160\1\161\1\162\1\163\1\164\1"+
            "\165\1\166\1\167\1\170\1\171\1\172\1\173\1\174\1\146\1\147\1"+
            "\150\1\151\1\152\1\153\1\154",
            "\1\155\16\uffff\1\156\1\157\1\160\1\161\1\162\1\163\1\164\1"+
            "\165\1\166\1\167\1\170\1\171\1\172\1\173\1\174\1\146\1\147\1"+
            "\150\1\151\1\152\1\153\1\154",
            "\1\155\16\uffff\1\156\1\157\1\160\1\161\1\162\1\163\1\164\1"+
            "\165\1\166\1\167\1\170\1\171\1\172\1\173\1\174\1\146\1\147\1"+
            "\150\1\151\1\152\1\153\1\154",
            "\1\155\16\uffff\1\156\1\157\1\160\1\161\1\162\1\163\1\164\1"+
            "\165\1\166\1\167\1\170\1\171\1\172\1\173\1\174\1\146\1\147\1"+
            "\150\1\151\1\152\1\153\1\154",
            "\1\155\16\uffff\1\156\1\157\1\160\1\161\1\162\1\163\1\164\1"+
            "\165\1\166\1\167\1\170\1\171\1\172\1\173\1\174\1\146\1\147\1"+
            "\150\1\151\1\152\1\153\1\154",
            "\1\155\16\uffff\1\156\1\157\1\160\1\161\1\162\1\163\1\164\1"+
            "\165\1\166\1\167\1\170\1\171\1\172\1\173\1\174\1\146\1\147\1"+
            "\150\1\151\1\152\1\153\1\154",
            "\1\155\16\uffff\1\156\1\157\1\160\1\161\1\162\1\163\1\164\1"+
            "\165\1\166\1\167\1\170\1\171\1\172\1\173\1\174\1\146\1\147\1"+
            "\150\1\151\1\152\1\153\1\154",
            "\1\155\16\uffff\1\156\1\157\1\160\1\161\1\162\1\163\1\164\1"+
            "\165\1\166\1\167\1\170\1\171\1\172\1\173\1\174\1\146\1\147\1"+
            "\150\1\151\1\152\1\153\1\154\1\u00b6\3\uffff\1\u00b7\1\u00bc"+
            "\1\u00b9\1\u00bb\1\u00ba\1\u00bf\1\u00bd\1\u00b8\1\u00be",
            "\1\155\16\uffff\1\156\1\157\1\160\1\161\1\162\1\163\1\164\1"+
            "\165\1\166\1\167\1\170\1\171\1\172\1\173\1\174\1\146\1\147\1"+
            "\150\1\151\1\152\1\153\1\154\1\u00c0\3\uffff\1\u00c1",
            "\2\102\10\uffff\1\102",
            "\1\u00c2\16\uffff\1\113\1\114\1\115\1\116\1\117\1\120\1\121"+
            "\1\122\1\123\1\124\1\125\1\126\1\127\1\130\1\131\1\103\1\104"+
            "\1\105\1\106\1\107\1\110\1\111",
            "\1\u00c2\16\uffff\1\113\1\114\1\115\1\116\1\117\1\120\1\121"+
            "\1\122\1\123\1\124\1\125\1\126\1\127\1\130\1\131\1\103\1\104"+
            "\1\105\1\106\1\107\1\110\1\111",
            "\1\u00c2\16\uffff\1\113\1\114\1\115\1\116\1\117\1\120\1\121"+
            "\1\122\1\123\1\124\1\125\1\126\1\127\1\130\1\131\1\103\1\104"+
            "\1\105\1\106\1\107\1\110\1\111",
            "\1\u00c2\16\uffff\1\113\1\114\1\115\1\116\1\117\1\120\1\121"+
            "\1\122\1\123\1\124\1\125\1\126\1\127\1\130\1\131\1\103\1\104"+
            "\1\105\1\106\1\107\1\110\1\111",
            "\1\u00c2\16\uffff\1\113\1\114\1\115\1\116\1\117\1\120\1\121"+
            "\1\122\1\123\1\124\1\125\1\126\1\127\1\130\1\131\1\103\1\104"+
            "\1\105\1\106\1\107\1\110\1\111",
            "\1\u00c2\16\uffff\1\113\1\114\1\115\1\116\1\117\1\120\1\121"+
            "\1\122\1\123\1\124\1\125\1\126\1\127\1\130\1\131\1\103\1\104"+
            "\1\105\1\106\1\107\1\110\1\111",
            "\1\u00c2\16\uffff\1\113\1\114\1\115\1\116\1\117\1\120\1\121"+
            "\1\122\1\123\1\124\1\125\1\126\1\127\1\130\1\131\1\103\1\104"+
            "\1\105\1\106\1\107\1\110\1\111",
            "\1\u00c2\16\uffff\1\113\1\114\1\115\1\116\1\117\1\120\1\121"+
            "\1\122\1\123\1\124\1\125\1\126\1\127\1\130\1\131\1\103\1\104"+
            "\1\105\1\106\1\107\1\110\1\111",
            "\1\u00c2\16\uffff\1\113\1\114\1\115\1\116\1\117\1\120\1\121"+
            "\1\122\1\123\1\124\1\125\1\126\1\127\1\130\1\131\1\103\1\104"+
            "\1\105\1\106\1\107\1\110\1\111",
            "\1\u00c2\16\uffff\1\113\1\114\1\115\1\116\1\117\1\120\1\121"+
            "\1\122\1\123\1\124\1\125\1\126\1\127\1\130\1\131\1\103\1\104"+
            "\1\105\1\106\1\107\1\110\1\111",
            "\1\u00c2\16\uffff\1\113\1\114\1\115\1\116\1\117\1\120\1\121"+
            "\1\122\1\123\1\124\1\125\1\126\1\127\1\130\1\131\1\103\1\104"+
            "\1\105\1\106\1\107\1\110\1\111",
            "\1\u00c2\16\uffff\1\113\1\114\1\115\1\116\1\117\1\120\1\121"+
            "\1\122\1\123\1\124\1\125\1\126\1\127\1\130\1\131\1\103\1\104"+
            "\1\105\1\106\1\107\1\110\1\111",
            "\1\u00c2\16\uffff\1\113\1\114\1\115\1\116\1\117\1\120\1\121"+
            "\1\122\1\123\1\124\1\125\1\126\1\127\1\130\1\131\1\103\1\104"+
            "\1\105\1\106\1\107\1\110\1\111",
            "\1\u00c2\16\uffff\1\113\1\114\1\115\1\116\1\117\1\120\1\121"+
            "\1\122\1\123\1\124\1\125\1\126\1\127\1\130\1\131\1\103\1\104"+
            "\1\105\1\106\1\107\1\110\1\111",
            "\1\u00c2\16\uffff\1\113\1\114\1\115\1\116\1\117\1\120\1\121"+
            "\1\122\1\123\1\124\1\125\1\126\1\127\1\130\1\131\1\103\1\104"+
            "\1\105\1\106\1\107\1\110\1\111",
            "\1\u00c2\16\uffff\1\113\1\114\1\115\1\116\1\117\1\120\1\121"+
            "\1\122\1\123\1\124\1\125\1\126\1\127\1\130\1\131\1\103\1\104"+
            "\1\105\1\106\1\107\1\110\1\111",
            "\1\u00c2\16\uffff\1\113\1\114\1\115\1\116\1\117\1\120\1\121"+
            "\1\122\1\123\1\124\1\125\1\126\1\127\1\130\1\131\1\103\1\104"+
            "\1\105\1\106\1\107\1\110\1\111",
            "\1\u00c2\16\uffff\1\113\1\114\1\115\1\116\1\117\1\120\1\121"+
            "\1\122\1\123\1\124\1\125\1\126\1\127\1\130\1\131\1\103\1\104"+
            "\1\105\1\106\1\107\1\110\1\111",
            "\1\u00c2\16\uffff\1\113\1\114\1\115\1\116\1\117\1\120\1\121"+
            "\1\122\1\123\1\124\1\125\1\126\1\127\1\130\1\131\1\103\1\104"+
            "\1\105\1\106\1\107\1\110\1\111",
            "\1\u00c2\16\uffff\1\113\1\114\1\115\1\116\1\117\1\120\1\121"+
            "\1\122\1\123\1\124\1\125\1\126\1\127\1\130\1\131\1\103\1\104"+
            "\1\105\1\106\1\107\1\110\1\111",
            "\1\u00c2\16\uffff\1\113\1\114\1\115\1\116\1\117\1\120\1\121"+
            "\1\122\1\123\1\124\1\125\1\126\1\127\1\130\1\131\1\103\1\104"+
            "\1\105\1\106\1\107\1\110\1\111",
            "\1\u00c2\16\uffff\1\113\1\114\1\115\1\116\1\117\1\120\1\121"+
            "\1\122\1\123\1\124\1\125\1\126\1\127\1\130\1\131\1\103\1\104"+
            "\1\105\1\106\1\107\1\110\1\111",
            "\1\u00c2\16\uffff\1\113\1\114\1\115\1\116\1\117\1\120\1\121"+
            "\1\122\1\123\1\124\1\125\1\126\1\127\1\130\1\131\1\103\1\104"+
            "\1\105\1\106\1\107\1\110\1\111",
            "\1\u00c2\16\uffff\1\113\1\114\1\115\1\116\1\117\1\120\1\121"+
            "\1\122\1\123\1\124\1\125\1\126\1\127\1\130\1\131\1\103\1\104"+
            "\1\105\1\106\1\107\1\110\1\111",
            "\1\u00c2\16\uffff\1\113\1\114\1\115\1\116\1\117\1\120\1\121"+
            "\1\122\1\123\1\124\1\125\1\126\1\127\1\130\1\131\1\103\1\104"+
            "\1\105\1\106\1\107\1\110\1\111\1\u00c3\3\uffff\1\u00c4\1\u00c9"+
            "\1\u00c5\1\u00c8\1\u00c6\1\u00cc\1\u00cb\1\u00c7\1\u00ca",
            "\1\u00c2\16\uffff\1\113\1\114\1\115\1\116\1\117\1\120\1\121"+
            "\1\122\1\123\1\124\1\125\1\126\1\127\1\130\1\131\1\103\1\104"+
            "\1\105\1\106\1\107\1\110\1\111\1\u00cd\3\uffff\1\u00ce",
            "\2\102\10\uffff\1\102",
            "\2\102\10\uffff\1\102",
            "\1\35\1\36\1\37\1\uffff\1\u0097\5\uffff\1\66\1\67\1\70\1\71"+
            "\1\72\1\73\1\74\2\uffff\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1"+
            "\56\1\57\1\60\1\61\1\62\1\63\1\64\1\65\1\40\1\41\1\42\1\43\1"+
            "\44\1\45\1\46\4\uffff\1\u009d\1\u009e\1\u009f\1\u00a0\1\u00a1"+
            "\1\u00a2\1\u00a3\1\u00a4\1\u00a5\1\u00a6\1\u00a7\1\u00a8\1\u00a9"+
            "\1\u00aa\1\u00ab\1\u00ac\1\u00ad\1\u00ae\1\u00af\1\u00b0\1\u00b1"+
            "\42\uffff\1\u0098\1\u0099\1\u009a\1\uffff\1\u009b\1\u009c",
            "\1\35\1\36\1\37\1\uffff\1\u0097\5\uffff\1\66\1\67\1\70\1\71"+
            "\1\72\1\73\1\74\2\uffff\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1"+
            "\56\1\57\1\60\1\61\1\62\1\63\1\64\1\65\1\40\1\41\1\42\1\43\1"+
            "\44\1\45\1\46\4\uffff\1\u009d\1\u009e\1\u009f\1\u00a0\1\u00a1"+
            "\1\u00a2\1\u00a3\1\u00a4\1\u00a5\1\u00a6\1\u00a7\1\u00a8\1\u00a9"+
            "\1\u00aa\1\u00ab\1\u00ac\1\u00ad\1\u00ae\1\u00af\1\u00b0\1\u00b1"+
            "\42\uffff\1\u0098\1\u0099\1\u009a\1\uffff\1\u009b\1\u009c",
            "\1\u00b7\1\u00bc\1\u00b9\1\u00bb\1\u00ba\1\u00bf\1\u00bd\1"+
            "\u00b8\1\u00be",
            "\1\155\16\uffff\1\156\1\157\1\160\1\161\1\162\1\163\1\164\1"+
            "\165\1\166\1\167\1\170\1\171\1\172\1\173\1\174\1\146\1\147\1"+
            "\150\1\151\1\152\1\153\1\154",
            "\1\155\16\uffff\1\156\1\157\1\160\1\161\1\162\1\163\1\164\1"+
            "\165\1\166\1\167\1\170\1\171\1\172\1\173\1\174\1\146\1\147\1"+
            "\150\1\151\1\152\1\153\1\154",
            "\1\155\16\uffff\1\156\1\157\1\160\1\161\1\162\1\163\1\164\1"+
            "\165\1\166\1\167\1\170\1\171\1\172\1\173\1\174\1\146\1\147\1"+
            "\150\1\151\1\152\1\153\1\154",
            "\1\155\16\uffff\1\156\1\157\1\160\1\161\1\162\1\163\1\164\1"+
            "\165\1\166\1\167\1\170\1\171\1\172\1\173\1\174\1\146\1\147\1"+
            "\150\1\151\1\152\1\153\1\154",
            "\1\155\16\uffff\1\156\1\157\1\160\1\161\1\162\1\163\1\164\1"+
            "\165\1\166\1\167\1\170\1\171\1\172\1\173\1\174\1\146\1\147\1"+
            "\150\1\151\1\152\1\153\1\154",
            "\1\155\16\uffff\1\156\1\157\1\160\1\161\1\162\1\163\1\164\1"+
            "\165\1\166\1\167\1\170\1\171\1\172\1\173\1\174\1\146\1\147\1"+
            "\150\1\151\1\152\1\153\1\154",
            "\1\155\16\uffff\1\156\1\157\1\160\1\161\1\162\1\163\1\164\1"+
            "\165\1\166\1\167\1\170\1\171\1\172\1\173\1\174\1\146\1\147\1"+
            "\150\1\151\1\152\1\153\1\154",
            "\1\155\16\uffff\1\156\1\157\1\160\1\161\1\162\1\163\1\164\1"+
            "\165\1\166\1\167\1\170\1\171\1\172\1\173\1\174\1\146\1\147\1"+
            "\150\1\151\1\152\1\153\1\154",
            "\1\155\16\uffff\1\156\1\157\1\160\1\161\1\162\1\163\1\164\1"+
            "\165\1\166\1\167\1\170\1\171\1\172\1\173\1\174\1\146\1\147\1"+
            "\150\1\151\1\152\1\153\1\154",
            "\1\u00c1",
            "\1\155\16\uffff\1\156\1\157\1\160\1\161\1\162\1\163\1\164\1"+
            "\165\1\166\1\167\1\170\1\171\1\172\1\173\1\174\1\146\1\147\1"+
            "\150\1\151\1\152\1\153\1\154",
            "\2\102\10\uffff\1\102\11\uffff\1\u00b2\1\u00b3",
            "\1\u00c4\1\u00c9\1\u00c5\1\u00c8\1\u00c6\1\u00cc\1\u00cb\1"+
            "\u00c7\1\u00ca",
            "\1\u00c2\16\uffff\1\113\1\114\1\115\1\116\1\117\1\120\1\121"+
            "\1\122\1\123\1\124\1\125\1\126\1\127\1\130\1\131\1\103\1\104"+
            "\1\105\1\106\1\107\1\110\1\111",
            "\1\u00c2\16\uffff\1\113\1\114\1\115\1\116\1\117\1\120\1\121"+
            "\1\122\1\123\1\124\1\125\1\126\1\127\1\130\1\131\1\103\1\104"+
            "\1\105\1\106\1\107\1\110\1\111",
            "\1\u00c2\16\uffff\1\113\1\114\1\115\1\116\1\117\1\120\1\121"+
            "\1\122\1\123\1\124\1\125\1\126\1\127\1\130\1\131\1\103\1\104"+
            "\1\105\1\106\1\107\1\110\1\111",
            "\1\u00c2\16\uffff\1\113\1\114\1\115\1\116\1\117\1\120\1\121"+
            "\1\122\1\123\1\124\1\125\1\126\1\127\1\130\1\131\1\103\1\104"+
            "\1\105\1\106\1\107\1\110\1\111",
            "\1\u00c2\16\uffff\1\113\1\114\1\115\1\116\1\117\1\120\1\121"+
            "\1\122\1\123\1\124\1\125\1\126\1\127\1\130\1\131\1\103\1\104"+
            "\1\105\1\106\1\107\1\110\1\111",
            "\1\u00c2\16\uffff\1\113\1\114\1\115\1\116\1\117\1\120\1\121"+
            "\1\122\1\123\1\124\1\125\1\126\1\127\1\130\1\131\1\103\1\104"+
            "\1\105\1\106\1\107\1\110\1\111",
            "\1\u00c2\16\uffff\1\113\1\114\1\115\1\116\1\117\1\120\1\121"+
            "\1\122\1\123\1\124\1\125\1\126\1\127\1\130\1\131\1\103\1\104"+
            "\1\105\1\106\1\107\1\110\1\111",
            "\1\u00c2\16\uffff\1\113\1\114\1\115\1\116\1\117\1\120\1\121"+
            "\1\122\1\123\1\124\1\125\1\126\1\127\1\130\1\131\1\103\1\104"+
            "\1\105\1\106\1\107\1\110\1\111",
            "\1\u00c2\16\uffff\1\113\1\114\1\115\1\116\1\117\1\120\1\121"+
            "\1\122\1\123\1\124\1\125\1\126\1\127\1\130\1\131\1\103\1\104"+
            "\1\105\1\106\1\107\1\110\1\111",
            "\1\u00ce",
            "\1\u00c2\16\uffff\1\113\1\114\1\115\1\116\1\117\1\120\1\121"+
            "\1\122\1\123\1\124\1\125\1\126\1\127\1\130\1\131\1\103\1\104"+
            "\1\105\1\106\1\107\1\110\1\111"
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
            return "33:1: relative_datetime : ( ( date_prefix )? relative_date ( date_time_sep )? time | time time_date_sep ( date_prefix )? relative_date | ( date_prefix )? relative_date );";
        }
    }
    static final String DFA1_eotS =
        "\53\uffff";
    static final String DFA1_eofS =
        "\53\uffff";
    static final String DFA1_minS =
        "\1\26\1\uffff\1\23\32\32\1\uffff\1\23\1\103\11\32\1\103\1\32";
    static final String DFA1_maxS =
        "\1\177\1\uffff\1\35\30\76\1\113\1\103\1\uffff\1\50\1\113\11\76\1"+
        "\103\1\76";
    static final String DFA1_acceptS =
        "\1\uffff\1\1\33\uffff\1\2\15\uffff";
    static final String DFA1_specialS =
        "\53\uffff}>";
    static final String[] DFA1_transitionS = {
            "\3\35\1\1\1\2\5\uffff\7\35\2\uffff\26\35\4\uffff\1\10\1\11\1"+
            "\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1"+
            "\26\1\27\1\30\1\31\1\32\1\33\1\34\42\uffff\1\3\1\4\1\5\1\uffff"+
            "\1\6\1\7",
            "",
            "\2\35\6\uffff\2\1\1\35",
            "\1\36\16\uffff\26\35",
            "\1\36\16\uffff\26\35",
            "\1\36\16\uffff\26\35",
            "\1\36\16\uffff\26\35",
            "\1\36\16\uffff\26\35",
            "\1\36\16\uffff\26\35",
            "\1\36\16\uffff\26\35",
            "\1\36\16\uffff\26\35",
            "\1\36\16\uffff\26\35",
            "\1\36\16\uffff\26\35",
            "\1\36\16\uffff\26\35",
            "\1\36\16\uffff\26\35",
            "\1\36\16\uffff\26\35",
            "\1\36\16\uffff\26\35",
            "\1\36\16\uffff\26\35",
            "\1\36\16\uffff\26\35",
            "\1\36\16\uffff\26\35",
            "\1\36\16\uffff\26\35",
            "\1\36\16\uffff\26\35",
            "\1\36\16\uffff\26\35",
            "\1\36\16\uffff\26\35",
            "\1\36\16\uffff\26\35",
            "\1\36\16\uffff\26\35",
            "\1\36\16\uffff\26\35",
            "\1\36\16\uffff\26\35\1\37\3\uffff\1\45\1\43\1\41\1\40\1\42"+
            "\1\44\1\47\1\50\1\46",
            "\1\36\16\uffff\26\35\1\51\3\uffff\1\52",
            "",
            "\2\35\6\uffff\2\1\1\35\11\uffff\2\35",
            "\1\45\1\43\1\41\1\40\1\42\1\44\1\47\1\50\1\46",
            "\1\36\16\uffff\26\35",
            "\1\36\16\uffff\26\35",
            "\1\36\16\uffff\26\35",
            "\1\36\16\uffff\26\35",
            "\1\36\16\uffff\26\35",
            "\1\36\16\uffff\26\35",
            "\1\36\16\uffff\26\35",
            "\1\36\16\uffff\26\35",
            "\1\36\16\uffff\26\35",
            "\1\52",
            "\1\36\16\uffff\26\35"
    };

    static final short[] DFA1_eot = DFA.unpackEncodedString(DFA1_eotS);
    static final short[] DFA1_eof = DFA.unpackEncodedString(DFA1_eofS);
    static final char[] DFA1_min = DFA.unpackEncodedStringToUnsignedChars(DFA1_minS);
    static final char[] DFA1_max = DFA.unpackEncodedStringToUnsignedChars(DFA1_maxS);
    static final short[] DFA1_accept = DFA.unpackEncodedString(DFA1_acceptS);
    static final short[] DFA1_special = DFA.unpackEncodedString(DFA1_specialS);
    static final short[][] DFA1_transition;

    static {
        int numStates = DFA1_transitionS.length;
        DFA1_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA1_transition[i] = DFA.unpackEncodedString(DFA1_transitionS[i]);
        }
    }

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = DFA1_eot;
            this.eof = DFA1_eof;
            this.min = DFA1_min;
            this.max = DFA1_max;
            this.accept = DFA1_accept;
            this.special = DFA1_special;
            this.transition = DFA1_transition;
        }
        public String getDescription() {
            return "34:5: ( date_prefix )?";
        }
    }
    static final String DFA3_eotS =
        "\53\uffff";
    static final String DFA3_eofS =
        "\2\uffff\1\35\33\uffff\1\35\14\uffff";
    static final String DFA3_minS =
        "\1\26\1\uffff\1\33\32\32\1\uffff\1\33\1\103\11\32\1\103\1\32";
    static final String DFA3_maxS =
        "\1\177\1\uffff\1\34\30\76\1\113\1\103\1\uffff\1\50\1\113\11\76\1"+
        "\103\1\76";
    static final String DFA3_acceptS =
        "\1\uffff\1\1\33\uffff\1\2\15\uffff";
    static final String DFA3_specialS =
        "\53\uffff}>";
    static final String[] DFA3_transitionS = {
            "\3\35\1\1\1\2\5\uffff\7\35\2\uffff\26\35\4\uffff\1\10\1\11\1"+
            "\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1"+
            "\26\1\27\1\30\1\31\1\32\1\33\1\34\42\uffff\1\3\1\4\1\5\1\uffff"+
            "\1\6\1\7",
            "",
            "\2\1",
            "\1\36\16\uffff\26\35",
            "\1\36\16\uffff\26\35",
            "\1\36\16\uffff\26\35",
            "\1\36\16\uffff\26\35",
            "\1\36\16\uffff\26\35",
            "\1\36\16\uffff\26\35",
            "\1\36\16\uffff\26\35",
            "\1\36\16\uffff\26\35",
            "\1\36\16\uffff\26\35",
            "\1\36\16\uffff\26\35",
            "\1\36\16\uffff\26\35",
            "\1\36\16\uffff\26\35",
            "\1\36\16\uffff\26\35",
            "\1\36\16\uffff\26\35",
            "\1\36\16\uffff\26\35",
            "\1\36\16\uffff\26\35",
            "\1\36\16\uffff\26\35",
            "\1\36\16\uffff\26\35",
            "\1\36\16\uffff\26\35",
            "\1\36\16\uffff\26\35",
            "\1\36\16\uffff\26\35",
            "\1\36\16\uffff\26\35",
            "\1\36\16\uffff\26\35",
            "\1\36\16\uffff\26\35",
            "\1\36\16\uffff\26\35\1\37\3\uffff\1\42\1\43\1\40\1\44\1\47"+
            "\1\50\1\46\1\45\1\41",
            "\1\36\16\uffff\26\35\1\51\3\uffff\1\52",
            "",
            "\2\1\12\uffff\2\35",
            "\1\42\1\43\1\40\1\44\1\47\1\50\1\46\1\45\1\41",
            "\1\36\16\uffff\26\35",
            "\1\36\16\uffff\26\35",
            "\1\36\16\uffff\26\35",
            "\1\36\16\uffff\26\35",
            "\1\36\16\uffff\26\35",
            "\1\36\16\uffff\26\35",
            "\1\36\16\uffff\26\35",
            "\1\36\16\uffff\26\35",
            "\1\36\16\uffff\26\35",
            "\1\52",
            "\1\36\16\uffff\26\35"
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
            return "35:24: ( date_prefix )?";
        }
    }
    static final String DFA4_eotS =
        "\53\uffff";
    static final String DFA4_eofS =
        "\2\uffff\1\35\33\uffff\1\35\14\uffff";
    static final String DFA4_minS =
        "\1\26\1\uffff\1\33\32\32\1\uffff\1\33\1\103\11\32\1\103\1\32";
    static final String DFA4_maxS =
        "\1\177\1\uffff\1\34\30\76\1\113\1\103\1\uffff\1\50\1\113\11\76\1"+
        "\103\1\76";
    static final String DFA4_acceptS =
        "\1\uffff\1\1\33\uffff\1\2\15\uffff";
    static final String DFA4_specialS =
        "\53\uffff}>";
    static final String[] DFA4_transitionS = {
            "\3\35\1\1\1\2\5\uffff\7\35\2\uffff\26\35\4\uffff\1\10\1\11\1"+
            "\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1"+
            "\26\1\27\1\30\1\31\1\32\1\33\1\34\42\uffff\1\3\1\4\1\5\1\uffff"+
            "\1\6\1\7",
            "",
            "\2\1",
            "\1\36\16\uffff\26\35",
            "\1\36\16\uffff\26\35",
            "\1\36\16\uffff\26\35",
            "\1\36\16\uffff\26\35",
            "\1\36\16\uffff\26\35",
            "\1\36\16\uffff\26\35",
            "\1\36\16\uffff\26\35",
            "\1\36\16\uffff\26\35",
            "\1\36\16\uffff\26\35",
            "\1\36\16\uffff\26\35",
            "\1\36\16\uffff\26\35",
            "\1\36\16\uffff\26\35",
            "\1\36\16\uffff\26\35",
            "\1\36\16\uffff\26\35",
            "\1\36\16\uffff\26\35",
            "\1\36\16\uffff\26\35",
            "\1\36\16\uffff\26\35",
            "\1\36\16\uffff\26\35",
            "\1\36\16\uffff\26\35",
            "\1\36\16\uffff\26\35",
            "\1\36\16\uffff\26\35",
            "\1\36\16\uffff\26\35",
            "\1\36\16\uffff\26\35",
            "\1\36\16\uffff\26\35",
            "\1\36\16\uffff\26\35\1\37\3\uffff\1\43\1\41\1\44\1\47\1\50"+
            "\1\46\1\45\1\42\1\40",
            "\1\36\16\uffff\26\35\1\51\3\uffff\1\52",
            "",
            "\2\1\12\uffff\2\35",
            "\1\43\1\41\1\44\1\47\1\50\1\46\1\45\1\42\1\40",
            "\1\36\16\uffff\26\35",
            "\1\36\16\uffff\26\35",
            "\1\36\16\uffff\26\35",
            "\1\36\16\uffff\26\35",
            "\1\36\16\uffff\26\35",
            "\1\36\16\uffff\26\35",
            "\1\36\16\uffff\26\35",
            "\1\36\16\uffff\26\35",
            "\1\36\16\uffff\26\35",
            "\1\52",
            "\1\36\16\uffff\26\35"
    };

    static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
    static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
    static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
    static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
    static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
    static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
    static final short[][] DFA4_transition;

    static {
        int numStates = DFA4_transitionS.length;
        DFA4_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
        }
    }

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = DFA4_eot;
            this.eof = DFA4_eof;
            this.min = DFA4_min;
            this.max = DFA4_max;
            this.accept = DFA4_accept;
            this.special = DFA4_special;
            this.transition = DFA4_transition;
        }
        public String getDescription() {
            return "36:5: ( date_prefix )?";
        }
    }
    static final String DFA6_eotS =
        "\102\uffff";
    static final String DFA6_eofS =
        "\36\uffff\27\3\15\uffff";
    static final String DFA6_minS =
        "\1\26\3\uffff\32\32\27\23\1\103\11\32\1\103\1\32\1\uffff";
    static final String DFA6_maxS =
        "\1\177\3\uffff\30\76\1\113\1\103\27\50\1\113\11\76\1\103\1\76\1"+
        "\uffff";
    static final String DFA6_acceptS =
        "\1\uffff\1\1\1\2\1\3\75\uffff\1\4";
    static final String DFA6_specialS =
        "\102\uffff}>";
    static final String[] DFA6_transitionS = {
            "\3\1\1\uffff\1\2\5\uffff\7\3\2\uffff\26\2\4\uffff\1\11\1\12"+
            "\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26"+
            "\1\27\1\30\1\31\1\32\1\33\1\34\1\35\42\uffff\1\4\1\5\1\6\1\uffff"+
            "\1\7\1\10",
            "",
            "",
            "",
            "\1\45\16\uffff\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56"+
            "\1\57\1\60\1\61\1\62\1\63\1\64\1\36\1\37\1\40\1\41\1\42\1\43"+
            "\1\44",
            "\1\45\16\uffff\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56"+
            "\1\57\1\60\1\61\1\62\1\63\1\64\1\36\1\37\1\40\1\41\1\42\1\43"+
            "\1\44",
            "\1\45\16\uffff\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56"+
            "\1\57\1\60\1\61\1\62\1\63\1\64\1\36\1\37\1\40\1\41\1\42\1\43"+
            "\1\44",
            "\1\45\16\uffff\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56"+
            "\1\57\1\60\1\61\1\62\1\63\1\64\1\36\1\37\1\40\1\41\1\42\1\43"+
            "\1\44",
            "\1\45\16\uffff\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56"+
            "\1\57\1\60\1\61\1\62\1\63\1\64\1\36\1\37\1\40\1\41\1\42\1\43"+
            "\1\44",
            "\1\45\16\uffff\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56"+
            "\1\57\1\60\1\61\1\62\1\63\1\64\1\36\1\37\1\40\1\41\1\42\1\43"+
            "\1\44",
            "\1\45\16\uffff\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56"+
            "\1\57\1\60\1\61\1\62\1\63\1\64\1\36\1\37\1\40\1\41\1\42\1\43"+
            "\1\44",
            "\1\45\16\uffff\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56"+
            "\1\57\1\60\1\61\1\62\1\63\1\64\1\36\1\37\1\40\1\41\1\42\1\43"+
            "\1\44",
            "\1\45\16\uffff\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56"+
            "\1\57\1\60\1\61\1\62\1\63\1\64\1\36\1\37\1\40\1\41\1\42\1\43"+
            "\1\44",
            "\1\45\16\uffff\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56"+
            "\1\57\1\60\1\61\1\62\1\63\1\64\1\36\1\37\1\40\1\41\1\42\1\43"+
            "\1\44",
            "\1\45\16\uffff\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56"+
            "\1\57\1\60\1\61\1\62\1\63\1\64\1\36\1\37\1\40\1\41\1\42\1\43"+
            "\1\44",
            "\1\45\16\uffff\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56"+
            "\1\57\1\60\1\61\1\62\1\63\1\64\1\36\1\37\1\40\1\41\1\42\1\43"+
            "\1\44",
            "\1\45\16\uffff\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56"+
            "\1\57\1\60\1\61\1\62\1\63\1\64\1\36\1\37\1\40\1\41\1\42\1\43"+
            "\1\44",
            "\1\45\16\uffff\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56"+
            "\1\57\1\60\1\61\1\62\1\63\1\64\1\36\1\37\1\40\1\41\1\42\1\43"+
            "\1\44",
            "\1\45\16\uffff\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56"+
            "\1\57\1\60\1\61\1\62\1\63\1\64\1\36\1\37\1\40\1\41\1\42\1\43"+
            "\1\44",
            "\1\45\16\uffff\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56"+
            "\1\57\1\60\1\61\1\62\1\63\1\64\1\36\1\37\1\40\1\41\1\42\1\43"+
            "\1\44",
            "\1\45\16\uffff\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56"+
            "\1\57\1\60\1\61\1\62\1\63\1\64\1\36\1\37\1\40\1\41\1\42\1\43"+
            "\1\44",
            "\1\45\16\uffff\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56"+
            "\1\57\1\60\1\61\1\62\1\63\1\64\1\36\1\37\1\40\1\41\1\42\1\43"+
            "\1\44",
            "\1\45\16\uffff\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56"+
            "\1\57\1\60\1\61\1\62\1\63\1\64\1\36\1\37\1\40\1\41\1\42\1\43"+
            "\1\44",
            "\1\45\16\uffff\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56"+
            "\1\57\1\60\1\61\1\62\1\63\1\64\1\36\1\37\1\40\1\41\1\42\1\43"+
            "\1\44",
            "\1\45\16\uffff\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56"+
            "\1\57\1\60\1\61\1\62\1\63\1\64\1\36\1\37\1\40\1\41\1\42\1\43"+
            "\1\44",
            "\1\45\16\uffff\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56"+
            "\1\57\1\60\1\61\1\62\1\63\1\64\1\36\1\37\1\40\1\41\1\42\1\43"+
            "\1\44",
            "\1\45\16\uffff\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56"+
            "\1\57\1\60\1\61\1\62\1\63\1\64\1\36\1\37\1\40\1\41\1\42\1\43"+
            "\1\44",
            "\1\45\16\uffff\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56"+
            "\1\57\1\60\1\61\1\62\1\63\1\64\1\36\1\37\1\40\1\41\1\42\1\43"+
            "\1\44",
            "\1\45\16\uffff\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56"+
            "\1\57\1\60\1\61\1\62\1\63\1\64\1\36\1\37\1\40\1\41\1\42\1\43"+
            "\1\44\1\65\3\uffff\1\72\1\67\1\75\1\73\1\71\1\70\1\76\1\74\1"+
            "\66",
            "\1\45\16\uffff\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56"+
            "\1\57\1\60\1\61\1\62\1\63\1\64\1\36\1\37\1\40\1\41\1\42\1\43"+
            "\1\44\1\77\3\uffff\1\100",
            "\2\3\10\uffff\1\3\11\uffff\2\101",
            "\2\3\10\uffff\1\3\11\uffff\2\101",
            "\2\3\10\uffff\1\3\11\uffff\2\101",
            "\2\3\10\uffff\1\3\11\uffff\2\101",
            "\2\3\10\uffff\1\3\11\uffff\2\101",
            "\2\3\10\uffff\1\3\11\uffff\2\101",
            "\2\3\10\uffff\1\3\11\uffff\2\101",
            "\2\3\10\uffff\1\3\11\uffff\2\101",
            "\2\3\10\uffff\1\3\11\uffff\2\101",
            "\2\3\10\uffff\1\3\11\uffff\2\101",
            "\2\3\10\uffff\1\3\11\uffff\2\101",
            "\2\3\10\uffff\1\3\11\uffff\2\101",
            "\2\3\10\uffff\1\3\11\uffff\2\101",
            "\2\3\10\uffff\1\3\11\uffff\2\101",
            "\2\3\10\uffff\1\3\11\uffff\2\101",
            "\2\3\10\uffff\1\3\11\uffff\2\101",
            "\2\3\10\uffff\1\3\11\uffff\2\101",
            "\2\3\10\uffff\1\3\11\uffff\2\101",
            "\2\3\10\uffff\1\3\11\uffff\2\101",
            "\2\3\10\uffff\1\3\11\uffff\2\101",
            "\2\3\10\uffff\1\3\11\uffff\2\101",
            "\2\3\10\uffff\1\3\11\uffff\2\101",
            "\2\3\10\uffff\1\3\11\uffff\2\101",
            "\1\72\1\67\1\75\1\73\1\71\1\70\1\76\1\74\1\66",
            "\1\45\16\uffff\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56"+
            "\1\57\1\60\1\61\1\62\1\63\1\64\1\36\1\37\1\40\1\41\1\42\1\43"+
            "\1\44",
            "\1\45\16\uffff\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56"+
            "\1\57\1\60\1\61\1\62\1\63\1\64\1\36\1\37\1\40\1\41\1\42\1\43"+
            "\1\44",
            "\1\45\16\uffff\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56"+
            "\1\57\1\60\1\61\1\62\1\63\1\64\1\36\1\37\1\40\1\41\1\42\1\43"+
            "\1\44",
            "\1\45\16\uffff\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56"+
            "\1\57\1\60\1\61\1\62\1\63\1\64\1\36\1\37\1\40\1\41\1\42\1\43"+
            "\1\44",
            "\1\45\16\uffff\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56"+
            "\1\57\1\60\1\61\1\62\1\63\1\64\1\36\1\37\1\40\1\41\1\42\1\43"+
            "\1\44",
            "\1\45\16\uffff\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56"+
            "\1\57\1\60\1\61\1\62\1\63\1\64\1\36\1\37\1\40\1\41\1\42\1\43"+
            "\1\44",
            "\1\45\16\uffff\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56"+
            "\1\57\1\60\1\61\1\62\1\63\1\64\1\36\1\37\1\40\1\41\1\42\1\43"+
            "\1\44",
            "\1\45\16\uffff\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56"+
            "\1\57\1\60\1\61\1\62\1\63\1\64\1\36\1\37\1\40\1\41\1\42\1\43"+
            "\1\44",
            "\1\45\16\uffff\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56"+
            "\1\57\1\60\1\61\1\62\1\63\1\64\1\36\1\37\1\40\1\41\1\42\1\43"+
            "\1\44",
            "\1\100",
            "\1\45\16\uffff\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56"+
            "\1\57\1\60\1\61\1\62\1\63\1\64\1\36\1\37\1\40\1\41\1\42\1\43"+
            "\1\44",
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
            return "56:1: relative_date : ( named_relative_date | modifiable_target -> ^( RELATIVE_DATE SEEK_DIR[\">\"] SEEK_TYPE[\"by_day\"] INT[\"1\"] modifiable_target ) | target_prefix modifiable_target -> ^( RELATIVE_DATE target_prefix modifiable_target ) | spelled_or_int_1_to_31 modifiable_target target_suffix -> ^( RELATIVE_DATE target_suffix spelled_or_int_1_to_31 modifiable_target ) );";
        }
    }
    static final String DFA12_eotS =
        "\56\uffff";
    static final String DFA12_eofS =
        "\56\uffff";
    static final String DFA12_minS =
        "\1\31\1\32\1\33\32\32\2\uffff\1\33\1\103\11\32\1\103\1\32\2\uffff";
    static final String DFA12_maxS =
        "\1\177\1\32\1\34\30\32\1\113\1\103\2\uffff\1\34\1\113\11\32\1\103"+
        "\1\32\2\uffff";
    static final String DFA12_acceptS =
        "\35\uffff\1\1\1\3\15\uffff\1\2\1\4";
    static final String DFA12_specialS =
        "\56\uffff}>";
    static final String[] DFA12_transitionS = {
            "\1\1\1\2\50\uffff\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1"+
            "\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1"+
            "\34\42\uffff\1\3\1\4\1\5\1\uffff\1\6\1\7",
            "\1\2",
            "\1\35\1\36",
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
            "\1\37",
            "\1\37\44\uffff\1\40\3\uffff\1\45\1\47\1\44\1\42\1\46\1\43\1"+
            "\51\1\50\1\41",
            "\1\37\44\uffff\1\52\3\uffff\1\53",
            "",
            "",
            "\1\54\1\55",
            "\1\45\1\47\1\44\1\42\1\46\1\43\1\51\1\50\1\41",
            "\1\37",
            "\1\37",
            "\1\37",
            "\1\37",
            "\1\37",
            "\1\37",
            "\1\37",
            "\1\37",
            "\1\37",
            "\1\53",
            "\1\37",
            "",
            ""
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
            return "90:1: date_prefix : ( ( THE )? DAY AFTER -> SEEK_DIR[\">\"] INT[\"1\"] | spelled_or_int_1_to_31 DAY AFTER -> SEEK_DIR[\">\"] spelled_or_int_1_to_31 | ( THE )? DAY BEFORE -> SEEK_DIR[\"<\"] INT[\"1\"] | spelled_or_int_1_to_31 DAY BEFORE -> SEEK_DIR[\"<\"] spelled_or_int_1_to_31 );";
        }
    }
    static final String DFA44_eotS =
        "\44\uffff";
    static final String DFA44_eofS =
        "\44\uffff";
    static final String DFA44_minS =
        "\1\103\24\uffff\2\32\1\103\14\uffff";
    static final String DFA44_maxS =
        "\1\177\24\uffff\1\113\1\103\1\113\14\uffff";
    static final String DFA44_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1"+
        "\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\3\uffff\1\36\1\33\1\30\1"+
        "\25\1\31\1\26\1\34\1\35\1\27\1\32\1\40\1\37";
    static final String DFA44_specialS =
        "\44\uffff}>";
    static final String[] DFA44_transitionS = {
            "\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16"+
            "\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\42\uffff\3\1\1\uffff"+
            "\2\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\33\16\uffff\26\33\1\27\3\uffff\1\35\1\40\1\32\1\34\1\41"+
            "\1\31\1\36\1\37\1\30",
            "\1\43\16\uffff\26\43\1\42\3\uffff\1\42",
            "\1\35\1\40\1\32\1\34\1\41\1\31\1\36\1\37\1\30",
            "",
            "",
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

    static final short[] DFA44_eot = DFA.unpackEncodedString(DFA44_eotS);
    static final short[] DFA44_eof = DFA.unpackEncodedString(DFA44_eofS);
    static final char[] DFA44_min = DFA.unpackEncodedStringToUnsignedChars(DFA44_minS);
    static final char[] DFA44_max = DFA.unpackEncodedStringToUnsignedChars(DFA44_maxS);
    static final short[] DFA44_accept = DFA.unpackEncodedString(DFA44_acceptS);
    static final short[] DFA44_special = DFA.unpackEncodedString(DFA44_specialS);
    static final short[][] DFA44_transition;

    static {
        int numStates = DFA44_transitionS.length;
        DFA44_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA44_transition[i] = DFA.unpackEncodedString(DFA44_transitionS[i]);
        }
    }

    class DFA44 extends DFA {

        public DFA44(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 44;
            this.eot = DFA44_eot;
            this.eof = DFA44_eof;
            this.min = DFA44_min;
            this.max = DFA44_max;
            this.accept = DFA44_accept;
            this.special = DFA44_special;
            this.transition = DFA44_transition;
        }
        public String getDescription() {
            return "197:1: spelled_or_int_1_to_31 : ( int_1_to_31 | ONE -> INT[\"1\"] | TWO -> INT[\"2\"] | THREE -> INT[\"3\"] | FOUR -> INT[\"4\"] | FIVE -> INT[\"5\"] | SIX -> INT[\"6\"] | SEVEN -> INT[\"7\"] | EIGHT -> INT[\"8\"] | NINE -> INT[\"9\"] | TEN -> INT[\"10\"] | ELEVEN -> INT[\"11\"] | TWELVE -> INT[\"12\"] | THIRTEEN -> INT[\"13\"] | FOURTEEN -> INT[\"14\"] | FIFTEEN -> INT[\"15\"] | SIXTEEN -> INT[\"16\"] | SEVENTEEN -> INT[\"17\"] | EIGHTEEN -> INT[\"18\"] | NINETEEN -> INT[\"19\"] | TWENTY -> INT[\"20\"] | TWENTY ( DASH )? ONE -> INT[\"21\"] | TWENTY ( DASH )? TWO -> INT[\"22\"] | TWENTY ( DASH )? THREE -> INT[\"23\"] | TWENTY ( DASH )? FOUR -> INT[\"24\"] | TWENTY ( DASH )? FIVE -> INT[\"25\"] | TWENTY ( DASH )? SIX -> INT[\"26\"] | TWENTY ( DASH )? SEVEN -> INT[\"27\"] | TWENTY ( DASH )? EIGHT -> INT[\"28\"] | TWENTY ( DASH )? NINE -> INT[\"29\"] | THIRTY -> INT[\"30\"] | THIRTY ( DASH )? ONE -> INT[\"31\"] );";
        }
    }
    static final String DFA65_eotS =
        "\42\uffff";
    static final String DFA65_eofS =
        "\42\uffff";
    static final String DFA65_minS =
        "\1\126\25\uffff\1\77\12\uffff\1\130";
    static final String DFA65_maxS =
        "\1\166\25\uffff\1\140\12\uffff\1\140";
    static final String DFA65_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1"+
        "\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\uffff\1\26\1\27\1"+
        "\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\uffff";
    static final String DFA65_specialS =
        "\42\uffff}>";
    static final String[] DFA65_transitionS = {
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
            "\1\41\30\uffff\1\25\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\25\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36"
    };

    static final short[] DFA65_eot = DFA.unpackEncodedString(DFA65_eotS);
    static final short[] DFA65_eof = DFA.unpackEncodedString(DFA65_eofS);
    static final char[] DFA65_min = DFA.unpackEncodedStringToUnsignedChars(DFA65_minS);
    static final char[] DFA65_max = DFA.unpackEncodedStringToUnsignedChars(DFA65_maxS);
    static final short[] DFA65_accept = DFA.unpackEncodedString(DFA65_acceptS);
    static final short[] DFA65_special = DFA.unpackEncodedString(DFA65_specialS);
    static final short[][] DFA65_transition;

    static {
        int numStates = DFA65_transitionS.length;
        DFA65_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA65_transition[i] = DFA.unpackEncodedString(DFA65_transitionS[i]);
        }
    }

    class DFA65 extends DFA {

        public DFA65(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 65;
            this.eot = DFA65_eot;
            this.eof = DFA65_eof;
            this.min = DFA65_min;
            this.max = DFA65_max;
            this.accept = DFA65_accept;
            this.special = DFA65_special;
            this.transition = DFA65_transition;
        }
        public String getDescription() {
            return "234:1: spelled_sequence_1_to_31 : ( FIRST -> INT[\"1\"] | SECOND -> INT[\"2\"] | THIRD -> INT[\"3\"] | FOURTH -> INT[\"4\"] | FIFTH -> INT[\"5\"] | SIXTH -> INT[\"6\"] | SEVENTH -> INT[\"7\"] | EIGHTH -> INT[\"8\"] | NINTH -> INT[\"9\"] | TENTH -> INT[\"10\"] | ELEVENTH -> INT[\"11\"] | TWELFTH -> INT[\"12\"] | THIRTEENTH -> INT[\"13\"] | FOURTEENTH -> INT[\"14\"] | FIFTEENTH -> INT[\"15\"] | SIXTEENTH -> INT[\"16\"] | SEVENTEENTH -> INT[\"17\"] | EIGHTEENTH -> INT[\"18\"] | NINETEENTH -> INT[\"19\"] | TWENTIETH -> INT[\"20\"] | ( TWENTY_FIRST | ( TWENTY ( DASH )? FIRST ) ) -> INT[\"21\"] | ( TWENTY_SECOND | ( TWENTY ( DASH )? SECOND ) ) -> INT[\"22\"] | ( TWENTY_THIRD | ( TWENTY ( DASH )? THIRD ) ) -> INT[\"23\"] | ( TWENTY_FOURTH | ( TWENTY ( DASH )? FOURTH ) ) -> INT[\"24\"] | ( TWENTY_FIFTH | ( TWENTY ( DASH )? FIFTH ) ) -> INT[\"25\"] | ( TWENTY_SIXTH | ( TWENTY ( DASH )? SIXTH ) ) -> INT[\"26\"] | ( TWENTY_SEVENTH | ( TWENTY ( DASH )? SEVENTH ) ) -> INT[\"27\"] | ( TWENTY_EIGHTH | ( TWENTY ( DASH )? EIGHTH ) ) -> INT[\"28\"] | ( TWENTY_NINTH | ( TWENTY ( DASH )? NINTH ) ) -> INT[\"29\"] | THIRTIETH -> INT[\"30\"] | ( THIRTY_FIRST | ( THIRTY ( DASH )? FIRST ) ) -> INT[\"31\"] );";
        }
    }
 

    public static final BitSet FOLLOW_explicit_datetime_in_datetime131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_date_prefix_in_relative_datetime148 = new BitSet(new long[]{0x7FFFFE7F05C00000L,0xDC00000000FFFFF8L});
    public static final BitSet FOLLOW_relative_date_in_relative_datetime151 = new BitSet(new long[]{0x0000000020180000L});
    public static final BitSet FOLLOW_date_time_sep_in_relative_datetime153 = new BitSet(new long[]{0x0000000020180000L});
    public static final BitSet FOLLOW_time_in_relative_datetime156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_time_in_relative_datetime162 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_time_date_sep_in_relative_datetime164 = new BitSet(new long[]{0x7FFFFE7F07C00000L,0xDC00000000FFFFF8L});
    public static final BitSet FOLLOW_date_prefix_in_relative_datetime166 = new BitSet(new long[]{0x7FFFFE7F05C00000L,0xDC00000000FFFFF8L});
    public static final BitSet FOLLOW_relative_date_in_relative_datetime169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_date_prefix_in_relative_datetime175 = new BitSet(new long[]{0x7FFFFE7F05C00000L,0xDC00000000FFFFF8L});
    public static final BitSet FOLLOW_relative_date_in_relative_datetime178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_day_of_month_in_explicit_datetime194 = new BitSet(new long[]{0x0000000020180000L});
    public static final BitSet FOLLOW_time_in_explicit_datetime196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_date_time_sep0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ON_in_time_date_sep242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_named_relative_date_in_relative_date258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_modifiable_target_in_relative_date270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_target_prefix_in_relative_date304 = new BitSet(new long[]{0x7FFFFE0004000000L});
    public static final BitSet FOLLOW_modifiable_target_in_relative_date306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spelled_or_int_1_to_31_in_relative_date335 = new BitSet(new long[]{0x7FFFFE0004000000L});
    public static final BitSet FOLLOW_modifiable_target_in_relative_date337 = new BitSet(new long[]{0x0000018000000000L});
    public static final BitSet FOLLOW_target_suffix_in_relative_date339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TODAY_in_named_relative_date371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOMORROW_in_named_relative_date393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_YESTERDAY_in_named_relative_date412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_int_4_digits_in_formal_explicit_date442 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_date_separator_in_formal_explicit_date444 = new BitSet(new long[]{0x0000000000000000L,0x1E00000000000000L});
    public static final BitSet FOLLOW_int_1_to_12_in_formal_explicit_date446 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_date_separator_in_formal_explicit_date448 = new BitSet(new long[]{0x0000000000000000L,0xDC00000000000000L});
    public static final BitSet FOLLOW_int_1_to_31_in_formal_explicit_date450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_int_1_to_12_in_formal_explicit_date489 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_date_separator_in_formal_explicit_date491 = new BitSet(new long[]{0x0000000000000000L,0xDC00000000000000L});
    public static final BitSet FOLLOW_int_1_to_31_in_formal_explicit_date493 = new BitSet(new long[]{0x8000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_date_separator_in_formal_explicit_date496 = new BitSet(new long[]{0x0000000000000000L,0xFF80000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_int_up_to_4_digits_in_formal_explicit_date498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THE_in_date_prefix547 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_DAY_in_date_prefix550 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_AFTER_in_date_prefix552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spelled_or_int_1_to_31_in_date_prefix585 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_DAY_in_date_prefix587 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_AFTER_in_date_prefix589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THE_in_date_prefix603 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_DAY_in_date_prefix606 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_BEFORE_in_date_prefix608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spelled_or_int_1_to_31_in_date_prefix640 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_DAY_in_date_prefix642 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_BEFORE_in_date_prefix644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLON_in_time667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MIDNIGHT_in_time_identifier698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOON_in_time_identifier720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIS_in_target_prefix756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIS_in_target_prefix783 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_LAST_in_target_prefix786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIS_in_target_prefix807 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_PAST_in_target_prefix810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIS_in_target_prefix831 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_NEXT_in_target_prefix834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIS_in_target_prefix855 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_COMING_in_target_prefix858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIS_in_target_prefix877 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_UPCOMING_in_target_prefix880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IN_in_target_prefix897 = new BitSet(new long[]{0x0000007F00000000L,0xDC00000000FFFFF8L});
    public static final BitSet FOLLOW_spelled_or_int_1_to_31_in_target_prefix900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FROM_NOW_in_target_suffix946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AGO_in_target_suffix960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_day_of_week_in_modifiable_target989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_date_span_in_modifiable_target996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_month_in_modifiable_target1002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DAY_in_date_span1017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WEEK_in_date_span1030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MONTH_in_date_span1042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_YEAR_in_date_span1053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_JANUARY_in_month1074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FEBRUARY_in_month1091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MARCH_in_month1107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_APRIL_in_month1126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MAY_in_month1145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_JUNE_in_month1166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_JULY_in_month1186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AUGUST_in_month1206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEPTEMBER_in_month1224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OCTOBER_in_month1239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOVEMBER_in_month1256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DECEMBER_in_month1272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_int_1_to_31_in_day_of_month1297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spelled_sequence_1_to_31_in_day_of_month1324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SUNDAY_in_day_of_week1348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MONDAY_in_day_of_week1366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TUESDAY_in_day_of_week1384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WEDNESDAY_in_day_of_week1401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THURSDAY_in_day_of_week1416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FRIDAY_in_day_of_week1432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SATURDAY_in_day_of_week1450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMMA_in_year1475 = new BitSet(new long[]{0x0000004000000000L,0xD600000000000000L,0x0000000000000013L});
    public static final BitSet FOLLOW_IN_in_year1479 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_THE_in_year1481 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_YEAR_in_year1483 = new BitSet(new long[]{0x0000000000000000L,0xD600000000000000L,0x0000000000000013L});
    public static final BitSet FOLLOW_132_in_year1487 = new BitSet(new long[]{0x0000000000000000L,0xD600000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_int_0_to_99_with_prefix_in_year1490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMMA_in_year1504 = new BitSet(new long[]{0x0000004000000000L,0x0180000000000000L});
    public static final BitSet FOLLOW_IN_in_year1508 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_THE_in_year1510 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_YEAR_in_year1512 = new BitSet(new long[]{0x0000004000000000L,0x0180000000000000L});
    public static final BitSet FOLLOW_int_3_or_4_digits_in_year1516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_date_separator0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_int_0_to_23_in_hours1570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_int_0_to_59_in_minutes1593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AM_in_meridian_indicator1616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PM_in_meridian_indicator1627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_int_1_to_31_in_spelled_or_int_1_to_311648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ONE_in_spelled_or_int_1_to_311654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWO_in_spelled_or_int_1_to_311672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THREE_in_spelled_or_int_1_to_311690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOUR_in_spelled_or_int_1_to_311706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FIVE_in_spelled_or_int_1_to_311723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SIX_in_spelled_or_int_1_to_311740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEVEN_in_spelled_or_int_1_to_311758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EIGHT_in_spelled_or_int_1_to_311774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NINE_in_spelled_or_int_1_to_311790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEN_in_spelled_or_int_1_to_311807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELEVEN_in_spelled_or_int_1_to_311825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWELVE_in_spelled_or_int_1_to_311840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIRTEEN_in_spelled_or_int_1_to_311855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOURTEEN_in_spelled_or_int_1_to_311868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FIFTEEN_in_spelled_or_int_1_to_311881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SIXTEEN_in_spelled_or_int_1_to_311895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEVENTEEN_in_spelled_or_int_1_to_311909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EIGHTEEN_in_spelled_or_int_1_to_311921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NINETEEN_in_spelled_or_int_1_to_311934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_or_int_1_to_311947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_or_int_1_to_311962 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_DASH_in_spelled_or_int_1_to_311964 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_ONE_in_spelled_or_int_1_to_311967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_or_int_1_to_311980 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_DASH_in_spelled_or_int_1_to_311982 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_TWO_in_spelled_or_int_1_to_311985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_or_int_1_to_311998 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_DASH_in_spelled_or_int_1_to_312000 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_THREE_in_spelled_or_int_1_to_312003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_or_int_1_to_312014 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_DASH_in_spelled_or_int_1_to_312016 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_FOUR_in_spelled_or_int_1_to_312019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_or_int_1_to_312031 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_DASH_in_spelled_or_int_1_to_312033 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_FIVE_in_spelled_or_int_1_to_312036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_or_int_1_to_312048 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_DASH_in_spelled_or_int_1_to_312050 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_SIX_in_spelled_or_int_1_to_312053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_or_int_1_to_312066 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_DASH_in_spelled_or_int_1_to_312068 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_SEVEN_in_spelled_or_int_1_to_312071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_or_int_1_to_312082 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_DASH_in_spelled_or_int_1_to_312084 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_EIGHT_in_spelled_or_int_1_to_312087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_or_int_1_to_312098 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_DASH_in_spelled_or_int_1_to_312100 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_NINE_in_spelled_or_int_1_to_312103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIRTY_in_spelled_or_int_1_to_312115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIRTY_in_spelled_or_int_1_to_312138 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_DASH_in_spelled_or_int_1_to_312140 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_ONE_in_spelled_or_int_1_to_312143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FIRST_in_spelled_sequence_1_to_312167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SECOND_in_spelled_sequence_1_to_312184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIRD_in_spelled_sequence_1_to_312200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOURTH_in_spelled_sequence_1_to_312217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FIFTH_in_spelled_sequence_1_to_312233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SIXTH_in_spelled_sequence_1_to_312250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEVENTH_in_spelled_sequence_1_to_312267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EIGHTH_in_spelled_sequence_1_to_312282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NINTH_in_spelled_sequence_1_to_312298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TENTH_in_spelled_sequence_1_to_312315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELEVENTH_in_spelled_sequence_1_to_312332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWELFTH_in_spelled_sequence_1_to_312346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIRTEENTH_in_spelled_sequence_1_to_312361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOURTEENTH_in_spelled_sequence_1_to_312373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FIFTEENTH_in_spelled_sequence_1_to_312385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SIXTEENTH_in_spelled_sequence_1_to_312398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEVENTEENTH_in_spelled_sequence_1_to_312411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EIGHTEENTH_in_spelled_sequence_1_to_312422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NINETEENTH_in_spelled_sequence_1_to_312434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTIETH_in_spelled_sequence_1_to_312446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_FIRST_in_spelled_sequence_1_to_312460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_sequence_1_to_312467 = new BitSet(new long[]{0x8000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_DASH_in_spelled_sequence_1_to_312469 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_FIRST_in_spelled_sequence_1_to_312472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_SECOND_in_spelled_sequence_1_to_312488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_sequence_1_to_312494 = new BitSet(new long[]{0x8000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_DASH_in_spelled_sequence_1_to_312496 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_SECOND_in_spelled_sequence_1_to_312499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_THIRD_in_spelled_sequence_1_to_312514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_sequence_1_to_312521 = new BitSet(new long[]{0x8000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_DASH_in_spelled_sequence_1_to_312523 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_THIRD_in_spelled_sequence_1_to_312526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_FOURTH_in_spelled_sequence_1_to_312542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_sequence_1_to_312548 = new BitSet(new long[]{0x8000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_DASH_in_spelled_sequence_1_to_312550 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_FOURTH_in_spelled_sequence_1_to_312553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_FIFTH_in_spelled_sequence_1_to_312568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_sequence_1_to_312575 = new BitSet(new long[]{0x8000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_DASH_in_spelled_sequence_1_to_312577 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_FIFTH_in_spelled_sequence_1_to_312580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_SIXTH_in_spelled_sequence_1_to_312596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_sequence_1_to_312603 = new BitSet(new long[]{0x8000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_DASH_in_spelled_sequence_1_to_312605 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_SIXTH_in_spelled_sequence_1_to_312608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_SEVENTH_in_spelled_sequence_1_to_312624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_sequence_1_to_312629 = new BitSet(new long[]{0x8000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_DASH_in_spelled_sequence_1_to_312631 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_SEVENTH_in_spelled_sequence_1_to_312634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_EIGHTH_in_spelled_sequence_1_to_312648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_sequence_1_to_312654 = new BitSet(new long[]{0x8000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_DASH_in_spelled_sequence_1_to_312656 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_EIGHTH_in_spelled_sequence_1_to_312659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_NINTH_in_spelled_sequence_1_to_312674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_sequence_1_to_312681 = new BitSet(new long[]{0x8000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_DASH_in_spelled_sequence_1_to_312683 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_NINTH_in_spelled_sequence_1_to_312686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIRTIETH_in_spelled_sequence_1_to_312701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIRTY_FIRST_in_spelled_sequence_1_to_312745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIRTY_in_spelled_sequence_1_to_312752 = new BitSet(new long[]{0x8000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_DASH_in_spelled_sequence_1_to_312754 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_FIRST_in_spelled_sequence_1_to_312757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_int_0_to_99_optional_prefix_in_int_up_to_4_digits2782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THREE_DIGIT_in_int_up_to_4_digits2788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOUR_DIGIT_in_int_up_to_4_digits2799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THREE_DIGIT_in_int_3_or_4_digits2821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOUR_DIGIT_in_int_3_or_4_digits2832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOUR_DIGIT_in_int_4_digits2854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWO_ZEROS_in_int_1_to_122874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PREFIXED_ONE_TO_NINE_in_int_1_to_122896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ONE_TO_NINE_in_int_1_to_122907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEN_TO_TWELVE_in_int_1_to_122927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWO_ZEROS_in_int_0_to_232955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ONE_ZERO_in_int_0_to_232981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PREFIXED_ONE_TO_NINE_in_int_0_to_233008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ONE_TO_NINE_in_int_0_to_233023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEN_TO_TWELVE_in_int_0_to_233047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIRTEEN_TO_TWENTY_THREE_in_int_0_to_233069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWO_ZEROS_in_int_0_to_593090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ONE_ZERO_in_int_0_to_593117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PREFIXED_ONE_TO_NINE_in_int_0_to_593145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ONE_TO_NINE_in_int_0_to_593161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEN_TO_TWELVE_in_int_0_to_593186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIRTEEN_TO_TWENTY_THREE_in_int_0_to_593209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_FOUR_TO_THIRTY_ONE_in_int_0_to_593221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIRTY_TWO_TO_FIFTY_NINE_in_int_0_to_593232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ONE_ZERO_in_int_0_to_99_no_prefix3254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ONE_TO_NINE_in_int_0_to_99_no_prefix3282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEN_TO_TWELVE_in_int_0_to_99_no_prefix3307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIRTEEN_TO_TWENTY_THREE_in_int_0_to_99_no_prefix3330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_FOUR_TO_THIRTY_ONE_in_int_0_to_99_no_prefix3342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIRTY_TWO_TO_FIFTY_NINE_in_int_0_to_99_no_prefix3353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SIXTY_TO_NINETY_NINE_in_int_0_to_99_no_prefix3365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWO_ZEROS_in_int_0_to_99_with_prefix3390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PREFIXED_ONE_TO_NINE_in_int_0_to_99_with_prefix3417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEN_TO_TWELVE_in_int_0_to_99_with_prefix3433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIRTEEN_TO_TWENTY_THREE_in_int_0_to_99_with_prefix3456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_FOUR_TO_THIRTY_ONE_in_int_0_to_99_with_prefix3468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIRTY_TWO_TO_FIFTY_NINE_in_int_0_to_99_with_prefix3479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SIXTY_TO_NINETY_NINE_in_int_0_to_99_with_prefix3491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_int_0_to_99_with_prefix_in_int_0_to_99_optional_prefix3516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ONE_TO_NINE_in_int_0_to_99_optional_prefix3522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ONE_ZERO_in_int_0_to_99_optional_prefix3533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PREFIXED_ONE_TO_NINE_in_int_1_to_313555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ONE_TO_NINE_in_int_1_to_313571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_int_10_to_31_in_int_1_to_313596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ONE_TO_NINE_in_int_1_to_31_no_prefix3611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_int_10_to_31_in_int_1_to_31_no_prefix3622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEN_TO_TWELVE_in_int_10_to_313637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIRTEEN_TO_TWENTY_THREE_in_int_10_to_313660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_FOUR_TO_THIRTY_ONE_in_int_10_to_313672 = new BitSet(new long[]{0x0000000000000002L});

}