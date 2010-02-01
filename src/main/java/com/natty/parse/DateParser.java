// $ANTLR 3.2 Sep 23, 2009 12:02:23 /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g 2010-01-31 23:53:02
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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "INTEGER", "HOURS", "MINUTES", "AM_PM", "SPAN", "MONTH_OF_YEAR", "DAY_OF_WEEK", "DAY_OF_MONTH", "YEAR_OF", "SEEK_DIRECTION", "SEEK_TYPE", "EXPLICIT_TIME", "EXPLICIT_DATE", "RELATIVE_DATE", "DATE_TIME", "AT", "ON", "TODAY", "TOMORROW", "YESTERDAY", "THE", "DAY", "AFTER", "BEFORE", "THIS", "LAST", "PAST", "NEXT", "COMING", "UPCOMING", "IN", "FROM_NOW", "AGO", "WEEK", "MONTH", "YEAR", "JANUARY", "FEBRUARY", "MARCH", "APRIL", "MAY", "JUNE", "JULY", "AUGUST", "SEPTEMBER", "OCTOBER", "NOVEMBER", "DECEMBER", "SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY", "DASH", "SLASH", "AM", "PM", "MIDNIGHT", "NOON", "ONE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", "NINE", "TEN", "ELEVEN", "TWELVE", "THIRTEEN", "FOURTEEN", "FIFTEEN", "SIXTEEN", "SEVENTEEN", "EIGHTEEN", "NINETEEN", "TWENTY", "THIRTY", "FIRST", "SECOND", "THIRD", "FOURTH", "FIFTH", "SIXTH", "SEVENTH", "EIGHTH", "NINTH", "TENTH", "ELEVENTH", "TWELFTH", "THIRTEENTH", "FOURTEENTH", "FIFTEENTH", "SIXTEENTH", "SEVENTEENTH", "EIGHTEENTH", "NINETEENTH", "TWENTIETH", "TWENTY_FIRST", "TWENTY_SECOND", "TWENTY_THIRD", "TWENTY_FOURTH", "TWENTY_FIFTH", "TWENTY_SIXTH", "TWENTY_SEVENTH", "TWENTY_EIGHTH", "TWENTY_NINTH", "THIRTIETH", "THIRTY_FIRST", "THREE_DIGIT", "FOUR_DIGIT", "ONE_TO_TWELVE", "UP_TO_TWO_ZEROS", "THIRTEEN_TO_TWENTY_THREE", "TWENTY_FOUR_TO_THIRTY_ONE", "THIRTY_TWO_TO_FIFTY_NINE", "SIXTY_TO_NINETY_NINE", "DIGIT", "WHITE_SPACE", "','", "'of'", "':'", "'s'", "'\\''"
    };
    public static final int NINETEEN=83;
    public static final int WEEK=37;
    public static final int SEPTEMBER=48;
    public static final int THIRTEEN_TO_TWENTY_THREE=121;
    public static final int WEDNESDAY=55;
    public static final int TWENTY_EIGHTH=113;
    public static final int TWENTY=84;
    public static final int FROM_NOW=35;
    public static final int APRIL=43;
    public static final int JULY=46;
    public static final int COMING=32;
    public static final int NINETEENTH=104;
    public static final int OCTOBER=49;
    public static final int DAY=25;
    public static final int ONE=65;
    public static final int MIDNIGHT=63;
    public static final int EOF=-1;
    public static final int MARCH=42;
    public static final int MONTH=38;
    public static final int PAST=30;
    public static final int SEVENTEEN=81;
    public static final int DATE_TIME=18;
    public static final int AM_PM=7;
    public static final int SIXTY_TO_NINETY_NINE=124;
    public static final int TWENTY_SEVENTH=112;
    public static final int TWENTY_FIFTH=110;
    public static final int EIGHTEENTH=103;
    public static final int SPAN=8;
    public static final int THIS=28;
    public static final int THIRTIETH=115;
    public static final int NOON=64;
    public static final int LAST=29;
    public static final int EIGHTEEN=82;
    public static final int TWENTY_FOUR_TO_THIRTY_ONE=122;
    public static final int TOMORROW=22;
    public static final int RELATIVE_DATE=17;
    public static final int FOUR_DIGIT=118;
    public static final int FIFTEENTH=100;
    public static final int FOURTH=89;
    public static final int TODAY=21;
    public static final int SECOND=87;
    public static final int NOVEMBER=50;
    public static final int SATURDAY=58;
    public static final int MONTH_OF_YEAR=9;
    public static final int FOUR=68;
    public static final int SEVENTH=92;
    public static final int TEN=74;
    public static final int ON=20;
    public static final int FEBRUARY=41;
    public static final int MONDAY=53;
    public static final int DAY_OF_WEEK=10;
    public static final int SUNDAY=52;
    public static final int SEVEN=71;
    public static final int ELEVEN=75;
    public static final int THIRTEEN=77;
    public static final int EXPLICIT_DATE=16;
    public static final int JUNE=45;
    public static final int UPCOMING=33;
    public static final int SIX=70;
    public static final int FIFTH=90;
    public static final int T__128=128;
    public static final int TWENTY_NINTH=114;
    public static final int T__127=127;
    public static final int T__129=129;
    public static final int THURSDAY=56;
    public static final int DECEMBER=51;
    public static final int AUGUST=47;
    public static final int PM=62;
    public static final int EXPLICIT_TIME=15;
    public static final int TUESDAY=54;
    public static final int T__130=130;
    public static final int T__131=131;
    public static final int THIRTY_TWO_TO_FIFTY_NINE=123;
    public static final int EIGHTH=93;
    public static final int THIRD=88;
    public static final int YEAR=39;
    public static final int THE=24;
    public static final int TENTH=95;
    public static final int MAY=44;
    public static final int TWENTY_FOURTH=109;
    public static final int THREE_DIGIT=117;
    public static final int WHITE_SPACE=126;
    public static final int SEEK_TYPE=14;
    public static final int FRIDAY=57;
    public static final int EIGHT=72;
    public static final int TWENTY_SIXTH=111;
    public static final int AT=19;
    public static final int SLASH=60;
    public static final int IN=34;
    public static final int NINTH=94;
    public static final int FIVE=69;
    public static final int THIRTY=85;
    public static final int TWENTIETH=105;
    public static final int TWENTY_SECOND=107;
    public static final int NEXT=31;
    public static final int DIGIT=125;
    public static final int AM=61;
    public static final int INTEGER=4;
    public static final int UP_TO_TWO_ZEROS=120;
    public static final int DASH=59;
    public static final int FOURTEENTH=99;
    public static final int SIXTEEN=80;
    public static final int YEAR_OF=12;
    public static final int SEEK_DIRECTION=13;
    public static final int TWELVE=76;
    public static final int AGO=36;
    public static final int ELEVENTH=96;
    public static final int BEFORE=27;
    public static final int AFTER=26;
    public static final int TWO=66;
    public static final int SIXTEENTH=101;
    public static final int JANUARY=40;
    public static final int THIRTEENTH=98;
    public static final int MINUTES=6;
    public static final int DAY_OF_MONTH=11;
    public static final int FIFTEEN=79;
    public static final int TWELFTH=97;
    public static final int NINE=73;
    public static final int SIXTH=91;
    public static final int TWENTY_FIRST=106;
    public static final int THREE=67;
    public static final int FOURTEEN=78;
    public static final int ONE_TO_TWELVE=119;
    public static final int TWENTY_THIRD=108;
    public static final int YESTERDAY=23;
    public static final int SEVENTEENTH=102;
    public static final int HOURS=5;
    public static final int THIRTY_FIRST=116;
    public static final int FIRST=86;

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
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:28:1: datetime options {backtrack=true; } : ( date ( AT )? ( time )? -> ^( DATE_TIME date ( time )? ) | time ( ON )? date -> ^( DATE_TIME date time ) | time -> ^( DATE_TIME ^( RELATIVE_DATE SEEK_DIRECTION[\">\"] INTEGER[\"0\"] ) time ) );
    public final DateParser.datetime_return datetime() throws RecognitionException {
        DateParser.datetime_return retval = new DateParser.datetime_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token AT2=null;
        Token ON5=null;
        DateParser.date_return date1 = null;

        DateParser.time_return time3 = null;

        DateParser.time_return time4 = null;

        DateParser.date_return date6 = null;

        DateParser.time_return time7 = null;


        Object AT2_tree=null;
        Object ON5_tree=null;
        RewriteRuleTokenStream stream_AT=new RewriteRuleTokenStream(adaptor,"token AT");
        RewriteRuleTokenStream stream_ON=new RewriteRuleTokenStream(adaptor,"token ON");
        RewriteRuleSubtreeStream stream_time=new RewriteRuleSubtreeStream(adaptor,"rule time");
        RewriteRuleSubtreeStream stream_date=new RewriteRuleSubtreeStream(adaptor,"rule date");
        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:30:3: ( date ( AT )? ( time )? -> ^( DATE_TIME date ( time )? ) | time ( ON )? date -> ^( DATE_TIME date time ) | time -> ^( DATE_TIME ^( RELATIVE_DATE SEEK_DIRECTION[\">\"] INTEGER[\"0\"] ) time ) )
            int alt4=3;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:30:5: date ( AT )? ( time )?
                    {
                    pushFollow(FOLLOW_date_in_datetime128);
                    date1=date();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_date.add(date1.getTree());
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:30:10: ( AT )?
                    int alt1=2;
                    int LA1_0 = input.LA(1);

                    if ( (LA1_0==AT) ) {
                        alt1=1;
                    }
                    switch (alt1) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:30:10: AT
                            {
                            AT2=(Token)match(input,AT,FOLLOW_AT_in_datetime130); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_AT.add(AT2);


                            }
                            break;

                    }

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:30:14: ( time )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( ((LA2_0>=MIDNIGHT && LA2_0<=NOON)||(LA2_0>=ONE_TO_TWELVE && LA2_0<=THIRTEEN_TO_TWENTY_THREE)) ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:30:14: time
                            {
                            pushFollow(FOLLOW_time_in_datetime133);
                            time3=time();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_time.add(time3.getTree());

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
                    // 30:20: -> ^( DATE_TIME date ( time )? )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:30:23: ^( DATE_TIME date ( time )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DATE_TIME, "DATE_TIME"), root_1);

                        adaptor.addChild(root_1, stream_date.nextTree());
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:30:40: ( time )?
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
                    pushFollow(FOLLOW_time_in_datetime151);
                    time4=time();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_time.add(time4.getTree());
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
                            ON5=(Token)match(input,ON,FOLLOW_ON_in_datetime153); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_ON.add(ON5);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_date_in_datetime156);
                    date6=date();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_date.add(date6.getTree());


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
                    // 31:19: -> ^( DATE_TIME date time )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:31:22: ^( DATE_TIME date time )
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
                    pushFollow(FOLLOW_time_in_datetime172);
                    time7=time();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_time.add(time7.getTree());


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
                    // 32:10: -> ^( DATE_TIME ^( RELATIVE_DATE SEEK_DIRECTION[\">\"] INTEGER[\"0\"] ) time )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:32:13: ^( DATE_TIME ^( RELATIVE_DATE SEEK_DIRECTION[\">\"] INTEGER[\"0\"] ) time )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DATE_TIME, "DATE_TIME"), root_1);

                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:32:25: ^( RELATIVE_DATE SEEK_DIRECTION[\">\"] INTEGER[\"0\"] )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(RELATIVE_DATE, "RELATIVE_DATE"), root_2);

                        adaptor.addChild(root_2, (Object)adaptor.create(SEEK_DIRECTION, ">"));
                        adaptor.addChild(root_2, (Object)adaptor.create(INTEGER, "0"));

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
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:35:1: date : ( date_prefix relative_date -> ^( RELATIVE_DATE date_prefix relative_date ) | date_prefix explicit_date -> ^( RELATIVE_DATE date_prefix explicit_date ) | relative_date | explicit_date );
    public final DateParser.date_return date() throws RecognitionException {
        DateParser.date_return retval = new DateParser.date_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        DateParser.date_prefix_return date_prefix8 = null;

        DateParser.relative_date_return relative_date9 = null;

        DateParser.date_prefix_return date_prefix10 = null;

        DateParser.explicit_date_return explicit_date11 = null;

        DateParser.relative_date_return relative_date12 = null;

        DateParser.explicit_date_return explicit_date13 = null;


        RewriteRuleSubtreeStream stream_date_prefix=new RewriteRuleSubtreeStream(adaptor,"rule date_prefix");
        RewriteRuleSubtreeStream stream_relative_date=new RewriteRuleSubtreeStream(adaptor,"rule relative_date");
        RewriteRuleSubtreeStream stream_explicit_date=new RewriteRuleSubtreeStream(adaptor,"rule explicit_date");
        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:36:3: ( date_prefix relative_date -> ^( RELATIVE_DATE date_prefix relative_date ) | date_prefix explicit_date -> ^( RELATIVE_DATE date_prefix explicit_date ) | relative_date | explicit_date )
            int alt5=4;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:36:5: date_prefix relative_date
                    {
                    pushFollow(FOLLOW_date_prefix_in_date205);
                    date_prefix8=date_prefix();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_date_prefix.add(date_prefix8.getTree());
                    pushFollow(FOLLOW_relative_date_in_date207);
                    relative_date9=relative_date();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_relative_date.add(relative_date9.getTree());


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
                    // 36:31: -> ^( RELATIVE_DATE date_prefix relative_date )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:36:34: ^( RELATIVE_DATE date_prefix relative_date )
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
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:37:5: date_prefix explicit_date
                    {
                    pushFollow(FOLLOW_date_prefix_in_date223);
                    date_prefix10=date_prefix();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_date_prefix.add(date_prefix10.getTree());
                    pushFollow(FOLLOW_explicit_date_in_date225);
                    explicit_date11=explicit_date();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_explicit_date.add(explicit_date11.getTree());


                    // AST REWRITE
                    // elements: explicit_date, date_prefix
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
                case 3 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:38:5: relative_date
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_relative_date_in_date241);
                    relative_date12=relative_date();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, relative_date12.getTree());

                    }
                    break;
                case 4 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:39:5: explicit_date
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_explicit_date_in_date247);
                    explicit_date13=explicit_date();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, explicit_date13.getTree());

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
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:42:1: time : explicit_time ;
    public final DateParser.time_return time() throws RecognitionException {
        DateParser.time_return retval = new DateParser.time_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        DateParser.explicit_time_return explicit_time14 = null;



        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:43:3: ( explicit_time )
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:43:5: explicit_time
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_explicit_time_in_time263);
            explicit_time14=explicit_time();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, explicit_time14.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:46:1: relative_date : ( named_relative_date | modifiable_target -> ^( RELATIVE_DATE SEEK_DIRECTION[\">\"] SEEK_TYPE[\"by_day\"] INTEGER[\"1\"] modifiable_target ) | target_prefix modifiable_target -> ^( RELATIVE_DATE target_prefix modifiable_target ) | spelled_or_numeric_1_to_31 modifiable_target target_suffix -> ^( RELATIVE_DATE target_suffix spelled_or_numeric_1_to_31 modifiable_target ) );
    public final DateParser.relative_date_return relative_date() throws RecognitionException {
        DateParser.relative_date_return retval = new DateParser.relative_date_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        DateParser.named_relative_date_return named_relative_date15 = null;

        DateParser.modifiable_target_return modifiable_target16 = null;

        DateParser.target_prefix_return target_prefix17 = null;

        DateParser.modifiable_target_return modifiable_target18 = null;

        DateParser.spelled_or_numeric_1_to_31_return spelled_or_numeric_1_to_3119 = null;

        DateParser.modifiable_target_return modifiable_target20 = null;

        DateParser.target_suffix_return target_suffix21 = null;


        RewriteRuleSubtreeStream stream_target_suffix=new RewriteRuleSubtreeStream(adaptor,"rule target_suffix");
        RewriteRuleSubtreeStream stream_spelled_or_numeric_1_to_31=new RewriteRuleSubtreeStream(adaptor,"rule spelled_or_numeric_1_to_31");
        RewriteRuleSubtreeStream stream_modifiable_target=new RewriteRuleSubtreeStream(adaptor,"rule modifiable_target");
        RewriteRuleSubtreeStream stream_target_prefix=new RewriteRuleSubtreeStream(adaptor,"rule target_prefix");
        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:47:3: ( named_relative_date | modifiable_target -> ^( RELATIVE_DATE SEEK_DIRECTION[\">\"] SEEK_TYPE[\"by_day\"] INTEGER[\"1\"] modifiable_target ) | target_prefix modifiable_target -> ^( RELATIVE_DATE target_prefix modifiable_target ) | spelled_or_numeric_1_to_31 modifiable_target target_suffix -> ^( RELATIVE_DATE target_suffix spelled_or_numeric_1_to_31 modifiable_target ) )
            int alt6=4;
            alt6 = dfa6.predict(input);
            switch (alt6) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:47:5: named_relative_date
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_named_relative_date_in_relative_date276);
                    named_relative_date15=named_relative_date();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, named_relative_date15.getTree());

                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:50:5: modifiable_target
                    {
                    pushFollow(FOLLOW_modifiable_target_in_relative_date288);
                    modifiable_target16=modifiable_target();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_modifiable_target.add(modifiable_target16.getTree());


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
                    // 51:5: -> ^( RELATIVE_DATE SEEK_DIRECTION[\">\"] SEEK_TYPE[\"by_day\"] INTEGER[\"1\"] modifiable_target )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:51:8: ^( RELATIVE_DATE SEEK_DIRECTION[\">\"] SEEK_TYPE[\"by_day\"] INTEGER[\"1\"] modifiable_target )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(RELATIVE_DATE, "RELATIVE_DATE"), root_1);

                        adaptor.addChild(root_1, (Object)adaptor.create(SEEK_DIRECTION, ">"));
                        adaptor.addChild(root_1, (Object)adaptor.create(SEEK_TYPE, "by_day"));
                        adaptor.addChild(root_1, (Object)adaptor.create(INTEGER, "1"));
                        adaptor.addChild(root_1, stream_modifiable_target.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:54:5: target_prefix modifiable_target
                    {
                    pushFollow(FOLLOW_target_prefix_in_relative_date322);
                    target_prefix17=target_prefix();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_target_prefix.add(target_prefix17.getTree());
                    pushFollow(FOLLOW_modifiable_target_in_relative_date324);
                    modifiable_target18=modifiable_target();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_modifiable_target.add(modifiable_target18.getTree());


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
                    // 55:5: -> ^( RELATIVE_DATE target_prefix modifiable_target )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:55:8: ^( RELATIVE_DATE target_prefix modifiable_target )
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:58:5: spelled_or_numeric_1_to_31 modifiable_target target_suffix
                    {
                    pushFollow(FOLLOW_spelled_or_numeric_1_to_31_in_relative_date353);
                    spelled_or_numeric_1_to_3119=spelled_or_numeric_1_to_31();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_spelled_or_numeric_1_to_31.add(spelled_or_numeric_1_to_3119.getTree());
                    pushFollow(FOLLOW_modifiable_target_in_relative_date355);
                    modifiable_target20=modifiable_target();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_modifiable_target.add(modifiable_target20.getTree());
                    pushFollow(FOLLOW_target_suffix_in_relative_date357);
                    target_suffix21=target_suffix();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_target_suffix.add(target_suffix21.getTree());


                    // AST REWRITE
                    // elements: modifiable_target, target_suffix, spelled_or_numeric_1_to_31
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 59:5: -> ^( RELATIVE_DATE target_suffix spelled_or_numeric_1_to_31 modifiable_target )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:59:8: ^( RELATIVE_DATE target_suffix spelled_or_numeric_1_to_31 modifiable_target )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(RELATIVE_DATE, "RELATIVE_DATE"), root_1);

                        adaptor.addChild(root_1, stream_target_suffix.nextTree());
                        adaptor.addChild(root_1, stream_spelled_or_numeric_1_to_31.nextTree());
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
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:62:1: named_relative_date : ( TODAY -> ^( RELATIVE_DATE SEEK_DIRECTION[\">\"] INTEGER[\"0\"] ) | TOMORROW -> ^( RELATIVE_DATE SEEK_DIRECTION[\">\"] INTEGER[\"1\"] ) | YESTERDAY -> ^( RELATIVE_DATE SEEK_DIRECTION[\"<\"] INTEGER[\"1\"] ) );
    public final DateParser.named_relative_date_return named_relative_date() throws RecognitionException {
        DateParser.named_relative_date_return retval = new DateParser.named_relative_date_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TODAY22=null;
        Token TOMORROW23=null;
        Token YESTERDAY24=null;

        Object TODAY22_tree=null;
        Object TOMORROW23_tree=null;
        Object YESTERDAY24_tree=null;
        RewriteRuleTokenStream stream_TODAY=new RewriteRuleTokenStream(adaptor,"token TODAY");
        RewriteRuleTokenStream stream_YESTERDAY=new RewriteRuleTokenStream(adaptor,"token YESTERDAY");
        RewriteRuleTokenStream stream_TOMORROW=new RewriteRuleTokenStream(adaptor,"token TOMORROW");

        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:63:3: ( TODAY -> ^( RELATIVE_DATE SEEK_DIRECTION[\">\"] INTEGER[\"0\"] ) | TOMORROW -> ^( RELATIVE_DATE SEEK_DIRECTION[\">\"] INTEGER[\"1\"] ) | YESTERDAY -> ^( RELATIVE_DATE SEEK_DIRECTION[\"<\"] INTEGER[\"1\"] ) )
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:63:5: TODAY
                    {
                    TODAY22=(Token)match(input,TODAY,FOLLOW_TODAY_in_named_relative_date389); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TODAY.add(TODAY22);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 63:15: -> ^( RELATIVE_DATE SEEK_DIRECTION[\">\"] INTEGER[\"0\"] )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:63:18: ^( RELATIVE_DATE SEEK_DIRECTION[\">\"] INTEGER[\"0\"] )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(RELATIVE_DATE, "RELATIVE_DATE"), root_1);

                        adaptor.addChild(root_1, (Object)adaptor.create(SEEK_DIRECTION, ">"));
                        adaptor.addChild(root_1, (Object)adaptor.create(INTEGER, "0"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:64:5: TOMORROW
                    {
                    TOMORROW23=(Token)match(input,TOMORROW,FOLLOW_TOMORROW_in_named_relative_date411); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TOMORROW.add(TOMORROW23);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 64:15: -> ^( RELATIVE_DATE SEEK_DIRECTION[\">\"] INTEGER[\"1\"] )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:64:18: ^( RELATIVE_DATE SEEK_DIRECTION[\">\"] INTEGER[\"1\"] )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(RELATIVE_DATE, "RELATIVE_DATE"), root_1);

                        adaptor.addChild(root_1, (Object)adaptor.create(SEEK_DIRECTION, ">"));
                        adaptor.addChild(root_1, (Object)adaptor.create(INTEGER, "1"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:65:5: YESTERDAY
                    {
                    YESTERDAY24=(Token)match(input,YESTERDAY,FOLLOW_YESTERDAY_in_named_relative_date430); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_YESTERDAY.add(YESTERDAY24);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 65:15: -> ^( RELATIVE_DATE SEEK_DIRECTION[\"<\"] INTEGER[\"1\"] )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:65:18: ^( RELATIVE_DATE SEEK_DIRECTION[\"<\"] INTEGER[\"1\"] )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(RELATIVE_DATE, "RELATIVE_DATE"), root_1);

                        adaptor.addChild(root_1, (Object)adaptor.create(SEEK_DIRECTION, "<"));
                        adaptor.addChild(root_1, (Object)adaptor.create(INTEGER, "1"));

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
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:69:1: explicit_date options {backtrack=true; } : ( integer_1_to_12 date_separator integer_1_to_31 ( date_separator four_digits )? -> ^( EXPLICIT_DATE integer_1_to_31 integer_1_to_31 ( four_digits )? ) | four_digits date_separator integer_1_to_12 date_separator integer_1_to_31 -> ^( EXPLICIT_DATE integer_1_to_12 integer_1_to_31 four_digits ) | month day_of_month ( ( ',' )? year )? -> ^( EXPLICIT_DATE month day_of_month ( year )? ) | day_of_month ( 'of' )? month ( ( ',' )? year )? -> ^( EXPLICIT_DATE month day_of_month ( year )? ) );
    public final DateParser.explicit_date_return explicit_date() throws RecognitionException {
        DateParser.explicit_date_return retval = new DateParser.explicit_date_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal37=null;
        Token string_literal40=null;
        Token char_literal42=null;
        DateParser.integer_1_to_12_return integer_1_to_1225 = null;

        DateParser.date_separator_return date_separator26 = null;

        DateParser.integer_1_to_31_return integer_1_to_3127 = null;

        DateParser.date_separator_return date_separator28 = null;

        DateParser.four_digits_return four_digits29 = null;

        DateParser.four_digits_return four_digits30 = null;

        DateParser.date_separator_return date_separator31 = null;

        DateParser.integer_1_to_12_return integer_1_to_1232 = null;

        DateParser.date_separator_return date_separator33 = null;

        DateParser.integer_1_to_31_return integer_1_to_3134 = null;

        DateParser.month_return month35 = null;

        DateParser.day_of_month_return day_of_month36 = null;

        DateParser.year_return year38 = null;

        DateParser.day_of_month_return day_of_month39 = null;

        DateParser.month_return month41 = null;

        DateParser.year_return year43 = null;


        Object char_literal37_tree=null;
        Object string_literal40_tree=null;
        Object char_literal42_tree=null;
        RewriteRuleTokenStream stream_127=new RewriteRuleTokenStream(adaptor,"token 127");
        RewriteRuleTokenStream stream_128=new RewriteRuleTokenStream(adaptor,"token 128");
        RewriteRuleSubtreeStream stream_integer_1_to_12=new RewriteRuleSubtreeStream(adaptor,"rule integer_1_to_12");
        RewriteRuleSubtreeStream stream_four_digits=new RewriteRuleSubtreeStream(adaptor,"rule four_digits");
        RewriteRuleSubtreeStream stream_month=new RewriteRuleSubtreeStream(adaptor,"rule month");
        RewriteRuleSubtreeStream stream_year=new RewriteRuleSubtreeStream(adaptor,"rule year");
        RewriteRuleSubtreeStream stream_day_of_month=new RewriteRuleSubtreeStream(adaptor,"rule day_of_month");
        RewriteRuleSubtreeStream stream_integer_1_to_31=new RewriteRuleSubtreeStream(adaptor,"rule integer_1_to_31");
        RewriteRuleSubtreeStream stream_date_separator=new RewriteRuleSubtreeStream(adaptor,"rule date_separator");
        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:71:3: ( integer_1_to_12 date_separator integer_1_to_31 ( date_separator four_digits )? -> ^( EXPLICIT_DATE integer_1_to_31 integer_1_to_31 ( four_digits )? ) | four_digits date_separator integer_1_to_12 date_separator integer_1_to_31 -> ^( EXPLICIT_DATE integer_1_to_12 integer_1_to_31 four_digits ) | month day_of_month ( ( ',' )? year )? -> ^( EXPLICIT_DATE month day_of_month ( year )? ) | day_of_month ( 'of' )? month ( ( ',' )? year )? -> ^( EXPLICIT_DATE month day_of_month ( year )? ) )
            int alt14=4;
            alt14 = dfa14.predict(input);
            switch (alt14) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:71:5: integer_1_to_12 date_separator integer_1_to_31 ( date_separator four_digits )?
                    {
                    pushFollow(FOLLOW_integer_1_to_12_in_explicit_date465);
                    integer_1_to_1225=integer_1_to_12();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_integer_1_to_12.add(integer_1_to_1225.getTree());
                    pushFollow(FOLLOW_date_separator_in_explicit_date467);
                    date_separator26=date_separator();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_date_separator.add(date_separator26.getTree());
                    pushFollow(FOLLOW_integer_1_to_31_in_explicit_date469);
                    integer_1_to_3127=integer_1_to_31();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_integer_1_to_31.add(integer_1_to_3127.getTree());
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:71:52: ( date_separator four_digits )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( ((LA8_0>=DASH && LA8_0<=SLASH)) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:71:53: date_separator four_digits
                            {
                            pushFollow(FOLLOW_date_separator_in_explicit_date472);
                            date_separator28=date_separator();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_date_separator.add(date_separator28.getTree());
                            pushFollow(FOLLOW_four_digits_in_explicit_date474);
                            four_digits29=four_digits();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_four_digits.add(four_digits29.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: four_digits, integer_1_to_31, integer_1_to_31
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 72:5: -> ^( EXPLICIT_DATE integer_1_to_31 integer_1_to_31 ( four_digits )? )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:72:8: ^( EXPLICIT_DATE integer_1_to_31 integer_1_to_31 ( four_digits )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPLICIT_DATE, "EXPLICIT_DATE"), root_1);

                        adaptor.addChild(root_1, stream_integer_1_to_31.nextTree());
                        adaptor.addChild(root_1, stream_integer_1_to_31.nextTree());
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:72:56: ( four_digits )?
                        if ( stream_four_digits.hasNext() ) {
                            adaptor.addChild(root_1, stream_four_digits.nextTree());

                        }
                        stream_four_digits.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:74:5: four_digits date_separator integer_1_to_12 date_separator integer_1_to_31
                    {
                    pushFollow(FOLLOW_four_digits_in_explicit_date504);
                    four_digits30=four_digits();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_four_digits.add(four_digits30.getTree());
                    pushFollow(FOLLOW_date_separator_in_explicit_date506);
                    date_separator31=date_separator();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_date_separator.add(date_separator31.getTree());
                    pushFollow(FOLLOW_integer_1_to_12_in_explicit_date508);
                    integer_1_to_1232=integer_1_to_12();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_integer_1_to_12.add(integer_1_to_1232.getTree());
                    pushFollow(FOLLOW_date_separator_in_explicit_date510);
                    date_separator33=date_separator();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_date_separator.add(date_separator33.getTree());
                    pushFollow(FOLLOW_integer_1_to_31_in_explicit_date512);
                    integer_1_to_3134=integer_1_to_31();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_integer_1_to_31.add(integer_1_to_3134.getTree());


                    // AST REWRITE
                    // elements: four_digits, integer_1_to_31, integer_1_to_12
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 75:5: -> ^( EXPLICIT_DATE integer_1_to_12 integer_1_to_31 four_digits )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:75:8: ^( EXPLICIT_DATE integer_1_to_12 integer_1_to_31 four_digits )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPLICIT_DATE, "EXPLICIT_DATE"), root_1);

                        adaptor.addChild(root_1, stream_integer_1_to_12.nextTree());
                        adaptor.addChild(root_1, stream_integer_1_to_31.nextTree());
                        adaptor.addChild(root_1, stream_four_digits.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:77:5: month day_of_month ( ( ',' )? year )?
                    {
                    pushFollow(FOLLOW_month_in_explicit_date539);
                    month35=month();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_month.add(month35.getTree());
                    pushFollow(FOLLOW_day_of_month_in_explicit_date541);
                    day_of_month36=day_of_month();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_day_of_month.add(day_of_month36.getTree());
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:77:24: ( ( ',' )? year )?
                    int alt10=2;
                    switch ( input.LA(1) ) {
                        case 127:
                        case 131:
                            {
                            alt10=1;
                            }
                            break;
                        case UP_TO_TWO_ZEROS:
                            {
                            alt10=1;
                            }
                            break;
                        case ONE_TO_TWELVE:
                            {
                            alt10=1;
                            }
                            break;
                        case IN:
                        case THREE_DIGIT:
                        case FOUR_DIGIT:
                        case THIRTEEN_TO_TWENTY_THREE:
                        case TWENTY_FOUR_TO_THIRTY_ONE:
                        case THIRTY_TWO_TO_FIFTY_NINE:
                        case SIXTY_TO_NINETY_NINE:
                            {
                            alt10=1;
                            }
                            break;
                    }

                    switch (alt10) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:77:25: ( ',' )? year
                            {
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:77:25: ( ',' )?
                            int alt9=2;
                            int LA9_0 = input.LA(1);

                            if ( (LA9_0==127) ) {
                                alt9=1;
                            }
                            switch (alt9) {
                                case 1 :
                                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:77:25: ','
                                    {
                                    char_literal37=(Token)match(input,127,FOLLOW_127_in_explicit_date544); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_127.add(char_literal37);


                                    }
                                    break;

                            }

                            pushFollow(FOLLOW_year_in_explicit_date547);
                            year38=year();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_year.add(year38.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: year, day_of_month, month
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 78:5: -> ^( EXPLICIT_DATE month day_of_month ( year )? )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:78:8: ^( EXPLICIT_DATE month day_of_month ( year )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPLICIT_DATE, "EXPLICIT_DATE"), root_1);

                        adaptor.addChild(root_1, stream_month.nextTree());
                        adaptor.addChild(root_1, stream_day_of_month.nextTree());
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:78:43: ( year )?
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:80:5: day_of_month ( 'of' )? month ( ( ',' )? year )?
                    {
                    pushFollow(FOLLOW_day_of_month_in_explicit_date577);
                    day_of_month39=day_of_month();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_day_of_month.add(day_of_month39.getTree());
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:80:18: ( 'of' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==128) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:80:18: 'of'
                            {
                            string_literal40=(Token)match(input,128,FOLLOW_128_in_explicit_date579); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_128.add(string_literal40);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_month_in_explicit_date582);
                    month41=month();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_month.add(month41.getTree());
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:80:30: ( ( ',' )? year )?
                    int alt13=2;
                    switch ( input.LA(1) ) {
                        case 127:
                        case 131:
                            {
                            alt13=1;
                            }
                            break;
                        case UP_TO_TWO_ZEROS:
                            {
                            alt13=1;
                            }
                            break;
                        case ONE_TO_TWELVE:
                            {
                            alt13=1;
                            }
                            break;
                        case IN:
                        case THREE_DIGIT:
                        case FOUR_DIGIT:
                        case THIRTEEN_TO_TWENTY_THREE:
                        case TWENTY_FOUR_TO_THIRTY_ONE:
                        case THIRTY_TWO_TO_FIFTY_NINE:
                        case SIXTY_TO_NINETY_NINE:
                            {
                            alt13=1;
                            }
                            break;
                    }

                    switch (alt13) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:80:31: ( ',' )? year
                            {
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:80:31: ( ',' )?
                            int alt12=2;
                            int LA12_0 = input.LA(1);

                            if ( (LA12_0==127) ) {
                                alt12=1;
                            }
                            switch (alt12) {
                                case 1 :
                                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:80:31: ','
                                    {
                                    char_literal42=(Token)match(input,127,FOLLOW_127_in_explicit_date585); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_127.add(char_literal42);


                                    }
                                    break;

                            }

                            pushFollow(FOLLOW_year_in_explicit_date588);
                            year43=year();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_year.add(year43.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: day_of_month, month, year
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 81:5: -> ^( EXPLICIT_DATE month day_of_month ( year )? )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:81:8: ^( EXPLICIT_DATE month day_of_month ( year )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPLICIT_DATE, "EXPLICIT_DATE"), root_1);

                        adaptor.addChild(root_1, stream_month.nextTree());
                        adaptor.addChild(root_1, stream_day_of_month.nextTree());
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:81:43: ( year )?
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

    public static class explicit_time_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "explicit_time"
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:85:1: explicit_time : ( hours ( ':' ( minutes )? ( meridian_indicator )? )? -> ^( EXPLICIT_TIME hours ( minutes )? ( meridian_indicator )? ) | time_identifier );
    public final DateParser.explicit_time_return explicit_time() throws RecognitionException {
        DateParser.explicit_time_return retval = new DateParser.explicit_time_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal45=null;
        DateParser.hours_return hours44 = null;

        DateParser.minutes_return minutes46 = null;

        DateParser.meridian_indicator_return meridian_indicator47 = null;

        DateParser.time_identifier_return time_identifier48 = null;


        Object char_literal45_tree=null;
        RewriteRuleTokenStream stream_129=new RewriteRuleTokenStream(adaptor,"token 129");
        RewriteRuleSubtreeStream stream_meridian_indicator=new RewriteRuleSubtreeStream(adaptor,"rule meridian_indicator");
        RewriteRuleSubtreeStream stream_minutes=new RewriteRuleSubtreeStream(adaptor,"rule minutes");
        RewriteRuleSubtreeStream stream_hours=new RewriteRuleSubtreeStream(adaptor,"rule hours");
        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:87:3: ( hours ( ':' ( minutes )? ( meridian_indicator )? )? -> ^( EXPLICIT_TIME hours ( minutes )? ( meridian_indicator )? ) | time_identifier )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=ONE_TO_TWELVE && LA18_0<=THIRTEEN_TO_TWENTY_THREE)) ) {
                alt18=1;
            }
            else if ( ((LA18_0>=MIDNIGHT && LA18_0<=NOON)) ) {
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:87:5: hours ( ':' ( minutes )? ( meridian_indicator )? )?
                    {
                    pushFollow(FOLLOW_hours_in_explicit_time629);
                    hours44=hours();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_hours.add(hours44.getTree());
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:87:11: ( ':' ( minutes )? ( meridian_indicator )? )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==129) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:87:12: ':' ( minutes )? ( meridian_indicator )?
                            {
                            char_literal45=(Token)match(input,129,FOLLOW_129_in_explicit_time632); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_129.add(char_literal45);

                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:87:16: ( minutes )?
                            int alt15=2;
                            alt15 = dfa15.predict(input);
                            switch (alt15) {
                                case 1 :
                                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:87:16: minutes
                                    {
                                    pushFollow(FOLLOW_minutes_in_explicit_time634);
                                    minutes46=minutes();

                                    state._fsp--;
                                    if (state.failed) return retval;
                                    if ( state.backtracking==0 ) stream_minutes.add(minutes46.getTree());

                                    }
                                    break;

                            }

                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:87:25: ( meridian_indicator )?
                            int alt16=2;
                            int LA16_0 = input.LA(1);

                            if ( ((LA16_0>=AM && LA16_0<=PM)) ) {
                                alt16=1;
                            }
                            switch (alt16) {
                                case 1 :
                                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:87:25: meridian_indicator
                                    {
                                    pushFollow(FOLLOW_meridian_indicator_in_explicit_time637);
                                    meridian_indicator47=meridian_indicator();

                                    state._fsp--;
                                    if (state.failed) return retval;
                                    if ( state.backtracking==0 ) stream_meridian_indicator.add(meridian_indicator47.getTree());

                                    }
                                    break;

                            }


                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: minutes, meridian_indicator, hours
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 88:5: -> ^( EXPLICIT_TIME hours ( minutes )? ( meridian_indicator )? )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:88:8: ^( EXPLICIT_TIME hours ( minutes )? ( meridian_indicator )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPLICIT_TIME, "EXPLICIT_TIME"), root_1);

                        adaptor.addChild(root_1, stream_hours.nextTree());
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:88:30: ( minutes )?
                        if ( stream_minutes.hasNext() ) {
                            adaptor.addChild(root_1, stream_minutes.nextTree());

                        }
                        stream_minutes.reset();
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:88:39: ( meridian_indicator )?
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:90:5: time_identifier
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_time_identifier_in_explicit_time667);
                    time_identifier48=time_identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, time_identifier48.getTree());

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
    // $ANTLR end "explicit_time"

    public static class date_prefix_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "date_prefix"
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:94:1: date_prefix : ( ( THE )? DAY AFTER -> SEEK_DIRECTION[\">\"] INTEGER[\"1\"] | spelled_or_numeric_1_to_31 DAY ( 's' )? AFTER -> SEEK_DIRECTION[\">\"] spelled_or_numeric_1_to_31 | ( THE )? DAY BEFORE -> SEEK_DIRECTION[\"<\"] INTEGER[\"1\"] | spelled_or_numeric_1_to_31 DAY ( 's' )? BEFORE -> SEEK_DIRECTION[\"<\"] spelled_or_numeric_1_to_31 );
    public final DateParser.date_prefix_return date_prefix() throws RecognitionException {
        DateParser.date_prefix_return retval = new DateParser.date_prefix_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token THE49=null;
        Token DAY50=null;
        Token AFTER51=null;
        Token DAY53=null;
        Token char_literal54=null;
        Token AFTER55=null;
        Token THE56=null;
        Token DAY57=null;
        Token BEFORE58=null;
        Token DAY60=null;
        Token char_literal61=null;
        Token BEFORE62=null;
        DateParser.spelled_or_numeric_1_to_31_return spelled_or_numeric_1_to_3152 = null;

        DateParser.spelled_or_numeric_1_to_31_return spelled_or_numeric_1_to_3159 = null;


        Object THE49_tree=null;
        Object DAY50_tree=null;
        Object AFTER51_tree=null;
        Object DAY53_tree=null;
        Object char_literal54_tree=null;
        Object AFTER55_tree=null;
        Object THE56_tree=null;
        Object DAY57_tree=null;
        Object BEFORE58_tree=null;
        Object DAY60_tree=null;
        Object char_literal61_tree=null;
        Object BEFORE62_tree=null;
        RewriteRuleTokenStream stream_BEFORE=new RewriteRuleTokenStream(adaptor,"token BEFORE");
        RewriteRuleTokenStream stream_DAY=new RewriteRuleTokenStream(adaptor,"token DAY");
        RewriteRuleTokenStream stream_AFTER=new RewriteRuleTokenStream(adaptor,"token AFTER");
        RewriteRuleTokenStream stream_THE=new RewriteRuleTokenStream(adaptor,"token THE");
        RewriteRuleTokenStream stream_130=new RewriteRuleTokenStream(adaptor,"token 130");
        RewriteRuleSubtreeStream stream_spelled_or_numeric_1_to_31=new RewriteRuleSubtreeStream(adaptor,"rule spelled_or_numeric_1_to_31");
        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:95:3: ( ( THE )? DAY AFTER -> SEEK_DIRECTION[\">\"] INTEGER[\"1\"] | spelled_or_numeric_1_to_31 DAY ( 's' )? AFTER -> SEEK_DIRECTION[\">\"] spelled_or_numeric_1_to_31 | ( THE )? DAY BEFORE -> SEEK_DIRECTION[\"<\"] INTEGER[\"1\"] | spelled_or_numeric_1_to_31 DAY ( 's' )? BEFORE -> SEEK_DIRECTION[\"<\"] spelled_or_numeric_1_to_31 )
            int alt23=4;
            alt23 = dfa23.predict(input);
            switch (alt23) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:95:5: ( THE )? DAY AFTER
                    {
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:95:5: ( THE )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==THE) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:95:5: THE
                            {
                            THE49=(Token)match(input,THE,FOLLOW_THE_in_date_prefix683); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_THE.add(THE49);


                            }
                            break;

                    }

                    DAY50=(Token)match(input,DAY,FOLLOW_DAY_in_date_prefix686); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DAY.add(DAY50);

                    AFTER51=(Token)match(input,AFTER,FOLLOW_AFTER_in_date_prefix688); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AFTER.add(AFTER51);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 95:48: -> SEEK_DIRECTION[\">\"] INTEGER[\"1\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(SEEK_DIRECTION, ">"));
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, "1"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:96:5: spelled_or_numeric_1_to_31 DAY ( 's' )? AFTER
                    {
                    pushFollow(FOLLOW_spelled_or_numeric_1_to_31_in_date_prefix730);
                    spelled_or_numeric_1_to_3152=spelled_or_numeric_1_to_31();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_spelled_or_numeric_1_to_31.add(spelled_or_numeric_1_to_3152.getTree());
                    DAY53=(Token)match(input,DAY,FOLLOW_DAY_in_date_prefix732); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DAY.add(DAY53);

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:96:36: ( 's' )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==130) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:96:36: 's'
                            {
                            char_literal54=(Token)match(input,130,FOLLOW_130_in_date_prefix734); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_130.add(char_literal54);


                            }
                            break;

                    }

                    AFTER55=(Token)match(input,AFTER,FOLLOW_AFTER_in_date_prefix737); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AFTER.add(AFTER55);



                    // AST REWRITE
                    // elements: spelled_or_numeric_1_to_31
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 96:48: -> SEEK_DIRECTION[\">\"] spelled_or_numeric_1_to_31
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(SEEK_DIRECTION, ">"));
                        adaptor.addChild(root_0, stream_spelled_or_numeric_1_to_31.nextTree());

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:97:5: ( THE )? DAY BEFORE
                    {
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:97:5: ( THE )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==THE) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:97:5: THE
                            {
                            THE56=(Token)match(input,THE,FOLLOW_THE_in_date_prefix751); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_THE.add(THE56);


                            }
                            break;

                    }

                    DAY57=(Token)match(input,DAY,FOLLOW_DAY_in_date_prefix754); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DAY.add(DAY57);

                    BEFORE58=(Token)match(input,BEFORE,FOLLOW_BEFORE_in_date_prefix756); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_BEFORE.add(BEFORE58);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 97:48: -> SEEK_DIRECTION[\"<\"] INTEGER[\"1\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(SEEK_DIRECTION, "<"));
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, "1"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:98:5: spelled_or_numeric_1_to_31 DAY ( 's' )? BEFORE
                    {
                    pushFollow(FOLLOW_spelled_or_numeric_1_to_31_in_date_prefix797);
                    spelled_or_numeric_1_to_3159=spelled_or_numeric_1_to_31();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_spelled_or_numeric_1_to_31.add(spelled_or_numeric_1_to_3159.getTree());
                    DAY60=(Token)match(input,DAY,FOLLOW_DAY_in_date_prefix799); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DAY.add(DAY60);

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:98:36: ( 's' )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==130) ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:98:36: 's'
                            {
                            char_literal61=(Token)match(input,130,FOLLOW_130_in_date_prefix801); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_130.add(char_literal61);


                            }
                            break;

                    }

                    BEFORE62=(Token)match(input,BEFORE,FOLLOW_BEFORE_in_date_prefix804); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_BEFORE.add(BEFORE62);



                    // AST REWRITE
                    // elements: spelled_or_numeric_1_to_31
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 98:48: -> SEEK_DIRECTION[\"<\"] spelled_or_numeric_1_to_31
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(SEEK_DIRECTION, "<"));
                        adaptor.addChild(root_0, stream_spelled_or_numeric_1_to_31.nextTree());

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
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:102:1: target_prefix : ( THIS -> SEEK_DIRECTION[\">\"] SEEK_TYPE[\"by_day\"] INTEGER[\"1\"] | ( THIS )? LAST -> SEEK_DIRECTION[\"<\"] SEEK_TYPE[\"by_week\"] INTEGER[\"1\"] | ( THIS )? PAST -> SEEK_DIRECTION[\"<\"] SEEK_TYPE[\"by_day\"] INTEGER[\"1\"] | ( THIS )? NEXT -> SEEK_DIRECTION[\">\"] SEEK_TYPE[\"by_week\"] INTEGER[\"1\"] | ( THIS )? COMING -> SEEK_DIRECTION[\">\"] SEEK_TYPE[\"by_day\"] INTEGER[\"1\"] | ( THIS )? UPCOMING -> SEEK_DIRECTION[\">\"] SEEK_TYPE[\"by_day\"] INTEGER[\"1\"] | ( IN )? spelled_or_numeric_1_to_31 -> SEEK_DIRECTION[\">\"] SEEK_TYPE[\"by_day\"] spelled_or_numeric_1_to_31 );
    public final DateParser.target_prefix_return target_prefix() throws RecognitionException {
        DateParser.target_prefix_return retval = new DateParser.target_prefix_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token THIS63=null;
        Token THIS64=null;
        Token LAST65=null;
        Token THIS66=null;
        Token PAST67=null;
        Token THIS68=null;
        Token NEXT69=null;
        Token THIS70=null;
        Token COMING71=null;
        Token THIS72=null;
        Token UPCOMING73=null;
        Token IN74=null;
        DateParser.spelled_or_numeric_1_to_31_return spelled_or_numeric_1_to_3175 = null;


        Object THIS63_tree=null;
        Object THIS64_tree=null;
        Object LAST65_tree=null;
        Object THIS66_tree=null;
        Object PAST67_tree=null;
        Object THIS68_tree=null;
        Object NEXT69_tree=null;
        Object THIS70_tree=null;
        Object COMING71_tree=null;
        Object THIS72_tree=null;
        Object UPCOMING73_tree=null;
        Object IN74_tree=null;
        RewriteRuleTokenStream stream_NEXT=new RewriteRuleTokenStream(adaptor,"token NEXT");
        RewriteRuleTokenStream stream_IN=new RewriteRuleTokenStream(adaptor,"token IN");
        RewriteRuleTokenStream stream_LAST=new RewriteRuleTokenStream(adaptor,"token LAST");
        RewriteRuleTokenStream stream_UPCOMING=new RewriteRuleTokenStream(adaptor,"token UPCOMING");
        RewriteRuleTokenStream stream_COMING=new RewriteRuleTokenStream(adaptor,"token COMING");
        RewriteRuleTokenStream stream_PAST=new RewriteRuleTokenStream(adaptor,"token PAST");
        RewriteRuleTokenStream stream_THIS=new RewriteRuleTokenStream(adaptor,"token THIS");
        RewriteRuleSubtreeStream stream_spelled_or_numeric_1_to_31=new RewriteRuleSubtreeStream(adaptor,"rule spelled_or_numeric_1_to_31");
        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:103:3: ( THIS -> SEEK_DIRECTION[\">\"] SEEK_TYPE[\"by_day\"] INTEGER[\"1\"] | ( THIS )? LAST -> SEEK_DIRECTION[\"<\"] SEEK_TYPE[\"by_week\"] INTEGER[\"1\"] | ( THIS )? PAST -> SEEK_DIRECTION[\"<\"] SEEK_TYPE[\"by_day\"] INTEGER[\"1\"] | ( THIS )? NEXT -> SEEK_DIRECTION[\">\"] SEEK_TYPE[\"by_week\"] INTEGER[\"1\"] | ( THIS )? COMING -> SEEK_DIRECTION[\">\"] SEEK_TYPE[\"by_day\"] INTEGER[\"1\"] | ( THIS )? UPCOMING -> SEEK_DIRECTION[\">\"] SEEK_TYPE[\"by_day\"] INTEGER[\"1\"] | ( IN )? spelled_or_numeric_1_to_31 -> SEEK_DIRECTION[\">\"] SEEK_TYPE[\"by_day\"] spelled_or_numeric_1_to_31 )
            int alt30=7;
            switch ( input.LA(1) ) {
            case THIS:
                {
                switch ( input.LA(2) ) {
                case NEXT:
                    {
                    alt30=4;
                    }
                    break;
                case UPCOMING:
                    {
                    alt30=6;
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
                    alt30=1;
                    }
                    break;
                case LAST:
                    {
                    alt30=2;
                    }
                    break;
                case COMING:
                    {
                    alt30=5;
                    }
                    break;
                case PAST:
                    {
                    alt30=3;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 30, 1, input);

                    throw nvae;
                }

                }
                break;
            case LAST:
                {
                alt30=2;
                }
                break;
            case PAST:
                {
                alt30=3;
                }
                break;
            case NEXT:
                {
                alt30=4;
                }
                break;
            case COMING:
                {
                alt30=5;
                }
                break;
            case UPCOMING:
                {
                alt30=6;
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
            case ONE_TO_TWELVE:
            case THIRTEEN_TO_TWENTY_THREE:
            case TWENTY_FOUR_TO_THIRTY_ONE:
                {
                alt30=7;
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:103:5: THIS
                    {
                    THIS63=(Token)match(input,THIS,FOLLOW_THIS_in_target_prefix827); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THIS.add(THIS63);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 103:20: -> SEEK_DIRECTION[\">\"] SEEK_TYPE[\"by_day\"] INTEGER[\"1\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(SEEK_DIRECTION, ">"));
                        adaptor.addChild(root_0, (Object)adaptor.create(SEEK_TYPE, "by_day"));
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, "1"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:104:5: ( THIS )? LAST
                    {
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:104:5: ( THIS )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==THIS) ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:104:5: THIS
                            {
                            THIS64=(Token)match(input,THIS,FOLLOW_THIS_in_target_prefix854); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_THIS.add(THIS64);


                            }
                            break;

                    }

                    LAST65=(Token)match(input,LAST,FOLLOW_LAST_in_target_prefix857); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LAST.add(LAST65);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 104:20: -> SEEK_DIRECTION[\"<\"] SEEK_TYPE[\"by_week\"] INTEGER[\"1\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(SEEK_DIRECTION, "<"));
                        adaptor.addChild(root_0, (Object)adaptor.create(SEEK_TYPE, "by_week"));
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, "1"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:105:5: ( THIS )? PAST
                    {
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:105:5: ( THIS )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==THIS) ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:105:5: THIS
                            {
                            THIS66=(Token)match(input,THIS,FOLLOW_THIS_in_target_prefix878); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_THIS.add(THIS66);


                            }
                            break;

                    }

                    PAST67=(Token)match(input,PAST,FOLLOW_PAST_in_target_prefix881); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PAST.add(PAST67);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 105:20: -> SEEK_DIRECTION[\"<\"] SEEK_TYPE[\"by_day\"] INTEGER[\"1\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(SEEK_DIRECTION, "<"));
                        adaptor.addChild(root_0, (Object)adaptor.create(SEEK_TYPE, "by_day"));
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, "1"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:106:5: ( THIS )? NEXT
                    {
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:106:5: ( THIS )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==THIS) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:106:5: THIS
                            {
                            THIS68=(Token)match(input,THIS,FOLLOW_THIS_in_target_prefix902); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_THIS.add(THIS68);


                            }
                            break;

                    }

                    NEXT69=(Token)match(input,NEXT,FOLLOW_NEXT_in_target_prefix905); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NEXT.add(NEXT69);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 106:20: -> SEEK_DIRECTION[\">\"] SEEK_TYPE[\"by_week\"] INTEGER[\"1\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(SEEK_DIRECTION, ">"));
                        adaptor.addChild(root_0, (Object)adaptor.create(SEEK_TYPE, "by_week"));
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, "1"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:107:5: ( THIS )? COMING
                    {
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:107:5: ( THIS )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==THIS) ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:107:5: THIS
                            {
                            THIS70=(Token)match(input,THIS,FOLLOW_THIS_in_target_prefix926); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_THIS.add(THIS70);


                            }
                            break;

                    }

                    COMING71=(Token)match(input,COMING,FOLLOW_COMING_in_target_prefix929); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COMING.add(COMING71);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 107:20: -> SEEK_DIRECTION[\">\"] SEEK_TYPE[\"by_day\"] INTEGER[\"1\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(SEEK_DIRECTION, ">"));
                        adaptor.addChild(root_0, (Object)adaptor.create(SEEK_TYPE, "by_day"));
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, "1"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 6 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:108:5: ( THIS )? UPCOMING
                    {
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:108:5: ( THIS )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==THIS) ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:108:5: THIS
                            {
                            THIS72=(Token)match(input,THIS,FOLLOW_THIS_in_target_prefix948); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_THIS.add(THIS72);


                            }
                            break;

                    }

                    UPCOMING73=(Token)match(input,UPCOMING,FOLLOW_UPCOMING_in_target_prefix951); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_UPCOMING.add(UPCOMING73);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 108:20: -> SEEK_DIRECTION[\">\"] SEEK_TYPE[\"by_day\"] INTEGER[\"1\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(SEEK_DIRECTION, ">"));
                        adaptor.addChild(root_0, (Object)adaptor.create(SEEK_TYPE, "by_day"));
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, "1"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 7 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:109:5: ( IN )? spelled_or_numeric_1_to_31
                    {
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:109:5: ( IN )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==IN) ) {
                        alt29=1;
                    }
                    switch (alt29) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:109:5: IN
                            {
                            IN74=(Token)match(input,IN,FOLLOW_IN_in_target_prefix968); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_IN.add(IN74);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_spelled_or_numeric_1_to_31_in_target_prefix971);
                    spelled_or_numeric_1_to_3175=spelled_or_numeric_1_to_31();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_spelled_or_numeric_1_to_31.add(spelled_or_numeric_1_to_3175.getTree());


                    // AST REWRITE
                    // elements: spelled_or_numeric_1_to_31
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 109:36: -> SEEK_DIRECTION[\">\"] SEEK_TYPE[\"by_day\"] spelled_or_numeric_1_to_31
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(SEEK_DIRECTION, ">"));
                        adaptor.addChild(root_0, (Object)adaptor.create(SEEK_TYPE, "by_day"));
                        adaptor.addChild(root_0, stream_spelled_or_numeric_1_to_31.nextTree());

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
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:113:1: target_suffix : ( FROM_NOW -> SEEK_DIRECTION[\">\"] SEEK_TYPE[\"by_day\"] | AGO -> SEEK_DIRECTION[\"<\"] SEEK_TYPE[\"by_day\"] );
    public final DateParser.target_suffix_return target_suffix() throws RecognitionException {
        DateParser.target_suffix_return retval = new DateParser.target_suffix_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token FROM_NOW76=null;
        Token AGO77=null;

        Object FROM_NOW76_tree=null;
        Object AGO77_tree=null;
        RewriteRuleTokenStream stream_AGO=new RewriteRuleTokenStream(adaptor,"token AGO");
        RewriteRuleTokenStream stream_FROM_NOW=new RewriteRuleTokenStream(adaptor,"token FROM_NOW");

        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:114:3: ( FROM_NOW -> SEEK_DIRECTION[\">\"] SEEK_TYPE[\"by_day\"] | AGO -> SEEK_DIRECTION[\"<\"] SEEK_TYPE[\"by_day\"] )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==FROM_NOW) ) {
                alt31=1;
            }
            else if ( (LA31_0==AGO) ) {
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:114:5: FROM_NOW
                    {
                    FROM_NOW76=(Token)match(input,FROM_NOW,FOLLOW_FROM_NOW_in_target_suffix997); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FROM_NOW.add(FROM_NOW76);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 114:14: -> SEEK_DIRECTION[\">\"] SEEK_TYPE[\"by_day\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(SEEK_DIRECTION, ">"));
                        adaptor.addChild(root_0, (Object)adaptor.create(SEEK_TYPE, "by_day"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:115:5: AGO
                    {
                    AGO77=(Token)match(input,AGO,FOLLOW_AGO_in_target_suffix1011); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AGO.add(AGO77);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 115:14: -> SEEK_DIRECTION[\"<\"] SEEK_TYPE[\"by_day\"]
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
    // $ANTLR end "target_suffix"

    public static class modifiable_target_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "modifiable_target"
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:119:1: modifiable_target : ( day_of_week | date_span | month );
    public final DateParser.modifiable_target_return modifiable_target() throws RecognitionException {
        DateParser.modifiable_target_return retval = new DateParser.modifiable_target_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        DateParser.day_of_week_return day_of_week78 = null;

        DateParser.date_span_return date_span79 = null;

        DateParser.month_return month80 = null;



        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:120:3: ( day_of_week | date_span | month )
            int alt32=3;
            switch ( input.LA(1) ) {
            case SUNDAY:
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
            case FRIDAY:
            case SATURDAY:
                {
                alt32=1;
                }
                break;
            case DAY:
            case WEEK:
            case MONTH:
            case YEAR:
                {
                alt32=2;
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
                alt32=3;
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:120:5: day_of_week
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_day_of_week_in_modifiable_target1040);
                    day_of_week78=day_of_week();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, day_of_week78.getTree());

                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:121:5: date_span
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_date_span_in_modifiable_target1047);
                    date_span79=date_span();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, date_span79.getTree());

                    }
                    break;
                case 3 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:122:5: month
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_month_in_modifiable_target1053);
                    month80=month();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, month80.getTree());

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
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:125:1: date_span : ( DAY -> SPAN[\"day\"] | WEEK -> SPAN[\"week\"] | MONTH -> SPAN[\"month\"] | YEAR -> SPAN[\"year\"] );
    public final DateParser.date_span_return date_span() throws RecognitionException {
        DateParser.date_span_return retval = new DateParser.date_span_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DAY81=null;
        Token WEEK82=null;
        Token MONTH83=null;
        Token YEAR84=null;

        Object DAY81_tree=null;
        Object WEEK82_tree=null;
        Object MONTH83_tree=null;
        Object YEAR84_tree=null;
        RewriteRuleTokenStream stream_WEEK=new RewriteRuleTokenStream(adaptor,"token WEEK");
        RewriteRuleTokenStream stream_DAY=new RewriteRuleTokenStream(adaptor,"token DAY");
        RewriteRuleTokenStream stream_YEAR=new RewriteRuleTokenStream(adaptor,"token YEAR");
        RewriteRuleTokenStream stream_MONTH=new RewriteRuleTokenStream(adaptor,"token MONTH");

        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:126:3: ( DAY -> SPAN[\"day\"] | WEEK -> SPAN[\"week\"] | MONTH -> SPAN[\"month\"] | YEAR -> SPAN[\"year\"] )
            int alt33=4;
            switch ( input.LA(1) ) {
            case DAY:
                {
                alt33=1;
                }
                break;
            case WEEK:
                {
                alt33=2;
                }
                break;
            case MONTH:
                {
                alt33=3;
                }
                break;
            case YEAR:
                {
                alt33=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:126:5: DAY
                    {
                    DAY81=(Token)match(input,DAY,FOLLOW_DAY_in_date_span1068); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DAY.add(DAY81);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 126:11: -> SPAN[\"day\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(SPAN, "day"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:127:5: WEEK
                    {
                    WEEK82=(Token)match(input,WEEK,FOLLOW_WEEK_in_date_span1081); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WEEK.add(WEEK82);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 127:11: -> SPAN[\"week\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(SPAN, "week"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:128:5: MONTH
                    {
                    MONTH83=(Token)match(input,MONTH,FOLLOW_MONTH_in_date_span1093); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_MONTH.add(MONTH83);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 128:11: -> SPAN[\"month\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(SPAN, "month"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:129:5: YEAR
                    {
                    YEAR84=(Token)match(input,YEAR,FOLLOW_YEAR_in_date_span1104); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_YEAR.add(YEAR84);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 129:11: -> SPAN[\"year\"]
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
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:132:1: month : ( JANUARY -> ^( MONTH_OF_YEAR INTEGER[\"1\"] ) | FEBRUARY -> ^( MONTH_OF_YEAR INTEGER[\"2\"] ) | MARCH -> ^( MONTH_OF_YEAR INTEGER[\"3\"] ) | APRIL -> ^( MONTH_OF_YEAR INTEGER[\"4\"] ) | MAY -> ^( MONTH_OF_YEAR INTEGER[\"5\"] ) | JUNE -> ^( MONTH_OF_YEAR INTEGER[\"6\"] ) | JULY -> ^( MONTH_OF_YEAR INTEGER[\"7\"] ) | AUGUST -> ^( MONTH_OF_YEAR INTEGER[\"8\"] ) | SEPTEMBER -> ^( MONTH_OF_YEAR INTEGER[\"9\"] ) | OCTOBER -> ^( MONTH_OF_YEAR INTEGER[\"10\"] ) | NOVEMBER -> ^( MONTH_OF_YEAR INTEGER[\"11\"] ) | DECEMBER -> ^( MONTH_OF_YEAR INTEGER[\"12\"] ) );
    public final DateParser.month_return month() throws RecognitionException {
        DateParser.month_return retval = new DateParser.month_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token JANUARY85=null;
        Token FEBRUARY86=null;
        Token MARCH87=null;
        Token APRIL88=null;
        Token MAY89=null;
        Token JUNE90=null;
        Token JULY91=null;
        Token AUGUST92=null;
        Token SEPTEMBER93=null;
        Token OCTOBER94=null;
        Token NOVEMBER95=null;
        Token DECEMBER96=null;

        Object JANUARY85_tree=null;
        Object FEBRUARY86_tree=null;
        Object MARCH87_tree=null;
        Object APRIL88_tree=null;
        Object MAY89_tree=null;
        Object JUNE90_tree=null;
        Object JULY91_tree=null;
        Object AUGUST92_tree=null;
        Object SEPTEMBER93_tree=null;
        Object OCTOBER94_tree=null;
        Object NOVEMBER95_tree=null;
        Object DECEMBER96_tree=null;
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
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:133:3: ( JANUARY -> ^( MONTH_OF_YEAR INTEGER[\"1\"] ) | FEBRUARY -> ^( MONTH_OF_YEAR INTEGER[\"2\"] ) | MARCH -> ^( MONTH_OF_YEAR INTEGER[\"3\"] ) | APRIL -> ^( MONTH_OF_YEAR INTEGER[\"4\"] ) | MAY -> ^( MONTH_OF_YEAR INTEGER[\"5\"] ) | JUNE -> ^( MONTH_OF_YEAR INTEGER[\"6\"] ) | JULY -> ^( MONTH_OF_YEAR INTEGER[\"7\"] ) | AUGUST -> ^( MONTH_OF_YEAR INTEGER[\"8\"] ) | SEPTEMBER -> ^( MONTH_OF_YEAR INTEGER[\"9\"] ) | OCTOBER -> ^( MONTH_OF_YEAR INTEGER[\"10\"] ) | NOVEMBER -> ^( MONTH_OF_YEAR INTEGER[\"11\"] ) | DECEMBER -> ^( MONTH_OF_YEAR INTEGER[\"12\"] ) )
            int alt34=12;
            switch ( input.LA(1) ) {
            case JANUARY:
                {
                alt34=1;
                }
                break;
            case FEBRUARY:
                {
                alt34=2;
                }
                break;
            case MARCH:
                {
                alt34=3;
                }
                break;
            case APRIL:
                {
                alt34=4;
                }
                break;
            case MAY:
                {
                alt34=5;
                }
                break;
            case JUNE:
                {
                alt34=6;
                }
                break;
            case JULY:
                {
                alt34=7;
                }
                break;
            case AUGUST:
                {
                alt34=8;
                }
                break;
            case SEPTEMBER:
                {
                alt34=9;
                }
                break;
            case OCTOBER:
                {
                alt34=10;
                }
                break;
            case NOVEMBER:
                {
                alt34=11;
                }
                break;
            case DECEMBER:
                {
                alt34=12;
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:133:5: JANUARY
                    {
                    JANUARY85=(Token)match(input,JANUARY,FOLLOW_JANUARY_in_month1125); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_JANUARY.add(JANUARY85);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 133:15: -> ^( MONTH_OF_YEAR INTEGER[\"1\"] )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:133:18: ^( MONTH_OF_YEAR INTEGER[\"1\"] )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(MONTH_OF_YEAR, "MONTH_OF_YEAR"), root_1);

                        adaptor.addChild(root_1, (Object)adaptor.create(INTEGER, "1"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:134:5: FEBRUARY
                    {
                    FEBRUARY86=(Token)match(input,FEBRUARY,FOLLOW_FEBRUARY_in_month1142); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FEBRUARY.add(FEBRUARY86);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 134:15: -> ^( MONTH_OF_YEAR INTEGER[\"2\"] )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:134:18: ^( MONTH_OF_YEAR INTEGER[\"2\"] )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(MONTH_OF_YEAR, "MONTH_OF_YEAR"), root_1);

                        adaptor.addChild(root_1, (Object)adaptor.create(INTEGER, "2"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:135:5: MARCH
                    {
                    MARCH87=(Token)match(input,MARCH,FOLLOW_MARCH_in_month1158); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_MARCH.add(MARCH87);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 135:15: -> ^( MONTH_OF_YEAR INTEGER[\"3\"] )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:135:18: ^( MONTH_OF_YEAR INTEGER[\"3\"] )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(MONTH_OF_YEAR, "MONTH_OF_YEAR"), root_1);

                        adaptor.addChild(root_1, (Object)adaptor.create(INTEGER, "3"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:136:5: APRIL
                    {
                    APRIL88=(Token)match(input,APRIL,FOLLOW_APRIL_in_month1177); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_APRIL.add(APRIL88);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 136:15: -> ^( MONTH_OF_YEAR INTEGER[\"4\"] )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:136:18: ^( MONTH_OF_YEAR INTEGER[\"4\"] )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(MONTH_OF_YEAR, "MONTH_OF_YEAR"), root_1);

                        adaptor.addChild(root_1, (Object)adaptor.create(INTEGER, "4"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:137:5: MAY
                    {
                    MAY89=(Token)match(input,MAY,FOLLOW_MAY_in_month1196); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_MAY.add(MAY89);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 137:15: -> ^( MONTH_OF_YEAR INTEGER[\"5\"] )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:137:18: ^( MONTH_OF_YEAR INTEGER[\"5\"] )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(MONTH_OF_YEAR, "MONTH_OF_YEAR"), root_1);

                        adaptor.addChild(root_1, (Object)adaptor.create(INTEGER, "5"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 6 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:138:5: JUNE
                    {
                    JUNE90=(Token)match(input,JUNE,FOLLOW_JUNE_in_month1217); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_JUNE.add(JUNE90);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 138:15: -> ^( MONTH_OF_YEAR INTEGER[\"6\"] )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:138:18: ^( MONTH_OF_YEAR INTEGER[\"6\"] )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(MONTH_OF_YEAR, "MONTH_OF_YEAR"), root_1);

                        adaptor.addChild(root_1, (Object)adaptor.create(INTEGER, "6"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 7 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:139:5: JULY
                    {
                    JULY91=(Token)match(input,JULY,FOLLOW_JULY_in_month1237); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_JULY.add(JULY91);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 139:15: -> ^( MONTH_OF_YEAR INTEGER[\"7\"] )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:139:18: ^( MONTH_OF_YEAR INTEGER[\"7\"] )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(MONTH_OF_YEAR, "MONTH_OF_YEAR"), root_1);

                        adaptor.addChild(root_1, (Object)adaptor.create(INTEGER, "7"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 8 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:140:5: AUGUST
                    {
                    AUGUST92=(Token)match(input,AUGUST,FOLLOW_AUGUST_in_month1257); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AUGUST.add(AUGUST92);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 140:15: -> ^( MONTH_OF_YEAR INTEGER[\"8\"] )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:140:18: ^( MONTH_OF_YEAR INTEGER[\"8\"] )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(MONTH_OF_YEAR, "MONTH_OF_YEAR"), root_1);

                        adaptor.addChild(root_1, (Object)adaptor.create(INTEGER, "8"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 9 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:141:5: SEPTEMBER
                    {
                    SEPTEMBER93=(Token)match(input,SEPTEMBER,FOLLOW_SEPTEMBER_in_month1275); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEPTEMBER.add(SEPTEMBER93);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 141:15: -> ^( MONTH_OF_YEAR INTEGER[\"9\"] )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:141:18: ^( MONTH_OF_YEAR INTEGER[\"9\"] )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(MONTH_OF_YEAR, "MONTH_OF_YEAR"), root_1);

                        adaptor.addChild(root_1, (Object)adaptor.create(INTEGER, "9"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 10 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:142:5: OCTOBER
                    {
                    OCTOBER94=(Token)match(input,OCTOBER,FOLLOW_OCTOBER_in_month1290); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OCTOBER.add(OCTOBER94);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 142:15: -> ^( MONTH_OF_YEAR INTEGER[\"10\"] )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:142:18: ^( MONTH_OF_YEAR INTEGER[\"10\"] )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(MONTH_OF_YEAR, "MONTH_OF_YEAR"), root_1);

                        adaptor.addChild(root_1, (Object)adaptor.create(INTEGER, "10"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 11 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:143:5: NOVEMBER
                    {
                    NOVEMBER95=(Token)match(input,NOVEMBER,FOLLOW_NOVEMBER_in_month1307); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NOVEMBER.add(NOVEMBER95);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 143:15: -> ^( MONTH_OF_YEAR INTEGER[\"11\"] )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:143:18: ^( MONTH_OF_YEAR INTEGER[\"11\"] )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(MONTH_OF_YEAR, "MONTH_OF_YEAR"), root_1);

                        adaptor.addChild(root_1, (Object)adaptor.create(INTEGER, "11"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 12 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:144:5: DECEMBER
                    {
                    DECEMBER96=(Token)match(input,DECEMBER,FOLLOW_DECEMBER_in_month1323); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DECEMBER.add(DECEMBER96);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 144:15: -> ^( MONTH_OF_YEAR INTEGER[\"12\"] )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:144:18: ^( MONTH_OF_YEAR INTEGER[\"12\"] )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(MONTH_OF_YEAR, "MONTH_OF_YEAR"), root_1);

                        adaptor.addChild(root_1, (Object)adaptor.create(INTEGER, "12"));

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
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:147:1: day_of_month : ( spelled_or_numeric_1_to_31 -> ^( DAY_OF_MONTH spelled_or_numeric_1_to_31 ) | spelled_sequence_1_to_31 -> ^( DAY_OF_MONTH spelled_sequence_1_to_31 ) );
    public final DateParser.day_of_month_return day_of_month() throws RecognitionException {
        DateParser.day_of_month_return retval = new DateParser.day_of_month_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        DateParser.spelled_or_numeric_1_to_31_return spelled_or_numeric_1_to_3197 = null;

        DateParser.spelled_sequence_1_to_31_return spelled_sequence_1_to_3198 = null;


        RewriteRuleSubtreeStream stream_spelled_or_numeric_1_to_31=new RewriteRuleSubtreeStream(adaptor,"rule spelled_or_numeric_1_to_31");
        RewriteRuleSubtreeStream stream_spelled_sequence_1_to_31=new RewriteRuleSubtreeStream(adaptor,"rule spelled_sequence_1_to_31");
        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:148:3: ( spelled_or_numeric_1_to_31 -> ^( DAY_OF_MONTH spelled_or_numeric_1_to_31 ) | spelled_sequence_1_to_31 -> ^( DAY_OF_MONTH spelled_sequence_1_to_31 ) )
            int alt35=2;
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
            case ONE_TO_TWELVE:
            case THIRTEEN_TO_TWENTY_THREE:
            case TWENTY_FOUR_TO_THIRTY_ONE:
                {
                alt35=1;
                }
                break;
            case TWENTY:
                {
                switch ( input.LA(2) ) {
                case DASH:
                    {
                    int LA35_5 = input.LA(3);

                    if ( ((LA35_5>=ONE && LA35_5<=NINE)) ) {
                        alt35=1;
                    }
                    else if ( ((LA35_5>=FIRST && LA35_5<=NINTH)) ) {
                        alt35=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 35, 5, input);

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
                    alt35=2;
                    }
                    break;
                case EOF:
                case AT:
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
                case ONE_TO_TWELVE:
                case UP_TO_TWO_ZEROS:
                case THIRTEEN_TO_TWENTY_THREE:
                case TWENTY_FOUR_TO_THIRTY_ONE:
                case THIRTY_TWO_TO_FIFTY_NINE:
                case SIXTY_TO_NINETY_NINE:
                case 127:
                case 128:
                case 131:
                    {
                    alt35=1;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 35, 2, input);

                    throw nvae;
                }

                }
                break;
            case THIRTY:
                {
                switch ( input.LA(2) ) {
                case EOF:
                case AT:
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
                case ONE_TO_TWELVE:
                case UP_TO_TWO_ZEROS:
                case THIRTEEN_TO_TWENTY_THREE:
                case TWENTY_FOUR_TO_THIRTY_ONE:
                case THIRTY_TWO_TO_FIFTY_NINE:
                case SIXTY_TO_NINETY_NINE:
                case 127:
                case 128:
                case 131:
                    {
                    alt35=1;
                    }
                    break;
                case DASH:
                    {
                    int LA35_6 = input.LA(3);

                    if ( (LA35_6==FIRST) ) {
                        alt35=2;
                    }
                    else if ( (LA35_6==ONE) ) {
                        alt35=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 35, 6, input);

                        throw nvae;
                    }
                    }
                    break;
                case FIRST:
                    {
                    alt35=2;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 35, 3, input);

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
                alt35=2;
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:148:5: spelled_or_numeric_1_to_31
                    {
                    pushFollow(FOLLOW_spelled_or_numeric_1_to_31_in_day_of_month1348);
                    spelled_or_numeric_1_to_3197=spelled_or_numeric_1_to_31();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_spelled_or_numeric_1_to_31.add(spelled_or_numeric_1_to_3197.getTree());


                    // AST REWRITE
                    // elements: spelled_or_numeric_1_to_31
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 148:32: -> ^( DAY_OF_MONTH spelled_or_numeric_1_to_31 )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:148:35: ^( DAY_OF_MONTH spelled_or_numeric_1_to_31 )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DAY_OF_MONTH, "DAY_OF_MONTH"), root_1);

                        adaptor.addChild(root_1, stream_spelled_or_numeric_1_to_31.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:149:5: spelled_sequence_1_to_31
                    {
                    pushFollow(FOLLOW_spelled_sequence_1_to_31_in_day_of_month1362);
                    spelled_sequence_1_to_3198=spelled_sequence_1_to_31();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_spelled_sequence_1_to_31.add(spelled_sequence_1_to_3198.getTree());


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
                    // 149:32: -> ^( DAY_OF_MONTH spelled_sequence_1_to_31 )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:149:35: ^( DAY_OF_MONTH spelled_sequence_1_to_31 )
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
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:152:1: day_of_week : ( SUNDAY -> ^( DAY_OF_WEEK INTEGER[\"1\"] ) | MONDAY -> ^( DAY_OF_WEEK INTEGER[\"2\"] ) | TUESDAY -> ^( DAY_OF_WEEK INTEGER[\"3\"] ) | WEDNESDAY -> ^( DAY_OF_WEEK INTEGER[\"4\"] ) | THURSDAY -> ^( DAY_OF_WEEK INTEGER[\"5\"] ) | FRIDAY -> ^( DAY_OF_WEEK INTEGER[\"6\"] ) | SATURDAY -> ^( DAY_OF_WEEK INTEGER[\"7\"] ) );
    public final DateParser.day_of_week_return day_of_week() throws RecognitionException {
        DateParser.day_of_week_return retval = new DateParser.day_of_week_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SUNDAY99=null;
        Token MONDAY100=null;
        Token TUESDAY101=null;
        Token WEDNESDAY102=null;
        Token THURSDAY103=null;
        Token FRIDAY104=null;
        Token SATURDAY105=null;

        Object SUNDAY99_tree=null;
        Object MONDAY100_tree=null;
        Object TUESDAY101_tree=null;
        Object WEDNESDAY102_tree=null;
        Object THURSDAY103_tree=null;
        Object FRIDAY104_tree=null;
        Object SATURDAY105_tree=null;
        RewriteRuleTokenStream stream_MONDAY=new RewriteRuleTokenStream(adaptor,"token MONDAY");
        RewriteRuleTokenStream stream_SUNDAY=new RewriteRuleTokenStream(adaptor,"token SUNDAY");
        RewriteRuleTokenStream stream_WEDNESDAY=new RewriteRuleTokenStream(adaptor,"token WEDNESDAY");
        RewriteRuleTokenStream stream_THURSDAY=new RewriteRuleTokenStream(adaptor,"token THURSDAY");
        RewriteRuleTokenStream stream_SATURDAY=new RewriteRuleTokenStream(adaptor,"token SATURDAY");
        RewriteRuleTokenStream stream_TUESDAY=new RewriteRuleTokenStream(adaptor,"token TUESDAY");
        RewriteRuleTokenStream stream_FRIDAY=new RewriteRuleTokenStream(adaptor,"token FRIDAY");

        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:153:3: ( SUNDAY -> ^( DAY_OF_WEEK INTEGER[\"1\"] ) | MONDAY -> ^( DAY_OF_WEEK INTEGER[\"2\"] ) | TUESDAY -> ^( DAY_OF_WEEK INTEGER[\"3\"] ) | WEDNESDAY -> ^( DAY_OF_WEEK INTEGER[\"4\"] ) | THURSDAY -> ^( DAY_OF_WEEK INTEGER[\"5\"] ) | FRIDAY -> ^( DAY_OF_WEEK INTEGER[\"6\"] ) | SATURDAY -> ^( DAY_OF_WEEK INTEGER[\"7\"] ) )
            int alt36=7;
            switch ( input.LA(1) ) {
            case SUNDAY:
                {
                alt36=1;
                }
                break;
            case MONDAY:
                {
                alt36=2;
                }
                break;
            case TUESDAY:
                {
                alt36=3;
                }
                break;
            case WEDNESDAY:
                {
                alt36=4;
                }
                break;
            case THURSDAY:
                {
                alt36=5;
                }
                break;
            case FRIDAY:
                {
                alt36=6;
                }
                break;
            case SATURDAY:
                {
                alt36=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }

            switch (alt36) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:153:5: SUNDAY
                    {
                    SUNDAY99=(Token)match(input,SUNDAY,FOLLOW_SUNDAY_in_day_of_week1388); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SUNDAY.add(SUNDAY99);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 153:15: -> ^( DAY_OF_WEEK INTEGER[\"1\"] )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:153:18: ^( DAY_OF_WEEK INTEGER[\"1\"] )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DAY_OF_WEEK, "DAY_OF_WEEK"), root_1);

                        adaptor.addChild(root_1, (Object)adaptor.create(INTEGER, "1"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:154:5: MONDAY
                    {
                    MONDAY100=(Token)match(input,MONDAY,FOLLOW_MONDAY_in_day_of_week1406); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_MONDAY.add(MONDAY100);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 154:15: -> ^( DAY_OF_WEEK INTEGER[\"2\"] )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:154:18: ^( DAY_OF_WEEK INTEGER[\"2\"] )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DAY_OF_WEEK, "DAY_OF_WEEK"), root_1);

                        adaptor.addChild(root_1, (Object)adaptor.create(INTEGER, "2"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:155:5: TUESDAY
                    {
                    TUESDAY101=(Token)match(input,TUESDAY,FOLLOW_TUESDAY_in_day_of_week1424); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TUESDAY.add(TUESDAY101);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 155:15: -> ^( DAY_OF_WEEK INTEGER[\"3\"] )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:155:18: ^( DAY_OF_WEEK INTEGER[\"3\"] )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DAY_OF_WEEK, "DAY_OF_WEEK"), root_1);

                        adaptor.addChild(root_1, (Object)adaptor.create(INTEGER, "3"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:156:5: WEDNESDAY
                    {
                    WEDNESDAY102=(Token)match(input,WEDNESDAY,FOLLOW_WEDNESDAY_in_day_of_week1441); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WEDNESDAY.add(WEDNESDAY102);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 156:15: -> ^( DAY_OF_WEEK INTEGER[\"4\"] )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:156:18: ^( DAY_OF_WEEK INTEGER[\"4\"] )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DAY_OF_WEEK, "DAY_OF_WEEK"), root_1);

                        adaptor.addChild(root_1, (Object)adaptor.create(INTEGER, "4"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:157:5: THURSDAY
                    {
                    THURSDAY103=(Token)match(input,THURSDAY,FOLLOW_THURSDAY_in_day_of_week1456); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THURSDAY.add(THURSDAY103);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 157:15: -> ^( DAY_OF_WEEK INTEGER[\"5\"] )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:157:18: ^( DAY_OF_WEEK INTEGER[\"5\"] )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DAY_OF_WEEK, "DAY_OF_WEEK"), root_1);

                        adaptor.addChild(root_1, (Object)adaptor.create(INTEGER, "5"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 6 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:158:5: FRIDAY
                    {
                    FRIDAY104=(Token)match(input,FRIDAY,FOLLOW_FRIDAY_in_day_of_week1472); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FRIDAY.add(FRIDAY104);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 158:15: -> ^( DAY_OF_WEEK INTEGER[\"6\"] )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:158:18: ^( DAY_OF_WEEK INTEGER[\"6\"] )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DAY_OF_WEEK, "DAY_OF_WEEK"), root_1);

                        adaptor.addChild(root_1, (Object)adaptor.create(INTEGER, "6"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 7 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:159:5: SATURDAY
                    {
                    SATURDAY105=(Token)match(input,SATURDAY,FOLLOW_SATURDAY_in_day_of_week1490); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SATURDAY.add(SATURDAY105);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 159:15: -> ^( DAY_OF_WEEK INTEGER[\"7\"] )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:159:18: ^( DAY_OF_WEEK INTEGER[\"7\"] )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DAY_OF_WEEK, "DAY_OF_WEEK"), root_1);

                        adaptor.addChild(root_1, (Object)adaptor.create(INTEGER, "7"));

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
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:162:1: year options {backtrack=true; } : ( ( '\\'' )? integer_0_to_99 -> ^( YEAR_OF INTEGER[$integer_0_to_99.text] ) | ( IN THE YEAR )? four_digits -> ^( YEAR_OF INTEGER[$four_digits.text] ) );
    public final DateParser.year_return year() throws RecognitionException {
        DateParser.year_return retval = new DateParser.year_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal106=null;
        Token IN108=null;
        Token THE109=null;
        Token YEAR110=null;
        DateParser.integer_0_to_99_return integer_0_to_99107 = null;

        DateParser.four_digits_return four_digits111 = null;


        Object char_literal106_tree=null;
        Object IN108_tree=null;
        Object THE109_tree=null;
        Object YEAR110_tree=null;
        RewriteRuleTokenStream stream_IN=new RewriteRuleTokenStream(adaptor,"token IN");
        RewriteRuleTokenStream stream_YEAR=new RewriteRuleTokenStream(adaptor,"token YEAR");
        RewriteRuleTokenStream stream_THE=new RewriteRuleTokenStream(adaptor,"token THE");
        RewriteRuleTokenStream stream_131=new RewriteRuleTokenStream(adaptor,"token 131");
        RewriteRuleSubtreeStream stream_four_digits=new RewriteRuleSubtreeStream(adaptor,"rule four_digits");
        RewriteRuleSubtreeStream stream_integer_0_to_99=new RewriteRuleSubtreeStream(adaptor,"rule integer_0_to_99");
        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:164:3: ( ( '\\'' )? integer_0_to_99 -> ^( YEAR_OF INTEGER[$integer_0_to_99.text] ) | ( IN THE YEAR )? four_digits -> ^( YEAR_OF INTEGER[$four_digits.text] ) )
            int alt39=2;
            switch ( input.LA(1) ) {
            case 131:
                {
                alt39=1;
                }
                break;
            case UP_TO_TWO_ZEROS:
                {
                int LA39_2 = input.LA(2);

                if ( (synpred6_Date()) ) {
                    alt39=1;
                }
                else if ( (true) ) {
                    alt39=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 39, 2, input);

                    throw nvae;
                }
                }
                break;
            case ONE_TO_TWELVE:
                {
                int LA39_3 = input.LA(2);

                if ( (synpred6_Date()) ) {
                    alt39=1;
                }
                else if ( (true) ) {
                    alt39=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 39, 3, input);

                    throw nvae;
                }
                }
                break;
            case THIRTEEN_TO_TWENTY_THREE:
                {
                int LA39_4 = input.LA(2);

                if ( (synpred6_Date()) ) {
                    alt39=1;
                }
                else if ( (true) ) {
                    alt39=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 39, 4, input);

                    throw nvae;
                }
                }
                break;
            case TWENTY_FOUR_TO_THIRTY_ONE:
                {
                int LA39_5 = input.LA(2);

                if ( (synpred6_Date()) ) {
                    alt39=1;
                }
                else if ( (true) ) {
                    alt39=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 39, 5, input);

                    throw nvae;
                }
                }
                break;
            case THIRTY_TWO_TO_FIFTY_NINE:
                {
                int LA39_6 = input.LA(2);

                if ( (synpred6_Date()) ) {
                    alt39=1;
                }
                else if ( (true) ) {
                    alt39=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 39, 6, input);

                    throw nvae;
                }
                }
                break;
            case SIXTY_TO_NINETY_NINE:
                {
                int LA39_7 = input.LA(2);

                if ( (synpred6_Date()) ) {
                    alt39=1;
                }
                else if ( (true) ) {
                    alt39=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 39, 7, input);

                    throw nvae;
                }
                }
                break;
            case IN:
            case THREE_DIGIT:
            case FOUR_DIGIT:
                {
                alt39=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }

            switch (alt39) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:164:5: ( '\\'' )? integer_0_to_99
                    {
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:164:5: ( '\\'' )?
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( (LA37_0==131) ) {
                        alt37=1;
                    }
                    switch (alt37) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:164:5: '\\''
                            {
                            char_literal106=(Token)match(input,131,FOLLOW_131_in_year1524); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_131.add(char_literal106);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_integer_0_to_99_in_year1527);
                    integer_0_to_99107=integer_0_to_99();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_integer_0_to_99.add(integer_0_to_99107.getTree());


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 164:32: -> ^( YEAR_OF INTEGER[$integer_0_to_99.text] )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:164:35: ^( YEAR_OF INTEGER[$integer_0_to_99.text] )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(YEAR_OF, "YEAR_OF"), root_1);

                        adaptor.addChild(root_1, (Object)adaptor.create(INTEGER, (integer_0_to_99107!=null?input.toString(integer_0_to_99107.start,integer_0_to_99107.stop):null)));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:165:5: ( IN THE YEAR )? four_digits
                    {
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:165:5: ( IN THE YEAR )?
                    int alt38=2;
                    int LA38_0 = input.LA(1);

                    if ( (LA38_0==IN) ) {
                        alt38=1;
                    }
                    switch (alt38) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:165:6: IN THE YEAR
                            {
                            IN108=(Token)match(input,IN,FOLLOW_IN_in_year1548); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_IN.add(IN108);

                            THE109=(Token)match(input,THE,FOLLOW_THE_in_year1550); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_THE.add(THE109);

                            YEAR110=(Token)match(input,YEAR,FOLLOW_YEAR_in_year1552); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_YEAR.add(YEAR110);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_four_digits_in_year1556);
                    four_digits111=four_digits();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_four_digits.add(four_digits111.getTree());


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 165:32: -> ^( YEAR_OF INTEGER[$four_digits.text] )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:165:35: ^( YEAR_OF INTEGER[$four_digits.text] )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(YEAR_OF, "YEAR_OF"), root_1);

                        adaptor.addChild(root_1, (Object)adaptor.create(INTEGER, (four_digits111!=null?input.toString(four_digits111.start,four_digits111.stop):null)));

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

        Token set112=null;

        Object set112_tree=null;

        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:169:3: ( DASH | SLASH )
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:
            {
            root_0 = (Object)adaptor.nil();

            set112=(Token)input.LT(1);
            if ( (input.LA(1)>=DASH && input.LA(1)<=SLASH) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set112));
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
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:173:1: hours : integer_0_to_23 -> ^( HOURS integer_0_to_23 ) ;
    public final DateParser.hours_return hours() throws RecognitionException {
        DateParser.hours_return retval = new DateParser.hours_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        DateParser.integer_0_to_23_return integer_0_to_23113 = null;


        RewriteRuleSubtreeStream stream_integer_0_to_23=new RewriteRuleSubtreeStream(adaptor,"rule integer_0_to_23");
        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:174:3: ( integer_0_to_23 -> ^( HOURS integer_0_to_23 ) )
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:174:5: integer_0_to_23
            {
            pushFollow(FOLLOW_integer_0_to_23_in_hours1599);
            integer_0_to_23113=integer_0_to_23();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_integer_0_to_23.add(integer_0_to_23113.getTree());


            // AST REWRITE
            // elements: integer_0_to_23
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 174:21: -> ^( HOURS integer_0_to_23 )
            {
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:174:24: ^( HOURS integer_0_to_23 )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(HOURS, "HOURS"), root_1);

                adaptor.addChild(root_1, stream_integer_0_to_23.nextTree());

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
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:177:1: minutes : integer_0_to_59 -> ^( MINUTES integer_0_to_59 ) ;
    public final DateParser.minutes_return minutes() throws RecognitionException {
        DateParser.minutes_return retval = new DateParser.minutes_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        DateParser.integer_0_to_59_return integer_0_to_59114 = null;


        RewriteRuleSubtreeStream stream_integer_0_to_59=new RewriteRuleSubtreeStream(adaptor,"rule integer_0_to_59");
        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:178:3: ( integer_0_to_59 -> ^( MINUTES integer_0_to_59 ) )
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:178:5: integer_0_to_59
            {
            pushFollow(FOLLOW_integer_0_to_59_in_minutes1622);
            integer_0_to_59114=integer_0_to_59();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_integer_0_to_59.add(integer_0_to_59114.getTree());


            // AST REWRITE
            // elements: integer_0_to_59
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 178:21: -> ^( MINUTES integer_0_to_59 )
            {
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:178:24: ^( MINUTES integer_0_to_59 )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(MINUTES, "MINUTES"), root_1);

                adaptor.addChild(root_1, stream_integer_0_to_59.nextTree());

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

        Token AM115=null;
        Token PM116=null;

        Object AM115_tree=null;
        Object PM116_tree=null;
        RewriteRuleTokenStream stream_PM=new RewriteRuleTokenStream(adaptor,"token PM");
        RewriteRuleTokenStream stream_AM=new RewriteRuleTokenStream(adaptor,"token AM");

        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:182:3: ( AM -> AM_PM[\"am\"] | PM -> AM_PM[\"pm\"] )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==AM) ) {
                alt40=1;
            }
            else if ( (LA40_0==PM) ) {
                alt40=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }
            switch (alt40) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:182:5: AM
                    {
                    AM115=(Token)match(input,AM,FOLLOW_AM_in_meridian_indicator1645); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AM.add(AM115);



                    // AST REWRITE
                    // elements: 
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
                    PM116=(Token)match(input,PM,FOLLOW_PM_in_meridian_indicator1656); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PM.add(PM116);



                    // AST REWRITE
                    // elements: 
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
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:187:1: time_identifier : ( MIDNIGHT -> ^( EXPLICIT_TIME ^( HOURS INTEGER[\"12\"] ) AM_PM[\"am\"] ) | NOON -> ^( EXPLICIT_TIME ^( HOURS INTEGER[\"12\"] ) AM_PM[\"pm\"] ) );
    public final DateParser.time_identifier_return time_identifier() throws RecognitionException {
        DateParser.time_identifier_return retval = new DateParser.time_identifier_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token MIDNIGHT117=null;
        Token NOON118=null;

        Object MIDNIGHT117_tree=null;
        Object NOON118_tree=null;
        RewriteRuleTokenStream stream_NOON=new RewriteRuleTokenStream(adaptor,"token NOON");
        RewriteRuleTokenStream stream_MIDNIGHT=new RewriteRuleTokenStream(adaptor,"token MIDNIGHT");

        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:188:3: ( MIDNIGHT -> ^( EXPLICIT_TIME ^( HOURS INTEGER[\"12\"] ) AM_PM[\"am\"] ) | NOON -> ^( EXPLICIT_TIME ^( HOURS INTEGER[\"12\"] ) AM_PM[\"pm\"] ) )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==MIDNIGHT) ) {
                alt41=1;
            }
            else if ( (LA41_0==NOON) ) {
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:188:5: MIDNIGHT
                    {
                    MIDNIGHT117=(Token)match(input,MIDNIGHT,FOLLOW_MIDNIGHT_in_time_identifier1677); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_MIDNIGHT.add(MIDNIGHT117);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 188:14: -> ^( EXPLICIT_TIME ^( HOURS INTEGER[\"12\"] ) AM_PM[\"am\"] )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:188:17: ^( EXPLICIT_TIME ^( HOURS INTEGER[\"12\"] ) AM_PM[\"am\"] )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPLICIT_TIME, "EXPLICIT_TIME"), root_1);

                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:188:33: ^( HOURS INTEGER[\"12\"] )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(HOURS, "HOURS"), root_2);

                        adaptor.addChild(root_2, (Object)adaptor.create(INTEGER, "12"));

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
                    NOON118=(Token)match(input,NOON,FOLLOW_NOON_in_time_identifier1699); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NOON.add(NOON118);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 189:14: -> ^( EXPLICIT_TIME ^( HOURS INTEGER[\"12\"] ) AM_PM[\"pm\"] )
                    {
                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:189:17: ^( EXPLICIT_TIME ^( HOURS INTEGER[\"12\"] ) AM_PM[\"pm\"] )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPLICIT_TIME, "EXPLICIT_TIME"), root_1);

                        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:189:33: ^( HOURS INTEGER[\"12\"] )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(HOURS, "HOURS"), root_2);

                        adaptor.addChild(root_2, (Object)adaptor.create(INTEGER, "12"));

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

    public static class spelled_number_1_to_31_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "spelled_number_1_to_31"
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:193:1: spelled_number_1_to_31 : ( ONE -> INTEGER[\"1\"] | TWO -> INTEGER[\"2\"] | THREE -> INTEGER[\"3\"] | FOUR -> INTEGER[\"4\"] | FIVE -> INTEGER[\"5\"] | SIX -> INTEGER[\"6\"] | SEVEN -> INTEGER[\"7\"] | EIGHT -> INTEGER[\"8\"] | NINE -> INTEGER[\"9\"] | TEN -> INTEGER[\"10\"] | ELEVEN -> INTEGER[\"11\"] | TWELVE -> INTEGER[\"12\"] | THIRTEEN -> INTEGER[\"13\"] | FOURTEEN -> INTEGER[\"14\"] | FIFTEEN -> INTEGER[\"15\"] | SIXTEEN -> INTEGER[\"16\"] | SEVENTEEN -> INTEGER[\"17\"] | EIGHTEEN -> INTEGER[\"18\"] | NINETEEN -> INTEGER[\"19\"] | TWENTY -> INTEGER[\"20\"] | TWENTY ( DASH )? ONE -> INTEGER[\"21\"] | TWENTY ( DASH )? TWO -> INTEGER[\"22\"] | TWENTY ( DASH )? THREE -> INTEGER[\"23\"] | TWENTY ( DASH )? FOUR -> INTEGER[\"24\"] | TWENTY ( DASH )? FIVE -> INTEGER[\"25\"] | TWENTY ( DASH )? SIX -> INTEGER[\"26\"] | TWENTY ( DASH )? SEVEN -> INTEGER[\"27\"] | TWENTY ( DASH )? EIGHT -> INTEGER[\"28\"] | TWENTY ( DASH )? NINE -> INTEGER[\"29\"] | THIRTY -> INTEGER[\"30\"] | THIRTY ( DASH )? ONE -> INTEGER[\"31\"] );
    public final DateParser.spelled_number_1_to_31_return spelled_number_1_to_31() throws RecognitionException {
        DateParser.spelled_number_1_to_31_return retval = new DateParser.spelled_number_1_to_31_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ONE119=null;
        Token TWO120=null;
        Token THREE121=null;
        Token FOUR122=null;
        Token FIVE123=null;
        Token SIX124=null;
        Token SEVEN125=null;
        Token EIGHT126=null;
        Token NINE127=null;
        Token TEN128=null;
        Token ELEVEN129=null;
        Token TWELVE130=null;
        Token THIRTEEN131=null;
        Token FOURTEEN132=null;
        Token FIFTEEN133=null;
        Token SIXTEEN134=null;
        Token SEVENTEEN135=null;
        Token EIGHTEEN136=null;
        Token NINETEEN137=null;
        Token TWENTY138=null;
        Token TWENTY139=null;
        Token DASH140=null;
        Token ONE141=null;
        Token TWENTY142=null;
        Token DASH143=null;
        Token TWO144=null;
        Token TWENTY145=null;
        Token DASH146=null;
        Token THREE147=null;
        Token TWENTY148=null;
        Token DASH149=null;
        Token FOUR150=null;
        Token TWENTY151=null;
        Token DASH152=null;
        Token FIVE153=null;
        Token TWENTY154=null;
        Token DASH155=null;
        Token SIX156=null;
        Token TWENTY157=null;
        Token DASH158=null;
        Token SEVEN159=null;
        Token TWENTY160=null;
        Token DASH161=null;
        Token EIGHT162=null;
        Token TWENTY163=null;
        Token DASH164=null;
        Token NINE165=null;
        Token THIRTY166=null;
        Token THIRTY167=null;
        Token DASH168=null;
        Token ONE169=null;

        Object ONE119_tree=null;
        Object TWO120_tree=null;
        Object THREE121_tree=null;
        Object FOUR122_tree=null;
        Object FIVE123_tree=null;
        Object SIX124_tree=null;
        Object SEVEN125_tree=null;
        Object EIGHT126_tree=null;
        Object NINE127_tree=null;
        Object TEN128_tree=null;
        Object ELEVEN129_tree=null;
        Object TWELVE130_tree=null;
        Object THIRTEEN131_tree=null;
        Object FOURTEEN132_tree=null;
        Object FIFTEEN133_tree=null;
        Object SIXTEEN134_tree=null;
        Object SEVENTEEN135_tree=null;
        Object EIGHTEEN136_tree=null;
        Object NINETEEN137_tree=null;
        Object TWENTY138_tree=null;
        Object TWENTY139_tree=null;
        Object DASH140_tree=null;
        Object ONE141_tree=null;
        Object TWENTY142_tree=null;
        Object DASH143_tree=null;
        Object TWO144_tree=null;
        Object TWENTY145_tree=null;
        Object DASH146_tree=null;
        Object THREE147_tree=null;
        Object TWENTY148_tree=null;
        Object DASH149_tree=null;
        Object FOUR150_tree=null;
        Object TWENTY151_tree=null;
        Object DASH152_tree=null;
        Object FIVE153_tree=null;
        Object TWENTY154_tree=null;
        Object DASH155_tree=null;
        Object SIX156_tree=null;
        Object TWENTY157_tree=null;
        Object DASH158_tree=null;
        Object SEVEN159_tree=null;
        Object TWENTY160_tree=null;
        Object DASH161_tree=null;
        Object EIGHT162_tree=null;
        Object TWENTY163_tree=null;
        Object DASH164_tree=null;
        Object NINE165_tree=null;
        Object THIRTY166_tree=null;
        Object THIRTY167_tree=null;
        Object DASH168_tree=null;
        Object ONE169_tree=null;
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
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:194:3: ( ONE -> INTEGER[\"1\"] | TWO -> INTEGER[\"2\"] | THREE -> INTEGER[\"3\"] | FOUR -> INTEGER[\"4\"] | FIVE -> INTEGER[\"5\"] | SIX -> INTEGER[\"6\"] | SEVEN -> INTEGER[\"7\"] | EIGHT -> INTEGER[\"8\"] | NINE -> INTEGER[\"9\"] | TEN -> INTEGER[\"10\"] | ELEVEN -> INTEGER[\"11\"] | TWELVE -> INTEGER[\"12\"] | THIRTEEN -> INTEGER[\"13\"] | FOURTEEN -> INTEGER[\"14\"] | FIFTEEN -> INTEGER[\"15\"] | SIXTEEN -> INTEGER[\"16\"] | SEVENTEEN -> INTEGER[\"17\"] | EIGHTEEN -> INTEGER[\"18\"] | NINETEEN -> INTEGER[\"19\"] | TWENTY -> INTEGER[\"20\"] | TWENTY ( DASH )? ONE -> INTEGER[\"21\"] | TWENTY ( DASH )? TWO -> INTEGER[\"22\"] | TWENTY ( DASH )? THREE -> INTEGER[\"23\"] | TWENTY ( DASH )? FOUR -> INTEGER[\"24\"] | TWENTY ( DASH )? FIVE -> INTEGER[\"25\"] | TWENTY ( DASH )? SIX -> INTEGER[\"26\"] | TWENTY ( DASH )? SEVEN -> INTEGER[\"27\"] | TWENTY ( DASH )? EIGHT -> INTEGER[\"28\"] | TWENTY ( DASH )? NINE -> INTEGER[\"29\"] | THIRTY -> INTEGER[\"30\"] | THIRTY ( DASH )? ONE -> INTEGER[\"31\"] )
            int alt52=31;
            alt52 = dfa52.predict(input);
            switch (alt52) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:194:5: ONE
                    {
                    ONE119=(Token)match(input,ONE,FOLLOW_ONE_in_spelled_number_1_to_311735); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ONE.add(ONE119);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 194:16: -> INTEGER[\"1\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, "1"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:195:5: TWO
                    {
                    TWO120=(Token)match(input,TWO,FOLLOW_TWO_in_spelled_number_1_to_311753); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWO.add(TWO120);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 195:16: -> INTEGER[\"2\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, "2"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:196:5: THREE
                    {
                    THREE121=(Token)match(input,THREE,FOLLOW_THREE_in_spelled_number_1_to_311771); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THREE.add(THREE121);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 196:16: -> INTEGER[\"3\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, "3"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:197:5: FOUR
                    {
                    FOUR122=(Token)match(input,FOUR,FOLLOW_FOUR_in_spelled_number_1_to_311787); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FOUR.add(FOUR122);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 197:16: -> INTEGER[\"4\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, "4"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:198:5: FIVE
                    {
                    FIVE123=(Token)match(input,FIVE,FOLLOW_FIVE_in_spelled_number_1_to_311804); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FIVE.add(FIVE123);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 198:16: -> INTEGER[\"5\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, "5"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 6 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:199:5: SIX
                    {
                    SIX124=(Token)match(input,SIX,FOLLOW_SIX_in_spelled_number_1_to_311821); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SIX.add(SIX124);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 199:16: -> INTEGER[\"6\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, "6"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 7 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:200:5: SEVEN
                    {
                    SEVEN125=(Token)match(input,SEVEN,FOLLOW_SEVEN_in_spelled_number_1_to_311839); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEVEN.add(SEVEN125);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 200:16: -> INTEGER[\"7\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, "7"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 8 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:201:5: EIGHT
                    {
                    EIGHT126=(Token)match(input,EIGHT,FOLLOW_EIGHT_in_spelled_number_1_to_311855); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EIGHT.add(EIGHT126);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 201:16: -> INTEGER[\"8\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, "8"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 9 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:202:5: NINE
                    {
                    NINE127=(Token)match(input,NINE,FOLLOW_NINE_in_spelled_number_1_to_311871); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NINE.add(NINE127);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 202:16: -> INTEGER[\"9\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, "9"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 10 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:203:5: TEN
                    {
                    TEN128=(Token)match(input,TEN,FOLLOW_TEN_in_spelled_number_1_to_311888); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TEN.add(TEN128);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 203:16: -> INTEGER[\"10\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, "10"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 11 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:204:5: ELEVEN
                    {
                    ELEVEN129=(Token)match(input,ELEVEN,FOLLOW_ELEVEN_in_spelled_number_1_to_311906); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ELEVEN.add(ELEVEN129);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 204:16: -> INTEGER[\"11\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, "11"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 12 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:205:5: TWELVE
                    {
                    TWELVE130=(Token)match(input,TWELVE,FOLLOW_TWELVE_in_spelled_number_1_to_311921); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWELVE.add(TWELVE130);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 205:16: -> INTEGER[\"12\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, "12"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 13 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:206:5: THIRTEEN
                    {
                    THIRTEEN131=(Token)match(input,THIRTEEN,FOLLOW_THIRTEEN_in_spelled_number_1_to_311936); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THIRTEEN.add(THIRTEEN131);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 206:16: -> INTEGER[\"13\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, "13"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 14 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:207:5: FOURTEEN
                    {
                    FOURTEEN132=(Token)match(input,FOURTEEN,FOLLOW_FOURTEEN_in_spelled_number_1_to_311949); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FOURTEEN.add(FOURTEEN132);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 207:16: -> INTEGER[\"14\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, "14"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 15 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:208:5: FIFTEEN
                    {
                    FIFTEEN133=(Token)match(input,FIFTEEN,FOLLOW_FIFTEEN_in_spelled_number_1_to_311962); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FIFTEEN.add(FIFTEEN133);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 208:16: -> INTEGER[\"15\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, "15"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 16 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:209:5: SIXTEEN
                    {
                    SIXTEEN134=(Token)match(input,SIXTEEN,FOLLOW_SIXTEEN_in_spelled_number_1_to_311976); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SIXTEEN.add(SIXTEEN134);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 209:16: -> INTEGER[\"16\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, "16"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 17 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:210:5: SEVENTEEN
                    {
                    SEVENTEEN135=(Token)match(input,SEVENTEEN,FOLLOW_SEVENTEEN_in_spelled_number_1_to_311990); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEVENTEEN.add(SEVENTEEN135);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 210:16: -> INTEGER[\"17\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, "17"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 18 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:211:5: EIGHTEEN
                    {
                    EIGHTEEN136=(Token)match(input,EIGHTEEN,FOLLOW_EIGHTEEN_in_spelled_number_1_to_312002); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EIGHTEEN.add(EIGHTEEN136);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 211:16: -> INTEGER[\"18\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, "18"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 19 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:212:5: NINETEEN
                    {
                    NINETEEN137=(Token)match(input,NINETEEN,FOLLOW_NINETEEN_in_spelled_number_1_to_312015); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NINETEEN.add(NINETEEN137);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 212:16: -> INTEGER[\"19\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, "19"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 20 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:213:5: TWENTY
                    {
                    TWENTY138=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_number_1_to_312028); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY138);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 213:16: -> INTEGER[\"20\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, "20"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 21 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:214:5: TWENTY ( DASH )? ONE
                    {
                    TWENTY139=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_number_1_to_312043); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY139);

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:214:12: ( DASH )?
                    int alt42=2;
                    int LA42_0 = input.LA(1);

                    if ( (LA42_0==DASH) ) {
                        alt42=1;
                    }
                    switch (alt42) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:214:12: DASH
                            {
                            DASH140=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_number_1_to_312045); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_DASH.add(DASH140);


                            }
                            break;

                    }

                    ONE141=(Token)match(input,ONE,FOLLOW_ONE_in_spelled_number_1_to_312048); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ONE.add(ONE141);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 214:24: -> INTEGER[\"21\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, "21"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 22 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:215:5: TWENTY ( DASH )? TWO
                    {
                    TWENTY142=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_number_1_to_312061); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY142);

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:215:12: ( DASH )?
                    int alt43=2;
                    int LA43_0 = input.LA(1);

                    if ( (LA43_0==DASH) ) {
                        alt43=1;
                    }
                    switch (alt43) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:215:12: DASH
                            {
                            DASH143=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_number_1_to_312063); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_DASH.add(DASH143);


                            }
                            break;

                    }

                    TWO144=(Token)match(input,TWO,FOLLOW_TWO_in_spelled_number_1_to_312066); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWO.add(TWO144);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 215:24: -> INTEGER[\"22\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, "22"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 23 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:216:5: TWENTY ( DASH )? THREE
                    {
                    TWENTY145=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_number_1_to_312079); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY145);

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:216:12: ( DASH )?
                    int alt44=2;
                    int LA44_0 = input.LA(1);

                    if ( (LA44_0==DASH) ) {
                        alt44=1;
                    }
                    switch (alt44) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:216:12: DASH
                            {
                            DASH146=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_number_1_to_312081); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_DASH.add(DASH146);


                            }
                            break;

                    }

                    THREE147=(Token)match(input,THREE,FOLLOW_THREE_in_spelled_number_1_to_312084); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THREE.add(THREE147);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 216:24: -> INTEGER[\"23\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, "23"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 24 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:217:5: TWENTY ( DASH )? FOUR
                    {
                    TWENTY148=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_number_1_to_312095); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY148);

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:217:12: ( DASH )?
                    int alt45=2;
                    int LA45_0 = input.LA(1);

                    if ( (LA45_0==DASH) ) {
                        alt45=1;
                    }
                    switch (alt45) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:217:12: DASH
                            {
                            DASH149=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_number_1_to_312097); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_DASH.add(DASH149);


                            }
                            break;

                    }

                    FOUR150=(Token)match(input,FOUR,FOLLOW_FOUR_in_spelled_number_1_to_312100); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FOUR.add(FOUR150);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 217:24: -> INTEGER[\"24\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, "24"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 25 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:218:5: TWENTY ( DASH )? FIVE
                    {
                    TWENTY151=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_number_1_to_312112); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY151);

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:218:12: ( DASH )?
                    int alt46=2;
                    int LA46_0 = input.LA(1);

                    if ( (LA46_0==DASH) ) {
                        alt46=1;
                    }
                    switch (alt46) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:218:12: DASH
                            {
                            DASH152=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_number_1_to_312114); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_DASH.add(DASH152);


                            }
                            break;

                    }

                    FIVE153=(Token)match(input,FIVE,FOLLOW_FIVE_in_spelled_number_1_to_312117); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FIVE.add(FIVE153);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 218:24: -> INTEGER[\"25\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, "25"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 26 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:219:5: TWENTY ( DASH )? SIX
                    {
                    TWENTY154=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_number_1_to_312129); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY154);

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:219:12: ( DASH )?
                    int alt47=2;
                    int LA47_0 = input.LA(1);

                    if ( (LA47_0==DASH) ) {
                        alt47=1;
                    }
                    switch (alt47) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:219:12: DASH
                            {
                            DASH155=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_number_1_to_312131); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_DASH.add(DASH155);


                            }
                            break;

                    }

                    SIX156=(Token)match(input,SIX,FOLLOW_SIX_in_spelled_number_1_to_312134); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SIX.add(SIX156);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 219:24: -> INTEGER[\"26\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, "26"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 27 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:220:5: TWENTY ( DASH )? SEVEN
                    {
                    TWENTY157=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_number_1_to_312147); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY157);

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:220:12: ( DASH )?
                    int alt48=2;
                    int LA48_0 = input.LA(1);

                    if ( (LA48_0==DASH) ) {
                        alt48=1;
                    }
                    switch (alt48) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:220:12: DASH
                            {
                            DASH158=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_number_1_to_312149); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_DASH.add(DASH158);


                            }
                            break;

                    }

                    SEVEN159=(Token)match(input,SEVEN,FOLLOW_SEVEN_in_spelled_number_1_to_312152); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEVEN.add(SEVEN159);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 220:24: -> INTEGER[\"27\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, "27"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 28 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:221:5: TWENTY ( DASH )? EIGHT
                    {
                    TWENTY160=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_number_1_to_312163); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY160);

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:221:12: ( DASH )?
                    int alt49=2;
                    int LA49_0 = input.LA(1);

                    if ( (LA49_0==DASH) ) {
                        alt49=1;
                    }
                    switch (alt49) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:221:12: DASH
                            {
                            DASH161=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_number_1_to_312165); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_DASH.add(DASH161);


                            }
                            break;

                    }

                    EIGHT162=(Token)match(input,EIGHT,FOLLOW_EIGHT_in_spelled_number_1_to_312168); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EIGHT.add(EIGHT162);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 221:24: -> INTEGER[\"28\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, "28"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 29 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:222:5: TWENTY ( DASH )? NINE
                    {
                    TWENTY163=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_number_1_to_312179); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY163);

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:222:12: ( DASH )?
                    int alt50=2;
                    int LA50_0 = input.LA(1);

                    if ( (LA50_0==DASH) ) {
                        alt50=1;
                    }
                    switch (alt50) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:222:12: DASH
                            {
                            DASH164=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_number_1_to_312181); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_DASH.add(DASH164);


                            }
                            break;

                    }

                    NINE165=(Token)match(input,NINE,FOLLOW_NINE_in_spelled_number_1_to_312184); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NINE.add(NINE165);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 222:24: -> INTEGER[\"29\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, "29"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 30 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:223:5: THIRTY
                    {
                    THIRTY166=(Token)match(input,THIRTY,FOLLOW_THIRTY_in_spelled_number_1_to_312196); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THIRTY.add(THIRTY166);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 223:24: -> INTEGER[\"30\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, "30"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 31 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:224:5: THIRTY ( DASH )? ONE
                    {
                    THIRTY167=(Token)match(input,THIRTY,FOLLOW_THIRTY_in_spelled_number_1_to_312219); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THIRTY.add(THIRTY167);

                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:224:12: ( DASH )?
                    int alt51=2;
                    int LA51_0 = input.LA(1);

                    if ( (LA51_0==DASH) ) {
                        alt51=1;
                    }
                    switch (alt51) {
                        case 1 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:224:12: DASH
                            {
                            DASH168=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_number_1_to_312221); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_DASH.add(DASH168);


                            }
                            break;

                    }

                    ONE169=(Token)match(input,ONE,FOLLOW_ONE_in_spelled_number_1_to_312224); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ONE.add(ONE169);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 224:24: -> INTEGER[\"31\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, "31"));

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
    // $ANTLR end "spelled_number_1_to_31"

    public static class spelled_or_numeric_1_to_31_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "spelled_or_numeric_1_to_31"
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:227:1: spelled_or_numeric_1_to_31 : ( spelled_number_1_to_31 | integer_1_to_31 );
    public final DateParser.spelled_or_numeric_1_to_31_return spelled_or_numeric_1_to_31() throws RecognitionException {
        DateParser.spelled_or_numeric_1_to_31_return retval = new DateParser.spelled_or_numeric_1_to_31_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        DateParser.spelled_number_1_to_31_return spelled_number_1_to_31170 = null;

        DateParser.integer_1_to_31_return integer_1_to_31171 = null;



        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:228:3: ( spelled_number_1_to_31 | integer_1_to_31 )
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( ((LA53_0>=ONE && LA53_0<=THIRTY)) ) {
                alt53=1;
            }
            else if ( (LA53_0==ONE_TO_TWELVE||(LA53_0>=THIRTEEN_TO_TWENTY_THREE && LA53_0<=TWENTY_FOUR_TO_THIRTY_ONE)) ) {
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:228:5: spelled_number_1_to_31
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_spelled_number_1_to_31_in_spelled_or_numeric_1_to_312246);
                    spelled_number_1_to_31170=spelled_number_1_to_31();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, spelled_number_1_to_31170.getTree());

                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:229:5: integer_1_to_31
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_integer_1_to_31_in_spelled_or_numeric_1_to_312252);
                    integer_1_to_31171=integer_1_to_31();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, integer_1_to_31171.getTree());

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
    // $ANTLR end "spelled_or_numeric_1_to_31"

    public static class spelled_sequence_1_to_31_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "spelled_sequence_1_to_31"
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:234:1: spelled_sequence_1_to_31 : ( FIRST -> INTEGER[\"1\"] | SECOND -> INTEGER[\"2\"] | THIRD -> INTEGER[\"3\"] | FOURTH -> INTEGER[\"4\"] | FIFTH -> INTEGER[\"5\"] | SIXTH -> INTEGER[\"6\"] | SEVENTH -> INTEGER[\"7\"] | EIGHTH -> INTEGER[\"8\"] | NINTH -> INTEGER[\"9\"] | TENTH -> INTEGER[\"10\"] | ELEVENTH -> INTEGER[\"11\"] | TWELFTH -> INTEGER[\"12\"] | THIRTEENTH -> INTEGER[\"13\"] | FOURTEENTH -> INTEGER[\"14\"] | FIFTEENTH -> INTEGER[\"15\"] | SIXTEENTH -> INTEGER[\"16\"] | SEVENTEENTH -> INTEGER[\"17\"] | EIGHTEENTH -> INTEGER[\"18\"] | NINETEENTH -> INTEGER[\"19\"] | TWENTIETH -> INTEGER[\"20\"] | ( TWENTY_FIRST | ( TWENTY ( DASH )? FIRST ) ) -> INTEGER[\"21\"] | ( TWENTY_SECOND | ( TWENTY ( DASH )? SECOND ) ) -> INTEGER[\"22\"] | ( TWENTY_THIRD | ( TWENTY ( DASH )? THIRD ) ) -> INTEGER[\"23\"] | ( TWENTY_FOURTH | ( TWENTY ( DASH )? FOURTH ) ) -> INTEGER[\"24\"] | ( TWENTY_FIFTH | ( TWENTY ( DASH )? FIFTH ) ) -> INTEGER[\"25\"] | ( TWENTY_SIXTH | ( TWENTY ( DASH )? SIXTH ) ) -> INTEGER[\"26\"] | ( TWENTY_SEVENTH | ( TWENTY ( DASH )? SEVENTH ) ) -> INTEGER[\"27\"] | ( TWENTY_EIGHTH | ( TWENTY ( DASH )? EIGHTH ) ) -> INTEGER[\"28\"] | ( TWENTY_NINTH | ( TWENTY ( DASH )? NINTH ) ) -> INTEGER[\"29\"] | THIRTIETH -> INTEGER[\"30\"] | ( THIRTY_FIRST | ( THIRTY ( DASH )? FIRST ) ) -> INTEGER[\"31\"] );
    public final DateParser.spelled_sequence_1_to_31_return spelled_sequence_1_to_31() throws RecognitionException {
        DateParser.spelled_sequence_1_to_31_return retval = new DateParser.spelled_sequence_1_to_31_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token FIRST172=null;
        Token SECOND173=null;
        Token THIRD174=null;
        Token FOURTH175=null;
        Token FIFTH176=null;
        Token SIXTH177=null;
        Token SEVENTH178=null;
        Token EIGHTH179=null;
        Token NINTH180=null;
        Token TENTH181=null;
        Token ELEVENTH182=null;
        Token TWELFTH183=null;
        Token THIRTEENTH184=null;
        Token FOURTEENTH185=null;
        Token FIFTEENTH186=null;
        Token SIXTEENTH187=null;
        Token SEVENTEENTH188=null;
        Token EIGHTEENTH189=null;
        Token NINETEENTH190=null;
        Token TWENTIETH191=null;
        Token TWENTY_FIRST192=null;
        Token TWENTY193=null;
        Token DASH194=null;
        Token FIRST195=null;
        Token TWENTY_SECOND196=null;
        Token TWENTY197=null;
        Token DASH198=null;
        Token SECOND199=null;
        Token TWENTY_THIRD200=null;
        Token TWENTY201=null;
        Token DASH202=null;
        Token THIRD203=null;
        Token TWENTY_FOURTH204=null;
        Token TWENTY205=null;
        Token DASH206=null;
        Token FOURTH207=null;
        Token TWENTY_FIFTH208=null;
        Token TWENTY209=null;
        Token DASH210=null;
        Token FIFTH211=null;
        Token TWENTY_SIXTH212=null;
        Token TWENTY213=null;
        Token DASH214=null;
        Token SIXTH215=null;
        Token TWENTY_SEVENTH216=null;
        Token TWENTY217=null;
        Token DASH218=null;
        Token SEVENTH219=null;
        Token TWENTY_EIGHTH220=null;
        Token TWENTY221=null;
        Token DASH222=null;
        Token EIGHTH223=null;
        Token TWENTY_NINTH224=null;
        Token TWENTY225=null;
        Token DASH226=null;
        Token NINTH227=null;
        Token THIRTIETH228=null;
        Token THIRTY_FIRST229=null;
        Token THIRTY230=null;
        Token DASH231=null;
        Token FIRST232=null;

        Object FIRST172_tree=null;
        Object SECOND173_tree=null;
        Object THIRD174_tree=null;
        Object FOURTH175_tree=null;
        Object FIFTH176_tree=null;
        Object SIXTH177_tree=null;
        Object SEVENTH178_tree=null;
        Object EIGHTH179_tree=null;
        Object NINTH180_tree=null;
        Object TENTH181_tree=null;
        Object ELEVENTH182_tree=null;
        Object TWELFTH183_tree=null;
        Object THIRTEENTH184_tree=null;
        Object FOURTEENTH185_tree=null;
        Object FIFTEENTH186_tree=null;
        Object SIXTEENTH187_tree=null;
        Object SEVENTEENTH188_tree=null;
        Object EIGHTEENTH189_tree=null;
        Object NINETEENTH190_tree=null;
        Object TWENTIETH191_tree=null;
        Object TWENTY_FIRST192_tree=null;
        Object TWENTY193_tree=null;
        Object DASH194_tree=null;
        Object FIRST195_tree=null;
        Object TWENTY_SECOND196_tree=null;
        Object TWENTY197_tree=null;
        Object DASH198_tree=null;
        Object SECOND199_tree=null;
        Object TWENTY_THIRD200_tree=null;
        Object TWENTY201_tree=null;
        Object DASH202_tree=null;
        Object THIRD203_tree=null;
        Object TWENTY_FOURTH204_tree=null;
        Object TWENTY205_tree=null;
        Object DASH206_tree=null;
        Object FOURTH207_tree=null;
        Object TWENTY_FIFTH208_tree=null;
        Object TWENTY209_tree=null;
        Object DASH210_tree=null;
        Object FIFTH211_tree=null;
        Object TWENTY_SIXTH212_tree=null;
        Object TWENTY213_tree=null;
        Object DASH214_tree=null;
        Object SIXTH215_tree=null;
        Object TWENTY_SEVENTH216_tree=null;
        Object TWENTY217_tree=null;
        Object DASH218_tree=null;
        Object SEVENTH219_tree=null;
        Object TWENTY_EIGHTH220_tree=null;
        Object TWENTY221_tree=null;
        Object DASH222_tree=null;
        Object EIGHTH223_tree=null;
        Object TWENTY_NINTH224_tree=null;
        Object TWENTY225_tree=null;
        Object DASH226_tree=null;
        Object NINTH227_tree=null;
        Object THIRTIETH228_tree=null;
        Object THIRTY_FIRST229_tree=null;
        Object THIRTY230_tree=null;
        Object DASH231_tree=null;
        Object FIRST232_tree=null;
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
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:235:3: ( FIRST -> INTEGER[\"1\"] | SECOND -> INTEGER[\"2\"] | THIRD -> INTEGER[\"3\"] | FOURTH -> INTEGER[\"4\"] | FIFTH -> INTEGER[\"5\"] | SIXTH -> INTEGER[\"6\"] | SEVENTH -> INTEGER[\"7\"] | EIGHTH -> INTEGER[\"8\"] | NINTH -> INTEGER[\"9\"] | TENTH -> INTEGER[\"10\"] | ELEVENTH -> INTEGER[\"11\"] | TWELFTH -> INTEGER[\"12\"] | THIRTEENTH -> INTEGER[\"13\"] | FOURTEENTH -> INTEGER[\"14\"] | FIFTEENTH -> INTEGER[\"15\"] | SIXTEENTH -> INTEGER[\"16\"] | SEVENTEENTH -> INTEGER[\"17\"] | EIGHTEENTH -> INTEGER[\"18\"] | NINETEENTH -> INTEGER[\"19\"] | TWENTIETH -> INTEGER[\"20\"] | ( TWENTY_FIRST | ( TWENTY ( DASH )? FIRST ) ) -> INTEGER[\"21\"] | ( TWENTY_SECOND | ( TWENTY ( DASH )? SECOND ) ) -> INTEGER[\"22\"] | ( TWENTY_THIRD | ( TWENTY ( DASH )? THIRD ) ) -> INTEGER[\"23\"] | ( TWENTY_FOURTH | ( TWENTY ( DASH )? FOURTH ) ) -> INTEGER[\"24\"] | ( TWENTY_FIFTH | ( TWENTY ( DASH )? FIFTH ) ) -> INTEGER[\"25\"] | ( TWENTY_SIXTH | ( TWENTY ( DASH )? SIXTH ) ) -> INTEGER[\"26\"] | ( TWENTY_SEVENTH | ( TWENTY ( DASH )? SEVENTH ) ) -> INTEGER[\"27\"] | ( TWENTY_EIGHTH | ( TWENTY ( DASH )? EIGHTH ) ) -> INTEGER[\"28\"] | ( TWENTY_NINTH | ( TWENTY ( DASH )? NINTH ) ) -> INTEGER[\"29\"] | THIRTIETH -> INTEGER[\"30\"] | ( THIRTY_FIRST | ( THIRTY ( DASH )? FIRST ) ) -> INTEGER[\"31\"] )
            int alt74=31;
            alt74 = dfa74.predict(input);
            switch (alt74) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:235:5: FIRST
                    {
                    FIRST172=(Token)match(input,FIRST,FOLLOW_FIRST_in_spelled_sequence_1_to_312269); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FIRST.add(FIRST172);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 235:17: -> INTEGER[\"1\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, "1"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:236:5: SECOND
                    {
                    SECOND173=(Token)match(input,SECOND,FOLLOW_SECOND_in_spelled_sequence_1_to_312286); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SECOND.add(SECOND173);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 236:17: -> INTEGER[\"2\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, "2"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:237:5: THIRD
                    {
                    THIRD174=(Token)match(input,THIRD,FOLLOW_THIRD_in_spelled_sequence_1_to_312302); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THIRD.add(THIRD174);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 237:17: -> INTEGER[\"3\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, "3"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:238:5: FOURTH
                    {
                    FOURTH175=(Token)match(input,FOURTH,FOLLOW_FOURTH_in_spelled_sequence_1_to_312319); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FOURTH.add(FOURTH175);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 238:17: -> INTEGER[\"4\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, "4"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:239:5: FIFTH
                    {
                    FIFTH176=(Token)match(input,FIFTH,FOLLOW_FIFTH_in_spelled_sequence_1_to_312335); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FIFTH.add(FIFTH176);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 239:17: -> INTEGER[\"5\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, "5"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 6 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:240:5: SIXTH
                    {
                    SIXTH177=(Token)match(input,SIXTH,FOLLOW_SIXTH_in_spelled_sequence_1_to_312352); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SIXTH.add(SIXTH177);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 240:17: -> INTEGER[\"6\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, "6"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 7 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:241:5: SEVENTH
                    {
                    SEVENTH178=(Token)match(input,SEVENTH,FOLLOW_SEVENTH_in_spelled_sequence_1_to_312369); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEVENTH.add(SEVENTH178);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 241:17: -> INTEGER[\"7\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, "7"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 8 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:242:5: EIGHTH
                    {
                    EIGHTH179=(Token)match(input,EIGHTH,FOLLOW_EIGHTH_in_spelled_sequence_1_to_312384); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EIGHTH.add(EIGHTH179);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 242:17: -> INTEGER[\"8\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, "8"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 9 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:243:5: NINTH
                    {
                    NINTH180=(Token)match(input,NINTH,FOLLOW_NINTH_in_spelled_sequence_1_to_312400); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NINTH.add(NINTH180);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 243:17: -> INTEGER[\"9\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, "9"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 10 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:244:5: TENTH
                    {
                    TENTH181=(Token)match(input,TENTH,FOLLOW_TENTH_in_spelled_sequence_1_to_312417); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TENTH.add(TENTH181);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 244:17: -> INTEGER[\"10\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, "10"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 11 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:245:5: ELEVENTH
                    {
                    ELEVENTH182=(Token)match(input,ELEVENTH,FOLLOW_ELEVENTH_in_spelled_sequence_1_to_312434); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ELEVENTH.add(ELEVENTH182);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 245:17: -> INTEGER[\"11\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, "11"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 12 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:246:5: TWELFTH
                    {
                    TWELFTH183=(Token)match(input,TWELFTH,FOLLOW_TWELFTH_in_spelled_sequence_1_to_312448); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWELFTH.add(TWELFTH183);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 246:17: -> INTEGER[\"12\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, "12"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 13 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:247:5: THIRTEENTH
                    {
                    THIRTEENTH184=(Token)match(input,THIRTEENTH,FOLLOW_THIRTEENTH_in_spelled_sequence_1_to_312463); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THIRTEENTH.add(THIRTEENTH184);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 247:17: -> INTEGER[\"13\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, "13"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 14 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:248:5: FOURTEENTH
                    {
                    FOURTEENTH185=(Token)match(input,FOURTEENTH,FOLLOW_FOURTEENTH_in_spelled_sequence_1_to_312475); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FOURTEENTH.add(FOURTEENTH185);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 248:17: -> INTEGER[\"14\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, "14"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 15 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:249:5: FIFTEENTH
                    {
                    FIFTEENTH186=(Token)match(input,FIFTEENTH,FOLLOW_FIFTEENTH_in_spelled_sequence_1_to_312487); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FIFTEENTH.add(FIFTEENTH186);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 249:17: -> INTEGER[\"15\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, "15"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 16 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:250:5: SIXTEENTH
                    {
                    SIXTEENTH187=(Token)match(input,SIXTEENTH,FOLLOW_SIXTEENTH_in_spelled_sequence_1_to_312500); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SIXTEENTH.add(SIXTEENTH187);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 250:17: -> INTEGER[\"16\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, "16"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 17 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:251:5: SEVENTEENTH
                    {
                    SEVENTEENTH188=(Token)match(input,SEVENTEENTH,FOLLOW_SEVENTEENTH_in_spelled_sequence_1_to_312513); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEVENTEENTH.add(SEVENTEENTH188);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 251:17: -> INTEGER[\"17\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, "17"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 18 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:252:5: EIGHTEENTH
                    {
                    EIGHTEENTH189=(Token)match(input,EIGHTEENTH,FOLLOW_EIGHTEENTH_in_spelled_sequence_1_to_312524); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EIGHTEENTH.add(EIGHTEENTH189);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 252:17: -> INTEGER[\"18\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, "18"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 19 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:253:5: NINETEENTH
                    {
                    NINETEENTH190=(Token)match(input,NINETEENTH,FOLLOW_NINETEENTH_in_spelled_sequence_1_to_312536); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NINETEENTH.add(NINETEENTH190);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 253:17: -> INTEGER[\"19\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, "19"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 20 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:254:5: TWENTIETH
                    {
                    TWENTIETH191=(Token)match(input,TWENTIETH,FOLLOW_TWENTIETH_in_spelled_sequence_1_to_312548); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWENTIETH.add(TWENTIETH191);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 254:17: -> INTEGER[\"20\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, "20"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 21 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:255:5: ( TWENTY_FIRST | ( TWENTY ( DASH )? FIRST ) )
                    {
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:255:5: ( TWENTY_FIRST | ( TWENTY ( DASH )? FIRST ) )
                    int alt55=2;
                    int LA55_0 = input.LA(1);

                    if ( (LA55_0==TWENTY_FIRST) ) {
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
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:255:6: TWENTY_FIRST
                            {
                            TWENTY_FIRST192=(Token)match(input,TWENTY_FIRST,FOLLOW_TWENTY_FIRST_in_spelled_sequence_1_to_312562); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY_FIRST.add(TWENTY_FIRST192);


                            }
                            break;
                        case 2 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:255:23: ( TWENTY ( DASH )? FIRST )
                            {
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:255:23: ( TWENTY ( DASH )? FIRST )
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:255:24: TWENTY ( DASH )? FIRST
                            {
                            TWENTY193=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_sequence_1_to_312569); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY193);

                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:255:31: ( DASH )?
                            int alt54=2;
                            int LA54_0 = input.LA(1);

                            if ( (LA54_0==DASH) ) {
                                alt54=1;
                            }
                            switch (alt54) {
                                case 1 :
                                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:255:31: DASH
                                    {
                                    DASH194=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_sequence_1_to_312571); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_DASH.add(DASH194);


                                    }
                                    break;

                            }

                            FIRST195=(Token)match(input,FIRST,FOLLOW_FIRST_in_spelled_sequence_1_to_312574); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_FIRST.add(FIRST195);


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
                    // 255:47: -> INTEGER[\"21\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, "21"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 22 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:256:5: ( TWENTY_SECOND | ( TWENTY ( DASH )? SECOND ) )
                    {
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:256:5: ( TWENTY_SECOND | ( TWENTY ( DASH )? SECOND ) )
                    int alt57=2;
                    int LA57_0 = input.LA(1);

                    if ( (LA57_0==TWENTY_SECOND) ) {
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
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:256:6: TWENTY_SECOND
                            {
                            TWENTY_SECOND196=(Token)match(input,TWENTY_SECOND,FOLLOW_TWENTY_SECOND_in_spelled_sequence_1_to_312590); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY_SECOND.add(TWENTY_SECOND196);


                            }
                            break;
                        case 2 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:256:23: ( TWENTY ( DASH )? SECOND )
                            {
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:256:23: ( TWENTY ( DASH )? SECOND )
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:256:24: TWENTY ( DASH )? SECOND
                            {
                            TWENTY197=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_sequence_1_to_312596); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY197);

                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:256:31: ( DASH )?
                            int alt56=2;
                            int LA56_0 = input.LA(1);

                            if ( (LA56_0==DASH) ) {
                                alt56=1;
                            }
                            switch (alt56) {
                                case 1 :
                                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:256:31: DASH
                                    {
                                    DASH198=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_sequence_1_to_312598); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_DASH.add(DASH198);


                                    }
                                    break;

                            }

                            SECOND199=(Token)match(input,SECOND,FOLLOW_SECOND_in_spelled_sequence_1_to_312601); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_SECOND.add(SECOND199);


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
                    // 256:47: -> INTEGER[\"22\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, "22"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 23 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:257:5: ( TWENTY_THIRD | ( TWENTY ( DASH )? THIRD ) )
                    {
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:257:5: ( TWENTY_THIRD | ( TWENTY ( DASH )? THIRD ) )
                    int alt59=2;
                    int LA59_0 = input.LA(1);

                    if ( (LA59_0==TWENTY_THIRD) ) {
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
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:257:6: TWENTY_THIRD
                            {
                            TWENTY_THIRD200=(Token)match(input,TWENTY_THIRD,FOLLOW_TWENTY_THIRD_in_spelled_sequence_1_to_312616); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY_THIRD.add(TWENTY_THIRD200);


                            }
                            break;
                        case 2 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:257:23: ( TWENTY ( DASH )? THIRD )
                            {
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:257:23: ( TWENTY ( DASH )? THIRD )
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:257:24: TWENTY ( DASH )? THIRD
                            {
                            TWENTY201=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_sequence_1_to_312623); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY201);

                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:257:31: ( DASH )?
                            int alt58=2;
                            int LA58_0 = input.LA(1);

                            if ( (LA58_0==DASH) ) {
                                alt58=1;
                            }
                            switch (alt58) {
                                case 1 :
                                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:257:31: DASH
                                    {
                                    DASH202=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_sequence_1_to_312625); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_DASH.add(DASH202);


                                    }
                                    break;

                            }

                            THIRD203=(Token)match(input,THIRD,FOLLOW_THIRD_in_spelled_sequence_1_to_312628); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_THIRD.add(THIRD203);


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
                    // 257:47: -> INTEGER[\"23\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, "23"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 24 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:258:5: ( TWENTY_FOURTH | ( TWENTY ( DASH )? FOURTH ) )
                    {
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:258:5: ( TWENTY_FOURTH | ( TWENTY ( DASH )? FOURTH ) )
                    int alt61=2;
                    int LA61_0 = input.LA(1);

                    if ( (LA61_0==TWENTY_FOURTH) ) {
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
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:258:6: TWENTY_FOURTH
                            {
                            TWENTY_FOURTH204=(Token)match(input,TWENTY_FOURTH,FOLLOW_TWENTY_FOURTH_in_spelled_sequence_1_to_312644); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY_FOURTH.add(TWENTY_FOURTH204);


                            }
                            break;
                        case 2 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:258:23: ( TWENTY ( DASH )? FOURTH )
                            {
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:258:23: ( TWENTY ( DASH )? FOURTH )
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:258:24: TWENTY ( DASH )? FOURTH
                            {
                            TWENTY205=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_sequence_1_to_312650); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY205);

                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:258:31: ( DASH )?
                            int alt60=2;
                            int LA60_0 = input.LA(1);

                            if ( (LA60_0==DASH) ) {
                                alt60=1;
                            }
                            switch (alt60) {
                                case 1 :
                                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:258:31: DASH
                                    {
                                    DASH206=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_sequence_1_to_312652); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_DASH.add(DASH206);


                                    }
                                    break;

                            }

                            FOURTH207=(Token)match(input,FOURTH,FOLLOW_FOURTH_in_spelled_sequence_1_to_312655); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_FOURTH.add(FOURTH207);


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
                    // 258:47: -> INTEGER[\"24\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, "24"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 25 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:259:5: ( TWENTY_FIFTH | ( TWENTY ( DASH )? FIFTH ) )
                    {
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:259:5: ( TWENTY_FIFTH | ( TWENTY ( DASH )? FIFTH ) )
                    int alt63=2;
                    int LA63_0 = input.LA(1);

                    if ( (LA63_0==TWENTY_FIFTH) ) {
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
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:259:6: TWENTY_FIFTH
                            {
                            TWENTY_FIFTH208=(Token)match(input,TWENTY_FIFTH,FOLLOW_TWENTY_FIFTH_in_spelled_sequence_1_to_312670); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY_FIFTH.add(TWENTY_FIFTH208);


                            }
                            break;
                        case 2 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:259:23: ( TWENTY ( DASH )? FIFTH )
                            {
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:259:23: ( TWENTY ( DASH )? FIFTH )
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:259:24: TWENTY ( DASH )? FIFTH
                            {
                            TWENTY209=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_sequence_1_to_312677); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY209);

                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:259:31: ( DASH )?
                            int alt62=2;
                            int LA62_0 = input.LA(1);

                            if ( (LA62_0==DASH) ) {
                                alt62=1;
                            }
                            switch (alt62) {
                                case 1 :
                                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:259:31: DASH
                                    {
                                    DASH210=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_sequence_1_to_312679); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_DASH.add(DASH210);


                                    }
                                    break;

                            }

                            FIFTH211=(Token)match(input,FIFTH,FOLLOW_FIFTH_in_spelled_sequence_1_to_312682); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_FIFTH.add(FIFTH211);


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
                    // 259:47: -> INTEGER[\"25\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, "25"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 26 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:260:5: ( TWENTY_SIXTH | ( TWENTY ( DASH )? SIXTH ) )
                    {
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:260:5: ( TWENTY_SIXTH | ( TWENTY ( DASH )? SIXTH ) )
                    int alt65=2;
                    int LA65_0 = input.LA(1);

                    if ( (LA65_0==TWENTY_SIXTH) ) {
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
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:260:6: TWENTY_SIXTH
                            {
                            TWENTY_SIXTH212=(Token)match(input,TWENTY_SIXTH,FOLLOW_TWENTY_SIXTH_in_spelled_sequence_1_to_312698); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY_SIXTH.add(TWENTY_SIXTH212);


                            }
                            break;
                        case 2 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:260:23: ( TWENTY ( DASH )? SIXTH )
                            {
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:260:23: ( TWENTY ( DASH )? SIXTH )
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:260:24: TWENTY ( DASH )? SIXTH
                            {
                            TWENTY213=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_sequence_1_to_312705); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY213);

                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:260:31: ( DASH )?
                            int alt64=2;
                            int LA64_0 = input.LA(1);

                            if ( (LA64_0==DASH) ) {
                                alt64=1;
                            }
                            switch (alt64) {
                                case 1 :
                                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:260:31: DASH
                                    {
                                    DASH214=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_sequence_1_to_312707); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_DASH.add(DASH214);


                                    }
                                    break;

                            }

                            SIXTH215=(Token)match(input,SIXTH,FOLLOW_SIXTH_in_spelled_sequence_1_to_312710); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_SIXTH.add(SIXTH215);


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
                    // 260:47: -> INTEGER[\"26\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, "26"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 27 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:261:5: ( TWENTY_SEVENTH | ( TWENTY ( DASH )? SEVENTH ) )
                    {
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:261:5: ( TWENTY_SEVENTH | ( TWENTY ( DASH )? SEVENTH ) )
                    int alt67=2;
                    int LA67_0 = input.LA(1);

                    if ( (LA67_0==TWENTY_SEVENTH) ) {
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
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:261:6: TWENTY_SEVENTH
                            {
                            TWENTY_SEVENTH216=(Token)match(input,TWENTY_SEVENTH,FOLLOW_TWENTY_SEVENTH_in_spelled_sequence_1_to_312726); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY_SEVENTH.add(TWENTY_SEVENTH216);


                            }
                            break;
                        case 2 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:261:23: ( TWENTY ( DASH )? SEVENTH )
                            {
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:261:23: ( TWENTY ( DASH )? SEVENTH )
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:261:24: TWENTY ( DASH )? SEVENTH
                            {
                            TWENTY217=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_sequence_1_to_312731); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY217);

                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:261:31: ( DASH )?
                            int alt66=2;
                            int LA66_0 = input.LA(1);

                            if ( (LA66_0==DASH) ) {
                                alt66=1;
                            }
                            switch (alt66) {
                                case 1 :
                                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:261:31: DASH
                                    {
                                    DASH218=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_sequence_1_to_312733); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_DASH.add(DASH218);


                                    }
                                    break;

                            }

                            SEVENTH219=(Token)match(input,SEVENTH,FOLLOW_SEVENTH_in_spelled_sequence_1_to_312736); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_SEVENTH.add(SEVENTH219);


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
                    // 261:47: -> INTEGER[\"27\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, "27"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 28 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:262:5: ( TWENTY_EIGHTH | ( TWENTY ( DASH )? EIGHTH ) )
                    {
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:262:5: ( TWENTY_EIGHTH | ( TWENTY ( DASH )? EIGHTH ) )
                    int alt69=2;
                    int LA69_0 = input.LA(1);

                    if ( (LA69_0==TWENTY_EIGHTH) ) {
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
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:262:6: TWENTY_EIGHTH
                            {
                            TWENTY_EIGHTH220=(Token)match(input,TWENTY_EIGHTH,FOLLOW_TWENTY_EIGHTH_in_spelled_sequence_1_to_312750); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY_EIGHTH.add(TWENTY_EIGHTH220);


                            }
                            break;
                        case 2 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:262:23: ( TWENTY ( DASH )? EIGHTH )
                            {
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:262:23: ( TWENTY ( DASH )? EIGHTH )
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:262:24: TWENTY ( DASH )? EIGHTH
                            {
                            TWENTY221=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_sequence_1_to_312756); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY221);

                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:262:31: ( DASH )?
                            int alt68=2;
                            int LA68_0 = input.LA(1);

                            if ( (LA68_0==DASH) ) {
                                alt68=1;
                            }
                            switch (alt68) {
                                case 1 :
                                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:262:31: DASH
                                    {
                                    DASH222=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_sequence_1_to_312758); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_DASH.add(DASH222);


                                    }
                                    break;

                            }

                            EIGHTH223=(Token)match(input,EIGHTH,FOLLOW_EIGHTH_in_spelled_sequence_1_to_312761); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_EIGHTH.add(EIGHTH223);


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
                    // 262:47: -> INTEGER[\"28\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, "28"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 29 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:263:5: ( TWENTY_NINTH | ( TWENTY ( DASH )? NINTH ) )
                    {
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:263:5: ( TWENTY_NINTH | ( TWENTY ( DASH )? NINTH ) )
                    int alt71=2;
                    int LA71_0 = input.LA(1);

                    if ( (LA71_0==TWENTY_NINTH) ) {
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
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:263:6: TWENTY_NINTH
                            {
                            TWENTY_NINTH224=(Token)match(input,TWENTY_NINTH,FOLLOW_TWENTY_NINTH_in_spelled_sequence_1_to_312776); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY_NINTH.add(TWENTY_NINTH224);


                            }
                            break;
                        case 2 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:263:23: ( TWENTY ( DASH )? NINTH )
                            {
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:263:23: ( TWENTY ( DASH )? NINTH )
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:263:24: TWENTY ( DASH )? NINTH
                            {
                            TWENTY225=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_sequence_1_to_312783); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY225);

                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:263:31: ( DASH )?
                            int alt70=2;
                            int LA70_0 = input.LA(1);

                            if ( (LA70_0==DASH) ) {
                                alt70=1;
                            }
                            switch (alt70) {
                                case 1 :
                                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:263:31: DASH
                                    {
                                    DASH226=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_sequence_1_to_312785); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_DASH.add(DASH226);


                                    }
                                    break;

                            }

                            NINTH227=(Token)match(input,NINTH,FOLLOW_NINTH_in_spelled_sequence_1_to_312788); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NINTH.add(NINTH227);


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
                    // 263:47: -> INTEGER[\"29\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, "29"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 30 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:264:5: THIRTIETH
                    {
                    THIRTIETH228=(Token)match(input,THIRTIETH,FOLLOW_THIRTIETH_in_spelled_sequence_1_to_312803); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THIRTIETH.add(THIRTIETH228);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 264:47: -> INTEGER[\"30\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, "30"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 31 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:265:5: ( THIRTY_FIRST | ( THIRTY ( DASH )? FIRST ) )
                    {
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:265:5: ( THIRTY_FIRST | ( THIRTY ( DASH )? FIRST ) )
                    int alt73=2;
                    int LA73_0 = input.LA(1);

                    if ( (LA73_0==THIRTY_FIRST) ) {
                        alt73=1;
                    }
                    else if ( (LA73_0==THIRTY) ) {
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
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:265:6: THIRTY_FIRST
                            {
                            THIRTY_FIRST229=(Token)match(input,THIRTY_FIRST,FOLLOW_THIRTY_FIRST_in_spelled_sequence_1_to_312847); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_THIRTY_FIRST.add(THIRTY_FIRST229);


                            }
                            break;
                        case 2 :
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:265:23: ( THIRTY ( DASH )? FIRST )
                            {
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:265:23: ( THIRTY ( DASH )? FIRST )
                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:265:24: THIRTY ( DASH )? FIRST
                            {
                            THIRTY230=(Token)match(input,THIRTY,FOLLOW_THIRTY_in_spelled_sequence_1_to_312854); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_THIRTY.add(THIRTY230);

                            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:265:31: ( DASH )?
                            int alt72=2;
                            int LA72_0 = input.LA(1);

                            if ( (LA72_0==DASH) ) {
                                alt72=1;
                            }
                            switch (alt72) {
                                case 1 :
                                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:265:31: DASH
                                    {
                                    DASH231=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_sequence_1_to_312856); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_DASH.add(DASH231);


                                    }
                                    break;

                            }

                            FIRST232=(Token)match(input,FIRST,FOLLOW_FIRST_in_spelled_sequence_1_to_312859); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_FIRST.add(FIRST232);


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
                    // 265:47: -> INTEGER[\"31\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, "31"));

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

    public static class four_digits_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "four_digits"
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:269:1: four_digits : ( integer_0_to_99 | THREE_DIGIT -> INTEGER[$THREE_DIGIT.text] | FOUR_DIGIT -> INTEGER[$FOUR_DIGIT.text] );
    public final DateParser.four_digits_return four_digits() throws RecognitionException {
        DateParser.four_digits_return retval = new DateParser.four_digits_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token THREE_DIGIT234=null;
        Token FOUR_DIGIT235=null;
        DateParser.integer_0_to_99_return integer_0_to_99233 = null;


        Object THREE_DIGIT234_tree=null;
        Object FOUR_DIGIT235_tree=null;
        RewriteRuleTokenStream stream_FOUR_DIGIT=new RewriteRuleTokenStream(adaptor,"token FOUR_DIGIT");
        RewriteRuleTokenStream stream_THREE_DIGIT=new RewriteRuleTokenStream(adaptor,"token THREE_DIGIT");

        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:270:3: ( integer_0_to_99 | THREE_DIGIT -> INTEGER[$THREE_DIGIT.text] | FOUR_DIGIT -> INTEGER[$FOUR_DIGIT.text] )
            int alt75=3;
            switch ( input.LA(1) ) {
            case ONE_TO_TWELVE:
            case UP_TO_TWO_ZEROS:
            case THIRTEEN_TO_TWENTY_THREE:
            case TWENTY_FOUR_TO_THIRTY_ONE:
            case THIRTY_TWO_TO_FIFTY_NINE:
            case SIXTY_TO_NINETY_NINE:
                {
                alt75=1;
                }
                break;
            case THREE_DIGIT:
                {
                alt75=2;
                }
                break;
            case FOUR_DIGIT:
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:270:5: integer_0_to_99
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_integer_0_to_99_in_four_digits2884);
                    integer_0_to_99233=integer_0_to_99();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, integer_0_to_99233.getTree());

                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:271:5: THREE_DIGIT
                    {
                    THREE_DIGIT234=(Token)match(input,THREE_DIGIT,FOLLOW_THREE_DIGIT_in_four_digits2890); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THREE_DIGIT.add(THREE_DIGIT234);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 271:17: -> INTEGER[$THREE_DIGIT.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, (THREE_DIGIT234!=null?THREE_DIGIT234.getText():null)));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:272:5: FOUR_DIGIT
                    {
                    FOUR_DIGIT235=(Token)match(input,FOUR_DIGIT,FOLLOW_FOUR_DIGIT_in_four_digits2901); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FOUR_DIGIT.add(FOUR_DIGIT235);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 272:17: -> INTEGER[$FOUR_DIGIT.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, (FOUR_DIGIT235!=null?FOUR_DIGIT235.getText():null)));

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
    // $ANTLR end "four_digits"

    public static class integer_1_to_12_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "integer_1_to_12"
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:275:1: integer_1_to_12 : ONE_TO_TWELVE -> INTEGER[$integer_1_to_12.text] ;
    public final DateParser.integer_1_to_12_return integer_1_to_12() throws RecognitionException {
        DateParser.integer_1_to_12_return retval = new DateParser.integer_1_to_12_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ONE_TO_TWELVE236=null;

        Object ONE_TO_TWELVE236_tree=null;
        RewriteRuleTokenStream stream_ONE_TO_TWELVE=new RewriteRuleTokenStream(adaptor,"token ONE_TO_TWELVE");

        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:276:3: ( ONE_TO_TWELVE -> INTEGER[$integer_1_to_12.text] )
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:276:5: ONE_TO_TWELVE
            {
            ONE_TO_TWELVE236=(Token)match(input,ONE_TO_TWELVE,FOLLOW_ONE_TO_TWELVE_in_integer_1_to_122922); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ONE_TO_TWELVE.add(ONE_TO_TWELVE236);



            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 276:19: -> INTEGER[$integer_1_to_12.text]
            {
                adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, input.toString(retval.start,input.LT(-1))));

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
    // $ANTLR end "integer_1_to_12"

    public static class integer_0_to_23_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "integer_0_to_23"
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:280:1: integer_0_to_23 : ( UP_TO_TWO_ZEROS -> INTEGER[$UP_TO_TWO_ZEROS.text] | ONE_TO_TWELVE -> INTEGER[$ONE_TO_TWELVE.text] | THIRTEEN_TO_TWENTY_THREE -> INTEGER[$THIRTEEN_TO_TWENTY_THREE.text] );
    public final DateParser.integer_0_to_23_return integer_0_to_23() throws RecognitionException {
        DateParser.integer_0_to_23_return retval = new DateParser.integer_0_to_23_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token UP_TO_TWO_ZEROS237=null;
        Token ONE_TO_TWELVE238=null;
        Token THIRTEEN_TO_TWENTY_THREE239=null;

        Object UP_TO_TWO_ZEROS237_tree=null;
        Object ONE_TO_TWELVE238_tree=null;
        Object THIRTEEN_TO_TWENTY_THREE239_tree=null;
        RewriteRuleTokenStream stream_UP_TO_TWO_ZEROS=new RewriteRuleTokenStream(adaptor,"token UP_TO_TWO_ZEROS");
        RewriteRuleTokenStream stream_THIRTEEN_TO_TWENTY_THREE=new RewriteRuleTokenStream(adaptor,"token THIRTEEN_TO_TWENTY_THREE");
        RewriteRuleTokenStream stream_ONE_TO_TWELVE=new RewriteRuleTokenStream(adaptor,"token ONE_TO_TWELVE");

        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:281:3: ( UP_TO_TWO_ZEROS -> INTEGER[$UP_TO_TWO_ZEROS.text] | ONE_TO_TWELVE -> INTEGER[$ONE_TO_TWELVE.text] | THIRTEEN_TO_TWENTY_THREE -> INTEGER[$THIRTEEN_TO_TWENTY_THREE.text] )
            int alt76=3;
            switch ( input.LA(1) ) {
            case UP_TO_TWO_ZEROS:
                {
                alt76=1;
                }
                break;
            case ONE_TO_TWELVE:
                {
                alt76=2;
                }
                break;
            case THIRTEEN_TO_TWENTY_THREE:
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:281:5: UP_TO_TWO_ZEROS
                    {
                    UP_TO_TWO_ZEROS237=(Token)match(input,UP_TO_TWO_ZEROS,FOLLOW_UP_TO_TWO_ZEROS_in_integer_0_to_232943); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_UP_TO_TWO_ZEROS.add(UP_TO_TWO_ZEROS237);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 281:30: -> INTEGER[$UP_TO_TWO_ZEROS.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, (UP_TO_TWO_ZEROS237!=null?UP_TO_TWO_ZEROS237.getText():null)));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:282:5: ONE_TO_TWELVE
                    {
                    ONE_TO_TWELVE238=(Token)match(input,ONE_TO_TWELVE,FOLLOW_ONE_TO_TWELVE_in_integer_0_to_232963); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ONE_TO_TWELVE.add(ONE_TO_TWELVE238);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 282:30: -> INTEGER[$ONE_TO_TWELVE.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, (ONE_TO_TWELVE238!=null?ONE_TO_TWELVE238.getText():null)));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:283:5: THIRTEEN_TO_TWENTY_THREE
                    {
                    THIRTEEN_TO_TWENTY_THREE239=(Token)match(input,THIRTEEN_TO_TWENTY_THREE,FOLLOW_THIRTEEN_TO_TWENTY_THREE_in_integer_0_to_232985); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THIRTEEN_TO_TWENTY_THREE.add(THIRTEEN_TO_TWENTY_THREE239);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 283:30: -> INTEGER[$THIRTEEN_TO_TWENTY_THREE.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, (THIRTEEN_TO_TWENTY_THREE239!=null?THIRTEEN_TO_TWENTY_THREE239.getText():null)));

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
    // $ANTLR end "integer_0_to_23"

    public static class integer_0_to_59_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "integer_0_to_59"
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:287:1: integer_0_to_59 : ( UP_TO_TWO_ZEROS -> INTEGER[\"0\"] | ONE_TO_TWELVE -> INTEGER[$ONE_TO_TWELVE.text] | THIRTEEN_TO_TWENTY_THREE -> INTEGER[$THIRTEEN_TO_TWENTY_THREE.text] | TWENTY_FOUR_TO_THIRTY_ONE -> INTEGER[$TWENTY_FOUR_TO_THIRTY_ONE.text] | THIRTY_TWO_TO_FIFTY_NINE -> INTEGER[$THIRTY_TWO_TO_FIFTY_NINE.text] );
    public final DateParser.integer_0_to_59_return integer_0_to_59() throws RecognitionException {
        DateParser.integer_0_to_59_return retval = new DateParser.integer_0_to_59_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token UP_TO_TWO_ZEROS240=null;
        Token ONE_TO_TWELVE241=null;
        Token THIRTEEN_TO_TWENTY_THREE242=null;
        Token TWENTY_FOUR_TO_THIRTY_ONE243=null;
        Token THIRTY_TWO_TO_FIFTY_NINE244=null;

        Object UP_TO_TWO_ZEROS240_tree=null;
        Object ONE_TO_TWELVE241_tree=null;
        Object THIRTEEN_TO_TWENTY_THREE242_tree=null;
        Object TWENTY_FOUR_TO_THIRTY_ONE243_tree=null;
        Object THIRTY_TWO_TO_FIFTY_NINE244_tree=null;
        RewriteRuleTokenStream stream_UP_TO_TWO_ZEROS=new RewriteRuleTokenStream(adaptor,"token UP_TO_TWO_ZEROS");
        RewriteRuleTokenStream stream_THIRTEEN_TO_TWENTY_THREE=new RewriteRuleTokenStream(adaptor,"token THIRTEEN_TO_TWENTY_THREE");
        RewriteRuleTokenStream stream_ONE_TO_TWELVE=new RewriteRuleTokenStream(adaptor,"token ONE_TO_TWELVE");
        RewriteRuleTokenStream stream_THIRTY_TWO_TO_FIFTY_NINE=new RewriteRuleTokenStream(adaptor,"token THIRTY_TWO_TO_FIFTY_NINE");
        RewriteRuleTokenStream stream_TWENTY_FOUR_TO_THIRTY_ONE=new RewriteRuleTokenStream(adaptor,"token TWENTY_FOUR_TO_THIRTY_ONE");

        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:288:3: ( UP_TO_TWO_ZEROS -> INTEGER[\"0\"] | ONE_TO_TWELVE -> INTEGER[$ONE_TO_TWELVE.text] | THIRTEEN_TO_TWENTY_THREE -> INTEGER[$THIRTEEN_TO_TWENTY_THREE.text] | TWENTY_FOUR_TO_THIRTY_ONE -> INTEGER[$TWENTY_FOUR_TO_THIRTY_ONE.text] | THIRTY_TWO_TO_FIFTY_NINE -> INTEGER[$THIRTY_TWO_TO_FIFTY_NINE.text] )
            int alt77=5;
            switch ( input.LA(1) ) {
            case UP_TO_TWO_ZEROS:
                {
                alt77=1;
                }
                break;
            case ONE_TO_TWELVE:
                {
                alt77=2;
                }
                break;
            case THIRTEEN_TO_TWENTY_THREE:
                {
                alt77=3;
                }
                break;
            case TWENTY_FOUR_TO_THIRTY_ONE:
                {
                alt77=4;
                }
                break;
            case THIRTY_TWO_TO_FIFTY_NINE:
                {
                alt77=5;
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:288:5: UP_TO_TWO_ZEROS
                    {
                    UP_TO_TWO_ZEROS240=(Token)match(input,UP_TO_TWO_ZEROS,FOLLOW_UP_TO_TWO_ZEROS_in_integer_0_to_593006); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_UP_TO_TWO_ZEROS.add(UP_TO_TWO_ZEROS240);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 288:31: -> INTEGER[\"0\"]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, "0"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:289:5: ONE_TO_TWELVE
                    {
                    ONE_TO_TWELVE241=(Token)match(input,ONE_TO_TWELVE,FOLLOW_ONE_TO_TWELVE_in_integer_0_to_593027); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ONE_TO_TWELVE.add(ONE_TO_TWELVE241);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 289:31: -> INTEGER[$ONE_TO_TWELVE.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, (ONE_TO_TWELVE241!=null?ONE_TO_TWELVE241.getText():null)));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:290:5: THIRTEEN_TO_TWENTY_THREE
                    {
                    THIRTEEN_TO_TWENTY_THREE242=(Token)match(input,THIRTEEN_TO_TWENTY_THREE,FOLLOW_THIRTEEN_TO_TWENTY_THREE_in_integer_0_to_593050); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THIRTEEN_TO_TWENTY_THREE.add(THIRTEEN_TO_TWENTY_THREE242);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 290:31: -> INTEGER[$THIRTEEN_TO_TWENTY_THREE.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, (THIRTEEN_TO_TWENTY_THREE242!=null?THIRTEEN_TO_TWENTY_THREE242.getText():null)));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:291:5: TWENTY_FOUR_TO_THIRTY_ONE
                    {
                    TWENTY_FOUR_TO_THIRTY_ONE243=(Token)match(input,TWENTY_FOUR_TO_THIRTY_ONE,FOLLOW_TWENTY_FOUR_TO_THIRTY_ONE_in_integer_0_to_593062); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWENTY_FOUR_TO_THIRTY_ONE.add(TWENTY_FOUR_TO_THIRTY_ONE243);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 291:31: -> INTEGER[$TWENTY_FOUR_TO_THIRTY_ONE.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, (TWENTY_FOUR_TO_THIRTY_ONE243!=null?TWENTY_FOUR_TO_THIRTY_ONE243.getText():null)));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:292:5: THIRTY_TWO_TO_FIFTY_NINE
                    {
                    THIRTY_TWO_TO_FIFTY_NINE244=(Token)match(input,THIRTY_TWO_TO_FIFTY_NINE,FOLLOW_THIRTY_TWO_TO_FIFTY_NINE_in_integer_0_to_593073); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THIRTY_TWO_TO_FIFTY_NINE.add(THIRTY_TWO_TO_FIFTY_NINE244);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 292:31: -> INTEGER[$THIRTY_TWO_TO_FIFTY_NINE.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, (THIRTY_TWO_TO_FIFTY_NINE244!=null?THIRTY_TWO_TO_FIFTY_NINE244.getText():null)));

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
    // $ANTLR end "integer_0_to_59"

    public static class integer_0_to_99_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "integer_0_to_99"
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:296:1: integer_0_to_99 : ( UP_TO_TWO_ZEROS -> INTEGER[$UP_TO_TWO_ZEROS.text] | ONE_TO_TWELVE -> INTEGER[$ONE_TO_TWELVE.text] | THIRTEEN_TO_TWENTY_THREE -> INTEGER[$THIRTEEN_TO_TWENTY_THREE.text] | TWENTY_FOUR_TO_THIRTY_ONE -> INTEGER[$TWENTY_FOUR_TO_THIRTY_ONE.text] | THIRTY_TWO_TO_FIFTY_NINE -> INTEGER[$THIRTY_TWO_TO_FIFTY_NINE.text] | SIXTY_TO_NINETY_NINE -> INTEGER[$SIXTY_TO_NINETY_NINE.text] );
    public final DateParser.integer_0_to_99_return integer_0_to_99() throws RecognitionException {
        DateParser.integer_0_to_99_return retval = new DateParser.integer_0_to_99_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token UP_TO_TWO_ZEROS245=null;
        Token ONE_TO_TWELVE246=null;
        Token THIRTEEN_TO_TWENTY_THREE247=null;
        Token TWENTY_FOUR_TO_THIRTY_ONE248=null;
        Token THIRTY_TWO_TO_FIFTY_NINE249=null;
        Token SIXTY_TO_NINETY_NINE250=null;

        Object UP_TO_TWO_ZEROS245_tree=null;
        Object ONE_TO_TWELVE246_tree=null;
        Object THIRTEEN_TO_TWENTY_THREE247_tree=null;
        Object TWENTY_FOUR_TO_THIRTY_ONE248_tree=null;
        Object THIRTY_TWO_TO_FIFTY_NINE249_tree=null;
        Object SIXTY_TO_NINETY_NINE250_tree=null;
        RewriteRuleTokenStream stream_UP_TO_TWO_ZEROS=new RewriteRuleTokenStream(adaptor,"token UP_TO_TWO_ZEROS");
        RewriteRuleTokenStream stream_SIXTY_TO_NINETY_NINE=new RewriteRuleTokenStream(adaptor,"token SIXTY_TO_NINETY_NINE");
        RewriteRuleTokenStream stream_THIRTEEN_TO_TWENTY_THREE=new RewriteRuleTokenStream(adaptor,"token THIRTEEN_TO_TWENTY_THREE");
        RewriteRuleTokenStream stream_ONE_TO_TWELVE=new RewriteRuleTokenStream(adaptor,"token ONE_TO_TWELVE");
        RewriteRuleTokenStream stream_THIRTY_TWO_TO_FIFTY_NINE=new RewriteRuleTokenStream(adaptor,"token THIRTY_TWO_TO_FIFTY_NINE");
        RewriteRuleTokenStream stream_TWENTY_FOUR_TO_THIRTY_ONE=new RewriteRuleTokenStream(adaptor,"token TWENTY_FOUR_TO_THIRTY_ONE");

        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:297:3: ( UP_TO_TWO_ZEROS -> INTEGER[$UP_TO_TWO_ZEROS.text] | ONE_TO_TWELVE -> INTEGER[$ONE_TO_TWELVE.text] | THIRTEEN_TO_TWENTY_THREE -> INTEGER[$THIRTEEN_TO_TWENTY_THREE.text] | TWENTY_FOUR_TO_THIRTY_ONE -> INTEGER[$TWENTY_FOUR_TO_THIRTY_ONE.text] | THIRTY_TWO_TO_FIFTY_NINE -> INTEGER[$THIRTY_TWO_TO_FIFTY_NINE.text] | SIXTY_TO_NINETY_NINE -> INTEGER[$SIXTY_TO_NINETY_NINE.text] )
            int alt78=6;
            switch ( input.LA(1) ) {
            case UP_TO_TWO_ZEROS:
                {
                alt78=1;
                }
                break;
            case ONE_TO_TWELVE:
                {
                alt78=2;
                }
                break;
            case THIRTEEN_TO_TWENTY_THREE:
                {
                alt78=3;
                }
                break;
            case TWENTY_FOUR_TO_THIRTY_ONE:
                {
                alt78=4;
                }
                break;
            case THIRTY_TWO_TO_FIFTY_NINE:
                {
                alt78=5;
                }
                break;
            case SIXTY_TO_NINETY_NINE:
                {
                alt78=6;
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:297:5: UP_TO_TWO_ZEROS
                    {
                    UP_TO_TWO_ZEROS245=(Token)match(input,UP_TO_TWO_ZEROS,FOLLOW_UP_TO_TWO_ZEROS_in_integer_0_to_993095); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_UP_TO_TWO_ZEROS.add(UP_TO_TWO_ZEROS245);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 297:31: -> INTEGER[$UP_TO_TWO_ZEROS.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, (UP_TO_TWO_ZEROS245!=null?UP_TO_TWO_ZEROS245.getText():null)));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:298:5: ONE_TO_TWELVE
                    {
                    ONE_TO_TWELVE246=(Token)match(input,ONE_TO_TWELVE,FOLLOW_ONE_TO_TWELVE_in_integer_0_to_993116); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ONE_TO_TWELVE.add(ONE_TO_TWELVE246);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 298:31: -> INTEGER[$ONE_TO_TWELVE.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, (ONE_TO_TWELVE246!=null?ONE_TO_TWELVE246.getText():null)));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:299:5: THIRTEEN_TO_TWENTY_THREE
                    {
                    THIRTEEN_TO_TWENTY_THREE247=(Token)match(input,THIRTEEN_TO_TWENTY_THREE,FOLLOW_THIRTEEN_TO_TWENTY_THREE_in_integer_0_to_993139); if (state.failed) return retval; 
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
                    // 299:31: -> INTEGER[$THIRTEEN_TO_TWENTY_THREE.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, (THIRTEEN_TO_TWENTY_THREE247!=null?THIRTEEN_TO_TWENTY_THREE247.getText():null)));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:300:5: TWENTY_FOUR_TO_THIRTY_ONE
                    {
                    TWENTY_FOUR_TO_THIRTY_ONE248=(Token)match(input,TWENTY_FOUR_TO_THIRTY_ONE,FOLLOW_TWENTY_FOUR_TO_THIRTY_ONE_in_integer_0_to_993151); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TWENTY_FOUR_TO_THIRTY_ONE.add(TWENTY_FOUR_TO_THIRTY_ONE248);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 300:31: -> INTEGER[$TWENTY_FOUR_TO_THIRTY_ONE.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, (TWENTY_FOUR_TO_THIRTY_ONE248!=null?TWENTY_FOUR_TO_THIRTY_ONE248.getText():null)));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:301:5: THIRTY_TWO_TO_FIFTY_NINE
                    {
                    THIRTY_TWO_TO_FIFTY_NINE249=(Token)match(input,THIRTY_TWO_TO_FIFTY_NINE,FOLLOW_THIRTY_TWO_TO_FIFTY_NINE_in_integer_0_to_993162); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THIRTY_TWO_TO_FIFTY_NINE.add(THIRTY_TWO_TO_FIFTY_NINE249);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 301:31: -> INTEGER[$THIRTY_TWO_TO_FIFTY_NINE.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, (THIRTY_TWO_TO_FIFTY_NINE249!=null?THIRTY_TWO_TO_FIFTY_NINE249.getText():null)));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 6 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:302:5: SIXTY_TO_NINETY_NINE
                    {
                    SIXTY_TO_NINETY_NINE250=(Token)match(input,SIXTY_TO_NINETY_NINE,FOLLOW_SIXTY_TO_NINETY_NINE_in_integer_0_to_993174); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SIXTY_TO_NINETY_NINE.add(SIXTY_TO_NINETY_NINE250);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 302:31: -> INTEGER[$SIXTY_TO_NINETY_NINE.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, (SIXTY_TO_NINETY_NINE250!=null?SIXTY_TO_NINETY_NINE250.getText():null)));

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
    // $ANTLR end "integer_0_to_99"

    public static class integer_1_to_31_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "integer_1_to_31"
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:306:1: integer_1_to_31 : ( ONE_TO_TWELVE -> INTEGER[$ONE_TO_TWELVE.text] | THIRTEEN_TO_TWENTY_THREE -> INTEGER[$THIRTEEN_TO_TWENTY_THREE.text] | TWENTY_FOUR_TO_THIRTY_ONE -> INTEGER[$TWENTY_FOUR_TO_THIRTY_ONE.text] );
    public final DateParser.integer_1_to_31_return integer_1_to_31() throws RecognitionException {
        DateParser.integer_1_to_31_return retval = new DateParser.integer_1_to_31_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ONE_TO_TWELVE251=null;
        Token THIRTEEN_TO_TWENTY_THREE252=null;
        Token TWENTY_FOUR_TO_THIRTY_ONE253=null;

        Object ONE_TO_TWELVE251_tree=null;
        Object THIRTEEN_TO_TWENTY_THREE252_tree=null;
        Object TWENTY_FOUR_TO_THIRTY_ONE253_tree=null;
        RewriteRuleTokenStream stream_THIRTEEN_TO_TWENTY_THREE=new RewriteRuleTokenStream(adaptor,"token THIRTEEN_TO_TWENTY_THREE");
        RewriteRuleTokenStream stream_ONE_TO_TWELVE=new RewriteRuleTokenStream(adaptor,"token ONE_TO_TWELVE");
        RewriteRuleTokenStream stream_TWENTY_FOUR_TO_THIRTY_ONE=new RewriteRuleTokenStream(adaptor,"token TWENTY_FOUR_TO_THIRTY_ONE");

        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:307:3: ( ONE_TO_TWELVE -> INTEGER[$ONE_TO_TWELVE.text] | THIRTEEN_TO_TWENTY_THREE -> INTEGER[$THIRTEEN_TO_TWENTY_THREE.text] | TWENTY_FOUR_TO_THIRTY_ONE -> INTEGER[$TWENTY_FOUR_TO_THIRTY_ONE.text] )
            int alt79=3;
            switch ( input.LA(1) ) {
            case ONE_TO_TWELVE:
                {
                alt79=1;
                }
                break;
            case THIRTEEN_TO_TWENTY_THREE:
                {
                alt79=2;
                }
                break;
            case TWENTY_FOUR_TO_THIRTY_ONE:
                {
                alt79=3;
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
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:307:5: ONE_TO_TWELVE
                    {
                    ONE_TO_TWELVE251=(Token)match(input,ONE_TO_TWELVE,FOLLOW_ONE_TO_TWELVE_in_integer_1_to_313200); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ONE_TO_TWELVE.add(ONE_TO_TWELVE251);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 307:31: -> INTEGER[$ONE_TO_TWELVE.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, (ONE_TO_TWELVE251!=null?ONE_TO_TWELVE251.getText():null)));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:308:5: THIRTEEN_TO_TWENTY_THREE
                    {
                    THIRTEEN_TO_TWENTY_THREE252=(Token)match(input,THIRTEEN_TO_TWENTY_THREE,FOLLOW_THIRTEEN_TO_TWENTY_THREE_in_integer_1_to_313223); if (state.failed) return retval; 
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
                    // 308:31: -> INTEGER[$THIRTEEN_TO_TWENTY_THREE.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, (THIRTEEN_TO_TWENTY_THREE252!=null?THIRTEEN_TO_TWENTY_THREE252.getText():null)));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:309:5: TWENTY_FOUR_TO_THIRTY_ONE
                    {
                    TWENTY_FOUR_TO_THIRTY_ONE253=(Token)match(input,TWENTY_FOUR_TO_THIRTY_ONE,FOLLOW_TWENTY_FOUR_TO_THIRTY_ONE_in_integer_1_to_313235); if (state.failed) return retval; 
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
                    // 309:31: -> INTEGER[$TWENTY_FOUR_TO_THIRTY_ONE.text]
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(INTEGER, (TWENTY_FOUR_TO_THIRTY_ONE253!=null?TWENTY_FOUR_TO_THIRTY_ONE253.getText():null)));

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
    // $ANTLR end "integer_1_to_31"

    // $ANTLR start synpred1_Date
    public final void synpred1_Date_fragment() throws RecognitionException {   
        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:30:5: ( date ( AT )? ( time )? )
        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:30:5: date ( AT )? ( time )?
        {
        pushFollow(FOLLOW_date_in_synpred1_Date128);
        date();

        state._fsp--;
        if (state.failed) return ;
        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:30:10: ( AT )?
        int alt80=2;
        int LA80_0 = input.LA(1);

        if ( (LA80_0==AT) ) {
            alt80=1;
        }
        switch (alt80) {
            case 1 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:30:10: AT
                {
                match(input,AT,FOLLOW_AT_in_synpred1_Date130); if (state.failed) return ;

                }
                break;

        }

        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:30:14: ( time )?
        int alt81=2;
        int LA81_0 = input.LA(1);

        if ( ((LA81_0>=MIDNIGHT && LA81_0<=NOON)||(LA81_0>=ONE_TO_TWELVE && LA81_0<=THIRTEEN_TO_TWENTY_THREE)) ) {
            alt81=1;
        }
        switch (alt81) {
            case 1 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:30:14: time
                {
                pushFollow(FOLLOW_time_in_synpred1_Date133);
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
        pushFollow(FOLLOW_time_in_synpred2_Date151);
        time();

        state._fsp--;
        if (state.failed) return ;
        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:31:10: ( ON )?
        int alt82=2;
        int LA82_0 = input.LA(1);

        if ( (LA82_0==ON) ) {
            alt82=1;
        }
        switch (alt82) {
            case 1 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:31:10: ON
                {
                match(input,ON,FOLLOW_ON_in_synpred2_Date153); if (state.failed) return ;

                }
                break;

        }

        pushFollow(FOLLOW_date_in_synpred2_Date156);
        date();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_Date

    // $ANTLR start synpred3_Date
    public final void synpred3_Date_fragment() throws RecognitionException {   
        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:71:5: ( integer_1_to_12 date_separator integer_1_to_31 ( date_separator four_digits )? )
        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:71:5: integer_1_to_12 date_separator integer_1_to_31 ( date_separator four_digits )?
        {
        pushFollow(FOLLOW_integer_1_to_12_in_synpred3_Date465);
        integer_1_to_12();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_date_separator_in_synpred3_Date467);
        date_separator();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_integer_1_to_31_in_synpred3_Date469);
        integer_1_to_31();

        state._fsp--;
        if (state.failed) return ;
        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:71:52: ( date_separator four_digits )?
        int alt83=2;
        int LA83_0 = input.LA(1);

        if ( ((LA83_0>=DASH && LA83_0<=SLASH)) ) {
            alt83=1;
        }
        switch (alt83) {
            case 1 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:71:53: date_separator four_digits
                {
                pushFollow(FOLLOW_date_separator_in_synpred3_Date472);
                date_separator();

                state._fsp--;
                if (state.failed) return ;
                pushFollow(FOLLOW_four_digits_in_synpred3_Date474);
                four_digits();

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
        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:74:5: ( four_digits date_separator integer_1_to_12 date_separator integer_1_to_31 )
        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:74:5: four_digits date_separator integer_1_to_12 date_separator integer_1_to_31
        {
        pushFollow(FOLLOW_four_digits_in_synpred4_Date504);
        four_digits();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_date_separator_in_synpred4_Date506);
        date_separator();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_integer_1_to_12_in_synpred4_Date508);
        integer_1_to_12();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_date_separator_in_synpred4_Date510);
        date_separator();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_integer_1_to_31_in_synpred4_Date512);
        integer_1_to_31();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred4_Date

    // $ANTLR start synpred6_Date
    public final void synpred6_Date_fragment() throws RecognitionException {   
        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:164:5: ( ( '\\'' )? integer_0_to_99 )
        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:164:5: ( '\\'' )? integer_0_to_99
        {
        // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:164:5: ( '\\'' )?
        int alt86=2;
        int LA86_0 = input.LA(1);

        if ( (LA86_0==131) ) {
            alt86=1;
        }
        switch (alt86) {
            case 1 :
                // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/Date.g:164:5: '\\''
                {
                match(input,131,FOLLOW_131_in_synpred6_Date1524); if (state.failed) return ;

                }
                break;

        }

        pushFollow(FOLLOW_integer_0_to_99_in_synpred6_Date1527);
        integer_0_to_99();

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
    protected DFA6 dfa6 = new DFA6(this);
    protected DFA14 dfa14 = new DFA14(this);
    protected DFA15 dfa15 = new DFA15(this);
    protected DFA23 dfa23 = new DFA23(this);
    protected DFA52 dfa52 = new DFA52(this);
    protected DFA74 dfa74 = new DFA74(this);
    static final String DFA4_eotS =
        "\50\uffff";
    static final String DFA4_eofS =
        "\2\uffff\5\40\27\uffff\1\40\2\uffff\7\40";
    static final String DFA4_minS =
        "\1\25\1\uffff\5\24\27\0\1\24\2\uffff\7\24";
    static final String DFA4_maxS =
        "\1\174\1\uffff\3\u0081\2\174\27\0\1\174\2\uffff\1\174\3\u0080\3"+
        "\174";
    static final String DFA4_acceptS =
        "\1\uffff\1\1\35\uffff\1\2\1\3\7\uffff";
    static final String DFA4_specialS =
        "\7\uffff\1\16\1\0\1\25\1\22\1\24\1\21\1\17\1\2\1\12\1\10\1\4\1\6"+
        "\1\3\1\26\1\23\1\20\1\15\1\13\1\7\1\14\1\11\1\5\1\1\12\uffff}>";
    static final String[] DFA4_transitionS = {
            "\5\1\2\uffff\7\1\2\uffff\26\1\4\uffff\1\5\1\6\66\1\1\2\1\4\1"+
            "\3\3\1",
            "",
            "\5\37\1\7\2\uffff\7\37\2\uffff\1\17\1\20\1\21\1\22\1\23\1\24"+
            "\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\10\1\11\1\12"+
            "\1\13\1\14\1\15\1\16\2\1\4\uffff\74\37\3\uffff\1\1\1\36",
            "\5\37\1\7\2\uffff\7\37\2\uffff\1\17\1\20\1\21\1\22\1\23\1\24"+
            "\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\10\1\11\1\12"+
            "\1\13\1\14\1\15\1\16\2\1\4\uffff\74\37\3\uffff\1\1\1\36",
            "\6\37\2\uffff\7\37\2\uffff\26\37\2\1\4\uffff\74\37\4\uffff"+
            "\1\36",
            "\6\37\2\uffff\7\37\2\uffff\26\37\6\uffff\74\37",
            "\6\37\2\uffff\7\37\2\uffff\26\37\6\uffff\74\37",
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
            "\6\37\2\uffff\7\37\2\uffff\26\37\2\uffff\1\46\1\47\2\uffff"+
            "\66\37\1\42\1\41\1\43\1\44\1\45\1\37",
            "",
            "",
            "\6\37\2\uffff\7\37\2\uffff\30\37\1\46\1\47\2\uffff\74\37",
            "\6\37\2\uffff\7\37\2\uffff\30\37\1\46\1\47\2\uffff\74\37\3"+
            "\uffff\1\37",
            "\6\37\2\uffff\7\37\2\uffff\30\37\1\46\1\47\2\uffff\74\37\3"+
            "\uffff\1\37",
            "\6\37\2\uffff\7\37\2\uffff\30\37\1\46\1\47\2\uffff\74\37\3"+
            "\uffff\1\37",
            "\6\37\2\uffff\7\37\2\uffff\30\37\1\46\1\47\2\uffff\74\37",
            "\6\37\2\uffff\7\37\2\uffff\26\37\6\uffff\74\37",
            "\6\37\2\uffff\7\37\2\uffff\26\37\6\uffff\74\37"
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
            return "28:1: datetime options {backtrack=true; } : ( date ( AT )? ( time )? -> ^( DATE_TIME date ( time )? ) | time ( ON )? date -> ^( DATE_TIME date time ) | time -> ^( DATE_TIME ^( RELATIVE_DATE SEEK_DIRECTION[\">\"] INTEGER[\"0\"] ) time ) );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA4_8 = input.LA(1);

                         
                        int index4_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 1;}

                        else if ( (synpred2_Date()) ) {s = 31;}

                         
                        input.seek(index4_8);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA4_29 = input.LA(1);

                         
                        int index4_29 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 1;}

                        else if ( (synpred2_Date()) ) {s = 31;}

                         
                        input.seek(index4_29);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA4_14 = input.LA(1);

                         
                        int index4_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 1;}

                        else if ( (synpred2_Date()) ) {s = 31;}

                         
                        input.seek(index4_14);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA4_19 = input.LA(1);

                         
                        int index4_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 1;}

                        else if ( (synpred2_Date()) ) {s = 31;}

                         
                        input.seek(index4_19);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA4_17 = input.LA(1);

                         
                        int index4_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 1;}

                        else if ( (synpred2_Date()) ) {s = 31;}

                         
                        input.seek(index4_17);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA4_28 = input.LA(1);

                         
                        int index4_28 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 1;}

                        else if ( (synpred2_Date()) ) {s = 31;}

                         
                        input.seek(index4_28);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA4_18 = input.LA(1);

                         
                        int index4_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 1;}

                        else if ( (synpred2_Date()) ) {s = 31;}

                         
                        input.seek(index4_18);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA4_25 = input.LA(1);

                         
                        int index4_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 1;}

                        else if ( (synpred2_Date()) ) {s = 31;}

                         
                        input.seek(index4_25);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA4_16 = input.LA(1);

                         
                        int index4_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 1;}

                        else if ( (synpred2_Date()) ) {s = 31;}

                         
                        input.seek(index4_16);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA4_27 = input.LA(1);

                         
                        int index4_27 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 1;}

                        else if ( (synpred2_Date()) ) {s = 31;}

                         
                        input.seek(index4_27);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA4_15 = input.LA(1);

                         
                        int index4_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 1;}

                        else if ( (synpred2_Date()) ) {s = 31;}

                         
                        input.seek(index4_15);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA4_24 = input.LA(1);

                         
                        int index4_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 1;}

                        else if ( (synpred2_Date()) ) {s = 31;}

                         
                        input.seek(index4_24);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA4_26 = input.LA(1);

                         
                        int index4_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 1;}

                        else if ( (synpred2_Date()) ) {s = 31;}

                         
                        input.seek(index4_26);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA4_23 = input.LA(1);

                         
                        int index4_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 1;}

                        else if ( (synpred2_Date()) ) {s = 31;}

                         
                        input.seek(index4_23);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA4_7 = input.LA(1);

                         
                        int index4_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 1;}

                        else if ( (synpred2_Date()) ) {s = 31;}

                         
                        input.seek(index4_7);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA4_13 = input.LA(1);

                         
                        int index4_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 1;}

                        else if ( (synpred2_Date()) ) {s = 31;}

                         
                        input.seek(index4_13);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA4_22 = input.LA(1);

                         
                        int index4_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 1;}

                        else if ( (synpred2_Date()) ) {s = 31;}

                         
                        input.seek(index4_22);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA4_12 = input.LA(1);

                         
                        int index4_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 1;}

                        else if ( (synpred2_Date()) ) {s = 31;}

                         
                        input.seek(index4_12);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA4_10 = input.LA(1);

                         
                        int index4_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 1;}

                        else if ( (synpred2_Date()) ) {s = 31;}

                         
                        input.seek(index4_10);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA4_21 = input.LA(1);

                         
                        int index4_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 1;}

                        else if ( (synpred2_Date()) ) {s = 31;}

                         
                        input.seek(index4_21);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA4_11 = input.LA(1);

                         
                        int index4_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 1;}

                        else if ( (synpred2_Date()) ) {s = 31;}

                         
                        input.seek(index4_11);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA4_9 = input.LA(1);

                         
                        int index4_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 1;}

                        else if ( (synpred2_Date()) ) {s = 31;}

                         
                        input.seek(index4_9);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA4_20 = input.LA(1);

                         
                        int index4_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Date()) ) {s = 1;}

                        else if ( (synpred2_Date()) ) {s = 31;}

                         
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
        "\u008a\uffff";
    static final String DFA5_eofS =
        "\2\uffff\1\33\31\uffff\14\106\4\uffff\1\106\33\uffff\14\161\66\uffff";
    static final String DFA5_minS =
        "\1\25\1\31\1\23\30\31\1\uffff\14\23\1\uffff\1\32\2\25\1\23\14\uffff"+
        "\1\101\11\31\1\101\1\31\3\uffff\14\23\30\31\1\uffff\1\32\2\25\16"+
        "\uffff\1\101\11\31\1\101\1\31";
    static final String DFA5_maxS =
        "\1\174\1\31\1\171\30\u0080\1\uffff\14\172\1\uffff\1\33\2\174\1\u0082"+
        "\14\uffff\1\136\11\u0080\1\126\1\u0080\3\uffff\14\172\30\u0080\1"+
        "\uffff\1\33\2\174\16\uffff\1\136\11\u0080\1\126\1\u0080";
    static final String DFA5_acceptS =
        "\33\uffff\1\3\14\uffff\1\4\4\uffff\14\3\14\uffff\2\3\1\1\44\uffff"+
        "\1\2\3\uffff\16\1\14\uffff";
    static final String DFA5_specialS =
        "\u008a\uffff}>";
    static final String[] DFA5_transitionS = {
            "\3\33\1\1\1\2\2\uffff\7\33\2\uffff\3\33\1\34\1\35\1\36\1\37"+
            "\1\40\1\41\1\42\1\43\1\44\1\45\1\46\1\47\7\33\6\uffff\1\3\1"+
            "\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20"+
            "\1\21\1\22\1\23\1\24\1\25\1\26\1\27\41\50\1\30\1\50\1\31\1\32"+
            "\2\50",
            "\1\51",
            "\1\33\6\uffff\1\52\1\53\43\uffff\2\33\66\uffff\3\33",
            "\1\54\13\uffff\3\33\1\55\1\56\1\57\1\60\1\61\1\62\1\63\1\64"+
            "\1\65\1\66\1\67\1\70\7\33\105\uffff\1\50",
            "\1\54\13\uffff\3\70\1\55\1\56\1\57\1\60\1\61\1\62\1\63\1\64"+
            "\1\65\1\66\1\67\10\70\105\uffff\1\50",
            "\1\54\13\uffff\3\70\1\55\1\56\1\57\1\60\1\61\1\62\1\63\1\64"+
            "\1\65\1\66\1\67\10\70\105\uffff\1\50",
            "\1\54\13\uffff\3\70\1\55\1\56\1\57\1\60\1\61\1\62\1\63\1\64"+
            "\1\65\1\66\1\67\10\70\105\uffff\1\50",
            "\1\54\13\uffff\3\70\1\55\1\56\1\57\1\60\1\61\1\62\1\63\1\64"+
            "\1\65\1\66\1\67\10\70\105\uffff\1\50",
            "\1\54\13\uffff\3\70\1\55\1\56\1\57\1\60\1\61\1\62\1\63\1\64"+
            "\1\65\1\66\1\67\10\70\105\uffff\1\50",
            "\1\54\13\uffff\3\70\1\55\1\56\1\57\1\60\1\61\1\62\1\63\1\64"+
            "\1\65\1\66\1\67\10\70\105\uffff\1\50",
            "\1\54\13\uffff\3\70\1\55\1\56\1\57\1\60\1\61\1\62\1\63\1\64"+
            "\1\65\1\66\1\67\10\70\105\uffff\1\50",
            "\1\54\13\uffff\3\70\1\55\1\56\1\57\1\60\1\61\1\62\1\63\1\64"+
            "\1\65\1\66\1\67\10\70\105\uffff\1\50",
            "\1\54\13\uffff\3\70\1\55\1\56\1\57\1\60\1\61\1\62\1\63\1\64"+
            "\1\65\1\66\1\67\10\70\105\uffff\1\50",
            "\1\54\13\uffff\3\70\1\55\1\56\1\57\1\60\1\61\1\62\1\63\1\64"+
            "\1\65\1\66\1\67\10\70\105\uffff\1\50",
            "\1\54\13\uffff\3\70\1\55\1\56\1\57\1\60\1\61\1\62\1\63\1\64"+
            "\1\65\1\66\1\67\10\70\105\uffff\1\50",
            "\1\54\13\uffff\3\70\1\55\1\56\1\57\1\60\1\61\1\62\1\63\1\64"+
            "\1\65\1\66\1\67\10\70\105\uffff\1\50",
            "\1\54\13\uffff\3\70\1\55\1\56\1\57\1\60\1\61\1\62\1\63\1\64"+
            "\1\65\1\66\1\67\10\70\105\uffff\1\50",
            "\1\54\13\uffff\3\70\1\55\1\56\1\57\1\60\1\61\1\62\1\63\1\64"+
            "\1\65\1\66\1\67\10\70\105\uffff\1\50",
            "\1\54\13\uffff\3\70\1\55\1\56\1\57\1\60\1\61\1\62\1\63\1\64"+
            "\1\65\1\66\1\67\10\70\105\uffff\1\50",
            "\1\54\13\uffff\3\70\1\55\1\56\1\57\1\60\1\61\1\62\1\63\1\64"+
            "\1\65\1\66\1\67\10\70\105\uffff\1\50",
            "\1\54\13\uffff\3\70\1\55\1\56\1\57\1\60\1\61\1\62\1\63\1\64"+
            "\1\65\1\66\1\67\10\70\105\uffff\1\50",
            "\1\54\13\uffff\3\70\1\55\1\56\1\57\1\60\1\61\1\62\1\63\1\64"+
            "\1\65\1\66\1\67\10\70\105\uffff\1\50",
            "\1\54\13\uffff\3\70\1\55\1\56\1\57\1\60\1\61\1\62\1\63\1\64"+
            "\1\65\1\66\1\67\10\70\1\71\5\uffff\1\102\1\77\1\100\1\72\1\73"+
            "\1\76\1\74\1\101\1\75\14\uffff\11\50\41\uffff\1\50",
            "\1\54\13\uffff\3\70\1\55\1\56\1\57\1\60\1\61\1\62\1\63\1\64"+
            "\1\65\1\66\1\67\10\70\1\103\5\uffff\1\104\24\uffff\1\50\51\uffff"+
            "\1\50",
            "\1\54\13\uffff\3\70\1\55\1\56\1\57\1\60\1\61\1\62\1\63\1\64"+
            "\1\65\1\66\1\67\10\70\2\50\103\uffff\1\50",
            "\1\54\13\uffff\3\70\1\55\1\56\1\57\1\60\1\61\1\62\1\63\1\64"+
            "\1\65\1\66\1\67\10\70\2\50\103\uffff\1\50",
            "\1\54\13\uffff\3\70\1\55\1\56\1\57\1\60\1\61\1\62\1\63\1\64"+
            "\1\65\1\66\1\67\10\70\2\50\103\uffff\1\50",
            "",
            "\1\70\53\uffff\2\106\64\50\2\uffff\1\105\1\70\1\106\1\50",
            "\1\106\53\uffff\2\106\64\50\2\uffff\1\105\2\106\1\50",
            "\1\106\53\uffff\2\106\64\50\2\uffff\1\105\2\106\1\50",
            "\1\106\53\uffff\2\106\64\50\2\uffff\1\105\2\106\1\50",
            "\1\106\53\uffff\2\106\64\50\2\uffff\1\105\2\106\1\50",
            "\1\106\53\uffff\2\106\64\50\2\uffff\1\105\2\106\1\50",
            "\1\106\53\uffff\2\106\64\50\2\uffff\1\105\2\106\1\50",
            "\1\106\53\uffff\2\106\64\50\2\uffff\1\105\2\106\1\50",
            "\1\106\53\uffff\2\106\64\50\2\uffff\1\105\2\106\1\50",
            "\1\106\53\uffff\2\106\64\50\2\uffff\1\105\2\106\1\50",
            "\1\106\53\uffff\2\106\64\50\2\uffff\1\105\2\106\1\50",
            "\1\106\53\uffff\2\106\64\50\2\uffff\1\105\2\106\1\50",
            "",
            "\1\52\1\53",
            "\3\107\1\uffff\1\107\2\uffff\7\107\2\uffff\3\107\1\110\1\111"+
            "\1\112\1\113\1\114\1\115\1\116\1\117\1\120\1\121\1\122\1\123"+
            "\7\107\6\uffff\1\124\1\125\1\126\1\127\1\130\1\131\1\132\1\133"+
            "\1\134\1\135\1\136\1\137\1\140\1\141\1\142\1\143\1\144\1\145"+
            "\1\146\1\147\1\150\41\154\1\151\1\154\1\152\1\153\2\154",
            "\3\107\1\uffff\1\107\2\uffff\7\107\2\uffff\3\107\1\110\1\111"+
            "\1\112\1\113\1\114\1\115\1\116\1\117\1\120\1\121\1\122\1\123"+
            "\7\107\6\uffff\1\124\1\125\1\126\1\127\1\130\1\131\1\132\1\133"+
            "\1\134\1\135\1\136\1\137\1\140\1\141\1\142\1\143\1\144\1\145"+
            "\1\146\1\147\1\150\41\154\1\151\1\154\1\152\1\153\2\154",
            "\1\106\6\uffff\1\157\1\156\7\uffff\2\106\32\uffff\2\106\66"+
            "\uffff\3\106\10\uffff\1\155",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\102\1\77\1\100\1\72\1\73\1\76\1\74\1\101\1\75\14\uffff\11"+
            "\50",
            "\1\54\13\uffff\3\106\1\55\1\56\1\57\1\60\1\61\1\62\1\63\1\64"+
            "\1\65\1\66\1\67\1\70\7\106\105\uffff\1\50",
            "\1\54\13\uffff\3\106\1\55\1\56\1\57\1\60\1\61\1\62\1\63\1\64"+
            "\1\65\1\66\1\67\1\70\7\106\105\uffff\1\50",
            "\1\54\13\uffff\3\106\1\55\1\56\1\57\1\60\1\61\1\62\1\63\1\64"+
            "\1\65\1\66\1\67\1\70\7\106\105\uffff\1\50",
            "\1\54\13\uffff\3\106\1\55\1\56\1\57\1\60\1\61\1\62\1\63\1\64"+
            "\1\65\1\66\1\67\1\70\7\106\105\uffff\1\50",
            "\1\54\13\uffff\3\106\1\55\1\56\1\57\1\60\1\61\1\62\1\63\1\64"+
            "\1\65\1\66\1\67\1\70\7\106\105\uffff\1\50",
            "\1\54\13\uffff\3\106\1\55\1\56\1\57\1\60\1\61\1\62\1\63\1\64"+
            "\1\65\1\66\1\67\1\70\7\106\105\uffff\1\50",
            "\1\54\13\uffff\3\106\1\55\1\56\1\57\1\60\1\61\1\62\1\63\1\64"+
            "\1\65\1\66\1\67\1\70\7\106\105\uffff\1\50",
            "\1\54\13\uffff\3\106\1\55\1\56\1\57\1\60\1\61\1\62\1\63\1\64"+
            "\1\65\1\66\1\67\1\70\7\106\105\uffff\1\50",
            "\1\54\13\uffff\3\106\1\55\1\56\1\57\1\60\1\61\1\62\1\63\1\64"+
            "\1\65\1\66\1\67\1\70\7\106\105\uffff\1\50",
            "\1\104\24\uffff\1\50",
            "\1\54\13\uffff\3\106\1\55\1\56\1\57\1\60\1\61\1\62\1\63\1\64"+
            "\1\65\1\66\1\67\1\70\7\106\105\uffff\1\50",
            "",
            "",
            "",
            "\1\161\53\uffff\2\161\64\154\2\uffff\1\160\2\161\1\154",
            "\1\161\53\uffff\2\161\64\154\2\uffff\1\160\2\161\1\154",
            "\1\161\53\uffff\2\161\64\154\2\uffff\1\160\2\161\1\154",
            "\1\161\53\uffff\2\161\64\154\2\uffff\1\160\2\161\1\154",
            "\1\161\53\uffff\2\161\64\154\2\uffff\1\160\2\161\1\154",
            "\1\161\53\uffff\2\161\64\154\2\uffff\1\160\2\161\1\154",
            "\1\161\53\uffff\2\161\64\154\2\uffff\1\160\2\161\1\154",
            "\1\161\53\uffff\2\161\64\154\2\uffff\1\160\2\161\1\154",
            "\1\161\53\uffff\2\161\64\154\2\uffff\1\160\2\161\1\154",
            "\1\161\53\uffff\2\161\64\154\2\uffff\1\160\2\161\1\154",
            "\1\161\53\uffff\2\161\64\154\2\uffff\1\160\2\161\1\154",
            "\1\161\53\uffff\2\161\64\154\2\uffff\1\160\2\161\1\154",
            "\1\175\13\uffff\3\175\1\162\1\163\1\164\1\165\1\166\1\167\1"+
            "\170\1\171\1\172\1\173\1\174\10\175\105\uffff\1\154",
            "\1\175\13\uffff\3\175\1\162\1\163\1\164\1\165\1\166\1\167\1"+
            "\170\1\171\1\172\1\173\1\174\10\175\105\uffff\1\154",
            "\1\175\13\uffff\3\175\1\162\1\163\1\164\1\165\1\166\1\167\1"+
            "\170\1\171\1\172\1\173\1\174\10\175\105\uffff\1\154",
            "\1\175\13\uffff\3\175\1\162\1\163\1\164\1\165\1\166\1\167\1"+
            "\170\1\171\1\172\1\173\1\174\10\175\105\uffff\1\154",
            "\1\175\13\uffff\3\175\1\162\1\163\1\164\1\165\1\166\1\167\1"+
            "\170\1\171\1\172\1\173\1\174\10\175\105\uffff\1\154",
            "\1\175\13\uffff\3\175\1\162\1\163\1\164\1\165\1\166\1\167\1"+
            "\170\1\171\1\172\1\173\1\174\10\175\105\uffff\1\154",
            "\1\175\13\uffff\3\175\1\162\1\163\1\164\1\165\1\166\1\167\1"+
            "\170\1\171\1\172\1\173\1\174\10\175\105\uffff\1\154",
            "\1\175\13\uffff\3\175\1\162\1\163\1\164\1\165\1\166\1\167\1"+
            "\170\1\171\1\172\1\173\1\174\10\175\105\uffff\1\154",
            "\1\175\13\uffff\3\175\1\162\1\163\1\164\1\165\1\166\1\167\1"+
            "\170\1\171\1\172\1\173\1\174\10\175\105\uffff\1\154",
            "\1\175\13\uffff\3\175\1\162\1\163\1\164\1\165\1\166\1\167\1"+
            "\170\1\171\1\172\1\173\1\174\10\175\105\uffff\1\154",
            "\1\175\13\uffff\3\175\1\162\1\163\1\164\1\165\1\166\1\167\1"+
            "\170\1\171\1\172\1\173\1\174\10\175\105\uffff\1\154",
            "\1\175\13\uffff\3\175\1\162\1\163\1\164\1\165\1\166\1\167\1"+
            "\170\1\171\1\172\1\173\1\174\10\175\105\uffff\1\154",
            "\1\175\13\uffff\3\175\1\162\1\163\1\164\1\165\1\166\1\167\1"+
            "\170\1\171\1\172\1\173\1\174\10\175\105\uffff\1\154",
            "\1\175\13\uffff\3\175\1\162\1\163\1\164\1\165\1\166\1\167\1"+
            "\170\1\171\1\172\1\173\1\174\10\175\105\uffff\1\154",
            "\1\175\13\uffff\3\175\1\162\1\163\1\164\1\165\1\166\1\167\1"+
            "\170\1\171\1\172\1\173\1\174\10\175\105\uffff\1\154",
            "\1\175\13\uffff\3\175\1\162\1\163\1\164\1\165\1\166\1\167\1"+
            "\170\1\171\1\172\1\173\1\174\10\175\105\uffff\1\154",
            "\1\175\13\uffff\3\175\1\162\1\163\1\164\1\165\1\166\1\167\1"+
            "\170\1\171\1\172\1\173\1\174\10\175\105\uffff\1\154",
            "\1\175\13\uffff\3\175\1\162\1\163\1\164\1\165\1\166\1\167\1"+
            "\170\1\171\1\172\1\173\1\174\10\175\105\uffff\1\154",
            "\1\175\13\uffff\3\175\1\162\1\163\1\164\1\165\1\166\1\167\1"+
            "\170\1\171\1\172\1\173\1\174\10\175\105\uffff\1\154",
            "\1\175\13\uffff\3\175\1\162\1\163\1\164\1\165\1\166\1\167\1"+
            "\170\1\171\1\172\1\173\1\174\10\175\1\176\5\uffff\1\u0084\1"+
            "\u0081\1\u0083\1\u0086\1\u0080\1\u0082\1\177\1\u0085\1\u0087"+
            "\14\uffff\11\154\41\uffff\1\154",
            "\1\175\13\uffff\3\175\1\162\1\163\1\164\1\165\1\166\1\167\1"+
            "\170\1\171\1\172\1\173\1\174\10\175\1\u0088\5\uffff\1\u0089"+
            "\24\uffff\1\154\51\uffff\1\154",
            "\1\175\13\uffff\3\175\1\162\1\163\1\164\1\165\1\166\1\167\1"+
            "\170\1\171\1\172\1\173\1\174\10\175\2\154\103\uffff\1\154",
            "\1\175\13\uffff\3\175\1\162\1\163\1\164\1\165\1\166\1\167\1"+
            "\170\1\171\1\172\1\173\1\174\10\175\2\154\103\uffff\1\154",
            "\1\175\13\uffff\3\175\1\162\1\163\1\164\1\165\1\166\1\167\1"+
            "\170\1\171\1\172\1\173\1\174\10\175\2\154\103\uffff\1\154",
            "",
            "\1\157\1\156",
            "\1\107\2\175\1\uffff\1\175\2\uffff\7\175\2\uffff\3\175\1\110"+
            "\1\111\1\112\1\113\1\114\1\115\1\116\1\117\1\120\1\121\1\122"+
            "\1\123\7\175\6\uffff\1\124\1\125\1\126\1\127\1\130\1\131\1\132"+
            "\1\133\1\134\1\135\1\136\1\137\1\140\1\141\1\142\1\143\1\144"+
            "\1\145\1\146\1\147\1\150\41\154\1\151\1\154\1\152\1\153\2\154",
            "\1\107\2\175\1\uffff\1\175\2\uffff\7\175\2\uffff\3\175\1\110"+
            "\1\111\1\112\1\113\1\114\1\115\1\116\1\117\1\120\1\121\1\122"+
            "\1\123\7\175\6\uffff\1\124\1\125\1\126\1\127\1\130\1\131\1\132"+
            "\1\133\1\134\1\135\1\136\1\137\1\140\1\141\1\142\1\143\1\144"+
            "\1\145\1\146\1\147\1\150\41\154\1\151\1\154\1\152\1\153\2\154",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u0084\1\u0081\1\u0083\1\u0086\1\u0080\1\u0082\1\177\1\u0085"+
            "\1\u0087\14\uffff\11\154",
            "\1\175\13\uffff\3\175\1\162\1\163\1\164\1\165\1\166\1\167\1"+
            "\170\1\171\1\172\1\173\1\174\10\175\105\uffff\1\154",
            "\1\175\13\uffff\3\175\1\162\1\163\1\164\1\165\1\166\1\167\1"+
            "\170\1\171\1\172\1\173\1\174\10\175\105\uffff\1\154",
            "\1\175\13\uffff\3\175\1\162\1\163\1\164\1\165\1\166\1\167\1"+
            "\170\1\171\1\172\1\173\1\174\10\175\105\uffff\1\154",
            "\1\175\13\uffff\3\175\1\162\1\163\1\164\1\165\1\166\1\167\1"+
            "\170\1\171\1\172\1\173\1\174\10\175\105\uffff\1\154",
            "\1\175\13\uffff\3\175\1\162\1\163\1\164\1\165\1\166\1\167\1"+
            "\170\1\171\1\172\1\173\1\174\10\175\105\uffff\1\154",
            "\1\175\13\uffff\3\175\1\162\1\163\1\164\1\165\1\166\1\167\1"+
            "\170\1\171\1\172\1\173\1\174\10\175\105\uffff\1\154",
            "\1\175\13\uffff\3\175\1\162\1\163\1\164\1\165\1\166\1\167\1"+
            "\170\1\171\1\172\1\173\1\174\10\175\105\uffff\1\154",
            "\1\175\13\uffff\3\175\1\162\1\163\1\164\1\165\1\166\1\167\1"+
            "\170\1\171\1\172\1\173\1\174\10\175\105\uffff\1\154",
            "\1\175\13\uffff\3\175\1\162\1\163\1\164\1\165\1\166\1\167\1"+
            "\170\1\171\1\172\1\173\1\174\10\175\105\uffff\1\154",
            "\1\u0089\24\uffff\1\154",
            "\1\175\13\uffff\3\175\1\162\1\163\1\164\1\165\1\166\1\167\1"+
            "\170\1\171\1\172\1\173\1\174\10\175\105\uffff\1\154"
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
            return "35:1: date : ( date_prefix relative_date -> ^( RELATIVE_DATE date_prefix relative_date ) | date_prefix explicit_date -> ^( RELATIVE_DATE date_prefix explicit_date ) | relative_date | explicit_date );";
        }
    }
    static final String DFA6_eotS =
        "\100\uffff";
    static final String DFA6_eofS =
        "\34\uffff\27\3\15\uffff";
    static final String DFA6_minS =
        "\1\25\3\uffff\30\31\27\23\1\101\11\31\1\101\1\31\1\uffff";
    static final String DFA6_maxS =
        "\1\172\3\uffff\23\72\1\111\1\101\3\72\27\171\1\111\11\72\1\101\1"+
        "\72\1\uffff";
    static final String DFA6_acceptS =
        "\1\uffff\1\1\1\2\1\3\73\uffff\1\4";
    static final String DFA6_specialS =
        "\100\uffff}>";
    static final String[] DFA6_transitionS = {
            "\3\1\1\uffff\1\2\2\uffff\7\3\2\uffff\26\2\6\uffff\1\4\1\5\1"+
            "\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22"+
            "\1\23\1\24\1\25\1\26\1\27\1\30\41\uffff\1\31\1\uffff\1\32\1"+
            "\33",
            "",
            "",
            "",
            "\1\43\13\uffff\1\44\1\45\1\46\1\47\1\50\1\51\1\52\1\53\1\54"+
            "\1\55\1\56\1\57\1\60\1\61\1\62\1\34\1\35\1\36\1\37\1\40\1\41"+
            "\1\42",
            "\1\43\13\uffff\1\44\1\45\1\46\1\47\1\50\1\51\1\52\1\53\1\54"+
            "\1\55\1\56\1\57\1\60\1\61\1\62\1\34\1\35\1\36\1\37\1\40\1\41"+
            "\1\42",
            "\1\43\13\uffff\1\44\1\45\1\46\1\47\1\50\1\51\1\52\1\53\1\54"+
            "\1\55\1\56\1\57\1\60\1\61\1\62\1\34\1\35\1\36\1\37\1\40\1\41"+
            "\1\42",
            "\1\43\13\uffff\1\44\1\45\1\46\1\47\1\50\1\51\1\52\1\53\1\54"+
            "\1\55\1\56\1\57\1\60\1\61\1\62\1\34\1\35\1\36\1\37\1\40\1\41"+
            "\1\42",
            "\1\43\13\uffff\1\44\1\45\1\46\1\47\1\50\1\51\1\52\1\53\1\54"+
            "\1\55\1\56\1\57\1\60\1\61\1\62\1\34\1\35\1\36\1\37\1\40\1\41"+
            "\1\42",
            "\1\43\13\uffff\1\44\1\45\1\46\1\47\1\50\1\51\1\52\1\53\1\54"+
            "\1\55\1\56\1\57\1\60\1\61\1\62\1\34\1\35\1\36\1\37\1\40\1\41"+
            "\1\42",
            "\1\43\13\uffff\1\44\1\45\1\46\1\47\1\50\1\51\1\52\1\53\1\54"+
            "\1\55\1\56\1\57\1\60\1\61\1\62\1\34\1\35\1\36\1\37\1\40\1\41"+
            "\1\42",
            "\1\43\13\uffff\1\44\1\45\1\46\1\47\1\50\1\51\1\52\1\53\1\54"+
            "\1\55\1\56\1\57\1\60\1\61\1\62\1\34\1\35\1\36\1\37\1\40\1\41"+
            "\1\42",
            "\1\43\13\uffff\1\44\1\45\1\46\1\47\1\50\1\51\1\52\1\53\1\54"+
            "\1\55\1\56\1\57\1\60\1\61\1\62\1\34\1\35\1\36\1\37\1\40\1\41"+
            "\1\42",
            "\1\43\13\uffff\1\44\1\45\1\46\1\47\1\50\1\51\1\52\1\53\1\54"+
            "\1\55\1\56\1\57\1\60\1\61\1\62\1\34\1\35\1\36\1\37\1\40\1\41"+
            "\1\42",
            "\1\43\13\uffff\1\44\1\45\1\46\1\47\1\50\1\51\1\52\1\53\1\54"+
            "\1\55\1\56\1\57\1\60\1\61\1\62\1\34\1\35\1\36\1\37\1\40\1\41"+
            "\1\42",
            "\1\43\13\uffff\1\44\1\45\1\46\1\47\1\50\1\51\1\52\1\53\1\54"+
            "\1\55\1\56\1\57\1\60\1\61\1\62\1\34\1\35\1\36\1\37\1\40\1\41"+
            "\1\42",
            "\1\43\13\uffff\1\44\1\45\1\46\1\47\1\50\1\51\1\52\1\53\1\54"+
            "\1\55\1\56\1\57\1\60\1\61\1\62\1\34\1\35\1\36\1\37\1\40\1\41"+
            "\1\42",
            "\1\43\13\uffff\1\44\1\45\1\46\1\47\1\50\1\51\1\52\1\53\1\54"+
            "\1\55\1\56\1\57\1\60\1\61\1\62\1\34\1\35\1\36\1\37\1\40\1\41"+
            "\1\42",
            "\1\43\13\uffff\1\44\1\45\1\46\1\47\1\50\1\51\1\52\1\53\1\54"+
            "\1\55\1\56\1\57\1\60\1\61\1\62\1\34\1\35\1\36\1\37\1\40\1\41"+
            "\1\42",
            "\1\43\13\uffff\1\44\1\45\1\46\1\47\1\50\1\51\1\52\1\53\1\54"+
            "\1\55\1\56\1\57\1\60\1\61\1\62\1\34\1\35\1\36\1\37\1\40\1\41"+
            "\1\42",
            "\1\43\13\uffff\1\44\1\45\1\46\1\47\1\50\1\51\1\52\1\53\1\54"+
            "\1\55\1\56\1\57\1\60\1\61\1\62\1\34\1\35\1\36\1\37\1\40\1\41"+
            "\1\42",
            "\1\43\13\uffff\1\44\1\45\1\46\1\47\1\50\1\51\1\52\1\53\1\54"+
            "\1\55\1\56\1\57\1\60\1\61\1\62\1\34\1\35\1\36\1\37\1\40\1\41"+
            "\1\42",
            "\1\43\13\uffff\1\44\1\45\1\46\1\47\1\50\1\51\1\52\1\53\1\54"+
            "\1\55\1\56\1\57\1\60\1\61\1\62\1\34\1\35\1\36\1\37\1\40\1\41"+
            "\1\42",
            "\1\43\13\uffff\1\44\1\45\1\46\1\47\1\50\1\51\1\52\1\53\1\54"+
            "\1\55\1\56\1\57\1\60\1\61\1\62\1\34\1\35\1\36\1\37\1\40\1\41"+
            "\1\42\1\63\5\uffff\1\72\1\65\1\70\1\73\1\64\1\71\1\66\1\74\1"+
            "\67",
            "\1\43\13\uffff\1\44\1\45\1\46\1\47\1\50\1\51\1\52\1\53\1\54"+
            "\1\55\1\56\1\57\1\60\1\61\1\62\1\34\1\35\1\36\1\37\1\40\1\41"+
            "\1\42\1\75\5\uffff\1\76",
            "\1\43\13\uffff\1\44\1\45\1\46\1\47\1\50\1\51\1\52\1\53\1\54"+
            "\1\55\1\56\1\57\1\60\1\61\1\62\1\34\1\35\1\36\1\37\1\40\1\41"+
            "\1\42",
            "\1\43\13\uffff\1\44\1\45\1\46\1\47\1\50\1\51\1\52\1\53\1\54"+
            "\1\55\1\56\1\57\1\60\1\61\1\62\1\34\1\35\1\36\1\37\1\40\1\41"+
            "\1\42",
            "\1\43\13\uffff\1\44\1\45\1\46\1\47\1\50\1\51\1\52\1\53\1\54"+
            "\1\55\1\56\1\57\1\60\1\61\1\62\1\34\1\35\1\36\1\37\1\40\1\41"+
            "\1\42",
            "\1\3\17\uffff\2\77\32\uffff\2\3\66\uffff\3\3",
            "\1\3\17\uffff\2\77\32\uffff\2\3\66\uffff\3\3",
            "\1\3\17\uffff\2\77\32\uffff\2\3\66\uffff\3\3",
            "\1\3\17\uffff\2\77\32\uffff\2\3\66\uffff\3\3",
            "\1\3\17\uffff\2\77\32\uffff\2\3\66\uffff\3\3",
            "\1\3\17\uffff\2\77\32\uffff\2\3\66\uffff\3\3",
            "\1\3\17\uffff\2\77\32\uffff\2\3\66\uffff\3\3",
            "\1\3\17\uffff\2\77\32\uffff\2\3\66\uffff\3\3",
            "\1\3\17\uffff\2\77\32\uffff\2\3\66\uffff\3\3",
            "\1\3\17\uffff\2\77\32\uffff\2\3\66\uffff\3\3",
            "\1\3\17\uffff\2\77\32\uffff\2\3\66\uffff\3\3",
            "\1\3\17\uffff\2\77\32\uffff\2\3\66\uffff\3\3",
            "\1\3\17\uffff\2\77\32\uffff\2\3\66\uffff\3\3",
            "\1\3\17\uffff\2\77\32\uffff\2\3\66\uffff\3\3",
            "\1\3\17\uffff\2\77\32\uffff\2\3\66\uffff\3\3",
            "\1\3\17\uffff\2\77\32\uffff\2\3\66\uffff\3\3",
            "\1\3\17\uffff\2\77\32\uffff\2\3\66\uffff\3\3",
            "\1\3\17\uffff\2\77\32\uffff\2\3\66\uffff\3\3",
            "\1\3\17\uffff\2\77\32\uffff\2\3\66\uffff\3\3",
            "\1\3\17\uffff\2\77\32\uffff\2\3\66\uffff\3\3",
            "\1\3\17\uffff\2\77\32\uffff\2\3\66\uffff\3\3",
            "\1\3\17\uffff\2\77\32\uffff\2\3\66\uffff\3\3",
            "\1\3\17\uffff\2\77\32\uffff\2\3\66\uffff\3\3",
            "\1\72\1\65\1\70\1\73\1\64\1\71\1\66\1\74\1\67",
            "\1\43\13\uffff\1\44\1\45\1\46\1\47\1\50\1\51\1\52\1\53\1\54"+
            "\1\55\1\56\1\57\1\60\1\61\1\62\1\34\1\35\1\36\1\37\1\40\1\41"+
            "\1\42",
            "\1\43\13\uffff\1\44\1\45\1\46\1\47\1\50\1\51\1\52\1\53\1\54"+
            "\1\55\1\56\1\57\1\60\1\61\1\62\1\34\1\35\1\36\1\37\1\40\1\41"+
            "\1\42",
            "\1\43\13\uffff\1\44\1\45\1\46\1\47\1\50\1\51\1\52\1\53\1\54"+
            "\1\55\1\56\1\57\1\60\1\61\1\62\1\34\1\35\1\36\1\37\1\40\1\41"+
            "\1\42",
            "\1\43\13\uffff\1\44\1\45\1\46\1\47\1\50\1\51\1\52\1\53\1\54"+
            "\1\55\1\56\1\57\1\60\1\61\1\62\1\34\1\35\1\36\1\37\1\40\1\41"+
            "\1\42",
            "\1\43\13\uffff\1\44\1\45\1\46\1\47\1\50\1\51\1\52\1\53\1\54"+
            "\1\55\1\56\1\57\1\60\1\61\1\62\1\34\1\35\1\36\1\37\1\40\1\41"+
            "\1\42",
            "\1\43\13\uffff\1\44\1\45\1\46\1\47\1\50\1\51\1\52\1\53\1\54"+
            "\1\55\1\56\1\57\1\60\1\61\1\62\1\34\1\35\1\36\1\37\1\40\1\41"+
            "\1\42",
            "\1\43\13\uffff\1\44\1\45\1\46\1\47\1\50\1\51\1\52\1\53\1\54"+
            "\1\55\1\56\1\57\1\60\1\61\1\62\1\34\1\35\1\36\1\37\1\40\1\41"+
            "\1\42",
            "\1\43\13\uffff\1\44\1\45\1\46\1\47\1\50\1\51\1\52\1\53\1\54"+
            "\1\55\1\56\1\57\1\60\1\61\1\62\1\34\1\35\1\36\1\37\1\40\1\41"+
            "\1\42",
            "\1\43\13\uffff\1\44\1\45\1\46\1\47\1\50\1\51\1\52\1\53\1\54"+
            "\1\55\1\56\1\57\1\60\1\61\1\62\1\34\1\35\1\36\1\37\1\40\1\41"+
            "\1\42",
            "\1\76",
            "\1\43\13\uffff\1\44\1\45\1\46\1\47\1\50\1\51\1\52\1\53\1\54"+
            "\1\55\1\56\1\57\1\60\1\61\1\62\1\34\1\35\1\36\1\37\1\40\1\41"+
            "\1\42",
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
            return "46:1: relative_date : ( named_relative_date | modifiable_target -> ^( RELATIVE_DATE SEEK_DIRECTION[\">\"] SEEK_TYPE[\"by_day\"] INTEGER[\"1\"] modifiable_target ) | target_prefix modifiable_target -> ^( RELATIVE_DATE target_prefix modifiable_target ) | spelled_or_numeric_1_to_31 modifiable_target target_suffix -> ^( RELATIVE_DATE target_suffix spelled_or_numeric_1_to_31 modifiable_target ) );";
        }
    }
    static final String DFA14_eotS =
        "\16\uffff";
    static final String DFA14_eofS =
        "\10\uffff\1\11\5\uffff";
    static final String DFA14_minS =
        "\2\50\1\uffff\2\50\2\uffff\1\167\1\23\1\uffff\1\165\3\0";
    static final String DFA14_maxS =
        "\1\174\1\u0080\1\uffff\2\u0080\2\uffff\1\172\1\171\1\uffff\1\174"+
        "\3\0";
    static final String DFA14_acceptS =
        "\2\uffff\1\2\2\uffff\1\3\1\4\2\uffff\1\1\4\uffff";
    static final String DFA14_specialS =
        "\13\uffff\1\2\1\1\1\0}>";
    static final String[] DFA14_transitionS = {
            "\14\5\15\uffff\64\6\2\2\1\1\1\2\1\3\1\4\2\2",
            "\14\6\7\uffff\2\7\103\uffff\1\6",
            "",
            "\14\6\7\uffff\2\2\103\uffff\1\6",
            "\14\6\7\uffff\2\2\103\uffff\1\6",
            "",
            "",
            "\1\10\1\uffff\2\11",
            "\1\11\47\uffff\2\12\2\uffff\2\11\66\uffff\3\11",
            "",
            "\2\11\1\13\1\11\1\14\1\15\2\11",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff"
    };

    static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
    static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
    static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
    static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
    static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
    static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
    static final short[][] DFA14_transition;

    static {
        int numStates = DFA14_transitionS.length;
        DFA14_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
        }
    }

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = DFA14_eot;
            this.eof = DFA14_eof;
            this.min = DFA14_min;
            this.max = DFA14_max;
            this.accept = DFA14_accept;
            this.special = DFA14_special;
            this.transition = DFA14_transition;
        }
        public String getDescription() {
            return "69:1: explicit_date options {backtrack=true; } : ( integer_1_to_12 date_separator integer_1_to_31 ( date_separator four_digits )? -> ^( EXPLICIT_DATE integer_1_to_31 integer_1_to_31 ( four_digits )? ) | four_digits date_separator integer_1_to_12 date_separator integer_1_to_31 -> ^( EXPLICIT_DATE integer_1_to_12 integer_1_to_31 four_digits ) | month day_of_month ( ( ',' )? year )? -> ^( EXPLICIT_DATE month day_of_month ( year )? ) | day_of_month ( 'of' )? month ( ( ',' )? year )? -> ^( EXPLICIT_DATE month day_of_month ( year )? ) );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA14_13 = input.LA(1);

                         
                        int index14_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Date()) ) {s = 9;}

                        else if ( (synpred4_Date()) ) {s = 2;}

                         
                        input.seek(index14_13);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA14_12 = input.LA(1);

                         
                        int index14_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Date()) ) {s = 9;}

                        else if ( (synpred4_Date()) ) {s = 2;}

                         
                        input.seek(index14_12);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA14_11 = input.LA(1);

                         
                        int index14_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Date()) ) {s = 9;}

                        else if ( (synpred4_Date()) ) {s = 2;}

                         
                        input.seek(index14_11);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 14, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA15_eotS =
        "\37\uffff";
    static final String DFA15_eofS =
        "\1\6\1\7\4\36\31\uffff";
    static final String DFA15_minS =
        "\6\24\31\uffff";
    static final String DFA15_maxS =
        "\2\174\3\u0080\1\174\31\uffff";
    static final String DFA15_acceptS =
        "\6\uffff\1\2\30\1";
    static final String DFA15_specialS =
        "\37\uffff}>";
    static final String[] DFA15_transitionS = {
            "\6\6\2\uffff\7\6\2\uffff\26\6\2\uffff\2\6\2\uffff\66\6\1\2\1"+
            "\1\1\3\1\4\1\5\1\6",
            "\6\7\2\uffff\7\7\2\uffff\26\7\2\6\2\7\2\uffff\74\7",
            "\5\36\1\10\2\uffff\7\36\2\uffff\1\34\1\35\1\36\1\11\1\12\1"+
            "\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1"+
            "\27\1\30\1\31\1\32\1\33\2\6\1\7\1\36\2\uffff\74\36\3\uffff\1"+
            "\6",
            "\5\36\1\10\2\uffff\7\36\2\uffff\1\34\1\35\1\36\1\11\1\12\1"+
            "\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1"+
            "\27\1\30\1\31\1\32\1\33\2\6\1\7\1\36\2\uffff\74\36\3\uffff\1"+
            "\6",
            "\5\36\1\10\2\uffff\7\36\2\uffff\1\34\1\35\1\36\1\11\1\12\1"+
            "\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1"+
            "\27\1\30\1\31\1\32\1\33\2\6\1\7\1\36\2\uffff\74\36\3\uffff\1"+
            "\6",
            "\6\36\2\uffff\7\36\2\uffff\26\36\2\6\1\7\1\36\2\uffff\74\36",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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

    static final short[] DFA15_eot = DFA.unpackEncodedString(DFA15_eotS);
    static final short[] DFA15_eof = DFA.unpackEncodedString(DFA15_eofS);
    static final char[] DFA15_min = DFA.unpackEncodedStringToUnsignedChars(DFA15_minS);
    static final char[] DFA15_max = DFA.unpackEncodedStringToUnsignedChars(DFA15_maxS);
    static final short[] DFA15_accept = DFA.unpackEncodedString(DFA15_acceptS);
    static final short[] DFA15_special = DFA.unpackEncodedString(DFA15_specialS);
    static final short[][] DFA15_transition;

    static {
        int numStates = DFA15_transitionS.length;
        DFA15_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA15_transition[i] = DFA.unpackEncodedString(DFA15_transitionS[i]);
        }
    }

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = DFA15_eot;
            this.eof = DFA15_eof;
            this.min = DFA15_min;
            this.max = DFA15_max;
            this.accept = DFA15_accept;
            this.special = DFA15_special;
            this.transition = DFA15_transition;
        }
        public String getDescription() {
            return "87:16: ( minutes )?";
        }
    }
    static final String DFA23_eotS =
        "\55\uffff";
    static final String DFA23_eofS =
        "\55\uffff";
    static final String DFA23_minS =
        "\1\30\1\31\1\32\30\31\2\uffff\1\32\1\101\11\31\1\101\1\31\1\32\2"+
        "\uffff";
    static final String DFA23_maxS =
        "\1\172\1\31\1\33\23\31\1\111\1\101\3\31\2\uffff\1\u0082\1\111\11"+
        "\31\1\101\1\31\1\33\2\uffff";
    static final String DFA23_acceptS =
        "\33\uffff\1\1\1\3\16\uffff\1\2\1\4";
    static final String DFA23_specialS =
        "\55\uffff}>";
    static final String[] DFA23_transitionS = {
            "\1\1\1\2\47\uffff\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1"+
            "\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\41"+
            "\uffff\1\30\1\uffff\1\31\1\32",
            "\1\2",
            "\1\33\1\34",
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
            "\1\35\41\uffff\1\36\5\uffff\1\43\1\41\1\40\1\46\1\47\1\37\1"+
            "\44\1\45\1\42",
            "\1\35\41\uffff\1\50\5\uffff\1\51",
            "\1\35",
            "\1\35",
            "\1\35",
            "",
            "",
            "\1\53\1\54\146\uffff\1\52",
            "\1\43\1\41\1\40\1\46\1\47\1\37\1\44\1\45\1\42",
            "\1\35",
            "\1\35",
            "\1\35",
            "\1\35",
            "\1\35",
            "\1\35",
            "\1\35",
            "\1\35",
            "\1\35",
            "\1\51",
            "\1\35",
            "\1\53\1\54",
            "",
            ""
    };

    static final short[] DFA23_eot = DFA.unpackEncodedString(DFA23_eotS);
    static final short[] DFA23_eof = DFA.unpackEncodedString(DFA23_eofS);
    static final char[] DFA23_min = DFA.unpackEncodedStringToUnsignedChars(DFA23_minS);
    static final char[] DFA23_max = DFA.unpackEncodedStringToUnsignedChars(DFA23_maxS);
    static final short[] DFA23_accept = DFA.unpackEncodedString(DFA23_acceptS);
    static final short[] DFA23_special = DFA.unpackEncodedString(DFA23_specialS);
    static final short[][] DFA23_transition;

    static {
        int numStates = DFA23_transitionS.length;
        DFA23_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA23_transition[i] = DFA.unpackEncodedString(DFA23_transitionS[i]);
        }
    }

    class DFA23 extends DFA {

        public DFA23(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 23;
            this.eot = DFA23_eot;
            this.eof = DFA23_eof;
            this.min = DFA23_min;
            this.max = DFA23_max;
            this.accept = DFA23_accept;
            this.special = DFA23_special;
            this.transition = DFA23_transition;
        }
        public String getDescription() {
            return "94:1: date_prefix : ( ( THE )? DAY AFTER -> SEEK_DIRECTION[\">\"] INTEGER[\"1\"] | spelled_or_numeric_1_to_31 DAY ( 's' )? AFTER -> SEEK_DIRECTION[\">\"] spelled_or_numeric_1_to_31 | ( THE )? DAY BEFORE -> SEEK_DIRECTION[\"<\"] INTEGER[\"1\"] | spelled_or_numeric_1_to_31 DAY ( 's' )? BEFORE -> SEEK_DIRECTION[\"<\"] spelled_or_numeric_1_to_31 );";
        }
    }
    static final String DFA52_eotS =
        "\43\uffff";
    static final String DFA52_eofS =
        "\24\uffff\1\33\1\41\15\uffff";
    static final String DFA52_minS =
        "\1\101\23\uffff\2\23\1\101\14\uffff";
    static final String DFA52_maxS =
        "\1\125\23\uffff\2\u0083\1\111\14\uffff";
    static final String DFA52_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1"+
        "\15\1\16\1\17\1\20\1\21\1\22\1\23\3\uffff\1\33\1\30\1\25\1\32\1"+
        "\24\1\35\1\34\1\26\1\27\1\31\1\36\1\37";
    static final String DFA52_specialS =
        "\43\uffff}>";
    static final String[] DFA52_transitionS = {
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
            "\1\33\5\uffff\1\33\10\uffff\1\33\2\uffff\26\33\1\26\3\uffff"+
            "\2\33\1\31\1\36\1\37\1\30\1\40\1\32\1\27\1\35\1\34\53\uffff"+
            "\10\33\2\uffff\2\33\2\uffff\1\33",
            "\1\41\5\uffff\1\41\10\uffff\1\41\2\uffff\26\41\1\42\3\uffff"+
            "\2\41\1\42\63\uffff\10\41\2\uffff\2\41\2\uffff\1\41",
            "\1\31\1\36\1\37\1\30\1\40\1\32\1\27\1\35\1\34",
            "",
            "",
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

    static final short[] DFA52_eot = DFA.unpackEncodedString(DFA52_eotS);
    static final short[] DFA52_eof = DFA.unpackEncodedString(DFA52_eofS);
    static final char[] DFA52_min = DFA.unpackEncodedStringToUnsignedChars(DFA52_minS);
    static final char[] DFA52_max = DFA.unpackEncodedStringToUnsignedChars(DFA52_maxS);
    static final short[] DFA52_accept = DFA.unpackEncodedString(DFA52_acceptS);
    static final short[] DFA52_special = DFA.unpackEncodedString(DFA52_specialS);
    static final short[][] DFA52_transition;

    static {
        int numStates = DFA52_transitionS.length;
        DFA52_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA52_transition[i] = DFA.unpackEncodedString(DFA52_transitionS[i]);
        }
    }

    class DFA52 extends DFA {

        public DFA52(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 52;
            this.eot = DFA52_eot;
            this.eof = DFA52_eof;
            this.min = DFA52_min;
            this.max = DFA52_max;
            this.accept = DFA52_accept;
            this.special = DFA52_special;
            this.transition = DFA52_transition;
        }
        public String getDescription() {
            return "193:1: spelled_number_1_to_31 : ( ONE -> INTEGER[\"1\"] | TWO -> INTEGER[\"2\"] | THREE -> INTEGER[\"3\"] | FOUR -> INTEGER[\"4\"] | FIVE -> INTEGER[\"5\"] | SIX -> INTEGER[\"6\"] | SEVEN -> INTEGER[\"7\"] | EIGHT -> INTEGER[\"8\"] | NINE -> INTEGER[\"9\"] | TEN -> INTEGER[\"10\"] | ELEVEN -> INTEGER[\"11\"] | TWELVE -> INTEGER[\"12\"] | THIRTEEN -> INTEGER[\"13\"] | FOURTEEN -> INTEGER[\"14\"] | FIFTEEN -> INTEGER[\"15\"] | SIXTEEN -> INTEGER[\"16\"] | SEVENTEEN -> INTEGER[\"17\"] | EIGHTEEN -> INTEGER[\"18\"] | NINETEEN -> INTEGER[\"19\"] | TWENTY -> INTEGER[\"20\"] | TWENTY ( DASH )? ONE -> INTEGER[\"21\"] | TWENTY ( DASH )? TWO -> INTEGER[\"22\"] | TWENTY ( DASH )? THREE -> INTEGER[\"23\"] | TWENTY ( DASH )? FOUR -> INTEGER[\"24\"] | TWENTY ( DASH )? FIVE -> INTEGER[\"25\"] | TWENTY ( DASH )? SIX -> INTEGER[\"26\"] | TWENTY ( DASH )? SEVEN -> INTEGER[\"27\"] | TWENTY ( DASH )? EIGHT -> INTEGER[\"28\"] | TWENTY ( DASH )? NINE -> INTEGER[\"29\"] | THIRTY -> INTEGER[\"30\"] | THIRTY ( DASH )? ONE -> INTEGER[\"31\"] );";
        }
    }
    static final String DFA74_eotS =
        "\42\uffff";
    static final String DFA74_eofS =
        "\42\uffff";
    static final String DFA74_minS =
        "\1\124\25\uffff\1\73\12\uffff\1\126";
    static final String DFA74_maxS =
        "\1\164\25\uffff\1\136\12\uffff\1\136";
    static final String DFA74_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1"+
        "\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\uffff\1\26\1\27\1"+
        "\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\uffff";
    static final String DFA74_specialS =
        "\42\uffff}>";
    static final String[] DFA74_transitionS = {
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
            return "234:1: spelled_sequence_1_to_31 : ( FIRST -> INTEGER[\"1\"] | SECOND -> INTEGER[\"2\"] | THIRD -> INTEGER[\"3\"] | FOURTH -> INTEGER[\"4\"] | FIFTH -> INTEGER[\"5\"] | SIXTH -> INTEGER[\"6\"] | SEVENTH -> INTEGER[\"7\"] | EIGHTH -> INTEGER[\"8\"] | NINTH -> INTEGER[\"9\"] | TENTH -> INTEGER[\"10\"] | ELEVENTH -> INTEGER[\"11\"] | TWELFTH -> INTEGER[\"12\"] | THIRTEENTH -> INTEGER[\"13\"] | FOURTEENTH -> INTEGER[\"14\"] | FIFTEENTH -> INTEGER[\"15\"] | SIXTEENTH -> INTEGER[\"16\"] | SEVENTEENTH -> INTEGER[\"17\"] | EIGHTEENTH -> INTEGER[\"18\"] | NINETEENTH -> INTEGER[\"19\"] | TWENTIETH -> INTEGER[\"20\"] | ( TWENTY_FIRST | ( TWENTY ( DASH )? FIRST ) ) -> INTEGER[\"21\"] | ( TWENTY_SECOND | ( TWENTY ( DASH )? SECOND ) ) -> INTEGER[\"22\"] | ( TWENTY_THIRD | ( TWENTY ( DASH )? THIRD ) ) -> INTEGER[\"23\"] | ( TWENTY_FOURTH | ( TWENTY ( DASH )? FOURTH ) ) -> INTEGER[\"24\"] | ( TWENTY_FIFTH | ( TWENTY ( DASH )? FIFTH ) ) -> INTEGER[\"25\"] | ( TWENTY_SIXTH | ( TWENTY ( DASH )? SIXTH ) ) -> INTEGER[\"26\"] | ( TWENTY_SEVENTH | ( TWENTY ( DASH )? SEVENTH ) ) -> INTEGER[\"27\"] | ( TWENTY_EIGHTH | ( TWENTY ( DASH )? EIGHTH ) ) -> INTEGER[\"28\"] | ( TWENTY_NINTH | ( TWENTY ( DASH )? NINTH ) ) -> INTEGER[\"29\"] | THIRTIETH -> INTEGER[\"30\"] | ( THIRTY_FIRST | ( THIRTY ( DASH )? FIRST ) ) -> INTEGER[\"31\"] );";
        }
    }
 

    public static final BitSet FOLLOW_date_in_datetime128 = new BitSet(new long[]{0x8000000000080002L,0x0380000000000001L});
    public static final BitSet FOLLOW_AT_in_datetime130 = new BitSet(new long[]{0x8000000000000002L,0x0380000000000001L});
    public static final BitSet FOLLOW_time_in_datetime133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_time_in_datetime151 = new BitSet(new long[]{0x07FFFFE7F3F00000L,0x1FFFFFFFFFFFFFFEL});
    public static final BitSet FOLLOW_ON_in_datetime153 = new BitSet(new long[]{0x07FFFFE7F3F00000L,0x1FFFFFFFFFFFFFFEL});
    public static final BitSet FOLLOW_date_in_datetime156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_time_in_datetime172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_date_prefix_in_date205 = new BitSet(new long[]{0x07FFFFE7F2E00000L,0x06800000003FFFFEL});
    public static final BitSet FOLLOW_relative_date_in_date207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_date_prefix_in_date223 = new BitSet(new long[]{0x07FFFFE7F3F00000L,0x1FFFFFFFFFFFFFFEL});
    public static final BitSet FOLLOW_explicit_date_in_date225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relative_date_in_date241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_explicit_date_in_date247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_explicit_time_in_time263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_named_relative_date_in_relative_date276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_modifiable_target_in_relative_date288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_target_prefix_in_relative_date322 = new BitSet(new long[]{0x07FFFFE002000000L});
    public static final BitSet FOLLOW_modifiable_target_in_relative_date324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spelled_or_numeric_1_to_31_in_relative_date353 = new BitSet(new long[]{0x07FFFFE002000000L});
    public static final BitSet FOLLOW_modifiable_target_in_relative_date355 = new BitSet(new long[]{0x0000001800000000L});
    public static final BitSet FOLLOW_target_suffix_in_relative_date357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TODAY_in_named_relative_date389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOMORROW_in_named_relative_date411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_YESTERDAY_in_named_relative_date430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integer_1_to_12_in_explicit_date465 = new BitSet(new long[]{0x1800000000000000L});
    public static final BitSet FOLLOW_date_separator_in_explicit_date467 = new BitSet(new long[]{0x0000000000000000L,0x06800000003FFFFEL});
    public static final BitSet FOLLOW_integer_1_to_31_in_explicit_date469 = new BitSet(new long[]{0x1800000000000002L});
    public static final BitSet FOLLOW_date_separator_in_explicit_date472 = new BitSet(new long[]{0x0000000000000000L,0x1FE0000000000000L});
    public static final BitSet FOLLOW_four_digits_in_explicit_date474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_four_digits_in_explicit_date504 = new BitSet(new long[]{0x1800000000000000L});
    public static final BitSet FOLLOW_date_separator_in_explicit_date506 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_integer_1_to_12_in_explicit_date508 = new BitSet(new long[]{0x1800000000000000L});
    public static final BitSet FOLLOW_date_separator_in_explicit_date510 = new BitSet(new long[]{0x0000000000000000L,0x06800000003FFFFEL});
    public static final BitSet FOLLOW_integer_1_to_31_in_explicit_date512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_month_in_explicit_date539 = new BitSet(new long[]{0x07FFFFE7F3F00000L,0x1FFFFFFFFFFFFFFEL});
    public static final BitSet FOLLOW_day_of_month_in_explicit_date541 = new BitSet(new long[]{0x0000000400000002L,0x9FE0000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_127_in_explicit_date544 = new BitSet(new long[]{0x0000000400000000L,0x9FE0000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_year_in_explicit_date547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_day_of_month_in_explicit_date577 = new BitSet(new long[]{0x07FFFFE002000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_128_in_explicit_date579 = new BitSet(new long[]{0x07FFFFE002000000L});
    public static final BitSet FOLLOW_month_in_explicit_date582 = new BitSet(new long[]{0x0000000400000002L,0x9FE0000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_127_in_explicit_date585 = new BitSet(new long[]{0x0000000400000000L,0x9FE0000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_year_in_explicit_date588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_hours_in_explicit_time629 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_129_in_explicit_time632 = new BitSet(new long[]{0x6000000000000002L,0x0F80000000000000L});
    public static final BitSet FOLLOW_minutes_in_explicit_time634 = new BitSet(new long[]{0x6000000000000002L});
    public static final BitSet FOLLOW_meridian_indicator_in_explicit_time637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_time_identifier_in_explicit_time667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THE_in_date_prefix683 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_DAY_in_date_prefix686 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_AFTER_in_date_prefix688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spelled_or_numeric_1_to_31_in_date_prefix730 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_DAY_in_date_prefix732 = new BitSet(new long[]{0x0000000004000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_130_in_date_prefix734 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_AFTER_in_date_prefix737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THE_in_date_prefix751 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_DAY_in_date_prefix754 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_BEFORE_in_date_prefix756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spelled_or_numeric_1_to_31_in_date_prefix797 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_DAY_in_date_prefix799 = new BitSet(new long[]{0x0000000008000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_130_in_date_prefix801 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_BEFORE_in_date_prefix804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIS_in_target_prefix827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIS_in_target_prefix854 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_LAST_in_target_prefix857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIS_in_target_prefix878 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_PAST_in_target_prefix881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIS_in_target_prefix902 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_NEXT_in_target_prefix905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIS_in_target_prefix926 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_COMING_in_target_prefix929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIS_in_target_prefix948 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_UPCOMING_in_target_prefix951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IN_in_target_prefix968 = new BitSet(new long[]{0x0000000000000000L,0x06800000003FFFFEL});
    public static final BitSet FOLLOW_spelled_or_numeric_1_to_31_in_target_prefix971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FROM_NOW_in_target_suffix997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AGO_in_target_suffix1011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_day_of_week_in_modifiable_target1040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_date_span_in_modifiable_target1047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_month_in_modifiable_target1053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DAY_in_date_span1068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WEEK_in_date_span1081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MONTH_in_date_span1093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_YEAR_in_date_span1104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_JANUARY_in_month1125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FEBRUARY_in_month1142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MARCH_in_month1158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_APRIL_in_month1177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MAY_in_month1196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_JUNE_in_month1217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_JULY_in_month1237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AUGUST_in_month1257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEPTEMBER_in_month1275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OCTOBER_in_month1290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOVEMBER_in_month1307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DECEMBER_in_month1323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spelled_or_numeric_1_to_31_in_day_of_month1348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spelled_sequence_1_to_31_in_day_of_month1362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SUNDAY_in_day_of_week1388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MONDAY_in_day_of_week1406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TUESDAY_in_day_of_week1424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WEDNESDAY_in_day_of_week1441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THURSDAY_in_day_of_week1456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FRIDAY_in_day_of_week1472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SATURDAY_in_day_of_week1490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_131_in_year1524 = new BitSet(new long[]{0x0000000000000000L,0x1F80000000000000L});
    public static final BitSet FOLLOW_integer_0_to_99_in_year1527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IN_in_year1548 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_THE_in_year1550 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_YEAR_in_year1552 = new BitSet(new long[]{0x0000000000000000L,0x1FE0000000000000L});
    public static final BitSet FOLLOW_four_digits_in_year1556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_date_separator0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integer_0_to_23_in_hours1599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integer_0_to_59_in_minutes1622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AM_in_meridian_indicator1645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PM_in_meridian_indicator1656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MIDNIGHT_in_time_identifier1677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOON_in_time_identifier1699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ONE_in_spelled_number_1_to_311735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWO_in_spelled_number_1_to_311753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THREE_in_spelled_number_1_to_311771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOUR_in_spelled_number_1_to_311787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FIVE_in_spelled_number_1_to_311804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SIX_in_spelled_number_1_to_311821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEVEN_in_spelled_number_1_to_311839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EIGHT_in_spelled_number_1_to_311855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NINE_in_spelled_number_1_to_311871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEN_in_spelled_number_1_to_311888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELEVEN_in_spelled_number_1_to_311906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWELVE_in_spelled_number_1_to_311921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIRTEEN_in_spelled_number_1_to_311936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOURTEEN_in_spelled_number_1_to_311949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FIFTEEN_in_spelled_number_1_to_311962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SIXTEEN_in_spelled_number_1_to_311976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEVENTEEN_in_spelled_number_1_to_311990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EIGHTEEN_in_spelled_number_1_to_312002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NINETEEN_in_spelled_number_1_to_312015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_number_1_to_312028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_number_1_to_312043 = new BitSet(new long[]{0x0800000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_DASH_in_spelled_number_1_to_312045 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_ONE_in_spelled_number_1_to_312048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_number_1_to_312061 = new BitSet(new long[]{0x0800000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_DASH_in_spelled_number_1_to_312063 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_TWO_in_spelled_number_1_to_312066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_number_1_to_312079 = new BitSet(new long[]{0x0800000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_DASH_in_spelled_number_1_to_312081 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_THREE_in_spelled_number_1_to_312084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_number_1_to_312095 = new BitSet(new long[]{0x0800000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_DASH_in_spelled_number_1_to_312097 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_FOUR_in_spelled_number_1_to_312100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_number_1_to_312112 = new BitSet(new long[]{0x0800000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_DASH_in_spelled_number_1_to_312114 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_FIVE_in_spelled_number_1_to_312117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_number_1_to_312129 = new BitSet(new long[]{0x0800000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_DASH_in_spelled_number_1_to_312131 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_SIX_in_spelled_number_1_to_312134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_number_1_to_312147 = new BitSet(new long[]{0x0800000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_DASH_in_spelled_number_1_to_312149 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_SEVEN_in_spelled_number_1_to_312152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_number_1_to_312163 = new BitSet(new long[]{0x0800000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_DASH_in_spelled_number_1_to_312165 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_EIGHT_in_spelled_number_1_to_312168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_number_1_to_312179 = new BitSet(new long[]{0x0800000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_DASH_in_spelled_number_1_to_312181 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_NINE_in_spelled_number_1_to_312184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIRTY_in_spelled_number_1_to_312196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIRTY_in_spelled_number_1_to_312219 = new BitSet(new long[]{0x0800000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_DASH_in_spelled_number_1_to_312221 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_ONE_in_spelled_number_1_to_312224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spelled_number_1_to_31_in_spelled_or_numeric_1_to_312246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integer_1_to_31_in_spelled_or_numeric_1_to_312252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FIRST_in_spelled_sequence_1_to_312269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SECOND_in_spelled_sequence_1_to_312286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIRD_in_spelled_sequence_1_to_312302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOURTH_in_spelled_sequence_1_to_312319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FIFTH_in_spelled_sequence_1_to_312335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SIXTH_in_spelled_sequence_1_to_312352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEVENTH_in_spelled_sequence_1_to_312369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EIGHTH_in_spelled_sequence_1_to_312384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NINTH_in_spelled_sequence_1_to_312400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TENTH_in_spelled_sequence_1_to_312417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELEVENTH_in_spelled_sequence_1_to_312434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWELFTH_in_spelled_sequence_1_to_312448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIRTEENTH_in_spelled_sequence_1_to_312463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOURTEENTH_in_spelled_sequence_1_to_312475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FIFTEENTH_in_spelled_sequence_1_to_312487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SIXTEENTH_in_spelled_sequence_1_to_312500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEVENTEENTH_in_spelled_sequence_1_to_312513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EIGHTEENTH_in_spelled_sequence_1_to_312524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NINETEENTH_in_spelled_sequence_1_to_312536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTIETH_in_spelled_sequence_1_to_312548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_FIRST_in_spelled_sequence_1_to_312562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_sequence_1_to_312569 = new BitSet(new long[]{0x0800000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_DASH_in_spelled_sequence_1_to_312571 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_FIRST_in_spelled_sequence_1_to_312574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_SECOND_in_spelled_sequence_1_to_312590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_sequence_1_to_312596 = new BitSet(new long[]{0x0800000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_DASH_in_spelled_sequence_1_to_312598 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_SECOND_in_spelled_sequence_1_to_312601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_THIRD_in_spelled_sequence_1_to_312616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_sequence_1_to_312623 = new BitSet(new long[]{0x0800000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_DASH_in_spelled_sequence_1_to_312625 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_THIRD_in_spelled_sequence_1_to_312628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_FOURTH_in_spelled_sequence_1_to_312644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_sequence_1_to_312650 = new BitSet(new long[]{0x0800000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_DASH_in_spelled_sequence_1_to_312652 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_FOURTH_in_spelled_sequence_1_to_312655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_FIFTH_in_spelled_sequence_1_to_312670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_sequence_1_to_312677 = new BitSet(new long[]{0x0800000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_DASH_in_spelled_sequence_1_to_312679 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_FIFTH_in_spelled_sequence_1_to_312682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_SIXTH_in_spelled_sequence_1_to_312698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_sequence_1_to_312705 = new BitSet(new long[]{0x0800000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_DASH_in_spelled_sequence_1_to_312707 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_SIXTH_in_spelled_sequence_1_to_312710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_SEVENTH_in_spelled_sequence_1_to_312726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_sequence_1_to_312731 = new BitSet(new long[]{0x0800000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_DASH_in_spelled_sequence_1_to_312733 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_SEVENTH_in_spelled_sequence_1_to_312736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_EIGHTH_in_spelled_sequence_1_to_312750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_sequence_1_to_312756 = new BitSet(new long[]{0x0800000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_DASH_in_spelled_sequence_1_to_312758 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_EIGHTH_in_spelled_sequence_1_to_312761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_NINTH_in_spelled_sequence_1_to_312776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_in_spelled_sequence_1_to_312783 = new BitSet(new long[]{0x0800000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_DASH_in_spelled_sequence_1_to_312785 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_NINTH_in_spelled_sequence_1_to_312788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIRTIETH_in_spelled_sequence_1_to_312803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIRTY_FIRST_in_spelled_sequence_1_to_312847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIRTY_in_spelled_sequence_1_to_312854 = new BitSet(new long[]{0x0800000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_DASH_in_spelled_sequence_1_to_312856 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_FIRST_in_spelled_sequence_1_to_312859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integer_0_to_99_in_four_digits2884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THREE_DIGIT_in_four_digits2890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOUR_DIGIT_in_four_digits2901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ONE_TO_TWELVE_in_integer_1_to_122922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UP_TO_TWO_ZEROS_in_integer_0_to_232943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ONE_TO_TWELVE_in_integer_0_to_232963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIRTEEN_TO_TWENTY_THREE_in_integer_0_to_232985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UP_TO_TWO_ZEROS_in_integer_0_to_593006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ONE_TO_TWELVE_in_integer_0_to_593027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIRTEEN_TO_TWENTY_THREE_in_integer_0_to_593050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_FOUR_TO_THIRTY_ONE_in_integer_0_to_593062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIRTY_TWO_TO_FIFTY_NINE_in_integer_0_to_593073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UP_TO_TWO_ZEROS_in_integer_0_to_993095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ONE_TO_TWELVE_in_integer_0_to_993116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIRTEEN_TO_TWENTY_THREE_in_integer_0_to_993139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_FOUR_TO_THIRTY_ONE_in_integer_0_to_993151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIRTY_TWO_TO_FIFTY_NINE_in_integer_0_to_993162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SIXTY_TO_NINETY_NINE_in_integer_0_to_993174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ONE_TO_TWELVE_in_integer_1_to_313200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIRTEEN_TO_TWENTY_THREE_in_integer_1_to_313223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWENTY_FOUR_TO_THIRTY_ONE_in_integer_1_to_313235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_date_in_synpred1_Date128 = new BitSet(new long[]{0x8000000000080002L,0x0380000000000001L});
    public static final BitSet FOLLOW_AT_in_synpred1_Date130 = new BitSet(new long[]{0x8000000000000002L,0x0380000000000001L});
    public static final BitSet FOLLOW_time_in_synpred1_Date133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_time_in_synpred2_Date151 = new BitSet(new long[]{0x07FFFFE7F3F00000L,0x1FFFFFFFFFFFFFFEL});
    public static final BitSet FOLLOW_ON_in_synpred2_Date153 = new BitSet(new long[]{0x07FFFFE7F3F00000L,0x1FFFFFFFFFFFFFFEL});
    public static final BitSet FOLLOW_date_in_synpred2_Date156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integer_1_to_12_in_synpred3_Date465 = new BitSet(new long[]{0x1800000000000000L});
    public static final BitSet FOLLOW_date_separator_in_synpred3_Date467 = new BitSet(new long[]{0x0000000000000000L,0x06800000003FFFFEL});
    public static final BitSet FOLLOW_integer_1_to_31_in_synpred3_Date469 = new BitSet(new long[]{0x1800000000000002L});
    public static final BitSet FOLLOW_date_separator_in_synpred3_Date472 = new BitSet(new long[]{0x0000000000000000L,0x1FE0000000000000L});
    public static final BitSet FOLLOW_four_digits_in_synpred3_Date474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_four_digits_in_synpred4_Date504 = new BitSet(new long[]{0x1800000000000000L});
    public static final BitSet FOLLOW_date_separator_in_synpred4_Date506 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_integer_1_to_12_in_synpred4_Date508 = new BitSet(new long[]{0x1800000000000000L});
    public static final BitSet FOLLOW_date_separator_in_synpred4_Date510 = new BitSet(new long[]{0x0000000000000000L,0x06800000003FFFFEL});
    public static final BitSet FOLLOW_integer_1_to_31_in_synpred4_Date512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_131_in_synpred6_Date1524 = new BitSet(new long[]{0x0000000000000000L,0x1F80000000000000L});
    public static final BitSet FOLLOW_integer_0_to_99_in_synpred6_Date1527 = new BitSet(new long[]{0x0000000000000002L});

}