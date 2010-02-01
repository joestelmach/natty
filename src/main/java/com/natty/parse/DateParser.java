// $ANTLR 3.2 Sep 23, 2009 12:02:23 /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g 2010-02-01 16:35:21
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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "INT", "HOURS", "MINUTES", "AM_PM", "SPAN", "MONTH_OF", "DAY_OF_WEEK", "DAY_OF_MONTH", "YEAR_OF", "SEEK_DIR", "SEEK_TYPE", "EXPLICIT_TIME", "EXPLICIT_DATE", "RELATIVE_DATE", "DATE_TIME", "AT", "COMMA", "ON", "COLON", "TODAY", "TOMORROW", "YESTERDAY", "THE", "DAY", "AFTER", "BEFORE", "THIS", "LAST", "PAST", "NEXT", "COMING", "UPCOMING", "IN", "FROM_NOW", "AGO", "WEEK", "MONTH", "YEAR", "JANUARY", "FEBRUARY", "MARCH", "APRIL", "MAY", "JUNE", "JULY", "AUGUST", "SEPTEMBER", "OCTOBER", "NOVEMBER", "DECEMBER", "SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY", "DASH", "SLASH", "AM", "PM", "MIDNIGHT", "NOON", "ONE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", "NINE", "TEN", "ELEVEN", "TWELVE", "THIRTEEN", "FOURTEEN", "FIFTEEN", "SIXTEEN", "SEVENTEEN", "EIGHTEEN", "NINETEEN", "TWENTY", "THIRTY", "FIRST", "SECOND", "THIRD", "FOURTH", "FIFTH", "SIXTH", "SEVENTH", "EIGHTH", "NINTH", "TENTH", "ELEVENTH", "TWELFTH", "THIRTEENTH", "FOURTEENTH", "FIFTEENTH", "SIXTEENTH", "SEVENTEENTH", "EIGHTEENTH", "NINETEENTH", "TWENTIETH", "TWENTY_FIRST", "TWENTY_SECOND", "TWENTY_THIRD", "TWENTY_FOURTH", "TWENTY_FIFTH", "TWENTY_SIXTH", "TWENTY_SEVENTH", "TWENTY_EIGHTH", "TWENTY_NINTH", "THIRTIETH", "THIRTY_FIRST", "THREE_DIGIT", "FOUR_DIGIT", "TWO_ZEROS", "PREFIXED_ONE_TO_NINE", "TEN_TO_TWELVE", "ONE_TO_NINE", "THIRTEEN_TO_TWENTY_THREE", "TWENTY_FOUR_TO_THIRTY_ONE", "THIRTY_TWO_TO_FIFTY_NINE", "ONE_ZERO", "SIXTY_TO_NINETY_NINE", "DIGIT", "WHITE_SPACE", "'of'", "'\\''"
    };
    public static final int NINETEEN=85;
    public static final int WEEK=39;
    public static final int SEPTEMBER=50;
    public static final int THIRTEEN_TO_TWENTY_THREE=125;
    public static final int WEDNESDAY=57;
    public static final int TWENTY_EIGHTH=115;
    public static final int TWENTY=86;
    public static final int FROM_NOW=37;
    public static final int APRIL=45;
    public static final int JULY=48;
    public static final int COMING=34;
    public static final int NINETEENTH=106;
    public static final int OCTOBER=51;
    public static final int DAY=27;
    public static final int ONE=67;
    public static final int MIDNIGHT=65;
    public static final int EOF=-1;
    public static final int MARCH=44;
    public static final int MONTH=40;
    public static final int PAST=32;
    public static final int SEVENTEEN=83;
    public static final int DATE_TIME=18;
    public static final int AM_PM=7;
    public static final int SIXTY_TO_NINETY_NINE=129;
    public static final int TWENTY_SEVENTH=114;
    public static final int TWENTY_FIFTH=112;
    public static final int EIGHTEENTH=105;
    public static final int SPAN=8;
    public static final int SEEK_DIR=13;
    public static final int THIS=30;
    public static final int THIRTIETH=117;
    public static final int NOON=66;
    public static final int LAST=31;
    public static final int EIGHTEEN=84;
    public static final int TWENTY_FOUR_TO_THIRTY_ONE=126;
    public static final int TOMORROW=24;
    public static final int RELATIVE_DATE=17;
    public static final int ONE_TO_NINE=124;
    public static final int FOUR_DIGIT=120;
    public static final int FIFTEENTH=102;
    public static final int FOURTH=91;
    public static final int TODAY=23;
    public static final int SECOND=89;
    public static final int NOVEMBER=52;
    public static final int SATURDAY=60;
    public static final int FOUR=70;
    public static final int SEVENTH=94;
    public static final int TEN=76;
    public static final int ON=21;
    public static final int FEBRUARY=43;
    public static final int MONDAY=55;
    public static final int DAY_OF_WEEK=10;
    public static final int SUNDAY=54;
    public static final int SEVEN=73;
    public static final int ELEVEN=77;
    public static final int THIRTEEN=79;
    public static final int INT=4;
    public static final int EXPLICIT_DATE=16;
    public static final int JUNE=47;
    public static final int UPCOMING=35;
    public static final int SIX=72;
    public static final int FIFTH=92;
    public static final int TWENTY_NINTH=116;
    public static final int THURSDAY=58;
    public static final int DECEMBER=53;
    public static final int AUGUST=49;
    public static final int PM=64;
    public static final int EXPLICIT_TIME=15;
    public static final int TUESDAY=56;
    public static final int T__132=132;
    public static final int THIRTY_TWO_TO_FIFTY_NINE=127;
    public static final int T__133=133;
    public static final int EIGHTH=95;
    public static final int THIRD=90;
    public static final int YEAR=41;
    public static final int THE=26;
    public static final int TENTH=97;
    public static final int MAY=46;
    public static final int TWENTY_FOURTH=111;
    public static final int THREE_DIGIT=119;
    public static final int MONTH_OF=9;
    public static final int WHITE_SPACE=131;
    public static final int SEEK_TYPE=14;
    public static final int PREFIXED_ONE_TO_NINE=122;
    public static final int FRIDAY=59;
    public static final int EIGHT=74;
    public static final int TWENTY_SIXTH=113;
    public static final int AT=19;
    public static final int SLASH=62;
    public static final int IN=36;
    public static final int NINTH=96;
    public static final int COMMA=20;
    public static final int FIVE=71;
    public static final int THIRTY=87;
    public static final int TWENTIETH=107;
    public static final int TWENTY_SECOND=109;
    public static final int NEXT=33;
    public static final int TWO_ZEROS=121;
    public static final int DIGIT=130;
    public static final int AM=63;
    public static final int DASH=61;
    public static final int FOURTEENTH=101;
    public static final int SIXTEEN=82;
    public static final int YEAR_OF=12;
    public static final int ONE_ZERO=128;
    public static final int TEN_TO_TWELVE=123;
    public static final int TWELVE=78;
    public static final int AGO=38;
    public static final int ELEVENTH=98;
    public static final int BEFORE=29;
    public static final int AFTER=28;
    public static final int TWO=68;
    public static final int SIXTEENTH=103;
    public static final int JANUARY=42;
    public static final int THIRTEENTH=100;
    public static final int COLON=22;
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
    public static final int YESTERDAY=25;
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
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:28:1: datetime options {backtrack=true; } : ( date ( AT | COMMA )? ( time )? -> ^( DATE_TIME date ( time )? ) | time ( ON )? date -> ^( DATE_TIME date time ) | time -> ^( DATE_TIME ^( RELATIVE_DATE SEEK_DIR[\">\"] INT[\"0\"] ) time ) );
    public final DateParser.datetime_return datetime() throws RecognitionException {
        DateParser.datetime_return retval = new DateParser.datetime_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token AT2=null;
        Token COMMA3=null;
        Token ON6=null;
        DateParser.date_return date1 = null;

        DateParser.time_return time4 = null;

        DateParser.time_return time5 = null;

        DateParser.date_return date7 = null;

        DateParser.time_return time8 = null;


        Object AT2_tree=null;
        Object COMMA3_tree=null;
        Object ON6_tree=null;
        RewriteRuleTokenStream stream_AT=new RewriteRuleTokenStream(adaptor,"token AT");
        RewriteRuleTokenStream stream_ON=new RewriteRuleTokenStream(adaptor,"token ON");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_time=new RewriteRuleSubtreeStream(adaptor,"rule time");
        RewriteRuleSubtreeStream stream_date=new RewriteRuleSubtreeStream(adaptor,"rule date");
        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:30:3: ( date ( AT | COMMA )? ( time )? -> ^( DATE_TIME date ( time )? ) | time ( ON )? date -> ^( DATE_TIME date time ) | time -> ^( DATE_TIME ^( RELATIVE_DATE SEEK_DIR[\">\"] INT[\"0\"] ) time ) )
            int alt4=3;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:30:5: date ( AT | COMMA )? ( time )?
                    {
                    pushFollow(FOLLOW_date_in_datetime135);
                    date1=date();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_date.add(date1.getTree());
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:30:10: ( AT | COMMA )?
                    int alt1=3;
                    int LA1_0 = input.LA(1);

                    if ( (LA1_0==AT) ) {
                        alt1=1;
                    }
                    else if ( (LA1_0==COMMA) ) {
                        alt1=2;
                    }
                    switch (alt1) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:30:11: AT
                            {
                            AT2=(Token)match(input,AT,FOLLOW_AT_in_datetime138); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_AT.add(AT2);


                            }
                            break;
                        case 2 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:30:16: COMMA
                            {
                            COMMA3=(Token)match(input,COMMA,FOLLOW_COMMA_in_datetime142); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_COMMA.add(COMMA3);


                            }
                            break;

                    }

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:30:24: ( time )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( ((LA2_0>=MIDNIGHT && LA2_0<=NOON)||(LA2_0>=TWO_ZEROS && LA2_0<=THIRTEEN_TO_TWENTY_THREE)) ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:30:24: time
                            {
                            pushFollow(FOLLOW_time_in_datetime146);
                            time4=time();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_time.add(time4.getTree());

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
                    // 30:30: -> ^( DATE_TIME date ( time )? )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:30:33: ^( DATE_TIME date ( time )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DATE_TIME, "DATE_TIME"), root_1);

                        adaptor.addChild(root_1, stream_date.nextTree());
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:30:50: ( time )?
                        if ( stream_time.hasNext() ) {
                            adaptor.addChild(root_1, stream_time.nextTree());

                        }
                        stream_time.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:31:5: time ( ON )? date
                    {
                    pushFollow(FOLLOW_time_in_datetime164);
                    time5=time();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_time.add(time5.getTree());
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:31:10: ( ON )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==ON) ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:31:10: ON
                            {
                            ON6=(Token)match(input,ON,FOLLOW_ON_in_datetime166); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_ON.add(ON6);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_date_in_datetime169);
                    date7=date();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_date.add(date7.getTree());


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
                    // 31:30: -> ^( DATE_TIME date time )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:31:33: ^( DATE_TIME date time )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DATE_TIME, "DATE_TIME"), root_1);

                        adaptor.addChild(root_1, stream_date.nextTree());
                        adaptor.addChild(root_1, stream_time.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:32:5: time
                    {
                    pushFollow(FOLLOW_time_in_datetime196);
                    time8=time();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_time.add(time8.getTree());


                    // AST REWRITE
                    // elements: time
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 32:30: -> ^( DATE_TIME ^( RELATIVE_DATE SEEK_DIR[\">\"] INT[\"0\"] ) time )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:32:33: ^( DATE_TIME ^( RELATIVE_DATE SEEK_DIR[\">\"] INT[\"0\"] ) time )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DATE_TIME, "DATE_TIME"), root_1);

                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:32:45: ^( RELATIVE_DATE SEEK_DIR[\">\"] INT[\"0\"] )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(RELATIVE_DATE, "RELATIVE_DATE"), root_2);

                        adaptor.addChild(root_2, (Object)adaptor.create(SEEK_DIR, ">"));
                        adaptor.addChild(root_2, (Object)adaptor.create(INT, "0"));

                        adaptor.addChild(root_1, root_2);
                        }
                        adaptor.addChild(root_1, stream_time.nextTree());

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
    // $ANTLR end "datetime"

    public static class date_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "date"
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:35:1: date options {backtrack=true; } : ( date_prefix explicit_date -> ^( RELATIVE_DATE date_prefix explicit_date ) | explicit_date | date_prefix relative_date -> ^( RELATIVE_DATE date_prefix relative_date ) | relative_date );
    public final DateParser.date_return date() throws RecognitionException {
        DateParser.date_return retval = new DateParser.date_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        DateParser.date_prefix_return date_prefix9 = null;

        DateParser.explicit_date_return explicit_date10 = null;

        DateParser.explicit_date_return explicit_date11 = null;

        DateParser.date_prefix_return date_prefix12 = null;

        DateParser.relative_date_return relative_date13 = null;

        DateParser.relative_date_return relative_date14 = null;


        RewriteRuleSubtreeStream stream_date_prefix=new RewriteRuleSubtreeStream(adaptor,"rule date_prefix");
        RewriteRuleSubtreeStream stream_relative_date=new RewriteRuleSubtreeStream(adaptor,"rule relative_date");
        RewriteRuleSubtreeStream stream_explicit_date=new RewriteRuleSubtreeStream(adaptor,"rule explicit_date");
        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:37:3: ( date_prefix explicit_date -> ^( RELATIVE_DATE date_prefix explicit_date ) | explicit_date | date_prefix relative_date -> ^( RELATIVE_DATE date_prefix relative_date ) | relative_date )
            int alt5=4;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:37:5: date_prefix explicit_date
                    {
                    pushFollow(FOLLOW_date_prefix_in_date259);
                    date_prefix9=date_prefix();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_date_prefix.add(date_prefix9.getTree());
                    pushFollow(FOLLOW_explicit_date_in_date261);
                    explicit_date10=explicit_date();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_explicit_date.add(explicit_date10.getTree());


                    // AST REWRITE
                    // elements: date_prefix, explicit_date
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 37:31: -> ^( RELATIVE_DATE date_prefix explicit_date )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:37:34: ^( RELATIVE_DATE date_prefix explicit_date )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(RELATIVE_DATE, "RELATIVE_DATE"), root_1);

                        adaptor.addChild(root_1, stream_date_prefix.nextTree());
                        adaptor.addChild(root_1, stream_explicit_date.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:38:5: explicit_date
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_explicit_date_in_date277);
                    explicit_date11=explicit_date();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, explicit_date11.getTree());

                    }
                    break;
                case 3 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:39:5: date_prefix relative_date
                    {
                    pushFollow(FOLLOW_date_prefix_in_date283);
                    date_prefix12=date_prefix();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_date_prefix.add(date_prefix12.getTree());
                    pushFollow(FOLLOW_relative_date_in_date285);
                    relative_date13=relative_date();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_relative_date.add(relative_date13.getTree());


                    // AST REWRITE
                    // elements: date_prefix, relative_date
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 39:31: -> ^( RELATIVE_DATE date_prefix relative_date )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:39:34: ^( RELATIVE_DATE date_prefix relative_date )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(RELATIVE_DATE, "RELATIVE_DATE"), root_1);

                        adaptor.addChild(root_1, stream_date_prefix.nextTree());
                        adaptor.addChild(root_1, stream_relative_date.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:40:5: relative_date
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_relative_date_in_date301);
                    relative_date14=relative_date();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, relative_date14.getTree());

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

    public static class time_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "time"
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:43:1: time : ( hours ( COLON minutes )? ( meridian_indicator )? -> ^( EXPLICIT_TIME hours ( minutes )? ( meridian_indicator )? ) | time_identifier );
    public final DateParser.time_return time() throws RecognitionException {
        DateParser.time_return retval = new DateParser.time_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token COLON16=null;
        DateParser.hours_return hours15 = null;

        DateParser.minutes_return minutes17 = null;

        DateParser.meridian_indicator_return meridian_indicator18 = null;

        DateParser.time_identifier_return time_identifier19 = null;


        Object COLON16_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleSubtreeStream stream_meridian_indicator=new RewriteRuleSubtreeStream(adaptor,"rule meridian_indicator");
        RewriteRuleSubtreeStream stream_minutes=new RewriteRuleSubtreeStream(adaptor,"rule minutes");
        RewriteRuleSubtreeStream stream_hours=new RewriteRuleSubtreeStream(adaptor,"rule hours");
        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:44:3: ( hours ( COLON minutes )? ( meridian_indicator )? -> ^( EXPLICIT_TIME hours ( minutes )? ( meridian_indicator )? ) | time_identifier )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=TWO_ZEROS && LA8_0<=THIRTEEN_TO_TWENTY_THREE)) ) {
                alt8=1;
            }
            else if ( ((LA8_0>=MIDNIGHT && LA8_0<=NOON)) ) {
                alt8=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:44:5: hours ( COLON minutes )? ( meridian_indicator )?
                    {
                    pushFollow(FOLLOW_hours_in_time317);
                    hours15=hours();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_hours.add(hours15.getTree());
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:44:11: ( COLON minutes )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==COLON) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:44:12: COLON minutes
                            {
                            COLON16=(Token)match(input,COLON,FOLLOW_COLON_in_time320); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_COLON.add(COLON16);

                            pushFollow(FOLLOW_minutes_in_time322);
                            minutes17=minutes();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_minutes.add(minutes17.getTree());

                            }
                            break;

                    }

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:44:28: ( meridian_indicator )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( ((LA7_0>=AM && LA7_0<=PM)) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:44:28: meridian_indicator
                            {
                            pushFollow(FOLLOW_meridian_indicator_in_time326);
                            meridian_indicator18=meridian_indicator();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_meridian_indicator.add(meridian_indicator18.getTree());

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
                    // 45:5: -> ^( EXPLICIT_TIME hours ( minutes )? ( meridian_indicator )? )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:45:8: ^( EXPLICIT_TIME hours ( minutes )? ( meridian_indicator )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPLICIT_TIME, "EXPLICIT_TIME"), root_1);

                        adaptor.addChild(root_1, stream_hours.nextTree());
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:45:30: ( minutes )?
                        if ( stream_minutes.hasNext() ) {
                            adaptor.addChild(root_1, stream_minutes.nextTree());

                        }
                        stream_minutes.reset();
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:45:39: ( meridian_indicator )?
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:47:5: time_identifier
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_time_identifier_in_time354);
                    time_identifier19=time_identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, time_identifier19.getTree());

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

    public static class relative_date_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "relative_date"
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:50:1: relative_date : ( named_relative_date | modifiable_target -> ^( RELATIVE_DATE SEEK_DIR[\">\"] SEEK_TYPE[\"by_day\"] INT[\"1\"] modifiable_target ) | target_prefix modifiable_target -> ^( RELATIVE_DATE target_prefix modifiable_target ) | spelled_or_int_1_to_31 modifiable_target target_suffix -> ^( RELATIVE_DATE target_suffix spelled_or_int_1_to_31 modifiable_target ) );
    public final DateParser.relative_date_return relative_date() throws RecognitionException {
        DateParser.relative_date_return retval = new DateParser.relative_date_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        DateParser.named_relative_date_return named_relative_date20 = null;

        DateParser.modifiable_target_return modifiable_target21 = null;

        DateParser.target_prefix_return target_prefix22 = null;

        DateParser.modifiable_target_return modifiable_target23 = null;

        DateParser.spelled_or_int_1_to_31_return spelled_or_int_1_to_3124 = null;

        DateParser.modifiable_target_return modifiable_target25 = null;

        DateParser.target_suffix_return target_suffix26 = null;


        RewriteRuleSubtreeStream stream_spelled_or_int_1_to_31=new RewriteRuleSubtreeStream(adaptor,"rule spelled_or_int_1_to_31");
        RewriteRuleSubtreeStream stream_target_suffix=new RewriteRuleSubtreeStream(adaptor,"rule target_suffix");
        RewriteRuleSubtreeStream stream_modifiable_target=new RewriteRuleSubtreeStream(adaptor,"rule modifiable_target");
        RewriteRuleSubtreeStream stream_target_prefix=new RewriteRuleSubtreeStream(adaptor,"rule target_prefix");
        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:52:3: ( named_relative_date | modifiable_target -> ^( RELATIVE_DATE SEEK_DIR[\">\"] SEEK_TYPE[\"by_day\"] INT[\"1\"] modifiable_target ) | target_prefix modifiable_target -> ^( RELATIVE_DATE target_prefix modifiable_target ) | spelled_or_int_1_to_31 modifiable_target target_suffix -> ^( RELATIVE_DATE target_suffix spelled_or_int_1_to_31 modifiable_target ) )
            int alt9=4;
            alt9 = dfa9.predict(input);
            switch (alt9) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:52:5: named_relative_date
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_named_relative_date_in_relative_date370);
                    named_relative_date20=named_relative_date();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, named_relative_date20.getTree());

                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:55:5: modifiable_target
                    {
                    pushFollow(FOLLOW_modifiable_target_in_relative_date382);
                    modifiable_target21=modifiable_target();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_modifiable_target.add(modifiable_target21.getTree());


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
                    // 56:5: -> ^( RELATIVE_DATE SEEK_DIR[\">\"] SEEK_TYPE[\"by_day\"] INT[\"1\"] modifiable_target )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:56:8: ^( RELATIVE_DATE SEEK_DIR[\">\"] SEEK_TYPE[\"by_day\"] INT[\"1\"] modifiable_target )
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:59:5: target_prefix modifiable_target
                    {
                    pushFollow(FOLLOW_target_prefix_in_relative_date416);
                    target_prefix22=target_prefix();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_target_prefix.add(target_prefix22.getTree());
                    pushFollow(FOLLOW_modifiable_target_in_relative_date418);
                    modifiable_target23=modifiable_target();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_modifiable_target.add(modifiable_target23.getTree());


                    // AST REWRITE
                    // elements: modifiable_target, target_prefix
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 60:5: -> ^( RELATIVE_DATE target_prefix modifiable_target )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:60:8: ^( RELATIVE_DATE target_prefix modifiable_target )
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:63:5: spelled_or_int_1_to_31 modifiable_target target_suffix
                    {
                    pushFollow(FOLLOW_spelled_or_int_1_to_31_in_relative_date447);
                    spelled_or_int_1_to_3124=spelled_or_int_1_to_31();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_spelled_or_int_1_to_31.add(spelled_or_int_1_to_3124.getTree());
                    pushFollow(FOLLOW_modifiable_target_in_relative_date449);
                    modifiable_target25=modifiable_target();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_modifiable_target.add(modifiable_target25.getTree());
                    pushFollow(FOLLOW_target_suffix_in_relative_date451);
                    target_suffix26=target_suffix();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_target_suffix.add(target_suffix26.getTree());


                    // AST REWRITE
                    // elements: spelled_or_int_1_to_31, target_suffix, modifiable_target
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 64:5: -> ^( RELATIVE_DATE target_suffix spelled_or_int_1_to_31 modifiable_target )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:64:8: ^( RELATIVE_DATE target_suffix spelled_or_int_1_to_31 modifiable_target )
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
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:67:1: named_relative_date : ( TODAY -> ^( RELATIVE_DATE SEEK_DIR[\">\"] INT[\"0\"] ) | TOMORROW -> ^( RELATIVE_DATE SEEK_DIR[\">\"] INT[\"1\"] ) | YESTERDAY -> ^( RELATIVE_DATE SEEK_DIR[\"<\"] INT[\"1\"] ) );
    public final DateParser.named_relative_date_return named_relative_date() throws RecognitionException {
        DateParser.named_relative_date_return retval = new DateParser.named_relative_date_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TODAY27=null;
        Token TOMORROW28=null;
        Token YESTERDAY29=null;

        Object TODAY27_tree=null;
        Object TOMORROW28_tree=null;
        Object YESTERDAY29_tree=null;
        RewriteRuleTokenStream stream_TODAY=new RewriteRuleTokenStream(adaptor,"token TODAY");
        RewriteRuleTokenStream stream_YESTERDAY=new RewriteRuleTokenStream(adaptor,"token YESTERDAY");
        RewriteRuleTokenStream stream_TOMORROW=new RewriteRuleTokenStream(adaptor,"token TOMORROW");

        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:68:3: ( TODAY -> ^( RELATIVE_DATE SEEK_DIR[\">\"] INT[\"0\"] ) | TOMORROW -> ^( RELATIVE_DATE SEEK_DIR[\">\"] INT[\"1\"] ) | YESTERDAY -> ^( RELATIVE_DATE SEEK_DIR[\"<\"] INT[\"1\"] ) )
            int alt10=3;
            switch ( input.LA(1) ) {
            case TODAY:
                {
                alt10=1;
                }
                break;
            case TOMORROW:
                {
                alt10=2;
                }
                break;
            case YESTERDAY:
                {
                alt10=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:68:5: TODAY
                    {
                    TODAY27=(Token)match(input,TODAY,FOLLOW_TODAY_in_named_relative_date483); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TODAY.add(TODAY27);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 68:15: -> ^( RELATIVE_DATE SEEK_DIR[\">\"] INT[\"0\"] )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:68:18: ^( RELATIVE_DATE SEEK_DIR[\">\"] INT[\"0\"] )
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:69:5: TOMORROW
                    {
                    TOMORROW28=(Token)match(input,TOMORROW,FOLLOW_TOMORROW_in_named_relative_date505); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TOMORROW.add(TOMORROW28);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 69:15: -> ^( RELATIVE_DATE SEEK_DIR[\">\"] INT[\"1\"] )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:69:18: ^( RELATIVE_DATE SEEK_DIR[\">\"] INT[\"1\"] )
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:70:5: YESTERDAY
                    {
                    YESTERDAY29=(Token)match(input,YESTERDAY,FOLLOW_YESTERDAY_in_named_relative_date524); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_YESTERDAY.add(YESTERDAY29);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 70:15: -> ^( RELATIVE_DATE SEEK_DIR[\"<\"] INT[\"1\"] )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:70:18: ^( RELATIVE_DATE SEEK_DIR[\"<\"] INT[\"1\"] )
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

    public static class explicit_date_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "explicit_date"
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:74:1: explicit_date options {backtrack=true; } : ( int_4_digits date_separator int_1_to_12 date_separator int_1_to_31 -> ^( EXPLICIT_DATE ^( MONTH_OF int_1_to_12 ) ^( DAY_OF_MONTH int_1_to_31 ) ^( YEAR_OF int_4_digits ) ) | int_1_to_12 date_separator int_1_to_31 ( date_separator int_up_to_4_digits )? -> ^( EXPLICIT_DATE ^( MONTH_OF int_1_to_31 ) ^( DAY_OF_MONTH int_1_to_31 ) ^( YEAR_OF ( int_up_to_4_digits )? ) ) | month day_of_month ( year )? -> ^( EXPLICIT_DATE month day_of_month ( year )? ) | day_of_month ( 'of' )? month ( year )? -> ^( EXPLICIT_DATE month day_of_month ( year )? ) );
    public final DateParser.explicit_date_return explicit_date() throws RecognitionException {
        DateParser.explicit_date_return retval = new DateParser.explicit_date_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal44=null;
        DateParser.int_4_digits_return int_4_digits30 = null;

        DateParser.date_separator_return date_separator31 = null;

        DateParser.int_1_to_12_return int_1_to_1232 = null;

        DateParser.date_separator_return date_separator33 = null;

        DateParser.int_1_to_31_return int_1_to_3134 = null;

        DateParser.int_1_to_12_return int_1_to_1235 = null;

        DateParser.date_separator_return date_separator36 = null;

        DateParser.int_1_to_31_return int_1_to_3137 = null;

        DateParser.date_separator_return date_separator38 = null;

        DateParser.int_up_to_4_digits_return int_up_to_4_digits39 = null;

        DateParser.month_return month40 = null;

        DateParser.day_of_month_return day_of_month41 = null;

        DateParser.year_return year42 = null;

        DateParser.day_of_month_return day_of_month43 = null;

        DateParser.month_return month45 = null;

        DateParser.year_return year46 = null;


        Object string_literal44_tree=null;
        RewriteRuleTokenStream stream_132=new RewriteRuleTokenStream(adaptor,"token 132");
        RewriteRuleSubtreeStream stream_month=new RewriteRuleSubtreeStream(adaptor,"rule month");
        RewriteRuleSubtreeStream stream_int_1_to_31=new RewriteRuleSubtreeStream(adaptor,"rule int_1_to_31");
        RewriteRuleSubtreeStream stream_year=new RewriteRuleSubtreeStream(adaptor,"rule year");
        RewriteRuleSubtreeStream stream_day_of_month=new RewriteRuleSubtreeStream(adaptor,"rule day_of_month");
        RewriteRuleSubtreeStream stream_int_up_to_4_digits=new RewriteRuleSubtreeStream(adaptor,"rule int_up_to_4_digits");
        RewriteRuleSubtreeStream stream_int_4_digits=new RewriteRuleSubtreeStream(adaptor,"rule int_4_digits");
        RewriteRuleSubtreeStream stream_date_separator=new RewriteRuleSubtreeStream(adaptor,"rule date_separator");
        RewriteRuleSubtreeStream stream_int_1_to_12=new RewriteRuleSubtreeStream(adaptor,"rule int_1_to_12");
        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:77:3: ( int_4_digits date_separator int_1_to_12 date_separator int_1_to_31 -> ^( EXPLICIT_DATE ^( MONTH_OF int_1_to_12 ) ^( DAY_OF_MONTH int_1_to_31 ) ^( YEAR_OF int_4_digits ) ) | int_1_to_12 date_separator int_1_to_31 ( date_separator int_up_to_4_digits )? -> ^( EXPLICIT_DATE ^( MONTH_OF int_1_to_31 ) ^( DAY_OF_MONTH int_1_to_31 ) ^( YEAR_OF ( int_up_to_4_digits )? ) ) | month day_of_month ( year )? -> ^( EXPLICIT_DATE month day_of_month ( year )? ) | day_of_month ( 'of' )? month ( year )? -> ^( EXPLICIT_DATE month day_of_month ( year )? ) )
            int alt15=4;
            switch ( input.LA(1) ) {
            case FOUR_DIGIT:
                {
                alt15=1;
                }
                break;
            case TWO_ZEROS:
                {
                alt15=2;
                }
                break;
            case PREFIXED_ONE_TO_NINE:
                {
                int LA15_3 = input.LA(2);

                if ( ((LA15_3>=DASH && LA15_3<=SLASH)) ) {
                    alt15=2;
                }
                else if ( ((LA15_3>=JANUARY && LA15_3<=DECEMBER)||LA15_3==132) ) {
                    alt15=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 3, input);

                    throw nvae;
                }
                }
                break;
            case TEN_TO_TWELVE:
                {
                int LA15_4 = input.LA(2);

                if ( ((LA15_4>=DASH && LA15_4<=SLASH)) ) {
                    alt15=2;
                }
                else if ( ((LA15_4>=JANUARY && LA15_4<=DECEMBER)||LA15_4==132) ) {
                    alt15=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 4, input);

                    throw nvae;
                }
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
                alt15=3;
                }
                break;
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
            case ONE_TO_NINE:
            case THIRTEEN_TO_TWENTY_THREE:
            case TWENTY_FOUR_TO_THIRTY_ONE:
                {
                alt15=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:77:5: int_4_digits date_separator int_1_to_12 date_separator int_1_to_31
                    {
                    pushFollow(FOLLOW_int_4_digits_in_explicit_date562);
                    int_4_digits30=int_4_digits();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_int_4_digits.add(int_4_digits30.getTree());
                    pushFollow(FOLLOW_date_separator_in_explicit_date564);
                    date_separator31=date_separator();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_date_separator.add(date_separator31.getTree());
                    pushFollow(FOLLOW_int_1_to_12_in_explicit_date566);
                    int_1_to_1232=int_1_to_12();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_int_1_to_12.add(int_1_to_1232.getTree());
                    pushFollow(FOLLOW_date_separator_in_explicit_date568);
                    date_separator33=date_separator();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_date_separator.add(date_separator33.getTree());
                    pushFollow(FOLLOW_int_1_to_31_in_explicit_date570);
                    int_1_to_3134=int_1_to_31();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_int_1_to_31.add(int_1_to_3134.getTree());


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
                    // 78:5: -> ^( EXPLICIT_DATE ^( MONTH_OF int_1_to_12 ) ^( DAY_OF_MONTH int_1_to_31 ) ^( YEAR_OF int_4_digits ) )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:78:8: ^( EXPLICIT_DATE ^( MONTH_OF int_1_to_12 ) ^( DAY_OF_MONTH int_1_to_31 ) ^( YEAR_OF int_4_digits ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPLICIT_DATE, "EXPLICIT_DATE"), root_1);

                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:78:24: ^( MONTH_OF int_1_to_12 )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(MONTH_OF, "MONTH_OF"), root_2);

                        adaptor.addChild(root_2, stream_int_1_to_12.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:78:48: ^( DAY_OF_MONTH int_1_to_31 )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(DAY_OF_MONTH, "DAY_OF_MONTH"), root_2);

                        adaptor.addChild(root_2, stream_int_1_to_31.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:78:76: ^( YEAR_OF int_4_digits )
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:81:5: int_1_to_12 date_separator int_1_to_31 ( date_separator int_up_to_4_digits )?
                    {
                    pushFollow(FOLLOW_int_1_to_12_in_explicit_date608);
                    int_1_to_1235=int_1_to_12();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_int_1_to_12.add(int_1_to_1235.getTree());
                    pushFollow(FOLLOW_date_separator_in_explicit_date610);
                    date_separator36=date_separator();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_date_separator.add(date_separator36.getTree());
                    pushFollow(FOLLOW_int_1_to_31_in_explicit_date612);
                    int_1_to_3137=int_1_to_31();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_int_1_to_31.add(int_1_to_3137.getTree());
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:81:44: ( date_separator int_up_to_4_digits )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( ((LA11_0>=DASH && LA11_0<=SLASH)) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:81:45: date_separator int_up_to_4_digits
                            {
                            pushFollow(FOLLOW_date_separator_in_explicit_date615);
                            date_separator38=date_separator();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_date_separator.add(date_separator38.getTree());
                            pushFollow(FOLLOW_int_up_to_4_digits_in_explicit_date617);
                            int_up_to_4_digits39=int_up_to_4_digits();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_int_up_to_4_digits.add(int_up_to_4_digits39.getTree());

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
                    // 82:5: -> ^( EXPLICIT_DATE ^( MONTH_OF int_1_to_31 ) ^( DAY_OF_MONTH int_1_to_31 ) ^( YEAR_OF ( int_up_to_4_digits )? ) )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:82:8: ^( EXPLICIT_DATE ^( MONTH_OF int_1_to_31 ) ^( DAY_OF_MONTH int_1_to_31 ) ^( YEAR_OF ( int_up_to_4_digits )? ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPLICIT_DATE, "EXPLICIT_DATE"), root_1);

                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:82:24: ^( MONTH_OF int_1_to_31 )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(MONTH_OF, "MONTH_OF"), root_2);

                        adaptor.addChild(root_2, stream_int_1_to_31.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:82:48: ^( DAY_OF_MONTH int_1_to_31 )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(DAY_OF_MONTH, "DAY_OF_MONTH"), root_2);

                        adaptor.addChild(root_2, stream_int_1_to_31.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:82:76: ^( YEAR_OF ( int_up_to_4_digits )? )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(YEAR_OF, "YEAR_OF"), root_2);

                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:82:86: ( int_up_to_4_digits )?
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
                case 3 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:85:5: month day_of_month ( year )?
                    {
                    pushFollow(FOLLOW_month_in_explicit_date662);
                    month40=month();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_month.add(month40.getTree());
                    pushFollow(FOLLOW_day_of_month_in_explicit_date664);
                    day_of_month41=day_of_month();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_day_of_month.add(day_of_month41.getTree());
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:85:24: ( year )?
                    int alt12=2;
                    switch ( input.LA(1) ) {
                        case COMMA:
                            {
                            switch ( input.LA(2) ) {
                                case IN:
                                    {
                                    alt12=1;
                                    }
                                    break;
                                case THREE_DIGIT:
                                case FOUR_DIGIT:
                                case THIRTEEN_TO_TWENTY_THREE:
                                case TWENTY_FOUR_TO_THIRTY_ONE:
                                case THIRTY_TWO_TO_FIFTY_NINE:
                                case SIXTY_TO_NINETY_NINE:
                                case 133:
                                    {
                                    alt12=1;
                                    }
                                    break;
                                case TWO_ZEROS:
                                    {
                                    alt12=1;
                                    }
                                    break;
                                case PREFIXED_ONE_TO_NINE:
                                    {
                                    alt12=1;
                                    }
                                    break;
                                case TEN_TO_TWELVE:
                                    {
                                    alt12=1;
                                    }
                                    break;
                            }

                            }
                            break;
                        case IN:
                        case 133:
                            {
                            alt12=1;
                            }
                            break;
                        case TWO_ZEROS:
                            {
                            alt12=1;
                            }
                            break;
                        case PREFIXED_ONE_TO_NINE:
                            {
                            alt12=1;
                            }
                            break;
                        case TEN_TO_TWELVE:
                            {
                            alt12=1;
                            }
                            break;
                        case THREE_DIGIT:
                        case FOUR_DIGIT:
                        case THIRTEEN_TO_TWENTY_THREE:
                        case TWENTY_FOUR_TO_THIRTY_ONE:
                        case THIRTY_TWO_TO_FIFTY_NINE:
                        case SIXTY_TO_NINETY_NINE:
                            {
                            alt12=1;
                            }
                            break;
                    }

                    switch (alt12) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:85:24: year
                            {
                            pushFollow(FOLLOW_year_in_explicit_date666);
                            year42=year();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_year.add(year42.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: month, year, day_of_month
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 86:5: -> ^( EXPLICIT_DATE month day_of_month ( year )? )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:86:8: ^( EXPLICIT_DATE month day_of_month ( year )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPLICIT_DATE, "EXPLICIT_DATE"), root_1);

                        adaptor.addChild(root_1, stream_month.nextTree());
                        adaptor.addChild(root_1, stream_day_of_month.nextTree());
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:86:43: ( year )?
                        if ( stream_year.hasNext() ) {
                            adaptor.addChild(root_1, stream_year.nextTree());

                        }
                        stream_year.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:89:5: day_of_month ( 'of' )? month ( year )?
                    {
                    pushFollow(FOLLOW_day_of_month_in_explicit_date697);
                    day_of_month43=day_of_month();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_day_of_month.add(day_of_month43.getTree());
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:89:18: ( 'of' )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==132) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:89:18: 'of'
                            {
                            string_literal44=(Token)match(input,132,FOLLOW_132_in_explicit_date699); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_132.add(string_literal44);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_month_in_explicit_date702);
                    month45=month();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_month.add(month45.getTree());
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:89:30: ( year )?
                    int alt14=2;
                    switch ( input.LA(1) ) {
                        case COMMA:
                            {
                            switch ( input.LA(2) ) {
                                case IN:
                                    {
                                    alt14=1;
                                    }
                                    break;
                                case THREE_DIGIT:
                                case FOUR_DIGIT:
                                case THIRTEEN_TO_TWENTY_THREE:
                                case TWENTY_FOUR_TO_THIRTY_ONE:
                                case THIRTY_TWO_TO_FIFTY_NINE:
                                case SIXTY_TO_NINETY_NINE:
                                case 133:
                                    {
                                    alt14=1;
                                    }
                                    break;
                                case TWO_ZEROS:
                                    {
                                    alt14=1;
                                    }
                                    break;
                                case PREFIXED_ONE_TO_NINE:
                                    {
                                    alt14=1;
                                    }
                                    break;
                                case TEN_TO_TWELVE:
                                    {
                                    alt14=1;
                                    }
                                    break;
                            }

                            }
                            break;
                        case IN:
                        case 133:
                            {
                            alt14=1;
                            }
                            break;
                        case TWO_ZEROS:
                            {
                            alt14=1;
                            }
                            break;
                        case PREFIXED_ONE_TO_NINE:
                            {
                            alt14=1;
                            }
                            break;
                        case TEN_TO_TWELVE:
                            {
                            alt14=1;
                            }
                            break;
                        case THREE_DIGIT:
                        case FOUR_DIGIT:
                        case THIRTEEN_TO_TWENTY_THREE:
                        case TWENTY_FOUR_TO_THIRTY_ONE:
                        case THIRTY_TWO_TO_FIFTY_NINE:
                        case SIXTY_TO_NINETY_NINE:
                            {
                            alt14=1;
                            }
                            break;
                    }

                    switch (alt14) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:89:30: year
                            {
                            pushFollow(FOLLOW_year_in_explicit_date704);
                            year46=year();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_year.add(year46.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: year, month, day_of_month
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 90:5: -> ^( EXPLICIT_DATE month day_of_month ( year )? )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:90:8: ^( EXPLICIT_DATE month day_of_month ( year )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPLICIT_DATE, "EXPLICIT_DATE"), root_1);

                        adaptor.addChild(root_1, stream_month.nextTree());
                        adaptor.addChild(root_1, stream_day_of_month.nextTree());
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:90:43: ( year )?
                        if ( stream_year.hasNext() ) {
                            adaptor.addChild(root_1, stream_year.nextTree());

                        }
                        stream_year.reset();

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
    // $ANTLR end "explicit_date"

    public static class date_prefix_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "date_prefix"
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:94:1: date_prefix : ( ( THE )? DAY AFTER -> SEEK_DIR[\">\"] INT[\"1\"] | spelled_or_int_1_to_31 DAY AFTER -> SEEK_DIR[\">\"] spelled_or_int_1_to_31 | ( THE )? DAY BEFORE -> SEEK_DIR[\"<\"] INT[\"1\"] | spelled_or_int_1_to_31 DAY BEFORE -> SEEK_DIR[\"<\"] spelled_or_int_1_to_31 );
    public final DateParser.date_prefix_return date_prefix() throws RecognitionException {
        DateParser.date_prefix_return retval = new DateParser.date_prefix_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token THE47=null;
        Token DAY48=null;
        Token AFTER49=null;
        Token DAY51=null;
        Token AFTER52=null;
        Token THE53=null;
        Token DAY54=null;
        Token BEFORE55=null;
        Token DAY57=null;
        Token BEFORE58=null;
        DateParser.spelled_or_int_1_to_31_return spelled_or_int_1_to_3150 = null;

        DateParser.spelled_or_int_1_to_31_return spelled_or_int_1_to_3156 = null;


        Object THE47_tree=null;
        Object DAY48_tree=null;
        Object AFTER49_tree=null;
        Object DAY51_tree=null;
        Object AFTER52_tree=null;
        Object THE53_tree=null;
        Object DAY54_tree=null;
        Object BEFORE55_tree=null;
        Object DAY57_tree=null;
        Object BEFORE58_tree=null;
        RewriteRuleTokenStream stream_BEFORE=new RewriteRuleTokenStream(adaptor,"token BEFORE");
        RewriteRuleTokenStream stream_DAY=new RewriteRuleTokenStream(adaptor,"token DAY");
        RewriteRuleTokenStream stream_AFTER=new RewriteRuleTokenStream(adaptor,"token AFTER");
        RewriteRuleTokenStream stream_THE=new RewriteRuleTokenStream(adaptor,"token THE");
        RewriteRuleSubtreeStream stream_spelled_or_int_1_to_31=new RewriteRuleSubtreeStream(adaptor,"rule spelled_or_int_1_to_31");
        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:95:3: ( ( THE )? DAY AFTER -> SEEK_DIR[\">\"] INT[\"1\"] | spelled_or_int_1_to_31 DAY AFTER -> SEEK_DIR[\">\"] spelled_or_int_1_to_31 | ( THE )? DAY BEFORE -> SEEK_DIR[\"<\"] INT[\"1\"] | spelled_or_int_1_to_31 DAY BEFORE -> SEEK_DIR[\"<\"] spelled_or_int_1_to_31 )
            int alt18=4;
            alt18 = dfa18.predict(input);
            switch (alt18) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:95:5: ( THE )? DAY AFTER
                    {
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:95:5: ( THE )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==THE) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:95:5: THE
                            {
                            THE47=(Token)match(input,THE,FOLLOW_THE_in_date_prefix739); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_THE.add(THE47);


                            }
                            break;

                    }

                    DAY48=(Token)match(input,DAY,FOLLOW_DAY_in_date_prefix742); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DAY.add(DAY48);

                    AFTER49=(Token)match(input,AFTER,FOLLOW_AFTER_in_date_prefix744); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AFTER.add(AFTER49);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 95:39: -> SEEK_DIR[\">\"] INT[\"1\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(SEEK_DIR, ">"));
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "1"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:96:5: spelled_or_int_1_to_31 DAY AFTER
                    {
                    pushFollow(FOLLOW_spelled_or_int_1_to_31_in_date_prefix777);
                    spelled_or_int_1_to_3150=spelled_or_int_1_to_31();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_spelled_or_int_1_to_31.add(spelled_or_int_1_to_3150.getTree());
                    DAY51=(Token)match(input,DAY,FOLLOW_DAY_in_date_prefix779); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DAY.add(DAY51);

                    AFTER52=(Token)match(input,AFTER,FOLLOW_AFTER_in_date_prefix781); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AFTER.add(AFTER52);



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
                    // 96:39: -> SEEK_DIR[\">\"] spelled_or_int_1_to_31
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(SEEK_DIR, ">"));
                        adaptor.addChild(root_0, stream_spelled_or_int_1_to_31.nextTree());

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:97:5: ( THE )? DAY BEFORE
                    {
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:97:5: ( THE )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==THE) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:97:5: THE
                            {
                            THE53=(Token)match(input,THE,FOLLOW_THE_in_date_prefix795); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_THE.add(THE53);


                            }
                            break;

                    }

                    DAY54=(Token)match(input,DAY,FOLLOW_DAY_in_date_prefix798); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DAY.add(DAY54);

                    BEFORE55=(Token)match(input,BEFORE,FOLLOW_BEFORE_in_date_prefix800); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_BEFORE.add(BEFORE55);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 97:39: -> SEEK_DIR[\"<\"] INT[\"1\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(SEEK_DIR, "<"));
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "1"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:98:5: spelled_or_int_1_to_31 DAY BEFORE
                    {
                    pushFollow(FOLLOW_spelled_or_int_1_to_31_in_date_prefix832);
                    spelled_or_int_1_to_3156=spelled_or_int_1_to_31();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_spelled_or_int_1_to_31.add(spelled_or_int_1_to_3156.getTree());
                    DAY57=(Token)match(input,DAY,FOLLOW_DAY_in_date_prefix834); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DAY.add(DAY57);

                    BEFORE58=(Token)match(input,BEFORE,FOLLOW_BEFORE_in_date_prefix836); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_BEFORE.add(BEFORE58);



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
                    // 98:39: -> SEEK_DIR[\"<\"] spelled_or_int_1_to_31
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

    public static class target_prefix_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "target_prefix"
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:102:1: target_prefix : ( THIS -> SEEK_DIR[\">\"] SEEK_TYPE[\"by_day\"] INT[\"1\"] | ( THIS )? LAST -> SEEK_DIR[\"<\"] SEEK_TYPE[\"by_week\"] INT[\"1\"] | ( THIS )? PAST -> SEEK_DIR[\"<\"] SEEK_TYPE[\"by_day\"] INT[\"1\"] | ( THIS )? NEXT -> SEEK_DIR[\">\"] SEEK_TYPE[\"by_week\"] INT[\"1\"] | ( THIS )? COMING -> SEEK_DIR[\">\"] SEEK_TYPE[\"by_day\"] INT[\"1\"] | ( THIS )? UPCOMING -> SEEK_DIR[\">\"] SEEK_TYPE[\"by_day\"] INT[\"1\"] | ( IN )? spelled_or_int_1_to_31 -> SEEK_DIR[\">\"] SEEK_TYPE[\"by_day\"] spelled_or_int_1_to_31 );
    public final DateParser.target_prefix_return target_prefix() throws RecognitionException {
        DateParser.target_prefix_return retval = new DateParser.target_prefix_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token THIS59=null;
        Token THIS60=null;
        Token LAST61=null;
        Token THIS62=null;
        Token PAST63=null;
        Token THIS64=null;
        Token NEXT65=null;
        Token THIS66=null;
        Token COMING67=null;
        Token THIS68=null;
        Token UPCOMING69=null;
        Token IN70=null;
        DateParser.spelled_or_int_1_to_31_return spelled_or_int_1_to_3171 = null;


        Object THIS59_tree=null;
        Object THIS60_tree=null;
        Object LAST61_tree=null;
        Object THIS62_tree=null;
        Object PAST63_tree=null;
        Object THIS64_tree=null;
        Object NEXT65_tree=null;
        Object THIS66_tree=null;
        Object COMING67_tree=null;
        Object THIS68_tree=null;
        Object UPCOMING69_tree=null;
        Object IN70_tree=null;
        RewriteRuleTokenStream stream_NEXT=new RewriteRuleTokenStream(adaptor,"token NEXT");
        RewriteRuleTokenStream stream_IN=new RewriteRuleTokenStream(adaptor,"token IN");
        RewriteRuleTokenStream stream_LAST=new RewriteRuleTokenStream(adaptor,"token LAST");
        RewriteRuleTokenStream stream_UPCOMING=new RewriteRuleTokenStream(adaptor,"token UPCOMING");
        RewriteRuleTokenStream stream_COMING=new RewriteRuleTokenStream(adaptor,"token COMING");
        RewriteRuleTokenStream stream_PAST=new RewriteRuleTokenStream(adaptor,"token PAST");
        RewriteRuleTokenStream stream_THIS=new RewriteRuleTokenStream(adaptor,"token THIS");
        RewriteRuleSubtreeStream stream_spelled_or_int_1_to_31=new RewriteRuleSubtreeStream(adaptor,"rule spelled_or_int_1_to_31");
        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:103:3: ( THIS -> SEEK_DIR[\">\"] SEEK_TYPE[\"by_day\"] INT[\"1\"] | ( THIS )? LAST -> SEEK_DIR[\"<\"] SEEK_TYPE[\"by_week\"] INT[\"1\"] | ( THIS )? PAST -> SEEK_DIR[\"<\"] SEEK_TYPE[\"by_day\"] INT[\"1\"] | ( THIS )? NEXT -> SEEK_DIR[\">\"] SEEK_TYPE[\"by_week\"] INT[\"1\"] | ( THIS )? COMING -> SEEK_DIR[\">\"] SEEK_TYPE[\"by_day\"] INT[\"1\"] | ( THIS )? UPCOMING -> SEEK_DIR[\">\"] SEEK_TYPE[\"by_day\"] INT[\"1\"] | ( IN )? spelled_or_int_1_to_31 -> SEEK_DIR[\">\"] SEEK_TYPE[\"by_day\"] spelled_or_int_1_to_31 )
            int alt25=7;
            switch ( input.LA(1) ) {
            case THIS:
                {
                switch ( input.LA(2) ) {
                case LAST:
                    {
                    alt25=2;
                    }
                    break;
                case NEXT:
                    {
                    alt25=4;
                    }
                    break;
                case UPCOMING:
                    {
                    alt25=6;
                    }
                    break;
                case PAST:
                    {
                    alt25=3;
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
                    alt25=1;
                    }
                    break;
                case COMING:
                    {
                    alt25=5;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 25, 1, input);

                    throw nvae;
                }

                }
                break;
            case LAST:
                {
                alt25=2;
                }
                break;
            case PAST:
                {
                alt25=3;
                }
                break;
            case NEXT:
                {
                alt25=4;
                }
                break;
            case COMING:
                {
                alt25=5;
                }
                break;
            case UPCOMING:
                {
                alt25=6;
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
            case TEN_TO_TWELVE:
            case ONE_TO_NINE:
            case THIRTEEN_TO_TWENTY_THREE:
            case TWENTY_FOUR_TO_THIRTY_ONE:
                {
                alt25=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:103:5: THIS
                    {
                    THIS59=(Token)match(input,THIS,FOLLOW_THIS_in_target_prefix859); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THIS.add(THIS59);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 103:20: -> SEEK_DIR[\">\"] SEEK_TYPE[\"by_day\"] INT[\"1\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(SEEK_DIR, ">"));
                        adaptor.addChild(root_0, (Object)adaptor.create(SEEK_TYPE, "by_day"));
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "1"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:104:5: ( THIS )? LAST
                    {
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:104:5: ( THIS )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==THIS) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:104:5: THIS
                            {
                            THIS60=(Token)match(input,THIS,FOLLOW_THIS_in_target_prefix886); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_THIS.add(THIS60);


                            }
                            break;

                    }

                    LAST61=(Token)match(input,LAST,FOLLOW_LAST_in_target_prefix889); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LAST.add(LAST61);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 104:20: -> SEEK_DIR[\"<\"] SEEK_TYPE[\"by_week\"] INT[\"1\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(SEEK_DIR, "<"));
                        adaptor.addChild(root_0, (Object)adaptor.create(SEEK_TYPE, "by_week"));
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "1"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:105:5: ( THIS )? PAST
                    {
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:105:5: ( THIS )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==THIS) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:105:5: THIS
                            {
                            THIS62=(Token)match(input,THIS,FOLLOW_THIS_in_target_prefix910); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_THIS.add(THIS62);


                            }
                            break;

                    }

                    PAST63=(Token)match(input,PAST,FOLLOW_PAST_in_target_prefix913); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PAST.add(PAST63);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 105:20: -> SEEK_DIR[\"<\"] SEEK_TYPE[\"by_day\"] INT[\"1\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(SEEK_DIR, "<"));
                        adaptor.addChild(root_0, (Object)adaptor.create(SEEK_TYPE, "by_day"));
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "1"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:106:5: ( THIS )? NEXT
                    {
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:106:5: ( THIS )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==THIS) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:106:5: THIS
                            {
                            THIS64=(Token)match(input,THIS,FOLLOW_THIS_in_target_prefix934); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_THIS.add(THIS64);


                            }
                            break;

                    }

                    NEXT65=(Token)match(input,NEXT,FOLLOW_NEXT_in_target_prefix937); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NEXT.add(NEXT65);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 106:20: -> SEEK_DIR[\">\"] SEEK_TYPE[\"by_week\"] INT[\"1\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(SEEK_DIR, ">"));
                        adaptor.addChild(root_0, (Object)adaptor.create(SEEK_TYPE, "by_week"));
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "1"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:107:5: ( THIS )? COMING
                    {
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:107:5: ( THIS )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==THIS) ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:107:5: THIS
                            {
                            THIS66=(Token)match(input,THIS,FOLLOW_THIS_in_target_prefix958); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_THIS.add(THIS66);


                            }
                            break;

                    }

                    COMING67=(Token)match(input,COMING,FOLLOW_COMING_in_target_prefix961); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COMING.add(COMING67);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 107:20: -> SEEK_DIR[\">\"] SEEK_TYPE[\"by_day\"] INT[\"1\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(SEEK_DIR, ">"));
                        adaptor.addChild(root_0, (Object)adaptor.create(SEEK_TYPE, "by_day"));
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "1"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 6 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:108:5: ( THIS )? UPCOMING
                    {
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:108:5: ( THIS )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==THIS) ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:108:5: THIS
                            {
                            THIS68=(Token)match(input,THIS,FOLLOW_THIS_in_target_prefix980); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_THIS.add(THIS68);


                            }
                            break;

                    }

                    UPCOMING69=(Token)match(input,UPCOMING,FOLLOW_UPCOMING_in_target_prefix983); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_UPCOMING.add(UPCOMING69);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 108:20: -> SEEK_DIR[\">\"] SEEK_TYPE[\"by_day\"] INT[\"1\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(SEEK_DIR, ">"));
                        adaptor.addChild(root_0, (Object)adaptor.create(SEEK_TYPE, "by_day"));
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "1"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 7 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:109:5: ( IN )? spelled_or_int_1_to_31
                    {
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:109:5: ( IN )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==IN) ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:109:5: IN
                            {
                            IN70=(Token)match(input,IN,FOLLOW_IN_in_target_prefix1000); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_IN.add(IN70);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_spelled_or_int_1_to_31_in_target_prefix1003);
                    spelled_or_int_1_to_3171=spelled_or_int_1_to_31();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_spelled_or_int_1_to_31.add(spelled_or_int_1_to_3171.getTree());


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
                    // 110:20: -> SEEK_DIR[\">\"] SEEK_TYPE[\"by_day\"] spelled_or_int_1_to_31
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
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:114:1: target_suffix : ( FROM_NOW -> SEEK_DIR[\">\"] SEEK_TYPE[\"by_day\"] | AGO -> SEEK_DIR[\"<\"] SEEK_TYPE[\"by_day\"] );
    public final DateParser.target_suffix_return target_suffix() throws RecognitionException {
        DateParser.target_suffix_return retval = new DateParser.target_suffix_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token FROM_NOW72=null;
        Token AGO73=null;

        Object FROM_NOW72_tree=null;
        Object AGO73_tree=null;
        RewriteRuleTokenStream stream_AGO=new RewriteRuleTokenStream(adaptor,"token AGO");
        RewriteRuleTokenStream stream_FROM_NOW=new RewriteRuleTokenStream(adaptor,"token FROM_NOW");

        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:115:3: ( FROM_NOW -> SEEK_DIR[\">\"] SEEK_TYPE[\"by_day\"] | AGO -> SEEK_DIR[\"<\"] SEEK_TYPE[\"by_day\"] )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==FROM_NOW) ) {
                alt26=1;
            }
            else if ( (LA26_0==AGO) ) {
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:115:5: FROM_NOW
                    {
                    FROM_NOW72=(Token)match(input,FROM_NOW,FOLLOW_FROM_NOW_in_target_suffix1049); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FROM_NOW.add(FROM_NOW72);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 115:14: -> SEEK_DIR[\">\"] SEEK_TYPE[\"by_day\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(SEEK_DIR, ">"));
                        adaptor.addChild(root_0, (Object)adaptor.create(SEEK_TYPE, "by_day"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:116:5: AGO
                    {
                    AGO73=(Token)match(input,AGO,FOLLOW_AGO_in_target_suffix1063); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AGO.add(AGO73);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 116:14: -> SEEK_DIR[\"<\"] SEEK_TYPE[\"by_day\"]
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
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:120:1: modifiable_target : ( day_of_week | date_span | month );
    public final DateParser.modifiable_target_return modifiable_target() throws RecognitionException {
        DateParser.modifiable_target_return retval = new DateParser.modifiable_target_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        DateParser.day_of_week_return day_of_week74 = null;

        DateParser.date_span_return date_span75 = null;

        DateParser.month_return month76 = null;



        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:121:3: ( day_of_week | date_span | month )
            int alt27=3;
            switch ( input.LA(1) ) {
            case SUNDAY:
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
            case FRIDAY:
            case SATURDAY:
                {
                alt27=1;
                }
                break;
            case DAY:
            case WEEK:
            case MONTH:
            case YEAR:
                {
                alt27=2;
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
                alt27=3;
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:121:5: day_of_week
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_day_of_week_in_modifiable_target1092);
                    day_of_week74=day_of_week();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, day_of_week74.getTree());

                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:122:5: date_span
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_date_span_in_modifiable_target1099);
                    date_span75=date_span();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, date_span75.getTree());

                    }
                    break;
                case 3 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:123:5: month
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_month_in_modifiable_target1105);
                    month76=month();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, month76.getTree());

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
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:126:1: date_span : ( DAY -> SPAN[\"day\"] | WEEK -> SPAN[\"week\"] | MONTH -> SPAN[\"month\"] | YEAR -> SPAN[\"year\"] );
    public final DateParser.date_span_return date_span() throws RecognitionException {
        DateParser.date_span_return retval = new DateParser.date_span_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DAY77=null;
        Token WEEK78=null;
        Token MONTH79=null;
        Token YEAR80=null;

        Object DAY77_tree=null;
        Object WEEK78_tree=null;
        Object MONTH79_tree=null;
        Object YEAR80_tree=null;
        RewriteRuleTokenStream stream_WEEK=new RewriteRuleTokenStream(adaptor,"token WEEK");
        RewriteRuleTokenStream stream_DAY=new RewriteRuleTokenStream(adaptor,"token DAY");
        RewriteRuleTokenStream stream_YEAR=new RewriteRuleTokenStream(adaptor,"token YEAR");
        RewriteRuleTokenStream stream_MONTH=new RewriteRuleTokenStream(adaptor,"token MONTH");

        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:127:3: ( DAY -> SPAN[\"day\"] | WEEK -> SPAN[\"week\"] | MONTH -> SPAN[\"month\"] | YEAR -> SPAN[\"year\"] )
            int alt28=4;
            switch ( input.LA(1) ) {
            case DAY:
                {
                alt28=1;
                }
                break;
            case WEEK:
                {
                alt28=2;
                }
                break;
            case MONTH:
                {
                alt28=3;
                }
                break;
            case YEAR:
                {
                alt28=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:127:5: DAY
                    {
                    DAY77=(Token)match(input,DAY,FOLLOW_DAY_in_date_span1120); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DAY.add(DAY77);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 127:11: -> SPAN[\"day\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(SPAN, "day"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:128:5: WEEK
                    {
                    WEEK78=(Token)match(input,WEEK,FOLLOW_WEEK_in_date_span1133); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WEEK.add(WEEK78);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 128:11: -> SPAN[\"week\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(SPAN, "week"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:129:5: MONTH
                    {
                    MONTH79=(Token)match(input,MONTH,FOLLOW_MONTH_in_date_span1145); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_MONTH.add(MONTH79);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 129:11: -> SPAN[\"month\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(SPAN, "month"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:130:5: YEAR
                    {
                    YEAR80=(Token)match(input,YEAR,FOLLOW_YEAR_in_date_span1156); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_YEAR.add(YEAR80);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 130:11: -> SPAN[\"year\"]
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
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:133:1: month : ( JANUARY -> ^( MONTH_OF INT[\"1\"] ) | FEBRUARY -> ^( MONTH_OF INT[\"2\"] ) | MARCH -> ^( MONTH_OF INT[\"3\"] ) | APRIL -> ^( MONTH_OF INT[\"4\"] ) | MAY -> ^( MONTH_OF INT[\"5\"] ) | JUNE -> ^( MONTH_OF INT[\"6\"] ) | JULY -> ^( MONTH_OF INT[\"7\"] ) | AUGUST -> ^( MONTH_OF INT[\"8\"] ) | SEPTEMBER -> ^( MONTH_OF INT[\"9\"] ) | OCTOBER -> ^( MONTH_OF INT[\"10\"] ) | NOVEMBER -> ^( MONTH_OF INT[\"11\"] ) | DECEMBER -> ^( MONTH_OF INT[\"12\"] ) );
    public final DateParser.month_return month() throws RecognitionException {
        DateParser.month_return retval = new DateParser.month_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token JANUARY81=null;
        Token FEBRUARY82=null;
        Token MARCH83=null;
        Token APRIL84=null;
        Token MAY85=null;
        Token JUNE86=null;
        Token JULY87=null;
        Token AUGUST88=null;
        Token SEPTEMBER89=null;
        Token OCTOBER90=null;
        Token NOVEMBER91=null;
        Token DECEMBER92=null;

        Object JANUARY81_tree=null;
        Object FEBRUARY82_tree=null;
        Object MARCH83_tree=null;
        Object APRIL84_tree=null;
        Object MAY85_tree=null;
        Object JUNE86_tree=null;
        Object JULY87_tree=null;
        Object AUGUST88_tree=null;
        Object SEPTEMBER89_tree=null;
        Object OCTOBER90_tree=null;
        Object NOVEMBER91_tree=null;
        Object DECEMBER92_tree=null;
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
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:134:3: ( JANUARY -> ^( MONTH_OF INT[\"1\"] ) | FEBRUARY -> ^( MONTH_OF INT[\"2\"] ) | MARCH -> ^( MONTH_OF INT[\"3\"] ) | APRIL -> ^( MONTH_OF INT[\"4\"] ) | MAY -> ^( MONTH_OF INT[\"5\"] ) | JUNE -> ^( MONTH_OF INT[\"6\"] ) | JULY -> ^( MONTH_OF INT[\"7\"] ) | AUGUST -> ^( MONTH_OF INT[\"8\"] ) | SEPTEMBER -> ^( MONTH_OF INT[\"9\"] ) | OCTOBER -> ^( MONTH_OF INT[\"10\"] ) | NOVEMBER -> ^( MONTH_OF INT[\"11\"] ) | DECEMBER -> ^( MONTH_OF INT[\"12\"] ) )
            int alt29=12;
            switch ( input.LA(1) ) {
            case JANUARY:
                {
                alt29=1;
                }
                break;
            case FEBRUARY:
                {
                alt29=2;
                }
                break;
            case MARCH:
                {
                alt29=3;
                }
                break;
            case APRIL:
                {
                alt29=4;
                }
                break;
            case MAY:
                {
                alt29=5;
                }
                break;
            case JUNE:
                {
                alt29=6;
                }
                break;
            case JULY:
                {
                alt29=7;
                }
                break;
            case AUGUST:
                {
                alt29=8;
                }
                break;
            case SEPTEMBER:
                {
                alt29=9;
                }
                break;
            case OCTOBER:
                {
                alt29=10;
                }
                break;
            case NOVEMBER:
                {
                alt29=11;
                }
                break;
            case DECEMBER:
                {
                alt29=12;
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:134:5: JANUARY
                    {
                    JANUARY81=(Token)match(input,JANUARY,FOLLOW_JANUARY_in_month1177); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_JANUARY.add(JANUARY81);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 134:15: -> ^( MONTH_OF INT[\"1\"] )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:134:18: ^( MONTH_OF INT[\"1\"] )
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:135:5: FEBRUARY
                    {
                    FEBRUARY82=(Token)match(input,FEBRUARY,FOLLOW_FEBRUARY_in_month1194); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FEBRUARY.add(FEBRUARY82);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 135:15: -> ^( MONTH_OF INT[\"2\"] )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:135:18: ^( MONTH_OF INT[\"2\"] )
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:136:5: MARCH
                    {
                    MARCH83=(Token)match(input,MARCH,FOLLOW_MARCH_in_month1210); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_MARCH.add(MARCH83);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 136:15: -> ^( MONTH_OF INT[\"3\"] )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:136:18: ^( MONTH_OF INT[\"3\"] )
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:137:5: APRIL
                    {
                    APRIL84=(Token)match(input,APRIL,FOLLOW_APRIL_in_month1229); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_APRIL.add(APRIL84);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 137:15: -> ^( MONTH_OF INT[\"4\"] )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:137:18: ^( MONTH_OF INT[\"4\"] )
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:138:5: MAY
                    {
                    MAY85=(Token)match(input,MAY,FOLLOW_MAY_in_month1248); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_MAY.add(MAY85);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 138:15: -> ^( MONTH_OF INT[\"5\"] )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:138:18: ^( MONTH_OF INT[\"5\"] )
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:139:5: JUNE
                    {
                    JUNE86=(Token)match(input,JUNE,FOLLOW_JUNE_in_month1269); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_JUNE.add(JUNE86);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 139:15: -> ^( MONTH_OF INT[\"6\"] )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:139:18: ^( MONTH_OF INT[\"6\"] )
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:140:5: JULY
                    {
                    JULY87=(Token)match(input,JULY,FOLLOW_JULY_in_month1289); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_JULY.add(JULY87);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 140:15: -> ^( MONTH_OF INT[\"7\"] )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:140:18: ^( MONTH_OF INT[\"7\"] )
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:141:5: AUGUST
                    {
                    AUGUST88=(Token)match(input,AUGUST,FOLLOW_AUGUST_in_month1309); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AUGUST.add(AUGUST88);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 141:15: -> ^( MONTH_OF INT[\"8\"] )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:141:18: ^( MONTH_OF INT[\"8\"] )
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:142:5: SEPTEMBER
                    {
                    SEPTEMBER89=(Token)match(input,SEPTEMBER,FOLLOW_SEPTEMBER_in_month1327); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEPTEMBER.add(SEPTEMBER89);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 142:15: -> ^( MONTH_OF INT[\"9\"] )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:142:18: ^( MONTH_OF INT[\"9\"] )
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:143:5: OCTOBER
                    {
                    OCTOBER90=(Token)match(input,OCTOBER,FOLLOW_OCTOBER_in_month1342); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OCTOBER.add(OCTOBER90);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 143:15: -> ^( MONTH_OF INT[\"10\"] )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:143:18: ^( MONTH_OF INT[\"10\"] )
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:144:5: NOVEMBER
                    {
                    NOVEMBER91=(Token)match(input,NOVEMBER,FOLLOW_NOVEMBER_in_month1359); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NOVEMBER.add(NOVEMBER91);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 144:15: -> ^( MONTH_OF INT[\"11\"] )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:144:18: ^( MONTH_OF INT[\"11\"] )
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:145:5: DECEMBER
                    {
                    DECEMBER92=(Token)match(input,DECEMBER,FOLLOW_DECEMBER_in_month1375); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DECEMBER.add(DECEMBER92);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 145:15: -> ^( MONTH_OF INT[\"12\"] )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:145:18: ^( MONTH_OF INT[\"12\"] )
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
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:148:1: day_of_month : ( spelled_or_int_1_to_31 -> ^( DAY_OF_MONTH spelled_or_int_1_to_31 ) | spelled_sequence_1_to_31 -> ^( DAY_OF_MONTH spelled_sequence_1_to_31 ) );
    public final DateParser.day_of_month_return day_of_month() throws RecognitionException {
        DateParser.day_of_month_return retval = new DateParser.day_of_month_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        DateParser.spelled_or_int_1_to_31_return spelled_or_int_1_to_3193 = null;

        DateParser.spelled_sequence_1_to_31_return spelled_sequence_1_to_3194 = null;


        RewriteRuleSubtreeStream stream_spelled_or_int_1_to_31=new RewriteRuleSubtreeStream(adaptor,"rule spelled_or_int_1_to_31");
        RewriteRuleSubtreeStream stream_spelled_sequence_1_to_31=new RewriteRuleSubtreeStream(adaptor,"rule spelled_sequence_1_to_31");
        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:149:3: ( spelled_or_int_1_to_31 -> ^( DAY_OF_MONTH spelled_or_int_1_to_31 ) | spelled_sequence_1_to_31 -> ^( DAY_OF_MONTH spelled_sequence_1_to_31 ) )
            int alt30=2;
            switch ( input.LA(1) ) {
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
            case PREFIXED_ONE_TO_NINE:
            case TEN_TO_TWELVE:
            case ONE_TO_NINE:
            case THIRTEEN_TO_TWENTY_THREE:
            case TWENTY_FOUR_TO_THIRTY_ONE:
                {
                alt30=1;
                }
                break;
            case TWENTY:
                {
                switch ( input.LA(2) ) {
                case DASH:
                    {
                    int LA30_5 = input.LA(3);

                    if ( ((LA30_5>=FIRST && LA30_5<=NINTH)) ) {
                        alt30=2;
                    }
                    else if ( ((LA30_5>=ONE && LA30_5<=NINE)) ) {
                        alt30=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 30, 5, input);

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
                    alt30=2;
                    }
                    break;
                case EOF:
                case AT:
                case COMMA:
                case IN:
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
                case MIDNIGHT:
                case NOON:
                case ONE:
                case TWO:
                case THREE:
                case FOUR:
                case FIVE:
                case SIX:
                case SEVEN:
                case EIGHT:
                case NINE:
                case THREE_DIGIT:
                case FOUR_DIGIT:
                case TWO_ZEROS:
                case PREFIXED_ONE_TO_NINE:
                case TEN_TO_TWELVE:
                case ONE_TO_NINE:
                case THIRTEEN_TO_TWENTY_THREE:
                case TWENTY_FOUR_TO_THIRTY_ONE:
                case THIRTY_TWO_TO_FIFTY_NINE:
                case SIXTY_TO_NINETY_NINE:
                case 132:
                case 133:
                    {
                    alt30=1;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 30, 2, input);

                    throw nvae;
                }

                }
                break;
            case THIRTY:
                {
                switch ( input.LA(2) ) {
                case DASH:
                    {
                    int LA30_6 = input.LA(3);

                    if ( (LA30_6==FIRST) ) {
                        alt30=2;
                    }
                    else if ( (LA30_6==ONE) ) {
                        alt30=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 30, 6, input);

                        throw nvae;
                    }
                    }
                    break;
                case FIRST:
                    {
                    alt30=2;
                    }
                    break;
                case EOF:
                case AT:
                case COMMA:
                case IN:
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
                case MIDNIGHT:
                case NOON:
                case ONE:
                case THREE_DIGIT:
                case FOUR_DIGIT:
                case TWO_ZEROS:
                case PREFIXED_ONE_TO_NINE:
                case TEN_TO_TWELVE:
                case ONE_TO_NINE:
                case THIRTEEN_TO_TWENTY_THREE:
                case TWENTY_FOUR_TO_THIRTY_ONE:
                case THIRTY_TWO_TO_FIFTY_NINE:
                case SIXTY_TO_NINETY_NINE:
                case 132:
                case 133:
                    {
                    alt30=1;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 30, 3, input);

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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:149:5: spelled_or_int_1_to_31
                    {
                    pushFollow(FOLLOW_spelled_or_int_1_to_31_in_day_of_month1400);
                    spelled_or_int_1_to_3193=spelled_or_int_1_to_31();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_spelled_or_int_1_to_31.add(spelled_or_int_1_to_3193.getTree());


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
                    // 149:30: -> ^( DAY_OF_MONTH spelled_or_int_1_to_31 )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:149:33: ^( DAY_OF_MONTH spelled_or_int_1_to_31 )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DAY_OF_MONTH, "DAY_OF_MONTH"), root_1);

                        adaptor.addChild(root_1, stream_spelled_or_int_1_to_31.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:150:5: spelled_sequence_1_to_31
                    {
                    pushFollow(FOLLOW_spelled_sequence_1_to_31_in_day_of_month1416);
                    spelled_sequence_1_to_3194=spelled_sequence_1_to_31();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_spelled_sequence_1_to_31.add(spelled_sequence_1_to_3194.getTree());


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
                    // 150:30: -> ^( DAY_OF_MONTH spelled_sequence_1_to_31 )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:150:33: ^( DAY_OF_MONTH spelled_sequence_1_to_31 )
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
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:153:1: day_of_week : ( SUNDAY -> ^( DAY_OF_WEEK INT[\"1\"] ) | MONDAY -> ^( DAY_OF_WEEK INT[\"2\"] ) | TUESDAY -> ^( DAY_OF_WEEK INT[\"3\"] ) | WEDNESDAY -> ^( DAY_OF_WEEK INT[\"4\"] ) | THURSDAY -> ^( DAY_OF_WEEK INT[\"5\"] ) | FRIDAY -> ^( DAY_OF_WEEK INT[\"6\"] ) | SATURDAY -> ^( DAY_OF_WEEK INT[\"7\"] ) );
    public final DateParser.day_of_week_return day_of_week() throws RecognitionException {
        DateParser.day_of_week_return retval = new DateParser.day_of_week_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SUNDAY95=null;
        Token MONDAY96=null;
        Token TUESDAY97=null;
        Token WEDNESDAY98=null;
        Token THURSDAY99=null;
        Token FRIDAY100=null;
        Token SATURDAY101=null;

        Object SUNDAY95_tree=null;
        Object MONDAY96_tree=null;
        Object TUESDAY97_tree=null;
        Object WEDNESDAY98_tree=null;
        Object THURSDAY99_tree=null;
        Object FRIDAY100_tree=null;
        Object SATURDAY101_tree=null;
        RewriteRuleTokenStream stream_MONDAY=new RewriteRuleTokenStream(adaptor,"token MONDAY");
        RewriteRuleTokenStream stream_SUNDAY=new RewriteRuleTokenStream(adaptor,"token SUNDAY");
        RewriteRuleTokenStream stream_WEDNESDAY=new RewriteRuleTokenStream(adaptor,"token WEDNESDAY");
        RewriteRuleTokenStream stream_THURSDAY=new RewriteRuleTokenStream(adaptor,"token THURSDAY");
        RewriteRuleTokenStream stream_SATURDAY=new RewriteRuleTokenStream(adaptor,"token SATURDAY");
        RewriteRuleTokenStream stream_TUESDAY=new RewriteRuleTokenStream(adaptor,"token TUESDAY");
        RewriteRuleTokenStream stream_FRIDAY=new RewriteRuleTokenStream(adaptor,"token FRIDAY");

        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:154:3: ( SUNDAY -> ^( DAY_OF_WEEK INT[\"1\"] ) | MONDAY -> ^( DAY_OF_WEEK INT[\"2\"] ) | TUESDAY -> ^( DAY_OF_WEEK INT[\"3\"] ) | WEDNESDAY -> ^( DAY_OF_WEEK INT[\"4\"] ) | THURSDAY -> ^( DAY_OF_WEEK INT[\"5\"] ) | FRIDAY -> ^( DAY_OF_WEEK INT[\"6\"] ) | SATURDAY -> ^( DAY_OF_WEEK INT[\"7\"] ) )
            int alt31=7;
            switch ( input.LA(1) ) {
            case SUNDAY:
                {
                alt31=1;
                }
                break;
            case MONDAY:
                {
                alt31=2;
                }
                break;
            case TUESDAY:
                {
                alt31=3;
                }
                break;
            case WEDNESDAY:
                {
                alt31=4;
                }
                break;
            case THURSDAY:
                {
                alt31=5;
                }
                break;
            case FRIDAY:
                {
                alt31=6;
                }
                break;
            case SATURDAY:
                {
                alt31=7;
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:154:5: SUNDAY
                    {
                    SUNDAY95=(Token)match(input,SUNDAY,FOLLOW_SUNDAY_in_day_of_week1440); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SUNDAY.add(SUNDAY95);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 154:15: -> ^( DAY_OF_WEEK INT[\"1\"] )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:154:18: ^( DAY_OF_WEEK INT[\"1\"] )
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:155:5: MONDAY
                    {
                    MONDAY96=(Token)match(input,MONDAY,FOLLOW_MONDAY_in_day_of_week1458); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_MONDAY.add(MONDAY96);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 155:15: -> ^( DAY_OF_WEEK INT[\"2\"] )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:155:18: ^( DAY_OF_WEEK INT[\"2\"] )
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:156:5: TUESDAY
                    {
                    TUESDAY97=(Token)match(input,TUESDAY,FOLLOW_TUESDAY_in_day_of_week1476); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TUESDAY.add(TUESDAY97);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 156:15: -> ^( DAY_OF_WEEK INT[\"3\"] )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:156:18: ^( DAY_OF_WEEK INT[\"3\"] )
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:157:5: WEDNESDAY
                    {
                    WEDNESDAY98=(Token)match(input,WEDNESDAY,FOLLOW_WEDNESDAY_in_day_of_week1493); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WEDNESDAY.add(WEDNESDAY98);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 157:15: -> ^( DAY_OF_WEEK INT[\"4\"] )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:157:18: ^( DAY_OF_WEEK INT[\"4\"] )
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:158:5: THURSDAY
                    {
                    THURSDAY99=(Token)match(input,THURSDAY,FOLLOW_THURSDAY_in_day_of_week1508); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THURSDAY.add(THURSDAY99);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 158:15: -> ^( DAY_OF_WEEK INT[\"5\"] )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:158:18: ^( DAY_OF_WEEK INT[\"5\"] )
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:159:5: FRIDAY
                    {
                    FRIDAY100=(Token)match(input,FRIDAY,FOLLOW_FRIDAY_in_day_of_week1524); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FRIDAY.add(FRIDAY100);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 159:15: -> ^( DAY_OF_WEEK INT[\"6\"] )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:159:18: ^( DAY_OF_WEEK INT[\"6\"] )
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:160:5: SATURDAY
                    {
                    SATURDAY101=(Token)match(input,SATURDAY,FOLLOW_SATURDAY_in_day_of_week1542); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SATURDAY.add(SATURDAY101);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 160:15: -> ^( DAY_OF_WEEK INT[\"7\"] )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:160:18: ^( DAY_OF_WEEK INT[\"7\"] )
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
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:163:1: year : ( ( COMMA )? ( IN THE YEAR )? ( '\\'' )? int_0_to_99_with_prefix -> ^( YEAR_OF int_0_to_99_with_prefix ) | ( COMMA )? ( IN THE YEAR )? int_3_or_4_digits -> ^( YEAR_OF int_3_or_4_digits ) );
    public final DateParser.year_return year() throws RecognitionException {
        DateParser.year_return retval = new DateParser.year_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token COMMA102=null;
        Token IN103=null;
        Token THE104=null;
        Token YEAR105=null;
        Token char_literal106=null;
        Token COMMA108=null;
        Token IN109=null;
        Token THE110=null;
        Token YEAR111=null;
        DateParser.int_0_to_99_with_prefix_return int_0_to_99_with_prefix107 = null;

        DateParser.int_3_or_4_digits_return int_3_or_4_digits112 = null;


        Object COMMA102_tree=null;
        Object IN103_tree=null;
        Object THE104_tree=null;
        Object YEAR105_tree=null;
        Object char_literal106_tree=null;
        Object COMMA108_tree=null;
        Object IN109_tree=null;
        Object THE110_tree=null;
        Object YEAR111_tree=null;
        RewriteRuleTokenStream stream_133=new RewriteRuleTokenStream(adaptor,"token 133");
        RewriteRuleTokenStream stream_IN=new RewriteRuleTokenStream(adaptor,"token IN");
        RewriteRuleTokenStream stream_YEAR=new RewriteRuleTokenStream(adaptor,"token YEAR");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_THE=new RewriteRuleTokenStream(adaptor,"token THE");
        RewriteRuleSubtreeStream stream_int_0_to_99_with_prefix=new RewriteRuleSubtreeStream(adaptor,"rule int_0_to_99_with_prefix");
        RewriteRuleSubtreeStream stream_int_3_or_4_digits=new RewriteRuleSubtreeStream(adaptor,"rule int_3_or_4_digits");
        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:164:3: ( ( COMMA )? ( IN THE YEAR )? ( '\\'' )? int_0_to_99_with_prefix -> ^( YEAR_OF int_0_to_99_with_prefix ) | ( COMMA )? ( IN THE YEAR )? int_3_or_4_digits -> ^( YEAR_OF int_3_or_4_digits ) )
            int alt37=2;
            switch ( input.LA(1) ) {
            case COMMA:
                {
                switch ( input.LA(2) ) {
                case IN:
                    {
                    int LA37_2 = input.LA(3);

                    if ( (LA37_2==THE) ) {
                        int LA37_5 = input.LA(4);

                        if ( (LA37_5==YEAR) ) {
                            int LA37_6 = input.LA(5);

                            if ( ((LA37_6>=TWO_ZEROS && LA37_6<=TEN_TO_TWELVE)||(LA37_6>=THIRTEEN_TO_TWENTY_THREE && LA37_6<=THIRTY_TWO_TO_FIFTY_NINE)||LA37_6==SIXTY_TO_NINETY_NINE||LA37_6==133) ) {
                                alt37=1;
                            }
                            else if ( ((LA37_6>=THREE_DIGIT && LA37_6<=FOUR_DIGIT)) ) {
                                alt37=2;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 37, 6, input);

                                throw nvae;
                            }
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 37, 5, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 37, 2, input);

                        throw nvae;
                    }
                    }
                    break;
                case THREE_DIGIT:
                case FOUR_DIGIT:
                    {
                    alt37=2;
                    }
                    break;
                case TWO_ZEROS:
                case PREFIXED_ONE_TO_NINE:
                case TEN_TO_TWELVE:
                case THIRTEEN_TO_TWENTY_THREE:
                case TWENTY_FOUR_TO_THIRTY_ONE:
                case THIRTY_TWO_TO_FIFTY_NINE:
                case SIXTY_TO_NINETY_NINE:
                case 133:
                    {
                    alt37=1;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 37, 1, input);

                    throw nvae;
                }

                }
                break;
            case IN:
                {
                int LA37_2 = input.LA(2);

                if ( (LA37_2==THE) ) {
                    int LA37_5 = input.LA(3);

                    if ( (LA37_5==YEAR) ) {
                        int LA37_6 = input.LA(4);

                        if ( ((LA37_6>=TWO_ZEROS && LA37_6<=TEN_TO_TWELVE)||(LA37_6>=THIRTEEN_TO_TWENTY_THREE && LA37_6<=THIRTY_TWO_TO_FIFTY_NINE)||LA37_6==SIXTY_TO_NINETY_NINE||LA37_6==133) ) {
                            alt37=1;
                        }
                        else if ( ((LA37_6>=THREE_DIGIT && LA37_6<=FOUR_DIGIT)) ) {
                            alt37=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 37, 6, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 37, 5, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 37, 2, input);

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
            case 133:
                {
                alt37=1;
                }
                break;
            case THREE_DIGIT:
            case FOUR_DIGIT:
                {
                alt37=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }

            switch (alt37) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:164:5: ( COMMA )? ( IN THE YEAR )? ( '\\'' )? int_0_to_99_with_prefix
                    {
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:164:5: ( COMMA )?
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==COMMA) ) {
                        alt32=1;
                    }
                    switch (alt32) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:164:5: COMMA
                            {
                            COMMA102=(Token)match(input,COMMA,FOLLOW_COMMA_in_year1567); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_COMMA.add(COMMA102);


                            }
                            break;

                    }

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:164:12: ( IN THE YEAR )?
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==IN) ) {
                        alt33=1;
                    }
                    switch (alt33) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:164:13: IN THE YEAR
                            {
                            IN103=(Token)match(input,IN,FOLLOW_IN_in_year1571); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_IN.add(IN103);

                            THE104=(Token)match(input,THE,FOLLOW_THE_in_year1573); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_THE.add(THE104);

                            YEAR105=(Token)match(input,YEAR,FOLLOW_YEAR_in_year1575); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_YEAR.add(YEAR105);


                            }
                            break;

                    }

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:164:27: ( '\\'' )?
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( (LA34_0==133) ) {
                        alt34=1;
                    }
                    switch (alt34) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:164:27: '\\''
                            {
                            char_literal106=(Token)match(input,133,FOLLOW_133_in_year1579); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_133.add(char_literal106);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_int_0_to_99_with_prefix_in_year1582);
                    int_0_to_99_with_prefix107=int_0_to_99_with_prefix();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_int_0_to_99_with_prefix.add(int_0_to_99_with_prefix107.getTree());


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
                    // 164:57: -> ^( YEAR_OF int_0_to_99_with_prefix )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:164:60: ^( YEAR_OF int_0_to_99_with_prefix )
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:165:5: ( COMMA )? ( IN THE YEAR )? int_3_or_4_digits
                    {
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:165:5: ( COMMA )?
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==COMMA) ) {
                        alt35=1;
                    }
                    switch (alt35) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:165:5: COMMA
                            {
                            COMMA108=(Token)match(input,COMMA,FOLLOW_COMMA_in_year1596); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_COMMA.add(COMMA108);


                            }
                            break;

                    }

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:165:12: ( IN THE YEAR )?
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0==IN) ) {
                        alt36=1;
                    }
                    switch (alt36) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:165:13: IN THE YEAR
                            {
                            IN109=(Token)match(input,IN,FOLLOW_IN_in_year1600); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_IN.add(IN109);

                            THE110=(Token)match(input,THE,FOLLOW_THE_in_year1602); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_THE.add(THE110);

                            YEAR111=(Token)match(input,YEAR,FOLLOW_YEAR_in_year1604); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_YEAR.add(YEAR111);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_int_3_or_4_digits_in_year1608);
                    int_3_or_4_digits112=int_3_or_4_digits();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_int_3_or_4_digits.add(int_3_or_4_digits112.getTree());


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
                    // 165:57: -> ^( YEAR_OF int_3_or_4_digits )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:165:60: ^( YEAR_OF int_3_or_4_digits )
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
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:168:1: date_separator : ( DASH | SLASH );
    public final DateParser.date_separator_return date_separator() throws RecognitionException {
        DateParser.date_separator_return retval = new DateParser.date_separator_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set113=null;

        Object set113_tree=null;

        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:169:3: ( DASH | SLASH )
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:
            {
            root_0 = (Object)adaptor.nil();

            set113=(Token)input.LT(1);
            if ( (input.LA(1)>=DASH && input.LA(1)<=SLASH) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set113));
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
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:173:1: hours : int_0_to_23 -> ^( HOURS int_0_to_23 ) ;
    public final DateParser.hours_return hours() throws RecognitionException {
        DateParser.hours_return retval = new DateParser.hours_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        DateParser.int_0_to_23_return int_0_to_23114 = null;


        RewriteRuleSubtreeStream stream_int_0_to_23=new RewriteRuleSubtreeStream(adaptor,"rule int_0_to_23");
        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:174:3: ( int_0_to_23 -> ^( HOURS int_0_to_23 ) )
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:174:5: int_0_to_23
            {
            pushFollow(FOLLOW_int_0_to_23_in_hours1662);
            int_0_to_23114=int_0_to_23();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_int_0_to_23.add(int_0_to_23114.getTree());


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
            // 174:17: -> ^( HOURS int_0_to_23 )
            {
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:174:20: ^( HOURS int_0_to_23 )
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
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:177:1: minutes : int_0_to_59 -> ^( MINUTES int_0_to_59 ) ;
    public final DateParser.minutes_return minutes() throws RecognitionException {
        DateParser.minutes_return retval = new DateParser.minutes_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        DateParser.int_0_to_59_return int_0_to_59115 = null;


        RewriteRuleSubtreeStream stream_int_0_to_59=new RewriteRuleSubtreeStream(adaptor,"rule int_0_to_59");
        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:178:3: ( int_0_to_59 -> ^( MINUTES int_0_to_59 ) )
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:178:5: int_0_to_59
            {
            pushFollow(FOLLOW_int_0_to_59_in_minutes1685);
            int_0_to_59115=int_0_to_59();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_int_0_to_59.add(int_0_to_59115.getTree());


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
            // 178:17: -> ^( MINUTES int_0_to_59 )
            {
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:178:20: ^( MINUTES int_0_to_59 )
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
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:181:1: meridian_indicator : ( AM -> AM_PM[\"am\"] | PM -> AM_PM[\"pm\"] );
    public final DateParser.meridian_indicator_return meridian_indicator() throws RecognitionException {
        DateParser.meridian_indicator_return retval = new DateParser.meridian_indicator_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token AM116=null;
        Token PM117=null;

        Object AM116_tree=null;
        Object PM117_tree=null;
        RewriteRuleTokenStream stream_PM=new RewriteRuleTokenStream(adaptor,"token PM");
        RewriteRuleTokenStream stream_AM=new RewriteRuleTokenStream(adaptor,"token AM");

        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:182:3: ( AM -> AM_PM[\"am\"] | PM -> AM_PM[\"pm\"] )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==AM) ) {
                alt38=1;
            }
            else if ( (LA38_0==PM) ) {
                alt38=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:182:5: AM
                    {
                    AM116=(Token)match(input,AM,FOLLOW_AM_in_meridian_indicator1708); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AM.add(AM116);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 182:8: -> AM_PM[\"am\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(AM_PM, "am"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:183:5: PM
                    {
                    PM117=(Token)match(input,PM,FOLLOW_PM_in_meridian_indicator1719); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PM.add(PM117);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 183:8: -> AM_PM[\"pm\"]
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

    public static class time_identifier_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "time_identifier"
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:187:1: time_identifier : ( MIDNIGHT -> ^( EXPLICIT_TIME ^( HOURS INT[\"12\"] ) AM_PM[\"am\"] ) | NOON -> ^( EXPLICIT_TIME ^( HOURS INT[\"12\"] ) AM_PM[\"pm\"] ) );
    public final DateParser.time_identifier_return time_identifier() throws RecognitionException {
        DateParser.time_identifier_return retval = new DateParser.time_identifier_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token MIDNIGHT118=null;
        Token NOON119=null;

        Object MIDNIGHT118_tree=null;
        Object NOON119_tree=null;
        RewriteRuleTokenStream stream_NOON=new RewriteRuleTokenStream(adaptor,"token NOON");
        RewriteRuleTokenStream stream_MIDNIGHT=new RewriteRuleTokenStream(adaptor,"token MIDNIGHT");

        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:188:3: ( MIDNIGHT -> ^( EXPLICIT_TIME ^( HOURS INT[\"12\"] ) AM_PM[\"am\"] ) | NOON -> ^( EXPLICIT_TIME ^( HOURS INT[\"12\"] ) AM_PM[\"pm\"] ) )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==MIDNIGHT) ) {
                alt39=1;
            }
            else if ( (LA39_0==NOON) ) {
                alt39=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }
            switch (alt39) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:188:5: MIDNIGHT
                    {
                    MIDNIGHT118=(Token)match(input,MIDNIGHT,FOLLOW_MIDNIGHT_in_time_identifier1740); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_MIDNIGHT.add(MIDNIGHT118);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 188:14: -> ^( EXPLICIT_TIME ^( HOURS INT[\"12\"] ) AM_PM[\"am\"] )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:188:17: ^( EXPLICIT_TIME ^( HOURS INT[\"12\"] ) AM_PM[\"am\"] )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPLICIT_TIME, "EXPLICIT_TIME"), root_1);

                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:188:33: ^( HOURS INT[\"12\"] )
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:189:5: NOON
                    {
                    NOON119=(Token)match(input,NOON,FOLLOW_NOON_in_time_identifier1762); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NOON.add(NOON119);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 189:14: -> ^( EXPLICIT_TIME ^( HOURS INT[\"12\"] ) AM_PM[\"pm\"] )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:189:17: ^( EXPLICIT_TIME ^( HOURS INT[\"12\"] ) AM_PM[\"pm\"] )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPLICIT_TIME, "EXPLICIT_TIME"), root_1);

                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:189:33: ^( HOURS INT[\"12\"] )
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

    public static class spelled_1_to_31_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "spelled_1_to_31"
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:193:1: spelled_1_to_31 : ( ONE -> INT[\"1\"] | TWO -> INT[\"2\"] | THREE -> INT[\"3\"] | FOUR -> INT[\"4\"] | FIVE -> INT[\"5\"] | SIX -> INT[\"6\"] | SEVEN -> INT[\"7\"] | EIGHT -> INT[\"8\"] | NINE -> INT[\"9\"] | TEN -> INT[\"10\"] | ELEVEN -> INT[\"11\"] | TWELVE -> INT[\"12\"] | THIRTEEN -> INT[\"13\"] | FOURTEEN -> INT[\"14\"] | FIFTEEN -> INT[\"15\"] | SIXTEEN -> INT[\"16\"] | SEVENTEEN -> INT[\"17\"] | EIGHTEEN -> INT[\"18\"] | NINETEEN -> INT[\"19\"] | TWENTY -> INT[\"20\"] | TWENTY ( DASH )? ONE -> INT[\"21\"] | TWENTY ( DASH )? TWO -> INT[\"22\"] | TWENTY ( DASH )? THREE -> INT[\"23\"] | TWENTY ( DASH )? FOUR -> INT[\"24\"] | TWENTY ( DASH )? FIVE -> INT[\"25\"] | TWENTY ( DASH )? SIX -> INT[\"26\"] | TWENTY ( DASH )? SEVEN -> INT[\"27\"] | TWENTY ( DASH )? EIGHT -> INT[\"28\"] | TWENTY ( DASH )? NINE -> INT[\"29\"] | THIRTY -> INT[\"30\"] | THIRTY ( DASH )? ONE -> INT[\"31\"] );
    public final DateParser.spelled_1_to_31_return spelled_1_to_31() throws RecognitionException {
        DateParser.spelled_1_to_31_return retval = new DateParser.spelled_1_to_31_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ONE120=null;
        Token TWO121=null;
        Token THREE122=null;
        Token FOUR123=null;
        Token FIVE124=null;
        Token SIX125=null;
        Token SEVEN126=null;
        Token EIGHT127=null;
        Token NINE128=null;
        Token TEN129=null;
        Token ELEVEN130=null;
        Token TWELVE131=null;
        Token THIRTEEN132=null;
        Token FOURTEEN133=null;
        Token FIFTEEN134=null;
        Token SIXTEEN135=null;
        Token SEVENTEEN136=null;
        Token EIGHTEEN137=null;
        Token NINETEEN138=null;
        Token TWENTY139=null;
        Token TWENTY140=null;
        Token DASH141=null;
        Token ONE142=null;
        Token TWENTY143=null;
        Token DASH144=null;
        Token TWO145=null;
        Token TWENTY146=null;
        Token DASH147=null;
        Token THREE148=null;
        Token TWENTY149=null;
        Token DASH150=null;
        Token FOUR151=null;
        Token TWENTY152=null;
        Token DASH153=null;
        Token FIVE154=null;
        Token TWENTY155=null;
        Token DASH156=null;
        Token SIX157=null;
        Token TWENTY158=null;
        Token DASH159=null;
        Token SEVEN160=null;
        Token TWENTY161=null;
        Token DASH162=null;
        Token EIGHT163=null;
        Token TWENTY164=null;
        Token DASH165=null;
        Token NINE166=null;
        Token THIRTY167=null;
        Token THIRTY168=null;
        Token DASH169=null;
        Token ONE170=null;

        Object ONE120_tree=null;
        Object TWO121_tree=null;
        Object THREE122_tree=null;
        Object FOUR123_tree=null;
        Object FIVE124_tree=null;
        Object SIX125_tree=null;
        Object SEVEN126_tree=null;
        Object EIGHT127_tree=null;
        Object NINE128_tree=null;
        Object TEN129_tree=null;
        Object ELEVEN130_tree=null;
        Object TWELVE131_tree=null;
        Object THIRTEEN132_tree=null;
        Object FOURTEEN133_tree=null;
        Object FIFTEEN134_tree=null;
        Object SIXTEEN135_tree=null;
        Object SEVENTEEN136_tree=null;
        Object EIGHTEEN137_tree=null;
        Object NINETEEN138_tree=null;
        Object TWENTY139_tree=null;
        Object TWENTY140_tree=null;
        Object DASH141_tree=null;
        Object ONE142_tree=null;
        Object TWENTY143_tree=null;
        Object DASH144_tree=null;
        Object TWO145_tree=null;
        Object TWENTY146_tree=null;
        Object DASH147_tree=null;
        Object THREE148_tree=null;
        Object TWENTY149_tree=null;
        Object DASH150_tree=null;
        Object FOUR151_tree=null;
        Object TWENTY152_tree=null;
        Object DASH153_tree=null;
        Object FIVE154_tree=null;
        Object TWENTY155_tree=null;
        Object DASH156_tree=null;
        Object SIX157_tree=null;
        Object TWENTY158_tree=null;
        Object DASH159_tree=null;
        Object SEVEN160_tree=null;
        Object TWENTY161_tree=null;
        Object DASH162_tree=null;
        Object EIGHT163_tree=null;
        Object TWENTY164_tree=null;
        Object DASH165_tree=null;
        Object NINE166_tree=null;
        Object THIRTY167_tree=null;
        Object THIRTY168_tree=null;
        Object DASH169_tree=null;
        Object ONE170_tree=null;
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
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:194:3: ( ONE -> INT[\"1\"] | TWO -> INT[\"2\"] | THREE -> INT[\"3\"] | FOUR -> INT[\"4\"] | FIVE -> INT[\"5\"] | SIX -> INT[\"6\"] | SEVEN -> INT[\"7\"] | EIGHT -> INT[\"8\"] | NINE -> INT[\"9\"] | TEN -> INT[\"10\"] | ELEVEN -> INT[\"11\"] | TWELVE -> INT[\"12\"] | THIRTEEN -> INT[\"13\"] | FOURTEEN -> INT[\"14\"] | FIFTEEN -> INT[\"15\"] | SIXTEEN -> INT[\"16\"] | SEVENTEEN -> INT[\"17\"] | EIGHTEEN -> INT[\"18\"] | NINETEEN -> INT[\"19\"] | TWENTY -> INT[\"20\"] | TWENTY ( DASH )? ONE -> INT[\"21\"] | TWENTY ( DASH )? TWO -> INT[\"22\"] | TWENTY ( DASH )? THREE -> INT[\"23\"] | TWENTY ( DASH )? FOUR -> INT[\"24\"] | TWENTY ( DASH )? FIVE -> INT[\"25\"] | TWENTY ( DASH )? SIX -> INT[\"26\"] | TWENTY ( DASH )? SEVEN -> INT[\"27\"] | TWENTY ( DASH )? EIGHT -> INT[\"28\"] | TWENTY ( DASH )? NINE -> INT[\"29\"] | THIRTY -> INT[\"30\"] | THIRTY ( DASH )? ONE -> INT[\"31\"] )
            int alt50=31;
            alt50 = dfa50.predict(input);
            switch (alt50) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:194:5: ONE
                    {
                    ONE120=(Token)match(input,ONE,FOLLOW_ONE_in_spelled_1_to_311798); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ONE.add(ONE120);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 194:16: -> INT[\"1\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "1"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:195:5: TWO
                    {
                    TWO121=(Token)match(input,TWO,FOLLOW_TWO_in_spelled_1_to_311816); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWO.add(TWO121);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 195:16: -> INT[\"2\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "2"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:196:5: THREE
                    {
                    THREE122=(Token)match(input,THREE,FOLLOW_THREE_in_spelled_1_to_311834); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THREE.add(THREE122);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 196:16: -> INT[\"3\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "3"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:197:5: FOUR
                    {
                    FOUR123=(Token)match(input,FOUR,FOLLOW_FOUR_in_spelled_1_to_311850); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FOUR.add(FOUR123);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 197:16: -> INT[\"4\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "4"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:198:5: FIVE
                    {
                    FIVE124=(Token)match(input,FIVE,FOLLOW_FIVE_in_spelled_1_to_311867); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FIVE.add(FIVE124);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 198:16: -> INT[\"5\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "5"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 6 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:199:5: SIX
                    {
                    SIX125=(Token)match(input,SIX,FOLLOW_SIX_in_spelled_1_to_311884); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SIX.add(SIX125);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 199:16: -> INT[\"6\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "6"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 7 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:200:5: SEVEN
                    {
                    SEVEN126=(Token)match(input,SEVEN,FOLLOW_SEVEN_in_spelled_1_to_311902); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEVEN.add(SEVEN126);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 200:16: -> INT[\"7\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "7"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 8 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:201:5: EIGHT
                    {
                    EIGHT127=(Token)match(input,EIGHT,FOLLOW_EIGHT_in_spelled_1_to_311918); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EIGHT.add(EIGHT127);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 201:16: -> INT[\"8\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "8"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 9 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:202:5: NINE
                    {
                    NINE128=(Token)match(input,NINE,FOLLOW_NINE_in_spelled_1_to_311934); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NINE.add(NINE128);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 202:16: -> INT[\"9\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "9"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 10 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:203:5: TEN
                    {
                    TEN129=(Token)match(input,TEN,FOLLOW_TEN_in_spelled_1_to_311951); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TEN.add(TEN129);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 203:16: -> INT[\"10\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "10"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 11 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:204:5: ELEVEN
                    {
                    ELEVEN130=(Token)match(input,ELEVEN,FOLLOW_ELEVEN_in_spelled_1_to_311969); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ELEVEN.add(ELEVEN130);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 204:16: -> INT[\"11\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "11"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 12 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:205:5: TWELVE
                    {
                    TWELVE131=(Token)match(input,TWELVE,FOLLOW_TWELVE_in_spelled_1_to_311984); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWELVE.add(TWELVE131);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 205:16: -> INT[\"12\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "12"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 13 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:206:5: THIRTEEN
                    {
                    THIRTEEN132=(Token)match(input,THIRTEEN,FOLLOW_THIRTEEN_in_spelled_1_to_311999); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THIRTEEN.add(THIRTEEN132);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 206:16: -> INT[\"13\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "13"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 14 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:207:5: FOURTEEN
                    {
                    FOURTEEN133=(Token)match(input,FOURTEEN,FOLLOW_FOURTEEN_in_spelled_1_to_312012); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FOURTEEN.add(FOURTEEN133);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 207:16: -> INT[\"14\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "14"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 15 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:208:5: FIFTEEN
                    {
                    FIFTEEN134=(Token)match(input,FIFTEEN,FOLLOW_FIFTEEN_in_spelled_1_to_312025); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FIFTEEN.add(FIFTEEN134);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 208:16: -> INT[\"15\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "15"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 16 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:209:5: SIXTEEN
                    {
                    SIXTEEN135=(Token)match(input,SIXTEEN,FOLLOW_SIXTEEN_in_spelled_1_to_312039); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SIXTEEN.add(SIXTEEN135);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 209:16: -> INT[\"16\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "16"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 17 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:210:5: SEVENTEEN
                    {
                    SEVENTEEN136=(Token)match(input,SEVENTEEN,FOLLOW_SEVENTEEN_in_spelled_1_to_312053); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEVENTEEN.add(SEVENTEEN136);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 210:16: -> INT[\"17\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "17"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 18 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:211:5: EIGHTEEN
                    {
                    EIGHTEEN137=(Token)match(input,EIGHTEEN,FOLLOW_EIGHTEEN_in_spelled_1_to_312065); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EIGHTEEN.add(EIGHTEEN137);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 211:16: -> INT[\"18\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "18"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 19 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:212:5: NINETEEN
                    {
                    NINETEEN138=(Token)match(input,NINETEEN,FOLLOW_NINETEEN_in_spelled_1_to_312078); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NINETEEN.add(NINETEEN138);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 212:16: -> INT[\"19\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "19"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 20 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:213:5: TWENTY
                    {
                    TWENTY139=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_1_to_312091); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY139);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 213:16: -> INT[\"20\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "20"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 21 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:214:5: TWENTY ( DASH )? ONE
                    {
                    TWENTY140=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_1_to_312106); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY140);

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:214:12: ( DASH )?
                    int alt40=2;
                    int LA40_0 = input.LA(1);

                    if ( (LA40_0==DASH) ) {
                        alt40=1;
                    }
                    switch (alt40) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:214:12: DASH
                            {
                            DASH141=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_1_to_312108); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_DASH.add(DASH141);


                            }
                            break;

                    }

                    ONE142=(Token)match(input,ONE,FOLLOW_ONE_in_spelled_1_to_312111); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ONE.add(ONE142);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 214:24: -> INT[\"21\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "21"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 22 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:215:5: TWENTY ( DASH )? TWO
                    {
                    TWENTY143=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_1_to_312124); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY143);

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:215:12: ( DASH )?
                    int alt41=2;
                    int LA41_0 = input.LA(1);

                    if ( (LA41_0==DASH) ) {
                        alt41=1;
                    }
                    switch (alt41) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:215:12: DASH
                            {
                            DASH144=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_1_to_312126); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_DASH.add(DASH144);


                            }
                            break;

                    }

                    TWO145=(Token)match(input,TWO,FOLLOW_TWO_in_spelled_1_to_312129); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWO.add(TWO145);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 215:24: -> INT[\"22\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "22"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 23 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:216:5: TWENTY ( DASH )? THREE
                    {
                    TWENTY146=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_1_to_312142); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY146);

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:216:12: ( DASH )?
                    int alt42=2;
                    int LA42_0 = input.LA(1);

                    if ( (LA42_0==DASH) ) {
                        alt42=1;
                    }
                    switch (alt42) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:216:12: DASH
                            {
                            DASH147=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_1_to_312144); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_DASH.add(DASH147);


                            }
                            break;

                    }

                    THREE148=(Token)match(input,THREE,FOLLOW_THREE_in_spelled_1_to_312147); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THREE.add(THREE148);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 216:24: -> INT[\"23\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "23"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 24 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:217:5: TWENTY ( DASH )? FOUR
                    {
                    TWENTY149=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_1_to_312158); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY149);

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:217:12: ( DASH )?
                    int alt43=2;
                    int LA43_0 = input.LA(1);

                    if ( (LA43_0==DASH) ) {
                        alt43=1;
                    }
                    switch (alt43) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:217:12: DASH
                            {
                            DASH150=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_1_to_312160); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_DASH.add(DASH150);


                            }
                            break;

                    }

                    FOUR151=(Token)match(input,FOUR,FOLLOW_FOUR_in_spelled_1_to_312163); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FOUR.add(FOUR151);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 217:24: -> INT[\"24\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "24"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 25 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:218:5: TWENTY ( DASH )? FIVE
                    {
                    TWENTY152=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_1_to_312175); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY152);

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:218:12: ( DASH )?
                    int alt44=2;
                    int LA44_0 = input.LA(1);

                    if ( (LA44_0==DASH) ) {
                        alt44=1;
                    }
                    switch (alt44) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:218:12: DASH
                            {
                            DASH153=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_1_to_312177); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_DASH.add(DASH153);


                            }
                            break;

                    }

                    FIVE154=(Token)match(input,FIVE,FOLLOW_FIVE_in_spelled_1_to_312180); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FIVE.add(FIVE154);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 218:24: -> INT[\"25\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "25"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 26 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:219:5: TWENTY ( DASH )? SIX
                    {
                    TWENTY155=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_1_to_312192); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY155);

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:219:12: ( DASH )?
                    int alt45=2;
                    int LA45_0 = input.LA(1);

                    if ( (LA45_0==DASH) ) {
                        alt45=1;
                    }
                    switch (alt45) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:219:12: DASH
                            {
                            DASH156=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_1_to_312194); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_DASH.add(DASH156);


                            }
                            break;

                    }

                    SIX157=(Token)match(input,SIX,FOLLOW_SIX_in_spelled_1_to_312197); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SIX.add(SIX157);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 219:24: -> INT[\"26\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "26"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 27 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:220:5: TWENTY ( DASH )? SEVEN
                    {
                    TWENTY158=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_1_to_312210); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY158);

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:220:12: ( DASH )?
                    int alt46=2;
                    int LA46_0 = input.LA(1);

                    if ( (LA46_0==DASH) ) {
                        alt46=1;
                    }
                    switch (alt46) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:220:12: DASH
                            {
                            DASH159=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_1_to_312212); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_DASH.add(DASH159);


                            }
                            break;

                    }

                    SEVEN160=(Token)match(input,SEVEN,FOLLOW_SEVEN_in_spelled_1_to_312215); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEVEN.add(SEVEN160);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 220:24: -> INT[\"27\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "27"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 28 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:221:5: TWENTY ( DASH )? EIGHT
                    {
                    TWENTY161=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_1_to_312226); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY161);

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:221:12: ( DASH )?
                    int alt47=2;
                    int LA47_0 = input.LA(1);

                    if ( (LA47_0==DASH) ) {
                        alt47=1;
                    }
                    switch (alt47) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:221:12: DASH
                            {
                            DASH162=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_1_to_312228); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_DASH.add(DASH162);


                            }
                            break;

                    }

                    EIGHT163=(Token)match(input,EIGHT,FOLLOW_EIGHT_in_spelled_1_to_312231); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EIGHT.add(EIGHT163);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 221:24: -> INT[\"28\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "28"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 29 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:222:5: TWENTY ( DASH )? NINE
                    {
                    TWENTY164=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_1_to_312242); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY164);

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:222:12: ( DASH )?
                    int alt48=2;
                    int LA48_0 = input.LA(1);

                    if ( (LA48_0==DASH) ) {
                        alt48=1;
                    }
                    switch (alt48) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:222:12: DASH
                            {
                            DASH165=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_1_to_312244); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_DASH.add(DASH165);


                            }
                            break;

                    }

                    NINE166=(Token)match(input,NINE,FOLLOW_NINE_in_spelled_1_to_312247); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NINE.add(NINE166);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 222:24: -> INT[\"29\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "29"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 30 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:223:5: THIRTY
                    {
                    THIRTY167=(Token)match(input,THIRTY,FOLLOW_THIRTY_in_spelled_1_to_312259); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THIRTY.add(THIRTY167);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 223:24: -> INT[\"30\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, "30"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 31 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:224:5: THIRTY ( DASH )? ONE
                    {
                    THIRTY168=(Token)match(input,THIRTY,FOLLOW_THIRTY_in_spelled_1_to_312282); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THIRTY.add(THIRTY168);

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:224:12: ( DASH )?
                    int alt49=2;
                    int LA49_0 = input.LA(1);

                    if ( (LA49_0==DASH) ) {
                        alt49=1;
                    }
                    switch (alt49) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:224:12: DASH
                            {
                            DASH169=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_1_to_312284); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_DASH.add(DASH169);


                            }
                            break;

                    }

                    ONE170=(Token)match(input,ONE,FOLLOW_ONE_in_spelled_1_to_312287); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ONE.add(ONE170);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 224:24: -> INT[\"31\"]
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
    // $ANTLR end "spelled_1_to_31"

    public static class spelled_or_int_1_to_31_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "spelled_or_int_1_to_31"
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:227:1: spelled_or_int_1_to_31 : ( spelled_1_to_31 | int_1_to_31 );
    public final DateParser.spelled_or_int_1_to_31_return spelled_or_int_1_to_31() throws RecognitionException {
        DateParser.spelled_or_int_1_to_31_return retval = new DateParser.spelled_or_int_1_to_31_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        DateParser.spelled_1_to_31_return spelled_1_to_31171 = null;

        DateParser.int_1_to_31_return int_1_to_31172 = null;



        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:228:3: ( spelled_1_to_31 | int_1_to_31 )
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( ((LA51_0>=ONE && LA51_0<=THIRTY)) ) {
                alt51=1;
            }
            else if ( ((LA51_0>=PREFIXED_ONE_TO_NINE && LA51_0<=TWENTY_FOUR_TO_THIRTY_ONE)) ) {
                alt51=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }
            switch (alt51) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:228:5: spelled_1_to_31
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_spelled_1_to_31_in_spelled_or_int_1_to_312309);
                    spelled_1_to_31171=spelled_1_to_31();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, spelled_1_to_31171.getTree());

                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:229:5: int_1_to_31
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_int_1_to_31_in_spelled_or_int_1_to_312315);
                    int_1_to_31172=int_1_to_31();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, int_1_to_31172.getTree());

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

        Token FIRST173=null;
        Token SECOND174=null;
        Token THIRD175=null;
        Token FOURTH176=null;
        Token FIFTH177=null;
        Token SIXTH178=null;
        Token SEVENTH179=null;
        Token EIGHTH180=null;
        Token NINTH181=null;
        Token TENTH182=null;
        Token ELEVENTH183=null;
        Token TWELFTH184=null;
        Token THIRTEENTH185=null;
        Token FOURTEENTH186=null;
        Token FIFTEENTH187=null;
        Token SIXTEENTH188=null;
        Token SEVENTEENTH189=null;
        Token EIGHTEENTH190=null;
        Token NINETEENTH191=null;
        Token TWENTIETH192=null;
        Token TWENTY_FIRST193=null;
        Token TWENTY194=null;
        Token DASH195=null;
        Token FIRST196=null;
        Token TWENTY_SECOND197=null;
        Token TWENTY198=null;
        Token DASH199=null;
        Token SECOND200=null;
        Token TWENTY_THIRD201=null;
        Token TWENTY202=null;
        Token DASH203=null;
        Token THIRD204=null;
        Token TWENTY_FOURTH205=null;
        Token TWENTY206=null;
        Token DASH207=null;
        Token FOURTH208=null;
        Token TWENTY_FIFTH209=null;
        Token TWENTY210=null;
        Token DASH211=null;
        Token FIFTH212=null;
        Token TWENTY_SIXTH213=null;
        Token TWENTY214=null;
        Token DASH215=null;
        Token SIXTH216=null;
        Token TWENTY_SEVENTH217=null;
        Token TWENTY218=null;
        Token DASH219=null;
        Token SEVENTH220=null;
        Token TWENTY_EIGHTH221=null;
        Token TWENTY222=null;
        Token DASH223=null;
        Token EIGHTH224=null;
        Token TWENTY_NINTH225=null;
        Token TWENTY226=null;
        Token DASH227=null;
        Token NINTH228=null;
        Token THIRTIETH229=null;
        Token THIRTY_FIRST230=null;
        Token THIRTY231=null;
        Token DASH232=null;
        Token FIRST233=null;

        Object FIRST173_tree=null;
        Object SECOND174_tree=null;
        Object THIRD175_tree=null;
        Object FOURTH176_tree=null;
        Object FIFTH177_tree=null;
        Object SIXTH178_tree=null;
        Object SEVENTH179_tree=null;
        Object EIGHTH180_tree=null;
        Object NINTH181_tree=null;
        Object TENTH182_tree=null;
        Object ELEVENTH183_tree=null;
        Object TWELFTH184_tree=null;
        Object THIRTEENTH185_tree=null;
        Object FOURTEENTH186_tree=null;
        Object FIFTEENTH187_tree=null;
        Object SIXTEENTH188_tree=null;
        Object SEVENTEENTH189_tree=null;
        Object EIGHTEENTH190_tree=null;
        Object NINETEENTH191_tree=null;
        Object TWENTIETH192_tree=null;
        Object TWENTY_FIRST193_tree=null;
        Object TWENTY194_tree=null;
        Object DASH195_tree=null;
        Object FIRST196_tree=null;
        Object TWENTY_SECOND197_tree=null;
        Object TWENTY198_tree=null;
        Object DASH199_tree=null;
        Object SECOND200_tree=null;
        Object TWENTY_THIRD201_tree=null;
        Object TWENTY202_tree=null;
        Object DASH203_tree=null;
        Object THIRD204_tree=null;
        Object TWENTY_FOURTH205_tree=null;
        Object TWENTY206_tree=null;
        Object DASH207_tree=null;
        Object FOURTH208_tree=null;
        Object TWENTY_FIFTH209_tree=null;
        Object TWENTY210_tree=null;
        Object DASH211_tree=null;
        Object FIFTH212_tree=null;
        Object TWENTY_SIXTH213_tree=null;
        Object TWENTY214_tree=null;
        Object DASH215_tree=null;
        Object SIXTH216_tree=null;
        Object TWENTY_SEVENTH217_tree=null;
        Object TWENTY218_tree=null;
        Object DASH219_tree=null;
        Object SEVENTH220_tree=null;
        Object TWENTY_EIGHTH221_tree=null;
        Object TWENTY222_tree=null;
        Object DASH223_tree=null;
        Object EIGHTH224_tree=null;
        Object TWENTY_NINTH225_tree=null;
        Object TWENTY226_tree=null;
        Object DASH227_tree=null;
        Object NINTH228_tree=null;
        Object THIRTIETH229_tree=null;
        Object THIRTY_FIRST230_tree=null;
        Object THIRTY231_tree=null;
        Object DASH232_tree=null;
        Object FIRST233_tree=null;
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
            int alt72=31;
            alt72 = dfa72.predict(input);
            switch (alt72) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:235:5: FIRST
                    {
                    FIRST173=(Token)match(input,FIRST,FOLLOW_FIRST_in_spelled_sequence_1_to_312332); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FIRST.add(FIRST173);



                    // AST REWRITE
                    // elements: 
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
                    SECOND174=(Token)match(input,SECOND,FOLLOW_SECOND_in_spelled_sequence_1_to_312349); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SECOND.add(SECOND174);



                    // AST REWRITE
                    // elements: 
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
                    THIRD175=(Token)match(input,THIRD,FOLLOW_THIRD_in_spelled_sequence_1_to_312365); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THIRD.add(THIRD175);



                    // AST REWRITE
                    // elements: 
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
                    FOURTH176=(Token)match(input,FOURTH,FOLLOW_FOURTH_in_spelled_sequence_1_to_312382); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FOURTH.add(FOURTH176);



                    // AST REWRITE
                    // elements: 
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
                    FIFTH177=(Token)match(input,FIFTH,FOLLOW_FIFTH_in_spelled_sequence_1_to_312398); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FIFTH.add(FIFTH177);



                    // AST REWRITE
                    // elements: 
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
                    SIXTH178=(Token)match(input,SIXTH,FOLLOW_SIXTH_in_spelled_sequence_1_to_312415); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SIXTH.add(SIXTH178);



                    // AST REWRITE
                    // elements: 
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
                    SEVENTH179=(Token)match(input,SEVENTH,FOLLOW_SEVENTH_in_spelled_sequence_1_to_312432); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEVENTH.add(SEVENTH179);



                    // AST REWRITE
                    // elements: 
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
                    EIGHTH180=(Token)match(input,EIGHTH,FOLLOW_EIGHTH_in_spelled_sequence_1_to_312447); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EIGHTH.add(EIGHTH180);



                    // AST REWRITE
                    // elements: 
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
                    NINTH181=(Token)match(input,NINTH,FOLLOW_NINTH_in_spelled_sequence_1_to_312463); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NINTH.add(NINTH181);



                    // AST REWRITE
                    // elements: 
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
                    TENTH182=(Token)match(input,TENTH,FOLLOW_TENTH_in_spelled_sequence_1_to_312480); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TENTH.add(TENTH182);



                    // AST REWRITE
                    // elements: 
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
                    ELEVENTH183=(Token)match(input,ELEVENTH,FOLLOW_ELEVENTH_in_spelled_sequence_1_to_312497); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ELEVENTH.add(ELEVENTH183);



                    // AST REWRITE
                    // elements: 
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
                    TWELFTH184=(Token)match(input,TWELFTH,FOLLOW_TWELFTH_in_spelled_sequence_1_to_312511); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWELFTH.add(TWELFTH184);



                    // AST REWRITE
                    // elements: 
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
                    THIRTEENTH185=(Token)match(input,THIRTEENTH,FOLLOW_THIRTEENTH_in_spelled_sequence_1_to_312526); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THIRTEENTH.add(THIRTEENTH185);



                    // AST REWRITE
                    // elements: 
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
                    FOURTEENTH186=(Token)match(input,FOURTEENTH,FOLLOW_FOURTEENTH_in_spelled_sequence_1_to_312538); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FOURTEENTH.add(FOURTEENTH186);



                    // AST REWRITE
                    // elements: 
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
                    FIFTEENTH187=(Token)match(input,FIFTEENTH,FOLLOW_FIFTEENTH_in_spelled_sequence_1_to_312550); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FIFTEENTH.add(FIFTEENTH187);



                    // AST REWRITE
                    // elements: 
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
                    SIXTEENTH188=(Token)match(input,SIXTEENTH,FOLLOW_SIXTEENTH_in_spelled_sequence_1_to_312563); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SIXTEENTH.add(SIXTEENTH188);



                    // AST REWRITE
                    // elements: 
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
                    SEVENTEENTH189=(Token)match(input,SEVENTEENTH,FOLLOW_SEVENTEENTH_in_spelled_sequence_1_to_312576); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEVENTEENTH.add(SEVENTEENTH189);



                    // AST REWRITE
                    // elements: 
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
                    EIGHTEENTH190=(Token)match(input,EIGHTEENTH,FOLLOW_EIGHTEENTH_in_spelled_sequence_1_to_312587); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EIGHTEENTH.add(EIGHTEENTH190);



                    // AST REWRITE
                    // elements: 
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
                    NINETEENTH191=(Token)match(input,NINETEENTH,FOLLOW_NINETEENTH_in_spelled_sequence_1_to_312599); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NINETEENTH.add(NINETEENTH191);



                    // AST REWRITE
                    // elements: 
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
                    TWENTIETH192=(Token)match(input,TWENTIETH,FOLLOW_TWENTIETH_in_spelled_sequence_1_to_312611); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWENTIETH.add(TWENTIETH192);



                    // AST REWRITE
                    // elements: 
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
                    int alt53=2;
                    int LA53_0 = input.LA(1);

                    if ( (LA53_0==TWENTY_FIRST) ) {
                        alt53=1;
                    }
                    else if ( (LA53_0==TWENTY) ) {
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
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:255:6: TWENTY_FIRST
                            {
                            TWENTY_FIRST193=(Token)match(input,TWENTY_FIRST,FOLLOW_TWENTY_FIRST_in_spelled_sequence_1_to_312625); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY_FIRST.add(TWENTY_FIRST193);


                            }
                            break;
                        case 2 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:255:23: ( TWENTY ( DASH )? FIRST )
                            {
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:255:23: ( TWENTY ( DASH )? FIRST )
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:255:24: TWENTY ( DASH )? FIRST
                            {
                            TWENTY194=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_sequence_1_to_312632); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY194);

                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:255:31: ( DASH )?
                            int alt52=2;
                            int LA52_0 = input.LA(1);

                            if ( (LA52_0==DASH) ) {
                                alt52=1;
                            }
                            switch (alt52) {
                                case 1 :
                                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:255:31: DASH
                                    {
                                    DASH195=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_sequence_1_to_312634); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_DASH.add(DASH195);


                                    }
                                    break;

                            }

                            FIRST196=(Token)match(input,FIRST,FOLLOW_FIRST_in_spelled_sequence_1_to_312637); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_FIRST.add(FIRST196);


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
                    int alt55=2;
                    int LA55_0 = input.LA(1);

                    if ( (LA55_0==TWENTY_SECOND) ) {
                        alt55=1;
                    }
                    else if ( (LA55_0==TWENTY) ) {
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
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:256:6: TWENTY_SECOND
                            {
                            TWENTY_SECOND197=(Token)match(input,TWENTY_SECOND,FOLLOW_TWENTY_SECOND_in_spelled_sequence_1_to_312653); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY_SECOND.add(TWENTY_SECOND197);


                            }
                            break;
                        case 2 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:256:23: ( TWENTY ( DASH )? SECOND )
                            {
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:256:23: ( TWENTY ( DASH )? SECOND )
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:256:24: TWENTY ( DASH )? SECOND
                            {
                            TWENTY198=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_sequence_1_to_312659); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY198);

                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:256:31: ( DASH )?
                            int alt54=2;
                            int LA54_0 = input.LA(1);

                            if ( (LA54_0==DASH) ) {
                                alt54=1;
                            }
                            switch (alt54) {
                                case 1 :
                                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:256:31: DASH
                                    {
                                    DASH199=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_sequence_1_to_312661); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_DASH.add(DASH199);


                                    }
                                    break;

                            }

                            SECOND200=(Token)match(input,SECOND,FOLLOW_SECOND_in_spelled_sequence_1_to_312664); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_SECOND.add(SECOND200);


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
                    int alt57=2;
                    int LA57_0 = input.LA(1);

                    if ( (LA57_0==TWENTY_THIRD) ) {
                        alt57=1;
                    }
                    else if ( (LA57_0==TWENTY) ) {
                        alt57=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 57, 0, input);

                        throw nvae;
                    }
                    switch (alt57) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:257:6: TWENTY_THIRD
                            {
                            TWENTY_THIRD201=(Token)match(input,TWENTY_THIRD,FOLLOW_TWENTY_THIRD_in_spelled_sequence_1_to_312679); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY_THIRD.add(TWENTY_THIRD201);


                            }
                            break;
                        case 2 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:257:23: ( TWENTY ( DASH )? THIRD )
                            {
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:257:23: ( TWENTY ( DASH )? THIRD )
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:257:24: TWENTY ( DASH )? THIRD
                            {
                            TWENTY202=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_sequence_1_to_312686); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY202);

                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:257:31: ( DASH )?
                            int alt56=2;
                            int LA56_0 = input.LA(1);

                            if ( (LA56_0==DASH) ) {
                                alt56=1;
                            }
                            switch (alt56) {
                                case 1 :
                                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:257:31: DASH
                                    {
                                    DASH203=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_sequence_1_to_312688); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_DASH.add(DASH203);


                                    }
                                    break;

                            }

                            THIRD204=(Token)match(input,THIRD,FOLLOW_THIRD_in_spelled_sequence_1_to_312691); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_THIRD.add(THIRD204);


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
                    int alt59=2;
                    int LA59_0 = input.LA(1);

                    if ( (LA59_0==TWENTY_FOURTH) ) {
                        alt59=1;
                    }
                    else if ( (LA59_0==TWENTY) ) {
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
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:258:6: TWENTY_FOURTH
                            {
                            TWENTY_FOURTH205=(Token)match(input,TWENTY_FOURTH,FOLLOW_TWENTY_FOURTH_in_spelled_sequence_1_to_312707); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY_FOURTH.add(TWENTY_FOURTH205);


                            }
                            break;
                        case 2 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:258:23: ( TWENTY ( DASH )? FOURTH )
                            {
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:258:23: ( TWENTY ( DASH )? FOURTH )
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:258:24: TWENTY ( DASH )? FOURTH
                            {
                            TWENTY206=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_sequence_1_to_312713); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY206);

                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:258:31: ( DASH )?
                            int alt58=2;
                            int LA58_0 = input.LA(1);

                            if ( (LA58_0==DASH) ) {
                                alt58=1;
                            }
                            switch (alt58) {
                                case 1 :
                                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:258:31: DASH
                                    {
                                    DASH207=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_sequence_1_to_312715); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_DASH.add(DASH207);


                                    }
                                    break;

                            }

                            FOURTH208=(Token)match(input,FOURTH,FOLLOW_FOURTH_in_spelled_sequence_1_to_312718); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_FOURTH.add(FOURTH208);


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
                    int alt61=2;
                    int LA61_0 = input.LA(1);

                    if ( (LA61_0==TWENTY_FIFTH) ) {
                        alt61=1;
                    }
                    else if ( (LA61_0==TWENTY) ) {
                        alt61=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 61, 0, input);

                        throw nvae;
                    }
                    switch (alt61) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:259:6: TWENTY_FIFTH
                            {
                            TWENTY_FIFTH209=(Token)match(input,TWENTY_FIFTH,FOLLOW_TWENTY_FIFTH_in_spelled_sequence_1_to_312733); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY_FIFTH.add(TWENTY_FIFTH209);


                            }
                            break;
                        case 2 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:259:23: ( TWENTY ( DASH )? FIFTH )
                            {
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:259:23: ( TWENTY ( DASH )? FIFTH )
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:259:24: TWENTY ( DASH )? FIFTH
                            {
                            TWENTY210=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_sequence_1_to_312740); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY210);

                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:259:31: ( DASH )?
                            int alt60=2;
                            int LA60_0 = input.LA(1);

                            if ( (LA60_0==DASH) ) {
                                alt60=1;
                            }
                            switch (alt60) {
                                case 1 :
                                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:259:31: DASH
                                    {
                                    DASH211=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_sequence_1_to_312742); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_DASH.add(DASH211);


                                    }
                                    break;

                            }

                            FIFTH212=(Token)match(input,FIFTH,FOLLOW_FIFTH_in_spelled_sequence_1_to_312745); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_FIFTH.add(FIFTH212);


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
                    int alt63=2;
                    int LA63_0 = input.LA(1);

                    if ( (LA63_0==TWENTY_SIXTH) ) {
                        alt63=1;
                    }
                    else if ( (LA63_0==TWENTY) ) {
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
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:260:6: TWENTY_SIXTH
                            {
                            TWENTY_SIXTH213=(Token)match(input,TWENTY_SIXTH,FOLLOW_TWENTY_SIXTH_in_spelled_sequence_1_to_312761); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY_SIXTH.add(TWENTY_SIXTH213);


                            }
                            break;
                        case 2 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:260:23: ( TWENTY ( DASH )? SIXTH )
                            {
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:260:23: ( TWENTY ( DASH )? SIXTH )
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:260:24: TWENTY ( DASH )? SIXTH
                            {
                            TWENTY214=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_sequence_1_to_312768); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY214);

                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:260:31: ( DASH )?
                            int alt62=2;
                            int LA62_0 = input.LA(1);

                            if ( (LA62_0==DASH) ) {
                                alt62=1;
                            }
                            switch (alt62) {
                                case 1 :
                                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:260:31: DASH
                                    {
                                    DASH215=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_sequence_1_to_312770); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_DASH.add(DASH215);


                                    }
                                    break;

                            }

                            SIXTH216=(Token)match(input,SIXTH,FOLLOW_SIXTH_in_spelled_sequence_1_to_312773); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_SIXTH.add(SIXTH216);


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
                    int alt65=2;
                    int LA65_0 = input.LA(1);

                    if ( (LA65_0==TWENTY_SEVENTH) ) {
                        alt65=1;
                    }
                    else if ( (LA65_0==TWENTY) ) {
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
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:261:6: TWENTY_SEVENTH
                            {
                            TWENTY_SEVENTH217=(Token)match(input,TWENTY_SEVENTH,FOLLOW_TWENTY_SEVENTH_in_spelled_sequence_1_to_312789); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY_SEVENTH.add(TWENTY_SEVENTH217);


                            }
                            break;
                        case 2 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:261:23: ( TWENTY ( DASH )? SEVENTH )
                            {
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:261:23: ( TWENTY ( DASH )? SEVENTH )
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:261:24: TWENTY ( DASH )? SEVENTH
                            {
                            TWENTY218=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_sequence_1_to_312794); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY218);

                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:261:31: ( DASH )?
                            int alt64=2;
                            int LA64_0 = input.LA(1);

                            if ( (LA64_0==DASH) ) {
                                alt64=1;
                            }
                            switch (alt64) {
                                case 1 :
                                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:261:31: DASH
                                    {
                                    DASH219=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_sequence_1_to_312796); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_DASH.add(DASH219);


                                    }
                                    break;

                            }

                            SEVENTH220=(Token)match(input,SEVENTH,FOLLOW_SEVENTH_in_spelled_sequence_1_to_312799); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_SEVENTH.add(SEVENTH220);


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
                    int alt67=2;
                    int LA67_0 = input.LA(1);

                    if ( (LA67_0==TWENTY_EIGHTH) ) {
                        alt67=1;
                    }
                    else if ( (LA67_0==TWENTY) ) {
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
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:262:6: TWENTY_EIGHTH
                            {
                            TWENTY_EIGHTH221=(Token)match(input,TWENTY_EIGHTH,FOLLOW_TWENTY_EIGHTH_in_spelled_sequence_1_to_312813); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY_EIGHTH.add(TWENTY_EIGHTH221);


                            }
                            break;
                        case 2 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:262:23: ( TWENTY ( DASH )? EIGHTH )
                            {
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:262:23: ( TWENTY ( DASH )? EIGHTH )
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:262:24: TWENTY ( DASH )? EIGHTH
                            {
                            TWENTY222=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_sequence_1_to_312819); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY222);

                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:262:31: ( DASH )?
                            int alt66=2;
                            int LA66_0 = input.LA(1);

                            if ( (LA66_0==DASH) ) {
                                alt66=1;
                            }
                            switch (alt66) {
                                case 1 :
                                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:262:31: DASH
                                    {
                                    DASH223=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_sequence_1_to_312821); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_DASH.add(DASH223);


                                    }
                                    break;

                            }

                            EIGHTH224=(Token)match(input,EIGHTH,FOLLOW_EIGHTH_in_spelled_sequence_1_to_312824); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_EIGHTH.add(EIGHTH224);


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
                    int alt69=2;
                    int LA69_0 = input.LA(1);

                    if ( (LA69_0==TWENTY_NINTH) ) {
                        alt69=1;
                    }
                    else if ( (LA69_0==TWENTY) ) {
                        alt69=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 69, 0, input);

                        throw nvae;
                    }
                    switch (alt69) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:263:6: TWENTY_NINTH
                            {
                            TWENTY_NINTH225=(Token)match(input,TWENTY_NINTH,FOLLOW_TWENTY_NINTH_in_spelled_sequence_1_to_312839); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY_NINTH.add(TWENTY_NINTH225);


                            }
                            break;
                        case 2 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:263:23: ( TWENTY ( DASH )? NINTH )
                            {
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:263:23: ( TWENTY ( DASH )? NINTH )
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:263:24: TWENTY ( DASH )? NINTH
                            {
                            TWENTY226=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_sequence_1_to_312846); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY226);

                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:263:31: ( DASH )?
                            int alt68=2;
                            int LA68_0 = input.LA(1);

                            if ( (LA68_0==DASH) ) {
                                alt68=1;
                            }
                            switch (alt68) {
                                case 1 :
                                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:263:31: DASH
                                    {
                                    DASH227=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_sequence_1_to_312848); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_DASH.add(DASH227);


                                    }
                                    break;

                            }

                            NINTH228=(Token)match(input,NINTH,FOLLOW_NINTH_in_spelled_sequence_1_to_312851); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NINTH.add(NINTH228);


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
                    THIRTIETH229=(Token)match(input,THIRTIETH,FOLLOW_THIRTIETH_in_spelled_sequence_1_to_312866); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THIRTIETH.add(THIRTIETH229);



                    // AST REWRITE
                    // elements: 
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
                    int alt71=2;
                    int LA71_0 = input.LA(1);

                    if ( (LA71_0==THIRTY_FIRST) ) {
                        alt71=1;
                    }
                    else if ( (LA71_0==THIRTY) ) {
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
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:265:6: THIRTY_FIRST
                            {
                            THIRTY_FIRST230=(Token)match(input,THIRTY_FIRST,FOLLOW_THIRTY_FIRST_in_spelled_sequence_1_to_312910); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_THIRTY_FIRST.add(THIRTY_FIRST230);


                            }
                            break;
                        case 2 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:265:23: ( THIRTY ( DASH )? FIRST )
                            {
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:265:23: ( THIRTY ( DASH )? FIRST )
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:265:24: THIRTY ( DASH )? FIRST
                            {
                            THIRTY231=(Token)match(input,THIRTY,FOLLOW_THIRTY_in_spelled_sequence_1_to_312917); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_THIRTY.add(THIRTY231);

                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:265:31: ( DASH )?
                            int alt70=2;
                            int LA70_0 = input.LA(1);

                            if ( (LA70_0==DASH) ) {
                                alt70=1;
                            }
                            switch (alt70) {
                                case 1 :
                                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:265:31: DASH
                                    {
                                    DASH232=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_sequence_1_to_312919); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_DASH.add(DASH232);


                                    }
                                    break;

                            }

                            FIRST233=(Token)match(input,FIRST,FOLLOW_FIRST_in_spelled_sequence_1_to_312922); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_FIRST.add(FIRST233);


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
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:269:1: int_up_to_4_digits : ( int_0_to_99_with_prefix | THREE_DIGIT -> INT[$THREE_DIGIT.text] | FOUR_DIGIT -> INT[$FOUR_DIGIT.text] );
    public final DateParser.int_up_to_4_digits_return int_up_to_4_digits() throws RecognitionException {
        DateParser.int_up_to_4_digits_return retval = new DateParser.int_up_to_4_digits_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token THREE_DIGIT235=null;
        Token FOUR_DIGIT236=null;
        DateParser.int_0_to_99_with_prefix_return int_0_to_99_with_prefix234 = null;


        Object THREE_DIGIT235_tree=null;
        Object FOUR_DIGIT236_tree=null;
        RewriteRuleTokenStream stream_FOUR_DIGIT=new RewriteRuleTokenStream(adaptor,"token FOUR_DIGIT");
        RewriteRuleTokenStream stream_THREE_DIGIT=new RewriteRuleTokenStream(adaptor,"token THREE_DIGIT");

        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:270:3: ( int_0_to_99_with_prefix | THREE_DIGIT -> INT[$THREE_DIGIT.text] | FOUR_DIGIT -> INT[$FOUR_DIGIT.text] )
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
            case THREE_DIGIT:
                {
                alt73=2;
                }
                break;
            case FOUR_DIGIT:
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:270:5: int_0_to_99_with_prefix
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_int_0_to_99_with_prefix_in_int_up_to_4_digits2947);
                    int_0_to_99_with_prefix234=int_0_to_99_with_prefix();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, int_0_to_99_with_prefix234.getTree());

                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:271:5: THREE_DIGIT
                    {
                    THREE_DIGIT235=(Token)match(input,THREE_DIGIT,FOLLOW_THREE_DIGIT_in_int_up_to_4_digits2953); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THREE_DIGIT.add(THREE_DIGIT235);



                    // AST REWRITE
                    // elements: 
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
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, (THREE_DIGIT235!=null?THREE_DIGIT235.getText():null)));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:272:5: FOUR_DIGIT
                    {
                    FOUR_DIGIT236=(Token)match(input,FOUR_DIGIT,FOLLOW_FOUR_DIGIT_in_int_up_to_4_digits2964); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FOUR_DIGIT.add(FOUR_DIGIT236);



                    // AST REWRITE
                    // elements: 
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
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, (FOUR_DIGIT236!=null?FOUR_DIGIT236.getText():null)));

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

        Token THREE_DIGIT237=null;
        Token FOUR_DIGIT238=null;

        Object THREE_DIGIT237_tree=null;
        Object FOUR_DIGIT238_tree=null;
        RewriteRuleTokenStream stream_FOUR_DIGIT=new RewriteRuleTokenStream(adaptor,"token FOUR_DIGIT");
        RewriteRuleTokenStream stream_THREE_DIGIT=new RewriteRuleTokenStream(adaptor,"token THREE_DIGIT");

        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:277:3: ( THREE_DIGIT -> INT[$THREE_DIGIT.text] | FOUR_DIGIT -> INT[$FOUR_DIGIT.text] )
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==THREE_DIGIT) ) {
                alt74=1;
            }
            else if ( (LA74_0==FOUR_DIGIT) ) {
                alt74=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 74, 0, input);

                throw nvae;
            }
            switch (alt74) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:277:5: THREE_DIGIT
                    {
                    THREE_DIGIT237=(Token)match(input,THREE_DIGIT,FOLLOW_THREE_DIGIT_in_int_3_or_4_digits2986); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THREE_DIGIT.add(THREE_DIGIT237);



                    // AST REWRITE
                    // elements: 
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
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, (THREE_DIGIT237!=null?THREE_DIGIT237.getText():null)));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:278:5: FOUR_DIGIT
                    {
                    FOUR_DIGIT238=(Token)match(input,FOUR_DIGIT,FOLLOW_FOUR_DIGIT_in_int_3_or_4_digits2997); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FOUR_DIGIT.add(FOUR_DIGIT238);



                    // AST REWRITE
                    // elements: 
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
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, (FOUR_DIGIT238!=null?FOUR_DIGIT238.getText():null)));

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

        Token FOUR_DIGIT239=null;

        Object FOUR_DIGIT239_tree=null;
        RewriteRuleTokenStream stream_FOUR_DIGIT=new RewriteRuleTokenStream(adaptor,"token FOUR_DIGIT");

        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:283:3: ( FOUR_DIGIT -> INT[$FOUR_DIGIT.text] )
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:283:5: FOUR_DIGIT
            {
            FOUR_DIGIT239=(Token)match(input,FOUR_DIGIT,FOLLOW_FOUR_DIGIT_in_int_4_digits3019); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_FOUR_DIGIT.add(FOUR_DIGIT239);



            // AST REWRITE
            // elements: 
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
                adaptor.addChild(root_0, (Object)adaptor.create(INT, (FOUR_DIGIT239!=null?FOUR_DIGIT239.getText():null)));

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
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:286:1: int_1_to_12 : ( TWO_ZEROS -> INT[$TWO_ZEROS.text] | PREFIXED_ONE_TO_NINE -> INT[$PREFIXED_ONE_TO_NINE.text] | TEN_TO_TWELVE -> INT[$TEN_TO_TWELVE.text] );
    public final DateParser.int_1_to_12_return int_1_to_12() throws RecognitionException {
        DateParser.int_1_to_12_return retval = new DateParser.int_1_to_12_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TWO_ZEROS240=null;
        Token PREFIXED_ONE_TO_NINE241=null;
        Token TEN_TO_TWELVE242=null;

        Object TWO_ZEROS240_tree=null;
        Object PREFIXED_ONE_TO_NINE241_tree=null;
        Object TEN_TO_TWELVE242_tree=null;
        RewriteRuleTokenStream stream_TWO_ZEROS=new RewriteRuleTokenStream(adaptor,"token TWO_ZEROS");
        RewriteRuleTokenStream stream_TEN_TO_TWELVE=new RewriteRuleTokenStream(adaptor,"token TEN_TO_TWELVE");
        RewriteRuleTokenStream stream_PREFIXED_ONE_TO_NINE=new RewriteRuleTokenStream(adaptor,"token PREFIXED_ONE_TO_NINE");

        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:287:3: ( TWO_ZEROS -> INT[$TWO_ZEROS.text] | PREFIXED_ONE_TO_NINE -> INT[$PREFIXED_ONE_TO_NINE.text] | TEN_TO_TWELVE -> INT[$TEN_TO_TWELVE.text] )
            int alt75=3;
            switch ( input.LA(1) ) {
            case TWO_ZEROS:
                {
                alt75=1;
                }
                break;
            case PREFIXED_ONE_TO_NINE:
                {
                alt75=2;
                }
                break;
            case TEN_TO_TWELVE:
                {
                alt75=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 75, 0, input);

                throw nvae;
            }

            switch (alt75) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:287:5: TWO_ZEROS
                    {
                    TWO_ZEROS240=(Token)match(input,TWO_ZEROS,FOLLOW_TWO_ZEROS_in_int_1_to_123039); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWO_ZEROS.add(TWO_ZEROS240);



                    // AST REWRITE
                    // elements: 
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
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, (TWO_ZEROS240!=null?TWO_ZEROS240.getText():null)));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:288:5: PREFIXED_ONE_TO_NINE
                    {
                    PREFIXED_ONE_TO_NINE241=(Token)match(input,PREFIXED_ONE_TO_NINE,FOLLOW_PREFIXED_ONE_TO_NINE_in_int_1_to_123061); if (state.failed) return retval; 
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
                    // 288:26: -> INT[$PREFIXED_ONE_TO_NINE.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, (PREFIXED_ONE_TO_NINE241!=null?PREFIXED_ONE_TO_NINE241.getText():null)));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:289:5: TEN_TO_TWELVE
                    {
                    TEN_TO_TWELVE242=(Token)match(input,TEN_TO_TWELVE,FOLLOW_TEN_TO_TWELVE_in_int_1_to_123072); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TEN_TO_TWELVE.add(TEN_TO_TWELVE242);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 289:26: -> INT[$TEN_TO_TWELVE.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, (TEN_TO_TWELVE242!=null?TEN_TO_TWELVE242.getText():null)));

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
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:293:1: int_0_to_23 : ( TWO_ZEROS -> INT[$TWO_ZEROS.text] | PREFIXED_ONE_TO_NINE -> INT[$PREFIXED_ONE_TO_NINE.text] | ONE_TO_NINE -> INT[$ONE_TO_NINE.text] | TEN_TO_TWELVE -> INT[$TEN_TO_TWELVE.text] | THIRTEEN_TO_TWENTY_THREE -> INT[$THIRTEEN_TO_TWENTY_THREE.text] );
    public final DateParser.int_0_to_23_return int_0_to_23() throws RecognitionException {
        DateParser.int_0_to_23_return retval = new DateParser.int_0_to_23_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TWO_ZEROS243=null;
        Token PREFIXED_ONE_TO_NINE244=null;
        Token ONE_TO_NINE245=null;
        Token TEN_TO_TWELVE246=null;
        Token THIRTEEN_TO_TWENTY_THREE247=null;

        Object TWO_ZEROS243_tree=null;
        Object PREFIXED_ONE_TO_NINE244_tree=null;
        Object ONE_TO_NINE245_tree=null;
        Object TEN_TO_TWELVE246_tree=null;
        Object THIRTEEN_TO_TWENTY_THREE247_tree=null;
        RewriteRuleTokenStream stream_ONE_TO_NINE=new RewriteRuleTokenStream(adaptor,"token ONE_TO_NINE");
        RewriteRuleTokenStream stream_TWO_ZEROS=new RewriteRuleTokenStream(adaptor,"token TWO_ZEROS");
        RewriteRuleTokenStream stream_THIRTEEN_TO_TWENTY_THREE=new RewriteRuleTokenStream(adaptor,"token THIRTEEN_TO_TWENTY_THREE");
        RewriteRuleTokenStream stream_TEN_TO_TWELVE=new RewriteRuleTokenStream(adaptor,"token TEN_TO_TWELVE");
        RewriteRuleTokenStream stream_PREFIXED_ONE_TO_NINE=new RewriteRuleTokenStream(adaptor,"token PREFIXED_ONE_TO_NINE");

        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:294:3: ( TWO_ZEROS -> INT[$TWO_ZEROS.text] | PREFIXED_ONE_TO_NINE -> INT[$PREFIXED_ONE_TO_NINE.text] | ONE_TO_NINE -> INT[$ONE_TO_NINE.text] | TEN_TO_TWELVE -> INT[$TEN_TO_TWELVE.text] | THIRTEEN_TO_TWENTY_THREE -> INT[$THIRTEEN_TO_TWENTY_THREE.text] )
            int alt76=5;
            switch ( input.LA(1) ) {
            case TWO_ZEROS:
                {
                alt76=1;
                }
                break;
            case PREFIXED_ONE_TO_NINE:
                {
                alt76=2;
                }
                break;
            case ONE_TO_NINE:
                {
                alt76=3;
                }
                break;
            case TEN_TO_TWELVE:
                {
                alt76=4;
                }
                break;
            case THIRTEEN_TO_TWENTY_THREE:
                {
                alt76=5;
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:294:5: TWO_ZEROS
                    {
                    TWO_ZEROS243=(Token)match(input,TWO_ZEROS,FOLLOW_TWO_ZEROS_in_int_0_to_233100); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWO_ZEROS.add(TWO_ZEROS243);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 294:30: -> INT[$TWO_ZEROS.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, (TWO_ZEROS243!=null?TWO_ZEROS243.getText():null)));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:295:5: PREFIXED_ONE_TO_NINE
                    {
                    PREFIXED_ONE_TO_NINE244=(Token)match(input,PREFIXED_ONE_TO_NINE,FOLLOW_PREFIXED_ONE_TO_NINE_in_int_0_to_233126); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PREFIXED_ONE_TO_NINE.add(PREFIXED_ONE_TO_NINE244);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 295:30: -> INT[$PREFIXED_ONE_TO_NINE.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, (PREFIXED_ONE_TO_NINE244!=null?PREFIXED_ONE_TO_NINE244.getText():null)));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:296:5: ONE_TO_NINE
                    {
                    ONE_TO_NINE245=(Token)match(input,ONE_TO_NINE,FOLLOW_ONE_TO_NINE_in_int_0_to_233141); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ONE_TO_NINE.add(ONE_TO_NINE245);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 296:30: -> INT[$ONE_TO_NINE.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, (ONE_TO_NINE245!=null?ONE_TO_NINE245.getText():null)));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:297:5: TEN_TO_TWELVE
                    {
                    TEN_TO_TWELVE246=(Token)match(input,TEN_TO_TWELVE,FOLLOW_TEN_TO_TWELVE_in_int_0_to_233165); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TEN_TO_TWELVE.add(TEN_TO_TWELVE246);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 297:30: -> INT[$TEN_TO_TWELVE.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, (TEN_TO_TWELVE246!=null?TEN_TO_TWELVE246.getText():null)));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:298:5: THIRTEEN_TO_TWENTY_THREE
                    {
                    THIRTEEN_TO_TWENTY_THREE247=(Token)match(input,THIRTEEN_TO_TWENTY_THREE,FOLLOW_THIRTEEN_TO_TWENTY_THREE_in_int_0_to_233187); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THIRTEEN_TO_TWENTY_THREE.add(THIRTEEN_TO_TWENTY_THREE247);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 298:30: -> INT[$THIRTEEN_TO_TWENTY_THREE.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, (THIRTEEN_TO_TWENTY_THREE247!=null?THIRTEEN_TO_TWENTY_THREE247.getText():null)));

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
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:302:1: int_0_to_59 : ( TWO_ZEROS -> INT[$TWO_ZEROS.text] | PREFIXED_ONE_TO_NINE -> INT[$PREFIXED_ONE_TO_NINE.text] | ONE_TO_NINE -> INT[$ONE_TO_NINE.text] | TEN_TO_TWELVE -> INT[$TEN_TO_TWELVE.text] | THIRTEEN_TO_TWENTY_THREE -> INT[$THIRTEEN_TO_TWENTY_THREE.text] | TWENTY_FOUR_TO_THIRTY_ONE -> INT[$TWENTY_FOUR_TO_THIRTY_ONE.text] | THIRTY_TWO_TO_FIFTY_NINE -> INT[$THIRTY_TWO_TO_FIFTY_NINE.text] );
    public final DateParser.int_0_to_59_return int_0_to_59() throws RecognitionException {
        DateParser.int_0_to_59_return retval = new DateParser.int_0_to_59_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TWO_ZEROS248=null;
        Token PREFIXED_ONE_TO_NINE249=null;
        Token ONE_TO_NINE250=null;
        Token TEN_TO_TWELVE251=null;
        Token THIRTEEN_TO_TWENTY_THREE252=null;
        Token TWENTY_FOUR_TO_THIRTY_ONE253=null;
        Token THIRTY_TWO_TO_FIFTY_NINE254=null;

        Object TWO_ZEROS248_tree=null;
        Object PREFIXED_ONE_TO_NINE249_tree=null;
        Object ONE_TO_NINE250_tree=null;
        Object TEN_TO_TWELVE251_tree=null;
        Object THIRTEEN_TO_TWENTY_THREE252_tree=null;
        Object TWENTY_FOUR_TO_THIRTY_ONE253_tree=null;
        Object THIRTY_TWO_TO_FIFTY_NINE254_tree=null;
        RewriteRuleTokenStream stream_ONE_TO_NINE=new RewriteRuleTokenStream(adaptor,"token ONE_TO_NINE");
        RewriteRuleTokenStream stream_TWO_ZEROS=new RewriteRuleTokenStream(adaptor,"token TWO_ZEROS");
        RewriteRuleTokenStream stream_THIRTEEN_TO_TWENTY_THREE=new RewriteRuleTokenStream(adaptor,"token THIRTEEN_TO_TWENTY_THREE");
        RewriteRuleTokenStream stream_THIRTY_TWO_TO_FIFTY_NINE=new RewriteRuleTokenStream(adaptor,"token THIRTY_TWO_TO_FIFTY_NINE");
        RewriteRuleTokenStream stream_TEN_TO_TWELVE=new RewriteRuleTokenStream(adaptor,"token TEN_TO_TWELVE");
        RewriteRuleTokenStream stream_PREFIXED_ONE_TO_NINE=new RewriteRuleTokenStream(adaptor,"token PREFIXED_ONE_TO_NINE");
        RewriteRuleTokenStream stream_TWENTY_FOUR_TO_THIRTY_ONE=new RewriteRuleTokenStream(adaptor,"token TWENTY_FOUR_TO_THIRTY_ONE");

        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:303:3: ( TWO_ZEROS -> INT[$TWO_ZEROS.text] | PREFIXED_ONE_TO_NINE -> INT[$PREFIXED_ONE_TO_NINE.text] | ONE_TO_NINE -> INT[$ONE_TO_NINE.text] | TEN_TO_TWELVE -> INT[$TEN_TO_TWELVE.text] | THIRTEEN_TO_TWENTY_THREE -> INT[$THIRTEEN_TO_TWENTY_THREE.text] | TWENTY_FOUR_TO_THIRTY_ONE -> INT[$TWENTY_FOUR_TO_THIRTY_ONE.text] | THIRTY_TWO_TO_FIFTY_NINE -> INT[$THIRTY_TWO_TO_FIFTY_NINE.text] )
            int alt77=7;
            switch ( input.LA(1) ) {
            case TWO_ZEROS:
                {
                alt77=1;
                }
                break;
            case PREFIXED_ONE_TO_NINE:
                {
                alt77=2;
                }
                break;
            case ONE_TO_NINE:
                {
                alt77=3;
                }
                break;
            case TEN_TO_TWELVE:
                {
                alt77=4;
                }
                break;
            case THIRTEEN_TO_TWENTY_THREE:
                {
                alt77=5;
                }
                break;
            case TWENTY_FOUR_TO_THIRTY_ONE:
                {
                alt77=6;
                }
                break;
            case THIRTY_TWO_TO_FIFTY_NINE:
                {
                alt77=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 77, 0, input);

                throw nvae;
            }

            switch (alt77) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:303:5: TWO_ZEROS
                    {
                    TWO_ZEROS248=(Token)match(input,TWO_ZEROS,FOLLOW_TWO_ZEROS_in_int_0_to_593208); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWO_ZEROS.add(TWO_ZEROS248);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 303:31: -> INT[$TWO_ZEROS.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, (TWO_ZEROS248!=null?TWO_ZEROS248.getText():null)));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:304:5: PREFIXED_ONE_TO_NINE
                    {
                    PREFIXED_ONE_TO_NINE249=(Token)match(input,PREFIXED_ONE_TO_NINE,FOLLOW_PREFIXED_ONE_TO_NINE_in_int_0_to_593235); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PREFIXED_ONE_TO_NINE.add(PREFIXED_ONE_TO_NINE249);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 304:31: -> INT[$PREFIXED_ONE_TO_NINE.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, (PREFIXED_ONE_TO_NINE249!=null?PREFIXED_ONE_TO_NINE249.getText():null)));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:305:5: ONE_TO_NINE
                    {
                    ONE_TO_NINE250=(Token)match(input,ONE_TO_NINE,FOLLOW_ONE_TO_NINE_in_int_0_to_593251); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ONE_TO_NINE.add(ONE_TO_NINE250);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 305:31: -> INT[$ONE_TO_NINE.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, (ONE_TO_NINE250!=null?ONE_TO_NINE250.getText():null)));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:306:5: TEN_TO_TWELVE
                    {
                    TEN_TO_TWELVE251=(Token)match(input,TEN_TO_TWELVE,FOLLOW_TEN_TO_TWELVE_in_int_0_to_593276); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TEN_TO_TWELVE.add(TEN_TO_TWELVE251);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 306:31: -> INT[$TEN_TO_TWELVE.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, (TEN_TO_TWELVE251!=null?TEN_TO_TWELVE251.getText():null)));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:307:5: THIRTEEN_TO_TWENTY_THREE
                    {
                    THIRTEEN_TO_TWENTY_THREE252=(Token)match(input,THIRTEEN_TO_TWENTY_THREE,FOLLOW_THIRTEEN_TO_TWENTY_THREE_in_int_0_to_593299); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THIRTEEN_TO_TWENTY_THREE.add(THIRTEEN_TO_TWENTY_THREE252);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 307:31: -> INT[$THIRTEEN_TO_TWENTY_THREE.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, (THIRTEEN_TO_TWENTY_THREE252!=null?THIRTEEN_TO_TWENTY_THREE252.getText():null)));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 6 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:308:5: TWENTY_FOUR_TO_THIRTY_ONE
                    {
                    TWENTY_FOUR_TO_THIRTY_ONE253=(Token)match(input,TWENTY_FOUR_TO_THIRTY_ONE,FOLLOW_TWENTY_FOUR_TO_THIRTY_ONE_in_int_0_to_593311); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWENTY_FOUR_TO_THIRTY_ONE.add(TWENTY_FOUR_TO_THIRTY_ONE253);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 308:31: -> INT[$TWENTY_FOUR_TO_THIRTY_ONE.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, (TWENTY_FOUR_TO_THIRTY_ONE253!=null?TWENTY_FOUR_TO_THIRTY_ONE253.getText():null)));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 7 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:309:5: THIRTY_TWO_TO_FIFTY_NINE
                    {
                    THIRTY_TWO_TO_FIFTY_NINE254=(Token)match(input,THIRTY_TWO_TO_FIFTY_NINE,FOLLOW_THIRTY_TWO_TO_FIFTY_NINE_in_int_0_to_593322); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THIRTY_TWO_TO_FIFTY_NINE.add(THIRTY_TWO_TO_FIFTY_NINE254);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 309:31: -> INT[$THIRTY_TWO_TO_FIFTY_NINE.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, (THIRTY_TWO_TO_FIFTY_NINE254!=null?THIRTY_TWO_TO_FIFTY_NINE254.getText():null)));

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
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:313:1: int_0_to_99_no_prefix : ( ONE_ZERO -> INT[$ONE_ZERO.text] | ONE_TO_NINE -> INT[$ONE_TO_NINE.text] | TEN_TO_TWELVE -> INT[$TEN_TO_TWELVE.text] | THIRTEEN_TO_TWENTY_THREE -> INT[$THIRTEEN_TO_TWENTY_THREE.text] | TWENTY_FOUR_TO_THIRTY_ONE -> INT[$TWENTY_FOUR_TO_THIRTY_ONE.text] | THIRTY_TWO_TO_FIFTY_NINE -> INT[$THIRTY_TWO_TO_FIFTY_NINE.text] | SIXTY_TO_NINETY_NINE -> INT[$SIXTY_TO_NINETY_NINE.text] );
    public final DateParser.int_0_to_99_no_prefix_return int_0_to_99_no_prefix() throws RecognitionException {
        DateParser.int_0_to_99_no_prefix_return retval = new DateParser.int_0_to_99_no_prefix_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ONE_ZERO255=null;
        Token ONE_TO_NINE256=null;
        Token TEN_TO_TWELVE257=null;
        Token THIRTEEN_TO_TWENTY_THREE258=null;
        Token TWENTY_FOUR_TO_THIRTY_ONE259=null;
        Token THIRTY_TWO_TO_FIFTY_NINE260=null;
        Token SIXTY_TO_NINETY_NINE261=null;

        Object ONE_ZERO255_tree=null;
        Object ONE_TO_NINE256_tree=null;
        Object TEN_TO_TWELVE257_tree=null;
        Object THIRTEEN_TO_TWENTY_THREE258_tree=null;
        Object TWENTY_FOUR_TO_THIRTY_ONE259_tree=null;
        Object THIRTY_TWO_TO_FIFTY_NINE260_tree=null;
        Object SIXTY_TO_NINETY_NINE261_tree=null;
        RewriteRuleTokenStream stream_ONE_TO_NINE=new RewriteRuleTokenStream(adaptor,"token ONE_TO_NINE");
        RewriteRuleTokenStream stream_SIXTY_TO_NINETY_NINE=new RewriteRuleTokenStream(adaptor,"token SIXTY_TO_NINETY_NINE");
        RewriteRuleTokenStream stream_THIRTEEN_TO_TWENTY_THREE=new RewriteRuleTokenStream(adaptor,"token THIRTEEN_TO_TWENTY_THREE");
        RewriteRuleTokenStream stream_THIRTY_TWO_TO_FIFTY_NINE=new RewriteRuleTokenStream(adaptor,"token THIRTY_TWO_TO_FIFTY_NINE");
        RewriteRuleTokenStream stream_TEN_TO_TWELVE=new RewriteRuleTokenStream(adaptor,"token TEN_TO_TWELVE");
        RewriteRuleTokenStream stream_ONE_ZERO=new RewriteRuleTokenStream(adaptor,"token ONE_ZERO");
        RewriteRuleTokenStream stream_TWENTY_FOUR_TO_THIRTY_ONE=new RewriteRuleTokenStream(adaptor,"token TWENTY_FOUR_TO_THIRTY_ONE");

        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:314:3: ( ONE_ZERO -> INT[$ONE_ZERO.text] | ONE_TO_NINE -> INT[$ONE_TO_NINE.text] | TEN_TO_TWELVE -> INT[$TEN_TO_TWELVE.text] | THIRTEEN_TO_TWENTY_THREE -> INT[$THIRTEEN_TO_TWENTY_THREE.text] | TWENTY_FOUR_TO_THIRTY_ONE -> INT[$TWENTY_FOUR_TO_THIRTY_ONE.text] | THIRTY_TWO_TO_FIFTY_NINE -> INT[$THIRTY_TWO_TO_FIFTY_NINE.text] | SIXTY_TO_NINETY_NINE -> INT[$SIXTY_TO_NINETY_NINE.text] )
            int alt78=7;
            switch ( input.LA(1) ) {
            case ONE_ZERO:
                {
                alt78=1;
                }
                break;
            case ONE_TO_NINE:
                {
                alt78=2;
                }
                break;
            case TEN_TO_TWELVE:
                {
                alt78=3;
                }
                break;
            case THIRTEEN_TO_TWENTY_THREE:
                {
                alt78=4;
                }
                break;
            case TWENTY_FOUR_TO_THIRTY_ONE:
                {
                alt78=5;
                }
                break;
            case THIRTY_TWO_TO_FIFTY_NINE:
                {
                alt78=6;
                }
                break;
            case SIXTY_TO_NINETY_NINE:
                {
                alt78=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 78, 0, input);

                throw nvae;
            }

            switch (alt78) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:314:5: ONE_ZERO
                    {
                    ONE_ZERO255=(Token)match(input,ONE_ZERO,FOLLOW_ONE_ZERO_in_int_0_to_99_no_prefix3344); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ONE_ZERO.add(ONE_ZERO255);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 314:31: -> INT[$ONE_ZERO.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, (ONE_ZERO255!=null?ONE_ZERO255.getText():null)));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:315:5: ONE_TO_NINE
                    {
                    ONE_TO_NINE256=(Token)match(input,ONE_TO_NINE,FOLLOW_ONE_TO_NINE_in_int_0_to_99_no_prefix3372); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ONE_TO_NINE.add(ONE_TO_NINE256);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 315:31: -> INT[$ONE_TO_NINE.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, (ONE_TO_NINE256!=null?ONE_TO_NINE256.getText():null)));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:316:5: TEN_TO_TWELVE
                    {
                    TEN_TO_TWELVE257=(Token)match(input,TEN_TO_TWELVE,FOLLOW_TEN_TO_TWELVE_in_int_0_to_99_no_prefix3397); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TEN_TO_TWELVE.add(TEN_TO_TWELVE257);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 316:31: -> INT[$TEN_TO_TWELVE.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, (TEN_TO_TWELVE257!=null?TEN_TO_TWELVE257.getText():null)));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:317:5: THIRTEEN_TO_TWENTY_THREE
                    {
                    THIRTEEN_TO_TWENTY_THREE258=(Token)match(input,THIRTEEN_TO_TWENTY_THREE,FOLLOW_THIRTEEN_TO_TWENTY_THREE_in_int_0_to_99_no_prefix3420); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THIRTEEN_TO_TWENTY_THREE.add(THIRTEEN_TO_TWENTY_THREE258);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 317:31: -> INT[$THIRTEEN_TO_TWENTY_THREE.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, (THIRTEEN_TO_TWENTY_THREE258!=null?THIRTEEN_TO_TWENTY_THREE258.getText():null)));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:318:5: TWENTY_FOUR_TO_THIRTY_ONE
                    {
                    TWENTY_FOUR_TO_THIRTY_ONE259=(Token)match(input,TWENTY_FOUR_TO_THIRTY_ONE,FOLLOW_TWENTY_FOUR_TO_THIRTY_ONE_in_int_0_to_99_no_prefix3432); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWENTY_FOUR_TO_THIRTY_ONE.add(TWENTY_FOUR_TO_THIRTY_ONE259);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 318:31: -> INT[$TWENTY_FOUR_TO_THIRTY_ONE.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, (TWENTY_FOUR_TO_THIRTY_ONE259!=null?TWENTY_FOUR_TO_THIRTY_ONE259.getText():null)));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 6 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:319:5: THIRTY_TWO_TO_FIFTY_NINE
                    {
                    THIRTY_TWO_TO_FIFTY_NINE260=(Token)match(input,THIRTY_TWO_TO_FIFTY_NINE,FOLLOW_THIRTY_TWO_TO_FIFTY_NINE_in_int_0_to_99_no_prefix3443); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THIRTY_TWO_TO_FIFTY_NINE.add(THIRTY_TWO_TO_FIFTY_NINE260);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 319:31: -> INT[$THIRTY_TWO_TO_FIFTY_NINE.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, (THIRTY_TWO_TO_FIFTY_NINE260!=null?THIRTY_TWO_TO_FIFTY_NINE260.getText():null)));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 7 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:320:5: SIXTY_TO_NINETY_NINE
                    {
                    SIXTY_TO_NINETY_NINE261=(Token)match(input,SIXTY_TO_NINETY_NINE,FOLLOW_SIXTY_TO_NINETY_NINE_in_int_0_to_99_no_prefix3455); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SIXTY_TO_NINETY_NINE.add(SIXTY_TO_NINETY_NINE261);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 320:31: -> INT[$SIXTY_TO_NINETY_NINE.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, (SIXTY_TO_NINETY_NINE261!=null?SIXTY_TO_NINETY_NINE261.getText():null)));

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
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:323:1: int_0_to_99_with_prefix : ( TWO_ZEROS -> INT[$TWO_ZEROS.text] | PREFIXED_ONE_TO_NINE -> INT[$PREFIXED_ONE_TO_NINE.text] | TEN_TO_TWELVE -> INT[$TEN_TO_TWELVE.text] | THIRTEEN_TO_TWENTY_THREE -> INT[$THIRTEEN_TO_TWENTY_THREE.text] | TWENTY_FOUR_TO_THIRTY_ONE -> INT[$TWENTY_FOUR_TO_THIRTY_ONE.text] | THIRTY_TWO_TO_FIFTY_NINE -> INT[$THIRTY_TWO_TO_FIFTY_NINE.text] | SIXTY_TO_NINETY_NINE -> INT[$SIXTY_TO_NINETY_NINE.text] );
    public final DateParser.int_0_to_99_with_prefix_return int_0_to_99_with_prefix() throws RecognitionException {
        DateParser.int_0_to_99_with_prefix_return retval = new DateParser.int_0_to_99_with_prefix_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TWO_ZEROS262=null;
        Token PREFIXED_ONE_TO_NINE263=null;
        Token TEN_TO_TWELVE264=null;
        Token THIRTEEN_TO_TWENTY_THREE265=null;
        Token TWENTY_FOUR_TO_THIRTY_ONE266=null;
        Token THIRTY_TWO_TO_FIFTY_NINE267=null;
        Token SIXTY_TO_NINETY_NINE268=null;

        Object TWO_ZEROS262_tree=null;
        Object PREFIXED_ONE_TO_NINE263_tree=null;
        Object TEN_TO_TWELVE264_tree=null;
        Object THIRTEEN_TO_TWENTY_THREE265_tree=null;
        Object TWENTY_FOUR_TO_THIRTY_ONE266_tree=null;
        Object THIRTY_TWO_TO_FIFTY_NINE267_tree=null;
        Object SIXTY_TO_NINETY_NINE268_tree=null;
        RewriteRuleTokenStream stream_SIXTY_TO_NINETY_NINE=new RewriteRuleTokenStream(adaptor,"token SIXTY_TO_NINETY_NINE");
        RewriteRuleTokenStream stream_TWO_ZEROS=new RewriteRuleTokenStream(adaptor,"token TWO_ZEROS");
        RewriteRuleTokenStream stream_THIRTEEN_TO_TWENTY_THREE=new RewriteRuleTokenStream(adaptor,"token THIRTEEN_TO_TWENTY_THREE");
        RewriteRuleTokenStream stream_THIRTY_TWO_TO_FIFTY_NINE=new RewriteRuleTokenStream(adaptor,"token THIRTY_TWO_TO_FIFTY_NINE");
        RewriteRuleTokenStream stream_TEN_TO_TWELVE=new RewriteRuleTokenStream(adaptor,"token TEN_TO_TWELVE");
        RewriteRuleTokenStream stream_PREFIXED_ONE_TO_NINE=new RewriteRuleTokenStream(adaptor,"token PREFIXED_ONE_TO_NINE");
        RewriteRuleTokenStream stream_TWENTY_FOUR_TO_THIRTY_ONE=new RewriteRuleTokenStream(adaptor,"token TWENTY_FOUR_TO_THIRTY_ONE");

        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:324:3: ( TWO_ZEROS -> INT[$TWO_ZEROS.text] | PREFIXED_ONE_TO_NINE -> INT[$PREFIXED_ONE_TO_NINE.text] | TEN_TO_TWELVE -> INT[$TEN_TO_TWELVE.text] | THIRTEEN_TO_TWENTY_THREE -> INT[$THIRTEEN_TO_TWENTY_THREE.text] | TWENTY_FOUR_TO_THIRTY_ONE -> INT[$TWENTY_FOUR_TO_THIRTY_ONE.text] | THIRTY_TWO_TO_FIFTY_NINE -> INT[$THIRTY_TWO_TO_FIFTY_NINE.text] | SIXTY_TO_NINETY_NINE -> INT[$SIXTY_TO_NINETY_NINE.text] )
            int alt79=7;
            switch ( input.LA(1) ) {
            case TWO_ZEROS:
                {
                alt79=1;
                }
                break;
            case PREFIXED_ONE_TO_NINE:
                {
                alt79=2;
                }
                break;
            case TEN_TO_TWELVE:
                {
                alt79=3;
                }
                break;
            case THIRTEEN_TO_TWENTY_THREE:
                {
                alt79=4;
                }
                break;
            case TWENTY_FOUR_TO_THIRTY_ONE:
                {
                alt79=5;
                }
                break;
            case THIRTY_TWO_TO_FIFTY_NINE:
                {
                alt79=6;
                }
                break;
            case SIXTY_TO_NINETY_NINE:
                {
                alt79=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 79, 0, input);

                throw nvae;
            }

            switch (alt79) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:324:5: TWO_ZEROS
                    {
                    TWO_ZEROS262=(Token)match(input,TWO_ZEROS,FOLLOW_TWO_ZEROS_in_int_0_to_99_with_prefix3480); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWO_ZEROS.add(TWO_ZEROS262);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 324:31: -> INT[$TWO_ZEROS.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, (TWO_ZEROS262!=null?TWO_ZEROS262.getText():null)));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:325:5: PREFIXED_ONE_TO_NINE
                    {
                    PREFIXED_ONE_TO_NINE263=(Token)match(input,PREFIXED_ONE_TO_NINE,FOLLOW_PREFIXED_ONE_TO_NINE_in_int_0_to_99_with_prefix3507); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PREFIXED_ONE_TO_NINE.add(PREFIXED_ONE_TO_NINE263);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 325:31: -> INT[$PREFIXED_ONE_TO_NINE.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, (PREFIXED_ONE_TO_NINE263!=null?PREFIXED_ONE_TO_NINE263.getText():null)));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:326:5: TEN_TO_TWELVE
                    {
                    TEN_TO_TWELVE264=(Token)match(input,TEN_TO_TWELVE,FOLLOW_TEN_TO_TWELVE_in_int_0_to_99_with_prefix3523); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TEN_TO_TWELVE.add(TEN_TO_TWELVE264);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 326:31: -> INT[$TEN_TO_TWELVE.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, (TEN_TO_TWELVE264!=null?TEN_TO_TWELVE264.getText():null)));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:327:5: THIRTEEN_TO_TWENTY_THREE
                    {
                    THIRTEEN_TO_TWENTY_THREE265=(Token)match(input,THIRTEEN_TO_TWENTY_THREE,FOLLOW_THIRTEEN_TO_TWENTY_THREE_in_int_0_to_99_with_prefix3546); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THIRTEEN_TO_TWENTY_THREE.add(THIRTEEN_TO_TWENTY_THREE265);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 327:31: -> INT[$THIRTEEN_TO_TWENTY_THREE.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, (THIRTEEN_TO_TWENTY_THREE265!=null?THIRTEEN_TO_TWENTY_THREE265.getText():null)));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:328:5: TWENTY_FOUR_TO_THIRTY_ONE
                    {
                    TWENTY_FOUR_TO_THIRTY_ONE266=(Token)match(input,TWENTY_FOUR_TO_THIRTY_ONE,FOLLOW_TWENTY_FOUR_TO_THIRTY_ONE_in_int_0_to_99_with_prefix3558); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWENTY_FOUR_TO_THIRTY_ONE.add(TWENTY_FOUR_TO_THIRTY_ONE266);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 328:31: -> INT[$TWENTY_FOUR_TO_THIRTY_ONE.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, (TWENTY_FOUR_TO_THIRTY_ONE266!=null?TWENTY_FOUR_TO_THIRTY_ONE266.getText():null)));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 6 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:329:5: THIRTY_TWO_TO_FIFTY_NINE
                    {
                    THIRTY_TWO_TO_FIFTY_NINE267=(Token)match(input,THIRTY_TWO_TO_FIFTY_NINE,FOLLOW_THIRTY_TWO_TO_FIFTY_NINE_in_int_0_to_99_with_prefix3569); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THIRTY_TWO_TO_FIFTY_NINE.add(THIRTY_TWO_TO_FIFTY_NINE267);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 329:31: -> INT[$THIRTY_TWO_TO_FIFTY_NINE.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, (THIRTY_TWO_TO_FIFTY_NINE267!=null?THIRTY_TWO_TO_FIFTY_NINE267.getText():null)));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 7 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:330:5: SIXTY_TO_NINETY_NINE
                    {
                    SIXTY_TO_NINETY_NINE268=(Token)match(input,SIXTY_TO_NINETY_NINE,FOLLOW_SIXTY_TO_NINETY_NINE_in_int_0_to_99_with_prefix3581); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SIXTY_TO_NINETY_NINE.add(SIXTY_TO_NINETY_NINE268);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 330:31: -> INT[$SIXTY_TO_NINETY_NINE.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, (SIXTY_TO_NINETY_NINE268!=null?SIXTY_TO_NINETY_NINE268.getText():null)));

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

    public static class int_1_to_31_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "int_1_to_31"
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:334:1: int_1_to_31 : ( PREFIXED_ONE_TO_NINE -> INT[$PREFIXED_ONE_TO_NINE.text] | ONE_TO_NINE -> INT[$ONE_TO_NINE.text] | int_10_to_31 );
    public final DateParser.int_1_to_31_return int_1_to_31() throws RecognitionException {
        DateParser.int_1_to_31_return retval = new DateParser.int_1_to_31_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token PREFIXED_ONE_TO_NINE269=null;
        Token ONE_TO_NINE270=null;
        DateParser.int_10_to_31_return int_10_to_31271 = null;


        Object PREFIXED_ONE_TO_NINE269_tree=null;
        Object ONE_TO_NINE270_tree=null;
        RewriteRuleTokenStream stream_ONE_TO_NINE=new RewriteRuleTokenStream(adaptor,"token ONE_TO_NINE");
        RewriteRuleTokenStream stream_PREFIXED_ONE_TO_NINE=new RewriteRuleTokenStream(adaptor,"token PREFIXED_ONE_TO_NINE");

        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:335:3: ( PREFIXED_ONE_TO_NINE -> INT[$PREFIXED_ONE_TO_NINE.text] | ONE_TO_NINE -> INT[$ONE_TO_NINE.text] | int_10_to_31 )
            int alt80=3;
            switch ( input.LA(1) ) {
            case PREFIXED_ONE_TO_NINE:
                {
                alt80=1;
                }
                break;
            case ONE_TO_NINE:
                {
                alt80=2;
                }
                break;
            case TEN_TO_TWELVE:
            case THIRTEEN_TO_TWENTY_THREE:
            case TWENTY_FOUR_TO_THIRTY_ONE:
                {
                alt80=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 80, 0, input);

                throw nvae;
            }

            switch (alt80) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:335:5: PREFIXED_ONE_TO_NINE
                    {
                    PREFIXED_ONE_TO_NINE269=(Token)match(input,PREFIXED_ONE_TO_NINE,FOLLOW_PREFIXED_ONE_TO_NINE_in_int_1_to_313605); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PREFIXED_ONE_TO_NINE.add(PREFIXED_ONE_TO_NINE269);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 335:31: -> INT[$PREFIXED_ONE_TO_NINE.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, (PREFIXED_ONE_TO_NINE269!=null?PREFIXED_ONE_TO_NINE269.getText():null)));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:336:5: ONE_TO_NINE
                    {
                    ONE_TO_NINE270=(Token)match(input,ONE_TO_NINE,FOLLOW_ONE_TO_NINE_in_int_1_to_313621); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ONE_TO_NINE.add(ONE_TO_NINE270);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 336:31: -> INT[$ONE_TO_NINE.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, (ONE_TO_NINE270!=null?ONE_TO_NINE270.getText():null)));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:337:5: int_10_to_31
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_int_10_to_31_in_int_1_to_313646);
                    int_10_to_31271=int_10_to_31();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, int_10_to_31271.getTree());

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
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:340:1: int_1_to_31_no_prefix : ( ONE_TO_NINE -> INT[$ONE_TO_NINE.text] | int_10_to_31 );
    public final DateParser.int_1_to_31_no_prefix_return int_1_to_31_no_prefix() throws RecognitionException {
        DateParser.int_1_to_31_no_prefix_return retval = new DateParser.int_1_to_31_no_prefix_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ONE_TO_NINE272=null;
        DateParser.int_10_to_31_return int_10_to_31273 = null;


        Object ONE_TO_NINE272_tree=null;
        RewriteRuleTokenStream stream_ONE_TO_NINE=new RewriteRuleTokenStream(adaptor,"token ONE_TO_NINE");

        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:341:3: ( ONE_TO_NINE -> INT[$ONE_TO_NINE.text] | int_10_to_31 )
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==ONE_TO_NINE) ) {
                alt81=1;
            }
            else if ( (LA81_0==TEN_TO_TWELVE||(LA81_0>=THIRTEEN_TO_TWENTY_THREE && LA81_0<=TWENTY_FOUR_TO_THIRTY_ONE)) ) {
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:341:5: ONE_TO_NINE
                    {
                    ONE_TO_NINE272=(Token)match(input,ONE_TO_NINE,FOLLOW_ONE_TO_NINE_in_int_1_to_31_no_prefix3661); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ONE_TO_NINE.add(ONE_TO_NINE272);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 341:17: -> INT[$ONE_TO_NINE.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, (ONE_TO_NINE272!=null?ONE_TO_NINE272.getText():null)));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:342:5: int_10_to_31
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_int_10_to_31_in_int_1_to_31_no_prefix3672);
                    int_10_to_31273=int_10_to_31();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, int_10_to_31273.getTree());

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
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:345:1: int_10_to_31 : ( TEN_TO_TWELVE -> INT[$TEN_TO_TWELVE.text] | THIRTEEN_TO_TWENTY_THREE -> INT[$THIRTEEN_TO_TWENTY_THREE.text] | TWENTY_FOUR_TO_THIRTY_ONE -> INT[$TWENTY_FOUR_TO_THIRTY_ONE.text] );
    public final DateParser.int_10_to_31_return int_10_to_31() throws RecognitionException {
        DateParser.int_10_to_31_return retval = new DateParser.int_10_to_31_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TEN_TO_TWELVE274=null;
        Token THIRTEEN_TO_TWENTY_THREE275=null;
        Token TWENTY_FOUR_TO_THIRTY_ONE276=null;

        Object TEN_TO_TWELVE274_tree=null;
        Object THIRTEEN_TO_TWENTY_THREE275_tree=null;
        Object TWENTY_FOUR_TO_THIRTY_ONE276_tree=null;
        RewriteRuleTokenStream stream_THIRTEEN_TO_TWENTY_THREE=new RewriteRuleTokenStream(adaptor,"token THIRTEEN_TO_TWENTY_THREE");
        RewriteRuleTokenStream stream_TEN_TO_TWELVE=new RewriteRuleTokenStream(adaptor,"token TEN_TO_TWELVE");
        RewriteRuleTokenStream stream_TWENTY_FOUR_TO_THIRTY_ONE=new RewriteRuleTokenStream(adaptor,"token TWENTY_FOUR_TO_THIRTY_ONE");

        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:346:3: ( TEN_TO_TWELVE -> INT[$TEN_TO_TWELVE.text] | THIRTEEN_TO_TWENTY_THREE -> INT[$THIRTEEN_TO_TWENTY_THREE.text] | TWENTY_FOUR_TO_THIRTY_ONE -> INT[$TWENTY_FOUR_TO_THIRTY_ONE.text] )
            int alt82=3;
            switch ( input.LA(1) ) {
            case TEN_TO_TWELVE:
                {
                alt82=1;
                }
                break;
            case THIRTEEN_TO_TWENTY_THREE:
                {
                alt82=2;
                }
                break;
            case TWENTY_FOUR_TO_THIRTY_ONE:
                {
                alt82=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 82, 0, input);

                throw nvae;
            }

            switch (alt82) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:346:5: TEN_TO_TWELVE
                    {
                    TEN_TO_TWELVE274=(Token)match(input,TEN_TO_TWELVE,FOLLOW_TEN_TO_TWELVE_in_int_10_to_313687); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TEN_TO_TWELVE.add(TEN_TO_TWELVE274);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 346:31: -> INT[$TEN_TO_TWELVE.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, (TEN_TO_TWELVE274!=null?TEN_TO_TWELVE274.getText():null)));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:347:5: THIRTEEN_TO_TWENTY_THREE
                    {
                    THIRTEEN_TO_TWENTY_THREE275=(Token)match(input,THIRTEEN_TO_TWENTY_THREE,FOLLOW_THIRTEEN_TO_TWENTY_THREE_in_int_10_to_313710); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THIRTEEN_TO_TWENTY_THREE.add(THIRTEEN_TO_TWENTY_THREE275);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 347:31: -> INT[$THIRTEEN_TO_TWENTY_THREE.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, (THIRTEEN_TO_TWENTY_THREE275!=null?THIRTEEN_TO_TWENTY_THREE275.getText():null)));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:348:5: TWENTY_FOUR_TO_THIRTY_ONE
                    {
                    TWENTY_FOUR_TO_THIRTY_ONE276=(Token)match(input,TWENTY_FOUR_TO_THIRTY_ONE,FOLLOW_TWENTY_FOUR_TO_THIRTY_ONE_in_int_10_to_313722); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWENTY_FOUR_TO_THIRTY_ONE.add(TWENTY_FOUR_TO_THIRTY_ONE276);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 348:31: -> INT[$TWENTY_FOUR_TO_THIRTY_ONE.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INT, (TWENTY_FOUR_TO_THIRTY_ONE276!=null?TWENTY_FOUR_TO_THIRTY_ONE276.getText():null)));

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

    // $ANTLR start synpred1_Date
    public final void synpred1_Date_fragment() throws RecognitionException {   
        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:30:5: ( date ( AT | COMMA )? ( time )? )
        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:30:5: date ( AT | COMMA )? ( time )?
        {
        pushFollow(FOLLOW_date_in_synpred1_Date135);
        date();

        state._fsp--;
        if (state.failed) return ;
        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:30:10: ( AT | COMMA )?
        int alt83=2;
        int LA83_0 = input.LA(1);

        if ( ((LA83_0>=AT && LA83_0<=COMMA)) ) {
            alt83=1;
        }
        switch (alt83) {
            case 1 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:
                {
                if ( (input.LA(1)>=AT && input.LA(1)<=COMMA) ) {
                    input.consume();
                    state.errorRecovery=false;state.failed=false;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    MismatchedSetException mse = new MismatchedSetException(null,input);
                    throw mse;
                }


                }
                break;

        }

        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:30:24: ( time )?
        int alt84=2;
        int LA84_0 = input.LA(1);

        if ( ((LA84_0>=MIDNIGHT && LA84_0<=NOON)||(LA84_0>=TWO_ZEROS && LA84_0<=THIRTEEN_TO_TWENTY_THREE)) ) {
            alt84=1;
        }
        switch (alt84) {
            case 1 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:30:24: time
                {
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
        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:31:5: ( time ( ON )? date )
        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:31:5: time ( ON )? date
        {
        pushFollow(FOLLOW_time_in_synpred2_Date164);
        time();

        state._fsp--;
        if (state.failed) return ;
        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:31:10: ( ON )?
        int alt85=2;
        int LA85_0 = input.LA(1);

        if ( (LA85_0==ON) ) {
            alt85=1;
        }
        switch (alt85) {
            case 1 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:31:10: ON
                {
                match(input,ON,FOLLOW_ON_in_synpred2_Date166); if (state.failed) return ;

                }
                break;

        }

        pushFollow(FOLLOW_date_in_synpred2_Date169);
        date();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_Date

    // $ANTLR start synpred3_Date
    public final void synpred3_Date_fragment() throws RecognitionException {   
        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:37:5: ( date_prefix explicit_date )
        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:37:5: date_prefix explicit_date
        {
        pushFollow(FOLLOW_date_prefix_in_synpred3_Date259);
        date_prefix();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_explicit_date_in_synpred3_Date261);
        explicit_date();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred3_Date

    // $ANTLR start synpred4_Date
    public final void synpred4_Date_fragment() throws RecognitionException {   
        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:38:5: ( explicit_date )
        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:38:5: explicit_date
        {
        pushFollow(FOLLOW_explicit_date_in_synpred4_Date277);
        explicit_date();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred4_Date

    // $ANTLR start synpred5_Date
    public final void synpred5_Date_fragment() throws RecognitionException {   
        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:39:5: ( date_prefix relative_date )
        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:39:5: date_prefix relative_date
        {
        pushFollow(FOLLOW_date_prefix_in_synpred5_Date283);
        date_prefix();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_relative_date_in_synpred5_Date285);
        relative_date();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred5_Date

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


    protected DFA4 dfa4 = new DFA4(this);
    protected DFA5 dfa5 = new DFA5(this);
    protected DFA9 dfa9 = new DFA9(this);
    protected DFA18 dfa18 = new DFA18(this);
    protected DFA50 dfa50 = new DFA50(this);
    protected DFA72 dfa72 = new DFA72(this);
    static final String DFA4_eotS =
        "\54\uffff";
    static final String DFA4_eofS =
        "\2\uffff\7\14\1\uffff\2\14\31\uffff\7\14";
    static final String DFA4_minS =
        "\1\27\1\uffff\7\25\1\171\2\25\2\uffff\27\0\7\25";
    static final String DFA4_maxS =
        "\1\176\1\uffff\4\u0084\3\176\1\177\2\176\2\uffff\27\0\7\176";
    static final String DFA4_acceptS =
        "\1\uffff\1\1\12\uffff\1\3\1\2\36\uffff";
    static final String DFA4_specialS =
        "\16\uffff\1\0\1\3\1\11\1\13\1\16\1\20\1\26\1\7\1\5\1\12\1\21\1\14"+
        "\1\25\1\2\1\10\1\22\1\23\1\24\1\15\1\17\1\4\1\1\1\6\7\uffff}>";
    static final String[] DFA4_transitionS = {
            "\5\1\2\uffff\7\1\2\uffff\26\1\4\uffff\1\7\1\10\64\1\1\uffff"+
            "\1\1\1\6\1\2\1\4\1\3\1\5\1\1",
            "",
            "\1\15\1\11\4\15\1\16\2\uffff\7\15\2\uffff\1\42\1\43\1\44\1"+
            "\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1"+
            "\33\1\34\1\35\1\36\1\37\1\40\1\41\2\1\1\12\1\13\2\uffff\64\15"+
            "\1\uffff\7\15\5\uffff\1\1",
            "\1\15\1\11\4\15\1\16\2\uffff\7\15\2\uffff\1\42\1\43\1\44\1"+
            "\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1"+
            "\33\1\34\1\35\1\36\1\37\1\40\1\41\2\uffff\1\12\1\13\2\uffff"+
            "\64\15\1\uffff\7\15\5\uffff\1\1",
            "\1\15\1\11\4\15\1\16\2\uffff\7\15\2\uffff\1\42\1\43\1\44\1"+
            "\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1"+
            "\33\1\34\1\35\1\36\1\37\1\40\1\41\2\1\1\12\1\13\2\uffff\64\15"+
            "\1\uffff\7\15\5\uffff\1\1",
            "\1\15\1\11\4\15\1\16\2\uffff\7\15\2\uffff\1\42\1\43\1\44\1"+
            "\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1"+
            "\33\1\34\1\35\1\36\1\37\1\40\1\41\2\uffff\1\12\1\13\2\uffff"+
            "\64\15\1\uffff\7\15\5\uffff\1\1",
            "\1\15\1\11\5\15\2\uffff\7\15\2\uffff\26\15\2\1\1\12\1\13\2"+
            "\uffff\64\15\1\uffff\7\15",
            "\1\15\1\uffff\5\15\2\uffff\7\15\2\uffff\26\15\6\uffff\64\15"+
            "\1\uffff\7\15",
            "\1\15\1\uffff\5\15\2\uffff\7\15\2\uffff\26\15\6\uffff\64\15"+
            "\1\uffff\7\15",
            "\1\45\1\46\1\50\1\47\1\51\1\52\1\53",
            "\1\15\1\uffff\5\15\2\uffff\7\15\2\uffff\26\15\6\uffff\64\15"+
            "\1\uffff\7\15",
            "\1\15\1\uffff\5\15\2\uffff\7\15\2\uffff\26\15\6\uffff\64\15"+
            "\1\uffff\7\15",
            "",
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
            "\1\15\1\uffff\5\15\2\uffff\7\15\2\uffff\26\15\2\uffff\1\12"+
            "\1\13\2\uffff\64\15\1\uffff\7\15",
            "\1\15\1\uffff\5\15\2\uffff\7\15\2\uffff\26\15\2\uffff\1\12"+
            "\1\13\2\uffff\64\15\1\uffff\7\15",
            "\1\15\1\uffff\5\15\2\uffff\7\15\2\uffff\26\15\2\uffff\1\12"+
            "\1\13\2\uffff\64\15\1\uffff\7\15",
            "\1\15\1\uffff\5\15\2\uffff\7\15\2\uffff\26\15\2\uffff\1\12"+
            "\1\13\2\uffff\64\15\1\uffff\7\15",
            "\1\15\1\uffff\5\15\2\uffff\7\15\2\uffff\26\15\2\uffff\1\12"+
            "\1\13\2\uffff\64\15\1\uffff\7\15",
            "\1\15\1\uffff\5\15\2\uffff\7\15\2\uffff\26\15\2\uffff\1\12"+
            "\1\13\2\uffff\64\15\1\uffff\7\15",
            "\1\15\1\uffff\5\15\2\uffff\7\15\2\uffff\26\15\2\uffff\1\12"+
            "\1\13\2\uffff\64\15\1\uffff\7\15"
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
            return "28:1: datetime options {backtrack=true; } : ( date ( AT | COMMA )? ( time )? -> ^( DATE_TIME date ( time )? ) | time ( ON )? date -> ^( DATE_TIME date time ) | time -> ^( DATE_TIME ^( RELATIVE_DATE SEEK_DIR[\">\"] INT[\"0\"] ) time ) );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA4_14 = input.LA(1);

                         
                        int index4_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 1;}

                        else if ( (synpred2_Date()) ) {s = 13;}

                         
                        input.seek(index4_14);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA4_35 = input.LA(1);

                         
                        int index4_35 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 1;}

                        else if ( (synpred2_Date()) ) {s = 13;}

                         
                        input.seek(index4_35);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA4_27 = input.LA(1);

                         
                        int index4_27 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 1;}

                        else if ( (synpred2_Date()) ) {s = 13;}

                         
                        input.seek(index4_27);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA4_15 = input.LA(1);

                         
                        int index4_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 1;}

                        else if ( (synpred2_Date()) ) {s = 13;}

                         
                        input.seek(index4_15);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA4_34 = input.LA(1);

                         
                        int index4_34 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 1;}

                        else if ( (synpred2_Date()) ) {s = 13;}

                         
                        input.seek(index4_34);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA4_22 = input.LA(1);

                         
                        int index4_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 1;}

                        else if ( (synpred2_Date()) ) {s = 13;}

                         
                        input.seek(index4_22);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA4_36 = input.LA(1);

                         
                        int index4_36 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 1;}

                        else if ( (synpred2_Date()) ) {s = 13;}

                         
                        input.seek(index4_36);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA4_21 = input.LA(1);

                         
                        int index4_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 1;}

                        else if ( (synpred2_Date()) ) {s = 13;}

                         
                        input.seek(index4_21);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA4_28 = input.LA(1);

                         
                        int index4_28 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 1;}

                        else if ( (synpred2_Date()) ) {s = 13;}

                         
                        input.seek(index4_28);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA4_16 = input.LA(1);

                         
                        int index4_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 1;}

                        else if ( (synpred2_Date()) ) {s = 13;}

                         
                        input.seek(index4_16);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA4_23 = input.LA(1);

                         
                        int index4_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 1;}

                        else if ( (synpred2_Date()) ) {s = 13;}

                         
                        input.seek(index4_23);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA4_17 = input.LA(1);

                         
                        int index4_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 1;}

                        else if ( (synpred2_Date()) ) {s = 13;}

                         
                        input.seek(index4_17);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA4_25 = input.LA(1);

                         
                        int index4_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 1;}

                        else if ( (synpred2_Date()) ) {s = 13;}

                         
                        input.seek(index4_25);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA4_32 = input.LA(1);

                         
                        int index4_32 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 1;}

                        else if ( (synpred2_Date()) ) {s = 13;}

                         
                        input.seek(index4_32);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA4_18 = input.LA(1);

                         
                        int index4_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 1;}

                        else if ( (synpred2_Date()) ) {s = 13;}

                         
                        input.seek(index4_18);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA4_33 = input.LA(1);

                         
                        int index4_33 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 1;}

                        else if ( (synpred2_Date()) ) {s = 13;}

                         
                        input.seek(index4_33);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA4_19 = input.LA(1);

                         
                        int index4_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 1;}

                        else if ( (synpred2_Date()) ) {s = 13;}

                         
                        input.seek(index4_19);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA4_24 = input.LA(1);

                         
                        int index4_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 1;}

                        else if ( (synpred2_Date()) ) {s = 13;}

                         
                        input.seek(index4_24);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA4_29 = input.LA(1);

                         
                        int index4_29 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 1;}

                        else if ( (synpred2_Date()) ) {s = 13;}

                         
                        input.seek(index4_29);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA4_30 = input.LA(1);

                         
                        int index4_30 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 1;}

                        else if ( (synpred2_Date()) ) {s = 13;}

                         
                        input.seek(index4_30);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA4_31 = input.LA(1);

                         
                        int index4_31 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 1;}

                        else if ( (synpred2_Date()) ) {s = 13;}

                         
                        input.seek(index4_31);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA4_26 = input.LA(1);

                         
                        int index4_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 1;}

                        else if ( (synpred2_Date()) ) {s = 13;}

                         
                        input.seek(index4_26);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA4_20 = input.LA(1);

                         
                        int index4_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 1;}

                        else if ( (synpred2_Date()) ) {s = 13;}

                         
                        input.seek(index4_20);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 4, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA5_eotS =
        "\u0091\uffff";
    static final String DFA5_eofS =
        "\2\uffff\1\52\33\uffff\14\52\4\uffff\1\52\37\uffff\14\162\67\uffff";
    static final String DFA5_minS =
        "\1\27\1\33\1\23\32\33\1\uffff\14\23\1\uffff\1\34\2\27\1\23\14\0"+
        "\1\103\11\33\1\103\1\33\4\0\1\uffff\2\33\14\23\30\33\1\uffff\2\27"+
        "\20\0\1\103\11\33\1\103\1\33";
    static final String DFA5_maxS =
        "\1\176\1\33\1\175\32\u0084\1\uffff\14\176\1\uffff\1\35\2\176\1\175"+
        "\14\0\1\140\11\u0084\1\130\1\u0084\4\0\1\uffff\2\u0084\14\176\30"+
        "\u0084\1\uffff\2\176\20\0\1\140\11\u0084\1\130\1\u0084";
    static final String DFA5_acceptS =
        "\35\uffff\1\2\14\uffff\1\4\40\uffff\1\1\46\uffff\1\3\36\uffff";
    static final String DFA5_specialS =
        "\57\uffff\1\32\1\33\1\25\1\26\1\31\1\21\1\22\1\12\1\6\1\17\1\3\1"+
        "\5\14\uffff\1\7\1\14\1\13\1\15\52\uffff\1\20\1\23\1\24\1\27\1\30"+
        "\1\2\1\4\1\11\1\10\1\16\1\0\1\1\1\37\1\36\1\35\1\34\14\uffff}>";
    static final String[] DFA5_transitionS = {
            "\3\52\1\1\1\2\2\uffff\7\52\2\uffff\3\52\1\36\1\37\1\40\1\41"+
            "\1\42\1\43\1\44\1\45\1\46\1\47\1\50\1\51\7\52\6\uffff\1\3\1"+
            "\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20"+
            "\1\21\1\22\1\23\1\24\1\25\1\26\1\27\37\35\1\uffff\2\35\1\30"+
            "\1\32\1\31\1\33\1\34",
            "\1\53",
            "\2\52\7\uffff\1\54\1\55\43\uffff\2\52\66\uffff\5\52",
            "\1\56\13\uffff\3\52\1\57\1\60\1\61\1\62\1\63\1\64\1\65\1\66"+
            "\1\67\1\70\1\71\1\72\7\52\107\uffff\1\35",
            "\1\56\13\uffff\3\52\1\57\1\60\1\61\1\62\1\63\1\64\1\65\1\66"+
            "\1\67\1\70\1\71\1\72\7\52\107\uffff\1\35",
            "\1\56\13\uffff\3\52\1\57\1\60\1\61\1\62\1\63\1\64\1\65\1\66"+
            "\1\67\1\70\1\71\1\72\7\52\107\uffff\1\35",
            "\1\56\13\uffff\3\52\1\57\1\60\1\61\1\62\1\63\1\64\1\65\1\66"+
            "\1\67\1\70\1\71\1\72\7\52\107\uffff\1\35",
            "\1\56\13\uffff\3\52\1\57\1\60\1\61\1\62\1\63\1\64\1\65\1\66"+
            "\1\67\1\70\1\71\1\72\7\52\107\uffff\1\35",
            "\1\56\13\uffff\3\52\1\57\1\60\1\61\1\62\1\63\1\64\1\65\1\66"+
            "\1\67\1\70\1\71\1\72\7\52\107\uffff\1\35",
            "\1\56\13\uffff\3\52\1\57\1\60\1\61\1\62\1\63\1\64\1\65\1\66"+
            "\1\67\1\70\1\71\1\72\7\52\107\uffff\1\35",
            "\1\56\13\uffff\3\52\1\57\1\60\1\61\1\62\1\63\1\64\1\65\1\66"+
            "\1\67\1\70\1\71\1\72\7\52\107\uffff\1\35",
            "\1\56\13\uffff\3\52\1\57\1\60\1\61\1\62\1\63\1\64\1\65\1\66"+
            "\1\67\1\70\1\71\1\72\7\52\107\uffff\1\35",
            "\1\56\13\uffff\3\52\1\57\1\60\1\61\1\62\1\63\1\64\1\65\1\66"+
            "\1\67\1\70\1\71\1\72\7\52\107\uffff\1\35",
            "\1\56\13\uffff\3\52\1\57\1\60\1\61\1\62\1\63\1\64\1\65\1\66"+
            "\1\67\1\70\1\71\1\72\7\52\107\uffff\1\35",
            "\1\56\13\uffff\3\52\1\57\1\60\1\61\1\62\1\63\1\64\1\65\1\66"+
            "\1\67\1\70\1\71\1\72\7\52\107\uffff\1\35",
            "\1\56\13\uffff\3\52\1\57\1\60\1\61\1\62\1\63\1\64\1\65\1\66"+
            "\1\67\1\70\1\71\1\72\7\52\107\uffff\1\35",
            "\1\56\13\uffff\3\52\1\57\1\60\1\61\1\62\1\63\1\64\1\65\1\66"+
            "\1\67\1\70\1\71\1\72\7\52\107\uffff\1\35",
            "\1\56\13\uffff\3\52\1\57\1\60\1\61\1\62\1\63\1\64\1\65\1\66"+
            "\1\67\1\70\1\71\1\72\7\52\107\uffff\1\35",
            "\1\56\13\uffff\3\52\1\57\1\60\1\61\1\62\1\63\1\64\1\65\1\66"+
            "\1\67\1\70\1\71\1\72\7\52\107\uffff\1\35",
            "\1\56\13\uffff\3\52\1\57\1\60\1\61\1\62\1\63\1\64\1\65\1\66"+
            "\1\67\1\70\1\71\1\72\7\52\107\uffff\1\35",
            "\1\56\13\uffff\3\52\1\57\1\60\1\61\1\62\1\63\1\64\1\65\1\66"+
            "\1\67\1\70\1\71\1\72\7\52\107\uffff\1\35",
            "\1\56\13\uffff\3\52\1\57\1\60\1\61\1\62\1\63\1\64\1\65\1\66"+
            "\1\67\1\70\1\71\1\72\7\52\107\uffff\1\35",
            "\1\56\13\uffff\3\52\1\57\1\60\1\61\1\62\1\63\1\64\1\65\1\66"+
            "\1\67\1\70\1\71\1\72\7\52\1\73\5\uffff\1\75\1\77\1\74\1\101"+
            "\1\102\1\76\1\100\1\103\1\104\14\uffff\11\35\43\uffff\1\35",
            "\1\56\13\uffff\3\52\1\57\1\60\1\61\1\62\1\63\1\64\1\65\1\66"+
            "\1\67\1\70\1\71\1\72\7\52\1\105\5\uffff\1\106\24\uffff\1\35"+
            "\53\uffff\1\35",
            "\1\56\13\uffff\3\52\1\57\1\60\1\61\1\62\1\63\1\64\1\65\1\66"+
            "\1\67\1\70\1\71\1\72\7\52\2\35\105\uffff\1\35",
            "\1\56\13\uffff\3\52\1\57\1\60\1\61\1\62\1\63\1\64\1\65\1\66"+
            "\1\67\1\70\1\71\1\72\7\52\107\uffff\1\35",
            "\1\56\13\uffff\3\52\1\57\1\60\1\61\1\62\1\63\1\64\1\65\1\66"+
            "\1\67\1\70\1\71\1\72\7\52\2\35\105\uffff\1\35",
            "\1\56\13\uffff\3\52\1\57\1\60\1\61\1\62\1\63\1\64\1\65\1\66"+
            "\1\67\1\70\1\71\1\72\7\52\107\uffff\1\35",
            "\1\56\13\uffff\3\52\1\57\1\60\1\61\1\62\1\63\1\64\1\65\1\66"+
            "\1\67\1\70\1\71\1\72\7\52\107\uffff\1\35",
            "",
            "\2\52\54\uffff\2\52\64\35\2\uffff\1\52\1\107\1\111\1\110\1"+
            "\112\1\35",
            "\2\52\54\uffff\2\52\64\35\2\uffff\1\52\1\107\1\111\1\110\1"+
            "\112\1\35",
            "\2\52\54\uffff\2\52\64\35\2\uffff\1\52\1\107\1\111\1\110\1"+
            "\112\1\35",
            "\2\52\54\uffff\2\52\64\35\2\uffff\1\52\1\107\1\111\1\110\1"+
            "\112\1\35",
            "\2\52\54\uffff\2\52\64\35\2\uffff\1\52\1\107\1\111\1\110\1"+
            "\112\1\35",
            "\2\52\54\uffff\2\52\64\35\2\uffff\1\52\1\107\1\111\1\110\1"+
            "\112\1\35",
            "\2\52\54\uffff\2\52\64\35\2\uffff\1\52\1\107\1\111\1\110\1"+
            "\112\1\35",
            "\2\52\54\uffff\2\52\64\35\2\uffff\1\52\1\107\1\111\1\110\1"+
            "\112\1\35",
            "\2\52\54\uffff\2\52\64\35\2\uffff\1\52\1\107\1\111\1\110\1"+
            "\112\1\35",
            "\2\52\54\uffff\2\52\64\35\2\uffff\1\52\1\107\1\111\1\110\1"+
            "\112\1\35",
            "\2\52\54\uffff\2\52\64\35\2\uffff\1\52\1\107\1\111\1\110\1"+
            "\112\1\35",
            "\2\52\54\uffff\2\52\64\35\2\uffff\1\52\1\107\1\111\1\110\1"+
            "\112\1\35",
            "",
            "\1\54\1\55",
            "\3\162\1\uffff\1\162\2\uffff\7\162\2\uffff\3\162\1\116\1\117"+
            "\1\120\1\121\1\122\1\123\1\124\1\125\1\126\1\127\1\130\1\131"+
            "\7\162\6\uffff\1\132\1\133\1\134\1\135\1\136\1\137\1\140\1\141"+
            "\1\142\1\143\1\144\1\145\1\146\1\147\1\150\1\151\1\152\1\153"+
            "\1\154\1\155\1\156\37\113\1\uffff\2\113\1\114\1\115\1\157\1"+
            "\160\1\161",
            "\3\162\1\uffff\1\162\2\uffff\7\162\2\uffff\3\162\1\116\1\117"+
            "\1\120\1\121\1\122\1\123\1\124\1\125\1\126\1\127\1\130\1\131"+
            "\7\162\6\uffff\1\132\1\133\1\134\1\135\1\136\1\137\1\140\1\141"+
            "\1\142\1\143\1\144\1\145\1\146\1\147\1\150\1\151\1\152\1\153"+
            "\1\154\1\155\1\156\37\113\1\uffff\2\113\1\114\1\115\1\157\1"+
            "\160\1\161",
            "\2\52\7\uffff\1\163\1\164\7\uffff\2\52\32\uffff\2\52\66\uffff"+
            "\5\52",
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
            "\1\75\1\77\1\74\1\101\1\102\1\76\1\100\1\103\1\104\14\uffff"+
            "\11\35",
            "\1\56\13\uffff\3\52\1\57\1\60\1\61\1\62\1\63\1\64\1\65\1\66"+
            "\1\67\1\70\1\71\1\72\7\52\107\uffff\1\35",
            "\1\56\13\uffff\3\52\1\57\1\60\1\61\1\62\1\63\1\64\1\65\1\66"+
            "\1\67\1\70\1\71\1\72\7\52\107\uffff\1\35",
            "\1\56\13\uffff\3\52\1\57\1\60\1\61\1\62\1\63\1\64\1\65\1\66"+
            "\1\67\1\70\1\71\1\72\7\52\107\uffff\1\35",
            "\1\56\13\uffff\3\52\1\57\1\60\1\61\1\62\1\63\1\64\1\65\1\66"+
            "\1\67\1\70\1\71\1\72\7\52\107\uffff\1\35",
            "\1\56\13\uffff\3\52\1\57\1\60\1\61\1\62\1\63\1\64\1\65\1\66"+
            "\1\67\1\70\1\71\1\72\7\52\107\uffff\1\35",
            "\1\56\13\uffff\3\52\1\57\1\60\1\61\1\62\1\63\1\64\1\65\1\66"+
            "\1\67\1\70\1\71\1\72\7\52\107\uffff\1\35",
            "\1\56\13\uffff\3\52\1\57\1\60\1\61\1\62\1\63\1\64\1\65\1\66"+
            "\1\67\1\70\1\71\1\72\7\52\107\uffff\1\35",
            "\1\56\13\uffff\3\52\1\57\1\60\1\61\1\62\1\63\1\64\1\65\1\66"+
            "\1\67\1\70\1\71\1\72\7\52\107\uffff\1\35",
            "\1\56\13\uffff\3\52\1\57\1\60\1\61\1\62\1\63\1\64\1\65\1\66"+
            "\1\67\1\70\1\71\1\72\7\52\107\uffff\1\35",
            "\1\106\24\uffff\1\35",
            "\1\56\13\uffff\3\52\1\57\1\60\1\61\1\62\1\63\1\64\1\65\1\66"+
            "\1\67\1\70\1\71\1\72\7\52\107\uffff\1\35",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "\1\162\13\uffff\3\162\1\165\1\166\1\167\1\170\1\171\1\172\1"+
            "\173\1\174\1\175\1\176\1\177\1\u0080\7\162\2\113\105\uffff\1"+
            "\113",
            "\1\162\13\uffff\3\162\1\165\1\166\1\167\1\170\1\171\1\172\1"+
            "\173\1\174\1\175\1\176\1\177\1\u0080\7\162\2\113\105\uffff\1"+
            "\113",
            "\2\162\54\uffff\2\162\64\113\2\uffff\1\162\1\u0081\1\u0083"+
            "\1\u0082\1\u0084\1\113",
            "\2\162\54\uffff\2\162\64\113\2\uffff\1\162\1\u0081\1\u0083"+
            "\1\u0082\1\u0084\1\113",
            "\2\162\54\uffff\2\162\64\113\2\uffff\1\162\1\u0081\1\u0083"+
            "\1\u0082\1\u0084\1\113",
            "\2\162\54\uffff\2\162\64\113\2\uffff\1\162\1\u0081\1\u0083"+
            "\1\u0082\1\u0084\1\113",
            "\2\162\54\uffff\2\162\64\113\2\uffff\1\162\1\u0081\1\u0083"+
            "\1\u0082\1\u0084\1\113",
            "\2\162\54\uffff\2\162\64\113\2\uffff\1\162\1\u0081\1\u0083"+
            "\1\u0082\1\u0084\1\113",
            "\2\162\54\uffff\2\162\64\113\2\uffff\1\162\1\u0081\1\u0083"+
            "\1\u0082\1\u0084\1\113",
            "\2\162\54\uffff\2\162\64\113\2\uffff\1\162\1\u0081\1\u0083"+
            "\1\u0082\1\u0084\1\113",
            "\2\162\54\uffff\2\162\64\113\2\uffff\1\162\1\u0081\1\u0083"+
            "\1\u0082\1\u0084\1\113",
            "\2\162\54\uffff\2\162\64\113\2\uffff\1\162\1\u0081\1\u0083"+
            "\1\u0082\1\u0084\1\113",
            "\2\162\54\uffff\2\162\64\113\2\uffff\1\162\1\u0081\1\u0083"+
            "\1\u0082\1\u0084\1\113",
            "\2\162\54\uffff\2\162\64\113\2\uffff\1\162\1\u0081\1\u0083"+
            "\1\u0082\1\u0084\1\113",
            "\1\162\13\uffff\3\162\1\165\1\166\1\167\1\170\1\171\1\172\1"+
            "\173\1\174\1\175\1\176\1\177\1\u0080\7\162\107\uffff\1\113",
            "\1\162\13\uffff\3\162\1\165\1\166\1\167\1\170\1\171\1\172\1"+
            "\173\1\174\1\175\1\176\1\177\1\u0080\7\162\107\uffff\1\113",
            "\1\162\13\uffff\3\162\1\165\1\166\1\167\1\170\1\171\1\172\1"+
            "\173\1\174\1\175\1\176\1\177\1\u0080\7\162\107\uffff\1\113",
            "\1\162\13\uffff\3\162\1\165\1\166\1\167\1\170\1\171\1\172\1"+
            "\173\1\174\1\175\1\176\1\177\1\u0080\7\162\107\uffff\1\113",
            "\1\162\13\uffff\3\162\1\165\1\166\1\167\1\170\1\171\1\172\1"+
            "\173\1\174\1\175\1\176\1\177\1\u0080\7\162\107\uffff\1\113",
            "\1\162\13\uffff\3\162\1\165\1\166\1\167\1\170\1\171\1\172\1"+
            "\173\1\174\1\175\1\176\1\177\1\u0080\7\162\107\uffff\1\113",
            "\1\162\13\uffff\3\162\1\165\1\166\1\167\1\170\1\171\1\172\1"+
            "\173\1\174\1\175\1\176\1\177\1\u0080\7\162\107\uffff\1\113",
            "\1\162\13\uffff\3\162\1\165\1\166\1\167\1\170\1\171\1\172\1"+
            "\173\1\174\1\175\1\176\1\177\1\u0080\7\162\107\uffff\1\113",
            "\1\162\13\uffff\3\162\1\165\1\166\1\167\1\170\1\171\1\172\1"+
            "\173\1\174\1\175\1\176\1\177\1\u0080\7\162\107\uffff\1\113",
            "\1\162\13\uffff\3\162\1\165\1\166\1\167\1\170\1\171\1\172\1"+
            "\173\1\174\1\175\1\176\1\177\1\u0080\7\162\107\uffff\1\113",
            "\1\162\13\uffff\3\162\1\165\1\166\1\167\1\170\1\171\1\172\1"+
            "\173\1\174\1\175\1\176\1\177\1\u0080\7\162\107\uffff\1\113",
            "\1\162\13\uffff\3\162\1\165\1\166\1\167\1\170\1\171\1\172\1"+
            "\173\1\174\1\175\1\176\1\177\1\u0080\7\162\107\uffff\1\113",
            "\1\162\13\uffff\3\162\1\165\1\166\1\167\1\170\1\171\1\172\1"+
            "\173\1\174\1\175\1\176\1\177\1\u0080\7\162\107\uffff\1\113",
            "\1\162\13\uffff\3\162\1\165\1\166\1\167\1\170\1\171\1\172\1"+
            "\173\1\174\1\175\1\176\1\177\1\u0080\7\162\107\uffff\1\113",
            "\1\162\13\uffff\3\162\1\165\1\166\1\167\1\170\1\171\1\172\1"+
            "\173\1\174\1\175\1\176\1\177\1\u0080\7\162\107\uffff\1\113",
            "\1\162\13\uffff\3\162\1\165\1\166\1\167\1\170\1\171\1\172\1"+
            "\173\1\174\1\175\1\176\1\177\1\u0080\7\162\107\uffff\1\113",
            "\1\162\13\uffff\3\162\1\165\1\166\1\167\1\170\1\171\1\172\1"+
            "\173\1\174\1\175\1\176\1\177\1\u0080\7\162\107\uffff\1\113",
            "\1\162\13\uffff\3\162\1\165\1\166\1\167\1\170\1\171\1\172\1"+
            "\173\1\174\1\175\1\176\1\177\1\u0080\7\162\107\uffff\1\113",
            "\1\162\13\uffff\3\162\1\165\1\166\1\167\1\170\1\171\1\172\1"+
            "\173\1\174\1\175\1\176\1\177\1\u0080\7\162\107\uffff\1\113",
            "\1\162\13\uffff\3\162\1\165\1\166\1\167\1\170\1\171\1\172\1"+
            "\173\1\174\1\175\1\176\1\177\1\u0080\7\162\1\u0085\5\uffff\1"+
            "\u008b\1\u008c\1\u0087\1\u0089\1\u0086\1\u008d\1\u0088\1\u008a"+
            "\1\u008e\14\uffff\11\113\43\uffff\1\113",
            "\1\162\13\uffff\3\162\1\165\1\166\1\167\1\170\1\171\1\172\1"+
            "\173\1\174\1\175\1\176\1\177\1\u0080\7\162\1\u008f\5\uffff\1"+
            "\u0090\24\uffff\1\113\53\uffff\1\113",
            "\1\162\13\uffff\3\162\1\165\1\166\1\167\1\170\1\171\1\172\1"+
            "\173\1\174\1\175\1\176\1\177\1\u0080\7\162\107\uffff\1\113",
            "\1\162\13\uffff\3\162\1\165\1\166\1\167\1\170\1\171\1\172\1"+
            "\173\1\174\1\175\1\176\1\177\1\u0080\7\162\107\uffff\1\113",
            "\1\162\13\uffff\3\162\1\165\1\166\1\167\1\170\1\171\1\172\1"+
            "\173\1\174\1\175\1\176\1\177\1\u0080\7\162\107\uffff\1\113",
            "",
            "\3\162\1\uffff\1\162\2\uffff\7\162\2\uffff\3\162\1\116\1\117"+
            "\1\120\1\121\1\122\1\123\1\124\1\125\1\126\1\127\1\130\1\131"+
            "\7\162\6\uffff\1\132\1\133\1\134\1\135\1\136\1\137\1\140\1\141"+
            "\1\142\1\143\1\144\1\145\1\146\1\147\1\150\1\151\1\152\1\153"+
            "\1\154\1\155\1\156\37\113\1\uffff\2\113\1\114\1\115\1\157\1"+
            "\160\1\161",
            "\3\162\1\uffff\1\162\2\uffff\7\162\2\uffff\3\162\1\116\1\117"+
            "\1\120\1\121\1\122\1\123\1\124\1\125\1\126\1\127\1\130\1\131"+
            "\7\162\6\uffff\1\132\1\133\1\134\1\135\1\136\1\137\1\140\1\141"+
            "\1\142\1\143\1\144\1\145\1\146\1\147\1\150\1\151\1\152\1\153"+
            "\1\154\1\155\1\156\37\113\1\uffff\2\113\1\114\1\115\1\157\1"+
            "\160\1\161",
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
            "\1\u008b\1\u008c\1\u0087\1\u0089\1\u0086\1\u008d\1\u0088\1"+
            "\u008a\1\u008e\14\uffff\11\113",
            "\1\162\13\uffff\3\162\1\165\1\166\1\167\1\170\1\171\1\172\1"+
            "\173\1\174\1\175\1\176\1\177\1\u0080\7\162\107\uffff\1\113",
            "\1\162\13\uffff\3\162\1\165\1\166\1\167\1\170\1\171\1\172\1"+
            "\173\1\174\1\175\1\176\1\177\1\u0080\7\162\107\uffff\1\113",
            "\1\162\13\uffff\3\162\1\165\1\166\1\167\1\170\1\171\1\172\1"+
            "\173\1\174\1\175\1\176\1\177\1\u0080\7\162\107\uffff\1\113",
            "\1\162\13\uffff\3\162\1\165\1\166\1\167\1\170\1\171\1\172\1"+
            "\173\1\174\1\175\1\176\1\177\1\u0080\7\162\107\uffff\1\113",
            "\1\162\13\uffff\3\162\1\165\1\166\1\167\1\170\1\171\1\172\1"+
            "\173\1\174\1\175\1\176\1\177\1\u0080\7\162\107\uffff\1\113",
            "\1\162\13\uffff\3\162\1\165\1\166\1\167\1\170\1\171\1\172\1"+
            "\173\1\174\1\175\1\176\1\177\1\u0080\7\162\107\uffff\1\113",
            "\1\162\13\uffff\3\162\1\165\1\166\1\167\1\170\1\171\1\172\1"+
            "\173\1\174\1\175\1\176\1\177\1\u0080\7\162\107\uffff\1\113",
            "\1\162\13\uffff\3\162\1\165\1\166\1\167\1\170\1\171\1\172\1"+
            "\173\1\174\1\175\1\176\1\177\1\u0080\7\162\107\uffff\1\113",
            "\1\162\13\uffff\3\162\1\165\1\166\1\167\1\170\1\171\1\172\1"+
            "\173\1\174\1\175\1\176\1\177\1\u0080\7\162\107\uffff\1\113",
            "\1\u0090\24\uffff\1\113",
            "\1\162\13\uffff\3\162\1\165\1\166\1\167\1\170\1\171\1\172\1"+
            "\173\1\174\1\175\1\176\1\177\1\u0080\7\162\107\uffff\1\113"
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
            return "35:1: date options {backtrack=true; } : ( date_prefix explicit_date -> ^( RELATIVE_DATE date_prefix explicit_date ) | explicit_date | date_prefix relative_date -> ^( RELATIVE_DATE date_prefix relative_date ) | relative_date );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA5_127 = input.LA(1);

                         
                        int index5_127 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Date()) ) {s = 75;}

                        else if ( (synpred5_Date()) ) {s = 114;}

                         
                        input.seek(index5_127);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA5_128 = input.LA(1);

                         
                        int index5_128 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Date()) ) {s = 75;}

                        else if ( (synpred5_Date()) ) {s = 114;}

                         
                        input.seek(index5_128);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA5_122 = input.LA(1);

                         
                        int index5_122 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Date()) ) {s = 75;}

                        else if ( (synpred5_Date()) ) {s = 114;}

                         
                        input.seek(index5_122);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA5_57 = input.LA(1);

                         
                        int index5_57 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_Date()) ) {s = 29;}

                        else if ( (true) ) {s = 42;}

                         
                        input.seek(index5_57);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA5_123 = input.LA(1);

                         
                        int index5_123 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Date()) ) {s = 75;}

                        else if ( (synpred5_Date()) ) {s = 114;}

                         
                        input.seek(index5_123);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA5_58 = input.LA(1);

                         
                        int index5_58 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_Date()) ) {s = 29;}

                        else if ( (true) ) {s = 42;}

                         
                        input.seek(index5_58);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA5_55 = input.LA(1);

                         
                        int index5_55 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_Date()) ) {s = 29;}

                        else if ( (true) ) {s = 42;}

                         
                        input.seek(index5_55);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA5_71 = input.LA(1);

                         
                        int index5_71 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_Date()) ) {s = 29;}

                        else if ( (true) ) {s = 42;}

                         
                        input.seek(index5_71);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA5_125 = input.LA(1);

                         
                        int index5_125 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Date()) ) {s = 75;}

                        else if ( (synpred5_Date()) ) {s = 114;}

                         
                        input.seek(index5_125);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA5_124 = input.LA(1);

                         
                        int index5_124 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Date()) ) {s = 75;}

                        else if ( (synpred5_Date()) ) {s = 114;}

                         
                        input.seek(index5_124);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA5_54 = input.LA(1);

                         
                        int index5_54 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_Date()) ) {s = 29;}

                        else if ( (true) ) {s = 42;}

                         
                        input.seek(index5_54);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA5_73 = input.LA(1);

                         
                        int index5_73 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_Date()) ) {s = 29;}

                        else if ( (true) ) {s = 42;}

                         
                        input.seek(index5_73);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA5_72 = input.LA(1);

                         
                        int index5_72 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_Date()) ) {s = 29;}

                        else if ( (true) ) {s = 42;}

                         
                        input.seek(index5_72);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA5_74 = input.LA(1);

                         
                        int index5_74 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_Date()) ) {s = 29;}

                        else if ( (true) ) {s = 42;}

                         
                        input.seek(index5_74);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA5_126 = input.LA(1);

                         
                        int index5_126 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Date()) ) {s = 75;}

                        else if ( (synpred5_Date()) ) {s = 114;}

                         
                        input.seek(index5_126);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA5_56 = input.LA(1);

                         
                        int index5_56 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_Date()) ) {s = 29;}

                        else if ( (true) ) {s = 42;}

                         
                        input.seek(index5_56);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA5_117 = input.LA(1);

                         
                        int index5_117 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Date()) ) {s = 75;}

                        else if ( (synpred5_Date()) ) {s = 114;}

                         
                        input.seek(index5_117);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA5_52 = input.LA(1);

                         
                        int index5_52 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_Date()) ) {s = 29;}

                        else if ( (true) ) {s = 42;}

                         
                        input.seek(index5_52);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA5_53 = input.LA(1);

                         
                        int index5_53 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_Date()) ) {s = 29;}

                        else if ( (true) ) {s = 42;}

                         
                        input.seek(index5_53);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA5_118 = input.LA(1);

                         
                        int index5_118 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Date()) ) {s = 75;}

                        else if ( (synpred5_Date()) ) {s = 114;}

                         
                        input.seek(index5_118);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA5_119 = input.LA(1);

                         
                        int index5_119 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Date()) ) {s = 75;}

                        else if ( (synpred5_Date()) ) {s = 114;}

                         
                        input.seek(index5_119);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA5_49 = input.LA(1);

                         
                        int index5_49 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_Date()) ) {s = 29;}

                        else if ( (true) ) {s = 42;}

                         
                        input.seek(index5_49);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA5_50 = input.LA(1);

                         
                        int index5_50 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_Date()) ) {s = 29;}

                        else if ( (true) ) {s = 42;}

                         
                        input.seek(index5_50);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA5_120 = input.LA(1);

                         
                        int index5_120 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Date()) ) {s = 75;}

                        else if ( (synpred5_Date()) ) {s = 114;}

                         
                        input.seek(index5_120);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA5_121 = input.LA(1);

                         
                        int index5_121 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Date()) ) {s = 75;}

                        else if ( (synpred5_Date()) ) {s = 114;}

                         
                        input.seek(index5_121);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA5_51 = input.LA(1);

                         
                        int index5_51 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_Date()) ) {s = 29;}

                        else if ( (true) ) {s = 42;}

                         
                        input.seek(index5_51);
                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA5_47 = input.LA(1);

                         
                        int index5_47 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_Date()) ) {s = 29;}

                        else if ( (true) ) {s = 42;}

                         
                        input.seek(index5_47);
                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA5_48 = input.LA(1);

                         
                        int index5_48 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_Date()) ) {s = 29;}

                        else if ( (true) ) {s = 42;}

                         
                        input.seek(index5_48);
                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA5_132 = input.LA(1);

                         
                        int index5_132 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Date()) ) {s = 75;}

                        else if ( (synpred5_Date()) ) {s = 114;}

                         
                        input.seek(index5_132);
                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA5_131 = input.LA(1);

                         
                        int index5_131 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Date()) ) {s = 75;}

                        else if ( (synpred5_Date()) ) {s = 114;}

                         
                        input.seek(index5_131);
                        if ( s>=0 ) return s;
                        break;
                    case 30 : 
                        int LA5_130 = input.LA(1);

                         
                        int index5_130 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Date()) ) {s = 75;}

                        else if ( (synpred5_Date()) ) {s = 114;}

                         
                        input.seek(index5_130);
                        if ( s>=0 ) return s;
                        break;
                    case 31 : 
                        int LA5_129 = input.LA(1);

                         
                        int index5_129 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Date()) ) {s = 75;}

                        else if ( (synpred5_Date()) ) {s = 114;}

                         
                        input.seek(index5_129);
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
    static final String DFA9_eotS =
        "\102\uffff";
    static final String DFA9_eofS =
        "\36\uffff\27\3\15\uffff";
    static final String DFA9_minS =
        "\1\27\3\uffff\32\33\27\23\1\103\11\33\1\103\1\33\1\uffff";
    static final String DFA9_maxS =
        "\1\176\3\uffff\23\74\1\113\1\103\5\74\27\175\1\113\11\74\1\103\1"+
        "\74\1\uffff";
    static final String DFA9_acceptS =
        "\1\uffff\1\1\1\2\1\3\75\uffff\1\4";
    static final String DFA9_specialS =
        "\102\uffff}>";
    static final String[] DFA9_transitionS = {
            "\3\1\1\uffff\1\2\2\uffff\7\3\2\uffff\26\2\6\uffff\1\4\1\5\1"+
            "\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22"+
            "\1\23\1\24\1\25\1\26\1\27\1\30\42\uffff\1\31\1\33\1\32\1\34"+
            "\1\35",
            "",
            "",
            "",
            "\1\45\13\uffff\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56"+
            "\1\57\1\60\1\61\1\62\1\63\1\64\1\36\1\37\1\40\1\41\1\42\1\43"+
            "\1\44",
            "\1\45\13\uffff\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56"+
            "\1\57\1\60\1\61\1\62\1\63\1\64\1\36\1\37\1\40\1\41\1\42\1\43"+
            "\1\44",
            "\1\45\13\uffff\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56"+
            "\1\57\1\60\1\61\1\62\1\63\1\64\1\36\1\37\1\40\1\41\1\42\1\43"+
            "\1\44",
            "\1\45\13\uffff\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56"+
            "\1\57\1\60\1\61\1\62\1\63\1\64\1\36\1\37\1\40\1\41\1\42\1\43"+
            "\1\44",
            "\1\45\13\uffff\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56"+
            "\1\57\1\60\1\61\1\62\1\63\1\64\1\36\1\37\1\40\1\41\1\42\1\43"+
            "\1\44",
            "\1\45\13\uffff\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56"+
            "\1\57\1\60\1\61\1\62\1\63\1\64\1\36\1\37\1\40\1\41\1\42\1\43"+
            "\1\44",
            "\1\45\13\uffff\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56"+
            "\1\57\1\60\1\61\1\62\1\63\1\64\1\36\1\37\1\40\1\41\1\42\1\43"+
            "\1\44",
            "\1\45\13\uffff\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56"+
            "\1\57\1\60\1\61\1\62\1\63\1\64\1\36\1\37\1\40\1\41\1\42\1\43"+
            "\1\44",
            "\1\45\13\uffff\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56"+
            "\1\57\1\60\1\61\1\62\1\63\1\64\1\36\1\37\1\40\1\41\1\42\1\43"+
            "\1\44",
            "\1\45\13\uffff\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56"+
            "\1\57\1\60\1\61\1\62\1\63\1\64\1\36\1\37\1\40\1\41\1\42\1\43"+
            "\1\44",
            "\1\45\13\uffff\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56"+
            "\1\57\1\60\1\61\1\62\1\63\1\64\1\36\1\37\1\40\1\41\1\42\1\43"+
            "\1\44",
            "\1\45\13\uffff\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56"+
            "\1\57\1\60\1\61\1\62\1\63\1\64\1\36\1\37\1\40\1\41\1\42\1\43"+
            "\1\44",
            "\1\45\13\uffff\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56"+
            "\1\57\1\60\1\61\1\62\1\63\1\64\1\36\1\37\1\40\1\41\1\42\1\43"+
            "\1\44",
            "\1\45\13\uffff\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56"+
            "\1\57\1\60\1\61\1\62\1\63\1\64\1\36\1\37\1\40\1\41\1\42\1\43"+
            "\1\44",
            "\1\45\13\uffff\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56"+
            "\1\57\1\60\1\61\1\62\1\63\1\64\1\36\1\37\1\40\1\41\1\42\1\43"+
            "\1\44",
            "\1\45\13\uffff\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56"+
            "\1\57\1\60\1\61\1\62\1\63\1\64\1\36\1\37\1\40\1\41\1\42\1\43"+
            "\1\44",
            "\1\45\13\uffff\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56"+
            "\1\57\1\60\1\61\1\62\1\63\1\64\1\36\1\37\1\40\1\41\1\42\1\43"+
            "\1\44",
            "\1\45\13\uffff\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56"+
            "\1\57\1\60\1\61\1\62\1\63\1\64\1\36\1\37\1\40\1\41\1\42\1\43"+
            "\1\44",
            "\1\45\13\uffff\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56"+
            "\1\57\1\60\1\61\1\62\1\63\1\64\1\36\1\37\1\40\1\41\1\42\1\43"+
            "\1\44",
            "\1\45\13\uffff\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56"+
            "\1\57\1\60\1\61\1\62\1\63\1\64\1\36\1\37\1\40\1\41\1\42\1\43"+
            "\1\44\1\65\5\uffff\1\72\1\75\1\66\1\71\1\74\1\76\1\70\1\73\1"+
            "\67",
            "\1\45\13\uffff\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56"+
            "\1\57\1\60\1\61\1\62\1\63\1\64\1\36\1\37\1\40\1\41\1\42\1\43"+
            "\1\44\1\77\5\uffff\1\100",
            "\1\45\13\uffff\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56"+
            "\1\57\1\60\1\61\1\62\1\63\1\64\1\36\1\37\1\40\1\41\1\42\1\43"+
            "\1\44",
            "\1\45\13\uffff\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56"+
            "\1\57\1\60\1\61\1\62\1\63\1\64\1\36\1\37\1\40\1\41\1\42\1\43"+
            "\1\44",
            "\1\45\13\uffff\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56"+
            "\1\57\1\60\1\61\1\62\1\63\1\64\1\36\1\37\1\40\1\41\1\42\1\43"+
            "\1\44",
            "\1\45\13\uffff\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56"+
            "\1\57\1\60\1\61\1\62\1\63\1\64\1\36\1\37\1\40\1\41\1\42\1\43"+
            "\1\44",
            "\1\45\13\uffff\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56"+
            "\1\57\1\60\1\61\1\62\1\63\1\64\1\36\1\37\1\40\1\41\1\42\1\43"+
            "\1\44",
            "\2\3\20\uffff\2\101\32\uffff\2\3\66\uffff\5\3",
            "\2\3\20\uffff\2\101\32\uffff\2\3\66\uffff\5\3",
            "\2\3\20\uffff\2\101\32\uffff\2\3\66\uffff\5\3",
            "\2\3\20\uffff\2\101\32\uffff\2\3\66\uffff\5\3",
            "\2\3\20\uffff\2\101\32\uffff\2\3\66\uffff\5\3",
            "\2\3\20\uffff\2\101\32\uffff\2\3\66\uffff\5\3",
            "\2\3\20\uffff\2\101\32\uffff\2\3\66\uffff\5\3",
            "\2\3\20\uffff\2\101\32\uffff\2\3\66\uffff\5\3",
            "\2\3\20\uffff\2\101\32\uffff\2\3\66\uffff\5\3",
            "\2\3\20\uffff\2\101\32\uffff\2\3\66\uffff\5\3",
            "\2\3\20\uffff\2\101\32\uffff\2\3\66\uffff\5\3",
            "\2\3\20\uffff\2\101\32\uffff\2\3\66\uffff\5\3",
            "\2\3\20\uffff\2\101\32\uffff\2\3\66\uffff\5\3",
            "\2\3\20\uffff\2\101\32\uffff\2\3\66\uffff\5\3",
            "\2\3\20\uffff\2\101\32\uffff\2\3\66\uffff\5\3",
            "\2\3\20\uffff\2\101\32\uffff\2\3\66\uffff\5\3",
            "\2\3\20\uffff\2\101\32\uffff\2\3\66\uffff\5\3",
            "\2\3\20\uffff\2\101\32\uffff\2\3\66\uffff\5\3",
            "\2\3\20\uffff\2\101\32\uffff\2\3\66\uffff\5\3",
            "\2\3\20\uffff\2\101\32\uffff\2\3\66\uffff\5\3",
            "\2\3\20\uffff\2\101\32\uffff\2\3\66\uffff\5\3",
            "\2\3\20\uffff\2\101\32\uffff\2\3\66\uffff\5\3",
            "\2\3\20\uffff\2\101\32\uffff\2\3\66\uffff\5\3",
            "\1\72\1\75\1\66\1\71\1\74\1\76\1\70\1\73\1\67",
            "\1\45\13\uffff\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56"+
            "\1\57\1\60\1\61\1\62\1\63\1\64\1\36\1\37\1\40\1\41\1\42\1\43"+
            "\1\44",
            "\1\45\13\uffff\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56"+
            "\1\57\1\60\1\61\1\62\1\63\1\64\1\36\1\37\1\40\1\41\1\42\1\43"+
            "\1\44",
            "\1\45\13\uffff\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56"+
            "\1\57\1\60\1\61\1\62\1\63\1\64\1\36\1\37\1\40\1\41\1\42\1\43"+
            "\1\44",
            "\1\45\13\uffff\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56"+
            "\1\57\1\60\1\61\1\62\1\63\1\64\1\36\1\37\1\40\1\41\1\42\1\43"+
            "\1\44",
            "\1\45\13\uffff\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56"+
            "\1\57\1\60\1\61\1\62\1\63\1\64\1\36\1\37\1\40\1\41\1\42\1\43"+
            "\1\44",
            "\1\45\13\uffff\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56"+
            "\1\57\1\60\1\61\1\62\1\63\1\64\1\36\1\37\1\40\1\41\1\42\1\43"+
            "\1\44",
            "\1\45\13\uffff\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56"+
            "\1\57\1\60\1\61\1\62\1\63\1\64\1\36\1\37\1\40\1\41\1\42\1\43"+
            "\1\44",
            "\1\45\13\uffff\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56"+
            "\1\57\1\60\1\61\1\62\1\63\1\64\1\36\1\37\1\40\1\41\1\42\1\43"+
            "\1\44",
            "\1\45\13\uffff\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56"+
            "\1\57\1\60\1\61\1\62\1\63\1\64\1\36\1\37\1\40\1\41\1\42\1\43"+
            "\1\44",
            "\1\100",
            "\1\45\13\uffff\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56"+
            "\1\57\1\60\1\61\1\62\1\63\1\64\1\36\1\37\1\40\1\41\1\42\1\43"+
            "\1\44",
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
            return "50:1: relative_date : ( named_relative_date | modifiable_target -> ^( RELATIVE_DATE SEEK_DIR[\">\"] SEEK_TYPE[\"by_day\"] INT[\"1\"] modifiable_target ) | target_prefix modifiable_target -> ^( RELATIVE_DATE target_prefix modifiable_target ) | spelled_or_int_1_to_31 modifiable_target target_suffix -> ^( RELATIVE_DATE target_suffix spelled_or_int_1_to_31 modifiable_target ) );";
        }
    }
    static final String DFA18_eotS =
        "\56\uffff";
    static final String DFA18_eofS =
        "\56\uffff";
    static final String DFA18_minS =
        "\1\32\1\33\1\34\32\33\2\uffff\1\34\1\103\11\33\1\103\1\33\2\uffff";
    static final String DFA18_maxS =
        "\1\176\1\33\1\35\23\33\1\113\1\103\5\33\2\uffff\1\35\1\113\11\33"+
        "\1\103\1\33\2\uffff";
    static final String DFA18_acceptS =
        "\35\uffff\1\1\1\3\15\uffff\1\2\1\4";
    static final String DFA18_specialS =
        "\56\uffff}>";
    static final String[] DFA18_transitionS = {
            "\1\1\1\2\47\uffff\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1"+
            "\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\42"+
            "\uffff\1\30\1\32\1\31\1\33\1\34",
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
            "\1\37\41\uffff\1\40\5\uffff\1\46\1\50\1\44\1\41\1\47\1\42\1"+
            "\43\1\51\1\45",
            "\1\37\41\uffff\1\52\5\uffff\1\53",
            "\1\37",
            "\1\37",
            "\1\37",
            "\1\37",
            "\1\37",
            "",
            "",
            "\1\54\1\55",
            "\1\46\1\50\1\44\1\41\1\47\1\42\1\43\1\51\1\45",
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

    static final short[] DFA18_eot = DFA.unpackEncodedString(DFA18_eotS);
    static final short[] DFA18_eof = DFA.unpackEncodedString(DFA18_eofS);
    static final char[] DFA18_min = DFA.unpackEncodedStringToUnsignedChars(DFA18_minS);
    static final char[] DFA18_max = DFA.unpackEncodedStringToUnsignedChars(DFA18_maxS);
    static final short[] DFA18_accept = DFA.unpackEncodedString(DFA18_acceptS);
    static final short[] DFA18_special = DFA.unpackEncodedString(DFA18_specialS);
    static final short[][] DFA18_transition;

    static {
        int numStates = DFA18_transitionS.length;
        DFA18_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA18_transition[i] = DFA.unpackEncodedString(DFA18_transitionS[i]);
        }
    }

    class DFA18 extends DFA {

        public DFA18(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 18;
            this.eot = DFA18_eot;
            this.eof = DFA18_eof;
            this.min = DFA18_min;
            this.max = DFA18_max;
            this.accept = DFA18_accept;
            this.special = DFA18_special;
            this.transition = DFA18_transition;
        }
        public String getDescription() {
            return "94:1: date_prefix : ( ( THE )? DAY AFTER -> SEEK_DIR[\">\"] INT[\"1\"] | spelled_or_int_1_to_31 DAY AFTER -> SEEK_DIR[\">\"] spelled_or_int_1_to_31 | ( THE )? DAY BEFORE -> SEEK_DIR[\"<\"] INT[\"1\"] | spelled_or_int_1_to_31 DAY BEFORE -> SEEK_DIR[\"<\"] spelled_or_int_1_to_31 );";
        }
    }
    static final String DFA50_eotS =
        "\43\uffff";
    static final String DFA50_eofS =
        "\24\uffff\1\37\1\42\15\uffff";
    static final String DFA50_minS =
        "\1\103\23\uffff\2\23\1\103\14\uffff";
    static final String DFA50_maxS =
        "\1\127\23\uffff\2\u0085\1\113\14\uffff";
    static final String DFA50_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1"+
        "\15\1\16\1\17\1\20\1\21\1\22\1\23\3\uffff\1\35\1\32\1\27\1\31\1"+
        "\34\1\33\1\25\1\26\1\24\1\30\1\37\1\36";
    static final String DFA50_specialS =
        "\43\uffff}>";
    static final String[] DFA50_transitionS = {
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
            "\2\37\6\uffff\1\37\10\uffff\1\37\2\uffff\26\37\1\26\3\uffff"+
            "\2\37\1\35\1\36\1\31\1\40\1\32\1\30\1\34\1\33\1\27\53\uffff"+
            "\11\37\1\uffff\1\37\2\uffff\2\37",
            "\2\42\6\uffff\1\42\10\uffff\1\42\2\uffff\26\42\1\41\3\uffff"+
            "\2\42\1\41\63\uffff\11\42\1\uffff\1\42\2\uffff\2\42",
            "\1\35\1\36\1\31\1\40\1\32\1\30\1\34\1\33\1\27",
            "",
            "",
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

    static final short[] DFA50_eot = DFA.unpackEncodedString(DFA50_eotS);
    static final short[] DFA50_eof = DFA.unpackEncodedString(DFA50_eofS);
    static final char[] DFA50_min = DFA.unpackEncodedStringToUnsignedChars(DFA50_minS);
    static final char[] DFA50_max = DFA.unpackEncodedStringToUnsignedChars(DFA50_maxS);
    static final short[] DFA50_accept = DFA.unpackEncodedString(DFA50_acceptS);
    static final short[] DFA50_special = DFA.unpackEncodedString(DFA50_specialS);
    static final short[][] DFA50_transition;

    static {
        int numStates = DFA50_transitionS.length;
        DFA50_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA50_transition[i] = DFA.unpackEncodedString(DFA50_transitionS[i]);
        }
    }

    class DFA50 extends DFA {

        public DFA50(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 50;
            this.eot = DFA50_eot;
            this.eof = DFA50_eof;
            this.min = DFA50_min;
            this.max = DFA50_max;
            this.accept = DFA50_accept;
            this.special = DFA50_special;
            this.transition = DFA50_transition;
        }
        public String getDescription() {
            return "193:1: spelled_1_to_31 : ( ONE -> INT[\"1\"] | TWO -> INT[\"2\"] | THREE -> INT[\"3\"] | FOUR -> INT[\"4\"] | FIVE -> INT[\"5\"] | SIX -> INT[\"6\"] | SEVEN -> INT[\"7\"] | EIGHT -> INT[\"8\"] | NINE -> INT[\"9\"] | TEN -> INT[\"10\"] | ELEVEN -> INT[\"11\"] | TWELVE -> INT[\"12\"] | THIRTEEN -> INT[\"13\"] | FOURTEEN -> INT[\"14\"] | FIFTEEN -> INT[\"15\"] | SIXTEEN -> INT[\"16\"] | SEVENTEEN -> INT[\"17\"] | EIGHTEEN -> INT[\"18\"] | NINETEEN -> INT[\"19\"] | TWENTY -> INT[\"20\"] | TWENTY ( DASH )? ONE -> INT[\"21\"] | TWENTY ( DASH )? TWO -> INT[\"22\"] | TWENTY ( DASH )? THREE -> INT[\"23\"] | TWENTY ( DASH )? FOUR -> INT[\"24\"] | TWENTY ( DASH )? FIVE -> INT[\"25\"] | TWENTY ( DASH )? SIX -> INT[\"26\"] | TWENTY ( DASH )? SEVEN -> INT[\"27\"] | TWENTY ( DASH )? EIGHT -> INT[\"28\"] | TWENTY ( DASH )? NINE -> INT[\"29\"] | THIRTY -> INT[\"30\"] | THIRTY ( DASH )? ONE -> INT[\"31\"] );";
        }
    }
    static final String DFA72_eotS =
        "\42\uffff";
    static final String DFA72_eofS =
        "\42\uffff";
    static final String DFA72_minS =
        "\1\126\25\uffff\1\75\12\uffff\1\130";
    static final String DFA72_maxS =
        "\1\166\25\uffff\1\140\12\uffff\1\140";
    static final String DFA72_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1"+
        "\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\uffff\1\26\1\27\1"+
        "\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\uffff";
    static final String DFA72_specialS =
        "\42\uffff}>";
    static final String[] DFA72_transitionS = {
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
            "\1\41\32\uffff\1\25\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36",
            "",
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

    static final short[] DFA72_eot = DFA.unpackEncodedString(DFA72_eotS);
    static final short[] DFA72_eof = DFA.unpackEncodedString(DFA72_eofS);
    static final char[] DFA72_min = DFA.unpackEncodedStringToUnsignedChars(DFA72_minS);
    static final char[] DFA72_max = DFA.unpackEncodedStringToUnsignedChars(DFA72_maxS);
    static final short[] DFA72_accept = DFA.unpackEncodedString(DFA72_acceptS);
    static final short[] DFA72_special = DFA.unpackEncodedString(DFA72_specialS);
    static final short[][] DFA72_transition;

    static {
        int numStates = DFA72_transitionS.length;
        DFA72_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA72_transition[i] = DFA.unpackEncodedString(DFA72_transitionS[i]);
        }
    }

    class DFA72 extends DFA {

        public DFA72(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 72;
            this.eot = DFA72_eot;
            this.eof = DFA72_eof;
            this.min = DFA72_min;
            this.max = DFA72_max;
            this.accept = DFA72_accept;
            this.special = DFA72_special;
            this.transition = DFA72_transition;
        }
        public String getDescription() {
            return "234:1: spelled_sequence_1_to_31 : ( FIRST -> INT[\"1\"] | SECOND -> INT[\"2\"] | THIRD -> INT[\"3\"] | FOURTH -> INT[\"4\"] | FIFTH -> INT[\"5\"] | SIXTH -> INT[\"6\"] | SEVENTH -> INT[\"7\"] | EIGHTH -> INT[\"8\"] | NINTH -> INT[\"9\"] | TENTH -> INT[\"10\"] | ELEVENTH -> INT[\"11\"] | TWELFTH -> INT[\"12\"] | THIRTEENTH -> INT[\"13\"] | FOURTEENTH -> INT[\"14\"] | FIFTEENTH -> INT[\"15\"] | SIXTEENTH -> INT[\"16\"] | SEVENTEENTH -> INT[\"17\"] | EIGHTEENTH -> INT[\"18\"] | NINETEENTH -> INT[\"19\"] | TWENTIETH -> INT[\"20\"] | ( TWENTY_FIRST | ( TWENTY ( DASH )? FIRST ) ) -> INT[\"21\"] | ( TWENTY_SECOND | ( TWENTY ( DASH )? SECOND ) ) -> INT[\"22\"] | ( TWENTY_THIRD | ( TWENTY ( DASH )? THIRD ) ) -> INT[\"23\"] | ( TWENTY_FOURTH | ( TWENTY ( DASH )? FOURTH ) ) -> INT[\"24\"] | ( TWENTY_FIFTH | ( TWENTY ( DASH )? FIFTH ) ) -> INT[\"25\"] | ( TWENTY_SIXTH | ( TWENTY ( DASH )? SIXTH ) ) -> INT[\"26\"] | ( TWENTY_SEVENTH | ( TWENTY ( DASH )? SEVENTH ) ) -> INT[\"27\"] | ( TWENTY_EIGHTH | ( TWENTY ( DASH )? EIGHTH ) ) -> INT[\"28\"] | ( TWENTY_NINTH | ( TWENTY ( DASH )? NINTH ) ) -> INT[\"29\"] | THIRTIETH -> INT[\"30\"] | ( THIRTY_FIRST | ( THIRTY ( DASH )? FIRST ) ) -> INT[\"31\"] );";
        }
    }
 

    public static final BitSet FOLLOW_date_in_datetime135 = new BitSet(new long[]{0x0000000000180002L,0x3E00000000000006L});
    public static final BitSet FOLLOW_AT_in_datetime138 = new BitSet(new long[]{0x0000000000000002L,0x3E00000000000006L});
    public static final BitSet FOLLOW_COMMA_in_datetime142 = new BitSet(new long[]{0x0000000000000002L,0x3E00000000000006L});
    public static final BitSet FOLLOW_time_in_datetime146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_time_in_datetime164 = new BitSet(new long[]{0x1FFFFF9FCFA00000L,0x7F7FFFFFFFFFFFF8L});
    public static final BitSet FOLLOW_ON_in_datetime166 = new BitSet(new long[]{0x1FFFFF9FCFA00000L,0x7F7FFFFFFFFFFFF8L});
    public static final BitSet FOLLOW_date_in_datetime169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_time_in_datetime196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_date_prefix_in_date259 = new BitSet(new long[]{0x003FFC0000000000L,0x7F7FFFFFFFFFFFF8L});
    public static final BitSet FOLLOW_explicit_date_in_date261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_explicit_date_in_date277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_date_prefix_in_date283 = new BitSet(new long[]{0x1FFFFF9FCFA00000L,0x7F7FFFFFFFFFFFF8L});
    public static final BitSet FOLLOW_relative_date_in_date285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relative_date_in_date301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_hours_in_time317 = new BitSet(new long[]{0x8000000000400002L,0x0000000000000001L});
    public static final BitSet FOLLOW_COLON_in_time320 = new BitSet(new long[]{0x0000000000000000L,0xFE00000000000000L});
    public static final BitSet FOLLOW_minutes_in_time322 = new BitSet(new long[]{0x8000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_meridian_indicator_in_time326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_time_identifier_in_time354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_named_relative_date_in_relative_date370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_modifiable_target_in_relative_date382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_target_prefix_in_relative_date416 = new BitSet(new long[]{0x1FFFFF8008000000L});
    public static final BitSet FOLLOW_modifiable_target_in_relative_date418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spelled_or_int_1_to_31_in_relative_date447 = new BitSet(new long[]{0x1FFFFF8008000000L});
    public static final BitSet FOLLOW_modifiable_target_in_relative_date449 = new BitSet(new long[]{0x0000006000000000L});
    public static final BitSet FOLLOW_target_suffix_in_relative_date451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TODAY_in_named_relative_date483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOMORROW_in_named_relative_date505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_YESTERDAY_in_named_relative_date524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_int_4_digits_in_explicit_date562 = new BitSet(new long[]{0x6000000000000000L});
    public static final BitSet FOLLOW_date_separator_in_explicit_date564 = new BitSet(new long[]{0x0000000000000000L,0x0E00000000000000L});
    public static final BitSet FOLLOW_int_1_to_12_in_explicit_date566 = new BitSet(new long[]{0x6000000000000000L});
    public static final BitSet FOLLOW_date_separator_in_explicit_date568 = new BitSet(new long[]{0x0000000000000000L,0x7C00000000FFFFF8L});
    public static final BitSet FOLLOW_int_1_to_31_in_explicit_date570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_int_1_to_12_in_explicit_date608 = new BitSet(new long[]{0x6000000000000000L});
    public static final BitSet FOLLOW_date_separator_in_explicit_date610 = new BitSet(new long[]{0x0000000000000000L,0x7C00000000FFFFF8L});
    public static final BitSet FOLLOW_int_1_to_31_in_explicit_date612 = new BitSet(new long[]{0x6000000000000002L});
    public static final BitSet FOLLOW_date_separator_in_explicit_date615 = new BitSet(new long[]{0x0000000000000000L,0xEF80000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_int_up_to_4_digits_in_explicit_date617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_month_in_explicit_date662 = new BitSet(new long[]{0x003FFC0000000000L,0x7F7FFFFFFFFFFFF8L});
    public static final BitSet FOLLOW_day_of_month_in_explicit_date664 = new BitSet(new long[]{0x0000001000100002L,0xEF80000000000000L,0x0000000000000022L});
    public static final BitSet FOLLOW_year_in_explicit_date666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_day_of_month_in_explicit_date697 = new BitSet(new long[]{0x003FFC0000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_132_in_explicit_date699 = new BitSet(new long[]{0x003FFC0000000000L});
    public static final BitSet FOLLOW_month_in_explicit_date702 = new BitSet(new long[]{0x0000001000100002L,0xEF80000000000000L,0x0000000000000022L});
    public static final BitSet FOLLOW_year_in_explicit_date704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THE_in_date_prefix739 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_DAY_in_date_prefix742 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_AFTER_in_date_prefix744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spelled_or_int_1_to_31_in_date_prefix777 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_DAY_in_date_prefix779 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_AFTER_in_date_prefix781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THE_in_date_prefix795 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_DAY_in_date_prefix798 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_BEFORE_in_date_prefix800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spelled_or_int_1_to_31_in_date_prefix832 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_DAY_in_date_prefix834 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_BEFORE_in_date_prefix836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIS_in_target_prefix859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIS_in_target_prefix886 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_LAST_in_target_prefix889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIS_in_target_prefix910 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_PAST_in_target_prefix913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIS_in_target_prefix934 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_NEXT_in_target_prefix937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIS_in_target_prefix958 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_COMING_in_target_prefix961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIS_in_target_prefix980 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_UPCOMING_in_target_prefix983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IN_in_target_prefix1000 = new BitSet(new long[]{0x0000000000000000L,0x7C00000000FFFFF8L});
    public static final BitSet FOLLOW_spelled_or_int_1_to_31_in_target_prefix1003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FROM_NOW_in_target_suffix1049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AGO_in_target_suffix1063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_day_of_week_in_modifiable_target1092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_date_span_in_modifiable_target1099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_month_in_modifiable_target1105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DAY_in_date_span1120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WEEK_in_date_span1133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MONTH_in_date_span1145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_YEAR_in_date_span1156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_JANUARY_in_month1177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FEBRUARY_in_month1194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MARCH_in_month1210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_APRIL_in_month1229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MAY_in_month1248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_JUNE_in_month1269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_JULY_in_month1289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AUGUST_in_month1309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEPTEMBER_in_month1327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OCTOBER_in_month1342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOVEMBER_in_month1359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DECEMBER_in_month1375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spelled_or_int_1_to_31_in_day_of_month1400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spelled_sequence_1_to_31_in_day_of_month1416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SUNDAY_in_day_of_week1440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MONDAY_in_day_of_week1458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TUESDAY_in_day_of_week1476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WEDNESDAY_in_day_of_week1493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THURSDAY_in_day_of_week1508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FRIDAY_in_day_of_week1524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SATURDAY_in_day_of_week1542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMMA_in_year1567 = new BitSet(new long[]{0x0000001000000000L,0xEE00000000000000L,0x0000000000000022L});
    public static final BitSet FOLLOW_IN_in_year1571 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_THE_in_year1573 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_YEAR_in_year1575 = new BitSet(new long[]{0x0000000000000000L,0xEE00000000000000L,0x0000000000000022L});
    public static final BitSet FOLLOW_133_in_year1579 = new BitSet(new long[]{0x0000000000000000L,0xEE00000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_int_0_to_99_with_prefix_in_year1582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMMA_in_year1596 = new BitSet(new long[]{0x0000001000100000L,0xEF80000000000000L,0x0000000000000022L});
    public static final BitSet FOLLOW_IN_in_year1600 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_THE_in_year1602 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_YEAR_in_year1604 = new BitSet(new long[]{0x0000001000100000L,0xEF80000000000000L,0x0000000000000022L});
    public static final BitSet FOLLOW_int_3_or_4_digits_in_year1608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_date_separator0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_int_0_to_23_in_hours1662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_int_0_to_59_in_minutes1685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AM_in_meridian_indicator1708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PM_in_meridian_indicator1719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MIDNIGHT_in_time_identifier1740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOON_in_time_identifier1762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ONE_in_spelled_1_to_311798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWO_in_spelled_1_to_311816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THREE_in_spelled_1_to_311834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOUR_in_spelled_1_to_311850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FIVE_in_spelled_1_to_311867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SIX_in_spelled_1_to_311884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEVEN_in_spelled_1_to_311902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EIGHT_in_spelled_1_to_311918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NINE_in_spelled_1_to_311934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEN_in_spelled_1_to_311951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELEVEN_in_spelled_1_to_311969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWELVE_in_spelled_1_to_311984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIRTEEN_in_spelled_1_to_311999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOURTEEN_in_spelled_1_to_312012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FIFTEEN_in_spelled_1_to_312025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SIXTEEN_in_spelled_1_to_312039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEVENTEEN_in_spelled_1_to_312053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EIGHTEEN_in_spelled_1_to_312065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NINETEEN_in_spelled_1_to_312078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_1_to_312091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_1_to_312106 = new BitSet(new long[]{0x2000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_DASH_in_spelled_1_to_312108 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_ONE_in_spelled_1_to_312111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_1_to_312124 = new BitSet(new long[]{0x2000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_DASH_in_spelled_1_to_312126 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_TWO_in_spelled_1_to_312129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_1_to_312142 = new BitSet(new long[]{0x2000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_DASH_in_spelled_1_to_312144 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_THREE_in_spelled_1_to_312147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_1_to_312158 = new BitSet(new long[]{0x2000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_DASH_in_spelled_1_to_312160 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_FOUR_in_spelled_1_to_312163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_1_to_312175 = new BitSet(new long[]{0x2000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_DASH_in_spelled_1_to_312177 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_FIVE_in_spelled_1_to_312180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_1_to_312192 = new BitSet(new long[]{0x2000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_DASH_in_spelled_1_to_312194 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_SIX_in_spelled_1_to_312197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_1_to_312210 = new BitSet(new long[]{0x2000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_DASH_in_spelled_1_to_312212 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_SEVEN_in_spelled_1_to_312215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_1_to_312226 = new BitSet(new long[]{0x2000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_DASH_in_spelled_1_to_312228 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_EIGHT_in_spelled_1_to_312231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_1_to_312242 = new BitSet(new long[]{0x2000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_DASH_in_spelled_1_to_312244 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_NINE_in_spelled_1_to_312247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIRTY_in_spelled_1_to_312259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIRTY_in_spelled_1_to_312282 = new BitSet(new long[]{0x2000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_DASH_in_spelled_1_to_312284 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_ONE_in_spelled_1_to_312287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spelled_1_to_31_in_spelled_or_int_1_to_312309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_int_1_to_31_in_spelled_or_int_1_to_312315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FIRST_in_spelled_sequence_1_to_312332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SECOND_in_spelled_sequence_1_to_312349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIRD_in_spelled_sequence_1_to_312365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOURTH_in_spelled_sequence_1_to_312382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FIFTH_in_spelled_sequence_1_to_312398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SIXTH_in_spelled_sequence_1_to_312415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEVENTH_in_spelled_sequence_1_to_312432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EIGHTH_in_spelled_sequence_1_to_312447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NINTH_in_spelled_sequence_1_to_312463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TENTH_in_spelled_sequence_1_to_312480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELEVENTH_in_spelled_sequence_1_to_312497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWELFTH_in_spelled_sequence_1_to_312511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIRTEENTH_in_spelled_sequence_1_to_312526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOURTEENTH_in_spelled_sequence_1_to_312538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FIFTEENTH_in_spelled_sequence_1_to_312550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SIXTEENTH_in_spelled_sequence_1_to_312563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEVENTEENTH_in_spelled_sequence_1_to_312576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EIGHTEENTH_in_spelled_sequence_1_to_312587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NINETEENTH_in_spelled_sequence_1_to_312599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTIETH_in_spelled_sequence_1_to_312611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_FIRST_in_spelled_sequence_1_to_312625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_sequence_1_to_312632 = new BitSet(new long[]{0x2000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_DASH_in_spelled_sequence_1_to_312634 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_FIRST_in_spelled_sequence_1_to_312637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_SECOND_in_spelled_sequence_1_to_312653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_sequence_1_to_312659 = new BitSet(new long[]{0x2000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_DASH_in_spelled_sequence_1_to_312661 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_SECOND_in_spelled_sequence_1_to_312664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_THIRD_in_spelled_sequence_1_to_312679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_sequence_1_to_312686 = new BitSet(new long[]{0x2000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_DASH_in_spelled_sequence_1_to_312688 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_THIRD_in_spelled_sequence_1_to_312691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_FOURTH_in_spelled_sequence_1_to_312707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_sequence_1_to_312713 = new BitSet(new long[]{0x2000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_DASH_in_spelled_sequence_1_to_312715 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_FOURTH_in_spelled_sequence_1_to_312718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_FIFTH_in_spelled_sequence_1_to_312733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_sequence_1_to_312740 = new BitSet(new long[]{0x2000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_DASH_in_spelled_sequence_1_to_312742 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_FIFTH_in_spelled_sequence_1_to_312745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_SIXTH_in_spelled_sequence_1_to_312761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_sequence_1_to_312768 = new BitSet(new long[]{0x2000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_DASH_in_spelled_sequence_1_to_312770 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_SIXTH_in_spelled_sequence_1_to_312773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_SEVENTH_in_spelled_sequence_1_to_312789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_sequence_1_to_312794 = new BitSet(new long[]{0x2000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_DASH_in_spelled_sequence_1_to_312796 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_SEVENTH_in_spelled_sequence_1_to_312799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_EIGHTH_in_spelled_sequence_1_to_312813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_sequence_1_to_312819 = new BitSet(new long[]{0x2000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_DASH_in_spelled_sequence_1_to_312821 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_EIGHTH_in_spelled_sequence_1_to_312824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_NINTH_in_spelled_sequence_1_to_312839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_sequence_1_to_312846 = new BitSet(new long[]{0x2000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_DASH_in_spelled_sequence_1_to_312848 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_NINTH_in_spelled_sequence_1_to_312851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIRTIETH_in_spelled_sequence_1_to_312866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIRTY_FIRST_in_spelled_sequence_1_to_312910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIRTY_in_spelled_sequence_1_to_312917 = new BitSet(new long[]{0x2000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_DASH_in_spelled_sequence_1_to_312919 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_FIRST_in_spelled_sequence_1_to_312922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_int_0_to_99_with_prefix_in_int_up_to_4_digits2947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THREE_DIGIT_in_int_up_to_4_digits2953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOUR_DIGIT_in_int_up_to_4_digits2964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THREE_DIGIT_in_int_3_or_4_digits2986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOUR_DIGIT_in_int_3_or_4_digits2997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOUR_DIGIT_in_int_4_digits3019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWO_ZEROS_in_int_1_to_123039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PREFIXED_ONE_TO_NINE_in_int_1_to_123061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEN_TO_TWELVE_in_int_1_to_123072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWO_ZEROS_in_int_0_to_233100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PREFIXED_ONE_TO_NINE_in_int_0_to_233126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ONE_TO_NINE_in_int_0_to_233141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEN_TO_TWELVE_in_int_0_to_233165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIRTEEN_TO_TWENTY_THREE_in_int_0_to_233187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWO_ZEROS_in_int_0_to_593208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PREFIXED_ONE_TO_NINE_in_int_0_to_593235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ONE_TO_NINE_in_int_0_to_593251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEN_TO_TWELVE_in_int_0_to_593276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIRTEEN_TO_TWENTY_THREE_in_int_0_to_593299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_FOUR_TO_THIRTY_ONE_in_int_0_to_593311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIRTY_TWO_TO_FIFTY_NINE_in_int_0_to_593322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ONE_ZERO_in_int_0_to_99_no_prefix3344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ONE_TO_NINE_in_int_0_to_99_no_prefix3372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEN_TO_TWELVE_in_int_0_to_99_no_prefix3397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIRTEEN_TO_TWENTY_THREE_in_int_0_to_99_no_prefix3420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_FOUR_TO_THIRTY_ONE_in_int_0_to_99_no_prefix3432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIRTY_TWO_TO_FIFTY_NINE_in_int_0_to_99_no_prefix3443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SIXTY_TO_NINETY_NINE_in_int_0_to_99_no_prefix3455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWO_ZEROS_in_int_0_to_99_with_prefix3480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PREFIXED_ONE_TO_NINE_in_int_0_to_99_with_prefix3507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEN_TO_TWELVE_in_int_0_to_99_with_prefix3523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIRTEEN_TO_TWENTY_THREE_in_int_0_to_99_with_prefix3546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_FOUR_TO_THIRTY_ONE_in_int_0_to_99_with_prefix3558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIRTY_TWO_TO_FIFTY_NINE_in_int_0_to_99_with_prefix3569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SIXTY_TO_NINETY_NINE_in_int_0_to_99_with_prefix3581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PREFIXED_ONE_TO_NINE_in_int_1_to_313605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ONE_TO_NINE_in_int_1_to_313621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_int_10_to_31_in_int_1_to_313646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ONE_TO_NINE_in_int_1_to_31_no_prefix3661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_int_10_to_31_in_int_1_to_31_no_prefix3672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEN_TO_TWELVE_in_int_10_to_313687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIRTEEN_TO_TWENTY_THREE_in_int_10_to_313710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_FOUR_TO_THIRTY_ONE_in_int_10_to_313722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_date_in_synpred1_Date135 = new BitSet(new long[]{0x0000000000180002L,0x3E00000000000006L});
    public static final BitSet FOLLOW_set_in_synpred1_Date137 = new BitSet(new long[]{0x0000000000000002L,0x3E00000000000006L});
    public static final BitSet FOLLOW_time_in_synpred1_Date146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_time_in_synpred2_Date164 = new BitSet(new long[]{0x1FFFFF9FCFA00000L,0x7F7FFFFFFFFFFFF8L});
    public static final BitSet FOLLOW_ON_in_synpred2_Date166 = new BitSet(new long[]{0x1FFFFF9FCFA00000L,0x7F7FFFFFFFFFFFF8L});
    public static final BitSet FOLLOW_date_in_synpred2_Date169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_date_prefix_in_synpred3_Date259 = new BitSet(new long[]{0x003FFC0000000000L,0x7F7FFFFFFFFFFFF8L});
    public static final BitSet FOLLOW_explicit_date_in_synpred3_Date261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_explicit_date_in_synpred4_Date277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_date_prefix_in_synpred5_Date283 = new BitSet(new long[]{0x1FFFFF9FCFA00000L,0x7F7FFFFFFFFFFFF8L});
    public static final BitSet FOLLOW_relative_date_in_synpred5_Date285 = new BitSet(new long[]{0x0000000000000002L});

}